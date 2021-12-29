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
 * Structure: UtTraceFileIteratorPointer
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
 * The generated code will provide getters for all elements in the UtTraceFileIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceFileIterator.class)
public class UtTraceFileIteratorPointer extends StructurePointer {

	// NULL
	public static final UtTraceFileIteratorPointer NULL = new UtTraceFileIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceFileIteratorPointer(long address) {
		super(address);
	}

	public static UtTraceFileIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceFileIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceFileIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceFileIteratorPointer(address);
	}

	public UtTraceFileIteratorPointer add(long count) {
		return UtTraceFileIteratorPointer.cast(address + (UtTraceFileIterator.SIZEOF * count));
	}

	public UtTraceFileIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceFileIteratorPointer addOffset(long offset) {
		return UtTraceFileIteratorPointer.cast(address + offset);
	}

	public UtTraceFileIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceFileIteratorPointer sub(long count) {
		return UtTraceFileIteratorPointer.cast(address - (UtTraceFileIterator.SIZEOF * count));
	}

	public UtTraceFileIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceFileIteratorPointer subOffset(long offset) {
		return UtTraceFileIteratorPointer.cast(address - offset);
	}

	public UtTraceFileIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceFileIteratorPointer untag(long mask) {
		return UtTraceFileIteratorPointer.cast(address & ~mask);
	}

	public UtTraceFileIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceFileIterator.SIZEOF;
	}

	// Implementation methods

	// UtActiveSection* activeSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeSectionOffset_", declaredType="UtActiveSection*")
	public UtActiveSectionPointer activeSection() throws CorruptDataException {
		return UtActiveSectionPointer.cast(getPointerAtOffset(UtTraceFileIterator._activeSectionOffset_));
	}

	// UtActiveSection* activeSection
	public PointerPointer activeSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._activeSectionOffset_));
	}

	// I64 currentPosition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentPositionOffset_", declaredType="I64")
	public IDATA currentPosition() throws CorruptDataException {
		return new I64(getLongAtOffset(UtTraceFileIterator._currentPositionOffset_));
	}

	// I64 currentPosition
	public IDATAPointer currentPositionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileIterator._currentPositionOffset_));
	}

	// FormatStringCallback getFormatStringFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFormatStringFnOffset_", declaredType="FormatStringCallback")
	public VoidPointer getFormatStringFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtTraceFileIterator._getFormatStringFnOffset_));
	}

	// FormatStringCallback getFormatStringFn
	public PointerPointer getFormatStringFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._getFormatStringFnOffset_));
	}

	// UtTraceFileHdr* header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtTraceFileHdr*")
	public UtTraceFileHdrPointer header() throws CorruptDataException {
		return UtTraceFileHdrPointer.cast(getPointerAtOffset(UtTraceFileIterator._headerOffset_));
	}

	// UtTraceFileHdr* header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._headerOffset_));
	}

	// OMRPortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLib() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(UtTraceFileIterator._portLibOffset_));
	}

	// OMRPortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._portLibOffset_));
	}

	// UtProcSection* procSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_procSectionOffset_", declaredType="UtProcSection*")
	public UtProcSectionPointer procSection() throws CorruptDataException {
		return UtProcSectionPointer.cast(getPointerAtOffset(UtTraceFileIterator._procSectionOffset_));
	}

	// UtProcSection* procSection
	public PointerPointer procSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._procSectionOffset_));
	}

	// UtServiceSection* serviceSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_serviceSectionOffset_", declaredType="UtServiceSection*")
	public UtServiceSectionPointer serviceSection() throws CorruptDataException {
		return UtServiceSectionPointer.cast(getPointerAtOffset(UtTraceFileIterator._serviceSectionOffset_));
	}

	// UtServiceSection* serviceSection
	public PointerPointer serviceSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._serviceSectionOffset_));
	}

	// UtStartupSection* startupSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startupSectionOffset_", declaredType="UtStartupSection*")
	public UtStartupSectionPointer startupSection() throws CorruptDataException {
		return UtStartupSectionPointer.cast(getPointerAtOffset(UtTraceFileIterator._startupSectionOffset_));
	}

	// UtStartupSection* startupSection
	public PointerPointer startupSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._startupSectionOffset_));
	}

	// I64 traceFileHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceFileHandleOffset_", declaredType="I64")
	public IDATA traceFileHandle() throws CorruptDataException {
		return new I64(getLongAtOffset(UtTraceFileIterator._traceFileHandleOffset_));
	}

	// I64 traceFileHandle
	public IDATAPointer traceFileHandleEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceFileIterator._traceFileHandleOffset_));
	}

	// UtTraceSection* traceSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceSectionOffset_", declaredType="UtTraceSection*")
	public UtTraceSectionPointer traceSection() throws CorruptDataException {
		return UtTraceSectionPointer.cast(getPointerAtOffset(UtTraceFileIterator._traceSectionOffset_));
	}

	// UtTraceSection* traceSection
	public PointerPointer traceSectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceFileIterator._traceSectionOffset_));
	}

}
