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
 * Structure: SH_OSCache_InfoPointer
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
 * The generated code will provide getters for all elements in the SH_OSCache_InfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_OSCache_Info.class)
public class SH_OSCache_InfoPointer extends StructurePointer {

	// NULL
	public static final SH_OSCache_InfoPointer NULL = new SH_OSCache_InfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_OSCache_InfoPointer(long address) {
		super(address);
	}

	public static SH_OSCache_InfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_OSCache_InfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_OSCache_InfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_OSCache_InfoPointer(address);
	}

	public SH_OSCache_InfoPointer add(long count) {
		return SH_OSCache_InfoPointer.cast(address + (SH_OSCache_Info.SIZEOF * count));
	}

	public SH_OSCache_InfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_OSCache_InfoPointer addOffset(long offset) {
		return SH_OSCache_InfoPointer.cast(address + offset);
	}

	public SH_OSCache_InfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_OSCache_InfoPointer sub(long count) {
		return SH_OSCache_InfoPointer.cast(address - (SH_OSCache_Info.SIZEOF * count));
	}

	public SH_OSCache_InfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_OSCache_InfoPointer subOffset(long offset) {
		return SH_OSCache_InfoPointer.cast(address - offset);
	}

	public SH_OSCache_InfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_OSCache_InfoPointer untag(long mask) {
		return SH_OSCache_InfoPointer.cast(address & ~mask);
	}

	public SH_OSCache_InfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_OSCache_Info.SIZEOF;
	}

	// Implementation methods

	// I64 createtime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createtimeOffset_", declaredType="I64")
	public IDATA createtime() throws CorruptDataException {
		return new I64(getLongAtOffset(SH_OSCache_Info._createtimeOffset_));
	}

	// I64 createtime
	public IDATAPointer createtimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._createtimeOffset_));
	}

	// UDATA generation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_generationOffset_", declaredType="UDATA")
	public UDATA generation() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._generationOffset_);
	}

	// UDATA generation
	public UDATAPointer generationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._generationOffset_));
	}

	// UDATA isCompatible
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCompatibleOffset_", declaredType="UDATA")
	public UDATA isCompatible() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._isCompatibleOffset_);
	}

	// UDATA isCompatible
	public UDATAPointer isCompatibleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._isCompatibleOffset_));
	}

	// UDATA isCorrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCorruptOffset_", declaredType="UDATA")
	public UDATA isCorrupt() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._isCorruptOffset_);
	}

	// UDATA isCorrupt
	public UDATAPointer isCorruptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._isCorruptOffset_));
	}

	// UDATA isJavaCorePopulated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isJavaCorePopulatedOffset_", declaredType="UDATA")
	public UDATA isJavaCorePopulated() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._isJavaCorePopulatedOffset_);
	}

	// UDATA isJavaCorePopulated
	public UDATAPointer isJavaCorePopulatedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._isJavaCorePopulatedOffset_));
	}

	// J9SharedClassJavacoreDataDescriptor javacoreData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javacoreDataOffset_", declaredType="J9SharedClassJavacoreDataDescriptor")
	public J9SharedClassJavacoreDataDescriptorPointer javacoreData() throws CorruptDataException {
		return J9SharedClassJavacoreDataDescriptorPointer.cast(nonNullFieldEA(SH_OSCache_Info._javacoreDataOffset_));
	}

	// J9SharedClassJavacoreDataDescriptor javacoreData
	public PointerPointer javacoreDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache_Info._javacoreDataOffset_));
	}

	// I64 lastattach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastattachOffset_", declaredType="I64")
	public IDATA lastattach() throws CorruptDataException {
		return new I64(getLongAtOffset(SH_OSCache_Info._lastattachOffset_));
	}

	// I64 lastattach
	public IDATAPointer lastattachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._lastattachOffset_));
	}

	// I64 lastdetach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastdetachOffset_", declaredType="I64")
	public IDATA lastdetach() throws CorruptDataException {
		return new I64(getLongAtOffset(SH_OSCache_Info._lastdetachOffset_));
	}

	// I64 lastdetach
	public IDATAPointer lastdetachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._lastdetachOffset_));
	}

	// I8 layer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_layerOffset_", declaredType="I8")
	public I8 layer() throws CorruptDataException {
		return new I8(getByteAtOffset(SH_OSCache_Info._layerOffset_));
	}

	// I8 layer
	public I8Pointer layerEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(SH_OSCache_Info._layerOffset_));
	}

	// U8[] name
	public U8Pointer nameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(SH_OSCache_Info._nameOffset_));
	}

	// IDATA nattach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nattachOffset_", declaredType="IDATA")
	public IDATA nattach() throws CorruptDataException {
		return getIDATAAtOffset(SH_OSCache_Info._nattachOffset_);
	}

	// IDATA nattach
	public IDATAPointer nattachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._nattachOffset_));
	}

	// UDATA os_semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_semidOffset_", declaredType="UDATA")
	public UDATA os_semid() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._os_semidOffset_);
	}

	// UDATA os_semid
	public UDATAPointer os_semidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._os_semidOffset_));
	}

	// UDATA os_shmid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_shmidOffset_", declaredType="UDATA")
	public UDATA os_shmid() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCache_Info._os_shmidOffset_);
	}

	// UDATA os_shmid
	public UDATAPointer os_shmidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCache_Info._os_shmidOffset_));
	}

	// J9PortShcVersion versionData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionDataOffset_", declaredType="J9PortShcVersion")
	public J9PortShcVersionPointer versionData() throws CorruptDataException {
		return J9PortShcVersionPointer.cast(nonNullFieldEA(SH_OSCache_Info._versionDataOffset_));
	}

	// J9PortShcVersion versionData
	public PointerPointer versionDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCache_Info._versionDataOffset_));
	}

}
