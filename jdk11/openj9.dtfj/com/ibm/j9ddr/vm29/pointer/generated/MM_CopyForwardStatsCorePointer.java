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
 * Structure: MM_CopyForwardStatsCorePointer
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
 * The generated code will provide getters for all elements in the MM_CopyForwardStatsCorePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyForwardStatsCore.class)
public class MM_CopyForwardStatsCorePointer extends StructurePointer {

	// NULL
	public static final MM_CopyForwardStatsCorePointer NULL = new MM_CopyForwardStatsCorePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyForwardStatsCorePointer(long address) {
		super(address);
	}

	public static MM_CopyForwardStatsCorePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyForwardStatsCorePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyForwardStatsCorePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyForwardStatsCorePointer(address);
	}

	public MM_CopyForwardStatsCorePointer add(long count) {
		return MM_CopyForwardStatsCorePointer.cast(address + (MM_CopyForwardStatsCore.SIZEOF * count));
	}

	public MM_CopyForwardStatsCorePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyForwardStatsCorePointer addOffset(long offset) {
		return MM_CopyForwardStatsCorePointer.cast(address + offset);
	}

	public MM_CopyForwardStatsCorePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyForwardStatsCorePointer sub(long count) {
		return MM_CopyForwardStatsCorePointer.cast(address - (MM_CopyForwardStatsCore.SIZEOF * count));
	}

	public MM_CopyForwardStatsCorePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyForwardStatsCorePointer subOffset(long offset) {
		return MM_CopyForwardStatsCorePointer.cast(address - offset);
	}

	public MM_CopyForwardStatsCorePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyForwardStatsCorePointer untag(long mask) {
		return MM_CopyForwardStatsCorePointer.cast(address & ~mask);
	}

	public MM_CopyForwardStatsCorePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyForwardStatsCore.SIZEOF;
	}

	// Implementation methods

	// U64 _abortStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abortStallCountOffset_", declaredType="U64")
	public UDATA _abortStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__abortStallCountOffset_));
	}

	// U64 _abortStallCount
	public UDATAPointer _abortStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__abortStallCountOffset_));
	}

	// U64 _abortStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abortStallTimeOffset_", declaredType="U64")
	public UDATA _abortStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__abortStallTimeOffset_));
	}

	// U64 _abortStallTime
	public UDATAPointer _abortStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__abortStallTimeOffset_));
	}

	// bool _aborted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abortedOffset_", declaredType="bool")
	public boolean _aborted() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardStatsCore.__abortedOffset_);
	}

	// bool _aborted
	public BoolPointer _abortedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__abortedOffset_));
	}

	// U64 _acquireFreeListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireFreeListCountOffset_", declaredType="U64")
	public UDATA _acquireFreeListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__acquireFreeListCountOffset_));
	}

	// U64 _acquireFreeListCount
	public UDATAPointer _acquireFreeListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__acquireFreeListCountOffset_));
	}

	// U64 _acquireScanListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireScanListCountOffset_", declaredType="U64")
	public UDATA _acquireScanListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__acquireScanListCountOffset_));
	}

	// U64 _acquireScanListCount
	public UDATAPointer _acquireScanListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__acquireScanListCountOffset_));
	}

	// U64 _bytesCardClean
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesCardCleanOffset_", declaredType="U64")
	public UDATA _bytesCardClean() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__bytesCardCleanOffset_));
	}

	// U64 _bytesCardClean
	public UDATAPointer _bytesCardCleanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__bytesCardCleanOffset_));
	}

	// U64 _completeStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallCountOffset_", declaredType="U64")
	public UDATA _completeStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__completeStallCountOffset_));
	}

	// U64 _completeStallCount
	public UDATAPointer _completeStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__completeStallCountOffset_));
	}

	// U64 _completeStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallTimeOffset_", declaredType="U64")
	public UDATA _completeStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__completeStallTimeOffset_));
	}

	// U64 _completeStallTime
	public UDATAPointer _completeStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__completeStallTimeOffset_));
	}

	// U64 _copiedArraysSplit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copiedArraysSplitOffset_", declaredType="U64")
	public UDATA _copiedArraysSplit() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copiedArraysSplitOffset_));
	}

	// U64 _copiedArraysSplit
	public UDATAPointer _copiedArraysSplitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copiedArraysSplitOffset_));
	}

	// U64 _copyBytesEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyBytesEdenOffset_", declaredType="U64")
	public UDATA _copyBytesEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyBytesEdenOffset_));
	}

	// U64 _copyBytesEden
	public UDATAPointer _copyBytesEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyBytesEdenOffset_));
	}

	// U64 _copyBytesNonEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyBytesNonEdenOffset_", declaredType="U64")
	public UDATA _copyBytesNonEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyBytesNonEdenOffset_));
	}

	// U64 _copyBytesNonEden
	public UDATAPointer _copyBytesNonEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyBytesNonEdenOffset_));
	}

	// U64 _copyBytesTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyBytesTotalOffset_", declaredType="U64")
	public UDATA _copyBytesTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyBytesTotalOffset_));
	}

	// U64 _copyBytesTotal
	public UDATAPointer _copyBytesTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyBytesTotalOffset_));
	}

	// U64 _copyDiscardBytesEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyDiscardBytesEdenOffset_", declaredType="U64")
	public UDATA _copyDiscardBytesEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyDiscardBytesEdenOffset_));
	}

	// U64 _copyDiscardBytesEden
	public UDATAPointer _copyDiscardBytesEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyDiscardBytesEdenOffset_));
	}

	// U64 _copyDiscardBytesNonEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyDiscardBytesNonEdenOffset_", declaredType="U64")
	public UDATA _copyDiscardBytesNonEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyDiscardBytesNonEdenOffset_));
	}

	// U64 _copyDiscardBytesNonEden
	public UDATAPointer _copyDiscardBytesNonEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyDiscardBytesNonEdenOffset_));
	}

	// U64 _copyDiscardBytesTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyDiscardBytesTotalOffset_", declaredType="U64")
	public UDATA _copyDiscardBytesTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyDiscardBytesTotalOffset_));
	}

	// U64 _copyDiscardBytesTotal
	public UDATAPointer _copyDiscardBytesTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyDiscardBytesTotalOffset_));
	}

	// U64 _copyObjectsEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyObjectsEdenOffset_", declaredType="U64")
	public UDATA _copyObjectsEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyObjectsEdenOffset_));
	}

	// U64 _copyObjectsEden
	public UDATAPointer _copyObjectsEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyObjectsEdenOffset_));
	}

	// U64 _copyObjectsNonEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyObjectsNonEdenOffset_", declaredType="U64")
	public UDATA _copyObjectsNonEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyObjectsNonEdenOffset_));
	}

	// U64 _copyObjectsNonEden
	public UDATAPointer _copyObjectsNonEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyObjectsNonEdenOffset_));
	}

	// U64 _copyObjectsTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyObjectsTotalOffset_", declaredType="U64")
	public UDATA _copyObjectsTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__copyObjectsTotalOffset_));
	}

	// U64 _copyObjectsTotal
	public UDATAPointer _copyObjectsTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__copyObjectsTotalOffset_));
	}

	// U64 _edenEvacuateRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenEvacuateRegionCountOffset_", declaredType="U64")
	public UDATA _edenEvacuateRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__edenEvacuateRegionCountOffset_));
	}

	// U64 _edenEvacuateRegionCount
	public UDATAPointer _edenEvacuateRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__edenEvacuateRegionCountOffset_));
	}

	// U64 _edenSurvivorRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenSurvivorRegionCountOffset_", declaredType="U64")
	public UDATA _edenSurvivorRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__edenSurvivorRegionCountOffset_));
	}

	// U64 _edenSurvivorRegionCount
	public UDATAPointer _edenSurvivorRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__edenSurvivorRegionCountOffset_));
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__endTimeOffset_));
	}

	// U64 _externalCompactBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__externalCompactBytesOffset_", declaredType="U64")
	public UDATA _externalCompactBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__externalCompactBytesOffset_));
	}

	// U64 _externalCompactBytes
	public UDATAPointer _externalCompactBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__externalCompactBytesOffset_));
	}

	// U64 _freeMemoryAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemoryAfterOffset_", declaredType="U64")
	public UDATA _freeMemoryAfter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__freeMemoryAfterOffset_));
	}

	// U64 _freeMemoryAfter
	public UDATAPointer _freeMemoryAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__freeMemoryAfterOffset_));
	}

	// U64 _freeMemoryBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemoryBeforeOffset_", declaredType="U64")
	public UDATA _freeMemoryBefore() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__freeMemoryBeforeOffset_));
	}

	// U64 _freeMemoryBefore
	public UDATAPointer _freeMemoryBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__freeMemoryBeforeOffset_));
	}

	// U64 _gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCountOffset_", declaredType="U64")
	public UDATA _gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__gcCountOffset_));
	}

	// U64 _gcCount
	public UDATAPointer _gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__gcCountOffset_));
	}

	// U64 _heapExpandedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapExpandedBytesOffset_", declaredType="U64")
	public UDATA _heapExpandedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__heapExpandedBytesOffset_));
	}

	// U64 _heapExpandedBytes
	public UDATAPointer _heapExpandedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__heapExpandedBytesOffset_));
	}

	// U64 _heapExpandedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapExpandedCountOffset_", declaredType="U64")
	public UDATA _heapExpandedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__heapExpandedCountOffset_));
	}

	// U64 _heapExpandedCount
	public UDATAPointer _heapExpandedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__heapExpandedCountOffset_));
	}

	// U64 _heapExpandedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapExpandedTimeOffset_", declaredType="U64")
	public UDATA _heapExpandedTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__heapExpandedTimeOffset_));
	}

	// U64 _heapExpandedTime
	public UDATAPointer _heapExpandedTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__heapExpandedTimeOffset_));
	}

	// U64 _irrsStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__irrsStallCountOffset_", declaredType="U64")
	public UDATA _irrsStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__irrsStallCountOffset_));
	}

	// U64 _irrsStallCount
	public UDATAPointer _irrsStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__irrsStallCountOffset_));
	}

	// U64 _irrsStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__irrsStallTimeOffset_", declaredType="U64")
	public UDATA _irrsStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__irrsStallTimeOffset_));
	}

	// U64 _irrsStallTime
	public UDATAPointer _irrsStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__irrsStallTimeOffset_));
	}

	// U64 _markStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStallCountOffset_", declaredType="U64")
	public UDATA _markStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__markStallCountOffset_));
	}

	// U64 _markStallCount
	public UDATAPointer _markStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__markStallCountOffset_));
	}

	// U64 _markStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStallTimeOffset_", declaredType="U64")
	public UDATA _markStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__markStallTimeOffset_));
	}

	// U64 _markStallTime
	public UDATAPointer _markStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__markStallTimeOffset_));
	}

	// U64 _markedArraysSplit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markedArraysSplitOffset_", declaredType="U64")
	public UDATA _markedArraysSplit() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__markedArraysSplitOffset_));
	}

	// U64 _markedArraysSplit
	public UDATAPointer _markedArraysSplitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__markedArraysSplitOffset_));
	}

	// U64 _nonEdenEvacuateRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEdenEvacuateRegionCountOffset_", declaredType="U64")
	public UDATA _nonEdenEvacuateRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__nonEdenEvacuateRegionCountOffset_));
	}

	// U64 _nonEdenEvacuateRegionCount
	public UDATAPointer _nonEdenEvacuateRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__nonEdenEvacuateRegionCountOffset_));
	}

	// U64 _nonEdenSurvivorRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEdenSurvivorRegionCountOffset_", declaredType="U64")
	public UDATA _nonEdenSurvivorRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__nonEdenSurvivorRegionCountOffset_));
	}

	// U64 _nonEdenSurvivorRegionCount
	public UDATAPointer _nonEdenSurvivorRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__nonEdenSurvivorRegionCountOffset_));
	}

	// U64 _nonEvacuateRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEvacuateRegionCountOffset_", declaredType="U64")
	public UDATA _nonEvacuateRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__nonEvacuateRegionCountOffset_));
	}

	// U64 _nonEvacuateRegionCount
	public UDATAPointer _nonEvacuateRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__nonEvacuateRegionCountOffset_));
	}

	// U64 _objectsCardClean
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsCardCleanOffset_", declaredType="U64")
	public UDATA _objectsCardClean() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsCardCleanOffset_));
	}

	// U64 _objectsCardClean
	public UDATAPointer _objectsCardCleanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsCardCleanOffset_));
	}

	// U64 _objectsScannedFromDepthStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedFromDepthStackOffset_", declaredType="U64")
	public UDATA _objectsScannedFromDepthStack() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsScannedFromDepthStackOffset_));
	}

	// U64 _objectsScannedFromDepthStack
	public UDATAPointer _objectsScannedFromDepthStackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsScannedFromDepthStackOffset_));
	}

	// U64 _objectsScannedFromNextInChain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedFromNextInChainOffset_", declaredType="U64")
	public UDATA _objectsScannedFromNextInChain() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsScannedFromNextInChainOffset_));
	}

	// U64 _objectsScannedFromNextInChain
	public UDATAPointer _objectsScannedFromNextInChainEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsScannedFromNextInChainOffset_));
	}

	// U64 _objectsScannedFromOverflowedRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedFromOverflowedRegionOffset_", declaredType="U64")
	public UDATA _objectsScannedFromOverflowedRegion() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsScannedFromOverflowedRegionOffset_));
	}

	// U64 _objectsScannedFromOverflowedRegion
	public UDATAPointer _objectsScannedFromOverflowedRegionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsScannedFromOverflowedRegionOffset_));
	}

	// U64 _objectsScannedFromRoot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedFromRootOffset_", declaredType="U64")
	public UDATA _objectsScannedFromRoot() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsScannedFromRootOffset_));
	}

	// U64 _objectsScannedFromRoot
	public UDATAPointer _objectsScannedFromRootEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsScannedFromRootOffset_));
	}

	// U64 _objectsScannedFromWorkPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedFromWorkPacketsOffset_", declaredType="U64")
	public UDATA _objectsScannedFromWorkPackets() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__objectsScannedFromWorkPacketsOffset_));
	}

	// U64 _objectsScannedFromWorkPackets
	public UDATAPointer _objectsScannedFromWorkPacketsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__objectsScannedFromWorkPacketsOffset_));
	}

	// U64 _releaseFreeListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__releaseFreeListCountOffset_", declaredType="U64")
	public UDATA _releaseFreeListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__releaseFreeListCountOffset_));
	}

	// U64 _releaseFreeListCount
	public UDATAPointer _releaseFreeListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__releaseFreeListCountOffset_));
	}

	// U64 _releaseScanListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__releaseScanListCountOffset_", declaredType="U64")
	public UDATA _releaseScanListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__releaseScanListCountOffset_));
	}

	// U64 _releaseScanListCount
	public UDATAPointer _releaseScanListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__releaseScanListCountOffset_));
	}

	// U64 _scanBytesEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanBytesEdenOffset_", declaredType="U64")
	public UDATA _scanBytesEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanBytesEdenOffset_));
	}

	// U64 _scanBytesEden
	public UDATAPointer _scanBytesEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanBytesEdenOffset_));
	}

	// U64 _scanBytesNonEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanBytesNonEdenOffset_", declaredType="U64")
	public UDATA _scanBytesNonEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanBytesNonEdenOffset_));
	}

	// U64 _scanBytesNonEden
	public UDATAPointer _scanBytesNonEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanBytesNonEdenOffset_));
	}

	// U64 _scanBytesTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanBytesTotalOffset_", declaredType="U64")
	public UDATA _scanBytesTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanBytesTotalOffset_));
	}

	// U64 _scanBytesTotal
	public UDATAPointer _scanBytesTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanBytesTotalOffset_));
	}

	// bool _scanCacheOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheOverflowOffset_", declaredType="bool")
	public boolean _scanCacheOverflow() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyForwardStatsCore.__scanCacheOverflowOffset_);
	}

	// bool _scanCacheOverflow
	public BoolPointer _scanCacheOverflowEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanCacheOverflowOffset_));
	}

	// U64 _scanObjectsEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanObjectsEdenOffset_", declaredType="U64")
	public UDATA _scanObjectsEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanObjectsEdenOffset_));
	}

	// U64 _scanObjectsEden
	public UDATAPointer _scanObjectsEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanObjectsEdenOffset_));
	}

	// U64 _scanObjectsNonEden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanObjectsNonEdenOffset_", declaredType="U64")
	public UDATA _scanObjectsNonEden() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanObjectsNonEdenOffset_));
	}

	// U64 _scanObjectsNonEden
	public UDATAPointer _scanObjectsNonEdenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanObjectsNonEdenOffset_));
	}

	// U64 _scanObjectsTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanObjectsTotalOffset_", declaredType="U64")
	public UDATA _scanObjectsTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__scanObjectsTotalOffset_));
	}

	// U64 _scanObjectsTotal
	public UDATAPointer _scanObjectsTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__scanObjectsTotalOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__startTimeOffset_));
	}

	// U64 _syncStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallCountOffset_", declaredType="U64")
	public UDATA _syncStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__syncStallCountOffset_));
	}

	// U64 _syncStallCount
	public UDATAPointer _syncStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__syncStallCountOffset_));
	}

	// U64 _syncStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallTimeOffset_", declaredType="U64")
	public UDATA _syncStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__syncStallTimeOffset_));
	}

	// U64 _syncStallTime
	public UDATAPointer _syncStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__syncStallTimeOffset_));
	}

	// U64 _totalMemoryAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalMemoryAfterOffset_", declaredType="U64")
	public UDATA _totalMemoryAfter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__totalMemoryAfterOffset_));
	}

	// U64 _totalMemoryAfter
	public UDATAPointer _totalMemoryAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__totalMemoryAfterOffset_));
	}

	// U64 _totalMemoryBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalMemoryBeforeOffset_", declaredType="U64")
	public UDATA _totalMemoryBefore() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__totalMemoryBeforeOffset_));
	}

	// U64 _totalMemoryBefore
	public UDATAPointer _totalMemoryBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__totalMemoryBeforeOffset_));
	}

	// U64 _workStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallCountOffset_", declaredType="U64")
	public UDATA _workStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__workStallCountOffset_));
	}

	// U64 _workStallCount
	public UDATAPointer _workStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__workStallCountOffset_));
	}

	// U64 _workStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallTimeOffset_", declaredType="U64")
	public UDATA _workStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardStatsCore.__workStallTimeOffset_));
	}

	// U64 _workStallTime
	public UDATAPointer _workStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardStatsCore.__workStallTimeOffset_));
	}

}
