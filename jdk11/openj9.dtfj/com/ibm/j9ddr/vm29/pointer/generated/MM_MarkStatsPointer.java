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
 * Structure: MM_MarkStatsPointer
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
 * The generated code will provide getters for all elements in the MM_MarkStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MarkStats.class)
public class MM_MarkStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_MarkStatsPointer NULL = new MM_MarkStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MarkStatsPointer(long address) {
		super(address);
	}

	public static MM_MarkStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MarkStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MarkStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MarkStatsPointer(address);
	}

	public MM_MarkStatsPointer add(long count) {
		return MM_MarkStatsPointer.cast(address + (MM_MarkStats.SIZEOF * count));
	}

	public MM_MarkStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MarkStatsPointer addOffset(long offset) {
		return MM_MarkStatsPointer.cast(address + offset);
	}

	public MM_MarkStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MarkStatsPointer sub(long count) {
		return MM_MarkStatsPointer.cast(address - (MM_MarkStats.SIZEOF * count));
	}

	public MM_MarkStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MarkStatsPointer subOffset(long offset) {
		return MM_MarkStatsPointer.cast(address - offset);
	}

	public MM_MarkStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MarkStatsPointer untag(long mask) {
		return MM_MarkStatsPointer.cast(address & ~mask);
	}

	public MM_MarkStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MarkStats.SIZEOF;
	}

	// Implementation methods

	// U64 _bytesScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesScannedOffset_", declaredType="U64")
	public UDATA _bytesScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__bytesScannedOffset_));
	}

	// U64 _bytesScanned
	public UDATAPointer _bytesScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__bytesScannedOffset_));
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__endTimeOffset_));
	}

	// U64 _gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCountOffset_", declaredType="U64")
	public UDATA _gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__gcCountOffset_));
	}

	// U64 _gcCount
	public UDATAPointer _gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__gcCountOffset_));
	}

	// U64 _objectsMarked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsMarkedOffset_", declaredType="U64")
	public UDATA _objectsMarked() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__objectsMarkedOffset_));
	}

	// U64 _objectsMarked
	public UDATAPointer _objectsMarkedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__objectsMarkedOffset_));
	}

	// U64 _objectsScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectsScannedOffset_", declaredType="U64")
	public UDATA _objectsScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__objectsScannedOffset_));
	}

	// U64 _objectsScanned
	public UDATAPointer _objectsScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__objectsScannedOffset_));
	}

	// U64 _scanTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanTimeOffset_", declaredType="U64")
	public UDATA _scanTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__scanTimeOffset_));
	}

	// U64 _scanTime
	public UDATAPointer _scanTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__scanTimeOffset_));
	}

	// U64 _splitArraysAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__splitArraysAmountOffset_", declaredType="U64")
	public UDATA _splitArraysAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__splitArraysAmountOffset_));
	}

	// U64 _splitArraysAmount
	public UDATAPointer _splitArraysAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__splitArraysAmountOffset_));
	}

	// U64 _splitArraysProcessed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__splitArraysProcessedOffset_", declaredType="U64")
	public UDATA _splitArraysProcessed() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__splitArraysProcessedOffset_));
	}

	// U64 _splitArraysProcessed
	public UDATAPointer _splitArraysProcessedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__splitArraysProcessedOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__startTimeOffset_));
	}

	// U64 _syncStallCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallCountOffset_", declaredType="U64")
	public UDATA _syncStallCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__syncStallCountOffset_));
	}

	// U64 _syncStallCount
	public UDATAPointer _syncStallCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__syncStallCountOffset_));
	}

	// U64 _syncStallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncStallTimeOffset_", declaredType="U64")
	public UDATA _syncStallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MarkStats.__syncStallTimeOffset_));
	}

	// U64 _syncStallTime
	public UDATAPointer _syncStallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MarkStats.__syncStallTimeOffset_));
	}

}
