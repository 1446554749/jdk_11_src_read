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
 * Structure: RasdumpInternalConstants
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
public final class RasdumpInternalConstants {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9RAS_DUMP_INVALID_TYPE;
	public static final long J9RAS_DUMP_OPTS_PASS_ONE;
	public static final long J9RAS_DUMP_OPT_ARGS_ALLOC;
	public static final long J9RAS_DUMP_OPT_ARGS_STATIC;
	public static final long J9RAS_DUMP_OPT_DISABLED;
	public static final long J9RAS_SYSTEMINFO_CORE_PATTERN;
	public static final long J9RAS_SYSTEMINFO_CORE_USES_PID;
	public static final long J9RAS_SYSTEMINFO_HYPERVISOR;
	public static final long J9RAS_SYSTEMINFO_SCHED_COMPAT_YIELD;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9RAS_DUMP_INVALID_TYPE = 0;
		J9RAS_DUMP_OPTS_PASS_ONE = 0;
		J9RAS_DUMP_OPT_ARGS_ALLOC = 0;
		J9RAS_DUMP_OPT_ARGS_STATIC = 0;
		J9RAS_DUMP_OPT_DISABLED = 0;
		J9RAS_SYSTEMINFO_CORE_PATTERN = 0;
		J9RAS_SYSTEMINFO_CORE_USES_PID = 0;
		J9RAS_SYSTEMINFO_HYPERVISOR = 0;
		J9RAS_SYSTEMINFO_SCHED_COMPAT_YIELD = 0;
	}

}
