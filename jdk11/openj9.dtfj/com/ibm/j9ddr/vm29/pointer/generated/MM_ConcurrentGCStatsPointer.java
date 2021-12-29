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
 * Structure: MM_ConcurrentGCStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentGCStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentGCStats.class)
public class MM_ConcurrentGCStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_ConcurrentGCStatsPointer NULL = new MM_ConcurrentGCStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentGCStatsPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentGCStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentGCStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentGCStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentGCStatsPointer(address);
	}

	public MM_ConcurrentGCStatsPointer add(long count) {
		return MM_ConcurrentGCStatsPointer.cast(address + (MM_ConcurrentGCStats.SIZEOF * count));
	}

	public MM_ConcurrentGCStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentGCStatsPointer addOffset(long offset) {
		return MM_ConcurrentGCStatsPointer.cast(address + offset);
	}

	public MM_ConcurrentGCStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentGCStatsPointer sub(long count) {
		return MM_ConcurrentGCStatsPointer.cast(address - (MM_ConcurrentGCStats.SIZEOF * count));
	}

	public MM_ConcurrentGCStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentGCStatsPointer subOffset(long offset) {
		return MM_ConcurrentGCStatsPointer.cast(address - offset);
	}

	public MM_ConcurrentGCStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentGCStatsPointer untag(long mask) {
		return MM_ConcurrentGCStatsPointer.cast(address & ~mask);
	}

	public MM_ConcurrentGCStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentGCStats.SIZEOF;
	}

	// Implementation methods

	// volatile U64 _RSObjectsFound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__RSObjectsFoundOffset_", declaredType="volatile U64")
	public UDATA _RSObjectsFound() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__RSObjectsFoundOffset_));
	}

	// volatile U64 _RSObjectsFound
	public UDATAPointer _RSObjectsFoundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__RSObjectsFoundOffset_));
	}

	// volatile U64 _RSScanTraceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__RSScanTraceCountOffset_", declaredType="volatile U64")
	public UDATA _RSScanTraceCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__RSScanTraceCountOffset_));
	}

	// volatile U64 _RSScanTraceCount
	public UDATAPointer _RSScanTraceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__RSScanTraceCountOffset_));
	}

	// U64 _allocationsTaxed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedOffset_", declaredType="U64")
	public UDATA _allocationsTaxed() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedOffset_));
	}

	// U64 _allocationsTaxed
	public UDATAPointer _allocationsTaxedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedOffset_));
	}

	// U64 _allocationsTaxedAt0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedAt0Offset_", declaredType="U64")
	public UDATA _allocationsTaxedAt0() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedAt0Offset_));
	}

	// U64 _allocationsTaxedAt0
	public UDATAPointer _allocationsTaxedAt0EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedAt0Offset_));
	}

	// U64 _allocationsTaxedAt100
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedAt100Offset_", declaredType="U64")
	public UDATA _allocationsTaxedAt100() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedAt100Offset_));
	}

	// U64 _allocationsTaxedAt100
	public UDATAPointer _allocationsTaxedAt100EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedAt100Offset_));
	}

	// U64 _allocationsTaxedAt25
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedAt25Offset_", declaredType="U64")
	public UDATA _allocationsTaxedAt25() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedAt25Offset_));
	}

	// U64 _allocationsTaxedAt25
	public UDATAPointer _allocationsTaxedAt25EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedAt25Offset_));
	}

	// U64 _allocationsTaxedAt50
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedAt50Offset_", declaredType="U64")
	public UDATA _allocationsTaxedAt50() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedAt50Offset_));
	}

	// U64 _allocationsTaxedAt50
	public UDATAPointer _allocationsTaxedAt50EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedAt50Offset_));
	}

	// U64 _allocationsTaxedAt75
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationsTaxedAt75Offset_", declaredType="U64")
	public UDATA _allocationsTaxedAt75() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__allocationsTaxedAt75Offset_));
	}

	// U64 _allocationsTaxedAt75
	public UDATAPointer _allocationsTaxedAt75EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__allocationsTaxedAt75Offset_));
	}

	// volatile U64 _cardCleanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleanCountOffset_", declaredType="volatile U64")
	public UDATA _cardCleanCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__cardCleanCountOffset_));
	}

	// volatile U64 _cardCleanCount
	public UDATAPointer _cardCleanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__cardCleanCountOffset_));
	}

	// ConcurrentCardCleaningReason _cardCleaningReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningReasonOffset_", declaredType="ConcurrentCardCleaningReason")
	public long _cardCleaningReason() throws CorruptDataException {
		if (ConcurrentCardCleaningReason.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGCStats.__cardCleaningReasonOffset_);
		} else if (ConcurrentCardCleaningReason.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGCStats.__cardCleaningReasonOffset_);
		} else if (ConcurrentCardCleaningReason.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGCStats.__cardCleaningReasonOffset_);
		} else if (ConcurrentCardCleaningReason.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGCStats.__cardCleaningReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ConcurrentCardCleaningReason _cardCleaningReason
	public EnumPointer _cardCleaningReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__cardCleaningReasonOffset_), ConcurrentCardCleaningReason.class);
	}

	// U64 _cardCleaningThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningThresholdOffset_", declaredType="U64")
	public UDATA _cardCleaningThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__cardCleaningThresholdOffset_));
	}

	// U64 _cardCleaningThreshold
	public UDATAPointer _cardCleaningThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__cardCleaningThresholdOffset_));
	}

	// volatile U64 _completeTracingCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completeTracingCountOffset_", declaredType="volatile U64")
	public UDATA _completeTracingCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__completeTracingCountOffset_));
	}

	// volatile U64 _completeTracingCount
	public UDATAPointer _completeTracingCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__completeTracingCountOffset_));
	}

	// volatile U32 _completedModes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completedModesOffset_", declaredType="volatile U32")
	public UDATA _completedModes() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_ConcurrentGCStats.__completedModesOffset_));
	}

	// volatile U32 _completedModes
	public UDATAPointer _completedModesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__completedModesOffset_));
	}

	// volatile U64 _conHelperCardCleanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelperCardCleanCountOffset_", declaredType="volatile U64")
	public UDATA _conHelperCardCleanCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__conHelperCardCleanCountOffset_));
	}

	// volatile U64 _conHelperCardCleanCount
	public UDATAPointer _conHelperCardCleanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__conHelperCardCleanCountOffset_));
	}

	// volatile U64 _conHelperTraceSizeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__conHelperTraceSizeCountOffset_", declaredType="volatile U64")
	public UDATA _conHelperTraceSizeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__conHelperTraceSizeCountOffset_));
	}

	// volatile U64 _conHelperTraceSizeCount
	public UDATAPointer _conHelperTraceSizeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__conHelperTraceSizeCountOffset_));
	}

	// U64 _concurrentWorkStackOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentWorkStackOverflowCountOffset_", declaredType="U64")
	public UDATA _concurrentWorkStackOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__concurrentWorkStackOverflowCountOffset_));
	}

	// U64 _concurrentWorkStackOverflowCount
	public UDATAPointer _concurrentWorkStackOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__concurrentWorkStackOverflowCountOffset_));
	}

	// bool _concurrentWorkStackOverflowOcurred
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentWorkStackOverflowOcurredOffset_", declaredType="bool")
	public boolean _concurrentWorkStackOverflowOcurred() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGCStats.__concurrentWorkStackOverflowOcurredOffset_);
	}

	// bool _concurrentWorkStackOverflowOcurred
	public BoolPointer _concurrentWorkStackOverflowOcurredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__concurrentWorkStackOverflowOcurredOffset_));
	}

	// volatile U64 _executionMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__executionModeOffset_", declaredType="volatile U64")
	public UDATA _executionMode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__executionModeOffset_));
	}

	// volatile U64 _executionMode
	public UDATAPointer _executionModeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__executionModeOffset_));
	}

	// U64 _executionModeAtGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__executionModeAtGCOffset_", declaredType="U64")
	public UDATA _executionModeAtGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__executionModeAtGCOffset_));
	}

	// U64 _executionModeAtGC
	public UDATAPointer _executionModeAtGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__executionModeAtGCOffset_));
	}

	// volatile U64 _finalCardCleanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalCardCleanCountOffset_", declaredType="volatile U64")
	public UDATA _finalCardCleanCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__finalCardCleanCountOffset_));
	}

	// volatile U64 _finalCardCleanCount
	public UDATAPointer _finalCardCleanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__finalCardCleanCountOffset_));
	}

	// volatile U64 _finalTraceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalTraceCountOffset_", declaredType="volatile U64")
	public UDATA _finalTraceCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__finalTraceCountOffset_));
	}

	// volatile U64 _finalTraceCount
	public UDATAPointer _finalTraceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__finalTraceCountOffset_));
	}

	// U64 _initWorkRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initWorkRequiredOffset_", declaredType="U64")
	public UDATA _initWorkRequired() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__initWorkRequiredOffset_));
	}

	// U64 _initWorkRequired
	public UDATAPointer _initWorkRequiredEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__initWorkRequiredOffset_));
	}

	// ConcurrentKickoffReason _kickoffReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__kickoffReasonOffset_", declaredType="ConcurrentKickoffReason")
	public long _kickoffReason() throws CorruptDataException {
		if (ConcurrentKickoffReason.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGCStats.__kickoffReasonOffset_);
		} else if (ConcurrentKickoffReason.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGCStats.__kickoffReasonOffset_);
		} else if (ConcurrentKickoffReason.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGCStats.__kickoffReasonOffset_);
		} else if (ConcurrentKickoffReason.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGCStats.__kickoffReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ConcurrentKickoffReason _kickoffReason
	public EnumPointer _kickoffReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__kickoffReasonOffset_), ConcurrentKickoffReason.class);
	}

	// U64 _kickoffThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__kickoffThresholdOffset_", declaredType="U64")
	public UDATA _kickoffThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__kickoffThresholdOffset_));
	}

	// U64 _kickoffThreshold
	public UDATAPointer _kickoffThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__kickoffThresholdOffset_));
	}

	// U64 _remainingFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__remainingFreeOffset_", declaredType="U64")
	public UDATA _remainingFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__remainingFreeOffset_));
	}

	// U64 _remainingFree
	public UDATAPointer _remainingFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__remainingFreeOffset_));
	}

	// volatile U64 _threadsScannedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsScannedCountOffset_", declaredType="volatile U64")
	public UDATA _threadsScannedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__threadsScannedCountOffset_));
	}

	// volatile U64 _threadsScannedCount
	public UDATAPointer _threadsScannedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__threadsScannedCountOffset_));
	}

	// U64 _threadsToScanCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadsToScanCountOffset_", declaredType="U64")
	public UDATA _threadsToScanCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__threadsToScanCountOffset_));
	}

	// U64 _threadsToScanCount
	public UDATAPointer _threadsToScanCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__threadsToScanCountOffset_));
	}

	// volatile U64 _traceSizeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceSizeCountOffset_", declaredType="volatile U64")
	public UDATA _traceSizeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__traceSizeCountOffset_));
	}

	// volatile U64 _traceSizeCount
	public UDATAPointer _traceSizeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__traceSizeCountOffset_));
	}

	// U64 _traceSizeTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceSizeTargetOffset_", declaredType="U64")
	public UDATA _traceSizeTarget() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGCStats.__traceSizeTargetOffset_));
	}

	// U64 _traceSizeTarget
	public UDATAPointer _traceSizeTargetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGCStats.__traceSizeTargetOffset_));
	}

}
