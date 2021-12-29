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
 * Structure: MM_EnvironmentRealtimePointer
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
 * The generated code will provide getters for all elements in the MM_EnvironmentRealtimePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_EnvironmentRealtime.class)
public class MM_EnvironmentRealtimePointer extends MM_EnvironmentBasePointer {

	// NULL
	public static final MM_EnvironmentRealtimePointer NULL = new MM_EnvironmentRealtimePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_EnvironmentRealtimePointer(long address) {
		super(address);
	}

	public static MM_EnvironmentRealtimePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_EnvironmentRealtimePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_EnvironmentRealtimePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_EnvironmentRealtimePointer(address);
	}

	public MM_EnvironmentRealtimePointer add(long count) {
		return MM_EnvironmentRealtimePointer.cast(address + (MM_EnvironmentRealtime.SIZEOF * count));
	}

	public MM_EnvironmentRealtimePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_EnvironmentRealtimePointer addOffset(long offset) {
		return MM_EnvironmentRealtimePointer.cast(address + offset);
	}

	public MM_EnvironmentRealtimePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_EnvironmentRealtimePointer sub(long count) {
		return MM_EnvironmentRealtimePointer.cast(address - (MM_EnvironmentRealtime.SIZEOF * count));
	}

	public MM_EnvironmentRealtimePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_EnvironmentRealtimePointer subOffset(long offset) {
		return MM_EnvironmentRealtimePointer.cast(address - offset);
	}

	public MM_EnvironmentRealtimePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_EnvironmentRealtimePointer untag(long mask) {
		return MM_EnvironmentRealtimePointer.cast(address & ~mask);
	}

	public MM_EnvironmentRealtimePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_EnvironmentRealtime.SIZEOF;
	}

	// Implementation methods

	// U32 _currentDistanceToYieldTimeCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentDistanceToYieldTimeCheckOffset_", declaredType="U32")
	public UDATA _currentDistanceToYieldTimeCheck() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_EnvironmentRealtime.__currentDistanceToYieldTimeCheckOffset_));
	}

	// U32 _currentDistanceToYieldTimeCheck
	public UDATAPointer _currentDistanceToYieldTimeCheckEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__currentDistanceToYieldTimeCheckOffset_));
	}

	// U32 _distanceToYieldTimeCheck
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__distanceToYieldTimeCheckOffset_", declaredType="U32")
	public UDATA _distanceToYieldTimeCheck() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_EnvironmentRealtime.__distanceToYieldTimeCheckOffset_));
	}

	// U32 _distanceToYieldTimeCheck
	public UDATAPointer _distanceToYieldTimeCheckEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__distanceToYieldTimeCheckOffset_));
	}

	// volatile U32 _monitorCacheCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__monitorCacheClearedOffset_", declaredType="volatile U32")
	public UDATA _monitorCacheCleared() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_EnvironmentRealtime.__monitorCacheClearedOffset_));
	}

	// volatile U32 _monitorCacheCleared
	public UDATAPointer _monitorCacheClearedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__monitorCacheClearedOffset_));
	}

	// MM_OSInterface* _osInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__osInterfaceOffset_", declaredType="MM_OSInterface*")
	public MM_OSInterfacePointer _osInterface() throws CorruptDataException {
		return MM_OSInterfacePointer.cast(getPointerAtOffset(MM_EnvironmentRealtime.__osInterfaceOffset_));
	}

	// MM_OSInterface* _osInterface
	public PointerPointer _osInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__osInterfaceOffset_));
	}

	// void** _overflowCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowCacheOffset_", declaredType="void**")
	public PointerPointer _overflowCache() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_EnvironmentRealtime.__overflowCacheOffset_));
	}

	// void** _overflowCache
	public PointerPointer _overflowCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__overflowCacheOffset_));
	}

	// U64 _overflowCacheCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowCacheCountOffset_", declaredType="U64")
	public UDATA _overflowCacheCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentRealtime.__overflowCacheCountOffset_));
	}

	// U64 _overflowCacheCount
	public UDATAPointer _overflowCacheCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__overflowCacheCountOffset_));
	}

	// MM_RealtimeRootScanner* _rootScanner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootScannerOffset_", declaredType="MM_RealtimeRootScanner*")
	public MM_RealtimeRootScannerPointer _rootScanner() throws CorruptDataException {
		return MM_RealtimeRootScannerPointer.cast(getPointerAtOffset(MM_EnvironmentRealtime.__rootScannerOffset_));
	}

	// MM_RealtimeRootScanner* _rootScanner
	public PointerPointer _rootScannerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__rootScannerOffset_));
	}

	// U64 _scannedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannedObjectsOffset_", declaredType="U64")
	public UDATA _scannedObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_EnvironmentRealtime.__scannedObjectsOffset_));
	}

	// U64 _scannedObjects
	public UDATAPointer _scannedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__scannedObjectsOffset_));
	}

	// MM_Scheduler* _scheduler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__schedulerOffset_", declaredType="MM_Scheduler*")
	public MM_SchedulerPointer _scheduler() throws CorruptDataException {
		return MM_SchedulerPointer.cast(getPointerAtOffset(MM_EnvironmentRealtime.__schedulerOffset_));
	}

	// MM_Scheduler* _scheduler
	public PointerPointer _schedulerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__schedulerOffset_));
	}

	// MM_Timer* _timer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timerOffset_", declaredType="MM_Timer*")
	public MM_TimerPointer _timer() throws CorruptDataException {
		return MM_TimerPointer.cast(getPointerAtOffset(MM_EnvironmentRealtime.__timerOffset_));
	}

	// MM_Timer* _timer
	public PointerPointer _timerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__timerOffset_));
	}

	// I32 _yieldDisableDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__yieldDisableDepthOffset_", declaredType="I32")
	public IDATA _yieldDisableDepth() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_EnvironmentRealtime.__yieldDisableDepthOffset_));
	}

	// I32 _yieldDisableDepth
	public IDATAPointer _yieldDisableDepthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_EnvironmentRealtime.__yieldDisableDepthOffset_));
	}

}
