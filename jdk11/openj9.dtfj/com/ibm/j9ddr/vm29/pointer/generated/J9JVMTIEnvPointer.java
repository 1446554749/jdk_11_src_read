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
 * Structure: J9JVMTIEnvPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIEnvPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIEnv.class)
public class J9JVMTIEnvPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIEnvPointer NULL = new J9JVMTIEnvPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIEnvPointer(long address) {
		super(address);
	}

	public static J9JVMTIEnvPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIEnvPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIEnvPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIEnvPointer(address);
	}

	public J9JVMTIEnvPointer add(long count) {
		return J9JVMTIEnvPointer.cast(address + (J9JVMTIEnv.SIZEOF * count));
	}

	public J9JVMTIEnvPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIEnvPointer addOffset(long offset) {
		return J9JVMTIEnvPointer.cast(address + offset);
	}

	public J9JVMTIEnvPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIEnvPointer sub(long count) {
		return J9JVMTIEnvPointer.cast(address - (J9JVMTIEnv.SIZEOF * count));
	}

	public J9JVMTIEnvPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIEnvPointer subOffset(long offset) {
		return J9JVMTIEnvPointer.cast(address - offset);
	}

	public J9JVMTIEnvPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIEnvPointer untag(long mask) {
		return J9JVMTIEnvPointer.cast(address & ~mask);
	}

	public J9JVMTIEnvPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIEnv.SIZEOF;
	}

	// Implementation methods

	// J9Pool* breakpoints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_breakpointsOffset_", declaredType="J9Pool*")
	public J9PoolPointer breakpoints() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIEnv._breakpointsOffset_));
	}

	// J9Pool* breakpoints
	public PointerPointer breakpointsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._breakpointsOffset_));
	}

	// jvmtiEventCallbacks callbacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callbacksOffset_", declaredType="jvmtiEventCallbacks")
	public jvmtiEventCallbacksPointer callbacks() throws CorruptDataException {
		return jvmtiEventCallbacksPointer.cast(nonNullFieldEA(J9JVMTIEnv._callbacksOffset_));
	}

	// jvmtiEventCallbacks callbacks
	public PointerPointer callbacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._callbacksOffset_));
	}

	// jvmtiCapabilities capabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_capabilitiesOffset_", declaredType="jvmtiCapabilities")
	public jvmtiCapabilitiesPointer capabilities() throws CorruptDataException {
		return jvmtiCapabilitiesPointer.cast(nonNullFieldEA(J9JVMTIEnv._capabilitiesOffset_));
	}

	// jvmtiCapabilities capabilities
	public PointerPointer capabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._capabilitiesOffset_));
	}

	// void* environmentLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentLocalStorageOffset_", declaredType="void*")
	public VoidPointer environmentLocalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTIEnv._environmentLocalStorageOffset_));
	}

	// void* environmentLocalStorage
	public PointerPointer environmentLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._environmentLocalStorageOffset_));
	}

	// J9JVMTIExtensionCallbacks extensionCallbacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extensionCallbacksOffset_", declaredType="J9JVMTIExtensionCallbacks")
	public J9JVMTIExtensionCallbacksPointer extensionCallbacks() throws CorruptDataException {
		return J9JVMTIExtensionCallbacksPointer.cast(nonNullFieldEA(J9JVMTIEnv._extensionCallbacksOffset_));
	}

	// J9JVMTIExtensionCallbacks extensionCallbacks
	public PointerPointer extensionCallbacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._extensionCallbacksOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIEnv._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIEnv._flagsOffset_));
	}

	// jvmtiNativeInterface* functions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_functionsOffset_", declaredType="jvmtiNativeInterface*")
	public JVMTINativeInterface_Pointer functions() throws CorruptDataException {
		return JVMTINativeInterface_Pointer.cast(getPointerAtOffset(J9JVMTIEnv._functionsOffset_));
	}

	// jvmtiNativeInterface* functions
	public PointerPointer functionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._functionsOffset_));
	}

	// J9JVMTIHookInterfaceWithID gcHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcHookOffset_", declaredType="J9JVMTIHookInterfaceWithID")
	public J9JVMTIHookInterfaceWithIDPointer gcHook() throws CorruptDataException {
		return J9JVMTIHookInterfaceWithIDPointer.cast(nonNullFieldEA(J9JVMTIEnv._gcHookOffset_));
	}

	// J9JVMTIHookInterfaceWithID gcHook
	public PointerPointer gcHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._gcHookOffset_));
	}

	// J9JVMTIHookInterfaceWithID gcOmrHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOmrHookOffset_", declaredType="J9JVMTIHookInterfaceWithID")
	public J9JVMTIHookInterfaceWithIDPointer gcOmrHook() throws CorruptDataException {
		return J9JVMTIHookInterfaceWithIDPointer.cast(nonNullFieldEA(J9JVMTIEnv._gcOmrHookOffset_));
	}

	// J9JVMTIHookInterfaceWithID gcOmrHook
	public PointerPointer gcOmrHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._gcOmrHookOffset_));
	}

	// J9JVMTIEventEnableMap globalEventEnable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalEventEnableOffset_", declaredType="J9JVMTIEventEnableMap")
	public J9JVMTIEventEnableMapPointer globalEventEnable() throws CorruptDataException {
		return J9JVMTIEventEnableMapPointer.cast(nonNullFieldEA(J9JVMTIEnv._globalEventEnableOffset_));
	}

	// J9JVMTIEventEnableMap globalEventEnable
	public PointerPointer globalEventEnableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._globalEventEnableOffset_));
	}

	// J9JVMTIHookInterfaceWithID jitHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitHookOffset_", declaredType="J9JVMTIHookInterfaceWithID")
	public J9JVMTIHookInterfaceWithIDPointer jitHook() throws CorruptDataException {
		return J9JVMTIHookInterfaceWithIDPointer.cast(nonNullFieldEA(J9JVMTIEnv._jitHookOffset_));
	}

	// J9JVMTIHookInterfaceWithID jitHook
	public PointerPointer jitHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._jitHookOffset_));
	}

	// J9NativeLibrary* library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_libraryOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer library() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9JVMTIEnv._libraryOffset_));
	}

	// J9NativeLibrary* library
	public PointerPointer libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._libraryOffset_));
	}

	// J9JVMTIEnv* linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkNextOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer linkNext() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIEnv._linkNextOffset_));
	}

	// J9JVMTIEnv* linkNext
	public PointerPointer linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._linkNextOffset_));
	}

	// J9JVMTIEnv* linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkPreviousOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer linkPrevious() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIEnv._linkPreviousOffset_));
	}

	// J9JVMTIEnv* linkPrevious
	public PointerPointer linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._linkPreviousOffset_));
	}

	// omrthread_monitor_t mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JVMTIEnv._mutexOffset_));
	}

	// omrthread_monitor_t mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._mutexOffset_));
	}

	// J9HashTable* objectTagTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectTagTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer objectTagTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JVMTIEnv._objectTagTableOffset_));
	}

	// J9HashTable* objectTagTable
	public PointerPointer objectTagTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._objectTagTableOffset_));
	}

	// jint prefixCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prefixCountOffset_", declaredType="jint")
	public IDATA prefixCount() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JVMTIEnv._prefixCountOffset_));
	}

	// jint prefixCount
	public IDATAPointer prefixCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JVMTIEnv._prefixCountOffset_));
	}

	// U8* prefixes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prefixesOffset_", declaredType="U8*")
	public U8Pointer prefixes() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JVMTIEnv._prefixesOffset_));
	}

	// U8* prefixes
	public PointerPointer prefixesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._prefixesOffset_));
	}

	// J9Pool* threadDataPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadDataPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer threadDataPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JVMTIEnv._threadDataPoolOffset_));
	}

	// J9Pool* threadDataPool
	public PointerPointer threadDataPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._threadDataPoolOffset_));
	}

	// omrthread_monitor_t threadDataPoolMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadDataPoolMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer threadDataPoolMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JVMTIEnv._threadDataPoolMutexOffset_));
	}

	// omrthread_monitor_t threadDataPoolMutex
	public PointerPointer threadDataPoolMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._threadDataPoolMutexOffset_));
	}

	// omrthread_tls_key_t tlsKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlsKeyOffset_", declaredType="omrthread_tls_key_t")
	public UDATA tlsKey() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JVMTIEnv._tlsKeyOffset_));
	}

	// omrthread_tls_key_t tlsKey
	public UDATAPointer tlsKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIEnv._tlsKeyOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JVMTIEnv._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._vmOffset_));
	}

	// J9JVMTIHookInterfaceWithID vmHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmHookOffset_", declaredType="J9JVMTIHookInterfaceWithID")
	public J9JVMTIHookInterfaceWithIDPointer vmHook() throws CorruptDataException {
		return J9JVMTIHookInterfaceWithIDPointer.cast(nonNullFieldEA(J9JVMTIEnv._vmHookOffset_));
	}

	// J9JVMTIHookInterfaceWithID vmHook
	public PointerPointer vmHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._vmHookOffset_));
	}

	// J9HashTable* watchedClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_watchedClassesOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer watchedClasses() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JVMTIEnv._watchedClassesOffset_));
	}

	// J9HashTable* watchedClasses
	public PointerPointer watchedClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIEnv._watchedClassesOffset_));
	}

}
