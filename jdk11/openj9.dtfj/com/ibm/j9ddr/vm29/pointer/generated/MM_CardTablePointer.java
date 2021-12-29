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
 * Structure: MM_CardTablePointer
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
 * The generated code will provide getters for all elements in the MM_CardTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CardTable.class)
public class MM_CardTablePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_CardTablePointer NULL = new MM_CardTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CardTablePointer(long address) {
		super(address);
	}

	public static MM_CardTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CardTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CardTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CardTablePointer(address);
	}

	public MM_CardTablePointer add(long count) {
		return MM_CardTablePointer.cast(address + (MM_CardTable.SIZEOF * count));
	}

	public MM_CardTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CardTablePointer addOffset(long offset) {
		return MM_CardTablePointer.cast(address + offset);
	}

	public MM_CardTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CardTablePointer sub(long count) {
		return MM_CardTablePointer.cast(address - (MM_CardTable.SIZEOF * count));
	}

	public MM_CardTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CardTablePointer subOffset(long offset) {
		return MM_CardTablePointer.cast(address - offset);
	}

	public MM_CardTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CardTablePointer untag(long mask) {
		return MM_CardTablePointer.cast(address & ~mask);
	}

	public MM_CardTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CardTable.SIZEOF;
	}

	// Implementation methods

	// MM_MemoryHandle _cardTableMemoryHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableMemoryHandleOffset_", declaredType="MM_MemoryHandle")
	public MM_MemoryHandlePointer _cardTableMemoryHandle() throws CorruptDataException {
		return MM_MemoryHandlePointer.cast(nonNullFieldEA(MM_CardTable.__cardTableMemoryHandleOffset_));
	}

	// MM_MemoryHandle _cardTableMemoryHandle
	public PointerPointer _cardTableMemoryHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CardTable.__cardTableMemoryHandleOffset_));
	}

	// Card* _cardTableStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableStartOffset_", declaredType="Card*")
	public U8Pointer _cardTableStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_CardTable.__cardTableStartOffset_));
	}

	// Card* _cardTableStart
	public PointerPointer _cardTableStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CardTable.__cardTableStartOffset_));
	}

	// Card* _cardTableVirtualStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardTableVirtualStartOffset_", declaredType="Card*")
	public U8Pointer _cardTableVirtualStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_CardTable.__cardTableVirtualStartOffset_));
	}

	// Card* _cardTableVirtualStart
	public PointerPointer _cardTableVirtualStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CardTable.__cardTableVirtualStartOffset_));
	}

	// void* _heapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapAllocOffset_", declaredType="void*")
	public VoidPointer _heapAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CardTable.__heapAllocOffset_));
	}

	// void* _heapAlloc
	public PointerPointer _heapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CardTable.__heapAllocOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CardTable.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CardTable.__heapBaseOffset_));
	}

}
