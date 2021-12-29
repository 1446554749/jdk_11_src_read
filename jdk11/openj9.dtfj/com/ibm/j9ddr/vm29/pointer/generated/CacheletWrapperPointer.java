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
 * Structure: CacheletWrapperPointer
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
 * The generated code will provide getters for all elements in the CacheletWrapperPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=CacheletWrapper.class)
public class CacheletWrapperPointer extends StructurePointer {

	// NULL
	public static final CacheletWrapperPointer NULL = new CacheletWrapperPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CacheletWrapperPointer(long address) {
		super(address);
	}

	public static CacheletWrapperPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CacheletWrapperPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CacheletWrapperPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CacheletWrapperPointer(address);
	}

	public CacheletWrapperPointer add(long count) {
		return CacheletWrapperPointer.cast(address + (CacheletWrapper.SIZEOF * count));
	}

	public CacheletWrapperPointer add(Scalar count) {
		return add(count.longValue());
	}

	public CacheletWrapperPointer addOffset(long offset) {
		return CacheletWrapperPointer.cast(address + offset);
	}

	public CacheletWrapperPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CacheletWrapperPointer sub(long count) {
		return CacheletWrapperPointer.cast(address - (CacheletWrapper.SIZEOF * count));
	}

	public CacheletWrapperPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CacheletWrapperPointer subOffset(long offset) {
		return CacheletWrapperPointer.cast(address - offset);
	}

	public CacheletWrapperPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CacheletWrapperPointer untag(long mask) {
		return CacheletWrapperPointer.cast(address & ~mask);
	}

	public CacheletWrapperPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return CacheletWrapper.SIZEOF;
	}

	// Implementation methods

	// UDATA dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataLengthOffset_", declaredType="UDATA")
	public UDATA dataLength() throws CorruptDataException {
		return getUDATAAtOffset(CacheletWrapper._dataLengthOffset_);
	}

	// UDATA dataLength
	public UDATAPointer dataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CacheletWrapper._dataLengthOffset_));
	}

	// I32 dataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataStartOffset_", declaredType="I32")
	public IDATA dataStart() throws CorruptDataException {
		return new I32(getIntAtOffset(CacheletWrapper._dataStartOffset_));
	}

	// I32 dataStart
	public IDATAPointer dataStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CacheletWrapper._dataStartOffset_));
	}

	// UDATA lastSegmentAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastSegmentAllocOffset_", declaredType="UDATA")
	public UDATA lastSegmentAlloc() throws CorruptDataException {
		return getUDATAAtOffset(CacheletWrapper._lastSegmentAllocOffset_);
	}

	// UDATA lastSegmentAlloc
	public UDATAPointer lastSegmentAllocEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CacheletWrapper._lastSegmentAllocOffset_));
	}

	// UDATA numHints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numHintsOffset_", declaredType="UDATA")
	public UDATA numHints() throws CorruptDataException {
		return getUDATAAtOffset(CacheletWrapper._numHintsOffset_);
	}

	// UDATA numHints
	public UDATAPointer numHintsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CacheletWrapper._numHintsOffset_));
	}

	// UDATA numSegments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numSegmentsOffset_", declaredType="UDATA")
	public UDATA numSegments() throws CorruptDataException {
		return getUDATAAtOffset(CacheletWrapper._numSegmentsOffset_);
	}

	// UDATA numSegments
	public UDATAPointer numSegmentsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CacheletWrapper._numSegmentsOffset_));
	}

	// UDATA segmentStartOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentStartOffsetOffset_", declaredType="UDATA")
	public UDATA segmentStartOffset() throws CorruptDataException {
		return getUDATAAtOffset(CacheletWrapper._segmentStartOffsetOffset_);
	}

	// UDATA segmentStartOffset
	public UDATAPointer segmentStartOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CacheletWrapper._segmentStartOffsetOffset_));
	}

}
