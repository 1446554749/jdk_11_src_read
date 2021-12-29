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
 * Structure: MM_CopyForwardSchemePointer
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
 * The generated code will provide getters for all elements in the MM_CopyForwardSchemePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyForwardScheme.class)
public class MM_CopyForwardSchemePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_CopyForwardSchemePointer NULL = new MM_CopyForwardSchemePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyForwardSchemePointer(long address) {
		super(address);
	}

	public static MM_CopyForwardSchemePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyForwardSchemePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyForwardSchemePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyForwardSchemePointer(address);
	}

	public MM_CopyForwardSchemePointer add(long count) {
		return MM_CopyForwardSchemePointer.cast(address + (MM_CopyForwardScheme.SIZEOF * count));
	}

	public MM_CopyForwardSchemePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyForwardSchemePointer addOffset(long offset) {
		return MM_CopyForwardSchemePointer.cast(address + offset);
	}

	public MM_CopyForwardSchemePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyForwardSchemePointer sub(long count) {
		return MM_CopyForwardSchemePointer.cast(address - (MM_CopyForwardScheme.SIZEOF * count));
	}

	public MM_CopyForwardSchemePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyForwardSchemePointer subOffset(long offset) {
		return MM_CopyForwardSchemePointer.cast(address - offset);
	}

	public MM_CopyForwardSchemePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyForwardSchemePointer untag(long mask) {
		return MM_CopyForwardSchemePointer.cast(address & ~mask);
	}

	public MM_CopyForwardSchemePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyForwardScheme.SIZEOF;
	}

	// Implementation methods

	// volatile bool _abortFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abortFlagOffset_", declaredType="volatile bool")
	public boolean _abortFlag() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__abortFlagOffset_);
	}

	// volatile bool _abortFlag
	public BoolPointer _abortFlagEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__abortFlagOffset_));
	}

	// bool _abortInProgress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abortInProgressOffset_", declaredType="bool")
	public boolean _abortInProgress() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__abortInProgressOffset_);
	}

	// bool _abortInProgress
	public BoolPointer _abortInProgressEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__abortInProgressOffset_));
	}

	// UDATA _arraySplitSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitSizeOffset_", declaredType="UDATA")
	public UDATA _arraySplitSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__arraySplitSizeOffset_);
	}

	// UDATA _arraySplitSize
	public UDATAPointer _arraySplitSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__arraySplitSizeOffset_));
	}

	// MM_CopyScanCacheListVLHGC _cacheFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheFreeListOffset_", declaredType="MM_CopyScanCacheListVLHGC")
	public MM_CopyScanCacheListVLHGCPointer _cacheFreeList() throws CorruptDataException {
		return MM_CopyScanCacheListVLHGCPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__cacheFreeListOffset_));
	}

	// MM_CopyScanCacheListVLHGC _cacheFreeList
	public PointerPointer _cacheFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__cacheFreeListOffset_));
	}

	// UDATA _cacheLineAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheLineAlignmentOffset_", declaredType="UDATA")
	public UDATA _cacheLineAlignment() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__cacheLineAlignmentOffset_);
	}

	// UDATA _cacheLineAlignment
	public UDATAPointer _cacheLineAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__cacheLineAlignmentOffset_));
	}

	// MM_CopyScanCacheListVLHGC* _cacheScanLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheScanListsOffset_", declaredType="MM_CopyScanCacheListVLHGC*")
	public MM_CopyScanCacheListVLHGCPointer _cacheScanLists() throws CorruptDataException {
		return MM_CopyScanCacheListVLHGCPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__cacheScanListsOffset_));
	}

	// MM_CopyScanCacheListVLHGC* _cacheScanLists
	public PointerPointer _cacheScanListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__cacheScanListsOffset_));
	}

	// bool _cacheTracingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheTracingEnabledOffset_", declaredType="bool")
	public boolean _cacheTracingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__cacheTracingEnabledOffset_);
	}

	// bool _cacheTracingEnabled
	public BoolPointer _cacheTracingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__cacheTracingEnabledOffset_));
	}

	// bool _clearableProcessingStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clearableProcessingStartedOffset_", declaredType="bool")
	public boolean _clearableProcessingStarted() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__clearableProcessingStartedOffset_);
	}

	// bool _clearableProcessingStarted
	public BoolPointer _clearableProcessingStartedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__clearableProcessingStartedOffset_));
	}

	// bool _collectStringConstantsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectStringConstantsEnabledOffset_", declaredType="bool")
	public boolean _collectStringConstantsEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__collectStringConstantsEnabledOffset_);
	}

	// bool _collectStringConstantsEnabled
	public BoolPointer _collectStringConstantsEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__collectStringConstantsEnabledOffset_));
	}

	// MM_AllocationContextTarok* _commonContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__commonContextOffset_", declaredType="MM_AllocationContextTarok*")
	public MM_AllocationContextTarokPointer _commonContext() throws CorruptDataException {
		return MM_AllocationContextTarokPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__commonContextOffset_));
	}

	// MM_AllocationContextTarok* _commonContext
	public PointerPointer _commonContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__commonContextOffset_));
	}

	// MM_CopyForwardCompactGroup* _compactGroupBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupBlockOffset_", declaredType="MM_CopyForwardCompactGroup*")
	public MM_CopyForwardCompactGroupPointer _compactGroupBlock() throws CorruptDataException {
		return MM_CopyForwardCompactGroupPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__compactGroupBlockOffset_));
	}

	// MM_CopyForwardCompactGroup* _compactGroupBlock
	public PointerPointer _compactGroupBlockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__compactGroupBlockOffset_));
	}

	// UDATA _compactGroupMaxCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupMaxCountOffset_", declaredType="UDATA")
	public UDATA _compactGroupMaxCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__compactGroupMaxCountOffset_);
	}

	// UDATA _compactGroupMaxCount
	public UDATAPointer _compactGroupMaxCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__compactGroupMaxCountOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__dispatcherOffset_));
	}

	// volatile UDATA _doneIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doneIndexOffset_", declaredType="volatile UDATA")
	public UDATA _doneIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__doneIndexOffset_);
	}

	// volatile UDATA _doneIndex
	public UDATAPointer _doneIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__doneIndexOffset_));
	}

	// bool _dynamicClassUnloadingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicClassUnloadingEnabledOffset_", declaredType="bool")
	public boolean _dynamicClassUnloadingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__dynamicClassUnloadingEnabledOffset_);
	}

	// bool _dynamicClassUnloadingEnabled
	public BoolPointer _dynamicClassUnloadingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__dynamicClassUnloadingEnabledOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__extensionsOffset_));
	}

	// volatile bool _failedToExpand
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedToExpandOffset_", declaredType="volatile bool")
	public boolean _failedToExpand() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__failedToExpandOffset_);
	}

	// volatile bool _failedToExpand
	public BoolPointer _failedToExpandEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__failedToExpandOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__heapBaseOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__heapTopOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetOffset_", declaredType="MM_InterRegionRememberedSet*")
	public MM_InterRegionRememberedSetPointer _interRegionRememberedSet() throws CorruptDataException {
		return MM_InterRegionRememberedSetPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__interRegionRememberedSetOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	public PointerPointer _interRegionRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__interRegionRememberedSetOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__javaVMOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__markMapOffset_));
	}

	// UDATA _maxCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxCacheSizeOffset_", declaredType="UDATA")
	public UDATA _maxCacheSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__maxCacheSizeOffset_);
	}

	// UDATA _maxCacheSize
	public UDATAPointer _maxCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__maxCacheSizeOffset_));
	}

	// UDATA _minCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minCacheSizeOffset_", declaredType="UDATA")
	public UDATA _minCacheSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__minCacheSizeOffset_);
	}

	// UDATA _minCacheSize
	public UDATAPointer _minCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__minCacheSizeOffset_));
	}

	// const UDATA _objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentInBytesOffset_", declaredType="const UDATA")
	public UDATA _objectAlignmentInBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__objectAlignmentInBytesOffset_);
	}

	// const UDATA _objectAlignmentInBytes
	public UDATAPointer _objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__objectAlignmentInBytesOffset_));
	}

	// UDATA _phantomReferenceRegionsToProcess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceRegionsToProcessOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceRegionsToProcess() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__phantomReferenceRegionsToProcessOffset_);
	}

	// UDATA _phantomReferenceRegionsToProcess
	public UDATAPointer _phantomReferenceRegionsToProcessEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__phantomReferenceRegionsToProcessOffset_));
	}

	// UDATA _regionCountCannotBeEvacuated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountCannotBeEvacuatedOffset_", declaredType="UDATA")
	public UDATA _regionCountCannotBeEvacuated() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__regionCountCannotBeEvacuatedOffset_);
	}

	// UDATA _regionCountCannotBeEvacuated
	public UDATAPointer _regionCountCannotBeEvacuatedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__regionCountCannotBeEvacuatedOffset_));
	}

	// UDATA _regionCountReservedNonEvacuated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountReservedNonEvacuatedOffset_", declaredType="UDATA")
	public UDATA _regionCountReservedNonEvacuated() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__regionCountReservedNonEvacuatedOffset_);
	}

	// UDATA _regionCountReservedNonEvacuated
	public UDATAPointer _regionCountReservedNonEvacuatedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__regionCountReservedNonEvacuatedOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__regionManagerOffset_));
	}

	// UDATA _regionSublistContentionThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionSublistContentionThresholdOffset_", declaredType="UDATA")
	public UDATA _regionSublistContentionThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__regionSublistContentionThresholdOffset_);
	}

	// UDATA _regionSublistContentionThreshold
	public UDATAPointer _regionSublistContentionThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__regionSublistContentionThresholdOffset_));
	}

	// MM_CopyForwardScheme$MM_ReservedRegionListHeader* _reservedRegionList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reservedRegionListOffset_", declaredType="MM_CopyForwardScheme$MM_ReservedRegionListHeader*")
	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer _reservedRegionList() throws CorruptDataException {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__reservedRegionListOffset_));
	}

	// MM_CopyForwardScheme$MM_ReservedRegionListHeader* _reservedRegionList
	public PointerPointer _reservedRegionListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__reservedRegionListOffset_));
	}

	// UDATA _scanCacheListSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheListSizeOffset_", declaredType="UDATA")
	public UDATA _scanCacheListSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__scanCacheListSizeOffset_);
	}

	// UDATA _scanCacheListSize
	public UDATAPointer _scanCacheListSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__scanCacheListSizeOffset_));
	}

	// omrthread_monitor_t _scanCacheMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _scanCacheMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__scanCacheMonitorOffset_));
	}

	// omrthread_monitor_t _scanCacheMonitor
	public PointerPointer _scanCacheMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__scanCacheMonitorOffset_));
	}

	// volatile UDATA _scanCacheWaitCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheWaitCountOffset_", declaredType="volatile UDATA")
	public UDATA _scanCacheWaitCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme.__scanCacheWaitCountOffset_);
	}

	// volatile UDATA _scanCacheWaitCount
	public UDATAPointer _scanCacheWaitCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__scanCacheWaitCountOffset_));
	}

	// bool _shouldScanFinalizableObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScanFinalizableObjectsOffset_", declaredType="bool")
	public boolean _shouldScanFinalizableObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__shouldScanFinalizableObjectsOffset_);
	}

	// bool _shouldScanFinalizableObjects
	public BoolPointer _shouldScanFinalizableObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__shouldScanFinalizableObjectsOffset_));
	}

	// bool _tracingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tracingEnabledOffset_", declaredType="bool")
	public boolean _tracingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardScheme.__tracingEnabledOffset_);
	}

	// bool _tracingEnabled
	public BoolPointer _tracingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__tracingEnabledOffset_));
	}

	// omrthread_monitor_t* _workQueueMonitorPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workQueueMonitorPtrOffset_", declaredType="omrthread_monitor_t*")
	public PointerPointer _workQueueMonitorPtr() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__workQueueMonitorPtrOffset_));
	}

	// omrthread_monitor_t* _workQueueMonitorPtr
	public PointerPointer _workQueueMonitorPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__workQueueMonitorPtrOffset_));
	}

	// volatile UDATA* _workQueueWaitCountPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workQueueWaitCountPtrOffset_", declaredType="volatile UDATA*")
	public UDATAPointer _workQueueWaitCountPtr() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(MM_CopyForwardScheme.__workQueueWaitCountPtrOffset_));
	}

	// volatile UDATA* _workQueueWaitCountPtr
	public PointerPointer _workQueueWaitCountPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme.__workQueueWaitCountPtrOffset_));
	}

}
