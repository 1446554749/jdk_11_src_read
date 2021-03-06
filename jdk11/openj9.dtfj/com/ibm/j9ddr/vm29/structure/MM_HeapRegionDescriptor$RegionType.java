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
 * Structure: MM_HeapRegionDescriptor$RegionType
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
public final class MM_HeapRegionDescriptor$RegionType {

	// VM Constants

	public static final long SIZEOF;
	public static final long ADDRESS_ORDERED;
	public static final long ADDRESS_ORDERED_IDLE;
	public static final long ADDRESS_ORDERED_MARKED;
	public static final long ARRAYLET_LEAF;
	public static final long BUMP_ALLOCATED;
	public static final long BUMP_ALLOCATED_IDLE;
	public static final long BUMP_ALLOCATED_MARKED;
	public static final long FREE;
	public static final long LAST_REGION_TYPE;
	public static final long RESERVED;
	public static final long SEGREGATED_LARGE;
	public static final long SEGREGATED_SMALL;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		ADDRESS_ORDERED = 0;
		ADDRESS_ORDERED_IDLE = 0;
		ADDRESS_ORDERED_MARKED = 0;
		ARRAYLET_LEAF = 0;
		BUMP_ALLOCATED = 0;
		BUMP_ALLOCATED_IDLE = 0;
		BUMP_ALLOCATED_MARKED = 0;
		FREE = 0;
		LAST_REGION_TYPE = 0;
		RESERVED = 0;
		SEGREGATED_LARGE = 0;
		SEGREGATED_SMALL = 0;
	}

}
