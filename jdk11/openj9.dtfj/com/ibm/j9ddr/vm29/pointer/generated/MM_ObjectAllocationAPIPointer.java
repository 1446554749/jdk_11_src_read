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
 * Structure: MM_ObjectAllocationAPIPointer
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
 * The generated code will provide getters for all elements in the MM_ObjectAllocationAPIPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ObjectAllocationAPI.class)
public class MM_ObjectAllocationAPIPointer extends StructurePointer {

	// NULL
	public static final MM_ObjectAllocationAPIPointer NULL = new MM_ObjectAllocationAPIPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ObjectAllocationAPIPointer(long address) {
		super(address);
	}

	public static MM_ObjectAllocationAPIPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ObjectAllocationAPIPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ObjectAllocationAPIPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ObjectAllocationAPIPointer(address);
	}

	public MM_ObjectAllocationAPIPointer add(long count) {
		return MM_ObjectAllocationAPIPointer.cast(address + (MM_ObjectAllocationAPI.SIZEOF * count));
	}

	public MM_ObjectAllocationAPIPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ObjectAllocationAPIPointer addOffset(long offset) {
		return MM_ObjectAllocationAPIPointer.cast(address + offset);
	}

	public MM_ObjectAllocationAPIPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ObjectAllocationAPIPointer sub(long count) {
		return MM_ObjectAllocationAPIPointer.cast(address - (MM_ObjectAllocationAPI.SIZEOF * count));
	}

	public MM_ObjectAllocationAPIPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ObjectAllocationAPIPointer subOffset(long offset) {
		return MM_ObjectAllocationAPIPointer.cast(address - offset);
	}

	public MM_ObjectAllocationAPIPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ObjectAllocationAPIPointer untag(long mask) {
		return MM_ObjectAllocationAPIPointer.cast(address & ~mask);
	}

	public MM_ObjectAllocationAPIPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ObjectAllocationAPI.SIZEOF;
	}

	// Implementation methods

	// const U64 _gcAllocationType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcAllocationTypeOffset_", declaredType="const U64")
	public UDATA _gcAllocationType() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ObjectAllocationAPI.__gcAllocationTypeOffset_));
	}

	// const U64 _gcAllocationType
	public UDATAPointer _gcAllocationTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ObjectAllocationAPI.__gcAllocationTypeOffset_));
	}

	// const U64 _initializeSlotsOnTLHAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializeSlotsOnTLHAllocateOffset_", declaredType="const U64")
	public UDATA _initializeSlotsOnTLHAllocate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ObjectAllocationAPI.__initializeSlotsOnTLHAllocateOffset_));
	}

	// const U64 _initializeSlotsOnTLHAllocate
	public UDATAPointer _initializeSlotsOnTLHAllocateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ObjectAllocationAPI.__initializeSlotsOnTLHAllocateOffset_));
	}

	// const U64 _objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentInBytesOffset_", declaredType="const U64")
	public UDATA _objectAlignmentInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ObjectAllocationAPI.__objectAlignmentInBytesOffset_));
	}

	// const U64 _objectAlignmentInBytes
	public UDATAPointer _objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ObjectAllocationAPI.__objectAlignmentInBytesOffset_));
	}

	// const J9VMGCSizeClasses* _sizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassesOffset_", declaredType="const J9VMGCSizeClasses*")
	public J9VMGCSizeClassesPointer _sizeClasses() throws CorruptDataException {
		return J9VMGCSizeClassesPointer.cast(getPointerAtOffset(MM_ObjectAllocationAPI.__sizeClassesOffset_));
	}

	// const J9VMGCSizeClasses* _sizeClasses
	public PointerPointer _sizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ObjectAllocationAPI.__sizeClassesOffset_));
	}

}
