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
 * Structure: MM_RegionPoolSegregatedPointer
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
 * The generated code will provide getters for all elements in the MM_RegionPoolSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RegionPoolSegregated.class)
public class MM_RegionPoolSegregatedPointer extends MM_RegionPoolPointer {

	// NULL
	public static final MM_RegionPoolSegregatedPointer NULL = new MM_RegionPoolSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RegionPoolSegregatedPointer(long address) {
		super(address);
	}

	public static MM_RegionPoolSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RegionPoolSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RegionPoolSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RegionPoolSegregatedPointer(address);
	}

	public MM_RegionPoolSegregatedPointer add(long count) {
		return MM_RegionPoolSegregatedPointer.cast(address + (MM_RegionPoolSegregated.SIZEOF * count));
	}

	public MM_RegionPoolSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RegionPoolSegregatedPointer addOffset(long offset) {
		return MM_RegionPoolSegregatedPointer.cast(address + offset);
	}

	public MM_RegionPoolSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RegionPoolSegregatedPointer sub(long count) {
		return MM_RegionPoolSegregatedPointer.cast(address - (MM_RegionPoolSegregated.SIZEOF * count));
	}

	public MM_RegionPoolSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RegionPoolSegregatedPointer subOffset(long offset) {
		return MM_RegionPoolSegregatedPointer.cast(address - offset);
	}

	public MM_RegionPoolSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RegionPoolSegregatedPointer untag(long mask) {
		return MM_RegionPoolSegregatedPointer.cast(address & ~mask);
	}

	public MM_RegionPoolSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RegionPoolSegregated.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionQueue* _arrayletAvailableRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletAvailableRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _arrayletAvailableRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__arrayletAvailableRegionsOffset_));
	}

	// MM_HeapRegionQueue* _arrayletAvailableRegions
	public PointerPointer _arrayletAvailableRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__arrayletAvailableRegionsOffset_));
	}

	// MM_HeapRegionQueue* _arrayletFullRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletFullRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _arrayletFullRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__arrayletFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _arrayletFullRegions
	public PointerPointer _arrayletFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__arrayletFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _arrayletSweepRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletSweepRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _arrayletSweepRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__arrayletSweepRegionsOffset_));
	}

	// MM_HeapRegionQueue* _arrayletSweepRegions
	public PointerPointer _arrayletSweepRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__arrayletSweepRegionsOffset_));
	}

	// MM_FreeHeapRegionList* _coalesceFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__coalesceFreeListOffset_", declaredType="MM_FreeHeapRegionList*")
	public MM_FreeHeapRegionListPointer _coalesceFreeList() throws CorruptDataException {
		return MM_FreeHeapRegionListPointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__coalesceFreeListOffset_));
	}

	// MM_FreeHeapRegionList* _coalesceFreeList
	public PointerPointer _coalesceFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__coalesceFreeListOffset_));
	}

	// volatile U64[] _currentCountOfSweepRegions
	public UDATAPointer _currentCountOfSweepRegionsEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__currentCountOfSweepRegionsOffset_));
	}

	// volatile U64 _currentTotalCountOfSweepRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentTotalCountOfSweepRegionsOffset_", declaredType="volatile U64")
	public UDATA _currentTotalCountOfSweepRegions() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RegionPoolSegregated.__currentTotalCountOfSweepRegionsOffset_));
	}

	// volatile U64 _currentTotalCountOfSweepRegions
	public UDATAPointer _currentTotalCountOfSweepRegionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__currentTotalCountOfSweepRegionsOffset_));
	}

	// volatile U64[] _darkMatterCellCount
	public UDATAPointer _darkMatterCellCountEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__darkMatterCellCountOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__heapRegionManagerOffset_));
	}

	// U64[] _initialCountOfSweepRegions
	public UDATAPointer _initialCountOfSweepRegionsEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__initialCountOfSweepRegionsOffset_));
	}

	// U64 _initialTotalCountOfSweepRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initialTotalCountOfSweepRegionsOffset_", declaredType="U64")
	public UDATA _initialTotalCountOfSweepRegions() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RegionPoolSegregated.__initialTotalCountOfSweepRegionsOffset_));
	}

	// U64 _initialTotalCountOfSweepRegions
	public UDATAPointer _initialTotalCountOfSweepRegionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__initialTotalCountOfSweepRegionsOffset_));
	}

	// bool _isSweepingSmall
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSweepingSmallOffset_", declaredType="bool")
	public boolean _isSweepingSmall() throws CorruptDataException {
		return getBoolAtOffset(MM_RegionPoolSegregated.__isSweepingSmallOffset_);
	}

	// bool _isSweepingSmall
	public BoolPointer _isSweepingSmallEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__isSweepingSmallOffset_));
	}

	// MM_HeapRegionQueue* _largeFullRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeFullRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _largeFullRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__largeFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _largeFullRegions
	public PointerPointer _largeFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__largeFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _largeSweepRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeSweepRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _largeSweepRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__largeSweepRegionsOffset_));
	}

	// MM_HeapRegionQueue* _largeSweepRegions
	public PointerPointer _largeSweepRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__largeSweepRegionsOffset_));
	}

	// MM_FreeHeapRegionList* _multiFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__multiFreeListOffset_", declaredType="MM_FreeHeapRegionList*")
	public MM_FreeHeapRegionListPointer _multiFreeList() throws CorruptDataException {
		return MM_FreeHeapRegionListPointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__multiFreeListOffset_));
	}

	// MM_FreeHeapRegionList* _multiFreeList
	public PointerPointer _multiFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__multiFreeListOffset_));
	}

	// volatile U64 _regionsInUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsInUseOffset_", declaredType="volatile U64")
	public UDATA _regionsInUse() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RegionPoolSegregated.__regionsInUseOffset_));
	}

	// volatile U64 _regionsInUse
	public UDATAPointer _regionsInUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__regionsInUseOffset_));
	}

	// MM_FreeHeapRegionList* _singleFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__singleFreeListOffset_", declaredType="MM_FreeHeapRegionList*")
	public MM_FreeHeapRegionListPointer _singleFreeList() throws CorruptDataException {
		return MM_FreeHeapRegionListPointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__singleFreeListOffset_));
	}

	// MM_FreeHeapRegionList* _singleFreeList
	public PointerPointer _singleFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__singleFreeListOffset_));
	}

	// U8[] _skipAvailableRegionForAllocation
	public U8Pointer _skipAvailableRegionForAllocationEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__skipAvailableRegionForAllocationOffset_));
	}

	// MM_LockingHeapRegionQueue*[][] _smallAvailableRegions
	public PointerPointer _smallAvailableRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__smallAvailableRegionsOffset_));
	}

	// MM_HeapRegionQueue*[] _smallFullRegions
	public PointerPointer _smallFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__smallFullRegionsOffset_));
	}

	// float[] _smallOccupancy
	public FloatPointer _smallOccupancyEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__smallOccupancyOffset_));
	}

	// MM_HeapRegionQueue*[] _smallSweepRegions
	public PointerPointer _smallSweepRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__smallSweepRegionsOffset_));
	}

	// U64 _splitAvailableListSplitCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__splitAvailableListSplitCountOffset_", declaredType="U64")
	public UDATA _splitAvailableListSplitCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RegionPoolSegregated.__splitAvailableListSplitCountOffset_));
	}

	// U64 _splitAvailableListSplitCount
	public UDATAPointer _splitAvailableListSplitCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__splitAvailableListSplitCountOffset_));
	}

	// MM_SweepSchemeSegregated* _sweepScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepSchemeOffset_", declaredType="MM_SweepSchemeSegregated*")
	public MM_SweepSchemeSegregatedPointer _sweepScheme() throws CorruptDataException {
		return MM_SweepSchemeSegregatedPointer.cast(getPointerAtOffset(MM_RegionPoolSegregated.__sweepSchemeOffset_));
	}

	// MM_SweepSchemeSegregated* _sweepScheme
	public PointerPointer _sweepSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionPoolSegregated.__sweepSchemeOffset_));
	}

}
