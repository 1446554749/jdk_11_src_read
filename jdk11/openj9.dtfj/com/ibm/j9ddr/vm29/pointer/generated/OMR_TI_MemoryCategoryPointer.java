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
 * Structure: OMR_TI_MemoryCategoryPointer
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
 * The generated code will provide getters for all elements in the OMR_TI_MemoryCategoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_TI_MemoryCategory.class)
public class OMR_TI_MemoryCategoryPointer extends StructurePointer {

	// NULL
	public static final OMR_TI_MemoryCategoryPointer NULL = new OMR_TI_MemoryCategoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_TI_MemoryCategoryPointer(long address) {
		super(address);
	}

	public static OMR_TI_MemoryCategoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_TI_MemoryCategoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_TI_MemoryCategoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_TI_MemoryCategoryPointer(address);
	}

	public OMR_TI_MemoryCategoryPointer add(long count) {
		return OMR_TI_MemoryCategoryPointer.cast(address + (OMR_TI_MemoryCategory.SIZEOF * count));
	}

	public OMR_TI_MemoryCategoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_TI_MemoryCategoryPointer addOffset(long offset) {
		return OMR_TI_MemoryCategoryPointer.cast(address + offset);
	}

	public OMR_TI_MemoryCategoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_TI_MemoryCategoryPointer sub(long count) {
		return OMR_TI_MemoryCategoryPointer.cast(address - (OMR_TI_MemoryCategory.SIZEOF * count));
	}

	public OMR_TI_MemoryCategoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_TI_MemoryCategoryPointer subOffset(long offset) {
		return OMR_TI_MemoryCategoryPointer.cast(address - offset);
	}

	public OMR_TI_MemoryCategoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_TI_MemoryCategoryPointer untag(long mask) {
		return OMR_TI_MemoryCategoryPointer.cast(address & ~mask);
	}

	public OMR_TI_MemoryCategoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_TI_MemoryCategory.SIZEOF;
	}

	// Implementation methods

	// OMR_TI_MemoryCategory* firstChild
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstChildOffset_", declaredType="OMR_TI_MemoryCategory*")
	public OMR_TI_MemoryCategoryPointer firstChild() throws CorruptDataException {
		return OMR_TI_MemoryCategoryPointer.cast(getPointerAtOffset(OMR_TI_MemoryCategory._firstChildOffset_));
	}

	// OMR_TI_MemoryCategory* firstChild
	public PointerPointer firstChildEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._firstChildOffset_));
	}

	// I64 liveAllocationsDeep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveAllocationsDeepOffset_", declaredType="I64")
	public IDATA liveAllocationsDeep() throws CorruptDataException {
		return new I64(getLongAtOffset(OMR_TI_MemoryCategory._liveAllocationsDeepOffset_));
	}

	// I64 liveAllocationsDeep
	public IDATAPointer liveAllocationsDeepEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._liveAllocationsDeepOffset_));
	}

	// I64 liveAllocationsShallow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveAllocationsShallowOffset_", declaredType="I64")
	public IDATA liveAllocationsShallow() throws CorruptDataException {
		return new I64(getLongAtOffset(OMR_TI_MemoryCategory._liveAllocationsShallowOffset_));
	}

	// I64 liveAllocationsShallow
	public IDATAPointer liveAllocationsShallowEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._liveAllocationsShallowOffset_));
	}

	// I64 liveBytesDeep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveBytesDeepOffset_", declaredType="I64")
	public IDATA liveBytesDeep() throws CorruptDataException {
		return new I64(getLongAtOffset(OMR_TI_MemoryCategory._liveBytesDeepOffset_));
	}

	// I64 liveBytesDeep
	public IDATAPointer liveBytesDeepEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._liveBytesDeepOffset_));
	}

	// I64 liveBytesShallow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveBytesShallowOffset_", declaredType="I64")
	public IDATA liveBytesShallow() throws CorruptDataException {
		return new I64(getLongAtOffset(OMR_TI_MemoryCategory._liveBytesShallowOffset_));
	}

	// I64 liveBytesShallow
	public IDATAPointer liveBytesShallowEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._liveBytesShallowOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMR_TI_MemoryCategory._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._nameOffset_));
	}

	// OMR_TI_MemoryCategory* nextSibling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextSiblingOffset_", declaredType="OMR_TI_MemoryCategory*")
	public OMR_TI_MemoryCategoryPointer nextSibling() throws CorruptDataException {
		return OMR_TI_MemoryCategoryPointer.cast(getPointerAtOffset(OMR_TI_MemoryCategory._nextSiblingOffset_));
	}

	// OMR_TI_MemoryCategory* nextSibling
	public PointerPointer nextSiblingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._nextSiblingOffset_));
	}

	// OMR_TI_MemoryCategory* parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parentOffset_", declaredType="OMR_TI_MemoryCategory*")
	public OMR_TI_MemoryCategoryPointer parent() throws CorruptDataException {
		return OMR_TI_MemoryCategoryPointer.cast(getPointerAtOffset(OMR_TI_MemoryCategory._parentOffset_));
	}

	// OMR_TI_MemoryCategory* parent
	public PointerPointer parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI_MemoryCategory._parentOffset_));
	}

}
