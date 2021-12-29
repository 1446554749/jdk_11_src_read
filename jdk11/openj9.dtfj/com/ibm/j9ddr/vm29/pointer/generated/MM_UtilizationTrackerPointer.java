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
 * Structure: MM_UtilizationTrackerPointer
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
 * The generated code will provide getters for all elements in the MM_UtilizationTrackerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_UtilizationTracker.class)
public class MM_UtilizationTrackerPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_UtilizationTrackerPointer NULL = new MM_UtilizationTrackerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_UtilizationTrackerPointer(long address) {
		super(address);
	}

	public static MM_UtilizationTrackerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_UtilizationTrackerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_UtilizationTrackerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_UtilizationTrackerPointer(address);
	}

	public MM_UtilizationTrackerPointer add(long count) {
		return MM_UtilizationTrackerPointer.cast(address + (MM_UtilizationTracker.SIZEOF * count));
	}

	public MM_UtilizationTrackerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_UtilizationTrackerPointer addOffset(long offset) {
		return MM_UtilizationTrackerPointer.cast(address + offset);
	}

	public MM_UtilizationTrackerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_UtilizationTrackerPointer sub(long count) {
		return MM_UtilizationTrackerPointer.cast(address - (MM_UtilizationTracker.SIZEOF * count));
	}

	public MM_UtilizationTrackerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_UtilizationTrackerPointer subOffset(long offset) {
		return MM_UtilizationTrackerPointer.cast(address - offset);
	}

	public MM_UtilizationTrackerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_UtilizationTrackerPointer untag(long mask) {
		return MM_UtilizationTrackerPointer.cast(address & ~mask);
	}

	public MM_UtilizationTrackerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_UtilizationTracker.SIZEOF;
	}

	// Implementation methods

	// double _currentUtilization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentUtilizationOffset_", declaredType="double")
	public double _currentUtilization() throws CorruptDataException {
		return getDoubleAtOffset(MM_UtilizationTracker.__currentUtilizationOffset_);
	}

	// double _currentUtilization
	public DoublePointer _currentUtilizationEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_UtilizationTracker.__currentUtilizationOffset_));
	}

	// U64 _lastUpdateTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastUpdateTimeOffset_", declaredType="U64")
	public UDATA _lastUpdateTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_UtilizationTracker.__lastUpdateTimeOffset_));
	}

	// U64 _lastUpdateTime
	public UDATAPointer _lastUpdateTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__lastUpdateTimeOffset_));
	}

	// U64 _maxGCSlice
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxGCSliceOffset_", declaredType="U64")
	public UDATA _maxGCSlice() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_UtilizationTracker.__maxGCSliceOffset_));
	}

	// U64 _maxGCSlice
	public UDATAPointer _maxGCSliceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__maxGCSliceOffset_));
	}

	// U64 _nanosLeftInCurrentSlice
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nanosLeftInCurrentSliceOffset_", declaredType="U64")
	public UDATA _nanosLeftInCurrentSlice() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_UtilizationTracker.__nanosLeftInCurrentSliceOffset_));
	}

	// U64 _nanosLeftInCurrentSlice
	public UDATAPointer _nanosLeftInCurrentSliceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__nanosLeftInCurrentSliceOffset_));
	}

	// double _targetUtilization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__targetUtilizationOffset_", declaredType="double")
	public double _targetUtilization() throws CorruptDataException {
		return getDoubleAtOffset(MM_UtilizationTracker.__targetUtilizationOffset_);
	}

	// double _targetUtilization
	public DoublePointer _targetUtilizationEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_UtilizationTracker.__targetUtilizationOffset_));
	}

	// I32 _timeSliceCursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeSliceCursorOffset_", declaredType="I32")
	public IDATA _timeSliceCursor() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_UtilizationTracker.__timeSliceCursorOffset_));
	}

	// I32 _timeSliceCursor
	public IDATAPointer _timeSliceCursorEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__timeSliceCursorOffset_));
	}

	// double[] _timeSliceDuration
	public DoublePointer _timeSliceDurationEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_UtilizationTracker.__timeSliceDurationOffset_));
	}

	// bool[] _timeSliceIsMutator
	public BoolPointer _timeSliceIsMutatorEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__timeSliceIsMutatorOffset_));
	}

	// double _timeWindow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeWindowOffset_", declaredType="double")
	public double _timeWindow() throws CorruptDataException {
		return getDoubleAtOffset(MM_UtilizationTracker.__timeWindowOffset_);
	}

	// double _timeWindow
	public DoublePointer _timeWindowEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_UtilizationTracker.__timeWindowOffset_));
	}

	// I32 _totalSlices
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalSlicesOffset_", declaredType="I32")
	public IDATA _totalSlices() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_UtilizationTracker.__totalSlicesOffset_));
	}

	// I32 _totalSlices
	public IDATAPointer _totalSlicesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_UtilizationTracker.__totalSlicesOffset_));
	}

}
