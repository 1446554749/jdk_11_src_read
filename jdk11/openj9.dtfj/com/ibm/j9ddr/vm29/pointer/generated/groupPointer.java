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
 * Structure: groupPointer
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
 * The generated code will provide getters for all elements in the groupPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=group.class)
public class groupPointer extends StructurePointer {

	// NULL
	public static final groupPointer NULL = new groupPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected groupPointer(long address) {
		super(address);
	}

	public static groupPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static groupPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static groupPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new groupPointer(address);
	}

	public groupPointer add(long count) {
		return groupPointer.cast(address + (group.SIZEOF * count));
	}

	public groupPointer add(Scalar count) {
		return add(count.longValue());
	}

	public groupPointer addOffset(long offset) {
		return groupPointer.cast(address + offset);
	}

	public groupPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public groupPointer sub(long count) {
		return groupPointer.cast(address - (group.SIZEOF * count));
	}

	public groupPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public groupPointer subOffset(long offset) {
		return groupPointer.cast(address - offset);
	}

	public groupPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public groupPointer untag(long mask) {
		return groupPointer.cast(address & ~mask);
	}

	public groupPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return group.SIZEOF;
	}

	// Implementation methods

	// gid_t gr_gid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gr_gidOffset_", declaredType="gid_t")
	public UDATA gr_gid() throws CorruptDataException {
		return new U32(getIntAtOffset(group._gr_gidOffset_));
	}

	// gid_t gr_gid
	public UDATAPointer gr_gidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(group._gr_gidOffset_));
	}

	// void** gr_mem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gr_memOffset_", declaredType="void**")
	public PointerPointer gr_mem() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(group._gr_memOffset_));
	}

	// void** gr_mem
	public PointerPointer gr_memEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(group._gr_memOffset_));
	}

	// U8* gr_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gr_nameOffset_", declaredType="U8*")
	public U8Pointer gr_name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(group._gr_nameOffset_));
	}

	// U8* gr_name
	public PointerPointer gr_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(group._gr_nameOffset_));
	}

	// U8* gr_passwd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gr_passwdOffset_", declaredType="U8*")
	public U8Pointer gr_passwd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(group._gr_passwdOffset_));
	}

	// U8* gr_passwd
	public PointerPointer gr_passwdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(group._gr_passwdOffset_));
	}

}
