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
 * Structure: host_priority_infoPointer
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
 * The generated code will provide getters for all elements in the host_priority_infoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=host_priority_info.class)
public class host_priority_infoPointer extends StructurePointer {

	// NULL
	public static final host_priority_infoPointer NULL = new host_priority_infoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected host_priority_infoPointer(long address) {
		super(address);
	}

	public static host_priority_infoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static host_priority_infoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static host_priority_infoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new host_priority_infoPointer(address);
	}

	public host_priority_infoPointer add(long count) {
		return host_priority_infoPointer.cast(address + (host_priority_info.SIZEOF * count));
	}

	public host_priority_infoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public host_priority_infoPointer addOffset(long offset) {
		return host_priority_infoPointer.cast(address + offset);
	}

	public host_priority_infoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public host_priority_infoPointer sub(long count) {
		return host_priority_infoPointer.cast(address - (host_priority_info.SIZEOF * count));
	}

	public host_priority_infoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public host_priority_infoPointer subOffset(long offset) {
		return host_priority_infoPointer.cast(address - offset);
	}

	public host_priority_infoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public host_priority_infoPointer untag(long mask) {
		return host_priority_infoPointer.cast(address & ~mask);
	}

	public host_priority_infoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return host_priority_info.SIZEOF;
	}

	// Implementation methods

	// integer_t depress_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_depress_priorityOffset_", declaredType="integer_t")
	public IDATA depress_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._depress_priorityOffset_));
	}

	// integer_t depress_priority
	public IDATAPointer depress_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._depress_priorityOffset_));
	}

	// integer_t idle_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idle_priorityOffset_", declaredType="integer_t")
	public IDATA idle_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._idle_priorityOffset_));
	}

	// integer_t idle_priority
	public IDATAPointer idle_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._idle_priorityOffset_));
	}

	// integer_t kernel_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_kernel_priorityOffset_", declaredType="integer_t")
	public IDATA kernel_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._kernel_priorityOffset_));
	}

	// integer_t kernel_priority
	public IDATAPointer kernel_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._kernel_priorityOffset_));
	}

	// integer_t maximum_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maximum_priorityOffset_", declaredType="integer_t")
	public IDATA maximum_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._maximum_priorityOffset_));
	}

	// integer_t maximum_priority
	public IDATAPointer maximum_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._maximum_priorityOffset_));
	}

	// integer_t minimum_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minimum_priorityOffset_", declaredType="integer_t")
	public IDATA minimum_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._minimum_priorityOffset_));
	}

	// integer_t minimum_priority
	public IDATAPointer minimum_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._minimum_priorityOffset_));
	}

	// integer_t server_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_server_priorityOffset_", declaredType="integer_t")
	public IDATA server_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._server_priorityOffset_));
	}

	// integer_t server_priority
	public IDATAPointer server_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._server_priorityOffset_));
	}

	// integer_t system_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_system_priorityOffset_", declaredType="integer_t")
	public IDATA system_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._system_priorityOffset_));
	}

	// integer_t system_priority
	public IDATAPointer system_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._system_priorityOffset_));
	}

	// integer_t user_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_user_priorityOffset_", declaredType="integer_t")
	public IDATA user_priority() throws CorruptDataException {
		return new I32(getIntAtOffset(host_priority_info._user_priorityOffset_));
	}

	// integer_t user_priority
	public IDATAPointer user_priorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(host_priority_info._user_priorityOffset_));
	}

}
