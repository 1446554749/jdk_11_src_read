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
 * Structure: ThreadInfoPointer
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
 * The generated code will provide getters for all elements in the ThreadInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ThreadInfo.class)
public class ThreadInfoPointer extends StructurePointer {

	// NULL
	public static final ThreadInfoPointer NULL = new ThreadInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ThreadInfoPointer(long address) {
		super(address);
	}

	public static ThreadInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ThreadInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ThreadInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ThreadInfoPointer(address);
	}

	public ThreadInfoPointer add(long count) {
		return ThreadInfoPointer.cast(address + (ThreadInfo.SIZEOF * count));
	}

	public ThreadInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ThreadInfoPointer addOffset(long offset) {
		return ThreadInfoPointer.cast(address + offset);
	}

	public ThreadInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ThreadInfoPointer sub(long count) {
		return ThreadInfoPointer.cast(address - (ThreadInfo.SIZEOF * count));
	}

	public ThreadInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ThreadInfoPointer subOffset(long offset) {
		return ThreadInfoPointer.cast(address - offset);
	}

	public ThreadInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ThreadInfoPointer untag(long mask) {
		return ThreadInfoPointer.cast(address & ~mask);
	}

	public ThreadInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ThreadInfo.SIZEOF;
	}

	// Implementation methods

	// jlong blockedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockedCountOffset_", declaredType="jlong")
	public IDATA blockedCount() throws CorruptDataException {
		return new I64(getLongAtOffset(ThreadInfo._blockedCountOffset_));
	}

	// jlong blockedCount
	public IDATAPointer blockedCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._blockedCountOffset_));
	}

	// jlong blockedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockedTimeOffset_", declaredType="jlong")
	public IDATA blockedTime() throws CorruptDataException {
		return new I64(getLongAtOffset(ThreadInfo._blockedTimeOffset_));
	}

	// jlong blockedTime
	public IDATAPointer blockedTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._blockedTimeOffset_));
	}

	// jobject blocker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockerOffset_", declaredType="jobject")
	public _jobjectPointer blocker() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(ThreadInfo._blockerOffset_));
	}

	// jobject blocker
	public PointerPointer blockerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._blockerOffset_));
	}

	// jobject blockerOwner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockerOwnerOffset_", declaredType="jobject")
	public _jobjectPointer blockerOwner() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(ThreadInfo._blockerOwnerOffset_));
	}

	// jobject blockerOwner
	public PointerPointer blockerOwnerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._blockerOwnerOffset_));
	}

	// jint jclThreadState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclThreadStateOffset_", declaredType="jint")
	public IDATA jclThreadState() throws CorruptDataException {
		return new I32(getIntAtOffset(ThreadInfo._jclThreadStateOffset_));
	}

	// jint jclThreadState
	public IDATAPointer jclThreadStateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._jclThreadStateOffset_));
	}

	// MonitorInfo* lockedMonitors.arr_safe
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedMonitors$arr_safeOffset_", declaredType="MonitorInfo*")
	public MonitorInfoPointer lockedMonitors$arr_safe() throws CorruptDataException {
		return MonitorInfoPointer.cast(getPointerAtOffset(ThreadInfo._lockedMonitors$arr_safeOffset_));
	}

	// MonitorInfo* lockedMonitors.arr_safe
	public PointerPointer lockedMonitors$arr_safeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._lockedMonitors$arr_safeOffset_));
	}

	// J9ObjectMonitorInfo* lockedMonitors.arr_unsafe
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedMonitors$arr_unsafeOffset_", declaredType="J9ObjectMonitorInfo*")
	public J9ObjectMonitorInfoPointer lockedMonitors$arr_unsafe() throws CorruptDataException {
		return J9ObjectMonitorInfoPointer.cast(getPointerAtOffset(ThreadInfo._lockedMonitors$arr_unsafeOffset_));
	}

	// J9ObjectMonitorInfo* lockedMonitors.arr_unsafe
	public PointerPointer lockedMonitors$arr_unsafeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._lockedMonitors$arr_unsafeOffset_));
	}

	// UDATA lockedMonitors.len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedMonitors$lenOffset_", declaredType="UDATA")
	public UDATA lockedMonitors$len() throws CorruptDataException {
		return getUDATAAtOffset(ThreadInfo._lockedMonitors$lenOffset_);
	}

	// UDATA lockedMonitors.len
	public UDATAPointer lockedMonitors$lenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ThreadInfo._lockedMonitors$lenOffset_));
	}

	// UDATA lockedSynchronizers.len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedSynchronizers$lenOffset_", declaredType="UDATA")
	public UDATA lockedSynchronizers$len() throws CorruptDataException {
		return getUDATAAtOffset(ThreadInfo._lockedSynchronizers$lenOffset_);
	}

	// UDATA lockedSynchronizers.len
	public UDATAPointer lockedSynchronizers$lenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ThreadInfo._lockedSynchronizers$lenOffset_));
	}

	// SynchronizerInfo* lockedSynchronizers.list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedSynchronizers$listOffset_", declaredType="SynchronizerInfo*")
	public SynchronizerInfoPointer lockedSynchronizers$list() throws CorruptDataException {
		return SynchronizerInfoPointer.cast(getPointerAtOffset(ThreadInfo._lockedSynchronizers$listOffset_));
	}

	// SynchronizerInfo* lockedSynchronizers.list
	public PointerPointer lockedSynchronizers$listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._lockedSynchronizers$listOffset_));
	}

	// jlong nativeTID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeTIDOffset_", declaredType="jlong")
	public IDATA nativeTID() throws CorruptDataException {
		return new I64(getLongAtOffset(ThreadInfo._nativeTIDOffset_));
	}

	// jlong nativeTID
	public IDATAPointer nativeTIDEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._nativeTIDOffset_));
	}

	// UDATA stack.len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack$lenOffset_", declaredType="UDATA")
	public UDATA stack$len() throws CorruptDataException {
		return getUDATAAtOffset(ThreadInfo._stack$lenOffset_);
	}

	// UDATA stack.len
	public UDATAPointer stack$lenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ThreadInfo._stack$lenOffset_));
	}

	// UDATA* stack.pcs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stack$pcsOffset_", declaredType="UDATA*")
	public UDATAPointer stack$pcs() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(ThreadInfo._stack$pcsOffset_));
	}

	// UDATA* stack.pcs
	public PointerPointer stack$pcsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._stack$pcsOffset_));
	}

	// jobjectArray stackTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackTraceOffset_", declaredType="jobjectArray")
	public _jobjectArrayPointer stackTrace() throws CorruptDataException {
		return _jobjectArrayPointer.cast(getPointerAtOffset(ThreadInfo._stackTraceOffset_));
	}

	// jobjectArray stackTrace
	public PointerPointer stackTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._stackTraceOffset_));
	}

	// jobject thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadOffset_", declaredType="jobject")
	public _jobjectPointer thread() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(ThreadInfo._threadOffset_));
	}

	// jobject thread
	public PointerPointer threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ThreadInfo._threadOffset_));
	}

	// UDATA vmstate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmstateOffset_", declaredType="UDATA")
	public UDATA vmstate() throws CorruptDataException {
		return getUDATAAtOffset(ThreadInfo._vmstateOffset_);
	}

	// UDATA vmstate
	public UDATAPointer vmstateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ThreadInfo._vmstateOffset_));
	}

	// jlong waitedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitedCountOffset_", declaredType="jlong")
	public IDATA waitedCount() throws CorruptDataException {
		return new I64(getLongAtOffset(ThreadInfo._waitedCountOffset_));
	}

	// jlong waitedCount
	public IDATAPointer waitedCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._waitedCountOffset_));
	}

	// jlong waitedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitedTimeOffset_", declaredType="jlong")
	public IDATA waitedTime() throws CorruptDataException {
		return new I64(getLongAtOffset(ThreadInfo._waitedTimeOffset_));
	}

	// jlong waitedTime
	public IDATAPointer waitedTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ThreadInfo._waitedTimeOffset_));
	}

}
