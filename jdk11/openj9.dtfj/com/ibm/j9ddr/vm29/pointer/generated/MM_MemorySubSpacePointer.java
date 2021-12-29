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
 * Structure: MM_MemorySubSpacePointer
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
 * The generated code will provide getters for all elements in the MM_MemorySubSpacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemorySubSpace.class)
public class MM_MemorySubSpacePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_MemorySubSpacePointer NULL = new MM_MemorySubSpacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemorySubSpacePointer(long address) {
		super(address);
	}

	public static MM_MemorySubSpacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemorySubSpacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemorySubSpacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemorySubSpacePointer(address);
	}

	public MM_MemorySubSpacePointer add(long count) {
		return MM_MemorySubSpacePointer.cast(address + (MM_MemorySubSpace.SIZEOF * count));
	}

	public MM_MemorySubSpacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemorySubSpacePointer addOffset(long offset) {
		return MM_MemorySubSpacePointer.cast(address + offset);
	}

	public MM_MemorySubSpacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemorySubSpacePointer sub(long count) {
		return MM_MemorySubSpacePointer.cast(address - (MM_MemorySubSpace.SIZEOF * count));
	}

	public MM_MemorySubSpacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemorySubSpacePointer subOffset(long offset) {
		return MM_MemorySubSpacePointer.cast(address - offset);
	}

	public MM_MemorySubSpacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemorySubSpacePointer untag(long mask) {
		return MM_MemorySubSpacePointer.cast(address & ~mask);
	}

	public MM_MemorySubSpacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemorySubSpace.SIZEOF;
	}

	// Implementation methods

	// MM_AllocationFailureStats _allocationFailureStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationFailureStatsOffset_", declaredType="MM_AllocationFailureStats")
	public MM_AllocationFailureStatsPointer _allocationFailureStats() throws CorruptDataException {
		return MM_AllocationFailureStatsPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__allocationFailureStatsOffset_));
	}

	// MM_AllocationFailureStats _allocationFailureStats
	public PointerPointer _allocationFailureStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__allocationFailureStatsOffset_));
	}

	// MM_MemorySubSpace* _children
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__childrenOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _children() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__childrenOffset_));
	}

	// MM_MemorySubSpace* _children
	public PointerPointer _childrenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__childrenOffset_));
	}

	// MM_Collector* _collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorOffset_", declaredType="MM_Collector*")
	public MM_CollectorPointer _collector() throws CorruptDataException {
		return MM_CollectorPointer.cast(getPointerAtOffset(MM_MemorySubSpace.__collectorOffset_));
	}

	// MM_Collector* _collector
	public PointerPointer _collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__collectorOffset_));
	}

	// bool _concurrentCollectable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCollectableOffset_", declaredType="bool")
	public boolean _concurrentCollectable() throws CorruptDataException {
		return getBoolAtOffset(MM_MemorySubSpace.__concurrentCollectableOffset_);
	}

	// bool _concurrentCollectable
	public BoolPointer _concurrentCollectableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__concurrentCollectableOffset_));
	}

	// U64 _contractionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contractionSizeOffset_", declaredType="U64")
	public UDATA _contractionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__contractionSizeOffset_));
	}

	// U64 _contractionSize
	public UDATAPointer _contractionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__contractionSizeOffset_));
	}

	// MM_MemorySubSpace* _counterBalanceChain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__counterBalanceChainOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _counterBalanceChain() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__counterBalanceChainOffset_));
	}

	// MM_MemorySubSpace* _counterBalanceChain
	public PointerPointer _counterBalanceChainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__counterBalanceChainOffset_));
	}

	// MM_MemorySubSpace* _counterBalanceChainHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__counterBalanceChainHeadOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _counterBalanceChainHead() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__counterBalanceChainHeadOffset_));
	}

	// MM_MemorySubSpace* _counterBalanceChainHead
	public PointerPointer _counterBalanceChainHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__counterBalanceChainHeadOffset_));
	}

	// U64 _counterBalanceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__counterBalanceSizeOffset_", declaredType="U64")
	public UDATA _counterBalanceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__counterBalanceSizeOffset_));
	}

	// U64 _counterBalanceSize
	public UDATAPointer _counterBalanceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__counterBalanceSizeOffset_));
	}

	// ModronCounterBalanceType _counterBalanceType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__counterBalanceTypeOffset_", declaredType="ModronCounterBalanceType")
	public long _counterBalanceType() throws CorruptDataException {
		if (ModronCounterBalanceType.SIZEOF == 1) {
			return getByteAtOffset(MM_MemorySubSpace.__counterBalanceTypeOffset_);
		} else if (ModronCounterBalanceType.SIZEOF == 2) {
			return getShortAtOffset(MM_MemorySubSpace.__counterBalanceTypeOffset_);
		} else if (ModronCounterBalanceType.SIZEOF == 4) {
			return getIntAtOffset(MM_MemorySubSpace.__counterBalanceTypeOffset_);
		} else if (ModronCounterBalanceType.SIZEOF == 8) {
			return getLongAtOffset(MM_MemorySubSpace.__counterBalanceTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ModronCounterBalanceType _counterBalanceType
	public EnumPointer _counterBalanceTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__counterBalanceTypeOffset_), ModronCounterBalanceType.class);
	}

	// U64 _currentSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSizeOffset_", declaredType="U64")
	public UDATA _currentSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__currentSizeOffset_));
	}

	// U64 _currentSize
	public UDATAPointer _currentSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__currentSizeOffset_));
	}

	// U64 _expansionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expansionSizeOffset_", declaredType="U64")
	public UDATA _expansionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__expansionSizeOffset_));
	}

	// U64 _expansionSize
	public UDATAPointer _expansionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__expansionSizeOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__extensionsOffset_));
	}

	// U64 _initialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initialSizeOffset_", declaredType="U64")
	public UDATA _initialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__initialSizeOffset_));
	}

	// U64 _initialSize
	public UDATAPointer _initialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__initialSizeOffset_));
	}

	// bool _isAllocatable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isAllocatableOffset_", declaredType="bool")
	public boolean _isAllocatable() throws CorruptDataException {
		return getBoolAtOffset(MM_MemorySubSpace.__isAllocatableOffset_);
	}

	// bool _isAllocatable
	public BoolPointer _isAllocatableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__isAllocatableOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__lockOffset_));
	}

	// U64 _maximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumSizeOffset_", declaredType="U64")
	public UDATA _maximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__maximumSizeOffset_));
	}

	// U64 _maximumSize
	public UDATAPointer _maximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__maximumSizeOffset_));
	}

	// MM_MemorySpace* _memorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySpaceOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _memorySpace() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__memorySpaceOffset_));
	}

	// MM_MemorySpace* _memorySpace
	public PointerPointer _memorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__memorySpaceOffset_));
	}

	// U64 _memoryType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryTypeOffset_", declaredType="U64")
	public UDATA _memoryType() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__memoryTypeOffset_));
	}

	// U64 _memoryType
	public UDATAPointer _memoryTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__memoryTypeOffset_));
	}

	// U64 _minimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumSizeOffset_", declaredType="U64")
	public UDATA _minimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__minimumSizeOffset_));
	}

	// U64 _minimumSize
	public UDATAPointer _minimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__minimumSizeOffset_));
	}

	// MM_MemorySubSpace* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _next() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__nextOffset_));
	}

	// MM_MemorySubSpace* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__nextOffset_));
	}

	// U32 _objectFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectFlagsOffset_", declaredType="U32")
	public UDATA _objectFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_MemorySubSpace.__objectFlagsOffset_));
	}

	// U32 _objectFlags
	public UDATAPointer _objectFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__objectFlagsOffset_));
	}

	// MM_MemorySubSpace* _parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parentOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _parent() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__parentOffset_));
	}

	// MM_MemorySubSpace* _parent
	public PointerPointer _parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__parentOffset_));
	}

	// MM_PhysicalSubArena* _physicalSubArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__physicalSubArenaOffset_", declaredType="MM_PhysicalSubArena*")
	public MM_PhysicalSubArenaPointer _physicalSubArena() throws CorruptDataException {
		return MM_PhysicalSubArenaPointer.cast(getPointerAtOffset(MM_MemorySubSpace.__physicalSubArenaOffset_));
	}

	// MM_PhysicalSubArena* _physicalSubArena
	public PointerPointer _physicalSubArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__physicalSubArenaOffset_));
	}

	// MM_MemorySubSpace* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _previous() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpace.__previousOffset_));
	}

	// MM_MemorySubSpace* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__previousOffset_));
	}

	// MM_HeapRegionDescriptor* _regionList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionListOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _regionList() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_MemorySubSpace.__regionListOffset_));
	}

	// MM_HeapRegionDescriptor* _regionList
	public PointerPointer _regionListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__regionListOffset_));
	}

	// U64 _uniqueID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__uniqueIDOffset_", declaredType="U64")
	public UDATA _uniqueID() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpace.__uniqueIDOffset_));
	}

	// U64 _uniqueID
	public UDATAPointer _uniqueIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__uniqueIDOffset_));
	}

	// bool _usesGlobalCollector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__usesGlobalCollectorOffset_", declaredType="bool")
	public boolean _usesGlobalCollector() throws CorruptDataException {
		return getBoolAtOffset(MM_MemorySubSpace.__usesGlobalCollectorOffset_);
	}

	// bool _usesGlobalCollector
	public BoolPointer _usesGlobalCollectorEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MemorySubSpace.__usesGlobalCollectorOffset_));
	}

}
