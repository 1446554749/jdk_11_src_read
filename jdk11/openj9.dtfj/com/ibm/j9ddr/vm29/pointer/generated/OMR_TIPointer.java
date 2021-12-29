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
 * Structure: OMR_TIPointer
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
 * The generated code will provide getters for all elements in the OMR_TIPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_TI.class)
public class OMR_TIPointer extends StructurePointer {

	// NULL
	public static final OMR_TIPointer NULL = new OMR_TIPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_TIPointer(long address) {
		super(address);
	}

	public static OMR_TIPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_TIPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_TIPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_TIPointer(address);
	}

	public OMR_TIPointer add(long count) {
		return OMR_TIPointer.cast(address + (OMR_TI.SIZEOF * count));
	}

	public OMR_TIPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_TIPointer addOffset(long offset) {
		return OMR_TIPointer.cast(address + offset);
	}

	public OMR_TIPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_TIPointer sub(long count) {
		return OMR_TIPointer.cast(address - (OMR_TI.SIZEOF * count));
	}

	public OMR_TIPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_TIPointer subOffset(long offset) {
		return OMR_TIPointer.cast(address - offset);
	}

	public OMR_TIPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_TIPointer untag(long mask) {
		return OMR_TIPointer.cast(address & ~mask);
	}

	public OMR_TIPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_TI.SIZEOF;
	}

	// Implementation methods

	// void* BindCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_BindCurrentThreadOffset_", declaredType="void*")
	public VoidPointer BindCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._BindCurrentThreadOffset_));
	}

	// void* BindCurrentThread
	public PointerPointer BindCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._BindCurrentThreadOffset_));
	}

	// void* DeregisterRecordSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeregisterRecordSubscriberOffset_", declaredType="void*")
	public VoidPointer DeregisterRecordSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._DeregisterRecordSubscriberOffset_));
	}

	// void* DeregisterRecordSubscriber
	public PointerPointer DeregisterRecordSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._DeregisterRecordSubscriberOffset_));
	}

	// void* FlushTraceData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FlushTraceDataOffset_", declaredType="void*")
	public VoidPointer FlushTraceData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._FlushTraceDataOffset_));
	}

	// void* FlushTraceData
	public PointerPointer FlushTraceDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._FlushTraceDataOffset_));
	}

	// void* GetFreePhysicalMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFreePhysicalMemorySizeOffset_", declaredType="void*")
	public VoidPointer GetFreePhysicalMemorySize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetFreePhysicalMemorySizeOffset_));
	}

	// void* GetFreePhysicalMemorySize
	public PointerPointer GetFreePhysicalMemorySizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetFreePhysicalMemorySizeOffset_));
	}

	// void* GetMemoryCategories
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMemoryCategoriesOffset_", declaredType="void*")
	public VoidPointer GetMemoryCategories() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetMemoryCategoriesOffset_));
	}

	// void* GetMemoryCategories
	public PointerPointer GetMemoryCategoriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetMemoryCategoriesOffset_));
	}

	// void* GetMethodDescriptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodDescriptionsOffset_", declaredType="void*")
	public VoidPointer GetMethodDescriptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetMethodDescriptionsOffset_));
	}

	// void* GetMethodDescriptions
	public PointerPointer GetMethodDescriptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetMethodDescriptionsOffset_));
	}

	// void* GetMethodProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodPropertiesOffset_", declaredType="void*")
	public VoidPointer GetMethodProperties() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetMethodPropertiesOffset_));
	}

	// void* GetMethodProperties
	public PointerPointer GetMethodPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetMethodPropertiesOffset_));
	}

	// void* GetProcessCpuLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetProcessCpuLoadOffset_", declaredType="void*")
	public VoidPointer GetProcessCpuLoad() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetProcessCpuLoadOffset_));
	}

	// void* GetProcessCpuLoad
	public PointerPointer GetProcessCpuLoadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetProcessCpuLoadOffset_));
	}

	// void* GetProcessPhysicalMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetProcessPhysicalMemorySizeOffset_", declaredType="void*")
	public VoidPointer GetProcessPhysicalMemorySize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetProcessPhysicalMemorySizeOffset_));
	}

	// void* GetProcessPhysicalMemorySize
	public PointerPointer GetProcessPhysicalMemorySizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetProcessPhysicalMemorySizeOffset_));
	}

	// void* GetProcessPrivateMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetProcessPrivateMemorySizeOffset_", declaredType="void*")
	public VoidPointer GetProcessPrivateMemorySize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetProcessPrivateMemorySizeOffset_));
	}

	// void* GetProcessPrivateMemorySize
	public PointerPointer GetProcessPrivateMemorySizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetProcessPrivateMemorySizeOffset_));
	}

	// void* GetProcessVirtualMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetProcessVirtualMemorySizeOffset_", declaredType="void*")
	public VoidPointer GetProcessVirtualMemorySize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetProcessVirtualMemorySizeOffset_));
	}

	// void* GetProcessVirtualMemorySize
	public PointerPointer GetProcessVirtualMemorySizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetProcessVirtualMemorySizeOffset_));
	}

	// void* GetSystemCpuLoad
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSystemCpuLoadOffset_", declaredType="void*")
	public VoidPointer GetSystemCpuLoad() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetSystemCpuLoadOffset_));
	}

	// void* GetSystemCpuLoad
	public PointerPointer GetSystemCpuLoadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetSystemCpuLoadOffset_));
	}

	// void* GetTraceMetadata
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTraceMetadataOffset_", declaredType="void*")
	public VoidPointer GetTraceMetadata() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._GetTraceMetadataOffset_));
	}

	// void* GetTraceMetadata
	public PointerPointer GetTraceMetadataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._GetTraceMetadataOffset_));
	}

	// void* RegisterRecordSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RegisterRecordSubscriberOffset_", declaredType="void*")
	public VoidPointer RegisterRecordSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._RegisterRecordSubscriberOffset_));
	}

	// void* RegisterRecordSubscriber
	public PointerPointer RegisterRecordSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._RegisterRecordSubscriberOffset_));
	}

	// void* SetTraceOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetTraceOptionsOffset_", declaredType="void*")
	public VoidPointer SetTraceOptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._SetTraceOptionsOffset_));
	}

	// void* SetTraceOptions
	public PointerPointer SetTraceOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._SetTraceOptionsOffset_));
	}

	// void* UnbindCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_UnbindCurrentThreadOffset_", declaredType="void*")
	public VoidPointer UnbindCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._UnbindCurrentThreadOffset_));
	}

	// void* UnbindCurrentThread
	public PointerPointer UnbindCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._UnbindCurrentThreadOffset_));
	}

	// void* internalData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalDataOffset_", declaredType="void*")
	public VoidPointer internalData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_TI._internalDataOffset_));
	}

	// void* internalData
	public PointerPointer internalDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_TI._internalDataOffset_));
	}

	// I32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="I32")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(OMR_TI._versionOffset_));
	}

	// I32 version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_TI._versionOffset_));
	}

}
