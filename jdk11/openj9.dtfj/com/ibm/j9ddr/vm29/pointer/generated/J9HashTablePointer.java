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
 * Structure: J9HashTablePointer
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
 * The generated code will provide getters for all elements in the J9HashTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9HashTable.class)
public class J9HashTablePointer extends StructurePointer {

	// NULL
	public static final J9HashTablePointer NULL = new J9HashTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9HashTablePointer(long address) {
		super(address);
	}

	public static J9HashTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9HashTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9HashTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9HashTablePointer(address);
	}

	public J9HashTablePointer add(long count) {
		return J9HashTablePointer.cast(address + (J9HashTable.SIZEOF * count));
	}

	public J9HashTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9HashTablePointer addOffset(long offset) {
		return J9HashTablePointer.cast(address + offset);
	}

	public J9HashTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9HashTablePointer sub(long count) {
		return J9HashTablePointer.cast(address - (J9HashTable.SIZEOF * count));
	}

	public J9HashTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9HashTablePointer subOffset(long offset) {
		return J9HashTablePointer.cast(address - offset);
	}

	public J9HashTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9HashTablePointer untag(long mask) {
		return J9HashTablePointer.cast(address & ~mask);
	}

	public J9HashTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9HashTable.SIZEOF;
	}

	// Implementation methods

	// J9AVLTree* avlTreeTemplate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avlTreeTemplateOffset_", declaredType="J9AVLTree*")
	public J9AVLTreePointer avlTreeTemplate() throws CorruptDataException {
		return J9AVLTreePointer.cast(getPointerAtOffset(J9HashTable._avlTreeTemplateOffset_));
	}

	// J9AVLTree* avlTreeTemplate
	public PointerPointer avlTreeTemplateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._avlTreeTemplateOffset_));
	}

	// U32 entrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entrySizeOffset_", declaredType="U32")
	public UDATA entrySize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._entrySizeOffset_));
	}

	// U32 entrySize
	public UDATAPointer entrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._entrySizeOffset_));
	}

	// void* equalFnUserData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_equalFnUserDataOffset_", declaredType="void*")
	public VoidPointer equalFnUserData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HashTable._equalFnUserDataOffset_));
	}

	// void* equalFnUserData
	public PointerPointer equalFnUserDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._equalFnUserDataOffset_));
	}

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._flagsOffset_));
	}

	// void* hashEqualFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashEqualFnOffset_", declaredType="void*")
	public VoidPointer hashEqualFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HashTable._hashEqualFnOffset_));
	}

	// void* hashEqualFn
	public PointerPointer hashEqualFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._hashEqualFnOffset_));
	}

	// void* hashFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashFnOffset_", declaredType="void*")
	public VoidPointer hashFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HashTable._hashFnOffset_));
	}

	// void* hashFn
	public PointerPointer hashFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._hashFnOffset_));
	}

	// void* hashFnUserData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashFnUserDataOffset_", declaredType="void*")
	public VoidPointer hashFnUserData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HashTable._hashFnUserDataOffset_));
	}

	// void* hashFnUserData
	public PointerPointer hashFnUserDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._hashFnUserDataOffset_));
	}

	// J9Pool* listNodePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_listNodePoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer listNodePool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9HashTable._listNodePoolOffset_));
	}

	// J9Pool* listNodePool
	public PointerPointer listNodePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._listNodePoolOffset_));
	}

	// U32 listNodeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_listNodeSizeOffset_", declaredType="U32")
	public UDATA listNodeSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._listNodeSizeOffset_));
	}

	// U32 listNodeSize
	public UDATAPointer listNodeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._listNodeSizeOffset_));
	}

	// U32 listToTreeThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_listToTreeThresholdOffset_", declaredType="U32")
	public UDATA listToTreeThreshold() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._listToTreeThresholdOffset_));
	}

	// U32 listToTreeThreshold
	public UDATAPointer listToTreeThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._listToTreeThresholdOffset_));
	}

	// U32 memoryCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryCategoryOffset_", declaredType="U32")
	public UDATA memoryCategory() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._memoryCategoryOffset_));
	}

	// U32 memoryCategory
	public UDATAPointer memoryCategoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._memoryCategoryOffset_));
	}

	// U32 nodeAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodeAlignmentOffset_", declaredType="U32")
	public UDATA nodeAlignment() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._nodeAlignmentOffset_));
	}

	// U32 nodeAlignment
	public UDATAPointer nodeAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._nodeAlignmentOffset_));
	}

	// void** nodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodesOffset_", declaredType="void**")
	public PointerPointer nodes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9HashTable._nodesOffset_));
	}

	// void** nodes
	public PointerPointer nodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._nodesOffset_));
	}

	// U32 numberOfNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfNodesOffset_", declaredType="U32")
	public UDATA numberOfNodes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._numberOfNodesOffset_));
	}

	// U32 numberOfNodes
	public UDATAPointer numberOfNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._numberOfNodesOffset_));
	}

	// U32 numberOfTreeNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfTreeNodesOffset_", declaredType="U32")
	public UDATA numberOfTreeNodes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._numberOfTreeNodesOffset_));
	}

	// U32 numberOfTreeNodes
	public UDATAPointer numberOfTreeNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._numberOfTreeNodesOffset_));
	}

	// OMRPortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(J9HashTable._portLibraryOffset_));
	}

	// OMRPortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._portLibraryOffset_));
	}

	// J9HashTable* previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer previous() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9HashTable._previousOffset_));
	}

	// J9HashTable* previous
	public PointerPointer previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._previousOffset_));
	}

	// void* printFn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_printFnOffset_", declaredType="void*")
	public VoidPointer printFn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HashTable._printFnOffset_));
	}

	// void* printFn
	public PointerPointer printFnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._printFnOffset_));
	}

	// const U8* tableName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableNameOffset_", declaredType="const U8*")
	public U8Pointer tableName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9HashTable._tableNameOffset_));
	}

	// const U8* tableName
	public PointerPointer tableNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._tableNameOffset_));
	}

	// U32 tableSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableSizeOffset_", declaredType="U32")
	public UDATA tableSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._tableSizeOffset_));
	}

	// U32 tableSize
	public UDATAPointer tableSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._tableSizeOffset_));
	}

	// J9Pool* treeNodePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_treeNodePoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer treeNodePool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9HashTable._treeNodePoolOffset_));
	}

	// J9Pool* treeNodePool
	public PointerPointer treeNodePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._treeNodePoolOffset_));
	}

	// U32 treeNodeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_treeNodeSizeOffset_", declaredType="U32")
	public UDATA treeNodeSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9HashTable._treeNodeSizeOffset_));
	}

	// U32 treeNodeSize
	public UDATAPointer treeNodeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HashTable._treeNodeSizeOffset_));
	}

	// J9Pool* treePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_treePoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer treePool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9HashTable._treePoolOffset_));
	}

	// J9Pool* treePool
	public PointerPointer treePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HashTable._treePoolOffset_));
	}

}
