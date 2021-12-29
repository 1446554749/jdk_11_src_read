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
 * Structure: J9RAMVirtualMethodRefPointer
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
 * The generated code will provide getters for all elements in the J9RAMVirtualMethodRefPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RAMVirtualMethodRef.class)
public class J9RAMVirtualMethodRefPointer extends StructurePointer {

	// NULL
	public static final J9RAMVirtualMethodRefPointer NULL = new J9RAMVirtualMethodRefPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RAMVirtualMethodRefPointer(long address) {
		super(address);
	}

	public static J9RAMVirtualMethodRefPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RAMVirtualMethodRefPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RAMVirtualMethodRefPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RAMVirtualMethodRefPointer(address);
	}

	public J9RAMVirtualMethodRefPointer add(long count) {
		return J9RAMVirtualMethodRefPointer.cast(address + (J9RAMVirtualMethodRef.SIZEOF * count));
	}

	public J9RAMVirtualMethodRefPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RAMVirtualMethodRefPointer addOffset(long offset) {
		return J9RAMVirtualMethodRefPointer.cast(address + offset);
	}

	public J9RAMVirtualMethodRefPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RAMVirtualMethodRefPointer sub(long count) {
		return J9RAMVirtualMethodRefPointer.cast(address - (J9RAMVirtualMethodRef.SIZEOF * count));
	}

	public J9RAMVirtualMethodRefPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RAMVirtualMethodRefPointer subOffset(long offset) {
		return J9RAMVirtualMethodRefPointer.cast(address - offset);
	}

	public J9RAMVirtualMethodRefPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RAMVirtualMethodRefPointer untag(long mask) {
		return J9RAMVirtualMethodRefPointer.cast(address & ~mask);
	}

	public J9RAMVirtualMethodRefPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RAMVirtualMethodRef.SIZEOF;
	}

	// Implementation methods

	// volatile J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="volatile J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9RAMVirtualMethodRef._methodOffset_));
	}

	// volatile J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAMVirtualMethodRef._methodOffset_));
	}

	// volatile UDATA methodIndexAndArgCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodIndexAndArgCountOffset_", declaredType="volatile UDATA")
	public UDATA methodIndexAndArgCount() throws CorruptDataException {
		return getUDATAAtOffset(J9RAMVirtualMethodRef._methodIndexAndArgCountOffset_);
	}

	// volatile UDATA methodIndexAndArgCount
	public UDATAPointer methodIndexAndArgCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAMVirtualMethodRef._methodIndexAndArgCountOffset_));
	}

}
