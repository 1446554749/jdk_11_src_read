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
 * Structure: MM_RealtimeGCPointer
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
 * The generated code will provide getters for all elements in the MM_RealtimeGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RealtimeGC.class)
public class MM_RealtimeGCPointer extends MM_GlobalCollectorPointer {

	// NULL
	public static final MM_RealtimeGCPointer NULL = new MM_RealtimeGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RealtimeGCPointer(long address) {
		super(address);
	}

	public static MM_RealtimeGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RealtimeGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RealtimeGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RealtimeGCPointer(address);
	}

	public MM_RealtimeGCPointer add(long count) {
		return MM_RealtimeGCPointer.cast(address + (MM_RealtimeGC.SIZEOF * count));
	}

	public MM_RealtimeGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RealtimeGCPointer addOffset(long offset) {
		return MM_RealtimeGCPointer.cast(address + offset);
	}

	public MM_RealtimeGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RealtimeGCPointer sub(long count) {
		return MM_RealtimeGCPointer.cast(address - (MM_RealtimeGC.SIZEOF * count));
	}

	public MM_RealtimeGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RealtimeGCPointer subOffset(long offset) {
		return MM_RealtimeGCPointer.cast(address - offset);
	}

	public MM_RealtimeGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RealtimeGCPointer untag(long mask) {
		return MM_RealtimeGCPointer.cast(address & ~mask);
	}

	public MM_RealtimeGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RealtimeGC.SIZEOF;
	}

	// Implementation methods

	// bool _allowGrowth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allowGrowthOffset_", declaredType="bool")
	public boolean _allowGrowth() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__allowGrowthOffset_);
	}

	// bool _allowGrowth
	public BoolPointer _allowGrowthEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__allowGrowthOffset_));
	}

	// float _avgPercentFreeHeapAfterCollect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avgPercentFreeHeapAfterCollectOffset_", declaredType="float")
	public float _avgPercentFreeHeapAfterCollect() throws CorruptDataException {
		return getFloatAtOffset(MM_RealtimeGC.__avgPercentFreeHeapAfterCollectOffset_);
	}

	// float _avgPercentFreeHeapAfterCollect
	public FloatPointer _avgPercentFreeHeapAfterCollectEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_RealtimeGC.__avgPercentFreeHeapAfterCollectOffset_));
	}

	// I64 _currentGCThreadPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentGCThreadPriorityOffset_", declaredType="I64")
	public IDATA _currentGCThreadPriority() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_RealtimeGC.__currentGCThreadPriorityOffset_));
	}

	// I64 _currentGCThreadPriority
	public IDATAPointer _currentGCThreadPriorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_RealtimeGC.__currentGCThreadPriorityOffset_));
	}

	// MM_CycleState _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(nonNullFieldEA(MM_RealtimeGC.__cycleStateOffset_));
	}

	// MM_CycleState _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__cycleStateOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_RealtimeGC.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__extensionsOffset_));
	}

	// bool _fixHeapForWalk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixHeapForWalkOffset_", declaredType="bool")
	public boolean _fixHeapForWalk() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__fixHeapForWalkOffset_);
	}

	// bool _fixHeapForWalk
	public BoolPointer _fixHeapForWalkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__fixHeapForWalkOffset_));
	}

	// U64 _gcPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcPhaseOffset_", declaredType="U64")
	public UDATA _gcPhase() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RealtimeGC.__gcPhaseOffset_));
	}

	// U64 _gcPhase
	public UDATAPointer _gcPhaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RealtimeGC.__gcPhaseOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_RealtimeMarkingScheme*")
	public MM_RealtimeMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_RealtimeMarkingSchemePointer.cast(getPointerAtOffset(MM_RealtimeGC.__markingSchemeOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__markingSchemeOffset_));
	}

	// MM_MemoryPoolSegregated* _memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolOffset_", declaredType="MM_MemoryPoolSegregated*")
	public MM_MemoryPoolSegregatedPointer _memoryPool() throws CorruptDataException {
		return MM_MemoryPoolSegregatedPointer.cast(getPointerAtOffset(MM_RealtimeGC.__memoryPoolOffset_));
	}

	// MM_MemoryPoolSegregated* _memoryPool
	public PointerPointer _memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__memoryPoolOffset_));
	}

	// MM_MemorySubSpaceMetronome* _memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOffset_", declaredType="MM_MemorySubSpaceMetronome*")
	public MM_MemorySubSpaceMetronomePointer _memorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpaceMetronomePointer.cast(getPointerAtOffset(MM_RealtimeGC.__memorySubSpaceOffset_));
	}

	// MM_MemorySubSpaceMetronome* _memorySubSpace
	public PointerPointer _memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__memorySubSpaceOffset_));
	}

	// bool _moreTracingRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moreTracingRequiredOffset_", declaredType="bool")
	public boolean _moreTracingRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__moreTracingRequiredOffset_);
	}

	// bool _moreTracingRequired
	public BoolPointer _moreTracingRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__moreTracingRequiredOffset_));
	}

	// MM_OSInterface* _osInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__osInterfaceOffset_", declaredType="MM_OSInterface*")
	public MM_OSInterfacePointer _osInterface() throws CorruptDataException {
		return MM_OSInterfacePointer.cast(getPointerAtOffset(MM_RealtimeGC.__osInterfaceOffset_));
	}

	// MM_OSInterface* _osInterface
	public PointerPointer _osInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__osInterfaceOffset_));
	}

	// bool _previousCycleBelowTrigger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousCycleBelowTriggerOffset_", declaredType="bool")
	public boolean _previousCycleBelowTrigger() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__previousCycleBelowTriggerOffset_);
	}

	// bool _previousCycleBelowTrigger
	public BoolPointer _previousCycleBelowTriggerEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__previousCycleBelowTriggerOffset_));
	}

	// MM_MetronomeDelegate _realtimeDelegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__realtimeDelegateOffset_", declaredType="MM_MetronomeDelegate")
	public MM_MetronomeDelegatePointer _realtimeDelegate() throws CorruptDataException {
		return MM_MetronomeDelegatePointer.cast(nonNullFieldEA(MM_RealtimeGC.__realtimeDelegateOffset_));
	}

	// MM_MetronomeDelegate _realtimeDelegate
	public PointerPointer _realtimeDelegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__realtimeDelegateOffset_));
	}

	// MM_Scheduler* _sched
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__schedOffset_", declaredType="MM_Scheduler*")
	public MM_SchedulerPointer _sched() throws CorruptDataException {
		return MM_SchedulerPointer.cast(getPointerAtOffset(MM_RealtimeGC.__schedOffset_));
	}

	// MM_Scheduler* _sched
	public PointerPointer _schedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__schedOffset_));
	}

	// bool _stopTracing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stopTracingOffset_", declaredType="bool")
	public boolean _stopTracing() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__stopTracingOffset_);
	}

	// bool _stopTracing
	public BoolPointer _stopTracingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__stopTracingOffset_));
	}

	// MM_SweepSchemeRealtime* _sweepScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepSchemeOffset_", declaredType="MM_SweepSchemeRealtime*")
	public MM_SweepSchemeRealtimePointer _sweepScheme() throws CorruptDataException {
		return MM_SweepSchemeRealtimePointer.cast(getPointerAtOffset(MM_RealtimeGC.__sweepSchemeOffset_));
	}

	// MM_SweepSchemeRealtime* _sweepScheme
	public PointerPointer _sweepSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__sweepSchemeOffset_));
	}

	// bool _sweepingArraylets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepingArrayletsOffset_", declaredType="bool")
	public boolean _sweepingArraylets() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeGC.__sweepingArrayletsOffset_);
	}

	// bool _sweepingArraylets
	public BoolPointer _sweepingArrayletsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeGC.__sweepingArrayletsOffset_));
	}

	// OMR_VM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_RealtimeGC.__vmOffset_));
	}

	// OMR_VM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__vmOffset_));
	}

	// MM_WorkPacketsRealtime* _workPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsOffset_", declaredType="MM_WorkPacketsRealtime*")
	public MM_WorkPacketsRealtimePointer _workPackets() throws CorruptDataException {
		return MM_WorkPacketsRealtimePointer.cast(getPointerAtOffset(MM_RealtimeGC.__workPacketsOffset_));
	}

	// MM_WorkPacketsRealtime* _workPackets
	public PointerPointer _workPacketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeGC.__workPacketsOffset_));
	}

}
