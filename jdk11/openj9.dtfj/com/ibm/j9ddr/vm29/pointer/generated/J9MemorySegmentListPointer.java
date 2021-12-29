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
 * Structure: J9MemorySegmentListPointer
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
 * The generated code will provide getters for all elements in the J9MemorySegmentListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MemorySegmentList.class)
public class J9MemorySegmentListPointer extends StructurePointer {

	// NULL
	public static final J9MemorySegmentListPointer NULL = new J9MemorySegmentListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MemorySegmentListPointer(long address) {
		super(address);
	}

	public static J9MemorySegmentListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MemorySegmentListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MemorySegmentListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MemorySegmentListPointer(address);
	}

	public J9MemorySegmentListPointer add(long count) {
		return J9MemorySegmentListPointer.cast(address + (J9MemorySegmentList.SIZEOF * count));
	}

	public J9MemorySegmentListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MemorySegmentListPointer addOffset(long offset) {
		return J9MemorySegmentListPointer.cast(address + offset);
	}

	public J9MemorySegmentListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MemorySegmentListPointer sub(long count) {
		return J9MemorySegmentListPointer.cast(address - (J9MemorySegmentList.SIZEOF * count));
	}

	public J9MemorySegmentListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MemorySegmentListPointer subOffset(long offset) {
		return J9MemorySegmentListPointer.cast(address - offset);
	}

	public J9MemorySegmentListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MemorySegmentListPointer untag(long mask) {
		return J9MemorySegmentListPointer.cast(address & ~mask);
	}

	public J9MemorySegmentListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MemorySegmentList.SIZEOF;
	}

	// Implementation methods

	// J9AVLTree avlTreeData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avlTreeDataOffset_", declaredType="J9AVLTree")
	public J9AVLTreePointer avlTreeData() throws CorruptDataException {
		return J9AVLTreePointer.cast(nonNullFieldEA(J9MemorySegmentList._avlTreeDataOffset_));
	}

	// J9AVLTree avlTreeData
	public PointerPointer avlTreeDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemorySegmentList._avlTreeDataOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemorySegmentList._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemorySegmentList._flagsOffset_));
	}

	// J9MemorySegment* nextSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer nextSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9MemorySegmentList._nextSegmentOffset_));
	}

	// J9MemorySegment* nextSegment
	public PointerPointer nextSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemorySegmentList._nextSegmentOffset_));
	}

	// omrthread_monitor_t segmentMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer segmentMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9MemorySegmentList._segmentMutexOffset_));
	}

	// omrthread_monitor_t segmentMutex
	public PointerPointer segmentMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemorySegmentList._segmentMutexOffset_));
	}

	// J9Pool* segmentPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer segmentPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9MemorySegmentList._segmentPoolOffset_));
	}

	// J9Pool* segmentPool
	public PointerPointer segmentPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemorySegmentList._segmentPoolOffset_));
	}

	// U64 totalSegmentSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSegmentSizeOffset_", declaredType="U64")
	public UDATA totalSegmentSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemorySegmentList._totalSegmentSizeOffset_));
	}

	// U64 totalSegmentSize
	public UDATAPointer totalSegmentSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemorySegmentList._totalSegmentSizeOffset_));
	}

}
