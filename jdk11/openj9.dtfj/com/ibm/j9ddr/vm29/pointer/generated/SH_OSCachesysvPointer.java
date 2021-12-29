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
 * Structure: SH_OSCachesysvPointer
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
 * The generated code will provide getters for all elements in the SH_OSCachesysvPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_OSCachesysv.class)
public class SH_OSCachesysvPointer extends SH_OSCachePointer {

	// NULL
	public static final SH_OSCachesysvPointer NULL = new SH_OSCachesysvPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_OSCachesysvPointer(long address) {
		super(address);
	}

	public static SH_OSCachesysvPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_OSCachesysvPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_OSCachesysvPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_OSCachesysvPointer(address);
	}

	public SH_OSCachesysvPointer add(long count) {
		return SH_OSCachesysvPointer.cast(address + (SH_OSCachesysv.SIZEOF * count));
	}

	public SH_OSCachesysvPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_OSCachesysvPointer addOffset(long offset) {
		return SH_OSCachesysvPointer.cast(address + offset);
	}

	public SH_OSCachesysvPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_OSCachesysvPointer sub(long count) {
		return SH_OSCachesysvPointer.cast(address - (SH_OSCachesysv.SIZEOF * count));
	}

	public SH_OSCachesysvPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_OSCachesysvPointer subOffset(long offset) {
		return SH_OSCachesysvPointer.cast(address - offset);
	}

	public SH_OSCachesysvPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_OSCachesysvPointer untag(long mask) {
		return SH_OSCachesysvPointer.cast(address & ~mask);
	}

	public SH_OSCachesysvPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_OSCachesysv.SIZEOF;
	}

	// Implementation methods

	// U32 _actualCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__actualCacheSizeOffset_", declaredType="U32")
	public UDATA _actualCacheSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_OSCachesysv.__actualCacheSizeOffset_));
	}

	// U32 _actualCacheSize
	public UDATAPointer _actualCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__actualCacheSizeOffset_));
	}

	// IDATA _attach_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__attach_countOffset_", declaredType="IDATA")
	public IDATA _attach_count() throws CorruptDataException {
		return getIDATAAtOffset(SH_OSCachesysv.__attach_countOffset_);
	}

	// IDATA _attach_count
	public IDATAPointer _attach_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__attach_countOffset_));
	}

	// J9ControlFileStatus _controlFileStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__controlFileStatusOffset_", declaredType="J9ControlFileStatus")
	public J9ControlFileStatusPointer _controlFileStatus() throws CorruptDataException {
		return J9ControlFileStatusPointer.cast(nonNullFieldEA(SH_OSCachesysv.__controlFileStatusOffset_));
	}

	// J9ControlFileStatus _controlFileStatus
	public PointerPointer _controlFileStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__controlFileStatusOffset_));
	}

	// UDATA _groupPerm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__groupPermOffset_", declaredType="UDATA")
	public UDATA _groupPerm() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCachesysv.__groupPermOffset_);
	}

	// UDATA _groupPerm
	public UDATAPointer _groupPermEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__groupPermOffset_));
	}

	// SH_OSCacheInitializer* _initializer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializerOffset_", declaredType="SH_OSCacheInitializer*")
	public SH_OSCacheInitializerPointer _initializer() throws CorruptDataException {
		return SH_OSCacheInitializerPointer.cast(getPointerAtOffset(SH_OSCachesysv.__initializerOffset_));
	}

	// SH_OSCacheInitializer* _initializer
	public PointerPointer _initializerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__initializerOffset_));
	}

	// bool _openSharedMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__openSharedMemoryOffset_", declaredType="bool")
	public boolean _openSharedMemory() throws CorruptDataException {
		return getBoolAtOffset(SH_OSCachesysv.__openSharedMemoryOffset_);
	}

	// bool _openSharedMemory
	public BoolPointer _openSharedMemoryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_OSCachesysv.__openSharedMemoryOffset_));
	}

	// SH_SysvSemAccess _semAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semAccessOffset_", declaredType="SH_SysvSemAccess")
	public long _semAccess() throws CorruptDataException {
		if (SH_SysvSemAccess.SIZEOF == 1) {
			return getByteAtOffset(SH_OSCachesysv.__semAccessOffset_);
		} else if (SH_SysvSemAccess.SIZEOF == 2) {
			return getShortAtOffset(SH_OSCachesysv.__semAccessOffset_);
		} else if (SH_SysvSemAccess.SIZEOF == 4) {
			return getIntAtOffset(SH_OSCachesysv.__semAccessOffset_);
		} else if (SH_SysvSemAccess.SIZEOF == 8) {
			return getLongAtOffset(SH_OSCachesysv.__semAccessOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// SH_SysvSemAccess _semAccess
	public EnumPointer _semAccessEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(SH_OSCachesysv.__semAccessOffset_), SH_SysvSemAccess.class);
	}

	// U8* _semFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semFileNameOffset_", declaredType="U8*")
	public U8Pointer _semFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCachesysv.__semFileNameOffset_));
	}

	// U8* _semFileName
	public PointerPointer _semFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__semFileNameOffset_));
	}

	// j9shsem_handle* _semhandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semhandleOffset_", declaredType="j9shsem_handle*")
	public j9shsem_handlePointer _semhandle() throws CorruptDataException {
		return j9shsem_handlePointer.cast(getPointerAtOffset(SH_OSCachesysv.__semhandleOffset_));
	}

	// j9shsem_handle* _semhandle
	public PointerPointer _semhandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__semhandleOffset_));
	}

	// I32 _semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__semidOffset_", declaredType="I32")
	public IDATA _semid() throws CorruptDataException {
		return new I32(getIntAtOffset(SH_OSCachesysv.__semidOffset_));
	}

	// I32 _semid
	public IDATAPointer _semidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__semidOffset_));
	}

	// SH_SysvShmAccess _shmAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shmAccessOffset_", declaredType="SH_SysvShmAccess")
	public long _shmAccess() throws CorruptDataException {
		if (SH_SysvShmAccess.SIZEOF == 1) {
			return getByteAtOffset(SH_OSCachesysv.__shmAccessOffset_);
		} else if (SH_SysvShmAccess.SIZEOF == 2) {
			return getShortAtOffset(SH_OSCachesysv.__shmAccessOffset_);
		} else if (SH_SysvShmAccess.SIZEOF == 4) {
			return getIntAtOffset(SH_OSCachesysv.__shmAccessOffset_);
		} else if (SH_SysvShmAccess.SIZEOF == 8) {
			return getLongAtOffset(SH_OSCachesysv.__shmAccessOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// SH_SysvShmAccess _shmAccess
	public EnumPointer _shmAccessEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(SH_OSCachesysv.__shmAccessOffset_), SH_SysvShmAccess.class);
	}

	// U8* _shmFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shmFileNameOffset_", declaredType="U8*")
	public U8Pointer _shmFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_OSCachesysv.__shmFileNameOffset_));
	}

	// U8* _shmFileName
	public PointerPointer _shmFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__shmFileNameOffset_));
	}

	// j9shmem_handle* _shmhandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shmhandleOffset_", declaredType="j9shmem_handle*")
	public j9shmem_handlePointer _shmhandle() throws CorruptDataException {
		return j9shmem_handlePointer.cast(getPointerAtOffset(SH_OSCachesysv.__shmhandleOffset_));
	}

	// j9shmem_handle* _shmhandle
	public PointerPointer _shmhandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv.__shmhandleOffset_));
	}

	// UDATA _storageKeyTesting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storageKeyTestingOffset_", declaredType="UDATA")
	public UDATA _storageKeyTesting() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCachesysv.__storageKeyTestingOffset_);
	}

	// UDATA _storageKeyTesting
	public UDATAPointer _storageKeyTestingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__storageKeyTestingOffset_));
	}

	// UDATA _totalNumSems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalNumSemsOffset_", declaredType="UDATA")
	public UDATA _totalNumSems() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCachesysv.__totalNumSemsOffset_);
	}

	// UDATA _totalNumSems
	public UDATAPointer _totalNumSemsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__totalNumSemsOffset_));
	}

	// UDATA _userSemCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__userSemCntrOffset_", declaredType="UDATA")
	public UDATA _userSemCntr() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCachesysv.__userSemCntrOffset_);
	}

	// UDATA _userSemCntr
	public UDATAPointer _userSemCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachesysv.__userSemCntrOffset_));
	}

	// const J9SharedClassPreinitConfig* config
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configOffset_", declaredType="const J9SharedClassPreinitConfig*")
	public J9SharedClassPreinitConfigPointer config() throws CorruptDataException {
		return J9SharedClassPreinitConfigPointer.cast(getPointerAtOffset(SH_OSCachesysv._configOffset_));
	}

	// const J9SharedClassPreinitConfig* config
	public PointerPointer configEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachesysv._configOffset_));
	}

}
