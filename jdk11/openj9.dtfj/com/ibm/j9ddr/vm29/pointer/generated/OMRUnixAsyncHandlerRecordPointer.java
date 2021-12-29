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
 * Structure: OMRUnixAsyncHandlerRecordPointer
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
 * The generated code will provide getters for all elements in the OMRUnixAsyncHandlerRecordPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRUnixAsyncHandlerRecord.class)
public class OMRUnixAsyncHandlerRecordPointer extends StructurePointer {

	// NULL
	public static final OMRUnixAsyncHandlerRecordPointer NULL = new OMRUnixAsyncHandlerRecordPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRUnixAsyncHandlerRecordPointer(long address) {
		super(address);
	}

	public static OMRUnixAsyncHandlerRecordPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRUnixAsyncHandlerRecordPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRUnixAsyncHandlerRecordPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRUnixAsyncHandlerRecordPointer(address);
	}

	public OMRUnixAsyncHandlerRecordPointer add(long count) {
		return OMRUnixAsyncHandlerRecordPointer.cast(address + (OMRUnixAsyncHandlerRecord.SIZEOF * count));
	}

	public OMRUnixAsyncHandlerRecordPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRUnixAsyncHandlerRecordPointer addOffset(long offset) {
		return OMRUnixAsyncHandlerRecordPointer.cast(address + offset);
	}

	public OMRUnixAsyncHandlerRecordPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRUnixAsyncHandlerRecordPointer sub(long count) {
		return OMRUnixAsyncHandlerRecordPointer.cast(address - (OMRUnixAsyncHandlerRecord.SIZEOF * count));
	}

	public OMRUnixAsyncHandlerRecordPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRUnixAsyncHandlerRecordPointer subOffset(long offset) {
		return OMRUnixAsyncHandlerRecordPointer.cast(address - offset);
	}

	public OMRUnixAsyncHandlerRecordPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRUnixAsyncHandlerRecordPointer untag(long mask) {
		return OMRUnixAsyncHandlerRecordPointer.cast(address & ~mask);
	}

	public OMRUnixAsyncHandlerRecordPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRUnixAsyncHandlerRecord.SIZEOF;
	}

	// Implementation methods

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRUnixAsyncHandlerRecord._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRUnixAsyncHandlerRecord._flagsOffset_));
	}

	// omrsig_handler_fn handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlerOffset_", declaredType="omrsig_handler_fn")
	public VoidPointer handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRUnixAsyncHandlerRecord._handlerOffset_));
	}

	// omrsig_handler_fn handler
	public PointerPointer handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixAsyncHandlerRecord._handlerOffset_));
	}

	// void* handler_arg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handler_argOffset_", declaredType="void*")
	public VoidPointer handler_arg() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRUnixAsyncHandlerRecord._handler_argOffset_));
	}

	// void* handler_arg
	public PointerPointer handler_argEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixAsyncHandlerRecord._handler_argOffset_));
	}

	// OMRUnixAsyncHandlerRecord* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="OMRUnixAsyncHandlerRecord*")
	public OMRUnixAsyncHandlerRecordPointer next() throws CorruptDataException {
		return OMRUnixAsyncHandlerRecordPointer.cast(getPointerAtOffset(OMRUnixAsyncHandlerRecord._nextOffset_));
	}

	// OMRUnixAsyncHandlerRecord* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixAsyncHandlerRecord._nextOffset_));
	}

	// OMRPortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLib() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(OMRUnixAsyncHandlerRecord._portLibOffset_));
	}

	// OMRPortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixAsyncHandlerRecord._portLibOffset_));
	}

}
