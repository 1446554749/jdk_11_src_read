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
 * Structure: J9ThreadLibraryPointer
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
 * The generated code will provide getters for all elements in the J9ThreadLibraryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadLibrary.class)
public class J9ThreadLibraryPointer extends StructurePointer {

	// NULL
	public static final J9ThreadLibraryPointer NULL = new J9ThreadLibraryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadLibraryPointer(long address) {
		super(address);
	}

	public static J9ThreadLibraryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadLibraryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadLibraryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadLibraryPointer(address);
	}

	public J9ThreadLibraryPointer add(long count) {
		return J9ThreadLibraryPointer.cast(address + (J9ThreadLibrary.SIZEOF * count));
	}

	public J9ThreadLibraryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadLibraryPointer addOffset(long offset) {
		return J9ThreadLibraryPointer.cast(address + offset);
	}

	public J9ThreadLibraryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadLibraryPointer sub(long count) {
		return J9ThreadLibraryPointer.cast(address - (J9ThreadLibrary.SIZEOF * count));
	}

	public J9ThreadLibraryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadLibraryPointer subOffset(long offset) {
		return J9ThreadLibraryPointer.cast(address - offset);
	}

	public J9ThreadLibraryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadLibraryPointer untag(long mask) {
		return J9ThreadLibraryPointer.cast(address & ~mask);
	}

	public J9ThreadLibraryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadLibrary.SIZEOF;
	}

	// Implementation methods

	// U64 adaptSpinHoldtime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptSpinHoldtimeOffset_", declaredType="U64")
	public UDATA adaptSpinHoldtime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._adaptSpinHoldtimeOffset_));
	}

	// U64 adaptSpinHoldtime
	public UDATAPointer adaptSpinHoldtimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._adaptSpinHoldtimeOffset_));
	}

	// U64 adaptSpinSampleCountStopRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptSpinSampleCountStopRatioOffset_", declaredType="U64")
	public UDATA adaptSpinSampleCountStopRatio() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._adaptSpinSampleCountStopRatioOffset_));
	}

	// U64 adaptSpinSampleCountStopRatio
	public UDATAPointer adaptSpinSampleCountStopRatioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._adaptSpinSampleCountStopRatioOffset_));
	}

	// U64 adaptSpinSampleStopCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptSpinSampleStopCountOffset_", declaredType="U64")
	public UDATA adaptSpinSampleStopCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._adaptSpinSampleStopCountOffset_));
	}

	// U64 adaptSpinSampleStopCount
	public UDATAPointer adaptSpinSampleStopCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._adaptSpinSampleStopCountOffset_));
	}

	// U64 adaptSpinSampleThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptSpinSampleThresholdOffset_", declaredType="U64")
	public UDATA adaptSpinSampleThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._adaptSpinSampleThresholdOffset_));
	}

	// U64 adaptSpinSampleThreshold
	public UDATAPointer adaptSpinSampleThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._adaptSpinSampleThresholdOffset_));
	}

	// U64 adaptSpinSlowPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adaptSpinSlowPercentOffset_", declaredType="U64")
	public UDATA adaptSpinSlowPercent() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._adaptSpinSlowPercentOffset_));
	}

	// U64 adaptSpinSlowPercent
	public UDATAPointer adaptSpinSlowPercentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._adaptSpinSlowPercentOffset_));
	}

	// TLSKEY attachedLibKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attachedLibKeyOffset_", declaredType="TLSKEY")
	public UDATA attachedLibKey() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._attachedLibKeyOffset_));
	}

	// TLSKEY attachedLibKey
	public UDATAPointer attachedLibKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._attachedLibKeyOffset_));
	}

	// clock_serv_t clockService
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clockServiceOffset_", declaredType="clock_serv_t")
	public UDATA clockService() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ThreadLibrary._clockServiceOffset_));
	}

	// clock_serv_t clockService
	public UDATAPointer clockServiceEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._clockServiceOffset_));
	}

	// U64 clock_skew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clock_skewOffset_", declaredType="U64")
	public UDATA clock_skew() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._clock_skewOffset_));
	}

	// U64 clock_skew
	public UDATAPointer clock_skewEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._clock_skewOffset_));
	}

	// J9ThreadsCpuUsage cumulativeThreadsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cumulativeThreadsInfoOffset_", declaredType="J9ThreadsCpuUsage")
	public J9ThreadsCpuUsagePointer cumulativeThreadsInfo() throws CorruptDataException {
		return J9ThreadsCpuUsagePointer.cast(nonNullFieldEA(J9ThreadLibrary._cumulativeThreadsInfoOffset_));
	}

	// J9ThreadsCpuUsage cumulativeThreadsInfo
	public PointerPointer cumulativeThreadsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._cumulativeThreadsInfoOffset_));
	}

	// U64 defaultMonitorSpinCount1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultMonitorSpinCount1Offset_", declaredType="U64")
	public UDATA defaultMonitorSpinCount1() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._defaultMonitorSpinCount1Offset_));
	}

	// U64 defaultMonitorSpinCount1
	public UDATAPointer defaultMonitorSpinCount1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._defaultMonitorSpinCount1Offset_));
	}

	// U64 defaultMonitorSpinCount2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultMonitorSpinCount2Offset_", declaredType="U64")
	public UDATA defaultMonitorSpinCount2() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._defaultMonitorSpinCount2Offset_));
	}

	// U64 defaultMonitorSpinCount2
	public UDATAPointer defaultMonitorSpinCount2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._defaultMonitorSpinCount2Offset_));
	}

	// U64 defaultMonitorSpinCount3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultMonitorSpinCount3Offset_", declaredType="U64")
	public UDATA defaultMonitorSpinCount3() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._defaultMonitorSpinCount3Offset_));
	}

	// U64 defaultMonitorSpinCount3
	public UDATAPointer defaultMonitorSpinCount3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._defaultMonitorSpinCount3Offset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._flagsOffset_));
	}

	// J9ThreadMonitorTracing* gc_lock_tracing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gc_lock_tracingOffset_", declaredType="J9ThreadMonitorTracing*")
	public J9ThreadMonitorTracingPointer gc_lock_tracing() throws CorruptDataException {
		return J9ThreadMonitorTracingPointer.cast(getPointerAtOffset(J9ThreadLibrary._gc_lock_tracingOffset_));
	}

	// J9ThreadMonitorTracing* gc_lock_tracing
	public PointerPointer gc_lock_tracingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._gc_lock_tracingOffset_));
	}

	// omrthread_monitor_t globalMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer globalMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9ThreadLibrary._globalMonitorOffset_));
	}

	// omrthread_monitor_t globalMonitor
	public PointerPointer globalMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._globalMonitorOffset_));
	}

	// J9OSMutex global_mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_global_mutexOffset_", declaredType="J9OSMutex")
	public _opaque_pthread_mutex_tPointer global_mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9ThreadLibrary._global_mutexOffset_));
	}

	// J9OSMutex global_mutex
	public PointerPointer global_mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._global_mutexOffset_));
	}

	// J9Pool* global_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_global_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer global_pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ThreadLibrary._global_poolOffset_));
	}

	// J9Pool* global_pool
	public PointerPointer global_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._global_poolOffset_));
	}

	// J9ThreadGlobal* globals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalsOffset_", declaredType="J9ThreadGlobal*")
	public J9ThreadGlobalPointer globals() throws CorruptDataException {
		return J9ThreadGlobalPointer.cast(getPointerAtOffset(J9ThreadLibrary._globalsOffset_));
	}

	// J9ThreadGlobal* globals
	public PointerPointer globalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._globalsOffset_));
	}

	// I64 initStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initStatusOffset_", declaredType="I64")
	public IDATA initStatus() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadLibrary._initStatusOffset_));
	}

	// I64 initStatus
	public IDATAPointer initStatusEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._initStatusOffset_));
	}

	// U64 maxSpinThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxSpinThreadsOffset_", declaredType="U64")
	public UDATA maxSpinThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._maxSpinThreadsOffset_));
	}

	// U64 maxSpinThreads
	public UDATAPointer maxSpinThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._maxSpinThreadsOffset_));
	}

	// U64 maxWakeThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxWakeThreadsOffset_", declaredType="U64")
	public UDATA maxWakeThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._maxWakeThreadsOffset_));
	}

	// U64 maxWakeThreads
	public UDATAPointer maxWakeThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._maxWakeThreadsOffset_));
	}

	// J9OSMutex monitor_mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_mutexOffset_", declaredType="J9OSMutex")
	public _opaque_pthread_mutex_tPointer monitor_mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9ThreadLibrary._monitor_mutexOffset_));
	}

	// J9OSMutex monitor_mutex
	public PointerPointer monitor_mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._monitor_mutexOffset_));
	}

	// J9ThreadMonitorPool* monitor_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_poolOffset_", declaredType="J9ThreadMonitorPool*")
	public J9ThreadMonitorPoolPointer monitor_pool() throws CorruptDataException {
		return J9ThreadMonitorPoolPointer.cast(getPointerAtOffset(J9ThreadLibrary._monitor_poolOffset_));
	}

	// J9ThreadMonitorPool* monitor_pool
	public PointerPointer monitor_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._monitor_poolOffset_));
	}

	// J9Pool* monitor_tracing_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_tracing_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer monitor_tracing_pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ThreadLibrary._monitor_tracing_poolOffset_));
	}

	// J9Pool* monitor_tracing_pool
	public PointerPointer monitor_tracing_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._monitor_tracing_poolOffset_));
	}

	// OMRMemCategory nativeStackCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeStackCategoryOffset_", declaredType="OMRMemCategory")
	public OMRMemCategoryPointer nativeStackCategory() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(nonNullFieldEA(J9ThreadLibrary._nativeStackCategoryOffset_));
	}

	// OMRMemCategory nativeStackCategory
	public PointerPointer nativeStackCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._nativeStackCategoryOffset_));
	}

	// J9OSMutex resourceUsageMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resourceUsageMutexOffset_", declaredType="J9OSMutex")
	public _opaque_pthread_mutex_tPointer resourceUsageMutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9ThreadLibrary._resourceUsageMutexOffset_));
	}

	// J9OSMutex resourceUsageMutex
	public PointerPointer resourceUsageMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._resourceUsageMutexOffset_));
	}

	// TLSKEY self_ptr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_self_ptrOffset_", declaredType="TLSKEY")
	public UDATA self_ptr() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._self_ptrOffset_));
	}

	// TLSKEY self_ptr
	public UDATAPointer self_ptrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._self_ptrOffset_));
	}

	// U64 spinlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinlockOffset_", declaredType="U64")
	public UDATA spinlock() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._spinlockOffset_));
	}

	// U64 spinlock
	public UDATAPointer spinlockEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._spinlockOffset_));
	}

	// omrthread_attr_t systemThreadAttr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemThreadAttrOffset_", declaredType="omrthread_attr_t")
	public omrthread_attrPointer systemThreadAttr() throws CorruptDataException {
		return omrthread_attrPointer.cast(getPointerAtOffset(J9ThreadLibrary._systemThreadAttrOffset_));
	}

	// omrthread_attr_t systemThreadAttr
	public PointerPointer systemThreadAttrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._systemThreadAttrOffset_));
	}

	// U64 threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadCountOffset_", declaredType="U64")
	public UDATA threadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._threadCountOffset_));
	}

	// U64 threadCount
	public UDATAPointer threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._threadCountOffset_));
	}

	// OMRMemCategory threadLibraryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadLibraryCategoryOffset_", declaredType="OMRMemCategory")
	public OMRMemCategoryPointer threadLibraryCategory() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(nonNullFieldEA(J9ThreadLibrary._threadLibraryCategoryOffset_));
	}

	// OMRMemCategory threadLibraryCategory
	public PointerPointer threadLibraryCategoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._threadLibraryCategoryOffset_));
	}

	// U64 threadWalkMutexesHeld
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadWalkMutexesHeldOffset_", declaredType="U64")
	public UDATA threadWalkMutexesHeld() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadLibrary._threadWalkMutexesHeldOffset_));
	}

	// U64 threadWalkMutexesHeld
	public UDATAPointer threadWalkMutexesHeldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadLibrary._threadWalkMutexesHeldOffset_));
	}

	// J9Pool* thread_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer thread_pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ThreadLibrary._thread_poolOffset_));
	}

	// J9Pool* thread_pool
	public PointerPointer thread_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._thread_poolOffset_));
	}

	// J9Pool* thread_tracing_pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_tracing_poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer thread_tracing_pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9ThreadLibrary._thread_tracing_poolOffset_));
	}

	// J9Pool* thread_tracing_pool
	public PointerPointer thread_tracing_poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._thread_tracing_poolOffset_));
	}

	// U8* thread_weight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thread_weightOffset_", declaredType="U8*")
	public U8Pointer thread_weight() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ThreadLibrary._thread_weightOffset_));
	}

	// U8* thread_weight
	public PointerPointer thread_weightEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._thread_weightOffset_));
	}

	// omrthread_tls_finalizer_t[] tls_finalizers
	public PointerPointer tls_finalizersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._tls_finalizersOffset_));
	}

	// J9OSMutex tls_mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tls_mutexOffset_", declaredType="J9OSMutex")
	public _opaque_pthread_mutex_tPointer tls_mutex() throws CorruptDataException {
		return _opaque_pthread_mutex_tPointer.cast(nonNullFieldEA(J9ThreadLibrary._tls_mutexOffset_));
	}

	// J9OSMutex tls_mutex
	public PointerPointer tls_mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadLibrary._tls_mutexOffset_));
	}

}
