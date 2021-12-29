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
 * Structure: MM_AllocateDescriptionPointer
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
 * The generated code will provide getters for all elements in the MM_AllocateDescriptionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_AllocateDescription.class)
public class MM_AllocateDescriptionPointer extends MM_BasePointer {

	// NULL
	public static final MM_AllocateDescriptionPointer NULL = new MM_AllocateDescriptionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_AllocateDescriptionPointer(long address) {
		super(address);
	}

	public static MM_AllocateDescriptionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_AllocateDescriptionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_AllocateDescriptionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_AllocateDescriptionPointer(address);
	}

	public MM_AllocateDescriptionPointer add(long count) {
		return MM_AllocateDescriptionPointer.cast(address + (MM_AllocateDescription.SIZEOF * count));
	}

	public MM_AllocateDescriptionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_AllocateDescriptionPointer addOffset(long offset) {
		return MM_AllocateDescriptionPointer.cast(address + offset);
	}

	public MM_AllocateDescriptionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_AllocateDescriptionPointer sub(long count) {
		return MM_AllocateDescriptionPointer.cast(address - (MM_AllocateDescription.SIZEOF * count));
	}

	public MM_AllocateDescriptionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_AllocateDescriptionPointer subOffset(long offset) {
		return MM_AllocateDescriptionPointer.cast(address - offset);
	}

	public MM_AllocateDescriptionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_AllocateDescriptionPointer untag(long mask) {
		return MM_AllocateDescriptionPointer.cast(address & ~mask);
	}

	public MM_AllocateDescriptionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_AllocateDescription.SIZEOF;
	}

	// Implementation methods

	// U64 _allocateFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocateFlagsOffset_", declaredType="U64")
	public UDATA _allocateFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocateDescription.__allocateFlagsOffset_));
	}

	// U64 _allocateFlags
	public UDATAPointer _allocateFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__allocateFlagsOffset_));
	}

	// bool _allocationSucceeded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationSucceededOffset_", declaredType="bool")
	public boolean _allocationSucceeded() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__allocationSucceededOffset_);
	}

	// bool _allocationSucceeded
	public BoolPointer _allocationSucceededEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__allocationSucceededOffset_));
	}

	// U64 _allocationTaxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationTaxSizeOffset_", declaredType="U64")
	public UDATA _allocationTaxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocateDescription.__allocationTaxSizeOffset_));
	}

	// U64 _allocationTaxSize
	public UDATAPointer _allocationTaxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__allocationTaxSizeOffset_));
	}

	// MM_MemorySubSpace$AllocationType _allocationType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationTypeOffset_", declaredType="MM_MemorySubSpace$AllocationType")
	public long _allocationType() throws CorruptDataException {
		if (MM_MemorySubSpace$AllocationType.SIZEOF == 1) {
			return getByteAtOffset(MM_AllocateDescription.__allocationTypeOffset_);
		} else if (MM_MemorySubSpace$AllocationType.SIZEOF == 2) {
			return getShortAtOffset(MM_AllocateDescription.__allocationTypeOffset_);
		} else if (MM_MemorySubSpace$AllocationType.SIZEOF == 4) {
			return getIntAtOffset(MM_AllocateDescription.__allocationTypeOffset_);
		} else if (MM_MemorySubSpace$AllocationType.SIZEOF == 8) {
			return getLongAtOffset(MM_AllocateDescription.__allocationTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_MemorySubSpace$AllocationType _allocationType
	public EnumPointer _allocationTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_AllocateDescription.__allocationTypeOffset_), MM_MemorySubSpace$AllocationType.class);
	}

	// U64 _bytesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesRequestedOffset_", declaredType="U64")
	public UDATA _bytesRequested() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocateDescription.__bytesRequestedOffset_));
	}

	// U64 _bytesRequested
	public UDATAPointer _bytesRequestedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__bytesRequestedOffset_));
	}

	// bool _chunkedArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkedArrayOffset_", declaredType="bool")
	public boolean _chunkedArray() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__chunkedArrayOffset_);
	}

	// bool _chunkedArray
	public BoolPointer _chunkedArrayEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__chunkedArrayOffset_));
	}

	// bool _climb
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__climbOffset_", declaredType="bool")
	public boolean _climb() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__climbOffset_);
	}

	// bool _climb
	public BoolPointer _climbEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__climbOffset_));
	}

	// bool _collectAndClimb
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectAndClimbOffset_", declaredType="bool")
	public boolean _collectAndClimb() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__collectAndClimbOffset_);
	}

	// bool _collectAndClimb
	public BoolPointer _collectAndClimbEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__collectAndClimbOffset_));
	}

	// bool _collectorAllocateExpandOnFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorAllocateExpandOnFailureOffset_", declaredType="bool")
	public boolean _collectorAllocateExpandOnFailure() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__collectorAllocateExpandOnFailureOffset_);
	}

	// bool _collectorAllocateExpandOnFailure
	public BoolPointer _collectorAllocateExpandOnFailureEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__collectorAllocateExpandOnFailureOffset_));
	}

	// bool _collectorAllocateSatisfyAnywhere
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorAllocateSatisfyAnywhereOffset_", declaredType="bool")
	public boolean _collectorAllocateSatisfyAnywhere() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__collectorAllocateSatisfyAnywhereOffset_);
	}

	// bool _collectorAllocateSatisfyAnywhere
	public BoolPointer _collectorAllocateSatisfyAnywhereEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__collectorAllocateSatisfyAnywhereOffset_));
	}

	// bool _completedFromTlh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__completedFromTlhOffset_", declaredType="bool")
	public boolean _completedFromTlh() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__completedFromTlhOffset_);
	}

	// bool _completedFromTlh
	public BoolPointer _completedFromTlhEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__completedFromTlhOffset_));
	}

	// bool _loaAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaAllocationOffset_", declaredType="bool")
	public boolean _loaAllocation() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__loaAllocationOffset_);
	}

	// bool _loaAllocation
	public BoolPointer _loaAllocationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__loaAllocationOffset_));
	}

	// MM_MemoryPool* _memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer _memoryPool() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_AllocateDescription.__memoryPoolOffset_));
	}

	// MM_MemoryPool* _memoryPool
	public PointerPointer _memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocateDescription.__memoryPoolOffset_));
	}

	// MM_MemorySpace* _memorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySpaceOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _memorySpace() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(MM_AllocateDescription.__memorySpaceOffset_));
	}

	// MM_MemorySpace* _memorySpace
	public PointerPointer _memorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocateDescription.__memorySpaceOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_AllocateDescription.__memorySubSpaceOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpace
	public PointerPointer _memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocateDescription.__memorySubSpaceOffset_));
	}

	// U64 _numArraylets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numArrayletsOffset_", declaredType="U64")
	public UDATA _numArraylets() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocateDescription.__numArrayletsOffset_));
	}

	// U64 _numArraylets
	public UDATAPointer _numArrayletsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__numArrayletsOffset_));
	}

	// bool _nurseryAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryAllocationOffset_", declaredType="bool")
	public boolean _nurseryAllocation() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__nurseryAllocationOffset_);
	}

	// bool _nurseryAllocation
	public BoolPointer _nurseryAllocationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__nurseryAllocationOffset_));
	}

	// U32 _objectFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectFlagsOffset_", declaredType="U32")
	public UDATA _objectFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_AllocateDescription.__objectFlagsOffset_));
	}

	// U32 _objectFlags
	public UDATAPointer _objectFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__objectFlagsOffset_));
	}

	// omrarrayptr_t _spine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spineOffset_", declaredType="omrarrayptr_t")
	public J9IndexableObjectPointer _spine() throws CorruptDataException {
		return J9IndexableObjectPointer.cast(getPointerAtOffset(MM_AllocateDescription.__spineOffset_));
	}

	// omrarrayptr_t _spine
	public PointerPointer _spineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_AllocateDescription.__spineOffset_));
	}

	// U64 _spineBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spineBytesOffset_", declaredType="U64")
	public UDATA _spineBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_AllocateDescription.__spineBytesOffset_));
	}

	// U64 _spineBytes
	public UDATAPointer _spineBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_AllocateDescription.__spineBytesOffset_));
	}

	// bool _threadAtSafePoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadAtSafePointOffset_", declaredType="bool")
	public boolean _threadAtSafePoint() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__threadAtSafePointOffset_);
	}

	// bool _threadAtSafePoint
	public BoolPointer _threadAtSafePointEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__threadAtSafePointOffset_));
	}

	// bool _tlhAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhAllocationOffset_", declaredType="bool")
	public boolean _tlhAllocation() throws CorruptDataException {
		return getBoolAtOffset(MM_AllocateDescription.__tlhAllocationOffset_);
	}

	// bool _tlhAllocation
	public BoolPointer _tlhAllocationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_AllocateDescription.__tlhAllocationOffset_));
	}

}
