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
 * Structure: SH_ROMClassResourceManagerPointer
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
 * The generated code will provide getters for all elements in the SH_ROMClassResourceManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_ROMClassResourceManager.class)
public class SH_ROMClassResourceManagerPointer extends SH_ManagerPointer {

	// NULL
	public static final SH_ROMClassResourceManagerPointer NULL = new SH_ROMClassResourceManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_ROMClassResourceManagerPointer(long address) {
		super(address);
	}

	public static SH_ROMClassResourceManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_ROMClassResourceManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_ROMClassResourceManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_ROMClassResourceManagerPointer(address);
	}

	public SH_ROMClassResourceManagerPointer add(long count) {
		return SH_ROMClassResourceManagerPointer.cast(address + (SH_ROMClassResourceManager.SIZEOF * count));
	}

	public SH_ROMClassResourceManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_ROMClassResourceManagerPointer addOffset(long offset) {
		return SH_ROMClassResourceManagerPointer.cast(address + offset);
	}

	public SH_ROMClassResourceManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_ROMClassResourceManagerPointer sub(long count) {
		return SH_ROMClassResourceManagerPointer.cast(address - (SH_ROMClassResourceManager.SIZEOF * count));
	}

	public SH_ROMClassResourceManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_ROMClassResourceManagerPointer subOffset(long offset) {
		return SH_ROMClassResourceManagerPointer.cast(address - offset);
	}

	public SH_ROMClassResourceManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_ROMClassResourceManagerPointer untag(long mask) {
		return SH_ROMClassResourceManagerPointer.cast(address & ~mask);
	}

	public SH_ROMClassResourceManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_ROMClassResourceManager.SIZEOF;
	}

	// Implementation methods

	// bool _accessPermitted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__accessPermittedOffset_", declaredType="bool")
	public boolean _accessPermitted() throws CorruptDataException {
		return getBoolAtOffset(SH_ROMClassResourceManager.__accessPermittedOffset_);
	}

	// bool _accessPermitted
	public BoolPointer _accessPermittedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__accessPermittedOffset_));
	}

	// UDATA _dataBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataBytesOffset_", declaredType="UDATA")
	public UDATA _dataBytes() throws CorruptDataException {
		return getUDATAAtOffset(SH_ROMClassResourceManager.__dataBytesOffset_);
	}

	// UDATA _dataBytes
	public UDATAPointer _dataBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__dataBytesOffset_));
	}

	// const U8* _rrmAddFnName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rrmAddFnNameOffset_", declaredType="const U8*")
	public U8Pointer _rrmAddFnName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_ROMClassResourceManager.__rrmAddFnNameOffset_));
	}

	// const U8* _rrmAddFnName
	public PointerPointer _rrmAddFnNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__rrmAddFnNameOffset_));
	}

	// const U8* _rrmHashTableName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rrmHashTableNameOffset_", declaredType="const U8*")
	public U8Pointer _rrmHashTableName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_ROMClassResourceManager.__rrmHashTableNameOffset_));
	}

	// const U8* _rrmHashTableName
	public PointerPointer _rrmHashTableNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__rrmHashTableNameOffset_));
	}

	// const U8* _rrmLookupFnName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rrmLookupFnNameOffset_", declaredType="const U8*")
	public U8Pointer _rrmLookupFnName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_ROMClassResourceManager.__rrmLookupFnNameOffset_));
	}

	// const U8* _rrmLookupFnName
	public PointerPointer _rrmLookupFnNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__rrmLookupFnNameOffset_));
	}

	// const U8* _rrmRemoveFnName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rrmRemoveFnNameOffset_", declaredType="const U8*")
	public U8Pointer _rrmRemoveFnName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_ROMClassResourceManager.__rrmRemoveFnNameOffset_));
	}

	// const U8* _rrmRemoveFnName
	public PointerPointer _rrmRemoveFnNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ROMClassResourceManager.__rrmRemoveFnNameOffset_));
	}

}
