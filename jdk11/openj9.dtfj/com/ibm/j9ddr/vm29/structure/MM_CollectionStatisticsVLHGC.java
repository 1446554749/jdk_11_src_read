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
 * Structure: MM_CollectionStatisticsVLHGC
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
public final class MM_CollectionStatisticsVLHGC {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __arrayletPrimitiveLeavesOffset_;
	public static final int __arrayletPrimitiveObjectsOffset_;
	public static final int __arrayletReferenceLeavesOffset_;
	public static final int __arrayletReferenceObjectsOffset_;
	public static final int __arrayletUnknownLeavesOffset_;
	public static final int __arrayletUnknownObjectsOffset_;
	public static final int __commonNumaNodeBytesOffset_;
	public static final int __edenFreeHeapSizeOffset_;
	public static final int __edenHeapSizeOffset_;
	public static final int __incrementCountOffset_;
	public static final int __incrementDescriptionOffset_;
	public static final int __largestPrimitiveArrayletOffset_;
	public static final int __largestReferenceArrayletOffset_;
	public static final int __localNumaNodeBytesOffset_;
	public static final int __nonLocalNumaNodeBytesOffset_;
	public static final int __numaNodesOffset_;
	public static final int __rememberedSetBeingRebuiltRegionCountOffset_;
	public static final int __rememberedSetBytesFreeOffset_;
	public static final int __rememberedSetBytesTotalOffset_;
	public static final int __rememberedSetCountOffset_;
	public static final int __rememberedSetOverflowedRegionCountOffset_;
	public static final int __rememberedSetStableRegionCountOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__arrayletPrimitiveLeavesOffset_ = 0;
		__arrayletPrimitiveObjectsOffset_ = 0;
		__arrayletReferenceLeavesOffset_ = 0;
		__arrayletReferenceObjectsOffset_ = 0;
		__arrayletUnknownLeavesOffset_ = 0;
		__arrayletUnknownObjectsOffset_ = 0;
		__commonNumaNodeBytesOffset_ = 0;
		__edenFreeHeapSizeOffset_ = 0;
		__edenHeapSizeOffset_ = 0;
		__incrementCountOffset_ = 0;
		__incrementDescriptionOffset_ = 0;
		__largestPrimitiveArrayletOffset_ = 0;
		__largestReferenceArrayletOffset_ = 0;
		__localNumaNodeBytesOffset_ = 0;
		__nonLocalNumaNodeBytesOffset_ = 0;
		__numaNodesOffset_ = 0;
		__rememberedSetBeingRebuiltRegionCountOffset_ = 0;
		__rememberedSetBytesFreeOffset_ = 0;
		__rememberedSetBytesTotalOffset_ = 0;
		__rememberedSetCountOffset_ = 0;
		__rememberedSetOverflowedRegionCountOffset_ = 0;
		__rememberedSetStableRegionCountOffset_ = 0;
	}

}
