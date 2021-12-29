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
 * Structure: U_128Pointer
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
 * The generated code will provide getters for all elements in the U_128Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=U_128.class)
public class U_128Pointer extends StructurePointer {

	// NULL
	public static final U_128Pointer NULL = new U_128Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected U_128Pointer(long address) {
		super(address);
	}

	public static U_128Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static U_128Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static U_128Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new U_128Pointer(address);
	}

	public U_128Pointer add(long count) {
		return U_128Pointer.cast(address + (U_128.SIZEOF * count));
	}

	public U_128Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public U_128Pointer addOffset(long offset) {
		return U_128Pointer.cast(address + offset);
	}

	public U_128Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public U_128Pointer sub(long count) {
		return U_128Pointer.cast(address - (U_128.SIZEOF * count));
	}

	public U_128Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public U_128Pointer subOffset(long offset) {
		return U_128Pointer.cast(address - offset);
	}

	public U_128Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public U_128Pointer untag(long mask) {
		return U_128Pointer.cast(address & ~mask);
	}

	public U_128Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return U_128.SIZEOF;
	}

	// Implementation methods

	// U64 high64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_high64Offset_", declaredType="U64")
	public UDATA high64() throws CorruptDataException {
		return new U64(getLongAtOffset(U_128._high64Offset_));
	}

	// U64 high64
	public UDATAPointer high64EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(U_128._high64Offset_));
	}

	// U64 low64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_low64Offset_", declaredType="U64")
	public UDATA low64() throws CorruptDataException {
		return new U64(getLongAtOffset(U_128._low64Offset_));
	}

	// U64 low64
	public UDATAPointer low64EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(U_128._low64Offset_));
	}

}
