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
 * Structure: ClassFileOracle$LocalVariablesIteratorPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$LocalVariablesIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$LocalVariablesIterator.class)
public class ClassFileOracle$LocalVariablesIteratorPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$LocalVariablesIteratorPointer NULL = new ClassFileOracle$LocalVariablesIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$LocalVariablesIteratorPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$LocalVariablesIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$LocalVariablesIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$LocalVariablesIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$LocalVariablesIteratorPointer(address);
	}

	public ClassFileOracle$LocalVariablesIteratorPointer add(long count) {
		return ClassFileOracle$LocalVariablesIteratorPointer.cast(address + (ClassFileOracle$LocalVariablesIterator.SIZEOF * count));
	}

	public ClassFileOracle$LocalVariablesIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$LocalVariablesIteratorPointer addOffset(long offset) {
		return ClassFileOracle$LocalVariablesIteratorPointer.cast(address + offset);
	}

	public ClassFileOracle$LocalVariablesIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$LocalVariablesIteratorPointer sub(long count) {
		return ClassFileOracle$LocalVariablesIteratorPointer.cast(address - (ClassFileOracle$LocalVariablesIterator.SIZEOF * count));
	}

	public ClassFileOracle$LocalVariablesIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$LocalVariablesIteratorPointer subOffset(long offset) {
		return ClassFileOracle$LocalVariablesIteratorPointer.cast(address - offset);
	}

	public ClassFileOracle$LocalVariablesIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$LocalVariablesIteratorPointer untag(long mask) {
		return ClassFileOracle$LocalVariablesIteratorPointer.cast(address & ~mask);
	}

	public ClassFileOracle$LocalVariablesIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$LocalVariablesIterator.SIZEOF;
	}

	// Implementation methods

	// U16 _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="U16")
	public U16 _count() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$LocalVariablesIterator.__countOffset_));
	}

	// U16 _count
	public U16Pointer _countEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$LocalVariablesIterator.__countOffset_));
	}

	// U16 _index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__indexOffset_", declaredType="U16")
	public U16 _index() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$LocalVariablesIterator.__indexOffset_));
	}

	// U16 _index
	public U16Pointer _indexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$LocalVariablesIterator.__indexOffset_));
	}

	// J9CfrLocalVariableTableEntry* _localVariableTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localVariableTableOffset_", declaredType="J9CfrLocalVariableTableEntry*")
	public J9CfrLocalVariableTableEntryPointer _localVariableTable() throws CorruptDataException {
		return J9CfrLocalVariableTableEntryPointer.cast(getPointerAtOffset(ClassFileOracle$LocalVariablesIterator.__localVariableTableOffset_));
	}

	// J9CfrLocalVariableTableEntry* _localVariableTable
	public PointerPointer _localVariableTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$LocalVariablesIterator.__localVariableTableOffset_));
	}

	// U16 _localVariableTableIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localVariableTableIndexOffset_", declaredType="U16")
	public U16 _localVariableTableIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$LocalVariablesIterator.__localVariableTableIndexOffset_));
	}

	// U16 _localVariableTableIndex
	public U16Pointer _localVariableTableIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$LocalVariablesIterator.__localVariableTableIndexOffset_));
	}

	// ClassFileOracle$LocalVariableInfo* _localVariablesInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localVariablesInfoOffset_", declaredType="ClassFileOracle$LocalVariableInfo*")
	public ClassFileOracle$LocalVariableInfoPointer _localVariablesInfo() throws CorruptDataException {
		return ClassFileOracle$LocalVariableInfoPointer.cast(getPointerAtOffset(ClassFileOracle$LocalVariablesIterator.__localVariablesInfoOffset_));
	}

	// ClassFileOracle$LocalVariableInfo* _localVariablesInfo
	public PointerPointer _localVariablesInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$LocalVariablesIterator.__localVariablesInfoOffset_));
	}

}
