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
 * Structure: MM_VerboseEventMetronomeGCEndPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventMetronomeGCEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventMetronomeGCEnd.class)
public class MM_VerboseEventMetronomeGCEndPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventMetronomeGCEndPointer NULL = new MM_VerboseEventMetronomeGCEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventMetronomeGCEndPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventMetronomeGCEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventMetronomeGCEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventMetronomeGCEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventMetronomeGCEndPointer(address);
	}

	public MM_VerboseEventMetronomeGCEndPointer add(long count) {
		return MM_VerboseEventMetronomeGCEndPointer.cast(address + (MM_VerboseEventMetronomeGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventMetronomeGCEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventMetronomeGCEndPointer addOffset(long offset) {
		return MM_VerboseEventMetronomeGCEndPointer.cast(address + offset);
	}

	public MM_VerboseEventMetronomeGCEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventMetronomeGCEndPointer sub(long count) {
		return MM_VerboseEventMetronomeGCEndPointer.cast(address - (MM_VerboseEventMetronomeGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventMetronomeGCEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventMetronomeGCEndPointer subOffset(long offset) {
		return MM_VerboseEventMetronomeGCEndPointer.cast(address - offset);
	}

	public MM_VerboseEventMetronomeGCEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventMetronomeGCEndPointer untag(long mask) {
		return MM_VerboseEventMetronomeGCEndPointer.cast(address & ~mask);
	}

	public MM_VerboseEventMetronomeGCEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventMetronomeGCEnd.SIZEOF;
	}

	// Implementation methods

	// UDATA _classLoadersUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloaded() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__classLoadersUnloadedOffset_);
	}

	// UDATA _classLoadersUnloaded
	public UDATAPointer _classLoadersUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__classLoadersUnloadedOffset_));
	}

	// UDATA _classLoadersUnloadedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedTotalOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloadedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__classLoadersUnloadedTotalOffset_);
	}

	// UDATA _classLoadersUnloadedTotal
	public UDATAPointer _classLoadersUnloadedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__classLoadersUnloadedTotalOffset_));
	}

	// UDATA _classesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedOffset_", declaredType="UDATA")
	public UDATA _classesUnloaded() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__classesUnloadedOffset_);
	}

	// UDATA _classesUnloaded
	public UDATAPointer _classesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__classesUnloadedOffset_));
	}

	// UDATA _classesUnloadedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedTotalOffset_", declaredType="UDATA")
	public UDATA _classesUnloadedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__classesUnloadedTotalOffset_);
	}

	// UDATA _classesUnloadedTotal
	public UDATAPointer _classesUnloadedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__classesUnloadedTotalOffset_));
	}

	// UDATA _dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSoftReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _dynamicSoftReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__dynamicSoftReferenceThresholdOffset_);
	}

	// UDATA _dynamicSoftReferenceThreshold
	public UDATAPointer _dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__dynamicSoftReferenceThresholdOffset_));
	}

	// UDATA _endIncrementCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endIncrementCountOffset_", declaredType="UDATA")
	public UDATA _endIncrementCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__endIncrementCountOffset_);
	}

	// UDATA _endIncrementCount
	public UDATAPointer _endIncrementCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__endIncrementCountOffset_));
	}

	// UDATA _finalizableCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizableCountOffset_", declaredType="UDATA")
	public UDATA _finalizableCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__finalizableCountOffset_);
	}

	// UDATA _finalizableCount
	public UDATAPointer _finalizableCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__finalizableCountOffset_));
	}

	// UDATA _finalizableCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizableCountTotalOffset_", declaredType="UDATA")
	public UDATA _finalizableCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__finalizableCountTotalOffset_);
	}

	// UDATA _finalizableCountTotal
	public UDATAPointer _finalizableCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__finalizableCountTotalOffset_));
	}

	// UDATA _heapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeOffset_", declaredType="UDATA")
	public UDATA _heapFree() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__heapFreeOffset_);
	}

	// UDATA _heapFree
	public UDATAPointer _heapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__heapFreeOffset_));
	}

	// U64 _incrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementTimeOffset_", declaredType="U64")
	public UDATA _incrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__incrementTimeOffset_));
	}

	// U64 _incrementTime
	public UDATAPointer _incrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__incrementTimeOffset_));
	}

	// U64 _maxExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _maxExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__maxExclusiveAccessTimeOffset_));
	}

	// U64 _maxExclusiveAccessTime
	public UDATAPointer _maxExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__maxExclusiveAccessTimeOffset_));
	}

	// UDATA _maxHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxHeapFreeOffset_", declaredType="UDATA")
	public UDATA _maxHeapFree() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__maxHeapFreeOffset_);
	}

	// UDATA _maxHeapFree
	public UDATAPointer _maxHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__maxHeapFreeOffset_));
	}

	// U64 _maxIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxIncrementTimeOffset_", declaredType="U64")
	public UDATA _maxIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__maxIncrementTimeOffset_));
	}

	// U64 _maxIncrementTime
	public UDATAPointer _maxIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__maxIncrementTimeOffset_));
	}

	// UDATA _maxStartPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxStartPriorityOffset_", declaredType="UDATA")
	public UDATA _maxStartPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__maxStartPriorityOffset_);
	}

	// UDATA _maxStartPriority
	public UDATAPointer _maxStartPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__maxStartPriorityOffset_));
	}

	// U64 _meanExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meanExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _meanExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__meanExclusiveAccessTimeOffset_));
	}

	// U64 _meanExclusiveAccessTime
	public UDATAPointer _meanExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__meanExclusiveAccessTimeOffset_));
	}

	// U64 _meanHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meanHeapFreeOffset_", declaredType="U64")
	public UDATA _meanHeapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__meanHeapFreeOffset_));
	}

	// U64 _meanHeapFree
	public UDATAPointer _meanHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__meanHeapFreeOffset_));
	}

	// U64 _meanIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meanIncrementTimeOffset_", declaredType="U64")
	public UDATA _meanIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__meanIncrementTimeOffset_));
	}

	// U64 _meanIncrementTime
	public UDATAPointer _meanIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__meanIncrementTimeOffset_));
	}

	// U64 _minExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _minExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__minExclusiveAccessTimeOffset_));
	}

	// U64 _minExclusiveAccessTime
	public UDATAPointer _minExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__minExclusiveAccessTimeOffset_));
	}

	// UDATA _minHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minHeapFreeOffset_", declaredType="UDATA")
	public UDATA _minHeapFree() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__minHeapFreeOffset_);
	}

	// UDATA _minHeapFree
	public UDATAPointer _minHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__minHeapFreeOffset_));
	}

	// U64 _minIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minIncrementTimeOffset_", declaredType="U64")
	public UDATA _minIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__minIncrementTimeOffset_));
	}

	// U64 _minIncrementTime
	public UDATAPointer _minIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__minIncrementTimeOffset_));
	}

	// UDATA _minStartPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minStartPriorityOffset_", declaredType="UDATA")
	public UDATA _minStartPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__minStartPriorityOffset_);
	}

	// UDATA _minStartPriority
	public UDATAPointer _minStartPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__minStartPriorityOffset_));
	}

	// UDATA _nonDeterministicSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweep() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepOffset_);
	}

	// UDATA _nonDeterministicSweep
	public UDATAPointer _nonDeterministicSweepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepOffset_));
	}

	// UDATA _nonDeterministicSweepConsecutive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepConsecutiveOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweepConsecutive() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepConsecutiveOffset_);
	}

	// UDATA _nonDeterministicSweepConsecutive
	public UDATAPointer _nonDeterministicSweepConsecutiveEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepConsecutiveOffset_));
	}

	// UDATA _nonDeterministicSweepConsecutiveMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepConsecutiveMaxOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweepConsecutiveMax() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepConsecutiveMaxOffset_);
	}

	// UDATA _nonDeterministicSweepConsecutiveMax
	public UDATAPointer _nonDeterministicSweepConsecutiveMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepConsecutiveMaxOffset_));
	}

	// U64 _nonDeterministicSweepDelay
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepDelayOffset_", declaredType="U64")
	public UDATA _nonDeterministicSweepDelay() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepDelayOffset_));
	}

	// U64 _nonDeterministicSweepDelay
	public UDATAPointer _nonDeterministicSweepDelayEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepDelayOffset_));
	}

	// U64 _nonDeterministicSweepDelayMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepDelayMaxOffset_", declaredType="U64")
	public UDATA _nonDeterministicSweepDelayMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepDelayMaxOffset_));
	}

	// U64 _nonDeterministicSweepDelayMax
	public UDATAPointer _nonDeterministicSweepDelayMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepDelayMaxOffset_));
	}

	// UDATA _nonDeterministicSweepTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepTotalOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweepTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepTotalOffset_);
	}

	// UDATA _nonDeterministicSweepTotal
	public UDATAPointer _nonDeterministicSweepTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__nonDeterministicSweepTotalOffset_));
	}

	// UDATA _objectOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectOverflowCountOffset_", declaredType="UDATA")
	public UDATA _objectOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__objectOverflowCountOffset_);
	}

	// UDATA _objectOverflowCount
	public UDATAPointer _objectOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__objectOverflowCountOffset_));
	}

	// UDATA _objectOverflowCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectOverflowCountTotalOffset_", declaredType="UDATA")
	public UDATA _objectOverflowCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__objectOverflowCountTotalOffset_);
	}

	// UDATA _objectOverflowCountTotal
	public UDATAPointer _objectOverflowCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__objectOverflowCountTotalOffset_));
	}

	// UDATA _phantomReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__phantomReferenceClearCountOffset_);
	}

	// UDATA _phantomReferenceClearCount
	public UDATAPointer _phantomReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__phantomReferenceClearCountOffset_));
	}

	// UDATA _phantomReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__phantomReferenceClearCountTotalOffset_);
	}

	// UDATA _phantomReferenceClearCountTotal
	public UDATAPointer _phantomReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__phantomReferenceClearCountTotalOffset_));
	}

	// UDATA _softReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__softReferenceClearCountOffset_);
	}

	// UDATA _softReferenceClearCount
	public UDATAPointer _softReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__softReferenceClearCountOffset_));
	}

	// UDATA _softReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__softReferenceClearCountTotalOffset_);
	}

	// UDATA _softReferenceClearCountTotal
	public UDATAPointer _softReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__softReferenceClearCountTotalOffset_));
	}

	// UDATA _softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _softReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__softReferenceThresholdOffset_);
	}

	// UDATA _softReferenceThreshold
	public UDATAPointer _softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__softReferenceThresholdOffset_));
	}

	// UDATA _startIncrementCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startIncrementCountOffset_", declaredType="UDATA")
	public UDATA _startIncrementCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__startIncrementCountOffset_);
	}

	// UDATA _startIncrementCount
	public UDATAPointer _startIncrementCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__startIncrementCountOffset_));
	}

	// I64 _timeInMilliSeconds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeInMilliSecondsOffset_", declaredType="I64")
	public IDATA _timeInMilliSeconds() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_VerboseEventMetronomeGCEnd.__timeInMilliSecondsOffset_));
	}

	// I64 _timeInMilliSeconds
	public IDATAPointer _timeInMilliSecondsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__timeInMilliSecondsOffset_));
	}

	// UDATA _weakReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__weakReferenceClearCountOffset_);
	}

	// UDATA _weakReferenceClearCount
	public UDATAPointer _weakReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__weakReferenceClearCountOffset_));
	}

	// UDATA _weakReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__weakReferenceClearCountTotalOffset_);
	}

	// UDATA _weakReferenceClearCountTotal
	public UDATAPointer _weakReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__weakReferenceClearCountTotalOffset_));
	}

	// UDATA _workPacketOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketOverflowCountOffset_", declaredType="UDATA")
	public UDATA _workPacketOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__workPacketOverflowCountOffset_);
	}

	// UDATA _workPacketOverflowCount
	public UDATAPointer _workPacketOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__workPacketOverflowCountOffset_));
	}

	// UDATA _workPacketOverflowCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketOverflowCountTotalOffset_", declaredType="UDATA")
	public UDATA _workPacketOverflowCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeGCEnd.__workPacketOverflowCountTotalOffset_);
	}

	// UDATA _workPacketOverflowCountTotal
	public UDATAPointer _workPacketOverflowCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeGCEnd.__workPacketOverflowCountTotalOffset_));
	}

}
