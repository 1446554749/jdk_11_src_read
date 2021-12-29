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
 * Structure: J9SharedCacheHeaderPointer
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
 * The generated code will provide getters for all elements in the J9SharedCacheHeaderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedCacheHeader.class)
public class J9SharedCacheHeaderPointer extends StructurePointer {

	// NULL
	public static final J9SharedCacheHeaderPointer NULL = new J9SharedCacheHeaderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedCacheHeaderPointer(long address) {
		super(address);
	}

	public static J9SharedCacheHeaderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedCacheHeaderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedCacheHeaderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedCacheHeaderPointer(address);
	}

	public J9SharedCacheHeaderPointer add(long count) {
		return J9SharedCacheHeaderPointer.cast(address + (J9SharedCacheHeader.SIZEOF * count));
	}

	public J9SharedCacheHeaderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedCacheHeaderPointer addOffset(long offset) {
		return J9SharedCacheHeaderPointer.cast(address + offset);
	}

	public J9SharedCacheHeaderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedCacheHeaderPointer sub(long count) {
		return J9SharedCacheHeaderPointer.cast(address - (J9SharedCacheHeader.SIZEOF * count));
	}

	public J9SharedCacheHeaderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedCacheHeaderPointer subOffset(long offset) {
		return J9SharedCacheHeaderPointer.cast(address - offset);
	}

	public J9SharedCacheHeaderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedCacheHeaderPointer untag(long mask) {
		return J9SharedCacheHeaderPointer.cast(address & ~mask);
	}

	public J9SharedCacheHeaderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedCacheHeader.SIZEOF;
	}

	// Implementation methods

	// UDATA aotBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotBytesOffset_", declaredType="UDATA")
	public UDATA aotBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._aotBytesOffset_);
	}

	// UDATA aotBytes
	public UDATAPointer aotBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._aotBytesOffset_));
	}

	// UDATA cacheFullFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheFullFlagsOffset_", declaredType="UDATA")
	public UDATA cacheFullFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._cacheFullFlagsOffset_);
	}

	// UDATA cacheFullFlags
	public UDATAPointer cacheFullFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._cacheFullFlagsOffset_));
	}

	// UDATA ccInitComplete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ccInitCompleteOffset_", declaredType="UDATA")
	public UDATA ccInitComplete() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._ccInitCompleteOffset_);
	}

	// UDATA ccInitComplete
	public UDATAPointer ccInitCompleteEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._ccInitCompleteOffset_));
	}

	// UDATA containsCachelets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_containsCacheletsOffset_", declaredType="UDATA")
	public UDATA containsCachelets() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._containsCacheletsOffset_);
	}

	// UDATA containsCachelets
	public UDATAPointer containsCacheletsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._containsCacheletsOffset_));
	}

	// U8 corruptFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptFlagOffset_", declaredType="U8")
	public U8 corruptFlag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9SharedCacheHeader._corruptFlagOffset_));
	}

	// U8 corruptFlag
	public U8Pointer corruptFlagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9SharedCacheHeader._corruptFlagOffset_));
	}

	// J9WSRP(U8) corruptFlagPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptFlagPtrOffset_", declaredType="J9WSRP(U8)")
	public U8Pointer corruptFlagPtr() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9SharedCacheHeader._corruptFlagPtrOffset_);
		if (nextAddress == 0) {
			return U8Pointer.NULL;
		}
		return U8Pointer.cast(address + (J9SharedCacheHeader._corruptFlagPtrOffset_ + nextAddress));
	}

	// J9WSRP(U8) corruptFlagPtr
	public WideSelfRelativePointer corruptFlagPtrEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._corruptFlagPtrOffset_));
	}

	// UDATA corruptValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptValueOffset_", declaredType="UDATA")
	public UDATA corruptValue() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._corruptValueOffset_);
	}

	// UDATA corruptValue
	public UDATAPointer corruptValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._corruptValueOffset_));
	}

	// IDATA corruptionCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_corruptionCodeOffset_", declaredType="IDATA")
	public IDATA corruptionCode() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedCacheHeader._corruptionCodeOffset_);
	}

	// IDATA corruptionCode
	public IDATAPointer corruptionCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._corruptionCodeOffset_));
	}

	// UDATA crashCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_crashCntrOffset_", declaredType="UDATA")
	public UDATA crashCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._crashCntrOffset_);
	}

	// UDATA crashCntr
	public UDATAPointer crashCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._crashCntrOffset_));
	}

	// UDATA crcValid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_crcValidOffset_", declaredType="UDATA")
	public UDATA crcValid() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._crcValidOffset_);
	}

	// UDATA crcValid
	public UDATAPointer crcValidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._crcValidOffset_));
	}

	// UDATA crcValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_crcValueOffset_", declaredType="UDATA")
	public UDATA crcValue() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._crcValueOffset_);
	}

	// UDATA crcValue
	public UDATAPointer crcValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._crcValueOffset_));
	}

	// UDATA debugRegionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugRegionSizeOffset_", declaredType="UDATA")
	public UDATA debugRegionSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._debugRegionSizeOffset_);
	}

	// UDATA debugRegionSize
	public UDATAPointer debugRegionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._debugRegionSizeOffset_));
	}

	// UDATA extraFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraFlagsOffset_", declaredType="UDATA")
	public UDATA extraFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._extraFlagsOffset_);
	}

	// UDATA extraFlags
	public UDATAPointer extraFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._extraFlagsOffset_));
	}

	// UDATA jitBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitBytesOffset_", declaredType="UDATA")
	public UDATA jitBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._jitBytesOffset_);
	}

	// UDATA jitBytes
	public UDATAPointer jitBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._jitBytesOffset_));
	}

	// UDATA lastMetadataType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastMetadataTypeOffset_", declaredType="UDATA")
	public UDATA lastMetadataType() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._lastMetadataTypeOffset_);
	}

	// UDATA lastMetadataType
	public UDATAPointer lastMetadataTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._lastMetadataTypeOffset_));
	}

	// UDATA lineNumberTableNextSRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lineNumberTableNextSRPOffset_", declaredType="UDATA")
	public UDATA lineNumberTableNextSRP() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._lineNumberTableNextSRPOffset_);
	}

	// UDATA lineNumberTableNextSRP
	public UDATAPointer lineNumberTableNextSRPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._lineNumberTableNextSRPOffset_));
	}

	// UDATA localVariableTableNextSRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localVariableTableNextSRPOffset_", declaredType="UDATA")
	public UDATA localVariableTableNextSRP() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._localVariableTableNextSRPOffset_);
	}

	// UDATA localVariableTableNextSRP
	public UDATAPointer localVariableTableNextSRPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._localVariableTableNextSRPOffset_));
	}

	// U32 locked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedOffset_", declaredType="U32")
	public UDATA locked() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._lockedOffset_));
	}

	// U32 locked
	public UDATAPointer lockedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._lockedOffset_));
	}

	// J9WSRP(U32) lockedPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockedPtrOffset_", declaredType="J9WSRP(U32)")
	public UDATAPointer lockedPtr() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9SharedCacheHeader._lockedPtrOffset_);
		if (nextAddress == 0) {
			return U32Pointer.NULL;
		}
		return U32Pointer.cast(address + (J9SharedCacheHeader._lockedPtrOffset_ + nextAddress));
	}

	// J9WSRP(U32) lockedPtr
	public WideSelfRelativePointer lockedPtrEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._lockedPtrOffset_));
	}

	// I32 maxAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxAOTOffset_", declaredType="I32")
	public IDATA maxAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheHeader._maxAOTOffset_));
	}

	// I32 maxAOT
	public IDATAPointer maxAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._maxAOTOffset_));
	}

	// I32 maxJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxJITOffset_", declaredType="I32")
	public IDATA maxJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheHeader._maxJITOffset_));
	}

	// I32 maxJIT
	public IDATAPointer maxJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._maxJITOffset_));
	}

	// I32 minAOT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minAOTOffset_", declaredType="I32")
	public IDATA minAOT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheHeader._minAOTOffset_));
	}

	// I32 minAOT
	public IDATAPointer minAOTEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._minAOTOffset_));
	}

	// I32 minJIT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minJITOffset_", declaredType="I32")
	public IDATA minJIT() throws CorruptDataException {
		return new I32(getIntAtOffset(J9SharedCacheHeader._minJITOffset_));
	}

	// I32 minJIT
	public IDATAPointer minJITEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._minJITOffset_));
	}

	// UDATA osPageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osPageSizeOffset_", declaredType="UDATA")
	public UDATA osPageSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._osPageSizeOffset_);
	}

	// UDATA osPageSize
	public UDATAPointer osPageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._osPageSizeOffset_));
	}

	// U32 readWriteBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteBytesOffset_", declaredType="U32")
	public UDATA readWriteBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._readWriteBytesOffset_));
	}

	// U32 readWriteBytes
	public UDATAPointer readWriteBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteBytesOffset_));
	}

	// UDATA readWriteCrashCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteCrashCntrOffset_", declaredType="UDATA")
	public UDATA readWriteCrashCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._readWriteCrashCntrOffset_);
	}

	// UDATA readWriteCrashCntr
	public UDATAPointer readWriteCrashCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteCrashCntrOffset_));
	}

	// U32 readWriteFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteFlagsOffset_", declaredType="U32")
	public UDATA readWriteFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._readWriteFlagsOffset_));
	}

	// U32 readWriteFlags
	public UDATAPointer readWriteFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteFlagsOffset_));
	}

	// UDATA readWriteRebuildCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteRebuildCntrOffset_", declaredType="UDATA")
	public UDATA readWriteRebuildCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._readWriteRebuildCntrOffset_);
	}

	// UDATA readWriteRebuildCntr
	public UDATAPointer readWriteRebuildCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteRebuildCntrOffset_));
	}

	// UDATA readWriteSRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteSRPOffset_", declaredType="UDATA")
	public UDATA readWriteSRP() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._readWriteSRPOffset_);
	}

	// UDATA readWriteSRP
	public UDATAPointer readWriteSRPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteSRPOffset_));
	}

	// UDATA readWriteVerifyCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readWriteVerifyCntrOffset_", declaredType="UDATA")
	public UDATA readWriteVerifyCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._readWriteVerifyCntrOffset_);
	}

	// UDATA readWriteVerifyCntr
	public UDATAPointer readWriteVerifyCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readWriteVerifyCntrOffset_));
	}

	// volatile UDATA readerCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readerCountOffset_", declaredType="volatile UDATA")
	public UDATA readerCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._readerCountOffset_);
	}

	// volatile UDATA readerCount
	public UDATAPointer readerCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._readerCountOffset_));
	}

	// U8 roundedPagesFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_roundedPagesFlagOffset_", declaredType="U8")
	public U8 roundedPagesFlag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9SharedCacheHeader._roundedPagesFlagOffset_));
	}

	// U8 roundedPagesFlag
	public U8Pointer roundedPagesFlagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9SharedCacheHeader._roundedPagesFlagOffset_));
	}

	// UDATA segmentSRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentSRPOffset_", declaredType="UDATA")
	public UDATA segmentSRP() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._segmentSRPOffset_);
	}

	// UDATA segmentSRP
	public UDATAPointer segmentSRPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._segmentSRPOffset_));
	}

	// IDATA sharedInternTableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedInternTableBytesOffset_", declaredType="IDATA")
	public IDATA sharedInternTableBytes() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedCacheHeader._sharedInternTableBytesOffset_);
	}

	// IDATA sharedInternTableBytes
	public IDATAPointer sharedInternTableBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._sharedInternTableBytesOffset_));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) sharedStringHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedStringHeadOffset_", declaredType="J9SRP(J9SharedInternSRPHashTableEntry)")
	public J9SharedInternSRPHashTableEntryPointer sharedStringHead() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedCacheHeader._sharedStringHeadOffset_);
		if (nextAddress == 0) {
			return J9SharedInternSRPHashTableEntryPointer.NULL;
		}
		return J9SharedInternSRPHashTableEntryPointer.cast(address + (J9SharedCacheHeader._sharedStringHeadOffset_ + nextAddress));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) sharedStringHead
	public SelfRelativePointer sharedStringHeadEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._sharedStringHeadOffset_));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) sharedStringTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedStringTailOffset_", declaredType="J9SRP(J9SharedInternSRPHashTableEntry)")
	public J9SharedInternSRPHashTableEntryPointer sharedStringTail() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedCacheHeader._sharedStringTailOffset_);
		if (nextAddress == 0) {
			return J9SharedInternSRPHashTableEntryPointer.NULL;
		}
		return J9SharedInternSRPHashTableEntryPointer.cast(address + (J9SharedCacheHeader._sharedStringTailOffset_ + nextAddress));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) sharedStringTail
	public SelfRelativePointer sharedStringTailEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._sharedStringTailOffset_));
	}

	// U32 softMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_softMaxBytesOffset_", declaredType="U32")
	public UDATA softMaxBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._softMaxBytesOffset_));
	}

	// U32 softMaxBytes
	public UDATAPointer softMaxBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._softMaxBytesOffset_));
	}

	// U32 totalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalBytesOffset_", declaredType="U32")
	public UDATA totalBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._totalBytesOffset_));
	}

	// U32 totalBytes
	public UDATAPointer totalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._totalBytesOffset_));
	}

	// U32 totalSharedStringNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSharedStringNodesOffset_", declaredType="U32")
	public UDATA totalSharedStringNodes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._totalSharedStringNodesOffset_));
	}

	// U32 totalSharedStringNodes
	public UDATAPointer totalSharedStringNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._totalSharedStringNodesOffset_));
	}

	// U32 totalSharedStringWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSharedStringWeightOffset_", declaredType="U32")
	public UDATA totalSharedStringWeight() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SharedCacheHeader._totalSharedStringWeightOffset_));
	}

	// U32 totalSharedStringWeight
	public UDATAPointer totalSharedStringWeightEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._totalSharedStringWeightOffset_));
	}

	// J9SRP unused1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused1Offset_", declaredType="J9SRP")
	public VoidPointer unused1() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedCacheHeader._unused1Offset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9SharedCacheHeader._unused1Offset_ + nextAddress));
	}

	// J9SRP unused1
	public SelfRelativePointer unused1EA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused1Offset_));
	}

	// UDATA unused10
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused10Offset_", declaredType="UDATA")
	public UDATA unused10() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused10Offset_);
	}

	// UDATA unused10
	public UDATAPointer unused10EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused10Offset_));
	}

	// UDATA unused2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused2Offset_", declaredType="UDATA")
	public UDATA unused2() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused2Offset_);
	}

	// UDATA unused2
	public UDATAPointer unused2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused2Offset_));
	}

	// UDATA unused3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused3Offset_", declaredType="UDATA")
	public UDATA unused3() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused3Offset_);
	}

	// UDATA unused3
	public UDATAPointer unused3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused3Offset_));
	}

	// UDATA unused4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused4Offset_", declaredType="UDATA")
	public UDATA unused4() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused4Offset_);
	}

	// UDATA unused4
	public UDATAPointer unused4EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused4Offset_));
	}

	// UDATA unused5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused5Offset_", declaredType="UDATA")
	public UDATA unused5() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused5Offset_);
	}

	// UDATA unused5
	public UDATAPointer unused5EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused5Offset_));
	}

	// UDATA unused6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused6Offset_", declaredType="UDATA")
	public UDATA unused6() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused6Offset_);
	}

	// UDATA unused6
	public UDATAPointer unused6EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused6Offset_));
	}

	// UDATA unused8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused8Offset_", declaredType="UDATA")
	public UDATA unused8() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused8Offset_);
	}

	// UDATA unused8
	public UDATAPointer unused8EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused8Offset_));
	}

	// UDATA unused9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused9Offset_", declaredType="UDATA")
	public UDATA unused9() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._unused9Offset_);
	}

	// UDATA unused9
	public UDATAPointer unused9EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._unused9Offset_));
	}

	// UDATA updateCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateCountOffset_", declaredType="UDATA")
	public UDATA updateCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._updateCountOffset_);
	}

	// UDATA updateCount
	public UDATAPointer updateCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._updateCountOffset_));
	}

	// J9WSRP(UDATA) updateCountPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateCountPtrOffset_", declaredType="J9WSRP(UDATA)")
	public UDATAPointer updateCountPtr() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9SharedCacheHeader._updateCountPtrOffset_);
		if (nextAddress == 0) {
			return UDATAPointer.NULL;
		}
		return UDATAPointer.cast(address + (J9SharedCacheHeader._updateCountPtrOffset_ + nextAddress));
	}

	// J9WSRP(UDATA) updateCountPtr
	public WideSelfRelativePointer updateCountPtrEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9SharedCacheHeader._updateCountPtrOffset_));
	}

	// UDATA updateSRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updateSRPOffset_", declaredType="UDATA")
	public UDATA updateSRP() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._updateSRPOffset_);
	}

	// UDATA updateSRP
	public UDATAPointer updateSRPEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._updateSRPOffset_));
	}

	// U16 vmCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmCntrOffset_", declaredType="U16")
	public U16 vmCntr() throws CorruptDataException {
		return new U16(getShortAtOffset(J9SharedCacheHeader._vmCntrOffset_));
	}

	// U16 vmCntr
	public U16Pointer vmCntrEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9SharedCacheHeader._vmCntrOffset_));
	}

	// UDATA writeHash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writeHashOffset_", declaredType="UDATA")
	public UDATA writeHash() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._writeHashOffset_);
	}

	// UDATA writeHash
	public UDATAPointer writeHashEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._writeHashOffset_));
	}

	// UDATA writerCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_writerCountOffset_", declaredType="UDATA")
	public UDATA writerCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedCacheHeader._writerCountOffset_);
	}

	// UDATA writerCount
	public UDATAPointer writerCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedCacheHeader._writerCountOffset_));
	}

}
