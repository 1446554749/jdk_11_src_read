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
 * Structure: OMR_ExclusiveVMAccessStatsPointer
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
 * The generated code will provide getters for all elements in the OMR_ExclusiveVMAccessStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_ExclusiveVMAccessStats.class)
public class OMR_ExclusiveVMAccessStatsPointer extends StructurePointer {

	// NULL
	public static final OMR_ExclusiveVMAccessStatsPointer NULL = new OMR_ExclusiveVMAccessStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_ExclusiveVMAccessStatsPointer(long address) {
		super(address);
	}

	public static OMR_ExclusiveVMAccessStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_ExclusiveVMAccessStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_ExclusiveVMAccessStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_ExclusiveVMAccessStatsPointer(address);
	}

	public OMR_ExclusiveVMAccessStatsPointer add(long count) {
		return OMR_ExclusiveVMAccessStatsPointer.cast(address + (OMR_ExclusiveVMAccessStats.SIZEOF * count));
	}

	public OMR_ExclusiveVMAccessStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_ExclusiveVMAccessStatsPointer addOffset(long offset) {
		return OMR_ExclusiveVMAccessStatsPointer.cast(address + offset);
	}

	public OMR_ExclusiveVMAccessStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_ExclusiveVMAccessStatsPointer sub(long count) {
		return OMR_ExclusiveVMAccessStatsPointer.cast(address - (OMR_ExclusiveVMAccessStats.SIZEOF * count));
	}

	public OMR_ExclusiveVMAccessStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_ExclusiveVMAccessStatsPointer subOffset(long offset) {
		return OMR_ExclusiveVMAccessStatsPointer.cast(address - offset);
	}

	public OMR_ExclusiveVMAccessStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_ExclusiveVMAccessStatsPointer untag(long mask) {
		return OMR_ExclusiveVMAccessStatsPointer.cast(address & ~mask);
	}

	public OMR_ExclusiveVMAccessStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_ExclusiveVMAccessStats.SIZEOF;
	}

	// Implementation methods

	// U64 endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endTimeOffset_", declaredType="U64")
	public UDATA endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_ExclusiveVMAccessStats._endTimeOffset_));
	}

	// U64 endTime
	public UDATAPointer endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._endTimeOffset_));
	}

	// UDATA haltedThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_haltedThreadsOffset_", declaredType="UDATA")
	public UDATA haltedThreads() throws CorruptDataException {
		return getUDATAAtOffset(OMR_ExclusiveVMAccessStats._haltedThreadsOffset_);
	}

	// UDATA haltedThreads
	public UDATAPointer haltedThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._haltedThreadsOffset_));
	}

	// OMR_VMThread* lastResponder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastResponderOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer lastResponder() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(OMR_ExclusiveVMAccessStats._lastResponderOffset_));
	}

	// OMR_VMThread* lastResponder
	public PointerPointer lastResponderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._lastResponderOffset_));
	}

	// OMR_VMThread* requester
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_requesterOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer requester() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(OMR_ExclusiveVMAccessStats._requesterOffset_));
	}

	// OMR_VMThread* requester
	public PointerPointer requesterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._requesterOffset_));
	}

	// U64 startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTimeOffset_", declaredType="U64")
	public UDATA startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_ExclusiveVMAccessStats._startTimeOffset_));
	}

	// U64 startTime
	public UDATAPointer startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._startTimeOffset_));
	}

	// U64 totalResponseTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalResponseTimeOffset_", declaredType="U64")
	public UDATA totalResponseTime() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_ExclusiveVMAccessStats._totalResponseTimeOffset_));
	}

	// U64 totalResponseTime
	public UDATAPointer totalResponseTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_ExclusiveVMAccessStats._totalResponseTimeOffset_));
	}

}
