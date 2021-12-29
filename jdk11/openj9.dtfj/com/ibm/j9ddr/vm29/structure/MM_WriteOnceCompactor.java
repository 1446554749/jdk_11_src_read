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
 * Structure: MM_WriteOnceCompactor
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
public final class MM_WriteOnceCompactor {

	// VM Constants

	public static final long SIZEOF;
	public static final long sizeof_page;

	// Offsets

	public static final int __compactGroupDestinationsOffset_;
	public static final int __compactTableOffset_;
	public static final int __cycleStateOffset_;
	public static final int __dispatcherOffset_;
	public static final int __extensionsOffset_;
	public static final int __fixupOnlyWorkListOffset_;
	public static final int __heapOffset_;
	public static final int __heapBaseOffset_;
	public static final int __heapTopOffset_;
	public static final int __interRegionRememberedSetOffset_;
	public static final int __javaVMOffset_;
	public static final int __lockCountOffset_;
	public static final int __moveFinishedOffset_;
	public static final int __nextMarkMapOffset_;
	public static final int __objectAlignmentInBytesOffset_;
	public static final int __readyWorkListOffset_;
	public static final int __readyWorkListHighPriorityOffset_;
	public static final int __rebuildFinishedOffset_;
	public static final int __rebuildWorkListOffset_;
	public static final int __rebuildWorkListHighPriorityOffset_;
	public static final int __regionManagerOffset_;
	public static final int __regionSizeOffset_;
	public static final int __threadsWaitingOffset_;
	public static final int __workListMonitorOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		sizeof_page = 0;
		__compactGroupDestinationsOffset_ = 0;
		__compactTableOffset_ = 0;
		__cycleStateOffset_ = 0;
		__dispatcherOffset_ = 0;
		__extensionsOffset_ = 0;
		__fixupOnlyWorkListOffset_ = 0;
		__heapOffset_ = 0;
		__heapBaseOffset_ = 0;
		__heapTopOffset_ = 0;
		__interRegionRememberedSetOffset_ = 0;
		__javaVMOffset_ = 0;
		__lockCountOffset_ = 0;
		__moveFinishedOffset_ = 0;
		__nextMarkMapOffset_ = 0;
		__objectAlignmentInBytesOffset_ = 0;
		__readyWorkListOffset_ = 0;
		__readyWorkListHighPriorityOffset_ = 0;
		__rebuildFinishedOffset_ = 0;
		__rebuildWorkListOffset_ = 0;
		__rebuildWorkListHighPriorityOffset_ = 0;
		__regionManagerOffset_ = 0;
		__regionSizeOffset_ = 0;
		__threadsWaitingOffset_ = 0;
		__workListMonitorOffset_ = 0;
	}

}