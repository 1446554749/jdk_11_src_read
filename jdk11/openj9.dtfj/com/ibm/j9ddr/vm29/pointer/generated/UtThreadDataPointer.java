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
 * Structure: UtThreadDataPointer
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
 * The generated code will provide getters for all elements in the UtThreadDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtThreadData.class)
public class UtThreadDataPointer extends StructurePointer {

	// NULL
	public static final UtThreadDataPointer NULL = new UtThreadDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtThreadDataPointer(long address) {
		super(address);
	}

	public static UtThreadDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtThreadDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtThreadDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtThreadDataPointer(address);
	}

	public UtThreadDataPointer add(long count) {
		return UtThreadDataPointer.cast(address + (UtThreadData.SIZEOF * count));
	}

	public UtThreadDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtThreadDataPointer addOffset(long offset) {
		return UtThreadDataPointer.cast(address + offset);
	}

	public UtThreadDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtThreadDataPointer sub(long count) {
		return UtThreadDataPointer.cast(address - (UtThreadData.SIZEOF * count));
	}

	public UtThreadDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtThreadDataPointer subOffset(long offset) {
		return UtThreadDataPointer.cast(address - offset);
	}

	public UtThreadDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtThreadDataPointer untag(long mask) {
		return UtThreadDataPointer.cast(address & ~mask);
	}

	public UtThreadDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtThreadData.SIZEOF;
	}

	// Implementation methods

	// U8 currentOutputMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentOutputMaskOffset_", declaredType="U8")
	public U8 currentOutputMask() throws CorruptDataException {
		return new U8(getByteAtOffset(UtThreadData._currentOutputMaskOffset_));
	}

	// U8 currentOutputMask
	public U8Pointer currentOutputMaskEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(UtThreadData._currentOutputMaskOffset_));
	}

	// void* external
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_externalOffset_", declaredType="void*")
	public VoidPointer external() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtThreadData._externalOffset_));
	}

	// void* external
	public PointerPointer externalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._externalOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtThreadData._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._headerOffset_));
	}

	// const void* id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="const void*")
	public VoidPointer id() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtThreadData._idOffset_));
	}

	// const void* id
	public PointerPointer idEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._idOffset_));
	}

	// I32 indent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indentOffset_", declaredType="I32")
	public IDATA indent() throws CorruptDataException {
		return new I32(getIntAtOffset(UtThreadData._indentOffset_));
	}

	// I32 indent
	public IDATAPointer indentEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtThreadData._indentOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtThreadData._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._nameOffset_));
	}

	// I32 recursion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_recursionOffset_", declaredType="I32")
	public IDATA recursion() throws CorruptDataException {
		return new I32(getIntAtOffset(UtThreadData._recursionOffset_));
	}

	// I32 recursion
	public IDATAPointer recursionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtThreadData._recursionOffset_));
	}

	// I32 suspendResume
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_suspendResumeOffset_", declaredType="I32")
	public IDATA suspendResume() throws CorruptDataException {
		return new I32(getIntAtOffset(UtThreadData._suspendResumeOffset_));
	}

	// I32 suspendResume
	public IDATAPointer suspendResumeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtThreadData._suspendResumeOffset_));
	}

	// const void* synonym1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_synonym1Offset_", declaredType="const void*")
	public VoidPointer synonym1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtThreadData._synonym1Offset_));
	}

	// const void* synonym1
	public PointerPointer synonym1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._synonym1Offset_));
	}

	// const void* synonym2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_synonym2Offset_", declaredType="const void*")
	public VoidPointer synonym2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtThreadData._synonym2Offset_));
	}

	// const void* synonym2
	public PointerPointer synonym2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._synonym2Offset_));
	}

	// UtTraceBuffer* trcBuf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_trcBufOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer trcBuf() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtThreadData._trcBufOffset_));
	}

	// UtTraceBuffer* trcBuf
	public PointerPointer trcBufEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtThreadData._trcBufOffset_));
	}

}
