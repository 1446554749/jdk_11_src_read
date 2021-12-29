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
 * Structure: MM_ConcurrentCardTablePointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentCardTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentCardTable.class)
public class MM_ConcurrentCardTablePointer extends MM_CardTablePointer {

	// NULL
	public static final MM_ConcurrentCardTablePointer NULL = new MM_ConcurrentCardTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentCardTablePointer(long address) {
		super(address);
	}

	public static MM_ConcurrentCardTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentCardTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentCardTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentCardTablePointer(address);
	}

	public MM_ConcurrentCardTablePointer add(long count) {
		return MM_ConcurrentCardTablePointer.cast(address + (MM_ConcurrentCardTable.SIZEOF * count));
	}

	public MM_ConcurrentCardTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentCardTablePointer addOffset(long offset) {
		return MM_ConcurrentCardTablePointer.cast(address + offset);
	}

	public MM_ConcurrentCardTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentCardTablePointer sub(long count) {
		return MM_ConcurrentCardTablePointer.cast(address - (MM_ConcurrentCardTable.SIZEOF * count));
	}

	public MM_ConcurrentCardTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentCardTablePointer subOffset(long offset) {
		return MM_ConcurrentCardTablePointer.cast(address - offset);
	}

	public MM_ConcurrentCardTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentCardTablePointer untag(long mask) {
		return MM_ConcurrentCardTablePointer.cast(address & ~mask);
	}

	public MM_ConcurrentCardTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentCardTable.SIZEOF;
	}

	// Implementation methods

	// volatile CardCleanPhase _cardCleanPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleanPhaseOffset_", declaredType="volatile CardCleanPhase")
	public long _cardCleanPhase() throws CorruptDataException {
		if (CardCleanPhase.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentCardTable.__cardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentCardTable.__cardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentCardTable.__cardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentCardTable.__cardCleanPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// volatile CardCleanPhase _cardCleanPhase
	public EnumPointer _cardCleanPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cardCleanPhaseOffset_), CardCleanPhase.class);
	}

	// bool _cardTableReconfigured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableReconfiguredOffset_", declaredType="bool")
	public boolean _cardTableReconfigured() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentCardTable.__cardTableReconfiguredOffset_);
	}

	// bool _cardTableReconfigured
	public BoolPointer _cardTableReconfiguredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cardTableReconfiguredOffset_));
	}

	// MM_ConcurrentCardTableStats _cardTableStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableStatsOffset_", declaredType="MM_ConcurrentCardTableStats")
	public MM_ConcurrentCardTableStatsPointer _cardTableStats() throws CorruptDataException {
		return MM_ConcurrentCardTableStatsPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cardTableStatsOffset_));
	}

	// MM_ConcurrentCardTableStats _cardTableStats
	public PointerPointer _cardTableStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cardTableStatsOffset_));
	}

	// bool _cleanAllCards
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cleanAllCardsOffset_", declaredType="bool")
	public boolean _cleanAllCards() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentCardTable.__cleanAllCardsOffset_);
	}

	// bool _cleanAllCards
	public BoolPointer _cleanAllCardsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cleanAllCardsOffset_));
	}

	// CleaningRange* _cleaningRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cleaningRangesOffset_", declaredType="CleaningRange*")
	public CleaningRangePointer _cleaningRanges() throws CorruptDataException {
		return CleaningRangePointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__cleaningRangesOffset_));
	}

	// CleaningRange* _cleaningRanges
	public PointerPointer _cleaningRangesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__cleaningRangesOffset_));
	}

	// MM_ConcurrentGC* _collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorOffset_", declaredType="MM_ConcurrentGC*")
	public MM_ConcurrentGCPointer _collector() throws CorruptDataException {
		return MM_ConcurrentGCPointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__collectorOffset_));
	}

	// MM_ConcurrentGC* _collector
	public PointerPointer _collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__collectorOffset_));
	}

	// Card _concurrentCardCleanMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCardCleanMaskOffset_", declaredType="Card")
	public U8 _concurrentCardCleanMask() throws CorruptDataException {
		return new U8(getByteAtOffset(MM_ConcurrentCardTable.__concurrentCardCleanMaskOffset_));
	}

	// Card _concurrentCardCleanMask
	public U8Pointer _concurrentCardCleanMaskEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__concurrentCardCleanMaskOffset_));
	}

	// volatile CleaningRange* _currentCleaningRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentCleaningRangeOffset_", declaredType="volatile CleaningRange*")
	public CleaningRangePointer _currentCleaningRange() throws CorruptDataException {
		return CleaningRangePointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__currentCleaningRangeOffset_));
	}

	// volatile CleaningRange* _currentCleaningRange
	public PointerPointer _currentCleaningRangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__currentCleaningRangeOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__dispatcherOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__extensionsOffset_));
	}

	// Card _finalCardCleanMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalCardCleanMaskOffset_", declaredType="Card")
	public U8 _finalCardCleanMask() throws CorruptDataException {
		return new U8(getByteAtOffset(MM_ConcurrentCardTable.__finalCardCleanMaskOffset_));
	}

	// Card _finalCardCleanMask
	public U8Pointer _finalCardCleanMaskEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__finalCardCleanMaskOffset_));
	}

	// Card* _firstCardInPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__firstCardInPhaseOffset_", declaredType="Card*")
	public U8Pointer _firstCardInPhase() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__firstCardInPhaseOffset_));
	}

	// Card* _firstCardInPhase
	public PointerPointer _firstCardInPhaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__firstCardInPhaseOffset_));
	}

	// Card* _firstCardInPhase2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__firstCardInPhase2Offset_", declaredType="Card*")
	public U8Pointer _firstCardInPhase2() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__firstCardInPhase2Offset_));
	}

	// Card* _firstCardInPhase2
	public PointerPointer _firstCardInPhase2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__firstCardInPhase2Offset_));
	}

	// Card* _lastCard
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastCardOffset_", declaredType="Card*")
	public U8Pointer _lastCard() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__lastCardOffset_));
	}

	// Card* _lastCard
	public PointerPointer _lastCardEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__lastCardOffset_));
	}

	// CardCleanPhase _lastCardCleanPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastCardCleanPhaseOffset_", declaredType="CardCleanPhase")
	public long _lastCardCleanPhase() throws CorruptDataException {
		if (CardCleanPhase.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentCardTable.__lastCardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentCardTable.__lastCardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentCardTable.__lastCardCleanPhaseOffset_);
		} else if (CardCleanPhase.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentCardTable.__lastCardCleanPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CardCleanPhase _lastCardCleanPhase
	public EnumPointer _lastCardCleanPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__lastCardCleanPhaseOffset_), CardCleanPhase.class);
	}

	// volatile Card* _lastCardInPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastCardInPhaseOffset_", declaredType="volatile Card*")
	public U8Pointer _lastCardInPhase() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__lastCardInPhaseOffset_));
	}

	// volatile Card* _lastCardInPhase
	public PointerPointer _lastCardInPhaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__lastCardInPhaseOffset_));
	}

	// CleaningRange* _lastCleaningRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastCleaningRangeOffset_", declaredType="CleaningRange*")
	public CleaningRangePointer _lastCleaningRange() throws CorruptDataException {
		return CleaningRangePointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__lastCleaningRangeOffset_));
	}

	// CleaningRange* _lastCleaningRange
	public PointerPointer _lastCleaningRangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__lastCleaningRangeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__markingSchemeOffset_));
	}

	// U64 _maxCleaningRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxCleaningRangesOffset_", declaredType="U64")
	public UDATA _maxCleaningRanges() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentCardTable.__maxCleaningRangesOffset_));
	}

	// U64 _maxCleaningRanges
	public UDATAPointer _maxCleaningRangesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__maxCleaningRangesOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__omrVMOffset_));
	}

	// U64* _tlhMarkBits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhMarkBitsOffset_", declaredType="U64*")
	public UDATAPointer _tlhMarkBits() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_ConcurrentCardTable.__tlhMarkBitsOffset_));
	}

	// U64* _tlhMarkBits
	public PointerPointer _tlhMarkBitsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__tlhMarkBitsOffset_));
	}

	// MM_MemoryHandle _tlhMarkMapMemoryHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhMarkMapMemoryHandleOffset_", declaredType="MM_MemoryHandle")
	public MM_MemoryHandlePointer _tlhMarkMapMemoryHandle() throws CorruptDataException {
		return MM_MemoryHandlePointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__tlhMarkMapMemoryHandleOffset_));
	}

	// MM_MemoryHandle _tlhMarkMapMemoryHandle
	public PointerPointer _tlhMarkMapMemoryHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentCardTable.__tlhMarkMapMemoryHandleOffset_));
	}

}
