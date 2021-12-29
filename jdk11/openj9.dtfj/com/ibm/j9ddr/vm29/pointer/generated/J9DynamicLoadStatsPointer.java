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
 * Structure: J9DynamicLoadStatsPointer
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
 * The generated code will provide getters for all elements in the J9DynamicLoadStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9DynamicLoadStats.class)
public class J9DynamicLoadStatsPointer extends StructurePointer {

	// NULL
	public static final J9DynamicLoadStatsPointer NULL = new J9DynamicLoadStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9DynamicLoadStatsPointer(long address) {
		super(address);
	}

	public static J9DynamicLoadStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9DynamicLoadStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9DynamicLoadStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9DynamicLoadStatsPointer(address);
	}

	public J9DynamicLoadStatsPointer add(long count) {
		return J9DynamicLoadStatsPointer.cast(address + (J9DynamicLoadStats.SIZEOF * count));
	}

	public J9DynamicLoadStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9DynamicLoadStatsPointer addOffset(long offset) {
		return J9DynamicLoadStatsPointer.cast(address + offset);
	}

	public J9DynamicLoadStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9DynamicLoadStatsPointer sub(long count) {
		return J9DynamicLoadStatsPointer.cast(address - (J9DynamicLoadStats.SIZEOF * count));
	}

	public J9DynamicLoadStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9DynamicLoadStatsPointer subOffset(long offset) {
		return J9DynamicLoadStatsPointer.cast(address - offset);
	}

	public J9DynamicLoadStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9DynamicLoadStatsPointer untag(long mask) {
		return J9DynamicLoadStatsPointer.cast(address & ~mask);
	}

	public J9DynamicLoadStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9DynamicLoadStats.SIZEOF;
	}

	// Implementation methods

	// UDATA debugSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugSizeOffset_", declaredType="UDATA")
	public UDATA debugSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._debugSizeOffset_);
	}

	// UDATA debugSize
	public UDATAPointer debugSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._debugSizeOffset_));
	}

	// UDATA loadEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadEndTimeOffset_", declaredType="UDATA")
	public UDATA loadEndTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._loadEndTimeOffset_);
	}

	// UDATA loadEndTime
	public UDATAPointer loadEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._loadEndTimeOffset_));
	}

	// UDATA loadStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadStartTimeOffset_", declaredType="UDATA")
	public UDATA loadStartTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._loadStartTimeOffset_);
	}

	// UDATA loadStartTime
	public UDATAPointer loadStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._loadStartTimeOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DynamicLoadStats._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicLoadStats._nameOffset_));
	}

	// UDATA nameBufferLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameBufferLengthOffset_", declaredType="UDATA")
	public UDATA nameBufferLength() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._nameBufferLengthOffset_);
	}

	// UDATA nameBufferLength
	public UDATAPointer nameBufferLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._nameBufferLengthOffset_));
	}

	// UDATA nameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameLengthOffset_", declaredType="UDATA")
	public UDATA nameLength() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._nameLengthOffset_);
	}

	// UDATA nameLength
	public UDATAPointer nameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._nameLengthOffset_));
	}

	// UDATA readEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readEndTimeOffset_", declaredType="UDATA")
	public UDATA readEndTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._readEndTimeOffset_);
	}

	// UDATA readEndTime
	public UDATAPointer readEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._readEndTimeOffset_));
	}

	// UDATA readStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readStartTimeOffset_", declaredType="UDATA")
	public UDATA readStartTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._readStartTimeOffset_);
	}

	// UDATA readStartTime
	public UDATAPointer readStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._readStartTimeOffset_));
	}

	// UDATA romSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romSizeOffset_", declaredType="UDATA")
	public UDATA romSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._romSizeOffset_);
	}

	// UDATA romSize
	public UDATAPointer romSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._romSizeOffset_));
	}

	// UDATA sunSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sunSizeOffset_", declaredType="UDATA")
	public UDATA sunSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._sunSizeOffset_);
	}

	// UDATA sunSize
	public UDATAPointer sunSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._sunSizeOffset_));
	}

	// UDATA translateEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translateEndTimeOffset_", declaredType="UDATA")
	public UDATA translateEndTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._translateEndTimeOffset_);
	}

	// UDATA translateEndTime
	public UDATAPointer translateEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._translateEndTimeOffset_));
	}

	// UDATA translateStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_translateStartTimeOffset_", declaredType="UDATA")
	public UDATA translateStartTime() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicLoadStats._translateStartTimeOffset_);
	}

	// UDATA translateStartTime
	public UDATAPointer translateStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicLoadStats._translateStartTimeOffset_));
	}

}
