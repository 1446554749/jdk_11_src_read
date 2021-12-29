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
 * Structure: JNIInvokeInterface_Pointer
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
 * The generated code will provide getters for all elements in the JNIInvokeInterface_Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JNIInvokeInterface_.class)
public class JNIInvokeInterface_Pointer extends StructurePointer {

	// NULL
	public static final JNIInvokeInterface_Pointer NULL = new JNIInvokeInterface_Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JNIInvokeInterface_Pointer(long address) {
		super(address);
	}

	public static JNIInvokeInterface_Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JNIInvokeInterface_Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JNIInvokeInterface_Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JNIInvokeInterface_Pointer(address);
	}

	public JNIInvokeInterface_Pointer add(long count) {
		return JNIInvokeInterface_Pointer.cast(address + (JNIInvokeInterface_.SIZEOF * count));
	}

	public JNIInvokeInterface_Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public JNIInvokeInterface_Pointer addOffset(long offset) {
		return JNIInvokeInterface_Pointer.cast(address + offset);
	}

	public JNIInvokeInterface_Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JNIInvokeInterface_Pointer sub(long count) {
		return JNIInvokeInterface_Pointer.cast(address - (JNIInvokeInterface_.SIZEOF * count));
	}

	public JNIInvokeInterface_Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JNIInvokeInterface_Pointer subOffset(long offset) {
		return JNIInvokeInterface_Pointer.cast(address - offset);
	}

	public JNIInvokeInterface_Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JNIInvokeInterface_Pointer untag(long mask) {
		return JNIInvokeInterface_Pointer.cast(address & ~mask);
	}

	public JNIInvokeInterface_Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JNIInvokeInterface_.SIZEOF;
	}

	// Implementation methods

	// void* AttachCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AttachCurrentThreadOffset_", declaredType="void*")
	public VoidPointer AttachCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._AttachCurrentThreadOffset_));
	}

	// void* AttachCurrentThread
	public PointerPointer AttachCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._AttachCurrentThreadOffset_));
	}

	// void* AttachCurrentThreadAsDaemon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AttachCurrentThreadAsDaemonOffset_", declaredType="void*")
	public VoidPointer AttachCurrentThreadAsDaemon() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._AttachCurrentThreadAsDaemonOffset_));
	}

	// void* AttachCurrentThreadAsDaemon
	public PointerPointer AttachCurrentThreadAsDaemonEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._AttachCurrentThreadAsDaemonOffset_));
	}

	// void* DestroyJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DestroyJavaVMOffset_", declaredType="void*")
	public VoidPointer DestroyJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._DestroyJavaVMOffset_));
	}

	// void* DestroyJavaVM
	public PointerPointer DestroyJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._DestroyJavaVMOffset_));
	}

	// void* DetachCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DetachCurrentThreadOffset_", declaredType="void*")
	public VoidPointer DetachCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._DetachCurrentThreadOffset_));
	}

	// void* DetachCurrentThread
	public PointerPointer DetachCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._DetachCurrentThreadOffset_));
	}

	// void* GetEnv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetEnvOffset_", declaredType="void*")
	public VoidPointer GetEnv() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._GetEnvOffset_));
	}

	// void* GetEnv
	public PointerPointer GetEnvEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._GetEnvOffset_));
	}

	// void* reserved0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved0Offset_", declaredType="void*")
	public VoidPointer reserved0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._reserved0Offset_));
	}

	// void* reserved0
	public PointerPointer reserved0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._reserved0Offset_));
	}

	// void* reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="void*")
	public VoidPointer reserved1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._reserved1Offset_));
	}

	// void* reserved1
	public PointerPointer reserved1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._reserved1Offset_));
	}

	// void* reserved2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2Offset_", declaredType="void*")
	public VoidPointer reserved2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNIInvokeInterface_._reserved2Offset_));
	}

	// void* reserved2
	public PointerPointer reserved2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNIInvokeInterface_._reserved2Offset_));
	}

}
