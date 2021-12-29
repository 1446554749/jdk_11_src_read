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
 * Structure: MM_VirtualMemory
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
public final class MM_VirtualMemory {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __baseAddressOffset_;
	public static final int __consumerCountOffset_;
	public static final int __extensionsOffset_;
	public static final int __heapAlignmentOffset_;
	public static final int __heapBaseOffset_;
	public static final int __heapTopOffset_;
	public static final int __identifierOffset_;
	public static final int __modeOffset_;
	public static final int __pageFlagsOffset_;
	public static final int __pageSizeOffset_;
	public static final int __reserveSizeOffset_;
	public static final int __tailPaddingOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__baseAddressOffset_ = 0;
		__consumerCountOffset_ = 0;
		__extensionsOffset_ = 0;
		__heapAlignmentOffset_ = 0;
		__heapBaseOffset_ = 0;
		__heapTopOffset_ = 0;
		__identifierOffset_ = 0;
		__modeOffset_ = 0;
		__pageFlagsOffset_ = 0;
		__pageSizeOffset_ = 0;
		__reserveSizeOffset_ = 0;
		__tailPaddingOffset_ = 0;
	}

}
