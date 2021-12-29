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
 * Structure: J9HookInterfacePointer
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
 * The generated code will provide getters for all elements in the J9HookInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9HookInterface.class)
public class J9HookInterfacePointer extends StructurePointer {

	// NULL
	public static final J9HookInterfacePointer NULL = new J9HookInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9HookInterfacePointer(long address) {
		super(address);
	}

	public static J9HookInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9HookInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9HookInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9HookInterfacePointer(address);
	}

	public J9HookInterfacePointer add(long count) {
		return J9HookInterfacePointer.cast(address + (J9HookInterface.SIZEOF * count));
	}

	public J9HookInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9HookInterfacePointer addOffset(long offset) {
		return J9HookInterfacePointer.cast(address + offset);
	}

	public J9HookInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9HookInterfacePointer sub(long count) {
		return J9HookInterfacePointer.cast(address - (J9HookInterface.SIZEOF * count));
	}

	public J9HookInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9HookInterfacePointer subOffset(long offset) {
		return J9HookInterfacePointer.cast(address - offset);
	}

	public J9HookInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9HookInterfacePointer untag(long mask) {
		return J9HookInterfacePointer.cast(address & ~mask);
	}

	public J9HookInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9HookInterface.SIZEOF;
	}

	// Implementation methods

	// void* J9HookAllocateAgentID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookAllocateAgentIDOffset_", declaredType="void*")
	public VoidPointer J9HookAllocateAgentID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookAllocateAgentIDOffset_));
	}

	// void* J9HookAllocateAgentID
	public PointerPointer J9HookAllocateAgentIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookAllocateAgentIDOffset_));
	}

	// void* J9HookDeallocateAgentID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookDeallocateAgentIDOffset_", declaredType="void*")
	public VoidPointer J9HookDeallocateAgentID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookDeallocateAgentIDOffset_));
	}

	// void* J9HookDeallocateAgentID
	public PointerPointer J9HookDeallocateAgentIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookDeallocateAgentIDOffset_));
	}

	// void* J9HookDisable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookDisableOffset_", declaredType="void*")
	public VoidPointer J9HookDisable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookDisableOffset_));
	}

	// void* J9HookDisable
	public PointerPointer J9HookDisableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookDisableOffset_));
	}

	// void* J9HookDispatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookDispatchOffset_", declaredType="void*")
	public VoidPointer J9HookDispatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookDispatchOffset_));
	}

	// void* J9HookDispatch
	public PointerPointer J9HookDispatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookDispatchOffset_));
	}

	// void* J9HookIsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookIsEnabledOffset_", declaredType="void*")
	public VoidPointer J9HookIsEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookIsEnabledOffset_));
	}

	// void* J9HookIsEnabled
	public PointerPointer J9HookIsEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookIsEnabledOffset_));
	}

	// void* J9HookRegister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookRegisterOffset_", declaredType="void*")
	public VoidPointer J9HookRegister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookRegisterOffset_));
	}

	// void* J9HookRegister
	public PointerPointer J9HookRegisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookRegisterOffset_));
	}

	// void* J9HookRegisterWithCallSite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookRegisterWithCallSiteOffset_", declaredType="void*")
	public VoidPointer J9HookRegisterWithCallSite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookRegisterWithCallSiteOffset_));
	}

	// void* J9HookRegisterWithCallSite
	public PointerPointer J9HookRegisterWithCallSiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookRegisterWithCallSiteOffset_));
	}

	// void* J9HookReserve
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookReserveOffset_", declaredType="void*")
	public VoidPointer J9HookReserve() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookReserveOffset_));
	}

	// void* J9HookReserve
	public PointerPointer J9HookReserveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookReserveOffset_));
	}

	// void* J9HookShutdownInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookShutdownInterfaceOffset_", declaredType="void*")
	public VoidPointer J9HookShutdownInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookShutdownInterfaceOffset_));
	}

	// void* J9HookShutdownInterface
	public PointerPointer J9HookShutdownInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookShutdownInterfaceOffset_));
	}

	// void* J9HookUnregister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_J9HookUnregisterOffset_", declaredType="void*")
	public VoidPointer J9HookUnregister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookInterface._J9HookUnregisterOffset_));
	}

	// void* J9HookUnregister
	public PointerPointer J9HookUnregisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookInterface._J9HookUnregisterOffset_));
	}

}
