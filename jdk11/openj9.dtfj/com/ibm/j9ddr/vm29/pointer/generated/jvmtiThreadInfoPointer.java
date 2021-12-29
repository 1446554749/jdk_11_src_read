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
 * Structure: jvmtiThreadInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiThreadInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiThreadInfo.class)
public class jvmtiThreadInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiThreadInfoPointer NULL = new jvmtiThreadInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiThreadInfoPointer(long address) {
		super(address);
	}

	public static jvmtiThreadInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiThreadInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiThreadInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiThreadInfoPointer(address);
	}

	public jvmtiThreadInfoPointer add(long count) {
		return jvmtiThreadInfoPointer.cast(address + (jvmtiThreadInfo.SIZEOF * count));
	}

	public jvmtiThreadInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiThreadInfoPointer addOffset(long offset) {
		return jvmtiThreadInfoPointer.cast(address + offset);
	}

	public jvmtiThreadInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiThreadInfoPointer sub(long count) {
		return jvmtiThreadInfoPointer.cast(address - (jvmtiThreadInfo.SIZEOF * count));
	}

	public jvmtiThreadInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiThreadInfoPointer subOffset(long offset) {
		return jvmtiThreadInfoPointer.cast(address - offset);
	}

	public jvmtiThreadInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiThreadInfoPointer untag(long mask) {
		return jvmtiThreadInfoPointer.cast(address & ~mask);
	}

	public jvmtiThreadInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiThreadInfo.SIZEOF;
	}

	// Implementation methods

	// jobject context_class_loader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_context_class_loaderOffset_", declaredType="jobject")
	public _jobjectPointer context_class_loader() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(jvmtiThreadInfo._context_class_loaderOffset_));
	}

	// jobject context_class_loader
	public PointerPointer context_class_loaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiThreadInfo._context_class_loaderOffset_));
	}

	// jboolean is_daemon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_is_daemonOffset_", declaredType="jboolean")
	public U8 is_daemon() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiThreadInfo._is_daemonOffset_));
	}

	// jboolean is_daemon
	public U8Pointer is_daemonEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiThreadInfo._is_daemonOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiThreadInfo._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiThreadInfo._nameOffset_));
	}

	// jint priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityOffset_", declaredType="jint")
	public IDATA priority() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiThreadInfo._priorityOffset_));
	}

	// jint priority
	public IDATAPointer priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiThreadInfo._priorityOffset_));
	}

	// jthreadGroup thread_group
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_groupOffset_", declaredType="jthreadGroup")
	public _jobjectPointer thread_group() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(jvmtiThreadInfo._thread_groupOffset_));
	}

	// jthreadGroup thread_group
	public PointerPointer thread_groupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiThreadInfo._thread_groupOffset_));
	}

}
