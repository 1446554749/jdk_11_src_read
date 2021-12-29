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
 * Structure: SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer
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
 * The generated code will provide getters for all elements in the SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.class)
public class SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer extends SH_ROMClassResourceManager$SH_ResourceDescriptorPointer {

	// NULL
	public static final SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer NULL = new SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer(long address) {
		super(address);
	}

	public static SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer(address);
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer add(long count) {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer.cast(address + (SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.SIZEOF * count));
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer addOffset(long offset) {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer.cast(address + offset);
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer sub(long count) {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer.cast(address - (SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.SIZEOF * count));
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer subOffset(long offset) {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer.cast(address - offset);
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer untag(long mask) {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer.cast(address & ~mask);
	}

	public SH_AttachedDataManager$SH_AttachedDataResourceDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.SIZEOF;
	}

	// Implementation methods

	// const U32 _dataSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataSizeOffset_", declaredType="const U32")
	public UDATA _dataSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__dataSizeOffset_));
	}

	// const U32 _dataSize
	public UDATAPointer _dataSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__dataSizeOffset_));
	}

	// const U8* _dataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataStartOffset_", declaredType="const U8*")
	public U8Pointer _dataStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__dataStartOffset_));
	}

	// const U8* _dataStart
	public PointerPointer _dataStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__dataStartOffset_));
	}

	// const U16 _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="const U16")
	public U16 _type() throws CorruptDataException {
		return new U16(getShortAtOffset(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__typeOffset_));
	}

	// const U16 _type
	public U16Pointer _typeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(SH_AttachedDataManager$SH_AttachedDataResourceDescriptor.__typeOffset_));
	}

}
