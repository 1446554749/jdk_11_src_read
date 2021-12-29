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
 * Structure: OSCache_header2Pointer
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
 * The generated code will provide getters for all elements in the OSCache_header2Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OSCache_header2.class)
public class OSCache_header2Pointer extends StructurePointer {

	// NULL
	public static final OSCache_header2Pointer NULL = new OSCache_header2Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OSCache_header2Pointer(long address) {
		super(address);
	}

	public static OSCache_header2Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OSCache_header2Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OSCache_header2Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OSCache_header2Pointer(address);
	}

	public OSCache_header2Pointer add(long count) {
		return OSCache_header2Pointer.cast(address + (OSCache_header2.SIZEOF * count));
	}

	public OSCache_header2Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public OSCache_header2Pointer addOffset(long offset) {
		return OSCache_header2Pointer.cast(address + offset);
	}

	public OSCache_header2Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OSCache_header2Pointer sub(long count) {
		return OSCache_header2Pointer.cast(address - (OSCache_header2.SIZEOF * count));
	}

	public OSCache_header2Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OSCache_header2Pointer subOffset(long offset) {
		return OSCache_header2Pointer.cast(address - offset);
	}

	public OSCache_header2Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OSCache_header2Pointer untag(long mask) {
		return OSCache_header2Pointer.cast(address & ~mask);
	}

	public OSCache_header2Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OSCache_header2.SIZEOF;
	}

	// Implementation methods

	// U64 buildID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buildIDOffset_", declaredType="U64")
	public UDATA buildID() throws CorruptDataException {
		return new U64(getLongAtOffset(OSCache_header2._buildIDOffset_));
	}

	// U64 buildID
	public UDATAPointer buildIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._buildIDOffset_));
	}

	// U32 cacheInitComplete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheInitCompleteOffset_", declaredType="U32")
	public UDATA cacheInitComplete() throws CorruptDataException {
		return new U32(getIntAtOffset(OSCache_header2._cacheInitCompleteOffset_));
	}

	// U32 cacheInitComplete
	public UDATAPointer cacheInitCompleteEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._cacheInitCompleteOffset_));
	}

	// U64 createTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createTimeOffset_", declaredType="U64")
	public UDATA createTime() throws CorruptDataException {
		return new U64(getLongAtOffset(OSCache_header2._createTimeOffset_));
	}

	// U64 createTime
	public UDATAPointer createTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._createTimeOffset_));
	}

	// U32 dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataLengthOffset_", declaredType="U32")
	public UDATA dataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(OSCache_header2._dataLengthOffset_));
	}

	// U32 dataLength
	public UDATAPointer dataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._dataLengthOffset_));
	}

	// J9SRP dataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataStartOffset_", declaredType="J9SRP")
	public VoidPointer dataStart() throws CorruptDataException {
		long nextAddress = getIntAtOffset(OSCache_header2._dataStartOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (OSCache_header2._dataStartOffset_ + nextAddress));
	}

	// J9SRP dataStart
	public SelfRelativePointer dataStartEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(OSCache_header2._dataStartOffset_));
	}

	// U32 generation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_generationOffset_", declaredType="U32")
	public UDATA generation() throws CorruptDataException {
		return new U32(getIntAtOffset(OSCache_header2._generationOffset_));
	}

	// U32 generation
	public UDATAPointer generationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._generationOffset_));
	}

	// U32 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U32")
	public UDATA size() throws CorruptDataException {
		return new U32(getIntAtOffset(OSCache_header2._sizeOffset_));
	}

	// U32 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OSCache_header2._sizeOffset_));
	}

	// U32[] unused32
	public UDATAPointer unused32EA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(OSCache_header2._unused32Offset_));
	}

	// U64[] unused64
	public UDATAPointer unused64EA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(OSCache_header2._unused64Offset_));
	}

	// J9PortShcVersion versionData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionDataOffset_", declaredType="J9PortShcVersion")
	public J9PortShcVersionPointer versionData() throws CorruptDataException {
		return J9PortShcVersionPointer.cast(nonNullFieldEA(OSCache_header2._versionDataOffset_));
	}

	// J9PortShcVersion versionData
	public PointerPointer versionDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OSCache_header2._versionDataOffset_));
	}

}
