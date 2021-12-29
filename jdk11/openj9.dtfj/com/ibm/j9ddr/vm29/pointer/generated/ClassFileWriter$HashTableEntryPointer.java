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
 * Structure: ClassFileWriter$HashTableEntryPointer
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
 * The generated code will provide getters for all elements in the ClassFileWriter$HashTableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileWriter$HashTableEntry.class)
public class ClassFileWriter$HashTableEntryPointer extends StructurePointer {

	// NULL
	public static final ClassFileWriter$HashTableEntryPointer NULL = new ClassFileWriter$HashTableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileWriter$HashTableEntryPointer(long address) {
		super(address);
	}

	public static ClassFileWriter$HashTableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileWriter$HashTableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileWriter$HashTableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileWriter$HashTableEntryPointer(address);
	}

	public ClassFileWriter$HashTableEntryPointer add(long count) {
		return ClassFileWriter$HashTableEntryPointer.cast(address + (ClassFileWriter$HashTableEntry.SIZEOF * count));
	}

	public ClassFileWriter$HashTableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileWriter$HashTableEntryPointer addOffset(long offset) {
		return ClassFileWriter$HashTableEntryPointer.cast(address + offset);
	}

	public ClassFileWriter$HashTableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileWriter$HashTableEntryPointer sub(long count) {
		return ClassFileWriter$HashTableEntryPointer.cast(address - (ClassFileWriter$HashTableEntry.SIZEOF * count));
	}

	public ClassFileWriter$HashTableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileWriter$HashTableEntryPointer subOffset(long offset) {
		return ClassFileWriter$HashTableEntryPointer.cast(address - offset);
	}

	public ClassFileWriter$HashTableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileWriter$HashTableEntryPointer untag(long mask) {
		return ClassFileWriter$HashTableEntryPointer.cast(address & ~mask);
	}

	public ClassFileWriter$HashTableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileWriter$HashTableEntry.SIZEOF;
	}

	// Implementation methods

	// void* address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addressOffset_", declaredType="void*")
	public VoidPointer address() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ClassFileWriter$HashTableEntry._addressOffset_));
	}

	// void* address
	public PointerPointer addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileWriter$HashTableEntry._addressOffset_));
	}

	// U16 cpIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpIndexOffset_", declaredType="U16")
	public U16 cpIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileWriter$HashTableEntry._cpIndexOffset_));
	}

	// U16 cpIndex
	public U16Pointer cpIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileWriter$HashTableEntry._cpIndexOffset_));
	}

	// U8 cpType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpTypeOffset_", declaredType="U8")
	public U8 cpType() throws CorruptDataException {
		return new U8(getByteAtOffset(ClassFileWriter$HashTableEntry._cpTypeOffset_));
	}

	// U8 cpType
	public U8Pointer cpTypeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ClassFileWriter$HashTableEntry._cpTypeOffset_));
	}

}
