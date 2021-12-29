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
 * Structure: SH_CompositeCacheImplPointer
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
 * The generated code will provide getters for all elements in the SH_CompositeCacheImplPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_CompositeCacheImpl.class)
public class SH_CompositeCacheImplPointer extends SH_CompositeCachePointer {

	// NULL
	public static final SH_CompositeCacheImplPointer NULL = new SH_CompositeCacheImplPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_CompositeCacheImplPointer(long address) {
		super(address);
	}

	public static SH_CompositeCacheImplPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_CompositeCacheImplPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_CompositeCacheImplPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_CompositeCacheImplPointer(address);
	}

	public SH_CompositeCacheImplPointer add(long count) {
		return SH_CompositeCacheImplPointer.cast(address + (SH_CompositeCacheImpl.SIZEOF * count));
	}

	public SH_CompositeCacheImplPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_CompositeCacheImplPointer addOffset(long offset) {
		return SH_CompositeCacheImplPointer.cast(address + offset);
	}

	public SH_CompositeCacheImplPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_CompositeCacheImplPointer sub(long count) {
		return SH_CompositeCacheImplPointer.cast(address - (SH_CompositeCacheImpl.SIZEOF * count));
	}

	public SH_CompositeCacheImplPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_CompositeCacheImplPointer subOffset(long offset) {
		return SH_CompositeCacheImplPointer.cast(address - offset);
	}

	public SH_CompositeCacheImplPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_CompositeCacheImplPointer untag(long mask) {
		return SH_CompositeCacheImplPointer.cast(address & ~mask);
	}

	public SH_CompositeCacheImplPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_CompositeCacheImpl.SIZEOF;
	}

	// Implementation methods

	// UDATA _cacheFullFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheFullFlagsOffset_", declaredType="UDATA")
	public UDATA _cacheFullFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__cacheFullFlagsOffset_);
	}

	// UDATA _cacheFullFlags
	public UDATAPointer _cacheFullFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__cacheFullFlagsOffset_));
	}

	// U32 _cacheHeaderPageBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheHeaderPageBytesOffset_", declaredType="U32")
	public UDATA _cacheHeaderPageBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__cacheHeaderPageBytesOffset_));
	}

	// U32 _cacheHeaderPageBytes
	public UDATAPointer _cacheHeaderPageBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__cacheHeaderPageBytesOffset_));
	}

	// BlockPtr _cacheHeaderPageStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheHeaderPageStartOffset_", declaredType="BlockPtr")
	public U8Pointer _cacheHeaderPageStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__cacheHeaderPageStartOffset_));
	}

	// BlockPtr _cacheHeaderPageStart
	public PointerPointer _cacheHeaderPageStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__cacheHeaderPageStartOffset_));
	}

	// const U8* _cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheNameOffset_", declaredType="const U8*")
	public U8Pointer _cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__cacheNameOffset_));
	}

	// const U8* _cacheName
	public PointerPointer _cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__cacheNameOffset_));
	}

	// bool _canStoreClasspaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__canStoreClasspathsOffset_", declaredType="bool")
	public boolean _canStoreClasspaths() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__canStoreClasspathsOffset_);
	}

	// bool _canStoreClasspaths
	public BoolPointer _canStoreClasspathsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__canStoreClasspathsOffset_));
	}

	// SH_CompositeCacheImpl* _ccHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ccHeadOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _ccHead() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__ccHeadOffset_));
	}

	// SH_CompositeCacheImpl* _ccHead
	public PointerPointer _ccHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__ccHeadOffset_));
	}

	// J9ShrCompositeCacheCommonInfo* _commonCCInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__commonCCInfoOffset_", declaredType="J9ShrCompositeCacheCommonInfo*")
	public J9ShrCompositeCacheCommonInfoPointer _commonCCInfo() throws CorruptDataException {
		return J9ShrCompositeCacheCommonInfoPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__commonCCInfoOffset_));
	}

	// J9ShrCompositeCacheCommonInfo* _commonCCInfo
	public PointerPointer _commonCCInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__commonCCInfoOffset_));
	}

	// J9MemorySegment* _currentROMSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentROMSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer _currentROMSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__currentROMSegmentOffset_));
	}

	// J9MemorySegment* _currentROMSegment
	public PointerPointer _currentROMSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__currentROMSegmentOffset_));
	}

	// ClassDebugDataProvider* _debugData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__debugDataOffset_", declaredType="ClassDebugDataProvider*")
	public ClassDebugDataProviderPointer _debugData() throws CorruptDataException {
		return ClassDebugDataProviderPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__debugDataOffset_));
	}

	// ClassDebugDataProvider* _debugData
	public PointerPointer _debugDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__debugDataOffset_));
	}

	// bool _doHeaderProtect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doHeaderProtectOffset_", declaredType="bool")
	public boolean _doHeaderProtect() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doHeaderProtectOffset_);
	}

	// bool _doHeaderProtect
	public BoolPointer _doHeaderProtectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doHeaderProtectOffset_));
	}

	// bool _doHeaderReadWriteProtect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doHeaderReadWriteProtectOffset_", declaredType="bool")
	public boolean _doHeaderReadWriteProtect() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doHeaderReadWriteProtectOffset_);
	}

	// bool _doHeaderReadWriteProtect
	public BoolPointer _doHeaderReadWriteProtectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doHeaderReadWriteProtectOffset_));
	}

	// bool _doMetaProtect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doMetaProtectOffset_", declaredType="bool")
	public boolean _doMetaProtect() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doMetaProtectOffset_);
	}

	// bool _doMetaProtect
	public BoolPointer _doMetaProtectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doMetaProtectOffset_));
	}

	// bool _doPartialPagesProtect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doPartialPagesProtectOffset_", declaredType="bool")
	public boolean _doPartialPagesProtect() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doPartialPagesProtectOffset_);
	}

	// bool _doPartialPagesProtect
	public BoolPointer _doPartialPagesProtectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doPartialPagesProtectOffset_));
	}

	// bool _doReadWriteSync
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doReadWriteSyncOffset_", declaredType="bool")
	public boolean _doReadWriteSync() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doReadWriteSyncOffset_);
	}

	// bool _doReadWriteSync
	public BoolPointer _doReadWriteSyncEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doReadWriteSyncOffset_));
	}

	// bool _doSegmentProtect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doSegmentProtectOffset_", declaredType="bool")
	public boolean _doSegmentProtect() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__doSegmentProtectOffset_);
	}

	// bool _doSegmentProtect
	public BoolPointer _doSegmentProtectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__doSegmentProtectOffset_));
	}

	// IDATA _headerProtectCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headerProtectCntrOffset_", declaredType="IDATA")
	public IDATA _headerProtectCntr() throws CorruptDataException {
		return getIDATAAtOffset(SH_CompositeCacheImpl.__headerProtectCntrOffset_);
	}

	// IDATA _headerProtectCntr
	public IDATAPointer _headerProtectCntrEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__headerProtectCntrOffset_));
	}

	// omrthread_monitor_t _headerProtectMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headerProtectMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _headerProtectMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__headerProtectMutexOffset_));
	}

	// omrthread_monitor_t _headerProtectMutex
	public PointerPointer _headerProtectMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__headerProtectMutexOffset_));
	}

	// bool _incrementedRWCrashCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementedRWCrashCntrOffset_", declaredType="bool")
	public boolean _incrementedRWCrashCntr() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__incrementedRWCrashCntrOffset_);
	}

	// bool _incrementedRWCrashCntr
	public BoolPointer _incrementedRWCrashCntrEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__incrementedRWCrashCntrOffset_));
	}

	// bool _initializingNewCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializingNewCacheOffset_", declaredType="bool")
	public boolean _initializingNewCache() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__initializingNewCacheOffset_);
	}

	// bool _initializingNewCache
	public BoolPointer _initializingNewCacheEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__initializingNewCacheOffset_));
	}

	// U32 _lastFailedWHCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastFailedWHCountOffset_", declaredType="U32")
	public UDATA _lastFailedWHCount() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__lastFailedWHCountOffset_));
	}

	// U32 _lastFailedWHCount
	public UDATAPointer _lastFailedWHCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__lastFailedWHCountOffset_));
	}

	// UDATA _lastFailedWriteHash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastFailedWriteHashOffset_", declaredType="UDATA")
	public UDATA _lastFailedWriteHash() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__lastFailedWriteHashOffset_);
	}

	// UDATA _lastFailedWriteHash
	public UDATAPointer _lastFailedWriteHashEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__lastFailedWriteHashOffset_));
	}

	// I8 _layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__layerOffset_", declaredType="I8")
	public I8 _layer() throws CorruptDataException {
		return new I8(getByteAtOffset(SH_CompositeCacheImpl.__layerOffset_));
	}

	// I8 _layer
	public I8Pointer _layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__layerOffset_));
	}

	// UDATA _localReadWriteCrashCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localReadWriteCrashCntrOffset_", declaredType="UDATA")
	public UDATA _localReadWriteCrashCntr() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__localReadWriteCrashCntrOffset_);
	}

	// UDATA _localReadWriteCrashCntr
	public UDATAPointer _localReadWriteCrashCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__localReadWriteCrashCntrOffset_));
	}

	// I32 _maxAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxAOTOffset_", declaredType="I32")
	public IDATA _maxAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(SH_CompositeCacheImpl.__maxAOTOffset_));
	}

	// I32 _maxAOT
	public IDATAPointer _maxAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__maxAOTOffset_));
	}

	// U32 _maxAOTUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxAOTUnstoredBytesOffset_", declaredType="U32")
	public UDATA _maxAOTUnstoredBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__maxAOTUnstoredBytesOffset_));
	}

	// U32 _maxAOTUnstoredBytes
	public UDATAPointer _maxAOTUnstoredBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__maxAOTUnstoredBytesOffset_));
	}

	// I32 _maxJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxJITOffset_", declaredType="I32")
	public IDATA _maxJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(SH_CompositeCacheImpl.__maxJITOffset_));
	}

	// I32 _maxJIT
	public IDATAPointer _maxJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__maxJITOffset_));
	}

	// U32 _maxJITUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxJITUnstoredBytesOffset_", declaredType="U32")
	public UDATA _maxJITUnstoredBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__maxJITUnstoredBytesOffset_));
	}

	// U32 _maxJITUnstoredBytes
	public UDATAPointer _maxJITUnstoredBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__maxJITUnstoredBytesOffset_));
	}

	// UDATA _maximumAccessedShrCacheMetadata
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumAccessedShrCacheMetadataOffset_", declaredType="UDATA")
	public UDATA _maximumAccessedShrCacheMetadata() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__maximumAccessedShrCacheMetadataOffset_);
	}

	// UDATA _maximumAccessedShrCacheMetadata
	public UDATAPointer _maximumAccessedShrCacheMetadataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__maximumAccessedShrCacheMetadataOffset_));
	}

	// void** _metadataSegmentPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__metadataSegmentPtrOffset_", declaredType="void**")
	public PointerPointer _metadataSegmentPtr() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__metadataSegmentPtrOffset_));
	}

	// void** _metadataSegmentPtr
	public PointerPointer _metadataSegmentPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__metadataSegmentPtrOffset_));
	}

	// UDATA _minimumAccessedShrCacheMetadata
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumAccessedShrCacheMetadataOffset_", declaredType="UDATA")
	public UDATA _minimumAccessedShrCacheMetadata() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__minimumAccessedShrCacheMetadataOffset_);
	}

	// UDATA _minimumAccessedShrCacheMetadata
	public UDATAPointer _minimumAccessedShrCacheMetadataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__minimumAccessedShrCacheMetadataOffset_));
	}

	// BlockPtr _nestedMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestedMemoryOffset_", declaredType="BlockPtr")
	public U8Pointer _nestedMemory() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__nestedMemoryOffset_));
	}

	// BlockPtr _nestedMemory
	public PointerPointer _nestedMemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__nestedMemoryOffset_));
	}

	// UDATA _nestedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestedSizeOffset_", declaredType="UDATA")
	public UDATA _nestedSize() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__nestedSizeOffset_);
	}

	// UDATA _nestedSize
	public UDATAPointer _nestedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__nestedSizeOffset_));
	}

	// SH_CompositeCacheImpl$SH_SharedCacheHeaderInit* _newHdrPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__newHdrPtrOffset_", declaredType="SH_CompositeCacheImpl$SH_SharedCacheHeaderInit*")
	public SH_CompositeCacheImpl$SH_SharedCacheHeaderInitPointer _newHdrPtr() throws CorruptDataException {
		return SH_CompositeCacheImpl$SH_SharedCacheHeaderInitPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__newHdrPtrOffset_));
	}

	// SH_CompositeCacheImpl$SH_SharedCacheHeaderInit* _newHdrPtr
	public PointerPointer _newHdrPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__newHdrPtrOffset_));
	}

	// SH_CompositeCacheImpl* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _next() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__nextOffset_));
	}

	// SH_CompositeCacheImpl* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__nextOffset_));
	}

	// UDATA _oldUpdateCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__oldUpdateCountOffset_", declaredType="UDATA")
	public UDATA _oldUpdateCount() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__oldUpdateCountOffset_);
	}

	// UDATA _oldUpdateCount
	public UDATAPointer _oldUpdateCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__oldUpdateCountOffset_));
	}

	// UDATA _osPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__osPageSizeOffset_", declaredType="UDATA")
	public UDATA _osPageSize() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__osPageSizeOffset_);
	}

	// UDATA _osPageSize
	public UDATAPointer _osPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__osPageSizeOffset_));
	}

	// SH_OSCache* _oscache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__oscacheOffset_", declaredType="SH_OSCache*")
	public SH_OSCachePointer _oscache() throws CorruptDataException {
		return SH_OSCachePointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__oscacheOffset_));
	}

	// SH_OSCache* _oscache
	public PointerPointer _oscacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__oscacheOffset_));
	}

	// SH_CompositeCacheImpl* _parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parentOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _parent() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__parentOffset_));
	}

	// SH_CompositeCacheImpl* _parent
	public PointerPointer _parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__parentOffset_));
	}

	// J9PortLibrary* _portlib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portlibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portlib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__portlibOffset_));
	}

	// J9PortLibrary* _portlib
	public PointerPointer _portlibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__portlibOffset_));
	}

	// ShcItemHdr* _prevScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__prevScanOffset_", declaredType="ShcItemHdr*")
	public ShcItemHdrPointer _prevScan() throws CorruptDataException {
		return ShcItemHdrPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__prevScanOffset_));
	}

	// ShcItemHdr* _prevScan
	public PointerPointer _prevScanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__prevScanOffset_));
	}

	// SH_CompositeCacheImpl* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _previous() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__previousOffset_));
	}

	// SH_CompositeCacheImpl* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__previousOffset_));
	}

	// bool _readOnlyOSCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readOnlyOSCacheOffset_", declaredType="bool")
	public boolean _readOnlyOSCache() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__readOnlyOSCacheOffset_);
	}

	// bool _readOnlyOSCache
	public BoolPointer _readOnlyOSCacheEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readOnlyOSCacheOffset_));
	}

	// IDATA _readOnlyReaderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readOnlyReaderCountOffset_", declaredType="IDATA")
	public IDATA _readOnlyReaderCount() throws CorruptDataException {
		return getIDATAAtOffset(SH_CompositeCacheImpl.__readOnlyReaderCountOffset_);
	}

	// IDATA _readOnlyReaderCount
	public IDATAPointer _readOnlyReaderCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readOnlyReaderCountOffset_));
	}

	// U32 _readWriteAreaBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteAreaBytesOffset_", declaredType="U32")
	public UDATA _readWriteAreaBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__readWriteAreaBytesOffset_));
	}

	// U32 _readWriteAreaBytes
	public UDATAPointer _readWriteAreaBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteAreaBytesOffset_));
	}

	// bool _readWriteAreaHeaderIsReadOnly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteAreaHeaderIsReadOnlyOffset_", declaredType="bool")
	public boolean _readWriteAreaHeaderIsReadOnly() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__readWriteAreaHeaderIsReadOnlyOffset_);
	}

	// bool _readWriteAreaHeaderIsReadOnly
	public BoolPointer _readWriteAreaHeaderIsReadOnlyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteAreaHeaderIsReadOnlyOffset_));
	}

	// U32 _readWriteAreaPageBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteAreaPageBytesOffset_", declaredType="U32")
	public UDATA _readWriteAreaPageBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__readWriteAreaPageBytesOffset_));
	}

	// U32 _readWriteAreaPageBytes
	public UDATAPointer _readWriteAreaPageBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteAreaPageBytesOffset_));
	}

	// BlockPtr _readWriteAreaPageStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteAreaPageStartOffset_", declaredType="BlockPtr")
	public U8Pointer _readWriteAreaPageStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__readWriteAreaPageStartOffset_));
	}

	// BlockPtr _readWriteAreaPageStart
	public PointerPointer _readWriteAreaPageStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteAreaPageStartOffset_));
	}

	// BlockPtr _readWriteAreaStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteAreaStartOffset_", declaredType="BlockPtr")
	public U8Pointer _readWriteAreaStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__readWriteAreaStartOffset_));
	}

	// BlockPtr _readWriteAreaStart
	public PointerPointer _readWriteAreaStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteAreaStartOffset_));
	}

	// IDATA _readWriteProtectCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readWriteProtectCntrOffset_", declaredType="IDATA")
	public IDATA _readWriteProtectCntr() throws CorruptDataException {
		return getIDATAAtOffset(SH_CompositeCacheImpl.__readWriteProtectCntrOffset_);
	}

	// IDATA _readWriteProtectCntr
	public IDATAPointer _readWriteProtectCntrEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__readWriteProtectCntrOffset_));
	}

	// bool _reduceStoreContentionDisabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reduceStoreContentionDisabledOffset_", declaredType="bool")
	public boolean _reduceStoreContentionDisabled() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__reduceStoreContentionDisabledOffset_);
	}

	// bool _reduceStoreContentionDisabled
	public BoolPointer _reduceStoreContentionDisabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__reduceStoreContentionDisabledOffset_));
	}

	// BlockPtr _romClassProtectEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romClassProtectEndOffset_", declaredType="BlockPtr")
	public U8Pointer _romClassProtectEnd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__romClassProtectEndOffset_));
	}

	// BlockPtr _romClassProtectEnd
	public PointerPointer _romClassProtectEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__romClassProtectEndOffset_));
	}

	// U64* _runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsOffset_", declaredType="U64*")
	public UDATAPointer _runtimeFlags() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__runtimeFlagsOffset_));
	}

	// U64* _runtimeFlags
	public PointerPointer _runtimeFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__runtimeFlagsOffset_));
	}

	// omrthread_monitor_t _runtimeFlagsProtectMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsProtectMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _runtimeFlagsProtectMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__runtimeFlagsProtectMutexOffset_));
	}

	// omrthread_monitor_t _runtimeFlagsProtectMutex
	public PointerPointer _runtimeFlagsProtectMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__runtimeFlagsProtectMutexOffset_));
	}

	// ShcItemHdr* _scan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanOffset_", declaredType="ShcItemHdr*")
	public ShcItemHdrPointer _scan() throws CorruptDataException {
		return ShcItemHdrPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__scanOffset_));
	}

	// ShcItemHdr* _scan
	public PointerPointer _scanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__scanOffset_));
	}

	// J9SharedClassConfig* _sharedClassConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sharedClassConfigOffset_", declaredType="J9SharedClassConfig*")
	public J9SharedClassConfigPointer _sharedClassConfig() throws CorruptDataException {
		return J9SharedClassConfigPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__sharedClassConfigOffset_));
	}

	// J9SharedClassConfig* _sharedClassConfig
	public PointerPointer _sharedClassConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__sharedClassConfigOffset_));
	}

	// U32 _softmxUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softmxUnstoredBytesOffset_", declaredType="U32")
	public UDATA _softmxUnstoredBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__softmxUnstoredBytesOffset_));
	}

	// U32 _softmxUnstoredBytes
	public UDATAPointer _softmxUnstoredBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__softmxUnstoredBytesOffset_));
	}

	// bool _started
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startedOffset_", declaredType="bool")
	public boolean _started() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__startedOffset_);
	}

	// bool _started
	public BoolPointer _startedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__startedOffset_));
	}

	// U32 _storedAOTUsedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedAOTUsedBytesOffset_", declaredType="U32")
	public UDATA _storedAOTUsedBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__storedAOTUsedBytesOffset_));
	}

	// U32 _storedAOTUsedBytes
	public UDATAPointer _storedAOTUsedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedAOTUsedBytesOffset_));
	}

	// U32 _storedJITUsedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedJITUsedBytesOffset_", declaredType="U32")
	public UDATA _storedJITUsedBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__storedJITUsedBytesOffset_));
	}

	// U32 _storedJITUsedBytes
	public UDATAPointer _storedJITUsedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedJITUsedBytesOffset_));
	}

	// U32 _storedMetaUsedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedMetaUsedBytesOffset_", declaredType="U32")
	public UDATA _storedMetaUsedBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__storedMetaUsedBytesOffset_));
	}

	// U32 _storedMetaUsedBytes
	public UDATAPointer _storedMetaUsedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedMetaUsedBytesOffset_));
	}

	// ShcItemHdr* _storedPrevScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedPrevScanOffset_", declaredType="ShcItemHdr*")
	public ShcItemHdrPointer _storedPrevScan() throws CorruptDataException {
		return ShcItemHdrPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__storedPrevScanOffset_));
	}

	// ShcItemHdr* _storedPrevScan
	public PointerPointer _storedPrevScanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedPrevScanOffset_));
	}

	// U32 _storedReadWriteUsedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedReadWriteUsedBytesOffset_", declaredType="U32")
	public UDATA _storedReadWriteUsedBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__storedReadWriteUsedBytesOffset_));
	}

	// U32 _storedReadWriteUsedBytes
	public UDATAPointer _storedReadWriteUsedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedReadWriteUsedBytesOffset_));
	}

	// ShcItemHdr* _storedScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedScanOffset_", declaredType="ShcItemHdr*")
	public ShcItemHdrPointer _storedScan() throws CorruptDataException {
		return ShcItemHdrPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__storedScanOffset_));
	}

	// ShcItemHdr* _storedScan
	public PointerPointer _storedScanEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedScanOffset_));
	}

	// U32 _storedSegmentUsedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedSegmentUsedBytesOffset_", declaredType="U32")
	public UDATA _storedSegmentUsedBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__storedSegmentUsedBytesOffset_));
	}

	// U32 _storedSegmentUsedBytes
	public UDATAPointer _storedSegmentUsedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__storedSegmentUsedBytesOffset_));
	}

	// J9SharedCacheHeader* _theca
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__thecaOffset_", declaredType="J9SharedCacheHeader*")
	public J9SharedCacheHeaderPointer _theca() throws CorruptDataException {
		return J9SharedCacheHeaderPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__thecaOffset_));
	}

	// J9SharedCacheHeader* _theca
	public PointerPointer _thecaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__thecaOffset_));
	}

	// U32 _totalStoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalStoredBytesOffset_", declaredType="U32")
	public UDATA _totalStoredBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompositeCacheImpl.__totalStoredBytesOffset_));
	}

	// U32 _totalStoredBytes
	public UDATAPointer _totalStoredBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__totalStoredBytesOffset_));
	}

	// bool _useWriteHash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__useWriteHashOffset_", declaredType="bool")
	public boolean _useWriteHash() throws CorruptDataException {
		return getBoolAtOffset(SH_CompositeCacheImpl.__useWriteHashOffset_);
	}

	// bool _useWriteHash
	public BoolPointer _useWriteHashEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__useWriteHashOffset_));
	}

	// omrthread_monitor_t _utMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__utMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _utMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(SH_CompositeCacheImpl.__utMutexOffset_));
	}

	// omrthread_monitor_t _utMutex
	public PointerPointer _utMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__utMutexOffset_));
	}

	// UDATA _verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseFlagsOffset_", declaredType="UDATA")
	public UDATA _verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_CompositeCacheImpl.__verboseFlagsOffset_);
	}

	// UDATA _verboseFlags
	public UDATAPointer _verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompositeCacheImpl.__verboseFlagsOffset_));
	}

}
