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
 * Structure: J9GarbageCollectorDataPointer
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
 * The generated code will provide getters for all elements in the J9GarbageCollectorDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9GarbageCollectorData.class)
public class J9GarbageCollectorDataPointer extends StructurePointer {

	// NULL
	public static final J9GarbageCollectorDataPointer NULL = new J9GarbageCollectorDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9GarbageCollectorDataPointer(long address) {
		super(address);
	}

	public static J9GarbageCollectorDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9GarbageCollectorDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9GarbageCollectorDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9GarbageCollectorDataPointer(address);
	}

	public J9GarbageCollectorDataPointer add(long count) {
		return J9GarbageCollectorDataPointer.cast(address + (J9GarbageCollectorData.SIZEOF * count));
	}

	public J9GarbageCollectorDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9GarbageCollectorDataPointer addOffset(long offset) {
		return J9GarbageCollectorDataPointer.cast(address + offset);
	}

	public J9GarbageCollectorDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9GarbageCollectorDataPointer sub(long count) {
		return J9GarbageCollectorDataPointer.cast(address - (J9GarbageCollectorData.SIZEOF * count));
	}

	public J9GarbageCollectorDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9GarbageCollectorDataPointer subOffset(long offset) {
		return J9GarbageCollectorDataPointer.cast(address - offset);
	}

	public J9GarbageCollectorDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9GarbageCollectorDataPointer untag(long mask) {
		return J9GarbageCollectorDataPointer.cast(address & ~mask);
	}

	public J9GarbageCollectorDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9GarbageCollectorData.SIZEOF;
	}

	// Implementation methods

	// U32 id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="U32")
	public UDATA id() throws CorruptDataException {
		return new U32(getIntAtOffset(J9GarbageCollectorData._idOffset_));
	}

	// U32 id
	public UDATAPointer idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectorData._idOffset_));
	}

	// J9GarbageCollectionInfo lastGcInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGcInfoOffset_", declaredType="J9GarbageCollectionInfo")
	public J9GarbageCollectionInfoPointer lastGcInfo() throws CorruptDataException {
		return J9GarbageCollectionInfoPointer.cast(nonNullFieldEA(J9GarbageCollectorData._lastGcInfoOffset_));
	}

	// J9GarbageCollectionInfo lastGcInfo
	public PointerPointer lastGcInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9GarbageCollectorData._lastGcInfoOffset_));
	}

	// U64 memoryUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryUsedOffset_", declaredType="U64")
	public UDATA memoryUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectorData._memoryUsedOffset_));
	}

	// U64 memoryUsed
	public UDATAPointer memoryUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectorData._memoryUsedOffset_));
	}

	// U8[] name
	public U8Pointer nameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9GarbageCollectorData._nameOffset_));
	}

	// U64 totalCompacts
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalCompactsOffset_", declaredType="U64")
	public UDATA totalCompacts() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectorData._totalCompactsOffset_));
	}

	// U64 totalCompacts
	public UDATAPointer totalCompactsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectorData._totalCompactsOffset_));
	}

	// U64 totalGCTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalGCTimeOffset_", declaredType="U64")
	public UDATA totalGCTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9GarbageCollectorData._totalGCTimeOffset_));
	}

	// U64 totalGCTime
	public UDATAPointer totalGCTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GarbageCollectorData._totalGCTimeOffset_));
	}

	// I64 totalMemoryFreed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalMemoryFreedOffset_", declaredType="I64")
	public IDATA totalMemoryFreed() throws CorruptDataException {
		return new I64(getLongAtOffset(J9GarbageCollectorData._totalMemoryFreedOffset_));
	}

	// I64 totalMemoryFreed
	public IDATAPointer totalMemoryFreedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9GarbageCollectorData._totalMemoryFreedOffset_));
	}

}
