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
 * Structure: OMRPortPlatformGlobalsPointer
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
 * The generated code will provide getters for all elements in the OMRPortPlatformGlobalsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortPlatformGlobals.class)
public class OMRPortPlatformGlobalsPointer extends StructurePointer {

	// NULL
	public static final OMRPortPlatformGlobalsPointer NULL = new OMRPortPlatformGlobalsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortPlatformGlobalsPointer(long address) {
		super(address);
	}

	public static OMRPortPlatformGlobalsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortPlatformGlobalsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortPlatformGlobalsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortPlatformGlobalsPointer(address);
	}

	public OMRPortPlatformGlobalsPointer add(long count) {
		return OMRPortPlatformGlobalsPointer.cast(address + (OMRPortPlatformGlobals.SIZEOF * count));
	}

	public OMRPortPlatformGlobalsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortPlatformGlobalsPointer addOffset(long offset) {
		return OMRPortPlatformGlobalsPointer.cast(address + offset);
	}

	public OMRPortPlatformGlobalsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortPlatformGlobalsPointer sub(long count) {
		return OMRPortPlatformGlobalsPointer.cast(address - (OMRPortPlatformGlobals.SIZEOF * count));
	}

	public OMRPortPlatformGlobalsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortPlatformGlobalsPointer subOffset(long offset) {
		return OMRPortPlatformGlobalsPointer.cast(address - offset);
	}

	public OMRPortPlatformGlobalsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortPlatformGlobalsPointer untag(long mask) {
		return OMRPortPlatformGlobalsPointer.cast(address & ~mask);
	}

	public OMRPortPlatformGlobalsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortPlatformGlobals.SIZEOF;
	}

	// Implementation methods

	// BOOLEAN globalConverterEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalConverterEnabledOffset_", declaredType="BOOLEAN")
	public UDATA globalConverterEnabled() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRPortPlatformGlobals._globalConverterEnabledOffset_));
	}

	// BOOLEAN globalConverterEnabled
	public UDATAPointer globalConverterEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._globalConverterEnabledOffset_));
	}

	// BOOLEAN isRunningInContainer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isRunningInContainerOffset_", declaredType="BOOLEAN")
	public UDATA isRunningInContainer() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRPortPlatformGlobals._isRunningInContainerOffset_));
	}

	// BOOLEAN isRunningInContainer
	public UDATAPointer isRunningInContainerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._isRunningInContainerOffset_));
	}

	// BOOLEAN loggingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loggingEnabledOffset_", declaredType="BOOLEAN")
	public UDATA loggingEnabled() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRPortPlatformGlobals._loggingEnabledOffset_));
	}

	// BOOLEAN loggingEnabled
	public UDATAPointer loggingEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._loggingEnabledOffset_));
	}

	// U64 numa_platform_interleave_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numa_platform_interleave_memoryOffset_", declaredType="U64")
	public UDATA numa_platform_interleave_memory() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortPlatformGlobals._numa_platform_interleave_memoryOffset_));
	}

	// U64 numa_platform_interleave_memory
	public UDATAPointer numa_platform_interleave_memoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._numa_platform_interleave_memoryOffset_));
	}

	// U64 numa_platform_supports_numa
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numa_platform_supports_numaOffset_", declaredType="U64")
	public UDATA numa_platform_supports_numa() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortPlatformGlobals._numa_platform_supports_numaOffset_));
	}

	// U64 numa_platform_supports_numa
	public UDATAPointer numa_platform_supports_numaEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._numa_platform_supports_numaOffset_));
	}

	// U8* si_executableName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_executableNameOffset_", declaredType="U8*")
	public U8Pointer si_executableName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortPlatformGlobals._si_executableNameOffset_));
	}

	// U8* si_executableName
	public PointerPointer si_executableNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._si_executableNameOffset_));
	}

	// U8* si_osType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_osTypeOffset_", declaredType="U8*")
	public U8Pointer si_osType() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortPlatformGlobals._si_osTypeOffset_));
	}

	// U8* si_osType
	public PointerPointer si_osTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._si_osTypeOffset_));
	}

	// U8* si_osVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_si_osVersionOffset_", declaredType="U8*")
	public U8Pointer si_osVersion() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRPortPlatformGlobals._si_osVersionOffset_));
	}

	// U8* si_osVersion
	public PointerPointer si_osVersionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._si_osVersionOffset_));
	}

	// OMRSTFLECache stfleCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stfleCacheOffset_", declaredType="OMRSTFLECache")
	public OMRSTFLECachePointer stfleCache() throws CorruptDataException {
		return OMRSTFLECachePointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._stfleCacheOffset_));
	}

	// OMRSTFLECache stfleCache
	public PointerPointer stfleCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._stfleCacheOffset_));
	}

	// J9SubAllocateHeapMem32 subAllocHeapMem32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subAllocHeapMem32Offset_", declaredType="J9SubAllocateHeapMem32")
	public J9SubAllocateHeapMem32Pointer subAllocHeapMem32() throws CorruptDataException {
		return J9SubAllocateHeapMem32Pointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._subAllocHeapMem32Offset_));
	}

	// J9SubAllocateHeapMem32 subAllocHeapMem32
	public PointerPointer subAllocHeapMem32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._subAllocHeapMem32Offset_));
	}

	// U64 systemLoggingFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemLoggingFlagsOffset_", declaredType="U64")
	public UDATA systemLoggingFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortPlatformGlobals._systemLoggingFlagsOffset_));
	}

	// U64 systemLoggingFlags
	public UDATAPointer systemLoggingFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._systemLoggingFlagsOffset_));
	}

	// U64[] vmem_pageFlags
	public UDATAPointer vmem_pageFlagsEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._vmem_pageFlagsOffset_));
	}

	// U64[] vmem_pageSize
	public UDATAPointer vmem_pageSizeEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(OMRPortPlatformGlobals._vmem_pageSizeOffset_));
	}

}
