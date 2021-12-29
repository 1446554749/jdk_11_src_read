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
 * Structure: J9CfrAttributeCodePointer
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
 * The generated code will provide getters for all elements in the J9CfrAttributeCodePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrAttributeCode.class)
public class J9CfrAttributeCodePointer extends StructurePointer {

	// NULL
	public static final J9CfrAttributeCodePointer NULL = new J9CfrAttributeCodePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrAttributeCodePointer(long address) {
		super(address);
	}

	public static J9CfrAttributeCodePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrAttributeCodePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrAttributeCodePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrAttributeCodePointer(address);
	}

	public J9CfrAttributeCodePointer add(long count) {
		return J9CfrAttributeCodePointer.cast(address + (J9CfrAttributeCode.SIZEOF * count));
	}

	public J9CfrAttributeCodePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrAttributeCodePointer addOffset(long offset) {
		return J9CfrAttributeCodePointer.cast(address + offset);
	}

	public J9CfrAttributeCodePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrAttributeCodePointer sub(long count) {
		return J9CfrAttributeCodePointer.cast(address - (J9CfrAttributeCode.SIZEOF * count));
	}

	public J9CfrAttributeCodePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrAttributeCodePointer subOffset(long offset) {
		return J9CfrAttributeCodePointer.cast(address - offset);
	}

	public J9CfrAttributeCodePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrAttributeCodePointer untag(long mask) {
		return J9CfrAttributeCodePointer.cast(address & ~mask);
	}

	public J9CfrAttributeCodePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrAttributeCode.SIZEOF;
	}

	// Implementation methods

	// void** attributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesOffset_", declaredType="void**")
	public PointerPointer attributes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9CfrAttributeCode._attributesOffset_));
	}

	// void** attributes
	public PointerPointer attributesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeCode._attributesOffset_));
	}

	// U16 attributesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesCountOffset_", declaredType="U16")
	public U16 attributesCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeCode._attributesCountOffset_));
	}

	// U16 attributesCount
	public U16Pointer attributesCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._attributesCountOffset_));
	}

	// U8* code
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeOffset_", declaredType="U8*")
	public U8Pointer code() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9CfrAttributeCode._codeOffset_));
	}

	// U8* code
	public PointerPointer codeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeCode._codeOffset_));
	}

	// U32 codeLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeLengthOffset_", declaredType="U32")
	public UDATA codeLength() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrAttributeCode._codeLengthOffset_));
	}

	// U32 codeLength
	public UDATAPointer codeLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeCode._codeLengthOffset_));
	}

	// J9CfrExceptionTableEntry* exceptionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableOffset_", declaredType="J9CfrExceptionTableEntry*")
	public J9CfrExceptionTableEntryPointer exceptionTable() throws CorruptDataException {
		return J9CfrExceptionTableEntryPointer.cast(getPointerAtOffset(J9CfrAttributeCode._exceptionTableOffset_));
	}

	// J9CfrExceptionTableEntry* exceptionTable
	public PointerPointer exceptionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeCode._exceptionTableOffset_));
	}

	// U16 exceptionTableLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableLengthOffset_", declaredType="U16")
	public U16 exceptionTableLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeCode._exceptionTableLengthOffset_));
	}

	// U16 exceptionTableLength
	public U16Pointer exceptionTableLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._exceptionTableLengthOffset_));
	}

	// U32 length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="U32")
	public UDATA length() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrAttributeCode._lengthOffset_));
	}

	// U32 length
	public UDATAPointer lengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeCode._lengthOffset_));
	}

	// U16 maxLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxLocalsOffset_", declaredType="U16")
	public U16 maxLocals() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeCode._maxLocalsOffset_));
	}

	// U16 maxLocals
	public U16Pointer maxLocalsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._maxLocalsOffset_));
	}

	// U16 maxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackOffset_", declaredType="U16")
	public U16 maxStack() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeCode._maxStackOffset_));
	}

	// U16 maxStack
	public U16Pointer maxStackEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._maxStackOffset_));
	}

	// U16 nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameIndexOffset_", declaredType="U16")
	public U16 nameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeCode._nameIndexOffset_));
	}

	// U16 nameIndex
	public U16Pointer nameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._nameIndexOffset_));
	}

	// U8* originalCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalCodeOffset_", declaredType="U8*")
	public U8Pointer originalCode() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9CfrAttributeCode._originalCodeOffset_));
	}

	// U8* originalCode
	public PointerPointer originalCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeCode._originalCodeOffset_));
	}

	// UDATA romAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romAddressOffset_", declaredType="UDATA")
	public UDATA romAddress() throws CorruptDataException {
		return getUDATAAtOffset(J9CfrAttributeCode._romAddressOffset_);
	}

	// UDATA romAddress
	public UDATAPointer romAddressEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeCode._romAddressOffset_));
	}

	// U8 tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="U8")
	public U8 tag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9CfrAttributeCode._tagOffset_));
	}

	// U8 tag
	public U8Pointer tagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9CfrAttributeCode._tagOffset_));
	}

}
