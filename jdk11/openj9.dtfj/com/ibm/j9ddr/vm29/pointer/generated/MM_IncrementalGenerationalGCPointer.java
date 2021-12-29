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
 * Structure: MM_IncrementalGenerationalGCPointer
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
 * The generated code will provide getters for all elements in the MM_IncrementalGenerationalGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_IncrementalGenerationalGC.class)
public class MM_IncrementalGenerationalGCPointer extends MM_GlobalCollectorPointer {

	// NULL
	public static final MM_IncrementalGenerationalGCPointer NULL = new MM_IncrementalGenerationalGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_IncrementalGenerationalGCPointer(long address) {
		super(address);
	}

	public static MM_IncrementalGenerationalGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_IncrementalGenerationalGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_IncrementalGenerationalGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_IncrementalGenerationalGCPointer(address);
	}

	public MM_IncrementalGenerationalGCPointer add(long count) {
		return MM_IncrementalGenerationalGCPointer.cast(address + (MM_IncrementalGenerationalGC.SIZEOF * count));
	}

	public MM_IncrementalGenerationalGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_IncrementalGenerationalGCPointer addOffset(long offset) {
		return MM_IncrementalGenerationalGCPointer.cast(address + offset);
	}

	public MM_IncrementalGenerationalGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_IncrementalGenerationalGCPointer sub(long count) {
		return MM_IncrementalGenerationalGCPointer.cast(address - (MM_IncrementalGenerationalGC.SIZEOF * count));
	}

	public MM_IncrementalGenerationalGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_IncrementalGenerationalGCPointer subOffset(long offset) {
		return MM_IncrementalGenerationalGCPointer.cast(address - offset);
	}

	public MM_IncrementalGenerationalGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_IncrementalGenerationalGCPointer untag(long mask) {
		return MM_IncrementalGenerationalGCPointer.cast(address & ~mask);
	}

	public MM_IncrementalGenerationalGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_IncrementalGenerationalGC.SIZEOF;
	}

	// Implementation methods

	// UDATA _allocatedSinceLastPGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocatedSinceLastPGCOffset_", declaredType="UDATA")
	public UDATA _allocatedSinceLastPGC() throws CorruptDataException {
		return getUDATAAtOffset(MM_IncrementalGenerationalGC.__allocatedSinceLastPGCOffset_);
	}

	// UDATA _allocatedSinceLastPGC
	public UDATAPointer _allocatedSinceLastPGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__allocatedSinceLastPGCOffset_));
	}

	// MM_ClassLoaderRememberedSet* _classLoaderRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderRememberedSetOffset_", declaredType="MM_ClassLoaderRememberedSet*")
	public MM_ClassLoaderRememberedSetPointer _classLoaderRememberedSet() throws CorruptDataException {
		return MM_ClassLoaderRememberedSetPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__classLoaderRememberedSetOffset_));
	}

	// MM_ClassLoaderRememberedSet* _classLoaderRememberedSet
	public PointerPointer _classLoaderRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__classLoaderRememberedSetOffset_));
	}

	// MM_CollectionSetDelegate _collectionSetDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionSetDelegateOffset_", declaredType="MM_CollectionSetDelegate")
	public MM_CollectionSetDelegatePointer _collectionSetDelegate() throws CorruptDataException {
		return MM_CollectionSetDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__collectionSetDelegateOffset_));
	}

	// MM_CollectionSetDelegate _collectionSetDelegate
	public PointerPointer _collectionSetDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__collectionSetDelegateOffset_));
	}

	// MM_ConcurrentPhaseStatsBase _concurrentPhaseStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentPhaseStatsOffset_", declaredType="MM_ConcurrentPhaseStatsBase")
	public MM_ConcurrentPhaseStatsBasePointer _concurrentPhaseStats() throws CorruptDataException {
		return MM_ConcurrentPhaseStatsBasePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__concurrentPhaseStatsOffset_));
	}

	// MM_ConcurrentPhaseStatsBase _concurrentPhaseStats
	public PointerPointer _concurrentPhaseStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__concurrentPhaseStatsOffset_));
	}

	// MM_MemorySubSpaceTarok* _configuredSubspace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__configuredSubspaceOffset_", declaredType="MM_MemorySubSpaceTarok*")
	public MM_MemorySubSpaceTarokPointer _configuredSubspace() throws CorruptDataException {
		return MM_MemorySubSpaceTarokPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__configuredSubspaceOffset_));
	}

	// MM_MemorySubSpaceTarok* _configuredSubspace
	public PointerPointer _configuredSubspaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__configuredSubspaceOffset_));
	}

	// MM_CopyForwardDelegate _copyForwardDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardDelegateOffset_", declaredType="MM_CopyForwardDelegate")
	public MM_CopyForwardDelegatePointer _copyForwardDelegate() throws CorruptDataException {
		return MM_CopyForwardDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__copyForwardDelegateOffset_));
	}

	// MM_CopyForwardDelegate _copyForwardDelegate
	public PointerPointer _copyForwardDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__copyForwardDelegateOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__extensionsOffset_));
	}

	// volatile bool _forceConcurrentTermination
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceConcurrentTerminationOffset_", declaredType="volatile bool")
	public boolean _forceConcurrentTermination() throws CorruptDataException {
		return getBoolAtOffset(MM_IncrementalGenerationalGC.__forceConcurrentTerminationOffset_);
	}

	// volatile bool _forceConcurrentTermination
	public BoolPointer _forceConcurrentTerminationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__forceConcurrentTerminationOffset_));
	}

	// MM_CollectionStatisticsVLHGC _globalCollectionStatistics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalCollectionStatisticsOffset_", declaredType="MM_CollectionStatisticsVLHGC")
	public MM_CollectionStatisticsVLHGCPointer _globalCollectionStatistics() throws CorruptDataException {
		return MM_CollectionStatisticsVLHGCPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__globalCollectionStatisticsOffset_));
	}

	// MM_CollectionStatisticsVLHGC _globalCollectionStatistics
	public PointerPointer _globalCollectionStatisticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__globalCollectionStatisticsOffset_));
	}

	// MM_GlobalMarkDelegate _globalMarkDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalMarkDelegateOffset_", declaredType="MM_GlobalMarkDelegate")
	public MM_GlobalMarkDelegatePointer _globalMarkDelegate() throws CorruptDataException {
		return MM_GlobalMarkDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__globalMarkDelegateOffset_));
	}

	// MM_GlobalMarkDelegate _globalMarkDelegate
	public PointerPointer _globalMarkDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__globalMarkDelegateOffset_));
	}

	// UDATA _globalMarkPhaseIncrementBytesStillToScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalMarkPhaseIncrementBytesStillToScanOffset_", declaredType="UDATA")
	public UDATA _globalMarkPhaseIncrementBytesStillToScan() throws CorruptDataException {
		return getUDATAAtOffset(MM_IncrementalGenerationalGC.__globalMarkPhaseIncrementBytesStillToScanOffset_);
	}

	// UDATA _globalMarkPhaseIncrementBytesStillToScan
	public UDATAPointer _globalMarkPhaseIncrementBytesStillToScanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__globalMarkPhaseIncrementBytesStillToScanOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetOffset_", declaredType="MM_InterRegionRememberedSet*")
	public MM_InterRegionRememberedSetPointer _interRegionRememberedSet() throws CorruptDataException {
		return MM_InterRegionRememberedSetPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__interRegionRememberedSetOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	public PointerPointer _interRegionRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__interRegionRememberedSetOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__javaVMOffset_));
	}

	// MM_MainGCThread _mainGCThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainGCThreadOffset_", declaredType="MM_MainGCThread")
	public MM_MainGCThreadPointer _mainGCThread() throws CorruptDataException {
		return MM_MainGCThreadPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__mainGCThreadOffset_));
	}

	// MM_MainGCThread _mainGCThread
	public PointerPointer _mainGCThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__mainGCThreadOffset_));
	}

	// MM_MarkMapManager* _markMapManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapManagerOffset_", declaredType="MM_MarkMapManager*")
	public MM_MarkMapManagerPointer _markMapManager() throws CorruptDataException {
		return MM_MarkMapManagerPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__markMapManagerOffset_));
	}

	// MM_MarkMapManager* _markMapManager
	public PointerPointer _markMapManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__markMapManagerOffset_));
	}

	// MM_CollectionStatisticsVLHGC _partialCollectionStatistics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__partialCollectionStatisticsOffset_", declaredType="MM_CollectionStatisticsVLHGC")
	public MM_CollectionStatisticsVLHGCPointer _partialCollectionStatistics() throws CorruptDataException {
		return MM_CollectionStatisticsVLHGCPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__partialCollectionStatisticsOffset_));
	}

	// MM_CollectionStatisticsVLHGC _partialCollectionStatistics
	public PointerPointer _partialCollectionStatisticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__partialCollectionStatisticsOffset_));
	}

	// MM_CycleStateVLHGC _persistentGlobalMarkPhaseState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__persistentGlobalMarkPhaseStateOffset_", declaredType="MM_CycleStateVLHGC")
	public MM_CycleStateVLHGCPointer _persistentGlobalMarkPhaseState() throws CorruptDataException {
		return MM_CycleStateVLHGCPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__persistentGlobalMarkPhaseStateOffset_));
	}

	// MM_CycleStateVLHGC _persistentGlobalMarkPhaseState
	public PointerPointer _persistentGlobalMarkPhaseStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__persistentGlobalMarkPhaseStateOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__portLibraryOffset_));
	}

	// MM_ProjectedSurvivalCollectionSetDelegate _projectedSurvivalCollectionSetDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedSurvivalCollectionSetDelegateOffset_", declaredType="MM_ProjectedSurvivalCollectionSetDelegate")
	public MM_ProjectedSurvivalCollectionSetDelegatePointer _projectedSurvivalCollectionSetDelegate() throws CorruptDataException {
		return MM_ProjectedSurvivalCollectionSetDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__projectedSurvivalCollectionSetDelegateOffset_));
	}

	// MM_ProjectedSurvivalCollectionSetDelegate _projectedSurvivalCollectionSetDelegate
	public PointerPointer _projectedSurvivalCollectionSetDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__projectedSurvivalCollectionSetDelegateOffset_));
	}

	// MM_ReclaimDelegate _reclaimDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimDelegateOffset_", declaredType="MM_ReclaimDelegate")
	public MM_ReclaimDelegatePointer _reclaimDelegate() throws CorruptDataException {
		return MM_ReclaimDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__reclaimDelegateOffset_));
	}

	// MM_ReclaimDelegate _reclaimDelegate
	public PointerPointer _reclaimDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__reclaimDelegateOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__regionManagerOffset_));
	}

	// MM_SchedulingDelegate _schedulingDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__schedulingDelegateOffset_", declaredType="MM_SchedulingDelegate")
	public MM_SchedulingDelegatePointer _schedulingDelegate() throws CorruptDataException {
		return MM_SchedulingDelegatePointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__schedulingDelegateOffset_));
	}

	// MM_SchedulingDelegate _schedulingDelegate
	public PointerPointer _schedulingDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__schedulingDelegateOffset_));
	}

	// UDATA _taxationThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__taxationThresholdOffset_", declaredType="UDATA")
	public UDATA _taxationThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_IncrementalGenerationalGC.__taxationThresholdOffset_);
	}

	// UDATA _taxationThreshold
	public UDATAPointer _taxationThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__taxationThresholdOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPacketsForGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsForGlobalGCOffset_", declaredType="MM_WorkPacketsVLHGC*")
	public MM_WorkPacketsVLHGCPointer _workPacketsForGlobalGC() throws CorruptDataException {
		return MM_WorkPacketsVLHGCPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__workPacketsForGlobalGCOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPacketsForGlobalGC
	public PointerPointer _workPacketsForGlobalGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__workPacketsForGlobalGCOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPacketsForPartialGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsForPartialGCOffset_", declaredType="MM_WorkPacketsVLHGC*")
	public MM_WorkPacketsVLHGCPointer _workPacketsForPartialGC() throws CorruptDataException {
		return MM_WorkPacketsVLHGCPointer.cast(getPointerAtOffset(MM_IncrementalGenerationalGC.__workPacketsForPartialGCOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPacketsForPartialGC
	public PointerPointer _workPacketsForPartialGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_IncrementalGenerationalGC.__workPacketsForPartialGCOffset_));
	}

}
