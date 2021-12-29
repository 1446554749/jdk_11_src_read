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
 * Structure: ClassFileOracle$MethodInfoPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$MethodInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$MethodInfo.class)
public class ClassFileOracle$MethodInfoPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$MethodInfoPointer NULL = new ClassFileOracle$MethodInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$MethodInfoPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$MethodInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$MethodInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$MethodInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$MethodInfoPointer(address);
	}

	public ClassFileOracle$MethodInfoPointer add(long count) {
		return ClassFileOracle$MethodInfoPointer.cast(address + (ClassFileOracle$MethodInfo.SIZEOF * count));
	}

	public ClassFileOracle$MethodInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$MethodInfoPointer addOffset(long offset) {
		return ClassFileOracle$MethodInfoPointer.cast(address + offset);
	}

	public ClassFileOracle$MethodInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$MethodInfoPointer sub(long count) {
		return ClassFileOracle$MethodInfoPointer.cast(address - (ClassFileOracle$MethodInfo.SIZEOF * count));
	}

	public ClassFileOracle$MethodInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$MethodInfoPointer subOffset(long offset) {
		return ClassFileOracle$MethodInfoPointer.cast(address - offset);
	}

	public ClassFileOracle$MethodInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$MethodInfoPointer untag(long mask) {
		return ClassFileOracle$MethodInfoPointer.cast(address & ~mask);
	}

	public ClassFileOracle$MethodInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$MethodInfo.SIZEOF;
	}

	// Implementation methods

	// J9CfrAttributeRuntimeVisibleAnnotations* annotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleAnnotations*")
	public J9CfrAttributeRuntimeVisibleAnnotationsPointer annotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._annotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleAnnotations* annotationsAttribute
	public PointerPointer annotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._annotationsAttributeOffset_));
	}

	// U32 byteCodeFixupCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteCodeFixupCountOffset_", declaredType="U32")
	public UDATA byteCodeFixupCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._byteCodeFixupCountOffset_));
	}

	// U32 byteCodeFixupCount
	public UDATAPointer byteCodeFixupCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._byteCodeFixupCountOffset_));
	}

	// ClassFileOracle$BytecodeFixupEntry* byteCodeFixupTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteCodeFixupTableOffset_", declaredType="ClassFileOracle$BytecodeFixupEntry*")
	public ClassFileOracle$BytecodeFixupEntryPointer byteCodeFixupTable() throws CorruptDataException {
		return ClassFileOracle$BytecodeFixupEntryPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._byteCodeFixupTableOffset_));
	}

	// ClassFileOracle$BytecodeFixupEntry* byteCodeFixupTable
	public PointerPointer byteCodeFixupTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._byteCodeFixupTableOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* codeTypeAnnotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeTypeAnnotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleTypeAnnotations*")
	public J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer codeTypeAnnotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._codeTypeAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* codeTypeAnnotationsAttribute
	public PointerPointer codeTypeAnnotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._codeTypeAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeAnnotationDefault* defaultAnnotationAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultAnnotationAttributeOffset_", declaredType="J9CfrAttributeAnnotationDefault*")
	public J9CfrAttributeAnnotationDefaultPointer defaultAnnotationAttribute() throws CorruptDataException {
		return J9CfrAttributeAnnotationDefaultPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._defaultAnnotationAttributeOffset_));
	}

	// J9CfrAttributeAnnotationDefault* defaultAnnotationAttribute
	public PointerPointer defaultAnnotationAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._defaultAnnotationAttributeOffset_));
	}

	// U16 exceptionsThrownCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionsThrownCountOffset_", declaredType="U16")
	public U16 exceptionsThrownCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$MethodInfo._exceptionsThrownCountOffset_));
	}

	// U16 exceptionsThrownCount
	public U16Pointer exceptionsThrownCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._exceptionsThrownCountOffset_));
	}

	// U32 extendedModifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extendedModifiersOffset_", declaredType="U32")
	public UDATA extendedModifiers() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._extendedModifiersOffset_));
	}

	// U32 extendedModifiers
	public UDATAPointer extendedModifiersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._extendedModifiersOffset_));
	}

	// U16 genericSignatureIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericSignatureIndexOffset_", declaredType="U16")
	public U16 genericSignatureIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$MethodInfo._genericSignatureIndexOffset_));
	}

	// U16 genericSignatureIndex
	public U16Pointer genericSignatureIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._genericSignatureIndexOffset_));
	}

	// bool hasFrameIteratorSkipAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasFrameIteratorSkipAnnotationOffset_", declaredType="bool")
	public boolean hasFrameIteratorSkipAnnotation() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle$MethodInfo._hasFrameIteratorSkipAnnotationOffset_);
	}

	// bool hasFrameIteratorSkipAnnotation
	public BoolPointer hasFrameIteratorSkipAnnotationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._hasFrameIteratorSkipAnnotationOffset_));
	}

	// bool isByteCodeFixupDone
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isByteCodeFixupDoneOffset_", declaredType="bool")
	public boolean isByteCodeFixupDone() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle$MethodInfo._isByteCodeFixupDoneOffset_);
	}

	// bool isByteCodeFixupDone
	public BoolPointer isByteCodeFixupDoneEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._isByteCodeFixupDoneOffset_));
	}

	// U32 lineNumbersCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lineNumbersCountOffset_", declaredType="U32")
	public UDATA lineNumbersCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._lineNumbersCountOffset_));
	}

	// U32 lineNumbersCount
	public UDATAPointer lineNumbersCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._lineNumbersCountOffset_));
	}

	// U8* lineNumbersInfoCompressed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lineNumbersInfoCompressedOffset_", declaredType="U8*")
	public U8Pointer lineNumbersInfoCompressed() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._lineNumbersInfoCompressedOffset_));
	}

	// U8* lineNumbersInfoCompressed
	public PointerPointer lineNumbersInfoCompressedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._lineNumbersInfoCompressedOffset_));
	}

	// U32 lineNumbersInfoCompressedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lineNumbersInfoCompressedSizeOffset_", declaredType="U32")
	public UDATA lineNumbersInfoCompressedSize() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._lineNumbersInfoCompressedSizeOffset_));
	}

	// U32 lineNumbersInfoCompressedSize
	public UDATAPointer lineNumbersInfoCompressedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._lineNumbersInfoCompressedSizeOffset_));
	}

	// U32 localVariablesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localVariablesCountOffset_", declaredType="U32")
	public UDATA localVariablesCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._localVariablesCountOffset_));
	}

	// U32 localVariablesCount
	public UDATAPointer localVariablesCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._localVariablesCountOffset_));
	}

	// ClassFileOracle$LocalVariableInfo* localVariablesInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localVariablesInfoOffset_", declaredType="ClassFileOracle$LocalVariableInfo*")
	public ClassFileOracle$LocalVariableInfoPointer localVariablesInfo() throws CorruptDataException {
		return ClassFileOracle$LocalVariableInfoPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._localVariablesInfoOffset_));
	}

	// ClassFileOracle$LocalVariableInfo* localVariablesInfo
	public PointerPointer localVariablesInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._localVariablesInfoOffset_));
	}

	// J9CfrAttributeMethodParameters* methodParametersAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodParametersAttributeOffset_", declaredType="J9CfrAttributeMethodParameters*")
	public J9CfrAttributeMethodParametersPointer methodParametersAttribute() throws CorruptDataException {
		return J9CfrAttributeMethodParametersPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._methodParametersAttributeOffset_));
	}

	// J9CfrAttributeMethodParameters* methodParametersAttribute
	public PointerPointer methodParametersAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._methodParametersAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* methodTypeAnnotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodTypeAnnotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleTypeAnnotations*")
	public J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer methodTypeAnnotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._methodTypeAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* methodTypeAnnotationsAttribute
	public PointerPointer methodTypeAnnotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._methodTypeAnnotationsAttributeOffset_));
	}

	// U32 modifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modifiersOffset_", declaredType="U32")
	public UDATA modifiers() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle$MethodInfo._modifiersOffset_));
	}

	// U32 modifiers
	public UDATAPointer modifiersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._modifiersOffset_));
	}

	// J9CfrAttributeRuntimeVisibleParameterAnnotations* parameterAnnotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parameterAnnotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleParameterAnnotations*")
	public J9CfrAttributeRuntimeVisibleParameterAnnotationsPointer parameterAnnotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleParameterAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._parameterAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleParameterAnnotations* parameterAnnotationsAttribute
	public PointerPointer parameterAnnotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._parameterAnnotationsAttributeOffset_));
	}

	// U8 sendSlotCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sendSlotCountOffset_", declaredType="U8")
	public U8 sendSlotCount() throws CorruptDataException {
		return new U8(getByteAtOffset(ClassFileOracle$MethodInfo._sendSlotCountOffset_));
	}

	// U8 sendSlotCount
	public U8Pointer sendSlotCountEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._sendSlotCountOffset_));
	}

	// U16 stackMapFramesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapFramesCountOffset_", declaredType="U16")
	public U16 stackMapFramesCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$MethodInfo._stackMapFramesCountOffset_));
	}

	// U16 stackMapFramesCount
	public U16Pointer stackMapFramesCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._stackMapFramesCountOffset_));
	}

	// ClassFileOracle$StackMapFrameInfo* stackMapFramesInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapFramesInfoOffset_", declaredType="ClassFileOracle$StackMapFrameInfo*")
	public ClassFileOracle$StackMapFrameInfoPointer stackMapFramesInfo() throws CorruptDataException {
		return ClassFileOracle$StackMapFrameInfoPointer.cast(getPointerAtOffset(ClassFileOracle$MethodInfo._stackMapFramesInfoOffset_));
	}

	// ClassFileOracle$StackMapFrameInfo* stackMapFramesInfo
	public PointerPointer stackMapFramesInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodInfo._stackMapFramesInfoOffset_));
	}

}
