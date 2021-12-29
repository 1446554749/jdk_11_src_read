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
 * Structure: J9MemoryManagerFunctionsPointer
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
 * The generated code will provide getters for all elements in the J9MemoryManagerFunctionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MemoryManagerFunctions.class)
public class J9MemoryManagerFunctionsPointer extends StructurePointer {

	// NULL
	public static final J9MemoryManagerFunctionsPointer NULL = new J9MemoryManagerFunctionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MemoryManagerFunctionsPointer(long address) {
		super(address);
	}

	public static J9MemoryManagerFunctionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MemoryManagerFunctionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MemoryManagerFunctionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MemoryManagerFunctionsPointer(address);
	}

	public J9MemoryManagerFunctionsPointer add(long count) {
		return J9MemoryManagerFunctionsPointer.cast(address + (J9MemoryManagerFunctions.SIZEOF * count));
	}

	public J9MemoryManagerFunctionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MemoryManagerFunctionsPointer addOffset(long offset) {
		return J9MemoryManagerFunctionsPointer.cast(address + offset);
	}

	public J9MemoryManagerFunctionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MemoryManagerFunctionsPointer sub(long count) {
		return J9MemoryManagerFunctionsPointer.cast(address - (J9MemoryManagerFunctions.SIZEOF * count));
	}

	public J9MemoryManagerFunctionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MemoryManagerFunctionsPointer subOffset(long offset) {
		return J9MemoryManagerFunctionsPointer.cast(address - offset);
	}

	public J9MemoryManagerFunctionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MemoryManagerFunctionsPointer untag(long mask) {
		return J9MemoryManagerFunctionsPointer.cast(address & ~mask);
	}

	public J9MemoryManagerFunctionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MemoryManagerFunctions.SIZEOF;
	}

	// Implementation methods

	// void* J9AllocateIndexableObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9AllocateIndexableObjectOffset_", declaredType="void*")
	public VoidPointer J9AllocateIndexableObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9AllocateIndexableObjectOffset_));
	}

	// void* J9AllocateIndexableObject
	public PointerPointer J9AllocateIndexableObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9AllocateIndexableObjectOffset_));
	}

	// void* J9AllocateIndexableObjectNoGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9AllocateIndexableObjectNoGCOffset_", declaredType="void*")
	public VoidPointer J9AllocateIndexableObjectNoGC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9AllocateIndexableObjectNoGCOffset_));
	}

	// void* J9AllocateIndexableObjectNoGC
	public PointerPointer J9AllocateIndexableObjectNoGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9AllocateIndexableObjectNoGCOffset_));
	}

	// void* J9AllocateObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9AllocateObjectOffset_", declaredType="void*")
	public VoidPointer J9AllocateObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9AllocateObjectOffset_));
	}

	// void* J9AllocateObject
	public PointerPointer J9AllocateObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9AllocateObjectOffset_));
	}

	// void* J9AllocateObjectNoGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9AllocateObjectNoGCOffset_", declaredType="void*")
	public VoidPointer J9AllocateObjectNoGC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9AllocateObjectNoGCOffset_));
	}

	// void* J9AllocateObjectNoGC
	public PointerPointer J9AllocateObjectNoGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9AllocateObjectNoGCOffset_));
	}

	// void* J9MetronomeWriteBarrierJ9ClassStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9MetronomeWriteBarrierJ9ClassStoreOffset_", declaredType="void*")
	public VoidPointer J9MetronomeWriteBarrierJ9ClassStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9MetronomeWriteBarrierJ9ClassStoreOffset_));
	}

	// void* J9MetronomeWriteBarrierJ9ClassStore
	public PointerPointer J9MetronomeWriteBarrierJ9ClassStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9MetronomeWriteBarrierJ9ClassStoreOffset_));
	}

	// void* J9MetronomeWriteBarrierStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9MetronomeWriteBarrierStoreOffset_", declaredType="void*")
	public VoidPointer J9MetronomeWriteBarrierStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9MetronomeWriteBarrierStoreOffset_));
	}

	// void* J9MetronomeWriteBarrierStore
	public PointerPointer J9MetronomeWriteBarrierStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9MetronomeWriteBarrierStoreOffset_));
	}

	// void* J9ReadBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9ReadBarrierOffset_", declaredType="void*")
	public VoidPointer J9ReadBarrier() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9ReadBarrierOffset_));
	}

	// void* J9ReadBarrier
	public PointerPointer J9ReadBarrierEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9ReadBarrierOffset_));
	}

	// void* J9ReadBarrierJ9Class
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9ReadBarrierJ9ClassOffset_", declaredType="void*")
	public VoidPointer J9ReadBarrierJ9Class() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9ReadBarrierJ9ClassOffset_));
	}

	// void* J9ReadBarrierJ9Class
	public PointerPointer J9ReadBarrierJ9ClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9ReadBarrierJ9ClassOffset_));
	}

	// void* J9WriteBarrierBatchStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9WriteBarrierBatchStoreOffset_", declaredType="void*")
	public VoidPointer J9WriteBarrierBatchStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9WriteBarrierBatchStoreOffset_));
	}

	// void* J9WriteBarrierBatchStore
	public PointerPointer J9WriteBarrierBatchStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9WriteBarrierBatchStoreOffset_));
	}

	// void* J9WriteBarrierJ9ClassBatchStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9WriteBarrierJ9ClassBatchStoreOffset_", declaredType="void*")
	public VoidPointer J9WriteBarrierJ9ClassBatchStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9WriteBarrierJ9ClassBatchStoreOffset_));
	}

	// void* J9WriteBarrierJ9ClassBatchStore
	public PointerPointer J9WriteBarrierJ9ClassBatchStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9WriteBarrierJ9ClassBatchStoreOffset_));
	}

	// void* J9WriteBarrierJ9ClassStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9WriteBarrierJ9ClassStoreOffset_", declaredType="void*")
	public VoidPointer J9WriteBarrierJ9ClassStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9WriteBarrierJ9ClassStoreOffset_));
	}

	// void* J9WriteBarrierJ9ClassStore
	public PointerPointer J9WriteBarrierJ9ClassStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9WriteBarrierJ9ClassStoreOffset_));
	}

	// void* J9WriteBarrierStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9WriteBarrierStoreOffset_", declaredType="void*")
	public VoidPointer J9WriteBarrierStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._J9WriteBarrierStoreOffset_));
	}

	// void* J9WriteBarrierStore
	public PointerPointer J9WriteBarrierStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._J9WriteBarrierStoreOffset_));
	}

	// void* allocateMemoryForSublistFragment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateMemoryForSublistFragmentOffset_", declaredType="void*")
	public VoidPointer allocateMemoryForSublistFragment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._allocateMemoryForSublistFragmentOffset_));
	}

	// void* allocateMemoryForSublistFragment
	public PointerPointer allocateMemoryForSublistFragmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._allocateMemoryForSublistFragmentOffset_));
	}

	// void* allocateZeroedTLHPages
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateZeroedTLHPagesOffset_", declaredType="void*")
	public VoidPointer allocateZeroedTLHPages() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._allocateZeroedTLHPagesOffset_));
	}

	// void* allocateZeroedTLHPages
	public PointerPointer allocateZeroedTLHPagesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._allocateZeroedTLHPagesOffset_));
	}

	// void* alwaysCallReferenceArrayCopyHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alwaysCallReferenceArrayCopyHelperOffset_", declaredType="void*")
	public VoidPointer alwaysCallReferenceArrayCopyHelper() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._alwaysCallReferenceArrayCopyHelperOffset_));
	}

	// void* alwaysCallReferenceArrayCopyHelper
	public PointerPointer alwaysCallReferenceArrayCopyHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._alwaysCallReferenceArrayCopyHelperOffset_));
	}

	// void* cleanupMutatorModelJava
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanupMutatorModelJavaOffset_", declaredType="void*")
	public VoidPointer cleanupMutatorModelJava() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._cleanupMutatorModelJavaOffset_));
	}

	// void* cleanupMutatorModelJava
	public PointerPointer cleanupMutatorModelJavaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._cleanupMutatorModelJavaOffset_));
	}

	// void* finalizeObjectCreated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeObjectCreatedOffset_", declaredType="void*")
	public VoidPointer finalizeObjectCreated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._finalizeObjectCreatedOffset_));
	}

	// void* finalizeObjectCreated
	public PointerPointer finalizeObjectCreatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._finalizeObjectCreatedOffset_));
	}

	// void* forceClassLoaderUnload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_forceClassLoaderUnloadOffset_", declaredType="void*")
	public VoidPointer forceClassLoaderUnload() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._forceClassLoaderUnloadOffset_));
	}

	// void* forceClassLoaderUnload
	public PointerPointer forceClassLoaderUnloadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._forceClassLoaderUnloadOffset_));
	}

	// void* gcShutdownHeapManagement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcShutdownHeapManagementOffset_", declaredType="void*")
	public VoidPointer gcShutdownHeapManagement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._gcShutdownHeapManagementOffset_));
	}

	// void* gcShutdownHeapManagement
	public PointerPointer gcShutdownHeapManagementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._gcShutdownHeapManagementOffset_));
	}

	// void* gcStartupHeapManagement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcStartupHeapManagementOffset_", declaredType="void*")
	public VoidPointer gcStartupHeapManagement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._gcStartupHeapManagementOffset_));
	}

	// void* gcStartupHeapManagement
	public PointerPointer gcStartupHeapManagementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._gcStartupHeapManagementOffset_));
	}

	// void* getStaticObjectAllocateFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStaticObjectAllocateFlagsOffset_", declaredType="void*")
	public VoidPointer getStaticObjectAllocateFlags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._getStaticObjectAllocateFlagsOffset_));
	}

	// void* getStaticObjectAllocateFlags
	public PointerPointer getStaticObjectAllocateFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._getStaticObjectAllocateFlagsOffset_));
	}

	// void* getVerboseGCFunctionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getVerboseGCFunctionTableOffset_", declaredType="void*")
	public VoidPointer getVerboseGCFunctionTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._getVerboseGCFunctionTableOffset_));
	}

	// void* getVerboseGCFunctionTable
	public PointerPointer getVerboseGCFunctionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._getVerboseGCFunctionTableOffset_));
	}

	// void* initializeMutatorModelJava
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeMutatorModelJavaOffset_", declaredType="void*")
	public VoidPointer initializeMutatorModelJava() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._initializeMutatorModelJavaOffset_));
	}

	// void* initializeMutatorModelJava
	public PointerPointer initializeMutatorModelJavaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._initializeMutatorModelJavaOffset_));
	}

	// void* isAllocateZeroedTLHPagesEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isAllocateZeroedTLHPagesEnabledOffset_", declaredType="void*")
	public VoidPointer isAllocateZeroedTLHPagesEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._isAllocateZeroedTLHPagesEnabledOffset_));
	}

	// void* isAllocateZeroedTLHPagesEnabled
	public PointerPointer isAllocateZeroedTLHPagesEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._isAllocateZeroedTLHPagesEnabledOffset_));
	}

	// void* isStaticObjectAllocateFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isStaticObjectAllocateFlagsOffset_", declaredType="void*")
	public VoidPointer isStaticObjectAllocateFlags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._isStaticObjectAllocateFlagsOffset_));
	}

	// void* isStaticObjectAllocateFlags
	public PointerPointer isStaticObjectAllocateFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._isStaticObjectAllocateFlagsOffset_));
	}

	// void* j9gc_all_object_and_vm_slots_do
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_all_object_and_vm_slots_doOffset_", declaredType="void*")
	public VoidPointer j9gc_all_object_and_vm_slots_do() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_all_object_and_vm_slots_doOffset_));
	}

	// void* j9gc_all_object_and_vm_slots_do
	public PointerPointer j9gc_all_object_and_vm_slots_doEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_all_object_and_vm_slots_doOffset_));
	}

	// void* j9gc_allsupported_garbagecollectors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_allsupported_garbagecollectorsOffset_", declaredType="void*")
	public VoidPointer j9gc_allsupported_garbagecollectors() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_allsupported_garbagecollectorsOffset_));
	}

	// void* j9gc_allsupported_garbagecollectors
	public PointerPointer j9gc_allsupported_garbagecollectorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_allsupported_garbagecollectorsOffset_));
	}

	// void* j9gc_allsupported_memorypools
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_allsupported_memorypoolsOffset_", declaredType="void*")
	public VoidPointer j9gc_allsupported_memorypools() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_allsupported_memorypoolsOffset_));
	}

	// void* j9gc_allsupported_memorypools
	public PointerPointer j9gc_allsupported_memorypoolsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_allsupported_memorypoolsOffset_));
	}

	// void* j9gc_arraylet_getLeafLogSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_arraylet_getLeafLogSizeOffset_", declaredType="void*")
	public VoidPointer j9gc_arraylet_getLeafLogSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_arraylet_getLeafLogSizeOffset_));
	}

	// void* j9gc_arraylet_getLeafLogSize
	public PointerPointer j9gc_arraylet_getLeafLogSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_arraylet_getLeafLogSizeOffset_));
	}

	// void* j9gc_arraylet_getLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_arraylet_getLeafSizeOffset_", declaredType="void*")
	public VoidPointer j9gc_arraylet_getLeafSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_arraylet_getLeafSizeOffset_));
	}

	// void* j9gc_arraylet_getLeafSize
	public PointerPointer j9gc_arraylet_getLeafSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_arraylet_getLeafSizeOffset_));
	}

	// void* j9gc_concurrent_getCardSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_concurrent_getCardSizeOffset_", declaredType="void*")
	public VoidPointer j9gc_concurrent_getCardSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_concurrent_getCardSizeOffset_));
	}

	// void* j9gc_concurrent_getCardSize
	public PointerPointer j9gc_concurrent_getCardSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_concurrent_getCardSizeOffset_));
	}

	// void* j9gc_concurrent_getHeapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_concurrent_getHeapBaseOffset_", declaredType="void*")
	public VoidPointer j9gc_concurrent_getHeapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_concurrent_getHeapBaseOffset_));
	}

	// void* j9gc_concurrent_getHeapBase
	public PointerPointer j9gc_concurrent_getHeapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_concurrent_getHeapBaseOffset_));
	}

	// void* j9gc_concurrent_scavenger_enabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_concurrent_scavenger_enabledOffset_", declaredType="void*")
	public VoidPointer j9gc_concurrent_scavenger_enabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_concurrent_scavenger_enabledOffset_));
	}

	// void* j9gc_concurrent_scavenger_enabled
	public PointerPointer j9gc_concurrent_scavenger_enabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_concurrent_scavenger_enabledOffset_));
	}

	// void* j9gc_createJavaLangString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_createJavaLangStringOffset_", declaredType="void*")
	public VoidPointer j9gc_createJavaLangString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_createJavaLangStringOffset_));
	}

	// void* j9gc_createJavaLangString
	public PointerPointer j9gc_createJavaLangStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_createJavaLangStringOffset_));
	}

	// void* j9gc_ext_check_is_valid_heap_object
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_ext_check_is_valid_heap_objectOffset_", declaredType="void*")
	public VoidPointer j9gc_ext_check_is_valid_heap_object() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_ext_check_is_valid_heap_objectOffset_));
	}

	// void* j9gc_ext_check_is_valid_heap_object
	public PointerPointer j9gc_ext_check_is_valid_heap_objectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_ext_check_is_valid_heap_objectOffset_));
	}

	// void* j9gc_ext_is_marked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_ext_is_markedOffset_", declaredType="void*")
	public VoidPointer j9gc_ext_is_marked() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_ext_is_markedOffset_));
	}

	// void* j9gc_ext_is_marked
	public PointerPointer j9gc_ext_is_markedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_ext_is_markedOffset_));
	}

	// void* j9gc_ext_reachable_from_object_do
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_ext_reachable_from_object_doOffset_", declaredType="void*")
	public VoidPointer j9gc_ext_reachable_from_object_do() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_ext_reachable_from_object_doOffset_));
	}

	// void* j9gc_ext_reachable_from_object_do
	public PointerPointer j9gc_ext_reachable_from_object_doEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_ext_reachable_from_object_doOffset_));
	}

	// void* j9gc_ext_reachable_objects_do
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_ext_reachable_objects_doOffset_", declaredType="void*")
	public VoidPointer j9gc_ext_reachable_objects_do() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_ext_reachable_objects_doOffset_));
	}

	// void* j9gc_ext_reachable_objects_do
	public PointerPointer j9gc_ext_reachable_objects_doEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_ext_reachable_objects_doOffset_));
	}

	// void* j9gc_finalizer_completeFinalizersOnExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_finalizer_completeFinalizersOnExitOffset_", declaredType="void*")
	public VoidPointer j9gc_finalizer_completeFinalizersOnExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_finalizer_completeFinalizersOnExitOffset_));
	}

	// void* j9gc_finalizer_completeFinalizersOnExit
	public PointerPointer j9gc_finalizer_completeFinalizersOnExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_finalizer_completeFinalizersOnExitOffset_));
	}

	// void* j9gc_finalizer_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_finalizer_shutdownOffset_", declaredType="void*")
	public VoidPointer j9gc_finalizer_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_finalizer_shutdownOffset_));
	}

	// void* j9gc_finalizer_shutdown
	public PointerPointer j9gc_finalizer_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_finalizer_shutdownOffset_));
	}

	// void* j9gc_finalizer_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_finalizer_startupOffset_", declaredType="void*")
	public VoidPointer j9gc_finalizer_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_finalizer_startupOffset_));
	}

	// void* j9gc_finalizer_startup
	public PointerPointer j9gc_finalizer_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_finalizer_startupOffset_));
	}

	// void* j9gc_flush_caches_for_walk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_flush_caches_for_walkOffset_", declaredType="void*")
	public VoidPointer j9gc_flush_caches_for_walk() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_flush_caches_for_walkOffset_));
	}

	// void* j9gc_flush_caches_for_walk
	public PointerPointer j9gc_flush_caches_for_walkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_flush_caches_for_walkOffset_));
	}

	// void* j9gc_flush_nonAllocationCaches_for_walk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_flush_nonAllocationCaches_for_walkOffset_", declaredType="void*")
	public VoidPointer j9gc_flush_nonAllocationCaches_for_walk() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_flush_nonAllocationCaches_for_walkOffset_));
	}

	// void* j9gc_flush_nonAllocationCaches_for_walk
	public PointerPointer j9gc_flush_nonAllocationCaches_for_walkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_flush_nonAllocationCaches_for_walkOffset_));
	}

	// void* j9gc_garbagecollector_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_garbagecollector_nameOffset_", declaredType="void*")
	public VoidPointer j9gc_garbagecollector_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_garbagecollector_nameOffset_));
	}

	// void* j9gc_garbagecollector_name
	public PointerPointer j9gc_garbagecollector_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_garbagecollector_nameOffset_));
	}

	// void* j9gc_get_CPU_times
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_CPU_timesOffset_", declaredType="void*")
	public VoidPointer j9gc_get_CPU_times() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_CPU_timesOffset_));
	}

	// void* j9gc_get_CPU_times
	public PointerPointer j9gc_get_CPU_timesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_CPU_timesOffset_));
	}

	// void* j9gc_get_bytes_allocated_by_thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_bytes_allocated_by_threadOffset_", declaredType="void*")
	public VoidPointer j9gc_get_bytes_allocated_by_thread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_bytes_allocated_by_threadOffset_));
	}

	// void* j9gc_get_bytes_allocated_by_thread
	public PointerPointer j9gc_get_bytes_allocated_by_threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_bytes_allocated_by_threadOffset_));
	}

	// void* j9gc_get_collector_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_collector_idOffset_", declaredType="void*")
	public VoidPointer j9gc_get_collector_id() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_collector_idOffset_));
	}

	// void* j9gc_get_collector_id
	public PointerPointer j9gc_get_collector_idEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_collector_idOffset_));
	}

	// void* j9gc_get_gc_action
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_gc_actionOffset_", declaredType="void*")
	public VoidPointer j9gc_get_gc_action() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_gc_actionOffset_));
	}

	// void* j9gc_get_gc_action
	public PointerPointer j9gc_get_gc_actionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_gc_actionOffset_));
	}

	// void* j9gc_get_gc_cause
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_gc_causeOffset_", declaredType="void*")
	public VoidPointer j9gc_get_gc_cause() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_gc_causeOffset_));
	}

	// void* j9gc_get_gc_cause
	public PointerPointer j9gc_get_gc_causeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_gc_causeOffset_));
	}

	// void* j9gc_get_gcmodestring
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_gcmodestringOffset_", declaredType="void*")
	public VoidPointer j9gc_get_gcmodestring() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_gcmodestringOffset_));
	}

	// void* j9gc_get_gcmodestring
	public PointerPointer j9gc_get_gcmodestringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_gcmodestringOffset_));
	}

	// void* j9gc_get_hook_interface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_hook_interfaceOffset_", declaredType="void*")
	public VoidPointer j9gc_get_hook_interface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_hook_interfaceOffset_));
	}

	// void* j9gc_get_hook_interface
	public PointerPointer j9gc_get_hook_interfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_hook_interfaceOffset_));
	}

	// void* j9gc_get_initial_heap_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_initial_heap_sizeOffset_", declaredType="void*")
	public VoidPointer j9gc_get_initial_heap_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_initial_heap_sizeOffset_));
	}

	// void* j9gc_get_initial_heap_size
	public PointerPointer j9gc_get_initial_heap_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_initial_heap_sizeOffset_));
	}

	// void* j9gc_get_jit_string_dedup_policy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_jit_string_dedup_policyOffset_", declaredType="void*")
	public VoidPointer j9gc_get_jit_string_dedup_policy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_jit_string_dedup_policyOffset_));
	}

	// void* j9gc_get_jit_string_dedup_policy
	public PointerPointer j9gc_get_jit_string_dedup_policyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_jit_string_dedup_policyOffset_));
	}

	// void* j9gc_get_maximum_heap_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_maximum_heap_sizeOffset_", declaredType="void*")
	public VoidPointer j9gc_get_maximum_heap_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_maximum_heap_sizeOffset_));
	}

	// void* j9gc_get_maximum_heap_size
	public PointerPointer j9gc_get_maximum_heap_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_maximum_heap_sizeOffset_));
	}

	// void* j9gc_get_object_size_in_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_object_size_in_bytesOffset_", declaredType="void*")
	public VoidPointer j9gc_get_object_size_in_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_object_size_in_bytesOffset_));
	}

	// void* j9gc_get_object_size_in_bytes
	public PointerPointer j9gc_get_object_size_in_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_object_size_in_bytesOffset_));
	}

	// void* j9gc_get_object_total_footprint_in_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_object_total_footprint_in_bytesOffset_", declaredType="void*")
	public VoidPointer j9gc_get_object_total_footprint_in_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_object_total_footprint_in_bytesOffset_));
	}

	// void* j9gc_get_object_total_footprint_in_bytes
	public PointerPointer j9gc_get_object_total_footprint_in_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_object_total_footprint_in_bytesOffset_));
	}

	// void* j9gc_get_objects_pending_finalization_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_objects_pending_finalization_countOffset_", declaredType="void*")
	public VoidPointer j9gc_get_objects_pending_finalization_count() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_objects_pending_finalization_countOffset_));
	}

	// void* j9gc_get_objects_pending_finalization_count
	public PointerPointer j9gc_get_objects_pending_finalization_countEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_objects_pending_finalization_countOffset_));
	}

	// void* j9gc_get_omr_hook_interface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_omr_hook_interfaceOffset_", declaredType="void*")
	public VoidPointer j9gc_get_omr_hook_interface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_omr_hook_interfaceOffset_));
	}

	// void* j9gc_get_omr_hook_interface
	public PointerPointer j9gc_get_omr_hook_interfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_omr_hook_interfaceOffset_));
	}

	// void* j9gc_get_overflow_safe_alloc_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_overflow_safe_alloc_sizeOffset_", declaredType="void*")
	public VoidPointer j9gc_get_overflow_safe_alloc_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_overflow_safe_alloc_sizeOffset_));
	}

	// void* j9gc_get_overflow_safe_alloc_size
	public PointerPointer j9gc_get_overflow_safe_alloc_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_overflow_safe_alloc_sizeOffset_));
	}

	// void* j9gc_get_private_hook_interface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_private_hook_interfaceOffset_", declaredType="void*")
	public VoidPointer j9gc_get_private_hook_interface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_private_hook_interfaceOffset_));
	}

	// void* j9gc_get_private_hook_interface
	public PointerPointer j9gc_get_private_hook_interfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_private_hook_interfaceOffset_));
	}

	// void* j9gc_get_softmx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_get_softmxOffset_", declaredType="void*")
	public VoidPointer j9gc_get_softmx() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_get_softmxOffset_));
	}

	// void* j9gc_get_softmx
	public PointerPointer j9gc_get_softmxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_get_softmxOffset_));
	}

	// void* j9gc_heap_free_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_heap_free_memoryOffset_", declaredType="void*")
	public VoidPointer j9gc_heap_free_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_heap_free_memoryOffset_));
	}

	// void* j9gc_heap_free_memory
	public PointerPointer j9gc_heap_free_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_heap_free_memoryOffset_));
	}

	// void* j9gc_heap_total_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_heap_total_memoryOffset_", declaredType="void*")
	public VoidPointer j9gc_heap_total_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_heap_total_memoryOffset_));
	}

	// void* j9gc_heap_total_memory
	public PointerPointer j9gc_heap_total_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_heap_total_memoryOffset_));
	}

	// void* j9gc_hot_reference_field_required
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_hot_reference_field_requiredOffset_", declaredType="void*")
	public VoidPointer j9gc_hot_reference_field_required() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_hot_reference_field_requiredOffset_));
	}

	// void* j9gc_hot_reference_field_required
	public PointerPointer j9gc_hot_reference_field_requiredEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_hot_reference_field_requiredOffset_));
	}

	// void* j9gc_internString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_internStringOffset_", declaredType="void*")
	public VoidPointer j9gc_internString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_internStringOffset_));
	}

	// void* j9gc_internString
	public PointerPointer j9gc_internStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_internStringOffset_));
	}

	// void* j9gc_is_collectionusagethreshold_supported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_is_collectionusagethreshold_supportedOffset_", declaredType="void*")
	public VoidPointer j9gc_is_collectionusagethreshold_supported() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_is_collectionusagethreshold_supportedOffset_));
	}

	// void* j9gc_is_collectionusagethreshold_supported
	public PointerPointer j9gc_is_collectionusagethreshold_supportedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_is_collectionusagethreshold_supportedOffset_));
	}

	// void* j9gc_is_garbagecollection_disabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_is_garbagecollection_disabledOffset_", declaredType="void*")
	public VoidPointer j9gc_is_garbagecollection_disabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_is_garbagecollection_disabledOffset_));
	}

	// void* j9gc_is_garbagecollection_disabled
	public PointerPointer j9gc_is_garbagecollection_disabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_is_garbagecollection_disabledOffset_));
	}

	// void* j9gc_is_local_collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_is_local_collectorOffset_", declaredType="void*")
	public VoidPointer j9gc_is_local_collector() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_is_local_collectorOffset_));
	}

	// void* j9gc_is_local_collector
	public PointerPointer j9gc_is_local_collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_is_local_collectorOffset_));
	}

	// void* j9gc_is_managedpool_by_collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_is_managedpool_by_collectorOffset_", declaredType="void*")
	public VoidPointer j9gc_is_managedpool_by_collector() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_is_managedpool_by_collectorOffset_));
	}

	// void* j9gc_is_managedpool_by_collector
	public PointerPointer j9gc_is_managedpool_by_collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_is_managedpool_by_collectorOffset_));
	}

	// void* j9gc_is_usagethreshold_supported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_is_usagethreshold_supportedOffset_", declaredType="void*")
	public VoidPointer j9gc_is_usagethreshold_supported() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_is_usagethreshold_supportedOffset_));
	}

	// void* j9gc_is_usagethreshold_supported
	public PointerPointer j9gc_is_usagethreshold_supportedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_is_usagethreshold_supportedOffset_));
	}

	// void* j9gc_jit_isInlineAllocationSupported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_jit_isInlineAllocationSupportedOffset_", declaredType="void*")
	public VoidPointer j9gc_jit_isInlineAllocationSupported() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_jit_isInlineAllocationSupportedOffset_));
	}

	// void* j9gc_jit_isInlineAllocationSupported
	public PointerPointer j9gc_jit_isInlineAllocationSupportedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_jit_isInlineAllocationSupportedOffset_));
	}

	// void* j9gc_max_hot_field_list_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_max_hot_field_list_lengthOffset_", declaredType="void*")
	public VoidPointer j9gc_max_hot_field_list_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_max_hot_field_list_lengthOffset_));
	}

	// void* j9gc_max_hot_field_list_length
	public PointerPointer j9gc_max_hot_field_list_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_max_hot_field_list_lengthOffset_));
	}

	// void* j9gc_modron_getConfigurationValueForKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_getConfigurationValueForKeyOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_getConfigurationValueForKey() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_getConfigurationValueForKeyOffset_));
	}

	// void* j9gc_modron_getConfigurationValueForKey
	public PointerPointer j9gc_modron_getConfigurationValueForKeyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_getConfigurationValueForKeyOffset_));
	}

	// void* j9gc_modron_getReadBarrierType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_getReadBarrierTypeOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_getReadBarrierType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_getReadBarrierTypeOffset_));
	}

	// void* j9gc_modron_getReadBarrierType
	public PointerPointer j9gc_modron_getReadBarrierTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_getReadBarrierTypeOffset_));
	}

	// void* j9gc_modron_getWriteBarrierType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_getWriteBarrierTypeOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_getWriteBarrierType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_getWriteBarrierTypeOffset_));
	}

	// void* j9gc_modron_getWriteBarrierType
	public PointerPointer j9gc_modron_getWriteBarrierTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_getWriteBarrierTypeOffset_));
	}

	// void* j9gc_modron_global_collect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_global_collectOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_global_collect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_global_collectOffset_));
	}

	// void* j9gc_modron_global_collect
	public PointerPointer j9gc_modron_global_collectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_global_collectOffset_));
	}

	// void* j9gc_modron_global_collect_with_overrides
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_global_collect_with_overridesOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_global_collect_with_overrides() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_global_collect_with_overridesOffset_));
	}

	// void* j9gc_modron_global_collect_with_overrides
	public PointerPointer j9gc_modron_global_collect_with_overridesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_global_collect_with_overridesOffset_));
	}

	// void* j9gc_modron_isFeatureSupported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_isFeatureSupportedOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_isFeatureSupported() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_isFeatureSupportedOffset_));
	}

	// void* j9gc_modron_isFeatureSupported
	public PointerPointer j9gc_modron_isFeatureSupportedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_isFeatureSupportedOffset_));
	}

	// void* j9gc_modron_local_collect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_modron_local_collectOffset_", declaredType="void*")
	public VoidPointer j9gc_modron_local_collect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_modron_local_collectOffset_));
	}

	// void* j9gc_modron_local_collect
	public PointerPointer j9gc_modron_local_collectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_modron_local_collectOffset_));
	}

	// void* j9gc_notifyGCOfClassReplacement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_notifyGCOfClassReplacementOffset_", declaredType="void*")
	public VoidPointer j9gc_notifyGCOfClassReplacement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_notifyGCOfClassReplacementOffset_));
	}

	// void* j9gc_notifyGCOfClassReplacement
	public PointerPointer j9gc_notifyGCOfClassReplacementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_notifyGCOfClassReplacementOffset_));
	}

	// void* j9gc_objaccess_asConstantPoolObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_asConstantPoolObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_asConstantPoolObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_asConstantPoolObjectOffset_));
	}

	// void* j9gc_objaccess_asConstantPoolObject
	public PointerPointer j9gc_objaccess_asConstantPoolObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_asConstantPoolObjectOffset_));
	}

	// void* j9gc_objaccess_checkClassLive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_checkClassLiveOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_checkClassLive() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_checkClassLiveOffset_));
	}

	// void* j9gc_objaccess_checkClassLive
	public PointerPointer j9gc_objaccess_checkClassLiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_checkClassLiveOffset_));
	}

	// void* j9gc_objaccess_checkStringConstantsLive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_checkStringConstantsLiveOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_checkStringConstantsLive() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_checkStringConstantsLiveOffset_));
	}

	// void* j9gc_objaccess_checkStringConstantsLive
	public PointerPointer j9gc_objaccess_checkStringConstantsLiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_checkStringConstantsLiveOffset_));
	}

	// void* j9gc_objaccess_cloneIndexableObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_cloneIndexableObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_cloneIndexableObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_cloneIndexableObjectOffset_));
	}

	// void* j9gc_objaccess_cloneIndexableObject
	public PointerPointer j9gc_objaccess_cloneIndexableObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_cloneIndexableObjectOffset_));
	}

	// void* j9gc_objaccess_cloneObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_cloneObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_cloneObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_cloneObjectOffset_));
	}

	// void* j9gc_objaccess_cloneObject
	public PointerPointer j9gc_objaccess_cloneObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_cloneObjectOffset_));
	}

	// void* j9gc_objaccess_compareAndExchangeObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_compareAndExchangeObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_compareAndExchangeObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_compareAndExchangeObjectOffset_));
	}

	// void* j9gc_objaccess_compareAndExchangeObject
	public PointerPointer j9gc_objaccess_compareAndExchangeObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_compareAndExchangeObjectOffset_));
	}

	// void* j9gc_objaccess_compareAndSwapObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_compareAndSwapObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_compareAndSwapObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_compareAndSwapObjectOffset_));
	}

	// void* j9gc_objaccess_compareAndSwapObject
	public PointerPointer j9gc_objaccess_compareAndSwapObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_compareAndSwapObjectOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShadowHeapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_compressedPointersShadowHeapBaseOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_compressedPointersShadowHeapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShadowHeapBaseOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShadowHeapBase
	public PointerPointer j9gc_objaccess_compressedPointersShadowHeapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShadowHeapBaseOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShadowHeapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_compressedPointersShadowHeapTopOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_compressedPointersShadowHeapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShadowHeapTopOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShadowHeapTop
	public PointerPointer j9gc_objaccess_compressedPointersShadowHeapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShadowHeapTopOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_compressedPointersShiftOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_compressedPointersShift() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShiftOffset_));
	}

	// void* j9gc_objaccess_compressedPointersShift
	public PointerPointer j9gc_objaccess_compressedPointersShiftEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_compressedPointersShiftOffset_));
	}

	// void* j9gc_objaccess_copyObjectFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_copyObjectFieldsOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_copyObjectFields() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsOffset_));
	}

	// void* j9gc_objaccess_copyObjectFields
	public PointerPointer j9gc_objaccess_copyObjectFieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsOffset_));
	}

	// void* j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementOffset_));
	}

	// void* j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElement
	public PointerPointer j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementOffset_));
	}

	// void* j9gc_objaccess_copyObjectFieldsToFlattenedArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_copyObjectFieldsToFlattenedArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementOffset_));
	}

	// void* j9gc_objaccess_copyObjectFieldsToFlattenedArrayElement
	public PointerPointer j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementOffset_));
	}

	// void* j9gc_objaccess_fillArrayOfObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_fillArrayOfObjectsOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_fillArrayOfObjects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_fillArrayOfObjectsOffset_));
	}

	// void* j9gc_objaccess_fillArrayOfObjects
	public PointerPointer j9gc_objaccess_fillArrayOfObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_fillArrayOfObjectsOffset_));
	}

	// void* j9gc_objaccess_getArrayObjectDataAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_getArrayObjectDataAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_getArrayObjectDataAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_getArrayObjectDataAddressOffset_));
	}

	// void* j9gc_objaccess_getArrayObjectDataAddress
	public PointerPointer j9gc_objaccess_getArrayObjectDataAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_getArrayObjectDataAddressOffset_));
	}

	// void* j9gc_objaccess_getLockwordAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_getLockwordAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_getLockwordAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_getLockwordAddressOffset_));
	}

	// void* j9gc_objaccess_getLockwordAddress
	public PointerPointer j9gc_objaccess_getLockwordAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_getLockwordAddressOffset_));
	}

	// void* j9gc_objaccess_getObjectHashCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_getObjectHashCodeOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_getObjectHashCode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_getObjectHashCodeOffset_));
	}

	// void* j9gc_objaccess_getObjectHashCode
	public PointerPointer j9gc_objaccess_getObjectHashCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_getObjectHashCodeOffset_));
	}

	// void* j9gc_objaccess_indexableReadAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadAddressOffset_));
	}

	// void* j9gc_objaccess_indexableReadAddress
	public PointerPointer j9gc_objaccess_indexableReadAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadAddressOffset_));
	}

	// void* j9gc_objaccess_indexableReadI16
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadI16Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadI16() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI16Offset_));
	}

	// void* j9gc_objaccess_indexableReadI16
	public PointerPointer j9gc_objaccess_indexableReadI16EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI16Offset_));
	}

	// void* j9gc_objaccess_indexableReadI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI32Offset_));
	}

	// void* j9gc_objaccess_indexableReadI32
	public PointerPointer j9gc_objaccess_indexableReadI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI32Offset_));
	}

	// void* j9gc_objaccess_indexableReadI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI64Offset_));
	}

	// void* j9gc_objaccess_indexableReadI64
	public PointerPointer j9gc_objaccess_indexableReadI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI64Offset_));
	}

	// void* j9gc_objaccess_indexableReadI8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadI8Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadI8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI8Offset_));
	}

	// void* j9gc_objaccess_indexableReadI8
	public PointerPointer j9gc_objaccess_indexableReadI8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadI8Offset_));
	}

	// void* j9gc_objaccess_indexableReadObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadObjectOffset_));
	}

	// void* j9gc_objaccess_indexableReadObject
	public PointerPointer j9gc_objaccess_indexableReadObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadObjectOffset_));
	}

	// void* j9gc_objaccess_indexableReadU16
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadU16Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadU16() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU16Offset_));
	}

	// void* j9gc_objaccess_indexableReadU16
	public PointerPointer j9gc_objaccess_indexableReadU16EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU16Offset_));
	}

	// void* j9gc_objaccess_indexableReadU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU32Offset_));
	}

	// void* j9gc_objaccess_indexableReadU32
	public PointerPointer j9gc_objaccess_indexableReadU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU32Offset_));
	}

	// void* j9gc_objaccess_indexableReadU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU64Offset_));
	}

	// void* j9gc_objaccess_indexableReadU64
	public PointerPointer j9gc_objaccess_indexableReadU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU64Offset_));
	}

	// void* j9gc_objaccess_indexableReadU8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableReadU8Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableReadU8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU8Offset_));
	}

	// void* j9gc_objaccess_indexableReadU8
	public PointerPointer j9gc_objaccess_indexableReadU8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableReadU8Offset_));
	}

	// void* j9gc_objaccess_indexableStoreAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreAddressOffset_));
	}

	// void* j9gc_objaccess_indexableStoreAddress
	public PointerPointer j9gc_objaccess_indexableStoreAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreAddressOffset_));
	}

	// void* j9gc_objaccess_indexableStoreI16
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreI16Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreI16() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI16Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI16
	public PointerPointer j9gc_objaccess_indexableStoreI16EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI16Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI32Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI32
	public PointerPointer j9gc_objaccess_indexableStoreI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI32Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI64Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI64
	public PointerPointer j9gc_objaccess_indexableStoreI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI64Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreI8Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreI8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI8Offset_));
	}

	// void* j9gc_objaccess_indexableStoreI8
	public PointerPointer j9gc_objaccess_indexableStoreI8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreI8Offset_));
	}

	// void* j9gc_objaccess_indexableStoreObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreObjectOffset_));
	}

	// void* j9gc_objaccess_indexableStoreObject
	public PointerPointer j9gc_objaccess_indexableStoreObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreObjectOffset_));
	}

	// void* j9gc_objaccess_indexableStoreU16
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreU16Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreU16() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU16Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU16
	public PointerPointer j9gc_objaccess_indexableStoreU16EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU16Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU32Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU32
	public PointerPointer j9gc_objaccess_indexableStoreU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU32Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU64Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU64
	public PointerPointer j9gc_objaccess_indexableStoreU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU64Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_indexableStoreU8Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_indexableStoreU8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU8Offset_));
	}

	// void* j9gc_objaccess_indexableStoreU8
	public PointerPointer j9gc_objaccess_indexableStoreU8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_indexableStoreU8Offset_));
	}

	// void* j9gc_objaccess_jniDeleteGlobalReference
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_jniDeleteGlobalReferenceOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_jniDeleteGlobalReference() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_jniDeleteGlobalReferenceOffset_));
	}

	// void* j9gc_objaccess_jniDeleteGlobalReference
	public PointerPointer j9gc_objaccess_jniDeleteGlobalReferenceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_jniDeleteGlobalReferenceOffset_));
	}

	// void* j9gc_objaccess_jniGetPrimitiveArrayCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_jniGetPrimitiveArrayCriticalOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_jniGetPrimitiveArrayCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_jniGetPrimitiveArrayCriticalOffset_));
	}

	// void* j9gc_objaccess_jniGetPrimitiveArrayCritical
	public PointerPointer j9gc_objaccess_jniGetPrimitiveArrayCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_jniGetPrimitiveArrayCriticalOffset_));
	}

	// void* j9gc_objaccess_jniGetStringCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_jniGetStringCriticalOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_jniGetStringCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_jniGetStringCriticalOffset_));
	}

	// void* j9gc_objaccess_jniGetStringCritical
	public PointerPointer j9gc_objaccess_jniGetStringCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_jniGetStringCriticalOffset_));
	}

	// void* j9gc_objaccess_jniReleasePrimitiveArrayCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_jniReleasePrimitiveArrayCriticalOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_jniReleasePrimitiveArrayCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_jniReleasePrimitiveArrayCriticalOffset_));
	}

	// void* j9gc_objaccess_jniReleasePrimitiveArrayCritical
	public PointerPointer j9gc_objaccess_jniReleasePrimitiveArrayCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_jniReleasePrimitiveArrayCriticalOffset_));
	}

	// void* j9gc_objaccess_jniReleaseStringCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_jniReleaseStringCriticalOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_jniReleaseStringCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_jniReleaseStringCriticalOffset_));
	}

	// void* j9gc_objaccess_jniReleaseStringCritical
	public PointerPointer j9gc_objaccess_jniReleaseStringCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_jniReleaseStringCriticalOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndExchangeInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectCompareAndExchangeIntOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectCompareAndExchangeInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndExchangeIntOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndExchangeInt
	public PointerPointer j9gc_objaccess_mixedObjectCompareAndExchangeIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndExchangeIntOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndExchangeLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectCompareAndExchangeLongOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectCompareAndExchangeLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndExchangeLongOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndExchangeLong
	public PointerPointer j9gc_objaccess_mixedObjectCompareAndExchangeLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndExchangeLongOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndSwapInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectCompareAndSwapIntOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectCompareAndSwapInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndSwapIntOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndSwapInt
	public PointerPointer j9gc_objaccess_mixedObjectCompareAndSwapIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndSwapIntOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndSwapLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectCompareAndSwapLongOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectCompareAndSwapLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndSwapLongOffset_));
	}

	// void* j9gc_objaccess_mixedObjectCompareAndSwapLong
	public PointerPointer j9gc_objaccess_mixedObjectCompareAndSwapLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectCompareAndSwapLongOffset_));
	}

	// void* j9gc_objaccess_mixedObjectReadAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadAddressOffset_));
	}

	// void* j9gc_objaccess_mixedObjectReadAddress
	public PointerPointer j9gc_objaccess_mixedObjectReadAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadAddressOffset_));
	}

	// void* j9gc_objaccess_mixedObjectReadI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadI32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadI32
	public PointerPointer j9gc_objaccess_mixedObjectReadI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadI32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadI64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadI64
	public PointerPointer j9gc_objaccess_mixedObjectReadI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadI64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadObjectOffset_));
	}

	// void* j9gc_objaccess_mixedObjectReadObject
	public PointerPointer j9gc_objaccess_mixedObjectReadObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadObjectOffset_));
	}

	// void* j9gc_objaccess_mixedObjectReadU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadU32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadU32
	public PointerPointer j9gc_objaccess_mixedObjectReadU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadU32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectReadU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectReadU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadU64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectReadU64
	public PointerPointer j9gc_objaccess_mixedObjectReadU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectReadU64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreAddressOffset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreAddress
	public PointerPointer j9gc_objaccess_mixedObjectStoreAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreAddressOffset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreI32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreI32
	public PointerPointer j9gc_objaccess_mixedObjectStoreI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreI32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreI64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreI64
	public PointerPointer j9gc_objaccess_mixedObjectStoreI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreI64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreObjectOffset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreObject
	public PointerPointer j9gc_objaccess_mixedObjectStoreObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreObjectOffset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreU32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreU32
	public PointerPointer j9gc_objaccess_mixedObjectStoreU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreU32Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_mixedObjectStoreU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_mixedObjectStoreU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreU64Offset_));
	}

	// void* j9gc_objaccess_mixedObjectStoreU64
	public PointerPointer j9gc_objaccess_mixedObjectStoreU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_mixedObjectStoreU64Offset_));
	}

	// void* j9gc_objaccess_postStoreClassToClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_postStoreClassToClassLoaderOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_postStoreClassToClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_postStoreClassToClassLoaderOffset_));
	}

	// void* j9gc_objaccess_postStoreClassToClassLoader
	public PointerPointer j9gc_objaccess_postStoreClassToClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_postStoreClassToClassLoaderOffset_));
	}

	// void* j9gc_objaccess_readObjectFromInternalVMSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_readObjectFromInternalVMSlotOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_readObjectFromInternalVMSlot() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_readObjectFromInternalVMSlotOffset_));
	}

	// void* j9gc_objaccess_readObjectFromInternalVMSlot
	public PointerPointer j9gc_objaccess_readObjectFromInternalVMSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_readObjectFromInternalVMSlotOffset_));
	}

	// void* j9gc_objaccess_recentlyAllocatedObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_recentlyAllocatedObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_recentlyAllocatedObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_recentlyAllocatedObjectOffset_));
	}

	// void* j9gc_objaccess_recentlyAllocatedObject
	public PointerPointer j9gc_objaccess_recentlyAllocatedObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_recentlyAllocatedObjectOffset_));
	}

	// void* j9gc_objaccess_referenceGet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_referenceGetOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_referenceGet() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_referenceGetOffset_));
	}

	// void* j9gc_objaccess_referenceGet
	public PointerPointer j9gc_objaccess_referenceGetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_referenceGetOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndExchangeIntOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndExchangeInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeIntOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeInt
	public PointerPointer j9gc_objaccess_staticCompareAndExchangeIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeIntOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndExchangeLongOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndExchangeLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeLongOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeLong
	public PointerPointer j9gc_objaccess_staticCompareAndExchangeLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeLongOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndExchangeObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndExchangeObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeObjectOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndExchangeObject
	public PointerPointer j9gc_objaccess_staticCompareAndExchangeObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndExchangeObjectOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndSwapIntOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndSwapInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapIntOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapInt
	public PointerPointer j9gc_objaccess_staticCompareAndSwapIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapIntOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndSwapLongOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndSwapLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapLongOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapLong
	public PointerPointer j9gc_objaccess_staticCompareAndSwapLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapLongOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticCompareAndSwapObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticCompareAndSwapObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapObjectOffset_));
	}

	// void* j9gc_objaccess_staticCompareAndSwapObject
	public PointerPointer j9gc_objaccess_staticCompareAndSwapObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticCompareAndSwapObjectOffset_));
	}

	// void* j9gc_objaccess_staticReadAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadAddressOffset_));
	}

	// void* j9gc_objaccess_staticReadAddress
	public PointerPointer j9gc_objaccess_staticReadAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadAddressOffset_));
	}

	// void* j9gc_objaccess_staticReadI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadI32Offset_));
	}

	// void* j9gc_objaccess_staticReadI32
	public PointerPointer j9gc_objaccess_staticReadI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadI32Offset_));
	}

	// void* j9gc_objaccess_staticReadI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadI64Offset_));
	}

	// void* j9gc_objaccess_staticReadI64
	public PointerPointer j9gc_objaccess_staticReadI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadI64Offset_));
	}

	// void* j9gc_objaccess_staticReadObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadObjectOffset_));
	}

	// void* j9gc_objaccess_staticReadObject
	public PointerPointer j9gc_objaccess_staticReadObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadObjectOffset_));
	}

	// void* j9gc_objaccess_staticReadU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadU32Offset_));
	}

	// void* j9gc_objaccess_staticReadU32
	public PointerPointer j9gc_objaccess_staticReadU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadU32Offset_));
	}

	// void* j9gc_objaccess_staticReadU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticReadU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticReadU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticReadU64Offset_));
	}

	// void* j9gc_objaccess_staticReadU64
	public PointerPointer j9gc_objaccess_staticReadU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticReadU64Offset_));
	}

	// void* j9gc_objaccess_staticStoreAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreAddressOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreAddressOffset_));
	}

	// void* j9gc_objaccess_staticStoreAddress
	public PointerPointer j9gc_objaccess_staticStoreAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreAddressOffset_));
	}

	// void* j9gc_objaccess_staticStoreI32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreI32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreI32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreI32Offset_));
	}

	// void* j9gc_objaccess_staticStoreI32
	public PointerPointer j9gc_objaccess_staticStoreI32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreI32Offset_));
	}

	// void* j9gc_objaccess_staticStoreI64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreI64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreI64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreI64Offset_));
	}

	// void* j9gc_objaccess_staticStoreI64
	public PointerPointer j9gc_objaccess_staticStoreI64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreI64Offset_));
	}

	// void* j9gc_objaccess_staticStoreObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreObjectOffset_));
	}

	// void* j9gc_objaccess_staticStoreObject
	public PointerPointer j9gc_objaccess_staticStoreObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreObjectOffset_));
	}

	// void* j9gc_objaccess_staticStoreU32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreU32Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreU32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreU32Offset_));
	}

	// void* j9gc_objaccess_staticStoreU32
	public PointerPointer j9gc_objaccess_staticStoreU32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreU32Offset_));
	}

	// void* j9gc_objaccess_staticStoreU64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_staticStoreU64Offset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_staticStoreU64() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreU64Offset_));
	}

	// void* j9gc_objaccess_staticStoreU64
	public PointerPointer j9gc_objaccess_staticStoreU64EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_staticStoreU64Offset_));
	}

	// void* j9gc_objaccess_storeObjectToInternalVMSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_storeObjectToInternalVMSlotOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_storeObjectToInternalVMSlot() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_storeObjectToInternalVMSlotOffset_));
	}

	// void* j9gc_objaccess_storeObjectToInternalVMSlot
	public PointerPointer j9gc_objaccess_storeObjectToInternalVMSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_storeObjectToInternalVMSlotOffset_));
	}

	// void* j9gc_objaccess_structuralCompareFlattenedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_objaccess_structuralCompareFlattenedObjectsOffset_", declaredType="void*")
	public VoidPointer j9gc_objaccess_structuralCompareFlattenedObjects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_objaccess_structuralCompareFlattenedObjectsOffset_));
	}

	// void* j9gc_objaccess_structuralCompareFlattenedObjects
	public PointerPointer j9gc_objaccess_structuralCompareFlattenedObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_objaccess_structuralCompareFlattenedObjectsOffset_));
	}

	// void* j9gc_pool_maxmemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_pool_maxmemoryOffset_", declaredType="void*")
	public VoidPointer j9gc_pool_maxmemory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_pool_maxmemoryOffset_));
	}

	// void* j9gc_pool_maxmemory
	public PointerPointer j9gc_pool_maxmemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_pool_maxmemoryOffset_));
	}

	// void* j9gc_pool_memoryusage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_pool_memoryusageOffset_", declaredType="void*")
	public VoidPointer j9gc_pool_memoryusage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_pool_memoryusageOffset_));
	}

	// void* j9gc_pool_memoryusage
	public PointerPointer j9gc_pool_memoryusageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_pool_memoryusageOffset_));
	}

	// void* j9gc_pool_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_pool_nameOffset_", declaredType="void*")
	public VoidPointer j9gc_pool_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_pool_nameOffset_));
	}

	// void* j9gc_pool_name
	public PointerPointer j9gc_pool_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_pool_nameOffset_));
	}

	// void* j9gc_pools_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_pools_memoryOffset_", declaredType="void*")
	public VoidPointer j9gc_pools_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_pools_memoryOffset_));
	}

	// void* j9gc_pools_memory
	public PointerPointer j9gc_pools_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_pools_memoryOffset_));
	}

	// void* j9gc_runFinalizersOnExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_runFinalizersOnExitOffset_", declaredType="void*")
	public VoidPointer j9gc_runFinalizersOnExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_runFinalizersOnExitOffset_));
	}

	// void* j9gc_runFinalizersOnExit
	public PointerPointer j9gc_runFinalizersOnExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_runFinalizersOnExitOffset_));
	}

	// void* j9gc_scavenger_enabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_scavenger_enabledOffset_", declaredType="void*")
	public VoidPointer j9gc_scavenger_enabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_scavenger_enabledOffset_));
	}

	// void* j9gc_scavenger_enabled
	public PointerPointer j9gc_scavenger_enabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_scavenger_enabledOffset_));
	}

	// void* j9gc_set_allocation_sampling_interval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_set_allocation_sampling_intervalOffset_", declaredType="void*")
	public VoidPointer j9gc_set_allocation_sampling_interval() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_set_allocation_sampling_intervalOffset_));
	}

	// void* j9gc_set_allocation_sampling_interval
	public PointerPointer j9gc_set_allocation_sampling_intervalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_set_allocation_sampling_intervalOffset_));
	}

	// void* j9gc_set_allocation_threshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_set_allocation_thresholdOffset_", declaredType="void*")
	public VoidPointer j9gc_set_allocation_threshold() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_set_allocation_thresholdOffset_));
	}

	// void* j9gc_set_allocation_threshold
	public PointerPointer j9gc_set_allocation_thresholdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_set_allocation_thresholdOffset_));
	}

	// void* j9gc_set_softmx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_set_softmxOffset_", declaredType="void*")
	public VoidPointer j9gc_set_softmx() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_set_softmxOffset_));
	}

	// void* j9gc_set_softmx
	public PointerPointer j9gc_set_softmxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_set_softmxOffset_));
	}

	// void* j9gc_software_read_barrier_enabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_software_read_barrier_enabledOffset_", declaredType="void*")
	public VoidPointer j9gc_software_read_barrier_enabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_software_read_barrier_enabledOffset_));
	}

	// void* j9gc_software_read_barrier_enabled
	public PointerPointer j9gc_software_read_barrier_enabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_software_read_barrier_enabledOffset_));
	}

	// void* j9gc_stringHashEqualFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_stringHashEqualFnOffset_", declaredType="void*")
	public VoidPointer j9gc_stringHashEqualFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_stringHashEqualFnOffset_));
	}

	// void* j9gc_stringHashEqualFn
	public PointerPointer j9gc_stringHashEqualFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_stringHashEqualFnOffset_));
	}

	// void* j9gc_stringHashFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_stringHashFnOffset_", declaredType="void*")
	public VoidPointer j9gc_stringHashFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_stringHashFnOffset_));
	}

	// void* j9gc_stringHashFn
	public PointerPointer j9gc_stringHashFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_stringHashFnOffset_));
	}

	// void* j9gc_wait_for_reference_processing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_wait_for_reference_processingOffset_", declaredType="void*")
	public VoidPointer j9gc_wait_for_reference_processing() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_wait_for_reference_processingOffset_));
	}

	// void* j9gc_wait_for_reference_processing
	public PointerPointer j9gc_wait_for_reference_processingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_wait_for_reference_processingOffset_));
	}

	// void* j9gc_weakRoot_readObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_weakRoot_readObjectOffset_", declaredType="void*")
	public VoidPointer j9gc_weakRoot_readObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_weakRoot_readObjectOffset_));
	}

	// void* j9gc_weakRoot_readObject
	public PointerPointer j9gc_weakRoot_readObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_weakRoot_readObjectOffset_));
	}

	// void* j9gc_weakRoot_readObjectVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9gc_weakRoot_readObjectVMOffset_", declaredType="void*")
	public VoidPointer j9gc_weakRoot_readObjectVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9gc_weakRoot_readObjectVMOffset_));
	}

	// void* j9gc_weakRoot_readObjectVM
	public PointerPointer j9gc_weakRoot_readObjectVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9gc_weakRoot_readObjectVMOffset_));
	}

	// void* j9mm_abandon_object
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_abandon_objectOffset_", declaredType="void*")
	public VoidPointer j9mm_abandon_object() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_abandon_objectOffset_));
	}

	// void* j9mm_abandon_object
	public PointerPointer j9mm_abandon_objectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_abandon_objectOffset_));
	}

	// void* j9mm_find_region_for_pointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_find_region_for_pointerOffset_", declaredType="void*")
	public VoidPointer j9mm_find_region_for_pointer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_find_region_for_pointerOffset_));
	}

	// void* j9mm_find_region_for_pointer
	public PointerPointer j9mm_find_region_for_pointerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_find_region_for_pointerOffset_));
	}

	// void* j9mm_get_guaranteed_nursery_range
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_get_guaranteed_nursery_rangeOffset_", declaredType="void*")
	public VoidPointer j9mm_get_guaranteed_nursery_range() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_get_guaranteed_nursery_rangeOffset_));
	}

	// void* j9mm_get_guaranteed_nursery_range
	public PointerPointer j9mm_get_guaranteed_nursery_rangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_get_guaranteed_nursery_rangeOffset_));
	}

	// void* j9mm_initialize_object_descriptor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_initialize_object_descriptorOffset_", declaredType="void*")
	public VoidPointer j9mm_initialize_object_descriptor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_initialize_object_descriptorOffset_));
	}

	// void* j9mm_initialize_object_descriptor
	public PointerPointer j9mm_initialize_object_descriptorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_initialize_object_descriptorOffset_));
	}

	// void* j9mm_iterate_all_objects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_all_objectsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_all_objects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_all_objectsOffset_));
	}

	// void* j9mm_iterate_all_objects
	public PointerPointer j9mm_iterate_all_objectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_all_objectsOffset_));
	}

	// void* j9mm_iterate_all_ownable_synchronizer_objects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_all_ownable_synchronizer_objectsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_all_ownable_synchronizer_objects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_all_ownable_synchronizer_objectsOffset_));
	}

	// void* j9mm_iterate_all_ownable_synchronizer_objects
	public PointerPointer j9mm_iterate_all_ownable_synchronizer_objectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_all_ownable_synchronizer_objectsOffset_));
	}

	// void* j9mm_iterate_heaps
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_heapsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_heaps() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_heapsOffset_));
	}

	// void* j9mm_iterate_heaps
	public PointerPointer j9mm_iterate_heapsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_heapsOffset_));
	}

	// void* j9mm_iterate_object_slots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_object_slotsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_object_slots() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_object_slotsOffset_));
	}

	// void* j9mm_iterate_object_slots
	public PointerPointer j9mm_iterate_object_slotsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_object_slotsOffset_));
	}

	// void* j9mm_iterate_region_objects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_region_objectsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_region_objects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_region_objectsOffset_));
	}

	// void* j9mm_iterate_region_objects
	public PointerPointer j9mm_iterate_region_objectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_region_objectsOffset_));
	}

	// void* j9mm_iterate_regions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_regionsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_regions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_regionsOffset_));
	}

	// void* j9mm_iterate_regions
	public PointerPointer j9mm_iterate_regionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_regionsOffset_));
	}

	// void* j9mm_iterate_roots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_rootsOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_roots() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_rootsOffset_));
	}

	// void* j9mm_iterate_roots
	public PointerPointer j9mm_iterate_rootsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_rootsOffset_));
	}

	// void* j9mm_iterate_spaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9mm_iterate_spacesOffset_", declaredType="void*")
	public VoidPointer j9mm_iterate_spaces() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._j9mm_iterate_spacesOffset_));
	}

	// void* j9mm_iterate_spaces
	public PointerPointer j9mm_iterate_spacesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._j9mm_iterate_spacesOffset_));
	}

	// void* jvmPhaseChange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmPhaseChangeOffset_", declaredType="void*")
	public VoidPointer jvmPhaseChange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._jvmPhaseChangeOffset_));
	}

	// void* jvmPhaseChange
	public PointerPointer jvmPhaseChangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._jvmPhaseChangeOffset_));
	}

	// void* omrgc_get_version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrgc_get_versionOffset_", declaredType="void*")
	public VoidPointer omrgc_get_version() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._omrgc_get_versionOffset_));
	}

	// void* omrgc_get_version
	public PointerPointer omrgc_get_versionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._omrgc_get_versionOffset_));
	}

	// void* omrgc_walkLWNRLockTracePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrgc_walkLWNRLockTracePoolOffset_", declaredType="void*")
	public VoidPointer omrgc_walkLWNRLockTracePool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._omrgc_walkLWNRLockTracePoolOffset_));
	}

	// void* omrgc_walkLWNRLockTracePool
	public PointerPointer omrgc_walkLWNRLockTracePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._omrgc_walkLWNRLockTracePoolOffset_));
	}

	// void* ownableSynchronizerObjectCreated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownableSynchronizerObjectCreatedOffset_", declaredType="void*")
	public VoidPointer ownableSynchronizerObjectCreated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._ownableSynchronizerObjectCreatedOffset_));
	}

	// void* ownableSynchronizerObjectCreated
	public PointerPointer ownableSynchronizerObjectCreatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._ownableSynchronizerObjectCreatedOffset_));
	}

	// void* queryGCStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queryGCStatusOffset_", declaredType="void*")
	public VoidPointer queryGCStatus() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._queryGCStatusOffset_));
	}

	// void* queryGCStatus
	public PointerPointer queryGCStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._queryGCStatusOffset_));
	}

	// void* referenceArrayCopy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceArrayCopyOffset_", declaredType="void*")
	public VoidPointer referenceArrayCopy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._referenceArrayCopyOffset_));
	}

	// void* referenceArrayCopy
	public PointerPointer referenceArrayCopyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._referenceArrayCopyOffset_));
	}

	// void* referenceArrayCopyIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceArrayCopyIndexOffset_", declaredType="void*")
	public VoidPointer referenceArrayCopyIndex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._referenceArrayCopyIndexOffset_));
	}

	// void* referenceArrayCopyIndex
	public PointerPointer referenceArrayCopyIndexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._referenceArrayCopyIndexOffset_));
	}

	// void* runFinalization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runFinalizationOffset_", declaredType="void*")
	public VoidPointer runFinalization() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MemoryManagerFunctions._runFinalizationOffset_));
	}

	// void* runFinalization
	public PointerPointer runFinalizationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryManagerFunctions._runFinalizationOffset_));
	}

}
