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
 * Structure: MM_CompactStatsPointer
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
 * The generated code will provide getters for all elements in the MM_CompactStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompactStats.class)
public class MM_CompactStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_CompactStatsPointer NULL = new MM_CompactStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompactStatsPointer(long address) {
		super(address);
	}

	public static MM_CompactStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompactStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompactStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompactStatsPointer(address);
	}

	public MM_CompactStatsPointer add(long count) {
		return MM_CompactStatsPointer.cast(address + (MM_CompactStats.SIZEOF * count));
	}

	public MM_CompactStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompactStatsPointer addOffset(long offset) {
		return MM_CompactStatsPointer.cast(address + offset);
	}

	public MM_CompactStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompactStatsPointer sub(long count) {
		return MM_CompactStatsPointer.cast(address - (MM_CompactStats.SIZEOF * count));
	}

	public MM_CompactStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompactStatsPointer subOffset(long offset) {
		return MM_CompactStatsPointer.cast(address - offset);
	}

	public MM_CompactStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompactStatsPointer untag(long mask) {
		return MM_CompactStatsPointer.cast(address & ~mask);
	}

	public MM_CompactStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompactStats.SIZEOF;
	}

	// Implementation methods

	// CompactPreventedReason _compactPreventedReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactPreventedReasonOffset_", declaredType="CompactPreventedReason")
	public long _compactPreventedReason() throws CorruptDataException {
		if (CompactPreventedReason.SIZEOF == 1) {
			return getByteAtOffset(MM_CompactStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 2) {
			return getShortAtOffset(MM_CompactStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 4) {
			return getIntAtOffset(MM_CompactStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 8) {
			return getLongAtOffset(MM_CompactStats.__compactPreventedReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CompactPreventedReason _compactPreventedReason
	public EnumPointer _compactPreventedReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CompactStats.__compactPreventedReasonOffset_), CompactPreventedReason.class);
	}

	// CompactReason _compactReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactReasonOffset_", declaredType="CompactReason")
	public long _compactReason() throws CorruptDataException {
		if (CompactReason.SIZEOF == 1) {
			return getByteAtOffset(MM_CompactStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 2) {
			return getShortAtOffset(MM_CompactStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 4) {
			return getIntAtOffset(MM_CompactStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 8) {
			return getLongAtOffset(MM_CompactStats.__compactReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CompactReason _compactReason
	public EnumPointer _compactReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CompactStats.__compactReasonOffset_), CompactReason.class);
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__endTimeOffset_));
	}

	// U64 _fixupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupEndTimeOffset_", declaredType="U64")
	public UDATA _fixupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__fixupEndTimeOffset_));
	}

	// U64 _fixupEndTime
	public UDATAPointer _fixupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__fixupEndTimeOffset_));
	}

	// U64 _fixupObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupObjectsOffset_", declaredType="U64")
	public UDATA _fixupObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__fixupObjectsOffset_));
	}

	// U64 _fixupObjects
	public UDATAPointer _fixupObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__fixupObjectsOffset_));
	}

	// U64 _fixupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupStartTimeOffset_", declaredType="U64")
	public UDATA _fixupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__fixupStartTimeOffset_));
	}

	// U64 _fixupStartTime
	public UDATAPointer _fixupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__fixupStartTimeOffset_));
	}

	// U64 _lastHeapCompaction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastHeapCompactionOffset_", declaredType="U64")
	public UDATA _lastHeapCompaction() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__lastHeapCompactionOffset_));
	}

	// U64 _lastHeapCompaction
	public UDATAPointer _lastHeapCompactionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__lastHeapCompactionOffset_));
	}

	// U64 _moveEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveEndTimeOffset_", declaredType="U64")
	public UDATA _moveEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__moveEndTimeOffset_));
	}

	// U64 _moveEndTime
	public UDATAPointer _moveEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__moveEndTimeOffset_));
	}

	// U64 _moveStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveStartTimeOffset_", declaredType="U64")
	public UDATA _moveStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__moveStartTimeOffset_));
	}

	// U64 _moveStartTime
	public UDATAPointer _moveStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__moveStartTimeOffset_));
	}

	// U64 _movedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__movedBytesOffset_", declaredType="U64")
	public UDATA _movedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__movedBytesOffset_));
	}

	// U64 _movedBytes
	public UDATAPointer _movedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__movedBytesOffset_));
	}

	// U64 _movedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__movedObjectsOffset_", declaredType="U64")
	public UDATA _movedObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__movedObjectsOffset_));
	}

	// U64 _movedObjects
	public UDATAPointer _movedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__movedObjectsOffset_));
	}

	// U64 _rootFixupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootFixupEndTimeOffset_", declaredType="U64")
	public UDATA _rootFixupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__rootFixupEndTimeOffset_));
	}

	// U64 _rootFixupEndTime
	public UDATAPointer _rootFixupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__rootFixupEndTimeOffset_));
	}

	// U64 _rootFixupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootFixupStartTimeOffset_", declaredType="U64")
	public UDATA _rootFixupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__rootFixupStartTimeOffset_));
	}

	// U64 _rootFixupStartTime
	public UDATAPointer _rootFixupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__rootFixupStartTimeOffset_));
	}

	// U64 _setupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__setupEndTimeOffset_", declaredType="U64")
	public UDATA _setupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__setupEndTimeOffset_));
	}

	// U64 _setupEndTime
	public UDATAPointer _setupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__setupEndTimeOffset_));
	}

	// U64 _setupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__setupStartTimeOffset_", declaredType="U64")
	public UDATA _setupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__setupStartTimeOffset_));
	}

	// U64 _setupStartTime
	public UDATAPointer _setupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__setupStartTimeOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactStats.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactStats.__startTimeOffset_));
	}

}
