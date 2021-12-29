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
 * Structure: J9SharedClassTransactionPointer
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
 * The generated code will provide getters for all elements in the J9SharedClassTransactionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedClassTransaction.class)
public class J9SharedClassTransactionPointer extends StructurePointer {

	// NULL
	public static final J9SharedClassTransactionPointer NULL = new J9SharedClassTransactionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedClassTransactionPointer(long address) {
		super(address);
	}

	public static J9SharedClassTransactionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedClassTransactionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedClassTransactionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedClassTransactionPointer(address);
	}

	public J9SharedClassTransactionPointer add(long count) {
		return J9SharedClassTransactionPointer.cast(address + (J9SharedClassTransaction.SIZEOF * count));
	}

	public J9SharedClassTransactionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedClassTransactionPointer addOffset(long offset) {
		return J9SharedClassTransactionPointer.cast(address + offset);
	}

	public J9SharedClassTransactionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedClassTransactionPointer sub(long count) {
		return J9SharedClassTransactionPointer.cast(address - (J9SharedClassTransaction.SIZEOF * count));
	}

	public J9SharedClassTransactionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedClassTransactionPointer subOffset(long offset) {
		return J9SharedClassTransactionPointer.cast(address - offset);
	}

	public J9SharedClassTransactionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedClassTransactionPointer untag(long mask) {
		return J9SharedClassTransactionPointer.cast(address & ~mask);
	}

	public J9SharedClassTransactionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedClassTransaction.SIZEOF;
	}

	// Implementation methods

	// void* ClasspathWrapper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClasspathWrapperOffset_", declaredType="void*")
	public VoidPointer ClasspathWrapper() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._ClasspathWrapperOffset_));
	}

	// void* ClasspathWrapper
	public PointerPointer ClasspathWrapperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._ClasspathWrapperOffset_));
	}

	// void* allocatedLineNumberTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedLineNumberTableOffset_", declaredType="void*")
	public VoidPointer allocatedLineNumberTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._allocatedLineNumberTableOffset_));
	}

	// void* allocatedLineNumberTable
	public PointerPointer allocatedLineNumberTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._allocatedLineNumberTableOffset_));
	}

	// U32 allocatedLineNumberTableSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedLineNumberTableSizeOffset_", declaredType="U32")
	public UDATA allocatedLineNumberTableSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedClassTransaction._allocatedLineNumberTableSizeOffset_));
	}

	// U32 allocatedLineNumberTableSize
	public UDATAPointer allocatedLineNumberTableSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._allocatedLineNumberTableSizeOffset_));
	}

	// void* allocatedLocalVariableTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedLocalVariableTableOffset_", declaredType="void*")
	public VoidPointer allocatedLocalVariableTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._allocatedLocalVariableTableOffset_));
	}

	// void* allocatedLocalVariableTable
	public PointerPointer allocatedLocalVariableTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._allocatedLocalVariableTableOffset_));
	}

	// U32 allocatedLocalVariableTableSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedLocalVariableTableSizeOffset_", declaredType="U32")
	public UDATA allocatedLocalVariableTableSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedClassTransaction._allocatedLocalVariableTableSizeOffset_));
	}

	// U32 allocatedLocalVariableTableSize
	public UDATAPointer allocatedLocalVariableTableSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._allocatedLocalVariableTableSizeOffset_));
	}

	// void* allocatedMem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedMemOffset_", declaredType="void*")
	public VoidPointer allocatedMem() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._allocatedMemOffset_));
	}

	// void* allocatedMem
	public PointerPointer allocatedMemEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._allocatedMemOffset_));
	}

	// void* cacheAreaForAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheAreaForAllocateOffset_", declaredType="void*")
	public VoidPointer cacheAreaForAllocate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._cacheAreaForAllocateOffset_));
	}

	// void* cacheAreaForAllocate
	public PointerPointer cacheAreaForAllocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._cacheAreaForAllocateOffset_));
	}

	// U64 cacheFullFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheFullFlagsOffset_", declaredType="U64")
	public UDATA cacheFullFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9SharedClassTransaction._cacheFullFlagsOffset_));
	}

	// U64 cacheFullFlags
	public UDATAPointer cacheFullFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._cacheFullFlagsOffset_));
	}

	// J9ClassLoader* classloader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classloaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classloader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9SharedClassTransaction._classloaderOffset_));
	}

	// J9ClassLoader* classloader
	public PointerPointer classloaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._classloaderOffset_));
	}

	// U8* classnameData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classnameDataOffset_", declaredType="U8*")
	public U8Pointer classnameData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedClassTransaction._classnameDataOffset_));
	}

	// U8* classnameData
	public PointerPointer classnameDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._classnameDataOffset_));
	}

	// U16 classnameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classnameLengthOffset_", declaredType="U16")
	public U16 classnameLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9SharedClassTransaction._classnameLengthOffset_));
	}

	// U16 classnameLength
	public U16Pointer classnameLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9SharedClassTransaction._classnameLengthOffset_));
	}

	// I16 entryIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryIndexOffset_", declaredType="I16")
	public I16 entryIndex() throws CorruptDataException {
		return new I16(getShortAtOffset(J9SharedClassTransaction._entryIndexOffset_));
	}

	// I16 entryIndex
	public I16Pointer entryIndexEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9SharedClassTransaction._entryIndexOffset_));
	}

	// void* findNextIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findNextIteratorOffset_", declaredType="void*")
	public VoidPointer findNextIterator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._findNextIteratorOffset_));
	}

	// void* findNextIterator
	public PointerPointer findNextIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._findNextIteratorOffset_));
	}

	// void* findNextRomClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findNextRomClassOffset_", declaredType="void*")
	public VoidPointer findNextRomClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._findNextRomClassOffset_));
	}

	// void* findNextRomClass
	public PointerPointer findNextRomClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._findNextRomClassOffset_));
	}

	// void* firstFound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstFoundOffset_", declaredType="void*")
	public VoidPointer firstFound() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._firstFoundOffset_));
	}

	// void* firstFound
	public PointerPointer firstFoundEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._firstFoundOffset_));
	}

	// IDATA helperID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_helperIDOffset_", declaredType="IDATA")
	public IDATA helperID() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassTransaction._helperIDOffset_);
	}

	// IDATA helperID
	public IDATAPointer helperIDEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._helperIDOffset_));
	}

	// UDATA isModifiedClassfile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isModifiedClassfileOffset_", declaredType="UDATA")
	public UDATA isModifiedClassfile() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassTransaction._isModifiedClassfileOffset_);
	}

	// UDATA isModifiedClassfile
	public UDATAPointer isModifiedClassfileEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._isModifiedClassfileOffset_));
	}

	// IDATA isOK
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isOKOffset_", declaredType="IDATA")
	public IDATA isOK() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassTransaction._isOKOffset_);
	}

	// IDATA isOK
	public IDATAPointer isOKEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._isOKOffset_));
	}

	// UDATA loadType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadTypeOffset_", declaredType="UDATA")
	public UDATA loadType() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassTransaction._loadTypeOffset_);
	}

	// UDATA loadType
	public UDATAPointer loadTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._loadTypeOffset_));
	}

	// J9UTF8* modContextInCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modContextInCacheOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer modContextInCache() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9SharedClassTransaction._modContextInCacheOffset_));
	}

	// J9UTF8* modContextInCache
	public PointerPointer modContextInCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._modContextInCacheOffset_));
	}

	// void* newItemInCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newItemInCacheOffset_", declaredType="void*")
	public VoidPointer newItemInCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassTransaction._newItemInCacheOffset_));
	}

	// void* newItemInCache
	public PointerPointer newItemInCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._newItemInCacheOffset_));
	}

	// UDATA oldVMState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldVMStateOffset_", declaredType="UDATA")
	public UDATA oldVMState() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassTransaction._oldVMStateOffset_);
	}

	// UDATA oldVMState
	public UDATAPointer oldVMStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._oldVMStateOffset_));
	}

	// J9VMThread* ownerThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownerThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer ownerThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9SharedClassTransaction._ownerThreadOffset_));
	}

	// J9VMThread* ownerThread
	public PointerPointer ownerThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._ownerThreadOffset_));
	}

	// J9UTF8* partitionInCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partitionInCacheOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer partitionInCache() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9SharedClassTransaction._partitionInCacheOffset_));
	}

	// J9UTF8* partitionInCache
	public PointerPointer partitionInCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._partitionInCacheOffset_));
	}

	// UDATA takeReadWriteLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_takeReadWriteLockOffset_", declaredType="UDATA")
	public UDATA takeReadWriteLock() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassTransaction._takeReadWriteLockOffset_);
	}

	// UDATA takeReadWriteLock
	public UDATAPointer takeReadWriteLockEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._takeReadWriteLockOffset_));
	}

	// UDATA transactionState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_transactionStateOffset_", declaredType="UDATA")
	public UDATA transactionState() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassTransaction._transactionStateOffset_);
	}

	// UDATA transactionState
	public UDATAPointer transactionStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassTransaction._transactionStateOffset_));
	}

	// j9object_t updatedItemSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updatedItemSizeOffset_", declaredType="j9object_t")
	public J9ObjectPointer updatedItemSize() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9SharedClassTransaction._updatedItemSizeOffset_));
	}

	// j9object_t updatedItemSize
	public PointerPointer updatedItemSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassTransaction._updatedItemSizeOffset_));
	}

}
