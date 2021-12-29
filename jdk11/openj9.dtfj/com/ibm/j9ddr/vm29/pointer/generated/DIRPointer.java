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
 * Structure: DIRPointer
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
 * The generated code will provide getters for all elements in the DIRPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=DIR.class)
public class DIRPointer extends StructurePointer {

	// NULL
	public static final DIRPointer NULL = new DIRPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected DIRPointer(long address) {
		super(address);
	}

	public static DIRPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static DIRPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static DIRPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new DIRPointer(address);
	}

	public DIRPointer add(long count) {
		return DIRPointer.cast(address + (DIR.SIZEOF * count));
	}

	public DIRPointer add(Scalar count) {
		return add(count.longValue());
	}

	public DIRPointer addOffset(long offset) {
		return DIRPointer.cast(address + offset);
	}

	public DIRPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public DIRPointer sub(long count) {
		return DIRPointer.cast(address - (DIR.SIZEOF * count));
	}

	public DIRPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public DIRPointer subOffset(long offset) {
		return DIRPointer.cast(address - offset);
	}

	public DIRPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public DIRPointer untag(long mask) {
		return DIRPointer.cast(address & ~mask);
	}

	public DIRPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return DIR.SIZEOF;
	}

	// Implementation methods

	// U8* __dd_buf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_bufOffset_", declaredType="U8*")
	public U8Pointer __dd_buf() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(DIR.___dd_bufOffset_));
	}

	// U8* __dd_buf
	public PointerPointer __dd_bufEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DIR.___dd_bufOffset_));
	}

	// I32 __dd_fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_fdOffset_", declaredType="I32")
	public IDATA __dd_fd() throws CorruptDataException {
		return new I32(getIntAtOffset(DIR.___dd_fdOffset_));
	}

	// I32 __dd_fd
	public IDATAPointer __dd_fdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_fdOffset_));
	}

	// I32 __dd_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_flagsOffset_", declaredType="I32")
	public IDATA __dd_flags() throws CorruptDataException {
		return new I32(getIntAtOffset(DIR.___dd_flagsOffset_));
	}

	// I32 __dd_flags
	public IDATAPointer __dd_flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_flagsOffset_));
	}

	// I32 __dd_len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_lenOffset_", declaredType="I32")
	public IDATA __dd_len() throws CorruptDataException {
		return new I32(getIntAtOffset(DIR.___dd_lenOffset_));
	}

	// I32 __dd_len
	public IDATAPointer __dd_lenEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_lenOffset_));
	}

	// I64 __dd_loc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_locOffset_", declaredType="I64")
	public IDATA __dd_loc() throws CorruptDataException {
		return new I64(getLongAtOffset(DIR.___dd_locOffset_));
	}

	// I64 __dd_loc
	public IDATAPointer __dd_locEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_locOffset_));
	}

	// __darwin_pthread_mutex_t __dd_lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_lockOffset_", declaredType="__darwin_pthread_mutex_t")
	public _opaque_pthread_mutex_tPointer __dd_lock() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(DIR.___dd_lockOffset_));
	}

	// __darwin_pthread_mutex_t __dd_lock
	public PointerPointer __dd_lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DIR.___dd_lockOffset_));
	}

	// I64 __dd_seek
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_seekOffset_", declaredType="I64")
	public IDATA __dd_seek() throws CorruptDataException {
		return new I64(getLongAtOffset(DIR.___dd_seekOffset_));
	}

	// I64 __dd_seek
	public IDATAPointer __dd_seekEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_seekOffset_));
	}

	// I64 __dd_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_sizeOffset_", declaredType="I64")
	public IDATA __dd_size() throws CorruptDataException {
		return new I64(getLongAtOffset(DIR.___dd_sizeOffset_));
	}

	// I64 __dd_size
	public IDATAPointer __dd_sizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___dd_sizeOffset_));
	}

	// _telldir* __dd_td
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___dd_tdOffset_", declaredType="_telldir*")
	public _telldirPointer __dd_td() throws CorruptDataException {
		return _telldirPointer.cast(getPointerAtOffset(DIR.___dd_tdOffset_));
	}

	// _telldir* __dd_td
	public PointerPointer __dd_tdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DIR.___dd_tdOffset_));
	}

	// I64 __padding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___paddingOffset_", declaredType="I64")
	public IDATA __padding() throws CorruptDataException {
		return new I64(getLongAtOffset(DIR.___paddingOffset_));
	}

	// I64 __padding
	public IDATAPointer __paddingEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DIR.___paddingOffset_));
	}

}
