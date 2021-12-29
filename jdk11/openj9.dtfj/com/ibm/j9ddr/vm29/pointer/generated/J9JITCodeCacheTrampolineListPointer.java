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
 * Structure: J9JITCodeCacheTrampolineListPointer
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
 * The generated code will provide getters for all elements in the J9JITCodeCacheTrampolineListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITCodeCacheTrampolineList.class)
public class J9JITCodeCacheTrampolineListPointer extends StructurePointer {

	// NULL
	public static final J9JITCodeCacheTrampolineListPointer NULL = new J9JITCodeCacheTrampolineListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITCodeCacheTrampolineListPointer(long address) {
		super(address);
	}

	public static J9JITCodeCacheTrampolineListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITCodeCacheTrampolineListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITCodeCacheTrampolineListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITCodeCacheTrampolineListPointer(address);
	}

	public J9JITCodeCacheTrampolineListPointer add(long count) {
		return J9JITCodeCacheTrampolineListPointer.cast(address + (J9JITCodeCacheTrampolineList.SIZEOF * count));
	}

	public J9JITCodeCacheTrampolineListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITCodeCacheTrampolineListPointer addOffset(long offset) {
		return J9JITCodeCacheTrampolineListPointer.cast(address + offset);
	}

	public J9JITCodeCacheTrampolineListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITCodeCacheTrampolineListPointer sub(long count) {
		return J9JITCodeCacheTrampolineListPointer.cast(address - (J9JITCodeCacheTrampolineList.SIZEOF * count));
	}

	public J9JITCodeCacheTrampolineListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITCodeCacheTrampolineListPointer subOffset(long offset) {
		return J9JITCodeCacheTrampolineListPointer.cast(address - offset);
	}

	public J9JITCodeCacheTrampolineListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITCodeCacheTrampolineListPointer untag(long mask) {
		return J9JITCodeCacheTrampolineListPointer.cast(address & ~mask);
	}

	public J9JITCodeCacheTrampolineListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITCodeCacheTrampolineList.SIZEOF;
	}

	// Implementation methods

	// U32* allocPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocPtrOffset_", declaredType="U32*")
	public UDATAPointer allocPtr() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._allocPtrOffset_));
	}

	// U32* allocPtr
	public PointerPointer allocPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._allocPtrOffset_));
	}

	// J9MemorySegment* codeCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeCacheOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer codeCache() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._codeCacheOffset_));
	}

	// J9MemorySegment* codeCache
	public PointerPointer codeCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._codeCacheOffset_));
	}

	// void* heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseOffset_", declaredType="void*")
	public VoidPointer heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._heapBaseOffset_));
	}

	// void* heapBase
	public PointerPointer heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._heapBaseOffset_));
	}

	// void* heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapTopOffset_", declaredType="void*")
	public VoidPointer heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._heapTopOffset_));
	}

	// void* heapTop
	public PointerPointer heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._heapTopOffset_));
	}

	// J9JITCodeCacheTrampolineList* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9JITCodeCacheTrampolineList*")
	public J9JITCodeCacheTrampolineListPointer next() throws CorruptDataException {
		return J9JITCodeCacheTrampolineListPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._nextOffset_));
	}

	// J9JITCodeCacheTrampolineList* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._nextOffset_));
	}

	// U32 numUnresolvedTargets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numUnresolvedTargetsOffset_", declaredType="U32")
	public UDATA numUnresolvedTargets() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JITCodeCacheTrampolineList._numUnresolvedTargetsOffset_));
	}

	// U32 numUnresolvedTargets
	public UDATAPointer numUnresolvedTargetsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._numUnresolvedTargetsOffset_));
	}

	// U32 referenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceCountOffset_", declaredType="U32")
	public UDATA referenceCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JITCodeCacheTrampolineList._referenceCountOffset_));
	}

	// U32 referenceCount
	public UDATAPointer referenceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._referenceCountOffset_));
	}

	// void* targetMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetMapOffset_", declaredType="void*")
	public VoidPointer targetMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._targetMapOffset_));
	}

	// void* targetMap
	public PointerPointer targetMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._targetMapOffset_));
	}

	// void* unresolvedTargetMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unresolvedTargetMapOffset_", declaredType="void*")
	public VoidPointer unresolvedTargetMap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JITCodeCacheTrampolineList._unresolvedTargetMapOffset_));
	}

	// void* unresolvedTargetMap
	public PointerPointer unresolvedTargetMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITCodeCacheTrampolineList._unresolvedTargetMapOffset_));
	}

}
