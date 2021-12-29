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
 * Structure: MM_ScavengerPointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Scavenger.class)
public class MM_ScavengerPointer extends MM_CollectorPointer {

	// NULL
	public static final MM_ScavengerPointer NULL = new MM_ScavengerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerPointer(long address) {
		super(address);
	}

	public static MM_ScavengerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerPointer(address);
	}

	public MM_ScavengerPointer add(long count) {
		return MM_ScavengerPointer.cast(address + (MM_Scavenger.SIZEOF * count));
	}

	public MM_ScavengerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerPointer addOffset(long offset) {
		return MM_ScavengerPointer.cast(address + offset);
	}

	public MM_ScavengerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerPointer sub(long count) {
		return MM_ScavengerPointer.cast(address - (MM_Scavenger.SIZEOF * count));
	}

	public MM_ScavengerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerPointer subOffset(long offset) {
		return MM_ScavengerPointer.cast(address - offset);
	}

	public MM_ScavengerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerPointer untag(long mask) {
		return MM_ScavengerPointer.cast(address & ~mask);
	}

	public MM_ScavengerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Scavenger.SIZEOF;
	}

	// Implementation methods

	// MM_MemorySubSpaceSemiSpace* _activeSubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeSubSpaceOffset_", declaredType="MM_MemorySubSpaceSemiSpace*")
	public MM_MemorySubSpaceSemiSpacePointer _activeSubSpace() throws CorruptDataException {
		return MM_MemorySubSpaceSemiSpacePointer.cast(getPointerAtOffset(MM_Scavenger.__activeSubSpaceOffset_));
	}

	// MM_MemorySubSpaceSemiSpace* _activeSubSpace
	public PointerPointer _activeSubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__activeSubSpaceOffset_));
	}

	// volatile U64 _backOutDoneIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backOutDoneIndexOffset_", declaredType="volatile U64")
	public UDATA _backOutDoneIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__backOutDoneIndexOffset_));
	}

	// volatile U64 _backOutDoneIndex
	public UDATAPointer _backOutDoneIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__backOutDoneIndexOffset_));
	}

	// U64 _cacheLineAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheLineAlignmentOffset_", declaredType="U64")
	public UDATA _cacheLineAlignment() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__cacheLineAlignmentOffset_));
	}

	// U64 _cacheLineAlignment
	public UDATAPointer _cacheLineAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__cacheLineAlignmentOffset_));
	}

	// volatile U64 _cachedEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedEntryCountOffset_", declaredType="volatile U64")
	public UDATA _cachedEntryCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__cachedEntryCountOffset_));
	}

	// volatile U64 _cachedEntryCount
	public UDATAPointer _cachedEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__cachedEntryCountOffset_));
	}

	// bool _cachedSemiSpaceResizableFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedSemiSpaceResizableFlagOffset_", declaredType="bool")
	public boolean _cachedSemiSpaceResizableFlag() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__cachedSemiSpaceResizableFlagOffset_);
	}

	// bool _cachedSemiSpaceResizableFlag
	public BoolPointer _cachedSemiSpaceResizableFlagEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__cachedSemiSpaceResizableFlagOffset_));
	}

	// U64 _cachesPerThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachesPerThreadOffset_", declaredType="U64")
	public UDATA _cachesPerThread() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__cachesPerThreadOffset_));
	}

	// U64 _cachesPerThread
	public UDATAPointer _cachesPerThreadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__cachesPerThreadOffset_));
	}

	// MM_CollectionStatisticsStandard _collectionStatistics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionStatisticsOffset_", declaredType="MM_CollectionStatisticsStandard")
	public MM_CollectionStatisticsStandardPointer _collectionStatistics() throws CorruptDataException {
		return MM_CollectionStatisticsStandardPointer.cast(nonNullFieldEA(MM_Scavenger.__collectionStatisticsOffset_));
	}

	// MM_CollectionStatisticsStandard _collectionStatistics
	public PointerPointer _collectionStatisticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__collectionStatisticsOffset_));
	}

	// volatile MM_Scavenger$ConcurrentState _concurrentPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentPhaseOffset_", declaredType="volatile MM_Scavenger$ConcurrentState")
	public long _concurrentPhase() throws CorruptDataException {
		if (MM_Scavenger$ConcurrentState.SIZEOF == 1) {
			return getByteAtOffset(MM_Scavenger.__concurrentPhaseOffset_);
		} else if (MM_Scavenger$ConcurrentState.SIZEOF == 2) {
			return getShortAtOffset(MM_Scavenger.__concurrentPhaseOffset_);
		} else if (MM_Scavenger$ConcurrentState.SIZEOF == 4) {
			return getIntAtOffset(MM_Scavenger.__concurrentPhaseOffset_);
		} else if (MM_Scavenger$ConcurrentState.SIZEOF == 8) {
			return getLongAtOffset(MM_Scavenger.__concurrentPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// volatile MM_Scavenger$ConcurrentState _concurrentPhase
	public EnumPointer _concurrentPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Scavenger.__concurrentPhaseOffset_), MM_Scavenger$ConcurrentState.class);
	}

	// MM_ConcurrentPhaseStatsBase _concurrentPhaseStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentPhaseStatsOffset_", declaredType="MM_ConcurrentPhaseStatsBase")
	public MM_ConcurrentPhaseStatsBasePointer _concurrentPhaseStats() throws CorruptDataException {
		return MM_ConcurrentPhaseStatsBasePointer.cast(nonNullFieldEA(MM_Scavenger.__concurrentPhaseStatsOffset_));
	}

	// MM_ConcurrentPhaseStatsBase _concurrentPhaseStats
	public PointerPointer _concurrentPhaseStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__concurrentPhaseStatsOffset_));
	}

	// U64 _concurrentScavengerSwitchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentScavengerSwitchCountOffset_", declaredType="U64")
	public UDATA _concurrentScavengerSwitchCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__concurrentScavengerSwitchCountOffset_));
	}

	// U64 _concurrentScavengerSwitchCount
	public UDATAPointer _concurrentScavengerSwitchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__concurrentScavengerSwitchCountOffset_));
	}

	// U64 _countSinceForcingGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countSinceForcingGlobalGCOffset_", declaredType="U64")
	public UDATA _countSinceForcingGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__countSinceForcingGlobalGCOffset_));
	}

	// U64 _countSinceForcingGlobalGC
	public UDATAPointer _countSinceForcingGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__countSinceForcingGlobalGCOffset_));
	}

	// bool _currentPhaseConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentPhaseConcurrentOffset_", declaredType="bool")
	public boolean _currentPhaseConcurrent() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__currentPhaseConcurrentOffset_);
	}

	// bool _currentPhaseConcurrent
	public BoolPointer _currentPhaseConcurrentEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__currentPhaseConcurrentOffset_));
	}

	// MM_CycleState _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(nonNullFieldEA(MM_Scavenger.__cycleStateOffset_));
	}

	// MM_CycleState _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__cycleStateOffset_));
	}

	// MM_ScavengerDelegate _delegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__delegateOffset_", declaredType="MM_ScavengerDelegate")
	public MM_ScavengerDelegatePointer _delegate() throws CorruptDataException {
		return MM_ScavengerDelegatePointer.cast(nonNullFieldEA(MM_Scavenger.__delegateOffset_));
	}

	// MM_ScavengerDelegate _delegate
	public PointerPointer _delegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__delegateOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_Scavenger.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__dispatcherOffset_));
	}

	// volatile U64 _doneIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doneIndexOffset_", declaredType="volatile U64")
	public UDATA _doneIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__doneIndexOffset_));
	}

	// volatile U64 _doneIndex
	public UDATAPointer _doneIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__doneIndexOffset_));
	}

	// MM_MemorySubSpace* _evacuateMemorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__evacuateMemorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _evacuateMemorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_Scavenger.__evacuateMemorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _evacuateMemorySubSpace
	public PointerPointer _evacuateMemorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__evacuateMemorySubSpaceOffset_));
	}

	// void* _evacuateSpaceBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__evacuateSpaceBaseOffset_", declaredType="void*")
	public VoidPointer _evacuateSpaceBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__evacuateSpaceBaseOffset_));
	}

	// void* _evacuateSpaceBase
	public PointerPointer _evacuateSpaceBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__evacuateSpaceBaseOffset_));
	}

	// void* _evacuateSpaceTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__evacuateSpaceTopOffset_", declaredType="void*")
	public VoidPointer _evacuateSpaceTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__evacuateSpaceTopOffset_));
	}

	// void* _evacuateSpaceTop
	public PointerPointer _evacuateSpaceTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__evacuateSpaceTopOffset_));
	}

	// bool _expandFailed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expandFailedOffset_", declaredType="bool")
	public boolean _expandFailed() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__expandFailedOffset_);
	}

	// bool _expandFailed
	public BoolPointer _expandFailedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__expandFailedOffset_));
	}

	// bool _expandTenureOnFailedAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expandTenureOnFailedAllocateOffset_", declaredType="bool")
	public boolean _expandTenureOnFailedAllocate() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__expandTenureOnFailedAllocateOffset_);
	}

	// bool _expandTenureOnFailedAllocate
	public BoolPointer _expandTenureOnFailedAllocateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__expandTenureOnFailedAllocateOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_Scavenger.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__extensionsOffset_));
	}

	// U64 _failedTenureLargestObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureLargestObjectOffset_", declaredType="U64")
	public UDATA _failedTenureLargestObject() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__failedTenureLargestObjectOffset_));
	}

	// U64 _failedTenureLargestObject
	public UDATAPointer _failedTenureLargestObjectEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__failedTenureLargestObjectOffset_));
	}

	// bool _failedTenureThresholdReached
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureThresholdReachedOffset_", declaredType="bool")
	public boolean _failedTenureThresholdReached() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__failedTenureThresholdReachedOffset_);
	}

	// bool _failedTenureThresholdReached
	public BoolPointer _failedTenureThresholdReachedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__failedTenureThresholdReachedOffset_));
	}

	// omrthread_monitor_t _freeCacheMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeCacheMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _freeCacheMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_Scavenger.__freeCacheMonitorOffset_));
	}

	// omrthread_monitor_t _freeCacheMonitor
	public PointerPointer _freeCacheMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__freeCacheMonitorOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__heapBaseOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__heapTopOffset_));
	}

	// bool _isRememberedSetInOverflowAtTheBeginning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isRememberedSetInOverflowAtTheBeginningOffset_", declaredType="bool")
	public boolean _isRememberedSetInOverflowAtTheBeginning() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__isRememberedSetInOverflowAtTheBeginningOffset_);
	}

	// bool _isRememberedSetInOverflowAtTheBeginning
	public BoolPointer _isRememberedSetInOverflowAtTheBeginningEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__isRememberedSetInOverflowAtTheBeginningOffset_));
	}

	// MM_MainGCThread _mainGCThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainGCThreadOffset_", declaredType="MM_MainGCThread")
	public MM_MainGCThreadPointer _mainGCThread() throws CorruptDataException {
		return MM_MainGCThreadPointer.cast(nonNullFieldEA(MM_Scavenger.__mainGCThreadOffset_));
	}

	// MM_MainGCThread _mainGCThread
	public PointerPointer _mainGCThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__mainGCThreadOffset_));
	}

	// U64 _minSemiSpaceFailureSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minSemiSpaceFailureSizeOffset_", declaredType="U64")
	public UDATA _minSemiSpaceFailureSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__minSemiSpaceFailureSizeOffset_));
	}

	// U64 _minSemiSpaceFailureSize
	public UDATAPointer _minSemiSpaceFailureSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__minSemiSpaceFailureSizeOffset_));
	}

	// U64 _minTenureFailureSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minTenureFailureSizeOffset_", declaredType="U64")
	public UDATA _minTenureFailureSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__minTenureFailureSizeOffset_));
	}

	// U64 _minTenureFailureSize
	public UDATAPointer _minTenureFailureSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__minTenureFailureSizeOffset_));
	}

	// const U64 _objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentInBytesOffset_", declaredType="const U64")
	public UDATA _objectAlignmentInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__objectAlignmentInBytesOffset_));
	}

	// const U64 _objectAlignmentInBytes
	public UDATAPointer _objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__objectAlignmentInBytesOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_Scavenger.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__omrVMOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_Scavenger.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__regionManagerOffset_));
	}

	// volatile bool _rescanThreadsForRememberedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rescanThreadsForRememberedObjectsOffset_", declaredType="volatile bool")
	public boolean _rescanThreadsForRememberedObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__rescanThreadsForRememberedObjectsOffset_);
	}

	// volatile bool _rescanThreadsForRememberedObjects
	public BoolPointer _rescanThreadsForRememberedObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__rescanThreadsForRememberedObjectsOffset_));
	}

	// omrthread_monitor_t _scanCacheMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _scanCacheMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_Scavenger.__scanCacheMonitorOffset_));
	}

	// omrthread_monitor_t _scanCacheMonitor
	public PointerPointer _scanCacheMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__scanCacheMonitorOffset_));
	}

	// MM_CopyScanCacheList _scavengeCacheFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengeCacheFreeListOffset_", declaredType="MM_CopyScanCacheList")
	public MM_CopyScanCacheListPointer _scavengeCacheFreeList() throws CorruptDataException {
		return MM_CopyScanCacheListPointer.cast(nonNullFieldEA(MM_Scavenger.__scavengeCacheFreeListOffset_));
	}

	// MM_CopyScanCacheList _scavengeCacheFreeList
	public PointerPointer _scavengeCacheFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__scavengeCacheFreeListOffset_));
	}

	// MM_CopyScanCacheList _scavengeCacheScanList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengeCacheScanListOffset_", declaredType="MM_CopyScanCacheList")
	public MM_CopyScanCacheListPointer _scavengeCacheScanList() throws CorruptDataException {
		return MM_CopyScanCacheListPointer.cast(nonNullFieldEA(MM_Scavenger.__scavengeCacheScanListOffset_));
	}

	// MM_CopyScanCacheList _scavengeCacheScanList
	public PointerPointer _scavengeCacheScanListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__scavengeCacheScanListOffset_));
	}

	// volatile bool _shouldYield
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldYieldOffset_", declaredType="volatile bool")
	public boolean _shouldYield() throws CorruptDataException {
		return getBoolAtOffset(MM_Scavenger.__shouldYieldOffset_);
	}

	// volatile bool _shouldYield
	public BoolPointer _shouldYieldEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scavenger.__shouldYieldOffset_));
	}

	// MM_MemorySubSpace* _survivorMemorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorMemorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _survivorMemorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_Scavenger.__survivorMemorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _survivorMemorySubSpace
	public PointerPointer _survivorMemorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__survivorMemorySubSpaceOffset_));
	}

	// void* _survivorSpaceBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorSpaceBaseOffset_", declaredType="void*")
	public VoidPointer _survivorSpaceBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__survivorSpaceBaseOffset_));
	}

	// void* _survivorSpaceBase
	public PointerPointer _survivorSpaceBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__survivorSpaceBaseOffset_));
	}

	// void* _survivorSpaceTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorSpaceTopOffset_", declaredType="void*")
	public VoidPointer _survivorSpaceTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_Scavenger.__survivorSpaceTopOffset_));
	}

	// void* _survivorSpaceTop
	public PointerPointer _survivorSpaceTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__survivorSpaceTopOffset_));
	}

	// U64 _tenureMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureMaskOffset_", declaredType="U64")
	public UDATA _tenureMask() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__tenureMaskOffset_));
	}

	// U64 _tenureMask
	public UDATAPointer _tenureMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__tenureMaskOffset_));
	}

	// MM_MemorySubSpace* _tenureMemorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureMemorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _tenureMemorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_Scavenger.__tenureMemorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _tenureMemorySubSpace
	public PointerPointer _tenureMemorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scavenger.__tenureMemorySubSpaceOffset_));
	}

	// volatile U64 _waitingCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__waitingCountOffset_", declaredType="volatile U64")
	public UDATA _waitingCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__waitingCountOffset_));
	}

	// volatile U64 _waitingCount
	public UDATAPointer _waitingCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__waitingCountOffset_));
	}

	// U64 _waitingCountAliasThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__waitingCountAliasThresholdOffset_", declaredType="U64")
	public UDATA _waitingCountAliasThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scavenger.__waitingCountAliasThresholdOffset_));
	}

	// U64 _waitingCountAliasThreshold
	public UDATAPointer _waitingCountAliasThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scavenger.__waitingCountAliasThresholdOffset_));
	}

}
