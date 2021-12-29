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
 * Structure: MM_VerboseEventConcurrentStartPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventConcurrentStartPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventConcurrentStart.class)
public class MM_VerboseEventConcurrentStartPointer extends MM_VerboseEventGCStartPointer {

	// NULL
	public static final MM_VerboseEventConcurrentStartPointer NULL = new MM_VerboseEventConcurrentStartPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventConcurrentStartPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventConcurrentStartPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventConcurrentStartPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventConcurrentStartPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventConcurrentStartPointer(address);
	}

	public MM_VerboseEventConcurrentStartPointer add(long count) {
		return MM_VerboseEventConcurrentStartPointer.cast(address + (MM_VerboseEventConcurrentStart.SIZEOF * count));
	}

	public MM_VerboseEventConcurrentStartPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventConcurrentStartPointer addOffset(long offset) {
		return MM_VerboseEventConcurrentStartPointer.cast(address + offset);
	}

	public MM_VerboseEventConcurrentStartPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventConcurrentStartPointer sub(long count) {
		return MM_VerboseEventConcurrentStartPointer.cast(address - (MM_VerboseEventConcurrentStart.SIZEOF * count));
	}

	public MM_VerboseEventConcurrentStartPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventConcurrentStartPointer subOffset(long offset) {
		return MM_VerboseEventConcurrentStartPointer.cast(address - offset);
	}

	public MM_VerboseEventConcurrentStartPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventConcurrentStartPointer untag(long mask) {
		return MM_VerboseEventConcurrentStartPointer.cast(address & ~mask);
	}

	public MM_VerboseEventConcurrentStartPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventConcurrentStart.SIZEOF;
	}

	// Implementation methods

	// UDATA _cardCleaningPhase1Threshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningPhase1ThresholdOffset_", declaredType="UDATA")
	public UDATA _cardCleaningPhase1Threshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__cardCleaningPhase1ThresholdOffset_);
	}

	// UDATA _cardCleaningPhase1Threshold
	public UDATAPointer _cardCleaningPhase1ThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__cardCleaningPhase1ThresholdOffset_));
	}

	// UDATA _cardCleaningReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningReasonOffset_", declaredType="UDATA")
	public UDATA _cardCleaningReason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__cardCleaningReasonOffset_);
	}

	// UDATA _cardCleaningReason
	public UDATAPointer _cardCleaningReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__cardCleaningReasonOffset_));
	}

	// UDATA _cardsCleaned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardsCleanedOffset_", declaredType="UDATA")
	public UDATA _cardsCleaned() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__cardsCleanedOffset_);
	}

	// UDATA _cardsCleaned
	public UDATAPointer _cardsCleanedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__cardsCleanedOffset_));
	}

	// UDATA _conCollectionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conCollectionCountOffset_", declaredType="UDATA")
	public UDATA _conCollectionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__conCollectionCountOffset_);
	}

	// UDATA _conCollectionCount
	public UDATAPointer _conCollectionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__conCollectionCountOffset_));
	}

	// U64 _lastConTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastConTimeOffset_", declaredType="U64")
	public UDATA _lastConTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventConcurrentStart.__lastConTimeOffset_));
	}

	// U64 _lastConTime
	public UDATAPointer _lastConTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__lastConTimeOffset_));
	}

	// UDATA _threadsScannedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsScannedCountOffset_", declaredType="UDATA")
	public UDATA _threadsScannedCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__threadsScannedCountOffset_);
	}

	// UDATA _threadsScannedCount
	public UDATAPointer _threadsScannedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__threadsScannedCountOffset_));
	}

	// UDATA _threadsToScanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsToScanCountOffset_", declaredType="UDATA")
	public UDATA _threadsToScanCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__threadsToScanCountOffset_);
	}

	// UDATA _threadsToScanCount
	public UDATAPointer _threadsToScanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__threadsToScanCountOffset_));
	}

	// UDATA _traceTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceTargetOffset_", declaredType="UDATA")
	public UDATA _traceTarget() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__traceTargetOffset_);
	}

	// UDATA _traceTarget
	public UDATAPointer _traceTargetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__traceTargetOffset_));
	}

	// UDATA _tracedByHelpers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tracedByHelpersOffset_", declaredType="UDATA")
	public UDATA _tracedByHelpers() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__tracedByHelpersOffset_);
	}

	// UDATA _tracedByHelpers
	public UDATAPointer _tracedByHelpersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__tracedByHelpersOffset_));
	}

	// UDATA _tracedByMutators
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tracedByMutatorsOffset_", declaredType="UDATA")
	public UDATA _tracedByMutators() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__tracedByMutatorsOffset_);
	}

	// UDATA _tracedByMutators
	public UDATAPointer _tracedByMutatorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__tracedByMutatorsOffset_));
	}

	// UDATA _tracedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tracedTotalOffset_", declaredType="UDATA")
	public UDATA _tracedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__tracedTotalOffset_);
	}

	// UDATA _tracedTotal
	public UDATAPointer _tracedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__tracedTotalOffset_));
	}

	// UDATA _workStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStackOverflowCountOffset_", declaredType="UDATA")
	public UDATA _workStackOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__workStackOverflowCountOffset_);
	}

	// UDATA _workStackOverflowCount
	public UDATAPointer _workStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__workStackOverflowCountOffset_));
	}

	// UDATA _workStackOverflowOccured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStackOverflowOccuredOffset_", declaredType="UDATA")
	public UDATA _workStackOverflowOccured() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentStart.__workStackOverflowOccuredOffset_);
	}

	// UDATA _workStackOverflowOccured
	public UDATAPointer _workStackOverflowOccuredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentStart.__workStackOverflowOccuredOffset_));
	}

}
