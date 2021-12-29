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
 * Structure: MM_IndexableObjectAllocationModelPointer
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
 * The generated code will provide getters for all elements in the MM_IndexableObjectAllocationModelPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_IndexableObjectAllocationModel.class)
public class MM_IndexableObjectAllocationModelPointer extends MM_JavaObjectAllocationModelPointer {

	// NULL
	public static final MM_IndexableObjectAllocationModelPointer NULL = new MM_IndexableObjectAllocationModelPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_IndexableObjectAllocationModelPointer(long address) {
		super(address);
	}

	public static MM_IndexableObjectAllocationModelPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_IndexableObjectAllocationModelPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_IndexableObjectAllocationModelPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_IndexableObjectAllocationModelPointer(address);
	}

	public MM_IndexableObjectAllocationModelPointer add(long count) {
		return MM_IndexableObjectAllocationModelPointer.cast(address + (MM_IndexableObjectAllocationModel.SIZEOF * count));
	}

	public MM_IndexableObjectAllocationModelPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_IndexableObjectAllocationModelPointer addOffset(long offset) {
		return MM_IndexableObjectAllocationModelPointer.cast(address + offset);
	}

	public MM_IndexableObjectAllocationModelPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_IndexableObjectAllocationModelPointer sub(long count) {
		return MM_IndexableObjectAllocationModelPointer.cast(address - (MM_IndexableObjectAllocationModel.SIZEOF * count));
	}

	public MM_IndexableObjectAllocationModelPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_IndexableObjectAllocationModelPointer subOffset(long offset) {
		return MM_IndexableObjectAllocationModelPointer.cast(address - offset);
	}

	public MM_IndexableObjectAllocationModelPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_IndexableObjectAllocationModelPointer untag(long mask) {
		return MM_IndexableObjectAllocationModelPointer.cast(address & ~mask);
	}

	public MM_IndexableObjectAllocationModelPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_IndexableObjectAllocationModel.SIZEOF;
	}

	// Implementation methods

	// const bool _alignSpineDataSection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__alignSpineDataSectionOffset_", declaredType="const bool")
	public boolean _alignSpineDataSection() throws CorruptDataException {
		return getBoolAtOffset(MM_IndexableObjectAllocationModel.__alignSpineDataSectionOffset_);
	}

	// const bool _alignSpineDataSection
	public BoolPointer _alignSpineDataSectionEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_IndexableObjectAllocationModel.__alignSpineDataSectionOffset_));
	}

	// const U64 _dataSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataSizeOffset_", declaredType="const U64")
	public UDATA _dataSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_IndexableObjectAllocationModel.__dataSizeOffset_));
	}

	// const U64 _dataSize
	public UDATAPointer _dataSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IndexableObjectAllocationModel.__dataSizeOffset_));
	}

	// const ArrayLayout _layout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__layoutOffset_", declaredType="const ArrayLayout")
	public long _layout() throws CorruptDataException {
		if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 1) {
			return getByteAtOffset(MM_IndexableObjectAllocationModel.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 2) {
			return getShortAtOffset(MM_IndexableObjectAllocationModel.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 4) {
			return getIntAtOffset(MM_IndexableObjectAllocationModel.__layoutOffset_);
		} else if (GC_ArrayletObjectModelBase$ArrayLayout.SIZEOF == 8) {
			return getLongAtOffset(MM_IndexableObjectAllocationModel.__layoutOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// const ArrayLayout _layout
	public EnumPointer _layoutEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_IndexableObjectAllocationModel.__layoutOffset_), GC_ArrayletObjectModelBase$ArrayLayout.class);
	}

	// const U64 _numberOfArraylets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numberOfArrayletsOffset_", declaredType="const U64")
	public UDATA _numberOfArraylets() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_IndexableObjectAllocationModel.__numberOfArrayletsOffset_));
	}

	// const U64 _numberOfArraylets
	public UDATAPointer _numberOfArrayletsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IndexableObjectAllocationModel.__numberOfArrayletsOffset_));
	}

	// const U32 _numberOfIndexedFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numberOfIndexedFieldsOffset_", declaredType="const U32")
	public UDATA _numberOfIndexedFields() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_IndexableObjectAllocationModel.__numberOfIndexedFieldsOffset_));
	}

	// const U32 _numberOfIndexedFields
	public UDATAPointer _numberOfIndexedFieldsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_IndexableObjectAllocationModel.__numberOfIndexedFieldsOffset_));
	}

}
