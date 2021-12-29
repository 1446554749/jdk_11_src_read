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
 * Structure: J9SharedCacheManagerParmPointer
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
 * The generated code will provide getters for all elements in the J9SharedCacheManagerParmPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedCacheManagerParm.class)
public class J9SharedCacheManagerParmPointer extends StructurePointer {

	// NULL
	public static final J9SharedCacheManagerParmPointer NULL = new J9SharedCacheManagerParmPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedCacheManagerParmPointer(long address) {
		super(address);
	}

	public static J9SharedCacheManagerParmPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedCacheManagerParmPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedCacheManagerParmPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedCacheManagerParmPointer(address);
	}

	public J9SharedCacheManagerParmPointer add(long count) {
		return J9SharedCacheManagerParmPointer.cast(address + (J9SharedCacheManagerParm.SIZEOF * count));
	}

	public J9SharedCacheManagerParmPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedCacheManagerParmPointer addOffset(long offset) {
		return J9SharedCacheManagerParmPointer.cast(address + offset);
	}

	public J9SharedCacheManagerParmPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedCacheManagerParmPointer sub(long count) {
		return J9SharedCacheManagerParmPointer.cast(address - (J9SharedCacheManagerParm.SIZEOF * count));
	}

	public J9SharedCacheManagerParmPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedCacheManagerParmPointer subOffset(long offset) {
		return J9SharedCacheManagerParmPointer.cast(address - offset);
	}

	public J9SharedCacheManagerParmPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedCacheManagerParmPointer untag(long mask) {
		return J9SharedCacheManagerParmPointer.cast(address & ~mask);
	}

	public J9SharedCacheManagerParmPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedCacheManagerParm.SIZEOF;
	}

	// Implementation methods

	// IDATA cacheRemoved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheRemovedOffset_", declaredType="IDATA")
	public IDATA cacheRemoved() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedCacheManagerParm._cacheRemovedOffset_);
	}

	// IDATA cacheRemoved
	public IDATAPointer cacheRemovedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._cacheRemovedOffset_));
	}

	// const U8* ctrlDirName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ctrlDirNameOffset_", declaredType="const U8*")
	public U8Pointer ctrlDirName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SharedCacheManagerParm._ctrlDirNameOffset_));
	}

	// const U8* ctrlDirName
	public PointerPointer ctrlDirNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._ctrlDirNameOffset_));
	}

	// I64 delete_since
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_delete_sinceOffset_", declaredType="I64")
	public IDATA delete_since() throws CorruptDataException {
		return new I64(getLongAtOffset(J9SharedCacheManagerParm._delete_sinceOffset_));
	}

	// I64 delete_since
	public IDATAPointer delete_sinceEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._delete_sinceOffset_));
	}

	// UDATA groupPerm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_groupPermOffset_", declaredType="UDATA")
	public UDATA groupPerm() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._groupPermOffset_);
	}

	// UDATA groupPerm
	public UDATAPointer groupPermEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._groupPermOffset_));
	}

	// bool printCompatibleCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printCompatibleCacheOffset_", declaredType="bool")
	public boolean printCompatibleCache() throws CorruptDataException {
		return getBoolAtOffset(J9SharedCacheManagerParm._printCompatibleCacheOffset_);
	}

	// bool printCompatibleCache
	public BoolPointer printCompatibleCacheEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printCompatibleCacheOffset_));
	}

	// UDATA printCompatibleHeader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printCompatibleHeaderOffset_", declaredType="UDATA")
	public UDATA printCompatibleHeader() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._printCompatibleHeaderOffset_);
	}

	// UDATA printCompatibleHeader
	public UDATAPointer printCompatibleHeaderEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printCompatibleHeaderOffset_));
	}

	// UDATA printHeader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printHeaderOffset_", declaredType="UDATA")
	public UDATA printHeader() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._printHeaderOffset_);
	}

	// UDATA printHeader
	public UDATAPointer printHeaderEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printHeaderOffset_));
	}

	// bool printIncompatibleCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printIncompatibleCacheOffset_", declaredType="bool")
	public boolean printIncompatibleCache() throws CorruptDataException {
		return getBoolAtOffset(J9SharedCacheManagerParm._printIncompatibleCacheOffset_);
	}

	// bool printIncompatibleCache
	public BoolPointer printIncompatibleCacheEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printIncompatibleCacheOffset_));
	}

	// UDATA printIncompatibleHeader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printIncompatibleHeaderOffset_", declaredType="UDATA")
	public UDATA printIncompatibleHeader() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._printIncompatibleHeaderOffset_);
	}

	// UDATA printIncompatibleHeader
	public UDATAPointer printIncompatibleHeaderEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printIncompatibleHeaderOffset_));
	}

	// UDATA printIntro
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printIntroOffset_", declaredType="UDATA")
	public UDATA printIntro() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._printIntroOffset_);
	}

	// UDATA printIntro
	public UDATAPointer printIntroEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._printIntroOffset_));
	}

	// IDATA result
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resultOffset_", declaredType="IDATA")
	public IDATA result() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedCacheManagerParm._resultOffset_);
	}

	// IDATA result
	public IDATAPointer resultEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._resultOffset_));
	}

	// UDATA verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseFlagsOffset_", declaredType="UDATA")
	public UDATA verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheManagerParm._verboseFlagsOffset_);
	}

	// UDATA verboseFlags
	public UDATAPointer verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._verboseFlagsOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9SharedCacheManagerParm._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedCacheManagerParm._vmOffset_));
	}

}
