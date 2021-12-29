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
 * Structure: MM_ConcurrentSweepSchemePointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentSweepSchemePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentSweepScheme.class)
public class MM_ConcurrentSweepSchemePointer extends MM_ParallelSweepSchemePointer {

	// NULL
	public static final MM_ConcurrentSweepSchemePointer NULL = new MM_ConcurrentSweepSchemePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentSweepSchemePointer(long address) {
		super(address);
	}

	public static MM_ConcurrentSweepSchemePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentSweepSchemePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentSweepSchemePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentSweepSchemePointer(address);
	}

	public MM_ConcurrentSweepSchemePointer add(long count) {
		return MM_ConcurrentSweepSchemePointer.cast(address + (MM_ConcurrentSweepScheme.SIZEOF * count));
	}

	public MM_ConcurrentSweepSchemePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentSweepSchemePointer addOffset(long offset) {
		return MM_ConcurrentSweepSchemePointer.cast(address + offset);
	}

	public MM_ConcurrentSweepSchemePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentSweepSchemePointer sub(long count) {
		return MM_ConcurrentSweepSchemePointer.cast(address - (MM_ConcurrentSweepScheme.SIZEOF * count));
	}

	public MM_ConcurrentSweepSchemePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentSweepSchemePointer subOffset(long offset) {
		return MM_ConcurrentSweepSchemePointer.cast(address - offset);
	}

	public MM_ConcurrentSweepSchemePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentSweepSchemePointer untag(long mask) {
		return MM_ConcurrentSweepSchemePointer.cast(address & ~mask);
	}

	public MM_ConcurrentSweepSchemePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentSweepScheme.SIZEOF;
	}

	// Implementation methods

	// MM_GlobalCollector* _collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorOffset_", declaredType="MM_GlobalCollector*")
	public MM_GlobalCollectorPointer _collector() throws CorruptDataException {
		return MM_GlobalCollectorPointer.cast(getPointerAtOffset(MM_ConcurrentSweepScheme.__collectorOffset_));
	}

	// MM_GlobalCollector* _collector
	public PointerPointer _collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepScheme.__collectorOffset_));
	}

	// omrthread_monitor_t _completeSweepingConcurrentlyLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeSweepingConcurrentlyLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _completeSweepingConcurrentlyLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ConcurrentSweepScheme.__completeSweepingConcurrentlyLockOffset_));
	}

	// omrthread_monitor_t _completeSweepingConcurrentlyLock
	public PointerPointer _completeSweepingConcurrentlyLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepScheme.__completeSweepingConcurrentlyLockOffset_));
	}

	// volatile UDATA _concurrentSweepingThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentSweepingThreadCountOffset_", declaredType="volatile UDATA")
	public UDATA _concurrentSweepingThreadCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentSweepScheme.__concurrentSweepingThreadCountOffset_);
	}

	// volatile UDATA _concurrentSweepingThreadCount
	public UDATAPointer _concurrentSweepingThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentSweepScheme.__concurrentSweepingThreadCountOffset_));
	}

	// MM_ConcurrentSweepStats _stats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__statsOffset_", declaredType="MM_ConcurrentSweepStats")
	public MM_ConcurrentSweepStatsPointer _stats() throws CorruptDataException {
		return MM_ConcurrentSweepStatsPointer.cast(nonNullFieldEA(MM_ConcurrentSweepScheme.__statsOffset_));
	}

	// MM_ConcurrentSweepStats _stats
	public PointerPointer _statsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentSweepScheme.__statsOffset_));
	}

}
