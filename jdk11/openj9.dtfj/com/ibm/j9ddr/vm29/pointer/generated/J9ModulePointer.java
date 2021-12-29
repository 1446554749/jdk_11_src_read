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
 * Structure: J9ModulePointer
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
 * The generated code will provide getters for all elements in the J9ModulePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9Module.class)
public class J9ModulePointer extends StructurePointer {

	// NULL
	public static final J9ModulePointer NULL = new J9ModulePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ModulePointer(long address) {
		super(address);
	}

	public static J9ModulePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ModulePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ModulePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ModulePointer(address);
	}

	public J9ModulePointer add(long count) {
		return J9ModulePointer.cast(address + (J9Module.SIZEOF * count));
	}

	public J9ModulePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ModulePointer addOffset(long offset) {
		return J9ModulePointer.cast(address + offset);
	}

	public J9ModulePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ModulePointer sub(long count) {
		return J9ModulePointer.cast(address - (J9Module.SIZEOF * count));
	}

	public J9ModulePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ModulePointer subOffset(long offset) {
		return J9ModulePointer.cast(address - offset);
	}

	public J9ModulePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ModulePointer untag(long mask) {
		return J9ModulePointer.cast(address & ~mask);
	}

	public J9ModulePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9Module.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9Module._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._classLoaderOffset_));
	}

	// BOOLEAN isLoose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isLooseOffset_", declaredType="BOOLEAN")
	public UDATA isLoose() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Module._isLooseOffset_));
	}

	// BOOLEAN isLoose
	public UDATAPointer isLooseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Module._isLooseOffset_));
	}

	// BOOLEAN isOpen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isOpenOffset_", declaredType="BOOLEAN")
	public UDATA isOpen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Module._isOpenOffset_));
	}

	// BOOLEAN isOpen
	public UDATAPointer isOpenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Module._isOpenOffset_));
	}

	// j9object_t moduleName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleNameOffset_", declaredType="j9object_t")
	public J9ObjectPointer moduleName() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9Module._moduleNameOffset_));
	}

	// j9object_t moduleName
	public PointerPointer moduleNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._moduleNameOffset_));
	}

	// j9object_t moduleObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer moduleObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9Module._moduleObjectOffset_));
	}

	// j9object_t moduleObject
	public PointerPointer moduleObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._moduleObjectOffset_));
	}

	// J9HashTable* readAccessHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readAccessHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer readAccessHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9Module._readAccessHashTableOffset_));
	}

	// J9HashTable* readAccessHashTable
	public PointerPointer readAccessHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._readAccessHashTableOffset_));
	}

	// J9HashTable* removeAccessHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_removeAccessHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer removeAccessHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9Module._removeAccessHashTableOffset_));
	}

	// J9HashTable* removeAccessHashTable
	public PointerPointer removeAccessHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._removeAccessHashTableOffset_));
	}

	// J9HashTable* removeExportsHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_removeExportsHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer removeExportsHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9Module._removeExportsHashTableOffset_));
	}

	// J9HashTable* removeExportsHashTable
	public PointerPointer removeExportsHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._removeExportsHashTableOffset_));
	}

	// j9object_t version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="j9object_t")
	public J9ObjectPointer version() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9Module._versionOffset_));
	}

	// j9object_t version
	public PointerPointer versionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Module._versionOffset_));
	}

}
