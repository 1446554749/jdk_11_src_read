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
 * Structure: jvmtiEventCallbacksPointer
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
 * The generated code will provide getters for all elements in the jvmtiEventCallbacksPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiEventCallbacks.class)
public class jvmtiEventCallbacksPointer extends StructurePointer {

	// NULL
	public static final jvmtiEventCallbacksPointer NULL = new jvmtiEventCallbacksPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiEventCallbacksPointer(long address) {
		super(address);
	}

	public static jvmtiEventCallbacksPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiEventCallbacksPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiEventCallbacksPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiEventCallbacksPointer(address);
	}

	public jvmtiEventCallbacksPointer add(long count) {
		return jvmtiEventCallbacksPointer.cast(address + (jvmtiEventCallbacks.SIZEOF * count));
	}

	public jvmtiEventCallbacksPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiEventCallbacksPointer addOffset(long offset) {
		return jvmtiEventCallbacksPointer.cast(address + offset);
	}

	public jvmtiEventCallbacksPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiEventCallbacksPointer sub(long count) {
		return jvmtiEventCallbacksPointer.cast(address - (jvmtiEventCallbacks.SIZEOF * count));
	}

	public jvmtiEventCallbacksPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiEventCallbacksPointer subOffset(long offset) {
		return jvmtiEventCallbacksPointer.cast(address - offset);
	}

	public jvmtiEventCallbacksPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiEventCallbacksPointer untag(long mask) {
		return jvmtiEventCallbacksPointer.cast(address & ~mask);
	}

	public jvmtiEventCallbacksPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiEventCallbacks.SIZEOF;
	}

	// Implementation methods

	// jvmtiEventBreakpoint Breakpoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_BreakpointOffset_", declaredType="jvmtiEventBreakpoint")
	public VoidPointer Breakpoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._BreakpointOffset_));
	}

	// jvmtiEventBreakpoint Breakpoint
	public PointerPointer BreakpointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._BreakpointOffset_));
	}

	// jvmtiEventClassFileLoadHook ClassFileLoadHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClassFileLoadHookOffset_", declaredType="jvmtiEventClassFileLoadHook")
	public VoidPointer ClassFileLoadHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ClassFileLoadHookOffset_));
	}

	// jvmtiEventClassFileLoadHook ClassFileLoadHook
	public PointerPointer ClassFileLoadHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ClassFileLoadHookOffset_));
	}

	// jvmtiEventClassLoad ClassLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClassLoadOffset_", declaredType="jvmtiEventClassLoad")
	public VoidPointer ClassLoad() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ClassLoadOffset_));
	}

	// jvmtiEventClassLoad ClassLoad
	public PointerPointer ClassLoadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ClassLoadOffset_));
	}

	// jvmtiEventClassPrepare ClassPrepare
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClassPrepareOffset_", declaredType="jvmtiEventClassPrepare")
	public VoidPointer ClassPrepare() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ClassPrepareOffset_));
	}

	// jvmtiEventClassPrepare ClassPrepare
	public PointerPointer ClassPrepareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ClassPrepareOffset_));
	}

	// jvmtiEventCompiledMethodLoad CompiledMethodLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CompiledMethodLoadOffset_", declaredType="jvmtiEventCompiledMethodLoad")
	public VoidPointer CompiledMethodLoad() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._CompiledMethodLoadOffset_));
	}

	// jvmtiEventCompiledMethodLoad CompiledMethodLoad
	public PointerPointer CompiledMethodLoadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._CompiledMethodLoadOffset_));
	}

	// jvmtiEventCompiledMethodUnload CompiledMethodUnload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CompiledMethodUnloadOffset_", declaredType="jvmtiEventCompiledMethodUnload")
	public VoidPointer CompiledMethodUnload() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._CompiledMethodUnloadOffset_));
	}

	// jvmtiEventCompiledMethodUnload CompiledMethodUnload
	public PointerPointer CompiledMethodUnloadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._CompiledMethodUnloadOffset_));
	}

	// jvmtiEventDataDumpRequest DataDumpRequest
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DataDumpRequestOffset_", declaredType="jvmtiEventDataDumpRequest")
	public VoidPointer DataDumpRequest() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._DataDumpRequestOffset_));
	}

	// jvmtiEventDataDumpRequest DataDumpRequest
	public PointerPointer DataDumpRequestEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._DataDumpRequestOffset_));
	}

	// jvmtiEventDynamicCodeGenerated DynamicCodeGenerated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DynamicCodeGeneratedOffset_", declaredType="jvmtiEventDynamicCodeGenerated")
	public VoidPointer DynamicCodeGenerated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._DynamicCodeGeneratedOffset_));
	}

	// jvmtiEventDynamicCodeGenerated DynamicCodeGenerated
	public PointerPointer DynamicCodeGeneratedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._DynamicCodeGeneratedOffset_));
	}

	// jvmtiEventException Exception
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionOffset_", declaredType="jvmtiEventException")
	public VoidPointer Exception() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ExceptionOffset_));
	}

	// jvmtiEventException Exception
	public PointerPointer ExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ExceptionOffset_));
	}

	// jvmtiEventExceptionCatch ExceptionCatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionCatchOffset_", declaredType="jvmtiEventExceptionCatch")
	public VoidPointer ExceptionCatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ExceptionCatchOffset_));
	}

	// jvmtiEventExceptionCatch ExceptionCatch
	public PointerPointer ExceptionCatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ExceptionCatchOffset_));
	}

	// jvmtiEventFieldAccess FieldAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FieldAccessOffset_", declaredType="jvmtiEventFieldAccess")
	public VoidPointer FieldAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._FieldAccessOffset_));
	}

	// jvmtiEventFieldAccess FieldAccess
	public PointerPointer FieldAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._FieldAccessOffset_));
	}

	// jvmtiEventFieldModification FieldModification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FieldModificationOffset_", declaredType="jvmtiEventFieldModification")
	public VoidPointer FieldModification() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._FieldModificationOffset_));
	}

	// jvmtiEventFieldModification FieldModification
	public PointerPointer FieldModificationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._FieldModificationOffset_));
	}

	// jvmtiEventFramePop FramePop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FramePopOffset_", declaredType="jvmtiEventFramePop")
	public VoidPointer FramePop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._FramePopOffset_));
	}

	// jvmtiEventFramePop FramePop
	public PointerPointer FramePopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._FramePopOffset_));
	}

	// jvmtiEventGarbageCollectionFinish GarbageCollectionFinish
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GarbageCollectionFinishOffset_", declaredType="jvmtiEventGarbageCollectionFinish")
	public VoidPointer GarbageCollectionFinish() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._GarbageCollectionFinishOffset_));
	}

	// jvmtiEventGarbageCollectionFinish GarbageCollectionFinish
	public PointerPointer GarbageCollectionFinishEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._GarbageCollectionFinishOffset_));
	}

	// jvmtiEventGarbageCollectionStart GarbageCollectionStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GarbageCollectionStartOffset_", declaredType="jvmtiEventGarbageCollectionStart")
	public VoidPointer GarbageCollectionStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._GarbageCollectionStartOffset_));
	}

	// jvmtiEventGarbageCollectionStart GarbageCollectionStart
	public PointerPointer GarbageCollectionStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._GarbageCollectionStartOffset_));
	}

	// jvmtiEventMethodEntry MethodEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MethodEntryOffset_", declaredType="jvmtiEventMethodEntry")
	public VoidPointer MethodEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MethodEntryOffset_));
	}

	// jvmtiEventMethodEntry MethodEntry
	public PointerPointer MethodEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MethodEntryOffset_));
	}

	// jvmtiEventMethodExit MethodExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MethodExitOffset_", declaredType="jvmtiEventMethodExit")
	public VoidPointer MethodExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MethodExitOffset_));
	}

	// jvmtiEventMethodExit MethodExit
	public PointerPointer MethodExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MethodExitOffset_));
	}

	// jvmtiEventMonitorContendedEnter MonitorContendedEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorContendedEnterOffset_", declaredType="jvmtiEventMonitorContendedEnter")
	public VoidPointer MonitorContendedEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MonitorContendedEnterOffset_));
	}

	// jvmtiEventMonitorContendedEnter MonitorContendedEnter
	public PointerPointer MonitorContendedEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MonitorContendedEnterOffset_));
	}

	// jvmtiEventMonitorContendedEntered MonitorContendedEntered
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorContendedEnteredOffset_", declaredType="jvmtiEventMonitorContendedEntered")
	public VoidPointer MonitorContendedEntered() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MonitorContendedEnteredOffset_));
	}

	// jvmtiEventMonitorContendedEntered MonitorContendedEntered
	public PointerPointer MonitorContendedEnteredEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MonitorContendedEnteredOffset_));
	}

	// jvmtiEventMonitorWait MonitorWait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorWaitOffset_", declaredType="jvmtiEventMonitorWait")
	public VoidPointer MonitorWait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MonitorWaitOffset_));
	}

	// jvmtiEventMonitorWait MonitorWait
	public PointerPointer MonitorWaitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MonitorWaitOffset_));
	}

	// jvmtiEventMonitorWaited MonitorWaited
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorWaitedOffset_", declaredType="jvmtiEventMonitorWaited")
	public VoidPointer MonitorWaited() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._MonitorWaitedOffset_));
	}

	// jvmtiEventMonitorWaited MonitorWaited
	public PointerPointer MonitorWaitedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._MonitorWaitedOffset_));
	}

	// jvmtiEventNativeMethodBind NativeMethodBind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NativeMethodBindOffset_", declaredType="jvmtiEventNativeMethodBind")
	public VoidPointer NativeMethodBind() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._NativeMethodBindOffset_));
	}

	// jvmtiEventNativeMethodBind NativeMethodBind
	public PointerPointer NativeMethodBindEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._NativeMethodBindOffset_));
	}

	// jvmtiEventObjectFree ObjectFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ObjectFreeOffset_", declaredType="jvmtiEventObjectFree")
	public VoidPointer ObjectFree() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ObjectFreeOffset_));
	}

	// jvmtiEventObjectFree ObjectFree
	public PointerPointer ObjectFreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ObjectFreeOffset_));
	}

	// jvmtiEventResourceExhausted ResourceExhausted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ResourceExhaustedOffset_", declaredType="jvmtiEventResourceExhausted")
	public VoidPointer ResourceExhausted() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ResourceExhaustedOffset_));
	}

	// jvmtiEventResourceExhausted ResourceExhausted
	public PointerPointer ResourceExhaustedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ResourceExhaustedOffset_));
	}

	// jvmtiEventSampledObjectAlloc SampledObjectAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SampledObjectAllocOffset_", declaredType="jvmtiEventSampledObjectAlloc")
	public VoidPointer SampledObjectAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._SampledObjectAllocOffset_));
	}

	// jvmtiEventSampledObjectAlloc SampledObjectAlloc
	public PointerPointer SampledObjectAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._SampledObjectAllocOffset_));
	}

	// jvmtiEventSingleStep SingleStep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SingleStepOffset_", declaredType="jvmtiEventSingleStep")
	public VoidPointer SingleStep() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._SingleStepOffset_));
	}

	// jvmtiEventSingleStep SingleStep
	public PointerPointer SingleStepEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._SingleStepOffset_));
	}

	// jvmtiEventThreadEnd ThreadEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ThreadEndOffset_", declaredType="jvmtiEventThreadEnd")
	public VoidPointer ThreadEnd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ThreadEndOffset_));
	}

	// jvmtiEventThreadEnd ThreadEnd
	public PointerPointer ThreadEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ThreadEndOffset_));
	}

	// jvmtiEventThreadStart ThreadStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ThreadStartOffset_", declaredType="jvmtiEventThreadStart")
	public VoidPointer ThreadStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._ThreadStartOffset_));
	}

	// jvmtiEventThreadStart ThreadStart
	public PointerPointer ThreadStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._ThreadStartOffset_));
	}

	// jvmtiEventVMDeath VMDeath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_VMDeathOffset_", declaredType="jvmtiEventVMDeath")
	public VoidPointer VMDeath() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._VMDeathOffset_));
	}

	// jvmtiEventVMDeath VMDeath
	public PointerPointer VMDeathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._VMDeathOffset_));
	}

	// jvmtiEventVMInit VMInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_VMInitOffset_", declaredType="jvmtiEventVMInit")
	public VoidPointer VMInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._VMInitOffset_));
	}

	// jvmtiEventVMInit VMInit
	public PointerPointer VMInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._VMInitOffset_));
	}

	// jvmtiEventVMObjectAlloc VMObjectAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_VMObjectAllocOffset_", declaredType="jvmtiEventVMObjectAlloc")
	public VoidPointer VMObjectAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._VMObjectAllocOffset_));
	}

	// jvmtiEventVMObjectAlloc VMObjectAlloc
	public PointerPointer VMObjectAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._VMObjectAllocOffset_));
	}

	// jvmtiEventVMStart VMStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_VMStartOffset_", declaredType="jvmtiEventVMStart")
	public VoidPointer VMStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._VMStartOffset_));
	}

	// jvmtiEventVMStart VMStart
	public PointerPointer VMStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._VMStartOffset_));
	}

	// jvmtiEventReserved reserved72
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved72Offset_", declaredType="jvmtiEventReserved")
	public VoidPointer reserved72() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._reserved72Offset_));
	}

	// jvmtiEventReserved reserved72
	public PointerPointer reserved72EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._reserved72Offset_));
	}

	// jvmtiEventReserved reserved77
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved77Offset_", declaredType="jvmtiEventReserved")
	public VoidPointer reserved77() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._reserved77Offset_));
	}

	// jvmtiEventReserved reserved77
	public PointerPointer reserved77EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._reserved77Offset_));
	}

	// jvmtiEventReserved reserved78
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved78Offset_", declaredType="jvmtiEventReserved")
	public VoidPointer reserved78() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._reserved78Offset_));
	}

	// jvmtiEventReserved reserved78
	public PointerPointer reserved78EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._reserved78Offset_));
	}

	// jvmtiEventReserved reserved79
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved79Offset_", declaredType="jvmtiEventReserved")
	public VoidPointer reserved79() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._reserved79Offset_));
	}

	// jvmtiEventReserved reserved79
	public PointerPointer reserved79EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._reserved79Offset_));
	}

	// jvmtiEventReserved reserved85
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved85Offset_", declaredType="jvmtiEventReserved")
	public VoidPointer reserved85() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiEventCallbacks._reserved85Offset_));
	}

	// jvmtiEventReserved reserved85
	public PointerPointer reserved85EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiEventCallbacks._reserved85Offset_));
	}

}
