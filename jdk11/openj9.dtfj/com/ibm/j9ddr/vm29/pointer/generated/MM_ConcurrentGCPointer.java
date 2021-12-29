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
 * Structure: MM_ConcurrentGCPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentGC.class)
public class MM_ConcurrentGCPointer extends MM_ParallelGlobalGCPointer {

	// NULL
	public static final MM_ConcurrentGCPointer NULL = new MM_ConcurrentGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentGCPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentGCPointer(address);
	}

	public MM_ConcurrentGCPointer add(long count) {
		return MM_ConcurrentGCPointer.cast(address + (MM_ConcurrentGC.SIZEOF * count));
	}

	public MM_ConcurrentGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentGCPointer addOffset(long offset) {
		return MM_ConcurrentGCPointer.cast(address + offset);
	}

	public MM_ConcurrentGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentGCPointer sub(long count) {
		return MM_ConcurrentGCPointer.cast(address - (MM_ConcurrentGC.SIZEOF * count));
	}

	public MM_ConcurrentGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentGCPointer subOffset(long offset) {
		return MM_ConcurrentGCPointer.cast(address - offset);
	}

	public MM_ConcurrentGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentGCPointer untag(long mask) {
		return MM_ConcurrentGCPointer.cast(address & ~mask);
	}

	public MM_ConcurrentGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentGC.SIZEOF;
	}

	// Implementation methods

	// float _alloc2ConHelperTraceRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__alloc2ConHelperTraceRateOffset_", declaredType="float")
	public float _alloc2ConHelperTraceRate() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__alloc2ConHelperTraceRateOffset_);
	}

	// float _alloc2ConHelperTraceRate
	public FloatPointer _alloc2ConHelperTraceRateEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__alloc2ConHelperTraceRateOffset_));
	}

	// U64 _allocToInitRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToInitRateOffset_", declaredType="U64")
	public UDATA _allocToInitRate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__allocToInitRateOffset_));
	}

	// U64 _allocToInitRate
	public UDATAPointer _allocToInitRateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToInitRateOffset_));
	}

	// U64 _allocToTraceRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToTraceRateOffset_", declaredType="U64")
	public UDATA _allocToTraceRate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__allocToTraceRateOffset_));
	}

	// U64 _allocToTraceRate
	public UDATAPointer _allocToTraceRateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToTraceRateOffset_));
	}

	// U64 _allocToTraceRateCardCleanPass2Boost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToTraceRateCardCleanPass2BoostOffset_", declaredType="U64")
	public UDATA _allocToTraceRateCardCleanPass2Boost() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__allocToTraceRateCardCleanPass2BoostOffset_));
	}

	// U64 _allocToTraceRateCardCleanPass2Boost
	public UDATAPointer _allocToTraceRateCardCleanPass2BoostEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToTraceRateCardCleanPass2BoostOffset_));
	}

	// float _allocToTraceRateMaxFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToTraceRateMaxFactorOffset_", declaredType="float")
	public float _allocToTraceRateMaxFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__allocToTraceRateMaxFactorOffset_);
	}

	// float _allocToTraceRateMaxFactor
	public FloatPointer _allocToTraceRateMaxFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToTraceRateMaxFactorOffset_));
	}

	// float _allocToTraceRateMinFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToTraceRateMinFactorOffset_", declaredType="float")
	public float _allocToTraceRateMinFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__allocToTraceRateMinFactorOffset_);
	}

	// float _allocToTraceRateMinFactor
	public FloatPointer _allocToTraceRateMinFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToTraceRateMinFactorOffset_));
	}

	// U64 _allocToTraceRateNormal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocToTraceRateNormalOffset_", declaredType="U64")
	public UDATA _allocToTraceRateNormal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__allocToTraceRateNormalOffset_));
	}

	// U64 _allocToTraceRateNormal
	public UDATAPointer _allocToTraceRateNormalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__allocToTraceRateNormalOffset_));
	}

	// U64 _bytesToCleanPass1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesToCleanPass1Offset_", declaredType="U64")
	public UDATA _bytesToCleanPass1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__bytesToCleanPass1Offset_));
	}

	// U64 _bytesToCleanPass1
	public UDATAPointer _bytesToCleanPass1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__bytesToCleanPass1Offset_));
	}

	// U64 _bytesToCleanPass2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesToCleanPass2Offset_", declaredType="U64")
	public UDATA _bytesToCleanPass2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__bytesToCleanPass2Offset_));
	}

	// U64 _bytesToCleanPass2
	public UDATAPointer _bytesToCleanPass2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__bytesToCleanPass2Offset_));
	}

	// U64 _bytesToTracePass1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesToTracePass1Offset_", declaredType="U64")
	public UDATA _bytesToTracePass1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__bytesToTracePass1Offset_));
	}

	// U64 _bytesToTracePass1
	public UDATAPointer _bytesToTracePass1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__bytesToTracePass1Offset_));
	}

	// U64 _bytesToTracePass2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesToTracePass2Offset_", declaredType="U64")
	public UDATA _bytesToTracePass2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__bytesToTracePass2Offset_));
	}

	// U64 _bytesToTracePass2
	public UDATAPointer _bytesToTracePass2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__bytesToTracePass2Offset_));
	}

	// float _bytesTracedInPass1Factor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesTracedInPass1FactorOffset_", declaredType="float")
	public float _bytesTracedInPass1Factor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__bytesTracedInPass1FactorOffset_);
	}

	// float _bytesTracedInPass1Factor
	public FloatPointer _bytesTracedInPass1FactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__bytesTracedInPass1FactorOffset_));
	}

	// MM_ConcurrentSafepointCallback* _callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__callbackOffset_", declaredType="MM_ConcurrentSafepointCallback*")
	public MM_ConcurrentSafepointCallbackPointer _callback() throws CorruptDataException {
		return MM_ConcurrentSafepointCallbackPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__callbackOffset_));
	}

	// MM_ConcurrentSafepointCallback* _callback
	public PointerPointer _callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__callbackOffset_));
	}

	// float _cardCleaningFactorPass1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningFactorPass1Offset_", declaredType="float")
	public float _cardCleaningFactorPass1() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__cardCleaningFactorPass1Offset_);
	}

	// float _cardCleaningFactorPass1
	public FloatPointer _cardCleaningFactorPass1EA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__cardCleaningFactorPass1Offset_));
	}

	// float _cardCleaningFactorPass2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningFactorPass2Offset_", declaredType="float")
	public float _cardCleaningFactorPass2() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__cardCleaningFactorPass2Offset_);
	}

	// float _cardCleaningFactorPass2
	public FloatPointer _cardCleaningFactorPass2EA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__cardCleaningFactorPass2Offset_));
	}

	// float _cardCleaningThresholdFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningThresholdFactorOffset_", declaredType="float")
	public float _cardCleaningThresholdFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__cardCleaningThresholdFactorOffset_);
	}

	// float _cardCleaningThresholdFactor
	public FloatPointer _cardCleaningThresholdFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__cardCleaningThresholdFactorOffset_));
	}

	// MM_ConcurrentCardTable* _cardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableOffset_", declaredType="MM_ConcurrentCardTable*")
	public MM_ConcurrentCardTablePointer _cardTable() throws CorruptDataException {
		return MM_ConcurrentCardTablePointer.cast(getPointerAtOffset(MM_ConcurrentGC.__cardTableOffset_));
	}

	// MM_ConcurrentCardTable* _cardTable
	public PointerPointer _cardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__cardTableOffset_));
	}

	// U32 _conHelperThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelperThreadsOffset_", declaredType="U32")
	public UDATA _conHelperThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__conHelperThreadsOffset_));
	}

	// U32 _conHelperThreads
	public UDATAPointer _conHelperThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelperThreadsOffset_));
	}

	// omrthread_monitor_t _conHelpersActivationMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelpersActivationMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _conHelpersActivationMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__conHelpersActivationMonitorOffset_));
	}

	// omrthread_monitor_t _conHelpersActivationMonitor
	public PointerPointer _conHelpersActivationMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelpersActivationMonitorOffset_));
	}

	// ConHelperRequest _conHelpersRequest
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelpersRequestOffset_", declaredType="ConHelperRequest")
	public long _conHelpersRequest() throws CorruptDataException {
		if (MM_ConcurrentGC$ConHelperRequest.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGC.__conHelpersRequestOffset_);
		} else if (MM_ConcurrentGC$ConHelperRequest.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGC.__conHelpersRequestOffset_);
		} else if (MM_ConcurrentGC$ConHelperRequest.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGC.__conHelpersRequestOffset_);
		} else if (MM_ConcurrentGC$ConHelperRequest.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGC.__conHelpersRequestOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ConHelperRequest _conHelpersRequest
	public EnumPointer _conHelpersRequestEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelpersRequestOffset_), MM_ConcurrentGC$ConHelperRequest.class);
	}

	// volatile U32 _conHelpersShutdownCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelpersShutdownCountOffset_", declaredType="volatile U32")
	public UDATA _conHelpersShutdownCount() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__conHelpersShutdownCountOffset_));
	}

	// volatile U32 _conHelpersShutdownCount
	public UDATAPointer _conHelpersShutdownCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelpersShutdownCountOffset_));
	}

	// U32 _conHelpersStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelpersStartedOffset_", declaredType="U32")
	public UDATA _conHelpersStarted() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__conHelpersStartedOffset_));
	}

	// U32 _conHelpersStarted
	public UDATAPointer _conHelpersStartedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelpersStartedOffset_));
	}

	// omrthread_t* _conHelpersTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelpersTableOffset_", declaredType="omrthread_t*")
	public PointerPointer _conHelpersTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__conHelpersTableOffset_));
	}

	// omrthread_t* _conHelpersTable
	public PointerPointer _conHelpersTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__conHelpersTableOffset_));
	}

	// MM_CycleState _concurrentCycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCycleStateOffset_", declaredType="MM_CycleState")
	public MM_CycleStatePointer _concurrentCycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(nonNullFieldEA(MM_ConcurrentGC.__concurrentCycleStateOffset_));
	}

	// MM_CycleState _concurrentCycleState
	public PointerPointer _concurrentCycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__concurrentCycleStateOffset_));
	}

	// MM_ConcurrentMarkingDelegate _concurrentDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentDelegateOffset_", declaredType="MM_ConcurrentMarkingDelegate")
	public MM_ConcurrentMarkingDelegatePointer _concurrentDelegate() throws CorruptDataException {
		return MM_ConcurrentMarkingDelegatePointer.cast(nonNullFieldEA(MM_ConcurrentGC.__concurrentDelegateOffset_));
	}

	// MM_ConcurrentMarkingDelegate _concurrentDelegate
	public PointerPointer _concurrentDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__concurrentDelegateOffset_));
	}

	// omrthread_monitor_t _concurrentTuningMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentTuningMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _concurrentTuningMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__concurrentTuningMonitorOffset_));
	}

	// omrthread_monitor_t _concurrentTuningMonitor
	public PointerPointer _concurrentTuningMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__concurrentTuningMonitorOffset_));
	}

	// U32 _currentMeteringHistory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentMeteringHistoryOffset_", declaredType="U32")
	public UDATA _currentMeteringHistory() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__currentMeteringHistoryOffset_));
	}

	// U32 _currentMeteringHistory
	public UDATAPointer _currentMeteringHistoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__currentMeteringHistoryOffset_));
	}

	// bool _forcedKickoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forcedKickoffOffset_", declaredType="bool")
	public boolean _forcedKickoff() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__forcedKickoffOffset_);
	}

	// bool _forcedKickoff
	public BoolPointer _forcedKickoffEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__forcedKickoffOffset_));
	}

	// void* _heapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapAllocOffset_", declaredType="void*")
	public VoidPointer _heapAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__heapAllocOffset_));
	}

	// void* _heapAlloc
	public PointerPointer _heapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__heapAllocOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__heapBaseOffset_));
	}

	// InitWorkItem* _initRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initRangesOffset_", declaredType="InitWorkItem*")
	public MM_ConcurrentGC$InitWorkItemPointer _initRanges() throws CorruptDataException {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__initRangesOffset_));
	}

	// InitWorkItem* _initRanges
	public PointerPointer _initRangesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initRangesOffset_));
	}

	// bool _initSetupDone
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initSetupDoneOffset_", declaredType="bool")
	public boolean _initSetupDone() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__initSetupDoneOffset_);
	}

	// bool _initSetupDone
	public BoolPointer _initSetupDoneEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initSetupDoneOffset_));
	}

	// omrthread_monitor_t _initWorkCompleteMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initWorkCompleteMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _initWorkCompleteMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__initWorkCompleteMonitorOffset_));
	}

	// omrthread_monitor_t _initWorkCompleteMonitor
	public PointerPointer _initWorkCompleteMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initWorkCompleteMonitorOffset_));
	}

	// omrthread_monitor_t _initWorkMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initWorkMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _initWorkMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__initWorkMonitorOffset_));
	}

	// omrthread_monitor_t _initWorkMonitor
	public PointerPointer _initWorkMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initWorkMonitorOffset_));
	}

	// bool _initializeMarkMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializeMarkMapOffset_", declaredType="bool")
	public boolean _initializeMarkMap() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__initializeMarkMapOffset_);
	}

	// bool _initializeMarkMap
	public BoolPointer _initializeMarkMapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initializeMarkMapOffset_));
	}

	// U64 _initializers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializersOffset_", declaredType="U64")
	public UDATA _initializers() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__initializersOffset_));
	}

	// U64 _initializers
	public UDATAPointer _initializersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__initializersOffset_));
	}

	// U64 _kickoffThresholdBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__kickoffThresholdBufferOffset_", declaredType="U64")
	public UDATA _kickoffThresholdBuffer() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__kickoffThresholdBufferOffset_));
	}

	// U64 _kickoffThresholdBuffer
	public UDATAPointer _kickoffThresholdBufferEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__kickoffThresholdBufferOffset_));
	}

	// U64 _languageKickoffReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__languageKickoffReasonOffset_", declaredType="U64")
	public UDATA _languageKickoffReason() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__languageKickoffReasonOffset_));
	}

	// U64 _languageKickoffReason
	public UDATAPointer _languageKickoffReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__languageKickoffReasonOffset_));
	}

	// float _lastAverageAlloc2TraceRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastAverageAlloc2TraceRateOffset_", declaredType="float")
	public float _lastAverageAlloc2TraceRate() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__lastAverageAlloc2TraceRateOffset_);
	}

	// float _lastAverageAlloc2TraceRate
	public FloatPointer _lastAverageAlloc2TraceRateEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__lastAverageAlloc2TraceRateOffset_));
	}

	// U64 _lastConHelperTraceSizeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastConHelperTraceSizeCountOffset_", declaredType="U64")
	public UDATA _lastConHelperTraceSizeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__lastConHelperTraceSizeCountOffset_));
	}

	// U64 _lastConHelperTraceSizeCount
	public UDATAPointer _lastConHelperTraceSizeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__lastConHelperTraceSizeCountOffset_));
	}

	// volatile U64 _lastFreeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastFreeSizeOffset_", declaredType="volatile U64")
	public UDATA _lastFreeSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__lastFreeSizeOffset_));
	}

	// volatile U64 _lastFreeSize
	public UDATAPointer _lastFreeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__lastFreeSizeOffset_));
	}

	// U64 _lastTotalTraced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastTotalTracedOffset_", declaredType="U64")
	public UDATA _lastTotalTraced() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__lastTotalTracedOffset_));
	}

	// U64 _lastTotalTraced
	public UDATAPointer _lastTotalTracedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__lastTotalTracedOffset_));
	}

	// float _maxAverageAlloc2TraceRate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxAverageAlloc2TraceRateOffset_", declaredType="float")
	public float _maxAverageAlloc2TraceRate() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__maxAverageAlloc2TraceRateOffset_);
	}

	// float _maxAverageAlloc2TraceRate
	public FloatPointer _maxAverageAlloc2TraceRateEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__maxAverageAlloc2TraceRateOffset_));
	}

	// float _maxCardCleaningFactorPass1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxCardCleaningFactorPass1Offset_", declaredType="float")
	public float _maxCardCleaningFactorPass1() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__maxCardCleaningFactorPass1Offset_);
	}

	// float _maxCardCleaningFactorPass1
	public FloatPointer _maxCardCleaningFactorPass1EA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__maxCardCleaningFactorPass1Offset_));
	}

	// float _maxCardCleaningFactorPass2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxCardCleaningFactorPass2Offset_", declaredType="float")
	public float _maxCardCleaningFactorPass2() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__maxCardCleaningFactorPass2Offset_);
	}

	// float _maxCardCleaningFactorPass2
	public FloatPointer _maxCardCleaningFactorPass2EA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__maxCardCleaningFactorPass2Offset_));
	}

	// MeteringHistory* _meteringHistory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meteringHistoryOffset_", declaredType="MeteringHistory*")
	public MM_ConcurrentGC$MeteringHistoryPointer _meteringHistory() throws CorruptDataException {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(getPointerAtOffset(MM_ConcurrentGC.__meteringHistoryOffset_));
	}

	// MeteringHistory* _meteringHistory
	public PointerPointer _meteringHistoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__meteringHistoryOffset_));
	}

	// MeteringType _meteringType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__meteringTypeOffset_", declaredType="MeteringType")
	public long _meteringType() throws CorruptDataException {
		if (MM_ConcurrentGC$MeteringType.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGC.__meteringTypeOffset_);
		} else if (MM_ConcurrentGC$MeteringType.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGC.__meteringTypeOffset_);
		} else if (MM_ConcurrentGC$MeteringType.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGC.__meteringTypeOffset_);
		} else if (MM_ConcurrentGC$MeteringType.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGC.__meteringTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MeteringType _meteringType
	public EnumPointer _meteringTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__meteringTypeOffset_), MM_ConcurrentGC$MeteringType.class);
	}

	// volatile U32 _nextInitRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextInitRangeOffset_", declaredType="volatile U32")
	public UDATA _nextInitRange() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__nextInitRangeOffset_));
	}

	// volatile U32 _nextInitRange
	public UDATAPointer _nextInitRangeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__nextInitRangeOffset_));
	}

	// U32 _numInitRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numInitRangesOffset_", declaredType="U32")
	public UDATA _numInitRanges() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGC.__numInitRangesOffset_));
	}

	// U32 _numInitRanges
	public UDATAPointer _numInitRangesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__numInitRangesOffset_));
	}

	// U64 _numPhysicalInitRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numPhysicalInitRangesOffset_", declaredType="U64")
	public UDATA _numPhysicalInitRanges() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__numPhysicalInitRangesOffset_));
	}

	// U64 _numPhysicalInitRanges
	public UDATAPointer _numPhysicalInitRangesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__numPhysicalInitRangesOffset_));
	}

	// bool _pass2Started
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pass2StartedOffset_", declaredType="bool")
	public boolean _pass2Started() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__pass2StartedOffset_);
	}

	// bool _pass2Started
	public BoolPointer _pass2StartedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__pass2StartedOffset_));
	}

	// bool _rebuildInitWorkForAdd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildInitWorkForAddOffset_", declaredType="bool")
	public boolean _rebuildInitWorkForAdd() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__rebuildInitWorkForAddOffset_);
	}

	// bool _rebuildInitWorkForAdd
	public BoolPointer _rebuildInitWorkForAddEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__rebuildInitWorkForAddOffset_));
	}

	// bool _rebuildInitWorkForRemove
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildInitWorkForRemoveOffset_", declaredType="bool")
	public boolean _rebuildInitWorkForRemove() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__rebuildInitWorkForRemoveOffset_);
	}

	// bool _rebuildInitWorkForRemove
	public BoolPointer _rebuildInitWorkForRemoveEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__rebuildInitWorkForRemoveOffset_));
	}

	// bool _retuneAfterHeapResize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__retuneAfterHeapResizeOffset_", declaredType="bool")
	public boolean _retuneAfterHeapResize() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__retuneAfterHeapResizeOffset_);
	}

	// bool _retuneAfterHeapResize
	public BoolPointer _retuneAfterHeapResizeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__retuneAfterHeapResizeOffset_));
	}

	// bool _secondCardCleanPass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__secondCardCleanPassOffset_", declaredType="bool")
	public boolean _secondCardCleanPass() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGC.__secondCardCleanPassOffset_);
	}

	// bool _secondCardCleanPass
	public BoolPointer _secondCardCleanPassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__secondCardCleanPassOffset_));
	}

	// MM_ConcurrentGCStats _stats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__statsOffset_", declaredType="MM_ConcurrentGCStats")
	public MM_ConcurrentGCStatsPointer _stats() throws CorruptDataException {
		return MM_ConcurrentGCStatsPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__statsOffset_));
	}

	// MM_ConcurrentGCStats _stats
	public PointerPointer _statsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__statsOffset_));
	}

	// float _tenureLiveObjectFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLiveObjectFactorOffset_", declaredType="float")
	public float _tenureLiveObjectFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__tenureLiveObjectFactorOffset_);
	}

	// float _tenureLiveObjectFactor
	public FloatPointer _tenureLiveObjectFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__tenureLiveObjectFactorOffset_));
	}

	// float _tenureNonLeafObjectFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureNonLeafObjectFactorOffset_", declaredType="float")
	public float _tenureNonLeafObjectFactor() throws CorruptDataException {
		return getFloatAtOffset(MM_ConcurrentGC.__tenureNonLeafObjectFactorOffset_);
	}

	// float _tenureNonLeafObjectFactor
	public FloatPointer _tenureNonLeafObjectFactorEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__tenureNonLeafObjectFactorOffset_));
	}

	// U64 _totalCleanedAtPass2KO
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalCleanedAtPass2KOOffset_", declaredType="U64")
	public UDATA _totalCleanedAtPass2KO() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__totalCleanedAtPass2KOOffset_));
	}

	// U64 _totalCleanedAtPass2KO
	public UDATAPointer _totalCleanedAtPass2KOEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__totalCleanedAtPass2KOOffset_));
	}

	// U64 _totalTracedAtPass2KO
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalTracedAtPass2KOOffset_", declaredType="U64")
	public UDATA _totalTracedAtPass2KO() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__totalTracedAtPass2KOOffset_));
	}

	// U64 _totalTracedAtPass2KO
	public UDATAPointer _totalTracedAtPass2KOEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__totalTracedAtPass2KOOffset_));
	}

	// U64 _traceTargetPass1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceTargetPass1Offset_", declaredType="U64")
	public UDATA _traceTargetPass1() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__traceTargetPass1Offset_));
	}

	// U64 _traceTargetPass1
	public UDATAPointer _traceTargetPass1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__traceTargetPass1Offset_));
	}

	// U64 _traceTargetPass2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceTargetPass2Offset_", declaredType="U64")
	public UDATA _traceTargetPass2() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__traceTargetPass2Offset_));
	}

	// U64 _traceTargetPass2
	public UDATAPointer _traceTargetPass2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__traceTargetPass2Offset_));
	}

	// volatile U64 _tuningUpdateInterval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tuningUpdateIntervalOffset_", declaredType="volatile U64")
	public UDATA _tuningUpdateInterval() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC.__tuningUpdateIntervalOffset_));
	}

	// volatile U64 _tuningUpdateInterval
	public UDATAPointer _tuningUpdateIntervalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC.__tuningUpdateIntervalOffset_));
	}

}
