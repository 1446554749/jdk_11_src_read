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
 * Structure: J9PlatformStackFramePointer
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
 * The generated code will provide getters for all elements in the J9PlatformStackFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PlatformStackFrame.class)
public class J9PlatformStackFramePointer extends StructurePointer {

	// NULL
	public static final J9PlatformStackFramePointer NULL = new J9PlatformStackFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PlatformStackFramePointer(long address) {
		super(address);
	}

	public static J9PlatformStackFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PlatformStackFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PlatformStackFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PlatformStackFramePointer(address);
	}

	public J9PlatformStackFramePointer add(long count) {
		return J9PlatformStackFramePointer.cast(address + (J9PlatformStackFrame.SIZEOF * count));
	}

	public J9PlatformStackFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PlatformStackFramePointer addOffset(long offset) {
		return J9PlatformStackFramePointer.cast(address + offset);
	}

	public J9PlatformStackFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PlatformStackFramePointer sub(long count) {
		return J9PlatformStackFramePointer.cast(address - (J9PlatformStackFrame.SIZEOF * count));
	}

	public J9PlatformStackFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PlatformStackFramePointer subOffset(long offset) {
		return J9PlatformStackFramePointer.cast(address - offset);
	}

	public J9PlatformStackFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PlatformStackFramePointer untag(long mask) {
		return J9PlatformStackFramePointer.cast(address & ~mask);
	}

	public J9PlatformStackFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PlatformStackFrame.SIZEOF;
	}

	// Implementation methods

	// U64 base_pointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_base_pointerOffset_", declaredType="U64")
	public UDATA base_pointer() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._base_pointerOffset_));
	}

	// U64 base_pointer
	public UDATAPointer base_pointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._base_pointerOffset_));
	}

	// U64 instruction_pointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instruction_pointerOffset_", declaredType="U64")
	public UDATA instruction_pointer() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._instruction_pointerOffset_));
	}

	// U64 instruction_pointer
	public UDATAPointer instruction_pointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._instruction_pointerOffset_));
	}

	// J9PlatformStackFrame* parent_frame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parent_frameOffset_", declaredType="J9PlatformStackFrame*")
	public J9PlatformStackFramePointer parent_frame() throws CorruptDataException {
		return J9PlatformStackFramePointer.cast(getPointerAtOffset(J9PlatformStackFrame._parent_frameOffset_));
	}

	// J9PlatformStackFrame* parent_frame
	public PointerPointer parent_frameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformStackFrame._parent_frameOffset_));
	}

	// U64 register1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_register1Offset_", declaredType="U64")
	public UDATA register1() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._register1Offset_));
	}

	// U64 register1
	public UDATAPointer register1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._register1Offset_));
	}

	// U64 register2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_register2Offset_", declaredType="U64")
	public UDATA register2() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._register2Offset_));
	}

	// U64 register2
	public UDATAPointer register2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._register2Offset_));
	}

	// U64 register3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_register3Offset_", declaredType="U64")
	public UDATA register3() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._register3Offset_));
	}

	// U64 register3
	public UDATAPointer register3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._register3Offset_));
	}

	// U64 stack_pointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack_pointerOffset_", declaredType="U64")
	public UDATA stack_pointer() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformStackFrame._stack_pointerOffset_));
	}

	// U64 stack_pointer
	public UDATAPointer stack_pointerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformStackFrame._stack_pointerOffset_));
	}

	// U8* symbol
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_symbolOffset_", declaredType="U8*")
	public U8Pointer symbol() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9PlatformStackFrame._symbolOffset_));
	}

	// U8* symbol
	public PointerPointer symbolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformStackFrame._symbolOffset_));
	}

}
