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
 * Structure: J9VariableInfoValuesPointer
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
 * The generated code will provide getters for all elements in the J9VariableInfoValuesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VariableInfoValues.class)
public class J9VariableInfoValuesPointer extends StructurePointer {

	// NULL
	public static final J9VariableInfoValuesPointer NULL = new J9VariableInfoValuesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VariableInfoValuesPointer(long address) {
		super(address);
	}

	public static J9VariableInfoValuesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VariableInfoValuesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VariableInfoValuesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VariableInfoValuesPointer(address);
	}

	public J9VariableInfoValuesPointer add(long count) {
		return J9VariableInfoValuesPointer.cast(address + (J9VariableInfoValues.SIZEOF * count));
	}

	public J9VariableInfoValuesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VariableInfoValuesPointer addOffset(long offset) {
		return J9VariableInfoValuesPointer.cast(address + offset);
	}

	public J9VariableInfoValuesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VariableInfoValuesPointer sub(long count) {
		return J9VariableInfoValuesPointer.cast(address - (J9VariableInfoValues.SIZEOF * count));
	}

	public J9VariableInfoValuesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VariableInfoValuesPointer subOffset(long offset) {
		return J9VariableInfoValuesPointer.cast(address - offset);
	}

	public J9VariableInfoValuesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VariableInfoValuesPointer untag(long mask) {
		return J9VariableInfoValuesPointer.cast(address & ~mask);
	}

	public J9VariableInfoValuesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VariableInfoValues.SIZEOF;
	}

	// Implementation methods

	// J9UTF8* genericSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericSignatureOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer genericSignature() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9VariableInfoValues._genericSignatureOffset_));
	}

	// J9UTF8* genericSignature
	public PointerPointer genericSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._genericSignatureOffset_));
	}

	// J9SRP* genericSignatureSrp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericSignatureSrpOffset_", declaredType="J9SRP*")
	public SelfRelativePointer genericSignatureSrp() throws CorruptDataException {
		return SelfRelativePointer.cast(getPointerAtOffset(J9VariableInfoValues._genericSignatureSrpOffset_));
	}

	// J9SRP* genericSignatureSrp
	public PointerPointer genericSignatureSrpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._genericSignatureSrpOffset_));
	}

	// J9UTF8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer name() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9VariableInfoValues._nameOffset_));
	}

	// J9UTF8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._nameOffset_));
	}

	// J9SRP* nameSrp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameSrpOffset_", declaredType="J9SRP*")
	public SelfRelativePointer nameSrp() throws CorruptDataException {
		return SelfRelativePointer.cast(getPointerAtOffset(J9VariableInfoValues._nameSrpOffset_));
	}

	// J9SRP* nameSrp
	public PointerPointer nameSrpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._nameSrpOffset_));
	}

	// J9UTF8* signature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signatureOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer signature() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9VariableInfoValues._signatureOffset_));
	}

	// J9UTF8* signature
	public PointerPointer signatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._signatureOffset_));
	}

	// J9SRP* signatureSrp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signatureSrpOffset_", declaredType="J9SRP*")
	public SelfRelativePointer signatureSrp() throws CorruptDataException {
		return SelfRelativePointer.cast(getPointerAtOffset(J9VariableInfoValues._signatureSrpOffset_));
	}

	// J9SRP* signatureSrp
	public PointerPointer signatureSrpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VariableInfoValues._signatureSrpOffset_));
	}

	// U32 slotNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotNumberOffset_", declaredType="U32")
	public UDATA slotNumber() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VariableInfoValues._slotNumberOffset_));
	}

	// U32 slotNumber
	public UDATAPointer slotNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VariableInfoValues._slotNumberOffset_));
	}

	// U32 startVisibility
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startVisibilityOffset_", declaredType="U32")
	public UDATA startVisibility() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VariableInfoValues._startVisibilityOffset_));
	}

	// U32 startVisibility
	public UDATAPointer startVisibilityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VariableInfoValues._startVisibilityOffset_));
	}

	// U32 visibilityLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_visibilityLengthOffset_", declaredType="U32")
	public UDATA visibilityLength() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VariableInfoValues._visibilityLengthOffset_));
	}

	// U32 visibilityLength
	public UDATAPointer visibilityLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VariableInfoValues._visibilityLengthOffset_));
	}

}
