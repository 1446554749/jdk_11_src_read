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
 * Structure: RAMClassAllocationRequestPointer
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
 * The generated code will provide getters for all elements in the RAMClassAllocationRequestPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RAMClassAllocationRequest.class)
public class RAMClassAllocationRequestPointer extends StructurePointer {

	// NULL
	public static final RAMClassAllocationRequestPointer NULL = new RAMClassAllocationRequestPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RAMClassAllocationRequestPointer(long address) {
		super(address);
	}

	public static RAMClassAllocationRequestPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RAMClassAllocationRequestPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RAMClassAllocationRequestPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RAMClassAllocationRequestPointer(address);
	}

	public RAMClassAllocationRequestPointer add(long count) {
		return RAMClassAllocationRequestPointer.cast(address + (RAMClassAllocationRequest.SIZEOF * count));
	}

	public RAMClassAllocationRequestPointer add(Scalar count) {
		return add(count.longValue());
	}

	public RAMClassAllocationRequestPointer addOffset(long offset) {
		return RAMClassAllocationRequestPointer.cast(address + offset);
	}

	public RAMClassAllocationRequestPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RAMClassAllocationRequestPointer sub(long count) {
		return RAMClassAllocationRequestPointer.cast(address - (RAMClassAllocationRequest.SIZEOF * count));
	}

	public RAMClassAllocationRequestPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RAMClassAllocationRequestPointer subOffset(long offset) {
		return RAMClassAllocationRequestPointer.cast(address - offset);
	}

	public RAMClassAllocationRequestPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RAMClassAllocationRequestPointer untag(long mask) {
		return RAMClassAllocationRequestPointer.cast(address & ~mask);
	}

	public RAMClassAllocationRequestPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RAMClassAllocationRequest.SIZEOF;
	}

	// Implementation methods

	// UDATA* address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addressOffset_", declaredType="UDATA*")
	public UDATAPointer address() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(RAMClassAllocationRequest._addressOffset_));
	}

	// UDATA* address
	public PointerPointer addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._addressOffset_));
	}

	// UDATA alignedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alignedSizeOffset_", declaredType="UDATA")
	public UDATA alignedSize() throws CorruptDataException {
		return getUDATAAtOffset(RAMClassAllocationRequest._alignedSizeOffset_);
	}

	// UDATA alignedSize
	public UDATAPointer alignedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._alignedSizeOffset_));
	}

	// UDATA alignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alignmentOffset_", declaredType="UDATA")
	public UDATA alignment() throws CorruptDataException {
		return getUDATAAtOffset(RAMClassAllocationRequest._alignmentOffset_);
	}

	// UDATA alignment
	public UDATAPointer alignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._alignmentOffset_));
	}

	// UDATA fragmentSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fragmentSizeOffset_", declaredType="UDATA")
	public UDATA fragmentSize() throws CorruptDataException {
		return getUDATAAtOffset(RAMClassAllocationRequest._fragmentSizeOffset_);
	}

	// UDATA fragmentSize
	public UDATAPointer fragmentSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._fragmentSizeOffset_));
	}

	// UDATA index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexOffset_", declaredType="UDATA")
	public UDATA index() throws CorruptDataException {
		return getUDATAAtOffset(RAMClassAllocationRequest._indexOffset_);
	}

	// UDATA index
	public UDATAPointer indexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._indexOffset_));
	}

	// RAMClassAllocationRequest* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="RAMClassAllocationRequest*")
	public RAMClassAllocationRequestPointer next() throws CorruptDataException {
		return RAMClassAllocationRequestPointer.cast(getPointerAtOffset(RAMClassAllocationRequest._nextOffset_));
	}

	// RAMClassAllocationRequest* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._nextOffset_));
	}

	// UDATA prefixSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prefixSizeOffset_", declaredType="UDATA")
	public UDATA prefixSize() throws CorruptDataException {
		return getUDATAAtOffset(RAMClassAllocationRequest._prefixSizeOffset_);
	}

	// UDATA prefixSize
	public UDATAPointer prefixSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RAMClassAllocationRequest._prefixSizeOffset_));
	}

}
