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
 * Structure: J9MemoryPoolDataPointer
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
 * The generated code will provide getters for all elements in the J9MemoryPoolDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MemoryPoolData.class)
public class J9MemoryPoolDataPointer extends StructurePointer {

	// NULL
	public static final J9MemoryPoolDataPointer NULL = new J9MemoryPoolDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MemoryPoolDataPointer(long address) {
		super(address);
	}

	public static J9MemoryPoolDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MemoryPoolDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MemoryPoolDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MemoryPoolDataPointer(address);
	}

	public J9MemoryPoolDataPointer add(long count) {
		return J9MemoryPoolDataPointer.cast(address + (J9MemoryPoolData.SIZEOF * count));
	}

	public J9MemoryPoolDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MemoryPoolDataPointer addOffset(long offset) {
		return J9MemoryPoolDataPointer.cast(address + offset);
	}

	public J9MemoryPoolDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MemoryPoolDataPointer sub(long count) {
		return J9MemoryPoolDataPointer.cast(address - (J9MemoryPoolData.SIZEOF * count));
	}

	public J9MemoryPoolDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MemoryPoolDataPointer subOffset(long offset) {
		return J9MemoryPoolDataPointer.cast(address - offset);
	}

	public J9MemoryPoolDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MemoryPoolDataPointer untag(long mask) {
		return J9MemoryPoolDataPointer.cast(address & ~mask);
	}

	public J9MemoryPoolDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MemoryPoolData.SIZEOF;
	}

	// Implementation methods

	// U64 collectionUsageThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_collectionUsageThresholdOffset_", declaredType="U64")
	public UDATA collectionUsageThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._collectionUsageThresholdOffset_));
	}

	// U64 collectionUsageThreshold
	public UDATAPointer collectionUsageThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._collectionUsageThresholdOffset_));
	}

	// U64 collectionUsageThresholdCrossedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_collectionUsageThresholdCrossedCountOffset_", declaredType="U64")
	public UDATA collectionUsageThresholdCrossedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._collectionUsageThresholdCrossedCountOffset_));
	}

	// U64 collectionUsageThresholdCrossedCount
	public UDATAPointer collectionUsageThresholdCrossedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._collectionUsageThresholdCrossedCountOffset_));
	}

	// U32 id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="U32")
	public UDATA id() throws CorruptDataException {
		return new U32(getIntAtOffset(J9MemoryPoolData._idOffset_));
	}

	// U32 id
	public UDATAPointer idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._idOffset_));
	}

	// U64 initialSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialSizeOffset_", declaredType="U64")
	public UDATA initialSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._initialSizeOffset_));
	}

	// U64 initialSize
	public UDATAPointer initialSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._initialSizeOffset_));
	}

	// U8[] name
	public U8Pointer nameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9MemoryPoolData._nameOffset_));
	}

	// U32 notificationState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationStateOffset_", declaredType="U32")
	public UDATA notificationState() throws CorruptDataException {
		return new U32(getIntAtOffset(J9MemoryPoolData._notificationStateOffset_));
	}

	// U32 notificationState
	public UDATAPointer notificationStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._notificationStateOffset_));
	}

	// U64 peakMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakMaxOffset_", declaredType="U64")
	public UDATA peakMax() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._peakMaxOffset_));
	}

	// U64 peakMax
	public UDATAPointer peakMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._peakMaxOffset_));
	}

	// U64 peakSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakSizeOffset_", declaredType="U64")
	public UDATA peakSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._peakSizeOffset_));
	}

	// U64 peakSize
	public UDATAPointer peakSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._peakSizeOffset_));
	}

	// U64 peakUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakUsedOffset_", declaredType="U64")
	public UDATA peakUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._peakUsedOffset_));
	}

	// U64 peakUsed
	public UDATAPointer peakUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._peakUsedOffset_));
	}

	// U64 postCollectionMaxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionMaxSizeOffset_", declaredType="U64")
	public UDATA postCollectionMaxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._postCollectionMaxSizeOffset_));
	}

	// U64 postCollectionMaxSize
	public UDATAPointer postCollectionMaxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._postCollectionMaxSizeOffset_));
	}

	// U64 postCollectionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionSizeOffset_", declaredType="U64")
	public UDATA postCollectionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._postCollectionSizeOffset_));
	}

	// U64 postCollectionSize
	public UDATAPointer postCollectionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._postCollectionSizeOffset_));
	}

	// U64 postCollectionUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionUsedOffset_", declaredType="U64")
	public UDATA postCollectionUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._postCollectionUsedOffset_));
	}

	// U64 postCollectionUsed
	public UDATAPointer postCollectionUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._postCollectionUsedOffset_));
	}

	// U64 preCollectionMaxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionMaxSizeOffset_", declaredType="U64")
	public UDATA preCollectionMaxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._preCollectionMaxSizeOffset_));
	}

	// U64 preCollectionMaxSize
	public UDATAPointer preCollectionMaxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._preCollectionMaxSizeOffset_));
	}

	// U64 preCollectionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionSizeOffset_", declaredType="U64")
	public UDATA preCollectionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._preCollectionSizeOffset_));
	}

	// U64 preCollectionSize
	public UDATAPointer preCollectionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._preCollectionSizeOffset_));
	}

	// U64 preCollectionUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionUsedOffset_", declaredType="U64")
	public UDATA preCollectionUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._preCollectionUsedOffset_));
	}

	// U64 preCollectionUsed
	public UDATAPointer preCollectionUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._preCollectionUsedOffset_));
	}

	// U64 usageThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usageThresholdOffset_", declaredType="U64")
	public UDATA usageThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._usageThresholdOffset_));
	}

	// U64 usageThreshold
	public UDATAPointer usageThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._usageThresholdOffset_));
	}

	// U64 usageThresholdCrossedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usageThresholdCrossedCountOffset_", declaredType="U64")
	public UDATA usageThresholdCrossedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryPoolData._usageThresholdCrossedCountOffset_));
	}

	// U64 usageThresholdCrossedCount
	public UDATAPointer usageThresholdCrossedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryPoolData._usageThresholdCrossedCountOffset_));
	}

}
