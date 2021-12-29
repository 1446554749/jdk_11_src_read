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
package com.ibm.j9ddr.vm29.pointer.generated;
import java.lang.reflect.Field;
import java.util.HashSet;

/**
 * Structure: J9StackWalkFlags
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
 * The generated code will provide getters for all elements in the J9StackWalkFlags
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
public final class J9StackWalkFlags {

	// Do not instantiate constant classes
	private J9StackWalkFlags() {
	}

	// Build Flags
	public static final boolean J9SW_ARGUMENT_REGISTER_COUNT_DEFINED;
	public static final boolean J9SW_JIT_CALLEE_PRESERVED_SIZE_DEFINED;
	public static final boolean J9SW_JIT_FIRST_RESOLVE_PARM_REGISTER_DEFINED;
	public static final boolean J9SW_JIT_FLOATS_PASSED_AS_DOUBLES;
	public static final boolean J9SW_JIT_FLOATS_PASSED_AS_DOUBLES_DEFINED;
	public static final boolean J9SW_JIT_FLOAT_ARGUMENT_REGISTER_COUNT_DEFINED;
	public static final boolean J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK;
	public static final boolean J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK_DEFINED;
	public static final boolean J9SW_JIT_LOOKUP_INTERFACE_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED;
	public static final boolean J9SW_JIT_RETURN_TABLE_SIZE_DEFINED;
	public static final boolean J9SW_JIT_STACK_SLOTS_USED_BY_CALL_DEFINED;
	public static final boolean J9SW_JIT_VIRTUAL_METHOD_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED;
	public static final boolean J9SW_LOWEST_MEMORY_PRESERVED_REGISTER_DEFINED;
	public static final boolean J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP;
	public static final boolean J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP_DEFINED;
	public static final boolean J9SW_NEEDS_JIT_2_INTERP_THUNKS;
	public static final boolean J9SW_NEEDS_JIT_2_INTERP_THUNKS_DEFINED;
	public static final boolean J9SW_PARAMETERS_IN_REGISTERS;
	public static final boolean J9SW_PARAMETERS_IN_REGISTERS_DEFINED;
	public static final boolean J9SW_POTENTIAL_SAVED_REGISTERS_DEFINED;
	public static final boolean J9SW_REGISTER_MAP_MASK_DEFINED;
	public static final boolean J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH;
	public static final boolean J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH_DEFINED;
	public static final boolean J9_JNI_PUSHED_REFERENCE_COUNT_MASK_DEFINED;
	public static final boolean J9_STACK_FLAGS_CALL_OUT_FRAME_ALLOCATED_DEFINED;
	public static final boolean J9_STACK_FLAGS_EXIT_TRACEPOINT_LEVEL3_DEFINED;
	public static final boolean J9_STACK_FLAGS_J2_IFRAME_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_ALLOCATION_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_BEFORE_ANEWARRAY_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_BEFORE_MULTIANEWARRAY_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_CALL_IN_FRAME_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_CALL_IN_TYPE_J2_I_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_CALL_IN_TYPE_METHODTYPE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_DATA_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_EXCEPTION_CATCH_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_FAILED_METHOD_MONITOR_ENTER_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_FRAME_SUB_TYPE_MASK_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_GENERIC_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_INDUCE_OSR_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_INTERFACE_METHOD_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_JNI_CALL_OUT_FRAME_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_LOOKUP_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_METHOD_MONITOR_ENTER_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_MONITOR_ENTER_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_NATIVE_TRANSITION_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_RECOMPILATION_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_RESOLVE_FRAME_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_RUNTIME_HELPER_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_SPECIAL_METHOD_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_STACK_OVERFLOW_RESOLVE_FRAME_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_STATIC_METHOD_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_TRANSITION_TO_INTERPRETER_MASK_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_UNUSED_0x04000000_DEFINED;
	public static final boolean J9_STACK_FLAGS_JIT_VIRTUAL_METHOD_RESOLVE_DEFINED;
	public static final boolean J9_STACK_FLAGS_JNI_REFS_REDIRECTED_DEFINED;
	public static final boolean J9_STACK_FLAGS_METHOD_ENTRY_DEFINED;
	public static final boolean J9_STACK_FLAGS_RELEASE_VMACCESS_DEFINED;
	public static final boolean J9_STACK_FLAGS_RETURNS_OBJECT_DEFINED;
	public static final boolean J9_STACK_FLAGS_UNUSED_0x2_DEFINED;
	public static final boolean J9_STACK_FLAGS_UNUSED_0x80000000_DEFINED;
	public static final boolean J9_STACK_FLAGS_USE_SPECIFIED_CLASS_LOADER_DEFINED;
	public static final boolean J9_STACK_INVISIBLE_FRAME_DEFINED;
	public static final boolean J9_STACK_REPORT_FRAME_POP_DEFINED;

	static {
		HashSet<String> flags$ = new HashSet<>();

		try {
			ClassLoader loader$ = J9StackWalkFlags.class.getClassLoader();
			if (!(loader$ instanceof com.ibm.j9ddr.J9DDRClassLoader)) {
				throw new IllegalArgumentException("Cannot determine the runtime loader");
			}
			Class<?> runtimeClass = ((com.ibm.j9ddr.J9DDRClassLoader) loader$).loadClassRelativeToStream("structure.J9StackWalkFlags", false);
			for (Field field : runtimeClass.getFields()) {
				if (field.getLong(runtimeClass) != 0) {
					flags$.add(field.getName());
				}
			}
		} catch (ClassNotFoundException | IllegalAccessException e) {
			throw new IllegalArgumentException(String.format("Can not initialize flags from core file.%n%s", e.getMessage()));
		}

		J9SW_ARGUMENT_REGISTER_COUNT_DEFINED = flags$.contains("J9SW_ARGUMENT_REGISTER_COUNT_DEFINED");
		J9SW_JIT_CALLEE_PRESERVED_SIZE_DEFINED = flags$.contains("J9SW_JIT_CALLEE_PRESERVED_SIZE_DEFINED");
		J9SW_JIT_FIRST_RESOLVE_PARM_REGISTER_DEFINED = flags$.contains("J9SW_JIT_FIRST_RESOLVE_PARM_REGISTER_DEFINED");
		J9SW_JIT_FLOATS_PASSED_AS_DOUBLES = flags$.contains("J9SW_JIT_FLOATS_PASSED_AS_DOUBLES");
		J9SW_JIT_FLOATS_PASSED_AS_DOUBLES_DEFINED = flags$.contains("J9SW_JIT_FLOATS_PASSED_AS_DOUBLES_DEFINED");
		J9SW_JIT_FLOAT_ARGUMENT_REGISTER_COUNT_DEFINED = flags$.contains("J9SW_JIT_FLOAT_ARGUMENT_REGISTER_COUNT_DEFINED");
		J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK = flags$.contains("J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK");
		J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK_DEFINED = flags$.contains("J9SW_JIT_HELPERS_PASS_PARAMETERS_ON_STACK_DEFINED");
		J9SW_JIT_LOOKUP_INTERFACE_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED = flags$.contains("J9SW_JIT_LOOKUP_INTERFACE_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED");
		J9SW_JIT_RETURN_TABLE_SIZE_DEFINED = flags$.contains("J9SW_JIT_RETURN_TABLE_SIZE_DEFINED");
		J9SW_JIT_STACK_SLOTS_USED_BY_CALL_DEFINED = flags$.contains("J9SW_JIT_STACK_SLOTS_USED_BY_CALL_DEFINED");
		J9SW_JIT_VIRTUAL_METHOD_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED = flags$.contains("J9SW_JIT_VIRTUAL_METHOD_RESOLVE_OFFSET_TO_SAVED_RECEIVER_DEFINED");
		J9SW_LOWEST_MEMORY_PRESERVED_REGISTER_DEFINED = flags$.contains("J9SW_LOWEST_MEMORY_PRESERVED_REGISTER_DEFINED");
		J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP = flags$.contains("J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP");
		J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP_DEFINED = flags$.contains("J9SW_NEEDS_JIT_2_INTERP_CALLEE_ARG_POP_DEFINED");
		J9SW_NEEDS_JIT_2_INTERP_THUNKS = flags$.contains("J9SW_NEEDS_JIT_2_INTERP_THUNKS");
		J9SW_NEEDS_JIT_2_INTERP_THUNKS_DEFINED = flags$.contains("J9SW_NEEDS_JIT_2_INTERP_THUNKS_DEFINED");
		J9SW_PARAMETERS_IN_REGISTERS = flags$.contains("J9SW_PARAMETERS_IN_REGISTERS");
		J9SW_PARAMETERS_IN_REGISTERS_DEFINED = flags$.contains("J9SW_PARAMETERS_IN_REGISTERS_DEFINED");
		J9SW_POTENTIAL_SAVED_REGISTERS_DEFINED = flags$.contains("J9SW_POTENTIAL_SAVED_REGISTERS_DEFINED");
		J9SW_REGISTER_MAP_MASK_DEFINED = flags$.contains("J9SW_REGISTER_MAP_MASK_DEFINED");
		J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH = flags$.contains("J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH");
		J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH_DEFINED = flags$.contains("J9SW_REGISTER_MAP_WALK_REGISTERS_LOW_TO_HIGH_DEFINED");
		J9_JNI_PUSHED_REFERENCE_COUNT_MASK_DEFINED = flags$.contains("J9_JNI_PUSHED_REFERENCE_COUNT_MASK_DEFINED");
		J9_STACK_FLAGS_CALL_OUT_FRAME_ALLOCATED_DEFINED = flags$.contains("J9_STACK_FLAGS_CALL_OUT_FRAME_ALLOCATED_DEFINED");
		J9_STACK_FLAGS_EXIT_TRACEPOINT_LEVEL3_DEFINED = flags$.contains("J9_STACK_FLAGS_EXIT_TRACEPOINT_LEVEL3_DEFINED");
		J9_STACK_FLAGS_J2_IFRAME_DEFINED = flags$.contains("J9_STACK_FLAGS_J2_IFRAME_DEFINED");
		J9_STACK_FLAGS_JIT_ALLOCATION_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_ALLOCATION_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_BEFORE_ANEWARRAY_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_BEFORE_ANEWARRAY_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_BEFORE_MULTIANEWARRAY_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_BEFORE_MULTIANEWARRAY_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_CALL_IN_FRAME_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_CALL_IN_FRAME_DEFINED");
		J9_STACK_FLAGS_JIT_CALL_IN_TYPE_J2_I_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_CALL_IN_TYPE_J2_I_DEFINED");
		J9_STACK_FLAGS_JIT_CALL_IN_TYPE_METHODTYPE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_CALL_IN_TYPE_METHODTYPE_DEFINED");
		J9_STACK_FLAGS_JIT_DATA_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_DATA_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_EXCEPTION_CATCH_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_EXCEPTION_CATCH_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_FAILED_METHOD_MONITOR_ENTER_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_FAILED_METHOD_MONITOR_ENTER_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_FRAME_SUB_TYPE_MASK_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_FRAME_SUB_TYPE_MASK_DEFINED");
		J9_STACK_FLAGS_JIT_GENERIC_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_GENERIC_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_INDUCE_OSR_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_INDUCE_OSR_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_INTERFACE_METHOD_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_INTERFACE_METHOD_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_JNI_CALL_OUT_FRAME_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_JNI_CALL_OUT_FRAME_DEFINED");
		J9_STACK_FLAGS_JIT_LOOKUP_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_LOOKUP_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_METHOD_MONITOR_ENTER_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_METHOD_MONITOR_ENTER_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_MONITOR_ENTER_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_MONITOR_ENTER_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_NATIVE_TRANSITION_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_NATIVE_TRANSITION_DEFINED");
		J9_STACK_FLAGS_JIT_RECOMPILATION_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_RECOMPILATION_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_RESOLVE_FRAME_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_RESOLVE_FRAME_DEFINED");
		J9_STACK_FLAGS_JIT_RUNTIME_HELPER_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_RUNTIME_HELPER_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_SPECIAL_METHOD_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_SPECIAL_METHOD_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_STACK_OVERFLOW_RESOLVE_FRAME_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_STACK_OVERFLOW_RESOLVE_FRAME_DEFINED");
		J9_STACK_FLAGS_JIT_STATIC_METHOD_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_STATIC_METHOD_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JIT_TRANSITION_TO_INTERPRETER_MASK_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_TRANSITION_TO_INTERPRETER_MASK_DEFINED");
		J9_STACK_FLAGS_JIT_UNUSED_0x04000000_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_UNUSED_0x04000000_DEFINED");
		J9_STACK_FLAGS_JIT_VIRTUAL_METHOD_RESOLVE_DEFINED = flags$.contains("J9_STACK_FLAGS_JIT_VIRTUAL_METHOD_RESOLVE_DEFINED");
		J9_STACK_FLAGS_JNI_REFS_REDIRECTED_DEFINED = flags$.contains("J9_STACK_FLAGS_JNI_REFS_REDIRECTED_DEFINED");
		J9_STACK_FLAGS_METHOD_ENTRY_DEFINED = flags$.contains("J9_STACK_FLAGS_METHOD_ENTRY_DEFINED");
		J9_STACK_FLAGS_RELEASE_VMACCESS_DEFINED = flags$.contains("J9_STACK_FLAGS_RELEASE_VMACCESS_DEFINED");
		J9_STACK_FLAGS_RETURNS_OBJECT_DEFINED = flags$.contains("J9_STACK_FLAGS_RETURNS_OBJECT_DEFINED");
		J9_STACK_FLAGS_UNUSED_0x2_DEFINED = flags$.contains("J9_STACK_FLAGS_UNUSED_0x2_DEFINED");
		J9_STACK_FLAGS_UNUSED_0x80000000_DEFINED = flags$.contains("J9_STACK_FLAGS_UNUSED_0x80000000_DEFINED");
		J9_STACK_FLAGS_USE_SPECIFIED_CLASS_LOADER_DEFINED = flags$.contains("J9_STACK_FLAGS_USE_SPECIFIED_CLASS_LOADER_DEFINED");
		J9_STACK_INVISIBLE_FRAME_DEFINED = flags$.contains("J9_STACK_INVISIBLE_FRAME_DEFINED");
		J9_STACK_REPORT_FRAME_POP_DEFINED = flags$.contains("J9_STACK_REPORT_FRAME_POP_DEFINED");
	}
}
