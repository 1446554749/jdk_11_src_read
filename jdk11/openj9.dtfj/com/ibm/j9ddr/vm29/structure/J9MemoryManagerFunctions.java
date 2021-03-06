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
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package com.ibm.j9ddr.vm29.structure;

/**
 * Structure: J9MemoryManagerFunctions
 *
 * This stub class represents a class that can return in memory offsets
 * to VM C and C++ structures.
 *
 * This particular implementation exists only to allow StructurePointer code to
 * compile at development time.  This is never loaded at run time.
 *
 * At runtime generated byte codes returning actual offset values from the core file
 * will be loaded by the StructureClassLoader.
 */
public final class J9MemoryManagerFunctions {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _J9AllocateIndexableObjectOffset_;
	public static final int _J9AllocateIndexableObjectNoGCOffset_;
	public static final int _J9AllocateObjectOffset_;
	public static final int _J9AllocateObjectNoGCOffset_;
	public static final int _J9MetronomeWriteBarrierJ9ClassStoreOffset_;
	public static final int _J9MetronomeWriteBarrierStoreOffset_;
	public static final int _J9ReadBarrierOffset_;
	public static final int _J9ReadBarrierJ9ClassOffset_;
	public static final int _J9WriteBarrierBatchStoreOffset_;
	public static final int _J9WriteBarrierJ9ClassBatchStoreOffset_;
	public static final int _J9WriteBarrierJ9ClassStoreOffset_;
	public static final int _J9WriteBarrierStoreOffset_;
	public static final int _allocateMemoryForSublistFragmentOffset_;
	public static final int _allocateZeroedTLHPagesOffset_;
	public static final int _alwaysCallReferenceArrayCopyHelperOffset_;
	public static final int _cleanupMutatorModelJavaOffset_;
	public static final int _finalizeObjectCreatedOffset_;
	public static final int _forceClassLoaderUnloadOffset_;
	public static final int _gcShutdownHeapManagementOffset_;
	public static final int _gcStartupHeapManagementOffset_;
	public static final int _getStaticObjectAllocateFlagsOffset_;
	public static final int _getVerboseGCFunctionTableOffset_;
	public static final int _initializeMutatorModelJavaOffset_;
	public static final int _isAllocateZeroedTLHPagesEnabledOffset_;
	public static final int _isStaticObjectAllocateFlagsOffset_;
	public static final int _j9gc_all_object_and_vm_slots_doOffset_;
	public static final int _j9gc_allsupported_garbagecollectorsOffset_;
	public static final int _j9gc_allsupported_memorypoolsOffset_;
	public static final int _j9gc_arraylet_getLeafLogSizeOffset_;
	public static final int _j9gc_arraylet_getLeafSizeOffset_;
	public static final int _j9gc_concurrent_getCardSizeOffset_;
	public static final int _j9gc_concurrent_getHeapBaseOffset_;
	public static final int _j9gc_concurrent_scavenger_enabledOffset_;
	public static final int _j9gc_createJavaLangStringOffset_;
	public static final int _j9gc_ext_check_is_valid_heap_objectOffset_;
	public static final int _j9gc_ext_is_markedOffset_;
	public static final int _j9gc_ext_reachable_from_object_doOffset_;
	public static final int _j9gc_ext_reachable_objects_doOffset_;
	public static final int _j9gc_finalizer_completeFinalizersOnExitOffset_;
	public static final int _j9gc_finalizer_shutdownOffset_;
	public static final int _j9gc_finalizer_startupOffset_;
	public static final int _j9gc_flush_caches_for_walkOffset_;
	public static final int _j9gc_flush_nonAllocationCaches_for_walkOffset_;
	public static final int _j9gc_garbagecollector_nameOffset_;
	public static final int _j9gc_get_CPU_timesOffset_;
	public static final int _j9gc_get_bytes_allocated_by_threadOffset_;
	public static final int _j9gc_get_collector_idOffset_;
	public static final int _j9gc_get_gc_actionOffset_;
	public static final int _j9gc_get_gc_causeOffset_;
	public static final int _j9gc_get_gcmodestringOffset_;
	public static final int _j9gc_get_hook_interfaceOffset_;
	public static final int _j9gc_get_initial_heap_sizeOffset_;
	public static final int _j9gc_get_jit_string_dedup_policyOffset_;
	public static final int _j9gc_get_maximum_heap_sizeOffset_;
	public static final int _j9gc_get_object_size_in_bytesOffset_;
	public static final int _j9gc_get_object_total_footprint_in_bytesOffset_;
	public static final int _j9gc_get_objects_pending_finalization_countOffset_;
	public static final int _j9gc_get_omr_hook_interfaceOffset_;
	public static final int _j9gc_get_overflow_safe_alloc_sizeOffset_;
	public static final int _j9gc_get_private_hook_interfaceOffset_;
	public static final int _j9gc_get_softmxOffset_;
	public static final int _j9gc_heap_free_memoryOffset_;
	public static final int _j9gc_heap_total_memoryOffset_;
	public static final int _j9gc_hot_reference_field_requiredOffset_;
	public static final int _j9gc_internStringOffset_;
	public static final int _j9gc_is_collectionusagethreshold_supportedOffset_;
	public static final int _j9gc_is_garbagecollection_disabledOffset_;
	public static final int _j9gc_is_local_collectorOffset_;
	public static final int _j9gc_is_managedpool_by_collectorOffset_;
	public static final int _j9gc_is_usagethreshold_supportedOffset_;
	public static final int _j9gc_jit_isInlineAllocationSupportedOffset_;
	public static final int _j9gc_max_hot_field_list_lengthOffset_;
	public static final int _j9gc_modron_getConfigurationValueForKeyOffset_;
	public static final int _j9gc_modron_getReadBarrierTypeOffset_;
	public static final int _j9gc_modron_getWriteBarrierTypeOffset_;
	public static final int _j9gc_modron_global_collectOffset_;
	public static final int _j9gc_modron_global_collect_with_overridesOffset_;
	public static final int _j9gc_modron_isFeatureSupportedOffset_;
	public static final int _j9gc_modron_local_collectOffset_;
	public static final int _j9gc_notifyGCOfClassReplacementOffset_;
	public static final int _j9gc_objaccess_asConstantPoolObjectOffset_;
	public static final int _j9gc_objaccess_checkClassLiveOffset_;
	public static final int _j9gc_objaccess_checkStringConstantsLiveOffset_;
	public static final int _j9gc_objaccess_cloneIndexableObjectOffset_;
	public static final int _j9gc_objaccess_cloneObjectOffset_;
	public static final int _j9gc_objaccess_compareAndExchangeObjectOffset_;
	public static final int _j9gc_objaccess_compareAndSwapObjectOffset_;
	public static final int _j9gc_objaccess_compressedPointersShadowHeapBaseOffset_;
	public static final int _j9gc_objaccess_compressedPointersShadowHeapTopOffset_;
	public static final int _j9gc_objaccess_compressedPointersShiftOffset_;
	public static final int _j9gc_objaccess_copyObjectFieldsOffset_;
	public static final int _j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementOffset_;
	public static final int _j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementOffset_;
	public static final int _j9gc_objaccess_fillArrayOfObjectsOffset_;
	public static final int _j9gc_objaccess_getArrayObjectDataAddressOffset_;
	public static final int _j9gc_objaccess_getLockwordAddressOffset_;
	public static final int _j9gc_objaccess_getObjectHashCodeOffset_;
	public static final int _j9gc_objaccess_indexableReadAddressOffset_;
	public static final int _j9gc_objaccess_indexableReadI16Offset_;
	public static final int _j9gc_objaccess_indexableReadI32Offset_;
	public static final int _j9gc_objaccess_indexableReadI64Offset_;
	public static final int _j9gc_objaccess_indexableReadI8Offset_;
	public static final int _j9gc_objaccess_indexableReadObjectOffset_;
	public static final int _j9gc_objaccess_indexableReadU16Offset_;
	public static final int _j9gc_objaccess_indexableReadU32Offset_;
	public static final int _j9gc_objaccess_indexableReadU64Offset_;
	public static final int _j9gc_objaccess_indexableReadU8Offset_;
	public static final int _j9gc_objaccess_indexableStoreAddressOffset_;
	public static final int _j9gc_objaccess_indexableStoreI16Offset_;
	public static final int _j9gc_objaccess_indexableStoreI32Offset_;
	public static final int _j9gc_objaccess_indexableStoreI64Offset_;
	public static final int _j9gc_objaccess_indexableStoreI8Offset_;
	public static final int _j9gc_objaccess_indexableStoreObjectOffset_;
	public static final int _j9gc_objaccess_indexableStoreU16Offset_;
	public static final int _j9gc_objaccess_indexableStoreU32Offset_;
	public static final int _j9gc_objaccess_indexableStoreU64Offset_;
	public static final int _j9gc_objaccess_indexableStoreU8Offset_;
	public static final int _j9gc_objaccess_jniDeleteGlobalReferenceOffset_;
	public static final int _j9gc_objaccess_jniGetPrimitiveArrayCriticalOffset_;
	public static final int _j9gc_objaccess_jniGetStringCriticalOffset_;
	public static final int _j9gc_objaccess_jniReleasePrimitiveArrayCriticalOffset_;
	public static final int _j9gc_objaccess_jniReleaseStringCriticalOffset_;
	public static final int _j9gc_objaccess_mixedObjectCompareAndExchangeIntOffset_;
	public static final int _j9gc_objaccess_mixedObjectCompareAndExchangeLongOffset_;
	public static final int _j9gc_objaccess_mixedObjectCompareAndSwapIntOffset_;
	public static final int _j9gc_objaccess_mixedObjectCompareAndSwapLongOffset_;
	public static final int _j9gc_objaccess_mixedObjectReadAddressOffset_;
	public static final int _j9gc_objaccess_mixedObjectReadI32Offset_;
	public static final int _j9gc_objaccess_mixedObjectReadI64Offset_;
	public static final int _j9gc_objaccess_mixedObjectReadObjectOffset_;
	public static final int _j9gc_objaccess_mixedObjectReadU32Offset_;
	public static final int _j9gc_objaccess_mixedObjectReadU64Offset_;
	public static final int _j9gc_objaccess_mixedObjectStoreAddressOffset_;
	public static final int _j9gc_objaccess_mixedObjectStoreI32Offset_;
	public static final int _j9gc_objaccess_mixedObjectStoreI64Offset_;
	public static final int _j9gc_objaccess_mixedObjectStoreObjectOffset_;
	public static final int _j9gc_objaccess_mixedObjectStoreU32Offset_;
	public static final int _j9gc_objaccess_mixedObjectStoreU64Offset_;
	public static final int _j9gc_objaccess_postStoreClassToClassLoaderOffset_;
	public static final int _j9gc_objaccess_readObjectFromInternalVMSlotOffset_;
	public static final int _j9gc_objaccess_recentlyAllocatedObjectOffset_;
	public static final int _j9gc_objaccess_referenceGetOffset_;
	public static final int _j9gc_objaccess_staticCompareAndExchangeIntOffset_;
	public static final int _j9gc_objaccess_staticCompareAndExchangeLongOffset_;
	public static final int _j9gc_objaccess_staticCompareAndExchangeObjectOffset_;
	public static final int _j9gc_objaccess_staticCompareAndSwapIntOffset_;
	public static final int _j9gc_objaccess_staticCompareAndSwapLongOffset_;
	public static final int _j9gc_objaccess_staticCompareAndSwapObjectOffset_;
	public static final int _j9gc_objaccess_staticReadAddressOffset_;
	public static final int _j9gc_objaccess_staticReadI32Offset_;
	public static final int _j9gc_objaccess_staticReadI64Offset_;
	public static final int _j9gc_objaccess_staticReadObjectOffset_;
	public static final int _j9gc_objaccess_staticReadU32Offset_;
	public static final int _j9gc_objaccess_staticReadU64Offset_;
	public static final int _j9gc_objaccess_staticStoreAddressOffset_;
	public static final int _j9gc_objaccess_staticStoreI32Offset_;
	public static final int _j9gc_objaccess_staticStoreI64Offset_;
	public static final int _j9gc_objaccess_staticStoreObjectOffset_;
	public static final int _j9gc_objaccess_staticStoreU32Offset_;
	public static final int _j9gc_objaccess_staticStoreU64Offset_;
	public static final int _j9gc_objaccess_storeObjectToInternalVMSlotOffset_;
	public static final int _j9gc_objaccess_structuralCompareFlattenedObjectsOffset_;
	public static final int _j9gc_pool_maxmemoryOffset_;
	public static final int _j9gc_pool_memoryusageOffset_;
	public static final int _j9gc_pool_nameOffset_;
	public static final int _j9gc_pools_memoryOffset_;
	public static final int _j9gc_runFinalizersOnExitOffset_;
	public static final int _j9gc_scavenger_enabledOffset_;
	public static final int _j9gc_set_allocation_sampling_intervalOffset_;
	public static final int _j9gc_set_allocation_thresholdOffset_;
	public static final int _j9gc_set_softmxOffset_;
	public static final int _j9gc_software_read_barrier_enabledOffset_;
	public static final int _j9gc_stringHashEqualFnOffset_;
	public static final int _j9gc_stringHashFnOffset_;
	public static final int _j9gc_wait_for_reference_processingOffset_;
	public static final int _j9gc_weakRoot_readObjectOffset_;
	public static final int _j9gc_weakRoot_readObjectVMOffset_;
	public static final int _j9mm_abandon_objectOffset_;
	public static final int _j9mm_find_region_for_pointerOffset_;
	public static final int _j9mm_get_guaranteed_nursery_rangeOffset_;
	public static final int _j9mm_initialize_object_descriptorOffset_;
	public static final int _j9mm_iterate_all_objectsOffset_;
	public static final int _j9mm_iterate_all_ownable_synchronizer_objectsOffset_;
	public static final int _j9mm_iterate_heapsOffset_;
	public static final int _j9mm_iterate_object_slotsOffset_;
	public static final int _j9mm_iterate_region_objectsOffset_;
	public static final int _j9mm_iterate_regionsOffset_;
	public static final int _j9mm_iterate_rootsOffset_;
	public static final int _j9mm_iterate_spacesOffset_;
	public static final int _jvmPhaseChangeOffset_;
	public static final int _omrgc_get_versionOffset_;
	public static final int _omrgc_walkLWNRLockTracePoolOffset_;
	public static final int _ownableSynchronizerObjectCreatedOffset_;
	public static final int _queryGCStatusOffset_;
	public static final int _referenceArrayCopyOffset_;
	public static final int _referenceArrayCopyIndexOffset_;
	public static final int _runFinalizationOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_J9AllocateIndexableObjectOffset_ = 0;
		_J9AllocateIndexableObjectNoGCOffset_ = 0;
		_J9AllocateObjectOffset_ = 0;
		_J9AllocateObjectNoGCOffset_ = 0;
		_J9MetronomeWriteBarrierJ9ClassStoreOffset_ = 0;
		_J9MetronomeWriteBarrierStoreOffset_ = 0;
		_J9ReadBarrierOffset_ = 0;
		_J9ReadBarrierJ9ClassOffset_ = 0;
		_J9WriteBarrierBatchStoreOffset_ = 0;
		_J9WriteBarrierJ9ClassBatchStoreOffset_ = 0;
		_J9WriteBarrierJ9ClassStoreOffset_ = 0;
		_J9WriteBarrierStoreOffset_ = 0;
		_allocateMemoryForSublistFragmentOffset_ = 0;
		_allocateZeroedTLHPagesOffset_ = 0;
		_alwaysCallReferenceArrayCopyHelperOffset_ = 0;
		_cleanupMutatorModelJavaOffset_ = 0;
		_finalizeObjectCreatedOffset_ = 0;
		_forceClassLoaderUnloadOffset_ = 0;
		_gcShutdownHeapManagementOffset_ = 0;
		_gcStartupHeapManagementOffset_ = 0;
		_getStaticObjectAllocateFlagsOffset_ = 0;
		_getVerboseGCFunctionTableOffset_ = 0;
		_initializeMutatorModelJavaOffset_ = 0;
		_isAllocateZeroedTLHPagesEnabledOffset_ = 0;
		_isStaticObjectAllocateFlagsOffset_ = 0;
		_j9gc_all_object_and_vm_slots_doOffset_ = 0;
		_j9gc_allsupported_garbagecollectorsOffset_ = 0;
		_j9gc_allsupported_memorypoolsOffset_ = 0;
		_j9gc_arraylet_getLeafLogSizeOffset_ = 0;
		_j9gc_arraylet_getLeafSizeOffset_ = 0;
		_j9gc_concurrent_getCardSizeOffset_ = 0;
		_j9gc_concurrent_getHeapBaseOffset_ = 0;
		_j9gc_concurrent_scavenger_enabledOffset_ = 0;
		_j9gc_createJavaLangStringOffset_ = 0;
		_j9gc_ext_check_is_valid_heap_objectOffset_ = 0;
		_j9gc_ext_is_markedOffset_ = 0;
		_j9gc_ext_reachable_from_object_doOffset_ = 0;
		_j9gc_ext_reachable_objects_doOffset_ = 0;
		_j9gc_finalizer_completeFinalizersOnExitOffset_ = 0;
		_j9gc_finalizer_shutdownOffset_ = 0;
		_j9gc_finalizer_startupOffset_ = 0;
		_j9gc_flush_caches_for_walkOffset_ = 0;
		_j9gc_flush_nonAllocationCaches_for_walkOffset_ = 0;
		_j9gc_garbagecollector_nameOffset_ = 0;
		_j9gc_get_CPU_timesOffset_ = 0;
		_j9gc_get_bytes_allocated_by_threadOffset_ = 0;
		_j9gc_get_collector_idOffset_ = 0;
		_j9gc_get_gc_actionOffset_ = 0;
		_j9gc_get_gc_causeOffset_ = 0;
		_j9gc_get_gcmodestringOffset_ = 0;
		_j9gc_get_hook_interfaceOffset_ = 0;
		_j9gc_get_initial_heap_sizeOffset_ = 0;
		_j9gc_get_jit_string_dedup_policyOffset_ = 0;
		_j9gc_get_maximum_heap_sizeOffset_ = 0;
		_j9gc_get_object_size_in_bytesOffset_ = 0;
		_j9gc_get_object_total_footprint_in_bytesOffset_ = 0;
		_j9gc_get_objects_pending_finalization_countOffset_ = 0;
		_j9gc_get_omr_hook_interfaceOffset_ = 0;
		_j9gc_get_overflow_safe_alloc_sizeOffset_ = 0;
		_j9gc_get_private_hook_interfaceOffset_ = 0;
		_j9gc_get_softmxOffset_ = 0;
		_j9gc_heap_free_memoryOffset_ = 0;
		_j9gc_heap_total_memoryOffset_ = 0;
		_j9gc_hot_reference_field_requiredOffset_ = 0;
		_j9gc_internStringOffset_ = 0;
		_j9gc_is_collectionusagethreshold_supportedOffset_ = 0;
		_j9gc_is_garbagecollection_disabledOffset_ = 0;
		_j9gc_is_local_collectorOffset_ = 0;
		_j9gc_is_managedpool_by_collectorOffset_ = 0;
		_j9gc_is_usagethreshold_supportedOffset_ = 0;
		_j9gc_jit_isInlineAllocationSupportedOffset_ = 0;
		_j9gc_max_hot_field_list_lengthOffset_ = 0;
		_j9gc_modron_getConfigurationValueForKeyOffset_ = 0;
		_j9gc_modron_getReadBarrierTypeOffset_ = 0;
		_j9gc_modron_getWriteBarrierTypeOffset_ = 0;
		_j9gc_modron_global_collectOffset_ = 0;
		_j9gc_modron_global_collect_with_overridesOffset_ = 0;
		_j9gc_modron_isFeatureSupportedOffset_ = 0;
		_j9gc_modron_local_collectOffset_ = 0;
		_j9gc_notifyGCOfClassReplacementOffset_ = 0;
		_j9gc_objaccess_asConstantPoolObjectOffset_ = 0;
		_j9gc_objaccess_checkClassLiveOffset_ = 0;
		_j9gc_objaccess_checkStringConstantsLiveOffset_ = 0;
		_j9gc_objaccess_cloneIndexableObjectOffset_ = 0;
		_j9gc_objaccess_cloneObjectOffset_ = 0;
		_j9gc_objaccess_compareAndExchangeObjectOffset_ = 0;
		_j9gc_objaccess_compareAndSwapObjectOffset_ = 0;
		_j9gc_objaccess_compressedPointersShadowHeapBaseOffset_ = 0;
		_j9gc_objaccess_compressedPointersShadowHeapTopOffset_ = 0;
		_j9gc_objaccess_compressedPointersShiftOffset_ = 0;
		_j9gc_objaccess_copyObjectFieldsOffset_ = 0;
		_j9gc_objaccess_copyObjectFieldsFromFlattenedArrayElementOffset_ = 0;
		_j9gc_objaccess_copyObjectFieldsToFlattenedArrayElementOffset_ = 0;
		_j9gc_objaccess_fillArrayOfObjectsOffset_ = 0;
		_j9gc_objaccess_getArrayObjectDataAddressOffset_ = 0;
		_j9gc_objaccess_getLockwordAddressOffset_ = 0;
		_j9gc_objaccess_getObjectHashCodeOffset_ = 0;
		_j9gc_objaccess_indexableReadAddressOffset_ = 0;
		_j9gc_objaccess_indexableReadI16Offset_ = 0;
		_j9gc_objaccess_indexableReadI32Offset_ = 0;
		_j9gc_objaccess_indexableReadI64Offset_ = 0;
		_j9gc_objaccess_indexableReadI8Offset_ = 0;
		_j9gc_objaccess_indexableReadObjectOffset_ = 0;
		_j9gc_objaccess_indexableReadU16Offset_ = 0;
		_j9gc_objaccess_indexableReadU32Offset_ = 0;
		_j9gc_objaccess_indexableReadU64Offset_ = 0;
		_j9gc_objaccess_indexableReadU8Offset_ = 0;
		_j9gc_objaccess_indexableStoreAddressOffset_ = 0;
		_j9gc_objaccess_indexableStoreI16Offset_ = 0;
		_j9gc_objaccess_indexableStoreI32Offset_ = 0;
		_j9gc_objaccess_indexableStoreI64Offset_ = 0;
		_j9gc_objaccess_indexableStoreI8Offset_ = 0;
		_j9gc_objaccess_indexableStoreObjectOffset_ = 0;
		_j9gc_objaccess_indexableStoreU16Offset_ = 0;
		_j9gc_objaccess_indexableStoreU32Offset_ = 0;
		_j9gc_objaccess_indexableStoreU64Offset_ = 0;
		_j9gc_objaccess_indexableStoreU8Offset_ = 0;
		_j9gc_objaccess_jniDeleteGlobalReferenceOffset_ = 0;
		_j9gc_objaccess_jniGetPrimitiveArrayCriticalOffset_ = 0;
		_j9gc_objaccess_jniGetStringCriticalOffset_ = 0;
		_j9gc_objaccess_jniReleasePrimitiveArrayCriticalOffset_ = 0;
		_j9gc_objaccess_jniReleaseStringCriticalOffset_ = 0;
		_j9gc_objaccess_mixedObjectCompareAndExchangeIntOffset_ = 0;
		_j9gc_objaccess_mixedObjectCompareAndExchangeLongOffset_ = 0;
		_j9gc_objaccess_mixedObjectCompareAndSwapIntOffset_ = 0;
		_j9gc_objaccess_mixedObjectCompareAndSwapLongOffset_ = 0;
		_j9gc_objaccess_mixedObjectReadAddressOffset_ = 0;
		_j9gc_objaccess_mixedObjectReadI32Offset_ = 0;
		_j9gc_objaccess_mixedObjectReadI64Offset_ = 0;
		_j9gc_objaccess_mixedObjectReadObjectOffset_ = 0;
		_j9gc_objaccess_mixedObjectReadU32Offset_ = 0;
		_j9gc_objaccess_mixedObjectReadU64Offset_ = 0;
		_j9gc_objaccess_mixedObjectStoreAddressOffset_ = 0;
		_j9gc_objaccess_mixedObjectStoreI32Offset_ = 0;
		_j9gc_objaccess_mixedObjectStoreI64Offset_ = 0;
		_j9gc_objaccess_mixedObjectStoreObjectOffset_ = 0;
		_j9gc_objaccess_mixedObjectStoreU32Offset_ = 0;
		_j9gc_objaccess_mixedObjectStoreU64Offset_ = 0;
		_j9gc_objaccess_postStoreClassToClassLoaderOffset_ = 0;
		_j9gc_objaccess_readObjectFromInternalVMSlotOffset_ = 0;
		_j9gc_objaccess_recentlyAllocatedObjectOffset_ = 0;
		_j9gc_objaccess_referenceGetOffset_ = 0;
		_j9gc_objaccess_staticCompareAndExchangeIntOffset_ = 0;
		_j9gc_objaccess_staticCompareAndExchangeLongOffset_ = 0;
		_j9gc_objaccess_staticCompareAndExchangeObjectOffset_ = 0;
		_j9gc_objaccess_staticCompareAndSwapIntOffset_ = 0;
		_j9gc_objaccess_staticCompareAndSwapLongOffset_ = 0;
		_j9gc_objaccess_staticCompareAndSwapObjectOffset_ = 0;
		_j9gc_objaccess_staticReadAddressOffset_ = 0;
		_j9gc_objaccess_staticReadI32Offset_ = 0;
		_j9gc_objaccess_staticReadI64Offset_ = 0;
		_j9gc_objaccess_staticReadObjectOffset_ = 0;
		_j9gc_objaccess_staticReadU32Offset_ = 0;
		_j9gc_objaccess_staticReadU64Offset_ = 0;
		_j9gc_objaccess_staticStoreAddressOffset_ = 0;
		_j9gc_objaccess_staticStoreI32Offset_ = 0;
		_j9gc_objaccess_staticStoreI64Offset_ = 0;
		_j9gc_objaccess_staticStoreObjectOffset_ = 0;
		_j9gc_objaccess_staticStoreU32Offset_ = 0;
		_j9gc_objaccess_staticStoreU64Offset_ = 0;
		_j9gc_objaccess_storeObjectToInternalVMSlotOffset_ = 0;
		_j9gc_objaccess_structuralCompareFlattenedObjectsOffset_ = 0;
		_j9gc_pool_maxmemoryOffset_ = 0;
		_j9gc_pool_memoryusageOffset_ = 0;
		_j9gc_pool_nameOffset_ = 0;
		_j9gc_pools_memoryOffset_ = 0;
		_j9gc_runFinalizersOnExitOffset_ = 0;
		_j9gc_scavenger_enabledOffset_ = 0;
		_j9gc_set_allocation_sampling_intervalOffset_ = 0;
		_j9gc_set_allocation_thresholdOffset_ = 0;
		_j9gc_set_softmxOffset_ = 0;
		_j9gc_software_read_barrier_enabledOffset_ = 0;
		_j9gc_stringHashEqualFnOffset_ = 0;
		_j9gc_stringHashFnOffset_ = 0;
		_j9gc_wait_for_reference_processingOffset_ = 0;
		_j9gc_weakRoot_readObjectOffset_ = 0;
		_j9gc_weakRoot_readObjectVMOffset_ = 0;
		_j9mm_abandon_objectOffset_ = 0;
		_j9mm_find_region_for_pointerOffset_ = 0;
		_j9mm_get_guaranteed_nursery_rangeOffset_ = 0;
		_j9mm_initialize_object_descriptorOffset_ = 0;
		_j9mm_iterate_all_objectsOffset_ = 0;
		_j9mm_iterate_all_ownable_synchronizer_objectsOffset_ = 0;
		_j9mm_iterate_heapsOffset_ = 0;
		_j9mm_iterate_object_slotsOffset_ = 0;
		_j9mm_iterate_region_objectsOffset_ = 0;
		_j9mm_iterate_regionsOffset_ = 0;
		_j9mm_iterate_rootsOffset_ = 0;
		_j9mm_iterate_spacesOffset_ = 0;
		_jvmPhaseChangeOffset_ = 0;
		_omrgc_get_versionOffset_ = 0;
		_omrgc_walkLWNRLockTracePoolOffset_ = 0;
		_ownableSynchronizerObjectCreatedOffset_ = 0;
		_queryGCStatusOffset_ = 0;
		_referenceArrayCopyOffset_ = 0;
		_referenceArrayCopyIndexOffset_ = 0;
		_runFinalizationOffset_ = 0;
	}

}
