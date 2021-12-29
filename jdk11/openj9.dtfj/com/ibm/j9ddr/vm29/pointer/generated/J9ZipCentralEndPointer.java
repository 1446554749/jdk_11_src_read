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
 * Structure: J9ZipCentralEndPointer
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
 * The generated code will provide getters for all elements in the J9ZipCentralEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ZipCentralEnd.class)
public class J9ZipCentralEndPointer extends StructurePointer {

	// NULL
	public static final J9ZipCentralEndPointer NULL = new J9ZipCentralEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ZipCentralEndPointer(long address) {
		super(address);
	}

	public static J9ZipCentralEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ZipCentralEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ZipCentralEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ZipCentralEndPointer(address);
	}

	public J9ZipCentralEndPointer add(long count) {
		return J9ZipCentralEndPointer.cast(address + (J9ZipCentralEnd.SIZEOF * count));
	}

	public J9ZipCentralEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ZipCentralEndPointer addOffset(long offset) {
		return J9ZipCentralEndPointer.cast(address + offset);
	}

	public J9ZipCentralEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ZipCentralEndPointer sub(long count) {
		return J9ZipCentralEndPointer.cast(address - (J9ZipCentralEnd.SIZEOF * count));
	}

	public J9ZipCentralEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ZipCentralEndPointer subOffset(long offset) {
		return J9ZipCentralEndPointer.cast(address - offset);
	}

	public J9ZipCentralEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ZipCentralEndPointer untag(long mask) {
		return J9ZipCentralEndPointer.cast(address & ~mask);
	}

	public J9ZipCentralEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ZipCentralEnd.SIZEOF;
	}

	// Implementation methods

	// U8* comment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commentOffset_", declaredType="U8*")
	public U8Pointer comment() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipCentralEnd._commentOffset_));
	}

	// U8* comment
	public PointerPointer commentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCentralEnd._commentOffset_));
	}

	// U16 commentLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commentLengthOffset_", declaredType="U16")
	public U16 commentLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipCentralEnd._commentLengthOffset_));
	}

	// U16 commentLength
	public U16Pointer commentLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipCentralEnd._commentLengthOffset_));
	}

	// U32 dirOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dirOffsetOffset_", declaredType="U32")
	public UDATA dirOffset() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipCentralEnd._dirOffsetOffset_));
	}

	// U32 dirOffset
	public UDATAPointer dirOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipCentralEnd._dirOffsetOffset_));
	}

	// U32 dirSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dirSizeOffset_", declaredType="U32")
	public UDATA dirSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipCentralEnd._dirSizeOffset_));
	}

	// U32 dirSize
	public UDATAPointer dirSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipCentralEnd._dirSizeOffset_));
	}

	// U16 dirStartDisk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dirStartDiskOffset_", declaredType="U16")
	public U16 dirStartDisk() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipCentralEnd._dirStartDiskOffset_));
	}

	// U16 dirStartDisk
	public U16Pointer dirStartDiskEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipCentralEnd._dirStartDiskOffset_));
	}

	// U16 diskNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_diskNumberOffset_", declaredType="U16")
	public U16 diskNumber() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipCentralEnd._diskNumberOffset_));
	}

	// U16 diskNumber
	public U16Pointer diskNumberEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipCentralEnd._diskNumberOffset_));
	}

	// U64 endCentralDirRecordPosition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endCentralDirRecordPositionOffset_", declaredType="U64")
	public UDATA endCentralDirRecordPosition() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ZipCentralEnd._endCentralDirRecordPositionOffset_));
	}

	// U64 endCentralDirRecordPosition
	public UDATAPointer endCentralDirRecordPositionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipCentralEnd._endCentralDirRecordPositionOffset_));
	}

	// U16 thisDiskEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thisDiskEntriesOffset_", declaredType="U16")
	public U16 thisDiskEntries() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipCentralEnd._thisDiskEntriesOffset_));
	}

	// U16 thisDiskEntries
	public U16Pointer thisDiskEntriesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipCentralEnd._thisDiskEntriesOffset_));
	}

	// U16 totalEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalEntriesOffset_", declaredType="U16")
	public U16 totalEntries() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipCentralEnd._totalEntriesOffset_));
	}

	// U16 totalEntries
	public U16Pointer totalEntriesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipCentralEnd._totalEntriesOffset_));
	}

}
