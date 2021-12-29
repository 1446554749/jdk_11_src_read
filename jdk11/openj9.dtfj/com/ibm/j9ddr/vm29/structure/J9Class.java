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
 * Structure: J9Class
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
public final class J9Class {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _arrayClassOffset_;
	public static final int _backfillOffsetOffset_;
	public static final int _callSitesOffset_;
	public static final int _cancelCounterOffset_;
	public static final int _castClassCacheOffset_;
	public static final int _classDepthAndFlagsOffset_;
	public static final int _classDepthWithFlagsOffset_;
	public static final int _classFlagsOffset_;
	public static final int _classLoaderOffset_;
	public static final int _classObjectOffset_;
	public static final int _customSpinOptionOffset_;
	public static final int _eyecatcherOffset_;
	public static final int _finalizeLinkOffsetOffset_;
	public static final int _flattenedClassCacheOffset_;
	public static final int _gcLinkOffset_;
	public static final int _hostClassOffset_;
	public static final int _hotFieldsInfoOffset_;
	public static final int _iTableOffset_;
	public static final int _initializeStatusOffset_;
	public static final int _initializerCacheOffset_;
	public static final int _instanceDescriptionOffset_;
	public static final int _instanceHotFieldDescriptionOffset_;
	public static final int _instanceLeafDescriptionOffset_;
	public static final int _jitMetaDataListOffset_;
	public static final int _jniIDsOffset_;
	public static final int _lastITableOffset_;
	public static final int _lockOffsetOffset_;
	public static final int _methodTypesOffset_;
	public static final int _moduleOffset_;
	public static final int _nestHostOffset_;
	public static final int _newInstanceCountOffset_;
	public static final int _nextClassInSegmentOffset_;
	public static final int _packageIDOffset_;
	public static final int _paddingForGLRCountersOffset_;
	public static final int _ramConstantPoolOffset_;
	public static final int _ramMethodsOffset_;
	public static final int _ramStaticsOffset_;
	public static final int _replacedClassOffset_;
	public static final int _reservedCounterOffset_;
	public static final int _romClassOffset_;
	public static final int _romableAotITableOffset_;
	public static final int _selfReferencingField1Offset_;
	public static final int _selfReferencingField2Offset_;
	public static final int _specialSplitMethodTableOffset_;
	public static final int _staticSplitMethodTableOffset_;
	public static final int _subclassTraversalLinkOffset_;
	public static final int _subclassTraversalReverseLinkOffset_;
	public static final int _superclassesOffset_;
	public static final int _totalInstanceSizeOffset_;
	public static final int _varHandleMethodTypesOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_arrayClassOffset_ = 0;
		_backfillOffsetOffset_ = 0;
		_callSitesOffset_ = 0;
		_cancelCounterOffset_ = 0;
		_castClassCacheOffset_ = 0;
		_classDepthAndFlagsOffset_ = 0;
		_classDepthWithFlagsOffset_ = 0;
		_classFlagsOffset_ = 0;
		_classLoaderOffset_ = 0;
		_classObjectOffset_ = 0;
		_customSpinOptionOffset_ = 0;
		_eyecatcherOffset_ = 0;
		_finalizeLinkOffsetOffset_ = 0;
		_flattenedClassCacheOffset_ = 0;
		_gcLinkOffset_ = 0;
		_hostClassOffset_ = 0;
		_hotFieldsInfoOffset_ = 0;
		_iTableOffset_ = 0;
		_initializeStatusOffset_ = 0;
		_initializerCacheOffset_ = 0;
		_instanceDescriptionOffset_ = 0;
		_instanceHotFieldDescriptionOffset_ = 0;
		_instanceLeafDescriptionOffset_ = 0;
		_jitMetaDataListOffset_ = 0;
		_jniIDsOffset_ = 0;
		_lastITableOffset_ = 0;
		_lockOffsetOffset_ = 0;
		_methodTypesOffset_ = 0;
		_moduleOffset_ = 0;
		_nestHostOffset_ = 0;
		_newInstanceCountOffset_ = 0;
		_nextClassInSegmentOffset_ = 0;
		_packageIDOffset_ = 0;
		_paddingForGLRCountersOffset_ = 0;
		_ramConstantPoolOffset_ = 0;
		_ramMethodsOffset_ = 0;
		_ramStaticsOffset_ = 0;
		_replacedClassOffset_ = 0;
		_reservedCounterOffset_ = 0;
		_romClassOffset_ = 0;
		_romableAotITableOffset_ = 0;
		_selfReferencingField1Offset_ = 0;
		_selfReferencingField2Offset_ = 0;
		_specialSplitMethodTableOffset_ = 0;
		_staticSplitMethodTableOffset_ = 0;
		_subclassTraversalLinkOffset_ = 0;
		_subclassTraversalReverseLinkOffset_ = 0;
		_superclassesOffset_ = 0;
		_totalInstanceSizeOffset_ = 0;
		_varHandleMethodTypesOffset_ = 0;
	}

}
