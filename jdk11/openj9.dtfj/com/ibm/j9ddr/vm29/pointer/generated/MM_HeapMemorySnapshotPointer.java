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
 * Structure: MM_HeapMemorySnapshotPointer
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
 * The generated code will provide getters for all elements in the MM_HeapMemorySnapshotPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapMemorySnapshot.class)
public class MM_HeapMemorySnapshotPointer extends MM_BasePointer {

	// NULL
	public static final MM_HeapMemorySnapshotPointer NULL = new MM_HeapMemorySnapshotPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapMemorySnapshotPointer(long address) {
		super(address);
	}

	public static MM_HeapMemorySnapshotPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapMemorySnapshotPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapMemorySnapshotPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapMemorySnapshotPointer(address);
	}

	public MM_HeapMemorySnapshotPointer add(long count) {
		return MM_HeapMemorySnapshotPointer.cast(address + (MM_HeapMemorySnapshot.SIZEOF * count));
	}

	public MM_HeapMemorySnapshotPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapMemorySnapshotPointer addOffset(long offset) {
		return MM_HeapMemorySnapshotPointer.cast(address + offset);
	}

	public MM_HeapMemorySnapshotPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapMemorySnapshotPointer sub(long count) {
		return MM_HeapMemorySnapshotPointer.cast(address - (MM_HeapMemorySnapshot.SIZEOF * count));
	}

	public MM_HeapMemorySnapshotPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapMemorySnapshotPointer subOffset(long offset) {
		return MM_HeapMemorySnapshotPointer.cast(address - offset);
	}

	public MM_HeapMemorySnapshotPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapMemorySnapshotPointer untag(long mask) {
		return MM_HeapMemorySnapshotPointer.cast(address & ~mask);
	}

	public MM_HeapMemorySnapshotPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapMemorySnapshot.SIZEOF;
	}

	// Implementation methods

	// U64 _freeHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeHeapSizeOffset_", declaredType="U64")
	public UDATA _freeHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeHeapSizeOffset_));
	}

	// U64 _freeHeapSize
	public UDATAPointer _freeHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeHeapSizeOffset_));
	}

	// U64 _freeNurseryAllocateSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeNurseryAllocateSizeOffset_", declaredType="U64")
	public UDATA _freeNurseryAllocateSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeNurseryAllocateSizeOffset_));
	}

	// U64 _freeNurseryAllocateSize
	public UDATAPointer _freeNurseryAllocateSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeNurseryAllocateSizeOffset_));
	}

	// U64 _freeNurserySurvivorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeNurserySurvivorSizeOffset_", declaredType="U64")
	public UDATA _freeNurserySurvivorSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeNurserySurvivorSizeOffset_));
	}

	// U64 _freeNurserySurvivorSize
	public UDATAPointer _freeNurserySurvivorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeNurserySurvivorSizeOffset_));
	}

	// U64 _freeRegionEdenSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeRegionEdenSizeOffset_", declaredType="U64")
	public UDATA _freeRegionEdenSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeRegionEdenSizeOffset_));
	}

	// U64 _freeRegionEdenSize
	public UDATAPointer _freeRegionEdenSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeRegionEdenSizeOffset_));
	}

	// U64 _freeRegionOldSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeRegionOldSizeOffset_", declaredType="U64")
	public UDATA _freeRegionOldSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeRegionOldSizeOffset_));
	}

	// U64 _freeRegionOldSize
	public UDATAPointer _freeRegionOldSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeRegionOldSizeOffset_));
	}

	// U64 _freeRegionReservedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeRegionReservedSizeOffset_", declaredType="U64")
	public UDATA _freeRegionReservedSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeRegionReservedSizeOffset_));
	}

	// U64 _freeRegionReservedSize
	public UDATAPointer _freeRegionReservedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeRegionReservedSizeOffset_));
	}

	// U64 _freeRegionSurvivorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeRegionSurvivorSizeOffset_", declaredType="U64")
	public UDATA _freeRegionSurvivorSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeRegionSurvivorSizeOffset_));
	}

	// U64 _freeRegionSurvivorSize
	public UDATAPointer _freeRegionSurvivorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeRegionSurvivorSizeOffset_));
	}

	// U64 _freeTenuredLOASize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeTenuredLOASizeOffset_", declaredType="U64")
	public UDATA _freeTenuredLOASize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeTenuredLOASizeOffset_));
	}

	// U64 _freeTenuredLOASize
	public UDATAPointer _freeTenuredLOASizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeTenuredLOASizeOffset_));
	}

	// U64 _freeTenuredSOASize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeTenuredSOASizeOffset_", declaredType="U64")
	public UDATA _freeTenuredSOASize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeTenuredSOASizeOffset_));
	}

	// U64 _freeTenuredSOASize
	public UDATAPointer _freeTenuredSOASizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeTenuredSOASizeOffset_));
	}

	// U64 _freeTenuredSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeTenuredSizeOffset_", declaredType="U64")
	public UDATA _freeTenuredSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__freeTenuredSizeOffset_));
	}

	// U64 _freeTenuredSize
	public UDATAPointer _freeTenuredSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__freeTenuredSizeOffset_));
	}

	// U64 _totalHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalHeapSizeOffset_", declaredType="U64")
	public UDATA _totalHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalHeapSizeOffset_));
	}

	// U64 _totalHeapSize
	public UDATAPointer _totalHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalHeapSizeOffset_));
	}

	// U64 _totalNurseryAllocateSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalNurseryAllocateSizeOffset_", declaredType="U64")
	public UDATA _totalNurseryAllocateSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalNurseryAllocateSizeOffset_));
	}

	// U64 _totalNurseryAllocateSize
	public UDATAPointer _totalNurseryAllocateSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalNurseryAllocateSizeOffset_));
	}

	// U64 _totalNurserySurvivorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalNurserySurvivorSizeOffset_", declaredType="U64")
	public UDATA _totalNurserySurvivorSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalNurserySurvivorSizeOffset_));
	}

	// U64 _totalNurserySurvivorSize
	public UDATAPointer _totalNurserySurvivorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalNurserySurvivorSizeOffset_));
	}

	// U64 _totalRegionEdenSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionEdenSizeOffset_", declaredType="U64")
	public UDATA _totalRegionEdenSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalRegionEdenSizeOffset_));
	}

	// U64 _totalRegionEdenSize
	public UDATAPointer _totalRegionEdenSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalRegionEdenSizeOffset_));
	}

	// U64 _totalRegionOldSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionOldSizeOffset_", declaredType="U64")
	public UDATA _totalRegionOldSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalRegionOldSizeOffset_));
	}

	// U64 _totalRegionOldSize
	public UDATAPointer _totalRegionOldSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalRegionOldSizeOffset_));
	}

	// U64 _totalRegionReservedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionReservedSizeOffset_", declaredType="U64")
	public UDATA _totalRegionReservedSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalRegionReservedSizeOffset_));
	}

	// U64 _totalRegionReservedSize
	public UDATAPointer _totalRegionReservedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalRegionReservedSizeOffset_));
	}

	// U64 _totalRegionSurvivorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionSurvivorSizeOffset_", declaredType="U64")
	public UDATA _totalRegionSurvivorSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalRegionSurvivorSizeOffset_));
	}

	// U64 _totalRegionSurvivorSize
	public UDATAPointer _totalRegionSurvivorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalRegionSurvivorSizeOffset_));
	}

	// U64 _totalTenuredLOASize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalTenuredLOASizeOffset_", declaredType="U64")
	public UDATA _totalTenuredLOASize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalTenuredLOASizeOffset_));
	}

	// U64 _totalTenuredLOASize
	public UDATAPointer _totalTenuredLOASizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalTenuredLOASizeOffset_));
	}

	// U64 _totalTenuredSOASize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalTenuredSOASizeOffset_", declaredType="U64")
	public UDATA _totalTenuredSOASize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalTenuredSOASizeOffset_));
	}

	// U64 _totalTenuredSOASize
	public UDATAPointer _totalTenuredSOASizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalTenuredSOASizeOffset_));
	}

	// U64 _totalTenuredSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalTenuredSizeOffset_", declaredType="U64")
	public UDATA _totalTenuredSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMemorySnapshot.__totalTenuredSizeOffset_));
	}

	// U64 _totalTenuredSize
	public UDATAPointer _totalTenuredSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMemorySnapshot.__totalTenuredSizeOffset_));
	}

}
