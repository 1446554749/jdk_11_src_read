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
 * Structure: GC_MixedObjectDeclarationOrderIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_MixedObjectDeclarationOrderIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_MixedObjectDeclarationOrderIterator.class)
public class GC_MixedObjectDeclarationOrderIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_MixedObjectDeclarationOrderIteratorPointer NULL = new GC_MixedObjectDeclarationOrderIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_MixedObjectDeclarationOrderIteratorPointer(long address) {
		super(address);
	}

	public static GC_MixedObjectDeclarationOrderIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_MixedObjectDeclarationOrderIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_MixedObjectDeclarationOrderIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_MixedObjectDeclarationOrderIteratorPointer(address);
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer add(long count) {
		return GC_MixedObjectDeclarationOrderIteratorPointer.cast(address + (GC_MixedObjectDeclarationOrderIterator.SIZEOF * count));
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer addOffset(long offset) {
		return GC_MixedObjectDeclarationOrderIteratorPointer.cast(address + offset);
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer sub(long count) {
		return GC_MixedObjectDeclarationOrderIteratorPointer.cast(address - (GC_MixedObjectDeclarationOrderIterator.SIZEOF * count));
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer subOffset(long offset) {
		return GC_MixedObjectDeclarationOrderIteratorPointer.cast(address - offset);
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer untag(long mask) {
		return GC_MixedObjectDeclarationOrderIteratorPointer.cast(address & ~mask);
	}

	public GC_MixedObjectDeclarationOrderIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_MixedObjectDeclarationOrderIterator.SIZEOF;
	}

	// Implementation methods

	// J9ROMFieldShape* _fieldShape
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fieldShapeOffset_", declaredType="J9ROMFieldShape*")
	public J9ROMFieldShapePointer _fieldShape() throws CorruptDataException {
		return J9ROMFieldShapePointer.cast(getPointerAtOffset(GC_MixedObjectDeclarationOrderIterator.__fieldShapeOffset_));
	}

	// J9ROMFieldShape* _fieldShape
	public PointerPointer _fieldShapeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__fieldShapeOffset_));
	}

	// IDATA _index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__indexOffset_", declaredType="IDATA")
	public IDATA _index() throws CorruptDataException {
		return getIDATAAtOffset(GC_MixedObjectDeclarationOrderIterator.__indexOffset_);
	}

	// IDATA _index
	public IDATAPointer _indexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__indexOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(GC_MixedObjectDeclarationOrderIterator.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__javaVMOffset_));
	}

	// J9Object* _objectPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectPtrOffset_", declaredType="J9Object*")
	public J9ObjectPointer _objectPtr() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_MixedObjectDeclarationOrderIterator.__objectPtrOffset_));
	}

	// J9Object* _objectPtr
	public PointerPointer _objectPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__objectPtrOffset_));
	}

	// GC_SlotObject _slotObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotObjectOffset_", declaredType="GC_SlotObject")
	public GC_SlotObjectPointer _slotObject() throws CorruptDataException {
		return GC_SlotObjectPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__slotObjectOffset_));
	}

	// GC_SlotObject _slotObject
	public PointerPointer _slotObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__slotObjectOffset_));
	}

	// J9ROMFullTraversalFieldOffsetWalkState _walkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__walkStateOffset_", declaredType="J9ROMFullTraversalFieldOffsetWalkState")
	public J9ROMFullTraversalFieldOffsetWalkStatePointer _walkState() throws CorruptDataException {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__walkStateOffset_));
	}

	// J9ROMFullTraversalFieldOffsetWalkState _walkState
	public PointerPointer _walkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MixedObjectDeclarationOrderIterator.__walkStateOffset_));
	}

}
