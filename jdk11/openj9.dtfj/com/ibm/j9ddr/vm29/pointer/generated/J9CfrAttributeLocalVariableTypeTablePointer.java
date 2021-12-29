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
 * Structure: J9CfrAttributeLocalVariableTypeTablePointer
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
 * The generated code will provide getters for all elements in the J9CfrAttributeLocalVariableTypeTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrAttributeLocalVariableTypeTable.class)
public class J9CfrAttributeLocalVariableTypeTablePointer extends StructurePointer {

	// NULL
	public static final J9CfrAttributeLocalVariableTypeTablePointer NULL = new J9CfrAttributeLocalVariableTypeTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrAttributeLocalVariableTypeTablePointer(long address) {
		super(address);
	}

	public static J9CfrAttributeLocalVariableTypeTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrAttributeLocalVariableTypeTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrAttributeLocalVariableTypeTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrAttributeLocalVariableTypeTablePointer(address);
	}

	public J9CfrAttributeLocalVariableTypeTablePointer add(long count) {
		return J9CfrAttributeLocalVariableTypeTablePointer.cast(address + (J9CfrAttributeLocalVariableTypeTable.SIZEOF * count));
	}

	public J9CfrAttributeLocalVariableTypeTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrAttributeLocalVariableTypeTablePointer addOffset(long offset) {
		return J9CfrAttributeLocalVariableTypeTablePointer.cast(address + offset);
	}

	public J9CfrAttributeLocalVariableTypeTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrAttributeLocalVariableTypeTablePointer sub(long count) {
		return J9CfrAttributeLocalVariableTypeTablePointer.cast(address - (J9CfrAttributeLocalVariableTypeTable.SIZEOF * count));
	}

	public J9CfrAttributeLocalVariableTypeTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrAttributeLocalVariableTypeTablePointer subOffset(long offset) {
		return J9CfrAttributeLocalVariableTypeTablePointer.cast(address - offset);
	}

	public J9CfrAttributeLocalVariableTypeTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrAttributeLocalVariableTypeTablePointer untag(long mask) {
		return J9CfrAttributeLocalVariableTypeTablePointer.cast(address & ~mask);
	}

	public J9CfrAttributeLocalVariableTypeTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrAttributeLocalVariableTypeTable.SIZEOF;
	}

	// Implementation methods

	// U32 length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="U32")
	public UDATA length() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrAttributeLocalVariableTypeTable._lengthOffset_));
	}

	// U32 length
	public UDATAPointer lengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._lengthOffset_));
	}

	// J9CfrLocalVariableTypeTableEntry* localVariableTypeTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localVariableTypeTableOffset_", declaredType="J9CfrLocalVariableTypeTableEntry*")
	public J9CfrLocalVariableTypeTableEntryPointer localVariableTypeTable() throws CorruptDataException {
		return J9CfrLocalVariableTypeTableEntryPointer.cast(getPointerAtOffset(J9CfrAttributeLocalVariableTypeTable._localVariableTypeTableOffset_));
	}

	// J9CfrLocalVariableTypeTableEntry* localVariableTypeTable
	public PointerPointer localVariableTypeTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._localVariableTypeTableOffset_));
	}

	// U16 localVariableTypeTableLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localVariableTypeTableLengthOffset_", declaredType="U16")
	public U16 localVariableTypeTableLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeLocalVariableTypeTable._localVariableTypeTableLengthOffset_));
	}

	// U16 localVariableTypeTableLength
	public U16Pointer localVariableTypeTableLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._localVariableTypeTableLengthOffset_));
	}

	// U16 nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameIndexOffset_", declaredType="U16")
	public U16 nameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeLocalVariableTypeTable._nameIndexOffset_));
	}

	// U16 nameIndex
	public U16Pointer nameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._nameIndexOffset_));
	}

	// UDATA romAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romAddressOffset_", declaredType="UDATA")
	public UDATA romAddress() throws CorruptDataException {
		return getUDATAAtOffset(J9CfrAttributeLocalVariableTypeTable._romAddressOffset_);
	}

	// UDATA romAddress
	public UDATAPointer romAddressEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._romAddressOffset_));
	}

	// U8 tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="U8")
	public U8 tag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9CfrAttributeLocalVariableTypeTable._tagOffset_));
	}

	// U8 tag
	public U8Pointer tagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9CfrAttributeLocalVariableTypeTable._tagOffset_));
	}

}
