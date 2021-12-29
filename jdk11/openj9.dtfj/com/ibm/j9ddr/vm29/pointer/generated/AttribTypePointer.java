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
 * Structure: AttribTypePointer
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
 * The generated code will provide getters for all elements in the AttribTypePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=AttribType.class)
public class AttribTypePointer extends StructurePointer {

	// NULL
	public static final AttribTypePointer NULL = new AttribTypePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected AttribTypePointer(long address) {
		super(address);
	}

	public static AttribTypePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static AttribTypePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static AttribTypePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new AttribTypePointer(address);
	}

	public AttribTypePointer add(long count) {
		return AttribTypePointer.cast(address + (AttribType.SIZEOF * count));
	}

	public AttribTypePointer add(Scalar count) {
		return add(count.longValue());
	}

	public AttribTypePointer addOffset(long offset) {
		return AttribTypePointer.cast(address + offset);
	}

	public AttribTypePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public AttribTypePointer sub(long count) {
		return AttribTypePointer.cast(address - (AttribType.SIZEOF * count));
	}

	public AttribTypePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public AttribTypePointer subOffset(long offset) {
		return AttribTypePointer.cast(address - offset);
	}

	public AttribTypePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public AttribTypePointer untag(long mask) {
		return AttribTypePointer.cast(address & ~mask);
	}

	public AttribTypePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return AttribType.SIZEOF;
	}

	// Implementation methods

	// U8 attribCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attribCodeOffset_", declaredType="U8")
	public U8 attribCode() throws CorruptDataException {
		return new U8(getByteAtOffset(AttribType._attribCodeOffset_));
	}

	// U8 attribCode
	public U8Pointer attribCodeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(AttribType._attribCodeOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(AttribType._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(AttribType._nameOffset_));
	}

	// U8 strippedAttribCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_strippedAttribCodeOffset_", declaredType="U8")
	public U8 strippedAttribCode() throws CorruptDataException {
		return new U8(getByteAtOffset(AttribType._strippedAttribCodeOffset_));
	}

	// U8 strippedAttribCode
	public U8Pointer strippedAttribCodeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(AttribType._strippedAttribCodeOffset_));
	}

}
