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
 * Structure: MM_ReferenceChainWalkerPointer
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
 * The generated code will provide getters for all elements in the MM_ReferenceChainWalkerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ReferenceChainWalker.class)
public class MM_ReferenceChainWalkerPointer extends MM_RootScannerPointer {

	// NULL
	public static final MM_ReferenceChainWalkerPointer NULL = new MM_ReferenceChainWalkerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ReferenceChainWalkerPointer(long address) {
		super(address);
	}

	public static MM_ReferenceChainWalkerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ReferenceChainWalkerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ReferenceChainWalkerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ReferenceChainWalkerPointer(address);
	}

	public MM_ReferenceChainWalkerPointer add(long count) {
		return MM_ReferenceChainWalkerPointer.cast(address + (MM_ReferenceChainWalker.SIZEOF * count));
	}

	public MM_ReferenceChainWalkerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ReferenceChainWalkerPointer addOffset(long offset) {
		return MM_ReferenceChainWalkerPointer.cast(address + offset);
	}

	public MM_ReferenceChainWalkerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ReferenceChainWalkerPointer sub(long count) {
		return MM_ReferenceChainWalkerPointer.cast(address - (MM_ReferenceChainWalker.SIZEOF * count));
	}

	public MM_ReferenceChainWalkerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ReferenceChainWalkerPointer subOffset(long offset) {
		return MM_ReferenceChainWalkerPointer.cast(address - offset);
	}

	public MM_ReferenceChainWalkerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ReferenceChainWalkerPointer untag(long mask) {
		return MM_ReferenceChainWalkerPointer.cast(address & ~mask);
	}

	public MM_ReferenceChainWalkerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ReferenceChainWalker.SIZEOF;
	}

	// Implementation methods

	// bool _hasOverflowed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasOverflowedOffset_", declaredType="bool")
	public boolean _hasOverflowed() throws CorruptDataException {
		return getBoolAtOffset(MM_ReferenceChainWalker.__hasOverflowedOffset_);
	}

	// bool _hasOverflowed
	public BoolPointer _hasOverflowedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__hasOverflowedOffset_));
	}

	// MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__heapOffset_));
	}

	// MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__heapOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__heapBaseOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__heapTopOffset_));
	}

	// bool _isProcessingOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isProcessingOverflowOffset_", declaredType="bool")
	public boolean _isProcessingOverflow() throws CorruptDataException {
		return getBoolAtOffset(MM_ReferenceChainWalker.__isProcessingOverflowOffset_);
	}

	// bool _isProcessingOverflow
	public BoolPointer _isProcessingOverflowEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__isProcessingOverflowOffset_));
	}

	// bool _isTerminating
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isTerminatingOffset_", declaredType="bool")
	public boolean _isTerminating() throws CorruptDataException {
		return getBoolAtOffset(MM_ReferenceChainWalker.__isTerminatingOffset_);
	}

	// bool _isTerminating
	public BoolPointer _isTerminatingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__isTerminatingOffset_));
	}

	// MM_ReferenceChainWalkerMarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_ReferenceChainWalkerMarkMap*")
	public MM_ReferenceChainWalkerMarkMapPointer _markMap() throws CorruptDataException {
		return MM_ReferenceChainWalkerMarkMapPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__markMapOffset_));
	}

	// MM_ReferenceChainWalkerMarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__markMapOffset_));
	}

	// void** _queue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__queueOffset_", declaredType="void**")
	public PointerPointer _queue() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__queueOffset_));
	}

	// void** _queue
	public PointerPointer _queueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__queueOffset_));
	}

	// void** _queueCurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__queueCurrentOffset_", declaredType="void**")
	public PointerPointer _queueCurrent() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__queueCurrentOffset_));
	}

	// void** _queueCurrent
	public PointerPointer _queueCurrentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__queueCurrentOffset_));
	}

	// void** _queueEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__queueEndOffset_", declaredType="void**")
	public PointerPointer _queueEnd() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__queueEndOffset_));
	}

	// void** _queueEnd
	public PointerPointer _queueEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__queueEndOffset_));
	}

	// UDATA _queueSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__queueSlotsOffset_", declaredType="UDATA")
	public UDATA _queueSlots() throws CorruptDataException {
		return getUDATAAtOffset(MM_ReferenceChainWalker.__queueSlotsOffset_);
	}

	// UDATA _queueSlots
	public UDATAPointer _queueSlotsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__queueSlotsOffset_));
	}

	// bool _shouldPreindexInterfaceFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldPreindexInterfaceFieldsOffset_", declaredType="bool")
	public boolean _shouldPreindexInterfaceFields() throws CorruptDataException {
		return getBoolAtOffset(MM_ReferenceChainWalker.__shouldPreindexInterfaceFieldsOffset_);
	}

	// bool _shouldPreindexInterfaceFields
	public BoolPointer _shouldPreindexInterfaceFieldsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__shouldPreindexInterfaceFieldsOffset_));
	}

	// J9MODRON_REFERENCE_CHAIN_WALKER_CALLBACK* _userCallback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__userCallbackOffset_", declaredType="J9MODRON_REFERENCE_CHAIN_WALKER_CALLBACK*")
	public VoidPointer _userCallback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__userCallbackOffset_));
	}

	// J9MODRON_REFERENCE_CHAIN_WALKER_CALLBACK* _userCallback
	public PointerPointer _userCallbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__userCallbackOffset_));
	}

	// void* _userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__userDataOffset_", declaredType="void*")
	public VoidPointer _userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ReferenceChainWalker.__userDataOffset_));
	}

	// void* _userData
	public PointerPointer _userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ReferenceChainWalker.__userDataOffset_));
	}

}
