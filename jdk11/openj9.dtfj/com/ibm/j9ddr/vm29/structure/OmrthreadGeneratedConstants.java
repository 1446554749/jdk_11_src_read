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
 * Structure: OmrthreadGeneratedConstants
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
public final class OmrthreadGeneratedConstants {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9THREAD_CATEGORY_APPLICATION_THREAD;
	public static final long J9THREAD_CATEGORY_RESOURCE_MONITOR_THREAD;
	public static final long J9THREAD_CATEGORY_SYSTEM_GC_THREAD;
	public static final long J9THREAD_CATEGORY_SYSTEM_JIT_THREAD;
	public static final long J9THREAD_CATEGORY_SYSTEM_THREAD;
	public static final long J9THREAD_MAX_TLS_KEYS;
	public static final long J9THREAD_MAX_USER_DEFINED_THREAD_CATEGORIES;
	public static final long J9THREAD_TYPE_SET_ATTACH;
	public static final long J9THREAD_TYPE_SET_CREATE;
	public static final long J9THREAD_TYPE_SET_GC;
	public static final long J9THREAD_TYPE_SET_MODIFY;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_1;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_2;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_3;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_4;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_5;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_BIT_SHIFT;
	public static final long J9THREAD_USER_DEFINED_THREAD_CATEGORY_MASK;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9THREAD_CATEGORY_APPLICATION_THREAD = 0;
		J9THREAD_CATEGORY_RESOURCE_MONITOR_THREAD = 0;
		J9THREAD_CATEGORY_SYSTEM_GC_THREAD = 0;
		J9THREAD_CATEGORY_SYSTEM_JIT_THREAD = 0;
		J9THREAD_CATEGORY_SYSTEM_THREAD = 0;
		J9THREAD_MAX_TLS_KEYS = 0;
		J9THREAD_MAX_USER_DEFINED_THREAD_CATEGORIES = 0;
		J9THREAD_TYPE_SET_ATTACH = 0;
		J9THREAD_TYPE_SET_CREATE = 0;
		J9THREAD_TYPE_SET_GC = 0;
		J9THREAD_TYPE_SET_MODIFY = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_1 = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_2 = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_3 = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_4 = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_5 = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_BIT_SHIFT = 0;
		J9THREAD_USER_DEFINED_THREAD_CATEGORY_MASK = 0;
	}

}