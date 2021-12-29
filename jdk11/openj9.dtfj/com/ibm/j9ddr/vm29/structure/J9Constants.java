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
 * Structure: J9Constants
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
public final class J9Constants {

	// VM Constants

	public static final long SIZEOF;
	public static final long AOT_MAJOR_VERSION;
	public static final long AOT_MINOR_VERSION;
	public static final long J9JNIREDIRECT_BLOCK_SIZE;
	public static final long J9VM_PACKAGE_NAME_BUFFER_LENGTH;
	public static final long J9_ARRAY_DIMENSION_LIMIT;
	public static final long J9_REDIRECTED_REFERENCE;
	public static final long MAXIMUM_HEAP_SIZE_RECOMMENDED_FOR_3BIT_SHIFT_COMPRESSEDREFS;
	public static final long MAXIMUM_HEAP_SIZE_RECOMMENDED_FOR_COMPRESSEDREFS;
	public static final long VERBOSE_CLASS;
	public static final long VERBOSE_DEBUG;
	public static final long VERBOSE_DUMPSIZES;
	public static final long VERBOSE_DYNLOAD;
	public static final long VERBOSE_GC;
	public static final long VERBOSE_INIT;
	public static final long VERBOSE_RELOCATIONS;
	public static final long VERBOSE_RESERVED;
	public static final long VERBOSE_ROMCLASS;
	public static final long VERBOSE_SHUTDOWN;
	public static final long VERBOSE_STACK;
	public static final long VERBOSE_STACKTRACE;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		AOT_MAJOR_VERSION = 0;
		AOT_MINOR_VERSION = 0;
		J9JNIREDIRECT_BLOCK_SIZE = 0;
		J9VM_PACKAGE_NAME_BUFFER_LENGTH = 0;
		J9_ARRAY_DIMENSION_LIMIT = 0;
		J9_REDIRECTED_REFERENCE = 0;
		MAXIMUM_HEAP_SIZE_RECOMMENDED_FOR_3BIT_SHIFT_COMPRESSEDREFS = 0;
		MAXIMUM_HEAP_SIZE_RECOMMENDED_FOR_COMPRESSEDREFS = 0;
		VERBOSE_CLASS = 0;
		VERBOSE_DEBUG = 0;
		VERBOSE_DUMPSIZES = 0;
		VERBOSE_DYNLOAD = 0;
		VERBOSE_GC = 0;
		VERBOSE_INIT = 0;
		VERBOSE_RELOCATIONS = 0;
		VERBOSE_RESERVED = 0;
		VERBOSE_ROMCLASS = 0;
		VERBOSE_SHUTDOWN = 0;
		VERBOSE_STACK = 0;
		VERBOSE_STACKTRACE = 0;
	}

}