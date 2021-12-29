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
 * Structure: MM_CopyForwardCompactGroupPointer
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
 * The generated code will provide getters for all elements in the MM_CopyForwardCompactGroupPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyForwardCompactGroup.class)
public class MM_CopyForwardCompactGroupPointer extends StructurePointer {

	// NULL
	public static final MM_CopyForwardCompactGroupPointer NULL = new MM_CopyForwardCompactGroupPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyForwardCompactGroupPointer(long address) {
		super(address);
	}

	public static MM_CopyForwardCompactGroupPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyForwardCompactGroupPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyForwardCompactGroupPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyForwardCompactGroupPointer(address);
	}

	public MM_CopyForwardCompactGroupPointer add(long count) {
		return MM_CopyForwardCompactGroupPointer.cast(address + (MM_CopyForwardCompactGroup.SIZEOF * count));
	}

	public MM_CopyForwardCompactGroupPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyForwardCompactGroupPointer addOffset(long offset) {
		return MM_CopyForwardCompactGroupPointer.cast(address + offset);
	}

	public MM_CopyForwardCompactGroupPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyForwardCompactGroupPointer sub(long count) {
		return MM_CopyForwardCompactGroupPointer.cast(address - (MM_CopyForwardCompactGroup.SIZEOF * count));
	}

	public MM_CopyForwardCompactGroupPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyForwardCompactGroupPointer subOffset(long offset) {
		return MM_CopyForwardCompactGroupPointer.cast(address - offset);
	}

	public MM_CopyForwardCompactGroupPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyForwardCompactGroupPointer untag(long mask) {
		return MM_CopyForwardCompactGroupPointer.cast(address & ~mask);
	}

	public MM_CopyForwardCompactGroupPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyForwardCompactGroup.SIZEOF;
	}

	// Implementation methods

	// void* _DFCopyAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__DFCopyAllocOffset_", declaredType="void*")
	public VoidPointer _DFCopyAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyForwardCompactGroup.__DFCopyAllocOffset_));
	}

	// void* _DFCopyAlloc
	public PointerPointer _DFCopyAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__DFCopyAllocOffset_));
	}

	// void* _DFCopyBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__DFCopyBaseOffset_", declaredType="void*")
	public VoidPointer _DFCopyBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyForwardCompactGroup.__DFCopyBaseOffset_));
	}

	// void* _DFCopyBase
	public PointerPointer _DFCopyBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__DFCopyBaseOffset_));
	}

	// void* _DFCopyTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__DFCopyTopOffset_", declaredType="void*")
	public VoidPointer _DFCopyTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyForwardCompactGroup.__DFCopyTopOffset_));
	}

	// void* _DFCopyTop
	public PointerPointer _DFCopyTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__DFCopyTopOffset_));
	}

	// U64 _allocationAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationAgeOffset_", declaredType="U64")
	public UDATA _allocationAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyForwardCompactGroup.__allocationAgeOffset_));
	}

	// U64 _allocationAge
	public UDATAPointer _allocationAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__allocationAgeOffset_));
	}

	// MM_CopyScanCacheVLHGC* _copyCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyCacheOffset_", declaredType="MM_CopyScanCacheVLHGC*")
	public MM_CopyScanCacheVLHGCPointer _copyCache() throws CorruptDataException {
		return MM_CopyScanCacheVLHGCPointer.cast(getPointerAtOffset(MM_CopyForwardCompactGroup.__copyCacheOffset_));
	}

	// MM_CopyScanCacheVLHGC* _copyCache
	public PointerPointer _copyCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__copyCacheOffset_));
	}

	// MM_LightweightNonReentrantLock* _copyCacheLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyCacheLockOffset_", declaredType="MM_LightweightNonReentrantLock*")
	public MM_LightweightNonReentrantLockPointer _copyCacheLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(getPointerAtOffset(MM_CopyForwardCompactGroup.__copyCacheLockOffset_));
	}

	// MM_LightweightNonReentrantLock* _copyCacheLock
	public PointerPointer _copyCacheLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__copyCacheLockOffset_));
	}

	// UDATA _discardedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__discardedBytesOffset_", declaredType="UDATA")
	public UDATA _discardedBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__discardedBytesOffset_);
	}

	// UDATA _discardedBytes
	public UDATAPointer _discardedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__discardedBytesOffset_));
	}

	// MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats _edenStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenStatsOffset_", declaredType="MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats")
	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer _edenStats() throws CorruptDataException {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__edenStatsOffset_));
	}

	// MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats _edenStats
	public PointerPointer _edenStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__edenStatsOffset_));
	}

	// UDATA _failedAllocateSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedAllocateSizeOffset_", declaredType="UDATA")
	public UDATA _failedAllocateSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__failedAllocateSizeOffset_);
	}

	// UDATA _failedAllocateSize
	public UDATAPointer _failedAllocateSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__failedAllocateSizeOffset_));
	}

	// UDATA _failedCopiedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedCopiedBytesOffset_", declaredType="UDATA")
	public UDATA _failedCopiedBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__failedCopiedBytesOffset_);
	}

	// UDATA _failedCopiedBytes
	public UDATAPointer _failedCopiedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__failedCopiedBytesOffset_));
	}

	// UDATA _failedCopiedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedCopiedObjectsOffset_", declaredType="UDATA")
	public UDATA _failedCopiedObjects() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__failedCopiedObjectsOffset_);
	}

	// UDATA _failedCopiedObjects
	public UDATAPointer _failedCopiedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__failedCopiedObjectsOffset_));
	}

	// UDATA _freeMemoryMeasured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeMemoryMeasuredOffset_", declaredType="UDATA")
	public UDATA _freeMemoryMeasured() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__freeMemoryMeasuredOffset_);
	}

	// UDATA _freeMemoryMeasured
	public UDATAPointer _freeMemoryMeasuredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__freeMemoryMeasuredOffset_));
	}

	// UDATA _markMapAtomicHeadSlotIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapAtomicHeadSlotIndexOffset_", declaredType="UDATA")
	public UDATA _markMapAtomicHeadSlotIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapAtomicHeadSlotIndexOffset_);
	}

	// UDATA _markMapAtomicHeadSlotIndex
	public UDATAPointer _markMapAtomicHeadSlotIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapAtomicHeadSlotIndexOffset_));
	}

	// UDATA _markMapAtomicTailSlotIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapAtomicTailSlotIndexOffset_", declaredType="UDATA")
	public UDATA _markMapAtomicTailSlotIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapAtomicTailSlotIndexOffset_);
	}

	// UDATA _markMapAtomicTailSlotIndex
	public UDATAPointer _markMapAtomicTailSlotIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapAtomicTailSlotIndexOffset_));
	}

	// UDATA _markMapGMPBitMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapGMPBitMaskOffset_", declaredType="UDATA")
	public UDATA _markMapGMPBitMask() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapGMPBitMaskOffset_);
	}

	// UDATA _markMapGMPBitMask
	public UDATAPointer _markMapGMPBitMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapGMPBitMaskOffset_));
	}

	// UDATA _markMapGMPSlotIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapGMPSlotIndexOffset_", declaredType="UDATA")
	public UDATA _markMapGMPSlotIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapGMPSlotIndexOffset_);
	}

	// UDATA _markMapGMPSlotIndex
	public UDATAPointer _markMapGMPSlotIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapGMPSlotIndexOffset_));
	}

	// UDATA _markMapPGCBitMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapPGCBitMaskOffset_", declaredType="UDATA")
	public UDATA _markMapPGCBitMask() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapPGCBitMaskOffset_);
	}

	// UDATA _markMapPGCBitMask
	public UDATAPointer _markMapPGCBitMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapPGCBitMaskOffset_));
	}

	// UDATA _markMapPGCSlotIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapPGCSlotIndexOffset_", declaredType="UDATA")
	public UDATA _markMapPGCSlotIndex() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup.__markMapPGCSlotIndexOffset_);
	}

	// UDATA _markMapPGCSlotIndex
	public UDATAPointer _markMapPGCSlotIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__markMapPGCSlotIndexOffset_));
	}

	// MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats _nonEdenStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEdenStatsOffset_", declaredType="MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats")
	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer _nonEdenStats() throws CorruptDataException {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__nonEdenStatsOffset_));
	}

	// MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats _nonEdenStats
	public PointerPointer _nonEdenStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup.__nonEdenStatsOffset_));
	}

}
