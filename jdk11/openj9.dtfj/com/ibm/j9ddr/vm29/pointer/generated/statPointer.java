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
 * Structure: statPointer
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
 * The generated code will provide getters for all elements in the statPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=stat.class)
public class statPointer extends StructurePointer {

	// NULL
	public static final statPointer NULL = new statPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected statPointer(long address) {
		super(address);
	}

	public static statPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static statPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static statPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new statPointer(address);
	}

	public statPointer add(long count) {
		return statPointer.cast(address + (stat.SIZEOF * count));
	}

	public statPointer add(Scalar count) {
		return add(count.longValue());
	}

	public statPointer addOffset(long offset) {
		return statPointer.cast(address + offset);
	}

	public statPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public statPointer sub(long count) {
		return statPointer.cast(address - (stat.SIZEOF * count));
	}

	public statPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public statPointer subOffset(long offset) {
		return statPointer.cast(address - offset);
	}

	public statPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public statPointer untag(long mask) {
		return statPointer.cast(address & ~mask);
	}

	public statPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return stat.SIZEOF;
	}

	// Implementation methods

	// timespec st_atimespec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_atimespecOffset_", declaredType="timespec")
	public timespecPointer st_atimespec() throws CorruptDataException {
		return timespecPointer.cast(nonNullFieldEA(stat._st_atimespecOffset_));
	}

	// timespec st_atimespec
	public PointerPointer st_atimespecEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(stat._st_atimespecOffset_));
	}

	// timespec st_birthtimespec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_birthtimespecOffset_", declaredType="timespec")
	public timespecPointer st_birthtimespec() throws CorruptDataException {
		return timespecPointer.cast(nonNullFieldEA(stat._st_birthtimespecOffset_));
	}

	// timespec st_birthtimespec
	public PointerPointer st_birthtimespecEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(stat._st_birthtimespecOffset_));
	}

	// blksize_t st_blksize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_blksizeOffset_", declaredType="blksize_t")
	public IDATA st_blksize() throws CorruptDataException {
		return new I32(getIntAtOffset(stat._st_blksizeOffset_));
	}

	// blksize_t st_blksize
	public IDATAPointer st_blksizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_blksizeOffset_));
	}

	// blkcnt_t st_blocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_blocksOffset_", declaredType="blkcnt_t")
	public IDATA st_blocks() throws CorruptDataException {
		return new I64(getLongAtOffset(stat._st_blocksOffset_));
	}

	// blkcnt_t st_blocks
	public IDATAPointer st_blocksEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_blocksOffset_));
	}

	// timespec st_ctimespec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_ctimespecOffset_", declaredType="timespec")
	public timespecPointer st_ctimespec() throws CorruptDataException {
		return timespecPointer.cast(nonNullFieldEA(stat._st_ctimespecOffset_));
	}

	// timespec st_ctimespec
	public PointerPointer st_ctimespecEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(stat._st_ctimespecOffset_));
	}

	// dev_t st_dev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_devOffset_", declaredType="dev_t")
	public IDATA st_dev() throws CorruptDataException {
		return new I32(getIntAtOffset(stat._st_devOffset_));
	}

	// dev_t st_dev
	public IDATAPointer st_devEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_devOffset_));
	}

	// U32 st_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_flagsOffset_", declaredType="U32")
	public UDATA st_flags() throws CorruptDataException {
		return new U32(getIntAtOffset(stat._st_flagsOffset_));
	}

	// U32 st_flags
	public UDATAPointer st_flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stat._st_flagsOffset_));
	}

	// U32 st_gen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_genOffset_", declaredType="U32")
	public UDATA st_gen() throws CorruptDataException {
		return new U32(getIntAtOffset(stat._st_genOffset_));
	}

	// U32 st_gen
	public UDATAPointer st_genEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stat._st_genOffset_));
	}

	// gid_t st_gid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_gidOffset_", declaredType="gid_t")
	public UDATA st_gid() throws CorruptDataException {
		return new U32(getIntAtOffset(stat._st_gidOffset_));
	}

	// gid_t st_gid
	public UDATAPointer st_gidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stat._st_gidOffset_));
	}

	// __darwin_ino64_t st_ino
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_inoOffset_", declaredType="__darwin_ino64_t")
	public UDATA st_ino() throws CorruptDataException {
		return new U64(getLongAtOffset(stat._st_inoOffset_));
	}

	// __darwin_ino64_t st_ino
	public UDATAPointer st_inoEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stat._st_inoOffset_));
	}

	// I32 st_lspare
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_lspareOffset_", declaredType="I32")
	public IDATA st_lspare() throws CorruptDataException {
		return new I32(getIntAtOffset(stat._st_lspareOffset_));
	}

	// I32 st_lspare
	public IDATAPointer st_lspareEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_lspareOffset_));
	}

	// mode_t st_mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_modeOffset_", declaredType="mode_t")
	public U16 st_mode() throws CorruptDataException {
		return new U16(getShortAtOffset(stat._st_modeOffset_));
	}

	// mode_t st_mode
	public U16Pointer st_modeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(stat._st_modeOffset_));
	}

	// timespec st_mtimespec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_mtimespecOffset_", declaredType="timespec")
	public timespecPointer st_mtimespec() throws CorruptDataException {
		return timespecPointer.cast(nonNullFieldEA(stat._st_mtimespecOffset_));
	}

	// timespec st_mtimespec
	public PointerPointer st_mtimespecEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(stat._st_mtimespecOffset_));
	}

	// nlink_t st_nlink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_nlinkOffset_", declaredType="nlink_t")
	public U16 st_nlink() throws CorruptDataException {
		return new U16(getShortAtOffset(stat._st_nlinkOffset_));
	}

	// nlink_t st_nlink
	public U16Pointer st_nlinkEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(stat._st_nlinkOffset_));
	}

	// I64[] st_qspare
	public IDATAPointer st_qspareEA() throws CorruptDataException {
		return I64Pointer.cast(nonNullFieldEA(stat._st_qspareOffset_));
	}

	// dev_t st_rdev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_rdevOffset_", declaredType="dev_t")
	public IDATA st_rdev() throws CorruptDataException {
		return new I32(getIntAtOffset(stat._st_rdevOffset_));
	}

	// dev_t st_rdev
	public IDATAPointer st_rdevEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_rdevOffset_));
	}

	// off_t st_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_sizeOffset_", declaredType="off_t")
	public IDATA st_size() throws CorruptDataException {
		return new I64(getLongAtOffset(stat._st_sizeOffset_));
	}

	// off_t st_size
	public IDATAPointer st_sizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(stat._st_sizeOffset_));
	}

	// uid_t st_uid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_st_uidOffset_", declaredType="uid_t")
	public UDATA st_uid() throws CorruptDataException {
		return new U32(getIntAtOffset(stat._st_uidOffset_));
	}

	// uid_t st_uid
	public UDATAPointer st_uidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stat._st_uidOffset_));
	}

}
