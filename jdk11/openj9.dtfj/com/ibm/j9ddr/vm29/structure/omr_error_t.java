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
 * Structure: omr_error_t
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
public final class omr_error_t {

	// VM Constants

	public static final long SIZEOF;
	public static final long OMR_ERROR_FAILED_TO_ALLOCATE_MONITOR;
	public static final long OMR_ERROR_FAILED_TO_ATTACH_NATIVE_THREAD;
	public static final long OMR_ERROR_FILE_UNAVAILABLE;
	public static final long OMR_ERROR_ILLEGAL_ARGUMENT;
	public static final long OMR_ERROR_INTERNAL;
	public static final long OMR_ERROR_MAXIMUM_THREAD_COUNT_EXCEEDED;
	public static final long OMR_ERROR_MAXIMUM_VM_COUNT_EXCEEDED;
	public static final long OMR_ERROR_NONE;
	public static final long OMR_ERROR_NOT_AVAILABLE;
	public static final long OMR_ERROR_OUT_OF_NATIVE_MEMORY;
	public static final long OMR_ERROR_RETRY;
	public static final long OMR_THREAD_NOT_ATTACHED;
	public static final long OMR_THREAD_STILL_ATTACHED;
	public static final long OMR_VM_STILL_ATTACHED;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		OMR_ERROR_FAILED_TO_ALLOCATE_MONITOR = 0;
		OMR_ERROR_FAILED_TO_ATTACH_NATIVE_THREAD = 0;
		OMR_ERROR_FILE_UNAVAILABLE = 0;
		OMR_ERROR_ILLEGAL_ARGUMENT = 0;
		OMR_ERROR_INTERNAL = 0;
		OMR_ERROR_MAXIMUM_THREAD_COUNT_EXCEEDED = 0;
		OMR_ERROR_MAXIMUM_VM_COUNT_EXCEEDED = 0;
		OMR_ERROR_NONE = 0;
		OMR_ERROR_NOT_AVAILABLE = 0;
		OMR_ERROR_OUT_OF_NATIVE_MEMORY = 0;
		OMR_ERROR_RETRY = 0;
		OMR_THREAD_NOT_ATTACHED = 0;
		OMR_THREAD_STILL_ATTACHED = 0;
		OMR_VM_STILL_ATTACHED = 0;
	}

}