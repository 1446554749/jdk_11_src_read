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
 * Structure: J9AbstractThreadPointer
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
 * The generated code will provide getters for all elements in the J9AbstractThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9AbstractThread.class)
public class J9AbstractThreadPointer extends StructurePointer {

	// NULL
	public static final J9AbstractThreadPointer NULL = new J9AbstractThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9AbstractThreadPointer(long address) {
		super(address);
	}

	public static J9AbstractThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9AbstractThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9AbstractThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9AbstractThreadPointer(address);
	}

	public J9AbstractThreadPointer add(long count) {
		return J9AbstractThreadPointer.cast(address + (J9AbstractThread.SIZEOF * count));
	}

	public J9AbstractThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9AbstractThreadPointer addOffset(long offset) {
		return J9AbstractThreadPointer.cast(address + offset);
	}

	public J9AbstractThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9AbstractThreadPointer sub(long count) {
		return J9AbstractThreadPointer.cast(address - (J9AbstractThread.SIZEOF * count));
	}

	public J9AbstractThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9AbstractThreadPointer subOffset(long offset) {
		return J9AbstractThreadPointer.cast(address - offset);
	}

	public J9AbstractThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9AbstractThreadPointer untag(long mask) {
		return J9AbstractThreadPointer.cast(address & ~mask);
	}

	public J9AbstractThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9AbstractThread.SIZEOF;
	}

	// Implementation methods

	// U64 attachcount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachcountOffset_", declaredType="U64")
	public UDATA attachcount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._attachcountOffset_));
	}

	// U64 attachcount
	public UDATAPointer attachcountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._attachcountOffset_));
	}

	// U32 category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="U32")
	public UDATA category() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AbstractThread._categoryOffset_));
	}

	// U32 category
	public UDATAPointer categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._categoryOffset_));
	}

	// U32 effective_category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_effective_categoryOffset_", declaredType="U32")
	public UDATA effective_category() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AbstractThread._effective_categoryOffset_));
	}

	// U32 effective_category
	public UDATAPointer effective_categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._effective_categoryOffset_));
	}

	// void* entryarg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryargOffset_", declaredType="void*")
	public VoidPointer entryarg() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AbstractThread._entryargOffset_));
	}

	// void* entryarg
	public PointerPointer entryargEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._entryargOffset_));
	}

	// omrthread_entrypoint_t entrypoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entrypointOffset_", declaredType="omrthread_entrypoint_t")
	public VoidPointer entrypoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AbstractThread._entrypointOffset_));
	}

	// omrthread_entrypoint_t entrypoint
	public PointerPointer entrypointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._entrypointOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._flagsOffset_));
	}

	// J9Thread* interrupter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interrupterOffset_", declaredType="J9Thread*")
	public J9ThreadPointer interrupter() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9AbstractThread._interrupterOffset_));
	}

	// J9Thread* interrupter
	public PointerPointer interrupterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._interrupterOffset_));
	}

	// I64 lastCategorySwitchTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastCategorySwitchTimeOffset_", declaredType="I64")
	public IDATA lastCategorySwitchTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9AbstractThread._lastCategorySwitchTimeOffset_));
	}

	// I64 lastCategorySwitchTime
	public IDATAPointer lastCategorySwitchTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9AbstractThread._lastCategorySwitchTimeOffset_));
	}

	// J9ThreadLibrary* library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_libraryOffset_", declaredType="J9ThreadLibrary*")
	public J9ThreadLibraryPointer library() throws CorruptDataException {
		return J9ThreadLibraryPointer.cast(getPointerAtOffset(J9AbstractThread._libraryOffset_));
	}

	// J9ThreadLibrary* library
	public PointerPointer libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._libraryOffset_));
	}

	// U64 lockedmonitorcount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedmonitorcountOffset_", declaredType="U64")
	public UDATA lockedmonitorcount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._lockedmonitorcountOffset_));
	}

	// U64 lockedmonitorcount
	public UDATAPointer lockedmonitorcountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._lockedmonitorcountOffset_));
	}

	// J9ThreadMonitor* monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorOffset_", declaredType="J9ThreadMonitor*")
	public J9ThreadMonitorPointer monitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9AbstractThread._monitorOffset_));
	}

	// J9ThreadMonitor* monitor
	public PointerPointer monitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._monitorOffset_));
	}

	// J9Thread* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9Thread*")
	public J9ThreadPointer next() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9AbstractThread._nextOffset_));
	}

	// J9Thread* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._nextOffset_));
	}

	// omrthread_os_errno_t os_errno
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_os_errnoOffset_", declaredType="omrthread_os_errno_t")
	public IDATA os_errno() throws CorruptDataException {
		return new I64(getLongAtOffset(J9AbstractThread._os_errnoOffset_));
	}

	// omrthread_os_errno_t os_errno
	public IDATAPointer os_errnoEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9AbstractThread._os_errnoOffset_));
	}

	// J9Thread* prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevOffset_", declaredType="J9Thread*")
	public J9ThreadPointer prev() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9AbstractThread._prevOffset_));
	}

	// J9Thread* prev
	public PointerPointer prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._prevOffset_));
	}

	// U64 priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityOffset_", declaredType="U64")
	public UDATA priority() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._priorityOffset_));
	}

	// U64 priority
	public UDATAPointer priorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._priorityOffset_));
	}

	// U64 tid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tidOffset_", declaredType="U64")
	public UDATA tid() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._tidOffset_));
	}

	// U64 tid
	public UDATAPointer tidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._tidOffset_));
	}

	// void*[] tls
	public PointerPointer tlsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._tlsOffset_));
	}

	// J9ThreadTracing* tracing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracingOffset_", declaredType="J9ThreadTracing*")
	public J9ThreadTracingPointer tracing() throws CorruptDataException {
		return J9ThreadTracingPointer.cast(getPointerAtOffset(J9AbstractThread._tracingOffset_));
	}

	// J9ThreadTracing* tracing
	public PointerPointer tracingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AbstractThread._tracingOffset_));
	}

	// U64 waitNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitNumberOffset_", declaredType="U64")
	public UDATA waitNumber() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AbstractThread._waitNumberOffset_));
	}

	// U64 waitNumber
	public UDATAPointer waitNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AbstractThread._waitNumberOffset_));
	}

}
