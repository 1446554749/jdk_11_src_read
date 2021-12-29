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
 * Structure: J9ThreadWalkStatePointer
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
 * The generated code will provide getters for all elements in the J9ThreadWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadWalkState.class)
public class J9ThreadWalkStatePointer extends StructurePointer {

	// NULL
	public static final J9ThreadWalkStatePointer NULL = new J9ThreadWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadWalkStatePointer(long address) {
		super(address);
	}

	public static J9ThreadWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadWalkStatePointer(address);
	}

	public J9ThreadWalkStatePointer add(long count) {
		return J9ThreadWalkStatePointer.cast(address + (J9ThreadWalkState.SIZEOF * count));
	}

	public J9ThreadWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadWalkStatePointer addOffset(long offset) {
		return J9ThreadWalkStatePointer.cast(address + offset);
	}

	public J9ThreadWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadWalkStatePointer sub(long count) {
		return J9ThreadWalkStatePointer.cast(address - (J9ThreadWalkState.SIZEOF * count));
	}

	public J9ThreadWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadWalkStatePointer subOffset(long offset) {
		return J9ThreadWalkStatePointer.cast(address - offset);
	}

	public J9ThreadWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadWalkStatePointer untag(long mask) {
		return J9ThreadWalkStatePointer.cast(address & ~mask);
	}

	public J9ThreadWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadWalkState.SIZEOF;
	}

	// Implementation methods

	// J9PlatformThread* current_thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_current_threadOffset_", declaredType="J9PlatformThread*")
	public J9PlatformThreadPointer current_thread() throws CorruptDataException {
		return J9PlatformThreadPointer.cast(getPointerAtOffset(J9ThreadWalkState._current_threadOffset_));
	}

	// J9PlatformThread* current_thread
	public PointerPointer current_threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadWalkState._current_threadOffset_));
	}

	// I64 deadline1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deadline1Offset_", declaredType="I64")
	public IDATA deadline1() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadWalkState._deadline1Offset_));
	}

	// I64 deadline1
	public IDATAPointer deadline1EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadWalkState._deadline1Offset_));
	}

	// I64 deadline2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deadline2Offset_", declaredType="I64")
	public IDATA deadline2() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadWalkState._deadline2Offset_));
	}

	// I64 deadline2
	public IDATAPointer deadline2EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadWalkState._deadline2Offset_));
	}

	// I64 error
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorOffset_", declaredType="I64")
	public IDATA error() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadWalkState._errorOffset_));
	}

	// I64 error
	public IDATAPointer errorEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadWalkState._errorOffset_));
	}

	// U64 error_detail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_detailOffset_", declaredType="U64")
	public UDATA error_detail() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadWalkState._error_detailOffset_));
	}

	// U64 error_detail
	public UDATAPointer error_detailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadWalkState._error_detailOffset_));
	}

	// const U8* error_string
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_stringOffset_", declaredType="const U8*")
	public U8Pointer error_string() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ThreadWalkState._error_stringOffset_));
	}

	// const U8* error_string
	public PointerPointer error_stringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadWalkState._error_stringOffset_));
	}

	// J9Heap* heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapOffset_", declaredType="J9Heap*")
	public J9HeapPointer heap() throws CorruptDataException {
		return J9HeapPointer.cast(getPointerAtOffset(J9ThreadWalkState._heapOffset_));
	}

	// J9Heap* heap
	public PointerPointer heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadWalkState._heapOffset_));
	}

	// void* platform_data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_platform_dataOffset_", declaredType="void*")
	public VoidPointer platform_data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadWalkState._platform_dataOffset_));
	}

	// void* platform_data
	public PointerPointer platform_dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadWalkState._platform_dataOffset_));
	}

	// OMRPortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(J9ThreadWalkState._portLibraryOffset_));
	}

	// OMRPortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadWalkState._portLibraryOffset_));
	}

}
