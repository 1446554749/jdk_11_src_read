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
 * Structure: J9FileStatPointer
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
 * The generated code will provide getters for all elements in the J9FileStatPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9FileStat.class)
public class J9FileStatPointer extends StructurePointer {

	// NULL
	public static final J9FileStatPointer NULL = new J9FileStatPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9FileStatPointer(long address) {
		super(address);
	}

	public static J9FileStatPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9FileStatPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9FileStatPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9FileStatPointer(address);
	}

	public J9FileStatPointer add(long count) {
		return J9FileStatPointer.cast(address + (J9FileStat.SIZEOF * count));
	}

	public J9FileStatPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9FileStatPointer addOffset(long offset) {
		return J9FileStatPointer.cast(address + offset);
	}

	public J9FileStatPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9FileStatPointer sub(long count) {
		return J9FileStatPointer.cast(address - (J9FileStat.SIZEOF * count));
	}

	public J9FileStatPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9FileStatPointer subOffset(long offset) {
		return J9FileStatPointer.cast(address - offset);
	}

	public J9FileStatPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9FileStatPointer untag(long mask) {
		return J9FileStatPointer.cast(address & ~mask);
	}

	public J9FileStatPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9FileStat.SIZEOF;
	}

	// Implementation methods

	// U32:1 isDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isDirOffset_", declaredType="U32:1")
	public UDATA isDir() throws CorruptDataException {
		return getU32Bitfield(J9FileStat._isDir_s_, J9FileStat._isDir_b_);
	}

	// U32:1 isFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isFileOffset_", declaredType="U32:1")
	public UDATA isFile() throws CorruptDataException {
		return getU32Bitfield(J9FileStat._isFile_s_, J9FileStat._isFile_b_);
	}

	// U32:1 isFixed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isFixedOffset_", declaredType="U32:1")
	public UDATA isFixed() throws CorruptDataException {
		return getU32Bitfield(J9FileStat._isFixed_s_, J9FileStat._isFixed_b_);
	}

	// U32:1 isRemote
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isRemoteOffset_", declaredType="U32:1")
	public UDATA isRemote() throws CorruptDataException {
		return getU32Bitfield(J9FileStat._isRemote_s_, J9FileStat._isRemote_b_);
	}

	// U32:1 isRemovable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isRemovableOffset_", declaredType="U32:1")
	public UDATA isRemovable() throws CorruptDataException {
		return getU32Bitfield(J9FileStat._isRemovable_s_, J9FileStat._isRemovable_b_);
	}

	// U64 ownerGid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownerGidOffset_", declaredType="U64")
	public UDATA ownerGid() throws CorruptDataException {
		return new U64(getLongAtOffset(J9FileStat._ownerGidOffset_));
	}

	// U64 ownerGid
	public UDATAPointer ownerGidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9FileStat._ownerGidOffset_));
	}

	// U64 ownerUid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownerUidOffset_", declaredType="U64")
	public UDATA ownerUid() throws CorruptDataException {
		return new U64(getLongAtOffset(J9FileStat._ownerUidOffset_));
	}

	// U64 ownerUid
	public UDATAPointer ownerUidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9FileStat._ownerUidOffset_));
	}

	// J9Permission perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permOffset_", declaredType="J9Permission")
	public J9PermissionPointer perm() throws CorruptDataException {
		return J9PermissionPointer.cast(nonNullFieldEA(J9FileStat._permOffset_));
	}

	// J9Permission perm
	public PointerPointer permEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9FileStat._permOffset_));
	}

}
