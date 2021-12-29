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
 * Structure: J9RedirectedToReflectedArgsPointer
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
 * The generated code will provide getters for all elements in the J9RedirectedToReflectedArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RedirectedToReflectedArgs.class)
public class J9RedirectedToReflectedArgsPointer extends StructurePointer {

	// NULL
	public static final J9RedirectedToReflectedArgsPointer NULL = new J9RedirectedToReflectedArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RedirectedToReflectedArgsPointer(long address) {
		super(address);
	}

	public static J9RedirectedToReflectedArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RedirectedToReflectedArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RedirectedToReflectedArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RedirectedToReflectedArgsPointer(address);
	}

	public J9RedirectedToReflectedArgsPointer add(long count) {
		return J9RedirectedToReflectedArgsPointer.cast(address + (J9RedirectedToReflectedArgs.SIZEOF * count));
	}

	public J9RedirectedToReflectedArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RedirectedToReflectedArgsPointer addOffset(long offset) {
		return J9RedirectedToReflectedArgsPointer.cast(address + offset);
	}

	public J9RedirectedToReflectedArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RedirectedToReflectedArgsPointer sub(long count) {
		return J9RedirectedToReflectedArgsPointer.cast(address - (J9RedirectedToReflectedArgs.SIZEOF * count));
	}

	public J9RedirectedToReflectedArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RedirectedToReflectedArgsPointer subOffset(long offset) {
		return J9RedirectedToReflectedArgsPointer.cast(address - offset);
	}

	public J9RedirectedToReflectedArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RedirectedToReflectedArgsPointer untag(long mask) {
		return J9RedirectedToReflectedArgsPointer.cast(address & ~mask);
	}

	public J9RedirectedToReflectedArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RedirectedToReflectedArgs.SIZEOF;
	}

	// Implementation methods

	// jclass clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="jclass")
	public _jclassPointer clazz() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(J9RedirectedToReflectedArgs._clazzOffset_));
	}

	// jclass clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedToReflectedArgs._clazzOffset_));
	}

	// JNIEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="JNIEnv*")
	public JNIEnv_Pointer env() throws CorruptDataException {
		return JNIEnv_Pointer.cast(getPointerAtOffset(J9RedirectedToReflectedArgs._envOffset_));
	}

	// JNIEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedToReflectedArgs._envOffset_));
	}

	// void* func
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_funcOffset_", declaredType="void*")
	public VoidPointer func() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RedirectedToReflectedArgs._funcOffset_));
	}

	// void* func
	public PointerPointer funcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedToReflectedArgs._funcOffset_));
	}

	// void* id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="void*")
	public VoidPointer id() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RedirectedToReflectedArgs._idOffset_));
	}

	// void* id
	public PointerPointer idEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RedirectedToReflectedArgs._idOffset_));
	}

	// jboolean isStatic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isStaticOffset_", declaredType="jboolean")
	public U8 isStatic() throws CorruptDataException {
		return new U8(getByteAtOffset(J9RedirectedToReflectedArgs._isStaticOffset_));
	}

	// jboolean isStatic
	public U8Pointer isStaticEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RedirectedToReflectedArgs._isStaticOffset_));
	}

}
