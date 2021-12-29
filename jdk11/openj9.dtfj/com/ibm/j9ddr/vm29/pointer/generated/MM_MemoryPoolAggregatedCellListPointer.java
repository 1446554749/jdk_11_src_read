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
 * Structure: MM_MemoryPoolAggregatedCellListPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolAggregatedCellListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolAggregatedCellList.class)
public class MM_MemoryPoolAggregatedCellListPointer extends MM_MemoryPoolPointer {

	// NULL
	public static final MM_MemoryPoolAggregatedCellListPointer NULL = new MM_MemoryPoolAggregatedCellListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolAggregatedCellListPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolAggregatedCellListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolAggregatedCellListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolAggregatedCellListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolAggregatedCellListPointer(address);
	}

	public MM_MemoryPoolAggregatedCellListPointer add(long count) {
		return MM_MemoryPoolAggregatedCellListPointer.cast(address + (MM_MemoryPoolAggregatedCellList.SIZEOF * count));
	}

	public MM_MemoryPoolAggregatedCellListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolAggregatedCellListPointer addOffset(long offset) {
		return MM_MemoryPoolAggregatedCellListPointer.cast(address + offset);
	}

	public MM_MemoryPoolAggregatedCellListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolAggregatedCellListPointer sub(long count) {
		return MM_MemoryPoolAggregatedCellListPointer.cast(address - (MM_MemoryPoolAggregatedCellList.SIZEOF * count));
	}

	public MM_MemoryPoolAggregatedCellListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolAggregatedCellListPointer subOffset(long offset) {
		return MM_MemoryPoolAggregatedCellListPointer.cast(address - offset);
	}

	public MM_MemoryPoolAggregatedCellListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolAggregatedCellListPointer untag(long mask) {
		return MM_MemoryPoolAggregatedCellListPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolAggregatedCellListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolAggregatedCellList.SIZEOF;
	}

	// Implementation methods

	// U64 _freeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeCountOffset_", declaredType="U64")
	public UDATA _freeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolAggregatedCellList.__freeCountOffset_));
	}

	// U64 _freeCount
	public UDATAPointer _freeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__freeCountOffset_));
	}

	// volatile MM_HeapLinkedFreeHeader* _freeListHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListHeadOffset_", declaredType="volatile MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _freeListHead() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_MemoryPoolAggregatedCellList.__freeListHeadOffset_));
	}

	// volatile MM_HeapLinkedFreeHeader* _freeListHead
	public PointerPointer _freeListHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__freeListHeadOffset_));
	}

	// volatile U64* _heapCurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapCurrentOffset_", declaredType="volatile U64*")
	public UDATAPointer _heapCurrent() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_MemoryPoolAggregatedCellList.__heapCurrentOffset_));
	}

	// volatile U64* _heapCurrent
	public PointerPointer _heapCurrentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__heapCurrentOffset_));
	}

	// volatile U64* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="volatile U64*")
	public UDATAPointer _heapTop() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_MemoryPoolAggregatedCellList.__heapTopOffset_));
	}

	// volatile U64* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__heapTopOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__lockOffset_));
	}

	// U64 _markCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markCountOffset_", declaredType="U64")
	public UDATA _markCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolAggregatedCellList.__markCountOffset_));
	}

	// U64 _markCount
	public UDATAPointer _markCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__markCountOffset_));
	}

	// U64 _preSweepFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__preSweepFreeBytesOffset_", declaredType="U64")
	public UDATA _preSweepFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolAggregatedCellList.__preSweepFreeBytesOffset_));
	}

	// U64 _preSweepFreeBytes
	public UDATAPointer _preSweepFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__preSweepFreeBytesOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _region() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_MemoryPoolAggregatedCellList.__regionOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _region
	public PointerPointer _regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAggregatedCellList.__regionOffset_));
	}

}
