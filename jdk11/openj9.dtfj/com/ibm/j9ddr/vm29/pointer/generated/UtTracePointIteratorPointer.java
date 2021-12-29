/*******************************************************************************
 * Copyright (c) 1991, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution
 * and is available at https://www.apache.org/licenses/LICENSE-2.0.
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
 *  SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

/**
 * WARNING!!! GENERATED FILE
 *
 * This class is generated.
 * Do not use the Eclipse "Organize Imports" feature on this class.
 *
 * It can contain user content, but that content must be delimited with the
 * the tags
 * [BEGIN USER IMPORTS]
 * [END USER IMPORTS]
 *
 * or
 *
 * [BEGIN USER CODE]
 * [END USER CODE]
 *
 * These tags are entered as comments.  Characters before [ and after ] are ignored.
 * Lines between the tags are inserted into the newly generated file.
 *
 * IMPORTS are combined and inserted above newly generated imports.  CODE is combined
 * and inserted immediately after the class declaration
 *
 * All lines outside these tags are lost and replaced with newly generated code.
 */
package com.ibm.j9ddr.vm29.pointer.generated;

/*[BEGIN USER IMPORTS]*/
/*[END USER IMPORTS]*/

import com.ibm.j9ddr.CorruptDataException;
import com.ibm.j9ddr.vm29.pointer.*;
import com.ibm.j9ddr.vm29.structure.*;
import com.ibm.j9ddr.vm29.types.*;

/**
 * Structure: UtTracePointIteratorPointer
 *
 * A generated implementation of a VM structure
 *
 * This class contains generated code and MAY contain hand written user code.
 *
 * Hand written user code must be contained at the top of
 * the class file, specifically above
 * the comment line containing WARNING!!! GENERATED CODE
 *
 * ALL code below the GENERATED warning will be replaced with new generated code
 * each time the PointerGenerator utility is run.
 *
 * The generated code will provide getters for all elements in the UtTracePointIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTracePointIterator.class)
public class UtTracePointIteratorPointer extends StructurePointer {

	// NULL
	public static final UtTracePointIteratorPointer NULL = new UtTracePointIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTracePointIteratorPointer(long address) {
		super(address);
	}

	public static UtTracePointIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTracePointIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTracePointIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTracePointIteratorPointer(address);
	}

	public UtTracePointIteratorPointer add(long count) {
		return UtTracePointIteratorPointer.cast(address + (UtTracePointIterator.SIZEOF * count));
	}

	public UtTracePointIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTracePointIteratorPointer addOffset(long offset) {
		return UtTracePointIteratorPointer.cast(address + offset);
	}

	public UtTracePointIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTracePointIteratorPointer sub(long count) {
		return UtTracePointIteratorPointer.cast(address - (UtTracePointIterator.SIZEOF * count));
	}

	public UtTracePointIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTracePointIteratorPointer subOffset(long offset) {
		return UtTracePointIteratorPointer.cast(address - offset);
	}

	public UtTracePointIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTracePointIteratorPointer untag(long mask) {
		return UtTracePointIteratorPointer.cast(address & ~mask);
	}

	public UtTracePointIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTracePointIterator.SIZEOF;
	}

	// Implementation methods

	// UtTraceBuffer* buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer buffer() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtTracePointIterator._bufferOffset_));
	}

	// UtTraceBuffer* buffer
	public PointerPointer bufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTracePointIterator._bufferOffset_));
	}

	// U32 currentPos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentPosOffset_", declaredType="U32")
	public UDATA currentPos() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._currentPosOffset_));
	}

	// U32 currentPos
	public UDATAPointer currentPosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._currentPosOffset_));
	}

	// U64 currentUpperTimeWord
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentUpperTimeWordOffset_", declaredType="U64")
	public UDATA currentUpperTimeWord() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._currentUpperTimeWordOffset_));
	}

	// U64 currentUpperTimeWord
	public UDATAPointer currentUpperTimeWordEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._currentUpperTimeWordOffset_));
	}

	// U32 dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataLengthOffset_", declaredType="U32")
	public UDATA dataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._dataLengthOffset_));
	}

	// U32 dataLength
	public UDATAPointer dataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._dataLengthOffset_));
	}

	// U64 end
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endOffset_", declaredType="U64")
	public UDATA end() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._endOffset_));
	}

	// U64 end
	public UDATAPointer endEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._endOffset_));
	}

	// U64 endPlatform
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endPlatformOffset_", declaredType="U64")
	public UDATA endPlatform() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._endPlatformOffset_));
	}

	// U64 endPlatform
	public UDATAPointer endPlatformEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._endPlatformOffset_));
	}

	// U64 endSystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endSystemOffset_", declaredType="U64")
	public UDATA endSystem() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._endSystemOffset_));
	}

	// U64 endSystem
	public UDATAPointer endSystemEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._endSystemOffset_));
	}

	// FormatStringCallback getFormatStringFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFormatStringFnOffset_", declaredType="FormatStringCallback")
	public VoidPointer getFormatStringFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtTracePointIterator._getFormatStringFnOffset_));
	}

	// FormatStringCallback getFormatStringFn
	public PointerPointer getFormatStringFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTracePointIterator._getFormatStringFnOffset_));
	}

	// I32 isBigEndian
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isBigEndianOffset_", declaredType="I32")
	public IDATA isBigEndian() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTracePointIterator._isBigEndianOffset_));
	}

	// I32 isBigEndian
	public IDATAPointer isBigEndianEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._isBigEndianOffset_));
	}

	// I32 isCircularBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCircularBufferOffset_", declaredType="I32")
	public IDATA isCircularBuffer() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTracePointIterator._isCircularBufferOffset_));
	}

	// I32 isCircularBuffer
	public IDATAPointer isCircularBufferEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._isCircularBufferOffset_));
	}

	// I32 iteratorHasWrapped
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iteratorHasWrappedOffset_", declaredType="I32")
	public IDATA iteratorHasWrapped() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTracePointIterator._iteratorHasWrappedOffset_));
	}

	// I32 iteratorHasWrapped
	public IDATAPointer iteratorHasWrappedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._iteratorHasWrappedOffset_));
	}

	// U32 longTracePointLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longTracePointLengthOffset_", declaredType="U32")
	public UDATA longTracePointLength() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._longTracePointLengthOffset_));
	}

	// U32 longTracePointLength
	public UDATAPointer longTracePointLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._longTracePointLengthOffset_));
	}

	// U32 numberOfBytesInPlatformPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfBytesInPlatformPtrOffset_", declaredType="U32")
	public UDATA numberOfBytesInPlatformPtr() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._numberOfBytesInPlatformPtrOffset_));
	}

	// U32 numberOfBytesInPlatformPtr
	public UDATAPointer numberOfBytesInPlatformPtrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._numberOfBytesInPlatformPtrOffset_));
	}

	// U32 numberOfBytesInPlatformShort
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfBytesInPlatformShortOffset_", declaredType="U32")
	public UDATA numberOfBytesInPlatformShort() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._numberOfBytesInPlatformShortOffset_));
	}

	// U32 numberOfBytesInPlatformShort
	public UDATAPointer numberOfBytesInPlatformShortEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._numberOfBytesInPlatformShortOffset_));
	}

	// U32 numberOfBytesInPlatformUDATA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfBytesInPlatformUDATAOffset_", declaredType="U32")
	public UDATA numberOfBytesInPlatformUDATA() throws CorruptDataException {
		return new U32(getIntAtOffset(UtTracePointIterator._numberOfBytesInPlatformUDATAOffset_));
	}

	// U32 numberOfBytesInPlatformUDATA
	public UDATAPointer numberOfBytesInPlatformUDATAEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._numberOfBytesInPlatformUDATAOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(UtTracePointIterator._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTracePointIterator._portLibOffset_));
	}

	// I32 processingIncompleteDueToPartialTracePoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processingIncompleteDueToPartialTracePointOffset_", declaredType="I32")
	public IDATA processingIncompleteDueToPartialTracePoint() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTracePointIterator._processingIncompleteDueToPartialTracePointOffset_));
	}

	// I32 processingIncompleteDueToPartialTracePoint
	public IDATAPointer processingIncompleteDueToPartialTracePointEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._processingIncompleteDueToPartialTracePointOffset_));
	}

	// I32 recordLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_recordLengthOffset_", declaredType="I32")
	public IDATA recordLength() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTracePointIterator._recordLengthOffset_));
	}

	// I32 recordLength
	public IDATAPointer recordLengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._recordLengthOffset_));
	}

	// U64 start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startOffset_", declaredType="U64")
	public UDATA start() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._startOffset_));
	}

	// U64 start
	public UDATAPointer startEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._startOffset_));
	}

	// U64 startPlatform
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPlatformOffset_", declaredType="U64")
	public UDATA startPlatform() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._startPlatformOffset_));
	}

	// U64 startPlatform
	public UDATAPointer startPlatformEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._startPlatformOffset_));
	}

	// U64 startSystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startSystemOffset_", declaredType="U64")
	public UDATA startSystem() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._startSystemOffset_));
	}

	// U64 startSystem
	public UDATAPointer startSystemEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._startSystemOffset_));
	}

	// U8* tempBuffForWrappedTP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tempBuffForWrappedTPOffset_", declaredType="U8*")
	public U8Pointer tempBuffForWrappedTP() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtTracePointIterator._tempBuffForWrappedTPOffset_));
	}

	// U8* tempBuffForWrappedTP
	public PointerPointer tempBuffForWrappedTPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTracePointIterator._tempBuffForWrappedTPOffset_));
	}

	// U64 timeConversion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timeConversionOffset_", declaredType="U64")
	public UDATA timeConversion() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTracePointIterator._timeConversionOffset_));
	}

	// U64 timeConversion
	public UDATAPointer timeConversionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTracePointIterator._timeConversionOffset_));
	}

}
