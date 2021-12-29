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
 * Structure: MM_ConcurrentSweepPoolStatePointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentSweepPoolStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentSweepPoolState.class)
public class MM_ConcurrentSweepPoolStatePointer extends MM_SweepPoolStatePointer {

	// NULL
	public static final MM_ConcurrentSweepPoolStatePointer NULL = new MM_ConcurrentSweepPoolStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentSweepPoolStatePointer(long address) {
		super(address);
	}

	public static MM_ConcurrentSweepPoolStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentSweepPoolStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentSweepPoolStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentSweepPoolStatePointer(address);
	}

	public MM_ConcurrentSweepPoolStatePointer add(long count) {
		return MM_ConcurrentSweepPoolStatePointer.cast(address + (MM_ConcurrentSweepPoolState.SIZEOF * count));
	}

	public MM_ConcurrentSweepPoolStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentSweepPoolStatePointer addOffset(long offset) {
		return MM_ConcurrentSweepPoolStatePointer.cast(address + offset);
	}

	public MM_ConcurrentSweepPoolStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentSweepPoolStatePointer sub(long count) {
		return MM_ConcurrentSweepPoolStatePointer.cast(address - (MM_ConcurrentSweepPoolState.SIZEOF * count));
	}

	public MM_ConcurrentSweepPoolStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentSweepPoolStatePointer subOffset(long offset) {
		return MM_ConcurrentSweepPoolStatePointer.cast(address - offset);
	}

	public MM_ConcurrentSweepPoolStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentSweepPoolStatePointer untag(long mask) {
		return MM_ConcurrentSweepPoolStatePointer.cast(address & ~mask);
	}

	public MM_ConcurrentSweepPoolStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentSweepPoolState.SIZEOF;
	}

	// Implementation methods

	// MM_ParallelSweepChunk* _connectCurrentChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectCurrentChunkOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _connectCurrentChunk() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ConcurrentSweepPoolState.__connectCurrentChunkOffset_));
	}

	// MM_ParallelSweepChunk* _connectCurrentChunk
	public PointerPointer _connectCurrentChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__connectCurrentChunkOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectNextFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectNextFreeEntryOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _connectNextFreeEntry() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(MM_ConcurrentSweepPoolState.__connectNextFreeEntryOffset_));
	}

	// MM_HeapLinkedFreeHeader* _connectNextFreeEntry
	public PointerPointer _connectNextFreeEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__connectNextFreeEntryOffset_));
	}

	// UDATA _connectNextFreeEntrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__connectNextFreeEntrySizeOffset_", declaredType="UDATA")
	public UDATA _connectNextFreeEntrySize() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepPoolState.__connectNextFreeEntrySizeOffset_);
	}

	// UDATA _connectNextFreeEntrySize
	public UDATAPointer _connectNextFreeEntrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__connectNextFreeEntrySizeOffset_));
	}

	// MM_ParallelSweepChunk* _currentInitChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentInitChunkOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _currentInitChunk() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ConcurrentSweepPoolState.__currentInitChunkOffset_));
	}

	// MM_ParallelSweepChunk* _currentInitChunk
	public PointerPointer _currentInitChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__currentInitChunkOffset_));
	}

	// MM_ParallelSweepChunk* _currentSweepChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSweepChunkOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _currentSweepChunk() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ConcurrentSweepPoolState.__currentSweepChunkOffset_));
	}

	// MM_ParallelSweepChunk* _currentSweepChunk
	public PointerPointer _currentSweepChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__currentSweepChunkOffset_));
	}

	// MM_ParallelSweepChunk* _currentSweepChunkReverse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSweepChunkReverseOffset_", declaredType="MM_ParallelSweepChunk*")
	public MM_ParallelSweepChunkPointer _currentSweepChunkReverse() throws CorruptDataException {
		return MM_ParallelSweepChunkPointer.cast(getPointerAtOffset(MM_ConcurrentSweepPoolState.__currentSweepChunkReverseOffset_));
	}

	// MM_ParallelSweepChunk* _currentSweepChunkReverse
	public PointerPointer _currentSweepChunkReverseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__currentSweepChunkReverseOffset_));
	}

	// bool _finalFlushed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalFlushedOffset_", declaredType="bool")
	public boolean _finalFlushed() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentSweepPoolState.__finalFlushedOffset_);
	}

	// bool _finalFlushed
	public BoolPointer _finalFlushedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__finalFlushedOffset_));
	}

	// UDATA _freeMemoryConnected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemoryConnectedOffset_", declaredType="UDATA")
	public UDATA _freeMemoryConnected() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepPoolState.__freeMemoryConnectedOffset_);
	}

	// UDATA _freeMemoryConnected
	public UDATAPointer _freeMemoryConnectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__freeMemoryConnectedOffset_));
	}

	// UDATA _heapSizeConnected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapSizeConnectedOffset_", declaredType="UDATA")
	public UDATA _heapSizeConnected() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepPoolState.__heapSizeConnectedOffset_);
	}

	// UDATA _heapSizeConnected
	public UDATAPointer _heapSizeConnectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__heapSizeConnectedOffset_));
	}

	// UDATA _heapSizeToConnect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapSizeToConnectOffset_", declaredType="UDATA")
	public UDATA _heapSizeToConnect() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepPoolState.__heapSizeToConnectOffset_);
	}

	// UDATA _heapSizeToConnect
	public UDATAPointer _heapSizeToConnectEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__heapSizeToConnectOffset_));
	}

	// float _previousFreeHistoryWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousFreeHistoryWeightOffset_", declaredType="float")
	public float _previousFreeHistoryWeight() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentSweepPoolState.__previousFreeHistoryWeightOffset_);
	}

	// float _previousFreeHistoryWeight
	public FloatPointer _previousFreeHistoryWeightEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__previousFreeHistoryWeightOffset_));
	}

	// float _previousFreeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousFreeRatioOffset_", declaredType="float")
	public float _previousFreeRatio() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentSweepPoolState.__previousFreeRatioOffset_);
	}

	// float _previousFreeRatio
	public FloatPointer _previousFreeRatioEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__previousFreeRatioOffset_));
	}

	// MM_LightweightNonReentrantLock _sweepChunkIteratorLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepChunkIteratorLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _sweepChunkIteratorLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__sweepChunkIteratorLockOffset_));
	}

	// MM_LightweightNonReentrantLock _sweepChunkIteratorLock
	public PointerPointer _sweepChunkIteratorLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__sweepChunkIteratorLockOffset_));
	}

	// UDATA _sweepCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepCountOffset_", declaredType="UDATA")
	public UDATA _sweepCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepPoolState.__sweepCountOffset_);
	}

	// UDATA _sweepCount
	public UDATAPointer _sweepCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepPoolState.__sweepCountOffset_));
	}

}
