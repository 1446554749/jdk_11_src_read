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
 * Structure: CursorPointer
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
 * The generated code will provide getters for all elements in the CursorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=Cursor.class)
public class CursorPointer extends StructurePointer {

	// NULL
	public static final CursorPointer NULL = new CursorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CursorPointer(long address) {
		super(address);
	}

	public static CursorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CursorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CursorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CursorPointer(address);
	}

	public CursorPointer add(long count) {
		return CursorPointer.cast(address + (Cursor.SIZEOF * count));
	}

	public CursorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public CursorPointer addOffset(long offset) {
		return CursorPointer.cast(address + offset);
	}

	public CursorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CursorPointer sub(long count) {
		return CursorPointer.cast(address - (Cursor.SIZEOF * count));
	}

	public CursorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CursorPointer subOffset(long offset) {
		return CursorPointer.cast(address - offset);
	}

	public CursorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CursorPointer untag(long mask) {
		return CursorPointer.cast(address & ~mask);
	}

	public CursorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return Cursor.SIZEOF;
	}

	// Implementation methods

	// U16 _classNameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classNameIndexOffset_", declaredType="U16")
	public U16 _classNameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(Cursor.__classNameIndexOffset_));
	}

	// U16 _classNameIndex
	public U16Pointer _classNameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(Cursor.__classNameIndexOffset_));
	}

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(Cursor.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(Cursor.__contextOffset_));
	}

	// UDATA _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="UDATA")
	public UDATA _count() throws CorruptDataException {
		return getUDATAAtOffset(Cursor.__countOffset_);
	}

	// UDATA _count
	public UDATAPointer _countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(Cursor.__countOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpOffsetTableOffset_", declaredType="SRPOffsetTable*")
	public SRPOffsetTablePointer _srpOffsetTable() throws CorruptDataException {
		return SRPOffsetTablePointer.cast(getPointerAtOffset(Cursor.__srpOffsetTableOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	public PointerPointer _srpOffsetTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(Cursor.__srpOffsetTableOffset_));
	}

	// UDATA _tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tagOffset_", declaredType="UDATA")
	public UDATA _tag() throws CorruptDataException {
		return getUDATAAtOffset(Cursor.__tagOffset_);
	}

	// UDATA _tag
	public UDATAPointer _tagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(Cursor.__tagOffset_));
	}

	// void** _vptr$Cursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$CursorOffset_", declaredType="void**")
	public PointerPointer _vptr$Cursor() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(Cursor.__vptr$CursorOffset_));
	}

	// void** _vptr$Cursor
	public PointerPointer _vptr$CursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(Cursor.__vptr$CursorOffset_));
	}

}
