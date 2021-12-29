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
 * Structure: OSCache_mmap_header2Pointer
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
 * The generated code will provide getters for all elements in the OSCache_mmap_header2Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OSCache_mmap_header2.class)
public class OSCache_mmap_header2Pointer extends StructurePointer {

	// NULL
	public static final OSCache_mmap_header2Pointer NULL = new OSCache_mmap_header2Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OSCache_mmap_header2Pointer(long address) {
		super(address);
	}

	public static OSCache_mmap_header2Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OSCache_mmap_header2Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OSCache_mmap_header2Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OSCache_mmap_header2Pointer(address);
	}

	public OSCache_mmap_header2Pointer add(long count) {
		return OSCache_mmap_header2Pointer.cast(address + (OSCache_mmap_header2.SIZEOF * count));
	}

	public OSCache_mmap_header2Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public OSCache_mmap_header2Pointer addOffset(long offset) {
		return OSCache_mmap_header2Pointer.cast(address + offset);
	}

	public OSCache_mmap_header2Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OSCache_mmap_header2Pointer sub(long count) {
		return OSCache_mmap_header2Pointer.cast(address - (OSCache_mmap_header2.SIZEOF * count));
	}

	public OSCache_mmap_header2Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OSCache_mmap_header2Pointer subOffset(long offset) {
		return OSCache_mmap_header2Pointer.cast(address - offset);
	}

	public OSCache_mmap_header2Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OSCache_mmap_header2Pointer untag(long mask) {
		return OSCache_mmap_header2Pointer.cast(address & ~mask);
	}

	public OSCache_mmap_header2Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OSCache_mmap_header2.SIZEOF;
	}

	// Implementation methods

	// I32 attachLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachLockOffset_", declaredType="I32")
	public IDATA attachLock() throws CorruptDataException {
		return new I32(getIntAtOffset(OSCache_mmap_header2._attachLockOffset_));
	}

	// I32 attachLock
	public IDATAPointer attachLockEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_mmap_header2._attachLockOffset_));
	}

	// I64 createTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createTimeOffset_", declaredType="I64")
	public IDATA createTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OSCache_mmap_header2._createTimeOffset_));
	}

	// I64 createTime
	public IDATAPointer createTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_mmap_header2._createTimeOffset_));
	}

	// I32[] dataLocks
	public IDATAPointer dataLocksEA() throws CorruptDataException {
		return I32Pointer.cast(nonNullFieldEA(OSCache_mmap_header2._dataLocksOffset_));
	}

	// U8[] eyecatcher
	public U8Pointer eyecatcherEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(OSCache_mmap_header2._eyecatcherOffset_));
	}

	// I32 headerLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerLockOffset_", declaredType="I32")
	public IDATA headerLock() throws CorruptDataException {
		return new I32(getIntAtOffset(OSCache_mmap_header2._headerLockOffset_));
	}

	// I32 headerLock
	public IDATAPointer headerLockEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_mmap_header2._headerLockOffset_));
	}

	// I64 lastAttachedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastAttachedTimeOffset_", declaredType="I64")
	public IDATA lastAttachedTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OSCache_mmap_header2._lastAttachedTimeOffset_));
	}

	// I64 lastAttachedTime
	public IDATAPointer lastAttachedTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_mmap_header2._lastAttachedTimeOffset_));
	}

	// I64 lastDetachedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastDetachedTimeOffset_", declaredType="I64")
	public IDATA lastDetachedTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OSCache_mmap_header2._lastDetachedTimeOffset_));
	}

	// I64 lastDetachedTime
	public IDATAPointer lastDetachedTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_mmap_header2._lastDetachedTimeOffset_));
	}

	// OSCache_header2 oscHdr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oscHdrOffset_", declaredType="OSCache_header2")
	public OSCache_header2Pointer oscHdr() throws CorruptDataException {
		return OSCache_header2Pointer.cast(nonNullFieldEA(OSCache_mmap_header2._oscHdrOffset_));
	}

	// OSCache_header2 oscHdr
	public PointerPointer oscHdrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OSCache_mmap_header2._oscHdrOffset_));
	}

	// U32[] unused32
	public UDATAPointer unused32EA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(OSCache_mmap_header2._unused32Offset_));
	}

	// U64[] unused64
	public UDATAPointer unused64EA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(OSCache_mmap_header2._unused64Offset_));
	}

}
