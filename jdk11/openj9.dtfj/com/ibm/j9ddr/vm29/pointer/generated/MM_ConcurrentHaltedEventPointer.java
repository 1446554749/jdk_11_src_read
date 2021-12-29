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
 * Structure: MM_ConcurrentHaltedEventPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentHaltedEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentHaltedEvent.class)
public class MM_ConcurrentHaltedEventPointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentHaltedEventPointer NULL = new MM_ConcurrentHaltedEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentHaltedEventPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentHaltedEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentHaltedEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentHaltedEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentHaltedEventPointer(address);
	}

	public MM_ConcurrentHaltedEventPointer add(long count) {
		return MM_ConcurrentHaltedEventPointer.cast(address + (MM_ConcurrentHaltedEvent.SIZEOF * count));
	}

	public MM_ConcurrentHaltedEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentHaltedEventPointer addOffset(long offset) {
		return MM_ConcurrentHaltedEventPointer.cast(address + offset);
	}

	public MM_ConcurrentHaltedEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentHaltedEventPointer sub(long count) {
		return MM_ConcurrentHaltedEventPointer.cast(address - (MM_ConcurrentHaltedEvent.SIZEOF * count));
	}

	public MM_ConcurrentHaltedEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentHaltedEventPointer subOffset(long offset) {
		return MM_ConcurrentHaltedEventPointer.cast(address - offset);
	}

	public MM_ConcurrentHaltedEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentHaltedEventPointer untag(long mask) {
		return MM_ConcurrentHaltedEventPointer.cast(address & ~mask);
	}

	public MM_ConcurrentHaltedEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentHaltedEvent.SIZEOF;
	}

	// Implementation methods

	// U64 cardCleaningThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningThresholdOffset_", declaredType="U64")
	public UDATA cardCleaningThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._cardCleaningThresholdOffset_));
	}

	// U64 cardCleaningThreshold
	public UDATAPointer cardCleaningThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._cardCleaningThresholdOffset_));
	}

	// U64 cardsCleaned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardsCleanedOffset_", declaredType="U64")
	public UDATA cardsCleaned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._cardsCleanedOffset_));
	}

	// U64 cardsCleaned
	public UDATAPointer cardsCleanedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._cardsCleanedOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ConcurrentHaltedEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._eventidOffset_));
	}

	// U64 executionMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_executionModeOffset_", declaredType="U64")
	public UDATA executionMode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._executionModeOffset_));
	}

	// U64 executionMode
	public UDATAPointer executionModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._executionModeOffset_));
	}

	// U64 isCardCleaningComplete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCardCleaningCompleteOffset_", declaredType="U64")
	public UDATA isCardCleaningComplete() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._isCardCleaningCompleteOffset_));
	}

	// U64 isCardCleaningComplete
	public UDATAPointer isCardCleaningCompleteEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._isCardCleaningCompleteOffset_));
	}

	// U64 isTracingExhausted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isTracingExhaustedOffset_", declaredType="U64")
	public UDATA isTracingExhausted() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._isTracingExhaustedOffset_));
	}

	// U64 isTracingExhausted
	public UDATAPointer isTracingExhaustedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._isTracingExhaustedOffset_));
	}

	// U64 scanClassesMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scanClassesModeOffset_", declaredType="U64")
	public UDATA scanClassesMode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._scanClassesModeOffset_));
	}

	// U64 scanClassesMode
	public UDATAPointer scanClassesModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._scanClassesModeOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._timestampOffset_));
	}

	// U64 traceTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceTargetOffset_", declaredType="U64")
	public UDATA traceTarget() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._traceTargetOffset_));
	}

	// U64 traceTarget
	public UDATAPointer traceTargetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._traceTargetOffset_));
	}

	// U64 tracedByHelpers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedByHelpersOffset_", declaredType="U64")
	public UDATA tracedByHelpers() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._tracedByHelpersOffset_));
	}

	// U64 tracedByHelpers
	public UDATAPointer tracedByHelpersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._tracedByHelpersOffset_));
	}

	// U64 tracedByMutators
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedByMutatorsOffset_", declaredType="U64")
	public UDATA tracedByMutators() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._tracedByMutatorsOffset_));
	}

	// U64 tracedByMutators
	public UDATAPointer tracedByMutatorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._tracedByMutatorsOffset_));
	}

	// U64 tracedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracedTotalOffset_", declaredType="U64")
	public UDATA tracedTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._tracedTotalOffset_));
	}

	// U64 tracedTotal
	public UDATAPointer tracedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._tracedTotalOffset_));
	}

	// U64 workStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workStackOverflowCountOffset_", declaredType="U64")
	public UDATA workStackOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._workStackOverflowCountOffset_));
	}

	// U64 workStackOverflowCount
	public UDATAPointer workStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._workStackOverflowCountOffset_));
	}

	// U64 workStackOverflowOccured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workStackOverflowOccuredOffset_", declaredType="U64")
	public UDATA workStackOverflowOccured() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentHaltedEvent._workStackOverflowOccuredOffset_));
	}

	// U64 workStackOverflowOccured
	public UDATAPointer workStackOverflowOccuredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentHaltedEvent._workStackOverflowOccuredOffset_));
	}

}
