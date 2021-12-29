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
 * Structure: jvmtiHeapReferenceInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiHeapReferenceInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiHeapReferenceInfo.class)
public class jvmtiHeapReferenceInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiHeapReferenceInfoPointer NULL = new jvmtiHeapReferenceInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiHeapReferenceInfoPointer(long address) {
		super(address);
	}

	public static jvmtiHeapReferenceInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiHeapReferenceInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiHeapReferenceInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiHeapReferenceInfoPointer(address);
	}

	public jvmtiHeapReferenceInfoPointer add(long count) {
		return jvmtiHeapReferenceInfoPointer.cast(address + (jvmtiHeapReferenceInfo.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiHeapReferenceInfoPointer addOffset(long offset) {
		return jvmtiHeapReferenceInfoPointer.cast(address + offset);
	}

	public jvmtiHeapReferenceInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoPointer sub(long count) {
		return jvmtiHeapReferenceInfoPointer.cast(address - (jvmtiHeapReferenceInfo.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiHeapReferenceInfoPointer subOffset(long offset) {
		return jvmtiHeapReferenceInfoPointer.cast(address - offset);
	}

	public jvmtiHeapReferenceInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoPointer untag(long mask) {
		return jvmtiHeapReferenceInfoPointer.cast(address & ~mask);
	}

	public jvmtiHeapReferenceInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiHeapReferenceInfo.SIZEOF;
	}

	// Implementation methods

	// jvmtiHeapReferenceInfoArray array
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayOffset_", declaredType="jvmtiHeapReferenceInfoArray")
	public jvmtiHeapReferenceInfoArrayPointer array() throws CorruptDataException {
		return jvmtiHeapReferenceInfoArrayPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._arrayOffset_));
	}

	// jvmtiHeapReferenceInfoArray array
	public PointerPointer arrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._arrayOffset_));
	}

	// jvmtiHeapReferenceInfoConstantPool constant_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constant_poolOffset_", declaredType="jvmtiHeapReferenceInfoConstantPool")
	public jvmtiHeapReferenceInfoConstantPoolPointer constant_pool() throws CorruptDataException {
		return jvmtiHeapReferenceInfoConstantPoolPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._constant_poolOffset_));
	}

	// jvmtiHeapReferenceInfoConstantPool constant_pool
	public PointerPointer constant_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._constant_poolOffset_));
	}

	// jvmtiHeapReferenceInfoField field
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffset_", declaredType="jvmtiHeapReferenceInfoField")
	public jvmtiHeapReferenceInfoFieldPointer field() throws CorruptDataException {
		return jvmtiHeapReferenceInfoFieldPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._fieldOffset_));
	}

	// jvmtiHeapReferenceInfoField field
	public PointerPointer fieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._fieldOffset_));
	}

	// jvmtiHeapReferenceInfoJniLocal jni_local
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jni_localOffset_", declaredType="jvmtiHeapReferenceInfoJniLocal")
	public jvmtiHeapReferenceInfoJniLocalPointer jni_local() throws CorruptDataException {
		return jvmtiHeapReferenceInfoJniLocalPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._jni_localOffset_));
	}

	// jvmtiHeapReferenceInfoJniLocal jni_local
	public PointerPointer jni_localEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._jni_localOffset_));
	}

	// jvmtiHeapReferenceInfoReserved other
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_otherOffset_", declaredType="jvmtiHeapReferenceInfoReserved")
	public jvmtiHeapReferenceInfoReservedPointer other() throws CorruptDataException {
		return jvmtiHeapReferenceInfoReservedPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._otherOffset_));
	}

	// jvmtiHeapReferenceInfoReserved other
	public PointerPointer otherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._otherOffset_));
	}

	// jvmtiHeapReferenceInfoStackLocal stack_local
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack_localOffset_", declaredType="jvmtiHeapReferenceInfoStackLocal")
	public jvmtiHeapReferenceInfoStackLocalPointer stack_local() throws CorruptDataException {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._stack_localOffset_));
	}

	// jvmtiHeapReferenceInfoStackLocal stack_local
	public PointerPointer stack_localEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfo._stack_localOffset_));
	}

}
