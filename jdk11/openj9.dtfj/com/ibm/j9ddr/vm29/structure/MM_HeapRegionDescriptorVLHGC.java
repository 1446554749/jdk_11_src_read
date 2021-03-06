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
 * Structure: MM_HeapRegionDescriptorVLHGC
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
public final class MM_HeapRegionDescriptorVLHGC {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __ageOffset_;
	public static final int __allocateDataOffset_;
	public static final int __allocationAgeOffset_;
	public static final int __allocationAgeSizeProductOffset_;
	public static final int __arrayletDoublemapIDOffset_;
	public static final int __compactDataOffset_;
	public static final int __compactDestinationQueueNextOffset_;
	public static final int __copyForwardData$_evacuateSetOffset_;
	public static final int __copyForwardData$_initialLiveSetOffset_;
	public static final int __copyForwardData$_nextRegionOffset_;
	public static final int __copyForwardData$_previousRegionOffset_;
	public static final int __copyForwardData$_requiresPhantomReferenceProcessingOffset_;
	public static final int __copyForwardData$_survivorBaseOffset_;
	public static final int __copyForwardData$_survivorSetAbortedOffset_;
	public static final int __criticalRegionsInUseOffset_;
	public static final int __defragmentationTargetOffset_;
	public static final int __dynamicSelectionNextOffset_;
	public static final int __extensionsOffset_;
	public static final int __lowerAgeBoundOffset_;
	public static final int __markData$_dynamicMarkCostOffset_;
	public static final int __markData$_noEvacuationOffset_;
	public static final int __markData$_overflowFlagsOffset_;
	public static final int __markData$_shouldMarkOffset_;
	public static final int __nextMarkMapClearedOffset_;
	public static final int __ownableSynchronizerObjectListOffset_;
	public static final int __previousMarkMapClearedOffset_;
	public static final int __projectedLiveBytesOffset_;
	public static final int __projectedLiveBytesDeviationOffset_;
	public static final int __projectedLiveBytesPreviousPGCOffset_;
	public static final int __reclaimData$_shouldReclaimOffset_;
	public static final int __referenceObjectListOffset_;
	public static final int __rememberedSetCardListOffset_;
	public static final int __rsclBufferPoolOffset_;
	public static final int __sweepData$_alreadySweptOffset_;
	public static final int __sweepData$_lastGCNumberOffset_;
	public static final int __unfinalizedObjectListOffset_;
	public static final int __upperAgeBoundOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__ageOffset_ = 0;
		__allocateDataOffset_ = 0;
		__allocationAgeOffset_ = 0;
		__allocationAgeSizeProductOffset_ = 0;
		__arrayletDoublemapIDOffset_ = 0;
		__compactDataOffset_ = 0;
		__compactDestinationQueueNextOffset_ = 0;
		__copyForwardData$_evacuateSetOffset_ = 0;
		__copyForwardData$_initialLiveSetOffset_ = 0;
		__copyForwardData$_nextRegionOffset_ = 0;
		__copyForwardData$_previousRegionOffset_ = 0;
		__copyForwardData$_requiresPhantomReferenceProcessingOffset_ = 0;
		__copyForwardData$_survivorBaseOffset_ = 0;
		__copyForwardData$_survivorSetAbortedOffset_ = 0;
		__criticalRegionsInUseOffset_ = 0;
		__defragmentationTargetOffset_ = 0;
		__dynamicSelectionNextOffset_ = 0;
		__extensionsOffset_ = 0;
		__lowerAgeBoundOffset_ = 0;
		__markData$_dynamicMarkCostOffset_ = 0;
		__markData$_noEvacuationOffset_ = 0;
		__markData$_overflowFlagsOffset_ = 0;
		__markData$_shouldMarkOffset_ = 0;
		__nextMarkMapClearedOffset_ = 0;
		__ownableSynchronizerObjectListOffset_ = 0;
		__previousMarkMapClearedOffset_ = 0;
		__projectedLiveBytesOffset_ = 0;
		__projectedLiveBytesDeviationOffset_ = 0;
		__projectedLiveBytesPreviousPGCOffset_ = 0;
		__reclaimData$_shouldReclaimOffset_ = 0;
		__referenceObjectListOffset_ = 0;
		__rememberedSetCardListOffset_ = 0;
		__rsclBufferPoolOffset_ = 0;
		__sweepData$_alreadySweptOffset_ = 0;
		__sweepData$_lastGCNumberOffset_ = 0;
		__unfinalizedObjectListOffset_ = 0;
		__upperAgeBoundOffset_ = 0;
	}

}
