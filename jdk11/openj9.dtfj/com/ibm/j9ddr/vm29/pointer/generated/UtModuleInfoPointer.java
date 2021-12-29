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
 * Structure: UtModuleInfoPointer
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
 * The generated code will provide getters for all elements in the UtModuleInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtModuleInfo.class)
public class UtModuleInfoPointer extends StructurePointer {

	// NULL
	public static final UtModuleInfoPointer NULL = new UtModuleInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtModuleInfoPointer(long address) {
		super(address);
	}

	public static UtModuleInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtModuleInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtModuleInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtModuleInfoPointer(address);
	}

	public UtModuleInfoPointer add(long count) {
		return UtModuleInfoPointer.cast(address + (UtModuleInfo.SIZEOF * count));
	}

	public UtModuleInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtModuleInfoPointer addOffset(long offset) {
		return UtModuleInfoPointer.cast(address + offset);
	}

	public UtModuleInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtModuleInfoPointer sub(long count) {
		return UtModuleInfoPointer.cast(address - (UtModuleInfo.SIZEOF * count));
	}

	public UtModuleInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtModuleInfoPointer subOffset(long offset) {
		return UtModuleInfoPointer.cast(address - offset);
	}

	public UtModuleInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtModuleInfoPointer untag(long mask) {
		return UtModuleInfoPointer.cast(address & ~mask);
	}

	public UtModuleInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtModuleInfo.SIZEOF;
	}

	// Implementation methods

	// U8* active
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeOffset_", declaredType="U8*")
	public U8Pointer active() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtModuleInfo._activeOffset_));
	}

	// U8* active
	public PointerPointer activeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._activeOffset_));
	}

	// UtModuleInfo* containerModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_containerModuleOffset_", declaredType="UtModuleInfo*")
	public UtModuleInfoPointer containerModule() throws CorruptDataException {
		return UtModuleInfoPointer.cast(getPointerAtOffset(UtModuleInfo._containerModuleOffset_));
	}

	// UtModuleInfo* containerModule
	public PointerPointer containerModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._containerModuleOffset_));
	}

	// I32 count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countOffset_", declaredType="I32")
	public IDATA count() throws CorruptDataException {
		return new I32(getIntAtOffset(UtModuleInfo._countOffset_));
	}

	// I32 count
	public IDATAPointer countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtModuleInfo._countOffset_));
	}

	// U8* formatStringsFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_formatStringsFileNameOffset_", declaredType="U8*")
	public U8Pointer formatStringsFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtModuleInfo._formatStringsFileNameOffset_));
	}

	// U8* formatStringsFileName
	public PointerPointer formatStringsFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._formatStringsFileNameOffset_));
	}

	// UtGroupDetails* groupDetails
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_groupDetailsOffset_", declaredType="UtGroupDetails*")
	public UtGroupDetailsPointer groupDetails() throws CorruptDataException {
		return UtGroupDetailsPointer.cast(getPointerAtOffset(UtModuleInfo._groupDetailsOffset_));
	}

	// UtGroupDetails* groupDetails
	public PointerPointer groupDetailsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._groupDetailsOffset_));
	}

	// UtModuleInterface* intf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intfOffset_", declaredType="UtModuleInterface*")
	public UtModuleInterfacePointer intf() throws CorruptDataException {
		return UtModuleInterfacePointer.cast(getPointerAtOffset(UtModuleInfo._intfOffset_));
	}

	// UtModuleInterface* intf
	public PointerPointer intfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._intfOffset_));
	}

	// I32 isAuxiliary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isAuxiliaryOffset_", declaredType="I32")
	public IDATA isAuxiliary() throws CorruptDataException {
		return new I32(getIntAtOffset(UtModuleInfo._isAuxiliaryOffset_));
	}

	// I32 isAuxiliary
	public IDATAPointer isAuxiliaryEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtModuleInfo._isAuxiliaryOffset_));
	}

	// U8* levels
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_levelsOffset_", declaredType="U8*")
	public U8Pointer levels() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtModuleInfo._levelsOffset_));
	}

	// U8* levels
	public PointerPointer levelsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._levelsOffset_));
	}

	// I32 moduleId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleIdOffset_", declaredType="I32")
	public IDATA moduleId() throws CorruptDataException {
		return new I32(getIntAtOffset(UtModuleInfo._moduleIdOffset_));
	}

	// I32 moduleId
	public IDATAPointer moduleIdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtModuleInfo._moduleIdOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtModuleInfo._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._nameOffset_));
	}

	// I32 namelength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_namelengthOffset_", declaredType="I32")
	public IDATA namelength() throws CorruptDataException {
		return new I32(getIntAtOffset(UtModuleInfo._namelengthOffset_));
	}

	// I32 namelength
	public IDATAPointer namelengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtModuleInfo._namelengthOffset_));
	}

	// UtModuleInfo* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtModuleInfo*")
	public UtModuleInfoPointer next() throws CorruptDataException {
		return UtModuleInfoPointer.cast(getPointerAtOffset(UtModuleInfo._nextOffset_));
	}

	// UtModuleInfo* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._nextOffset_));
	}

	// U8* properties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_propertiesOffset_", declaredType="U8*")
	public U8Pointer properties() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtModuleInfo._propertiesOffset_));
	}

	// U8* properties
	public PointerPointer propertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._propertiesOffset_));
	}

	// U32 referenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceCountOffset_", declaredType="U32")
	public UDATA referenceCount() throws CorruptDataException {
		return new U32(getIntAtOffset(UtModuleInfo._referenceCountOffset_));
	}

	// U32 referenceCount
	public UDATAPointer referenceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtModuleInfo._referenceCountOffset_));
	}

	// UtTraceVersionInfo* traceVersionInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceVersionInfoOffset_", declaredType="UtTraceVersionInfo*")
	public UtTraceVersionInfoPointer traceVersionInfo() throws CorruptDataException {
		return UtTraceVersionInfoPointer.cast(getPointerAtOffset(UtModuleInfo._traceVersionInfoOffset_));
	}

	// UtTraceVersionInfo* traceVersionInfo
	public PointerPointer traceVersionInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtModuleInfo._traceVersionInfoOffset_));
	}

}
