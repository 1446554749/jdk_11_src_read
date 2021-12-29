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
 * Structure: J9ThreadPointer
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
 * The generated code will provide getters for all elements in the J9ThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9Thread.class)
public class J9ThreadPointer extends StructurePointer {

	// NULL
	public static final J9ThreadPointer NULL = new J9ThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadPointer(long address) {
		super(address);
	}

	public static J9ThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadPointer(address);
	}

	public J9ThreadPointer add(long count) {
		return J9ThreadPointer.cast(address + (J9Thread.SIZEOF * count));
	}

	public J9ThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadPointer addOffset(long offset) {
		return J9ThreadPointer.cast(address + offset);
	}

	public J9ThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadPointer sub(long count) {
		return J9ThreadPointer.cast(address - (J9Thread.SIZEOF * count));
	}

	public J9ThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadPointer subOffset(long offset) {
		return J9ThreadPointer.cast(address - offset);
	}

	public J9ThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadPointer untag(long mask) {
		return J9ThreadPointer.cast(address & ~mask);
	}

	public J9ThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9Thread.SIZEOF;
	}

	// Implementation methods

	// U64 attachcount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachcountOffset_", declaredType="U64")
	public UDATA attachcount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._attachcountOffset_));
	}

	// U64 attachcount
	public UDATAPointer attachcountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._attachcountOffset_));
	}

	// U32 category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="U32")
	public UDATA category() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Thread._categoryOffset_));
	}

	// U32 category
	public UDATAPointer categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._categoryOffset_));
	}

	// J9OSCond condition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_conditionOffset_", declaredType="J9OSCond")
	public _opaque_pthread_cond_tPointer condition() throws CorruptDataException {
		return _opaque_pthread_cond_tPointer.cast(nonNullFieldEA(J9Thread._conditionOffset_));
	}

	// J9OSCond condition
	public PointerPointer conditionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._conditionOffset_));
	}

	// J9ThreadMonitor* destroyed_monitor_head
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destroyed_monitor_headOffset_", declaredType="J9ThreadMonitor*")
	public J9ThreadMonitorPointer destroyed_monitor_head() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9Thread._destroyed_monitor_headOffset_));
	}

	// J9ThreadMonitor* destroyed_monitor_head
	public PointerPointer destroyed_monitor_headEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._destroyed_monitor_headOffset_));
	}

	// J9ThreadMonitor* destroyed_monitor_tail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destroyed_monitor_tailOffset_", declaredType="J9ThreadMonitor*")
	public J9ThreadMonitorPointer destroyed_monitor_tail() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9Thread._destroyed_monitor_tailOffset_));
	}

	// J9ThreadMonitor* destroyed_monitor_tail
	public PointerPointer destroyed_monitor_tailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._destroyed_monitor_tailOffset_));
	}

	// U32 effective_category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_effective_categoryOffset_", declaredType="U32")
	public UDATA effective_category() throws CorruptDataException {
		return new U32(getIntAtOffset(J9Thread._effective_categoryOffset_));
	}

	// U32 effective_category
	public UDATAPointer effective_categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._effective_categoryOffset_));
	}

	// void* entryarg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryargOffset_", declaredType="void*")
	public VoidPointer entryarg() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9Thread._entryargOffset_));
	}

	// void* entryarg
	public PointerPointer entryargEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._entryargOffset_));
	}

	// omrthread_entrypoint_t entrypoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entrypointOffset_", declaredType="omrthread_entrypoint_t")
	public VoidPointer entrypoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9Thread._entrypointOffset_));
	}

	// omrthread_entrypoint_t entrypoint
	public PointerPointer entrypointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._entrypointOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._flagsOffset_));
	}

	// OSTHREAD handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handleOffset_", declaredType="OSTHREAD")
	public _opaque_pthread_tPointer handle() throws CorruptDataException {
		return _opaque_pthread_tPointer.cast(getPointerAtOffset(J9Thread._handleOffset_));
	}

	// OSTHREAD handle
	public PointerPointer handleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._handleOffset_));
	}

	// J9Thread* interrupter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interrupterOffset_", declaredType="J9Thread*")
	public J9ThreadPointer interrupter() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9Thread._interrupterOffset_));
	}

	// J9Thread* interrupter
	public PointerPointer interrupterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._interrupterOffset_));
	}

	// U64 key_deletion_attempts
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_key_deletion_attemptsOffset_", declaredType="U64")
	public UDATA key_deletion_attempts() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._key_deletion_attemptsOffset_));
	}

	// U64 key_deletion_attempts
	public UDATAPointer key_deletion_attemptsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._key_deletion_attemptsOffset_));
	}

	// I64 lastCategorySwitchTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastCategorySwitchTimeOffset_", declaredType="I64")
	public IDATA lastCategorySwitchTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9Thread._lastCategorySwitchTimeOffset_));
	}

	// I64 lastCategorySwitchTime
	public IDATAPointer lastCategorySwitchTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9Thread._lastCategorySwitchTimeOffset_));
	}

	// J9ThreadLibrary* library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_libraryOffset_", declaredType="J9ThreadLibrary*")
	public J9ThreadLibraryPointer library() throws CorruptDataException {
		return J9ThreadLibraryPointer.cast(getPointerAtOffset(J9Thread._libraryOffset_));
	}

	// J9ThreadLibrary* library
	public PointerPointer libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._libraryOffset_));
	}

	// U64 lockedmonitorcount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedmonitorcountOffset_", declaredType="U64")
	public UDATA lockedmonitorcount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._lockedmonitorcountOffset_));
	}

	// U64 lockedmonitorcount
	public UDATAPointer lockedmonitorcountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._lockedmonitorcountOffset_));
	}

	// J9ThreadMonitor* monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorOffset_", declaredType="J9ThreadMonitor*")
	public J9ThreadMonitorPointer monitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9Thread._monitorOffset_));
	}

	// J9ThreadMonitor* monitor
	public PointerPointer monitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._monitorOffset_));
	}

	// J9OSMutex mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="J9OSMutex")
	public _opaque_pthread_mutex_tPointer mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9Thread._mutexOffset_));
	}

	// J9OSMutex mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._mutexOffset_));
	}

	// J9Thread* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9Thread*")
	public J9ThreadPointer next() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9Thread._nextOffset_));
	}

	// J9Thread* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._nextOffset_));
	}

	// U8[] numaAffinity
	public U8Pointer numaAffinityEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9Thread._numaAffinityOffset_));
	}

	// omrthread_os_errno_t os_errno
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_errnoOffset_", declaredType="omrthread_os_errno_t")
	public IDATA os_errno() throws CorruptDataException {
		return new I64(getLongAtOffset(J9Thread._os_errnoOffset_));
	}

	// omrthread_os_errno_t os_errno
	public IDATAPointer os_errnoEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9Thread._os_errnoOffset_));
	}

	// J9Thread* prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevOffset_", declaredType="J9Thread*")
	public J9ThreadPointer prev() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9Thread._prevOffset_));
	}

	// J9Thread* prev
	public PointerPointer prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._prevOffset_));
	}

	// U64 priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityOffset_", declaredType="U64")
	public UDATA priority() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._priorityOffset_));
	}

	// U64 priority
	public UDATAPointer priorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._priorityOffset_));
	}

	// U64 stacksize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stacksizeOffset_", declaredType="U64")
	public UDATA stacksize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._stacksizeOffset_));
	}

	// U64 stacksize
	public UDATAPointer stacksizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._stacksizeOffset_));
	}

	// U64 tid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tidOffset_", declaredType="U64")
	public UDATA tid() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._tidOffset_));
	}

	// U64 tid
	public UDATAPointer tidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._tidOffset_));
	}

	// void*[] tls
	public PointerPointer tlsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._tlsOffset_));
	}

	// J9ThreadTracing* tracing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracingOffset_", declaredType="J9ThreadTracing*")
	public J9ThreadTracingPointer tracing() throws CorruptDataException {
		return J9ThreadTracingPointer.cast(getPointerAtOffset(J9Thread._tracingOffset_));
	}

	// J9ThreadTracing* tracing
	public PointerPointer tracingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9Thread._tracingOffset_));
	}

	// U64 waitNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitNumberOffset_", declaredType="U64")
	public UDATA waitNumber() throws CorruptDataException {
		return new U64(getLongAtOffset(J9Thread._waitNumberOffset_));
	}

	// U64 waitNumber
	public UDATAPointer waitNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9Thread._waitNumberOffset_));
	}

}
