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
 * Structure: GC_ArrayletLeafIterator
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
public final class GC_ArrayletLeafIterator {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __arrayoidOffset_;
	public static final int __compressObjectReferencesOffset_;
	public static final int __endOfSpineOffset_;
	public static final int __layoutOffset_;
	public static final int __numLeafsOffset_;
	public static final int __numLeafsCountedOffset_;
	public static final int __omrVMOffset_;
	public static final int __slotObjectOffset_;
	public static final int __spinePtrOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__arrayoidOffset_ = 0;
		__compressObjectReferencesOffset_ = 0;
		__endOfSpineOffset_ = 0;
		__layoutOffset_ = 0;
		__numLeafsOffset_ = 0;
		__numLeafsCountedOffset_ = 0;
		__omrVMOffset_ = 0;
		__slotObjectOffset_ = 0;
		__spinePtrOffset_ = 0;
	}

}
