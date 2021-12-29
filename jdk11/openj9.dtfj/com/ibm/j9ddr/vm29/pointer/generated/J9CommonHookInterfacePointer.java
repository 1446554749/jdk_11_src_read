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
 * Structure: J9CommonHookInterfacePointer
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
 * The generated code will provide getters for all elements in the J9CommonHookInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CommonHookInterface.class)
public class J9CommonHookInterfacePointer extends StructurePointer {

	// NULL
	public static final J9CommonHookInterfacePointer NULL = new J9CommonHookInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CommonHookInterfacePointer(long address) {
		super(address);
	}

	public static J9CommonHookInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CommonHookInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CommonHookInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CommonHookInterfacePointer(address);
	}

	public J9CommonHookInterfacePointer add(long count) {
		return J9CommonHookInterfacePointer.cast(address + (J9CommonHookInterface.SIZEOF * count));
	}

	public J9CommonHookInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CommonHookInterfacePointer addOffset(long offset) {
		return J9CommonHookInterfacePointer.cast(address + offset);
	}

	public J9CommonHookInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CommonHookInterfacePointer sub(long count) {
		return J9CommonHookInterfacePointer.cast(address - (J9CommonHookInterface.SIZEOF * count));
	}

	public J9CommonHookInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CommonHookInterfacePointer subOffset(long offset) {
		return J9CommonHookInterfacePointer.cast(address - offset);
	}

	public J9CommonHookInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CommonHookInterfacePointer untag(long mask) {
		return J9CommonHookInterfacePointer.cast(address & ~mask);
	}

	public J9CommonHookInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CommonHookInterface.SIZEOF;
	}

	// Implementation methods

	// U64 eventSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventSizeOffset_", declaredType="U64")
	public UDATA eventSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9CommonHookInterface._eventSizeOffset_));
	}

	// U64 eventSize
	public UDATAPointer eventSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CommonHookInterface._eventSizeOffset_));
	}

	// J9HookInterface* hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInterfaceOffset_", declaredType="J9HookInterface*")
	public J9HookInterfacePointer hookInterface() throws CorruptDataException {
		return J9HookInterfacePointer.cast(getPointerAtOffset(J9CommonHookInterface._hookInterfaceOffset_));
	}

	// J9HookInterface* hookInterface
	public PointerPointer hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CommonHookInterface._hookInterfaceOffset_));
	}

	// omrthread_monitor_t lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer lock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9CommonHookInterface._lockOffset_));
	}

	// omrthread_monitor_t lock
	public PointerPointer lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CommonHookInterface._lockOffset_));
	}

	// U64 nextAgentID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextAgentIDOffset_", declaredType="U64")
	public UDATA nextAgentID() throws CorruptDataException {
		return new U64(getLongAtOffset(J9CommonHookInterface._nextAgentIDOffset_));
	}

	// U64 nextAgentID
	public UDATAPointer nextAgentIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CommonHookInterface._nextAgentIDOffset_));
	}

	// J9Pool* pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9CommonHookInterface._poolOffset_));
	}

	// J9Pool* pool
	public PointerPointer poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CommonHookInterface._poolOffset_));
	}

	// OMRPortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLib() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(J9CommonHookInterface._portLibOffset_));
	}

	// OMRPortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CommonHookInterface._portLibOffset_));
	}

	// U64 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U64")
	public UDATA size() throws CorruptDataException {
		return new U64(getLongAtOffset(J9CommonHookInterface._sizeOffset_));
	}

	// U64 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CommonHookInterface._sizeOffset_));
	}

	// U64 threshold4Trace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threshold4TraceOffset_", declaredType="U64")
	public UDATA threshold4Trace() throws CorruptDataException {
		return new U64(getLongAtOffset(J9CommonHookInterface._threshold4TraceOffset_));
	}

	// U64 threshold4Trace
	public UDATAPointer threshold4TraceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CommonHookInterface._threshold4TraceOffset_));
	}

}
