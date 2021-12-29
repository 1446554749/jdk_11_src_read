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
 * Structure: J9VMRuntimeStateListenerPointer
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
 * The generated code will provide getters for all elements in the J9VMRuntimeStateListenerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMRuntimeStateListener.class)
public class J9VMRuntimeStateListenerPointer extends StructurePointer {

	// NULL
	public static final J9VMRuntimeStateListenerPointer NULL = new J9VMRuntimeStateListenerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMRuntimeStateListenerPointer(long address) {
		super(address);
	}

	public static J9VMRuntimeStateListenerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMRuntimeStateListenerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMRuntimeStateListenerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMRuntimeStateListenerPointer(address);
	}

	public J9VMRuntimeStateListenerPointer add(long count) {
		return J9VMRuntimeStateListenerPointer.cast(address + (J9VMRuntimeStateListener.SIZEOF * count));
	}

	public J9VMRuntimeStateListenerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMRuntimeStateListenerPointer addOffset(long offset) {
		return J9VMRuntimeStateListenerPointer.cast(address + offset);
	}

	public J9VMRuntimeStateListenerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMRuntimeStateListenerPointer sub(long count) {
		return J9VMRuntimeStateListenerPointer.cast(address - (J9VMRuntimeStateListener.SIZEOF * count));
	}

	public J9VMRuntimeStateListenerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMRuntimeStateListenerPointer subOffset(long offset) {
		return J9VMRuntimeStateListenerPointer.cast(address - offset);
	}

	public J9VMRuntimeStateListenerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMRuntimeStateListenerPointer untag(long mask) {
		return J9VMRuntimeStateListenerPointer.cast(address & ~mask);
	}

	public J9VMRuntimeStateListenerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMRuntimeStateListener.SIZEOF;
	}

	// Implementation methods

	// UDATA idleMinFreeHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idleMinFreeHeapOffset_", declaredType="UDATA")
	public UDATA idleMinFreeHeap() throws CorruptDataException {
		return getUDATAAtOffset(J9VMRuntimeStateListener._idleMinFreeHeapOffset_);
	}

	// UDATA idleMinFreeHeap
	public UDATAPointer idleMinFreeHeapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._idleMinFreeHeapOffset_));
	}

	// UDATA idleTuningFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idleTuningFlagsOffset_", declaredType="UDATA")
	public UDATA idleTuningFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMRuntimeStateListener._idleTuningFlagsOffset_);
	}

	// UDATA idleTuningFlags
	public UDATAPointer idleTuningFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._idleTuningFlagsOffset_));
	}

	// U32 minIdleWaitTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minIdleWaitTimeOffset_", declaredType="U32")
	public UDATA minIdleWaitTime() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMRuntimeStateListener._minIdleWaitTimeOffset_));
	}

	// U32 minIdleWaitTime
	public UDATAPointer minIdleWaitTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._minIdleWaitTimeOffset_));
	}

	// omrthread_monitor_t runtimeStateListenerMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeStateListenerMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer runtimeStateListenerMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9VMRuntimeStateListener._runtimeStateListenerMutexOffset_));
	}

	// omrthread_monitor_t runtimeStateListenerMutex
	public PointerPointer runtimeStateListenerMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._runtimeStateListenerMutexOffset_));
	}

	// U32 runtimeStateListenerState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeStateListenerStateOffset_", declaredType="U32")
	public UDATA runtimeStateListenerState() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMRuntimeStateListener._runtimeStateListenerStateOffset_));
	}

	// U32 runtimeStateListenerState
	public UDATAPointer runtimeStateListenerStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._runtimeStateListenerStateOffset_));
	}

	// J9VMThread* runtimeStateListenerVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeStateListenerVMThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer runtimeStateListenerVMThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMRuntimeStateListener._runtimeStateListenerVMThreadOffset_));
	}

	// J9VMThread* runtimeStateListenerVMThread
	public PointerPointer runtimeStateListenerVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._runtimeStateListenerVMThreadOffset_));
	}

	// U32 vmRuntimeState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmRuntimeStateOffset_", declaredType="U32")
	public UDATA vmRuntimeState() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMRuntimeStateListener._vmRuntimeStateOffset_));
	}

	// U32 vmRuntimeState
	public UDATAPointer vmRuntimeStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMRuntimeStateListener._vmRuntimeStateOffset_));
	}

}
