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
 * Structure: GC_FlattenedContiguousArrayIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_FlattenedContiguousArrayIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_FlattenedContiguousArrayIterator.class)
public class GC_FlattenedContiguousArrayIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_FlattenedContiguousArrayIteratorPointer NULL = new GC_FlattenedContiguousArrayIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_FlattenedContiguousArrayIteratorPointer(long address) {
		super(address);
	}

	public static GC_FlattenedContiguousArrayIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_FlattenedContiguousArrayIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_FlattenedContiguousArrayIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_FlattenedContiguousArrayIteratorPointer(address);
	}

	public GC_FlattenedContiguousArrayIteratorPointer add(long count) {
		return GC_FlattenedContiguousArrayIteratorPointer.cast(address + (GC_FlattenedContiguousArrayIterator.SIZEOF * count));
	}

	public GC_FlattenedContiguousArrayIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_FlattenedContiguousArrayIteratorPointer addOffset(long offset) {
		return GC_FlattenedContiguousArrayIteratorPointer.cast(address + offset);
	}

	public GC_FlattenedContiguousArrayIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_FlattenedContiguousArrayIteratorPointer sub(long count) {
		return GC_FlattenedContiguousArrayIteratorPointer.cast(address - (GC_FlattenedContiguousArrayIterator.SIZEOF * count));
	}

	public GC_FlattenedContiguousArrayIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_FlattenedContiguousArrayIteratorPointer subOffset(long offset) {
		return GC_FlattenedContiguousArrayIteratorPointer.cast(address - offset);
	}

	public GC_FlattenedContiguousArrayIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_FlattenedContiguousArrayIteratorPointer untag(long mask) {
		return GC_FlattenedContiguousArrayIteratorPointer.cast(address & ~mask);
	}

	public GC_FlattenedContiguousArrayIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_FlattenedContiguousArrayIterator.SIZEOF;
	}

	// Implementation methods

	// J9IndexableObject* _arrayPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayPtrOffset_", declaredType="J9IndexableObject*")
	public J9IndexableObjectPointer _arrayPtr() throws CorruptDataException {
		return J9IndexableObjectPointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__arrayPtrOffset_));
	}

	// J9IndexableObject* _arrayPtr
	public PointerPointer _arrayPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__arrayPtrOffset_));
	}

	// fj9object_t* _basePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__basePtrOffset_", declaredType="fj9object_t*")
	public ObjectReferencePointer _basePtr() throws CorruptDataException {
		return ObjectReferencePointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__basePtrOffset_));
	}

	// fj9object_t* _basePtr
	public PointerPointer _basePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__basePtrOffset_));
	}

	// J9Class* _elementClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__elementClassOffset_", declaredType="J9Class*")
	public J9ClassPointer _elementClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__elementClassOffset_));
	}

	// J9Class* _elementClass
	public PointerPointer _elementClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__elementClassOffset_));
	}

	// U64 _elementStride
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__elementStrideOffset_", declaredType="U64")
	public UDATA _elementStride() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_FlattenedContiguousArrayIterator.__elementStrideOffset_));
	}

	// U64 _elementStride
	public UDATAPointer _elementStrideEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__elementStrideOffset_));
	}

	// fj9object_t* _endPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endPtrOffset_", declaredType="fj9object_t*")
	public ObjectReferencePointer _endPtr() throws CorruptDataException {
		return ObjectReferencePointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__endPtrOffset_));
	}

	// fj9object_t* _endPtr
	public PointerPointer _endPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__endPtrOffset_));
	}

	// GC_MixedObjectIterator _mixedObjectIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mixedObjectIteratorOffset_", declaredType="GC_MixedObjectIterator")
	public GC_MixedObjectIteratorPointer _mixedObjectIterator() throws CorruptDataException {
		return GC_MixedObjectIteratorPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__mixedObjectIteratorOffset_));
	}

	// GC_MixedObjectIterator _mixedObjectIterator
	public PointerPointer _mixedObjectIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__mixedObjectIteratorOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__omrVMOffset_));
	}

	// fj9object_t* _scanPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrOffset_", declaredType="fj9object_t*")
	public ObjectReferencePointer _scanPtr() throws CorruptDataException {
		return ObjectReferencePointer.cast(getPointerAtOffset(GC_FlattenedContiguousArrayIterator.__scanPtrOffset_));
	}

	// fj9object_t* _scanPtr
	public PointerPointer _scanPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedContiguousArrayIterator.__scanPtrOffset_));
	}

}
