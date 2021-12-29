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
 * Structure: OMRPortPlatformGlobals
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
public final class OMRPortPlatformGlobals {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _globalConverterEnabledOffset_;
	public static final int _isRunningInContainerOffset_;
	public static final int _loggingEnabledOffset_;
	public static final int _numa_platform_interleave_memoryOffset_;
	public static final int _numa_platform_supports_numaOffset_;
	public static final int _si_executableNameOffset_;
	public static final int _si_osTypeOffset_;
	public static final int _si_osVersionOffset_;
	public static final int _stfleCacheOffset_;
	public static final int _subAllocHeapMem32Offset_;
	public static final int _systemLoggingFlagsOffset_;
	public static final int _vmem_pageFlagsOffset_;
	public static final int _vmem_pageSizeOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_globalConverterEnabledOffset_ = 0;
		_isRunningInContainerOffset_ = 0;
		_loggingEnabledOffset_ = 0;
		_numa_platform_interleave_memoryOffset_ = 0;
		_numa_platform_supports_numaOffset_ = 0;
		_si_executableNameOffset_ = 0;
		_si_osTypeOffset_ = 0;
		_si_osVersionOffset_ = 0;
		_stfleCacheOffset_ = 0;
		_subAllocHeapMem32Offset_ = 0;
		_systemLoggingFlagsOffset_ = 0;
		_vmem_pageFlagsOffset_ = 0;
		_vmem_pageSizeOffset_ = 0;
	}

}
