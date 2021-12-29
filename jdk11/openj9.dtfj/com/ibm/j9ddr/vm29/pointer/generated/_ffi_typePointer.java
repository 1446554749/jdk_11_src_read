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
 * Structure: _ffi_typePointer
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
 * The generated code will provide getters for all elements in the _ffi_typePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=_ffi_type.class)
public class _ffi_typePointer extends StructurePointer {

	// NULL
	public static final _ffi_typePointer NULL = new _ffi_typePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected _ffi_typePointer(long address) {
		super(address);
	}

	public static _ffi_typePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static _ffi_typePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static _ffi_typePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new _ffi_typePointer(address);
	}

	public _ffi_typePointer add(long count) {
		return _ffi_typePointer.cast(address + (_ffi_type.SIZEOF * count));
	}

	public _ffi_typePointer add(Scalar count) {
		return add(count.longValue());
	}

	public _ffi_typePointer addOffset(long offset) {
		return _ffi_typePointer.cast(address + offset);
	}

	public _ffi_typePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public _ffi_typePointer sub(long count) {
		return _ffi_typePointer.cast(address - (_ffi_type.SIZEOF * count));
	}

	public _ffi_typePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public _ffi_typePointer subOffset(long offset) {
		return _ffi_typePointer.cast(address - offset);
	}

	public _ffi_typePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public _ffi_typePointer untag(long mask) {
		return _ffi_typePointer.cast(address & ~mask);
	}

	public _ffi_typePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return _ffi_type.SIZEOF;
	}

	// Implementation methods

	// U16 alignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alignmentOffset_", declaredType="U16")
	public U16 alignment() throws CorruptDataException {
		return new U16(getShortAtOffset(_ffi_type._alignmentOffset_));
	}

	// U16 alignment
	public U16Pointer alignmentEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(_ffi_type._alignmentOffset_));
	}

	// void** elements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementsOffset_", declaredType="void**")
	public PointerPointer elements() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(_ffi_type._elementsOffset_));
	}

	// void** elements
	public PointerPointer elementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(_ffi_type._elementsOffset_));
	}

	// size_t size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="size_t")
	public UDATA size() throws CorruptDataException {
		return new U64(getLongAtOffset(_ffi_type._sizeOffset_));
	}

	// size_t size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(_ffi_type._sizeOffset_));
	}

	// U16 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="U16")
	public U16 type() throws CorruptDataException {
		return new U16(getShortAtOffset(_ffi_type._typeOffset_));
	}

	// U16 type
	public U16Pointer typeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(_ffi_type._typeOffset_));
	}

}
