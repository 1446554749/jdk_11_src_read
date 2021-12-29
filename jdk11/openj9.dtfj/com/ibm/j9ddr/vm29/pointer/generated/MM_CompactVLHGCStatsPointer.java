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
 * Structure: MM_CompactVLHGCStatsPointer
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
 * The generated code will provide getters for all elements in the MM_CompactVLHGCStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompactVLHGCStats.class)
public class MM_CompactVLHGCStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_CompactVLHGCStatsPointer NULL = new MM_CompactVLHGCStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompactVLHGCStatsPointer(long address) {
		super(address);
	}

	public static MM_CompactVLHGCStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompactVLHGCStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompactVLHGCStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompactVLHGCStatsPointer(address);
	}

	public MM_CompactVLHGCStatsPointer add(long count) {
		return MM_CompactVLHGCStatsPointer.cast(address + (MM_CompactVLHGCStats.SIZEOF * count));
	}

	public MM_CompactVLHGCStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompactVLHGCStatsPointer addOffset(long offset) {
		return MM_CompactVLHGCStatsPointer.cast(address + offset);
	}

	public MM_CompactVLHGCStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompactVLHGCStatsPointer sub(long count) {
		return MM_CompactVLHGCStatsPointer.cast(address - (MM_CompactVLHGCStats.SIZEOF * count));
	}

	public MM_CompactVLHGCStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompactVLHGCStatsPointer subOffset(long offset) {
		return MM_CompactVLHGCStatsPointer.cast(address - offset);
	}

	public MM_CompactVLHGCStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompactVLHGCStatsPointer untag(long mask) {
		return MM_CompactVLHGCStatsPointer.cast(address & ~mask);
	}

	public MM_CompactVLHGCStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompactVLHGCStats.SIZEOF;
	}

	// Implementation methods

	// U64 _clearMarkMapEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clearMarkMapEndTimeOffset_", declaredType="U64")
	public UDATA _clearMarkMapEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__clearMarkMapEndTimeOffset_));
	}

	// U64 _clearMarkMapEndTime
	public UDATAPointer _clearMarkMapEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__clearMarkMapEndTimeOffset_));
	}

	// U64 _clearMarkMapStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clearMarkMapStartTimeOffset_", declaredType="U64")
	public UDATA _clearMarkMapStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__clearMarkMapStartTimeOffset_));
	}

	// U64 _clearMarkMapStartTime
	public UDATAPointer _clearMarkMapStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__clearMarkMapStartTimeOffset_));
	}

	// CompactPreventedReason _compactPreventedReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactPreventedReasonOffset_", declaredType="CompactPreventedReason")
	public long _compactPreventedReason() throws CorruptDataException {
		if (CompactPreventedReason.SIZEOF == 1) {
			return getByteAtOffset(MM_CompactVLHGCStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 2) {
			return getShortAtOffset(MM_CompactVLHGCStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 4) {
			return getIntAtOffset(MM_CompactVLHGCStats.__compactPreventedReasonOffset_);
		} else if (CompactPreventedReason.SIZEOF == 8) {
			return getLongAtOffset(MM_CompactVLHGCStats.__compactPreventedReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CompactPreventedReason _compactPreventedReason
	public EnumPointer _compactPreventedReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__compactPreventedReasonOffset_), CompactPreventedReason.class);
	}

	// CompactReason _compactReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactReasonOffset_", declaredType="CompactReason")
	public long _compactReason() throws CorruptDataException {
		if (CompactReason.SIZEOF == 1) {
			return getByteAtOffset(MM_CompactVLHGCStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 2) {
			return getShortAtOffset(MM_CompactVLHGCStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 4) {
			return getIntAtOffset(MM_CompactVLHGCStats.__compactReasonOffset_);
		} else if (CompactReason.SIZEOF == 8) {
			return getLongAtOffset(MM_CompactVLHGCStats.__compactReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CompactReason _compactReason
	public EnumPointer _compactReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__compactReasonOffset_), CompactReason.class);
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__endTimeOffset_));
	}

	// U64 _finalClearNextMarkMapEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalClearNextMarkMapEndTimeOffset_", declaredType="U64")
	public UDATA _finalClearNextMarkMapEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__finalClearNextMarkMapEndTimeOffset_));
	}

	// U64 _finalClearNextMarkMapEndTime
	public UDATAPointer _finalClearNextMarkMapEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__finalClearNextMarkMapEndTimeOffset_));
	}

	// U64 _finalClearNextMarkMapStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalClearNextMarkMapStartTimeOffset_", declaredType="U64")
	public UDATA _finalClearNextMarkMapStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__finalClearNextMarkMapStartTimeOffset_));
	}

	// U64 _finalClearNextMarkMapStartTime
	public UDATAPointer _finalClearNextMarkMapStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__finalClearNextMarkMapStartTimeOffset_));
	}

	// U64 _fixupArrayletLeafEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupArrayletLeafEndTimeOffset_", declaredType="U64")
	public UDATA _fixupArrayletLeafEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupArrayletLeafEndTimeOffset_));
	}

	// U64 _fixupArrayletLeafEndTime
	public UDATAPointer _fixupArrayletLeafEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupArrayletLeafEndTimeOffset_));
	}

	// U64 _fixupArrayletLeafStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupArrayletLeafStartTimeOffset_", declaredType="U64")
	public UDATA _fixupArrayletLeafStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupArrayletLeafStartTimeOffset_));
	}

	// U64 _fixupArrayletLeafStartTime
	public UDATAPointer _fixupArrayletLeafStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupArrayletLeafStartTimeOffset_));
	}

	// U64 _fixupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupEndTimeOffset_", declaredType="U64")
	public UDATA _fixupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupEndTimeOffset_));
	}

	// U64 _fixupEndTime
	public UDATAPointer _fixupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupEndTimeOffset_));
	}

	// U64 _fixupExternalPacketsEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupExternalPacketsEndTimeOffset_", declaredType="U64")
	public UDATA _fixupExternalPacketsEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupExternalPacketsEndTimeOffset_));
	}

	// U64 _fixupExternalPacketsEndTime
	public UDATAPointer _fixupExternalPacketsEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupExternalPacketsEndTimeOffset_));
	}

	// U64 _fixupExternalPacketsStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupExternalPacketsStartTimeOffset_", declaredType="U64")
	public UDATA _fixupExternalPacketsStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupExternalPacketsStartTimeOffset_));
	}

	// U64 _fixupExternalPacketsStartTime
	public UDATAPointer _fixupExternalPacketsStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupExternalPacketsStartTimeOffset_));
	}

	// U64 _fixupObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupObjectsOffset_", declaredType="U64")
	public UDATA _fixupObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupObjectsOffset_));
	}

	// U64 _fixupObjects
	public UDATAPointer _fixupObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupObjectsOffset_));
	}

	// U64 _fixupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixupStartTimeOffset_", declaredType="U64")
	public UDATA _fixupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__fixupStartTimeOffset_));
	}

	// U64 _fixupStartTime
	public UDATAPointer _fixupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__fixupStartTimeOffset_));
	}

	// U64 _flushEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flushEndTimeOffset_", declaredType="U64")
	public UDATA _flushEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__flushEndTimeOffset_));
	}

	// U64 _flushEndTime
	public UDATAPointer _flushEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__flushEndTimeOffset_));
	}

	// U64 _flushStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flushStartTimeOffset_", declaredType="U64")
	public UDATA _flushStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__flushStartTimeOffset_));
	}

	// U64 _flushStartTime
	public UDATAPointer _flushStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__flushStartTimeOffset_));
	}

	// U64 _leafTaggingEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__leafTaggingEndTimeOffset_", declaredType="U64")
	public UDATA _leafTaggingEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__leafTaggingEndTimeOffset_));
	}

	// U64 _leafTaggingEndTime
	public UDATAPointer _leafTaggingEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__leafTaggingEndTimeOffset_));
	}

	// U64 _leafTaggingStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__leafTaggingStartTimeOffset_", declaredType="U64")
	public UDATA _leafTaggingStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__leafTaggingStartTimeOffset_));
	}

	// U64 _leafTaggingStartTime
	public UDATAPointer _leafTaggingStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__leafTaggingStartTimeOffset_));
	}

	// U64 _moveEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveEndTimeOffset_", declaredType="U64")
	public UDATA _moveEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__moveEndTimeOffset_));
	}

	// U64 _moveEndTime
	public UDATAPointer _moveEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__moveEndTimeOffset_));
	}

	// U64 _moveStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveStallTimeOffset_", declaredType="U64")
	public UDATA _moveStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__moveStallTimeOffset_));
	}

	// U64 _moveStallTime
	public UDATAPointer _moveStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__moveStallTimeOffset_));
	}

	// U64 _moveStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__moveStartTimeOffset_", declaredType="U64")
	public UDATA _moveStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__moveStartTimeOffset_));
	}

	// U64 _moveStartTime
	public UDATAPointer _moveStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__moveStartTimeOffset_));
	}

	// U64 _movedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__movedBytesOffset_", declaredType="U64")
	public UDATA _movedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__movedBytesOffset_));
	}

	// U64 _movedBytes
	public UDATAPointer _movedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__movedBytesOffset_));
	}

	// U64 _movedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__movedObjectsOffset_", declaredType="U64")
	public UDATA _movedObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__movedObjectsOffset_));
	}

	// U64 _movedObjects
	public UDATAPointer _movedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__movedObjectsOffset_));
	}

	// U64 _planningEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__planningEndTimeOffset_", declaredType="U64")
	public UDATA _planningEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__planningEndTimeOffset_));
	}

	// U64 _planningEndTime
	public UDATAPointer _planningEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__planningEndTimeOffset_));
	}

	// U64 _planningStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__planningStartTimeOffset_", declaredType="U64")
	public UDATA _planningStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__planningStartTimeOffset_));
	}

	// U64 _planningStartTime
	public UDATAPointer _planningStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__planningStartTimeOffset_));
	}

	// U64 _rebuildMarkBitsEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildMarkBitsEndTimeOffset_", declaredType="U64")
	public UDATA _rebuildMarkBitsEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rebuildMarkBitsEndTimeOffset_));
	}

	// U64 _rebuildMarkBitsEndTime
	public UDATAPointer _rebuildMarkBitsEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rebuildMarkBitsEndTimeOffset_));
	}

	// U64 _rebuildMarkBitsStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildMarkBitsStartTimeOffset_", declaredType="U64")
	public UDATA _rebuildMarkBitsStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rebuildMarkBitsStartTimeOffset_));
	}

	// U64 _rebuildMarkBitsStartTime
	public UDATAPointer _rebuildMarkBitsStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rebuildMarkBitsStartTimeOffset_));
	}

	// U64 _rebuildNextMarkMapEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildNextMarkMapEndTimeOffset_", declaredType="U64")
	public UDATA _rebuildNextMarkMapEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rebuildNextMarkMapEndTimeOffset_));
	}

	// U64 _rebuildNextMarkMapEndTime
	public UDATAPointer _rebuildNextMarkMapEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rebuildNextMarkMapEndTimeOffset_));
	}

	// U64 _rebuildNextMarkMapStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildNextMarkMapStartTimeOffset_", declaredType="U64")
	public UDATA _rebuildNextMarkMapStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rebuildNextMarkMapStartTimeOffset_));
	}

	// U64 _rebuildNextMarkMapStartTime
	public UDATAPointer _rebuildNextMarkMapStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rebuildNextMarkMapStartTimeOffset_));
	}

	// U64 _rebuildStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rebuildStallTimeOffset_", declaredType="U64")
	public UDATA _rebuildStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rebuildStallTimeOffset_));
	}

	// U64 _rebuildStallTime
	public UDATAPointer _rebuildStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rebuildStallTimeOffset_));
	}

	// U64 _recycleEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recycleEndTimeOffset_", declaredType="U64")
	public UDATA _recycleEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__recycleEndTimeOffset_));
	}

	// U64 _recycleEndTime
	public UDATAPointer _recycleEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__recycleEndTimeOffset_));
	}

	// U64 _recycleStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recycleStartTimeOffset_", declaredType="U64")
	public UDATA _recycleStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__recycleStartTimeOffset_));
	}

	// U64 _recycleStartTime
	public UDATAPointer _recycleStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__recycleStartTimeOffset_));
	}

	// U64 _regionCompactDataInitEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCompactDataInitEndTimeOffset_", declaredType="U64")
	public UDATA _regionCompactDataInitEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__regionCompactDataInitEndTimeOffset_));
	}

	// U64 _regionCompactDataInitEndTime
	public UDATAPointer _regionCompactDataInitEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__regionCompactDataInitEndTimeOffset_));
	}

	// U64 _regionCompactDataInitStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCompactDataInitStartTimeOffset_", declaredType="U64")
	public UDATA _regionCompactDataInitStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__regionCompactDataInitStartTimeOffset_));
	}

	// U64 _regionCompactDataInitStartTime
	public UDATAPointer _regionCompactDataInitStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__regionCompactDataInitStartTimeOffset_));
	}

	// U64 _rememberedSetClearingEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetClearingEndTimeOffset_", declaredType="U64")
	public UDATA _rememberedSetClearingEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rememberedSetClearingEndTimeOffset_));
	}

	// U64 _rememberedSetClearingEndTime
	public UDATAPointer _rememberedSetClearingEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rememberedSetClearingEndTimeOffset_));
	}

	// U64 _rememberedSetClearingStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetClearingStartTimeOffset_", declaredType="U64")
	public UDATA _rememberedSetClearingStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rememberedSetClearingStartTimeOffset_));
	}

	// U64 _rememberedSetClearingStartTime
	public UDATAPointer _rememberedSetClearingStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rememberedSetClearingStartTimeOffset_));
	}

	// U64 _reportMoveEventsEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reportMoveEventsEndTimeOffset_", declaredType="U64")
	public UDATA _reportMoveEventsEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__reportMoveEventsEndTimeOffset_));
	}

	// U64 _reportMoveEventsEndTime
	public UDATAPointer _reportMoveEventsEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__reportMoveEventsEndTimeOffset_));
	}

	// U64 _reportMoveEventsStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reportMoveEventsStartTimeOffset_", declaredType="U64")
	public UDATA _reportMoveEventsStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__reportMoveEventsStartTimeOffset_));
	}

	// U64 _reportMoveEventsStartTime
	public UDATAPointer _reportMoveEventsStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__reportMoveEventsStartTimeOffset_));
	}

	// U64 _rootFixupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootFixupEndTimeOffset_", declaredType="U64")
	public UDATA _rootFixupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rootFixupEndTimeOffset_));
	}

	// U64 _rootFixupEndTime
	public UDATAPointer _rootFixupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rootFixupEndTimeOffset_));
	}

	// U64 _rootFixupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootFixupStartTimeOffset_", declaredType="U64")
	public UDATA _rootFixupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__rootFixupStartTimeOffset_));
	}

	// U64 _rootFixupStartTime
	public UDATAPointer _rootFixupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__rootFixupStartTimeOffset_));
	}

	// U64 _setupEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__setupEndTimeOffset_", declaredType="U64")
	public UDATA _setupEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__setupEndTimeOffset_));
	}

	// U64 _setupEndTime
	public UDATAPointer _setupEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__setupEndTimeOffset_));
	}

	// U64 _setupStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__setupStartTimeOffset_", declaredType="U64")
	public UDATA _setupStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__setupStartTimeOffset_));
	}

	// U64 _setupStartTime
	public UDATAPointer _setupStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__setupStartTimeOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactVLHGCStats.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactVLHGCStats.__startTimeOffset_));
	}

}
