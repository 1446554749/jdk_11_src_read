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
 * Structure: J9PoolPuddlePointer
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
 * The generated code will provide getters for all elements in the J9PoolPuddlePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PoolPuddle.class)
public class J9PoolPuddlePointer extends StructurePointer {

	// NULL
	public static final J9PoolPuddlePointer NULL = new J9PoolPuddlePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PoolPuddlePointer(long address) {
		super(address);
	}

	public static J9PoolPuddlePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PoolPuddlePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PoolPuddlePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PoolPuddlePointer(address);
	}

	public J9PoolPuddlePointer add(long count) {
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddle.SIZEOF * count));
	}

	public J9PoolPuddlePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PoolPuddlePointer addOffset(long offset) {
		return J9PoolPuddlePointer.cast(address + offset);
	}

	public J9PoolPuddlePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PoolPuddlePointer sub(long count) {
		return J9PoolPuddlePointer.cast(address - (J9PoolPuddle.SIZEOF * count));
	}

	public J9PoolPuddlePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PoolPuddlePointer subOffset(long offset) {
		return J9PoolPuddlePointer.cast(address - offset);
	}

	public J9PoolPuddlePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PoolPuddlePointer untag(long mask) {
		return J9PoolPuddlePointer.cast(address & ~mask);
	}

	public J9PoolPuddlePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PoolPuddle.SIZEOF;
	}

	// Implementation methods

	// J9SRP firstElementAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstElementAddressOffset_", declaredType="J9SRP")
	public VoidPointer firstElementAddress() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9PoolPuddle._firstElementAddressOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9PoolPuddle._firstElementAddressOffset_ + nextAddress));
	}

	// J9SRP firstElementAddress
	public SelfRelativePointer firstElementAddressEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._firstElementAddressOffset_));
	}

	// J9SRP(UDATA) firstFreeSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstFreeSlotOffset_", declaredType="J9SRP(UDATA)")
	public UDATAPointer firstFreeSlot() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9PoolPuddle._firstFreeSlotOffset_);
		if (nextAddress == 0) {
			return UDATAPointer.NULL;
		}
		return UDATAPointer.cast(address + (J9PoolPuddle._firstFreeSlotOffset_ + nextAddress));
	}

	// J9SRP(UDATA) firstFreeSlot
	public SelfRelativePointer firstFreeSlotEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._firstFreeSlotOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PoolPuddle._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PoolPuddle._flagsOffset_));
	}

	// J9WSRP(J9PoolPuddle) nextAvailablePuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextAvailablePuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer nextAvailablePuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddle._nextAvailablePuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddle._nextAvailablePuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) nextAvailablePuddle
	public WideSelfRelativePointer nextAvailablePuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._nextAvailablePuddleOffset_));
	}

	// J9WSRP(J9PoolPuddle) nextPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextPuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer nextPuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddle._nextPuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddle._nextPuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) nextPuddle
	public WideSelfRelativePointer nextPuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._nextPuddleOffset_));
	}

	// J9WSRP(J9PoolPuddle) prevAvailablePuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevAvailablePuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer prevAvailablePuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddle._prevAvailablePuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddle._prevAvailablePuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) prevAvailablePuddle
	public WideSelfRelativePointer prevAvailablePuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._prevAvailablePuddleOffset_));
	}

	// J9WSRP(J9PoolPuddle) prevPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevPuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer prevPuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddle._prevPuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddle._prevPuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) prevPuddle
	public WideSelfRelativePointer prevPuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddle._prevPuddleOffset_));
	}

	// U64 usedElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usedElementsOffset_", declaredType="U64")
	public UDATA usedElements() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PoolPuddle._usedElementsOffset_));
	}

	// U64 usedElements
	public UDATAPointer usedElementsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PoolPuddle._usedElementsOffset_));
	}

	// U64 userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="U64")
	public UDATA userData() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PoolPuddle._userDataOffset_));
	}

	// U64 userData
	public UDATAPointer userDataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PoolPuddle._userDataOffset_));
	}

}
