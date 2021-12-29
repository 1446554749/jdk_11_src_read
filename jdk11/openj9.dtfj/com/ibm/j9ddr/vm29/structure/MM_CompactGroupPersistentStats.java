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
 * Structure: MM_CompactGroupPersistentStats
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
public final class MM_CompactGroupPersistentStats {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __averageAllocationAgeToGroupOffset_;
	public static final int __historicalSurvivalRateOffset_;
	public static final int __liveBytesAbsoluteDeviationOffset_;
	public static final int __maxAllocationAgeOffset_;
	public static final int __measuredAllocationAgeToGroupDuringCopyForwardOffset_;
	public static final int __measuredBytesCopiedFromGroupDuringCopyForwardOffset_;
	public static final int __measuredBytesCopiedToGroupDuringCopyForwardOffset_;
	public static final int __measuredLiveBytesAfterCollectInCollectedSetOffset_;
	public static final int __measuredLiveBytesAfterCollectInGroupOffset_;
	public static final int __measuredLiveBytesBeforeCollectInCollectedSetOffset_;
	public static final int __measuredLiveBytesBeforeCollectInGroupOffset_;
	public static final int __projectedInstantaneousSurvivalRateOffset_;
	public static final int __projectedInstantaneousSurvivalRatePerAgeUnitOffset_;
	public static final int __projectedInstantaneousSurvivalRateThisPGCPerAgeUnitOffset_;
	public static final int __projectedLiveBytesOffset_;
	public static final int __projectedLiveBytesAfterPreviousPGCInCollectedSetOffset_;
	public static final int __projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionOffset_;
	public static final int __projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionOffset_;
	public static final int __projectedLiveBytesBeforeCollectInCollectedSetOffset_;
	public static final int __projectedLiveBytesBeforeCollectInGroupOffset_;
	public static final int __regionCountOffset_;
	public static final int __regionsInRegionCollectionSetForPGCOffset_;
	public static final int __statsHaveBeenUpdatedThisCycleOffset_;
	public static final int __weightedSurvivalRateOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__averageAllocationAgeToGroupOffset_ = 0;
		__historicalSurvivalRateOffset_ = 0;
		__liveBytesAbsoluteDeviationOffset_ = 0;
		__maxAllocationAgeOffset_ = 0;
		__measuredAllocationAgeToGroupDuringCopyForwardOffset_ = 0;
		__measuredBytesCopiedFromGroupDuringCopyForwardOffset_ = 0;
		__measuredBytesCopiedToGroupDuringCopyForwardOffset_ = 0;
		__measuredLiveBytesAfterCollectInCollectedSetOffset_ = 0;
		__measuredLiveBytesAfterCollectInGroupOffset_ = 0;
		__measuredLiveBytesBeforeCollectInCollectedSetOffset_ = 0;
		__measuredLiveBytesBeforeCollectInGroupOffset_ = 0;
		__projectedInstantaneousSurvivalRateOffset_ = 0;
		__projectedInstantaneousSurvivalRatePerAgeUnitOffset_ = 0;
		__projectedInstantaneousSurvivalRateThisPGCPerAgeUnitOffset_ = 0;
		__projectedLiveBytesOffset_ = 0;
		__projectedLiveBytesAfterPreviousPGCInCollectedSetOffset_ = 0;
		__projectedLiveBytesAfterPreviousPGCInCollectedSetForEdenFractionOffset_ = 0;
		__projectedLiveBytesAfterPreviousPGCInCollectedSetForNonEdenFractionOffset_ = 0;
		__projectedLiveBytesBeforeCollectInCollectedSetOffset_ = 0;
		__projectedLiveBytesBeforeCollectInGroupOffset_ = 0;
		__regionCountOffset_ = 0;
		__regionsInRegionCollectionSetForPGCOffset_ = 0;
		__statsHaveBeenUpdatedThisCycleOffset_ = 0;
		__weightedSurvivalRateOffset_ = 0;
	}

}