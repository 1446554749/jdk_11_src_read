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
 * Structure: J9SharedClassJavacoreDataDescriptorPointer
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
 * The generated code will provide getters for all elements in the J9SharedClassJavacoreDataDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedClassJavacoreDataDescriptor.class)
public class J9SharedClassJavacoreDataDescriptorPointer extends StructurePointer {

	// NULL
	public static final J9SharedClassJavacoreDataDescriptorPointer NULL = new J9SharedClassJavacoreDataDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedClassJavacoreDataDescriptorPointer(long address) {
		super(address);
	}

	public static J9SharedClassJavacoreDataDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedClassJavacoreDataDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedClassJavacoreDataDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedClassJavacoreDataDescriptorPointer(address);
	}

	public J9SharedClassJavacoreDataDescriptorPointer add(long count) {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(address + (J9SharedClassJavacoreDataDescriptor.SIZEOF * count));
	}

	public J9SharedClassJavacoreDataDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedClassJavacoreDataDescriptorPointer addOffset(long offset) {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(address + offset);
	}

	public J9SharedClassJavacoreDataDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedClassJavacoreDataDescriptorPointer sub(long count) {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(address - (J9SharedClassJavacoreDataDescriptor.SIZEOF * count));
	}

	public J9SharedClassJavacoreDataDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedClassJavacoreDataDescriptorPointer subOffset(long offset) {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(address - offset);
	}

	public J9SharedClassJavacoreDataDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedClassJavacoreDataDescriptorPointer untag(long mask) {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(address & ~mask);
	}

	public J9SharedClassJavacoreDataDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedClassJavacoreDataDescriptor.SIZEOF;
	}

	// Implementation methods

	// UDATA aotBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotBytesOffset_", declaredType="UDATA")
	public UDATA aotBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._aotBytesOffset_);
	}

	// UDATA aotBytes
	public UDATAPointer aotBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._aotBytesOffset_));
	}

	// UDATA aotClassChainDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotClassChainDataBytesOffset_", declaredType="UDATA")
	public UDATA aotClassChainDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._aotClassChainDataBytesOffset_);
	}

	// UDATA aotClassChainDataBytes
	public UDATAPointer aotClassChainDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._aotClassChainDataBytesOffset_));
	}

	// UDATA aotDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotDataBytesOffset_", declaredType="UDATA")
	public UDATA aotDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._aotDataBytesOffset_);
	}

	// UDATA aotDataBytes
	public UDATAPointer aotDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._aotDataBytesOffset_));
	}

	// UDATA aotThunkDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotThunkDataBytesOffset_", declaredType="UDATA")
	public UDATA aotThunkDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._aotThunkDataBytesOffset_);
	}

	// UDATA aotThunkDataBytes
	public UDATAPointer aotThunkDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._aotThunkDataBytesOffset_));
	}

	// const U8* cacheDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheDirOffset_", declaredType="const U8*")
	public U8Pointer cacheDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._cacheDirOffset_));
	}

	// const U8* cacheDir
	public PointerPointer cacheDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._cacheDirOffset_));
	}

	// void* cacheEndAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheEndAddressOffset_", declaredType="void*")
	public VoidPointer cacheEndAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._cacheEndAddressOffset_));
	}

	// void* cacheEndAddress
	public PointerPointer cacheEndAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._cacheEndAddressOffset_));
	}

	// UDATA cacheGen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheGenOffset_", declaredType="UDATA")
	public UDATA cacheGen() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._cacheGenOffset_);
	}

	// UDATA cacheGen
	public UDATAPointer cacheGenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._cacheGenOffset_));
	}

	// const U8* cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheNameOffset_", declaredType="const U8*")
	public U8Pointer cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._cacheNameOffset_));
	}

	// const U8* cacheName
	public PointerPointer cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._cacheNameOffset_));
	}

	// UDATA cacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheSizeOffset_", declaredType="UDATA")
	public UDATA cacheSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._cacheSizeOffset_);
	}

	// UDATA cacheSize
	public UDATAPointer cacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._cacheSizeOffset_));
	}

	// UDATA ccCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ccCountOffset_", declaredType="UDATA")
	public UDATA ccCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._ccCountOffset_);
	}

	// UDATA ccCount
	public UDATAPointer ccCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._ccCountOffset_));
	}

	// UDATA ccStartedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ccStartedCountOffset_", declaredType="UDATA")
	public UDATA ccStartedCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._ccStartedCountOffset_);
	}

	// UDATA ccStartedCount
	public UDATAPointer ccStartedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._ccStartedCountOffset_));
	}

	// UDATA corruptValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptValueOffset_", declaredType="UDATA")
	public UDATA corruptValue() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._corruptValueOffset_);
	}

	// UDATA corruptValue
	public UDATAPointer corruptValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._corruptValueOffset_));
	}

	// IDATA corruptionCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptionCodeOffset_", declaredType="IDATA")
	public IDATA corruptionCode() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._corruptionCodeOffset_);
	}

	// IDATA corruptionCode
	public IDATAPointer corruptionCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._corruptionCodeOffset_));
	}

	// UDATA debugAreaLineNumberTableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugAreaLineNumberTableBytesOffset_", declaredType="UDATA")
	public UDATA debugAreaLineNumberTableBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._debugAreaLineNumberTableBytesOffset_);
	}

	// UDATA debugAreaLineNumberTableBytes
	public UDATAPointer debugAreaLineNumberTableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._debugAreaLineNumberTableBytesOffset_));
	}

	// UDATA debugAreaLocalVariableTableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugAreaLocalVariableTableBytesOffset_", declaredType="UDATA")
	public UDATA debugAreaLocalVariableTableBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._debugAreaLocalVariableTableBytesOffset_);
	}

	// UDATA debugAreaLocalVariableTableBytes
	public UDATAPointer debugAreaLocalVariableTableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._debugAreaLocalVariableTableBytesOffset_));
	}

	// UDATA debugAreaSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugAreaSizeOffset_", declaredType="UDATA")
	public UDATA debugAreaSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._debugAreaSizeOffset_);
	}

	// UDATA debugAreaSize
	public UDATAPointer debugAreaSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._debugAreaSizeOffset_));
	}

	// UDATA debugAreaUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugAreaUsedOffset_", declaredType="UDATA")
	public UDATA debugAreaUsed() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._debugAreaUsedOffset_);
	}

	// UDATA debugAreaUsed
	public UDATAPointer debugAreaUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._debugAreaUsedOffset_));
	}

	// UDATA extraFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraFlagsOffset_", declaredType="UDATA")
	public UDATA extraFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._extraFlagsOffset_);
	}

	// UDATA extraFlags
	public UDATAPointer extraFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._extraFlagsOffset_));
	}

	// U32 feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_featureOffset_", declaredType="U32")
	public UDATA feature() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedClassJavacoreDataDescriptor._featureOffset_));
	}

	// U32 feature
	public UDATAPointer featureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._featureOffset_));
	}

	// UDATA freeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeBytesOffset_", declaredType="UDATA")
	public UDATA freeBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._freeBytesOffset_);
	}

	// UDATA freeBytes
	public UDATAPointer freeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._freeBytesOffset_));
	}

	// UDATA indexedDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexedDataBytesOffset_", declaredType="UDATA")
	public UDATA indexedDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._indexedDataBytesOffset_);
	}

	// UDATA indexedDataBytes
	public UDATAPointer indexedDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._indexedDataBytesOffset_));
	}

	// UDATA jclDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclDataBytesOffset_", declaredType="UDATA")
	public UDATA jclDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._jclDataBytesOffset_);
	}

	// UDATA jclDataBytes
	public UDATAPointer jclDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._jclDataBytesOffset_));
	}

	// UDATA jitHintDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitHintDataBytesOffset_", declaredType="UDATA")
	public UDATA jitHintDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._jitHintDataBytesOffset_);
	}

	// UDATA jitHintDataBytes
	public UDATAPointer jitHintDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._jitHintDataBytesOffset_));
	}

	// UDATA jitProfileDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitProfileDataBytesOffset_", declaredType="UDATA")
	public UDATA jitProfileDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._jitProfileDataBytesOffset_);
	}

	// UDATA jitProfileDataBytes
	public UDATAPointer jitProfileDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._jitProfileDataBytesOffset_));
	}

	// IDATA maxAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxAOTOffset_", declaredType="IDATA")
	public IDATA maxAOT() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._maxAOTOffset_);
	}

	// IDATA maxAOT
	public IDATAPointer maxAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._maxAOTOffset_));
	}

	// IDATA maxJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxJITOffset_", declaredType="IDATA")
	public IDATA maxJIT() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._maxJITOffset_);
	}

	// IDATA maxJIT
	public IDATAPointer maxJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._maxJITOffset_));
	}

	// void* metadataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metadataStartOffset_", declaredType="void*")
	public VoidPointer metadataStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._metadataStartOffset_));
	}

	// void* metadataStart
	public PointerPointer metadataStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._metadataStartOffset_));
	}

	// IDATA minAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minAOTOffset_", declaredType="IDATA")
	public IDATA minAOT() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._minAOTOffset_);
	}

	// IDATA minAOT
	public IDATAPointer minAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._minAOTOffset_));
	}

	// IDATA minJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minJITOffset_", declaredType="IDATA")
	public IDATA minJIT() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._minJITOffset_);
	}

	// IDATA minJIT
	public IDATAPointer minJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._minJITOffset_));
	}

	// UDATA numAOTMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numAOTMethodsOffset_", declaredType="UDATA")
	public UDATA numAOTMethods() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numAOTMethodsOffset_);
	}

	// UDATA numAOTMethods
	public UDATAPointer numAOTMethodsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numAOTMethodsOffset_));
	}

	// UDATA numAotClassChains
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numAotClassChainsOffset_", declaredType="UDATA")
	public UDATA numAotClassChains() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numAotClassChainsOffset_);
	}

	// UDATA numAotClassChains
	public UDATAPointer numAotClassChainsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numAotClassChainsOffset_));
	}

	// UDATA numAotDataEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numAotDataEntriesOffset_", declaredType="UDATA")
	public UDATA numAotDataEntries() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numAotDataEntriesOffset_);
	}

	// UDATA numAotDataEntries
	public UDATAPointer numAotDataEntriesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numAotDataEntriesOffset_));
	}

	// UDATA numAotThunks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numAotThunksOffset_", declaredType="UDATA")
	public UDATA numAotThunks() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numAotThunksOffset_);
	}

	// UDATA numAotThunks
	public UDATAPointer numAotThunksEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numAotThunksOffset_));
	}

	// UDATA numClasspaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numClasspathsOffset_", declaredType="UDATA")
	public UDATA numClasspaths() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numClasspathsOffset_);
	}

	// UDATA numClasspaths
	public UDATAPointer numClasspathsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numClasspathsOffset_));
	}

	// UDATA numJclEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numJclEntriesOffset_", declaredType="UDATA")
	public UDATA numJclEntries() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numJclEntriesOffset_);
	}

	// UDATA numJclEntries
	public UDATAPointer numJclEntriesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numJclEntriesOffset_));
	}

	// UDATA numJitHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numJitHintsOffset_", declaredType="UDATA")
	public UDATA numJitHints() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numJitHintsOffset_);
	}

	// UDATA numJitHints
	public UDATAPointer numJitHintsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numJitHintsOffset_));
	}

	// UDATA numJitProfiles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numJitProfilesOffset_", declaredType="UDATA")
	public UDATA numJitProfiles() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numJitProfilesOffset_);
	}

	// UDATA numJitProfiles
	public UDATAPointer numJitProfilesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numJitProfilesOffset_));
	}

	// UDATA numObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numObjectsOffset_", declaredType="UDATA")
	public UDATA numObjects() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numObjectsOffset_);
	}

	// UDATA numObjects
	public UDATAPointer numObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numObjectsOffset_));
	}

	// UDATA numROMClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numROMClassesOffset_", declaredType="UDATA")
	public UDATA numROMClasses() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numROMClassesOffset_);
	}

	// UDATA numROMClasses
	public UDATAPointer numROMClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numROMClassesOffset_));
	}

	// UDATA numStaleClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numStaleClassesOffset_", declaredType="UDATA")
	public UDATA numStaleClasses() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numStaleClassesOffset_);
	}

	// UDATA numStaleClasses
	public UDATAPointer numStaleClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numStaleClassesOffset_));
	}

	// UDATA numStartupHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numStartupHintsOffset_", declaredType="UDATA")
	public UDATA numStartupHints() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numStartupHintsOffset_);
	}

	// UDATA numStartupHints
	public UDATAPointer numStartupHintsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numStartupHintsOffset_));
	}

	// UDATA numTokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numTokensOffset_", declaredType="UDATA")
	public UDATA numTokens() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numTokensOffset_);
	}

	// UDATA numTokens
	public UDATAPointer numTokensEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numTokensOffset_));
	}

	// UDATA numURLs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numURLsOffset_", declaredType="UDATA")
	public UDATA numURLs() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numURLsOffset_);
	}

	// UDATA numURLs
	public UDATAPointer numURLsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numURLsOffset_));
	}

	// UDATA numZipCaches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numZipCachesOffset_", declaredType="UDATA")
	public UDATA numZipCaches() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._numZipCachesOffset_);
	}

	// UDATA numZipCaches
	public UDATAPointer numZipCachesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._numZipCachesOffset_));
	}

	// UDATA objectBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectBytesOffset_", declaredType="UDATA")
	public UDATA objectBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._objectBytesOffset_);
	}

	// UDATA objectBytes
	public UDATAPointer objectBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._objectBytesOffset_));
	}

	// UDATA otherBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_otherBytesOffset_", declaredType="UDATA")
	public UDATA otherBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._otherBytesOffset_);
	}

	// UDATA otherBytes
	public UDATAPointer otherBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._otherBytesOffset_));
	}

	// UDATA percFull
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_percFullOffset_", declaredType="UDATA")
	public UDATA percFull() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._percFullOffset_);
	}

	// UDATA percFull
	public UDATAPointer percFullEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._percFullOffset_));
	}

	// UDATA percStale
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_percStaleOffset_", declaredType="UDATA")
	public UDATA percStale() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._percStaleOffset_);
	}

	// UDATA percStale
	public UDATAPointer percStaleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._percStaleOffset_));
	}

	// UDATA readWriteBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteBytesOffset_", declaredType="UDATA")
	public UDATA readWriteBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._readWriteBytesOffset_);
	}

	// UDATA readWriteBytes
	public UDATAPointer readWriteBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._readWriteBytesOffset_));
	}

	// void* readWriteLockTID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteLockTIDOffset_", declaredType="void*")
	public VoidPointer readWriteLockTID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._readWriteLockTIDOffset_));
	}

	// void* readWriteLockTID
	public PointerPointer readWriteLockTIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._readWriteLockTIDOffset_));
	}

	// UDATA romClassBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassBytesOffset_", declaredType="UDATA")
	public UDATA romClassBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._romClassBytesOffset_);
	}

	// UDATA romClassBytes
	public UDATAPointer romClassBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._romClassBytesOffset_));
	}

	// void* romClassEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassEndOffset_", declaredType="void*")
	public VoidPointer romClassEnd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._romClassEndOffset_));
	}

	// void* romClassEnd
	public PointerPointer romClassEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._romClassEndOffset_));
	}

	// void* romClassStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassStartOffset_", declaredType="void*")
	public VoidPointer romClassStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._romClassStartOffset_));
	}

	// void* romClassStart
	public PointerPointer romClassStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._romClassStartOffset_));
	}

	// U64 runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsOffset_", declaredType="U64")
	public UDATA runtimeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9SharedClassJavacoreDataDescriptor._runtimeFlagsOffset_));
	}

	// U64 runtimeFlags
	public UDATAPointer runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._runtimeFlagsOffset_));
	}

	// IDATA semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semidOffset_", declaredType="IDATA")
	public IDATA semid() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._semidOffset_);
	}

	// IDATA semid
	public IDATAPointer semidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._semidOffset_));
	}

	// IDATA shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmidOffset_", declaredType="IDATA")
	public IDATA shmid() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._shmidOffset_);
	}

	// IDATA shmid
	public IDATAPointer shmidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._shmidOffset_));
	}

	// UDATA softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="UDATA")
	public UDATA softMaxBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._softMaxBytesOffset_);
	}

	// UDATA softMaxBytes
	public UDATAPointer softMaxBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._softMaxBytesOffset_));
	}

	// UDATA startupHintBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startupHintBytesOffset_", declaredType="UDATA")
	public UDATA startupHintBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._startupHintBytesOffset_);
	}

	// UDATA startupHintBytes
	public UDATAPointer startupHintBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._startupHintBytesOffset_));
	}

	// I8 topLayer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_topLayerOffset_", declaredType="I8")
	public I8 topLayer() throws CorruptDataException {
		return new I8(getByteAtOffset(J9SharedClassJavacoreDataDescriptor._topLayerOffset_));
	}

	// I8 topLayer
	public I8Pointer topLayerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._topLayerOffset_));
	}

	// IDATA totalSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSizeOffset_", declaredType="IDATA")
	public IDATA totalSize() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassJavacoreDataDescriptor._totalSizeOffset_);
	}

	// IDATA totalSize
	public IDATAPointer totalSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._totalSizeOffset_));
	}

	// UDATA unindexedDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unindexedDataBytesOffset_", declaredType="UDATA")
	public UDATA unindexedDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._unindexedDataBytesOffset_);
	}

	// UDATA unindexedDataBytes
	public UDATAPointer unindexedDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._unindexedDataBytesOffset_));
	}

	// void* writeLockTID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeLockTIDOffset_", declaredType="void*")
	public VoidPointer writeLockTID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassJavacoreDataDescriptor._writeLockTIDOffset_));
	}

	// void* writeLockTID
	public PointerPointer writeLockTIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._writeLockTIDOffset_));
	}

	// UDATA zipCacheDataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCacheDataBytesOffset_", declaredType="UDATA")
	public UDATA zipCacheDataBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassJavacoreDataDescriptor._zipCacheDataBytesOffset_);
	}

	// UDATA zipCacheDataBytes
	public UDATAPointer zipCacheDataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassJavacoreDataDescriptor._zipCacheDataBytesOffset_));
	}

}
