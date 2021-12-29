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
 * Structure: J9JVMTICompileEventPointer
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
 * The generated code will provide getters for all elements in the J9JVMTICompileEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTICompileEvent.class)
public class J9JVMTICompileEventPointer extends StructurePointer {

	// NULL
	public static final J9JVMTICompileEventPointer NULL = new J9JVMTICompileEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTICompileEventPointer(long address) {
		super(address);
	}

	public static J9JVMTICompileEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTICompileEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTICompileEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTICompileEventPointer(address);
	}

	public J9JVMTICompileEventPointer add(long count) {
		return J9JVMTICompileEventPointer.cast(address + (J9JVMTICompileEvent.SIZEOF * count));
	}

	public J9JVMTICompileEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTICompileEventPointer addOffset(long offset) {
		return J9JVMTICompileEventPointer.cast(address + offset);
	}

	public J9JVMTICompileEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTICompileEventPointer sub(long count) {
		return J9JVMTICompileEventPointer.cast(address - (J9JVMTICompileEvent.SIZEOF * count));
	}

	public J9JVMTICompileEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTICompileEventPointer subOffset(long offset) {
		return J9JVMTICompileEventPointer.cast(address - offset);
	}

	public J9JVMTICompileEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTICompileEventPointer untag(long mask) {
		return J9JVMTICompileEventPointer.cast(address & ~mask);
	}

	public J9JVMTICompileEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTICompileEvent.SIZEOF;
	}

	// Implementation methods

	// const void* code_addr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_code_addrOffset_", declaredType="const void*")
	public VoidPointer code_addr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTICompileEvent._code_addrOffset_));
	}

	// const void* code_addr
	public PointerPointer code_addrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._code_addrOffset_));
	}

	// UDATA code_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_code_sizeOffset_", declaredType="UDATA")
	public UDATA code_size() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTICompileEvent._code_sizeOffset_);
	}

	// UDATA code_size
	public UDATAPointer code_sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._code_sizeOffset_));
	}

	// const void* compile_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compile_infoOffset_", declaredType="const void*")
	public VoidPointer compile_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTICompileEvent._compile_infoOffset_));
	}

	// const void* compile_info
	public PointerPointer compile_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._compile_infoOffset_));
	}

	// UDATA isLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isLoadOffset_", declaredType="UDATA")
	public UDATA isLoad() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTICompileEvent._isLoadOffset_);
	}

	// UDATA isLoad
	public UDATAPointer isLoadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._isLoadOffset_));
	}

	// J9JVMTICompileEvent* linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkNextOffset_", declaredType="J9JVMTICompileEvent*")
	public J9JVMTICompileEventPointer linkNext() throws CorruptDataException {
		return J9JVMTICompileEventPointer.cast(getPointerAtOffset(J9JVMTICompileEvent._linkNextOffset_));
	}

	// J9JVMTICompileEvent* linkNext
	public PointerPointer linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._linkNextOffset_));
	}

	// J9JVMTICompileEvent* linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkPreviousOffset_", declaredType="J9JVMTICompileEvent*")
	public J9JVMTICompileEventPointer linkPrevious() throws CorruptDataException {
		return J9JVMTICompileEventPointer.cast(getPointerAtOffset(J9JVMTICompileEvent._linkPreviousOffset_));
	}

	// J9JVMTICompileEvent* linkPrevious
	public PointerPointer linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._linkPreviousOffset_));
	}

	// jmethodID methodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodIDOffset_", declaredType="jmethodID")
	public _jmethodIDPointer methodID() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9JVMTICompileEvent._methodIDOffset_));
	}

	// jmethodID methodID
	public PointerPointer methodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTICompileEvent._methodIDOffset_));
	}

}
