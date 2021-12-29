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
 * Structure: big_int_unionPointer
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
 * The generated code will provide getters for all elements in the big_int_unionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=big_int_union.class)
public class big_int_unionPointer extends StructurePointer {

	// NULL
	public static final big_int_unionPointer NULL = new big_int_unionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected big_int_unionPointer(long address) {
		super(address);
	}

	public static big_int_unionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static big_int_unionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static big_int_unionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new big_int_unionPointer(address);
	}

	public big_int_unionPointer add(long count) {
		return big_int_unionPointer.cast(address + (big_int_union.SIZEOF * count));
	}

	public big_int_unionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public big_int_unionPointer addOffset(long offset) {
		return big_int_unionPointer.cast(address + offset);
	}

	public big_int_unionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public big_int_unionPointer sub(long count) {
		return big_int_unionPointer.cast(address - (big_int_union.SIZEOF * count));
	}

	public big_int_unionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public big_int_unionPointer subOffset(long offset) {
		return big_int_unionPointer.cast(address - offset);
	}

	public big_int_unionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public big_int_unionPointer untag(long mask) {
		return big_int_unionPointer.cast(address & ~mask);
	}

	public big_int_unionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return big_int_union.SIZEOF;
	}

	// Implementation methods

	// UINT32 i32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i32Offset_", declaredType="UINT32")
	public UDATA i32() throws CorruptDataException {
		return new U32(getIntAtOffset(big_int_union._i32Offset_));
	}

	// UINT32 i32
	public UDATAPointer i32EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(big_int_union._i32Offset_));
	}

	// UINT64 i64
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_i64Offset_", declaredType="UINT64")
	public UDATA i64() throws CorruptDataException {
		return new U64(getLongAtOffset(big_int_union._i64Offset_));
	}

	// UINT64 i64
	public UDATAPointer i64EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(big_int_union._i64Offset_));
	}

}
