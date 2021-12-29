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
 * Structure: J9ZipCacheTraversalPointer
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
 * The generated code will provide getters for all elements in the J9ZipCacheTraversalPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ZipCacheTraversal.class)
public class J9ZipCacheTraversalPointer extends StructurePointer {

	// NULL
	public static final J9ZipCacheTraversalPointer NULL = new J9ZipCacheTraversalPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ZipCacheTraversalPointer(long address) {
		super(address);
	}

	public static J9ZipCacheTraversalPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ZipCacheTraversalPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ZipCacheTraversalPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ZipCacheTraversalPointer(address);
	}

	public J9ZipCacheTraversalPointer add(long count) {
		return J9ZipCacheTraversalPointer.cast(address + (J9ZipCacheTraversal.SIZEOF * count));
	}

	public J9ZipCacheTraversalPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ZipCacheTraversalPointer addOffset(long offset) {
		return J9ZipCacheTraversalPointer.cast(address + offset);
	}

	public J9ZipCacheTraversalPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ZipCacheTraversalPointer sub(long count) {
		return J9ZipCacheTraversalPointer.cast(address - (J9ZipCacheTraversal.SIZEOF * count));
	}

	public J9ZipCacheTraversalPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ZipCacheTraversalPointer subOffset(long offset) {
		return J9ZipCacheTraversalPointer.cast(address - offset);
	}

	public J9ZipCacheTraversalPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ZipCacheTraversalPointer untag(long mask) {
		return J9ZipCacheTraversalPointer.cast(address & ~mask);
	}

	public J9ZipCacheTraversalPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ZipCacheTraversal.SIZEOF;
	}

	// Implementation methods

	// J9ZipDirEntry* dirEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dirEntryOffset_", declaredType="J9ZipDirEntry*")
	public J9ZipDirEntryPointer dirEntry() throws CorruptDataException {
		return J9ZipDirEntryPointer.cast(getPointerAtOffset(J9ZipCacheTraversal._dirEntryOffset_));
	}

	// J9ZipDirEntry* dirEntry
	public PointerPointer dirEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._dirEntryOffset_));
	}

	// J9ZipFileRecord* fileRecord
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileRecordOffset_", declaredType="J9ZipFileRecord*")
	public J9ZipFileRecordPointer fileRecord() throws CorruptDataException {
		return J9ZipFileRecordPointer.cast(getPointerAtOffset(J9ZipCacheTraversal._fileRecordOffset_));
	}

	// J9ZipFileRecord* fileRecord
	public PointerPointer fileRecordEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._fileRecordOffset_));
	}

	// J9ZipFileEntry* fileRecordEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileRecordEntryOffset_", declaredType="J9ZipFileEntry*")
	public J9ZipFileEntryPointer fileRecordEntry() throws CorruptDataException {
		return J9ZipFileEntryPointer.cast(getPointerAtOffset(J9ZipCacheTraversal._fileRecordEntryOffset_));
	}

	// J9ZipFileEntry* fileRecordEntry
	public PointerPointer fileRecordEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._fileRecordEntryOffset_));
	}

	// UDATA fileRecordPos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileRecordPosOffset_", declaredType="UDATA")
	public UDATA fileRecordPos() throws CorruptDataException {
		return getUDATAAtOffset(J9ZipCacheTraversal._fileRecordPosOffset_);
	}

	// UDATA fileRecordPos
	public UDATAPointer fileRecordPosEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._fileRecordPosOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9ZipCacheTraversal._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._portLibOffset_));
	}

	// J9ZipCache* zipCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCacheOffset_", declaredType="J9ZipCache*")
	public J9ZipCachePointer zipCache() throws CorruptDataException {
		return J9ZipCachePointer.cast(getPointerAtOffset(J9ZipCacheTraversal._zipCacheOffset_));
	}

	// J9ZipCache* zipCache
	public PointerPointer zipCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ZipCacheTraversal._zipCacheOffset_));
	}

}
