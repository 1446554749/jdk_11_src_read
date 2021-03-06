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
 * Structure: J9CfrClassFile
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
public final class J9CfrClassFile {

	// VM Constants

	public static final long SIZEOF;
	public static final long CFR_ABSTRACT_METHOD_ACCESS_MASK;
	public static final long CFR_ACC_ABSTRACT;
	public static final long CFR_ACC_ANNOTATION;
	public static final long CFR_ACC_BRIDGE;
	public static final long CFR_ACC_CLONEABLE;
	public static final long CFR_ACC_EMPTY_METHOD;
	public static final long CFR_ACC_ENUM;
	public static final long CFR_ACC_FINAL;
	public static final long CFR_ACC_FINALIZE_NEEDED;
	public static final long CFR_ACC_FORWARDER_METHOD;
	public static final long CFR_ACC_GETTER_METHOD;
	public static final long CFR_ACC_HAS_EMPTY_FINALIZE;
	public static final long CFR_ACC_HAS_EXCEPTION_INFO;
	public static final long CFR_ACC_HAS_FINAL_FIELDS;
	public static final long CFR_ACC_HAS_VERIFY_DATA;
	public static final long CFR_ACC_INTERFACE;
	public static final long CFR_ACC_MANDATED;
	public static final long CFR_ACC_METHOD_CALLER_SENSITIVE;
	public static final long CFR_ACC_METHOD_FRAME_ITERATOR_SKIP;
	public static final long CFR_ACC_METHOD_HAS_DEBUG_INFO;
	public static final long CFR_ACC_METHOD_HAS_STACK_MAP;
	public static final long CFR_ACC_NATIVE;
	public static final long CFR_ACC_PRIVATE;
	public static final long CFR_ACC_PROTECTED;
	public static final long CFR_ACC_PUBLIC;
	public static final long CFR_ACC_REFERENCE_PHANTOM;
	public static final long CFR_ACC_REFERENCE_SOFT;
	public static final long CFR_ACC_REFERENCE_WEAK;
	public static final long CFR_ACC_STATIC;
	public static final long CFR_ACC_STRICT;
	public static final long CFR_ACC_SUPER;
	public static final long CFR_ACC_SYNCHRONIZED;
	public static final long CFR_ACC_SYNTHETIC;
	public static final long CFR_ACC_TRANSIENT;
	public static final long CFR_ACC_VARARGS;
	public static final long CFR_ACC_VOLATILE;
	public static final long CFR_ACC_VTABLE;
	public static final long CFR_ATTRIBUTE_METHOD_PARAMETERS_MASK;
	public static final long CFR_CLASS_ACCESS_MASK;
	public static final long CFR_CLASS_ACCESS_NEWJDK5_MASK;
	public static final long CFR_CLINIT_METHOD_ACCESS_MASK;
	public static final long CFR_DECODE_CP16;
	public static final long CFR_DECODE_CP8;
	public static final long CFR_DECODE_I16;
	public static final long CFR_DECODE_I8;
	public static final long CFR_DECODE_J9_CLASSREF;
	public static final long CFR_DECODE_J9_FIELDREF;
	public static final long CFR_DECODE_J9_LDC;
	public static final long CFR_DECODE_J9_LDC2DW;
	public static final long CFR_DECODE_J9_LDC2LW;
	public static final long CFR_DECODE_J9_LDCW;
	public static final long CFR_DECODE_J9_METHODREF;
	public static final long CFR_DECODE_J9_METHODTYPEREF;
	public static final long CFR_DECODE_J9_MULTIANEWARRAY;
	public static final long CFR_DECODE_L16;
	public static final long CFR_DECODE_L32;
	public static final long CFR_DECODE_LOOKUPSWITCH;
	public static final long CFR_DECODE_MULTIANEWARRAY;
	public static final long CFR_DECODE_NEWARRAY;
	public static final long CFR_DECODE_SIMPLE;
	public static final long CFR_DECODE_TABLESWITCH;
	public static final long CFR_DECODE_U16;
	public static final long CFR_DECODE_U16_I16;
	public static final long CFR_DECODE_U8;
	public static final long CFR_DECODE_U8_I8;
	public static final long CFR_FIELD_ACCESS_MASK;
	public static final long CFR_FIELD_ACCESS_NEWJDK5_MASK;
	public static final long CFR_INIT_METHOD_ACCESS_MASK;
	public static final long CFR_INTERFACE_CLASS_ACCESS_MASK;
	public static final long CFR_INTERFACE_FIELD_ACCESS_MASK;
	public static final long CFR_INTERFACE_FIELD_ACCESS_REQUIRED;
	public static final long CFR_INTERFACE_METHOD_ACCESS_MASK;
	public static final long CFR_INTERFACE_METHOD_ACCESS_REQUIRED;
	public static final long CFR_J9FLAG_HAS_JSR;
	public static final long CFR_MAGIC;
	public static final long CFR_MAJOR_VERSION;
	public static final long CFR_METHOD_ACCESS_MASK;
	public static final long CFR_METHOD_ACCESS_NEWJDK5_MASK;
	public static final long CFR_METHOD_EXT_HAS_CODE_TYPE_ANNOTATIONS;
	public static final long CFR_METHOD_EXT_HAS_METHOD_TYPE_ANNOTATIONS;
	public static final long CFR_METHOD_EXT_INVALID_CP_ENTRY;
	public static final long CFR_MINOR_VERSION;
	public static final long CFR_PUBLIC_PRIVATE_PROTECTED_MASK;
	public static final long ROM_ADDRESS_LENGTH;

	// Offsets

	public static final int _accessFlagsOffset_;
	public static final int _attributesOffset_;
	public static final int _attributesCountOffset_;
	public static final int _classFileSizeOffset_;
	public static final int _constantPoolOffset_;
	public static final int _constantPoolCountOffset_;
	public static final int _fieldsOffset_;
	public static final int _fieldsCountOffset_;
	public static final int _firstNATCPIndexOffset_;
	public static final int _firstUTF8CPIndexOffset_;
	public static final int _interfacesOffset_;
	public static final int _interfacesCountOffset_;
	public static final int _j9FlagsOffset_;
	public static final int _lastUTF8CPIndexOffset_;
	public static final int _magicOffset_;
	public static final int _majorVersionOffset_;
	public static final int _methodsOffset_;
	public static final int _methodsCountOffset_;
	public static final int _minorVersionOffset_;
	public static final int _superClassOffset_;
	public static final int _thisClassOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		CFR_ABSTRACT_METHOD_ACCESS_MASK = 0;
		CFR_ACC_ABSTRACT = 0;
		CFR_ACC_ANNOTATION = 0;
		CFR_ACC_BRIDGE = 0;
		CFR_ACC_CLONEABLE = 0;
		CFR_ACC_EMPTY_METHOD = 0;
		CFR_ACC_ENUM = 0;
		CFR_ACC_FINAL = 0;
		CFR_ACC_FINALIZE_NEEDED = 0;
		CFR_ACC_FORWARDER_METHOD = 0;
		CFR_ACC_GETTER_METHOD = 0;
		CFR_ACC_HAS_EMPTY_FINALIZE = 0;
		CFR_ACC_HAS_EXCEPTION_INFO = 0;
		CFR_ACC_HAS_FINAL_FIELDS = 0;
		CFR_ACC_HAS_VERIFY_DATA = 0;
		CFR_ACC_INTERFACE = 0;
		CFR_ACC_MANDATED = 0;
		CFR_ACC_METHOD_CALLER_SENSITIVE = 0;
		CFR_ACC_METHOD_FRAME_ITERATOR_SKIP = 0;
		CFR_ACC_METHOD_HAS_DEBUG_INFO = 0;
		CFR_ACC_METHOD_HAS_STACK_MAP = 0;
		CFR_ACC_NATIVE = 0;
		CFR_ACC_PRIVATE = 0;
		CFR_ACC_PROTECTED = 0;
		CFR_ACC_PUBLIC = 0;
		CFR_ACC_REFERENCE_PHANTOM = 0;
		CFR_ACC_REFERENCE_SOFT = 0;
		CFR_ACC_REFERENCE_WEAK = 0;
		CFR_ACC_STATIC = 0;
		CFR_ACC_STRICT = 0;
		CFR_ACC_SUPER = 0;
		CFR_ACC_SYNCHRONIZED = 0;
		CFR_ACC_SYNTHETIC = 0;
		CFR_ACC_TRANSIENT = 0;
		CFR_ACC_VARARGS = 0;
		CFR_ACC_VOLATILE = 0;
		CFR_ACC_VTABLE = 0;
		CFR_ATTRIBUTE_METHOD_PARAMETERS_MASK = 0;
		CFR_CLASS_ACCESS_MASK = 0;
		CFR_CLASS_ACCESS_NEWJDK5_MASK = 0;
		CFR_CLINIT_METHOD_ACCESS_MASK = 0;
		CFR_DECODE_CP16 = 0;
		CFR_DECODE_CP8 = 0;
		CFR_DECODE_I16 = 0;
		CFR_DECODE_I8 = 0;
		CFR_DECODE_J9_CLASSREF = 0;
		CFR_DECODE_J9_FIELDREF = 0;
		CFR_DECODE_J9_LDC = 0;
		CFR_DECODE_J9_LDC2DW = 0;
		CFR_DECODE_J9_LDC2LW = 0;
		CFR_DECODE_J9_LDCW = 0;
		CFR_DECODE_J9_METHODREF = 0;
		CFR_DECODE_J9_METHODTYPEREF = 0;
		CFR_DECODE_J9_MULTIANEWARRAY = 0;
		CFR_DECODE_L16 = 0;
		CFR_DECODE_L32 = 0;
		CFR_DECODE_LOOKUPSWITCH = 0;
		CFR_DECODE_MULTIANEWARRAY = 0;
		CFR_DECODE_NEWARRAY = 0;
		CFR_DECODE_SIMPLE = 0;
		CFR_DECODE_TABLESWITCH = 0;
		CFR_DECODE_U16 = 0;
		CFR_DECODE_U16_I16 = 0;
		CFR_DECODE_U8 = 0;
		CFR_DECODE_U8_I8 = 0;
		CFR_FIELD_ACCESS_MASK = 0;
		CFR_FIELD_ACCESS_NEWJDK5_MASK = 0;
		CFR_INIT_METHOD_ACCESS_MASK = 0;
		CFR_INTERFACE_CLASS_ACCESS_MASK = 0;
		CFR_INTERFACE_FIELD_ACCESS_MASK = 0;
		CFR_INTERFACE_FIELD_ACCESS_REQUIRED = 0;
		CFR_INTERFACE_METHOD_ACCESS_MASK = 0;
		CFR_INTERFACE_METHOD_ACCESS_REQUIRED = 0;
		CFR_J9FLAG_HAS_JSR = 0;
		CFR_MAGIC = 0;
		CFR_MAJOR_VERSION = 0;
		CFR_METHOD_ACCESS_MASK = 0;
		CFR_METHOD_ACCESS_NEWJDK5_MASK = 0;
		CFR_METHOD_EXT_HAS_CODE_TYPE_ANNOTATIONS = 0;
		CFR_METHOD_EXT_HAS_METHOD_TYPE_ANNOTATIONS = 0;
		CFR_METHOD_EXT_INVALID_CP_ENTRY = 0;
		CFR_MINOR_VERSION = 0;
		CFR_PUBLIC_PRIVATE_PROTECTED_MASK = 0;
		ROM_ADDRESS_LENGTH = 0;
		_accessFlagsOffset_ = 0;
		_attributesOffset_ = 0;
		_attributesCountOffset_ = 0;
		_classFileSizeOffset_ = 0;
		_constantPoolOffset_ = 0;
		_constantPoolCountOffset_ = 0;
		_fieldsOffset_ = 0;
		_fieldsCountOffset_ = 0;
		_firstNATCPIndexOffset_ = 0;
		_firstUTF8CPIndexOffset_ = 0;
		_interfacesOffset_ = 0;
		_interfacesCountOffset_ = 0;
		_j9FlagsOffset_ = 0;
		_lastUTF8CPIndexOffset_ = 0;
		_magicOffset_ = 0;
		_majorVersionOffset_ = 0;
		_methodsOffset_ = 0;
		_methodsCountOffset_ = 0;
		_minorVersionOffset_ = 0;
		_superClassOffset_ = 0;
		_thisClassOffset_ = 0;
	}

}
