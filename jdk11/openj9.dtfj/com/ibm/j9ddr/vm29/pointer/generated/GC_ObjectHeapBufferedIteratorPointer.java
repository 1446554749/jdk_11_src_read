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
 * Structure: GC_ObjectHeapBufferedIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectHeapBufferedIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectHeapBufferedIterator.class)
public class GC_ObjectHeapBufferedIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ObjectHeapBufferedIteratorPointer NULL = new GC_ObjectHeapBufferedIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectHeapBufferedIteratorPointer(long address) {
		super(address);
	}

	public static GC_ObjectHeapBufferedIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectHeapBufferedIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectHeapBufferedIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectHeapBufferedIteratorPointer(address);
	}

	public GC_ObjectHeapBufferedIteratorPointer add(long count) {
		return GC_ObjectHeapBufferedIteratorPointer.cast(address + (GC_ObjectHeapBufferedIterator.SIZEOF * count));
	}

	public GC_ObjectHeapBufferedIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectHeapBufferedIteratorPointer addOffset(long offset) {
		return GC_ObjectHeapBufferedIteratorPointer.cast(address + offset);
	}

	public GC_ObjectHeapBufferedIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectHeapBufferedIteratorPointer sub(long count) {
		return GC_ObjectHeapBufferedIteratorPointer.cast(address - (GC_ObjectHeapBufferedIterator.SIZEOF * count));
	}

	public GC_ObjectHeapBufferedIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectHeapBufferedIteratorPointer subOffset(long offset) {
		return GC_ObjectHeapBufferedIteratorPointer.cast(address - offset);
	}

	public GC_ObjectHeapBufferedIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectHeapBufferedIteratorPointer untag(long mask) {
		return GC_ObjectHeapBufferedIteratorPointer.cast(address & ~mask);
	}

	public GC_ObjectHeapBufferedIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectHeapBufferedIterator.SIZEOF;
	}

	// Implementation methods

	// MM_AddressOrderedListPopulator _addressOrderedListPopulator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__addressOrderedListPopulatorOffset_", declaredType="MM_AddressOrderedListPopulator")
	public MM_AddressOrderedListPopulatorPointer _addressOrderedListPopulator() throws CorruptDataException {
		return MM_AddressOrderedListPopulatorPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__addressOrderedListPopulatorOffset_));
	}

	// MM_AddressOrderedListPopulator _addressOrderedListPopulator
	public PointerPointer _addressOrderedListPopulatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__addressOrderedListPopulatorOffset_));
	}

	// MM_BumpAllocatedListPopulator _bumpAllocatedListPopulator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bumpAllocatedListPopulatorOffset_", declaredType="MM_BumpAllocatedListPopulator")
	public MM_BumpAllocatedListPopulatorPointer _bumpAllocatedListPopulator() throws CorruptDataException {
		return MM_BumpAllocatedListPopulatorPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__bumpAllocatedListPopulatorOffset_));
	}

	// MM_BumpAllocatedListPopulator _bumpAllocatedListPopulator
	public PointerPointer _bumpAllocatedListPopulatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__bumpAllocatedListPopulatorOffset_));
	}

	// omrobjectptr_t[] _cache
	public PointerPointer _cacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__cacheOffset_));
	}

	// U64 _cacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheCountOffset_", declaredType="U64")
	public UDATA _cacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectHeapBufferedIterator.__cacheCountOffset_));
	}

	// U64 _cacheCount
	public UDATAPointer _cacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__cacheCountOffset_));
	}

	// U64 _cacheIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheIndexOffset_", declaredType="U64")
	public UDATA _cacheIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectHeapBufferedIterator.__cacheIndexOffset_));
	}

	// U64 _cacheIndex
	public UDATAPointer _cacheIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__cacheIndexOffset_));
	}

	// U64 _cacheSizeToUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheSizeToUseOffset_", declaredType="U64")
	public UDATA _cacheSizeToUse() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectHeapBufferedIterator.__cacheSizeToUseOffset_));
	}

	// U64 _cacheSizeToUse
	public UDATAPointer _cacheSizeToUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__cacheSizeToUseOffset_));
	}

	// MM_EmptyListPopulator _emptyListPopulator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__emptyListPopulatorOffset_", declaredType="MM_EmptyListPopulator")
	public MM_EmptyListPopulatorPointer _emptyListPopulator() throws CorruptDataException {
		return MM_EmptyListPopulatorPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__emptyListPopulatorOffset_));
	}

	// MM_EmptyListPopulator _emptyListPopulator
	public PointerPointer _emptyListPopulatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__emptyListPopulatorOffset_));
	}

	// MM_MarkedObjectPopulator _markedObjectPopulator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markedObjectPopulatorOffset_", declaredType="MM_MarkedObjectPopulator")
	public MM_MarkedObjectPopulatorPointer _markedObjectPopulator() throws CorruptDataException {
		return MM_MarkedObjectPopulatorPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__markedObjectPopulatorOffset_));
	}

	// MM_MarkedObjectPopulator _markedObjectPopulator
	public PointerPointer _markedObjectPopulatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__markedObjectPopulatorOffset_));
	}

	// const MM_ObjectHeapBufferedIteratorPopulator* _populator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__populatorOffset_", declaredType="const MM_ObjectHeapBufferedIteratorPopulator*")
	public MM_ObjectHeapBufferedIteratorPopulatorPointer _populator() throws CorruptDataException {
		return MM_ObjectHeapBufferedIteratorPopulatorPointer.cast(getPointerAtOffset(GC_ObjectHeapBufferedIterator.__populatorOffset_));
	}

	// const MM_ObjectHeapBufferedIteratorPopulator* _populator
	public PointerPointer _populatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__populatorOffset_));
	}

	// MM_HeapRegionDescriptor* _region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _region() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(GC_ObjectHeapBufferedIterator.__regionOffset_));
	}

	// MM_HeapRegionDescriptor* _region
	public PointerPointer _regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__regionOffset_));
	}

	// MM_SegregatedListPopulator _segregatedListPopulator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__segregatedListPopulatorOffset_", declaredType="MM_SegregatedListPopulator")
	public MM_SegregatedListPopulatorPointer _segregatedListPopulator() throws CorruptDataException {
		return MM_SegregatedListPopulatorPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__segregatedListPopulatorOffset_));
	}

	// MM_SegregatedListPopulator _segregatedListPopulator
	public PointerPointer _segregatedListPopulatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__segregatedListPopulatorOffset_));
	}

	// GC_ObjectHeapBufferedIteratorState _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="GC_ObjectHeapBufferedIteratorState")
	public GC_ObjectHeapBufferedIteratorStatePointer _state() throws CorruptDataException {
		return GC_ObjectHeapBufferedIteratorStatePointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__stateOffset_));
	}

	// GC_ObjectHeapBufferedIteratorState _state
	public PointerPointer _stateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__stateOffset_));
	}

	// void** _vptr$GC_ObjectHeapBufferedIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$GC_ObjectHeapBufferedIteratorOffset_", declaredType="void**")
	public PointerPointer _vptr$GC_ObjectHeapBufferedIterator() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_ObjectHeapBufferedIterator.__vptr$GC_ObjectHeapBufferedIteratorOffset_));
	}

	// void** _vptr$GC_ObjectHeapBufferedIterator
	public PointerPointer _vptr$GC_ObjectHeapBufferedIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapBufferedIterator.__vptr$GC_ObjectHeapBufferedIteratorOffset_));
	}

}
