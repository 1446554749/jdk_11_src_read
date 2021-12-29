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
 * Structure: MM_VLHGCCycleStatsPointer
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
 * The generated code will provide getters for all elements in the MM_VLHGCCycleStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VLHGCCycleStats.class)
public class MM_VLHGCCycleStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_VLHGCCycleStatsPointer NULL = new MM_VLHGCCycleStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VLHGCCycleStatsPointer(long address) {
		super(address);
	}

	public static MM_VLHGCCycleStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VLHGCCycleStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VLHGCCycleStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VLHGCCycleStatsPointer(address);
	}

	public MM_VLHGCCycleStatsPointer add(long count) {
		return MM_VLHGCCycleStatsPointer.cast(address + (MM_VLHGCCycleStats.SIZEOF * count));
	}

	public MM_VLHGCCycleStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VLHGCCycleStatsPointer addOffset(long offset) {
		return MM_VLHGCCycleStatsPointer.cast(address + offset);
	}

	public MM_VLHGCCycleStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VLHGCCycleStatsPointer sub(long count) {
		return MM_VLHGCCycleStatsPointer.cast(address - (MM_VLHGCCycleStats.SIZEOF * count));
	}

	public MM_VLHGCCycleStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VLHGCCycleStatsPointer subOffset(long offset) {
		return MM_VLHGCCycleStatsPointer.cast(address - offset);
	}

	public MM_VLHGCCycleStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VLHGCCycleStatsPointer untag(long mask) {
		return MM_VLHGCCycleStatsPointer.cast(address & ~mask);
	}

	public MM_VLHGCCycleStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VLHGCCycleStats.SIZEOF;
	}

	// Implementation methods

	// MM_MarkVLHGCStats _concurrentMarkStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentMarkStatsOffset_", declaredType="MM_MarkVLHGCStats")
	public MM_MarkVLHGCStatsPointer _concurrentMarkStats() throws CorruptDataException {
		return MM_MarkVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__concurrentMarkStatsOffset_));
	}

	// MM_MarkVLHGCStats _concurrentMarkStats
	public PointerPointer _concurrentMarkStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__concurrentMarkStatsOffset_));
	}

	// MM_MarkVLHGCStats _incrementalMarkStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementalMarkStatsOffset_", declaredType="MM_MarkVLHGCStats")
	public MM_MarkVLHGCStatsPointer _incrementalMarkStats() throws CorruptDataException {
		return MM_MarkVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__incrementalMarkStatsOffset_));
	}

	// MM_MarkVLHGCStats _incrementalMarkStats
	public PointerPointer _incrementalMarkStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__incrementalMarkStatsOffset_));
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__irrsStatsOffset_", declaredType="MM_InterRegionRememberedSetStats")
	public MM_InterRegionRememberedSetStatsPointer _irrsStats() throws CorruptDataException {
		return MM_InterRegionRememberedSetStatsPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__irrsStatsOffset_));
	}

	// MM_InterRegionRememberedSetStats _irrsStats
	public PointerPointer _irrsStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__irrsStatsOffset_));
	}

	// MM_MarkVLHGCStats _markStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markStatsOffset_", declaredType="MM_MarkVLHGCStats")
	public MM_MarkVLHGCStatsPointer _markStats() throws CorruptDataException {
		return MM_MarkVLHGCStatsPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__markStatsOffset_));
	}

	// MM_MarkVLHGCStats _markStats
	public PointerPointer _markStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__markStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketStatsOffset_", declaredType="MM_WorkPacketStats")
	public MM_WorkPacketStatsPointer _workPacketStats() throws CorruptDataException {
		return MM_WorkPacketStatsPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__workPacketStatsOffset_));
	}

	// MM_WorkPacketStats _workPacketStats
	public PointerPointer _workPacketStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VLHGCCycleStats.__workPacketStatsOffset_));
	}

}
