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
 * Structure: VMIZipFunctionTable
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
public final class VMIZipFunctionTable {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _reservedOffset_;
	public static final int _zipCache_enumElementOffset_;
	public static final int _zipCache_enumGetDirNameOffset_;
	public static final int _zipCache_enumKillOffset_;
	public static final int _zipCache_enumNewOffset_;
	public static final int _zip_closeZipFileOffset_;
	public static final int _zip_freeZipCommentOffset_;
	public static final int _zip_freeZipEntryOffset_;
	public static final int _zip_getNextZipEntryOffset_;
	public static final int _zip_getZipCommentOffset_;
	public static final int _zip_getZipEntryOffset_;
	public static final int _zip_getZipEntryCommentOffset_;
	public static final int _zip_getZipEntryDataOffset_;
	public static final int _zip_getZipEntryExtraFieldOffset_;
	public static final int _zip_getZipEntryFromOffsetOffset_;
	public static final int _zip_getZipEntryRawDataOffset_;
	public static final int _zip_getZipEntryWithSizeOffset_;
	public static final int _zip_getZipHookInterfaceOffset_;
	public static final int _zip_initZipEntryOffset_;
	public static final int _zip_openZipFileOffset_;
	public static final int _zip_resetZipFileOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_reservedOffset_ = 0;
		_zipCache_enumElementOffset_ = 0;
		_zipCache_enumGetDirNameOffset_ = 0;
		_zipCache_enumKillOffset_ = 0;
		_zipCache_enumNewOffset_ = 0;
		_zip_closeZipFileOffset_ = 0;
		_zip_freeZipCommentOffset_ = 0;
		_zip_freeZipEntryOffset_ = 0;
		_zip_getNextZipEntryOffset_ = 0;
		_zip_getZipCommentOffset_ = 0;
		_zip_getZipEntryOffset_ = 0;
		_zip_getZipEntryCommentOffset_ = 0;
		_zip_getZipEntryDataOffset_ = 0;
		_zip_getZipEntryExtraFieldOffset_ = 0;
		_zip_getZipEntryFromOffsetOffset_ = 0;
		_zip_getZipEntryRawDataOffset_ = 0;
		_zip_getZipEntryWithSizeOffset_ = 0;
		_zip_getZipHookInterfaceOffset_ = 0;
		_zip_initZipEntryOffset_ = 0;
		_zip_openZipFileOffset_ = 0;
		_zip_resetZipFileOffset_ = 0;
	}

}
