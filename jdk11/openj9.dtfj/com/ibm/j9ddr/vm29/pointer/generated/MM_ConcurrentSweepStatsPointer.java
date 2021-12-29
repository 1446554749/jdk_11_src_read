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
 * Structure: MM_ConcurrentSweepStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentSweepStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentSweepStats.class)
public class MM_ConcurrentSweepStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_ConcurrentSweepStatsPointer NULL = new MM_ConcurrentSweepStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentSweepStatsPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentSweepStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentSweepStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentSweepStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentSweepStatsPointer(address);
	}

	public MM_ConcurrentSweepStatsPointer add(long count) {
		return MM_ConcurrentSweepStatsPointer.cast(address + (MM_ConcurrentSweepStats.SIZEOF * count));
	}

	public MM_ConcurrentSweepStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentSweepStatsPointer addOffset(long offset) {
		return MM_ConcurrentSweepStatsPointer.cast(address + offset);
	}

	public MM_ConcurrentSweepStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentSweepStatsPointer sub(long count) {
		return MM_ConcurrentSweepStatsPointer.cast(address - (MM_ConcurrentSweepStats.SIZEOF * count));
	}

	public MM_ConcurrentSweepStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentSweepStatsPointer subOffset(long offset) {
		return MM_ConcurrentSweepStatsPointer.cast(address - offset);
	}

	public MM_ConcurrentSweepStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentSweepStatsPointer untag(long mask) {
		return MM_ConcurrentSweepStatsPointer.cast(address & ~mask);
	}

	public MM_ConcurrentSweepStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentSweepStats.SIZEOF;
	}

	// Implementation methods

	// U64 _completeConnectPhaseBytesConnected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeConnectPhaseBytesConnectedOffset_", declaredType="U64")
	public UDATA _completeConnectPhaseBytesConnected() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeConnectPhaseBytesConnectedOffset_));
	}

	// U64 _completeConnectPhaseBytesConnected
	public UDATAPointer _completeConnectPhaseBytesConnectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeConnectPhaseBytesConnectedOffset_));
	}

	// U64 _completeConnectPhaseTimeEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeConnectPhaseTimeEndOffset_", declaredType="U64")
	public UDATA _completeConnectPhaseTimeEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeConnectPhaseTimeEndOffset_));
	}

	// U64 _completeConnectPhaseTimeEnd
	public UDATAPointer _completeConnectPhaseTimeEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeConnectPhaseTimeEndOffset_));
	}

	// U64 _completeConnectPhaseTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeConnectPhaseTimeStartOffset_", declaredType="U64")
	public UDATA _completeConnectPhaseTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeConnectPhaseTimeStartOffset_));
	}

	// U64 _completeConnectPhaseTimeStart
	public UDATAPointer _completeConnectPhaseTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeConnectPhaseTimeStartOffset_));
	}

	// volatile U64 _completeSweepPhaseBytesSwept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeSweepPhaseBytesSweptOffset_", declaredType="volatile U64")
	public UDATA _completeSweepPhaseBytesSwept() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeSweepPhaseBytesSweptOffset_));
	}

	// volatile U64 _completeSweepPhaseBytesSwept
	public UDATAPointer _completeSweepPhaseBytesSweptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeSweepPhaseBytesSweptOffset_));
	}

	// U64 _completeSweepPhaseTimeEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeSweepPhaseTimeEndOffset_", declaredType="U64")
	public UDATA _completeSweepPhaseTimeEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeSweepPhaseTimeEndOffset_));
	}

	// U64 _completeSweepPhaseTimeEnd
	public UDATAPointer _completeSweepPhaseTimeEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeSweepPhaseTimeEndOffset_));
	}

	// U64 _completeSweepPhaseTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeSweepPhaseTimeStartOffset_", declaredType="U64")
	public UDATA _completeSweepPhaseTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__completeSweepPhaseTimeStartOffset_));
	}

	// U64 _completeSweepPhaseTimeStart
	public UDATAPointer _completeSweepPhaseTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__completeSweepPhaseTimeStartOffset_));
	}

	// volatile U64 _concurrentCompleteSweepBytesSwept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCompleteSweepBytesSweptOffset_", declaredType="volatile U64")
	public UDATA _concurrentCompleteSweepBytesSwept() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__concurrentCompleteSweepBytesSweptOffset_));
	}

	// volatile U64 _concurrentCompleteSweepBytesSwept
	public UDATAPointer _concurrentCompleteSweepBytesSweptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__concurrentCompleteSweepBytesSweptOffset_));
	}

	// U64 _concurrentCompleteSweepTimeEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCompleteSweepTimeEndOffset_", declaredType="U64")
	public UDATA _concurrentCompleteSweepTimeEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__concurrentCompleteSweepTimeEndOffset_));
	}

	// U64 _concurrentCompleteSweepTimeEnd
	public UDATAPointer _concurrentCompleteSweepTimeEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__concurrentCompleteSweepTimeEndOffset_));
	}

	// U64 _concurrentCompleteSweepTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentCompleteSweepTimeStartOffset_", declaredType="U64")
	public UDATA _concurrentCompleteSweepTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__concurrentCompleteSweepTimeStartOffset_));
	}

	// U64 _concurrentCompleteSweepTimeStart
	public UDATAPointer _concurrentCompleteSweepTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__concurrentCompleteSweepTimeStartOffset_));
	}

	// U64 _minimumFreeEntryBytesConnected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumFreeEntryBytesConnectedOffset_", declaredType="U64")
	public UDATA _minimumFreeEntryBytesConnected() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__minimumFreeEntryBytesConnectedOffset_));
	}

	// U64 _minimumFreeEntryBytesConnected
	public UDATAPointer _minimumFreeEntryBytesConnectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__minimumFreeEntryBytesConnectedOffset_));
	}

	// U64 _minimumFreeEntryBytesSwept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumFreeEntryBytesSweptOffset_", declaredType="U64")
	public UDATA _minimumFreeEntryBytesSwept() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__minimumFreeEntryBytesSweptOffset_));
	}

	// U64 _minimumFreeEntryBytesSwept
	public UDATAPointer _minimumFreeEntryBytesSweptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__minimumFreeEntryBytesSweptOffset_));
	}

	// volatile U64 _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="volatile U64")
	public UDATA _mode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__modeOffset_));
	}

	// volatile U64 _mode
	public UDATAPointer _modeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__modeOffset_));
	}

	// U64 _totalChunkCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalChunkCountOffset_", declaredType="U64")
	public UDATA _totalChunkCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__totalChunkCountOffset_));
	}

	// U64 _totalChunkCount
	public UDATAPointer _totalChunkCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__totalChunkCountOffset_));
	}

	// volatile U64 _totalChunkSweptCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalChunkSweptCountOffset_", declaredType="volatile U64")
	public UDATA _totalChunkSweptCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentSweepStats.__totalChunkSweptCountOffset_));
	}

	// volatile U64 _totalChunkSweptCount
	public UDATAPointer _totalChunkSweptCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepStats.__totalChunkSweptCountOffset_));
	}

}
