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
 * Structure: MM_MemorySubSpaceSemiSpacePointer
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
 * The generated code will provide getters for all elements in the MM_MemorySubSpaceSemiSpacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemorySubSpaceSemiSpace.class)
public class MM_MemorySubSpaceSemiSpacePointer extends MM_MemorySubSpacePointer {

	// NULL
	public static final MM_MemorySubSpaceSemiSpacePointer NULL = new MM_MemorySubSpaceSemiSpacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemorySubSpaceSemiSpacePointer(long address) {
		super(address);
	}

	public static MM_MemorySubSpaceSemiSpacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemorySubSpaceSemiSpacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemorySubSpaceSemiSpacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemorySubSpaceSemiSpacePointer(address);
	}

	public MM_MemorySubSpaceSemiSpacePointer add(long count) {
		return MM_MemorySubSpaceSemiSpacePointer.cast(address + (MM_MemorySubSpaceSemiSpace.SIZEOF * count));
	}

	public MM_MemorySubSpaceSemiSpacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemorySubSpaceSemiSpacePointer addOffset(long offset) {
		return MM_MemorySubSpaceSemiSpacePointer.cast(address + offset);
	}

	public MM_MemorySubSpaceSemiSpacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemorySubSpaceSemiSpacePointer sub(long count) {
		return MM_MemorySubSpaceSemiSpacePointer.cast(address - (MM_MemorySubSpaceSemiSpace.SIZEOF * count));
	}

	public MM_MemorySubSpaceSemiSpacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemorySubSpaceSemiSpacePointer subOffset(long offset) {
		return MM_MemorySubSpaceSemiSpacePointer.cast(address - offset);
	}

	public MM_MemorySubSpaceSemiSpacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemorySubSpaceSemiSpacePointer untag(long mask) {
		return MM_MemorySubSpaceSemiSpacePointer.cast(address & ~mask);
	}

	public MM_MemorySubSpaceSemiSpacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemorySubSpaceSemiSpace.SIZEOF;
	}

	// Implementation methods

	// void* _allocateSpaceBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocateSpaceBaseOffset_", declaredType="void*")
	public VoidPointer _allocateSpaceBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__allocateSpaceBaseOffset_));
	}

	// void* _allocateSpaceBase
	public PointerPointer _allocateSpaceBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__allocateSpaceBaseOffset_));
	}

	// void* _allocateSpaceTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocateSpaceTopOffset_", declaredType="void*")
	public VoidPointer _allocateSpaceTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__allocateSpaceTopOffset_));
	}

	// void* _allocateSpaceTop
	public PointerPointer _allocateSpaceTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__allocateSpaceTopOffset_));
	}

	// double _averageScavengeTimeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__averageScavengeTimeRatioOffset_", declaredType="double")
	public double _averageScavengeTimeRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_MemorySubSpaceSemiSpace.__averageScavengeTimeRatioOffset_);
	}

	// double _averageScavengeTimeRatio
	public DoublePointer _averageScavengeTimeRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__averageScavengeTimeRatioOffset_));
	}

	// U64 _avgBytesAllocatedDuringConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgBytesAllocatedDuringConcurrentOffset_", declaredType="U64")
	public UDATA _avgBytesAllocatedDuringConcurrent() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__avgBytesAllocatedDuringConcurrentOffset_));
	}

	// U64 _avgBytesAllocatedDuringConcurrent
	public UDATAPointer _avgBytesAllocatedDuringConcurrentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__avgBytesAllocatedDuringConcurrentOffset_));
	}

	// float _avgDeviationBytesAllocatedDuringConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgDeviationBytesAllocatedDuringConcurrentOffset_", declaredType="float")
	public float _avgDeviationBytesAllocatedDuringConcurrent() throws CorruptDataException {
		return getFloatAtOffset(MM_MemorySubSpaceSemiSpace.__avgDeviationBytesAllocatedDuringConcurrentOffset_);
	}

	// float _avgDeviationBytesAllocatedDuringConcurrent
	public FloatPointer _avgDeviationBytesAllocatedDuringConcurrentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__avgDeviationBytesAllocatedDuringConcurrentOffset_));
	}

	// U64 _bytesAllocatedDuringConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesAllocatedDuringConcurrentOffset_", declaredType="U64")
	public UDATA _bytesAllocatedDuringConcurrent() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__bytesAllocatedDuringConcurrentOffset_));
	}

	// U64 _bytesAllocatedDuringConcurrent
	public UDATAPointer _bytesAllocatedDuringConcurrentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__bytesAllocatedDuringConcurrentOffset_));
	}

	// double _desiredSurvivorSpaceRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__desiredSurvivorSpaceRatioOffset_", declaredType="double")
	public double _desiredSurvivorSpaceRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_MemorySubSpaceSemiSpace.__desiredSurvivorSpaceRatioOffset_);
	}

	// double _desiredSurvivorSpaceRatio
	public DoublePointer _desiredSurvivorSpaceRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__desiredSurvivorSpaceRatioOffset_));
	}

	// float _deviationBytesAllocatedDuringConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deviationBytesAllocatedDuringConcurrentOffset_", declaredType="float")
	public float _deviationBytesAllocatedDuringConcurrent() throws CorruptDataException {
		return getFloatAtOffset(MM_MemorySubSpaceSemiSpace.__deviationBytesAllocatedDuringConcurrentOffset_);
	}

	// float _deviationBytesAllocatedDuringConcurrent
	public FloatPointer _deviationBytesAllocatedDuringConcurrentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__deviationBytesAllocatedDuringConcurrentOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectAllocateStatsOffset_", declaredType="MM_LargeObjectAllocateStats*")
	public MM_LargeObjectAllocateStatsPointer _largeObjectAllocateStats() throws CorruptDataException {
		return MM_LargeObjectAllocateStatsPointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__largeObjectAllocateStatsOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStats
	public PointerPointer _largeObjectAllocateStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__largeObjectAllocateStatsOffset_));
	}

	// U64 _lastScavengeEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastScavengeEndTimeOffset_", declaredType="U64")
	public UDATA _lastScavengeEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__lastScavengeEndTimeOffset_));
	}

	// U64 _lastScavengeEndTime
	public UDATAPointer _lastScavengeEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__lastScavengeEndTimeOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceAllocateOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceAllocate() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__memorySubSpaceAllocateOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceAllocate
	public PointerPointer _memorySubSpaceAllocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__memorySubSpaceAllocateOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceEvacuate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceEvacuateOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceEvacuate() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__memorySubSpaceEvacuateOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceEvacuate
	public PointerPointer _memorySubSpaceEvacuateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__memorySubSpaceEvacuateOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceSurvivor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceSurvivorOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceSurvivor() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__memorySubSpaceSurvivorOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceSurvivor
	public PointerPointer _memorySubSpaceSurvivorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__memorySubSpaceSurvivorOffset_));
	}

	// U64 _previousBytesFlipped
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousBytesFlippedOffset_", declaredType="U64")
	public UDATA _previousBytesFlipped() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__previousBytesFlippedOffset_));
	}

	// U64 _previousBytesFlipped
	public UDATAPointer _previousBytesFlippedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__previousBytesFlippedOffset_));
	}

	// void* _survivorSpaceBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorSpaceBaseOffset_", declaredType="void*")
	public VoidPointer _survivorSpaceBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__survivorSpaceBaseOffset_));
	}

	// void* _survivorSpaceBase
	public PointerPointer _survivorSpaceBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__survivorSpaceBaseOffset_));
	}

	// U64 _survivorSpaceSizeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorSpaceSizeRatioOffset_", declaredType="U64")
	public UDATA _survivorSpaceSizeRatio() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__survivorSpaceSizeRatioOffset_));
	}

	// U64 _survivorSpaceSizeRatio
	public UDATAPointer _survivorSpaceSizeRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__survivorSpaceSizeRatioOffset_));
	}

	// void* _survivorSpaceTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorSpaceTopOffset_", declaredType="void*")
	public VoidPointer _survivorSpaceTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemorySubSpaceSemiSpace.__survivorSpaceTopOffset_));
	}

	// void* _survivorSpaceTop
	public PointerPointer _survivorSpaceTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__survivorSpaceTopOffset_));
	}

	// U64 _tiltedAverageBytesFlipped
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tiltedAverageBytesFlippedOffset_", declaredType="U64")
	public UDATA _tiltedAverageBytesFlipped() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__tiltedAverageBytesFlippedOffset_));
	}

	// U64 _tiltedAverageBytesFlipped
	public UDATAPointer _tiltedAverageBytesFlippedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__tiltedAverageBytesFlippedOffset_));
	}

	// U64 _tiltedAverageBytesFlippedDelta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tiltedAverageBytesFlippedDeltaOffset_", declaredType="U64")
	public UDATA _tiltedAverageBytesFlippedDelta() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceSemiSpace.__tiltedAverageBytesFlippedDeltaOffset_));
	}

	// U64 _tiltedAverageBytesFlippedDelta
	public UDATAPointer _tiltedAverageBytesFlippedDeltaEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceSemiSpace.__tiltedAverageBytesFlippedDeltaOffset_));
	}

}
