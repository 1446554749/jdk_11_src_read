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
 * Structure: MM_InitializedEventPointer
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
 * The generated code will provide getters for all elements in the MM_InitializedEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_InitializedEvent.class)
public class MM_InitializedEventPointer extends StructurePointer {

	// NULL
	public static final MM_InitializedEventPointer NULL = new MM_InitializedEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_InitializedEventPointer(long address) {
		super(address);
	}

	public static MM_InitializedEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_InitializedEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_InitializedEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_InitializedEventPointer(address);
	}

	public MM_InitializedEventPointer add(long count) {
		return MM_InitializedEventPointer.cast(address + (MM_InitializedEvent.SIZEOF * count));
	}

	public MM_InitializedEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_InitializedEventPointer addOffset(long offset) {
		return MM_InitializedEventPointer.cast(address + offset);
	}

	public MM_InitializedEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_InitializedEventPointer sub(long count) {
		return MM_InitializedEventPointer.cast(address - (MM_InitializedEvent.SIZEOF * count));
	}

	public MM_InitializedEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_InitializedEventPointer subOffset(long offset) {
		return MM_InitializedEventPointer.cast(address - offset);
	}

	public MM_InitializedEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_InitializedEventPointer untag(long mask) {
		return MM_InitializedEventPointer.cast(address & ~mask);
	}

	public MM_InitializedEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_InitializedEvent.SIZEOF;
	}

	// Implementation methods

	// const U8* architecture
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_architectureOffset_", declaredType="const U8*")
	public U8Pointer architecture() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._architectureOffset_));
	}

	// const U8* architecture
	public PointerPointer architectureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._architectureOffset_));
	}

	// U64 arrayletLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayletLeafSizeOffset_", declaredType="U64")
	public UDATA arrayletLeafSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._arrayletLeafSizeOffset_));
	}

	// U64 arrayletLeafSize
	public UDATAPointer arrayletLeafSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._arrayletLeafSizeOffset_));
	}

	// U64 beat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_beatOffset_", declaredType="U64")
	public UDATA beat() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._beatOffset_));
	}

	// U64 beat
	public UDATAPointer beatEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._beatOffset_));
	}

	// U64 compressedPointersShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressedPointersShiftOffset_", declaredType="U64")
	public UDATA compressedPointersShift() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._compressedPointersShiftOffset_));
	}

	// U64 compressedPointersShift
	public UDATAPointer compressedPointersShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._compressedPointersShiftOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_InitializedEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._currentThreadOffset_));
	}

	// const U8* gcPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcPolicyOffset_", declaredType="const U8*")
	public U8Pointer gcPolicy() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._gcPolicyOffset_));
	}

	// const U8* gcPolicy
	public PointerPointer gcPolicyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._gcPolicyOffset_));
	}

	// U64 gcThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcThreadsOffset_", declaredType="U64")
	public UDATA gcThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._gcThreadsOffset_));
	}

	// U64 gcThreads
	public UDATAPointer gcThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._gcThreadsOffset_));
	}

	// U64 gcTrigger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcTriggerOffset_", declaredType="U64")
	public UDATA gcTrigger() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._gcTriggerOffset_));
	}

	// U64 gcTrigger
	public UDATAPointer gcTriggerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._gcTriggerOffset_));
	}

	// U64 headRoom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headRoomOffset_", declaredType="U64")
	public UDATA headRoom() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._headRoomOffset_));
	}

	// U64 headRoom
	public UDATAPointer headRoomEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._headRoomOffset_));
	}

	// U64 heapPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapPageSizeOffset_", declaredType="U64")
	public UDATA heapPageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._heapPageSizeOffset_));
	}

	// U64 heapPageSize
	public UDATAPointer heapPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._heapPageSizeOffset_));
	}

	// const U8* heapPageType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapPageTypeOffset_", declaredType="const U8*")
	public U8Pointer heapPageType() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._heapPageTypeOffset_));
	}

	// const U8* heapPageType
	public PointerPointer heapPageTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._heapPageTypeOffset_));
	}

	// U64 heapRequestedPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapRequestedPageSizeOffset_", declaredType="U64")
	public UDATA heapRequestedPageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._heapRequestedPageSizeOffset_));
	}

	// U64 heapRequestedPageSize
	public UDATAPointer heapRequestedPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._heapRequestedPageSizeOffset_));
	}

	// const U8* heapRequestedPageType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapRequestedPageTypeOffset_", declaredType="const U8*")
	public U8Pointer heapRequestedPageType() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._heapRequestedPageTypeOffset_));
	}

	// const U8* heapRequestedPageType
	public PointerPointer heapRequestedPageTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._heapRequestedPageTypeOffset_));
	}

	// U64 initialHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialHeapSizeOffset_", declaredType="U64")
	public UDATA initialHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._initialHeapSizeOffset_));
	}

	// U64 initialHeapSize
	public UDATAPointer initialHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._initialHeapSizeOffset_));
	}

	// U64 maxHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxHeapSizeOffset_", declaredType="U64")
	public UDATA maxHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._maxHeapSizeOffset_));
	}

	// U64 maxHeapSize
	public UDATAPointer maxHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._maxHeapSizeOffset_));
	}

	// U64 numCPUs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numCPUsOffset_", declaredType="U64")
	public UDATA numCPUs() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._numCPUsOffset_));
	}

	// U64 numCPUs
	public UDATAPointer numCPUsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._numCPUsOffset_));
	}

	// U64 numaNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numaNodesOffset_", declaredType="U64")
	public UDATA numaNodes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._numaNodesOffset_));
	}

	// U64 numaNodes
	public UDATAPointer numaNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._numaNodesOffset_));
	}

	// const U8* os
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osOffset_", declaredType="const U8*")
	public U8Pointer os() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._osOffset_));
	}

	// const U8* os
	public PointerPointer osEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._osOffset_));
	}

	// const U8* osVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osVersionOffset_", declaredType="const U8*")
	public U8Pointer osVersion() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_InitializedEvent._osVersionOffset_));
	}

	// const U8* osVersion
	public PointerPointer osVersionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_InitializedEvent._osVersionOffset_));
	}

	// U64 physicalMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_physicalMemoryOffset_", declaredType="U64")
	public UDATA physicalMemory() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._physicalMemoryOffset_));
	}

	// U64 physicalMemory
	public UDATAPointer physicalMemoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._physicalMemoryOffset_));
	}

	// U64 regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_regionCountOffset_", declaredType="U64")
	public UDATA regionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._regionCountOffset_));
	}

	// U64 regionCount
	public UDATAPointer regionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._regionCountOffset_));
	}

	// U64 regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_regionSizeOffset_", declaredType="U64")
	public UDATA regionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._regionSizeOffset_));
	}

	// U64 regionSize
	public UDATAPointer regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._regionSizeOffset_));
	}

	// U64 targetUtilization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetUtilizationOffset_", declaredType="U64")
	public UDATA targetUtilization() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._targetUtilizationOffset_));
	}

	// U64 targetUtilization
	public UDATAPointer targetUtilizationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._targetUtilizationOffset_));
	}

	// U64 timeWindow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timeWindowOffset_", declaredType="U64")
	public UDATA timeWindow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._timeWindowOffset_));
	}

	// U64 timeWindow
	public UDATAPointer timeWindowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._timeWindowOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._timestampOffset_));
	}

	// U64 unused
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unusedOffset_", declaredType="U64")
	public UDATA unused() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_InitializedEvent._unusedOffset_));
	}

	// U64 unused
	public UDATAPointer unusedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_InitializedEvent._unusedOffset_));
	}

}
