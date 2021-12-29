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
 * Structure: j9shsem_handlePointer
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
 * The generated code will provide getters for all elements in the j9shsem_handlePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=j9shsem_handle.class)
public class j9shsem_handlePointer extends StructurePointer {

	// NULL
	public static final j9shsem_handlePointer NULL = new j9shsem_handlePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected j9shsem_handlePointer(long address) {
		super(address);
	}

	public static j9shsem_handlePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static j9shsem_handlePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static j9shsem_handlePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new j9shsem_handlePointer(address);
	}

	public j9shsem_handlePointer add(long count) {
		return j9shsem_handlePointer.cast(address + (j9shsem_handle.SIZEOF * count));
	}

	public j9shsem_handlePointer add(Scalar count) {
		return add(count.longValue());
	}

	public j9shsem_handlePointer addOffset(long offset) {
		return j9shsem_handlePointer.cast(address + offset);
	}

	public j9shsem_handlePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public j9shsem_handlePointer sub(long count) {
		return j9shsem_handlePointer.cast(address - (j9shsem_handle.SIZEOF * count));
	}

	public j9shsem_handlePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public j9shsem_handlePointer subOffset(long offset) {
		return j9shsem_handlePointer.cast(address - offset);
	}

	public j9shsem_handlePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public j9shsem_handlePointer untag(long mask) {
		return j9shsem_handlePointer.cast(address & ~mask);
	}

	public j9shsem_handlePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return j9shsem_handle.SIZEOF;
	}

	// Implementation methods

	// U8* baseFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseFileOffset_", declaredType="U8*")
	public U8Pointer baseFile() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(j9shsem_handle._baseFileOffset_));
	}

	// U8* baseFile
	public PointerPointer baseFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(j9shsem_handle._baseFileOffset_));
	}

	// U32:1 deleteBasefile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deleteBasefileOffset_", declaredType="U32:1")
	public UDATA deleteBasefile() throws CorruptDataException {
		return getU32Bitfield(j9shsem_handle._deleteBasefile_s_, j9shsem_handle._deleteBasefile_b_);
	}

	// I32 nsems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nsemsOffset_", declaredType="I32")
	public IDATA nsems() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_handle._nsemsOffset_));
	}

	// I32 nsems
	public IDATAPointer nsemsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_handle._nsemsOffset_));
	}

	// I32 semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semidOffset_", declaredType="I32")
	public IDATA semid() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_handle._semidOffset_));
	}

	// I32 semid
	public IDATAPointer semidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_handle._semidOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(j9shsem_handle._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_handle._timestampOffset_));
	}

}
