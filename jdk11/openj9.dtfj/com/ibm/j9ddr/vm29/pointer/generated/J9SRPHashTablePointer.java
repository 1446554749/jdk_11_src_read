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
 * Structure: J9SRPHashTablePointer
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
 * The generated code will provide getters for all elements in the J9SRPHashTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SRPHashTable.class)
public class J9SRPHashTablePointer extends StructurePointer {

	// NULL
	public static final J9SRPHashTablePointer NULL = new J9SRPHashTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SRPHashTablePointer(long address) {
		super(address);
	}

	public static J9SRPHashTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SRPHashTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SRPHashTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SRPHashTablePointer(address);
	}

	public J9SRPHashTablePointer add(long count) {
		return J9SRPHashTablePointer.cast(address + (J9SRPHashTable.SIZEOF * count));
	}

	public J9SRPHashTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SRPHashTablePointer addOffset(long offset) {
		return J9SRPHashTablePointer.cast(address + offset);
	}

	public J9SRPHashTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SRPHashTablePointer sub(long count) {
		return J9SRPHashTablePointer.cast(address - (J9SRPHashTable.SIZEOF * count));
	}

	public J9SRPHashTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SRPHashTablePointer subOffset(long offset) {
		return J9SRPHashTablePointer.cast(address - offset);
	}

	public J9SRPHashTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SRPHashTablePointer untag(long mask) {
		return J9SRPHashTablePointer.cast(address & ~mask);
	}

	public J9SRPHashTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SRPHashTable.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9SRPHashTable._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTable._flagsOffset_));
	}

	// void* functionUserData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_functionUserDataOffset_", declaredType="void*")
	public VoidPointer functionUserData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SRPHashTable._functionUserDataOffset_));
	}

	// void* functionUserData
	public PointerPointer functionUserDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._functionUserDataOffset_));
	}

	// void* hashEqualFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashEqualFnOffset_", declaredType="void*")
	public VoidPointer hashEqualFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SRPHashTable._hashEqualFnOffset_));
	}

	// void* hashEqualFn
	public PointerPointer hashEqualFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._hashEqualFnOffset_));
	}

	// void* hashFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashFnOffset_", declaredType="void*")
	public VoidPointer hashFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SRPHashTable._hashFnOffset_));
	}

	// void* hashFn
	public PointerPointer hashFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._hashFnOffset_));
	}

	// J9PortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9SRPHashTable._portLibraryOffset_));
	}

	// J9PortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._portLibraryOffset_));
	}

	// void* printFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printFnOffset_", declaredType="void*")
	public VoidPointer printFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SRPHashTable._printFnOffset_));
	}

	// void* printFn
	public PointerPointer printFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._printFnOffset_));
	}

	// J9SRPHashTableInternal* srpHashtableInternal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_srpHashtableInternalOffset_", declaredType="J9SRPHashTableInternal*")
	public J9SRPHashTableInternalPointer srpHashtableInternal() throws CorruptDataException {
		return J9SRPHashTableInternalPointer.cast(getPointerAtOffset(J9SRPHashTable._srpHashtableInternalOffset_));
	}

	// J9SRPHashTableInternal* srpHashtableInternal
	public PointerPointer srpHashtableInternalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._srpHashtableInternalOffset_));
	}

	// const U8* tableName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableNameOffset_", declaredType="const U8*")
	public U8Pointer tableName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SRPHashTable._tableNameOffset_));
	}

	// const U8* tableName
	public PointerPointer tableNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SRPHashTable._tableNameOffset_));
	}

}
