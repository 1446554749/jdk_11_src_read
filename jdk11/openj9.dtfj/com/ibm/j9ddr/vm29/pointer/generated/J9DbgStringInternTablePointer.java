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
 * Structure: J9DbgStringInternTablePointer
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
 * The generated code will provide getters for all elements in the J9DbgStringInternTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9DbgStringInternTable.class)
public class J9DbgStringInternTablePointer extends StructurePointer {

	// NULL
	public static final J9DbgStringInternTablePointer NULL = new J9DbgStringInternTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9DbgStringInternTablePointer(long address) {
		super(address);
	}

	public static J9DbgStringInternTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9DbgStringInternTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9DbgStringInternTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9DbgStringInternTablePointer(address);
	}

	public J9DbgStringInternTablePointer add(long count) {
		return J9DbgStringInternTablePointer.cast(address + (J9DbgStringInternTable.SIZEOF * count));
	}

	public J9DbgStringInternTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9DbgStringInternTablePointer addOffset(long offset) {
		return J9DbgStringInternTablePointer.cast(address + offset);
	}

	public J9DbgStringInternTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9DbgStringInternTablePointer sub(long count) {
		return J9DbgStringInternTablePointer.cast(address - (J9DbgStringInternTable.SIZEOF * count));
	}

	public J9DbgStringInternTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9DbgStringInternTablePointer subOffset(long offset) {
		return J9DbgStringInternTablePointer.cast(address - offset);
	}

	public J9DbgStringInternTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9DbgStringInternTablePointer untag(long mask) {
		return J9DbgStringInternTablePointer.cast(address & ~mask);
	}

	public J9DbgStringInternTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9DbgStringInternTable.SIZEOF;
	}

	// Implementation methods

	// J9InternHashTableEntry* headNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headNodeOffset_", declaredType="J9InternHashTableEntry*")
	public J9InternHashTableEntryPointer headNode() throws CorruptDataException {
		return J9InternHashTableEntryPointer.cast(getPointerAtOffset(J9DbgStringInternTable._headNodeOffset_));
	}

	// J9InternHashTableEntry* headNode
	public PointerPointer headNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgStringInternTable._headNodeOffset_));
	}

	// J9HashTable* internHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer internHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9DbgStringInternTable._internHashTableOffset_));
	}

	// J9HashTable* internHashTable
	public PointerPointer internHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgStringInternTable._internHashTableOffset_));
	}

	// UDATA maximumNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maximumNodeCountOffset_", declaredType="UDATA")
	public UDATA maximumNodeCount() throws CorruptDataException {
		return getUDATAAtOffset(J9DbgStringInternTable._maximumNodeCountOffset_);
	}

	// UDATA maximumNodeCount
	public UDATAPointer maximumNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DbgStringInternTable._maximumNodeCountOffset_));
	}

	// UDATA nodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodeCountOffset_", declaredType="UDATA")
	public UDATA nodeCount() throws CorruptDataException {
		return getUDATAAtOffset(J9DbgStringInternTable._nodeCountOffset_);
	}

	// UDATA nodeCount
	public UDATAPointer nodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DbgStringInternTable._nodeCountOffset_));
	}

	// J9PortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9DbgStringInternTable._portLibraryOffset_));
	}

	// J9PortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgStringInternTable._portLibraryOffset_));
	}

	// J9InternHashTableEntry* tailNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tailNodeOffset_", declaredType="J9InternHashTableEntry*")
	public J9InternHashTableEntryPointer tailNode() throws CorruptDataException {
		return J9InternHashTableEntryPointer.cast(getPointerAtOffset(J9DbgStringInternTable._tailNodeOffset_));
	}

	// J9InternHashTableEntry* tailNode
	public PointerPointer tailNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgStringInternTable._tailNodeOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9DbgStringInternTable._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgStringInternTable._vmOffset_));
	}

}
