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
 * Structure: SH_CacheMapPointer
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
 * The generated code will provide getters for all elements in the SH_CacheMapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_CacheMap.class)
public class SH_CacheMapPointer extends SH_SharedCachePointer {

	// NULL
	public static final SH_CacheMapPointer NULL = new SH_CacheMapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_CacheMapPointer(long address) {
		super(address);
	}

	public static SH_CacheMapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_CacheMapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_CacheMapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_CacheMapPointer(address);
	}

	public SH_CacheMapPointer add(long count) {
		return SH_CacheMapPointer.cast(address + (SH_CacheMap.SIZEOF * count));
	}

	public SH_CacheMapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_CacheMapPointer addOffset(long offset) {
		return SH_CacheMapPointer.cast(address + offset);
	}

	public SH_CacheMapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_CacheMapPointer sub(long count) {
		return SH_CacheMapPointer.cast(address - (SH_CacheMap.SIZEOF * count));
	}

	public SH_CacheMapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_CacheMapPointer subOffset(long offset) {
		return SH_CacheMapPointer.cast(address - offset);
	}

	public SH_CacheMapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_CacheMapPointer untag(long mask) {
		return SH_CacheMapPointer.cast(address & ~mask);
	}

	public SH_CacheMapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_CacheMap.SIZEOF;
	}

	// Implementation methods

	// U32 _actualSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__actualSizeOffset_", declaredType="U32")
	public UDATA _actualSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CacheMap.__actualSizeOffset_));
	}

	// U32 _actualSize
	public UDATAPointer _actualSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__actualSizeOffset_));
	}

	// SH_AttachedDataManager* _adm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__admOffset_", declaredType="SH_AttachedDataManager*")
	public SH_AttachedDataManagerPointer _adm() throws CorruptDataException {
		return SH_AttachedDataManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__admOffset_));
	}

	// SH_AttachedDataManager* _adm
	public PointerPointer _admEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__admOffset_));
	}

	// SH_ByteDataManager* _bdm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bdmOffset_", declaredType="SH_ByteDataManager*")
	public SH_ByteDataManagerPointer _bdm() throws CorruptDataException {
		return SH_ByteDataManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__bdmOffset_));
	}

	// SH_ByteDataManager* _bdm
	public PointerPointer _bdmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__bdmOffset_));
	}

	// UDATA _bytesRead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesReadOffset_", declaredType="UDATA")
	public UDATA _bytesRead() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__bytesReadOffset_);
	}

	// UDATA _bytesRead
	public UDATAPointer _bytesReadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__bytesReadOffset_));
	}

	// CacheAddressRange[] _cacheAddressRangeArray
	public CacheAddressRangePointer _cacheAddressRangeArrayEA() throws CorruptDataException {
		return CacheAddressRangePointer.cast(nonNullFieldEA(SH_CacheMap.__cacheAddressRangeArrayOffset_));
	}

	// bool _cacheCorruptReported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheCorruptReportedOffset_", declaredType="bool")
	public boolean _cacheCorruptReported() throws CorruptDataException {
		return getBoolAtOffset(SH_CacheMap.__cacheCorruptReportedOffset_);
	}

	// bool _cacheCorruptReported
	public BoolPointer _cacheCorruptReportedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CacheMap.__cacheCorruptReportedOffset_));
	}

	// const U8* _cacheDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheDirOffset_", declaredType="const U8*")
	public U8Pointer _cacheDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CacheMap.__cacheDirOffset_));
	}

	// const U8* _cacheDir
	public PointerPointer _cacheDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__cacheDirOffset_));
	}

	// const U8* _cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheNameOffset_", declaredType="const U8*")
	public U8Pointer _cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CacheMap.__cacheNameOffset_));
	}

	// const U8* _cacheName
	public PointerPointer _cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__cacheNameOffset_));
	}

	// SH_CompositeCacheImpl* _cc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ccOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _cc() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CacheMap.__ccOffset_));
	}

	// SH_CompositeCacheImpl* _cc
	public PointerPointer _ccEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__ccOffset_));
	}

	// SH_CompositeCacheImpl* _ccHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ccHeadOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _ccHead() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CacheMap.__ccHeadOffset_));
	}

	// SH_CompositeCacheImpl* _ccHead
	public PointerPointer _ccHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__ccHeadOffset_));
	}

	// J9Pool* _ccPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ccPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer _ccPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(SH_CacheMap.__ccPoolOffset_));
	}

	// J9Pool* _ccPool
	public PointerPointer _ccPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__ccPoolOffset_));
	}

	// SH_CompositeCacheImpl* _ccTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ccTailOffset_", declaredType="SH_CompositeCacheImpl*")
	public SH_CompositeCacheImplPointer _ccTail() throws CorruptDataException {
		return SH_CompositeCacheImplPointer.cast(getPointerAtOffset(SH_CacheMap.__ccTailOffset_));
	}

	// SH_CompositeCacheImpl* _ccTail
	public PointerPointer _ccTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__ccTailOffset_));
	}

	// SH_CompiledMethodManager* _cmm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cmmOffset_", declaredType="SH_CompiledMethodManager*")
	public SH_CompiledMethodManagerPointer _cmm() throws CorruptDataException {
		return SH_CompiledMethodManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__cmmOffset_));
	}

	// SH_CompiledMethodManager* _cmm
	public PointerPointer _cmmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__cmmOffset_));
	}

	// SH_ClasspathManager* _cpm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpmOffset_", declaredType="SH_ClasspathManager*")
	public SH_ClasspathManagerPointer _cpm() throws CorruptDataException {
		return SH_ClasspathManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__cpmOffset_));
	}

	// SH_ClasspathManager* _cpm
	public PointerPointer _cpmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__cpmOffset_));
	}

	// bool _isAssertEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isAssertEnabledOffset_", declaredType="bool")
	public boolean _isAssertEnabled() throws CorruptDataException {
		return getBoolAtOffset(SH_CacheMap.__isAssertEnabledOffset_);
	}

	// bool _isAssertEnabled
	public BoolPointer _isAssertEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CacheMap.__isAssertEnabledOffset_));
	}

	// UDATA _localCrashCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localCrashCntrOffset_", declaredType="UDATA")
	public UDATA _localCrashCntr() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__localCrashCntrOffset_);
	}

	// UDATA _localCrashCntr
	public UDATAPointer _localCrashCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__localCrashCntrOffset_));
	}

	// SH_Managers* _managers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__managersOffset_", declaredType="SH_Managers*")
	public SH_ManagersPointer _managers() throws CorruptDataException {
		return SH_ManagersPointer.cast(getPointerAtOffset(SH_CacheMap.__managersOffset_));
	}

	// SH_Managers* _managers
	public PointerPointer _managersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__managersOffset_));
	}

	// bool _metadataReleased
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__metadataReleasedOffset_", declaredType="bool")
	public boolean _metadataReleased() throws CorruptDataException {
		return getBoolAtOffset(SH_CacheMap.__metadataReleasedOffset_);
	}

	// bool _metadataReleased
	public BoolPointer _metadataReleasedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_CacheMap.__metadataReleasedOffset_));
	}

	// UDATA _numOfCacheLayers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numOfCacheLayersOffset_", declaredType="UDATA")
	public UDATA _numOfCacheLayers() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__numOfCacheLayersOffset_);
	}

	// UDATA _numOfCacheLayers
	public UDATAPointer _numOfCacheLayersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__numOfCacheLayersOffset_));
	}

	// J9PortLibrary* _portlib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portlibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portlib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(SH_CacheMap.__portlibOffset_));
	}

	// J9PortLibrary* _portlib
	public PointerPointer _portlibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__portlibOffset_));
	}

	// SH_ROMClassManager* _rcm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rcmOffset_", declaredType="SH_ROMClassManager*")
	public SH_ROMClassManagerPointer _rcm() throws CorruptDataException {
		return SH_ROMClassManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__rcmOffset_));
	}

	// SH_ROMClassManager* _rcm
	public PointerPointer _rcmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__rcmOffset_));
	}

	// U64* _readOnlyCacheRuntimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readOnlyCacheRuntimeFlagsOffset_", declaredType="U64*")
	public UDATAPointer _readOnlyCacheRuntimeFlags() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(SH_CacheMap.__readOnlyCacheRuntimeFlagsOffset_));
	}

	// U64* _readOnlyCacheRuntimeFlags
	public PointerPointer _readOnlyCacheRuntimeFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__readOnlyCacheRuntimeFlagsOffset_));
	}

	// omrthread_monitor_t _refreshMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__refreshMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _refreshMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(SH_CacheMap.__refreshMutexOffset_));
	}

	// omrthread_monitor_t _refreshMutex
	public PointerPointer _refreshMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__refreshMutexOffset_));
	}

	// U64* _runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsOffset_", declaredType="U64*")
	public UDATAPointer _runtimeFlags() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(SH_CacheMap.__runtimeFlagsOffset_));
	}

	// U64* _runtimeFlags
	public PointerPointer _runtimeFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__runtimeFlagsOffset_));
	}

	// SH_ScopeManager* _scm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scmOffset_", declaredType="SH_ScopeManager*")
	public SH_ScopeManagerPointer _scm() throws CorruptDataException {
		return SH_ScopeManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__scmOffset_));
	}

	// SH_ScopeManager* _scm
	public PointerPointer _scmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__scmOffset_));
	}

	// J9SharedClassConfig* _sharedClassConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sharedClassConfigOffset_", declaredType="J9SharedClassConfig*")
	public J9SharedClassConfigPointer _sharedClassConfig() throws CorruptDataException {
		return J9SharedClassConfigPointer.cast(getPointerAtOffset(SH_CacheMap.__sharedClassConfigOffset_));
	}

	// J9SharedClassConfig* _sharedClassConfig
	public PointerPointer _sharedClassConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__sharedClassConfigOffset_));
	}

	// SH_TimestampManager* _tsm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tsmOffset_", declaredType="SH_TimestampManager*")
	public SH_TimestampManagerPointer _tsm() throws CorruptDataException {
		return SH_TimestampManagerPointer.cast(getPointerAtOffset(SH_CacheMap.__tsmOffset_));
	}

	// SH_TimestampManager* _tsm
	public PointerPointer _tsmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CacheMap.__tsmOffset_));
	}

	// UDATA _verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseFlagsOffset_", declaredType="UDATA")
	public UDATA _verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__verboseFlagsOffset_);
	}

	// UDATA _verboseFlags
	public UDATAPointer _verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__verboseFlagsOffset_));
	}

	// UDATA _writeHashAverageTimeMicros
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeHashAverageTimeMicrosOffset_", declaredType="UDATA")
	public UDATA _writeHashAverageTimeMicros() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__writeHashAverageTimeMicrosOffset_);
	}

	// UDATA _writeHashAverageTimeMicros
	public UDATAPointer _writeHashAverageTimeMicrosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__writeHashAverageTimeMicrosOffset_));
	}

	// UDATA _writeHashContendedResetHash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeHashContendedResetHashOffset_", declaredType="UDATA")
	public UDATA _writeHashContendedResetHash() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__writeHashContendedResetHashOffset_);
	}

	// UDATA _writeHashContendedResetHash
	public UDATAPointer _writeHashContendedResetHashEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__writeHashContendedResetHashOffset_));
	}

	// UDATA _writeHashMaxWaitMicros
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeHashMaxWaitMicrosOffset_", declaredType="UDATA")
	public UDATA _writeHashMaxWaitMicros() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__writeHashMaxWaitMicrosOffset_);
	}

	// UDATA _writeHashMaxWaitMicros
	public UDATAPointer _writeHashMaxWaitMicrosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__writeHashMaxWaitMicrosOffset_));
	}

	// UDATA _writeHashSavedMaxWaitMicros
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeHashSavedMaxWaitMicrosOffset_", declaredType="UDATA")
	public UDATA _writeHashSavedMaxWaitMicros() throws CorruptDataException {
		return getUDATAAtOffset(SH_CacheMap.__writeHashSavedMaxWaitMicrosOffset_);
	}

	// UDATA _writeHashSavedMaxWaitMicros
	public UDATAPointer _writeHashSavedMaxWaitMicrosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__writeHashSavedMaxWaitMicrosOffset_));
	}

	// U64 _writeHashStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeHashStartTimeOffset_", declaredType="U64")
	public UDATA _writeHashStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(SH_CacheMap.__writeHashStartTimeOffset_));
	}

	// U64 _writeHashStartTime
	public UDATAPointer _writeHashStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CacheMap.__writeHashStartTimeOffset_));
	}

}
