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
 * Structure: J9PackagePointer
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
 * The generated code will provide getters for all elements in the J9PackagePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9Package.class)
public class J9PackagePointer extends StructurePointer {

	// NULL
	public static final J9PackagePointer NULL = new J9PackagePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PackagePointer(long address) {
		super(address);
	}

	public static J9PackagePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PackagePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PackagePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PackagePointer(address);
	}

	public J9PackagePointer add(long count) {
		return J9PackagePointer.cast(address + (J9Package.SIZEOF * count));
	}

	public J9PackagePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PackagePointer addOffset(long offset) {
		return J9PackagePointer.cast(address + offset);
	}

	public J9PackagePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PackagePointer sub(long count) {
		return J9PackagePointer.cast(address - (J9Package.SIZEOF * count));
	}

	public J9PackagePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PackagePointer subOffset(long offset) {
		return J9PackagePointer.cast(address - offset);
	}

	public J9PackagePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PackagePointer untag(long mask) {
		return J9PackagePointer.cast(address & ~mask);
	}

	public J9PackagePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9Package.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9Package._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Package._classLoaderOffset_));
	}

	// U32 exportToAll
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exportToAllOffset_", declaredType="U32")
	public UDATA exportToAll() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Package._exportToAllOffset_));
	}

	// U32 exportToAll
	public UDATAPointer exportToAllEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Package._exportToAllOffset_));
	}

	// U32 exportToAllUnnamed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exportToAllUnnamedOffset_", declaredType="U32")
	public UDATA exportToAllUnnamed() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Package._exportToAllUnnamedOffset_));
	}

	// U32 exportToAllUnnamed
	public UDATAPointer exportToAllUnnamedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Package._exportToAllUnnamedOffset_));
	}

	// J9HashTable* exportsHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exportsHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer exportsHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9Package._exportsHashTableOffset_));
	}

	// J9HashTable* exportsHashTable
	public PointerPointer exportsHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Package._exportsHashTableOffset_));
	}

	// J9Module* module
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleOffset_", declaredType="J9Module*")
	public J9ModulePointer module() throws CorruptDataException {
		return J9ModulePointer.cast(getPointerAtOffset(J9Package._moduleOffset_));
	}

	// J9Module* module
	public PointerPointer moduleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Package._moduleOffset_));
	}

	// J9UTF8* packageName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_packageNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer packageName() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9Package._packageNameOffset_));
	}

	// J9UTF8* packageName
	public PointerPointer packageNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Package._packageNameOffset_));
	}

}
