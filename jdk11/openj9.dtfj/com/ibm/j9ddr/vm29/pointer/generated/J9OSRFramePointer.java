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
 * Structure: J9OSRFramePointer
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
 * The generated code will provide getters for all elements in the J9OSRFramePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9OSRFrame.class)
public class J9OSRFramePointer extends StructurePointer {

	// NULL
	public static final J9OSRFramePointer NULL = new J9OSRFramePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9OSRFramePointer(long address) {
		super(address);
	}

	public static J9OSRFramePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9OSRFramePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9OSRFramePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9OSRFramePointer(address);
	}

	public J9OSRFramePointer add(long count) {
		return J9OSRFramePointer.cast(address + (J9OSRFrame.SIZEOF * count));
	}

	public J9OSRFramePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9OSRFramePointer addOffset(long offset) {
		return J9OSRFramePointer.cast(address + offset);
	}

	public J9OSRFramePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9OSRFramePointer sub(long count) {
		return J9OSRFramePointer.cast(address - (J9OSRFrame.SIZEOF * count));
	}

	public J9OSRFramePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9OSRFramePointer subOffset(long offset) {
		return J9OSRFramePointer.cast(address - offset);
	}

	public J9OSRFramePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9OSRFramePointer untag(long mask) {
		return J9OSRFramePointer.cast(address & ~mask);
	}

	public J9OSRFramePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9OSRFrame.SIZEOF;
	}

	// Implementation methods

	// UDATA bytecodePCOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodePCOffsetOffset_", declaredType="UDATA")
	public UDATA bytecodePCOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9OSRFrame._bytecodePCOffsetOffset_);
	}

	// UDATA bytecodePCOffset
	public UDATAPointer bytecodePCOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9OSRFrame._bytecodePCOffsetOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9OSRFrame._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9OSRFrame._flagsOffset_));
	}

	// UDATA maxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackOffset_", declaredType="UDATA")
	public UDATA maxStack() throws CorruptDataException {
		return getUDATAAtOffset(J9OSRFrame._maxStackOffset_);
	}

	// UDATA maxStack
	public UDATAPointer maxStackEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9OSRFrame._maxStackOffset_));
	}

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9OSRFrame._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9OSRFrame._methodOffset_));
	}

	// J9MonitorEnterRecord* monitorEnterRecords
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorEnterRecordsOffset_", declaredType="J9MonitorEnterRecord*")
	public J9MonitorEnterRecordPointer monitorEnterRecords() throws CorruptDataException {
		return J9MonitorEnterRecordPointer.cast(getPointerAtOffset(J9OSRFrame._monitorEnterRecordsOffset_));
	}

	// J9MonitorEnterRecord* monitorEnterRecords
	public PointerPointer monitorEnterRecordsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9OSRFrame._monitorEnterRecordsOffset_));
	}

	// UDATA numberOfLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfLocalsOffset_", declaredType="UDATA")
	public UDATA numberOfLocals() throws CorruptDataException {
		return getUDATAAtOffset(J9OSRFrame._numberOfLocalsOffset_);
	}

	// UDATA numberOfLocals
	public UDATAPointer numberOfLocalsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9OSRFrame._numberOfLocalsOffset_));
	}

	// UDATA pendingStackHeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pendingStackHeightOffset_", declaredType="UDATA")
	public UDATA pendingStackHeight() throws CorruptDataException {
		return getUDATAAtOffset(J9OSRFrame._pendingStackHeightOffset_);
	}

	// UDATA pendingStackHeight
	public UDATAPointer pendingStackHeightEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9OSRFrame._pendingStackHeightOffset_));
	}

}
