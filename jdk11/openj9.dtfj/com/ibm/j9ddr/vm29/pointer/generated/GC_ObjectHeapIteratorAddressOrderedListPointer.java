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
 * Structure: GC_ObjectHeapIteratorAddressOrderedListPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectHeapIteratorAddressOrderedListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectHeapIteratorAddressOrderedList.class)
public class GC_ObjectHeapIteratorAddressOrderedListPointer extends GC_ObjectHeapIteratorPointer {

	// NULL
	public static final GC_ObjectHeapIteratorAddressOrderedListPointer NULL = new GC_ObjectHeapIteratorAddressOrderedListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectHeapIteratorAddressOrderedListPointer(long address) {
		super(address);
	}

	public static GC_ObjectHeapIteratorAddressOrderedListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectHeapIteratorAddressOrderedListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectHeapIteratorAddressOrderedListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectHeapIteratorAddressOrderedListPointer(address);
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer add(long count) {
		return GC_ObjectHeapIteratorAddressOrderedListPointer.cast(address + (GC_ObjectHeapIteratorAddressOrderedList.SIZEOF * count));
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer addOffset(long offset) {
		return GC_ObjectHeapIteratorAddressOrderedListPointer.cast(address + offset);
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer sub(long count) {
		return GC_ObjectHeapIteratorAddressOrderedListPointer.cast(address - (GC_ObjectHeapIteratorAddressOrderedList.SIZEOF * count));
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer subOffset(long offset) {
		return GC_ObjectHeapIteratorAddressOrderedListPointer.cast(address - offset);
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer untag(long mask) {
		return GC_ObjectHeapIteratorAddressOrderedListPointer.cast(address & ~mask);
	}

	public GC_ObjectHeapIteratorAddressOrderedListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectHeapIteratorAddressOrderedList.SIZEOF;
	}

	// Implementation methods

	// U64 _deadObjectSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deadObjectSizeOffset_", declaredType="U64")
	public UDATA _deadObjectSize() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__deadObjectSizeOffset_));
	}

	// U64 _deadObjectSize
	public UDATAPointer _deadObjectSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__deadObjectSizeOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__extensionsOffset_));
	}

	// bool _includeDeadObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeDeadObjectsOffset_", declaredType="bool")
	public boolean _includeDeadObjects() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__includeDeadObjectsOffset_);
	}

	// bool _includeDeadObjects
	public BoolPointer _includeDeadObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__includeDeadObjectsOffset_));
	}

	// bool _includeForwardedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeForwardedObjectsOffset_", declaredType="bool")
	public boolean _includeForwardedObjects() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__includeForwardedObjectsOffset_);
	}

	// bool _includeForwardedObjects
	public BoolPointer _includeForwardedObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__includeForwardedObjectsOffset_));
	}

	// bool _isDeadObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isDeadObjectOffset_", declaredType="bool")
	public boolean _isDeadObject() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__isDeadObjectOffset_);
	}

	// bool _isDeadObject
	public BoolPointer _isDeadObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__isDeadObjectOffset_));
	}

	// bool _isSingleSlotHole
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSingleSlotHoleOffset_", declaredType="bool")
	public boolean _isSingleSlotHole() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__isSingleSlotHoleOffset_);
	}

	// bool _isSingleSlotHole
	public BoolPointer _isSingleSlotHoleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__isSingleSlotHoleOffset_));
	}

	// bool _pastFirstObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pastFirstObjectOffset_", declaredType="bool")
	public boolean _pastFirstObject() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__pastFirstObjectOffset_);
	}

	// bool _pastFirstObject
	public BoolPointer _pastFirstObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__pastFirstObjectOffset_));
	}

	// omrobjectptr_t _scanPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _scanPtr() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__scanPtrOffset_));
	}

	// omrobjectptr_t _scanPtr
	public PointerPointer _scanPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__scanPtrOffset_));
	}

	// omrobjectptr_t _scanPtrTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrTopOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _scanPtrTop() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorAddressOrderedList.__scanPtrTopOffset_));
	}

	// omrobjectptr_t _scanPtrTop
	public PointerPointer _scanPtrTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorAddressOrderedList.__scanPtrTopOffset_));
	}

}
