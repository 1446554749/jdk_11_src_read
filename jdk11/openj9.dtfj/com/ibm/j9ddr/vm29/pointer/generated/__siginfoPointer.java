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
 * Structure: __siginfoPointer
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
 * The generated code will provide getters for all elements in the __siginfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__siginfo.class)
public class __siginfoPointer extends StructurePointer {

	// NULL
	public static final __siginfoPointer NULL = new __siginfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __siginfoPointer(long address) {
		super(address);
	}

	public static __siginfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __siginfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __siginfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __siginfoPointer(address);
	}

	public __siginfoPointer add(long count) {
		return __siginfoPointer.cast(address + (__siginfo.SIZEOF * count));
	}

	public __siginfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __siginfoPointer addOffset(long offset) {
		return __siginfoPointer.cast(address + offset);
	}

	public __siginfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __siginfoPointer sub(long count) {
		return __siginfoPointer.cast(address - (__siginfo.SIZEOF * count));
	}

	public __siginfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __siginfoPointer subOffset(long offset) {
		return __siginfoPointer.cast(address - offset);
	}

	public __siginfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __siginfoPointer untag(long mask) {
		return __siginfoPointer.cast(address & ~mask);
	}

	public __siginfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __siginfo.SIZEOF;
	}

	// Implementation methods

	// U64[] __pad
	public UDATAPointer __padEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(__siginfo.___padOffset_));
	}

	// void* si_addr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_addrOffset_", declaredType="void*")
	public VoidPointer si_addr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__siginfo._si_addrOffset_));
	}

	// void* si_addr
	public PointerPointer si_addrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__siginfo._si_addrOffset_));
	}

	// I64 si_band
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_bandOffset_", declaredType="I64")
	public IDATA si_band() throws CorruptDataException {
		return new I64(getLongAtOffset(__siginfo._si_bandOffset_));
	}

	// I64 si_band
	public IDATAPointer si_bandEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_bandOffset_));
	}

	// I32 si_code
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_codeOffset_", declaredType="I32")
	public IDATA si_code() throws CorruptDataException {
		return new I32(getIntAtOffset(__siginfo._si_codeOffset_));
	}

	// I32 si_code
	public IDATAPointer si_codeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_codeOffset_));
	}

	// I32 si_errno
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_errnoOffset_", declaredType="I32")
	public IDATA si_errno() throws CorruptDataException {
		return new I32(getIntAtOffset(__siginfo._si_errnoOffset_));
	}

	// I32 si_errno
	public IDATAPointer si_errnoEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_errnoOffset_));
	}

	// pid_t si_pid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_pidOffset_", declaredType="pid_t")
	public IDATA si_pid() throws CorruptDataException {
		return new I32(getIntAtOffset(__siginfo._si_pidOffset_));
	}

	// pid_t si_pid
	public IDATAPointer si_pidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_pidOffset_));
	}

	// I32 si_signo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_signoOffset_", declaredType="I32")
	public IDATA si_signo() throws CorruptDataException {
		return new I32(getIntAtOffset(__siginfo._si_signoOffset_));
	}

	// I32 si_signo
	public IDATAPointer si_signoEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_signoOffset_));
	}

	// I32 si_status
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_statusOffset_", declaredType="I32")
	public IDATA si_status() throws CorruptDataException {
		return new I32(getIntAtOffset(__siginfo._si_statusOffset_));
	}

	// I32 si_status
	public IDATAPointer si_statusEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__siginfo._si_statusOffset_));
	}

	// uid_t si_uid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_uidOffset_", declaredType="uid_t")
	public UDATA si_uid() throws CorruptDataException {
		return new U32(getIntAtOffset(__siginfo._si_uidOffset_));
	}

	// uid_t si_uid
	public UDATAPointer si_uidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__siginfo._si_uidOffset_));
	}

	// sigval si_value
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_valueOffset_", declaredType="sigval")
	public sigvalPointer si_value() throws CorruptDataException {
		return sigvalPointer.cast(nonNullFieldEA(__siginfo._si_valueOffset_));
	}

	// sigval si_value
	public PointerPointer si_valueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__siginfo._si_valueOffset_));
	}

}
