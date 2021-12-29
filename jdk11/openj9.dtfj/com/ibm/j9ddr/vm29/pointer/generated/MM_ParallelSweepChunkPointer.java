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
 * Structure: MM_ParallelSweepChunkPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelSweepChunkPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelSweepChunk.class)
public class MM_ParallelSweepChunkPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_ParallelSweepChunkPointer NULL = new MM_ParallelSweepChunkPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelSweepChunkPointer(long address) {
		super(address);
	}

	public static MM_ParallelSweepChunkPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelSweepChunkPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelSweepChunkPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelSweepChunkPointer(address);
	}

	public MM_ParallelSweepChunkPointer add(long count) {
		return MM_ParallelSweepChunkPointer.cast(address + (MM_ParallelSweepChunk.SIZEOF * count));
	}

	public MM_ParallelSweepChunkPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelSweepChunkPointer addOffset(long offset) {
		return MM_ParallelSweepChunkPointer.cast(address + offset);
	}

	public MM_ParallelSweepChunkPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelSweepChunkPointer sub(long count) {
		return MM_ParallelSweepChunkPointer.cast(address - (MM_ParallelSweepChunk.SIZEOF * count));
	}

	public MM_ParallelSweepChunkPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelSweepChunkPointer subOffset(long offset) {
		return MM_ParallelSweepChunkPointer.cast(address - offset);
	}

	public MM_ParallelSweepChunkPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelSweepChunkPointer untag(long mask) {
		return MM_ParallelSweepChunkPointer.cast(address & ~mask);
	}

	public MM_ParallelSweepChunkPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelSweepChunk.SIZEOF;
	}

	// Implementation methods

	// U64 _accumulatedFreeHoles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__accumulatedFreeHolesOffset_", declaredType="U64")
	public UDATA _accumulatedFreeHoles() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__accumulatedFreeHolesOffset_));
	}

	// U64 _accumulatedFreeHoles
	public UDATAPointer _accumulatedFreeHolesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__accumulatedFreeHolesOffset_));
	}

	// U64 _accumulatedFreeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__accumulatedFreeSizeOffset_", declaredType="U64")
	public UDATA _accumulatedFreeSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__accumulatedFreeSizeOffset_));
	}

	// U64 _accumulatedFreeSize
	public UDATAPointer _accumulatedFreeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__accumulatedFreeSizeOffset_));
	}

	// bool _coalesceCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__coalesceCandidateOffset_", declaredType="bool")
	public boolean _coalesceCandidate() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelSweepChunk.__coalesceCandidateOffset_);
	}

	// bool _coalesceCandidate
	public BoolPointer _coalesceCandidateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__coalesceCandidateOffset_));
	}

	// U64 _concurrentSweepState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentSweepStateOffset_", declaredType="U64")
	public UDATA _concurrentSweepState() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__concurrentSweepStateOffset_));
	}

	// U64 _concurrentSweepState
	public UDATAPointer _concurrentSweepStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__concurrentSweepStateOffset_));
	}

	// U64 _darkMatterBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__darkMatterBytesOffset_", declaredType="U64")
	public UDATA _darkMatterBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__darkMatterBytesOffset_));
	}

	// U64 _darkMatterBytes
	public UDATAPointer _darkMatterBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__darkMatterBytesOffset_));
	}

	// U64 _darkMatterSamples
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__darkMatterSamplesOffset_", declaredType="U64")
	public UDATA _darkMatterSamples() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__darkMatterSamplesOffset_));
	}

	// U64 _darkMatterSamples
	public UDATAPointer _darkMatterSamplesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__darkMatterSamplesOffset_));
	}

	// U64 _largestFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestFreeEntryOffset_", declaredType="U64")
	public UDATA _largestFreeEntry() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__largestFreeEntryOffset_));
	}

	// U64 _largestFreeEntry
	public UDATAPointer _largestFreeEntryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__largestFreeEntryOffset_));
	}

	// MM_ParallelSweepChunk* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _next() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__nextOffset_));
	}

	// MM_ParallelSweepChunk* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__nextOffset_));
	}

	// MM_ParallelSweepChunk* _nextChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextChunkOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _nextChunk() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__nextChunkOffset_));
	}

	// MM_ParallelSweepChunk* _nextChunk
	public PointerPointer _nextChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__nextChunkOffset_));
	}

	// U64 _nonScannableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonScannableBytesOffset_", declaredType="U64")
	public UDATA _nonScannableBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__nonScannableBytesOffset_));
	}

	// U64 _nonScannableBytes
	public UDATAPointer _nonScannableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__nonScannableBytesOffset_));
	}

	// MM_ParallelSweepChunk* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _previous() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__previousOffset_));
	}

	// MM_ParallelSweepChunk* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__previousOffset_));
	}

	// MM_HeapLinkedFreeHeader* _previousLargestFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousLargestFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _previousLargestFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__previousLargestFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _previousLargestFreeEntry
	public PointerPointer _previousLargestFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__previousLargestFreeEntryOffset_));
	}

	// U64 _scannableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannableBytesOffset_", declaredType="U64")
	public UDATA _scannableBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk.__scannableBytesOffset_));
	}

	// U64 _scannableBytes
	public UDATAPointer _scannableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__scannableBytesOffset_));
	}

	// MM_HeapLinkedFreeHeader* _splitCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__splitCandidateOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _splitCandidate() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__splitCandidateOffset_));
	}

	// MM_HeapLinkedFreeHeader* _splitCandidate
	public PointerPointer _splitCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__splitCandidateOffset_));
	}

	// MM_HeapLinkedFreeHeader* _splitCandidatePreviousEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__splitCandidatePreviousEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _splitCandidatePreviousEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk.__splitCandidatePreviousEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _splitCandidatePreviousEntry
	public PointerPointer _splitCandidatePreviousEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk.__splitCandidatePreviousEntryOffset_));
	}

	// void* chunkBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_chunkBaseOffset_", declaredType="void*")
	public VoidPointer chunkBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._chunkBaseOffset_));
	}

	// void* chunkBase
	public PointerPointer chunkBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._chunkBaseOffset_));
	}

	// void* chunkTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_chunkTopOffset_", declaredType="void*")
	public VoidPointer chunkTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._chunkTopOffset_));
	}

	// void* chunkTop
	public PointerPointer chunkTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._chunkTopOffset_));
	}

	// U64 freeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeBytesOffset_", declaredType="U64")
	public UDATA freeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._freeBytesOffset_));
	}

	// U64 freeBytes
	public UDATAPointer freeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeBytesOffset_));
	}

	// U64 freeHoles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeHolesOffset_", declaredType="U64")
	public UDATA freeHoles() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._freeHolesOffset_));
	}

	// U64 freeHoles
	public UDATAPointer freeHolesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeHolesOffset_));
	}

	// MM_HeapLinkedFreeHeader* freeListHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeListHeadOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer freeListHead() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._freeListHeadOffset_));
	}

	// MM_HeapLinkedFreeHeader* freeListHead
	public PointerPointer freeListHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeListHeadOffset_));
	}

	// U64 freeListHeadSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeListHeadSizeOffset_", declaredType="U64")
	public UDATA freeListHeadSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._freeListHeadSizeOffset_));
	}

	// U64 freeListHeadSize
	public UDATAPointer freeListHeadSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeListHeadSizeOffset_));
	}

	// MM_HeapLinkedFreeHeader* freeListTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeListTailOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer freeListTail() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._freeListTailOffset_));
	}

	// MM_HeapLinkedFreeHeader* freeListTail
	public PointerPointer freeListTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeListTailOffset_));
	}

	// U64 freeListTailSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeListTailSizeOffset_", declaredType="U64")
	public UDATA freeListTailSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._freeListTailSizeOffset_));
	}

	// U64 freeListTailSize
	public UDATAPointer freeListTailSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._freeListTailSizeOffset_));
	}

	// void* leadingFreeCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_leadingFreeCandidateOffset_", declaredType="void*")
	public VoidPointer leadingFreeCandidate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._leadingFreeCandidateOffset_));
	}

	// void* leadingFreeCandidate
	public PointerPointer leadingFreeCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._leadingFreeCandidateOffset_));
	}

	// U64 leadingFreeCandidateSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_leadingFreeCandidateSizeOffset_", declaredType="U64")
	public UDATA leadingFreeCandidateSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._leadingFreeCandidateSizeOffset_));
	}

	// U64 leadingFreeCandidateSize
	public UDATAPointer leadingFreeCandidateSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._leadingFreeCandidateSizeOffset_));
	}

	// MM_MemoryPool* memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryPoolOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer memoryPool() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._memoryPoolOffset_));
	}

	// MM_MemoryPool* memoryPool
	public PointerPointer memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._memoryPoolOffset_));
	}

	// MM_HeapLinkedFreeHeader* previousFreeListTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousFreeListTailOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer previousFreeListTail() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._previousFreeListTailOffset_));
	}

	// MM_HeapLinkedFreeHeader* previousFreeListTail
	public PointerPointer previousFreeListTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._previousFreeListTailOffset_));
	}

	// U64 projection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_projectionOffset_", declaredType="U64")
	public UDATA projection() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._projectionOffset_));
	}

	// U64 projection
	public UDATAPointer projectionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._projectionOffset_));
	}

	// void* trailingFreeCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_trailingFreeCandidateOffset_", declaredType="void*")
	public VoidPointer trailingFreeCandidate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelSweepChunk._trailingFreeCandidateOffset_));
	}

	// void* trailingFreeCandidate
	public PointerPointer trailingFreeCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._trailingFreeCandidateOffset_));
	}

	// U64 trailingFreeCandidateSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_trailingFreeCandidateSizeOffset_", declaredType="U64")
	public UDATA trailingFreeCandidateSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepChunk._trailingFreeCandidateSizeOffset_));
	}

	// U64 trailingFreeCandidateSize
	public UDATAPointer trailingFreeCandidateSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepChunk._trailingFreeCandidateSizeOffset_));
	}

}
