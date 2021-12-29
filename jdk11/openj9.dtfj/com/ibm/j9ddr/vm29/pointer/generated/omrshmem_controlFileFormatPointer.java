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
 * Structure: omrshmem_controlFileFormatPointer
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
 * The generated code will provide getters for all elements in the omrshmem_controlFileFormatPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=omrshmem_controlFileFormat.class)
public class omrshmem_controlFileFormatPointer extends StructurePointer {

	// NULL
	public static final omrshmem_controlFileFormatPointer NULL = new omrshmem_controlFileFormatPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected omrshmem_controlFileFormatPointer(long address) {
		super(address);
	}

	public static omrshmem_controlFileFormatPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static omrshmem_controlFileFormatPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static omrshmem_controlFileFormatPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new omrshmem_controlFileFormatPointer(address);
	}

	public omrshmem_controlFileFormatPointer add(long count) {
		return omrshmem_controlFileFormatPointer.cast(address + (omrshmem_controlFileFormat.SIZEOF * count));
	}

	public omrshmem_controlFileFormatPointer add(Scalar count) {
		return add(count.longValue());
	}

	public omrshmem_controlFileFormatPointer addOffset(long offset) {
		return omrshmem_controlFileFormatPointer.cast(address + offset);
	}

	public omrshmem_controlFileFormatPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public omrshmem_controlFileFormatPointer sub(long count) {
		return omrshmem_controlFileFormatPointer.cast(address - (omrshmem_controlFileFormat.SIZEOF * count));
	}

	public omrshmem_controlFileFormatPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public omrshmem_controlFileFormatPointer subOffset(long offset) {
		return omrshmem_controlFileFormatPointer.cast(address - offset);
	}

	public omrshmem_controlFileFormatPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public omrshmem_controlFileFormatPointer untag(long mask) {
		return omrshmem_controlFileFormatPointer.cast(address & ~mask);
	}

	public omrshmem_controlFileFormatPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return omrshmem_controlFileFormat.SIZEOF;
	}

	// Implementation methods

	// omrshmem_controlBaseFileFormat common
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commonOffset_", declaredType="omrshmem_controlBaseFileFormat")
	public omrshmem_controlBaseFileFormatPointer common() throws CorruptDataException {
		return omrshmem_controlBaseFileFormatPointer.cast(nonNullFieldEA(omrshmem_controlFileFormat._commonOffset_));
	}

	// omrshmem_controlBaseFileFormat common
	public PointerPointer commonEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(omrshmem_controlFileFormat._commonOffset_));
	}

	// I32 gid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gidOffset_", declaredType="I32")
	public IDATA gid() throws CorruptDataException {
		return new I32(getIntAtOffset(omrshmem_controlFileFormat._gidOffset_));
	}

	// I32 gid
	public IDATAPointer gidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_controlFileFormat._gidOffset_));
	}

	// I64 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="I64")
	public IDATA size() throws CorruptDataException {
		return new I64(getLongAtOffset(omrshmem_controlFileFormat._sizeOffset_));
	}

	// I64 size
	public IDATAPointer sizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_controlFileFormat._sizeOffset_));
	}

	// I32 uid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uidOffset_", declaredType="I32")
	public IDATA uid() throws CorruptDataException {
		return new I32(getIntAtOffset(omrshmem_controlFileFormat._uidOffset_));
	}

	// I32 uid
	public IDATAPointer uidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(omrshmem_controlFileFormat._uidOffset_));
	}

}
