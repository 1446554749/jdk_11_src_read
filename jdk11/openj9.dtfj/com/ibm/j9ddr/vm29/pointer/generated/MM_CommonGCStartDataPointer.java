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
 * Structure: MM_CommonGCStartDataPointer
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
 * The generated code will provide getters for all elements in the MM_CommonGCStartDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CommonGCStartData.class)
public class MM_CommonGCStartDataPointer extends StructurePointer {

	// NULL
	public static final MM_CommonGCStartDataPointer NULL = new MM_CommonGCStartDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CommonGCStartDataPointer(long address) {
		super(address);
	}

	public static MM_CommonGCStartDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CommonGCStartDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CommonGCStartDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CommonGCStartDataPointer(address);
	}

	public MM_CommonGCStartDataPointer add(long count) {
		return MM_CommonGCStartDataPointer.cast(address + (MM_CommonGCStartData.SIZEOF * count));
	}

	public MM_CommonGCStartDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CommonGCStartDataPointer addOffset(long offset) {
		return MM_CommonGCStartDataPointer.cast(address + offset);
	}

	public MM_CommonGCStartDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CommonGCStartDataPointer sub(long count) {
		return MM_CommonGCStartDataPointer.cast(address - (MM_CommonGCStartData.SIZEOF * count));
	}

	public MM_CommonGCStartDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CommonGCStartDataPointer subOffset(long offset) {
		return MM_CommonGCStartDataPointer.cast(address - offset);
	}

	public MM_CommonGCStartDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CommonGCStartDataPointer untag(long mask) {
		return MM_CommonGCStartDataPointer.cast(address & ~mask);
	}

	public MM_CommonGCStartDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CommonGCStartData.SIZEOF;
	}

	// Implementation methods

	// U64 beatenByOtherThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_beatenByOtherThreadOffset_", declaredType="U64")
	public UDATA beatenByOtherThread() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._beatenByOtherThreadOffset_));
	}

	// U64 beatenByOtherThread
	public UDATAPointer beatenByOtherThreadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._beatenByOtherThreadOffset_));
	}

	// MM_CommonGCData commonData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commonDataOffset_", declaredType="MM_CommonGCData")
	public MM_CommonGCDataPointer commonData() throws CorruptDataException {
		return MM_CommonGCDataPointer.cast(nonNullFieldEA(MM_CommonGCStartData._commonDataOffset_));
	}

	// MM_CommonGCData commonData
	public PointerPointer commonDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CommonGCStartData._commonDataOffset_));
	}

	// U64 exclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA exclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._exclusiveAccessTimeOffset_));
	}

	// U64 exclusiveAccessTime
	public UDATAPointer exclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._exclusiveAccessTimeOffset_));
	}

	// U64 haltedThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_haltedThreadsOffset_", declaredType="U64")
	public UDATA haltedThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._haltedThreadsOffset_));
	}

	// U64 haltedThreads
	public UDATAPointer haltedThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._haltedThreadsOffset_));
	}

	// OMR_VMThread* lastResponder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastResponderOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer lastResponder() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_CommonGCStartData._lastResponderOffset_));
	}

	// OMR_VMThread* lastResponder
	public PointerPointer lastResponderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CommonGCStartData._lastResponderOffset_));
	}

	// U64 meanExclusiveAccessIdleTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_meanExclusiveAccessIdleTimeOffset_", declaredType="U64")
	public UDATA meanExclusiveAccessIdleTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._meanExclusiveAccessIdleTimeOffset_));
	}

	// U64 meanExclusiveAccessIdleTime
	public UDATAPointer meanExclusiveAccessIdleTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._meanExclusiveAccessIdleTimeOffset_));
	}

	// U64 nonTlhAllocBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonTlhAllocBytesOffset_", declaredType="U64")
	public UDATA nonTlhAllocBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._nonTlhAllocBytesOffset_));
	}

	// U64 nonTlhAllocBytes
	public UDATAPointer nonTlhAllocBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._nonTlhAllocBytesOffset_));
	}

	// U64 nonTlhAllocCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonTlhAllocCountOffset_", declaredType="U64")
	public UDATA nonTlhAllocCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._nonTlhAllocCountOffset_));
	}

	// U64 nonTlhAllocCount
	public UDATAPointer nonTlhAllocCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._nonTlhAllocCountOffset_));
	}

	// U64 tlhAllocBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhAllocBytesOffset_", declaredType="U64")
	public UDATA tlhAllocBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._tlhAllocBytesOffset_));
	}

	// U64 tlhAllocBytes
	public UDATAPointer tlhAllocBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._tlhAllocBytesOffset_));
	}

	// U64 tlhAllocCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhAllocCountOffset_", declaredType="U64")
	public UDATA tlhAllocCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._tlhAllocCountOffset_));
	}

	// U64 tlhAllocCount
	public UDATAPointer tlhAllocCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._tlhAllocCountOffset_));
	}

	// U64 tlhRequestedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhRequestedBytesOffset_", declaredType="U64")
	public UDATA tlhRequestedBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCStartData._tlhRequestedBytesOffset_));
	}

	// U64 tlhRequestedBytes
	public UDATAPointer tlhRequestedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCStartData._tlhRequestedBytesOffset_));
	}

}
