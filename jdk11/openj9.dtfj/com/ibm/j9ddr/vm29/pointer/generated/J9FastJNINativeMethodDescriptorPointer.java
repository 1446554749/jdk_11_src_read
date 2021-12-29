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
 * Structure: J9FastJNINativeMethodDescriptorPointer
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
 * The generated code will provide getters for all elements in the J9FastJNINativeMethodDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9FastJNINativeMethodDescriptor.class)
public class J9FastJNINativeMethodDescriptorPointer extends StructurePointer {

	// NULL
	public static final J9FastJNINativeMethodDescriptorPointer NULL = new J9FastJNINativeMethodDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9FastJNINativeMethodDescriptorPointer(long address) {
		super(address);
	}

	public static J9FastJNINativeMethodDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9FastJNINativeMethodDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9FastJNINativeMethodDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9FastJNINativeMethodDescriptorPointer(address);
	}

	public J9FastJNINativeMethodDescriptorPointer add(long count) {
		return J9FastJNINativeMethodDescriptorPointer.cast(address + (J9FastJNINativeMethodDescriptor.SIZEOF * count));
	}

	public J9FastJNINativeMethodDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9FastJNINativeMethodDescriptorPointer addOffset(long offset) {
		return J9FastJNINativeMethodDescriptorPointer.cast(address + offset);
	}

	public J9FastJNINativeMethodDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9FastJNINativeMethodDescriptorPointer sub(long count) {
		return J9FastJNINativeMethodDescriptorPointer.cast(address - (J9FastJNINativeMethodDescriptor.SIZEOF * count));
	}

	public J9FastJNINativeMethodDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9FastJNINativeMethodDescriptorPointer subOffset(long offset) {
		return J9FastJNINativeMethodDescriptorPointer.cast(address - offset);
	}

	public J9FastJNINativeMethodDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9FastJNINativeMethodDescriptorPointer untag(long mask) {
		return J9FastJNINativeMethodDescriptorPointer.cast(address & ~mask);
	}

	public J9FastJNINativeMethodDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9FastJNINativeMethodDescriptor.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9FastJNINativeMethodDescriptor._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._flagsOffset_));
	}

	// void* function
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_functionOffset_", declaredType="void*")
	public VoidPointer function() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9FastJNINativeMethodDescriptor._functionOffset_));
	}

	// void* function
	public PointerPointer functionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._functionOffset_));
	}

	// const U8* methodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameOffset_", declaredType="const U8*")
	public U8Pointer methodName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9FastJNINativeMethodDescriptor._methodNameOffset_));
	}

	// const U8* methodName
	public PointerPointer methodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._methodNameOffset_));
	}

	// UDATA methodNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameLengthOffset_", declaredType="UDATA")
	public UDATA methodNameLength() throws CorruptDataException {
		return getUDATAAtOffset(J9FastJNINativeMethodDescriptor._methodNameLengthOffset_);
	}

	// UDATA methodNameLength
	public UDATAPointer methodNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._methodNameLengthOffset_));
	}

	// const U8* methodSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSignatureOffset_", declaredType="const U8*")
	public U8Pointer methodSignature() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9FastJNINativeMethodDescriptor._methodSignatureOffset_));
	}

	// const U8* methodSignature
	public PointerPointer methodSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._methodSignatureOffset_));
	}

	// UDATA methodSignatureLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSignatureLengthOffset_", declaredType="UDATA")
	public UDATA methodSignatureLength() throws CorruptDataException {
		return getUDATAAtOffset(J9FastJNINativeMethodDescriptor._methodSignatureLengthOffset_);
	}

	// UDATA methodSignatureLength
	public UDATAPointer methodSignatureLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9FastJNINativeMethodDescriptor._methodSignatureLengthOffset_));
	}

}
