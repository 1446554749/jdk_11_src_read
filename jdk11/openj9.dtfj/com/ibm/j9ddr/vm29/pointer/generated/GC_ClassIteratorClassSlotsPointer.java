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
 * Structure: GC_ClassIteratorClassSlotsPointer
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
 * The generated code will provide getters for all elements in the GC_ClassIteratorClassSlotsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ClassIteratorClassSlots.class)
public class GC_ClassIteratorClassSlotsPointer extends StructurePointer {

	// NULL
	public static final GC_ClassIteratorClassSlotsPointer NULL = new GC_ClassIteratorClassSlotsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ClassIteratorClassSlotsPointer(long address) {
		super(address);
	}

	public static GC_ClassIteratorClassSlotsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ClassIteratorClassSlotsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ClassIteratorClassSlotsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ClassIteratorClassSlotsPointer(address);
	}

	public GC_ClassIteratorClassSlotsPointer add(long count) {
		return GC_ClassIteratorClassSlotsPointer.cast(address + (GC_ClassIteratorClassSlots.SIZEOF * count));
	}

	public GC_ClassIteratorClassSlotsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ClassIteratorClassSlotsPointer addOffset(long offset) {
		return GC_ClassIteratorClassSlotsPointer.cast(address + offset);
	}

	public GC_ClassIteratorClassSlotsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ClassIteratorClassSlotsPointer sub(long count) {
		return GC_ClassIteratorClassSlotsPointer.cast(address - (GC_ClassIteratorClassSlots.SIZEOF * count));
	}

	public GC_ClassIteratorClassSlotsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ClassIteratorClassSlotsPointer subOffset(long offset) {
		return GC_ClassIteratorClassSlotsPointer.cast(address - offset);
	}

	public GC_ClassIteratorClassSlotsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ClassIteratorClassSlotsPointer untag(long mask) {
		return GC_ClassIteratorClassSlotsPointer.cast(address & ~mask);
	}

	public GC_ClassIteratorClassSlotsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ClassIteratorClassSlots.SIZEOF;
	}

	// Implementation methods

	// GC_ClassArrayClassSlotIterator _classArrayClassSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classArrayClassSlotIteratorOffset_", declaredType="GC_ClassArrayClassSlotIterator")
	public GC_ClassArrayClassSlotIteratorPointer _classArrayClassSlotIterator() throws CorruptDataException {
		return GC_ClassArrayClassSlotIteratorPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classArrayClassSlotIteratorOffset_));
	}

	// GC_ClassArrayClassSlotIterator _classArrayClassSlotIterator
	public PointerPointer _classArrayClassSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classArrayClassSlotIteratorOffset_));
	}

	// GC_ClassLocalInterfaceIterator _classLocalInterfaceIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLocalInterfaceIteratorOffset_", declaredType="GC_ClassLocalInterfaceIterator")
	public GC_ClassLocalInterfaceIteratorPointer _classLocalInterfaceIterator() throws CorruptDataException {
		return GC_ClassLocalInterfaceIteratorPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classLocalInterfaceIteratorOffset_));
	}

	// GC_ClassLocalInterfaceIterator _classLocalInterfaceIterator
	public PointerPointer _classLocalInterfaceIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classLocalInterfaceIteratorOffset_));
	}

	// GC_ClassSuperclassesIterator _classSuperclassesIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classSuperclassesIteratorOffset_", declaredType="GC_ClassSuperclassesIterator")
	public GC_ClassSuperclassesIteratorPointer _classSuperclassesIterator() throws CorruptDataException {
		return GC_ClassSuperclassesIteratorPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classSuperclassesIteratorOffset_));
	}

	// GC_ClassSuperclassesIterator _classSuperclassesIterator
	public PointerPointer _classSuperclassesIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__classSuperclassesIteratorOffset_));
	}

	// J9Class* _clazzPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clazzPtrOffset_", declaredType="J9Class*")
	public J9ClassPointer _clazzPtr() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ClassIteratorClassSlots.__clazzPtrOffset_));
	}

	// J9Class* _clazzPtr
	public PointerPointer _clazzPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__clazzPtrOffset_));
	}

	// GC_ConstantPoolClassSlotIterator _constantPoolClassSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolClassSlotIteratorOffset_", declaredType="GC_ConstantPoolClassSlotIterator")
	public GC_ConstantPoolClassSlotIteratorPointer _constantPoolClassSlotIterator() throws CorruptDataException {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__constantPoolClassSlotIteratorOffset_));
	}

	// GC_ConstantPoolClassSlotIterator _constantPoolClassSlotIterator
	public PointerPointer _constantPoolClassSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__constantPoolClassSlotIteratorOffset_));
	}

	// const bool _shouldScanInterfaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScanInterfacesOffset_", declaredType="const bool")
	public boolean _shouldScanInterfaces() throws CorruptDataException {
		return getBoolAtOffset(GC_ClassIteratorClassSlots.__shouldScanInterfacesOffset_);
	}

	// const bool _shouldScanInterfaces
	public BoolPointer _shouldScanInterfacesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__shouldScanInterfacesOffset_));
	}

	// I32 _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="I32")
	public IDATA _state() throws CorruptDataException {
		return new I32(getIntAtOffset(GC_ClassIteratorClassSlots.__stateOffset_));
	}

	// I32 _state
	public IDATAPointer _stateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(GC_ClassIteratorClassSlots.__stateOffset_));
	}

}
