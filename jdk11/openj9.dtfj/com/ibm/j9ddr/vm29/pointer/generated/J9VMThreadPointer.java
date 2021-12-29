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
 * Structure: J9VMThreadPointer
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
 * The generated code will provide getters for all elements in the J9VMThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMThread.class)
public class J9VMThreadPointer extends StructurePointer {

	// NULL
	public static final J9VMThreadPointer NULL = new J9VMThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMThreadPointer(long address) {
		super(address);
	}

	public static J9VMThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMThreadPointer(address);
	}

	public J9VMThreadPointer add(long count) {
		return J9VMThreadPointer.cast(address + (J9VMThread.SIZEOF * count));
	}

	public J9VMThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMThreadPointer addOffset(long offset) {
		return J9VMThreadPointer.cast(address + offset);
	}

	public J9VMThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMThreadPointer sub(long count) {
		return J9VMThreadPointer.cast(address - (J9VMThread.SIZEOF * count));
	}

	public J9VMThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMThreadPointer subOffset(long offset) {
		return J9VMThreadPointer.cast(address - offset);
	}

	public J9VMThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMThreadPointer untag(long mask) {
		return J9VMThreadPointer.cast(address & ~mask);
	}

	public J9VMThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMThread.SIZEOF;
	}

	// Implementation methods

	// void* activeCardTableBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeCardTableBaseOffset_", declaredType="void*")
	public VoidPointer activeCardTableBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._activeCardTableBaseOffset_));
	}

	// void* activeCardTableBase
	public PointerPointer activeCardTableBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._activeCardTableBaseOffset_));
	}

	// J9StackWalkState* activeWalkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_activeWalkStateOffset_", declaredType="J9StackWalkState*")
	public J9StackWalkStatePointer activeWalkState() throws CorruptDataException {
		return J9StackWalkStatePointer.cast(getPointerAtOffset(J9VMThread._activeWalkStateOffset_));
	}

	// J9StackWalkState* activeWalkState
	public PointerPointer activeWalkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._activeWalkStateOffset_));
	}

	// j9object_t allocateObjectSavePrivate1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateObjectSavePrivate1Offset_", declaredType="j9object_t")
	public J9ObjectPointer allocateObjectSavePrivate1() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._allocateObjectSavePrivate1Offset_));
	}

	// j9object_t allocateObjectSavePrivate1
	public PointerPointer allocateObjectSavePrivate1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._allocateObjectSavePrivate1Offset_));
	}

	// j9object_t allocateObjectSavePrivate2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateObjectSavePrivate2Offset_", declaredType="j9object_t")
	public J9ObjectPointer allocateObjectSavePrivate2() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._allocateObjectSavePrivate2Offset_));
	}

	// j9object_t allocateObjectSavePrivate2
	public PointerPointer allocateObjectSavePrivate2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._allocateObjectSavePrivate2Offset_));
	}

	// J9ModronThreadLocalHeap allocateThreadLocalHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocateThreadLocalHeapOffset_", declaredType="J9ModronThreadLocalHeap")
	public J9ModronThreadLocalHeapPointer allocateThreadLocalHeap() throws CorruptDataException {
		return J9ModronThreadLocalHeapPointer.cast(nonNullFieldEA(J9VMThread._allocateThreadLocalHeapOffset_));
	}

	// J9ModronThreadLocalHeap allocateThreadLocalHeap
	public PointerPointer allocateThreadLocalHeapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._allocateThreadLocalHeapOffset_));
	}

	// void* aotVMwithThreadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotVMwithThreadInfoOffset_", declaredType="void*")
	public VoidPointer aotVMwithThreadInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._aotVMwithThreadInfoOffset_));
	}

	// void* aotVMwithThreadInfo
	public PointerPointer aotVMwithThreadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._aotVMwithThreadInfoOffset_));
	}

	// UDATA* arg0EA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arg0EAOffset_", declaredType="UDATA*")
	public UDATAPointer arg0EA() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._arg0EAOffset_));
	}

	// UDATA* arg0EA
	public PointerPointer arg0EAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._arg0EAOffset_));
	}

	// UDATA asyncEventFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_asyncEventFlagsOffset_", declaredType="UDATA")
	public UDATA asyncEventFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._asyncEventFlagsOffset_);
	}

	// UDATA asyncEventFlags
	public UDATAPointer asyncEventFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._asyncEventFlagsOffset_));
	}

	// j9object_t blockingEnterObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockingEnterObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer blockingEnterObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._blockingEnterObjectOffset_));
	}

	// j9object_t blockingEnterObject
	public PointerPointer blockingEnterObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._blockingEnterObjectOffset_));
	}

	// UDATA* bytecodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodesOffset_", declaredType="UDATA*")
	public UDATAPointer bytecodes() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._bytecodesOffset_));
	}

	// UDATA* bytecodes
	public PointerPointer bytecodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._bytecodesOffset_));
	}

	// UDATA cardTableShiftSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardTableShiftSizeOffset_", declaredType="UDATA")
	public UDATA cardTableShiftSize() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._cardTableShiftSizeOffset_);
	}

	// UDATA cardTableShiftSize
	public UDATAPointer cardTableShiftSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._cardTableShiftSizeOffset_));
	}

	// U8* cardTableVirtualStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cardTableVirtualStartOffset_", declaredType="U8*")
	public U8Pointer cardTableVirtualStart() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._cardTableVirtualStartOffset_));
	}

	// U8* cardTableVirtualStart
	public PointerPointer cardTableVirtualStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._cardTableVirtualStartOffset_));
	}

	// J9StackElement* classLoadingStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadingStackOffset_", declaredType="J9StackElement*")
	public J9StackElementPointer classLoadingStack() throws CorruptDataException {
		return J9StackElementPointer.cast(getPointerAtOffset(J9VMThread._classLoadingStackOffset_));
	}

	// J9StackElement* classLoadingStack
	public PointerPointer classLoadingStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._classLoadingStackOffset_));
	}

	// void* codertTOC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codertTOCOffset_", declaredType="void*")
	public VoidPointer codertTOC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._codertTOCOffset_));
	}

	// void* codertTOC
	public PointerPointer codertTOCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._codertTOCOffset_));
	}

	// UDATA compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compressObjectReferencesOffset_", declaredType="UDATA")
	public UDATA compressObjectReferences() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._compressObjectReferencesOffset_);
	}

	// UDATA compressObjectReferences
	public UDATAPointer compressObjectReferencesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._compressObjectReferencesOffset_));
	}

	// j9object_t currentException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentExceptionOffset_", declaredType="j9object_t")
	public J9ObjectPointer currentException() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._currentExceptionOffset_));
	}

	// j9object_t currentException
	public PointerPointer currentExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._currentExceptionOffset_));
	}

	// UDATA currentOSStackFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentOSStackFreeOffset_", declaredType="UDATA")
	public UDATA currentOSStackFree() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._currentOSStackFreeOffset_);
	}

	// UDATA currentOSStackFree
	public UDATAPointer currentOSStackFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._currentOSStackFreeOffset_));
	}

	// UDATA debugEventData1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData1Offset_", declaredType="UDATA")
	public UDATA debugEventData1() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData1Offset_);
	}

	// UDATA debugEventData1
	public UDATAPointer debugEventData1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData1Offset_));
	}

	// UDATA debugEventData2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData2Offset_", declaredType="UDATA")
	public UDATA debugEventData2() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData2Offset_);
	}

	// UDATA debugEventData2
	public UDATAPointer debugEventData2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData2Offset_));
	}

	// UDATA debugEventData3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData3Offset_", declaredType="UDATA")
	public UDATA debugEventData3() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData3Offset_);
	}

	// UDATA debugEventData3
	public UDATAPointer debugEventData3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData3Offset_));
	}

	// UDATA debugEventData4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData4Offset_", declaredType="UDATA")
	public UDATA debugEventData4() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData4Offset_);
	}

	// UDATA debugEventData4
	public UDATAPointer debugEventData4EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData4Offset_));
	}

	// UDATA debugEventData5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData5Offset_", declaredType="UDATA")
	public UDATA debugEventData5() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData5Offset_);
	}

	// UDATA debugEventData5
	public UDATAPointer debugEventData5EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData5Offset_));
	}

	// UDATA debugEventData6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData6Offset_", declaredType="UDATA")
	public UDATA debugEventData6() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData6Offset_);
	}

	// UDATA debugEventData6
	public UDATAPointer debugEventData6EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData6Offset_));
	}

	// UDATA debugEventData7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData7Offset_", declaredType="UDATA")
	public UDATA debugEventData7() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData7Offset_);
	}

	// UDATA debugEventData7
	public UDATAPointer debugEventData7EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData7Offset_));
	}

	// UDATA debugEventData8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugEventData8Offset_", declaredType="UDATA")
	public UDATA debugEventData8() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._debugEventData8Offset_);
	}

	// UDATA debugEventData8
	public UDATAPointer debugEventData8EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._debugEventData8Offset_));
	}

	// J9JITDecompilationInfo* decompilationStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompilationStackOffset_", declaredType="J9JITDecompilationInfo*")
	public J9JITDecompilationInfoPointer decompilationStack() throws CorruptDataException {
		return J9JITDecompilationInfoPointer.cast(getPointerAtOffset(J9VMThread._decompilationStackOffset_));
	}

	// J9JITDecompilationInfo* decompilationStack
	public PointerPointer decompilationStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._decompilationStackOffset_));
	}

	// J9DLTInformationBlock dltBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dltBlockOffset_", declaredType="J9DLTInformationBlock")
	public J9DLTInformationBlockPointer dltBlock() throws CorruptDataException {
		return J9DLTInformationBlockPointer.cast(nonNullFieldEA(J9VMThread._dltBlockOffset_));
	}

	// J9DLTInformationBlock dltBlock
	public PointerPointer dltBlockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._dltBlockOffset_));
	}

	// UDATA* dropBP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dropBPOffset_", declaredType="UDATA*")
	public UDATAPointer dropBP() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._dropBPOffset_));
	}

	// UDATA* dropBP
	public PointerPointer dropBPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._dropBPOffset_));
	}

	// UDATA dropFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dropFlagsOffset_", declaredType="UDATA")
	public UDATA dropFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._dropFlagsOffset_);
	}

	// UDATA dropFlags
	public UDATAPointer dropFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._dropFlagsOffset_));
	}

	// J9VMEntryLocalStorage* entryLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryLocalStorageOffset_", declaredType="J9VMEntryLocalStorage*")
	public J9VMEntryLocalStoragePointer entryLocalStorage() throws CorruptDataException {
		return J9VMEntryLocalStoragePointer.cast(getPointerAtOffset(J9VMThread._entryLocalStorageOffset_));
	}

	// J9VMEntryLocalStorage* entryLocalStorage
	public PointerPointer entryLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._entryLocalStorageOffset_));
	}

	// U32 eventFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventFlagsOffset_", declaredType="U32")
	public UDATA eventFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._eventFlagsOffset_));
	}

	// U32 eventFlags
	public UDATAPointer eventFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._eventFlagsOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveVMAccessQueueNextOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer exclusiveVMAccessQueueNext() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._exclusiveVMAccessQueueNextOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueueNext
	public PointerPointer exclusiveVMAccessQueueNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._exclusiveVMAccessQueueNextOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueuePrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveVMAccessQueuePreviousOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer exclusiveVMAccessQueuePrevious() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._exclusiveVMAccessQueuePreviousOffset_));
	}

	// J9VMThread* exclusiveVMAccessQueuePrevious
	public PointerPointer exclusiveVMAccessQueuePreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._exclusiveVMAccessQueuePreviousOffset_));
	}

	// UDATA ferReturnType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ferReturnTypeOffset_", declaredType="UDATA")
	public UDATA ferReturnType() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._ferReturnTypeOffset_);
	}

	// UDATA ferReturnType
	public UDATAPointer ferReturnTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._ferReturnTypeOffset_));
	}

	// U64 ferReturnValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ferReturnValueOffset_", declaredType="U64")
	public UDATA ferReturnValue() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMThread._ferReturnValueOffset_));
	}

	// U64 ferReturnValue
	public UDATAPointer ferReturnValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._ferReturnValueOffset_));
	}

	// void* floatTemp1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatTemp1Offset_", declaredType="void*")
	public VoidPointer floatTemp1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._floatTemp1Offset_));
	}

	// void* floatTemp1
	public PointerPointer floatTemp1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._floatTemp1Offset_));
	}

	// void* floatTemp2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatTemp2Offset_", declaredType="void*")
	public VoidPointer floatTemp2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._floatTemp2Offset_));
	}

	// void* floatTemp2
	public PointerPointer floatTemp2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._floatTemp2Offset_));
	}

	// void* floatTemp3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatTemp3Offset_", declaredType="void*")
	public VoidPointer floatTemp3() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._floatTemp3Offset_));
	}

	// void* floatTemp3
	public PointerPointer floatTemp3EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._floatTemp3Offset_));
	}

	// void* floatTemp4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatTemp4Offset_", declaredType="void*")
	public VoidPointer floatTemp4() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._floatTemp4Offset_));
	}

	// void* floatTemp4
	public PointerPointer floatTemp4EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._floatTemp4Offset_));
	}

	// j9object_t forceEarlyReturnObjectSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_forceEarlyReturnObjectSlotOffset_", declaredType="j9object_t")
	public J9ObjectPointer forceEarlyReturnObjectSlot() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._forceEarlyReturnObjectSlotOffset_));
	}

	// j9object_t forceEarlyReturnObjectSlot
	public PointerPointer forceEarlyReturnObjectSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._forceEarlyReturnObjectSlotOffset_));
	}

	// JNINativeInterface_* functions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_functionsOffset_", declaredType="JNINativeInterface_*")
	public JNINativeInterface_Pointer functions() throws CorruptDataException {
		return JNINativeInterface_Pointer.cast(getPointerAtOffset(J9VMThread._functionsOffset_));
	}

	// JNINativeInterface_* functions
	public PointerPointer functionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._functionsOffset_));
	}

	// omrthread_monitor_t gcClassUnloadingMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcClassUnloadingMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer gcClassUnloadingMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9VMThread._gcClassUnloadingMutexOffset_));
	}

	// omrthread_monitor_t gcClassUnloadingMutex
	public PointerPointer gcClassUnloadingMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcClassUnloadingMutexOffset_));
	}

	// J9VMThread* gcClassUnloadingThreadNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcClassUnloadingThreadNextOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer gcClassUnloadingThreadNext() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._gcClassUnloadingThreadNextOffset_));
	}

	// J9VMThread* gcClassUnloadingThreadNext
	public PointerPointer gcClassUnloadingThreadNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcClassUnloadingThreadNextOffset_));
	}

	// J9VMThread* gcClassUnloadingThreadPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcClassUnloadingThreadPreviousOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer gcClassUnloadingThreadPrevious() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._gcClassUnloadingThreadPreviousOffset_));
	}

	// J9VMThread* gcClassUnloadingThreadPrevious
	public PointerPointer gcClassUnloadingThreadPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcClassUnloadingThreadPreviousOffset_));
	}

	// void* gcExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcExtensionsOffset_", declaredType="void*")
	public VoidPointer gcExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._gcExtensionsOffset_));
	}

	// void* gcExtensions
	public PointerPointer gcExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcExtensionsOffset_));
	}

	// J9VMGCSublistFragment gcRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcRememberedSetOffset_", declaredType="J9VMGCSublistFragment")
	public J9VMGCSublistFragmentPointer gcRememberedSet() throws CorruptDataException {
		return J9VMGCSublistFragmentPointer.cast(nonNullFieldEA(J9VMThread._gcRememberedSetOffset_));
	}

	// J9VMGCSublistFragment gcRememberedSet
	public PointerPointer gcRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcRememberedSetOffset_));
	}

	// void* gcTaskListPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcTaskListPtrOffset_", declaredType="void*")
	public VoidPointer gcTaskListPtr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._gcTaskListPtrOffset_));
	}

	// void* gcTaskListPtr
	public PointerPointer gcTaskListPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gcTaskListPtrOffset_));
	}

	// void* gpInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpInfoOffset_", declaredType="void*")
	public VoidPointer gpInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._gpInfoOffset_));
	}

	// void* gpInfo
	public PointerPointer gpInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gpInfoOffset_));
	}

	// UDATA gpProtected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpProtectedOffset_", declaredType="UDATA")
	public UDATA gpProtected() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._gpProtectedOffset_);
	}

	// UDATA gpProtected
	public UDATAPointer gpProtectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._gpProtectedOffset_));
	}

	// void* gpuInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpuInfoOffset_", declaredType="void*")
	public VoidPointer gpuInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._gpuInfoOffset_));
	}

	// void* gpuInfo
	public PointerPointer gpuInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gpuInfoOffset_));
	}

	// J9GSParameters gsParameters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gsParametersOffset_", declaredType="J9GSParameters")
	public J9GSParametersPointer gsParameters() throws CorruptDataException {
		return J9GSParametersPointer.cast(nonNullFieldEA(J9VMThread._gsParametersOffset_));
	}

	// J9GSParameters gsParameters
	public PointerPointer gsParametersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._gsParametersOffset_));
	}

	// U8* heapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapAllocOffset_", declaredType="U8*")
	public U8Pointer heapAlloc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._heapAllocOffset_));
	}

	// U8* heapAlloc
	public PointerPointer heapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._heapAllocOffset_));
	}

	// void* heapBaseForActiveCardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseForActiveCardTableOffset_", declaredType="void*")
	public VoidPointer heapBaseForActiveCardTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._heapBaseForActiveCardTableOffset_));
	}

	// void* heapBaseForActiveCardTable
	public PointerPointer heapBaseForActiveCardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._heapBaseForActiveCardTableOffset_));
	}

	// void* heapBaseForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseForBarrierRange0Offset_", declaredType="void*")
	public VoidPointer heapBaseForBarrierRange0() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._heapBaseForBarrierRange0Offset_));
	}

	// void* heapBaseForBarrierRange0
	public PointerPointer heapBaseForBarrierRange0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._heapBaseForBarrierRange0Offset_));
	}

	// UDATA heapSizeForActiveCardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeForActiveCardTableOffset_", declaredType="UDATA")
	public UDATA heapSizeForActiveCardTable() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._heapSizeForActiveCardTableOffset_);
	}

	// UDATA heapSizeForActiveCardTable
	public UDATAPointer heapSizeForActiveCardTableEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._heapSizeForActiveCardTableOffset_));
	}

	// UDATA heapSizeForBarrierRange0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSizeForBarrierRange0Offset_", declaredType="UDATA")
	public UDATA heapSizeForBarrierRange0() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._heapSizeForBarrierRange0Offset_);
	}

	// UDATA heapSizeForBarrierRange0
	public UDATAPointer heapSizeForBarrierRange0EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._heapSizeForBarrierRange0Offset_));
	}

	// U8* heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapTopOffset_", declaredType="U8*")
	public U8Pointer heapTop() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._heapTopOffset_));
	}

	// U8* heapTop
	public PointerPointer heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._heapTopOffset_));
	}

	// void* highTenureAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_highTenureAddressOffset_", declaredType="void*")
	public VoidPointer highTenureAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._highTenureAddressOffset_));
	}

	// void* highTenureAddress
	public PointerPointer highTenureAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._highTenureAddressOffset_));
	}

	// UDATA inNative
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inNativeOffset_", declaredType="UDATA")
	public UDATA inNative() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._inNativeOffset_);
	}

	// UDATA inNative
	public UDATAPointer inNativeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._inNativeOffset_));
	}

	// J9StackWalkState inlineStackWalkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inlineStackWalkStateOffset_", declaredType="J9StackWalkState")
	public J9StackWalkStatePointer inlineStackWalkState() throws CorruptDataException {
		return J9StackWalkStatePointer.cast(nonNullFieldEA(J9VMThread._inlineStackWalkStateOffset_));
	}

	// J9StackWalkState inlineStackWalkState
	public PointerPointer inlineStackWalkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._inlineStackWalkStateOffset_));
	}

	// UDATA inspectionSuspendCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inspectionSuspendCountOffset_", declaredType="UDATA")
	public UDATA inspectionSuspendCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._inspectionSuspendCountOffset_);
	}

	// UDATA inspectionSuspendCount
	public UDATAPointer inspectionSuspendCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._inspectionSuspendCountOffset_));
	}

	// UDATA inspectorCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inspectorCountOffset_", declaredType="UDATA")
	public UDATA inspectorCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._inspectorCountOffset_);
	}

	// UDATA inspectorCount
	public UDATAPointer inspectorCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._inspectorCountOffset_));
	}

	// UDATA* j2iFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2iFrameOffset_", declaredType="UDATA*")
	public UDATAPointer j2iFrame() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._j2iFrameOffset_));
	}

	// UDATA* j2iFrame
	public PointerPointer j2iFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._j2iFrameOffset_));
	}

	// j9object_t javaLangThreadLocalCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaLangThreadLocalCacheOffset_", declaredType="j9object_t")
	public J9ObjectPointer javaLangThreadLocalCache() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._javaLangThreadLocalCacheOffset_));
	}

	// j9object_t javaLangThreadLocalCache
	public PointerPointer javaLangThreadLocalCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._javaLangThreadLocalCacheOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9VMThread._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._javaVMOffset_));
	}

	// void* jitArtifactSearchCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitArtifactSearchCacheOffset_", declaredType="void*")
	public VoidPointer jitArtifactSearchCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jitArtifactSearchCacheOffset_));
	}

	// void* jitArtifactSearchCache
	public PointerPointer jitArtifactSearchCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitArtifactSearchCacheOffset_));
	}

	// UDATA jitCountDelta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCountDeltaOffset_", declaredType="UDATA")
	public UDATA jitCountDelta() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jitCountDeltaOffset_);
	}

	// UDATA jitCountDelta
	public UDATAPointer jitCountDeltaEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jitCountDeltaOffset_));
	}

	// j9object_t jitException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExceptionOffset_", declaredType="j9object_t")
	public J9ObjectPointer jitException() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._jitExceptionOffset_));
	}

	// j9object_t jitException
	public PointerPointer jitExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitExceptionOffset_));
	}

	// void* jitExceptionHandlerCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitExceptionHandlerCacheOffset_", declaredType="void*")
	public VoidPointer jitExceptionHandlerCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jitExceptionHandlerCacheOffset_));
	}

	// void* jitExceptionHandlerCache
	public PointerPointer jitExceptionHandlerCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitExceptionHandlerCacheOffset_));
	}

	// J9Method* jitMethodToBeCompiled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitMethodToBeCompiledOffset_", declaredType="J9Method*")
	public J9MethodPointer jitMethodToBeCompiled() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9VMThread._jitMethodToBeCompiledOffset_));
	}

	// J9Method* jitMethodToBeCompiled
	public PointerPointer jitMethodToBeCompiledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitMethodToBeCompiledOffset_));
	}

	// void* jitPrivateData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitPrivateDataOffset_", declaredType="void*")
	public VoidPointer jitPrivateData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jitPrivateDataOffset_));
	}

	// void* jitPrivateData
	public PointerPointer jitPrivateDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitPrivateDataOffset_));
	}

	// void* jitReturnAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitReturnAddressOffset_", declaredType="void*")
	public VoidPointer jitReturnAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jitReturnAddressOffset_));
	}

	// void* jitReturnAddress
	public PointerPointer jitReturnAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitReturnAddressOffset_));
	}

	// UDATA jitStackFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitStackFrameFlagsOffset_", declaredType="UDATA")
	public UDATA jitStackFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jitStackFrameFlagsOffset_);
	}

	// UDATA jitStackFrameFlags
	public UDATAPointer jitStackFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jitStackFrameFlagsOffset_));
	}

	// UDATA jitTOC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitTOCOffset_", declaredType="UDATA")
	public UDATA jitTOC() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jitTOCOffset_);
	}

	// UDATA jitTOC
	public UDATAPointer jitTOCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jitTOCOffset_));
	}

	// UDATA jitTransitionJumpSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitTransitionJumpSlotOffset_", declaredType="UDATA")
	public UDATA jitTransitionJumpSlot() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jitTransitionJumpSlotOffset_);
	}

	// UDATA jitTransitionJumpSlot
	public UDATAPointer jitTransitionJumpSlotEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jitTransitionJumpSlotOffset_));
	}

	// void* jitVMwithThreadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitVMwithThreadInfoOffset_", declaredType="void*")
	public VoidPointer jitVMwithThreadInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jitVMwithThreadInfoOffset_));
	}

	// void* jitVMwithThreadInfo
	public PointerPointer jitVMwithThreadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jitVMwithThreadInfoOffset_));
	}

	// UDATA* jniArrayCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniArrayCacheOffset_", declaredType="UDATA*")
	public UDATAPointer jniArrayCache() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._jniArrayCacheOffset_));
	}

	// UDATA* jniArrayCache
	public PointerPointer jniArrayCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniArrayCacheOffset_));
	}

	// UDATA* jniArrayCache2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniArrayCache2Offset_", declaredType="UDATA*")
	public UDATAPointer jniArrayCache2() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._jniArrayCache2Offset_));
	}

	// UDATA* jniArrayCache2
	public PointerPointer jniArrayCache2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniArrayCache2Offset_));
	}

	// void* jniCalloutArgs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCalloutArgsOffset_", declaredType="void*")
	public VoidPointer jniCalloutArgs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._jniCalloutArgsOffset_));
	}

	// void* jniCalloutArgs
	public PointerPointer jniCalloutArgsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniCalloutArgsOffset_));
	}

	// UDATA jniCriticalCopyCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCriticalCopyCountOffset_", declaredType="UDATA")
	public UDATA jniCriticalCopyCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jniCriticalCopyCountOffset_);
	}

	// UDATA jniCriticalCopyCount
	public UDATAPointer jniCriticalCopyCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jniCriticalCopyCountOffset_));
	}

	// UDATA jniCriticalDirectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCriticalDirectCountOffset_", declaredType="UDATA")
	public UDATA jniCriticalDirectCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jniCriticalDirectCountOffset_);
	}

	// UDATA jniCriticalDirectCount
	public UDATAPointer jniCriticalDirectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jniCriticalDirectCountOffset_));
	}

	// UDATA* jniCurrentReference
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniCurrentReferenceOffset_", declaredType="UDATA*")
	public UDATAPointer jniCurrentReference() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._jniCurrentReferenceOffset_));
	}

	// UDATA* jniCurrentReference
	public PointerPointer jniCurrentReferenceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniCurrentReferenceOffset_));
	}

	// UDATA* jniLimitReference
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniLimitReferenceOffset_", declaredType="UDATA*")
	public UDATAPointer jniLimitReference() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._jniLimitReferenceOffset_));
	}

	// UDATA* jniLimitReference
	public PointerPointer jniLimitReferenceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniLimitReferenceOffset_));
	}

	// UDATA* jniLocalReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniLocalReferencesOffset_", declaredType="UDATA*")
	public UDATAPointer jniLocalReferences() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._jniLocalReferencesOffset_));
	}

	// UDATA* jniLocalReferences
	public PointerPointer jniLocalReferencesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniLocalReferencesOffset_));
	}

	// J9MonitorEnterRecord* jniMonitorEnterRecords
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniMonitorEnterRecordsOffset_", declaredType="J9MonitorEnterRecord*")
	public J9MonitorEnterRecordPointer jniMonitorEnterRecords() throws CorruptDataException {
		return J9MonitorEnterRecordPointer.cast(getPointerAtOffset(J9VMThread._jniMonitorEnterRecordsOffset_));
	}

	// J9MonitorEnterRecord* jniMonitorEnterRecords
	public PointerPointer jniMonitorEnterRecordsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniMonitorEnterRecordsOffset_));
	}

	// J9Pool* jniReferenceFrames
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniReferenceFramesOffset_", declaredType="J9Pool*")
	public J9PoolPointer jniReferenceFrames() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9VMThread._jniReferenceFramesOffset_));
	}

	// J9Pool* jniReferenceFrames
	public PointerPointer jniReferenceFramesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._jniReferenceFramesOffset_));
	}

	// UDATA jniVMAccessCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniVMAccessCountOffset_", declaredType="UDATA")
	public UDATA jniVMAccessCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._jniVMAccessCountOffset_);
	}

	// UDATA jniVMAccessCount
	public UDATAPointer jniVMAccessCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._jniVMAccessCountOffset_));
	}

	// J9JITDecompilationInfo* lastDecompilation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastDecompilationOffset_", declaredType="J9JITDecompilationInfo*")
	public J9JITDecompilationInfoPointer lastDecompilation() throws CorruptDataException {
		return J9JITDecompilationInfoPointer.cast(getPointerAtOffset(J9VMThread._lastDecompilationOffset_));
	}

	// J9JITDecompilationInfo* lastDecompilation
	public PointerPointer lastDecompilationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._lastDecompilationOffset_));
	}

	// J9VMThread* linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkNextOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer linkNext() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._linkNextOffset_));
	}

	// J9VMThread* linkNext
	public PointerPointer linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._linkNextOffset_));
	}

	// J9VMThread* linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkPreviousOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer linkPrevious() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMThread._linkPreviousOffset_));
	}

	// J9VMThread* linkPrevious
	public PointerPointer linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._linkPreviousOffset_));
	}

	// J9Method* literals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_literalsOffset_", declaredType="J9Method*")
	public J9MethodPointer literals() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9VMThread._literalsOffset_));
	}

	// J9Method* literals
	public PointerPointer literalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._literalsOffset_));
	}

	// void* lowTenureAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lowTenureAddressOffset_", declaredType="void*")
	public VoidPointer lowTenureAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._lowTenureAddressOffset_));
	}

	// void* lowTenureAddress
	public PointerPointer lowTenureAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._lowTenureAddressOffset_));
	}

	// U32 ludclBPOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ludclBPOffsetOffset_", declaredType="U32")
	public UDATA ludclBPOffset() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._ludclBPOffsetOffset_));
	}

	// U32 ludclBPOffset
	public UDATAPointer ludclBPOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._ludclBPOffsetOffset_));
	}

	// U32 ludclInlineDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ludclInlineDepthOffset_", declaredType="U32")
	public UDATA ludclInlineDepth() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._ludclInlineDepthOffset_));
	}

	// U32 ludclInlineDepth
	public UDATAPointer ludclInlineDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._ludclInlineDepthOffset_));
	}

	// UDATA maxProfilingCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxProfilingCountOffset_", declaredType="UDATA")
	public UDATA maxProfilingCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._maxProfilingCountOffset_);
	}

	// UDATA maxProfilingCount
	public UDATAPointer maxProfilingCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._maxProfilingCountOffset_));
	}

	// UDATA mgmtBlockedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtBlockedCountOffset_", declaredType="UDATA")
	public UDATA mgmtBlockedCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._mgmtBlockedCountOffset_);
	}

	// UDATA mgmtBlockedCount
	public UDATAPointer mgmtBlockedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtBlockedCountOffset_));
	}

	// UDATA mgmtBlockedStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtBlockedStartOffset_", declaredType="UDATA")
	public UDATA mgmtBlockedStart() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._mgmtBlockedStartOffset_);
	}

	// UDATA mgmtBlockedStart
	public UDATAPointer mgmtBlockedStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtBlockedStartOffset_));
	}

	// U64 mgmtBlockedTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtBlockedTimeStartOffset_", declaredType="U64")
	public UDATA mgmtBlockedTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMThread._mgmtBlockedTimeStartOffset_));
	}

	// U64 mgmtBlockedTimeStart
	public UDATAPointer mgmtBlockedTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtBlockedTimeStartOffset_));
	}

	// U64 mgmtBlockedTimeTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtBlockedTimeTotalOffset_", declaredType="U64")
	public UDATA mgmtBlockedTimeTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMThread._mgmtBlockedTimeTotalOffset_));
	}

	// U64 mgmtBlockedTimeTotal
	public UDATAPointer mgmtBlockedTimeTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtBlockedTimeTotalOffset_));
	}

	// UDATA mgmtWaitedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtWaitedCountOffset_", declaredType="UDATA")
	public UDATA mgmtWaitedCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._mgmtWaitedCountOffset_);
	}

	// UDATA mgmtWaitedCount
	public UDATAPointer mgmtWaitedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtWaitedCountOffset_));
	}

	// UDATA mgmtWaitedStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtWaitedStartOffset_", declaredType="UDATA")
	public UDATA mgmtWaitedStart() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._mgmtWaitedStartOffset_);
	}

	// UDATA mgmtWaitedStart
	public UDATAPointer mgmtWaitedStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtWaitedStartOffset_));
	}

	// U64 mgmtWaitedTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtWaitedTimeStartOffset_", declaredType="U64")
	public UDATA mgmtWaitedTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMThread._mgmtWaitedTimeStartOffset_));
	}

	// U64 mgmtWaitedTimeStart
	public UDATAPointer mgmtWaitedTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtWaitedTimeStartOffset_));
	}

	// U64 mgmtWaitedTimeTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mgmtWaitedTimeTotalOffset_", declaredType="U64")
	public UDATA mgmtWaitedTimeTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMThread._mgmtWaitedTimeTotalOffset_));
	}

	// U64 mgmtWaitedTimeTotal
	public UDATAPointer mgmtWaitedTimeTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._mgmtWaitedTimeTotalOffset_));
	}

	// J9Pool* monitorEnterRecordPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorEnterRecordPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer monitorEnterRecordPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9VMThread._monitorEnterRecordPoolOffset_));
	}

	// J9Pool* monitorEnterRecordPool
	public PointerPointer monitorEnterRecordPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._monitorEnterRecordPoolOffset_));
	}

	// J9MonitorEnterRecord* monitorEnterRecords
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorEnterRecordsOffset_", declaredType="J9MonitorEnterRecord*")
	public J9MonitorEnterRecordPointer monitorEnterRecords() throws CorruptDataException {
		return J9MonitorEnterRecordPointer.cast(getPointerAtOffset(J9VMThread._monitorEnterRecordsOffset_));
	}

	// J9MonitorEnterRecord* monitorEnterRecords
	public PointerPointer monitorEnterRecordsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._monitorEnterRecordsOffset_));
	}

	// J9ModronThreadLocalHeap nonZeroAllocateThreadLocalHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonZeroAllocateThreadLocalHeapOffset_", declaredType="J9ModronThreadLocalHeap")
	public J9ModronThreadLocalHeapPointer nonZeroAllocateThreadLocalHeap() throws CorruptDataException {
		return J9ModronThreadLocalHeapPointer.cast(nonNullFieldEA(J9VMThread._nonZeroAllocateThreadLocalHeapOffset_));
	}

	// J9ModronThreadLocalHeap nonZeroAllocateThreadLocalHeap
	public PointerPointer nonZeroAllocateThreadLocalHeapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._nonZeroAllocateThreadLocalHeapOffset_));
	}

	// U8* nonZeroHeapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonZeroHeapAllocOffset_", declaredType="U8*")
	public U8Pointer nonZeroHeapAlloc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._nonZeroHeapAllocOffset_));
	}

	// U8* nonZeroHeapAlloc
	public PointerPointer nonZeroHeapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._nonZeroHeapAllocOffset_));
	}

	// U8* nonZeroHeapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonZeroHeapTopOffset_", declaredType="U8*")
	public U8Pointer nonZeroHeapTop() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._nonZeroHeapTopOffset_));
	}

	// U8* nonZeroHeapTop
	public PointerPointer nonZeroHeapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._nonZeroHeapTopOffset_));
	}

	// IDATA nonZeroTlhPrefetchFTA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nonZeroTlhPrefetchFTAOffset_", declaredType="IDATA")
	public IDATA nonZeroTlhPrefetchFTA() throws CorruptDataException {
		return getIDATAAtOffset(J9VMThread._nonZeroTlhPrefetchFTAOffset_);
	}

	// IDATA nonZeroTlhPrefetchFTA
	public IDATAPointer nonZeroTlhPrefetchFTAEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMThread._nonZeroTlhPrefetchFTAOffset_));
	}

	// UDATA* objectFlagSpinLockAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectFlagSpinLockAddressOffset_", declaredType="UDATA*")
	public UDATAPointer objectFlagSpinLockAddress() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._objectFlagSpinLockAddressOffset_));
	}

	// UDATA* objectFlagSpinLockAddress
	public PointerPointer objectFlagSpinLockAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._objectFlagSpinLockAddressOffset_));
	}

	// j9objectmonitor_t[] objectMonitorLookupCache
	public ObjectMonitorReferencePointer objectMonitorLookupCacheEA() throws CorruptDataException {
		return ObjectMonitorReferencePointer.cast(nonNullFieldEA(J9VMThread._objectMonitorLookupCacheOffset_));
	}

	// OMR_VMThread* omrVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrVMThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer omrVMThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(J9VMThread._omrVMThreadOffset_));
	}

	// OMR_VMThread* omrVMThread
	public PointerPointer omrVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._omrVMThreadOffset_));
	}

	// omrthread_t osThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osThreadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer osThread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9VMThread._osThreadOffset_));
	}

	// omrthread_t osThread
	public PointerPointer osThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._osThreadOffset_));
	}

	// J9OSRBuffer* osrBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrBufferOffset_", declaredType="J9OSRBuffer*")
	public J9OSRBufferPointer osrBuffer() throws CorruptDataException {
		return J9OSRBufferPointer.cast(getPointerAtOffset(J9VMThread._osrBufferOffset_));
	}

	// J9OSRBuffer* osrBuffer
	public PointerPointer osrBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._osrBufferOffset_));
	}

	// U32 osrFrameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrFrameIndexOffset_", declaredType="U32")
	public UDATA osrFrameIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._osrFrameIndexOffset_));
	}

	// U32 osrFrameIndex
	public UDATAPointer osrFrameIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._osrFrameIndexOffset_));
	}

	// UDATA* osrJittedFrameCopy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrJittedFrameCopyOffset_", declaredType="UDATA*")
	public UDATAPointer osrJittedFrameCopy() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._osrJittedFrameCopyOffset_));
	}

	// UDATA* osrJittedFrameCopy
	public PointerPointer osrJittedFrameCopyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._osrJittedFrameCopyOffset_));
	}

	// void* osrReturnAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrReturnAddressOffset_", declaredType="void*")
	public VoidPointer osrReturnAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._osrReturnAddressOffset_));
	}

	// void* osrReturnAddress
	public PointerPointer osrReturnAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._osrReturnAddressOffset_));
	}

	// void* osrScratchBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrScratchBufferOffset_", declaredType="void*")
	public VoidPointer osrScratchBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._osrScratchBufferOffset_));
	}

	// void* osrScratchBuffer
	public PointerPointer osrScratchBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._osrScratchBufferOffset_));
	}

	// j9object_t outOfMemoryError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_outOfMemoryErrorOffset_", declaredType="j9object_t")
	public J9ObjectPointer outOfMemoryError() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._outOfMemoryErrorOffset_));
	}

	// j9object_t outOfMemoryError
	public PointerPointer outOfMemoryErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._outOfMemoryErrorOffset_));
	}

	// U8* pc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pcOffset_", declaredType="U8*")
	public U8Pointer pc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._pcOffset_));
	}

	// U8* pc
	public PointerPointer pcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._pcOffset_));
	}

	// UDATA privateFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_privateFlagsOffset_", declaredType="UDATA")
	public UDATA privateFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._privateFlagsOffset_);
	}

	// UDATA privateFlags
	public UDATAPointer privateFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._privateFlagsOffset_));
	}

	// UDATA privateFlags2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_privateFlags2Offset_", declaredType="UDATA")
	public UDATA privateFlags2() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._privateFlags2Offset_);
	}

	// UDATA privateFlags2
	public UDATAPointer privateFlags2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._privateFlags2Offset_));
	}

	// U8* profilingBufferCursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_profilingBufferCursorOffset_", declaredType="U8*")
	public U8Pointer profilingBufferCursor() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._profilingBufferCursorOffset_));
	}

	// U8* profilingBufferCursor
	public PointerPointer profilingBufferCursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._profilingBufferCursorOffset_));
	}

	// U8* profilingBufferEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_profilingBufferEndOffset_", declaredType="U8*")
	public U8Pointer profilingBufferEnd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMThread._profilingBufferEndOffset_));
	}

	// U8* profilingBufferEnd
	public PointerPointer profilingBufferEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._profilingBufferEndOffset_));
	}

	// PortlibPTBuffers_struct* ptBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ptBuffersOffset_", declaredType="PortlibPTBuffers_struct*")
	public PortlibPTBuffers_structPointer ptBuffers() throws CorruptDataException {
		return PortlibPTBuffers_structPointer.cast(getPointerAtOffset(J9VMThread._ptBuffersOffset_));
	}

	// PortlibPTBuffers_struct* ptBuffers
	public PointerPointer ptBuffersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._ptBuffersOffset_));
	}

	// UDATA publicFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_publicFlagsOffset_", declaredType="UDATA")
	public UDATA publicFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._publicFlagsOffset_);
	}

	// UDATA publicFlags
	public UDATAPointer publicFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._publicFlagsOffset_));
	}

	// omrthread_monitor_t publicFlagsMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_publicFlagsMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer publicFlagsMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9VMThread._publicFlagsMutexOffset_));
	}

	// omrthread_monitor_t publicFlagsMutex
	public PointerPointer publicFlagsMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._publicFlagsMutexOffset_));
	}

	// UDATA readBarrierRangeCheckBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readBarrierRangeCheckBaseOffset_", declaredType="UDATA")
	public UDATA readBarrierRangeCheckBase() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._readBarrierRangeCheckBaseOffset_);
	}

	// UDATA readBarrierRangeCheckBase
	public UDATAPointer readBarrierRangeCheckBaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._readBarrierRangeCheckBaseOffset_));
	}

	// U32 readBarrierRangeCheckBaseCompressed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readBarrierRangeCheckBaseCompressedOffset_", declaredType="U32")
	public UDATA readBarrierRangeCheckBaseCompressed() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._readBarrierRangeCheckBaseCompressedOffset_));
	}

	// U32 readBarrierRangeCheckBaseCompressed
	public UDATAPointer readBarrierRangeCheckBaseCompressedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._readBarrierRangeCheckBaseCompressedOffset_));
	}

	// UDATA readBarrierRangeCheckTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readBarrierRangeCheckTopOffset_", declaredType="UDATA")
	public UDATA readBarrierRangeCheckTop() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._readBarrierRangeCheckTopOffset_);
	}

	// UDATA readBarrierRangeCheckTop
	public UDATAPointer readBarrierRangeCheckTopEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._readBarrierRangeCheckTopOffset_));
	}

	// U32 readBarrierRangeCheckTopCompressed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readBarrierRangeCheckTopCompressedOffset_", declaredType="U32")
	public UDATA readBarrierRangeCheckTopCompressed() throws CorruptDataException {
		return new U32(getIntAtOffset(J9VMThread._readBarrierRangeCheckTopCompressedOffset_));
	}

	// U32 readBarrierRangeCheckTopCompressed
	public UDATAPointer readBarrierRangeCheckTopCompressedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._readBarrierRangeCheckTopCompressedOffset_));
	}

	// UDATA returnValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnValueOffset_", declaredType="UDATA")
	public UDATA returnValue() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._returnValueOffset_);
	}

	// UDATA returnValue
	public UDATAPointer returnValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._returnValueOffset_));
	}

	// UDATA returnValue2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnValue2Offset_", declaredType="UDATA")
	public UDATA returnValue2() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._returnValue2Offset_);
	}

	// UDATA returnValue2
	public UDATAPointer returnValue2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._returnValue2Offset_));
	}

	// MM_GCRememberedSetFragment sATBBarrierRememberedSetFragment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sATBBarrierRememberedSetFragmentOffset_", declaredType="MM_GCRememberedSetFragment")
	public MM_GCRememberedSetFragmentPointer sATBBarrierRememberedSetFragment() throws CorruptDataException {
		return MM_GCRememberedSetFragmentPointer.cast(nonNullFieldEA(J9VMThread._sATBBarrierRememberedSetFragmentOffset_));
	}

	// MM_GCRememberedSetFragment sATBBarrierRememberedSetFragment
	public PointerPointer sATBBarrierRememberedSetFragmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._sATBBarrierRememberedSetFragmentOffset_));
	}

	// UDATA safePointCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_safePointCountOffset_", declaredType="UDATA")
	public UDATA safePointCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._safePointCountOffset_);
	}

	// UDATA safePointCount
	public UDATAPointer safePointCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._safePointCountOffset_));
	}

	// J9VMGCSegregatedAllocationCacheEntry* segregatedAllocationCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segregatedAllocationCacheOffset_", declaredType="J9VMGCSegregatedAllocationCacheEntry*")
	public J9VMGCSegregatedAllocationCacheEntryPointer segregatedAllocationCache() throws CorruptDataException {
		return J9VMGCSegregatedAllocationCacheEntryPointer.cast(getPointerAtOffset(J9VMThread._segregatedAllocationCacheOffset_));
	}

	// J9VMGCSegregatedAllocationCacheEntry* segregatedAllocationCache
	public PointerPointer segregatedAllocationCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._segregatedAllocationCacheOffset_));
	}

	// void* sidecarEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sidecarEventOffset_", declaredType="void*")
	public VoidPointer sidecarEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._sidecarEventOffset_));
	}

	// void* sidecarEvent
	public PointerPointer sidecarEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._sidecarEventOffset_));
	}

	// UDATA* sp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spOffset_", declaredType="UDATA*")
	public UDATAPointer sp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._spOffset_));
	}

	// UDATA* sp
	public PointerPointer spEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._spOffset_));
	}

	// J9JavaStack* stackObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackObjectOffset_", declaredType="J9JavaStack*")
	public J9JavaStackPointer stackObject() throws CorruptDataException {
		return J9JavaStackPointer.cast(getPointerAtOffset(J9VMThread._stackObjectOffset_));
	}

	// J9JavaStack* stackObject
	public PointerPointer stackObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._stackObjectOffset_));
	}

	// UDATA* stackOverflowMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackOverflowMarkOffset_", declaredType="UDATA*")
	public UDATAPointer stackOverflowMark() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._stackOverflowMarkOffset_));
	}

	// UDATA* stackOverflowMark
	public PointerPointer stackOverflowMarkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._stackOverflowMarkOffset_));
	}

	// UDATA* stackOverflowMark2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackOverflowMark2Offset_", declaredType="UDATA*")
	public UDATAPointer stackOverflowMark2() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9VMThread._stackOverflowMark2Offset_));
	}

	// UDATA* stackOverflowMark2
	public PointerPointer stackOverflowMark2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._stackOverflowMark2Offset_));
	}

	// J9StackWalkState* stackWalkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackWalkStateOffset_", declaredType="J9StackWalkState*")
	public J9StackWalkStatePointer stackWalkState() throws CorruptDataException {
		return J9StackWalkStatePointer.cast(getPointerAtOffset(J9VMThread._stackWalkStateOffset_));
	}

	// J9StackWalkState* stackWalkState
	public PointerPointer stackWalkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._stackWalkStateOffset_));
	}

	// void* startOfMemoryBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startOfMemoryBlockOffset_", declaredType="void*")
	public VoidPointer startOfMemoryBlock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMThread._startOfMemoryBlockOffset_));
	}

	// void* startOfMemoryBlock
	public PointerPointer startOfMemoryBlockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._startOfMemoryBlockOffset_));
	}

	// j9object_t stopThrowable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stopThrowableOffset_", declaredType="j9object_t")
	public J9ObjectPointer stopThrowable() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._stopThrowableOffset_));
	}

	// j9object_t stopThrowable
	public PointerPointer stopThrowableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._stopThrowableOffset_));
	}

	// UDATA tempSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tempSlotOffset_", declaredType="UDATA")
	public UDATA tempSlot() throws CorruptDataException {
		return getUDATAAtOffset(J9VMThread._tempSlotOffset_);
	}

	// UDATA tempSlot
	public UDATAPointer tempSlotEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMThread._tempSlotOffset_));
	}

	// j9object_t threadObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer threadObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMThread._threadObjectOffset_));
	}

	// j9object_t threadObject
	public PointerPointer threadObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMThread._threadObjectOffset_));
	}

	// IDATA tlhPrefetchFTA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tlhPrefetchFTAOffset_", declaredType="IDATA")
	public IDATA tlhPrefetchFTA() throws CorruptDataException {
		return getIDATAAtOffset(J9VMThread._tlhPrefetchFTAOffset_);
	}

	// IDATA tlhPrefetchFTA
	public IDATAPointer tlhPrefetchFTAEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMThread._tlhPrefetchFTAOffset_));
	}

}
