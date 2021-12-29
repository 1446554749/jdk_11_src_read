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
 * Structure: UtTraceRecordPointer
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
 * The generated code will provide getters for all elements in the UtTraceRecordPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceRecord.class)
public class UtTraceRecordPointer extends StructurePointer {

	// NULL
	public static final UtTraceRecordPointer NULL = new UtTraceRecordPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceRecordPointer(long address) {
		super(address);
	}

	public static UtTraceRecordPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceRecordPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceRecordPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceRecordPointer(address);
	}

	public UtTraceRecordPointer add(long count) {
		return UtTraceRecordPointer.cast(address + (UtTraceRecord.SIZEOF * count));
	}

	public UtTraceRecordPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceRecordPointer addOffset(long offset) {
		return UtTraceRecordPointer.cast(address + offset);
	}

	public UtTraceRecordPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceRecordPointer sub(long count) {
		return UtTraceRecordPointer.cast(address - (UtTraceRecord.SIZEOF * count));
	}

	public UtTraceRecordPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceRecordPointer subOffset(long offset) {
		return UtTraceRecordPointer.cast(address - offset);
	}

	public UtTraceRecordPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceRecordPointer untag(long mask) {
		return UtTraceRecordPointer.cast(address & ~mask);
	}

	public UtTraceRecordPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceRecord.SIZEOF;
	}

	// Implementation methods

	// I32 firstEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstEntryOffset_", declaredType="I32")
	public IDATA firstEntry() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceRecord._firstEntryOffset_));
	}

	// I32 firstEntry
	public IDATAPointer firstEntryEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceRecord._firstEntryOffset_));
	}

	// I32 nextEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextEntryOffset_", declaredType="I32")
	public IDATA nextEntry() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceRecord._nextEntryOffset_));
	}

	// I32 nextEntry
	public IDATAPointer nextEntryEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceRecord._nextEntryOffset_));
	}

	// U64 sequence
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sequenceOffset_", declaredType="U64")
	public UDATA sequence() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._sequenceOffset_));
	}

	// U64 sequence
	public UDATAPointer sequenceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._sequenceOffset_));
	}

	// U64 threadId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadIdOffset_", declaredType="U64")
	public UDATA threadId() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._threadIdOffset_));
	}

	// U64 threadId
	public UDATAPointer threadIdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._threadIdOffset_));
	}

	// U8[] threadName
	public U8Pointer threadNameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(UtTraceRecord._threadNameOffset_));
	}

	// U64 threadSyn1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadSyn1Offset_", declaredType="U64")
	public UDATA threadSyn1() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._threadSyn1Offset_));
	}

	// U64 threadSyn1
	public UDATAPointer threadSyn1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._threadSyn1Offset_));
	}

	// U64 threadSyn2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadSyn2Offset_", declaredType="U64")
	public UDATA threadSyn2() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._threadSyn2Offset_));
	}

	// U64 threadSyn2
	public UDATAPointer threadSyn2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._threadSyn2Offset_));
	}

	// U64 wrapSequence
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_wrapSequenceOffset_", declaredType="U64")
	public UDATA wrapSequence() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._wrapSequenceOffset_));
	}

	// U64 wrapSequence
	public UDATAPointer wrapSequenceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._wrapSequenceOffset_));
	}

	// U64 writePlatform
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writePlatformOffset_", declaredType="U64")
	public UDATA writePlatform() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._writePlatformOffset_));
	}

	// U64 writePlatform
	public UDATAPointer writePlatformEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._writePlatformOffset_));
	}

	// U64 writeSystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeSystemOffset_", declaredType="U64")
	public UDATA writeSystem() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceRecord._writeSystemOffset_));
	}

	// U64 writeSystem
	public UDATAPointer writeSystemEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceRecord._writeSystemOffset_));
	}

}
