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
 * Structure: ffi_closurePointer
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
 * The generated code will provide getters for all elements in the ffi_closurePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ffi_closure.class)
public class ffi_closurePointer extends StructurePointer {

	// NULL
	public static final ffi_closurePointer NULL = new ffi_closurePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ffi_closurePointer(long address) {
		super(address);
	}

	public static ffi_closurePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ffi_closurePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ffi_closurePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ffi_closurePointer(address);
	}

	public ffi_closurePointer add(long count) {
		return ffi_closurePointer.cast(address + (ffi_closure.SIZEOF * count));
	}

	public ffi_closurePointer add(Scalar count) {
		return add(count.longValue());
	}

	public ffi_closurePointer addOffset(long offset) {
		return ffi_closurePointer.cast(address + offset);
	}

	public ffi_closurePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ffi_closurePointer sub(long count) {
		return ffi_closurePointer.cast(address - (ffi_closure.SIZEOF * count));
	}

	public ffi_closurePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ffi_closurePointer subOffset(long offset) {
		return ffi_closurePointer.cast(address - offset);
	}

	public ffi_closurePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ffi_closurePointer untag(long mask) {
		return ffi_closurePointer.cast(address & ~mask);
	}

	public ffi_closurePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ffi_closure.SIZEOF;
	}

	// Implementation methods

	// ffi_cif* cif
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cifOffset_", declaredType="ffi_cif*")
	public ffi_cifPointer cif() throws CorruptDataException {
		return ffi_cifPointer.cast(getPointerAtOffset(ffi_closure._cifOffset_));
	}

	// ffi_cif* cif
	public PointerPointer cifEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ffi_closure._cifOffset_));
	}

	// void* fun
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_funOffset_", declaredType="void*")
	public VoidPointer fun() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ffi_closure._funOffset_));
	}

	// void* fun
	public PointerPointer funEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ffi_closure._funOffset_));
	}

	// U8[] tramp
	public U8Pointer trampEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ffi_closure._trampOffset_));
	}

	// void* user_data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_user_dataOffset_", declaredType="void*")
	public VoidPointer user_data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ffi_closure._user_dataOffset_));
	}

	// void* user_data
	public PointerPointer user_dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ffi_closure._user_dataOffset_));
	}

}
