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
 * Structure: J9ModronFreeListPointer
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
 * The generated code will provide getters for all elements in the J9ModronFreeListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ModronFreeList.class)
public class J9ModronFreeListPointer extends StructurePointer {

	// NULL
	public static final J9ModronFreeListPointer NULL = new J9ModronFreeListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ModronFreeListPointer(long address) {
		super(address);
	}

	public static J9ModronFreeListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ModronFreeListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ModronFreeListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ModronFreeListPointer(address);
	}

	public J9ModronFreeListPointer add(long count) {
		return J9ModronFreeListPointer.cast(address + (J9ModronFreeList.SIZEOF * count));
	}

	public J9ModronFreeListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ModronFreeListPointer addOffset(long offset) {
		return J9ModronFreeListPointer.cast(address + offset);
	}

	public J9ModronFreeListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ModronFreeListPointer sub(long count) {
		return J9ModronFreeListPointer.cast(address - (J9ModronFreeList.SIZEOF * count));
	}

	public J9ModronFreeListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ModronFreeListPointer subOffset(long offset) {
		return J9ModronFreeListPointer.cast(address - offset);
	}

	public J9ModronFreeListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ModronFreeListPointer untag(long mask) {
		return J9ModronFreeListPointer.cast(address & ~mask);
	}

	public J9ModronFreeListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ModronFreeList.SIZEOF;
	}

	// Implementation methods

	// U64 _freeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeCountOffset_", declaredType="U64")
	public UDATA _freeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ModronFreeList.__freeCountOffset_));
	}

	// U64 _freeCount
	public UDATAPointer _freeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronFreeList.__freeCountOffset_));
	}

	// MM_HeapLinkedFreeHeader* _freeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListOffset_", declaredType="MM_HeapLinkedFreeHeader*")
	public MM_HeapLinkedFreeHeaderPointer _freeList() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderPointer.cast(getPointerAtOffset(J9ModronFreeList.__freeListOffset_));
	}

	// MM_HeapLinkedFreeHeader* _freeList
	public PointerPointer _freeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronFreeList.__freeListOffset_));
	}

	// U64 _freeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeSizeOffset_", declaredType="U64")
	public UDATA _freeSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ModronFreeList.__freeSizeOffset_));
	}

	// U64 _freeSize
	public UDATAPointer _freeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronFreeList.__freeSizeOffset_));
	}

	// J9ModronAllocateHint* _hintActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintActiveOffset_", declaredType="J9ModronAllocateHint*")
	public J9ModronAllocateHintPointer _hintActive() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(getPointerAtOffset(J9ModronFreeList.__hintActiveOffset_));
	}

	// J9ModronAllocateHint* _hintActive
	public PointerPointer _hintActiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronFreeList.__hintActiveOffset_));
	}

	// J9ModronAllocateHint* _hintInactive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintInactiveOffset_", declaredType="J9ModronAllocateHint*")
	public J9ModronAllocateHintPointer _hintInactive() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(getPointerAtOffset(J9ModronFreeList.__hintInactiveOffset_));
	}

	// J9ModronAllocateHint* _hintInactive
	public PointerPointer _hintInactiveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronFreeList.__hintInactiveOffset_));
	}

	// U64 _hintLru
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hintLruOffset_", declaredType="U64")
	public UDATA _hintLru() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ModronFreeList.__hintLruOffset_));
	}

	// U64 _hintLru
	public UDATAPointer _hintLruEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronFreeList.__hintLruOffset_));
	}

	// J9ModronAllocateHint[] _hintStorage
	public J9ModronAllocateHintPointer _hintStorageEA() throws CorruptDataException {
		return J9ModronAllocateHintPointer.cast(nonNullFieldEA(J9ModronFreeList.__hintStorageOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(J9ModronFreeList.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronFreeList.__lockOffset_));
	}

	// U64 _timesLocked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timesLockedOffset_", declaredType="U64")
	public UDATA _timesLocked() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ModronFreeList.__timesLockedOffset_));
	}

	// U64 _timesLocked
	public UDATAPointer _timesLockedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronFreeList.__timesLockedOffset_));
	}

}
