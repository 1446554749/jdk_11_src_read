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
 * Structure: J9WalkStackFramesAndSlotsStoragePointer
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
 * The generated code will provide getters for all elements in the J9WalkStackFramesAndSlotsStoragePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9WalkStackFramesAndSlotsStorage.class)
public class J9WalkStackFramesAndSlotsStoragePointer extends StructurePointer {

	// NULL
	public static final J9WalkStackFramesAndSlotsStoragePointer NULL = new J9WalkStackFramesAndSlotsStoragePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9WalkStackFramesAndSlotsStoragePointer(long address) {
		super(address);
	}

	public static J9WalkStackFramesAndSlotsStoragePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9WalkStackFramesAndSlotsStoragePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9WalkStackFramesAndSlotsStoragePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9WalkStackFramesAndSlotsStoragePointer(address);
	}

	public J9WalkStackFramesAndSlotsStoragePointer add(long count) {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(address + (J9WalkStackFramesAndSlotsStorage.SIZEOF * count));
	}

	public J9WalkStackFramesAndSlotsStoragePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9WalkStackFramesAndSlotsStoragePointer addOffset(long offset) {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(address + offset);
	}

	public J9WalkStackFramesAndSlotsStoragePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9WalkStackFramesAndSlotsStoragePointer sub(long count) {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(address - (J9WalkStackFramesAndSlotsStorage.SIZEOF * count));
	}

	public J9WalkStackFramesAndSlotsStoragePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9WalkStackFramesAndSlotsStoragePointer subOffset(long offset) {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(address - offset);
	}

	public J9WalkStackFramesAndSlotsStoragePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9WalkStackFramesAndSlotsStoragePointer untag(long mask) {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(address & ~mask);
	}

	public J9WalkStackFramesAndSlotsStoragePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9WalkStackFramesAndSlotsStorage.SIZEOF;
	}

	// Implementation methods

	// UDATA* jit_r10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r10Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r10() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r10Offset_));
	}

	// UDATA* jit_r10
	public PointerPointer jit_r10EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r10Offset_));
	}

	// UDATA* jit_r11
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r11Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r11() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r11Offset_));
	}

	// UDATA* jit_r11
	public PointerPointer jit_r11EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r11Offset_));
	}

	// UDATA* jit_r12
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r12Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r12() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r12Offset_));
	}

	// UDATA* jit_r12
	public PointerPointer jit_r12EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r12Offset_));
	}

	// UDATA* jit_r13
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r13Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r13() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r13Offset_));
	}

	// UDATA* jit_r13
	public PointerPointer jit_r13EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r13Offset_));
	}

	// UDATA* jit_r14
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r14Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r14() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r14Offset_));
	}

	// UDATA* jit_r14
	public PointerPointer jit_r14EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r14Offset_));
	}

	// UDATA* jit_r15
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r15Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r15() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r15Offset_));
	}

	// UDATA* jit_r15
	public PointerPointer jit_r15EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r15Offset_));
	}

	// UDATA* jit_r8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r8Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r8() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r8Offset_));
	}

	// UDATA* jit_r8
	public PointerPointer jit_r8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r8Offset_));
	}

	// UDATA* jit_r9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r9Offset_", declaredType="UDATA*")
	public UDATAPointer jit_r9() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_r9Offset_));
	}

	// UDATA* jit_r9
	public PointerPointer jit_r9EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_r9Offset_));
	}

	// UDATA* jit_rax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_raxOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rax() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_raxOffset_));
	}

	// UDATA* jit_rax
	public PointerPointer jit_raxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_raxOffset_));
	}

	// UDATA* jit_rbp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rbpOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rbp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rbpOffset_));
	}

	// UDATA* jit_rbp
	public PointerPointer jit_rbpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rbpOffset_));
	}

	// UDATA* jit_rbx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rbxOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rbx() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rbxOffset_));
	}

	// UDATA* jit_rbx
	public PointerPointer jit_rbxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rbxOffset_));
	}

	// UDATA* jit_rcx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rcxOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rcx() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rcxOffset_));
	}

	// UDATA* jit_rcx
	public PointerPointer jit_rcxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rcxOffset_));
	}

	// UDATA* jit_rdi
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rdiOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rdi() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rdiOffset_));
	}

	// UDATA* jit_rdi
	public PointerPointer jit_rdiEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rdiOffset_));
	}

	// UDATA* jit_rdx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rdxOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rdx() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rdxOffset_));
	}

	// UDATA* jit_rdx
	public PointerPointer jit_rdxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rdxOffset_));
	}

	// UDATA* jit_rsi
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rsiOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rsi() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rsiOffset_));
	}

	// UDATA* jit_rsi
	public PointerPointer jit_rsiEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rsiOffset_));
	}

	// UDATA* jit_rsp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rspOffset_", declaredType="UDATA*")
	public UDATAPointer jit_rsp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9WalkStackFramesAndSlotsStorage._jit_rspOffset_));
	}

	// UDATA* jit_rsp
	public PointerPointer jit_rspEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9WalkStackFramesAndSlotsStorage._jit_rspOffset_));
	}

}
