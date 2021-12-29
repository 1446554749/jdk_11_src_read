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
 * Structure: MM_BaseVirtualPointer
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
 * The generated code will provide getters for all elements in the MM_BaseVirtualPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_BaseVirtual.class)
public class MM_BaseVirtualPointer extends MM_BasePointer {

	// NULL
	public static final MM_BaseVirtualPointer NULL = new MM_BaseVirtualPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_BaseVirtualPointer(long address) {
		super(address);
	}

	public static MM_BaseVirtualPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_BaseVirtualPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_BaseVirtualPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_BaseVirtualPointer(address);
	}

	public MM_BaseVirtualPointer add(long count) {
		return MM_BaseVirtualPointer.cast(address + (MM_BaseVirtual.SIZEOF * count));
	}

	public MM_BaseVirtualPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_BaseVirtualPointer addOffset(long offset) {
		return MM_BaseVirtualPointer.cast(address + offset);
	}

	public MM_BaseVirtualPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_BaseVirtualPointer sub(long count) {
		return MM_BaseVirtualPointer.cast(address - (MM_BaseVirtual.SIZEOF * count));
	}

	public MM_BaseVirtualPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_BaseVirtualPointer subOffset(long offset) {
		return MM_BaseVirtualPointer.cast(address - offset);
	}

	public MM_BaseVirtualPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_BaseVirtualPointer untag(long mask) {
		return MM_BaseVirtualPointer.cast(address & ~mask);
	}

	public MM_BaseVirtualPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_BaseVirtual.SIZEOF;
	}

	// Implementation methods

	// const U8* _typeId
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeIdOffset_", declaredType="const U8*")
	public U8Pointer _typeId() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_BaseVirtual.__typeIdOffset_));
	}

	// const U8* _typeId
	public PointerPointer _typeIdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_BaseVirtual.__typeIdOffset_));
	}

	// void** _vptr$MM_BaseVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$MM_BaseVirtualOffset_", declaredType="void**")
	public PointerPointer _vptr$MM_BaseVirtual() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_BaseVirtual.__vptr$MM_BaseVirtualOffset_));
	}

	// void** _vptr$MM_BaseVirtual
	public PointerPointer _vptr$MM_BaseVirtualEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_BaseVirtual.__vptr$MM_BaseVirtualOffset_));
	}

}
