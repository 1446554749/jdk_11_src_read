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
 * Structure: GC_ArrayletLeafIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ArrayletLeafIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ArrayletLeafIterator.class)
public class GC_ArrayletLeafIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ArrayletLeafIteratorPointer NULL = new GC_ArrayletLeafIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ArrayletLeafIteratorPointer(long address) {
		super(address);
	}

	public static GC_ArrayletLeafIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ArrayletLeafIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ArrayletLeafIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ArrayletLeafIteratorPointer(address);
	}

	public GC_ArrayletLeafIteratorPointer add(long count) {
		return GC_ArrayletLeafIteratorPointer.cast(address + (GC_ArrayletLeafIterator.SIZEOF * count));
	}

	public GC_ArrayletLeafIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ArrayletLeafIteratorPointer addOffset(long offset) {
		return GC_ArrayletLeafIteratorPointer.cast(address + offset);
	}

	public GC_ArrayletLeafIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ArrayletLeafIteratorPointer sub(long count) {
		return GC_ArrayletLeafIteratorPointer.cast(address - (GC_ArrayletLeafIterator.SIZEOF * count));
	}

	public GC_ArrayletLeafIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ArrayletLeafIteratorPointer subOffset(long offset) {
		return GC_ArrayletLeafIteratorPointer.cast(address - offset);
	}

	public GC_ArrayletLeafIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ArrayletLeafIteratorPointer untag(long mask) {
		return GC_ArrayletLeafIteratorPointer.cast(address & ~mask);
	}

	public GC_ArrayletLeafIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ArrayletLeafIterator.SIZEOF;
	}

	// Implementation methods

	// fj9object_t* _arrayoid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayoidOffset_", declaredType="fj9object_t*")
	public ObjectReferencePointer _arrayoid() throws CorruptDataException {
		return ObjectReferencePointer.cast(getPointerAtOffset(GC_ArrayletLeafIterator.__arrayoidOffset_));
	}

	// fj9object_t* _arrayoid
	public PointerPointer _arrayoidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__arrayoidOffset_));
	}

	// const bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="const bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(GC_ArrayletLeafIterator.__compressObjectReferencesOffset_);
	}

	// const bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__compressObjectReferencesOffset_));
	}

	// void* _endOfSpine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endOfSpineOffset_", declaredType="void*")
	public VoidPointer _endOfSpine() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_ArrayletLeafIterator.__endOfSpineOffset_));
	}

	// void* _endOfSpine
	public PointerPointer _endOfSpineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__endOfSpineOffset_));
	}

	// ArrayLayout _layout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__layoutOffset_", declaredType="ArrayLayout")
	public long _layout() throws CorruptDataException {
		if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 1) {
			return getByteAtOffset(GC_ArrayletLeafIterator.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 2) {
			return getShortAtOffset(GC_ArrayletLeafIterator.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 4) {
			return getIntAtOffset(GC_ArrayletLeafIterator.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 8) {
			return getLongAtOffset(GC_ArrayletLeafIterator.__layoutOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ArrayLayout _layout
	public EnumPointer _layoutEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__layoutOffset_), GC_ArrayletObjectModelBase$ArrayLayout.class);
	}

	// UDATA _numLeafs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numLeafsOffset_", declaredType="UDATA")
	public UDATA _numLeafs() throws CorruptDataException {
		return getUDATAAtOffset(GC_ArrayletLeafIterator.__numLeafsOffset_);
	}

	// UDATA _numLeafs
	public UDATAPointer _numLeafsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__numLeafsOffset_));
	}

	// UDATA _numLeafsCounted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numLeafsCountedOffset_", declaredType="UDATA")
	public UDATA _numLeafsCounted() throws CorruptDataException {
		return getUDATAAtOffset(GC_ArrayletLeafIterator.__numLeafsCountedOffset_);
	}

	// UDATA _numLeafsCounted
	public UDATAPointer _numLeafsCountedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__numLeafsCountedOffset_));
	}

	// const OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="const OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(GC_ArrayletLeafIterator.__omrVMOffset_));
	}

	// const OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__omrVMOffset_));
	}

	// GC_SlotObject _slotObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotObjectOffset_", declaredType="GC_SlotObject")
	public GC_SlotObjectPointer _slotObject() throws CorruptDataException {
		return GC_SlotObjectPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__slotObjectOffset_));
	}

	// GC_SlotObject _slotObject
	public PointerPointer _slotObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__slotObjectOffset_));
	}

	// J9IndexableObject* _spinePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spinePtrOffset_", declaredType="J9IndexableObject*")
	public J9IndexableObjectPointer _spinePtr() throws CorruptDataException {
		return J9IndexableObjectPointer.cast(getPointerAtOffset(GC_ArrayletLeafIterator.__spinePtrOffset_));
	}

	// J9IndexableObject* _spinePtr
	public PointerPointer _spinePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletLeafIterator.__spinePtrOffset_));
	}

}
