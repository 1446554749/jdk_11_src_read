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
 * Structure: MM_ConcurrentCardTableStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentCardTableStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentCardTableStats.class)
public class MM_ConcurrentCardTableStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_ConcurrentCardTableStatsPointer NULL = new MM_ConcurrentCardTableStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentCardTableStatsPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentCardTableStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentCardTableStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentCardTableStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentCardTableStatsPointer(address);
	}

	public MM_ConcurrentCardTableStatsPointer add(long count) {
		return MM_ConcurrentCardTableStatsPointer.cast(address + (MM_ConcurrentCardTableStats.SIZEOF * count));
	}

	public MM_ConcurrentCardTableStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentCardTableStatsPointer addOffset(long offset) {
		return MM_ConcurrentCardTableStatsPointer.cast(address + offset);
	}

	public MM_ConcurrentCardTableStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentCardTableStatsPointer sub(long count) {
		return MM_ConcurrentCardTableStatsPointer.cast(address - (MM_ConcurrentCardTableStats.SIZEOF * count));
	}

	public MM_ConcurrentCardTableStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentCardTableStatsPointer subOffset(long offset) {
		return MM_ConcurrentCardTableStatsPointer.cast(address - offset);
	}

	public MM_ConcurrentCardTableStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentCardTableStatsPointer untag(long mask) {
		return MM_ConcurrentCardTableStatsPointer.cast(address & ~mask);
	}

	public MM_ConcurrentCardTableStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentCardTableStats.SIZEOF;
	}

	// Implementation methods

	// U64 _cardCleaningPhase1Kickoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningPhase1KickoffOffset_", declaredType="U64")
	public UDATA _cardCleaningPhase1Kickoff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats.__cardCleaningPhase1KickoffOffset_));
	}

	// U64 _cardCleaningPhase1Kickoff
	public UDATAPointer _cardCleaningPhase1KickoffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats.__cardCleaningPhase1KickoffOffset_));
	}

	// U64 _cardCleaningPhase2Kickoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningPhase2KickoffOffset_", declaredType="U64")
	public UDATA _cardCleaningPhase2Kickoff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats.__cardCleaningPhase2KickoffOffset_));
	}

	// U64 _cardCleaningPhase2Kickoff
	public UDATAPointer _cardCleaningPhase2KickoffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats.__cardCleaningPhase2KickoffOffset_));
	}

	// U64 _cardCleaningPhase3Kickoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningPhase3KickoffOffset_", declaredType="U64")
	public UDATA _cardCleaningPhase3Kickoff() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats.__cardCleaningPhase3KickoffOffset_));
	}

	// U64 _cardCleaningPhase3Kickoff
	public UDATAPointer _cardCleaningPhase3KickoffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats.__cardCleaningPhase3KickoffOffset_));
	}

	// volatile U64 concurrentCleanedCardsPhase1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentCleanedCardsPhase1Offset_", declaredType="volatile U64")
	public UDATA concurrentCleanedCardsPhase1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase1Offset_));
	}

	// volatile U64 concurrentCleanedCardsPhase1
	public UDATAPointer concurrentCleanedCardsPhase1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase1Offset_));
	}

	// volatile U64 concurrentCleanedCardsPhase2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentCleanedCardsPhase2Offset_", declaredType="volatile U64")
	public UDATA concurrentCleanedCardsPhase2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase2Offset_));
	}

	// volatile U64 concurrentCleanedCardsPhase2
	public UDATAPointer concurrentCleanedCardsPhase2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase2Offset_));
	}

	// volatile U64 concurrentCleanedCardsPhase3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentCleanedCardsPhase3Offset_", declaredType="volatile U64")
	public UDATA concurrentCleanedCardsPhase3() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase3Offset_));
	}

	// volatile U64 concurrentCleanedCardsPhase3
	public UDATAPointer concurrentCleanedCardsPhase3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._concurrentCleanedCardsPhase3Offset_));
	}

	// volatile U64 finalCleanedCardsPhase1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalCleanedCardsPhase1Offset_", declaredType="volatile U64")
	public UDATA finalCleanedCardsPhase1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._finalCleanedCardsPhase1Offset_));
	}

	// volatile U64 finalCleanedCardsPhase1
	public UDATAPointer finalCleanedCardsPhase1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._finalCleanedCardsPhase1Offset_));
	}

	// volatile U64 finalCleanedCardsPhase2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalCleanedCardsPhase2Offset_", declaredType="volatile U64")
	public UDATA finalCleanedCardsPhase2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._finalCleanedCardsPhase2Offset_));
	}

	// volatile U64 finalCleanedCardsPhase2
	public UDATAPointer finalCleanedCardsPhase2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._finalCleanedCardsPhase2Offset_));
	}

	// U64 totalCards
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalCardsOffset_", declaredType="U64")
	public UDATA totalCards() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTableStats._totalCardsOffset_));
	}

	// U64 totalCards
	public UDATAPointer totalCardsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTableStats._totalCardsOffset_));
	}

}
