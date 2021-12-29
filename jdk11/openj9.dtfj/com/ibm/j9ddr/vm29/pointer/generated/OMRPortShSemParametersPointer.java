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
 * Structure: OMRPortShSemParametersPointer
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
 * The generated code will provide getters for all elements in the OMRPortShSemParametersPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortShSemParameters.class)
public class OMRPortShSemParametersPointer extends StructurePointer {

	// NULL
	public static final OMRPortShSemParametersPointer NULL = new OMRPortShSemParametersPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortShSemParametersPointer(long address) {
		super(address);
	}

	public static OMRPortShSemParametersPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortShSemParametersPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortShSemParametersPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortShSemParametersPointer(address);
	}

	public OMRPortShSemParametersPointer add(long count) {
		return OMRPortShSemParametersPointer.cast(address + (OMRPortShSemParameters.SIZEOF * count));
	}

	public OMRPortShSemParametersPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortShSemParametersPointer addOffset(long offset) {
		return OMRPortShSemParametersPointer.cast(address + offset);
	}

	public OMRPortShSemParametersPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortShSemParametersPointer sub(long count) {
		return OMRPortShSemParametersPointer.cast(address - (OMRPortShSemParameters.SIZEOF * count));
	}

	public OMRPortShSemParametersPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortShSemParametersPointer subOffset(long offset) {
		return OMRPortShSemParametersPointer.cast(address - offset);
	}

	public OMRPortShSemParametersPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortShSemParametersPointer untag(long mask) {
		return OMRPortShSemParametersPointer.cast(address & ~mask);
	}

	public OMRPortShSemParametersPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortShSemParameters.SIZEOF;
	}

	// Implementation methods

	// const U8* controlFileDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_controlFileDirOffset_", declaredType="const U8*")
	public U8Pointer controlFileDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortShSemParameters._controlFileDirOffset_));
	}

	// const U8* controlFileDir
	public PointerPointer controlFileDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShSemParameters._controlFileDirOffset_));
	}

	// U32:1 deleteBasefile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deleteBasefileOffset_", declaredType="U32:1")
	public UDATA deleteBasefile() throws CorruptDataException {
		return getU32Bitfield(OMRPortShSemParameters._deleteBasefile_s_, OMRPortShSemParameters._deleteBasefile_b_);
	}

	// U32 permission
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permissionOffset_", declaredType="U32")
	public UDATA permission() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRPortShSemParameters._permissionOffset_));
	}

	// U32 permission
	public UDATAPointer permissionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShSemParameters._permissionOffset_));
	}

	// U8 proj_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_proj_idOffset_", declaredType="U8")
	public U8 proj_id() throws CorruptDataException {
		return new U8(getByteAtOffset(OMRPortShSemParameters._proj_idOffset_));
	}

	// U8 proj_id
	public U8Pointer proj_idEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(OMRPortShSemParameters._proj_idOffset_));
	}

	// const U8* semName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semNameOffset_", declaredType="const U8*")
	public U8Pointer semName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortShSemParameters._semNameOffset_));
	}

	// const U8* semName
	public PointerPointer semNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShSemParameters._semNameOffset_));
	}

	// U32 setSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setSizeOffset_", declaredType="U32")
	public UDATA setSize() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRPortShSemParameters._setSizeOffset_));
	}

	// U32 setSize
	public UDATAPointer setSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShSemParameters._setSizeOffset_));
	}

}
