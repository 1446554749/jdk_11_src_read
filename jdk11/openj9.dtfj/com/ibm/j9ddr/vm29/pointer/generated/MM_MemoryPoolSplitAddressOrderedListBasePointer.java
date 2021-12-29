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
 * Structure: MM_MemoryPoolSplitAddressOrderedListBasePointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolSplitAddressOrderedListBasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolSplitAddressOrderedListBase.class)
public class MM_MemoryPoolSplitAddressOrderedListBasePointer extends MM_MemoryPoolAddressOrderedListBasePointer {

	// NULL
	public static final MM_MemoryPoolSplitAddressOrderedListBasePointer NULL = new MM_MemoryPoolSplitAddressOrderedListBasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolSplitAddressOrderedListBasePointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolSplitAddressOrderedListBasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolSplitAddressOrderedListBasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolSplitAddressOrderedListBasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolSplitAddressOrderedListBasePointer(address);
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer add(long count) {
		return MM_MemoryPoolSplitAddressOrderedListBasePointer.cast(address + (MM_MemoryPoolSplitAddressOrderedListBase.SIZEOF * count));
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer addOffset(long offset) {
		return MM_MemoryPoolSplitAddressOrderedListBasePointer.cast(address + offset);
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer sub(long count) {
		return MM_MemoryPoolSplitAddressOrderedListBasePointer.cast(address - (MM_MemoryPoolSplitAddressOrderedListBase.SIZEOF * count));
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer subOffset(long offset) {
		return MM_MemoryPoolSplitAddressOrderedListBasePointer.cast(address - offset);
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer untag(long mask) {
		return MM_MemoryPoolSplitAddressOrderedListBasePointer.cast(address & ~mask);
	}

	public MM_MemoryPoolSplitAddressOrderedListBasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolSplitAddressOrderedListBase.SIZEOF;
	}

	// Implementation methods

	// U64* _currentThreadFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentThreadFreeListOffset_", declaredType="U64*")
	public UDATAPointer _currentThreadFreeList() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__currentThreadFreeListOffset_));
	}

	// U64* _currentThreadFreeList
	public PointerPointer _currentThreadFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__currentThreadFreeListOffset_));
	}

	// U64 _heapFreeListCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeListCountOffset_", declaredType="U64")
	public UDATA _heapFreeListCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListCountOffset_));
	}

	// U64 _heapFreeListCount
	public UDATAPointer _heapFreeListCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListCountOffset_));
	}

	// U64 _heapFreeListCountExtended
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeListCountExtendedOffset_", declaredType="U64")
	public UDATA _heapFreeListCountExtended() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListCountExtendedOffset_));
	}

	// U64 _heapFreeListCountExtended
	public UDATAPointer _heapFreeListCountExtendedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListCountExtendedOffset_));
	}

	// J9ModronFreeList* _heapFreeLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeListsOffset_", declaredType="J9ModronFreeList*")
	public J9ModronFreeListPointer _heapFreeLists() throws CorruptDataException {
		return J9ModronFreeListPointer.cast(getPointerAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListsOffset_));
	}

	// J9ModronFreeList* _heapFreeLists
	public PointerPointer _heapFreeListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__heapFreeListsOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStatsForFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectAllocateStatsForFreeListOffset_", declaredType="MM_LargeObjectAllocateStats*")
	public MM_LargeObjectAllocateStatsPointer _largeObjectAllocateStatsForFreeList() throws CorruptDataException {
		return MM_LargeObjectAllocateStatsPointer.cast(getPointerAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__largeObjectAllocateStatsForFreeListOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStatsForFreeList
	public PointerPointer _largeObjectAllocateStatsForFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__largeObjectAllocateStatsForFreeListOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectCollectorAllocateStatsForFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectCollectorAllocateStatsForFreeListOffset_", declaredType="MM_LargeObjectAllocateStats*")
	public MM_LargeObjectAllocateStatsPointer _largeObjectCollectorAllocateStatsForFreeList() throws CorruptDataException {
		return MM_LargeObjectAllocateStatsPointer.cast(getPointerAtOffset(MM_MemoryPoolSplitAddressOrderedListBase.__largeObjectCollectorAllocateStatsForFreeListOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectCollectorAllocateStatsForFreeList
	public PointerPointer _largeObjectCollectorAllocateStatsForFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSplitAddressOrderedListBase.__largeObjectCollectorAllocateStatsForFreeListOffset_));
	}

}
