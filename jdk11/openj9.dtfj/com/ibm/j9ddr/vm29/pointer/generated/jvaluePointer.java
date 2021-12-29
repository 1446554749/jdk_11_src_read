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
 * Structure: jvaluePointer
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
 * The generated code will provide getters for all elements in the jvaluePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvalue.class)
public class jvaluePointer extends StructurePointer {

	// NULL
	public static final jvaluePointer NULL = new jvaluePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvaluePointer(long address) {
		super(address);
	}

	public static jvaluePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvaluePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvaluePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvaluePointer(address);
	}

	public jvaluePointer add(long count) {
		return jvaluePointer.cast(address + (jvalue.SIZEOF * count));
	}

	public jvaluePointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvaluePointer addOffset(long offset) {
		return jvaluePointer.cast(address + offset);
	}

	public jvaluePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvaluePointer sub(long count) {
		return jvaluePointer.cast(address - (jvalue.SIZEOF * count));
	}

	public jvaluePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvaluePointer subOffset(long offset) {
		return jvaluePointer.cast(address - offset);
	}

	public jvaluePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvaluePointer untag(long mask) {
		return jvaluePointer.cast(address & ~mask);
	}

	public jvaluePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvalue.SIZEOF;
	}

	// Implementation methods

	// jbyte b
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bOffset_", declaredType="jbyte")
	public I8 b() throws CorruptDataException {
		return new I8(getByteAtOffset(jvalue._bOffset_));
	}

	// jbyte b
	public I8Pointer bEA() throws CorruptDataException {
		return I8Pointer.cast(nonNullFieldEA(jvalue._bOffset_));
	}

	// jchar c
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cOffset_", declaredType="jchar")
	public U16 c() throws CorruptDataException {
		return new U16(getShortAtOffset(jvalue._cOffset_));
	}

	// jchar c
	public U16Pointer cEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(jvalue._cOffset_));
	}

	// jdouble d
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dOffset_", declaredType="jdouble")
	public double d() throws CorruptDataException {
		return getDoubleAtOffset(jvalue._dOffset_);
	}

	// jdouble d
	public DoublePointer dEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(jvalue._dOffset_));
	}

	// jfloat f
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fOffset_", declaredType="jfloat")
	public float f() throws CorruptDataException {
		return getFloatAtOffset(jvalue._fOffset_);
	}

	// jfloat f
	public FloatPointer fEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(jvalue._fOffset_));
	}

	// jint i
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iOffset_", declaredType="jint")
	public IDATA i() throws CorruptDataException {
		return new I32(getIntAtOffset(jvalue._iOffset_));
	}

	// jint i
	public IDATAPointer iEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvalue._iOffset_));
	}

	// jlong j
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jOffset_", declaredType="jlong")
	public IDATA j() throws CorruptDataException {
		return new I64(getLongAtOffset(jvalue._jOffset_));
	}

	// jlong j
	public IDATAPointer jEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvalue._jOffset_));
	}

	// jobject l
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lOffset_", declaredType="jobject")
	public _jobjectPointer l() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(jvalue._lOffset_));
	}

	// jobject l
	public PointerPointer lEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvalue._lOffset_));
	}

	// jshort s
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sOffset_", declaredType="jshort")
	public I16 s() throws CorruptDataException {
		return new I16(getShortAtOffset(jvalue._sOffset_));
	}

	// jshort s
	public I16Pointer sEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(jvalue._sOffset_));
	}

	// jboolean z
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zOffset_", declaredType="jboolean")
	public U8 z() throws CorruptDataException {
		return new U8(getByteAtOffset(jvalue._zOffset_));
	}

	// jboolean z
	public U8Pointer zEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvalue._zOffset_));
	}

}
