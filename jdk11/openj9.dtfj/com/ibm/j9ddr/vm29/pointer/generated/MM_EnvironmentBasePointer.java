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
 * Structure: MM_EnvironmentBasePointer
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
 * The generated code will provide getters for all elements in the MM_EnvironmentBasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_EnvironmentBase.class)
public class MM_EnvironmentBasePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_EnvironmentBasePointer NULL = new MM_EnvironmentBasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_EnvironmentBasePointer(long address) {
		super(address);
	}

	public static MM_EnvironmentBasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_EnvironmentBasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_EnvironmentBasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_EnvironmentBasePointer(address);
	}

	public MM_EnvironmentBasePointer add(long count) {
		return MM_EnvironmentBasePointer.cast(address + (MM_EnvironmentBase.SIZEOF * count));
	}

	public MM_EnvironmentBasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_EnvironmentBasePointer addOffset(long offset) {
		return MM_EnvironmentBasePointer.cast(address + offset);
	}

	public MM_EnvironmentBasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_EnvironmentBasePointer sub(long count) {
		return MM_EnvironmentBasePointer.cast(address - (MM_EnvironmentBase.SIZEOF * count));
	}

	public MM_EnvironmentBasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_EnvironmentBasePointer subOffset(long offset) {
		return MM_EnvironmentBasePointer.cast(address - offset);
	}

	public MM_EnvironmentBasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_EnvironmentBasePointer untag(long mask) {
		return MM_EnvironmentBasePointer.cast(address & ~mask);
	}

	public MM_EnvironmentBasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_EnvironmentBase.SIZEOF;
	}

	// Implementation methods

	// MM_Validator* _activeValidator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeValidatorOffset_", declaredType="MM_Validator*")
	public MM_ValidatorPointer _activeValidator() throws CorruptDataException {
		return MM_ValidatorPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__activeValidatorOffset_));
	}

	// MM_Validator* _activeValidator
	public PointerPointer _activeValidatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__activeValidatorOffset_));
	}

	// volatile U32 _allocationColor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationColorOffset_", declaredType="volatile U32")
	public UDATA _allocationColor() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_EnvironmentBase.__allocationColorOffset_));
	}

	// volatile U32 _allocationColor
	public UDATAPointer _allocationColorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__allocationColorOffset_));
	}

	// MM_AllocationContext* _allocationContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationContextOffset_", declaredType="MM_AllocationContext*")
	public MM_AllocationContextPointer _allocationContext() throws CorruptDataException {
		return MM_AllocationContextPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__allocationContextOffset_));
	}

	// MM_AllocationContext* _allocationContext
	public PointerPointer _allocationContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__allocationContextOffset_));
	}

	// bool _allocationFailureReported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationFailureReportedOffset_", declaredType="bool")
	public boolean _allocationFailureReported() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__allocationFailureReportedOffset_);
	}

	// bool _allocationFailureReported
	public BoolPointer _allocationFailureReportedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__allocationFailureReportedOffset_));
	}

	// MM_SegregatedAllocationTracker* _allocationTracker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationTrackerOffset_", declaredType="MM_SegregatedAllocationTracker*")
	public MM_SegregatedAllocationTrackerPointer _allocationTracker() throws CorruptDataException {
		return MM_SegregatedAllocationTrackerPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__allocationTrackerOffset_));
	}

	// MM_SegregatedAllocationTracker* _allocationTracker
	public PointerPointer _allocationTrackerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__allocationTrackerOffset_));
	}

	// OMR_VMThread* _cachedGCExclusiveAccessThreadId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedGCExclusiveAccessThreadIdOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _cachedGCExclusiveAccessThreadId() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__cachedGCExclusiveAccessThreadIdOffset_));
	}

	// OMR_VMThread* _cachedGCExclusiveAccessThreadId
	public PointerPointer _cachedGCExclusiveAccessThreadIdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__cachedGCExclusiveAccessThreadIdOffset_));
	}

	// MM_CardCleaningStats _cardCleaningStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningStatsOffset_", declaredType="MM_CardCleaningStats")
	public MM_CardCleaningStatsPointer _cardCleaningStats() throws CorruptDataException {
		return MM_CardCleaningStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__cardCleaningStatsOffset_));
	}

	// MM_CardCleaningStats _cardCleaningStats
	public PointerPointer _cardCleaningStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__cardCleaningStatsOffset_));
	}

	// MM_AllocationContext* _commonAllocationContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__commonAllocationContextOffset_", declaredType="MM_AllocationContext*")
	public MM_AllocationContextPointer _commonAllocationContext() throws CorruptDataException {
		return MM_AllocationContextPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__commonAllocationContextOffset_));
	}

	// MM_AllocationContext* _commonAllocationContext
	public PointerPointer _commonAllocationContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__commonAllocationContextOffset_));
	}

	// MM_CompactStats _compactStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactStatsOffset_", declaredType="MM_CompactStats")
	public MM_CompactStatsPointer _compactStats() throws CorruptDataException {
		return MM_CompactStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__compactStatsOffset_));
	}

	// MM_CompactStats _compactStats
	public PointerPointer _compactStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__compactStatsOffset_));
	}

	// const bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="const bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__compressObjectReferencesOffset_);
	}

	// const bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__compressObjectReferencesOffset_));
	}

	// U64 _concurrentScavengerSwitchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentScavengerSwitchCountOffset_", declaredType="U64")
	public UDATA _concurrentScavengerSwitchCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__concurrentScavengerSwitchCountOffset_));
	}

	// U64 _concurrentScavengerSwitchCount
	public UDATAPointer _concurrentScavengerSwitchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__concurrentScavengerSwitchCountOffset_));
	}

	// MM_Task* _currentTask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentTaskOffset_", declaredType="MM_Task*")
	public MM_TaskPointer _currentTask() throws CorruptDataException {
		return MM_TaskPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__currentTaskOffset_));
	}

	// MM_Task* _currentTask
	public PointerPointer _currentTaskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__currentTaskOffset_));
	}

	// MM_CycleState* _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState*")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(getPointerAtOffset(MM_EnvironmentBase.__cycleStateOffset_));
	}

	// MM_CycleState* _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__cycleStateOffset_));
	}

	// MM_EnvironmentDelegate _delegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__delegateOffset_", declaredType="MM_EnvironmentDelegate")
	public MM_EnvironmentDelegatePointer _delegate() throws CorruptDataException {
		return MM_EnvironmentDelegatePointer.cast(nonNullFieldEA(MM_EnvironmentBase.__delegateOffset_));
	}

	// MM_EnvironmentDelegate _delegate
	public PointerPointer _delegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__delegateOffset_));
	}

	// U64 _environmentId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__environmentIdOffset_", declaredType="U64")
	public UDATA _environmentId() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__environmentIdOffset_));
	}

	// U64 _environmentId
	public UDATAPointer _environmentIdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__environmentIdOffset_));
	}

	// bool _exclusiveAccessBeatenByOtherThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessBeatenByOtherThreadOffset_", declaredType="bool")
	public boolean _exclusiveAccessBeatenByOtherThread() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__exclusiveAccessBeatenByOtherThreadOffset_);
	}

	// bool _exclusiveAccessBeatenByOtherThread
	public BoolPointer _exclusiveAccessBeatenByOtherThreadEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__exclusiveAccessBeatenByOtherThreadOffset_));
	}

	// U64 _exclusiveAccessHaltedThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessHaltedThreadsOffset_", declaredType="U64")
	public UDATA _exclusiveAccessHaltedThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__exclusiveAccessHaltedThreadsOffset_));
	}

	// U64 _exclusiveAccessHaltedThreads
	public UDATAPointer _exclusiveAccessHaltedThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__exclusiveAccessHaltedThreadsOffset_));
	}

	// U64 _exclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _exclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__exclusiveAccessTimeOffset_));
	}

	// U64 _exclusiveAccessTime
	public UDATAPointer _exclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__exclusiveAccessTimeOffset_));
	}

	// U64 _exclusiveCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveCountOffset_", declaredType="U64")
	public UDATA _exclusiveCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__exclusiveCountOffset_));
	}

	// U64 _exclusiveCount
	public UDATAPointer _exclusiveCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__exclusiveCountOffset_));
	}

	// bool _failAllocOnExcessiveGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failAllocOnExcessiveGCOffset_", declaredType="bool")
	public boolean _failAllocOnExcessiveGC() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__failAllocOnExcessiveGCOffset_);
	}

	// bool _failAllocOnExcessiveGC
	public BoolPointer _failAllocOnExcessiveGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__failAllocOnExcessiveGCOffset_));
	}

	// MM_FreeEntrySizeClassStats _freeEntrySizeClassStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeEntrySizeClassStatsOffset_", declaredType="MM_FreeEntrySizeClassStats")
	public MM_FreeEntrySizeClassStatsPointer _freeEntrySizeClassStats() throws CorruptDataException {
		return MM_FreeEntrySizeClassStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__freeEntrySizeClassStatsOffset_));
	}

	// MM_FreeEntrySizeClassStats _freeEntrySizeClassStats
	public PointerPointer _freeEntrySizeClassStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__freeEntrySizeClassStatsOffset_));
	}

	// U64 _hotFieldCopyDepthCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hotFieldCopyDepthCountOffset_", declaredType="U64")
	public UDATA _hotFieldCopyDepthCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__hotFieldCopyDepthCountOffset_));
	}

	// U64 _hotFieldCopyDepthCount
	public UDATAPointer _hotFieldCopyDepthCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__hotFieldCopyDepthCountOffset_));
	}

	// bool _isInNoGCAllocationCall
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isInNoGCAllocationCallOffset_", declaredType="bool")
	public boolean _isInNoGCAllocationCall() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__isInNoGCAllocationCallOffset_);
	}

	// bool _isInNoGCAllocationCall
	public BoolPointer _isInNoGCAllocationCallEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__isInNoGCAllocationCallOffset_));
	}

	// OMR_VMThread* _lastExclusiveAccessResponder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastExclusiveAccessResponderOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _lastExclusiveAccessResponder() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__lastExclusiveAccessResponderOffset_));
	}

	// OMR_VMThread* _lastExclusiveAccessResponder
	public PointerPointer _lastExclusiveAccessResponderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__lastExclusiveAccessResponderOffset_));
	}

	// const U8* _lastSyncPointReached
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastSyncPointReachedOffset_", declaredType="const U8*")
	public U8Pointer _lastSyncPointReached() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_EnvironmentBase.__lastSyncPointReachedOffset_));
	}

	// const U8* _lastSyncPointReached
	public PointerPointer _lastSyncPointReachedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__lastSyncPointReachedOffset_));
	}

	// MM_MarkStats _markStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStatsOffset_", declaredType="MM_MarkStats")
	public MM_MarkStatsPointer _markStats() throws CorruptDataException {
		return MM_MarkStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__markStatsOffset_));
	}

	// MM_MarkStats _markStats
	public PointerPointer _markStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__markStatsOffset_));
	}

	// U64 _meanExclusiveAccessIdleTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meanExclusiveAccessIdleTimeOffset_", declaredType="U64")
	public UDATA _meanExclusiveAccessIdleTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__meanExclusiveAccessIdleTimeOffset_));
	}

	// U64 _meanExclusiveAccessIdleTime
	public UDATAPointer _meanExclusiveAccessIdleTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__meanExclusiveAccessIdleTimeOffset_));
	}

	// MM_ObjectAllocationInterface* _objectAllocationInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAllocationInterfaceOffset_", declaredType="MM_ObjectAllocationInterface*")
	public MM_ObjectAllocationInterfacePointer _objectAllocationInterface() throws CorruptDataException {
		return MM_ObjectAllocationInterfacePointer.cast(getPointerAtOffset(MM_EnvironmentBase.__objectAllocationInterfaceOffset_));
	}

	// MM_ObjectAllocationInterface* _objectAllocationInterface
	public PointerPointer _objectAllocationInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__objectAllocationInterfaceOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__omrVMOffset_));
	}

	// OMR_VMThread* _omrVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _omrVMThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__omrVMThreadOffset_));
	}

	// OMR_VMThread* _omrVMThread
	public PointerPointer _omrVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__omrVMThreadOffset_));
	}

	// U64 _oolTraceAllocationBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__oolTraceAllocationBytesOffset_", declaredType="U64")
	public UDATA _oolTraceAllocationBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__oolTraceAllocationBytesOffset_));
	}

	// U64 _oolTraceAllocationBytes
	public UDATAPointer _oolTraceAllocationBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__oolTraceAllocationBytesOffset_));
	}

	// OMRPortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer _portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(MM_EnvironmentBase.__portLibraryOffset_));
	}

	// OMRPortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__portLibraryOffset_));
	}

	// MM_HeapRegionQueue* _regionLocalFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionLocalFreeOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _regionLocalFree() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_EnvironmentBase.__regionLocalFreeOffset_));
	}

	// MM_HeapRegionQueue* _regionLocalFree
	public PointerPointer _regionLocalFreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__regionLocalFreeOffset_));
	}

	// MM_HeapRegionQueue* _regionLocalFull
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionLocalFullOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _regionLocalFull() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_EnvironmentBase.__regionLocalFullOffset_));
	}

	// MM_HeapRegionQueue* _regionLocalFull
	public PointerPointer _regionLocalFullEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__regionLocalFullOffset_));
	}

	// MM_HeapRegionQueue* _regionWorkList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionWorkListOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _regionWorkList() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_EnvironmentBase.__regionWorkListOffset_));
	}

	// MM_HeapRegionQueue* _regionWorkList
	public PointerPointer _regionWorkListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__regionWorkListOffset_));
	}

	// MM_RootScannerStats _rootScannerStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootScannerStatsOffset_", declaredType="MM_RootScannerStats")
	public MM_RootScannerStatsPointer _rootScannerStats() throws CorruptDataException {
		return MM_RootScannerStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__rootScannerStatsOffset_));
	}

	// MM_RootScannerStats _rootScannerStats
	public PointerPointer _rootScannerStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__rootScannerStatsOffset_));
	}

	// MM_ScavengerStats _scavengerStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerStatsOffset_", declaredType="MM_ScavengerStats")
	public MM_ScavengerStatsPointer _scavengerStats() throws CorruptDataException {
		return MM_ScavengerStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__scavengerStatsOffset_));
	}

	// MM_ScavengerStats _scavengerStats
	public PointerPointer _scavengerStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__scavengerStatsOffset_));
	}

	// MM_SweepStats _sweepStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepStatsOffset_", declaredType="MM_SweepStats")
	public MM_SweepStatsPointer _sweepStats() throws CorruptDataException {
		return MM_SweepStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__sweepStatsOffset_));
	}

	// MM_SweepStats _sweepStats
	public PointerPointer _sweepStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__sweepStatsOffset_));
	}

	// bool _threadScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadScannedOffset_", declaredType="bool")
	public boolean _threadScanned() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentBase.__threadScannedOffset_);
	}

	// bool _threadScanned
	public BoolPointer _threadScannedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__threadScannedOffset_));
	}

	// ThreadType _threadType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadTypeOffset_", declaredType="ThreadType")
	public long _threadType() throws CorruptDataException {
		if (ThreadType.SIZEOF == 1) {
			return getByteAtOffset(MM_EnvironmentBase.__threadTypeOffset_);
		} else if (ThreadType.SIZEOF == 2) {
			return getShortAtOffset(MM_EnvironmentBase.__threadTypeOffset_);
		} else if (ThreadType.SIZEOF == 4) {
			return getIntAtOffset(MM_EnvironmentBase.__threadTypeOffset_);
		} else if (ThreadType.SIZEOF == 8) {
			return getLongAtOffset(MM_EnvironmentBase.__threadTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ThreadType _threadType
	public EnumPointer _threadTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__threadTypeOffset_), ThreadType.class);
	}

	// U64 _traceAllocationBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceAllocationBytesOffset_", declaredType="U64")
	public UDATA _traceAllocationBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__traceAllocationBytesOffset_));
	}

	// U64 _traceAllocationBytes
	public UDATAPointer _traceAllocationBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__traceAllocationBytesOffset_));
	}

	// U64 _traceAllocationBytesCurrentTLH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceAllocationBytesCurrentTLHOffset_", declaredType="U64")
	public UDATA _traceAllocationBytesCurrentTLH() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__traceAllocationBytesCurrentTLHOffset_));
	}

	// U64 _traceAllocationBytesCurrentTLH
	public UDATAPointer _traceAllocationBytesCurrentTLHEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__traceAllocationBytesCurrentTLHOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketStatsOffset_", declaredType="MM_WorkPacketStats")
	public MM_WorkPacketStatsPointer _workPacketStats() throws CorruptDataException {
		return MM_WorkPacketStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workPacketStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	public PointerPointer _workPacketStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workPacketStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStatsRSScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketStatsRSScanOffset_", declaredType="MM_WorkPacketStats")
	public MM_WorkPacketStatsPointer _workPacketStatsRSScan() throws CorruptDataException {
		return MM_WorkPacketStatsPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workPacketStatsRSScanOffset_));
	}

	// MM_WorkPacketStats _workPacketStatsRSScan
	public PointerPointer _workPacketStatsRSScanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workPacketStatsRSScanOffset_));
	}

	// MM_WorkStack _workStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStackOffset_", declaredType="MM_WorkStack")
	public MM_WorkStackPointer _workStack() throws CorruptDataException {
		return MM_WorkStackPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workStackOffset_));
	}

	// MM_WorkStack _workStack
	public PointerPointer _workStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workStackOffset_));
	}

	// U64 _workUnitIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workUnitIndexOffset_", declaredType="U64")
	public UDATA _workUnitIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__workUnitIndexOffset_));
	}

	// U64 _workUnitIndex
	public UDATAPointer _workUnitIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workUnitIndexOffset_));
	}

	// U64 _workUnitToHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workUnitToHandleOffset_", declaredType="U64")
	public UDATA _workUnitToHandle() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__workUnitToHandleOffset_));
	}

	// U64 _workUnitToHandle
	public UDATAPointer _workUnitToHandleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workUnitToHandleOffset_));
	}

	// U64 _workerID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workerIDOffset_", declaredType="U64")
	public UDATA _workerID() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__workerIDOffset_));
	}

	// U64 _workerID
	public UDATAPointer _workerIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workerIDOffset_));
	}

	// U64 _workerThreadCpuTimeNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workerThreadCpuTimeNanosOffset_", declaredType="U64")
	public UDATA _workerThreadCpuTimeNanos() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase.__workerThreadCpuTimeNanosOffset_));
	}

	// U64 _workerThreadCpuTimeNanos
	public UDATAPointer _workerThreadCpuTimeNanosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase.__workerThreadCpuTimeNanosOffset_));
	}

	// U64 approxScanCacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_approxScanCacheCountOffset_", declaredType="U64")
	public UDATA approxScanCacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentBase._approxScanCacheCountOffset_));
	}

	// U64 approxScanCacheCount
	public UDATAPointer approxScanCacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentBase._approxScanCacheCountOffset_));
	}

}
