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
 * Structure: jvmtiCapabilitiesPointer
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
 * The generated code will provide getters for all elements in the jvmtiCapabilitiesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiCapabilities.class)
public class jvmtiCapabilitiesPointer extends StructurePointer {

	// NULL
	public static final jvmtiCapabilitiesPointer NULL = new jvmtiCapabilitiesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiCapabilitiesPointer(long address) {
		super(address);
	}

	public static jvmtiCapabilitiesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiCapabilitiesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiCapabilitiesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiCapabilitiesPointer(address);
	}

	public jvmtiCapabilitiesPointer add(long count) {
		return jvmtiCapabilitiesPointer.cast(address + (jvmtiCapabilities.SIZEOF * count));
	}

	public jvmtiCapabilitiesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiCapabilitiesPointer addOffset(long offset) {
		return jvmtiCapabilitiesPointer.cast(address + offset);
	}

	public jvmtiCapabilitiesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiCapabilitiesPointer sub(long count) {
		return jvmtiCapabilitiesPointer.cast(address - (jvmtiCapabilities.SIZEOF * count));
	}

	public jvmtiCapabilitiesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiCapabilitiesPointer subOffset(long offset) {
		return jvmtiCapabilitiesPointer.cast(address - offset);
	}

	public jvmtiCapabilitiesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiCapabilitiesPointer untag(long mask) {
		return jvmtiCapabilitiesPointer.cast(address & ~mask);
	}

	public jvmtiCapabilitiesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiCapabilities.SIZEOF;
	}

	// Implementation methods

	// U32:1 can_access_local_variables
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_access_local_variablesOffset_", declaredType="U32:1")
	public UDATA can_access_local_variables() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_access_local_variables_s_, jvmtiCapabilities._can_access_local_variables_b_);
	}

	// U32:1 can_force_early_return
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_force_early_returnOffset_", declaredType="U32:1")
	public UDATA can_force_early_return() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_force_early_return_s_, jvmtiCapabilities._can_force_early_return_b_);
	}

	// U32:1 can_generate_all_class_hook_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_all_class_hook_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_all_class_hook_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_all_class_hook_events_s_, jvmtiCapabilities._can_generate_all_class_hook_events_b_);
	}

	// U32:1 can_generate_breakpoint_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_breakpoint_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_breakpoint_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_breakpoint_events_s_, jvmtiCapabilities._can_generate_breakpoint_events_b_);
	}

	// U32:1 can_generate_compiled_method_load_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_compiled_method_load_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_compiled_method_load_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_compiled_method_load_events_s_, jvmtiCapabilities._can_generate_compiled_method_load_events_b_);
	}

	// U32:1 can_generate_early_class_hook_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_early_class_hook_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_early_class_hook_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_early_class_hook_events_s_, jvmtiCapabilities._can_generate_early_class_hook_events_b_);
	}

	// U32:1 can_generate_early_vmstart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_early_vmstartOffset_", declaredType="U32:1")
	public UDATA can_generate_early_vmstart() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_early_vmstart_s_, jvmtiCapabilities._can_generate_early_vmstart_b_);
	}

	// U32:1 can_generate_exception_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_exception_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_exception_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_exception_events_s_, jvmtiCapabilities._can_generate_exception_events_b_);
	}

	// U32:1 can_generate_field_access_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_field_access_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_field_access_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_field_access_events_s_, jvmtiCapabilities._can_generate_field_access_events_b_);
	}

	// U32:1 can_generate_field_modification_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_field_modification_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_field_modification_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_field_modification_events_s_, jvmtiCapabilities._can_generate_field_modification_events_b_);
	}

	// U32:1 can_generate_frame_pop_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_frame_pop_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_frame_pop_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_frame_pop_events_s_, jvmtiCapabilities._can_generate_frame_pop_events_b_);
	}

	// U32:1 can_generate_garbage_collection_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_garbage_collection_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_garbage_collection_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_garbage_collection_events_s_, jvmtiCapabilities._can_generate_garbage_collection_events_b_);
	}

	// U32:1 can_generate_method_entry_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_method_entry_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_method_entry_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_method_entry_events_s_, jvmtiCapabilities._can_generate_method_entry_events_b_);
	}

	// U32:1 can_generate_method_exit_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_method_exit_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_method_exit_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_method_exit_events_s_, jvmtiCapabilities._can_generate_method_exit_events_b_);
	}

	// U32:1 can_generate_monitor_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_monitor_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_monitor_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_monitor_events_s_, jvmtiCapabilities._can_generate_monitor_events_b_);
	}

	// U32:1 can_generate_native_method_bind_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_native_method_bind_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_native_method_bind_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_native_method_bind_events_s_, jvmtiCapabilities._can_generate_native_method_bind_events_b_);
	}

	// U32:1 can_generate_object_free_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_object_free_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_object_free_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_object_free_events_s_, jvmtiCapabilities._can_generate_object_free_events_b_);
	}

	// U32:1 can_generate_resource_exhaustion_heap_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_resource_exhaustion_heap_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_resource_exhaustion_heap_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_resource_exhaustion_heap_events_s_, jvmtiCapabilities._can_generate_resource_exhaustion_heap_events_b_);
	}

	// U32:1 can_generate_resource_exhaustion_threads_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_resource_exhaustion_threads_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_resource_exhaustion_threads_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_resource_exhaustion_threads_events_s_, jvmtiCapabilities._can_generate_resource_exhaustion_threads_events_b_);
	}

	// U32:1 can_generate_sampled_object_alloc_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_sampled_object_alloc_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_sampled_object_alloc_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_sampled_object_alloc_events_s_, jvmtiCapabilities._can_generate_sampled_object_alloc_events_b_);
	}

	// U32:1 can_generate_single_step_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_single_step_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_single_step_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_single_step_events_s_, jvmtiCapabilities._can_generate_single_step_events_b_);
	}

	// U32:1 can_generate_vm_object_alloc_events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_generate_vm_object_alloc_eventsOffset_", declaredType="U32:1")
	public UDATA can_generate_vm_object_alloc_events() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_generate_vm_object_alloc_events_s_, jvmtiCapabilities._can_generate_vm_object_alloc_events_b_);
	}

	// U32:1 can_get_bytecodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_bytecodesOffset_", declaredType="U32:1")
	public UDATA can_get_bytecodes() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_bytecodes_s_, jvmtiCapabilities._can_get_bytecodes_b_);
	}

	// U32:1 can_get_constant_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_constant_poolOffset_", declaredType="U32:1")
	public UDATA can_get_constant_pool() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_constant_pool_s_, jvmtiCapabilities._can_get_constant_pool_b_);
	}

	// U32:1 can_get_current_contended_monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_current_contended_monitorOffset_", declaredType="U32:1")
	public UDATA can_get_current_contended_monitor() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_current_contended_monitor_s_, jvmtiCapabilities._can_get_current_contended_monitor_b_);
	}

	// U32:1 can_get_current_thread_cpu_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_current_thread_cpu_timeOffset_", declaredType="U32:1")
	public UDATA can_get_current_thread_cpu_time() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_current_thread_cpu_time_s_, jvmtiCapabilities._can_get_current_thread_cpu_time_b_);
	}

	// U32:1 can_get_line_numbers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_line_numbersOffset_", declaredType="U32:1")
	public UDATA can_get_line_numbers() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_line_numbers_s_, jvmtiCapabilities._can_get_line_numbers_b_);
	}

	// U32:1 can_get_monitor_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_monitor_infoOffset_", declaredType="U32:1")
	public UDATA can_get_monitor_info() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_monitor_info_s_, jvmtiCapabilities._can_get_monitor_info_b_);
	}

	// U32:1 can_get_owned_monitor_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_owned_monitor_infoOffset_", declaredType="U32:1")
	public UDATA can_get_owned_monitor_info() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_owned_monitor_info_s_, jvmtiCapabilities._can_get_owned_monitor_info_b_);
	}

	// U32:1 can_get_owned_monitor_stack_depth_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_owned_monitor_stack_depth_infoOffset_", declaredType="U32:1")
	public UDATA can_get_owned_monitor_stack_depth_info() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_owned_monitor_stack_depth_info_s_, jvmtiCapabilities._can_get_owned_monitor_stack_depth_info_b_);
	}

	// U32:1 can_get_source_debug_extension
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_source_debug_extensionOffset_", declaredType="U32:1")
	public UDATA can_get_source_debug_extension() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_source_debug_extension_s_, jvmtiCapabilities._can_get_source_debug_extension_b_);
	}

	// U32:1 can_get_source_file_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_source_file_nameOffset_", declaredType="U32:1")
	public UDATA can_get_source_file_name() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_source_file_name_s_, jvmtiCapabilities._can_get_source_file_name_b_);
	}

	// U32:1 can_get_synthetic_attribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_synthetic_attributeOffset_", declaredType="U32:1")
	public UDATA can_get_synthetic_attribute() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_synthetic_attribute_s_, jvmtiCapabilities._can_get_synthetic_attribute_b_);
	}

	// U32:1 can_get_thread_cpu_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_get_thread_cpu_timeOffset_", declaredType="U32:1")
	public UDATA can_get_thread_cpu_time() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_get_thread_cpu_time_s_, jvmtiCapabilities._can_get_thread_cpu_time_b_);
	}

	// U32:1 can_maintain_original_method_order
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_maintain_original_method_orderOffset_", declaredType="U32:1")
	public UDATA can_maintain_original_method_order() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_maintain_original_method_order_s_, jvmtiCapabilities._can_maintain_original_method_order_b_);
	}

	// U32:1 can_pop_frame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_pop_frameOffset_", declaredType="U32:1")
	public UDATA can_pop_frame() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_pop_frame_s_, jvmtiCapabilities._can_pop_frame_b_);
	}

	// U32:1 can_redefine_any_class
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_redefine_any_classOffset_", declaredType="U32:1")
	public UDATA can_redefine_any_class() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_redefine_any_class_s_, jvmtiCapabilities._can_redefine_any_class_b_);
	}

	// U32:1 can_redefine_classes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_redefine_classesOffset_", declaredType="U32:1")
	public UDATA can_redefine_classes() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_redefine_classes_s_, jvmtiCapabilities._can_redefine_classes_b_);
	}

	// U32:1 can_retransform_any_class
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_retransform_any_classOffset_", declaredType="U32:1")
	public UDATA can_retransform_any_class() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_retransform_any_class_s_, jvmtiCapabilities._can_retransform_any_class_b_);
	}

	// U32:1 can_retransform_classes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_retransform_classesOffset_", declaredType="U32:1")
	public UDATA can_retransform_classes() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_retransform_classes_s_, jvmtiCapabilities._can_retransform_classes_b_);
	}

	// U32:1 can_set_native_method_prefix
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_set_native_method_prefixOffset_", declaredType="U32:1")
	public UDATA can_set_native_method_prefix() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_set_native_method_prefix_s_, jvmtiCapabilities._can_set_native_method_prefix_b_);
	}

	// U32:1 can_signal_thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_signal_threadOffset_", declaredType="U32:1")
	public UDATA can_signal_thread() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_signal_thread_s_, jvmtiCapabilities._can_signal_thread_b_);
	}

	// U32:1 can_suspend
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_suspendOffset_", declaredType="U32:1")
	public UDATA can_suspend() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_suspend_s_, jvmtiCapabilities._can_suspend_b_);
	}

	// U32:1 can_tag_objects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_can_tag_objectsOffset_", declaredType="U32:1")
	public UDATA can_tag_objects() throws CorruptDataException {
		return getU32Bitfield(jvmtiCapabilities._can_tag_objects_s_, jvmtiCapabilities._can_tag_objects_b_);
	}

}
