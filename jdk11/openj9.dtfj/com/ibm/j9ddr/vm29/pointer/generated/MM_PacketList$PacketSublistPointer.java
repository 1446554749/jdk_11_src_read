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
 * Structure: MM_PacketList$PacketSublistPointer
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
 * The generated code will provide getters for all elements in the MM_PacketList$PacketSublistPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PacketList$PacketSublist.class)
public class MM_PacketList$PacketSublistPointer extends StructurePointer {

	// NULL
	public static final MM_PacketList$PacketSublistPointer NULL = new MM_PacketList$PacketSublistPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PacketList$PacketSublistPointer(long address) {
		super(address);
	}

	public static MM_PacketList$PacketSublistPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PacketList$PacketSublistPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PacketList$PacketSublistPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PacketList$PacketSublistPointer(address);
	}

	public MM_PacketList$PacketSublistPointer add(long count) {
		return MM_PacketList$PacketSublistPointer.cast(address + (MM_PacketList$PacketSublist.SIZEOF * count));
	}

	public MM_PacketList$PacketSublistPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PacketList$PacketSublistPointer addOffset(long offset) {
		return MM_PacketList$PacketSublistPointer.cast(address + offset);
	}

	public MM_PacketList$PacketSublistPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PacketList$PacketSublistPointer sub(long count) {
		return MM_PacketList$PacketSublistPointer.cast(address - (MM_PacketList$PacketSublist.SIZEOF * count));
	}

	public MM_PacketList$PacketSublistPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PacketList$PacketSublistPointer subOffset(long offset) {
		return MM_PacketList$PacketSublistPointer.cast(address - offset);
	}

	public MM_PacketList$PacketSublistPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PacketList$PacketSublistPointer untag(long mask) {
		return MM_PacketList$PacketSublistPointer.cast(address & ~mask);
	}

	public MM_PacketList$PacketSublistPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PacketList$PacketSublist.SIZEOF;
	}

	// Implementation methods

	// MM_Packet* _head
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _head() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_PacketList$PacketSublist.__headOffset_));
	}

	// MM_Packet* _head
	public PointerPointer _headEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PacketList$PacketSublist.__headOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _lock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_PacketList$PacketSublist.__lockOffset_));
	}

	// MM_LightweightNonReentrantLock _lock
	public PointerPointer _lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PacketList$PacketSublist.__lockOffset_));
	}

	// MM_Packet* _tail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailOffset_", declaredType="MM_Packet*")
	public MM_PacketPointer _tail() throws CorruptDataException {
		return MM_PacketPointer.cast(getPointerAtOffset(MM_PacketList$PacketSublist.__tailOffset_));
	}

	// MM_Packet* _tail
	public PointerPointer _tailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PacketList$PacketSublist.__tailOffset_));
	}

}
