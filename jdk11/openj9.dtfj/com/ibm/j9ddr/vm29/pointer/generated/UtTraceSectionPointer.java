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
 * Structure: UtTraceSectionPointer
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
 * The generated code will provide getters for all elements in the UtTraceSectionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceSection.class)
public class UtTraceSectionPointer extends StructurePointer {

	// NULL
	public static final UtTraceSectionPointer NULL = new UtTraceSectionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceSectionPointer(long address) {
		super(address);
	}

	public static UtTraceSectionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceSectionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceSectionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceSectionPointer(address);
	}

	public UtTraceSectionPointer add(long count) {
		return UtTraceSectionPointer.cast(address + (UtTraceSection.SIZEOF * count));
	}

	public UtTraceSectionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceSectionPointer addOffset(long offset) {
		return UtTraceSectionPointer.cast(address + offset);
	}

	public UtTraceSectionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceSectionPointer sub(long count) {
		return UtTraceSectionPointer.cast(address - (UtTraceSection.SIZEOF * count));
	}

	public UtTraceSectionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceSectionPointer subOffset(long offset) {
		return UtTraceSectionPointer.cast(address - offset);
	}

	public UtTraceSectionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceSectionPointer untag(long mask) {
		return UtTraceSectionPointer.cast(address & ~mask);
	}

	public UtTraceSectionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceSection.SIZEOF;
	}

	// Implementation methods

	// I32 generations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_generationsOffset_", declaredType="I32")
	public IDATA generations() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceSection._generationsOffset_));
	}

	// I32 generations
	public IDATAPointer generationsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceSection._generationsOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtTraceSection._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceSection._headerOffset_));
	}

	// I32 pointerSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pointerSizeOffset_", declaredType="I32")
	public IDATA pointerSize() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceSection._pointerSizeOffset_));
	}

	// I32 pointerSize
	public IDATAPointer pointerSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceSection._pointerSizeOffset_));
	}

	// U64 startPlatform
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPlatformOffset_", declaredType="U64")
	public UDATA startPlatform() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceSection._startPlatformOffset_));
	}

	// U64 startPlatform
	public UDATAPointer startPlatformEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceSection._startPlatformOffset_));
	}

	// U64 startSystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startSystemOffset_", declaredType="U64")
	public UDATA startSystem() throws CorruptDataException {
		return new U64(getLongAtOffset(UtTraceSection._startSystemOffset_));
	}

	// U64 startSystem
	public UDATAPointer startSystemEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtTraceSection._startSystemOffset_));
	}

	// I32 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="I32")
	public IDATA type() throws CorruptDataException {
		return new I32(getIntAtOffset(UtTraceSection._typeOffset_));
	}

	// I32 type
	public IDATAPointer typeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtTraceSection._typeOffset_));
	}

}
