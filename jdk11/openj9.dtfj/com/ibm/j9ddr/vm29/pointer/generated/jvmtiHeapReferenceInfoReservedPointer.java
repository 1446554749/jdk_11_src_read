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
 * Structure: jvmtiHeapReferenceInfoReservedPointer
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
 * The generated code will provide getters for all elements in the jvmtiHeapReferenceInfoReservedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiHeapReferenceInfoReserved.class)
public class jvmtiHeapReferenceInfoReservedPointer extends StructurePointer {

	// NULL
	public static final jvmtiHeapReferenceInfoReservedPointer NULL = new jvmtiHeapReferenceInfoReservedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiHeapReferenceInfoReservedPointer(long address) {
		super(address);
	}

	public static jvmtiHeapReferenceInfoReservedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiHeapReferenceInfoReservedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiHeapReferenceInfoReservedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiHeapReferenceInfoReservedPointer(address);
	}

	public jvmtiHeapReferenceInfoReservedPointer add(long count) {
		return jvmtiHeapReferenceInfoReservedPointer.cast(address + (jvmtiHeapReferenceInfoReserved.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoReservedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiHeapReferenceInfoReservedPointer addOffset(long offset) {
		return jvmtiHeapReferenceInfoReservedPointer.cast(address + offset);
	}

	public jvmtiHeapReferenceInfoReservedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoReservedPointer sub(long count) {
		return jvmtiHeapReferenceInfoReservedPointer.cast(address - (jvmtiHeapReferenceInfoReserved.SIZEOF * count));
	}

	public jvmtiHeapReferenceInfoReservedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiHeapReferenceInfoReservedPointer subOffset(long offset) {
		return jvmtiHeapReferenceInfoReservedPointer.cast(address - offset);
	}

	public jvmtiHeapReferenceInfoReservedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiHeapReferenceInfoReservedPointer untag(long mask) {
		return jvmtiHeapReferenceInfoReservedPointer.cast(address & ~mask);
	}

	public jvmtiHeapReferenceInfoReservedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiHeapReferenceInfoReserved.SIZEOF;
	}

	// Implementation methods

	// jlong reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="jlong")
	public IDATA reserved1() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved1Offset_));
	}

	// jlong reserved1
	public IDATAPointer reserved1EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved1Offset_));
	}

	// jlong reserved2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2Offset_", declaredType="jlong")
	public IDATA reserved2() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved2Offset_));
	}

	// jlong reserved2
	public IDATAPointer reserved2EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved2Offset_));
	}

	// jlong reserved3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved3Offset_", declaredType="jlong")
	public IDATA reserved3() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved3Offset_));
	}

	// jlong reserved3
	public IDATAPointer reserved3EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved3Offset_));
	}

	// jlong reserved4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved4Offset_", declaredType="jlong")
	public IDATA reserved4() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved4Offset_));
	}

	// jlong reserved4
	public IDATAPointer reserved4EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved4Offset_));
	}

	// jlong reserved5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved5Offset_", declaredType="jlong")
	public IDATA reserved5() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved5Offset_));
	}

	// jlong reserved5
	public IDATAPointer reserved5EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved5Offset_));
	}

	// jlong reserved6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved6Offset_", declaredType="jlong")
	public IDATA reserved6() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved6Offset_));
	}

	// jlong reserved6
	public IDATAPointer reserved6EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved6Offset_));
	}

	// jlong reserved7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved7Offset_", declaredType="jlong")
	public IDATA reserved7() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved7Offset_));
	}

	// jlong reserved7
	public IDATAPointer reserved7EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved7Offset_));
	}

	// jlong reserved8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved8Offset_", declaredType="jlong")
	public IDATA reserved8() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiHeapReferenceInfoReserved._reserved8Offset_));
	}

	// jlong reserved8
	public IDATAPointer reserved8EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiHeapReferenceInfoReserved._reserved8Offset_));
	}

}
