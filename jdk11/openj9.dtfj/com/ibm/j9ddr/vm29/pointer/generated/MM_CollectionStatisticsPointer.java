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
 * Structure: MM_CollectionStatisticsPointer
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
 * The generated code will provide getters for all elements in the MM_CollectionStatisticsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CollectionStatistics.class)
public class MM_CollectionStatisticsPointer extends MM_BasePointer {

	// NULL
	public static final MM_CollectionStatisticsPointer NULL = new MM_CollectionStatisticsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CollectionStatisticsPointer(long address) {
		super(address);
	}

	public static MM_CollectionStatisticsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CollectionStatisticsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CollectionStatisticsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CollectionStatisticsPointer(address);
	}

	public MM_CollectionStatisticsPointer add(long count) {
		return MM_CollectionStatisticsPointer.cast(address + (MM_CollectionStatistics.SIZEOF * count));
	}

	public MM_CollectionStatisticsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CollectionStatisticsPointer addOffset(long offset) {
		return MM_CollectionStatisticsPointer.cast(address + offset);
	}

	public MM_CollectionStatisticsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CollectionStatisticsPointer sub(long count) {
		return MM_CollectionStatisticsPointer.cast(address - (MM_CollectionStatistics.SIZEOF * count));
	}

	public MM_CollectionStatisticsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CollectionStatisticsPointer subOffset(long offset) {
		return MM_CollectionStatisticsPointer.cast(address - offset);
	}

	public MM_CollectionStatisticsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CollectionStatisticsPointer untag(long mask) {
		return MM_CollectionStatisticsPointer.cast(address & ~mask);
	}

	public MM_CollectionStatisticsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CollectionStatistics.SIZEOF;
	}

	// Implementation methods

	// omrthread_process_time_t _endProcessTimes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endProcessTimesOffset_", declaredType="omrthread_process_time_t")
	public omrthread_process_time_tPointer _endProcessTimes() throws CorruptDataException {
		return omrthread_process_time_tPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__endProcessTimesOffset_));
	}

	// omrthread_process_time_t _endProcessTimes
	public PointerPointer _endProcessTimesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__endProcessTimesOffset_));
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatistics.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__endTimeOffset_));
	}

	// U64 _stallTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stallTimeOffset_", declaredType="U64")
	public UDATA _stallTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatistics.__stallTimeOffset_));
	}

	// U64 _stallTime
	public UDATAPointer _stallTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__stallTimeOffset_));
	}

	// omrthread_process_time_t _startProcessTimes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startProcessTimesOffset_", declaredType="omrthread_process_time_t")
	public omrthread_process_time_tPointer _startProcessTimes() throws CorruptDataException {
		return omrthread_process_time_tPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__startProcessTimesOffset_));
	}

	// omrthread_process_time_t _startProcessTimes
	public PointerPointer _startProcessTimesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__startProcessTimesOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatistics.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__startTimeOffset_));
	}

	// U64 _totalFreeHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalFreeHeapSizeOffset_", declaredType="U64")
	public UDATA _totalFreeHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatistics.__totalFreeHeapSizeOffset_));
	}

	// U64 _totalFreeHeapSize
	public UDATAPointer _totalFreeHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__totalFreeHeapSizeOffset_));
	}

	// U64 _totalHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalHeapSizeOffset_", declaredType="U64")
	public UDATA _totalHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatistics.__totalHeapSizeOffset_));
	}

	// U64 _totalHeapSize
	public UDATAPointer _totalHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatistics.__totalHeapSizeOffset_));
	}

}
