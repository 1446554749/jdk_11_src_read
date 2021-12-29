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
 * Structure: MM_VerboseEventMetronomeSynchronousGCEndPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventMetronomeSynchronousGCEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventMetronomeSynchronousGCEnd.class)
public class MM_VerboseEventMetronomeSynchronousGCEndPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventMetronomeSynchronousGCEndPointer NULL = new MM_VerboseEventMetronomeSynchronousGCEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventMetronomeSynchronousGCEndPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventMetronomeSynchronousGCEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventMetronomeSynchronousGCEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventMetronomeSynchronousGCEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventMetronomeSynchronousGCEndPointer(address);
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer add(long count) {
		return MM_VerboseEventMetronomeSynchronousGCEndPointer.cast(address + (MM_VerboseEventMetronomeSynchronousGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer addOffset(long offset) {
		return MM_VerboseEventMetronomeSynchronousGCEndPointer.cast(address + offset);
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer sub(long count) {
		return MM_VerboseEventMetronomeSynchronousGCEndPointer.cast(address - (MM_VerboseEventMetronomeSynchronousGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer subOffset(long offset) {
		return MM_VerboseEventMetronomeSynchronousGCEndPointer.cast(address - offset);
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer untag(long mask) {
		return MM_VerboseEventMetronomeSynchronousGCEndPointer.cast(address & ~mask);
	}

	public MM_VerboseEventMetronomeSynchronousGCEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventMetronomeSynchronousGCEnd.SIZEOF;
	}

	// Implementation methods

	// UDATA _classLoadersUnloadedEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedEndOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloadedEnd() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__classLoadersUnloadedEndOffset_);
	}

	// UDATA _classLoadersUnloadedEnd
	public UDATAPointer _classLoadersUnloadedEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__classLoadersUnloadedEndOffset_));
	}

	// UDATA _classLoadersUnloadedStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedStartOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloadedStart() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__classLoadersUnloadedStartOffset_);
	}

	// UDATA _classLoadersUnloadedStart
	public UDATAPointer _classLoadersUnloadedStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__classLoadersUnloadedStartOffset_));
	}

	// UDATA _classesUnloadedEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedEndOffset_", declaredType="UDATA")
	public UDATA _classesUnloadedEnd() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__classesUnloadedEndOffset_);
	}

	// UDATA _classesUnloadedEnd
	public UDATAPointer _classesUnloadedEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__classesUnloadedEndOffset_));
	}

	// UDATA _classesUnloadedStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedStartOffset_", declaredType="UDATA")
	public UDATA _classesUnloadedStart() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__classesUnloadedStartOffset_);
	}

	// UDATA _classesUnloadedStart
	public UDATAPointer _classesUnloadedStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__classesUnloadedStartOffset_));
	}

	// UDATA _dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSoftReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _dynamicSoftReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__dynamicSoftReferenceThresholdOffset_);
	}

	// UDATA _dynamicSoftReferenceThreshold
	public UDATAPointer _dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__dynamicSoftReferenceThresholdOffset_));
	}

	// UDATA _finalizableCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizableCountOffset_", declaredType="UDATA")
	public UDATA _finalizableCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__finalizableCountOffset_);
	}

	// UDATA _finalizableCount
	public UDATAPointer _finalizableCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__finalizableCountOffset_));
	}

	// UDATA _gcThreadPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcThreadPriorityOffset_", declaredType="UDATA")
	public UDATA _gcThreadPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__gcThreadPriorityOffset_);
	}

	// UDATA _gcThreadPriority
	public UDATAPointer _gcThreadPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__gcThreadPriorityOffset_));
	}

	// UDATA _heapFreeAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeAfterOffset_", declaredType="UDATA")
	public UDATA _heapFreeAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__heapFreeAfterOffset_);
	}

	// UDATA _heapFreeAfter
	public UDATAPointer _heapFreeAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__heapFreeAfterOffset_));
	}

	// UDATA _heapFreeBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapFreeBeforeOffset_", declaredType="UDATA")
	public UDATA _heapFreeBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__heapFreeBeforeOffset_);
	}

	// UDATA _heapFreeBefore
	public UDATAPointer _heapFreeBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__heapFreeBeforeOffset_));
	}

	// UDATA _objectOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectOverflowCountOffset_", declaredType="UDATA")
	public UDATA _objectOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__objectOverflowCountOffset_);
	}

	// UDATA _objectOverflowCount
	public UDATAPointer _objectOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__objectOverflowCountOffset_));
	}

	// UDATA _phantomReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__phantomReferenceClearCountOffset_);
	}

	// UDATA _phantomReferenceClearCount
	public UDATAPointer _phantomReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__phantomReferenceClearCountOffset_));
	}

	// GCReason _reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reasonOffset_", declaredType="GCReason")
	public long _reason() throws CorruptDataException {
		if (GCReason.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonOffset_);
		} else if (GCReason.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonOffset_);
		} else if (GCReason.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonOffset_);
		} else if (GCReason.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GCReason _reason
	public EnumPointer _reasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonOffset_), GCReason.class);
	}

	// UDATA _reasonParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reasonParameterOffset_", declaredType="UDATA")
	public UDATA _reasonParameter() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonParameterOffset_);
	}

	// UDATA _reasonParameter
	public UDATAPointer _reasonParameterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__reasonParameterOffset_));
	}

	// UDATA _softReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__softReferenceClearCountOffset_);
	}

	// UDATA _softReferenceClearCount
	public UDATAPointer _softReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__softReferenceClearCountOffset_));
	}

	// UDATA _softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _softReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__softReferenceThresholdOffset_);
	}

	// UDATA _softReferenceThreshold
	public UDATAPointer _softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__softReferenceThresholdOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__startTimeOffset_));
	}

	// U8[] _timestamp
	public U8Pointer _timestampEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__timestampOffset_));
	}

	// UDATA _weakReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__weakReferenceClearCountOffset_);
	}

	// UDATA _weakReferenceClearCount
	public UDATAPointer _weakReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__weakReferenceClearCountOffset_));
	}

	// UDATA _workPacketOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketOverflowCountOffset_", declaredType="UDATA")
	public UDATA _workPacketOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventMetronomeSynchronousGCEnd.__workPacketOverflowCountOffset_);
	}

	// UDATA _workPacketOverflowCount
	public UDATAPointer _workPacketOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventMetronomeSynchronousGCEnd.__workPacketOverflowCountOffset_));
	}

}
