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
 * Structure: MM_ConcurrentPhaseStatsBasePointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentPhaseStatsBasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentPhaseStatsBase.class)
public class MM_ConcurrentPhaseStatsBasePointer extends MM_BasePointer {

	// NULL
	public static final MM_ConcurrentPhaseStatsBasePointer NULL = new MM_ConcurrentPhaseStatsBasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentPhaseStatsBasePointer(long address) {
		super(address);
	}

	public static MM_ConcurrentPhaseStatsBasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentPhaseStatsBasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentPhaseStatsBasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentPhaseStatsBasePointer(address);
	}

	public MM_ConcurrentPhaseStatsBasePointer add(long count) {
		return MM_ConcurrentPhaseStatsBasePointer.cast(address + (MM_ConcurrentPhaseStatsBase.SIZEOF * count));
	}

	public MM_ConcurrentPhaseStatsBasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentPhaseStatsBasePointer addOffset(long offset) {
		return MM_ConcurrentPhaseStatsBasePointer.cast(address + offset);
	}

	public MM_ConcurrentPhaseStatsBasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentPhaseStatsBasePointer sub(long count) {
		return MM_ConcurrentPhaseStatsBasePointer.cast(address - (MM_ConcurrentPhaseStatsBase.SIZEOF * count));
	}

	public MM_ConcurrentPhaseStatsBasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentPhaseStatsBasePointer subOffset(long offset) {
		return MM_ConcurrentPhaseStatsBasePointer.cast(address - offset);
	}

	public MM_ConcurrentPhaseStatsBasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentPhaseStatsBasePointer untag(long mask) {
		return MM_ConcurrentPhaseStatsBasePointer.cast(address & ~mask);
	}

	public MM_ConcurrentPhaseStatsBasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentPhaseStatsBase.SIZEOF;
	}

	// Implementation methods

	// U64 _bytesScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesScannedOffset_", declaredType="U64")
	public UDATA _bytesScanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentPhaseStatsBase.__bytesScannedOffset_));
	}

	// U64 _bytesScanned
	public UDATAPointer _bytesScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentPhaseStatsBase.__bytesScannedOffset_));
	}

	// U64 _cycleID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleIDOffset_", declaredType="U64")
	public UDATA _cycleID() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentPhaseStatsBase.__cycleIDOffset_));
	}

	// U64 _cycleID
	public UDATAPointer _cycleIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentPhaseStatsBase.__cycleIDOffset_));
	}

	// U64 _scanTargetInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanTargetInBytesOffset_", declaredType="U64")
	public UDATA _scanTargetInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentPhaseStatsBase.__scanTargetInBytesOffset_));
	}

	// U64 _scanTargetInBytes
	public UDATAPointer _scanTargetInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentPhaseStatsBase.__scanTargetInBytesOffset_));
	}

	// MM_ConcurrentPhaseStatsBase$TerminationRequestType _terminationRequestType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__terminationRequestTypeOffset_", declaredType="MM_ConcurrentPhaseStatsBase$TerminationRequestType")
	public long _terminationRequestType() throws CorruptDataException {
		if (MM_ConcurrentPhaseStatsBase$TerminationRequestType.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentPhaseStatsBase.__terminationRequestTypeOffset_);
		} else if (MM_ConcurrentPhaseStatsBase$TerminationRequestType.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentPhaseStatsBase.__terminationRequestTypeOffset_);
		} else if (MM_ConcurrentPhaseStatsBase$TerminationRequestType.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentPhaseStatsBase.__terminationRequestTypeOffset_);
		} else if (MM_ConcurrentPhaseStatsBase$TerminationRequestType.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentPhaseStatsBase.__terminationRequestTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_ConcurrentPhaseStatsBase$TerminationRequestType _terminationRequestType
	public EnumPointer _terminationRequestTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentPhaseStatsBase.__terminationRequestTypeOffset_), MM_ConcurrentPhaseStatsBase$TerminationRequestType.class);
	}

	// bool _terminationWasRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__terminationWasRequestedOffset_", declaredType="bool")
	public boolean _terminationWasRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentPhaseStatsBase.__terminationWasRequestedOffset_);
	}

	// bool _terminationWasRequested
	public BoolPointer _terminationWasRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentPhaseStatsBase.__terminationWasRequestedOffset_));
	}

}
