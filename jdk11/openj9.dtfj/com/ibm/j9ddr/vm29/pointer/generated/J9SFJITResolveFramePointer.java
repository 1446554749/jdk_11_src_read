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
 * Structure: J9SFJITResolveFramePointer
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
 * The generated code will provide getters for all elements in the J9SFJITResolveFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SFJITResolveFrame.class)
public class J9SFJITResolveFramePointer extends StructurePointer {

	// NULL
	public static final J9SFJITResolveFramePointer NULL = new J9SFJITResolveFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SFJITResolveFramePointer(long address) {
		super(address);
	}

	public static J9SFJITResolveFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SFJITResolveFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SFJITResolveFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SFJITResolveFramePointer(address);
	}

	public J9SFJITResolveFramePointer add(long count) {
		return J9SFJITResolveFramePointer.cast(address + (J9SFJITResolveFrame.SIZEOF * count));
	}

	public J9SFJITResolveFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SFJITResolveFramePointer addOffset(long offset) {
		return J9SFJITResolveFramePointer.cast(address + offset);
	}

	public J9SFJITResolveFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SFJITResolveFramePointer sub(long count) {
		return J9SFJITResolveFramePointer.cast(address - (J9SFJITResolveFrame.SIZEOF * count));
	}

	public J9SFJITResolveFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SFJITResolveFramePointer subOffset(long offset) {
		return J9SFJITResolveFramePointer.cast(address - offset);
	}

	public J9SFJITResolveFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SFJITResolveFramePointer untag(long mask) {
		return J9SFJITResolveFramePointer.cast(address & ~mask);
	}

	public J9SFJITResolveFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SFJITResolveFrame.SIZEOF;
	}

	// Implementation methods

	// UDATA parmCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parmCountOffset_", declaredType="UDATA")
	public UDATA parmCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJITResolveFrame._parmCountOffset_);
	}

	// UDATA parmCount
	public UDATAPointer parmCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJITResolveFrame._parmCountOffset_));
	}

	// void* returnAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnAddressOffset_", declaredType="void*")
	public VoidPointer returnAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SFJITResolveFrame._returnAddressOffset_));
	}

	// void* returnAddress
	public PointerPointer returnAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJITResolveFrame._returnAddressOffset_));
	}

	// j9object_t savedJITException
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedJITExceptionOffset_", declaredType="j9object_t")
	public J9ObjectPointer savedJITException() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9SFJITResolveFrame._savedJITExceptionOffset_));
	}

	// j9object_t savedJITException
	public PointerPointer savedJITExceptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJITResolveFrame._savedJITExceptionOffset_));
	}

	// UDATA specialFrameFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialFrameFlagsOffset_", declaredType="UDATA")
	public UDATA specialFrameFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9SFJITResolveFrame._specialFrameFlagsOffset_);
	}

	// UDATA specialFrameFlags
	public UDATAPointer specialFrameFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SFJITResolveFrame._specialFrameFlagsOffset_));
	}

	// UDATA* taggedRegularReturnSP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_taggedRegularReturnSPOffset_", declaredType="UDATA*")
	public UDATAPointer taggedRegularReturnSP() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SFJITResolveFrame._taggedRegularReturnSPOffset_));
	}

	// UDATA* taggedRegularReturnSP
	public PointerPointer taggedRegularReturnSPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SFJITResolveFrame._taggedRegularReturnSPOffset_));
	}

}
