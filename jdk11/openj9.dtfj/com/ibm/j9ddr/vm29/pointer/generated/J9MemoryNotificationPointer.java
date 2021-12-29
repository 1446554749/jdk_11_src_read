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
 * Structure: J9MemoryNotificationPointer
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
 * The generated code will provide getters for all elements in the J9MemoryNotificationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MemoryNotification.class)
public class J9MemoryNotificationPointer extends StructurePointer {

	// NULL
	public static final J9MemoryNotificationPointer NULL = new J9MemoryNotificationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MemoryNotificationPointer(long address) {
		super(address);
	}

	public static J9MemoryNotificationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MemoryNotificationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MemoryNotificationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MemoryNotificationPointer(address);
	}

	public J9MemoryNotificationPointer add(long count) {
		return J9MemoryNotificationPointer.cast(address + (J9MemoryNotification.SIZEOF * count));
	}

	public J9MemoryNotificationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MemoryNotificationPointer addOffset(long offset) {
		return J9MemoryNotificationPointer.cast(address + offset);
	}

	public J9MemoryNotificationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MemoryNotificationPointer sub(long count) {
		return J9MemoryNotificationPointer.cast(address - (J9MemoryNotification.SIZEOF * count));
	}

	public J9MemoryNotificationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MemoryNotificationPointer subOffset(long offset) {
		return J9MemoryNotificationPointer.cast(address - offset);
	}

	public J9MemoryNotificationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MemoryNotificationPointer untag(long mask) {
		return J9MemoryNotificationPointer.cast(address & ~mask);
	}

	public J9MemoryNotificationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MemoryNotification.SIZEOF;
	}

	// Implementation methods

	// J9GarbageCollectionInfo* gcInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcInfoOffset_", declaredType="J9GarbageCollectionInfo*")
	public J9GarbageCollectionInfoPointer gcInfo() throws CorruptDataException {
		return J9GarbageCollectionInfoPointer.cast(getPointerAtOffset(J9MemoryNotification._gcInfoOffset_));
	}

	// J9GarbageCollectionInfo* gcInfo
	public PointerPointer gcInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryNotification._gcInfoOffset_));
	}

	// J9MemoryNotification* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9MemoryNotification*")
	public J9MemoryNotificationPointer next() throws CorruptDataException {
		return J9MemoryNotificationPointer.cast(getPointerAtOffset(J9MemoryNotification._nextOffset_));
	}

	// J9MemoryNotification* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryNotification._nextOffset_));
	}

	// U64 sequenceNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sequenceNumberOffset_", declaredType="U64")
	public UDATA sequenceNumber() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryNotification._sequenceNumberOffset_));
	}

	// U64 sequenceNumber
	public UDATAPointer sequenceNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryNotification._sequenceNumberOffset_));
	}

	// UDATA type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="UDATA")
	public UDATA type() throws CorruptDataException {
		return getUDATAAtOffset(J9MemoryNotification._typeOffset_);
	}

	// UDATA type
	public UDATAPointer typeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryNotification._typeOffset_));
	}

	// memoryPoolUsageThreshold* usageThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usageThresholdOffset_", declaredType="memoryPoolUsageThreshold*")
	public memoryPoolUsageThresholdPointer usageThreshold() throws CorruptDataException {
		return memoryPoolUsageThresholdPointer.cast(getPointerAtOffset(J9MemoryNotification._usageThresholdOffset_));
	}

	// memoryPoolUsageThreshold* usageThreshold
	public PointerPointer usageThresholdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MemoryNotification._usageThresholdOffset_));
	}

}
