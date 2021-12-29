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
 * Structure: MM_ParallelDispatcherPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelDispatcherPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelDispatcher.class)
public class MM_ParallelDispatcherPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_ParallelDispatcherPointer NULL = new MM_ParallelDispatcherPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelDispatcherPointer(long address) {
		super(address);
	}

	public static MM_ParallelDispatcherPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelDispatcherPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelDispatcherPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelDispatcherPointer(address);
	}

	public MM_ParallelDispatcherPointer add(long count) {
		return MM_ParallelDispatcherPointer.cast(address + (MM_ParallelDispatcher.SIZEOF * count));
	}

	public MM_ParallelDispatcherPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelDispatcherPointer addOffset(long offset) {
		return MM_ParallelDispatcherPointer.cast(address + offset);
	}

	public MM_ParallelDispatcherPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelDispatcherPointer sub(long count) {
		return MM_ParallelDispatcherPointer.cast(address - (MM_ParallelDispatcher.SIZEOF * count));
	}

	public MM_ParallelDispatcherPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelDispatcherPointer subOffset(long offset) {
		return MM_ParallelDispatcherPointer.cast(address - offset);
	}

	public MM_ParallelDispatcherPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelDispatcherPointer untag(long mask) {
		return MM_ParallelDispatcherPointer.cast(address & ~mask);
	}

	public MM_ParallelDispatcherPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelDispatcher.SIZEOF;
	}

	// Implementation methods

	// U64 _activeThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeThreadCountOffset_", declaredType="U64")
	public UDATA _activeThreadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__activeThreadCountOffset_));
	}

	// U64 _activeThreadCount
	public UDATAPointer _activeThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__activeThreadCountOffset_));
	}

	// U64 _defaultOSStackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultOSStackSizeOffset_", declaredType="U64")
	public UDATA _defaultOSStackSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__defaultOSStackSizeOffset_));
	}

	// U64 _defaultOSStackSize
	public UDATAPointer _defaultOSStackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__defaultOSStackSizeOffset_));
	}

	// omrthread_monitor_t _dispatcherMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _dispatcherMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__dispatcherMonitorOffset_));
	}

	// omrthread_monitor_t _dispatcherMonitor
	public PointerPointer _dispatcherMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__dispatcherMonitorOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__extensionsOffset_));
	}

	// omrsig_handler_fn _handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__handlerOffset_", declaredType="omrsig_handler_fn")
	public VoidPointer _handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__handlerOffset_));
	}

	// omrsig_handler_fn _handler
	public PointerPointer _handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__handlerOffset_));
	}

	// void* _handler_arg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__handler_argOffset_", declaredType="void*")
	public VoidPointer _handler_arg() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__handler_argOffset_));
	}

	// void* _handler_arg
	public PointerPointer _handler_argEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__handler_argOffset_));
	}

	// bool _inShutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inShutdownOffset_", declaredType="bool")
	public boolean _inShutdown() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelDispatcher.__inShutdownOffset_);
	}

	// bool _inShutdown
	public BoolPointer _inShutdownEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__inShutdownOffset_));
	}

	// U64* _statusTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__statusTableOffset_", declaredType="U64*")
	public UDATAPointer _statusTable() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__statusTableOffset_));
	}

	// U64* _statusTable
	public PointerPointer _statusTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__statusTableOffset_));
	}

	// omrthread_monitor_t _synchronizeMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__synchronizeMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _synchronizeMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__synchronizeMutexOffset_));
	}

	// omrthread_monitor_t _synchronizeMutex
	public PointerPointer _synchronizeMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__synchronizeMutexOffset_));
	}

	// MM_Task* _task
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__taskOffset_", declaredType="MM_Task*")
	public MM_TaskPointer _task() throws CorruptDataException {
		return MM_TaskPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__taskOffset_));
	}

	// MM_Task* _task
	public PointerPointer _taskEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__taskOffset_));
	}

	// void** _taskTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__taskTableOffset_", declaredType="void**")
	public PointerPointer _taskTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__taskTableOffset_));
	}

	// void** _taskTable
	public PointerPointer _taskTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__taskTableOffset_));
	}

	// U64 _threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountOffset_", declaredType="U64")
	public UDATA _threadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__threadCountOffset_));
	}

	// U64 _threadCount
	public UDATAPointer _threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__threadCountOffset_));
	}

	// U64 _threadCountMaximum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountMaximumOffset_", declaredType="U64")
	public UDATA _threadCountMaximum() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__threadCountMaximumOffset_));
	}

	// U64 _threadCountMaximum
	public UDATAPointer _threadCountMaximumEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__threadCountMaximumOffset_));
	}

	// U64 _threadShutdownCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadShutdownCountOffset_", declaredType="U64")
	public UDATA _threadShutdownCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__threadShutdownCountOffset_));
	}

	// U64 _threadShutdownCount
	public UDATAPointer _threadShutdownCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__threadShutdownCountOffset_));
	}

	// omrthread_t* _threadTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadTableOffset_", declaredType="omrthread_t*")
	public PointerPointer _threadTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__threadTableOffset_));
	}

	// omrthread_t* _threadTable
	public PointerPointer _threadTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__threadTableOffset_));
	}

	// U64 _threadsToReserve
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsToReserveOffset_", declaredType="U64")
	public UDATA _threadsToReserve() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelDispatcher.__threadsToReserveOffset_));
	}

	// U64 _threadsToReserve
	public UDATAPointer _threadsToReserveEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__threadsToReserveOffset_));
	}

	// omrthread_monitor_t _workerThreadMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workerThreadMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _workerThreadMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ParallelDispatcher.__workerThreadMutexOffset_));
	}

	// omrthread_monitor_t _workerThreadMutex
	public PointerPointer _workerThreadMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__workerThreadMutexOffset_));
	}

	// bool _workerThreadsReservedForGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workerThreadsReservedForGCOffset_", declaredType="bool")
	public boolean _workerThreadsReservedForGC() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelDispatcher.__workerThreadsReservedForGCOffset_);
	}

	// bool _workerThreadsReservedForGC
	public BoolPointer _workerThreadsReservedForGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelDispatcher.__workerThreadsReservedForGCOffset_));
	}

}
