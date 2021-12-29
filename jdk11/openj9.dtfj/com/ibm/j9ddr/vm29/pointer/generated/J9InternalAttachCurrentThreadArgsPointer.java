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
 * Structure: J9InternalAttachCurrentThreadArgsPointer
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
 * The generated code will provide getters for all elements in the J9InternalAttachCurrentThreadArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9InternalAttachCurrentThreadArgs.class)
public class J9InternalAttachCurrentThreadArgsPointer extends StructurePointer {

	// NULL
	public static final J9InternalAttachCurrentThreadArgsPointer NULL = new J9InternalAttachCurrentThreadArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9InternalAttachCurrentThreadArgsPointer(long address) {
		super(address);
	}

	public static J9InternalAttachCurrentThreadArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9InternalAttachCurrentThreadArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9InternalAttachCurrentThreadArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9InternalAttachCurrentThreadArgsPointer(address);
	}

	public J9InternalAttachCurrentThreadArgsPointer add(long count) {
		return J9InternalAttachCurrentThreadArgsPointer.cast(address + (J9InternalAttachCurrentThreadArgs.SIZEOF * count));
	}

	public J9InternalAttachCurrentThreadArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9InternalAttachCurrentThreadArgsPointer addOffset(long offset) {
		return J9InternalAttachCurrentThreadArgsPointer.cast(address + offset);
	}

	public J9InternalAttachCurrentThreadArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9InternalAttachCurrentThreadArgsPointer sub(long count) {
		return J9InternalAttachCurrentThreadArgsPointer.cast(address - (J9InternalAttachCurrentThreadArgs.SIZEOF * count));
	}

	public J9InternalAttachCurrentThreadArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9InternalAttachCurrentThreadArgsPointer subOffset(long offset) {
		return J9InternalAttachCurrentThreadArgsPointer.cast(address - offset);
	}

	public J9InternalAttachCurrentThreadArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9InternalAttachCurrentThreadArgsPointer untag(long mask) {
		return J9InternalAttachCurrentThreadArgsPointer.cast(address & ~mask);
	}

	public J9InternalAttachCurrentThreadArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9InternalAttachCurrentThreadArgs.SIZEOF;
	}

	// Implementation methods

	// void* osThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osThreadOffset_", declaredType="void*")
	public VoidPointer osThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InternalAttachCurrentThreadArgs._osThreadOffset_));
	}

	// void* osThread
	public PointerPointer osThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalAttachCurrentThreadArgs._osThreadOffset_));
	}

	// void** p_env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_p_envOffset_", declaredType="void**")
	public PointerPointer p_env() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9InternalAttachCurrentThreadArgs._p_envOffset_));
	}

	// void** p_env
	public PointerPointer p_envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalAttachCurrentThreadArgs._p_envOffset_));
	}

	// J9JavaVMAttachArgs* thr_args
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thr_argsOffset_", declaredType="J9JavaVMAttachArgs*")
	public J9JavaVMAttachArgsPointer thr_args() throws CorruptDataException {
		return J9JavaVMAttachArgsPointer.cast(getPointerAtOffset(J9InternalAttachCurrentThreadArgs._thr_argsOffset_));
	}

	// J9JavaVMAttachArgs* thr_args
	public PointerPointer thr_argsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalAttachCurrentThreadArgs._thr_argsOffset_));
	}

	// UDATA threadType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadTypeOffset_", declaredType="UDATA")
	public UDATA threadType() throws CorruptDataException {
		return getUDATAAtOffset(J9InternalAttachCurrentThreadArgs._threadTypeOffset_);
	}

	// UDATA threadType
	public UDATAPointer threadTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9InternalAttachCurrentThreadArgs._threadTypeOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9InternalAttachCurrentThreadArgs._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InternalAttachCurrentThreadArgs._vmOffset_));
	}

}
