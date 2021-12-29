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
 * Structure: GC_IndexableObjectScannerPointer
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
 * The generated code will provide getters for all elements in the GC_IndexableObjectScannerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_IndexableObjectScanner.class)
public class GC_IndexableObjectScannerPointer extends GC_ObjectScannerPointer {

	// NULL
	public static final GC_IndexableObjectScannerPointer NULL = new GC_IndexableObjectScannerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_IndexableObjectScannerPointer(long address) {
		super(address);
	}

	public static GC_IndexableObjectScannerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_IndexableObjectScannerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_IndexableObjectScannerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_IndexableObjectScannerPointer(address);
	}

	public GC_IndexableObjectScannerPointer add(long count) {
		return GC_IndexableObjectScannerPointer.cast(address + (GC_IndexableObjectScanner.SIZEOF * count));
	}

	public GC_IndexableObjectScannerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_IndexableObjectScannerPointer addOffset(long offset) {
		return GC_IndexableObjectScannerPointer.cast(address + offset);
	}

	public GC_IndexableObjectScannerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_IndexableObjectScannerPointer sub(long count) {
		return GC_IndexableObjectScannerPointer.cast(address - (GC_IndexableObjectScanner.SIZEOF * count));
	}

	public GC_IndexableObjectScannerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_IndexableObjectScannerPointer subOffset(long offset) {
		return GC_IndexableObjectScannerPointer.cast(address - offset);
	}

	public GC_IndexableObjectScannerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_IndexableObjectScannerPointer untag(long mask) {
		return GC_IndexableObjectScannerPointer.cast(address & ~mask);
	}

	public GC_IndexableObjectScannerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_IndexableObjectScanner.SIZEOF;
	}

	// Implementation methods

	// omrobjectptr_t _arrayPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayPtrOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _arrayPtr() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_IndexableObjectScanner.__arrayPtrOffset_));
	}

	// omrobjectptr_t _arrayPtr
	public PointerPointer _arrayPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_IndexableObjectScanner.__arrayPtrOffset_));
	}

	// fomrobject_t* _basePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__basePtrOffset_", declaredType="fomrobject_t*")
	public UDATAPointer _basePtr() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_IndexableObjectScanner.__basePtrOffset_));
	}

	// fomrobject_t* _basePtr
	public PointerPointer _basePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_IndexableObjectScanner.__basePtrOffset_));
	}

	// const U64 _elementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__elementSizeOffset_", declaredType="const U64")
	public UDATA _elementSize() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_IndexableObjectScanner.__elementSizeOffset_));
	}

	// const U64 _elementSize
	public UDATAPointer _elementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_IndexableObjectScanner.__elementSizeOffset_));
	}

	// fomrobject_t* _endPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endPtrOffset_", declaredType="fomrobject_t*")
	public UDATAPointer _endPtr() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_IndexableObjectScanner.__endPtrOffset_));
	}

	// fomrobject_t* _endPtr
	public PointerPointer _endPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_IndexableObjectScanner.__endPtrOffset_));
	}

	// fomrobject_t* _limitPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__limitPtrOffset_", declaredType="fomrobject_t*")
	public UDATAPointer _limitPtr() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_IndexableObjectScanner.__limitPtrOffset_));
	}

	// fomrobject_t* _limitPtr
	public PointerPointer _limitPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_IndexableObjectScanner.__limitPtrOffset_));
	}

}
