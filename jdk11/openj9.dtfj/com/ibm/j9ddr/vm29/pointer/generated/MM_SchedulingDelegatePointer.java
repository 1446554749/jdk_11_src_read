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
 * Structure: MM_SchedulingDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_SchedulingDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SchedulingDelegate.class)
public class MM_SchedulingDelegatePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_SchedulingDelegatePointer NULL = new MM_SchedulingDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SchedulingDelegatePointer(long address) {
		super(address);
	}

	public static MM_SchedulingDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SchedulingDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SchedulingDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SchedulingDelegatePointer(address);
	}

	public MM_SchedulingDelegatePointer add(long count) {
		return MM_SchedulingDelegatePointer.cast(address + (MM_SchedulingDelegate.SIZEOF * count));
	}

	public MM_SchedulingDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SchedulingDelegatePointer addOffset(long offset) {
		return MM_SchedulingDelegatePointer.cast(address + offset);
	}

	public MM_SchedulingDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SchedulingDelegatePointer sub(long count) {
		return MM_SchedulingDelegatePointer.cast(address - (MM_SchedulingDelegate.SIZEOF * count));
	}

	public MM_SchedulingDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SchedulingDelegatePointer subOffset(long offset) {
		return MM_SchedulingDelegatePointer.cast(address - offset);
	}

	public MM_SchedulingDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SchedulingDelegatePointer untag(long mask) {
		return MM_SchedulingDelegatePointer.cast(address & ~mask);
	}

	public MM_SchedulingDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SchedulingDelegate.SIZEOF;
	}

	// Implementation methods

	// double _automaticDefragmentEmptinessThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__automaticDefragmentEmptinessThresholdOffset_", declaredType="double")
	public double _automaticDefragmentEmptinessThreshold() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__automaticDefragmentEmptinessThresholdOffset_);
	}

	// double _automaticDefragmentEmptinessThreshold
	public DoublePointer _automaticDefragmentEmptinessThresholdEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__automaticDefragmentEmptinessThresholdOffset_));
	}

	// double _averageCopyForwardBytesCopied
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageCopyForwardBytesCopiedOffset_", declaredType="double")
	public double _averageCopyForwardBytesCopied() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__averageCopyForwardBytesCopiedOffset_);
	}

	// double _averageCopyForwardBytesCopied
	public DoublePointer _averageCopyForwardBytesCopiedEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__averageCopyForwardBytesCopiedOffset_));
	}

	// double _averageCopyForwardBytesDiscarded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageCopyForwardBytesDiscardedOffset_", declaredType="double")
	public double _averageCopyForwardBytesDiscarded() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__averageCopyForwardBytesDiscardedOffset_);
	}

	// double _averageCopyForwardBytesDiscarded
	public DoublePointer _averageCopyForwardBytesDiscardedEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__averageCopyForwardBytesDiscardedOffset_));
	}

	// double _averageCopyForwardRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageCopyForwardRateOffset_", declaredType="double")
	public double _averageCopyForwardRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__averageCopyForwardRateOffset_);
	}

	// double _averageCopyForwardRate
	public DoublePointer _averageCopyForwardRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__averageCopyForwardRateOffset_));
	}

	// double _averageMacroDefragmentationWork
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageMacroDefragmentationWorkOffset_", declaredType="double")
	public double _averageMacroDefragmentationWork() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__averageMacroDefragmentationWorkOffset_);
	}

	// double _averageMacroDefragmentationWork
	public DoublePointer _averageMacroDefragmentationWorkEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__averageMacroDefragmentationWorkOffset_));
	}

	// double _averageSurvivorSetRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageSurvivorSetRegionCountOffset_", declaredType="double")
	public double _averageSurvivorSetRegionCount() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__averageSurvivorSetRegionCountOffset_);
	}

	// double _averageSurvivorSetRegionCount
	public DoublePointer _averageSurvivorSetRegionCountEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__averageSurvivorSetRegionCountOffset_));
	}

	// double _bytesCompactedToFreeBytesRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesCompactedToFreeBytesRatioOffset_", declaredType="double")
	public double _bytesCompactedToFreeBytesRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__bytesCompactedToFreeBytesRatioOffset_);
	}

	// double _bytesCompactedToFreeBytesRatio
	public DoublePointer _bytesCompactedToFreeBytesRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__bytesCompactedToFreeBytesRatioOffset_));
	}

	// UDATA _currentMacroDefragmentationWork
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentMacroDefragmentationWorkOffset_", declaredType="UDATA")
	public UDATA _currentMacroDefragmentationWork() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__currentMacroDefragmentationWorkOffset_);
	}

	// UDATA _currentMacroDefragmentationWork
	public UDATAPointer _currentMacroDefragmentationWorkEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__currentMacroDefragmentationWorkOffset_));
	}

	// double _defragmentRegionConsumptionRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defragmentRegionConsumptionRateOffset_", declaredType="double")
	public double _defragmentRegionConsumptionRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__defragmentRegionConsumptionRateOffset_);
	}

	// double _defragmentRegionConsumptionRate
	public DoublePointer _defragmentRegionConsumptionRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__defragmentRegionConsumptionRateOffset_));
	}

	// bool _didGMPCompleteSinceLastReclaim
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__didGMPCompleteSinceLastReclaimOffset_", declaredType="bool")
	public boolean _didGMPCompleteSinceLastReclaim() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__didGMPCompleteSinceLastReclaimOffset_);
	}

	// bool _didGMPCompleteSinceLastReclaim
	public BoolPointer _didGMPCompleteSinceLastReclaimEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__didGMPCompleteSinceLastReclaimOffset_));
	}

	// bool _disableCopyForwardDuringCurrentGlobalMarkPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__disableCopyForwardDuringCurrentGlobalMarkPhaseOffset_", declaredType="bool")
	public boolean _disableCopyForwardDuringCurrentGlobalMarkPhase() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__disableCopyForwardDuringCurrentGlobalMarkPhaseOffset_);
	}

	// bool _disableCopyForwardDuringCurrentGlobalMarkPhase
	public BoolPointer _disableCopyForwardDuringCurrentGlobalMarkPhaseEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__disableCopyForwardDuringCurrentGlobalMarkPhaseOffset_));
	}

	// UDATA _dynamicGlobalMarkIncrementTimeMillis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicGlobalMarkIncrementTimeMillisOffset_", declaredType="UDATA")
	public UDATA _dynamicGlobalMarkIncrementTimeMillis() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__dynamicGlobalMarkIncrementTimeMillisOffset_);
	}

	// UDATA _dynamicGlobalMarkIncrementTimeMillis
	public UDATAPointer _dynamicGlobalMarkIncrementTimeMillisEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__dynamicGlobalMarkIncrementTimeMillisOffset_));
	}

	// UDATA _edenRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenRegionCountOffset_", declaredType="UDATA")
	public UDATA _edenRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__edenRegionCountOffset_);
	}

	// UDATA _edenRegionCount
	public UDATAPointer _edenRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__edenRegionCountOffset_));
	}

	// double _edenSurvivalRateCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenSurvivalRateCopyForwardOffset_", declaredType="double")
	public double _edenSurvivalRateCopyForward() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__edenSurvivalRateCopyForwardOffset_);
	}

	// double _edenSurvivalRateCopyForward
	public DoublePointer _edenSurvivalRateCopyForwardEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__edenSurvivalRateCopyForwardOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_SchedulingDelegate.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__extensionsOffset_));
	}

	// bool _globalSweepRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalSweepRequiredOffset_", declaredType="bool")
	public boolean _globalSweepRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__globalSweepRequiredOffset_);
	}

	// bool _globalSweepRequired
	public BoolPointer _globalSweepRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__globalSweepRequiredOffset_));
	}

	// double _heapOccupancyTrend
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOccupancyTrendOffset_", declaredType="double")
	public double _heapOccupancyTrend() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__heapOccupancyTrendOffset_);
	}

	// double _heapOccupancyTrend
	public DoublePointer _heapOccupancyTrendEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__heapOccupancyTrendOffset_));
	}

	// UDATA _historicBytesScannedConcurrentlyPerGMP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historicBytesScannedConcurrentlyPerGMPOffset_", declaredType="UDATA")
	public UDATA _historicBytesScannedConcurrentlyPerGMP() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__historicBytesScannedConcurrentlyPerGMPOffset_);
	}

	// UDATA _historicBytesScannedConcurrentlyPerGMP
	public UDATAPointer _historicBytesScannedConcurrentlyPerGMPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__historicBytesScannedConcurrentlyPerGMPOffset_));
	}

	// U64 _historicTotalIncrementalScanTimePerGMP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historicTotalIncrementalScanTimePerGMPOffset_", declaredType="U64")
	public UDATA _historicTotalIncrementalScanTimePerGMP() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SchedulingDelegate.__historicTotalIncrementalScanTimePerGMPOffset_));
	}

	// U64 _historicTotalIncrementalScanTimePerGMP
	public UDATAPointer _historicTotalIncrementalScanTimePerGMPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__historicTotalIncrementalScanTimePerGMPOffset_));
	}

	// U64 _historicalPartialGCTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historicalPartialGCTimeOffset_", declaredType="U64")
	public UDATA _historicalPartialGCTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SchedulingDelegate.__historicalPartialGCTimeOffset_));
	}

	// U64 _historicalPartialGCTime
	public UDATAPointer _historicalPartialGCTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__historicalPartialGCTimeOffset_));
	}

	// UDATA _idealEdenRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__idealEdenRegionCountOffset_", declaredType="UDATA")
	public UDATA _idealEdenRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__idealEdenRegionCountOffset_);
	}

	// UDATA _idealEdenRegionCount
	public UDATAPointer _idealEdenRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__idealEdenRegionCountOffset_));
	}

	// UDATA _liveSetBytesAfterGlobalSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveSetBytesAfterGlobalSweepOffset_", declaredType="UDATA")
	public UDATA _liveSetBytesAfterGlobalSweep() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__liveSetBytesAfterGlobalSweepOffset_);
	}

	// UDATA _liveSetBytesAfterGlobalSweep
	public UDATAPointer _liveSetBytesAfterGlobalSweepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__liveSetBytesAfterGlobalSweepOffset_));
	}

	// UDATA _liveSetBytesAfterPartialCollect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveSetBytesAfterPartialCollectOffset_", declaredType="UDATA")
	public UDATA _liveSetBytesAfterPartialCollect() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__liveSetBytesAfterPartialCollectOffset_);
	}

	// UDATA _liveSetBytesAfterPartialCollect
	public UDATAPointer _liveSetBytesAfterPartialCollectEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__liveSetBytesAfterPartialCollectOffset_));
	}

	// UDATA _liveSetBytesBeforeGlobalSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveSetBytesBeforeGlobalSweepOffset_", declaredType="UDATA")
	public UDATA _liveSetBytesBeforeGlobalSweep() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__liveSetBytesBeforeGlobalSweepOffset_);
	}

	// UDATA _liveSetBytesBeforeGlobalSweep
	public UDATAPointer _liveSetBytesBeforeGlobalSweepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__liveSetBytesBeforeGlobalSweepOffset_));
	}

	// UDATA _minimumEdenRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumEdenRegionCountOffset_", declaredType="UDATA")
	public UDATA _minimumEdenRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__minimumEdenRegionCountOffset_);
	}

	// UDATA _minimumEdenRegionCount
	public UDATAPointer _minimumEdenRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__minimumEdenRegionCountOffset_));
	}

	// bool _nextIncrementWillDoGlobalMarkPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextIncrementWillDoGlobalMarkPhaseOffset_", declaredType="bool")
	public boolean _nextIncrementWillDoGlobalMarkPhase() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__nextIncrementWillDoGlobalMarkPhaseOffset_);
	}

	// bool _nextIncrementWillDoGlobalMarkPhase
	public BoolPointer _nextIncrementWillDoGlobalMarkPhaseEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__nextIncrementWillDoGlobalMarkPhaseOffset_));
	}

	// bool _nextIncrementWillDoPartialGarbageCollection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextIncrementWillDoPartialGarbageCollectionOffset_", declaredType="bool")
	public boolean _nextIncrementWillDoPartialGarbageCollection() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__nextIncrementWillDoPartialGarbageCollectionOffset_);
	}

	// bool _nextIncrementWillDoPartialGarbageCollection
	public BoolPointer _nextIncrementWillDoPartialGarbageCollectionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__nextIncrementWillDoPartialGarbageCollectionOffset_));
	}

	// bool _nextPGCShouldCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextPGCShouldCopyForwardOffset_", declaredType="bool")
	public boolean _nextPGCShouldCopyForward() throws CorruptDataException {
		return getBoolAtOffset(MM_SchedulingDelegate.__nextPGCShouldCopyForwardOffset_);
	}

	// bool _nextPGCShouldCopyForward
	public BoolPointer _nextPGCShouldCopyForwardEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__nextPGCShouldCopyForwardOffset_));
	}

	// UDATA _nonEdenSurvivalCountCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEdenSurvivalCountCopyForwardOffset_", declaredType="UDATA")
	public UDATA _nonEdenSurvivalCountCopyForward() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__nonEdenSurvivalCountCopyForwardOffset_);
	}

	// UDATA _nonEdenSurvivalCountCopyForward
	public UDATAPointer _nonEdenSurvivalCountCopyForwardEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__nonEdenSurvivalCountCopyForwardOffset_));
	}

	// U64 _partialGcStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__partialGcStartTimeOffset_", declaredType="U64")
	public UDATA _partialGcStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SchedulingDelegate.__partialGcStartTimeOffset_));
	}

	// U64 _partialGcStartTime
	public UDATAPointer _partialGcStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__partialGcStartTimeOffset_));
	}

	// UDATA _previousDefragmentReclaimableRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousDefragmentReclaimableRegionsOffset_", declaredType="UDATA")
	public UDATA _previousDefragmentReclaimableRegions() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__previousDefragmentReclaimableRegionsOffset_);
	}

	// UDATA _previousDefragmentReclaimableRegions
	public UDATAPointer _previousDefragmentReclaimableRegionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__previousDefragmentReclaimableRegionsOffset_));
	}

	// UDATA _previousLiveSetBytesAfterGlobalSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousLiveSetBytesAfterGlobalSweepOffset_", declaredType="UDATA")
	public UDATA _previousLiveSetBytesAfterGlobalSweep() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__previousLiveSetBytesAfterGlobalSweepOffset_);
	}

	// UDATA _previousLiveSetBytesAfterGlobalSweep
	public UDATAPointer _previousLiveSetBytesAfterGlobalSweepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__previousLiveSetBytesAfterGlobalSweepOffset_));
	}

	// UDATA _previousReclaimableRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousReclaimableRegionsOffset_", declaredType="UDATA")
	public UDATA _previousReclaimableRegions() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__previousReclaimableRegionsOffset_);
	}

	// UDATA _previousReclaimableRegions
	public UDATAPointer _previousReclaimableRegionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__previousReclaimableRegionsOffset_));
	}

	// double _regionConsumptionRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionConsumptionRateOffset_", declaredType="double")
	public double _regionConsumptionRate() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__regionConsumptionRateOffset_);
	}

	// double _regionConsumptionRate
	public DoublePointer _regionConsumptionRateEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__regionConsumptionRateOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_SchedulingDelegate.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__regionManagerOffset_));
	}

	// UDATA _remainingGMPIntermissionIntervals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__remainingGMPIntermissionIntervalsOffset_", declaredType="UDATA")
	public UDATA _remainingGMPIntermissionIntervals() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__remainingGMPIntermissionIntervalsOffset_);
	}

	// UDATA _remainingGMPIntermissionIntervals
	public UDATAPointer _remainingGMPIntermissionIntervalsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__remainingGMPIntermissionIntervalsOffset_));
	}

	// MM_SchedulingDelegate$MM_SchedulingDelegate_ScanRateStats _scanRateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanRateStatsOffset_", declaredType="MM_SchedulingDelegate$MM_SchedulingDelegate_ScanRateStats")
	public MM_SchedulingDelegate$MM_SchedulingDelegate_ScanRateStatsPointer _scanRateStats() throws CorruptDataException {
		return MM_SchedulingDelegate$MM_SchedulingDelegate_ScanRateStatsPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__scanRateStatsOffset_));
	}

	// MM_SchedulingDelegate$MM_SchedulingDelegate_ScanRateStats _scanRateStats
	public PointerPointer _scanRateStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__scanRateStatsOffset_));
	}

	// double _scannableBytesRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannableBytesRatioOffset_", declaredType="double")
	public double _scannableBytesRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_SchedulingDelegate.__scannableBytesRatioOffset_);
	}

	// double _scannableBytesRatio
	public DoublePointer _scannableBytesRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__scannableBytesRatioOffset_));
	}

	// UDATA _taxationIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__taxationIndexOffset_", declaredType="UDATA")
	public UDATA _taxationIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_SchedulingDelegate.__taxationIndexOffset_);
	}

	// UDATA _taxationIndex
	public UDATAPointer _taxationIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SchedulingDelegate.__taxationIndexOffset_));
	}

}
