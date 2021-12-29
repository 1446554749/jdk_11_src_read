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
 * Structure: MM_ConcurrentCollectionCardCleaningEndEventPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentCollectionCardCleaningEndEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentCollectionCardCleaningEndEvent.class)
public class MM_ConcurrentCollectionCardCleaningEndEventPointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentCollectionCardCleaningEndEventPointer NULL = new MM_ConcurrentCollectionCardCleaningEndEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentCollectionCardCleaningEndEventPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentCollectionCardCleaningEndEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentCollectionCardCleaningEndEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentCollectionCardCleaningEndEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentCollectionCardCleaningEndEventPointer(address);
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer add(long count) {
		return MM_ConcurrentCollectionCardCleaningEndEventPointer.cast(address + (MM_ConcurrentCollectionCardCleaningEndEvent.SIZEOF * count));
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer addOffset(long offset) {
		return MM_ConcurrentCollectionCardCleaningEndEventPointer.cast(address + offset);
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer sub(long count) {
		return MM_ConcurrentCollectionCardCleaningEndEventPointer.cast(address - (MM_ConcurrentCollectionCardCleaningEndEvent.SIZEOF * count));
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer subOffset(long offset) {
		return MM_ConcurrentCollectionCardCleaningEndEventPointer.cast(address - offset);
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer untag(long mask) {
		return MM_ConcurrentCollectionCardCleaningEndEventPointer.cast(address & ~mask);
	}

	public MM_ConcurrentCollectionCardCleaningEndEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentCollectionCardCleaningEndEvent.SIZEOF;
	}

	// Implementation methods

	// U64 bytesTraced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesTracedOffset_", declaredType="U64")
	public UDATA bytesTraced() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._bytesTracedOffset_));
	}

	// U64 bytesTraced
	public UDATAPointer bytesTracedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._bytesTracedOffset_));
	}

	// U64 cardCleaningPhase1KickOff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningPhase1KickOffOffset_", declaredType="U64")
	public UDATA cardCleaningPhase1KickOff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase1KickOffOffset_));
	}

	// U64 cardCleaningPhase1KickOff
	public UDATAPointer cardCleaningPhase1KickOffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase1KickOffOffset_));
	}

	// U64 cardCleaningPhase2KickOff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningPhase2KickOffOffset_", declaredType="U64")
	public UDATA cardCleaningPhase2KickOff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase2KickOffOffset_));
	}

	// U64 cardCleaningPhase2KickOff
	public UDATAPointer cardCleaningPhase2KickOffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase2KickOffOffset_));
	}

	// U64 cardCleaningPhase3KickOff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningPhase3KickOffOffset_", declaredType="U64")
	public UDATA cardCleaningPhase3KickOff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase3KickOffOffset_));
	}

	// U64 cardCleaningPhase3KickOff
	public UDATAPointer cardCleaningPhase3KickOffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningPhase3KickOffOffset_));
	}

	// U64 cardCleaningThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningThresholdOffset_", declaredType="U64")
	public UDATA cardCleaningThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningThresholdOffset_));
	}

	// U64 cardCleaningThreshold
	public UDATAPointer cardCleaningThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._cardCleaningThresholdOffset_));
	}

	// U64 concleanedCards
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concleanedCardsOffset_", declaredType="U64")
	public UDATA concleanedCards() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsOffset_));
	}

	// U64 concleanedCards
	public UDATAPointer concleanedCardsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsOffset_));
	}

	// U64 concleanedCardsPhase1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concleanedCardsPhase1Offset_", declaredType="U64")
	public UDATA concleanedCardsPhase1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase1Offset_));
	}

	// U64 concleanedCardsPhase1
	public UDATAPointer concleanedCardsPhase1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase1Offset_));
	}

	// U64 concleanedCardsPhase2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concleanedCardsPhase2Offset_", declaredType="U64")
	public UDATA concleanedCardsPhase2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase2Offset_));
	}

	// U64 concleanedCardsPhase2
	public UDATAPointer concleanedCardsPhase2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase2Offset_));
	}

	// U64 concleanedCardsPhase3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concleanedCardsPhase3Offset_", declaredType="U64")
	public UDATA concleanedCardsPhase3() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase3Offset_));
	}

	// U64 concleanedCardsPhase3
	public UDATAPointer concleanedCardsPhase3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._concleanedCardsPhase3Offset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._currentThreadOffset_));
	}

	// U64 duration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_durationOffset_", declaredType="U64")
	public UDATA duration() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._durationOffset_));
	}

	// U64 duration
	public UDATAPointer durationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._durationOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._eventidOffset_));
	}

	// U64 finalcleanedCards
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalcleanedCardsOffset_", declaredType="U64")
	public UDATA finalcleanedCards() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsOffset_));
	}

	// U64 finalcleanedCards
	public UDATAPointer finalcleanedCardsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsOffset_));
	}

	// U64 finalcleanedCardsPhase1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalcleanedCardsPhase1Offset_", declaredType="U64")
	public UDATA finalcleanedCardsPhase1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsPhase1Offset_));
	}

	// U64 finalcleanedCardsPhase1
	public UDATAPointer finalcleanedCardsPhase1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsPhase1Offset_));
	}

	// U64 finalcleanedCardsPhase2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalcleanedCardsPhase2Offset_", declaredType="U64")
	public UDATA finalcleanedCardsPhase2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsPhase2Offset_));
	}

	// U64 finalcleanedCardsPhase2
	public UDATAPointer finalcleanedCardsPhase2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._finalcleanedCardsPhase2Offset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._timestampOffset_));
	}

	// U64 workStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workStackOverflowCountOffset_", declaredType="U64")
	public UDATA workStackOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCollectionCardCleaningEndEvent._workStackOverflowCountOffset_));
	}

	// U64 workStackOverflowCount
	public UDATAPointer workStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCollectionCardCleaningEndEvent._workStackOverflowCountOffset_));
	}

}
