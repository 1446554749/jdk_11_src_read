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
 * Structure: MM_Scheduler
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
public final class MM_Scheduler {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __alarmThreadOffset_;
	public static final int __completeCurrentGCSynchronouslyOffset_;
	public static final int __completeCurrentGCSynchronouslyMainThreadCopyOffset_;
	public static final int __completeCurrentGCSynchronouslyReasonOffset_;
	public static final int __completeCurrentGCSynchronouslyReasonParameterOffset_;
	public static final int __currentConsecutiveBeatsOffset_;
	public static final int __doSchedulingBarrierEventsOffset_;
	public static final int __exclusiveVMAccessRequiredOffset_;
	public static final int __extensionsOffset_;
	public static final int __gcOffset_;
	public static final int __gcCodeOffset_;
	public static final int __gcOnOffset_;
	public static final int __gcPhaseSetOffset_;
	public static final int __incrementStartTimeInNanosOffset_;
	public static final int __isInitializedOffset_;
	public static final int __mainThreadMonitorOffset_;
	public static final int __mainThreadMustShutDownOffset_;
	public static final int __modeOffset_;
	public static final int __mutatorCountOffset_;
	public static final int __mutatorStartTimeInNanosOffset_;
	public static final int __osInterfaceOffset_;
	public static final int __sharedBarrierStateOffset_;
	public static final int __shouldGCYieldOffset_;
	public static final int __staticTargetUtilizationOffset_;
	public static final int __threadResumedTableOffset_;
	public static final int __threadWaitingOnMainThreadMonitorOffset_;
	public static final int __utilTrackerOffset_;
	public static final int __vmOffset_;
	public static final int __yieldCollaboratorOffset_;
	public static final int _beatOffset_;
	public static final int _beatNanosOffset_;
	public static final int _windowOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__alarmThreadOffset_ = 0;
		__completeCurrentGCSynchronouslyOffset_ = 0;
		__completeCurrentGCSynchronouslyMainThreadCopyOffset_ = 0;
		__completeCurrentGCSynchronouslyReasonOffset_ = 0;
		__completeCurrentGCSynchronouslyReasonParameterOffset_ = 0;
		__currentConsecutiveBeatsOffset_ = 0;
		__doSchedulingBarrierEventsOffset_ = 0;
		__exclusiveVMAccessRequiredOffset_ = 0;
		__extensionsOffset_ = 0;
		__gcOffset_ = 0;
		__gcCodeOffset_ = 0;
		__gcOnOffset_ = 0;
		__gcPhaseSetOffset_ = 0;
		__incrementStartTimeInNanosOffset_ = 0;
		__isInitializedOffset_ = 0;
		__mainThreadMonitorOffset_ = 0;
		__mainThreadMustShutDownOffset_ = 0;
		__modeOffset_ = 0;
		__mutatorCountOffset_ = 0;
		__mutatorStartTimeInNanosOffset_ = 0;
		__osInterfaceOffset_ = 0;
		__sharedBarrierStateOffset_ = 0;
		__shouldGCYieldOffset_ = 0;
		__staticTargetUtilizationOffset_ = 0;
		__threadResumedTableOffset_ = 0;
		__threadWaitingOnMainThreadMonitorOffset_ = 0;
		__utilTrackerOffset_ = 0;
		__vmOffset_ = 0;
		__yieldCollaboratorOffset_ = 0;
		_beatOffset_ = 0;
		_beatNanosOffset_ = 0;
		_windowOffset_ = 0;
	}

}
