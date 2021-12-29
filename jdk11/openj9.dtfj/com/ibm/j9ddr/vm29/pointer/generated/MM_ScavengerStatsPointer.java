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
 * Structure: MM_ScavengerStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ScavengerStats.class)
public class MM_ScavengerStatsPointer extends StructurePointer {

	// NULL
	public static final MM_ScavengerStatsPointer NULL = new MM_ScavengerStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerStatsPointer(long address) {
		super(address);
	}

	public static MM_ScavengerStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerStatsPointer(address);
	}

	public MM_ScavengerStatsPointer add(long count) {
		return MM_ScavengerStatsPointer.cast(address + (MM_ScavengerStats.SIZEOF * count));
	}

	public MM_ScavengerStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerStatsPointer addOffset(long offset) {
		return MM_ScavengerStatsPointer.cast(address + offset);
	}

	public MM_ScavengerStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerStatsPointer sub(long count) {
		return MM_ScavengerStatsPointer.cast(address - (MM_ScavengerStats.SIZEOF * count));
	}

	public MM_ScavengerStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerStatsPointer subOffset(long offset) {
		return MM_ScavengerStatsPointer.cast(address - offset);
	}

	public MM_ScavengerStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerStatsPointer untag(long mask) {
		return MM_ScavengerStatsPointer.cast(address & ~mask);
	}

	public MM_ScavengerStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ScavengerStats.SIZEOF;
	}

	// Implementation methods

	// U64 _acquireFreeListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireFreeListCountOffset_", declaredType="U64")
	public UDATA _acquireFreeListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__acquireFreeListCountOffset_));
	}

	// U64 _acquireFreeListCount
	public UDATAPointer _acquireFreeListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__acquireFreeListCountOffset_));
	}

	// U64 _acquireListLockCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireListLockCountOffset_", declaredType="U64")
	public UDATA _acquireListLockCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__acquireListLockCountOffset_));
	}

	// U64 _acquireListLockCount
	public UDATAPointer _acquireListLockCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__acquireListLockCountOffset_));
	}

	// U64 _acquireScanListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireScanListCountOffset_", declaredType="U64")
	public UDATA _acquireScanListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__acquireScanListCountOffset_));
	}

	// U64 _acquireScanListCount
	public UDATAPointer _acquireScanListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__acquireScanListCountOffset_));
	}

	// U64 _aliasToCopyCacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__aliasToCopyCacheCountOffset_", declaredType="U64")
	public UDATA _aliasToCopyCacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__aliasToCopyCacheCountOffset_));
	}

	// U64 _aliasToCopyCacheCount
	public UDATAPointer _aliasToCopyCacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__aliasToCopyCacheCountOffset_));
	}

	// U64 _arraySplitAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitAmountOffset_", declaredType="U64")
	public UDATA _arraySplitAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__arraySplitAmountOffset_));
	}

	// U64 _arraySplitAmount
	public UDATAPointer _arraySplitAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__arraySplitAmountOffset_));
	}

	// U64 _arraySplitCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitCountOffset_", declaredType="U64")
	public UDATA _arraySplitCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__arraySplitCountOffset_));
	}

	// U64 _arraySplitCount
	public UDATAPointer _arraySplitCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__arraySplitCountOffset_));
	}

	// U64 _avgInitialFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgInitialFreeOffset_", declaredType="U64")
	public UDATA _avgInitialFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__avgInitialFreeOffset_));
	}

	// U64 _avgInitialFree
	public UDATAPointer _avgInitialFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__avgInitialFreeOffset_));
	}

	// U64 _avgTenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgTenureBytesOffset_", declaredType="U64")
	public UDATA _avgTenureBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__avgTenureBytesOffset_));
	}

	// U64 _avgTenureBytes
	public UDATAPointer _avgTenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__avgTenureBytesOffset_));
	}

	// U64 _avgTenureBytesDeviation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgTenureBytesDeviationOffset_", declaredType="U64")
	public UDATA _avgTenureBytesDeviation() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__avgTenureBytesDeviationOffset_));
	}

	// U64 _avgTenureBytesDeviation
	public UDATAPointer _avgTenureBytesDeviationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__avgTenureBytesDeviationOffset_));
	}

	// U64 _avgTenureLOABytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgTenureLOABytesOffset_", declaredType="U64")
	public UDATA _avgTenureLOABytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__avgTenureLOABytesOffset_));
	}

	// U64 _avgTenureLOABytes
	public UDATAPointer _avgTenureLOABytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__avgTenureLOABytesOffset_));
	}

	// U64 _backout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backoutOffset_", declaredType="U64")
	public UDATA _backout() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__backoutOffset_));
	}

	// U64 _backout
	public UDATAPointer _backoutEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__backoutOffset_));
	}

	// U64 _causedRememberedSetOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__causedRememberedSetOverflowOffset_", declaredType="U64")
	public UDATA _causedRememberedSetOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__causedRememberedSetOverflowOffset_));
	}

	// U64 _causedRememberedSetOverflow
	public UDATAPointer _causedRememberedSetOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__causedRememberedSetOverflowOffset_));
	}

	// U64 _completeStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallCountOffset_", declaredType="U64")
	public UDATA _completeStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__completeStallCountOffset_));
	}

	// U64 _completeStallCount
	public UDATAPointer _completeStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__completeStallCountOffset_));
	}

	// U64 _completeStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallTimeOffset_", declaredType="U64")
	public UDATA _completeStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__completeStallTimeOffset_));
	}

	// U64 _completeStallTime
	public UDATAPointer _completeStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__completeStallTimeOffset_));
	}

	// U64 _copyScanUpdates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyScanUpdatesOffset_", declaredType="U64")
	public UDATA _copyScanUpdates() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__copyScanUpdatesOffset_));
	}

	// U64 _copyScanUpdates
	public UDATAPointer _copyScanUpdatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__copyScanUpdatesOffset_));
	}

	// U64[] _copy_cachesize_counts
	public UDATAPointer _copy_cachesize_countsEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_ScavengerStats.__copy_cachesize_countsOffset_));
	}

	// U64 _copy_cachesize_sum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copy_cachesize_sumOffset_", declaredType="U64")
	public UDATA _copy_cachesize_sum() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__copy_cachesize_sumOffset_));
	}

	// U64 _copy_cachesize_sum
	public UDATAPointer _copy_cachesize_sumEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__copy_cachesize_sumOffset_));
	}

	// U64[] _copy_distance_counts
	public UDATAPointer _copy_distance_countsEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_ScavengerStats.__copy_distance_countsOffset_));
	}

	// U64 _depthDeepestStructure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__depthDeepestStructureOffset_", declaredType="U64")
	public UDATA _depthDeepestStructure() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__depthDeepestStructureOffset_));
	}

	// U64 _depthDeepestStructure
	public UDATAPointer _depthDeepestStructureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__depthDeepestStructureOffset_));
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__endTimeOffset_));
	}

	// U64 _failedFlipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedFlipBytesOffset_", declaredType="U64")
	public UDATA _failedFlipBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__failedFlipBytesOffset_));
	}

	// U64 _failedFlipBytes
	public UDATAPointer _failedFlipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__failedFlipBytesOffset_));
	}

	// U64 _failedFlipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedFlipCountOffset_", declaredType="U64")
	public UDATA _failedFlipCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__failedFlipCountOffset_));
	}

	// U64 _failedFlipCount
	public UDATAPointer _failedFlipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__failedFlipCountOffset_));
	}

	// U64 _failedTenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureBytesOffset_", declaredType="U64")
	public UDATA _failedTenureBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__failedTenureBytesOffset_));
	}

	// U64 _failedTenureBytes
	public UDATAPointer _failedTenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__failedTenureBytesOffset_));
	}

	// U64 _failedTenureCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureCountOffset_", declaredType="U64")
	public UDATA _failedTenureCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__failedTenureCountOffset_));
	}

	// U64 _failedTenureCount
	public UDATAPointer _failedTenureCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__failedTenureCountOffset_));
	}

	// U64 _failedTenureLargest
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureLargestOffset_", declaredType="U64")
	public UDATA _failedTenureLargest() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__failedTenureLargestOffset_));
	}

	// U64 _failedTenureLargest
	public UDATAPointer _failedTenureLargestEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__failedTenureLargestOffset_));
	}

	// U64 _flipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipBytesOffset_", declaredType="U64")
	public UDATA _flipBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__flipBytesOffset_));
	}

	// U64 _flipBytes
	public UDATAPointer _flipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__flipBytesOffset_));
	}

	// U64 _flipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipCountOffset_", declaredType="U64")
	public UDATA _flipCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__flipCountOffset_));
	}

	// U64 _flipCount
	public UDATAPointer _flipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__flipCountOffset_));
	}

	// U64 _flipDiscardBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipDiscardBytesOffset_", declaredType="U64")
	public UDATA _flipDiscardBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__flipDiscardBytesOffset_));
	}

	// U64 _flipDiscardBytes
	public UDATAPointer _flipDiscardBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__flipDiscardBytesOffset_));
	}

	// MM_ScavengerStats$FlipHistory[] _flipHistory
	public MM_ScavengerStats$FlipHistoryPointer _flipHistoryEA() throws CorruptDataException {
		return MM_ScavengerStats$FlipHistoryPointer.cast(nonNullFieldEA(MM_ScavengerStats.__flipHistoryOffset_));
	}

	// U64 _flipHistoryNewIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipHistoryNewIndexOffset_", declaredType="U64")
	public UDATA _flipHistoryNewIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__flipHistoryNewIndexOffset_));
	}

	// U64 _flipHistoryNewIndex
	public UDATAPointer _flipHistoryNewIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__flipHistoryNewIndexOffset_));
	}

	// U64 _gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCountOffset_", declaredType="U64")
	public UDATA _gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__gcCountOffset_));
	}

	// U64 _gcCount
	public UDATAPointer _gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__gcCountOffset_));
	}

	// U64 _leafObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__leafObjectCountOffset_", declaredType="U64")
	public UDATA _leafObjectCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__leafObjectCountOffset_));
	}

	// U64 _leafObjectCount
	public UDATAPointer _leafObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__leafObjectCountOffset_));
	}

	// bool _nextScavengeWillPercolate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextScavengeWillPercolateOffset_", declaredType="bool")
	public boolean _nextScavengeWillPercolate() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerStats.__nextScavengeWillPercolateOffset_);
	}

	// bool _nextScavengeWillPercolate
	public BoolPointer _nextScavengeWillPercolateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerStats.__nextScavengeWillPercolateOffset_));
	}

	// U64 _readObjectBarrierCopy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readObjectBarrierCopyOffset_", declaredType="U64")
	public UDATA _readObjectBarrierCopy() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__readObjectBarrierCopyOffset_));
	}

	// U64 _readObjectBarrierCopy
	public UDATAPointer _readObjectBarrierCopyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__readObjectBarrierCopyOffset_));
	}

	// U64 _readObjectBarrierUpdate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readObjectBarrierUpdateOffset_", declaredType="U64")
	public UDATA _readObjectBarrierUpdate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__readObjectBarrierUpdateOffset_));
	}

	// U64 _readObjectBarrierUpdate
	public UDATAPointer _readObjectBarrierUpdateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__readObjectBarrierUpdateOffset_));
	}

	// U64 _releaseFreeListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__releaseFreeListCountOffset_", declaredType="U64")
	public UDATA _releaseFreeListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__releaseFreeListCountOffset_));
	}

	// U64 _releaseFreeListCount
	public UDATAPointer _releaseFreeListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__releaseFreeListCountOffset_));
	}

	// U64 _releaseScanListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__releaseScanListCountOffset_", declaredType="U64")
	public UDATA _releaseScanListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__releaseScanListCountOffset_));
	}

	// U64 _releaseScanListCount
	public UDATAPointer _releaseScanListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__releaseScanListCountOffset_));
	}

	// U64 _rememberedSetOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetOverflowOffset_", declaredType="U64")
	public UDATA _rememberedSetOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__rememberedSetOverflowOffset_));
	}

	// U64 _rememberedSetOverflow
	public UDATAPointer _rememberedSetOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__rememberedSetOverflowOffset_));
	}

	// U64 _scanCacheAllocationDurationDuringSavenger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheAllocationDurationDuringSavengerOffset_", declaredType="U64")
	public UDATA _scanCacheAllocationDurationDuringSavenger() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__scanCacheAllocationDurationDuringSavengerOffset_));
	}

	// U64 _scanCacheAllocationDurationDuringSavenger
	public UDATAPointer _scanCacheAllocationDurationDuringSavengerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__scanCacheAllocationDurationDuringSavengerOffset_));
	}

	// U64 _scanCacheAllocationFromHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheAllocationFromHeapOffset_", declaredType="U64")
	public UDATA _scanCacheAllocationFromHeap() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__scanCacheAllocationFromHeapOffset_));
	}

	// U64 _scanCacheAllocationFromHeap
	public UDATAPointer _scanCacheAllocationFromHeapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__scanCacheAllocationFromHeapOffset_));
	}

	// U64 _scanCacheOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheOverflowOffset_", declaredType="U64")
	public UDATA _scanCacheOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__scanCacheOverflowOffset_));
	}

	// U64 _scanCacheOverflow
	public UDATAPointer _scanCacheOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__scanCacheOverflowOffset_));
	}

	// U64 _semiSpaceAllocBytesAcumulation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semiSpaceAllocBytesAcumulationOffset_", declaredType="U64")
	public UDATA _semiSpaceAllocBytesAcumulation() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__semiSpaceAllocBytesAcumulationOffset_));
	}

	// U64 _semiSpaceAllocBytesAcumulation
	public UDATAPointer _semiSpaceAllocBytesAcumulationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__semiSpaceAllocBytesAcumulationOffset_));
	}

	// U64 _semiSpaceAllocationCountLarge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semiSpaceAllocationCountLargeOffset_", declaredType="U64")
	public UDATA _semiSpaceAllocationCountLarge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__semiSpaceAllocationCountLargeOffset_));
	}

	// U64 _semiSpaceAllocationCountLarge
	public UDATAPointer _semiSpaceAllocationCountLargeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__semiSpaceAllocationCountLargeOffset_));
	}

	// U64 _semiSpaceAllocationCountSmall
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semiSpaceAllocationCountSmallOffset_", declaredType="U64")
	public UDATA _semiSpaceAllocationCountSmall() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__semiSpaceAllocationCountSmallOffset_));
	}

	// U64 _semiSpaceAllocationCountSmall
	public UDATAPointer _semiSpaceAllocationCountSmallEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__semiSpaceAllocationCountSmallOffset_));
	}

	// U64 _slotsCopied
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotsCopiedOffset_", declaredType="U64")
	public UDATA _slotsCopied() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__slotsCopiedOffset_));
	}

	// U64 _slotsCopied
	public UDATAPointer _slotsCopiedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__slotsCopiedOffset_));
	}

	// U64 _slotsScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotsScannedOffset_", declaredType="U64")
	public UDATA _slotsScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__slotsScannedOffset_));
	}

	// U64 _slotsScanned
	public UDATAPointer _slotsScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__slotsScannedOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__startTimeOffset_));
	}

	// U64 _survivorTLHRemainderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorTLHRemainderCountOffset_", declaredType="U64")
	public UDATA _survivorTLHRemainderCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__survivorTLHRemainderCountOffset_));
	}

	// U64 _survivorTLHRemainderCount
	public UDATAPointer _survivorTLHRemainderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__survivorTLHRemainderCountOffset_));
	}

	// U64 _syncStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallCountOffset_", declaredType="U64")
	public UDATA _syncStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__syncStallCountOffset_));
	}

	// U64 _syncStallCount
	public UDATAPointer _syncStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__syncStallCountOffset_));
	}

	// U64 _syncStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallTimeOffset_", declaredType="U64")
	public UDATA _syncStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__syncStallTimeOffset_));
	}

	// U64 _syncStallTime
	public UDATAPointer _syncStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__syncStallTimeOffset_));
	}

	// U64 _tenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureAgeOffset_", declaredType="U64")
	public UDATA _tenureAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureAgeOffset_));
	}

	// U64 _tenureAge
	public UDATAPointer _tenureAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureAgeOffset_));
	}

	// U64 _tenureAggregateBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureAggregateBytesOffset_", declaredType="U64")
	public UDATA _tenureAggregateBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureAggregateBytesOffset_));
	}

	// U64 _tenureAggregateBytes
	public UDATAPointer _tenureAggregateBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureAggregateBytesOffset_));
	}

	// U64 _tenureAggregateCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureAggregateCountOffset_", declaredType="U64")
	public UDATA _tenureAggregateCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureAggregateCountOffset_));
	}

	// U64 _tenureAggregateCount
	public UDATAPointer _tenureAggregateCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureAggregateCountOffset_));
	}

	// U64 _tenureDiscardBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureDiscardBytesOffset_", declaredType="U64")
	public UDATA _tenureDiscardBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureDiscardBytesOffset_));
	}

	// U64 _tenureDiscardBytes
	public UDATAPointer _tenureDiscardBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureDiscardBytesOffset_));
	}

	// U64 _tenureExpandedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureExpandedBytesOffset_", declaredType="U64")
	public UDATA _tenureExpandedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureExpandedBytesOffset_));
	}

	// U64 _tenureExpandedBytes
	public UDATAPointer _tenureExpandedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureExpandedBytesOffset_));
	}

	// U64 _tenureExpandedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureExpandedCountOffset_", declaredType="U64")
	public UDATA _tenureExpandedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureExpandedCountOffset_));
	}

	// U64 _tenureExpandedCount
	public UDATAPointer _tenureExpandedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureExpandedCountOffset_));
	}

	// U64 _tenureExpandedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureExpandedTimeOffset_", declaredType="U64")
	public UDATA _tenureExpandedTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureExpandedTimeOffset_));
	}

	// U64 _tenureExpandedTime
	public UDATAPointer _tenureExpandedTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureExpandedTimeOffset_));
	}

	// U64 _tenureLOABytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOABytesOffset_", declaredType="U64")
	public UDATA _tenureLOABytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureLOABytesOffset_));
	}

	// U64 _tenureLOABytes
	public UDATAPointer _tenureLOABytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureLOABytesOffset_));
	}

	// U64 _tenureLOACount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOACountOffset_", declaredType="U64")
	public UDATA _tenureLOACount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureLOACountOffset_));
	}

	// U64 _tenureLOACount
	public UDATAPointer _tenureLOACountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureLOACountOffset_));
	}

	// U64 _tenureSpaceAllocBytesAcumulation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureSpaceAllocBytesAcumulationOffset_", declaredType="U64")
	public UDATA _tenureSpaceAllocBytesAcumulation() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureSpaceAllocBytesAcumulationOffset_));
	}

	// U64 _tenureSpaceAllocBytesAcumulation
	public UDATAPointer _tenureSpaceAllocBytesAcumulationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureSpaceAllocBytesAcumulationOffset_));
	}

	// U64 _tenureSpaceAllocationCountLarge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureSpaceAllocationCountLargeOffset_", declaredType="U64")
	public UDATA _tenureSpaceAllocationCountLarge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureSpaceAllocationCountLargeOffset_));
	}

	// U64 _tenureSpaceAllocationCountLarge
	public UDATAPointer _tenureSpaceAllocationCountLargeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureSpaceAllocationCountLargeOffset_));
	}

	// U64 _tenureSpaceAllocationCountSmall
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureSpaceAllocationCountSmallOffset_", declaredType="U64")
	public UDATA _tenureSpaceAllocationCountSmall() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureSpaceAllocationCountSmallOffset_));
	}

	// U64 _tenureSpaceAllocationCountSmall
	public UDATAPointer _tenureSpaceAllocationCountSmallEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureSpaceAllocationCountSmallOffset_));
	}

	// U64 _tenureTLHRemainderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureTLHRemainderCountOffset_", declaredType="U64")
	public UDATA _tenureTLHRemainderCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tenureTLHRemainderCountOffset_));
	}

	// U64 _tenureTLHRemainderCount
	public UDATAPointer _tenureTLHRemainderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tenureTLHRemainderCountOffset_));
	}

	// U64 _tiltRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tiltRatioOffset_", declaredType="U64")
	public UDATA _tiltRatio() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__tiltRatioOffset_));
	}

	// U64 _tiltRatio
	public UDATAPointer _tiltRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__tiltRatioOffset_));
	}

	// U64 _totalDeepStructures
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalDeepStructuresOffset_", declaredType="U64")
	public UDATA _totalDeepStructures() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__totalDeepStructuresOffset_));
	}

	// U64 _totalDeepStructures
	public UDATAPointer _totalDeepStructuresEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__totalDeepStructuresOffset_));
	}

	// U64 _totalObjsDeepScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalObjsDeepScannedOffset_", declaredType="U64")
	public UDATA _totalObjsDeepScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__totalObjsDeepScannedOffset_));
	}

	// U64 _totalObjsDeepScanned
	public UDATAPointer _totalObjsDeepScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__totalObjsDeepScannedOffset_));
	}

	// U64 _workStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallCountOffset_", declaredType="U64")
	public UDATA _workStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__workStallCountOffset_));
	}

	// U64 _workStallCount
	public UDATAPointer _workStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__workStallCountOffset_));
	}

	// U64 _workStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallTimeOffset_", declaredType="U64")
	public UDATA _workStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerStats.__workStallTimeOffset_));
	}

	// U64 _workStallTime
	public UDATAPointer _workStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerStats.__workStallTimeOffset_));
	}

}
