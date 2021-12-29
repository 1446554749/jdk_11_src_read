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
 * Structure: J9SimplePoolPointer
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
 * The generated code will provide getters for all elements in the J9SimplePoolPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SimplePool.class)
public class J9SimplePoolPointer extends StructurePointer {

	// NULL
	public static final J9SimplePoolPointer NULL = new J9SimplePoolPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SimplePoolPointer(long address) {
		super(address);
	}

	public static J9SimplePoolPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SimplePoolPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SimplePoolPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SimplePoolPointer(address);
	}

	public J9SimplePoolPointer add(long count) {
		return J9SimplePoolPointer.cast(address + (J9SimplePool.SIZEOF * count));
	}

	public J9SimplePoolPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SimplePoolPointer addOffset(long offset) {
		return J9SimplePoolPointer.cast(address + offset);
	}

	public J9SimplePoolPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SimplePoolPointer sub(long count) {
		return J9SimplePoolPointer.cast(address - (J9SimplePool.SIZEOF * count));
	}

	public J9SimplePoolPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SimplePoolPointer subOffset(long offset) {
		return J9SimplePoolPointer.cast(address - offset);
	}

	public J9SimplePoolPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SimplePoolPointer untag(long mask) {
		return J9SimplePoolPointer.cast(address & ~mask);
	}

	public J9SimplePoolPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SimplePool.SIZEOF;
	}

	// Implementation methods

	// J9SRP(U8) blockEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockEndOffset_", declaredType="J9SRP(U8)")
	public U8Pointer blockEnd() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SimplePool._blockEndOffset_);
		if (nextAddress == 0) {
			return U8Pointer.NULL;
		}
		return U8Pointer.cast(address + (J9SimplePool._blockEndOffset_ + nextAddress));
	}

	// J9SRP(U8) blockEnd
	public SelfRelativePointer blockEndEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SimplePool._blockEndOffset_));
	}

	// U32 elementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementSizeOffset_", declaredType="U32")
	public UDATA elementSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SimplePool._elementSizeOffset_));
	}

	// U32 elementSize
	public UDATAPointer elementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SimplePool._elementSizeOffset_));
	}

	// J9SRP(U8) firstFreeSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstFreeSlotOffset_", declaredType="J9SRP(U8)")
	public U8Pointer firstFreeSlot() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SimplePool._firstFreeSlotOffset_);
		if (nextAddress == 0) {
			return U8Pointer.NULL;
		}
		return U8Pointer.cast(address + (J9SimplePool._firstFreeSlotOffset_ + nextAddress));
	}

	// J9SRP(U8) firstFreeSlot
	public SelfRelativePointer firstFreeSlotEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SimplePool._firstFreeSlotOffset_));
	}

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SimplePool._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SimplePool._flagsOffset_));
	}

	// J9SRP(J9SimplePoolFreeList) freeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeListOffset_", declaredType="J9SRP(J9SimplePoolFreeList)")
	public J9SimplePoolFreeListPointer freeList() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SimplePool._freeListOffset_);
		if (nextAddress == 0) {
			return J9SimplePoolFreeListPointer.NULL;
		}
		return J9SimplePoolFreeListPointer.cast(address + (J9SimplePool._freeListOffset_ + nextAddress));
	}

	// J9SRP(J9SimplePoolFreeList) freeList
	public SelfRelativePointer freeListEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SimplePool._freeListOffset_));
	}

	// U32 numElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numElementsOffset_", declaredType="U32")
	public UDATA numElements() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SimplePool._numElementsOffset_));
	}

	// U32 numElements
	public UDATAPointer numElementsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SimplePool._numElementsOffset_));
	}

}
