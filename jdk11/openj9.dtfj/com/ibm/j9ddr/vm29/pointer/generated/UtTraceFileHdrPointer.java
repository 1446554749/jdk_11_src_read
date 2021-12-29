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
 * Structure: UtTraceFileHdrPointer
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
 * The generated code will provide getters for all elements in the UtTraceFileHdrPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceFileHdr.class)
public class UtTraceFileHdrPointer extends StructurePointer {

	// NULL
	public static final UtTraceFileHdrPointer NULL = new UtTraceFileHdrPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceFileHdrPointer(long address) {
		super(address);
	}

	public static UtTraceFileHdrPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceFileHdrPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceFileHdrPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceFileHdrPointer(address);
	}

	public UtTraceFileHdrPointer add(long count) {
		return UtTraceFileHdrPointer.cast(address + (UtTraceFileHdr.SIZEOF * count));
	}

	public UtTraceFileHdrPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceFileHdrPointer addOffset(long offset) {
		return UtTraceFileHdrPointer.cast(address + offset);
	}

	public UtTraceFileHdrPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceFileHdrPointer sub(long count) {
		return UtTraceFileHdrPointer.cast(address - (UtTraceFileHdr.SIZEOF * count));
	}

	public UtTraceFileHdrPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceFileHdrPointer subOffset(long offset) {
		return UtTraceFileHdrPointer.cast(address - offset);
	}

	public UtTraceFileHdrPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceFileHdrPointer untag(long mask) {
		return UtTraceFileHdrPointer.cast(address & ~mask);
	}

	public UtTraceFileHdrPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceFileHdr.SIZEOF;
	}

	// Implementation methods

	// I32 activeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeStartOffset_", declaredType="I32")
	public IDATA activeStart() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._activeStartOffset_));
	}

	// I32 activeStart
	public IDATAPointer activeStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._activeStartOffset_));
	}

	// I32 bufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferSizeOffset_", declaredType="I32")
	public IDATA bufferSize() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._bufferSizeOffset_));
	}

	// I32 bufferSize
	public IDATAPointer bufferSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._bufferSizeOffset_));
	}

	// I32 endianSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endianSignatureOffset_", declaredType="I32")
	public IDATA endianSignature() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._endianSignatureOffset_));
	}

	// I32 endianSignature
	public IDATAPointer endianSignatureEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._endianSignatureOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtTraceFileHdr._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileHdr._headerOffset_));
	}

	// I32 processorStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processorStartOffset_", declaredType="I32")
	public IDATA processorStart() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._processorStartOffset_));
	}

	// I32 processorStart
	public IDATAPointer processorStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._processorStartOffset_));
	}

	// I32 serviceStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_serviceStartOffset_", declaredType="I32")
	public IDATA serviceStart() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._serviceStartOffset_));
	}

	// I32 serviceStart
	public IDATAPointer serviceStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._serviceStartOffset_));
	}

	// I32 startupStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startupStartOffset_", declaredType="I32")
	public IDATA startupStart() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._startupStartOffset_));
	}

	// I32 startupStart
	public IDATAPointer startupStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._startupStartOffset_));
	}

	// UtTraceSection traceSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceSectionOffset_", declaredType="UtTraceSection")
	public UtTraceSectionPointer traceSection() throws CorruptDataException {
		return UtTraceSectionPointer.cast(nonNullFieldEA(UtTraceFileHdr._traceSectionOffset_));
	}

	// UtTraceSection traceSection
	public PointerPointer traceSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileHdr._traceSectionOffset_));
	}

	// I32 traceStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceStartOffset_", declaredType="I32")
	public IDATA traceStart() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceFileHdr._traceStartOffset_));
	}

	// I32 traceStart
	public IDATAPointer traceStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileHdr._traceStartOffset_));
	}

}
