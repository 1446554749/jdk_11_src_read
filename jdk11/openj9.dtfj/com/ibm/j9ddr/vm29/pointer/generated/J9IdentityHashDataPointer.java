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
 * Structure: J9IdentityHashDataPointer
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
 * The generated code will provide getters for all elements in the J9IdentityHashDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9IdentityHashData.class)
public class J9IdentityHashDataPointer extends StructurePointer {

	// NULL
	public static final J9IdentityHashDataPointer NULL = new J9IdentityHashDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9IdentityHashDataPointer(long address) {
		super(address);
	}

	public static J9IdentityHashDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9IdentityHashDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9IdentityHashDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9IdentityHashDataPointer(address);
	}

	public J9IdentityHashDataPointer add(long count) {
		return J9IdentityHashDataPointer.cast(address + (J9IdentityHashData.SIZEOF * count));
	}

	public J9IdentityHashDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9IdentityHashDataPointer addOffset(long offset) {
		return J9IdentityHashDataPointer.cast(address + offset);
	}

	public J9IdentityHashDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9IdentityHashDataPointer sub(long count) {
		return J9IdentityHashDataPointer.cast(address - (J9IdentityHashData.SIZEOF * count));
	}

	public J9IdentityHashDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9IdentityHashDataPointer subOffset(long offset) {
		return J9IdentityHashDataPointer.cast(address - offset);
	}

	public J9IdentityHashDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9IdentityHashDataPointer untag(long mask) {
		return J9IdentityHashDataPointer.cast(address & ~mask);
	}

	public J9IdentityHashDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9IdentityHashData.SIZEOF;
	}

	// Implementation methods

	// UDATA hashData1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashData1Offset_", declaredType="UDATA")
	public UDATA hashData1() throws CorruptDataException {
		return getUDATAAtOffset(J9IdentityHashData._hashData1Offset_);
	}

	// UDATA hashData1
	public UDATAPointer hashData1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9IdentityHashData._hashData1Offset_));
	}

	// UDATA hashData2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashData2Offset_", declaredType="UDATA")
	public UDATA hashData2() throws CorruptDataException {
		return getUDATAAtOffset(J9IdentityHashData._hashData2Offset_);
	}

	// UDATA hashData2
	public UDATAPointer hashData2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9IdentityHashData._hashData2Offset_));
	}

	// UDATA hashData3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashData3Offset_", declaredType="UDATA")
	public UDATA hashData3() throws CorruptDataException {
		return getUDATAAtOffset(J9IdentityHashData._hashData3Offset_);
	}

	// UDATA hashData3
	public UDATAPointer hashData3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9IdentityHashData._hashData3Offset_));
	}

	// UDATA hashData4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashData4Offset_", declaredType="UDATA")
	public UDATA hashData4() throws CorruptDataException {
		return getUDATAAtOffset(J9IdentityHashData._hashData4Offset_);
	}

	// UDATA hashData4
	public UDATAPointer hashData4EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9IdentityHashData._hashData4Offset_));
	}

	// UDATA hashSaltPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashSaltPolicyOffset_", declaredType="UDATA")
	public UDATA hashSaltPolicy() throws CorruptDataException {
		return getUDATAAtOffset(J9IdentityHashData._hashSaltPolicyOffset_);
	}

	// UDATA hashSaltPolicy
	public UDATAPointer hashSaltPolicyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9IdentityHashData._hashSaltPolicyOffset_));
	}

	// U32[] hashSaltTable
	public UDATAPointer hashSaltTableEA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(J9IdentityHashData._hashSaltTableOffset_));
	}

}
