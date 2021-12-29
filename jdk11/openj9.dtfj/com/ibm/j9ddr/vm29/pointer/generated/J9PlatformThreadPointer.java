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
 * Structure: J9PlatformThreadPointer
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
 * The generated code will provide getters for all elements in the J9PlatformThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PlatformThread.class)
public class J9PlatformThreadPointer extends StructurePointer {

	// NULL
	public static final J9PlatformThreadPointer NULL = new J9PlatformThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PlatformThreadPointer(long address) {
		super(address);
	}

	public static J9PlatformThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PlatformThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PlatformThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PlatformThreadPointer(address);
	}

	public J9PlatformThreadPointer add(long count) {
		return J9PlatformThreadPointer.cast(address + (J9PlatformThread.SIZEOF * count));
	}

	public J9PlatformThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PlatformThreadPointer addOffset(long offset) {
		return J9PlatformThreadPointer.cast(address + offset);
	}

	public J9PlatformThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PlatformThreadPointer sub(long count) {
		return J9PlatformThreadPointer.cast(address - (J9PlatformThread.SIZEOF * count));
	}

	public J9PlatformThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PlatformThreadPointer subOffset(long offset) {
		return J9PlatformThreadPointer.cast(address - offset);
	}

	public J9PlatformThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PlatformThreadPointer untag(long mask) {
		return J9PlatformThreadPointer.cast(address & ~mask);
	}

	public J9PlatformThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PlatformThread.SIZEOF;
	}

	// Implementation methods

	// void* caa
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_caaOffset_", declaredType="void*")
	public VoidPointer caa() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PlatformThread._caaOffset_));
	}

	// void* caa
	public PointerPointer caaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformThread._caaOffset_));
	}

	// J9PlatformStackFrame* callstack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callstackOffset_", declaredType="J9PlatformStackFrame*")
	public J9PlatformStackFramePointer callstack() throws CorruptDataException {
		return J9PlatformStackFramePointer.cast(getPointerAtOffset(J9PlatformThread._callstackOffset_));
	}

	// J9PlatformStackFrame* callstack
	public PointerPointer callstackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformThread._callstackOffset_));
	}

	// ucontext_t* context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_contextOffset_", declaredType="ucontext_t*")
	public __darwin_ucontextPointer context() throws CorruptDataException {
		return __darwin_ucontextPointer.cast(getPointerAtOffset(J9PlatformThread._contextOffset_));
	}

	// ucontext_t* context
	public PointerPointer contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformThread._contextOffset_));
	}

	// void* dsa
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dsaOffset_", declaredType="void*")
	public VoidPointer dsa() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PlatformThread._dsaOffset_));
	}

	// void* dsa
	public PointerPointer dsaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformThread._dsaOffset_));
	}

	// U64 dsa_format
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dsa_formatOffset_", declaredType="U64")
	public UDATA dsa_format() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._dsa_formatOffset_));
	}

	// U64 dsa_format
	public UDATAPointer dsa_formatEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._dsa_formatOffset_));
	}

	// I64 error
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorOffset_", declaredType="I64")
	public IDATA error() throws CorruptDataException {
		return new I64(getLongAtOffset(J9PlatformThread._errorOffset_));
	}

	// I64 error
	public IDATAPointer errorEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9PlatformThread._errorOffset_));
	}

	// U64 priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityOffset_", declaredType="U64")
	public UDATA priority() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._priorityOffset_));
	}

	// U64 priority
	public UDATAPointer priorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._priorityOffset_));
	}

	// U64 process_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_idOffset_", declaredType="U64")
	public UDATA process_id() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._process_idOffset_));
	}

	// U64 process_id
	public UDATAPointer process_idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._process_idOffset_));
	}

	// sigset_t* sigmask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigmaskOffset_", declaredType="sigset_t*")
	public UDATAPointer sigmask() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9PlatformThread._sigmaskOffset_));
	}

	// sigset_t* sigmask
	public PointerPointer sigmaskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PlatformThread._sigmaskOffset_));
	}

	// U64 stack_base
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack_baseOffset_", declaredType="U64")
	public UDATA stack_base() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._stack_baseOffset_));
	}

	// U64 stack_base
	public UDATAPointer stack_baseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._stack_baseOffset_));
	}

	// U64 stack_end
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack_endOffset_", declaredType="U64")
	public UDATA stack_end() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._stack_endOffset_));
	}

	// U64 stack_end
	public UDATAPointer stack_endEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._stack_endOffset_));
	}

	// U64 thread_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_idOffset_", declaredType="U64")
	public UDATA thread_id() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PlatformThread._thread_idOffset_));
	}

	// U64 thread_id
	public UDATAPointer thread_idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PlatformThread._thread_idOffset_));
	}

}
