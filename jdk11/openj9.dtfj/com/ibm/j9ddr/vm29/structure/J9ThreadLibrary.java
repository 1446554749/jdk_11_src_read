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
 * Structure: J9ThreadLibrary
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
public final class J9ThreadLibrary {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _adaptSpinHoldtimeOffset_;
	public static final int _adaptSpinSampleCountStopRatioOffset_;
	public static final int _adaptSpinSampleStopCountOffset_;
	public static final int _adaptSpinSampleThresholdOffset_;
	public static final int _adaptSpinSlowPercentOffset_;
	public static final int _attachedLibKeyOffset_;
	public static final int _clockServiceOffset_;
	public static final int _clock_skewOffset_;
	public static final int _cumulativeThreadsInfoOffset_;
	public static final int _defaultMonitorSpinCount1Offset_;
	public static final int _defaultMonitorSpinCount2Offset_;
	public static final int _defaultMonitorSpinCount3Offset_;
	public static final int _flagsOffset_;
	public static final int _gc_lock_tracingOffset_;
	public static final int _globalMonitorOffset_;
	public static final int _global_mutexOffset_;
	public static final int _global_poolOffset_;
	public static final int _globalsOffset_;
	public static final int _initStatusOffset_;
	public static final int _maxSpinThreadsOffset_;
	public static final int _maxWakeThreadsOffset_;
	public static final int _monitor_mutexOffset_;
	public static final int _monitor_poolOffset_;
	public static final int _monitor_tracing_poolOffset_;
	public static final int _nativeStackCategoryOffset_;
	public static final int _resourceUsageMutexOffset_;
	public static final int _self_ptrOffset_;
	public static final int _spinlockOffset_;
	public static final int _systemThreadAttrOffset_;
	public static final int _threadCountOffset_;
	public static final int _threadLibraryCategoryOffset_;
	public static final int _threadWalkMutexesHeldOffset_;
	public static final int _thread_poolOffset_;
	public static final int _thread_tracing_poolOffset_;
	public static final int _thread_weightOffset_;
	public static final int _tls_finalizersOffset_;
	public static final int _tls_mutexOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_adaptSpinHoldtimeOffset_ = 0;
		_adaptSpinSampleCountStopRatioOffset_ = 0;
		_adaptSpinSampleStopCountOffset_ = 0;
		_adaptSpinSampleThresholdOffset_ = 0;
		_adaptSpinSlowPercentOffset_ = 0;
		_attachedLibKeyOffset_ = 0;
		_clockServiceOffset_ = 0;
		_clock_skewOffset_ = 0;
		_cumulativeThreadsInfoOffset_ = 0;
		_defaultMonitorSpinCount1Offset_ = 0;
		_defaultMonitorSpinCount2Offset_ = 0;
		_defaultMonitorSpinCount3Offset_ = 0;
		_flagsOffset_ = 0;
		_gc_lock_tracingOffset_ = 0;
		_globalMonitorOffset_ = 0;
		_global_mutexOffset_ = 0;
		_global_poolOffset_ = 0;
		_globalsOffset_ = 0;
		_initStatusOffset_ = 0;
		_maxSpinThreadsOffset_ = 0;
		_maxWakeThreadsOffset_ = 0;
		_monitor_mutexOffset_ = 0;
		_monitor_poolOffset_ = 0;
		_monitor_tracing_poolOffset_ = 0;
		_nativeStackCategoryOffset_ = 0;
		_resourceUsageMutexOffset_ = 0;
		_self_ptrOffset_ = 0;
		_spinlockOffset_ = 0;
		_systemThreadAttrOffset_ = 0;
		_threadCountOffset_ = 0;
		_threadLibraryCategoryOffset_ = 0;
		_threadWalkMutexesHeldOffset_ = 0;
		_thread_poolOffset_ = 0;
		_thread_tracing_poolOffset_ = 0;
		_thread_weightOffset_ = 0;
		_tls_finalizersOffset_ = 0;
		_tls_mutexOffset_ = 0;
	}

}
