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
 * Structure: MM_PacketPointer
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
 * The generated code will provide getters for all elements in the MM_PacketPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Packet.class)
public class MM_PacketPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_PacketPointer NULL = new MM_PacketPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PacketPointer(long address) {
		super(address);
	}

	public static MM_PacketPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PacketPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PacketPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PacketPointer(address);
	}

	public MM_PacketPointer add(long count) {
		return MM_PacketPointer.cast(address + (MM_Packet.SIZEOF * count));
	}

	public MM_PacketPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PacketPointer addOffset(long offset) {
		return MM_PacketPointer.cast(address + offset);
	}

	public MM_PacketPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PacketPointer sub(long count) {
		return MM_PacketPointer.cast(address - (MM_Packet.SIZEOF * count));
	}

	public MM_PacketPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PacketPointer subOffset(long offset) {
		return MM_PacketPointer.cast(address - offset);
	}

	public MM_PacketPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PacketPointer untag(long mask) {
		return MM_PacketPointer.cast(address & ~mask);
	}

	public MM_PacketPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Packet.SIZEOF;
	}

	// Implementation methods

	// U64* _baseAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__baseAddressOffset_", declaredType="U64*")
	public UDATAPointer _baseAddress() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_Packet.__baseAddressOffset_));
	}

	// U64* _baseAddress
	public PointerPointer _baseAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__baseAddressOffset_));
	}

	// U64* _basePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__basePtrOffset_", declaredType="U64*")
	public UDATAPointer _basePtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_Packet.__basePtrOffset_));
	}

	// U64* _basePtr
	public PointerPointer _basePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__basePtrOffset_));
	}

	// U64* _currentPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentPtrOffset_", declaredType="U64*")
	public UDATAPointer _currentPtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_Packet.__currentPtrOffset_));
	}

	// U64* _currentPtr
	public PointerPointer _currentPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__currentPtrOffset_));
	}

	// MM_Packet* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _next() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_Packet.__nextOffset_));
	}

	// MM_Packet* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__nextOffset_));
	}

	// MM_EnvironmentBase* _owner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownerOffset_", declaredType="MM_EnvironmentBase*")
	public MM_EnvironmentBasePointer _owner() throws CorruptDataException {
		return MM_EnvironmentBasePointer.cast(getPointerAtOffset(MM_Packet.__ownerOffset_));
	}

	// MM_EnvironmentBase* _owner
	public PointerPointer _ownerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__ownerOffset_));
	}

	// MM_Packet* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _previous() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_Packet.__previousOffset_));
	}

	// MM_Packet* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__previousOffset_));
	}

	// U64 _sublistIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sublistIndexOffset_", declaredType="U64")
	public UDATA _sublistIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Packet.__sublistIndexOffset_));
	}

	// U64 _sublistIndex
	public UDATAPointer _sublistIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Packet.__sublistIndexOffset_));
	}

	// U64* _topPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__topPtrOffset_", declaredType="U64*")
	public UDATAPointer _topPtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(MM_Packet.__topPtrOffset_));
	}

	// U64* _topPtr
	public PointerPointer _topPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Packet.__topPtrOffset_));
	}

}
