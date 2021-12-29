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
 * Structure: OMR_VMThreadPointer
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
 * The generated code will provide getters for all elements in the OMR_VMThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_VMThread.class)
public class OMR_VMThreadPointer extends StructurePointer {

	// NULL
	public static final OMR_VMThreadPointer NULL = new OMR_VMThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_VMThreadPointer(long address) {
		super(address);
	}

	public static OMR_VMThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_VMThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_VMThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_VMThreadPointer(address);
	}

	public OMR_VMThreadPointer add(long count) {
		return OMR_VMThreadPointer.cast(address + (OMR_VMThread.SIZEOF * count));
	}

	public OMR_VMThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_VMThreadPointer addOffset(long offset) {
		return OMR_VMThreadPointer.cast(address + offset);
	}

	public OMR_VMThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_VMThreadPointer sub(long count) {
		return OMR_VMThreadPointer.cast(address - (OMR_VMThread.SIZEOF * count));
	}

	public OMR_VMThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_VMThreadPointer subOffset(long offset) {
		return OMR_VMThreadPointer.cast(address - offset);
	}

	public OMR_VMThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_VMThreadPointer untag(long mask) {
		return OMR_VMThreadPointer.cast(address & ~mask);
	}

	public OMR_VMThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_VMThread.SIZEOF;
	}

	// Implementation methods

	// I32 _attachCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__attachCountOffset_", declaredType="I32")
	public IDATA _attachCount() throws CorruptDataException {
		return new I32(getIntAtOffset(OMR_VMThread.__attachCountOffset_));
	}

	// I32 _attachCount
	public IDATAPointer _attachCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMR_VMThread.__attachCountOffset_));
	}

	// U32 _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="U32")
	public UDATA _compressObjectReferences() throws CorruptDataException {
		return new U32(getIntAtOffset(OMR_VMThread.__compressObjectReferencesOffset_));
	}

	// U32 _compressObjectReferences
	public UDATAPointer _compressObjectReferencesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread.__compressObjectReferencesOffset_));
	}

	// void* _gcOmrVMThreadExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcOmrVMThreadExtensionsOffset_", declaredType="void*")
	public VoidPointer _gcOmrVMThreadExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread.__gcOmrVMThreadExtensionsOffset_));
	}

	// void* _gcOmrVMThreadExtensions
	public PointerPointer _gcOmrVMThreadExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__gcOmrVMThreadExtensionsOffset_));
	}

	// U64 _internal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__internalOffset_", declaredType="U64")
	public UDATA _internal() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VMThread.__internalOffset_));
	}

	// U64 _internal
	public UDATAPointer _internalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread.__internalOffset_));
	}

	// void* _language_vmthread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__language_vmthreadOffset_", declaredType="void*")
	public VoidPointer _language_vmthread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread.__language_vmthreadOffset_));
	}

	// void* _language_vmthread
	public PointerPointer _language_vmthreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__language_vmthreadOffset_));
	}

	// OMR_VMThread* _linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__linkNextOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _linkNext() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(OMR_VMThread.__linkNextOffset_));
	}

	// OMR_VMThread* _linkNext
	public PointerPointer _linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__linkNextOffset_));
	}

	// OMR_VMThread* _linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__linkPreviousOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _linkPrevious() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(OMR_VMThread.__linkPreviousOffset_));
	}

	// OMR_VMThread* _linkPrevious
	public PointerPointer _linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__linkPreviousOffset_));
	}

	// omrthread_t _os_thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__os_threadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer _os_thread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(OMR_VMThread.__os_threadOffset_));
	}

	// omrthread_t _os_thread
	public PointerPointer _os_threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__os_threadOffset_));
	}

	// U32 _sampleStackBackoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sampleStackBackoffOffset_", declaredType="U32")
	public UDATA _sampleStackBackoff() throws CorruptDataException {
		return new U32(getIntAtOffset(OMR_VMThread.__sampleStackBackoffOffset_));
	}

	// U32 _sampleStackBackoff
	public UDATAPointer _sampleStackBackoffEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread.__sampleStackBackoffOffset_));
	}

	// void* _savedObject1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__savedObject1Offset_", declaredType="void*")
	public VoidPointer _savedObject1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread.__savedObject1Offset_));
	}

	// void* _savedObject1
	public PointerPointer _savedObject1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__savedObject1Offset_));
	}

	// void* _savedObject2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__savedObject2Offset_", declaredType="void*")
	public VoidPointer _savedObject2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread.__savedObject2Offset_));
	}

	// void* _savedObject2
	public PointerPointer _savedObject2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__savedObject2Offset_));
	}

	// OMR_TraceThread* _trace.omrTraceThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__trace$omrTraceThreadOffset_", declaredType="OMR_TraceThread*")
	public OMR_TraceThreadPointer _trace$omrTraceThread() throws CorruptDataException {
		return OMR_TraceThreadPointer.cast(getPointerAtOffset(OMR_VMThread.__trace$omrTraceThreadOffset_));
	}

	// OMR_TraceThread* _trace.omrTraceThread
	public PointerPointer _trace$omrTraceThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__trace$omrTraceThreadOffset_));
	}

	// UtThreadData* _trace.uteThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__trace$uteThreadOffset_", declaredType="UtThreadData*")
	public UtThreadDataPointer _trace$uteThread() throws CorruptDataException {
		return UtThreadDataPointer.cast(getPointerAtOffset(OMR_VMThread.__trace$uteThreadOffset_));
	}

	// UtThreadData* _trace.uteThread
	public PointerPointer _trace$uteThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__trace$uteThreadOffset_));
	}

	// OMR_VM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_VMThread.__vmOffset_));
	}

	// OMR_VM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread.__vmOffset_));
	}

	// U64 exclusiveCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveCountOffset_", declaredType="U64")
	public UDATA exclusiveCount() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VMThread._exclusiveCountOffset_));
	}

	// U64 exclusiveCount
	public UDATAPointer exclusiveCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread._exclusiveCountOffset_));
	}

	// void* heapBaseForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseForBarrierRange0Offset_", declaredType="void*")
	public VoidPointer heapBaseForBarrierRange0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread._heapBaseForBarrierRange0Offset_));
	}

	// void* heapBaseForBarrierRange0
	public PointerPointer heapBaseForBarrierRange0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._heapBaseForBarrierRange0Offset_));
	}

	// U64 heapSizeForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeForBarrierRange0Offset_", declaredType="U64")
	public UDATA heapSizeForBarrierRange0() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VMThread._heapSizeForBarrierRange0Offset_));
	}

	// U64 heapSizeForBarrierRange0
	public UDATAPointer heapSizeForBarrierRange0EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread._heapSizeForBarrierRange0Offset_));
	}

	// void* highTenureAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_highTenureAddressOffset_", declaredType="void*")
	public VoidPointer highTenureAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread._highTenureAddressOffset_));
	}

	// void* highTenureAddress
	public PointerPointer highTenureAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._highTenureAddressOffset_));
	}

	// void* lowTenureAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lowTenureAddressOffset_", declaredType="void*")
	public VoidPointer lowTenureAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread._lowTenureAddressOffset_));
	}

	// void* lowTenureAddress
	public PointerPointer lowTenureAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._lowTenureAddressOffset_));
	}

	// void* memorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memorySpaceOffset_", declaredType="void*")
	public VoidPointer memorySpace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VMThread._memorySpaceOffset_));
	}

	// void* memorySpace
	public PointerPointer memorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._memorySpaceOffset_));
	}

	// movedObjectHashCode movedObjectHashCodeCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_movedObjectHashCodeCacheOffset_", declaredType="movedObjectHashCode")
	public movedObjectHashCodePointer movedObjectHashCodeCache() throws CorruptDataException {
		return movedObjectHashCodePointer.cast(nonNullFieldEA(OMR_VMThread._movedObjectHashCodeCacheOffset_));
	}

	// movedObjectHashCode movedObjectHashCodeCache
	public PointerPointer movedObjectHashCodeCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._movedObjectHashCodeCacheOffset_));
	}

	// U8* threadName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadNameOffset_", declaredType="U8*")
	public U8Pointer threadName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMR_VMThread._threadNameOffset_));
	}

	// U8* threadName
	public PointerPointer threadNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._threadNameOffset_));
	}

	// BOOLEAN threadNameIsStatic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadNameIsStaticOffset_", declaredType="BOOLEAN")
	public UDATA threadNameIsStatic() throws CorruptDataException {
		return new U32(getIntAtOffset(OMR_VMThread._threadNameIsStaticOffset_));
	}

	// BOOLEAN threadNameIsStatic
	public UDATAPointer threadNameIsStaticEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread._threadNameIsStaticOffset_));
	}

	// omrthread_monitor_t threadNameMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadNameMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer threadNameMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(OMR_VMThread._threadNameMutexOffset_));
	}

	// omrthread_monitor_t threadNameMutex
	public PointerPointer threadNameMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VMThread._threadNameMutexOffset_));
	}

	// U64 vmState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmStateOffset_", declaredType="U64")
	public UDATA vmState() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VMThread._vmStateOffset_));
	}

	// U64 vmState
	public UDATAPointer vmStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMThread._vmStateOffset_));
	}

}
