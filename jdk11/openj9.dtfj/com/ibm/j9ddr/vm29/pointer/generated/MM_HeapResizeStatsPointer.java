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
 * Structure: MM_HeapResizeStatsPointer
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
 * The generated code will provide getters for all elements in the MM_HeapResizeStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_HeapResizeStats.class)
public class MM_HeapResizeStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_HeapResizeStatsPointer NULL = new MM_HeapResizeStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_HeapResizeStatsPointer(long address) {
		super(address);
	}

	public static MM_HeapResizeStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_HeapResizeStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_HeapResizeStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_HeapResizeStatsPointer(address);
	}

	public MM_HeapResizeStatsPointer add(long count) {
		return MM_HeapResizeStatsPointer.cast(address + (MM_HeapResizeStats.SIZEOF * count));
	}

	public MM_HeapResizeStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_HeapResizeStatsPointer addOffset(long offset) {
		return MM_HeapResizeStatsPointer.cast(address + offset);
	}

	public MM_HeapResizeStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_HeapResizeStatsPointer sub(long count) {
		return MM_HeapResizeStatsPointer.cast(address - (MM_HeapResizeStats.SIZEOF * count));
	}

	public MM_HeapResizeStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_HeapResizeStatsPointer subOffset(long offset) {
		return MM_HeapResizeStatsPointer.cast(address - offset);
	}

	public MM_HeapResizeStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_HeapResizeStatsPointer untag(long mask) {
		return MM_HeapResizeStatsPointer.cast(address & ~mask);
	}

	public MM_HeapResizeStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_HeapResizeStats.SIZEOF;
	}

	// Implementation methods

	// bool _excludeCurrentGCTimeFromStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__excludeCurrentGCTimeFromStatsOffset_", declaredType="bool")
	public boolean _excludeCurrentGCTimeFromStats() throws CorruptDataException {
		return getBoolAtOffset(MM_HeapResizeStats.__excludeCurrentGCTimeFromStatsOffset_);
	}

	// bool _excludeCurrentGCTimeFromStats
	public BoolPointer _excludeCurrentGCTimeFromStatsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__excludeCurrentGCTimeFromStatsOffset_));
	}

	// U64 _freeBytesAtSystemGCStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeBytesAtSystemGCStartOffset_", declaredType="U64")
	public UDATA _freeBytesAtSystemGCStart() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__freeBytesAtSystemGCStartOffset_));
	}

	// U64 _freeBytesAtSystemGCStart
	public UDATAPointer _freeBytesAtSystemGCStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__freeBytesAtSystemGCStartOffset_));
	}

	// U64 _globalGCCountAtAF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalGCCountAtAFOffset_", declaredType="U64")
	public UDATA _globalGCCountAtAF() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__globalGCCountAtAFOffset_));
	}

	// U64 _globalGCCountAtAF
	public UDATAPointer _globalGCCountAtAFEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__globalGCCountAtAFOffset_));
	}

	// U64 _lastAFEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastAFEndTimeOffset_", declaredType="U64")
	public UDATA _lastAFEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastAFEndTimeOffset_));
	}

	// U64 _lastAFEndTime
	public UDATAPointer _lastAFEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastAFEndTimeOffset_));
	}

	// U64 _lastActualHeapContractionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastActualHeapContractionSizeOffset_", declaredType="U64")
	public UDATA _lastActualHeapContractionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastActualHeapContractionSizeOffset_));
	}

	// U64 _lastActualHeapContractionSize
	public UDATAPointer _lastActualHeapContractionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastActualHeapContractionSizeOffset_));
	}

	// U64 _lastActualHeapExpansionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastActualHeapExpansionSizeOffset_", declaredType="U64")
	public UDATA _lastActualHeapExpansionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastActualHeapExpansionSizeOffset_));
	}

	// U64 _lastActualHeapExpansionSize
	public UDATAPointer _lastActualHeapExpansionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastActualHeapExpansionSizeOffset_));
	}

	// ContractReason _lastContractReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastContractReasonOffset_", declaredType="ContractReason")
	public long _lastContractReason() throws CorruptDataException {
		if (ContractReason.SIZEOF == 1) {
			return getByteAtOffset(MM_HeapResizeStats.__lastContractReasonOffset_);
		} else if (ContractReason.SIZEOF == 2) {
			return getShortAtOffset(MM_HeapResizeStats.__lastContractReasonOffset_);
		} else if (ContractReason.SIZEOF == 4) {
			return getIntAtOffset(MM_HeapResizeStats.__lastContractReasonOffset_);
		} else if (ContractReason.SIZEOF == 8) {
			return getLongAtOffset(MM_HeapResizeStats.__lastContractReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ContractReason _lastContractReason
	public EnumPointer _lastContractReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastContractReasonOffset_), ContractReason.class);
	}

	// U64 _lastContractTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastContractTimeOffset_", declaredType="U64")
	public UDATA _lastContractTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastContractTimeOffset_));
	}

	// U64 _lastContractTime
	public UDATAPointer _lastContractTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastContractTimeOffset_));
	}

	// ExpandReason _lastExpandReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastExpandReasonOffset_", declaredType="ExpandReason")
	public long _lastExpandReason() throws CorruptDataException {
		if (ExpandReason.SIZEOF == 1) {
			return getByteAtOffset(MM_HeapResizeStats.__lastExpandReasonOffset_);
		} else if (ExpandReason.SIZEOF == 2) {
			return getShortAtOffset(MM_HeapResizeStats.__lastExpandReasonOffset_);
		} else if (ExpandReason.SIZEOF == 4) {
			return getIntAtOffset(MM_HeapResizeStats.__lastExpandReasonOffset_);
		} else if (ExpandReason.SIZEOF == 8) {
			return getLongAtOffset(MM_HeapResizeStats.__lastExpandReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ExpandReason _lastExpandReason
	public EnumPointer _lastExpandReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastExpandReasonOffset_), ExpandReason.class);
	}

	// U64 _lastExpandTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastExpandTimeOffset_", declaredType="U64")
	public UDATA _lastExpandTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastExpandTimeOffset_));
	}

	// U64 _lastExpandTime
	public UDATAPointer _lastExpandTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastExpandTimeOffset_));
	}

	// U32 _lastGCPercentage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastGCPercentageOffset_", declaredType="U32")
	public UDATA _lastGCPercentage() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_HeapResizeStats.__lastGCPercentageOffset_));
	}

	// U32 _lastGCPercentage
	public UDATAPointer _lastGCPercentageEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastGCPercentageOffset_));
	}

	// U64 _lastHeapContractionGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastHeapContractionGCCountOffset_", declaredType="U64")
	public UDATA _lastHeapContractionGCCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastHeapContractionGCCountOffset_));
	}

	// U64 _lastHeapContractionGCCount
	public UDATAPointer _lastHeapContractionGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastHeapContractionGCCountOffset_));
	}

	// U64 _lastHeapExpansionGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastHeapExpansionGCCountOffset_", declaredType="U64")
	public UDATA _lastHeapExpansionGCCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastHeapExpansionGCCountOffset_));
	}

	// U64 _lastHeapExpansionGCCount
	public UDATAPointer _lastHeapExpansionGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastHeapExpansionGCCountOffset_));
	}

	// LoaResizeReason _lastLoaResizeReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastLoaResizeReasonOffset_", declaredType="LoaResizeReason")
	public long _lastLoaResizeReason() throws CorruptDataException {
		if (LoaResizeReason.SIZEOF == 1) {
			return getByteAtOffset(MM_HeapResizeStats.__lastLoaResizeReasonOffset_);
		} else if (LoaResizeReason.SIZEOF == 2) {
			return getShortAtOffset(MM_HeapResizeStats.__lastLoaResizeReasonOffset_);
		} else if (LoaResizeReason.SIZEOF == 4) {
			return getIntAtOffset(MM_HeapResizeStats.__lastLoaResizeReasonOffset_);
		} else if (LoaResizeReason.SIZEOF == 8) {
			return getLongAtOffset(MM_HeapResizeStats.__lastLoaResizeReasonOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// LoaResizeReason _lastLoaResizeReason
	public EnumPointer _lastLoaResizeReasonEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastLoaResizeReasonOffset_), LoaResizeReason.class);
	}

	// U64 _lastTimeOutsideGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastTimeOutsideGCOffset_", declaredType="U64")
	public UDATA _lastTimeOutsideGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__lastTimeOutsideGCOffset_));
	}

	// U64 _lastTimeOutsideGC
	public UDATAPointer _lastTimeOutsideGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__lastTimeOutsideGCOffset_));
	}

	// U64 _thisAFStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__thisAFStartTimeOffset_", declaredType="U64")
	public UDATA _thisAFStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_HeapResizeStats.__thisAFStartTimeOffset_));
	}

	// U64 _thisAFStartTime
	public UDATAPointer _thisAFStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_HeapResizeStats.__thisAFStartTimeOffset_));
	}

	// U64[] _ticksInGC
	public UDATAPointer _ticksInGCEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_HeapResizeStats.__ticksInGCOffset_));
	}

	// U64[] _ticksOutsideGC
	public UDATAPointer _ticksOutsideGCEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_HeapResizeStats.__ticksOutsideGCOffset_));
	}

}
