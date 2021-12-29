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
 * Structure: J9SharedStartupHintsDataDescriptorPointer
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
 * The generated code will provide getters for all elements in the J9SharedStartupHintsDataDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedStartupHintsDataDescriptor.class)
public class J9SharedStartupHintsDataDescriptorPointer extends StructurePointer {

	// NULL
	public static final J9SharedStartupHintsDataDescriptorPointer NULL = new J9SharedStartupHintsDataDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedStartupHintsDataDescriptorPointer(long address) {
		super(address);
	}

	public static J9SharedStartupHintsDataDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedStartupHintsDataDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedStartupHintsDataDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedStartupHintsDataDescriptorPointer(address);
	}

	public J9SharedStartupHintsDataDescriptorPointer add(long count) {
		return J9SharedStartupHintsDataDescriptorPointer.cast(address + (J9SharedStartupHintsDataDescriptor.SIZEOF * count));
	}

	public J9SharedStartupHintsDataDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedStartupHintsDataDescriptorPointer addOffset(long offset) {
		return J9SharedStartupHintsDataDescriptorPointer.cast(address + offset);
	}

	public J9SharedStartupHintsDataDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedStartupHintsDataDescriptorPointer sub(long count) {
		return J9SharedStartupHintsDataDescriptorPointer.cast(address - (J9SharedStartupHintsDataDescriptor.SIZEOF * count));
	}

	public J9SharedStartupHintsDataDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedStartupHintsDataDescriptorPointer subOffset(long offset) {
		return J9SharedStartupHintsDataDescriptorPointer.cast(address - offset);
	}

	public J9SharedStartupHintsDataDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedStartupHintsDataDescriptorPointer untag(long mask) {
		return J9SharedStartupHintsDataDescriptorPointer.cast(address & ~mask);
	}

	public J9SharedStartupHintsDataDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedStartupHintsDataDescriptor.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._flagsOffset_));
	}

	// UDATA heapSize1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSize1Offset_", declaredType="UDATA")
	public UDATA heapSize1() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._heapSize1Offset_);
	}

	// UDATA heapSize1
	public UDATAPointer heapSize1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._heapSize1Offset_));
	}

	// UDATA heapSize2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapSize2Offset_", declaredType="UDATA")
	public UDATA heapSize2() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._heapSize2Offset_);
	}

	// UDATA heapSize2
	public UDATAPointer heapSize2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._heapSize2Offset_));
	}

	// UDATA unused1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused1Offset_", declaredType="UDATA")
	public UDATA unused1() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused1Offset_);
	}

	// UDATA unused1
	public UDATAPointer unused1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused1Offset_));
	}

	// UDATA unused2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused2Offset_", declaredType="UDATA")
	public UDATA unused2() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused2Offset_);
	}

	// UDATA unused2
	public UDATAPointer unused2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused2Offset_));
	}

	// UDATA unused3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused3Offset_", declaredType="UDATA")
	public UDATA unused3() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused3Offset_);
	}

	// UDATA unused3
	public UDATAPointer unused3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused3Offset_));
	}

	// UDATA unused4
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused4Offset_", declaredType="UDATA")
	public UDATA unused4() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused4Offset_);
	}

	// UDATA unused4
	public UDATAPointer unused4EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused4Offset_));
	}

	// UDATA unused5
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused5Offset_", declaredType="UDATA")
	public UDATA unused5() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused5Offset_);
	}

	// UDATA unused5
	public UDATAPointer unused5EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused5Offset_));
	}

	// UDATA unused6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused6Offset_", declaredType="UDATA")
	public UDATA unused6() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused6Offset_);
	}

	// UDATA unused6
	public UDATAPointer unused6EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused6Offset_));
	}

	// UDATA unused7
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused7Offset_", declaredType="UDATA")
	public UDATA unused7() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused7Offset_);
	}

	// UDATA unused7
	public UDATAPointer unused7EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused7Offset_));
	}

	// UDATA unused8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused8Offset_", declaredType="UDATA")
	public UDATA unused8() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused8Offset_);
	}

	// UDATA unused8
	public UDATAPointer unused8EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused8Offset_));
	}

	// UDATA unused9
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unused9Offset_", declaredType="UDATA")
	public UDATA unused9() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedStartupHintsDataDescriptor._unused9Offset_);
	}

	// UDATA unused9
	public UDATAPointer unused9EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedStartupHintsDataDescriptor._unused9Offset_));
	}

}
