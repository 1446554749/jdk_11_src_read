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
 * Structure: MM_ConcurrentCollectionStartEventPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentCollectionStartEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentCollectionStartEvent.class)
public class MM_ConcurrentCollectionStartEventPointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentCollectionStartEventPointer NULL = new MM_ConcurrentCollectionStartEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentCollectionStartEventPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentCollectionStartEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentCollectionStartEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentCollectionStartEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentCollectionStartEventPointer(address);
	}

	public MM_ConcurrentCollectionStartEventPointer add(long count) {
		return MM_ConcurrentCollectionStartEventPointer.cast(address + (MM_ConcurrentCollectionStartEvent.SIZEOF * count));
	}

	public MM_ConcurrentCollectionStartEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentCollectionStartEventPointer addOffset(long offset) {
		return MM_ConcurrentCollectionStartEventPointer.cast(address + offset);
	}

	public MM_ConcurrentCollectionStartEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentCollectionStartEventPointer sub(long count) {
		return MM_ConcurrentCollectionStartEventPointer.cast(address - (MM_ConcurrentCollectionStartEvent.SIZEOF * count));
	}

	public MM_ConcurrentCollectionStartEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentCollectionStartEventPointer subOffset(long offset) {
		return MM_ConcurrentCollectionStartEventPointer.cast(address - offset);
	}

	public MM_ConcurrentCollectionStartEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentCollectionStartEventPointer untag(long mask) {
		return MM_ConcurrentCollectionStartEventPointer.cast(address & ~mask);
	}

	public MM_ConcurrentCollectionStartEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentCollectionStartEvent.SIZEOF;
	}

	// Implementation methods

	// U64 cardCleaningPhase1Threshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningPhase1ThresholdOffset_", declaredType="U64")
	public UDATA cardCleaningPhase1Threshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._cardCleaningPhase1ThresholdOffset_));
	}

	// U64 cardCleaningPhase1Threshold
	public UDATAPointer cardCleaningPhase1ThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._cardCleaningPhase1ThresholdOffset_));
	}

	// U64 cardCleaningReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningReasonOffset_", declaredType="U64")
	public UDATA cardCleaningReason() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._cardCleaningReasonOffset_));
	}

	// U64 cardCleaningReason
	public UDATAPointer cardCleaningReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._cardCleaningReasonOffset_));
	}

	// U64 cardsCleaned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardsCleanedOffset_", declaredType="U64")
	public UDATA cardsCleaned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._cardsCleanedOffset_));
	}

	// U64 cardsCleaned
	public UDATAPointer cardsCleanedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._cardsCleanedOffset_));
	}

	// U64 contextid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_contextidOffset_", declaredType="U64")
	public UDATA contextid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._contextidOffset_));
	}

	// U64 contextid
	public UDATAPointer contextidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._contextidOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ConcurrentCollectionStartEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._eventidOffset_));
	}

	// MM_CommonGCStartData* gcStartData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcStartDataOffset_", declaredType="MM_CommonGCStartData*")
	public MM_CommonGCStartDataPointer gcStartData() throws CorruptDataException {
		return MM_CommonGCStartDataPointer.cast(getPointerAtOffset(MM_ConcurrentCollectionStartEvent._gcStartDataOffset_));
	}

	// MM_CommonGCStartData* gcStartData
	public PointerPointer gcStartDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._gcStartDataOffset_));
	}

	// U64 threadsScannedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadsScannedCountOffset_", declaredType="U64")
	public UDATA threadsScannedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._threadsScannedCountOffset_));
	}

	// U64 threadsScannedCount
	public UDATAPointer threadsScannedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._threadsScannedCountOffset_));
	}

	// U64 threadsToScanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadsToScanCountOffset_", declaredType="U64")
	public UDATA threadsToScanCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._threadsToScanCountOffset_));
	}

	// U64 threadsToScanCount
	public UDATAPointer threadsToScanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._threadsToScanCountOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._timestampOffset_));
	}

	// U64 traceTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceTargetOffset_", declaredType="U64")
	public UDATA traceTarget() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._traceTargetOffset_));
	}

	// U64 traceTarget
	public UDATAPointer traceTargetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._traceTargetOffset_));
	}

	// U64 tracedByHelpers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedByHelpersOffset_", declaredType="U64")
	public UDATA tracedByHelpers() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._tracedByHelpersOffset_));
	}

	// U64 tracedByHelpers
	public UDATAPointer tracedByHelpersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._tracedByHelpersOffset_));
	}

	// U64 tracedByMutators
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedByMutatorsOffset_", declaredType="U64")
	public UDATA tracedByMutators() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._tracedByMutatorsOffset_));
	}

	// U64 tracedByMutators
	public UDATAPointer tracedByMutatorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._tracedByMutatorsOffset_));
	}

	// U64 tracedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedTotalOffset_", declaredType="U64")
	public UDATA tracedTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._tracedTotalOffset_));
	}

	// U64 tracedTotal
	public UDATAPointer tracedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._tracedTotalOffset_));
	}

	// U64 workStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workStackOverflowCountOffset_", declaredType="U64")
	public UDATA workStackOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._workStackOverflowCountOffset_));
	}

	// U64 workStackOverflowCount
	public UDATAPointer workStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._workStackOverflowCountOffset_));
	}

	// U64 workStackOverflowOccured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workStackOverflowOccuredOffset_", declaredType="U64")
	public UDATA workStackOverflowOccured() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionStartEvent._workStackOverflowOccuredOffset_));
	}

	// U64 workStackOverflowOccured
	public UDATAPointer workStackOverflowOccuredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionStartEvent._workStackOverflowOccuredOffset_));
	}

}
