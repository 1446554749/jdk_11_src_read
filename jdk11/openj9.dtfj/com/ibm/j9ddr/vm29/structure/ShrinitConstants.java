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
 * Structure: ShrinitConstants
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
public final class ShrinitConstants {

	// VM Constants

	public static final long SIZEOF;
	public static final long PARSE_TYPE_EXACT;
	public static final long PARSE_TYPE_OPTIONAL;
	public static final long PARSE_TYPE_STARTSWITH;
	public static final long RESULT_DO_ADD_RUNTIMEFLAG;
	public static final long RESULT_DO_ADD_STORAGE_KEY_EQUALS;
	public static final long RESULT_DO_ADD_VERBOSEFLAG;
	public static final long RESULT_DO_ADJUST_MAXAOT_EQUALS;
	public static final long RESULT_DO_ADJUST_MAXJITDATA_EQUALS;
	public static final long RESULT_DO_ADJUST_MINAOT_EQUALS;
	public static final long RESULT_DO_ADJUST_MINJITDATA_EQUALS;
	public static final long RESULT_DO_ADJUST_SOFTMX_EQUALS;
	public static final long RESULT_DO_CACHEDIRPERM_EQUALS;
	public static final long RESULT_DO_CACHEDIR_EQUALS;
	public static final long RESULT_DO_CTRLD_EQUALS;
	public static final long RESULT_DO_DESTROY;
	public static final long RESULT_DO_DESTROYALL;
	public static final long RESULT_DO_DESTROYALLSNAPSHOTS;
	public static final long RESULT_DO_DESTROYSNAPSHOT;
	public static final long RESULT_DO_DISABLE_BCI;
	public static final long RESULT_DO_ENABLE_BCI;
	public static final long RESULT_DO_EXPIRE;
	public static final long RESULT_DO_FIND_AOT_METHODS_EQUALS;
	public static final long RESULT_DO_HELP;
	public static final long RESULT_DO_INVALIDATE_AOT_METHODS_EQUALS;
	public static final long RESULT_DO_LISTALLCACHES;
	public static final long RESULT_DO_MODIFIED_EQUALS;
	public static final long RESULT_DO_MORE_HELP;
	public static final long RESULT_DO_MPROTECT_EQUALS;
	public static final long RESULT_DO_NAME_EQUALS;
	public static final long RESULT_DO_NOTHING;
	public static final long RESULT_DO_PRINTALLSTATS;
	public static final long RESULT_DO_PRINTALLSTATS_EQUALS;
	public static final long RESULT_DO_PRINTDETAILS;
	public static final long RESULT_DO_PRINTORPHANSTATS;
	public static final long RESULT_DO_PRINTSTATS;
	public static final long RESULT_DO_PRINTSTATS_EQUALS;
	public static final long RESULT_DO_PRINT_CACHENAME;
	public static final long RESULT_DO_PRINT_SNAPSHOTNAME;
	public static final long RESULT_DO_RAW_DATA_AREA_SIZE_EQUALS;
	public static final long RESULT_DO_REMOVE_RUNTIMEFLAG;
	public static final long RESULT_DO_RESET;
	public static final long RESULT_DO_RESTORE_FROM_SNAPSHOT;
	public static final long RESULT_DO_REVALIDATE_AOT_METHODS_EQUALS;
	public static final long RESULT_DO_SET_VERBOSEFLAG;
	public static final long RESULT_DO_SNAPSHOTCACHE;
	public static final long RESULT_DO_TEST_INTERNAVL;
	public static final long RESULT_DO_UTILITIES;
	public static final long RESULT_NO_COREMMAP_SET;
	public static final long RESULT_PARSE_FAILED;
	public static final long SHRINIT_LOCAL_STRING_TABLE_SIZE_DIVISOR;
	public static final long SHRINIT_MAX_LOCAL_STRING_TABLE_BYTES;
	public static final long SHRINIT_MAX_SHARED_STRING_TABLE_NODE_COUNT;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		PARSE_TYPE_EXACT = 0;
		PARSE_TYPE_OPTIONAL = 0;
		PARSE_TYPE_STARTSWITH = 0;
		RESULT_DO_ADD_RUNTIMEFLAG = 0;
		RESULT_DO_ADD_STORAGE_KEY_EQUALS = 0;
		RESULT_DO_ADD_VERBOSEFLAG = 0;
		RESULT_DO_ADJUST_MAXAOT_EQUALS = 0;
		RESULT_DO_ADJUST_MAXJITDATA_EQUALS = 0;
		RESULT_DO_ADJUST_MINAOT_EQUALS = 0;
		RESULT_DO_ADJUST_MINJITDATA_EQUALS = 0;
		RESULT_DO_ADJUST_SOFTMX_EQUALS = 0;
		RESULT_DO_CACHEDIRPERM_EQUALS = 0;
		RESULT_DO_CACHEDIR_EQUALS = 0;
		RESULT_DO_CTRLD_EQUALS = 0;
		RESULT_DO_DESTROY = 0;
		RESULT_DO_DESTROYALL = 0;
		RESULT_DO_DESTROYALLSNAPSHOTS = 0;
		RESULT_DO_DESTROYSNAPSHOT = 0;
		RESULT_DO_DISABLE_BCI = 0;
		RESULT_DO_ENABLE_BCI = 0;
		RESULT_DO_EXPIRE = 0;
		RESULT_DO_FIND_AOT_METHODS_EQUALS = 0;
		RESULT_DO_HELP = 0;
		RESULT_DO_INVALIDATE_AOT_METHODS_EQUALS = 0;
		RESULT_DO_LISTALLCACHES = 0;
		RESULT_DO_MODIFIED_EQUALS = 0;
		RESULT_DO_MORE_HELP = 0;
		RESULT_DO_MPROTECT_EQUALS = 0;
		RESULT_DO_NAME_EQUALS = 0;
		RESULT_DO_NOTHING = 0;
		RESULT_DO_PRINTALLSTATS = 0;
		RESULT_DO_PRINTALLSTATS_EQUALS = 0;
		RESULT_DO_PRINTDETAILS = 0;
		RESULT_DO_PRINTORPHANSTATS = 0;
		RESULT_DO_PRINTSTATS = 0;
		RESULT_DO_PRINTSTATS_EQUALS = 0;
		RESULT_DO_PRINT_CACHENAME = 0;
		RESULT_DO_PRINT_SNAPSHOTNAME = 0;
		RESULT_DO_RAW_DATA_AREA_SIZE_EQUALS = 0;
		RESULT_DO_REMOVE_RUNTIMEFLAG = 0;
		RESULT_DO_RESET = 0;
		RESULT_DO_RESTORE_FROM_SNAPSHOT = 0;
		RESULT_DO_REVALIDATE_AOT_METHODS_EQUALS = 0;
		RESULT_DO_SET_VERBOSEFLAG = 0;
		RESULT_DO_SNAPSHOTCACHE = 0;
		RESULT_DO_TEST_INTERNAVL = 0;
		RESULT_DO_UTILITIES = 0;
		RESULT_NO_COREMMAP_SET = 0;
		RESULT_PARSE_FAILED = 0;
		SHRINIT_LOCAL_STRING_TABLE_SIZE_DIVISOR = 0;
		SHRINIT_MAX_LOCAL_STRING_TABLE_BYTES = 0;
		SHRINIT_MAX_SHARED_STRING_TABLE_NODE_COUNT = 0;
	}

}