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
 * Structure: J9SharedClassConfigPointer
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
 * The generated code will provide getters for all elements in the J9SharedClassConfigPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedClassConfig.class)
public class J9SharedClassConfigPointer extends StructurePointer {

	// NULL
	public static final J9SharedClassConfigPointer NULL = new J9SharedClassConfigPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedClassConfigPointer(long address) {
		super(address);
	}

	public static J9SharedClassConfigPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedClassConfigPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedClassConfigPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedClassConfigPointer(address);
	}

	public J9SharedClassConfigPointer add(long count) {
		return J9SharedClassConfigPointer.cast(address + (J9SharedClassConfig.SIZEOF * count));
	}

	public J9SharedClassConfigPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedClassConfigPointer addOffset(long offset) {
		return J9SharedClassConfigPointer.cast(address + offset);
	}

	public J9SharedClassConfigPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedClassConfigPointer sub(long count) {
		return J9SharedClassConfigPointer.cast(address - (J9SharedClassConfig.SIZEOF * count));
	}

	public J9SharedClassConfigPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedClassConfigPointer subOffset(long offset) {
		return J9SharedClassConfigPointer.cast(address - offset);
	}

	public J9SharedClassConfigPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedClassConfigPointer untag(long mask) {
		return J9SharedClassConfigPointer.cast(address & ~mask);
	}

	public J9SharedClassConfigPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedClassConfig.SIZEOF;
	}

	// Implementation methods

	// void* acquirePrivateSharedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_acquirePrivateSharedDataOffset_", declaredType="void*")
	public VoidPointer acquirePrivateSharedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._acquirePrivateSharedDataOffset_));
	}

	// void* acquirePrivateSharedData
	public PointerPointer acquirePrivateSharedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._acquirePrivateSharedDataOffset_));
	}

	// void* bootstrapCPI
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bootstrapCPIOffset_", declaredType="void*")
	public VoidPointer bootstrapCPI() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._bootstrapCPIOffset_));
	}

	// void* bootstrapCPI
	public PointerPointer bootstrapCPIEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._bootstrapCPIOffset_));
	}

	// J9SharedClassCacheDescriptor* cacheDescriptorList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheDescriptorListOffset_", declaredType="J9SharedClassCacheDescriptor*")
	public J9SharedClassCacheDescriptorPointer cacheDescriptorList() throws CorruptDataException {
		return J9SharedClassCacheDescriptorPointer.cast(getPointerAtOffset(J9SharedClassConfig._cacheDescriptorListOffset_));
	}

	// J9SharedClassCacheDescriptor* cacheDescriptorList
	public PointerPointer cacheDescriptorListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._cacheDescriptorListOffset_));
	}

	// const U8* cacheName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheNameOffset_", declaredType="const U8*")
	public U8Pointer cacheName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedClassConfig._cacheNameOffset_));
	}

	// const U8* cacheName
	public PointerPointer cacheNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._cacheNameOffset_));
	}

	// J9Pool* classnameFilterPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classnameFilterPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer classnameFilterPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SharedClassConfig._classnameFilterPoolOffset_));
	}

	// J9Pool* classnameFilterPool
	public PointerPointer classnameFilterPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._classnameFilterPoolOffset_));
	}

	// UDATA configLockWord
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configLockWordOffset_", declaredType="UDATA")
	public UDATA configLockWord() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassConfig._configLockWordOffset_);
	}

	// UDATA configLockWord
	public UDATAPointer configLockWordEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._configLockWordOffset_));
	}

	// omrthread_monitor_t configMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer configMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9SharedClassConfig._configMonitorOffset_));
	}

	// omrthread_monitor_t configMonitor
	public PointerPointer configMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._configMonitorOffset_));
	}

	// const U8* ctrlDirName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ctrlDirNameOffset_", declaredType="const U8*")
	public U8Pointer ctrlDirName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedClassConfig._ctrlDirNameOffset_));
	}

	// const U8* ctrlDirName
	public PointerPointer ctrlDirNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._ctrlDirNameOffset_));
	}

	// void* existsCachedCodeForROMMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_existsCachedCodeForROMMethodOffset_", declaredType="void*")
	public VoidPointer existsCachedCodeForROMMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._existsCachedCodeForROMMethodOffset_));
	}

	// void* existsCachedCodeForROMMethod
	public PointerPointer existsCachedCodeForROMMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._existsCachedCodeForROMMethodOffset_));
	}

	// void* findAttachedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findAttachedDataOffset_", declaredType="void*")
	public VoidPointer findAttachedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._findAttachedDataOffset_));
	}

	// void* findAttachedData
	public PointerPointer findAttachedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._findAttachedDataOffset_));
	}

	// UDATA findClassCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findClassCntrOffset_", declaredType="UDATA")
	public UDATA findClassCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassConfig._findClassCntrOffset_);
	}

	// UDATA findClassCntr
	public UDATAPointer findClassCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._findClassCntrOffset_));
	}

	// void* findCompiledMethodEx1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findCompiledMethodEx1Offset_", declaredType="void*")
	public VoidPointer findCompiledMethodEx1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._findCompiledMethodEx1Offset_));
	}

	// void* findCompiledMethodEx1
	public PointerPointer findCompiledMethodEx1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._findCompiledMethodEx1Offset_));
	}

	// void* findGCHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findGCHintsOffset_", declaredType="void*")
	public VoidPointer findGCHints() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._findGCHintsOffset_));
	}

	// void* findGCHints
	public PointerPointer findGCHintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._findGCHintsOffset_));
	}

	// void* findSharedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findSharedDataOffset_", declaredType="void*")
	public VoidPointer findSharedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._findSharedDataOffset_));
	}

	// void* findSharedData
	public PointerPointer findSharedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._findSharedDataOffset_));
	}

	// void* freeAttachedDataDescriptor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeAttachedDataDescriptorOffset_", declaredType="void*")
	public VoidPointer freeAttachedDataDescriptor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._freeAttachedDataDescriptorOffset_));
	}

	// void* freeAttachedDataDescriptor
	public PointerPointer freeAttachedDataDescriptorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._freeAttachedDataDescriptorOffset_));
	}

	// void* freeClasspathData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeClasspathDataOffset_", declaredType="void*")
	public VoidPointer freeClasspathData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._freeClasspathDataOffset_));
	}

	// void* freeClasspathData
	public PointerPointer freeClasspathDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._freeClasspathDataOffset_));
	}

	// void* getCacheSizeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getCacheSizeBytesOffset_", declaredType="void*")
	public VoidPointer getCacheSizeBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getCacheSizeBytesOffset_));
	}

	// void* getCacheSizeBytes
	public PointerPointer getCacheSizeBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getCacheSizeBytesOffset_));
	}

	// void* getFreeSpaceBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFreeSpaceBytesOffset_", declaredType="void*")
	public VoidPointer getFreeSpaceBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getFreeSpaceBytesOffset_));
	}

	// void* getFreeSpaceBytes
	public PointerPointer getFreeSpaceBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getFreeSpaceBytesOffset_));
	}

	// void* getJavacoreData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJavacoreDataOffset_", declaredType="void*")
	public VoidPointer getJavacoreData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getJavacoreDataOffset_));
	}

	// void* getJavacoreData
	public PointerPointer getJavacoreDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getJavacoreDataOffset_));
	}

	// void* getMinMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getMinMaxBytesOffset_", declaredType="void*")
	public VoidPointer getMinMaxBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getMinMaxBytesOffset_));
	}

	// void* getMinMaxBytes
	public PointerPointer getMinMaxBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getMinMaxBytesOffset_));
	}

	// void* getSharedClassCacheMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getSharedClassCacheModeOffset_", declaredType="void*")
	public VoidPointer getSharedClassCacheMode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getSharedClassCacheModeOffset_));
	}

	// void* getSharedClassCacheMode
	public PointerPointer getSharedClassCacheModeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getSharedClassCacheModeOffset_));
	}

	// void* getTotalUsableCacheBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getTotalUsableCacheBytesOffset_", declaredType="void*")
	public VoidPointer getTotalUsableCacheBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getTotalUsableCacheBytesOffset_));
	}

	// void* getTotalUsableCacheBytes
	public PointerPointer getTotalUsableCacheBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getTotalUsableCacheBytesOffset_));
	}

	// void* getUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getUnstoredBytesOffset_", declaredType="void*")
	public VoidPointer getUnstoredBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._getUnstoredBytesOffset_));
	}

	// void* getUnstoredBytes
	public PointerPointer getUnstoredBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._getUnstoredBytesOffset_));
	}

	// void* increaseUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_increaseUnstoredBytesOffset_", declaredType="void*")
	public VoidPointer increaseUnstoredBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._increaseUnstoredBytesOffset_));
	}

	// void* increaseUnstoredBytes
	public PointerPointer increaseUnstoredBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._increaseUnstoredBytesOffset_));
	}

	// void* isBCIEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isBCIEnabledOffset_", declaredType="void*")
	public VoidPointer isBCIEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._isBCIEnabledOffset_));
	}

	// void* isBCIEnabled
	public PointerPointer isBCIEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._isBCIEnabledOffset_));
	}

	// omrthread_monitor_t jclCacheMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclCacheMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer jclCacheMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclCacheMutexOffset_));
	}

	// omrthread_monitor_t jclCacheMutex
	public PointerPointer jclCacheMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclCacheMutexOffset_));
	}

	// J9Pool* jclClasspathCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclClasspathCacheOffset_", declaredType="J9Pool*")
	public J9PoolPointer jclClasspathCache() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclClasspathCacheOffset_));
	}

	// J9Pool* jclClasspathCache
	public PointerPointer jclClasspathCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclClasspathCacheOffset_));
	}

	// J9Pool* jclJ9ClassPathEntryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclJ9ClassPathEntryPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer jclJ9ClassPathEntryPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclJ9ClassPathEntryPoolOffset_));
	}

	// J9Pool* jclJ9ClassPathEntryPool
	public PointerPointer jclJ9ClassPathEntryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclJ9ClassPathEntryPoolOffset_));
	}

	// J9SharedStringFarm* jclStringFarm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclStringFarmOffset_", declaredType="J9SharedStringFarm*")
	public J9SharedStringFarmPointer jclStringFarm() throws CorruptDataException {
		return J9SharedStringFarmPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclStringFarmOffset_));
	}

	// J9SharedStringFarm* jclStringFarm
	public PointerPointer jclStringFarmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclStringFarmOffset_));
	}

	// J9Pool* jclTokenCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclTokenCacheOffset_", declaredType="J9Pool*")
	public J9PoolPointer jclTokenCache() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclTokenCacheOffset_));
	}

	// J9Pool* jclTokenCache
	public PointerPointer jclTokenCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclTokenCacheOffset_));
	}

	// J9Pool* jclURLCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclURLCacheOffset_", declaredType="J9Pool*")
	public J9PoolPointer jclURLCache() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SharedClassConfig._jclURLCacheOffset_));
	}

	// J9Pool* jclURLCache
	public PointerPointer jclURLCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclURLCacheOffset_));
	}

	// J9HashTable* jclURLHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclURLHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer jclURLHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9SharedClassConfig._jclURLHashTableOffset_));
	}

	// J9HashTable* jclURLHashTable
	public PointerPointer jclURLHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclURLHashTableOffset_));
	}

	// J9HashTable* jclUTF8HashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclUTF8HashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer jclUTF8HashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9SharedClassConfig._jclUTF8HashTableOffset_));
	}

	// J9HashTable* jclUTF8HashTable
	public PointerPointer jclUTF8HashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jclUTF8HashTableOffset_));
	}

	// void* jvmPhaseChange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmPhaseChangeOffset_", declaredType="void*")
	public VoidPointer jvmPhaseChange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._jvmPhaseChangeOffset_));
	}

	// void* jvmPhaseChange
	public PointerPointer jvmPhaseChangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._jvmPhaseChangeOffset_));
	}

	// J9ClassPathEntry* lastBootstrapCPE
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastBootstrapCPEOffset_", declaredType="J9ClassPathEntry*")
	public J9ClassPathEntryPointer lastBootstrapCPE() throws CorruptDataException {
		return J9ClassPathEntryPointer.cast(getPointerAtOffset(J9SharedClassConfig._lastBootstrapCPEOffset_));
	}

	// J9ClassPathEntry* lastBootstrapCPE
	public PointerPointer lastBootstrapCPEEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._lastBootstrapCPEOffset_));
	}

	// I8 layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_layerOffset_", declaredType="I8")
	public I8 layer() throws CorruptDataException {
		return new I8(getByteAtOffset(J9SharedClassConfig._layerOffset_));
	}

	// I8 layer
	public I8Pointer layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(J9SharedClassConfig._layerOffset_));
	}

	// J9SharedLocalStartupHints localStartupHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localStartupHintsOffset_", declaredType="J9SharedLocalStartupHints")
	public J9SharedLocalStartupHintsPointer localStartupHints() throws CorruptDataException {
		return J9SharedLocalStartupHintsPointer.cast(nonNullFieldEA(J9SharedClassConfig._localStartupHintsOffset_));
	}

	// J9SharedLocalStartupHints localStartupHints
	public PointerPointer localStartupHintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._localStartupHintsOffset_));
	}

	// I32 maxAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxAOTOffset_", declaredType="I32")
	public IDATA maxAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedClassConfig._maxAOTOffset_));
	}

	// I32 maxAOT
	public IDATAPointer maxAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._maxAOTOffset_));
	}

	// I32 maxJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxJITOffset_", declaredType="I32")
	public IDATA maxJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedClassConfig._maxJITOffset_));
	}

	// I32 maxJIT
	public IDATAPointer maxJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._maxJITOffset_));
	}

	// J9MemorySegment* metadataMemorySegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metadataMemorySegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer metadataMemorySegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9SharedClassConfig._metadataMemorySegmentOffset_));
	}

	// J9MemorySegment* metadataMemorySegment
	public PointerPointer metadataMemorySegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._metadataMemorySegmentOffset_));
	}

	// I32 minAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minAOTOffset_", declaredType="I32")
	public IDATA minAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedClassConfig._minAOTOffset_));
	}

	// I32 minAOT
	public IDATAPointer minAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._minAOTOffset_));
	}

	// I32 minJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minJITOffset_", declaredType="I32")
	public IDATA minJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedClassConfig._minJITOffset_));
	}

	// I32 minJIT
	public IDATAPointer minJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._minJITOffset_));
	}

	// const J9UTF8* modContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modContextOffset_", declaredType="const J9UTF8*")
	public J9UTF8Pointer modContext() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9SharedClassConfig._modContextOffset_));
	}

	// const J9UTF8* modContext
	public PointerPointer modContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._modContextOffset_));
	}

	// U64 readOnlyCacheRuntimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readOnlyCacheRuntimeFlagsOffset_", declaredType="U64")
	public UDATA readOnlyCacheRuntimeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9SharedClassConfig._readOnlyCacheRuntimeFlagsOffset_));
	}

	// U64 readOnlyCacheRuntimeFlags
	public UDATAPointer readOnlyCacheRuntimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._readOnlyCacheRuntimeFlagsOffset_));
	}

	// void* releasePrivateSharedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_releasePrivateSharedDataOffset_", declaredType="void*")
	public VoidPointer releasePrivateSharedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._releasePrivateSharedDataOffset_));
	}

	// void* releasePrivateSharedData
	public PointerPointer releasePrivateSharedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._releasePrivateSharedDataOffset_));
	}

	// U64 runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsOffset_", declaredType="U64")
	public UDATA runtimeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9SharedClassConfig._runtimeFlagsOffset_));
	}

	// U64 runtimeFlags
	public UDATAPointer runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._runtimeFlagsOffset_));
	}

	// void* setMinMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setMinMaxBytesOffset_", declaredType="void*")
	public VoidPointer setMinMaxBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._setMinMaxBytesOffset_));
	}

	// void* setMinMaxBytes
	public PointerPointer setMinMaxBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._setMinMaxBytesOffset_));
	}

	// void* sharedAPIObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedAPIObjectOffset_", declaredType="void*")
	public VoidPointer sharedAPIObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._sharedAPIObjectOffset_));
	}

	// void* sharedAPIObject
	public PointerPointer sharedAPIObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._sharedAPIObjectOffset_));
	}

	// SH_CacheMap* sharedClassCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassCacheOffset_", declaredType="SH_CacheMap*")
	public SH_CacheMapPointer sharedClassCache() throws CorruptDataException {
		return SH_CacheMapPointer.cast(getPointerAtOffset(J9SharedClassConfig._sharedClassCacheOffset_));
	}

	// SH_CacheMap* sharedClassCache
	public PointerPointer sharedClassCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._sharedClassCacheOffset_));
	}

	// U32 softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="U32")
	public UDATA softMaxBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedClassConfig._softMaxBytesOffset_));
	}

	// U32 softMaxBytes
	public UDATAPointer softMaxBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._softMaxBytesOffset_));
	}

	// void* storeAttachedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeAttachedDataOffset_", declaredType="void*")
	public VoidPointer storeAttachedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._storeAttachedDataOffset_));
	}

	// void* storeAttachedData
	public PointerPointer storeAttachedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._storeAttachedDataOffset_));
	}

	// void* storeCompiledMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeCompiledMethodOffset_", declaredType="void*")
	public VoidPointer storeCompiledMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._storeCompiledMethodOffset_));
	}

	// void* storeCompiledMethod
	public PointerPointer storeCompiledMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._storeCompiledMethodOffset_));
	}

	// void* storeGCHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeGCHintsOffset_", declaredType="void*")
	public VoidPointer storeGCHints() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._storeGCHintsOffset_));
	}

	// void* storeGCHints
	public PointerPointer storeGCHintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._storeGCHintsOffset_));
	}

	// void* storeSharedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeSharedDataOffset_", declaredType="void*")
	public VoidPointer storeSharedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._storeSharedDataOffset_));
	}

	// void* storeSharedData
	public PointerPointer storeSharedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._storeSharedDataOffset_));
	}

	// void* updateAttachedData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateAttachedDataOffset_", declaredType="void*")
	public VoidPointer updateAttachedData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._updateAttachedDataOffset_));
	}

	// void* updateAttachedData
	public PointerPointer updateAttachedDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._updateAttachedDataOffset_));
	}

	// void* updateAttachedUDATA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateAttachedUDATAOffset_", declaredType="void*")
	public VoidPointer updateAttachedUDATA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._updateAttachedUDATAOffset_));
	}

	// void* updateAttachedUDATA
	public PointerPointer updateAttachedUDATAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._updateAttachedUDATAOffset_));
	}

	// void* updateClasspathOpenState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateClasspathOpenStateOffset_", declaredType="void*")
	public VoidPointer updateClasspathOpenState() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassConfig._updateClasspathOpenStateOffset_));
	}

	// void* updateClasspathOpenState
	public PointerPointer updateClasspathOpenStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassConfig._updateClasspathOpenStateOffset_));
	}

	// UDATA verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseFlagsOffset_", declaredType="UDATA")
	public UDATA verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassConfig._verboseFlagsOffset_);
	}

	// UDATA verboseFlags
	public UDATAPointer verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassConfig._verboseFlagsOffset_));
	}

}
