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
 * Structure: MM_HeapRegionDataForCompactVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_HeapRegionDataForCompactVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapRegionDataForCompactVLHGC.class)
public class MM_HeapRegionDataForCompactVLHGCPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_HeapRegionDataForCompactVLHGCPointer NULL = new MM_HeapRegionDataForCompactVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapRegionDataForCompactVLHGCPointer(long address) {
		super(address);
	}

	public static MM_HeapRegionDataForCompactVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapRegionDataForCompactVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapRegionDataForCompactVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapRegionDataForCompactVLHGCPointer(address);
	}

	public MM_HeapRegionDataForCompactVLHGCPointer add(long count) {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(address + (MM_HeapRegionDataForCompactVLHGC.SIZEOF * count));
	}

	public MM_HeapRegionDataForCompactVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapRegionDataForCompactVLHGCPointer addOffset(long offset) {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(address + offset);
	}

	public MM_HeapRegionDataForCompactVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapRegionDataForCompactVLHGCPointer sub(long count) {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(address - (MM_HeapRegionDataForCompactVLHGC.SIZEOF * count));
	}

	public MM_HeapRegionDataForCompactVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapRegionDataForCompactVLHGCPointer subOffset(long offset) {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(address - offset);
	}

	public MM_HeapRegionDataForCompactVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapRegionDataForCompactVLHGCPointer untag(long mask) {
		return MM_HeapRegionDataForCompactVLHGCPointer.cast(address & ~mask);
	}

	public MM_HeapRegionDataForCompactVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapRegionDataForCompactVLHGC.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptorVLHGC* _blockedList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__blockedListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _blockedList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__blockedListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _blockedList
	public PointerPointer _blockedListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__blockedListOffset_));
	}

	// volatile void* _compactDestination
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactDestinationOffset_", declaredType="volatile void*")
	public VoidPointer _compactDestination() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__compactDestinationOffset_));
	}

	// volatile void* _compactDestination
	public PointerPointer _compactDestinationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__compactDestinationOffset_));
	}

	// double _compactScore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactScoreOffset_", declaredType="double")
	public double _compactScore() throws CorruptDataException {
		return getDoubleAtOffset(MM_HeapRegionDataForCompactVLHGC.__compactScoreOffset_);
	}

	// double _compactScore
	public DoublePointer _compactScoreEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__compactScoreOffset_));
	}

	// bool _isCompactDestination
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isCompactDestinationOffset_", declaredType="bool")
	public boolean _isCompactDestination() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDataForCompactVLHGC.__isCompactDestinationOffset_);
	}

	// bool _isCompactDestination
	public BoolPointer _isCompactDestinationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__isCompactDestinationOffset_));
	}

	// volatile void* _nextEvacuationCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextEvacuationCandidateOffset_", declaredType="volatile void*")
	public VoidPointer _nextEvacuationCandidate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__nextEvacuationCandidateOffset_));
	}

	// volatile void* _nextEvacuationCandidate
	public PointerPointer _nextEvacuationCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__nextEvacuationCandidateOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextInWorkList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextInWorkListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _nextInWorkList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__nextInWorkListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _nextInWorkList
	public PointerPointer _nextInWorkListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__nextInWorkListOffset_));
	}

	// void* _nextMoveEventCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextMoveEventCandidateOffset_", declaredType="void*")
	public VoidPointer _nextMoveEventCandidate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__nextMoveEventCandidateOffset_));
	}

	// void* _nextMoveEventCandidate
	public PointerPointer _nextMoveEventCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__nextMoveEventCandidateOffset_));
	}

	// volatile void* _nextRebuildCandidate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextRebuildCandidateOffset_", declaredType="volatile void*")
	public VoidPointer _nextRebuildCandidate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__nextRebuildCandidateOffset_));
	}

	// volatile void* _nextRebuildCandidate
	public PointerPointer _nextRebuildCandidateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__nextRebuildCandidateOffset_));
	}

	// MM_AllocationContextTarok* _previousContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousContextOffset_", declaredType="MM_AllocationContextTarok*")
	public MM_AllocationContextTarokPointer _previousContext() throws CorruptDataException {
		return MM_AllocationContextTarokPointer.cast(getPointerAtOffset(MM_HeapRegionDataForCompactVLHGC.__previousContextOffset_));
	}

	// MM_AllocationContextTarok* _previousContext
	public PointerPointer _previousContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__previousContextOffset_));
	}

	// double _projectedLiveBytesRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedLiveBytesRatioOffset_", declaredType="double")
	public double _projectedLiveBytesRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_HeapRegionDataForCompactVLHGC.__projectedLiveBytesRatioOffset_);
	}

	// double _projectedLiveBytesRatio
	public DoublePointer _projectedLiveBytesRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__projectedLiveBytesRatioOffset_));
	}

	// bool _shouldCompact
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldCompactOffset_", declaredType="bool")
	public boolean _shouldCompact() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDataForCompactVLHGC.__shouldCompactOffset_);
	}

	// bool _shouldCompact
	public BoolPointer _shouldCompactEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__shouldCompactOffset_));
	}

	// bool _shouldFixup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldFixupOffset_", declaredType="bool")
	public boolean _shouldFixup() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapRegionDataForCompactVLHGC.__shouldFixupOffset_);
	}

	// bool _shouldFixup
	public BoolPointer _shouldFixupEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__shouldFixupOffset_));
	}

	// UDATA _vineDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vineDepthOffset_", declaredType="UDATA")
	public UDATA _vineDepth() throws CorruptDataException {
		return getUDATAAtOffset(MM_HeapRegionDataForCompactVLHGC.__vineDepthOffset_);
	}

	// UDATA _vineDepth
	public UDATAPointer _vineDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapRegionDataForCompactVLHGC.__vineDepthOffset_));
	}

}
