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
 * Structure: MM_AllocationContextBalancedPointer
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
 * The generated code will provide getters for all elements in the MM_AllocationContextBalancedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_AllocationContextBalanced.class)
public class MM_AllocationContextBalancedPointer extends MM_AllocationContextTarokPointer {

	// NULL
	public static final MM_AllocationContextBalancedPointer NULL = new MM_AllocationContextBalancedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_AllocationContextBalancedPointer(long address) {
		super(address);
	}

	public static MM_AllocationContextBalancedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_AllocationContextBalancedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_AllocationContextBalancedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_AllocationContextBalancedPointer(address);
	}

	public MM_AllocationContextBalancedPointer add(long count) {
		return MM_AllocationContextBalancedPointer.cast(address + (MM_AllocationContextBalanced.SIZEOF * count));
	}

	public MM_AllocationContextBalancedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_AllocationContextBalancedPointer addOffset(long offset) {
		return MM_AllocationContextBalancedPointer.cast(address + offset);
	}

	public MM_AllocationContextBalancedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_AllocationContextBalancedPointer sub(long count) {
		return MM_AllocationContextBalancedPointer.cast(address - (MM_AllocationContextBalanced.SIZEOF * count));
	}

	public MM_AllocationContextBalancedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_AllocationContextBalancedPointer subOffset(long offset) {
		return MM_AllocationContextBalancedPointer.cast(address - offset);
	}

	public MM_AllocationContextBalancedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_AllocationContextBalancedPointer untag(long mask) {
		return MM_AllocationContextBalancedPointer.cast(address & ~mask);
	}

	public MM_AllocationContextBalancedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_AllocationContextBalanced.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptorVLHGC* _allocationRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationRegionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _allocationRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__allocationRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _allocationRegion
	public PointerPointer _allocationRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__allocationRegionOffset_));
	}

	// MM_AllocationContextBalanced* _cachedReplenishPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedReplenishPointOffset_", declaredType="MM_AllocationContextBalanced*")
	public MM_AllocationContextBalancedPointer _cachedReplenishPoint() throws CorruptDataException {
		return MM_AllocationContextBalancedPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__cachedReplenishPointOffset_));
	}

	// MM_AllocationContextBalanced* _cachedReplenishPoint
	public PointerPointer _cachedReplenishPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__cachedReplenishPointOffset_));
	}

	// MM_LightweightNonReentrantLock _contextLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _contextLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__contextLockOffset_));
	}

	// MM_LightweightNonReentrantLock _contextLock
	public PointerPointer _contextLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__contextLockOffset_));
	}

	// MM_RegionListTarok _discardRegionList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__discardRegionListOffset_", declaredType="MM_RegionListTarok")
	public MM_RegionListTarokPointer _discardRegionList() throws CorruptDataException {
		return MM_RegionListTarokPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__discardRegionListOffset_));
	}

	// MM_RegionListTarok _discardRegionList
	public PointerPointer _discardRegionListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__discardRegionListOffset_));
	}

	// MM_RegionListTarok _flushedRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flushedRegionsOffset_", declaredType="MM_RegionListTarok")
	public MM_RegionListTarokPointer _flushedRegions() throws CorruptDataException {
		return MM_RegionListTarokPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__flushedRegionsOffset_));
	}

	// MM_RegionListTarok _flushedRegions
	public PointerPointer _flushedRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__flushedRegionsOffset_));
	}

	// MM_LightweightNonReentrantLock _freeListLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _freeListLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeListLockOffset_));
	}

	// MM_LightweightNonReentrantLock _freeListLock
	public PointerPointer _freeListLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeListLockOffset_));
	}

	// UDATA _freeMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemorySizeOffset_", declaredType="UDATA")
	public UDATA _freeMemorySize() throws CorruptDataException {
		return getUDATAAtOffset(MM_AllocationContextBalanced.__freeMemorySizeOffset_);
	}

	// UDATA _freeMemorySize
	public UDATAPointer _freeMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeMemorySizeOffset_));
	}

	// UDATA _freeProcessorNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeProcessorNodeCountOffset_", declaredType="UDATA")
	public UDATA _freeProcessorNodeCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_AllocationContextBalanced.__freeProcessorNodeCountOffset_);
	}

	// UDATA _freeProcessorNodeCount
	public UDATAPointer _freeProcessorNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeProcessorNodeCountOffset_));
	}

	// UDATA* _freeProcessorNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeProcessorNodesOffset_", declaredType="UDATA*")
	public UDATAPointer _freeProcessorNodes() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__freeProcessorNodesOffset_));
	}

	// UDATA* _freeProcessorNodes
	public PointerPointer _freeProcessorNodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeProcessorNodesOffset_));
	}

	// MM_RegionListTarok _freeRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeRegionsOffset_", declaredType="MM_RegionListTarok")
	public MM_RegionListTarokPointer _freeRegions() throws CorruptDataException {
		return MM_RegionListTarokPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeRegionsOffset_));
	}

	// MM_RegionListTarok _freeRegions
	public PointerPointer _freeRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__freeRegionsOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__heapRegionManagerOffset_));
	}

	// MM_RegionListTarok _idleMPBPRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__idleMPBPRegionsOffset_", declaredType="MM_RegionListTarok")
	public MM_RegionListTarokPointer _idleMPBPRegions() throws CorruptDataException {
		return MM_RegionListTarokPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__idleMPBPRegionsOffset_));
	}

	// MM_RegionListTarok _idleMPBPRegions
	public PointerPointer _idleMPBPRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__idleMPBPRegionsOffset_));
	}

	// MM_AllocationContextBalanced* _nextSibling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextSiblingOffset_", declaredType="MM_AllocationContextBalanced*")
	public MM_AllocationContextBalancedPointer _nextSibling() throws CorruptDataException {
		return MM_AllocationContextBalancedPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__nextSiblingOffset_));
	}

	// MM_AllocationContextBalanced* _nextSibling
	public PointerPointer _nextSiblingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__nextSiblingOffset_));
	}

	// MM_AllocationContextBalanced* _nextToSteal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextToStealOffset_", declaredType="MM_AllocationContextBalanced*")
	public MM_AllocationContextBalancedPointer _nextToSteal() throws CorruptDataException {
		return MM_AllocationContextBalancedPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__nextToStealOffset_));
	}

	// MM_AllocationContextBalanced* _nextToSteal
	public PointerPointer _nextToStealEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__nextToStealOffset_));
	}

	// MM_RegionListTarok _nonFullRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonFullRegionsOffset_", declaredType="MM_RegionListTarok")
	public MM_RegionListTarokPointer _nonFullRegions() throws CorruptDataException {
		return MM_RegionListTarokPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__nonFullRegionsOffset_));
	}

	// MM_RegionListTarok _nonFullRegions
	public PointerPointer _nonFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__nonFullRegionsOffset_));
	}

	// UDATA _numaNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaNodeOffset_", declaredType="UDATA")
	public UDATA _numaNode() throws CorruptDataException {
		return getUDATAAtOffset(MM_AllocationContextBalanced.__numaNodeOffset_);
	}

	// UDATA _numaNode
	public UDATAPointer _numaNodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__numaNodeOffset_));
	}

	// UDATA[] _regionCount
	public UDATAPointer _regionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__regionCountOffset_));
	}

	// MM_AllocationContextBalanced* _stealingCousin
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stealingCousinOffset_", declaredType="MM_AllocationContextBalanced*")
	public MM_AllocationContextBalancedPointer _stealingCousin() throws CorruptDataException {
		return MM_AllocationContextBalancedPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__stealingCousinOffset_));
	}

	// MM_AllocationContextBalanced* _stealingCousin
	public PointerPointer _stealingCousinEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__stealingCousinOffset_));
	}

	// MM_MemorySubSpaceTarok* _subspace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subspaceOffset_", declaredType="MM_MemorySubSpaceTarok*")
	public MM_MemorySubSpaceTarokPointer _subspace() throws CorruptDataException {
		return MM_MemorySubSpaceTarokPointer.cast(getPointerAtOffset(MM_AllocationContextBalanced.__subspaceOffset_));
	}

	// MM_MemorySubSpaceTarok* _subspace
	public PointerPointer _subspaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__subspaceOffset_));
	}

	// UDATA _threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountOffset_", declaredType="UDATA")
	public UDATA _threadCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_AllocationContextBalanced.__threadCountOffset_);
	}

	// UDATA _threadCount
	public UDATAPointer _threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextBalanced.__threadCountOffset_));
	}

}
