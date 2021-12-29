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
 * Structure: J9ClassLoader
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
public final class J9ClassLoader {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9CLASSLOADER_ANON_CLASS_LOADER;
	public static final long J9CLASSLOADER_CLASSPATH_SET;
	public static final long J9CLASSLOADER_CONTAINS_JITTED_METHODS;
	public static final long J9CLASSLOADER_CONTAINS_JXES;
	public static final long J9CLASSLOADER_CONTAINS_METHODS_PRESENT_IN_MCC_HASH;
	public static final long J9CLASSLOADER_INVARIANTS_SHARABLE;
	public static final long J9CLASSLOADER_PARALLEL_CAPABLE;
	public static final long J9CLASSLOADER_SHARED_CLASSES_ENABLED;
	public static final long J9CLASSLOADER_SUBSET_VISIBILITY;

	// Offsets

	public static final int _classHashTableOffset_;
	public static final int _classLoaderObjectOffset_;
	public static final int _classLocationHashTableOffset_;
	public static final int _classPathEntriesOffset_;
	public static final int _classPathEntryCountOffset_;
	public static final int _classRelationshipsHashTableOffset_;
	public static final int _classSegmentsOffset_;
	public static final int _flagsOffset_;
	public static final int _gcFlagsOffset_;
	public static final int _gcLinkNextOffset_;
	public static final int _gcLinkPreviousOffset_;
	public static final int _gcRememberedSetOffset_;
	public static final int _gcThreadNotificationOffset_;
	public static final int _hotFieldPoolOffset_;
	public static final int _hotFieldPoolMutexOffset_;
	public static final int _jitMetaDataListOffset_;
	public static final int _jniIDsOffset_;
	public static final int _jniRedirectionBlocksOffset_;
	public static final int _librariesHeadOffset_;
	public static final int _librariesTailOffset_;
	public static final int _moduleExtraInfoHashTableOffset_;
	public static final int _moduleHashTableOffset_;
	public static final int _packageHashTableOffset_;
	public static final int _ramClassLargeBlockFreeListOffset_;
	public static final int _ramClassSmallBlockFreeListOffset_;
	public static final int _ramClassTinyBlockFreeListOffset_;
	public static final int _ramClassUDATABlockFreeListOffset_;
	public static final int _redefinedClassesOffset_;
	public static final int _romClassOrphansHashTableOffset_;
	public static final int _sharedLibrariesOffset_;
	public static final int _unloadLinkOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9CLASSLOADER_ANON_CLASS_LOADER = 0;
		J9CLASSLOADER_CLASSPATH_SET = 0;
		J9CLASSLOADER_CONTAINS_JITTED_METHODS = 0;
		J9CLASSLOADER_CONTAINS_JXES = 0;
		J9CLASSLOADER_CONTAINS_METHODS_PRESENT_IN_MCC_HASH = 0;
		J9CLASSLOADER_INVARIANTS_SHARABLE = 0;
		J9CLASSLOADER_PARALLEL_CAPABLE = 0;
		J9CLASSLOADER_SHARED_CLASSES_ENABLED = 0;
		J9CLASSLOADER_SUBSET_VISIBILITY = 0;
		_classHashTableOffset_ = 0;
		_classLoaderObjectOffset_ = 0;
		_classLocationHashTableOffset_ = 0;
		_classPathEntriesOffset_ = 0;
		_classPathEntryCountOffset_ = 0;
		_classRelationshipsHashTableOffset_ = 0;
		_classSegmentsOffset_ = 0;
		_flagsOffset_ = 0;
		_gcFlagsOffset_ = 0;
		_gcLinkNextOffset_ = 0;
		_gcLinkPreviousOffset_ = 0;
		_gcRememberedSetOffset_ = 0;
		_gcThreadNotificationOffset_ = 0;
		_hotFieldPoolOffset_ = 0;
		_hotFieldPoolMutexOffset_ = 0;
		_jitMetaDataListOffset_ = 0;
		_jniIDsOffset_ = 0;
		_jniRedirectionBlocksOffset_ = 0;
		_librariesHeadOffset_ = 0;
		_librariesTailOffset_ = 0;
		_moduleExtraInfoHashTableOffset_ = 0;
		_moduleHashTableOffset_ = 0;
		_packageHashTableOffset_ = 0;
		_ramClassLargeBlockFreeListOffset_ = 0;
		_ramClassSmallBlockFreeListOffset_ = 0;
		_ramClassTinyBlockFreeListOffset_ = 0;
		_ramClassUDATABlockFreeListOffset_ = 0;
		_redefinedClassesOffset_ = 0;
		_romClassOrphansHashTableOffset_ = 0;
		_sharedLibrariesOffset_ = 0;
		_unloadLinkOffset_ = 0;
	}

}
