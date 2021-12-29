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
 * Structure: SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer
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
 * The generated code will provide getters for all elements in the SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.class)
public class SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer extends SH_ROMClassResourceManager$SH_ResourceDescriptorPointer {

	// NULL
	public static final SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer NULL = new SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer(long address) {
		super(address);
	}

	public static SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer(address);
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer add(long count) {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer.cast(address + (SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.SIZEOF * count));
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer addOffset(long offset) {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer.cast(address + offset);
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer sub(long count) {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer.cast(address - (SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.SIZEOF * count));
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer subOffset(long offset) {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer.cast(address - offset);
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer untag(long mask) {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer.cast(address & ~mask);
	}

	public SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.SIZEOF;
	}

	// Implementation methods

	// const U32 _codeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__codeSizeOffset_", declaredType="const U32")
	public UDATA _codeSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__codeSizeOffset_));
	}

	// const U32 _codeSize
	public UDATAPointer _codeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__codeSizeOffset_));
	}

	// const U8* _codeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__codeStartOffset_", declaredType="const U8*")
	public U8Pointer _codeStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__codeStartOffset_));
	}

	// const U8* _codeStart
	public PointerPointer _codeStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__codeStartOffset_));
	}

	// const U32 _dataSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataSizeOffset_", declaredType="const U32")
	public UDATA _dataSize() throws CorruptDataException {
		return new U32(getIntAtOffset(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__dataSizeOffset_));
	}

	// const U32 _dataSize
	public UDATAPointer _dataSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__dataSizeOffset_));
	}

	// const U8* _dataStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dataStartOffset_", declaredType="const U8*")
	public U8Pointer _dataStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__dataStartOffset_));
	}

	// const U8* _dataStart
	public PointerPointer _dataStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_CompiledMethodManager$SH_CompiledMethodResourceDescriptor.__dataStartOffset_));
	}

}
