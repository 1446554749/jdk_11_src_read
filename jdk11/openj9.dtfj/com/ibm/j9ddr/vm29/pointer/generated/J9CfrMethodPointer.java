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
 * Structure: J9CfrMethodPointer
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
 * The generated code will provide getters for all elements in the J9CfrMethodPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrMethod.class)
public class J9CfrMethodPointer extends StructurePointer {

	// NULL
	public static final J9CfrMethodPointer NULL = new J9CfrMethodPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrMethodPointer(long address) {
		super(address);
	}

	public static J9CfrMethodPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrMethodPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrMethodPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrMethodPointer(address);
	}

	public J9CfrMethodPointer add(long count) {
		return J9CfrMethodPointer.cast(address + (J9CfrMethod.SIZEOF * count));
	}

	public J9CfrMethodPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrMethodPointer addOffset(long offset) {
		return J9CfrMethodPointer.cast(address + offset);
	}

	public J9CfrMethodPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrMethodPointer sub(long count) {
		return J9CfrMethodPointer.cast(address - (J9CfrMethod.SIZEOF * count));
	}

	public J9CfrMethodPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrMethodPointer subOffset(long offset) {
		return J9CfrMethodPointer.cast(address - offset);
	}

	public J9CfrMethodPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrMethodPointer untag(long mask) {
		return J9CfrMethodPointer.cast(address & ~mask);
	}

	public J9CfrMethodPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrMethod.SIZEOF;
	}

	// Implementation methods

	// U16 accessFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_accessFlagsOffset_", declaredType="U16")
	public U16 accessFlags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrMethod._accessFlagsOffset_));
	}

	// U16 accessFlags
	public U16Pointer accessFlagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrMethod._accessFlagsOffset_));
	}

	// void** attributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesOffset_", declaredType="void**")
	public PointerPointer attributes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9CfrMethod._attributesOffset_));
	}

	// void** attributes
	public PointerPointer attributesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrMethod._attributesOffset_));
	}

	// U16 attributesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesCountOffset_", declaredType="U16")
	public U16 attributesCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrMethod._attributesCountOffset_));
	}

	// U16 attributesCount
	public U16Pointer attributesCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrMethod._attributesCountOffset_));
	}

	// J9CfrAttributeCode* codeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeAttributeOffset_", declaredType="J9CfrAttributeCode*")
	public J9CfrAttributeCodePointer codeAttribute() throws CorruptDataException {
		return J9CfrAttributeCodePointer.cast(getPointerAtOffset(J9CfrMethod._codeAttributeOffset_));
	}

	// J9CfrAttributeCode* codeAttribute
	public PointerPointer codeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrMethod._codeAttributeOffset_));
	}

	// U16 descriptorIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_descriptorIndexOffset_", declaredType="U16")
	public U16 descriptorIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrMethod._descriptorIndexOffset_));
	}

	// U16 descriptorIndex
	public U16Pointer descriptorIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrMethod._descriptorIndexOffset_));
	}

	// J9CfrAttributeExceptions* exceptionsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionsAttributeOffset_", declaredType="J9CfrAttributeExceptions*")
	public J9CfrAttributeExceptionsPointer exceptionsAttribute() throws CorruptDataException {
		return J9CfrAttributeExceptionsPointer.cast(getPointerAtOffset(J9CfrMethod._exceptionsAttributeOffset_));
	}

	// J9CfrAttributeExceptions* exceptionsAttribute
	public PointerPointer exceptionsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrMethod._exceptionsAttributeOffset_));
	}

	// U32 j9ArgumentCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9ArgumentCountOffset_", declaredType="U32")
	public UDATA j9ArgumentCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrMethod._j9ArgumentCountOffset_));
	}

	// U32 j9ArgumentCount
	public UDATAPointer j9ArgumentCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrMethod._j9ArgumentCountOffset_));
	}

	// U16 j9Flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9FlagsOffset_", declaredType="U16")
	public U16 j9Flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrMethod._j9FlagsOffset_));
	}

	// U16 j9Flags
	public U16Pointer j9FlagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrMethod._j9FlagsOffset_));
	}

	// J9CfrAttributeMethodParameters* methodParametersAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodParametersAttributeOffset_", declaredType="J9CfrAttributeMethodParameters*")
	public J9CfrAttributeMethodParametersPointer methodParametersAttribute() throws CorruptDataException {
		return J9CfrAttributeMethodParametersPointer.cast(getPointerAtOffset(J9CfrMethod._methodParametersAttributeOffset_));
	}

	// J9CfrAttributeMethodParameters* methodParametersAttribute
	public PointerPointer methodParametersAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrMethod._methodParametersAttributeOffset_));
	}

	// U16 nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameIndexOffset_", declaredType="U16")
	public U16 nameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrMethod._nameIndexOffset_));
	}

	// U16 nameIndex
	public U16Pointer nameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrMethod._nameIndexOffset_));
	}

	// UDATA romAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romAddressOffset_", declaredType="UDATA")
	public UDATA romAddress() throws CorruptDataException {
		return getUDATAAtOffset(J9CfrMethod._romAddressOffset_);
	}

	// UDATA romAddress
	public UDATAPointer romAddressEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrMethod._romAddressOffset_));
	}

}
