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
 * Structure: MM_ConcurrentCardTable
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
public final class MM_ConcurrentCardTable {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __cardCleanPhaseOffset_;
	public static final int __cardTableReconfiguredOffset_;
	public static final int __cardTableStatsOffset_;
	public static final int __cleanAllCardsOffset_;
	public static final int __cleaningRangesOffset_;
	public static final int __collectorOffset_;
	public static final int __concurrentCardCleanMaskOffset_;
	public static final int __currentCleaningRangeOffset_;
	public static final int __dispatcherOffset_;
	public static final int __extensionsOffset_;
	public static final int __finalCardCleanMaskOffset_;
	public static final int __firstCardInPhaseOffset_;
	public static final int __firstCardInPhase2Offset_;
	public static final int __lastCardOffset_;
	public static final int __lastCardCleanPhaseOffset_;
	public static final int __lastCardInPhaseOffset_;
	public static final int __lastCleaningRangeOffset_;
	public static final int __markingSchemeOffset_;
	public static final int __maxCleaningRangesOffset_;
	public static final int __omrVMOffset_;
	public static final int __tlhMarkBitsOffset_;
	public static final int __tlhMarkMapMemoryHandleOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__cardCleanPhaseOffset_ = 0;
		__cardTableReconfiguredOffset_ = 0;
		__cardTableStatsOffset_ = 0;
		__cleanAllCardsOffset_ = 0;
		__cleaningRangesOffset_ = 0;
		__collectorOffset_ = 0;
		__concurrentCardCleanMaskOffset_ = 0;
		__currentCleaningRangeOffset_ = 0;
		__dispatcherOffset_ = 0;
		__extensionsOffset_ = 0;
		__finalCardCleanMaskOffset_ = 0;
		__firstCardInPhaseOffset_ = 0;
		__firstCardInPhase2Offset_ = 0;
		__lastCardOffset_ = 0;
		__lastCardCleanPhaseOffset_ = 0;
		__lastCardInPhaseOffset_ = 0;
		__lastCleaningRangeOffset_ = 0;
		__markingSchemeOffset_ = 0;
		__maxCleaningRangesOffset_ = 0;
		__omrVMOffset_ = 0;
		__tlhMarkBitsOffset_ = 0;
		__tlhMarkMapMemoryHandleOffset_ = 0;
	}

}
