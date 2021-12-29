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
 * Structure: J9ROMMethodPointer
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
 * The generated code will provide getters for all elements in the J9ROMMethodPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMMethod.class)
public class J9ROMMethodPointer extends StructurePointer {

	// NULL
	public static final J9ROMMethodPointer NULL = new J9ROMMethodPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMMethodPointer(long address) {
		super(address);
	}

	public static J9ROMMethodPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMMethodPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMMethodPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMMethodPointer(address);
	}

	public J9ROMMethodPointer add(long count) {
		return J9ROMMethodPointer.cast(address + (J9ROMMethod.SIZEOF * count));
	}

	public J9ROMMethodPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMMethodPointer addOffset(long offset) {
		return J9ROMMethodPointer.cast(address + offset);
	}

	public J9ROMMethodPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMMethodPointer sub(long count) {
		return J9ROMMethodPointer.cast(address - (J9ROMMethod.SIZEOF * count));
	}

	public J9ROMMethodPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMMethodPointer subOffset(long offset) {
		return J9ROMMethodPointer.cast(address - offset);
	}

	public J9ROMMethodPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMMethodPointer untag(long mask) {
		return J9ROMMethodPointer.cast(address & ~mask);
	}

	public J9ROMMethodPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMMethod.SIZEOF;
	}

	// Implementation methods

	// U8 argCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_argCountOffset_", declaredType="U8")
	public U8 argCount() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ROMMethod._argCountOffset_));
	}

	// U8 argCount
	public U8Pointer argCountEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ROMMethod._argCountOffset_));
	}

	// U8 bytecodeSizeHigh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeSizeHighOffset_", declaredType="U8")
	public U8 bytecodeSizeHigh() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ROMMethod._bytecodeSizeHighOffset_));
	}

	// U8 bytecodeSizeHigh
	public U8Pointer bytecodeSizeHighEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ROMMethod._bytecodeSizeHighOffset_));
	}

	// U16 bytecodeSizeLow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeSizeLowOffset_", declaredType="U16")
	public U16 bytecodeSizeLow() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMMethod._bytecodeSizeLowOffset_));
	}

	// U16 bytecodeSizeLow
	public U16Pointer bytecodeSizeLowEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMMethod._bytecodeSizeLowOffset_));
	}

	// U16 maxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackOffset_", declaredType="U16")
	public U16 maxStack() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMMethod._maxStackOffset_));
	}

	// U16 maxStack
	public U16Pointer maxStackEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMMethod._maxStackOffset_));
	}

	// U32 modifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modifiersOffset_", declaredType="U32")
	public UDATA modifiers() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMMethod._modifiersOffset_));
	}

	// U32 modifiers
	public UDATAPointer modifiersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMMethod._modifiersOffset_));
	}

	// J9ROMNameAndSignature nameAndSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameAndSignatureOffset_", declaredType="J9ROMNameAndSignature")
	public J9ROMNameAndSignaturePointer nameAndSignature() throws CorruptDataException {
		return J9ROMNameAndSignaturePointer.cast(nonNullFieldEA(J9ROMMethod._nameAndSignatureOffset_));
	}

	// J9ROMNameAndSignature nameAndSignature
	public PointerPointer nameAndSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMMethod._nameAndSignatureOffset_));
	}

	// U16 tempCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tempCountOffset_", declaredType="U16")
	public U16 tempCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMMethod._tempCountOffset_));
	}

	// U16 tempCount
	public U16Pointer tempCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMMethod._tempCountOffset_));
	}

}
