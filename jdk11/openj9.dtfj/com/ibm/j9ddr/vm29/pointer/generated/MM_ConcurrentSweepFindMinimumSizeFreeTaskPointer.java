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
 * Structure: MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentSweepFindMinimumSizeFreeTask.class)
public class MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer extends MM_ParallelSweepTaskPointer {

	// NULL
	public static final MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer NULL = new MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer(address);
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer add(long count) {
		return MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer.cast(address + (MM_ConcurrentSweepFindMinimumSizeFreeTask.SIZEOF * count));
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer addOffset(long offset) {
		return MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer.cast(address + offset);
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer sub(long count) {
		return MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer.cast(address - (MM_ConcurrentSweepFindMinimumSizeFreeTask.SIZEOF * count));
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer subOffset(long offset) {
		return MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer.cast(address - offset);
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer untag(long mask) {
		return MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer.cast(address & ~mask);
	}

	public MM_ConcurrentSweepFindMinimumSizeFreeTaskPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentSweepFindMinimumSizeFreeTask.SIZEOF;
	}

	// Implementation methods

	// volatile bool _foundLiveObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__foundLiveObjectOffset_", declaredType="volatile bool")
	public boolean _foundLiveObject() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentSweepFindMinimumSizeFreeTask.__foundLiveObjectOffset_);
	}

	// volatile bool _foundLiveObject
	public BoolPointer _foundLiveObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentSweepFindMinimumSizeFreeTask.__foundLiveObjectOffset_));
	}

	// volatile bool _foundMinimumSizeFreeEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__foundMinimumSizeFreeEntryOffset_", declaredType="volatile bool")
	public boolean _foundMinimumSizeFreeEntry() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentSweepFindMinimumSizeFreeTask.__foundMinimumSizeFreeEntryOffset_);
	}

	// volatile bool _foundMinimumSizeFreeEntry
	public BoolPointer _foundMinimumSizeFreeEntryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentSweepFindMinimumSizeFreeTask.__foundMinimumSizeFreeEntryOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_ConcurrentSweepFindMinimumSizeFreeTask.__memorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	public PointerPointer _memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepFindMinimumSizeFreeTask.__memorySubSpaceOffset_));
	}

	// UDATA _minimumFreeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumFreeSizeOffset_", declaredType="UDATA")
	public UDATA _minimumFreeSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepFindMinimumSizeFreeTask.__minimumFreeSizeOffset_);
	}

	// UDATA _minimumFreeSize
	public UDATAPointer _minimumFreeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepFindMinimumSizeFreeTask.__minimumFreeSizeOffset_));
	}

}
