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
 * Structure: J9ZipCacheEntryPointer
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
 * The generated code will provide getters for all elements in the J9ZipCacheEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ZipCacheEntry.class)
public class J9ZipCacheEntryPointer extends StructurePointer {

	// NULL
	public static final J9ZipCacheEntryPointer NULL = new J9ZipCacheEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ZipCacheEntryPointer(long address) {
		super(address);
	}

	public static J9ZipCacheEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ZipCacheEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ZipCacheEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ZipCacheEntryPointer(address);
	}

	public J9ZipCacheEntryPointer add(long count) {
		return J9ZipCacheEntryPointer.cast(address + (J9ZipCacheEntry.SIZEOF * count));
	}

	public J9ZipCacheEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ZipCacheEntryPointer addOffset(long offset) {
		return J9ZipCacheEntryPointer.cast(address + offset);
	}

	public J9ZipCacheEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ZipCacheEntryPointer sub(long count) {
		return J9ZipCacheEntryPointer.cast(address - (J9ZipCacheEntry.SIZEOF * count));
	}

	public J9ZipCacheEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ZipCacheEntryPointer subOffset(long offset) {
		return J9ZipCacheEntryPointer.cast(address - offset);
	}

	public J9ZipCacheEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ZipCacheEntryPointer untag(long mask) {
		return J9ZipCacheEntryPointer.cast(address & ~mask);
	}

	public J9ZipCacheEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ZipCacheEntry.SIZEOF;
	}

	// Implementation methods

	// IDATA chunkActiveDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_chunkActiveDirOffset_", declaredType="IDATA")
	public IDATA chunkActiveDir() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCacheEntry._chunkActiveDirOffset_);
	}

	// IDATA chunkActiveDir
	public IDATAPointer chunkActiveDirEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._chunkActiveDirOffset_));
	}

	// IDATA currentChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentChunkOffset_", declaredType="IDATA")
	public IDATA currentChunk() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCacheEntry._currentChunkOffset_);
	}

	// IDATA currentChunk
	public IDATAPointer currentChunkEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._currentChunkOffset_));
	}

	// J9ZipDirEntry root
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootOffset_", declaredType="J9ZipDirEntry")
	public J9ZipDirEntryPointer root() throws CorruptDataException {
		return J9ZipDirEntryPointer.cast(nonNullFieldEA(J9ZipCacheEntry._rootOffset_));
	}

	// J9ZipDirEntry root
	public PointerPointer rootEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheEntry._rootOffset_));
	}

	// IDATA startCentralDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startCentralDirOffset_", declaredType="IDATA")
	public IDATA startCentralDir() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCacheEntry._startCentralDirOffset_);
	}

	// IDATA startCentralDir
	public IDATAPointer startCentralDirEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._startCentralDirOffset_));
	}

	// IDATA zipFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipFileNameOffset_", declaredType="IDATA")
	public IDATA zipFileName() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCacheEntry._zipFileNameOffset_);
	}

	// IDATA zipFileName
	public IDATAPointer zipFileNameEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._zipFileNameOffset_));
	}

	// IDATA zipFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipFileSizeOffset_", declaredType="IDATA")
	public IDATA zipFileSize() throws CorruptDataException {
		return getIDATAAtOffset(J9ZipCacheEntry._zipFileSizeOffset_);
	}

	// IDATA zipFileSize
	public IDATAPointer zipFileSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._zipFileSizeOffset_));
	}

	// I64 zipTimeStamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipTimeStampOffset_", declaredType="I64")
	public IDATA zipTimeStamp() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ZipCacheEntry._zipTimeStampOffset_));
	}

	// I64 zipTimeStamp
	public IDATAPointer zipTimeStampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ZipCacheEntry._zipTimeStampOffset_));
	}

}
