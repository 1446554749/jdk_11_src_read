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
 * Structure: MM_SchedulerPointer
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
 * The generated code will provide getters for all elements in the MM_SchedulerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Scheduler.class)
public class MM_SchedulerPointer extends MM_ParallelDispatcherPointer {

	// NULL
	public static final MM_SchedulerPointer NULL = new MM_SchedulerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SchedulerPointer(long address) {
		super(address);
	}

	public static MM_SchedulerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SchedulerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SchedulerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SchedulerPointer(address);
	}

	public MM_SchedulerPointer add(long count) {
		return MM_SchedulerPointer.cast(address + (MM_Scheduler.SIZEOF * count));
	}

	public MM_SchedulerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SchedulerPointer addOffset(long offset) {
		return MM_SchedulerPointer.cast(address + offset);
	}

	public MM_SchedulerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SchedulerPointer sub(long count) {
		return MM_SchedulerPointer.cast(address - (MM_Scheduler.SIZEOF * count));
	}

	public MM_SchedulerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SchedulerPointer subOffset(long offset) {
		return MM_SchedulerPointer.cast(address - offset);
	}

	public MM_SchedulerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SchedulerPointer untag(long mask) {
		return MM_SchedulerPointer.cast(address & ~mask);
	}

	public MM_SchedulerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Scheduler.SIZEOF;
	}

	// Implementation methods

	// MM_MetronomeAlarmThread* _alarmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__alarmThreadOffset_", declaredType="MM_MetronomeAlarmThread*")
	public MM_MetronomeAlarmThreadPointer _alarmThread() throws CorruptDataException {
		return MM_MetronomeAlarmThreadPointer.cast(getPointerAtOffset(MM_Scheduler.__alarmThreadOffset_));
	}

	// MM_MetronomeAlarmThread* _alarmThread
	public PointerPointer _alarmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__alarmThreadOffset_));
	}

	// bool _completeCurrentGCSynchronously
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeCurrentGCSynchronouslyOffset_", declaredType="bool")
	public boolean _completeCurrentGCSynchronously() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyOffset_);
	}

	// bool _completeCurrentGCSynchronously
	public BoolPointer _completeCurrentGCSynchronouslyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__completeCurrentGCSynchronouslyOffset_));
	}

	// bool _completeCurrentGCSynchronouslyMainThreadCopy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeCurrentGCSynchronouslyMainThreadCopyOffset_", declaredType="bool")
	public boolean _completeCurrentGCSynchronouslyMainThreadCopy() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyMainThreadCopyOffset_);
	}

	// bool _completeCurrentGCSynchronouslyMainThreadCopy
	public BoolPointer _completeCurrentGCSynchronouslyMainThreadCopyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__completeCurrentGCSynchronouslyMainThreadCopyOffset_));
	}

	// GCReason _completeCurrentGCSynchronouslyReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeCurrentGCSynchronouslyReasonOffset_", declaredType="GCReason")
	public long _completeCurrentGCSynchronouslyReason() throws CorruptDataException {
		if (GCReason.SIZEOF == 1) {
			return getByteAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyReasonOffset_);
		} else if (GCReason.SIZEOF == 2) {
			return getShortAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyReasonOffset_);
		} else if (GCReason.SIZEOF == 4) {
			return getIntAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyReasonOffset_);
		} else if (GCReason.SIZEOF == 8) {
			return getLongAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GCReason _completeCurrentGCSynchronouslyReason
	public EnumPointer _completeCurrentGCSynchronouslyReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Scheduler.__completeCurrentGCSynchronouslyReasonOffset_), GCReason.class);
	}

	// U64 _completeCurrentGCSynchronouslyReasonParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeCurrentGCSynchronouslyReasonParameterOffset_", declaredType="U64")
	public UDATA _completeCurrentGCSynchronouslyReasonParameter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__completeCurrentGCSynchronouslyReasonParameterOffset_));
	}

	// U64 _completeCurrentGCSynchronouslyReasonParameter
	public UDATAPointer _completeCurrentGCSynchronouslyReasonParameterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__completeCurrentGCSynchronouslyReasonParameterOffset_));
	}

	// I32 _currentConsecutiveBeats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentConsecutiveBeatsOffset_", declaredType="I32")
	public IDATA _currentConsecutiveBeats() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_Scheduler.__currentConsecutiveBeatsOffset_));
	}

	// I32 _currentConsecutiveBeats
	public IDATAPointer _currentConsecutiveBeatsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__currentConsecutiveBeatsOffset_));
	}

	// bool _doSchedulingBarrierEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doSchedulingBarrierEventsOffset_", declaredType="bool")
	public boolean _doSchedulingBarrierEvents() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__doSchedulingBarrierEventsOffset_);
	}

	// bool _doSchedulingBarrierEvents
	public BoolPointer _doSchedulingBarrierEventsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__doSchedulingBarrierEventsOffset_));
	}

	// bool _exclusiveVMAccessRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveVMAccessRequiredOffset_", declaredType="bool")
	public boolean _exclusiveVMAccessRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__exclusiveVMAccessRequiredOffset_);
	}

	// bool _exclusiveVMAccessRequired
	public BoolPointer _exclusiveVMAccessRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__exclusiveVMAccessRequiredOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_Scheduler.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__extensionsOffset_));
	}

	// MM_RealtimeGC* _gc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcOffset_", declaredType="MM_RealtimeGC*")
	public MM_RealtimeGCPointer _gc() throws CorruptDataException {
		return MM_RealtimeGCPointer.cast(getPointerAtOffset(MM_Scheduler.__gcOffset_));
	}

	// MM_RealtimeGC* _gc
	public PointerPointer _gcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__gcOffset_));
	}

	// MM_GCCode _gcCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCodeOffset_", declaredType="MM_GCCode")
	public MM_GCCodePointer _gcCode() throws CorruptDataException {
		return MM_GCCodePointer.cast(nonNullFieldEA(MM_Scheduler.__gcCodeOffset_));
	}

	// MM_GCCode _gcCode
	public PointerPointer _gcCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__gcCodeOffset_));
	}

	// U32 _gcOn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcOnOffset_", declaredType="U32")
	public UDATA _gcOn() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_Scheduler.__gcOnOffset_));
	}

	// U32 _gcOn
	public UDATAPointer _gcOnEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__gcOnOffset_));
	}

	// U64 _gcPhaseSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcPhaseSetOffset_", declaredType="U64")
	public UDATA _gcPhaseSet() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__gcPhaseSetOffset_));
	}

	// U64 _gcPhaseSet
	public UDATAPointer _gcPhaseSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__gcPhaseSetOffset_));
	}

	// U64 _incrementStartTimeInNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementStartTimeInNanosOffset_", declaredType="U64")
	public UDATA _incrementStartTimeInNanos() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__incrementStartTimeInNanosOffset_));
	}

	// U64 _incrementStartTimeInNanos
	public UDATAPointer _incrementStartTimeInNanosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__incrementStartTimeInNanosOffset_));
	}

	// bool _isInitialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isInitializedOffset_", declaredType="bool")
	public boolean _isInitialized() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__isInitializedOffset_);
	}

	// bool _isInitialized
	public BoolPointer _isInitializedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__isInitializedOffset_));
	}

	// omrthread_monitor_t _mainThreadMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mainThreadMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_Scheduler.__mainThreadMonitorOffset_));
	}

	// omrthread_monitor_t _mainThreadMonitor
	public PointerPointer _mainThreadMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__mainThreadMonitorOffset_));
	}

	// bool _mainThreadMustShutDown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadMustShutDownOffset_", declaredType="bool")
	public boolean _mainThreadMustShutDown() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__mainThreadMustShutDownOffset_);
	}

	// bool _mainThreadMustShutDown
	public BoolPointer _mainThreadMustShutDownEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__mainThreadMustShutDownOffset_));
	}

	// Mode _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="Mode")
	public long _mode() throws CorruptDataException {
		if (MM_Scheduler$Mode.SIZEOF == 1) {
			return getByteAtOffset(MM_Scheduler.__modeOffset_);
		} else if (MM_Scheduler$Mode.SIZEOF == 2) {
			return getShortAtOffset(MM_Scheduler.__modeOffset_);
		} else if (MM_Scheduler$Mode.SIZEOF == 4) {
			return getIntAtOffset(MM_Scheduler.__modeOffset_);
		} else if (MM_Scheduler$Mode.SIZEOF == 8) {
			return getLongAtOffset(MM_Scheduler.__modeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// Mode _mode
	public EnumPointer _modeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Scheduler.__modeOffset_), MM_Scheduler$Mode.class);
	}

	// U64 _mutatorCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutatorCountOffset_", declaredType="U64")
	public UDATA _mutatorCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__mutatorCountOffset_));
	}

	// U64 _mutatorCount
	public UDATAPointer _mutatorCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__mutatorCountOffset_));
	}

	// U64 _mutatorStartTimeInNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutatorStartTimeInNanosOffset_", declaredType="U64")
	public UDATA _mutatorStartTimeInNanos() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__mutatorStartTimeInNanosOffset_));
	}

	// U64 _mutatorStartTimeInNanos
	public UDATAPointer _mutatorStartTimeInNanosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__mutatorStartTimeInNanosOffset_));
	}

	// MM_OSInterface* _osInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__osInterfaceOffset_", declaredType="MM_OSInterface*")
	public MM_OSInterfacePointer _osInterface() throws CorruptDataException {
		return MM_OSInterfacePointer.cast(getPointerAtOffset(MM_Scheduler.__osInterfaceOffset_));
	}

	// MM_OSInterface* _osInterface
	public PointerPointer _osInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__osInterfaceOffset_));
	}

	// volatile U64 _sharedBarrierState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sharedBarrierStateOffset_", declaredType="volatile U64")
	public UDATA _sharedBarrierState() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler.__sharedBarrierStateOffset_));
	}

	// volatile U64 _sharedBarrierState
	public UDATAPointer _sharedBarrierStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler.__sharedBarrierStateOffset_));
	}

	// volatile bool _shouldGCYield
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldGCYieldOffset_", declaredType="volatile bool")
	public boolean _shouldGCYield() throws CorruptDataException {
		return getBoolAtOffset(MM_Scheduler.__shouldGCYieldOffset_);
	}

	// volatile bool _shouldGCYield
	public BoolPointer _shouldGCYieldEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Scheduler.__shouldGCYieldOffset_));
	}

	// double _staticTargetUtilization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__staticTargetUtilizationOffset_", declaredType="double")
	public double _staticTargetUtilization() throws CorruptDataException {
		return getDoubleAtOffset(MM_Scheduler.__staticTargetUtilizationOffset_);
	}

	// double _staticTargetUtilization
	public DoublePointer _staticTargetUtilizationEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_Scheduler.__staticTargetUtilizationOffset_));
	}

	// bool* _threadResumedTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadResumedTableOffset_", declaredType="bool*")
	public BoolPointer _threadResumedTable() throws CorruptDataException {
		return BoolPointer.cast(getPointerAtOffset(MM_Scheduler.__threadResumedTableOffset_));
	}

	// bool* _threadResumedTable
	public PointerPointer _threadResumedTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__threadResumedTableOffset_));
	}

	// MM_EnvironmentRealtime* _threadWaitingOnMainThreadMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadWaitingOnMainThreadMonitorOffset_", declaredType="MM_EnvironmentRealtime*")
	public MM_EnvironmentRealtimePointer _threadWaitingOnMainThreadMonitor() throws CorruptDataException {
		return MM_EnvironmentRealtimePointer.cast(getPointerAtOffset(MM_Scheduler.__threadWaitingOnMainThreadMonitorOffset_));
	}

	// MM_EnvironmentRealtime* _threadWaitingOnMainThreadMonitor
	public PointerPointer _threadWaitingOnMainThreadMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__threadWaitingOnMainThreadMonitorOffset_));
	}

	// MM_UtilizationTracker* _utilTracker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__utilTrackerOffset_", declaredType="MM_UtilizationTracker*")
	public MM_UtilizationTrackerPointer _utilTracker() throws CorruptDataException {
		return MM_UtilizationTrackerPointer.cast(getPointerAtOffset(MM_Scheduler.__utilTrackerOffset_));
	}

	// MM_UtilizationTracker* _utilTracker
	public PointerPointer _utilTrackerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__utilTrackerOffset_));
	}

	// OMR_VM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_Scheduler.__vmOffset_));
	}

	// OMR_VM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__vmOffset_));
	}

	// MM_YieldCollaborator* _yieldCollaborator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__yieldCollaboratorOffset_", declaredType="MM_YieldCollaborator*")
	public MM_YieldCollaboratorPointer _yieldCollaborator() throws CorruptDataException {
		return MM_YieldCollaboratorPointer.cast(getPointerAtOffset(MM_Scheduler.__yieldCollaboratorOffset_));
	}

	// MM_YieldCollaborator* _yieldCollaborator
	public PointerPointer _yieldCollaboratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Scheduler.__yieldCollaboratorOffset_));
	}

	// double beat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_beatOffset_", declaredType="double")
	public double beat() throws CorruptDataException {
		return getDoubleAtOffset(MM_Scheduler._beatOffset_);
	}

	// double beat
	public DoublePointer beatEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_Scheduler._beatOffset_));
	}

	// U64 beatNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_beatNanosOffset_", declaredType="U64")
	public UDATA beatNanos() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Scheduler._beatNanosOffset_));
	}

	// U64 beatNanos
	public UDATAPointer beatNanosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Scheduler._beatNanosOffset_));
	}

	// double window
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_windowOffset_", declaredType="double")
	public double window() throws CorruptDataException {
		return getDoubleAtOffset(MM_Scheduler._windowOffset_);
	}

	// double window
	public DoublePointer windowEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_Scheduler._windowOffset_));
	}

}
