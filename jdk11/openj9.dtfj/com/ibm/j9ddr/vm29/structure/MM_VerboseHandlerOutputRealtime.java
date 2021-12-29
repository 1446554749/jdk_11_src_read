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
 * Structure: MM_VerboseHandlerOutputRealtime
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
public final class MM_VerboseHandlerOutputRealtime {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __anonymousClassesUnloadedTotalOffset_;
	public static final int __classLoadersUnloadedTotalOffset_;
	public static final int __classesUnloadedTotalOffset_;
	public static final int __dynamicSoftReferenceThresholdOffset_;
	public static final int __finalizableCountTotalOffset_;
	public static final int __gcPhaseOffset_;
	public static final int __heartbeatStartTimeOffset_;
	public static final int __incrementCountOffset_;
	public static final int __incrementStartTimeOffset_;
	public static final int __maxExclusiveAccessTimeOffset_;
	public static final int __maxHeapFreeOffset_;
	public static final int __maxIncrementStartTimeOffset_;
	public static final int __maxIncrementTimeOffset_;
	public static final int __maxStartPriorityOffset_;
	public static final int __minExclusiveAccessTimeOffset_;
	public static final int __minHeapFreeOffset_;
	public static final int __minIncrementTimeOffset_;
	public static final int __minStartPriorityOffset_;
	public static final int __mmHooksOffset_;
	public static final int __nonDeterministicSweepConsecutiveMaxOffset_;
	public static final int __nonDeterministicSweepDelayMaxOffset_;
	public static final int __nonDeterministicSweepTotalOffset_;
	public static final int __objectOverflowCountTotalOffset_;
	public static final int __phantomReferenceClearCountTotalOffset_;
	public static final int __previousGCPhaseOffset_;
	public static final int __softReferenceClearCountTotalOffset_;
	public static final int __softReferenceThresholdOffset_;
	public static final int __syncGCExclusiveAccessTimeOffset_;
	public static final int __syncGCReasonOffset_;
	public static final int __syncGCReasonParameterOffset_;
	public static final int __syncGCStartAnonymousClassesUnloadedOffset_;
	public static final int __syncGCStartClassLoadersUnloadedOffset_;
	public static final int __syncGCStartClassesUnloadedOffset_;
	public static final int __syncGCStartHeapFreeOffset_;
	public static final int __syncGCStartImmortalFreeOffset_;
	public static final int __syncGCStartTimeOffset_;
	public static final int __syncGCTriggeredOffset_;
	public static final int __totalExclusiveAccessTimeOffset_;
	public static final int __totalHeapFreeOffset_;
	public static final int __totalIncrementTimeOffset_;
	public static final int __verboseInitTimeStampOffset_;
	public static final int __weakReferenceClearCountTotalOffset_;
	public static final int __workPacketOverflowCountTotalOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__anonymousClassesUnloadedTotalOffset_ = 0;
		__classLoadersUnloadedTotalOffset_ = 0;
		__classesUnloadedTotalOffset_ = 0;
		__dynamicSoftReferenceThresholdOffset_ = 0;
		__finalizableCountTotalOffset_ = 0;
		__gcPhaseOffset_ = 0;
		__heartbeatStartTimeOffset_ = 0;
		__incrementCountOffset_ = 0;
		__incrementStartTimeOffset_ = 0;
		__maxExclusiveAccessTimeOffset_ = 0;
		__maxHeapFreeOffset_ = 0;
		__maxIncrementStartTimeOffset_ = 0;
		__maxIncrementTimeOffset_ = 0;
		__maxStartPriorityOffset_ = 0;
		__minExclusiveAccessTimeOffset_ = 0;
		__minHeapFreeOffset_ = 0;
		__minIncrementTimeOffset_ = 0;
		__minStartPriorityOffset_ = 0;
		__mmHooksOffset_ = 0;
		__nonDeterministicSweepConsecutiveMaxOffset_ = 0;
		__nonDeterministicSweepDelayMaxOffset_ = 0;
		__nonDeterministicSweepTotalOffset_ = 0;
		__objectOverflowCountTotalOffset_ = 0;
		__phantomReferenceClearCountTotalOffset_ = 0;
		__previousGCPhaseOffset_ = 0;
		__softReferenceClearCountTotalOffset_ = 0;
		__softReferenceThresholdOffset_ = 0;
		__syncGCExclusiveAccessTimeOffset_ = 0;
		__syncGCReasonOffset_ = 0;
		__syncGCReasonParameterOffset_ = 0;
		__syncGCStartAnonymousClassesUnloadedOffset_ = 0;
		__syncGCStartClassLoadersUnloadedOffset_ = 0;
		__syncGCStartClassesUnloadedOffset_ = 0;
		__syncGCStartHeapFreeOffset_ = 0;
		__syncGCStartImmortalFreeOffset_ = 0;
		__syncGCStartTimeOffset_ = 0;
		__syncGCTriggeredOffset_ = 0;
		__totalExclusiveAccessTimeOffset_ = 0;
		__totalHeapFreeOffset_ = 0;
		__totalIncrementTimeOffset_ = 0;
		__verboseInitTimeStampOffset_ = 0;
		__weakReferenceClearCountTotalOffset_ = 0;
		__workPacketOverflowCountTotalOffset_ = 0;
	}

}
