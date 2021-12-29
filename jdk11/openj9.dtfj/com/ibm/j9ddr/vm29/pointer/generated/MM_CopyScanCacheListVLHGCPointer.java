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
 * Structure: MM_CopyScanCacheListVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_CopyScanCacheListVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyScanCacheListVLHGC.class)
public class MM_CopyScanCacheListVLHGCPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_CopyScanCacheListVLHGCPointer NULL = new MM_CopyScanCacheListVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyScanCacheListVLHGCPointer(long address) {
		super(address);
	}

	public static MM_CopyScanCacheListVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyScanCacheListVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyScanCacheListVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyScanCacheListVLHGCPointer(address);
	}

	public MM_CopyScanCacheListVLHGCPointer add(long count) {
		return MM_CopyScanCacheListVLHGCPointer.cast(address + (MM_CopyScanCacheListVLHGC.SIZEOF * count));
	}

	public MM_CopyScanCacheListVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyScanCacheListVLHGCPointer addOffset(long offset) {
		return MM_CopyScanCacheListVLHGCPointer.cast(address + offset);
	}

	public MM_CopyScanCacheListVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyScanCacheListVLHGCPointer sub(long count) {
		return MM_CopyScanCacheListVLHGCPointer.cast(address - (MM_CopyScanCacheListVLHGC.SIZEOF * count));
	}

	public MM_CopyScanCacheListVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyScanCacheListVLHGCPointer subOffset(long offset) {
		return MM_CopyScanCacheListVLHGCPointer.cast(address - offset);
	}

	public MM_CopyScanCacheListVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyScanCacheListVLHGCPointer untag(long mask) {
		return MM_CopyScanCacheListVLHGCPointer.cast(address & ~mask);
	}

	public MM_CopyScanCacheListVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyScanCacheListVLHGC.SIZEOF;
	}

	// Implementation methods

	// MM_CopyScanCacheChunkVLHGC* _chunkHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkHeadOffset_", declaredType="MM_CopyScanCacheChunkVLHGC*")
	public MM_CopyScanCacheChunkVLHGCPointer _chunkHead() throws CorruptDataException {
		return MM_CopyScanCacheChunkVLHGCPointer.cast(getPointerAtOffset(MM_CopyScanCacheListVLHGC.__chunkHeadOffset_));
	}

	// MM_CopyScanCacheChunkVLHGC* _chunkHead
	public PointerPointer _chunkHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheListVLHGC.__chunkHeadOffset_));
	}

	// bool _containsHeapAllocatedChunks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__containsHeapAllocatedChunksOffset_", declaredType="bool")
	public boolean _containsHeapAllocatedChunks() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyScanCacheListVLHGC.__containsHeapAllocatedChunksOffset_);
	}

	// bool _containsHeapAllocatedChunks
	public BoolPointer _containsHeapAllocatedChunksEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyScanCacheListVLHGC.__containsHeapAllocatedChunksOffset_));
	}

	// UDATA _sublistCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistCountOffset_", declaredType="UDATA")
	public UDATA _sublistCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyScanCacheListVLHGC.__sublistCountOffset_);
	}

	// UDATA _sublistCount
	public UDATAPointer _sublistCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheListVLHGC.__sublistCountOffset_));
	}

	// MM_CopyScanCacheListVLHGC$CopyScanCacheSublist* _sublists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistsOffset_", declaredType="MM_CopyScanCacheListVLHGC$CopyScanCacheSublist*")
	public MM_CopyScanCacheListVLHGC$CopyScanCacheSublistPointer _sublists() throws CorruptDataException {
		return MM_CopyScanCacheListVLHGC$CopyScanCacheSublistPointer.cast(getPointerAtOffset(MM_CopyScanCacheListVLHGC.__sublistsOffset_));
	}

	// MM_CopyScanCacheListVLHGC$CopyScanCacheSublist* _sublists
	public PointerPointer _sublistsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheListVLHGC.__sublistsOffset_));
	}

	// UDATA _totalEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalEntryCountOffset_", declaredType="UDATA")
	public UDATA _totalEntryCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyScanCacheListVLHGC.__totalEntryCountOffset_);
	}

	// UDATA _totalEntryCount
	public UDATAPointer _totalEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheListVLHGC.__totalEntryCountOffset_));
	}

}
