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
 * Structure: J9SFJNINativeMethodFramePointer
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
 * The generated code will provide getters for all elements in the J9SFJNINativeMethodFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SFJNINativeMethodFrame.class)
public class J9SFJNINativeMethodFramePointer extends StructurePointer {

	// NULL
	public static final J9SFJNINativeMethodFramePointer NULL = new J9SFJNINativeMethodFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SFJNINativeMethodFramePointer(long address) {
		super(address);
	}

	public static J9SFJNINativeMethodFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SFJNINativeMethodFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SFJNINativeMethodFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SFJNINativeMethodFramePointer(address);
	}

	public J9SFJNINativeMethodFramePointer add(long count) {
		return J9SFJNINativeMethodFramePointer.cast(address + (J9SFJNINativeMethodFrame.SIZEOF * count));
	}

	public J9SFJNINativeMethodFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SFJNINativeMethodFramePointer addOffset(long offset) {
		return J9SFJNINativeMethodFramePointer.cast(address + offset);
	}

	public J9SFJNINativeMethodFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SFJNINativeMethodFramePointer sub(long count) {
		return J9SFJNINativeMethodFramePointer.cast(address - (J9SFJNINativeMethodFrame.SIZEOF * count));
	}

	public J9SFJNINativeMethodFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SFJNINativeMethodFramePointer subOffset(long offset) {
		return J9SFJNINativeMethodFramePointer.cast(address - offset);
	}

	public J9SFJNINativeMethodFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SFJNINativeMethodFramePointer untag(long mask) {
		return J9SFJNINativeMethodFramePointer.cast(address & ~mask);
	}

	public J9SFJNINativeMethodFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SFJNINativeMethodFrame.SIZEOF;
	}

	// Implementation methods

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9SFJNINativeMethodFrame._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJNINativeMethodFrame._methodOffset_));
	}

	// UDATA* savedA0
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedA0Offset_", declaredType="UDATA*")
	public UDATAPointer savedA0() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SFJNINativeMethodFrame._savedA0Offset_));
	}

	// UDATA* savedA0
	public PointerPointer savedA0EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJNINativeMethodFrame._savedA0Offset_));
	}

	// J9Method* savedCP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedCPOffset_", declaredType="J9Method*")
	public J9MethodPointer savedCP() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9SFJNINativeMethodFrame._savedCPOffset_));
	}

	// J9Method* savedCP
	public PointerPointer savedCPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJNINativeMethodFrame._savedCPOffset_));
	}

	// U8* savedPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedPCOffset_", declaredType="U8*")
	public U8Pointer savedPC() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SFJNINativeMethodFrame._savedPCOffset_));
	}

	// U8* savedPC
	public PointerPointer savedPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJNINativeMethodFrame._savedPCOffset_));
	}

	// UDATA specialFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialFrameFlagsOffset_", declaredType="UDATA")
	public UDATA specialFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJNINativeMethodFrame._specialFrameFlagsOffset_);
	}

	// UDATA specialFrameFlags
	public UDATAPointer specialFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJNINativeMethodFrame._specialFrameFlagsOffset_));
	}

}
