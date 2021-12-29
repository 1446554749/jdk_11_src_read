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
 * Structure: jvmtiSharedCacheInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiSharedCacheInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiSharedCacheInfo.class)
public class jvmtiSharedCacheInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiSharedCacheInfoPointer NULL = new jvmtiSharedCacheInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiSharedCacheInfoPointer(long address) {
		super(address);
	}

	public static jvmtiSharedCacheInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiSharedCacheInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiSharedCacheInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiSharedCacheInfoPointer(address);
	}

	public jvmtiSharedCacheInfoPointer add(long count) {
		return jvmtiSharedCacheInfoPointer.cast(address + (jvmtiSharedCacheInfo.SIZEOF * count));
	}

	public jvmtiSharedCacheInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiSharedCacheInfoPointer addOffset(long offset) {
		return jvmtiSharedCacheInfoPointer.cast(address + offset);
	}

	public jvmtiSharedCacheInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiSharedCacheInfoPointer sub(long count) {
		return jvmtiSharedCacheInfoPointer.cast(address - (jvmtiSharedCacheInfo.SIZEOF * count));
	}

	public jvmtiSharedCacheInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiSharedCacheInfoPointer subOffset(long offset) {
		return jvmtiSharedCacheInfoPointer.cast(address - offset);
	}

	public jvmtiSharedCacheInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiSharedCacheInfoPointer untag(long mask) {
		return jvmtiSharedCacheInfoPointer.cast(address & ~mask);
	}

	public jvmtiSharedCacheInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiSharedCacheInfo.SIZEOF;
	}

	// Implementation methods

	// jint addrMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addrModeOffset_", declaredType="jint")
	public IDATA addrMode() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._addrModeOffset_));
	}

	// jint addrMode
	public IDATAPointer addrModeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._addrModeOffset_));
	}

	// jlong cacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheSizeOffset_", declaredType="jlong")
	public IDATA cacheSize() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiSharedCacheInfo._cacheSizeOffset_));
	}

	// jlong cacheSize
	public IDATAPointer cacheSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._cacheSizeOffset_));
	}

	// jint cacheType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheTypeOffset_", declaredType="jint")
	public IDATA cacheType() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._cacheTypeOffset_));
	}

	// jint cacheType
	public IDATAPointer cacheTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._cacheTypeOffset_));
	}

	// jlong freeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeBytesOffset_", declaredType="jlong")
	public IDATA freeBytes() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiSharedCacheInfo._freeBytesOffset_));
	}

	// jlong freeBytes
	public IDATAPointer freeBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._freeBytesOffset_));
	}

	// jboolean isCompatible
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCompatibleOffset_", declaredType="jboolean")
	public U8 isCompatible() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiSharedCacheInfo._isCompatibleOffset_));
	}

	// jboolean isCompatible
	public U8Pointer isCompatibleEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._isCompatibleOffset_));
	}

	// jboolean isCorrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCorruptOffset_", declaredType="jboolean")
	public U8 isCorrupt() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiSharedCacheInfo._isCorruptOffset_));
	}

	// jboolean isCorrupt
	public U8Pointer isCorruptEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._isCorruptOffset_));
	}

	// jboolean isPersistent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isPersistentOffset_", declaredType="jboolean")
	public U8 isPersistent() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiSharedCacheInfo._isPersistentOffset_));
	}

	// jboolean isPersistent
	public U8Pointer isPersistentEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._isPersistentOffset_));
	}

	// jlong lastDetach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastDetachOffset_", declaredType="jlong")
	public IDATA lastDetach() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiSharedCacheInfo._lastDetachOffset_));
	}

	// jlong lastDetach
	public IDATAPointer lastDetachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._lastDetachOffset_));
	}

	// jint layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_layerOffset_", declaredType="jint")
	public IDATA layer() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._layerOffset_));
	}

	// jint layer
	public IDATAPointer layerEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._layerOffset_));
	}

	// jint modLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modLevelOffset_", declaredType="jint")
	public IDATA modLevel() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._modLevelOffset_));
	}

	// jint modLevel
	public IDATAPointer modLevelEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._modLevelOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiSharedCacheInfo._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._nameOffset_));
	}

	// jint os_semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_semidOffset_", declaredType="jint")
	public IDATA os_semid() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._os_semidOffset_));
	}

	// jint os_semid
	public IDATAPointer os_semidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._os_semidOffset_));
	}

	// jint os_shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_shmidOffset_", declaredType="jint")
	public IDATA os_shmid() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiSharedCacheInfo._os_shmidOffset_));
	}

	// jint os_shmid
	public IDATAPointer os_shmidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._os_shmidOffset_));
	}

	// jlong softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="jlong")
	public IDATA softMaxBytes() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiSharedCacheInfo._softMaxBytesOffset_));
	}

	// jlong softMaxBytes
	public IDATAPointer softMaxBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiSharedCacheInfo._softMaxBytesOffset_));
	}

}
