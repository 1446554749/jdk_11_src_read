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
 * Structure: J9PoolPointer
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
 * The generated code will provide getters for all elements in the J9PoolPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9Pool.class)
public class J9PoolPointer extends StructurePointer {

	// NULL
	public static final J9PoolPointer NULL = new J9PoolPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PoolPointer(long address) {
		super(address);
	}

	public static J9PoolPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PoolPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PoolPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PoolPointer(address);
	}

	public J9PoolPointer add(long count) {
		return J9PoolPointer.cast(address + (J9Pool.SIZEOF * count));
	}

	public J9PoolPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PoolPointer addOffset(long offset) {
		return J9PoolPointer.cast(address + offset);
	}

	public J9PoolPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PoolPointer sub(long count) {
		return J9PoolPointer.cast(address - (J9Pool.SIZEOF * count));
	}

	public J9PoolPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PoolPointer subOffset(long offset) {
		return J9PoolPointer.cast(address - offset);
	}

	public J9PoolPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PoolPointer untag(long mask) {
		return J9PoolPointer.cast(address & ~mask);
	}

	public J9PoolPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9Pool.SIZEOF;
	}

	// Implementation methods

	// U16 alignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alignmentOffset_", declaredType="U16")
	public U16 alignment() throws CorruptDataException {
		return new U16(getShortAtOffset(J9Pool._alignmentOffset_));
	}

	// U16 alignment
	public U16Pointer alignmentEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9Pool._alignmentOffset_));
	}

	// U64 elementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementSizeOffset_", declaredType="U64")
	public UDATA elementSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Pool._elementSizeOffset_));
	}

	// U64 elementSize
	public UDATAPointer elementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Pool._elementSizeOffset_));
	}

	// U64 elementsPerPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementsPerPuddleOffset_", declaredType="U64")
	public UDATA elementsPerPuddle() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Pool._elementsPerPuddleOffset_));
	}

	// U64 elementsPerPuddle
	public UDATAPointer elementsPerPuddleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Pool._elementsPerPuddleOffset_));
	}

	// U16 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U16")
	public U16 flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9Pool._flagsOffset_));
	}

	// U16 flags
	public U16Pointer flagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9Pool._flagsOffset_));
	}

	// void* memAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memAllocOffset_", declaredType="void*")
	public VoidPointer memAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9Pool._memAllocOffset_));
	}

	// void* memAlloc
	public PointerPointer memAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Pool._memAllocOffset_));
	}

	// void* memFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memFreeOffset_", declaredType="void*")
	public VoidPointer memFree() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9Pool._memFreeOffset_));
	}

	// void* memFree
	public PointerPointer memFreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Pool._memFreeOffset_));
	}

	// U32 memoryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryCategoryOffset_", declaredType="U32")
	public UDATA memoryCategory() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Pool._memoryCategoryOffset_));
	}

	// U32 memoryCategory
	public UDATAPointer memoryCategoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Pool._memoryCategoryOffset_));
	}

	// const U8* poolCreatorCallsite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_poolCreatorCallsiteOffset_", declaredType="const U8*")
	public U8Pointer poolCreatorCallsite() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9Pool._poolCreatorCallsiteOffset_));
	}

	// const U8* poolCreatorCallsite
	public PointerPointer poolCreatorCallsiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Pool._poolCreatorCallsiteOffset_));
	}

	// U64 puddleAllocSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_puddleAllocSizeOffset_", declaredType="U64")
	public UDATA puddleAllocSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Pool._puddleAllocSizeOffset_));
	}

	// U64 puddleAllocSize
	public UDATAPointer puddleAllocSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Pool._puddleAllocSizeOffset_));
	}

	// J9WSRP(J9PoolPuddleList) puddleList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_puddleListOffset_", declaredType="J9WSRP(J9PoolPuddleList)")
	public J9PoolPuddleListPointer puddleList() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9Pool._puddleListOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddleListPointer.NULL;
		}
		return J9PoolPuddleListPointer.cast(address + (J9Pool._puddleListOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddleList) puddleList
	public WideSelfRelativePointer puddleListEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9Pool._puddleListOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9Pool._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Pool._userDataOffset_));
	}

}
