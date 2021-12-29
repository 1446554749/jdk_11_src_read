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
 * Structure: StringInternTablePointer
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
 * The generated code will provide getters for all elements in the StringInternTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=StringInternTable.class)
public class StringInternTablePointer extends StructurePointer {

	// NULL
	public static final StringInternTablePointer NULL = new StringInternTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected StringInternTablePointer(long address) {
		super(address);
	}

	public static StringInternTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static StringInternTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static StringInternTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new StringInternTablePointer(address);
	}

	public StringInternTablePointer add(long count) {
		return StringInternTablePointer.cast(address + (StringInternTable.SIZEOF * count));
	}

	public StringInternTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public StringInternTablePointer addOffset(long offset) {
		return StringInternTablePointer.cast(address + offset);
	}

	public StringInternTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public StringInternTablePointer sub(long count) {
		return StringInternTablePointer.cast(address - (StringInternTable.SIZEOF * count));
	}

	public StringInternTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public StringInternTablePointer subOffset(long offset) {
		return StringInternTablePointer.cast(address - offset);
	}

	public StringInternTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public StringInternTablePointer untag(long mask) {
		return StringInternTablePointer.cast(address & ~mask);
	}

	public StringInternTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return StringInternTable.SIZEOF;
	}

	// Implementation methods

	// J9InternHashTableEntry* _headNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headNodeOffset_", declaredType="J9InternHashTableEntry*")
	public J9InternHashTableEntryPointer _headNode() throws CorruptDataException {
		return J9InternHashTableEntryPointer.cast(getPointerAtOffset(StringInternTable.__headNodeOffset_));
	}

	// J9InternHashTableEntry* _headNode
	public PointerPointer _headNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StringInternTable.__headNodeOffset_));
	}

	// J9HashTable* _internHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__internHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer _internHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(StringInternTable.__internHashTableOffset_));
	}

	// J9HashTable* _internHashTable
	public PointerPointer _internHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StringInternTable.__internHashTableOffset_));
	}

	// UDATA _maximumNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumNodeCountOffset_", declaredType="UDATA")
	public UDATA _maximumNodeCount() throws CorruptDataException {
		return getUDATAAtOffset(StringInternTable.__maximumNodeCountOffset_);
	}

	// UDATA _maximumNodeCount
	public UDATAPointer _maximumNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(StringInternTable.__maximumNodeCountOffset_));
	}

	// UDATA _nodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nodeCountOffset_", declaredType="UDATA")
	public UDATA _nodeCount() throws CorruptDataException {
		return getUDATAAtOffset(StringInternTable.__nodeCountOffset_);
	}

	// UDATA _nodeCount
	public UDATAPointer _nodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(StringInternTable.__nodeCountOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(StringInternTable.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StringInternTable.__portLibraryOffset_));
	}

	// J9InternHashTableEntry* _tailNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailNodeOffset_", declaredType="J9InternHashTableEntry*")
	public J9InternHashTableEntryPointer _tailNode() throws CorruptDataException {
		return J9InternHashTableEntryPointer.cast(getPointerAtOffset(StringInternTable.__tailNodeOffset_));
	}

	// J9InternHashTableEntry* _tailNode
	public PointerPointer _tailNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StringInternTable.__tailNodeOffset_));
	}

	// J9JavaVM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(StringInternTable.__vmOffset_));
	}

	// J9JavaVM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StringInternTable.__vmOffset_));
	}

}
