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
 * Structure: jvmtiStackInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiStackInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiStackInfo.class)
public class jvmtiStackInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiStackInfoPointer NULL = new jvmtiStackInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiStackInfoPointer(long address) {
		super(address);
	}

	public static jvmtiStackInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiStackInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiStackInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiStackInfoPointer(address);
	}

	public jvmtiStackInfoPointer add(long count) {
		return jvmtiStackInfoPointer.cast(address + (jvmtiStackInfo.SIZEOF * count));
	}

	public jvmtiStackInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiStackInfoPointer addOffset(long offset) {
		return jvmtiStackInfoPointer.cast(address + offset);
	}

	public jvmtiStackInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiStackInfoPointer sub(long count) {
		return jvmtiStackInfoPointer.cast(address - (jvmtiStackInfo.SIZEOF * count));
	}

	public jvmtiStackInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiStackInfoPointer subOffset(long offset) {
		return jvmtiStackInfoPointer.cast(address - offset);
	}

	public jvmtiStackInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiStackInfoPointer untag(long mask) {
		return jvmtiStackInfoPointer.cast(address & ~mask);
	}

	public jvmtiStackInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiStackInfo.SIZEOF;
	}

	// Implementation methods

	// jvmtiFrameInfo* frame_buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frame_bufferOffset_", declaredType="jvmtiFrameInfo*")
	public jvmtiFrameInfoPointer frame_buffer() throws CorruptDataException {
		return jvmtiFrameInfoPointer.cast(getPointerAtOffset(jvmtiStackInfo._frame_bufferOffset_));
	}

	// jvmtiFrameInfo* frame_buffer
	public PointerPointer frame_bufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiStackInfo._frame_bufferOffset_));
	}

	// jint frame_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frame_countOffset_", declaredType="jint")
	public IDATA frame_count() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiStackInfo._frame_countOffset_));
	}

	// jint frame_count
	public IDATAPointer frame_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiStackInfo._frame_countOffset_));
	}

	// jint state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stateOffset_", declaredType="jint")
	public IDATA state() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiStackInfo._stateOffset_));
	}

	// jint state
	public IDATAPointer stateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiStackInfo._stateOffset_));
	}

	// jthread thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadOffset_", declaredType="jthread")
	public _jobjectPointer thread() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(jvmtiStackInfo._threadOffset_));
	}

	// jthread thread
	public PointerPointer threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiStackInfo._threadOffset_));
	}

}
