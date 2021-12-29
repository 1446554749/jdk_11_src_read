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
 * Structure: J9PortVmemParamsPointer
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
 * The generated code will provide getters for all elements in the J9PortVmemParamsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PortVmemParams.class)
public class J9PortVmemParamsPointer extends StructurePointer {

	// NULL
	public static final J9PortVmemParamsPointer NULL = new J9PortVmemParamsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PortVmemParamsPointer(long address) {
		super(address);
	}

	public static J9PortVmemParamsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PortVmemParamsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PortVmemParamsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PortVmemParamsPointer(address);
	}

	public J9PortVmemParamsPointer add(long count) {
		return J9PortVmemParamsPointer.cast(address + (J9PortVmemParams.SIZEOF * count));
	}

	public J9PortVmemParamsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PortVmemParamsPointer addOffset(long offset) {
		return J9PortVmemParamsPointer.cast(address + offset);
	}

	public J9PortVmemParamsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PortVmemParamsPointer sub(long count) {
		return J9PortVmemParamsPointer.cast(address - (J9PortVmemParams.SIZEOF * count));
	}

	public J9PortVmemParamsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PortVmemParamsPointer subOffset(long offset) {
		return J9PortVmemParamsPointer.cast(address - offset);
	}

	public J9PortVmemParamsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PortVmemParamsPointer untag(long mask) {
		return J9PortVmemParamsPointer.cast(address & ~mask);
	}

	public J9PortVmemParamsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PortVmemParams.SIZEOF;
	}

	// Implementation methods

	// U64 alignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alignmentInBytesOffset_", declaredType="U64")
	public UDATA alignmentInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._alignmentInBytesOffset_));
	}

	// U64 alignmentInBytes
	public UDATAPointer alignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._alignmentInBytesOffset_));
	}

	// U64 byteAmount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteAmountOffset_", declaredType="U64")
	public UDATA byteAmount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._byteAmountOffset_));
	}

	// U64 byteAmount
	public UDATAPointer byteAmountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._byteAmountOffset_));
	}

	// U32 category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="U32")
	public UDATA category() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortVmemParams._categoryOffset_));
	}

	// U32 category
	public UDATAPointer categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._categoryOffset_));
	}

	// void* endAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endAddressOffset_", declaredType="void*")
	public VoidPointer endAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortVmemParams._endAddressOffset_));
	}

	// void* endAddress
	public PointerPointer endAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortVmemParams._endAddressOffset_));
	}

	// U64 mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modeOffset_", declaredType="U64")
	public UDATA mode() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._modeOffset_));
	}

	// U64 mode
	public UDATAPointer modeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._modeOffset_));
	}

	// U64 options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionsOffset_", declaredType="U64")
	public UDATA options() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._optionsOffset_));
	}

	// U64 options
	public UDATAPointer optionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._optionsOffset_));
	}

	// U64 pageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageFlagsOffset_", declaredType="U64")
	public UDATA pageFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._pageFlagsOffset_));
	}

	// U64 pageFlags
	public UDATAPointer pageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._pageFlagsOffset_));
	}

	// U64 pageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageSizeOffset_", declaredType="U64")
	public UDATA pageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemParams._pageSizeOffset_));
	}

	// U64 pageSize
	public UDATAPointer pageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemParams._pageSizeOffset_));
	}

	// void* startAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startAddressOffset_", declaredType="void*")
	public VoidPointer startAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortVmemParams._startAddressOffset_));
	}

	// void* startAddress
	public PointerPointer startAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortVmemParams._startAddressOffset_));
	}

}
