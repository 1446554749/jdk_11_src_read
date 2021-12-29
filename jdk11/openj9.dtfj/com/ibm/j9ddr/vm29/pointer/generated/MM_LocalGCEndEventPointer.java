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
 * Structure: MM_LocalGCEndEventPointer
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
 * The generated code will provide getters for all elements in the MM_LocalGCEndEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_LocalGCEndEvent.class)
public class MM_LocalGCEndEventPointer extends StructurePointer {

	// NULL
	public static final MM_LocalGCEndEventPointer NULL = new MM_LocalGCEndEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_LocalGCEndEventPointer(long address) {
		super(address);
	}

	public static MM_LocalGCEndEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_LocalGCEndEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_LocalGCEndEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_LocalGCEndEventPointer(address);
	}

	public MM_LocalGCEndEventPointer add(long count) {
		return MM_LocalGCEndEventPointer.cast(address + (MM_LocalGCEndEvent.SIZEOF * count));
	}

	public MM_LocalGCEndEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_LocalGCEndEventPointer addOffset(long offset) {
		return MM_LocalGCEndEventPointer.cast(address + offset);
	}

	public MM_LocalGCEndEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_LocalGCEndEventPointer sub(long count) {
		return MM_LocalGCEndEventPointer.cast(address - (MM_LocalGCEndEvent.SIZEOF * count));
	}

	public MM_LocalGCEndEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_LocalGCEndEventPointer subOffset(long offset) {
		return MM_LocalGCEndEventPointer.cast(address - offset);
	}

	public MM_LocalGCEndEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_LocalGCEndEventPointer untag(long mask) {
		return MM_LocalGCEndEventPointer.cast(address & ~mask);
	}

	public MM_LocalGCEndEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_LocalGCEndEvent.SIZEOF;
	}

	// Implementation methods

	// U64 backout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_backoutOffset_", declaredType="U64")
	public UDATA backout() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._backoutOffset_));
	}

	// U64 backout
	public UDATAPointer backoutEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._backoutOffset_));
	}

	// U64 causedRememberedSetOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_causedRememberedSetOverflowOffset_", declaredType="U64")
	public UDATA causedRememberedSetOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._causedRememberedSetOverflowOffset_));
	}

	// U64 causedRememberedSetOverflow
	public UDATAPointer causedRememberedSetOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._causedRememberedSetOverflowOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_LocalGCEndEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._eventidOffset_));
	}

	// U64 failedFlipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failedFlipBytesOffset_", declaredType="U64")
	public UDATA failedFlipBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._failedFlipBytesOffset_));
	}

	// U64 failedFlipBytes
	public UDATAPointer failedFlipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._failedFlipBytesOffset_));
	}

	// U64 failedFlipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failedFlipCountOffset_", declaredType="U64")
	public UDATA failedFlipCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._failedFlipCountOffset_));
	}

	// U64 failedFlipCount
	public UDATAPointer failedFlipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._failedFlipCountOffset_));
	}

	// U64 failedTenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failedTenureBytesOffset_", declaredType="U64")
	public UDATA failedTenureBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._failedTenureBytesOffset_));
	}

	// U64 failedTenureBytes
	public UDATAPointer failedTenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._failedTenureBytesOffset_));
	}

	// U64 failedTenureCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failedTenureCountOffset_", declaredType="U64")
	public UDATA failedTenureCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._failedTenureCountOffset_));
	}

	// U64 failedTenureCount
	public UDATAPointer failedTenureCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._failedTenureCountOffset_));
	}

	// U64 flipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flipBytesOffset_", declaredType="U64")
	public UDATA flipBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._flipBytesOffset_));
	}

	// U64 flipBytes
	public UDATAPointer flipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._flipBytesOffset_));
	}

	// U64 flipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flipCountOffset_", declaredType="U64")
	public UDATA flipCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._flipCountOffset_));
	}

	// U64 flipCount
	public UDATAPointer flipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._flipCountOffset_));
	}

	// U64 globalGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalGCCountOffset_", declaredType="U64")
	public UDATA globalGCCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._globalGCCountOffset_));
	}

	// U64 globalGCCount
	public UDATAPointer globalGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._globalGCCountOffset_));
	}

	// U64 loaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loaEnabledOffset_", declaredType="U64")
	public UDATA loaEnabled() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._loaEnabledOffset_));
	}

	// U64 loaEnabled
	public UDATAPointer loaEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._loaEnabledOffset_));
	}

	// U64 localGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localGCCountOffset_", declaredType="U64")
	public UDATA localGCCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._localGCCountOffset_));
	}

	// U64 localGCCount
	public UDATAPointer localGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._localGCCountOffset_));
	}

	// U64 nurseryFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryFreeBytesOffset_", declaredType="U64")
	public UDATA nurseryFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._nurseryFreeBytesOffset_));
	}

	// U64 nurseryFreeBytes
	public UDATAPointer nurseryFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._nurseryFreeBytesOffset_));
	}

	// U64 nurseryTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryTotalBytesOffset_", declaredType="U64")
	public UDATA nurseryTotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._nurseryTotalBytesOffset_));
	}

	// U64 nurseryTotalBytes
	public UDATAPointer nurseryTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._nurseryTotalBytesOffset_));
	}

	// U64 rememberedSetOverflowed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rememberedSetOverflowedOffset_", declaredType="U64")
	public UDATA rememberedSetOverflowed() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._rememberedSetOverflowedOffset_));
	}

	// U64 rememberedSetOverflowed
	public UDATAPointer rememberedSetOverflowedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._rememberedSetOverflowedOffset_));
	}

	// U64 scanCacheOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scanCacheOverflowOffset_", declaredType="U64")
	public UDATA scanCacheOverflow() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._scanCacheOverflowOffset_));
	}

	// U64 scanCacheOverflow
	public UDATAPointer scanCacheOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._scanCacheOverflowOffset_));
	}

	// void* subSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subSpaceOffset_", declaredType="void*")
	public VoidPointer subSpace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_LocalGCEndEvent._subSpaceOffset_));
	}

	// void* subSpace
	public PointerPointer subSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._subSpaceOffset_));
	}

	// U64 tenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureAgeOffset_", declaredType="U64")
	public UDATA tenureAge() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureAgeOffset_));
	}

	// U64 tenureAge
	public UDATAPointer tenureAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureAgeOffset_));
	}

	// U64 tenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureBytesOffset_", declaredType="U64")
	public UDATA tenureBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureBytesOffset_));
	}

	// U64 tenureBytes
	public UDATAPointer tenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureBytesOffset_));
	}

	// U64 tenureCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureCountOffset_", declaredType="U64")
	public UDATA tenureCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureCountOffset_));
	}

	// U64 tenureCount
	public UDATAPointer tenureCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureCountOffset_));
	}

	// U64 tenureFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureFreeBytesOffset_", declaredType="U64")
	public UDATA tenureFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureFreeBytesOffset_));
	}

	// U64 tenureFreeBytes
	public UDATAPointer tenureFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureFreeBytesOffset_));
	}

	// U64 tenureLOAFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureLOAFreeBytesOffset_", declaredType="U64")
	public UDATA tenureLOAFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureLOAFreeBytesOffset_));
	}

	// U64 tenureLOAFreeBytes
	public UDATAPointer tenureLOAFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureLOAFreeBytesOffset_));
	}

	// U64 tenureLOATotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureLOATotalBytesOffset_", declaredType="U64")
	public UDATA tenureLOATotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureLOATotalBytesOffset_));
	}

	// U64 tenureLOATotalBytes
	public UDATAPointer tenureLOATotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureLOATotalBytesOffset_));
	}

	// U64 tenureTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureTotalBytesOffset_", declaredType="U64")
	public UDATA tenureTotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tenureTotalBytesOffset_));
	}

	// U64 tenureTotalBytes
	public UDATAPointer tenureTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tenureTotalBytesOffset_));
	}

	// U64 tilted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tiltedOffset_", declaredType="U64")
	public UDATA tilted() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._tiltedOffset_));
	}

	// U64 tilted
	public UDATAPointer tiltedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._tiltedOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._timestampOffset_));
	}

	// U64 totalMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalMemorySizeOffset_", declaredType="U64")
	public UDATA totalMemorySize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_LocalGCEndEvent._totalMemorySizeOffset_));
	}

	// U64 totalMemorySize
	public UDATAPointer totalMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_LocalGCEndEvent._totalMemorySizeOffset_));
	}

}
