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
 * Structure: MM_HeapPointer
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
 * The generated code will provide getters for all elements in the MM_HeapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Heap.class)
public class MM_HeapPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_HeapPointer NULL = new MM_HeapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapPointer(long address) {
		super(address);
	}

	public static MM_HeapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapPointer(address);
	}

	public MM_HeapPointer add(long count) {
		return MM_HeapPointer.cast(address + (MM_Heap.SIZEOF * count));
	}

	public MM_HeapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapPointer addOffset(long offset) {
		return MM_HeapPointer.cast(address + offset);
	}

	public MM_HeapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapPointer sub(long count) {
		return MM_HeapPointer.cast(address - (MM_Heap.SIZEOF * count));
	}

	public MM_HeapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapPointer subOffset(long offset) {
		return MM_HeapPointer.cast(address - offset);
	}

	public MM_HeapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapPointer untag(long mask) {
		return MM_HeapPointer.cast(address & ~mask);
	}

	public MM_HeapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Heap.SIZEOF;
	}

	// Implementation methods

	// MM_MemorySpace* _defaultMemorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultMemorySpaceOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _defaultMemorySpace() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_Heap.__defaultMemorySpaceOffset_));
	}

	// MM_MemorySpace* _defaultMemorySpace
	public PointerPointer _defaultMemorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__defaultMemorySpaceOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_Heap.__heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__heapRegionManagerOffset_));
	}

	// MM_HeapResizeStats _heapResizeStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapResizeStatsOffset_", declaredType="MM_HeapResizeStats")
	public MM_HeapResizeStatsPointer _heapResizeStats() throws CorruptDataException {
		return MM_HeapResizeStatsPointer.cast(nonNullFieldEA(MM_Heap.__heapResizeStatsOffset_));
	}

	// MM_HeapResizeStats _heapResizeStats
	public PointerPointer _heapResizeStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__heapResizeStatsOffset_));
	}

	// U64 _maximumMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumMemorySizeOffset_", declaredType="U64")
	public UDATA _maximumMemorySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Heap.__maximumMemorySizeOffset_));
	}

	// U64 _maximumMemorySize
	public UDATAPointer _maximumMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Heap.__maximumMemorySizeOffset_));
	}

	// MM_MemorySpace* _memorySpaceList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySpaceListOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _memorySpaceList() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_Heap.__memorySpaceListOffset_));
	}

	// MM_MemorySpace* _memorySpaceList
	public PointerPointer _memorySpaceListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__memorySpaceListOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_Heap.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__omrVMOffset_));
	}

	// MM_PercolateStats _percolateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__percolateStatsOffset_", declaredType="MM_PercolateStats")
	public MM_PercolateStatsPointer _percolateStats() throws CorruptDataException {
		return MM_PercolateStatsPointer.cast(nonNullFieldEA(MM_Heap.__percolateStatsOffset_));
	}

	// MM_PercolateStats _percolateStats
	public PointerPointer _percolateStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__percolateStatsOffset_));
	}

	// OMRPortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer _portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(MM_Heap.__portLibraryOffset_));
	}

	// OMRPortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Heap.__portLibraryOffset_));
	}

}
