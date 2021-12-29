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
 * Structure: J9SharedCacheAPIPointer
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
 * The generated code will provide getters for all elements in the J9SharedCacheAPIPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedCacheAPI.class)
public class J9SharedCacheAPIPointer extends StructurePointer {

	// NULL
	public static final J9SharedCacheAPIPointer NULL = new J9SharedCacheAPIPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedCacheAPIPointer(long address) {
		super(address);
	}

	public static J9SharedCacheAPIPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedCacheAPIPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedCacheAPIPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedCacheAPIPointer(address);
	}

	public J9SharedCacheAPIPointer add(long count) {
		return J9SharedCacheAPIPointer.cast(address + (J9SharedCacheAPI.SIZEOF * count));
	}

	public J9SharedCacheAPIPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedCacheAPIPointer addOffset(long offset) {
		return J9SharedCacheAPIPointer.cast(address + offset);
	}

	public J9SharedCacheAPIPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedCacheAPIPointer sub(long count) {
		return J9SharedCacheAPIPointer.cast(address - (J9SharedCacheAPI.SIZEOF * count));
	}

	public J9SharedCacheAPIPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedCacheAPIPointer subOffset(long offset) {
		return J9SharedCacheAPIPointer.cast(address - offset);
	}

	public J9SharedCacheAPIPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedCacheAPIPointer untag(long mask) {
		return J9SharedCacheAPIPointer.cast(address & ~mask);
	}

	public J9SharedCacheAPIPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedCacheAPI.SIZEOF;
	}

	// Implementation methods

	// UDATA cacheDirPerm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheDirPermOffset_", declaredType="UDATA")
	public UDATA cacheDirPerm() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._cacheDirPermOffset_);
	}

	// UDATA cacheDirPerm
	public UDATAPointer cacheDirPermEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._cacheDirPermOffset_));
	}

	// U8* cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheNameOffset_", declaredType="U8*")
	public U8Pointer cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheAPI._cacheNameOffset_));
	}

	// U8* cacheName
	public PointerPointer cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._cacheNameOffset_));
	}

	// UDATA cacheType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheTypeOffset_", declaredType="UDATA")
	public UDATA cacheType() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._cacheTypeOffset_);
	}

	// UDATA cacheType
	public UDATAPointer cacheTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._cacheTypeOffset_));
	}

	// U8* ctrlDirName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ctrlDirNameOffset_", declaredType="U8*")
	public U8Pointer ctrlDirName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheAPI._ctrlDirNameOffset_));
	}

	// U8* ctrlDirName
	public PointerPointer ctrlDirNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._ctrlDirNameOffset_));
	}

	// void* destroySharedCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destroySharedCacheOffset_", declaredType="void*")
	public VoidPointer destroySharedCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedCacheAPI._destroySharedCacheOffset_));
	}

	// void* destroySharedCache
	public PointerPointer destroySharedCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._destroySharedCacheOffset_));
	}

	// U8* expireTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_expireTimeOffset_", declaredType="U8*")
	public U8Pointer expireTime() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheAPI._expireTimeOffset_));
	}

	// U8* expireTime
	public PointerPointer expireTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._expireTimeOffset_));
	}

	// U8 inContainer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inContainerOffset_", declaredType="U8")
	public U8 inContainer() throws CorruptDataException {
		return new U8(getByteAtOffset(J9SharedCacheAPI._inContainerOffset_));
	}

	// U8 inContainer
	public U8Pointer inContainerEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9SharedCacheAPI._inContainerOffset_));
	}

	// void* iterateSharedCaches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iterateSharedCachesOffset_", declaredType="void*")
	public VoidPointer iterateSharedCaches() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedCacheAPI._iterateSharedCachesOffset_));
	}

	// void* iterateSharedCaches
	public PointerPointer iterateSharedCachesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._iterateSharedCachesOffset_));
	}

	// I8 layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_layerOffset_", declaredType="I8")
	public I8 layer() throws CorruptDataException {
		return new I8(getByteAtOffset(J9SharedCacheAPI._layerOffset_));
	}

	// I8 layer
	public I8Pointer layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(J9SharedCacheAPI._layerOffset_));
	}

	// I32 maxAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxAOTOffset_", declaredType="I32")
	public IDATA maxAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheAPI._maxAOTOffset_));
	}

	// I32 maxAOT
	public IDATAPointer maxAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._maxAOTOffset_));
	}

	// I32 maxJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxJITOffset_", declaredType="I32")
	public IDATA maxJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheAPI._maxJITOffset_));
	}

	// I32 maxJIT
	public IDATAPointer maxJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._maxJITOffset_));
	}

	// U8* methodSpecs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodSpecsOffset_", declaredType="U8*")
	public U8Pointer methodSpecs() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheAPI._methodSpecsOffset_));
	}

	// U8* methodSpecs
	public PointerPointer methodSpecsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._methodSpecsOffset_));
	}

	// I32 minAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minAOTOffset_", declaredType="I32")
	public IDATA minAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheAPI._minAOTOffset_));
	}

	// I32 minAOT
	public IDATAPointer minAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._minAOTOffset_));
	}

	// I32 minJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minJITOffset_", declaredType="I32")
	public IDATA minJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheAPI._minJITOffset_));
	}

	// I32 minJIT
	public IDATAPointer minJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._minJITOffset_));
	}

	// U8* modContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modContextOffset_", declaredType="U8*")
	public U8Pointer modContext() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheAPI._modContextOffset_));
	}

	// U8* modContext
	public PointerPointer modContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheAPI._modContextOffset_));
	}

	// UDATA parseResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parseResultOffset_", declaredType="UDATA")
	public UDATA parseResult() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._parseResultOffset_);
	}

	// UDATA parseResult
	public UDATAPointer parseResultEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._parseResultOffset_));
	}

	// UDATA printStatsOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printStatsOptionsOffset_", declaredType="UDATA")
	public UDATA printStatsOptions() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._printStatsOptionsOffset_);
	}

	// UDATA printStatsOptions
	public UDATAPointer printStatsOptionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._printStatsOptionsOffset_));
	}

	// U64 runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsOffset_", declaredType="U64")
	public UDATA runtimeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9SharedCacheAPI._runtimeFlagsOffset_));
	}

	// U64 runtimeFlags
	public UDATAPointer runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._runtimeFlagsOffset_));
	}

	// U8 sharedCacheEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedCacheEnabledOffset_", declaredType="U8")
	public U8 sharedCacheEnabled() throws CorruptDataException {
		return new U8(getByteAtOffset(J9SharedCacheAPI._sharedCacheEnabledOffset_));
	}

	// U8 sharedCacheEnabled
	public U8Pointer sharedCacheEnabledEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9SharedCacheAPI._sharedCacheEnabledOffset_));
	}

	// U32 softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="U32")
	public UDATA softMaxBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheAPI._softMaxBytesOffset_));
	}

	// U32 softMaxBytes
	public UDATAPointer softMaxBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._softMaxBytesOffset_));
	}

	// UDATA storageKeyTesting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storageKeyTestingOffset_", declaredType="UDATA")
	public UDATA storageKeyTesting() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._storageKeyTestingOffset_);
	}

	// UDATA storageKeyTesting
	public UDATAPointer storageKeyTestingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._storageKeyTestingOffset_));
	}

	// UDATA verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseFlagsOffset_", declaredType="UDATA")
	public UDATA verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._verboseFlagsOffset_);
	}

	// UDATA verboseFlags
	public UDATAPointer verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._verboseFlagsOffset_));
	}

	// UDATA xShareClassesPresent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_xShareClassesPresentOffset_", declaredType="UDATA")
	public UDATA xShareClassesPresent() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheAPI._xShareClassesPresentOffset_);
	}

	// UDATA xShareClassesPresent
	public UDATAPointer xShareClassesPresentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheAPI._xShareClassesPresentOffset_));
	}

}
