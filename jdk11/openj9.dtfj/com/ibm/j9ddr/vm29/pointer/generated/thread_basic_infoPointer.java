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
 * Structure: thread_basic_infoPointer
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
 * The generated code will provide getters for all elements in the thread_basic_infoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=thread_basic_info.class)
public class thread_basic_infoPointer extends StructurePointer {

	// NULL
	public static final thread_basic_infoPointer NULL = new thread_basic_infoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected thread_basic_infoPointer(long address) {
		super(address);
	}

	public static thread_basic_infoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static thread_basic_infoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static thread_basic_infoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new thread_basic_infoPointer(address);
	}

	public thread_basic_infoPointer add(long count) {
		return thread_basic_infoPointer.cast(address + (thread_basic_info.SIZEOF * count));
	}

	public thread_basic_infoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public thread_basic_infoPointer addOffset(long offset) {
		return thread_basic_infoPointer.cast(address + offset);
	}

	public thread_basic_infoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public thread_basic_infoPointer sub(long count) {
		return thread_basic_infoPointer.cast(address - (thread_basic_info.SIZEOF * count));
	}

	public thread_basic_infoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public thread_basic_infoPointer subOffset(long offset) {
		return thread_basic_infoPointer.cast(address - offset);
	}

	public thread_basic_infoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public thread_basic_infoPointer untag(long mask) {
		return thread_basic_infoPointer.cast(address & ~mask);
	}

	public thread_basic_infoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return thread_basic_info.SIZEOF;
	}

	// Implementation methods

	// integer_t cpu_usage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_usageOffset_", declaredType="integer_t")
	public IDATA cpu_usage() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._cpu_usageOffset_));
	}

	// integer_t cpu_usage
	public IDATAPointer cpu_usageEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._cpu_usageOffset_));
	}

	// integer_t flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="integer_t")
	public IDATA flags() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._flagsOffset_));
	}

	// integer_t flags
	public IDATAPointer flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._flagsOffset_));
	}

	// policy_t policy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_policyOffset_", declaredType="policy_t")
	public IDATA policy() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._policyOffset_));
	}

	// policy_t policy
	public IDATAPointer policyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._policyOffset_));
	}

	// integer_t run_state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_run_stateOffset_", declaredType="integer_t")
	public IDATA run_state() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._run_stateOffset_));
	}

	// integer_t run_state
	public IDATAPointer run_stateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._run_stateOffset_));
	}

	// integer_t sleep_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sleep_timeOffset_", declaredType="integer_t")
	public IDATA sleep_time() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._sleep_timeOffset_));
	}

	// integer_t sleep_time
	public IDATAPointer sleep_timeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._sleep_timeOffset_));
	}

	// integer_t suspend_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_suspend_countOffset_", declaredType="integer_t")
	public IDATA suspend_count() throws CorruptDataException {
		return new I32(getIntAtOffset(thread_basic_info._suspend_countOffset_));
	}

	// integer_t suspend_count
	public IDATAPointer suspend_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(thread_basic_info._suspend_countOffset_));
	}

	// time_value_t system_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_system_timeOffset_", declaredType="time_value_t")
	public time_valuePointer system_time() throws CorruptDataException {
		return time_valuePointer.cast(nonNullFieldEA(thread_basic_info._system_timeOffset_));
	}

	// time_value_t system_time
	public PointerPointer system_timeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(thread_basic_info._system_timeOffset_));
	}

	// time_value_t user_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_user_timeOffset_", declaredType="time_value_t")
	public time_valuePointer user_time() throws CorruptDataException {
		return time_valuePointer.cast(nonNullFieldEA(thread_basic_info._user_timeOffset_));
	}

	// time_value_t user_time
	public PointerPointer user_timeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(thread_basic_info._user_timeOffset_));
	}

}
