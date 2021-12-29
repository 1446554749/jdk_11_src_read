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
 * Structure: MM_MemorySpacePointer
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
 * The generated code will provide getters for all elements in the MM_MemorySpacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemorySpace.class)
public class MM_MemorySpacePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_MemorySpacePointer NULL = new MM_MemorySpacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemorySpacePointer(long address) {
		super(address);
	}

	public static MM_MemorySpacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemorySpacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemorySpacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemorySpacePointer(address);
	}

	public MM_MemorySpacePointer add(long count) {
		return MM_MemorySpacePointer.cast(address + (MM_MemorySpace.SIZEOF * count));
	}

	public MM_MemorySpacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemorySpacePointer addOffset(long offset) {
		return MM_MemorySpacePointer.cast(address + offset);
	}

	public MM_MemorySpacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemorySpacePointer sub(long count) {
		return MM_MemorySpacePointer.cast(address - (MM_MemorySpace.SIZEOF * count));
	}

	public MM_MemorySpacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemorySpacePointer subOffset(long offset) {
		return MM_MemorySpacePointer.cast(address - offset);
	}

	public MM_MemorySpacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemorySpacePointer untag(long mask) {
		return MM_MemorySpacePointer.cast(address & ~mask);
	}

	public MM_MemorySpacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemorySpace.SIZEOF;
	}

	// Implementation methods

	// U64 _currentSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSizeOffset_", declaredType="U64")
	public UDATA _currentSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySpace.__currentSizeOffset_));
	}

	// U64 _currentSize
	public UDATAPointer _currentSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySpace.__currentSizeOffset_));
	}

	// MM_MemorySubSpace* _defaultMemorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultMemorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _defaultMemorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySpace.__defaultMemorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _defaultMemorySubSpace
	public PointerPointer _defaultMemorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__defaultMemorySubSpaceOffset_));
	}

	// const U8* _description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__descriptionOffset_", declaredType="const U8*")
	public U8Pointer _description() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_MemorySpace.__descriptionOffset_));
	}

	// const U8* _description
	public PointerPointer _descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__descriptionOffset_));
	}

	// MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_MemorySpace.__heapOffset_));
	}

	// MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__heapOffset_));
	}

	// U64 _initialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initialSizeOffset_", declaredType="U64")
	public UDATA _initialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySpace.__initialSizeOffset_));
	}

	// U64 _initialSize
	public UDATAPointer _initialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySpace.__initialSizeOffset_));
	}

	// U64 _maximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumSizeOffset_", declaredType="U64")
	public UDATA _maximumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySpace.__maximumSizeOffset_));
	}

	// U64 _maximumSize
	public UDATAPointer _maximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySpace.__maximumSizeOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceListOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceList() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySpace.__memorySubSpaceListOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceList
	public PointerPointer _memorySubSpaceListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__memorySubSpaceListOffset_));
	}

	// U64 _minimumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumSizeOffset_", declaredType="U64")
	public UDATA _minimumSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySpace.__minimumSizeOffset_));
	}

	// U64 _minimumSize
	public UDATAPointer _minimumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySpace.__minimumSizeOffset_));
	}

	// const U8* _name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nameOffset_", declaredType="const U8*")
	public U8Pointer _name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_MemorySpace.__nameOffset_));
	}

	// const U8* _name
	public PointerPointer _nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__nameOffset_));
	}

	// MM_MemorySpace* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _next() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_MemorySpace.__nextOffset_));
	}

	// MM_MemorySpace* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__nextOffset_));
	}

	// MM_PhysicalArena* _physicalArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__physicalArenaOffset_", declaredType="MM_PhysicalArena*")
	public MM_PhysicalArenaPointer _physicalArena() throws CorruptDataException {
		return MM_PhysicalArenaPointer.cast(getPointerAtOffset(MM_MemorySpace.__physicalArenaOffset_));
	}

	// MM_PhysicalArena* _physicalArena
	public PointerPointer _physicalArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__physicalArenaOffset_));
	}

	// MM_MemorySpace* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _previous() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_MemorySpace.__previousOffset_));
	}

	// MM_MemorySpace* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__previousOffset_));
	}

	// MM_MemorySubSpace* _tenureMemorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureMemorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _tenureMemorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySpace.__tenureMemorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _tenureMemorySubSpace
	public PointerPointer _tenureMemorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySpace.__tenureMemorySubSpaceOffset_));
	}

	// U64 _uniqueID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__uniqueIDOffset_", declaredType="U64")
	public UDATA _uniqueID() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySpace.__uniqueIDOffset_));
	}

	// U64 _uniqueID
	public UDATAPointer _uniqueIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySpace.__uniqueIDOffset_));
	}

}
