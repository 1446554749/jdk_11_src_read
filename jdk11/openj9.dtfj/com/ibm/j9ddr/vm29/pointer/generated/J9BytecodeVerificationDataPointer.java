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
 * Structure: J9BytecodeVerificationDataPointer
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
 * The generated code will provide getters for all elements in the J9BytecodeVerificationDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9BytecodeVerificationData.class)
public class J9BytecodeVerificationDataPointer extends StructurePointer {

	// NULL
	public static final J9BytecodeVerificationDataPointer NULL = new J9BytecodeVerificationDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9BytecodeVerificationDataPointer(long address) {
		super(address);
	}

	public static J9BytecodeVerificationDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9BytecodeVerificationDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9BytecodeVerificationDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9BytecodeVerificationDataPointer(address);
	}

	public J9BytecodeVerificationDataPointer add(long count) {
		return J9BytecodeVerificationDataPointer.cast(address + (J9BytecodeVerificationData.SIZEOF * count));
	}

	public J9BytecodeVerificationDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9BytecodeVerificationDataPointer addOffset(long offset) {
		return J9BytecodeVerificationDataPointer.cast(address + offset);
	}

	public J9BytecodeVerificationDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9BytecodeVerificationDataPointer sub(long count) {
		return J9BytecodeVerificationDataPointer.cast(address - (J9BytecodeVerificationData.SIZEOF * count));
	}

	public J9BytecodeVerificationDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9BytecodeVerificationDataPointer subOffset(long offset) {
		return J9BytecodeVerificationDataPointer.cast(address - offset);
	}

	public J9BytecodeVerificationDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9BytecodeVerificationDataPointer untag(long mask) {
		return J9BytecodeVerificationDataPointer.cast(address & ~mask);
	}

	public J9BytecodeVerificationDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9BytecodeVerificationData.SIZEOF;
	}

	// Implementation methods

	// U32* bytecodeMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeMapOffset_", declaredType="U32*")
	public UDATAPointer bytecodeMap() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._bytecodeMapOffset_));
	}

	// U32* bytecodeMap
	public PointerPointer bytecodeMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._bytecodeMapOffset_));
	}

	// UDATA bytecodeMapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeMapSizeOffset_", declaredType="UDATA")
	public UDATA bytecodeMapSize() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._bytecodeMapSizeOffset_);
	}

	// UDATA bytecodeMapSize
	public UDATAPointer bytecodeMapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._bytecodeMapSizeOffset_));
	}

	// void* checkClassLoadingConstraintForNameFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_checkClassLoadingConstraintForNameFunctionOffset_", declaredType="void*")
	public VoidPointer checkClassLoadingConstraintForNameFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._checkClassLoadingConstraintForNameFunctionOffset_));
	}

	// void* checkClassLoadingConstraintForNameFunction
	public PointerPointer checkClassLoadingConstraintForNameFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._checkClassLoadingConstraintForNameFunctionOffset_));
	}

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classLoaderOffset_));
	}

	// void** classNameList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameListOffset_", declaredType="void**")
	public PointerPointer classNameList() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classNameListOffset_));
	}

	// void** classNameList
	public PointerPointer classNameListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classNameListOffset_));
	}

	// void** classNameListEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameListEndOffset_", declaredType="void**")
	public PointerPointer classNameListEnd() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classNameListEndOffset_));
	}

	// void** classNameListEnd
	public PointerPointer classNameListEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classNameListEndOffset_));
	}

	// U8* classNameSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameSegmentOffset_", declaredType="U8*")
	public U8Pointer classNameSegment() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classNameSegmentOffset_));
	}

	// U8* classNameSegment
	public PointerPointer classNameSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classNameSegmentOffset_));
	}

	// U8* classNameSegmentEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameSegmentEndOffset_", declaredType="U8*")
	public U8Pointer classNameSegmentEnd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classNameSegmentEndOffset_));
	}

	// U8* classNameSegmentEnd
	public PointerPointer classNameSegmentEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classNameSegmentEndOffset_));
	}

	// U8* classNameSegmentFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameSegmentFreeOffset_", declaredType="U8*")
	public U8Pointer classNameSegmentFree() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._classNameSegmentFreeOffset_));
	}

	// U8* classNameSegmentFree
	public PointerPointer classNameSegmentFreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._classNameSegmentFreeOffset_));
	}

	// BOOLEAN createdStackMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createdStackMapOffset_", declaredType="BOOLEAN")
	public UDATA createdStackMap() throws CorruptDataException {
		return new U32(getIntAtOffset(J9BytecodeVerificationData._createdStackMapOffset_));
	}

	// BOOLEAN createdStackMap
	public UDATAPointer createdStackMapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._createdStackMapOffset_));
	}

	// UDATA* currentAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentAllocOffset_", declaredType="UDATA*")
	public UDATAPointer currentAlloc() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._currentAllocOffset_));
	}

	// UDATA* currentAlloc
	public PointerPointer currentAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._currentAllocOffset_));
	}

	// U16 errorArgumentIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorArgumentIndexOffset_", declaredType="U16")
	public U16 errorArgumentIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BytecodeVerificationData._errorArgumentIndexOffset_));
	}

	// U16 errorArgumentIndex
	public U16Pointer errorArgumentIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorArgumentIndexOffset_));
	}

	// J9UTF8* errorClassString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorClassStringOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer errorClassString() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._errorClassStringOffset_));
	}

	// J9UTF8* errorClassString
	public PointerPointer errorClassStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorClassStringOffset_));
	}

	// UDATA errorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCodeOffset_", declaredType="UDATA")
	public UDATA errorCode() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._errorCodeOffset_);
	}

	// UDATA errorCode
	public UDATAPointer errorCodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorCodeOffset_));
	}

	// U32 errorCurrentFramePosition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCurrentFramePositionOffset_", declaredType="U32")
	public UDATA errorCurrentFramePosition() throws CorruptDataException {
		return new U32(getIntAtOffset(J9BytecodeVerificationData._errorCurrentFramePositionOffset_));
	}

	// U32 errorCurrentFramePosition
	public UDATAPointer errorCurrentFramePositionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorCurrentFramePositionOffset_));
	}

	// I16 errorDetailCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorDetailCodeOffset_", declaredType="I16")
	public I16 errorDetailCode() throws CorruptDataException {
		return new I16(getShortAtOffset(J9BytecodeVerificationData._errorDetailCodeOffset_));
	}

	// I16 errorDetailCode
	public I16Pointer errorDetailCodeEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorDetailCodeOffset_));
	}

	// J9UTF8* errorMethodString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorMethodStringOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer errorMethodString() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._errorMethodStringOffset_));
	}

	// J9UTF8* errorMethodString
	public PointerPointer errorMethodStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorMethodStringOffset_));
	}

	// UDATA errorModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorModuleOffset_", declaredType="UDATA")
	public UDATA errorModule() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._errorModuleOffset_);
	}

	// UDATA errorModule
	public UDATAPointer errorModuleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorModuleOffset_));
	}

	// UDATA errorPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorPCOffset_", declaredType="UDATA")
	public UDATA errorPC() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._errorPCOffset_);
	}

	// UDATA errorPC
	public UDATAPointer errorPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorPCOffset_));
	}

	// J9UTF8* errorSignatureString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorSignatureStringOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer errorSignatureString() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._errorSignatureStringOffset_));
	}

	// J9UTF8* errorSignatureString
	public PointerPointer errorSignatureStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorSignatureStringOffset_));
	}

	// I32 errorTargetFrameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorTargetFrameIndexOffset_", declaredType="I32")
	public IDATA errorTargetFrameIndex() throws CorruptDataException {
		return new I32(getIntAtOffset(J9BytecodeVerificationData._errorTargetFrameIndexOffset_));
	}

	// I32 errorTargetFrameIndex
	public IDATAPointer errorTargetFrameIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorTargetFrameIndexOffset_));
	}

	// UDATA errorTargetType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorTargetTypeOffset_", declaredType="UDATA")
	public UDATA errorTargetType() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._errorTargetTypeOffset_);
	}

	// UDATA errorTargetType
	public UDATAPointer errorTargetTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorTargetTypeOffset_));
	}

	// UDATA errorTempData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorTempDataOffset_", declaredType="UDATA")
	public UDATA errorTempData() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._errorTempDataOffset_);
	}

	// UDATA errorTempData
	public UDATAPointer errorTempDataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._errorTempDataOffset_));
	}

	// U8* excludeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excludeAttributeOffset_", declaredType="U8*")
	public U8Pointer excludeAttribute() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9BytecodeVerificationData._excludeAttributeOffset_));
	}

	// U8* excludeAttribute
	public PointerPointer excludeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._excludeAttributeOffset_));
	}

	// UDATA ignoreStackMaps
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ignoreStackMapsOffset_", declaredType="UDATA")
	public UDATA ignoreStackMaps() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._ignoreStackMapsOffset_);
	}

	// UDATA ignoreStackMaps
	public UDATAPointer ignoreStackMapsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._ignoreStackMapsOffset_));
	}

	// UDATA* internalBufferEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalBufferEndOffset_", declaredType="UDATA*")
	public UDATAPointer internalBufferEnd() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._internalBufferEndOffset_));
	}

	// UDATA* internalBufferEnd
	public PointerPointer internalBufferEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._internalBufferEndOffset_));
	}

	// UDATA* internalBufferStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalBufferStartOffset_", declaredType="UDATA*")
	public UDATAPointer internalBufferStart() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._internalBufferStartOffset_));
	}

	// UDATA* internalBufferStart
	public PointerPointer internalBufferStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._internalBufferStartOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._javaVMOffset_));
	}

	// UDATA* liveStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveStackOffset_", declaredType="UDATA*")
	public UDATAPointer liveStack() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._liveStackOffset_));
	}

	// UDATA* liveStack
	public PointerPointer liveStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._liveStackOffset_));
	}

	// UDATA liveStackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveStackSizeOffset_", declaredType="UDATA")
	public UDATA liveStackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._liveStackSizeOffset_);
	}

	// UDATA liveStackSize
	public UDATAPointer liveStackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._liveStackSizeOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._portLibOffset_));
	}

	// J9JVMTIClassPair* redefinedClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_redefinedClassesOffset_", declaredType="J9JVMTIClassPair*")
	public J9JVMTIClassPairPointer redefinedClasses() throws CorruptDataException {
		return J9JVMTIClassPairPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._redefinedClassesOffset_));
	}

	// J9JVMTIClassPair* redefinedClasses
	public PointerPointer redefinedClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._redefinedClassesOffset_));
	}

	// UDATA redefinedClassesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_redefinedClassesCountOffset_", declaredType="UDATA")
	public UDATA redefinedClassesCount() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._redefinedClassesCountOffset_);
	}

	// UDATA redefinedClassesCount
	public UDATAPointer redefinedClassesCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._redefinedClassesCountOffset_));
	}

	// UDATA* rewalkQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rewalkQueueOffset_", declaredType="UDATA*")
	public UDATAPointer rewalkQueue() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._rewalkQueueOffset_));
	}

	// UDATA* rewalkQueue
	public PointerPointer rewalkQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._rewalkQueueOffset_));
	}

	// UDATA rewalkQueueHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rewalkQueueHeadOffset_", declaredType="UDATA")
	public UDATA rewalkQueueHead() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._rewalkQueueHeadOffset_);
	}

	// UDATA rewalkQueueHead
	public UDATAPointer rewalkQueueHeadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._rewalkQueueHeadOffset_));
	}

	// UDATA rewalkQueueTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rewalkQueueTailOffset_", declaredType="UDATA")
	public UDATA rewalkQueueTail() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._rewalkQueueTailOffset_);
	}

	// UDATA rewalkQueueTail
	public UDATAPointer rewalkQueueTailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._rewalkQueueTailOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._romClassOffset_));
	}

	// UDATA romClassInSharedClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassInSharedClassesOffset_", declaredType="UDATA")
	public UDATA romClassInSharedClasses() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._romClassInSharedClassesOffset_);
	}

	// UDATA romClassInSharedClasses
	public UDATAPointer romClassInSharedClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._romClassInSharedClassesOffset_));
	}

	// J9ROMMethod* romMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodOffset_", declaredType="J9ROMMethod*")
	public J9ROMMethodPointer romMethod() throws CorruptDataException {
		return J9ROMMethodPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._romMethodOffset_));
	}

	// J9ROMMethod* romMethod
	public PointerPointer romMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._romMethodOffset_));
	}

	// UDATA rootQueueSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootQueueSizeOffset_", declaredType="UDATA")
	public UDATA rootQueueSize() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._rootQueueSizeOffset_);
	}

	// UDATA rootQueueSize
	public UDATAPointer rootQueueSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._rootQueueSizeOffset_));
	}

	// UDATA* stackMaps
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsOffset_", declaredType="UDATA*")
	public UDATAPointer stackMaps() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._stackMapsOffset_));
	}

	// UDATA* stackMaps
	public PointerPointer stackMapsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._stackMapsOffset_));
	}

	// IDATA stackMapsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsCountOffset_", declaredType="IDATA")
	public IDATA stackMapsCount() throws CorruptDataException {
		return getIDATAAtOffset(J9BytecodeVerificationData._stackMapsCountOffset_);
	}

	// IDATA stackMapsCount
	public IDATAPointer stackMapsCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._stackMapsCountOffset_));
	}

	// UDATA stackMapsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsSizeOffset_", declaredType="UDATA")
	public UDATA stackMapsSize() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._stackMapsSizeOffset_);
	}

	// UDATA stackMapsSize
	public UDATAPointer stackMapsSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._stackMapsSizeOffset_));
	}

	// UDATA stackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackSizeOffset_", declaredType="UDATA")
	public UDATA stackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._stackSizeOffset_);
	}

	// UDATA stackSize
	public UDATAPointer stackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._stackSizeOffset_));
	}

	// UDATA* unwalkedQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueOffset_", declaredType="UDATA*")
	public UDATAPointer unwalkedQueue() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._unwalkedQueueOffset_));
	}

	// UDATA* unwalkedQueue
	public PointerPointer unwalkedQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._unwalkedQueueOffset_));
	}

	// UDATA unwalkedQueueHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueHeadOffset_", declaredType="UDATA")
	public UDATA unwalkedQueueHead() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._unwalkedQueueHeadOffset_);
	}

	// UDATA unwalkedQueueHead
	public UDATAPointer unwalkedQueueHeadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._unwalkedQueueHeadOffset_));
	}

	// UDATA unwalkedQueueTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueTailOffset_", declaredType="UDATA")
	public UDATA unwalkedQueueTail() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._unwalkedQueueTailOffset_);
	}

	// UDATA unwalkedQueueTail
	public UDATAPointer unwalkedQueueTailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._unwalkedQueueTailOffset_));
	}

	// UDATA verificationFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verificationFlagsOffset_", declaredType="UDATA")
	public UDATA verificationFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9BytecodeVerificationData._verificationFlagsOffset_);
	}

	// UDATA verificationFlags
	public UDATAPointer verificationFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._verificationFlagsOffset_));
	}

	// omrthread_monitor_t verifierMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifierMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer verifierMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._verifierMutexOffset_));
	}

	// omrthread_monitor_t verifierMutex
	public PointerPointer verifierMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._verifierMutexOffset_));
	}

	// void* verifyBytecodesFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyBytecodesFunctionOffset_", declaredType="void*")
	public VoidPointer verifyBytecodesFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._verifyBytecodesFunctionOffset_));
	}

	// void* verifyBytecodesFunction
	public PointerPointer verifyBytecodesFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._verifyBytecodesFunctionOffset_));
	}

	// J9VMThread* vmStruct
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmStructOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer vmStruct() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9BytecodeVerificationData._vmStructOffset_));
	}

	// J9VMThread* vmStruct
	public PointerPointer vmStructEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BytecodeVerificationData._vmStructOffset_));
	}

}
