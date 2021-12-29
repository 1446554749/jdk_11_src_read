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
 * Structure: jvmtiGetMemoryCategoriesStatePointer
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
 * The generated code will provide getters for all elements in the jvmtiGetMemoryCategoriesStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiGetMemoryCategoriesState.class)
public class jvmtiGetMemoryCategoriesStatePointer extends StructurePointer {

	// NULL
	public static final jvmtiGetMemoryCategoriesStatePointer NULL = new jvmtiGetMemoryCategoriesStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiGetMemoryCategoriesStatePointer(long address) {
		super(address);
	}

	public static jvmtiGetMemoryCategoriesStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiGetMemoryCategoriesStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiGetMemoryCategoriesStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiGetMemoryCategoriesStatePointer(address);
	}

	public jvmtiGetMemoryCategoriesStatePointer add(long count) {
		return jvmtiGetMemoryCategoriesStatePointer.cast(address + (jvmtiGetMemoryCategoriesState.SIZEOF * count));
	}

	public jvmtiGetMemoryCategoriesStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiGetMemoryCategoriesStatePointer addOffset(long offset) {
		return jvmtiGetMemoryCategoriesStatePointer.cast(address + offset);
	}

	public jvmtiGetMemoryCategoriesStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiGetMemoryCategoriesStatePointer sub(long count) {
		return jvmtiGetMemoryCategoriesStatePointer.cast(address - (jvmtiGetMemoryCategoriesState.SIZEOF * count));
	}

	public jvmtiGetMemoryCategoriesStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiGetMemoryCategoriesStatePointer subOffset(long offset) {
		return jvmtiGetMemoryCategoriesStatePointer.cast(address - offset);
	}

	public jvmtiGetMemoryCategoriesStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiGetMemoryCategoriesStatePointer untag(long mask) {
		return jvmtiGetMemoryCategoriesStatePointer.cast(address & ~mask);
	}

	public jvmtiGetMemoryCategoriesStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiGetMemoryCategoriesState.SIZEOF;
	}

	// Implementation methods

	// BOOLEAN buffer_overflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buffer_overflowOffset_", declaredType="BOOLEAN")
	public UDATA buffer_overflow() throws CorruptDataException {
		return new U32(getIntAtOffset(jvmtiGetMemoryCategoriesState._buffer_overflowOffset_));
	}

	// BOOLEAN buffer_overflow
	public UDATAPointer buffer_overflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._buffer_overflowOffset_));
	}

	// jvmtiMemoryCategory* categories_buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categories_bufferOffset_", declaredType="jvmtiMemoryCategory*")
	public jvmtiMemoryCategoryPointer categories_buffer() throws CorruptDataException {
		return jvmtiMemoryCategoryPointer.cast(getPointerAtOffset(jvmtiGetMemoryCategoriesState._categories_bufferOffset_));
	}

	// jvmtiMemoryCategory* categories_buffer
	public PointerPointer categories_bufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._categories_bufferOffset_));
	}

	// void** categories_mapping
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categories_mappingOffset_", declaredType="void**")
	public PointerPointer categories_mapping() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(jvmtiGetMemoryCategoriesState._categories_mappingOffset_));
	}

	// void** categories_mapping
	public PointerPointer categories_mappingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._categories_mappingOffset_));
	}

	// UDATA categories_mapping_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categories_mapping_sizeOffset_", declaredType="UDATA")
	public UDATA categories_mapping_size() throws CorruptDataException {
		return getUDATAAtOffset(jvmtiGetMemoryCategoriesState._categories_mapping_sizeOffset_);
	}

	// UDATA categories_mapping_size
	public UDATAPointer categories_mapping_sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._categories_mapping_sizeOffset_));
	}

	// jint max_categories
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_max_categoriesOffset_", declaredType="jint")
	public IDATA max_categories() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiGetMemoryCategoriesState._max_categoriesOffset_));
	}

	// jint max_categories
	public IDATAPointer max_categoriesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._max_categoriesOffset_));
	}

	// UDATA total_categories
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_total_categoriesOffset_", declaredType="UDATA")
	public UDATA total_categories() throws CorruptDataException {
		return getUDATAAtOffset(jvmtiGetMemoryCategoriesState._total_categoriesOffset_);
	}

	// UDATA total_categories
	public UDATAPointer total_categoriesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._total_categoriesOffset_));
	}

	// jint written_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_written_countOffset_", declaredType="jint")
	public IDATA written_count() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiGetMemoryCategoriesState._written_countOffset_));
	}

	// jint written_count
	public IDATAPointer written_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiGetMemoryCategoriesState._written_countOffset_));
	}

}
