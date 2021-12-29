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
 * Structure: J9SFJ2IFramePointer
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
 * The generated code will provide getters for all elements in the J9SFJ2IFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SFJ2IFrame.class)
public class J9SFJ2IFramePointer extends StructurePointer {

	// NULL
	public static final J9SFJ2IFramePointer NULL = new J9SFJ2IFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SFJ2IFramePointer(long address) {
		super(address);
	}

	public static J9SFJ2IFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SFJ2IFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SFJ2IFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SFJ2IFramePointer(address);
	}

	public J9SFJ2IFramePointer add(long count) {
		return J9SFJ2IFramePointer.cast(address + (J9SFJ2IFrame.SIZEOF * count));
	}

	public J9SFJ2IFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SFJ2IFramePointer addOffset(long offset) {
		return J9SFJ2IFramePointer.cast(address + offset);
	}

	public J9SFJ2IFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SFJ2IFramePointer sub(long count) {
		return J9SFJ2IFramePointer.cast(address - (J9SFJ2IFrame.SIZEOF * count));
	}

	public J9SFJ2IFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SFJ2IFramePointer subOffset(long offset) {
		return J9SFJ2IFramePointer.cast(address - offset);
	}

	public J9SFJ2IFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SFJ2IFramePointer untag(long mask) {
		return J9SFJ2IFramePointer.cast(address & ~mask);
	}

	public J9SFJ2IFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SFJ2IFrame.SIZEOF;
	}

	// Implementation methods

	// void* exitPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exitPointOffset_", declaredType="void*")
	public VoidPointer exitPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SFJ2IFrame._exitPointOffset_));
	}

	// void* exitPoint
	public PointerPointer exitPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJ2IFrame._exitPointOffset_));
	}

	// J9I2JState i2jState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i2jStateOffset_", declaredType="J9I2JState")
	public J9I2JStatePointer i2jState() throws CorruptDataException {
		return J9I2JStatePointer.cast(nonNullFieldEA(J9SFJ2IFrame._i2jStateOffset_));
	}

	// J9I2JState i2jState
	public PointerPointer i2jStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJ2IFrame._i2jStateOffset_));
	}

	// UDATA jit_r10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r10Offset_", declaredType="UDATA")
	public UDATA jit_r10() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r10Offset_);
	}

	// UDATA jit_r10
	public UDATAPointer jit_r10EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r10Offset_));
	}

	// UDATA jit_r11
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r11Offset_", declaredType="UDATA")
	public UDATA jit_r11() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r11Offset_);
	}

	// UDATA jit_r11
	public UDATAPointer jit_r11EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r11Offset_));
	}

	// UDATA jit_r12
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r12Offset_", declaredType="UDATA")
	public UDATA jit_r12() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r12Offset_);
	}

	// UDATA jit_r12
	public UDATAPointer jit_r12EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r12Offset_));
	}

	// UDATA jit_r13
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r13Offset_", declaredType="UDATA")
	public UDATA jit_r13() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r13Offset_);
	}

	// UDATA jit_r13
	public UDATAPointer jit_r13EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r13Offset_));
	}

	// UDATA jit_r14
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r14Offset_", declaredType="UDATA")
	public UDATA jit_r14() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r14Offset_);
	}

	// UDATA jit_r14
	public UDATAPointer jit_r14EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r14Offset_));
	}

	// UDATA jit_r15
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r15Offset_", declaredType="UDATA")
	public UDATA jit_r15() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r15Offset_);
	}

	// UDATA jit_r15
	public UDATAPointer jit_r15EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r15Offset_));
	}

	// UDATA jit_r9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_r9Offset_", declaredType="UDATA")
	public UDATA jit_r9() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_r9Offset_);
	}

	// UDATA jit_r9
	public UDATAPointer jit_r9EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_r9Offset_));
	}

	// UDATA jit_rbx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jit_rbxOffset_", declaredType="UDATA")
	public UDATA jit_rbx() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._jit_rbxOffset_);
	}

	// UDATA jit_rbx
	public UDATAPointer jit_rbxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._jit_rbxOffset_));
	}

	// UDATA* previousJ2iFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousJ2iFrameOffset_", declaredType="UDATA*")
	public UDATAPointer previousJ2iFrame() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SFJ2IFrame._previousJ2iFrameOffset_));
	}

	// UDATA* previousJ2iFrame
	public PointerPointer previousJ2iFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJ2IFrame._previousJ2iFrameOffset_));
	}

	// U8* returnAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnAddressOffset_", declaredType="U8*")
	public U8Pointer returnAddress() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SFJ2IFrame._returnAddressOffset_));
	}

	// U8* returnAddress
	public PointerPointer returnAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJ2IFrame._returnAddressOffset_));
	}

	// UDATA specialFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialFrameFlagsOffset_", declaredType="UDATA")
	public UDATA specialFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJ2IFrame._specialFrameFlagsOffset_);
	}

	// UDATA specialFrameFlags
	public UDATAPointer specialFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJ2IFrame._specialFrameFlagsOffset_));
	}

	// UDATA* taggedReturnSP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_taggedReturnSPOffset_", declaredType="UDATA*")
	public UDATAPointer taggedReturnSP() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SFJ2IFrame._taggedReturnSPOffset_));
	}

	// UDATA* taggedReturnSP
	public PointerPointer taggedReturnSPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJ2IFrame._taggedReturnSPOffset_));
	}

}
