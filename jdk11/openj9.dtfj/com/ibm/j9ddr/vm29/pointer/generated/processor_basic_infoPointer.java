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
 * Structure: processor_basic_infoPointer
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
 * The generated code will provide getters for all elements in the processor_basic_infoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=processor_basic_info.class)
public class processor_basic_infoPointer extends StructurePointer {

	// NULL
	public static final processor_basic_infoPointer NULL = new processor_basic_infoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected processor_basic_infoPointer(long address) {
		super(address);
	}

	public static processor_basic_infoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static processor_basic_infoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static processor_basic_infoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new processor_basic_infoPointer(address);
	}

	public processor_basic_infoPointer add(long count) {
		return processor_basic_infoPointer.cast(address + (processor_basic_info.SIZEOF * count));
	}

	public processor_basic_infoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public processor_basic_infoPointer addOffset(long offset) {
		return processor_basic_infoPointer.cast(address + offset);
	}

	public processor_basic_infoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public processor_basic_infoPointer sub(long count) {
		return processor_basic_infoPointer.cast(address - (processor_basic_info.SIZEOF * count));
	}

	public processor_basic_infoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public processor_basic_infoPointer subOffset(long offset) {
		return processor_basic_infoPointer.cast(address - offset);
	}

	public processor_basic_infoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public processor_basic_infoPointer untag(long mask) {
		return processor_basic_infoPointer.cast(address & ~mask);
	}

	public processor_basic_infoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return processor_basic_info.SIZEOF;
	}

	// Implementation methods

	// cpu_subtype_t cpu_subtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_subtypeOffset_", declaredType="cpu_subtype_t")
	public IDATA cpu_subtype() throws CorruptDataException {
		return new I32(getIntAtOffset(processor_basic_info._cpu_subtypeOffset_));
	}

	// cpu_subtype_t cpu_subtype
	public IDATAPointer cpu_subtypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(processor_basic_info._cpu_subtypeOffset_));
	}

	// cpu_type_t cpu_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_typeOffset_", declaredType="cpu_type_t")
	public IDATA cpu_type() throws CorruptDataException {
		return new I32(getIntAtOffset(processor_basic_info._cpu_typeOffset_));
	}

	// cpu_type_t cpu_type
	public IDATAPointer cpu_typeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(processor_basic_info._cpu_typeOffset_));
	}

	// boolean_t is_master
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_is_masterOffset_", declaredType="boolean_t")
	public UDATA is_master() throws CorruptDataException {
		return new U32(getIntAtOffset(processor_basic_info._is_masterOffset_));
	}

	// boolean_t is_master
	public UDATAPointer is_masterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(processor_basic_info._is_masterOffset_));
	}

	// boolean_t running
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runningOffset_", declaredType="boolean_t")
	public UDATA running() throws CorruptDataException {
		return new U32(getIntAtOffset(processor_basic_info._runningOffset_));
	}

	// boolean_t running
	public UDATAPointer runningEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(processor_basic_info._runningOffset_));
	}

	// I32 slot_num
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slot_numOffset_", declaredType="I32")
	public IDATA slot_num() throws CorruptDataException {
		return new I32(getIntAtOffset(processor_basic_info._slot_numOffset_));
	}

	// I32 slot_num
	public IDATAPointer slot_numEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(processor_basic_info._slot_numOffset_));
	}

}
