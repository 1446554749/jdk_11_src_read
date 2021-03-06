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
 * Structure: jvmtiCapabilities
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
public final class jvmtiCapabilities {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _can_access_local_variables_s_;
	public static final int _can_access_local_variables_b_;
	public static final int _can_force_early_return_s_;
	public static final int _can_force_early_return_b_;
	public static final int _can_generate_all_class_hook_events_s_;
	public static final int _can_generate_all_class_hook_events_b_;
	public static final int _can_generate_breakpoint_events_s_;
	public static final int _can_generate_breakpoint_events_b_;
	public static final int _can_generate_compiled_method_load_events_s_;
	public static final int _can_generate_compiled_method_load_events_b_;
	public static final int _can_generate_early_class_hook_events_s_;
	public static final int _can_generate_early_class_hook_events_b_;
	public static final int _can_generate_early_vmstart_s_;
	public static final int _can_generate_early_vmstart_b_;
	public static final int _can_generate_exception_events_s_;
	public static final int _can_generate_exception_events_b_;
	public static final int _can_generate_field_access_events_s_;
	public static final int _can_generate_field_access_events_b_;
	public static final int _can_generate_field_modification_events_s_;
	public static final int _can_generate_field_modification_events_b_;
	public static final int _can_generate_frame_pop_events_s_;
	public static final int _can_generate_frame_pop_events_b_;
	public static final int _can_generate_garbage_collection_events_s_;
	public static final int _can_generate_garbage_collection_events_b_;
	public static final int _can_generate_method_entry_events_s_;
	public static final int _can_generate_method_entry_events_b_;
	public static final int _can_generate_method_exit_events_s_;
	public static final int _can_generate_method_exit_events_b_;
	public static final int _can_generate_monitor_events_s_;
	public static final int _can_generate_monitor_events_b_;
	public static final int _can_generate_native_method_bind_events_s_;
	public static final int _can_generate_native_method_bind_events_b_;
	public static final int _can_generate_object_free_events_s_;
	public static final int _can_generate_object_free_events_b_;
	public static final int _can_generate_resource_exhaustion_heap_events_s_;
	public static final int _can_generate_resource_exhaustion_heap_events_b_;
	public static final int _can_generate_resource_exhaustion_threads_events_s_;
	public static final int _can_generate_resource_exhaustion_threads_events_b_;
	public static final int _can_generate_sampled_object_alloc_events_s_;
	public static final int _can_generate_sampled_object_alloc_events_b_;
	public static final int _can_generate_single_step_events_s_;
	public static final int _can_generate_single_step_events_b_;
	public static final int _can_generate_vm_object_alloc_events_s_;
	public static final int _can_generate_vm_object_alloc_events_b_;
	public static final int _can_get_bytecodes_s_;
	public static final int _can_get_bytecodes_b_;
	public static final int _can_get_constant_pool_s_;
	public static final int _can_get_constant_pool_b_;
	public static final int _can_get_current_contended_monitor_s_;
	public static final int _can_get_current_contended_monitor_b_;
	public static final int _can_get_current_thread_cpu_time_s_;
	public static final int _can_get_current_thread_cpu_time_b_;
	public static final int _can_get_line_numbers_s_;
	public static final int _can_get_line_numbers_b_;
	public static final int _can_get_monitor_info_s_;
	public static final int _can_get_monitor_info_b_;
	public static final int _can_get_owned_monitor_info_s_;
	public static final int _can_get_owned_monitor_info_b_;
	public static final int _can_get_owned_monitor_stack_depth_info_s_;
	public static final int _can_get_owned_monitor_stack_depth_info_b_;
	public static final int _can_get_source_debug_extension_s_;
	public static final int _can_get_source_debug_extension_b_;
	public static final int _can_get_source_file_name_s_;
	public static final int _can_get_source_file_name_b_;
	public static final int _can_get_synthetic_attribute_s_;
	public static final int _can_get_synthetic_attribute_b_;
	public static final int _can_get_thread_cpu_time_s_;
	public static final int _can_get_thread_cpu_time_b_;
	public static final int _can_maintain_original_method_order_s_;
	public static final int _can_maintain_original_method_order_b_;
	public static final int _can_pop_frame_s_;
	public static final int _can_pop_frame_b_;
	public static final int _can_redefine_any_class_s_;
	public static final int _can_redefine_any_class_b_;
	public static final int _can_redefine_classes_s_;
	public static final int _can_redefine_classes_b_;
	public static final int _can_retransform_any_class_s_;
	public static final int _can_retransform_any_class_b_;
	public static final int _can_retransform_classes_s_;
	public static final int _can_retransform_classes_b_;
	public static final int _can_set_native_method_prefix_s_;
	public static final int _can_set_native_method_prefix_b_;
	public static final int _can_signal_thread_s_;
	public static final int _can_signal_thread_b_;
	public static final int _can_suspend_s_;
	public static final int _can_suspend_b_;
	public static final int _can_tag_objects_s_;
	public static final int _can_tag_objects_b_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_can_access_local_variables_s_ = 0;
		_can_access_local_variables_b_ = 0;
		_can_force_early_return_s_ = 0;
		_can_force_early_return_b_ = 0;
		_can_generate_all_class_hook_events_s_ = 0;
		_can_generate_all_class_hook_events_b_ = 0;
		_can_generate_breakpoint_events_s_ = 0;
		_can_generate_breakpoint_events_b_ = 0;
		_can_generate_compiled_method_load_events_s_ = 0;
		_can_generate_compiled_method_load_events_b_ = 0;
		_can_generate_early_class_hook_events_s_ = 0;
		_can_generate_early_class_hook_events_b_ = 0;
		_can_generate_early_vmstart_s_ = 0;
		_can_generate_early_vmstart_b_ = 0;
		_can_generate_exception_events_s_ = 0;
		_can_generate_exception_events_b_ = 0;
		_can_generate_field_access_events_s_ = 0;
		_can_generate_field_access_events_b_ = 0;
		_can_generate_field_modification_events_s_ = 0;
		_can_generate_field_modification_events_b_ = 0;
		_can_generate_frame_pop_events_s_ = 0;
		_can_generate_frame_pop_events_b_ = 0;
		_can_generate_garbage_collection_events_s_ = 0;
		_can_generate_garbage_collection_events_b_ = 0;
		_can_generate_method_entry_events_s_ = 0;
		_can_generate_method_entry_events_b_ = 0;
		_can_generate_method_exit_events_s_ = 0;
		_can_generate_method_exit_events_b_ = 0;
		_can_generate_monitor_events_s_ = 0;
		_can_generate_monitor_events_b_ = 0;
		_can_generate_native_method_bind_events_s_ = 0;
		_can_generate_native_method_bind_events_b_ = 0;
		_can_generate_object_free_events_s_ = 0;
		_can_generate_object_free_events_b_ = 0;
		_can_generate_resource_exhaustion_heap_events_s_ = 0;
		_can_generate_resource_exhaustion_heap_events_b_ = 0;
		_can_generate_resource_exhaustion_threads_events_s_ = 0;
		_can_generate_resource_exhaustion_threads_events_b_ = 0;
		_can_generate_sampled_object_alloc_events_s_ = 0;
		_can_generate_sampled_object_alloc_events_b_ = 0;
		_can_generate_single_step_events_s_ = 0;
		_can_generate_single_step_events_b_ = 0;
		_can_generate_vm_object_alloc_events_s_ = 0;
		_can_generate_vm_object_alloc_events_b_ = 0;
		_can_get_bytecodes_s_ = 0;
		_can_get_bytecodes_b_ = 0;
		_can_get_constant_pool_s_ = 0;
		_can_get_constant_pool_b_ = 0;
		_can_get_current_contended_monitor_s_ = 0;
		_can_get_current_contended_monitor_b_ = 0;
		_can_get_current_thread_cpu_time_s_ = 0;
		_can_get_current_thread_cpu_time_b_ = 0;
		_can_get_line_numbers_s_ = 0;
		_can_get_line_numbers_b_ = 0;
		_can_get_monitor_info_s_ = 0;
		_can_get_monitor_info_b_ = 0;
		_can_get_owned_monitor_info_s_ = 0;
		_can_get_owned_monitor_info_b_ = 0;
		_can_get_owned_monitor_stack_depth_info_s_ = 0;
		_can_get_owned_monitor_stack_depth_info_b_ = 0;
		_can_get_source_debug_extension_s_ = 0;
		_can_get_source_debug_extension_b_ = 0;
		_can_get_source_file_name_s_ = 0;
		_can_get_source_file_name_b_ = 0;
		_can_get_synthetic_attribute_s_ = 0;
		_can_get_synthetic_attribute_b_ = 0;
		_can_get_thread_cpu_time_s_ = 0;
		_can_get_thread_cpu_time_b_ = 0;
		_can_maintain_original_method_order_s_ = 0;
		_can_maintain_original_method_order_b_ = 0;
		_can_pop_frame_s_ = 0;
		_can_pop_frame_b_ = 0;
		_can_redefine_any_class_s_ = 0;
		_can_redefine_any_class_b_ = 0;
		_can_redefine_classes_s_ = 0;
		_can_redefine_classes_b_ = 0;
		_can_retransform_any_class_s_ = 0;
		_can_retransform_any_class_b_ = 0;
		_can_retransform_classes_s_ = 0;
		_can_retransform_classes_b_ = 0;
		_can_set_native_method_prefix_s_ = 0;
		_can_set_native_method_prefix_b_ = 0;
		_can_signal_thread_s_ = 0;
		_can_signal_thread_b_ = 0;
		_can_suspend_s_ = 0;
		_can_suspend_b_ = 0;
		_can_tag_objects_s_ = 0;
		_can_tag_objects_b_ = 0;
	}

}
