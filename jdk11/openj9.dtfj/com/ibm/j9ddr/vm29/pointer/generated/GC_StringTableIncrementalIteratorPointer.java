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
 * Structure: GC_StringTableIncrementalIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_StringTableIncrementalIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_StringTableIncrementalIterator.class)
public class GC_StringTableIncrementalIteratorPointer extends GC_HashTableIteratorPointer {

	// NULL
	public static final GC_StringTableIncrementalIteratorPointer NULL = new GC_StringTableIncrementalIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_StringTableIncrementalIteratorPointer(long address) {
		super(address);
	}

	public static GC_StringTableIncrementalIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_StringTableIncrementalIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_StringTableIncrementalIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_StringTableIncrementalIteratorPointer(address);
	}

	public GC_StringTableIncrementalIteratorPointer add(long count) {
		return GC_StringTableIncrementalIteratorPointer.cast(address + (GC_StringTableIncrementalIterator.SIZEOF * count));
	}

	public GC_StringTableIncrementalIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_StringTableIncrementalIteratorPointer addOffset(long offset) {
		return GC_StringTableIncrementalIteratorPointer.cast(address + offset);
	}

	public GC_StringTableIncrementalIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_StringTableIncrementalIteratorPointer sub(long count) {
		return GC_StringTableIncrementalIteratorPointer.cast(address - (GC_StringTableIncrementalIterator.SIZEOF * count));
	}

	public GC_StringTableIncrementalIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_StringTableIncrementalIteratorPointer subOffset(long offset) {
		return GC_StringTableIncrementalIteratorPointer.cast(address - offset);
	}

	public GC_StringTableIncrementalIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_StringTableIncrementalIteratorPointer untag(long mask) {
		return GC_StringTableIncrementalIteratorPointer.cast(address & ~mask);
	}

	public GC_StringTableIncrementalIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_StringTableIncrementalIterator.SIZEOF;
	}

	// Implementation methods

	// J9Pool* _currentIteratePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentIteratePoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer _currentIteratePool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__currentIteratePoolOffset_));
	}

	// J9Pool* _currentIteratePool
	public PointerPointer _currentIteratePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__currentIteratePoolOffset_));
	}

	// J9PoolPuddle* _currentPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentPuddleOffset_", declaredType="J9PoolPuddle*")
	public J9PoolPuddlePointer _currentPuddle() throws CorruptDataException {
		return J9PoolPuddlePointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__currentPuddleOffset_));
	}

	// J9PoolPuddle* _currentPuddle
	public PointerPointer _currentPuddleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__currentPuddleOffset_));
	}

	// J9HashTable* _hashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer _hashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__hashTableOffset_));
	}

	// J9HashTable* _hashTable
	public PointerPointer _hashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__hashTableOffset_));
	}

	// IterateState _iterateState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__iterateStateOffset_", declaredType="IterateState")
	public long _iterateState() throws CorruptDataException {
		if (GC_StringTableIncrementalIterator$IterateState.SIZEOF == 1) {
			return getByteAtOffset(GC_StringTableIncrementalIterator.__iterateStateOffset_);
		} else if (GC_StringTableIncrementalIterator$IterateState.SIZEOF == 2) {
			return getShortAtOffset(GC_StringTableIncrementalIterator.__iterateStateOffset_);
		} else if (GC_StringTableIncrementalIterator$IterateState.SIZEOF == 4) {
			return getIntAtOffset(GC_StringTableIncrementalIterator.__iterateStateOffset_);
		} else if (GC_StringTableIncrementalIterator$IterateState.SIZEOF == 8) {
			return getLongAtOffset(GC_StringTableIncrementalIterator.__iterateStateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// IterateState _iterateState
	public EnumPointer _iterateStateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__iterateStateOffset_), GC_StringTableIncrementalIterator$IterateState.class);
	}

	// void* _lastNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastNodeOffset_", declaredType="void*")
	public VoidPointer _lastNode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__lastNodeOffset_));
	}

	// void* _lastNode
	public PointerPointer _lastNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__lastNodeOffset_));
	}

	// void** _lastSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastSlotOffset_", declaredType="void**")
	public PointerPointer _lastSlot() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__lastSlotOffset_));
	}

	// void** _lastSlot
	public PointerPointer _lastSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__lastSlotOffset_));
	}

	// void* _nextNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextNodeOffset_", declaredType="void*")
	public VoidPointer _nextNode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__nextNodeOffset_));
	}

	// void* _nextNode
	public PointerPointer _nextNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__nextNodeOffset_));
	}

	// J9PoolPuddle* _nextPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextPuddleOffset_", declaredType="J9PoolPuddle*")
	public J9PoolPuddlePointer _nextPuddle() throws CorruptDataException {
		return J9PoolPuddlePointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__nextPuddleOffset_));
	}

	// J9PoolPuddle* _nextPuddle
	public PointerPointer _nextPuddleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__nextPuddleOffset_));
	}

	// J9PoolState _poolState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__poolStateOffset_", declaredType="J9PoolState")
	public J9PoolStatePointer _poolState() throws CorruptDataException {
		return J9PoolStatePointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__poolStateOffset_));
	}

	// J9PoolState _poolState
	public PointerPointer _poolStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__poolStateOffset_));
	}

	// J9Pool* _stringTableTreeNodePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stringTableTreeNodePoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer _stringTableTreeNodePool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(GC_StringTableIncrementalIterator.__stringTableTreeNodePoolOffset_));
	}

	// J9Pool* _stringTableTreeNodePool
	public PointerPointer _stringTableTreeNodePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_StringTableIncrementalIterator.__stringTableTreeNodePoolOffset_));
	}

}
