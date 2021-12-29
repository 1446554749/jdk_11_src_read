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
 * Structure: MM_WorkPacketStatsPointer
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
 * The generated code will provide getters for all elements in the MM_WorkPacketStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_WorkPacketStats.class)
public class MM_WorkPacketStatsPointer extends StructurePointer {

	// NULL
	public static final MM_WorkPacketStatsPointer NULL = new MM_WorkPacketStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_WorkPacketStatsPointer(long address) {
		super(address);
	}

	public static MM_WorkPacketStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_WorkPacketStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_WorkPacketStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_WorkPacketStatsPointer(address);
	}

	public MM_WorkPacketStatsPointer add(long count) {
		return MM_WorkPacketStatsPointer.cast(address + (MM_WorkPacketStats.SIZEOF * count));
	}

	public MM_WorkPacketStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_WorkPacketStatsPointer addOffset(long offset) {
		return MM_WorkPacketStatsPointer.cast(address + offset);
	}

	public MM_WorkPacketStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_WorkPacketStatsPointer sub(long count) {
		return MM_WorkPacketStatsPointer.cast(address - (MM_WorkPacketStats.SIZEOF * count));
	}

	public MM_WorkPacketStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_WorkPacketStatsPointer subOffset(long offset) {
		return MM_WorkPacketStatsPointer.cast(address - offset);
	}

	public MM_WorkPacketStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_WorkPacketStatsPointer untag(long mask) {
		return MM_WorkPacketStatsPointer.cast(address & ~mask);
	}

	public MM_WorkPacketStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_WorkPacketStats.SIZEOF;
	}

	// Implementation methods

	// U64 _completeStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallCountOffset_", declaredType="U64")
	public UDATA _completeStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__completeStallCountOffset_));
	}

	// U64 _completeStallCount
	public UDATAPointer _completeStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__completeStallCountOffset_));
	}

	// U64 _completeStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeStallTimeOffset_", declaredType="U64")
	public UDATA _completeStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__completeStallTimeOffset_));
	}

	// U64 _completeStallTime
	public UDATAPointer _completeStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__completeStallTimeOffset_));
	}

	// U64 _gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCountOffset_", declaredType="U64")
	public UDATA _gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__gcCountOffset_));
	}

	// U64 _gcCount
	public UDATAPointer _gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__gcCountOffset_));
	}

	// U64 _stwWorkStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stwWorkStackOverflowCountOffset_", declaredType="U64")
	public UDATA _stwWorkStackOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__stwWorkStackOverflowCountOffset_));
	}

	// U64 _stwWorkStackOverflowCount
	public UDATAPointer _stwWorkStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__stwWorkStackOverflowCountOffset_));
	}

	// bool _stwWorkStackOverflowOccured
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stwWorkStackOverflowOccuredOffset_", declaredType="bool")
	public boolean _stwWorkStackOverflowOccured() throws CorruptDataException {
		return getBoolAtOffset(MM_WorkPacketStats.__stwWorkStackOverflowOccuredOffset_);
	}

	// bool _stwWorkStackOverflowOccured
	public BoolPointer _stwWorkStackOverflowOccuredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__stwWorkStackOverflowOccuredOffset_));
	}

	// U64 _stwWorkpacketCountAtOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stwWorkpacketCountAtOverflowOffset_", declaredType="U64")
	public UDATA _stwWorkpacketCountAtOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__stwWorkpacketCountAtOverflowOffset_));
	}

	// U64 _stwWorkpacketCountAtOverflow
	public UDATAPointer _stwWorkpacketCountAtOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__stwWorkpacketCountAtOverflowOffset_));
	}

	// U64 _workStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallCountOffset_", declaredType="U64")
	public UDATA _workStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__workStallCountOffset_));
	}

	// U64 _workStallCount
	public UDATAPointer _workStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__workStallCountOffset_));
	}

	// U64 _workStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workStallTimeOffset_", declaredType="U64")
	public UDATA _workStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats.__workStallTimeOffset_));
	}

	// U64 _workStallTime
	public UDATAPointer _workStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats.__workStallTimeOffset_));
	}

	// U64 workPacketsAcquired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workPacketsAcquiredOffset_", declaredType="U64")
	public UDATA workPacketsAcquired() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats._workPacketsAcquiredOffset_));
	}

	// U64 workPacketsAcquired
	public UDATAPointer workPacketsAcquiredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats._workPacketsAcquiredOffset_));
	}

	// U64 workPacketsExchanged
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workPacketsExchangedOffset_", declaredType="U64")
	public UDATA workPacketsExchanged() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats._workPacketsExchangedOffset_));
	}

	// U64 workPacketsExchanged
	public UDATAPointer workPacketsExchangedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats._workPacketsExchangedOffset_));
	}

	// U64 workPacketsReleased
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workPacketsReleasedOffset_", declaredType="U64")
	public UDATA workPacketsReleased() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPacketStats._workPacketsReleasedOffset_));
	}

	// U64 workPacketsReleased
	public UDATAPointer workPacketsReleasedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPacketStats._workPacketsReleasedOffset_));
	}

}
