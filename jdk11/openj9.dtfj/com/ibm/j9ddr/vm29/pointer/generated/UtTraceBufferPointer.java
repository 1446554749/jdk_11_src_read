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
 * Structure: UtTraceBufferPointer
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
 * The generated code will provide getters for all elements in the UtTraceBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceBuffer.class)
public class UtTraceBufferPointer extends StructurePointer {

	// NULL
	public static final UtTraceBufferPointer NULL = new UtTraceBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceBufferPointer(long address) {
		super(address);
	}

	public static UtTraceBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceBufferPointer(address);
	}

	public UtTraceBufferPointer add(long count) {
		return UtTraceBufferPointer.cast(address + (UtTraceBuffer.SIZEOF * count));
	}

	public UtTraceBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceBufferPointer addOffset(long offset) {
		return UtTraceBufferPointer.cast(address + offset);
	}

	public UtTraceBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceBufferPointer sub(long count) {
		return UtTraceBufferPointer.cast(address - (UtTraceBuffer.SIZEOF * count));
	}

	public UtTraceBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceBufferPointer subOffset(long offset) {
		return UtTraceBufferPointer.cast(address - offset);
	}

	public UtTraceBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceBufferPointer untag(long mask) {
		return UtTraceBufferPointer.cast(address & ~mask);
	}

	public UtTraceBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceBuffer.SIZEOF;
	}

	// Implementation methods

	// I32 bufferType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferTypeOffset_", declaredType="I32")
	public IDATA bufferType() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceBuffer._bufferTypeOffset_));
	}

	// I32 bufferType
	public IDATAPointer bufferTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceBuffer._bufferTypeOffset_));
	}

	// volatile I32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="volatile I32")
	public IDATA flags() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceBuffer._flagsOffset_));
	}

	// volatile I32 flags
	public IDATAPointer flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceBuffer._flagsOffset_));
	}

	// UtTraceBuffer* globalNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalNextOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer globalNext() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtTraceBuffer._globalNextOffset_));
	}

	// UtTraceBuffer* globalNext
	public PointerPointer globalNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._globalNextOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtTraceBuffer._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._headerOffset_));
	}

	// volatile I32 lostCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lostCountOffset_", declaredType="volatile I32")
	public IDATA lostCount() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceBuffer._lostCountOffset_));
	}

	// volatile I32 lostCount
	public IDATAPointer lostCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceBuffer._lostCountOffset_));
	}

	// UtTraceBuffer* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer next() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtTraceBuffer._nextOffset_));
	}

	// UtTraceBuffer* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._nextOffset_));
	}

	// qMessage queueData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queueDataOffset_", declaredType="qMessage")
	public messagePointer queueData() throws CorruptDataException {
		return messagePointer.cast(nonNullFieldEA(UtTraceBuffer._queueDataOffset_));
	}

	// qMessage queueData
	public PointerPointer queueDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._queueDataOffset_));
	}

	// UtTraceRecord record
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_recordOffset_", declaredType="UtTraceRecord")
	public UtTraceRecordPointer record() throws CorruptDataException {
		return UtTraceRecordPointer.cast(nonNullFieldEA(UtTraceBuffer._recordOffset_));
	}

	// UtTraceRecord record
	public PointerPointer recordEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._recordOffset_));
	}

	// void** thr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrOffset_", declaredType="void**")
	public PointerPointer thr() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(UtTraceBuffer._thrOffset_));
	}

	// void** thr
	public PointerPointer thrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._thrOffset_));
	}

	// UtTraceBuffer* writeNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeNextOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer writeNext() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtTraceBuffer._writeNextOffset_));
	}

	// UtTraceBuffer* writeNext
	public PointerPointer writeNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceBuffer._writeNextOffset_));
	}

}
