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
 * Structure: J9InternalVMFunctionsPointer
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
 * The generated code will provide getters for all elements in the J9InternalVMFunctionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9InternalVMFunctions.class)
public class J9InternalVMFunctionsPointer extends StructurePointer {

	// NULL
	public static final J9InternalVMFunctionsPointer NULL = new J9InternalVMFunctionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9InternalVMFunctionsPointer(long address) {
		super(address);
	}

	public static J9InternalVMFunctionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9InternalVMFunctionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9InternalVMFunctionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9InternalVMFunctionsPointer(address);
	}

	public J9InternalVMFunctionsPointer add(long count) {
		return J9InternalVMFunctionsPointer.cast(address + (J9InternalVMFunctions.SIZEOF * count));
	}

	public J9InternalVMFunctionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9InternalVMFunctionsPointer addOffset(long offset) {
		return J9InternalVMFunctionsPointer.cast(address + offset);
	}

	public J9InternalVMFunctionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9InternalVMFunctionsPointer sub(long count) {
		return J9InternalVMFunctionsPointer.cast(address - (J9InternalVMFunctions.SIZEOF * count));
	}

	public J9InternalVMFunctionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9InternalVMFunctionsPointer subOffset(long offset) {
		return J9InternalVMFunctionsPointer.cast(address - offset);
	}

	public J9InternalVMFunctionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9InternalVMFunctionsPointer untag(long mask) {
		return J9InternalVMFunctionsPointer.cast(address & ~mask);
	}

	public J9InternalVMFunctionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9InternalVMFunctions.SIZEOF;
	}

	// Implementation methods

	// void* AttachCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AttachCurrentThreadOffset_", declaredType="void*")
	public VoidPointer AttachCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._AttachCurrentThreadOffset_));
	}

	// void* AttachCurrentThread
	public PointerPointer AttachCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._AttachCurrentThreadOffset_));
	}

	// void* AttachCurrentThreadAsDaemon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AttachCurrentThreadAsDaemonOffset_", declaredType="void*")
	public VoidPointer AttachCurrentThreadAsDaemon() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._AttachCurrentThreadAsDaemonOffset_));
	}

	// void* AttachCurrentThreadAsDaemon
	public PointerPointer AttachCurrentThreadAsDaemonEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._AttachCurrentThreadAsDaemonOffset_));
	}

	// void* DestroyJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DestroyJavaVMOffset_", declaredType="void*")
	public VoidPointer DestroyJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._DestroyJavaVMOffset_));
	}

	// void* DestroyJavaVM
	public PointerPointer DestroyJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._DestroyJavaVMOffset_));
	}

	// void* DetachCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DetachCurrentThreadOffset_", declaredType="void*")
	public VoidPointer DetachCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._DetachCurrentThreadOffset_));
	}

	// void* DetachCurrentThread
	public PointerPointer DetachCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._DetachCurrentThreadOffset_));
	}

	// void* GetEnv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetEnvOffset_", declaredType="void*")
	public VoidPointer GetEnv() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._GetEnvOffset_));
	}

	// void* GetEnv
	public PointerPointer GetEnvEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._GetEnvOffset_));
	}

	// void* J9CancelAsyncEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9CancelAsyncEventOffset_", declaredType="void*")
	public VoidPointer J9CancelAsyncEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._J9CancelAsyncEventOffset_));
	}

	// void* J9CancelAsyncEvent
	public PointerPointer J9CancelAsyncEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._J9CancelAsyncEventOffset_));
	}

	// void* J9RegisterAsyncEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9RegisterAsyncEventOffset_", declaredType="void*")
	public VoidPointer J9RegisterAsyncEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._J9RegisterAsyncEventOffset_));
	}

	// void* J9RegisterAsyncEvent
	public PointerPointer J9RegisterAsyncEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._J9RegisterAsyncEventOffset_));
	}

	// void* J9SignalAsyncEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9SignalAsyncEventOffset_", declaredType="void*")
	public VoidPointer J9SignalAsyncEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._J9SignalAsyncEventOffset_));
	}

	// void* J9SignalAsyncEvent
	public PointerPointer J9SignalAsyncEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._J9SignalAsyncEventOffset_));
	}

	// void* J9SignalAsyncEventWithoutInterrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9SignalAsyncEventWithoutInterruptOffset_", declaredType="void*")
	public VoidPointer J9SignalAsyncEventWithoutInterrupt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._J9SignalAsyncEventWithoutInterruptOffset_));
	}

	// void* J9SignalAsyncEventWithoutInterrupt
	public PointerPointer J9SignalAsyncEventWithoutInterruptEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._J9SignalAsyncEventWithoutInterruptOffset_));
	}

	// void* J9UnregisterAsyncEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9UnregisterAsyncEventOffset_", declaredType="void*")
	public VoidPointer J9UnregisterAsyncEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._J9UnregisterAsyncEventOffset_));
	}

	// void* J9UnregisterAsyncEvent
	public PointerPointer J9UnregisterAsyncEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._J9UnregisterAsyncEventOffset_));
	}

	// void* acquireExclusiveVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_acquireExclusiveVMAccessOffset_", declaredType="void*")
	public VoidPointer acquireExclusiveVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._acquireExclusiveVMAccessOffset_));
	}

	// void* acquireExclusiveVMAccess
	public PointerPointer acquireExclusiveVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._acquireExclusiveVMAccessOffset_));
	}

	// void* acquireExclusiveVMAccessFromExternalThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_acquireExclusiveVMAccessFromExternalThreadOffset_", declaredType="void*")
	public VoidPointer acquireExclusiveVMAccessFromExternalThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._acquireExclusiveVMAccessFromExternalThreadOffset_));
	}

	// void* acquireExclusiveVMAccessFromExternalThread
	public PointerPointer acquireExclusiveVMAccessFromExternalThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._acquireExclusiveVMAccessFromExternalThreadOffset_));
	}

	// void* acquireSafePointVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_acquireSafePointVMAccessOffset_", declaredType="void*")
	public VoidPointer acquireSafePointVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._acquireSafePointVMAccessOffset_));
	}

	// void* acquireSafePointVMAccess
	public PointerPointer acquireSafePointVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._acquireSafePointVMAccessOffset_));
	}

	// void* addHiddenInstanceField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addHiddenInstanceFieldOffset_", declaredType="void*")
	public VoidPointer addHiddenInstanceField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._addHiddenInstanceFieldOffset_));
	}

	// void* addHiddenInstanceField
	public PointerPointer addHiddenInstanceFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._addHiddenInstanceFieldOffset_));
	}

	// void* addStatistic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addStatisticOffset_", declaredType="void*")
	public VoidPointer addStatistic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._addStatisticOffset_));
	}

	// void* addStatistic
	public PointerPointer addStatisticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._addStatisticOffset_));
	}

	// void* addSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addSystemPropertyOffset_", declaredType="void*")
	public VoidPointer addSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._addSystemPropertyOffset_));
	}

	// void* addSystemProperty
	public PointerPointer addSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._addSystemPropertyOffset_));
	}

	// void* addToBootstrapClassLoaderSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addToBootstrapClassLoaderSearchOffset_", declaredType="void*")
	public VoidPointer addToBootstrapClassLoaderSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._addToBootstrapClassLoaderSearchOffset_));
	}

	// void* addToBootstrapClassLoaderSearch
	public PointerPointer addToBootstrapClassLoaderSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._addToBootstrapClassLoaderSearchOffset_));
	}

	// void* addToSystemClassLoaderSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addToSystemClassLoaderSearchOffset_", declaredType="void*")
	public VoidPointer addToSystemClassLoaderSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._addToSystemClassLoaderSearchOffset_));
	}

	// void* addToSystemClassLoaderSearch
	public PointerPointer addToSystemClassLoaderSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._addToSystemClassLoaderSearchOffset_));
	}

	// void* allClassLoadersEndDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassLoadersEndDoOffset_", declaredType="void*")
	public VoidPointer allClassLoadersEndDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassLoadersEndDoOffset_));
	}

	// void* allClassLoadersEndDo
	public PointerPointer allClassLoadersEndDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassLoadersEndDoOffset_));
	}

	// void* allClassLoadersNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassLoadersNextDoOffset_", declaredType="void*")
	public VoidPointer allClassLoadersNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassLoadersNextDoOffset_));
	}

	// void* allClassLoadersNextDo
	public PointerPointer allClassLoadersNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassLoadersNextDoOffset_));
	}

	// void* allClassLoadersStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassLoadersStartDoOffset_", declaredType="void*")
	public VoidPointer allClassLoadersStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassLoadersStartDoOffset_));
	}

	// void* allClassLoadersStartDo
	public PointerPointer allClassLoadersStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassLoadersStartDoOffset_));
	}

	// void* allClassesEndDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassesEndDoOffset_", declaredType="void*")
	public VoidPointer allClassesEndDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassesEndDoOffset_));
	}

	// void* allClassesEndDo
	public PointerPointer allClassesEndDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassesEndDoOffset_));
	}

	// void* allClassesNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassesNextDoOffset_", declaredType="void*")
	public VoidPointer allClassesNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassesNextDoOffset_));
	}

	// void* allClassesNextDo
	public PointerPointer allClassesNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassesNextDoOffset_));
	}

	// void* allClassesStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allClassesStartDoOffset_", declaredType="void*")
	public VoidPointer allClassesStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allClassesStartDoOffset_));
	}

	// void* allClassesStartDo
	public PointerPointer allClassesStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allClassesStartDoOffset_));
	}

	// void* allLiveClassesEndDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allLiveClassesEndDoOffset_", declaredType="void*")
	public VoidPointer allLiveClassesEndDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allLiveClassesEndDoOffset_));
	}

	// void* allLiveClassesEndDo
	public PointerPointer allLiveClassesEndDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allLiveClassesEndDoOffset_));
	}

	// void* allLiveClassesNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allLiveClassesNextDoOffset_", declaredType="void*")
	public VoidPointer allLiveClassesNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allLiveClassesNextDoOffset_));
	}

	// void* allLiveClassesNextDo
	public PointerPointer allLiveClassesNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allLiveClassesNextDoOffset_));
	}

	// void* allLiveClassesStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allLiveClassesStartDoOffset_", declaredType="void*")
	public VoidPointer allLiveClassesStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allLiveClassesStartDoOffset_));
	}

	// void* allLiveClassesStartDo
	public PointerPointer allLiveClassesStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allLiveClassesStartDoOffset_));
	}

	// void* allocateClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateClassLoaderOffset_", declaredType="void*")
	public VoidPointer allocateClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateClassLoaderOffset_));
	}

	// void* allocateClassLoader
	public PointerPointer allocateClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateClassLoaderOffset_));
	}

	// void* allocateClassMemorySegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateClassMemorySegmentOffset_", declaredType="void*")
	public VoidPointer allocateClassMemorySegment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateClassMemorySegmentOffset_));
	}

	// void* allocateClassMemorySegment
	public PointerPointer allocateClassMemorySegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateClassMemorySegmentOffset_));
	}

	// void* allocateMemorySegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentOffset_));
	}

	// void* allocateMemorySegment
	public PointerPointer allocateMemorySegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentOffset_));
	}

	// void* allocateMemorySegmentInList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentInListOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegmentInList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentInListOffset_));
	}

	// void* allocateMemorySegmentInList
	public PointerPointer allocateMemorySegmentInListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentInListOffset_));
	}

	// void* allocateMemorySegmentList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentListOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegmentList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentListOffset_));
	}

	// void* allocateMemorySegmentList
	public PointerPointer allocateMemorySegmentListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentListOffset_));
	}

	// void* allocateMemorySegmentListEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentListEntryOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegmentListEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentListEntryOffset_));
	}

	// void* allocateMemorySegmentListEntry
	public PointerPointer allocateMemorySegmentListEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentListEntryOffset_));
	}

	// void* allocateMemorySegmentListWithFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentListWithFlagsOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegmentListWithFlags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentListWithFlagsOffset_));
	}

	// void* allocateMemorySegmentListWithFlags
	public PointerPointer allocateMemorySegmentListWithFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentListWithFlagsOffset_));
	}

	// void* allocateMemorySegmentListWithSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemorySegmentListWithSizeOffset_", declaredType="void*")
	public VoidPointer allocateMemorySegmentListWithSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateMemorySegmentListWithSizeOffset_));
	}

	// void* allocateMemorySegmentListWithSize
	public PointerPointer allocateMemorySegmentListWithSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateMemorySegmentListWithSizeOffset_));
	}

	// void* allocateVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateVMThreadOffset_", declaredType="void*")
	public VoidPointer allocateVMThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateVMThreadOffset_));
	}

	// void* allocateVMThread
	public PointerPointer allocateVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateVMThreadOffset_));
	}

	// void* allocateVirtualMemorySegmentInList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateVirtualMemorySegmentInListOffset_", declaredType="void*")
	public VoidPointer allocateVirtualMemorySegmentInList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._allocateVirtualMemorySegmentInListOffset_));
	}

	// void* allocateVirtualMemorySegmentInList
	public PointerPointer allocateVirtualMemorySegmentInListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._allocateVirtualMemorySegmentInListOffset_));
	}

	// void* annotationElementIteratorNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationElementIteratorNextOffset_", declaredType="void*")
	public VoidPointer annotationElementIteratorNext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._annotationElementIteratorNextOffset_));
	}

	// void* annotationElementIteratorNext
	public PointerPointer annotationElementIteratorNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._annotationElementIteratorNextOffset_));
	}

	// void* annotationElementIteratorStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationElementIteratorStartOffset_", declaredType="void*")
	public VoidPointer annotationElementIteratorStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._annotationElementIteratorStartOffset_));
	}

	// void* annotationElementIteratorStart
	public PointerPointer annotationElementIteratorStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._annotationElementIteratorStartOffset_));
	}

	// void* areValueBasedMonitorChecksEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_areValueBasedMonitorChecksEnabledOffset_", declaredType="void*")
	public VoidPointer areValueBasedMonitorChecksEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._areValueBasedMonitorChecksEnabledOffset_));
	}

	// void* areValueBasedMonitorChecksEnabled
	public PointerPointer areValueBasedMonitorChecksEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._areValueBasedMonitorChecksEnabledOffset_));
	}

	// void* areValueTypesEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_areValueTypesEnabledOffset_", declaredType="void*")
	public VoidPointer areValueTypesEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._areValueTypesEnabledOffset_));
	}

	// void* areValueTypesEnabled
	public PointerPointer areValueTypesEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._areValueTypesEnabledOffset_));
	}

	// void* arrayElementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayElementSizeOffset_", declaredType="void*")
	public VoidPointer arrayElementSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._arrayElementSizeOffset_));
	}

	// void* arrayElementSize
	public PointerPointer arrayElementSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._arrayElementSizeOffset_));
	}

	// void* atomicAndIntoConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_atomicAndIntoConstantPoolOffset_", declaredType="void*")
	public VoidPointer atomicAndIntoConstantPool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._atomicAndIntoConstantPoolOffset_));
	}

	// void* atomicAndIntoConstantPool
	public PointerPointer atomicAndIntoConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._atomicAndIntoConstantPoolOffset_));
	}

	// void* atomicOrIntoConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_atomicOrIntoConstantPoolOffset_", declaredType="void*")
	public VoidPointer atomicOrIntoConstantPool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._atomicOrIntoConstantPoolOffset_));
	}

	// void* atomicOrIntoConstantPool
	public PointerPointer atomicOrIntoConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._atomicOrIntoConstantPoolOffset_));
	}

	// void* attachSystemDaemonThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachSystemDaemonThreadOffset_", declaredType="void*")
	public VoidPointer attachSystemDaemonThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._attachSystemDaemonThreadOffset_));
	}

	// void* attachSystemDaemonThread
	public PointerPointer attachSystemDaemonThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._attachSystemDaemonThreadOffset_));
	}

	// void* attachThreadWithCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachThreadWithCategoryOffset_", declaredType="void*")
	public VoidPointer attachThreadWithCategory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._attachThreadWithCategoryOffset_));
	}

	// void* attachThreadWithCategory
	public PointerPointer attachThreadWithCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._attachThreadWithCategoryOffset_));
	}

	// void* buildMethodTypeFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buildMethodTypeFrameOffset_", declaredType="void*")
	public VoidPointer buildMethodTypeFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._buildMethodTypeFrameOffset_));
	}

	// void* buildMethodTypeFrame
	public PointerPointer buildMethodTypeFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._buildMethodTypeFrameOffset_));
	}

	// void* buildNativeFunctionNames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buildNativeFunctionNamesOffset_", declaredType="void*")
	public VoidPointer buildNativeFunctionNames() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._buildNativeFunctionNamesOffset_));
	}

	// void* buildNativeFunctionNames
	public PointerPointer buildNativeFunctionNamesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._buildNativeFunctionNamesOffset_));
	}

	// void* cacheObjectMonitorForLookup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheObjectMonitorForLookupOffset_", declaredType="void*")
	public VoidPointer cacheObjectMonitorForLookup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._cacheObjectMonitorForLookupOffset_));
	}

	// void* cacheObjectMonitorForLookup
	public PointerPointer cacheObjectMonitorForLookupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._cacheObjectMonitorForLookupOffset_));
	}

	// void* catUtfToString4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_catUtfToString4Offset_", declaredType="void*")
	public VoidPointer catUtfToString4() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._catUtfToString4Offset_));
	}

	// void* catUtfToString4
	public PointerPointer catUtfToString4EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._catUtfToString4Offset_));
	}

	// void* checkRomClassForError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_checkRomClassForErrorOffset_", declaredType="void*")
	public VoidPointer checkRomClassForError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._checkRomClassForErrorOffset_));
	}

	// void* checkRomClassForError
	public PointerPointer checkRomClassForErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._checkRomClassForErrorOffset_));
	}

	// void* checkVisibility
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_checkVisibilityOffset_", declaredType="void*")
	public VoidPointer checkVisibility() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._checkVisibilityOffset_));
	}

	// void* checkVisibility
	public PointerPointer checkVisibilityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._checkVisibilityOffset_));
	}

	// void* cleanUpClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanUpClassLoaderOffset_", declaredType="void*")
	public VoidPointer cleanUpClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._cleanUpClassLoaderOffset_));
	}

	// void* cleanUpClassLoader
	public PointerPointer cleanUpClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._cleanUpClassLoaderOffset_));
	}

	// void* cleanupVMThreadJniArrayCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanupVMThreadJniArrayCacheOffset_", declaredType="void*")
	public VoidPointer cleanupVMThreadJniArrayCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._cleanupVMThreadJniArrayCacheOffset_));
	}

	// void* cleanupVMThreadJniArrayCache
	public PointerPointer cleanupVMThreadJniArrayCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._cleanupVMThreadJniArrayCacheOffset_));
	}

	// void* clearHaltFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clearHaltFlagOffset_", declaredType="void*")
	public VoidPointer clearHaltFlag() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._clearHaltFlagOffset_));
	}

	// void* clearHaltFlag
	public PointerPointer clearHaltFlagEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._clearHaltFlagOffset_));
	}

	// void* cloneValueType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cloneValueTypeOffset_", declaredType="void*")
	public VoidPointer cloneValueType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._cloneValueTypeOffset_));
	}

	// void* cloneValueType
	public PointerPointer cloneValueTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._cloneValueTypeOffset_));
	}

	// void* compareStringToUTF8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compareStringToUTF8Offset_", declaredType="void*")
	public VoidPointer compareStringToUTF8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._compareStringToUTF8Offset_));
	}

	// void* compareStringToUTF8
	public PointerPointer compareStringToUTF8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._compareStringToUTF8Offset_));
	}

	// void* compareStrings
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compareStringsOffset_", declaredType="void*")
	public VoidPointer compareStrings() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._compareStringsOffset_));
	}

	// void* compareStrings
	public PointerPointer compareStringsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._compareStringsOffset_));
	}

	// void* computeHashForUTF8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_computeHashForUTF8Offset_", declaredType="void*")
	public VoidPointer computeHashForUTF8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._computeHashForUTF8Offset_));
	}

	// void* computeHashForUTF8
	public PointerPointer computeHashForUTF8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._computeHashForUTF8Offset_));
	}

	// void* copyStringToJ9UTF8WithMemAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copyStringToJ9UTF8WithMemAllocOffset_", declaredType="void*")
	public VoidPointer copyStringToJ9UTF8WithMemAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._copyStringToJ9UTF8WithMemAllocOffset_));
	}

	// void* copyStringToJ9UTF8WithMemAlloc
	public PointerPointer copyStringToJ9UTF8WithMemAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._copyStringToJ9UTF8WithMemAllocOffset_));
	}

	// void* copyStringToUTF8Helper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copyStringToUTF8HelperOffset_", declaredType="void*")
	public VoidPointer copyStringToUTF8Helper() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._copyStringToUTF8HelperOffset_));
	}

	// void* copyStringToUTF8Helper
	public PointerPointer copyStringToUTF8HelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._copyStringToUTF8HelperOffset_));
	}

	// void* copyStringToUTF8WithMemAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copyStringToUTF8WithMemAllocOffset_", declaredType="void*")
	public VoidPointer copyStringToUTF8WithMemAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._copyStringToUTF8WithMemAllocOffset_));
	}

	// void* copyStringToUTF8WithMemAlloc
	public PointerPointer copyStringToUTF8WithMemAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._copyStringToUTF8WithMemAllocOffset_));
	}

	// void* createCachedOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createCachedOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer createCachedOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._createCachedOutOfMemoryErrorOffset_));
	}

	// void* createCachedOutOfMemoryError
	public PointerPointer createCachedOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._createCachedOutOfMemoryErrorOffset_));
	}

	// void* createJoinableThreadWithCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createJoinableThreadWithCategoryOffset_", declaredType="void*")
	public VoidPointer createJoinableThreadWithCategory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._createJoinableThreadWithCategoryOffset_));
	}

	// void* createJoinableThreadWithCategory
	public PointerPointer createJoinableThreadWithCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._createJoinableThreadWithCategoryOffset_));
	}

	// void* createThreadWithCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createThreadWithCategoryOffset_", declaredType="void*")
	public VoidPointer createThreadWithCategory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._createThreadWithCategoryOffset_));
	}

	// void* createThreadWithCategory
	public PointerPointer createThreadWithCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._createThreadWithCategoryOffset_));
	}

	// void* currentVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentVMThreadOffset_", declaredType="void*")
	public VoidPointer currentVMThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._currentVMThreadOffset_));
	}

	// void* currentVMThread
	public PointerPointer currentVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._currentVMThreadOffset_));
	}

	// void* deallocateVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deallocateVMThreadOffset_", declaredType="void*")
	public VoidPointer deallocateVMThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._deallocateVMThreadOffset_));
	}

	// void* deallocateVMThread
	public PointerPointer deallocateVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._deallocateVMThreadOffset_));
	}

	// void* defaultValueWithUnflattenedFlattenables
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultValueWithUnflattenedFlattenablesOffset_", declaredType="void*")
	public VoidPointer defaultValueWithUnflattenedFlattenables() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._defaultValueWithUnflattenedFlattenablesOffset_));
	}

	// void* defaultValueWithUnflattenedFlattenables
	public PointerPointer defaultValueWithUnflattenedFlattenablesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._defaultValueWithUnflattenedFlattenablesOffset_));
	}

	// void* dumpStackTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpStackTraceOffset_", declaredType="void*")
	public VoidPointer dumpStackTrace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._dumpStackTraceOffset_));
	}

	// void* dumpStackTrace
	public PointerPointer dumpStackTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._dumpStackTraceOffset_));
	}

	// void* elementArrayIteratorNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementArrayIteratorNextOffset_", declaredType="void*")
	public VoidPointer elementArrayIteratorNext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._elementArrayIteratorNextOffset_));
	}

	// void* elementArrayIteratorNext
	public PointerPointer elementArrayIteratorNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._elementArrayIteratorNextOffset_));
	}

	// void* elementArrayIteratorStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementArrayIteratorStartOffset_", declaredType="void*")
	public VoidPointer elementArrayIteratorStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._elementArrayIteratorStartOffset_));
	}

	// void* elementArrayIteratorStart
	public PointerPointer elementArrayIteratorStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._elementArrayIteratorStartOffset_));
	}

	// void* ensureJNIIDTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ensureJNIIDTableOffset_", declaredType="void*")
	public VoidPointer ensureJNIIDTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._ensureJNIIDTableOffset_));
	}

	// void* ensureJNIIDTable
	public PointerPointer ensureJNIIDTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._ensureJNIIDTableOffset_));
	}

	// void* exceptionHandlerSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionHandlerSearchOffset_", declaredType="void*")
	public VoidPointer exceptionHandlerSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._exceptionHandlerSearchOffset_));
	}

	// void* exceptionHandlerSearch
	public PointerPointer exceptionHandlerSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._exceptionHandlerSearchOffset_));
	}

	// void* exitJavaThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exitJavaThreadOffset_", declaredType="void*")
	public VoidPointer exitJavaThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._exitJavaThreadOffset_));
	}

	// void* exitJavaThread
	public PointerPointer exitJavaThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._exitJavaThreadOffset_));
	}

	// void* exitJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exitJavaVMOffset_", declaredType="void*")
	public VoidPointer exitJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._exitJavaVMOffset_));
	}

	// void* exitJavaVM
	public PointerPointer exitJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._exitJavaVMOffset_));
	}

	// void* fatalRecursiveStackOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fatalRecursiveStackOverflowOffset_", declaredType="void*")
	public VoidPointer fatalRecursiveStackOverflow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fatalRecursiveStackOverflowOffset_));
	}

	// void* fatalRecursiveStackOverflow
	public PointerPointer fatalRecursiveStackOverflowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fatalRecursiveStackOverflowOffset_));
	}

	// void* fieldIndexTableRemove
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldIndexTableRemoveOffset_", declaredType="void*")
	public VoidPointer fieldIndexTableRemove() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fieldIndexTableRemoveOffset_));
	}

	// void* fieldIndexTableRemove
	public PointerPointer fieldIndexTableRemoveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fieldIndexTableRemoveOffset_));
	}

	// void* fieldOffsetsNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffsetsNextDoOffset_", declaredType="void*")
	public VoidPointer fieldOffsetsNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fieldOffsetsNextDoOffset_));
	}

	// void* fieldOffsetsNextDo
	public PointerPointer fieldOffsetsNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fieldOffsetsNextDoOffset_));
	}

	// void* fieldOffsetsStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffsetsStartDoOffset_", declaredType="void*")
	public VoidPointer fieldOffsetsStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fieldOffsetsStartDoOffset_));
	}

	// void* fieldOffsetsStartDo
	public PointerPointer fieldOffsetsStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fieldOffsetsStartDoOffset_));
	}

	// void* fillInDgRasInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fillInDgRasInterfaceOffset_", declaredType="void*")
	public VoidPointer fillInDgRasInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fillInDgRasInterfaceOffset_));
	}

	// void* fillInDgRasInterface
	public PointerPointer fillInDgRasInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fillInDgRasInterfaceOffset_));
	}

	// void* fillJITVTableSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fillJITVTableSlotOffset_", declaredType="void*")
	public VoidPointer fillJITVTableSlot() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fillJITVTableSlotOffset_));
	}

	// void* fillJITVTableSlot
	public PointerPointer fillJITVTableSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fillJITVTableSlotOffset_));
	}

	// void* findArgInVMArgs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findArgInVMArgsOffset_", declaredType="void*")
	public VoidPointer findArgInVMArgs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findArgInVMArgsOffset_));
	}

	// void* findArgInVMArgs
	public PointerPointer findArgInVMArgsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findArgInVMArgsOffset_));
	}

	// void* findClassLocationForClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findClassLocationForClassOffset_", declaredType="void*")
	public VoidPointer findClassLocationForClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findClassLocationForClassOffset_));
	}

	// void* findClassLocationForClass
	public PointerPointer findClassLocationForClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findClassLocationForClassOffset_));
	}

	// void* findDllLoadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findDllLoadInfoOffset_", declaredType="void*")
	public VoidPointer findDllLoadInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findDllLoadInfoOffset_));
	}

	// void* findDllLoadInfo
	public PointerPointer findDllLoadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findDllLoadInfoOffset_));
	}

	// void* findFieldSignatureClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findFieldSignatureClassOffset_", declaredType="void*")
	public VoidPointer findFieldSignatureClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findFieldSignatureClassOffset_));
	}

	// void* findFieldSignatureClass
	public PointerPointer findFieldSignatureClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findFieldSignatureClassOffset_));
	}

	// void* findJNIMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findJNIMethodOffset_", declaredType="void*")
	public VoidPointer findJNIMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findJNIMethodOffset_));
	}

	// void* findJNIMethod
	public PointerPointer findJNIMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findJNIMethodOffset_));
	}

	// void* findModuleForPackage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findModuleForPackageOffset_", declaredType="void*")
	public VoidPointer findModuleForPackage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findModuleForPackageOffset_));
	}

	// void* findModuleForPackage
	public PointerPointer findModuleForPackageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findModuleForPackageOffset_));
	}

	// void* findModuleForPackageUTF8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findModuleForPackageUTF8Offset_", declaredType="void*")
	public VoidPointer findModuleForPackageUTF8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findModuleForPackageUTF8Offset_));
	}

	// void* findModuleForPackageUTF8
	public PointerPointer findModuleForPackageUTF8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findModuleForPackageUTF8Offset_));
	}

	// void* findModuleInfoForModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findModuleInfoForModuleOffset_", declaredType="void*")
	public VoidPointer findModuleInfoForModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findModuleInfoForModuleOffset_));
	}

	// void* findModuleInfoForModule
	public PointerPointer findModuleInfoForModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findModuleInfoForModuleOffset_));
	}

	// void* findObjectDeadlockedThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findObjectDeadlockedThreadsOffset_", declaredType="void*")
	public VoidPointer findObjectDeadlockedThreads() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findObjectDeadlockedThreadsOffset_));
	}

	// void* findObjectDeadlockedThreads
	public PointerPointer findObjectDeadlockedThreadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findObjectDeadlockedThreadsOffset_));
	}

	// void* findROMClassFromPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findROMClassFromPCOffset_", declaredType="void*")
	public VoidPointer findROMClassFromPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._findROMClassFromPCOffset_));
	}

	// void* findROMClassFromPC
	public PointerPointer findROMClassFromPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._findROMClassFromPCOffset_));
	}

	// void* flushProcessWriteBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flushProcessWriteBuffersOffset_", declaredType="void*")
	public VoidPointer flushProcessWriteBuffers() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._flushProcessWriteBuffersOffset_));
	}

	// void* flushProcessWriteBuffers
	public PointerPointer flushProcessWriteBuffersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._flushProcessWriteBuffersOffset_));
	}

	// void* freeClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeClassLoaderOffset_", declaredType="void*")
	public VoidPointer freeClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeClassLoaderOffset_));
	}

	// void* freeClassLoader
	public PointerPointer freeClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeClassLoaderOffset_));
	}

	// void* freeJ9Module
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeJ9ModuleOffset_", declaredType="void*")
	public VoidPointer freeJ9Module() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeJ9ModuleOffset_));
	}

	// void* freeJ9Module
	public PointerPointer freeJ9ModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeJ9ModuleOffset_));
	}

	// void* freeMemorySegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeMemorySegmentOffset_", declaredType="void*")
	public VoidPointer freeMemorySegment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeMemorySegmentOffset_));
	}

	// void* freeMemorySegment
	public PointerPointer freeMemorySegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeMemorySegmentOffset_));
	}

	// void* freeMemorySegmentList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeMemorySegmentListOffset_", declaredType="void*")
	public VoidPointer freeMemorySegmentList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeMemorySegmentListOffset_));
	}

	// void* freeMemorySegmentList
	public PointerPointer freeMemorySegmentListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeMemorySegmentListOffset_));
	}

	// void* freeMemorySegmentListEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeMemorySegmentListEntryOffset_", declaredType="void*")
	public VoidPointer freeMemorySegmentListEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeMemorySegmentListEntryOffset_));
	}

	// void* freeMemorySegmentListEntry
	public PointerPointer freeMemorySegmentListEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeMemorySegmentListEntryOffset_));
	}

	// void* freeStackWalkCaches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeStackWalkCachesOffset_", declaredType="void*")
	public VoidPointer freeStackWalkCaches() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeStackWalkCachesOffset_));
	}

	// void* freeStackWalkCaches
	public PointerPointer freeStackWalkCachesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeStackWalkCachesOffset_));
	}

	// void* freeStacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeStacksOffset_", declaredType="void*")
	public VoidPointer freeStacks() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._freeStacksOffset_));
	}

	// void* freeStacks
	public PointerPointer freeStacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._freeStacksOffset_));
	}

	// void* fullTraversalFieldOffsetsNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fullTraversalFieldOffsetsNextDoOffset_", declaredType="void*")
	public VoidPointer fullTraversalFieldOffsetsNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fullTraversalFieldOffsetsNextDoOffset_));
	}

	// void* fullTraversalFieldOffsetsNextDo
	public PointerPointer fullTraversalFieldOffsetsNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fullTraversalFieldOffsetsNextDoOffset_));
	}

	// void* fullTraversalFieldOffsetsStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fullTraversalFieldOffsetsStartDoOffset_", declaredType="void*")
	public VoidPointer fullTraversalFieldOffsetsStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._fullTraversalFieldOffsetsStartDoOffset_));
	}

	// void* fullTraversalFieldOffsetsStartDo
	public PointerPointer fullTraversalFieldOffsetsStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._fullTraversalFieldOffsetsStartDoOffset_));
	}

	// void* genericStackDumpIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericStackDumpIteratorOffset_", declaredType="void*")
	public VoidPointer genericStackDumpIterator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._genericStackDumpIteratorOffset_));
	}

	// void* genericStackDumpIterator
	public PointerPointer genericStackDumpIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._genericStackDumpIteratorOffset_));
	}

	// void* getAllAnnotationsFromAnnotationInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAllAnnotationsFromAnnotationInfoOffset_", declaredType="void*")
	public VoidPointer getAllAnnotationsFromAnnotationInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAllAnnotationsFromAnnotationInfoOffset_));
	}

	// void* getAllAnnotationsFromAnnotationInfo
	public PointerPointer getAllAnnotationsFromAnnotationInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAllAnnotationsFromAnnotationInfoOffset_));
	}

	// void* getAnnotationDefaultsForAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAnnotationDefaultsForAnnotationOffset_", declaredType="void*")
	public VoidPointer getAnnotationDefaultsForAnnotation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAnnotationDefaultsForAnnotationOffset_));
	}

	// void* getAnnotationDefaultsForAnnotation
	public PointerPointer getAnnotationDefaultsForAnnotationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAnnotationDefaultsForAnnotationOffset_));
	}

	// void* getAnnotationDefaultsForNamedAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAnnotationDefaultsForNamedAnnotationOffset_", declaredType="void*")
	public VoidPointer getAnnotationDefaultsForNamedAnnotation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAnnotationDefaultsForNamedAnnotationOffset_));
	}

	// void* getAnnotationDefaultsForNamedAnnotation
	public PointerPointer getAnnotationDefaultsForNamedAnnotationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAnnotationDefaultsForNamedAnnotationOffset_));
	}

	// void* getAnnotationFromAnnotationInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAnnotationFromAnnotationInfoOffset_", declaredType="void*")
	public VoidPointer getAnnotationFromAnnotationInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAnnotationFromAnnotationInfoOffset_));
	}

	// void* getAnnotationFromAnnotationInfo
	public PointerPointer getAnnotationFromAnnotationInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAnnotationFromAnnotationInfoOffset_));
	}

	// void* getAnnotationInfoFromClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAnnotationInfoFromClassOffset_", declaredType="void*")
	public VoidPointer getAnnotationInfoFromClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAnnotationInfoFromClassOffset_));
	}

	// void* getAnnotationInfoFromClass
	public PointerPointer getAnnotationInfoFromClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAnnotationInfoFromClassOffset_));
	}

	// void* getAnnotationsFromAnnotationInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getAnnotationsFromAnnotationInfoOffset_", declaredType="void*")
	public VoidPointer getAnnotationsFromAnnotationInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getAnnotationsFromAnnotationInfoOffset_));
	}

	// void* getAnnotationsFromAnnotationInfo
	public PointerPointer getAnnotationsFromAnnotationInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getAnnotationsFromAnnotationInfoOffset_));
	}

	// void* getFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer getFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getFlattenableFieldOffset_));
	}

	// void* getFlattenableField
	public PointerPointer getFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getFlattenableFieldOffset_));
	}

	// void* getFlattenableFieldOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFlattenableFieldOffsetOffset_", declaredType="void*")
	public VoidPointer getFlattenableFieldOffset() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getFlattenableFieldOffsetOffset_));
	}

	// void* getFlattenableFieldOffset
	public PointerPointer getFlattenableFieldOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getFlattenableFieldOffsetOffset_));
	}

	// void* getFlattenableFieldSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFlattenableFieldSizeOffset_", declaredType="void*")
	public VoidPointer getFlattenableFieldSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getFlattenableFieldSizeOffset_));
	}

	// void* getFlattenableFieldSize
	public PointerPointer getFlattenableFieldSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getFlattenableFieldSizeOffset_));
	}

	// void* getFlattenableFieldType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFlattenableFieldTypeOffset_", declaredType="void*")
	public VoidPointer getFlattenableFieldType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getFlattenableFieldTypeOffset_));
	}

	// void* getFlattenableFieldType
	public PointerPointer getFlattenableFieldTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getFlattenableFieldTypeOffset_));
	}

	// void* getJ9VMVersionString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJ9VMVersionStringOffset_", declaredType="void*")
	public VoidPointer getJ9VMVersionString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJ9VMVersionStringOffset_));
	}

	// void* getJ9VMVersionString
	public PointerPointer getJ9VMVersionStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJ9VMVersionStringOffset_));
	}

	// void* getJITHookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJITHookInterfaceOffset_", declaredType="void*")
	public VoidPointer getJITHookInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJITHookInterfaceOffset_));
	}

	// void* getJITHookInterface
	public PointerPointer getJITHookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJITHookInterfaceOffset_));
	}

	// void* getJNIFieldID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJNIFieldIDOffset_", declaredType="void*")
	public VoidPointer getJNIFieldID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJNIFieldIDOffset_));
	}

	// void* getJNIFieldID
	public PointerPointer getJNIFieldIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJNIFieldIDOffset_));
	}

	// void* getJNIMethodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJNIMethodIDOffset_", declaredType="void*")
	public VoidPointer getJNIMethodID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJNIMethodIDOffset_));
	}

	// void* getJNIMethodID
	public PointerPointer getJNIMethodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJNIMethodIDOffset_));
	}

	// void* getJavaThreadPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJavaThreadPriorityOffset_", declaredType="void*")
	public VoidPointer getJavaThreadPriority() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJavaThreadPriorityOffset_));
	}

	// void* getJavaThreadPriority
	public PointerPointer getJavaThreadPriorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJavaThreadPriorityOffset_));
	}

	// void* getJimModules
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJimModulesOffset_", declaredType="void*")
	public VoidPointer getJimModules() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getJimModulesOffset_));
	}

	// void* getJimModules
	public PointerPointer getJimModulesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getJimModulesOffset_));
	}

	// void* getMonitorForWait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getMonitorForWaitOffset_", declaredType="void*")
	public VoidPointer getMonitorForWait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getMonitorForWaitOffset_));
	}

	// void* getMonitorForWait
	public PointerPointer getMonitorForWaitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getMonitorForWaitOffset_));
	}

	// void* getNPEMessage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getNPEMessageOffset_", declaredType="void*")
	public VoidPointer getNPEMessage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getNPEMessageOffset_));
	}

	// void* getNPEMessage
	public PointerPointer getNPEMessageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getNPEMessageOffset_));
	}

	// void* getNamedElementFromAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getNamedElementFromAnnotationOffset_", declaredType="void*")
	public VoidPointer getNamedElementFromAnnotation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getNamedElementFromAnnotationOffset_));
	}

	// void* getNamedElementFromAnnotation
	public PointerPointer getNamedElementFromAnnotationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getNamedElementFromAnnotationOffset_));
	}

	// void* getOwnedObjectMonitors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getOwnedObjectMonitorsOffset_", declaredType="void*")
	public VoidPointer getOwnedObjectMonitors() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getOwnedObjectMonitorsOffset_));
	}

	// void* getOwnedObjectMonitors
	public PointerPointer getOwnedObjectMonitorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getOwnedObjectMonitorsOffset_));
	}

	// void* getStatistic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStatisticOffset_", declaredType="void*")
	public VoidPointer getStatistic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getStatisticOffset_));
	}

	// void* getStatistic
	public PointerPointer getStatisticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getStatisticOffset_));
	}

	// void* getStringUTF8Length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStringUTF8LengthOffset_", declaredType="void*")
	public VoidPointer getStringUTF8Length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getStringUTF8LengthOffset_));
	}

	// void* getStringUTF8Length
	public PointerPointer getStringUTF8LengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getStringUTF8LengthOffset_));
	}

	// void* getSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getSystemPropertyOffset_", declaredType="void*")
	public VoidPointer getSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getSystemPropertyOffset_));
	}

	// void* getSystemProperty
	public PointerPointer getSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getSystemPropertyOffset_));
	}

	// void* getVMHookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getVMHookInterfaceOffset_", declaredType="void*")
	public VoidPointer getVMHookInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getVMHookInterfaceOffset_));
	}

	// void* getVMHookInterface
	public PointerPointer getVMHookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getVMHookInterfaceOffset_));
	}

	// void* getVMMinIdleWaitTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getVMMinIdleWaitTimeOffset_", declaredType="void*")
	public VoidPointer getVMMinIdleWaitTime() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getVMMinIdleWaitTimeOffset_));
	}

	// void* getVMMinIdleWaitTime
	public PointerPointer getVMMinIdleWaitTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getVMMinIdleWaitTimeOffset_));
	}

	// void* getVMRuntimeState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getVMRuntimeStateOffset_", declaredType="void*")
	public VoidPointer getVMRuntimeState() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getVMRuntimeStateOffset_));
	}

	// void* getVMRuntimeState
	public PointerPointer getVMRuntimeStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getVMRuntimeStateOffset_));
	}

	// void* getVTableOffsetForMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getVTableOffsetForMethodOffset_", declaredType="void*")
	public VoidPointer getVTableOffsetForMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._getVTableOffsetForMethodOffset_));
	}

	// void* getVTableOffsetForMethod
	public PointerPointer getVTableOffsetForMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._getVTableOffsetForMethodOffset_));
	}

	// void* growJavaStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_growJavaStackOffset_", declaredType="void*")
	public VoidPointer growJavaStack() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._growJavaStackOffset_));
	}

	// void* growJavaStack
	public PointerPointer growJavaStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._growJavaStackOffset_));
	}

	// void* haltThreadForInspection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_haltThreadForInspectionOffset_", declaredType="void*")
	public VoidPointer haltThreadForInspection() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._haltThreadForInspectionOffset_));
	}

	// void* haltThreadForInspection
	public PointerPointer haltThreadForInspectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._haltThreadForInspectionOffset_));
	}

	// void* hashClassLocationTableNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassLocationTableNewOffset_", declaredType="void*")
	public VoidPointer hashClassLocationTableNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassLocationTableNewOffset_));
	}

	// void* hashClassLocationTableNew
	public PointerPointer hashClassLocationTableNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassLocationTableNewOffset_));
	}

	// void* hashClassTableAt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableAtOffset_", declaredType="void*")
	public VoidPointer hashClassTableAt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableAtOffset_));
	}

	// void* hashClassTableAt
	public PointerPointer hashClassTableAtEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableAtOffset_));
	}

	// void* hashClassTableAtPut
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableAtPutOffset_", declaredType="void*")
	public VoidPointer hashClassTableAtPut() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableAtPutOffset_));
	}

	// void* hashClassTableAtPut
	public PointerPointer hashClassTableAtPutEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableAtPutOffset_));
	}

	// void* hashClassTableDelete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableDeleteOffset_", declaredType="void*")
	public VoidPointer hashClassTableDelete() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableDeleteOffset_));
	}

	// void* hashClassTableDelete
	public PointerPointer hashClassTableDeleteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableDeleteOffset_));
	}

	// void* hashClassTableNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableNextDoOffset_", declaredType="void*")
	public VoidPointer hashClassTableNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableNextDoOffset_));
	}

	// void* hashClassTableNextDo
	public PointerPointer hashClassTableNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableNextDoOffset_));
	}

	// void* hashClassTableReplace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableReplaceOffset_", declaredType="void*")
	public VoidPointer hashClassTableReplace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableReplaceOffset_));
	}

	// void* hashClassTableReplace
	public PointerPointer hashClassTableReplaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableReplaceOffset_));
	}

	// void* hashClassTableStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashClassTableStartDoOffset_", declaredType="void*")
	public VoidPointer hashClassTableStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashClassTableStartDoOffset_));
	}

	// void* hashClassTableStartDo
	public PointerPointer hashClassTableStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashClassTableStartDoOffset_));
	}

	// void* hashModuleExtraInfoTableNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashModuleExtraInfoTableNewOffset_", declaredType="void*")
	public VoidPointer hashModuleExtraInfoTableNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashModuleExtraInfoTableNewOffset_));
	}

	// void* hashModuleExtraInfoTableNew
	public PointerPointer hashModuleExtraInfoTableNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashModuleExtraInfoTableNewOffset_));
	}

	// void* hashModuleNameTableNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashModuleNameTableNewOffset_", declaredType="void*")
	public VoidPointer hashModuleNameTableNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashModuleNameTableNewOffset_));
	}

	// void* hashModuleNameTableNew
	public PointerPointer hashModuleNameTableNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashModuleNameTableNewOffset_));
	}

	// void* hashModulePointerTableNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashModulePointerTableNewOffset_", declaredType="void*")
	public VoidPointer hashModulePointerTableNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashModulePointerTableNewOffset_));
	}

	// void* hashModulePointerTableNew
	public PointerPointer hashModulePointerTableNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashModulePointerTableNewOffset_));
	}

	// void* hashPackageTableNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashPackageTableNewOffset_", declaredType="void*")
	public VoidPointer hashPackageTableNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashPackageTableNewOffset_));
	}

	// void* hashPackageTableNew
	public PointerPointer hashPackageTableNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashPackageTableNewOffset_));
	}

	// void* hashPkgTableAt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashPkgTableAtOffset_", declaredType="void*")
	public VoidPointer hashPkgTableAt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashPkgTableAtOffset_));
	}

	// void* hashPkgTableAt
	public PointerPointer hashPkgTableAtEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashPkgTableAtOffset_));
	}

	// void* hashPkgTableNextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashPkgTableNextDoOffset_", declaredType="void*")
	public VoidPointer hashPkgTableNextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashPkgTableNextDoOffset_));
	}

	// void* hashPkgTableNextDo
	public PointerPointer hashPkgTableNextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashPkgTableNextDoOffset_));
	}

	// void* hashPkgTableStartDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashPkgTableStartDoOffset_", declaredType="void*")
	public VoidPointer hashPkgTableStartDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._hashPkgTableStartDoOffset_));
	}

	// void* hashPkgTableStartDo
	public PointerPointer hashPkgTableStartDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._hashPkgTableStartDoOffset_));
	}

	// void* helperMultiANewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_helperMultiANewArrayOffset_", declaredType="void*")
	public VoidPointer helperMultiANewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._helperMultiANewArrayOffset_));
	}

	// void* helperMultiANewArray
	public PointerPointer helperMultiANewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._helperMultiANewArrayOffset_));
	}

	// void* illegalAccessMessage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_illegalAccessMessageOffset_", declaredType="void*")
	public VoidPointer illegalAccessMessage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._illegalAccessMessageOffset_));
	}

	// void* illegalAccessMessage
	public PointerPointer illegalAccessMessageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._illegalAccessMessageOffset_));
	}

	// void* initJVMRI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initJVMRIOffset_", declaredType="void*")
	public VoidPointer initJVMRI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initJVMRIOffset_));
	}

	// void* initJVMRI
	public PointerPointer initJVMRIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initJVMRIOffset_));
	}

	// void* initializeAttachedThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeAttachedThreadOffset_", declaredType="void*")
	public VoidPointer initializeAttachedThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeAttachedThreadOffset_));
	}

	// void* initializeAttachedThread
	public PointerPointer initializeAttachedThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeAttachedThreadOffset_));
	}

	// void* initializeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeClassOffset_", declaredType="void*")
	public VoidPointer initializeClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeClassOffset_));
	}

	// void* initializeClass
	public PointerPointer initializeClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeClassOffset_));
	}

	// void* initializeClassPath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeClassPathOffset_", declaredType="void*")
	public VoidPointer initializeClassPath() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeClassPathOffset_));
	}

	// void* initializeClassPath
	public PointerPointer initializeClassPathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeClassPathOffset_));
	}

	// void* initializeClassPathEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeClassPathEntryOffset_", declaredType="void*")
	public VoidPointer initializeClassPathEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeClassPathEntryOffset_));
	}

	// void* initializeClassPathEntry
	public PointerPointer initializeClassPathEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeClassPathEntryOffset_));
	}

	// void* initializeHeapOOMMessage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeHeapOOMMessageOffset_", declaredType="void*")
	public VoidPointer initializeHeapOOMMessage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeHeapOOMMessageOffset_));
	}

	// void* initializeHeapOOMMessage
	public PointerPointer initializeHeapOOMMessageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeHeapOOMMessageOffset_));
	}

	// void* initializeMethodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeMethodIDOffset_", declaredType="void*")
	public VoidPointer initializeMethodID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeMethodIDOffset_));
	}

	// void* initializeMethodID
	public PointerPointer initializeMethodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeMethodIDOffset_));
	}

	// void* initializeMethodRunAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeMethodRunAddressOffset_", declaredType="void*")
	public VoidPointer initializeMethodRunAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeMethodRunAddressOffset_));
	}

	// void* initializeMethodRunAddress
	public PointerPointer initializeMethodRunAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeMethodRunAddressOffset_));
	}

	// void* initializeMethodRunAddressNoHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeMethodRunAddressNoHookOffset_", declaredType="void*")
	public VoidPointer initializeMethodRunAddressNoHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeMethodRunAddressNoHookOffset_));
	}

	// void* initializeMethodRunAddressNoHook
	public PointerPointer initializeMethodRunAddressNoHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeMethodRunAddressNoHookOffset_));
	}

	// void* initializeNativeLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeNativeLibraryOffset_", declaredType="void*")
	public VoidPointer initializeNativeLibrary() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._initializeNativeLibraryOffset_));
	}

	// void* initializeNativeLibrary
	public PointerPointer initializeNativeLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._initializeNativeLibraryOffset_));
	}

	// void* instanceFieldOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceFieldOffsetOffset_", declaredType="void*")
	public VoidPointer instanceFieldOffset() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._instanceFieldOffsetOffset_));
	}

	// void* instanceFieldOffset
	public PointerPointer instanceFieldOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._instanceFieldOffsetOffset_));
	}

	// void* instanceOfOrCheckCast
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceOfOrCheckCastOffset_", declaredType="void*")
	public VoidPointer instanceOfOrCheckCast() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._instanceOfOrCheckCastOffset_));
	}

	// void* instanceOfOrCheckCast
	public PointerPointer instanceOfOrCheckCastEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._instanceOfOrCheckCastOffset_));
	}

	// void* internalAcquireVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAcquireVMAccessOffset_", declaredType="void*")
	public VoidPointer internalAcquireVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAcquireVMAccessOffset_));
	}

	// void* internalAcquireVMAccess
	public PointerPointer internalAcquireVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAcquireVMAccessOffset_));
	}

	// void* internalAcquireVMAccessClearStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAcquireVMAccessClearStatusOffset_", declaredType="void*")
	public VoidPointer internalAcquireVMAccessClearStatus() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAcquireVMAccessClearStatusOffset_));
	}

	// void* internalAcquireVMAccessClearStatus
	public PointerPointer internalAcquireVMAccessClearStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAcquireVMAccessClearStatusOffset_));
	}

	// void* internalAcquireVMAccessNoMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAcquireVMAccessNoMutexOffset_", declaredType="void*")
	public VoidPointer internalAcquireVMAccessNoMutex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAcquireVMAccessNoMutexOffset_));
	}

	// void* internalAcquireVMAccessNoMutex
	public PointerPointer internalAcquireVMAccessNoMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAcquireVMAccessNoMutexOffset_));
	}

	// void* internalAcquireVMAccessNoMutexWithMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAcquireVMAccessNoMutexWithMaskOffset_", declaredType="void*")
	public VoidPointer internalAcquireVMAccessNoMutexWithMask() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAcquireVMAccessNoMutexWithMaskOffset_));
	}

	// void* internalAcquireVMAccessNoMutexWithMask
	public PointerPointer internalAcquireVMAccessNoMutexWithMaskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAcquireVMAccessNoMutexWithMaskOffset_));
	}

	// void* internalAcquireVMAccessWithMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAcquireVMAccessWithMaskOffset_", declaredType="void*")
	public VoidPointer internalAcquireVMAccessWithMask() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAcquireVMAccessWithMaskOffset_));
	}

	// void* internalAcquireVMAccessWithMask
	public PointerPointer internalAcquireVMAccessWithMaskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAcquireVMAccessWithMaskOffset_));
	}

	// void* internalAllocateClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAllocateClassLoaderOffset_", declaredType="void*")
	public VoidPointer internalAllocateClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAllocateClassLoaderOffset_));
	}

	// void* internalAllocateClassLoader
	public PointerPointer internalAllocateClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAllocateClassLoaderOffset_));
	}

	// void* internalAttachCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAttachCurrentThreadOffset_", declaredType="void*")
	public VoidPointer internalAttachCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalAttachCurrentThreadOffset_));
	}

	// void* internalAttachCurrentThread
	public PointerPointer internalAttachCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalAttachCurrentThreadOffset_));
	}

	// void* internalCreateArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalCreateArrayClassOffset_", declaredType="void*")
	public VoidPointer internalCreateArrayClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalCreateArrayClassOffset_));
	}

	// void* internalCreateArrayClass
	public PointerPointer internalCreateArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalCreateArrayClassOffset_));
	}

	// void* internalCreateBaseTypePrimitiveAndArrayClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalCreateBaseTypePrimitiveAndArrayClassesOffset_", declaredType="void*")
	public VoidPointer internalCreateBaseTypePrimitiveAndArrayClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalCreateBaseTypePrimitiveAndArrayClassesOffset_));
	}

	// void* internalCreateBaseTypePrimitiveAndArrayClasses
	public PointerPointer internalCreateBaseTypePrimitiveAndArrayClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalCreateBaseTypePrimitiveAndArrayClassesOffset_));
	}

	// void* internalCreateRAMClassFromROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalCreateRAMClassFromROMClassOffset_", declaredType="void*")
	public VoidPointer internalCreateRAMClassFromROMClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalCreateRAMClassFromROMClassOffset_));
	}

	// void* internalCreateRAMClassFromROMClass
	public PointerPointer internalCreateRAMClassFromROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalCreateRAMClassFromROMClassOffset_));
	}

	// void* internalEnterVMFromJNI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalEnterVMFromJNIOffset_", declaredType="void*")
	public VoidPointer internalEnterVMFromJNI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalEnterVMFromJNIOffset_));
	}

	// void* internalEnterVMFromJNI
	public PointerPointer internalEnterVMFromJNIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalEnterVMFromJNIOffset_));
	}

	// void* internalExceptionDescribe
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalExceptionDescribeOffset_", declaredType="void*")
	public VoidPointer internalExceptionDescribe() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalExceptionDescribeOffset_));
	}

	// void* internalExceptionDescribe
	public PointerPointer internalExceptionDescribeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalExceptionDescribeOffset_));
	}

	// void* internalExitVMToJNI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalExitVMToJNIOffset_", declaredType="void*")
	public VoidPointer internalExitVMToJNI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalExitVMToJNIOffset_));
	}

	// void* internalExitVMToJNI
	public PointerPointer internalExitVMToJNIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalExitVMToJNIOffset_));
	}

	// void* internalFindClassInModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalFindClassInModuleOffset_", declaredType="void*")
	public VoidPointer internalFindClassInModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalFindClassInModuleOffset_));
	}

	// void* internalFindClassInModule
	public PointerPointer internalFindClassInModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalFindClassInModuleOffset_));
	}

	// void* internalFindClassString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalFindClassStringOffset_", declaredType="void*")
	public VoidPointer internalFindClassString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalFindClassStringOffset_));
	}

	// void* internalFindClassString
	public PointerPointer internalFindClassStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalFindClassStringOffset_));
	}

	// void* internalFindClassUTF8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalFindClassUTF8Offset_", declaredType="void*")
	public VoidPointer internalFindClassUTF8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalFindClassUTF8Offset_));
	}

	// void* internalFindClassUTF8
	public PointerPointer internalFindClassUTF8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalFindClassUTF8Offset_));
	}

	// void* internalFindKnownClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalFindKnownClassOffset_", declaredType="void*")
	public VoidPointer internalFindKnownClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalFindKnownClassOffset_));
	}

	// void* internalFindKnownClass
	public PointerPointer internalFindKnownClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalFindKnownClassOffset_));
	}

	// void* internalReleaseVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalReleaseVMAccessOffset_", declaredType="void*")
	public VoidPointer internalReleaseVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalReleaseVMAccessOffset_));
	}

	// void* internalReleaseVMAccess
	public PointerPointer internalReleaseVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalReleaseVMAccessOffset_));
	}

	// void* internalReleaseVMAccessNoMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalReleaseVMAccessNoMutexOffset_", declaredType="void*")
	public VoidPointer internalReleaseVMAccessNoMutex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalReleaseVMAccessNoMutexOffset_));
	}

	// void* internalReleaseVMAccessNoMutex
	public PointerPointer internalReleaseVMAccessNoMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalReleaseVMAccessNoMutexOffset_));
	}

	// void* internalReleaseVMAccessSetStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalReleaseVMAccessSetStatusOffset_", declaredType="void*")
	public VoidPointer internalReleaseVMAccessSetStatus() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalReleaseVMAccessSetStatusOffset_));
	}

	// void* internalReleaseVMAccessSetStatus
	public PointerPointer internalReleaseVMAccessSetStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalReleaseVMAccessSetStatusOffset_));
	}

	// void* internalRunPreInitInstructions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalRunPreInitInstructionsOffset_", declaredType="void*")
	public VoidPointer internalRunPreInitInstructions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalRunPreInitInstructionsOffset_));
	}

	// void* internalRunPreInitInstructions
	public PointerPointer internalRunPreInitInstructionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalRunPreInitInstructionsOffset_));
	}

	// void* internalSendExceptionConstructor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalSendExceptionConstructorOffset_", declaredType="void*")
	public VoidPointer internalSendExceptionConstructor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalSendExceptionConstructorOffset_));
	}

	// void* internalSendExceptionConstructor
	public PointerPointer internalSendExceptionConstructorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalSendExceptionConstructorOffset_));
	}

	// void* internalTryAcquireVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalTryAcquireVMAccessOffset_", declaredType="void*")
	public VoidPointer internalTryAcquireVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalTryAcquireVMAccessOffset_));
	}

	// void* internalTryAcquireVMAccess
	public PointerPointer internalTryAcquireVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalTryAcquireVMAccessOffset_));
	}

	// void* internalTryAcquireVMAccessWithMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalTryAcquireVMAccessWithMaskOffset_", declaredType="void*")
	public VoidPointer internalTryAcquireVMAccessWithMask() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._internalTryAcquireVMAccessWithMaskOffset_));
	}

	// void* internalTryAcquireVMAccessWithMask
	public PointerPointer internalTryAcquireVMAccessWithMaskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._internalTryAcquireVMAccessWithMaskOffset_));
	}

	// void* invalidJITReturnAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_invalidJITReturnAddressOffset_", declaredType="void*")
	public VoidPointer invalidJITReturnAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._invalidJITReturnAddressOffset_));
	}

	// void* invalidJITReturnAddress
	public PointerPointer invalidJITReturnAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._invalidJITReturnAddressOffset_));
	}

	// void* isAnyClassLoadedFromPackage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isAnyClassLoadedFromPackageOffset_", declaredType="void*")
	public VoidPointer isAnyClassLoadedFromPackage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._isAnyClassLoadedFromPackageOffset_));
	}

	// void* isAnyClassLoadedFromPackage
	public PointerPointer isAnyClassLoadedFromPackageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._isAnyClassLoadedFromPackageOffset_));
	}

	// void* isClassRefQtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isClassRefQtypeOffset_", declaredType="void*")
	public VoidPointer isClassRefQtype() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._isClassRefQtypeOffset_));
	}

	// void* isClassRefQtype
	public PointerPointer isClassRefQtypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._isClassRefQtypeOffset_));
	}

	// void* isExceptionTypeCaughtByHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isExceptionTypeCaughtByHandlerOffset_", declaredType="void*")
	public VoidPointer isExceptionTypeCaughtByHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._isExceptionTypeCaughtByHandlerOffset_));
	}

	// void* isExceptionTypeCaughtByHandler
	public PointerPointer isExceptionTypeCaughtByHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._isExceptionTypeCaughtByHandlerOffset_));
	}

	// void* isFlattenableFieldFlattened
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isFlattenableFieldFlattenedOffset_", declaredType="void*")
	public VoidPointer isFlattenableFieldFlattened() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._isFlattenableFieldFlattenedOffset_));
	}

	// void* isFlattenableFieldFlattened
	public PointerPointer isFlattenableFieldFlattenedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._isFlattenableFieldFlattenedOffset_));
	}

	// void* isNameOrSignatureQtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isNameOrSignatureQtypeOffset_", declaredType="void*")
	public VoidPointer isNameOrSignatureQtype() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._isNameOrSignatureQtypeOffset_));
	}

	// void* isNameOrSignatureQtype
	public PointerPointer isNameOrSignatureQtypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._isNameOrSignatureQtypeOffset_));
	}

	// void* iterateStackTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iterateStackTraceOffset_", declaredType="void*")
	public VoidPointer iterateStackTrace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._iterateStackTraceOffset_));
	}

	// void* iterateStackTrace
	public PointerPointer iterateStackTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._iterateStackTraceOffset_));
	}

	// void* j9jni_createGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9jni_createGlobalRefOffset_", declaredType="void*")
	public VoidPointer j9jni_createGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9jni_createGlobalRefOffset_));
	}

	// void* j9jni_createGlobalRef
	public PointerPointer j9jni_createGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9jni_createGlobalRefOffset_));
	}

	// void* j9jni_createLocalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9jni_createLocalRefOffset_", declaredType="void*")
	public VoidPointer j9jni_createLocalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9jni_createLocalRefOffset_));
	}

	// void* j9jni_createLocalRef
	public PointerPointer j9jni_createLocalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9jni_createLocalRefOffset_));
	}

	// void* j9jni_deleteGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9jni_deleteGlobalRefOffset_", declaredType="void*")
	public VoidPointer j9jni_deleteGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9jni_deleteGlobalRefOffset_));
	}

	// void* j9jni_deleteGlobalRef
	public PointerPointer j9jni_deleteGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9jni_deleteGlobalRefOffset_));
	}

	// void* j9jni_deleteLocalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9jni_deleteLocalRefOffset_", declaredType="void*")
	public VoidPointer j9jni_deleteLocalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9jni_deleteLocalRefOffset_));
	}

	// void* j9jni_deleteLocalRef
	public PointerPointer j9jni_deleteLocalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9jni_deleteLocalRefOffset_));
	}

	// void* j9localmap_LocalBitsForPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9localmap_LocalBitsForPCOffset_", declaredType="void*")
	public VoidPointer j9localmap_LocalBitsForPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9localmap_LocalBitsForPCOffset_));
	}

	// void* j9localmap_LocalBitsForPC
	public PointerPointer j9localmap_LocalBitsForPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9localmap_LocalBitsForPCOffset_));
	}

	// void* j9stackmap_StackBitsForPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9stackmap_StackBitsForPCOffset_", declaredType="void*")
	public VoidPointer j9stackmap_StackBitsForPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._j9stackmap_StackBitsForPCOffset_));
	}

	// void* j9stackmap_StackBitsForPC
	public PointerPointer j9stackmap_StackBitsForPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._j9stackmap_StackBitsForPCOffset_));
	}

	// void* javaCheckAsyncMessages
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaCheckAsyncMessagesOffset_", declaredType="void*")
	public VoidPointer javaCheckAsyncMessages() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._javaCheckAsyncMessagesOffset_));
	}

	// void* javaCheckAsyncMessages
	public PointerPointer javaCheckAsyncMessagesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._javaCheckAsyncMessagesOffset_));
	}

	// void* javaLookupMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaLookupMethodOffset_", declaredType="void*")
	public VoidPointer javaLookupMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._javaLookupMethodOffset_));
	}

	// void* javaLookupMethod
	public PointerPointer javaLookupMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._javaLookupMethodOffset_));
	}

	// void* javaLookupMethodImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaLookupMethodImplOffset_", declaredType="void*")
	public VoidPointer javaLookupMethodImpl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._javaLookupMethodImplOffset_));
	}

	// void* javaLookupMethodImpl
	public PointerPointer javaLookupMethodImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._javaLookupMethodImplOffset_));
	}

	// void* javaThreadProc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaThreadProcOffset_", declaredType="void*")
	public VoidPointer javaThreadProc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._javaThreadProcOffset_));
	}

	// void* javaThreadProc
	public PointerPointer javaThreadProcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._javaThreadProcOffset_));
	}

	// void* jitFillOSRBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitFillOSRBufferOffset_", declaredType="void*")
	public VoidPointer jitFillOSRBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jitFillOSRBufferOffset_));
	}

	// void* jitFillOSRBuffer
	public PointerPointer jitFillOSRBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jitFillOSRBufferOffset_));
	}

	// void* jniArrayAllocateMemoryFromThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniArrayAllocateMemoryFromThreadOffset_", declaredType="void*")
	public VoidPointer jniArrayAllocateMemoryFromThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniArrayAllocateMemoryFromThreadOffset_));
	}

	// void* jniArrayAllocateMemoryFromThread
	public PointerPointer jniArrayAllocateMemoryFromThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniArrayAllocateMemoryFromThreadOffset_));
	}

	// void* jniArrayFreeMemoryFromThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniArrayFreeMemoryFromThreadOffset_", declaredType="void*")
	public VoidPointer jniArrayFreeMemoryFromThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniArrayFreeMemoryFromThreadOffset_));
	}

	// void* jniArrayFreeMemoryFromThread
	public PointerPointer jniArrayFreeMemoryFromThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniArrayFreeMemoryFromThreadOffset_));
	}

	// void* jniIsInternalClassRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniIsInternalClassRefOffset_", declaredType="void*")
	public VoidPointer jniIsInternalClassRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniIsInternalClassRefOffset_));
	}

	// void* jniIsInternalClassRef
	public PointerPointer jniIsInternalClassRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniIsInternalClassRefOffset_));
	}

	// void* jniNativeMethodProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniNativeMethodPropertiesOffset_", declaredType="void*")
	public VoidPointer jniNativeMethodProperties() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniNativeMethodPropertiesOffset_));
	}

	// void* jniNativeMethodProperties
	public PointerPointer jniNativeMethodPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniNativeMethodPropertiesOffset_));
	}

	// void* jniPopFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniPopFrameOffset_", declaredType="void*")
	public VoidPointer jniPopFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniPopFrameOffset_));
	}

	// void* jniPopFrame
	public PointerPointer jniPopFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniPopFrameOffset_));
	}

	// void* jniResetStackReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniResetStackReferencesOffset_", declaredType="void*")
	public VoidPointer jniResetStackReferences() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniResetStackReferencesOffset_));
	}

	// void* jniResetStackReferences
	public PointerPointer jniResetStackReferencesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniResetStackReferencesOffset_));
	}

	// void* jniVersionIsValid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniVersionIsValidOffset_", declaredType="void*")
	public VoidPointer jniVersionIsValid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jniVersionIsValidOffset_));
	}

	// void* jniVersionIsValid
	public PointerPointer jniVersionIsValidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jniVersionIsValidOffset_));
	}

	// void* jvmPhaseChange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmPhaseChangeOffset_", declaredType="void*")
	public VoidPointer jvmPhaseChange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._jvmPhaseChangeOffset_));
	}

	// void* jvmPhaseChange
	public PointerPointer jvmPhaseChangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._jvmPhaseChangeOffset_));
	}

	// void* loadAndVerifyNestHost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadAndVerifyNestHostOffset_", declaredType="void*")
	public VoidPointer loadAndVerifyNestHost() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._loadAndVerifyNestHostOffset_));
	}

	// void* loadAndVerifyNestHost
	public PointerPointer loadAndVerifyNestHostEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._loadAndVerifyNestHostOffset_));
	}

	// void* loadFlattenableArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadFlattenableArrayElementOffset_", declaredType="void*")
	public VoidPointer loadFlattenableArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._loadFlattenableArrayElementOffset_));
	}

	// void* loadFlattenableArrayElement
	public PointerPointer loadFlattenableArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._loadFlattenableArrayElementOffset_));
	}

	// void* loadJ9DLL
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadJ9DLLOffset_", declaredType="void*")
	public VoidPointer loadJ9DLL() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._loadJ9DLLOffset_));
	}

	// void* loadJ9DLL
	public PointerPointer loadJ9DLLEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._loadJ9DLLOffset_));
	}

	// void* monitorTableAt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorTableAtOffset_", declaredType="void*")
	public VoidPointer monitorTableAt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._monitorTableAtOffset_));
	}

	// void* monitorTableAt
	public PointerPointer monitorTableAtEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._monitorTableAtOffset_));
	}

	// void* monitorWaitImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorWaitImplOffset_", declaredType="void*")
	public VoidPointer monitorWaitImpl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._monitorWaitImplOffset_));
	}

	// void* monitorWaitImpl
	public PointerPointer monitorWaitImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._monitorWaitImplOffset_));
	}

	// void* mustHaveVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mustHaveVMAccessOffset_", declaredType="void*")
	public VoidPointer mustHaveVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._mustHaveVMAccessOffset_));
	}

	// void* mustHaveVMAccess
	public PointerPointer mustHaveVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._mustHaveVMAccessOffset_));
	}

	// void* objectIsBeingWaitedOn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectIsBeingWaitedOnOffset_", declaredType="void*")
	public VoidPointer objectIsBeingWaitedOn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectIsBeingWaitedOnOffset_));
	}

	// void* objectIsBeingWaitedOn
	public PointerPointer objectIsBeingWaitedOnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectIsBeingWaitedOnOffset_));
	}

	// void* objectMonitorDestroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorDestroyOffset_", declaredType="void*")
	public VoidPointer objectMonitorDestroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorDestroyOffset_));
	}

	// void* objectMonitorDestroy
	public PointerPointer objectMonitorDestroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorDestroyOffset_));
	}

	// void* objectMonitorDestroyComplete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorDestroyCompleteOffset_", declaredType="void*")
	public VoidPointer objectMonitorDestroyComplete() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorDestroyCompleteOffset_));
	}

	// void* objectMonitorDestroyComplete
	public PointerPointer objectMonitorDestroyCompleteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorDestroyCompleteOffset_));
	}

	// void* objectMonitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorEnterOffset_", declaredType="void*")
	public VoidPointer objectMonitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorEnterOffset_));
	}

	// void* objectMonitorEnter
	public PointerPointer objectMonitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorEnterOffset_));
	}

	// void* objectMonitorEnterBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorEnterBlockingOffset_", declaredType="void*")
	public VoidPointer objectMonitorEnterBlocking() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorEnterBlockingOffset_));
	}

	// void* objectMonitorEnterBlocking
	public PointerPointer objectMonitorEnterBlockingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorEnterBlockingOffset_));
	}

	// void* objectMonitorEnterNonBlocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorEnterNonBlockingOffset_", declaredType="void*")
	public VoidPointer objectMonitorEnterNonBlocking() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorEnterNonBlockingOffset_));
	}

	// void* objectMonitorEnterNonBlocking
	public PointerPointer objectMonitorEnterNonBlockingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorEnterNonBlockingOffset_));
	}

	// void* objectMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorExitOffset_", declaredType="void*")
	public VoidPointer objectMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorExitOffset_));
	}

	// void* objectMonitorExit
	public PointerPointer objectMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorExitOffset_));
	}

	// void* objectMonitorInflate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectMonitorInflateOffset_", declaredType="void*")
	public VoidPointer objectMonitorInflate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._objectMonitorInflateOffset_));
	}

	// void* objectMonitorInflate
	public PointerPointer objectMonitorInflateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._objectMonitorInflateOffset_));
	}

	// void* optionValueOperations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionValueOperationsOffset_", declaredType="void*")
	public VoidPointer optionValueOperations() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._optionValueOperationsOffset_));
	}

	// void* optionValueOperations
	public PointerPointer optionValueOperationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._optionValueOperationsOffset_));
	}

	// void* peekClassHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peekClassHashTableOffset_", declaredType="void*")
	public VoidPointer peekClassHashTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._peekClassHashTableOffset_));
	}

	// void* peekClassHashTable
	public PointerPointer peekClassHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._peekClassHashTableOffset_));
	}

	// void* postInitLoadJ9DLL
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postInitLoadJ9DLLOffset_", declaredType="void*")
	public VoidPointer postInitLoadJ9DLL() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._postInitLoadJ9DLLOffset_));
	}

	// void* postInitLoadJ9DLL
	public PointerPointer postInitLoadJ9DLLEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._postInitLoadJ9DLLOffset_));
	}

	// void* prepareClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prepareClassOffset_", declaredType="void*")
	public VoidPointer prepareClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._prepareClassOffset_));
	}

	// void* prepareClass
	public PointerPointer prepareClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._prepareClassOffset_));
	}

	// void* prepareForExceptionThrow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prepareForExceptionThrowOffset_", declaredType="void*")
	public VoidPointer prepareForExceptionThrow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._prepareForExceptionThrowOffset_));
	}

	// void* prepareForExceptionThrow
	public PointerPointer prepareForExceptionThrowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._prepareForExceptionThrowOffset_));
	}

	// void* printThreadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printThreadInfoOffset_", declaredType="void*")
	public VoidPointer printThreadInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._printThreadInfoOffset_));
	}

	// void* printThreadInfo
	public PointerPointer printThreadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._printThreadInfoOffset_));
	}

	// void* putFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_putFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer putFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._putFlattenableFieldOffset_));
	}

	// void* putFlattenableField
	public PointerPointer putFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._putFlattenableFieldOffset_));
	}

	// void* queryLogOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queryLogOptionsOffset_", declaredType="void*")
	public VoidPointer queryLogOptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._queryLogOptionsOffset_));
	}

	// void* queryLogOptions
	public PointerPointer queryLogOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._queryLogOptionsOffset_));
	}

	// void* rasSetServiceLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rasSetServiceLevelOffset_", declaredType="void*")
	public VoidPointer rasSetServiceLevel() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._rasSetServiceLevelOffset_));
	}

	// void* rasSetServiceLevel
	public PointerPointer rasSetServiceLevelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._rasSetServiceLevelOffset_));
	}

	// void* rasStartDeferredThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rasStartDeferredThreadsOffset_", declaredType="void*")
	public VoidPointer rasStartDeferredThreads() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._rasStartDeferredThreadsOffset_));
	}

	// void* rasStartDeferredThreads
	public PointerPointer rasStartDeferredThreadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._rasStartDeferredThreadsOffset_));
	}

	// void* registerBootstrapLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerBootstrapLibraryOffset_", declaredType="void*")
	public VoidPointer registerBootstrapLibrary() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._registerBootstrapLibraryOffset_));
	}

	// void* registerBootstrapLibrary
	public PointerPointer registerBootstrapLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._registerBootstrapLibraryOffset_));
	}

	// void* registerNativeLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerNativeLibraryOffset_", declaredType="void*")
	public VoidPointer registerNativeLibrary() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._registerNativeLibraryOffset_));
	}

	// void* registerNativeLibrary
	public PointerPointer registerNativeLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._registerNativeLibraryOffset_));
	}

	// void* registerOSHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerOSHandlerOffset_", declaredType="void*")
	public VoidPointer registerOSHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._registerOSHandlerOffset_));
	}

	// void* registerOSHandler
	public PointerPointer registerOSHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._registerOSHandlerOffset_));
	}

	// void* registerPredefinedHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerPredefinedHandlerOffset_", declaredType="void*")
	public VoidPointer registerPredefinedHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._registerPredefinedHandlerOffset_));
	}

	// void* registerPredefinedHandler
	public PointerPointer registerPredefinedHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._registerPredefinedHandlerOffset_));
	}

	// void* releaseExclusiveVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_releaseExclusiveVMAccessOffset_", declaredType="void*")
	public VoidPointer releaseExclusiveVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._releaseExclusiveVMAccessOffset_));
	}

	// void* releaseExclusiveVMAccess
	public PointerPointer releaseExclusiveVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._releaseExclusiveVMAccessOffset_));
	}

	// void* releaseExclusiveVMAccessFromExternalThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_releaseExclusiveVMAccessFromExternalThreadOffset_", declaredType="void*")
	public VoidPointer releaseExclusiveVMAccessFromExternalThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._releaseExclusiveVMAccessFromExternalThreadOffset_));
	}

	// void* releaseExclusiveVMAccessFromExternalThread
	public PointerPointer releaseExclusiveVMAccessFromExternalThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._releaseExclusiveVMAccessFromExternalThreadOffset_));
	}

	// void* releaseExclusiveVMAccessMetronome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_releaseExclusiveVMAccessMetronomeOffset_", declaredType="void*")
	public VoidPointer releaseExclusiveVMAccessMetronome() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._releaseExclusiveVMAccessMetronomeOffset_));
	}

	// void* releaseExclusiveVMAccessMetronome
	public PointerPointer releaseExclusiveVMAccessMetronomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._releaseExclusiveVMAccessMetronomeOffset_));
	}

	// void* releaseSafePointVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_releaseSafePointVMAccessOffset_", declaredType="void*")
	public VoidPointer releaseSafePointVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._releaseSafePointVMAccessOffset_));
	}

	// void* releaseSafePointVMAccess
	public PointerPointer releaseSafePointVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._releaseSafePointVMAccessOffset_));
	}

	// void* reportHotField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reportHotFieldOffset_", declaredType="void*")
	public VoidPointer reportHotField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._reportHotFieldOffset_));
	}

	// void* reportHotField
	public PointerPointer reportHotFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._reportHotFieldOffset_));
	}

	// void* requestExclusiveVMAccessMetronome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requestExclusiveVMAccessMetronomeOffset_", declaredType="void*")
	public VoidPointer requestExclusiveVMAccessMetronome() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._requestExclusiveVMAccessMetronomeOffset_));
	}

	// void* requestExclusiveVMAccessMetronome
	public PointerPointer requestExclusiveVMAccessMetronomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._requestExclusiveVMAccessMetronomeOffset_));
	}

	// void* requestExclusiveVMAccessMetronomeTemp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requestExclusiveVMAccessMetronomeTempOffset_", declaredType="void*")
	public VoidPointer requestExclusiveVMAccessMetronomeTemp() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._requestExclusiveVMAccessMetronomeTempOffset_));
	}

	// void* requestExclusiveVMAccessMetronomeTemp
	public PointerPointer requestExclusiveVMAccessMetronomeTempEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._requestExclusiveVMAccessMetronomeTempOffset_));
	}

	// void* reserved0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved0Offset_", declaredType="void*")
	public VoidPointer reserved0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._reserved0Offset_));
	}

	// void* reserved0
	public PointerPointer reserved0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._reserved0Offset_));
	}

	// void* reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="void*")
	public VoidPointer reserved1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._reserved1Offset_));
	}

	// void* reserved1
	public PointerPointer reserved1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._reserved1Offset_));
	}

	// void* reserved2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2Offset_", declaredType="void*")
	public VoidPointer reserved2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._reserved2Offset_));
	}

	// void* reserved2
	public PointerPointer reserved2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._reserved2Offset_));
	}

	// void* resolveClassRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveClassRefOffset_", declaredType="void*")
	public VoidPointer resolveClassRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveClassRefOffset_));
	}

	// void* resolveClassRef
	public PointerPointer resolveClassRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveClassRefOffset_));
	}

	// void* resolveConstantDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveConstantDynamicOffset_", declaredType="void*")
	public VoidPointer resolveConstantDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveConstantDynamicOffset_));
	}

	// void* resolveConstantDynamic
	public PointerPointer resolveConstantDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveConstantDynamicOffset_));
	}

	// void* resolveInstanceFieldRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveInstanceFieldRefOffset_", declaredType="void*")
	public VoidPointer resolveInstanceFieldRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveInstanceFieldRefOffset_));
	}

	// void* resolveInstanceFieldRef
	public PointerPointer resolveInstanceFieldRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveInstanceFieldRefOffset_));
	}

	// void* resolveInstanceFieldRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveInstanceFieldRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveInstanceFieldRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveInstanceFieldRefIntoOffset_));
	}

	// void* resolveInstanceFieldRefInto
	public PointerPointer resolveInstanceFieldRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveInstanceFieldRefIntoOffset_));
	}

	// void* resolveInterfaceMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveInterfaceMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveInterfaceMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveInterfaceMethodRefOffset_));
	}

	// void* resolveInterfaceMethodRef
	public PointerPointer resolveInterfaceMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveInterfaceMethodRefOffset_));
	}

	// void* resolveInterfaceMethodRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveInterfaceMethodRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveInterfaceMethodRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveInterfaceMethodRefIntoOffset_));
	}

	// void* resolveInterfaceMethodRefInto
	public PointerPointer resolveInterfaceMethodRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveInterfaceMethodRefIntoOffset_));
	}

	// void* resolveInvokeDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveInvokeDynamicOffset_", declaredType="void*")
	public VoidPointer resolveInvokeDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveInvokeDynamicOffset_));
	}

	// void* resolveInvokeDynamic
	public PointerPointer resolveInvokeDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveInvokeDynamicOffset_));
	}

	// void* resolveKnownClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveKnownClassOffset_", declaredType="void*")
	public VoidPointer resolveKnownClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveKnownClassOffset_));
	}

	// void* resolveKnownClass
	public PointerPointer resolveKnownClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveKnownClassOffset_));
	}

	// void* resolveMethodHandleRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveMethodHandleRefOffset_", declaredType="void*")
	public VoidPointer resolveMethodHandleRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveMethodHandleRefOffset_));
	}

	// void* resolveMethodHandleRef
	public PointerPointer resolveMethodHandleRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveMethodHandleRefOffset_));
	}

	// void* resolveMethodTypeRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveMethodTypeRefOffset_", declaredType="void*")
	public VoidPointer resolveMethodTypeRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveMethodTypeRefOffset_));
	}

	// void* resolveMethodTypeRef
	public PointerPointer resolveMethodTypeRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveMethodTypeRefOffset_));
	}

	// void* resolveNativeAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveNativeAddressOffset_", declaredType="void*")
	public VoidPointer resolveNativeAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveNativeAddressOffset_));
	}

	// void* resolveNativeAddress
	public PointerPointer resolveNativeAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveNativeAddressOffset_));
	}

	// void* resolveOpenJDKInvokeHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveOpenJDKInvokeHandleOffset_", declaredType="void*")
	public VoidPointer resolveOpenJDKInvokeHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveOpenJDKInvokeHandleOffset_));
	}

	// void* resolveOpenJDKInvokeHandle
	public PointerPointer resolveOpenJDKInvokeHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveOpenJDKInvokeHandleOffset_));
	}

	// void* resolveSpecialMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveSpecialMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveSpecialMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveSpecialMethodRefOffset_));
	}

	// void* resolveSpecialMethodRef
	public PointerPointer resolveSpecialMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveSpecialMethodRefOffset_));
	}

	// void* resolveSpecialMethodRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveSpecialMethodRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveSpecialMethodRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveSpecialMethodRefIntoOffset_));
	}

	// void* resolveSpecialMethodRefInto
	public PointerPointer resolveSpecialMethodRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveSpecialMethodRefIntoOffset_));
	}

	// void* resolveSpecialSplitMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveSpecialSplitMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveSpecialSplitMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveSpecialSplitMethodRefOffset_));
	}

	// void* resolveSpecialSplitMethodRef
	public PointerPointer resolveSpecialSplitMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveSpecialSplitMethodRefOffset_));
	}

	// void* resolveStaticFieldRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStaticFieldRefOffset_", declaredType="void*")
	public VoidPointer resolveStaticFieldRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStaticFieldRefOffset_));
	}

	// void* resolveStaticFieldRef
	public PointerPointer resolveStaticFieldRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStaticFieldRefOffset_));
	}

	// void* resolveStaticFieldRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStaticFieldRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveStaticFieldRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStaticFieldRefIntoOffset_));
	}

	// void* resolveStaticFieldRefInto
	public PointerPointer resolveStaticFieldRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStaticFieldRefIntoOffset_));
	}

	// void* resolveStaticMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStaticMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveStaticMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStaticMethodRefOffset_));
	}

	// void* resolveStaticMethodRef
	public PointerPointer resolveStaticMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStaticMethodRefOffset_));
	}

	// void* resolveStaticMethodRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStaticMethodRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveStaticMethodRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStaticMethodRefIntoOffset_));
	}

	// void* resolveStaticMethodRefInto
	public PointerPointer resolveStaticMethodRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStaticMethodRefIntoOffset_));
	}

	// void* resolveStaticSplitMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStaticSplitMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveStaticSplitMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStaticSplitMethodRefOffset_));
	}

	// void* resolveStaticSplitMethodRef
	public PointerPointer resolveStaticSplitMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStaticSplitMethodRefOffset_));
	}

	// void* resolveStringRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveStringRefOffset_", declaredType="void*")
	public VoidPointer resolveStringRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveStringRefOffset_));
	}

	// void* resolveStringRef
	public PointerPointer resolveStringRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveStringRefOffset_));
	}

	// void* resolveVirtualMethodRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveVirtualMethodRefOffset_", declaredType="void*")
	public VoidPointer resolveVirtualMethodRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveVirtualMethodRefOffset_));
	}

	// void* resolveVirtualMethodRef
	public PointerPointer resolveVirtualMethodRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveVirtualMethodRefOffset_));
	}

	// void* resolveVirtualMethodRefInto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveVirtualMethodRefIntoOffset_", declaredType="void*")
	public VoidPointer resolveVirtualMethodRefInto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resolveVirtualMethodRefIntoOffset_));
	}

	// void* resolveVirtualMethodRefInto
	public PointerPointer resolveVirtualMethodRefIntoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resolveVirtualMethodRefIntoOffset_));
	}

	// void* resumeThreadForInspection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resumeThreadForInspectionOffset_", declaredType="void*")
	public VoidPointer resumeThreadForInspection() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._resumeThreadForInspectionOffset_));
	}

	// void* resumeThreadForInspection
	public PointerPointer resumeThreadForInspectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._resumeThreadForInspectionOffset_));
	}

	// void* returnFromJNI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnFromJNIOffset_", declaredType="void*")
	public VoidPointer returnFromJNI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._returnFromJNIOffset_));
	}

	// void* returnFromJNI
	public PointerPointer returnFromJNIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._returnFromJNIOffset_));
	}

	// void* romClassLoadFromCookie
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassLoadFromCookieOffset_", declaredType="void*")
	public VoidPointer romClassLoadFromCookie() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._romClassLoadFromCookieOffset_));
	}

	// void* romClassLoadFromCookie
	public PointerPointer romClassLoadFromCookieEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._romClassLoadFromCookieOffset_));
	}

	// void* romImageNewSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romImageNewSegmentOffset_", declaredType="void*")
	public VoidPointer romImageNewSegment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._romImageNewSegmentOffset_));
	}

	// void* romImageNewSegment
	public PointerPointer romImageNewSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._romImageNewSegmentOffset_));
	}

	// void* runCallInMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runCallInMethodOffset_", declaredType="void*")
	public VoidPointer runCallInMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._runCallInMethodOffset_));
	}

	// void* runCallInMethod
	public PointerPointer runCallInMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._runCallInMethodOffset_));
	}

	// void* runJVMOnLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runJVMOnLoadOffset_", declaredType="void*")
	public VoidPointer runJVMOnLoad() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._runJVMOnLoadOffset_));
	}

	// void* runJVMOnLoad
	public PointerPointer runJVMOnLoadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._runJVMOnLoadOffset_));
	}

	// void* searchClassForMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_searchClassForMethodOffset_", declaredType="void*")
	public VoidPointer searchClassForMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._searchClassForMethodOffset_));
	}

	// void* searchClassForMethod
	public PointerPointer searchClassForMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._searchClassForMethodOffset_));
	}

	// void* sendClinit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendClinitOffset_", declaredType="void*")
	public VoidPointer sendClinit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendClinitOffset_));
	}

	// void* sendClinit
	public PointerPointer sendClinitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendClinitOffset_));
	}

	// void* sendCompleteInitialization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendCompleteInitializationOffset_", declaredType="void*")
	public VoidPointer sendCompleteInitialization() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendCompleteInitializationOffset_));
	}

	// void* sendCompleteInitialization
	public PointerPointer sendCompleteInitializationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendCompleteInitializationOffset_));
	}

	// void* sendForGenericInvoke
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendForGenericInvokeOffset_", declaredType="void*")
	public VoidPointer sendForGenericInvoke() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendForGenericInvokeOffset_));
	}

	// void* sendForGenericInvoke
	public PointerPointer sendForGenericInvokeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendForGenericInvokeOffset_));
	}

	// void* sendFromMethodDescriptorString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendFromMethodDescriptorStringOffset_", declaredType="void*")
	public VoidPointer sendFromMethodDescriptorString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendFromMethodDescriptorStringOffset_));
	}

	// void* sendFromMethodDescriptorString
	public PointerPointer sendFromMethodDescriptorStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendFromMethodDescriptorStringOffset_));
	}

	// void* sendInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendInitOffset_", declaredType="void*")
	public VoidPointer sendInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendInitOffset_));
	}

	// void* sendInit
	public PointerPointer sendInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendInitOffset_));
	}

	// void* sendResolveConstantDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendResolveConstantDynamicOffset_", declaredType="void*")
	public VoidPointer sendResolveConstantDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendResolveConstantDynamicOffset_));
	}

	// void* sendResolveConstantDynamic
	public PointerPointer sendResolveConstantDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendResolveConstantDynamicOffset_));
	}

	// void* sendResolveInvokeDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendResolveInvokeDynamicOffset_", declaredType="void*")
	public VoidPointer sendResolveInvokeDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendResolveInvokeDynamicOffset_));
	}

	// void* sendResolveInvokeDynamic
	public PointerPointer sendResolveInvokeDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendResolveInvokeDynamicOffset_));
	}

	// void* sendResolveMethodHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendResolveMethodHandleOffset_", declaredType="void*")
	public VoidPointer sendResolveMethodHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendResolveMethodHandleOffset_));
	}

	// void* sendResolveMethodHandle
	public PointerPointer sendResolveMethodHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendResolveMethodHandleOffset_));
	}

	// void* sendResolveOpenJDKInvokeHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendResolveOpenJDKInvokeHandleOffset_", declaredType="void*")
	public VoidPointer sendResolveOpenJDKInvokeHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sendResolveOpenJDKInvokeHandleOffset_));
	}

	// void* sendResolveOpenJDKInvokeHandle
	public PointerPointer sendResolveOpenJDKInvokeHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sendResolveOpenJDKInvokeHandleOffset_));
	}

	// void* setBootLoaderModulePatchPaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setBootLoaderModulePatchPathsOffset_", declaredType="void*")
	public VoidPointer setBootLoaderModulePatchPaths() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setBootLoaderModulePatchPathsOffset_));
	}

	// void* setBootLoaderModulePatchPaths
	public PointerPointer setBootLoaderModulePatchPathsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setBootLoaderModulePatchPathsOffset_));
	}

	// void* setClassCastException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setClassCastExceptionOffset_", declaredType="void*")
	public VoidPointer setClassCastException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setClassCastExceptionOffset_));
	}

	// void* setClassCastException
	public PointerPointer setClassCastExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setClassCastExceptionOffset_));
	}

	// void* setCurrentException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setCurrentExceptionOffset_", declaredType="void*")
	public VoidPointer setCurrentException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setCurrentExceptionOffset_));
	}

	// void* setCurrentException
	public PointerPointer setCurrentExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setCurrentExceptionOffset_));
	}

	// void* setCurrentExceptionNLS
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setCurrentExceptionNLSOffset_", declaredType="void*")
	public VoidPointer setCurrentExceptionNLS() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setCurrentExceptionNLSOffset_));
	}

	// void* setCurrentExceptionNLS
	public PointerPointer setCurrentExceptionNLSEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setCurrentExceptionNLSOffset_));
	}

	// void* setCurrentExceptionNLSWithArgs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setCurrentExceptionNLSWithArgsOffset_", declaredType="void*")
	public VoidPointer setCurrentExceptionNLSWithArgs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setCurrentExceptionNLSWithArgsOffset_));
	}

	// void* setCurrentExceptionNLSWithArgs
	public PointerPointer setCurrentExceptionNLSWithArgsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setCurrentExceptionNLSWithArgsOffset_));
	}

	// void* setCurrentExceptionUTF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setCurrentExceptionUTFOffset_", declaredType="void*")
	public VoidPointer setCurrentExceptionUTF() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setCurrentExceptionUTFOffset_));
	}

	// void* setCurrentExceptionUTF
	public PointerPointer setCurrentExceptionUTFEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setCurrentExceptionUTFOffset_));
	}

	// void* setCurrentExceptionWithCause
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setCurrentExceptionWithCauseOffset_", declaredType="void*")
	public VoidPointer setCurrentExceptionWithCause() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setCurrentExceptionWithCauseOffset_));
	}

	// void* setCurrentExceptionWithCause
	public PointerPointer setCurrentExceptionWithCauseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setCurrentExceptionWithCauseOffset_));
	}

	// void* setExceptionForErroredRomClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setExceptionForErroredRomClassOffset_", declaredType="void*")
	public VoidPointer setExceptionForErroredRomClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setExceptionForErroredRomClassOffset_));
	}

	// void* setExceptionForErroredRomClass
	public PointerPointer setExceptionForErroredRomClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setExceptionForErroredRomClassOffset_));
	}

	// void* setHaltFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setHaltFlagOffset_", declaredType="void*")
	public VoidPointer setHaltFlag() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setHaltFlagOffset_));
	}

	// void* setHaltFlag
	public PointerPointer setHaltFlagEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setHaltFlagOffset_));
	}

	// void* setHeapOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setHeapOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer setHeapOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setHeapOutOfMemoryErrorOffset_));
	}

	// void* setHeapOutOfMemoryError
	public PointerPointer setHeapOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setHeapOutOfMemoryErrorOffset_));
	}

	// void* setIllegalAccessErrorNonPublicInvokeInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setIllegalAccessErrorNonPublicInvokeInterfaceOffset_", declaredType="void*")
	public VoidPointer setIllegalAccessErrorNonPublicInvokeInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setIllegalAccessErrorNonPublicInvokeInterfaceOffset_));
	}

	// void* setIllegalAccessErrorNonPublicInvokeInterface
	public PointerPointer setIllegalAccessErrorNonPublicInvokeInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setIllegalAccessErrorNonPublicInvokeInterfaceOffset_));
	}

	// void* setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassOffset_", declaredType="void*")
	public VoidPointer setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassOffset_));
	}

	// void* setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClass
	public PointerPointer setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassOffset_));
	}

	// void* setLogOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setLogOptionsOffset_", declaredType="void*")
	public VoidPointer setLogOptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setLogOptionsOffset_));
	}

	// void* setLogOptions
	public PointerPointer setLogOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setLogOptionsOffset_));
	}

	// void* setNativeOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setNativeOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer setNativeOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setNativeOutOfMemoryErrorOffset_));
	}

	// void* setNativeOutOfMemoryError
	public PointerPointer setNativeOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setNativeOutOfMemoryErrorOffset_));
	}

	// void* setNestmatesError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setNestmatesErrorOffset_", declaredType="void*")
	public VoidPointer setNestmatesError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setNestmatesErrorOffset_));
	}

	// void* setNestmatesError
	public PointerPointer setNestmatesErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setNestmatesErrorOffset_));
	}

	// void* setSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setSystemPropertyOffset_", declaredType="void*")
	public VoidPointer setSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setSystemPropertyOffset_));
	}

	// void* setSystemProperty
	public PointerPointer setSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setSystemPropertyOffset_));
	}

	// void* setThreadForkOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setThreadForkOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer setThreadForkOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setThreadForkOutOfMemoryErrorOffset_));
	}

	// void* setThreadForkOutOfMemoryError
	public PointerPointer setThreadForkOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setThreadForkOutOfMemoryErrorOffset_));
	}

	// void* setVMThreadNameFromString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setVMThreadNameFromStringOffset_", declaredType="void*")
	public VoidPointer setVMThreadNameFromString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._setVMThreadNameFromStringOffset_));
	}

	// void* setVMThreadNameFromString
	public PointerPointer setVMThreadNameFromStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._setVMThreadNameFromStringOffset_));
	}

	// void* shutdownJVMRI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shutdownJVMRIOffset_", declaredType="void*")
	public VoidPointer shutdownJVMRI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._shutdownJVMRIOffset_));
	}

	// void* shutdownJVMRI
	public PointerPointer shutdownJVMRIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._shutdownJVMRIOffset_));
	}

	// void* sidecarInvokeReflectConstructor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarInvokeReflectConstructorOffset_", declaredType="void*")
	public VoidPointer sidecarInvokeReflectConstructor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sidecarInvokeReflectConstructorOffset_));
	}

	// void* sidecarInvokeReflectConstructor
	public PointerPointer sidecarInvokeReflectConstructorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sidecarInvokeReflectConstructorOffset_));
	}

	// void* sidecarInvokeReflectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarInvokeReflectMethodOffset_", declaredType="void*")
	public VoidPointer sidecarInvokeReflectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._sidecarInvokeReflectMethodOffset_));
	}

	// void* sidecarInvokeReflectMethod
	public PointerPointer sidecarInvokeReflectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._sidecarInvokeReflectMethodOffset_));
	}

	// void* startJavaThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startJavaThreadOffset_", declaredType="void*")
	public VoidPointer startJavaThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._startJavaThreadOffset_));
	}

	// void* startJavaThread
	public PointerPointer startJavaThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._startJavaThreadOffset_));
	}

	// void* staticFieldAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_staticFieldAddressOffset_", declaredType="void*")
	public VoidPointer staticFieldAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._staticFieldAddressOffset_));
	}

	// void* staticFieldAddress
	public PointerPointer staticFieldAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._staticFieldAddressOffset_));
	}

	// void* storeFlattenableArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeFlattenableArrayElementOffset_", declaredType="void*")
	public VoidPointer storeFlattenableArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._storeFlattenableArrayElementOffset_));
	}

	// void* storeFlattenableArrayElement
	public PointerPointer storeFlattenableArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._storeFlattenableArrayElementOffset_));
	}

	// void* structuredSignalHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_structuredSignalHandlerOffset_", declaredType="void*")
	public VoidPointer structuredSignalHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._structuredSignalHandlerOffset_));
	}

	// void* structuredSignalHandler
	public PointerPointer structuredSignalHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._structuredSignalHandlerOffset_));
	}

	// void* structuredSignalHandlerVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_structuredSignalHandlerVMOffset_", declaredType="void*")
	public VoidPointer structuredSignalHandlerVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._structuredSignalHandlerVMOffset_));
	}

	// void* structuredSignalHandlerVM
	public PointerPointer structuredSignalHandlerVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._structuredSignalHandlerVMOffset_));
	}

	// void* threadAboutToStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadAboutToStartOffset_", declaredType="void*")
	public VoidPointer threadAboutToStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._threadAboutToStartOffset_));
	}

	// void* threadAboutToStart
	public PointerPointer threadAboutToStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._threadAboutToStartOffset_));
	}

	// void* threadCleanup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadCleanupOffset_", declaredType="void*")
	public VoidPointer threadCleanup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._threadCleanupOffset_));
	}

	// void* threadCleanup
	public PointerPointer threadCleanupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._threadCleanupOffset_));
	}

	// void* threadParkImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadParkImplOffset_", declaredType="void*")
	public VoidPointer threadParkImpl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._threadParkImplOffset_));
	}

	// void* threadParkImpl
	public PointerPointer threadParkImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._threadParkImplOffset_));
	}

	// void* threadSleepImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadSleepImplOffset_", declaredType="void*")
	public VoidPointer threadSleepImpl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._threadSleepImplOffset_));
	}

	// void* threadSleepImpl
	public PointerPointer threadSleepImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._threadSleepImplOffset_));
	}

	// void* threadUnparkImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadUnparkImplOffset_", declaredType="void*")
	public VoidPointer threadUnparkImpl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._threadUnparkImplOffset_));
	}

	// void* threadUnparkImpl
	public PointerPointer threadUnparkImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._threadUnparkImplOffset_));
	}

	// void* throwNativeOOMError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwNativeOOMErrorOffset_", declaredType="void*")
	public VoidPointer throwNativeOOMError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._throwNativeOOMErrorOffset_));
	}

	// void* throwNativeOOMError
	public PointerPointer throwNativeOOMErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._throwNativeOOMErrorOffset_));
	}

	// void* throwNewJavaIoIOException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwNewJavaIoIOExceptionOffset_", declaredType="void*")
	public VoidPointer throwNewJavaIoIOException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._throwNewJavaIoIOExceptionOffset_));
	}

	// void* throwNewJavaIoIOException
	public PointerPointer throwNewJavaIoIOExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._throwNewJavaIoIOExceptionOffset_));
	}

	// void* updateVMRuntimeState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateVMRuntimeStateOffset_", declaredType="void*")
	public VoidPointer updateVMRuntimeState() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._updateVMRuntimeStateOffset_));
	}

	// void* updateVMRuntimeState
	public PointerPointer updateVMRuntimeStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._updateVMRuntimeStateOffset_));
	}

	// void* valueTypeCapableAcmp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueTypeCapableAcmpOffset_", declaredType="void*")
	public VoidPointer valueTypeCapableAcmp() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._valueTypeCapableAcmpOffset_));
	}

	// void* valueTypeCapableAcmp
	public PointerPointer valueTypeCapableAcmpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._valueTypeCapableAcmpOffset_));
	}

	// void* verifyQualifiedName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyQualifiedNameOffset_", declaredType="void*")
	public VoidPointer verifyQualifiedName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._verifyQualifiedNameOffset_));
	}

	// void* verifyQualifiedName
	public PointerPointer verifyQualifiedNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._verifyQualifiedNameOffset_));
	}

	// void* waitForExclusiveVMAccessMetronome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitForExclusiveVMAccessMetronomeOffset_", declaredType="void*")
	public VoidPointer waitForExclusiveVMAccessMetronome() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._waitForExclusiveVMAccessMetronomeOffset_));
	}

	// void* waitForExclusiveVMAccessMetronome
	public PointerPointer waitForExclusiveVMAccessMetronomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._waitForExclusiveVMAccessMetronomeOffset_));
	}

	// void* waitForExclusiveVMAccessMetronomeTemp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitForExclusiveVMAccessMetronomeTempOffset_", declaredType="void*")
	public VoidPointer waitForExclusiveVMAccessMetronomeTemp() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._waitForExclusiveVMAccessMetronomeTempOffset_));
	}

	// void* waitForExclusiveVMAccessMetronomeTemp
	public PointerPointer waitForExclusiveVMAccessMetronomeTempEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._waitForExclusiveVMAccessMetronomeTempOffset_));
	}

	// void* walkBytecodeFrameSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkBytecodeFrameSlotsOffset_", declaredType="void*")
	public VoidPointer walkBytecodeFrameSlots() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._walkBytecodeFrameSlotsOffset_));
	}

	// void* walkBytecodeFrameSlots
	public PointerPointer walkBytecodeFrameSlotsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._walkBytecodeFrameSlotsOffset_));
	}

	// void* walkStackForExceptionThrow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkStackForExceptionThrowOffset_", declaredType="void*")
	public VoidPointer walkStackForExceptionThrow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMFunctions._walkStackForExceptionThrowOffset_));
	}

	// void* walkStackForExceptionThrow
	public PointerPointer walkStackForExceptionThrowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMFunctions._walkStackForExceptionThrowOffset_));
	}

}
