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
 * Structure: J9AVLTreePointer
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
 * The generated code will provide getters for all elements in the J9AVLTreePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9AVLTree.class)
public class J9AVLTreePointer extends StructurePointer {

	// NULL
	public static final J9AVLTreePointer NULL = new J9AVLTreePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9AVLTreePointer(long address) {
		super(address);
	}

	public static J9AVLTreePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9AVLTreePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9AVLTreePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9AVLTreePointer(address);
	}

	public J9AVLTreePointer add(long count) {
		return J9AVLTreePointer.cast(address + (J9AVLTree.SIZEOF * count));
	}

	public J9AVLTreePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9AVLTreePointer addOffset(long offset) {
		return J9AVLTreePointer.cast(address + offset);
	}

	public J9AVLTreePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9AVLTreePointer sub(long count) {
		return J9AVLTreePointer.cast(address - (J9AVLTree.SIZEOF * count));
	}

	public J9AVLTreePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9AVLTreePointer subOffset(long offset) {
		return J9AVLTreePointer.cast(address - offset);
	}

	public J9AVLTreePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9AVLTreePointer untag(long mask) {
		return J9AVLTreePointer.cast(address & ~mask);
	}

	public J9AVLTreePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9AVLTree.SIZEOF;
	}

	// Implementation methods

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9AVLTree._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AVLTree._flagsOffset_));
	}

	// void* genericActionHook
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_genericActionHookOffset_", declaredType="void*")
	public VoidPointer genericActionHook() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AVLTree._genericActionHookOffset_));
	}

	// void* genericActionHook
	public PointerPointer genericActionHookEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._genericActionHookOffset_));
	}

	// void* insertionComparator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_insertionComparatorOffset_", declaredType="void*")
	public VoidPointer insertionComparator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AVLTree._insertionComparatorOffset_));
	}

	// void* insertionComparator
	public PointerPointer insertionComparatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._insertionComparatorOffset_));
	}

	// void* performNodeAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_performNodeActionOffset_", declaredType="void*")
	public VoidPointer performNodeAction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AVLTree._performNodeActionOffset_));
	}

	// void* performNodeAction
	public PointerPointer performNodeActionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._performNodeActionOffset_));
	}

	// OMRPortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(J9AVLTree._portLibraryOffset_));
	}

	// OMRPortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._portLibraryOffset_));
	}

	// J9AVLTreeNode* rootNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootNodeOffset_", declaredType="J9AVLTreeNode*")
	public J9AVLTreeNodePointer rootNode() throws CorruptDataException {
		return J9AVLTreeNodePointer.cast(getPointerAtOffset(J9AVLTree._rootNodeOffset_));
	}

	// J9AVLTreeNode* rootNode
	public PointerPointer rootNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._rootNodeOffset_));
	}

	// void* searchComparator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_searchComparatorOffset_", declaredType="void*")
	public VoidPointer searchComparator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AVLTree._searchComparatorOffset_));
	}

	// void* searchComparator
	public PointerPointer searchComparatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._searchComparatorOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9AVLTree._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9AVLTree._userDataOffset_));
	}

}
