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
 * Structure: J9JSRIDataPointer
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
 * The generated code will provide getters for all elements in the J9JSRIDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JSRIData.class)
public class J9JSRIDataPointer extends StructurePointer {

	// NULL
	public static final J9JSRIDataPointer NULL = new J9JSRIDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JSRIDataPointer(long address) {
		super(address);
	}

	public static J9JSRIDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JSRIDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JSRIDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JSRIDataPointer(address);
	}

	public J9JSRIDataPointer add(long count) {
		return J9JSRIDataPointer.cast(address + (J9JSRIData.SIZEOF * count));
	}

	public J9JSRIDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JSRIDataPointer addOffset(long offset) {
		return J9JSRIDataPointer.cast(address + offset);
	}

	public J9JSRIDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JSRIDataPointer sub(long count) {
		return J9JSRIDataPointer.cast(address - (J9JSRIData.SIZEOF * count));
	}

	public J9JSRIDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JSRIDataPointer subOffset(long offset) {
		return J9JSRIDataPointer.cast(address - offset);
	}

	public J9JSRIDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JSRIDataPointer untag(long mask) {
		return J9JSRIDataPointer.cast(address & ~mask);
	}

	public J9JSRIDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JSRIData.SIZEOF;
	}

	// Implementation methods

	// J9JSRIBranch* branchStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_branchStackOffset_", declaredType="J9JSRIBranch*")
	public J9JSRIBranchPointer branchStack() throws CorruptDataException {
		return J9JSRIBranchPointer.cast(getPointerAtOffset(J9JSRIData._branchStackOffset_));
	}

	// J9JSRIBranch* branchStack
	public PointerPointer branchStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._branchStackOffset_));
	}

	// U32 bytesAddedByJSRInliner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesAddedByJSRInlinerOffset_", declaredType="U32")
	public UDATA bytesAddedByJSRInliner() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JSRIData._bytesAddedByJSRInlinerOffset_));
	}

	// U32 bytesAddedByJSRInliner
	public UDATAPointer bytesAddedByJSRInlinerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._bytesAddedByJSRInlinerOffset_));
	}

	// J9CfrAttributeCode* codeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeAttributeOffset_", declaredType="J9CfrAttributeCode*")
	public J9CfrAttributeCodePointer codeAttribute() throws CorruptDataException {
		return J9CfrAttributeCodePointer.cast(getPointerAtOffset(J9JSRIData._codeAttributeOffset_));
	}

	// J9CfrAttributeCode* codeAttribute
	public PointerPointer codeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._codeAttributeOffset_));
	}

	// J9Pool* codeBlockPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeBlockPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer codeBlockPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JSRIData._codeBlockPoolOffset_));
	}

	// J9Pool* codeBlockPool
	public PointerPointer codeBlockPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._codeBlockPoolOffset_));
	}

	// J9CfrConstantPoolInfo* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="J9CfrConstantPoolInfo*")
	public J9CfrConstantPoolInfoPointer constantPool() throws CorruptDataException {
		return J9CfrConstantPoolInfoPointer.cast(getPointerAtOffset(J9JSRIData._constantPoolOffset_));
	}

	// J9CfrConstantPoolInfo* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._constantPoolOffset_));
	}

	// U8* destBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destBufferOffset_", declaredType="U8*")
	public U8Pointer destBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIData._destBufferOffset_));
	}

	// U8* destBuffer
	public PointerPointer destBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._destBufferOffset_));
	}

	// UDATA destBufferIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destBufferIndexOffset_", declaredType="UDATA")
	public UDATA destBufferIndex() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._destBufferIndexOffset_);
	}

	// UDATA destBufferIndex
	public UDATAPointer destBufferIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._destBufferIndexOffset_));
	}

	// UDATA destBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_destBufferSizeOffset_", declaredType="UDATA")
	public UDATA destBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._destBufferSizeOffset_);
	}

	// UDATA destBufferSize
	public UDATAPointer destBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._destBufferSizeOffset_));
	}

	// IDATA errorCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCodeOffset_", declaredType="IDATA")
	public IDATA errorCode() throws CorruptDataException {
		return getIDATAAtOffset(J9JSRIData._errorCodeOffset_);
	}

	// IDATA errorCode
	public IDATAPointer errorCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JSRIData._errorCodeOffset_));
	}

	// U32 errorLocalIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorLocalIndexOffset_", declaredType="U32")
	public UDATA errorLocalIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JSRIData._errorLocalIndexOffset_));
	}

	// U32 errorLocalIndex
	public UDATAPointer errorLocalIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._errorLocalIndexOffset_));
	}

	// J9Pool* exceptionListEntryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionListEntryPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer exceptionListEntryPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JSRIData._exceptionListEntryPoolOffset_));
	}

	// J9Pool* exceptionListEntryPool
	public PointerPointer exceptionListEntryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._exceptionListEntryPoolOffset_));
	}

	// J9JSRIExceptionListEntry* exceptionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableOffset_", declaredType="J9JSRIExceptionListEntry*")
	public J9JSRIExceptionListEntryPointer exceptionTable() throws CorruptDataException {
		return J9JSRIExceptionListEntryPointer.cast(getPointerAtOffset(J9JSRIData._exceptionTableOffset_));
	}

	// J9JSRIExceptionListEntry* exceptionTable
	public PointerPointer exceptionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._exceptionTableOffset_));
	}

	// J9CfrExceptionTableEntry* exceptionTableBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableBufferOffset_", declaredType="J9CfrExceptionTableEntry*")
	public J9CfrExceptionTableEntryPointer exceptionTableBuffer() throws CorruptDataException {
		return J9CfrExceptionTableEntryPointer.cast(getPointerAtOffset(J9JSRIData._exceptionTableBufferOffset_));
	}

	// J9CfrExceptionTableEntry* exceptionTableBuffer
	public PointerPointer exceptionTableBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._exceptionTableBufferOffset_));
	}

	// UDATA exceptionTableBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableBufferSizeOffset_", declaredType="UDATA")
	public UDATA exceptionTableBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._exceptionTableBufferSizeOffset_);
	}

	// UDATA exceptionTableBufferSize
	public UDATAPointer exceptionTableBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._exceptionTableBufferSizeOffset_));
	}

	// J9JSRICodeBlock* firstOutput
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstOutputOffset_", declaredType="J9JSRICodeBlock*")
	public J9JSRICodeBlockPointer firstOutput() throws CorruptDataException {
		return J9JSRICodeBlockPointer.cast(getPointerAtOffset(J9JSRIData._firstOutputOffset_));
	}

	// J9JSRICodeBlock* firstOutput
	public PointerPointer firstOutputEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._firstOutputOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._flagsOffset_));
	}

	// U8* freePointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freePointerOffset_", declaredType="U8*")
	public U8Pointer freePointer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIData._freePointerOffset_));
	}

	// U8* freePointer
	public PointerPointer freePointerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._freePointerOffset_));
	}

	// J9Pool* jsrDataPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jsrDataPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer jsrDataPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9JSRIData._jsrDataPoolOffset_));
	}

	// J9Pool* jsrDataPool
	public PointerPointer jsrDataPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._jsrDataPoolOffset_));
	}

	// J9JSRICodeBlock* lastOutput
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastOutputOffset_", declaredType="J9JSRICodeBlock*")
	public J9JSRICodeBlockPointer lastOutput() throws CorruptDataException {
		return J9JSRICodeBlockPointer.cast(getPointerAtOffset(J9JSRIData._lastOutputOffset_));
	}

	// J9JSRICodeBlock* lastOutput
	public PointerPointer lastOutputEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._lastOutputOffset_));
	}

	// J9JSRIAddressMap* map
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapOffset_", declaredType="J9JSRIAddressMap*")
	public J9JSRIAddressMapPointer map() throws CorruptDataException {
		return J9JSRIAddressMapPointer.cast(getPointerAtOffset(J9JSRIData._mapOffset_));
	}

	// J9JSRIAddressMap* map
	public PointerPointer mapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._mapOffset_));
	}

	// UDATA mapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapSizeOffset_", declaredType="UDATA")
	public UDATA mapSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._mapSizeOffset_);
	}

	// UDATA mapSize
	public UDATAPointer mapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._mapSizeOffset_));
	}

	// UDATA maxLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxLocalsOffset_", declaredType="UDATA")
	public UDATA maxLocals() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._maxLocalsOffset_);
	}

	// UDATA maxLocals
	public UDATAPointer maxLocalsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._maxLocalsOffset_));
	}

	// UDATA maxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackOffset_", declaredType="UDATA")
	public UDATA maxStack() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._maxStackOffset_);
	}

	// UDATA maxStack
	public UDATAPointer maxStackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._maxStackOffset_));
	}

	// J9JSRIExceptionListEntry* originalExceptionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalExceptionTableOffset_", declaredType="J9JSRIExceptionListEntry*")
	public J9JSRIExceptionListEntryPointer originalExceptionTable() throws CorruptDataException {
		return J9JSRIExceptionListEntryPointer.cast(getPointerAtOffset(J9JSRIData._originalExceptionTableOffset_));
	}

	// J9JSRIExceptionListEntry* originalExceptionTable
	public PointerPointer originalExceptionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._originalExceptionTableOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9JSRIData._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._portLibOffset_));
	}

	// U8* segmentEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_segmentEndOffset_", declaredType="U8*")
	public U8Pointer segmentEnd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIData._segmentEndOffset_));
	}

	// U8* segmentEnd
	public PointerPointer segmentEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._segmentEndOffset_));
	}

	// U8* sourceBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sourceBufferOffset_", declaredType="U8*")
	public U8Pointer sourceBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIData._sourceBufferOffset_));
	}

	// U8* sourceBuffer
	public PointerPointer sourceBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIData._sourceBufferOffset_));
	}

	// UDATA sourceBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sourceBufferSizeOffset_", declaredType="UDATA")
	public UDATA sourceBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._sourceBufferSizeOffset_);
	}

	// UDATA sourceBufferSize
	public UDATAPointer sourceBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._sourceBufferSizeOffset_));
	}

	// I32 verboseErrorType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseErrorTypeOffset_", declaredType="I32")
	public IDATA verboseErrorType() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JSRIData._verboseErrorTypeOffset_));
	}

	// I32 verboseErrorType
	public IDATAPointer verboseErrorTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JSRIData._verboseErrorTypeOffset_));
	}

	// IDATA verifyError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyErrorOffset_", declaredType="IDATA")
	public IDATA verifyError() throws CorruptDataException {
		return getIDATAAtOffset(J9JSRIData._verifyErrorOffset_);
	}

	// IDATA verifyError
	public IDATAPointer verifyErrorEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JSRIData._verifyErrorOffset_));
	}

	// UDATA verifyErrorPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyErrorPCOffset_", declaredType="UDATA")
	public UDATA verifyErrorPC() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._verifyErrorPCOffset_);
	}

	// UDATA verifyErrorPC
	public UDATAPointer verifyErrorPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._verifyErrorPCOffset_));
	}

	// UDATA wideBranchesNeeded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_wideBranchesNeededOffset_", declaredType="UDATA")
	public UDATA wideBranchesNeeded() throws CorruptDataException {
		return getUDATAAtOffset(J9JSRIData._wideBranchesNeededOffset_);
	}

	// UDATA wideBranchesNeeded
	public UDATAPointer wideBranchesNeededEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIData._wideBranchesNeededOffset_));
	}

}
