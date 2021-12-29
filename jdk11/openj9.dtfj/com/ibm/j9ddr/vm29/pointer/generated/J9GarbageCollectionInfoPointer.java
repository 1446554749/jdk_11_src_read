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
 * Structure: J9GarbageCollectionInfoPointer
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
 * The generated code will provide getters for all elements in the J9GarbageCollectionInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9GarbageCollectionInfo.class)
public class J9GarbageCollectionInfoPointer extends StructurePointer {

	// NULL
	public static final J9GarbageCollectionInfoPointer NULL = new J9GarbageCollectionInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9GarbageCollectionInfoPointer(long address) {
		super(address);
	}

	public static J9GarbageCollectionInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9GarbageCollectionInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9GarbageCollectionInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9GarbageCollectionInfoPointer(address);
	}

	public J9GarbageCollectionInfoPointer add(long count) {
		return J9GarbageCollectionInfoPointer.cast(address + (J9GarbageCollectionInfo.SIZEOF * count));
	}

	public J9GarbageCollectionInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9GarbageCollectionInfoPointer addOffset(long offset) {
		return J9GarbageCollectionInfoPointer.cast(address + offset);
	}

	public J9GarbageCollectionInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9GarbageCollectionInfoPointer sub(long count) {
		return J9GarbageCollectionInfoPointer.cast(address - (J9GarbageCollectionInfo.SIZEOF * count));
	}

	public J9GarbageCollectionInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9GarbageCollectionInfoPointer subOffset(long offset) {
		return J9GarbageCollectionInfoPointer.cast(address - offset);
	}

	public J9GarbageCollectionInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9GarbageCollectionInfoPointer untag(long mask) {
		return J9GarbageCollectionInfoPointer.cast(address & ~mask);
	}

	public J9GarbageCollectionInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9GarbageCollectionInfo.SIZEOF;
	}

	// Implementation methods

	// U32 arraySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arraySizeOffset_", declaredType="U32")
	public UDATA arraySize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9GarbageCollectionInfo._arraySizeOffset_));
	}

	// U32 arraySize
	public UDATAPointer arraySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._arraySizeOffset_));
	}

	// U64 endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endTimeOffset_", declaredType="U64")
	public UDATA endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectionInfo._endTimeOffset_));
	}

	// U64 endTime
	public UDATAPointer endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._endTimeOffset_));
	}

	// const U8* gcAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcActionOffset_", declaredType="const U8*")
	public U8Pointer gcAction() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9GarbageCollectionInfo._gcActionOffset_));
	}

	// const U8* gcAction
	public PointerPointer gcActionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._gcActionOffset_));
	}

	// const U8* gcCause
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCauseOffset_", declaredType="const U8*")
	public U8Pointer gcCause() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9GarbageCollectionInfo._gcCauseOffset_));
	}

	// const U8* gcCause
	public PointerPointer gcCauseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._gcCauseOffset_));
	}

	// U32 gcID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcIDOffset_", declaredType="U32")
	public UDATA gcID() throws CorruptDataException {
		return new U32(getIntAtOffset(J9GarbageCollectionInfo._gcIDOffset_));
	}

	// U32 gcID
	public UDATAPointer gcIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._gcIDOffset_));
	}

	// U64 index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexOffset_", declaredType="U64")
	public UDATA index() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectionInfo._indexOffset_));
	}

	// U64 index
	public UDATAPointer indexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._indexOffset_));
	}

	// U64[] initialSize
	public UDATAPointer initialSizeEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._initialSizeOffset_));
	}

	// U64[] postCommitted
	public UDATAPointer postCommittedEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._postCommittedOffset_));
	}

	// I64[] postMax
	public IDATAPointer postMaxEA() throws CorruptDataException {
		return I64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._postMaxOffset_));
	}

	// U64[] postUsed
	public UDATAPointer postUsedEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._postUsedOffset_));
	}

	// U64[] preCommitted
	public UDATAPointer preCommittedEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._preCommittedOffset_));
	}

	// I64[] preMax
	public IDATAPointer preMaxEA() throws CorruptDataException {
		return I64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._preMaxOffset_));
	}

	// U64[] preUsed
	public UDATAPointer preUsedEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._preUsedOffset_));
	}

	// U64 startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTimeOffset_", declaredType="U64")
	public UDATA startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectionInfo._startTimeOffset_));
	}

	// U64 startTime
	public UDATAPointer startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectionInfo._startTimeOffset_));
	}

}
