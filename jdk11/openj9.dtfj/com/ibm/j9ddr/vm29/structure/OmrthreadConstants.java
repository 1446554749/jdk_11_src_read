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
 * Structure: OmrthreadConstants
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
public final class OmrthreadConstants {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9THREAD_LIB_FLAG_ADAPTIVE_SPIN_KEEP_SAMPLING;
	public static final long J9THREAD_LIB_FLAG_ATTACHED_THREAD_EXITED;
	public static final long J9THREAD_LIB_FLAG_CUSTOM_ADAPTIVE_SPIN_ENABLED;
	public static final long J9THREAD_LIB_FLAG_DESTROY_MUTEX_ON_MONITOR_FREE;
	public static final long J9THREAD_LIB_FLAG_ENABLE_CPU_MONITOR;
	public static final long J9THREAD_LIB_FLAG_FAST_NOTIFY;
	public static final long J9THREAD_LIB_FLAG_JLMHST_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_ENABLED_ALL;
	public static final long J9THREAD_LIB_FLAG_JLM_HAS_BEEN_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_HOLDTIME_SAMPLING_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_INFO_SAMPLING_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_INIT_DATA_STRUCTURES;
	public static final long J9THREAD_LIB_FLAG_JLM_SLOW_SAMPLING_ENABLED;
	public static final long J9THREAD_LIB_FLAG_JLM_TIME_STAMPS_ENABLED;
	public static final long J9THREAD_LIB_FLAG_NOTIFY_POLICY_BROADCAST;
	public static final long J9THREAD_LIB_FLAG_NO_SCHEDULING;
	public static final long J9THREAD_LIB_FLAG_REALTIME_SCHEDULING_ENABLED;
	public static final long J9THREAD_LIB_FLAG_SECONDARY_SPIN_OBJECT_MONITORS_ENABLED;
	public static final long J9THREAD_LIB_FLAG_TRACING_ENABLED;
	public static final long J9THREAD_LIB_YIELD_ALGORITHM_CONSTANT_USLEEP;
	public static final long J9THREAD_LIB_YIELD_ALGORITHM_INCREASING_USLEEP;
	public static final long J9THREAD_LIB_YIELD_ALGORITHM_SCHED_YIELD;
	public static final long J9THREAD_LOCKING_DEFAULT;
	public static final long J9THREAD_LOCKING_NO_DATA;
	public static final long J9THREAD_PRIORITY_MAX;
	public static final long J9THREAD_PRIORITY_MIN;
	public static final long J9THREAD_PRIORITY_NORMAL;
	public static final long J9THREAD_PRIORITY_USER_MAX;
	public static final long J9THREAD_PRIORITY_USER_MIN;
	public static final long OMRTHREAD_MINIMUM_SPIN_THREADS;
	public static final long OMRTHREAD_MINIMUM_WAKE_THREADS;
	public static final long PRIORITY_INDICATOR_J9THREAD_PRIORITY;
	public static final long PRIORITY_INDICATOR_JAVA_PRIORITY;
	public static final long PRIORITY_INDICATOR_NATIVE_PRIORITY;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9THREAD_LIB_FLAG_ADAPTIVE_SPIN_KEEP_SAMPLING = 0;
		J9THREAD_LIB_FLAG_ATTACHED_THREAD_EXITED = 0;
		J9THREAD_LIB_FLAG_CUSTOM_ADAPTIVE_SPIN_ENABLED = 0;
		J9THREAD_LIB_FLAG_DESTROY_MUTEX_ON_MONITOR_FREE = 0;
		J9THREAD_LIB_FLAG_ENABLE_CPU_MONITOR = 0;
		J9THREAD_LIB_FLAG_FAST_NOTIFY = 0;
		J9THREAD_LIB_FLAG_JLMHST_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_ENABLED_ALL = 0;
		J9THREAD_LIB_FLAG_JLM_HAS_BEEN_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_HOLDTIME_SAMPLING_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_INFO_SAMPLING_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_INIT_DATA_STRUCTURES = 0;
		J9THREAD_LIB_FLAG_JLM_SLOW_SAMPLING_ENABLED = 0;
		J9THREAD_LIB_FLAG_JLM_TIME_STAMPS_ENABLED = 0;
		J9THREAD_LIB_FLAG_NOTIFY_POLICY_BROADCAST = 0;
		J9THREAD_LIB_FLAG_NO_SCHEDULING = 0;
		J9THREAD_LIB_FLAG_REALTIME_SCHEDULING_ENABLED = 0;
		J9THREAD_LIB_FLAG_SECONDARY_SPIN_OBJECT_MONITORS_ENABLED = 0;
		J9THREAD_LIB_FLAG_TRACING_ENABLED = 0;
		J9THREAD_LIB_YIELD_ALGORITHM_CONSTANT_USLEEP = 0;
		J9THREAD_LIB_YIELD_ALGORITHM_INCREASING_USLEEP = 0;
		J9THREAD_LIB_YIELD_ALGORITHM_SCHED_YIELD = 0;
		J9THREAD_LOCKING_DEFAULT = 0;
		J9THREAD_LOCKING_NO_DATA = 0;
		J9THREAD_PRIORITY_MAX = 0;
		J9THREAD_PRIORITY_MIN = 0;
		J9THREAD_PRIORITY_NORMAL = 0;
		J9THREAD_PRIORITY_USER_MAX = 0;
		J9THREAD_PRIORITY_USER_MIN = 0;
		OMRTHREAD_MINIMUM_SPIN_THREADS = 0;
		OMRTHREAD_MINIMUM_WAKE_THREADS = 0;
		PRIORITY_INDICATOR_J9THREAD_PRIORITY = 0;
		PRIORITY_INDICATOR_JAVA_PRIORITY = 0;
		PRIORITY_INDICATOR_NATIVE_PRIORITY = 0;
	}

}