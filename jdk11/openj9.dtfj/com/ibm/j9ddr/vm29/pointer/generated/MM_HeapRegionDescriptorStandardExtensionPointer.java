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
 * Structure: MM_HeapRegionDescriptorStandardExtensionPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDescriptorStandardExtensionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDescriptorStandardExtension.class)
public class MM_HeapRegionDescriptorStandardExtensionPointer extends StructurePointer {

	// NULL
	public static final MM_HeapRegionDescriptorStandardExtensionPointer NULL = new MM_HeapRegionDescriptorStandardExtensionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDescriptorStandardExtensionPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDescriptorStandardExtensionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDescriptorStandardExtensionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDescriptorStandardExtensionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDescriptorStandardExtensionPointer(address);
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer add(long count) {
		return MM_HeapRegionDescriptorStandardExtensionPointer.cast(address + (MM_HeapRegionDescriptorStandardExtension.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer addOffset(long offset) {
		return MM_HeapRegionDescriptorStandardExtensionPointer.cast(address + offset);
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer sub(long count) {
		return MM_HeapRegionDescriptorStandardExtensionPointer.cast(address - (MM_HeapRegionDescriptorStandardExtension.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer subOffset(long offset) {
		return MM_HeapRegionDescriptorStandardExtensionPointer.cast(address - offset);
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer untag(long mask) {
		return MM_HeapRegionDescriptorStandardExtensionPointer.cast(address & ~mask);
	}

	public MM_HeapRegionDescriptorStandardExtensionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDescriptorStandardExtension.SIZEOF;
	}

	// Implementation methods

	// U64 _maxListIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxListIndexOffset_", declaredType="U64")
	public UDATA _maxListIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorStandardExtension.__maxListIndexOffset_));
	}

	// U64 _maxListIndex
	public UDATAPointer _maxListIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorStandardExtension.__maxListIndexOffset_));
	}

	// MM_OwnableSynchronizerObjectList* _ownableSynchronizerObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerObjectListsOffset_", declaredType="MM_OwnableSynchronizerObjectList*")
	public MM_OwnableSynchronizerObjectListPointer _ownableSynchronizerObjectLists() throws CorruptDataException {
		return MM_OwnableSynchronizerObjectListPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorStandardExtension.__ownableSynchronizerObjectListsOffset_));
	}

	// MM_OwnableSynchronizerObjectList* _ownableSynchronizerObjectLists
	public PointerPointer _ownableSynchronizerObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorStandardExtension.__ownableSynchronizerObjectListsOffset_));
	}

	// MM_ReferenceObjectList* _referenceObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectListsOffset_", declaredType="MM_ReferenceObjectList*")
	public MM_ReferenceObjectListPointer _referenceObjectLists() throws CorruptDataException {
		return MM_ReferenceObjectListPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorStandardExtension.__referenceObjectListsOffset_));
	}

	// MM_ReferenceObjectList* _referenceObjectLists
	public PointerPointer _referenceObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorStandardExtension.__referenceObjectListsOffset_));
	}

	// MM_UnfinalizedObjectList* _unfinalizedObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unfinalizedObjectListsOffset_", declaredType="MM_UnfinalizedObjectList*")
	public MM_UnfinalizedObjectListPointer _unfinalizedObjectLists() throws CorruptDataException {
		return MM_UnfinalizedObjectListPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorStandardExtension.__unfinalizedObjectListsOffset_));
	}

	// MM_UnfinalizedObjectList* _unfinalizedObjectLists
	public PointerPointer _unfinalizedObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorStandardExtension.__unfinalizedObjectListsOffset_));
	}

}
