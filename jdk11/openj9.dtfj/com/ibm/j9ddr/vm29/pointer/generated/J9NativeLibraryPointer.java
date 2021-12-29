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
 * Structure: J9NativeLibraryPointer
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
 * The generated code will provide getters for all elements in the J9NativeLibraryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9NativeLibrary.class)
public class J9NativeLibraryPointer extends StructurePointer {

	// NULL
	public static final J9NativeLibraryPointer NULL = new J9NativeLibraryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9NativeLibraryPointer(long address) {
		super(address);
	}

	public static J9NativeLibraryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9NativeLibraryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9NativeLibraryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9NativeLibraryPointer(address);
	}

	public J9NativeLibraryPointer add(long count) {
		return J9NativeLibraryPointer.cast(address + (J9NativeLibrary.SIZEOF * count));
	}

	public J9NativeLibraryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9NativeLibraryPointer addOffset(long offset) {
		return J9NativeLibraryPointer.cast(address + offset);
	}

	public J9NativeLibraryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9NativeLibraryPointer sub(long count) {
		return J9NativeLibraryPointer.cast(address - (J9NativeLibrary.SIZEOF * count));
	}

	public J9NativeLibraryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9NativeLibraryPointer subOffset(long offset) {
		return J9NativeLibraryPointer.cast(address - offset);
	}

	public J9NativeLibraryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9NativeLibraryPointer untag(long mask) {
		return J9NativeLibraryPointer.cast(address & ~mask);
	}

	public J9NativeLibraryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9NativeLibrary.SIZEOF;
	}

	// Implementation methods

	// void* bind_method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bind_methodOffset_", declaredType="void*")
	public VoidPointer bind_method() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9NativeLibrary._bind_methodOffset_));
	}

	// void* bind_method
	public PointerPointer bind_methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._bind_methodOffset_));
	}

	// void* close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_closeOffset_", declaredType="void*")
	public VoidPointer close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9NativeLibrary._closeOffset_));
	}

	// void* close
	public PointerPointer closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._closeOffset_));
	}

	// void* dispatch_method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dispatch_methodOffset_", declaredType="void*")
	public VoidPointer dispatch_method() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9NativeLibrary._dispatch_methodOffset_));
	}

	// void* dispatch_method
	public PointerPointer dispatch_methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._dispatch_methodOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9NativeLibrary._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NativeLibrary._flagsOffset_));
	}

	// UDATA handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handleOffset_", declaredType="UDATA")
	public UDATA handle() throws CorruptDataException {
		return getUDATAAtOffset(J9NativeLibrary._handleOffset_);
	}

	// UDATA handle
	public UDATAPointer handleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NativeLibrary._handleOffset_));
	}

	// J9Pool* hookedNatives
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookedNativesOffset_", declaredType="J9Pool*")
	public J9PoolPointer hookedNatives() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9NativeLibrary._hookedNativesOffset_));
	}

	// J9Pool* hookedNatives
	public PointerPointer hookedNativesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._hookedNativesOffset_));
	}

	// omrthread_monitor_t hookedNativesMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookedNativesMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer hookedNativesMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9NativeLibrary._hookedNativesMonitorOffset_));
	}

	// omrthread_monitor_t hookedNativesMonitor
	public PointerPointer hookedNativesMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._hookedNativesMonitorOffset_));
	}

	// UDATA linkMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkModeOffset_", declaredType="UDATA")
	public UDATA linkMode() throws CorruptDataException {
		return getUDATAAtOffset(J9NativeLibrary._linkModeOffset_);
	}

	// UDATA linkMode
	public UDATAPointer linkModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NativeLibrary._linkModeOffset_));
	}

	// U8* logicalName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_logicalNameOffset_", declaredType="U8*")
	public U8Pointer logicalName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9NativeLibrary._logicalNameOffset_));
	}

	// U8* logicalName
	public PointerPointer logicalNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._logicalNameOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9NativeLibrary._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._nameOffset_));
	}

	// J9NativeLibrary* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9NativeLibrary*")
	public J9NativeLibraryPointer next() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(getPointerAtOffset(J9NativeLibrary._nextOffset_));
	}

	// J9NativeLibrary* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._nextOffset_));
	}

	// void* send_lifecycle_event
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_send_lifecycle_eventOffset_", declaredType="void*")
	public VoidPointer send_lifecycle_event() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9NativeLibrary._send_lifecycle_eventOffset_));
	}

	// void* send_lifecycle_event
	public PointerPointer send_lifecycle_eventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NativeLibrary._send_lifecycle_eventOffset_));
	}

	// UDATA userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="UDATA")
	public UDATA userData() throws CorruptDataException {
		return getUDATAAtOffset(J9NativeLibrary._userDataOffset_);
	}

	// UDATA userData
	public UDATAPointer userDataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NativeLibrary._userDataOffset_));
	}

}
