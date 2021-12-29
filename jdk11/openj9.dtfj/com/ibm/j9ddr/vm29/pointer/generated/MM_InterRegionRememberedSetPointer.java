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
 * Structure: MM_InterRegionRememberedSetPointer
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
 * The generated code will provide getters for all elements in the MM_InterRegionRememberedSetPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_InterRegionRememberedSet.class)
public class MM_InterRegionRememberedSetPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_InterRegionRememberedSetPointer NULL = new MM_InterRegionRememberedSetPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_InterRegionRememberedSetPointer(long address) {
		super(address);
	}

	public static MM_InterRegionRememberedSetPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_InterRegionRememberedSetPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_InterRegionRememberedSetPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_InterRegionRememberedSetPointer(address);
	}

	public MM_InterRegionRememberedSetPointer add(long count) {
		return MM_InterRegionRememberedSetPointer.cast(address + (MM_InterRegionRememberedSet.SIZEOF * count));
	}

	public MM_InterRegionRememberedSetPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_InterRegionRememberedSetPointer addOffset(long offset) {
		return MM_InterRegionRememberedSetPointer.cast(address + offset);
	}

	public MM_InterRegionRememberedSetPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_InterRegionRememberedSetPointer sub(long count) {
		return MM_InterRegionRememberedSetPointer.cast(address - (MM_InterRegionRememberedSet.SIZEOF * count));
	}

	public MM_InterRegionRememberedSetPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_InterRegionRememberedSetPointer subOffset(long offset) {
		return MM_InterRegionRememberedSetPointer.cast(address - offset);
	}

	public MM_InterRegionRememberedSetPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_InterRegionRememberedSetPointer untag(long mask) {
		return MM_InterRegionRememberedSetPointer.cast(address & ~mask);
	}

	public MM_InterRegionRememberedSetPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_InterRegionRememberedSet.SIZEOF;
	}

	// Implementation methods

	// volatile UDATA _beingRebuiltRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__beingRebuiltRegionCountOffset_", declaredType="volatile UDATA")
	public UDATA _beingRebuiltRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__beingRebuiltRegionCountOffset_);
	}

	// volatile UDATA _beingRebuiltRegionCount
	public UDATAPointer _beingRebuiltRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__beingRebuiltRegionCountOffset_));
	}

	// UDATA _bufferControlBlockCountPerRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferControlBlockCountPerRegionOffset_", declaredType="UDATA")
	public UDATA _bufferControlBlockCountPerRegion() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__bufferControlBlockCountPerRegionOffset_);
	}

	// UDATA _bufferControlBlockCountPerRegion
	public UDATAPointer _bufferControlBlockCountPerRegionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__bufferControlBlockCountPerRegionOffset_));
	}

	// UDATA _bufferCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferCountTotalOffset_", declaredType="UDATA")
	public UDATA _bufferCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__bufferCountTotalOffset_);
	}

	// UDATA _bufferCountTotal
	public UDATAPointer _bufferCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__bufferCountTotalOffset_));
	}

	// MM_CardTable* _cardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableOffset_", declaredType="MM_CardTable*")
	public MM_CardTablePointer _cardTable() throws CorruptDataException {
		return MM_CardTablePointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__cardTableOffset_));
	}

	// MM_CardTable* _cardTable
	public PointerPointer _cardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__cardTableOffset_));
	}

	// UDATA _cardToRegionDisplacement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardToRegionDisplacementOffset_", declaredType="UDATA")
	public UDATA _cardToRegionDisplacement() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__cardToRegionDisplacementOffset_);
	}

	// UDATA _cardToRegionDisplacement
	public UDATAPointer _cardToRegionDisplacementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__cardToRegionDisplacementOffset_));
	}

	// UDATA _cardToRegionShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardToRegionShiftOffset_", declaredType="UDATA")
	public UDATA _cardToRegionShift() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__cardToRegionShiftOffset_);
	}

	// UDATA _cardToRegionShift
	public UDATAPointer _cardToRegionShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__cardToRegionShiftOffset_));
	}

	// bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_InterRegionRememberedSet.__compressObjectReferencesOffset_);
	}

	// bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__compressObjectReferencesOffset_));
	}

	// volatile UDATA _freeBufferCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeBufferCountOffset_", declaredType="volatile UDATA")
	public UDATA _freeBufferCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__freeBufferCountOffset_);
	}

	// volatile UDATA _freeBufferCount
	public UDATAPointer _freeBufferCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__freeBufferCountOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__heapRegionManagerOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__lockOffset_));
	}

	// volatile MM_RememberedSetCardList* _overflowedListHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowedListHeadOffset_", declaredType="volatile MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _overflowedListHead() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__overflowedListHeadOffset_));
	}

	// volatile MM_RememberedSetCardList* _overflowedListHead
	public PointerPointer _overflowedListHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__overflowedListHeadOffset_));
	}

	// volatile MM_RememberedSetCardList* _overflowedListTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowedListTailOffset_", declaredType="volatile MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _overflowedListTail() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__overflowedListTailOffset_));
	}

	// volatile MM_RememberedSetCardList* _overflowedListTail
	public PointerPointer _overflowedListTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__overflowedListTailOffset_));
	}

	// volatile UDATA _overflowedRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowedRegionCountOffset_", declaredType="volatile UDATA")
	public UDATA _overflowedRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__overflowedRegionCountOffset_);
	}

	// volatile UDATA _overflowedRegionCount
	public UDATAPointer _overflowedRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__overflowedRegionCountOffset_));
	}

	// UDATA _regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionSizeOffset_", declaredType="UDATA")
	public UDATA _regionSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__regionSizeOffset_);
	}

	// UDATA _regionSize
	public UDATAPointer _regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__regionSizeOffset_));
	}

	// MM_HeapRegionDescriptor* _regionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionTableOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _regionTable() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__regionTableOffset_));
	}

	// MM_HeapRegionDescriptor* _regionTable
	public PointerPointer _regionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__regionTableOffset_));
	}

	// MM_RememberedSetCardBucket* _rememberedSetCardBucketPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetCardBucketPoolOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer _rememberedSetCardBucketPool() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__rememberedSetCardBucketPoolOffset_));
	}

	// MM_RememberedSetCardBucket* _rememberedSetCardBucketPool
	public PointerPointer _rememberedSetCardBucketPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__rememberedSetCardBucketPoolOffset_));
	}

	// volatile MM_CardBufferControlBlock* _rsclBufferControlBlockHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferControlBlockHeadOffset_", declaredType="volatile MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _rsclBufferControlBlockHead() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__rsclBufferControlBlockHeadOffset_));
	}

	// volatile MM_CardBufferControlBlock* _rsclBufferControlBlockHead
	public PointerPointer _rsclBufferControlBlockHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__rsclBufferControlBlockHeadOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferControlBlockPoolOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _rsclBufferControlBlockPool() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(MM_InterRegionRememberedSet.__rsclBufferControlBlockPoolOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockPool
	public PointerPointer _rsclBufferControlBlockPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__rsclBufferControlBlockPoolOffset_));
	}

	// bool _shouldFlushBuffersForDecommitedRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldFlushBuffersForDecommitedRegionsOffset_", declaredType="bool")
	public boolean _shouldFlushBuffersForDecommitedRegions() throws CorruptDataException {
		return getBoolAtOffset(MM_InterRegionRememberedSet.__shouldFlushBuffersForDecommitedRegionsOffset_);
	}

	// bool _shouldFlushBuffersForDecommitedRegions
	public BoolPointer _shouldFlushBuffersForDecommitedRegionsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__shouldFlushBuffersForDecommitedRegionsOffset_));
	}

	// UDATA _stableRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stableRegionCountOffset_", declaredType="UDATA")
	public UDATA _stableRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__stableRegionCountOffset_);
	}

	// UDATA _stableRegionCount
	public UDATAPointer _stableRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__stableRegionCountOffset_));
	}

	// UDATA _tableDescriptorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tableDescriptorSizeOffset_", declaredType="UDATA")
	public UDATA _tableDescriptorSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_InterRegionRememberedSet.__tableDescriptorSizeOffset_);
	}

	// UDATA _tableDescriptorSize
	public UDATAPointer _tableDescriptorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__tableDescriptorSizeOffset_));
	}

	// double _unusedRegionThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unusedRegionThresholdOffset_", declaredType="double")
	public double _unusedRegionThreshold() throws CorruptDataException {
		return getDoubleAtOffset(MM_InterRegionRememberedSet.__unusedRegionThresholdOffset_);
	}

	// double _unusedRegionThreshold
	public DoublePointer _unusedRegionThresholdEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_InterRegionRememberedSet.__unusedRegionThresholdOffset_));
	}

}
