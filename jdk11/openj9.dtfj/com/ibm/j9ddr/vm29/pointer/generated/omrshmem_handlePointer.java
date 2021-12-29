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
 * Structure: omrshmem_handlePointer
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
 * The generated code will provide getters for all elements in the omrshmem_handlePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=omrshmem_handle.class)
public class omrshmem_handlePointer extends StructurePointer {

	// NULL
	public static final omrshmem_handlePointer NULL = new omrshmem_handlePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected omrshmem_handlePointer(long address) {
		super(address);
	}

	public static omrshmem_handlePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static omrshmem_handlePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static omrshmem_handlePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new omrshmem_handlePointer(address);
	}

	public omrshmem_handlePointer add(long count) {
		return omrshmem_handlePointer.cast(address + (omrshmem_handle.SIZEOF * count));
	}

	public omrshmem_handlePointer add(Scalar count) {
		return add(count.longValue());
	}

	public omrshmem_handlePointer addOffset(long offset) {
		return omrshmem_handlePointer.cast(address + offset);
	}

	public omrshmem_handlePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public omrshmem_handlePointer sub(long count) {
		return omrshmem_handlePointer.cast(address - (omrshmem_handle.SIZEOF * count));
	}

	public omrshmem_handlePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public omrshmem_handlePointer subOffset(long offset) {
		return omrshmem_handlePointer.cast(address - offset);
	}

	public omrshmem_handlePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public omrshmem_handlePointer untag(long mask) {
		return omrshmem_handlePointer.cast(address & ~mask);
	}

	public omrshmem_handlePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return omrshmem_handle.SIZEOF;
	}

	// Implementation methods

	// U8* baseFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseFileNameOffset_", declaredType="U8*")
	public U8Pointer baseFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(omrshmem_handle._baseFileNameOffset_));
	}

	// U8* baseFileName
	public PointerPointer baseFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(omrshmem_handle._baseFileNameOffset_));
	}

	// OMRMemCategory* category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="OMRMemCategory*")
	public OMRMemCategoryPointer category() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(getPointerAtOffset(omrshmem_handle._categoryOffset_));
	}

	// OMRMemCategory* category
	public PointerPointer categoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(omrshmem_handle._categoryOffset_));
	}

	// U64 controlStorageProtectKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_controlStorageProtectKeyOffset_", declaredType="U64")
	public UDATA controlStorageProtectKey() throws CorruptDataException {
		return new U64(getLongAtOffset(omrshmem_handle._controlStorageProtectKeyOffset_));
	}

	// U64 controlStorageProtectKey
	public UDATAPointer controlStorageProtectKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrshmem_handle._controlStorageProtectKeyOffset_));
	}

	// U64 currentStorageProtectKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentStorageProtectKeyOffset_", declaredType="U64")
	public UDATA currentStorageProtectKey() throws CorruptDataException {
		return new U64(getLongAtOffset(omrshmem_handle._currentStorageProtectKeyOffset_));
	}

	// U64 currentStorageProtectKey
	public UDATAPointer currentStorageProtectKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrshmem_handle._currentStorageProtectKeyOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(omrshmem_handle._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrshmem_handle._flagsOffset_));
	}

	// I32 perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permOffset_", declaredType="I32")
	public IDATA perm() throws CorruptDataException {
		return new I32(getIntAtOffset(omrshmem_handle._permOffset_));
	}

	// I32 perm
	public IDATAPointer permEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_handle._permOffset_));
	}

	// void* regionStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_regionStartOffset_", declaredType="void*")
	public VoidPointer regionStart() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(omrshmem_handle._regionStartOffset_));
	}

	// void* regionStart
	public PointerPointer regionStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(omrshmem_handle._regionStartOffset_));
	}

	// I32 shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmidOffset_", declaredType="I32")
	public IDATA shmid() throws CorruptDataException {
		return new I32(getIntAtOffset(omrshmem_handle._shmidOffset_));
	}

	// I32 shmid
	public IDATAPointer shmidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_handle._shmidOffset_));
	}

	// U64 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U64")
	public UDATA size() throws CorruptDataException {
		return new U64(getLongAtOffset(omrshmem_handle._sizeOffset_));
	}

	// U64 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrshmem_handle._sizeOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(omrshmem_handle._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_handle._timestampOffset_));
	}

}
