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
 * Structure: MM_MemoryPoolPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPool.class)
public class MM_MemoryPoolPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_MemoryPoolPointer NULL = new MM_MemoryPoolPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolPointer(address);
	}

	public MM_MemoryPoolPointer add(long count) {
		return MM_MemoryPoolPointer.cast(address + (MM_MemoryPool.SIZEOF * count));
	}

	public MM_MemoryPoolPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolPointer addOffset(long offset) {
		return MM_MemoryPoolPointer.cast(address + offset);
	}

	public MM_MemoryPoolPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolPointer sub(long count) {
		return MM_MemoryPoolPointer.cast(address - (MM_MemoryPool.SIZEOF * count));
	}

	public MM_MemoryPoolPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolPointer subOffset(long offset) {
		return MM_MemoryPoolPointer.cast(address - offset);
	}

	public MM_MemoryPoolPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolPointer untag(long mask) {
		return MM_MemoryPoolPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPool.SIZEOF;
	}

	// Implementation methods

	// U64 _allocBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocBytesOffset_", declaredType="U64")
	public UDATA _allocBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__allocBytesOffset_));
	}

	// U64 _allocBytes
	public UDATAPointer _allocBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__allocBytesOffset_));
	}

	// U64 _allocCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocCountOffset_", declaredType="U64")
	public UDATA _allocCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__allocCountOffset_));
	}

	// U64 _allocCount
	public UDATAPointer _allocCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__allocCountOffset_));
	}

	// U64 _allocDiscardedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocDiscardedBytesOffset_", declaredType="U64")
	public UDATA _allocDiscardedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__allocDiscardedBytesOffset_));
	}

	// U64 _allocDiscardedBytes
	public UDATAPointer _allocDiscardedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__allocDiscardedBytesOffset_));
	}

	// U64 _allocSearchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocSearchCountOffset_", declaredType="U64")
	public UDATA _allocSearchCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__allocSearchCountOffset_));
	}

	// U64 _allocSearchCount
	public UDATAPointer _allocSearchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__allocSearchCountOffset_));
	}

	// U64 _approximateFreeMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__approximateFreeMemorySizeOffset_", declaredType="U64")
	public UDATA _approximateFreeMemorySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__approximateFreeMemorySizeOffset_));
	}

	// U64 _approximateFreeMemorySize
	public UDATAPointer _approximateFreeMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__approximateFreeMemorySizeOffset_));
	}

	// MM_MemoryPool* _children
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__childrenOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _children() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_MemoryPool.__childrenOffset_));
	}

	// MM_MemoryPool* _children
	public PointerPointer _childrenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__childrenOffset_));
	}

	// const bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="const bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_MemoryPool.__compressObjectReferencesOffset_);
	}

	// const bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MemoryPool.__compressObjectReferencesOffset_));
	}

	// U64 _darkMatterBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__darkMatterBytesOffset_", declaredType="U64")
	public UDATA _darkMatterBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__darkMatterBytesOffset_));
	}

	// U64 _darkMatterBytes
	public UDATAPointer _darkMatterBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__darkMatterBytesOffset_));
	}

	// U64 _darkMatterSamples
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__darkMatterSamplesOffset_", declaredType="U64")
	public UDATA _darkMatterSamples() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__darkMatterSamplesOffset_));
	}

	// U64 _darkMatterSamples
	public UDATAPointer _darkMatterSamplesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__darkMatterSamplesOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_MemoryPool.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__extensionsOffset_));
	}

	// U64 _freeEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeEntryCountOffset_", declaredType="U64")
	public UDATA _freeEntryCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__freeEntryCountOffset_));
	}

	// U64 _freeEntryCount
	public UDATAPointer _freeEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__freeEntryCountOffset_));
	}

	// U64 _freeMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemorySizeOffset_", declaredType="U64")
	public UDATA _freeMemorySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__freeMemorySizeOffset_));
	}

	// U64 _freeMemorySize
	public UDATAPointer _freeMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__freeMemorySizeOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeObjectAllocateStatsOffset_", declaredType="MM_LargeObjectAllocateStats*")
	public MM_LargeObjectAllocateStatsPointer _largeObjectAllocateStats() throws CorruptDataException {
		return MM_LargeObjectAllocateStatsPointer.cast(getPointerAtOffset(MM_MemoryPool.__largeObjectAllocateStatsOffset_));
	}

	// MM_LargeObjectAllocateStats* _largeObjectAllocateStats
	public PointerPointer _largeObjectAllocateStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__largeObjectAllocateStatsOffset_));
	}

	// volatile U64 _largestFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestFreeEntryOffset_", declaredType="volatile U64")
	public UDATA _largestFreeEntry() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__largestFreeEntryOffset_));
	}

	// volatile U64 _largestFreeEntry
	public UDATAPointer _largestFreeEntryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__largestFreeEntryOffset_));
	}

	// U64 _lastFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastFreeBytesOffset_", declaredType="U64")
	public UDATA _lastFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__lastFreeBytesOffset_));
	}

	// U64 _lastFreeBytes
	public UDATAPointer _lastFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__lastFreeBytesOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemoryPool.__memorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	public PointerPointer _memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__memorySubSpaceOffset_));
	}

	// U64 _minimumFreeEntrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumFreeEntrySizeOffset_", declaredType="U64")
	public UDATA _minimumFreeEntrySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPool.__minimumFreeEntrySizeOffset_));
	}

	// U64 _minimumFreeEntrySize
	public UDATAPointer _minimumFreeEntrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPool.__minimumFreeEntrySizeOffset_));
	}

	// MM_MemoryPool* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _next() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_MemoryPool.__nextOffset_));
	}

	// MM_MemoryPool* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__nextOffset_));
	}

	// MM_MemoryPool* _parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parentOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _parent() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_MemoryPool.__parentOffset_));
	}

	// MM_MemoryPool* _parent
	public PointerPointer _parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__parentOffset_));
	}

	// const U8* _poolName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__poolNameOffset_", declaredType="const U8*")
	public U8Pointer _poolName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_MemoryPool.__poolNameOffset_));
	}

	// const U8* _poolName
	public PointerPointer _poolNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__poolNameOffset_));
	}

	// MM_MemoryPool* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _previous() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_MemoryPool.__previousOffset_));
	}

	// MM_MemoryPool* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPool.__previousOffset_));
	}

}
