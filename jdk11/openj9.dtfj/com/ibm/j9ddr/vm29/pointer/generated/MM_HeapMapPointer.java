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
 * Structure: MM_HeapMapPointer
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
 * The generated code will provide getters for all elements in the MM_HeapMapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapMap.class)
public class MM_HeapMapPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_HeapMapPointer NULL = new MM_HeapMapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapMapPointer(long address) {
		super(address);
	}

	public static MM_HeapMapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapMapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapMapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapMapPointer(address);
	}

	public MM_HeapMapPointer add(long count) {
		return MM_HeapMapPointer.cast(address + (MM_HeapMap.SIZEOF * count));
	}

	public MM_HeapMapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapMapPointer addOffset(long offset) {
		return MM_HeapMapPointer.cast(address + offset);
	}

	public MM_HeapMapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapMapPointer sub(long count) {
		return MM_HeapMapPointer.cast(address - (MM_HeapMap.SIZEOF * count));
	}

	public MM_HeapMapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapMapPointer subOffset(long offset) {
		return MM_HeapMapPointer.cast(address - offset);
	}

	public MM_HeapMapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapMapPointer untag(long mask) {
		return MM_HeapMapPointer.cast(address & ~mask);
	}

	public MM_HeapMapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapMap.SIZEOF;
	}

	// Implementation methods

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_HeapMap.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapMap.__extensionsOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapMap.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapMap.__heapBaseOffset_));
	}

	// U64 _heapMapBaseDelta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapBaseDeltaOffset_", declaredType="U64")
	public UDATA _heapMapBaseDelta() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMap.__heapMapBaseDeltaOffset_));
	}

	// U64 _heapMapBaseDelta
	public UDATAPointer _heapMapBaseDeltaEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapBaseDeltaOffset_));
	}

	// const U64 _heapMapBitMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapBitMaskOffset_", declaredType="const U64")
	public UDATA _heapMapBitMask() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMap.__heapMapBitMaskOffset_));
	}

	// const U64 _heapMapBitMask
	public UDATAPointer _heapMapBitMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapBitMaskOffset_));
	}

	// const U64 _heapMapBitShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapBitShiftOffset_", declaredType="const U64")
	public UDATA _heapMapBitShift() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMap.__heapMapBitShiftOffset_));
	}

	// const U64 _heapMapBitShift
	public UDATAPointer _heapMapBitShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapBitShiftOffset_));
	}

	// U64* _heapMapBits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapBitsOffset_", declaredType="U64*")
	public UDATAPointer _heapMapBits() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_HeapMap.__heapMapBitsOffset_));
	}

	// U64* _heapMapBits
	public PointerPointer _heapMapBitsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapBitsOffset_));
	}

	// const U64 _heapMapIndexShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapIndexShiftOffset_", declaredType="const U64")
	public UDATA _heapMapIndexShift() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMap.__heapMapIndexShiftOffset_));
	}

	// const U64 _heapMapIndexShift
	public UDATAPointer _heapMapIndexShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapIndexShiftOffset_));
	}

	// MM_MemoryHandle _heapMapMemoryHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapMapMemoryHandleOffset_", declaredType="MM_MemoryHandle")
	public MM_MemoryHandlePointer _heapMapMemoryHandle() throws CorruptDataException {
		return MM_MemoryHandlePointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapMemoryHandleOffset_));
	}

	// MM_MemoryHandle _heapMapMemoryHandle
	public PointerPointer _heapMapMemoryHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapMap.__heapMapMemoryHandleOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapMap.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapMap.__heapTopOffset_));
	}

	// U64 _maxHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxHeapSizeOffset_", declaredType="U64")
	public UDATA _maxHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapMap.__maxHeapSizeOffset_));
	}

	// U64 _maxHeapSize
	public UDATAPointer _maxHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapMap.__maxHeapSizeOffset_));
	}

	// const bool _useCompressedHeapMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__useCompressedHeapMapOffset_", declaredType="const bool")
	public boolean _useCompressedHeapMap() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapMap.__useCompressedHeapMapOffset_);
	}

	// const bool _useCompressedHeapMap
	public BoolPointer _useCompressedHeapMapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapMap.__useCompressedHeapMapOffset_));
	}

}
