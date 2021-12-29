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
 * Structure: J9CfrTypePathPointer
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
 * The generated code will provide getters for all elements in the J9CfrTypePathPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrTypePath.class)
public class J9CfrTypePathPointer extends StructurePointer {

	// NULL
	public static final J9CfrTypePathPointer NULL = new J9CfrTypePathPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrTypePathPointer(long address) {
		super(address);
	}

	public static J9CfrTypePathPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrTypePathPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrTypePathPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrTypePathPointer(address);
	}

	public J9CfrTypePathPointer add(long count) {
		return J9CfrTypePathPointer.cast(address + (J9CfrTypePath.SIZEOF * count));
	}

	public J9CfrTypePathPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrTypePathPointer addOffset(long offset) {
		return J9CfrTypePathPointer.cast(address + offset);
	}

	public J9CfrTypePathPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrTypePathPointer sub(long count) {
		return J9CfrTypePathPointer.cast(address - (J9CfrTypePath.SIZEOF * count));
	}

	public J9CfrTypePathPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrTypePathPointer subOffset(long offset) {
		return J9CfrTypePathPointer.cast(address - offset);
	}

	public J9CfrTypePathPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrTypePathPointer untag(long mask) {
		return J9CfrTypePathPointer.cast(address & ~mask);
	}

	public J9CfrTypePathPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrTypePath.SIZEOF;
	}

	// Implementation methods

	// J9CfrTypePathEntry* path
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathOffset_", declaredType="J9CfrTypePathEntry*")
	public J9CfrTypePathEntryPointer path() throws CorruptDataException {
		return J9CfrTypePathEntryPointer.cast(getPointerAtOffset(J9CfrTypePath._pathOffset_));
	}

	// J9CfrTypePathEntry* path
	public PointerPointer pathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypePath._pathOffset_));
	}

	// U8 pathLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathLengthOffset_", declaredType="U8")
	public U8 pathLength() throws CorruptDataException {
		return new U8(getByteAtOffset(J9CfrTypePath._pathLengthOffset_));
	}

	// U8 pathLength
	public U8Pointer pathLengthEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9CfrTypePath._pathLengthOffset_));
	}

}
