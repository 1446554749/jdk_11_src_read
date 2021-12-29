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
 * Structure: ClasspathItemPointer
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
 * The generated code will provide getters for all elements in the ClasspathItemPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClasspathItem.class)
public class ClasspathItemPointer extends StructurePointer {

	// NULL
	public static final ClasspathItemPointer NULL = new ClasspathItemPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClasspathItemPointer(long address) {
		super(address);
	}

	public static ClasspathItemPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClasspathItemPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClasspathItemPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClasspathItemPointer(address);
	}

	public ClasspathItemPointer add(long count) {
		return ClasspathItemPointer.cast(address + (ClasspathItem.SIZEOF * count));
	}

	public ClasspathItemPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClasspathItemPointer addOffset(long offset) {
		return ClasspathItemPointer.cast(address + offset);
	}

	public ClasspathItemPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClasspathItemPointer sub(long count) {
		return ClasspathItemPointer.cast(address - (ClasspathItem.SIZEOF * count));
	}

	public ClasspathItemPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClasspathItemPointer subOffset(long offset) {
		return ClasspathItemPointer.cast(address - offset);
	}

	public ClasspathItemPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClasspathItemPointer untag(long mask) {
		return ClasspathItemPointer.cast(address & ~mask);
	}

	public ClasspathItemPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClasspathItem.SIZEOF;
	}

	// Implementation methods

	// IDATA entries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entriesOffset_", declaredType="IDATA")
	public IDATA entries() throws CorruptDataException {
		return getIDATAAtOffset(ClasspathItem._entriesOffset_);
	}

	// IDATA entries
	public IDATAPointer entriesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathItem._entriesOffset_));
	}

	// IDATA firstDirIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstDirIndexOffset_", declaredType="IDATA")
	public IDATA firstDirIndex() throws CorruptDataException {
		return getIDATAAtOffset(ClasspathItem._firstDirIndexOffset_);
	}

	// IDATA firstDirIndex
	public IDATAPointer firstDirIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathItem._firstDirIndexOffset_));
	}

	// U16 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U16")
	public U16 flags() throws CorruptDataException {
		return new U16(getShortAtOffset(ClasspathItem._flagsOffset_));
	}

	// U16 flags
	public U16Pointer flagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClasspathItem._flagsOffset_));
	}

	// UDATA hashValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashValueOffset_", declaredType="UDATA")
	public UDATA hashValue() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathItem._hashValueOffset_);
	}

	// UDATA hashValue
	public UDATAPointer hashValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathItem._hashValueOffset_));
	}

	// IDATA helperID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_helperIDOffset_", declaredType="IDATA")
	public IDATA helperID() throws CorruptDataException {
		return getIDATAAtOffset(ClasspathItem._helperIDOffset_);
	}

	// IDATA helperID
	public IDATAPointer helperIDEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathItem._helperIDOffset_));
	}

	// void** items
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_itemsOffset_", declaredType="void**")
	public PointerPointer items() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(ClasspathItem._itemsOffset_));
	}

	// void** items
	public PointerPointer itemsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClasspathItem._itemsOffset_));
	}

	// IDATA itemsAdded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_itemsAddedOffset_", declaredType="IDATA")
	public IDATA itemsAdded() throws CorruptDataException {
		return getIDATAAtOffset(ClasspathItem._itemsAddedOffset_);
	}

	// IDATA itemsAdded
	public IDATAPointer itemsAddedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathItem._itemsAddedOffset_));
	}

	// IDATA jarsLockedToIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jarsLockedToIndexOffset_", declaredType="IDATA")
	public IDATA jarsLockedToIndex() throws CorruptDataException {
		return getIDATAAtOffset(ClasspathItem._jarsLockedToIndexOffset_);
	}

	// IDATA jarsLockedToIndex
	public IDATAPointer jarsLockedToIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathItem._jarsLockedToIndexOffset_));
	}

	// J9PortLibrary* portlib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portlibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portlib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(ClasspathItem._portlibOffset_));
	}

	// J9PortLibrary* portlib
	public PointerPointer portlibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClasspathItem._portlibOffset_));
	}

	// U16 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="U16")
	public U16 type() throws CorruptDataException {
		return new U16(getShortAtOffset(ClasspathItem._typeOffset_));
	}

	// U16 type
	public U16Pointer typeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClasspathItem._typeOffset_));
	}

}
