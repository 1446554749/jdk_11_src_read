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
 * Structure: ByteDataWrapperPointer
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
 * The generated code will provide getters for all elements in the ByteDataWrapperPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ByteDataWrapper.class)
public class ByteDataWrapperPointer extends StructurePointer {

	// NULL
	public static final ByteDataWrapperPointer NULL = new ByteDataWrapperPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ByteDataWrapperPointer(long address) {
		super(address);
	}

	public static ByteDataWrapperPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ByteDataWrapperPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ByteDataWrapperPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ByteDataWrapperPointer(address);
	}

	public ByteDataWrapperPointer add(long count) {
		return ByteDataWrapperPointer.cast(address + (ByteDataWrapper.SIZEOF * count));
	}

	public ByteDataWrapperPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ByteDataWrapperPointer addOffset(long offset) {
		return ByteDataWrapperPointer.cast(address + offset);
	}

	public ByteDataWrapperPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ByteDataWrapperPointer sub(long count) {
		return ByteDataWrapperPointer.cast(address - (ByteDataWrapper.SIZEOF * count));
	}

	public ByteDataWrapperPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ByteDataWrapperPointer subOffset(long offset) {
		return ByteDataWrapperPointer.cast(address - offset);
	}

	public ByteDataWrapperPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ByteDataWrapperPointer untag(long mask) {
		return ByteDataWrapperPointer.cast(address & ~mask);
	}

	public ByteDataWrapperPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ByteDataWrapper.SIZEOF;
	}

	// Implementation methods

	// U32 dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataLengthOffset_", declaredType="U32")
	public UDATA dataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(ByteDataWrapper._dataLengthOffset_));
	}

	// U32 dataLength
	public UDATAPointer dataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ByteDataWrapper._dataLengthOffset_));
	}

	// U8 dataType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataTypeOffset_", declaredType="U8")
	public U8 dataType() throws CorruptDataException {
		return new U8(getByteAtOffset(ByteDataWrapper._dataTypeOffset_));
	}

	// U8 dataType
	public U8Pointer dataTypeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ByteDataWrapper._dataTypeOffset_));
	}

	// J9ShrOffset externalBlockOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_externalBlockOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer externalBlockOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ByteDataWrapper._externalBlockOffsetOffset_));
	}

	// J9ShrOffset externalBlockOffset
	public PointerPointer externalBlockOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ByteDataWrapper._externalBlockOffsetOffset_));
	}

	// U8 inPrivateUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inPrivateUseOffset_", declaredType="U8")
	public U8 inPrivateUse() throws CorruptDataException {
		return new U8(getByteAtOffset(ByteDataWrapper._inPrivateUseOffset_));
	}

	// U8 inPrivateUse
	public U8Pointer inPrivateUseEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ByteDataWrapper._inPrivateUseOffset_));
	}

	// U16 privateOwnerID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_privateOwnerIDOffset_", declaredType="U16")
	public U16 privateOwnerID() throws CorruptDataException {
		return new U16(getShortAtOffset(ByteDataWrapper._privateOwnerIDOffset_));
	}

	// U16 privateOwnerID
	public U16Pointer privateOwnerIDEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ByteDataWrapper._privateOwnerIDOffset_));
	}

	// J9ShrOffset tokenOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tokenOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer tokenOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ByteDataWrapper._tokenOffsetOffset_));
	}

	// J9ShrOffset tokenOffset
	public PointerPointer tokenOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ByteDataWrapper._tokenOffsetOffset_));
	}

}
