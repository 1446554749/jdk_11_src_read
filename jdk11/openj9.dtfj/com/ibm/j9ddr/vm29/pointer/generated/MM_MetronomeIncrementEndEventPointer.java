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
 * Structure: MM_MetronomeIncrementEndEventPointer
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
 * The generated code will provide getters for all elements in the MM_MetronomeIncrementEndEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MetronomeIncrementEndEvent.class)
public class MM_MetronomeIncrementEndEventPointer extends StructurePointer {

	// NULL
	public static final MM_MetronomeIncrementEndEventPointer NULL = new MM_MetronomeIncrementEndEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MetronomeIncrementEndEventPointer(long address) {
		super(address);
	}

	public static MM_MetronomeIncrementEndEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MetronomeIncrementEndEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MetronomeIncrementEndEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MetronomeIncrementEndEventPointer(address);
	}

	public MM_MetronomeIncrementEndEventPointer add(long count) {
		return MM_MetronomeIncrementEndEventPointer.cast(address + (MM_MetronomeIncrementEndEvent.SIZEOF * count));
	}

	public MM_MetronomeIncrementEndEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MetronomeIncrementEndEventPointer addOffset(long offset) {
		return MM_MetronomeIncrementEndEventPointer.cast(address + offset);
	}

	public MM_MetronomeIncrementEndEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MetronomeIncrementEndEventPointer sub(long count) {
		return MM_MetronomeIncrementEndEventPointer.cast(address - (MM_MetronomeIncrementEndEvent.SIZEOF * count));
	}

	public MM_MetronomeIncrementEndEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MetronomeIncrementEndEventPointer subOffset(long offset) {
		return MM_MetronomeIncrementEndEventPointer.cast(address - offset);
	}

	public MM_MetronomeIncrementEndEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MetronomeIncrementEndEventPointer untag(long mask) {
		return MM_MetronomeIncrementEndEventPointer.cast(address & ~mask);
	}

	public MM_MetronomeIncrementEndEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MetronomeIncrementEndEvent.SIZEOF;
	}

	// Implementation methods

	// U64 anonymousClassesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonymousClassesUnloadedOffset_", declaredType="U64")
	public UDATA anonymousClassesUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._anonymousClassesUnloadedOffset_));
	}

	// U64 anonymousClassesUnloaded
	public UDATAPointer anonymousClassesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._anonymousClassesUnloadedOffset_));
	}

	// U64 classLoadersUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadersUnloadedOffset_", declaredType="U64")
	public UDATA classLoadersUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._classLoadersUnloadedOffset_));
	}

	// U64 classLoadersUnloaded
	public UDATAPointer classLoadersUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._classLoadersUnloadedOffset_));
	}

	// U64 classesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classesUnloadedOffset_", declaredType="U64")
	public UDATA classesUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._classesUnloadedOffset_));
	}

	// U64 classesUnloaded
	public UDATAPointer classesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._classesUnloadedOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_MetronomeIncrementEndEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._currentThreadOffset_));
	}

	// U64 dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicSoftReferenceThresholdOffset_", declaredType="U64")
	public UDATA dynamicSoftReferenceThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._dynamicSoftReferenceThresholdOffset_));
	}

	// U64 dynamicSoftReferenceThreshold
	public UDATAPointer dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._dynamicSoftReferenceThresholdOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._eventidOffset_));
	}

	// U64 finalizableCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizableCountOffset_", declaredType="U64")
	public UDATA finalizableCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._finalizableCountOffset_));
	}

	// U64 finalizableCount
	public UDATAPointer finalizableCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._finalizableCountOffset_));
	}

	// U64 heapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeOffset_", declaredType="U64")
	public UDATA heapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._heapFreeOffset_));
	}

	// U64 heapFree
	public UDATAPointer heapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._heapFreeOffset_));
	}

	// U64 immortalFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_immortalFreeOffset_", declaredType="U64")
	public UDATA immortalFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._immortalFreeOffset_));
	}

	// U64 immortalFree
	public UDATAPointer immortalFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._immortalFreeOffset_));
	}

	// U64 nonDeterministicSweepConsecutive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonDeterministicSweepConsecutiveOffset_", declaredType="U64")
	public UDATA nonDeterministicSweepConsecutive() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._nonDeterministicSweepConsecutiveOffset_));
	}

	// U64 nonDeterministicSweepConsecutive
	public UDATAPointer nonDeterministicSweepConsecutiveEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._nonDeterministicSweepConsecutiveOffset_));
	}

	// U64 nonDeterministicSweepCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonDeterministicSweepCountOffset_", declaredType="U64")
	public UDATA nonDeterministicSweepCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._nonDeterministicSweepCountOffset_));
	}

	// U64 nonDeterministicSweepCount
	public UDATAPointer nonDeterministicSweepCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._nonDeterministicSweepCountOffset_));
	}

	// U64 nonDeterministicSweepDelay
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonDeterministicSweepDelayOffset_", declaredType="U64")
	public UDATA nonDeterministicSweepDelay() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._nonDeterministicSweepDelayOffset_));
	}

	// U64 nonDeterministicSweepDelay
	public UDATAPointer nonDeterministicSweepDelayEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._nonDeterministicSweepDelayOffset_));
	}

	// U64 objectOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectOverflowCountOffset_", declaredType="U64")
	public UDATA objectOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._objectOverflowCountOffset_));
	}

	// U64 objectOverflowCount
	public UDATAPointer objectOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._objectOverflowCountOffset_));
	}

	// U64 phantomReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_phantomReferenceClearCountOffset_", declaredType="U64")
	public UDATA phantomReferenceClearCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._phantomReferenceClearCountOffset_));
	}

	// U64 phantomReferenceClearCount
	public UDATAPointer phantomReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._phantomReferenceClearCountOffset_));
	}

	// U64 softReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softReferenceClearCountOffset_", declaredType="U64")
	public UDATA softReferenceClearCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._softReferenceClearCountOffset_));
	}

	// U64 softReferenceClearCount
	public UDATAPointer softReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._softReferenceClearCountOffset_));
	}

	// U64 softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softReferenceThresholdOffset_", declaredType="U64")
	public UDATA softReferenceThreshold() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._softReferenceThresholdOffset_));
	}

	// U64 softReferenceThreshold
	public UDATAPointer softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._softReferenceThresholdOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._timestampOffset_));
	}

	// U64 weakReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_weakReferenceClearCountOffset_", declaredType="U64")
	public UDATA weakReferenceClearCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._weakReferenceClearCountOffset_));
	}

	// U64 weakReferenceClearCount
	public UDATAPointer weakReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._weakReferenceClearCountOffset_));
	}

	// U64 workPacketOverflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_workPacketOverflowCountOffset_", declaredType="U64")
	public UDATA workPacketOverflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeIncrementEndEvent._workPacketOverflowCountOffset_));
	}

	// U64 workPacketOverflowCount
	public UDATAPointer workPacketOverflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeIncrementEndEvent._workPacketOverflowCountOffset_));
	}

}
