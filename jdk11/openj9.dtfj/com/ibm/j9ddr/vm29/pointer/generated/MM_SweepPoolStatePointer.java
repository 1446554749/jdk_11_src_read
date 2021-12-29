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
 * Structure: MM_SweepPoolStatePointer
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
 * The generated code will provide getters for all elements in the MM_SweepPoolStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SweepPoolState.class)
public class MM_SweepPoolStatePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_SweepPoolStatePointer NULL = new MM_SweepPoolStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SweepPoolStatePointer(long address) {
		super(address);
	}

	public static MM_SweepPoolStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SweepPoolStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SweepPoolStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SweepPoolStatePointer(address);
	}

	public MM_SweepPoolStatePointer add(long count) {
		return MM_SweepPoolStatePointer.cast(address + (MM_SweepPoolState.SIZEOF * count));
	}

	public MM_SweepPoolStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SweepPoolStatePointer addOffset(long offset) {
		return MM_SweepPoolStatePointer.cast(address + offset);
	}

	public MM_SweepPoolStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SweepPoolStatePointer sub(long count) {
		return MM_SweepPoolStatePointer.cast(address - (MM_SweepPoolState.SIZEOF * count));
	}

	public MM_SweepPoolStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SweepPoolStatePointer subOffset(long offset) {
		return MM_SweepPoolStatePointer.cast(address - offset);
	}

	public MM_SweepPoolStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SweepPoolStatePointer untag(long mask) {
		return MM_SweepPoolStatePointer.cast(address & ~mask);
	}

	public MM_SweepPoolStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SweepPoolState.SIZEOF;
	}

	// Implementation methods

	// MM_ParallelSweepChunk* _connectPreviousChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectPreviousChunkOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _connectPreviousChunk() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_SweepPoolState.__connectPreviousChunkOffset_));
	}

	// MM_ParallelSweepChunk* _connectPreviousChunk
	public PointerPointer _connectPreviousChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepPoolState.__connectPreviousChunkOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectPreviousFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectPreviousFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _connectPreviousFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_SweepPoolState.__connectPreviousFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectPreviousFreeEntry
	public PointerPointer _connectPreviousFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepPoolState.__connectPreviousFreeEntryOffset_));
	}

	// U64 _connectPreviousFreeEntrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectPreviousFreeEntrySizeOffset_", declaredType="U64")
	public UDATA _connectPreviousFreeEntrySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SweepPoolState.__connectPreviousFreeEntrySizeOffset_));
	}

	// U64 _connectPreviousFreeEntrySize
	public UDATAPointer _connectPreviousFreeEntrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SweepPoolState.__connectPreviousFreeEntrySizeOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectPreviousPreviousFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectPreviousPreviousFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _connectPreviousPreviousFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_SweepPoolState.__connectPreviousPreviousFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectPreviousPreviousFreeEntry
	public PointerPointer _connectPreviousPreviousFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepPoolState.__connectPreviousPreviousFreeEntryOffset_));
	}

	// U64 _largestFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestFreeEntryOffset_", declaredType="U64")
	public UDATA _largestFreeEntry() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SweepPoolState.__largestFreeEntryOffset_));
	}

	// U64 _largestFreeEntry
	public UDATAPointer _largestFreeEntryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SweepPoolState.__largestFreeEntryOffset_));
	}

	// MM_MemoryPool* _memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _memoryPool() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_SweepPoolState.__memoryPoolOffset_));
	}

	// MM_MemoryPool* _memoryPool
	public PointerPointer _memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepPoolState.__memoryPoolOffset_));
	}

	// MM_HeapLinkedFreeHeader* _previousLargestFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousLargestFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _previousLargestFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_SweepPoolState.__previousLargestFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _previousLargestFreeEntry
	public PointerPointer _previousLargestFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepPoolState.__previousLargestFreeEntryOffset_));
	}

	// U64 _sweepFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepFreeBytesOffset_", declaredType="U64")
	public UDATA _sweepFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SweepPoolState.__sweepFreeBytesOffset_));
	}

	// U64 _sweepFreeBytes
	public UDATAPointer _sweepFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SweepPoolState.__sweepFreeBytesOffset_));
	}

	// U64 _sweepFreeHoles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepFreeHolesOffset_", declaredType="U64")
	public UDATA _sweepFreeHoles() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SweepPoolState.__sweepFreeHolesOffset_));
	}

	// U64 _sweepFreeHoles
	public UDATAPointer _sweepFreeHolesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SweepPoolState.__sweepFreeHolesOffset_));
	}

}
