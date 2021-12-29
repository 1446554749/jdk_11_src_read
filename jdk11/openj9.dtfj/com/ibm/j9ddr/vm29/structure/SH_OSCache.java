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
 * Structure: SH_OSCache
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
public final class SH_OSCache {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __activeGenerationOffset_;
	public static final int __cacheDirNameOffset_;
	public static final int __cacheNameOffset_;
	public static final int __cacheNameWithVGenOffset_;
	public static final int __cachePathNameOffset_;
	public static final int __cacheSizeOffset_;
	public static final int __cacheUniqueIDOffset_;
	public static final int __configOffset_;
	public static final int __corruptValueOffset_;
	public static final int __corruptionCodeOffset_;
	public static final int __createFlagsOffset_;
	public static final int __dataLengthOffset_;
	public static final int __dataStartOffset_;
	public static final int __doCheckBuildIDOffset_;
	public static final int __errorCodeOffset_;
	public static final int __headerStartOffset_;
	public static final int __isUserSpecifiedCacheDirOffset_;
	public static final int __layerOffset_;
	public static final int __openModeOffset_;
	public static final int __portLibraryOffset_;
	public static final int __runningReadOnlyOffset_;
	public static final int __runtimeFlagsOffset_;
	public static final int __startupCompletedOffset_;
	public static final int __verboseFlagsOffset_;
	public static final int __vptr$SH_OSCacheOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__activeGenerationOffset_ = 0;
		__cacheDirNameOffset_ = 0;
		__cacheNameOffset_ = 0;
		__cacheNameWithVGenOffset_ = 0;
		__cachePathNameOffset_ = 0;
		__cacheSizeOffset_ = 0;
		__cacheUniqueIDOffset_ = 0;
		__configOffset_ = 0;
		__corruptValueOffset_ = 0;
		__corruptionCodeOffset_ = 0;
		__createFlagsOffset_ = 0;
		__dataLengthOffset_ = 0;
		__dataStartOffset_ = 0;
		__doCheckBuildIDOffset_ = 0;
		__errorCodeOffset_ = 0;
		__headerStartOffset_ = 0;
		__isUserSpecifiedCacheDirOffset_ = 0;
		__layerOffset_ = 0;
		__openModeOffset_ = 0;
		__portLibraryOffset_ = 0;
		__runningReadOnlyOffset_ = 0;
		__runtimeFlagsOffset_ = 0;
		__startupCompletedOffset_ = 0;
		__verboseFlagsOffset_ = 0;
		__vptr$SH_OSCacheOffset_ = 0;
	}

}
