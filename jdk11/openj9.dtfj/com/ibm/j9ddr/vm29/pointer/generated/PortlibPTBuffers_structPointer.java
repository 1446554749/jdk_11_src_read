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
 * Structure: PortlibPTBuffers_structPointer
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
 * The generated code will provide getters for all elements in the PortlibPTBuffers_structPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=PortlibPTBuffers_struct.class)
public class PortlibPTBuffers_structPointer extends StructurePointer {

	// NULL
	public static final PortlibPTBuffers_structPointer NULL = new PortlibPTBuffers_structPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected PortlibPTBuffers_structPointer(long address) {
		super(address);
	}

	public static PortlibPTBuffers_structPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static PortlibPTBuffers_structPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static PortlibPTBuffers_structPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new PortlibPTBuffers_structPointer(address);
	}

	public PortlibPTBuffers_structPointer add(long count) {
		return PortlibPTBuffers_structPointer.cast(address + (PortlibPTBuffers_struct.SIZEOF * count));
	}

	public PortlibPTBuffers_structPointer add(Scalar count) {
		return add(count.longValue());
	}

	public PortlibPTBuffers_structPointer addOffset(long offset) {
		return PortlibPTBuffers_structPointer.cast(address + offset);
	}

	public PortlibPTBuffers_structPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public PortlibPTBuffers_structPointer sub(long count) {
		return PortlibPTBuffers_structPointer.cast(address - (PortlibPTBuffers_struct.SIZEOF * count));
	}

	public PortlibPTBuffers_structPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public PortlibPTBuffers_structPointer subOffset(long offset) {
		return PortlibPTBuffers_structPointer.cast(address - offset);
	}

	public PortlibPTBuffers_structPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public PortlibPTBuffers_structPointer untag(long mask) {
		return PortlibPTBuffers_structPointer.cast(address & ~mask);
	}

	public PortlibPTBuffers_structPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return PortlibPTBuffers_struct.SIZEOF;
	}

	// Implementation methods

	// iconv_t[] converterCache
	public PointerPointer converterCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._converterCacheOffset_));
	}

	// U8* errorMessageBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorMessageBufferOffset_", declaredType="U8*")
	public U8Pointer errorMessageBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(PortlibPTBuffers_struct._errorMessageBufferOffset_));
	}

	// U8* errorMessageBuffer
	public PointerPointer errorMessageBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._errorMessageBufferOffset_));
	}

	// U64 errorMessageBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorMessageBufferSizeOffset_", declaredType="U64")
	public UDATA errorMessageBufferSize() throws CorruptDataException {
		return new U64(getLongAtOffset(PortlibPTBuffers_struct._errorMessageBufferSizeOffset_));
	}

	// U64 errorMessageBufferSize
	public UDATAPointer errorMessageBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._errorMessageBufferSizeOffset_));
	}

	// PortlibPTBuffers_struct* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="PortlibPTBuffers_struct*")
	public PortlibPTBuffers_structPointer next() throws CorruptDataException {
		return PortlibPTBuffers_structPointer.cast(getPointerAtOffset(PortlibPTBuffers_struct._nextOffset_));
	}

	// PortlibPTBuffers_struct* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._nextOffset_));
	}

	// I32 platformErrorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_platformErrorCodeOffset_", declaredType="I32")
	public IDATA platformErrorCode() throws CorruptDataException {
		return new I32(getIntAtOffset(PortlibPTBuffers_struct._platformErrorCodeOffset_));
	}

	// I32 platformErrorCode
	public IDATAPointer platformErrorCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._platformErrorCodeOffset_));
	}

	// I32 portableErrorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portableErrorCodeOffset_", declaredType="I32")
	public IDATA portableErrorCode() throws CorruptDataException {
		return new I32(getIntAtOffset(PortlibPTBuffers_struct._portableErrorCodeOffset_));
	}

	// I32 portableErrorCode
	public IDATAPointer portableErrorCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._portableErrorCodeOffset_));
	}

	// PortlibPTBuffers_struct* previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousOffset_", declaredType="PortlibPTBuffers_struct*")
	public PortlibPTBuffers_structPointer previous() throws CorruptDataException {
		return PortlibPTBuffers_structPointer.cast(getPointerAtOffset(PortlibPTBuffers_struct._previousOffset_));
	}

	// PortlibPTBuffers_struct* previous
	public PointerPointer previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._previousOffset_));
	}

	// I32 reportedErrorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reportedErrorCodeOffset_", declaredType="I32")
	public IDATA reportedErrorCode() throws CorruptDataException {
		return new I32(getIntAtOffset(PortlibPTBuffers_struct._reportedErrorCodeOffset_));
	}

	// I32 reportedErrorCode
	public IDATAPointer reportedErrorCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._reportedErrorCodeOffset_));
	}

	// U8* reportedMessageBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reportedMessageBufferOffset_", declaredType="U8*")
	public U8Pointer reportedMessageBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(PortlibPTBuffers_struct._reportedMessageBufferOffset_));
	}

	// U8* reportedMessageBuffer
	public PointerPointer reportedMessageBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._reportedMessageBufferOffset_));
	}

	// U64 reportedMessageBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reportedMessageBufferSizeOffset_", declaredType="U64")
	public UDATA reportedMessageBufferSize() throws CorruptDataException {
		return new U64(getLongAtOffset(PortlibPTBuffers_struct._reportedMessageBufferSizeOffset_));
	}

	// U64 reportedMessageBufferSize
	public UDATAPointer reportedMessageBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PortlibPTBuffers_struct._reportedMessageBufferSizeOffset_));
	}

}
