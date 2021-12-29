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
 * Structure: GC_ClassIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ClassIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ClassIterator.class)
public class GC_ClassIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ClassIteratorPointer NULL = new GC_ClassIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ClassIteratorPointer(long address) {
		super(address);
	}

	public static GC_ClassIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ClassIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ClassIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ClassIteratorPointer(address);
	}

	public GC_ClassIteratorPointer add(long count) {
		return GC_ClassIteratorPointer.cast(address + (GC_ClassIterator.SIZEOF * count));
	}

	public GC_ClassIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ClassIteratorPointer addOffset(long offset) {
		return GC_ClassIteratorPointer.cast(address + offset);
	}

	public GC_ClassIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ClassIteratorPointer sub(long count) {
		return GC_ClassIteratorPointer.cast(address - (GC_ClassIterator.SIZEOF * count));
	}

	public GC_ClassIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ClassIteratorPointer subOffset(long offset) {
		return GC_ClassIteratorPointer.cast(address - offset);
	}

	public GC_ClassIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ClassIteratorPointer untag(long mask) {
		return GC_ClassIteratorPointer.cast(address & ~mask);
	}

	public GC_ClassIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ClassIterator.SIZEOF;
	}

	// Implementation methods

	// GC_CallSitesIterator _callSitesIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__callSitesIteratorOffset_", declaredType="GC_CallSitesIterator")
	public GC_CallSitesIteratorPointer _callSitesIterator() throws CorruptDataException {
		return GC_CallSitesIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__callSitesIteratorOffset_));
	}

	// GC_CallSitesIterator _callSitesIterator
	public PointerPointer _callSitesIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__callSitesIteratorOffset_));
	}

	// GC_ClassStaticsIterator _classStaticsIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classStaticsIteratorOffset_", declaredType="GC_ClassStaticsIterator")
	public GC_ClassStaticsIteratorPointer _classStaticsIterator() throws CorruptDataException {
		return GC_ClassStaticsIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__classStaticsIteratorOffset_));
	}

	// GC_ClassStaticsIterator _classStaticsIterator
	public PointerPointer _classStaticsIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__classStaticsIteratorOffset_));
	}

	// J9Class* _clazzPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clazzPtrOffset_", declaredType="J9Class*")
	public J9ClassPointer _clazzPtr() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ClassIterator.__clazzPtrOffset_));
	}

	// J9Class* _clazzPtr
	public PointerPointer _clazzPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__clazzPtrOffset_));
	}

	// GC_ConstantPoolObjectSlotIterator _constantPoolObjectSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolObjectSlotIteratorOffset_", declaredType="GC_ConstantPoolObjectSlotIterator")
	public GC_ConstantPoolObjectSlotIteratorPointer _constantPoolObjectSlotIterator() throws CorruptDataException {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__constantPoolObjectSlotIteratorOffset_));
	}

	// GC_ConstantPoolObjectSlotIterator _constantPoolObjectSlotIterator
	public PointerPointer _constantPoolObjectSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__constantPoolObjectSlotIteratorOffset_));
	}

	// GC_MethodTypesIterator _methodTypesIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodTypesIteratorOffset_", declaredType="GC_MethodTypesIterator")
	public GC_MethodTypesIteratorPointer _methodTypesIterator() throws CorruptDataException {
		return GC_MethodTypesIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__methodTypesIteratorOffset_));
	}

	// GC_MethodTypesIterator _methodTypesIterator
	public PointerPointer _methodTypesIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__methodTypesIteratorOffset_));
	}

	// UDATA _scanIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanIndexOffset_", declaredType="UDATA")
	public UDATA _scanIndex() throws CorruptDataException {
		return getUDATAAtOffset(GC_ClassIterator.__scanIndexOffset_);
	}

	// UDATA _scanIndex
	public UDATAPointer _scanIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ClassIterator.__scanIndexOffset_));
	}

	// const bool _shouldScanClassObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScanClassObjectOffset_", declaredType="const bool")
	public boolean _shouldScanClassObject() throws CorruptDataException {
		return getBoolAtOffset(GC_ClassIterator.__shouldScanClassObjectOffset_);
	}

	// const bool _shouldScanClassObject
	public BoolPointer _shouldScanClassObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ClassIterator.__shouldScanClassObjectOffset_));
	}

	// I32 _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="I32")
	public IDATA _state() throws CorruptDataException {
		return new I32(getIntAtOffset(GC_ClassIterator.__stateOffset_));
	}

	// I32 _state
	public IDATAPointer _stateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(GC_ClassIterator.__stateOffset_));
	}

	// GC_ValueTypesIterator _valueTypesIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__valueTypesIteratorOffset_", declaredType="GC_ValueTypesIterator")
	public GC_ValueTypesIteratorPointer _valueTypesIterator() throws CorruptDataException {
		return GC_ValueTypesIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__valueTypesIteratorOffset_));
	}

	// GC_ValueTypesIterator _valueTypesIterator
	public PointerPointer _valueTypesIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__valueTypesIteratorOffset_));
	}

	// GC_MethodTypesIterator _varHandlesMethodTypesIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__varHandlesMethodTypesIteratorOffset_", declaredType="GC_MethodTypesIterator")
	public GC_MethodTypesIteratorPointer _varHandlesMethodTypesIterator() throws CorruptDataException {
		return GC_MethodTypesIteratorPointer.cast(nonNullFieldEA(GC_ClassIterator.__varHandlesMethodTypesIteratorOffset_));
	}

	// GC_MethodTypesIterator _varHandlesMethodTypesIterator
	public PointerPointer _varHandlesMethodTypesIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__varHandlesMethodTypesIteratorOffset_));
	}

	// void** _vptr$GC_ClassIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$GC_ClassIteratorOffset_", declaredType="void**")
	public PointerPointer _vptr$GC_ClassIterator() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_ClassIterator.__vptr$GC_ClassIteratorOffset_));
	}

	// void** _vptr$GC_ClassIterator
	public PointerPointer _vptr$GC_ClassIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassIterator.__vptr$GC_ClassIteratorOffset_));
	}

}
