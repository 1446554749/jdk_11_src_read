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
 * Structure: J9JavaLangManagementDataPointer
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
 * The generated code will provide getters for all elements in the J9JavaLangManagementDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JavaLangManagementData.class)
public class J9JavaLangManagementDataPointer extends StructurePointer {

	// NULL
	public static final J9JavaLangManagementDataPointer NULL = new J9JavaLangManagementDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JavaLangManagementDataPointer(long address) {
		super(address);
	}

	public static J9JavaLangManagementDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JavaLangManagementDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JavaLangManagementDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JavaLangManagementDataPointer(address);
	}

	public J9JavaLangManagementDataPointer add(long count) {
		return J9JavaLangManagementDataPointer.cast(address + (J9JavaLangManagementData.SIZEOF * count));
	}

	public J9JavaLangManagementDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JavaLangManagementDataPointer addOffset(long offset) {
		return J9JavaLangManagementDataPointer.cast(address + offset);
	}

	public J9JavaLangManagementDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JavaLangManagementDataPointer sub(long count) {
		return J9JavaLangManagementDataPointer.cast(address - (J9JavaLangManagementData.SIZEOF * count));
	}

	public J9JavaLangManagementDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JavaLangManagementDataPointer subOffset(long offset) {
		return J9JavaLangManagementDataPointer.cast(address - offset);
	}

	public J9JavaLangManagementDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JavaLangManagementDataPointer untag(long mask) {
		return J9JavaLangManagementDataPointer.cast(address & ~mask);
	}

	public J9JavaLangManagementDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JavaLangManagementData.SIZEOF;
	}

	// Implementation methods

	// U8[] counterPath
	public U8Pointer counterPathEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9JavaLangManagementData._counterPathOffset_));
	}

	// U32 currentNumberOfCPUs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentNumberOfCPUsOffset_", declaredType="U32")
	public UDATA currentNumberOfCPUs() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._currentNumberOfCPUsOffset_));
	}

	// U32 currentNumberOfCPUs
	public UDATAPointer currentNumberOfCPUsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._currentNumberOfCPUsOffset_));
	}

	// U32 currentProcessingCapacity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentProcessingCapacityOffset_", declaredType="U32")
	public UDATA currentProcessingCapacity() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._currentProcessingCapacityOffset_));
	}

	// U32 currentProcessingCapacity
	public UDATAPointer currentProcessingCapacityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._currentProcessingCapacityOffset_));
	}

	// U64 currentTotalPhysicalMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentTotalPhysicalMemoryOffset_", declaredType="U64")
	public UDATA currentTotalPhysicalMemory() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._currentTotalPhysicalMemoryOffset_));
	}

	// U64 currentTotalPhysicalMemory
	public UDATAPointer currentTotalPhysicalMemoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._currentTotalPhysicalMemoryOffset_));
	}

	// U32 dlparNotificationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dlparNotificationCountOffset_", declaredType="U32")
	public UDATA dlparNotificationCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._dlparNotificationCountOffset_));
	}

	// U32 dlparNotificationCount
	public UDATAPointer dlparNotificationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._dlparNotificationCountOffset_));
	}

	// omrthread_monitor_t dlparNotificationMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dlparNotificationMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer dlparNotificationMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaLangManagementData._dlparNotificationMonitorOffset_));
	}

	// omrthread_monitor_t dlparNotificationMonitor
	public PointerPointer dlparNotificationMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._dlparNotificationMonitorOffset_));
	}

	// void* dlparNotificationQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dlparNotificationQueueOffset_", declaredType="void*")
	public VoidPointer dlparNotificationQueue() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaLangManagementData._dlparNotificationQueueOffset_));
	}

	// void* dlparNotificationQueue
	public PointerPointer dlparNotificationQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._dlparNotificationQueueOffset_));
	}

	// U32 dlparNotificationsPending
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dlparNotificationsPendingOffset_", declaredType="U32")
	public UDATA dlparNotificationsPending() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._dlparNotificationsPendingOffset_));
	}

	// U32 dlparNotificationsPending
	public UDATAPointer dlparNotificationsPendingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._dlparNotificationsPendingOffset_));
	}

	// J9GarbageCollectorData* garbageCollectors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_garbageCollectorsOffset_", declaredType="J9GarbageCollectorData*")
	public J9GarbageCollectorDataPointer garbageCollectors() throws CorruptDataException {
		return J9GarbageCollectorDataPointer.cast(getPointerAtOffset(J9JavaLangManagementData._garbageCollectorsOffset_));
	}

	// J9GarbageCollectorData* garbageCollectors
	public PointerPointer garbageCollectorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._garbageCollectorsOffset_));
	}

	// U32 gcCurrentThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCurrentThreadsOffset_", declaredType="U32")
	public UDATA gcCurrentThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._gcCurrentThreadsOffset_));
	}

	// U32 gcCurrentThreads
	public UDATAPointer gcCurrentThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._gcCurrentThreadsOffset_));
	}

	// U64 gcMainCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcMainCpuTimeOffset_", declaredType="U64")
	public UDATA gcMainCpuTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._gcMainCpuTimeOffset_));
	}

	// U64 gcMainCpuTime
	public UDATAPointer gcMainCpuTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._gcMainCpuTimeOffset_));
	}

	// U32 gcMaxThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcMaxThreadsOffset_", declaredType="U32")
	public UDATA gcMaxThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._gcMaxThreadsOffset_));
	}

	// U32 gcMaxThreads
	public UDATAPointer gcMaxThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._gcMaxThreadsOffset_));
	}

	// U64 gcWorkerCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcWorkerCpuTimeOffset_", declaredType="U64")
	public UDATA gcWorkerCpuTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._gcWorkerCpuTimeOffset_));
	}

	// U64 gcWorkerCpuTime
	public UDATAPointer gcWorkerCpuTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._gcWorkerCpuTimeOffset_));
	}

	// UDATA initialHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialHeapSizeOffset_", declaredType="UDATA")
	public UDATA initialHeapSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaLangManagementData._initialHeapSizeOffset_);
	}

	// UDATA initialHeapSize
	public UDATAPointer initialHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._initialHeapSizeOffset_));
	}

	// U32 isCounterPathInitialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCounterPathInitializedOffset_", declaredType="U32")
	public UDATA isCounterPathInitialized() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._isCounterPathInitializedOffset_));
	}

	// U32 isCounterPathInitialized
	public UDATAPointer isCounterPathInitializedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._isCounterPathInitializedOffset_));
	}

	// U32 isCurrentThreadCpuTimeSupported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCurrentThreadCpuTimeSupportedOffset_", declaredType="U32")
	public UDATA isCurrentThreadCpuTimeSupported() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._isCurrentThreadCpuTimeSupportedOffset_));
	}

	// U32 isCurrentThreadCpuTimeSupported
	public UDATAPointer isCurrentThreadCpuTimeSupportedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._isCurrentThreadCpuTimeSupportedOffset_));
	}

	// U32 isThreadCpuTimeSupported
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isThreadCpuTimeSupportedOffset_", declaredType="U32")
	public UDATA isThreadCpuTimeSupported() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._isThreadCpuTimeSupportedOffset_));
	}

	// U32 isThreadCpuTimeSupported
	public UDATAPointer isThreadCpuTimeSupportedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._isThreadCpuTimeSupportedOffset_));
	}

	// I64 lastCompilationStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastCompilationStartOffset_", declaredType="I64")
	public IDATA lastCompilationStart() throws CorruptDataException {
		return new I64(getLongAtOffset(J9JavaLangManagementData._lastCompilationStartOffset_));
	}

	// I64 lastCompilationStart
	public IDATAPointer lastCompilationStartEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._lastCompilationStartOffset_));
	}

	// U32 lastGCID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGCIDOffset_", declaredType="U32")
	public UDATA lastGCID() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._lastGCIDOffset_));
	}

	// U32 lastGCID
	public UDATAPointer lastGCIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._lastGCIDOffset_));
	}

	// U32 liveJavaDaemonThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveJavaDaemonThreadsOffset_", declaredType="U32")
	public UDATA liveJavaDaemonThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._liveJavaDaemonThreadsOffset_));
	}

	// U32 liveJavaDaemonThreads
	public UDATAPointer liveJavaDaemonThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._liveJavaDaemonThreadsOffset_));
	}

	// U32 liveJavaThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveJavaThreadsOffset_", declaredType="U32")
	public UDATA liveJavaThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._liveJavaThreadsOffset_));
	}

	// U32 liveJavaThreads
	public UDATAPointer liveJavaThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._liveJavaThreadsOffset_));
	}

	// omrthread_rwmutex_t managementDataLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_managementDataLockOffset_", declaredType="omrthread_rwmutex_t")
	public RWMutexPointer managementDataLock() throws CorruptDataException {
		return RWMutexPointer.cast(getPointerAtOffset(J9JavaLangManagementData._managementDataLockOffset_));
	}

	// omrthread_rwmutex_t managementDataLock
	public PointerPointer managementDataLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._managementDataLockOffset_));
	}

	// UDATA maximumHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maximumHeapSizeOffset_", declaredType="UDATA")
	public UDATA maximumHeapSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaLangManagementData._maximumHeapSizeOffset_);
	}

	// UDATA maximumHeapSize
	public UDATAPointer maximumHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._maximumHeapSizeOffset_));
	}

	// J9MemoryPoolData* memoryPools
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryPoolsOffset_", declaredType="J9MemoryPoolData*")
	public J9MemoryPoolDataPointer memoryPools() throws CorruptDataException {
		return J9MemoryPoolDataPointer.cast(getPointerAtOffset(J9JavaLangManagementData._memoryPoolsOffset_));
	}

	// J9MemoryPoolData* memoryPools
	public PointerPointer memoryPoolsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._memoryPoolsOffset_));
	}

	// J9NonHeapMemoryData* nonHeapMemoryPools
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonHeapMemoryPoolsOffset_", declaredType="J9NonHeapMemoryData*")
	public J9NonHeapMemoryDataPointer nonHeapMemoryPools() throws CorruptDataException {
		return J9NonHeapMemoryDataPointer.cast(getPointerAtOffset(J9JavaLangManagementData._nonHeapMemoryPoolsOffset_));
	}

	// J9NonHeapMemoryData* nonHeapMemoryPools
	public PointerPointer nonHeapMemoryPoolsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._nonHeapMemoryPoolsOffset_));
	}

	// U64 notificationCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationCountOffset_", declaredType="U64")
	public UDATA notificationCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._notificationCountOffset_));
	}

	// U64 notificationCount
	public UDATAPointer notificationCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._notificationCountOffset_));
	}

	// U32 notificationEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationEnabledOffset_", declaredType="U32")
	public UDATA notificationEnabled() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._notificationEnabledOffset_));
	}

	// U32 notificationEnabled
	public UDATAPointer notificationEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._notificationEnabledOffset_));
	}

	// omrthread_monitor_t notificationMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer notificationMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9JavaLangManagementData._notificationMonitorOffset_));
	}

	// omrthread_monitor_t notificationMonitor
	public PointerPointer notificationMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._notificationMonitorOffset_));
	}

	// void* notificationQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationQueueOffset_", declaredType="void*")
	public VoidPointer notificationQueue() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JavaLangManagementData._notificationQueueOffset_));
	}

	// void* notificationQueue
	public PointerPointer notificationQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JavaLangManagementData._notificationQueueOffset_));
	}

	// U32 notificationsPending
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_notificationsPendingOffset_", declaredType="U32")
	public UDATA notificationsPending() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._notificationsPendingOffset_));
	}

	// U32 notificationsPending
	public UDATAPointer notificationsPendingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._notificationsPendingOffset_));
	}

	// U32 peakLiveJavaThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_peakLiveJavaThreadsOffset_", declaredType="U32")
	public UDATA peakLiveJavaThreads() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._peakLiveJavaThreadsOffset_));
	}

	// U32 peakLiveJavaThreads
	public UDATAPointer peakLiveJavaThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._peakLiveJavaThreadsOffset_));
	}

	// U64 postCollectionHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionHeapSizeOffset_", declaredType="U64")
	public UDATA postCollectionHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._postCollectionHeapSizeOffset_));
	}

	// U64 postCollectionHeapSize
	public UDATAPointer postCollectionHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._postCollectionHeapSizeOffset_));
	}

	// U64 postCollectionHeapUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_postCollectionHeapUsedOffset_", declaredType="U64")
	public UDATA postCollectionHeapUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._postCollectionHeapUsedOffset_));
	}

	// U64 postCollectionHeapUsed
	public UDATAPointer postCollectionHeapUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._postCollectionHeapUsedOffset_));
	}

	// U64 preCollectionHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionHeapSizeOffset_", declaredType="U64")
	public UDATA preCollectionHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._preCollectionHeapSizeOffset_));
	}

	// U64 preCollectionHeapSize
	public UDATAPointer preCollectionHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._preCollectionHeapSizeOffset_));
	}

	// U64 preCollectionHeapUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preCollectionHeapUsedOffset_", declaredType="U64")
	public UDATA preCollectionHeapUsed() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._preCollectionHeapUsedOffset_));
	}

	// U64 preCollectionHeapUsed
	public UDATAPointer preCollectionHeapUsedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._preCollectionHeapUsedOffset_));
	}

	// U32 supportedCollectors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_supportedCollectorsOffset_", declaredType="U32")
	public UDATA supportedCollectors() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._supportedCollectorsOffset_));
	}

	// U32 supportedCollectors
	public UDATAPointer supportedCollectorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._supportedCollectorsOffset_));
	}

	// U32 supportedMemoryPools
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_supportedMemoryPoolsOffset_", declaredType="U32")
	public UDATA supportedMemoryPools() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._supportedMemoryPoolsOffset_));
	}

	// U32 supportedMemoryPools
	public UDATAPointer supportedMemoryPoolsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._supportedMemoryPoolsOffset_));
	}

	// U32 supportedNonHeapMemoryPools
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_supportedNonHeapMemoryPoolsOffset_", declaredType="U32")
	public UDATA supportedNonHeapMemoryPools() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._supportedNonHeapMemoryPoolsOffset_));
	}

	// U32 supportedNonHeapMemoryPools
	public UDATAPointer supportedNonHeapMemoryPoolsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._supportedNonHeapMemoryPoolsOffset_));
	}

	// U32 threadContentionMonitoringFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadContentionMonitoringFlagOffset_", declaredType="U32")
	public UDATA threadContentionMonitoringFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._threadContentionMonitoringFlagOffset_));
	}

	// U32 threadContentionMonitoringFlag
	public UDATAPointer threadContentionMonitoringFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._threadContentionMonitoringFlagOffset_));
	}

	// U32 threadCpuTimeEnabledFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadCpuTimeEnabledFlagOffset_", declaredType="U32")
	public UDATA threadCpuTimeEnabledFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JavaLangManagementData._threadCpuTimeEnabledFlagOffset_));
	}

	// U32 threadCpuTimeEnabledFlag
	public UDATAPointer threadCpuTimeEnabledFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._threadCpuTimeEnabledFlagOffset_));
	}

	// UDATA threadsCompiling
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadsCompilingOffset_", declaredType="UDATA")
	public UDATA threadsCompiling() throws CorruptDataException {
		return getUDATAAtOffset(J9JavaLangManagementData._threadsCompilingOffset_);
	}

	// UDATA threadsCompiling
	public UDATAPointer threadsCompilingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._threadsCompilingOffset_));
	}

	// U64 totalClassLoads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalClassLoadsOffset_", declaredType="U64")
	public UDATA totalClassLoads() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._totalClassLoadsOffset_));
	}

	// U64 totalClassLoads
	public UDATAPointer totalClassLoadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._totalClassLoadsOffset_));
	}

	// U64 totalClassUnloads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalClassUnloadsOffset_", declaredType="U64")
	public UDATA totalClassUnloads() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._totalClassUnloadsOffset_));
	}

	// U64 totalClassUnloads
	public UDATAPointer totalClassUnloadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._totalClassUnloadsOffset_));
	}

	// U64 totalCompilationTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalCompilationTimeOffset_", declaredType="U64")
	public UDATA totalCompilationTime() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._totalCompilationTimeOffset_));
	}

	// U64 totalCompilationTime
	public UDATAPointer totalCompilationTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._totalCompilationTimeOffset_));
	}

	// U64 totalJavaThreadsStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalJavaThreadsStartedOffset_", declaredType="U64")
	public UDATA totalJavaThreadsStarted() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JavaLangManagementData._totalJavaThreadsStartedOffset_));
	}

	// U64 totalJavaThreadsStarted
	public UDATAPointer totalJavaThreadsStartedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._totalJavaThreadsStartedOffset_));
	}

	// I64 vmStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmStartTimeOffset_", declaredType="I64")
	public IDATA vmStartTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9JavaLangManagementData._vmStartTimeOffset_));
	}

	// I64 vmStartTime
	public IDATAPointer vmStartTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JavaLangManagementData._vmStartTimeOffset_));
	}

}
