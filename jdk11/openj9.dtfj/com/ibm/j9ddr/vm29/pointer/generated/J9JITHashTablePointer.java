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
 * Structure: J9JITHashTablePointer
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
 * The generated code will provide getters for all elements in the J9JITHashTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITHashTable.class)
public class J9JITHashTablePointer extends StructurePointer {

	// NULL
	public static final J9JITHashTablePointer NULL = new J9JITHashTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITHashTablePointer(long address) {
		super(address);
	}

	public static J9JITHashTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITHashTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITHashTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITHashTablePointer(address);
	}

	public J9JITHashTablePointer add(long count) {
		return J9JITHashTablePointer.cast(address + (J9JITHashTable.SIZEOF * count));
	}

	public J9JITHashTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITHashTablePointer addOffset(long offset) {
		return J9JITHashTablePointer.cast(address + offset);
	}

	public J9JITHashTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITHashTablePointer sub(long count) {
		return J9JITHashTablePointer.cast(address - (J9JITHashTable.SIZEOF * count));
	}

	public J9JITHashTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITHashTablePointer subOffset(long offset) {
		return J9JITHashTablePointer.cast(address - offset);
	}

	public J9JITHashTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITHashTablePointer untag(long mask) {
		return J9JITHashTablePointer.cast(address & ~mask);
	}

	public J9JITHashTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITHashTable.SIZEOF;
	}

	// Implementation methods

	// U64* buckets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bucketsOffset_", declaredType="U64*")
	public UDATAPointer buckets() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(J9JITHashTable._bucketsOffset_));
	}

	// U64* buckets
	public PointerPointer bucketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITHashTable._bucketsOffset_));
	}

	// U64* currentAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentAllocateOffset_", declaredType="U64*")
	public UDATAPointer currentAllocate() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(J9JITHashTable._currentAllocateOffset_));
	}

	// U64* currentAllocate
	public PointerPointer currentAllocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITHashTable._currentAllocateOffset_));
	}

	// U64 end
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endOffset_", declaredType="U64")
	public UDATA end() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JITHashTable._endOffset_));
	}

	// U64 end
	public UDATAPointer endEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITHashTable._endOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JITHashTable._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITHashTable._flagsOffset_));
	}

	// U64* methodStoreEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodStoreEndOffset_", declaredType="U64*")
	public UDATAPointer methodStoreEnd() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(J9JITHashTable._methodStoreEndOffset_));
	}

	// U64* methodStoreEnd
	public PointerPointer methodStoreEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITHashTable._methodStoreEndOffset_));
	}

	// U64* methodStoreStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodStoreStartOffset_", declaredType="U64*")
	public UDATAPointer methodStoreStart() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(J9JITHashTable._methodStoreStartOffset_));
	}

	// U64* methodStoreStart
	public PointerPointer methodStoreStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITHashTable._methodStoreStartOffset_));
	}

	// J9AVLTreeNode parentAVLTreeNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parentAVLTreeNodeOffset_", declaredType="J9AVLTreeNode")
	public J9AVLTreeNodePointer parentAVLTreeNode() throws CorruptDataException {
		return J9AVLTreeNodePointer.cast(nonNullFieldEA(J9JITHashTable._parentAVLTreeNodeOffset_));
	}

	// J9AVLTreeNode parentAVLTreeNode
	public PointerPointer parentAVLTreeNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITHashTable._parentAVLTreeNodeOffset_));
	}

	// U64 start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startOffset_", declaredType="U64")
	public UDATA start() throws CorruptDataException {
		return new U64(getLongAtOffset(J9JITHashTable._startOffset_));
	}

	// U64 start
	public UDATAPointer startEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITHashTable._startOffset_));
	}

}
