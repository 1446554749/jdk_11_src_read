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
 * Structure: MM_HeapRegionDataForAllocatePointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDataForAllocatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDataForAllocate.class)
public class MM_HeapRegionDataForAllocatePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_HeapRegionDataForAllocatePointer NULL = new MM_HeapRegionDataForAllocatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDataForAllocatePointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDataForAllocatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDataForAllocatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDataForAllocatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDataForAllocatePointer(address);
	}

	public MM_HeapRegionDataForAllocatePointer add(long count) {
		return MM_HeapRegionDataForAllocatePointer.cast(address + (MM_HeapRegionDataForAllocate.SIZEOF * count));
	}

	public MM_HeapRegionDataForAllocatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDataForAllocatePointer addOffset(long offset) {
		return MM_HeapRegionDataForAllocatePointer.cast(address + offset);
	}

	public MM_HeapRegionDataForAllocatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDataForAllocatePointer sub(long count) {
		return MM_HeapRegionDataForAllocatePointer.cast(address - (MM_HeapRegionDataForAllocate.SIZEOF * count));
	}

	public MM_HeapRegionDataForAllocatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDataForAllocatePointer subOffset(long offset) {
		return MM_HeapRegionDataForAllocatePointer.cast(address - offset);
	}

	public MM_HeapRegionDataForAllocatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDataForAllocatePointer untag(long mask) {
		return MM_HeapRegionDataForAllocatePointer.cast(address & ~mask);
	}

	public MM_HeapRegionDataForAllocatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDataForAllocate.SIZEOF;
	}

	// Implementation methods

	// UDATA[] _backingStore
	public UDATAPointer _backingStoreEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__backingStoreOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextArrayletLeafRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextArrayletLeafRegionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _nextArrayletLeafRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__nextArrayletLeafRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextArrayletLeafRegion
	public PointerPointer _nextArrayletLeafRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__nextArrayletLeafRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextInList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextInListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _nextInList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__nextInListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextInList
	public PointerPointer _nextInListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__nextInListOffset_));
	}

	// MM_AllocationContextTarok* _originalOwningContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__originalOwningContextOffset_", declaredType="MM_AllocationContextTarok*")
	public MM_AllocationContextTarokPointer _originalOwningContext() throws CorruptDataException {
		return MM_AllocationContextTarokPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__originalOwningContextOffset_));
	}

	// MM_AllocationContextTarok* _originalOwningContext
	public PointerPointer _originalOwningContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__originalOwningContextOffset_));
	}

	// MM_AllocationContextTarok* _owningContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__owningContextOffset_", declaredType="MM_AllocationContextTarok*")
	public MM_AllocationContextTarokPointer _owningContext() throws CorruptDataException {
		return MM_AllocationContextTarokPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__owningContextOffset_));
	}

	// MM_AllocationContextTarok* _owningContext
	public PointerPointer _owningContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__owningContextOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _previousArrayletLeafRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousArrayletLeafRegionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _previousArrayletLeafRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__previousArrayletLeafRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _previousArrayletLeafRegion
	public PointerPointer _previousArrayletLeafRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__previousArrayletLeafRegionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _previousInList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousInListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _previousInList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__previousInListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _previousInList
	public PointerPointer _previousInListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__previousInListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _region() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__regionOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _region
	public PointerPointer _regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__regionOffset_));
	}

	// J9IndexableObject* _spine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spineOffset_", declaredType="J9IndexableObject*")
	public J9IndexableObjectPointer _spine() throws CorruptDataException {
		return J9IndexableObjectPointer.cast(getPointerAtOffset(MM_HeapRegionDataForAllocate.__spineOffset_));
	}

	// J9IndexableObject* _spine
	public PointerPointer _spineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForAllocate.__spineOffset_));
	}

}
