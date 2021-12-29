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
 * Structure: MM_FreeEntrySizeClassStatsPointer
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
 * The generated code will provide getters for all elements in the MM_FreeEntrySizeClassStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_FreeEntrySizeClassStats.class)
public class MM_FreeEntrySizeClassStatsPointer extends StructurePointer {

	// NULL
	public static final MM_FreeEntrySizeClassStatsPointer NULL = new MM_FreeEntrySizeClassStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_FreeEntrySizeClassStatsPointer(long address) {
		super(address);
	}

	public static MM_FreeEntrySizeClassStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_FreeEntrySizeClassStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_FreeEntrySizeClassStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_FreeEntrySizeClassStatsPointer(address);
	}

	public MM_FreeEntrySizeClassStatsPointer add(long count) {
		return MM_FreeEntrySizeClassStatsPointer.cast(address + (MM_FreeEntrySizeClassStats.SIZEOF * count));
	}

	public MM_FreeEntrySizeClassStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_FreeEntrySizeClassStatsPointer addOffset(long offset) {
		return MM_FreeEntrySizeClassStatsPointer.cast(address + offset);
	}

	public MM_FreeEntrySizeClassStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_FreeEntrySizeClassStatsPointer sub(long count) {
		return MM_FreeEntrySizeClassStatsPointer.cast(address - (MM_FreeEntrySizeClassStats.SIZEOF * count));
	}

	public MM_FreeEntrySizeClassStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_FreeEntrySizeClassStatsPointer subOffset(long offset) {
		return MM_FreeEntrySizeClassStatsPointer.cast(address - offset);
	}

	public MM_FreeEntrySizeClassStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_FreeEntrySizeClassStatsPointer untag(long mask) {
		return MM_FreeEntrySizeClassStatsPointer.cast(address & ~mask);
	}

	public MM_FreeEntrySizeClassStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_FreeEntrySizeClassStats.SIZEOF;
	}

	// Implementation methods

	// U64* _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="U64*")
	public UDATAPointer _count() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__countOffset_));
	}

	// U64* _count
	public PointerPointer _countEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__countOffset_));
	}

	// float* _fractionFrequentAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fractionFrequentAllocationOffset_", declaredType="float*")
	public FloatPointer _fractionFrequentAllocation() throws CorruptDataException {
		return FloatPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__fractionFrequentAllocationOffset_));
	}

	// float* _fractionFrequentAllocation
	public PointerPointer _fractionFrequentAllocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__fractionFrequentAllocationOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _freeHeadVeryLargeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeHeadVeryLargeEntryOffset_", declaredType="MM_FreeEntrySizeClassStats$FrequentAllocation*")
	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer _freeHeadVeryLargeEntry() throws CorruptDataException {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__freeHeadVeryLargeEntryOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _freeHeadVeryLargeEntry
	public PointerPointer _freeHeadVeryLargeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__freeHeadVeryLargeEntryOffset_));
	}

	// U64 _frequentAllocateSizeCounters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__frequentAllocateSizeCountersOffset_", declaredType="U64")
	public UDATA _frequentAllocateSizeCounters() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats.__frequentAllocateSizeCountersOffset_));
	}

	// U64 _frequentAllocateSizeCounters
	public UDATAPointer _frequentAllocateSizeCountersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__frequentAllocateSizeCountersOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _frequentAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__frequentAllocationOffset_", declaredType="MM_FreeEntrySizeClassStats$FrequentAllocation*")
	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer _frequentAllocation() throws CorruptDataException {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__frequentAllocationOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _frequentAllocation
	public PointerPointer _frequentAllocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__frequentAllocationOffset_));
	}

	// void** _frequentAllocationHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__frequentAllocationHeadOffset_", declaredType="void**")
	public PointerPointer _frequentAllocationHead() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__frequentAllocationHeadOffset_));
	}

	// void** _frequentAllocationHead
	public PointerPointer _frequentAllocationHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__frequentAllocationHeadOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__lockOffset_));
	}

	// U64 _maxFrequentAllocateSizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxFrequentAllocateSizesOffset_", declaredType="U64")
	public UDATA _maxFrequentAllocateSizes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats.__maxFrequentAllocateSizesOffset_));
	}

	// U64 _maxFrequentAllocateSizes
	public UDATAPointer _maxFrequentAllocateSizesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__maxFrequentAllocateSizesOffset_));
	}

	// U64 _maxSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxSizeClassesOffset_", declaredType="U64")
	public UDATA _maxSizeClasses() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats.__maxSizeClassesOffset_));
	}

	// U64 _maxSizeClasses
	public UDATAPointer _maxSizeClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__maxSizeClassesOffset_));
	}

	// U64 _maxVeryLargeEntrySizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxVeryLargeEntrySizesOffset_", declaredType="U64")
	public UDATA _maxVeryLargeEntrySizes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats.__maxVeryLargeEntrySizesOffset_));
	}

	// U64 _maxVeryLargeEntrySizes
	public UDATAPointer _maxVeryLargeEntrySizesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__maxVeryLargeEntrySizesOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _veryLargeEntryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__veryLargeEntryPoolOffset_", declaredType="MM_FreeEntrySizeClassStats$FrequentAllocation*")
	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer _veryLargeEntryPool() throws CorruptDataException {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats.__veryLargeEntryPoolOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _veryLargeEntryPool
	public PointerPointer _veryLargeEntryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__veryLargeEntryPoolOffset_));
	}

	// U64 _veryLargeEntrySizeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__veryLargeEntrySizeClassOffset_", declaredType="U64")
	public UDATA _veryLargeEntrySizeClass() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats.__veryLargeEntrySizeClassOffset_));
	}

	// U64 _veryLargeEntrySizeClass
	public UDATAPointer _veryLargeEntrySizeClassEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats.__veryLargeEntrySizeClassOffset_));
	}

	// bool guarantyEnoughPoolSizeForVeryLargeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_guarantyEnoughPoolSizeForVeryLargeEntryOffset_", declaredType="bool")
	public boolean guarantyEnoughPoolSizeForVeryLargeEntry() throws CorruptDataException {
		return getBoolAtOffset(MM_FreeEntrySizeClassStats._guarantyEnoughPoolSizeForVeryLargeEntryOffset_);
	}

	// bool guarantyEnoughPoolSizeForVeryLargeEntry
	public BoolPointer guarantyEnoughPoolSizeForVeryLargeEntryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats._guarantyEnoughPoolSizeForVeryLargeEntryOffset_));
	}

}
