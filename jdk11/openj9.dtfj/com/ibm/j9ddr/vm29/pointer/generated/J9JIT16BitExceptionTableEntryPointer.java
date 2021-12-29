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
 * Structure: J9JIT16BitExceptionTableEntryPointer
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
 * The generated code will provide getters for all elements in the J9JIT16BitExceptionTableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JIT16BitExceptionTableEntry.class)
public class J9JIT16BitExceptionTableEntryPointer extends StructurePointer {

	// NULL
	public static final J9JIT16BitExceptionTableEntryPointer NULL = new J9JIT16BitExceptionTableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JIT16BitExceptionTableEntryPointer(long address) {
		super(address);
	}

	public static J9JIT16BitExceptionTableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JIT16BitExceptionTableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JIT16BitExceptionTableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JIT16BitExceptionTableEntryPointer(address);
	}

	public J9JIT16BitExceptionTableEntryPointer add(long count) {
		return J9JIT16BitExceptionTableEntryPointer.cast(address + (J9JIT16BitExceptionTableEntry.SIZEOF * count));
	}

	public J9JIT16BitExceptionTableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JIT16BitExceptionTableEntryPointer addOffset(long offset) {
		return J9JIT16BitExceptionTableEntryPointer.cast(address + offset);
	}

	public J9JIT16BitExceptionTableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JIT16BitExceptionTableEntryPointer sub(long count) {
		return J9JIT16BitExceptionTableEntryPointer.cast(address - (J9JIT16BitExceptionTableEntry.SIZEOF * count));
	}

	public J9JIT16BitExceptionTableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JIT16BitExceptionTableEntryPointer subOffset(long offset) {
		return J9JIT16BitExceptionTableEntryPointer.cast(address - offset);
	}

	public J9JIT16BitExceptionTableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JIT16BitExceptionTableEntryPointer untag(long mask) {
		return J9JIT16BitExceptionTableEntryPointer.cast(address & ~mask);
	}

	public J9JIT16BitExceptionTableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JIT16BitExceptionTableEntry.SIZEOF;
	}

	// Implementation methods

	// U16 catchType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_catchTypeOffset_", declaredType="U16")
	public U16 catchType() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JIT16BitExceptionTableEntry._catchTypeOffset_));
	}

	// U16 catchType
	public U16Pointer catchTypeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JIT16BitExceptionTableEntry._catchTypeOffset_));
	}

	// U16 endPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endPCOffset_", declaredType="U16")
	public U16 endPC() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JIT16BitExceptionTableEntry._endPCOffset_));
	}

	// U16 endPC
	public U16Pointer endPCEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JIT16BitExceptionTableEntry._endPCOffset_));
	}

	// U16 handlerPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlerPCOffset_", declaredType="U16")
	public U16 handlerPC() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JIT16BitExceptionTableEntry._handlerPCOffset_));
	}

	// U16 handlerPC
	public U16Pointer handlerPCEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JIT16BitExceptionTableEntry._handlerPCOffset_));
	}

	// U16 startPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPCOffset_", declaredType="U16")
	public U16 startPC() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JIT16BitExceptionTableEntry._startPCOffset_));
	}

	// U16 startPC
	public U16Pointer startPCEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JIT16BitExceptionTableEntry._startPCOffset_));
	}

}
