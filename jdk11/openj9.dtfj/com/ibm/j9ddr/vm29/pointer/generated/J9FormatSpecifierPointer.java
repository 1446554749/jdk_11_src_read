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
 * Structure: J9FormatSpecifierPointer
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
 * The generated code will provide getters for all elements in the J9FormatSpecifierPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9FormatSpecifier.class)
public class J9FormatSpecifierPointer extends StructurePointer {

	// NULL
	public static final J9FormatSpecifierPointer NULL = new J9FormatSpecifierPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9FormatSpecifierPointer(long address) {
		super(address);
	}

	public static J9FormatSpecifierPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9FormatSpecifierPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9FormatSpecifierPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9FormatSpecifierPointer(address);
	}

	public J9FormatSpecifierPointer add(long count) {
		return J9FormatSpecifierPointer.cast(address + (J9FormatSpecifier.SIZEOF * count));
	}

	public J9FormatSpecifierPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9FormatSpecifierPointer addOffset(long offset) {
		return J9FormatSpecifierPointer.cast(address + offset);
	}

	public J9FormatSpecifierPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9FormatSpecifierPointer sub(long count) {
		return J9FormatSpecifierPointer.cast(address - (J9FormatSpecifier.SIZEOF * count));
	}

	public J9FormatSpecifierPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9FormatSpecifierPointer subOffset(long offset) {
		return J9FormatSpecifierPointer.cast(address - offset);
	}

	public J9FormatSpecifierPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9FormatSpecifierPointer untag(long mask) {
		return J9FormatSpecifierPointer.cast(address & ~mask);
	}

	public J9FormatSpecifierPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9FormatSpecifier.SIZEOF;
	}

	// Implementation methods

	// U8 index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexOffset_", declaredType="U8")
	public U8 index() throws CorruptDataException {
		return new U8(getByteAtOffset(J9FormatSpecifier._indexOffset_));
	}

	// U8 index
	public U8Pointer indexEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9FormatSpecifier._indexOffset_));
	}

	// U8 precisionIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_precisionIndexOffset_", declaredType="U8")
	public U8 precisionIndex() throws CorruptDataException {
		return new U8(getByteAtOffset(J9FormatSpecifier._precisionIndexOffset_));
	}

	// U8 precisionIndex
	public U8Pointer precisionIndexEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9FormatSpecifier._precisionIndexOffset_));
	}

	// U8 tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="U8")
	public U8 tag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9FormatSpecifier._tagOffset_));
	}

	// U8 tag
	public U8Pointer tagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9FormatSpecifier._tagOffset_));
	}

	// const U8* type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="const U8*")
	public U8Pointer type() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9FormatSpecifier._typeOffset_));
	}

	// const U8* type
	public PointerPointer typeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9FormatSpecifier._typeOffset_));
	}

	// U8 widthIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_widthIndexOffset_", declaredType="U8")
	public U8 widthIndex() throws CorruptDataException {
		return new U8(getByteAtOffset(J9FormatSpecifier._widthIndexOffset_));
	}

	// U8 widthIndex
	public U8Pointer widthIndexEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9FormatSpecifier._widthIndexOffset_));
	}

}
