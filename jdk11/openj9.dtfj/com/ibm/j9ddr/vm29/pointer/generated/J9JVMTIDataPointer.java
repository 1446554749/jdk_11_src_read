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
 * Structure: J9JVMTIDataPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIData.class)
public class J9JVMTIDataPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIDataPointer NULL = new J9JVMTIDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIDataPointer(long address) {
		super(address);
	}

	public static J9JVMTIDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIDataPointer(address);
	}

	public J9JVMTIDataPointer add(long count) {
		return J9JVMTIDataPointer.cast(address + (J9JVMTIData.SIZEOF * count));
	}

	public J9JVMTIDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIDataPointer addOffset(long offset) {
		return J9JVMTIDataPointer.cast(address + offset);
	}

	public J9JVMTIDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIDataPointer sub(long count) {
		return J9JVMTIDataPointer.cast(address - (J9JVMTIData.SIZEOF * count));
	}

	public J9JVMTIDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIDataPointer subOffset(long offset) {
		return J9JVMTIDataPointer.cast(address - offset);
	}

	public J9JVMTIDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIDataPointer untag(long mask) {
		return J9JVMTIDataPointer.cast(address & ~mask);
	}

	public J9JVMTIDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIData.SIZEOF;
	}

	// Implementation methods

	// J9Pool* agentLibraries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_agentLibrariesOffset_", declaredType="J9Pool*")
	public J9PoolPointer agentLibraries() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIData._agentLibrariesOffset_));
	}

	// J9Pool* agentLibraries
	public PointerPointer agentLibrariesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._agentLibrariesOffset_));
	}

	// J9NativeLibrary* agentLibrariesHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_agentLibrariesHeadOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer agentLibrariesHead() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9JVMTIData._agentLibrariesHeadOffset_));
	}

	// J9NativeLibrary* agentLibrariesHead
	public PointerPointer agentLibrariesHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._agentLibrariesHeadOffset_));
	}

	// J9NativeLibrary* agentLibrariesTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_agentLibrariesTailOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer agentLibrariesTail() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9JVMTIData._agentLibrariesTailOffset_));
	}

	// J9NativeLibrary* agentLibrariesTail
	public PointerPointer agentLibrariesTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._agentLibrariesTailOffset_));
	}

	// J9Pool* breakpointedMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_breakpointedMethodsOffset_", declaredType="J9Pool*")
	public J9PoolPointer breakpointedMethods() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIData._breakpointedMethodsOffset_));
	}

	// J9Pool* breakpointedMethods
	public PointerPointer breakpointedMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._breakpointedMethodsOffset_));
	}

	// J9Pool* breakpoints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_breakpointsOffset_", declaredType="J9Pool*")
	public J9PoolPointer breakpoints() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIData._breakpointsOffset_));
	}

	// J9Pool* breakpoints
	public PointerPointer breakpointsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._breakpointsOffset_));
	}

	// omrthread_monitor_t compileEventMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer compileEventMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JVMTIData._compileEventMutexOffset_));
	}

	// omrthread_monitor_t compileEventMutex
	public PointerPointer compileEventMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventMutexOffset_));
	}

	// J9JVMTICompileEvent* compileEventQueueHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventQueueHeadOffset_", declaredType="J9JVMTICompileEvent*")
	public J9JVMTICompileEventPointer compileEventQueueHead() throws CorruptDataException {
		return J9JVMTICompileEventPointer.cast(getPointerAtOffset(J9JVMTIData._compileEventQueueHeadOffset_));
	}

	// J9JVMTICompileEvent* compileEventQueueHead
	public PointerPointer compileEventQueueHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventQueueHeadOffset_));
	}

	// omrthread_t compileEventThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventThreadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer compileEventThread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9JVMTIData._compileEventThreadOffset_));
	}

	// omrthread_t compileEventThread
	public PointerPointer compileEventThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventThreadOffset_));
	}

	// UDATA compileEventThreadState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventThreadStateOffset_", declaredType="UDATA")
	public UDATA compileEventThreadState() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIData._compileEventThreadStateOffset_);
	}

	// UDATA compileEventThreadState
	public UDATAPointer compileEventThreadStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventThreadStateOffset_));
	}

	// J9VMThread* compileEventVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventVMThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer compileEventVMThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JVMTIData._compileEventVMThreadOffset_));
	}

	// J9VMThread* compileEventVMThread
	public PointerPointer compileEventVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventVMThreadOffset_));
	}

	// J9Pool* compileEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileEventsOffset_", declaredType="J9Pool*")
	public J9PoolPointer compileEvents() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIData._compileEventsOffset_));
	}

	// J9Pool* compileEvents
	public PointerPointer compileEventsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._compileEventsOffset_));
	}

	// jniNativeInterface* copiedJNITable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copiedJNITableOffset_", declaredType="jniNativeInterface*")
	public JNINativeInterface_Pointer copiedJNITable() throws CorruptDataException {
		return JNINativeInterface_Pointer.cast(getPointerAtOffset(J9JVMTIData._copiedJNITableOffset_));
	}

	// jniNativeInterface* copiedJNITable
	public PointerPointer copiedJNITableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._copiedJNITableOffset_));
	}

	// J9Pool* environments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentsOffset_", declaredType="J9Pool*")
	public J9PoolPointer environments() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIData._environmentsOffset_));
	}

	// J9Pool* environments
	public PointerPointer environmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._environmentsOffset_));
	}

	// J9JVMTIEnv* environmentsHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentsHeadOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer environmentsHead() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIData._environmentsHeadOffset_));
	}

	// J9JVMTIEnv* environmentsHead
	public PointerPointer environmentsHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._environmentsHeadOffset_));
	}

	// J9JVMTIEnv* environmentsTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentsTailOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer environmentsTail() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIData._environmentsTailOffset_));
	}

	// J9JVMTIEnv* environmentsTail
	public PointerPointer environmentsTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._environmentsTailOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIData._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIData._flagsOffset_));
	}

	// UDATA lastClassCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastClassCountOffset_", declaredType="UDATA")
	public UDATA lastClassCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIData._lastClassCountOffset_);
	}

	// UDATA lastClassCount
	public UDATAPointer lastClassCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIData._lastClassCountOffset_));
	}

	// omrthread_monitor_t mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JVMTIData._mutexOffset_));
	}

	// omrthread_monitor_t mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._mutexOffset_));
	}

	// UDATA phase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_phaseOffset_", declaredType="UDATA")
	public UDATA phase() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIData._phaseOffset_);
	}

	// UDATA phase
	public UDATAPointer phaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIData._phaseOffset_));
	}

	// omrthread_monitor_t redefineMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_redefineMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer redefineMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JVMTIData._redefineMutexOffset_));
	}

	// omrthread_monitor_t redefineMutex
	public PointerPointer redefineMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._redefineMutexOffset_));
	}

	// UDATA requiredDebugAttributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requiredDebugAttributesOffset_", declaredType="UDATA")
	public UDATA requiredDebugAttributes() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIData._requiredDebugAttributesOffset_);
	}

	// UDATA requiredDebugAttributes
	public UDATAPointer requiredDebugAttributesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIData._requiredDebugAttributesOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JVMTIData._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIData._vmOffset_));
	}

}
