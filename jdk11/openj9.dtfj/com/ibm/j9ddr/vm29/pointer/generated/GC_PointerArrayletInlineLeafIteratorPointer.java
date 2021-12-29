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
 * Structure: GC_PointerArrayletInlineLeafIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_PointerArrayletInlineLeafIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_PointerArrayletInlineLeafIterator.class)
public class GC_PointerArrayletInlineLeafIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_PointerArrayletInlineLeafIteratorPointer NULL = new GC_PointerArrayletInlineLeafIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_PointerArrayletInlineLeafIteratorPointer(long address) {
		super(address);
	}

	public static GC_PointerArrayletInlineLeafIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_PointerArrayletInlineLeafIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_PointerArrayletInlineLeafIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_PointerArrayletInlineLeafIteratorPointer(address);
	}

	public GC_PointerArrayletInlineLeafIteratorPointer add(long count) {
		return GC_PointerArrayletInlineLeafIteratorPointer.cast(address + (GC_PointerArrayletInlineLeafIterator.SIZEOF * count));
	}

	public GC_PointerArrayletInlineLeafIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_PointerArrayletInlineLeafIteratorPointer addOffset(long offset) {
		return GC_PointerArrayletInlineLeafIteratorPointer.cast(address + offset);
	}

	public GC_PointerArrayletInlineLeafIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_PointerArrayletInlineLeafIteratorPointer sub(long count) {
		return GC_PointerArrayletInlineLeafIteratorPointer.cast(address - (GC_PointerArrayletInlineLeafIterator.SIZEOF * count));
	}

	public GC_PointerArrayletInlineLeafIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_PointerArrayletInlineLeafIteratorPointer subOffset(long offset) {
		return GC_PointerArrayletInlineLeafIteratorPointer.cast(address - offset);
	}

	public GC_PointerArrayletInlineLeafIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_PointerArrayletInlineLeafIteratorPointer untag(long mask) {
		return GC_PointerArrayletInlineLeafIteratorPointer.cast(address & ~mask);
	}

	public GC_PointerArrayletInlineLeafIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_PointerArrayletInlineLeafIterator.SIZEOF;
	}

	// Implementation methods

	// UDATA _arrayletLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletLeafSizeOffset_", declaredType="UDATA")
	public UDATA _arrayletLeafSize() throws CorruptDataException {
		return getUDATAAtOffset(GC_PointerArrayletInlineLeafIterator.__arrayletLeafSizeOffset_);
	}

	// UDATA _arrayletLeafSize
	public UDATAPointer _arrayletLeafSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__arrayletLeafSizeOffset_));
	}

	// const bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="const bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(GC_PointerArrayletInlineLeafIterator.__compressObjectReferencesOffset_);
	}

	// const bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__compressObjectReferencesOffset_));
	}

	// fj9object_t* _currentArrayletBaseAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentArrayletBaseAddressOffset_", declaredType="fj9object_t*")
	public ObjectReferencePointer _currentArrayletBaseAddress() throws CorruptDataException {
		return ObjectReferencePointer.cast(getPointerAtOffset(GC_PointerArrayletInlineLeafIterator.__currentArrayletBaseAddressOffset_));
	}

	// fj9object_t* _currentArrayletBaseAddress
	public PointerPointer _currentArrayletBaseAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__currentArrayletBaseAddressOffset_));
	}

	// UDATA _currentArrayletOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentArrayletOffsetOffset_", declaredType="UDATA")
	public UDATA _currentArrayletOffset() throws CorruptDataException {
		return getUDATAAtOffset(GC_PointerArrayletInlineLeafIterator.__currentArrayletOffsetOffset_);
	}

	// UDATA _currentArrayletOffset
	public UDATAPointer _currentArrayletOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__currentArrayletOffsetOffset_));
	}

	// UDATA _elementsStillToRead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__elementsStillToReadOffset_", declaredType="UDATA")
	public UDATA _elementsStillToRead() throws CorruptDataException {
		return getUDATAAtOffset(GC_PointerArrayletInlineLeafIterator.__elementsStillToReadOffset_);
	}

	// UDATA _elementsStillToRead
	public UDATAPointer _elementsStillToReadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__elementsStillToReadOffset_));
	}

	// UDATA _fobjectsPerLeaf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fobjectsPerLeafOffset_", declaredType="UDATA")
	public UDATA _fobjectsPerLeaf() throws CorruptDataException {
		return getUDATAAtOffset(GC_PointerArrayletInlineLeafIterator.__fobjectsPerLeafOffset_);
	}

	// UDATA _fobjectsPerLeaf
	public UDATAPointer _fobjectsPerLeafEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__fobjectsPerLeafOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(GC_PointerArrayletInlineLeafIterator.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__javaVMOffset_));
	}

	// GC_SlotObject _slotObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotObjectOffset_", declaredType="GC_SlotObject")
	public GC_SlotObjectPointer _slotObject() throws CorruptDataException {
		return GC_SlotObjectPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__slotObjectOffset_));
	}

	// GC_SlotObject _slotObject
	public PointerPointer _slotObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PointerArrayletInlineLeafIterator.__slotObjectOffset_));
	}

}
