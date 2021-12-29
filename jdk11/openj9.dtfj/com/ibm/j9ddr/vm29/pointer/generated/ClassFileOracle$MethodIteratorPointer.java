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
 * Structure: ClassFileOracle$MethodIteratorPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$MethodIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$MethodIterator.class)
public class ClassFileOracle$MethodIteratorPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$MethodIteratorPointer NULL = new ClassFileOracle$MethodIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$MethodIteratorPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$MethodIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$MethodIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$MethodIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$MethodIteratorPointer(address);
	}

	public ClassFileOracle$MethodIteratorPointer add(long count) {
		return ClassFileOracle$MethodIteratorPointer.cast(address + (ClassFileOracle$MethodIterator.SIZEOF * count));
	}

	public ClassFileOracle$MethodIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$MethodIteratorPointer addOffset(long offset) {
		return ClassFileOracle$MethodIteratorPointer.cast(address + offset);
	}

	public ClassFileOracle$MethodIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$MethodIteratorPointer sub(long count) {
		return ClassFileOracle$MethodIteratorPointer.cast(address - (ClassFileOracle$MethodIterator.SIZEOF * count));
	}

	public ClassFileOracle$MethodIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$MethodIteratorPointer subOffset(long offset) {
		return ClassFileOracle$MethodIteratorPointer.cast(address - offset);
	}

	public ClassFileOracle$MethodIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$MethodIteratorPointer untag(long mask) {
		return ClassFileOracle$MethodIteratorPointer.cast(address & ~mask);
	}

	public ClassFileOracle$MethodIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$MethodIterator.SIZEOF;
	}

	// Implementation methods

	// J9CfrClassFile* _classFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOffset_", declaredType="J9CfrClassFile*")
	public J9CfrClassFilePointer _classFile() throws CorruptDataException {
		return J9CfrClassFilePointer.cast(getPointerAtOffset(ClassFileOracle$MethodIterator.__classFileOffset_));
	}

	// J9CfrClassFile* _classFile
	public PointerPointer _classFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodIterator.__classFileOffset_));
	}

	// U16 _methodIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodIndexOffset_", declaredType="U16")
	public U16 _methodIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$MethodIterator.__methodIndexOffset_));
	}

	// U16 _methodIndex
	public U16Pointer _methodIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$MethodIterator.__methodIndexOffset_));
	}

	// ClassFileOracle$MethodInfo* _methodsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodsInfoOffset_", declaredType="ClassFileOracle$MethodInfo*")
	public ClassFileOracle$MethodInfoPointer _methodsInfo() throws CorruptDataException {
		return ClassFileOracle$MethodInfoPointer.cast(getPointerAtOffset(ClassFileOracle$MethodIterator.__methodsInfoOffset_));
	}

	// ClassFileOracle$MethodInfo* _methodsInfo
	public PointerPointer _methodsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$MethodIterator.__methodsInfoOffset_));
	}

}
