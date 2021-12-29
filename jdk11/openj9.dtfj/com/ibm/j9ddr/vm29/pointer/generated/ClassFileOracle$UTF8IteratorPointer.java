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
 * Structure: ClassFileOracle$UTF8IteratorPointer
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
 * The generated code will provide getters for all elements in the ClassFileOracle$UTF8IteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle$UTF8Iterator.class)
public class ClassFileOracle$UTF8IteratorPointer extends StructurePointer {

	// NULL
	public static final ClassFileOracle$UTF8IteratorPointer NULL = new ClassFileOracle$UTF8IteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOracle$UTF8IteratorPointer(long address) {
		super(address);
	}

	public static ClassFileOracle$UTF8IteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOracle$UTF8IteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOracle$UTF8IteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOracle$UTF8IteratorPointer(address);
	}

	public ClassFileOracle$UTF8IteratorPointer add(long count) {
		return ClassFileOracle$UTF8IteratorPointer.cast(address + (ClassFileOracle$UTF8Iterator.SIZEOF * count));
	}

	public ClassFileOracle$UTF8IteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOracle$UTF8IteratorPointer addOffset(long offset) {
		return ClassFileOracle$UTF8IteratorPointer.cast(address + offset);
	}

	public ClassFileOracle$UTF8IteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOracle$UTF8IteratorPointer sub(long count) {
		return ClassFileOracle$UTF8IteratorPointer.cast(address - (ClassFileOracle$UTF8Iterator.SIZEOF * count));
	}

	public ClassFileOracle$UTF8IteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOracle$UTF8IteratorPointer subOffset(long offset) {
		return ClassFileOracle$UTF8IteratorPointer.cast(address - offset);
	}

	public ClassFileOracle$UTF8IteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOracle$UTF8IteratorPointer untag(long mask) {
		return ClassFileOracle$UTF8IteratorPointer.cast(address & ~mask);
	}

	public ClassFileOracle$UTF8IteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle$UTF8Iterator.SIZEOF;
	}

	// Implementation methods

	// J9CfrClassFile* _classFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOffset_", declaredType="J9CfrClassFile*")
	public J9CfrClassFilePointer _classFile() throws CorruptDataException {
		return J9CfrClassFilePointer.cast(getPointerAtOffset(ClassFileOracle$UTF8Iterator.__classFileOffset_));
	}

	// J9CfrClassFile* _classFile
	public PointerPointer _classFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$UTF8Iterator.__classFileOffset_));
	}

	// U16 _cpIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpIndexOffset_", declaredType="U16")
	public U16 _cpIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle$UTF8Iterator.__cpIndexOffset_));
	}

	// U16 _cpIndex
	public U16Pointer _cpIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle$UTF8Iterator.__cpIndexOffset_));
	}

	// J9CfrConstantPoolInfo* _entry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__entryOffset_", declaredType="J9CfrConstantPoolInfo*")
	public J9CfrConstantPoolInfoPointer _entry() throws CorruptDataException {
		return J9CfrConstantPoolInfoPointer.cast(getPointerAtOffset(ClassFileOracle$UTF8Iterator.__entryOffset_));
	}

	// J9CfrConstantPoolInfo* _entry
	public PointerPointer _entryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle$UTF8Iterator.__entryOffset_));
	}

}
