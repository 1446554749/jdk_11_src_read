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
 * Structure: J9JavaVMPointer
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
 * The generated code will provide getters for all elements in the J9JavaVMPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JavaVM.class)
public class J9JavaVMPointer extends StructurePointer {

	// NULL
	public static final J9JavaVMPointer NULL = new J9JavaVMPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JavaVMPointer(long address) {
		super(address);
	}

	public static J9JavaVMPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JavaVMPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JavaVMPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JavaVMPointer(address);
	}

	public J9JavaVMPointer add(long count) {
		return J9JavaVMPointer.cast(address + (J9JavaVM.SIZEOF * count));
	}

	public J9JavaVMPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JavaVMPointer addOffset(long offset) {
		return J9JavaVMPointer.cast(address + offset);
	}

	public J9JavaVMPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JavaVMPointer sub(long count) {
		return J9JavaVMPointer.cast(address - (J9JavaVM.SIZEOF * count));
	}

	public J9JavaVMPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JavaVMPointer subOffset(long offset) {
		return J9JavaVMPointer.cast(address - offset);
	}

	public J9JavaVMPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JavaVMPointer untag(long mask) {
		return J9JavaVMPointer.cast(address & ~mask);
	}

	public J9JavaVMPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JavaVM.SIZEOF;
	}

	// Implementation methods

	// JNINativeInterface_* EsJNIFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_EsJNIFunctionsOffset_", declaredType="JNINativeInterface_*")
	public JNINativeInterface_Pointer EsJNIFunctions() throws CorruptDataException {
		return JNINativeInterface_Pointer.cast(getPointerAtOffset(J9JavaVM._EsJNIFunctionsOffset_));
	}

	// JNINativeInterface_* EsJNIFunctions
	public PointerPointer EsJNIFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._EsJNIFunctionsOffset_));
	}

	// void* J9SigQuitShutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9SigQuitShutdownOffset_", declaredType="void*")
	public VoidPointer J9SigQuitShutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._J9SigQuitShutdownOffset_));
	}

	// void* J9SigQuitShutdown
	public PointerPointer J9SigQuitShutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._J9SigQuitShutdownOffset_));
	}

	// void* abortHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_abortHookOffset_", declaredType="void*")
	public VoidPointer abortHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._abortHookOffset_));
	}

	// void* abortHook
	public PointerPointer abortHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._abortHookOffset_));
	}

	// jmethodID addExports
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addExportsOffset_", declaredType="jmethodID")
	public _jmethodIDPointer addExports() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._addExportsOffset_));
	}

	// jmethodID addExports
	public PointerPointer addExportsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._addExportsOffset_));
	}

	// UDATA addModulesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addModulesCountOffset_", declaredType="UDATA")
	public UDATA addModulesCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._addModulesCountOffset_);
	}

	// UDATA addModulesCount
	public UDATAPointer addModulesCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._addModulesCountOffset_));
	}

	// jmethodID addOpens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addOpensOffset_", declaredType="jmethodID")
	public _jmethodIDPointer addOpens() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._addOpensOffset_));
	}

	// jmethodID addOpens
	public PointerPointer addOpensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._addOpensOffset_));
	}

	// jmethodID addProvides
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addProvidesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer addProvides() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._addProvidesOffset_));
	}

	// jmethodID addProvides
	public PointerPointer addProvidesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._addProvidesOffset_));
	}

	// jmethodID addReads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addReadsOffset_", declaredType="jmethodID")
	public _jmethodIDPointer addReads() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._addReadsOffset_));
	}

	// jmethodID addReads
	public PointerPointer addReadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._addReadsOffset_));
	}

	// jmethodID addUses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addUsesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer addUses() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._addUsesOffset_));
	}

	// jmethodID addUses
	public PointerPointer addUsesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._addUsesOffset_));
	}

	// U8* alternateJitDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alternateJitDirOffset_", declaredType="U8*")
	public U8Pointer alternateJitDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._alternateJitDirOffset_));
	}

	// U8* alternateJitDir
	public PointerPointer alternateJitDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._alternateJitDirOffset_));
	}

	// UDATA anonClassCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonClassCountOffset_", declaredType="UDATA")
	public UDATA anonClassCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._anonClassCountOffset_);
	}

	// UDATA anonClassCount
	public UDATAPointer anonClassCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._anonClassCountOffset_));
	}

	// J9ClassLoader* anonClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonClassLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer anonClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9JavaVM._anonClassLoaderOffset_));
	}

	// J9ClassLoader* anonClassLoader
	public PointerPointer anonClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._anonClassLoaderOffset_));
	}

	// UDATA aotDllHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotDllHandleOffset_", declaredType="UDATA")
	public UDATA aotDllHandle() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._aotDllHandleOffset_);
	}

	// UDATA aotDllHandle
	public UDATAPointer aotDllHandleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._aotDllHandleOffset_));
	}

	// void* aotFindAndInitializeMethodEntryPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotFindAndInitializeMethodEntryPointOffset_", declaredType="void*")
	public VoidPointer aotFindAndInitializeMethodEntryPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._aotFindAndInitializeMethodEntryPointOffset_));
	}

	// void* aotFindAndInitializeMethodEntryPoint
	public PointerPointer aotFindAndInitializeMethodEntryPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._aotFindAndInitializeMethodEntryPointOffset_));
	}

	// void* aotInitializeJxeEntryPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotInitializeJxeEntryPointOffset_", declaredType="void*")
	public VoidPointer aotInitializeJxeEntryPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._aotInitializeJxeEntryPointOffset_));
	}

	// void* aotInitializeJxeEntryPoint
	public PointerPointer aotInitializeJxeEntryPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._aotInitializeJxeEntryPointOffset_));
	}

	// omrthread_monitor_t aotRuntimeInitMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotRuntimeInitMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer aotRuntimeInitMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._aotRuntimeInitMutexOffset_));
	}

	// omrthread_monitor_t aotRuntimeInitMutex
	public PointerPointer aotRuntimeInitMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._aotRuntimeInitMutexOffset_));
	}

	// J9ClassLoader* applicationClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_applicationClassLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer applicationClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9JavaVM._applicationClassLoaderOffset_));
	}

	// J9ClassLoader* applicationClassLoader
	public PointerPointer applicationClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._applicationClassLoaderOffset_));
	}

	// J9ROMImageHeader* arrayROMClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayROMClassesOffset_", declaredType="J9ROMImageHeader*")
	public J9ROMImageHeaderPointer arrayROMClasses() throws CorruptDataException {
		return J9ROMImageHeaderPointer.cast(getPointerAtOffset(J9JavaVM._arrayROMClassesOffset_));
	}

	// J9ROMImageHeader* arrayROMClasses
	public PointerPointer arrayROMClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._arrayROMClassesOffset_));
	}

	// UDATA arrayletLeafLogSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayletLeafLogSizeOffset_", declaredType="UDATA")
	public UDATA arrayletLeafLogSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._arrayletLeafLogSizeOffset_);
	}

	// UDATA arrayletLeafLogSize
	public UDATAPointer arrayletLeafLogSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._arrayletLeafLogSizeOffset_));
	}

	// UDATA arrayletLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayletLeafSizeOffset_", declaredType="UDATA")
	public UDATA arrayletLeafSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._arrayletLeafSizeOffset_);
	}

	// UDATA arrayletLeafSize
	public UDATAPointer arrayletLeafSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._arrayletLeafSizeOffset_));
	}

	// J9AsyncEventRecord[] asyncEventHandlers
	public J9AsyncEventRecordPointer asyncEventHandlersEA() throws CorruptDataException {
		return J9AsyncEventRecordPointer.cast(nonNullFieldEA(J9JavaVM._asyncEventHandlersOffset_));
	}

	// omrthread_monitor_t asyncEventMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_asyncEventMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer asyncEventMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._asyncEventMutexOffset_));
	}

	// omrthread_monitor_t asyncEventMutex
	public PointerPointer asyncEventMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._asyncEventMutexOffset_));
	}

	// J9AttachContext attachContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachContextOffset_", declaredType="J9AttachContext")
	public J9AttachContextPointer attachContext() throws CorruptDataException {
		return J9AttachContextPointer.cast(nonNullFieldEA(J9JavaVM._attachContextOffset_));
	}

	// J9AttachContext attachContext
	public PointerPointer attachContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._attachContextOffset_));
	}

	// omrthread_monitor_t bindNativeMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bindNativeMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer bindNativeMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._bindNativeMutexOffset_));
	}

	// omrthread_monitor_t bindNativeMutex
	public PointerPointer bindNativeMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._bindNativeMutexOffset_));
	}

	// J9Class* booleanArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer booleanArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._booleanArrayClassOffset_));
	}

	// J9Class* booleanArrayClass
	public PointerPointer booleanArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._booleanArrayClassOffset_));
	}

	// J9Class* booleanReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer booleanReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._booleanReflectClassOffset_));
	}

	// J9Class* booleanReflectClass
	public PointerPointer booleanReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._booleanReflectClassOffset_));
	}

	// U8* bootstrapClassPath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bootstrapClassPathOffset_", declaredType="U8*")
	public U8Pointer bootstrapClassPath() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._bootstrapClassPathOffset_));
	}

	// U8* bootstrapClassPath
	public PointerPointer bootstrapClassPathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._bootstrapClassPathOffset_));
	}

	// J9Class* byteArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer byteArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._byteArrayClassOffset_));
	}

	// J9Class* byteArrayClass
	public PointerPointer byteArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._byteArrayClassOffset_));
	}

	// J9Class* byteReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer byteReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._byteReflectClassOffset_));
	}

	// J9Class* byteReflectClass
	public PointerPointer byteReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._byteReflectClassOffset_));
	}

	// void* bytecodeLoop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeLoopOffset_", declaredType="void*")
	public VoidPointer bytecodeLoop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._bytecodeLoopOffset_));
	}

	// void* bytecodeLoop
	public PointerPointer bytecodeLoopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._bytecodeLoopOffset_));
	}

	// J9BytecodeVerificationData* bytecodeVerificationData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeVerificationDataOffset_", declaredType="J9BytecodeVerificationData*")
	public J9BytecodeVerificationDataPointer bytecodeVerificationData() throws CorruptDataException {
		return J9BytecodeVerificationDataPointer.cast(getPointerAtOffset(J9JavaVM._bytecodeVerificationDataOffset_));
	}

	// J9BytecodeVerificationData* bytecodeVerificationData
	public PointerPointer bytecodeVerificationDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._bytecodeVerificationDataOffset_));
	}

	// void* cInterpreter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cInterpreterOffset_", declaredType="void*")
	public VoidPointer cInterpreter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._cInterpreterOffset_));
	}

	// void* cInterpreter
	public PointerPointer cInterpreterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._cInterpreterOffset_));
	}

	// U8* callInReturnPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callInReturnPCOffset_", declaredType="U8*")
	public U8Pointer callInReturnPC() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._callInReturnPCOffset_));
	}

	// U8* callInReturnPC
	public PointerPointer callInReturnPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._callInReturnPCOffset_));
	}

	// U32 cancelAbsoluteThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cancelAbsoluteThresholdOffset_", declaredType="U32")
	public UDATA cancelAbsoluteThreshold() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._cancelAbsoluteThresholdOffset_));
	}

	// U32 cancelAbsoluteThreshold
	public UDATAPointer cancelAbsoluteThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._cancelAbsoluteThresholdOffset_));
	}

	// J9Class* charArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer charArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._charArrayClassOffset_));
	}

	// J9Class* charArrayClass
	public PointerPointer charArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._charArrayClassOffset_));
	}

	// J9Class* charReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer charReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._charReflectClassOffset_));
	}

	// J9Class* charReflectClass
	public PointerPointer charReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._charReflectClassOffset_));
	}

	// J9CheckJNIData checkJNIData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_checkJNIDataOffset_", declaredType="J9CheckJNIData")
	public J9CheckJNIDataPointer checkJNIData() throws CorruptDataException {
		return J9CheckJNIDataPointer.cast(nonNullFieldEA(J9JavaVM._checkJNIDataOffset_));
	}

	// J9CheckJNIData checkJNIData
	public PointerPointer checkJNIDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._checkJNIDataOffset_));
	}

	// UDATA classLoaderAllocationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderAllocationCountOffset_", declaredType="UDATA")
	public UDATA classLoaderAllocationCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._classLoaderAllocationCountOffset_);
	}

	// UDATA classLoaderAllocationCount
	public UDATAPointer classLoaderAllocationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._classLoaderAllocationCountOffset_));
	}

	// J9Pool* classLoaderBlocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderBlocksOffset_", declaredType="J9Pool*")
	public J9PoolPointer classLoaderBlocks() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._classLoaderBlocksOffset_));
	}

	// J9Pool* classLoaderBlocks
	public PointerPointer classLoaderBlocksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classLoaderBlocksOffset_));
	}

	// omrthread_monitor_t classLoaderBlocksMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderBlocksMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer classLoaderBlocksMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._classLoaderBlocksMutexOffset_));
	}

	// omrthread_monitor_t classLoaderBlocksMutex
	public PointerPointer classLoaderBlocksMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classLoaderBlocksMutexOffset_));
	}

	// omrthread_monitor_t classLoaderModuleAndLocationMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderModuleAndLocationMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer classLoaderModuleAndLocationMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._classLoaderModuleAndLocationMutexOffset_));
	}

	// omrthread_monitor_t classLoaderModuleAndLocationMutex
	public PointerPointer classLoaderModuleAndLocationMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classLoaderModuleAndLocationMutexOffset_));
	}

	// J9HashTable* classLoadingConstraints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadingConstraintsOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer classLoadingConstraints() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JavaVM._classLoadingConstraintsOffset_));
	}

	// J9HashTable* classLoadingConstraints
	public PointerPointer classLoadingConstraintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classLoadingConstraintsOffset_));
	}

	// UDATA classLoadingMaxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadingMaxStackOffset_", declaredType="UDATA")
	public UDATA classLoadingMaxStack() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._classLoadingMaxStackOffset_);
	}

	// UDATA classLoadingMaxStack
	public UDATAPointer classLoadingMaxStackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._classLoadingMaxStackOffset_));
	}

	// J9Pool* classLoadingStackPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadingStackPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer classLoadingStackPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._classLoadingStackPoolOffset_));
	}

	// J9Pool* classLoadingStackPool
	public PointerPointer classLoadingStackPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classLoadingStackPoolOffset_));
	}

	// J9MemorySegmentList* classMemorySegments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classMemorySegmentsOffset_", declaredType="J9MemorySegmentList*")
	public J9MemorySegmentListPointer classMemorySegments() throws CorruptDataException {
		return J9MemorySegmentListPointer.cast(getPointerAtOffset(J9JavaVM._classMemorySegmentsOffset_));
	}

	// J9MemorySegmentList* classMemorySegments
	public PointerPointer classMemorySegmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classMemorySegmentsOffset_));
	}

	// omrthread_monitor_t classTableMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classTableMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer classTableMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._classTableMutexOffset_));
	}

	// omrthread_monitor_t classTableMutex
	public PointerPointer classTableMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classTableMutexOffset_));
	}

	// omrthread_rwmutex_t classUnloadMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classUnloadMutexOffset_", declaredType="omrthread_rwmutex_t")
	public RWMutexPointer classUnloadMutex() throws CorruptDataException {
		return RWMutexPointer.cast(getPointerAtOffset(J9JavaVM._classUnloadMutexOffset_));
	}

	// omrthread_rwmutex_t classUnloadMutex
	public PointerPointer classUnloadMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._classUnloadMutexOffset_));
	}

	// void* codertOldAboutToBootstrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codertOldAboutToBootstrapOffset_", declaredType="void*")
	public VoidPointer codertOldAboutToBootstrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._codertOldAboutToBootstrapOffset_));
	}

	// void* codertOldAboutToBootstrap
	public PointerPointer codertOldAboutToBootstrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._codertOldAboutToBootstrapOffset_));
	}

	// void* codertOldVMShutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codertOldVMShutdownOffset_", declaredType="void*")
	public VoidPointer codertOldVMShutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._codertOldVMShutdownOffset_));
	}

	// void* codertOldVMShutdown
	public PointerPointer codertOldVMShutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._codertOldVMShutdownOffset_));
	}

	// void* collectJitPrivateThreadData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_collectJitPrivateThreadDataOffset_", declaredType="void*")
	public VoidPointer collectJitPrivateThreadData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._collectJitPrivateThreadDataOffset_));
	}

	// void* collectJitPrivateThreadData
	public PointerPointer collectJitPrivateThreadDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._collectJitPrivateThreadDataOffset_));
	}

	// UDATA compressedPointersShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressedPointersShiftOffset_", declaredType="UDATA")
	public UDATA compressedPointersShift() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._compressedPointersShiftOffset_);
	}

	// UDATA compressedPointersShift
	public UDATAPointer compressedPointersShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._compressedPointersShiftOffset_));
	}

	// omrthread_monitor_t constantDynamicMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantDynamicMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer constantDynamicMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._constantDynamicMutexOffset_));
	}

	// omrthread_monitor_t constantDynamicMutex
	public PointerPointer constantDynamicMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._constantDynamicMutexOffset_));
	}

	// J9HashTable* contendedLoadTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_contendedLoadTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer contendedLoadTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JavaVM._contendedLoadTableOffset_));
	}

	// J9HashTable* contendedLoadTable
	public PointerPointer contendedLoadTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._contendedLoadTableOffset_));
	}

	// U32 cpuCacheWritebackCapabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpuCacheWritebackCapabilitiesOffset_", declaredType="U32")
	public UDATA cpuCacheWritebackCapabilities() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._cpuCacheWritebackCapabilitiesOffset_));
	}

	// U32 cpuCacheWritebackCapabilities
	public UDATAPointer cpuCacheWritebackCapabilitiesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._cpuCacheWritebackCapabilitiesOffset_));
	}

	// J9CudaGlobals* cudaGlobals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cudaGlobalsOffset_", declaredType="J9CudaGlobals*")
	public J9CudaGlobalsPointer cudaGlobals() throws CorruptDataException {
		return J9CudaGlobalsPointer.cast(getPointerAtOffset(J9JavaVM._cudaGlobalsOffset_));
	}

	// J9CudaGlobals* cudaGlobals
	public PointerPointer cudaGlobalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._cudaGlobalsOffset_));
	}

	// J9Pool* customSpinOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_customSpinOptionsOffset_", declaredType="J9Pool*")
	public J9PoolPointer customSpinOptions() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._customSpinOptionsOffset_));
	}

	// J9Pool* customSpinOptions
	public PointerPointer customSpinOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._customSpinOptionsOffset_));
	}

	// UDATA dCacheLineSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dCacheLineSizeOffset_", declaredType="UDATA")
	public UDATA dCacheLineSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._dCacheLineSizeOffset_);
	}

	// UDATA dCacheLineSize
	public UDATAPointer dCacheLineSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._dCacheLineSizeOffset_));
	}

	// UDATA daemonThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_daemonThreadCountOffset_", declaredType="UDATA")
	public UDATA daemonThreadCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._daemonThreadCountOffset_);
	}

	// UDATA daemonThreadCount
	public UDATAPointer daemonThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._daemonThreadCountOffset_));
	}

	// J9VMThread* deadThreadList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deadThreadListOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer deadThreadList() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JavaVM._deadThreadListOffset_));
	}

	// J9VMThread* deadThreadList
	public PointerPointer deadThreadListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._deadThreadListOffset_));
	}

	// UDATA debugField1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugField1Offset_", declaredType="UDATA")
	public UDATA debugField1() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._debugField1Offset_);
	}

	// UDATA debugField1
	public UDATAPointer debugField1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._debugField1Offset_));
	}

	// U8* decompileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompileNameOffset_", declaredType="U8*")
	public U8Pointer decompileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._decompileNameOffset_));
	}

	// U8* decompileName
	public PointerPointer decompileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._decompileNameOffset_));
	}

	// void* defaultMemorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultMemorySpaceOffset_", declaredType="void*")
	public VoidPointer defaultMemorySpace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._defaultMemorySpaceOffset_));
	}

	// void* defaultMemorySpace
	public PointerPointer defaultMemorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._defaultMemorySpaceOffset_));
	}

	// UDATA defaultOSStackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultOSStackSizeOffset_", declaredType="UDATA")
	public UDATA defaultOSStackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._defaultOSStackSizeOffset_);
	}

	// UDATA defaultOSStackSize
	public UDATAPointer defaultOSStackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._defaultOSStackSizeOffset_));
	}

	// j9object_t destroyVMState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destroyVMStateOffset_", declaredType="j9object_t")
	public J9ObjectPointer destroyVMState() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JavaVM._destroyVMStateOffset_));
	}

	// j9object_t destroyVMState
	public PointerPointer destroyVMStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._destroyVMStateOffset_));
	}

	// UDATA directByteBufferMemoryMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_directByteBufferMemoryMaxOffset_", declaredType="UDATA")
	public UDATA directByteBufferMemoryMax() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._directByteBufferMemoryMaxOffset_);
	}

	// UDATA directByteBufferMemoryMax
	public UDATAPointer directByteBufferMemoryMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._directByteBufferMemoryMaxOffset_));
	}

	// J9Pool* dllLoadTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dllLoadTableOffset_", declaredType="J9Pool*")
	public J9PoolPointer dllLoadTable() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._dllLoadTableOffset_));
	}

	// J9Pool* dllLoadTable
	public PointerPointer dllLoadTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._dllLoadTableOffset_));
	}

	// UDATA doPrivilegedMethodID1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedMethodID1Offset_", declaredType="UDATA")
	public UDATA doPrivilegedMethodID1() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedMethodID1Offset_);
	}

	// UDATA doPrivilegedMethodID1
	public UDATAPointer doPrivilegedMethodID1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedMethodID1Offset_));
	}

	// UDATA doPrivilegedMethodID2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedMethodID2Offset_", declaredType="UDATA")
	public UDATA doPrivilegedMethodID2() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedMethodID2Offset_);
	}

	// UDATA doPrivilegedMethodID2
	public UDATAPointer doPrivilegedMethodID2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedMethodID2Offset_));
	}

	// UDATA doPrivilegedWithContextMethodID1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedWithContextMethodID1Offset_", declaredType="UDATA")
	public UDATA doPrivilegedWithContextMethodID1() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedWithContextMethodID1Offset_);
	}

	// UDATA doPrivilegedWithContextMethodID1
	public UDATAPointer doPrivilegedWithContextMethodID1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedWithContextMethodID1Offset_));
	}

	// UDATA doPrivilegedWithContextMethodID2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedWithContextMethodID2Offset_", declaredType="UDATA")
	public UDATA doPrivilegedWithContextMethodID2() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedWithContextMethodID2Offset_);
	}

	// UDATA doPrivilegedWithContextMethodID2
	public UDATAPointer doPrivilegedWithContextMethodID2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedWithContextMethodID2Offset_));
	}

	// UDATA doPrivilegedWithContextPermissionMethodID1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedWithContextPermissionMethodID1Offset_", declaredType="UDATA")
	public UDATA doPrivilegedWithContextPermissionMethodID1() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedWithContextPermissionMethodID1Offset_);
	}

	// UDATA doPrivilegedWithContextPermissionMethodID1
	public UDATAPointer doPrivilegedWithContextPermissionMethodID1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedWithContextPermissionMethodID1Offset_));
	}

	// UDATA doPrivilegedWithContextPermissionMethodID2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPrivilegedWithContextPermissionMethodID2Offset_", declaredType="UDATA")
	public UDATA doPrivilegedWithContextPermissionMethodID2() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._doPrivilegedWithContextPermissionMethodID2Offset_);
	}

	// UDATA doPrivilegedWithContextPermissionMethodID2
	public UDATAPointer doPrivilegedWithContextPermissionMethodID2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._doPrivilegedWithContextPermissionMethodID2Offset_));
	}

	// J9Class* doubleArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer doubleArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._doubleArrayClassOffset_));
	}

	// J9Class* doubleArrayClass
	public PointerPointer doubleArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._doubleArrayClassOffset_));
	}

	// void* doubleJITExitInterpreter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleJITExitInterpreterOffset_", declaredType="void*")
	public VoidPointer doubleJITExitInterpreter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._doubleJITExitInterpreterOffset_));
	}

	// void* doubleJITExitInterpreter
	public PointerPointer doubleJITExitInterpreterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._doubleJITExitInterpreterOffset_));
	}

	// J9Class* doubleReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer doubleReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._doubleReflectClassOffset_));
	}

	// J9Class* doubleReflectClass
	public PointerPointer doubleReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._doubleReflectClassOffset_));
	}

	// J9TranslationBufferSet* dynamicLoadBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicLoadBuffersOffset_", declaredType="J9TranslationBufferSet*")
	public J9TranslationBufferSetPointer dynamicLoadBuffers() throws CorruptDataException {
		return J9TranslationBufferSetPointer.cast(getPointerAtOffset(J9JavaVM._dynamicLoadBuffersOffset_));
	}

	// J9TranslationBufferSet* dynamicLoadBuffers
	public PointerPointer dynamicLoadBuffersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._dynamicLoadBuffersOffset_));
	}

	// UDATA dynamicLoadClassAllocationIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicLoadClassAllocationIncrementOffset_", declaredType="UDATA")
	public UDATA dynamicLoadClassAllocationIncrement() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._dynamicLoadClassAllocationIncrementOffset_);
	}

	// UDATA dynamicLoadClassAllocationIncrement
	public UDATAPointer dynamicLoadClassAllocationIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._dynamicLoadClassAllocationIncrementOffset_));
	}

	// U32 enableGlobalLockReservation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enableGlobalLockReservationOffset_", declaredType="U32")
	public UDATA enableGlobalLockReservation() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._enableGlobalLockReservationOffset_));
	}

	// U32 enableGlobalLockReservation
	public UDATAPointer enableGlobalLockReservationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._enableGlobalLockReservationOffset_));
	}

	// omrthread_monitor_t exclusiveAccessMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer exclusiveAccessMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._exclusiveAccessMutexOffset_));
	}

	// omrthread_monitor_t exclusiveAccessMutex
	public PointerPointer exclusiveAccessMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveAccessMutexOffset_));
	}

	// UDATA exclusiveAccessResponseCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessResponseCountOffset_", declaredType="UDATA")
	public UDATA exclusiveAccessResponseCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._exclusiveAccessResponseCountOffset_);
	}

	// UDATA exclusiveAccessResponseCount
	public UDATAPointer exclusiveAccessResponseCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveAccessResponseCountOffset_));
	}

	// UDATA exclusiveAccessState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessStateOffset_", declaredType="UDATA")
	public UDATA exclusiveAccessState() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._exclusiveAccessStateOffset_);
	}

	// UDATA exclusiveAccessState
	public UDATAPointer exclusiveAccessStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveAccessStateOffset_));
	}

	// J9PortVmemIdentifier exclusiveGuardPage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveGuardPageOffset_", declaredType="J9PortVmemIdentifier")
	public J9PortVmemIdentifierPointer exclusiveGuardPage() throws CorruptDataException {
		return J9PortVmemIdentifierPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveGuardPageOffset_));
	}

	// J9PortVmemIdentifier exclusiveGuardPage
	public PointerPointer exclusiveGuardPageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveGuardPageOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveVMAccessQueueHeadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer exclusiveVMAccessQueueHead() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JavaVM._exclusiveVMAccessQueueHeadOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueHead
	public PointerPointer exclusiveVMAccessQueueHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveVMAccessQueueHeadOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveVMAccessQueueTailOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer exclusiveVMAccessQueueTail() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JavaVM._exclusiveVMAccessQueueTailOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueTail
	public PointerPointer exclusiveVMAccessQueueTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._exclusiveVMAccessQueueTailOffset_));
	}

	// void* exitHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exitHookOffset_", declaredType="void*")
	public VoidPointer exitHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._exitHookOffset_));
	}

	// void* exitHook
	public PointerPointer exitHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._exitHookOffset_));
	}

	// omrthread_monitor_t extendedMethodFlagsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extendedMethodFlagsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer extendedMethodFlagsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._extendedMethodFlagsMutexOffset_));
	}

	// omrthread_monitor_t extendedMethodFlagsMutex
	public PointerPointer extendedMethodFlagsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._extendedMethodFlagsMutexOffset_));
	}

	// U32 extendedRuntimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extendedRuntimeFlagsOffset_", declaredType="U32")
	public UDATA extendedRuntimeFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._extendedRuntimeFlagsOffset_));
	}

	// U32 extendedRuntimeFlags
	public UDATAPointer extendedRuntimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._extendedRuntimeFlagsOffset_));
	}

	// U32 extendedRuntimeFlags2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extendedRuntimeFlags2Offset_", declaredType="U32")
	public UDATA extendedRuntimeFlags2() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._extendedRuntimeFlags2Offset_));
	}

	// U32 extendedRuntimeFlags2
	public UDATAPointer extendedRuntimeFlags2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._extendedRuntimeFlags2Offset_));
	}

	// J9ClassLoader* extensionClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extensionClassLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer extensionClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9JavaVM._extensionClassLoaderOffset_));
	}

	// J9ClassLoader* extensionClassLoader
	public PointerPointer extensionClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._extensionClassLoaderOffset_));
	}

	// omrthread_monitor_t fieldIndexMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldIndexMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer fieldIndexMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._fieldIndexMutexOffset_));
	}

	// omrthread_monitor_t fieldIndexMutex
	public PointerPointer fieldIndexMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._fieldIndexMutexOffset_));
	}

	// J9HashTable* fieldIndexTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldIndexTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer fieldIndexTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JavaVM._fieldIndexTableOffset_));
	}

	// J9HashTable* fieldIndexTable
	public PointerPointer fieldIndexTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._fieldIndexTableOffset_));
	}

	// UDATA fieldIndexThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldIndexThresholdOffset_", declaredType="UDATA")
	public UDATA fieldIndexThreshold() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._fieldIndexThresholdOffset_);
	}

	// UDATA fieldIndexThreshold
	public UDATAPointer fieldIndexThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._fieldIndexThresholdOffset_));
	}

	// UDATA finalizeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeFlagsOffset_", declaredType="UDATA")
	public UDATA finalizeFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._finalizeFlagsOffset_);
	}

	// UDATA finalizeFlags
	public UDATAPointer finalizeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._finalizeFlagsOffset_));
	}

	// UDATA finalizeForceClassLoaderUnloadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeForceClassLoaderUnloadCountOffset_", declaredType="UDATA")
	public UDATA finalizeForceClassLoaderUnloadCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._finalizeForceClassLoaderUnloadCountOffset_);
	}

	// UDATA finalizeForceClassLoaderUnloadCount
	public UDATAPointer finalizeForceClassLoaderUnloadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._finalizeForceClassLoaderUnloadCountOffset_));
	}

	// IDATA finalizeMainFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeMainFlagsOffset_", declaredType="IDATA")
	public IDATA finalizeMainFlags() throws CorruptDataException {
		return getIDATAAtOffset(J9JavaVM._finalizeMainFlagsOffset_);
	}

	// IDATA finalizeMainFlags
	public IDATAPointer finalizeMainFlagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JavaVM._finalizeMainFlagsOffset_));
	}

	// omrthread_monitor_t finalizeMainMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeMainMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer finalizeMainMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._finalizeMainMonitorOffset_));
	}

	// omrthread_monitor_t finalizeMainMonitor
	public PointerPointer finalizeMainMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._finalizeMainMonitorOffset_));
	}

	// omrthread_t finalizeMainThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeMainThreadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer finalizeMainThread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9JavaVM._finalizeMainThreadOffset_));
	}

	// omrthread_t finalizeMainThread
	public PointerPointer finalizeMainThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._finalizeMainThreadOffset_));
	}

	// UDATA finalizeRunFinalizationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeRunFinalizationCountOffset_", declaredType="UDATA")
	public UDATA finalizeRunFinalizationCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._finalizeRunFinalizationCountOffset_);
	}

	// UDATA finalizeRunFinalizationCount
	public UDATAPointer finalizeRunFinalizationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._finalizeRunFinalizationCountOffset_));
	}

	// omrthread_monitor_t finalizeRunFinalizationMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeRunFinalizationMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer finalizeRunFinalizationMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._finalizeRunFinalizationMutexOffset_));
	}

	// omrthread_monitor_t finalizeRunFinalizationMutex
	public PointerPointer finalizeRunFinalizationMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._finalizeRunFinalizationMutexOffset_));
	}

	// void* finalizeWorkerData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeWorkerDataOffset_", declaredType="void*")
	public VoidPointer finalizeWorkerData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._finalizeWorkerDataOffset_));
	}

	// void* finalizeWorkerData
	public PointerPointer finalizeWorkerDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._finalizeWorkerDataOffset_));
	}

	// J9Class* floatArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer floatArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._floatArrayClassOffset_));
	}

	// J9Class* floatArrayClass
	public PointerPointer floatArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._floatArrayClassOffset_));
	}

	// void* floatJITExitInterpreter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatJITExitInterpreterOffset_", declaredType="void*")
	public VoidPointer floatJITExitInterpreter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._floatJITExitInterpreterOffset_));
	}

	// void* floatJITExitInterpreter
	public PointerPointer floatJITExitInterpreterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._floatJITExitInterpreterOffset_));
	}

	// J9Class* floatReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer floatReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._floatReflectClassOffset_));
	}

	// J9Class* floatReflectClass
	public PointerPointer floatReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._floatReflectClassOffset_));
	}

	// omrthread_monitor_t flushMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flushMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer flushMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._flushMutexOffset_));
	}

	// omrthread_monitor_t flushMutex
	public PointerPointer flushMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._flushMutexOffset_));
	}

	// void* freeAotRuntimeInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeAotRuntimeInfoOffset_", declaredType="void*")
	public VoidPointer freeAotRuntimeInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._freeAotRuntimeInfoOffset_));
	}

	// void* freeAotRuntimeInfo
	public PointerPointer freeAotRuntimeInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._freeAotRuntimeInfoOffset_));
	}

	// UDATA freePreviousClassLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freePreviousClassLoadersOffset_", declaredType="UDATA")
	public UDATA freePreviousClassLoaders() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._freePreviousClassLoadersOffset_);
	}

	// UDATA freePreviousClassLoaders
	public UDATAPointer freePreviousClassLoadersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._freePreviousClassLoadersOffset_));
	}

	// UDATA gcAllocationType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcAllocationTypeOffset_", declaredType="UDATA")
	public UDATA gcAllocationType() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._gcAllocationTypeOffset_);
	}

	// UDATA gcAllocationType
	public UDATAPointer gcAllocationTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._gcAllocationTypeOffset_));
	}

	// void* gcExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcExtensionsOffset_", declaredType="void*")
	public VoidPointer gcExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._gcExtensionsOffset_));
	}

	// void* gcExtensions
	public PointerPointer gcExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._gcExtensionsOffset_));
	}

	// J9GCVMInfo gcInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcInfoOffset_", declaredType="J9GCVMInfo")
	public J9GCVMInfoPointer gcInfo() throws CorruptDataException {
		return J9GCVMInfoPointer.cast(nonNullFieldEA(J9JavaVM._gcInfoOffset_));
	}

	// J9GCVMInfo gcInfo
	public PointerPointer gcInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._gcInfoOffset_));
	}

	// UDATA gcOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOptionsOffset_", declaredType="UDATA")
	public UDATA gcOptions() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._gcOptionsOffset_);
	}

	// UDATA gcOptions
	public UDATAPointer gcOptionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._gcOptionsOffset_));
	}

	// UDATA gcPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcPolicyOffset_", declaredType="UDATA")
	public UDATA gcPolicy() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._gcPolicyOffset_);
	}

	// UDATA gcPolicy
	public UDATAPointer gcPolicyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._gcPolicyOffset_));
	}

	// UDATA gcReadBarrierType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcReadBarrierTypeOffset_", declaredType="UDATA")
	public UDATA gcReadBarrierType() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._gcReadBarrierTypeOffset_);
	}

	// UDATA gcReadBarrierType
	public UDATAPointer gcReadBarrierTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._gcReadBarrierTypeOffset_));
	}

	// UDATA gcWriteBarrierType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcWriteBarrierTypeOffset_", declaredType="UDATA")
	public UDATA gcWriteBarrierType() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._gcWriteBarrierTypeOffset_);
	}

	// UDATA gcWriteBarrierType
	public UDATAPointer gcWriteBarrierTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._gcWriteBarrierTypeOffset_));
	}

	// U32 globalEventFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalEventFlagsOffset_", declaredType="U32")
	public UDATA globalEventFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._globalEventFlagsOffset_));
	}

	// U32 globalEventFlags
	public UDATAPointer globalEventFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._globalEventFlagsOffset_));
	}

	// omrthread_monitor_t globalHotFieldPoolMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalHotFieldPoolMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer globalHotFieldPoolMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._globalHotFieldPoolMutexOffset_));
	}

	// omrthread_monitor_t globalHotFieldPoolMutex
	public PointerPointer globalHotFieldPoolMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._globalHotFieldPoolMutexOffset_));
	}

	// void* heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseOffset_", declaredType="void*")
	public VoidPointer heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._heapBaseOffset_));
	}

	// void* heapBase
	public PointerPointer heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._heapBaseOffset_));
	}

	// j9object_t* heapOOMStringRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapOOMStringRefOffset_", declaredType="j9object_t*")
	public PointerPointer heapOOMStringRef() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JavaVM._heapOOMStringRefOffset_));
	}

	// j9object_t* heapOOMStringRef
	public PointerPointer heapOOMStringRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._heapOOMStringRefOffset_));
	}

	// void* heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapTopOffset_", declaredType="void*")
	public VoidPointer heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._heapTopOffset_));
	}

	// void* heapTop
	public PointerPointer heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._heapTopOffset_));
	}

	// J9ROMFieldShape* hiddenFinalizeLinkFieldShape
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenFinalizeLinkFieldShapeOffset_", declaredType="J9ROMFieldShape*")
	public J9ROMFieldShapePointer hiddenFinalizeLinkFieldShape() throws CorruptDataException {
		return J9ROMFieldShapePointer.cast(getPointerAtOffset(J9JavaVM._hiddenFinalizeLinkFieldShapeOffset_));
	}

	// J9ROMFieldShape* hiddenFinalizeLinkFieldShape
	public PointerPointer hiddenFinalizeLinkFieldShapeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hiddenFinalizeLinkFieldShapeOffset_));
	}

	// J9HiddenInstanceField* hiddenInstanceFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenInstanceFieldsOffset_", declaredType="J9HiddenInstanceField*")
	public J9HiddenInstanceFieldPointer hiddenInstanceFields() throws CorruptDataException {
		return J9HiddenInstanceFieldPointer.cast(getPointerAtOffset(J9JavaVM._hiddenInstanceFieldsOffset_));
	}

	// J9HiddenInstanceField* hiddenInstanceFields
	public PointerPointer hiddenInstanceFieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hiddenInstanceFieldsOffset_));
	}

	// omrthread_monitor_t hiddenInstanceFieldsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenInstanceFieldsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer hiddenInstanceFieldsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._hiddenInstanceFieldsMutexOffset_));
	}

	// omrthread_monitor_t hiddenInstanceFieldsMutex
	public PointerPointer hiddenInstanceFieldsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hiddenInstanceFieldsMutexOffset_));
	}

	// J9ROMFieldShape* hiddenLockwordFieldShape
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenLockwordFieldShapeOffset_", declaredType="J9ROMFieldShape*")
	public J9ROMFieldShapePointer hiddenLockwordFieldShape() throws CorruptDataException {
		return J9ROMFieldShapePointer.cast(getPointerAtOffset(J9JavaVM._hiddenLockwordFieldShapeOffset_));
	}

	// J9ROMFieldShape* hiddenLockwordFieldShape
	public PointerPointer hiddenLockwordFieldShapeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hiddenLockwordFieldShapeOffset_));
	}

	// J9VMHookInterface hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInterfaceOffset_", declaredType="J9VMHookInterface")
	public J9VMHookInterfacePointer hookInterface() throws CorruptDataException {
		return J9VMHookInterfacePointer.cast(nonNullFieldEA(J9JavaVM._hookInterfaceOffset_));
	}

	// J9VMHookInterface hookInterface
	public PointerPointer hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hookInterfaceOffset_));
	}

	// void* hookVMEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookVMEventOffset_", declaredType="void*")
	public VoidPointer hookVMEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._hookVMEventOffset_));
	}

	// void* hookVMEvent
	public PointerPointer hookVMEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hookVMEventOffset_));
	}

	// J9Pool* hotFieldClassInfoPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldClassInfoPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer hotFieldClassInfoPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._hotFieldClassInfoPoolOffset_));
	}

	// J9Pool* hotFieldClassInfoPool
	public PointerPointer hotFieldClassInfoPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hotFieldClassInfoPoolOffset_));
	}

	// omrthread_monitor_t hotFieldClassInfoPoolMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldClassInfoPoolMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer hotFieldClassInfoPoolMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._hotFieldClassInfoPoolMutexOffset_));
	}

	// omrthread_monitor_t hotFieldClassInfoPoolMutex
	public PointerPointer hotFieldClassInfoPoolMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._hotFieldClassInfoPoolMutexOffset_));
	}

	// UDATA hotSwapCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotSwapCountOffset_", declaredType="UDATA")
	public UDATA hotSwapCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._hotSwapCountOffset_);
	}

	// UDATA hotSwapCount
	public UDATAPointer hotSwapCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._hotSwapCountOffset_));
	}

	// J9IdentityHashData* identityHashData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_identityHashDataOffset_", declaredType="J9IdentityHashData*")
	public J9IdentityHashDataPointer identityHashData() throws CorruptDataException {
		return J9IdentityHashDataPointer.cast(getPointerAtOffset(J9JavaVM._identityHashDataOffset_));
	}

	// J9IdentityHashData* identityHashData
	public PointerPointer identityHashDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._identityHashDataOffset_));
	}

	// U8* impdep1PC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_impdep1PCOffset_", declaredType="U8*")
	public U8Pointer impdep1PC() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._impdep1PCOffset_));
	}

	// U8* impdep1PC
	public PointerPointer impdep1PCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._impdep1PCOffset_));
	}

	// J9InitializerMethods initialMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialMethodsOffset_", declaredType="J9InitializerMethods")
	public J9InitializerMethodsPointer initialMethods() throws CorruptDataException {
		return J9InitializerMethodsPointer.cast(nonNullFieldEA(J9JavaVM._initialMethodsOffset_));
	}

	// J9InitializerMethods initialMethods
	public PointerPointer initialMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._initialMethodsOffset_));
	}

	// UDATA initialStackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialStackSizeOffset_", declaredType="UDATA")
	public UDATA initialStackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._initialStackSizeOffset_);
	}

	// UDATA initialStackSize
	public UDATAPointer initialStackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._initialStackSizeOffset_));
	}

	// UDATA initializeSlotsOnTLHAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeSlotsOnTLHAllocateOffset_", declaredType="UDATA")
	public UDATA initializeSlotsOnTLHAllocate() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._initializeSlotsOnTLHAllocateOffset_);
	}

	// UDATA initializeSlotsOnTLHAllocate
	public UDATAPointer initializeSlotsOnTLHAllocateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._initializeSlotsOnTLHAllocateOffset_));
	}

	// J9Class* intArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer intArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._intArrayClassOffset_));
	}

	// J9Class* intArrayClass
	public PointerPointer intArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._intArrayClassOffset_));
	}

	// J9Class* intReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer intReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._intReflectClassOffset_));
	}

	// J9Class* intReflectClass
	public PointerPointer intReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._intReflectClassOffset_));
	}

	// J9InternalVMFunctions* internalVMFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalVMFunctionsOffset_", declaredType="J9InternalVMFunctions*")
	public J9InternalVMFunctionsPointer internalVMFunctions() throws CorruptDataException {
		return J9InternalVMFunctionsPointer.cast(getPointerAtOffset(J9JavaVM._internalVMFunctionsOffset_));
	}

	// J9InternalVMFunctions* internalVMFunctions
	public PointerPointer internalVMFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._internalVMFunctionsOffset_));
	}

	// J9InternalVMLabels* internalVMLabels
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalVMLabelsOffset_", declaredType="J9InternalVMLabels*")
	public J9InternalVMLabelsPointer internalVMLabels() throws CorruptDataException {
		return J9InternalVMLabelsPointer.cast(getPointerAtOffset(J9JavaVM._internalVMLabelsOffset_));
	}

	// J9InternalVMLabels* internalVMLabels
	public PointerPointer internalVMLabelsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._internalVMLabelsOffset_));
	}

	// U8* j2seRootDirectory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2seRootDirectoryOffset_", declaredType="U8*")
	public U8Pointer j2seRootDirectory() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._j2seRootDirectoryOffset_));
	}

	// U8* j2seRootDirectory
	public PointerPointer j2seRootDirectoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j2seRootDirectoryOffset_));
	}

	// UDATA j2seVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2seVersionOffset_", declaredType="UDATA")
	public UDATA j2seVersion() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._j2seVersionOffset_);
	}

	// UDATA j2seVersion
	public UDATAPointer j2seVersionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._j2seVersionOffset_));
	}

	// UDATA[] j9Thread2JavaPriorityMap
	public UDATAPointer j9Thread2JavaPriorityMapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._j9Thread2JavaPriorityMapOffset_));
	}

	// U8* j9libvmDirectory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9libvmDirectoryOffset_", declaredType="U8*")
	public U8Pointer j9libvmDirectory() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._j9libvmDirectoryOffset_));
	}

	// U8* j9libvmDirectory
	public PointerPointer j9libvmDirectoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j9libvmDirectoryOffset_));
	}

	// J9RAS* j9ras
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9rasOffset_", declaredType="J9RAS*")
	public J9RASPointer j9ras() throws CorruptDataException {
		return J9RASPointer.cast(getPointerAtOffset(J9JavaVM._j9rasOffset_));
	}

	// J9RAS* j9ras
	public PointerPointer j9rasEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j9rasOffset_));
	}

	// J9RASdumpFunctions* j9rasDumpFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9rasDumpFunctionsOffset_", declaredType="J9RASdumpFunctions*")
	public J9RASdumpFunctionsPointer j9rasDumpFunctions() throws CorruptDataException {
		return J9RASdumpFunctionsPointer.cast(getPointerAtOffset(J9JavaVM._j9rasDumpFunctionsOffset_));
	}

	// J9RASdumpFunctions* j9rasDumpFunctions
	public PointerPointer j9rasDumpFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j9rasDumpFunctionsOffset_));
	}

	// void* j9rasGlobalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9rasGlobalStorageOffset_", declaredType="void*")
	public VoidPointer j9rasGlobalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._j9rasGlobalStorageOffset_));
	}

	// void* j9rasGlobalStorage
	public PointerPointer j9rasGlobalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j9rasGlobalStorageOffset_));
	}

	// void* j9rasdumpGlobalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9rasdumpGlobalStorageOffset_", declaredType="void*")
	public VoidPointer j9rasdumpGlobalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._j9rasdumpGlobalStorageOffset_));
	}

	// void* j9rasdumpGlobalStorage
	public PointerPointer j9rasdumpGlobalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._j9rasdumpGlobalStorageOffset_));
	}

	// UDATA[] java2J9ThreadPriorityMap
	public UDATAPointer java2J9ThreadPriorityMapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._java2J9ThreadPriorityMapOffset_));
	}

	// J9Module* javaBaseModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaBaseModuleOffset_", declaredType="J9Module*")
	public J9ModulePointer javaBaseModule() throws CorruptDataException {
		return J9ModulePointer.cast(getPointerAtOffset(J9JavaVM._javaBaseModuleOffset_));
	}

	// J9Module* javaBaseModule
	public PointerPointer javaBaseModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._javaBaseModuleOffset_));
	}

	// U8* javaHome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaHomeOffset_", declaredType="U8*")
	public U8Pointer javaHome() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._javaHomeOffset_));
	}

	// U8* javaHome
	public PointerPointer javaHomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._javaHomeOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JavaVM._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._javaVMOffset_));
	}

	// jclass java_nio_Buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_java_nio_BufferOffset_", declaredType="jclass")
	public _jclassPointer java_nio_Buffer() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._java_nio_BufferOffset_));
	}

	// jclass java_nio_Buffer
	public PointerPointer java_nio_BufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._java_nio_BufferOffset_));
	}

	// jfieldID java_nio_Buffer_address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_java_nio_Buffer_addressOffset_", declaredType="jfieldID")
	public _jfieldIDPointer java_nio_Buffer_address() throws CorruptDataException {
		return _jfieldIDPointer.cast(getPointerAtOffset(J9JavaVM._java_nio_Buffer_addressOffset_));
	}

	// jfieldID java_nio_Buffer_address
	public PointerPointer java_nio_Buffer_addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._java_nio_Buffer_addressOffset_));
	}

	// jfieldID java_nio_Buffer_capacity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_java_nio_Buffer_capacityOffset_", declaredType="jfieldID")
	public _jfieldIDPointer java_nio_Buffer_capacity() throws CorruptDataException {
		return _jfieldIDPointer.cast(getPointerAtOffset(J9JavaVM._java_nio_Buffer_capacityOffset_));
	}

	// jfieldID java_nio_Buffer_capacity
	public PointerPointer java_nio_Buffer_capacityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._java_nio_Buffer_capacityOffset_));
	}

	// jclass java_nio_DirectByteBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_java_nio_DirectByteBufferOffset_", declaredType="jclass")
	public _jclassPointer java_nio_DirectByteBuffer() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._java_nio_DirectByteBufferOffset_));
	}

	// jclass java_nio_DirectByteBuffer
	public PointerPointer java_nio_DirectByteBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._java_nio_DirectByteBufferOffset_));
	}

	// jmethodID java_nio_DirectByteBuffer_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_java_nio_DirectByteBuffer_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer java_nio_DirectByteBuffer_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JavaVM._java_nio_DirectByteBuffer_initOffset_));
	}

	// jmethodID java_nio_DirectByteBuffer_init
	public PointerPointer java_nio_DirectByteBuffer_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._java_nio_DirectByteBuffer_initOffset_));
	}

	// omrthread_monitor_t jclCacheMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclCacheMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer jclCacheMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._jclCacheMutexOffset_));
	}

	// omrthread_monitor_t jclCacheMutex
	public PointerPointer jclCacheMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jclCacheMutexOffset_));
	}

	// J9RAMConstantPoolItem[] jclConstantPool
	public J9RAMConstantPoolItemPointer jclConstantPoolEA() throws CorruptDataException {
		return J9RAMConstantPoolItemPointer.cast(nonNullFieldEA(J9JavaVM._jclConstantPoolOffset_));
	}

	// U8* jclDLLName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclDLLNameOffset_", declaredType="U8*")
	public U8Pointer jclDLLName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._jclDLLNameOffset_));
	}

	// U8* jclDLLName
	public PointerPointer jclDLLNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jclDLLNameOffset_));
	}

	// UDATA jclFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclFlagsOffset_", declaredType="UDATA")
	public UDATA jclFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._jclFlagsOffset_);
	}

	// UDATA jclFlags
	public UDATAPointer jclFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._jclFlagsOffset_));
	}

	// U8* jclSysPropBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclSysPropBufferOffset_", declaredType="U8*")
	public U8Pointer jclSysPropBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._jclSysPropBufferOffset_));
	}

	// U8* jclSysPropBuffer
	public PointerPointer jclSysPropBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jclSysPropBufferOffset_));
	}

	// jclass jimModules
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimModulesOffset_", declaredType="jclass")
	public _jclassPointer jimModules() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._jimModulesOffset_));
	}

	// jclass jimModules
	public PointerPointer jimModulesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jimModulesOffset_));
	}

	// J9JImageIntf* jimageIntf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageIntfOffset_", declaredType="J9JImageIntf*")
	public J9JImageIntfPointer jimageIntf() throws CorruptDataException {
		return J9JImageIntfPointer.cast(getPointerAtOffset(J9JavaVM._jimageIntfOffset_));
	}

	// J9JImageIntf* jimageIntf
	public PointerPointer jimageIntfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jimageIntfOffset_));
	}

	// J9JITConfig* jitConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitConfigOffset_", declaredType="J9JITConfig*")
	public J9JITConfigPointer jitConfig() throws CorruptDataException {
		return J9JITConfigPointer.cast(getPointerAtOffset(J9JavaVM._jitConfigOffset_));
	}

	// J9JITConfig* jitConfig
	public PointerPointer jitConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitConfigOffset_));
	}

	// void* jitExceptionHandlerSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExceptionHandlerSearchOffset_", declaredType="void*")
	public VoidPointer jitExceptionHandlerSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitExceptionHandlerSearchOffset_));
	}

	// void* jitExceptionHandlerSearch
	public PointerPointer jitExceptionHandlerSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitExceptionHandlerSearchOffset_));
	}

	// void* jitExceptionHandlerSearchVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExceptionHandlerSearchVerboseOffset_", declaredType="void*")
	public VoidPointer jitExceptionHandlerSearchVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitExceptionHandlerSearchVerboseOffset_));
	}

	// void* jitExceptionHandlerSearchVerbose
	public PointerPointer jitExceptionHandlerSearchVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitExceptionHandlerSearchVerboseOffset_));
	}

	// void* jitGetOwnedObjectMonitors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetOwnedObjectMonitorsOffset_", declaredType="void*")
	public VoidPointer jitGetOwnedObjectMonitors() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitGetOwnedObjectMonitorsOffset_));
	}

	// void* jitGetOwnedObjectMonitors
	public PointerPointer jitGetOwnedObjectMonitorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitGetOwnedObjectMonitorsOffset_));
	}

	// void* jitOldAboutToBootstrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitOldAboutToBootstrapOffset_", declaredType="void*")
	public VoidPointer jitOldAboutToBootstrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitOldAboutToBootstrapOffset_));
	}

	// void* jitOldAboutToBootstrap
	public PointerPointer jitOldAboutToBootstrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitOldAboutToBootstrapOffset_));
	}

	// void* jitOldVMShutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitOldVMShutdownOffset_", declaredType="void*")
	public VoidPointer jitOldVMShutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitOldVMShutdownOffset_));
	}

	// void* jitOldVMShutdown
	public PointerPointer jitOldVMShutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitOldVMShutdownOffset_));
	}

	// void* jitWalkStackFrames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitWalkStackFramesOffset_", declaredType="void*")
	public VoidPointer jitWalkStackFrames() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitWalkStackFramesOffset_));
	}

	// void* jitWalkStackFrames
	public PointerPointer jitWalkStackFramesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitWalkStackFramesOffset_));
	}

	// void* jitWalkStackFramesVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitWalkStackFramesVerboseOffset_", declaredType="void*")
	public VoidPointer jitWalkStackFramesVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jitWalkStackFramesVerboseOffset_));
	}

	// void* jitWalkStackFramesVerbose
	public PointerPointer jitWalkStackFramesVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jitWalkStackFramesVerboseOffset_));
	}

	// jclass jliArgumentHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jliArgumentHelperOffset_", declaredType="jclass")
	public _jclassPointer jliArgumentHelper() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._jliArgumentHelperOffset_));
	}

	// jclass jliArgumentHelper
	public PointerPointer jliArgumentHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jliArgumentHelperOffset_));
	}

	// J9Method* jliMethodHandleInvokeWithArgs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jliMethodHandleInvokeWithArgsOffset_", declaredType="J9Method*")
	public J9MethodPointer jliMethodHandleInvokeWithArgs() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JavaVM._jliMethodHandleInvokeWithArgsOffset_));
	}

	// J9Method* jliMethodHandleInvokeWithArgs
	public PointerPointer jliMethodHandleInvokeWithArgsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jliMethodHandleInvokeWithArgsOffset_));
	}

	// J9Method* jliMethodHandleInvokeWithArgsList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jliMethodHandleInvokeWithArgsListOffset_", declaredType="J9Method*")
	public J9MethodPointer jliMethodHandleInvokeWithArgsList() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JavaVM._jliMethodHandleInvokeWithArgsListOffset_));
	}

	// J9Method* jliMethodHandleInvokeWithArgsList
	public PointerPointer jliMethodHandleInvokeWithArgsListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jliMethodHandleInvokeWithArgsListOffset_));
	}

	// J9Method* jlrMethodInvoke
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jlrMethodInvokeOffset_", declaredType="J9Method*")
	public J9MethodPointer jlrMethodInvoke() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JavaVM._jlrMethodInvokeOffset_));
	}

	// J9Method* jlrMethodInvoke
	public PointerPointer jlrMethodInvokeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jlrMethodInvokeOffset_));
	}

	// UDATA jniArrayCacheMaxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniArrayCacheMaxSizeOffset_", declaredType="UDATA")
	public UDATA jniArrayCacheMaxSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._jniArrayCacheMaxSizeOffset_);
	}

	// UDATA jniArrayCacheMaxSize
	public UDATAPointer jniArrayCacheMaxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._jniArrayCacheMaxSizeOffset_));
	}

	// omrthread_monitor_t jniCriticalLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCriticalLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer jniCriticalLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._jniCriticalLockOffset_));
	}

	// omrthread_monitor_t jniCriticalLock
	public PointerPointer jniCriticalLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniCriticalLockOffset_));
	}

	// UDATA jniCriticalResponseCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCriticalResponseCountOffset_", declaredType="UDATA")
	public UDATA jniCriticalResponseCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._jniCriticalResponseCountOffset_);
	}

	// UDATA jniCriticalResponseCount
	public UDATAPointer jniCriticalResponseCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._jniCriticalResponseCountOffset_));
	}

	// omrthread_monitor_t jniFrameMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniFrameMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer jniFrameMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._jniFrameMutexOffset_));
	}

	// omrthread_monitor_t jniFrameMutex
	public PointerPointer jniFrameMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniFrameMutexOffset_));
	}

	// void* jniFunctionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniFunctionTableOffset_", declaredType="void*")
	public VoidPointer jniFunctionTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jniFunctionTableOffset_));
	}

	// void* jniFunctionTable
	public PointerPointer jniFunctionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniFunctionTableOffset_));
	}

	// J9Pool* jniGlobalReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniGlobalReferencesOffset_", declaredType="J9Pool*")
	public J9PoolPointer jniGlobalReferences() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._jniGlobalReferencesOffset_));
	}

	// J9Pool* jniGlobalReferences
	public PointerPointer jniGlobalReferencesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniGlobalReferencesOffset_));
	}

	// void* jniSendTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniSendTargetOffset_", declaredType="void*")
	public VoidPointer jniSendTarget() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jniSendTargetOffset_));
	}

	// void* jniSendTarget
	public PointerPointer jniSendTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniSendTargetOffset_));
	}

	// J9Pool* jniWeakGlobalReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniWeakGlobalReferencesOffset_", declaredType="J9Pool*")
	public J9PoolPointer jniWeakGlobalReferences() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._jniWeakGlobalReferencesOffset_));
	}

	// J9Pool* jniWeakGlobalReferences
	public PointerPointer jniWeakGlobalReferencesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jniWeakGlobalReferencesOffset_));
	}

	// JVMExt jvmExtensionInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmExtensionInterfaceOffset_", declaredType="JVMExt")
	public JVMExt_Pointer jvmExtensionInterface() throws CorruptDataException {
		return JVMExt_Pointer.cast(nonNullFieldEA(J9JavaVM._jvmExtensionInterfaceOffset_));
	}

	// JVMExt jvmExtensionInterface
	public PointerPointer jvmExtensionInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jvmExtensionInterfaceOffset_));
	}

	// void* jvmtiData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmtiDataOffset_", declaredType="void*")
	public VoidPointer jvmtiData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._jvmtiDataOffset_));
	}

	// void* jvmtiData
	public PointerPointer jvmtiDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._jvmtiDataOffset_));
	}

	// J9JavaVM* linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkNextOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer linkNext() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JavaVM._linkNextOffset_));
	}

	// J9JavaVM* linkNext
	public PointerPointer linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._linkNextOffset_));
	}

	// J9JavaVM* linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkPreviousOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer linkPrevious() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JavaVM._linkPreviousOffset_));
	}

	// J9JavaVM* linkPrevious
	public PointerPointer linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._linkPreviousOffset_));
	}

	// void* loadAgentLibraryOnAttach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadAgentLibraryOnAttachOffset_", declaredType="void*")
	public VoidPointer loadAgentLibraryOnAttach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._loadAgentLibraryOnAttachOffset_));
	}

	// void* loadAgentLibraryOnAttach
	public PointerPointer loadAgentLibraryOnAttachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._loadAgentLibraryOnAttachOffset_));
	}

	// void* localMapFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localMapFunctionOffset_", declaredType="void*")
	public VoidPointer localMapFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._localMapFunctionOffset_));
	}

	// void* localMapFunction
	public PointerPointer localMapFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._localMapFunctionOffset_));
	}

	// J9HashTable* lockwordExceptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockwordExceptionsOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer lockwordExceptions() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JavaVM._lockwordExceptionsOffset_));
	}

	// J9HashTable* lockwordExceptions
	public PointerPointer lockwordExceptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._lockwordExceptionsOffset_));
	}

	// UDATA lockwordMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockwordModeOffset_", declaredType="UDATA")
	public UDATA lockwordMode() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._lockwordModeOffset_);
	}

	// UDATA lockwordMode
	public UDATAPointer lockwordModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._lockwordModeOffset_));
	}

	// J9Class* longArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer longArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._longArrayClassOffset_));
	}

	// J9Class* longArrayClass
	public PointerPointer longArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._longArrayClassOffset_));
	}

	// J9Class* longReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer longReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._longReflectClassOffset_));
	}

	// J9Class* longReflectClass
	public PointerPointer longReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._longReflectClassOffset_));
	}

	// J9VMThread* mainThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mainThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer mainThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JavaVM._mainThreadOffset_));
	}

	// J9VMThread* mainThread
	public PointerPointer mainThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._mainThreadOffset_));
	}

	// J9JavaLangManagementData* managementData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_managementDataOffset_", declaredType="J9JavaLangManagementData*")
	public J9JavaLangManagementDataPointer managementData() throws CorruptDataException {
		return J9JavaLangManagementDataPointer.cast(getPointerAtOffset(J9JavaVM._managementDataOffset_));
	}

	// J9JavaLangManagementData* managementData
	public PointerPointer managementDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._managementDataOffset_));
	}

	// U8* mapMemoryBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapMemoryBufferOffset_", declaredType="U8*")
	public U8Pointer mapMemoryBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._mapMemoryBufferOffset_));
	}

	// U8* mapMemoryBuffer
	public PointerPointer mapMemoryBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._mapMemoryBufferOffset_));
	}

	// omrthread_monitor_t mapMemoryBufferMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapMemoryBufferMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer mapMemoryBufferMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._mapMemoryBufferMutexOffset_));
	}

	// omrthread_monitor_t mapMemoryBufferMutex
	public PointerPointer mapMemoryBufferMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._mapMemoryBufferMutexOffset_));
	}

	// UDATA mapMemoryBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapMemoryBufferSizeOffset_", declaredType="UDATA")
	public UDATA mapMemoryBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._mapMemoryBufferSizeOffset_);
	}

	// UDATA mapMemoryBufferSize
	public UDATAPointer mapMemoryBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._mapMemoryBufferSizeOffset_));
	}

	// U8* mapMemoryResultsBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapMemoryResultsBufferOffset_", declaredType="U8*")
	public U8Pointer mapMemoryResultsBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._mapMemoryResultsBufferOffset_));
	}

	// U8* mapMemoryResultsBuffer
	public PointerPointer mapMemoryResultsBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._mapMemoryResultsBufferOffset_));
	}

	// UDATA maxCStackUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxCStackUseOffset_", declaredType="UDATA")
	public UDATA maxCStackUse() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._maxCStackUseOffset_);
	}

	// UDATA maxCStackUse
	public UDATAPointer maxCStackUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._maxCStackUseOffset_));
	}

	// UDATA maxInvariantLocalTableNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxInvariantLocalTableNodeCountOffset_", declaredType="UDATA")
	public UDATA maxInvariantLocalTableNodeCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._maxInvariantLocalTableNodeCountOffset_);
	}

	// UDATA maxInvariantLocalTableNodeCount
	public UDATAPointer maxInvariantLocalTableNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._maxInvariantLocalTableNodeCountOffset_));
	}

	// UDATA maxStackUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackUseOffset_", declaredType="UDATA")
	public UDATA maxStackUse() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._maxStackUseOffset_);
	}

	// UDATA maxStackUse
	public UDATAPointer maxStackUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._maxStackUseOffset_));
	}

	// J9MemoryManagerFunctions* memoryManagerFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryManagerFunctionsOffset_", declaredType="J9MemoryManagerFunctions*")
	public J9MemoryManagerFunctionsPointer memoryManagerFunctions() throws CorruptDataException {
		return J9MemoryManagerFunctionsPointer.cast(getPointerAtOffset(J9JavaVM._memoryManagerFunctionsOffset_));
	}

	// J9MemoryManagerFunctions* memoryManagerFunctions
	public PointerPointer memoryManagerFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._memoryManagerFunctionsOffset_));
	}

	// UDATA memoryMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryMaxOffset_", declaredType="UDATA")
	public UDATA memoryMax() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._memoryMaxOffset_);
	}

	// UDATA memoryMax
	public UDATAPointer memoryMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._memoryMaxOffset_));
	}

	// J9MemorySegmentList* memorySegments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memorySegmentsOffset_", declaredType="J9MemorySegmentList*")
	public J9MemorySegmentListPointer memorySegments() throws CorruptDataException {
		return J9MemorySegmentListPointer.cast(getPointerAtOffset(J9JavaVM._memorySegmentsOffset_));
	}

	// J9MemorySegmentList* memorySegments
	public PointerPointer memorySegmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._memorySegmentsOffset_));
	}

	// UDATA methodHandleCompileCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodHandleCompileCountOffset_", declaredType="UDATA")
	public UDATA methodHandleCompileCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._methodHandleCompileCountOffset_);
	}

	// UDATA methodHandleCompileCount
	public UDATAPointer methodHandleCompileCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._methodHandleCompileCountOffset_));
	}

	// U32 minimumLearningRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimumLearningRatioOffset_", declaredType="U32")
	public UDATA minimumLearningRatio() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._minimumLearningRatioOffset_));
	}

	// U32 minimumLearningRatio
	public UDATAPointer minimumLearningRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._minimumLearningRatioOffset_));
	}

	// U32 minimumReservedRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimumReservedRatioOffset_", declaredType="U32")
	public UDATA minimumReservedRatio() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._minimumReservedRatioOffset_));
	}

	// U32 minimumReservedRatio
	public UDATAPointer minimumReservedRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._minimumReservedRatioOffset_));
	}

	// UDATA minimumSuperclassArraySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimumSuperclassArraySizeOffset_", declaredType="UDATA")
	public UDATA minimumSuperclassArraySize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._minimumSuperclassArraySizeOffset_);
	}

	// UDATA minimumSuperclassArraySize
	public UDATAPointer minimumSuperclassArraySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._minimumSuperclassArraySizeOffset_));
	}

	// J9Pool* modularityPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modularityPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer modularityPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._modularityPoolOffset_));
	}

	// J9Pool* modularityPool
	public PointerPointer modularityPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._modularityPoolOffset_));
	}

	// UDATA modulePointerOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modulePointerOffsetOffset_", declaredType="UDATA")
	public UDATA modulePointerOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._modulePointerOffsetOffset_);
	}

	// UDATA modulePointerOffset
	public UDATAPointer modulePointerOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._modulePointerOffsetOffset_));
	}

	// J9ClassPathEntry* modulesPathEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modulesPathEntryOffset_", declaredType="J9ClassPathEntry*")
	public J9ClassPathEntryPointer modulesPathEntry() throws CorruptDataException {
		return J9ClassPathEntryPointer.cast(getPointerAtOffset(J9JavaVM._modulesPathEntryOffset_));
	}

	// J9ClassPathEntry* modulesPathEntry
	public PointerPointer modulesPathEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._modulesPathEntryOffset_));
	}

	// UDATA monitorTableCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTableCountOffset_", declaredType="UDATA")
	public UDATA monitorTableCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._monitorTableCountOffset_);
	}

	// UDATA monitorTableCount
	public UDATAPointer monitorTableCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._monitorTableCountOffset_));
	}

	// J9MonitorTableListEntry* monitorTableList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTableListOffset_", declaredType="J9MonitorTableListEntry*")
	public J9MonitorTableListEntryPointer monitorTableList() throws CorruptDataException {
		return J9MonitorTableListEntryPointer.cast(getPointerAtOffset(J9JavaVM._monitorTableListOffset_));
	}

	// J9MonitorTableListEntry* monitorTableList
	public PointerPointer monitorTableListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._monitorTableListOffset_));
	}

	// J9Pool* monitorTableListPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTableListPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer monitorTableListPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._monitorTableListPoolOffset_));
	}

	// J9Pool* monitorTableListPool
	public PointerPointer monitorTableListPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._monitorTableListPoolOffset_));
	}

	// omrthread_monitor_t monitorTableMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTableMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer monitorTableMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._monitorTableMutexOffset_));
	}

	// omrthread_monitor_t monitorTableMutex
	public PointerPointer monitorTableMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._monitorTableMutexOffset_));
	}

	// void** monitorTables
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTablesOffset_", declaredType="void**")
	public PointerPointer monitorTables() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JavaVM._monitorTablesOffset_));
	}

	// void** monitorTables
	public PointerPointer monitorTablesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._monitorTablesOffset_));
	}

	// UDATA nativeLibrariesLoadMethodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeLibrariesLoadMethodIDOffset_", declaredType="UDATA")
	public UDATA nativeLibrariesLoadMethodID() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._nativeLibrariesLoadMethodIDOffset_);
	}

	// UDATA nativeLibrariesLoadMethodID
	public UDATAPointer nativeLibrariesLoadMethodIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._nativeLibrariesLoadMethodIDOffset_));
	}

	// omrthread_monitor_t nativeLibraryMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeLibraryMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer nativeLibraryMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._nativeLibraryMonitorOffset_));
	}

	// omrthread_monitor_t nativeLibraryMonitor
	public PointerPointer nativeLibraryMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._nativeLibraryMonitorOffset_));
	}

	// J9HashTable* nativeMethodBindTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeMethodBindTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer nativeMethodBindTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JavaVM._nativeMethodBindTableOffset_));
	}

	// J9HashTable* nativeMethodBindTable
	public PointerPointer nativeMethodBindTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._nativeMethodBindTableOffset_));
	}

	// J9Statistic* nextStatistic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextStatisticOffset_", declaredType="J9Statistic*")
	public J9StatisticPointer nextStatistic() throws CorruptDataException {
		return J9StatisticPointer.cast(getPointerAtOffset(J9JavaVM._nextStatisticOffset_));
	}

	// J9Statistic* nextStatistic
	public PointerPointer nextStatisticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._nextStatisticOffset_));
	}

	// UDATA objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectAlignmentInBytesOffset_", declaredType="UDATA")
	public UDATA objectAlignmentInBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._objectAlignmentInBytesOffset_);
	}

	// UDATA objectAlignmentInBytes
	public UDATAPointer objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._objectAlignmentInBytesOffset_));
	}

	// UDATA objectAlignmentShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectAlignmentShiftOffset_", declaredType="UDATA")
	public UDATA objectAlignmentShift() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._objectAlignmentShiftOffset_);
	}

	// UDATA objectAlignmentShift
	public UDATAPointer objectAlignmentShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._objectAlignmentShiftOffset_));
	}

	// J9MemorySegmentList* objectMemorySegments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMemorySegmentsOffset_", declaredType="J9MemorySegmentList*")
	public J9MemorySegmentListPointer objectMemorySegments() throws CorruptDataException {
		return J9MemorySegmentListPointer.cast(getPointerAtOffset(J9JavaVM._objectMemorySegmentsOffset_));
	}

	// J9MemorySegmentList* objectMemorySegments
	public PointerPointer objectMemorySegmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._objectMemorySegmentsOffset_));
	}

	// OMR_Runtime* omrRuntime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrRuntimeOffset_", declaredType="OMR_Runtime*")
	public OMR_RuntimePointer omrRuntime() throws CorruptDataException {
		return OMR_RuntimePointer.cast(getPointerAtOffset(J9JavaVM._omrRuntimeOffset_));
	}

	// OMR_Runtime* omrRuntime
	public PointerPointer omrRuntimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._omrRuntimeOffset_));
	}

	// OMR_VM* omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(J9JavaVM._omrVMOffset_));
	}

	// OMR_VM* omrVM
	public PointerPointer omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._omrVMOffset_));
	}

	// void* originalSIGPIPESignalAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalSIGPIPESignalActionOffset_", declaredType="void*")
	public VoidPointer originalSIGPIPESignalAction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._originalSIGPIPESignalActionOffset_));
	}

	// void* originalSIGPIPESignalAction
	public PointerPointer originalSIGPIPESignalActionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._originalSIGPIPESignalActionOffset_));
	}

	// void* osrGlobalBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrGlobalBufferOffset_", declaredType="void*")
	public VoidPointer osrGlobalBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._osrGlobalBufferOffset_));
	}

	// void* osrGlobalBuffer
	public PointerPointer osrGlobalBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._osrGlobalBufferOffset_));
	}

	// omrthread_monitor_t osrGlobalBufferLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrGlobalBufferLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer osrGlobalBufferLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._osrGlobalBufferLockOffset_));
	}

	// omrthread_monitor_t osrGlobalBufferLock
	public PointerPointer osrGlobalBufferLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._osrGlobalBufferLockOffset_));
	}

	// UDATA osrGlobalBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrGlobalBufferSizeOffset_", declaredType="UDATA")
	public UDATA osrGlobalBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._osrGlobalBufferSizeOffset_);
	}

	// UDATA osrGlobalBufferSize
	public UDATAPointer osrGlobalBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._osrGlobalBufferSizeOffset_));
	}

	// UDATA pathSeparator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathSeparatorOffset_", declaredType="UDATA")
	public UDATA pathSeparator() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._pathSeparatorOffset_);
	}

	// UDATA pathSeparator
	public UDATAPointer pathSeparatorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._pathSeparatorOffset_));
	}

	// UDATA phase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_phaseOffset_", declaredType="UDATA")
	public UDATA phase() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._phaseOffset_);
	}

	// UDATA phase
	public UDATAPointer phaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._phaseOffset_));
	}

	// J9PortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9JavaVM._portLibraryOffset_));
	}

	// J9PortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._portLibraryOffset_));
	}

	// UDATA priorityAsyncEventDispatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityAsyncEventDispatchOffset_", declaredType="UDATA")
	public UDATA priorityAsyncEventDispatch() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityAsyncEventDispatchOffset_);
	}

	// UDATA priorityAsyncEventDispatch
	public UDATAPointer priorityAsyncEventDispatchEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityAsyncEventDispatchOffset_));
	}

	// UDATA priorityAsyncEventDispatchNH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityAsyncEventDispatchNHOffset_", declaredType="UDATA")
	public UDATA priorityAsyncEventDispatchNH() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityAsyncEventDispatchNHOffset_);
	}

	// UDATA priorityAsyncEventDispatchNH
	public UDATAPointer priorityAsyncEventDispatchNHEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityAsyncEventDispatchNHOffset_));
	}

	// UDATA priorityJitCompile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityJitCompileOffset_", declaredType="UDATA")
	public UDATA priorityJitCompile() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityJitCompileOffset_);
	}

	// UDATA priorityJitCompile
	public UDATAPointer priorityJitCompileEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityJitCompileOffset_));
	}

	// UDATA priorityJitSample
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityJitSampleOffset_", declaredType="UDATA")
	public UDATA priorityJitSample() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityJitSampleOffset_);
	}

	// UDATA priorityJitSample
	public UDATAPointer priorityJitSampleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityJitSampleOffset_));
	}

	// UDATA priorityMetronomeAlarm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityMetronomeAlarmOffset_", declaredType="UDATA")
	public UDATA priorityMetronomeAlarm() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityMetronomeAlarmOffset_);
	}

	// UDATA priorityMetronomeAlarm
	public UDATAPointer priorityMetronomeAlarmEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityMetronomeAlarmOffset_));
	}

	// UDATA priorityMetronomeTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityMetronomeTraceOffset_", declaredType="UDATA")
	public UDATA priorityMetronomeTrace() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityMetronomeTraceOffset_);
	}

	// UDATA priorityMetronomeTrace
	public UDATAPointer priorityMetronomeTraceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityMetronomeTraceOffset_));
	}

	// UDATA priorityPosixSignalDispatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityPosixSignalDispatchOffset_", declaredType="UDATA")
	public UDATA priorityPosixSignalDispatch() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityPosixSignalDispatchOffset_);
	}

	// UDATA priorityPosixSignalDispatch
	public UDATAPointer priorityPosixSignalDispatchEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityPosixSignalDispatchOffset_));
	}

	// UDATA priorityPosixSignalDispatchNH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityPosixSignalDispatchNHOffset_", declaredType="UDATA")
	public UDATA priorityPosixSignalDispatchNH() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityPosixSignalDispatchNHOffset_);
	}

	// UDATA priorityPosixSignalDispatchNH
	public UDATAPointer priorityPosixSignalDispatchNHEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityPosixSignalDispatchNHOffset_));
	}

	// IDATA priorityRealtimePriorityShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityRealtimePriorityShiftOffset_", declaredType="IDATA")
	public IDATA priorityRealtimePriorityShift() throws CorruptDataException {
		return getIDATAAtOffset(J9JavaVM._priorityRealtimePriorityShiftOffset_);
	}

	// IDATA priorityRealtimePriorityShift
	public IDATAPointer priorityRealtimePriorityShiftEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityRealtimePriorityShiftOffset_));
	}

	// UDATA priorityTimerDispatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityTimerDispatchOffset_", declaredType="UDATA")
	public UDATA priorityTimerDispatch() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityTimerDispatchOffset_);
	}

	// UDATA priorityTimerDispatch
	public UDATAPointer priorityTimerDispatchEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityTimerDispatchOffset_));
	}

	// UDATA priorityTimerDispatchNH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityTimerDispatchNHOffset_", declaredType="UDATA")
	public UDATA priorityTimerDispatchNH() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._priorityTimerDispatchNHOffset_);
	}

	// UDATA priorityTimerDispatchNH
	public UDATAPointer priorityTimerDispatchNHEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._priorityTimerDispatchNHOffset_));
	}

	// UDATA processReferenceActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processReferenceActiveOffset_", declaredType="UDATA")
	public UDATA processReferenceActive() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._processReferenceActiveOffset_);
	}

	// UDATA processReferenceActive
	public UDATAPointer processReferenceActiveEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._processReferenceActiveOffset_));
	}

	// omrthread_monitor_t processReferenceMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processReferenceMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer processReferenceMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._processReferenceMonitorOffset_));
	}

	// omrthread_monitor_t processReferenceMonitor
	public PointerPointer processReferenceMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._processReferenceMonitorOffset_));
	}

	// UDATA ramClassAllocationIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassAllocationIncrementOffset_", declaredType="UDATA")
	public UDATA ramClassAllocationIncrement() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._ramClassAllocationIncrementOffset_);
	}

	// UDATA ramClassAllocationIncrement
	public UDATAPointer ramClassAllocationIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._ramClassAllocationIncrementOffset_));
	}

	// UDATA realtimeHeapMapBasePageRounded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_realtimeHeapMapBasePageRoundedOffset_", declaredType="UDATA")
	public UDATA realtimeHeapMapBasePageRounded() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._realtimeHeapMapBasePageRoundedOffset_);
	}

	// UDATA realtimeHeapMapBasePageRounded
	public UDATAPointer realtimeHeapMapBasePageRoundedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._realtimeHeapMapBasePageRoundedOffset_));
	}

	// UDATA* realtimeHeapMapBits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_realtimeHeapMapBitsOffset_", declaredType="UDATA*")
	public UDATAPointer realtimeHeapMapBits() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JavaVM._realtimeHeapMapBitsOffset_));
	}

	// UDATA* realtimeHeapMapBits
	public PointerPointer realtimeHeapMapBitsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._realtimeHeapMapBitsOffset_));
	}

	// J9VMGCSizeClasses* realtimeSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_realtimeSizeClassesOffset_", declaredType="J9VMGCSizeClasses*")
	public J9VMGCSizeClassesPointer realtimeSizeClasses() throws CorruptDataException {
		return J9VMGCSizeClassesPointer.cast(getPointerAtOffset(J9JavaVM._realtimeSizeClassesOffset_));
	}

	// J9VMGCSizeClasses* realtimeSizeClasses
	public PointerPointer realtimeSizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._realtimeSizeClassesOffset_));
	}

	// J9ReflectFunctionTable reflectFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reflectFunctionsOffset_", declaredType="J9ReflectFunctionTable")
	public J9ReflectFunctionTablePointer reflectFunctions() throws CorruptDataException {
		return J9ReflectFunctionTablePointer.cast(nonNullFieldEA(J9JavaVM._reflectFunctionsOffset_));
	}

	// J9ReflectFunctionTable reflectFunctions
	public PointerPointer reflectFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._reflectFunctionsOffset_));
	}

	// UDATA requiredDebugAttributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requiredDebugAttributesOffset_", declaredType="UDATA")
	public UDATA requiredDebugAttributes() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._requiredDebugAttributesOffset_);
	}

	// UDATA requiredDebugAttributes
	public UDATAPointer requiredDebugAttributesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._requiredDebugAttributesOffset_));
	}

	// void* reserved1_identifier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1_identifierOffset_", declaredType="void*")
	public VoidPointer reserved1_identifier() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._reserved1_identifierOffset_));
	}

	// void* reserved1_identifier
	public PointerPointer reserved1_identifierEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._reserved1_identifierOffset_));
	}

	// J9NativeLibrary* reserved2_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2_libraryOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer reserved2_library() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9JavaVM._reserved2_libraryOffset_));
	}

	// J9NativeLibrary* reserved2_library
	public PointerPointer reserved2_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._reserved2_libraryOffset_));
	}

	// U32 reservedAbsoluteThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedAbsoluteThresholdOffset_", declaredType="U32")
	public UDATA reservedAbsoluteThreshold() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._reservedAbsoluteThresholdOffset_));
	}

	// U32 reservedAbsoluteThreshold
	public UDATAPointer reservedAbsoluteThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._reservedAbsoluteThresholdOffset_));
	}

	// U32 reservedTransitionThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedTransitionThresholdOffset_", declaredType="U32")
	public UDATA reservedTransitionThreshold() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._reservedTransitionThresholdOffset_));
	}

	// U32 reservedTransitionThreshold
	public UDATAPointer reservedTransitionThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._reservedTransitionThresholdOffset_));
	}

	// UDATA romClassAllocationIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassAllocationIncrementOffset_", declaredType="UDATA")
	public UDATA romClassAllocationIncrement() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._romClassAllocationIncrementOffset_);
	}

	// UDATA romClassAllocationIncrement
	public UDATAPointer romClassAllocationIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._romClassAllocationIncrementOffset_));
	}

	// UDATA romMethodSortThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodSortThresholdOffset_", declaredType="UDATA")
	public UDATA romMethodSortThreshold() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._romMethodSortThresholdOffset_);
	}

	// UDATA romMethodSortThreshold
	public UDATAPointer romMethodSortThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._romMethodSortThresholdOffset_));
	}

	// UDATA rsOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rsOverflowOffset_", declaredType="UDATA")
	public UDATA rsOverflow() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._rsOverflowOffset_);
	}

	// UDATA rsOverflow
	public UDATAPointer rsOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._rsOverflowOffset_));
	}

	// U32 runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsOffset_", declaredType="U32")
	public UDATA runtimeFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaVM._runtimeFlagsOffset_));
	}

	// U32 runtimeFlags
	public UDATAPointer runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._runtimeFlagsOffset_));
	}

	// omrthread_monitor_t runtimeFlagsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer runtimeFlagsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._runtimeFlagsMutexOffset_));
	}

	// omrthread_monitor_t runtimeFlagsMutex
	public PointerPointer runtimeFlagsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._runtimeFlagsMutexOffset_));
	}

	// UDATA safePointResponseCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_safePointResponseCountOffset_", declaredType="UDATA")
	public UDATA safePointResponseCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._safePointResponseCountOffset_);
	}

	// UDATA safePointResponseCount
	public UDATAPointer safePointResponseCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._safePointResponseCountOffset_));
	}

	// UDATA safePointState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_safePointStateOffset_", declaredType="UDATA")
	public UDATA safePointState() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._safePointStateOffset_);
	}

	// UDATA safePointState
	public UDATAPointer safePointStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._safePointStateOffset_));
	}

	// j9object_t scvTenureRatioHigh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureRatioHighOffset_", declaredType="j9object_t")
	public J9ObjectPointer scvTenureRatioHigh() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JavaVM._scvTenureRatioHighOffset_));
	}

	// j9object_t scvTenureRatioHigh
	public PointerPointer scvTenureRatioHighEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._scvTenureRatioHighOffset_));
	}

	// j9object_t scvTenureRatioLow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scvTenureRatioLowOffset_", declaredType="j9object_t")
	public J9ObjectPointer scvTenureRatioLow() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JavaVM._scvTenureRatioLowOffset_));
	}

	// j9object_t scvTenureRatioLow
	public PointerPointer scvTenureRatioLowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._scvTenureRatioLowOffset_));
	}

	// omrthread_monitor_t segmentMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer segmentMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._segmentMutexOffset_));
	}

	// omrthread_monitor_t segmentMutex
	public PointerPointer segmentMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._segmentMutexOffset_));
	}

	// UDATA segregatedAllocationCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segregatedAllocationCacheSizeOffset_", declaredType="UDATA")
	public UDATA segregatedAllocationCacheSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._segregatedAllocationCacheSizeOffset_);
	}

	// UDATA segregatedAllocationCacheSize
	public UDATAPointer segregatedAllocationCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._segregatedAllocationCacheSizeOffset_));
	}

	// j9object_t selectorHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_selectorHashTableOffset_", declaredType="j9object_t")
	public J9ObjectPointer selectorHashTable() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JavaVM._selectorHashTableOffset_));
	}

	// j9object_t selectorHashTable
	public PointerPointer selectorHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._selectorHashTableOffset_));
	}

	// void* setVerboseState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setVerboseStateOffset_", declaredType="void*")
	public VoidPointer setVerboseState() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._setVerboseStateOffset_));
	}

	// void* setVerboseState
	public PointerPointer setVerboseStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._setVerboseStateOffset_));
	}

	// J9SharedCacheAPI* sharedCacheAPI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedCacheAPIOffset_", declaredType="J9SharedCacheAPI*")
	public J9SharedCacheAPIPointer sharedCacheAPI() throws CorruptDataException {
		return J9SharedCacheAPIPointer.cast(getPointerAtOffset(J9JavaVM._sharedCacheAPIOffset_));
	}

	// J9SharedCacheAPI* sharedCacheAPI
	public PointerPointer sharedCacheAPIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sharedCacheAPIOffset_));
	}

	// J9SharedClassConfig* sharedClassConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassConfigOffset_", declaredType="J9SharedClassConfig*")
	public J9SharedClassConfigPointer sharedClassConfig() throws CorruptDataException {
		return J9SharedClassConfigPointer.cast(getPointerAtOffset(J9JavaVM._sharedClassConfigOffset_));
	}

	// J9SharedClassConfig* sharedClassConfig
	public PointerPointer sharedClassConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sharedClassConfigOffset_));
	}

	// J9SharedClassPreinitConfig* sharedClassPreinitConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassPreinitConfigOffset_", declaredType="J9SharedClassPreinitConfig*")
	public J9SharedClassPreinitConfigPointer sharedClassPreinitConfig() throws CorruptDataException {
		return J9SharedClassPreinitConfigPointer.cast(getPointerAtOffset(J9JavaVM._sharedClassPreinitConfigOffset_));
	}

	// J9SharedClassPreinitConfig* sharedClassPreinitConfig
	public PointerPointer sharedClassPreinitConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sharedClassPreinitConfigOffset_));
	}

	// J9SharedInvariantInternTable* sharedInvariantInternTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedInvariantInternTableOffset_", declaredType="J9SharedInvariantInternTable*")
	public J9SharedInvariantInternTablePointer sharedInvariantInternTable() throws CorruptDataException {
		return J9SharedInvariantInternTablePointer.cast(getPointerAtOffset(J9JavaVM._sharedInvariantInternTableOffset_));
	}

	// J9SharedInvariantInternTable* sharedInvariantInternTable
	public PointerPointer sharedInvariantInternTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sharedInvariantInternTableOffset_));
	}

	// J9Class* shortArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortArrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer shortArrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._shortArrayClassOffset_));
	}

	// J9Class* shortArrayClass
	public PointerPointer shortArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._shortArrayClassOffset_));
	}

	// J9Class* shortReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer shortReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._shortReflectClassOffset_));
	}

	// J9Class* shortReflectClass
	public PointerPointer shortReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._shortReflectClassOffset_));
	}

	// void* sidecarClearInterruptFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarClearInterruptFunctionOffset_", declaredType="void*")
	public VoidPointer sidecarClearInterruptFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._sidecarClearInterruptFunctionOffset_));
	}

	// void* sidecarClearInterruptFunction
	public PointerPointer sidecarClearInterruptFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sidecarClearInterruptFunctionOffset_));
	}

	// J9SidecarExitFunction* sidecarExitFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarExitFunctionsOffset_", declaredType="J9SidecarExitFunction*")
	public J9SidecarExitFunctionPointer sidecarExitFunctions() throws CorruptDataException {
		return J9SidecarExitFunctionPointer.cast(getPointerAtOffset(J9JavaVM._sidecarExitFunctionsOffset_));
	}

	// J9SidecarExitFunction* sidecarExitFunctions
	public PointerPointer sidecarExitFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sidecarExitFunctionsOffset_));
	}

	// J9SidecarExitHook sidecarExitHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarExitHookOffset_", declaredType="J9SidecarExitHook")
	public VoidPointer sidecarExitHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._sidecarExitHookOffset_));
	}

	// J9SidecarExitHook sidecarExitHook
	public PointerPointer sidecarExitHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sidecarExitHookOffset_));
	}

	// void* sidecarInterruptFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarInterruptFunctionOffset_", declaredType="void*")
	public VoidPointer sidecarInterruptFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._sidecarInterruptFunctionOffset_));
	}

	// void* sidecarInterruptFunction
	public PointerPointer sidecarInterruptFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sidecarInterruptFunctionOffset_));
	}

	// UDATA sigFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigFlagsOffset_", declaredType="UDATA")
	public UDATA sigFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._sigFlagsOffset_);
	}

	// UDATA sigFlags
	public UDATAPointer sigFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._sigFlagsOffset_));
	}

	// U8* sigquitToFileDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigquitToFileDirOffset_", declaredType="U8*")
	public U8Pointer sigquitToFileDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JavaVM._sigquitToFileDirOffset_));
	}

	// U8* sigquitToFileDir
	public PointerPointer sigquitToFileDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sigquitToFileDirOffset_));
	}

	// jclass srConstructorAccessor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_srConstructorAccessorOffset_", declaredType="jclass")
	public _jclassPointer srConstructorAccessor() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._srConstructorAccessorOffset_));
	}

	// jclass srConstructorAccessor
	public PointerPointer srConstructorAccessorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._srConstructorAccessorOffset_));
	}

	// jclass srMethodAccessor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_srMethodAccessorOffset_", declaredType="jclass")
	public _jclassPointer srMethodAccessor() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._srMethodAccessorOffset_));
	}

	// jclass srMethodAccessor
	public PointerPointer srMethodAccessorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._srMethodAccessorOffset_));
	}

	// UDATA stackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackSizeOffset_", declaredType="UDATA")
	public UDATA stackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._stackSizeOffset_);
	}

	// UDATA stackSize
	public UDATAPointer stackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._stackSizeOffset_));
	}

	// UDATA stackSizeIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackSizeIncrementOffset_", declaredType="UDATA")
	public UDATA stackSizeIncrement() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._stackSizeIncrementOffset_);
	}

	// UDATA stackSizeIncrement
	public UDATAPointer stackSizeIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._stackSizeIncrementOffset_));
	}

	// UDATA stackWalkCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackWalkCountOffset_", declaredType="UDATA")
	public UDATA stackWalkCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._stackWalkCountOffset_);
	}

	// UDATA stackWalkCount
	public UDATAPointer stackWalkCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._stackWalkCountOffset_));
	}

	// UDATA stackWalkVerboseLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackWalkVerboseLevelOffset_", declaredType="UDATA")
	public UDATA stackWalkVerboseLevel() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._stackWalkVerboseLevelOffset_);
	}

	// UDATA stackWalkVerboseLevel
	public UDATAPointer stackWalkVerboseLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._stackWalkVerboseLevelOffset_));
	}

	// omrthread_monitor_t statisticsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_statisticsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer statisticsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._statisticsMutexOffset_));
	}

	// omrthread_monitor_t statisticsMutex
	public PointerPointer statisticsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._statisticsMutexOffset_));
	}

	// UDATA strCompEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_strCompEnabledOffset_", declaredType="UDATA")
	public UDATA strCompEnabled() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._strCompEnabledOffset_);
	}

	// UDATA strCompEnabled
	public UDATAPointer strCompEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._strCompEnabledOffset_));
	}

	// jclass sun_nio_ch_DirectBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sun_nio_ch_DirectBufferOffset_", declaredType="jclass")
	public _jclassPointer sun_nio_ch_DirectBuffer() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9JavaVM._sun_nio_ch_DirectBufferOffset_));
	}

	// jclass sun_nio_ch_DirectBuffer
	public PointerPointer sun_nio_ch_DirectBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._sun_nio_ch_DirectBufferOffset_));
	}

	// J9ClassLoader* systemClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemClassLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer systemClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9JavaVM._systemClassLoaderOffset_));
	}

	// J9ClassLoader* systemClassLoader
	public PointerPointer systemClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._systemClassLoaderOffset_));
	}

	// J9Pool* systemProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemPropertiesOffset_", declaredType="J9Pool*")
	public J9PoolPointer systemProperties() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JavaVM._systemPropertiesOffset_));
	}

	// J9Pool* systemProperties
	public PointerPointer systemPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._systemPropertiesOffset_));
	}

	// omrthread_monitor_t systemPropertiesMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemPropertiesMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer systemPropertiesMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._systemPropertiesMutexOffset_));
	}

	// omrthread_monitor_t systemPropertiesMutex
	public PointerPointer systemPropertiesMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._systemPropertiesMutexOffset_));
	}

	// j9object_t* systemThreadGroupRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemThreadGroupRefOffset_", declaredType="j9object_t*")
	public PointerPointer systemThreadGroupRef() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JavaVM._systemThreadGroupRefOffset_));
	}

	// j9object_t* systemThreadGroupRef
	public PointerPointer systemThreadGroupRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._systemThreadGroupRefOffset_));
	}

	// j9object_t tenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureAgeOffset_", declaredType="j9object_t")
	public J9ObjectPointer tenureAge() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JavaVM._tenureAgeOffset_));
	}

	// j9object_t tenureAge
	public PointerPointer tenureAgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._tenureAgeOffset_));
	}

	// UDATA thrDeflationPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrDeflationPolicyOffset_", declaredType="UDATA")
	public UDATA thrDeflationPolicy() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrDeflationPolicyOffset_);
	}

	// UDATA thrDeflationPolicy
	public UDATAPointer thrDeflationPolicyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrDeflationPolicyOffset_));
	}

	// UDATA thrMaxSpins1BeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxSpins1BeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxSpins1BeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxSpins1BeforeBlockingOffset_);
	}

	// UDATA thrMaxSpins1BeforeBlocking
	public UDATAPointer thrMaxSpins1BeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxSpins1BeforeBlockingOffset_));
	}

	// UDATA thrMaxSpins2BeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxSpins2BeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxSpins2BeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxSpins2BeforeBlockingOffset_);
	}

	// UDATA thrMaxSpins2BeforeBlocking
	public UDATAPointer thrMaxSpins2BeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxSpins2BeforeBlockingOffset_));
	}

	// UDATA thrMaxTryEnterSpins1BeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxTryEnterSpins1BeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxTryEnterSpins1BeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxTryEnterSpins1BeforeBlockingOffset_);
	}

	// UDATA thrMaxTryEnterSpins1BeforeBlocking
	public UDATAPointer thrMaxTryEnterSpins1BeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxTryEnterSpins1BeforeBlockingOffset_));
	}

	// UDATA thrMaxTryEnterSpins2BeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxTryEnterSpins2BeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxTryEnterSpins2BeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxTryEnterSpins2BeforeBlockingOffset_);
	}

	// UDATA thrMaxTryEnterSpins2BeforeBlocking
	public UDATAPointer thrMaxTryEnterSpins2BeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxTryEnterSpins2BeforeBlockingOffset_));
	}

	// UDATA thrMaxTryEnterYieldsBeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxTryEnterYieldsBeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxTryEnterYieldsBeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxTryEnterYieldsBeforeBlockingOffset_);
	}

	// UDATA thrMaxTryEnterYieldsBeforeBlocking
	public UDATAPointer thrMaxTryEnterYieldsBeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxTryEnterYieldsBeforeBlockingOffset_));
	}

	// UDATA thrMaxYieldsBeforeBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrMaxYieldsBeforeBlockingOffset_", declaredType="UDATA")
	public UDATA thrMaxYieldsBeforeBlocking() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrMaxYieldsBeforeBlockingOffset_);
	}

	// UDATA thrMaxYieldsBeforeBlocking
	public UDATAPointer thrMaxYieldsBeforeBlockingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrMaxYieldsBeforeBlockingOffset_));
	}

	// UDATA thrNestedSpinning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrNestedSpinningOffset_", declaredType="UDATA")
	public UDATA thrNestedSpinning() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrNestedSpinningOffset_);
	}

	// UDATA thrNestedSpinning
	public UDATAPointer thrNestedSpinningEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrNestedSpinningOffset_));
	}

	// UDATA thrStagger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrStaggerOffset_", declaredType="UDATA")
	public UDATA thrStagger() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrStaggerOffset_);
	}

	// UDATA thrStagger
	public UDATAPointer thrStaggerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrStaggerOffset_));
	}

	// UDATA thrStaggerMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrStaggerMaxOffset_", declaredType="UDATA")
	public UDATA thrStaggerMax() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrStaggerMaxOffset_);
	}

	// UDATA thrStaggerMax
	public UDATAPointer thrStaggerMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrStaggerMaxOffset_));
	}

	// UDATA thrStaggerStep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrStaggerStepOffset_", declaredType="UDATA")
	public UDATA thrStaggerStep() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrStaggerStepOffset_);
	}

	// UDATA thrStaggerStep
	public UDATAPointer thrStaggerStepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrStaggerStepOffset_));
	}

	// UDATA thrTryEnterNestedSpinning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrTryEnterNestedSpinningOffset_", declaredType="UDATA")
	public UDATA thrTryEnterNestedSpinning() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._thrTryEnterNestedSpinningOffset_);
	}

	// UDATA thrTryEnterNestedSpinning
	public UDATAPointer thrTryEnterNestedSpinningEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._thrTryEnterNestedSpinningOffset_));
	}

	// IDATA threadNameHandlerKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadNameHandlerKeyOffset_", declaredType="IDATA")
	public IDATA threadNameHandlerKey() throws CorruptDataException {
		return getIDATAAtOffset(J9JavaVM._threadNameHandlerKeyOffset_);
	}

	// IDATA threadNameHandlerKey
	public IDATAPointer threadNameHandlerKeyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JavaVM._threadNameHandlerKeyOffset_));
	}

	// UDATA totalThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalThreadCountOffset_", declaredType="UDATA")
	public UDATA totalThreadCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._totalThreadCountOffset_);
	}

	// UDATA totalThreadCount
	public UDATAPointer totalThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._totalThreadCountOffset_));
	}

	// J9Module* unamedModuleForSystemLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unamedModuleForSystemLoaderOffset_", declaredType="J9Module*")
	public J9ModulePointer unamedModuleForSystemLoader() throws CorruptDataException {
		return J9ModulePointer.cast(getPointerAtOffset(J9JavaVM._unamedModuleForSystemLoaderOffset_));
	}

	// J9Module* unamedModuleForSystemLoader
	public PointerPointer unamedModuleForSystemLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._unamedModuleForSystemLoaderOffset_));
	}

	// void* unhookVMEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unhookVMEventOffset_", declaredType="void*")
	public VoidPointer unhookVMEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._unhookVMEventOffset_));
	}

	// void* unhookVMEvent
	public PointerPointer unhookVMEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._unhookVMEventOffset_));
	}

	// J9UnsafeMemoryBlock* unsafeMemoryListHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unsafeMemoryListHeadOffset_", declaredType="J9UnsafeMemoryBlock*")
	public J9UnsafeMemoryBlockPointer unsafeMemoryListHead() throws CorruptDataException {
		return J9UnsafeMemoryBlockPointer.cast(getPointerAtOffset(J9JavaVM._unsafeMemoryListHeadOffset_));
	}

	// J9UnsafeMemoryBlock* unsafeMemoryListHead
	public PointerPointer unsafeMemoryListHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._unsafeMemoryListHeadOffset_));
	}

	// omrthread_monitor_t unsafeMemoryTrackingMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unsafeMemoryTrackingMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer unsafeMemoryTrackingMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._unsafeMemoryTrackingMutexOffset_));
	}

	// omrthread_monitor_t unsafeMemoryTrackingMutex
	public PointerPointer unsafeMemoryTrackingMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._unsafeMemoryTrackingMutexOffset_));
	}

	// UDATA* vTableScratch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vTableScratchOffset_", declaredType="UDATA*")
	public UDATAPointer vTableScratch() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JavaVM._vTableScratchOffset_));
	}

	// UDATA* vTableScratch
	public PointerPointer vTableScratchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vTableScratchOffset_));
	}

	// UDATA vTableScratchSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vTableScratchSizeOffset_", declaredType="UDATA")
	public UDATA vTableScratchSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._vTableScratchSizeOffset_);
	}

	// UDATA vTableScratchSize
	public UDATAPointer vTableScratchSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._vTableScratchSizeOffset_));
	}

	// UDATA verboseLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseLevelOffset_", declaredType="UDATA")
	public UDATA verboseLevel() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._verboseLevelOffset_);
	}

	// UDATA verboseLevel
	public UDATAPointer verboseLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._verboseLevelOffset_));
	}

	// void* verboseStackDump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseStackDumpOffset_", declaredType="void*")
	public VoidPointer verboseStackDump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._verboseStackDumpOffset_));
	}

	// void* verboseStackDump
	public PointerPointer verboseStackDumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._verboseStackDumpOffset_));
	}

	// omrthread_monitor_t verboseStateMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseStateMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer verboseStateMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._verboseStateMutexOffset_));
	}

	// omrthread_monitor_t verboseStateMutex
	public PointerPointer verboseStateMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._verboseStateMutexOffset_));
	}

	// J9VerboseStruct* verboseStruct
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseStructOffset_", declaredType="J9VerboseStruct*")
	public J9VerboseStructPointer verboseStruct() throws CorruptDataException {
		return J9VerboseStructPointer.cast(getPointerAtOffset(J9JavaVM._verboseStructOffset_));
	}

	// J9VerboseStruct* verboseStruct
	public PointerPointer verboseStructEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._verboseStructOffset_));
	}

	// J9VMInitArgs* vmArgsArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmArgsArrayOffset_", declaredType="J9VMInitArgs*")
	public J9VMInitArgsPointer vmArgsArray() throws CorruptDataException {
		return J9VMInitArgsPointer.cast(getPointerAtOffset(J9JavaVM._vmArgsArrayOffset_));
	}

	// J9VMInitArgs* vmArgsArray
	public PointerPointer vmArgsArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmArgsArrayOffset_));
	}

	// J9VMInterface vmInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmInterfaceOffset_", declaredType="J9VMInterface")
	public J9VMInterfacePointer vmInterface() throws CorruptDataException {
		return J9VMInterfacePointer.cast(nonNullFieldEA(J9JavaVM._vmInterfaceOffset_));
	}

	// J9VMInterface vmInterface
	public PointerPointer vmInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmInterfaceOffset_));
	}

	// void*[] vmLocalStorage
	public PointerPointer vmLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmLocalStorageOffset_));
	}

	// void* vmLocalStorageFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmLocalStorageFunctionsOffset_", declaredType="void*")
	public VoidPointer vmLocalStorageFunctions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._vmLocalStorageFunctionsOffset_));
	}

	// void* vmLocalStorageFunctions
	public PointerPointer vmLocalStorageFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmLocalStorageFunctionsOffset_));
	}

	// J9VMRuntimeStateListener vmRuntimeStateListener
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmRuntimeStateListenerOffset_", declaredType="J9VMRuntimeStateListener")
	public J9VMRuntimeStateListenerPointer vmRuntimeStateListener() throws CorruptDataException {
		return J9VMRuntimeStateListenerPointer.cast(nonNullFieldEA(J9JavaVM._vmRuntimeStateListenerOffset_));
	}

	// J9VMRuntimeStateListener vmRuntimeStateListener
	public PointerPointer vmRuntimeStateListenerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmRuntimeStateListenerOffset_));
	}

	// omrthread_monitor_t vmThreadListMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadListMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer vmThreadListMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaVM._vmThreadListMutexOffset_));
	}

	// omrthread_monitor_t vmThreadListMutex
	public PointerPointer vmThreadListMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._vmThreadListMutexOffset_));
	}

	// UDATA vmThreadSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadSizeOffset_", declaredType="UDATA")
	public UDATA vmThreadSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._vmThreadSizeOffset_);
	}

	// UDATA vmThreadSize
	public UDATAPointer vmThreadSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._vmThreadSizeOffset_));
	}

	// J9Class* voidReflectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_voidReflectClassOffset_", declaredType="J9Class*")
	public J9ClassPointer voidReflectClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JavaVM._voidReflectClassOffset_));
	}

	// J9Class* voidReflectClass
	public PointerPointer voidReflectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._voidReflectClassOffset_));
	}

	// void* walkFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkFrameOffset_", declaredType="void*")
	public VoidPointer walkFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._walkFrameOffset_));
	}

	// void* walkFrame
	public PointerPointer walkFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._walkFrameOffset_));
	}

	// void* walkFrameVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkFrameVerboseOffset_", declaredType="void*")
	public VoidPointer walkFrameVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._walkFrameVerboseOffset_));
	}

	// void* walkFrameVerbose
	public PointerPointer walkFrameVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._walkFrameVerboseOffset_));
	}

	// void* walkStackFrames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkStackFramesOffset_", declaredType="void*")
	public VoidPointer walkStackFrames() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._walkStackFramesOffset_));
	}

	// void* walkStackFrames
	public PointerPointer walkStackFramesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._walkStackFramesOffset_));
	}

	// UDATA whackedPointerCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_whackedPointerCounterOffset_", declaredType="UDATA")
	public UDATA whackedPointerCounter() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._whackedPointerCounterOffset_);
	}

	// UDATA whackedPointerCounter
	public UDATAPointer whackedPointerCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._whackedPointerCounterOffset_));
	}

	// UDATA zeroOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zeroOptionsOffset_", declaredType="UDATA")
	public UDATA zeroOptions() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._zeroOptionsOffset_);
	}

	// UDATA zeroOptions
	public UDATAPointer zeroOptionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._zeroOptionsOffset_));
	}

	// void* zipCachePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCachePoolOffset_", declaredType="void*")
	public VoidPointer zipCachePool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaVM._zipCachePoolOffset_));
	}

	// void* zipCachePool
	public PointerPointer zipCachePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaVM._zipCachePoolOffset_));
	}

	// UDATA zombieThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zombieThreadCountOffset_", declaredType="UDATA")
	public UDATA zombieThreadCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaVM._zombieThreadCountOffset_);
	}

	// UDATA zombieThreadCount
	public UDATAPointer zombieThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaVM._zombieThreadCountOffset_));
	}

}
