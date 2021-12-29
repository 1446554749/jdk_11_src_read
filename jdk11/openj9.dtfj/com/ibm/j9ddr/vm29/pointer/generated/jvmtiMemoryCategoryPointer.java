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
 * Structure: jvmtiMemoryCategoryPointer
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
 * The generated code will provide getters for all elements in the jvmtiMemoryCategoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiMemoryCategory.class)
public class jvmtiMemoryCategoryPointer extends StructurePointer {

	// NULL
	public static final jvmtiMemoryCategoryPointer NULL = new jvmtiMemoryCategoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiMemoryCategoryPointer(long address) {
		super(address);
	}

	public static jvmtiMemoryCategoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiMemoryCategoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiMemoryCategoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiMemoryCategoryPointer(address);
	}

	public jvmtiMemoryCategoryPointer add(long count) {
		return jvmtiMemoryCategoryPointer.cast(address + (jvmtiMemoryCategory.SIZEOF * count));
	}

	public jvmtiMemoryCategoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiMemoryCategoryPointer addOffset(long offset) {
		return jvmtiMemoryCategoryPointer.cast(address + offset);
	}

	public jvmtiMemoryCategoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiMemoryCategoryPointer sub(long count) {
		return jvmtiMemoryCategoryPointer.cast(address - (jvmtiMemoryCategory.SIZEOF * count));
	}

	public jvmtiMemoryCategoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiMemoryCategoryPointer subOffset(long offset) {
		return jvmtiMemoryCategoryPointer.cast(address - offset);
	}

	public jvmtiMemoryCategoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiMemoryCategoryPointer untag(long mask) {
		return jvmtiMemoryCategoryPointer.cast(address & ~mask);
	}

	public jvmtiMemoryCategoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiMemoryCategory.SIZEOF;
	}

	// Implementation methods

	// jvmtiMemoryCategory* firstChild
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstChildOffset_", declaredType="jvmtiMemoryCategory*")
	public jvmtiMemoryCategoryPointer firstChild() throws CorruptDataException {
		return jvmtiMemoryCategoryPointer.cast(getPointerAtOffset(jvmtiMemoryCategory._firstChildOffset_));
	}

	// jvmtiMemoryCategory* firstChild
	public PointerPointer firstChildEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._firstChildOffset_));
	}

	// jlong liveAllocationsDeep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveAllocationsDeepOffset_", declaredType="jlong")
	public IDATA liveAllocationsDeep() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiMemoryCategory._liveAllocationsDeepOffset_));
	}

	// jlong liveAllocationsDeep
	public IDATAPointer liveAllocationsDeepEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._liveAllocationsDeepOffset_));
	}

	// jlong liveAllocationsShallow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveAllocationsShallowOffset_", declaredType="jlong")
	public IDATA liveAllocationsShallow() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiMemoryCategory._liveAllocationsShallowOffset_));
	}

	// jlong liveAllocationsShallow
	public IDATAPointer liveAllocationsShallowEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._liveAllocationsShallowOffset_));
	}

	// jlong liveBytesDeep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveBytesDeepOffset_", declaredType="jlong")
	public IDATA liveBytesDeep() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiMemoryCategory._liveBytesDeepOffset_));
	}

	// jlong liveBytesDeep
	public IDATAPointer liveBytesDeepEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._liveBytesDeepOffset_));
	}

	// jlong liveBytesShallow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveBytesShallowOffset_", declaredType="jlong")
	public IDATA liveBytesShallow() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiMemoryCategory._liveBytesShallowOffset_));
	}

	// jlong liveBytesShallow
	public IDATAPointer liveBytesShallowEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._liveBytesShallowOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiMemoryCategory._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._nameOffset_));
	}

	// jvmtiMemoryCategory* nextSibling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextSiblingOffset_", declaredType="jvmtiMemoryCategory*")
	public jvmtiMemoryCategoryPointer nextSibling() throws CorruptDataException {
		return jvmtiMemoryCategoryPointer.cast(getPointerAtOffset(jvmtiMemoryCategory._nextSiblingOffset_));
	}

	// jvmtiMemoryCategory* nextSibling
	public PointerPointer nextSiblingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._nextSiblingOffset_));
	}

	// jvmtiMemoryCategory* parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parentOffset_", declaredType="jvmtiMemoryCategory*")
	public jvmtiMemoryCategoryPointer parent() throws CorruptDataException {
		return jvmtiMemoryCategoryPointer.cast(getPointerAtOffset(jvmtiMemoryCategory._parentOffset_));
	}

	// jvmtiMemoryCategory* parent
	public PointerPointer parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiMemoryCategory._parentOffset_));
	}

}
