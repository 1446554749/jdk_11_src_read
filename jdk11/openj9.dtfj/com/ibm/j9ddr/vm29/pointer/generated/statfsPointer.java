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
 * Structure: statfsPointer
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
 * The generated code will provide getters for all elements in the statfsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=statfs.class)
public class statfsPointer extends StructurePointer {

	// NULL
	public static final statfsPointer NULL = new statfsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected statfsPointer(long address) {
		super(address);
	}

	public static statfsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static statfsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static statfsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new statfsPointer(address);
	}

	public statfsPointer add(long count) {
		return statfsPointer.cast(address + (statfs.SIZEOF * count));
	}

	public statfsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public statfsPointer addOffset(long offset) {
		return statfsPointer.cast(address + offset);
	}

	public statfsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public statfsPointer sub(long count) {
		return statfsPointer.cast(address - (statfs.SIZEOF * count));
	}

	public statfsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public statfsPointer subOffset(long offset) {
		return statfsPointer.cast(address - offset);
	}

	public statfsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public statfsPointer untag(long mask) {
		return statfsPointer.cast(address & ~mask);
	}

	public statfsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return statfs.SIZEOF;
	}

	// Implementation methods

	// U64 f_bavail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bavailOffset_", declaredType="U64")
	public UDATA f_bavail() throws CorruptDataException {
		return new U64(getLongAtOffset(statfs._f_bavailOffset_));
	}

	// U64 f_bavail
	public UDATAPointer f_bavailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_bavailOffset_));
	}

	// U64 f_bfree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bfreeOffset_", declaredType="U64")
	public UDATA f_bfree() throws CorruptDataException {
		return new U64(getLongAtOffset(statfs._f_bfreeOffset_));
	}

	// U64 f_bfree
	public UDATAPointer f_bfreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_bfreeOffset_));
	}

	// U64 f_blocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_blocksOffset_", declaredType="U64")
	public UDATA f_blocks() throws CorruptDataException {
		return new U64(getLongAtOffset(statfs._f_blocksOffset_));
	}

	// U64 f_blocks
	public UDATAPointer f_blocksEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_blocksOffset_));
	}

	// U32 f_bsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bsizeOffset_", declaredType="U32")
	public UDATA f_bsize() throws CorruptDataException {
		return new U32(getIntAtOffset(statfs._f_bsizeOffset_));
	}

	// U32 f_bsize
	public UDATAPointer f_bsizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_bsizeOffset_));
	}

	// U64 f_ffree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_ffreeOffset_", declaredType="U64")
	public UDATA f_ffree() throws CorruptDataException {
		return new U64(getLongAtOffset(statfs._f_ffreeOffset_));
	}

	// U64 f_ffree
	public UDATAPointer f_ffreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_ffreeOffset_));
	}

	// U64 f_files
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_filesOffset_", declaredType="U64")
	public UDATA f_files() throws CorruptDataException {
		return new U64(getLongAtOffset(statfs._f_filesOffset_));
	}

	// U64 f_files
	public UDATAPointer f_filesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_filesOffset_));
	}

	// U32 f_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_flagsOffset_", declaredType="U32")
	public UDATA f_flags() throws CorruptDataException {
		return new U32(getIntAtOffset(statfs._f_flagsOffset_));
	}

	// U32 f_flags
	public UDATAPointer f_flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_flagsOffset_));
	}

	// fsid_t f_fsid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_fsidOffset_", declaredType="fsid_t")
	public fsidPointer f_fsid() throws CorruptDataException {
		return fsidPointer.cast(nonNullFieldEA(statfs._f_fsidOffset_));
	}

	// fsid_t f_fsid
	public PointerPointer f_fsidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(statfs._f_fsidOffset_));
	}

	// U32 f_fssubtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_fssubtypeOffset_", declaredType="U32")
	public UDATA f_fssubtype() throws CorruptDataException {
		return new U32(getIntAtOffset(statfs._f_fssubtypeOffset_));
	}

	// U32 f_fssubtype
	public UDATAPointer f_fssubtypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_fssubtypeOffset_));
	}

	// U8[] f_fstypename
	public U8Pointer f_fstypenameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(statfs._f_fstypenameOffset_));
	}

	// I32 f_iosize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_iosizeOffset_", declaredType="I32")
	public IDATA f_iosize() throws CorruptDataException {
		return new I32(getIntAtOffset(statfs._f_iosizeOffset_));
	}

	// I32 f_iosize
	public IDATAPointer f_iosizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(statfs._f_iosizeOffset_));
	}

	// U8[] f_mntfromname
	public U8Pointer f_mntfromnameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(statfs._f_mntfromnameOffset_));
	}

	// U8[] f_mntonname
	public U8Pointer f_mntonnameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(statfs._f_mntonnameOffset_));
	}

	// uid_t f_owner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_ownerOffset_", declaredType="uid_t")
	public UDATA f_owner() throws CorruptDataException {
		return new U32(getIntAtOffset(statfs._f_ownerOffset_));
	}

	// uid_t f_owner
	public UDATAPointer f_ownerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_ownerOffset_));
	}

	// U32[] f_reserved
	public UDATAPointer f_reservedEA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(statfs._f_reservedOffset_));
	}

	// U32 f_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_typeOffset_", declaredType="U32")
	public UDATA f_type() throws CorruptDataException {
		return new U32(getIntAtOffset(statfs._f_typeOffset_));
	}

	// U32 f_type
	public UDATAPointer f_typeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statfs._f_typeOffset_));
	}

}
