/*******************************************************************************
 * Copyright (c) 1998, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package java.lang;

import java.io.Serializable;

import java.util.Locale;
import java.util.Comparator;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Formatter;
import java.util.StringJoiner;
import java.util.Iterator;
import java.nio.charset.Charset;
import java.util.Spliterator;
import java.util.stream.StreamSupport;

import jdk.internal.misc.Unsafe;
import java.util.stream.IntStream;

import java.util.stream.Stream;

/**
 * Strings are objects which represent immutable arrays of characters.
 *
 * @author OTI
 * @version initial
 *
 * @see StringBuffer
 */
public final class String implements Serializable, Comparable<String>, CharSequence
{

	/*
	 * Last character of String substitute in String.replaceAll(regex, substitute) can't be \ or $.
	 * The backslash (\) is used to escape literal characters, and the dollar sign ($) is treated as
	 * references to captured subsequences.
	 */
	private void checkLastChar(char lastChar) {
		if (lastChar == '\\') {
			// K0801 = Last character in replacement string can't be \, character to be escaped is required.
			throw new IllegalArgumentException(com.ibm.oti.util.Msg.getString("K0801")); //$NON-NLS-1$
		} else if (lastChar == '$') {
			// K0802 = Last character in replacement string can't be $, group index is required.
			throw new IllegalArgumentException(com.ibm.oti.util.Msg.getString("K0802")); //$NON-NLS-1$
		}
	}

	// DO NOT CHANGE OR MOVE THIS LINE
	// IT MUST BE THE FIRST THING IN THE INITIALIZATION
	private static final long serialVersionUID = -6849794470754667710L;

	/**
	 * Determines whether String compression is enabled.
	 */
	static final boolean enableCompression = com.ibm.oti.vm.VM.J9_STRING_COMPRESSION_ENABLED;

	static final byte LATIN1 = 0;
	static final byte UTF16 = 1;
	static final boolean COMPACT_STRINGS;
	static {
		COMPACT_STRINGS = enableCompression;
	}

	// returns UTF16 when COMPACT_STRINGS is false
	byte coder() {
		if (enableCompression) {
			return coder;
		} else {
			return UTF16;
		}
	}

	
	// no range checking, caller ensures bytes is in UTF16
	// coder is one of LATIN1 or UTF16
	void getBytes(byte[] bytes, int offset, byte coder) {
		int currentLength = lengthInternal();

		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || this.coder == LATIN1)) {
			if (String.LATIN1 == coder) {
				compressedArrayCopy(value, 0, bytes, offset, currentLength);
			} else {
				decompress(value, 0, bytes, offset, currentLength);
			}
		} else {
			decompressedArrayCopy(value, 0, bytes, offset, currentLength);
		}
	}

	static void checkIndex(int index, int length) {
		if ((0 <= index) && (index < length)) {
			return;
		}
		throw new StringIndexOutOfBoundsException("index="+index + " length="+length); //$NON-NLS-1$ //$NON-NLS-2$
	}

	static void checkOffset(int offset, int length) {
		if ((0 <= offset) && (offset <= length)) {
			return;
		}
		throw new StringIndexOutOfBoundsException("offset="+offset + " length="+length); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * CaseInsensitiveComparator compares Strings ignoring the case of the characters.
	 */
	private static final class CaseInsensitiveComparator implements Comparator<String>, Serializable {
		static final long serialVersionUID = 8575799808933029326L;

		/**
		 * Compare the two objects to determine the relative ordering.
		 *
		 * @param o1
		 *          an Object to compare
		 * @param o2
		 *          an Object to compare
		 * @return {@code < 0} if o1 is less than o2, {@code 0} if they are equal, and {@code > 0} if o1 is greater
		 *
		 * @exception ClassCastException
		 *          when objects are not the correct type
		 */
		public int compare(String o1, String o2) {
			return o1.compareToIgnoreCase(o2);
		}
	};

	/**
	 * A Comparator which compares Strings ignoring the case of the characters.
	 */
	public static final Comparator<String> CASE_INSENSITIVE_ORDER = new CaseInsensitiveComparator();

	// Used to represent the value of an empty String
	private static final byte[] emptyValue = new byte[0];

	// Used to extract the value of a single ASCII character String by the integral value of the respective character as
	// an index into this table
	private static final byte[][] compressedAsciiTable;

	private static final byte[][] decompressedAsciiTable;

	// Used to access compression related helper methods
	private static final com.ibm.jit.JITHelpers helpers = com.ibm.jit.JITHelpers.getHelpers();

	static class StringCompressionFlag implements Serializable {
		private static final long serialVersionUID = 1346155847239551492L;
	}

	// Singleton used by all String instances to indicate a non-compressed string has been
	// allocated. JIT attempts to fold away the null check involving this static if the
	// StringCompressionFlag class has not been initialized and patches the code to bring back
	// the null check if a non-compressed String is constructed.
	private static StringCompressionFlag compressionFlag;

	// Represents the bit in count field to test for whether this String backing array is not compressed
	// under String compression mode. This bit is not used when String compression is disabled.
	private static final int uncompressedBit = 0x80000000;

	private static String[] stringArray;
	private static final int stringArraySize = 10;

	private static class UnsafeHelpers {
		public final static long valueFieldOffset = getValueFieldOffset();

		static long getValueFieldOffset() {
			try {
				return Unsafe.getUnsafe().objectFieldOffset(String.class.getDeclaredField("value")); //$NON-NLS-1$
			} catch (NoSuchFieldException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * This is a System property to enable sharing of the underlying value array in {@link #String.substring(int)} and
	 * {@link #String.substring(int, int)} if the offset is zero.
	 */
	static boolean enableSharingInSubstringWhenOffsetIsZero;

	private final byte[] value;
	private final byte coder;
	private int hashCode;

	static {
		stringArray = new String[stringArraySize];

		compressedAsciiTable = new byte[256][];

		for (int i = 0; i < compressedAsciiTable.length; ++i) {
			byte[] asciiValue = new byte[1];

			helpers.putByteInArrayByIndex(asciiValue, 0, (byte) i);

			compressedAsciiTable[i] = asciiValue;
		}

		decompressedAsciiTable = new byte[256][];

		for (int i = 0; i < decompressedAsciiTable.length; ++i) {
			byte[] asciiValue = new byte[2];

			helpers.putCharInArrayByIndex(asciiValue, 0, (char) i);

			decompressedAsciiTable[i] = asciiValue;
		}
	}

	static void initCompressionFlag() {
		if (compressionFlag == null) {
			compressionFlag = new StringCompressionFlag();
		}
	}

	/**
	 * Determines whether the input character array can be encoded as a compact
	 * Latin1 string.
	 *
	 * <p>This API implicitly assumes the following:
	 * <blockquote><pre>
	 *     - {@code length >= 0}
	 *     - {@code start >= 0}
	 *     - {@code start + length <= data.length}
	 * <blockquote><pre>
	 *
	 * @param c      the array of characters to check
	 * @param start  the starting offset in the character array
	 * @param length the number of characters to check starting at {@code start}
	 * @return       {@code true} if the input character array can be encoded
	 *               using the Latin1 encoding; {@code false} otherwise
	 */
	static boolean canEncodeAsLatin1(char[] c, int start, int length) {
		for (int i = start; i < start + length; ++i) {
			if (c[i] > 255) {
				return false;
			}
		}

		return true;
	}

	static void compress(byte[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, (byte) helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void compress(char[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, (byte) helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void compress(byte[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, (byte) helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void compress(char[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, (byte) helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void decompress(byte[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(array1, start1 + i)));
		}
	}

	static void decompress(char[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(array1, start1 + i)));
		}
	}

	static void decompress(byte[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(array1, start1 + i)));
		}
	}

	static void decompress(char[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(array1, start1 + i)));
		}
	}

	static void compressedArrayCopy(byte[] array1, int start1, byte[] array2, int start2, int length) {
		if (array1 == array2 && start1 < start2) {
			for (int i = length - 1; i >= 0; --i) {
				helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
			}
		} else {
			for (int i = 0; i < length; ++i) {
				helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
			}
		}
	}

	static void compressedArrayCopy(byte[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
		}
	}

	static void compressedArrayCopy(char[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
		}
	}

	static void compressedArrayCopy(char[] array1, int start1, char[] array2, int start2, int length) {
		if (array1 == array2 && start1 < start2) {
			for (int i = length - 1; i >= 0; --i) {
				helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
			}
		} else {
			for (int i = 0; i < length; ++i) {
				helpers.putByteInArrayByIndex(array2, start2 + i, helpers.getByteFromArrayByIndex(array1, start1 + i));
			}
		}
	}

	static void decompressedArrayCopy(byte[] array1, int start1, byte[] array2, int start2, int length) {
		if (array1 == array2 && start1 < start2) {
			for (int i = length - 1; i >= 0; --i) {
				helpers.putCharInArrayByIndex(array2, start2 + i, helpers.getCharFromArrayByIndex(array1, start1 + i));
			}
		} else {
			for (int i = 0; i < length; ++i) {
				helpers.putCharInArrayByIndex(array2, start2 + i, helpers.getCharFromArrayByIndex(array1, start1 + i));
			}
		}
	}

	static void decompressedArrayCopy(byte[] array1, int start1, char[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void decompressedArrayCopy(char[] array1, int start1, byte[] array2, int start2, int length) {
		for (int i = 0; i < length; ++i) {
			helpers.putCharInArrayByIndex(array2, start2 + i, helpers.getCharFromArrayByIndex(array1, start1 + i));
		}
	}

	static void decompressedArrayCopy(char[] array1, int start1, char[] array2, int start2, int length) {
		System.arraycopy(array1, start1, array2, start2, length);
	}

	boolean isCompressed() {
		// Check if the String is compressed
		if (enableCompression) {
			if (null == compressionFlag) {
				return true;
			} else {
				return coder == String.LATIN1;
			}
		} else {
			return false;
		}
	}

	String(byte[] byteArray, byte coder) {
		if (enableCompression) {
			if (String.LATIN1 == coder) {
				value = byteArray;
			} else {
				value = byteArray;

				initCompressionFlag();
			}
		} else {
			value = byteArray;
		}
		this.coder = coder;
	}

	static void checkBoundsOffCount(int offset, int count, int length) {
		if (offset >= 0 && count >= 0 && offset <= length - count) {
			return;
		}

		throw newStringIndexOutOfBoundsException(offset, count, length);
	}

	static private StringIndexOutOfBoundsException newStringIndexOutOfBoundsException(int offset, int count, int length) {
		return new StringIndexOutOfBoundsException("offset = " + offset + " count = " + count + " length = " + length); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * Answers an empty string.
	 */
	public String() {
		value = emptyValue;

		if (enableCompression) {
			coder = LATIN1;
		} else {
			coder = UTF16;
		}
	}

	/**
	 * Converts the byte array to a String using the default encoding as specified by the file.encoding system property. If the system property is not
	 * defined, the default encoding is ISO8859_1 (ISO-Latin-1). If 8859-1 is not available, an ASCII encoding is used.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 *
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @see #getBytes()
	 * @see #getBytes(int, int, byte[], int)
	 * @see #getBytes(String)
	 * @see #valueOf(boolean)
	 * @see #valueOf(char)
	 * @see #valueOf(char[])
	 * @see #valueOf(char[], int, int)
	 * @see #valueOf(double)
	 * @see #valueOf(float)
	 * @see #valueOf(int)
	 * @see #valueOf(long)
	 * @see #valueOf(Object)
	 *
	 */
	public String(byte[] data) {
		this(data, 0, data.length);
	}

	/**
	 * Converts the byte array to a String, setting the high byte of every character to the specified value.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param high
	 *          the high byte to use
	 *
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @deprecated Use String(byte[]) or String(byte[], String) instead
	 */
	@Deprecated(forRemoval=false, since="1.1")
	public String(byte[] data, int high) {
		this(data, high, 0, data.length);
	}

	/**
	 * Converts the byte array to a String using the default encoding as specified by the file.encoding system property. If the system property is not
	 * defined, the default encoding is ISO8859_1 (ISO-Latin-1). If 8859-1 is not available, an ASCII encoding is used.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param start
	 *          the starting offset in the byte array
	 * @param length
	 *          the number of bytes to convert
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @see #getBytes()
	 * @see #getBytes(int, int, byte[], int)
	 * @see #getBytes(String)
	 * @see #valueOf(boolean)
	 * @see #valueOf(char)
	 * @see #valueOf(char[])
	 * @see #valueOf(char[], int, int)
	 * @see #valueOf(double)
	 * @see #valueOf(float)
	 * @see #valueOf(int)
	 * @see #valueOf(long)
	 * @see #valueOf(Object)
	 *
	 */
	public String(byte[] data, int start, int length) {
		data.getClass(); // Implicit null check

		if (start >= 0 && 0 <= length && length <= data.length - start) {
			StringCoding.Result scResult = StringCoding.decode(data, start, length);

			value = scResult.value;
			coder = scResult.coder;

			if (enableCompression && scResult.coder == UTF16) {
				initCompressionFlag();
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Converts the byte array to a String, setting the high byte of every character to the specified value.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param high
	 *          the high byte to use
	 * @param start
	 *          the starting offset in the byte array
	 * @param length
	 *          the number of bytes to convert
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @deprecated Use String(byte[], int, int) instead
	 */
	@Deprecated(forRemoval=false, since="1.1")
	public String(byte[] data, int high, int start, int length) {
		data.getClass(); // Implicit null check

		if (start >= 0 && 0 <= length && length <= data.length - start) {
			if (enableCompression && high == 0) {
				value = new byte[length];
				coder = LATIN1;

				compressedArrayCopy(data, start, value, 0, length);
			} else {
				value = StringUTF16.newBytesFor(length);
				coder = UTF16;

				high <<= 8;

				for (int i = 0; i < length; ++i) {
					helpers.putCharInArrayByIndex(value, i, (char) (high + (data[start++] & 0xff)));
				}

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Converts the byte array to a String using the specified encoding.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param start
	 *          the starting offset in the byte array
	 * @param length
	 *          the number of bytes to convert
	 * @param encoding
	 *          the encoding
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws UnsupportedEncodingException
	 *          when encoding is not supported
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @see #getBytes()
	 * @see #getBytes(int, int, byte[], int)
	 * @see #getBytes(String)
	 * @see #valueOf(boolean)
	 * @see #valueOf(char)
	 * @see #valueOf(char[])
	 * @see #valueOf(char[], int, int)
	 * @see #valueOf(double)
	 * @see #valueOf(float)
	 * @see #valueOf(int)
	 * @see #valueOf(long)
	 * @see #valueOf(Object)
	 * @see UnsupportedEncodingException
	 */
	public String(byte[] data, int start, int length, final String encoding) throws UnsupportedEncodingException {
		data.getClass(); // Implicit null check
		encoding.getClass(); // Implicit null check

		if (start >= 0 && 0 <= length && length <= data.length - start) {
			StringCoding.Result scResult = StringCoding.decode(encoding, data, start, length);

			value = scResult.value;
			coder = scResult.coder;

			if (enableCompression && scResult.coder == UTF16) {
				initCompressionFlag();
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Converts the byte array to a String using the specified encoding.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param encoding
	 *          the encoding
	 *
	 * @throws UnsupportedEncodingException
	 *          when encoding is not supported
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @see #getBytes()
	 * @see #getBytes(int, int, byte[], int)
	 * @see #getBytes(String)
	 * @see #valueOf(boolean)
	 * @see #valueOf(char)
	 * @see #valueOf(char[])
	 * @see #valueOf(char[], int, int)
	 * @see #valueOf(double)
	 * @see #valueOf(float)
	 * @see #valueOf(int)
	 * @see #valueOf(long)
	 * @see #valueOf(Object)
	 * @see UnsupportedEncodingException
	 */
	public String(byte[] data, String encoding) throws UnsupportedEncodingException {
		this(data, 0, data.length, encoding);
	}

	private String(String s, char c) {
		if (s == null) {
			s = "null"; //$NON-NLS-1$
		}

		int slen = s.lengthInternal();

		int concatlen = slen + 1;
		if (concatlen < 0) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}

		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || s.coder == LATIN1) && c <= 255) {
			value = new byte[concatlen];
			coder = LATIN1;

			compressedArrayCopy(s.value, 0, value, 0, slen);

			helpers.putByteInArrayByIndex(value, slen, (byte) c);
		} else {
			value = StringUTF16.newBytesFor(concatlen);
			coder = UTF16;

			// Check if the String is compressed
			if (enableCompression && s.coder == LATIN1) {
				decompress(s.value, 0, value, 0, slen);
			} else {
				decompressedArrayCopy(s.value, 0, value, 0, slen);
			}		

			helpers.putCharInArrayByIndex(value, slen, c);

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/**
	 * Initializes this String to contain the characters in the specified character array. Modifying the character array after creating the String has
	 * no effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 *
	 * @throws NullPointerException
	 *          when data is null
	 */
	public String(char[] data) {
		this(data, 0, data.length);
	}

	/**
	 * Initializes this String to use the specified character array. The character array should not be modified after the String is created.
	 *
	 * @param data
	 *          a non-null array of characters
	 */
	String(char[] data, boolean ignore) {
		if (enableCompression && canEncodeAsLatin1(data, 0, data.length)) {
			value = new byte[data.length];
			coder = LATIN1;

			compress(data, 0, value, 0, data.length);
		} else {
			value = StringUTF16.newBytesFor(data.length);
			coder = UTF16;

			decompressedArrayCopy(data, 0, value, 0, data.length);

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/**
	 * Initializes this String to contain the specified characters in the character array. Modifying the character array after creating the String has
	 * no effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 * @param start
	 *          the starting offset in the character array
	 * @param length
	 *          the number of characters to use
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          when data is null
	 */
	public String(char[] data, int start, int length) {
		if (start >= 0 && 0 <= length && length <= data.length - start) {
			if (enableCompression && canEncodeAsLatin1(data, start, length)) {
				value = new byte[length];
				coder = LATIN1;

				compress(data, start, value, 0, length);
			} else {
				value = StringUTF16.newBytesFor(length);
				coder = UTF16;

				decompressedArrayCopy(data, start, value, 0, length);

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	String(byte[] data, int start, int length, boolean compressed) {
		if (length == 0) {
			value = emptyValue;

			if (enableCompression) {
				coder = LATIN1;
			} else {
				coder = UTF16;
			}
		} else if (length == 1) {
			if (enableCompression && compressed) {
				char theChar = helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(data, start));

				value = compressedAsciiTable[theChar];
				coder = LATIN1;
				hashCode = theChar;
			} else {
				char theChar = helpers.getCharFromArrayByIndex(data, start);

				if (theChar <= 255) {
					value = decompressedAsciiTable[theChar];
				} else {
					value = new byte[2];

					helpers.putCharInArrayByIndex(value, 0, theChar);
				}

				coder = UTF16;
				hashCode = theChar;

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		} else {
			if (enableCompression && compressed) {
				if (start == 0 && data.length == length) {
					value = data;
				} else {
					value = new byte[length];

					compressedArrayCopy(data, start, value, 0, length);
				}

				coder = LATIN1;
			} else {
				if (start == 0 && data.length == length * 2) {
					value = data;
				} else {
					value = StringUTF16.newBytesFor(length);

					decompressedArrayCopy(data, start, value, 0, length);
				}

				coder = UTF16;

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		}
	}

	String(byte[] data, int start, int length, boolean compressed, boolean sharingIsAllowed) {
		if (length == 0) {
			value = emptyValue;

			if (enableCompression) {
				coder = LATIN1;
			} else {
				coder = UTF16;
			}
		} else if (length == 1) {
			if (enableCompression && compressed) {
				char theChar = helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(data, start));

				value = compressedAsciiTable[theChar];
				coder = LATIN1;
				hashCode = theChar;
			} else {
				char theChar = helpers.getCharFromArrayByIndex(data, start);

				if (theChar <= 255) {
					value = decompressedAsciiTable[theChar];
				} else {
					value = new byte[2];

					helpers.putCharInArrayByIndex(value, 0, theChar);
				}

				coder = UTF16;
				hashCode = theChar;

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		} else {
			if (enableCompression && compressed) {
				if (sharingIsAllowed && start == 0 && data.length == length) {
					value = data;
				} else {
					value = new byte[length];

					compressedArrayCopy(data, start, value, 0, length);
				}

				coder = LATIN1;
			} else {
				if (sharingIsAllowed && start == 0 && data.length == length * 2) {
					value = data;
				} else {
					value = StringUTF16.newBytesFor(length);

					decompressedArrayCopy(data, start, value, 0, length);
				}

				coder = UTF16;

				if (enableCompression) {
					initCompressionFlag();
				}
			}
		}
	}

	/**
	 * Creates a string that is a copy of another string
	 *
	 * @param string
	 *          the String to copy
	 */
	public String(String string) {
		value = string.value;
		coder = string.coder;
		hashCode = string.hashCode;
	}

	/**
	 * Creates a string from the contents of a StringBuffer.
	 *
	 * @param buffer
	 *          the StringBuffer
	 */
	public String(StringBuffer buffer) {
		this(buffer.toString());
	}

	/*
	 * Creates a string that is s1 + s2.
	 */
	private String(String s1, String s2) {
		if (s1 == null) {
			s1 = "null"; //$NON-NLS-1$
		}

		if (s2 == null) {
			s2 = "null"; //$NON-NLS-1$
		}

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		int concatlen = s1len + s2len;
		if (concatlen < 0) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder) == LATIN1)) {
			value = new byte[concatlen];
			coder = LATIN1;

			compressedArrayCopy(s1.value, 0, value, 0, s1len);
			compressedArrayCopy(s2.value, 0, value, s1len, s2len);
		} else {
			value = StringUTF16.newBytesFor(concatlen);
			coder = UTF16;

			// Check if the String is compressed
			if (enableCompression && s1.coder == LATIN1) {
				decompress(s1.value, 0, value, 0, s1len);
			} else {
				decompressedArrayCopy(s1.value, 0, value, 0, s1len);
			}

			// Check if the String is compressed
			if (enableCompression && s2.coder == LATIN1) {
				decompress(s2.value, 0, value, s1len, s2len);
			} else {
				decompressedArrayCopy(s2.value, 0, value, s1len, s2len);
			}

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/*
	 * Creates a string that is s1 + s2 + s3.
	 */
	private String(String s1, String s2, String s3) {
		if (s1 == null) {
			s1 = "null"; //$NON-NLS-1$
		}

		if (s2 == null) {
			s2 = "null"; //$NON-NLS-1$
		}

		if (s3 == null) {
			s3 = "null"; //$NON-NLS-1$
		}

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();
		int s3len = s3.lengthInternal();

		long totalLen = (long) s1len + (long) s2len + (long) s3len;
		if (totalLen > Integer.MAX_VALUE) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}
		int concatlen = (int) totalLen;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder | s3.coder) == LATIN1)) {
			value = new byte[concatlen];
			coder = LATIN1;

			compressedArrayCopy(s1.value, 0, value, 0, s1len);
			compressedArrayCopy(s2.value, 0, value, s1len, s2len);
			compressedArrayCopy(s3.value, 0, value, s1len + s2len, s3len);
		} else {
			value = StringUTF16.newBytesFor(concatlen);
			coder = UTF16;

			// Check if the String is compressed
			if (enableCompression && s1.coder == LATIN1) {
				decompress(s1.value, 0, value, 0, s1len);
			} else {
				decompressedArrayCopy(s1.value, 0, value, 0, s1len);
			}

			// Check if the String is compressed
			if (enableCompression && s2.coder == LATIN1) {
				decompress(s2.value, 0, value, s1len, s2len);
			} else {
				decompressedArrayCopy(s2.value, 0, value, s1len, s2len);
			}

			// Check if the String is compressed
			if (enableCompression && s3.coder == LATIN1) {
				decompress(s3.value, 0, value, s1len + s2len, s3len);
			} else {
				decompressedArrayCopy(s3.value, 0, value, (s1len + s2len), s3len);
			}

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/*
	 * Creates a string that is s1 + v1.
	 */
	private String(String s1, int v1) {
		if (s1 == null) {
			s1 = "null"; //$NON-NLS-1$
		}

		// Char length of all the parameters respectively
		int s1len = s1.lengthInternal();
		int v1len = 1;

		int quot;
		int i = v1;
		while ((i /= 10) != 0)
			v1len++;
		if (v1 >= 0) {
			quot = -v1;
		} else {
			// Leave room for '-'
			v1len++;
			quot = v1;
		}

		// Char length of the final String
		int len = s1len + v1len;
		if (len < 0) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}

		if (enableCompression && (null == compressionFlag || s1.coder == LATIN1)) {
			value = new byte[len];
			coder = LATIN1;

			// Copy in v1
			int index = len - 1;

			do {
				int res = quot / 10;
				int rem = quot - (res * 10);

				quot = res;

				// Write the digit into the correct position
				helpers.putByteInArrayByIndex(value, index--, (byte) ('0' - rem));
			} while (quot != 0);

			if (v1 < 0) {
				helpers.putByteInArrayByIndex(value, index, (byte) '-');
			}

			// Copy in s1 contents
			compressedArrayCopy(s1.value, 0, value, 0, s1len);
		} else {
			value = StringUTF16.newBytesFor(len);
			coder = UTF16;

			// Copy in v1
			int index = len - 1;

			do {
				int res = quot / 10;
				int rem = quot - (res * 10);

				quot = res;

				// Write the digit into the correct position
				helpers.putCharInArrayByIndex(value, index--, (char) ('0' - rem));
			} while (quot != 0);

			if (v1 < 0) {
				helpers.putCharInArrayByIndex(value, index, (char) '-');
			}

			// Copy in s1 contents
			decompressedArrayCopy(s1.value, 0, value, 0, s1len);

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/*
	 * Creates a string that is v1 + s1 + v2 + s2 + s3.
	 */
	private String(int v1, String s1, int v2, String s2, String s3) {
		if (s1 == null) {
			s1 = "null"; //$NON-NLS-1$
		}

		if (s2 == null) {
			s2 = "null"; //$NON-NLS-1$
		}

		if (s3 == null) {
			s3 = "null"; //$NON-NLS-1$
		}

		// Char length of all the parameters respectively
		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();
		int s3len = s3.lengthInternal();

		int v1len = 1;
		int v2len = 1;

		int quot1;
		int i1 = v1;
		while ((i1 /= 10) != 0)
			v1len++;
		if (v1 >= 0) {
			quot1 = -v1;
		} else {
			// Leave room for '-'
			v1len++;
			quot1 = v1;
		}

		int quot2;
		int i2 = v2;
		while ((i2 /= 10) != 0)
			v2len++;
		if (v2 >= 0) {
			quot2 = -v2;
		} else {
			// Leave room for '-'
			v2len++;
			quot2 = v2;
		}

		// Char length of the final String
		long totalLen = (long) s1len + (long) v1len + (long) v2len + (long) s2len + (long) s3len;
		if (totalLen > Integer.MAX_VALUE) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}
		int len = (int) totalLen;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder | s3.coder) == LATIN1)) {
			value = new byte[len];
			coder = LATIN1;

			int start = len;

			// Copy in s3 contents
			start = start - s3len;
			compressedArrayCopy(s3.value, 0, value, start, s3len);

			// Copy in s2 contents
			start = start - s2len;
			compressedArrayCopy(s2.value, 0, value, start, s2len);

			// Copy in v2
			int index2 = start - 1;

			do {
				int res = quot2 / 10;
				int rem = quot2 - (res * 10);

				quot2 = res;

				// Write the digit into the correct position
				helpers.putByteInArrayByIndex(value, index2--, (byte) ('0' - rem));
			} while (quot2 != 0);

			if (v2 < 0) {
				helpers.putByteInArrayByIndex(value, index2--, (byte) '-');
			}

			// Copy in s1 contents
			start = index2 + 1 - s1len;
			compressedArrayCopy(s1.value, 0, value, start, s1len);

			// Copy in v1
			int index1 = start - 1;

			do {
				int res = quot1 / 10;
				int rem = quot1 - (res * 10);

				quot1 = res;

				// Write the digit into the correct position
				helpers.putByteInArrayByIndex(value, index1--, (byte) ('0' - rem));
			} while (quot1 != 0);

			if (v1 < 0) {
				helpers.putByteInArrayByIndex(value, index1--, (byte) '-');
			}
		} else {
			value = StringUTF16.newBytesFor(len);
			coder = UTF16;

			int start = len;

			// Copy in s3 contents
			start = start - s3len;

			// Check if the String is compressed
			if (enableCompression && s3.coder == LATIN1) {
				decompress(s3.value, 0, value, start, s3len);
			} else {
				decompressedArrayCopy(s3.value, 0, value, start, s3len);
			}

			// Copy in s2 contents
			start = start - s2len;

			// Check if the String is compressed
			if (enableCompression && s2.coder == LATIN1) {
				decompress(s2.value, 0, value, start, s2len);
			} else {
				decompressedArrayCopy(s2.value, 0, value, start, s2len);
			}

			// Copy in v2
			int index2 = start - 1;

			do {
				int res = quot2 / 10;
				int rem = quot2 - (res * 10);

				quot2 = res;

				// Write the digit into the correct position
				helpers.putCharInArrayByIndex(value, index2--, (char) ('0' - rem));
			} while (quot2 != 0);

			if (v2 < 0) {
				helpers.putCharInArrayByIndex(value, index2--, (char) '-');
			}

			// Copy in s1 contents
			start = index2 + 1 - s1len;

			// Check if the String is compressed
			if (enableCompression && s1.coder == LATIN1) {
				decompress(s1.value, 0, value, start, s1len);
			} else {
				decompressedArrayCopy(s1.value, 0, value, start, s1len);
			}

			// Copy in v1
			int index1 = start - 1;

			do {
				int res = quot1 / 10;
				int rem = quot1 - (res * 10);

				quot1 = res;

				// Write the digit into the correct position
				helpers.putCharInArrayByIndex(value, index1--, (char) ('0' - rem));
			} while (quot1 != 0);

			if (v1 < 0) {
				helpers.putCharInArrayByIndex(value, index1--, (char) '-');
			}

			if (enableCompression) {
				initCompressionFlag();
			}
		}
	}

	/*
	 * Loads from the stringArray if concatenated result is found else it creates a string that is s1 + s2 which is stored in stringArray and then
	 * returned.
	 */
	static private String cachedConstantString(String s1, String s2, int index) {
		if (index < stringArraySize) {
			if (stringArray[index] == null) {
				stringArray[index] = new String(s1, s2);
			}
		} else {
			return new String(s1, s2);
		}
		return stringArray[index];
	}

	/**
	 * Answers the character at the specified offset in this String.
	 *
	 * @param index
	 *          the zero-based index in this string
	 * @return the character at the index
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code index < 0} or {@code index >= length()}
	 */
	public char charAt(int index) {
		if (0 <= index && index < lengthInternal()) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				return helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, index));
			} else {
				return helpers.getCharFromArrayByIndex(value, index);
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	// Internal version of charAt used for extracting a char from a String in compression related code.
	char charAtInternal(int index) {
		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			return helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, index));
		} else {
			return helpers.getCharFromArrayByIndex(value, index);
		}
	}

	// This method is needed so idiom recognition properly recognizes idiomatic loops where we are doing an operation on
	// the byte[] value of two Strings. In such cases we extract the String.value fields before entering the operation loop.
	// However if chatAt is used inside the loop then the JIT will anchor the load of the value byte[] inside of the loop thus
	// causing us to load the String.value on every iteration. This is very suboptimal and breaks some of the common idioms
	// that we recognize. The most prominent one is the regionMatches arraycmp idiom that is not recognized unless this method
	// is being used.
	char charAtInternal(int index, byte[] value) {
		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			return helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, index));
		} else {
			return helpers.getCharFromArrayByIndex(value, index);
		}
	}

	/**
	 * Compares the specified String to this String using the Unicode values of the characters. Answer 0 if the strings contain the same characters in
	 * the same order. Answer a negative integer if the first non-equal character in this String has a Unicode value which is less than the Unicode
	 * value of the character at the same position in the specified string, or if this String is a prefix of the specified string. Answer a positive
	 * integer if the first non-equal character in this String has a Unicode value which is greater than the Unicode value of the character at the same
	 * position in the specified string, or if the specified String is a prefix of the this String.
	 *
	 * @param string
	 *          the string to compare
	 * @return 0 if the strings are equal, a negative integer if this String is before the specified String, or a positive integer if this String is
	 *          after the specified String
	 *
	 * @throws NullPointerException
	 *          when string is null
	 */
	public int compareTo(String string) {
		String s1 = this;
		String s2 = string;

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		// Upper bound index on the last char to compare
		int end = s1len < s2len ? s1len : s2len;

		int o1 = 0;
		int o2 = 0;

		byte[] s1Value = s1.value;
		byte[] s2Value = s2.value;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder) == LATIN1)) {
			while (o1 < end) {
				int result =
					helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(s1Value, o1++)) -
					helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(s2Value, o2++));

				if (result != 0) {
					return result;
				}
			}
		} else {
			while (o1 < end) {
				int result =
					s1.charAtInternal(o1++, s1Value) -
					s2.charAtInternal(o2++, s2Value);

				if (result != 0) {
					return result;
				}
			}
		}

		return s1len - s2len;
	}

	private static int compareValue(int codepoint) {
		if ('A' <= codepoint && codepoint <= 'Z') {
			return codepoint + ('a' - 'A');
		}

		return Character.toLowerCase(Character.toUpperCase(codepoint));
	}

	private static char compareValue(char c) {
		if ('A' <= c && c <= 'Z') {
			return (char) (c + ('a' - 'A'));
		}

		return Character.toLowerCase(Character.toUpperCase(c));
	}

	private static char compareValue(byte b) {
		if ('A' <= b && b <= 'Z') {
			return (char)(helpers.byteToCharUnsigned(b) + ('a' - 'A'));
		}
		return Character.toLowerCase(Character.toUpperCase(helpers.byteToCharUnsigned(b)));
	}

	private static boolean charValuesEqualIgnoreCase(char c1, char c2) {
		boolean charValuesEqual = false;
		char c1upper = (char) toUpperCase(c1);
		char c2upper = (char) toUpperCase(c2);

		// If at least one char is ASCII, converting to upper cases then compare should be sufficient.
		// If both chars are not in ASCII char set, need to convert to lower case and compare as well.
		if (((c1 <= 255 || c2 <= 255) && (c1upper == c2upper))
				|| (toLowerCase(c1upper) == toLowerCase(c2upper))
		) {
			charValuesEqual = true;
		}

		return charValuesEqual;
	}

	/**
	 * Compare the receiver to the specified String to determine the relative ordering when the case of the characters is ignored.
	 *
	 * @param string
	 *          a String
	 * @return an {@code int < 0} if this String is less than the specified String, 0 if they are equal, and {@code > 0} if this String is greater
	 */
	public int compareToIgnoreCase(String string) {
		String s1 = this;
		String s2 = string;

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		// Upper bound index on the last char to compare
		int end = s1len < s2len ? s1len : s2len;

		int o1 = 0;
		int o2 = 0;

		byte[] s1Value = s1.value;
		byte[] s2Value = s2.value;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder) == LATIN1)) {
			while (o1 < end) {
				byte byteAtO1 = helpers.getByteFromArrayByIndex(s1Value, o1++);
				byte byteAtO2 = helpers.getByteFromArrayByIndex(s2Value, o2++);

				if (byteAtO1 == byteAtO2) {
					continue;
				}

				int result = compareValue(byteAtO1) - compareValue(byteAtO2);

				if (result != 0) {
					return result;
				}
			}
		} else {
			while (o1 < end) {
				char charAtO1 = s1.charAtInternal(o1++, s1Value);
				char charAtO2 = s2.charAtInternal(o2++, s2Value);
				int codepointAtO1 = charAtO1;
				int codepointAtO2 = charAtO2;

				if (charAtO1 == charAtO2) {
					continue;
				}

				int result = compareValue(codepointAtO1) - compareValue(codepointAtO2);

				if (result != 0) {
					return result;
				}
			}
		}

		return s1len - s2len;
	}

	/**
	 * Concatenates this String and the specified string.
	 *
	 * @param string
	 *          the string to concatenate
	 * @return a String which is the concatenation of this String and the specified String
	 *
	 * @throws NullPointerException
	 *          if string is null
	 */
	public String concat(String string) {
		String s1 = this;
		String s2 = string;

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		if (s2len == 0) {
			return s1;
		}

		int concatlen = s1len + s2len;
		if (concatlen < 0) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}

		if (enableCompression && ((null == compressionFlag) || ((s1.coder | s2.coder) == LATIN1))) {
			byte[] buffer = new byte[concatlen];

			compressedArrayCopy(s1.value, 0, buffer, 0, s1len);
			compressedArrayCopy(s2.value, 0, buffer, s1len, s2len);

			return new String(buffer, LATIN1);
		} else {
			byte[] buffer = StringUTF16.newBytesFor(concatlen);

			// Check if the String is compressed
			if (enableCompression && s1.coder == LATIN1) {
				decompress(s1.value, 0, buffer, 0, s1len);
			} else {
				decompressedArrayCopy(s1.value, 0, buffer, 0, s1len);
			}

			// Check if the String is compressed
			if (enableCompression && s2.coder == LATIN1) {
				decompress(s2.value, 0, buffer, s1len, s2len);
			} else {
				decompressedArrayCopy(s2.value, 0, buffer, s1len, s2len);
			}

			return new String(buffer, UTF16);
		}
	}

	/**
	 * Creates a new String containing the characters in the specified character array. Modifying the character array after creating the String has no
	 * effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 * @return the new String
	 *
	 * @throws NullPointerException
	 *          if data is null
	 */
	public static String copyValueOf(char[] data) {
		return new String(data, 0, data.length);
	}

	/**
	 * Creates a new String containing the specified characters in the character array. Modifying the character array after creating the String has no
	 * effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 * @param start
	 *          the starting offset in the character array
	 * @param length
	 *          the number of characters to use
	 * @return the new String
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          if data is null
	 */
	public static String copyValueOf(char[] data, int start, int length) {
		return new String(data, start, length);
	}

	/**
	 * Compares the specified string to this String to determine if the specified string is a suffix.
	 *
	 * @param suffix
	 *          the string to look for
	 * @return true when the specified string is a suffix of this String, false otherwise
	 *
	 * @throws NullPointerException
	 *          if suffix is null
	 */
	public boolean endsWith(String suffix) {
		return regionMatches(lengthInternal() - suffix.lengthInternal(), suffix, 0, suffix.lengthInternal());
	}

	/**
	 * Compares the specified object to this String and answer if they are equal. The object must be an instance of String with the same characters in
	 * the same order.
	 *
	 * @param object
	 *          the object to compare
	 * @return true if the specified object is equal to this String, false otherwise
	 *
	 * @see #hashCode()
	 */
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		} else {
			if (object instanceof String) {
				String s1 = this;
				String s2 = (String) object;

				int s1len = s1.lengthInternal();
				int s2len = s2.lengthInternal();

				if (s1len != s2len) {
					return false;
				}

				byte[] s1Value = s1.value;
				byte[] s2Value = s2.value;

				if (s1Value == s2Value) {
					return true;
				} else {
					// There was a time hole between first read of s.hashCode and second read if another thread does hashcode
					// computing for incoming string object
					int s1hash = s1.hashCode;
					int s2hash = s2.hashCode;

					if (s1hash != 0 && s2hash != 0 && s1hash != s2hash) {
						return false;
					}

					if (!regionMatchesInternal(s1, s2, s1Value, s2Value, 0, 0, s1len)) {
						return false;
					}

					if (com.ibm.oti.vm.VM.J9_JIT_STRING_DEDUP_POLICY != com.ibm.oti.vm.VM.J9_JIT_STRING_DEDUP_POLICY_DISABLED) {
						deduplicateStrings(s1, s1Value, s2, s2Value);
					}

					return true;
				}
			}

			return false;
		}
	}

	/**
	 * Deduplicate the backing buffers of the given strings.
	 *
	 * This updates the {@link #value} of one of the two given strings so that
	 * they both share a single backing buffer. The strings must have identical
	 * contents.
	 *
	 * Deduplication helps save space, and lets {@link #equals(Object)} exit
	 * early more often.
	 *
	 * The strings' corresponding backing buffers are accepted as parameters
	 * because the caller likely already has them.
	 *
	 * @param s1 The first string
	 * @param value1 {@code s1.value}
	 * @param s2 The second string
	 * @param value2 {@code s2.value}
	 */
	private static final void deduplicateStrings(String s1, Object value1, String s2, Object value2) {
		if (s1.coder == s2.coder) {
			long valueFieldOffset = UnsafeHelpers.valueFieldOffset;

			if (com.ibm.oti.vm.VM.J9_JIT_STRING_DEDUP_POLICY == com.ibm.oti.vm.VM.J9_JIT_STRING_DEDUP_POLICY_FAVOUR_LOWER) {
				if (helpers.acmplt(value1, value2)) {
					helpers.putObjectInObject(s2, valueFieldOffset, value1);
				} else {
					helpers.putObjectInObject(s1, valueFieldOffset, value2);
				}
			} else {
				if (helpers.acmplt(value2, value1)) {
					helpers.putObjectInObject(s2, valueFieldOffset, value1);
				} else {
					helpers.putObjectInObject(s1, valueFieldOffset, value2);
				}
			}
		}
	}

	/**
	 * Compares the specified String to this String ignoring the case of the characters and answer if they are equal.
	 *
	 * @param string
	 *          the string to compare
	 * @return true if the specified string is equal to this String, false otherwise
	 */
	public boolean equalsIgnoreCase(String string) {
		String s1 = this;
		String s2 = string;

		if (s1 == s2) {
			return true;
		}

		if (s2 == null) {
			return false;
		}

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		if (s1len != s2len) {
			return false;
		}

		// Zero length strings are equal
		if (s1len == 0) {
			return true;
		}

		int o1 = 0;
		int o2 = 0;

		// Upper bound index on the last char to compare
		int end = s1len;

		byte[] s1Value = s1.value;
		byte[] s2Value = s2.value;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder) == LATIN1)) {
			// Compare the last chars.
			// In order to tell 2 chars are different:
			// Under string compression, the compressible char set obeys 1-1 mapping for upper/lower case,
			// converting to upper cases then compare should be sufficient.
			byte byteAtO1Last = helpers.getByteFromArrayByIndex(s1Value, s1len - 1);
			byte byteAtO2Last = helpers.getByteFromArrayByIndex(s2Value, s1len - 1);

			if ((byteAtO1Last != byteAtO2Last)
					&& (toUpperCase(helpers.byteToCharUnsigned(byteAtO1Last)) != toUpperCase(helpers.byteToCharUnsigned(byteAtO2Last)))
			) {
				return false;
			}

			while (o1 < end - 1) {
				byte byteAtO1 = helpers.getByteFromArrayByIndex(s1Value, o1++);
				byte byteAtO2 = helpers.getByteFromArrayByIndex(s2Value, o2++);

				if ((byteAtO1 != byteAtO2)
						&& (toUpperCase(helpers.byteToCharUnsigned(byteAtO1)) != toUpperCase(helpers.byteToCharUnsigned(byteAtO2)))
				) {
					return false;
				}
			}
		} else {
			// Compare the last chars.
			// In order to tell 2 chars are different:
			// If at least one char is ASCII, converting to upper cases then compare should be sufficient.
			// If both chars are not in ASCII char set, need to convert to lower case and compare as well.
			char charAtO1Last = s1.charAtInternal(s1len - 1, s1Value);
			char charAtO2Last = s2.charAtInternal(s1len - 1, s2Value);

			if ((charAtO1Last != charAtO2Last)
					&& !charValuesEqualIgnoreCase(charAtO1Last, charAtO2Last)
			) {
				return false;
			}

			while (o1 < end - 1) {
				char charAtO1 = s1.charAtInternal(o1++, s1Value);
				char charAtO2 = s2.charAtInternal(o2++, s2Value);

				if ((charAtO1 != charAtO2)
						&& (!charValuesEqualIgnoreCase(charAtO1, charAtO2))
				) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Converts this String to a byte encoding using the default encoding as specified by the file.encoding system property. If the system property is
	 * not defined, the default encoding is ISO8859_1 (ISO-Latin-1). If 8859-1 is not available, an ASCII encoding is used.
	 *
	 * @return the byte array encoding of this String
	 *
	 * @see String
	 */
	public byte[] getBytes() {
		return StringCoding.encode(coder, value);
	}

	/**
	 * Converts this String to a byte array, ignoring the high order bits of each character.
	 *
	 * @param start
	 *          the starting offset of characters to copy
	 * @param end
	 *          the ending offset of characters to copy
	 * @param data
	 *          the destination byte array
	 * @param index
	 *          the starting offset in the byte array
	 *
	 * @throws NullPointerException
	 *          when data is null
	 * @throws IndexOutOfBoundsException
	 *          when {@code start < 0, end > length(), index < 0, end - start > data.length - index}
	 *
	 * @deprecated Use getBytes() or getBytes(String)
	 */
	@Deprecated(forRemoval=false, since="1.1")
	public void getBytes(int start, int end, byte[] data, int index) {
		if (0 <= start && start <= end && end <= lengthInternal() && 0 <= index && ((end - start) <= (data.length - index))) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				compressedArrayCopy(value, start, data, index, end - start);
			} else {
				compress(value, start, data, index, end - start);
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Converts this String to a byte encoding using the specified encoding.
	 *
	 * @param encoding
	 *          the encoding
	 * @return the byte array encoding of this String
	 *
	 * @throws UnsupportedEncodingException
	 *          when the encoding is not supported
	 *
	 * @see String
	 * @see UnsupportedEncodingException
	 */
	public byte[] getBytes(String encoding) throws UnsupportedEncodingException {
		encoding.getClass(); // Implicit null check
		return StringCoding.encode(encoding, coder, value);
	}

	/**
	 * Copies the specified characters in this String to the character array starting at the specified offset in the character array.
	 *
	 * @param start
	 *          the starting offset of characters to copy
	 * @param end
	 *          the ending offset of characters to copy
	 * @param data
	 *          the destination character array
	 * @param index
	 *          the starting offset in the character array
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code start < 0, end > length(), start > end, index < 0, end - start > buffer.length - index}
	 * @throws NullPointerException
	 *          when buffer is null
	 */
	public void getChars(int start, int end, char[] data, int index) {
		if (0 <= start && start <= end && end <= lengthInternal() && 0 <= index && ((end - start) <= (data.length - index))) {
			getCharsNoBoundChecks(start, end, data, index);
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	// This is a package protected method that performs the getChars operation without explicit bound checks.
	// Caller of this method must validate bound safety for String indexing and array copying.
	void getCharsNoBoundChecks(int start, int end, char[] data, int index) {
		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			decompress(value, start, data, index, end - start);
		} else {
			decompressedArrayCopy(value, start, data, index, end - start);
		}
	}

	// This is a package protected method that performs the getChars operation without explicit bound checks.
	// Caller of this method must validate bound safety for String indexing and array copying.
	void getCharsNoBoundChecks(int start, int end, byte[] data, int index) {
		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			decompress(value, start, data, index, end - start);
		} else {
			decompressedArrayCopy(value, start, data, index, end - start);
		}
	}

	/**
	 * Answers an integer hash code for the receiver. Objects which are equal answer the same value for this method.
	 *
	 * @return the receiver's hash
	 *
	 * @see #equals
	 */
	public int hashCode() {
		if (hashCode == 0 && value.length > 0) {
			// Check if the String is compressed
			if (enableCompression && (compressionFlag == null || coder == LATIN1)) {
				hashCode = hashCodeImplCompressed(value, 0, lengthInternal());
			} else {
				hashCode = hashCodeImplDecompressed(value, 0, lengthInternal());
			}
		}

		return hashCode;
	}

	private static int hashCodeImplCompressed(byte[] value, int offset, int count) {
		int hash = 0, end = offset + count;

		for (int i = offset; i < end; ++i) {
			hash = (hash << 5) - hash + helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, i));
		}

		return hash;
	}

	private static int hashCodeImplDecompressed(byte[] value, int offset, int count) {
		int hash = 0, end = offset + count;

		for (int i = offset; i < end; ++i) {
			hash = (hash << 5) - hash + helpers.getCharFromArrayByIndex(value, i);
		}

		return hash;
	}

	/**
	 * Searches in this String for the first index of the specified character. The search for the character starts at the beginning and moves towards
	 * the end of this String.
	 *
	 * @param c
	 *          the character to find
	 * @return the index in this String of the specified character, -1 if the character isn't found
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int indexOf(int c) {
		return indexOf(c, 0);
	}

	/**
	 * Searches in this String for the index of the specified character. The search for the character starts at the specified offset and moves towards
	 * the end of this String.
	 *
	 * @param c
	 *          the character to find
	 * @param start
	 *          the starting offset
	 * @return the index in this String of the specified character, -1 if the character isn't found
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int indexOf(int c, int start) {
		int len = lengthInternal();

		if (start < len) {
			if (start < 0) {
				start = 0;
			}

			if (c >= 0 && c <= Character.MAX_VALUE) {
				byte[] array = value;

				// Check if the String is compressed
				if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
					if (c <= 255) {
						return helpers.intrinsicIndexOfLatin1(array, (byte)c, start, len);
					}
				} else {
					return helpers.intrinsicIndexOfUTF16(array, (char)c, start, len);
				}
			} else if (c <= Character.MAX_CODE_POINT) {
				for (int i = start; i < len; ++i) {
					int codePoint = codePointAt(i);

					if (codePoint == c) {
						return i;
					}

					if (codePoint >= Character.MIN_SUPPLEMENTARY_CODE_POINT) {
						++i;
					}
				}
			}
		}

		return -1;
	}

	/**
	 * Searches in this String for the first index of the specified string. The search for the string starts at the beginning and moves towards the end
	 * of this String.
	 *
	 * @param string
	 *          the string to find
	 * @return the index in this String of the specified string, -1 if the string isn't found
	 *
	 * @throws NullPointerException
	 *          when string is null
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 *
	 */
	public int indexOf(String string) {
		return indexOf(string, 0);
	}

	/**
	 * Searches in this String for the index of the specified string. The search for the string starts at the specified offset and moves towards the
	 * end of this String.
	 *
	 * @param subString
	 *          the string to find
	 * @param start
	 *          the starting offset
	 * @return the index in this String of the specified string, -1 if the string isn't found
	 *
	 * @throws NullPointerException
	 *          when string is null
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int indexOf(String subString, int start) {
		if (subString.length() == 1) {
			return indexOf(subString.charAtInternal(0), start);
		}

		return indexOf(value, coder, lengthInternal(), subString, start);
	}

	static int indexOf(byte[] value, byte coder, int count, String str, int fromIndex) {
		int s1Length = count;
		int s2Length = str.lengthInternal();

		if (fromIndex < 0) {
			fromIndex = 0;
		} else if (fromIndex >= s1Length) {
			// Handle the case where the substring is of zero length, in which case we have an indexOf hit at the end
			// of this string
			return s2Length == 0 ? s1Length : -1;
		}

		if (s2Length == 0) {
			// At this point we know fromIndex < s1Length so there is a hit at fromIndex
			return fromIndex;
		}

		byte[] s1Value = value;
		byte[] s2Value = str.value;

		if (coder == str.coder) {
			if (coder == LATIN1) {
				return StringLatin1.indexOf(s1Value, s1Length, s2Value, s2Length, fromIndex);
			} else {
				return StringUTF16.indexOf(s1Value, s1Length, s2Value, s2Length, fromIndex);
			}
		}

		if (coder == UTF16) {
			return StringUTF16.indexOfLatin1(s1Value, s1Length, s2Value, s2Length, fromIndex);
		}

		return -1;
	}

	/**
	 * Searches an internal table of strings for a string equal to this String. If the string is not in the table, it is added. Answers the string
	 * contained in the table which is equal to this String. The same string object is always answered for strings which are equal.
	 *
	 * @return the interned string equal to this String
	 */
	public native String intern();

	/**
	 * Searches in this String for the last index of the specified character. The search for the character starts at the end and moves towards the
	 * beginning of this String.
	 *
	 * @param c
	 *          the character to find
	 * @return the index in this String of the specified character, -1 if the character isn't found
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int lastIndexOf(int c) {
		return lastIndexOf(c, lengthInternal() - 1);
	}

	/**
	 * Searches in this String for the index of the specified character. The search for the character starts at the specified offset and moves towards
	 * the beginning of this String.
	 *
	 * @param c
	 *          the character to find
	 * @param start
	 *          the starting offset
	 * @return the index in this String of the specified character, -1 if the character isn't found
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int lastIndexOf(int c, int start) {
		if (start >= 0) {
			int len = lengthInternal();

			if (start >= len) {
				start = len - 1;
			}

			if (c >= 0 && c <= Character.MAX_VALUE) {
				byte[] array = value;

				// Check if the String is compressed
				if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
					if (c <= 255) {
						byte b = (byte) c;

						for (int i = start; i >= 0; --i) {
							if (helpers.getByteFromArrayByIndex(array, i) == b) {
								return i;
							}
						}
					}
				} else {
					for (int i = start; i >= 0; --i) {
						if (helpers.getCharFromArrayByIndex(array, i) == c) {
							return i;
						}
					}
				}
			} else if (c <= Character.MAX_CODE_POINT) {
				for (int i = start; i >= 0; --i) {
					int codePoint = codePointAt(i);

					if (codePoint == c) {
						return i;
					}

					if (codePoint >= Character.MIN_SUPPLEMENTARY_CODE_POINT) {
						--i;
					}
				}
			}
		}

		return -1;
	}

	/**
	 * Searches in this String for the last index of the specified string. The search for the string starts at the end and moves towards the beginning
	 * of this String.
	 *
	 * @param string
	 *          the string to find
	 * @return the index in this String of the specified string, -1 if the string isn't found
	 *
	 * @throws NullPointerException
	 *          when string is null
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int lastIndexOf(String string) {
		return lastIndexOf(string, lengthInternal());
	}

	/**
	 * Searches in this String for the index of the specified string. The search for the string starts at the specified offset and moves towards the
	 * beginning of this String.
	 *
	 * @param subString
	 *          the string to find
	 * @param start
	 *          the starting offset
	 * @return the index in this String of the specified string, -1 if the string isn't found
	 *
	 * @throws NullPointerException
	 *          when string is null
	 *
	 * @see #lastIndexOf(int)
	 * @see #lastIndexOf(int, int)
	 * @see #lastIndexOf(String)
	 * @see #lastIndexOf(String, int)
	 */
	public int lastIndexOf(String subString, int start) {
		return lastIndexOf(value, coder, lengthInternal(), subString, start);
	}

	static int lastIndexOf(byte[] value, byte coder, int count, String str, int fromIndex) {
		int s1Length = count;
		int s2Length = str.lengthInternal();

		if (fromIndex > s1Length - s2Length) {
			fromIndex = s1Length - s2Length;
		}

		if (fromIndex < 0) {
			return -1;
		}

		if (s2Length == 0) {
			return fromIndex;
		}

		byte[] s1Value = value;
		byte[] s2Value = str.value;

		if (coder == str.coder) {
			if (coder == LATIN1) {
				return StringLatin1.lastIndexOf(s1Value, s1Length, s2Value, s2Length, fromIndex);
			} else {
				return StringUTF16.lastIndexOf(s1Value, s1Length, s2Value, s2Length, fromIndex);
			}
		}

		if (coder == UTF16) {
			return StringUTF16.lastIndexOfLatin1(s1Value, s1Length, s2Value, s2Length, fromIndex);
		}

		return -1;
	}

	/**
	 * Answers the size of this String.
	 *
	 * @return the number of characters in this String
	 */
	public int length() {
		return lengthInternal();
	}

	/**
	 * Answers the size of this String. This method is to be used internally within the current package whenever
	 * possible as the JIT compiler will take special precaution to avoid generating HCR guards for calls to this
	 * method.
	 *
	 * @return the number of characters in this String
	 */
	int lengthInternal() {
		if (enableCompression) {
			return value.length >> coder;
		} else {
			return value.length >> 1;
		}
	}

	/**
	 * Compares the specified string to this String and compares the specified range of characters to determine if they are the same.
	 *
	 * @param thisStart
	 *          the starting offset in this String
	 * @param string
	 *          the string to compare
	 * @param start
	 *          the starting offset in string
	 * @param length
	 *          the number of characters to compare
	 * @return true if the ranges of characters is equal, false otherwise
	 *
	 * @throws NullPointerException
	 *          when string is null
	 */
	public boolean regionMatches(int thisStart, String string, int start, int length) {
		string.getClass(); // Implicit null check

		String s1 = this;
		String s2 = string;

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		if (start < 0 || s2len - start < length) {
			return false;
		}

		if (thisStart < 0 || s1len - thisStart < length) {
			return false;
		}

		return regionMatchesInternal(s1, s2, s1.value, s2.value, thisStart, start, length);
	}

	private static boolean regionMatchesInternal(String s1, String s2, byte[] s1Value, byte[] s2Value, int s1Start, int s2Start, int length)
	{
		if (length <= 0) {
			return true;
		}

		// Index of the last char to compare
		int end = length - 1;

		if (enableCompression && ((compressionFlag == null) || ((s1.coder | s2.coder) == LATIN1))) {
			if (helpers.getByteFromArrayByIndex(s1Value, s1Start + end) != helpers.getByteFromArrayByIndex(s2Value, s2Start + end)) {
				return false;
			} else {
				for (int i = 0; i < end; ++i) {
					if (helpers.getByteFromArrayByIndex(s1Value, s1Start + i) != helpers.getByteFromArrayByIndex(s2Value, s2Start + i)) {
						return false;
					}
				}
			}
		} else {
			if (s1.charAtInternal(s1Start + end, s1Value) != s2.charAtInternal(s2Start + end, s2Value)) {
				return false;
			} else {
				for (int i = 0; i < end; ++i) {
					if (s1.charAtInternal(s1Start + i, s1Value) != s2.charAtInternal(s2Start + i, s2Value)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Compares the specified string to this String and compares the specified range of characters to determine if they are the same. When ignoreCase
	 * is true, the case of the characters is ignored during the comparison.
	 *
	 * @param ignoreCase
	 *          specifies if case should be ignored
	 * @param thisStart
	 *          the starting offset in this String
	 * @param string
	 *          the string to compare
	 * @param start
	 *          the starting offset in string
	 * @param length
	 *          the number of characters to compare
	 * @return true if the ranges of characters is equal, false otherwise
	 *
	 * @throws NullPointerException
	 *          when string is null
	 */
	public boolean regionMatches(boolean ignoreCase, int thisStart, String string, int start, int length) {
		if (!ignoreCase) {
			return regionMatches(thisStart, string, start, length);
		}

		string.getClass(); // Implicit null check

		String s1 = this;
		String s2 = string;

		int s1len = s1.lengthInternal();
		int s2len = s2.lengthInternal();

		if (thisStart < 0 || length > s1len - thisStart) {
			return false;
		}

		if (start < 0 || length > s2len - start) {
			return false;
		}

		if (length <= 0) {
			return true;
		}

		int o1 = thisStart;
		int o2 = start;

		// Upper bound index on the last char to compare
		int end = thisStart + length;

		byte[] s1Value = s1.value;
		byte[] s2Value = s2.value;

		if (enableCompression && (null == compressionFlag || (s1.coder | s2.coder) == LATIN1)) {
			while (o1 < end) {
				byte byteAtO1 = helpers.getByteFromArrayByIndex(s1Value, o1++);
				byte byteAtO2 = helpers.getByteFromArrayByIndex(s2Value, o2++);

				if ((byteAtO1 != byteAtO2)
						&& (!charValuesEqualIgnoreCase(helpers.byteToCharUnsigned(byteAtO1), helpers.byteToCharUnsigned(byteAtO2)))
				) {
					return false;
				}
			}
		} else {
			while (o1 < end) {
				char charAtO1 = s1.charAtInternal(o1++, s1Value);
				char charAtO2 = s2.charAtInternal(o2++, s2Value);

				if ((charAtO1 != charAtO2)
						&& (!charValuesEqualIgnoreCase(charAtO1, charAtO2))
				) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Replaces occurrences of the specified character with another character.
	 *
	 * @param oldChar
	 *          the character to replace
	 * @param newChar
	 *          the replacement character
	 * @return a String with occurrences of oldChar replaced by newChar
	 */
	public String replace(char oldChar, char newChar) {
		int index = indexOf(oldChar, 0);

		if (index == -1) {
			return this;
		}

		int len = lengthInternal();

		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			if (newChar <= 255) {
				byte[] buffer = new byte[len];

				compressedArrayCopy(value, 0, buffer, 0, len);

				do {
					helpers.putByteInArrayByIndex(buffer, index++, (byte) newChar);
				} while ((index = indexOf(oldChar, index)) != -1);

				return new String(buffer, LATIN1);
			} else {
				byte[] buffer = StringUTF16.newBytesFor(len);

				decompress(value, 0, buffer, 0, len);

				do {
					helpers.putCharInArrayByIndex(buffer, index++, (char) newChar);
				} while ((index = indexOf(oldChar, index)) != -1);

				return new String(buffer, UTF16);
			}
		} else {
			byte[] buffer = StringUTF16.newBytesFor(len);

			decompressedArrayCopy(value, 0, buffer, 0, len);

			do {
				helpers.putCharInArrayByIndex(buffer, index++, (char) newChar);
			} while ((index = indexOf(oldChar, index)) != -1);

			return new String(buffer, UTF16);
		}
	}

	/**
	 * Compares the specified string to this String to determine if the specified string is a prefix.
	 *
	 * @param prefix
	 *          the string to look for
	 * @return true when the specified string is a prefix of this String, false otherwise
	 *
	 * @throws NullPointerException
	 *          when prefix is null
	 */
	public boolean startsWith(String prefix) {
		return startsWith(prefix, 0);
	}

	/**
	 * Compares the specified string to this String, starting at the specified offset, to determine if the specified string is a prefix.
	 *
	 * @param prefix
	 *          the string to look for
	 * @param start
	 *          the starting offset
	 * @return true when the specified string occurs in this String at the specified offset, false otherwise
	 *
	 * @throws NullPointerException
	 *          when prefix is null
	 */
	public boolean startsWith(String prefix, int start) {
		if (prefix.length() == 1) {
			if (start < 0 || start >= this.length()) {
				return false;
			}
			return charAtInternal(start) == prefix.charAtInternal(0);
		}
		return regionMatches(start, prefix, 0, prefix.lengthInternal());
	}

	/**
	 * Strip leading and trailing white space from a string.
	 *
	 * @return a substring of the original containing no leading
	 * or trailing white space
	 *
	 * @since 11
	 */
	public String strip() {
		String result;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			result = StringLatin1.strip(value);
		} else {
			result = StringUTF16.strip(value);
		}

		return (result == null) ? this : result;
	}

	/**
	 * Strip leading white space from a string.
	 *
	 * @return a substring of the original containing no leading
	 * white space
	 *
	 * @since 11
	 */
	public String stripLeading() {
		String result;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			result = StringLatin1.stripLeading(value);
		} else {
			result = StringUTF16.stripLeading(value);
		}

		return (result == null) ? this : result;
	}

	/**
	 * Strip trailing white space from a string.
	 *
	 * @return a substring of the original containing no trailing
	 * white space
	 *
	 * @since 11
	 */
	public String stripTrailing() {
		String result;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			result = StringLatin1.stripTrailing(value);
		} else {
			result = StringUTF16.stripTrailing(value);
		}

		return (result == null) ? this : result;
	}

	/**
	 * Determine if the string contains only white space characters.
	 *
	 * @return true if the string is empty or contains only white space
	 * characters, otherwise false.
	 *
	 * @since 11
	 */
	public boolean isBlank() {
		int index;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			index = StringLatin1.indexOfNonWhitespace(value);
		} else {
			index = StringUTF16.indexOfNonWhitespace(value);
		}

		return index >= lengthInternal();
	}

	/**
	 * Returns a stream of substrings extracted from this string partitioned by line terminators.
	 *
	 * Line terminators recognized are line feed "\n", carriage return "\r", and carriage return
	 * followed by line feed "\r\n".
	 *
	 * @return the stream of this string's substrings partitioned by line terminators
	 *
	 * @since 11
	 */
	public Stream<String> lines() {
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			return StringLatin1.lines(value);
		} else {
			return StringUTF16.lines(value);
		}
	}

	/**
	 * Copies a range of characters into a new String.
	 *
	 * @param start
	 *          the offset of the first character
	 * @return a new String containing the characters from start to the end of the string
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code start < 0} or {@code start > length()}
	 */
	public String substring(int start) {
		if (start == 0) {
			return this;
		}

		int len = lengthInternal();

		if (0 <= start && start <= len) {
			boolean isCompressed = false;

			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				isCompressed = true;
			}

			return new String(value, start, len - start, isCompressed, enableSharingInSubstringWhenOffsetIsZero);
		} else {
			throw new StringIndexOutOfBoundsException(start);
		}
	}

	/**
	 * Copies a range of characters.
	 *
	 * @param start
	 *          the offset of the first character
	 * @param end
	 *          the offset one past the last character
	 * @return a String containing the characters from start to end - 1
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code start < 0, start > end} or {@code end > length()}
	 */
	public String substring(int start, int end) {
		int len = lengthInternal();

		if (start == 0 && end == len) {
			return this;
		}

		if (0 <= start && start <= end && end <= len) {
			boolean isCompressed = false;
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				isCompressed = true;
			}

			return new String(value, start, end - start, isCompressed, enableSharingInSubstringWhenOffsetIsZero);
		} else {
			throw new StringIndexOutOfBoundsException(start);
		}
	}

	/**
	 * Copies the characters in this String to a character array.
	 *
	 * @return a character array containing the characters of this String
	 */
	public char[] toCharArray() {
		int len = lengthInternal();

		char[] buffer = new char[len];

		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			decompress(value, 0, buffer, 0, len);
		} else {
			decompressedArrayCopy(value, 0, buffer, 0, len);
		}

		return buffer;
	}

	/**
	 * Converts the characters in this String to lowercase, using the default Locale. To convert to lower case independent of any locale, use
	 * toLowerCase(Locale.ROOT).
	 *
	 * @return a new String containing the lowercase characters equivalent to the characters in this String
	 */
	public String toLowerCase() {
		return toLowerCase(Locale.getDefault());
	}

	private static int toLowerCase(int codePoint) {
		if (codePoint < 128) {
			if ('A' <= codePoint && codePoint <= 'Z') {
				return codePoint + ('a' - 'A');
			} else {
				return codePoint;
			}
		} else {
			return Character.toLowerCase(codePoint);
		}
	}

	private static int toUpperCase(int codePoint) {
		if (codePoint < 128) {
			if ('a' <= codePoint && codePoint <= 'z') {
				return codePoint - ('a' - 'A');
			} else {
				return codePoint;
			}
		} else {
			return Character.toUpperCase(codePoint);
		}
	}

	/**
	 * Converts the characters in this String to lowercase, using the specified Locale.
	 *
	 * @param locale
	 *          the Locale
	 * @return a String containing the lowercase characters equivalent to the characters in this String
	 */
	public String toLowerCase(Locale locale) {
		// check locale for null
		String language = locale.getLanguage();
		int sLength = lengthInternal();

		if (sLength == 0) {
			return this;
		}

		boolean useIntrinsic = helpers.supportsIntrinsicCaseConversion()
				&& (language == "en") //$NON-NLS-1$
				&& (sLength <= (Integer.MAX_VALUE / 2));

		if (enableCompression && ((null == compressionFlag) || (coder == LATIN1))) {
			if (useIntrinsic) {
				byte[] output = new byte[sLength << coder];

				if (helpers.toLowerIntrinsicLatin1(value, output, sLength)) {
					return new String(output, LATIN1);
				}
			}
			return StringLatin1.toLowerCase(this, value, locale);
		} else {
			if (useIntrinsic) {
				byte[] output = new byte[sLength << coder];

				if (helpers.toLowerIntrinsicUTF16(value, output, sLength * 2)) {
					return new String(output, UTF16);
				}
			}
			return StringUTF16.toLowerCase(this, value, locale);
		}
	}

	/**
	 * Answers a string containing a concise, human-readable description of the receiver.
	 *
	 * @return this String
	 */
	public String toString() {
		return this;
	}

	/**
	 * Converts the characters in this String to uppercase, using the default Locale. To convert to upper case independent of any locale, use
	 * toUpperCase(Locale.ROOT).
	 *
	 * @return a String containing the uppercase characters equivalent to the characters in this String
	 */
	public String toUpperCase() {
		return toUpperCase(Locale.getDefault());
	}

	/**
	 * Converts the characters in this String to uppercase, using the specified Locale.
	 *
	 * @param locale
	 *          the Locale
	 * @return a String containing the uppercase characters equivalent to the characters in this String
	 */
	public String toUpperCase(Locale locale) {
		String language = locale.getLanguage();
		int sLength = lengthInternal();

		if (sLength == 0) {
			return this;
		}

		boolean useIntrinsic = helpers.supportsIntrinsicCaseConversion()
				&& (language == "en") //$NON-NLS-1$
				&& (sLength <= (Integer.MAX_VALUE / 2));

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			if (useIntrinsic) {
				byte[] output = new byte[sLength << coder];

				if (helpers.toUpperIntrinsicLatin1(value, output, sLength)) {
					return new String(output, LATIN1);
				}
			}
			return StringLatin1.toUpperCase(this, value, locale);
		} else {
			if (useIntrinsic) {
				byte[] output = new byte[sLength << coder];

				if (helpers.toUpperIntrinsicUTF16(value, output, sLength * 2)) {
					return new String(output, UTF16);
				}
			}
			return StringUTF16.toUpperCase(this, value, locale);
		}
	}

	/**
	 * Removes white space characters from the beginning and end of the string.
	 *
	 * @return a String with characters {@code <= \\u0020} removed from the beginning and the end
	 */
	public String trim() {
		int start = 0;
		int last = lengthInternal() - 1;
		int end = last;

		// Check if the String is compressed
		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			while ((start <= end) && (helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, start)) <= ' ')) {
				start++;
			}

			while ((end >= start) && (helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, end)) <= ' ')) {
				end--;
			}

			if (start == 0 && end == last) {
				return this;
			} else {
				return new String(value, start, end - start + 1, true);
			}
		} else {
			while ((start <= end) && (charAtInternal(start) <= ' ')) {
				start++;
			}

			while ((end >= start) && (charAtInternal(end) <= ' ')) {
				end--;
			}

			if (start == 0 && end == last) {
				return this;
			} else {
				return new String(value, start, end - start + 1, false);
			}
		}
	}

	/**
	 * Returns a String containing the characters in the specified character array. Modifying the character array after creating the String has no
	 * effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 * @return the String
	 *
	 * @throws NullPointerException
	 *          when data is null
	 */
	public static String valueOf(char[] data) {
		return new String(data, 0, data.length);
	}

	/**
	 * Returns a String containing the specified characters in the character array. Modifying the character array after creating the String has no
	 * effect on the String.
	 *
	 * @param data
	 *          the array of characters
	 * @param start
	 *          the starting offset in the character array
	 * @param length
	 *          the number of characters to use
	 * @return the String
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          when data is null
	 */
	public static String valueOf(char[] data, int start, int length) {
		return new String(data, start, length);
	}

	/**
	 * Converts the specified character to its string representation.
	 *
	 * @param value
	 *          the character
	 * @return the character converted to a string
	 */
	public static String valueOf(char value) {
		String string;

		if (value <= 255) {
			if (enableCompression) {
				string = new String(compressedAsciiTable[value], 0, 1, true);
			} else {
				string = new String(decompressedAsciiTable[value], 0, 1, false);
			}
		} else {
			byte[] buffer = new byte[2];

			helpers.putCharInArrayByIndex(buffer, 0, value);

			string = new String(buffer, 0, 1, false);
		}

		return string;
	}

	/**
	 * Converts the specified double to its string representation.
	 *
	 * @param value
	 *          the double
	 * @return the double converted to a string
	 */
	public static String valueOf(double value) {
		return Double.toString(value);
	}

	/**
	 * Converts the specified float to its string representation.
	 *
	 * @param value
	 *          the float
	 * @return the float converted to a string
	 */
	public static String valueOf(float value) {
		return Float.toString(value);
	}

	/**
	 * Converts the specified integer to its string representation.
	 *
	 * @param value
	 *          the integer
	 * @return the integer converted to a string
	 */
	public static String valueOf(int value) {
		return Integer.toString(value);
	}

	/**
	 * Converts the specified long to its string representation.
	 *
	 * @param value
	 *          the long
	 * @return the long converted to a string
	 */
	public static String valueOf(long value) {
		return Long.toString(value);
	}

	/**
	 * Converts the specified object to its string representation. If the object is null answer the string {@code "null"}, otherwise use
	 * {@code toString()} to get the string representation.
	 *
	 * @param value
	 *          the object
	 * @return the object converted to a string
	 */
	public static String valueOf(Object value) {
		return value != null ? value.toString() : "null"; //$NON-NLS-1$
	}

	/**
	 * Converts the specified boolean to its string representation. When the boolean is true answer {@code "true"}, otherwise answer
	 * {@code "false"}.
	 *
	 * @param value
	 *          the boolean
	 * @return the boolean converted to a string
	 */
	public static String valueOf(boolean value) {
		return value ? "true" : "false"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Answers whether the characters in the StringBuffer buffer are the same as those in this String.
	 *
	 * @param buffer
	 *          the StringBuffer to compare this String to
	 * @return true when the characters in buffer are identical to those in this String. If they are not, false will be returned.
	 *
	 * @throws NullPointerException
	 *          when buffer is null
	 *
	 * @since 1.4
	 */
	public boolean contentEquals(StringBuffer buffer) {
		synchronized (buffer) {
			int s1Length = lengthInternal();
			int sbLength = buffer.length();

			if (s1Length != sbLength) {
				return false;
			}

			byte[] s1Value = value;
			byte[] sbValue = buffer.getValue();

			if (coder == buffer.getCoder()) {
				for (int i = 0; i < s1Value.length; ++i) {
					if (s1Value[i] != sbValue[i]) {
						return false;
					}
				}

				return true;
			}

			// String objects are always compressed if compression is possible, thus if the buffer is compressed and the
			// String object is not it is impossible for their contents to equal
			if (coder == UTF16) {
				return false;
			}

			// Otherwise we have a LATIN1 String and a UTF16 StringBuffer
			return StringUTF16.contentEquals(s1Value, sbValue, s1Length);
		}
	}

	/**
	 * Determines whether a this String matches a given regular expression.
	 *
	 * @param expr
	 *          the regular expression to be matched
	 * @return true if the expression matches, otherwise false
	 *
	 * @throws PatternSyntaxException
	 *          if the syntax of the supplied regular expression is not valid
	 * @throws NullPointerException
	 *          if expr is null
	 *
	 * @since 1.4
	 */
	public boolean matches(String expr) {
		return Pattern.matches(expr, this);
	}

	/**
	 * Replace any substrings within this String that match the supplied regular expression expr, with the String substitute.
	 *
	 * @param regex
	 *          the regular expression to match
	 * @param substitute
	 *          the string to replace the matching substring with
	 * @return the new string
	 *
	 * @throws NullPointerException
	 *          if expr is null
	 *
	 * @since 1.4
	 */
	public String replaceAll(String regex, String substitute) {
		// this is a fast path to handle replacements of 1 character with another or the deletion of
		// a single character (common operations when dealing with things like package names, file
		// system paths etc). In these simple cases a linear scan of the string is all that is necessary
		// and we can avoid the cost of building a full regex pattern matcher
		if (regex != null && substitute != null && regex.lengthInternal() == 1 && !hasMetaChars(regex)) {
			int substituteLength = substitute.lengthInternal();
			int length = lengthInternal();
			if (substituteLength < 2) {
				if (enableCompression && isCompressed() && (substituteLength == 0 || substitute.isCompressed())) {
					byte[] newChars = new byte[length];
					byte toReplace = helpers.getByteFromArrayByIndex(regex.value, 0);
					byte replacement = (byte)-1;  // assign dummy value that will never be used
					if (substituteLength == 1) {
						replacement = helpers.getByteFromArrayByIndex(substitute.value, 0);
						checkLastChar((char)replacement);
					}
					int newCharIndex = 0;
					for (int i = 0; i < length; ++i) {
						byte current = helpers.getByteFromArrayByIndex(value, i);
						if (current != toReplace) {
							helpers.putByteInArrayByIndex(newChars, newCharIndex++, current);
						} else if (substituteLength == 1) {
							helpers.putByteInArrayByIndex(newChars, newCharIndex++, replacement);
						}
					}
					return new String(newChars, 0, newCharIndex, true);
				} else if (!enableCompression || !isCompressed()) {
					byte[] newChars = StringUTF16.newBytesFor(length);
					char toReplace = regex.charAtInternal(0);
					char replacement = (char)-1; // assign dummy value that will never be used
					if (substituteLength == 1) {
						replacement = substitute.charAtInternal(0);
						checkLastChar(replacement);
					}
					int newCharIndex = 0;
					for (int i = 0; i < length; ++i) {
						char current = helpers.getCharFromArrayByIndex(value, i);
						if (current != toReplace) {
							helpers.putCharInArrayByIndex(newChars, newCharIndex++, current);
						} else if (substituteLength == 1) {
							helpers.putCharInArrayByIndex(newChars, newCharIndex++, replacement);
						}
					}
					return new String(newChars, 0, newCharIndex, false);
				}
			}
		}
		return Pattern.compile(regex).matcher(this).replaceAll(substitute);
	}

	/**
	 * Replace any substrings within this String that match the supplied regular expression expr, with the String substitute.
	 *
	 * @param expr
	 *          the regular expression to match
	 * @param substitute
	 *          the string to replace the matching substring with
	 * @return the new string
	 *
	 * @throws NullPointerException
	 *          if expr is null
	 *
	 * @since 1.4
	 */
	public String replaceFirst(String expr, String substitute) {
		return Pattern.compile(expr).matcher(this).replaceFirst(substitute);
	}

	/**
	 * Splits this string around matches of the given regular expression. Calling this method is same as calling split(regex,0). Therefore, empty
	 * string(s) at the end of the returned array will be discarded.
	 *
	 *
	 * @param regex
	 *          Regular expression that is used as a delimiter
	 * @return The array of strings which are split around the regex
	 *
	 * @throws PatternSyntaxException
	 *          if the syntax of regex is invalid
	 *
	 * @since 1.4
	 */
	public String[] split(String regex) {
		return split(regex, 0);
	}

	private static final char[] regexMetaChars = new char[]
		{ '.', '$', '|', '(', ')', '[', ']', '{', '}', '^', '?', '*', '+', '\\' };

	private static final boolean hasMetaChars(String s) {
		for (int i = 0; i < s.lengthInternal(); ++i) {
			char ch = s.charAtInternal(i);

			// Note the surrogate ranges are HIGH: \uD800-\uDBFF; LOW: \uDC00-\uDFFF
			// this check is, therefore, equivalent to returning true if the character
			// falls anywhere in this range including the range between MAX_LOW_SURROGATE
			// and MIN_HIGH_SURROGATE which happen to be adjacent
			if (ch >= Character.MIN_HIGH_SURROGATE
					&& ch <= Character.MAX_LOW_SURROGATE) { return true; }

			for (int j = 0; j < regexMetaChars.length; ++j) {
				if (ch == regexMetaChars[j]) { return true; }
			}
		}
		return false;
	}

	private static final boolean isSingleEscapeLiteral(String s) {
		if ((s != null) && (s.lengthInternal() == 2) && (s.charAtInternal(0) == '\\')) {
			char literal = s.charAtInternal(1);
			for (int j = 0; j < regexMetaChars.length; ++j) {
				if (literal == regexMetaChars[j]) return true;
			}
		}
		return false;
	}

	/**
	 * Splits this String using the given regular expression.
	 *
	 * max controls the number of times the regex is applied to this string.
	 * If max is positive, then regex can be applied to this String max-1 times.
	 * The returned array size can not be bigger than max, and the last element of
	 * the returned array contains all input after the last match of the regex.
	 * If max is negative or zero, then regex can be applied to this string as many times as
	 * possible and there is no size limit in the returned array.
	 * If max is 0, all the empty string(s) at the end of the returned array will be discarded.
	 *
	 * @param regex Regular expression that is used as a delimiter
	 * @param max The threshold of the returned array
	 * @return The array of strings which are split around the regex
	 *
	 * @throws PatternSyntaxException if the syntax of regex is invalid
	 *
	 * @since 1.4
	 */
	public String[] split(String regex, int max) {
		// it is faster to handle simple splits inline (i.e. no fancy regex matching),
		// including single escaped literal character (e.g. \. \{),
		// so we test for a suitable string and handle this here if we can
		boolean singleEscapeLiteral = isSingleEscapeLiteral(regex);
		if ((regex != null) && (regex.lengthInternal() > 0) && (!hasMetaChars(regex) || singleEscapeLiteral)) {
			if (max == 1) {
				return new String[] { this };
			}
			java.util.ArrayList<String> parts = new java.util.ArrayList<String>((max > 0 && max < 100) ? max : 10);

			byte[] chars = this.value;

			final boolean compressed = enableCompression && (null == compressionFlag || coder == LATIN1);

			int start = 0, current = 0, end = lengthInternal();
			if (regex.lengthInternal() == 1 || singleEscapeLiteral) {
				// if matching single escaped character, use the second char.
				char splitChar = regex.charAtInternal(singleEscapeLiteral ? 1 : 0);
				while (current < end) {
					if (charAtInternal(current, chars) == splitChar) {
						parts.add(new String(chars, start, current - start, compressed));
						start = current + 1;
						if (max > 0 && parts.size() == max - 1) {
							parts.add(new String(chars, start, end - start, compressed));
							break;
						}
					}
					current = current + 1;
				}
			} else {
				int rLength = regex.lengthInternal();

				byte[] splitChars = regex.value;

				char firstChar = charAtInternal(0, regex.value);
				while (current < end) {
					if (charAtInternal(current, chars) == firstChar) {
						int idx = current + 1;
						int matchIdx = 1;
						while (matchIdx < rLength && idx < end) {
							if (charAtInternal(idx, chars) != charAtInternal(matchIdx, splitChars)) {
								break;
							}
							matchIdx++;
							idx++;
						}
						if (matchIdx == rLength) {
							parts.add(new String(chars, start, current - start, compressed));
							start = current + rLength;
							if (max > 0 && parts.size() == max - 1) {
								parts.add(new String(chars, start, end - start, compressed));
								break;
							}
							current = current + rLength;
							continue;
						}
					}
					current = current + 1;
				}
			}
			if (parts.size() == 0) {
				return new String[] { this };
			} else if (start <= current && parts.size() != max) {
				parts.add(new String(chars, start, current - start, compressed));
			}
			if (max == 0) {
				end = parts.size();
				while (end > 0 && parts.get(end - 1).lengthInternal() == 0) {
					end -= 1;
					parts.remove(end);
				}
			}
			return parts.toArray(new String[parts.size()]);
		}
		return Pattern.compile(regex).split(this, max);
	}

	/**
	 * Has the same result as the substring function, but is present so that String may implement the CharSequence interface.
	 *
	 * @param start
	 *          the offset the first character
	 * @param end
	 *          the offset of one past the last character to include
	 *
	 * @return the subsequence requested
	 *
	 * @throws IndexOutOfBoundsException
	 *          when start or end is less than zero, start is greater than end, or end is greater than the length of the String.
	 *
	 * @see java.lang.CharSequence#subSequence(int, int)
	 *
	 * @since 1.4
	 */
	public CharSequence subSequence(int start, int end) {
		return substring(start, end);
	}

	/**
	 * @param data
	 *          the byte array to convert to a String
	 * @param start
	 *          the starting offset in the byte array
	 * @param length
	 *          the number of bytes to convert
	 *
	 * @since 1.5
	 */
	public String(int[] data, int start, int length) {
		if (start >= 0 && 0 <= length && length <= data.length - start) {
			if (enableCompression) {
				byte[] bytes = StringLatin1.toBytes(data, start, length);

				if (bytes != null) {
					value = bytes;
					coder = LATIN1;
				} else {
					bytes = StringUTF16.toBytes(data, start, length);

					value = bytes;
					coder = UTF16;

					initCompressionFlag();
				}
			} else {
				byte[] bytes = StringUTF16.toBytes(data, start, length);

				value = bytes;
				coder = UTF16;
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Creates a string from the contents of a StringBuilder.
	 *
	 * @param builder
	 *          the StringBuilder
	 *
	 * @since 1.5
	 */
	public String(StringBuilder builder) {
		this(builder.toString());
	}

	/**
	 * Returns the Unicode character at the given point.
	 *
	 * @param index
	 *          the character index
	 * @return the Unicode character value at the index
	 *
	 * @since 1.5
	 */
	public int codePointAt(int index) {
		int len = lengthInternal();

		if (index >= 0 && index < len) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				return helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, index));
			} else {
				char high = charAtInternal(index);

				if ((index < (len - 1)) && Character.isHighSurrogate(high)) {
					char low = charAtInternal(index + 1);

					if (Character.isLowSurrogate(low)) {
						return Character.toCodePoint(high, low);
					}
				}

				return high;
			}
		} else {
			throw new StringIndexOutOfBoundsException(index);
		}
	}

	/**
	 * Returns the Unicode character before the given point.
	 *
	 * @param index
	 *          the character index
	 * @return the Unicode character value before the index
	 *
	 * @since 1.5
	 */
	public int codePointBefore(int index) {
		int len = lengthInternal();

		if (index > 0 && index <= len) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				return helpers.byteToCharUnsigned(helpers.getByteFromArrayByIndex(value, index - 1));
			} else {
				char low = charAtInternal(index - 1);

				if ((index > 1) && Character.isLowSurrogate(low)) {
					char high = charAtInternal(index - 2);

					if (Character.isHighSurrogate(high)) {
						return Character.toCodePoint(high, low);
					}
				}

				return low;
			}
		} else {
			throw new StringIndexOutOfBoundsException(index);
		}
	}

	/**
	 * Returns the total Unicode values in the specified range.
	 *
	 * @param start
	 *          first index
	 * @param end
	 *          last index
	 * @return the total Unicode values
	 *
	 * @since 1.5
	 */
	public int codePointCount(int start, int end) {
		int len = lengthInternal();

		if (start >= 0 && start <= end && end <= len) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				return end - start;
			} else {
				int count = 0;

				for (int i = start; i < end; ++i) {
					if ((i < (end - 1))
							&& Character.isHighSurrogate(charAtInternal(i))
							&& Character.isLowSurrogate(charAtInternal(i + 1))) {
						++i;
					}

					++count;
				}

				return count;
			}
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the index of the code point that was offset by codePointCount.
	 *
	 * @param start
	 *          the position to offset
	 * @param codePointCount
	 *          the code point count
	 * @return the offset index
	 *
	 * @since 1.5
	 */
	public int offsetByCodePoints(int start, int codePointCount) {
		int len = lengthInternal();

		if (start >= 0 && start <= len) {
			// Check if the String is compressed
			if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
				int index = start + codePointCount;

				if (index > len) {
					throw new IndexOutOfBoundsException();
				} else {
					return index;
				}
			} else {
				int index = start;

				if (codePointCount == 0) {
					return start;
				} else if (codePointCount > 0) {
					for (int i = 0; i < codePointCount; ++i) {
						if (index == len) {
							throw new IndexOutOfBoundsException();
						}

						if ((index < (len - 1))
								&& Character.isHighSurrogate(charAtInternal(index))
								&& Character.isLowSurrogate(charAtInternal(index + 1))) {
							index++;
						}

						index++;
					}
				} else {
					for (int i = codePointCount; i < 0; ++i) {
						if (index < 1) {
							throw new IndexOutOfBoundsException();
						}

						if ((index > 1)
								&& Character.isLowSurrogate(charAtInternal(index - 1))
								&& Character.isHighSurrogate(charAtInternal(index - 2))) {
							index--;
						}

						index--;
					}
				}

				return index;
			}
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Compares the content of the character sequence to this String
	 *
	 * @param sequence
	 *          the character sequence
	 * @return {@code true} if the content of this String is equal to the character sequence, {@code false} otherwise.
	 *
	 * @since 1.5
	 */
	public boolean contentEquals(CharSequence sequence) {
		int len = lengthInternal();

		if (len != sequence.length()) {
			return false;
		}

		for (int i = 0; i < len; ++i) {
			if (charAtInternal(i) != sequence.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * @param sequence
	 *          the sequence to compare to
	 * @return {@code true} if this String contains the sequence, {@code false} otherwise.
	 *
	 * @since 1.5
	 */
	public boolean contains(CharSequence sequence) {
		int len = lengthInternal();

		int sequencelen = sequence.length();

		if (sequencelen > len) {
			return false;
		}

		int start = 0;

		if (sequencelen > 0) {
			if (sequencelen + start > len) {
				return false;
			}

			char charAt0 = sequence.charAt(0);

			while (true) {
				int i = indexOf(charAt0, start);

				if (i == -1 || sequencelen + i > len) {
					return false;
				}

				int o1 = i;
				int o2 = 0;

				while (++o2 < sequencelen && charAtInternal(++o1) == sequence.charAt(o2))
					;

				if (o2 == sequencelen) {
					return true;
				}

				start = i + 1;
			}
		} else {
			return true;
		}
	}

	/**
	 * @param sequence1
	 *          the old character sequence
	 * @param sequence2
	 *          the new character sequence
	 * @return the new String
	 *
	 * @since 1.5
	 */
	public String replace(CharSequence sequence1, CharSequence sequence2) {
		if (sequence2 == null) {
			throw new NullPointerException();
		}

		int len = lengthInternal();

		int sequence1len = sequence1.length();

		if (sequence1len == 0) {
			int sequence2len = sequence2.length();

			if ((sequence2len != 0) && (len >= ((Integer.MAX_VALUE - len) / sequence2len))) {
				// K0D01 = Array capacity exceeded
				throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
			}

			StringBuilder builder = new StringBuilder(len + ((len + 1) * sequence2len));

			builder.append(sequence2);

			for (int i = 0; i < len; ++i) {
				builder.append(charAt(i)).append(sequence2);
			}

			return builder.toString();
		} else {
			StringBuilder builder = new StringBuilder();

			int start = 0;
			int copyStart = 0;

			char charAt0 = sequence1.charAt(0);

			while (start < len) {
				int firstIndex = indexOf(charAt0, start);

				if (firstIndex == -1) {
					break;
				}

				boolean found = true;

				if (sequence1len > 1) {
					if (sequence1len > len - firstIndex) {
						/* the tail of this string is too short to find sequence1 */
						break;
					}

					for (int i = 1; i < sequence1len; i++) {
						if (charAt(firstIndex + i) != sequence1.charAt(i)) {
							found = false;
							break;
						}
					}
				}

				if (found) {
					builder.append(substring(copyStart, firstIndex)).append(sequence2);

					copyStart = start = firstIndex + sequence1len;
				} else {
					start = firstIndex + 1;
				}
			}

			if (builder.length() == 0 && copyStart == 0) {
				return this;
			}

			builder.append(substring(copyStart));

			return builder.toString();
		}
	}

	/**
	 * Format the receiver using the specified format and args.
	 *
	 * @param format
	 *          the format to use
	 * @param args
	 *          the format arguments to use
	 *
	 * @return the formatted result
	 *
	 * @see java.util.Formatter#format(String, Object...)
	 */
	public static String format(String format, Object... args) {
		return new Formatter().format(format, args).toString();
	}

	/**
	 * Format the receiver using the specified local, format and args.
	 *
	 * @param locale
	 *          the locale used to create the Formatter, may be null
	 * @param format
	 *          the format to use
	 * @param args
	 *          the format arguments to use
	 *
	 * @return the formatted result
	 *
	 * @see java.util.Formatter#format(String, Object...)
	 */
	public static String format(Locale locale, String format, Object... args) {
		return new Formatter(locale).format(format, args).toString();
	}

	private static final java.io.ObjectStreamField[] serialPersistentFields = {};

	/**
	 * Answers if this String has no characters, a length of zero.
	 *
	 * @return true if this String has no characters, false otherwise
	 *
	 * @since 1.6
	 *
	 * @see #length
	 */
	public boolean isEmpty() {
		return lengthInternal() == 0;
	}

	/**
	 * Converts the byte array to a String using the specified Charset.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param charset
	 *          the Charset to use
	 *
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @since 1.6
	 *
	 * @see #String(byte[], int, int, Charset)
	 * @see #getBytes(Charset)
	 */
	public String(byte[] data, Charset charset) {
		this(data, 0, data.length, charset);
	}

	/**
	 * Converts the byte array to a String using the specified Charset.
	 *
	 * @param data
	 *          the byte array to convert to a String
	 * @param start
	 *          the starting offset in the byte array
	 * @param length
	 *          the number of bytes to convert
	 * @param charset
	 *          the Charset to use
	 *
	 * @throws IndexOutOfBoundsException
	 *          when {@code length < 0, start < 0} or {@code start + length > data.length}
	 * @throws NullPointerException
	 *          when data is null
	 *
	 * @since 1.6
	 *
	 * @see #String(byte[], Charset)
	 * @see #getBytes(Charset)
	 */
	public String(byte[] data, int start, int length, Charset charset) {
		if (charset == null) {
			throw new NullPointerException();
		}

		if (start >= 0 && 0 <= length && length <= data.length - start) {
			StringCoding.Result scResult = StringCoding.decode(charset, data, start, length);

			value = scResult.value;
			coder = scResult.coder;

			if (enableCompression) {
				initCompressionFlag();
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	/**
	 * Converts this String to a byte encoding using the specified Charset.
	 *
	 * @param charset
	 *          the Charset to use
	 * @return the byte array encoding of this String
	 *
	 * @since 1.6
	 */
	public byte[] getBytes(Charset charset) {
		return StringCoding.encode(charset, coder, value);
	}

	/**
	 * Creates a new String by putting each element together joined by the delimiter. If an element is null, then "null" is used as string to join.
	 *
	 * @param delimiter
	 *          Used as joiner to put elements together
	 * @param elements
	 *          Elements to be joined
	 * @return string of joined elements by delimiter
	 * @throws NullPointerException
	 *          if one of the arguments is null
	 *
	 */
	public static String join(CharSequence delimiter, CharSequence... elements) {
		StringJoiner stringJoiner = new StringJoiner(delimiter);

		for (CharSequence element : elements) {
			stringJoiner.add(element);
		}

		return stringJoiner.toString();
	}

	/**
	 * Creates a new String by putting each element together joined by the delimiter. If an element is null, then "null" is used as string to join.
	 *
	 * @param delimiter
	 *          Used as joiner to put elements together
	 * @param elements
	 *          Elements to be joined
	 * @return string of joined elements by delimiter
	 * @throws NullPointerException
	 *          if one of the arguments is null
	 *
	 */
	public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
		StringJoiner stringJoiner = new StringJoiner(delimiter);

		Iterator<? extends CharSequence> elementsIterator = elements.iterator();

		while (elementsIterator.hasNext()) {
			stringJoiner.add(elementsIterator.next());
		}

		return stringJoiner.toString();
	}

	static void checkBoundsBeginEnd(int begin, int end, int length) {
		if ((begin >= 0) && (begin <= end) && (end <= length)) {
			return;
		}
		throw newStringIndexOutOfBoundsException(begin, end, length);
	}

	@Override
	public IntStream chars() {
		Spliterator.OfInt spliterator;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			spliterator = new StringLatin1.CharsSpliterator(value, Spliterator.IMMUTABLE);
		} else {
			spliterator = new StringUTF16.CharsSpliterator(value, Spliterator.IMMUTABLE);
		}

		return StreamSupport.intStream(spliterator, false);
	}

	@Override
	public IntStream codePoints() {
		Spliterator.OfInt spliterator;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			spliterator = new StringLatin1.CharsSpliterator(value, Spliterator.IMMUTABLE);
		} else {
			spliterator = new StringUTF16.CodePointsSpliterator(value, Spliterator.IMMUTABLE);
		}

		return StreamSupport.intStream(spliterator, false);
	}

	/*
	 * Internal API, assuming no modification to the byte array returned.
	 */
	byte[] value() {
		return value;
	}

	/**
	 * Returns a string object containing the character (Unicode code point)
	 * specified.
	 *
	 * @param codePoint
	 *          a Unicode code point.
	 * @return a string containing the character (Unicode code point) supplied.
	 * @throws IllegalArgumentException
	 *          if the codePoint is not a valid Unicode code point.
	 * @since 11
	 */
	static String valueOfCodePoint(int codePoint) {
		String string;
		if ((codePoint < Character.MIN_CODE_POINT) || (codePoint > Character.MAX_CODE_POINT)) {
			// K0800 = Invalid Unicode code point - {0}
			throw new IllegalArgumentException(com.ibm.oti.util.Msg.getString("K0800", Integer.toString(codePoint)));   //$NON-NLS-1$
		} else if (codePoint <= 255) {
			if (enableCompression) {
				string = new String(compressedAsciiTable[codePoint], LATIN1);
			} else {
				string = new String(decompressedAsciiTable[codePoint], UTF16);
			}
		} else if (codePoint < Character.MIN_SUPPLEMENTARY_CODE_POINT) {
			byte[] buffer = new byte[2];
			helpers.putCharInArrayByIndex(buffer, 0, (char) codePoint);
			string = new String(buffer, UTF16);
		} else {
			byte[] buffer = new byte[4];
			helpers.putCharInArrayByIndex(buffer, 0, Character.highSurrogate(codePoint));
			helpers.putCharInArrayByIndex(buffer, 1, Character.lowSurrogate(codePoint));
			string = new String(buffer, UTF16);
		}
		return string;
	}

	/**
	 * Returns a string whose value is the concatenation of this string repeated
	 * count times.
	 *
	 * @param count
	 *          a positive integer indicating the number of times to be repeated
	 * @return a string whose value is the concatenation of this string repeated count times
	 * @throws IllegalArgumentException
	 *          if the count is negative
	 * @since 11
	 */
	public String repeat(int count) {
		if (count < 0) {
			throw new IllegalArgumentException();
		} else if (count == 0 || isEmpty()) {
			return ""; //$NON-NLS-1$
		} else if (count == 1) {
			return this;
		}

		int length = lengthInternal();
		if (length > Integer.MAX_VALUE / count) {
			// K0D01 = Array capacity exceeded
			throw new OutOfMemoryError(com.ibm.oti.util.Msg.getString("K0D01")); //$NON-NLS-1$
		}
		int repeatlen = length * count;

		if (enableCompression && (null == compressionFlag || coder == LATIN1)) {
			byte[] buffer = new byte[repeatlen];

			for (int i = 0; i < count; i++) {
				compressedArrayCopy(value, 0, buffer, i * length, length);
			}

			return new String(buffer, LATIN1);
		} else {
			byte[] buffer = StringUTF16.newBytesFor(repeatlen);

			for (int i = 0; i < count; i++) {
				decompressedArrayCopy(value, 0, buffer, i * length, length);
			}

			return new String(buffer, UTF16);
		}
	}

}
