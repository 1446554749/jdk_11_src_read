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
 * Structure: MM_LockingFreeHeapRegionListPointer
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
 * The generated code will provide getters for all elements in the MM_LockingFreeHeapRegionListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_LockingFreeHeapRegionList.class)
public class MM_LockingFreeHeapRegionListPointer extends MM_FreeHeapRegionListPointer {

	// NULL
	public static final MM_LockingFreeHeapRegionListPointer NULL = new MM_LockingFreeHeapRegionListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_LockingFreeHeapRegionListPointer(long address) {
		super(address);
	}

	public static MM_LockingFreeHeapRegionListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_LockingFreeHeapRegionListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_LockingFreeHeapRegionListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_LockingFreeHeapRegionListPointer(address);
	}

	public MM_LockingFreeHeapRegionListPointer add(long count) {
		return MM_LockingFreeHeapRegionListPointer.cast(address + (MM_LockingFreeHeapRegionList.SIZEOF * count));
	}

	public MM_LockingFreeHeapRegionListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_LockingFreeHeapRegionListPointer addOffset(long offset) {
		return MM_LockingFreeHeapRegionListPointer.cast(address + offset);
	}

	public MM_LockingFreeHeapRegionListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_LockingFreeHeapRegionListPointer sub(long count) {
		return MM_LockingFreeHeapRegionListPointer.cast(address - (MM_LockingFreeHeapRegionList.SIZEOF * count));
	}

	public MM_LockingFreeHeapRegionListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_LockingFreeHeapRegionListPointer subOffset(long offset) {
		return MM_LockingFreeHeapRegionListPointer.cast(address - offset);
	}

	public MM_LockingFreeHeapRegionListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_LockingFreeHeapRegionListPointer untag(long mask) {
		return MM_LockingFreeHeapRegionListPointer.cast(address & ~mask);
	}

	public MM_LockingFreeHeapRegionListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_LockingFreeHeapRegionList.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptorSegregated* _head
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _head() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_LockingFreeHeapRegionList.__headOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _head
	public PointerPointer _headEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LockingFreeHeapRegionList.__headOffset_));
	}

	// omrthread_monitor_t _lockMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _lockMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_LockingFreeHeapRegionList.__lockMonitorOffset_));
	}

	// omrthread_monitor_t _lockMonitor
	public PointerPointer _lockMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LockingFreeHeapRegionList.__lockMonitorOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _tail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailOffset_", declaredType="MM_HeapRegionDescriptorSegregated*")
	public MM_HeapRegionDescriptorSegregatedPointer _tail() throws CorruptDataException {
		return MM_HeapRegionDescriptorSegregatedPointer.cast(getPointerAtOffset(MM_LockingFreeHeapRegionList.__tailOffset_));
	}

	// MM_HeapRegionDescriptorSegregated* _tail
	public PointerPointer _tailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LockingFreeHeapRegionList.__tailOffset_));
	}

	// U64 _totalRegionsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionsCountOffset_", declaredType="U64")
	public UDATA _totalRegionsCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LockingFreeHeapRegionList.__totalRegionsCountOffset_));
	}

	// U64 _totalRegionsCount
	public UDATAPointer _totalRegionsCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LockingFreeHeapRegionList.__totalRegionsCountOffset_));
	}

}
