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
 * Structure: J9ClassLoaderPointer
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
 * The generated code will provide getters for all elements in the J9ClassLoaderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClassLoader.class)
public class J9ClassLoaderPointer extends StructurePointer {

	// NULL
	public static final J9ClassLoaderPointer NULL = new J9ClassLoaderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClassLoaderPointer(long address) {
		super(address);
	}

	public static J9ClassLoaderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClassLoaderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClassLoaderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClassLoaderPointer(address);
	}

	public J9ClassLoaderPointer add(long count) {
		return J9ClassLoaderPointer.cast(address + (J9ClassLoader.SIZEOF * count));
	}

	public J9ClassLoaderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClassLoaderPointer addOffset(long offset) {
		return J9ClassLoaderPointer.cast(address + offset);
	}

	public J9ClassLoaderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClassLoaderPointer sub(long count) {
		return J9ClassLoaderPointer.cast(address - (J9ClassLoader.SIZEOF * count));
	}

	public J9ClassLoaderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClassLoaderPointer subOffset(long offset) {
		return J9ClassLoaderPointer.cast(address - offset);
	}

	public J9ClassLoaderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClassLoaderPointer untag(long mask) {
		return J9ClassLoaderPointer.cast(address & ~mask);
	}

	public J9ClassLoaderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClassLoader.SIZEOF;
	}

	// Implementation methods

	// J9HashTable* classHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer classHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._classHashTableOffset_));
	}

	// J9HashTable* classHashTable
	public PointerPointer classHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classHashTableOffset_));
	}

	// j9object_t classLoaderObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer classLoaderObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9ClassLoader._classLoaderObjectOffset_));
	}

	// j9object_t classLoaderObject
	public PointerPointer classLoaderObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classLoaderObjectOffset_));
	}

	// J9HashTable* classLocationHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLocationHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer classLocationHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._classLocationHashTableOffset_));
	}

	// J9HashTable* classLocationHashTable
	public PointerPointer classLocationHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classLocationHashTableOffset_));
	}

	// J9ClassPathEntry* classPathEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classPathEntriesOffset_", declaredType="J9ClassPathEntry*")
	public J9ClassPathEntryPointer classPathEntries() throws CorruptDataException {
		return J9ClassPathEntryPointer.cast(getPointerAtOffset(J9ClassLoader._classPathEntriesOffset_));
	}

	// J9ClassPathEntry* classPathEntries
	public PointerPointer classPathEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classPathEntriesOffset_));
	}

	// UDATA classPathEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classPathEntryCountOffset_", declaredType="UDATA")
	public UDATA classPathEntryCount() throws CorruptDataException {
		return getUDATAAtOffset(J9ClassLoader._classPathEntryCountOffset_);
	}

	// UDATA classPathEntryCount
	public UDATAPointer classPathEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassLoader._classPathEntryCountOffset_));
	}

	// J9HashTable* classRelationshipsHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classRelationshipsHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer classRelationshipsHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._classRelationshipsHashTableOffset_));
	}

	// J9HashTable* classRelationshipsHashTable
	public PointerPointer classRelationshipsHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classRelationshipsHashTableOffset_));
	}

	// J9MemorySegment* classSegments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classSegmentsOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer classSegments() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9ClassLoader._classSegmentsOffset_));
	}

	// J9MemorySegment* classSegments
	public PointerPointer classSegmentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._classSegmentsOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9ClassLoader._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassLoader._flagsOffset_));
	}

	// UDATA gcFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcFlagsOffset_", declaredType="UDATA")
	public UDATA gcFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9ClassLoader._gcFlagsOffset_);
	}

	// UDATA gcFlags
	public UDATAPointer gcFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassLoader._gcFlagsOffset_));
	}

	// J9ClassLoader* gcLinkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcLinkNextOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer gcLinkNext() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ClassLoader._gcLinkNextOffset_));
	}

	// J9ClassLoader* gcLinkNext
	public PointerPointer gcLinkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._gcLinkNextOffset_));
	}

	// J9ClassLoader* gcLinkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcLinkPreviousOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer gcLinkPrevious() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ClassLoader._gcLinkPreviousOffset_));
	}

	// J9ClassLoader* gcLinkPrevious
	public PointerPointer gcLinkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._gcLinkPreviousOffset_));
	}

	// volatile UDATA gcRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcRememberedSetOffset_", declaredType="volatile UDATA")
	public UDATA gcRememberedSet() throws CorruptDataException {
		return getUDATAAtOffset(J9ClassLoader._gcRememberedSetOffset_);
	}

	// volatile UDATA gcRememberedSet
	public UDATAPointer gcRememberedSetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassLoader._gcRememberedSetOffset_));
	}

	// J9VMThread* gcThreadNotification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcThreadNotificationOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer gcThreadNotification() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ClassLoader._gcThreadNotificationOffset_));
	}

	// J9VMThread* gcThreadNotification
	public PointerPointer gcThreadNotificationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._gcThreadNotificationOffset_));
	}

	// J9Pool* hotFieldPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer hotFieldPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ClassLoader._hotFieldPoolOffset_));
	}

	// J9Pool* hotFieldPool
	public PointerPointer hotFieldPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._hotFieldPoolOffset_));
	}

	// omrthread_monitor_t hotFieldPoolMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldPoolMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer hotFieldPoolMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9ClassLoader._hotFieldPoolMutexOffset_));
	}

	// omrthread_monitor_t hotFieldPoolMutex
	public PointerPointer hotFieldPoolMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._hotFieldPoolMutexOffset_));
	}

	// J9JITExceptionTable* jitMetaDataList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitMetaDataListOffset_", declaredType="J9JITExceptionTable*")
	public J9JITExceptionTablePointer jitMetaDataList() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(J9ClassLoader._jitMetaDataListOffset_));
	}

	// J9JITExceptionTable* jitMetaDataList
	public PointerPointer jitMetaDataListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._jitMetaDataListOffset_));
	}

	// J9Pool* jniIDs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniIDsOffset_", declaredType="J9Pool*")
	public J9PoolPointer jniIDs() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ClassLoader._jniIDsOffset_));
	}

	// J9Pool* jniIDs
	public PointerPointer jniIDsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._jniIDsOffset_));
	}

	// J9JNIRedirectionBlock* jniRedirectionBlocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniRedirectionBlocksOffset_", declaredType="J9JNIRedirectionBlock*")
	public J9JNIRedirectionBlockPointer jniRedirectionBlocks() throws CorruptDataException {
		return J9JNIRedirectionBlockPointer.cast(getPointerAtOffset(J9ClassLoader._jniRedirectionBlocksOffset_));
	}

	// J9JNIRedirectionBlock* jniRedirectionBlocks
	public PointerPointer jniRedirectionBlocksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._jniRedirectionBlocksOffset_));
	}

	// J9NativeLibrary* librariesHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_librariesHeadOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer librariesHead() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9ClassLoader._librariesHeadOffset_));
	}

	// J9NativeLibrary* librariesHead
	public PointerPointer librariesHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._librariesHeadOffset_));
	}

	// J9NativeLibrary* librariesTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_librariesTailOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer librariesTail() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9ClassLoader._librariesTailOffset_));
	}

	// J9NativeLibrary* librariesTail
	public PointerPointer librariesTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._librariesTailOffset_));
	}

	// J9HashTable* moduleExtraInfoHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleExtraInfoHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer moduleExtraInfoHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._moduleExtraInfoHashTableOffset_));
	}

	// J9HashTable* moduleExtraInfoHashTable
	public PointerPointer moduleExtraInfoHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._moduleExtraInfoHashTableOffset_));
	}

	// J9HashTable* moduleHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer moduleHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._moduleHashTableOffset_));
	}

	// J9HashTable* moduleHashTable
	public PointerPointer moduleHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._moduleHashTableOffset_));
	}

	// J9HashTable* packageHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_packageHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer packageHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._packageHashTableOffset_));
	}

	// J9HashTable* packageHashTable
	public PointerPointer packageHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._packageHashTableOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassLargeBlockFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassLargeBlockFreeListOffset_", declaredType="J9RAMClassFreeListBlock*")
	public J9RAMClassFreeListBlockPointer ramClassLargeBlockFreeList() throws CorruptDataException {
		return J9RAMClassFreeListBlockPointer.cast(getPointerAtOffset(J9ClassLoader._ramClassLargeBlockFreeListOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassLargeBlockFreeList
	public PointerPointer ramClassLargeBlockFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._ramClassLargeBlockFreeListOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassSmallBlockFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassSmallBlockFreeListOffset_", declaredType="J9RAMClassFreeListBlock*")
	public J9RAMClassFreeListBlockPointer ramClassSmallBlockFreeList() throws CorruptDataException {
		return J9RAMClassFreeListBlockPointer.cast(getPointerAtOffset(J9ClassLoader._ramClassSmallBlockFreeListOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassSmallBlockFreeList
	public PointerPointer ramClassSmallBlockFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._ramClassSmallBlockFreeListOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassTinyBlockFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassTinyBlockFreeListOffset_", declaredType="J9RAMClassFreeListBlock*")
	public J9RAMClassFreeListBlockPointer ramClassTinyBlockFreeList() throws CorruptDataException {
		return J9RAMClassFreeListBlockPointer.cast(getPointerAtOffset(J9ClassLoader._ramClassTinyBlockFreeListOffset_));
	}

	// J9RAMClassFreeListBlock* ramClassTinyBlockFreeList
	public PointerPointer ramClassTinyBlockFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._ramClassTinyBlockFreeListOffset_));
	}

	// UDATA* ramClassUDATABlockFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassUDATABlockFreeListOffset_", declaredType="UDATA*")
	public UDATAPointer ramClassUDATABlockFreeList() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9ClassLoader._ramClassUDATABlockFreeListOffset_));
	}

	// UDATA* ramClassUDATABlockFreeList
	public PointerPointer ramClassUDATABlockFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._ramClassUDATABlockFreeListOffset_));
	}

	// J9HashTable* redefinedClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_redefinedClassesOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer redefinedClasses() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._redefinedClassesOffset_));
	}

	// J9HashTable* redefinedClasses
	public PointerPointer redefinedClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._redefinedClassesOffset_));
	}

	// J9HashTable* romClassOrphansHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOrphansHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer romClassOrphansHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9ClassLoader._romClassOrphansHashTableOffset_));
	}

	// J9HashTable* romClassOrphansHashTable
	public PointerPointer romClassOrphansHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._romClassOrphansHashTableOffset_));
	}

	// J9Pool* sharedLibraries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedLibrariesOffset_", declaredType="J9Pool*")
	public J9PoolPointer sharedLibraries() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ClassLoader._sharedLibrariesOffset_));
	}

	// J9Pool* sharedLibraries
	public PointerPointer sharedLibrariesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._sharedLibrariesOffset_));
	}

	// J9ClassLoader* unloadLink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unloadLinkOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer unloadLink() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ClassLoader._unloadLinkOffset_));
	}

	// J9ClassLoader* unloadLink
	public PointerPointer unloadLinkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassLoader._unloadLinkOffset_));
	}

}
