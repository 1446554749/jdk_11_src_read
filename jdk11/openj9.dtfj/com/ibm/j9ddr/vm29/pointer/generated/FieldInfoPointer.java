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
 *  SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

/**
 * WARNING!!! GENERATED FILE
 *
 * This class is generated.
 * Do not use the Eclipse "Organize Imports" feature on this class.
 *
 * It can contain user content, but that content must be delimited with the
 * the tags
 * [BEGIN USER IMPORTS]
 * [END USER IMPORTS]
 *
 * or
 *
 * [BEGIN USER CODE]
 * [END USER CODE]
 *
 * These tags are entered as comments.  Characters before [ and after ] are ignored.
 * Lines between the tags are inserted into the newly generated file.
 *
 * IMPORTS are combined and inserted above newly generated imports.  CODE is combined
 * and inserted immediately after the class declaration
 *
 * All lines outside these tags are lost and replaced with newly generated code.
 */
package com.ibm.j9ddr.vm29.pointer.generated;

/*[BEGIN USER IMPORTS]*/
/*[END USER IMPORTS]*/

import com.ibm.j9ddr.CorruptDataException;
import com.ibm.j9ddr.vm29.pointer.*;
import com.ibm.j9ddr.vm29.structure.*;
import com.ibm.j9ddr.vm29.types.*;

/**
 * Structure: FieldInfoPointer
 *
 * A generated implementation of a VM structure
 *
 * This class contains generated code and MAY contain hand written user code.
 *
 * Hand written user code must be contained at the top of
 * the class file, specifically above
 * the comment line containing WARNING!!! GENERATED CODE
 *
 * ALL code below the GENERATED warning will be replaced with new generated code
 * each time the PointerGenerator utility is run.
 *
 * The generated code will provide getters for all elements in the FieldInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=FieldInfo.class)
public class FieldInfoPointer extends StructurePointer {

	// NULL
	public static final FieldInfoPointer NULL = new FieldInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected FieldInfoPointer(long address) {
		super(address);
	}

	public static FieldInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static FieldInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static FieldInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new FieldInfoPointer(address);
	}

	public FieldInfoPointer add(long count) {
		return FieldInfoPointer.cast(address + (FieldInfo.SIZEOF * count));
	}

	public FieldInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public FieldInfoPointer addOffset(long offset) {
		return FieldInfoPointer.cast(address + offset);
	}

	public FieldInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public FieldInfoPointer sub(long count) {
		return FieldInfoPointer.cast(address - (FieldInfo.SIZEOF * count));
	}

	public FieldInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public FieldInfoPointer subOffset(long offset) {
		return FieldInfoPointer.cast(address - offset);
	}

	public FieldInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public FieldInfoPointer untag(long mask) {
		return FieldInfoPointer.cast(address & ~mask);
	}

	public FieldInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return FieldInfo.SIZEOF;
	}

	// Implementation methods

	// J9CfrAttributeRuntimeVisibleAnnotations* annotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleAnnotations*")
	public J9CfrAttributeRuntimeVisibleAnnotationsPointer annotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(getPointerAtOffset(FieldInfo._annotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleAnnotations* annotationsAttribute
	public PointerPointer annotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FieldInfo._annotationsAttributeOffset_));
	}

	// U16 genericSignatureIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericSignatureIndexOffset_", declaredType="U16")
	public U16 genericSignatureIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(FieldInfo._genericSignatureIndexOffset_));
	}

	// U16 genericSignatureIndex
	public U16Pointer genericSignatureIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(FieldInfo._genericSignatureIndexOffset_));
	}

	// bool hasGenericSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasGenericSignatureOffset_", declaredType="bool")
	public boolean hasGenericSignature() throws CorruptDataException {
		return getBoolAtOffset(FieldInfo._hasGenericSignatureOffset_);
	}

	// bool hasGenericSignature
	public BoolPointer hasGenericSignatureEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(FieldInfo._hasGenericSignatureOffset_));
	}

	// bool isFieldContended
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isFieldContendedOffset_", declaredType="bool")
	public boolean isFieldContended() throws CorruptDataException {
		return getBoolAtOffset(FieldInfo._isFieldContendedOffset_);
	}

	// bool isFieldContended
	public BoolPointer isFieldContendedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(FieldInfo._isFieldContendedOffset_));
	}

	// bool isSynthetic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isSyntheticOffset_", declaredType="bool")
	public boolean isSynthetic() throws CorruptDataException {
		return getBoolAtOffset(FieldInfo._isSyntheticOffset_);
	}

	// bool isSynthetic
	public BoolPointer isSyntheticEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(FieldInfo._isSyntheticOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* typeAnnotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeAnnotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleTypeAnnotations*")
	public J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer typeAnnotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer.cast(getPointerAtOffset(FieldInfo._typeAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* typeAnnotationsAttribute
	public PointerPointer typeAnnotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FieldInfo._typeAnnotationsAttributeOffset_));
	}

}
