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
 * Structure: __semid_ds_newPointer
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
 * The generated code will provide getters for all elements in the __semid_ds_newPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__semid_ds_new.class)
public class __semid_ds_newPointer extends StructurePointer {

	// NULL
	public static final __semid_ds_newPointer NULL = new __semid_ds_newPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __semid_ds_newPointer(long address) {
		super(address);
	}

	public static __semid_ds_newPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __semid_ds_newPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __semid_ds_newPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __semid_ds_newPointer(address);
	}

	public __semid_ds_newPointer add(long count) {
		return __semid_ds_newPointer.cast(address + (__semid_ds_new.SIZEOF * count));
	}

	public __semid_ds_newPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __semid_ds_newPointer addOffset(long offset) {
		return __semid_ds_newPointer.cast(address + offset);
	}

	public __semid_ds_newPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __semid_ds_newPointer sub(long count) {
		return __semid_ds_newPointer.cast(address - (__semid_ds_new.SIZEOF * count));
	}

	public __semid_ds_newPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __semid_ds_newPointer subOffset(long offset) {
		return __semid_ds_newPointer.cast(address - offset);
	}

	public __semid_ds_newPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __semid_ds_newPointer untag(long mask) {
		return __semid_ds_newPointer.cast(address & ~mask);
	}

	public __semid_ds_newPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __semid_ds_new.SIZEOF;
	}

	// Implementation methods

	// I32 sem_base
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_baseOffset_", declaredType="I32")
	public IDATA sem_base() throws CorruptDataException {
		return new I32(getIntAtOffset(__semid_ds_new._sem_baseOffset_));
	}

	// I32 sem_base
	public IDATAPointer sem_baseEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__semid_ds_new._sem_baseOffset_));
	}

	// time_t sem_ctime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_ctimeOffset_", declaredType="time_t")
	public IDATA sem_ctime() throws CorruptDataException {
		return new I64(getLongAtOffset(__semid_ds_new._sem_ctimeOffset_));
	}

	// time_t sem_ctime
	public IDATAPointer sem_ctimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__semid_ds_new._sem_ctimeOffset_));
	}

	// U16 sem_nsems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_nsemsOffset_", declaredType="U16")
	public U16 sem_nsems() throws CorruptDataException {
		return new U16(getShortAtOffset(__semid_ds_new._sem_nsemsOffset_));
	}

	// U16 sem_nsems
	public U16Pointer sem_nsemsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(__semid_ds_new._sem_nsemsOffset_));
	}

	// time_t sem_otime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_otimeOffset_", declaredType="time_t")
	public IDATA sem_otime() throws CorruptDataException {
		return new I64(getLongAtOffset(__semid_ds_new._sem_otimeOffset_));
	}

	// time_t sem_otime
	public IDATAPointer sem_otimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__semid_ds_new._sem_otimeOffset_));
	}

	// I32 sem_pad1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_pad1Offset_", declaredType="I32")
	public IDATA sem_pad1() throws CorruptDataException {
		return new I32(getIntAtOffset(__semid_ds_new._sem_pad1Offset_));
	}

	// I32 sem_pad1
	public IDATAPointer sem_pad1EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__semid_ds_new._sem_pad1Offset_));
	}

	// I32 sem_pad2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_pad2Offset_", declaredType="I32")
	public IDATA sem_pad2() throws CorruptDataException {
		return new I32(getIntAtOffset(__semid_ds_new._sem_pad2Offset_));
	}

	// I32 sem_pad2
	public IDATAPointer sem_pad2EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__semid_ds_new._sem_pad2Offset_));
	}

	// I32[] sem_pad3
	public IDATAPointer sem_pad3EA() throws CorruptDataException {
		return I32Pointer.cast(nonNullFieldEA(__semid_ds_new._sem_pad3Offset_));
	}

	// ipc_perm sem_perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sem_permOffset_", declaredType="ipc_perm")
	public ipc_permPointer sem_perm() throws CorruptDataException {
		return ipc_permPointer.cast(nonNullFieldEA(__semid_ds_new._sem_permOffset_));
	}

	// ipc_perm sem_perm
	public PointerPointer sem_permEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__semid_ds_new._sem_permOffset_));
	}

}
