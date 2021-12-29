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
 * Structure: ClasspathEntryItemPointer
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
 * The generated code will provide getters for all elements in the ClasspathEntryItemPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClasspathEntryItem.class)
public class ClasspathEntryItemPointer extends StructurePointer {

	// NULL
	public static final ClasspathEntryItemPointer NULL = new ClasspathEntryItemPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClasspathEntryItemPointer(long address) {
		super(address);
	}

	public static ClasspathEntryItemPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClasspathEntryItemPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClasspathEntryItemPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClasspathEntryItemPointer(address);
	}

	public ClasspathEntryItemPointer add(long count) {
		return ClasspathEntryItemPointer.cast(address + (ClasspathEntryItem.SIZEOF * count));
	}

	public ClasspathEntryItemPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClasspathEntryItemPointer addOffset(long offset) {
		return ClasspathEntryItemPointer.cast(address + offset);
	}

	public ClasspathEntryItemPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClasspathEntryItemPointer sub(long count) {
		return ClasspathEntryItemPointer.cast(address - (ClasspathEntryItem.SIZEOF * count));
	}

	public ClasspathEntryItemPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClasspathEntryItemPointer subOffset(long offset) {
		return ClasspathEntryItemPointer.cast(address - offset);
	}

	public ClasspathEntryItemPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClasspathEntryItemPointer untag(long mask) {
		return ClasspathEntryItemPointer.cast(address & ~mask);
	}

	public ClasspathEntryItemPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClasspathEntryItem.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathEntryItem._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._flagsOffset_));
	}

	// UDATA hashValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashValueOffset_", declaredType="UDATA")
	public UDATA hashValue() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathEntryItem._hashValueOffset_);
	}

	// UDATA hashValue
	public UDATAPointer hashValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._hashValueOffset_));
	}

	// UDATA locationPathLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_locationPathLenOffset_", declaredType="UDATA")
	public UDATA locationPathLen() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathEntryItem._locationPathLenOffset_);
	}

	// UDATA locationPathLen
	public UDATAPointer locationPathLenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._locationPathLenOffset_));
	}

	// U8* path
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathOffset_", declaredType="U8*")
	public U8Pointer path() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClasspathEntryItem._pathOffset_));
	}

	// U8* path
	public PointerPointer pathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClasspathEntryItem._pathOffset_));
	}

	// UDATA pathLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathLenOffset_", declaredType="UDATA")
	public UDATA pathLen() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathEntryItem._pathLenOffset_);
	}

	// UDATA pathLen
	public UDATAPointer pathLenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._pathLenOffset_));
	}

	// UDATA protocol
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protocolOffset_", declaredType="UDATA")
	public UDATA protocol() throws CorruptDataException {
		return getUDATAAtOffset(ClasspathEntryItem._protocolOffset_);
	}

	// UDATA protocol
	public UDATAPointer protocolEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._protocolOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(ClasspathEntryItem._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClasspathEntryItem._timestampOffset_));
	}

}
