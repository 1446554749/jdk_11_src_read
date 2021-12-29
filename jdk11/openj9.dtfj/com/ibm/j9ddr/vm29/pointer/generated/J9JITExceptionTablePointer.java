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
 * Structure: J9JITExceptionTablePointer
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
 * The generated code will provide getters for all elements in the J9JITExceptionTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITExceptionTable.class)
public class J9JITExceptionTablePointer extends StructurePointer {

	// NULL
	public static final J9JITExceptionTablePointer NULL = new J9JITExceptionTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITExceptionTablePointer(long address) {
		super(address);
	}

	public static J9JITExceptionTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITExceptionTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITExceptionTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITExceptionTablePointer(address);
	}

	public J9JITExceptionTablePointer add(long count) {
		return J9JITExceptionTablePointer.cast(address + (J9JITExceptionTable.SIZEOF * count));
	}

	public J9JITExceptionTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITExceptionTablePointer addOffset(long offset) {
		return J9JITExceptionTablePointer.cast(address + offset);
	}

	public J9JITExceptionTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITExceptionTablePointer sub(long count) {
		return J9JITExceptionTablePointer.cast(address - (J9JITExceptionTable.SIZEOF * count));
	}

	public J9JITExceptionTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITExceptionTablePointer subOffset(long offset) {
		return J9JITExceptionTablePointer.cast(address - offset);
	}

	public J9JITExceptionTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITExceptionTablePointer untag(long mask) {
		return J9JITExceptionTablePointer.cast(address & ~mask);
	}

	public J9JITExceptionTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITExceptionTable.SIZEOF;
	}

	// Implementation methods

	// void* bodyInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bodyInfoOffset_", declaredType="void*")
	public VoidPointer bodyInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._bodyInfoOffset_));
	}

	// void* bodyInfo
	public PointerPointer bodyInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._bodyInfoOffset_));
	}

	// J9UTF8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer className() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9JITExceptionTable._classNameOffset_));
	}

	// J9UTF8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._classNameOffset_));
	}

	// UDATA codeCacheAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheAllocOffset_", declaredType="UDATA")
	public UDATA codeCacheAlloc() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._codeCacheAllocOffset_);
	}

	// UDATA codeCacheAlloc
	public UDATAPointer codeCacheAllocEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._codeCacheAllocOffset_));
	}

	// J9ConstantPool* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="J9ConstantPool*")
	public J9ConstantPoolPointer constantPool() throws CorruptDataException {
		return J9ConstantPoolPointer.cast(getPointerAtOffset(J9JITExceptionTable._constantPoolOffset_));
	}

	// J9ConstantPool* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._constantPoolOffset_));
	}

	// void* debugSlot1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugSlot1Offset_", declaredType="void*")
	public VoidPointer debugSlot1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._debugSlot1Offset_));
	}

	// void* debugSlot1
	public PointerPointer debugSlot1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._debugSlot1Offset_));
	}

	// void* debugSlot2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugSlot2Offset_", declaredType="void*")
	public VoidPointer debugSlot2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._debugSlot2Offset_));
	}

	// void* debugSlot2
	public PointerPointer debugSlot2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._debugSlot2Offset_));
	}

	// UDATA endPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endPCOffset_", declaredType="UDATA")
	public UDATA endPC() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._endPCOffset_);
	}

	// UDATA endPC
	public UDATAPointer endPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._endPCOffset_));
	}

	// UDATA endWarmPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endWarmPCOffset_", declaredType="UDATA")
	public UDATA endWarmPC() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._endWarmPCOffset_);
	}

	// UDATA endWarmPC
	public UDATAPointer endWarmPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._endWarmPCOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._flagsOffset_));
	}

	// void* gcStackAtlas
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcStackAtlasOffset_", declaredType="void*")
	public VoidPointer gcStackAtlas() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._gcStackAtlasOffset_));
	}

	// void* gcStackAtlas
	public PointerPointer gcStackAtlasEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._gcStackAtlasOffset_));
	}

	// void* gpuCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpuCodeOffset_", declaredType="void*")
	public VoidPointer gpuCode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._gpuCodeOffset_));
	}

	// void* gpuCode
	public PointerPointer gpuCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._gpuCodeOffset_));
	}

	// I32 hotness
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotnessOffset_", declaredType="I32")
	public IDATA hotness() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITExceptionTable._hotnessOffset_));
	}

	// I32 hotness
	public IDATAPointer hotnessEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._hotnessOffset_));
	}

	// void* inlinedCalls
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlinedCallsOffset_", declaredType="void*")
	public VoidPointer inlinedCalls() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._inlinedCallsOffset_));
	}

	// void* inlinedCalls
	public PointerPointer inlinedCallsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._inlinedCallsOffset_));
	}

	// J9UTF8* methodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer methodName() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9JITExceptionTable._methodNameOffset_));
	}

	// J9UTF8* methodName
	public PointerPointer methodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._methodNameOffset_));
	}

	// J9UTF8* methodSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSignatureOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer methodSignature() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9JITExceptionTable._methodSignatureOffset_));
	}

	// J9UTF8* methodSignature
	public PointerPointer methodSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._methodSignatureOffset_));
	}

	// J9JITExceptionTable* nextMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextMethodOffset_", declaredType="J9JITExceptionTable*")
	public J9JITExceptionTablePointer nextMethod() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(J9JITExceptionTable._nextMethodOffset_));
	}

	// J9JITExceptionTable* nextMethod
	public PointerPointer nextMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._nextMethodOffset_));
	}

	// U16 numExcptionRanges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numExcptionRangesOffset_", declaredType="U16")
	public U16 numExcptionRanges() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITExceptionTable._numExcptionRangesOffset_));
	}

	// U16 numExcptionRanges
	public U16Pointer numExcptionRangesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._numExcptionRangesOffset_));
	}

	// I16 objectTempSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectTempSlotsOffset_", declaredType="I16")
	public I16 objectTempSlots() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITExceptionTable._objectTempSlotsOffset_));
	}

	// I16 objectTempSlots
	public I16Pointer objectTempSlotsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._objectTempSlotsOffset_));
	}

	// void* osrInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrInfoOffset_", declaredType="void*")
	public VoidPointer osrInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._osrInfoOffset_));
	}

	// void* osrInfo
	public PointerPointer osrInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._osrInfoOffset_));
	}

	// J9JITExceptionTable* prevMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevMethodOffset_", declaredType="J9JITExceptionTable*")
	public J9JITExceptionTablePointer prevMethod() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(J9JITExceptionTable._prevMethodOffset_));
	}

	// J9JITExceptionTable* prevMethod
	public PointerPointer prevMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._prevMethodOffset_));
	}

	// U16 prologuePushes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prologuePushesOffset_", declaredType="U16")
	public U16 prologuePushes() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITExceptionTable._prologuePushesOffset_));
	}

	// U16 prologuePushes
	public U16Pointer prologuePushesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._prologuePushesOffset_));
	}

	// J9Method* ramMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramMethodOffset_", declaredType="J9Method*")
	public J9MethodPointer ramMethod() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JITExceptionTable._ramMethodOffset_));
	}

	// J9Method* ramMethod
	public PointerPointer ramMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._ramMethodOffset_));
	}

	// UDATA registerSaveDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerSaveDescriptionOffset_", declaredType="UDATA")
	public UDATA registerSaveDescription() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._registerSaveDescriptionOffset_);
	}

	// UDATA registerSaveDescription
	public UDATAPointer registerSaveDescriptionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._registerSaveDescriptionOffset_));
	}

	// void* riData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_riDataOffset_", declaredType="void*")
	public VoidPointer riData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._riDataOffset_));
	}

	// void* riData
	public PointerPointer riDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._riDataOffset_));
	}

	// void* runtimeAssumptionList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeAssumptionListOffset_", declaredType="void*")
	public VoidPointer runtimeAssumptionList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITExceptionTable._runtimeAssumptionListOffset_));
	}

	// void* runtimeAssumptionList
	public PointerPointer runtimeAssumptionListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITExceptionTable._runtimeAssumptionListOffset_));
	}

	// I16 scalarTempSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scalarTempSlotsOffset_", declaredType="I16")
	public I16 scalarTempSlots() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITExceptionTable._scalarTempSlotsOffset_));
	}

	// I16 scalarTempSlots
	public I16Pointer scalarTempSlotsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._scalarTempSlotsOffset_));
	}

	// I32 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="I32")
	public IDATA size() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITExceptionTable._sizeOffset_));
	}

	// I32 size
	public IDATAPointer sizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._sizeOffset_));
	}

	// I16 slots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotsOffset_", declaredType="I16")
	public I16 slots() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITExceptionTable._slotsOffset_));
	}

	// I16 slots
	public I16Pointer slotsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._slotsOffset_));
	}

	// UDATA startColdPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startColdPCOffset_", declaredType="UDATA")
	public UDATA startColdPC() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._startColdPCOffset_);
	}

	// UDATA startColdPC
	public UDATAPointer startColdPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._startColdPCOffset_));
	}

	// UDATA startPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPCOffset_", declaredType="UDATA")
	public UDATA startPC() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._startPCOffset_);
	}

	// UDATA startPC
	public UDATAPointer startPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._startPCOffset_));
	}

	// I16 tempOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tempOffsetOffset_", declaredType="I16")
	public I16 tempOffset() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITExceptionTable._tempOffsetOffset_));
	}

	// I16 tempOffset
	public I16Pointer tempOffsetEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITExceptionTable._tempOffsetOffset_));
	}

	// UDATA totalFrameSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalFrameSizeOffset_", declaredType="UDATA")
	public UDATA totalFrameSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITExceptionTable._totalFrameSizeOffset_);
	}

	// UDATA totalFrameSize
	public UDATAPointer totalFrameSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITExceptionTable._totalFrameSizeOffset_));
	}

}
