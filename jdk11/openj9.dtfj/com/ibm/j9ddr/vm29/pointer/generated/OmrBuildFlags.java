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
 * Structure: OmrBuildFlags
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
 * The generated code will provide getters for all elements in the OmrBuildFlags
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
public final class OmrBuildFlags {

	// Do not instantiate constant classes
	private OmrBuildFlags() {
	}

	// Build Flags
	public static final boolean OMRPORT_OMRSIG_SUPPORT;
	public static final boolean OMRPORT_OMRSIG_SUPPORT_DEFINED;
	public static final boolean OMRTHREAD_LIB_AIX;
	public static final boolean OMRTHREAD_LIB_AIX_DEFINED;
	public static final boolean OMRTHREAD_LIB_UNIX;
	public static final boolean OMRTHREAD_LIB_UNIX_DEFINED;
	public static final boolean OMRTHREAD_LIB_WIN32;
	public static final boolean OMRTHREAD_LIB_WIN32_DEFINED;
	public static final boolean OMRTHREAD_LIB_ZOS;
	public static final boolean OMRTHREAD_LIB_ZOS_DEFINED;
	public static final boolean OMR_ARCH_AARCH64;
	public static final boolean OMR_ARCH_AARCH64_DEFINED;
	public static final boolean OMR_ARCH_ARM;
	public static final boolean OMR_ARCH_ARM_DEFINED;
	public static final boolean OMR_ARCH_POWER;
	public static final boolean OMR_ARCH_POWER_DEFINED;
	public static final boolean OMR_ARCH_RISCV;
	public static final boolean OMR_ARCH_RISCV_DEFINED;
	public static final boolean OMR_ARCH_S390;
	public static final boolean OMR_ARCH_S390_DEFINED;
	public static final boolean OMR_ARCH_X86;
	public static final boolean OMR_ARCH_X86_DEFINED;
	public static final boolean OMR_COMPILER;
	public static final boolean OMR_COMPILER_DEFINED;
	public static final boolean OMR_ENV_DATA64;
	public static final boolean OMR_ENV_DATA64_DEFINED;
	public static final boolean OMR_ENV_LITTLE_ENDIAN;
	public static final boolean OMR_ENV_LITTLE_ENDIAN_DEFINED;
	public static final boolean OMR_EXAMPLE;
	public static final boolean OMR_EXAMPLE_DEFINED;
	public static final boolean OMR_GC;
	public static final boolean OMR_GC_ALLOCATION_TAX;
	public static final boolean OMR_GC_ALLOCATION_TAX_DEFINED;
	public static final boolean OMR_GC_BATCH_CLEAR_TLH;
	public static final boolean OMR_GC_BATCH_CLEAR_TLH_DEFINED;
	public static final boolean OMR_GC_COMBINATION_SPEC;
	public static final boolean OMR_GC_COMBINATION_SPEC_DEFINED;
	public static final boolean OMR_GC_COMPRESSED_POINTERS;
	public static final boolean OMR_GC_COMPRESSED_POINTERS_DEFINED;
	public static final boolean OMR_GC_CONCURRENT_SCAVENGER;
	public static final boolean OMR_GC_CONCURRENT_SCAVENGER_DEFINED;
	public static final boolean OMR_GC_CONCURRENT_SWEEP;
	public static final boolean OMR_GC_CONCURRENT_SWEEP_DEFINED;
	public static final boolean OMR_GC_DEBUG_ASSERTS;
	public static final boolean OMR_GC_DEBUG_ASSERTS_DEFINED;
	public static final boolean OMR_GC_DEFINED;
	public static final boolean OMR_GC_DOUBLE_MAP_ARRAYLETS;
	public static final boolean OMR_GC_DOUBLE_MAP_ARRAYLETS_DEFINED;
	public static final boolean OMR_GC_EXPERIMENTAL_CONTEXT;
	public static final boolean OMR_GC_EXPERIMENTAL_CONTEXT_DEFINED;
	public static final boolean OMR_GC_EXPERIMENTAL_OBJECT_SCANNER;
	public static final boolean OMR_GC_EXPERIMENTAL_OBJECT_SCANNER_DEFINED;
	public static final boolean OMR_GC_FULL_POINTERS;
	public static final boolean OMR_GC_FULL_POINTERS_DEFINED;
	public static final boolean OMR_GC_IDLE_HEAP_MANAGER;
	public static final boolean OMR_GC_IDLE_HEAP_MANAGER_DEFINED;
	public static final boolean OMR_GC_LARGE_OBJECT_AREA;
	public static final boolean OMR_GC_LARGE_OBJECT_AREA_DEFINED;
	public static final boolean OMR_GC_LEAF_BITS;
	public static final boolean OMR_GC_LEAF_BITS_DEFINED;
	public static final boolean OMR_GC_MINIMUM_OBJECT_SIZE;
	public static final boolean OMR_GC_MINIMUM_OBJECT_SIZE_DEFINED;
	public static final boolean OMR_GC_MODRON_COMPACTION;
	public static final boolean OMR_GC_MODRON_COMPACTION_DEFINED;
	public static final boolean OMR_GC_MODRON_CONCURRENT_MARK;
	public static final boolean OMR_GC_MODRON_CONCURRENT_MARK_DEFINED;
	public static final boolean OMR_GC_MODRON_SCAVENGER;
	public static final boolean OMR_GC_MODRON_SCAVENGER_DEFINED;
	public static final boolean OMR_GC_MODRON_STANDARD;
	public static final boolean OMR_GC_MODRON_STANDARD_DEFINED;
	public static final boolean OMR_GC_NON_ZERO_TLH;
	public static final boolean OMR_GC_NON_ZERO_TLH_DEFINED;
	public static final boolean OMR_GC_OBJECT_ALLOCATION_NOTIFY;
	public static final boolean OMR_GC_OBJECT_ALLOCATION_NOTIFY_DEFINED;
	public static final boolean OMR_GC_OBJECT_MAP;
	public static final boolean OMR_GC_OBJECT_MAP_DEFINED;
	public static final boolean OMR_GC_REALTIME;
	public static final boolean OMR_GC_REALTIME_DEFINED;
	public static final boolean OMR_GC_SCAN_OBJECT_GLUE;
	public static final boolean OMR_GC_SCAN_OBJECT_GLUE_DEFINED;
	public static final boolean OMR_GC_SEGREGATED_HEAP;
	public static final boolean OMR_GC_SEGREGATED_HEAP_DEFINED;
	public static final boolean OMR_GC_THREAD_LOCAL_HEAP;
	public static final boolean OMR_GC_THREAD_LOCAL_HEAP_DEFINED;
	public static final boolean OMR_GC_TLH_PREFETCH_FTA;
	public static final boolean OMR_GC_TLH_PREFETCH_FTA_DEFINED;
	public static final boolean OMR_GC_VLHGC;
	public static final boolean OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD;
	public static final boolean OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD_DEFINED;
	public static final boolean OMR_GC_VLHGC_DEFINED;
	public static final boolean OMR_HAVE_DLADDR;
	public static final boolean OMR_HAVE_DLADDR_DEFINED;
	public static final boolean OMR_INTERP_HAS_SEMAPHORES;
	public static final boolean OMR_INTERP_HAS_SEMAPHORES_DEFINED;
	public static final boolean OMR_JITBUILDER;
	public static final boolean OMR_JITBUILDER_DEFINED;
	public static final boolean OMR_MIXED_REFERENCES_MODE_STATIC;
	public static final boolean OMR_MIXED_REFERENCES_MODE_STATIC_DEFINED;
	public static final boolean OMR_NOTIFY_POLICY_CONTROL;
	public static final boolean OMR_NOTIFY_POLICY_CONTROL_DEFINED;
	public static final boolean OMR_OMRSIG;
	public static final boolean OMR_OMRSIG_DEFINED;
	public static final boolean OMR_OPT_CUDA;
	public static final boolean OMR_OPT_CUDA_DEFINED;
	public static final boolean OMR_PORT;
	public static final boolean OMR_PORT_ALLOCATE_TOP_DOWN;
	public static final boolean OMR_PORT_ALLOCATE_TOP_DOWN_DEFINED;
	public static final boolean OMR_PORT_ASYNC_HANDLER;
	public static final boolean OMR_PORT_ASYNC_HANDLER_DEFINED;
	public static final boolean OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS;
	public static final boolean OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS_DEFINED;
	public static final boolean OMR_PORT_DEFINED;
	public static final boolean OMR_PORT_NUMA_SUPPORT;
	public static final boolean OMR_PORT_NUMA_SUPPORT_DEFINED;
	public static final boolean OMR_PORT_ZOS_CEEHDLRSUPPORT;
	public static final boolean OMR_PORT_ZOS_CEEHDLRSUPPORT_DEFINED;
	public static final boolean OMR_RAS_TDF_TRACE;
	public static final boolean OMR_RAS_TDF_TRACE_DEFINED;
	public static final boolean OMR_SHARED_CACHE;
	public static final boolean OMR_SHARED_CACHE_DEFINED;
	public static final boolean OMR_TEST_COMPILER;
	public static final boolean OMR_TEST_COMPILER_DEFINED;
	public static final boolean OMR_THREAD;
	public static final boolean OMR_THREAD_DEFINED;
	public static final boolean OMR_THR_ADAPTIVE_SPIN;
	public static final boolean OMR_THR_ADAPTIVE_SPIN_DEFINED;
	public static final boolean OMR_THR_CUSTOM_SPIN_OPTIONS;
	public static final boolean OMR_THR_CUSTOM_SPIN_OPTIONS_DEFINED;
	public static final boolean OMR_THR_FORK_SUPPORT;
	public static final boolean OMR_THR_FORK_SUPPORT_DEFINED;
	public static final boolean OMR_THR_JLM;
	public static final boolean OMR_THR_JLM_DEFINED;
	public static final boolean OMR_THR_JLM_HOLD_TIMES;
	public static final boolean OMR_THR_JLM_HOLD_TIMES_DEFINED;
	public static final boolean OMR_THR_LOCK_NURSERY;
	public static final boolean OMR_THR_LOCK_NURSERY_DEFINED;
	public static final boolean OMR_THR_MCS_LOCKS;
	public static final boolean OMR_THR_MCS_LOCKS_DEFINED;
	public static final boolean OMR_THR_SPIN_WAKE_CONTROL;
	public static final boolean OMR_THR_SPIN_WAKE_CONTROL_DEFINED;
	public static final boolean OMR_THR_THREE_TIER_LOCKING;
	public static final boolean OMR_THR_THREE_TIER_LOCKING_DEFINED;
	public static final boolean OMR_THR_TRACING;
	public static final boolean OMR_THR_TRACING_DEFINED;
	public static final boolean OMR_THR_YIELD_ALG;
	public static final boolean OMR_THR_YIELD_ALG_DEFINED;
	public static final boolean OMR_USE_OSX_SEMAPHORES;
	public static final boolean OMR_USE_OSX_SEMAPHORES_DEFINED;
	public static final boolean OMR_USE_POSIX_SEMAPHORES;
	public static final boolean OMR_USE_POSIX_SEMAPHORES_DEFINED;
	public static final boolean OMR_USE_ZOS_SEMAPHORES;
	public static final boolean OMR_USE_ZOS_SEMAPHORES_DEFINED;

	static {
		HashSet<String> flags$ = new HashSet<>();

		try {
			ClassLoader loader$ = OmrBuildFlags.class.getClassLoader();
			if (!(loader$ instanceof com.ibm.j9ddr.J9DDRClassLoader)) {
				throw new IllegalArgumentException("Cannot determine the runtime loader");
			}
			Class<?> runtimeClass = ((com.ibm.j9ddr.J9DDRClassLoader) loader$).loadClassRelativeToStream("structure.OmrBuildFlags", false);
			for (Field field : runtimeClass.getFields()) {
				if (field.getLong(runtimeClass) != 0) {
					flags$.add(field.getName());
				}
			}
		} catch (ClassNotFoundException | IllegalAccessException e) {
			throw new IllegalArgumentException(String.format("Can not initialize flags from core file.%n%s", e.getMessage()));
		}

		OMRPORT_OMRSIG_SUPPORT = flags$.contains("OMRPORT_OMRSIG_SUPPORT");
		OMRPORT_OMRSIG_SUPPORT_DEFINED = flags$.contains("OMRPORT_OMRSIG_SUPPORT_DEFINED");
		OMRTHREAD_LIB_AIX = flags$.contains("OMRTHREAD_LIB_AIX");
		OMRTHREAD_LIB_AIX_DEFINED = flags$.contains("OMRTHREAD_LIB_AIX_DEFINED");
		OMRTHREAD_LIB_UNIX = flags$.contains("OMRTHREAD_LIB_UNIX");
		OMRTHREAD_LIB_UNIX_DEFINED = flags$.contains("OMRTHREAD_LIB_UNIX_DEFINED");
		OMRTHREAD_LIB_WIN32 = flags$.contains("OMRTHREAD_LIB_WIN32");
		OMRTHREAD_LIB_WIN32_DEFINED = flags$.contains("OMRTHREAD_LIB_WIN32_DEFINED");
		OMRTHREAD_LIB_ZOS = flags$.contains("OMRTHREAD_LIB_ZOS");
		OMRTHREAD_LIB_ZOS_DEFINED = flags$.contains("OMRTHREAD_LIB_ZOS_DEFINED");
		OMR_ARCH_AARCH64 = flags$.contains("OMR_ARCH_AARCH64");
		OMR_ARCH_AARCH64_DEFINED = flags$.contains("OMR_ARCH_AARCH64_DEFINED");
		OMR_ARCH_ARM = flags$.contains("OMR_ARCH_ARM");
		OMR_ARCH_ARM_DEFINED = flags$.contains("OMR_ARCH_ARM_DEFINED");
		OMR_ARCH_POWER = flags$.contains("OMR_ARCH_POWER");
		OMR_ARCH_POWER_DEFINED = flags$.contains("OMR_ARCH_POWER_DEFINED");
		OMR_ARCH_RISCV = flags$.contains("OMR_ARCH_RISCV");
		OMR_ARCH_RISCV_DEFINED = flags$.contains("OMR_ARCH_RISCV_DEFINED");
		OMR_ARCH_S390 = flags$.contains("OMR_ARCH_S390");
		OMR_ARCH_S390_DEFINED = flags$.contains("OMR_ARCH_S390_DEFINED");
		OMR_ARCH_X86 = flags$.contains("OMR_ARCH_X86");
		OMR_ARCH_X86_DEFINED = flags$.contains("OMR_ARCH_X86_DEFINED");
		OMR_COMPILER = flags$.contains("OMR_COMPILER");
		OMR_COMPILER_DEFINED = flags$.contains("OMR_COMPILER_DEFINED");
		OMR_ENV_DATA64 = flags$.contains("OMR_ENV_DATA64");
		OMR_ENV_DATA64_DEFINED = flags$.contains("OMR_ENV_DATA64_DEFINED");
		OMR_ENV_LITTLE_ENDIAN = flags$.contains("OMR_ENV_LITTLE_ENDIAN");
		OMR_ENV_LITTLE_ENDIAN_DEFINED = flags$.contains("OMR_ENV_LITTLE_ENDIAN_DEFINED");
		OMR_EXAMPLE = flags$.contains("OMR_EXAMPLE");
		OMR_EXAMPLE_DEFINED = flags$.contains("OMR_EXAMPLE_DEFINED");
		OMR_GC = flags$.contains("OMR_GC");
		OMR_GC_ALLOCATION_TAX = flags$.contains("OMR_GC_ALLOCATION_TAX");
		OMR_GC_ALLOCATION_TAX_DEFINED = flags$.contains("OMR_GC_ALLOCATION_TAX_DEFINED");
		OMR_GC_BATCH_CLEAR_TLH = flags$.contains("OMR_GC_BATCH_CLEAR_TLH");
		OMR_GC_BATCH_CLEAR_TLH_DEFINED = flags$.contains("OMR_GC_BATCH_CLEAR_TLH_DEFINED");
		OMR_GC_COMBINATION_SPEC = flags$.contains("OMR_GC_COMBINATION_SPEC");
		OMR_GC_COMBINATION_SPEC_DEFINED = flags$.contains("OMR_GC_COMBINATION_SPEC_DEFINED");
		OMR_GC_COMPRESSED_POINTERS = flags$.contains("OMR_GC_COMPRESSED_POINTERS");
		OMR_GC_COMPRESSED_POINTERS_DEFINED = flags$.contains("OMR_GC_COMPRESSED_POINTERS_DEFINED");
		OMR_GC_CONCURRENT_SCAVENGER = flags$.contains("OMR_GC_CONCURRENT_SCAVENGER");
		OMR_GC_CONCURRENT_SCAVENGER_DEFINED = flags$.contains("OMR_GC_CONCURRENT_SCAVENGER_DEFINED");
		OMR_GC_CONCURRENT_SWEEP = flags$.contains("OMR_GC_CONCURRENT_SWEEP");
		OMR_GC_CONCURRENT_SWEEP_DEFINED = flags$.contains("OMR_GC_CONCURRENT_SWEEP_DEFINED");
		OMR_GC_DEBUG_ASSERTS = flags$.contains("OMR_GC_DEBUG_ASSERTS");
		OMR_GC_DEBUG_ASSERTS_DEFINED = flags$.contains("OMR_GC_DEBUG_ASSERTS_DEFINED");
		OMR_GC_DEFINED = flags$.contains("OMR_GC_DEFINED");
		OMR_GC_DOUBLE_MAP_ARRAYLETS = flags$.contains("OMR_GC_DOUBLE_MAP_ARRAYLETS");
		OMR_GC_DOUBLE_MAP_ARRAYLETS_DEFINED = flags$.contains("OMR_GC_DOUBLE_MAP_ARRAYLETS_DEFINED");
		OMR_GC_EXPERIMENTAL_CONTEXT = flags$.contains("OMR_GC_EXPERIMENTAL_CONTEXT");
		OMR_GC_EXPERIMENTAL_CONTEXT_DEFINED = flags$.contains("OMR_GC_EXPERIMENTAL_CONTEXT_DEFINED");
		OMR_GC_EXPERIMENTAL_OBJECT_SCANNER = flags$.contains("OMR_GC_EXPERIMENTAL_OBJECT_SCANNER");
		OMR_GC_EXPERIMENTAL_OBJECT_SCANNER_DEFINED = flags$.contains("OMR_GC_EXPERIMENTAL_OBJECT_SCANNER_DEFINED");
		OMR_GC_FULL_POINTERS = flags$.contains("OMR_GC_FULL_POINTERS");
		OMR_GC_FULL_POINTERS_DEFINED = flags$.contains("OMR_GC_FULL_POINTERS_DEFINED");
		OMR_GC_IDLE_HEAP_MANAGER = flags$.contains("OMR_GC_IDLE_HEAP_MANAGER");
		OMR_GC_IDLE_HEAP_MANAGER_DEFINED = flags$.contains("OMR_GC_IDLE_HEAP_MANAGER_DEFINED");
		OMR_GC_LARGE_OBJECT_AREA = flags$.contains("OMR_GC_LARGE_OBJECT_AREA");
		OMR_GC_LARGE_OBJECT_AREA_DEFINED = flags$.contains("OMR_GC_LARGE_OBJECT_AREA_DEFINED");
		OMR_GC_LEAF_BITS = flags$.contains("OMR_GC_LEAF_BITS");
		OMR_GC_LEAF_BITS_DEFINED = flags$.contains("OMR_GC_LEAF_BITS_DEFINED");
		OMR_GC_MINIMUM_OBJECT_SIZE = flags$.contains("OMR_GC_MINIMUM_OBJECT_SIZE");
		OMR_GC_MINIMUM_OBJECT_SIZE_DEFINED = flags$.contains("OMR_GC_MINIMUM_OBJECT_SIZE_DEFINED");
		OMR_GC_MODRON_COMPACTION = flags$.contains("OMR_GC_MODRON_COMPACTION");
		OMR_GC_MODRON_COMPACTION_DEFINED = flags$.contains("OMR_GC_MODRON_COMPACTION_DEFINED");
		OMR_GC_MODRON_CONCURRENT_MARK = flags$.contains("OMR_GC_MODRON_CONCURRENT_MARK");
		OMR_GC_MODRON_CONCURRENT_MARK_DEFINED = flags$.contains("OMR_GC_MODRON_CONCURRENT_MARK_DEFINED");
		OMR_GC_MODRON_SCAVENGER = flags$.contains("OMR_GC_MODRON_SCAVENGER");
		OMR_GC_MODRON_SCAVENGER_DEFINED = flags$.contains("OMR_GC_MODRON_SCAVENGER_DEFINED");
		OMR_GC_MODRON_STANDARD = flags$.contains("OMR_GC_MODRON_STANDARD");
		OMR_GC_MODRON_STANDARD_DEFINED = flags$.contains("OMR_GC_MODRON_STANDARD_DEFINED");
		OMR_GC_NON_ZERO_TLH = flags$.contains("OMR_GC_NON_ZERO_TLH");
		OMR_GC_NON_ZERO_TLH_DEFINED = flags$.contains("OMR_GC_NON_ZERO_TLH_DEFINED");
		OMR_GC_OBJECT_ALLOCATION_NOTIFY = flags$.contains("OMR_GC_OBJECT_ALLOCATION_NOTIFY");
		OMR_GC_OBJECT_ALLOCATION_NOTIFY_DEFINED = flags$.contains("OMR_GC_OBJECT_ALLOCATION_NOTIFY_DEFINED");
		OMR_GC_OBJECT_MAP = flags$.contains("OMR_GC_OBJECT_MAP");
		OMR_GC_OBJECT_MAP_DEFINED = flags$.contains("OMR_GC_OBJECT_MAP_DEFINED");
		OMR_GC_REALTIME = flags$.contains("OMR_GC_REALTIME");
		OMR_GC_REALTIME_DEFINED = flags$.contains("OMR_GC_REALTIME_DEFINED");
		OMR_GC_SCAN_OBJECT_GLUE = flags$.contains("OMR_GC_SCAN_OBJECT_GLUE");
		OMR_GC_SCAN_OBJECT_GLUE_DEFINED = flags$.contains("OMR_GC_SCAN_OBJECT_GLUE_DEFINED");
		OMR_GC_SEGREGATED_HEAP = flags$.contains("OMR_GC_SEGREGATED_HEAP");
		OMR_GC_SEGREGATED_HEAP_DEFINED = flags$.contains("OMR_GC_SEGREGATED_HEAP_DEFINED");
		OMR_GC_THREAD_LOCAL_HEAP = flags$.contains("OMR_GC_THREAD_LOCAL_HEAP");
		OMR_GC_THREAD_LOCAL_HEAP_DEFINED = flags$.contains("OMR_GC_THREAD_LOCAL_HEAP_DEFINED");
		OMR_GC_TLH_PREFETCH_FTA = flags$.contains("OMR_GC_TLH_PREFETCH_FTA");
		OMR_GC_TLH_PREFETCH_FTA_DEFINED = flags$.contains("OMR_GC_TLH_PREFETCH_FTA_DEFINED");
		OMR_GC_VLHGC = flags$.contains("OMR_GC_VLHGC");
		OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD = flags$.contains("OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD");
		OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD_DEFINED = flags$.contains("OMR_GC_VLHGC_CONCURRENT_COPY_FORWARD_DEFINED");
		OMR_GC_VLHGC_DEFINED = flags$.contains("OMR_GC_VLHGC_DEFINED");
		OMR_HAVE_DLADDR = flags$.contains("OMR_HAVE_DLADDR");
		OMR_HAVE_DLADDR_DEFINED = flags$.contains("OMR_HAVE_DLADDR_DEFINED");
		OMR_INTERP_HAS_SEMAPHORES = flags$.contains("OMR_INTERP_HAS_SEMAPHORES");
		OMR_INTERP_HAS_SEMAPHORES_DEFINED = flags$.contains("OMR_INTERP_HAS_SEMAPHORES_DEFINED");
		OMR_JITBUILDER = flags$.contains("OMR_JITBUILDER");
		OMR_JITBUILDER_DEFINED = flags$.contains("OMR_JITBUILDER_DEFINED");
		OMR_MIXED_REFERENCES_MODE_STATIC = flags$.contains("OMR_MIXED_REFERENCES_MODE_STATIC");
		OMR_MIXED_REFERENCES_MODE_STATIC_DEFINED = flags$.contains("OMR_MIXED_REFERENCES_MODE_STATIC_DEFINED");
		OMR_NOTIFY_POLICY_CONTROL = flags$.contains("OMR_NOTIFY_POLICY_CONTROL");
		OMR_NOTIFY_POLICY_CONTROL_DEFINED = flags$.contains("OMR_NOTIFY_POLICY_CONTROL_DEFINED");
		OMR_OMRSIG = flags$.contains("OMR_OMRSIG");
		OMR_OMRSIG_DEFINED = flags$.contains("OMR_OMRSIG_DEFINED");
		OMR_OPT_CUDA = flags$.contains("OMR_OPT_CUDA");
		OMR_OPT_CUDA_DEFINED = flags$.contains("OMR_OPT_CUDA_DEFINED");
		OMR_PORT = flags$.contains("OMR_PORT");
		OMR_PORT_ALLOCATE_TOP_DOWN = flags$.contains("OMR_PORT_ALLOCATE_TOP_DOWN");
		OMR_PORT_ALLOCATE_TOP_DOWN_DEFINED = flags$.contains("OMR_PORT_ALLOCATE_TOP_DOWN_DEFINED");
		OMR_PORT_ASYNC_HANDLER = flags$.contains("OMR_PORT_ASYNC_HANDLER");
		OMR_PORT_ASYNC_HANDLER_DEFINED = flags$.contains("OMR_PORT_ASYNC_HANDLER_DEFINED");
		OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS = flags$.contains("OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS");
		OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS_DEFINED = flags$.contains("OMR_PORT_CAN_RESERVE_SPECIFIC_ADDRESS_DEFINED");
		OMR_PORT_DEFINED = flags$.contains("OMR_PORT_DEFINED");
		OMR_PORT_NUMA_SUPPORT = flags$.contains("OMR_PORT_NUMA_SUPPORT");
		OMR_PORT_NUMA_SUPPORT_DEFINED = flags$.contains("OMR_PORT_NUMA_SUPPORT_DEFINED");
		OMR_PORT_ZOS_CEEHDLRSUPPORT = flags$.contains("OMR_PORT_ZOS_CEEHDLRSUPPORT");
		OMR_PORT_ZOS_CEEHDLRSUPPORT_DEFINED = flags$.contains("OMR_PORT_ZOS_CEEHDLRSUPPORT_DEFINED");
		OMR_RAS_TDF_TRACE = flags$.contains("OMR_RAS_TDF_TRACE");
		OMR_RAS_TDF_TRACE_DEFINED = flags$.contains("OMR_RAS_TDF_TRACE_DEFINED");
		OMR_SHARED_CACHE = flags$.contains("OMR_SHARED_CACHE");
		OMR_SHARED_CACHE_DEFINED = flags$.contains("OMR_SHARED_CACHE_DEFINED");
		OMR_TEST_COMPILER = flags$.contains("OMR_TEST_COMPILER");
		OMR_TEST_COMPILER_DEFINED = flags$.contains("OMR_TEST_COMPILER_DEFINED");
		OMR_THREAD = flags$.contains("OMR_THREAD");
		OMR_THREAD_DEFINED = flags$.contains("OMR_THREAD_DEFINED");
		OMR_THR_ADAPTIVE_SPIN = flags$.contains("OMR_THR_ADAPTIVE_SPIN");
		OMR_THR_ADAPTIVE_SPIN_DEFINED = flags$.contains("OMR_THR_ADAPTIVE_SPIN_DEFINED");
		OMR_THR_CUSTOM_SPIN_OPTIONS = flags$.contains("OMR_THR_CUSTOM_SPIN_OPTIONS");
		OMR_THR_CUSTOM_SPIN_OPTIONS_DEFINED = flags$.contains("OMR_THR_CUSTOM_SPIN_OPTIONS_DEFINED");
		OMR_THR_FORK_SUPPORT = flags$.contains("OMR_THR_FORK_SUPPORT");
		OMR_THR_FORK_SUPPORT_DEFINED = flags$.contains("OMR_THR_FORK_SUPPORT_DEFINED");
		OMR_THR_JLM = flags$.contains("OMR_THR_JLM");
		OMR_THR_JLM_DEFINED = flags$.contains("OMR_THR_JLM_DEFINED");
		OMR_THR_JLM_HOLD_TIMES = flags$.contains("OMR_THR_JLM_HOLD_TIMES");
		OMR_THR_JLM_HOLD_TIMES_DEFINED = flags$.contains("OMR_THR_JLM_HOLD_TIMES_DEFINED");
		OMR_THR_LOCK_NURSERY = flags$.contains("OMR_THR_LOCK_NURSERY");
		OMR_THR_LOCK_NURSERY_DEFINED = flags$.contains("OMR_THR_LOCK_NURSERY_DEFINED");
		OMR_THR_MCS_LOCKS = flags$.contains("OMR_THR_MCS_LOCKS");
		OMR_THR_MCS_LOCKS_DEFINED = flags$.contains("OMR_THR_MCS_LOCKS_DEFINED");
		OMR_THR_SPIN_WAKE_CONTROL = flags$.contains("OMR_THR_SPIN_WAKE_CONTROL");
		OMR_THR_SPIN_WAKE_CONTROL_DEFINED = flags$.contains("OMR_THR_SPIN_WAKE_CONTROL_DEFINED");
		OMR_THR_THREE_TIER_LOCKING = flags$.contains("OMR_THR_THREE_TIER_LOCKING");
		OMR_THR_THREE_TIER_LOCKING_DEFINED = flags$.contains("OMR_THR_THREE_TIER_LOCKING_DEFINED");
		OMR_THR_TRACING = flags$.contains("OMR_THR_TRACING");
		OMR_THR_TRACING_DEFINED = flags$.contains("OMR_THR_TRACING_DEFINED");
		OMR_THR_YIELD_ALG = flags$.contains("OMR_THR_YIELD_ALG");
		OMR_THR_YIELD_ALG_DEFINED = flags$.contains("OMR_THR_YIELD_ALG_DEFINED");
		OMR_USE_OSX_SEMAPHORES = flags$.contains("OMR_USE_OSX_SEMAPHORES");
		OMR_USE_OSX_SEMAPHORES_DEFINED = flags$.contains("OMR_USE_OSX_SEMAPHORES_DEFINED");
		OMR_USE_POSIX_SEMAPHORES = flags$.contains("OMR_USE_POSIX_SEMAPHORES");
		OMR_USE_POSIX_SEMAPHORES_DEFINED = flags$.contains("OMR_USE_POSIX_SEMAPHORES_DEFINED");
		OMR_USE_ZOS_SEMAPHORES = flags$.contains("OMR_USE_ZOS_SEMAPHORES");
		OMR_USE_ZOS_SEMAPHORES_DEFINED = flags$.contains("OMR_USE_ZOS_SEMAPHORES_DEFINED");
	}
}
