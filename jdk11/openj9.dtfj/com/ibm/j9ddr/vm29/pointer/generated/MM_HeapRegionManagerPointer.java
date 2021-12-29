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
 * Structure: MM_HeapRegionManagerPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionManager.class)
public class MM_HeapRegionManagerPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_HeapRegionManagerPointer NULL = new MM_HeapRegionManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionManagerPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionManagerPointer(address);
	}

	public MM_HeapRegionManagerPointer add(long count) {
		return MM_HeapRegionManagerPointer.cast(address + (MM_HeapRegionManager.SIZEOF * count));
	}

	public MM_HeapRegionManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionManagerPointer addOffset(long offset) {
		return MM_HeapRegionManagerPointer.cast(address + offset);
	}

	public MM_HeapRegionManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionManagerPointer sub(long count) {
		return MM_HeapRegionManagerPointer.cast(address - (MM_HeapRegionManager.SIZEOF * count));
	}

	public MM_HeapRegionManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionManagerPointer subOffset(long offset) {
		return MM_HeapRegionManagerPointer.cast(address - offset);
	}

	public MM_HeapRegionManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionManagerPointer untag(long mask) {
		return MM_HeapRegionManagerPointer.cast(address & ~mask);
	}

	public MM_HeapRegionManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionManager.SIZEOF;
	}

	// Implementation methods

	// U64 _auxRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__auxRegionCountOffset_", declaredType="U64")
	public UDATA _auxRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__auxRegionCountOffset_));
	}

	// U64 _auxRegionCount
	public UDATAPointer _auxRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__auxRegionCountOffset_));
	}

	// MM_HeapRegionDescriptor* _auxRegionDescriptorList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__auxRegionDescriptorListOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _auxRegionDescriptorList() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__auxRegionDescriptorListOffset_));
	}

	// MM_HeapRegionDescriptor* _auxRegionDescriptorList
	public PointerPointer _auxRegionDescriptorListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__auxRegionDescriptorListOffset_));
	}

	// MM_LightweightNonReentrantReaderWriterLock _heapRegionListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionListMonitorOffset_", declaredType="MM_LightweightNonReentrantReaderWriterLock")
	public MM_LightweightNonReentrantReaderWriterLockPointer _heapRegionListMonitor() throws CorruptDataException {
		return MM_LightweightNonReentrantReaderWriterLockPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__heapRegionListMonitorOffset_));
	}

	// MM_LightweightNonReentrantReaderWriterLock _heapRegionListMonitor
	public PointerPointer _heapRegionListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__heapRegionListMonitorOffset_));
	}

	// void* _highTableEdge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highTableEdgeOffset_", declaredType="void*")
	public VoidPointer _highTableEdge() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__highTableEdgeOffset_));
	}

	// void* _highTableEdge
	public PointerPointer _highTableEdgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__highTableEdgeOffset_));
	}

	// void* _lowTableEdge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowTableEdgeOffset_", declaredType="void*")
	public VoidPointer _lowTableEdge() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__lowTableEdgeOffset_));
	}

	// void* _lowTableEdge
	public PointerPointer _lowTableEdgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__lowTableEdgeOffset_));
	}

	// MM_RegionDescriptorDestructor _regionDescriptorDestructor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionDescriptorDestructorOffset_", declaredType="MM_RegionDescriptorDestructor")
	public VoidPointer _regionDescriptorDestructor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__regionDescriptorDestructorOffset_));
	}

	// MM_RegionDescriptorDestructor _regionDescriptorDestructor
	public PointerPointer _regionDescriptorDestructorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__regionDescriptorDestructorOffset_));
	}

	// MM_RegionDescriptorInitializer _regionDescriptorInitializer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionDescriptorInitializerOffset_", declaredType="MM_RegionDescriptorInitializer")
	public VoidPointer _regionDescriptorInitializer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__regionDescriptorInitializerOffset_));
	}

	// MM_RegionDescriptorInitializer _regionDescriptorInitializer
	public PointerPointer _regionDescriptorInitializerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__regionDescriptorInitializerOffset_));
	}

	// U64 _regionShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionShiftOffset_", declaredType="U64")
	public UDATA _regionShift() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__regionShiftOffset_));
	}

	// U64 _regionShift
	public UDATAPointer _regionShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__regionShiftOffset_));
	}

	// U64 _regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionSizeOffset_", declaredType="U64")
	public UDATA _regionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__regionSizeOffset_));
	}

	// U64 _regionSize
	public UDATAPointer _regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__regionSizeOffset_));
	}

	// MM_HeapRegionDescriptor* _regionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionTableOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _regionTable() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionManager.__regionTableOffset_));
	}

	// MM_HeapRegionDescriptor* _regionTable
	public PointerPointer _regionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__regionTableOffset_));
	}

	// U64 _tableDescriptorSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tableDescriptorSizeOffset_", declaredType="U64")
	public UDATA _tableDescriptorSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__tableDescriptorSizeOffset_));
	}

	// U64 _tableDescriptorSize
	public UDATAPointer _tableDescriptorSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__tableDescriptorSizeOffset_));
	}

	// U64 _tableRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tableRegionCountOffset_", declaredType="U64")
	public UDATA _tableRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__tableRegionCountOffset_));
	}

	// U64 _tableRegionCount
	public UDATAPointer _tableRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__tableRegionCountOffset_));
	}

	// U64 _totalHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalHeapSizeOffset_", declaredType="U64")
	public UDATA _totalHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionManager.__totalHeapSizeOffset_));
	}

	// U64 _totalHeapSize
	public UDATAPointer _totalHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionManager.__totalHeapSizeOffset_));
	}

}
