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
 * Structure: J9InternalVMLabelsPointer
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
 * The generated code will provide getters for all elements in the J9InternalVMLabelsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9InternalVMLabels.class)
public class J9InternalVMLabelsPointer extends StructurePointer {

	// NULL
	public static final J9InternalVMLabelsPointer NULL = new J9InternalVMLabelsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9InternalVMLabelsPointer(long address) {
		super(address);
	}

	public static J9InternalVMLabelsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9InternalVMLabelsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9InternalVMLabelsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9InternalVMLabelsPointer(address);
	}

	public J9InternalVMLabelsPointer add(long count) {
		return J9InternalVMLabelsPointer.cast(address + (J9InternalVMLabels.SIZEOF * count));
	}

	public J9InternalVMLabelsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9InternalVMLabelsPointer addOffset(long offset) {
		return J9InternalVMLabelsPointer.cast(address + offset);
	}

	public J9InternalVMLabelsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9InternalVMLabelsPointer sub(long count) {
		return J9InternalVMLabelsPointer.cast(address - (J9InternalVMLabels.SIZEOF * count));
	}

	public J9InternalVMLabelsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9InternalVMLabelsPointer subOffset(long offset) {
		return J9InternalVMLabelsPointer.cast(address - offset);
	}

	public J9InternalVMLabelsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9InternalVMLabelsPointer untag(long mask) {
		return J9InternalVMLabelsPointer.cast(address & ~mask);
	}

	public J9InternalVMLabelsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9InternalVMLabels.SIZEOF;
	}

	// Implementation methods

	// void* VMprJavaSendNative
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_VMprJavaSendNativeOffset_", declaredType="void*")
	public VoidPointer VMprJavaSendNative() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._VMprJavaSendNativeOffset_));
	}

	// void* VMprJavaSendNative
	public PointerPointer VMprJavaSendNativeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._VMprJavaSendNativeOffset_));
	}

	// void* cInterpreter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cInterpreterOffset_", declaredType="void*")
	public VoidPointer cInterpreter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._cInterpreterOffset_));
	}

	// void* cInterpreter
	public PointerPointer cInterpreterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._cInterpreterOffset_));
	}

	// void* executeCurrentBytecode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_executeCurrentBytecodeOffset_", declaredType="void*")
	public VoidPointer executeCurrentBytecode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._executeCurrentBytecodeOffset_));
	}

	// void* executeCurrentBytecode
	public PointerPointer executeCurrentBytecodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._executeCurrentBytecodeOffset_));
	}

	// void* handlePopFrames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlePopFramesOffset_", declaredType="void*")
	public VoidPointer handlePopFrames() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._handlePopFramesOffset_));
	}

	// void* handlePopFrames
	public PointerPointer handlePopFramesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._handlePopFramesOffset_));
	}

	// void* javaCheckAsyncEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaCheckAsyncEventsOffset_", declaredType="void*")
	public VoidPointer javaCheckAsyncEvents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._javaCheckAsyncEventsOffset_));
	}

	// void* javaCheckAsyncEvents
	public PointerPointer javaCheckAsyncEventsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._javaCheckAsyncEventsOffset_));
	}

	// void* javaStackOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaStackOverflowOffset_", declaredType="void*")
	public VoidPointer javaStackOverflow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._javaStackOverflowOffset_));
	}

	// void* javaStackOverflow
	public PointerPointer javaStackOverflowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._javaStackOverflowOffset_));
	}

	// void* runJNIHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runJNIHandlerOffset_", declaredType="void*")
	public VoidPointer runJNIHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._runJNIHandlerOffset_));
	}

	// void* runJNIHandler
	public PointerPointer runJNIHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._runJNIHandlerOffset_));
	}

	// void* runJavaHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runJavaHandlerOffset_", declaredType="void*")
	public VoidPointer runJavaHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._runJavaHandlerOffset_));
	}

	// void* runJavaHandler
	public PointerPointer runJavaHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._runJavaHandlerOffset_));
	}

	// void* runMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runMethodOffset_", declaredType="void*")
	public VoidPointer runMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._runMethodOffset_));
	}

	// void* runMethod
	public PointerPointer runMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._runMethodOffset_));
	}

	// void* runMethodHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runMethodHandleOffset_", declaredType="void*")
	public VoidPointer runMethodHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._runMethodHandleOffset_));
	}

	// void* runMethodHandle
	public PointerPointer runMethodHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._runMethodHandleOffset_));
	}

	// void* runMethodInterpreted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runMethodInterpretedOffset_", declaredType="void*")
	public VoidPointer runMethodInterpreted() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._runMethodInterpretedOffset_));
	}

	// void* runMethodInterpreted
	public PointerPointer runMethodInterpretedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._runMethodInterpretedOffset_));
	}

	// void* throwCurrentException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwCurrentExceptionOffset_", declaredType="void*")
	public VoidPointer throwCurrentException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._throwCurrentExceptionOffset_));
	}

	// void* throwCurrentException
	public PointerPointer throwCurrentExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._throwCurrentExceptionOffset_));
	}

	// void* throwException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwExceptionOffset_", declaredType="void*")
	public VoidPointer throwException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._throwExceptionOffset_));
	}

	// void* throwException
	public PointerPointer throwExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._throwExceptionOffset_));
	}

	// void* throwExceptionNLS
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwExceptionNLSOffset_", declaredType="void*")
	public VoidPointer throwExceptionNLS() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._throwExceptionNLSOffset_));
	}

	// void* throwExceptionNLS
	public PointerPointer throwExceptionNLSEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._throwExceptionNLSOffset_));
	}

	// void* throwHeapOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwHeapOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer throwHeapOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._throwHeapOutOfMemoryErrorOffset_));
	}

	// void* throwHeapOutOfMemoryError
	public PointerPointer throwHeapOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._throwHeapOutOfMemoryErrorOffset_));
	}

	// void* throwNativeOutOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwNativeOutOfMemoryErrorOffset_", declaredType="void*")
	public VoidPointer throwNativeOutOfMemoryError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalVMLabels._throwNativeOutOfMemoryErrorOffset_));
	}

	// void* throwNativeOutOfMemoryError
	public PointerPointer throwNativeOutOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalVMLabels._throwNativeOutOfMemoryErrorOffset_));
	}

}
