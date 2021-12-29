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
 * Structure: MM_CompactGroupPersistentStatsPointer
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
 * The generated code will provide getters for all elements in the MM_CompactGroupPersistentStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompactGroupPersistentStats.class)
public class MM_CompactGroupPersistentStatsPointer extends StructurePointer {

	// NULL
	public static final MM_CompactGroupPersistentStatsPointer NULL = new MM_CompactGroupPersistentStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompactGroupPersistentStatsPointer(long address) {
		super(address);
	}

	public static MM_CompactGroupPersistentStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompactGroupPersistentStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompactGroupPersistentStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompactGroupPersistentStatsPointer(address);
	}

	public MM_CompactGroupPersistentStatsPointer add(long count) {
		return MM_CompactGroupPersistentStatsPointer.cast(address + (MM_CompactGroupPersistentStats.SIZEOF * count));
	}

	public MM_CompactGroupPersistentStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompactGroupPersistentStatsPointer addOffset(long offset) {
		return MM_CompactGroupPersistentStatsPointer.cast(address + offset);
	}

	public MM_CompactGroupPersistentStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompactGroupPersistentStatsPointer sub(long count) {
		return MM_CompactGroupPersistentStatsPointer.cast(address - (MM_CompactGroupPersistentStats.SIZEOF * count));
	}

	public MM_CompactGroupPersistentStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompactGroupPersistentStatsPointer subOffset(long offset) {
		return MM_CompactGroupPersistentStatsPointer.cast(address - offset);
	}

	public MM_CompactGroupPersistentStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompactGroupPersistentStatsPointer untag(long mask) {
		return MM_CompactGroupPersistentStatsPointer.cast(address & ~mask);
	}

	public MM_CompactGroupPersistentStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompactGroupPersistentStats.SIZEOF;
	}

	// Implementation methods

	// U64 _averageAllocationAgeToGroup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageAllocationAgeToGroupOffset_", declaredType="U64")
	public UDATA _averageAllocationAgeToGroup() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactGroupPersistentStats.__averageAllocationAgeToGroupOffset_));
	}

	// U64 _averageAllocationAgeToGroup
	public UDATAPointer _averageAllocationAgeToGroupEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__averageAllocationAgeToGroupOffset_));
	}

	// double _historicalSurvivalRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historicalSurvivalRateOffset_", declaredType="double")
	public double _historicalSurvivalRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_CompactGroupPersistentStats.__historicalSurvivalRateOffset_);
	}

	// double _historicalSurvivalRate
	public DoublePointer _historicalSurvivalRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__historicalSurvivalRateOffset_));
	}

	// UDATA _liveBytesAbsoluteDeviation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveBytesAbsoluteDeviationOffset_", declaredType="UDATA")
	public UDATA _liveBytesAbsoluteDeviation() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__liveBytesAbsoluteDeviationOffset_);
	}

	// UDATA _liveBytesAbsoluteDeviation
	public UDATAPointer _liveBytesAbsoluteDeviationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__liveBytesAbsoluteDeviationOffset_));
	}

	// U64 _maxAllocationAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxAllocationAgeOffset_", declaredType="U64")
	public UDATA _maxAllocationAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactGroupPersistentStats.__maxAllocationAgeOffset_));
	}

	// U64 _maxAllocationAge
	public UDATAPointer _maxAllocationAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__maxAllocationAgeOffset_));
	}

	// volatile U64 _measuredAllocationAgeToGroupDuringCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredAllocationAgeToGroupDuringCopyForwardOffset_", declaredType="volatile U64")
	public UDATA _measuredAllocationAgeToGroupDuringCopyForward() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactGroupPersistentStats.__measuredAllocationAgeToGroupDuringCopyForwardOffset_));
	}

	// volatile U64 _measuredAllocationAgeToGroupDuringCopyForward
	public UDATAPointer _measuredAllocationAgeToGroupDuringCopyForwardEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredAllocationAgeToGroupDuringCopyForwardOffset_));
	}

	// volatile UDATA _measuredBytesCopiedFromGroupDuringCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredBytesCopiedFromGroupDuringCopyForwardOffset_", declaredType="volatile UDATA")
	public UDATA _measuredBytesCopiedFromGroupDuringCopyForward() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredBytesCopiedFromGroupDuringCopyForwardOffset_);
	}

	// volatile UDATA _measuredBytesCopiedFromGroupDuringCopyForward
	public UDATAPointer _measuredBytesCopiedFromGroupDuringCopyForwardEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredBytesCopiedFromGroupDuringCopyForwardOffset_));
	}

	// volatile UDATA _measuredBytesCopiedToGroupDuringCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredBytesCopiedToGroupDuringCopyForwardOffset_", declaredType="volatile UDATA")
	public UDATA _measuredBytesCopiedToGroupDuringCopyForward() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredBytesCopiedToGroupDuringCopyForwardOffset_);
	}

	// volatile UDATA _measuredBytesCopiedToGroupDuringCopyForward
	public UDATAPointer _measuredBytesCopiedToGroupDuringCopyForwardEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredBytesCopiedToGroupDuringCopyForwardOffset_));
	}

	// UDATA _measuredLiveBytesAfterCollectInCollectedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredLiveBytesAfterCollectInCollectedSetOffset_", declaredType="UDATA")
	public UDATA _measuredLiveBytesAfterCollectInCollectedSet() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredLiveBytesAfterCollectInCollectedSetOffset_);
	}

	// UDATA _measuredLiveBytesAfterCollectInCollectedSet
	public UDATAPointer _measuredLiveBytesAfterCollectInCollectedSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredLiveBytesAfterCollectInCollectedSetOffset_));
	}

	// UDATA _measuredLiveBytesAfterCollectInGroup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredLiveBytesAfterCollectInGroupOffset_", declaredType="UDATA")
	public UDATA _measuredLiveBytesAfterCollectInGroup() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredLiveBytesAfterCollectInGroupOffset_);
	}

	// UDATA _measuredLiveBytesAfterCollectInGroup
	public UDATAPointer _measuredLiveBytesAfterCollectInGroupEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredLiveBytesAfterCollectInGroupOffset_));
	}

	// UDATA _measuredLiveBytesBeforeCollectInCollectedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredLiveBytesBeforeCollectInCollectedSetOffset_", declaredType="UDATA")
	public UDATA _measuredLiveBytesBeforeCollectInCollectedSet() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredLiveBytesBeforeCollectInCollectedSetOffset_);
	}

	// UDATA _measuredLiveBytesBeforeCollectInCollectedSet
	public UDATAPointer _measuredLiveBytesBeforeCollectInCollectedSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredLiveBytesBeforeCollectInCollectedSetOffset_));
	}

	// UDATA _measuredLiveBytesBeforeCollectInGroup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__measuredLiveBytesBeforeCollectInGroupOffset_", declaredType="UDATA")
	public UDATA _measuredLiveBytesBeforeCollectInGroup() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__measuredLiveBytesBeforeCollectInGroupOffset_);
	}

	// UDATA _measuredLiveBytesBeforeCollectInGroup
	public UDATAPointer _measuredLiveBytesBeforeCollectInGroupEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__measuredLiveBytesBeforeCollectInGroupOffset_));
	}

	// double _projectedInstantaneousSurvivalRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedInstantaneousSurvivalRateOffset_", declaredType="double")
	public double _projectedInstantaneousSurvivalRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRateOffset_);
	}

	// double _projectedInstantaneousSurvivalRate
	public DoublePointer _projectedInstantaneousSurvivalRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRateOffset_));
	}

	// double _projectedInstantaneousSurvivalRatePerAgeUnit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedInstantaneousSurvivalRatePerAgeUnitOffset_", declaredType="double")
	public double _projectedInstantaneousSurvivalRatePerAgeUnit() throws CorruptDataException {
		return getDoubleAtOffset(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRatePerAgeUnitOffset_);
	}

	// double _projectedInstantaneousSurvivalRatePerAgeUnit
	public DoublePointer _projectedInstantaneousSurvivalRatePerAgeUnitEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRatePerAgeUnitOffset_));
	}

	// double _projectedInstantaneousSurvivalRateThisPGCPerAgeUnit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedInstantaneousSurvivalRateThisPGCPerAgeUnitOffset_", declaredType="double")
	public double _projectedInstantaneousSurvivalRateThisPGCPerAgeUnit() throws CorruptDataException {
		return getDoubleAtOffset(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRateThisPGCPerAgeUnitOffset_);
	}

	// double _projectedInstantaneousSurvivalRateThisPGCPerAgeUnit
	public DoublePointer _projectedInstantaneousSurvivalRateThisPGCPerAgeUnitEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedInstantaneousSurvivalRateThisPGCPerAgeUnitOffset_));
	}

	// UDATA _projectedLiveBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesOffset_);
	}

	// UDATA _projectedLiveBytes
	public UDATAPointer _projectedLiveBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesOffset_));
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesAfterPreviousPGCInCollectedSetOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSet() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetOffset_);
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSet
	public UDATAPointer _projectedLiveBytesAfterPreviousPGCInCollectedSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetOffset_));
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFraction() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionOffset_);
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFraction
	public UDATAPointer _projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionOffset_));
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFraction() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionOffset_);
	}

	// UDATA _projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFraction
	public UDATAPointer _projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionOffset_));
	}

	// UDATA _projectedLiveBytesBeforeCollectInCollectedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesBeforeCollectInCollectedSetOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesBeforeCollectInCollectedSet() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesBeforeCollectInCollectedSetOffset_);
	}

	// UDATA _projectedLiveBytesBeforeCollectInCollectedSet
	public UDATAPointer _projectedLiveBytesBeforeCollectInCollectedSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesBeforeCollectInCollectedSetOffset_));
	}

	// UDATA _projectedLiveBytesBeforeCollectInGroup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesBeforeCollectInGroupOffset_", declaredType="UDATA")
	public UDATA _projectedLiveBytesBeforeCollectInGroup() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__projectedLiveBytesBeforeCollectInGroupOffset_);
	}

	// UDATA _projectedLiveBytesBeforeCollectInGroup
	public UDATAPointer _projectedLiveBytesBeforeCollectInGroupEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__projectedLiveBytesBeforeCollectInGroupOffset_));
	}

	// UDATA _regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountOffset_", declaredType="UDATA")
	public UDATA _regionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__regionCountOffset_);
	}

	// UDATA _regionCount
	public UDATAPointer _regionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__regionCountOffset_));
	}

	// UDATA _regionsInRegionCollectionSetForPGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsInRegionCollectionSetForPGCOffset_", declaredType="UDATA")
	public UDATA _regionsInRegionCollectionSetForPGC() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompactGroupPersistentStats.__regionsInRegionCollectionSetForPGCOffset_);
	}

	// UDATA _regionsInRegionCollectionSetForPGC
	public UDATAPointer _regionsInRegionCollectionSetForPGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__regionsInRegionCollectionSetForPGCOffset_));
	}

	// bool _statsHaveBeenUpdatedThisCycle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__statsHaveBeenUpdatedThisCycleOffset_", declaredType="bool")
	public boolean _statsHaveBeenUpdatedThisCycle() throws CorruptDataException {
		return getBoolAtOffset(MM_CompactGroupPersistentStats.__statsHaveBeenUpdatedThisCycleOffset_);
	}

	// bool _statsHaveBeenUpdatedThisCycle
	public BoolPointer _statsHaveBeenUpdatedThisCycleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__statsHaveBeenUpdatedThisCycleOffset_));
	}

	// double _weightedSurvivalRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weightedSurvivalRateOffset_", declaredType="double")
	public double _weightedSurvivalRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_CompactGroupPersistentStats.__weightedSurvivalRateOffset_);
	}

	// double _weightedSurvivalRate
	public DoublePointer _weightedSurvivalRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_CompactGroupPersistentStats.__weightedSurvivalRateOffset_));
	}

}
