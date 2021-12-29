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
 * Structure: MM_GlobalGCStatsPointer
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
 * The generated code will provide getters for all elements in the MM_GlobalGCStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GlobalGCStats.class)
public class MM_GlobalGCStatsPointer extends StructurePointer {

	// NULL
	public static final MM_GlobalGCStatsPointer NULL = new MM_GlobalGCStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GlobalGCStatsPointer(long address) {
		super(address);
	}

	public static MM_GlobalGCStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GlobalGCStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GlobalGCStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GlobalGCStatsPointer(address);
	}

	public MM_GlobalGCStatsPointer add(long count) {
		return MM_GlobalGCStatsPointer.cast(address + (MM_GlobalGCStats.SIZEOF * count));
	}

	public MM_GlobalGCStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GlobalGCStatsPointer addOffset(long offset) {
		return MM_GlobalGCStatsPointer.cast(address + offset);
	}

	public MM_GlobalGCStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GlobalGCStatsPointer sub(long count) {
		return MM_GlobalGCStatsPointer.cast(address - (MM_GlobalGCStats.SIZEOF * count));
	}

	public MM_GlobalGCStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GlobalGCStatsPointer subOffset(long offset) {
		return MM_GlobalGCStatsPointer.cast(address - offset);
	}

	public MM_GlobalGCStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GlobalGCStatsPointer untag(long mask) {
		return MM_GlobalGCStatsPointer.cast(address & ~mask);
	}

	public MM_GlobalGCStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GlobalGCStats.SIZEOF;
	}

	// Implementation methods

	// MM_ClassUnloadStats classUnloadStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classUnloadStatsOffset_", declaredType="MM_ClassUnloadStats")
	public MM_ClassUnloadStatsPointer classUnloadStats() throws CorruptDataException {
		return MM_ClassUnloadStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._classUnloadStatsOffset_));
	}

	// MM_ClassUnloadStats classUnloadStats
	public PointerPointer classUnloadStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._classUnloadStatsOffset_));
	}

	// MM_CompactStats compactStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compactStatsOffset_", declaredType="MM_CompactStats")
	public MM_CompactStatsPointer compactStats() throws CorruptDataException {
		return MM_CompactStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._compactStatsOffset_));
	}

	// MM_CompactStats compactStats
	public PointerPointer compactStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._compactStatsOffset_));
	}

	// U64 finalizableCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizableCountOffset_", declaredType="U64")
	public UDATA finalizableCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GlobalGCStats._finalizableCountOffset_));
	}

	// U64 finalizableCount
	public UDATAPointer finalizableCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalGCStats._finalizableCountOffset_));
	}

	// U64 fixHeapForWalkReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fixHeapForWalkReasonOffset_", declaredType="U64")
	public UDATA fixHeapForWalkReason() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GlobalGCStats._fixHeapForWalkReasonOffset_));
	}

	// U64 fixHeapForWalkReason
	public UDATAPointer fixHeapForWalkReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalGCStats._fixHeapForWalkReasonOffset_));
	}

	// U64 fixHeapForWalkTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fixHeapForWalkTimeOffset_", declaredType="U64")
	public UDATA fixHeapForWalkTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GlobalGCStats._fixHeapForWalkTimeOffset_));
	}

	// U64 fixHeapForWalkTime
	public UDATAPointer fixHeapForWalkTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalGCStats._fixHeapForWalkTimeOffset_));
	}

	// U64 gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountOffset_", declaredType="U64")
	public UDATA gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GlobalGCStats._gcCountOffset_));
	}

	// U64 gcCount
	public UDATAPointer gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalGCStats._gcCountOffset_));
	}

	// MM_MarkStats markStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markStatsOffset_", declaredType="MM_MarkStats")
	public MM_MarkStatsPointer markStats() throws CorruptDataException {
		return MM_MarkStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._markStatsOffset_));
	}

	// MM_MarkStats markStats
	public PointerPointer markStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._markStatsOffset_));
	}

	// MM_MetronomeStats metronomeStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeStatsOffset_", declaredType="MM_MetronomeStats")
	public MM_MetronomeStatsPointer metronomeStats() throws CorruptDataException {
		return MM_MetronomeStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._metronomeStatsOffset_));
	}

	// MM_MetronomeStats metronomeStats
	public PointerPointer metronomeStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._metronomeStatsOffset_));
	}

	// MM_SweepStats sweepStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepStatsOffset_", declaredType="MM_SweepStats")
	public MM_SweepStatsPointer sweepStats() throws CorruptDataException {
		return MM_SweepStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._sweepStatsOffset_));
	}

	// MM_SweepStats sweepStats
	public PointerPointer sweepStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._sweepStatsOffset_));
	}

	// MM_WorkPacketStats workPacketStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workPacketStatsOffset_", declaredType="MM_WorkPacketStats")
	public MM_WorkPacketStatsPointer workPacketStats() throws CorruptDataException {
		return MM_WorkPacketStatsPointer.cast(nonNullFieldEA(MM_GlobalGCStats._workPacketStatsOffset_));
	}

	// MM_WorkPacketStats workPacketStats
	public PointerPointer workPacketStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalGCStats._workPacketStatsOffset_));
	}

}
