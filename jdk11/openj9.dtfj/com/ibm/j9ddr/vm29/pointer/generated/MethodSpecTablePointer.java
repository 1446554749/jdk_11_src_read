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
 * Structure: MethodSpecTablePointer
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
 * The generated code will provide getters for all elements in the MethodSpecTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MethodSpecTable.class)
public class MethodSpecTablePointer extends StructurePointer {

	// NULL
	public static final MethodSpecTablePointer NULL = new MethodSpecTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MethodSpecTablePointer(long address) {
		super(address);
	}

	public static MethodSpecTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MethodSpecTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MethodSpecTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MethodSpecTablePointer(address);
	}

	public MethodSpecTablePointer add(long count) {
		return MethodSpecTablePointer.cast(address + (MethodSpecTable.SIZEOF * count));
	}

	public MethodSpecTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MethodSpecTablePointer addOffset(long offset) {
		return MethodSpecTablePointer.cast(address + offset);
	}

	public MethodSpecTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MethodSpecTablePointer sub(long count) {
		return MethodSpecTablePointer.cast(address - (MethodSpecTable.SIZEOF * count));
	}

	public MethodSpecTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MethodSpecTablePointer subOffset(long offset) {
		return MethodSpecTablePointer.cast(address - offset);
	}

	public MethodSpecTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MethodSpecTablePointer untag(long mask) {
		return MethodSpecTablePointer.cast(address & ~mask);
	}

	public MethodSpecTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MethodSpecTable.SIZEOF;
	}

	// Implementation methods

	// U8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="U8*")
	public U8Pointer className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MethodSpecTable._classNameOffset_));
	}

	// U8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodSpecTable._classNameOffset_));
	}

	// UDATA classNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameLengthOffset_", declaredType="UDATA")
	public UDATA classNameLength() throws CorruptDataException {
		return getUDATAAtOffset(MethodSpecTable._classNameLengthOffset_);
	}

	// UDATA classNameLength
	public UDATAPointer classNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._classNameLengthOffset_));
	}

	// U32 classNameMatchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameMatchFlagOffset_", declaredType="U32")
	public UDATA classNameMatchFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodSpecTable._classNameMatchFlagOffset_));
	}

	// U32 classNameMatchFlag
	public UDATAPointer classNameMatchFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._classNameMatchFlagOffset_));
	}

	// bool matchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_matchFlagOffset_", declaredType="bool")
	public boolean matchFlag() throws CorruptDataException {
		return getBoolAtOffset(MethodSpecTable._matchFlagOffset_);
	}

	// bool matchFlag
	public BoolPointer matchFlagEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MethodSpecTable._matchFlagOffset_));
	}

	// U8* methodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameOffset_", declaredType="U8*")
	public U8Pointer methodName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MethodSpecTable._methodNameOffset_));
	}

	// U8* methodName
	public PointerPointer methodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodSpecTable._methodNameOffset_));
	}

	// UDATA methodNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameLengthOffset_", declaredType="UDATA")
	public UDATA methodNameLength() throws CorruptDataException {
		return getUDATAAtOffset(MethodSpecTable._methodNameLengthOffset_);
	}

	// UDATA methodNameLength
	public UDATAPointer methodNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._methodNameLengthOffset_));
	}

	// U32 methodNameMatchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameMatchFlagOffset_", declaredType="U32")
	public UDATA methodNameMatchFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodSpecTable._methodNameMatchFlagOffset_));
	}

	// U32 methodNameMatchFlag
	public UDATAPointer methodNameMatchFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._methodNameMatchFlagOffset_));
	}

	// U8* methodSig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSigOffset_", declaredType="U8*")
	public U8Pointer methodSig() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MethodSpecTable._methodSigOffset_));
	}

	// U8* methodSig
	public PointerPointer methodSigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodSpecTable._methodSigOffset_));
	}

	// UDATA methodSigLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSigLengthOffset_", declaredType="UDATA")
	public UDATA methodSigLength() throws CorruptDataException {
		return getUDATAAtOffset(MethodSpecTable._methodSigLengthOffset_);
	}

	// UDATA methodSigLength
	public UDATAPointer methodSigLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._methodSigLengthOffset_));
	}

	// U32 methodSigMatchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSigMatchFlagOffset_", declaredType="U32")
	public UDATA methodSigMatchFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodSpecTable._methodSigMatchFlagOffset_));
	}

	// U32 methodSigMatchFlag
	public UDATAPointer methodSigMatchFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodSpecTable._methodSigMatchFlagOffset_));
	}

}
