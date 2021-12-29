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
 * Structure: StackMapFramePointer
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
 * The generated code will provide getters for all elements in the StackMapFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=StackMapFrame.class)
public class StackMapFramePointer extends StructurePointer {

	// NULL
	public static final StackMapFramePointer NULL = new StackMapFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected StackMapFramePointer(long address) {
		super(address);
	}

	public static StackMapFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static StackMapFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static StackMapFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new StackMapFramePointer(address);
	}

	public StackMapFramePointer add(long count) {
		return StackMapFramePointer.cast(address + (StackMapFrame.SIZEOF * count));
	}

	public StackMapFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public StackMapFramePointer addOffset(long offset) {
		return StackMapFramePointer.cast(address + offset);
	}

	public StackMapFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public StackMapFramePointer sub(long count) {
		return StackMapFramePointer.cast(address - (StackMapFrame.SIZEOF * count));
	}

	public StackMapFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public StackMapFramePointer subOffset(long offset) {
		return StackMapFramePointer.cast(address - offset);
	}

	public StackMapFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public StackMapFramePointer untag(long mask) {
		return StackMapFramePointer.cast(address & ~mask);
	}

	public StackMapFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return StackMapFrame.SIZEOF;
	}

	// Implementation methods

	// U16 bci
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bciOffset_", declaredType="U16")
	public U16 bci() throws CorruptDataException {
		return new U16(getShortAtOffset(StackMapFrame._bciOffset_));
	}

	// U16 bci
	public U16Pointer bciEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(StackMapFrame._bciOffset_));
	}

	// VerificationTypeInfo* entries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entriesOffset_", declaredType="VerificationTypeInfo*")
	public VerificationTypeInfoPointer entries() throws CorruptDataException {
		return VerificationTypeInfoPointer.cast(getPointerAtOffset(StackMapFrame._entriesOffset_));
	}

	// VerificationTypeInfo* entries
	public PointerPointer entriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(StackMapFrame._entriesOffset_));
	}

	// U8 frameType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameTypeOffset_", declaredType="U8")
	public U8 frameType() throws CorruptDataException {
		return new U8(getByteAtOffset(StackMapFrame._frameTypeOffset_));
	}

	// U8 frameType
	public U8Pointer frameTypeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(StackMapFrame._frameTypeOffset_));
	}

	// U16 numberOfLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfLocalsOffset_", declaredType="U16")
	public U16 numberOfLocals() throws CorruptDataException {
		return new U16(getShortAtOffset(StackMapFrame._numberOfLocalsOffset_));
	}

	// U16 numberOfLocals
	public U16Pointer numberOfLocalsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(StackMapFrame._numberOfLocalsOffset_));
	}

	// UDATA numberOfSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfSlotsOffset_", declaredType="UDATA")
	public UDATA numberOfSlots() throws CorruptDataException {
		return getUDATAAtOffset(StackMapFrame._numberOfSlotsOffset_);
	}

	// UDATA numberOfSlots
	public UDATAPointer numberOfSlotsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(StackMapFrame._numberOfSlotsOffset_));
	}

	// U16 numberOfStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfStackOffset_", declaredType="U16")
	public U16 numberOfStack() throws CorruptDataException {
		return new U16(getShortAtOffset(StackMapFrame._numberOfStackOffset_));
	}

	// U16 numberOfStack
	public U16Pointer numberOfStackEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(StackMapFrame._numberOfStackOffset_));
	}

}
