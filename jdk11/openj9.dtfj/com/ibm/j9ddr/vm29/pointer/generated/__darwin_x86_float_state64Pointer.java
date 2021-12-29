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
 * Structure: __darwin_x86_float_state64Pointer
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
 * The generated code will provide getters for all elements in the __darwin_x86_float_state64Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__darwin_x86_float_state64.class)
public class __darwin_x86_float_state64Pointer extends StructurePointer {

	// NULL
	public static final __darwin_x86_float_state64Pointer NULL = new __darwin_x86_float_state64Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __darwin_x86_float_state64Pointer(long address) {
		super(address);
	}

	public static __darwin_x86_float_state64Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __darwin_x86_float_state64Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __darwin_x86_float_state64Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __darwin_x86_float_state64Pointer(address);
	}

	public __darwin_x86_float_state64Pointer add(long count) {
		return __darwin_x86_float_state64Pointer.cast(address + (__darwin_x86_float_state64.SIZEOF * count));
	}

	public __darwin_x86_float_state64Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public __darwin_x86_float_state64Pointer addOffset(long offset) {
		return __darwin_x86_float_state64Pointer.cast(address + offset);
	}

	public __darwin_x86_float_state64Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __darwin_x86_float_state64Pointer sub(long count) {
		return __darwin_x86_float_state64Pointer.cast(address - (__darwin_x86_float_state64.SIZEOF * count));
	}

	public __darwin_x86_float_state64Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __darwin_x86_float_state64Pointer subOffset(long offset) {
		return __darwin_x86_float_state64Pointer.cast(address - offset);
	}

	public __darwin_x86_float_state64Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __darwin_x86_float_state64Pointer untag(long mask) {
		return __darwin_x86_float_state64Pointer.cast(address & ~mask);
	}

	public __darwin_x86_float_state64Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __darwin_x86_float_state64.SIZEOF;
	}

	// Implementation methods

	// U16 __fpu_cs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_csOffset_", declaredType="U16")
	public U16 __fpu_cs() throws CorruptDataException {
		return new U16(getShortAtOffset(__darwin_x86_float_state64.___fpu_csOffset_));
	}

	// U16 __fpu_cs
	public U16Pointer __fpu_csEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_csOffset_));
	}

	// U32 __fpu_dp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_dpOffset_", declaredType="U32")
	public UDATA __fpu_dp() throws CorruptDataException {
		return new U32(getIntAtOffset(__darwin_x86_float_state64.___fpu_dpOffset_));
	}

	// U32 __fpu_dp
	public UDATAPointer __fpu_dpEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_dpOffset_));
	}

	// U16 __fpu_ds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_dsOffset_", declaredType="U16")
	public U16 __fpu_ds() throws CorruptDataException {
		return new U16(getShortAtOffset(__darwin_x86_float_state64.___fpu_dsOffset_));
	}

	// U16 __fpu_ds
	public U16Pointer __fpu_dsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_dsOffset_));
	}

	// void __fpu_fcw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_fcwOffset_", declaredType="void")
	public VoidPointer __fpu_fcw() throws CorruptDataException {
		return VoidPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_fcwOffset_));
	}

	// void __fpu_fcw
	public PointerPointer __fpu_fcwEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_fcwOffset_));
	}

	// U16 __fpu_fop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_fopOffset_", declaredType="U16")
	public U16 __fpu_fop() throws CorruptDataException {
		return new U16(getShortAtOffset(__darwin_x86_float_state64.___fpu_fopOffset_));
	}

	// U16 __fpu_fop
	public U16Pointer __fpu_fopEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_fopOffset_));
	}

	// void __fpu_fsw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_fswOffset_", declaredType="void")
	public VoidPointer __fpu_fsw() throws CorruptDataException {
		return VoidPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_fswOffset_));
	}

	// void __fpu_fsw
	public PointerPointer __fpu_fswEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_fswOffset_));
	}

	// U8 __fpu_ftw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_ftwOffset_", declaredType="U8")
	public U8 __fpu_ftw() throws CorruptDataException {
		return new U8(getByteAtOffset(__darwin_x86_float_state64.___fpu_ftwOffset_));
	}

	// U8 __fpu_ftw
	public U8Pointer __fpu_ftwEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_ftwOffset_));
	}

	// U32 __fpu_ip
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_ipOffset_", declaredType="U32")
	public UDATA __fpu_ip() throws CorruptDataException {
		return new U32(getIntAtOffset(__darwin_x86_float_state64.___fpu_ipOffset_));
	}

	// U32 __fpu_ip
	public UDATAPointer __fpu_ipEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_ipOffset_));
	}

	// U32 __fpu_mxcsr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_mxcsrOffset_", declaredType="U32")
	public UDATA __fpu_mxcsr() throws CorruptDataException {
		return new U32(getIntAtOffset(__darwin_x86_float_state64.___fpu_mxcsrOffset_));
	}

	// U32 __fpu_mxcsr
	public UDATAPointer __fpu_mxcsrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_mxcsrOffset_));
	}

	// U32 __fpu_mxcsrmask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_mxcsrmaskOffset_", declaredType="U32")
	public UDATA __fpu_mxcsrmask() throws CorruptDataException {
		return new U32(getIntAtOffset(__darwin_x86_float_state64.___fpu_mxcsrmaskOffset_));
	}

	// U32 __fpu_mxcsrmask
	public UDATAPointer __fpu_mxcsrmaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_mxcsrmaskOffset_));
	}

	// I32[] __fpu_reserved
	public IDATAPointer __fpu_reservedEA() throws CorruptDataException {
		return I32Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_reservedOffset_));
	}

	// I32 __fpu_reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_reserved1Offset_", declaredType="I32")
	public IDATA __fpu_reserved1() throws CorruptDataException {
		return new I32(getIntAtOffset(__darwin_x86_float_state64.___fpu_reserved1Offset_));
	}

	// I32 __fpu_reserved1
	public IDATAPointer __fpu_reserved1EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_reserved1Offset_));
	}

	// U8 __fpu_rsrv1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_rsrv1Offset_", declaredType="U8")
	public U8 __fpu_rsrv1() throws CorruptDataException {
		return new U8(getByteAtOffset(__darwin_x86_float_state64.___fpu_rsrv1Offset_));
	}

	// U8 __fpu_rsrv1
	public U8Pointer __fpu_rsrv1EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_rsrv1Offset_));
	}

	// U16 __fpu_rsrv2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_rsrv2Offset_", declaredType="U16")
	public U16 __fpu_rsrv2() throws CorruptDataException {
		return new U16(getShortAtOffset(__darwin_x86_float_state64.___fpu_rsrv2Offset_));
	}

	// U16 __fpu_rsrv2
	public U16Pointer __fpu_rsrv2EA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_rsrv2Offset_));
	}

	// U16 __fpu_rsrv3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_rsrv3Offset_", declaredType="U16")
	public U16 __fpu_rsrv3() throws CorruptDataException {
		return new U16(getShortAtOffset(__darwin_x86_float_state64.___fpu_rsrv3Offset_));
	}

	// U16 __fpu_rsrv3
	public U16Pointer __fpu_rsrv3EA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_rsrv3Offset_));
	}

	// U8[] __fpu_rsrv4
	public U8Pointer __fpu_rsrv4EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_rsrv4Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm0Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm0() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm0Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm0
	public PointerPointer __fpu_stmm0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm0Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm1Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm1() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm1Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm1
	public PointerPointer __fpu_stmm1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm1Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm2Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm2() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm2Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm2
	public PointerPointer __fpu_stmm2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm2Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm3Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm3() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm3Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm3
	public PointerPointer __fpu_stmm3EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm3Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm4Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm4() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm4Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm4
	public PointerPointer __fpu_stmm4EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm4Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm5Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm5() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm5Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm5
	public PointerPointer __fpu_stmm5EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm5Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm6Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm6() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm6Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm6
	public PointerPointer __fpu_stmm6EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm6Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_stmm7Offset_", declaredType="__darwin_mmst_reg")
	public __darwin_mmst_regPointer __fpu_stmm7() throws CorruptDataException {
		return __darwin_mmst_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm7Offset_));
	}

	// __darwin_mmst_reg __fpu_stmm7
	public PointerPointer __fpu_stmm7EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_stmm7Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm0Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm0() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm0Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm0
	public PointerPointer __fpu_xmm0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm0Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm1Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm1() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm1Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm1
	public PointerPointer __fpu_xmm1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm1Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm10Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm10() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm10Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm10
	public PointerPointer __fpu_xmm10EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm10Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm11
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm11Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm11() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm11Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm11
	public PointerPointer __fpu_xmm11EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm11Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm12
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm12Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm12() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm12Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm12
	public PointerPointer __fpu_xmm12EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm12Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm13
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm13Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm13() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm13Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm13
	public PointerPointer __fpu_xmm13EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm13Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm14
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm14Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm14() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm14Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm14
	public PointerPointer __fpu_xmm14EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm14Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm15
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm15Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm15() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm15Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm15
	public PointerPointer __fpu_xmm15EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm15Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm2Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm2() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm2Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm2
	public PointerPointer __fpu_xmm2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm2Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm3Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm3() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm3Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm3
	public PointerPointer __fpu_xmm3EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm3Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm4Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm4() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm4Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm4
	public PointerPointer __fpu_xmm4EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm4Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm5Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm5() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm5Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm5
	public PointerPointer __fpu_xmm5EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm5Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm6Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm6() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm6Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm6
	public PointerPointer __fpu_xmm6EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm6Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm7Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm7() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm7Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm7
	public PointerPointer __fpu_xmm7EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm7Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm8Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm8() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm8Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm8
	public PointerPointer __fpu_xmm8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm8Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___fpu_xmm9Offset_", declaredType="__darwin_xmm_reg")
	public __darwin_xmm_regPointer __fpu_xmm9() throws CorruptDataException {
		return __darwin_xmm_regPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm9Offset_));
	}

	// __darwin_xmm_reg __fpu_xmm9
	public PointerPointer __fpu_xmm9EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_x86_float_state64.___fpu_xmm9Offset_));
	}

}
