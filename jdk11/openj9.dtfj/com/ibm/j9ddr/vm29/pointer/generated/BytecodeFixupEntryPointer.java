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
 * Structure: BytecodeFixupEntryPointer
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
 * The generated code will provide getters for all elements in the BytecodeFixupEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=BytecodeFixupEntry.class)
public class BytecodeFixupEntryPointer extends StructurePointer {

	// NULL
	public static final BytecodeFixupEntryPointer NULL = new BytecodeFixupEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected BytecodeFixupEntryPointer(long address) {
		super(address);
	}

	public static BytecodeFixupEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static BytecodeFixupEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static BytecodeFixupEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new BytecodeFixupEntryPointer(address);
	}

	public BytecodeFixupEntryPointer add(long count) {
		return BytecodeFixupEntryPointer.cast(address + (BytecodeFixupEntry.SIZEOF * count));
	}

	public BytecodeFixupEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public BytecodeFixupEntryPointer addOffset(long offset) {
		return BytecodeFixupEntryPointer.cast(address + offset);
	}

	public BytecodeFixupEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public BytecodeFixupEntryPointer sub(long count) {
		return BytecodeFixupEntryPointer.cast(address - (BytecodeFixupEntry.SIZEOF * count));
	}

	public BytecodeFixupEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public BytecodeFixupEntryPointer subOffset(long offset) {
		return BytecodeFixupEntryPointer.cast(address - offset);
	}

	public BytecodeFixupEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public BytecodeFixupEntryPointer untag(long mask) {
		return BytecodeFixupEntryPointer.cast(address & ~mask);
	}

	public BytecodeFixupEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return BytecodeFixupEntry.SIZEOF;
	}

	// Implementation methods

	// U32 codeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeIndexOffset_", declaredType="U32")
	public UDATA codeIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(BytecodeFixupEntry._codeIndexOffset_));
	}

	// U32 codeIndex
	public UDATAPointer codeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(BytecodeFixupEntry._codeIndexOffset_));
	}

	// U16 cpIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpIndexOffset_", declaredType="U16")
	public U16 cpIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(BytecodeFixupEntry._cpIndexOffset_));
	}

	// U16 cpIndex
	public U16Pointer cpIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(BytecodeFixupEntry._cpIndexOffset_));
	}

	// U8 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="U8")
	public U8 type() throws CorruptDataException {
		return new U8(getByteAtOffset(BytecodeFixupEntry._typeOffset_));
	}

	// U8 type
	public U8Pointer typeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(BytecodeFixupEntry._typeOffset_));
	}

}
