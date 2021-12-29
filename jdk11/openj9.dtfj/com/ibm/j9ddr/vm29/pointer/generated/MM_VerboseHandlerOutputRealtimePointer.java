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
 * Structure: MM_VerboseHandlerOutputRealtimePointer
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
 * The generated code will provide getters for all elements in the MM_VerboseHandlerOutputRealtimePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseHandlerOutputRealtime.class)
public class MM_VerboseHandlerOutputRealtimePointer extends MM_VerboseHandlerOutputPointer {

	// NULL
	public static final MM_VerboseHandlerOutputRealtimePointer NULL = new MM_VerboseHandlerOutputRealtimePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseHandlerOutputRealtimePointer(long address) {
		super(address);
	}

	public static MM_VerboseHandlerOutputRealtimePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseHandlerOutputRealtimePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseHandlerOutputRealtimePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseHandlerOutputRealtimePointer(address);
	}

	public MM_VerboseHandlerOutputRealtimePointer add(long count) {
		return MM_VerboseHandlerOutputRealtimePointer.cast(address + (MM_VerboseHandlerOutputRealtime.SIZEOF * count));
	}

	public MM_VerboseHandlerOutputRealtimePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseHandlerOutputRealtimePointer addOffset(long offset) {
		return MM_VerboseHandlerOutputRealtimePointer.cast(address + offset);
	}

	public MM_VerboseHandlerOutputRealtimePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseHandlerOutputRealtimePointer sub(long count) {
		return MM_VerboseHandlerOutputRealtimePointer.cast(address - (MM_VerboseHandlerOutputRealtime.SIZEOF * count));
	}

	public MM_VerboseHandlerOutputRealtimePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseHandlerOutputRealtimePointer subOffset(long offset) {
		return MM_VerboseHandlerOutputRealtimePointer.cast(address - offset);
	}

	public MM_VerboseHandlerOutputRealtimePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseHandlerOutputRealtimePointer untag(long mask) {
		return MM_VerboseHandlerOutputRealtimePointer.cast(address & ~mask);
	}

	public MM_VerboseHandlerOutputRealtimePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseHandlerOutputRealtime.SIZEOF;
	}

	// Implementation methods

	// UDATA _anonymousClassesUnloadedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anonymousClassesUnloadedTotalOffset_", declaredType="UDATA")
	public UDATA _anonymousClassesUnloadedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__anonymousClassesUnloadedTotalOffset_);
	}

	// UDATA _anonymousClassesUnloadedTotal
	public UDATAPointer _anonymousClassesUnloadedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__anonymousClassesUnloadedTotalOffset_));
	}

	// UDATA _classLoadersUnloadedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedTotalOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloadedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__classLoadersUnloadedTotalOffset_);
	}

	// UDATA _classLoadersUnloadedTotal
	public UDATAPointer _classLoadersUnloadedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__classLoadersUnloadedTotalOffset_));
	}

	// UDATA _classesUnloadedTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedTotalOffset_", declaredType="UDATA")
	public UDATA _classesUnloadedTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__classesUnloadedTotalOffset_);
	}

	// UDATA _classesUnloadedTotal
	public UDATAPointer _classesUnloadedTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__classesUnloadedTotalOffset_));
	}

	// UDATA _dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSoftReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _dynamicSoftReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__dynamicSoftReferenceThresholdOffset_);
	}

	// UDATA _dynamicSoftReferenceThreshold
	public UDATAPointer _dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__dynamicSoftReferenceThresholdOffset_));
	}

	// UDATA _finalizableCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizableCountTotalOffset_", declaredType="UDATA")
	public UDATA _finalizableCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__finalizableCountTotalOffset_);
	}

	// UDATA _finalizableCountTotal
	public UDATAPointer _finalizableCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__finalizableCountTotalOffset_));
	}

	// GCPhase _gcPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcPhaseOffset_", declaredType="GCPhase")
	public long _gcPhase() throws CorruptDataException {
		if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseHandlerOutputRealtime.__gcPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseHandlerOutputRealtime.__gcPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseHandlerOutputRealtime.__gcPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseHandlerOutputRealtime.__gcPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GCPhase _gcPhase
	public EnumPointer _gcPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__gcPhaseOffset_), MM_VerboseHandlerOutputRealtime$GCPhase.class);
	}

	// U64 _heartbeatStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heartbeatStartTimeOffset_", declaredType="U64")
	public UDATA _heartbeatStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__heartbeatStartTimeOffset_));
	}

	// U64 _heartbeatStartTime
	public UDATAPointer _heartbeatStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__heartbeatStartTimeOffset_));
	}

	// UDATA _incrementCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementCountOffset_", declaredType="UDATA")
	public UDATA _incrementCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__incrementCountOffset_);
	}

	// UDATA _incrementCount
	public UDATAPointer _incrementCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__incrementCountOffset_));
	}

	// U64 _incrementStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementStartTimeOffset_", declaredType="U64")
	public UDATA _incrementStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__incrementStartTimeOffset_));
	}

	// U64 _incrementStartTime
	public UDATAPointer _incrementStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__incrementStartTimeOffset_));
	}

	// U64 _maxExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _maxExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__maxExclusiveAccessTimeOffset_));
	}

	// U64 _maxExclusiveAccessTime
	public UDATAPointer _maxExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__maxExclusiveAccessTimeOffset_));
	}

	// U64 _maxHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxHeapFreeOffset_", declaredType="U64")
	public UDATA _maxHeapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__maxHeapFreeOffset_));
	}

	// U64 _maxHeapFree
	public UDATAPointer _maxHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__maxHeapFreeOffset_));
	}

	// U64 _maxIncrementStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxIncrementStartTimeOffset_", declaredType="U64")
	public UDATA _maxIncrementStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__maxIncrementStartTimeOffset_));
	}

	// U64 _maxIncrementStartTime
	public UDATAPointer _maxIncrementStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__maxIncrementStartTimeOffset_));
	}

	// U64 _maxIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxIncrementTimeOffset_", declaredType="U64")
	public UDATA _maxIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__maxIncrementTimeOffset_));
	}

	// U64 _maxIncrementTime
	public UDATAPointer _maxIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__maxIncrementTimeOffset_));
	}

	// UDATA _maxStartPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxStartPriorityOffset_", declaredType="UDATA")
	public UDATA _maxStartPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__maxStartPriorityOffset_);
	}

	// UDATA _maxStartPriority
	public UDATAPointer _maxStartPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__maxStartPriorityOffset_));
	}

	// U64 _minExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _minExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__minExclusiveAccessTimeOffset_));
	}

	// U64 _minExclusiveAccessTime
	public UDATAPointer _minExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__minExclusiveAccessTimeOffset_));
	}

	// U64 _minHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minHeapFreeOffset_", declaredType="U64")
	public UDATA _minHeapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__minHeapFreeOffset_));
	}

	// U64 _minHeapFree
	public UDATAPointer _minHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__minHeapFreeOffset_));
	}

	// U64 _minIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minIncrementTimeOffset_", declaredType="U64")
	public UDATA _minIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__minIncrementTimeOffset_));
	}

	// U64 _minIncrementTime
	public UDATAPointer _minIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__minIncrementTimeOffset_));
	}

	// UDATA _minStartPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minStartPriorityOffset_", declaredType="UDATA")
	public UDATA _minStartPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__minStartPriorityOffset_);
	}

	// UDATA _minStartPriority
	public UDATAPointer _minStartPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__minStartPriorityOffset_));
	}

	// void** _mmHooks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mmHooksOffset_", declaredType="void**")
	public PointerPointer _mmHooks() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseHandlerOutputRealtime.__mmHooksOffset_));
	}

	// void** _mmHooks
	public PointerPointer _mmHooksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__mmHooksOffset_));
	}

	// UDATA _nonDeterministicSweepConsecutiveMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepConsecutiveMaxOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweepConsecutiveMax() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepConsecutiveMaxOffset_);
	}

	// UDATA _nonDeterministicSweepConsecutiveMax
	public UDATAPointer _nonDeterministicSweepConsecutiveMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepConsecutiveMaxOffset_));
	}

	// U64 _nonDeterministicSweepDelayMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepDelayMaxOffset_", declaredType="U64")
	public UDATA _nonDeterministicSweepDelayMax() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepDelayMaxOffset_));
	}

	// U64 _nonDeterministicSweepDelayMax
	public UDATAPointer _nonDeterministicSweepDelayMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepDelayMaxOffset_));
	}

	// UDATA _nonDeterministicSweepTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonDeterministicSweepTotalOffset_", declaredType="UDATA")
	public UDATA _nonDeterministicSweepTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepTotalOffset_);
	}

	// UDATA _nonDeterministicSweepTotal
	public UDATAPointer _nonDeterministicSweepTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__nonDeterministicSweepTotalOffset_));
	}

	// UDATA _objectOverflowCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectOverflowCountTotalOffset_", declaredType="UDATA")
	public UDATA _objectOverflowCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__objectOverflowCountTotalOffset_);
	}

	// UDATA _objectOverflowCountTotal
	public UDATAPointer _objectOverflowCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__objectOverflowCountTotalOffset_));
	}

	// UDATA _phantomReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__phantomReferenceClearCountTotalOffset_);
	}

	// UDATA _phantomReferenceClearCountTotal
	public UDATAPointer _phantomReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__phantomReferenceClearCountTotalOffset_));
	}

	// GCPhase _previousGCPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousGCPhaseOffset_", declaredType="GCPhase")
	public long _previousGCPhase() throws CorruptDataException {
		if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseHandlerOutputRealtime.__previousGCPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseHandlerOutputRealtime.__previousGCPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseHandlerOutputRealtime.__previousGCPhaseOffset_);
		} else if (MM_VerboseHandlerOutputRealtime$GCPhase.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseHandlerOutputRealtime.__previousGCPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GCPhase _previousGCPhase
	public EnumPointer _previousGCPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__previousGCPhaseOffset_), MM_VerboseHandlerOutputRealtime$GCPhase.class);
	}

	// UDATA _softReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__softReferenceClearCountTotalOffset_);
	}

	// UDATA _softReferenceClearCountTotal
	public UDATAPointer _softReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__softReferenceClearCountTotalOffset_));
	}

	// UDATA _softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _softReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__softReferenceThresholdOffset_);
	}

	// UDATA _softReferenceThreshold
	public UDATAPointer _softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__softReferenceThresholdOffset_));
	}

	// U64 _syncGCExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _syncGCExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCExclusiveAccessTimeOffset_));
	}

	// U64 _syncGCExclusiveAccessTime
	public UDATAPointer _syncGCExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCExclusiveAccessTimeOffset_));
	}

	// GCReason _syncGCReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCReasonOffset_", declaredType="GCReason")
	public long _syncGCReason() throws CorruptDataException {
		if (GCReason.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCReasonOffset_);
		} else if (GCReason.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCReasonOffset_);
		} else if (GCReason.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCReasonOffset_);
		} else if (GCReason.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GCReason _syncGCReason
	public EnumPointer _syncGCReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCReasonOffset_), GCReason.class);
	}

	// UDATA _syncGCReasonParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCReasonParameterOffset_", declaredType="UDATA")
	public UDATA _syncGCReasonParameter() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCReasonParameterOffset_);
	}

	// UDATA _syncGCReasonParameter
	public UDATAPointer _syncGCReasonParameterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCReasonParameterOffset_));
	}

	// UDATA _syncGCStartAnonymousClassesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartAnonymousClassesUnloadedOffset_", declaredType="UDATA")
	public UDATA _syncGCStartAnonymousClassesUnloaded() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartAnonymousClassesUnloadedOffset_);
	}

	// UDATA _syncGCStartAnonymousClassesUnloaded
	public UDATAPointer _syncGCStartAnonymousClassesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartAnonymousClassesUnloadedOffset_));
	}

	// UDATA _syncGCStartClassLoadersUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartClassLoadersUnloadedOffset_", declaredType="UDATA")
	public UDATA _syncGCStartClassLoadersUnloaded() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartClassLoadersUnloadedOffset_);
	}

	// UDATA _syncGCStartClassLoadersUnloaded
	public UDATAPointer _syncGCStartClassLoadersUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartClassLoadersUnloadedOffset_));
	}

	// UDATA _syncGCStartClassesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartClassesUnloadedOffset_", declaredType="UDATA")
	public UDATA _syncGCStartClassesUnloaded() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartClassesUnloadedOffset_);
	}

	// UDATA _syncGCStartClassesUnloaded
	public UDATAPointer _syncGCStartClassesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartClassesUnloadedOffset_));
	}

	// UDATA _syncGCStartHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartHeapFreeOffset_", declaredType="UDATA")
	public UDATA _syncGCStartHeapFree() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartHeapFreeOffset_);
	}

	// UDATA _syncGCStartHeapFree
	public UDATAPointer _syncGCStartHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartHeapFreeOffset_));
	}

	// UDATA _syncGCStartImmortalFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartImmortalFreeOffset_", declaredType="UDATA")
	public UDATA _syncGCStartImmortalFree() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartImmortalFreeOffset_);
	}

	// UDATA _syncGCStartImmortalFree
	public UDATAPointer _syncGCStartImmortalFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartImmortalFreeOffset_));
	}

	// U64 _syncGCStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCStartTimeOffset_", declaredType="U64")
	public UDATA _syncGCStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCStartTimeOffset_));
	}

	// U64 _syncGCStartTime
	public UDATAPointer _syncGCStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCStartTimeOffset_));
	}

	// bool _syncGCTriggered
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__syncGCTriggeredOffset_", declaredType="bool")
	public boolean _syncGCTriggered() throws CorruptDataException {
		return getBoolAtOffset(MM_VerboseHandlerOutputRealtime.__syncGCTriggeredOffset_);
	}

	// bool _syncGCTriggered
	public BoolPointer _syncGCTriggeredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__syncGCTriggeredOffset_));
	}

	// U64 _totalExclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalExclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA _totalExclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__totalExclusiveAccessTimeOffset_));
	}

	// U64 _totalExclusiveAccessTime
	public UDATAPointer _totalExclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__totalExclusiveAccessTimeOffset_));
	}

	// U64 _totalHeapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalHeapFreeOffset_", declaredType="U64")
	public UDATA _totalHeapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__totalHeapFreeOffset_));
	}

	// U64 _totalHeapFree
	public UDATAPointer _totalHeapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__totalHeapFreeOffset_));
	}

	// U64 _totalIncrementTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalIncrementTimeOffset_", declaredType="U64")
	public UDATA _totalIncrementTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__totalIncrementTimeOffset_));
	}

	// U64 _totalIncrementTime
	public UDATAPointer _totalIncrementTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__totalIncrementTimeOffset_));
	}

	// U64 _verboseInitTimeStamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseInitTimeStampOffset_", declaredType="U64")
	public UDATA _verboseInitTimeStamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseHandlerOutputRealtime.__verboseInitTimeStampOffset_));
	}

	// U64 _verboseInitTimeStamp
	public UDATAPointer _verboseInitTimeStampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__verboseInitTimeStampOffset_));
	}

	// UDATA _weakReferenceClearCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountTotalOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__weakReferenceClearCountTotalOffset_);
	}

	// UDATA _weakReferenceClearCountTotal
	public UDATAPointer _weakReferenceClearCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__weakReferenceClearCountTotalOffset_));
	}

	// UDATA _workPacketOverflowCountTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketOverflowCountTotalOffset_", declaredType="UDATA")
	public UDATA _workPacketOverflowCountTotal() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseHandlerOutputRealtime.__workPacketOverflowCountTotalOffset_);
	}

	// UDATA _workPacketOverflowCountTotal
	public UDATAPointer _workPacketOverflowCountTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseHandlerOutputRealtime.__workPacketOverflowCountTotalOffset_));
	}

}
