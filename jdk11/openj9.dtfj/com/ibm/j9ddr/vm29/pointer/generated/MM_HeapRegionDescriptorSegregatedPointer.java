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
 * Structure: MM_HeapRegionDescriptorSegregatedPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDescriptorSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDescriptorSegregated.class)
public class MM_HeapRegionDescriptorSegregatedPointer extends MM_HeapRegionDescriptorPointer {

	// NULL
	public static final MM_HeapRegionDescriptorSegregatedPointer NULL = new MM_HeapRegionDescriptorSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDescriptorSegregatedPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDescriptorSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDescriptorSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDescriptorSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDescriptorSegregatedPointer(address);
	}

	public MM_HeapRegionDescriptorSegregatedPointer add(long count) {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(address + (MM_HeapRegionDescriptorSegregated.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDescriptorSegregatedPointer addOffset(long offset) {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(address + offset);
	}

	public MM_HeapRegionDescriptorSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorSegregatedPointer sub(long count) {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(address - (MM_HeapRegionDescriptorSegregated.SIZEOF * count));
	}

	public MM_HeapRegionDescriptorSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDescriptorSegregatedPointer subOffset(long offset) {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(address - offset);
	}

	public MM_HeapRegionDescriptorSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDescriptorSegregatedPointer untag(long mask) {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(address & ~mask);
	}

	public MM_HeapRegionDescriptorSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDescriptorSegregated.SIZEOF;
	}

	// Implementation methods

	// void** _arrayletBackPointers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletBackPointersOffset_", declaredType="void**")
	public PointerPointer _arrayletBackPointers() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorSegregated.__arrayletBackPointersOffset_));
	}

	// void** _arrayletBackPointers
	public PointerPointer _arrayletBackPointersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__arrayletBackPointersOffset_));
	}

	// MM_MemoryPoolAggregatedCellList _memoryPoolACL
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolACLOffset_", declaredType="MM_MemoryPoolAggregatedCellList")
	public MM_MemoryPoolAggregatedCellListPointer _memoryPoolACL() throws CorruptDataException {
		return MM_MemoryPoolAggregatedCellListPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__memoryPoolACLOffset_));
	}

	// MM_MemoryPoolAggregatedCellList _memoryPoolACL
	public PointerPointer _memoryPoolACLEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__memoryPoolACLOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _next() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorSegregated.__nextOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__nextOffset_));
	}

	// U64 _nextArrayletIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextArrayletIndexOffset_", declaredType="U64")
	public UDATA _nextArrayletIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorSegregated.__nextArrayletIndexOffset_));
	}

	// U64 _nextArrayletIndex
	public UDATAPointer _nextArrayletIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__nextArrayletIndexOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__prevOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _prev() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorSegregated.__prevOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _prev
	public PointerPointer _prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__prevOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorSegregated.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__regionManagerOffset_));
	}

	// OMR_SizeClasses* _segregatedSizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__segregatedSizeClassesOffset_", declaredType="OMR_SizeClasses*")
	public OMR_SizeClassesPointer _segregatedSizeClasses() throws CorruptDataException {
		return OMR_SizeClassesPointer.cast(getPointerAtOffset(MM_HeapRegionDescriptorSegregated.__segregatedSizeClassesOffset_));
	}

	// OMR_SizeClasses* _segregatedSizeClasses
	public PointerPointer _segregatedSizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__segregatedSizeClassesOffset_));
	}

	// U64 _sizeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassOffset_", declaredType="U64")
	public UDATA _sizeClass() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapRegionDescriptorSegregated.__sizeClassOffset_));
	}

	// U64 _sizeClass
	public UDATAPointer _sizeClassEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDescriptorSegregated.__sizeClassOffset_));
	}

}
