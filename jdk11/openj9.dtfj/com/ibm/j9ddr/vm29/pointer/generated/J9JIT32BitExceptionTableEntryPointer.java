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
 * Structure: J9JIT32BitExceptionTableEntryPointer
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
 * The generated code will provide getters for all elements in the J9JIT32BitExceptionTableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JIT32BitExceptionTableEntry.class)
public class J9JIT32BitExceptionTableEntryPointer extends StructurePointer {

	// NULL
	public static final J9JIT32BitExceptionTableEntryPointer NULL = new J9JIT32BitExceptionTableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JIT32BitExceptionTableEntryPointer(long address) {
		super(address);
	}

	public static J9JIT32BitExceptionTableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JIT32BitExceptionTableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JIT32BitExceptionTableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JIT32BitExceptionTableEntryPointer(address);
	}

	public J9JIT32BitExceptionTableEntryPointer add(long count) {
		return J9JIT32BitExceptionTableEntryPointer.cast(address + (J9JIT32BitExceptionTableEntry.SIZEOF * count));
	}

	public J9JIT32BitExceptionTableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JIT32BitExceptionTableEntryPointer addOffset(long offset) {
		return J9JIT32BitExceptionTableEntryPointer.cast(address + offset);
	}

	public J9JIT32BitExceptionTableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JIT32BitExceptionTableEntryPointer sub(long count) {
		return J9JIT32BitExceptionTableEntryPointer.cast(address - (J9JIT32BitExceptionTableEntry.SIZEOF * count));
	}

	public J9JIT32BitExceptionTableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JIT32BitExceptionTableEntryPointer subOffset(long offset) {
		return J9JIT32BitExceptionTableEntryPointer.cast(address - offset);
	}

	public J9JIT32BitExceptionTableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JIT32BitExceptionTableEntryPointer untag(long mask) {
		return J9JIT32BitExceptionTableEntryPointer.cast(address & ~mask);
	}

	public J9JIT32BitExceptionTableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JIT32BitExceptionTableEntry.SIZEOF;
	}

	// Implementation methods

	// U32 catchType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_catchTypeOffset_", declaredType="U32")
	public UDATA catchType() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JIT32BitExceptionTableEntry._catchTypeOffset_));
	}

	// U32 catchType
	public UDATAPointer catchTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JIT32BitExceptionTableEntry._catchTypeOffset_));
	}

	// U32 endPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endPCOffset_", declaredType="U32")
	public UDATA endPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JIT32BitExceptionTableEntry._endPCOffset_));
	}

	// U32 endPC
	public UDATAPointer endPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JIT32BitExceptionTableEntry._endPCOffset_));
	}

	// U32 handlerPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlerPCOffset_", declaredType="U32")
	public UDATA handlerPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JIT32BitExceptionTableEntry._handlerPCOffset_));
	}

	// U32 handlerPC
	public UDATAPointer handlerPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JIT32BitExceptionTableEntry._handlerPCOffset_));
	}

	// J9Method* ramMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramMethodOffset_", declaredType="J9Method*")
	public J9MethodPointer ramMethod() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JIT32BitExceptionTableEntry._ramMethodOffset_));
	}

	// J9Method* ramMethod
	public PointerPointer ramMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JIT32BitExceptionTableEntry._ramMethodOffset_));
	}

	// U32 startPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPCOffset_", declaredType="U32")
	public UDATA startPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JIT32BitExceptionTableEntry._startPCOffset_));
	}

	// U32 startPC
	public UDATAPointer startPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JIT32BitExceptionTableEntry._startPCOffset_));
	}

}
