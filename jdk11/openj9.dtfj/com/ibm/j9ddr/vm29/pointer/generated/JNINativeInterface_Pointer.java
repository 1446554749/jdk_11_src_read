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
 * Structure: JNINativeInterface_Pointer
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
 * The generated code will provide getters for all elements in the JNINativeInterface_Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JNINativeInterface_.class)
public class JNINativeInterface_Pointer extends StructurePointer {

	// NULL
	public static final JNINativeInterface_Pointer NULL = new JNINativeInterface_Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JNINativeInterface_Pointer(long address) {
		super(address);
	}

	public static JNINativeInterface_Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JNINativeInterface_Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JNINativeInterface_Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JNINativeInterface_Pointer(address);
	}

	public JNINativeInterface_Pointer add(long count) {
		return JNINativeInterface_Pointer.cast(address + (JNINativeInterface_.SIZEOF * count));
	}

	public JNINativeInterface_Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public JNINativeInterface_Pointer addOffset(long offset) {
		return JNINativeInterface_Pointer.cast(address + offset);
	}

	public JNINativeInterface_Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JNINativeInterface_Pointer sub(long count) {
		return JNINativeInterface_Pointer.cast(address - (JNINativeInterface_.SIZEOF * count));
	}

	public JNINativeInterface_Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JNINativeInterface_Pointer subOffset(long offset) {
		return JNINativeInterface_Pointer.cast(address - offset);
	}

	public JNINativeInterface_Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JNINativeInterface_Pointer untag(long mask) {
		return JNINativeInterface_Pointer.cast(address & ~mask);
	}

	public JNINativeInterface_Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JNINativeInterface_.SIZEOF;
	}

	// Implementation methods

	// void* AllocObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AllocObjectOffset_", declaredType="void*")
	public VoidPointer AllocObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._AllocObjectOffset_));
	}

	// void* AllocObject
	public PointerPointer AllocObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._AllocObjectOffset_));
	}

	// void* CallBooleanMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallBooleanMethodOffset_", declaredType="void*")
	public VoidPointer CallBooleanMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallBooleanMethodOffset_));
	}

	// void* CallBooleanMethod
	public PointerPointer CallBooleanMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallBooleanMethodOffset_));
	}

	// void* CallBooleanMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallBooleanMethodAOffset_", declaredType="void*")
	public VoidPointer CallBooleanMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallBooleanMethodAOffset_));
	}

	// void* CallBooleanMethodA
	public PointerPointer CallBooleanMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallBooleanMethodAOffset_));
	}

	// void* CallBooleanMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallBooleanMethodVOffset_", declaredType="void*")
	public VoidPointer CallBooleanMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallBooleanMethodVOffset_));
	}

	// void* CallBooleanMethodV
	public PointerPointer CallBooleanMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallBooleanMethodVOffset_));
	}

	// void* CallByteMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallByteMethodOffset_", declaredType="void*")
	public VoidPointer CallByteMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallByteMethodOffset_));
	}

	// void* CallByteMethod
	public PointerPointer CallByteMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallByteMethodOffset_));
	}

	// void* CallByteMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallByteMethodAOffset_", declaredType="void*")
	public VoidPointer CallByteMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallByteMethodAOffset_));
	}

	// void* CallByteMethodA
	public PointerPointer CallByteMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallByteMethodAOffset_));
	}

	// void* CallByteMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallByteMethodVOffset_", declaredType="void*")
	public VoidPointer CallByteMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallByteMethodVOffset_));
	}

	// void* CallByteMethodV
	public PointerPointer CallByteMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallByteMethodVOffset_));
	}

	// void* CallCharMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallCharMethodOffset_", declaredType="void*")
	public VoidPointer CallCharMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallCharMethodOffset_));
	}

	// void* CallCharMethod
	public PointerPointer CallCharMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallCharMethodOffset_));
	}

	// void* CallCharMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallCharMethodAOffset_", declaredType="void*")
	public VoidPointer CallCharMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallCharMethodAOffset_));
	}

	// void* CallCharMethodA
	public PointerPointer CallCharMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallCharMethodAOffset_));
	}

	// void* CallCharMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallCharMethodVOffset_", declaredType="void*")
	public VoidPointer CallCharMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallCharMethodVOffset_));
	}

	// void* CallCharMethodV
	public PointerPointer CallCharMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallCharMethodVOffset_));
	}

	// void* CallDoubleMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallDoubleMethodOffset_", declaredType="void*")
	public VoidPointer CallDoubleMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallDoubleMethodOffset_));
	}

	// void* CallDoubleMethod
	public PointerPointer CallDoubleMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallDoubleMethodOffset_));
	}

	// void* CallDoubleMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallDoubleMethodAOffset_", declaredType="void*")
	public VoidPointer CallDoubleMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallDoubleMethodAOffset_));
	}

	// void* CallDoubleMethodA
	public PointerPointer CallDoubleMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallDoubleMethodAOffset_));
	}

	// void* CallDoubleMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallDoubleMethodVOffset_", declaredType="void*")
	public VoidPointer CallDoubleMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallDoubleMethodVOffset_));
	}

	// void* CallDoubleMethodV
	public PointerPointer CallDoubleMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallDoubleMethodVOffset_));
	}

	// void* CallFloatMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallFloatMethodOffset_", declaredType="void*")
	public VoidPointer CallFloatMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallFloatMethodOffset_));
	}

	// void* CallFloatMethod
	public PointerPointer CallFloatMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallFloatMethodOffset_));
	}

	// void* CallFloatMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallFloatMethodAOffset_", declaredType="void*")
	public VoidPointer CallFloatMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallFloatMethodAOffset_));
	}

	// void* CallFloatMethodA
	public PointerPointer CallFloatMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallFloatMethodAOffset_));
	}

	// void* CallFloatMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallFloatMethodVOffset_", declaredType="void*")
	public VoidPointer CallFloatMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallFloatMethodVOffset_));
	}

	// void* CallFloatMethodV
	public PointerPointer CallFloatMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallFloatMethodVOffset_));
	}

	// void* CallIntMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallIntMethodOffset_", declaredType="void*")
	public VoidPointer CallIntMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallIntMethodOffset_));
	}

	// void* CallIntMethod
	public PointerPointer CallIntMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallIntMethodOffset_));
	}

	// void* CallIntMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallIntMethodAOffset_", declaredType="void*")
	public VoidPointer CallIntMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallIntMethodAOffset_));
	}

	// void* CallIntMethodA
	public PointerPointer CallIntMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallIntMethodAOffset_));
	}

	// void* CallIntMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallIntMethodVOffset_", declaredType="void*")
	public VoidPointer CallIntMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallIntMethodVOffset_));
	}

	// void* CallIntMethodV
	public PointerPointer CallIntMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallIntMethodVOffset_));
	}

	// void* CallLongMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallLongMethodOffset_", declaredType="void*")
	public VoidPointer CallLongMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallLongMethodOffset_));
	}

	// void* CallLongMethod
	public PointerPointer CallLongMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallLongMethodOffset_));
	}

	// void* CallLongMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallLongMethodAOffset_", declaredType="void*")
	public VoidPointer CallLongMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallLongMethodAOffset_));
	}

	// void* CallLongMethodA
	public PointerPointer CallLongMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallLongMethodAOffset_));
	}

	// void* CallLongMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallLongMethodVOffset_", declaredType="void*")
	public VoidPointer CallLongMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallLongMethodVOffset_));
	}

	// void* CallLongMethodV
	public PointerPointer CallLongMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallLongMethodVOffset_));
	}

	// void* CallNonvirtualBooleanMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualBooleanMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualBooleanMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualBooleanMethodOffset_));
	}

	// void* CallNonvirtualBooleanMethod
	public PointerPointer CallNonvirtualBooleanMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualBooleanMethodOffset_));
	}

	// void* CallNonvirtualBooleanMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualBooleanMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualBooleanMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualBooleanMethodAOffset_));
	}

	// void* CallNonvirtualBooleanMethodA
	public PointerPointer CallNonvirtualBooleanMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualBooleanMethodAOffset_));
	}

	// void* CallNonvirtualBooleanMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualBooleanMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualBooleanMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualBooleanMethodVOffset_));
	}

	// void* CallNonvirtualBooleanMethodV
	public PointerPointer CallNonvirtualBooleanMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualBooleanMethodVOffset_));
	}

	// void* CallNonvirtualByteMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualByteMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualByteMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualByteMethodOffset_));
	}

	// void* CallNonvirtualByteMethod
	public PointerPointer CallNonvirtualByteMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualByteMethodOffset_));
	}

	// void* CallNonvirtualByteMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualByteMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualByteMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualByteMethodAOffset_));
	}

	// void* CallNonvirtualByteMethodA
	public PointerPointer CallNonvirtualByteMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualByteMethodAOffset_));
	}

	// void* CallNonvirtualByteMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualByteMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualByteMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualByteMethodVOffset_));
	}

	// void* CallNonvirtualByteMethodV
	public PointerPointer CallNonvirtualByteMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualByteMethodVOffset_));
	}

	// void* CallNonvirtualCharMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualCharMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualCharMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualCharMethodOffset_));
	}

	// void* CallNonvirtualCharMethod
	public PointerPointer CallNonvirtualCharMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualCharMethodOffset_));
	}

	// void* CallNonvirtualCharMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualCharMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualCharMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualCharMethodAOffset_));
	}

	// void* CallNonvirtualCharMethodA
	public PointerPointer CallNonvirtualCharMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualCharMethodAOffset_));
	}

	// void* CallNonvirtualCharMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualCharMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualCharMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualCharMethodVOffset_));
	}

	// void* CallNonvirtualCharMethodV
	public PointerPointer CallNonvirtualCharMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualCharMethodVOffset_));
	}

	// void* CallNonvirtualDoubleMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualDoubleMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualDoubleMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualDoubleMethodOffset_));
	}

	// void* CallNonvirtualDoubleMethod
	public PointerPointer CallNonvirtualDoubleMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualDoubleMethodOffset_));
	}

	// void* CallNonvirtualDoubleMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualDoubleMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualDoubleMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualDoubleMethodAOffset_));
	}

	// void* CallNonvirtualDoubleMethodA
	public PointerPointer CallNonvirtualDoubleMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualDoubleMethodAOffset_));
	}

	// void* CallNonvirtualDoubleMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualDoubleMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualDoubleMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualDoubleMethodVOffset_));
	}

	// void* CallNonvirtualDoubleMethodV
	public PointerPointer CallNonvirtualDoubleMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualDoubleMethodVOffset_));
	}

	// void* CallNonvirtualFloatMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualFloatMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualFloatMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualFloatMethodOffset_));
	}

	// void* CallNonvirtualFloatMethod
	public PointerPointer CallNonvirtualFloatMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualFloatMethodOffset_));
	}

	// void* CallNonvirtualFloatMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualFloatMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualFloatMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualFloatMethodAOffset_));
	}

	// void* CallNonvirtualFloatMethodA
	public PointerPointer CallNonvirtualFloatMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualFloatMethodAOffset_));
	}

	// void* CallNonvirtualFloatMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualFloatMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualFloatMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualFloatMethodVOffset_));
	}

	// void* CallNonvirtualFloatMethodV
	public PointerPointer CallNonvirtualFloatMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualFloatMethodVOffset_));
	}

	// void* CallNonvirtualIntMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualIntMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualIntMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualIntMethodOffset_));
	}

	// void* CallNonvirtualIntMethod
	public PointerPointer CallNonvirtualIntMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualIntMethodOffset_));
	}

	// void* CallNonvirtualIntMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualIntMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualIntMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualIntMethodAOffset_));
	}

	// void* CallNonvirtualIntMethodA
	public PointerPointer CallNonvirtualIntMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualIntMethodAOffset_));
	}

	// void* CallNonvirtualIntMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualIntMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualIntMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualIntMethodVOffset_));
	}

	// void* CallNonvirtualIntMethodV
	public PointerPointer CallNonvirtualIntMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualIntMethodVOffset_));
	}

	// void* CallNonvirtualLongMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualLongMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualLongMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualLongMethodOffset_));
	}

	// void* CallNonvirtualLongMethod
	public PointerPointer CallNonvirtualLongMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualLongMethodOffset_));
	}

	// void* CallNonvirtualLongMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualLongMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualLongMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualLongMethodAOffset_));
	}

	// void* CallNonvirtualLongMethodA
	public PointerPointer CallNonvirtualLongMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualLongMethodAOffset_));
	}

	// void* CallNonvirtualLongMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualLongMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualLongMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualLongMethodVOffset_));
	}

	// void* CallNonvirtualLongMethodV
	public PointerPointer CallNonvirtualLongMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualLongMethodVOffset_));
	}

	// void* CallNonvirtualObjectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualObjectMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualObjectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualObjectMethodOffset_));
	}

	// void* CallNonvirtualObjectMethod
	public PointerPointer CallNonvirtualObjectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualObjectMethodOffset_));
	}

	// void* CallNonvirtualObjectMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualObjectMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualObjectMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualObjectMethodAOffset_));
	}

	// void* CallNonvirtualObjectMethodA
	public PointerPointer CallNonvirtualObjectMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualObjectMethodAOffset_));
	}

	// void* CallNonvirtualObjectMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualObjectMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualObjectMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualObjectMethodVOffset_));
	}

	// void* CallNonvirtualObjectMethodV
	public PointerPointer CallNonvirtualObjectMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualObjectMethodVOffset_));
	}

	// void* CallNonvirtualShortMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualShortMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualShortMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualShortMethodOffset_));
	}

	// void* CallNonvirtualShortMethod
	public PointerPointer CallNonvirtualShortMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualShortMethodOffset_));
	}

	// void* CallNonvirtualShortMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualShortMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualShortMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualShortMethodAOffset_));
	}

	// void* CallNonvirtualShortMethodA
	public PointerPointer CallNonvirtualShortMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualShortMethodAOffset_));
	}

	// void* CallNonvirtualShortMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualShortMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualShortMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualShortMethodVOffset_));
	}

	// void* CallNonvirtualShortMethodV
	public PointerPointer CallNonvirtualShortMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualShortMethodVOffset_));
	}

	// void* CallNonvirtualVoidMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualVoidMethodOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualVoidMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualVoidMethodOffset_));
	}

	// void* CallNonvirtualVoidMethod
	public PointerPointer CallNonvirtualVoidMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualVoidMethodOffset_));
	}

	// void* CallNonvirtualVoidMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualVoidMethodAOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualVoidMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualVoidMethodAOffset_));
	}

	// void* CallNonvirtualVoidMethodA
	public PointerPointer CallNonvirtualVoidMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualVoidMethodAOffset_));
	}

	// void* CallNonvirtualVoidMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallNonvirtualVoidMethodVOffset_", declaredType="void*")
	public VoidPointer CallNonvirtualVoidMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallNonvirtualVoidMethodVOffset_));
	}

	// void* CallNonvirtualVoidMethodV
	public PointerPointer CallNonvirtualVoidMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallNonvirtualVoidMethodVOffset_));
	}

	// void* CallObjectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallObjectMethodOffset_", declaredType="void*")
	public VoidPointer CallObjectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallObjectMethodOffset_));
	}

	// void* CallObjectMethod
	public PointerPointer CallObjectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallObjectMethodOffset_));
	}

	// void* CallObjectMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallObjectMethodAOffset_", declaredType="void*")
	public VoidPointer CallObjectMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallObjectMethodAOffset_));
	}

	// void* CallObjectMethodA
	public PointerPointer CallObjectMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallObjectMethodAOffset_));
	}

	// void* CallObjectMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallObjectMethodVOffset_", declaredType="void*")
	public VoidPointer CallObjectMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallObjectMethodVOffset_));
	}

	// void* CallObjectMethodV
	public PointerPointer CallObjectMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallObjectMethodVOffset_));
	}

	// void* CallShortMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallShortMethodOffset_", declaredType="void*")
	public VoidPointer CallShortMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallShortMethodOffset_));
	}

	// void* CallShortMethod
	public PointerPointer CallShortMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallShortMethodOffset_));
	}

	// void* CallShortMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallShortMethodAOffset_", declaredType="void*")
	public VoidPointer CallShortMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallShortMethodAOffset_));
	}

	// void* CallShortMethodA
	public PointerPointer CallShortMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallShortMethodAOffset_));
	}

	// void* CallShortMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallShortMethodVOffset_", declaredType="void*")
	public VoidPointer CallShortMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallShortMethodVOffset_));
	}

	// void* CallShortMethodV
	public PointerPointer CallShortMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallShortMethodVOffset_));
	}

	// void* CallStaticBooleanMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticBooleanMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticBooleanMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticBooleanMethodOffset_));
	}

	// void* CallStaticBooleanMethod
	public PointerPointer CallStaticBooleanMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticBooleanMethodOffset_));
	}

	// void* CallStaticBooleanMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticBooleanMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticBooleanMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticBooleanMethodAOffset_));
	}

	// void* CallStaticBooleanMethodA
	public PointerPointer CallStaticBooleanMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticBooleanMethodAOffset_));
	}

	// void* CallStaticBooleanMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticBooleanMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticBooleanMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticBooleanMethodVOffset_));
	}

	// void* CallStaticBooleanMethodV
	public PointerPointer CallStaticBooleanMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticBooleanMethodVOffset_));
	}

	// void* CallStaticByteMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticByteMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticByteMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticByteMethodOffset_));
	}

	// void* CallStaticByteMethod
	public PointerPointer CallStaticByteMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticByteMethodOffset_));
	}

	// void* CallStaticByteMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticByteMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticByteMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticByteMethodAOffset_));
	}

	// void* CallStaticByteMethodA
	public PointerPointer CallStaticByteMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticByteMethodAOffset_));
	}

	// void* CallStaticByteMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticByteMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticByteMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticByteMethodVOffset_));
	}

	// void* CallStaticByteMethodV
	public PointerPointer CallStaticByteMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticByteMethodVOffset_));
	}

	// void* CallStaticCharMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticCharMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticCharMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticCharMethodOffset_));
	}

	// void* CallStaticCharMethod
	public PointerPointer CallStaticCharMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticCharMethodOffset_));
	}

	// void* CallStaticCharMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticCharMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticCharMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticCharMethodAOffset_));
	}

	// void* CallStaticCharMethodA
	public PointerPointer CallStaticCharMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticCharMethodAOffset_));
	}

	// void* CallStaticCharMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticCharMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticCharMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticCharMethodVOffset_));
	}

	// void* CallStaticCharMethodV
	public PointerPointer CallStaticCharMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticCharMethodVOffset_));
	}

	// void* CallStaticDoubleMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticDoubleMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticDoubleMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticDoubleMethodOffset_));
	}

	// void* CallStaticDoubleMethod
	public PointerPointer CallStaticDoubleMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticDoubleMethodOffset_));
	}

	// void* CallStaticDoubleMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticDoubleMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticDoubleMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticDoubleMethodAOffset_));
	}

	// void* CallStaticDoubleMethodA
	public PointerPointer CallStaticDoubleMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticDoubleMethodAOffset_));
	}

	// void* CallStaticDoubleMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticDoubleMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticDoubleMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticDoubleMethodVOffset_));
	}

	// void* CallStaticDoubleMethodV
	public PointerPointer CallStaticDoubleMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticDoubleMethodVOffset_));
	}

	// void* CallStaticFloatMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticFloatMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticFloatMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticFloatMethodOffset_));
	}

	// void* CallStaticFloatMethod
	public PointerPointer CallStaticFloatMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticFloatMethodOffset_));
	}

	// void* CallStaticFloatMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticFloatMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticFloatMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticFloatMethodAOffset_));
	}

	// void* CallStaticFloatMethodA
	public PointerPointer CallStaticFloatMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticFloatMethodAOffset_));
	}

	// void* CallStaticFloatMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticFloatMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticFloatMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticFloatMethodVOffset_));
	}

	// void* CallStaticFloatMethodV
	public PointerPointer CallStaticFloatMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticFloatMethodVOffset_));
	}

	// void* CallStaticIntMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticIntMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticIntMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticIntMethodOffset_));
	}

	// void* CallStaticIntMethod
	public PointerPointer CallStaticIntMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticIntMethodOffset_));
	}

	// void* CallStaticIntMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticIntMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticIntMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticIntMethodAOffset_));
	}

	// void* CallStaticIntMethodA
	public PointerPointer CallStaticIntMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticIntMethodAOffset_));
	}

	// void* CallStaticIntMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticIntMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticIntMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticIntMethodVOffset_));
	}

	// void* CallStaticIntMethodV
	public PointerPointer CallStaticIntMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticIntMethodVOffset_));
	}

	// void* CallStaticLongMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticLongMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticLongMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticLongMethodOffset_));
	}

	// void* CallStaticLongMethod
	public PointerPointer CallStaticLongMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticLongMethodOffset_));
	}

	// void* CallStaticLongMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticLongMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticLongMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticLongMethodAOffset_));
	}

	// void* CallStaticLongMethodA
	public PointerPointer CallStaticLongMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticLongMethodAOffset_));
	}

	// void* CallStaticLongMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticLongMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticLongMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticLongMethodVOffset_));
	}

	// void* CallStaticLongMethodV
	public PointerPointer CallStaticLongMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticLongMethodVOffset_));
	}

	// void* CallStaticObjectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticObjectMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticObjectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticObjectMethodOffset_));
	}

	// void* CallStaticObjectMethod
	public PointerPointer CallStaticObjectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticObjectMethodOffset_));
	}

	// void* CallStaticObjectMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticObjectMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticObjectMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticObjectMethodAOffset_));
	}

	// void* CallStaticObjectMethodA
	public PointerPointer CallStaticObjectMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticObjectMethodAOffset_));
	}

	// void* CallStaticObjectMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticObjectMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticObjectMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticObjectMethodVOffset_));
	}

	// void* CallStaticObjectMethodV
	public PointerPointer CallStaticObjectMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticObjectMethodVOffset_));
	}

	// void* CallStaticShortMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticShortMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticShortMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticShortMethodOffset_));
	}

	// void* CallStaticShortMethod
	public PointerPointer CallStaticShortMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticShortMethodOffset_));
	}

	// void* CallStaticShortMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticShortMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticShortMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticShortMethodAOffset_));
	}

	// void* CallStaticShortMethodA
	public PointerPointer CallStaticShortMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticShortMethodAOffset_));
	}

	// void* CallStaticShortMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticShortMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticShortMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticShortMethodVOffset_));
	}

	// void* CallStaticShortMethodV
	public PointerPointer CallStaticShortMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticShortMethodVOffset_));
	}

	// void* CallStaticVoidMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticVoidMethodOffset_", declaredType="void*")
	public VoidPointer CallStaticVoidMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticVoidMethodOffset_));
	}

	// void* CallStaticVoidMethod
	public PointerPointer CallStaticVoidMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticVoidMethodOffset_));
	}

	// void* CallStaticVoidMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticVoidMethodAOffset_", declaredType="void*")
	public VoidPointer CallStaticVoidMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticVoidMethodAOffset_));
	}

	// void* CallStaticVoidMethodA
	public PointerPointer CallStaticVoidMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticVoidMethodAOffset_));
	}

	// void* CallStaticVoidMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallStaticVoidMethodVOffset_", declaredType="void*")
	public VoidPointer CallStaticVoidMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallStaticVoidMethodVOffset_));
	}

	// void* CallStaticVoidMethodV
	public PointerPointer CallStaticVoidMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallStaticVoidMethodVOffset_));
	}

	// void* CallVoidMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallVoidMethodOffset_", declaredType="void*")
	public VoidPointer CallVoidMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallVoidMethodOffset_));
	}

	// void* CallVoidMethod
	public PointerPointer CallVoidMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallVoidMethodOffset_));
	}

	// void* CallVoidMethodA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallVoidMethodAOffset_", declaredType="void*")
	public VoidPointer CallVoidMethodA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallVoidMethodAOffset_));
	}

	// void* CallVoidMethodA
	public PointerPointer CallVoidMethodAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallVoidMethodAOffset_));
	}

	// void* CallVoidMethodV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CallVoidMethodVOffset_", declaredType="void*")
	public VoidPointer CallVoidMethodV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._CallVoidMethodVOffset_));
	}

	// void* CallVoidMethodV
	public PointerPointer CallVoidMethodVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._CallVoidMethodVOffset_));
	}

	// void* DefineClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DefineClassOffset_", declaredType="void*")
	public VoidPointer DefineClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._DefineClassOffset_));
	}

	// void* DefineClass
	public PointerPointer DefineClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._DefineClassOffset_));
	}

	// void* DeleteGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeleteGlobalRefOffset_", declaredType="void*")
	public VoidPointer DeleteGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._DeleteGlobalRefOffset_));
	}

	// void* DeleteGlobalRef
	public PointerPointer DeleteGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._DeleteGlobalRefOffset_));
	}

	// void* DeleteLocalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeleteLocalRefOffset_", declaredType="void*")
	public VoidPointer DeleteLocalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._DeleteLocalRefOffset_));
	}

	// void* DeleteLocalRef
	public PointerPointer DeleteLocalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._DeleteLocalRefOffset_));
	}

	// void* DeleteWeakGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeleteWeakGlobalRefOffset_", declaredType="void*")
	public VoidPointer DeleteWeakGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._DeleteWeakGlobalRefOffset_));
	}

	// void* DeleteWeakGlobalRef
	public PointerPointer DeleteWeakGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._DeleteWeakGlobalRefOffset_));
	}

	// void* EnsureLocalCapacity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_EnsureLocalCapacityOffset_", declaredType="void*")
	public VoidPointer EnsureLocalCapacity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._EnsureLocalCapacityOffset_));
	}

	// void* EnsureLocalCapacity
	public PointerPointer EnsureLocalCapacityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._EnsureLocalCapacityOffset_));
	}

	// void* ExceptionCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionCheckOffset_", declaredType="void*")
	public VoidPointer ExceptionCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ExceptionCheckOffset_));
	}

	// void* ExceptionCheck
	public PointerPointer ExceptionCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ExceptionCheckOffset_));
	}

	// void* ExceptionClear
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionClearOffset_", declaredType="void*")
	public VoidPointer ExceptionClear() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ExceptionClearOffset_));
	}

	// void* ExceptionClear
	public PointerPointer ExceptionClearEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ExceptionClearOffset_));
	}

	// void* ExceptionDescribe
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionDescribeOffset_", declaredType="void*")
	public VoidPointer ExceptionDescribe() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ExceptionDescribeOffset_));
	}

	// void* ExceptionDescribe
	public PointerPointer ExceptionDescribeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ExceptionDescribeOffset_));
	}

	// void* ExceptionOccurred
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ExceptionOccurredOffset_", declaredType="void*")
	public VoidPointer ExceptionOccurred() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ExceptionOccurredOffset_));
	}

	// void* ExceptionOccurred
	public PointerPointer ExceptionOccurredEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ExceptionOccurredOffset_));
	}

	// void* FatalError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FatalErrorOffset_", declaredType="void*")
	public VoidPointer FatalError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._FatalErrorOffset_));
	}

	// void* FatalError
	public PointerPointer FatalErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._FatalErrorOffset_));
	}

	// void* FindClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FindClassOffset_", declaredType="void*")
	public VoidPointer FindClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._FindClassOffset_));
	}

	// void* FindClass
	public PointerPointer FindClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._FindClassOffset_));
	}

	// void* FromReflectedField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FromReflectedFieldOffset_", declaredType="void*")
	public VoidPointer FromReflectedField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._FromReflectedFieldOffset_));
	}

	// void* FromReflectedField
	public PointerPointer FromReflectedFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._FromReflectedFieldOffset_));
	}

	// void* FromReflectedMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FromReflectedMethodOffset_", declaredType="void*")
	public VoidPointer FromReflectedMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._FromReflectedMethodOffset_));
	}

	// void* FromReflectedMethod
	public PointerPointer FromReflectedMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._FromReflectedMethodOffset_));
	}

	// void* GetArrayLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetArrayLengthOffset_", declaredType="void*")
	public VoidPointer GetArrayLength() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetArrayLengthOffset_));
	}

	// void* GetArrayLength
	public PointerPointer GetArrayLengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetArrayLengthOffset_));
	}

	// void* GetBooleanArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetBooleanArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetBooleanArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetBooleanArrayElementsOffset_));
	}

	// void* GetBooleanArrayElements
	public PointerPointer GetBooleanArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetBooleanArrayElementsOffset_));
	}

	// void* GetBooleanArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetBooleanArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetBooleanArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetBooleanArrayRegionOffset_));
	}

	// void* GetBooleanArrayRegion
	public PointerPointer GetBooleanArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetBooleanArrayRegionOffset_));
	}

	// void* GetBooleanField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetBooleanFieldOffset_", declaredType="void*")
	public VoidPointer GetBooleanField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetBooleanFieldOffset_));
	}

	// void* GetBooleanField
	public PointerPointer GetBooleanFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetBooleanFieldOffset_));
	}

	// void* GetByteArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetByteArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetByteArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetByteArrayElementsOffset_));
	}

	// void* GetByteArrayElements
	public PointerPointer GetByteArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetByteArrayElementsOffset_));
	}

	// void* GetByteArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetByteArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetByteArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetByteArrayRegionOffset_));
	}

	// void* GetByteArrayRegion
	public PointerPointer GetByteArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetByteArrayRegionOffset_));
	}

	// void* GetByteField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetByteFieldOffset_", declaredType="void*")
	public VoidPointer GetByteField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetByteFieldOffset_));
	}

	// void* GetByteField
	public PointerPointer GetByteFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetByteFieldOffset_));
	}

	// void* GetCharArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCharArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetCharArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetCharArrayElementsOffset_));
	}

	// void* GetCharArrayElements
	public PointerPointer GetCharArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetCharArrayElementsOffset_));
	}

	// void* GetCharArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCharArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetCharArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetCharArrayRegionOffset_));
	}

	// void* GetCharArrayRegion
	public PointerPointer GetCharArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetCharArrayRegionOffset_));
	}

	// void* GetCharField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCharFieldOffset_", declaredType="void*")
	public VoidPointer GetCharField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetCharFieldOffset_));
	}

	// void* GetCharField
	public PointerPointer GetCharFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetCharFieldOffset_));
	}

	// void* GetDirectBufferAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetDirectBufferAddressOffset_", declaredType="void*")
	public VoidPointer GetDirectBufferAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetDirectBufferAddressOffset_));
	}

	// void* GetDirectBufferAddress
	public PointerPointer GetDirectBufferAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetDirectBufferAddressOffset_));
	}

	// void* GetDirectBufferCapacity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetDirectBufferCapacityOffset_", declaredType="void*")
	public VoidPointer GetDirectBufferCapacity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetDirectBufferCapacityOffset_));
	}

	// void* GetDirectBufferCapacity
	public PointerPointer GetDirectBufferCapacityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetDirectBufferCapacityOffset_));
	}

	// void* GetDoubleArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetDoubleArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetDoubleArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetDoubleArrayElementsOffset_));
	}

	// void* GetDoubleArrayElements
	public PointerPointer GetDoubleArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetDoubleArrayElementsOffset_));
	}

	// void* GetDoubleArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetDoubleArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetDoubleArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetDoubleArrayRegionOffset_));
	}

	// void* GetDoubleArrayRegion
	public PointerPointer GetDoubleArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetDoubleArrayRegionOffset_));
	}

	// void* GetDoubleField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetDoubleFieldOffset_", declaredType="void*")
	public VoidPointer GetDoubleField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetDoubleFieldOffset_));
	}

	// void* GetDoubleField
	public PointerPointer GetDoubleFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetDoubleFieldOffset_));
	}

	// void* GetFieldID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFieldIDOffset_", declaredType="void*")
	public VoidPointer GetFieldID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetFieldIDOffset_));
	}

	// void* GetFieldID
	public PointerPointer GetFieldIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetFieldIDOffset_));
	}

	// void* GetFloatArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFloatArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetFloatArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetFloatArrayElementsOffset_));
	}

	// void* GetFloatArrayElements
	public PointerPointer GetFloatArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetFloatArrayElementsOffset_));
	}

	// void* GetFloatArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFloatArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetFloatArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetFloatArrayRegionOffset_));
	}

	// void* GetFloatArrayRegion
	public PointerPointer GetFloatArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetFloatArrayRegionOffset_));
	}

	// void* GetFloatField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFloatFieldOffset_", declaredType="void*")
	public VoidPointer GetFloatField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetFloatFieldOffset_));
	}

	// void* GetFloatField
	public PointerPointer GetFloatFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetFloatFieldOffset_));
	}

	// void* GetIntArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetIntArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetIntArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetIntArrayElementsOffset_));
	}

	// void* GetIntArrayElements
	public PointerPointer GetIntArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetIntArrayElementsOffset_));
	}

	// void* GetIntArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetIntArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetIntArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetIntArrayRegionOffset_));
	}

	// void* GetIntArrayRegion
	public PointerPointer GetIntArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetIntArrayRegionOffset_));
	}

	// void* GetIntField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetIntFieldOffset_", declaredType="void*")
	public VoidPointer GetIntField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetIntFieldOffset_));
	}

	// void* GetIntField
	public PointerPointer GetIntFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetIntFieldOffset_));
	}

	// void* GetJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetJavaVMOffset_", declaredType="void*")
	public VoidPointer GetJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetJavaVMOffset_));
	}

	// void* GetJavaVM
	public PointerPointer GetJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetJavaVMOffset_));
	}

	// void* GetLongArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLongArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetLongArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetLongArrayElementsOffset_));
	}

	// void* GetLongArrayElements
	public PointerPointer GetLongArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetLongArrayElementsOffset_));
	}

	// void* GetLongArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLongArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetLongArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetLongArrayRegionOffset_));
	}

	// void* GetLongArrayRegion
	public PointerPointer GetLongArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetLongArrayRegionOffset_));
	}

	// void* GetLongField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLongFieldOffset_", declaredType="void*")
	public VoidPointer GetLongField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetLongFieldOffset_));
	}

	// void* GetLongField
	public PointerPointer GetLongFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetLongFieldOffset_));
	}

	// void* GetMethodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodIDOffset_", declaredType="void*")
	public VoidPointer GetMethodID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetMethodIDOffset_));
	}

	// void* GetMethodID
	public PointerPointer GetMethodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetMethodIDOffset_));
	}

	// void* GetModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetModuleOffset_", declaredType="void*")
	public VoidPointer GetModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetModuleOffset_));
	}

	// void* GetModule
	public PointerPointer GetModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetModuleOffset_));
	}

	// void* GetObjectArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectArrayElementOffset_", declaredType="void*")
	public VoidPointer GetObjectArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetObjectArrayElementOffset_));
	}

	// void* GetObjectArrayElement
	public PointerPointer GetObjectArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetObjectArrayElementOffset_));
	}

	// void* GetObjectClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectClassOffset_", declaredType="void*")
	public VoidPointer GetObjectClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetObjectClassOffset_));
	}

	// void* GetObjectClass
	public PointerPointer GetObjectClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetObjectClassOffset_));
	}

	// void* GetObjectField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectFieldOffset_", declaredType="void*")
	public VoidPointer GetObjectField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetObjectFieldOffset_));
	}

	// void* GetObjectField
	public PointerPointer GetObjectFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetObjectFieldOffset_));
	}

	// void* GetObjectRefType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectRefTypeOffset_", declaredType="void*")
	public VoidPointer GetObjectRefType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetObjectRefTypeOffset_));
	}

	// void* GetObjectRefType
	public PointerPointer GetObjectRefTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetObjectRefTypeOffset_));
	}

	// void* GetPrimitiveArrayCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetPrimitiveArrayCriticalOffset_", declaredType="void*")
	public VoidPointer GetPrimitiveArrayCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetPrimitiveArrayCriticalOffset_));
	}

	// void* GetPrimitiveArrayCritical
	public PointerPointer GetPrimitiveArrayCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetPrimitiveArrayCriticalOffset_));
	}

	// void* GetShortArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetShortArrayElementsOffset_", declaredType="void*")
	public VoidPointer GetShortArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetShortArrayElementsOffset_));
	}

	// void* GetShortArrayElements
	public PointerPointer GetShortArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetShortArrayElementsOffset_));
	}

	// void* GetShortArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetShortArrayRegionOffset_", declaredType="void*")
	public VoidPointer GetShortArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetShortArrayRegionOffset_));
	}

	// void* GetShortArrayRegion
	public PointerPointer GetShortArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetShortArrayRegionOffset_));
	}

	// void* GetShortField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetShortFieldOffset_", declaredType="void*")
	public VoidPointer GetShortField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetShortFieldOffset_));
	}

	// void* GetShortField
	public PointerPointer GetShortFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetShortFieldOffset_));
	}

	// void* GetStaticBooleanField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticBooleanFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticBooleanField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticBooleanFieldOffset_));
	}

	// void* GetStaticBooleanField
	public PointerPointer GetStaticBooleanFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticBooleanFieldOffset_));
	}

	// void* GetStaticByteField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticByteFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticByteField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticByteFieldOffset_));
	}

	// void* GetStaticByteField
	public PointerPointer GetStaticByteFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticByteFieldOffset_));
	}

	// void* GetStaticCharField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticCharFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticCharField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticCharFieldOffset_));
	}

	// void* GetStaticCharField
	public PointerPointer GetStaticCharFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticCharFieldOffset_));
	}

	// void* GetStaticDoubleField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticDoubleFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticDoubleField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticDoubleFieldOffset_));
	}

	// void* GetStaticDoubleField
	public PointerPointer GetStaticDoubleFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticDoubleFieldOffset_));
	}

	// void* GetStaticFieldID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticFieldIDOffset_", declaredType="void*")
	public VoidPointer GetStaticFieldID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticFieldIDOffset_));
	}

	// void* GetStaticFieldID
	public PointerPointer GetStaticFieldIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticFieldIDOffset_));
	}

	// void* GetStaticFloatField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticFloatFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticFloatField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticFloatFieldOffset_));
	}

	// void* GetStaticFloatField
	public PointerPointer GetStaticFloatFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticFloatFieldOffset_));
	}

	// void* GetStaticIntField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticIntFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticIntField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticIntFieldOffset_));
	}

	// void* GetStaticIntField
	public PointerPointer GetStaticIntFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticIntFieldOffset_));
	}

	// void* GetStaticLongField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticLongFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticLongField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticLongFieldOffset_));
	}

	// void* GetStaticLongField
	public PointerPointer GetStaticLongFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticLongFieldOffset_));
	}

	// void* GetStaticMethodID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticMethodIDOffset_", declaredType="void*")
	public VoidPointer GetStaticMethodID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticMethodIDOffset_));
	}

	// void* GetStaticMethodID
	public PointerPointer GetStaticMethodIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticMethodIDOffset_));
	}

	// void* GetStaticObjectField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticObjectFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticObjectField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticObjectFieldOffset_));
	}

	// void* GetStaticObjectField
	public PointerPointer GetStaticObjectFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticObjectFieldOffset_));
	}

	// void* GetStaticShortField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStaticShortFieldOffset_", declaredType="void*")
	public VoidPointer GetStaticShortField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStaticShortFieldOffset_));
	}

	// void* GetStaticShortField
	public PointerPointer GetStaticShortFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStaticShortFieldOffset_));
	}

	// void* GetStringChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringCharsOffset_", declaredType="void*")
	public VoidPointer GetStringChars() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringCharsOffset_));
	}

	// void* GetStringChars
	public PointerPointer GetStringCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringCharsOffset_));
	}

	// void* GetStringCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringCriticalOffset_", declaredType="void*")
	public VoidPointer GetStringCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringCriticalOffset_));
	}

	// void* GetStringCritical
	public PointerPointer GetStringCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringCriticalOffset_));
	}

	// void* GetStringLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringLengthOffset_", declaredType="void*")
	public VoidPointer GetStringLength() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringLengthOffset_));
	}

	// void* GetStringLength
	public PointerPointer GetStringLengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringLengthOffset_));
	}

	// void* GetStringRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringRegionOffset_", declaredType="void*")
	public VoidPointer GetStringRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringRegionOffset_));
	}

	// void* GetStringRegion
	public PointerPointer GetStringRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringRegionOffset_));
	}

	// void* GetStringUTFChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringUTFCharsOffset_", declaredType="void*")
	public VoidPointer GetStringUTFChars() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringUTFCharsOffset_));
	}

	// void* GetStringUTFChars
	public PointerPointer GetStringUTFCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringUTFCharsOffset_));
	}

	// void* GetStringUTFLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringUTFLengthOffset_", declaredType="void*")
	public VoidPointer GetStringUTFLength() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringUTFLengthOffset_));
	}

	// void* GetStringUTFLength
	public PointerPointer GetStringUTFLengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringUTFLengthOffset_));
	}

	// void* GetStringUTFRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStringUTFRegionOffset_", declaredType="void*")
	public VoidPointer GetStringUTFRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetStringUTFRegionOffset_));
	}

	// void* GetStringUTFRegion
	public PointerPointer GetStringUTFRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetStringUTFRegionOffset_));
	}

	// void* GetSuperclass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSuperclassOffset_", declaredType="void*")
	public VoidPointer GetSuperclass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetSuperclassOffset_));
	}

	// void* GetSuperclass
	public PointerPointer GetSuperclassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetSuperclassOffset_));
	}

	// void* GetVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetVersionOffset_", declaredType="void*")
	public VoidPointer GetVersion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._GetVersionOffset_));
	}

	// void* GetVersion
	public PointerPointer GetVersionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._GetVersionOffset_));
	}

	// void* IsAssignableFrom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsAssignableFromOffset_", declaredType="void*")
	public VoidPointer IsAssignableFrom() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._IsAssignableFromOffset_));
	}

	// void* IsAssignableFrom
	public PointerPointer IsAssignableFromEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._IsAssignableFromOffset_));
	}

	// void* IsInstanceOf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsInstanceOfOffset_", declaredType="void*")
	public VoidPointer IsInstanceOf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._IsInstanceOfOffset_));
	}

	// void* IsInstanceOf
	public PointerPointer IsInstanceOfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._IsInstanceOfOffset_));
	}

	// void* IsSameObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsSameObjectOffset_", declaredType="void*")
	public VoidPointer IsSameObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._IsSameObjectOffset_));
	}

	// void* IsSameObject
	public PointerPointer IsSameObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._IsSameObjectOffset_));
	}

	// void* MonitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorEnterOffset_", declaredType="void*")
	public VoidPointer MonitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._MonitorEnterOffset_));
	}

	// void* MonitorEnter
	public PointerPointer MonitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._MonitorEnterOffset_));
	}

	// void* MonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MonitorExitOffset_", declaredType="void*")
	public VoidPointer MonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._MonitorExitOffset_));
	}

	// void* MonitorExit
	public PointerPointer MonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._MonitorExitOffset_));
	}

	// void* NewBooleanArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewBooleanArrayOffset_", declaredType="void*")
	public VoidPointer NewBooleanArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewBooleanArrayOffset_));
	}

	// void* NewBooleanArray
	public PointerPointer NewBooleanArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewBooleanArrayOffset_));
	}

	// void* NewByteArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewByteArrayOffset_", declaredType="void*")
	public VoidPointer NewByteArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewByteArrayOffset_));
	}

	// void* NewByteArray
	public PointerPointer NewByteArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewByteArrayOffset_));
	}

	// void* NewCharArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewCharArrayOffset_", declaredType="void*")
	public VoidPointer NewCharArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewCharArrayOffset_));
	}

	// void* NewCharArray
	public PointerPointer NewCharArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewCharArrayOffset_));
	}

	// void* NewDirectByteBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewDirectByteBufferOffset_", declaredType="void*")
	public VoidPointer NewDirectByteBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewDirectByteBufferOffset_));
	}

	// void* NewDirectByteBuffer
	public PointerPointer NewDirectByteBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewDirectByteBufferOffset_));
	}

	// void* NewDoubleArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewDoubleArrayOffset_", declaredType="void*")
	public VoidPointer NewDoubleArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewDoubleArrayOffset_));
	}

	// void* NewDoubleArray
	public PointerPointer NewDoubleArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewDoubleArrayOffset_));
	}

	// void* NewFloatArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewFloatArrayOffset_", declaredType="void*")
	public VoidPointer NewFloatArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewFloatArrayOffset_));
	}

	// void* NewFloatArray
	public PointerPointer NewFloatArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewFloatArrayOffset_));
	}

	// void* NewGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewGlobalRefOffset_", declaredType="void*")
	public VoidPointer NewGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewGlobalRefOffset_));
	}

	// void* NewGlobalRef
	public PointerPointer NewGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewGlobalRefOffset_));
	}

	// void* NewIntArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewIntArrayOffset_", declaredType="void*")
	public VoidPointer NewIntArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewIntArrayOffset_));
	}

	// void* NewIntArray
	public PointerPointer NewIntArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewIntArrayOffset_));
	}

	// void* NewLocalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewLocalRefOffset_", declaredType="void*")
	public VoidPointer NewLocalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewLocalRefOffset_));
	}

	// void* NewLocalRef
	public PointerPointer NewLocalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewLocalRefOffset_));
	}

	// void* NewLongArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewLongArrayOffset_", declaredType="void*")
	public VoidPointer NewLongArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewLongArrayOffset_));
	}

	// void* NewLongArray
	public PointerPointer NewLongArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewLongArrayOffset_));
	}

	// void* NewObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewObjectOffset_", declaredType="void*")
	public VoidPointer NewObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewObjectOffset_));
	}

	// void* NewObject
	public PointerPointer NewObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewObjectOffset_));
	}

	// void* NewObjectA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewObjectAOffset_", declaredType="void*")
	public VoidPointer NewObjectA() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewObjectAOffset_));
	}

	// void* NewObjectA
	public PointerPointer NewObjectAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewObjectAOffset_));
	}

	// void* NewObjectArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewObjectArrayOffset_", declaredType="void*")
	public VoidPointer NewObjectArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewObjectArrayOffset_));
	}

	// void* NewObjectArray
	public PointerPointer NewObjectArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewObjectArrayOffset_));
	}

	// void* NewObjectV
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewObjectVOffset_", declaredType="void*")
	public VoidPointer NewObjectV() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewObjectVOffset_));
	}

	// void* NewObjectV
	public PointerPointer NewObjectVEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewObjectVOffset_));
	}

	// void* NewShortArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewShortArrayOffset_", declaredType="void*")
	public VoidPointer NewShortArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewShortArrayOffset_));
	}

	// void* NewShortArray
	public PointerPointer NewShortArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewShortArrayOffset_));
	}

	// void* NewString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewStringOffset_", declaredType="void*")
	public VoidPointer NewString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewStringOffset_));
	}

	// void* NewString
	public PointerPointer NewStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewStringOffset_));
	}

	// void* NewStringUTF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewStringUTFOffset_", declaredType="void*")
	public VoidPointer NewStringUTF() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewStringUTFOffset_));
	}

	// void* NewStringUTF
	public PointerPointer NewStringUTFEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewStringUTFOffset_));
	}

	// void* NewWeakGlobalRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NewWeakGlobalRefOffset_", declaredType="void*")
	public VoidPointer NewWeakGlobalRef() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._NewWeakGlobalRefOffset_));
	}

	// void* NewWeakGlobalRef
	public PointerPointer NewWeakGlobalRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._NewWeakGlobalRefOffset_));
	}

	// void* PopLocalFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_PopLocalFrameOffset_", declaredType="void*")
	public VoidPointer PopLocalFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._PopLocalFrameOffset_));
	}

	// void* PopLocalFrame
	public PointerPointer PopLocalFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._PopLocalFrameOffset_));
	}

	// void* PushLocalFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_PushLocalFrameOffset_", declaredType="void*")
	public VoidPointer PushLocalFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._PushLocalFrameOffset_));
	}

	// void* PushLocalFrame
	public PointerPointer PushLocalFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._PushLocalFrameOffset_));
	}

	// void* RegisterNatives
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RegisterNativesOffset_", declaredType="void*")
	public VoidPointer RegisterNatives() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._RegisterNativesOffset_));
	}

	// void* RegisterNatives
	public PointerPointer RegisterNativesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._RegisterNativesOffset_));
	}

	// void* ReleaseBooleanArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseBooleanArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseBooleanArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseBooleanArrayElementsOffset_));
	}

	// void* ReleaseBooleanArrayElements
	public PointerPointer ReleaseBooleanArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseBooleanArrayElementsOffset_));
	}

	// void* ReleaseByteArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseByteArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseByteArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseByteArrayElementsOffset_));
	}

	// void* ReleaseByteArrayElements
	public PointerPointer ReleaseByteArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseByteArrayElementsOffset_));
	}

	// void* ReleaseCharArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseCharArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseCharArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseCharArrayElementsOffset_));
	}

	// void* ReleaseCharArrayElements
	public PointerPointer ReleaseCharArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseCharArrayElementsOffset_));
	}

	// void* ReleaseDoubleArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseDoubleArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseDoubleArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseDoubleArrayElementsOffset_));
	}

	// void* ReleaseDoubleArrayElements
	public PointerPointer ReleaseDoubleArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseDoubleArrayElementsOffset_));
	}

	// void* ReleaseFloatArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseFloatArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseFloatArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseFloatArrayElementsOffset_));
	}

	// void* ReleaseFloatArrayElements
	public PointerPointer ReleaseFloatArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseFloatArrayElementsOffset_));
	}

	// void* ReleaseIntArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseIntArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseIntArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseIntArrayElementsOffset_));
	}

	// void* ReleaseIntArrayElements
	public PointerPointer ReleaseIntArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseIntArrayElementsOffset_));
	}

	// void* ReleaseLongArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseLongArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseLongArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseLongArrayElementsOffset_));
	}

	// void* ReleaseLongArrayElements
	public PointerPointer ReleaseLongArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseLongArrayElementsOffset_));
	}

	// void* ReleasePrimitiveArrayCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleasePrimitiveArrayCriticalOffset_", declaredType="void*")
	public VoidPointer ReleasePrimitiveArrayCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleasePrimitiveArrayCriticalOffset_));
	}

	// void* ReleasePrimitiveArrayCritical
	public PointerPointer ReleasePrimitiveArrayCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleasePrimitiveArrayCriticalOffset_));
	}

	// void* ReleaseShortArrayElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseShortArrayElementsOffset_", declaredType="void*")
	public VoidPointer ReleaseShortArrayElements() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseShortArrayElementsOffset_));
	}

	// void* ReleaseShortArrayElements
	public PointerPointer ReleaseShortArrayElementsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseShortArrayElementsOffset_));
	}

	// void* ReleaseStringChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseStringCharsOffset_", declaredType="void*")
	public VoidPointer ReleaseStringChars() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseStringCharsOffset_));
	}

	// void* ReleaseStringChars
	public PointerPointer ReleaseStringCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseStringCharsOffset_));
	}

	// void* ReleaseStringCritical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseStringCriticalOffset_", declaredType="void*")
	public VoidPointer ReleaseStringCritical() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseStringCriticalOffset_));
	}

	// void* ReleaseStringCritical
	public PointerPointer ReleaseStringCriticalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseStringCriticalOffset_));
	}

	// void* ReleaseStringUTFChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseStringUTFCharsOffset_", declaredType="void*")
	public VoidPointer ReleaseStringUTFChars() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ReleaseStringUTFCharsOffset_));
	}

	// void* ReleaseStringUTFChars
	public PointerPointer ReleaseStringUTFCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ReleaseStringUTFCharsOffset_));
	}

	// void* SetBooleanArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetBooleanArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetBooleanArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetBooleanArrayRegionOffset_));
	}

	// void* SetBooleanArrayRegion
	public PointerPointer SetBooleanArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetBooleanArrayRegionOffset_));
	}

	// void* SetBooleanField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetBooleanFieldOffset_", declaredType="void*")
	public VoidPointer SetBooleanField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetBooleanFieldOffset_));
	}

	// void* SetBooleanField
	public PointerPointer SetBooleanFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetBooleanFieldOffset_));
	}

	// void* SetByteArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetByteArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetByteArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetByteArrayRegionOffset_));
	}

	// void* SetByteArrayRegion
	public PointerPointer SetByteArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetByteArrayRegionOffset_));
	}

	// void* SetByteField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetByteFieldOffset_", declaredType="void*")
	public VoidPointer SetByteField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetByteFieldOffset_));
	}

	// void* SetByteField
	public PointerPointer SetByteFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetByteFieldOffset_));
	}

	// void* SetCharArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetCharArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetCharArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetCharArrayRegionOffset_));
	}

	// void* SetCharArrayRegion
	public PointerPointer SetCharArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetCharArrayRegionOffset_));
	}

	// void* SetCharField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetCharFieldOffset_", declaredType="void*")
	public VoidPointer SetCharField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetCharFieldOffset_));
	}

	// void* SetCharField
	public PointerPointer SetCharFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetCharFieldOffset_));
	}

	// void* SetDoubleArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetDoubleArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetDoubleArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetDoubleArrayRegionOffset_));
	}

	// void* SetDoubleArrayRegion
	public PointerPointer SetDoubleArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetDoubleArrayRegionOffset_));
	}

	// void* SetDoubleField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetDoubleFieldOffset_", declaredType="void*")
	public VoidPointer SetDoubleField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetDoubleFieldOffset_));
	}

	// void* SetDoubleField
	public PointerPointer SetDoubleFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetDoubleFieldOffset_));
	}

	// void* SetFloatArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetFloatArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetFloatArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetFloatArrayRegionOffset_));
	}

	// void* SetFloatArrayRegion
	public PointerPointer SetFloatArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetFloatArrayRegionOffset_));
	}

	// void* SetFloatField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetFloatFieldOffset_", declaredType="void*")
	public VoidPointer SetFloatField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetFloatFieldOffset_));
	}

	// void* SetFloatField
	public PointerPointer SetFloatFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetFloatFieldOffset_));
	}

	// void* SetIntArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetIntArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetIntArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetIntArrayRegionOffset_));
	}

	// void* SetIntArrayRegion
	public PointerPointer SetIntArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetIntArrayRegionOffset_));
	}

	// void* SetIntField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetIntFieldOffset_", declaredType="void*")
	public VoidPointer SetIntField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetIntFieldOffset_));
	}

	// void* SetIntField
	public PointerPointer SetIntFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetIntFieldOffset_));
	}

	// void* SetLongArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLongArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetLongArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetLongArrayRegionOffset_));
	}

	// void* SetLongArrayRegion
	public PointerPointer SetLongArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetLongArrayRegionOffset_));
	}

	// void* SetLongField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLongFieldOffset_", declaredType="void*")
	public VoidPointer SetLongField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetLongFieldOffset_));
	}

	// void* SetLongField
	public PointerPointer SetLongFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetLongFieldOffset_));
	}

	// void* SetObjectArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetObjectArrayElementOffset_", declaredType="void*")
	public VoidPointer SetObjectArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetObjectArrayElementOffset_));
	}

	// void* SetObjectArrayElement
	public PointerPointer SetObjectArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetObjectArrayElementOffset_));
	}

	// void* SetObjectField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetObjectFieldOffset_", declaredType="void*")
	public VoidPointer SetObjectField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetObjectFieldOffset_));
	}

	// void* SetObjectField
	public PointerPointer SetObjectFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetObjectFieldOffset_));
	}

	// void* SetShortArrayRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetShortArrayRegionOffset_", declaredType="void*")
	public VoidPointer SetShortArrayRegion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetShortArrayRegionOffset_));
	}

	// void* SetShortArrayRegion
	public PointerPointer SetShortArrayRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetShortArrayRegionOffset_));
	}

	// void* SetShortField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetShortFieldOffset_", declaredType="void*")
	public VoidPointer SetShortField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetShortFieldOffset_));
	}

	// void* SetShortField
	public PointerPointer SetShortFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetShortFieldOffset_));
	}

	// void* SetStaticBooleanField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticBooleanFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticBooleanField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticBooleanFieldOffset_));
	}

	// void* SetStaticBooleanField
	public PointerPointer SetStaticBooleanFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticBooleanFieldOffset_));
	}

	// void* SetStaticByteField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticByteFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticByteField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticByteFieldOffset_));
	}

	// void* SetStaticByteField
	public PointerPointer SetStaticByteFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticByteFieldOffset_));
	}

	// void* SetStaticCharField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticCharFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticCharField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticCharFieldOffset_));
	}

	// void* SetStaticCharField
	public PointerPointer SetStaticCharFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticCharFieldOffset_));
	}

	// void* SetStaticDoubleField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticDoubleFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticDoubleField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticDoubleFieldOffset_));
	}

	// void* SetStaticDoubleField
	public PointerPointer SetStaticDoubleFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticDoubleFieldOffset_));
	}

	// void* SetStaticFloatField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticFloatFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticFloatField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticFloatFieldOffset_));
	}

	// void* SetStaticFloatField
	public PointerPointer SetStaticFloatFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticFloatFieldOffset_));
	}

	// void* SetStaticIntField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticIntFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticIntField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticIntFieldOffset_));
	}

	// void* SetStaticIntField
	public PointerPointer SetStaticIntFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticIntFieldOffset_));
	}

	// void* SetStaticLongField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticLongFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticLongField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticLongFieldOffset_));
	}

	// void* SetStaticLongField
	public PointerPointer SetStaticLongFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticLongFieldOffset_));
	}

	// void* SetStaticObjectField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticObjectFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticObjectField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticObjectFieldOffset_));
	}

	// void* SetStaticObjectField
	public PointerPointer SetStaticObjectFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticObjectFieldOffset_));
	}

	// void* SetStaticShortField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetStaticShortFieldOffset_", declaredType="void*")
	public VoidPointer SetStaticShortField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._SetStaticShortFieldOffset_));
	}

	// void* SetStaticShortField
	public PointerPointer SetStaticShortFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._SetStaticShortFieldOffset_));
	}

	// void* Throw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ThrowOffset_", declaredType="void*")
	public VoidPointer Throw() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ThrowOffset_));
	}

	// void* Throw
	public PointerPointer ThrowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ThrowOffset_));
	}

	// void* ThrowNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ThrowNewOffset_", declaredType="void*")
	public VoidPointer ThrowNew() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ThrowNewOffset_));
	}

	// void* ThrowNew
	public PointerPointer ThrowNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ThrowNewOffset_));
	}

	// void* ToReflectedField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ToReflectedFieldOffset_", declaredType="void*")
	public VoidPointer ToReflectedField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ToReflectedFieldOffset_));
	}

	// void* ToReflectedField
	public PointerPointer ToReflectedFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ToReflectedFieldOffset_));
	}

	// void* ToReflectedMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ToReflectedMethodOffset_", declaredType="void*")
	public VoidPointer ToReflectedMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._ToReflectedMethodOffset_));
	}

	// void* ToReflectedMethod
	public PointerPointer ToReflectedMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._ToReflectedMethodOffset_));
	}

	// void* UnregisterNatives
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_UnregisterNativesOffset_", declaredType="void*")
	public VoidPointer UnregisterNatives() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._UnregisterNativesOffset_));
	}

	// void* UnregisterNatives
	public PointerPointer UnregisterNativesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._UnregisterNativesOffset_));
	}

	// void* reserved0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved0Offset_", declaredType="void*")
	public VoidPointer reserved0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._reserved0Offset_));
	}

	// void* reserved0
	public PointerPointer reserved0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._reserved0Offset_));
	}

	// void* reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="void*")
	public VoidPointer reserved1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._reserved1Offset_));
	}

	// void* reserved1
	public PointerPointer reserved1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._reserved1Offset_));
	}

	// void* reserved2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved2Offset_", declaredType="void*")
	public VoidPointer reserved2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._reserved2Offset_));
	}

	// void* reserved2
	public PointerPointer reserved2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._reserved2Offset_));
	}

	// void* reserved3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved3Offset_", declaredType="void*")
	public VoidPointer reserved3() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JNINativeInterface_._reserved3Offset_));
	}

	// void* reserved3
	public PointerPointer reserved3EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JNINativeInterface_._reserved3Offset_));
	}

}
