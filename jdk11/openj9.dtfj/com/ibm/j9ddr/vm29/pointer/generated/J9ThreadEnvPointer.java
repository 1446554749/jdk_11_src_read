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
 * Structure: J9ThreadEnvPointer
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
 * The generated code will provide getters for all elements in the J9ThreadEnvPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadEnv.class)
public class J9ThreadEnvPointer extends StructurePointer {

	// NULL
	public static final J9ThreadEnvPointer NULL = new J9ThreadEnvPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadEnvPointer(long address) {
		super(address);
	}

	public static J9ThreadEnvPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadEnvPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadEnvPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadEnvPointer(address);
	}

	public J9ThreadEnvPointer add(long count) {
		return J9ThreadEnvPointer.cast(address + (J9ThreadEnv.SIZEOF * count));
	}

	public J9ThreadEnvPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadEnvPointer addOffset(long offset) {
		return J9ThreadEnvPointer.cast(address + offset);
	}

	public J9ThreadEnvPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadEnvPointer sub(long count) {
		return J9ThreadEnvPointer.cast(address - (J9ThreadEnv.SIZEOF * count));
	}

	public J9ThreadEnvPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadEnvPointer subOffset(long offset) {
		return J9ThreadEnvPointer.cast(address - offset);
	}

	public J9ThreadEnvPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadEnvPointer untag(long mask) {
		return J9ThreadEnvPointer.cast(address & ~mask);
	}

	public J9ThreadEnvPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadEnv.SIZEOF;
	}

	// Implementation methods

	// void* abort
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_abortOffset_", declaredType="void*")
	public VoidPointer abort() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._abortOffset_));
	}

	// void* abort
	public PointerPointer abortEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._abortOffset_));
	}

	// void* attach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachOffset_", declaredType="void*")
	public VoidPointer attach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._attachOffset_));
	}

	// void* attach
	public PointerPointer attachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._attachOffset_));
	}

	// void* clear_interrupted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clear_interruptedOffset_", declaredType="void*")
	public VoidPointer clear_interrupted() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._clear_interruptedOffset_));
	}

	// void* clear_interrupted
	public PointerPointer clear_interruptedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._clear_interruptedOffset_));
	}

	// void* create
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createOffset_", declaredType="void*")
	public VoidPointer create() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._createOffset_));
	}

	// void* create
	public PointerPointer createEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._createOffset_));
	}

	// void* exit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exitOffset_", declaredType="void*")
	public VoidPointer exit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._exitOffset_));
	}

	// void* exit
	public PointerPointer exitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._exitOffset_));
	}

	// void* get_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_get_priorityOffset_", declaredType="void*")
	public VoidPointer get_priority() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._get_priorityOffset_));
	}

	// void* get_priority
	public PointerPointer get_priorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._get_priorityOffset_));
	}

	// void* global
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalOffset_", declaredType="void*")
	public VoidPointer global() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._globalOffset_));
	}

	// void* global
	public PointerPointer globalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._globalOffset_));
	}

	// void* monitor_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_destroyOffset_", declaredType="void*")
	public VoidPointer monitor_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_destroyOffset_));
	}

	// void* monitor_destroy
	public PointerPointer monitor_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_destroyOffset_));
	}

	// void* monitor_enter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_enterOffset_", declaredType="void*")
	public VoidPointer monitor_enter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_enterOffset_));
	}

	// void* monitor_enter
	public PointerPointer monitor_enterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_enterOffset_));
	}

	// void* monitor_exit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_exitOffset_", declaredType="void*")
	public VoidPointer monitor_exit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_exitOffset_));
	}

	// void* monitor_exit
	public PointerPointer monitor_exitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_exitOffset_));
	}

	// void* monitor_init_with_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_init_with_nameOffset_", declaredType="void*")
	public VoidPointer monitor_init_with_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_init_with_nameOffset_));
	}

	// void* monitor_init_with_name
	public PointerPointer monitor_init_with_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_init_with_nameOffset_));
	}

	// void* monitor_notify_all
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_notify_allOffset_", declaredType="void*")
	public VoidPointer monitor_notify_all() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_notify_allOffset_));
	}

	// void* monitor_notify_all
	public PointerPointer monitor_notify_allEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_notify_allOffset_));
	}

	// void* monitor_wait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_waitOffset_", declaredType="void*")
	public VoidPointer monitor_wait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._monitor_waitOffset_));
	}

	// void* monitor_wait
	public PointerPointer monitor_waitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._monitor_waitOffset_));
	}

	// void* priority_interrupt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priority_interruptOffset_", declaredType="void*")
	public VoidPointer priority_interrupt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._priority_interruptOffset_));
	}

	// void* priority_interrupt
	public PointerPointer priority_interruptEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._priority_interruptOffset_));
	}

	// void* self
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_selfOffset_", declaredType="void*")
	public VoidPointer self() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._selfOffset_));
	}

	// void* self
	public PointerPointer selfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._selfOffset_));
	}

	// void* set_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_set_priorityOffset_", declaredType="void*")
	public VoidPointer set_priority() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._set_priorityOffset_));
	}

	// void* set_priority
	public PointerPointer set_priorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._set_priorityOffset_));
	}

	// void* sleep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sleepOffset_", declaredType="void*")
	public VoidPointer sleep() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._sleepOffset_));
	}

	// void* sleep
	public PointerPointer sleepEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._sleepOffset_));
	}

	// void* tls_alloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_allocOffset_", declaredType="void*")
	public VoidPointer tls_alloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._tls_allocOffset_));
	}

	// void* tls_alloc
	public PointerPointer tls_allocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._tls_allocOffset_));
	}

	// void* tls_free
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_freeOffset_", declaredType="void*")
	public VoidPointer tls_free() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._tls_freeOffset_));
	}

	// void* tls_free
	public PointerPointer tls_freeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._tls_freeOffset_));
	}

	// void* tls_get
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_getOffset_", declaredType="void*")
	public VoidPointer tls_get() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._tls_getOffset_));
	}

	// void* tls_get
	public PointerPointer tls_getEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._tls_getOffset_));
	}

	// void* tls_set
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_setOffset_", declaredType="void*")
	public VoidPointer tls_set() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ThreadEnv._tls_setOffset_));
	}

	// void* tls_set
	public PointerPointer tls_setEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadEnv._tls_setOffset_));
	}

}
