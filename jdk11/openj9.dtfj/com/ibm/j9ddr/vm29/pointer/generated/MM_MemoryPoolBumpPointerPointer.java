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
 * Structure: MM_MemoryPoolBumpPointerPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolBumpPointerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolBumpPointer.class)
public class MM_MemoryPoolBumpPointerPointer extends MM_MemoryPoolPointer {

	// NULL
	public static final MM_MemoryPoolBumpPointerPointer NULL = new MM_MemoryPoolBumpPointerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolBumpPointerPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolBumpPointerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolBumpPointerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolBumpPointerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolBumpPointerPointer(address);
	}

	public MM_MemoryPoolBumpPointerPointer add(long count) {
		return MM_MemoryPoolBumpPointerPointer.cast(address + (MM_MemoryPoolBumpPointer.SIZEOF * count));
	}

	public MM_MemoryPoolBumpPointerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolBumpPointerPointer addOffset(long offset) {
		return MM_MemoryPoolBumpPointerPointer.cast(address + offset);
	}

	public MM_MemoryPoolBumpPointerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolBumpPointerPointer sub(long count) {
		return MM_MemoryPoolBumpPointerPointer.cast(address - (MM_MemoryPoolBumpPointer.SIZEOF * count));
	}

	public MM_MemoryPoolBumpPointerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolBumpPointerPointer subOffset(long offset) {
		return MM_MemoryPoolBumpPointerPointer.cast(address - offset);
	}

	public MM_MemoryPoolBumpPointerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolBumpPointerPointer untag(long mask) {
		return MM_MemoryPoolBumpPointerPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolBumpPointerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolBumpPointer.SIZEOF;
	}

	// Implementation methods

	// void* _allocatePointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocatePointerOffset_", declaredType="void*")
	public VoidPointer _allocatePointer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__allocatePointerOffset_));
	}

	// void* _allocatePointer
	public PointerPointer _allocatePointerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__allocatePointerOffset_));
	}

	// MM_HeapLinkedFreeHeader* _heapFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeListOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _heapFreeList() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__heapFreeListOffset_));
	}

	// MM_HeapLinkedFreeHeader* _heapFreeList
	public PointerPointer _heapFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__heapFreeListOffset_));
	}

	// MM_HeapLinkedFreeHeader* _lastFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _lastFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__lastFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _lastFreeEntry
	public PointerPointer _lastFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__lastFreeEntryOffset_));
	}

	// U64 _nonScannableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonScannableBytesOffset_", declaredType="U64")
	public UDATA _nonScannableBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolBumpPointer.__nonScannableBytesOffset_));
	}

	// U64 _nonScannableBytes
	public UDATAPointer _nonScannableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__nonScannableBytesOffset_));
	}

	// U64 _scannableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannableBytesOffset_", declaredType="U64")
	public UDATA _scannableBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolBumpPointer.__scannableBytesOffset_));
	}

	// U64 _scannableBytes
	public UDATAPointer _scannableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__scannableBytesOffset_));
	}

	// MM_SweepPoolManager* _sweepPoolManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepPoolManagerOffset_", declaredType="MM_SweepPoolManager*")
	public MM_SweepPoolManagerPointer _sweepPoolManager() throws CorruptDataException {
		return MM_SweepPoolManagerPointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__sweepPoolManagerOffset_));
	}

	// MM_SweepPoolManager* _sweepPoolManager
	public PointerPointer _sweepPoolManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__sweepPoolManagerOffset_));
	}

	// MM_SweepPoolState* _sweepPoolState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepPoolStateOffset_", declaredType="MM_SweepPoolState*")
	public MM_SweepPoolStatePointer _sweepPoolState() throws CorruptDataException {
		return MM_SweepPoolStatePointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__sweepPoolStateOffset_));
	}

	// MM_SweepPoolState* _sweepPoolState
	public PointerPointer _sweepPoolStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__sweepPoolStateOffset_));
	}

	// void* _topPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__topPointerOffset_", declaredType="void*")
	public VoidPointer _topPointer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemoryPoolBumpPointer.__topPointerOffset_));
	}

	// void* _topPointer
	public PointerPointer _topPointerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolBumpPointer.__topPointerOffset_));
	}

}
