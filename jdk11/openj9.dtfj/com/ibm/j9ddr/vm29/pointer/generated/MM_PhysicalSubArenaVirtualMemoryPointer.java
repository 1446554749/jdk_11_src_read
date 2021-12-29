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
 * Structure: MM_PhysicalSubArenaVirtualMemoryPointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalSubArenaVirtualMemoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalSubArenaVirtualMemory.class)
public class MM_PhysicalSubArenaVirtualMemoryPointer extends MM_PhysicalSubArenaPointer {

	// NULL
	public static final MM_PhysicalSubArenaVirtualMemoryPointer NULL = new MM_PhysicalSubArenaVirtualMemoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalSubArenaVirtualMemoryPointer(long address) {
		super(address);
	}

	public static MM_PhysicalSubArenaVirtualMemoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalSubArenaVirtualMemoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalSubArenaVirtualMemoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalSubArenaVirtualMemoryPointer(address);
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer add(long count) {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(address + (MM_PhysicalSubArenaVirtualMemory.SIZEOF * count));
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer addOffset(long offset) {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(address + offset);
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer sub(long count) {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(address - (MM_PhysicalSubArenaVirtualMemory.SIZEOF * count));
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer subOffset(long offset) {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(address - offset);
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer untag(long mask) {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(address & ~mask);
	}

	public MM_PhysicalSubArenaVirtualMemoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalSubArenaVirtualMemory.SIZEOF;
	}

	// Implementation methods

	// bool _expandFromHighRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expandFromHighRangeOffset_", declaredType="bool")
	public boolean _expandFromHighRange() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemory.__expandFromHighRangeOffset_);
	}

	// bool _expandFromHighRange
	public BoolPointer _expandFromHighRangeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__expandFromHighRangeOffset_));
	}

	// bool _expandFromLowRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expandFromLowRangeOffset_", declaredType="bool")
	public boolean _expandFromLowRange() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemory.__expandFromLowRangeOffset_);
	}

	// bool _expandFromLowRange
	public BoolPointer _expandFromLowRangeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__expandFromLowRangeOffset_));
	}

	// bool _hasVirtualHighAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasVirtualHighAddressOffset_", declaredType="bool")
	public boolean _hasVirtualHighAddress() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemory.__hasVirtualHighAddressOffset_);
	}

	// bool _hasVirtualHighAddress
	public BoolPointer _hasVirtualHighAddressEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__hasVirtualHighAddressOffset_));
	}

	// bool _hasVirtualLowAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasVirtualLowAddressOffset_", declaredType="bool")
	public boolean _hasVirtualLowAddress() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemory.__hasVirtualLowAddressOffset_);
	}

	// bool _hasVirtualLowAddress
	public BoolPointer _hasVirtualLowAddressEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__hasVirtualLowAddressOffset_));
	}

	// void* _highAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highAddressOffset_", declaredType="void*")
	public VoidPointer _highAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__highAddressOffset_));
	}

	// void* _highAddress
	public PointerPointer _highAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__highAddressOffset_));
	}

	// MM_PhysicalSubArenaVirtualMemory* _highArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highArenaOffset_", declaredType="MM_PhysicalSubArenaVirtualMemory*")
	public MM_PhysicalSubArenaVirtualMemoryPointer _highArena() throws CorruptDataException {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__highArenaOffset_));
	}

	// MM_PhysicalSubArenaVirtualMemory* _highArena
	public PointerPointer _highArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__highArenaOffset_));
	}

	// void* _lowAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowAddressOffset_", declaredType="void*")
	public VoidPointer _lowAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__lowAddressOffset_));
	}

	// void* _lowAddress
	public PointerPointer _lowAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__lowAddressOffset_));
	}

	// MM_PhysicalSubArenaVirtualMemory* _lowArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowArenaOffset_", declaredType="MM_PhysicalSubArenaVirtualMemory*")
	public MM_PhysicalSubArenaVirtualMemoryPointer _lowArena() throws CorruptDataException {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__lowArenaOffset_));
	}

	// MM_PhysicalSubArenaVirtualMemory* _lowArena
	public PointerPointer _lowArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__lowArenaOffset_));
	}

	// U64 _numaNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaNodeOffset_", declaredType="U64")
	public UDATA _numaNode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_PhysicalSubArenaVirtualMemory.__numaNodeOffset_));
	}

	// U64 _numaNode
	public UDATAPointer _numaNodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__numaNodeOffset_));
	}

	// void* _virtualHighAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__virtualHighAddressOffset_", declaredType="void*")
	public VoidPointer _virtualHighAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__virtualHighAddressOffset_));
	}

	// void* _virtualHighAddress
	public PointerPointer _virtualHighAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__virtualHighAddressOffset_));
	}

	// void* _virtualLowAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__virtualLowAddressOffset_", declaredType="void*")
	public VoidPointer _virtualLowAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemory.__virtualLowAddressOffset_));
	}

	// void* _virtualLowAddress
	public PointerPointer _virtualLowAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemory.__virtualLowAddressOffset_));
	}

}
