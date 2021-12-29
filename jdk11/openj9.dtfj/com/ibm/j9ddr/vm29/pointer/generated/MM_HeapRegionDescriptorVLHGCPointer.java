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
 * Structure: MM_HeapRegionDescriptorVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDescriptorVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDescriptorVLHGC.class)
public class MM_HeapRegionDescriptorVLHGCPointer extends MM_HeapRegionDescriptorPointer {

	// NULL
	public static final MM_HeapRegionDescriptorVLHGCPointer NULL = new MM_HeapRegionDescriptorVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDescriptorVLHGCPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDescriptorVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDescriptorVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDescriptorVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDescriptorVLHGCPointer(address);
	}

	public MM_HeapRegionDescriptorVLHGCPointer add(long count) {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(address + (MM_HeapRegionDescriptorVLHGC.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDescriptorVLHGCPointer addOffset(long offset) {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(address + offset);
	}

	public MM_HeapRegionDescriptorVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorVLHGCPointer sub(long count) {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(address - (MM_HeapRegionDescriptorVLHGC.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDescriptorVLHGCPointer subOffset(long offset) {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(address - offset);
	}

	public MM_HeapRegionDescriptorVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorVLHGCPointer untag(long mask) {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(address & ~mask);
	}

	public MM_HeapRegionDescriptorVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDescriptorVLHGC.SIZEOF;
	}

	// Implementation methods

	// UDATA _age
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ageOffset_", declaredType="UDATA")
	public UDATA _age() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__ageOffset_);
	}

	// UDATA _age
	public UDATAPointer _ageEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__ageOffset_));
	}

	// MM_HeapRegionDataForAllocate _allocateData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocateDataOffset_", declaredType="MM_HeapRegionDataForAllocate")
	public MM_HeapRegionDataForAllocatePointer _allocateData() throws CorruptDataException {
		return MM_HeapRegionDataForAllocatePointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__allocateDataOffset_));
	}

	// MM_HeapRegionDataForAllocate _allocateData
	public PointerPointer _allocateDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__allocateDataOffset_));
	}

	// U64 _allocationAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationAgeOffset_", declaredType="U64")
	public UDATA _allocationAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorVLHGC.__allocationAgeOffset_));
	}

	// U64 _allocationAge
	public UDATAPointer _allocationAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__allocationAgeOffset_));
	}

	// double _allocationAgeSizeProduct
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationAgeSizeProductOffset_", declaredType="double")
	public double _allocationAgeSizeProduct() throws CorruptDataException {
		return getDoubleAtOffset(MM_HeapRegionDescriptorVLHGC.__allocationAgeSizeProductOffset_);
	}

	// double _allocationAgeSizeProduct
	public DoublePointer _allocationAgeSizeProductEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__allocationAgeSizeProductOffset_));
	}

	// J9PortVmemIdentifier _arrayletDoublemapID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletDoublemapIDOffset_", declaredType="J9PortVmemIdentifier")
	public J9PortVmemIdentifierPointer _arrayletDoublemapID() throws CorruptDataException {
		return J9PortVmemIdentifierPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__arrayletDoublemapIDOffset_));
	}

	// J9PortVmemIdentifier _arrayletDoublemapID
	public PointerPointer _arrayletDoublemapIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__arrayletDoublemapIDOffset_));
	}

	// MM_HeapRegionDataForCompactVLHGC _compactData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactDataOffset_", declaredType="MM_HeapRegionDataForCompactVLHGC")
	public MM_HeapRegionDataForCompactVLHGCPointer _compactData() throws CorruptDataException {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__compactDataOffset_));
	}

	// MM_HeapRegionDataForCompactVLHGC _compactData
	public PointerPointer _compactDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__compactDataOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _compactDestinationQueueNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactDestinationQueueNextOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _compactDestinationQueueNext() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__compactDestinationQueueNextOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _compactDestinationQueueNext
	public PointerPointer _compactDestinationQueueNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__compactDestinationQueueNextOffset_));
	}

	// bool _copyForwardData._evacuateSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_evacuateSetOffset_", declaredType="bool")
	public boolean _copyForwardData$_evacuateSet() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_evacuateSetOffset_);
	}

	// bool _copyForwardData._evacuateSet
	public BoolPointer _copyForwardData$_evacuateSetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_evacuateSetOffset_));
	}

	// bool _copyForwardData._initialLiveSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_initialLiveSetOffset_", declaredType="bool")
	public boolean _copyForwardData$_initialLiveSet() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_initialLiveSetOffset_);
	}

	// bool _copyForwardData._initialLiveSet
	public BoolPointer _copyForwardData$_initialLiveSetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_initialLiveSetOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _copyForwardData._nextRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_nextRegionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _copyForwardData$_nextRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_nextRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _copyForwardData._nextRegion
	public PointerPointer _copyForwardData$_nextRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_nextRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _copyForwardData._previousRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_previousRegionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _copyForwardData$_previousRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_previousRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _copyForwardData._previousRegion
	public PointerPointer _copyForwardData$_previousRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_previousRegionOffset_));
	}

	// bool _copyForwardData._requiresPhantomReferenceProcessing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_requiresPhantomReferenceProcessingOffset_", declaredType="bool")
	public boolean _copyForwardData$_requiresPhantomReferenceProcessing() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_requiresPhantomReferenceProcessingOffset_);
	}

	// bool _copyForwardData._requiresPhantomReferenceProcessing
	public BoolPointer _copyForwardData$_requiresPhantomReferenceProcessingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_requiresPhantomReferenceProcessingOffset_));
	}

	// volatile void* _copyForwardData._survivorBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_survivorBaseOffset_", declaredType="volatile void*")
	public VoidPointer _copyForwardData$_survivorBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_survivorBaseOffset_));
	}

	// volatile void* _copyForwardData._survivorBase
	public PointerPointer _copyForwardData$_survivorBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_survivorBaseOffset_));
	}

	// bool _copyForwardData._survivorSetAborted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardData$_survivorSetAbortedOffset_", declaredType="bool")
	public boolean _copyForwardData$_survivorSetAborted() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_survivorSetAbortedOffset_);
	}

	// bool _copyForwardData._survivorSetAborted
	public BoolPointer _copyForwardData$_survivorSetAbortedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__copyForwardData$_survivorSetAbortedOffset_));
	}

	// volatile UDATA _criticalRegionsInUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__criticalRegionsInUseOffset_", declaredType="volatile UDATA")
	public UDATA _criticalRegionsInUse() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__criticalRegionsInUseOffset_);
	}

	// volatile UDATA _criticalRegionsInUse
	public UDATAPointer _criticalRegionsInUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__criticalRegionsInUseOffset_));
	}

	// bool _defragmentationTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defragmentationTargetOffset_", declaredType="bool")
	public boolean _defragmentationTarget() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__defragmentationTargetOffset_);
	}

	// bool _defragmentationTarget
	public BoolPointer _defragmentationTargetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__defragmentationTargetOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _dynamicSelectionNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSelectionNextOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _dynamicSelectionNext() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__dynamicSelectionNextOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _dynamicSelectionNext
	public PointerPointer _dynamicSelectionNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__dynamicSelectionNextOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__extensionsOffset_));
	}

	// U64 _lowerAgeBound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowerAgeBoundOffset_", declaredType="U64")
	public UDATA _lowerAgeBound() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorVLHGC.__lowerAgeBoundOffset_));
	}

	// U64 _lowerAgeBound
	public UDATAPointer _lowerAgeBoundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__lowerAgeBoundOffset_));
	}

	// UDATA _markData._dynamicMarkCost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markData$_dynamicMarkCostOffset_", declaredType="UDATA")
	public UDATA _markData$_dynamicMarkCost() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__markData$_dynamicMarkCostOffset_);
	}

	// UDATA _markData._dynamicMarkCost
	public UDATAPointer _markData$_dynamicMarkCostEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__markData$_dynamicMarkCostOffset_));
	}

	// bool _markData._noEvacuation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markData$_noEvacuationOffset_", declaredType="bool")
	public boolean _markData$_noEvacuation() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__markData$_noEvacuationOffset_);
	}

	// bool _markData._noEvacuation
	public BoolPointer _markData$_noEvacuationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__markData$_noEvacuationOffset_));
	}

	// U8 _markData._overflowFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markData$_overflowFlagsOffset_", declaredType="U8")
	public U8 _markData$_overflowFlags() throws CorruptDataException {
		return new U8(getByteAtOffset(MM_HeapRegionDescriptorVLHGC.__markData$_overflowFlagsOffset_));
	}

	// U8 _markData._overflowFlags
	public U8Pointer _markData$_overflowFlagsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__markData$_overflowFlagsOffset_));
	}

	// bool _markData._shouldMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markData$_shouldMarkOffset_", declaredType="bool")
	public boolean _markData$_shouldMark() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__markData$_shouldMarkOffset_);
	}

	// bool _markData._shouldMark
	public BoolPointer _markData$_shouldMarkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__markData$_shouldMarkOffset_));
	}

	// bool _nextMarkMapCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextMarkMapClearedOffset_", declaredType="bool")
	public boolean _nextMarkMapCleared() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__nextMarkMapClearedOffset_);
	}

	// bool _nextMarkMapCleared
	public BoolPointer _nextMarkMapClearedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__nextMarkMapClearedOffset_));
	}

	// MM_OwnableSynchronizerObjectList _ownableSynchronizerObjectList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerObjectListOffset_", declaredType="MM_OwnableSynchronizerObjectList")
	public MM_OwnableSynchronizerObjectListPointer _ownableSynchronizerObjectList() throws CorruptDataException {
		return MM_OwnableSynchronizerObjectListPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__ownableSynchronizerObjectListOffset_));
	}

	// MM_OwnableSynchronizerObjectList _ownableSynchronizerObjectList
	public PointerPointer _ownableSynchronizerObjectListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__ownableSynchronizerObjectListOffset_));
	}

	// bool _previousMarkMapCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousMarkMapClearedOffset_", declaredType="bool")
	public boolean _previousMarkMapCleared() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__previousMarkMapClearedOffset_);
	}

	// bool _previousMarkMapCleared
	public BoolPointer _previousMarkMapClearedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__previousMarkMapClearedOffset_));
	}

	// UDATA _projectedLiveBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesOffset_);
	}

	// UDATA _projectedLiveBytes
	public UDATAPointer _projectedLiveBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesOffset_));
	}

	// IDATA _projectedLiveBytesDeviation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesDeviationOffset_", declaredType="IDATA")
	public IDATA _projectedLiveBytesDeviation() throws CorruptDataException {
		return getIDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesDeviationOffset_);
	}

	// IDATA _projectedLiveBytesDeviation
	public IDATAPointer _projectedLiveBytesDeviationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesDeviationOffset_));
	}

	// UDATA _projectedLiveBytesPreviousPGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesPreviousPGCOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesPreviousPGC() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesPreviousPGCOffset_);
	}

	// UDATA _projectedLiveBytesPreviousPGC
	public UDATAPointer _projectedLiveBytesPreviousPGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__projectedLiveBytesPreviousPGCOffset_));
	}

	// bool _reclaimData._shouldReclaim
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimData$_shouldReclaimOffset_", declaredType="bool")
	public boolean _reclaimData$_shouldReclaim() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__reclaimData$_shouldReclaimOffset_);
	}

	// bool _reclaimData._shouldReclaim
	public BoolPointer _reclaimData$_shouldReclaimEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__reclaimData$_shouldReclaimOffset_));
	}

	// MM_ReferenceObjectList _referenceObjectList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectListOffset_", declaredType="MM_ReferenceObjectList")
	public MM_ReferenceObjectListPointer _referenceObjectList() throws CorruptDataException {
		return MM_ReferenceObjectListPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__referenceObjectListOffset_));
	}

	// MM_ReferenceObjectList _referenceObjectList
	public PointerPointer _referenceObjectListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__referenceObjectListOffset_));
	}

	// MM_RememberedSetCardList _rememberedSetCardList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetCardListOffset_", declaredType="MM_RememberedSetCardList")
	public MM_RememberedSetCardListPointer _rememberedSetCardList() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__rememberedSetCardListOffset_));
	}

	// MM_RememberedSetCardList _rememberedSetCardList
	public PointerPointer _rememberedSetCardListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__rememberedSetCardListOffset_));
	}

	// MM_RememberedSetCard* _rsclBufferPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferPoolOffset_", declaredType="MM_RememberedSetCard*")
	public MM_RememberedSetCardPointer _rsclBufferPool() throws CorruptDataException {
		return MM_RememberedSetCardPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorVLHGC.__rsclBufferPoolOffset_));
	}

	// MM_RememberedSetCard* _rsclBufferPool
	public PointerPointer _rsclBufferPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__rsclBufferPoolOffset_));
	}

	// bool _sweepData._alreadySwept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepData$_alreadySweptOffset_", declaredType="bool")
	public boolean _sweepData$_alreadySwept() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptorVLHGC.__sweepData$_alreadySweptOffset_);
	}

	// bool _sweepData._alreadySwept
	public BoolPointer _sweepData$_alreadySweptEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__sweepData$_alreadySweptOffset_));
	}

	// UDATA _sweepData._lastGCNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepData$_lastGCNumberOffset_", declaredType="UDATA")
	public UDATA _sweepData$_lastGCNumber() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDescriptorVLHGC.__sweepData$_lastGCNumberOffset_);
	}

	// UDATA _sweepData._lastGCNumber
	public UDATAPointer _sweepData$_lastGCNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__sweepData$_lastGCNumberOffset_));
	}

	// MM_UnfinalizedObjectList _unfinalizedObjectList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unfinalizedObjectListOffset_", declaredType="MM_UnfinalizedObjectList")
	public MM_UnfinalizedObjectListPointer _unfinalizedObjectList() throws CorruptDataException {
		return MM_UnfinalizedObjectListPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__unfinalizedObjectListOffset_));
	}

	// MM_UnfinalizedObjectList _unfinalizedObjectList
	public PointerPointer _unfinalizedObjectListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__unfinalizedObjectListOffset_));
	}

	// U64 _upperAgeBound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__upperAgeBoundOffset_", declaredType="U64")
	public UDATA _upperAgeBound() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorVLHGC.__upperAgeBoundOffset_));
	}

	// U64 _upperAgeBound
	public UDATAPointer _upperAgeBoundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorVLHGC.__upperAgeBoundOffset_));
	}

}
