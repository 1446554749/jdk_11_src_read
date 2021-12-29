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
 * Structure: MM_PhysicalArenaPointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalArenaPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalArena.class)
public class MM_PhysicalArenaPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_PhysicalArenaPointer NULL = new MM_PhysicalArenaPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalArenaPointer(long address) {
		super(address);
	}

	public static MM_PhysicalArenaPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalArenaPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalArenaPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalArenaPointer(address);
	}

	public MM_PhysicalArenaPointer add(long count) {
		return MM_PhysicalArenaPointer.cast(address + (MM_PhysicalArena.SIZEOF * count));
	}

	public MM_PhysicalArenaPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalArenaPointer addOffset(long offset) {
		return MM_PhysicalArenaPointer.cast(address + offset);
	}

	public MM_PhysicalArenaPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalArenaPointer sub(long count) {
		return MM_PhysicalArenaPointer.cast(address - (MM_PhysicalArena.SIZEOF * count));
	}

	public MM_PhysicalArenaPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalArenaPointer subOffset(long offset) {
		return MM_PhysicalArenaPointer.cast(address - offset);
	}

	public MM_PhysicalArenaPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalArenaPointer untag(long mask) {
		return MM_PhysicalArenaPointer.cast(address & ~mask);
	}

	public MM_PhysicalArenaPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalArena.SIZEOF;
	}

	// Implementation methods

	// bool _attached
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__attachedOffset_", declaredType="bool")
	public boolean _attached() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalArena.__attachedOffset_);
	}

	// bool _attached
	public BoolPointer _attachedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalArena.__attachedOffset_));
	}

	// MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_PhysicalArena.__heapOffset_));
	}

	// MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__heapOffset_));
	}

	// void* _highAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highAddressOffset_", declaredType="void*")
	public VoidPointer _highAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalArena.__highAddressOffset_));
	}

	// void* _highAddress
	public PointerPointer _highAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__highAddressOffset_));
	}

	// void* _lowAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowAddressOffset_", declaredType="void*")
	public VoidPointer _lowAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalArena.__lowAddressOffset_));
	}

	// void* _lowAddress
	public PointerPointer _lowAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__lowAddressOffset_));
	}

	// MM_MemorySpace* _memorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySpaceOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _memorySpace() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_PhysicalArena.__memorySpaceOffset_));
	}

	// MM_MemorySpace* _memorySpace
	public PointerPointer _memorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__memorySpaceOffset_));
	}

	// MM_PhysicalArena* _nextArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextArenaOffset_", declaredType="MM_PhysicalArena*")
	public MM_PhysicalArenaPointer _nextArena() throws CorruptDataException {
		return MM_PhysicalArenaPointer.cast(getPointerAtOffset(MM_PhysicalArena.__nextArenaOffset_));
	}

	// MM_PhysicalArena* _nextArena
	public PointerPointer _nextArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__nextArenaOffset_));
	}

	// MM_PhysicalArena* _previousArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousArenaOffset_", declaredType="MM_PhysicalArena*")
	public MM_PhysicalArenaPointer _previousArena() throws CorruptDataException {
		return MM_PhysicalArenaPointer.cast(getPointerAtOffset(MM_PhysicalArena.__previousArenaOffset_));
	}

	// MM_PhysicalArena* _previousArena
	public PointerPointer _previousArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArena.__previousArenaOffset_));
	}

}
