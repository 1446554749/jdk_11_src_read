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
 * Structure: MM_CopyScanCacheListPointer
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
 * The generated code will provide getters for all elements in the MM_CopyScanCacheListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyScanCacheList.class)
public class MM_CopyScanCacheListPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_CopyScanCacheListPointer NULL = new MM_CopyScanCacheListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyScanCacheListPointer(long address) {
		super(address);
	}

	public static MM_CopyScanCacheListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyScanCacheListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyScanCacheListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyScanCacheListPointer(address);
	}

	public MM_CopyScanCacheListPointer add(long count) {
		return MM_CopyScanCacheListPointer.cast(address + (MM_CopyScanCacheList.SIZEOF * count));
	}

	public MM_CopyScanCacheListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyScanCacheListPointer addOffset(long offset) {
		return MM_CopyScanCacheListPointer.cast(address + offset);
	}

	public MM_CopyScanCacheListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyScanCacheListPointer sub(long count) {
		return MM_CopyScanCacheListPointer.cast(address - (MM_CopyScanCacheList.SIZEOF * count));
	}

	public MM_CopyScanCacheListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyScanCacheListPointer subOffset(long offset) {
		return MM_CopyScanCacheListPointer.cast(address - offset);
	}

	public MM_CopyScanCacheListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyScanCacheListPointer untag(long mask) {
		return MM_CopyScanCacheListPointer.cast(address & ~mask);
	}

	public MM_CopyScanCacheListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyScanCacheList.SIZEOF;
	}

	// Implementation methods

	// bool _allocationInHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationInHeapOffset_", declaredType="bool")
	public boolean _allocationInHeap() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyScanCacheList.__allocationInHeapOffset_);
	}

	// bool _allocationInHeap
	public BoolPointer _allocationInHeapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__allocationInHeapOffset_));
	}

	// volatile U64* _cachedEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedEntryCountOffset_", declaredType="volatile U64*")
	public UDATAPointer _cachedEntryCount() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_CopyScanCacheList.__cachedEntryCountOffset_));
	}

	// volatile U64* _cachedEntryCount
	public PointerPointer _cachedEntryCountEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__cachedEntryCountOffset_));
	}

	// MM_CopyScanCacheChunk* _chunkHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkHeadOffset_", declaredType="MM_CopyScanCacheChunk*")
	public MM_CopyScanCacheChunkPointer _chunkHead() throws CorruptDataException {
		return MM_CopyScanCacheChunkPointer.cast(getPointerAtOffset(MM_CopyScanCacheList.__chunkHeadOffset_));
	}

	// MM_CopyScanCacheChunk* _chunkHead
	public PointerPointer _chunkHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__chunkHeadOffset_));
	}

	// U64 _incrementEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementEntryCountOffset_", declaredType="U64")
	public UDATA _incrementEntryCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCacheList.__incrementEntryCountOffset_));
	}

	// U64 _incrementEntryCount
	public UDATAPointer _incrementEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__incrementEntryCountOffset_));
	}

	// U64 _sublistCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistCountOffset_", declaredType="U64")
	public UDATA _sublistCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCacheList.__sublistCountOffset_));
	}

	// U64 _sublistCount
	public UDATAPointer _sublistCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__sublistCountOffset_));
	}

	// MM_CopyScanCacheList$CopyScanCacheSublist* _sublists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistsOffset_", declaredType="MM_CopyScanCacheList$CopyScanCacheSublist*")
	public MM_CopyScanCacheList$CopyScanCacheSublistPointer _sublists() throws CorruptDataException {
		return MM_CopyScanCacheList$CopyScanCacheSublistPointer.cast(getPointerAtOffset(MM_CopyScanCacheList.__sublistsOffset_));
	}

	// MM_CopyScanCacheList$CopyScanCacheSublist* _sublists
	public PointerPointer _sublistsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__sublistsOffset_));
	}

	// U64 _totalAllocatedEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalAllocatedEntryCountOffset_", declaredType="U64")
	public UDATA _totalAllocatedEntryCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCacheList.__totalAllocatedEntryCountOffset_));
	}

	// U64 _totalAllocatedEntryCount
	public UDATAPointer _totalAllocatedEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheList.__totalAllocatedEntryCountOffset_));
	}

}
