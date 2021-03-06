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
 * Structure: J9Statistic
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
public final class J9Statistic {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9STAT_DOUBLE;
	public static final long J9STAT_FLOAT;
	public static final long J9STAT_I16;
	public static final long J9STAT_I32;
	public static final long J9STAT_I64;
	public static final long J9STAT_I8;
	public static final long J9STAT_IDATA;
	public static final long J9STAT_POINTER;
	public static final long J9STAT_STRING;
	public static final long J9STAT_U16;
	public static final long J9STAT_U32;
	public static final long J9STAT_U64;
	public static final long J9STAT_U8;
	public static final long J9STAT_UDATA;

	// Offsets

	public static final int _dataSlotOffset_;
	public static final int _dataTypeOffset_;
	public static final int _nameOffset_;
	public static final int _nextStatisticOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9STAT_DOUBLE = 0;
		J9STAT_FLOAT = 0;
		J9STAT_I16 = 0;
		J9STAT_I32 = 0;
		J9STAT_I64 = 0;
		J9STAT_I8 = 0;
		J9STAT_IDATA = 0;
		J9STAT_POINTER = 0;
		J9STAT_STRING = 0;
		J9STAT_U16 = 0;
		J9STAT_U32 = 0;
		J9STAT_U64 = 0;
		J9STAT_U8 = 0;
		J9STAT_UDATA = 0;
		_dataSlotOffset_ = 0;
		_dataTypeOffset_ = 0;
		_nameOffset_ = 0;
		_nextStatisticOffset_ = 0;
	}

}
