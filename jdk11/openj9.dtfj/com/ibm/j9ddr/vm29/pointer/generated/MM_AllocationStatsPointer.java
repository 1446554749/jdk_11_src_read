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
 * Structure: MM_AllocationStatsPointer
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
 * The generated code will provide getters for all elements in the MM_AllocationStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_AllocationStats.class)
public class MM_AllocationStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_AllocationStatsPointer NULL = new MM_AllocationStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_AllocationStatsPointer(long address) {
		super(address);
	}

	public static MM_AllocationStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_AllocationStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_AllocationStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_AllocationStatsPointer(address);
	}

	public MM_AllocationStatsPointer add(long count) {
		return MM_AllocationStatsPointer.cast(address + (MM_AllocationStats.SIZEOF * count));
	}

	public MM_AllocationStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_AllocationStatsPointer addOffset(long offset) {
		return MM_AllocationStatsPointer.cast(address + offset);
	}

	public MM_AllocationStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_AllocationStatsPointer sub(long count) {
		return MM_AllocationStatsPointer.cast(address - (MM_AllocationStats.SIZEOF * count));
	}

	public MM_AllocationStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_AllocationStatsPointer subOffset(long offset) {
		return MM_AllocationStatsPointer.cast(address - offset);
	}

	public MM_AllocationStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_AllocationStatsPointer untag(long mask) {
		return MM_AllocationStatsPointer.cast(address & ~mask);
	}

	public MM_AllocationStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_AllocationStats.SIZEOF;
	}

	// Implementation methods

	// U64 _allocationBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationBytesOffset_", declaredType="U64")
	public UDATA _allocationBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__allocationBytesOffset_));
	}

	// U64 _allocationBytes
	public UDATAPointer _allocationBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__allocationBytesOffset_));
	}

	// U64 _allocationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationCountOffset_", declaredType="U64")
	public UDATA _allocationCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__allocationCountOffset_));
	}

	// U64 _allocationCount
	public UDATAPointer _allocationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__allocationCountOffset_));
	}

	// U64 _allocationSearchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationSearchCountOffset_", declaredType="U64")
	public UDATA _allocationSearchCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__allocationSearchCountOffset_));
	}

	// U64 _allocationSearchCount
	public UDATAPointer _allocationSearchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__allocationSearchCountOffset_));
	}

	// U64 _allocationSearchCountMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationSearchCountMaxOffset_", declaredType="U64")
	public UDATA _allocationSearchCountMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__allocationSearchCountMaxOffset_));
	}

	// U64 _allocationSearchCountMax
	public UDATAPointer _allocationSearchCountMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__allocationSearchCountMaxOffset_));
	}

	// U64 _arrayletLeafAllocationBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletLeafAllocationBytesOffset_", declaredType="U64")
	public UDATA _arrayletLeafAllocationBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__arrayletLeafAllocationBytesOffset_));
	}

	// U64 _arrayletLeafAllocationBytes
	public UDATAPointer _arrayletLeafAllocationBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__arrayletLeafAllocationBytesOffset_));
	}

	// U64 _arrayletLeafAllocationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletLeafAllocationCountOffset_", declaredType="U64")
	public UDATA _arrayletLeafAllocationCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__arrayletLeafAllocationCountOffset_));
	}

	// U64 _arrayletLeafAllocationCount
	public UDATAPointer _arrayletLeafAllocationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__arrayletLeafAllocationCountOffset_));
	}

	// U64 _discardedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__discardedBytesOffset_", declaredType="U64")
	public UDATA _discardedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__discardedBytesOffset_));
	}

	// U64 _discardedBytes
	public UDATAPointer _discardedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__discardedBytesOffset_));
	}

	// U64 _ownableSynchronizerObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerObjectCountOffset_", declaredType="U64")
	public UDATA _ownableSynchronizerObjectCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__ownableSynchronizerObjectCountOffset_));
	}

	// U64 _ownableSynchronizerObjectCount
	public UDATAPointer _ownableSynchronizerObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__ownableSynchronizerObjectCountOffset_));
	}

	// U64 _tlhAllocatedFresh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhAllocatedFreshOffset_", declaredType="U64")
	public UDATA _tlhAllocatedFresh() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhAllocatedFreshOffset_));
	}

	// U64 _tlhAllocatedFresh
	public UDATAPointer _tlhAllocatedFreshEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhAllocatedFreshOffset_));
	}

	// U64 _tlhAllocatedReused
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhAllocatedReusedOffset_", declaredType="U64")
	public UDATA _tlhAllocatedReused() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhAllocatedReusedOffset_));
	}

	// U64 _tlhAllocatedReused
	public UDATAPointer _tlhAllocatedReusedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhAllocatedReusedOffset_));
	}

	// U64 _tlhAllocatedUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhAllocatedUsedOffset_", declaredType="U64")
	public UDATA _tlhAllocatedUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhAllocatedUsedOffset_));
	}

	// U64 _tlhAllocatedUsed
	public UDATAPointer _tlhAllocatedUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhAllocatedUsedOffset_));
	}

	// U64 _tlhDiscardedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhDiscardedBytesOffset_", declaredType="U64")
	public UDATA _tlhDiscardedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhDiscardedBytesOffset_));
	}

	// U64 _tlhDiscardedBytes
	public UDATAPointer _tlhDiscardedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhDiscardedBytesOffset_));
	}

	// U64 _tlhMaxAbandonedListSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhMaxAbandonedListSizeOffset_", declaredType="U64")
	public UDATA _tlhMaxAbandonedListSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhMaxAbandonedListSizeOffset_));
	}

	// U64 _tlhMaxAbandonedListSize
	public UDATAPointer _tlhMaxAbandonedListSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhMaxAbandonedListSizeOffset_));
	}

	// U64 _tlhRefreshCountFresh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhRefreshCountFreshOffset_", declaredType="U64")
	public UDATA _tlhRefreshCountFresh() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhRefreshCountFreshOffset_));
	}

	// U64 _tlhRefreshCountFresh
	public UDATAPointer _tlhRefreshCountFreshEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhRefreshCountFreshOffset_));
	}

	// U64 _tlhRefreshCountReused
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhRefreshCountReusedOffset_", declaredType="U64")
	public UDATA _tlhRefreshCountReused() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhRefreshCountReusedOffset_));
	}

	// U64 _tlhRefreshCountReused
	public UDATAPointer _tlhRefreshCountReusedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhRefreshCountReusedOffset_));
	}

	// U64 _tlhRequestedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhRequestedBytesOffset_", declaredType="U64")
	public UDATA _tlhRequestedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocationStats.__tlhRequestedBytesOffset_));
	}

	// U64 _tlhRequestedBytes
	public UDATAPointer _tlhRequestedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationStats.__tlhRequestedBytesOffset_));
	}

}
