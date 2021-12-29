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
 * Structure: MM_AcquiredExclusiveToSatisfyAllocationPointer
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
 * The generated code will provide getters for all elements in the MM_AcquiredExclusiveToSatisfyAllocationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_AcquiredExclusiveToSatisfyAllocation.class)
public class MM_AcquiredExclusiveToSatisfyAllocationPointer extends StructurePointer {

	// NULL
	public static final MM_AcquiredExclusiveToSatisfyAllocationPointer NULL = new MM_AcquiredExclusiveToSatisfyAllocationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_AcquiredExclusiveToSatisfyAllocationPointer(long address) {
		super(address);
	}

	public static MM_AcquiredExclusiveToSatisfyAllocationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_AcquiredExclusiveToSatisfyAllocationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_AcquiredExclusiveToSatisfyAllocationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_AcquiredExclusiveToSatisfyAllocationPointer(address);
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer add(long count) {
		return MM_AcquiredExclusiveToSatisfyAllocationPointer.cast(address + (MM_AcquiredExclusiveToSatisfyAllocation.SIZEOF * count));
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer addOffset(long offset) {
		return MM_AcquiredExclusiveToSatisfyAllocationPointer.cast(address + offset);
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer sub(long count) {
		return MM_AcquiredExclusiveToSatisfyAllocationPointer.cast(address - (MM_AcquiredExclusiveToSatisfyAllocation.SIZEOF * count));
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer subOffset(long offset) {
		return MM_AcquiredExclusiveToSatisfyAllocationPointer.cast(address - offset);
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer untag(long mask) {
		return MM_AcquiredExclusiveToSatisfyAllocationPointer.cast(address & ~mask);
	}

	public MM_AcquiredExclusiveToSatisfyAllocationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_AcquiredExclusiveToSatisfyAllocation.SIZEOF;
	}

	// Implementation methods

	// U64 bytesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesRequestedOffset_", declaredType="U64")
	public UDATA bytesRequested() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AcquiredExclusiveToSatisfyAllocation._bytesRequestedOffset_));
	}

	// U64 bytesRequested
	public UDATAPointer bytesRequestedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AcquiredExclusiveToSatisfyAllocation._bytesRequestedOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_AcquiredExclusiveToSatisfyAllocation._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AcquiredExclusiveToSatisfyAllocation._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AcquiredExclusiveToSatisfyAllocation._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AcquiredExclusiveToSatisfyAllocation._eventidOffset_));
	}

	// U64 subSpaceTypeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subSpaceTypeFlagsOffset_", declaredType="U64")
	public UDATA subSpaceTypeFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AcquiredExclusiveToSatisfyAllocation._subSpaceTypeFlagsOffset_));
	}

	// U64 subSpaceTypeFlags
	public UDATAPointer subSpaceTypeFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AcquiredExclusiveToSatisfyAllocation._subSpaceTypeFlagsOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AcquiredExclusiveToSatisfyAllocation._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AcquiredExclusiveToSatisfyAllocation._timestampOffset_));
	}

}
