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
 * Structure: J9SFMethodTypeFramePointer
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
 * The generated code will provide getters for all elements in the J9SFMethodTypeFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SFMethodTypeFrame.class)
public class J9SFMethodTypeFramePointer extends StructurePointer {

	// NULL
	public static final J9SFMethodTypeFramePointer NULL = new J9SFMethodTypeFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SFMethodTypeFramePointer(long address) {
		super(address);
	}

	public static J9SFMethodTypeFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SFMethodTypeFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SFMethodTypeFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SFMethodTypeFramePointer(address);
	}

	public J9SFMethodTypeFramePointer add(long count) {
		return J9SFMethodTypeFramePointer.cast(address + (J9SFMethodTypeFrame.SIZEOF * count));
	}

	public J9SFMethodTypeFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SFMethodTypeFramePointer addOffset(long offset) {
		return J9SFMethodTypeFramePointer.cast(address + offset);
	}

	public J9SFMethodTypeFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SFMethodTypeFramePointer sub(long count) {
		return J9SFMethodTypeFramePointer.cast(address - (J9SFMethodTypeFrame.SIZEOF * count));
	}

	public J9SFMethodTypeFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SFMethodTypeFramePointer subOffset(long offset) {
		return J9SFMethodTypeFramePointer.cast(address - offset);
	}

	public J9SFMethodTypeFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SFMethodTypeFramePointer untag(long mask) {
		return J9SFMethodTypeFramePointer.cast(address & ~mask);
	}

	public J9SFMethodTypeFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SFMethodTypeFrame.SIZEOF;
	}

	// Implementation methods

	// UDATA argStackSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_argStackSlotsOffset_", declaredType="UDATA")
	public UDATA argStackSlots() throws CorruptDataException {
		return getUDATAAtOffset(J9SFMethodTypeFrame._argStackSlotsOffset_);
	}

	// UDATA argStackSlots
	public UDATAPointer argStackSlotsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._argStackSlotsOffset_));
	}

	// UDATA descriptionIntCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_descriptionIntCountOffset_", declaredType="UDATA")
	public UDATA descriptionIntCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SFMethodTypeFrame._descriptionIntCountOffset_);
	}

	// UDATA descriptionIntCount
	public UDATAPointer descriptionIntCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._descriptionIntCountOffset_));
	}

	// j9object_t methodType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodTypeOffset_", declaredType="j9object_t")
	public J9ObjectPointer methodType() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9SFMethodTypeFrame._methodTypeOffset_));
	}

	// j9object_t methodType
	public PointerPointer methodTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._methodTypeOffset_));
	}

	// UDATA* savedA0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedA0Offset_", declaredType="UDATA*")
	public UDATAPointer savedA0() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SFMethodTypeFrame._savedA0Offset_));
	}

	// UDATA* savedA0
	public PointerPointer savedA0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._savedA0Offset_));
	}

	// J9Method* savedCP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedCPOffset_", declaredType="J9Method*")
	public J9MethodPointer savedCP() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9SFMethodTypeFrame._savedCPOffset_));
	}

	// J9Method* savedCP
	public PointerPointer savedCPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._savedCPOffset_));
	}

	// U8* savedPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedPCOffset_", declaredType="U8*")
	public U8Pointer savedPC() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SFMethodTypeFrame._savedPCOffset_));
	}

	// U8* savedPC
	public PointerPointer savedPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._savedPCOffset_));
	}

	// UDATA specialFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialFrameFlagsOffset_", declaredType="UDATA")
	public UDATA specialFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SFMethodTypeFrame._specialFrameFlagsOffset_);
	}

	// UDATA specialFrameFlags
	public UDATAPointer specialFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFMethodTypeFrame._specialFrameFlagsOffset_));
	}

}
