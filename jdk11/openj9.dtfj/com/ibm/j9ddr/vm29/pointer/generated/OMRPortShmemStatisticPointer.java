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
 * Structure: OMRPortShmemStatisticPointer
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
 * The generated code will provide getters for all elements in the OMRPortShmemStatisticPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortShmemStatistic.class)
public class OMRPortShmemStatisticPointer extends StructurePointer {

	// NULL
	public static final OMRPortShmemStatisticPointer NULL = new OMRPortShmemStatisticPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortShmemStatisticPointer(long address) {
		super(address);
	}

	public static OMRPortShmemStatisticPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortShmemStatisticPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortShmemStatisticPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortShmemStatisticPointer(address);
	}

	public OMRPortShmemStatisticPointer add(long count) {
		return OMRPortShmemStatisticPointer.cast(address + (OMRPortShmemStatistic.SIZEOF * count));
	}

	public OMRPortShmemStatisticPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortShmemStatisticPointer addOffset(long offset) {
		return OMRPortShmemStatisticPointer.cast(address + offset);
	}

	public OMRPortShmemStatisticPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortShmemStatisticPointer sub(long count) {
		return OMRPortShmemStatisticPointer.cast(address - (OMRPortShmemStatistic.SIZEOF * count));
	}

	public OMRPortShmemStatisticPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortShmemStatisticPointer subOffset(long offset) {
		return OMRPortShmemStatisticPointer.cast(address - offset);
	}

	public OMRPortShmemStatisticPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortShmemStatisticPointer untag(long mask) {
		return OMRPortShmemStatisticPointer.cast(address & ~mask);
	}

	public OMRPortShmemStatisticPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortShmemStatistic.SIZEOF;
	}

	// Implementation methods

	// U64 cgid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cgidOffset_", declaredType="U64")
	public UDATA cgid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._cgidOffset_));
	}

	// U64 cgid
	public UDATAPointer cgidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._cgidOffset_));
	}

	// U8* controlDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_controlDirOffset_", declaredType="U8*")
	public U8Pointer controlDir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortShmemStatistic._controlDirOffset_));
	}

	// U8* controlDir
	public PointerPointer controlDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._controlDirOffset_));
	}

	// U64 cuid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cuidOffset_", declaredType="U64")
	public UDATA cuid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._cuidOffset_));
	}

	// U64 cuid
	public UDATAPointer cuidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._cuidOffset_));
	}

	// U8* file
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fileOffset_", declaredType="U8*")
	public U8Pointer file() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortShmemStatistic._fileOffset_));
	}

	// U8* file
	public PointerPointer fileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._fileOffset_));
	}

	// U64 key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_keyOffset_", declaredType="U64")
	public UDATA key() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._keyOffset_));
	}

	// U64 key
	public UDATAPointer keyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._keyOffset_));
	}

	// I64 lastAttachTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastAttachTimeOffset_", declaredType="I64")
	public IDATA lastAttachTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OMRPortShmemStatistic._lastAttachTimeOffset_));
	}

	// I64 lastAttachTime
	public IDATAPointer lastAttachTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._lastAttachTimeOffset_));
	}

	// I64 lastChangeTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastChangeTimeOffset_", declaredType="I64")
	public IDATA lastChangeTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OMRPortShmemStatistic._lastChangeTimeOffset_));
	}

	// I64 lastChangeTime
	public IDATAPointer lastChangeTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._lastChangeTimeOffset_));
	}

	// I64 lastDetachTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastDetachTimeOffset_", declaredType="I64")
	public IDATA lastDetachTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OMRPortShmemStatistic._lastDetachTimeOffset_));
	}

	// I64 lastDetachTime
	public IDATAPointer lastDetachTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._lastDetachTimeOffset_));
	}

	// U64 nattach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nattachOffset_", declaredType="U64")
	public UDATA nattach() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._nattachOffset_));
	}

	// U64 nattach
	public UDATAPointer nattachEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._nattachOffset_));
	}

	// U64 ogid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ogidOffset_", declaredType="U64")
	public UDATA ogid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._ogidOffset_));
	}

	// U64 ogid
	public UDATAPointer ogidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._ogidOffset_));
	}

	// U64 ouid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ouidOffset_", declaredType="U64")
	public UDATA ouid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._ouidOffset_));
	}

	// U64 ouid
	public UDATAPointer ouidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._ouidOffset_));
	}

	// J9Permission perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permOffset_", declaredType="J9Permission")
	public J9PermissionPointer perm() throws CorruptDataException {
		return J9PermissionPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._permOffset_));
	}

	// J9Permission perm
	public PointerPointer permEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._permOffset_));
	}

	// U64 shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmidOffset_", declaredType="U64")
	public UDATA shmid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._shmidOffset_));
	}

	// U64 shmid
	public UDATAPointer shmidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._shmidOffset_));
	}

	// U64 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U64")
	public UDATA size() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShmemStatistic._sizeOffset_));
	}

	// U64 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShmemStatistic._sizeOffset_));
	}

}
