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
 * Structure: statvfsPointer
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
 * The generated code will provide getters for all elements in the statvfsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=statvfs.class)
public class statvfsPointer extends StructurePointer {

	// NULL
	public static final statvfsPointer NULL = new statvfsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected statvfsPointer(long address) {
		super(address);
	}

	public static statvfsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static statvfsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static statvfsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new statvfsPointer(address);
	}

	public statvfsPointer add(long count) {
		return statvfsPointer.cast(address + (statvfs.SIZEOF * count));
	}

	public statvfsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public statvfsPointer addOffset(long offset) {
		return statvfsPointer.cast(address + offset);
	}

	public statvfsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public statvfsPointer sub(long count) {
		return statvfsPointer.cast(address - (statvfs.SIZEOF * count));
	}

	public statvfsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public statvfsPointer subOffset(long offset) {
		return statvfsPointer.cast(address - offset);
	}

	public statvfsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public statvfsPointer untag(long mask) {
		return statvfsPointer.cast(address & ~mask);
	}

	public statvfsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return statvfs.SIZEOF;
	}

	// Implementation methods

	// fsblkcnt_t f_bavail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bavailOffset_", declaredType="fsblkcnt_t")
	public UDATA f_bavail() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_bavailOffset_));
	}

	// fsblkcnt_t f_bavail
	public UDATAPointer f_bavailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_bavailOffset_));
	}

	// fsblkcnt_t f_bfree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bfreeOffset_", declaredType="fsblkcnt_t")
	public UDATA f_bfree() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_bfreeOffset_));
	}

	// fsblkcnt_t f_bfree
	public UDATAPointer f_bfreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_bfreeOffset_));
	}

	// fsblkcnt_t f_blocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_blocksOffset_", declaredType="fsblkcnt_t")
	public UDATA f_blocks() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_blocksOffset_));
	}

	// fsblkcnt_t f_blocks
	public UDATAPointer f_blocksEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_blocksOffset_));
	}

	// U64 f_bsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_bsizeOffset_", declaredType="U64")
	public UDATA f_bsize() throws CorruptDataException {
		return new U64(getLongAtOffset(statvfs._f_bsizeOffset_));
	}

	// U64 f_bsize
	public UDATAPointer f_bsizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_bsizeOffset_));
	}

	// fsfilcnt_t f_favail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_favailOffset_", declaredType="fsfilcnt_t")
	public UDATA f_favail() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_favailOffset_));
	}

	// fsfilcnt_t f_favail
	public UDATAPointer f_favailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_favailOffset_));
	}

	// fsfilcnt_t f_ffree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_ffreeOffset_", declaredType="fsfilcnt_t")
	public UDATA f_ffree() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_ffreeOffset_));
	}

	// fsfilcnt_t f_ffree
	public UDATAPointer f_ffreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_ffreeOffset_));
	}

	// fsfilcnt_t f_files
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_filesOffset_", declaredType="fsfilcnt_t")
	public UDATA f_files() throws CorruptDataException {
		return new U32(getIntAtOffset(statvfs._f_filesOffset_));
	}

	// fsfilcnt_t f_files
	public UDATAPointer f_filesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_filesOffset_));
	}

	// U64 f_flag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_flagOffset_", declaredType="U64")
	public UDATA f_flag() throws CorruptDataException {
		return new U64(getLongAtOffset(statvfs._f_flagOffset_));
	}

	// U64 f_flag
	public UDATAPointer f_flagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_flagOffset_));
	}

	// U64 f_frsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_frsizeOffset_", declaredType="U64")
	public UDATA f_frsize() throws CorruptDataException {
		return new U64(getLongAtOffset(statvfs._f_frsizeOffset_));
	}

	// U64 f_frsize
	public UDATAPointer f_frsizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_frsizeOffset_));
	}

	// U64 f_fsid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_fsidOffset_", declaredType="U64")
	public UDATA f_fsid() throws CorruptDataException {
		return new U64(getLongAtOffset(statvfs._f_fsidOffset_));
	}

	// U64 f_fsid
	public UDATAPointer f_fsidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_fsidOffset_));
	}

	// U64 f_namemax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_f_namemaxOffset_", declaredType="U64")
	public UDATA f_namemax() throws CorruptDataException {
		return new U64(getLongAtOffset(statvfs._f_namemaxOffset_));
	}

	// U64 f_namemax
	public UDATAPointer f_namemaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(statvfs._f_namemaxOffset_));
	}

}
