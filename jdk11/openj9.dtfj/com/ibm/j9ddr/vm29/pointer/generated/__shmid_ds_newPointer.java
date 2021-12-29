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
 * Structure: __shmid_ds_newPointer
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
 * The generated code will provide getters for all elements in the __shmid_ds_newPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__shmid_ds_new.class)
public class __shmid_ds_newPointer extends StructurePointer {

	// NULL
	public static final __shmid_ds_newPointer NULL = new __shmid_ds_newPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __shmid_ds_newPointer(long address) {
		super(address);
	}

	public static __shmid_ds_newPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __shmid_ds_newPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __shmid_ds_newPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __shmid_ds_newPointer(address);
	}

	public __shmid_ds_newPointer add(long count) {
		return __shmid_ds_newPointer.cast(address + (__shmid_ds_new.SIZEOF * count));
	}

	public __shmid_ds_newPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __shmid_ds_newPointer addOffset(long offset) {
		return __shmid_ds_newPointer.cast(address + offset);
	}

	public __shmid_ds_newPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __shmid_ds_newPointer sub(long count) {
		return __shmid_ds_newPointer.cast(address - (__shmid_ds_new.SIZEOF * count));
	}

	public __shmid_ds_newPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __shmid_ds_newPointer subOffset(long offset) {
		return __shmid_ds_newPointer.cast(address - offset);
	}

	public __shmid_ds_newPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __shmid_ds_newPointer untag(long mask) {
		return __shmid_ds_newPointer.cast(address & ~mask);
	}

	public __shmid_ds_newPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __shmid_ds_new.SIZEOF;
	}

	// Implementation methods

	// time_t shm_atime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_atimeOffset_", declaredType="time_t")
	public IDATA shm_atime() throws CorruptDataException {
		return new I64(getLongAtOffset(__shmid_ds_new._shm_atimeOffset_));
	}

	// time_t shm_atime
	public IDATAPointer shm_atimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_atimeOffset_));
	}

	// pid_t shm_cpid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_cpidOffset_", declaredType="pid_t")
	public IDATA shm_cpid() throws CorruptDataException {
		return new I32(getIntAtOffset(__shmid_ds_new._shm_cpidOffset_));
	}

	// pid_t shm_cpid
	public IDATAPointer shm_cpidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_cpidOffset_));
	}

	// time_t shm_ctime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_ctimeOffset_", declaredType="time_t")
	public IDATA shm_ctime() throws CorruptDataException {
		return new I64(getLongAtOffset(__shmid_ds_new._shm_ctimeOffset_));
	}

	// time_t shm_ctime
	public IDATAPointer shm_ctimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_ctimeOffset_));
	}

	// time_t shm_dtime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_dtimeOffset_", declaredType="time_t")
	public IDATA shm_dtime() throws CorruptDataException {
		return new I64(getLongAtOffset(__shmid_ds_new._shm_dtimeOffset_));
	}

	// time_t shm_dtime
	public IDATAPointer shm_dtimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_dtimeOffset_));
	}

	// void* shm_internal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_internalOffset_", declaredType="void*")
	public VoidPointer shm_internal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__shmid_ds_new._shm_internalOffset_));
	}

	// void* shm_internal
	public PointerPointer shm_internalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_internalOffset_));
	}

	// pid_t shm_lpid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_lpidOffset_", declaredType="pid_t")
	public IDATA shm_lpid() throws CorruptDataException {
		return new I32(getIntAtOffset(__shmid_ds_new._shm_lpidOffset_));
	}

	// pid_t shm_lpid
	public IDATAPointer shm_lpidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_lpidOffset_));
	}

	// shmatt_t shm_nattch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_nattchOffset_", declaredType="shmatt_t")
	public U16 shm_nattch() throws CorruptDataException {
		return new U16(getShortAtOffset(__shmid_ds_new._shm_nattchOffset_));
	}

	// shmatt_t shm_nattch
	public U16Pointer shm_nattchEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__shmid_ds_new._shm_nattchOffset_));
	}

	// ipc_perm shm_perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_permOffset_", declaredType="ipc_perm")
	public ipc_permPointer shm_perm() throws CorruptDataException {
		return ipc_permPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_permOffset_));
	}

	// ipc_perm shm_perm
	public PointerPointer shm_permEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_permOffset_));
	}

	// size_t shm_segsz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shm_segszOffset_", declaredType="size_t")
	public UDATA shm_segsz() throws CorruptDataException {
		return new U64(getLongAtOffset(__shmid_ds_new._shm_segszOffset_));
	}

	// size_t shm_segsz
	public UDATAPointer shm_segszEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__shmid_ds_new._shm_segszOffset_));
	}

}
