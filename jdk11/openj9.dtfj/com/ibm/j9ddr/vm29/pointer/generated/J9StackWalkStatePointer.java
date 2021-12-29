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
 * Structure: J9StackWalkStatePointer
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
 * The generated code will provide getters for all elements in the J9StackWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9StackWalkState.class)
public class J9StackWalkStatePointer extends StructurePointer {

	// NULL
	public static final J9StackWalkStatePointer NULL = new J9StackWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9StackWalkStatePointer(long address) {
		super(address);
	}

	public static J9StackWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9StackWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9StackWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9StackWalkStatePointer(address);
	}

	public J9StackWalkStatePointer add(long count) {
		return J9StackWalkStatePointer.cast(address + (J9StackWalkState.SIZEOF * count));
	}

	public J9StackWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9StackWalkStatePointer addOffset(long offset) {
		return J9StackWalkStatePointer.cast(address + offset);
	}

	public J9StackWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9StackWalkStatePointer sub(long count) {
		return J9StackWalkStatePointer.cast(address - (J9StackWalkState.SIZEOF * count));
	}

	public J9StackWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9StackWalkStatePointer subOffset(long offset) {
		return J9StackWalkStatePointer.cast(address - offset);
	}

	public J9StackWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9StackWalkStatePointer untag(long mask) {
		return J9StackWalkStatePointer.cast(address & ~mask);
	}

	public J9StackWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9StackWalkState.SIZEOF;
	}

	// Implementation methods

	// UDATA* arg0EA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arg0EAOffset_", declaredType="UDATA*")
	public UDATAPointer arg0EA() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._arg0EAOffset_));
	}

	// UDATA* arg0EA
	public PointerPointer arg0EAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._arg0EAOffset_));
	}

	// UDATA argCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_argCountOffset_", declaredType="UDATA")
	public UDATA argCount() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._argCountOffset_);
	}

	// UDATA argCount
	public UDATAPointer argCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._argCountOffset_));
	}

	// UDATA* bp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bpOffset_", declaredType="UDATA*")
	public UDATAPointer bp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._bpOffset_));
	}

	// UDATA* bp
	public PointerPointer bpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._bpOffset_));
	}

	// IDATA bytecodePCOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodePCOffsetOffset_", declaredType="IDATA")
	public IDATA bytecodePCOffset() throws CorruptDataException {
		return getIDATAAtOffset(J9StackWalkState._bytecodePCOffsetOffset_);
	}

	// IDATA bytecodePCOffset
	public IDATAPointer bytecodePCOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9StackWalkState._bytecodePCOffsetOffset_));
	}

	// UDATA* cache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheOffset_", declaredType="UDATA*")
	public UDATAPointer cache() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._cacheOffset_));
	}

	// UDATA* cache
	public PointerPointer cacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._cacheOffset_));
	}

	// UDATA* cacheCursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheCursorOffset_", declaredType="UDATA*")
	public UDATAPointer cacheCursor() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._cacheCursorOffset_));
	}

	// UDATA* cacheCursor
	public PointerPointer cacheCursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._cacheCursorOffset_));
	}

	// J9ConstantPool* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="J9ConstantPool*")
	public J9ConstantPoolPointer constantPool() throws CorruptDataException {
		return J9ConstantPoolPointer.cast(getPointerAtOffset(J9StackWalkState._constantPoolOffset_));
	}

	// J9ConstantPool* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._constantPoolOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9StackWalkState._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._currentThreadOffset_));
	}

	// J9JITDecompilationInfo* decompilationRecord
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompilationRecordOffset_", declaredType="J9JITDecompilationInfo*")
	public J9JITDecompilationInfoPointer decompilationRecord() throws CorruptDataException {
		return J9JITDecompilationInfoPointer.cast(getPointerAtOffset(J9StackWalkState._decompilationRecordOffset_));
	}

	// J9JITDecompilationInfo* decompilationRecord
	public PointerPointer decompilationRecordEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._decompilationRecordOffset_));
	}

	// J9JITDecompilationInfo* decompilationStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompilationStackOffset_", declaredType="J9JITDecompilationInfo*")
	public J9JITDecompilationInfoPointer decompilationStack() throws CorruptDataException {
		return J9JITDecompilationInfoPointer.cast(getPointerAtOffset(J9StackWalkState._decompilationStackOffset_));
	}

	// J9JITDecompilationInfo* decompilationStack
	public PointerPointer decompilationStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._decompilationStackOffset_));
	}

	// void* dropToCurrentFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dropToCurrentFrameOffset_", declaredType="void*")
	public VoidPointer dropToCurrentFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._dropToCurrentFrameOffset_));
	}

	// void* dropToCurrentFrame
	public PointerPointer dropToCurrentFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._dropToCurrentFrameOffset_));
	}

	// UDATA elsBitVector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elsBitVectorOffset_", declaredType="UDATA")
	public UDATA elsBitVector() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._elsBitVectorOffset_);
	}

	// UDATA elsBitVector
	public UDATAPointer elsBitVectorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._elsBitVectorOffset_));
	}

	// UDATA errorMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorModeOffset_", declaredType="UDATA")
	public UDATA errorMode() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._errorModeOffset_);
	}

	// UDATA errorMode
	public UDATAPointer errorModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._errorModeOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._flagsOffset_));
	}

	// UDATA frameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameFlagsOffset_", declaredType="UDATA")
	public UDATA frameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._frameFlagsOffset_);
	}

	// UDATA frameFlags
	public UDATAPointer frameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._frameFlagsOffset_));
	}

	// void* frameWalkFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameWalkFunctionOffset_", declaredType="void*")
	public VoidPointer frameWalkFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._frameWalkFunctionOffset_));
	}

	// void* frameWalkFunction
	public PointerPointer frameWalkFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._frameWalkFunctionOffset_));
	}

	// UDATA framesWalked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_framesWalkedOffset_", declaredType="UDATA")
	public UDATA framesWalked() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._framesWalkedOffset_);
	}

	// UDATA framesWalked
	public UDATAPointer framesWalkedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._framesWalkedOffset_));
	}

	// J9I2JState* i2jState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i2jStateOffset_", declaredType="J9I2JState*")
	public J9I2JStatePointer i2jState() throws CorruptDataException {
		return J9I2JStatePointer.cast(getPointerAtOffset(J9StackWalkState._i2jStateOffset_));
	}

	// J9I2JState* i2jState
	public PointerPointer i2jStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._i2jStateOffset_));
	}

	// UDATA inlineDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlineDepthOffset_", declaredType="UDATA")
	public UDATA inlineDepth() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._inlineDepthOffset_);
	}

	// UDATA inlineDepth
	public UDATAPointer inlineDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._inlineDepthOffset_));
	}

	// void* inlineMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlineMapOffset_", declaredType="void*")
	public VoidPointer inlineMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._inlineMapOffset_));
	}

	// void* inlineMap
	public PointerPointer inlineMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._inlineMapOffset_));
	}

	// void* inlinedCallSite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlinedCallSiteOffset_", declaredType="void*")
	public VoidPointer inlinedCallSite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._inlinedCallSiteOffset_));
	}

	// void* inlinedCallSite
	public PointerPointer inlinedCallSiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._inlinedCallSiteOffset_));
	}

	// void* inlinerMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlinerMapOffset_", declaredType="void*")
	public VoidPointer inlinerMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._inlinerMapOffset_));
	}

	// void* inlinerMap
	public PointerPointer inlinerMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._inlinerMapOffset_));
	}

	// UDATA* j2iFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2iFrameOffset_", declaredType="UDATA*")
	public UDATAPointer j2iFrame() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._j2iFrameOffset_));
	}

	// UDATA* j2iFrame
	public PointerPointer j2iFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._j2iFrameOffset_));
	}

	// J9JITExceptionTable* jitInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitInfoOffset_", declaredType="J9JITExceptionTable*")
	public J9JITExceptionTablePointer jitInfo() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(J9StackWalkState._jitInfoOffset_));
	}

	// J9JITExceptionTable* jitInfo
	public PointerPointer jitInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._jitInfoOffset_));
	}

	// void* linearSlotWalker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linearSlotWalkerOffset_", declaredType="void*")
	public VoidPointer linearSlotWalker() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._linearSlotWalkerOffset_));
	}

	// void* linearSlotWalker
	public PointerPointer linearSlotWalkerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._linearSlotWalkerOffset_));
	}

	// J9Method* literals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_literalsOffset_", declaredType="J9Method*")
	public J9MethodPointer literals() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9StackWalkState._literalsOffset_));
	}

	// J9Method* literals
	public PointerPointer literalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._literalsOffset_));
	}

	// UDATA maxFrames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxFramesOffset_", declaredType="UDATA")
	public UDATA maxFrames() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._maxFramesOffset_);
	}

	// UDATA maxFrames
	public UDATAPointer maxFramesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._maxFramesOffset_));
	}

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9StackWalkState._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._methodOffset_));
	}

	// U8* nextPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextPCOffset_", declaredType="U8*")
	public U8Pointer nextPC() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9StackWalkState._nextPCOffset_));
	}

	// U8* nextPC
	public PointerPointer nextPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._nextPCOffset_));
	}

	// U8* objectSlotBitVector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectSlotBitVectorOffset_", declaredType="U8*")
	public U8Pointer objectSlotBitVector() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9StackWalkState._objectSlotBitVectorOffset_));
	}

	// U8* objectSlotBitVector
	public PointerPointer objectSlotBitVectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._objectSlotBitVectorOffset_));
	}

	// void* objectSlotWalkFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectSlotWalkFunctionOffset_", declaredType="void*")
	public VoidPointer objectSlotWalkFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._objectSlotWalkFunctionOffset_));
	}

	// void* objectSlotWalkFunction
	public PointerPointer objectSlotWalkFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._objectSlotWalkFunctionOffset_));
	}

	// UDATA outgoingArgCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_outgoingArgCountOffset_", declaredType="UDATA")
	public UDATA outgoingArgCount() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._outgoingArgCountOffset_);
	}

	// UDATA outgoingArgCount
	public UDATAPointer outgoingArgCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._outgoingArgCountOffset_));
	}

	// U8* pc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pcOffset_", declaredType="U8*")
	public U8Pointer pc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9StackWalkState._pcOffset_));
	}

	// U8* pc
	public PointerPointer pcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._pcOffset_));
	}

	// void** pcAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pcAddressOffset_", declaredType="void**")
	public PointerPointer pcAddress() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9StackWalkState._pcAddressOffset_));
	}

	// void** pcAddress
	public PointerPointer pcAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._pcAddressOffset_));
	}

	// J9StackWalkState* previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousOffset_", declaredType="J9StackWalkState*")
	public J9StackWalkStatePointer previous() throws CorruptDataException {
		return J9StackWalkStatePointer.cast(getPointerAtOffset(J9StackWalkState._previousOffset_));
	}

	// J9StackWalkState* previous
	public PointerPointer previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._previousOffset_));
	}

	// UDATA previousFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousFrameFlagsOffset_", declaredType="UDATA")
	public UDATA previousFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._previousFrameFlagsOffset_);
	}

	// UDATA previousFrameFlags
	public UDATAPointer previousFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._previousFrameFlagsOffset_));
	}

	// J9WalkStackFramesAndSlotsStorage registerEAs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_registerEAsOffset_", declaredType="J9WalkStackFramesAndSlotsStorage")
	public J9WalkStackFramesAndSlotsStoragePointer registerEAs() throws CorruptDataException {
		return J9WalkStackFramesAndSlotsStoragePointer.cast(nonNullFieldEA(J9StackWalkState._registerEAsOffset_));
	}

	// J9WalkStackFramesAndSlotsStorage registerEAs
	public PointerPointer registerEAsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._registerEAsOffset_));
	}

	// UDATA resolveFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resolveFrameFlagsOffset_", declaredType="UDATA")
	public UDATA resolveFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._resolveFrameFlagsOffset_);
	}

	// UDATA resolveFrameFlags
	public UDATAPointer resolveFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._resolveFrameFlagsOffset_));
	}

	// void* restartException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_restartExceptionOffset_", declaredType="void*")
	public VoidPointer restartException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._restartExceptionOffset_));
	}

	// void* restartException
	public PointerPointer restartExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._restartExceptionOffset_));
	}

	// void* restartPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_restartPointOffset_", declaredType="void*")
	public VoidPointer restartPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._restartPointOffset_));
	}

	// void* restartPoint
	public PointerPointer restartPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._restartPointOffset_));
	}

	// void* returnAddressWalkFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnAddressWalkFunctionOffset_", declaredType="void*")
	public VoidPointer returnAddressWalkFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._returnAddressWalkFunctionOffset_));
	}

	// void* returnAddressWalkFunction
	public PointerPointer returnAddressWalkFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._returnAddressWalkFunctionOffset_));
	}

	// void* savedObjectSlotWalkFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedObjectSlotWalkFunctionOffset_", declaredType="void*")
	public VoidPointer savedObjectSlotWalkFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._savedObjectSlotWalkFunctionOffset_));
	}

	// void* savedObjectSlotWalkFunction
	public PointerPointer savedObjectSlotWalkFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._savedObjectSlotWalkFunctionOffset_));
	}

	// UDATA skipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_skipCountOffset_", declaredType="UDATA")
	public UDATA skipCount() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._skipCountOffset_);
	}

	// UDATA skipCount
	public UDATAPointer skipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._skipCountOffset_));
	}

	// IDATA slotIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotIndexOffset_", declaredType="IDATA")
	public IDATA slotIndex() throws CorruptDataException {
		return getIDATAAtOffset(J9StackWalkState._slotIndexOffset_);
	}

	// IDATA slotIndex
	public IDATAPointer slotIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9StackWalkState._slotIndexOffset_));
	}

	// UDATA slotType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotTypeOffset_", declaredType="UDATA")
	public UDATA slotType() throws CorruptDataException {
		return getUDATAAtOffset(J9StackWalkState._slotTypeOffset_);
	}

	// UDATA slotType
	public UDATAPointer slotTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9StackWalkState._slotTypeOffset_));
	}

	// UDATA* sp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spOffset_", declaredType="UDATA*")
	public UDATAPointer sp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._spOffset_));
	}

	// UDATA* sp
	public PointerPointer spEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._spOffset_));
	}

	// void* stackMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapOffset_", declaredType="void*")
	public VoidPointer stackMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._stackMapOffset_));
	}

	// void* stackMap
	public PointerPointer stackMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._stackMapOffset_));
	}

	// UDATA* unwindSP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwindSPOffset_", declaredType="UDATA*")
	public UDATAPointer unwindSP() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._unwindSPOffset_));
	}

	// UDATA* unwindSP
	public PointerPointer unwindSPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._unwindSPOffset_));
	}

	// void* userData1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData1Offset_", declaredType="void*")
	public VoidPointer userData1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._userData1Offset_));
	}

	// void* userData1
	public PointerPointer userData1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._userData1Offset_));
	}

	// void* userData2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData2Offset_", declaredType="void*")
	public VoidPointer userData2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._userData2Offset_));
	}

	// void* userData2
	public PointerPointer userData2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._userData2Offset_));
	}

	// void* userData3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData3Offset_", declaredType="void*")
	public VoidPointer userData3() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._userData3Offset_));
	}

	// void* userData3
	public PointerPointer userData3EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._userData3Offset_));
	}

	// void* userData4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData4Offset_", declaredType="void*")
	public VoidPointer userData4() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9StackWalkState._userData4Offset_));
	}

	// void* userData4
	public PointerPointer userData4EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._userData4Offset_));
	}

	// UDATA* walkSP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkSPOffset_", declaredType="UDATA*")
	public UDATAPointer walkSP() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9StackWalkState._walkSPOffset_));
	}

	// UDATA* walkSP
	public PointerPointer walkSPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._walkSPOffset_));
	}

	// J9VMThread* walkThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer walkThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9StackWalkState._walkThreadOffset_));
	}

	// J9VMThread* walkThread
	public PointerPointer walkThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._walkThreadOffset_));
	}

	// J9VMEntryLocalStorage* walkedEntryLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkedEntryLocalStorageOffset_", declaredType="J9VMEntryLocalStorage*")
	public J9VMEntryLocalStoragePointer walkedEntryLocalStorage() throws CorruptDataException {
		return J9VMEntryLocalStoragePointer.cast(getPointerAtOffset(J9StackWalkState._walkedEntryLocalStorageOffset_));
	}

	// J9VMEntryLocalStorage* walkedEntryLocalStorage
	public PointerPointer walkedEntryLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9StackWalkState._walkedEntryLocalStorageOffset_));
	}

}
