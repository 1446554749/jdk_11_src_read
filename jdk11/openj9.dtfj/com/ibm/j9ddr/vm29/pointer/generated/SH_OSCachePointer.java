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
 * Structure: SH_OSCachePointer
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
 * The generated code will provide getters for all elements in the SH_OSCachePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_OSCache.class)
public class SH_OSCachePointer extends StructurePointer {

	// NULL
	public static final SH_OSCachePointer NULL = new SH_OSCachePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_OSCachePointer(long address) {
		super(address);
	}

	public static SH_OSCachePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_OSCachePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_OSCachePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_OSCachePointer(address);
	}

	public SH_OSCachePointer add(long count) {
		return SH_OSCachePointer.cast(address + (SH_OSCache.SIZEOF * count));
	}

	public SH_OSCachePointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_OSCachePointer addOffset(long offset) {
		return SH_OSCachePointer.cast(address + offset);
	}

	public SH_OSCachePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_OSCachePointer sub(long count) {
		return SH_OSCachePointer.cast(address - (SH_OSCache.SIZEOF * count));
	}

	public SH_OSCachePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_OSCachePointer subOffset(long offset) {
		return SH_OSCachePointer.cast(address - offset);
	}

	public SH_OSCachePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_OSCachePointer untag(long mask) {
		return SH_OSCachePointer.cast(address & ~mask);
	}

	public SH_OSCachePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_OSCache.SIZEOF;
	}

	// Implementation methods

	// UDATA _activeGeneration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeGenerationOffset_", declaredType="UDATA")
	public UDATA _activeGeneration() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache.__activeGenerationOffset_);
	}

	// UDATA _activeGeneration
	public UDATAPointer _activeGenerationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__activeGenerationOffset_));
	}

	// U8* _cacheDirName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheDirNameOffset_", declaredType="U8*")
	public U8Pointer _cacheDirName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCache.__cacheDirNameOffset_));
	}

	// U8* _cacheDirName
	public PointerPointer _cacheDirNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__cacheDirNameOffset_));
	}

	// U8* _cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheNameOffset_", declaredType="U8*")
	public U8Pointer _cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCache.__cacheNameOffset_));
	}

	// U8* _cacheName
	public PointerPointer _cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__cacheNameOffset_));
	}

	// U8* _cacheNameWithVGen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheNameWithVGenOffset_", declaredType="U8*")
	public U8Pointer _cacheNameWithVGen() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCache.__cacheNameWithVGenOffset_));
	}

	// U8* _cacheNameWithVGen
	public PointerPointer _cacheNameWithVGenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__cacheNameWithVGenOffset_));
	}

	// U8* _cachePathName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachePathNameOffset_", declaredType="U8*")
	public U8Pointer _cachePathName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCache.__cachePathNameOffset_));
	}

	// U8* _cachePathName
	public PointerPointer _cachePathNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__cachePathNameOffset_));
	}

	// U32 _cacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheSizeOffset_", declaredType="U32")
	public UDATA _cacheSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_OSCache.__cacheSizeOffset_));
	}

	// U32 _cacheSize
	public UDATAPointer _cacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__cacheSizeOffset_));
	}

	// U8* _cacheUniqueID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheUniqueIDOffset_", declaredType="U8*")
	public U8Pointer _cacheUniqueID() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCache.__cacheUniqueIDOffset_));
	}

	// U8* _cacheUniqueID
	public PointerPointer _cacheUniqueIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__cacheUniqueIDOffset_));
	}

	// const J9SharedClassPreinitConfig* _config
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__configOffset_", declaredType="const J9SharedClassPreinitConfig*")
	public J9SharedClassPreinitConfigPointer _config() throws CorruptDataException {
		return J9SharedClassPreinitConfigPointer.cast(getPointerAtOffset(SH_OSCache.__configOffset_));
	}

	// const J9SharedClassPreinitConfig* _config
	public PointerPointer _configEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__configOffset_));
	}

	// UDATA _corruptValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__corruptValueOffset_", declaredType="UDATA")
	public UDATA _corruptValue() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache.__corruptValueOffset_);
	}

	// UDATA _corruptValue
	public UDATAPointer _corruptValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__corruptValueOffset_));
	}

	// IDATA _corruptionCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__corruptionCodeOffset_", declaredType="IDATA")
	public IDATA _corruptionCode() throws CorruptDataException {
		return getIDATAAtOffset(SH_OSCache.__corruptionCodeOffset_);
	}

	// IDATA _corruptionCode
	public IDATAPointer _corruptionCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache.__corruptionCodeOffset_));
	}

	// UDATA _createFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__createFlagsOffset_", declaredType="UDATA")
	public UDATA _createFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache.__createFlagsOffset_);
	}

	// UDATA _createFlags
	public UDATAPointer _createFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__createFlagsOffset_));
	}

	// U32 _dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataLengthOffset_", declaredType="U32")
	public UDATA _dataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_OSCache.__dataLengthOffset_));
	}

	// U32 _dataLength
	public UDATAPointer _dataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__dataLengthOffset_));
	}

	// void* _dataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataStartOffset_", declaredType="void*")
	public VoidPointer _dataStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SH_OSCache.__dataStartOffset_));
	}

	// void* _dataStart
	public PointerPointer _dataStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__dataStartOffset_));
	}

	// bool _doCheckBuildID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doCheckBuildIDOffset_", declaredType="bool")
	public boolean _doCheckBuildID() throws CorruptDataException {
		return getBoolAtOffset(SH_OSCache.__doCheckBuildIDOffset_);
	}

	// bool _doCheckBuildID
	public BoolPointer _doCheckBuildIDEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_OSCache.__doCheckBuildIDOffset_));
	}

	// IDATA _errorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__errorCodeOffset_", declaredType="IDATA")
	public IDATA _errorCode() throws CorruptDataException {
		return getIDATAAtOffset(SH_OSCache.__errorCodeOffset_);
	}

	// IDATA _errorCode
	public IDATAPointer _errorCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache.__errorCodeOffset_));
	}

	// void* _headerStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headerStartOffset_", declaredType="void*")
	public VoidPointer _headerStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SH_OSCache.__headerStartOffset_));
	}

	// void* _headerStart
	public PointerPointer _headerStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__headerStartOffset_));
	}

	// bool _isUserSpecifiedCacheDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isUserSpecifiedCacheDirOffset_", declaredType="bool")
	public boolean _isUserSpecifiedCacheDir() throws CorruptDataException {
		return getBoolAtOffset(SH_OSCache.__isUserSpecifiedCacheDirOffset_);
	}

	// bool _isUserSpecifiedCacheDir
	public BoolPointer _isUserSpecifiedCacheDirEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_OSCache.__isUserSpecifiedCacheDirOffset_));
	}

	// I8 _layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__layerOffset_", declaredType="I8")
	public I8 _layer() throws CorruptDataException {
		return new I8(getByteAtOffset(SH_OSCache.__layerOffset_));
	}

	// I8 _layer
	public I8Pointer _layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(SH_OSCache.__layerOffset_));
	}

	// I32 _openMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__openModeOffset_", declaredType="I32")
	public IDATA _openMode() throws CorruptDataException {
		return new I32(getIntAtOffset(SH_OSCache.__openModeOffset_));
	}

	// I32 _openMode
	public IDATAPointer _openModeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache.__openModeOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(SH_OSCache.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__portLibraryOffset_));
	}

	// bool _runningReadOnly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runningReadOnlyOffset_", declaredType="bool")
	public boolean _runningReadOnly() throws CorruptDataException {
		return getBoolAtOffset(SH_OSCache.__runningReadOnlyOffset_);
	}

	// bool _runningReadOnly
	public BoolPointer _runningReadOnlyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_OSCache.__runningReadOnlyOffset_));
	}

	// U64 _runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsOffset_", declaredType="U64")
	public UDATA _runtimeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(SH_OSCache.__runtimeFlagsOffset_));
	}

	// U64 _runtimeFlags
	public UDATAPointer _runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__runtimeFlagsOffset_));
	}

	// bool _startupCompleted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startupCompletedOffset_", declaredType="bool")
	public boolean _startupCompleted() throws CorruptDataException {
		return getBoolAtOffset(SH_OSCache.__startupCompletedOffset_);
	}

	// bool _startupCompleted
	public BoolPointer _startupCompletedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_OSCache.__startupCompletedOffset_));
	}

	// UDATA _verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseFlagsOffset_", declaredType="UDATA")
	public UDATA _verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache.__verboseFlagsOffset_);
	}

	// UDATA _verboseFlags
	public UDATAPointer _verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache.__verboseFlagsOffset_));
	}

	// void** _vptr$SH_OSCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$SH_OSCacheOffset_", declaredType="void**")
	public PointerPointer _vptr$SH_OSCache() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(SH_OSCache.__vptr$SH_OSCacheOffset_));
	}

	// void** _vptr$SH_OSCache
	public PointerPointer _vptr$SH_OSCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache.__vptr$SH_OSCacheOffset_));
	}

}
