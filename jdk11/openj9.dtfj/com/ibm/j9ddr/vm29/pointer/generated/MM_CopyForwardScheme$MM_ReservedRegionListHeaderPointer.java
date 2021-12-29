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
 * Structure: MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer
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
 * The generated code will provide getters for all elements in the MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyForwardScheme$MM_ReservedRegionListHeader.class)
public class MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer extends StructurePointer {

	// NULL
	public static final MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer NULL = new MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer(long address) {
		super(address);
	}

	public static MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer(address);
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer add(long count) {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(address + (MM_CopyForwardScheme$MM_ReservedRegionListHeader.SIZEOF * count));
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer addOffset(long offset) {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(address + offset);
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer sub(long count) {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(address - (MM_CopyForwardScheme$MM_ReservedRegionListHeader.SIZEOF * count));
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer subOffset(long offset) {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(address - offset);
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer untag(long mask) {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer.cast(address & ~mask);
	}

	public MM_CopyForwardScheme$MM_ReservedRegionListHeaderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeader.SIZEOF;
	}

	// Implementation methods

	// UDATA _evacuateRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__evacuateRegionCountOffset_", declaredType="UDATA")
	public UDATA _evacuateRegionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__evacuateRegionCountOffset_);
	}

	// UDATA _evacuateRegionCount
	public UDATAPointer _evacuateRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__evacuateRegionCountOffset_));
	}

	// UDATA _maxSublistCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxSublistCountOffset_", declaredType="UDATA")
	public UDATA _maxSublistCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__maxSublistCountOffset_);
	}

	// UDATA _maxSublistCount
	public UDATAPointer _maxSublistCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__maxSublistCountOffset_));
	}

	// volatile UDATA _sublistCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistCountOffset_", declaredType="volatile UDATA")
	public UDATA _sublistCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__sublistCountOffset_);
	}

	// volatile UDATA _sublistCount
	public UDATAPointer _sublistCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__sublistCountOffset_));
	}

	// MM_CopyForwardScheme$MM_ReservedRegionListHeader$Sublist[] _sublists
	public MM_CopyForwardScheme$MM_ReservedRegionListHeader$SublistPointer _sublistsEA() throws CorruptDataException {
		return MM_CopyForwardScheme$MM_ReservedRegionListHeader$SublistPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__sublistsOffset_));
	}

	// UDATA _tailCandidateCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailCandidateCountOffset_", declaredType="UDATA")
	public UDATA _tailCandidateCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidateCountOffset_);
	}

	// UDATA _tailCandidateCount
	public UDATAPointer _tailCandidateCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidateCountOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _tailCandidates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailCandidatesOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _tailCandidates() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidatesOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _tailCandidates
	public PointerPointer _tailCandidatesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidatesOffset_));
	}

	// MM_LightweightNonReentrantLock _tailCandidatesLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailCandidatesLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _tailCandidatesLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidatesLockOffset_));
	}

	// MM_LightweightNonReentrantLock _tailCandidatesLock
	public PointerPointer _tailCandidatesLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyForwardScheme$MM_ReservedRegionListHeader.__tailCandidatesLockOffset_));
	}

}
