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
 * Structure: jvmtiTimerInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiTimerInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiTimerInfo.class)
public class jvmtiTimerInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiTimerInfoPointer NULL = new jvmtiTimerInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiTimerInfoPointer(long address) {
		super(address);
	}

	public static jvmtiTimerInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiTimerInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiTimerInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiTimerInfoPointer(address);
	}

	public jvmtiTimerInfoPointer add(long count) {
		return jvmtiTimerInfoPointer.cast(address + (jvmtiTimerInfo.SIZEOF * count));
	}

	public jvmtiTimerInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiTimerInfoPointer addOffset(long offset) {
		return jvmtiTimerInfoPointer.cast(address + offset);
	}

	public jvmtiTimerInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiTimerInfoPointer sub(long count) {
		return jvmtiTimerInfoPointer.cast(address - (jvmtiTimerInfo.SIZEOF * count));
	}

	public jvmtiTimerInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiTimerInfoPointer subOffset(long offset) {
		return jvmtiTimerInfoPointer.cast(address - offset);
	}

	public jvmtiTimerInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiTimerInfoPointer untag(long mask) {
		return jvmtiTimerInfoPointer.cast(address & ~mask);
	}

	public jvmtiTimerInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiTimerInfo.SIZEOF;
	}

	// Implementation methods

	// jvmtiTimerKind kind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_kindOffset_", declaredType="jvmtiTimerKind")
	public long kind() throws CorruptDataException {
		if (jvmtiTimerKind.SIZEOF == 1) {
			return getByteAtOffset(jvmtiTimerInfo._kindOffset_);
		} else if (jvmtiTimerKind.SIZEOF == 2) {
			return getShortAtOffset(jvmtiTimerInfo._kindOffset_);
		} else if (jvmtiTimerKind.SIZEOF == 4) {
			return getIntAtOffset(jvmtiTimerInfo._kindOffset_);
		} else if (jvmtiTimerKind.SIZEOF == 8) {
			return getLongAtOffset(jvmtiTimerInfo._kindOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiTimerKind kind
	public EnumPointer kindEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(jvmtiTimerInfo._kindOffset_), jvmtiTimerKind.class);
	}

	// jlong max_value
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_max_valueOffset_", declaredType="jlong")
	public IDATA max_value() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiTimerInfo._max_valueOffset_));
	}

	// jlong max_value
	public IDATAPointer max_valueEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiTimerInfo._max_valueOffset_));
	}

	// jboolean may_skip_backward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_may_skip_backwardOffset_", declaredType="jboolean")
	public U8 may_skip_backward() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiTimerInfo._may_skip_backwardOffset_));
	}

	// jboolean may_skip_backward
	public U8Pointer may_skip_backwardEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiTimerInfo._may_skip_backwardOffset_));
	}

	// jboolean may_skip_forward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_may_skip_forwardOffset_", declaredType="jboolean")
	public U8 may_skip_forward() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiTimerInfo._may_skip_forwardOffset_));
	}

	// jboolean may_skip_forward
	public U8Pointer may_skip_forwardEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiTimerInfo._may_skip_forwardOffset_));
	}

	// jlong reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="jlong")
	public IDATA reserved1() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiTimerInfo._reserved1Offset_));
	}

	// jlong reserved1
	public IDATAPointer reserved1EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiTimerInfo._reserved1Offset_));
	}

	// jlong reserved2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2Offset_", declaredType="jlong")
	public IDATA reserved2() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiTimerInfo._reserved2Offset_));
	}

	// jlong reserved2
	public IDATAPointer reserved2EA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiTimerInfo._reserved2Offset_));
	}

}
