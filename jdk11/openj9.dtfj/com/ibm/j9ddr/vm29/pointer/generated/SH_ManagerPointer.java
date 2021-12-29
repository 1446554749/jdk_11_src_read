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
 * Structure: SH_ManagerPointer
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
 * The generated code will provide getters for all elements in the SH_ManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_Manager.class)
public class SH_ManagerPointer extends StructurePointer {

	// NULL
	public static final SH_ManagerPointer NULL = new SH_ManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_ManagerPointer(long address) {
		super(address);
	}

	public static SH_ManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_ManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_ManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_ManagerPointer(address);
	}

	public SH_ManagerPointer add(long count) {
		return SH_ManagerPointer.cast(address + (SH_Manager.SIZEOF * count));
	}

	public SH_ManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_ManagerPointer addOffset(long offset) {
		return SH_ManagerPointer.cast(address + offset);
	}

	public SH_ManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_ManagerPointer sub(long count) {
		return SH_ManagerPointer.cast(address - (SH_Manager.SIZEOF * count));
	}

	public SH_ManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_ManagerPointer subOffset(long offset) {
		return SH_ManagerPointer.cast(address - offset);
	}

	public SH_ManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_ManagerPointer untag(long mask) {
		return SH_ManagerPointer.cast(address & ~mask);
	}

	public SH_ManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_Manager.SIZEOF;
	}

	// Implementation methods

	// SH_SharedCache* _cache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheOffset_", declaredType="SH_SharedCache*")
	public SH_SharedCachePointer _cache() throws CorruptDataException {
		return SH_SharedCachePointer.cast(getPointerAtOffset(SH_Manager.__cacheOffset_));
	}

	// SH_SharedCache* _cache
	public PointerPointer _cacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__cacheOffset_));
	}

	// UDATA[] _dataTypesRepresented
	public UDATAPointer _dataTypesRepresentedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_Manager.__dataTypesRepresentedOffset_));
	}

	// J9HashTable* _hashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer _hashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(SH_Manager.__hashTableOffset_));
	}

	// J9HashTable* _hashTable
	public PointerPointer _hashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__hashTableOffset_));
	}

	// J9HashTableDoFn _hashTableGetNumItemsDoFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hashTableGetNumItemsDoFnOffset_", declaredType="J9HashTableDoFn")
	public VoidPointer _hashTableGetNumItemsDoFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SH_Manager.__hashTableGetNumItemsDoFnOffset_));
	}

	// J9HashTableDoFn _hashTableGetNumItemsDoFn
	public PointerPointer _hashTableGetNumItemsDoFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__hashTableGetNumItemsDoFnOffset_));
	}

	// U32 _htEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__htEntriesOffset_", declaredType="U32")
	public UDATA _htEntries() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_Manager.__htEntriesOffset_));
	}

	// U32 _htEntries
	public UDATAPointer _htEntriesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_Manager.__htEntriesOffset_));
	}

	// omrthread_monitor_t _htMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__htMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _htMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(SH_Manager.__htMutexOffset_));
	}

	// omrthread_monitor_t _htMutex
	public PointerPointer _htMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__htMutexOffset_));
	}

	// const U8* _htMutexName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__htMutexNameOffset_", declaredType="const U8*")
	public U8Pointer _htMutexName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_Manager.__htMutexNameOffset_));
	}

	// const U8* _htMutexName
	public PointerPointer _htMutexNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__htMutexNameOffset_));
	}

	// bool _isRunningNested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isRunningNestedOffset_", declaredType="bool")
	public boolean _isRunningNested() throws CorruptDataException {
		return getBoolAtOffset(SH_Manager.__isRunningNestedOffset_);
	}

	// bool _isRunningNested
	public BoolPointer _isRunningNestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_Manager.__isRunningNestedOffset_));
	}

	// const U8* _managerType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__managerTypeOffset_", declaredType="const U8*")
	public U8Pointer _managerType() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_Manager.__managerTypeOffset_));
	}

	// const U8* _managerType
	public PointerPointer _managerTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__managerTypeOffset_));
	}

	// J9PortLibrary* _portlib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portlibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portlib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(SH_Manager.__portlibOffset_));
	}

	// J9PortLibrary* _portlib
	public PointerPointer _portlibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__portlibOffset_));
	}

	// U64* _runtimeFlagsPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsPtrOffset_", declaredType="U64*")
	public UDATAPointer _runtimeFlagsPtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(SH_Manager.__runtimeFlagsPtrOffset_));
	}

	// U64* _runtimeFlagsPtr
	public PointerPointer _runtimeFlagsPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__runtimeFlagsPtrOffset_));
	}

	// UDATA _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="UDATA")
	public UDATA _state() throws CorruptDataException {
		return getUDATAAtOffset(SH_Manager.__stateOffset_);
	}

	// UDATA _state
	public UDATAPointer _stateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_Manager.__stateOffset_));
	}

	// UDATA _verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseFlagsOffset_", declaredType="UDATA")
	public UDATA _verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(SH_Manager.__verboseFlagsOffset_);
	}

	// UDATA _verboseFlags
	public UDATAPointer _verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_Manager.__verboseFlagsOffset_));
	}

	// void** _vptr$SH_Manager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$SH_ManagerOffset_", declaredType="void**")
	public PointerPointer _vptr$SH_Manager() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(SH_Manager.__vptr$SH_ManagerOffset_));
	}

	// void** _vptr$SH_Manager
	public PointerPointer _vptr$SH_ManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_Manager.__vptr$SH_ManagerOffset_));
	}

}
