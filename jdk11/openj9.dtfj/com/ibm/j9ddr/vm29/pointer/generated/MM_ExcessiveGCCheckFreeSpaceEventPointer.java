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
 * Structure: MM_ExcessiveGCCheckFreeSpaceEventPointer
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
 * The generated code will provide getters for all elements in the MM_ExcessiveGCCheckFreeSpaceEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ExcessiveGCCheckFreeSpaceEvent.class)
public class MM_ExcessiveGCCheckFreeSpaceEventPointer extends StructurePointer {

	// NULL
	public static final MM_ExcessiveGCCheckFreeSpaceEventPointer NULL = new MM_ExcessiveGCCheckFreeSpaceEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ExcessiveGCCheckFreeSpaceEventPointer(long address) {
		super(address);
	}

	public static MM_ExcessiveGCCheckFreeSpaceEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ExcessiveGCCheckFreeSpaceEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ExcessiveGCCheckFreeSpaceEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ExcessiveGCCheckFreeSpaceEventPointer(address);
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer add(long count) {
		return MM_ExcessiveGCCheckFreeSpaceEventPointer.cast(address + (MM_ExcessiveGCCheckFreeSpaceEvent.SIZEOF * count));
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer addOffset(long offset) {
		return MM_ExcessiveGCCheckFreeSpaceEventPointer.cast(address + offset);
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer sub(long count) {
		return MM_ExcessiveGCCheckFreeSpaceEventPointer.cast(address - (MM_ExcessiveGCCheckFreeSpaceEvent.SIZEOF * count));
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer subOffset(long offset) {
		return MM_ExcessiveGCCheckFreeSpaceEventPointer.cast(address - offset);
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer untag(long mask) {
		return MM_ExcessiveGCCheckFreeSpaceEventPointer.cast(address & ~mask);
	}

	public MM_ExcessiveGCCheckFreeSpaceEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ExcessiveGCCheckFreeSpaceEvent.SIZEOF;
	}

	// Implementation methods

	// U64 activeHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeHeapSizeOffset_", declaredType="U64")
	public UDATA activeHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._activeHeapSizeOffset_));
	}

	// U64 activeHeapSize
	public UDATAPointer activeHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._activeHeapSizeOffset_));
	}

	// float averageGCPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_averageGCPercentOffset_", declaredType="float")
	public float averageGCPercent() throws CorruptDataException {
		return getFloatAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._averageGCPercentOffset_);
	}

	// float averageGCPercent
	public FloatPointer averageGCPercentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._averageGCPercentOffset_));
	}

	// U64 currentHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentHeapSizeOffset_", declaredType="U64")
	public UDATA currentHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._currentHeapSizeOffset_));
	}

	// U64 currentHeapSize
	public UDATAPointer currentHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._currentHeapSizeOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._eventidOffset_));
	}

	// float excessiveGCPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_excessiveGCPercentOffset_", declaredType="float")
	public float excessiveGCPercent() throws CorruptDataException {
		return getFloatAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._excessiveGCPercentOffset_);
	}

	// float excessiveGCPercent
	public FloatPointer excessiveGCPercentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._excessiveGCPercentOffset_));
	}

	// U64 freeMemoryDelta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeMemoryDeltaOffset_", declaredType="U64")
	public UDATA freeMemoryDelta() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._freeMemoryDeltaOffset_));
	}

	// U64 freeMemoryDelta
	public UDATAPointer freeMemoryDeltaEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._freeMemoryDeltaOffset_));
	}

	// U64 gcCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCountOffset_", declaredType="U64")
	public UDATA gcCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._gcCountOffset_));
	}

	// U64 gcCount
	public UDATAPointer gcCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._gcCountOffset_));
	}

	// U64 maximumHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maximumHeapSizeOffset_", declaredType="U64")
	public UDATA maximumHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._maximumHeapSizeOffset_));
	}

	// U64 maximumHeapSize
	public UDATAPointer maximumHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._maximumHeapSizeOffset_));
	}

	// float newGCPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newGCPercentOffset_", declaredType="float")
	public float newGCPercent() throws CorruptDataException {
		return getFloatAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._newGCPercentOffset_);
	}

	// float newGCPercent
	public FloatPointer newGCPercentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._newGCPercentOffset_));
	}

	// float reclaimedPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reclaimedPercentOffset_", declaredType="float")
	public float reclaimedPercent() throws CorruptDataException {
		return getFloatAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._reclaimedPercentOffset_);
	}

	// float reclaimedPercent
	public FloatPointer reclaimedPercentEA() throws CorruptDataException {
		return FloatPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._reclaimedPercentOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExcessiveGCCheckFreeSpaceEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExcessiveGCCheckFreeSpaceEvent._timestampOffset_));
	}

}
