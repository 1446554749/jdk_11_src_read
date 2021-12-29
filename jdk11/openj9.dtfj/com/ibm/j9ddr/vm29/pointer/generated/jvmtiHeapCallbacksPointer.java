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
 * Structure: jvmtiHeapCallbacksPointer
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
 * The generated code will provide getters for all elements in the jvmtiHeapCallbacksPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiHeapCallbacks.class)
public class jvmtiHeapCallbacksPointer extends StructurePointer {

	// NULL
	public static final jvmtiHeapCallbacksPointer NULL = new jvmtiHeapCallbacksPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiHeapCallbacksPointer(long address) {
		super(address);
	}

	public static jvmtiHeapCallbacksPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiHeapCallbacksPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiHeapCallbacksPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiHeapCallbacksPointer(address);
	}

	public jvmtiHeapCallbacksPointer add(long count) {
		return jvmtiHeapCallbacksPointer.cast(address + (jvmtiHeapCallbacks.SIZEOF * count));
	}

	public jvmtiHeapCallbacksPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiHeapCallbacksPointer addOffset(long offset) {
		return jvmtiHeapCallbacksPointer.cast(address + offset);
	}

	public jvmtiHeapCallbacksPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiHeapCallbacksPointer sub(long count) {
		return jvmtiHeapCallbacksPointer.cast(address - (jvmtiHeapCallbacks.SIZEOF * count));
	}

	public jvmtiHeapCallbacksPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiHeapCallbacksPointer subOffset(long offset) {
		return jvmtiHeapCallbacksPointer.cast(address - offset);
	}

	public jvmtiHeapCallbacksPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiHeapCallbacksPointer untag(long mask) {
		return jvmtiHeapCallbacksPointer.cast(address & ~mask);
	}

	public jvmtiHeapCallbacksPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiHeapCallbacks.SIZEOF;
	}

	// Implementation methods

	// jvmtiArrayPrimitiveValueCallback array_primitive_value_callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_array_primitive_value_callbackOffset_", declaredType="jvmtiArrayPrimitiveValueCallback")
	public VoidPointer array_primitive_value_callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._array_primitive_value_callbackOffset_));
	}

	// jvmtiArrayPrimitiveValueCallback array_primitive_value_callback
	public PointerPointer array_primitive_value_callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._array_primitive_value_callbackOffset_));
	}

	// jvmtiHeapIterationCallback heap_iteration_callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_iteration_callbackOffset_", declaredType="jvmtiHeapIterationCallback")
	public VoidPointer heap_iteration_callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._heap_iteration_callbackOffset_));
	}

	// jvmtiHeapIterationCallback heap_iteration_callback
	public PointerPointer heap_iteration_callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._heap_iteration_callbackOffset_));
	}

	// jvmtiHeapReferenceCallback heap_reference_callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_reference_callbackOffset_", declaredType="jvmtiHeapReferenceCallback")
	public VoidPointer heap_reference_callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._heap_reference_callbackOffset_));
	}

	// jvmtiHeapReferenceCallback heap_reference_callback
	public PointerPointer heap_reference_callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._heap_reference_callbackOffset_));
	}

	// jvmtiPrimitiveFieldCallback primitive_field_callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_primitive_field_callbackOffset_", declaredType="jvmtiPrimitiveFieldCallback")
	public VoidPointer primitive_field_callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._primitive_field_callbackOffset_));
	}

	// jvmtiPrimitiveFieldCallback primitive_field_callback
	public PointerPointer primitive_field_callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._primitive_field_callbackOffset_));
	}

	// jvmtiReservedCallback reserved10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved10Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved10() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved10Offset_));
	}

	// jvmtiReservedCallback reserved10
	public PointerPointer reserved10EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved10Offset_));
	}

	// jvmtiReservedCallback reserved11
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved11Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved11() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved11Offset_));
	}

	// jvmtiReservedCallback reserved11
	public PointerPointer reserved11EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved11Offset_));
	}

	// jvmtiReservedCallback reserved12
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved12Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved12() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved12Offset_));
	}

	// jvmtiReservedCallback reserved12
	public PointerPointer reserved12EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved12Offset_));
	}

	// jvmtiReservedCallback reserved13
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved13Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved13() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved13Offset_));
	}

	// jvmtiReservedCallback reserved13
	public PointerPointer reserved13EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved13Offset_));
	}

	// jvmtiReservedCallback reserved14
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved14Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved14() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved14Offset_));
	}

	// jvmtiReservedCallback reserved14
	public PointerPointer reserved14EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved14Offset_));
	}

	// jvmtiReservedCallback reserved15
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved15Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved15() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved15Offset_));
	}

	// jvmtiReservedCallback reserved15
	public PointerPointer reserved15EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved15Offset_));
	}

	// jvmtiReservedCallback reserved5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved5Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved5() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved5Offset_));
	}

	// jvmtiReservedCallback reserved5
	public PointerPointer reserved5EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved5Offset_));
	}

	// jvmtiReservedCallback reserved6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved6Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved6() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved6Offset_));
	}

	// jvmtiReservedCallback reserved6
	public PointerPointer reserved6EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved6Offset_));
	}

	// jvmtiReservedCallback reserved7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved7Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved7() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved7Offset_));
	}

	// jvmtiReservedCallback reserved7
	public PointerPointer reserved7EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved7Offset_));
	}

	// jvmtiReservedCallback reserved8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved8Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved8() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved8Offset_));
	}

	// jvmtiReservedCallback reserved8
	public PointerPointer reserved8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved8Offset_));
	}

	// jvmtiReservedCallback reserved9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved9Offset_", declaredType="jvmtiReservedCallback")
	public VoidPointer reserved9() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._reserved9Offset_));
	}

	// jvmtiReservedCallback reserved9
	public PointerPointer reserved9EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._reserved9Offset_));
	}

	// jvmtiStringPrimitiveValueCallback string_primitive_value_callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_string_primitive_value_callbackOffset_", declaredType="jvmtiStringPrimitiveValueCallback")
	public VoidPointer string_primitive_value_callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiHeapCallbacks._string_primitive_value_callbackOffset_));
	}

	// jvmtiStringPrimitiveValueCallback string_primitive_value_callback
	public PointerPointer string_primitive_value_callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiHeapCallbacks._string_primitive_value_callbackOffset_));
	}

}
