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
 * Structure: J9ROMReflectClass
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
public final class J9ROMReflectClass {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _bsmCountOffset_;
	public static final int _callSiteCountOffset_;
	public static final int _callSiteDataOffset_;
	public static final int _classFileCPCountOffset_;
	public static final int _classFileSizeOffset_;
	public static final int _classNameOffset_;
	public static final int _cpShapeDescriptionOffset_;
	public static final int _doubleScalarStaticCountOffset_;
	public static final int _elementSizeOffset_;
	public static final int _extraModifiersOffset_;
	public static final int _innerClassCountOffset_;
	public static final int _innerClassesOffset_;
	public static final int _instanceShapeOffset_;
	public static final int _interfaceCountOffset_;
	public static final int _interfacesOffset_;
	public static final int _intermediateClassDataOffset_;
	public static final int _intermediateClassDataLengthOffset_;
	public static final int _majorVersionOffset_;
	public static final int _maxBranchCountOffset_;
	public static final int _memberAccessFlagsOffset_;
	public static final int _methodTypeCountOffset_;
	public static final int _minorVersionOffset_;
	public static final int _modifiersOffset_;
	public static final int _nestHostOffset_;
	public static final int _nestMemberCountOffset_;
	public static final int _nestMembersOffset_;
	public static final int _objectStaticCountOffset_;
	public static final int _optionalFlagsOffset_;
	public static final int _optionalInfoOffset_;
	public static final int _outerClassNameOffset_;
	public static final int _paddingOffset_;
	public static final int _ramConstantPoolCountOffset_;
	public static final int _reflectTypeCodeOffset_;
	public static final int _romConstantPoolCountOffset_;
	public static final int _romFieldCountOffset_;
	public static final int _romMethodCountOffset_;
	public static final int _romSizeOffset_;
	public static final int _singleScalarStaticCountOffset_;
	public static final int _specialSplitMethodRefCountOffset_;
	public static final int _specialSplitMethodRefIndexesOffset_;
	public static final int _staticSplitMethodRefCountOffset_;
	public static final int _staticSplitMethodRefIndexesOffset_;
	public static final int _superclassNameOffset_;
	public static final int _unusedOffset_;
	public static final int _varHandleMethodTypeCountOffset_;
	public static final int _varHandleMethodTypeLookupTableOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_bsmCountOffset_ = 0;
		_callSiteCountOffset_ = 0;
		_callSiteDataOffset_ = 0;
		_classFileCPCountOffset_ = 0;
		_classFileSizeOffset_ = 0;
		_classNameOffset_ = 0;
		_cpShapeDescriptionOffset_ = 0;
		_doubleScalarStaticCountOffset_ = 0;
		_elementSizeOffset_ = 0;
		_extraModifiersOffset_ = 0;
		_innerClassCountOffset_ = 0;
		_innerClassesOffset_ = 0;
		_instanceShapeOffset_ = 0;
		_interfaceCountOffset_ = 0;
		_interfacesOffset_ = 0;
		_intermediateClassDataOffset_ = 0;
		_intermediateClassDataLengthOffset_ = 0;
		_majorVersionOffset_ = 0;
		_maxBranchCountOffset_ = 0;
		_memberAccessFlagsOffset_ = 0;
		_methodTypeCountOffset_ = 0;
		_minorVersionOffset_ = 0;
		_modifiersOffset_ = 0;
		_nestHostOffset_ = 0;
		_nestMemberCountOffset_ = 0;
		_nestMembersOffset_ = 0;
		_objectStaticCountOffset_ = 0;
		_optionalFlagsOffset_ = 0;
		_optionalInfoOffset_ = 0;
		_outerClassNameOffset_ = 0;
		_paddingOffset_ = 0;
		_ramConstantPoolCountOffset_ = 0;
		_reflectTypeCodeOffset_ = 0;
		_romConstantPoolCountOffset_ = 0;
		_romFieldCountOffset_ = 0;
		_romMethodCountOffset_ = 0;
		_romSizeOffset_ = 0;
		_singleScalarStaticCountOffset_ = 0;
		_specialSplitMethodRefCountOffset_ = 0;
		_specialSplitMethodRefIndexesOffset_ = 0;
		_staticSplitMethodRefCountOffset_ = 0;
		_staticSplitMethodRefIndexesOffset_ = 0;
		_superclassNameOffset_ = 0;
		_unusedOffset_ = 0;
		_varHandleMethodTypeCountOffset_ = 0;
		_varHandleMethodTypeLookupTableOffset_ = 0;
	}

}
