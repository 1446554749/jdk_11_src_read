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
 * Structure: J9VTuneInterfacePointer
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
 * The generated code will provide getters for all elements in the J9VTuneInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VTuneInterface.class)
public class J9VTuneInterfacePointer extends StructurePointer {

	// NULL
	public static final J9VTuneInterfacePointer NULL = new J9VTuneInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VTuneInterfacePointer(long address) {
		super(address);
	}

	public static J9VTuneInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VTuneInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VTuneInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VTuneInterfacePointer(address);
	}

	public J9VTuneInterfacePointer add(long count) {
		return J9VTuneInterfacePointer.cast(address + (J9VTuneInterface.SIZEOF * count));
	}

	public J9VTuneInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VTuneInterfacePointer addOffset(long offset) {
		return J9VTuneInterfacePointer.cast(address + offset);
	}

	public J9VTuneInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VTuneInterfacePointer sub(long count) {
		return J9VTuneInterfacePointer.cast(address - (J9VTuneInterface.SIZEOF * count));
	}

	public J9VTuneInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VTuneInterfacePointer subOffset(long offset) {
		return J9VTuneInterfacePointer.cast(address - offset);
	}

	public J9VTuneInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VTuneInterfacePointer untag(long mask) {
		return J9VTuneInterfacePointer.cast(address & ~mask);
	}

	public J9VTuneInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VTuneInterface.SIZEOF;
	}

	// Implementation methods

	// void* Initialize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_InitializeOffset_", declaredType="void*")
	public VoidPointer Initialize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._InitializeOffset_));
	}

	// void* Initialize
	public PointerPointer InitializeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._InitializeOffset_));
	}

	// void* MethodEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MethodEntryOffset_", declaredType="void*")
	public VoidPointer MethodEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._MethodEntryOffset_));
	}

	// void* MethodEntry
	public PointerPointer MethodEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._MethodEntryOffset_));
	}

	// void* MethodExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MethodExitOffset_", declaredType="void*")
	public VoidPointer MethodExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._MethodExitOffset_));
	}

	// void* MethodExit
	public PointerPointer MethodExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._MethodExitOffset_));
	}

	// void* NotifyEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NotifyEventOffset_", declaredType="void*")
	public VoidPointer NotifyEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._NotifyEventOffset_));
	}

	// void* NotifyEvent
	public PointerPointer NotifyEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._NotifyEventOffset_));
	}

	// UDATA dllHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dllHandleOffset_", declaredType="UDATA")
	public UDATA dllHandle() throws CorruptDataException {
		return getUDATAAtOffset(J9VTuneInterface._dllHandleOffset_);
	}

	// UDATA dllHandle
	public UDATAPointer dllHandleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VTuneInterface._dllHandleOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9VTuneInterface._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VTuneInterface._flagsOffset_));
	}

	// void* iJIT_NotifyEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iJIT_NotifyEventOffset_", declaredType="void*")
	public VoidPointer iJIT_NotifyEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._iJIT_NotifyEventOffset_));
	}

	// void* iJIT_NotifyEvent
	public PointerPointer iJIT_NotifyEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._iJIT_NotifyEventOffset_));
	}

	// void* iJIT_RegisterCallback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iJIT_RegisterCallbackOffset_", declaredType="void*")
	public VoidPointer iJIT_RegisterCallback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._iJIT_RegisterCallbackOffset_));
	}

	// void* iJIT_RegisterCallback
	public PointerPointer iJIT_RegisterCallbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._iJIT_RegisterCallbackOffset_));
	}

	// void* iJIT_RegisterCallbackEx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iJIT_RegisterCallbackExOffset_", declaredType="void*")
	public VoidPointer iJIT_RegisterCallbackEx() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VTuneInterface._iJIT_RegisterCallbackExOffset_));
	}

	// void* iJIT_RegisterCallbackEx
	public PointerPointer iJIT_RegisterCallbackExEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VTuneInterface._iJIT_RegisterCallbackExOffset_));
	}

}
