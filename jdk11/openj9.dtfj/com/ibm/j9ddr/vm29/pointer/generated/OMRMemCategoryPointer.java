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
 * Structure: OMRMemCategoryPointer
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
 * The generated code will provide getters for all elements in the OMRMemCategoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRMemCategory.class)
public class OMRMemCategoryPointer extends StructurePointer {

	// NULL
	public static final OMRMemCategoryPointer NULL = new OMRMemCategoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRMemCategoryPointer(long address) {
		super(address);
	}

	public static OMRMemCategoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRMemCategoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRMemCategoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRMemCategoryPointer(address);
	}

	public OMRMemCategoryPointer add(long count) {
		return OMRMemCategoryPointer.cast(address + (OMRMemCategory.SIZEOF * count));
	}

	public OMRMemCategoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRMemCategoryPointer addOffset(long offset) {
		return OMRMemCategoryPointer.cast(address + offset);
	}

	public OMRMemCategoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRMemCategoryPointer sub(long count) {
		return OMRMemCategoryPointer.cast(address - (OMRMemCategory.SIZEOF * count));
	}

	public OMRMemCategoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRMemCategoryPointer subOffset(long offset) {
		return OMRMemCategoryPointer.cast(address - offset);
	}

	public OMRMemCategoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRMemCategoryPointer untag(long mask) {
		return OMRMemCategoryPointer.cast(address & ~mask);
	}

	public OMRMemCategoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRMemCategory.SIZEOF;
	}

	// Implementation methods

	// const U32 categoryCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryCodeOffset_", declaredType="const U32")
	public UDATA categoryCode() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRMemCategory._categoryCodeOffset_));
	}

	// const U32 categoryCode
	public UDATAPointer categoryCodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRMemCategory._categoryCodeOffset_));
	}

	// const U32* children
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_childrenOffset_", declaredType="const U32*")
	public UDATAPointer children() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(OMRMemCategory._childrenOffset_));
	}

	// const U32* children
	public PointerPointer childrenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRMemCategory._childrenOffset_));
	}

	// U64 liveAllocations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveAllocationsOffset_", declaredType="U64")
	public UDATA liveAllocations() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRMemCategory._liveAllocationsOffset_));
	}

	// U64 liveAllocations
	public UDATAPointer liveAllocationsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRMemCategory._liveAllocationsOffset_));
	}

	// U64 liveBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveBytesOffset_", declaredType="U64")
	public UDATA liveBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRMemCategory._liveBytesOffset_));
	}

	// U64 liveBytes
	public UDATAPointer liveBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRMemCategory._liveBytesOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRMemCategory._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRMemCategory._nameOffset_));
	}

	// const U32 numberOfChildren
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfChildrenOffset_", declaredType="const U32")
	public UDATA numberOfChildren() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRMemCategory._numberOfChildrenOffset_));
	}

	// const U32 numberOfChildren
	public UDATAPointer numberOfChildrenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRMemCategory._numberOfChildrenOffset_));
	}

}
