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
 * Structure: MM_VLHGCIncrementStatsPointer
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
 * The generated code will provide getters for all elements in the MM_VLHGCIncrementStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VLHGCIncrementStats.class)
public class MM_VLHGCIncrementStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_VLHGCIncrementStatsPointer NULL = new MM_VLHGCIncrementStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VLHGCIncrementStatsPointer(long address) {
		super(address);
	}

	public static MM_VLHGCIncrementStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VLHGCIncrementStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VLHGCIncrementStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VLHGCIncrementStatsPointer(address);
	}

	public MM_VLHGCIncrementStatsPointer add(long count) {
		return MM_VLHGCIncrementStatsPointer.cast(address + (MM_VLHGCIncrementStats.SIZEOF * count));
	}

	public MM_VLHGCIncrementStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VLHGCIncrementStatsPointer addOffset(long offset) {
		return MM_VLHGCIncrementStatsPointer.cast(address + offset);
	}

	public MM_VLHGCIncrementStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VLHGCIncrementStatsPointer sub(long count) {
		return MM_VLHGCIncrementStatsPointer.cast(address - (MM_VLHGCIncrementStats.SIZEOF * count));
	}

	public MM_VLHGCIncrementStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VLHGCIncrementStatsPointer subOffset(long offset) {
		return MM_VLHGCIncrementStatsPointer.cast(address - offset);
	}

	public MM_VLHGCIncrementStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VLHGCIncrementStatsPointer untag(long mask) {
		return MM_VLHGCIncrementStatsPointer.cast(address & ~mask);
	}

	public MM_VLHGCIncrementStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VLHGCIncrementStats.SIZEOF;
	}

	// Implementation methods

	// MM_ClassUnloadStats _classUnloadStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classUnloadStatsOffset_", declaredType="MM_ClassUnloadStats")
	public MM_ClassUnloadStatsPointer _classUnloadStats() throws CorruptDataException {
		return MM_ClassUnloadStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__classUnloadStatsOffset_));
	}

	// MM_ClassUnloadStats _classUnloadStats
	public PointerPointer _classUnloadStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__classUnloadStatsOffset_));
	}

	// MM_CompactVLHGCStats _compactStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactStatsOffset_", declaredType="MM_CompactVLHGCStats")
	public MM_CompactVLHGCStatsPointer _compactStats() throws CorruptDataException {
		return MM_CompactVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__compactStatsOffset_));
	}

	// MM_CompactVLHGCStats _compactStats
	public PointerPointer _compactStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__compactStatsOffset_));
	}

	// MM_CopyForwardStats _copyForwardStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardStatsOffset_", declaredType="MM_CopyForwardStats")
	public MM_CopyForwardStatsPointer _copyForwardStats() throws CorruptDataException {
		return MM_CopyForwardStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__copyForwardStatsOffset_));
	}

	// MM_CopyForwardStats _copyForwardStats
	public PointerPointer _copyForwardStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__copyForwardStatsOffset_));
	}

	// MM_VLHGCIncrementStats$GlobalMarkIncrementType _globalMarkIncrementType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalMarkIncrementTypeOffset_", declaredType="MM_VLHGCIncrementStats$GlobalMarkIncrementType")
	public long _globalMarkIncrementType() throws CorruptDataException {
		if (MM_VLHGCIncrementStats$GlobalMarkIncrementType.SIZEOF == 1) {
			return getByteAtOffset(MM_VLHGCIncrementStats.__globalMarkIncrementTypeOffset_);
		} else if (MM_VLHGCIncrementStats$GlobalMarkIncrementType.SIZEOF == 2) {
			return getShortAtOffset(MM_VLHGCIncrementStats.__globalMarkIncrementTypeOffset_);
		} else if (MM_VLHGCIncrementStats$GlobalMarkIncrementType.SIZEOF == 4) {
			return getIntAtOffset(MM_VLHGCIncrementStats.__globalMarkIncrementTypeOffset_);
		} else if (MM_VLHGCIncrementStats$GlobalMarkIncrementType.SIZEOF == 8) {
			return getLongAtOffset(MM_VLHGCIncrementStats.__globalMarkIncrementTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_VLHGCIncrementStats$GlobalMarkIncrementType _globalMarkIncrementType
	public EnumPointer _globalMarkIncrementTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__globalMarkIncrementTypeOffset_), MM_VLHGCIncrementStats$GlobalMarkIncrementType.class);
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__irrsStatsOffset_", declaredType="MM_InterRegionRememberedSetStats")
	public MM_InterRegionRememberedSetStatsPointer _irrsStats() throws CorruptDataException {
		return MM_InterRegionRememberedSetStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__irrsStatsOffset_));
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	public PointerPointer _irrsStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__irrsStatsOffset_));
	}

	// MM_MarkVLHGCStats _markStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStatsOffset_", declaredType="MM_MarkVLHGCStats")
	public MM_MarkVLHGCStatsPointer _markStats() throws CorruptDataException {
		return MM_MarkVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__markStatsOffset_));
	}

	// MM_MarkVLHGCStats _markStats
	public PointerPointer _markStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__markStatsOffset_));
	}

	// MM_SweepVLHGCStats _sweepStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepStatsOffset_", declaredType="MM_SweepVLHGCStats")
	public MM_SweepVLHGCStatsPointer _sweepStats() throws CorruptDataException {
		return MM_SweepVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__sweepStatsOffset_));
	}

	// MM_SweepVLHGCStats _sweepStats
	public PointerPointer _sweepStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__sweepStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketStatsOffset_", declaredType="MM_WorkPacketStats")
	public MM_WorkPacketStatsPointer _workPacketStats() throws CorruptDataException {
		return MM_WorkPacketStatsPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__workPacketStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	public PointerPointer _workPacketStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCIncrementStats.__workPacketStatsOffset_));
	}

}
