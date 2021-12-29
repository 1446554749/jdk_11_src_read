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
 * Structure: MM_ParallelSweepSchemePointer
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
 * The generated code will provide getters for all elements in the MM_ParallelSweepSchemePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelSweepScheme.class)
public class MM_ParallelSweepSchemePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_ParallelSweepSchemePointer NULL = new MM_ParallelSweepSchemePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelSweepSchemePointer(long address) {
		super(address);
	}

	public static MM_ParallelSweepSchemePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelSweepSchemePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelSweepSchemePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelSweepSchemePointer(address);
	}

	public MM_ParallelSweepSchemePointer add(long count) {
		return MM_ParallelSweepSchemePointer.cast(address + (MM_ParallelSweepScheme.SIZEOF * count));
	}

	public MM_ParallelSweepSchemePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelSweepSchemePointer addOffset(long offset) {
		return MM_ParallelSweepSchemePointer.cast(address + offset);
	}

	public MM_ParallelSweepSchemePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelSweepSchemePointer sub(long count) {
		return MM_ParallelSweepSchemePointer.cast(address - (MM_ParallelSweepScheme.SIZEOF * count));
	}

	public MM_ParallelSweepSchemePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelSweepSchemePointer subOffset(long offset) {
		return MM_ParallelSweepSchemePointer.cast(address - offset);
	}

	public MM_ParallelSweepSchemePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelSweepSchemePointer untag(long mask) {
		return MM_ParallelSweepSchemePointer.cast(address & ~mask);
	}

	public MM_ParallelSweepSchemePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelSweepScheme.SIZEOF;
	}

	// Implementation methods

	// U64 _chunksPrepared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunksPreparedOffset_", declaredType="U64")
	public UDATA _chunksPrepared() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelSweepScheme.__chunksPreparedOffset_));
	}

	// U64 _chunksPrepared
	public UDATAPointer _chunksPreparedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__chunksPreparedOffset_));
	}

	// MM_MarkMap* _currentMarkMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentMarkMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _currentMarkMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__currentMarkMapOffset_));
	}

	// MM_MarkMap* _currentMarkMap
	public PointerPointer _currentMarkMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__currentMarkMapOffset_));
	}

	// U8* _currentSweepBits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSweepBitsOffset_", declaredType="U8*")
	public U8Pointer _currentSweepBits() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__currentSweepBitsOffset_));
	}

	// U8* _currentSweepBits
	public PointerPointer _currentSweepBitsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__currentSweepBitsOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__dispatcherOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__extensionsOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__heapBaseOffset_));
	}

	// omrthread_monitor_t _mutexSweepPoolState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutexSweepPoolStateOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mutexSweepPoolState() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__mutexSweepPoolStateOffset_));
	}

	// omrthread_monitor_t _mutexSweepPoolState
	public PointerPointer _mutexSweepPoolStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__mutexSweepPoolStateOffset_));
	}

	// J9Pool* _poolSweepPoolState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__poolSweepPoolStateOffset_", declaredType="J9Pool*")
	public J9PoolPointer _poolSweepPoolState() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__poolSweepPoolStateOffset_));
	}

	// J9Pool* _poolSweepPoolState
	public PointerPointer _poolSweepPoolStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__poolSweepPoolStateOffset_));
	}

	// MM_SweepHeapSectioning* _sweepHeapSectioning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepHeapSectioningOffset_", declaredType="MM_SweepHeapSectioning*")
	public MM_SweepHeapSectioningPointer _sweepHeapSectioning() throws CorruptDataException {
		return MM_SweepHeapSectioningPointer.cast(getPointerAtOffset(MM_ParallelSweepScheme.__sweepHeapSectioningOffset_));
	}

	// MM_SweepHeapSectioning* _sweepHeapSectioning
	public PointerPointer _sweepHeapSectioningEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelSweepScheme.__sweepHeapSectioningOffset_));
	}

}
