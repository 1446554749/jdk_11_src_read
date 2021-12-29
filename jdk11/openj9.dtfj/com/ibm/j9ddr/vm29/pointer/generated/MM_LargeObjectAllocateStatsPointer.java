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
 * Structure: MM_LargeObjectAllocateStatsPointer
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
 * The generated code will provide getters for all elements in the MM_LargeObjectAllocateStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_LargeObjectAllocateStats.class)
public class MM_LargeObjectAllocateStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_LargeObjectAllocateStatsPointer NULL = new MM_LargeObjectAllocateStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_LargeObjectAllocateStatsPointer(long address) {
		super(address);
	}

	public static MM_LargeObjectAllocateStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_LargeObjectAllocateStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_LargeObjectAllocateStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_LargeObjectAllocateStatsPointer(address);
	}

	public MM_LargeObjectAllocateStatsPointer add(long count) {
		return MM_LargeObjectAllocateStatsPointer.cast(address + (MM_LargeObjectAllocateStats.SIZEOF * count));
	}

	public MM_LargeObjectAllocateStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_LargeObjectAllocateStatsPointer addOffset(long offset) {
		return MM_LargeObjectAllocateStatsPointer.cast(address + offset);
	}

	public MM_LargeObjectAllocateStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_LargeObjectAllocateStatsPointer sub(long count) {
		return MM_LargeObjectAllocateStatsPointer.cast(address - (MM_LargeObjectAllocateStats.SIZEOF * count));
	}

	public MM_LargeObjectAllocateStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_LargeObjectAllocateStatsPointer subOffset(long offset) {
		return MM_LargeObjectAllocateStatsPointer.cast(address - offset);
	}

	public MM_LargeObjectAllocateStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_LargeObjectAllocateStatsPointer untag(long mask) {
		return MM_LargeObjectAllocateStatsPointer.cast(address & ~mask);
	}

	public MM_LargeObjectAllocateStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_LargeObjectAllocateStats.SIZEOF;
	}

	// Implementation methods

	// U64 _TLHFrequentAllocationSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__TLHFrequentAllocationSizeOffset_", declaredType="U64")
	public UDATA _TLHFrequentAllocationSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__TLHFrequentAllocationSizeOffset_));
	}

	// U64 _TLHFrequentAllocationSize
	public UDATAPointer _TLHFrequentAllocationSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__TLHFrequentAllocationSizeOffset_));
	}

	// U64 _TLHSizeClassIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__TLHSizeClassIndexOffset_", declaredType="U64")
	public UDATA _TLHSizeClassIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__TLHSizeClassIndexOffset_));
	}

	// U64 _TLHSizeClassIndex
	public UDATAPointer _TLHSizeClassIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__TLHSizeClassIndexOffset_));
	}

	// U64 _averageBytesAllocated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageBytesAllocatedOffset_", declaredType="U64")
	public UDATA _averageBytesAllocated() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__averageBytesAllocatedOffset_));
	}

	// U64 _averageBytesAllocated
	public UDATAPointer _averageBytesAllocatedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__averageBytesAllocatedOffset_));
	}

	// U64 _cpuTimeEstimateFragmentation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpuTimeEstimateFragmentationOffset_", declaredType="U64")
	public UDATA _cpuTimeEstimateFragmentation() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__cpuTimeEstimateFragmentationOffset_));
	}

	// U64 _cpuTimeEstimateFragmentation
	public UDATAPointer _cpuTimeEstimateFragmentationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__cpuTimeEstimateFragmentationOffset_));
	}

	// MM_EnvironmentBase* _env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__envOffset_", declaredType="MM_EnvironmentBase*")
	public MM_EnvironmentBasePointer _env() throws CorruptDataException {
		return MM_EnvironmentBasePointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__envOffset_));
	}

	// MM_EnvironmentBase* _env
	public PointerPointer _envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__envOffset_));
	}

	// MM_FreeEntrySizeClassStats _freeEntrySizeClassStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeEntrySizeClassStatsOffset_", declaredType="MM_FreeEntrySizeClassStats")
	public MM_FreeEntrySizeClassStatsPointer _freeEntrySizeClassStats() throws CorruptDataException {
		return MM_FreeEntrySizeClassStatsPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__freeEntrySizeClassStatsOffset_));
	}

	// MM_FreeEntrySizeClassStats _freeEntrySizeClassStats
	public PointerPointer _freeEntrySizeClassStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__freeEntrySizeClassStatsOffset_));
	}

	// U64 _freeMemoryBeforeEstimate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemoryBeforeEstimateOffset_", declaredType="U64")
	public UDATA _freeMemoryBeforeEstimate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__freeMemoryBeforeEstimateOffset_));
	}

	// U64 _freeMemoryBeforeEstimate
	public UDATAPointer _freeMemoryBeforeEstimateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__freeMemoryBeforeEstimateOffset_));
	}

	// U64 _largeObjectThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectThresholdOffset_", declaredType="U64")
	public UDATA _largeObjectThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__largeObjectThresholdOffset_));
	}

	// U64 _largeObjectThreshold
	public UDATAPointer _largeObjectThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__largeObjectThresholdOffset_));
	}

	// U16 _maxAllocateSizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxAllocateSizesOffset_", declaredType="U16")
	public U16 _maxAllocateSizes() throws CorruptDataException {
		return new U16(getShortAtOffset(MM_LargeObjectAllocateStats.__maxAllocateSizesOffset_));
	}

	// U16 _maxAllocateSizes
	public U16Pointer _maxAllocateSizesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__maxAllocateSizesOffset_));
	}

	// U64 _maxHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxHeapSizeOffset_", declaredType="U64")
	public UDATA _maxHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__maxHeapSizeOffset_));
	}

	// U64 _maxHeapSize
	public UDATAPointer _maxHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__maxHeapSizeOffset_));
	}

	// U64 _remainingFreeMemoryAfterEstimate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__remainingFreeMemoryAfterEstimateOffset_", declaredType="U64")
	public UDATA _remainingFreeMemoryAfterEstimate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__remainingFreeMemoryAfterEstimateOffset_));
	}

	// U64 _remainingFreeMemoryAfterEstimate
	public UDATAPointer _remainingFreeMemoryAfterEstimateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__remainingFreeMemoryAfterEstimateOffset_));
	}

	// float _sizeClassRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassRatioOffset_", declaredType="float")
	public float _sizeClassRatio() throws CorruptDataException {
		return getFloatAtOffset(MM_LargeObjectAllocateStats.__sizeClassRatioOffset_);
	}

	// float _sizeClassRatio
	public FloatPointer _sizeClassRatioEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__sizeClassRatioOffset_));
	}

	// float _sizeClassRatioLog
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassRatioLogOffset_", declaredType="float")
	public float _sizeClassRatioLog() throws CorruptDataException {
		return getFloatAtOffset(MM_LargeObjectAllocateStats.__sizeClassRatioLogOffset_);
	}

	// float _sizeClassRatioLog
	public FloatPointer _sizeClassRatioLogEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__sizeClassRatioLogOffset_));
	}

	// U64* _sizeClassSizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassSizesOffset_", declaredType="U64*")
	public UDATAPointer _sizeClassSizes() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__sizeClassSizesOffset_));
	}

	// U64* _sizeClassSizes
	public PointerPointer _sizeClassSizesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__sizeClassSizesOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceSavingSizeClassesOffset_", declaredType="OMRSpaceSaving*")
	public OMRSpaceSavingPointer _spaceSavingSizeClasses() throws CorruptDataException {
		return OMRSpaceSavingPointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__spaceSavingSizeClassesOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizeClasses
	public PointerPointer _spaceSavingSizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__spaceSavingSizeClassesOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizeClassesAveragePercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceSavingSizeClassesAveragePercentOffset_", declaredType="OMRSpaceSaving*")
	public OMRSpaceSavingPointer _spaceSavingSizeClassesAveragePercent() throws CorruptDataException {
		return OMRSpaceSavingPointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__spaceSavingSizeClassesAveragePercentOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizeClassesAveragePercent
	public PointerPointer _spaceSavingSizeClassesAveragePercentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__spaceSavingSizeClassesAveragePercentOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceSavingSizesOffset_", declaredType="OMRSpaceSaving*")
	public OMRSpaceSavingPointer _spaceSavingSizes() throws CorruptDataException {
		return OMRSpaceSavingPointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__spaceSavingSizesOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizes
	public PointerPointer _spaceSavingSizesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__spaceSavingSizesOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizesAveragePercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceSavingSizesAveragePercentOffset_", declaredType="OMRSpaceSaving*")
	public OMRSpaceSavingPointer _spaceSavingSizesAveragePercent() throws CorruptDataException {
		return OMRSpaceSavingPointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__spaceSavingSizesAveragePercentOffset_));
	}

	// OMRSpaceSaving* _spaceSavingSizesAveragePercent
	public PointerPointer _spaceSavingSizesAveragePercentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__spaceSavingSizesAveragePercentOffset_));
	}

	// OMRSpaceSaving* _spaceSavingTemp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceSavingTempOffset_", declaredType="OMRSpaceSaving*")
	public OMRSpaceSavingPointer _spaceSavingTemp() throws CorruptDataException {
		return OMRSpaceSavingPointer.cast(getPointerAtOffset(MM_LargeObjectAllocateStats.__spaceSavingTempOffset_));
	}

	// OMRSpaceSaving* _spaceSavingTemp
	public PointerPointer _spaceSavingTempEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__spaceSavingTempOffset_));
	}

	// U64 _timeEstimateFragmentation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeEstimateFragmentationOffset_", declaredType="U64")
	public UDATA _timeEstimateFragmentation() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__timeEstimateFragmentationOffset_));
	}

	// U64 _timeEstimateFragmentation
	public UDATAPointer _timeEstimateFragmentationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__timeEstimateFragmentationOffset_));
	}

	// U64 _timeMergeAverage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeMergeAverageOffset_", declaredType="U64")
	public UDATA _timeMergeAverage() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__timeMergeAverageOffset_));
	}

	// U64 _timeMergeAverage
	public UDATAPointer _timeMergeAverageEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__timeMergeAverageOffset_));
	}

	// MM_FreeEntrySizeClassStats _tlhAllocSizeClassStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhAllocSizeClassStatsOffset_", declaredType="MM_FreeEntrySizeClassStats")
	public MM_FreeEntrySizeClassStatsPointer _tlhAllocSizeClassStats() throws CorruptDataException {
		return MM_FreeEntrySizeClassStatsPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__tlhAllocSizeClassStatsOffset_));
	}

	// MM_FreeEntrySizeClassStats _tlhAllocSizeClassStats
	public PointerPointer _tlhAllocSizeClassStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__tlhAllocSizeClassStatsOffset_));
	}

	// U64 _tlhMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhMaximumSizeOffset_", declaredType="U64")
	public UDATA _tlhMaximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__tlhMaximumSizeOffset_));
	}

	// U64 _tlhMaximumSize
	public UDATAPointer _tlhMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__tlhMaximumSizeOffset_));
	}

	// U64 _tlhMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhMinimumSizeOffset_", declaredType="U64")
	public UDATA _tlhMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__tlhMinimumSizeOffset_));
	}

	// U64 _tlhMinimumSize
	public UDATAPointer _tlhMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__tlhMinimumSizeOffset_));
	}

	// U64 _veryLargeEntrySizeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__veryLargeEntrySizeClassOffset_", declaredType="U64")
	public UDATA _veryLargeEntrySizeClass() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LargeObjectAllocateStats.__veryLargeEntrySizeClassOffset_));
	}

	// U64 _veryLargeEntrySizeClass
	public UDATAPointer _veryLargeEntrySizeClassEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LargeObjectAllocateStats.__veryLargeEntrySizeClassOffset_));
	}

}
