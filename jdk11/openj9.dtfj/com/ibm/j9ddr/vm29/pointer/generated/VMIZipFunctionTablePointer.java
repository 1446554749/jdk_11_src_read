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
 * Structure: VMIZipFunctionTablePointer
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
 * The generated code will provide getters for all elements in the VMIZipFunctionTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VMIZipFunctionTable.class)
public class VMIZipFunctionTablePointer extends StructurePointer {

	// NULL
	public static final VMIZipFunctionTablePointer NULL = new VMIZipFunctionTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VMIZipFunctionTablePointer(long address) {
		super(address);
	}

	public static VMIZipFunctionTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VMIZipFunctionTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VMIZipFunctionTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VMIZipFunctionTablePointer(address);
	}

	public VMIZipFunctionTablePointer add(long count) {
		return VMIZipFunctionTablePointer.cast(address + (VMIZipFunctionTable.SIZEOF * count));
	}

	public VMIZipFunctionTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public VMIZipFunctionTablePointer addOffset(long offset) {
		return VMIZipFunctionTablePointer.cast(address + offset);
	}

	public VMIZipFunctionTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VMIZipFunctionTablePointer sub(long count) {
		return VMIZipFunctionTablePointer.cast(address - (VMIZipFunctionTable.SIZEOF * count));
	}

	public VMIZipFunctionTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VMIZipFunctionTablePointer subOffset(long offset) {
		return VMIZipFunctionTablePointer.cast(address - offset);
	}

	public VMIZipFunctionTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VMIZipFunctionTablePointer untag(long mask) {
		return VMIZipFunctionTablePointer.cast(address & ~mask);
	}

	public VMIZipFunctionTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VMIZipFunctionTable.SIZEOF;
	}

	// Implementation methods

	// void* reserved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedOffset_", declaredType="void*")
	public VoidPointer reserved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._reservedOffset_));
	}

	// void* reserved
	public PointerPointer reservedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._reservedOffset_));
	}

	// void* zipCache_enumElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCache_enumElementOffset_", declaredType="void*")
	public VoidPointer zipCache_enumElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zipCache_enumElementOffset_));
	}

	// void* zipCache_enumElement
	public PointerPointer zipCache_enumElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zipCache_enumElementOffset_));
	}

	// void* zipCache_enumGetDirName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCache_enumGetDirNameOffset_", declaredType="void*")
	public VoidPointer zipCache_enumGetDirName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zipCache_enumGetDirNameOffset_));
	}

	// void* zipCache_enumGetDirName
	public PointerPointer zipCache_enumGetDirNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zipCache_enumGetDirNameOffset_));
	}

	// void* zipCache_enumKill
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCache_enumKillOffset_", declaredType="void*")
	public VoidPointer zipCache_enumKill() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zipCache_enumKillOffset_));
	}

	// void* zipCache_enumKill
	public PointerPointer zipCache_enumKillEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zipCache_enumKillOffset_));
	}

	// void* zipCache_enumNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipCache_enumNewOffset_", declaredType="void*")
	public VoidPointer zipCache_enumNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zipCache_enumNewOffset_));
	}

	// void* zipCache_enumNew
	public PointerPointer zipCache_enumNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zipCache_enumNewOffset_));
	}

	// void* zip_closeZipFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_closeZipFileOffset_", declaredType="void*")
	public VoidPointer zip_closeZipFile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_closeZipFileOffset_));
	}

	// void* zip_closeZipFile
	public PointerPointer zip_closeZipFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_closeZipFileOffset_));
	}

	// void* zip_freeZipComment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_freeZipCommentOffset_", declaredType="void*")
	public VoidPointer zip_freeZipComment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_freeZipCommentOffset_));
	}

	// void* zip_freeZipComment
	public PointerPointer zip_freeZipCommentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_freeZipCommentOffset_));
	}

	// void* zip_freeZipEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_freeZipEntryOffset_", declaredType="void*")
	public VoidPointer zip_freeZipEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_freeZipEntryOffset_));
	}

	// void* zip_freeZipEntry
	public PointerPointer zip_freeZipEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_freeZipEntryOffset_));
	}

	// void* zip_getNextZipEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getNextZipEntryOffset_", declaredType="void*")
	public VoidPointer zip_getNextZipEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getNextZipEntryOffset_));
	}

	// void* zip_getNextZipEntry
	public PointerPointer zip_getNextZipEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getNextZipEntryOffset_));
	}

	// void* zip_getZipComment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipCommentOffset_", declaredType="void*")
	public VoidPointer zip_getZipComment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipCommentOffset_));
	}

	// void* zip_getZipComment
	public PointerPointer zip_getZipCommentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipCommentOffset_));
	}

	// void* zip_getZipEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryOffset_));
	}

	// void* zip_getZipEntry
	public PointerPointer zip_getZipEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryOffset_));
	}

	// void* zip_getZipEntryComment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryCommentOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryComment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryCommentOffset_));
	}

	// void* zip_getZipEntryComment
	public PointerPointer zip_getZipEntryCommentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryCommentOffset_));
	}

	// void* zip_getZipEntryData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryDataOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryDataOffset_));
	}

	// void* zip_getZipEntryData
	public PointerPointer zip_getZipEntryDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryDataOffset_));
	}

	// void* zip_getZipEntryExtraField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryExtraFieldOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryExtraField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryExtraFieldOffset_));
	}

	// void* zip_getZipEntryExtraField
	public PointerPointer zip_getZipEntryExtraFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryExtraFieldOffset_));
	}

	// void* zip_getZipEntryFromOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryFromOffsetOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryFromOffset() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryFromOffsetOffset_));
	}

	// void* zip_getZipEntryFromOffset
	public PointerPointer zip_getZipEntryFromOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryFromOffsetOffset_));
	}

	// void* zip_getZipEntryRawData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryRawDataOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryRawData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryRawDataOffset_));
	}

	// void* zip_getZipEntryRawData
	public PointerPointer zip_getZipEntryRawDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryRawDataOffset_));
	}

	// void* zip_getZipEntryWithSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipEntryWithSizeOffset_", declaredType="void*")
	public VoidPointer zip_getZipEntryWithSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipEntryWithSizeOffset_));
	}

	// void* zip_getZipEntryWithSize
	public PointerPointer zip_getZipEntryWithSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipEntryWithSizeOffset_));
	}

	// void* zip_getZipHookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_getZipHookInterfaceOffset_", declaredType="void*")
	public VoidPointer zip_getZipHookInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_getZipHookInterfaceOffset_));
	}

	// void* zip_getZipHookInterface
	public PointerPointer zip_getZipHookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_getZipHookInterfaceOffset_));
	}

	// void* zip_initZipEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_initZipEntryOffset_", declaredType="void*")
	public VoidPointer zip_initZipEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_initZipEntryOffset_));
	}

	// void* zip_initZipEntry
	public PointerPointer zip_initZipEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_initZipEntryOffset_));
	}

	// void* zip_openZipFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_openZipFileOffset_", declaredType="void*")
	public VoidPointer zip_openZipFile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_openZipFileOffset_));
	}

	// void* zip_openZipFile
	public PointerPointer zip_openZipFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_openZipFileOffset_));
	}

	// void* zip_resetZipFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zip_resetZipFileOffset_", declaredType="void*")
	public VoidPointer zip_resetZipFile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFunctionTable._zip_resetZipFileOffset_));
	}

	// void* zip_resetZipFile
	public PointerPointer zip_resetZipFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFunctionTable._zip_resetZipFileOffset_));
	}

}
