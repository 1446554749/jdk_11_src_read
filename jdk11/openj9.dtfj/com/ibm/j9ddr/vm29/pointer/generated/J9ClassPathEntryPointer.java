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
 * Structure: J9ClassPathEntryPointer
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
 * The generated code will provide getters for all elements in the J9ClassPathEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClassPathEntry.class)
public class J9ClassPathEntryPointer extends StructurePointer {

	// NULL
	public static final J9ClassPathEntryPointer NULL = new J9ClassPathEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClassPathEntryPointer(long address) {
		super(address);
	}

	public static J9ClassPathEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClassPathEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClassPathEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClassPathEntryPointer(address);
	}

	public J9ClassPathEntryPointer add(long count) {
		return J9ClassPathEntryPointer.cast(address + (J9ClassPathEntry.SIZEOF * count));
	}

	public J9ClassPathEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClassPathEntryPointer addOffset(long offset) {
		return J9ClassPathEntryPointer.cast(address + offset);
	}

	public J9ClassPathEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClassPathEntryPointer sub(long count) {
		return J9ClassPathEntryPointer.cast(address - (J9ClassPathEntry.SIZEOF * count));
	}

	public J9ClassPathEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClassPathEntryPointer subOffset(long offset) {
		return J9ClassPathEntryPointer.cast(address - offset);
	}

	public J9ClassPathEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClassPathEntryPointer untag(long mask) {
		return J9ClassPathEntryPointer.cast(address & ~mask);
	}

	public J9ClassPathEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClassPathEntry.SIZEOF;
	}

	// Implementation methods

	// void* extraInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraInfoOffset_", declaredType="void*")
	public VoidPointer extraInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ClassPathEntry._extraInfoOffset_));
	}

	// void* extraInfo
	public PointerPointer extraInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassPathEntry._extraInfoOffset_));
	}

	// U16 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U16")
	public U16 flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ClassPathEntry._flagsOffset_));
	}

	// U16 flags
	public U16Pointer flagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ClassPathEntry._flagsOffset_));
	}

	// U8[] paddingToPowerOf2
	public U8Pointer paddingToPowerOf2EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassPathEntry._paddingToPowerOf2Offset_));
	}

	// U8* path
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathOffset_", declaredType="U8*")
	public U8Pointer path() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ClassPathEntry._pathOffset_));
	}

	// U8* path
	public PointerPointer pathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassPathEntry._pathOffset_));
	}

	// U32 pathLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathLengthOffset_", declaredType="U32")
	public UDATA pathLength() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ClassPathEntry._pathLengthOffset_));
	}

	// U32 pathLength
	public UDATAPointer pathLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassPathEntry._pathLengthOffset_));
	}

	// U32 status
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_statusOffset_", declaredType="U32")
	public UDATA status() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ClassPathEntry._statusOffset_));
	}

	// U32 status
	public UDATAPointer statusEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassPathEntry._statusOffset_));
	}

	// U16 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="U16")
	public U16 type() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ClassPathEntry._typeOffset_));
	}

	// U16 type
	public U16Pointer typeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ClassPathEntry._typeOffset_));
	}

}
