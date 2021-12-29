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
 * Structure: jvmtiHeapReferenceInfoStackLocalPointer
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
 * The generated code will provide getters for all elements in the jvmtiHeapReferenceInfoStackLocalPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiHeapReferenceInfoStackLocal.class)
public class jvmtiHeapReferenceInfoStackLocalPointer extends StructurePointer {

	// NULL
	public static final jvmtiHeapReferenceInfoStackLocalPointer NULL = new jvmtiHeapReferenceInfoStackLocalPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiHeapReferenceInfoStackLocalPointer(long address) {
		super(address);
	}

	public static jvmtiHeapReferenceInfoStackLocalPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiHeapReferenceInfoStackLocalPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiHeapReferenceInfoStackLocalPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiHeapReferenceInfoStackLocalPointer(address);
	}

	public jvmtiHeapReferenceInfoStackLocalPointer add(long count) {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(address + (jvmtiHeapReferenceInfoStackLocal.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoStackLocalPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiHeapReferenceInfoStackLocalPointer addOffset(long offset) {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(address + offset);
	}

	public jvmtiHeapReferenceInfoStackLocalPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoStackLocalPointer sub(long count) {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(address - (jvmtiHeapReferenceInfoStackLocal.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoStackLocalPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiHeapReferenceInfoStackLocalPointer subOffset(long offset) {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(address - offset);
	}

	public jvmtiHeapReferenceInfoStackLocalPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoStackLocalPointer untag(long mask) {
		return jvmtiHeapReferenceInfoStackLocalPointer.cast(address & ~mask);
	}

	public jvmtiHeapReferenceInfoStackLocalPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiHeapReferenceInfoStackLocal.SIZEOF;
	}

	// Implementation methods

	// jint depth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_depthOffset_", declaredType="jint")
	public IDATA depth() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiHeapReferenceInfoStackLocal._depthOffset_));
	}

	// jint depth
	public IDATAPointer depthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._depthOffset_));
	}

	// jlocation location
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_locationOffset_", declaredType="jlocation")
	public IDATA location() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoStackLocal._locationOffset_));
	}

	// jlocation location
	public IDATAPointer locationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._locationOffset_));
	}

	// jmethodID method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="jmethodID")
	public _jmethodIDPointer method() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(jvmtiHeapReferenceInfoStackLocal._methodOffset_));
	}

	// jmethodID method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._methodOffset_));
	}

	// jint slot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotOffset_", declaredType="jint")
	public IDATA slot() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiHeapReferenceInfoStackLocal._slotOffset_));
	}

	// jint slot
	public IDATAPointer slotEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._slotOffset_));
	}

	// jlong thread_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_idOffset_", declaredType="jlong")
	public IDATA thread_id() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoStackLocal._thread_idOffset_));
	}

	// jlong thread_id
	public IDATAPointer thread_idEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._thread_idOffset_));
	}

	// jlong thread_tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_tagOffset_", declaredType="jlong")
	public IDATA thread_tag() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoStackLocal._thread_tagOffset_));
	}

	// jlong thread_tag
	public IDATAPointer thread_tagEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoStackLocal._thread_tagOffset_));
	}

}
