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
 * Structure: DgRasInterfacePointer
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
 * The generated code will provide getters for all elements in the DgRasInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=DgRasInterface.class)
public class DgRasInterfacePointer extends StructurePointer {

	// NULL
	public static final DgRasInterfacePointer NULL = new DgRasInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected DgRasInterfacePointer(long address) {
		super(address);
	}

	public static DgRasInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static DgRasInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static DgRasInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new DgRasInterfacePointer(address);
	}

	public DgRasInterfacePointer add(long count) {
		return DgRasInterfacePointer.cast(address + (DgRasInterface.SIZEOF * count));
	}

	public DgRasInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public DgRasInterfacePointer addOffset(long offset) {
		return DgRasInterfacePointer.cast(address + offset);
	}

	public DgRasInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public DgRasInterfacePointer sub(long count) {
		return DgRasInterfacePointer.cast(address - (DgRasInterface.SIZEOF * count));
	}

	public DgRasInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public DgRasInterfacePointer subOffset(long offset) {
		return DgRasInterfacePointer.cast(address - offset);
	}

	public DgRasInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public DgRasInterfacePointer untag(long mask) {
		return DgRasInterfacePointer.cast(address & ~mask);
	}

	public DgRasInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return DgRasInterface.SIZEOF;
	}

	// Implementation methods

	// void* CreateThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CreateThreadOffset_", declaredType="void*")
	public VoidPointer CreateThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._CreateThreadOffset_));
	}

	// void* CreateThread
	public PointerPointer CreateThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._CreateThreadOffset_));
	}

	// void* DumpDeregister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DumpDeregisterOffset_", declaredType="void*")
	public VoidPointer DumpDeregister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._DumpDeregisterOffset_));
	}

	// void* DumpDeregister
	public PointerPointer DumpDeregisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._DumpDeregisterOffset_));
	}

	// void* DumpRegister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DumpRegisterOffset_", declaredType="void*")
	public VoidPointer DumpRegister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._DumpRegisterOffset_));
	}

	// void* DumpRegister
	public PointerPointer DumpRegisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._DumpRegisterOffset_));
	}

	// void* DynamicVerbosegc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DynamicVerbosegcOffset_", declaredType="void*")
	public VoidPointer DynamicVerbosegc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._DynamicVerbosegcOffset_));
	}

	// void* DynamicVerbosegc
	public PointerPointer DynamicVerbosegcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._DynamicVerbosegcOffset_));
	}

	// void* GenerateHeapdump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GenerateHeapdumpOffset_", declaredType="void*")
	public VoidPointer GenerateHeapdump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._GenerateHeapdumpOffset_));
	}

	// void* GenerateHeapdump
	public PointerPointer GenerateHeapdumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._GenerateHeapdumpOffset_));
	}

	// void* GenerateJavacore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GenerateJavacoreOffset_", declaredType="void*")
	public VoidPointer GenerateJavacore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._GenerateJavacoreOffset_));
	}

	// void* GenerateJavacore
	public PointerPointer GenerateJavacoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._GenerateJavacoreOffset_));
	}

	// void* GetComponentDataArea
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetComponentDataAreaOffset_", declaredType="void*")
	public VoidPointer GetComponentDataArea() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._GetComponentDataAreaOffset_));
	}

	// void* GetComponentDataArea
	public PointerPointer GetComponentDataAreaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._GetComponentDataAreaOffset_));
	}

	// void* GetRasInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetRasInfoOffset_", declaredType="void*")
	public VoidPointer GetRasInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._GetRasInfoOffset_));
	}

	// void* GetRasInfo
	public PointerPointer GetRasInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._GetRasInfoOffset_));
	}

	// void* InitiateSystemDump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_InitiateSystemDumpOffset_", declaredType="void*")
	public VoidPointer InitiateSystemDump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._InitiateSystemDumpOffset_));
	}

	// void* InitiateSystemDump
	public PointerPointer InitiateSystemDumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._InitiateSystemDumpOffset_));
	}

	// void* InjectOutOfMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_InjectOutOfMemoryOffset_", declaredType="void*")
	public VoidPointer InjectOutOfMemory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._InjectOutOfMemoryOffset_));
	}

	// void* InjectOutOfMemory
	public PointerPointer InjectOutOfMemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._InjectOutOfMemoryOffset_));
	}

	// void* InjectSigsegv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_InjectSigsegvOffset_", declaredType="void*")
	public VoidPointer InjectSigsegv() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._InjectSigsegvOffset_));
	}

	// void* InjectSigsegv
	public PointerPointer InjectSigsegvEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._InjectSigsegvOffset_));
	}

	// void* NotifySignal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NotifySignalOffset_", declaredType="void*")
	public VoidPointer NotifySignal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._NotifySignalOffset_));
	}

	// void* NotifySignal
	public PointerPointer NotifySignalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._NotifySignalOffset_));
	}

	// void* ReleaseRasInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ReleaseRasInfoOffset_", declaredType="void*")
	public VoidPointer ReleaseRasInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._ReleaseRasInfoOffset_));
	}

	// void* ReleaseRasInfo
	public PointerPointer ReleaseRasInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._ReleaseRasInfoOffset_));
	}

	// void* RunDumpRoutine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RunDumpRoutineOffset_", declaredType="void*")
	public VoidPointer RunDumpRoutine() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._RunDumpRoutineOffset_));
	}

	// void* RunDumpRoutine
	public PointerPointer RunDumpRoutineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._RunDumpRoutineOffset_));
	}

	// void* SetOutOfMemoryHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetOutOfMemoryHookOffset_", declaredType="void*")
	public VoidPointer SetOutOfMemoryHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._SetOutOfMemoryHookOffset_));
	}

	// void* SetOutOfMemoryHook
	public PointerPointer SetOutOfMemoryHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._SetOutOfMemoryHookOffset_));
	}

	// void* TraceDeregister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceDeregisterOffset_", declaredType="void*")
	public VoidPointer TraceDeregister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceDeregisterOffset_));
	}

	// void* TraceDeregister
	public PointerPointer TraceDeregisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceDeregisterOffset_));
	}

	// void* TraceDeregister50
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceDeregister50Offset_", declaredType="void*")
	public VoidPointer TraceDeregister50() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceDeregister50Offset_));
	}

	// void* TraceDeregister50
	public PointerPointer TraceDeregister50EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceDeregister50Offset_));
	}

	// void* TraceRegister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceRegisterOffset_", declaredType="void*")
	public VoidPointer TraceRegister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceRegisterOffset_));
	}

	// void* TraceRegister
	public PointerPointer TraceRegisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceRegisterOffset_));
	}

	// void* TraceRegister50
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceRegister50Offset_", declaredType="void*")
	public VoidPointer TraceRegister50() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceRegister50Offset_));
	}

	// void* TraceRegister50
	public PointerPointer TraceRegister50EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceRegister50Offset_));
	}

	// void* TraceResume
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceResumeOffset_", declaredType="void*")
	public VoidPointer TraceResume() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceResumeOffset_));
	}

	// void* TraceResume
	public PointerPointer TraceResumeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceResumeOffset_));
	}

	// void* TraceResumeThis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceResumeThisOffset_", declaredType="void*")
	public VoidPointer TraceResumeThis() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceResumeThisOffset_));
	}

	// void* TraceResumeThis
	public PointerPointer TraceResumeThisEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceResumeThisOffset_));
	}

	// void* TraceSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSetOffset_", declaredType="void*")
	public VoidPointer TraceSet() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceSetOffset_));
	}

	// void* TraceSet
	public PointerPointer TraceSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceSetOffset_));
	}

	// void* TraceSnap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSnapOffset_", declaredType="void*")
	public VoidPointer TraceSnap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceSnapOffset_));
	}

	// void* TraceSnap
	public PointerPointer TraceSnapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceSnapOffset_));
	}

	// void* TraceSuspend
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSuspendOffset_", declaredType="void*")
	public VoidPointer TraceSuspend() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceSuspendOffset_));
	}

	// void* TraceSuspend
	public PointerPointer TraceSuspendEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceSuspendOffset_));
	}

	// void* TraceSuspendThis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSuspendThisOffset_", declaredType="void*")
	public VoidPointer TraceSuspendThis() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(DgRasInterface._TraceSuspendThisOffset_));
	}

	// void* TraceSuspendThis
	public PointerPointer TraceSuspendThisEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DgRasInterface._TraceSuspendThisOffset_));
	}

	// U8[] eyecatcher
	public U8Pointer eyecatcherEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(DgRasInterface._eyecatcherOffset_));
	}

	// I32 length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="I32")
	public IDATA length() throws CorruptDataException {
		return new I32(getIntAtOffset(DgRasInterface._lengthOffset_));
	}

	// I32 length
	public IDATAPointer lengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DgRasInterface._lengthOffset_));
	}

	// I32 modification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modificationOffset_", declaredType="I32")
	public IDATA modification() throws CorruptDataException {
		return new I32(getIntAtOffset(DgRasInterface._modificationOffset_));
	}

	// I32 modification
	public IDATAPointer modificationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DgRasInterface._modificationOffset_));
	}

	// I32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="I32")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(DgRasInterface._versionOffset_));
	}

	// I32 version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(DgRasInterface._versionOffset_));
	}

}
