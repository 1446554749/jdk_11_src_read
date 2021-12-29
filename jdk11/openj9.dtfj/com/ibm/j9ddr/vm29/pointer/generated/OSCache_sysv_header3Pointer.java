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
 * Structure: OSCache_sysv_header3Pointer
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
 * The generated code will provide getters for all elements in the OSCache_sysv_header3Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OSCache_sysv_header3.class)
public class OSCache_sysv_header3Pointer extends StructurePointer {

	// NULL
	public static final OSCache_sysv_header3Pointer NULL = new OSCache_sysv_header3Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OSCache_sysv_header3Pointer(long address) {
		super(address);
	}

	public static OSCache_sysv_header3Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OSCache_sysv_header3Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OSCache_sysv_header3Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OSCache_sysv_header3Pointer(address);
	}

	public OSCache_sysv_header3Pointer add(long count) {
		return OSCache_sysv_header3Pointer.cast(address + (OSCache_sysv_header3.SIZEOF * count));
	}

	public OSCache_sysv_header3Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public OSCache_sysv_header3Pointer addOffset(long offset) {
		return OSCache_sysv_header3Pointer.cast(address + offset);
	}

	public OSCache_sysv_header3Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OSCache_sysv_header3Pointer sub(long count) {
		return OSCache_sysv_header3Pointer.cast(address - (OSCache_sysv_header3.SIZEOF * count));
	}

	public OSCache_sysv_header3Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OSCache_sysv_header3Pointer subOffset(long offset) {
		return OSCache_sysv_header3Pointer.cast(address - offset);
	}

	public OSCache_sysv_header3Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OSCache_sysv_header3Pointer untag(long mask) {
		return OSCache_sysv_header3Pointer.cast(address & ~mask);
	}

	public OSCache_sysv_header3Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OSCache_sysv_header3.SIZEOF;
	}

	// Implementation methods

	// I32 attachedSemid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachedSemidOffset_", declaredType="I32")
	public IDATA attachedSemid() throws CorruptDataException {
		return new I32(getIntAtOffset(OSCache_sysv_header3._attachedSemidOffset_));
	}

	// I32 attachedSemid
	public IDATAPointer attachedSemidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OSCache_sysv_header3._attachedSemidOffset_));
	}

	// U8[] eyecatcher
	public U8Pointer eyecatcherEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(OSCache_sysv_header3._eyecatcherOffset_));
	}

	// U32 inDefaultControlDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inDefaultControlDirOffset_", declaredType="U32")
	public UDATA inDefaultControlDir() throws CorruptDataException {
		return new U32(getIntAtOffset(OSCache_sysv_header3._inDefaultControlDirOffset_));
	}

	// U32 inDefaultControlDir
	public UDATAPointer inDefaultControlDirEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_sysv_header3._inDefaultControlDirOffset_));
	}

	// OSCache_header2 oscHdr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oscHdrOffset_", declaredType="OSCache_header2")
	public OSCache_header2Pointer oscHdr() throws CorruptDataException {
		return OSCache_header2Pointer.cast(nonNullFieldEA(OSCache_sysv_header3._oscHdrOffset_));
	}

	// OSCache_header2 oscHdr
	public PointerPointer oscHdrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OSCache_sysv_header3._oscHdrOffset_));
	}

	// U32[] unused32
	public UDATAPointer unused32EA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(OSCache_sysv_header3._unused32Offset_));
	}

	// U64[] unused64
	public UDATAPointer unused64EA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(OSCache_sysv_header3._unused64Offset_));
	}

}
