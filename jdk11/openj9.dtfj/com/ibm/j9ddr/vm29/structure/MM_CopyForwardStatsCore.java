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
 * Structure: MM_CopyForwardStatsCore
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
public final class MM_CopyForwardStatsCore {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __abortStallCountOffset_;
	public static final int __abortStallTimeOffset_;
	public static final int __abortedOffset_;
	public static final int __acquireFreeListCountOffset_;
	public static final int __acquireScanListCountOffset_;
	public static final int __bytesCardCleanOffset_;
	public static final int __completeStallCountOffset_;
	public static final int __completeStallTimeOffset_;
	public static final int __copiedArraysSplitOffset_;
	public static final int __copyBytesEdenOffset_;
	public static final int __copyBytesNonEdenOffset_;
	public static final int __copyBytesTotalOffset_;
	public static final int __copyDiscardBytesEdenOffset_;
	public static final int __copyDiscardBytesNonEdenOffset_;
	public static final int __copyDiscardBytesTotalOffset_;
	public static final int __copyObjectsEdenOffset_;
	public static final int __copyObjectsNonEdenOffset_;
	public static final int __copyObjectsTotalOffset_;
	public static final int __edenEvacuateRegionCountOffset_;
	public static final int __edenSurvivorRegionCountOffset_;
	public static final int __endTimeOffset_;
	public static final int __externalCompactBytesOffset_;
	public static final int __freeMemoryAfterOffset_;
	public static final int __freeMemoryBeforeOffset_;
	public static final int __gcCountOffset_;
	public static final int __heapExpandedBytesOffset_;
	public static final int __heapExpandedCountOffset_;
	public static final int __heapExpandedTimeOffset_;
	public static final int __irrsStallCountOffset_;
	public static final int __irrsStallTimeOffset_;
	public static final int __markStallCountOffset_;
	public static final int __markStallTimeOffset_;
	public static final int __markedArraysSplitOffset_;
	public static final int __nonEdenEvacuateRegionCountOffset_;
	public static final int __nonEdenSurvivorRegionCountOffset_;
	public static final int __nonEvacuateRegionCountOffset_;
	public static final int __objectsCardCleanOffset_;
	public static final int __objectsScannedFromDepthStackOffset_;
	public static final int __objectsScannedFromNextInChainOffset_;
	public static final int __objectsScannedFromOverflowedRegionOffset_;
	public static final int __objectsScannedFromRootOffset_;
	public static final int __objectsScannedFromWorkPacketsOffset_;
	public static final int __releaseFreeListCountOffset_;
	public static final int __releaseScanListCountOffset_;
	public static final int __scanBytesEdenOffset_;
	public static final int __scanBytesNonEdenOffset_;
	public static final int __scanBytesTotalOffset_;
	public static final int __scanCacheOverflowOffset_;
	public static final int __scanObjectsEdenOffset_;
	public static final int __scanObjectsNonEdenOffset_;
	public static final int __scanObjectsTotalOffset_;
	public static final int __startTimeOffset_;
	public static final int __syncStallCountOffset_;
	public static final int __syncStallTimeOffset_;
	public static final int __totalMemoryAfterOffset_;
	public static final int __totalMemoryBeforeOffset_;
	public static final int __workStallCountOffset_;
	public static final int __workStallTimeOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__abortStallCountOffset_ = 0;
		__abortStallTimeOffset_ = 0;
		__abortedOffset_ = 0;
		__acquireFreeListCountOffset_ = 0;
		__acquireScanListCountOffset_ = 0;
		__bytesCardCleanOffset_ = 0;
		__completeStallCountOffset_ = 0;
		__completeStallTimeOffset_ = 0;
		__copiedArraysSplitOffset_ = 0;
		__copyBytesEdenOffset_ = 0;
		__copyBytesNonEdenOffset_ = 0;
		__copyBytesTotalOffset_ = 0;
		__copyDiscardBytesEdenOffset_ = 0;
		__copyDiscardBytesNonEdenOffset_ = 0;
		__copyDiscardBytesTotalOffset_ = 0;
		__copyObjectsEdenOffset_ = 0;
		__copyObjectsNonEdenOffset_ = 0;
		__copyObjectsTotalOffset_ = 0;
		__edenEvacuateRegionCountOffset_ = 0;
		__edenSurvivorRegionCountOffset_ = 0;
		__endTimeOffset_ = 0;
		__externalCompactBytesOffset_ = 0;
		__freeMemoryAfterOffset_ = 0;
		__freeMemoryBeforeOffset_ = 0;
		__gcCountOffset_ = 0;
		__heapExpandedBytesOffset_ = 0;
		__heapExpandedCountOffset_ = 0;
		__heapExpandedTimeOffset_ = 0;
		__irrsStallCountOffset_ = 0;
		__irrsStallTimeOffset_ = 0;
		__markStallCountOffset_ = 0;
		__markStallTimeOffset_ = 0;
		__markedArraysSplitOffset_ = 0;
		__nonEdenEvacuateRegionCountOffset_ = 0;
		__nonEdenSurvivorRegionCountOffset_ = 0;
		__nonEvacuateRegionCountOffset_ = 0;
		__objectsCardCleanOffset_ = 0;
		__objectsScannedFromDepthStackOffset_ = 0;
		__objectsScannedFromNextInChainOffset_ = 0;
		__objectsScannedFromOverflowedRegionOffset_ = 0;
		__objectsScannedFromRootOffset_ = 0;
		__objectsScannedFromWorkPacketsOffset_ = 0;
		__releaseFreeListCountOffset_ = 0;
		__releaseScanListCountOffset_ = 0;
		__scanBytesEdenOffset_ = 0;
		__scanBytesNonEdenOffset_ = 0;
		__scanBytesTotalOffset_ = 0;
		__scanCacheOverflowOffset_ = 0;
		__scanObjectsEdenOffset_ = 0;
		__scanObjectsNonEdenOffset_ = 0;
		__scanObjectsTotalOffset_ = 0;
		__startTimeOffset_ = 0;
		__syncStallCountOffset_ = 0;
		__syncStallTimeOffset_ = 0;
		__totalMemoryAfterOffset_ = 0;
		__totalMemoryBeforeOffset_ = 0;
		__workStallCountOffset_ = 0;
		__workStallTimeOffset_ = 0;
	}

}
