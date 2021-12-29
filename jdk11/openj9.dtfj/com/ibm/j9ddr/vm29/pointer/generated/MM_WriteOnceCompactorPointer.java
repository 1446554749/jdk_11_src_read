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
 * Structure: MM_WriteOnceCompactorPointer
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
 * The generated code will provide getters for all elements in the MM_WriteOnceCompactorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_WriteOnceCompactor.class)
public class MM_WriteOnceCompactorPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_WriteOnceCompactorPointer NULL = new MM_WriteOnceCompactorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_WriteOnceCompactorPointer(long address) {
		super(address);
	}

	public static MM_WriteOnceCompactorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_WriteOnceCompactorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_WriteOnceCompactorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_WriteOnceCompactorPointer(address);
	}

	public MM_WriteOnceCompactorPointer add(long count) {
		return MM_WriteOnceCompactorPointer.cast(address + (MM_WriteOnceCompactor.SIZEOF * count));
	}

	public MM_WriteOnceCompactorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_WriteOnceCompactorPointer addOffset(long offset) {
		return MM_WriteOnceCompactorPointer.cast(address + offset);
	}

	public MM_WriteOnceCompactorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_WriteOnceCompactorPointer sub(long count) {
		return MM_WriteOnceCompactorPointer.cast(address - (MM_WriteOnceCompactor.SIZEOF * count));
	}

	public MM_WriteOnceCompactorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_WriteOnceCompactorPointer subOffset(long offset) {
		return MM_WriteOnceCompactorPointer.cast(address - offset);
	}

	public MM_WriteOnceCompactorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_WriteOnceCompactorPointer untag(long mask) {
		return MM_WriteOnceCompactorPointer.cast(address & ~mask);
	}

	public MM_WriteOnceCompactorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_WriteOnceCompactor.SIZEOF;
	}

	// Implementation methods

	// MM_WriteOnceCompactor$MM_CompactGroupDestinations* _compactGroupDestinations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupDestinationsOffset_", declaredType="MM_WriteOnceCompactor$MM_CompactGroupDestinations*")
	public MM_WriteOnceCompactor$MM_CompactGroupDestinationsPointer _compactGroupDestinations() throws CorruptDataException {
		return MM_WriteOnceCompactor$MM_CompactGroupDestinationsPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__compactGroupDestinationsOffset_));
	}

	// MM_WriteOnceCompactor$MM_CompactGroupDestinations* _compactGroupDestinations
	public PointerPointer _compactGroupDestinationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__compactGroupDestinationsOffset_));
	}

	// WriteOnceCompactTableEntry* _compactTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactTableOffset_", declaredType="WriteOnceCompactTableEntry*")
	public WriteOnceCompactTableEntryPointer _compactTable() throws CorruptDataException {
		return WriteOnceCompactTableEntryPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__compactTableOffset_));
	}

	// WriteOnceCompactTableEntry* _compactTable
	public PointerPointer _compactTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__compactTableOffset_));
	}

	// MM_CycleState _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__cycleStateOffset_));
	}

	// MM_CycleState _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__cycleStateOffset_));
	}

	// const MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="const MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__dispatcherOffset_));
	}

	// const MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__dispatcherOffset_));
	}

	// const MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="const MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__extensionsOffset_));
	}

	// const MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__extensionsOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _fixupOnlyWorkList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupOnlyWorkListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _fixupOnlyWorkList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__fixupOnlyWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _fixupOnlyWorkList
	public PointerPointer _fixupOnlyWorkListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__fixupOnlyWorkListOffset_));
	}

	// const MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="const MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__heapOffset_));
	}

	// const MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__heapOffset_));
	}

	// const void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="const void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__heapBaseOffset_));
	}

	// const void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__heapBaseOffset_));
	}

	// const void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="const void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__heapTopOffset_));
	}

	// const void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__heapTopOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetOffset_", declaredType="MM_InterRegionRememberedSet*")
	public MM_InterRegionRememberedSetPointer _interRegionRememberedSet() throws CorruptDataException {
		return MM_InterRegionRememberedSetPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__interRegionRememberedSetOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	public PointerPointer _interRegionRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__interRegionRememberedSetOffset_));
	}

	// const J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="const J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__javaVMOffset_));
	}

	// const J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__javaVMOffset_));
	}

	// UDATA _lockCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockCountOffset_", declaredType="UDATA")
	public UDATA _lockCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_WriteOnceCompactor.__lockCountOffset_);
	}

	// UDATA _lockCount
	public UDATAPointer _lockCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__lockCountOffset_));
	}

	// bool _moveFinished
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveFinishedOffset_", declaredType="bool")
	public boolean _moveFinished() throws CorruptDataException {
		return getBoolAtOffset(MM_WriteOnceCompactor.__moveFinishedOffset_);
	}

	// bool _moveFinished
	public BoolPointer _moveFinishedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__moveFinishedOffset_));
	}

	// MM_MarkMap* _nextMarkMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextMarkMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _nextMarkMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__nextMarkMapOffset_));
	}

	// MM_MarkMap* _nextMarkMap
	public PointerPointer _nextMarkMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__nextMarkMapOffset_));
	}

	// const UDATA _objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentInBytesOffset_", declaredType="const UDATA")
	public UDATA _objectAlignmentInBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_WriteOnceCompactor.__objectAlignmentInBytesOffset_);
	}

	// const UDATA _objectAlignmentInBytes
	public UDATAPointer _objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__objectAlignmentInBytesOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _readyWorkList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readyWorkListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _readyWorkList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__readyWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _readyWorkList
	public PointerPointer _readyWorkListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__readyWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _readyWorkListHighPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readyWorkListHighPriorityOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _readyWorkListHighPriority() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__readyWorkListHighPriorityOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _readyWorkListHighPriority
	public PointerPointer _readyWorkListHighPriorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__readyWorkListHighPriorityOffset_));
	}

	// bool _rebuildFinished
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildFinishedOffset_", declaredType="bool")
	public boolean _rebuildFinished() throws CorruptDataException {
		return getBoolAtOffset(MM_WriteOnceCompactor.__rebuildFinishedOffset_);
	}

	// bool _rebuildFinished
	public BoolPointer _rebuildFinishedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__rebuildFinishedOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _rebuildWorkList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildWorkListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _rebuildWorkList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__rebuildWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _rebuildWorkList
	public PointerPointer _rebuildWorkListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__rebuildWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _rebuildWorkListHighPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildWorkListHighPriorityOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _rebuildWorkListHighPriority() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__rebuildWorkListHighPriorityOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _rebuildWorkListHighPriority
	public PointerPointer _rebuildWorkListHighPriorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__rebuildWorkListHighPriorityOffset_));
	}

	// const MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="const MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__regionManagerOffset_));
	}

	// const MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__regionManagerOffset_));
	}

	// const UDATA _regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionSizeOffset_", declaredType="const UDATA")
	public UDATA _regionSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_WriteOnceCompactor.__regionSizeOffset_);
	}

	// const UDATA _regionSize
	public UDATAPointer _regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__regionSizeOffset_));
	}

	// UDATA _threadsWaiting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsWaitingOffset_", declaredType="UDATA")
	public UDATA _threadsWaiting() throws CorruptDataException {
		return getUDATAAtOffset(MM_WriteOnceCompactor.__threadsWaitingOffset_);
	}

	// UDATA _threadsWaiting
	public UDATAPointer _threadsWaitingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__threadsWaitingOffset_));
	}

	// omrthread_monitor_t _workListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workListMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _workListMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_WriteOnceCompactor.__workListMonitorOffset_));
	}

	// omrthread_monitor_t _workListMonitor
	public PointerPointer _workListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WriteOnceCompactor.__workListMonitorOffset_));
	}

}
