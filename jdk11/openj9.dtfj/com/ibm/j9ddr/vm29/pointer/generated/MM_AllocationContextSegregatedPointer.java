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
 * Structure: MM_AllocationContextSegregatedPointer
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
 * The generated code will provide getters for all elements in the MM_AllocationContextSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_AllocationContextSegregated.class)
public class MM_AllocationContextSegregatedPointer extends MM_AllocationContextPointer {

	// NULL
	public static final MM_AllocationContextSegregatedPointer NULL = new MM_AllocationContextSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_AllocationContextSegregatedPointer(long address) {
		super(address);
	}

	public static MM_AllocationContextSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_AllocationContextSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_AllocationContextSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_AllocationContextSegregatedPointer(address);
	}

	public MM_AllocationContextSegregatedPointer add(long count) {
		return MM_AllocationContextSegregatedPointer.cast(address + (MM_AllocationContextSegregated.SIZEOF * count));
	}

	public MM_AllocationContextSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_AllocationContextSegregatedPointer addOffset(long offset) {
		return MM_AllocationContextSegregatedPointer.cast(address + offset);
	}

	public MM_AllocationContextSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_AllocationContextSegregatedPointer sub(long count) {
		return MM_AllocationContextSegregatedPointer.cast(address - (MM_AllocationContextSegregated.SIZEOF * count));
	}

	public MM_AllocationContextSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_AllocationContextSegregatedPointer subOffset(long offset) {
		return MM_AllocationContextSegregatedPointer.cast(address - offset);
	}

	public MM_AllocationContextSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_AllocationContextSegregatedPointer untag(long mask) {
		return MM_AllocationContextSegregatedPointer.cast(address & ~mask);
	}

	public MM_AllocationContextSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_AllocationContextSegregated.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptorSegregated* _arrayletRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletRegionOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _arrayletRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__arrayletRegionOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _arrayletRegion
	public PointerPointer _arrayletRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__arrayletRegionOffset_));
	}

	// volatile U32 _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="volatile U32")
	public UDATA _count() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_AllocationContextSegregated.__countOffset_));
	}

	// volatile U32 _count
	public UDATAPointer _countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__countOffset_));
	}

	// MM_SegregatedMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_SegregatedMarkingScheme*")
	public MM_SegregatedMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_SegregatedMarkingSchemePointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__markingSchemeOffset_));
	}

	// MM_SegregatedMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__markingSchemeOffset_));
	}

	// omrthread_monitor_t _mutexArrayletAllocations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutexArrayletAllocationsOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mutexArrayletAllocations() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__mutexArrayletAllocationsOffset_));
	}

	// omrthread_monitor_t _mutexArrayletAllocations
	public PointerPointer _mutexArrayletAllocationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__mutexArrayletAllocationsOffset_));
	}

	// omrthread_monitor_t _mutexSmallAllocations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutexSmallAllocationsOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mutexSmallAllocations() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__mutexSmallAllocationsOffset_));
	}

	// omrthread_monitor_t _mutexSmallAllocations
	public PointerPointer _mutexSmallAllocationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__mutexSmallAllocationsOffset_));
	}

	// MM_HeapRegionQueue* _perContextArrayletFullRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__perContextArrayletFullRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _perContextArrayletFullRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__perContextArrayletFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _perContextArrayletFullRegions
	public PointerPointer _perContextArrayletFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__perContextArrayletFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _perContextLargeFullRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__perContextLargeFullRegionsOffset_", declaredType="MM_HeapRegionQueue*")
	public MM_HeapRegionQueuePointer _perContextLargeFullRegions() throws CorruptDataException {
		return MM_HeapRegionQueuePointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__perContextLargeFullRegionsOffset_));
	}

	// MM_HeapRegionQueue* _perContextLargeFullRegions
	public PointerPointer _perContextLargeFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__perContextLargeFullRegionsOffset_));
	}

	// MM_HeapRegionQueue*[] _perContextSmallFullRegions
	public PointerPointer _perContextSmallFullRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__perContextSmallFullRegionsOffset_));
	}

	// MM_RegionPoolSegregated* _regionPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionPoolOffset_", declaredType="MM_RegionPoolSegregated*")
	public MM_RegionPoolSegregatedPointer _regionPool() throws CorruptDataException {
		return MM_RegionPoolSegregatedPointer.cast(getPointerAtOffset(MM_AllocationContextSegregated.__regionPoolOffset_));
	}

	// MM_RegionPoolSegregated* _regionPool
	public PointerPointer _regionPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__regionPoolOffset_));
	}

	// MM_HeapRegionDescriptorSegregated*[] _smallRegions
	public PointerPointer _smallRegionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocationContextSegregated.__smallRegionsOffset_));
	}

}
