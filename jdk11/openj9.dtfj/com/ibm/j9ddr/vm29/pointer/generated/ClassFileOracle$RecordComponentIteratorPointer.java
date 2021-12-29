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
 * Structure: ClassFileOracle$RecordComponentIteratorPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$RecordComponentIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$RecordComponentIterator.class)
public class ClassFileOracle$RecordComponentIteratorPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$RecordComponentIteratorPointer NULL = new ClassFileOracle$RecordComponentIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$RecordComponentIteratorPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$RecordComponentIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$RecordComponentIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$RecordComponentIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$RecordComponentIteratorPointer(address);
	}

	public ClassFileOracle$RecordComponentIteratorPointer add(long count) {
		return ClassFileOracle$RecordComponentIteratorPointer.cast(address + (ClassFileOracle$RecordComponentIterator.SIZEOF * count));
	}

	public ClassFileOracle$RecordComponentIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$RecordComponentIteratorPointer addOffset(long offset) {
		return ClassFileOracle$RecordComponentIteratorPointer.cast(address + offset);
	}

	public ClassFileOracle$RecordComponentIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$RecordComponentIteratorPointer sub(long count) {
		return ClassFileOracle$RecordComponentIteratorPointer.cast(address - (ClassFileOracle$RecordComponentIterator.SIZEOF * count));
	}

	public ClassFileOracle$RecordComponentIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$RecordComponentIteratorPointer subOffset(long offset) {
		return ClassFileOracle$RecordComponentIteratorPointer.cast(address - offset);
	}

	public ClassFileOracle$RecordComponentIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$RecordComponentIteratorPointer untag(long mask) {
		return ClassFileOracle$RecordComponentIteratorPointer.cast(address & ~mask);
	}

	public ClassFileOracle$RecordComponentIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$RecordComponentIterator.SIZEOF;
	}

	// Implementation methods

	// U16 _index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__indexOffset_", declaredType="U16")
	public U16 _index() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$RecordComponentIterator.__indexOffset_));
	}

	// U16 _index
	public U16Pointer _indexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$RecordComponentIterator.__indexOffset_));
	}

	// U16 _recordComponentCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recordComponentCountOffset_", declaredType="U16")
	public U16 _recordComponentCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$RecordComponentIterator.__recordComponentCountOffset_));
	}

	// U16 _recordComponentCount
	public U16Pointer _recordComponentCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$RecordComponentIterator.__recordComponentCountOffset_));
	}

	// ClassFileOracle$RecordComponentInfo* _recordComponentsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recordComponentsInfoOffset_", declaredType="ClassFileOracle$RecordComponentInfo*")
	public ClassFileOracle$RecordComponentInfoPointer _recordComponentsInfo() throws CorruptDataException {
		return ClassFileOracle$RecordComponentInfoPointer.cast(getPointerAtOffset(ClassFileOracle$RecordComponentIterator.__recordComponentsInfoOffset_));
	}

	// ClassFileOracle$RecordComponentInfo* _recordComponentsInfo
	public PointerPointer _recordComponentsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$RecordComponentIterator.__recordComponentsInfoOffset_));
	}

}
