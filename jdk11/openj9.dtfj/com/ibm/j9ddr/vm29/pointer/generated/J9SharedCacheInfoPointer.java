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
 * Structure: J9SharedCacheInfoPointer
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
 * The generated code will provide getters for all elements in the J9SharedCacheInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedCacheInfo.class)
public class J9SharedCacheInfoPointer extends StructurePointer {

	// NULL
	public static final J9SharedCacheInfoPointer NULL = new J9SharedCacheInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedCacheInfoPointer(long address) {
		super(address);
	}

	public static J9SharedCacheInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedCacheInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedCacheInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedCacheInfoPointer(address);
	}

	public J9SharedCacheInfoPointer add(long count) {
		return J9SharedCacheInfoPointer.cast(address + (J9SharedCacheInfo.SIZEOF * count));
	}

	public J9SharedCacheInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedCacheInfoPointer addOffset(long offset) {
		return J9SharedCacheInfoPointer.cast(address + offset);
	}

	public J9SharedCacheInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedCacheInfoPointer sub(long count) {
		return J9SharedCacheInfoPointer.cast(address - (J9SharedCacheInfo.SIZEOF * count));
	}

	public J9SharedCacheInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedCacheInfoPointer subOffset(long offset) {
		return J9SharedCacheInfoPointer.cast(address - offset);
	}

	public J9SharedCacheInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedCacheInfoPointer untag(long mask) {
		return J9SharedCacheInfoPointer.cast(address & ~mask);
	}

	public J9SharedCacheInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedCacheInfo.SIZEOF;
	}

	// Implementation methods

	// UDATA addrMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addrModeOffset_", declaredType="UDATA")
	public UDATA addrMode() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._addrModeOffset_);
	}

	// UDATA addrMode
	public UDATAPointer addrModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._addrModeOffset_));
	}

	// UDATA cacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheSizeOffset_", declaredType="UDATA")
	public UDATA cacheSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._cacheSizeOffset_);
	}

	// UDATA cacheSize
	public UDATAPointer cacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._cacheSizeOffset_));
	}

	// UDATA cacheType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheTypeOffset_", declaredType="UDATA")
	public UDATA cacheType() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._cacheTypeOffset_);
	}

	// UDATA cacheType
	public UDATAPointer cacheTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._cacheTypeOffset_));
	}

	// UDATA freeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeBytesOffset_", declaredType="UDATA")
	public UDATA freeBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._freeBytesOffset_);
	}

	// UDATA freeBytes
	public UDATAPointer freeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._freeBytesOffset_));
	}

	// UDATA isCompatible
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCompatibleOffset_", declaredType="UDATA")
	public UDATA isCompatible() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._isCompatibleOffset_);
	}

	// UDATA isCompatible
	public UDATAPointer isCompatibleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._isCompatibleOffset_));
	}

	// UDATA isCorrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCorruptOffset_", declaredType="UDATA")
	public UDATA isCorrupt() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._isCorruptOffset_);
	}

	// UDATA isCorrupt
	public UDATAPointer isCorruptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._isCorruptOffset_));
	}

	// I64 lastDetach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastDetachOffset_", declaredType="I64")
	public IDATA lastDetach() throws CorruptDataException {
		return new I64(getLongAtOffset(J9SharedCacheInfo._lastDetachOffset_));
	}

	// I64 lastDetach
	public IDATAPointer lastDetachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._lastDetachOffset_));
	}

	// I8 layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_layerOffset_", declaredType="I8")
	public I8 layer() throws CorruptDataException {
		return new I8(getByteAtOffset(J9SharedCacheInfo._layerOffset_));
	}

	// I8 layer
	public I8Pointer layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(J9SharedCacheInfo._layerOffset_));
	}

	// UDATA modLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modLevelOffset_", declaredType="UDATA")
	public UDATA modLevel() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._modLevelOffset_);
	}

	// UDATA modLevel
	public UDATAPointer modLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._modLevelOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheInfo._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheInfo._nameOffset_));
	}

	// UDATA os_semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_semidOffset_", declaredType="UDATA")
	public UDATA os_semid() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._os_semidOffset_);
	}

	// UDATA os_semid
	public UDATAPointer os_semidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._os_semidOffset_));
	}

	// UDATA os_shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_shmidOffset_", declaredType="UDATA")
	public UDATA os_shmid() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._os_shmidOffset_);
	}

	// UDATA os_shmid
	public UDATAPointer os_shmidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._os_shmidOffset_));
	}

	// UDATA softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="UDATA")
	public UDATA softMaxBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheInfo._softMaxBytesOffset_);
	}

	// UDATA softMaxBytes
	public UDATAPointer softMaxBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheInfo._softMaxBytesOffset_));
	}

}
