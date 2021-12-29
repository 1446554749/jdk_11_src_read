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
 * Structure: MM_HeapRegionDescriptorPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDescriptor.class)
public class MM_HeapRegionDescriptorPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_HeapRegionDescriptorPointer NULL = new MM_HeapRegionDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDescriptorPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDescriptorPointer(address);
	}

	public MM_HeapRegionDescriptorPointer add(long count) {
		return MM_HeapRegionDescriptorPointer.cast(address + (MM_HeapRegionDescriptor.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDescriptorPointer addOffset(long offset) {
		return MM_HeapRegionDescriptorPointer.cast(address + offset);
	}

	public MM_HeapRegionDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorPointer sub(long count) {
		return MM_HeapRegionDescriptorPointer.cast(address - (MM_HeapRegionDescriptor.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDescriptorPointer subOffset(long offset) {
		return MM_HeapRegionDescriptorPointer.cast(address - offset);
	}

	public MM_HeapRegionDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorPointer untag(long mask) {
		return MM_HeapRegionDescriptorPointer.cast(address & ~mask);
	}

	public MM_HeapRegionDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDescriptor.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptor* _headOfSpan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headOfSpanOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _headOfSpan() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__headOfSpanOffset_));
	}

	// MM_HeapRegionDescriptor* _headOfSpan
	public PointerPointer _headOfSpanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__headOfSpanOffset_));
	}

	// void* _heapRegionDescriptorExtension
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionDescriptorExtensionOffset_", declaredType="void*")
	public VoidPointer _heapRegionDescriptorExtension() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__heapRegionDescriptorExtensionOffset_));
	}

	// void* _heapRegionDescriptorExtension
	public PointerPointer _heapRegionDescriptorExtensionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__heapRegionDescriptorExtensionOffset_));
	}

	// void* _highAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highAddressOffset_", declaredType="void*")
	public VoidPointer _highAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__highAddressOffset_));
	}

	// void* _highAddress
	public PointerPointer _highAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__highAddressOffset_));
	}

	// bool _isAllocated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isAllocatedOffset_", declaredType="bool")
	public boolean _isAllocated() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDescriptor.__isAllocatedOffset_);
	}

	// bool _isAllocated
	public BoolPointer _isAllocatedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__isAllocatedOffset_));
	}

	// void* _lowAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowAddressOffset_", declaredType="void*")
	public VoidPointer _lowAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__lowAddressOffset_));
	}

	// void* _lowAddress
	public PointerPointer _lowAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__lowAddressOffset_));
	}

	// MM_MemoryPool* _memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _memoryPool() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__memoryPoolOffset_));
	}

	// MM_MemoryPool* _memoryPool
	public PointerPointer _memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__memoryPoolOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__memorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	public PointerPointer _memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__memorySubSpaceOffset_));
	}

	// MM_HeapRegionDescriptor* _nextInSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextInSetOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _nextInSet() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__nextInSetOffset_));
	}

	// MM_HeapRegionDescriptor* _nextInSet
	public PointerPointer _nextInSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__nextInSetOffset_));
	}

	// MM_HeapRegionDescriptor* _nextRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _nextRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__nextRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _nextRegion
	public PointerPointer _nextRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__nextRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _nextRegionInSubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextRegionInSubSpaceOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _nextRegionInSubSpace() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__nextRegionInSubSpaceOffset_));
	}

	// MM_HeapRegionDescriptor* _nextRegionInSubSpace
	public PointerPointer _nextRegionInSubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__nextRegionInSubSpaceOffset_));
	}

	// U64 _numaNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaNodeOffset_", declaredType="U64")
	public UDATA _numaNode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptor.__numaNodeOffset_));
	}

	// U64 _numaNode
	public UDATAPointer _numaNodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__numaNodeOffset_));
	}

	// MM_HeapRegionDescriptor* _previousRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _previousRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__previousRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _previousRegion
	public PointerPointer _previousRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__previousRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _previousRegionInSubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousRegionInSubSpaceOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _previousRegionInSubSpace() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptor.__previousRegionInSubSpaceOffset_));
	}

	// MM_HeapRegionDescriptor* _previousRegionInSubSpace
	public PointerPointer _previousRegionInSubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__previousRegionInSubSpaceOffset_));
	}

	// U32 _regionProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionPropertiesOffset_", declaredType="U32")
	public UDATA _regionProperties() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_HeapRegionDescriptor.__regionPropertiesOffset_));
	}

	// U32 _regionProperties
	public UDATAPointer _regionPropertiesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__regionPropertiesOffset_));
	}

	// MM_HeapRegionDescriptor$RegionType _regionType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionTypeOffset_", declaredType="MM_HeapRegionDescriptor$RegionType")
	public long _regionType() throws CorruptDataException {
		if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 1) {
			return getByteAtOffset(MM_HeapRegionDescriptor.__regionTypeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 2) {
			return getShortAtOffset(MM_HeapRegionDescriptor.__regionTypeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 4) {
			return getIntAtOffset(MM_HeapRegionDescriptor.__regionTypeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 8) {
			return getLongAtOffset(MM_HeapRegionDescriptor.__regionTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_HeapRegionDescriptor$RegionType _regionType
	public EnumPointer _regionTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__regionTypeOffset_), MM_HeapRegionDescriptor$RegionType.class);
	}

	// U64 _regionsInSpan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsInSpanOffset_", declaredType="U64")
	public UDATA _regionsInSpan() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptor.__regionsInSpanOffset_));
	}

	// U64 _regionsInSpan
	public UDATAPointer _regionsInSpanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptor.__regionsInSpanOffset_));
	}

}
