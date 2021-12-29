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
 * Structure: ClassFileOracle$StackMapFrameInfoPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$StackMapFrameInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$StackMapFrameInfo.class)
public class ClassFileOracle$StackMapFrameInfoPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$StackMapFrameInfoPointer NULL = new ClassFileOracle$StackMapFrameInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$StackMapFrameInfoPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$StackMapFrameInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$StackMapFrameInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$StackMapFrameInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$StackMapFrameInfoPointer(address);
	}

	public ClassFileOracle$StackMapFrameInfoPointer add(long count) {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(address + (ClassFileOracle$StackMapFrameInfo.SIZEOF * count));
	}

	public ClassFileOracle$StackMapFrameInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$StackMapFrameInfoPointer addOffset(long offset) {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(address + offset);
	}

	public ClassFileOracle$StackMapFrameInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$StackMapFrameInfoPointer sub(long count) {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(address - (ClassFileOracle$StackMapFrameInfo.SIZEOF * count));
	}

	public ClassFileOracle$StackMapFrameInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$StackMapFrameInfoPointer subOffset(long offset) {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(address - offset);
	}

	public ClassFileOracle$StackMapFrameInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$StackMapFrameInfoPointer untag(long mask) {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(address & ~mask);
	}

	public ClassFileOracle$StackMapFrameInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$StackMapFrameInfo.SIZEOF;
	}

	// Implementation methods

	// U8 frameType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameTypeOffset_", declaredType="U8")
	public U8 frameType() throws CorruptDataException {
		return new U8(getByteAtOffset(ClassFileOracle$StackMapFrameInfo._frameTypeOffset_));
	}

	// U8 frameType
	public U8Pointer frameTypeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._frameTypeOffset_));
	}

	// U16 localsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localsCountOffset_", declaredType="U16")
	public U16 localsCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$StackMapFrameInfo._localsCountOffset_));
	}

	// U16 localsCount
	public U16Pointer localsCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._localsCountOffset_));
	}

	// U8* localsTypeInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localsTypeInfoOffset_", declaredType="U8*")
	public U8Pointer localsTypeInfo() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileOracle$StackMapFrameInfo._localsTypeInfoOffset_));
	}

	// U8* localsTypeInfo
	public PointerPointer localsTypeInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._localsTypeInfoOffset_));
	}

	// U16 offsetDelta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_offsetDeltaOffset_", declaredType="U16")
	public U16 offsetDelta() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$StackMapFrameInfo._offsetDeltaOffset_));
	}

	// U16 offsetDelta
	public U16Pointer offsetDeltaEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._offsetDeltaOffset_));
	}

	// U16 stackItemsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackItemsCountOffset_", declaredType="U16")
	public U16 stackItemsCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$StackMapFrameInfo._stackItemsCountOffset_));
	}

	// U16 stackItemsCount
	public U16Pointer stackItemsCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._stackItemsCountOffset_));
	}

	// U8* stackItemsTypeInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackItemsTypeInfoOffset_", declaredType="U8*")
	public U8Pointer stackItemsTypeInfo() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileOracle$StackMapFrameInfo._stackItemsTypeInfoOffset_));
	}

	// U8* stackItemsTypeInfo
	public PointerPointer stackItemsTypeInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$StackMapFrameInfo._stackItemsTypeInfoOffset_));
	}

}
