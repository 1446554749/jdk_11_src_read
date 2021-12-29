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
 * Structure: SetSelectionDataPointer
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
 * The generated code will provide getters for all elements in the SetSelectionDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SetSelectionData.class)
public class SetSelectionDataPointer extends StructurePointer {

	// NULL
	public static final SetSelectionDataPointer NULL = new SetSelectionDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SetSelectionDataPointer(long address) {
		super(address);
	}

	public static SetSelectionDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SetSelectionDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SetSelectionDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SetSelectionDataPointer(address);
	}

	public SetSelectionDataPointer add(long count) {
		return SetSelectionDataPointer.cast(address + (SetSelectionData.SIZEOF * count));
	}

	public SetSelectionDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SetSelectionDataPointer addOffset(long offset) {
		return SetSelectionDataPointer.cast(address + offset);
	}

	public SetSelectionDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SetSelectionDataPointer sub(long count) {
		return SetSelectionDataPointer.cast(address - (SetSelectionData.SIZEOF * count));
	}

	public SetSelectionDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SetSelectionDataPointer subOffset(long offset) {
		return SetSelectionDataPointer.cast(address - offset);
	}

	public SetSelectionDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SetSelectionDataPointer untag(long mask) {
		return SetSelectionDataPointer.cast(address & ~mask);
	}

	public SetSelectionDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SetSelectionData.SIZEOF;
	}

	// Implementation methods

	// UDATA _compactGroup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactGroupOffset_", declaredType="UDATA")
	public UDATA _compactGroup() throws CorruptDataException {
		return getUDATAAtOffset(SetSelectionData.__compactGroupOffset_);
	}

	// UDATA _compactGroup
	public UDATAPointer _compactGroupEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SetSelectionData.__compactGroupOffset_));
	}

	// bool _dynamicSelectionThisCycle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSelectionThisCycleOffset_", declaredType="bool")
	public boolean _dynamicSelectionThisCycle() throws CorruptDataException {
		return getBoolAtOffset(SetSelectionData.__dynamicSelectionThisCycleOffset_);
	}

	// bool _dynamicSelectionThisCycle
	public BoolPointer _dynamicSelectionThisCycleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SetSelectionData.__dynamicSelectionThisCycleOffset_));
	}

	// double _rateOfReturn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rateOfReturnOffset_", declaredType="double")
	public double _rateOfReturn() throws CorruptDataException {
		return getDoubleAtOffset(SetSelectionData.__rateOfReturnOffset_);
	}

	// double _rateOfReturn
	public DoublePointer _rateOfReturnEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(SetSelectionData.__rateOfReturnOffset_));
	}

	// RegionReclaimableStats _reclaimStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimStatsOffset_", declaredType="RegionReclaimableStats")
	public RegionReclaimableStatsPointer _reclaimStats() throws CorruptDataException {
		return RegionReclaimableStatsPointer.cast(nonNullFieldEA(SetSelectionData.__reclaimStatsOffset_));
	}

	// RegionReclaimableStats _reclaimStats
	public PointerPointer _reclaimStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SetSelectionData.__reclaimStatsOffset_));
	}

	// UDATA _regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountOffset_", declaredType="UDATA")
	public UDATA _regionCount() throws CorruptDataException {
		return getUDATAAtOffset(SetSelectionData.__regionCountOffset_);
	}

	// UDATA _regionCount
	public UDATAPointer _regionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SetSelectionData.__regionCountOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _regionList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionListOffset_", declaredType="MM_HeapRegionDescriptorVLHGC*")
	public MM_HeapRegionDescriptorVLHGCPointer _regionList() throws CorruptDataException {
		return MM_HeapRegionDescriptorVLHGCPointer.cast(getPointerAtOffset(SetSelectionData.__regionListOffset_));
	}

	// MM_HeapRegionDescriptorVLHGC* _regionList
	public PointerPointer _regionListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SetSelectionData.__regionListOffset_));
	}

}
