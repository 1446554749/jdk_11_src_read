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
 * Structure: MM_WorkStackPointer
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
 * The generated code will provide getters for all elements in the MM_WorkStackPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_WorkStack.class)
public class MM_WorkStackPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_WorkStackPointer NULL = new MM_WorkStackPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_WorkStackPointer(long address) {
		super(address);
	}

	public static MM_WorkStackPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_WorkStackPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_WorkStackPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_WorkStackPointer(address);
	}

	public MM_WorkStackPointer add(long count) {
		return MM_WorkStackPointer.cast(address + (MM_WorkStack.SIZEOF * count));
	}

	public MM_WorkStackPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_WorkStackPointer addOffset(long offset) {
		return MM_WorkStackPointer.cast(address + offset);
	}

	public MM_WorkStackPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_WorkStackPointer sub(long count) {
		return MM_WorkStackPointer.cast(address - (MM_WorkStack.SIZEOF * count));
	}

	public MM_WorkStackPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_WorkStackPointer subOffset(long offset) {
		return MM_WorkStackPointer.cast(address - offset);
	}

	public MM_WorkStackPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_WorkStackPointer untag(long mask) {
		return MM_WorkStackPointer.cast(address & ~mask);
	}

	public MM_WorkStackPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_WorkStack.SIZEOF;
	}

	// Implementation methods

	// MM_Packet* _deferredPacket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredPacketOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _deferredPacket() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_WorkStack.__deferredPacketOffset_));
	}

	// MM_Packet* _deferredPacket
	public PointerPointer _deferredPacketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkStack.__deferredPacketOffset_));
	}

	// MM_Packet* _inputPacket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inputPacketOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _inputPacket() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_WorkStack.__inputPacketOffset_));
	}

	// MM_Packet* _inputPacket
	public PointerPointer _inputPacketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkStack.__inputPacketOffset_));
	}

	// MM_Packet* _outputPacket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__outputPacketOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _outputPacket() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_WorkStack.__outputPacketOffset_));
	}

	// MM_Packet* _outputPacket
	public PointerPointer _outputPacketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkStack.__outputPacketOffset_));
	}

	// U64 _pushCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pushCountOffset_", declaredType="U64")
	public UDATA _pushCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkStack.__pushCountOffset_));
	}

	// U64 _pushCount
	public UDATAPointer _pushCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkStack.__pushCountOffset_));
	}

	// MM_WorkPackets* _workPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsOffset_", declaredType="MM_WorkPackets*")
	public MM_WorkPacketsPointer _workPackets() throws CorruptDataException {
		return MM_WorkPacketsPointer.cast(getPointerAtOffset(MM_WorkStack.__workPacketsOffset_));
	}

	// MM_WorkPackets* _workPackets
	public PointerPointer _workPacketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkStack.__workPacketsOffset_));
	}

}
