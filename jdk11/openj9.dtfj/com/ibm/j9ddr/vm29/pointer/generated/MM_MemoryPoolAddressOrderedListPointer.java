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
 * Structure: MM_MemoryPoolAddressOrderedListPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolAddressOrderedListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolAddressOrderedList.class)
public class MM_MemoryPoolAddressOrderedListPointer extends MM_MemoryPoolAddressOrderedListBasePointer {

	// NULL
	public static final MM_MemoryPoolAddressOrderedListPointer NULL = new MM_MemoryPoolAddressOrderedListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolAddressOrderedListPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolAddressOrderedListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolAddressOrderedListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolAddressOrderedListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolAddressOrderedListPointer(address);
	}

	public MM_MemoryPoolAddressOrderedListPointer add(long count) {
		return MM_MemoryPoolAddressOrderedListPointer.cast(address + (MM_MemoryPoolAddressOrderedList.SIZEOF * count));
	}

	public MM_MemoryPoolAddressOrderedListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolAddressOrderedListPointer addOffset(long offset) {
		return MM_MemoryPoolAddressOrderedListPointer.cast(address + offset);
	}

	public MM_MemoryPoolAddressOrderedListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolAddressOrderedListPointer sub(long count) {
		return MM_MemoryPoolAddressOrderedListPointer.cast(address - (MM_MemoryPoolAddressOrderedList.SIZEOF * count));
	}

	public MM_MemoryPoolAddressOrderedListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolAddressOrderedListPointer subOffset(long offset) {
		return MM_MemoryPoolAddressOrderedListPointer.cast(address - offset);
	}

	public MM_MemoryPoolAddressOrderedListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolAddressOrderedListPointer untag(long mask) {
		return MM_MemoryPoolAddressOrderedListPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolAddressOrderedListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolAddressOrderedList.SIZEOF;
	}

	// Implementation methods

	// MM_HeapLinkedFreeHeader* _heapFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeListOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _heapFreeList() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_MemoryPoolAddressOrderedList.__heapFreeListOffset_));
	}

	// MM_HeapLinkedFreeHeader* _heapFreeList
	public PointerPointer _heapFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__heapFreeListOffset_));
	}

	// MM_LightweightNonReentrantLock _heapLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _heapLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__heapLockOffset_));
	}

	// MM_LightweightNonReentrantLock _heapLock
	public PointerPointer _heapLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__heapLockOffset_));
	}

	// J9ModronAllocateHint* _hintActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintActiveOffset_", declaredType="J9ModronAllocateHint*")
	public J9ModronAllocateHintPointer _hintActive() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(getPointerAtOffset(MM_MemoryPoolAddressOrderedList.__hintActiveOffset_));
	}

	// J9ModronAllocateHint* _hintActive
	public PointerPointer _hintActiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__hintActiveOffset_));
	}

	// J9ModronAllocateHint* _hintInactive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintInactiveOffset_", declaredType="J9ModronAllocateHint*")
	public J9ModronAllocateHintPointer _hintInactive() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(getPointerAtOffset(MM_MemoryPoolAddressOrderedList.__hintInactiveOffset_));
	}

	// J9ModronAllocateHint* _hintInactive
	public PointerPointer _hintInactiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__hintInactiveOffset_));
	}

	// U64 _hintLru
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintLruOffset_", declaredType="U64")
	public UDATA _hintLru() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolAddressOrderedList.__hintLruOffset_));
	}

	// U64 _hintLru
	public UDATAPointer _hintLruEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__hintLruOffset_));
	}

	// J9ModronAllocateHint[] _hintStorage
	public J9ModronAllocateHintPointer _hintStorageEA() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__hintStorageOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectCollectorAllocateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectCollectorAllocateStatsOffset_", declaredType="MM_LargeObjectAllocateStats*")
	public MM_LargeObjectAllocateStatsPointer _largeObjectCollectorAllocateStats() throws CorruptDataException {
		return MM_LargeObjectAllocateStatsPointer.cast(getPointerAtOffset(MM_MemoryPoolAddressOrderedList.__largeObjectCollectorAllocateStatsOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectCollectorAllocateStats
	public PointerPointer _largeObjectCollectorAllocateStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolAddressOrderedList.__largeObjectCollectorAllocateStatsOffset_));
	}

}
