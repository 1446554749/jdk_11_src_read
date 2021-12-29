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
 * Structure: ThreadInfo
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
public final class ThreadInfo {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _blockedCountOffset_;
	public static final int _blockedTimeOffset_;
	public static final int _blockerOffset_;
	public static final int _blockerOwnerOffset_;
	public static final int _jclThreadStateOffset_;
	public static final int _lockedMonitors$arr_safeOffset_;
	public static final int _lockedMonitors$arr_unsafeOffset_;
	public static final int _lockedMonitors$lenOffset_;
	public static final int _lockedSynchronizers$lenOffset_;
	public static final int _lockedSynchronizers$listOffset_;
	public static final int _nativeTIDOffset_;
	public static final int _stack$lenOffset_;
	public static final int _stack$pcsOffset_;
	public static final int _stackTraceOffset_;
	public static final int _threadOffset_;
	public static final int _vmstateOffset_;
	public static final int _waitedCountOffset_;
	public static final int _waitedTimeOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_blockedCountOffset_ = 0;
		_blockedTimeOffset_ = 0;
		_blockerOffset_ = 0;
		_blockerOwnerOffset_ = 0;
		_jclThreadStateOffset_ = 0;
		_lockedMonitors$arr_safeOffset_ = 0;
		_lockedMonitors$arr_unsafeOffset_ = 0;
		_lockedMonitors$lenOffset_ = 0;
		_lockedSynchronizers$lenOffset_ = 0;
		_lockedSynchronizers$listOffset_ = 0;
		_nativeTIDOffset_ = 0;
		_stack$lenOffset_ = 0;
		_stack$pcsOffset_ = 0;
		_stackTraceOffset_ = 0;
		_threadOffset_ = 0;
		_vmstateOffset_ = 0;
		_waitedCountOffset_ = 0;
		_waitedTimeOffset_ = 0;
	}

}