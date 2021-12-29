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
 * Structure: MM_ParallelTaskPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelTaskPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelTask.class)
public class MM_ParallelTaskPointer extends MM_TaskPointer {

	// NULL
	public static final MM_ParallelTaskPointer NULL = new MM_ParallelTaskPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelTaskPointer(long address) {
		super(address);
	}

	public static MM_ParallelTaskPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelTaskPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelTaskPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelTaskPointer(address);
	}

	public MM_ParallelTaskPointer add(long count) {
		return MM_ParallelTaskPointer.cast(address + (MM_ParallelTask.SIZEOF * count));
	}

	public MM_ParallelTaskPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelTaskPointer addOffset(long offset) {
		return MM_ParallelTaskPointer.cast(address + offset);
	}

	public MM_ParallelTaskPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelTaskPointer sub(long count) {
		return MM_ParallelTaskPointer.cast(address - (MM_ParallelTask.SIZEOF * count));
	}

	public MM_ParallelTaskPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelTaskPointer subOffset(long offset) {
		return MM_ParallelTaskPointer.cast(address - offset);
	}

	public MM_ParallelTaskPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelTaskPointer untag(long mask) {
		return MM_ParallelTaskPointer.cast(address & ~mask);
	}

	public MM_ParallelTaskPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelTask.SIZEOF;
	}

	// Implementation methods

	// const U8* _syncPointUniqueId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncPointUniqueIdOffset_", declaredType="const U8*")
	public U8Pointer _syncPointUniqueId() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_ParallelTask.__syncPointUniqueIdOffset_));
	}

	// const U8* _syncPointUniqueId
	public PointerPointer _syncPointUniqueIdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelTask.__syncPointUniqueIdOffset_));
	}

	// U64 _syncPointWorkUnitIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncPointWorkUnitIndexOffset_", declaredType="U64")
	public UDATA _syncPointWorkUnitIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__syncPointWorkUnitIndexOffset_));
	}

	// U64 _syncPointWorkUnitIndex
	public UDATAPointer _syncPointWorkUnitIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__syncPointWorkUnitIndexOffset_));
	}

	// volatile U64 _synchronizeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__synchronizeCountOffset_", declaredType="volatile U64")
	public UDATA _synchronizeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__synchronizeCountOffset_));
	}

	// volatile U64 _synchronizeCount
	public UDATAPointer _synchronizeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__synchronizeCountOffset_));
	}

	// volatile U64 _synchronizeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__synchronizeIndexOffset_", declaredType="volatile U64")
	public UDATA _synchronizeIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__synchronizeIndexOffset_));
	}

	// volatile U64 _synchronizeIndex
	public UDATAPointer _synchronizeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__synchronizeIndexOffset_));
	}

	// omrthread_monitor_t _synchronizeMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__synchronizeMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _synchronizeMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ParallelTask.__synchronizeMutexOffset_));
	}

	// omrthread_monitor_t _synchronizeMutex
	public PointerPointer _synchronizeMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelTask.__synchronizeMutexOffset_));
	}

	// bool _synchronized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__synchronizedOffset_", declaredType="bool")
	public boolean _synchronized() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelTask.__synchronizedOffset_);
	}

	// bool _synchronized
	public BoolPointer _synchronizedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelTask.__synchronizedOffset_));
	}

	// volatile U64 _threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountOffset_", declaredType="volatile U64")
	public UDATA _threadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__threadCountOffset_));
	}

	// volatile U64 _threadCount
	public UDATAPointer _threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__threadCountOffset_));
	}

	// U64 _totalThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalThreadCountOffset_", declaredType="U64")
	public UDATA _totalThreadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__totalThreadCountOffset_));
	}

	// U64 _totalThreadCount
	public UDATAPointer _totalThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__totalThreadCountOffset_));
	}

	// volatile U64 _workUnitIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workUnitIndexOffset_", declaredType="volatile U64")
	public UDATA _workUnitIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelTask.__workUnitIndexOffset_));
	}

	// volatile U64 _workUnitIndex
	public UDATAPointer _workUnitIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelTask.__workUnitIndexOffset_));
	}

}
