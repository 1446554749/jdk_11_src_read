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
 * Structure: J9NonHeapMemoryDataPointer
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
 * The generated code will provide getters for all elements in the J9NonHeapMemoryDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9NonHeapMemoryData.class)
public class J9NonHeapMemoryDataPointer extends StructurePointer {

	// NULL
	public static final J9NonHeapMemoryDataPointer NULL = new J9NonHeapMemoryDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9NonHeapMemoryDataPointer(long address) {
		super(address);
	}

	public static J9NonHeapMemoryDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9NonHeapMemoryDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9NonHeapMemoryDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9NonHeapMemoryDataPointer(address);
	}

	public J9NonHeapMemoryDataPointer add(long count) {
		return J9NonHeapMemoryDataPointer.cast(address + (J9NonHeapMemoryData.SIZEOF * count));
	}

	public J9NonHeapMemoryDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9NonHeapMemoryDataPointer addOffset(long offset) {
		return J9NonHeapMemoryDataPointer.cast(address + offset);
	}

	public J9NonHeapMemoryDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9NonHeapMemoryDataPointer sub(long count) {
		return J9NonHeapMemoryDataPointer.cast(address - (J9NonHeapMemoryData.SIZEOF * count));
	}

	public J9NonHeapMemoryDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9NonHeapMemoryDataPointer subOffset(long offset) {
		return J9NonHeapMemoryDataPointer.cast(address - offset);
	}

	public J9NonHeapMemoryDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9NonHeapMemoryDataPointer untag(long mask) {
		return J9NonHeapMemoryDataPointer.cast(address & ~mask);
	}

	public J9NonHeapMemoryDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9NonHeapMemoryData.SIZEOF;
	}

	// Implementation methods

	// U32 id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="U32")
	public UDATA id() throws CorruptDataException {
		return new U32(getIntAtOffset(J9NonHeapMemoryData._idOffset_));
	}

	// U32 id
	public UDATAPointer idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._idOffset_));
	}

	// U64 initialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialSizeOffset_", declaredType="U64")
	public UDATA initialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._initialSizeOffset_));
	}

	// U64 initialSize
	public UDATAPointer initialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._initialSizeOffset_));
	}

	// U64 maxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxSizeOffset_", declaredType="U64")
	public UDATA maxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._maxSizeOffset_));
	}

	// U64 maxSize
	public UDATAPointer maxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._maxSizeOffset_));
	}

	// U8[] name
	public U8Pointer nameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9NonHeapMemoryData._nameOffset_));
	}

	// U64 peakSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakSizeOffset_", declaredType="U64")
	public UDATA peakSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._peakSizeOffset_));
	}

	// U64 peakSize
	public UDATAPointer peakSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._peakSizeOffset_));
	}

	// U64 peakUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakUsedOffset_", declaredType="U64")
	public UDATA peakUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._peakUsedOffset_));
	}

	// U64 peakUsed
	public UDATAPointer peakUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._peakUsedOffset_));
	}

	// U64 postCollectionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionSizeOffset_", declaredType="U64")
	public UDATA postCollectionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._postCollectionSizeOffset_));
	}

	// U64 postCollectionSize
	public UDATAPointer postCollectionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._postCollectionSizeOffset_));
	}

	// U64 postCollectionUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionUsedOffset_", declaredType="U64")
	public UDATA postCollectionUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._postCollectionUsedOffset_));
	}

	// U64 postCollectionUsed
	public UDATAPointer postCollectionUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._postCollectionUsedOffset_));
	}

	// U64 preCollectionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionSizeOffset_", declaredType="U64")
	public UDATA preCollectionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._preCollectionSizeOffset_));
	}

	// U64 preCollectionSize
	public UDATAPointer preCollectionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._preCollectionSizeOffset_));
	}

	// U64 preCollectionUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionUsedOffset_", declaredType="U64")
	public UDATA preCollectionUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NonHeapMemoryData._preCollectionUsedOffset_));
	}

	// U64 preCollectionUsed
	public UDATAPointer preCollectionUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NonHeapMemoryData._preCollectionUsedOffset_));
	}

}
