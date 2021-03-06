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
 * Structure: ShchelpConstants
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
public final class ShchelpConstants {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9PORT_SHR_CACHE_TYPE_CROSSGUEST;
	public static final long J9PORT_SHR_CACHE_TYPE_NONPERSISTENT;
	public static final long J9PORT_SHR_CACHE_TYPE_PERSISTENT;
	public static final long J9PORT_SHR_CACHE_TYPE_SNAPSHOT;
	public static final long J9PORT_SHR_CACHE_TYPE_VMEM;
	public static final long J9SH_ADDRMODE_32;
	public static final long J9SH_ADDRMODE_64;
	public static final long J9SH_FEATURE_COMPRESSED_POINTERS;
	public static final long J9SH_FEATURE_DEFAULT;
	public static final long J9SH_FEATURE_MAX_VALUE;
	public static final long J9SH_FEATURE_NON_COMPRESSED_POINTERS;
	public static final long J9SH_GENERATION_07;
	public static final long J9SH_GENERATION_29;
	public static final long J9SH_MODLEVEL_JAVA5;
	public static final long J9SH_MODLEVEL_JAVA6;
	public static final long J9SH_MODLEVEL_JAVA7;
	public static final long J9SH_MODLEVEL_JAVA8;
	public static final long J9SH_MODLEVEL_JAVA9;
	public static final long J9SH_VERSION_STRING_LEN;
	public static final long J9SH_VERSTRLEN_INCREASED_SINCEG29;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9PORT_SHR_CACHE_TYPE_CROSSGUEST = 0;
		J9PORT_SHR_CACHE_TYPE_NONPERSISTENT = 0;
		J9PORT_SHR_CACHE_TYPE_PERSISTENT = 0;
		J9PORT_SHR_CACHE_TYPE_SNAPSHOT = 0;
		J9PORT_SHR_CACHE_TYPE_VMEM = 0;
		J9SH_ADDRMODE_32 = 0;
		J9SH_ADDRMODE_64 = 0;
		J9SH_FEATURE_COMPRESSED_POINTERS = 0;
		J9SH_FEATURE_DEFAULT = 0;
		J9SH_FEATURE_MAX_VALUE = 0;
		J9SH_FEATURE_NON_COMPRESSED_POINTERS = 0;
		J9SH_GENERATION_07 = 0;
		J9SH_GENERATION_29 = 0;
		J9SH_MODLEVEL_JAVA5 = 0;
		J9SH_MODLEVEL_JAVA6 = 0;
		J9SH_MODLEVEL_JAVA7 = 0;
		J9SH_MODLEVEL_JAVA8 = 0;
		J9SH_MODLEVEL_JAVA9 = 0;
		J9SH_VERSION_STRING_LEN = 0;
		J9SH_VERSTRLEN_INCREASED_SINCEG29 = 0;
	}

}
