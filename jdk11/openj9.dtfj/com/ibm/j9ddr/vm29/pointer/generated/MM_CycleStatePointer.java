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
 * Structure: MM_CycleStatePointer
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
 * The generated code will provide getters for all elements in the MM_CycleStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CycleState.class)
public class MM_CycleStatePointer extends StructurePointer {

	// NULL
	public static final MM_CycleStatePointer NULL = new MM_CycleStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CycleStatePointer(long address) {
		super(address);
	}

	public static MM_CycleStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CycleStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CycleStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CycleStatePointer(address);
	}

	public MM_CycleStatePointer add(long count) {
		return MM_CycleStatePointer.cast(address + (MM_CycleState.SIZEOF * count));
	}

	public MM_CycleStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CycleStatePointer addOffset(long offset) {
		return MM_CycleStatePointer.cast(address + offset);
	}

	public MM_CycleStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CycleStatePointer sub(long count) {
		return MM_CycleStatePointer.cast(address - (MM_CycleState.SIZEOF * count));
	}

	public MM_CycleStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CycleStatePointer subOffset(long offset) {
		return MM_CycleStatePointer.cast(address - offset);
	}

	public MM_CycleStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CycleStatePointer untag(long mask) {
		return MM_CycleStatePointer.cast(address & ~mask);
	}

	public MM_CycleStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CycleState.SIZEOF;
	}

	// Implementation methods

	// MM_MemorySubSpace* _activeSubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeSubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _activeSubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_CycleState.__activeSubSpaceOffset_));
	}

	// MM_MemorySubSpace* _activeSubSpace
	public PointerPointer _activeSubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__activeSubSpaceOffset_));
	}

	// MM_CollectionStatistics* _collectionStatistics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionStatisticsOffset_", declaredType="MM_CollectionStatistics*")
	public MM_CollectionStatisticsPointer _collectionStatistics() throws CorruptDataException {
		return MM_CollectionStatisticsPointer.cast(getPointerAtOffset(MM_CycleState.__collectionStatisticsOffset_));
	}

	// MM_CollectionStatistics* _collectionStatistics
	public PointerPointer _collectionStatisticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__collectionStatisticsOffset_));
	}

	// MM_CycleState$CollectionType _collectionType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionTypeOffset_", declaredType="MM_CycleState$CollectionType")
	public long _collectionType() throws CorruptDataException {
		if (MM_CycleState$CollectionType.SIZEOF == 1) {
			return getByteAtOffset(MM_CycleState.__collectionTypeOffset_);
		} else if (MM_CycleState$CollectionType.SIZEOF == 2) {
			return getShortAtOffset(MM_CycleState.__collectionTypeOffset_);
		} else if (MM_CycleState$CollectionType.SIZEOF == 4) {
			return getIntAtOffset(MM_CycleState.__collectionTypeOffset_);
		} else if (MM_CycleState$CollectionType.SIZEOF == 8) {
			return getLongAtOffset(MM_CycleState.__collectionTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_CycleState$CollectionType _collectionType
	public EnumPointer _collectionTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CycleState.__collectionTypeOffset_), MM_CycleState$CollectionType.class);
	}

	// U64 _currentIncrement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentIncrementOffset_", declaredType="U64")
	public UDATA _currentIncrement() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CycleState.__currentIncrementOffset_));
	}

	// U64 _currentIncrement
	public UDATAPointer _currentIncrementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CycleState.__currentIncrementOffset_));
	}

	// volatile bool _dynamicClassUnloadingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicClassUnloadingEnabledOffset_", declaredType="volatile bool")
	public boolean _dynamicClassUnloadingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CycleState.__dynamicClassUnloadingEnabledOffset_);
	}

	// volatile bool _dynamicClassUnloadingEnabled
	public BoolPointer _dynamicClassUnloadingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CycleState.__dynamicClassUnloadingEnabledOffset_));
	}

	// MM_CycleState* _externalCycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__externalCycleStateOffset_", declaredType="MM_CycleState*")
	public MM_CycleStatePointer _externalCycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(getPointerAtOffset(MM_CycleState.__externalCycleStateOffset_));
	}

	// MM_CycleState* _externalCycleState
	public PointerPointer _externalCycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__externalCycleStateOffset_));
	}

	// volatile bool _finalizationRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizationRequiredOffset_", declaredType="volatile bool")
	public boolean _finalizationRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_CycleState.__finalizationRequiredOffset_);
	}

	// volatile bool _finalizationRequired
	public BoolPointer _finalizationRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CycleState.__finalizationRequiredOffset_));
	}

	// MM_GCCode _gcCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCodeOffset_", declaredType="MM_GCCode")
	public MM_GCCodePointer _gcCode() throws CorruptDataException {
		return MM_GCCodePointer.cast(nonNullFieldEA(MM_CycleState.__gcCodeOffset_));
	}

	// MM_GCCode _gcCode
	public PointerPointer _gcCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__gcCodeOffset_));
	}

	// MM_CycleState$MarkDelegateState _markDelegateState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markDelegateStateOffset_", declaredType="MM_CycleState$MarkDelegateState")
	public long _markDelegateState() throws CorruptDataException {
		if (MM_CycleState$MarkDelegateState.SIZEOF == 1) {
			return getByteAtOffset(MM_CycleState.__markDelegateStateOffset_);
		} else if (MM_CycleState$MarkDelegateState.SIZEOF == 2) {
			return getShortAtOffset(MM_CycleState.__markDelegateStateOffset_);
		} else if (MM_CycleState$MarkDelegateState.SIZEOF == 4) {
			return getIntAtOffset(MM_CycleState.__markDelegateStateOffset_);
		} else if (MM_CycleState$MarkDelegateState.SIZEOF == 8) {
			return getLongAtOffset(MM_CycleState.__markDelegateStateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_CycleState$MarkDelegateState _markDelegateState
	public EnumPointer _markDelegateStateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CycleState.__markDelegateStateOffset_), MM_CycleState$MarkDelegateState.class);
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_CycleState.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__markMapOffset_));
	}

	// U64 _pgcData._survivorSetRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pgcData$_survivorSetRegionCountOffset_", declaredType="U64")
	public UDATA _pgcData$_survivorSetRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CycleState.__pgcData$_survivorSetRegionCountOffset_));
	}

	// U64 _pgcData._survivorSetRegionCount
	public UDATAPointer _pgcData$_survivorSetRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CycleState.__pgcData$_survivorSetRegionCountOffset_));
	}

	// MM_CycleState$ReasonForMarkCompactPGC _reasonForMarkCompactPGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reasonForMarkCompactPGCOffset_", declaredType="MM_CycleState$ReasonForMarkCompactPGC")
	public long _reasonForMarkCompactPGC() throws CorruptDataException {
		if (MM_CycleState$ReasonForMarkCompactPGC.SIZEOF == 1) {
			return getByteAtOffset(MM_CycleState.__reasonForMarkCompactPGCOffset_);
		} else if (MM_CycleState$ReasonForMarkCompactPGC.SIZEOF == 2) {
			return getShortAtOffset(MM_CycleState.__reasonForMarkCompactPGCOffset_);
		} else if (MM_CycleState$ReasonForMarkCompactPGC.SIZEOF == 4) {
			return getIntAtOffset(MM_CycleState.__reasonForMarkCompactPGCOffset_);
		} else if (MM_CycleState$ReasonForMarkCompactPGC.SIZEOF == 8) {
			return getLongAtOffset(MM_CycleState.__reasonForMarkCompactPGCOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_CycleState$ReasonForMarkCompactPGC _reasonForMarkCompactPGC
	public EnumPointer _reasonForMarkCompactPGCEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_CycleState.__reasonForMarkCompactPGCOffset_), MM_CycleState$ReasonForMarkCompactPGC.class);
	}

	// U64 _referenceObjectOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectOptionsOffset_", declaredType="U64")
	public UDATA _referenceObjectOptions() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CycleState.__referenceObjectOptionsOffset_));
	}

	// U64 _referenceObjectOptions
	public UDATAPointer _referenceObjectOptionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CycleState.__referenceObjectOptionsOffset_));
	}

	// bool _shouldRunCopyForward
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldRunCopyForwardOffset_", declaredType="bool")
	public boolean _shouldRunCopyForward() throws CorruptDataException {
		return getBoolAtOffset(MM_CycleState.__shouldRunCopyForwardOffset_);
	}

	// bool _shouldRunCopyForward
	public BoolPointer _shouldRunCopyForwardEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CycleState.__shouldRunCopyForwardOffset_));
	}

	// U64 _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="U64")
	public UDATA _type() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CycleState.__typeOffset_));
	}

	// U64 _type
	public UDATAPointer _typeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CycleState.__typeOffset_));
	}

	// U64 _verboseContextID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseContextIDOffset_", declaredType="U64")
	public UDATA _verboseContextID() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CycleState.__verboseContextIDOffset_));
	}

	// U64 _verboseContextID
	public UDATAPointer _verboseContextIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CycleState.__verboseContextIDOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsOffset_", declaredType="MM_WorkPacketsVLHGC*")
	public MM_WorkPacketsVLHGCPointer _workPackets() throws CorruptDataException {
		return MM_WorkPacketsVLHGCPointer.cast(getPointerAtOffset(MM_CycleState.__workPacketsOffset_));
	}

	// MM_WorkPacketsVLHGC* _workPackets
	public PointerPointer _workPacketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CycleState.__workPacketsOffset_));
	}

}
