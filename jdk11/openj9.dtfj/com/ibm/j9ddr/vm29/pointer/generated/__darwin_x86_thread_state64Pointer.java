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
 * Structure: __darwin_x86_thread_state64Pointer
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
 * The generated code will provide getters for all elements in the __darwin_x86_thread_state64Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__darwin_x86_thread_state64.class)
public class __darwin_x86_thread_state64Pointer extends StructurePointer {

	// NULL
	public static final __darwin_x86_thread_state64Pointer NULL = new __darwin_x86_thread_state64Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __darwin_x86_thread_state64Pointer(long address) {
		super(address);
	}

	public static __darwin_x86_thread_state64Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __darwin_x86_thread_state64Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __darwin_x86_thread_state64Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __darwin_x86_thread_state64Pointer(address);
	}

	public __darwin_x86_thread_state64Pointer add(long count) {
		return __darwin_x86_thread_state64Pointer.cast(address + (__darwin_x86_thread_state64.SIZEOF * count));
	}

	public __darwin_x86_thread_state64Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public __darwin_x86_thread_state64Pointer addOffset(long offset) {
		return __darwin_x86_thread_state64Pointer.cast(address + offset);
	}

	public __darwin_x86_thread_state64Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __darwin_x86_thread_state64Pointer sub(long count) {
		return __darwin_x86_thread_state64Pointer.cast(address - (__darwin_x86_thread_state64.SIZEOF * count));
	}

	public __darwin_x86_thread_state64Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __darwin_x86_thread_state64Pointer subOffset(long offset) {
		return __darwin_x86_thread_state64Pointer.cast(address - offset);
	}

	public __darwin_x86_thread_state64Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __darwin_x86_thread_state64Pointer untag(long mask) {
		return __darwin_x86_thread_state64Pointer.cast(address & ~mask);
	}

	public __darwin_x86_thread_state64Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __darwin_x86_thread_state64.SIZEOF;
	}

	// Implementation methods

	// U64 __cs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___csOffset_", declaredType="U64")
	public UDATA __cs() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___csOffset_));
	}

	// U64 __cs
	public UDATAPointer __csEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___csOffset_));
	}

	// U64 __fs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fsOffset_", declaredType="U64")
	public UDATA __fs() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___fsOffset_));
	}

	// U64 __fs
	public UDATAPointer __fsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___fsOffset_));
	}

	// U64 __gs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___gsOffset_", declaredType="U64")
	public UDATA __gs() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___gsOffset_));
	}

	// U64 __gs
	public UDATAPointer __gsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___gsOffset_));
	}

	// U64 __r10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r10Offset_", declaredType="U64")
	public UDATA __r10() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r10Offset_));
	}

	// U64 __r10
	public UDATAPointer __r10EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r10Offset_));
	}

	// U64 __r11
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r11Offset_", declaredType="U64")
	public UDATA __r11() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r11Offset_));
	}

	// U64 __r11
	public UDATAPointer __r11EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r11Offset_));
	}

	// U64 __r12
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r12Offset_", declaredType="U64")
	public UDATA __r12() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r12Offset_));
	}

	// U64 __r12
	public UDATAPointer __r12EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r12Offset_));
	}

	// U64 __r13
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r13Offset_", declaredType="U64")
	public UDATA __r13() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r13Offset_));
	}

	// U64 __r13
	public UDATAPointer __r13EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r13Offset_));
	}

	// U64 __r14
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r14Offset_", declaredType="U64")
	public UDATA __r14() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r14Offset_));
	}

	// U64 __r14
	public UDATAPointer __r14EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r14Offset_));
	}

	// U64 __r15
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r15Offset_", declaredType="U64")
	public UDATA __r15() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r15Offset_));
	}

	// U64 __r15
	public UDATAPointer __r15EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r15Offset_));
	}

	// U64 __r8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r8Offset_", declaredType="U64")
	public UDATA __r8() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r8Offset_));
	}

	// U64 __r8
	public UDATAPointer __r8EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r8Offset_));
	}

	// U64 __r9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___r9Offset_", declaredType="U64")
	public UDATA __r9() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___r9Offset_));
	}

	// U64 __r9
	public UDATAPointer __r9EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___r9Offset_));
	}

	// U64 __rax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___raxOffset_", declaredType="U64")
	public UDATA __rax() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___raxOffset_));
	}

	// U64 __rax
	public UDATAPointer __raxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___raxOffset_));
	}

	// U64 __rbp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rbpOffset_", declaredType="U64")
	public UDATA __rbp() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rbpOffset_));
	}

	// U64 __rbp
	public UDATAPointer __rbpEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rbpOffset_));
	}

	// U64 __rbx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rbxOffset_", declaredType="U64")
	public UDATA __rbx() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rbxOffset_));
	}

	// U64 __rbx
	public UDATAPointer __rbxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rbxOffset_));
	}

	// U64 __rcx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rcxOffset_", declaredType="U64")
	public UDATA __rcx() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rcxOffset_));
	}

	// U64 __rcx
	public UDATAPointer __rcxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rcxOffset_));
	}

	// U64 __rdi
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rdiOffset_", declaredType="U64")
	public UDATA __rdi() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rdiOffset_));
	}

	// U64 __rdi
	public UDATAPointer __rdiEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rdiOffset_));
	}

	// U64 __rdx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rdxOffset_", declaredType="U64")
	public UDATA __rdx() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rdxOffset_));
	}

	// U64 __rdx
	public UDATAPointer __rdxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rdxOffset_));
	}

	// U64 __rflags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rflagsOffset_", declaredType="U64")
	public UDATA __rflags() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rflagsOffset_));
	}

	// U64 __rflags
	public UDATAPointer __rflagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rflagsOffset_));
	}

	// U64 __rip
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___ripOffset_", declaredType="U64")
	public UDATA __rip() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___ripOffset_));
	}

	// U64 __rip
	public UDATAPointer __ripEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___ripOffset_));
	}

	// U64 __rsi
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rsiOffset_", declaredType="U64")
	public UDATA __rsi() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rsiOffset_));
	}

	// U64 __rsi
	public UDATAPointer __rsiEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rsiOffset_));
	}

	// U64 __rsp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___rspOffset_", declaredType="U64")
	public UDATA __rsp() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_x86_thread_state64.___rspOffset_));
	}

	// U64 __rsp
	public UDATAPointer __rspEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_thread_state64.___rspOffset_));
	}

}
