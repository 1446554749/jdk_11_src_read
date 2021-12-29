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
 * Structure: ClassFileWriterPointer
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
 * The generated code will provide getters for all elements in the ClassFileWriterPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileWriter.class)
public class ClassFileWriterPointer extends StructurePointer {

	// NULL
	public static final ClassFileWriterPointer NULL = new ClassFileWriterPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileWriterPointer(long address) {
		super(address);
	}

	public static ClassFileWriterPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileWriterPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileWriterPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileWriterPointer(address);
	}

	public ClassFileWriterPointer add(long count) {
		return ClassFileWriterPointer.cast(address + (ClassFileWriter.SIZEOF * count));
	}

	public ClassFileWriterPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileWriterPointer addOffset(long offset) {
		return ClassFileWriterPointer.cast(address + offset);
	}

	public ClassFileWriterPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileWriterPointer sub(long count) {
		return ClassFileWriterPointer.cast(address - (ClassFileWriter.SIZEOF * count));
	}

	public ClassFileWriterPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileWriterPointer subOffset(long offset) {
		return ClassFileWriterPointer.cast(address - offset);
	}

	public ClassFileWriterPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileWriterPointer untag(long mask) {
		return ClassFileWriterPointer.cast(address & ~mask);
	}

	public ClassFileWriterPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileWriter.SIZEOF;
	}

	// Implementation methods

	// J9UTF8* _anonClassName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anonClassNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer _anonClassName() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(ClassFileWriter.__anonClassNameOffset_));
	}

	// J9UTF8* _anonClassName
	public PointerPointer _anonClassNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__anonClassNameOffset_));
	}

	// U32 _bsmAttributeLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bsmAttributeLengthOffset_", declaredType="U32")
	public UDATA _bsmAttributeLength() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileWriter.__bsmAttributeLengthOffset_));
	}

	// U32 _bsmAttributeLength
	public UDATAPointer _bsmAttributeLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileWriter.__bsmAttributeLengthOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(ClassFileWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(ClassFileWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(ClassFileWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(ClassFileWriter.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ClassFileWriter.__buildResultOffset_), BuildResult.class);
	}

	// U8* _classFileBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileBufferOffset_", declaredType="U8*")
	public U8Pointer _classFileBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileWriter.__classFileBufferOffset_));
	}

	// U8* _classFileBuffer
	public PointerPointer _classFileBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__classFileBufferOffset_));
	}

	// U8* _classFileCursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileCursorOffset_", declaredType="U8*")
	public U8Pointer _classFileCursor() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileWriter.__classFileCursorOffset_));
	}

	// U8* _classFileCursor
	public PointerPointer _classFileCursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__classFileCursorOffset_));
	}

	// UDATA _classFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileSizeOffset_", declaredType="UDATA")
	public UDATA _classFileSize() throws CorruptDataException {
		return getUDATAAtOffset(ClassFileWriter.__classFileSizeOffset_);
	}

	// UDATA _classFileSize
	public UDATAPointer _classFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileWriter.__classFileSizeOffset_));
	}

	// U16 _constantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolCountOffset_", declaredType="U16")
	public U16 _constantPoolCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileWriter.__constantPoolCountOffset_));
	}

	// U16 _constantPoolCount
	public U16Pointer _constantPoolCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileWriter.__constantPoolCountOffset_));
	}

	// J9HashTable* _cpHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer _cpHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(ClassFileWriter.__cpHashTableOffset_));
	}

	// J9HashTable* _cpHashTable
	public PointerPointer _cpHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__cpHashTableOffset_));
	}

	// bool _isAnon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isAnonOffset_", declaredType="bool")
	public boolean _isAnon() throws CorruptDataException {
		return getBoolAtOffset(ClassFileWriter.__isAnonOffset_);
	}

	// bool _isAnon
	public BoolPointer _isAnonEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileWriter.__isAnonOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(ClassFileWriter.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__javaVMOffset_));
	}

	// J9UTF8* _originalClassName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__originalClassNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer _originalClassName() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(ClassFileWriter.__originalClassNameOffset_));
	}

	// J9UTF8* _originalClassName
	public PointerPointer _originalClassNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__originalClassNameOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(ClassFileWriter.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__portLibraryOffset_));
	}

	// J9ROMClass* _romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer _romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(ClassFileWriter.__romClassOffset_));
	}

	// J9ROMClass* _romClass
	public PointerPointer _romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter.__romClassOffset_));
	}

}
