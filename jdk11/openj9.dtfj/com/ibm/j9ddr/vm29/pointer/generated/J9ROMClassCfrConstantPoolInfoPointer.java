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
 * Structure: J9ROMClassCfrConstantPoolInfoPointer
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
 * The generated code will provide getters for all elements in the J9ROMClassCfrConstantPoolInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMClassCfrConstantPoolInfo.class)
public class J9ROMClassCfrConstantPoolInfoPointer extends StructurePointer {

	// NULL
	public static final J9ROMClassCfrConstantPoolInfoPointer NULL = new J9ROMClassCfrConstantPoolInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMClassCfrConstantPoolInfoPointer(long address) {
		super(address);
	}

	public static J9ROMClassCfrConstantPoolInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMClassCfrConstantPoolInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMClassCfrConstantPoolInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMClassCfrConstantPoolInfoPointer(address);
	}

	public J9ROMClassCfrConstantPoolInfoPointer add(long count) {
		return J9ROMClassCfrConstantPoolInfoPointer.cast(address + (J9ROMClassCfrConstantPoolInfo.SIZEOF * count));
	}

	public J9ROMClassCfrConstantPoolInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMClassCfrConstantPoolInfoPointer addOffset(long offset) {
		return J9ROMClassCfrConstantPoolInfoPointer.cast(address + offset);
	}

	public J9ROMClassCfrConstantPoolInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMClassCfrConstantPoolInfoPointer sub(long count) {
		return J9ROMClassCfrConstantPoolInfoPointer.cast(address - (J9ROMClassCfrConstantPoolInfo.SIZEOF * count));
	}

	public J9ROMClassCfrConstantPoolInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMClassCfrConstantPoolInfoPointer subOffset(long offset) {
		return J9ROMClassCfrConstantPoolInfoPointer.cast(address - offset);
	}

	public J9ROMClassCfrConstantPoolInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMClassCfrConstantPoolInfoPointer untag(long mask) {
		return J9ROMClassCfrConstantPoolInfoPointer.cast(address & ~mask);
	}

	public J9ROMClassCfrConstantPoolInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMClassCfrConstantPoolInfo.SIZEOF;
	}

	// Implementation methods

	// J9SRP(U8) bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesOffset_", declaredType="J9SRP(U8)")
	public U8Pointer bytes() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClassCfrConstantPoolInfo._bytesOffset_);
		if (nextAddress == 0) {
			return U8Pointer.NULL;
		}
		return U8Pointer.cast(address + (J9ROMClassCfrConstantPoolInfo._bytesOffset_ + nextAddress));
	}

	// J9SRP(U8) bytes
	public SelfRelativePointer bytesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._bytesOffset_));
	}

	// U8 flags1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flags1Offset_", declaredType="U8")
	public U8 flags1() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ROMClassCfrConstantPoolInfo._flags1Offset_));
	}

	// U8 flags1
	public U8Pointer flags1EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._flags1Offset_));
	}

	// U16 nextCPIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextCPIndexOffset_", declaredType="U16")
	public U16 nextCPIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClassCfrConstantPoolInfo._nextCPIndexOffset_));
	}

	// U16 nextCPIndex
	public U16Pointer nextCPIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._nextCPIndexOffset_));
	}

	// U32 slot1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slot1Offset_", declaredType="U32")
	public UDATA slot1() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClassCfrConstantPoolInfo._slot1Offset_));
	}

	// U32 slot1
	public UDATAPointer slot1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._slot1Offset_));
	}

	// U32 slot2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slot2Offset_", declaredType="U32")
	public UDATA slot2() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClassCfrConstantPoolInfo._slot2Offset_));
	}

	// U32 slot2
	public UDATAPointer slot2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._slot2Offset_));
	}

	// U8 tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="U8")
	public U8 tag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ROMClassCfrConstantPoolInfo._tagOffset_));
	}

	// U8 tag
	public U8Pointer tagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ROMClassCfrConstantPoolInfo._tagOffset_));
	}

}
