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
 * Structure: J9JITConfigPointer
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
 * The generated code will provide getters for all elements in the J9JITConfigPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITConfig.class)
public class J9JITConfigPointer extends StructurePointer {

	// NULL
	public static final J9JITConfigPointer NULL = new J9JITConfigPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITConfigPointer(long address) {
		super(address);
	}

	public static J9JITConfigPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITConfigPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITConfigPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITConfigPointer(address);
	}

	public J9JITConfigPointer add(long count) {
		return J9JITConfigPointer.cast(address + (J9JITConfig.SIZEOF * count));
	}

	public J9JITConfigPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITConfigPointer addOffset(long offset) {
		return J9JITConfigPointer.cast(address + offset);
	}

	public J9JITConfigPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITConfigPointer sub(long count) {
		return J9JITConfigPointer.cast(address - (J9JITConfig.SIZEOF * count));
	}

	public J9JITConfigPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITConfigPointer subOffset(long offset) {
		return J9JITConfigPointer.cast(address - offset);
	}

	public J9JITConfigPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITConfigPointer untag(long mask) {
		return J9JITConfigPointer.cast(address & ~mask);
	}

	public J9JITConfigPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITConfig.SIZEOF;
	}

	// Implementation methods

	// void* aotCompilationInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotCompilationInfoOffset_", declaredType="void*")
	public VoidPointer aotCompilationInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._aotCompilationInfoOffset_));
	}

	// void* aotCompilationInfo
	public PointerPointer aotCompilationInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._aotCompilationInfoOffset_));
	}

	// void* aotrt_getRuntimeHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotrt_getRuntimeHelperOffset_", declaredType="void*")
	public VoidPointer aotrt_getRuntimeHelper() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._aotrt_getRuntimeHelperOffset_));
	}

	// void* aotrt_getRuntimeHelper
	public PointerPointer aotrt_getRuntimeHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._aotrt_getRuntimeHelperOffset_));
	}

	// void* aotrt_lookupSendTargetForThunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotrt_lookupSendTargetForThunkOffset_", declaredType="void*")
	public VoidPointer aotrt_lookupSendTargetForThunk() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._aotrt_lookupSendTargetForThunkOffset_));
	}

	// void* aotrt_lookupSendTargetForThunk
	public PointerPointer aotrt_lookupSendTargetForThunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._aotrt_lookupSendTargetForThunkOffset_));
	}

	// void* b_i2jTransition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_b_i2jTransitionOffset_", declaredType="void*")
	public VoidPointer b_i2jTransition() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._b_i2jTransitionOffset_));
	}

	// void* b_i2jTransition
	public PointerPointer b_i2jTransitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._b_i2jTransitionOffset_));
	}

	// UDATA bcSizeLimit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bcSizeLimitOffset_", declaredType="UDATA")
	public UDATA bcSizeLimit() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._bcSizeLimitOffset_);
	}

	// UDATA bcSizeLimit
	public UDATAPointer bcSizeLimitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._bcSizeLimitOffset_));
	}

	// UDATA breakMessageNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_breakMessageNumberOffset_", declaredType="UDATA")
	public UDATA breakMessageNumber() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._breakMessageNumberOffset_);
	}

	// UDATA breakMessageNumber
	public UDATAPointer breakMessageNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._breakMessageNumberOffset_));
	}

	// J9JITBreakpointedMethod* breakpointedMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_breakpointedMethodsOffset_", declaredType="J9JITBreakpointedMethod*")
	public J9JITBreakpointedMethodPointer breakpointedMethods() throws CorruptDataException {
		return J9JITBreakpointedMethodPointer.cast(getPointerAtOffset(J9JITConfig._breakpointedMethodsOffset_));
	}

	// J9JITBreakpointedMethod* breakpointedMethods
	public PointerPointer breakpointedMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._breakpointedMethodsOffset_));
	}

	// void* c_jitDecompileAfterAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileAfterAllocationOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileAfterAllocation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileAfterAllocationOffset_));
	}

	// void* c_jitDecompileAfterAllocation
	public PointerPointer c_jitDecompileAfterAllocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileAfterAllocationOffset_));
	}

	// void* c_jitDecompileAfterMonitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileAfterMonitorEnterOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileAfterMonitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileAfterMonitorEnterOffset_));
	}

	// void* c_jitDecompileAfterMonitorEnter
	public PointerPointer c_jitDecompileAfterMonitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileAfterMonitorEnterOffset_));
	}

	// void* c_jitDecompileAtCurrentPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileAtCurrentPCOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileAtCurrentPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileAtCurrentPCOffset_));
	}

	// void* c_jitDecompileAtCurrentPC
	public PointerPointer c_jitDecompileAtCurrentPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileAtCurrentPCOffset_));
	}

	// void* c_jitDecompileAtExceptionCatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileAtExceptionCatchOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileAtExceptionCatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileAtExceptionCatchOffset_));
	}

	// void* c_jitDecompileAtExceptionCatch
	public PointerPointer c_jitDecompileAtExceptionCatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileAtExceptionCatchOffset_));
	}

	// void* c_jitDecompileBeforeMethodMonitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileBeforeMethodMonitorEnterOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileBeforeMethodMonitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileBeforeMethodMonitorEnterOffset_));
	}

	// void* c_jitDecompileBeforeMethodMonitorEnter
	public PointerPointer c_jitDecompileBeforeMethodMonitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileBeforeMethodMonitorEnterOffset_));
	}

	// void* c_jitDecompileBeforeReportMethodEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileBeforeReportMethodEnterOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileBeforeReportMethodEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileBeforeReportMethodEnterOffset_));
	}

	// void* c_jitDecompileBeforeReportMethodEnter
	public PointerPointer c_jitDecompileBeforeReportMethodEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileBeforeReportMethodEnterOffset_));
	}

	// void* c_jitDecompileOnReturn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitDecompileOnReturnOffset_", declaredType="void*")
	public VoidPointer c_jitDecompileOnReturn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitDecompileOnReturnOffset_));
	}

	// void* c_jitDecompileOnReturn
	public PointerPointer c_jitDecompileOnReturnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitDecompileOnReturnOffset_));
	}

	// void* c_jitReportExceptionCatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_c_jitReportExceptionCatchOffset_", declaredType="void*")
	public VoidPointer c_jitReportExceptionCatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._c_jitReportExceptionCatchOffset_));
	}

	// void* c_jitReportExceptionCatch
	public PointerPointer c_jitReportExceptionCatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._c_jitReportExceptionCatchOffset_));
	}

	// void* classLibAttributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLibAttributesOffset_", declaredType="void*")
	public VoidPointer classLibAttributes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._classLibAttributesOffset_));
	}

	// void* classLibAttributes
	public PointerPointer classLibAttributesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._classLibAttributesOffset_));
	}

	// J9MemorySegment* codeCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer codeCache() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheOffset_));
	}

	// J9MemorySegment* codeCache
	public PointerPointer codeCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheOffset_));
	}

	// UDATA codeCacheAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheAlignmentOffset_", declaredType="UDATA")
	public UDATA codeCacheAlignment() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._codeCacheAlignmentOffset_);
	}

	// UDATA codeCacheAlignment
	public UDATAPointer codeCacheAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheAlignmentOffset_));
	}

	// void* codeCacheColdAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheColdAllocOffset_", declaredType="void*")
	public VoidPointer codeCacheColdAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheColdAllocOffset_));
	}

	// void* codeCacheColdAlloc
	public PointerPointer codeCacheColdAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheColdAllocOffset_));
	}

	// UDATA* codeCacheFreeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheFreeListOffset_", declaredType="UDATA*")
	public UDATAPointer codeCacheFreeList() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheFreeListOffset_));
	}

	// UDATA* codeCacheFreeList
	public PointerPointer codeCacheFreeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheFreeListOffset_));
	}

	// UDATA codeCacheKB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheKBOffset_", declaredType="UDATA")
	public UDATA codeCacheKB() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._codeCacheKBOffset_);
	}

	// UDATA codeCacheKB
	public UDATAPointer codeCacheKBEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheKBOffset_));
	}

	// J9MemorySegmentList* codeCacheList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheListOffset_", declaredType="J9MemorySegmentList*")
	public J9MemorySegmentListPointer codeCacheList() throws CorruptDataException {
		return J9MemorySegmentListPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheListOffset_));
	}

	// J9MemorySegmentList* codeCacheList
	public PointerPointer codeCacheListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheListOffset_));
	}

	// UDATA codeCachePadKB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCachePadKBOffset_", declaredType="UDATA")
	public UDATA codeCachePadKB() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._codeCachePadKBOffset_);
	}

	// UDATA codeCachePadKB
	public UDATAPointer codeCachePadKBEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._codeCachePadKBOffset_));
	}

	// UDATA codeCacheTotalKB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheTotalKBOffset_", declaredType="UDATA")
	public UDATA codeCacheTotalKB() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._codeCacheTotalKBOffset_);
	}

	// UDATA codeCacheTotalKB
	public UDATAPointer codeCacheTotalKBEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheTotalKBOffset_));
	}

	// J9JITCodeCacheTrampolineList* codeCacheTrampolines
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheTrampolinesOffset_", declaredType="J9JITCodeCacheTrampolineList*")
	public J9JITCodeCacheTrampolineListPointer codeCacheTrampolines() throws CorruptDataException {
		return J9JITCodeCacheTrampolineListPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheTrampolinesOffset_));
	}

	// J9JITCodeCacheTrampolineList* codeCacheTrampolines
	public PointerPointer codeCacheTrampolinesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheTrampolinesOffset_));
	}

	// void* codeCacheWarmAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheWarmAllocOffset_", declaredType="void*")
	public VoidPointer codeCacheWarmAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._codeCacheWarmAllocOffset_));
	}

	// void* codeCacheWarmAlloc
	public PointerPointer codeCacheWarmAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._codeCacheWarmAllocOffset_));
	}

	// void* command
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commandOffset_", declaredType="void*")
	public VoidPointer command() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._commandOffset_));
	}

	// void* command
	public PointerPointer commandEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._commandOffset_));
	}

	// void* compilationInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compilationInfoOffset_", declaredType="void*")
	public VoidPointer compilationInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._compilationInfoOffset_));
	}

	// void* compilationInfo
	public PointerPointer compilationInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._compilationInfoOffset_));
	}

	// omrthread_monitor_t compilationMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compilationMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer compilationMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JITConfig._compilationMonitorOffset_));
	}

	// omrthread_monitor_t compilationMonitor
	public PointerPointer compilationMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._compilationMonitorOffset_));
	}

	// void* compileClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileClassOffset_", declaredType="void*")
	public VoidPointer compileClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._compileClassOffset_));
	}

	// void* compileClass
	public PointerPointer compileClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._compileClassOffset_));
	}

	// void* compileClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compileClassesOffset_", declaredType="void*")
	public VoidPointer compileClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._compileClassesOffset_));
	}

	// void* compileClasses
	public PointerPointer compileClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._compileClassesOffset_));
	}

	// UDATA dataBreakpointCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataBreakpointCountOffset_", declaredType="UDATA")
	public UDATA dataBreakpointCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._dataBreakpointCountOffset_);
	}

	// UDATA dataBreakpointCount
	public UDATAPointer dataBreakpointCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._dataBreakpointCountOffset_));
	}

	// J9MemorySegment* dataCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataCacheOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer dataCache() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9JITConfig._dataCacheOffset_));
	}

	// J9MemorySegment* dataCache
	public PointerPointer dataCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._dataCacheOffset_));
	}

	// UDATA dataCacheKB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataCacheKBOffset_", declaredType="UDATA")
	public UDATA dataCacheKB() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._dataCacheKBOffset_);
	}

	// UDATA dataCacheKB
	public UDATAPointer dataCacheKBEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._dataCacheKBOffset_));
	}

	// J9MemorySegmentList* dataCacheList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataCacheListOffset_", declaredType="J9MemorySegmentList*")
	public J9MemorySegmentListPointer dataCacheList() throws CorruptDataException {
		return J9MemorySegmentListPointer.cast(getPointerAtOffset(J9JITConfig._dataCacheListOffset_));
	}

	// J9MemorySegmentList* dataCacheList
	public PointerPointer dataCacheListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._dataCacheListOffset_));
	}

	// UDATA dataCacheTotalKB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataCacheTotalKBOffset_", declaredType="UDATA")
	public UDATA dataCacheTotalKB() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._dataCacheTotalKBOffset_);
	}

	// UDATA dataCacheTotalKB
	public UDATAPointer dataCacheTotalKBEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._dataCacheTotalKBOffset_));
	}

	// void* disableJit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_disableJitOffset_", declaredType="void*")
	public VoidPointer disableJit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._disableJitOffset_));
	}

	// void* disableJit
	public PointerPointer disableJitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._disableJitOffset_));
	}

	// void* doAESInHardware
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doAESInHardwareOffset_", declaredType="void*")
	public VoidPointer doAESInHardware() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._doAESInHardwareOffset_));
	}

	// void* doAESInHardware
	public PointerPointer doAESInHardwareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._doAESInHardwareOffset_));
	}

	// void* doSha256InHardware
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doSha256InHardwareOffset_", declaredType="void*")
	public VoidPointer doSha256InHardware() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._doSha256InHardwareOffset_));
	}

	// void* doSha256InHardware
	public PointerPointer doSha256InHardwareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._doSha256InHardwareOffset_));
	}

	// void* doSha512InHardware
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doSha512InHardwareOffset_", declaredType="void*")
	public VoidPointer doSha512InHardware() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._doSha512InHardwareOffset_));
	}

	// void* doSha512InHardware
	public PointerPointer doSha512InHardwareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._doSha512InHardwareOffset_));
	}

	// void* enableJit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enableJitOffset_", declaredType="void*")
	public VoidPointer enableJit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._enableJitOffset_));
	}

	// void* enableJit
	public PointerPointer enableJitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._enableJitOffset_));
	}

	// void* entryPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryPointOffset_", declaredType="void*")
	public VoidPointer entryPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._entryPointOffset_));
	}

	// void* entryPoint
	public PointerPointer entryPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._entryPointOffset_));
	}

	// void* entryPointForNewInstance
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryPointForNewInstanceOffset_", declaredType="void*")
	public VoidPointer entryPointForNewInstance() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._entryPointForNewInstanceOffset_));
	}

	// void* entryPointForNewInstance
	public PointerPointer entryPointForNewInstanceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._entryPointForNewInstanceOffset_));
	}

	// void* expandAESKeyInHardware
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_expandAESKeyInHardwareOffset_", declaredType="void*")
	public VoidPointer expandAESKeyInHardware() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._expandAESKeyInHardwareOffset_));
	}

	// void* expandAESKeyInHardware
	public PointerPointer expandAESKeyInHardwareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._expandAESKeyInHardwareOffset_));
	}

	// void* fast_jitANewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitANewArrayOffset_", declaredType="void*")
	public VoidPointer fast_jitANewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitANewArrayOffset_));
	}

	// void* fast_jitANewArray
	public PointerPointer fast_jitANewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitANewArrayOffset_));
	}

	// void* fast_jitANewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitANewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer fast_jitANewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitANewArrayNoZeroInitOffset_));
	}

	// void* fast_jitANewArrayNoZeroInit
	public PointerPointer fast_jitANewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitANewArrayNoZeroInitOffset_));
	}

	// void* fast_jitAcquireVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitAcquireVMAccessOffset_", declaredType="void*")
	public VoidPointer fast_jitAcquireVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitAcquireVMAccessOffset_));
	}

	// void* fast_jitAcquireVMAccess
	public PointerPointer fast_jitAcquireVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitAcquireVMAccessOffset_));
	}

	// void* fast_jitCheckCast
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitCheckCastOffset_", declaredType="void*")
	public VoidPointer fast_jitCheckCast() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitCheckCastOffset_));
	}

	// void* fast_jitCheckCast
	public PointerPointer fast_jitCheckCastEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitCheckCastOffset_));
	}

	// void* fast_jitCheckCastForArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitCheckCastForArrayStoreOffset_", declaredType="void*")
	public VoidPointer fast_jitCheckCastForArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitCheckCastForArrayStoreOffset_));
	}

	// void* fast_jitCheckCastForArrayStore
	public PointerPointer fast_jitCheckCastForArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitCheckCastForArrayStoreOffset_));
	}

	// void* fast_jitMethodMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitMethodMonitorEntryOffset_", declaredType="void*")
	public VoidPointer fast_jitMethodMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitMethodMonitorEntryOffset_));
	}

	// void* fast_jitMethodMonitorEntry
	public PointerPointer fast_jitMethodMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitMethodMonitorEntryOffset_));
	}

	// void* fast_jitMethodMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitMethodMonitorExitOffset_", declaredType="void*")
	public VoidPointer fast_jitMethodMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitMethodMonitorExitOffset_));
	}

	// void* fast_jitMethodMonitorExit
	public PointerPointer fast_jitMethodMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitMethodMonitorExitOffset_));
	}

	// void* fast_jitMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitMonitorEntryOffset_", declaredType="void*")
	public VoidPointer fast_jitMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitMonitorEntryOffset_));
	}

	// void* fast_jitMonitorEntry
	public PointerPointer fast_jitMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitMonitorEntryOffset_));
	}

	// void* fast_jitMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitMonitorExitOffset_", declaredType="void*")
	public VoidPointer fast_jitMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitMonitorExitOffset_));
	}

	// void* fast_jitMonitorExit
	public PointerPointer fast_jitMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitMonitorExitOffset_));
	}

	// void* fast_jitNewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewArrayOffset_", declaredType="void*")
	public VoidPointer fast_jitNewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewArrayOffset_));
	}

	// void* fast_jitNewArray
	public PointerPointer fast_jitNewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewArrayOffset_));
	}

	// void* fast_jitNewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer fast_jitNewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewArrayNoZeroInitOffset_));
	}

	// void* fast_jitNewArrayNoZeroInit
	public PointerPointer fast_jitNewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewArrayNoZeroInitOffset_));
	}

	// void* fast_jitNewObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewObjectOffset_", declaredType="void*")
	public VoidPointer fast_jitNewObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewObjectOffset_));
	}

	// void* fast_jitNewObject
	public PointerPointer fast_jitNewObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewObjectOffset_));
	}

	// void* fast_jitNewObjectNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewObjectNoZeroInitOffset_", declaredType="void*")
	public VoidPointer fast_jitNewObjectNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewObjectNoZeroInitOffset_));
	}

	// void* fast_jitNewObjectNoZeroInit
	public PointerPointer fast_jitNewObjectNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewObjectNoZeroInitOffset_));
	}

	// void* fast_jitNewValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewValueOffset_", declaredType="void*")
	public VoidPointer fast_jitNewValue() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewValueOffset_));
	}

	// void* fast_jitNewValue
	public PointerPointer fast_jitNewValueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewValueOffset_));
	}

	// void* fast_jitNewValueNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitNewValueNoZeroInitOffset_", declaredType="void*")
	public VoidPointer fast_jitNewValueNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitNewValueNoZeroInitOffset_));
	}

	// void* fast_jitNewValueNoZeroInit
	public PointerPointer fast_jitNewValueNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitNewValueNoZeroInitOffset_));
	}

	// void* fast_jitPostJNICallOffloadCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitPostJNICallOffloadCheckOffset_", declaredType="void*")
	public VoidPointer fast_jitPostJNICallOffloadCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitPostJNICallOffloadCheckOffset_));
	}

	// void* fast_jitPostJNICallOffloadCheck
	public PointerPointer fast_jitPostJNICallOffloadCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitPostJNICallOffloadCheckOffset_));
	}

	// void* fast_jitPreJNICallOffloadCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitPreJNICallOffloadCheckOffset_", declaredType="void*")
	public VoidPointer fast_jitPreJNICallOffloadCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitPreJNICallOffloadCheckOffset_));
	}

	// void* fast_jitPreJNICallOffloadCheck
	public PointerPointer fast_jitPreJNICallOffloadCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitPreJNICallOffloadCheckOffset_));
	}

	// void* fast_jitReleaseVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitReleaseVMAccessOffset_", declaredType="void*")
	public VoidPointer fast_jitReleaseVMAccess() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitReleaseVMAccessOffset_));
	}

	// void* fast_jitReleaseVMAccess
	public PointerPointer fast_jitReleaseVMAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitReleaseVMAccessOffset_));
	}

	// void* fast_jitTypeCheckArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitTypeCheckArrayStoreOffset_", declaredType="void*")
	public VoidPointer fast_jitTypeCheckArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitTypeCheckArrayStoreOffset_));
	}

	// void* fast_jitTypeCheckArrayStore
	public PointerPointer fast_jitTypeCheckArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitTypeCheckArrayStoreOffset_));
	}

	// void* fast_jitTypeCheckArrayStoreWithNullCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fast_jitTypeCheckArrayStoreWithNullCheckOffset_", declaredType="void*")
	public VoidPointer fast_jitTypeCheckArrayStoreWithNullCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._fast_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// void* fast_jitTypeCheckArrayStoreWithNullCheck
	public PointerPointer fast_jitTypeCheckArrayStoreWithNullCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._fast_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// UDATA fsdEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fsdEnabledOffset_", declaredType="UDATA")
	public UDATA fsdEnabled() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._fsdEnabledOffset_);
	}

	// UDATA fsdEnabled
	public UDATAPointer fsdEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._fsdEnabledOffset_));
	}

	// UDATA gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountOffset_", declaredType="UDATA")
	public UDATA gcCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._gcCountOffset_);
	}

	// UDATA gcCount
	public UDATAPointer gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._gcCountOffset_));
	}

	// UDATA gcOnResolveThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOnResolveThresholdOffset_", declaredType="UDATA")
	public UDATA gcOnResolveThreshold() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._gcOnResolveThresholdOffset_);
	}

	// UDATA gcOnResolveThreshold
	public UDATAPointer gcOnResolveThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._gcOnResolveThresholdOffset_));
	}

	// UDATA gcTraceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcTraceThresholdOffset_", declaredType="UDATA")
	public UDATA gcTraceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._gcTraceThresholdOffset_);
	}

	// UDATA gcTraceThreshold
	public UDATAPointer gcTraceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._gcTraceThresholdOffset_));
	}

	// void* getByteCodeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getByteCodeIndexOffset_", declaredType="void*")
	public VoidPointer getByteCodeIndex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getByteCodeIndexOffset_));
	}

	// void* getByteCodeIndex
	public PointerPointer getByteCodeIndexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getByteCodeIndexOffset_));
	}

	// void* getByteCodeIndexFromStackMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getByteCodeIndexFromStackMapOffset_", declaredType="void*")
	public VoidPointer getByteCodeIndexFromStackMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getByteCodeIndexFromStackMapOffset_));
	}

	// void* getByteCodeIndexFromStackMap
	public PointerPointer getByteCodeIndexFromStackMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getByteCodeIndexFromStackMapOffset_));
	}

	// void* getByteCodeIndexFromStackMapVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getByteCodeIndexFromStackMapVerboseOffset_", declaredType="void*")
	public VoidPointer getByteCodeIndexFromStackMapVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getByteCodeIndexFromStackMapVerboseOffset_));
	}

	// void* getByteCodeIndexFromStackMapVerbose
	public PointerPointer getByteCodeIndexFromStackMapVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getByteCodeIndexFromStackMapVerboseOffset_));
	}

	// void* getByteCodeIndexVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getByteCodeIndexVerboseOffset_", declaredType="void*")
	public VoidPointer getByteCodeIndexVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getByteCodeIndexVerboseOffset_));
	}

	// void* getByteCodeIndexVerbose
	public PointerPointer getByteCodeIndexVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getByteCodeIndexVerboseOffset_));
	}

	// void* getCryptoHardwareFeatures
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getCryptoHardwareFeaturesOffset_", declaredType="void*")
	public VoidPointer getCryptoHardwareFeatures() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getCryptoHardwareFeaturesOffset_));
	}

	// void* getCryptoHardwareFeatures
	public PointerPointer getCryptoHardwareFeaturesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getCryptoHardwareFeaturesOffset_));
	}

	// void* getCurrentByteCodeIndexAndIsSameReceiver
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getCurrentByteCodeIndexAndIsSameReceiverOffset_", declaredType="void*")
	public VoidPointer getCurrentByteCodeIndexAndIsSameReceiver() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getCurrentByteCodeIndexAndIsSameReceiverOffset_));
	}

	// void* getCurrentByteCodeIndexAndIsSameReceiver
	public PointerPointer getCurrentByteCodeIndexAndIsSameReceiverEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getCurrentByteCodeIndexAndIsSameReceiverOffset_));
	}

	// void* getCurrentByteCodeIndexAndIsSameReceiverVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getCurrentByteCodeIndexAndIsSameReceiverVerboseOffset_", declaredType="void*")
	public VoidPointer getCurrentByteCodeIndexAndIsSameReceiverVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getCurrentByteCodeIndexAndIsSameReceiverVerboseOffset_));
	}

	// void* getCurrentByteCodeIndexAndIsSameReceiverVerbose
	public PointerPointer getCurrentByteCodeIndexAndIsSameReceiverVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getCurrentByteCodeIndexAndIsSameReceiverVerboseOffset_));
	}

	// void* getFirstInlinedCallSite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFirstInlinedCallSiteOffset_", declaredType="void*")
	public VoidPointer getFirstInlinedCallSite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getFirstInlinedCallSiteOffset_));
	}

	// void* getFirstInlinedCallSite
	public PointerPointer getFirstInlinedCallSiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getFirstInlinedCallSiteOffset_));
	}

	// void* getFirstInlinedCallSiteVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getFirstInlinedCallSiteVerboseOffset_", declaredType="void*")
	public VoidPointer getFirstInlinedCallSiteVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getFirstInlinedCallSiteVerboseOffset_));
	}

	// void* getFirstInlinedCallSiteVerbose
	public PointerPointer getFirstInlinedCallSiteVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getFirstInlinedCallSiteVerboseOffset_));
	}

	// void* getInlinedMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getInlinedMethodOffset_", declaredType="void*")
	public VoidPointer getInlinedMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getInlinedMethodOffset_));
	}

	// void* getInlinedMethod
	public PointerPointer getInlinedMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getInlinedMethodOffset_));
	}

	// void* getInlinedMethodVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getInlinedMethodVerboseOffset_", declaredType="void*")
	public VoidPointer getInlinedMethodVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getInlinedMethodVerboseOffset_));
	}

	// void* getInlinedMethodVerbose
	public PointerPointer getInlinedMethodVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getInlinedMethodVerboseOffset_));
	}

	// void* getJitInlineDepthFromCallSite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitInlineDepthFromCallSiteOffset_", declaredType="void*")
	public VoidPointer getJitInlineDepthFromCallSite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitInlineDepthFromCallSiteOffset_));
	}

	// void* getJitInlineDepthFromCallSite
	public PointerPointer getJitInlineDepthFromCallSiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitInlineDepthFromCallSiteOffset_));
	}

	// void* getJitInlineDepthFromCallSiteVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitInlineDepthFromCallSiteVerboseOffset_", declaredType="void*")
	public VoidPointer getJitInlineDepthFromCallSiteVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitInlineDepthFromCallSiteVerboseOffset_));
	}

	// void* getJitInlineDepthFromCallSiteVerbose
	public PointerPointer getJitInlineDepthFromCallSiteVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitInlineDepthFromCallSiteVerboseOffset_));
	}

	// void* getJitInlinedCallInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitInlinedCallInfoOffset_", declaredType="void*")
	public VoidPointer getJitInlinedCallInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitInlinedCallInfoOffset_));
	}

	// void* getJitInlinedCallInfo
	public PointerPointer getJitInlinedCallInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitInlinedCallInfoOffset_));
	}

	// void* getJitInlinedCallInfoVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitInlinedCallInfoVerboseOffset_", declaredType="void*")
	public VoidPointer getJitInlinedCallInfoVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitInlinedCallInfoVerboseOffset_));
	}

	// void* getJitInlinedCallInfoVerbose
	public PointerPointer getJitInlinedCallInfoVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitInlinedCallInfoVerboseOffset_));
	}

	// void* getJitRegisterMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitRegisterMapOffset_", declaredType="void*")
	public VoidPointer getJitRegisterMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitRegisterMapOffset_));
	}

	// void* getJitRegisterMap
	public PointerPointer getJitRegisterMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitRegisterMapOffset_));
	}

	// void* getJitRegisterMapVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getJitRegisterMapVerboseOffset_", declaredType="void*")
	public VoidPointer getJitRegisterMapVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getJitRegisterMapVerboseOffset_));
	}

	// void* getJitRegisterMapVerbose
	public PointerPointer getJitRegisterMapVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getJitRegisterMapVerboseOffset_));
	}

	// void* getNextInlinedCallSite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getNextInlinedCallSiteOffset_", declaredType="void*")
	public VoidPointer getNextInlinedCallSite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getNextInlinedCallSiteOffset_));
	}

	// void* getNextInlinedCallSite
	public PointerPointer getNextInlinedCallSiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getNextInlinedCallSiteOffset_));
	}

	// void* getNextInlinedCallSiteVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getNextInlinedCallSiteVerboseOffset_", declaredType="void*")
	public VoidPointer getNextInlinedCallSiteVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getNextInlinedCallSiteVerboseOffset_));
	}

	// void* getNextInlinedCallSiteVerbose
	public PointerPointer getNextInlinedCallSiteVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getNextInlinedCallSiteVerboseOffset_));
	}

	// void* getStackMapFromJitPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStackMapFromJitPCOffset_", declaredType="void*")
	public VoidPointer getStackMapFromJitPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getStackMapFromJitPCOffset_));
	}

	// void* getStackMapFromJitPC
	public PointerPointer getStackMapFromJitPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getStackMapFromJitPCOffset_));
	}

	// void* getStackMapFromJitPCVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStackMapFromJitPCVerboseOffset_", declaredType="void*")
	public VoidPointer getStackMapFromJitPCVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._getStackMapFromJitPCVerboseOffset_));
	}

	// void* getStackMapFromJitPCVerbose
	public PointerPointer getStackMapFromJitPCVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._getStackMapFromJitPCVerboseOffset_));
	}

	// UDATA globalSampleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalSampleCountOffset_", declaredType="UDATA")
	public UDATA globalSampleCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._globalSampleCountOffset_);
	}

	// UDATA globalSampleCount
	public UDATAPointer globalSampleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._globalSampleCountOffset_));
	}

	// void* hasMoreInlinedMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasMoreInlinedMethodsOffset_", declaredType="void*")
	public VoidPointer hasMoreInlinedMethods() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._hasMoreInlinedMethodsOffset_));
	}

	// void* hasMoreInlinedMethods
	public PointerPointer hasMoreInlinedMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._hasMoreInlinedMethodsOffset_));
	}

	// void* hasMoreInlinedMethodsVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasMoreInlinedMethodsVerboseOffset_", declaredType="void*")
	public VoidPointer hasMoreInlinedMethodsVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._hasMoreInlinedMethodsVerboseOffset_));
	}

	// void* hasMoreInlinedMethodsVerbose
	public PointerPointer hasMoreInlinedMethodsVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._hasMoreInlinedMethodsVerboseOffset_));
	}

	// J9JITHookInterface hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInterfaceOffset_", declaredType="J9JITHookInterface")
	public J9JITHookInterfacePointer hookInterface() throws CorruptDataException {
		return J9JITHookInterfacePointer.cast(nonNullFieldEA(J9JITConfig._hookInterfaceOffset_));
	}

	// J9JITHookInterface hookInterface
	public PointerPointer hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._hookInterfaceOffset_));
	}

	// void* i2jMHTransition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i2jMHTransitionOffset_", declaredType="void*")
	public VoidPointer i2jMHTransition() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._i2jMHTransitionOffset_));
	}

	// void* i2jMHTransition
	public PointerPointer i2jMHTransitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._i2jMHTransitionOffset_));
	}

	// void* i2jReturnTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i2jReturnTableOffset_", declaredType="void*")
	public VoidPointer i2jReturnTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._i2jReturnTableOffset_));
	}

	// void* i2jReturnTable
	public PointerPointer i2jReturnTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._i2jReturnTableOffset_));
	}

	// void* i2jTransition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i2jTransitionOffset_", declaredType="void*")
	public VoidPointer i2jTransition() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._i2jTransitionOffset_));
	}

	// void* i2jTransition
	public PointerPointer i2jTransitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._i2jTransitionOffset_));
	}

	// UDATA inlineFieldWatches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlineFieldWatchesOffset_", declaredType="UDATA")
	public UDATA inlineFieldWatches() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._inlineFieldWatchesOffset_);
	}

	// UDATA inlineFieldWatches
	public UDATAPointer inlineFieldWatchesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._inlineFieldWatchesOffset_));
	}

	// UDATA inlineSizeLimit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlineSizeLimitOffset_", declaredType="UDATA")
	public UDATA inlineSizeLimit() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._inlineSizeLimitOffset_);
	}

	// UDATA inlineSizeLimit
	public UDATAPointer inlineSizeLimitEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._inlineSizeLimitOffset_));
	}

	// UDATA iprofilerBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iprofilerBufferSizeOffset_", declaredType="UDATA")
	public UDATA iprofilerBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._iprofilerBufferSizeOffset_);
	}

	// UDATA iprofilerBufferSize
	public UDATAPointer iprofilerBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._iprofilerBufferSizeOffset_));
	}

	// void* isAESSupportedByHardware
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isAESSupportedByHardwareOffset_", declaredType="void*")
	public VoidPointer isAESSupportedByHardware() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._isAESSupportedByHardwareOffset_));
	}

	// void* isAESSupportedByHardware
	public PointerPointer isAESSupportedByHardwareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._isAESSupportedByHardwareOffset_));
	}

	// void* isDLTReady
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isDLTReadyOffset_", declaredType="void*")
	public VoidPointer isDLTReady() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._isDLTReadyOffset_));
	}

	// void* isDLTReady
	public PointerPointer isDLTReadyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._isDLTReadyOffset_));
	}

	// void* j2iInvokeWithArguments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2iInvokeWithArgumentsOffset_", declaredType="void*")
	public VoidPointer j2iInvokeWithArguments() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._j2iInvokeWithArgumentsOffset_));
	}

	// void* j2iInvokeWithArguments
	public PointerPointer j2iInvokeWithArgumentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._j2iInvokeWithArgumentsOffset_));
	}

	// void* j9jit_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9jit_printfOffset_", declaredType="void*")
	public VoidPointer j9jit_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._j9jit_printfOffset_));
	}

	// void* j9jit_printf
	public PointerPointer j9jit_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._j9jit_printfOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JITConfig._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._javaVMOffset_));
	}

	// void* jitAddDecompilationForFramePop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitAddDecompilationForFramePopOffset_", declaredType="void*")
	public VoidPointer jitAddDecompilationForFramePop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitAddDecompilationForFramePopOffset_));
	}

	// void* jitAddDecompilationForFramePop
	public PointerPointer jitAddDecompilationForFramePopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitAddDecompilationForFramePopOffset_));
	}

	// void* jitCanResumeAtOSRPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCanResumeAtOSRPointOffset_", declaredType="void*")
	public VoidPointer jitCanResumeAtOSRPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitCanResumeAtOSRPointOffset_));
	}

	// void* jitCanResumeAtOSRPoint
	public PointerPointer jitCanResumeAtOSRPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitCanResumeAtOSRPointOffset_));
	}

	// void* jitCheckScavengeOnResolve
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCheckScavengeOnResolveOffset_", declaredType="void*")
	public VoidPointer jitCheckScavengeOnResolve() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitCheckScavengeOnResolveOffset_));
	}

	// void* jitCheckScavengeOnResolve
	public PointerPointer jitCheckScavengeOnResolveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitCheckScavengeOnResolveOffset_));
	}

	// void* jitClassesRedefined
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitClassesRedefinedOffset_", declaredType="void*")
	public VoidPointer jitClassesRedefined() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitClassesRedefinedOffset_));
	}

	// void* jitClassesRedefined
	public PointerPointer jitClassesRedefinedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitClassesRedefinedOffset_));
	}

	// void* jitCleanUpDecompilationStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCleanUpDecompilationStackOffset_", declaredType="void*")
	public VoidPointer jitCleanUpDecompilationStack() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitCleanUpDecompilationStackOffset_));
	}

	// void* jitCleanUpDecompilationStack
	public PointerPointer jitCleanUpDecompilationStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitCleanUpDecompilationStackOffset_));
	}

	// void* jitCodeBreakpointAdded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCodeBreakpointAddedOffset_", declaredType="void*")
	public VoidPointer jitCodeBreakpointAdded() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitCodeBreakpointAddedOffset_));
	}

	// void* jitCodeBreakpointAdded
	public PointerPointer jitCodeBreakpointAddedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitCodeBreakpointAddedOffset_));
	}

	// void* jitCodeBreakpointRemoved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCodeBreakpointRemovedOffset_", declaredType="void*")
	public VoidPointer jitCodeBreakpointRemoved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitCodeBreakpointRemovedOffset_));
	}

	// void* jitCodeBreakpointRemoved
	public PointerPointer jitCodeBreakpointRemovedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitCodeBreakpointRemovedOffset_));
	}

	// void* jitDataBreakpointAdded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitDataBreakpointAddedOffset_", declaredType="void*")
	public VoidPointer jitDataBreakpointAdded() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitDataBreakpointAddedOffset_));
	}

	// void* jitDataBreakpointAdded
	public PointerPointer jitDataBreakpointAddedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitDataBreakpointAddedOffset_));
	}

	// void* jitDataBreakpointRemoved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitDataBreakpointRemovedOffset_", declaredType="void*")
	public VoidPointer jitDataBreakpointRemoved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitDataBreakpointRemovedOffset_));
	}

	// void* jitDataBreakpointRemoved
	public PointerPointer jitDataBreakpointRemovedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitDataBreakpointRemovedOffset_));
	}

	// void* jitDecompileMethodForFramePop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitDecompileMethodForFramePopOffset_", declaredType="void*")
	public VoidPointer jitDecompileMethodForFramePop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitDecompileMethodForFramePopOffset_));
	}

	// void* jitDecompileMethodForFramePop
	public PointerPointer jitDecompileMethodForFramePopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitDecompileMethodForFramePopOffset_));
	}

	// void* jitDiscardPendingCompilationsOfNatives
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitDiscardPendingCompilationsOfNativesOffset_", declaredType="void*")
	public VoidPointer jitDiscardPendingCompilationsOfNatives() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitDiscardPendingCompilationsOfNativesOffset_));
	}

	// void* jitDiscardPendingCompilationsOfNatives
	public PointerPointer jitDiscardPendingCompilationsOfNativesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitDiscardPendingCompilationsOfNativesOffset_));
	}

	// void* jitExceptionCaught
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExceptionCaughtOffset_", declaredType="void*")
	public VoidPointer jitExceptionCaught() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExceptionCaughtOffset_));
	}

	// void* jitExceptionCaught
	public PointerPointer jitExceptionCaughtEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExceptionCaughtOffset_));
	}

	// void* jitExclusiveVMShutdownPending
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExclusiveVMShutdownPendingOffset_", declaredType="void*")
	public VoidPointer jitExclusiveVMShutdownPending() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExclusiveVMShutdownPendingOffset_));
	}

	// void* jitExclusiveVMShutdownPending
	public PointerPointer jitExclusiveVMShutdownPendingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExclusiveVMShutdownPendingOffset_));
	}

	// void* jitExitInterpreter0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExitInterpreter0Offset_", declaredType="void*")
	public VoidPointer jitExitInterpreter0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExitInterpreter0Offset_));
	}

	// void* jitExitInterpreter0
	public PointerPointer jitExitInterpreter0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExitInterpreter0Offset_));
	}

	// void* jitExitInterpreter1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExitInterpreter1Offset_", declaredType="void*")
	public VoidPointer jitExitInterpreter1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExitInterpreter1Offset_));
	}

	// void* jitExitInterpreter1
	public PointerPointer jitExitInterpreter1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExitInterpreter1Offset_));
	}

	// void* jitExitInterpreterD
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExitInterpreterDOffset_", declaredType="void*")
	public VoidPointer jitExitInterpreterD() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExitInterpreterDOffset_));
	}

	// void* jitExitInterpreterD
	public PointerPointer jitExitInterpreterDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExitInterpreterDOffset_));
	}

	// void* jitExitInterpreterF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExitInterpreterFOffset_", declaredType="void*")
	public VoidPointer jitExitInterpreterF() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExitInterpreterFOffset_));
	}

	// void* jitExitInterpreterF
	public PointerPointer jitExitInterpreterFEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExitInterpreterFOffset_));
	}

	// void* jitExitInterpreterJ
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExitInterpreterJOffset_", declaredType="void*")
	public VoidPointer jitExitInterpreterJ() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitExitInterpreterJOffset_));
	}

	// void* jitExitInterpreterJ
	public PointerPointer jitExitInterpreterJEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitExitInterpreterJOffset_));
	}

	// void* jitFillOSRBufferReturn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitFillOSRBufferReturnOffset_", declaredType="void*")
	public VoidPointer jitFillOSRBufferReturn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitFillOSRBufferReturnOffset_));
	}

	// void* jitFillOSRBufferReturn
	public PointerPointer jitFillOSRBufferReturnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitFillOSRBufferReturnOffset_));
	}

	// UDATA jitFloatReturnUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitFloatReturnUsageOffset_", declaredType="UDATA")
	public UDATA jitFloatReturnUsage() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._jitFloatReturnUsageOffset_);
	}

	// UDATA jitFloatReturnUsage
	public UDATAPointer jitFloatReturnUsageEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._jitFloatReturnUsageOffset_));
	}

	// void* jitFlushCompilationQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitFlushCompilationQueueOffset_", declaredType="void*")
	public VoidPointer jitFlushCompilationQueue() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitFlushCompilationQueueOffset_));
	}

	// void* jitFlushCompilationQueue
	public PointerPointer jitFlushCompilationQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitFlushCompilationQueueOffset_));
	}

	// void* jitFramePopNotificationAdded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitFramePopNotificationAddedOffset_", declaredType="void*")
	public VoidPointer jitFramePopNotificationAdded() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitFramePopNotificationAddedOffset_));
	}

	// void* jitFramePopNotificationAdded
	public PointerPointer jitFramePopNotificationAddedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitFramePopNotificationAddedOffset_));
	}

	// void* jitGetExceptionCatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetExceptionCatcherOffset_", declaredType="void*")
	public VoidPointer jitGetExceptionCatcher() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetExceptionCatcherOffset_));
	}

	// void* jitGetExceptionCatcher
	public PointerPointer jitGetExceptionCatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetExceptionCatcherOffset_));
	}

	// void* jitGetExceptionTableFromPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetExceptionTableFromPCOffset_", declaredType="void*")
	public VoidPointer jitGetExceptionTableFromPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetExceptionTableFromPCOffset_));
	}

	// void* jitGetExceptionTableFromPC
	public PointerPointer jitGetExceptionTableFromPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetExceptionTableFromPCOffset_));
	}

	// void* jitGetExceptionTableFromPCVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetExceptionTableFromPCVerboseOffset_", declaredType="void*")
	public VoidPointer jitGetExceptionTableFromPCVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetExceptionTableFromPCVerboseOffset_));
	}

	// void* jitGetExceptionTableFromPCVerbose
	public PointerPointer jitGetExceptionTableFromPCVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetExceptionTableFromPCVerboseOffset_));
	}

	// void* jitGetInlinerMapFromPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetInlinerMapFromPCOffset_", declaredType="void*")
	public VoidPointer jitGetInlinerMapFromPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetInlinerMapFromPCOffset_));
	}

	// void* jitGetInlinerMapFromPC
	public PointerPointer jitGetInlinerMapFromPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetInlinerMapFromPCOffset_));
	}

	// void* jitGetInlinerMapFromPCVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetInlinerMapFromPCVerboseOffset_", declaredType="void*")
	public VoidPointer jitGetInlinerMapFromPCVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetInlinerMapFromPCVerboseOffset_));
	}

	// void* jitGetInlinerMapFromPCVerbose
	public PointerPointer jitGetInlinerMapFromPCVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetInlinerMapFromPCVerboseOffset_));
	}

	// void* jitGetStackMapFromPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetStackMapFromPCOffset_", declaredType="void*")
	public VoidPointer jitGetStackMapFromPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetStackMapFromPCOffset_));
	}

	// void* jitGetStackMapFromPC
	public PointerPointer jitGetStackMapFromPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetStackMapFromPCOffset_));
	}

	// void* jitGetStackMapFromPCVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitGetStackMapFromPCVerboseOffset_", declaredType="void*")
	public VoidPointer jitGetStackMapFromPCVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitGetStackMapFromPCVerboseOffset_));
	}

	// void* jitGetStackMapFromPCVerbose
	public PointerPointer jitGetStackMapFromPCVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitGetStackMapFromPCVerboseOffset_));
	}

	// void* jitHookAboutToRunMain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitHookAboutToRunMainOffset_", declaredType="void*")
	public VoidPointer jitHookAboutToRunMain() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitHookAboutToRunMainOffset_));
	}

	// void* jitHookAboutToRunMain
	public PointerPointer jitHookAboutToRunMainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitHookAboutToRunMainOffset_));
	}

	// void* jitHotswapOccurred
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitHotswapOccurredOffset_", declaredType="void*")
	public VoidPointer jitHotswapOccurred() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitHotswapOccurredOffset_));
	}

	// void* jitHotswapOccurred
	public PointerPointer jitHotswapOccurredEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitHotswapOccurredOffset_));
	}

	// void* jitIllegalFinalFieldModification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitIllegalFinalFieldModificationOffset_", declaredType="void*")
	public VoidPointer jitIllegalFinalFieldModification() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitIllegalFinalFieldModificationOffset_));
	}

	// void* jitIllegalFinalFieldModification
	public PointerPointer jitIllegalFinalFieldModificationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitIllegalFinalFieldModificationOffset_));
	}

	// void* jitInstanceOf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitInstanceOfOffset_", declaredType="void*")
	public VoidPointer jitInstanceOf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitInstanceOfOffset_));
	}

	// void* jitInstanceOf
	public PointerPointer jitInstanceOfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitInstanceOfOffset_));
	}

	// const U8* jitLevelName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitLevelNameOffset_", declaredType="const U8*")
	public U8Pointer jitLevelName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._jitLevelNameOffset_));
	}

	// const U8* jitLevelName
	public PointerPointer jitLevelNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitLevelNameOffset_));
	}

	// void* jitLocalSlotAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitLocalSlotAddressOffset_", declaredType="void*")
	public VoidPointer jitLocalSlotAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitLocalSlotAddressOffset_));
	}

	// void* jitLocalSlotAddress
	public PointerPointer jitLocalSlotAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitLocalSlotAddressOffset_));
	}

	// void* jitMethodBreakpointed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitMethodBreakpointedOffset_", declaredType="void*")
	public VoidPointer jitMethodBreakpointed() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitMethodBreakpointedOffset_));
	}

	// void* jitMethodBreakpointed
	public PointerPointer jitMethodBreakpointedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitMethodBreakpointedOffset_));
	}

	// void* jitMethodUnbreakpointed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitMethodUnbreakpointedOffset_", declaredType="void*")
	public VoidPointer jitMethodUnbreakpointed() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitMethodUnbreakpointedOffset_));
	}

	// void* jitMethodUnbreakpointed
	public PointerPointer jitMethodUnbreakpointedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitMethodUnbreakpointedOffset_));
	}

	// void* jitOSRGetPatchPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitOSRGetPatchPointOffset_", declaredType="void*")
	public VoidPointer jitOSRGetPatchPoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitOSRGetPatchPointOffset_));
	}

	// void* jitOSRGetPatchPoint
	public PointerPointer jitOSRGetPatchPointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitOSRGetPatchPointOffset_));
	}

	// void* jitOSRPatchMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitOSRPatchMethodOffset_", declaredType="void*")
	public VoidPointer jitOSRPatchMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitOSRPatchMethodOffset_));
	}

	// void* jitOSRPatchMethod
	public PointerPointer jitOSRPatchMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitOSRPatchMethodOffset_));
	}

	// void* jitOSRUnpatchMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitOSRUnpatchMethodOffset_", declaredType="void*")
	public VoidPointer jitOSRUnpatchMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitOSRUnpatchMethodOffset_));
	}

	// void* jitOSRUnpatchMethod
	public PointerPointer jitOSRUnpatchMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitOSRUnpatchMethodOffset_));
	}

	// void* jitReportDynamicCodeLoadEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitReportDynamicCodeLoadEventsOffset_", declaredType="void*")
	public VoidPointer jitReportDynamicCodeLoadEvents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitReportDynamicCodeLoadEventsOffset_));
	}

	// void* jitReportDynamicCodeLoadEvents
	public PointerPointer jitReportDynamicCodeLoadEventsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitReportDynamicCodeLoadEventsOffset_));
	}

	// void* jitReportDynamicCodeLoadEventsVerbose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitReportDynamicCodeLoadEventsVerboseOffset_", declaredType="void*")
	public VoidPointer jitReportDynamicCodeLoadEventsVerbose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitReportDynamicCodeLoadEventsVerboseOffset_));
	}

	// void* jitReportDynamicCodeLoadEventsVerbose
	public PointerPointer jitReportDynamicCodeLoadEventsVerboseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitReportDynamicCodeLoadEventsVerboseOffset_));
	}

	// void* jitSendTargetTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitSendTargetTableOffset_", declaredType="void*")
	public VoidPointer jitSendTargetTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitSendTargetTableOffset_));
	}

	// void* jitSendTargetTable
	public PointerPointer jitSendTargetTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitSendTargetTableOffset_));
	}

	// void* jitSignalHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitSignalHandlerOffset_", declaredType="void*")
	public VoidPointer jitSignalHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitSignalHandlerOffset_));
	}

	// void* jitSignalHandler
	public PointerPointer jitSignalHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitSignalHandlerOffset_));
	}

	// void* jitSingleStepAdded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitSingleStepAddedOffset_", declaredType="void*")
	public VoidPointer jitSingleStepAdded() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitSingleStepAddedOffset_));
	}

	// void* jitSingleStepAdded
	public PointerPointer jitSingleStepAddedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitSingleStepAddedOffset_));
	}

	// void* jitSingleStepRemoved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitSingleStepRemovedOffset_", declaredType="void*")
	public VoidPointer jitSingleStepRemoved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitSingleStepRemovedOffset_));
	}

	// void* jitSingleStepRemoved
	public PointerPointer jitSingleStepRemovedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitSingleStepRemovedOffset_));
	}

	// void* jitStackLocalsModified
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitStackLocalsModifiedOffset_", declaredType="void*")
	public VoidPointer jitStackLocalsModified() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitStackLocalsModifiedOffset_));
	}

	// void* jitStackLocalsModified
	public PointerPointer jitStackLocalsModifiedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitStackLocalsModifiedOffset_));
	}

	// void* jitStatics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitStaticsOffset_", declaredType="void*")
	public VoidPointer jitStatics() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitStaticsOffset_));
	}

	// void* jitStatics
	public PointerPointer jitStaticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitStaticsOffset_));
	}

	// void* jitThrowArrayStoreExceptionWithIP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitThrowArrayStoreExceptionWithIPOffset_", declaredType="void*")
	public VoidPointer jitThrowArrayStoreExceptionWithIP() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitThrowArrayStoreExceptionWithIPOffset_));
	}

	// void* jitThrowArrayStoreExceptionWithIP
	public PointerPointer jitThrowArrayStoreExceptionWithIPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitThrowArrayStoreExceptionWithIPOffset_));
	}

	// void* jitToInterpreterThunks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitToInterpreterThunksOffset_", declaredType="void*")
	public VoidPointer jitToInterpreterThunks() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitToInterpreterThunksOffset_));
	}

	// void* jitToInterpreterThunks
	public PointerPointer jitToInterpreterThunksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitToInterpreterThunksOffset_));
	}

	// void* jitWriteBarrierBatchStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitWriteBarrierBatchStoreOffset_", declaredType="void*")
	public VoidPointer jitWriteBarrierBatchStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitWriteBarrierBatchStoreOffset_));
	}

	// void* jitWriteBarrierBatchStore
	public PointerPointer jitWriteBarrierBatchStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitWriteBarrierBatchStoreOffset_));
	}

	// void* jitWriteBarrierBatchStoreWithRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitWriteBarrierBatchStoreWithRangeOffset_", declaredType="void*")
	public VoidPointer jitWriteBarrierBatchStoreWithRange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitWriteBarrierBatchStoreWithRangeOffset_));
	}

	// void* jitWriteBarrierBatchStoreWithRange
	public PointerPointer jitWriteBarrierBatchStoreWithRangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitWriteBarrierBatchStoreWithRangeOffset_));
	}

	// void* jitWriteBarrierStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitWriteBarrierStoreOffset_", declaredType="void*")
	public VoidPointer jitWriteBarrierStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._jitWriteBarrierStoreOffset_));
	}

	// void* jitWriteBarrierStore
	public PointerPointer jitWriteBarrierStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._jitWriteBarrierStoreOffset_));
	}

	// UDATA largeCodePageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeCodePageFlagsOffset_", declaredType="UDATA")
	public UDATA largeCodePageFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._largeCodePageFlagsOffset_);
	}

	// UDATA largeCodePageFlags
	public UDATAPointer largeCodePageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._largeCodePageFlagsOffset_));
	}

	// UDATA largeCodePageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_largeCodePageSizeOffset_", declaredType="UDATA")
	public UDATA largeCodePageSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._largeCodePageSizeOffset_);
	}

	// UDATA largeCodePageSize
	public UDATAPointer largeCodePageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._largeCodePageSizeOffset_));
	}

	// UDATA lastExceptionTableAllocSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastExceptionTableAllocSizeOffset_", declaredType="UDATA")
	public UDATA lastExceptionTableAllocSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._lastExceptionTableAllocSizeOffset_);
	}

	// UDATA lastExceptionTableAllocSize
	public UDATAPointer lastExceptionTableAllocSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._lastExceptionTableAllocSizeOffset_));
	}

	// UDATA lastGCDataAllocSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGCDataAllocSizeOffset_", declaredType="UDATA")
	public UDATA lastGCDataAllocSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._lastGCDataAllocSizeOffset_);
	}

	// UDATA lastGCDataAllocSize
	public UDATAPointer lastGCDataAllocSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._lastGCDataAllocSizeOffset_));
	}

	// void* launchGPU
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_launchGPUOffset_", declaredType="void*")
	public VoidPointer launchGPU() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._launchGPUOffset_));
	}

	// void* launchGPU
	public PointerPointer launchGPUEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._launchGPUOffset_));
	}

	// void* loadPreservedAndBranch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadPreservedAndBranchOffset_", declaredType="void*")
	public VoidPointer loadPreservedAndBranch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._loadPreservedAndBranchOffset_));
	}

	// void* loadPreservedAndBranch
	public PointerPointer loadPreservedAndBranchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._loadPreservedAndBranchOffset_));
	}

	// U8* logFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_logFileNameOffset_", declaredType="U8*")
	public U8Pointer logFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._logFileNameOffset_));
	}

	// U8* logFileName
	public PointerPointer logFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._logFileNameOffset_));
	}

	// UDATA maxInlineDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxInlineDepthOffset_", declaredType="UDATA")
	public UDATA maxInlineDepth() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._maxInlineDepthOffset_);
	}

	// UDATA maxInlineDepth
	public UDATAPointer maxInlineDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._maxInlineDepthOffset_));
	}

	// UDATA messageNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_messageNumberOffset_", declaredType="UDATA")
	public UDATA messageNumber() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._messageNumberOffset_);
	}

	// UDATA messageNumber
	public UDATAPointer messageNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._messageNumberOffset_));
	}

	// UDATA messageThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_messageThresholdOffset_", declaredType="UDATA")
	public UDATA messageThreshold() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._messageThresholdOffset_);
	}

	// UDATA messageThreshold
	public UDATAPointer messageThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._messageThresholdOffset_));
	}

	// void* methodsToDelete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodsToDeleteOffset_", declaredType="void*")
	public VoidPointer methodsToDelete() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._methodsToDeleteOffset_));
	}

	// void* methodsToDelete
	public PointerPointer methodsToDeleteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._methodsToDeleteOffset_));
	}

	// omrthread_monitor_t mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JITConfig._mutexOffset_));
	}

	// omrthread_monitor_t mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._mutexOffset_));
	}

	// J9Method* newInstanceImplMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newInstanceImplMethodOffset_", declaredType="J9Method*")
	public J9MethodPointer newInstanceImplMethod() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JITConfig._newInstanceImplMethodOffset_));
	}

	// J9Method* newInstanceImplMethod
	public PointerPointer newInstanceImplMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._newInstanceImplMethodOffset_));
	}

	// void* old_fast_jitANewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitANewArrayOffset_", declaredType="void*")
	public VoidPointer old_fast_jitANewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitANewArrayOffset_));
	}

	// void* old_fast_jitANewArray
	public PointerPointer old_fast_jitANewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitANewArrayOffset_));
	}

	// void* old_fast_jitANewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitANewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_fast_jitANewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitANewArrayNoZeroInitOffset_));
	}

	// void* old_fast_jitANewArrayNoZeroInit
	public PointerPointer old_fast_jitANewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitANewArrayNoZeroInitOffset_));
	}

	// void* old_fast_jitAcmpHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitAcmpHelperOffset_", declaredType="void*")
	public VoidPointer old_fast_jitAcmpHelper() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitAcmpHelperOffset_));
	}

	// void* old_fast_jitAcmpHelper
	public PointerPointer old_fast_jitAcmpHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitAcmpHelperOffset_));
	}

	// void* old_fast_jitCheckCast
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitCheckCastOffset_", declaredType="void*")
	public VoidPointer old_fast_jitCheckCast() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitCheckCastOffset_));
	}

	// void* old_fast_jitCheckCast
	public PointerPointer old_fast_jitCheckCastEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitCheckCastOffset_));
	}

	// void* old_fast_jitCheckCastForArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitCheckCastForArrayStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitCheckCastForArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitCheckCastForArrayStoreOffset_));
	}

	// void* old_fast_jitCheckCastForArrayStore
	public PointerPointer old_fast_jitCheckCastForArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitCheckCastForArrayStoreOffset_));
	}

	// void* old_fast_jitCheckIfFinalizeObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitCheckIfFinalizeObjectOffset_", declaredType="void*")
	public VoidPointer old_fast_jitCheckIfFinalizeObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitCheckIfFinalizeObjectOffset_));
	}

	// void* old_fast_jitCheckIfFinalizeObject
	public PointerPointer old_fast_jitCheckIfFinalizeObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitCheckIfFinalizeObjectOffset_));
	}

	// void* old_fast_jitCollapseJNIReferenceFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitCollapseJNIReferenceFrameOffset_", declaredType="void*")
	public VoidPointer old_fast_jitCollapseJNIReferenceFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitCollapseJNIReferenceFrameOffset_));
	}

	// void* old_fast_jitCollapseJNIReferenceFrame
	public PointerPointer old_fast_jitCollapseJNIReferenceFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitCollapseJNIReferenceFrameOffset_));
	}

	// void* old_fast_jitGetFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitGetFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer old_fast_jitGetFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitGetFlattenableFieldOffset_));
	}

	// void* old_fast_jitGetFlattenableField
	public PointerPointer old_fast_jitGetFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitGetFlattenableFieldOffset_));
	}

	// void* old_fast_jitGetFlattenableStaticField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitGetFlattenableStaticFieldOffset_", declaredType="void*")
	public VoidPointer old_fast_jitGetFlattenableStaticField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitGetFlattenableStaticFieldOffset_));
	}

	// void* old_fast_jitGetFlattenableStaticField
	public PointerPointer old_fast_jitGetFlattenableStaticFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitGetFlattenableStaticFieldOffset_));
	}

	// void* old_fast_jitInstanceOf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitInstanceOfOffset_", declaredType="void*")
	public VoidPointer old_fast_jitInstanceOf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitInstanceOfOffset_));
	}

	// void* old_fast_jitInstanceOf
	public PointerPointer old_fast_jitInstanceOfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitInstanceOfOffset_));
	}

	// void* old_fast_jitLoadFlattenableArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitLoadFlattenableArrayElementOffset_", declaredType="void*")
	public VoidPointer old_fast_jitLoadFlattenableArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitLoadFlattenableArrayElementOffset_));
	}

	// void* old_fast_jitLoadFlattenableArrayElement
	public PointerPointer old_fast_jitLoadFlattenableArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitLoadFlattenableArrayElementOffset_));
	}

	// void* old_fast_jitLookupInterfaceMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitLookupInterfaceMethodOffset_", declaredType="void*")
	public VoidPointer old_fast_jitLookupInterfaceMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitLookupInterfaceMethodOffset_));
	}

	// void* old_fast_jitLookupInterfaceMethod
	public PointerPointer old_fast_jitLookupInterfaceMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitLookupInterfaceMethodOffset_));
	}

	// void* old_fast_jitMethodIsNative
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMethodIsNativeOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMethodIsNative() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMethodIsNativeOffset_));
	}

	// void* old_fast_jitMethodIsNative
	public PointerPointer old_fast_jitMethodIsNativeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMethodIsNativeOffset_));
	}

	// void* old_fast_jitMethodIsSync
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMethodIsSyncOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMethodIsSync() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMethodIsSyncOffset_));
	}

	// void* old_fast_jitMethodIsSync
	public PointerPointer old_fast_jitMethodIsSyncEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMethodIsSyncOffset_));
	}

	// void* old_fast_jitMethodMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMethodMonitorEntryOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMethodMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMethodMonitorEntryOffset_));
	}

	// void* old_fast_jitMethodMonitorEntry
	public PointerPointer old_fast_jitMethodMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMethodMonitorEntryOffset_));
	}

	// void* old_fast_jitMethodMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMethodMonitorExitOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMethodMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMethodMonitorExitOffset_));
	}

	// void* old_fast_jitMethodMonitorExit
	public PointerPointer old_fast_jitMethodMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMethodMonitorExitOffset_));
	}

	// void* old_fast_jitMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMonitorEntryOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMonitorEntryOffset_));
	}

	// void* old_fast_jitMonitorEntry
	public PointerPointer old_fast_jitMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMonitorEntryOffset_));
	}

	// void* old_fast_jitMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitMonitorExitOffset_", declaredType="void*")
	public VoidPointer old_fast_jitMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitMonitorExitOffset_));
	}

	// void* old_fast_jitMonitorExit
	public PointerPointer old_fast_jitMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitMonitorExitOffset_));
	}

	// void* old_fast_jitNewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitNewArrayOffset_", declaredType="void*")
	public VoidPointer old_fast_jitNewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitNewArrayOffset_));
	}

	// void* old_fast_jitNewArray
	public PointerPointer old_fast_jitNewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitNewArrayOffset_));
	}

	// void* old_fast_jitNewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitNewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_fast_jitNewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitNewArrayNoZeroInitOffset_));
	}

	// void* old_fast_jitNewArrayNoZeroInit
	public PointerPointer old_fast_jitNewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitNewArrayNoZeroInitOffset_));
	}

	// void* old_fast_jitNewObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitNewObjectOffset_", declaredType="void*")
	public VoidPointer old_fast_jitNewObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitNewObjectOffset_));
	}

	// void* old_fast_jitNewObject
	public PointerPointer old_fast_jitNewObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitNewObjectOffset_));
	}

	// void* old_fast_jitNewObjectNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitNewObjectNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_fast_jitNewObjectNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitNewObjectNoZeroInitOffset_));
	}

	// void* old_fast_jitNewObjectNoZeroInit
	public PointerPointer old_fast_jitNewObjectNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitNewObjectNoZeroInitOffset_));
	}

	// void* old_fast_jitObjectHashCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitObjectHashCodeOffset_", declaredType="void*")
	public VoidPointer old_fast_jitObjectHashCode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitObjectHashCodeOffset_));
	}

	// void* old_fast_jitObjectHashCode
	public PointerPointer old_fast_jitObjectHashCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitObjectHashCodeOffset_));
	}

	// void* old_fast_jitPutFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitPutFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer old_fast_jitPutFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitPutFlattenableFieldOffset_));
	}

	// void* old_fast_jitPutFlattenableField
	public PointerPointer old_fast_jitPutFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitPutFlattenableFieldOffset_));
	}

	// void* old_fast_jitPutFlattenableStaticField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitPutFlattenableStaticFieldOffset_", declaredType="void*")
	public VoidPointer old_fast_jitPutFlattenableStaticField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitPutFlattenableStaticFieldOffset_));
	}

	// void* old_fast_jitPutFlattenableStaticField
	public PointerPointer old_fast_jitPutFlattenableStaticFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitPutFlattenableStaticFieldOffset_));
	}

	// void* old_fast_jitResolvedFieldIsVolatile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitResolvedFieldIsVolatileOffset_", declaredType="void*")
	public VoidPointer old_fast_jitResolvedFieldIsVolatile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitResolvedFieldIsVolatileOffset_));
	}

	// void* old_fast_jitResolvedFieldIsVolatile
	public PointerPointer old_fast_jitResolvedFieldIsVolatileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitResolvedFieldIsVolatileOffset_));
	}

	// void* old_fast_jitStoreFlattenableArrayElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitStoreFlattenableArrayElementOffset_", declaredType="void*")
	public VoidPointer old_fast_jitStoreFlattenableArrayElement() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitStoreFlattenableArrayElementOffset_));
	}

	// void* old_fast_jitStoreFlattenableArrayElement
	public PointerPointer old_fast_jitStoreFlattenableArrayElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitStoreFlattenableArrayElementOffset_));
	}

	// void* old_fast_jitTypeCheckArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitTypeCheckArrayStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitTypeCheckArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitTypeCheckArrayStoreOffset_));
	}

	// void* old_fast_jitTypeCheckArrayStore
	public PointerPointer old_fast_jitTypeCheckArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitTypeCheckArrayStoreOffset_));
	}

	// void* old_fast_jitTypeCheckArrayStoreWithNullCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitTypeCheckArrayStoreWithNullCheckOffset_", declaredType="void*")
	public VoidPointer old_fast_jitTypeCheckArrayStoreWithNullCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// void* old_fast_jitTypeCheckArrayStoreWithNullCheck
	public PointerPointer old_fast_jitTypeCheckArrayStoreWithNullCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// void* old_fast_jitVolatileReadDouble
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitVolatileReadDoubleOffset_", declaredType="void*")
	public VoidPointer old_fast_jitVolatileReadDouble() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitVolatileReadDoubleOffset_));
	}

	// void* old_fast_jitVolatileReadDouble
	public PointerPointer old_fast_jitVolatileReadDoubleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitVolatileReadDoubleOffset_));
	}

	// void* old_fast_jitVolatileReadLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitVolatileReadLongOffset_", declaredType="void*")
	public VoidPointer old_fast_jitVolatileReadLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitVolatileReadLongOffset_));
	}

	// void* old_fast_jitVolatileReadLong
	public PointerPointer old_fast_jitVolatileReadLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitVolatileReadLongOffset_));
	}

	// void* old_fast_jitVolatileWriteDouble
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitVolatileWriteDoubleOffset_", declaredType="void*")
	public VoidPointer old_fast_jitVolatileWriteDouble() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitVolatileWriteDoubleOffset_));
	}

	// void* old_fast_jitVolatileWriteDouble
	public PointerPointer old_fast_jitVolatileWriteDoubleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitVolatileWriteDoubleOffset_));
	}

	// void* old_fast_jitVolatileWriteLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitVolatileWriteLongOffset_", declaredType="void*")
	public VoidPointer old_fast_jitVolatileWriteLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitVolatileWriteLongOffset_));
	}

	// void* old_fast_jitVolatileWriteLong
	public PointerPointer old_fast_jitVolatileWriteLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitVolatileWriteLongOffset_));
	}

	// void* old_fast_jitWithFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWithFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWithFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWithFlattenableFieldOffset_));
	}

	// void* old_fast_jitWithFlattenableField
	public PointerPointer old_fast_jitWithFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWithFlattenableFieldOffset_));
	}

	// void* old_fast_jitWriteBarrierBatchStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierBatchStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierBatchStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierBatchStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierBatchStore
	public PointerPointer old_fast_jitWriteBarrierBatchStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierBatchStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierBatchStoreWithRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierBatchStoreWithRangeOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierBatchStoreWithRange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierBatchStoreWithRangeOffset_));
	}

	// void* old_fast_jitWriteBarrierBatchStoreWithRange
	public PointerPointer old_fast_jitWriteBarrierBatchStoreWithRangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierBatchStoreWithRangeOffset_));
	}

	// void* old_fast_jitWriteBarrierClassStoreMetronome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierClassStoreMetronomeOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierClassStoreMetronome() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierClassStoreMetronomeOffset_));
	}

	// void* old_fast_jitWriteBarrierClassStoreMetronome
	public PointerPointer old_fast_jitWriteBarrierClassStoreMetronomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierClassStoreMetronomeOffset_));
	}

	// void* old_fast_jitWriteBarrierJ9ClassBatchStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierJ9ClassBatchStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierJ9ClassBatchStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierJ9ClassBatchStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierJ9ClassBatchStore
	public PointerPointer old_fast_jitWriteBarrierJ9ClassBatchStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierJ9ClassBatchStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierJ9ClassStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierJ9ClassStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierJ9ClassStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierJ9ClassStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierJ9ClassStore
	public PointerPointer old_fast_jitWriteBarrierJ9ClassStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierJ9ClassStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierStoreOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierStore
	public PointerPointer old_fast_jitWriteBarrierStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierStoreOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreGenerational
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierStoreGenerationalOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierStoreGenerational() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierStoreGenerationalOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreGenerational
	public PointerPointer old_fast_jitWriteBarrierStoreGenerationalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierStoreGenerationalOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMark() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMark
	public PointerPointer old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreMetronome
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_fast_jitWriteBarrierStoreMetronomeOffset_", declaredType="void*")
	public VoidPointer old_fast_jitWriteBarrierStoreMetronome() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_fast_jitWriteBarrierStoreMetronomeOffset_));
	}

	// void* old_fast_jitWriteBarrierStoreMetronome
	public PointerPointer old_fast_jitWriteBarrierStoreMetronomeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_fast_jitWriteBarrierStoreMetronomeOffset_));
	}

	// void* old_slow_icallVMprJavaSendPatchupVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_icallVMprJavaSendPatchupVirtualOffset_", declaredType="void*")
	public VoidPointer old_slow_icallVMprJavaSendPatchupVirtual() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_icallVMprJavaSendPatchupVirtualOffset_));
	}

	// void* old_slow_icallVMprJavaSendPatchupVirtual
	public PointerPointer old_slow_icallVMprJavaSendPatchupVirtualEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_icallVMprJavaSendPatchupVirtualOffset_));
	}

	// void* old_slow_jitAMultiNewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitAMultiNewArrayOffset_", declaredType="void*")
	public VoidPointer old_slow_jitAMultiNewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitAMultiNewArrayOffset_));
	}

	// void* old_slow_jitAMultiNewArray
	public PointerPointer old_slow_jitAMultiNewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitAMultiNewArrayOffset_));
	}

	// void* old_slow_jitANewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitANewArrayOffset_", declaredType="void*")
	public VoidPointer old_slow_jitANewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitANewArrayOffset_));
	}

	// void* old_slow_jitANewArray
	public PointerPointer old_slow_jitANewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitANewArrayOffset_));
	}

	// void* old_slow_jitANewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitANewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitANewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitANewArrayNoZeroInitOffset_));
	}

	// void* old_slow_jitANewArrayNoZeroInit
	public PointerPointer old_slow_jitANewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitANewArrayNoZeroInitOffset_));
	}

	// void* old_slow_jitCallCFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitCallCFunctionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitCallCFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitCallCFunctionOffset_));
	}

	// void* old_slow_jitCallCFunction
	public PointerPointer old_slow_jitCallCFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitCallCFunctionOffset_));
	}

	// void* old_slow_jitCallJitAddPicToPatchOnClassUnload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitCallJitAddPicToPatchOnClassUnloadOffset_", declaredType="void*")
	public VoidPointer old_slow_jitCallJitAddPicToPatchOnClassUnload() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitCallJitAddPicToPatchOnClassUnloadOffset_));
	}

	// void* old_slow_jitCallJitAddPicToPatchOnClassUnload
	public PointerPointer old_slow_jitCallJitAddPicToPatchOnClassUnloadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitCallJitAddPicToPatchOnClassUnloadOffset_));
	}

	// void* old_slow_jitCheckAsyncMessages
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitCheckAsyncMessagesOffset_", declaredType="void*")
	public VoidPointer old_slow_jitCheckAsyncMessages() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitCheckAsyncMessagesOffset_));
	}

	// void* old_slow_jitCheckAsyncMessages
	public PointerPointer old_slow_jitCheckAsyncMessagesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitCheckAsyncMessagesOffset_));
	}

	// void* old_slow_jitCheckCast
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitCheckCastOffset_", declaredType="void*")
	public VoidPointer old_slow_jitCheckCast() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitCheckCastOffset_));
	}

	// void* old_slow_jitCheckCast
	public PointerPointer old_slow_jitCheckCastEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitCheckCastOffset_));
	}

	// void* old_slow_jitCheckCastForArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitCheckCastForArrayStoreOffset_", declaredType="void*")
	public VoidPointer old_slow_jitCheckCastForArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitCheckCastForArrayStoreOffset_));
	}

	// void* old_slow_jitCheckCastForArrayStore
	public PointerPointer old_slow_jitCheckCastForArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitCheckCastForArrayStoreOffset_));
	}

	// void* old_slow_jitHandleArrayIndexOutOfBoundsTrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitHandleArrayIndexOutOfBoundsTrapOffset_", declaredType="void*")
	public VoidPointer old_slow_jitHandleArrayIndexOutOfBoundsTrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitHandleArrayIndexOutOfBoundsTrapOffset_));
	}

	// void* old_slow_jitHandleArrayIndexOutOfBoundsTrap
	public PointerPointer old_slow_jitHandleArrayIndexOutOfBoundsTrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitHandleArrayIndexOutOfBoundsTrapOffset_));
	}

	// void* old_slow_jitHandleIntegerDivideByZeroTrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitHandleIntegerDivideByZeroTrapOffset_", declaredType="void*")
	public VoidPointer old_slow_jitHandleIntegerDivideByZeroTrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitHandleIntegerDivideByZeroTrapOffset_));
	}

	// void* old_slow_jitHandleIntegerDivideByZeroTrap
	public PointerPointer old_slow_jitHandleIntegerDivideByZeroTrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitHandleIntegerDivideByZeroTrapOffset_));
	}

	// void* old_slow_jitHandleInternalErrorTrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitHandleInternalErrorTrapOffset_", declaredType="void*")
	public VoidPointer old_slow_jitHandleInternalErrorTrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitHandleInternalErrorTrapOffset_));
	}

	// void* old_slow_jitHandleInternalErrorTrap
	public PointerPointer old_slow_jitHandleInternalErrorTrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitHandleInternalErrorTrapOffset_));
	}

	// void* old_slow_jitHandleNullPointerExceptionTrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitHandleNullPointerExceptionTrapOffset_", declaredType="void*")
	public VoidPointer old_slow_jitHandleNullPointerExceptionTrap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitHandleNullPointerExceptionTrapOffset_));
	}

	// void* old_slow_jitHandleNullPointerExceptionTrap
	public PointerPointer old_slow_jitHandleNullPointerExceptionTrapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitHandleNullPointerExceptionTrapOffset_));
	}

	// void* old_slow_jitInduceOSRAtCurrentPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitInduceOSRAtCurrentPCOffset_", declaredType="void*")
	public VoidPointer old_slow_jitInduceOSRAtCurrentPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitInduceOSRAtCurrentPCOffset_));
	}

	// void* old_slow_jitInduceOSRAtCurrentPC
	public PointerPointer old_slow_jitInduceOSRAtCurrentPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitInduceOSRAtCurrentPCOffset_));
	}

	// void* old_slow_jitInduceOSRAtCurrentPCAndRecompile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitInduceOSRAtCurrentPCAndRecompileOffset_", declaredType="void*")
	public VoidPointer old_slow_jitInduceOSRAtCurrentPCAndRecompile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitInduceOSRAtCurrentPCAndRecompileOffset_));
	}

	// void* old_slow_jitInduceOSRAtCurrentPCAndRecompile
	public PointerPointer old_slow_jitInduceOSRAtCurrentPCAndRecompileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitInduceOSRAtCurrentPCAndRecompileOffset_));
	}

	// void* old_slow_jitInterpretNewInstanceMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitInterpretNewInstanceMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitInterpretNewInstanceMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitInterpretNewInstanceMethodOffset_));
	}

	// void* old_slow_jitInterpretNewInstanceMethod
	public PointerPointer old_slow_jitInterpretNewInstanceMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitInterpretNewInstanceMethodOffset_));
	}

	// void* old_slow_jitLookupInterfaceMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitLookupInterfaceMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitLookupInterfaceMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitLookupInterfaceMethodOffset_));
	}

	// void* old_slow_jitLookupInterfaceMethod
	public PointerPointer old_slow_jitLookupInterfaceMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitLookupInterfaceMethodOffset_));
	}

	// void* old_slow_jitMethodMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitMethodMonitorEntryOffset_", declaredType="void*")
	public VoidPointer old_slow_jitMethodMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitMethodMonitorEntryOffset_));
	}

	// void* old_slow_jitMethodMonitorEntry
	public PointerPointer old_slow_jitMethodMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitMethodMonitorEntryOffset_));
	}

	// void* old_slow_jitMethodMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitMethodMonitorExitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitMethodMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitMethodMonitorExitOffset_));
	}

	// void* old_slow_jitMethodMonitorExit
	public PointerPointer old_slow_jitMethodMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitMethodMonitorExitOffset_));
	}

	// void* old_slow_jitMonitorEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitMonitorEntryOffset_", declaredType="void*")
	public VoidPointer old_slow_jitMonitorEntry() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitMonitorEntryOffset_));
	}

	// void* old_slow_jitMonitorEntry
	public PointerPointer old_slow_jitMonitorEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitMonitorEntryOffset_));
	}

	// void* old_slow_jitMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitMonitorExitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitMonitorExitOffset_));
	}

	// void* old_slow_jitMonitorExit
	public PointerPointer old_slow_jitMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitMonitorExitOffset_));
	}

	// void* old_slow_jitNewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitNewArrayOffset_", declaredType="void*")
	public VoidPointer old_slow_jitNewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitNewArrayOffset_));
	}

	// void* old_slow_jitNewArray
	public PointerPointer old_slow_jitNewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitNewArrayOffset_));
	}

	// void* old_slow_jitNewArrayNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitNewArrayNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitNewArrayNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitNewArrayNoZeroInitOffset_));
	}

	// void* old_slow_jitNewArrayNoZeroInit
	public PointerPointer old_slow_jitNewArrayNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitNewArrayNoZeroInitOffset_));
	}

	// void* old_slow_jitNewInstanceImplAccessCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitNewInstanceImplAccessCheckOffset_", declaredType="void*")
	public VoidPointer old_slow_jitNewInstanceImplAccessCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitNewInstanceImplAccessCheckOffset_));
	}

	// void* old_slow_jitNewInstanceImplAccessCheck
	public PointerPointer old_slow_jitNewInstanceImplAccessCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitNewInstanceImplAccessCheckOffset_));
	}

	// void* old_slow_jitNewObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitNewObjectOffset_", declaredType="void*")
	public VoidPointer old_slow_jitNewObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitNewObjectOffset_));
	}

	// void* old_slow_jitNewObject
	public PointerPointer old_slow_jitNewObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitNewObjectOffset_));
	}

	// void* old_slow_jitNewObjectNoZeroInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitNewObjectNoZeroInitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitNewObjectNoZeroInit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitNewObjectNoZeroInitOffset_));
	}

	// void* old_slow_jitNewObjectNoZeroInit
	public PointerPointer old_slow_jitNewObjectNoZeroInitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitNewObjectNoZeroInitOffset_));
	}

	// void* old_slow_jitReportFinalFieldModified
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportFinalFieldModifiedOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportFinalFieldModified() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportFinalFieldModifiedOffset_));
	}

	// void* old_slow_jitReportFinalFieldModified
	public PointerPointer old_slow_jitReportFinalFieldModifiedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportFinalFieldModifiedOffset_));
	}

	// void* old_slow_jitReportInstanceFieldRead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportInstanceFieldReadOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportInstanceFieldRead() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportInstanceFieldReadOffset_));
	}

	// void* old_slow_jitReportInstanceFieldRead
	public PointerPointer old_slow_jitReportInstanceFieldReadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportInstanceFieldReadOffset_));
	}

	// void* old_slow_jitReportInstanceFieldWrite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportInstanceFieldWriteOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportInstanceFieldWrite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportInstanceFieldWriteOffset_));
	}

	// void* old_slow_jitReportInstanceFieldWrite
	public PointerPointer old_slow_jitReportInstanceFieldWriteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportInstanceFieldWriteOffset_));
	}

	// void* old_slow_jitReportMethodEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportMethodEnterOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportMethodEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportMethodEnterOffset_));
	}

	// void* old_slow_jitReportMethodEnter
	public PointerPointer old_slow_jitReportMethodEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportMethodEnterOffset_));
	}

	// void* old_slow_jitReportMethodExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportMethodExitOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportMethodExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportMethodExitOffset_));
	}

	// void* old_slow_jitReportMethodExit
	public PointerPointer old_slow_jitReportMethodExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportMethodExitOffset_));
	}

	// void* old_slow_jitReportStaticFieldRead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportStaticFieldReadOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportStaticFieldRead() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportStaticFieldReadOffset_));
	}

	// void* old_slow_jitReportStaticFieldRead
	public PointerPointer old_slow_jitReportStaticFieldReadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportStaticFieldReadOffset_));
	}

	// void* old_slow_jitReportStaticFieldWrite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportStaticFieldWriteOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportStaticFieldWrite() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportStaticFieldWriteOffset_));
	}

	// void* old_slow_jitReportStaticFieldWrite
	public PointerPointer old_slow_jitReportStaticFieldWriteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportStaticFieldWriteOffset_));
	}

	// void* old_slow_jitReportStaticMethodEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitReportStaticMethodEnterOffset_", declaredType="void*")
	public VoidPointer old_slow_jitReportStaticMethodEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitReportStaticMethodEnterOffset_));
	}

	// void* old_slow_jitReportStaticMethodEnter
	public PointerPointer old_slow_jitReportStaticMethodEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitReportStaticMethodEnterOffset_));
	}

	// void* old_slow_jitResolveClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveClassOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveClassOffset_));
	}

	// void* old_slow_jitResolveClass
	public PointerPointer old_slow_jitResolveClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveClassOffset_));
	}

	// void* old_slow_jitResolveClassFromStaticField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveClassFromStaticFieldOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveClassFromStaticField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveClassFromStaticFieldOffset_));
	}

	// void* old_slow_jitResolveClassFromStaticField
	public PointerPointer old_slow_jitResolveClassFromStaticFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveClassFromStaticFieldOffset_));
	}

	// void* old_slow_jitResolveConstantDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveConstantDynamicOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveConstantDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveConstantDynamicOffset_));
	}

	// void* old_slow_jitResolveConstantDynamic
	public PointerPointer old_slow_jitResolveConstantDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveConstantDynamicOffset_));
	}

	// void* old_slow_jitResolveField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveFieldOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveFieldOffset_));
	}

	// void* old_slow_jitResolveField
	public PointerPointer old_slow_jitResolveFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveFieldOffset_));
	}

	// void* old_slow_jitResolveFieldDirect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveFieldDirectOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveFieldDirect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveFieldDirectOffset_));
	}

	// void* old_slow_jitResolveFieldDirect
	public PointerPointer old_slow_jitResolveFieldDirectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveFieldDirectOffset_));
	}

	// void* old_slow_jitResolveFieldSetter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveFieldSetterOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveFieldSetter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveFieldSetterOffset_));
	}

	// void* old_slow_jitResolveFieldSetter
	public PointerPointer old_slow_jitResolveFieldSetterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveFieldSetterOffset_));
	}

	// void* old_slow_jitResolveFieldSetterDirect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveFieldSetterDirectOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveFieldSetterDirect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveFieldSetterDirectOffset_));
	}

	// void* old_slow_jitResolveFieldSetterDirect
	public PointerPointer old_slow_jitResolveFieldSetterDirectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveFieldSetterDirectOffset_));
	}

	// void* old_slow_jitResolveFlattenableField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveFlattenableFieldOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveFlattenableField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveFlattenableFieldOffset_));
	}

	// void* old_slow_jitResolveFlattenableField
	public PointerPointer old_slow_jitResolveFlattenableFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveFlattenableFieldOffset_));
	}

	// void* old_slow_jitResolveHandleMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveHandleMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveHandleMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveHandleMethodOffset_));
	}

	// void* old_slow_jitResolveHandleMethod
	public PointerPointer old_slow_jitResolveHandleMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveHandleMethodOffset_));
	}

	// void* old_slow_jitResolveInterfaceMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveInterfaceMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveInterfaceMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveInterfaceMethodOffset_));
	}

	// void* old_slow_jitResolveInterfaceMethod
	public PointerPointer old_slow_jitResolveInterfaceMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveInterfaceMethodOffset_));
	}

	// void* old_slow_jitResolveInvokeDynamic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveInvokeDynamicOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveInvokeDynamic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveInvokeDynamicOffset_));
	}

	// void* old_slow_jitResolveInvokeDynamic
	public PointerPointer old_slow_jitResolveInvokeDynamicEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveInvokeDynamicOffset_));
	}

	// void* old_slow_jitResolveMethodHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveMethodHandleOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveMethodHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveMethodHandleOffset_));
	}

	// void* old_slow_jitResolveMethodHandle
	public PointerPointer old_slow_jitResolveMethodHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveMethodHandleOffset_));
	}

	// void* old_slow_jitResolveMethodType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveMethodTypeOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveMethodType() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveMethodTypeOffset_));
	}

	// void* old_slow_jitResolveMethodType
	public PointerPointer old_slow_jitResolveMethodTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveMethodTypeOffset_));
	}

	// void* old_slow_jitResolveSpecialMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveSpecialMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveSpecialMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveSpecialMethodOffset_));
	}

	// void* old_slow_jitResolveSpecialMethod
	public PointerPointer old_slow_jitResolveSpecialMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveSpecialMethodOffset_));
	}

	// void* old_slow_jitResolveStaticField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStaticFieldOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveStaticField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStaticFieldOffset_));
	}

	// void* old_slow_jitResolveStaticField
	public PointerPointer old_slow_jitResolveStaticFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStaticFieldOffset_));
	}

	// void* old_slow_jitResolveStaticFieldDirect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStaticFieldDirectOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveStaticFieldDirect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStaticFieldDirectOffset_));
	}

	// void* old_slow_jitResolveStaticFieldDirect
	public PointerPointer old_slow_jitResolveStaticFieldDirectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStaticFieldDirectOffset_));
	}

	// void* old_slow_jitResolveStaticFieldSetter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStaticFieldSetterOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveStaticFieldSetter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStaticFieldSetterOffset_));
	}

	// void* old_slow_jitResolveStaticFieldSetter
	public PointerPointer old_slow_jitResolveStaticFieldSetterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStaticFieldSetterOffset_));
	}

	// void* old_slow_jitResolveStaticFieldSetterDirect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStaticFieldSetterDirectOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveStaticFieldSetterDirect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStaticFieldSetterDirectOffset_));
	}

	// void* old_slow_jitResolveStaticFieldSetterDirect
	public PointerPointer old_slow_jitResolveStaticFieldSetterDirectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStaticFieldSetterDirectOffset_));
	}

	// void* old_slow_jitResolveStaticMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStaticMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveStaticMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStaticMethodOffset_));
	}

	// void* old_slow_jitResolveStaticMethod
	public PointerPointer old_slow_jitResolveStaticMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStaticMethodOffset_));
	}

	// void* old_slow_jitResolveString
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveStringOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveString() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveStringOffset_));
	}

	// void* old_slow_jitResolveString
	public PointerPointer old_slow_jitResolveStringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveStringOffset_));
	}

	// void* old_slow_jitResolveVirtualMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitResolveVirtualMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitResolveVirtualMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitResolveVirtualMethodOffset_));
	}

	// void* old_slow_jitResolveVirtualMethod
	public PointerPointer old_slow_jitResolveVirtualMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitResolveVirtualMethodOffset_));
	}

	// void* old_slow_jitRetranslateCaller
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitRetranslateCallerOffset_", declaredType="void*")
	public VoidPointer old_slow_jitRetranslateCaller() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitRetranslateCallerOffset_));
	}

	// void* old_slow_jitRetranslateCaller
	public PointerPointer old_slow_jitRetranslateCallerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitRetranslateCallerOffset_));
	}

	// void* old_slow_jitRetranslateCallerWithPreparation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitRetranslateCallerWithPreparationOffset_", declaredType="void*")
	public VoidPointer old_slow_jitRetranslateCallerWithPreparation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitRetranslateCallerWithPreparationOffset_));
	}

	// void* old_slow_jitRetranslateCallerWithPreparation
	public PointerPointer old_slow_jitRetranslateCallerWithPreparationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitRetranslateCallerWithPreparationOffset_));
	}

	// void* old_slow_jitRetranslateMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitRetranslateMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitRetranslateMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitRetranslateMethodOffset_));
	}

	// void* old_slow_jitRetranslateMethod
	public PointerPointer old_slow_jitRetranslateMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitRetranslateMethodOffset_));
	}

	// void* old_slow_jitStackOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitStackOverflowOffset_", declaredType="void*")
	public VoidPointer old_slow_jitStackOverflow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitStackOverflowOffset_));
	}

	// void* old_slow_jitStackOverflow
	public PointerPointer old_slow_jitStackOverflowEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitStackOverflowOffset_));
	}

	// void* old_slow_jitThrowAbstractMethodError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowAbstractMethodErrorOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowAbstractMethodError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowAbstractMethodErrorOffset_));
	}

	// void* old_slow_jitThrowAbstractMethodError
	public PointerPointer old_slow_jitThrowAbstractMethodErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowAbstractMethodErrorOffset_));
	}

	// void* old_slow_jitThrowArithmeticException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowArithmeticExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowArithmeticException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowArithmeticExceptionOffset_));
	}

	// void* old_slow_jitThrowArithmeticException
	public PointerPointer old_slow_jitThrowArithmeticExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowArithmeticExceptionOffset_));
	}

	// void* old_slow_jitThrowArrayIndexOutOfBounds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowArrayIndexOutOfBoundsOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowArrayIndexOutOfBounds() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowArrayIndexOutOfBoundsOffset_));
	}

	// void* old_slow_jitThrowArrayIndexOutOfBounds
	public PointerPointer old_slow_jitThrowArrayIndexOutOfBoundsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowArrayIndexOutOfBoundsOffset_));
	}

	// void* old_slow_jitThrowArrayStoreException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowArrayStoreExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowArrayStoreException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowArrayStoreExceptionOffset_));
	}

	// void* old_slow_jitThrowArrayStoreException
	public PointerPointer old_slow_jitThrowArrayStoreExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowArrayStoreExceptionOffset_));
	}

	// void* old_slow_jitThrowArrayStoreExceptionWithIP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowArrayStoreExceptionWithIPOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowArrayStoreExceptionWithIP() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowArrayStoreExceptionWithIPOffset_));
	}

	// void* old_slow_jitThrowArrayStoreExceptionWithIP
	public PointerPointer old_slow_jitThrowArrayStoreExceptionWithIPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowArrayStoreExceptionWithIPOffset_));
	}

	// void* old_slow_jitThrowCurrentException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowCurrentExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowCurrentException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowCurrentExceptionOffset_));
	}

	// void* old_slow_jitThrowCurrentException
	public PointerPointer old_slow_jitThrowCurrentExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowCurrentExceptionOffset_));
	}

	// void* old_slow_jitThrowException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowExceptionOffset_));
	}

	// void* old_slow_jitThrowException
	public PointerPointer old_slow_jitThrowExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowExceptionOffset_));
	}

	// void* old_slow_jitThrowExceptionInInitializerError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowExceptionInInitializerErrorOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowExceptionInInitializerError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowExceptionInInitializerErrorOffset_));
	}

	// void* old_slow_jitThrowExceptionInInitializerError
	public PointerPointer old_slow_jitThrowExceptionInInitializerErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowExceptionInInitializerErrorOffset_));
	}

	// void* old_slow_jitThrowIllegalAccessError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowIllegalAccessErrorOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowIllegalAccessError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowIllegalAccessErrorOffset_));
	}

	// void* old_slow_jitThrowIllegalAccessError
	public PointerPointer old_slow_jitThrowIllegalAccessErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowIllegalAccessErrorOffset_));
	}

	// void* old_slow_jitThrowIncompatibleClassChangeError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowIncompatibleClassChangeErrorOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowIncompatibleClassChangeError() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowIncompatibleClassChangeErrorOffset_));
	}

	// void* old_slow_jitThrowIncompatibleClassChangeError
	public PointerPointer old_slow_jitThrowIncompatibleClassChangeErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowIncompatibleClassChangeErrorOffset_));
	}

	// void* old_slow_jitThrowIncompatibleReceiver
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowIncompatibleReceiverOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowIncompatibleReceiver() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowIncompatibleReceiverOffset_));
	}

	// void* old_slow_jitThrowIncompatibleReceiver
	public PointerPointer old_slow_jitThrowIncompatibleReceiverEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowIncompatibleReceiverOffset_));
	}

	// void* old_slow_jitThrowInstantiationException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowInstantiationExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowInstantiationException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowInstantiationExceptionOffset_));
	}

	// void* old_slow_jitThrowInstantiationException
	public PointerPointer old_slow_jitThrowInstantiationExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowInstantiationExceptionOffset_));
	}

	// void* old_slow_jitThrowNullPointerException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowNullPointerExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowNullPointerException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowNullPointerExceptionOffset_));
	}

	// void* old_slow_jitThrowNullPointerException
	public PointerPointer old_slow_jitThrowNullPointerExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowNullPointerExceptionOffset_));
	}

	// void* old_slow_jitThrowUnreportedException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowUnreportedExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowUnreportedException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowUnreportedExceptionOffset_));
	}

	// void* old_slow_jitThrowUnreportedException
	public PointerPointer old_slow_jitThrowUnreportedExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowUnreportedExceptionOffset_));
	}

	// void* old_slow_jitThrowWrongMethodTypeException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitThrowWrongMethodTypeExceptionOffset_", declaredType="void*")
	public VoidPointer old_slow_jitThrowWrongMethodTypeException() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitThrowWrongMethodTypeExceptionOffset_));
	}

	// void* old_slow_jitThrowWrongMethodTypeException
	public PointerPointer old_slow_jitThrowWrongMethodTypeExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitThrowWrongMethodTypeExceptionOffset_));
	}

	// void* old_slow_jitTranslateNewInstanceMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitTranslateNewInstanceMethodOffset_", declaredType="void*")
	public VoidPointer old_slow_jitTranslateNewInstanceMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitTranslateNewInstanceMethodOffset_));
	}

	// void* old_slow_jitTranslateNewInstanceMethod
	public PointerPointer old_slow_jitTranslateNewInstanceMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitTranslateNewInstanceMethodOffset_));
	}

	// void* old_slow_jitTypeCheckArrayStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitTypeCheckArrayStoreOffset_", declaredType="void*")
	public VoidPointer old_slow_jitTypeCheckArrayStore() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitTypeCheckArrayStoreOffset_));
	}

	// void* old_slow_jitTypeCheckArrayStore
	public PointerPointer old_slow_jitTypeCheckArrayStoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitTypeCheckArrayStoreOffset_));
	}

	// void* old_slow_jitTypeCheckArrayStoreWithNullCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_slow_jitTypeCheckArrayStoreWithNullCheckOffset_", declaredType="void*")
	public VoidPointer old_slow_jitTypeCheckArrayStoreWithNullCheck() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._old_slow_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// void* old_slow_jitTypeCheckArrayStoreWithNullCheck
	public PointerPointer old_slow_jitTypeCheckArrayStoreWithNullCheckEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._old_slow_jitTypeCheckArrayStoreWithNullCheckOffset_));
	}

	// UDATA osrFramesMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrFramesMaximumSizeOffset_", declaredType="UDATA")
	public UDATA osrFramesMaximumSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._osrFramesMaximumSizeOffset_);
	}

	// UDATA osrFramesMaximumSize
	public UDATAPointer osrFramesMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._osrFramesMaximumSizeOffset_));
	}

	// UDATA osrScratchBufferMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrScratchBufferMaximumSizeOffset_", declaredType="UDATA")
	public UDATA osrScratchBufferMaximumSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._osrScratchBufferMaximumSizeOffset_);
	}

	// UDATA osrScratchBufferMaximumSize
	public UDATAPointer osrScratchBufferMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._osrScratchBufferMaximumSizeOffset_));
	}

	// UDATA osrStackFrameMaximumSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrStackFrameMaximumSizeOffset_", declaredType="UDATA")
	public UDATA osrStackFrameMaximumSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._osrStackFrameMaximumSizeOffset_);
	}

	// UDATA osrStackFrameMaximumSize
	public UDATAPointer osrStackFrameMaximumSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._osrStackFrameMaximumSizeOffset_));
	}

	// void* outOfMemoryJumpBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_outOfMemoryJumpBufferOffset_", declaredType="void*")
	public VoidPointer outOfMemoryJumpBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._outOfMemoryJumpBufferOffset_));
	}

	// void* outOfMemoryJumpBuffer
	public PointerPointer outOfMemoryJumpBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._outOfMemoryJumpBufferOffset_));
	}

	// void* patchupVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_patchupVirtualOffset_", declaredType="void*")
	public VoidPointer patchupVirtual() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._patchupVirtualOffset_));
	}

	// void* patchupVirtual
	public PointerPointer patchupVirtualEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._patchupVirtualOffset_));
	}

	// void* performDLT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_performDLTOffset_", declaredType="void*")
	public VoidPointer performDLT() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._performDLTOffset_));
	}

	// void* performDLT
	public PointerPointer performDLTEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._performDLTOffset_));
	}

	// U8* preScavengeAllocateHeapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preScavengeAllocateHeapAllocOffset_", declaredType="U8*")
	public U8Pointer preScavengeAllocateHeapAlloc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._preScavengeAllocateHeapAllocOffset_));
	}

	// U8* preScavengeAllocateHeapAlloc
	public PointerPointer preScavengeAllocateHeapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._preScavengeAllocateHeapAllocOffset_));
	}

	// U8* preScavengeAllocateHeapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preScavengeAllocateHeapBaseOffset_", declaredType="U8*")
	public U8Pointer preScavengeAllocateHeapBase() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._preScavengeAllocateHeapBaseOffset_));
	}

	// U8* preScavengeAllocateHeapBase
	public PointerPointer preScavengeAllocateHeapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._preScavengeAllocateHeapBaseOffset_));
	}

	// void* printAOTHeaderProcessorFeatures
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printAOTHeaderProcessorFeaturesOffset_", declaredType="void*")
	public VoidPointer printAOTHeaderProcessorFeatures() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._printAOTHeaderProcessorFeaturesOffset_));
	}

	// void* printAOTHeaderProcessorFeatures
	public PointerPointer printAOTHeaderProcessorFeaturesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._printAOTHeaderProcessorFeaturesOffset_));
	}

	// void* privateConfig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_privateConfigOffset_", declaredType="void*")
	public VoidPointer privateConfig() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._privateConfigOffset_));
	}

	// void* privateConfig
	public PointerPointer privateConfigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._privateConfigOffset_));
	}

	// void* processorInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processorInfoOffset_", declaredType="void*")
	public VoidPointer processorInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._processorInfoOffset_));
	}

	// void* processorInfo
	public PointerPointer processorInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._processorInfoOffset_));
	}

	// void* promoteGPUCompile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_promoteGPUCompileOffset_", declaredType="void*")
	public VoidPointer promoteGPUCompile() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._promoteGPUCompileOffset_));
	}

	// void* promoteGPUCompile
	public PointerPointer promoteGPUCompileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._promoteGPUCompileOffset_));
	}

	// void* pseudoTOC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pseudoTOCOffset_", declaredType="void*")
	public VoidPointer pseudoTOC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._pseudoTOCOffset_));
	}

	// void* pseudoTOC
	public PointerPointer pseudoTOCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._pseudoTOCOffset_));
	}

	// OMRProcessorDesc relocatableTargetProcessor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_relocatableTargetProcessorOffset_", declaredType="OMRProcessorDesc")
	public OMRProcessorDescPointer relocatableTargetProcessor() throws CorruptDataException {
		return OMRProcessorDescPointer.cast(nonNullFieldEA(J9JITConfig._relocatableTargetProcessorOffset_));
	}

	// OMRProcessorDesc relocatableTargetProcessor
	public PointerPointer relocatableTargetProcessorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._relocatableTargetProcessorOffset_));
	}

	// void* retranslateWithPreparation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_retranslateWithPreparationOffset_", declaredType="void*")
	public VoidPointer retranslateWithPreparation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._retranslateWithPreparationOffset_));
	}

	// void* retranslateWithPreparation
	public PointerPointer retranslateWithPreparationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._retranslateWithPreparationOffset_));
	}

	// void* retranslateWithPreparationForMethodRedefinition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_retranslateWithPreparationForMethodRedefinitionOffset_", declaredType="void*")
	public VoidPointer retranslateWithPreparationForMethodRedefinition() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._retranslateWithPreparationForMethodRedefinitionOffset_));
	}

	// void* retranslateWithPreparationForMethodRedefinition
	public PointerPointer retranslateWithPreparationForMethodRedefinitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._retranslateWithPreparationForMethodRedefinitionOffset_));
	}

	// void* runJITHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runJITHandlerOffset_", declaredType="void*")
	public VoidPointer runJITHandler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._runJITHandlerOffset_));
	}

	// void* runJITHandler
	public PointerPointer runJITHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._runJITHandlerOffset_));
	}

	// void* runJitdump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runJitdumpOffset_", declaredType="void*")
	public VoidPointer runJitdump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._runJitdumpOffset_));
	}

	// void* runJitdump
	public PointerPointer runJitdumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._runJitdumpOffset_));
	}

	// UDATA runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeFlagsOffset_", declaredType="UDATA")
	public UDATA runtimeFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._runtimeFlagsOffset_);
	}

	// UDATA runtimeFlags
	public UDATAPointer runtimeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._runtimeFlagsOffset_));
	}

	// IDATA sampleInterruptHandlerKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sampleInterruptHandlerKeyOffset_", declaredType="IDATA")
	public IDATA sampleInterruptHandlerKey() throws CorruptDataException {
		return getIDATAAtOffset(J9JITConfig._sampleInterruptHandlerKeyOffset_);
	}

	// IDATA sampleInterruptHandlerKey
	public IDATAPointer sampleInterruptHandlerKeyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._sampleInterruptHandlerKeyOffset_));
	}

	// UDATA sampleInterval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sampleIntervalOffset_", declaredType="UDATA")
	public UDATA sampleInterval() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._sampleIntervalOffset_);
	}

	// UDATA sampleInterval
	public UDATAPointer sampleIntervalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._sampleIntervalOffset_));
	}

	// omrthread_monitor_t samplerMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_samplerMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer samplerMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JITConfig._samplerMonitorOffset_));
	}

	// omrthread_monitor_t samplerMonitor
	public PointerPointer samplerMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._samplerMonitorOffset_));
	}

	// omrthread_t samplerThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_samplerThreadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer samplerThread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9JITConfig._samplerThreadOffset_));
	}

	// omrthread_t samplerThread
	public PointerPointer samplerThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._samplerThreadOffset_));
	}

	// UDATA samplingFrequency
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_samplingFrequencyOffset_", declaredType="UDATA")
	public UDATA samplingFrequency() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._samplingFrequencyOffset_);
	}

	// UDATA samplingFrequency
	public UDATAPointer samplingFrequencyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._samplingFrequencyOffset_));
	}

	// UDATA samplingTickCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_samplingTickCountOffset_", declaredType="UDATA")
	public UDATA samplingTickCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._samplingTickCountOffset_);
	}

	// UDATA samplingTickCount
	public UDATAPointer samplingTickCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._samplingTickCountOffset_));
	}

	// J9MemorySegment* scratchSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scratchSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer scratchSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9JITConfig._scratchSegmentOffset_));
	}

	// J9MemorySegment* scratchSegment
	public PointerPointer scratchSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._scratchSegmentOffset_));
	}

	// UDATA scratchSpacePageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scratchSpacePageSizeOffset_", declaredType="UDATA")
	public UDATA scratchSpacePageSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._scratchSpacePageSizeOffset_);
	}

	// UDATA scratchSpacePageSize
	public UDATAPointer scratchSpacePageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._scratchSpacePageSizeOffset_));
	}

	// void* setUpForDLT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setUpForDLTOffset_", declaredType="void*")
	public VoidPointer setUpForDLT() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._setUpForDLTOffset_));
	}

	// void* setUpForDLT
	public PointerPointer setUpForDLTEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._setUpForDLTOffset_));
	}

	// UDATA singleStepCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_singleStepCountOffset_", declaredType="UDATA")
	public UDATA singleStepCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._singleStepCountOffset_);
	}

	// UDATA singleStepCount
	public UDATAPointer singleStepCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._singleStepCountOffset_));
	}

	// I32 tLogFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tLogFileOffset_", declaredType="I32")
	public IDATA tLogFile() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITConfig._tLogFileOffset_));
	}

	// I32 tLogFile
	public IDATAPointer tLogFileEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._tLogFileOffset_));
	}

	// U8* tLogFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tLogFileNameOffset_", declaredType="U8*")
	public U8Pointer tLogFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._tLogFileNameOffset_));
	}

	// U8* tLogFileName
	public PointerPointer tLogFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._tLogFileNameOffset_));
	}

	// I32 tLogFileTemp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tLogFileTempOffset_", declaredType="I32")
	public IDATA tLogFileTemp() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITConfig._tLogFileTempOffset_));
	}

	// I32 tLogFileTemp
	public IDATAPointer tLogFileTempEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._tLogFileTempOffset_));
	}

	// UDATA targetLittleEndian
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetLittleEndianOffset_", declaredType="UDATA")
	public UDATA targetLittleEndian() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._targetLittleEndianOffset_);
	}

	// UDATA targetLittleEndian
	public UDATAPointer targetLittleEndianEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._targetLittleEndianOffset_));
	}

	// I32 targetName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetNameOffset_", declaredType="I32")
	public IDATA targetName() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITConfig._targetNameOffset_));
	}

	// I32 targetName
	public IDATAPointer targetNameEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._targetNameOffset_));
	}

	// OMRProcessorDesc targetProcessor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetProcessorOffset_", declaredType="OMRProcessorDesc")
	public OMRProcessorDescPointer targetProcessor() throws CorruptDataException {
		return OMRProcessorDescPointer.cast(nonNullFieldEA(J9JITConfig._targetProcessorOffset_));
	}

	// OMRProcessorDesc targetProcessor
	public PointerPointer targetProcessorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._targetProcessorOffset_));
	}

	// J9HashTable* thunkHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thunkHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer thunkHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9JITConfig._thunkHashTableOffset_));
	}

	// J9HashTable* thunkHashTable
	public PointerPointer thunkHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._thunkHashTableOffset_));
	}

	// omrthread_monitor_t thunkHashTableMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thunkHashTableMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer thunkHashTableMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JITConfig._thunkHashTableMutexOffset_));
	}

	// omrthread_monitor_t thunkHashTableMutex
	public PointerPointer thunkHashTableMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._thunkHashTableMutexOffset_));
	}

	// void* thunkLookUpNameAndSig
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thunkLookUpNameAndSigOffset_", declaredType="void*")
	public VoidPointer thunkLookUpNameAndSig() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._thunkLookUpNameAndSigOffset_));
	}

	// void* thunkLookUpNameAndSig
	public PointerPointer thunkLookUpNameAndSigEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._thunkLookUpNameAndSigOffset_));
	}

	// void* traceInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceInfoOffset_", declaredType="void*")
	public VoidPointer traceInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._traceInfoOffset_));
	}

	// void* traceInfo
	public PointerPointer traceInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._traceInfoOffset_));
	}

	// void* tracingHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracingHookOffset_", declaredType="void*")
	public VoidPointer tracingHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._tracingHookOffset_));
	}

	// void* tracingHook
	public PointerPointer tracingHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._tracingHookOffset_));
	}

	// void* translateMethodHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translateMethodHandleOffset_", declaredType="void*")
	public VoidPointer translateMethodHandle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._translateMethodHandleOffset_));
	}

	// void* translateMethodHandle
	public PointerPointer translateMethodHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._translateMethodHandleOffset_));
	}

	// J9AVLTree* translationArtifacts
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translationArtifactsOffset_", declaredType="J9AVLTree*")
	public J9AVLTreePointer translationArtifacts() throws CorruptDataException {
		return J9AVLTreePointer.cast(getPointerAtOffset(J9JITConfig._translationArtifactsOffset_));
	}

	// J9AVLTree* translationArtifacts
	public PointerPointer translationArtifactsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._translationArtifactsOffset_));
	}

	// void* translationFilters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translationFiltersOffset_", declaredType="void*")
	public VoidPointer translationFilters() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITConfig._translationFiltersOffset_));
	}

	// void* translationFilters
	public PointerPointer translationFiltersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._translationFiltersOffset_));
	}

	// UDATA translationFiltersFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translationFiltersFlagsOffset_", declaredType="UDATA")
	public UDATA translationFiltersFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9JITConfig._translationFiltersFlagsOffset_);
	}

	// UDATA translationFiltersFlags
	public UDATAPointer translationFiltersFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITConfig._translationFiltersFlagsOffset_));
	}

	// I32 vLogFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vLogFileOffset_", declaredType="I32")
	public IDATA vLogFile() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JITConfig._vLogFileOffset_));
	}

	// I32 vLogFile
	public IDATAPointer vLogFileEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._vLogFileOffset_));
	}

	// U8* vLogFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vLogFileNameOffset_", declaredType="U8*")
	public U8Pointer vLogFileName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITConfig._vLogFileNameOffset_));
	}

	// U8* vLogFileName
	public PointerPointer vLogFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._vLogFileNameOffset_));
	}

	// J9VTuneInterface* vTuneInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vTuneInterfaceOffset_", declaredType="J9VTuneInterface*")
	public J9VTuneInterfacePointer vTuneInterface() throws CorruptDataException {
		return J9VTuneInterfacePointer.cast(getPointerAtOffset(J9JITConfig._vTuneInterfaceOffset_));
	}

	// J9VTuneInterface* vTuneInterface
	public PointerPointer vTuneInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITConfig._vTuneInterfaceOffset_));
	}

	// IDATA verboseOutputLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseOutputLevelOffset_", declaredType="IDATA")
	public IDATA verboseOutputLevel() throws CorruptDataException {
		return getIDATAAtOffset(J9JITConfig._verboseOutputLevelOffset_);
	}

	// IDATA verboseOutputLevel
	public IDATAPointer verboseOutputLevelEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JITConfig._verboseOutputLevelOffset_));
	}

}
