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
 * Structure: SH_CompositeCacheImpl
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
public final class SH_CompositeCacheImpl {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __cacheFullFlagsOffset_;
	public static final int __cacheHeaderPageBytesOffset_;
	public static final int __cacheHeaderPageStartOffset_;
	public static final int __cacheNameOffset_;
	public static final int __canStoreClasspathsOffset_;
	public static final int __ccHeadOffset_;
	public static final int __commonCCInfoOffset_;
	public static final int __currentROMSegmentOffset_;
	public static final int __debugDataOffset_;
	public static final int __doHeaderProtectOffset_;
	public static final int __doHeaderReadWriteProtectOffset_;
	public static final int __doMetaProtectOffset_;
	public static final int __doPartialPagesProtectOffset_;
	public static final int __doReadWriteSyncOffset_;
	public static final int __doSegmentProtectOffset_;
	public static final int __headerProtectCntrOffset_;
	public static final int __headerProtectMutexOffset_;
	public static final int __incrementedRWCrashCntrOffset_;
	public static final int __initializingNewCacheOffset_;
	public static final int __lastFailedWHCountOffset_;
	public static final int __lastFailedWriteHashOffset_;
	public static final int __layerOffset_;
	public static final int __localReadWriteCrashCntrOffset_;
	public static final int __maxAOTOffset_;
	public static final int __maxAOTUnstoredBytesOffset_;
	public static final int __maxJITOffset_;
	public static final int __maxJITUnstoredBytesOffset_;
	public static final int __maximumAccessedShrCacheMetadataOffset_;
	public static final int __metadataSegmentPtrOffset_;
	public static final int __minimumAccessedShrCacheMetadataOffset_;
	public static final int __nestedMemoryOffset_;
	public static final int __nestedSizeOffset_;
	public static final int __newHdrPtrOffset_;
	public static final int __nextOffset_;
	public static final int __oldUpdateCountOffset_;
	public static final int __osPageSizeOffset_;
	public static final int __oscacheOffset_;
	public static final int __parentOffset_;
	public static final int __portlibOffset_;
	public static final int __prevScanOffset_;
	public static final int __previousOffset_;
	public static final int __readOnlyOSCacheOffset_;
	public static final int __readOnlyReaderCountOffset_;
	public static final int __readWriteAreaBytesOffset_;
	public static final int __readWriteAreaHeaderIsReadOnlyOffset_;
	public static final int __readWriteAreaPageBytesOffset_;
	public static final int __readWriteAreaPageStartOffset_;
	public static final int __readWriteAreaStartOffset_;
	public static final int __readWriteProtectCntrOffset_;
	public static final int __reduceStoreContentionDisabledOffset_;
	public static final int __romClassProtectEndOffset_;
	public static final int __runtimeFlagsOffset_;
	public static final int __runtimeFlagsProtectMutexOffset_;
	public static final int __scanOffset_;
	public static final int __sharedClassConfigOffset_;
	public static final int __softmxUnstoredBytesOffset_;
	public static final int __startedOffset_;
	public static final int __storedAOTUsedBytesOffset_;
	public static final int __storedJITUsedBytesOffset_;
	public static final int __storedMetaUsedBytesOffset_;
	public static final int __storedPrevScanOffset_;
	public static final int __storedReadWriteUsedBytesOffset_;
	public static final int __storedScanOffset_;
	public static final int __storedSegmentUsedBytesOffset_;
	public static final int __thecaOffset_;
	public static final int __totalStoredBytesOffset_;
	public static final int __useWriteHashOffset_;
	public static final int __utMutexOffset_;
	public static final int __verboseFlagsOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__cacheFullFlagsOffset_ = 0;
		__cacheHeaderPageBytesOffset_ = 0;
		__cacheHeaderPageStartOffset_ = 0;
		__cacheNameOffset_ = 0;
		__canStoreClasspathsOffset_ = 0;
		__ccHeadOffset_ = 0;
		__commonCCInfoOffset_ = 0;
		__currentROMSegmentOffset_ = 0;
		__debugDataOffset_ = 0;
		__doHeaderProtectOffset_ = 0;
		__doHeaderReadWriteProtectOffset_ = 0;
		__doMetaProtectOffset_ = 0;
		__doPartialPagesProtectOffset_ = 0;
		__doReadWriteSyncOffset_ = 0;
		__doSegmentProtectOffset_ = 0;
		__headerProtectCntrOffset_ = 0;
		__headerProtectMutexOffset_ = 0;
		__incrementedRWCrashCntrOffset_ = 0;
		__initializingNewCacheOffset_ = 0;
		__lastFailedWHCountOffset_ = 0;
		__lastFailedWriteHashOffset_ = 0;
		__layerOffset_ = 0;
		__localReadWriteCrashCntrOffset_ = 0;
		__maxAOTOffset_ = 0;
		__maxAOTUnstoredBytesOffset_ = 0;
		__maxJITOffset_ = 0;
		__maxJITUnstoredBytesOffset_ = 0;
		__maximumAccessedShrCacheMetadataOffset_ = 0;
		__metadataSegmentPtrOffset_ = 0;
		__minimumAccessedShrCacheMetadataOffset_ = 0;
		__nestedMemoryOffset_ = 0;
		__nestedSizeOffset_ = 0;
		__newHdrPtrOffset_ = 0;
		__nextOffset_ = 0;
		__oldUpdateCountOffset_ = 0;
		__osPageSizeOffset_ = 0;
		__oscacheOffset_ = 0;
		__parentOffset_ = 0;
		__portlibOffset_ = 0;
		__prevScanOffset_ = 0;
		__previousOffset_ = 0;
		__readOnlyOSCacheOffset_ = 0;
		__readOnlyReaderCountOffset_ = 0;
		__readWriteAreaBytesOffset_ = 0;
		__readWriteAreaHeaderIsReadOnlyOffset_ = 0;
		__readWriteAreaPageBytesOffset_ = 0;
		__readWriteAreaPageStartOffset_ = 0;
		__readWriteAreaStartOffset_ = 0;
		__readWriteProtectCntrOffset_ = 0;
		__reduceStoreContentionDisabledOffset_ = 0;
		__romClassProtectEndOffset_ = 0;
		__runtimeFlagsOffset_ = 0;
		__runtimeFlagsProtectMutexOffset_ = 0;
		__scanOffset_ = 0;
		__sharedClassConfigOffset_ = 0;
		__softmxUnstoredBytesOffset_ = 0;
		__startedOffset_ = 0;
		__storedAOTUsedBytesOffset_ = 0;
		__storedJITUsedBytesOffset_ = 0;
		__storedMetaUsedBytesOffset_ = 0;
		__storedPrevScanOffset_ = 0;
		__storedReadWriteUsedBytesOffset_ = 0;
		__storedScanOffset_ = 0;
		__storedSegmentUsedBytesOffset_ = 0;
		__thecaOffset_ = 0;
		__totalStoredBytesOffset_ = 0;
		__useWriteHashOffset_ = 0;
		__utMutexOffset_ = 0;
		__verboseFlagsOffset_ = 0;
	}

}