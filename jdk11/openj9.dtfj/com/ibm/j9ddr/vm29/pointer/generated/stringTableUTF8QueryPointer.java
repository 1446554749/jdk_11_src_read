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
 * Structure: stringTableUTF8QueryPointer
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
 * The generated code will provide getters for all elements in the stringTableUTF8QueryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=stringTableUTF8Query.class)
public class stringTableUTF8QueryPointer extends StructurePointer {

	// NULL
	public static final stringTableUTF8QueryPointer NULL = new stringTableUTF8QueryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected stringTableUTF8QueryPointer(long address) {
		super(address);
	}

	public static stringTableUTF8QueryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static stringTableUTF8QueryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static stringTableUTF8QueryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new stringTableUTF8QueryPointer(address);
	}

	public stringTableUTF8QueryPointer add(long count) {
		return stringTableUTF8QueryPointer.cast(address + (stringTableUTF8Query.SIZEOF * count));
	}

	public stringTableUTF8QueryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public stringTableUTF8QueryPointer addOffset(long offset) {
		return stringTableUTF8QueryPointer.cast(address + offset);
	}

	public stringTableUTF8QueryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public stringTableUTF8QueryPointer sub(long count) {
		return stringTableUTF8QueryPointer.cast(address - (stringTableUTF8Query.SIZEOF * count));
	}

	public stringTableUTF8QueryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public stringTableUTF8QueryPointer subOffset(long offset) {
		return stringTableUTF8QueryPointer.cast(address - offset);
	}

	public stringTableUTF8QueryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public stringTableUTF8QueryPointer untag(long mask) {
		return stringTableUTF8QueryPointer.cast(address & ~mask);
	}

	public stringTableUTF8QueryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return stringTableUTF8Query.SIZEOF;
	}

	// Implementation methods

	// U32 hash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashOffset_", declaredType="U32")
	public UDATA hash() throws CorruptDataException {
		return new U32(getIntAtOffset(stringTableUTF8Query._hashOffset_));
	}

	// U32 hash
	public UDATAPointer hashEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stringTableUTF8Query._hashOffset_));
	}

	// U8* utf8Data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utf8DataOffset_", declaredType="U8*")
	public U8Pointer utf8Data() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(stringTableUTF8Query._utf8DataOffset_));
	}

	// U8* utf8Data
	public PointerPointer utf8DataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(stringTableUTF8Query._utf8DataOffset_));
	}

	// UDATA utf8Length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utf8LengthOffset_", declaredType="UDATA")
	public UDATA utf8Length() throws CorruptDataException {
		return getUDATAAtOffset(stringTableUTF8Query._utf8LengthOffset_);
	}

	// UDATA utf8Length
	public UDATAPointer utf8LengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(stringTableUTF8Query._utf8LengthOffset_));
	}

}
