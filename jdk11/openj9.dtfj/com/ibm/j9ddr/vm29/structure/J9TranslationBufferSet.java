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
 * Structure: J9TranslationBufferSet
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
public final class J9TranslationBufferSet {

	// VM Constants

	public static final long SIZEOF;
	public static final long BCU_ENABLE_INVARIANT_INTERNING;
	public static final long BCU_ENABLE_ROMCLASS_RESIZING;
	public static final long BCU_TRACK_UTF8DATA;
	public static final long BCU_UNUSED_2;
	public static final long BCU_UNUSED_40;
	public static final long BCU_VERBOSE;

	// Offsets

	public static final int _classFileErrorOffset_;
	public static final int _classFileSizeOffset_;
	public static final int _closeZipFileFunctionOffset_;
	public static final int _currentSunClassFileSizeOffset_;
	public static final int _dynamicLoadStatsOffset_;
	public static final int _findLocallyDefinedClassFunctionOffset_;
	public static final int _flagsOffset_;
	public static final int _internalDefineClassFunctionOffset_;
	public static final int _internalLoadROMClassFunctionOffset_;
	public static final int _relocatorDLLHandleOffset_;
	public static final int _reportStatisticsFunctionOffset_;
	public static final int _romClassBuilderOffset_;
	public static final int _searchFilenameBufferOffset_;
	public static final int _searchFilenameSizeOffset_;
	public static final int _sunClassFileBufferOffset_;
	public static final int _sunClassFileSizeOffset_;
	public static final int _transformROMClassFunctionOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		BCU_ENABLE_INVARIANT_INTERNING = 0;
		BCU_ENABLE_ROMCLASS_RESIZING = 0;
		BCU_TRACK_UTF8DATA = 0;
		BCU_UNUSED_2 = 0;
		BCU_UNUSED_40 = 0;
		BCU_VERBOSE = 0;
		_classFileErrorOffset_ = 0;
		_classFileSizeOffset_ = 0;
		_closeZipFileFunctionOffset_ = 0;
		_currentSunClassFileSizeOffset_ = 0;
		_dynamicLoadStatsOffset_ = 0;
		_findLocallyDefinedClassFunctionOffset_ = 0;
		_flagsOffset_ = 0;
		_internalDefineClassFunctionOffset_ = 0;
		_internalLoadROMClassFunctionOffset_ = 0;
		_relocatorDLLHandleOffset_ = 0;
		_reportStatisticsFunctionOffset_ = 0;
		_romClassBuilderOffset_ = 0;
		_searchFilenameBufferOffset_ = 0;
		_searchFilenameSizeOffset_ = 0;
		_sunClassFileBufferOffset_ = 0;
		_sunClassFileSizeOffset_ = 0;
		_transformROMClassFunctionOffset_ = 0;
	}

}