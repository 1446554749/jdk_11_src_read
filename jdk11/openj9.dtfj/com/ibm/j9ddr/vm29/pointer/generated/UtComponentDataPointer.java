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
 * Structure: UtComponentDataPointer
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
 * The generated code will provide getters for all elements in the UtComponentDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtComponentData.class)
public class UtComponentDataPointer extends StructurePointer {

	// NULL
	public static final UtComponentDataPointer NULL = new UtComponentDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtComponentDataPointer(long address) {
		super(address);
	}

	public static UtComponentDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtComponentDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtComponentDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtComponentDataPointer(address);
	}

	public UtComponentDataPointer add(long count) {
		return UtComponentDataPointer.cast(address + (UtComponentData.SIZEOF * count));
	}

	public UtComponentDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtComponentDataPointer addOffset(long offset) {
		return UtComponentDataPointer.cast(address + offset);
	}

	public UtComponentDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtComponentDataPointer sub(long count) {
		return UtComponentDataPointer.cast(address - (UtComponentData.SIZEOF * count));
	}

	public UtComponentDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtComponentDataPointer subOffset(long offset) {
		return UtComponentDataPointer.cast(address - offset);
	}

	public UtComponentDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtComponentDataPointer untag(long mask) {
		return UtComponentDataPointer.cast(address & ~mask);
	}

	public UtComponentDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtComponentData.SIZEOF;
	}

	// Implementation methods

	// I32 alreadyfailedtoloaddetails
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alreadyfailedtoloaddetailsOffset_", declaredType="I32")
	public IDATA alreadyfailedtoloaddetails() throws CorruptDataException {
		return new I32(getIntAtOffset(UtComponentData._alreadyfailedtoloaddetailsOffset_));
	}

	// I32 alreadyfailedtoloaddetails
	public IDATAPointer alreadyfailedtoloaddetailsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtComponentData._alreadyfailedtoloaddetailsOffset_));
	}

	// U8* componentName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_componentNameOffset_", declaredType="U8*")
	public U8Pointer componentName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtComponentData._componentNameOffset_));
	}

	// U8* componentName
	public PointerPointer componentNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._componentNameOffset_));
	}

	// U8* formatStringsFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_formatStringsFileNameOffset_", declaredType="U8*")
	public U8Pointer formatStringsFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtComponentData._formatStringsFileNameOffset_));
	}

	// U8* formatStringsFileName
	public PointerPointer formatStringsFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._formatStringsFileNameOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtComponentData._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._headerOffset_));
	}

	// UtModuleInfo* moduleInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleInfoOffset_", declaredType="UtModuleInfo*")
	public UtModuleInfoPointer moduleInfo() throws CorruptDataException {
		return UtModuleInfoPointer.cast(getPointerAtOffset(UtComponentData._moduleInfoOffset_));
	}

	// UtModuleInfo* moduleInfo
	public PointerPointer moduleInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._moduleInfoOffset_));
	}

	// UtComponentData* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtComponentData*")
	public UtComponentDataPointer next() throws CorruptDataException {
		return UtComponentDataPointer.cast(getPointerAtOffset(UtComponentData._nextOffset_));
	}

	// UtComponentData* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._nextOffset_));
	}

	// I32 numFormats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numFormatsOffset_", declaredType="I32")
	public IDATA numFormats() throws CorruptDataException {
		return new I32(getIntAtOffset(UtComponentData._numFormatsOffset_));
	}

	// I32 numFormats
	public IDATAPointer numFormatsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtComponentData._numFormatsOffset_));
	}

	// UtComponentData* prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevOffset_", declaredType="UtComponentData*")
	public UtComponentDataPointer prev() throws CorruptDataException {
		return UtComponentDataPointer.cast(getPointerAtOffset(UtComponentData._prevOffset_));
	}

	// UtComponentData* prev
	public PointerPointer prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._prevOffset_));
	}

	// U8* qualifiedComponentName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_qualifiedComponentNameOffset_", declaredType="U8*")
	public U8Pointer qualifiedComponentName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtComponentData._qualifiedComponentNameOffset_));
	}

	// U8* qualifiedComponentName
	public PointerPointer qualifiedComponentNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._qualifiedComponentNameOffset_));
	}

	// I32 tracepointCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracepointCountOffset_", declaredType="I32")
	public IDATA tracepointCount() throws CorruptDataException {
		return new I32(getIntAtOffset(UtComponentData._tracepointCountOffset_));
	}

	// I32 tracepointCount
	public IDATAPointer tracepointCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtComponentData._tracepointCountOffset_));
	}

	// void** tracepointFormattingStrings
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracepointFormattingStringsOffset_", declaredType="void**")
	public PointerPointer tracepointFormattingStrings() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(UtComponentData._tracepointFormattingStringsOffset_));
	}

	// void** tracepointFormattingStrings
	public PointerPointer tracepointFormattingStringsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._tracepointFormattingStringsOffset_));
	}

	// U64* tracepointcounters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracepointcountersOffset_", declaredType="U64*")
	public UDATAPointer tracepointcounters() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(UtComponentData._tracepointcountersOffset_));
	}

	// U64* tracepointcounters
	public PointerPointer tracepointcountersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtComponentData._tracepointcountersOffset_));
	}

}
