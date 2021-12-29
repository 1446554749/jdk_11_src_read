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
 * Structure: OMR_TraceBufferPointer
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
 * The generated code will provide getters for all elements in the OMR_TraceBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_TraceBuffer.class)
public class OMR_TraceBufferPointer extends StructurePointer {

	// NULL
	public static final OMR_TraceBufferPointer NULL = new OMR_TraceBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_TraceBufferPointer(long address) {
		super(address);
	}

	public static OMR_TraceBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_TraceBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_TraceBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_TraceBufferPointer(address);
	}

	public OMR_TraceBufferPointer add(long count) {
		return OMR_TraceBufferPointer.cast(address + (OMR_TraceBuffer.SIZEOF * count));
	}

	public OMR_TraceBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_TraceBufferPointer addOffset(long offset) {
		return OMR_TraceBufferPointer.cast(address + offset);
	}

	public OMR_TraceBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_TraceBufferPointer sub(long count) {
		return OMR_TraceBufferPointer.cast(address - (OMR_TraceBuffer.SIZEOF * count));
	}

	public OMR_TraceBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_TraceBufferPointer subOffset(long offset) {
		return OMR_TraceBufferPointer.cast(address - offset);
	}

	public OMR_TraceBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_TraceBufferPointer untag(long mask) {
		return OMR_TraceBufferPointer.cast(address & ~mask);
	}

	public OMR_TraceBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_TraceBuffer.SIZEOF;
	}

	// Implementation methods

	// I32 bufferType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferTypeOffset_", declaredType="I32")
	public IDATA bufferType() throws CorruptDataException {
		return new I32(getIntAtOffset(OMR_TraceBuffer._bufferTypeOffset_));
	}

	// I32 bufferType
	public IDATAPointer bufferTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TraceBuffer._bufferTypeOffset_));
	}

	// volatile U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="volatile U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(OMR_TraceBuffer._flagsOffset_));
	}

	// volatile U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_TraceBuffer._flagsOffset_));
	}

	// OMR_TraceBuffer* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="OMR_TraceBuffer*")
	public OMR_TraceBufferPointer next() throws CorruptDataException {
		return OMR_TraceBufferPointer.cast(getPointerAtOffset(OMR_TraceBuffer._nextOffset_));
	}

	// OMR_TraceBuffer* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TraceBuffer._nextOffset_));
	}

	// UtTraceRecord record
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_recordOffset_", declaredType="UtTraceRecord")
	public UtTraceRecordPointer record() throws CorruptDataException {
		return UtTraceRecordPointer.cast(nonNullFieldEA(OMR_TraceBuffer._recordOffset_));
	}

	// UtTraceRecord record
	public PointerPointer recordEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TraceBuffer._recordOffset_));
	}

	// OMR_TraceThread* thr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrOffset_", declaredType="OMR_TraceThread*")
	public OMR_TraceThreadPointer thr() throws CorruptDataException {
		return OMR_TraceThreadPointer.cast(getPointerAtOffset(OMR_TraceBuffer._thrOffset_));
	}

	// OMR_TraceThread* thr
	public PointerPointer thrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TraceBuffer._thrOffset_));
	}

}
