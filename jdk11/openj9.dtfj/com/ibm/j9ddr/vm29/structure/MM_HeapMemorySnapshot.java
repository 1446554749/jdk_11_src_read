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
 * Structure: MM_HeapMemorySnapshot
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
public final class MM_HeapMemorySnapshot {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __freeHeapSizeOffset_;
	public static final int __freeNurseryAllocateSizeOffset_;
	public static final int __freeNurserySurvivorSizeOffset_;
	public static final int __freeRegionEdenSizeOffset_;
	public static final int __freeRegionOldSizeOffset_;
	public static final int __freeRegionReservedSizeOffset_;
	public static final int __freeRegionSurvivorSizeOffset_;
	public static final int __freeTenuredLOASizeOffset_;
	public static final int __freeTenuredSOASizeOffset_;
	public static final int __freeTenuredSizeOffset_;
	public static final int __totalHeapSizeOffset_;
	public static final int __totalNurseryAllocateSizeOffset_;
	public static final int __totalNurserySurvivorSizeOffset_;
	public static final int __totalRegionEdenSizeOffset_;
	public static final int __totalRegionOldSizeOffset_;
	public static final int __totalRegionReservedSizeOffset_;
	public static final int __totalRegionSurvivorSizeOffset_;
	public static final int __totalTenuredLOASizeOffset_;
	public static final int __totalTenuredSOASizeOffset_;
	public static final int __totalTenuredSizeOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__freeHeapSizeOffset_ = 0;
		__freeNurseryAllocateSizeOffset_ = 0;
		__freeNurserySurvivorSizeOffset_ = 0;
		__freeRegionEdenSizeOffset_ = 0;
		__freeRegionOldSizeOffset_ = 0;
		__freeRegionReservedSizeOffset_ = 0;
		__freeRegionSurvivorSizeOffset_ = 0;
		__freeTenuredLOASizeOffset_ = 0;
		__freeTenuredSOASizeOffset_ = 0;
		__freeTenuredSizeOffset_ = 0;
		__totalHeapSizeOffset_ = 0;
		__totalNurseryAllocateSizeOffset_ = 0;
		__totalNurserySurvivorSizeOffset_ = 0;
		__totalRegionEdenSizeOffset_ = 0;
		__totalRegionOldSizeOffset_ = 0;
		__totalRegionReservedSizeOffset_ = 0;
		__totalRegionSurvivorSizeOffset_ = 0;
		__totalTenuredLOASizeOffset_ = 0;
		__totalTenuredSOASizeOffset_ = 0;
		__totalTenuredSizeOffset_ = 0;
	}

}
