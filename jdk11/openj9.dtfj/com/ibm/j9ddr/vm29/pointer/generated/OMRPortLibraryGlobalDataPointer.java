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
 * Structure: OMRPortLibraryGlobalDataPointer
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
 * The generated code will provide getters for all elements in the OMRPortLibraryGlobalDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortLibraryGlobalData.class)
public class OMRPortLibraryGlobalDataPointer extends StructurePointer {

	// NULL
	public static final OMRPortLibraryGlobalDataPointer NULL = new OMRPortLibraryGlobalDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortLibraryGlobalDataPointer(long address) {
		super(address);
	}

	public static OMRPortLibraryGlobalDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortLibraryGlobalDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortLibraryGlobalDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortLibraryGlobalDataPointer(address);
	}

	public OMRPortLibraryGlobalDataPointer add(long count) {
		return OMRPortLibraryGlobalDataPointer.cast(address + (OMRPortLibraryGlobalData.SIZEOF * count));
	}

	public OMRPortLibraryGlobalDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortLibraryGlobalDataPointer addOffset(long offset) {
		return OMRPortLibraryGlobalDataPointer.cast(address + offset);
	}

	public OMRPortLibraryGlobalDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortLibraryGlobalDataPointer sub(long count) {
		return OMRPortLibraryGlobalDataPointer.cast(address - (OMRPortLibraryGlobalData.SIZEOF * count));
	}

	public OMRPortLibraryGlobalDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortLibraryGlobalDataPointer subOffset(long offset) {
		return OMRPortLibraryGlobalDataPointer.cast(address - offset);
	}

	public OMRPortLibraryGlobalDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortLibraryGlobalDataPointer untag(long mask) {
		return OMRPortLibraryGlobalDataPointer.cast(address & ~mask);
	}

	public OMRPortLibraryGlobalDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortLibraryGlobalData.SIZEOF;
	}

	// Implementation methods

	// void* buffer_list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buffer_listOffset_", declaredType="void*")
	public VoidPointer buffer_list() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibraryGlobalData._buffer_listOffset_));
	}

	// void* buffer_list
	public PointerPointer buffer_listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._buffer_listOffset_));
	}

	// J9PortControlData control
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_controlOffset_", declaredType="J9PortControlData")
	public J9PortControlDataPointer control() throws CorruptDataException {
		return J9PortControlDataPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._controlOffset_));
	}

	// J9PortControlData control
	public PointerPointer controlEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._controlOffset_));
	}

	// void* corruptedMemoryBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptedMemoryBlockOffset_", declaredType="void*")
	public VoidPointer corruptedMemoryBlock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibraryGlobalData._corruptedMemoryBlockOffset_));
	}

	// void* corruptedMemoryBlock
	public PointerPointer corruptedMemoryBlockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._corruptedMemoryBlockOffset_));
	}

	// U64 disableEnsureCap32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_disableEnsureCap32Offset_", declaredType="U64")
	public UDATA disableEnsureCap32() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._disableEnsureCap32Offset_));
	}

	// U64 disableEnsureCap32
	public UDATAPointer disableEnsureCap32EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._disableEnsureCap32Offset_));
	}

	// J9SysinfoCPUTime latestCPUTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_latestCPUTimeOffset_", declaredType="J9SysinfoCPUTime")
	public J9SysinfoCPUTimePointer latestCPUTime() throws CorruptDataException {
		return J9SysinfoCPUTimePointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._latestCPUTimeOffset_));
	}

	// J9SysinfoCPUTime latestCPUTime
	public PointerPointer latestCPUTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._latestCPUTimeOffset_));
	}

	// J9NLSDataCache nls_data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_dataOffset_", declaredType="J9NLSDataCache")
	public J9NLSDataCachePointer nls_data() throws CorruptDataException {
		return J9NLSDataCachePointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._nls_dataOffset_));
	}

	// J9NLSDataCache nls_data
	public PointerPointer nls_dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._nls_dataOffset_));
	}

	// J9SysinfoCPUTime oldestCPUTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldestCPUTimeOffset_", declaredType="J9SysinfoCPUTime")
	public J9SysinfoCPUTimePointer oldestCPUTime() throws CorruptDataException {
		return J9SysinfoCPUTimePointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._oldestCPUTimeOffset_));
	}

	// J9SysinfoCPUTime oldestCPUTime
	public PointerPointer oldestCPUTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._oldestCPUTimeOffset_));
	}

	// OMRPortPlatformGlobals platformGlobals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_platformGlobalsOffset_", declaredType="OMRPortPlatformGlobals")
	public OMRPortPlatformGlobalsPointer platformGlobals() throws CorruptDataException {
		return OMRPortPlatformGlobalsPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._platformGlobalsOffset_));
	}

	// OMRPortPlatformGlobals platformGlobals
	public PointerPointer platformGlobalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._platformGlobalsOffset_));
	}

	// OMRMemCategory portLibraryMemoryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryMemoryCategoryOffset_", declaredType="OMRMemCategory")
	public OMRMemCategoryPointer portLibraryMemoryCategory() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._portLibraryMemoryCategoryOffset_));
	}

	// OMRMemCategory portLibraryMemoryCategory
	public PointerPointer portLibraryMemoryCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._portLibraryMemoryCategoryOffset_));
	}

	// void* procSelfMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_procSelfMapOffset_", declaredType="void*")
	public VoidPointer procSelfMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibraryGlobalData._procSelfMapOffset_));
	}

	// void* procSelfMap
	public PointerPointer procSelfMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._procSelfMapOffset_));
	}

	// omrthread_tls_key_t socketTlsKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_socketTlsKeyOffset_", declaredType="omrthread_tls_key_t")
	public UDATA socketTlsKey() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._socketTlsKeyOffset_));
	}

	// omrthread_tls_key_t socketTlsKey
	public UDATAPointer socketTlsKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._socketTlsKeyOffset_));
	}

	// omrthread_tls_key_t tls_key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_keyOffset_", declaredType="omrthread_tls_key_t")
	public UDATA tls_key() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._tls_keyOffset_));
	}

	// omrthread_tls_key_t tls_key
	public UDATAPointer tls_keyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._tls_keyOffset_));
	}

	// MUTEX tls_mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_mutexOffset_", declaredType="MUTEX")
	public _opaque_pthread_mutex_tPointer tls_mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._tls_mutexOffset_));
	}

	// MUTEX tls_mutex
	public PointerPointer tls_mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._tls_mutexOffset_));
	}

	// OMRMemCategory unknownMemoryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unknownMemoryCategoryOffset_", declaredType="OMRMemCategory")
	public OMRMemCategoryPointer unknownMemoryCategory() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._unknownMemoryCategoryOffset_));
	}

	// OMRMemCategory unknownMemoryCategory
	public PointerPointer unknownMemoryCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._unknownMemoryCategoryOffset_));
	}

	// OMRMemCategory unusedAllocate32HeapRegionsMemoryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unusedAllocate32HeapRegionsMemoryCategoryOffset_", declaredType="OMRMemCategory")
	public OMRMemCategoryPointer unusedAllocate32HeapRegionsMemoryCategory() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._unusedAllocate32HeapRegionsMemoryCategoryOffset_));
	}

	// OMRMemCategory unusedAllocate32HeapRegionsMemoryCategory
	public PointerPointer unusedAllocate32HeapRegionsMemoryCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._unusedAllocate32HeapRegionsMemoryCategoryOffset_));
	}

	// U64 userSpecifiedCPUs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userSpecifiedCPUsOffset_", declaredType="U64")
	public UDATA userSpecifiedCPUs() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._userSpecifiedCPUsOffset_));
	}

	// U64 userSpecifiedCPUs
	public UDATAPointer userSpecifiedCPUsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._userSpecifiedCPUsOffset_));
	}

	// U64 vectorRegsSupportOn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vectorRegsSupportOnOffset_", declaredType="U64")
	public UDATA vectorRegsSupportOn() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._vectorRegsSupportOnOffset_));
	}

	// U64 vectorRegsSupportOn
	public UDATAPointer vectorRegsSupportOnEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._vectorRegsSupportOnOffset_));
	}

	// U64 vmemAdviseOSonFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmemAdviseOSonFreeOffset_", declaredType="U64")
	public UDATA vmemAdviseOSonFree() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._vmemAdviseOSonFreeOffset_));
	}

	// U64 vmemAdviseOSonFree
	public UDATAPointer vmemAdviseOSonFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._vmemAdviseOSonFreeOffset_));
	}

	// U64 vmemEnableMadvise
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmemEnableMadviseOffset_", declaredType="U64")
	public UDATA vmemEnableMadvise() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortLibraryGlobalData._vmemEnableMadviseOffset_));
	}

	// U64 vmemEnableMadvise
	public UDATAPointer vmemEnableMadviseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortLibraryGlobalData._vmemEnableMadviseOffset_));
	}

}
