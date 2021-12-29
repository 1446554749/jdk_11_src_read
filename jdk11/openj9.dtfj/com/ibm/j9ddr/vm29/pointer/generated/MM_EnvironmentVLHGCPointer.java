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
 * Structure: MM_EnvironmentVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_EnvironmentVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_EnvironmentVLHGC.class)
public class MM_EnvironmentVLHGCPointer extends MM_EnvironmentBasePointer {

	// NULL
	public static final MM_EnvironmentVLHGCPointer NULL = new MM_EnvironmentVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_EnvironmentVLHGCPointer(long address) {
		super(address);
	}

	public static MM_EnvironmentVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_EnvironmentVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_EnvironmentVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_EnvironmentVLHGCPointer(address);
	}

	public MM_EnvironmentVLHGCPointer add(long count) {
		return MM_EnvironmentVLHGCPointer.cast(address + (MM_EnvironmentVLHGC.SIZEOF * count));
	}

	public MM_EnvironmentVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_EnvironmentVLHGCPointer addOffset(long offset) {
		return MM_EnvironmentVLHGCPointer.cast(address + offset);
	}

	public MM_EnvironmentVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_EnvironmentVLHGCPointer sub(long count) {
		return MM_EnvironmentVLHGCPointer.cast(address - (MM_EnvironmentVLHGC.SIZEOF * count));
	}

	public MM_EnvironmentVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_EnvironmentVLHGCPointer subOffset(long offset) {
		return MM_EnvironmentVLHGCPointer.cast(address - offset);
	}

	public MM_EnvironmentVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_EnvironmentVLHGCPointer untag(long mask) {
		return MM_EnvironmentVLHGCPointer.cast(address & ~mask);
	}

	public MM_EnvironmentVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_EnvironmentVLHGC.SIZEOF;
	}

	// Implementation methods

	// MM_CompactVLHGCStats _compactVLHGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactVLHGCStatsOffset_", declaredType="MM_CompactVLHGCStats")
	public MM_CompactVLHGCStatsPointer _compactVLHGCStats() throws CorruptDataException {
		return MM_CompactVLHGCStatsPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__compactVLHGCStatsOffset_));
	}

	// MM_CompactVLHGCStats _compactVLHGCStats
	public PointerPointer _compactVLHGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__compactVLHGCStatsOffset_));
	}

	// MM_CopyForwardCompactGroup* _copyForwardCompactGroups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardCompactGroupsOffset_", declaredType="MM_CopyForwardCompactGroup*")
	public MM_CopyForwardCompactGroupPointer _copyForwardCompactGroups() throws CorruptDataException {
		return MM_CopyForwardCompactGroupPointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__copyForwardCompactGroupsOffset_));
	}

	// MM_CopyForwardCompactGroup* _copyForwardCompactGroups
	public PointerPointer _copyForwardCompactGroupsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__copyForwardCompactGroupsOffset_));
	}

	// MM_CopyForwardStats _copyForwardStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardStatsOffset_", declaredType="MM_CopyForwardStats")
	public MM_CopyForwardStatsPointer _copyForwardStats() throws CorruptDataException {
		return MM_CopyForwardStatsPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__copyForwardStatsOffset_));
	}

	// MM_CopyForwardStats _copyForwardStats
	public PointerPointer _copyForwardStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__copyForwardStatsOffset_));
	}

	// MM_CopyScanCache* _deferredScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredScanCacheOffset_", declaredType="MM_CopyScanCache*")
	public MM_CopyScanCachePointer _deferredScanCache() throws CorruptDataException {
		return MM_CopyScanCachePointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__deferredScanCacheOffset_));
	}

	// MM_CopyScanCache* _deferredScanCache
	public PointerPointer _deferredScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__deferredScanCacheOffset_));
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__irrsStatsOffset_", declaredType="MM_InterRegionRememberedSetStats")
	public MM_InterRegionRememberedSetStatsPointer _irrsStats() throws CorruptDataException {
		return MM_InterRegionRememberedSetStatsPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__irrsStatsOffset_));
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	public PointerPointer _irrsStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__irrsStatsOffset_));
	}

	// MM_RememberedSetCardList* _lastOverflowedRsclWithReleasedBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastOverflowedRsclWithReleasedBuffersOffset_", declaredType="MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _lastOverflowedRsclWithReleasedBuffers() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__lastOverflowedRsclWithReleasedBuffersOffset_));
	}

	// MM_RememberedSetCardList* _lastOverflowedRsclWithReleasedBuffers
	public PointerPointer _lastOverflowedRsclWithReleasedBuffersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__lastOverflowedRsclWithReleasedBuffersOffset_));
	}

	// MM_MarkVLHGCStats _markVLHGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markVLHGCStatsOffset_", declaredType="MM_MarkVLHGCStats")
	public MM_MarkVLHGCStatsPointer _markVLHGCStats() throws CorruptDataException {
		return MM_MarkVLHGCStatsPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__markVLHGCStatsOffset_));
	}

	// MM_MarkVLHGCStats _markVLHGCStats
	public PointerPointer _markVLHGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__markVLHGCStatsOffset_));
	}

	// UDATA _previousConcurrentYieldCheckBytesScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousConcurrentYieldCheckBytesScannedOffset_", declaredType="UDATA")
	public UDATA _previousConcurrentYieldCheckBytesScanned() throws CorruptDataException {
		return getUDATAAtOffset(MM_EnvironmentVLHGC.__previousConcurrentYieldCheckBytesScannedOffset_);
	}

	// UDATA _previousConcurrentYieldCheckBytesScanned
	public UDATAPointer _previousConcurrentYieldCheckBytesScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__previousConcurrentYieldCheckBytesScannedOffset_));
	}

	// MM_RememberedSetCardBucket* _rememberedSetCardBucketPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetCardBucketPoolOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer _rememberedSetCardBucketPool() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__rememberedSetCardBucketPoolOffset_));
	}

	// MM_RememberedSetCardBucket* _rememberedSetCardBucketPool
	public PointerPointer _rememberedSetCardBucketPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__rememberedSetCardBucketPoolOffset_));
	}

	// IDATA _rsclBufferControlBlockCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferControlBlockCountOffset_", declaredType="IDATA")
	public IDATA _rsclBufferControlBlockCount() throws CorruptDataException {
		return getIDATAAtOffset(MM_EnvironmentVLHGC.__rsclBufferControlBlockCountOffset_);
	}

	// IDATA _rsclBufferControlBlockCount
	public IDATAPointer _rsclBufferControlBlockCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__rsclBufferControlBlockCountOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferControlBlockHeadOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _rsclBufferControlBlockHead() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__rsclBufferControlBlockHeadOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockHead
	public PointerPointer _rsclBufferControlBlockHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__rsclBufferControlBlockHeadOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclBufferControlBlockTailOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _rsclBufferControlBlockTail() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__rsclBufferControlBlockTailOffset_));
	}

	// MM_CardBufferControlBlock* _rsclBufferControlBlockTail
	public PointerPointer _rsclBufferControlBlockTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__rsclBufferControlBlockTailOffset_));
	}

	// MM_CopyScanCache* _scanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheOffset_", declaredType="MM_CopyScanCache*")
	public MM_CopyScanCachePointer _scanCache() throws CorruptDataException {
		return MM_CopyScanCachePointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__scanCacheOffset_));
	}

	// MM_CopyScanCache* _scanCache
	public PointerPointer _scanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__scanCacheOffset_));
	}

	// MM_CopyScanCache* _survivorCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorCopyScanCacheOffset_", declaredType="MM_CopyScanCache*")
	public MM_CopyScanCachePointer _survivorCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCachePointer.cast(getPointerAtOffset(MM_EnvironmentVLHGC.__survivorCopyScanCacheOffset_));
	}

	// MM_CopyScanCache* _survivorCopyScanCache
	public PointerPointer _survivorCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__survivorCopyScanCacheOffset_));
	}

	// MM_SweepVLHGCStats _sweepVLHGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepVLHGCStatsOffset_", declaredType="MM_SweepVLHGCStats")
	public MM_SweepVLHGCStatsPointer _sweepVLHGCStats() throws CorruptDataException {
		return MM_SweepVLHGCStatsPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__sweepVLHGCStatsOffset_));
	}

	// MM_SweepVLHGCStats _sweepVLHGCStats
	public PointerPointer _sweepVLHGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentVLHGC.__sweepVLHGCStatsOffset_));
	}

}
