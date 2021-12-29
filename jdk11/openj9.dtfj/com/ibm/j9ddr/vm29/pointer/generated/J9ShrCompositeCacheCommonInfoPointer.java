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
 * Structure: J9ShrCompositeCacheCommonInfoPointer
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
 * The generated code will provide getters for all elements in the J9ShrCompositeCacheCommonInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ShrCompositeCacheCommonInfo.class)
public class J9ShrCompositeCacheCommonInfoPointer extends StructurePointer {

	// NULL
	public static final J9ShrCompositeCacheCommonInfoPointer NULL = new J9ShrCompositeCacheCommonInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ShrCompositeCacheCommonInfoPointer(long address) {
		super(address);
	}

	public static J9ShrCompositeCacheCommonInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ShrCompositeCacheCommonInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ShrCompositeCacheCommonInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ShrCompositeCacheCommonInfoPointer(address);
	}

	public J9ShrCompositeCacheCommonInfoPointer add(long count) {
		return J9ShrCompositeCacheCommonInfoPointer.cast(address + (J9ShrCompositeCacheCommonInfo.SIZEOF * count));
	}

	public J9ShrCompositeCacheCommonInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ShrCompositeCacheCommonInfoPointer addOffset(long offset) {
		return J9ShrCompositeCacheCommonInfoPointer.cast(address + offset);
	}

	public J9ShrCompositeCacheCommonInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ShrCompositeCacheCommonInfoPointer sub(long count) {
		return J9ShrCompositeCacheCommonInfoPointer.cast(address - (J9ShrCompositeCacheCommonInfo.SIZEOF * count));
	}

	public J9ShrCompositeCacheCommonInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ShrCompositeCacheCommonInfoPointer subOffset(long offset) {
		return J9ShrCompositeCacheCommonInfoPointer.cast(address - offset);
	}

	public J9ShrCompositeCacheCommonInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ShrCompositeCacheCommonInfoPointer untag(long mask) {
		return J9ShrCompositeCacheCommonInfoPointer.cast(address & ~mask);
	}

	public J9ShrCompositeCacheCommonInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ShrCompositeCacheCommonInfo.SIZEOF;
	}

	// Implementation methods

	// UDATA cacheIsCorrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheIsCorruptOffset_", declaredType="UDATA")
	public UDATA cacheIsCorrupt() throws CorruptDataException {
		return getUDATAAtOffset(J9ShrCompositeCacheCommonInfo._cacheIsCorruptOffset_);
	}

	// UDATA cacheIsCorrupt
	public UDATAPointer cacheIsCorruptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._cacheIsCorruptOffset_));
	}

	// J9VMThread* hasRWMutexThreadMprotectAll
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasRWMutexThreadMprotectAllOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer hasRWMutexThreadMprotectAll() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ShrCompositeCacheCommonInfo._hasRWMutexThreadMprotectAllOffset_));
	}

	// J9VMThread* hasRWMutexThreadMprotectAll
	public PointerPointer hasRWMutexThreadMprotectAllEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._hasRWMutexThreadMprotectAllOffset_));
	}

	// J9VMThread* hasReadWriteMutexThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasReadWriteMutexThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer hasReadWriteMutexThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ShrCompositeCacheCommonInfo._hasReadWriteMutexThreadOffset_));
	}

	// J9VMThread* hasReadWriteMutexThread
	public PointerPointer hasReadWriteMutexThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._hasReadWriteMutexThreadOffset_));
	}

	// J9VMThread* hasRefreshMutexThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasRefreshMutexThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer hasRefreshMutexThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ShrCompositeCacheCommonInfo._hasRefreshMutexThreadOffset_));
	}

	// J9VMThread* hasRefreshMutexThread
	public PointerPointer hasRefreshMutexThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._hasRefreshMutexThreadOffset_));
	}

	// J9VMThread* hasWriteMutexThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasWriteMutexThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer hasWriteMutexThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ShrCompositeCacheCommonInfo._hasWriteMutexThreadOffset_));
	}

	// J9VMThread* hasWriteMutexThread
	public PointerPointer hasWriteMutexThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._hasWriteMutexThreadOffset_));
	}

	// UDATA oldWriterCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldWriterCountOffset_", declaredType="UDATA")
	public UDATA oldWriterCount() throws CorruptDataException {
		return getUDATAAtOffset(J9ShrCompositeCacheCommonInfo._oldWriterCountOffset_);
	}

	// UDATA oldWriterCount
	public UDATAPointer oldWriterCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._oldWriterCountOffset_));
	}

	// U32 readWriteAreaMutexID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteAreaMutexIDOffset_", declaredType="U32")
	public UDATA readWriteAreaMutexID() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ShrCompositeCacheCommonInfo._readWriteAreaMutexIDOffset_));
	}

	// U32 readWriteAreaMutexID
	public UDATAPointer readWriteAreaMutexIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._readWriteAreaMutexIDOffset_));
	}

	// UDATA stringTableStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringTableStartedOffset_", declaredType="UDATA")
	public UDATA stringTableStarted() throws CorruptDataException {
		return getUDATAAtOffset(J9ShrCompositeCacheCommonInfo._stringTableStartedOffset_);
	}

	// UDATA stringTableStarted
	public UDATAPointer stringTableStartedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._stringTableStartedOffset_));
	}

	// U16 vmID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmIDOffset_", declaredType="U16")
	public U16 vmID() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ShrCompositeCacheCommonInfo._vmIDOffset_));
	}

	// U16 vmID
	public U16Pointer vmIDEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._vmIDOffset_));
	}

	// omrthread_tls_key_t writeMutexEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeMutexEntryCountOffset_", declaredType="omrthread_tls_key_t")
	public UDATA writeMutexEntryCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ShrCompositeCacheCommonInfo._writeMutexEntryCountOffset_));
	}

	// omrthread_tls_key_t writeMutexEntryCount
	public UDATAPointer writeMutexEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._writeMutexEntryCountOffset_));
	}

	// U32 writeMutexID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeMutexIDOffset_", declaredType="U32")
	public UDATA writeMutexID() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ShrCompositeCacheCommonInfo._writeMutexIDOffset_));
	}

	// U32 writeMutexID
	public UDATAPointer writeMutexIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ShrCompositeCacheCommonInfo._writeMutexIDOffset_));
	}

}
