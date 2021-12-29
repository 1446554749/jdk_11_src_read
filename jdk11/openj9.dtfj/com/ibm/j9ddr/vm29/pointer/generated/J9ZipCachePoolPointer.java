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
 * Structure: J9ZipCachePoolPointer
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
 * The generated code will provide getters for all elements in the J9ZipCachePoolPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ZipCachePool.class)
public class J9ZipCachePoolPointer extends StructurePointer {

	// NULL
	public static final J9ZipCachePoolPointer NULL = new J9ZipCachePoolPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ZipCachePoolPointer(long address) {
		super(address);
	}

	public static J9ZipCachePoolPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ZipCachePoolPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ZipCachePoolPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ZipCachePoolPointer(address);
	}

	public J9ZipCachePoolPointer add(long count) {
		return J9ZipCachePoolPointer.cast(address + (J9ZipCachePool.SIZEOF * count));
	}

	public J9ZipCachePoolPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ZipCachePoolPointer addOffset(long offset) {
		return J9ZipCachePoolPointer.cast(address + offset);
	}

	public J9ZipCachePoolPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ZipCachePoolPointer sub(long count) {
		return J9ZipCachePoolPointer.cast(address - (J9ZipCachePool.SIZEOF * count));
	}

	public J9ZipCachePoolPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ZipCachePoolPointer subOffset(long offset) {
		return J9ZipCachePoolPointer.cast(address - offset);
	}

	public J9ZipCachePoolPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ZipCachePoolPointer untag(long mask) {
		return J9ZipCachePoolPointer.cast(address & ~mask);
	}

	public J9ZipCachePoolPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ZipCachePool.SIZEOF;
	}

	// Implementation methods

	// BOOLEAN allocateWorkBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateWorkBufferOffset_", declaredType="BOOLEAN")
	public UDATA allocateWorkBuffer() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipCachePool._allocateWorkBufferOffset_));
	}

	// BOOLEAN allocateWorkBuffer
	public UDATAPointer allocateWorkBufferEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipCachePool._allocateWorkBufferOffset_));
	}

	// J9ZipCache* desiredCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_desiredCacheOffset_", declaredType="J9ZipCache*")
	public J9ZipCachePointer desiredCache() throws CorruptDataException {
		return J9ZipCachePointer.cast(getPointerAtOffset(J9ZipCachePool._desiredCacheOffset_));
	}

	// J9ZipCache* desiredCache
	public PointerPointer desiredCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._desiredCacheOffset_));
	}

	// IDATA hookInitRC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInitRCOffset_", declaredType="IDATA")
	public IDATA hookInitRC() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCachePool._hookInitRCOffset_);
	}

	// IDATA hookInitRC
	public IDATAPointer hookInitRCEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCachePool._hookInitRCOffset_));
	}

	// J9VMZipCachePoolHookInterface hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInterfaceOffset_", declaredType="J9VMZipCachePoolHookInterface")
	public J9VMZipCachePoolHookInterfacePointer hookInterface() throws CorruptDataException {
		return J9VMZipCachePoolHookInterfacePointer.cast(nonNullFieldEA(J9ZipCachePool._hookInterfaceOffset_));
	}

	// J9VMZipCachePoolHookInterface hookInterface
	public PointerPointer hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._hookInterfaceOffset_));
	}

	// MUTEX mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="MUTEX")
	public _opaque_pthread_mutex_tPointer mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9ZipCachePool._mutexOffset_));
	}

	// MUTEX mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._mutexOffset_));
	}

	// J9Pool* pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ZipCachePool._poolOffset_));
	}

	// J9Pool* pool
	public PointerPointer poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._poolOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ZipCachePool._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._userDataOffset_));
	}

	// UDATA* workBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workBufferOffset_", declaredType="UDATA*")
	public UDATAPointer workBuffer() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9ZipCachePool._workBufferOffset_));
	}

	// UDATA* workBuffer
	public PointerPointer workBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._workBufferOffset_));
	}

	// const U8* zipFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipFileNameOffset_", declaredType="const U8*")
	public U8Pointer zipFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipCachePool._zipFileNameOffset_));
	}

	// const U8* zipFileName
	public PointerPointer zipFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCachePool._zipFileNameOffset_));
	}

	// IDATA zipFileNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipFileNameLengthOffset_", declaredType="IDATA")
	public IDATA zipFileNameLength() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCachePool._zipFileNameLengthOffset_);
	}

	// IDATA zipFileNameLength
	public IDATAPointer zipFileNameLengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCachePool._zipFileNameLengthOffset_));
	}

	// IDATA zipFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipFileSizeOffset_", declaredType="IDATA")
	public IDATA zipFileSize() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCachePool._zipFileSizeOffset_);
	}

	// IDATA zipFileSize
	public IDATAPointer zipFileSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCachePool._zipFileSizeOffset_));
	}

	// I64 zipTimeStamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipTimeStampOffset_", declaredType="I64")
	public IDATA zipTimeStamp() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ZipCachePool._zipTimeStampOffset_));
	}

	// I64 zipTimeStamp
	public IDATAPointer zipTimeStampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCachePool._zipTimeStampOffset_));
	}

}
