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
 * Structure: MM_GCExtensionsBasePointer
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
 * The generated code will provide getters for all elements in the MM_GCExtensionsBasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GCExtensionsBase.class)
public class MM_GCExtensionsBasePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_GCExtensionsBasePointer NULL = new MM_GCExtensionsBasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GCExtensionsBasePointer(long address) {
		super(address);
	}

	public static MM_GCExtensionsBasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GCExtensionsBasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GCExtensionsBasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GCExtensionsBasePointer(address);
	}

	public MM_GCExtensionsBasePointer add(long count) {
		return MM_GCExtensionsBasePointer.cast(address + (MM_GCExtensionsBase.SIZEOF * count));
	}

	public MM_GCExtensionsBasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GCExtensionsBasePointer addOffset(long offset) {
		return MM_GCExtensionsBasePointer.cast(address + offset);
	}

	public MM_GCExtensionsBasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GCExtensionsBasePointer sub(long count) {
		return MM_GCExtensionsBasePointer.cast(address - (MM_GCExtensionsBase.SIZEOF * count));
	}

	public MM_GCExtensionsBasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GCExtensionsBasePointer subOffset(long offset) {
		return MM_GCExtensionsBasePointer.cast(address - offset);
	}

	public MM_GCExtensionsBasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GCExtensionsBasePointer untag(long mask) {
		return MM_GCExtensionsBasePointer.cast(address & ~mask);
	}

	public MM_GCExtensionsBasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GCExtensionsBase.SIZEOF;
	}

	// Implementation methods

	// U64 RTC_Frequency
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RTC_FrequencyOffset_", declaredType="U64")
	public UDATA RTC_Frequency() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._RTC_FrequencyOffset_));
	}

	// U64 RTC_Frequency
	public UDATAPointer RTC_FrequencyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._RTC_FrequencyOffset_));
	}

	// volatile BackOutState _backOutState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backOutStateOffset_", declaredType="volatile BackOutState")
	public long _backOutState() throws CorruptDataException {
		if (BackOutState.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase.__backOutStateOffset_);
		} else if (BackOutState.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase.__backOutStateOffset_);
		} else if (BackOutState.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase.__backOutStateOffset_);
		} else if (BackOutState.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase.__backOutStateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// volatile BackOutState _backOutState
	public EnumPointer _backOutStateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__backOutStateOffset_), BackOutState.class);
	}

	// bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__compressObjectReferencesOffset_);
	}

	// bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__compressObjectReferencesOffset_));
	}

	// volatile bool _concurrentGlobalGCInProgress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentGlobalGCInProgressOffset_", declaredType="volatile bool")
	public boolean _concurrentGlobalGCInProgress() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__concurrentGlobalGCInProgressOffset_);
	}

	// volatile bool _concurrentGlobalGCInProgress
	public BoolPointer _concurrentGlobalGCInProgressEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__concurrentGlobalGCInProgressOffset_));
	}

	// bool _forceRandomBackoutsAfterScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceRandomBackoutsAfterScanOffset_", declaredType="bool")
	public boolean _forceRandomBackoutsAfterScan() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__forceRandomBackoutsAfterScanOffset_);
	}

	// bool _forceRandomBackoutsAfterScan
	public BoolPointer _forceRandomBackoutsAfterScanEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__forceRandomBackoutsAfterScanOffset_));
	}

	// U64 _forceRandomBackoutsAfterScanPeriod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceRandomBackoutsAfterScanPeriodOffset_", declaredType="U64")
	public UDATA _forceRandomBackoutsAfterScanPeriod() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase.__forceRandomBackoutsAfterScanPeriodOffset_));
	}

	// U64 _forceRandomBackoutsAfterScanPeriod
	public UDATAPointer _forceRandomBackoutsAfterScanPeriodEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__forceRandomBackoutsAfterScanPeriodOffset_));
	}

	// OMR$GC$Forge _forge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forgeOffset_", declaredType="OMR$GC$Forge")
	public OMR$GC$ForgePointer _forge() throws CorruptDataException {
		return OMR$GC$ForgePointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__forgeOffset_));
	}

	// OMR$GC$Forge _forge
	public PointerPointer _forgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__forgeOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalCollectorOffset_", declaredType="MM_GlobalCollector*")
	public MM_GlobalCollectorPointer _globalCollector() throws CorruptDataException {
		return MM_GlobalCollectorPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__globalCollectorOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	public PointerPointer _globalCollectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__globalCollectorOffset_));
	}

	// void* _guaranteedNurseryEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__guaranteedNurseryEndOffset_", declaredType="void*")
	public VoidPointer _guaranteedNurseryEnd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__guaranteedNurseryEndOffset_));
	}

	// void* _guaranteedNurseryEnd
	public PointerPointer _guaranteedNurseryEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__guaranteedNurseryEndOffset_));
	}

	// void* _guaranteedNurseryStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__guaranteedNurseryStartOffset_", declaredType="void*")
	public VoidPointer _guaranteedNurseryStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__guaranteedNurseryStartOffset_));
	}

	// void* _guaranteedNurseryStart
	public PointerPointer _guaranteedNurseryStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__guaranteedNurseryStartOffset_));
	}

	// bool _holdRandomThreadBeforeHandlingWorkUnit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__holdRandomThreadBeforeHandlingWorkUnitOffset_", declaredType="bool")
	public boolean _holdRandomThreadBeforeHandlingWorkUnit() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__holdRandomThreadBeforeHandlingWorkUnitOffset_);
	}

	// bool _holdRandomThreadBeforeHandlingWorkUnit
	public BoolPointer _holdRandomThreadBeforeHandlingWorkUnitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__holdRandomThreadBeforeHandlingWorkUnitOffset_));
	}

	// U64 _holdRandomThreadBeforeHandlingWorkUnitPeriod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__holdRandomThreadBeforeHandlingWorkUnitPeriodOffset_", declaredType="U64")
	public UDATA _holdRandomThreadBeforeHandlingWorkUnitPeriod() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase.__holdRandomThreadBeforeHandlingWorkUnitPeriodOffset_));
	}

	// U64 _holdRandomThreadBeforeHandlingWorkUnitPeriod
	public UDATAPointer _holdRandomThreadBeforeHandlingWorkUnitPeriodEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__holdRandomThreadBeforeHandlingWorkUnitPeriodOffset_));
	}

	// bool _isMetronomeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isMetronomeGCOffset_", declaredType="bool")
	public boolean _isMetronomeGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__isMetronomeGCOffset_);
	}

	// bool _isMetronomeGC
	public BoolPointer _isMetronomeGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__isMetronomeGCOffset_));
	}

	// bool _isRememberedSetInOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isRememberedSetInOverflowOffset_", declaredType="bool")
	public boolean _isRememberedSetInOverflow() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__isRememberedSetInOverflowOffset_);
	}

	// bool _isRememberedSetInOverflow
	public BoolPointer _isRememberedSetInOverflowEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__isRememberedSetInOverflowOffset_));
	}

	// bool _isSegregatedHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSegregatedHeapOffset_", declaredType="bool")
	public boolean _isSegregatedHeap() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__isSegregatedHeapOffset_);
	}

	// bool _isSegregatedHeap
	public BoolPointer _isSegregatedHeapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__isSegregatedHeapOffset_));
	}

	// bool _isStandardGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isStandardGCOffset_", declaredType="bool")
	public boolean _isStandardGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__isStandardGCOffset_);
	}

	// bool _isStandardGC
	public BoolPointer _isStandardGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__isStandardGCOffset_));
	}

	// bool _isVLHGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isVLHGCOffset_", declaredType="bool")
	public boolean _isVLHGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__isVLHGCOffset_);
	}

	// bool _isVLHGC
	public BoolPointer _isVLHGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__isVLHGCOffset_));
	}

	// bool _lazyCollectorInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lazyCollectorInitOffset_", declaredType="bool")
	public boolean _lazyCollectorInit() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase.__lazyCollectorInitOffset_);
	}

	// bool _lazyCollectorInit
	public BoolPointer _lazyCollectorInitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__lazyCollectorInitOffset_));
	}

	// J9Pool* _lightweightNonReentrantLockPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lightweightNonReentrantLockPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer _lightweightNonReentrantLockPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__lightweightNonReentrantLockPoolOffset_));
	}

	// J9Pool* _lightweightNonReentrantLockPool
	public PointerPointer _lightweightNonReentrantLockPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__lightweightNonReentrantLockPoolOffset_));
	}

	// omrthread_monitor_t _lightweightNonReentrantLockPoolMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lightweightNonReentrantLockPoolMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _lightweightNonReentrantLockPoolMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__lightweightNonReentrantLockPoolMutexOffset_));
	}

	// omrthread_monitor_t _lightweightNonReentrantLockPoolMutex
	public PointerPointer _lightweightNonReentrantLockPoolMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__lightweightNonReentrantLockPoolMutexOffset_));
	}

	// U64 _mainThreadCpuTimeNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadCpuTimeNanosOffset_", declaredType="U64")
	public UDATA _mainThreadCpuTimeNanos() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase.__mainThreadCpuTimeNanosOffset_));
	}

	// U64 _mainThreadCpuTimeNanos
	public UDATAPointer _mainThreadCpuTimeNanosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__mainThreadCpuTimeNanosOffset_));
	}

	// void* _mainThreadTenureTLHRemainderBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadTenureTLHRemainderBaseOffset_", declaredType="void*")
	public VoidPointer _mainThreadTenureTLHRemainderBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__mainThreadTenureTLHRemainderBaseOffset_));
	}

	// void* _mainThreadTenureTLHRemainderBase
	public PointerPointer _mainThreadTenureTLHRemainderBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__mainThreadTenureTLHRemainderBaseOffset_));
	}

	// void* _mainThreadTenureTLHRemainderTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadTenureTLHRemainderTopOffset_", declaredType="void*")
	public VoidPointer _mainThreadTenureTLHRemainderTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__mainThreadTenureTLHRemainderTopOffset_));
	}

	// void* _mainThreadTenureTLHRemainderTop
	public PointerPointer _mainThreadTenureTLHRemainderTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__mainThreadTenureTLHRemainderTopOffset_));
	}

	// MM_NUMAManager _numaManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaManagerOffset_", declaredType="MM_NUMAManager")
	public MM_NUMAManagerPointer _numaManager() throws CorruptDataException {
		return MM_NUMAManagerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__numaManagerOffset_));
	}

	// MM_NUMAManager _numaManager
	public PointerPointer _numaManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__numaManagerOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__omrVMOffset_));
	}

	// void* _tenureBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureBaseOffset_", declaredType="void*")
	public VoidPointer _tenureBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase.__tenureBaseOffset_));
	}

	// void* _tenureBase
	public PointerPointer _tenureBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__tenureBaseOffset_));
	}

	// U64 _tenureSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureSizeOffset_", declaredType="U64")
	public UDATA _tenureSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase.__tenureSizeOffset_));
	}

	// U64 _tenureSize
	public UDATAPointer _tenureSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase.__tenureSizeOffset_));
	}

	// U64 absoluteMinimumNewSubSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_absoluteMinimumNewSubSpaceSizeOffset_", declaredType="U64")
	public UDATA absoluteMinimumNewSubSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._absoluteMinimumNewSubSpaceSizeOffset_));
	}

	// U64 absoluteMinimumNewSubSpaceSize
	public UDATAPointer absoluteMinimumNewSubSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._absoluteMinimumNewSubSpaceSizeOffset_));
	}

	// U64 absoluteMinimumOldSubSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_absoluteMinimumOldSubSpaceSizeOffset_", declaredType="U64")
	public UDATA absoluteMinimumOldSubSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._absoluteMinimumOldSubSpaceSizeOffset_));
	}

	// U64 absoluteMinimumOldSubSpaceSize
	public UDATAPointer absoluteMinimumOldSubSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._absoluteMinimumOldSubSpaceSizeOffset_));
	}

	// bool adaptiveGcCountBetweenHotFieldSort
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptiveGcCountBetweenHotFieldSortOffset_", declaredType="bool")
	public boolean adaptiveGcCountBetweenHotFieldSort() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._adaptiveGcCountBetweenHotFieldSortOffset_);
	}

	// bool adaptiveGcCountBetweenHotFieldSort
	public BoolPointer adaptiveGcCountBetweenHotFieldSortEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._adaptiveGcCountBetweenHotFieldSortOffset_));
	}

	// U64 aggressive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aggressiveOffset_", declaredType="U64")
	public UDATA aggressive() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._aggressiveOffset_));
	}

	// U64 aggressive
	public UDATAPointer aggressiveEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._aggressiveOffset_));
	}

	// double aliasInhibitingThresholdPercentage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aliasInhibitingThresholdPercentageOffset_", declaredType="double")
	public double aliasInhibitingThresholdPercentage() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._aliasInhibitingThresholdPercentageOffset_);
	}

	// double aliasInhibitingThresholdPercentage
	public DoublePointer aliasInhibitingThresholdPercentageEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._aliasInhibitingThresholdPercentageOffset_));
	}

	// U64 allocationCacheIncrementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationCacheIncrementSizeOffset_", declaredType="U64")
	public UDATA allocationCacheIncrementSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationCacheIncrementSizeOffset_));
	}

	// U64 allocationCacheIncrementSize
	public UDATAPointer allocationCacheIncrementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationCacheIncrementSizeOffset_));
	}

	// U64 allocationCacheInitialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationCacheInitialSizeOffset_", declaredType="U64")
	public UDATA allocationCacheInitialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationCacheInitialSizeOffset_));
	}

	// U64 allocationCacheInitialSize
	public UDATAPointer allocationCacheInitialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationCacheInitialSizeOffset_));
	}

	// U64 allocationCacheMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationCacheMaximumSizeOffset_", declaredType="U64")
	public UDATA allocationCacheMaximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationCacheMaximumSizeOffset_));
	}

	// U64 allocationCacheMaximumSize
	public UDATAPointer allocationCacheMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationCacheMaximumSizeOffset_));
	}

	// U64 allocationCacheMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationCacheMinimumSizeOffset_", declaredType="U64")
	public UDATA allocationCacheMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationCacheMinimumSizeOffset_));
	}

	// U64 allocationCacheMinimumSize
	public UDATAPointer allocationCacheMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationCacheMinimumSizeOffset_));
	}

	// U64 allocationIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationIncrementOffset_", declaredType="U64")
	public UDATA allocationIncrement() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationIncrementOffset_));
	}

	// U64 allocationIncrement
	public UDATAPointer allocationIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationIncrementOffset_));
	}

	// bool allocationIncrementSetByUser
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationIncrementSetByUserOffset_", declaredType="bool")
	public boolean allocationIncrementSetByUser() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._allocationIncrementSetByUserOffset_);
	}

	// bool allocationIncrementSetByUser
	public BoolPointer allocationIncrementSetByUserEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationIncrementSetByUserOffset_));
	}

	// MM_AllocationStats allocationStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationStatsOffset_", declaredType="MM_AllocationStats")
	public MM_AllocationStatsPointer allocationStats() throws CorruptDataException {
		return MM_AllocationStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationStatsOffset_));
	}

	// MM_AllocationStats allocationStats
	public PointerPointer allocationStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationStatsOffset_));
	}

	// U64 allocationTrackerFlushThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationTrackerFlushThresholdOffset_", declaredType="U64")
	public UDATA allocationTrackerFlushThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationTrackerFlushThresholdOffset_));
	}

	// U64 allocationTrackerFlushThreshold
	public UDATAPointer allocationTrackerFlushThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationTrackerFlushThresholdOffset_));
	}

	// U64 allocationTrackerMaxThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationTrackerMaxThresholdOffset_", declaredType="U64")
	public UDATA allocationTrackerMaxThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationTrackerMaxThresholdOffset_));
	}

	// U64 allocationTrackerMaxThreshold
	public UDATAPointer allocationTrackerMaxThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationTrackerMaxThresholdOffset_));
	}

	// U64 allocationTrackerMaxTotalError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationTrackerMaxTotalErrorOffset_", declaredType="U64")
	public UDATA allocationTrackerMaxTotalError() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allocationTrackerMaxTotalErrorOffset_));
	}

	// U64 allocationTrackerMaxTotalError
	public UDATAPointer allocationTrackerMaxTotalErrorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allocationTrackerMaxTotalErrorOffset_));
	}

	// U64 allowMergedSpaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allowMergedSpacesOffset_", declaredType="U64")
	public UDATA allowMergedSpaces() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._allowMergedSpacesOffset_));
	}

	// U64 allowMergedSpaces
	public UDATAPointer allowMergedSpacesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allowMergedSpacesOffset_));
	}

	// bool allowPermanantHotFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allowPermanantHotFieldsOffset_", declaredType="bool")
	public boolean allowPermanantHotFields() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._allowPermanantHotFieldsOffset_);
	}

	// bool allowPermanantHotFields
	public BoolPointer allowPermanantHotFieldsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._allowPermanantHotFieldsOffset_));
	}

	// bool alwaysCallReadBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alwaysCallReadBarrierOffset_", declaredType="bool")
	public boolean alwaysCallReadBarrier() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._alwaysCallReadBarrierOffset_);
	}

	// bool alwaysCallReadBarrier
	public BoolPointer alwaysCallReadBarrierEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._alwaysCallReadBarrierOffset_));
	}

	// bool alwaysCallWriteBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alwaysCallWriteBarrierOffset_", declaredType="bool")
	public boolean alwaysCallWriteBarrier() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._alwaysCallWriteBarrierOffset_);
	}

	// bool alwaysCallWriteBarrier
	public BoolPointer alwaysCallWriteBarrierEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._alwaysCallWriteBarrierOffset_));
	}

	// bool alwaysDepthCopyFirstOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alwaysDepthCopyFirstOffsetOffset_", declaredType="bool")
	public boolean alwaysDepthCopyFirstOffset() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._alwaysDepthCopyFirstOffsetOffset_);
	}

	// bool alwaysDepthCopyFirstOffset
	public BoolPointer alwaysDepthCopyFirstOffsetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._alwaysDepthCopyFirstOffsetOffset_));
	}

	// U64 arrayletsPerRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayletsPerRegionOffset_", declaredType="U64")
	public UDATA arrayletsPerRegion() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._arrayletsPerRegionOffset_));
	}

	// U64 arrayletsPerRegion
	public UDATAPointer arrayletsPerRegionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._arrayletsPerRegionOffset_));
	}

	// U64 batchClearTLH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_batchClearTLHOffset_", declaredType="U64")
	public UDATA batchClearTLH() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._batchClearTLHOffset_));
	}

	// U64 batchClearTLH
	public UDATAPointer batchClearTLHEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._batchClearTLHOffset_));
	}

	// U64 beatMicro
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_beatMicroOffset_", declaredType="U64")
	public UDATA beatMicro() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._beatMicroOffset_));
	}

	// U64 beatMicro
	public UDATAPointer beatMicroEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._beatMicroOffset_));
	}

	// bool bufferedLogging
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferedLoggingOffset_", declaredType="bool")
	public boolean bufferedLogging() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._bufferedLoggingOffset_);
	}

	// bool bufferedLogging
	public BoolPointer bufferedLoggingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._bufferedLoggingOffset_));
	}

	// U64 bytesAllocatedMost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesAllocatedMostOffset_", declaredType="U64")
	public UDATA bytesAllocatedMost() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._bytesAllocatedMostOffset_));
	}

	// U64 bytesAllocatedMost
	public UDATAPointer bytesAllocatedMostEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._bytesAllocatedMostOffset_));
	}

	// U64 cacheListSplit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheListSplitOffset_", declaredType="U64")
	public UDATA cacheListSplit() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._cacheListSplitOffset_));
	}

	// U64 cacheListSplit
	public UDATAPointer cacheListSplitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._cacheListSplitOffset_));
	}

	// U64 cardCleanPass2Boost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleanPass2BoostOffset_", declaredType="U64")
	public UDATA cardCleanPass2Boost() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._cardCleanPass2BoostOffset_));
	}

	// U64 cardCleanPass2Boost
	public UDATAPointer cardCleanPass2BoostEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._cardCleanPass2BoostOffset_));
	}

	// U64 cardCleaningPasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardCleaningPassesOffset_", declaredType="U64")
	public UDATA cardCleaningPasses() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._cardCleaningPassesOffset_));
	}

	// U64 cardCleaningPasses
	public UDATAPointer cardCleaningPassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._cardCleaningPassesOffset_));
	}

	// MM_CardTable* cardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardTableOffset_", declaredType="MM_CardTable*")
	public MM_CardTablePointer cardTable() throws CorruptDataException {
		return MM_CardTablePointer.cast(getPointerAtOffset(MM_GCExtensionsBase._cardTableOffset_));
	}

	// MM_CardTable* cardTable
	public PointerPointer cardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._cardTableOffset_));
	}

	// MM_ClassLoaderRememberedSet* classLoaderRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderRememberedSetOffset_", declaredType="MM_ClassLoaderRememberedSet*")
	public MM_ClassLoaderRememberedSetPointer classLoaderRememberedSet() throws CorruptDataException {
		return MM_ClassLoaderRememberedSetPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._classLoaderRememberedSetOffset_));
	}

	// MM_ClassLoaderRememberedSet* classLoaderRememberedSet
	public PointerPointer classLoaderRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._classLoaderRememberedSetOffset_));
	}

	// MM_CollectorLanguageInterface* collectorLanguageInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_collectorLanguageInterfaceOffset_", declaredType="MM_CollectorLanguageInterface*")
	public MM_CollectorLanguageInterfacePointer collectorLanguageInterface() throws CorruptDataException {
		return MM_CollectorLanguageInterfacePointer.cast(getPointerAtOffset(MM_GCExtensionsBase._collectorLanguageInterfaceOffset_));
	}

	// MM_CollectorLanguageInterface* collectorLanguageInterface
	public PointerPointer collectorLanguageInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._collectorLanguageInterfaceOffset_));
	}

	// MM_CompactGroupPersistentStats* compactGroupPersistentStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactGroupPersistentStatsOffset_", declaredType="MM_CompactGroupPersistentStats*")
	public MM_CompactGroupPersistentStatsPointer compactGroupPersistentStats() throws CorruptDataException {
		return MM_CompactGroupPersistentStatsPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._compactGroupPersistentStatsOffset_));
	}

	// MM_CompactGroupPersistentStats* compactGroupPersistentStats
	public PointerPointer compactGroupPersistentStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compactGroupPersistentStatsOffset_));
	}

	// U64 compactOnGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactOnGlobalGCOffset_", declaredType="U64")
	public UDATA compactOnGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._compactOnGlobalGCOffset_));
	}

	// U64 compactOnGlobalGC
	public UDATAPointer compactOnGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compactOnGlobalGCOffset_));
	}

	// bool compactOnIdle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactOnIdleOffset_", declaredType="bool")
	public boolean compactOnIdle() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._compactOnIdleOffset_);
	}

	// bool compactOnIdle
	public BoolPointer compactOnIdleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compactOnIdleOffset_));
	}

	// U64 compactOnSystemGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactOnSystemGCOffset_", declaredType="U64")
	public UDATA compactOnSystemGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._compactOnSystemGCOffset_));
	}

	// U64 compactOnSystemGC
	public UDATAPointer compactOnSystemGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compactOnSystemGCOffset_));
	}

	// bool compactToSatisfyAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactToSatisfyAllocateOffset_", declaredType="bool")
	public boolean compactToSatisfyAllocate() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._compactToSatisfyAllocateOffset_);
	}

	// bool compactToSatisfyAllocate
	public BoolPointer compactToSatisfyAllocateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compactToSatisfyAllocateOffset_));
	}

	// MM_CompressedCardTable* compressedCardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressedCardTableOffset_", declaredType="MM_CompressedCardTable*")
	public MM_CompressedCardTablePointer compressedCardTable() throws CorruptDataException {
		return MM_CompressedCardTablePointer.cast(getPointerAtOffset(MM_GCExtensionsBase._compressedCardTableOffset_));
	}

	// MM_CompressedCardTable* compressedCardTable
	public PointerPointer compressedCardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._compressedCardTableOffset_));
	}

	// U64 concurrentBackground
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentBackgroundOffset_", declaredType="U64")
	public UDATA concurrentBackground() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentBackgroundOffset_));
	}

	// U64 concurrentBackground
	public UDATAPointer concurrentBackgroundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentBackgroundOffset_));
	}

	// bool concurrentKickoffEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentKickoffEnabledOffset_", declaredType="bool")
	public boolean concurrentKickoffEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentKickoffEnabledOffset_);
	}

	// bool concurrentKickoffEnabled
	public BoolPointer concurrentKickoffEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentKickoffEnabledOffset_));
	}

	// float concurrentKickoffTenuringHeadroom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentKickoffTenuringHeadroomOffset_", declaredType="float")
	public float concurrentKickoffTenuringHeadroom() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._concurrentKickoffTenuringHeadroomOffset_);
	}

	// float concurrentKickoffTenuringHeadroom
	public FloatPointer concurrentKickoffTenuringHeadroomEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentKickoffTenuringHeadroomOffset_));
	}

	// U64 concurrentLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentLevelOffset_", declaredType="U64")
	public UDATA concurrentLevel() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentLevelOffset_));
	}

	// U64 concurrentLevel
	public UDATAPointer concurrentLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentLevelOffset_));
	}

	// bool concurrentMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentMarkOffset_", declaredType="bool")
	public boolean concurrentMark() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentMarkOffset_);
	}

	// bool concurrentMark
	public BoolPointer concurrentMarkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentMarkOffset_));
	}

	// ConcurrentMetering concurrentMetering
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentMeteringOffset_", declaredType="ConcurrentMetering")
	public long concurrentMetering() throws CorruptDataException {
		if (MM_GCExtensionsBase$ConcurrentMetering.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._concurrentMeteringOffset_);
		} else if (MM_GCExtensionsBase$ConcurrentMetering.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._concurrentMeteringOffset_);
		} else if (MM_GCExtensionsBase$ConcurrentMetering.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._concurrentMeteringOffset_);
		} else if (MM_GCExtensionsBase$ConcurrentMetering.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._concurrentMeteringOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ConcurrentMetering concurrentMetering
	public EnumPointer concurrentMeteringEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentMeteringOffset_), MM_GCExtensionsBase$ConcurrentMetering.class);
	}

	// bool concurrentScavengeExhaustiveTermination
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengeExhaustiveTerminationOffset_", declaredType="bool")
	public boolean concurrentScavengeExhaustiveTermination() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentScavengeExhaustiveTerminationOffset_);
	}

	// bool concurrentScavengeExhaustiveTermination
	public BoolPointer concurrentScavengeExhaustiveTerminationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengeExhaustiveTerminationOffset_));
	}

	// bool concurrentScavenger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerOffset_", declaredType="bool")
	public boolean concurrentScavenger() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentScavengerOffset_);
	}

	// bool concurrentScavenger
	public BoolPointer concurrentScavengerEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerOffset_));
	}

	// float concurrentScavengerAllocDeviationBoost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerAllocDeviationBoostOffset_", declaredType="float")
	public float concurrentScavengerAllocDeviationBoost() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._concurrentScavengerAllocDeviationBoostOffset_);
	}

	// float concurrentScavengerAllocDeviationBoost
	public FloatPointer concurrentScavengerAllocDeviationBoostEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerAllocDeviationBoostOffset_));
	}

	// U64 concurrentScavengerBackgroundThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerBackgroundThreadsOffset_", declaredType="U64")
	public UDATA concurrentScavengerBackgroundThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentScavengerBackgroundThreadsOffset_));
	}

	// U64 concurrentScavengerBackgroundThreads
	public UDATAPointer concurrentScavengerBackgroundThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerBackgroundThreadsOffset_));
	}

	// bool concurrentScavengerBackgroundThreadsForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerBackgroundThreadsForcedOffset_", declaredType="bool")
	public boolean concurrentScavengerBackgroundThreadsForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentScavengerBackgroundThreadsForcedOffset_);
	}

	// bool concurrentScavengerBackgroundThreadsForced
	public BoolPointer concurrentScavengerBackgroundThreadsForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerBackgroundThreadsForcedOffset_));
	}

	// bool concurrentScavengerForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerForcedOffset_", declaredType="bool")
	public boolean concurrentScavengerForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentScavengerForcedOffset_);
	}

	// bool concurrentScavengerForced
	public BoolPointer concurrentScavengerForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerForcedOffset_));
	}

	// bool concurrentScavengerHWSupport
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerHWSupportOffset_", declaredType="bool")
	public boolean concurrentScavengerHWSupport() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentScavengerHWSupportOffset_);
	}

	// bool concurrentScavengerHWSupport
	public BoolPointer concurrentScavengerHWSupportEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerHWSupportOffset_));
	}

	// U64 concurrentScavengerPageSectionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerPageSectionSizeOffset_", declaredType="U64")
	public UDATA concurrentScavengerPageSectionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentScavengerPageSectionSizeOffset_));
	}

	// U64 concurrentScavengerPageSectionSize
	public UDATAPointer concurrentScavengerPageSectionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerPageSectionSizeOffset_));
	}

	// void* concurrentScavengerPageStartAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerPageStartAddressOffset_", declaredType="void*")
	public VoidPointer concurrentScavengerPageStartAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._concurrentScavengerPageStartAddressOffset_));
	}

	// void* concurrentScavengerPageStartAddress
	public PointerPointer concurrentScavengerPageStartAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerPageStartAddressOffset_));
	}

	// U64 concurrentScavengerSlack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentScavengerSlackOffset_", declaredType="U64")
	public UDATA concurrentScavengerSlack() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentScavengerSlackOffset_));
	}

	// U64 concurrentScavengerSlack
	public UDATAPointer concurrentScavengerSlackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentScavengerSlackOffset_));
	}

	// U64 concurrentSlack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentSlackOffset_", declaredType="U64")
	public UDATA concurrentSlack() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._concurrentSlackOffset_));
	}

	// U64 concurrentSlack
	public UDATAPointer concurrentSlackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentSlackOffset_));
	}

	// double concurrentSlackFragmentationAdjustmentWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentSlackFragmentationAdjustmentWeightOffset_", declaredType="double")
	public double concurrentSlackFragmentationAdjustmentWeight() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._concurrentSlackFragmentationAdjustmentWeightOffset_);
	}

	// double concurrentSlackFragmentationAdjustmentWeight
	public DoublePointer concurrentSlackFragmentationAdjustmentWeightEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentSlackFragmentationAdjustmentWeightOffset_));
	}

	// bool concurrentSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentSweepOffset_", declaredType="bool")
	public boolean concurrentSweep() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentSweepOffset_);
	}

	// bool concurrentSweep
	public BoolPointer concurrentSweepEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentSweepOffset_));
	}

	// bool concurrentSweepingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentSweepingEnabledOffset_", declaredType="bool")
	public boolean concurrentSweepingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentSweepingEnabledOffset_);
	}

	// bool concurrentSweepingEnabled
	public BoolPointer concurrentSweepingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentSweepingEnabledOffset_));
	}

	// bool concurrentTracingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentTracingEnabledOffset_", declaredType="bool")
	public boolean concurrentTracingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._concurrentTracingEnabledOffset_);
	}

	// bool concurrentTracingEnabled
	public BoolPointer concurrentTracingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._concurrentTracingEnabledOffset_));
	}

	// MM_Configuration* configuration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configurationOffset_", declaredType="MM_Configuration*")
	public MM_ConfigurationPointer configuration() throws CorruptDataException {
		return MM_ConfigurationPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._configurationOffset_));
	}

	// MM_Configuration* configuration
	public PointerPointer configurationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._configurationOffset_));
	}

	// MM_ConfigurationOptions configurationOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configurationOptionsOffset_", declaredType="MM_ConfigurationOptions")
	public MM_ConfigurationOptionsPointer configurationOptions() throws CorruptDataException {
		return MM_ConfigurationOptionsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._configurationOptionsOffset_));
	}

	// MM_ConfigurationOptions configurationOptions
	public PointerPointer configurationOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._configurationOptionsOffset_));
	}

	// MM_ScavengerCopyScanRatio copyScanRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copyScanRatioOffset_", declaredType="MM_ScavengerCopyScanRatio")
	public MM_ScavengerCopyScanRatioPointer copyScanRatio() throws CorruptDataException {
		return MM_ScavengerCopyScanRatioPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._copyScanRatioOffset_));
	}

	// MM_ScavengerCopyScanRatio copyScanRatio
	public PointerPointer copyScanRatioEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._copyScanRatioOffset_));
	}

	// U64 currentEnvironmentCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentEnvironmentCountOffset_", declaredType="U64")
	public UDATA currentEnvironmentCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._currentEnvironmentCountOffset_));
	}

	// U64 currentEnvironmentCount
	public UDATAPointer currentEnvironmentCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._currentEnvironmentCountOffset_));
	}

	// float darkMatterCompactThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_darkMatterCompactThresholdOffset_", declaredType="float")
	public float darkMatterCompactThreshold() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._darkMatterCompactThresholdOffset_);
	}

	// float darkMatterCompactThreshold
	public FloatPointer darkMatterCompactThresholdEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._darkMatterCompactThresholdOffset_));
	}

	// U64 darkMatterSampleRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_darkMatterSampleRateOffset_", declaredType="U64")
	public UDATA darkMatterSampleRate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._darkMatterSampleRateOffset_));
	}

	// U64 darkMatterSampleRate
	public UDATAPointer darkMatterSampleRateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._darkMatterSampleRateOffset_));
	}

	// U64 debug
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugOffset_", declaredType="U64")
	public UDATA debug() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._debugOffset_));
	}

	// U64 debug
	public UDATAPointer debugEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugOffset_));
	}

	// bool debugConcurrentMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugConcurrentMarkOffset_", declaredType="bool")
	public boolean debugConcurrentMark() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugConcurrentMarkOffset_);
	}

	// bool debugConcurrentMark
	public BoolPointer debugConcurrentMarkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugConcurrentMarkOffset_));
	}

	// bool debugConcurrentScavengerPageAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugConcurrentScavengerPageAlignmentOffset_", declaredType="bool")
	public boolean debugConcurrentScavengerPageAlignment() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugConcurrentScavengerPageAlignmentOffset_);
	}

	// bool debugConcurrentScavengerPageAlignment
	public BoolPointer debugConcurrentScavengerPageAlignmentEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugConcurrentScavengerPageAlignmentOffset_));
	}

	// bool debugDynamicNewSpaceSizing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugDynamicNewSpaceSizingOffset_", declaredType="bool")
	public boolean debugDynamicNewSpaceSizing() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugDynamicNewSpaceSizingOffset_);
	}

	// bool debugDynamicNewSpaceSizing
	public BoolPointer debugDynamicNewSpaceSizingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugDynamicNewSpaceSizingOffset_));
	}

	// bool debugLOAAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugLOAAllocateOffset_", declaredType="bool")
	public boolean debugLOAAllocate() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugLOAAllocateOffset_);
	}

	// bool debugLOAAllocate
	public BoolPointer debugLOAAllocateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugLOAAllocateOffset_));
	}

	// bool debugLOAFreelist
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugLOAFreelistOffset_", declaredType="bool")
	public boolean debugLOAFreelist() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugLOAFreelistOffset_);
	}

	// bool debugLOAFreelist
	public BoolPointer debugLOAFreelistEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugLOAFreelistOffset_));
	}

	// bool debugTiltedScavenge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugTiltedScavengeOffset_", declaredType="bool")
	public boolean debugTiltedScavenge() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._debugTiltedScavengeOffset_);
	}

	// bool debugTiltedScavenge
	public BoolPointer debugTiltedScavengeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugTiltedScavengeOffset_));
	}

	// U64 debugWriteBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugWriteBarrierOffset_", declaredType="U64")
	public UDATA debugWriteBarrier() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._debugWriteBarrierOffset_));
	}

	// U64 debugWriteBarrier
	public UDATAPointer debugWriteBarrierEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._debugWriteBarrierOffset_));
	}

	// MM_SizeClasses* defaultSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultSizeClassesOffset_", declaredType="MM_SizeClasses*")
	public MM_SizeClassesPointer defaultSizeClasses() throws CorruptDataException {
		return MM_SizeClassesPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._defaultSizeClassesOffset_));
	}

	// MM_SizeClasses* defaultSizeClasses
	public PointerPointer defaultSizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._defaultSizeClassesOffset_));
	}

	// U64 depthCopyMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_depthCopyMaxOffset_", declaredType="U64")
	public UDATA depthCopyMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._depthCopyMaxOffset_));
	}

	// U64 depthCopyMax
	public UDATAPointer depthCopyMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._depthCopyMaxOffset_));
	}

	// bool depthCopyThreePaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_depthCopyThreePathsOffset_", declaredType="bool")
	public boolean depthCopyThreePaths() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._depthCopyThreePathsOffset_);
	}

	// bool depthCopyThreePaths
	public BoolPointer depthCopyThreePathsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._depthCopyThreePathsOffset_));
	}

	// bool depthCopyTwoPaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_depthCopyTwoPathsOffset_", declaredType="bool")
	public boolean depthCopyTwoPaths() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._depthCopyTwoPathsOffset_);
	}

	// bool depthCopyTwoPaths
	public BoolPointer depthCopyTwoPathsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._depthCopyTwoPathsOffset_));
	}

	// bool didGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_didGlobalGCOffset_", declaredType="bool")
	public boolean didGlobalGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._didGlobalGCOffset_);
	}

	// bool didGlobalGC
	public BoolPointer didGlobalGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._didGlobalGCOffset_));
	}

	// bool disableExplicitGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_disableExplicitGCOffset_", declaredType="bool")
	public boolean disableExplicitGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._disableExplicitGCOffset_);
	}

	// bool disableExplicitGC
	public BoolPointer disableExplicitGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._disableExplicitGCOffset_));
	}

	// bool disableInlineAllocationForSamplingBytesGranularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_disableInlineAllocationForSamplingBytesGranularityOffset_", declaredType="bool")
	public boolean disableInlineAllocationForSamplingBytesGranularity() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._disableInlineAllocationForSamplingBytesGranularityOffset_);
	}

	// bool disableInlineAllocationForSamplingBytesGranularity
	public BoolPointer disableInlineAllocationForSamplingBytesGranularityEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._disableInlineAllocationForSamplingBytesGranularityOffset_));
	}

	// bool disableInlineCacheForAllocationThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_disableInlineCacheForAllocationThresholdOffset_", declaredType="bool")
	public boolean disableInlineCacheForAllocationThreshold() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._disableInlineCacheForAllocationThresholdOffset_);
	}

	// bool disableInlineCacheForAllocationThreshold
	public BoolPointer disableInlineCacheForAllocationThresholdEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._disableInlineCacheForAllocationThresholdOffset_));
	}

	// MM_ParallelDispatcher* dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._dispatcherOffset_));
	}

	// MM_ParallelDispatcher* dispatcher
	public PointerPointer dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dispatcherOffset_));
	}

	// U64 dispatcherHybridNotifyThreadBound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dispatcherHybridNotifyThreadBoundOffset_", declaredType="U64")
	public UDATA dispatcherHybridNotifyThreadBound() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._dispatcherHybridNotifyThreadBoundOffset_));
	}

	// U64 dispatcherHybridNotifyThreadBound
	public UDATAPointer dispatcherHybridNotifyThreadBoundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dispatcherHybridNotifyThreadBoundOffset_));
	}

	// U32 distanceToYieldTimeCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_distanceToYieldTimeCheckOffset_", declaredType="U32")
	public UDATA distanceToYieldTimeCheck() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._distanceToYieldTimeCheckOffset_));
	}

	// U32 distanceToYieldTimeCheck
	public UDATAPointer distanceToYieldTimeCheckEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._distanceToYieldTimeCheckOffset_));
	}

	// bool dnssAvoidMovingObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssAvoidMovingObjectsOffset_", declaredType="bool")
	public boolean dnssAvoidMovingObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._dnssAvoidMovingObjectsOffset_);
	}

	// bool dnssAvoidMovingObjects
	public BoolPointer dnssAvoidMovingObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssAvoidMovingObjectsOffset_));
	}

	// double dnssExpectedTimeRatioMaximum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssExpectedTimeRatioMaximumOffset_", declaredType="double")
	public double dnssExpectedTimeRatioMaximum() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssExpectedTimeRatioMaximumOffset_);
	}

	// double dnssExpectedTimeRatioMaximum
	public DoublePointer dnssExpectedTimeRatioMaximumEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssExpectedTimeRatioMaximumOffset_));
	}

	// double dnssExpectedTimeRatioMinimum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssExpectedTimeRatioMinimumOffset_", declaredType="double")
	public double dnssExpectedTimeRatioMinimum() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssExpectedTimeRatioMinimumOffset_);
	}

	// double dnssExpectedTimeRatioMinimum
	public DoublePointer dnssExpectedTimeRatioMinimumEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssExpectedTimeRatioMinimumOffset_));
	}

	// double dnssMaximumContraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssMaximumContractionOffset_", declaredType="double")
	public double dnssMaximumContraction() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssMaximumContractionOffset_);
	}

	// double dnssMaximumContraction
	public DoublePointer dnssMaximumContractionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssMaximumContractionOffset_));
	}

	// double dnssMaximumExpansion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssMaximumExpansionOffset_", declaredType="double")
	public double dnssMaximumExpansion() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssMaximumExpansionOffset_);
	}

	// double dnssMaximumExpansion
	public DoublePointer dnssMaximumExpansionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssMaximumExpansionOffset_));
	}

	// double dnssMinimumContraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssMinimumContractionOffset_", declaredType="double")
	public double dnssMinimumContraction() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssMinimumContractionOffset_);
	}

	// double dnssMinimumContraction
	public DoublePointer dnssMinimumContractionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssMinimumContractionOffset_));
	}

	// double dnssMinimumExpansion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssMinimumExpansionOffset_", declaredType="double")
	public double dnssMinimumExpansion() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssMinimumExpansionOffset_);
	}

	// double dnssMinimumExpansion
	public DoublePointer dnssMinimumExpansionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssMinimumExpansionOffset_));
	}

	// double dnssWeightedTimeRatioFactorDecrease
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssWeightedTimeRatioFactorDecreaseOffset_", declaredType="double")
	public double dnssWeightedTimeRatioFactorDecrease() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorDecreaseOffset_);
	}

	// double dnssWeightedTimeRatioFactorDecrease
	public DoublePointer dnssWeightedTimeRatioFactorDecreaseEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorDecreaseOffset_));
	}

	// double dnssWeightedTimeRatioFactorIncreaseLarge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssWeightedTimeRatioFactorIncreaseLargeOffset_", declaredType="double")
	public double dnssWeightedTimeRatioFactorIncreaseLarge() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseLargeOffset_);
	}

	// double dnssWeightedTimeRatioFactorIncreaseLarge
	public DoublePointer dnssWeightedTimeRatioFactorIncreaseLargeEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseLargeOffset_));
	}

	// double dnssWeightedTimeRatioFactorIncreaseMedium
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssWeightedTimeRatioFactorIncreaseMediumOffset_", declaredType="double")
	public double dnssWeightedTimeRatioFactorIncreaseMedium() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseMediumOffset_);
	}

	// double dnssWeightedTimeRatioFactorIncreaseMedium
	public DoublePointer dnssWeightedTimeRatioFactorIncreaseMediumEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseMediumOffset_));
	}

	// double dnssWeightedTimeRatioFactorIncreaseSmall
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dnssWeightedTimeRatioFactorIncreaseSmallOffset_", declaredType="double")
	public double dnssWeightedTimeRatioFactorIncreaseSmall() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseSmallOffset_);
	}

	// double dnssWeightedTimeRatioFactorIncreaseSmall
	public DoublePointer dnssWeightedTimeRatioFactorIncreaseSmallEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dnssWeightedTimeRatioFactorIncreaseSmallOffset_));
	}

	// bool doFrequentObjectAllocationSampling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doFrequentObjectAllocationSamplingOffset_", declaredType="bool")
	public boolean doFrequentObjectAllocationSampling() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._doFrequentObjectAllocationSamplingOffset_);
	}

	// bool doFrequentObjectAllocationSampling
	public BoolPointer doFrequentObjectAllocationSamplingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._doFrequentObjectAllocationSamplingOffset_));
	}

	// bool doOutOfLineAllocationTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doOutOfLineAllocationTraceOffset_", declaredType="bool")
	public boolean doOutOfLineAllocationTrace() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._doOutOfLineAllocationTraceOffset_);
	}

	// bool doOutOfLineAllocationTrace
	public BoolPointer doOutOfLineAllocationTraceEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._doOutOfLineAllocationTraceOffset_));
	}

	// bool dynamicNewSpaceSizing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicNewSpaceSizingOffset_", declaredType="bool")
	public boolean dynamicNewSpaceSizing() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._dynamicNewSpaceSizingOffset_);
	}

	// bool dynamicNewSpaceSizing
	public BoolPointer dynamicNewSpaceSizingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._dynamicNewSpaceSizingOffset_));
	}

	// bool enableHybridMemoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enableHybridMemoryPoolOffset_", declaredType="bool")
	public boolean enableHybridMemoryPool() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._enableHybridMemoryPoolOffset_);
	}

	// bool enableHybridMemoryPool
	public BoolPointer enableHybridMemoryPoolEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._enableHybridMemoryPoolOffset_));
	}

	// bool enableSplitHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enableSplitHeapOffset_", declaredType="bool")
	public boolean enableSplitHeap() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._enableSplitHeapOffset_);
	}

	// bool enableSplitHeap
	public BoolPointer enableSplitHeapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._enableSplitHeapOffset_));
	}

	// J9Pool* environments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentsOffset_", declaredType="J9Pool*")
	public J9PoolPointer environments() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._environmentsOffset_));
	}

	// J9Pool* environments
	public PointerPointer environmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._environmentsOffset_));
	}

	// U32 estimateFragmentation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_estimateFragmentationOffset_", declaredType="U32")
	public UDATA estimateFragmentation() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._estimateFragmentationOffset_));
	}

	// U32 estimateFragmentation
	public UDATAPointer estimateFragmentationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._estimateFragmentationOffset_));
	}

	// MM_UserSpecifiedParameterBool excessiveGCEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCEnabledOffset_", declaredType="MM_UserSpecifiedParameterBool")
	public MM_UserSpecifiedParameterBoolPointer excessiveGCEnabled() throws CorruptDataException {
		return MM_UserSpecifiedParameterBoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCEnabledOffset_));
	}

	// MM_UserSpecifiedParameterBool excessiveGCEnabled
	public PointerPointer excessiveGCEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCEnabledOffset_));
	}

	// float excessiveGCFreeSizeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCFreeSizeRatioOffset_", declaredType="float")
	public float excessiveGCFreeSizeRatio() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._excessiveGCFreeSizeRatioOffset_);
	}

	// float excessiveGCFreeSizeRatio
	public FloatPointer excessiveGCFreeSizeRatioEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCFreeSizeRatioOffset_));
	}

	// ExcessiveLevel excessiveGCLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCLevelOffset_", declaredType="ExcessiveLevel")
	public long excessiveGCLevel() throws CorruptDataException {
		if (ExcessiveLevel.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._excessiveGCLevelOffset_);
		} else if (ExcessiveLevel.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._excessiveGCLevelOffset_);
		} else if (ExcessiveLevel.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._excessiveGCLevelOffset_);
		} else if (ExcessiveLevel.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._excessiveGCLevelOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ExcessiveLevel excessiveGCLevel
	public EnumPointer excessiveGCLevelEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCLevelOffset_), ExcessiveLevel.class);
	}

	// MM_ExcessiveGCStats excessiveGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCStatsOffset_", declaredType="MM_ExcessiveGCStats")
	public MM_ExcessiveGCStatsPointer excessiveGCStats() throws CorruptDataException {
		return MM_ExcessiveGCStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCStatsOffset_));
	}

	// MM_ExcessiveGCStats excessiveGCStats
	public PointerPointer excessiveGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCStatsOffset_));
	}

	// float excessiveGCnewRatioWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCnewRatioWeightOffset_", declaredType="float")
	public float excessiveGCnewRatioWeight() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._excessiveGCnewRatioWeightOffset_);
	}

	// float excessiveGCnewRatioWeight
	public FloatPointer excessiveGCnewRatioWeightEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCnewRatioWeightOffset_));
	}

	// U64 excessiveGCratio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCratioOffset_", declaredType="U64")
	public UDATA excessiveGCratio() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._excessiveGCratioOffset_));
	}

	// U64 excessiveGCratio
	public UDATAPointer excessiveGCratioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._excessiveGCratioOffset_));
	}

	// bool extraYield
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraYieldOffset_", declaredType="bool")
	public boolean extraYield() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._extraYieldOffset_);
	}

	// bool extraYield
	public BoolPointer extraYieldEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._extraYieldOffset_));
	}

	// bool fixHeapForWalk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fixHeapForWalkOffset_", declaredType="bool")
	public boolean fixHeapForWalk() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fixHeapForWalkOffset_);
	}

	// bool fixHeapForWalk
	public BoolPointer fixHeapForWalkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fixHeapForWalkOffset_));
	}

	// U64 fixedAllocationIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fixedAllocationIncrementOffset_", declaredType="U64")
	public UDATA fixedAllocationIncrement() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fixedAllocationIncrementOffset_));
	}

	// U64 fixedAllocationIncrement
	public UDATAPointer fixedAllocationIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fixedAllocationIncrementOffset_));
	}

	// U64 forcedShiftingCompressionAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_forcedShiftingCompressionAmountOffset_", declaredType="U64")
	public UDATA forcedShiftingCompressionAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._forcedShiftingCompressionAmountOffset_));
	}

	// U64 forcedShiftingCompressionAmount
	public UDATAPointer forcedShiftingCompressionAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._forcedShiftingCompressionAmountOffset_));
	}

	// MM_FreeEntrySizeClassStats freeEntrySizeClassStatsSimulated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeEntrySizeClassStatsSimulatedOffset_", declaredType="MM_FreeEntrySizeClassStats")
	public MM_FreeEntrySizeClassStatsPointer freeEntrySizeClassStatsSimulated() throws CorruptDataException {
		return MM_FreeEntrySizeClassStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._freeEntrySizeClassStatsSimulatedOffset_));
	}

	// MM_FreeEntrySizeClassStats freeEntrySizeClassStatsSimulated
	public PointerPointer freeEntrySizeClassStatsSimulatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._freeEntrySizeClassStatsSimulatedOffset_));
	}

	// U64 freeMemoryProfileMaxSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeMemoryProfileMaxSizeClassesOffset_", declaredType="U64")
	public UDATA freeMemoryProfileMaxSizeClasses() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._freeMemoryProfileMaxSizeClassesOffset_));
	}

	// U64 freeMemoryProfileMaxSizeClasses
	public UDATAPointer freeMemoryProfileMaxSizeClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._freeMemoryProfileMaxSizeClassesOffset_));
	}

	// U64 freeOldHeapSizeOnLastGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeOldHeapSizeOnLastGlobalGCOffset_", declaredType="U64")
	public UDATA freeOldHeapSizeOnLastGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._freeOldHeapSizeOnLastGlobalGCOffset_));
	}

	// U64 freeOldHeapSizeOnLastGlobalGC
	public UDATAPointer freeOldHeapSizeOnLastGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._freeOldHeapSizeOnLastGlobalGCOffset_));
	}

	// U32 frequentObjectAllocationSamplingDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frequentObjectAllocationSamplingDepthOffset_", declaredType="U32")
	public UDATA frequentObjectAllocationSamplingDepth() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._frequentObjectAllocationSamplingDepthOffset_));
	}

	// U32 frequentObjectAllocationSamplingDepth
	public UDATAPointer frequentObjectAllocationSamplingDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._frequentObjectAllocationSamplingDepthOffset_));
	}

	// U64 frequentObjectAllocationSamplingRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frequentObjectAllocationSamplingRateOffset_", declaredType="U64")
	public UDATA frequentObjectAllocationSamplingRate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._frequentObjectAllocationSamplingRateOffset_));
	}

	// U64 frequentObjectAllocationSamplingRate
	public UDATAPointer frequentObjectAllocationSamplingRateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._frequentObjectAllocationSamplingRateOffset_));
	}

	// MM_FrequentObjectsStats* frequentObjectsStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frequentObjectsStatsOffset_", declaredType="MM_FrequentObjectsStats*")
	public MM_FrequentObjectsStatsPointer frequentObjectsStats() throws CorruptDataException {
		return MM_FrequentObjectsStatsPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._frequentObjectsStatsOffset_));
	}

	// MM_FrequentObjectsStats* frequentObjectsStats
	public PointerPointer frequentObjectsStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._frequentObjectsStatsOffset_));
	}

	// bool fvtest_alwaysApplyOverflowRounding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_alwaysApplyOverflowRoundingOffset_", declaredType="bool")
	public boolean fvtest_alwaysApplyOverflowRounding() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_alwaysApplyOverflowRoundingOffset_);
	}

	// bool fvtest_alwaysApplyOverflowRounding
	public BoolPointer fvtest_alwaysApplyOverflowRoundingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_alwaysApplyOverflowRoundingOffset_));
	}

	// U64 fvtest_backoutCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_backoutCounterOffset_", declaredType="U64")
	public UDATA fvtest_backoutCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_backoutCounterOffset_));
	}

	// U64 fvtest_backoutCounter
	public UDATAPointer fvtest_backoutCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_backoutCounterOffset_));
	}

	// UDATA fvtest_concurrentCardTablePreparationDelay
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_concurrentCardTablePreparationDelayOffset_", declaredType="UDATA")
	public UDATA fvtest_concurrentCardTablePreparationDelay() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_concurrentCardTablePreparationDelayOffset_);
	}

	// UDATA fvtest_concurrentCardTablePreparationDelay
	public UDATAPointer fvtest_concurrentCardTablePreparationDelayEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_concurrentCardTablePreparationDelayOffset_));
	}

	// bool fvtest_disableExplictMainThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_disableExplictMainThreadOffset_", declaredType="bool")
	public boolean fvtest_disableExplictMainThread() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_disableExplictMainThreadOffset_);
	}

	// bool fvtest_disableExplictMainThread
	public BoolPointer fvtest_disableExplictMainThreadEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_disableExplictMainThreadOffset_));
	}

	// bool fvtest_disableInlineAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_disableInlineAllocationOffset_", declaredType="bool")
	public boolean fvtest_disableInlineAllocation() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_disableInlineAllocationOffset_);
	}

	// bool fvtest_disableInlineAllocation
	public BoolPointer fvtest_disableInlineAllocationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_disableInlineAllocationOffset_));
	}

	// U64 fvtest_enableClassStaticsReadBarrierVerification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_enableClassStaticsReadBarrierVerificationOffset_", declaredType="U64")
	public UDATA fvtest_enableClassStaticsReadBarrierVerification() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_enableClassStaticsReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableClassStaticsReadBarrierVerification
	public UDATAPointer fvtest_enableClassStaticsReadBarrierVerificationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_enableClassStaticsReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableHeapReadBarrierVerification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_enableHeapReadBarrierVerificationOffset_", declaredType="U64")
	public UDATA fvtest_enableHeapReadBarrierVerification() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_enableHeapReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableHeapReadBarrierVerification
	public UDATAPointer fvtest_enableHeapReadBarrierVerificationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_enableHeapReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableJNIGlobalWeakReadBarrierVerification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_enableJNIGlobalWeakReadBarrierVerificationOffset_", declaredType="U64")
	public UDATA fvtest_enableJNIGlobalWeakReadBarrierVerification() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_enableJNIGlobalWeakReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableJNIGlobalWeakReadBarrierVerification
	public UDATAPointer fvtest_enableJNIGlobalWeakReadBarrierVerificationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_enableJNIGlobalWeakReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableMonitorObjectsReadBarrierVerification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_enableMonitorObjectsReadBarrierVerificationOffset_", declaredType="U64")
	public UDATA fvtest_enableMonitorObjectsReadBarrierVerification() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_enableMonitorObjectsReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableMonitorObjectsReadBarrierVerification
	public UDATAPointer fvtest_enableMonitorObjectsReadBarrierVerificationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_enableMonitorObjectsReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableReadBarrierVerification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_enableReadBarrierVerificationOffset_", declaredType="U64")
	public UDATA fvtest_enableReadBarrierVerification() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_enableReadBarrierVerificationOffset_));
	}

	// U64 fvtest_enableReadBarrierVerification
	public UDATAPointer fvtest_enableReadBarrierVerificationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_enableReadBarrierVerificationOffset_));
	}

	// UDATA fvtest_forceCardTableCommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceCardTableCommitFailureOffset_", declaredType="UDATA")
	public UDATA fvtest_forceCardTableCommitFailure() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceCardTableCommitFailureOffset_);
	}

	// UDATA fvtest_forceCardTableCommitFailure
	public UDATAPointer fvtest_forceCardTableCommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceCardTableCommitFailureOffset_));
	}

	// UDATA fvtest_forceCardTableCommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceCardTableCommitFailureCounterOffset_", declaredType="UDATA")
	public UDATA fvtest_forceCardTableCommitFailureCounter() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceCardTableCommitFailureCounterOffset_);
	}

	// UDATA fvtest_forceCardTableCommitFailureCounter
	public UDATAPointer fvtest_forceCardTableCommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceCardTableCommitFailureCounterOffset_));
	}

	// UDATA fvtest_forceCardTableDecommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceCardTableDecommitFailureOffset_", declaredType="UDATA")
	public UDATA fvtest_forceCardTableDecommitFailure() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceCardTableDecommitFailureOffset_);
	}

	// UDATA fvtest_forceCardTableDecommitFailure
	public UDATAPointer fvtest_forceCardTableDecommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceCardTableDecommitFailureOffset_));
	}

	// UDATA fvtest_forceCardTableDecommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceCardTableDecommitFailureCounterOffset_", declaredType="UDATA")
	public UDATA fvtest_forceCardTableDecommitFailureCounter() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceCardTableDecommitFailureCounterOffset_);
	}

	// UDATA fvtest_forceCardTableDecommitFailureCounter
	public UDATAPointer fvtest_forceCardTableDecommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceCardTableDecommitFailureCounterOffset_));
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapCommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceConcurrentTLHMarkMapCommitFailureOffset_", declaredType="UDATA")
	public UDATA fvtest_forceConcurrentTLHMarkMapCommitFailure() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapCommitFailureOffset_);
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapCommitFailure
	public UDATAPointer fvtest_forceConcurrentTLHMarkMapCommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapCommitFailureOffset_));
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapCommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceConcurrentTLHMarkMapCommitFailureCounterOffset_", declaredType="UDATA")
	public UDATA fvtest_forceConcurrentTLHMarkMapCommitFailureCounter() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapCommitFailureCounterOffset_);
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapCommitFailureCounter
	public UDATAPointer fvtest_forceConcurrentTLHMarkMapCommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapCommitFailureCounterOffset_));
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceConcurrentTLHMarkMapDecommitFailureOffset_", declaredType="UDATA")
	public UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailure() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapDecommitFailureOffset_);
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailure
	public UDATAPointer fvtest_forceConcurrentTLHMarkMapDecommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapDecommitFailureOffset_));
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceConcurrentTLHMarkMapDecommitFailureCounterOffset_", declaredType="UDATA")
	public UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailureCounter() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapDecommitFailureCounterOffset_);
	}

	// UDATA fvtest_forceConcurrentTLHMarkMapDecommitFailureCounter
	public UDATAPointer fvtest_forceConcurrentTLHMarkMapDecommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceConcurrentTLHMarkMapDecommitFailureCounterOffset_));
	}

	// U64 fvtest_forceCopyForwardHybridRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceCopyForwardHybridRatioOffset_", declaredType="U64")
	public UDATA fvtest_forceCopyForwardHybridRatio() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceCopyForwardHybridRatioOffset_));
	}

	// U64 fvtest_forceCopyForwardHybridRatio
	public UDATAPointer fvtest_forceCopyForwardHybridRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceCopyForwardHybridRatioOffset_));
	}

	// U64 fvtest_forceExcessiveAllocFailureAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceExcessiveAllocFailureAfterOffset_", declaredType="U64")
	public UDATA fvtest_forceExcessiveAllocFailureAfter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceExcessiveAllocFailureAfterOffset_));
	}

	// U64 fvtest_forceExcessiveAllocFailureAfter
	public UDATAPointer fvtest_forceExcessiveAllocFailureAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceExcessiveAllocFailureAfterOffset_));
	}

	// U64 fvtest_forceMarkMapCommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceMarkMapCommitFailureOffset_", declaredType="U64")
	public UDATA fvtest_forceMarkMapCommitFailure() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceMarkMapCommitFailureOffset_));
	}

	// U64 fvtest_forceMarkMapCommitFailure
	public UDATAPointer fvtest_forceMarkMapCommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceMarkMapCommitFailureOffset_));
	}

	// U64 fvtest_forceMarkMapCommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceMarkMapCommitFailureCounterOffset_", declaredType="U64")
	public UDATA fvtest_forceMarkMapCommitFailureCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceMarkMapCommitFailureCounterOffset_));
	}

	// U64 fvtest_forceMarkMapCommitFailureCounter
	public UDATAPointer fvtest_forceMarkMapCommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceMarkMapCommitFailureCounterOffset_));
	}

	// U64 fvtest_forceMarkMapDecommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceMarkMapDecommitFailureOffset_", declaredType="U64")
	public UDATA fvtest_forceMarkMapDecommitFailure() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceMarkMapDecommitFailureOffset_));
	}

	// U64 fvtest_forceMarkMapDecommitFailure
	public UDATAPointer fvtest_forceMarkMapDecommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceMarkMapDecommitFailureOffset_));
	}

	// U64 fvtest_forceMarkMapDecommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceMarkMapDecommitFailureCounterOffset_", declaredType="U64")
	public UDATA fvtest_forceMarkMapDecommitFailureCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceMarkMapDecommitFailureCounterOffset_));
	}

	// U64 fvtest_forceMarkMapDecommitFailureCounter
	public UDATAPointer fvtest_forceMarkMapDecommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceMarkMapDecommitFailureCounterOffset_));
	}

	// bool fvtest_forceNurseryResize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceNurseryResizeOffset_", declaredType="bool")
	public boolean fvtest_forceNurseryResize() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_forceNurseryResizeOffset_);
	}

	// bool fvtest_forceNurseryResize
	public BoolPointer fvtest_forceNurseryResizeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceNurseryResizeOffset_));
	}

	// bool fvtest_forceOldResize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceOldResizeOffset_", declaredType="bool")
	public boolean fvtest_forceOldResize() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_forceOldResizeOffset_);
	}

	// bool fvtest_forceOldResize
	public BoolPointer fvtest_forceOldResizeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceOldResizeOffset_));
	}

	// bool fvtest_forcePoisonEvacuate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forcePoisonEvacuateOffset_", declaredType="bool")
	public boolean fvtest_forcePoisonEvacuate() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_forcePoisonEvacuateOffset_);
	}

	// bool fvtest_forcePoisonEvacuate
	public BoolPointer fvtest_forcePoisonEvacuateEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forcePoisonEvacuateOffset_));
	}

	// U64 fvtest_forceReferenceChainWalkerMarkMapCommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceReferenceChainWalkerMarkMapCommitFailureOffset_", declaredType="U64")
	public UDATA fvtest_forceReferenceChainWalkerMarkMapCommitFailure() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceReferenceChainWalkerMarkMapCommitFailureOffset_));
	}

	// U64 fvtest_forceReferenceChainWalkerMarkMapCommitFailure
	public UDATAPointer fvtest_forceReferenceChainWalkerMarkMapCommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceReferenceChainWalkerMarkMapCommitFailureOffset_));
	}

	// U64 fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounterOffset_", declaredType="U64")
	public UDATA fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounterOffset_));
	}

	// U64 fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounter
	public UDATAPointer fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceReferenceChainWalkerMarkMapCommitFailureCounterOffset_));
	}

	// bool fvtest_forceScavengerBackout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceScavengerBackoutOffset_", declaredType="bool")
	public boolean fvtest_forceScavengerBackout() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_forceScavengerBackoutOffset_);
	}

	// bool fvtest_forceScavengerBackout
	public BoolPointer fvtest_forceScavengerBackoutEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceScavengerBackoutOffset_));
	}

	// U64 fvtest_forceSweepChunkArrayCommitFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceSweepChunkArrayCommitFailureOffset_", declaredType="U64")
	public UDATA fvtest_forceSweepChunkArrayCommitFailure() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceSweepChunkArrayCommitFailureOffset_));
	}

	// U64 fvtest_forceSweepChunkArrayCommitFailure
	public UDATAPointer fvtest_forceSweepChunkArrayCommitFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceSweepChunkArrayCommitFailureOffset_));
	}

	// U64 fvtest_forceSweepChunkArrayCommitFailureCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceSweepChunkArrayCommitFailureCounterOffset_", declaredType="U64")
	public UDATA fvtest_forceSweepChunkArrayCommitFailureCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_forceSweepChunkArrayCommitFailureCounterOffset_));
	}

	// U64 fvtest_forceSweepChunkArrayCommitFailureCounter
	public UDATAPointer fvtest_forceSweepChunkArrayCommitFailureCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_forceSweepChunkArrayCommitFailureCounterOffset_));
	}

	// U64 fvtest_nurseryResizeCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_nurseryResizeCounterOffset_", declaredType="U64")
	public UDATA fvtest_nurseryResizeCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_nurseryResizeCounterOffset_));
	}

	// U64 fvtest_nurseryResizeCounter
	public UDATAPointer fvtest_nurseryResizeCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_nurseryResizeCounterOffset_));
	}

	// U64 fvtest_oldResizeCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_oldResizeCounterOffset_", declaredType="U64")
	public UDATA fvtest_oldResizeCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_oldResizeCounterOffset_));
	}

	// U64 fvtest_oldResizeCounter
	public UDATAPointer fvtest_oldResizeCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_oldResizeCounterOffset_));
	}

	// U64 fvtest_scanCacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_scanCacheCountOffset_", declaredType="U64")
	public UDATA fvtest_scanCacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_scanCacheCountOffset_));
	}

	// U64 fvtest_scanCacheCount
	public UDATAPointer fvtest_scanCacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_scanCacheCountOffset_));
	}

	// U64 fvtest_tarokFirstContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_tarokFirstContextOffset_", declaredType="U64")
	public UDATA fvtest_tarokFirstContext() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_tarokFirstContextOffset_));
	}

	// U64 fvtest_tarokFirstContext
	public UDATAPointer fvtest_tarokFirstContextEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_tarokFirstContextOffset_));
	}

	// U64 fvtest_tarokForceNUMANode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_tarokForceNUMANodeOffset_", declaredType="U64")
	public UDATA fvtest_tarokForceNUMANode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._fvtest_tarokForceNUMANodeOffset_));
	}

	// U64 fvtest_tarokForceNUMANode
	public UDATAPointer fvtest_tarokForceNUMANodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_tarokForceNUMANodeOffset_));
	}

	// bool fvtest_tarokVerifyMarkMapClosure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_tarokVerifyMarkMapClosureOffset_", declaredType="bool")
	public boolean fvtest_tarokVerifyMarkMapClosure() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._fvtest_tarokVerifyMarkMapClosureOffset_);
	}

	// bool fvtest_tarokVerifyMarkMapClosure
	public BoolPointer fvtest_tarokVerifyMarkMapClosureEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_tarokVerifyMarkMapClosureOffset_));
	}

	// void* fvtest_verifyHeapAbove
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_verifyHeapAboveOffset_", declaredType="void*")
	public VoidPointer fvtest_verifyHeapAbove() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._fvtest_verifyHeapAboveOffset_));
	}

	// void* fvtest_verifyHeapAbove
	public PointerPointer fvtest_verifyHeapAboveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_verifyHeapAboveOffset_));
	}

	// void* fvtest_verifyHeapBelow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_verifyHeapBelowOffset_", declaredType="void*")
	public VoidPointer fvtest_verifyHeapBelow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._fvtest_verifyHeapBelowOffset_));
	}

	// void* fvtest_verifyHeapBelow
	public PointerPointer fvtest_verifyHeapBelowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._fvtest_verifyHeapBelowOffset_));
	}

	// U64 gcCountBetweenHotFieldReset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountBetweenHotFieldResetOffset_", declaredType="U64")
	public UDATA gcCountBetweenHotFieldReset() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcCountBetweenHotFieldResetOffset_));
	}

	// U64 gcCountBetweenHotFieldReset
	public UDATAPointer gcCountBetweenHotFieldResetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcCountBetweenHotFieldResetOffset_));
	}

	// U64 gcCountBetweenHotFieldSort
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountBetweenHotFieldSortOffset_", declaredType="U64")
	public UDATA gcCountBetweenHotFieldSort() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcCountBetweenHotFieldSortOffset_));
	}

	// U64 gcCountBetweenHotFieldSort
	public UDATAPointer gcCountBetweenHotFieldSortEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcCountBetweenHotFieldSortOffset_));
	}

	// U64 gcCountBetweenHotFieldSortMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountBetweenHotFieldSortMaxOffset_", declaredType="U64")
	public UDATA gcCountBetweenHotFieldSortMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcCountBetweenHotFieldSortMaxOffset_));
	}

	// U64 gcCountBetweenHotFieldSortMax
	public UDATAPointer gcCountBetweenHotFieldSortMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcCountBetweenHotFieldSortMaxOffset_));
	}

	// omrthread_monitor_t gcExclusiveAccessMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcExclusiveAccessMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer gcExclusiveAccessMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._gcExclusiveAccessMutexOffset_));
	}

	// omrthread_monitor_t gcExclusiveAccessMutex
	public PointerPointer gcExclusiveAccessMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcExclusiveAccessMutexOffset_));
	}

	// volatile OMR_VMThread* gcExclusiveAccessThreadId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcExclusiveAccessThreadIdOffset_", declaredType="volatile OMR_VMThread*")
	public OMR_VMThreadPointer gcExclusiveAccessThreadId() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._gcExclusiveAccessThreadIdOffset_));
	}

	// volatile OMR_VMThread* gcExclusiveAccessThreadId
	public PointerPointer gcExclusiveAccessThreadIdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcExclusiveAccessThreadIdOffset_));
	}

	// U64 gcInitialTrigger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcInitialTriggerOffset_", declaredType="U64")
	public UDATA gcInitialTrigger() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcInitialTriggerOffset_));
	}

	// U64 gcInitialTrigger
	public UDATAPointer gcInitialTriggerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcInitialTriggerOffset_));
	}

	// const U8* gcModeString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcModeStringOffset_", declaredType="const U8*")
	public U8Pointer gcModeString() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_GCExtensionsBase._gcModeStringOffset_));
	}

	// const U8* gcModeString
	public PointerPointer gcModeStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcModeStringOffset_));
	}

	// bool gcOnIdle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOnIdleOffset_", declaredType="bool")
	public boolean gcOnIdle() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._gcOnIdleOffset_);
	}

	// bool gcOnIdle
	public BoolPointer gcOnIdleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcOnIdleOffset_));
	}

	// float gcOnIdleCompactThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOnIdleCompactThresholdOffset_", declaredType="float")
	public float gcOnIdleCompactThreshold() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._gcOnIdleCompactThresholdOffset_);
	}

	// float gcOnIdleCompactThreshold
	public FloatPointer gcOnIdleCompactThresholdEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcOnIdleCompactThresholdOffset_));
	}

	// omrthread_monitor_t gcStatsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcStatsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer gcStatsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._gcStatsMutexOffset_));
	}

	// omrthread_monitor_t gcStatsMutex
	public PointerPointer gcStatsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcStatsMutexOffset_));
	}

	// U64 gcThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcThreadCountOffset_", declaredType="U64")
	public UDATA gcThreadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcThreadCountOffset_));
	}

	// U64 gcThreadCount
	public UDATAPointer gcThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcThreadCountOffset_));
	}

	// bool gcThreadCountForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcThreadCountForcedOffset_", declaredType="bool")
	public boolean gcThreadCountForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._gcThreadCountForcedOffset_);
	}

	// bool gcThreadCountForced
	public BoolPointer gcThreadCountForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcThreadCountForcedOffset_));
	}

	// U64 gcTrigger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcTriggerOffset_", declaredType="U64")
	public UDATA gcTrigger() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcTriggerOffset_));
	}

	// U64 gcTrigger
	public UDATAPointer gcTriggerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcTriggerOffset_));
	}

	// U64 gcmetadataPageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcmetadataPageFlagsOffset_", declaredType="U64")
	public UDATA gcmetadataPageFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcmetadataPageFlagsOffset_));
	}

	// U64 gcmetadataPageFlags
	public UDATAPointer gcmetadataPageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcmetadataPageFlagsOffset_));
	}

	// U64 gcmetadataPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcmetadataPageSizeOffset_", declaredType="U64")
	public UDATA gcmetadataPageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._gcmetadataPageSizeOffset_));
	}

	// U64 gcmetadataPageSize
	public UDATAPointer gcmetadataPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._gcmetadataPageSizeOffset_));
	}

	// MM_GlobalAllocationManager* globalAllocationManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalAllocationManagerOffset_", declaredType="MM_GlobalAllocationManager*")
	public MM_GlobalAllocationManagerPointer globalAllocationManager() throws CorruptDataException {
		return MM_GlobalAllocationManagerPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._globalAllocationManagerOffset_));
	}

	// MM_GlobalAllocationManager* globalAllocationManager
	public PointerPointer globalAllocationManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalAllocationManagerOffset_));
	}

	// MM_GlobalGCStats globalGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalGCStatsOffset_", declaredType="MM_GlobalGCStats")
	public MM_GlobalGCStatsPointer globalGCStats() throws CorruptDataException {
		return MM_GlobalGCStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalGCStatsOffset_));
	}

	// MM_GlobalGCStats globalGCStats
	public PointerPointer globalGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalGCStatsOffset_));
	}

	// double globalMaximumContraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalMaximumContractionOffset_", declaredType="double")
	public double globalMaximumContraction() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._globalMaximumContractionOffset_);
	}

	// double globalMaximumContraction
	public DoublePointer globalMaximumContractionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalMaximumContractionOffset_));
	}

	// double globalMinimumContraction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalMinimumContractionOffset_", declaredType="double")
	public double globalMinimumContraction() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._globalMinimumContractionOffset_);
	}

	// double globalMinimumContraction
	public DoublePointer globalMinimumContractionEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalMinimumContractionOffset_));
	}

	// MM_GlobalVLHGCStats globalVLHGCStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalVLHGCStatsOffset_", declaredType="MM_GlobalVLHGCStats")
	public MM_GlobalVLHGCStatsPointer globalVLHGCStats() throws CorruptDataException {
		return MM_GlobalVLHGCStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalVLHGCStatsOffset_));
	}

	// MM_GlobalVLHGCStats globalVLHGCStats
	public PointerPointer globalVLHGCStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._globalVLHGCStatsOffset_));
	}

	// U64 headRoom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headRoomOffset_", declaredType="U64")
	public UDATA headRoom() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._headRoomOffset_));
	}

	// U64 headRoom
	public UDATAPointer headRoomEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._headRoomOffset_));
	}

	// MM_Heap* heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._heapOffset_));
	}

	// MM_Heap* heap
	public PointerPointer heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapOffset_));
	}

	// U64 heapAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapAlignmentOffset_", declaredType="U64")
	public UDATA heapAlignment() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapAlignmentOffset_));
	}

	// U64 heapAlignment
	public UDATAPointer heapAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapAlignmentOffset_));
	}

	// void* heapBaseForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseForBarrierRange0Offset_", declaredType="void*")
	public VoidPointer heapBaseForBarrierRange0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._heapBaseForBarrierRange0Offset_));
	}

	// void* heapBaseForBarrierRange0
	public PointerPointer heapBaseForBarrierRange0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapBaseForBarrierRange0Offset_));
	}

	// U64 heapCeiling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapCeilingOffset_", declaredType="U64")
	public UDATA heapCeiling() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapCeilingOffset_));
	}

	// U64 heapCeiling
	public UDATAPointer heapCeilingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapCeilingOffset_));
	}

	// U64 heapContractionGCTimeThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapContractionGCTimeThresholdOffset_", declaredType="U64")
	public UDATA heapContractionGCTimeThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapContractionGCTimeThresholdOffset_));
	}

	// U64 heapContractionGCTimeThreshold
	public UDATAPointer heapContractionGCTimeThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapContractionGCTimeThresholdOffset_));
	}

	// U64 heapContractionStabilizationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapContractionStabilizationCountOffset_", declaredType="U64")
	public UDATA heapContractionStabilizationCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapContractionStabilizationCountOffset_));
	}

	// U64 heapContractionStabilizationCount
	public UDATAPointer heapContractionStabilizationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapContractionStabilizationCountOffset_));
	}

	// U64 heapExpansionGCTimeThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapExpansionGCTimeThresholdOffset_", declaredType="U64")
	public UDATA heapExpansionGCTimeThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapExpansionGCTimeThresholdOffset_));
	}

	// U64 heapExpansionGCTimeThreshold
	public UDATAPointer heapExpansionGCTimeThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapExpansionGCTimeThresholdOffset_));
	}

	// U64 heapExpansionMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapExpansionMaximumSizeOffset_", declaredType="U64")
	public UDATA heapExpansionMaximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapExpansionMaximumSizeOffset_));
	}

	// U64 heapExpansionMaximumSize
	public UDATAPointer heapExpansionMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapExpansionMaximumSizeOffset_));
	}

	// U64 heapExpansionMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapExpansionMinimumSizeOffset_", declaredType="U64")
	public UDATA heapExpansionMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapExpansionMinimumSizeOffset_));
	}

	// U64 heapExpansionMinimumSize
	public UDATAPointer heapExpansionMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapExpansionMinimumSizeOffset_));
	}

	// U64 heapExpansionStabilizationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapExpansionStabilizationCountOffset_", declaredType="U64")
	public UDATA heapExpansionStabilizationCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapExpansionStabilizationCountOffset_));
	}

	// U64 heapExpansionStabilizationCount
	public UDATAPointer heapExpansionStabilizationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapExpansionStabilizationCountOffset_));
	}

	// U64 heapFreeMaximumRatioDivisor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeMaximumRatioDivisorOffset_", declaredType="U64")
	public UDATA heapFreeMaximumRatioDivisor() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapFreeMaximumRatioDivisorOffset_));
	}

	// U64 heapFreeMaximumRatioDivisor
	public UDATAPointer heapFreeMaximumRatioDivisorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapFreeMaximumRatioDivisorOffset_));
	}

	// U64 heapFreeMaximumRatioMultiplier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeMaximumRatioMultiplierOffset_", declaredType="U64")
	public UDATA heapFreeMaximumRatioMultiplier() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapFreeMaximumRatioMultiplierOffset_));
	}

	// U64 heapFreeMaximumRatioMultiplier
	public UDATAPointer heapFreeMaximumRatioMultiplierEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapFreeMaximumRatioMultiplierOffset_));
	}

	// U64 heapFreeMinimumRatioDivisor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeMinimumRatioDivisorOffset_", declaredType="U64")
	public UDATA heapFreeMinimumRatioDivisor() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapFreeMinimumRatioDivisorOffset_));
	}

	// U64 heapFreeMinimumRatioDivisor
	public UDATAPointer heapFreeMinimumRatioDivisorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapFreeMinimumRatioDivisorOffset_));
	}

	// U64 heapFreeMinimumRatioMultiplier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeMinimumRatioMultiplierOffset_", declaredType="U64")
	public UDATA heapFreeMinimumRatioMultiplier() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapFreeMinimumRatioMultiplierOffset_));
	}

	// U64 heapFreeMinimumRatioMultiplier
	public UDATAPointer heapFreeMinimumRatioMultiplierEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapFreeMinimumRatioMultiplierOffset_));
	}

	// MM_GCExtensionsBase$HeapInitializationFailureReason heapInitializationFailureReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapInitializationFailureReasonOffset_", declaredType="MM_GCExtensionsBase$HeapInitializationFailureReason")
	public long heapInitializationFailureReason() throws CorruptDataException {
		if (MM_GCExtensionsBase$HeapInitializationFailureReason.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._heapInitializationFailureReasonOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationFailureReason.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._heapInitializationFailureReasonOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationFailureReason.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._heapInitializationFailureReasonOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationFailureReason.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._heapInitializationFailureReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensionsBase$HeapInitializationFailureReason heapInitializationFailureReason
	public EnumPointer heapInitializationFailureReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapInitializationFailureReasonOffset_), MM_GCExtensionsBase$HeapInitializationFailureReason.class);
	}

	// MM_HeapRegionManager* heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* heapRegionManager
	public PointerPointer heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapRegionManagerOffset_));
	}

	// U64 heapSizeForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeForBarrierRange0Offset_", declaredType="U64")
	public UDATA heapSizeForBarrierRange0() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._heapSizeForBarrierRange0Offset_));
	}

	// U64 heapSizeForBarrierRange0
	public UDATAPointer heapSizeForBarrierRange0EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapSizeForBarrierRange0Offset_));
	}

	// float heapSizeStartupHintConservativeFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeStartupHintConservativeFactorOffset_", declaredType="float")
	public float heapSizeStartupHintConservativeFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._heapSizeStartupHintConservativeFactorOffset_);
	}

	// float heapSizeStartupHintConservativeFactor
	public FloatPointer heapSizeStartupHintConservativeFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapSizeStartupHintConservativeFactorOffset_));
	}

	// float heapSizeStartupHintWeightNewValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeStartupHintWeightNewValueOffset_", declaredType="float")
	public float heapSizeStartupHintWeightNewValue() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._heapSizeStartupHintWeightNewValueOffset_);
	}

	// float heapSizeStartupHintWeightNewValue
	public FloatPointer heapSizeStartupHintWeightNewValueEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._heapSizeStartupHintWeightNewValueOffset_));
	}

	// U64 highAllocationThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_highAllocationThresholdOffset_", declaredType="U64")
	public UDATA highAllocationThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._highAllocationThresholdOffset_));
	}

	// U64 highAllocationThreshold
	public UDATAPointer highAllocationThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._highAllocationThresholdOffset_));
	}

	// bool hotFieldResettingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldResettingEnabledOffset_", declaredType="bool")
	public boolean hotFieldResettingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._hotFieldResettingEnabledOffset_);
	}

	// bool hotFieldResettingEnabled
	public BoolPointer hotFieldResettingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._hotFieldResettingEnabledOffset_));
	}

	// U64 hrtPeriodMicro
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hrtPeriodMicroOffset_", declaredType="U64")
	public UDATA hrtPeriodMicro() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._hrtPeriodMicroOffset_));
	}

	// U64 hrtPeriodMicro
	public UDATAPointer hrtPeriodMicroEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._hrtPeriodMicroOffset_));
	}

	// U64 idleMinimumFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idleMinimumFreeOffset_", declaredType="U64")
	public UDATA idleMinimumFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._idleMinimumFreeOffset_));
	}

	// U64 idleMinimumFree
	public UDATAPointer idleMinimumFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._idleMinimumFreeOffset_));
	}

	// MM_ScavengerStats incrementScavengerStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_incrementScavengerStatsOffset_", declaredType="MM_ScavengerStats")
	public MM_ScavengerStatsPointer incrementScavengerStats() throws CorruptDataException {
		return MM_ScavengerStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._incrementScavengerStatsOffset_));
	}

	// MM_ScavengerStats incrementScavengerStats
	public PointerPointer incrementScavengerStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._incrementScavengerStatsOffset_));
	}

	// GC_ArrayObjectModel indexableObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexableObjectModelOffset_", declaredType="GC_ArrayObjectModel")
	public GC_ArrayletObjectModelPointer indexableObjectModel() throws CorruptDataException {
		return GC_ArrayletObjectModelPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._indexableObjectModelOffset_));
	}

	// GC_ArrayObjectModel indexableObjectModel
	public PointerPointer indexableObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._indexableObjectModelOffset_));
	}

	// U64 initialMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialMemorySizeOffset_", declaredType="U64")
	public UDATA initialMemorySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._initialMemorySizeOffset_));
	}

	// U64 initialMemorySize
	public UDATAPointer initialMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._initialMemorySizeOffset_));
	}

	// bool instrumentableAllocateHookEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instrumentableAllocateHookEnabledOffset_", declaredType="bool")
	public boolean instrumentableAllocateHookEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._instrumentableAllocateHookEnabledOffset_);
	}

	// bool instrumentableAllocateHookEnabled
	public BoolPointer instrumentableAllocateHookEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._instrumentableAllocateHookEnabledOffset_));
	}

	// MM_InterRegionRememberedSet* interRegionRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interRegionRememberedSetOffset_", declaredType="MM_InterRegionRememberedSet*")
	public MM_InterRegionRememberedSetPointer interRegionRememberedSet() throws CorruptDataException {
		return MM_InterRegionRememberedSetPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._interRegionRememberedSetOffset_));
	}

	// MM_InterRegionRememberedSet* interRegionRememberedSet
	public PointerPointer interRegionRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._interRegionRememberedSetOffset_));
	}

	// bool isArrayletDoubleMapAvailable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isArrayletDoubleMapAvailableOffset_", declaredType="bool")
	public boolean isArrayletDoubleMapAvailable() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._isArrayletDoubleMapAvailableOffset_);
	}

	// bool isArrayletDoubleMapAvailable
	public BoolPointer isArrayletDoubleMapAvailableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._isArrayletDoubleMapAvailableOffset_));
	}

	// bool isArrayletDoubleMapRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isArrayletDoubleMapRequestedOffset_", declaredType="bool")
	public boolean isArrayletDoubleMapRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._isArrayletDoubleMapRequestedOffset_);
	}

	// bool isArrayletDoubleMapRequested
	public BoolPointer isArrayletDoubleMapRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._isArrayletDoubleMapRequestedOffset_));
	}

	// bool isRecursiveGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isRecursiveGCOffset_", declaredType="bool")
	public boolean isRecursiveGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._isRecursiveGCOffset_);
	}

	// bool isRecursiveGC
	public BoolPointer isRecursiveGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._isRecursiveGCOffset_));
	}

	// U64 itPeriodMicro
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_itPeriodMicroOffset_", declaredType="U64")
	public UDATA itPeriodMicro() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._itPeriodMicroOffset_));
	}

	// U64 itPeriodMicro
	public UDATAPointer itPeriodMicroEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._itPeriodMicroOffset_));
	}

	// U32 largeObjectAllocationProfilingSizeClassRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAllocationProfilingSizeClassRatioOffset_", declaredType="U32")
	public UDATA largeObjectAllocationProfilingSizeClassRatio() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._largeObjectAllocationProfilingSizeClassRatioOffset_));
	}

	// U32 largeObjectAllocationProfilingSizeClassRatio
	public UDATAPointer largeObjectAllocationProfilingSizeClassRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAllocationProfilingSizeClassRatioOffset_));
	}

	// U64 largeObjectAllocationProfilingThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAllocationProfilingThresholdOffset_", declaredType="U64")
	public UDATA largeObjectAllocationProfilingThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._largeObjectAllocationProfilingThresholdOffset_));
	}

	// U64 largeObjectAllocationProfilingThreshold
	public UDATAPointer largeObjectAllocationProfilingThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAllocationProfilingThresholdOffset_));
	}

	// U32 largeObjectAllocationProfilingTopK
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAllocationProfilingTopKOffset_", declaredType="U32")
	public UDATA largeObjectAllocationProfilingTopK() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._largeObjectAllocationProfilingTopKOffset_));
	}

	// U32 largeObjectAllocationProfilingTopK
	public UDATAPointer largeObjectAllocationProfilingTopKEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAllocationProfilingTopKOffset_));
	}

	// U64 largeObjectAllocationProfilingVeryLargeObjectSizeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAllocationProfilingVeryLargeObjectSizeClassOffset_", declaredType="U64")
	public UDATA largeObjectAllocationProfilingVeryLargeObjectSizeClass() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._largeObjectAllocationProfilingVeryLargeObjectSizeClassOffset_));
	}

	// U64 largeObjectAllocationProfilingVeryLargeObjectSizeClass
	public UDATAPointer largeObjectAllocationProfilingVeryLargeObjectSizeClassEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAllocationProfilingVeryLargeObjectSizeClassOffset_));
	}

	// U64 largeObjectAllocationProfilingVeryLargeObjectThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAllocationProfilingVeryLargeObjectThresholdOffset_", declaredType="U64")
	public UDATA largeObjectAllocationProfilingVeryLargeObjectThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._largeObjectAllocationProfilingVeryLargeObjectThresholdOffset_));
	}

	// U64 largeObjectAllocationProfilingVeryLargeObjectThreshold
	public UDATAPointer largeObjectAllocationProfilingVeryLargeObjectThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAllocationProfilingVeryLargeObjectThresholdOffset_));
	}

	// bool largeObjectArea
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAreaOffset_", declaredType="bool")
	public boolean largeObjectArea() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._largeObjectAreaOffset_);
	}

	// bool largeObjectArea
	public BoolPointer largeObjectAreaEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAreaOffset_));
	}

	// double largeObjectAreaInitialRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAreaInitialRatioOffset_", declaredType="double")
	public double largeObjectAreaInitialRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._largeObjectAreaInitialRatioOffset_);
	}

	// double largeObjectAreaInitialRatio
	public DoublePointer largeObjectAreaInitialRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAreaInitialRatioOffset_));
	}

	// double largeObjectAreaMaximumRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAreaMaximumRatioOffset_", declaredType="double")
	public double largeObjectAreaMaximumRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._largeObjectAreaMaximumRatioOffset_);
	}

	// double largeObjectAreaMaximumRatio
	public DoublePointer largeObjectAreaMaximumRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAreaMaximumRatioOffset_));
	}

	// double largeObjectAreaMinimumRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectAreaMinimumRatioOffset_", declaredType="double")
	public double largeObjectAreaMinimumRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._largeObjectAreaMinimumRatioOffset_);
	}

	// double largeObjectAreaMinimumRatio
	public DoublePointer largeObjectAreaMinimumRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectAreaMinimumRatioOffset_));
	}

	// U64 largeObjectMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeObjectMinimumSizeOffset_", declaredType="U64")
	public UDATA largeObjectMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._largeObjectMinimumSizeOffset_));
	}

	// U64 largeObjectMinimumSize
	public UDATAPointer largeObjectMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largeObjectMinimumSizeOffset_));
	}

	// bool largePageFailOnError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largePageFailOnErrorOffset_", declaredType="bool")
	public boolean largePageFailOnError() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._largePageFailOnErrorOffset_);
	}

	// bool largePageFailOnError
	public BoolPointer largePageFailOnErrorEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largePageFailOnErrorOffset_));
	}

	// bool largePageFailedToSatisfy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largePageFailedToSatisfyOffset_", declaredType="bool")
	public boolean largePageFailedToSatisfy() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._largePageFailedToSatisfyOffset_);
	}

	// bool largePageFailedToSatisfy
	public BoolPointer largePageFailedToSatisfyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largePageFailedToSatisfyOffset_));
	}

	// bool largePageWarnOnError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largePageWarnOnErrorOffset_", declaredType="bool")
	public boolean largePageWarnOnError() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._largePageWarnOnErrorOffset_);
	}

	// bool largePageWarnOnError
	public BoolPointer largePageWarnOnErrorEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._largePageWarnOnErrorOffset_));
	}

	// U64 lastGlobalGCFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGlobalGCFreeBytesOffset_", declaredType="U64")
	public UDATA lastGlobalGCFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._lastGlobalGCFreeBytesOffset_));
	}

	// U64 lastGlobalGCFreeBytes
	public UDATAPointer lastGlobalGCFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lastGlobalGCFreeBytesOffset_));
	}

	// U64 lastGlobalGCFreeBytesLOA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGlobalGCFreeBytesLOAOffset_", declaredType="U64")
	public UDATA lastGlobalGCFreeBytesLOA() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._lastGlobalGCFreeBytesLOAOffset_));
	}

	// U64 lastGlobalGCFreeBytesLOA
	public UDATAPointer lastGlobalGCFreeBytesLOAEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lastGlobalGCFreeBytesLOAOffset_));
	}

	// ModronLnrlOptions lnrlOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lnrlOptionsOffset_", declaredType="ModronLnrlOptions")
	public ModronLnrlOptionsPointer lnrlOptions() throws CorruptDataException {
		return ModronLnrlOptionsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lnrlOptionsOffset_));
	}

	// ModronLnrlOptions lnrlOptions
	public PointerPointer lnrlOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lnrlOptionsOffset_));
	}

	// I32 loaFreeHistorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loaFreeHistorySizeOffset_", declaredType="I32")
	public IDATA loaFreeHistorySize() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_GCExtensionsBase._loaFreeHistorySizeOffset_));
	}

	// I32 loaFreeHistorySize
	public IDATAPointer loaFreeHistorySizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._loaFreeHistorySizeOffset_));
	}

	// U64 lowAllocationThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lowAllocationThresholdOffset_", declaredType="U64")
	public UDATA lowAllocationThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._lowAllocationThresholdOffset_));
	}

	// U64 lowAllocationThreshold
	public UDATAPointer lowAllocationThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lowAllocationThresholdOffset_));
	}

	// U64 lowMinimum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lowMinimumOffset_", declaredType="U64")
	public UDATA lowMinimum() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._lowMinimumOffset_));
	}

	// U64 lowMinimum
	public UDATAPointer lowMinimumEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._lowMinimumOffset_));
	}

	// U64 managedAllocationContextCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_managedAllocationContextCountOffset_", declaredType="U64")
	public UDATA managedAllocationContextCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._managedAllocationContextCountOffset_));
	}

	// U64 managedAllocationContextCount
	public UDATAPointer managedAllocationContextCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._managedAllocationContextCountOffset_));
	}

	// U64 markingArraySplitMaximumAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markingArraySplitMaximumAmountOffset_", declaredType="U64")
	public UDATA markingArraySplitMaximumAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._markingArraySplitMaximumAmountOffset_));
	}

	// U64 markingArraySplitMaximumAmount
	public UDATAPointer markingArraySplitMaximumAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._markingArraySplitMaximumAmountOffset_));
	}

	// U64 markingArraySplitMinimumAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markingArraySplitMinimumAmountOffset_", declaredType="U64")
	public UDATA markingArraySplitMinimumAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._markingArraySplitMinimumAmountOffset_));
	}

	// U64 markingArraySplitMinimumAmount
	public UDATAPointer markingArraySplitMinimumAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._markingArraySplitMinimumAmountOffset_));
	}

	// U64 maxConsecutiveHotFieldSelections
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxConsecutiveHotFieldSelectionsOffset_", declaredType="U64")
	public UDATA maxConsecutiveHotFieldSelections() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._maxConsecutiveHotFieldSelectionsOffset_));
	}

	// U64 maxConsecutiveHotFieldSelections
	public UDATAPointer maxConsecutiveHotFieldSelectionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxConsecutiveHotFieldSelectionsOffset_));
	}

	// U32 maxHotFieldListLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxHotFieldListLengthOffset_", declaredType="U32")
	public UDATA maxHotFieldListLength() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._maxHotFieldListLengthOffset_));
	}

	// U32 maxHotFieldListLength
	public UDATAPointer maxHotFieldListLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxHotFieldListLengthOffset_));
	}

	// U64 maxNewSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxNewSpaceSizeOffset_", declaredType="U64")
	public UDATA maxNewSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._maxNewSpaceSizeOffset_));
	}

	// U64 maxNewSpaceSize
	public UDATAPointer maxNewSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxNewSpaceSizeOffset_));
	}

	// U64 maxOldSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxOldSpaceSizeOffset_", declaredType="U64")
	public UDATA maxOldSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._maxOldSpaceSizeOffset_));
	}

	// U64 maxOldSpaceSize
	public UDATAPointer maxOldSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxOldSpaceSizeOffset_));
	}

	// U64 maxScavengeBeforeGlobal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxScavengeBeforeGlobalOffset_", declaredType="U64")
	public UDATA maxScavengeBeforeGlobal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._maxScavengeBeforeGlobalOffset_));
	}

	// U64 maxScavengeBeforeGlobal
	public UDATAPointer maxScavengeBeforeGlobalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxScavengeBeforeGlobalOffset_));
	}

	// U64 maxSizeDefaultMemorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxSizeDefaultMemorySpaceOffset_", declaredType="U64")
	public UDATA maxSizeDefaultMemorySpace() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._maxSizeDefaultMemorySpaceOffset_));
	}

	// U64 maxSizeDefaultMemorySpace
	public UDATAPointer maxSizeDefaultMemorySpaceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._maxSizeDefaultMemorySpaceOffset_));
	}

	// MM_MemoryManager* memoryManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryManagerOffset_", declaredType="MM_MemoryManager*")
	public MM_MemoryManagerPointer memoryManager() throws CorruptDataException {
		return MM_MemoryManagerPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._memoryManagerOffset_));
	}

	// MM_MemoryManager* memoryManager
	public PointerPointer memoryManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._memoryManagerOffset_));
	}

	// U64 memoryMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryMaxOffset_", declaredType="U64")
	public UDATA memoryMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._memoryMaxOffset_));
	}

	// U64 memoryMax
	public UDATAPointer memoryMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._memoryMaxOffset_));
	}

	// U64 minArraySizeToSetAsScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minArraySizeToSetAsScannedOffset_", declaredType="U64")
	public UDATA minArraySizeToSetAsScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minArraySizeToSetAsScannedOffset_));
	}

	// U64 minArraySizeToSetAsScanned
	public UDATAPointer minArraySizeToSetAsScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minArraySizeToSetAsScannedOffset_));
	}

	// U64 minCpuUtil
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minCpuUtilOffset_", declaredType="U64")
	public UDATA minCpuUtil() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minCpuUtilOffset_));
	}

	// U64 minCpuUtil
	public UDATAPointer minCpuUtilEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minCpuUtilOffset_));
	}

	// U64 minNewSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minNewSpaceSizeOffset_", declaredType="U64")
	public UDATA minNewSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minNewSpaceSizeOffset_));
	}

	// U64 minNewSpaceSize
	public UDATAPointer minNewSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minNewSpaceSizeOffset_));
	}

	// U64 minOldSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minOldSpaceSizeOffset_", declaredType="U64")
	public UDATA minOldSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minOldSpaceSizeOffset_));
	}

	// U64 minOldSpaceSize
	public UDATAPointer minOldSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minOldSpaceSizeOffset_));
	}

	// U64 minimumContractionRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimumContractionRatioOffset_", declaredType="U64")
	public UDATA minimumContractionRatio() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minimumContractionRatioOffset_));
	}

	// U64 minimumContractionRatio
	public UDATAPointer minimumContractionRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minimumContractionRatioOffset_));
	}

	// U64 minimumFreeEntrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimumFreeEntrySizeOffset_", declaredType="U64")
	public UDATA minimumFreeEntrySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._minimumFreeEntrySizeOffset_));
	}

	// U64 minimumFreeEntrySize
	public UDATAPointer minimumFreeEntrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._minimumFreeEntrySizeOffset_));
	}

	// GC_MixedObjectModel mixedObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mixedObjectModelOffset_", declaredType="GC_MixedObjectModel")
	public GC_MixedObjectModelPointer mixedObjectModel() throws CorruptDataException {
		return GC_MixedObjectModelPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._mixedObjectModelOffset_));
	}

	// GC_MixedObjectModel mixedObjectModel
	public PointerPointer mixedObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._mixedObjectModelOffset_));
	}

	// U64 newSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newSpaceSizeOffset_", declaredType="U64")
	public UDATA newSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._newSpaceSizeOffset_));
	}

	// U64 newSpaceSize
	public UDATAPointer newSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._newSpaceSizeOffset_));
	}

	// U32 newThreadAllocationColor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newThreadAllocationColorOffset_", declaredType="U32")
	public UDATA newThreadAllocationColor() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._newThreadAllocationColorOffset_));
	}

	// U32 newThreadAllocationColor
	public UDATAPointer newThreadAllocationColorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._newThreadAllocationColorOffset_));
	}

	// U64 noCompactOnGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_noCompactOnGlobalGCOffset_", declaredType="U64")
	public UDATA noCompactOnGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._noCompactOnGlobalGCOffset_));
	}

	// U64 noCompactOnGlobalGC
	public UDATAPointer noCompactOnGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._noCompactOnGlobalGCOffset_));
	}

	// U64 nocompactOnSystemGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nocompactOnSystemGCOffset_", declaredType="U64")
	public UDATA nocompactOnSystemGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._nocompactOnSystemGCOffset_));
	}

	// U64 nocompactOnSystemGC
	public UDATAPointer nocompactOnSystemGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._nocompactOnSystemGCOffset_));
	}

	// bool nonDeterministicSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonDeterministicSweepOffset_", declaredType="bool")
	public boolean nonDeterministicSweep() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._nonDeterministicSweepOffset_);
	}

	// bool nonDeterministicSweep
	public BoolPointer nonDeterministicSweepEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._nonDeterministicSweepOffset_));
	}

	// bool numaForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numaForcedOffset_", declaredType="bool")
	public boolean numaForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._numaForcedOffset_);
	}

	// bool numaForced
	public BoolPointer numaForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._numaForcedOffset_));
	}

	// GC_ObjectModel objectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectModelOffset_", declaredType="GC_ObjectModel")
	public GC_ObjectModelPointer objectModel() throws CorruptDataException {
		return GC_ObjectModelPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._objectModelOffset_));
	}

	// GC_ObjectModel objectModel
	public PointerPointer objectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._objectModelOffset_));
	}

	// U64 objectSamplingBytesGranularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectSamplingBytesGranularityOffset_", declaredType="U64")
	public UDATA objectSamplingBytesGranularity() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._objectSamplingBytesGranularityOffset_));
	}

	// U64 objectSamplingBytesGranularity
	public UDATAPointer objectSamplingBytesGranularityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._objectSamplingBytesGranularityOffset_));
	}

	// U64 oldHeapSizeOnLastGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldHeapSizeOnLastGlobalGCOffset_", declaredType="U64")
	public UDATA oldHeapSizeOnLastGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._oldHeapSizeOnLastGlobalGCOffset_));
	}

	// U64 oldHeapSizeOnLastGlobalGC
	public UDATAPointer oldHeapSizeOnLastGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._oldHeapSizeOnLastGlobalGCOffset_));
	}

	// U64 oldSpaceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldSpaceSizeOffset_", declaredType="U64")
	public UDATA oldSpaceSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._oldSpaceSizeOffset_));
	}

	// U64 oldSpaceSize
	public UDATAPointer oldSpaceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._oldSpaceSizeOffset_));
	}

	// MM_OMRHookInterface omrHookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrHookInterfaceOffset_", declaredType="MM_OMRHookInterface")
	public MM_OMRHookInterfacePointer omrHookInterface() throws CorruptDataException {
		return MM_OMRHookInterfacePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._omrHookInterfaceOffset_));
	}

	// MM_OMRHookInterface omrHookInterface
	public PointerPointer omrHookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._omrHookInterfaceOffset_));
	}

	// U64 oolObjectSamplingBytesGranularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oolObjectSamplingBytesGranularityOffset_", declaredType="U64")
	public UDATA oolObjectSamplingBytesGranularity() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._oolObjectSamplingBytesGranularityOffset_));
	}

	// U64 oolObjectSamplingBytesGranularity
	public UDATAPointer oolObjectSamplingBytesGranularityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._oolObjectSamplingBytesGranularityOffset_));
	}

	// bool optimizeConcurrentWB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optimizeConcurrentWBOffset_", declaredType="bool")
	public boolean optimizeConcurrentWB() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._optimizeConcurrentWBOffset_);
	}

	// bool optimizeConcurrentWB
	public BoolPointer optimizeConcurrentWBEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._optimizeConcurrentWBOffset_));
	}

	// U64 overflowCacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_overflowCacheCountOffset_", declaredType="U64")
	public UDATA overflowCacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._overflowCacheCountOffset_));
	}

	// U64 overflowCacheCount
	public UDATAPointer overflowCacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._overflowCacheCountOffset_));
	}

	// U64 overflowSafeAllocSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_overflowSafeAllocSizeOffset_", declaredType="U64")
	public UDATA overflowSafeAllocSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._overflowSafeAllocSizeOffset_));
	}

	// U64 overflowSafeAllocSize
	public UDATAPointer overflowSafeAllocSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._overflowSafeAllocSizeOffset_));
	}

	// bool overrideHiresTimerCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_overrideHiresTimerCheckOffset_", declaredType="bool")
	public boolean overrideHiresTimerCheck() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._overrideHiresTimerCheckOffset_);
	}

	// bool overrideHiresTimerCheck
	public BoolPointer overrideHiresTimerCheckEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._overrideHiresTimerCheckOffset_));
	}

	// U64 packetListSplit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_packetListSplitOffset_", declaredType="U64")
	public UDATA packetListSplit() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._packetListSplitOffset_));
	}

	// U64 packetListSplit
	public UDATAPointer packetListSplitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._packetListSplitOffset_));
	}

	// bool padToPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_padToPageSizeOffset_", declaredType="bool")
	public boolean padToPageSize() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._padToPageSizeOffset_);
	}

	// bool padToPageSize
	public BoolPointer padToPageSizeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._padToPageSizeOffset_));
	}

	// U64 parSweepChunkSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parSweepChunkSizeOffset_", declaredType="U64")
	public UDATA parSweepChunkSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._parSweepChunkSizeOffset_));
	}

	// U64 parSweepChunkSize
	public UDATAPointer parSweepChunkSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._parSweepChunkSizeOffset_));
	}

	// bool payAllocationTax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_payAllocationTaxOffset_", declaredType="bool")
	public boolean payAllocationTax() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._payAllocationTaxOffset_);
	}

	// bool payAllocationTax
	public BoolPointer payAllocationTaxEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._payAllocationTaxOffset_));
	}

	// U64 preferredHeapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preferredHeapBaseOffset_", declaredType="U64")
	public UDATA preferredHeapBase() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._preferredHeapBaseOffset_));
	}

	// U64 preferredHeapBase
	public UDATAPointer preferredHeapBaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._preferredHeapBaseOffset_));
	}

	// bool pretouchHeapOnExpand
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pretouchHeapOnExpandOffset_", declaredType="bool")
	public boolean pretouchHeapOnExpand() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._pretouchHeapOnExpandOffset_);
	}

	// bool pretouchHeapOnExpand
	public BoolPointer pretouchHeapOnExpandEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._pretouchHeapOnExpandOffset_));
	}

	// MM_HeapMap* previousMarkMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousMarkMapOffset_", declaredType="MM_HeapMap*")
	public MM_HeapMapPointer previousMarkMap() throws CorruptDataException {
		return MM_HeapMapPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._previousMarkMapOffset_));
	}

	// MM_HeapMap* previousMarkMap
	public PointerPointer previousMarkMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._previousMarkMapOffset_));
	}

	// MM_PrivateHookInterface privateHookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_privateHookInterfaceOffset_", declaredType="MM_PrivateHookInterface")
	public MM_PrivateHookInterfacePointer privateHookInterface() throws CorruptDataException {
		return MM_PrivateHookInterfacePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._privateHookInterfaceOffset_));
	}

	// MM_PrivateHookInterface privateHookInterface
	public PointerPointer privateHookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._privateHookInterfaceOffset_));
	}

	// bool processLargeAllocateStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processLargeAllocateStatsOffset_", declaredType="bool")
	public boolean processLargeAllocateStats() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._processLargeAllocateStatsOffset_);
	}

	// bool processLargeAllocateStats
	public BoolPointer processLargeAllocateStatsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._processLargeAllocateStatsOffset_));
	}

	// MM_RealtimeGC* realtimeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_realtimeGCOffset_", declaredType="MM_RealtimeGC*")
	public MM_RealtimeGCPointer realtimeGC() throws CorruptDataException {
		return MM_RealtimeGCPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._realtimeGCOffset_));
	}

	// MM_RealtimeGC* realtimeGC
	public PointerPointer realtimeGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._realtimeGCOffset_));
	}

	// MM_ReferenceChainWalkerMarkMap* referenceChainWalkerMarkMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceChainWalkerMarkMapOffset_", declaredType="MM_ReferenceChainWalkerMarkMap*")
	public MM_ReferenceChainWalkerMarkMapPointer referenceChainWalkerMarkMap() throws CorruptDataException {
		return MM_ReferenceChainWalkerMarkMapPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._referenceChainWalkerMarkMapOffset_));
	}

	// MM_ReferenceChainWalkerMarkMap* referenceChainWalkerMarkMap
	public PointerPointer referenceChainWalkerMarkMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._referenceChainWalkerMarkMapOffset_));
	}

	// U64 regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_regionSizeOffset_", declaredType="U64")
	public UDATA regionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._regionSizeOffset_));
	}

	// U64 regionSize
	public UDATAPointer regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._regionSizeOffset_));
	}

	// MM_SublistPool rememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rememberedSetOffset_", declaredType="MM_SublistPool")
	public MM_SublistPoolPointer rememberedSet() throws CorruptDataException {
		return MM_SublistPoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._rememberedSetOffset_));
	}

	// MM_SublistPool rememberedSet
	public PointerPointer rememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._rememberedSetOffset_));
	}

	// MM_RememberedSetCardBucket* rememberedSetCardBucketPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rememberedSetCardBucketPoolOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer rememberedSetCardBucketPool() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._rememberedSetCardBucketPoolOffset_));
	}

	// MM_RememberedSetCardBucket* rememberedSetCardBucketPool
	public PointerPointer rememberedSetCardBucketPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._rememberedSetCardBucketPoolOffset_));
	}

	// U64 requestedPageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requestedPageFlagsOffset_", declaredType="U64")
	public UDATA requestedPageFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._requestedPageFlagsOffset_));
	}

	// U64 requestedPageFlags
	public UDATAPointer requestedPageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._requestedPageFlagsOffset_));
	}

	// U64 requestedPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requestedPageSizeOffset_", declaredType="U64")
	public UDATA requestedPageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._requestedPageSizeOffset_));
	}

	// U64 requestedPageSize
	public UDATAPointer requestedPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._requestedPageSizeOffset_));
	}

	// bool rootScannerStatsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootScannerStatsEnabledOffset_", declaredType="bool")
	public boolean rootScannerStatsEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._rootScannerStatsEnabledOffset_);
	}

	// bool rootScannerStatsEnabled
	public BoolPointer rootScannerStatsEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._rootScannerStatsEnabledOffset_));
	}

	// bool rootScannerStatsUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootScannerStatsUsedOffset_", declaredType="bool")
	public boolean rootScannerStatsUsed() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._rootScannerStatsUsedOffset_);
	}

	// bool rootScannerStatsUsed
	public BoolPointer rootScannerStatsUsedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._rootScannerStatsUsedOffset_));
	}

	// MM_RememberedSetSATB* sATBBarrierRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sATBBarrierRememberedSetOffset_", declaredType="MM_RememberedSetSATB*")
	public MM_RememberedSetSATBPointer sATBBarrierRememberedSet() throws CorruptDataException {
		return MM_RememberedSetSATBPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._sATBBarrierRememberedSetOffset_));
	}

	// MM_RememberedSetSATB* sATBBarrierRememberedSet
	public PointerPointer sATBBarrierRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sATBBarrierRememberedSetOffset_));
	}

	// MM_Scavenger* scavenger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerOffset_", declaredType="MM_Scavenger*")
	public MM_ScavengerPointer scavenger() throws CorruptDataException {
		return MM_ScavengerPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._scavengerOffset_));
	}

	// MM_Scavenger* scavenger
	public PointerPointer scavengerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerOffset_));
	}

	// bool scavengerAlignHotFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerAlignHotFieldsOffset_", declaredType="bool")
	public boolean scavengerAlignHotFields() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scavengerAlignHotFieldsOffset_);
	}

	// bool scavengerAlignHotFields
	public BoolPointer scavengerAlignHotFieldsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerAlignHotFieldsOffset_));
	}

	// double scavengerCollectorExpandRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerCollectorExpandRatioOffset_", declaredType="double")
	public double scavengerCollectorExpandRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._scavengerCollectorExpandRatioOffset_);
	}

	// double scavengerCollectorExpandRatio
	public DoublePointer scavengerCollectorExpandRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerCollectorExpandRatioOffset_));
	}

	// bool scavengerEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerEnabledOffset_", declaredType="bool")
	public boolean scavengerEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scavengerEnabledOffset_);
	}

	// bool scavengerEnabled
	public BoolPointer scavengerEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerEnabledOffset_));
	}

	// U64 scavengerFailedTenureThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerFailedTenureThresholdOffset_", declaredType="U64")
	public UDATA scavengerFailedTenureThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scavengerFailedTenureThresholdOffset_));
	}

	// U64 scavengerFailedTenureThreshold
	public UDATAPointer scavengerFailedTenureThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerFailedTenureThresholdOffset_));
	}

	// U64 scavengerMaximumCollectorExpandSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerMaximumCollectorExpandSizeOffset_", declaredType="U64")
	public UDATA scavengerMaximumCollectorExpandSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scavengerMaximumCollectorExpandSizeOffset_));
	}

	// U64 scavengerMaximumCollectorExpandSize
	public UDATAPointer scavengerMaximumCollectorExpandSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerMaximumCollectorExpandSizeOffset_));
	}

	// bool scavengerRsoScanUnsafe
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerRsoScanUnsafeOffset_", declaredType="bool")
	public boolean scavengerRsoScanUnsafe() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scavengerRsoScanUnsafeOffset_);
	}

	// bool scavengerRsoScanUnsafe
	public BoolPointer scavengerRsoScanUnsafeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerRsoScanUnsafeOffset_));
	}

	// U64 scavengerScanCacheMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerScanCacheMaximumSizeOffset_", declaredType="U64")
	public UDATA scavengerScanCacheMaximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scavengerScanCacheMaximumSizeOffset_));
	}

	// U64 scavengerScanCacheMaximumSize
	public UDATAPointer scavengerScanCacheMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerScanCacheMaximumSizeOffset_));
	}

	// U64 scavengerScanCacheMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerScanCacheMinimumSizeOffset_", declaredType="U64")
	public UDATA scavengerScanCacheMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scavengerScanCacheMinimumSizeOffset_));
	}

	// U64 scavengerScanCacheMinimumSize
	public UDATAPointer scavengerScanCacheMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerScanCacheMinimumSizeOffset_));
	}

	// MM_GCExtensionsBase$ScavengerScanOrdering scavengerScanOrdering
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerScanOrderingOffset_", declaredType="MM_GCExtensionsBase$ScavengerScanOrdering")
	public long scavengerScanOrdering() throws CorruptDataException {
		if (MM_GCExtensionsBase$ScavengerScanOrdering.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._scavengerScanOrderingOffset_);
		} else if (MM_GCExtensionsBase$ScavengerScanOrdering.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._scavengerScanOrderingOffset_);
		} else if (MM_GCExtensionsBase$ScavengerScanOrdering.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._scavengerScanOrderingOffset_);
		} else if (MM_GCExtensionsBase$ScavengerScanOrdering.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._scavengerScanOrderingOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensionsBase$ScavengerScanOrdering scavengerScanOrdering
	public EnumPointer scavengerScanOrderingEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerScanOrderingOffset_), MM_GCExtensionsBase$ScavengerScanOrdering.class);
	}

	// MM_ScavengerStats scavengerStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerStatsOffset_", declaredType="MM_ScavengerStats")
	public MM_ScavengerStatsPointer scavengerStats() throws CorruptDataException {
		return MM_ScavengerStatsPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerStatsOffset_));
	}

	// MM_ScavengerStats scavengerStats
	public PointerPointer scavengerStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scavengerStatsOffset_));
	}

	// U64 scvArraySplitMaximumAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvArraySplitMaximumAmountOffset_", declaredType="U64")
	public UDATA scvArraySplitMaximumAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvArraySplitMaximumAmountOffset_));
	}

	// U64 scvArraySplitMaximumAmount
	public UDATAPointer scvArraySplitMaximumAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvArraySplitMaximumAmountOffset_));
	}

	// U64 scvArraySplitMinimumAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvArraySplitMinimumAmountOffset_", declaredType="U64")
	public UDATA scvArraySplitMinimumAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvArraySplitMinimumAmountOffset_));
	}

	// U64 scvArraySplitMinimumAmount
	public UDATAPointer scvArraySplitMinimumAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvArraySplitMinimumAmountOffset_));
	}

	// U64 scvTenureAdaptiveTenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureAdaptiveTenureAgeOffset_", declaredType="U64")
	public UDATA scvTenureAdaptiveTenureAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvTenureAdaptiveTenureAgeOffset_));
	}

	// U64 scvTenureAdaptiveTenureAge
	public UDATAPointer scvTenureAdaptiveTenureAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureAdaptiveTenureAgeOffset_));
	}

	// U64 scvTenureFixedTenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureFixedTenureAgeOffset_", declaredType="U64")
	public UDATA scvTenureFixedTenureAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvTenureFixedTenureAgeOffset_));
	}

	// U64 scvTenureFixedTenureAge
	public UDATAPointer scvTenureFixedTenureAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureFixedTenureAgeOffset_));
	}

	// U64 scvTenureRatioHigh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureRatioHighOffset_", declaredType="U64")
	public UDATA scvTenureRatioHigh() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvTenureRatioHighOffset_));
	}

	// U64 scvTenureRatioHigh
	public UDATAPointer scvTenureRatioHighEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureRatioHighOffset_));
	}

	// U64 scvTenureRatioLow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureRatioLowOffset_", declaredType="U64")
	public UDATA scvTenureRatioLow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._scvTenureRatioLowOffset_));
	}

	// U64 scvTenureRatioLow
	public UDATAPointer scvTenureRatioLowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureRatioLowOffset_));
	}

	// bool scvTenureStrategyAdaptive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureStrategyAdaptiveOffset_", declaredType="bool")
	public boolean scvTenureStrategyAdaptive() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scvTenureStrategyAdaptiveOffset_);
	}

	// bool scvTenureStrategyAdaptive
	public BoolPointer scvTenureStrategyAdaptiveEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureStrategyAdaptiveOffset_));
	}

	// bool scvTenureStrategyFixed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureStrategyFixedOffset_", declaredType="bool")
	public boolean scvTenureStrategyFixed() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scvTenureStrategyFixedOffset_);
	}

	// bool scvTenureStrategyFixed
	public BoolPointer scvTenureStrategyFixedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureStrategyFixedOffset_));
	}

	// bool scvTenureStrategyHistory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureStrategyHistoryOffset_", declaredType="bool")
	public boolean scvTenureStrategyHistory() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scvTenureStrategyHistoryOffset_);
	}

	// bool scvTenureStrategyHistory
	public BoolPointer scvTenureStrategyHistoryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureStrategyHistoryOffset_));
	}

	// bool scvTenureStrategyLookback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureStrategyLookbackOffset_", declaredType="bool")
	public boolean scvTenureStrategyLookback() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._scvTenureStrategyLookbackOffset_);
	}

	// bool scvTenureStrategyLookback
	public BoolPointer scvTenureStrategyLookbackEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureStrategyLookbackOffset_));
	}

	// double scvTenureStrategySurvivalThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureStrategySurvivalThresholdOffset_", declaredType="double")
	public double scvTenureStrategySurvivalThreshold() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._scvTenureStrategySurvivalThresholdOffset_);
	}

	// double scvTenureStrategySurvivalThreshold
	public DoublePointer scvTenureStrategySurvivalThresholdEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._scvTenureStrategySurvivalThresholdOffset_));
	}

	// void* shadowHeapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shadowHeapBaseOffset_", declaredType="void*")
	public VoidPointer shadowHeapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._shadowHeapBaseOffset_));
	}

	// void* shadowHeapBase
	public PointerPointer shadowHeapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shadowHeapBaseOffset_));
	}

	// MM_MemoryHandle shadowHeapHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shadowHeapHandleOffset_", declaredType="MM_MemoryHandle")
	public MM_MemoryHandlePointer shadowHeapHandle() throws CorruptDataException {
		return MM_MemoryHandlePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shadowHeapHandleOffset_));
	}

	// MM_MemoryHandle shadowHeapHandle
	public PointerPointer shadowHeapHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shadowHeapHandleOffset_));
	}

	// void* shadowHeapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shadowHeapTopOffset_", declaredType="void*")
	public VoidPointer shadowHeapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._shadowHeapTopOffset_));
	}

	// void* shadowHeapTop
	public PointerPointer shadowHeapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shadowHeapTopOffset_));
	}

	// bool shouldAllowShiftingCompression
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shouldAllowShiftingCompressionOffset_", declaredType="bool")
	public boolean shouldAllowShiftingCompression() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._shouldAllowShiftingCompressionOffset_);
	}

	// bool shouldAllowShiftingCompression
	public BoolPointer shouldAllowShiftingCompressionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shouldAllowShiftingCompressionOffset_));
	}

	// bool shouldForceLowMemoryHeapCeilingShiftIfPossible
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shouldForceLowMemoryHeapCeilingShiftIfPossibleOffset_", declaredType="bool")
	public boolean shouldForceLowMemoryHeapCeilingShiftIfPossible() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._shouldForceLowMemoryHeapCeilingShiftIfPossibleOffset_);
	}

	// bool shouldForceLowMemoryHeapCeilingShiftIfPossible
	public BoolPointer shouldForceLowMemoryHeapCeilingShiftIfPossibleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shouldForceLowMemoryHeapCeilingShiftIfPossibleOffset_));
	}

	// bool shouldForceSpecifiedShiftingCompression
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shouldForceSpecifiedShiftingCompressionOffset_", declaredType="bool")
	public boolean shouldForceSpecifiedShiftingCompression() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._shouldForceSpecifiedShiftingCompressionOffset_);
	}

	// bool shouldForceSpecifiedShiftingCompression
	public BoolPointer shouldForceSpecifiedShiftingCompressionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._shouldForceSpecifiedShiftingCompressionOffset_));
	}

	// U64 softMx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMxOffset_", declaredType="U64")
	public UDATA softMx() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._softMxOffset_));
	}

	// U64 softMx
	public UDATAPointer softMxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._softMxOffset_));
	}

	// bool softwareRangeCheckReadBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softwareRangeCheckReadBarrierOffset_", declaredType="bool")
	public boolean softwareRangeCheckReadBarrier() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._softwareRangeCheckReadBarrierOffset_);
	}

	// bool softwareRangeCheckReadBarrier
	public BoolPointer softwareRangeCheckReadBarrierEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._softwareRangeCheckReadBarrierOffset_));
	}

	// U64 splitAvailableListSplitAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_splitAvailableListSplitAmountOffset_", declaredType="U64")
	public UDATA splitAvailableListSplitAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._splitAvailableListSplitAmountOffset_));
	}

	// U64 splitAvailableListSplitAmount
	public UDATAPointer splitAvailableListSplitAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._splitAvailableListSplitAmountOffset_));
	}

	// U64 splitFreeListNumberChunksPrepared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_splitFreeListNumberChunksPreparedOffset_", declaredType="U64")
	public UDATA splitFreeListNumberChunksPrepared() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._splitFreeListNumberChunksPreparedOffset_));
	}

	// U64 splitFreeListNumberChunksPrepared
	public UDATAPointer splitFreeListNumberChunksPreparedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._splitFreeListNumberChunksPreparedOffset_));
	}

	// U64 splitFreeListSplitAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_splitFreeListSplitAmountOffset_", declaredType="U64")
	public UDATA splitFreeListSplitAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._splitFreeListSplitAmountOffset_));
	}

	// U64 splitFreeListSplitAmount
	public UDATAPointer splitFreeListSplitAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._splitFreeListSplitAmountOffset_));
	}

	// MM_GCExtensionsBase$HeapInitializationSplitHeapSection splitHeapSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_splitHeapSectionOffset_", declaredType="MM_GCExtensionsBase$HeapInitializationSplitHeapSection")
	public long splitHeapSection() throws CorruptDataException {
		if (MM_GCExtensionsBase$HeapInitializationSplitHeapSection.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._splitHeapSectionOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationSplitHeapSection.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._splitHeapSectionOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationSplitHeapSection.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._splitHeapSectionOffset_);
		} else if (MM_GCExtensionsBase$HeapInitializationSplitHeapSection.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._splitHeapSectionOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensionsBase$HeapInitializationSplitHeapSection splitHeapSection
	public EnumPointer splitHeapSectionEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._splitHeapSectionOffset_), MM_GCExtensionsBase$HeapInitializationSplitHeapSection.class);
	}

	// U64 suballocatorCommitSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_suballocatorCommitSizeOffset_", declaredType="U64")
	public UDATA suballocatorCommitSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._suballocatorCommitSizeOffset_));
	}

	// U64 suballocatorCommitSize
	public UDATAPointer suballocatorCommitSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._suballocatorCommitSizeOffset_));
	}

	// U64 suballocatorInitialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_suballocatorInitialSizeOffset_", declaredType="U64")
	public UDATA suballocatorInitialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._suballocatorInitialSizeOffset_));
	}

	// U64 suballocatorInitialSize
	public UDATAPointer suballocatorInitialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._suballocatorInitialSizeOffset_));
	}

	// double survivorSpaceMaximumSizeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_survivorSpaceMaximumSizeRatioOffset_", declaredType="double")
	public double survivorSpaceMaximumSizeRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._survivorSpaceMaximumSizeRatioOffset_);
	}

	// double survivorSpaceMaximumSizeRatio
	public DoublePointer survivorSpaceMaximumSizeRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._survivorSpaceMaximumSizeRatioOffset_));
	}

	// double survivorSpaceMinimumSizeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_survivorSpaceMinimumSizeRatioOffset_", declaredType="double")
	public double survivorSpaceMinimumSizeRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._survivorSpaceMinimumSizeRatioOffset_);
	}

	// double survivorSpaceMinimumSizeRatio
	public DoublePointer survivorSpaceMinimumSizeRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._survivorSpaceMinimumSizeRatioOffset_));
	}

	// U64 sweepCostToCheckYield
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepCostToCheckYieldOffset_", declaredType="U64")
	public UDATA sweepCostToCheckYield() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._sweepCostToCheckYieldOffset_));
	}

	// U64 sweepCostToCheckYield
	public UDATAPointer sweepCostToCheckYieldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sweepCostToCheckYieldOffset_));
	}

	// MM_SweepHeapSectioning* sweepHeapSectioning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepHeapSectioningOffset_", declaredType="MM_SweepHeapSectioning*")
	public MM_SweepHeapSectioningPointer sweepHeapSectioning() throws CorruptDataException {
		return MM_SweepHeapSectioningPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._sweepHeapSectioningOffset_));
	}

	// MM_SweepHeapSectioning* sweepHeapSectioning
	public PointerPointer sweepHeapSectioningEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sweepHeapSectioningOffset_));
	}

	// MM_SweepPoolManagerAddressOrderedList* sweepPoolManagerAddressOrderedList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepPoolManagerAddressOrderedListOffset_", declaredType="MM_SweepPoolManagerAddressOrderedList*")
	public MM_SweepPoolManagerAddressOrderedListPointer sweepPoolManagerAddressOrderedList() throws CorruptDataException {
		return MM_SweepPoolManagerAddressOrderedListPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._sweepPoolManagerAddressOrderedListOffset_));
	}

	// MM_SweepPoolManagerAddressOrderedList* sweepPoolManagerAddressOrderedList
	public PointerPointer sweepPoolManagerAddressOrderedListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sweepPoolManagerAddressOrderedListOffset_));
	}

	// MM_SweepPoolManager* sweepPoolManagerBumpPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepPoolManagerBumpPointerOffset_", declaredType="MM_SweepPoolManager*")
	public MM_SweepPoolManagerPointer sweepPoolManagerBumpPointer() throws CorruptDataException {
		return MM_SweepPoolManagerPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._sweepPoolManagerBumpPointerOffset_));
	}

	// MM_SweepPoolManager* sweepPoolManagerBumpPointer
	public PointerPointer sweepPoolManagerBumpPointerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sweepPoolManagerBumpPointerOffset_));
	}

	// MM_SweepPoolManagerAddressOrderedListBase* sweepPoolManagerSmallObjectArea
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepPoolManagerSmallObjectAreaOffset_", declaredType="MM_SweepPoolManagerAddressOrderedListBase*")
	public MM_SweepPoolManagerAddressOrderedListBasePointer sweepPoolManagerSmallObjectArea() throws CorruptDataException {
		return MM_SweepPoolManagerAddressOrderedListBasePointer.cast(getPointerAtOffset(MM_GCExtensionsBase._sweepPoolManagerSmallObjectAreaOffset_));
	}

	// MM_SweepPoolManagerAddressOrderedListBase* sweepPoolManagerSmallObjectArea
	public PointerPointer sweepPoolManagerSmallObjectAreaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._sweepPoolManagerSmallObjectAreaOffset_));
	}

	// bool synchronousGCOnOOM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_synchronousGCOnOOMOffset_", declaredType="bool")
	public boolean synchronousGCOnOOM() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._synchronousGCOnOOMOffset_);
	}

	// bool synchronousGCOnOOM
	public BoolPointer synchronousGCOnOOMEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._synchronousGCOnOOMOffset_));
	}

	// U64 targetUtilizationPercentage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetUtilizationPercentageOffset_", declaredType="U64")
	public UDATA targetUtilizationPercentage() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._targetUtilizationPercentageOffset_));
	}

	// U64 targetUtilizationPercentage
	public UDATAPointer targetUtilizationPercentageEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._targetUtilizationPercentageOffset_));
	}

	// bool tarokAllocationAgeEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAllocationAgeEnabledOffset_", declaredType="bool")
	public boolean tarokAllocationAgeEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokAllocationAgeEnabledOffset_);
	}

	// bool tarokAllocationAgeEnabled
	public BoolPointer tarokAllocationAgeEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAllocationAgeEnabledOffset_));
	}

	// double tarokAllocationAgeExponentBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAllocationAgeExponentBaseOffset_", declaredType="double")
	public double tarokAllocationAgeExponentBase() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokAllocationAgeExponentBaseOffset_);
	}

	// double tarokAllocationAgeExponentBase
	public DoublePointer tarokAllocationAgeExponentBaseEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAllocationAgeExponentBaseOffset_));
	}

	// U64 tarokAllocationAgeUnit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAllocationAgeUnitOffset_", declaredType="U64")
	public UDATA tarokAllocationAgeUnit() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokAllocationAgeUnitOffset_));
	}

	// U64 tarokAllocationAgeUnit
	public UDATAPointer tarokAllocationAgeUnitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAllocationAgeUnitOffset_));
	}

	// bool tarokAttachedThreadsAreCommon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAttachedThreadsAreCommonOffset_", declaredType="bool")
	public boolean tarokAttachedThreadsAreCommon() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokAttachedThreadsAreCommonOffset_);
	}

	// bool tarokAttachedThreadsAreCommon
	public BoolPointer tarokAttachedThreadsAreCommonEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAttachedThreadsAreCommonOffset_));
	}

	// bool tarokAutomaticDefragmentEmptinessThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAutomaticDefragmentEmptinessThresholdOffset_", declaredType="bool")
	public boolean tarokAutomaticDefragmentEmptinessThreshold() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokAutomaticDefragmentEmptinessThresholdOffset_);
	}

	// bool tarokAutomaticDefragmentEmptinessThreshold
	public BoolPointer tarokAutomaticDefragmentEmptinessThresholdEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAutomaticDefragmentEmptinessThresholdOffset_));
	}

	// bool tarokAutomaticGMPIntermission
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokAutomaticGMPIntermissionOffset_", declaredType="bool")
	public boolean tarokAutomaticGMPIntermission() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokAutomaticGMPIntermissionOffset_);
	}

	// bool tarokAutomaticGMPIntermission
	public BoolPointer tarokAutomaticGMPIntermissionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokAutomaticGMPIntermissionOffset_));
	}

	// double tarokConcurrentMarkingCostWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokConcurrentMarkingCostWeightOffset_", declaredType="double")
	public double tarokConcurrentMarkingCostWeight() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokConcurrentMarkingCostWeightOffset_);
	}

	// double tarokConcurrentMarkingCostWeight
	public DoublePointer tarokConcurrentMarkingCostWeightEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokConcurrentMarkingCostWeightOffset_));
	}

	// double tarokCopyForwardFragmentationTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokCopyForwardFragmentationTargetOffset_", declaredType="double")
	public double tarokCopyForwardFragmentationTarget() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokCopyForwardFragmentationTargetOffset_);
	}

	// double tarokCopyForwardFragmentationTarget
	public DoublePointer tarokCopyForwardFragmentationTargetEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokCopyForwardFragmentationTargetOffset_));
	}

	// U64 tarokCoreSamplingAbsoluteBudget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokCoreSamplingAbsoluteBudgetOffset_", declaredType="U64")
	public UDATA tarokCoreSamplingAbsoluteBudget() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokCoreSamplingAbsoluteBudgetOffset_));
	}

	// U64 tarokCoreSamplingAbsoluteBudget
	public UDATAPointer tarokCoreSamplingAbsoluteBudgetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokCoreSamplingAbsoluteBudgetOffset_));
	}

	// double tarokCoreSamplingPercentageBudget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokCoreSamplingPercentageBudgetOffset_", declaredType="double")
	public double tarokCoreSamplingPercentageBudget() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokCoreSamplingPercentageBudgetOffset_);
	}

	// double tarokCoreSamplingPercentageBudget
	public DoublePointer tarokCoreSamplingPercentageBudgetEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokCoreSamplingPercentageBudgetOffset_));
	}

	// bool tarokDebugEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokDebugEnabledOffset_", declaredType="bool")
	public boolean tarokDebugEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokDebugEnabledOffset_);
	}

	// bool tarokDebugEnabled
	public BoolPointer tarokDebugEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokDebugEnabledOffset_));
	}

	// double tarokDefragmentEmptinessThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokDefragmentEmptinessThresholdOffset_", declaredType="double")
	public double tarokDefragmentEmptinessThreshold() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokDefragmentEmptinessThresholdOffset_);
	}

	// double tarokDefragmentEmptinessThreshold
	public DoublePointer tarokDefragmentEmptinessThresholdEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokDefragmentEmptinessThresholdOffset_));
	}

	// U64 tarokDynamicCollectionSetSelectionAbsoluteBudget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokDynamicCollectionSetSelectionAbsoluteBudgetOffset_", declaredType="U64")
	public UDATA tarokDynamicCollectionSetSelectionAbsoluteBudget() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokDynamicCollectionSetSelectionAbsoluteBudgetOffset_));
	}

	// U64 tarokDynamicCollectionSetSelectionAbsoluteBudget
	public UDATAPointer tarokDynamicCollectionSetSelectionAbsoluteBudgetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokDynamicCollectionSetSelectionAbsoluteBudgetOffset_));
	}

	// double tarokDynamicCollectionSetSelectionPercentageBudget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokDynamicCollectionSetSelectionPercentageBudgetOffset_", declaredType="double")
	public double tarokDynamicCollectionSetSelectionPercentageBudget() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tarokDynamicCollectionSetSelectionPercentageBudgetOffset_);
	}

	// double tarokDynamicCollectionSetSelectionPercentageBudget
	public DoublePointer tarokDynamicCollectionSetSelectionPercentageBudgetEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokDynamicCollectionSetSelectionPercentageBudgetOffset_));
	}

	// bool tarokEnableAllocationPointerAssertion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableAllocationPointerAssertionOffset_", declaredType="bool")
	public boolean tarokEnableAllocationPointerAssertion() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableAllocationPointerAssertionOffset_);
	}

	// bool tarokEnableAllocationPointerAssertion
	public BoolPointer tarokEnableAllocationPointerAssertionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableAllocationPointerAssertionOffset_));
	}

	// bool tarokEnableCardScrubbing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableCardScrubbingOffset_", declaredType="bool")
	public boolean tarokEnableCardScrubbing() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableCardScrubbingOffset_);
	}

	// bool tarokEnableCardScrubbing
	public BoolPointer tarokEnableCardScrubbingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableCardScrubbingOffset_));
	}

	// bool tarokEnableCompressedCardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableCompressedCardTableOffset_", declaredType="bool")
	public boolean tarokEnableCompressedCardTable() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableCompressedCardTableOffset_);
	}

	// bool tarokEnableCompressedCardTable
	public BoolPointer tarokEnableCompressedCardTableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableCompressedCardTableOffset_));
	}

	// bool tarokEnableConcurrentGMP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableConcurrentGMPOffset_", declaredType="bool")
	public boolean tarokEnableConcurrentGMP() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableConcurrentGMPOffset_);
	}

	// bool tarokEnableConcurrentGMP
	public BoolPointer tarokEnableConcurrentGMPEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableConcurrentGMPOffset_));
	}

	// bool tarokEnableCopyForwardHybrid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableCopyForwardHybridOffset_", declaredType="bool")
	public boolean tarokEnableCopyForwardHybrid() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableCopyForwardHybridOffset_);
	}

	// bool tarokEnableCopyForwardHybrid
	public BoolPointer tarokEnableCopyForwardHybridEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableCopyForwardHybridOffset_));
	}

	// bool tarokEnableDynamicCollectionSetSelection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableDynamicCollectionSetSelectionOffset_", declaredType="bool")
	public boolean tarokEnableDynamicCollectionSetSelection() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableDynamicCollectionSetSelectionOffset_);
	}

	// bool tarokEnableDynamicCollectionSetSelection
	public BoolPointer tarokEnableDynamicCollectionSetSelectionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableDynamicCollectionSetSelectionOffset_));
	}

	// bool tarokEnableExpensiveAssertions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableExpensiveAssertionsOffset_", declaredType="bool")
	public boolean tarokEnableExpensiveAssertions() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableExpensiveAssertionsOffset_);
	}

	// bool tarokEnableExpensiveAssertions
	public BoolPointer tarokEnableExpensiveAssertionsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableExpensiveAssertionsOffset_));
	}

	// bool tarokEnableIncrementalClassGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableIncrementalClassGCOffset_", declaredType="bool")
	public boolean tarokEnableIncrementalClassGC() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableIncrementalClassGCOffset_);
	}

	// bool tarokEnableIncrementalClassGC
	public BoolPointer tarokEnableIncrementalClassGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableIncrementalClassGCOffset_));
	}

	// bool tarokEnableIncrementalGMP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableIncrementalGMPOffset_", declaredType="bool")
	public boolean tarokEnableIncrementalGMP() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableIncrementalGMPOffset_);
	}

	// bool tarokEnableIncrementalGMP
	public BoolPointer tarokEnableIncrementalGMPEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableIncrementalGMPOffset_));
	}

	// bool tarokEnableLeafFirstCopying
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableLeafFirstCopyingOffset_", declaredType="bool")
	public boolean tarokEnableLeafFirstCopying() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableLeafFirstCopyingOffset_);
	}

	// bool tarokEnableLeafFirstCopying
	public BoolPointer tarokEnableLeafFirstCopyingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableLeafFirstCopyingOffset_));
	}

	// bool tarokEnableRecoverRegionTailsAfterSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableRecoverRegionTailsAfterSweepOffset_", declaredType="bool")
	public boolean tarokEnableRecoverRegionTailsAfterSweep() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableRecoverRegionTailsAfterSweepOffset_);
	}

	// bool tarokEnableRecoverRegionTailsAfterSweep
	public BoolPointer tarokEnableRecoverRegionTailsAfterSweepEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableRecoverRegionTailsAfterSweepOffset_));
	}

	// bool tarokEnableScoreBasedAtomicCompact
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableScoreBasedAtomicCompactOffset_", declaredType="bool")
	public boolean tarokEnableScoreBasedAtomicCompact() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableScoreBasedAtomicCompactOffset_);
	}

	// bool tarokEnableScoreBasedAtomicCompact
	public BoolPointer tarokEnableScoreBasedAtomicCompactEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableScoreBasedAtomicCompactOffset_));
	}

	// bool tarokEnableStableRegionDetection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokEnableStableRegionDetectionOffset_", declaredType="bool")
	public boolean tarokEnableStableRegionDetection() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokEnableStableRegionDetectionOffset_);
	}

	// bool tarokEnableStableRegionDetection
	public BoolPointer tarokEnableStableRegionDetectionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokEnableStableRegionDetectionOffset_));
	}

	// bool tarokForceKickoffHeadroomInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokForceKickoffHeadroomInBytesOffset_", declaredType="bool")
	public boolean tarokForceKickoffHeadroomInBytes() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokForceKickoffHeadroomInBytesOffset_);
	}

	// bool tarokForceKickoffHeadroomInBytes
	public BoolPointer tarokForceKickoffHeadroomInBytesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokForceKickoffHeadroomInBytesOffset_));
	}

	// U64 tarokGMPIntermission
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokGMPIntermissionOffset_", declaredType="U64")
	public UDATA tarokGMPIntermission() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokGMPIntermissionOffset_));
	}

	// U64 tarokGMPIntermission
	public UDATAPointer tarokGMPIntermissionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokGMPIntermissionOffset_));
	}

	// U64 tarokGlobalMarkIncrementTimeMillis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokGlobalMarkIncrementTimeMillisOffset_", declaredType="U64")
	public UDATA tarokGlobalMarkIncrementTimeMillis() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokGlobalMarkIncrementTimeMillisOffset_));
	}

	// U64 tarokGlobalMarkIncrementTimeMillis
	public UDATAPointer tarokGlobalMarkIncrementTimeMillisEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokGlobalMarkIncrementTimeMillisOffset_));
	}

	// U64 tarokIdealEdenMaximumBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokIdealEdenMaximumBytesOffset_", declaredType="U64")
	public UDATA tarokIdealEdenMaximumBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokIdealEdenMaximumBytesOffset_));
	}

	// U64 tarokIdealEdenMaximumBytes
	public UDATAPointer tarokIdealEdenMaximumBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokIdealEdenMaximumBytesOffset_));
	}

	// U64 tarokIdealEdenMinimumBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokIdealEdenMinimumBytesOffset_", declaredType="U64")
	public UDATA tarokIdealEdenMinimumBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokIdealEdenMinimumBytesOffset_));
	}

	// U64 tarokIdealEdenMinimumBytes
	public UDATAPointer tarokIdealEdenMinimumBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokIdealEdenMinimumBytesOffset_));
	}

	// U64 tarokKickoffHeadroomInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokKickoffHeadroomInBytesOffset_", declaredType="U64")
	public UDATA tarokKickoffHeadroomInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokKickoffHeadroomInBytesOffset_));
	}

	// U64 tarokKickoffHeadroomInBytes
	public UDATAPointer tarokKickoffHeadroomInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokKickoffHeadroomInBytesOffset_));
	}

	// U32 tarokKickoffHeadroomRegionRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokKickoffHeadroomRegionRateOffset_", declaredType="U32")
	public UDATA tarokKickoffHeadroomRegionRate() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensionsBase._tarokKickoffHeadroomRegionRateOffset_));
	}

	// U32 tarokKickoffHeadroomRegionRate
	public UDATAPointer tarokKickoffHeadroomRegionRateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokKickoffHeadroomRegionRateOffset_));
	}

	// U64 tarokMaximumAgeInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokMaximumAgeInBytesOffset_", declaredType="U64")
	public UDATA tarokMaximumAgeInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokMaximumAgeInBytesOffset_));
	}

	// U64 tarokMaximumAgeInBytes
	public UDATAPointer tarokMaximumAgeInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokMaximumAgeInBytesOffset_));
	}

	// U64 tarokMaximumNurseryAgeInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokMaximumNurseryAgeInBytesOffset_", declaredType="U64")
	public UDATA tarokMaximumNurseryAgeInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokMaximumNurseryAgeInBytesOffset_));
	}

	// U64 tarokMaximumNurseryAgeInBytes
	public UDATAPointer tarokMaximumNurseryAgeInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokMaximumNurseryAgeInBytesOffset_));
	}

	// MM_UserSpecifiedParameterUDATA tarokMinimumGMPWorkTargetBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokMinimumGMPWorkTargetBytesOffset_", declaredType="MM_UserSpecifiedParameterUDATA")
	public MM_UserSpecifiedParameterUDATAPointer tarokMinimumGMPWorkTargetBytes() throws CorruptDataException {
		return MM_UserSpecifiedParameterUDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokMinimumGMPWorkTargetBytesOffset_));
	}

	// MM_UserSpecifiedParameterUDATA tarokMinimumGMPWorkTargetBytes
	public PointerPointer tarokMinimumGMPWorkTargetBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokMinimumGMPWorkTargetBytesOffset_));
	}

	// MM_UserSpecifiedParameterUDATA tarokNurseryMaxAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokNurseryMaxAgeOffset_", declaredType="MM_UserSpecifiedParameterUDATA")
	public MM_UserSpecifiedParameterUDATAPointer tarokNurseryMaxAge() throws CorruptDataException {
		return MM_UserSpecifiedParameterUDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokNurseryMaxAgeOffset_));
	}

	// MM_UserSpecifiedParameterUDATA tarokNurseryMaxAge
	public PointerPointer tarokNurseryMaxAgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokNurseryMaxAgeOffset_));
	}

	// bool tarokPGCShouldCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokPGCShouldCopyForwardOffset_", declaredType="bool")
	public boolean tarokPGCShouldCopyForward() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokPGCShouldCopyForwardOffset_);
	}

	// bool tarokPGCShouldCopyForward
	public BoolPointer tarokPGCShouldCopyForwardEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokPGCShouldCopyForwardOffset_));
	}

	// bool tarokPGCShouldMarkCompact
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokPGCShouldMarkCompactOffset_", declaredType="bool")
	public boolean tarokPGCShouldMarkCompact() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokPGCShouldMarkCompactOffset_);
	}

	// bool tarokPGCShouldMarkCompact
	public BoolPointer tarokPGCShouldMarkCompactEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokPGCShouldMarkCompactOffset_));
	}

	// U64 tarokPGCtoGMPDenominator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokPGCtoGMPDenominatorOffset_", declaredType="U64")
	public UDATA tarokPGCtoGMPDenominator() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokPGCtoGMPDenominatorOffset_));
	}

	// U64 tarokPGCtoGMPDenominator
	public UDATAPointer tarokPGCtoGMPDenominatorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokPGCtoGMPDenominatorOffset_));
	}

	// U64 tarokPGCtoGMPNumerator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokPGCtoGMPNumeratorOffset_", declaredType="U64")
	public UDATA tarokPGCtoGMPNumerator() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokPGCtoGMPNumeratorOffset_));
	}

	// U64 tarokPGCtoGMPNumerator
	public UDATAPointer tarokPGCtoGMPNumeratorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokPGCtoGMPNumeratorOffset_));
	}

	// U64 tarokRegionMaxAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokRegionMaxAgeOffset_", declaredType="U64")
	public UDATA tarokRegionMaxAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokRegionMaxAgeOffset_));
	}

	// U64 tarokRegionMaxAge
	public UDATAPointer tarokRegionMaxAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokRegionMaxAgeOffset_));
	}

	// U64 tarokRememberedSetCardListMaxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokRememberedSetCardListMaxSizeOffset_", declaredType="U64")
	public UDATA tarokRememberedSetCardListMaxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokRememberedSetCardListMaxSizeOffset_));
	}

	// U64 tarokRememberedSetCardListMaxSize
	public UDATAPointer tarokRememberedSetCardListMaxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokRememberedSetCardListMaxSizeOffset_));
	}

	// U64 tarokRememberedSetCardListSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokRememberedSetCardListSizeOffset_", declaredType="U64")
	public UDATA tarokRememberedSetCardListSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokRememberedSetCardListSizeOffset_));
	}

	// U64 tarokRememberedSetCardListSize
	public UDATAPointer tarokRememberedSetCardListSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokRememberedSetCardListSizeOffset_));
	}

	// MM_GCExtensionsBase$ReserveRegions tarokReserveRegionsFromCollectionSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokReserveRegionsFromCollectionSetOffset_", declaredType="MM_GCExtensionsBase$ReserveRegions")
	public long tarokReserveRegionsFromCollectionSet() throws CorruptDataException {
		if (MM_GCExtensionsBase$ReserveRegions.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._tarokReserveRegionsFromCollectionSetOffset_);
		} else if (MM_GCExtensionsBase$ReserveRegions.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._tarokReserveRegionsFromCollectionSetOffset_);
		} else if (MM_GCExtensionsBase$ReserveRegions.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._tarokReserveRegionsFromCollectionSetOffset_);
		} else if (MM_GCExtensionsBase$ReserveRegions.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._tarokReserveRegionsFromCollectionSetOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensionsBase$ReserveRegions tarokReserveRegionsFromCollectionSet
	public EnumPointer tarokReserveRegionsFromCollectionSetEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokReserveRegionsFromCollectionSetOffset_), MM_GCExtensionsBase$ReserveRegions.class);
	}

	// MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder tarokTailCandidateListSortOrder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokTailCandidateListSortOrderOffset_", declaredType="MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder")
	public long tarokTailCandidateListSortOrder() throws CorruptDataException {
		if (MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensionsBase._tarokTailCandidateListSortOrderOffset_);
		} else if (MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensionsBase._tarokTailCandidateListSortOrderOffset_);
		} else if (MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensionsBase._tarokTailCandidateListSortOrderOffset_);
		} else if (MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensionsBase._tarokTailCandidateListSortOrderOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder tarokTailCandidateListSortOrder
	public EnumPointer tarokTailCandidateListSortOrderEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokTailCandidateListSortOrderOffset_), MM_GCExtensionsBase$TarokRegionTailCondidateListSortOrder.class);
	}

	// bool tarokTgcEnableRememberedSetDuplicateDetection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokTgcEnableRememberedSetDuplicateDetectionOffset_", declaredType="bool")
	public boolean tarokTgcEnableRememberedSetDuplicateDetection() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokTgcEnableRememberedSetDuplicateDetectionOffset_);
	}

	// bool tarokTgcEnableRememberedSetDuplicateDetection
	public BoolPointer tarokTgcEnableRememberedSetDuplicateDetectionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokTgcEnableRememberedSetDuplicateDetectionOffset_));
	}

	// void* tarokTgcSetSelectionDataTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokTgcSetSelectionDataTableOffset_", declaredType="void*")
	public VoidPointer tarokTgcSetSelectionDataTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._tarokTgcSetSelectionDataTableOffset_));
	}

	// void* tarokTgcSetSelectionDataTable
	public PointerPointer tarokTgcSetSelectionDataTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokTgcSetSelectionDataTableOffset_));
	}

	// bool tarokUseProjectedSurvivalCollectionSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokUseProjectedSurvivalCollectionSetOffset_", declaredType="bool")
	public boolean tarokUseProjectedSurvivalCollectionSet() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tarokUseProjectedSurvivalCollectionSetOffset_);
	}

	// bool tarokUseProjectedSurvivalCollectionSet
	public BoolPointer tarokUseProjectedSurvivalCollectionSetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokUseProjectedSurvivalCollectionSetOffset_));
	}

	// U64 tarokWorkSplittingPeriod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokWorkSplittingPeriodOffset_", declaredType="U64")
	public UDATA tarokWorkSplittingPeriod() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tarokWorkSplittingPeriodOffset_));
	}

	// U64 tarokWorkSplittingPeriod
	public UDATAPointer tarokWorkSplittingPeriodEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tarokWorkSplittingPeriodOffset_));
	}

	// float tenureBytesDeviationBoost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureBytesDeviationBoostOffset_", declaredType="float")
	public float tenureBytesDeviationBoost() throws CorruptDataException {
		return getFloatAtOffset(MM_GCExtensionsBase._tenureBytesDeviationBoostOffset_);
	}

	// float tenureBytesDeviationBoost
	public FloatPointer tenureBytesDeviationBoostEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tenureBytesDeviationBoostOffset_));
	}

	// bool tiltedScavenge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tiltedScavengeOffset_", declaredType="bool")
	public boolean tiltedScavenge() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._tiltedScavengeOffset_);
	}

	// bool tiltedScavenge
	public BoolPointer tiltedScavengeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tiltedScavengeOffset_));
	}

	// double tiltedScavengeMaximumIncrease
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tiltedScavengeMaximumIncreaseOffset_", declaredType="double")
	public double tiltedScavengeMaximumIncrease() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensionsBase._tiltedScavengeMaximumIncreaseOffset_);
	}

	// double tiltedScavengeMaximumIncrease
	public DoublePointer tiltedScavengeMaximumIncreaseEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tiltedScavengeMaximumIncreaseOffset_));
	}

	// U64 timeWindowMicro
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timeWindowMicroOffset_", declaredType="U64")
	public UDATA timeWindowMicro() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._timeWindowMicroOffset_));
	}

	// U64 timeWindowMicro
	public UDATAPointer timeWindowMicroEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._timeWindowMicroOffset_));
	}

	// U64 tlhIncrementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhIncrementSizeOffset_", declaredType="U64")
	public UDATA tlhIncrementSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhIncrementSizeOffset_));
	}

	// U64 tlhIncrementSize
	public UDATAPointer tlhIncrementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhIncrementSizeOffset_));
	}

	// U64 tlhInitialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhInitialSizeOffset_", declaredType="U64")
	public UDATA tlhInitialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhInitialSizeOffset_));
	}

	// U64 tlhInitialSize
	public UDATAPointer tlhInitialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhInitialSizeOffset_));
	}

	// U64 tlhMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhMaximumSizeOffset_", declaredType="U64")
	public UDATA tlhMaximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhMaximumSizeOffset_));
	}

	// U64 tlhMaximumSize
	public UDATAPointer tlhMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhMaximumSizeOffset_));
	}

	// U64 tlhMinimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhMinimumSizeOffset_", declaredType="U64")
	public UDATA tlhMinimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhMinimumSizeOffset_));
	}

	// U64 tlhMinimumSize
	public UDATAPointer tlhMinimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhMinimumSizeOffset_));
	}

	// U64 tlhSurvivorDiscardThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhSurvivorDiscardThresholdOffset_", declaredType="U64")
	public UDATA tlhSurvivorDiscardThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhSurvivorDiscardThresholdOffset_));
	}

	// U64 tlhSurvivorDiscardThreshold
	public UDATAPointer tlhSurvivorDiscardThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhSurvivorDiscardThresholdOffset_));
	}

	// U64 tlhTenureDiscardThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhTenureDiscardThresholdOffset_", declaredType="U64")
	public UDATA tlhTenureDiscardThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._tlhTenureDiscardThresholdOffset_));
	}

	// U64 tlhTenureDiscardThreshold
	public UDATAPointer tlhTenureDiscardThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._tlhTenureDiscardThresholdOffset_));
	}

	// U64 traceCostToCheckYield
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceCostToCheckYieldOffset_", declaredType="U64")
	public UDATA traceCostToCheckYield() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._traceCostToCheckYieldOffset_));
	}

	// U64 traceCostToCheckYield
	public UDATAPointer traceCostToCheckYieldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._traceCostToCheckYieldOffset_));
	}

	// bool trackMutatorThreadCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_trackMutatorThreadCategoryOffset_", declaredType="bool")
	public boolean trackMutatorThreadCategory() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._trackMutatorThreadCategoryOffset_);
	}

	// bool trackMutatorThreadCategory
	public BoolPointer trackMutatorThreadCategoryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._trackMutatorThreadCategoryOffset_));
	}

	// U64 usablePhysicalMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usablePhysicalMemoryOffset_", declaredType="U64")
	public UDATA usablePhysicalMemory() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._usablePhysicalMemoryOffset_));
	}

	// U64 usablePhysicalMemory
	public UDATAPointer usablePhysicalMemoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._usablePhysicalMemoryOffset_));
	}

	// bool useGCStartupHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_useGCStartupHintsOffset_", declaredType="bool")
	public boolean useGCStartupHints() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._useGCStartupHintsOffset_);
	}

	// bool useGCStartupHints
	public BoolPointer useGCStartupHintsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._useGCStartupHintsOffset_));
	}

	// U64 verbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseOffset_", declaredType="U64")
	public UDATA verbose() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._verboseOffset_));
	}

	// U64 verbose
	public UDATAPointer verboseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._verboseOffset_));
	}

	// bool verboseExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseExtensionsOffset_", declaredType="bool")
	public boolean verboseExtensions() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._verboseExtensionsOffset_);
	}

	// bool verboseExtensions
	public BoolPointer verboseExtensionsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._verboseExtensionsOffset_));
	}

	// MM_VerboseManagerBase* verboseGCManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseGCManagerOffset_", declaredType="MM_VerboseManagerBase*")
	public MM_VerboseManagerBasePointer verboseGCManager() throws CorruptDataException {
		return MM_VerboseManagerBasePointer.cast(getPointerAtOffset(MM_GCExtensionsBase._verboseGCManagerOffset_));
	}

	// MM_VerboseManagerBase* verboseGCManager
	public PointerPointer verboseGCManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._verboseGCManagerOffset_));
	}

	// bool verboseNewFormat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseNewFormatOffset_", declaredType="bool")
	public boolean verboseNewFormat() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensionsBase._verboseNewFormatOffset_);
	}

	// bool verboseNewFormat
	public BoolPointer verboseNewFormatEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._verboseNewFormatOffset_));
	}

	// U64 verbosegcCycleTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verbosegcCycleTimeOffset_", declaredType="U64")
	public UDATA verbosegcCycleTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._verbosegcCycleTimeOffset_));
	}

	// U64 verbosegcCycleTime
	public UDATAPointer verbosegcCycleTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._verbosegcCycleTimeOffset_));
	}

	// OMR_VMThread* vmThreadAllocatedMost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadAllocatedMostOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer vmThreadAllocatedMost() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_GCExtensionsBase._vmThreadAllocatedMostOffset_));
	}

	// OMR_VMThread* vmThreadAllocatedMost
	public PointerPointer vmThreadAllocatedMostEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._vmThreadAllocatedMostOffset_));
	}

	// U64 workpacketCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workpacketCountOffset_", declaredType="U64")
	public UDATA workpacketCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCExtensionsBase._workpacketCountOffset_));
	}

	// U64 workpacketCount
	public UDATAPointer workpacketCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensionsBase._workpacketCountOffset_));
	}

}
