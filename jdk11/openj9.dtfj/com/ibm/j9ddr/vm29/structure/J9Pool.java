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
 * Structure: J9Pool
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
public final class J9Pool {

	// VM Constants

	public static final long SIZEOF;
	public static final long POOL_ALLOC_TYPE_POOL;
	public static final long POOL_ALLOC_TYPE_PUDDLE;
	public static final long POOL_ALLOC_TYPE_PUDDLE_LIST;
	public static final long POOL_ALWAYS_KEEP_SORTED;
	public static final long POOL_NEVER_FREE_PUDDLES;
	public static final long POOL_NO_ZERO;
	public static final long POOL_ROUND_TO_PAGE_SIZE;
	public static final long POOL_USES_HOLES;

	// Offsets

	public static final int _alignmentOffset_;
	public static final int _elementSizeOffset_;
	public static final int _elementsPerPuddleOffset_;
	public static final int _flagsOffset_;
	public static final int _memAllocOffset_;
	public static final int _memFreeOffset_;
	public static final int _memoryCategoryOffset_;
	public static final int _poolCreatorCallsiteOffset_;
	public static final int _puddleAllocSizeOffset_;
	public static final int _puddleListOffset_;
	public static final int _userDataOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		POOL_ALLOC_TYPE_POOL = 0;
		POOL_ALLOC_TYPE_PUDDLE = 0;
		POOL_ALLOC_TYPE_PUDDLE_LIST = 0;
		POOL_ALWAYS_KEEP_SORTED = 0;
		POOL_NEVER_FREE_PUDDLES = 0;
		POOL_NO_ZERO = 0;
		POOL_ROUND_TO_PAGE_SIZE = 0;
		POOL_USES_HOLES = 0;
		_alignmentOffset_ = 0;
		_elementSizeOffset_ = 0;
		_elementsPerPuddleOffset_ = 0;
		_flagsOffset_ = 0;
		_memAllocOffset_ = 0;
		_memFreeOffset_ = 0;
		_memoryCategoryOffset_ = 0;
		_poolCreatorCallsiteOffset_ = 0;
		_puddleAllocSizeOffset_ = 0;
		_puddleListOffset_ = 0;
		_userDataOffset_ = 0;
	}

}
