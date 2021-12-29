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
 * Structure: MM_VerboseEventGlobalGCEndPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventGlobalGCEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventGlobalGCEnd.class)
public class MM_VerboseEventGlobalGCEndPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventGlobalGCEndPointer NULL = new MM_VerboseEventGlobalGCEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventGlobalGCEndPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventGlobalGCEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventGlobalGCEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventGlobalGCEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventGlobalGCEndPointer(address);
	}

	public MM_VerboseEventGlobalGCEndPointer add(long count) {
		return MM_VerboseEventGlobalGCEndPointer.cast(address + (MM_VerboseEventGlobalGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventGlobalGCEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventGlobalGCEndPointer addOffset(long offset) {
		return MM_VerboseEventGlobalGCEndPointer.cast(address + offset);
	}

	public MM_VerboseEventGlobalGCEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventGlobalGCEndPointer sub(long count) {
		return MM_VerboseEventGlobalGCEndPointer.cast(address - (MM_VerboseEventGlobalGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventGlobalGCEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventGlobalGCEndPointer subOffset(long offset) {
		return MM_VerboseEventGlobalGCEndPointer.cast(address - offset);
	}

	public MM_VerboseEventGlobalGCEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventGlobalGCEndPointer untag(long mask) {
		return MM_VerboseEventGlobalGCEndPointer.cast(address & ~mask);
	}

	public MM_VerboseEventGlobalGCEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventGlobalGCEnd.SIZEOF;
	}

	// Implementation methods

	// U64 _compactEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactEndTimeOffset_", declaredType="U64")
	public UDATA _compactEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__compactEndTimeOffset_));
	}

	// U64 _compactEndTime
	public UDATAPointer _compactEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__compactEndTimeOffset_));
	}

	// U64 _compactStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactStartTimeOffset_", declaredType="U64")
	public UDATA _compactStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__compactStartTimeOffset_));
	}

	// U64 _compactStartTime
	public UDATAPointer _compactStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__compactStartTimeOffset_));
	}

	// UDATA _dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSoftReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _dynamicSoftReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__dynamicSoftReferenceThresholdOffset_);
	}

	// UDATA _dynamicSoftReferenceThreshold
	public UDATAPointer _dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__dynamicSoftReferenceThresholdOffset_));
	}

	// UDATA _finalizerCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizerCountOffset_", declaredType="UDATA")
	public UDATA _finalizerCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__finalizerCountOffset_);
	}

	// UDATA _finalizerCount
	public UDATAPointer _finalizerCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__finalizerCountOffset_));
	}

	// UDATA _fixHeapForWalkReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixHeapForWalkReasonOffset_", declaredType="UDATA")
	public UDATA _fixHeapForWalkReason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__fixHeapForWalkReasonOffset_);
	}

	// UDATA _fixHeapForWalkReason
	public UDATAPointer _fixHeapForWalkReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__fixHeapForWalkReasonOffset_));
	}

	// U64 _fixHeapForWalkTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixHeapForWalkTimeOffset_", declaredType="U64")
	public UDATA _fixHeapForWalkTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__fixHeapForWalkTimeOffset_));
	}

	// U64 _fixHeapForWalkTime
	public UDATAPointer _fixHeapForWalkTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__fixHeapForWalkTimeOffset_));
	}

	// U64 _globalGCStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalGCStartTimeOffset_", declaredType="U64")
	public UDATA _globalGCStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__globalGCStartTimeOffset_));
	}

	// U64 _globalGCStartTime
	public UDATAPointer _globalGCStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__globalGCStartTimeOffset_));
	}

	// UDATA _loaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaEnabledOffset_", declaredType="UDATA")
	public UDATA _loaEnabled() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__loaEnabledOffset_);
	}

	// UDATA _loaEnabled
	public UDATAPointer _loaEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__loaEnabledOffset_));
	}

	// U64 _markEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markEndTimeOffset_", declaredType="U64")
	public UDATA _markEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__markEndTimeOffset_));
	}

	// U64 _markEndTime
	public UDATAPointer _markEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__markEndTimeOffset_));
	}

	// U64 _markStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStartTimeOffset_", declaredType="U64")
	public UDATA _markStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__markStartTimeOffset_));
	}

	// U64 _markStartTime
	public UDATAPointer _markStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__markStartTimeOffset_));
	}

	// UDATA _nurseryFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryFreeBytesOffset_", declaredType="UDATA")
	public UDATA _nurseryFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__nurseryFreeBytesOffset_);
	}

	// UDATA _nurseryFreeBytes
	public UDATAPointer _nurseryFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__nurseryFreeBytesOffset_));
	}

	// UDATA _nurseryTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryTotalBytesOffset_", declaredType="UDATA")
	public UDATA _nurseryTotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__nurseryTotalBytesOffset_);
	}

	// UDATA _nurseryTotalBytes
	public UDATAPointer _nurseryTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__nurseryTotalBytesOffset_));
	}

	// UDATA _phantomReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__phantomReferenceClearCountOffset_);
	}

	// UDATA _phantomReferenceClearCount
	public UDATAPointer _phantomReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__phantomReferenceClearCountOffset_));
	}

	// UDATA _softReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__softReferenceClearCountOffset_);
	}

	// UDATA _softReferenceClearCount
	public UDATAPointer _softReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__softReferenceClearCountOffset_));
	}

	// UDATA _softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _softReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__softReferenceThresholdOffset_);
	}

	// UDATA _softReferenceThreshold
	public UDATAPointer _softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__softReferenceThresholdOffset_));
	}

	// U64 _sweepEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepEndTimeOffset_", declaredType="U64")
	public UDATA _sweepEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__sweepEndTimeOffset_));
	}

	// U64 _sweepEndTime
	public UDATAPointer _sweepEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__sweepEndTimeOffset_));
	}

	// U64 _sweepStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepStartTimeOffset_", declaredType="U64")
	public UDATA _sweepStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventGlobalGCEnd.__sweepStartTimeOffset_));
	}

	// U64 _sweepStartTime
	public UDATAPointer _sweepStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__sweepStartTimeOffset_));
	}

	// UDATA _tenureFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureFreeBytesOffset_", declaredType="UDATA")
	public UDATA _tenureFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__tenureFreeBytesOffset_);
	}

	// UDATA _tenureFreeBytes
	public UDATAPointer _tenureFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__tenureFreeBytesOffset_));
	}

	// UDATA _tenureLOAFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOAFreeBytesOffset_", declaredType="UDATA")
	public UDATA _tenureLOAFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__tenureLOAFreeBytesOffset_);
	}

	// UDATA _tenureLOAFreeBytes
	public UDATAPointer _tenureLOAFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__tenureLOAFreeBytesOffset_));
	}

	// UDATA _tenureLOATotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOATotalBytesOffset_", declaredType="UDATA")
	public UDATA _tenureLOATotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__tenureLOATotalBytesOffset_);
	}

	// UDATA _tenureLOATotalBytes
	public UDATAPointer _tenureLOATotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__tenureLOATotalBytesOffset_));
	}

	// UDATA _tenureTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureTotalBytesOffset_", declaredType="UDATA")
	public UDATA _tenureTotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__tenureTotalBytesOffset_);
	}

	// UDATA _tenureTotalBytes
	public UDATAPointer _tenureTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__tenureTotalBytesOffset_));
	}

	// UDATA _weakReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__weakReferenceClearCountOffset_);
	}

	// UDATA _weakReferenceClearCount
	public UDATAPointer _weakReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__weakReferenceClearCountOffset_));
	}

	// UDATA _workStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStackOverflowCountOffset_", declaredType="UDATA")
	public UDATA _workStackOverflowCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__workStackOverflowCountOffset_);
	}

	// UDATA _workStackOverflowCount
	public UDATAPointer _workStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__workStackOverflowCountOffset_));
	}

	// UDATA _workStackOverflowOccured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStackOverflowOccuredOffset_", declaredType="UDATA")
	public UDATA _workStackOverflowOccured() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__workStackOverflowOccuredOffset_);
	}

	// UDATA _workStackOverflowOccured
	public UDATAPointer _workStackOverflowOccuredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__workStackOverflowOccuredOffset_));
	}

	// UDATA _workpacketCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workpacketCountOffset_", declaredType="UDATA")
	public UDATA _workpacketCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventGlobalGCEnd.__workpacketCountOffset_);
	}

	// UDATA _workpacketCount
	public UDATAPointer _workpacketCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGlobalGCEnd.__workpacketCountOffset_));
	}

}
