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
 * Structure: J9HypervisorDataPointer
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
 * The generated code will provide getters for all elements in the J9HypervisorDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9HypervisorData.class)
public class J9HypervisorDataPointer extends StructurePointer {

	// NULL
	public static final J9HypervisorDataPointer NULL = new J9HypervisorDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9HypervisorDataPointer(long address) {
		super(address);
	}

	public static J9HypervisorDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9HypervisorDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9HypervisorDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9HypervisorDataPointer(address);
	}

	public J9HypervisorDataPointer add(long count) {
		return J9HypervisorDataPointer.cast(address + (J9HypervisorData.SIZEOF * count));
	}

	public J9HypervisorDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9HypervisorDataPointer addOffset(long offset) {
		return J9HypervisorDataPointer.cast(address + offset);
	}

	public J9HypervisorDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9HypervisorDataPointer sub(long count) {
		return J9HypervisorDataPointer.cast(address - (J9HypervisorData.SIZEOF * count));
	}

	public J9HypervisorDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9HypervisorDataPointer subOffset(long offset) {
		return J9HypervisorDataPointer.cast(address - offset);
	}

	public J9HypervisorDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9HypervisorDataPointer untag(long mask) {
		return J9HypervisorDataPointer.cast(address & ~mask);
	}

	public J9HypervisorDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9HypervisorData.SIZEOF;
	}

	// Implementation methods

	// J9HyperFunctions hypFunc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypFuncOffset_", declaredType="J9HyperFunctions")
	public J9HyperFunctionsPointer hypFunc() throws CorruptDataException {
		return J9HyperFunctionsPointer.cast(nonNullFieldEA(J9HypervisorData._hypFuncOffset_));
	}

	// J9HyperFunctions hypFunc
	public PointerPointer hypFuncEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HypervisorData._hypFuncOffset_));
	}

	// I64 isVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isVirtualOffset_", declaredType="I64")
	public IDATA isVirtual() throws CorruptDataException {
		return new I64(getLongAtOffset(J9HypervisorData._isVirtualOffset_));
	}

	// I64 isVirtual
	public IDATAPointer isVirtualEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9HypervisorData._isVirtualOffset_));
	}

	// J9HypervisorVendorDetails vendorDetails
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vendorDetailsOffset_", declaredType="J9HypervisorVendorDetails")
	public J9HypervisorVendorDetailsPointer vendorDetails() throws CorruptDataException {
		return J9HypervisorVendorDetailsPointer.cast(nonNullFieldEA(J9HypervisorData._vendorDetailsOffset_));
	}

	// J9HypervisorVendorDetails vendorDetails
	public PointerPointer vendorDetailsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HypervisorData._vendorDetailsOffset_));
	}

	// U8* vendorErrMsg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vendorErrMsgOffset_", declaredType="U8*")
	public U8Pointer vendorErrMsg() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9HypervisorData._vendorErrMsgOffset_));
	}

	// U8* vendorErrMsg
	public PointerPointer vendorErrMsgEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HypervisorData._vendorErrMsgOffset_));
	}

	// omrthread_monitor_t vendorMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vendorMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer vendorMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9HypervisorData._vendorMonitorOffset_));
	}

	// omrthread_monitor_t vendorMonitor
	public PointerPointer vendorMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HypervisorData._vendorMonitorOffset_));
	}

	// void* vendorPrivateData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vendorPrivateDataOffset_", declaredType="void*")
	public VoidPointer vendorPrivateData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HypervisorData._vendorPrivateDataOffset_));
	}

	// void* vendorPrivateData
	public PointerPointer vendorPrivateDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HypervisorData._vendorPrivateDataOffset_));
	}

	// I32 vendorStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vendorStatusOffset_", declaredType="I32")
	public IDATA vendorStatus() throws CorruptDataException {
		return new I32(getIntAtOffset(J9HypervisorData._vendorStatusOffset_));
	}

	// I32 vendorStatus
	public IDATAPointer vendorStatusEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9HypervisorData._vendorStatusOffset_));
	}

}
