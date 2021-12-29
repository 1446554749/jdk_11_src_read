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
 * Structure: J9JSRIAddressMapPointer
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
 * The generated code will provide getters for all elements in the J9JSRIAddressMapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JSRIAddressMap.class)
public class J9JSRIAddressMapPointer extends StructurePointer {

	// NULL
	public static final J9JSRIAddressMapPointer NULL = new J9JSRIAddressMapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JSRIAddressMapPointer(long address) {
		super(address);
	}

	public static J9JSRIAddressMapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JSRIAddressMapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JSRIAddressMapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JSRIAddressMapPointer(address);
	}

	public J9JSRIAddressMapPointer add(long count) {
		return J9JSRIAddressMapPointer.cast(address + (J9JSRIAddressMap.SIZEOF * count));
	}

	public J9JSRIAddressMapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JSRIAddressMapPointer addOffset(long offset) {
		return J9JSRIAddressMapPointer.cast(address + offset);
	}

	public J9JSRIAddressMapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JSRIAddressMapPointer sub(long count) {
		return J9JSRIAddressMapPointer.cast(address - (J9JSRIAddressMap.SIZEOF * count));
	}

	public J9JSRIAddressMapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JSRIAddressMapPointer subOffset(long offset) {
		return J9JSRIAddressMapPointer.cast(address - offset);
	}

	public J9JSRIAddressMapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JSRIAddressMapPointer untag(long mask) {
		return J9JSRIAddressMapPointer.cast(address & ~mask);
	}

	public J9JSRIAddressMapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JSRIAddressMap.SIZEOF;
	}

	// Implementation methods

	// void** entries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entriesOffset_", declaredType="void**")
	public PointerPointer entries() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JSRIAddressMap._entriesOffset_));
	}

	// void** entries
	public PointerPointer entriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIAddressMap._entriesOffset_));
	}

	// U16* lineNumbers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lineNumbersOffset_", declaredType="U16*")
	public U16Pointer lineNumbers() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(J9JSRIAddressMap._lineNumbersOffset_));
	}

	// U16* lineNumbers
	public PointerPointer lineNumbersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIAddressMap._lineNumbersOffset_));
	}

	// U8* reachable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reachableOffset_", declaredType="U8*")
	public U8Pointer reachable() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIAddressMap._reachableOffset_));
	}

	// U8* reachable
	public PointerPointer reachableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIAddressMap._reachableOffset_));
	}

}
