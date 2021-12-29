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
 * Structure: MM_CollectionSetDelegate$RegionReclaimableStatsPointer
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
 * The generated code will provide getters for all elements in the MM_CollectionSetDelegate$RegionReclaimableStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CollectionSetDelegate$RegionReclaimableStats.class)
public class MM_CollectionSetDelegate$RegionReclaimableStatsPointer extends StructurePointer {

	// NULL
	public static final MM_CollectionSetDelegate$RegionReclaimableStatsPointer NULL = new MM_CollectionSetDelegate$RegionReclaimableStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CollectionSetDelegate$RegionReclaimableStatsPointer(long address) {
		super(address);
	}

	public static MM_CollectionSetDelegate$RegionReclaimableStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CollectionSetDelegate$RegionReclaimableStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CollectionSetDelegate$RegionReclaimableStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CollectionSetDelegate$RegionReclaimableStatsPointer(address);
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer add(long count) {
		return MM_CollectionSetDelegate$RegionReclaimableStatsPointer.cast(address + (MM_CollectionSetDelegate$RegionReclaimableStats.SIZEOF * count));
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer addOffset(long offset) {
		return MM_CollectionSetDelegate$RegionReclaimableStatsPointer.cast(address + offset);
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer sub(long count) {
		return MM_CollectionSetDelegate$RegionReclaimableStatsPointer.cast(address - (MM_CollectionSetDelegate$RegionReclaimableStats.SIZEOF * count));
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer subOffset(long offset) {
		return MM_CollectionSetDelegate$RegionReclaimableStatsPointer.cast(address - offset);
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer untag(long mask) {
		return MM_CollectionSetDelegate$RegionReclaimableStatsPointer.cast(address & ~mask);
	}

	public MM_CollectionSetDelegate$RegionReclaimableStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CollectionSetDelegate$RegionReclaimableStats.SIZEOF;
	}

	// Implementation methods

	// UDATA _reclaimableBytesConsumedAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableBytesConsumedAfterOffset_", declaredType="UDATA")
	public UDATA _reclaimableBytesConsumedAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableBytesConsumedAfterOffset_);
	}

	// UDATA _reclaimableBytesConsumedAfter
	public UDATAPointer _reclaimableBytesConsumedAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableBytesConsumedAfterOffset_));
	}

	// UDATA _reclaimableBytesConsumedBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableBytesConsumedBeforeOffset_", declaredType="UDATA")
	public UDATA _reclaimableBytesConsumedBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableBytesConsumedBeforeOffset_);
	}

	// UDATA _reclaimableBytesConsumedBefore
	public UDATAPointer _reclaimableBytesConsumedBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableBytesConsumedBeforeOffset_));
	}

	// UDATA _reclaimableRegionCountAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableRegionCountAfterOffset_", declaredType="UDATA")
	public UDATA _reclaimableRegionCountAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountAfterOffset_);
	}

	// UDATA _reclaimableRegionCountAfter
	public UDATAPointer _reclaimableRegionCountAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountAfterOffset_));
	}

	// UDATA _reclaimableRegionCountArrayletLeafAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableRegionCountArrayletLeafAfterOffset_", declaredType="UDATA")
	public UDATA _reclaimableRegionCountArrayletLeafAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountArrayletLeafAfterOffset_);
	}

	// UDATA _reclaimableRegionCountArrayletLeafAfter
	public UDATAPointer _reclaimableRegionCountArrayletLeafAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountArrayletLeafAfterOffset_));
	}

	// UDATA _reclaimableRegionCountArrayletLeafBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableRegionCountArrayletLeafBeforeOffset_", declaredType="UDATA")
	public UDATA _reclaimableRegionCountArrayletLeafBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountArrayletLeafBeforeOffset_);
	}

	// UDATA _reclaimableRegionCountArrayletLeafBefore
	public UDATAPointer _reclaimableRegionCountArrayletLeafBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountArrayletLeafBeforeOffset_));
	}

	// UDATA _reclaimableRegionCountBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reclaimableRegionCountBeforeOffset_", declaredType="UDATA")
	public UDATA _reclaimableRegionCountBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountBeforeOffset_);
	}

	// UDATA _reclaimableRegionCountBefore
	public UDATAPointer _reclaimableRegionCountBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__reclaimableRegionCountBeforeOffset_));
	}

	// UDATA _regionBytesFreeAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionBytesFreeAfterOffset_", declaredType="UDATA")
	public UDATA _regionBytesFreeAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionBytesFreeAfterOffset_);
	}

	// UDATA _regionBytesFreeAfter
	public UDATAPointer _regionBytesFreeAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionBytesFreeAfterOffset_));
	}

	// UDATA _regionBytesFreeBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionBytesFreeBeforeOffset_", declaredType="UDATA")
	public UDATA _regionBytesFreeBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionBytesFreeBeforeOffset_);
	}

	// UDATA _regionBytesFreeBefore
	public UDATAPointer _regionBytesFreeBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionBytesFreeBeforeOffset_));
	}

	// UDATA _regionCountAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountAfterOffset_", declaredType="UDATA")
	public UDATA _regionCountAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountAfterOffset_);
	}

	// UDATA _regionCountAfter
	public UDATAPointer _regionCountAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountAfterOffset_));
	}

	// UDATA _regionCountArrayletLeafAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountArrayletLeafAfterOffset_", declaredType="UDATA")
	public UDATA _regionCountArrayletLeafAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafAfterOffset_);
	}

	// UDATA _regionCountArrayletLeafAfter
	public UDATAPointer _regionCountArrayletLeafAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafAfterOffset_));
	}

	// UDATA _regionCountArrayletLeafBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountArrayletLeafBeforeOffset_", declaredType="UDATA")
	public UDATA _regionCountArrayletLeafBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafBeforeOffset_);
	}

	// UDATA _regionCountArrayletLeafBefore
	public UDATAPointer _regionCountArrayletLeafBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafBeforeOffset_));
	}

	// UDATA _regionCountArrayletLeafOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountArrayletLeafOverflowOffset_", declaredType="UDATA")
	public UDATA _regionCountArrayletLeafOverflow() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafOverflowOffset_);
	}

	// UDATA _regionCountArrayletLeafOverflow
	public UDATAPointer _regionCountArrayletLeafOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountArrayletLeafOverflowOffset_));
	}

	// UDATA _regionCountBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountBeforeOffset_", declaredType="UDATA")
	public UDATA _regionCountBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountBeforeOffset_);
	}

	// UDATA _regionCountBefore
	public UDATAPointer _regionCountBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountBeforeOffset_));
	}

	// UDATA _regionCountOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionCountOverflowOffset_", declaredType="UDATA")
	public UDATA _regionCountOverflow() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountOverflowOffset_);
	}

	// UDATA _regionCountOverflow
	public UDATAPointer _regionCountOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionCountOverflowOffset_));
	}

	// UDATA _regionDarkMatterAfter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionDarkMatterAfterOffset_", declaredType="UDATA")
	public UDATA _regionDarkMatterAfter() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionDarkMatterAfterOffset_);
	}

	// UDATA _regionDarkMatterAfter
	public UDATAPointer _regionDarkMatterAfterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionDarkMatterAfterOffset_));
	}

	// UDATA _regionDarkMatterBefore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionDarkMatterBeforeOffset_", declaredType="UDATA")
	public UDATA _regionDarkMatterBefore() throws CorruptDataException {
		return getUDATAAtOffset(MM_CollectionSetDelegate$RegionReclaimableStats.__regionDarkMatterBeforeOffset_);
	}

	// UDATA _regionDarkMatterBefore
	public UDATAPointer _regionDarkMatterBeforeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionSetDelegate$RegionReclaimableStats.__regionDarkMatterBeforeOffset_));
	}

}
