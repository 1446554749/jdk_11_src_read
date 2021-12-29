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
 * Structure: GC_ObjectScannerPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectScannerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectScanner.class)
public class GC_ObjectScannerPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final GC_ObjectScannerPointer NULL = new GC_ObjectScannerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectScannerPointer(long address) {
		super(address);
	}

	public static GC_ObjectScannerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectScannerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectScannerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectScannerPointer(address);
	}

	public GC_ObjectScannerPointer add(long count) {
		return GC_ObjectScannerPointer.cast(address + (GC_ObjectScanner.SIZEOF * count));
	}

	public GC_ObjectScannerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectScannerPointer addOffset(long offset) {
		return GC_ObjectScannerPointer.cast(address + offset);
	}

	public GC_ObjectScannerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectScannerPointer sub(long count) {
		return GC_ObjectScannerPointer.cast(address - (GC_ObjectScanner.SIZEOF * count));
	}

	public GC_ObjectScannerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectScannerPointer subOffset(long offset) {
		return GC_ObjectScannerPointer.cast(address - offset);
	}

	public GC_ObjectScannerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectScannerPointer untag(long mask) {
		return GC_ObjectScannerPointer.cast(address & ~mask);
	}

	public GC_ObjectScannerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectScanner.SIZEOF;
	}

	// Implementation methods

	// const bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="const bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectScanner.__compressObjectReferencesOffset_);
	}

	// const bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectScanner.__compressObjectReferencesOffset_));
	}

	// U64 _flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flagsOffset_", declaredType="U64")
	public UDATA _flags() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectScanner.__flagsOffset_));
	}

	// U64 _flags
	public UDATAPointer _flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectScanner.__flagsOffset_));
	}

	// U64 _leafMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__leafMapOffset_", declaredType="U64")
	public UDATA _leafMap() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectScanner.__leafMapOffset_));
	}

	// U64 _leafMap
	public UDATAPointer _leafMapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectScanner.__leafMapOffset_));
	}

	// U64 _scanMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanMapOffset_", declaredType="U64")
	public UDATA _scanMap() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectScanner.__scanMapOffset_));
	}

	// U64 _scanMap
	public UDATAPointer _scanMapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectScanner.__scanMapOffset_));
	}

	// fomrobject_t* _scanPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrOffset_", declaredType="fomrobject_t*")
	public UDATAPointer _scanPtr() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_ObjectScanner.__scanPtrOffset_));
	}

	// fomrobject_t* _scanPtr
	public PointerPointer _scanPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectScanner.__scanPtrOffset_));
	}

	// GC_SlotObject _slotObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotObjectOffset_", declaredType="GC_SlotObject")
	public GC_SlotObjectPointer _slotObject() throws CorruptDataException {
		return GC_SlotObjectPointer.cast(nonNullFieldEA(GC_ObjectScanner.__slotObjectOffset_));
	}

	// GC_SlotObject _slotObject
	public PointerPointer _slotObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectScanner.__slotObjectOffset_));
	}

}
