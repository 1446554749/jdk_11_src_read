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
 * Structure: J9ZipEntryPointer
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
 * The generated code will provide getters for all elements in the J9ZipEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ZipEntry.class)
public class J9ZipEntryPointer extends StructurePointer {

	// NULL
	public static final J9ZipEntryPointer NULL = new J9ZipEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ZipEntryPointer(long address) {
		super(address);
	}

	public static J9ZipEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ZipEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ZipEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ZipEntryPointer(address);
	}

	public J9ZipEntryPointer add(long count) {
		return J9ZipEntryPointer.cast(address + (J9ZipEntry.SIZEOF * count));
	}

	public J9ZipEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ZipEntryPointer addOffset(long offset) {
		return J9ZipEntryPointer.cast(address + offset);
	}

	public J9ZipEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ZipEntryPointer sub(long count) {
		return J9ZipEntryPointer.cast(address - (J9ZipEntry.SIZEOF * count));
	}

	public J9ZipEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ZipEntryPointer subOffset(long offset) {
		return J9ZipEntryPointer.cast(address - offset);
	}

	public J9ZipEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ZipEntryPointer untag(long mask) {
		return J9ZipEntryPointer.cast(address & ~mask);
	}

	public J9ZipEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ZipEntry.SIZEOF;
	}

	// Implementation methods

	// U32 compressedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressedSizeOffset_", declaredType="U32")
	public UDATA compressedSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._compressedSizeOffset_));
	}

	// U32 compressedSize
	public UDATAPointer compressedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._compressedSizeOffset_));
	}

	// U16 compressionMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressionMethodOffset_", declaredType="U16")
	public U16 compressionMethod() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._compressionMethodOffset_));
	}

	// U16 compressionMethod
	public U16Pointer compressionMethodEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._compressionMethodOffset_));
	}

	// U32 crc32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_crc32Offset_", declaredType="U32")
	public UDATA crc32() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._crc32Offset_));
	}

	// U32 crc32
	public UDATAPointer crc32EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._crc32Offset_));
	}

	// U8* data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataOffset_", declaredType="U8*")
	public U8Pointer data() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipEntry._dataOffset_));
	}

	// U8* data
	public PointerPointer dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipEntry._dataOffset_));
	}

	// U32 dataPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataPointerOffset_", declaredType="U32")
	public UDATA dataPointer() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._dataPointerOffset_));
	}

	// U32 dataPointer
	public UDATAPointer dataPointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._dataPointerOffset_));
	}

	// U8* extraField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraFieldOffset_", declaredType="U8*")
	public U8Pointer extraField() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipEntry._extraFieldOffset_));
	}

	// U8* extraField
	public PointerPointer extraFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipEntry._extraFieldOffset_));
	}

	// U16 extraFieldLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraFieldLengthOffset_", declaredType="U16")
	public U16 extraFieldLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._extraFieldLengthOffset_));
	}

	// U16 extraFieldLength
	public U16Pointer extraFieldLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._extraFieldLengthOffset_));
	}

	// U32 extraFieldPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraFieldPointerOffset_", declaredType="U32")
	public UDATA extraFieldPointer() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._extraFieldPointerOffset_));
	}

	// U32 extraFieldPointer
	public UDATAPointer extraFieldPointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._extraFieldPointerOffset_));
	}

	// U8* fileComment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileCommentOffset_", declaredType="U8*")
	public U8Pointer fileComment() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipEntry._fileCommentOffset_));
	}

	// U8* fileComment
	public PointerPointer fileCommentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipEntry._fileCommentOffset_));
	}

	// U16 fileCommentLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileCommentLengthOffset_", declaredType="U16")
	public U16 fileCommentLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._fileCommentLengthOffset_));
	}

	// U16 fileCommentLength
	public U16Pointer fileCommentLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._fileCommentLengthOffset_));
	}

	// I32 fileCommentPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileCommentPointerOffset_", declaredType="I32")
	public IDATA fileCommentPointer() throws CorruptDataException {
		return new I32(getIntAtOffset(J9ZipEntry._fileCommentPointerOffset_));
	}

	// I32 fileCommentPointer
	public IDATAPointer fileCommentPointerEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipEntry._fileCommentPointerOffset_));
	}

	// U8* filename
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filenameOffset_", declaredType="U8*")
	public U8Pointer filename() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ZipEntry._filenameOffset_));
	}

	// U8* filename
	public PointerPointer filenameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipEntry._filenameOffset_));
	}

	// U16 filenameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filenameLengthOffset_", declaredType="U16")
	public U16 filenameLength() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._filenameLengthOffset_));
	}

	// U16 filenameLength
	public U16Pointer filenameLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._filenameLengthOffset_));
	}

	// U32 filenamePointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filenamePointerOffset_", declaredType="U32")
	public UDATA filenamePointer() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._filenamePointerOffset_));
	}

	// U32 filenamePointer
	public UDATAPointer filenamePointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._filenamePointerOffset_));
	}

	// U16 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U16")
	public U16 flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._flagsOffset_));
	}

	// U16 flags
	public U16Pointer flagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._flagsOffset_));
	}

	// U16 internalAttributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalAttributesOffset_", declaredType="U16")
	public U16 internalAttributes() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._internalAttributesOffset_));
	}

	// U16 internalAttributes
	public U16Pointer internalAttributesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._internalAttributesOffset_));
	}

	// U8[] internalFilename
	public U8Pointer internalFilenameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ZipEntry._internalFilenameOffset_));
	}

	// U16 lastModDate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastModDateOffset_", declaredType="U16")
	public U16 lastModDate() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._lastModDateOffset_));
	}

	// U16 lastModDate
	public U16Pointer lastModDateEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._lastModDateOffset_));
	}

	// U16 lastModTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastModTimeOffset_", declaredType="U16")
	public U16 lastModTime() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._lastModTimeOffset_));
	}

	// U16 lastModTime
	public U16Pointer lastModTimeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._lastModTimeOffset_));
	}

	// U32 uncompressedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uncompressedSizeOffset_", declaredType="U32")
	public UDATA uncompressedSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ZipEntry._uncompressedSizeOffset_));
	}

	// U32 uncompressedSize
	public UDATAPointer uncompressedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipEntry._uncompressedSizeOffset_));
	}

	// U16 versionCreated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionCreatedOffset_", declaredType="U16")
	public U16 versionCreated() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._versionCreatedOffset_));
	}

	// U16 versionCreated
	public U16Pointer versionCreatedEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._versionCreatedOffset_));
	}

	// U16 versionNeeded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionNeededOffset_", declaredType="U16")
	public U16 versionNeeded() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ZipEntry._versionNeededOffset_));
	}

	// U16 versionNeeded
	public U16Pointer versionNeededEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ZipEntry._versionNeededOffset_));
	}

}
