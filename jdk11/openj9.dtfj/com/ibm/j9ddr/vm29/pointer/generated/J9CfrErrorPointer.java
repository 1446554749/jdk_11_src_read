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
 * Structure: J9CfrErrorPointer
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
 * The generated code will provide getters for all elements in the J9CfrErrorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrError.class)
public class J9CfrErrorPointer extends StructurePointer {

	// NULL
	public static final J9CfrErrorPointer NULL = new J9CfrErrorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrErrorPointer(long address) {
		super(address);
	}

	public static J9CfrErrorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrErrorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrErrorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrErrorPointer(address);
	}

	public J9CfrErrorPointer add(long count) {
		return J9CfrErrorPointer.cast(address + (J9CfrError.SIZEOF * count));
	}

	public J9CfrErrorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrErrorPointer addOffset(long offset) {
		return J9CfrErrorPointer.cast(address + offset);
	}

	public J9CfrErrorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrErrorPointer sub(long count) {
		return J9CfrErrorPointer.cast(address - (J9CfrError.SIZEOF * count));
	}

	public J9CfrErrorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrErrorPointer subOffset(long offset) {
		return J9CfrErrorPointer.cast(address - offset);
	}

	public J9CfrErrorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrErrorPointer untag(long mask) {
		return J9CfrErrorPointer.cast(address & ~mask);
	}

	public J9CfrErrorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrError.SIZEOF;
	}

	// Implementation methods

	// J9CfrConstantPoolInfo* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="J9CfrConstantPoolInfo*")
	public J9CfrConstantPoolInfoPointer constantPool() throws CorruptDataException {
		return J9CfrConstantPoolInfoPointer.cast(getPointerAtOffset(J9CfrError._constantPoolOffset_));
	}

	// J9CfrConstantPoolInfo* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrError._constantPoolOffset_));
	}

	// U16 errorAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorActionOffset_", declaredType="U16")
	public U16 errorAction() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrError._errorActionOffset_));
	}

	// U16 errorAction
	public U16Pointer errorActionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrError._errorActionOffset_));
	}

	// U32 errorBsmArgsIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorBsmArgsIndexOffset_", declaredType="U32")
	public UDATA errorBsmArgsIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorBsmArgsIndexOffset_));
	}

	// U32 errorBsmArgsIndex
	public UDATAPointer errorBsmArgsIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorBsmArgsIndexOffset_));
	}

	// I32 errorBsmIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorBsmIndexOffset_", declaredType="I32")
	public IDATA errorBsmIndex() throws CorruptDataException {
		return new I32(getIntAtOffset(J9CfrError._errorBsmIndexOffset_));
	}

	// I32 errorBsmIndex
	public IDATAPointer errorBsmIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9CfrError._errorBsmIndexOffset_));
	}

	// U32 errorCPType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCPTypeOffset_", declaredType="U32")
	public UDATA errorCPType() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorCPTypeOffset_));
	}

	// U32 errorCPType
	public UDATAPointer errorCPTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorCPTypeOffset_));
	}

	// U32 errorCatalog
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCatalogOffset_", declaredType="U32")
	public UDATA errorCatalog() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorCatalogOffset_));
	}

	// U32 errorCatalog
	public UDATAPointer errorCatalogEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorCatalogOffset_));
	}

	// U16 errorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCodeOffset_", declaredType="U16")
	public U16 errorCode() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrError._errorCodeOffset_));
	}

	// U16 errorCode
	public U16Pointer errorCodeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrError._errorCodeOffset_));
	}

	// U32 errorDataIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorDataIndexOffset_", declaredType="U32")
	public UDATA errorDataIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorDataIndexOffset_));
	}

	// U32 errorDataIndex
	public UDATAPointer errorDataIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorDataIndexOffset_));
	}

	// U32 errorFrameBCI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorFrameBCIOffset_", declaredType="U32")
	public UDATA errorFrameBCI() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorFrameBCIOffset_));
	}

	// U32 errorFrameBCI
	public UDATAPointer errorFrameBCIEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorFrameBCIOffset_));
	}

	// I32 errorFrameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorFrameIndexOffset_", declaredType="I32")
	public IDATA errorFrameIndex() throws CorruptDataException {
		return new I32(getIntAtOffset(J9CfrError._errorFrameIndexOffset_));
	}

	// I32 errorFrameIndex
	public IDATAPointer errorFrameIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9CfrError._errorFrameIndexOffset_));
	}

	// J9CfrMethod* errorMember
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorMemberOffset_", declaredType="J9CfrMethod*")
	public J9CfrMethodPointer errorMember() throws CorruptDataException {
		return J9CfrMethodPointer.cast(getPointerAtOffset(J9CfrError._errorMemberOffset_));
	}

	// J9CfrMethod* errorMember
	public PointerPointer errorMemberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrError._errorMemberOffset_));
	}

	// I32 errorMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorMethodOffset_", declaredType="I32")
	public IDATA errorMethod() throws CorruptDataException {
		return new I32(getIntAtOffset(J9CfrError._errorMethodOffset_));
	}

	// I32 errorMethod
	public IDATAPointer errorMethodEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9CfrError._errorMethodOffset_));
	}

	// U32 errorOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorOffsetOffset_", declaredType="U32")
	public UDATA errorOffset() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorOffsetOffset_));
	}

	// U32 errorOffset
	public UDATAPointer errorOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorOffsetOffset_));
	}

	// U32 errorPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorPCOffset_", declaredType="U32")
	public UDATA errorPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrError._errorPCOffset_));
	}

	// U32 errorPC
	public UDATAPointer errorPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrError._errorPCOffset_));
	}

	// I32 verboseErrorType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseErrorTypeOffset_", declaredType="I32")
	public IDATA verboseErrorType() throws CorruptDataException {
		return new I32(getIntAtOffset(J9CfrError._verboseErrorTypeOffset_));
	}

	// I32 verboseErrorType
	public IDATAPointer verboseErrorTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9CfrError._verboseErrorTypeOffset_));
	}

}
