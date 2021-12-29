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
 * Structure: J9RedirectedCallInArgsPointer
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
 * The generated code will provide getters for all elements in the J9RedirectedCallInArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RedirectedCallInArgs.class)
public class J9RedirectedCallInArgsPointer extends StructurePointer {

	// NULL
	public static final J9RedirectedCallInArgsPointer NULL = new J9RedirectedCallInArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RedirectedCallInArgsPointer(long address) {
		super(address);
	}

	public static J9RedirectedCallInArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RedirectedCallInArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RedirectedCallInArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RedirectedCallInArgsPointer(address);
	}

	public J9RedirectedCallInArgsPointer add(long count) {
		return J9RedirectedCallInArgsPointer.cast(address + (J9RedirectedCallInArgs.SIZEOF * count));
	}

	public J9RedirectedCallInArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RedirectedCallInArgsPointer addOffset(long offset) {
		return J9RedirectedCallInArgsPointer.cast(address + offset);
	}

	public J9RedirectedCallInArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RedirectedCallInArgsPointer sub(long count) {
		return J9RedirectedCallInArgsPointer.cast(address - (J9RedirectedCallInArgs.SIZEOF * count));
	}

	public J9RedirectedCallInArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RedirectedCallInArgsPointer subOffset(long offset) {
		return J9RedirectedCallInArgsPointer.cast(address - offset);
	}

	public J9RedirectedCallInArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RedirectedCallInArgsPointer untag(long mask) {
		return J9RedirectedCallInArgsPointer.cast(address & ~mask);
	}

	public J9RedirectedCallInArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RedirectedCallInArgs.SIZEOF;
	}

	// Implementation methods

	// void* args
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_argsOffset_", declaredType="void*")
	public VoidPointer args() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RedirectedCallInArgs._argsOffset_));
	}

	// void* args
	public PointerPointer argsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedCallInArgs._argsOffset_));
	}

	// jclass clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="jclass")
	public _jclassPointer clazz() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9RedirectedCallInArgs._clazzOffset_));
	}

	// jclass clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedCallInArgs._clazzOffset_));
	}

	// JNIEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="JNIEnv*")
	public JNIEnv_Pointer env() throws CorruptDataException {
		return JNIEnv_Pointer.cast(getPointerAtOffset(J9RedirectedCallInArgs._envOffset_));
	}

	// JNIEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedCallInArgs._envOffset_));
	}

	// jmethodID methodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodIDOffset_", declaredType="jmethodID")
	public _jmethodIDPointer methodID() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(J9RedirectedCallInArgs._methodIDOffset_));
	}

	// jmethodID methodID
	public PointerPointer methodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedCallInArgs._methodIDOffset_));
	}

	// jobject receiver
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_receiverOffset_", declaredType="jobject")
	public _jobjectPointer receiver() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(J9RedirectedCallInArgs._receiverOffset_));
	}

	// jobject receiver
	public PointerPointer receiverEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedCallInArgs._receiverOffset_));
	}

}
