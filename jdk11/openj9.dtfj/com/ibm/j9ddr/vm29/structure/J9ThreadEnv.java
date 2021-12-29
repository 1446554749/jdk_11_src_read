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
 * Structure: J9ThreadEnv
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
public final class J9ThreadEnv {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _abortOffset_;
	public static final int _attachOffset_;
	public static final int _clear_interruptedOffset_;
	public static final int _createOffset_;
	public static final int _exitOffset_;
	public static final int _get_priorityOffset_;
	public static final int _globalOffset_;
	public static final int _monitor_destroyOffset_;
	public static final int _monitor_enterOffset_;
	public static final int _monitor_exitOffset_;
	public static final int _monitor_init_with_nameOffset_;
	public static final int _monitor_notify_allOffset_;
	public static final int _monitor_waitOffset_;
	public static final int _priority_interruptOffset_;
	public static final int _selfOffset_;
	public static final int _set_priorityOffset_;
	public static final int _sleepOffset_;
	public static final int _tls_allocOffset_;
	public static final int _tls_freeOffset_;
	public static final int _tls_getOffset_;
	public static final int _tls_setOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_abortOffset_ = 0;
		_attachOffset_ = 0;
		_clear_interruptedOffset_ = 0;
		_createOffset_ = 0;
		_exitOffset_ = 0;
		_get_priorityOffset_ = 0;
		_globalOffset_ = 0;
		_monitor_destroyOffset_ = 0;
		_monitor_enterOffset_ = 0;
		_monitor_exitOffset_ = 0;
		_monitor_init_with_nameOffset_ = 0;
		_monitor_notify_allOffset_ = 0;
		_monitor_waitOffset_ = 0;
		_priority_interruptOffset_ = 0;
		_selfOffset_ = 0;
		_set_priorityOffset_ = 0;
		_sleepOffset_ = 0;
		_tls_allocOffset_ = 0;
		_tls_freeOffset_ = 0;
		_tls_getOffset_ = 0;
		_tls_setOffset_ = 0;
	}

}