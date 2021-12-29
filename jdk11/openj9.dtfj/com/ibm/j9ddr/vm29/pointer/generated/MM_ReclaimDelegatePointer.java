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
 * Structure: MM_ReclaimDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_ReclaimDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ReclaimDelegate.class)
public class MM_ReclaimDelegatePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_ReclaimDelegatePointer NULL = new MM_ReclaimDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ReclaimDelegatePointer(long address) {
		super(address);
	}

	public static MM_ReclaimDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ReclaimDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ReclaimDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ReclaimDelegatePointer(address);
	}

	public MM_ReclaimDelegatePointer add(long count) {
		return MM_ReclaimDelegatePointer.cast(address + (MM_ReclaimDelegate.SIZEOF * count));
	}

	public MM_ReclaimDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ReclaimDelegatePointer addOffset(long offset) {
		return MM_ReclaimDelegatePointer.cast(address + offset);
	}

	public MM_ReclaimDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ReclaimDelegatePointer sub(long count) {
		return MM_ReclaimDelegatePointer.cast(address - (MM_ReclaimDelegate.SIZEOF * count));
	}

	public MM_ReclaimDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ReclaimDelegatePointer subOffset(long offset) {
		return MM_ReclaimDelegatePointer.cast(address - offset);
	}

	public MM_ReclaimDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ReclaimDelegatePointer untag(long mask) {
		return MM_ReclaimDelegatePointer.cast(address & ~mask);
	}

	public MM_ReclaimDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ReclaimDelegate.SIZEOF;
	}

	// Implementation methods

	// MM_CollectionSetDelegate* _collectionSetDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionSetDelegateOffset_", declaredType="MM_CollectionSetDelegate*")
	public MM_CollectionSetDelegatePointer _collectionSetDelegate() throws CorruptDataException {
		return MM_CollectionSetDelegatePointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__collectionSetDelegateOffset_));
	}

	// MM_CollectionSetDelegate* _collectionSetDelegate
	public PointerPointer _collectionSetDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__collectionSetDelegateOffset_));
	}

	// const UDATA _compactGroupMaxCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupMaxCountOffset_", declaredType="const UDATA")
	public UDATA _compactGroupMaxCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ReclaimDelegate.__compactGroupMaxCountOffset_);
	}

	// const UDATA _compactGroupMaxCount
	public UDATAPointer _compactGroupMaxCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__compactGroupMaxCountOffset_));
	}

	// MM_ReclaimDelegate_ScoreBaseCompactTable* _compactGroups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupsOffset_", declaredType="MM_ReclaimDelegate_ScoreBaseCompactTable*")
	public MM_ReclaimDelegate$MM_ReclaimDelegate_ScoreBaseCompactTablePointer _compactGroups() throws CorruptDataException {
		return MM_ReclaimDelegate$MM_ReclaimDelegate_ScoreBaseCompactTablePointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__compactGroupsOffset_));
	}

	// MM_ReclaimDelegate_ScoreBaseCompactTable* _compactGroups
	public PointerPointer _compactGroupsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__compactGroupsOffset_));
	}

	// double _compactRateOfReturn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactRateOfReturnOffset_", declaredType="double")
	public double _compactRateOfReturn() throws CorruptDataException {
		return getDoubleAtOffset(MM_ReclaimDelegate.__compactRateOfReturnOffset_);
	}

	// double _compactRateOfReturn
	public DoublePointer _compactRateOfReturnEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__compactRateOfReturnOffset_));
	}

	// UDATA _currentSortedRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSortedRegionCountOffset_", declaredType="UDATA")
	public UDATA _currentSortedRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ReclaimDelegate.__currentSortedRegionCountOffset_);
	}

	// UDATA _currentSortedRegionCount
	public UDATAPointer _currentSortedRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__currentSortedRegionCountOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__dispatcherOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__regionManagerOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC*[] _regionSortedByCompactScore
	public PointerPointer _regionSortedByCompactScoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__regionSortedByCompactScoreOffset_));
	}

	// void** _regionsSortedByEmptinessArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsSortedByEmptinessArrayOffset_", declaredType="void**")
	public PointerPointer _regionsSortedByEmptinessArray() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__regionsSortedByEmptinessArrayOffset_));
	}

	// void** _regionsSortedByEmptinessArray
	public PointerPointer _regionsSortedByEmptinessArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__regionsSortedByEmptinessArrayOffset_));
	}

	// UDATA _regionsSortedByEmptinessArraySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsSortedByEmptinessArraySizeOffset_", declaredType="UDATA")
	public UDATA _regionsSortedByEmptinessArraySize() throws CorruptDataException {
		return getUDATAAtOffset(MM_ReclaimDelegate.__regionsSortedByEmptinessArraySizeOffset_);
	}

	// UDATA _regionsSortedByEmptinessArraySize
	public UDATAPointer _regionsSortedByEmptinessArraySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__regionsSortedByEmptinessArraySizeOffset_));
	}

	// MM_ParallelSweepSchemeVLHGC* _sweepScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepSchemeOffset_", declaredType="MM_ParallelSweepSchemeVLHGC*")
	public MM_ParallelSweepSchemeVLHGCPointer _sweepScheme() throws CorruptDataException {
		return MM_ParallelSweepSchemeVLHGCPointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__sweepSchemeOffset_));
	}

	// MM_ParallelSweepSchemeVLHGC* _sweepScheme
	public PointerPointer _sweepSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__sweepSchemeOffset_));
	}

	// MM_WriteOnceCompactor* _writeOnceCompactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeOnceCompactorOffset_", declaredType="MM_WriteOnceCompactor*")
	public MM_WriteOnceCompactorPointer _writeOnceCompactor() throws CorruptDataException {
		return MM_WriteOnceCompactorPointer.cast(getPointerAtOffset(MM_ReclaimDelegate.__writeOnceCompactorOffset_));
	}

	// MM_WriteOnceCompactor* _writeOnceCompactor
	public PointerPointer _writeOnceCompactorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReclaimDelegate.__writeOnceCompactorOffset_));
	}

}
