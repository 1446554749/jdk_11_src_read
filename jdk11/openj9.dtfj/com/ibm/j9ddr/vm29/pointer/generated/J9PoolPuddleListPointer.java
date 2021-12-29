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
 * Structure: J9PoolPuddleListPointer
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
 * The generated code will provide getters for all elements in the J9PoolPuddleListPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PoolPuddleList.class)
public class J9PoolPuddleListPointer extends StructurePointer {

	// NULL
	public static final J9PoolPuddleListPointer NULL = new J9PoolPuddleListPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PoolPuddleListPointer(long address) {
		super(address);
	}

	public static J9PoolPuddleListPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PoolPuddleListPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PoolPuddleListPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PoolPuddleListPointer(address);
	}

	public J9PoolPuddleListPointer add(long count) {
		return J9PoolPuddleListPointer.cast(address + (J9PoolPuddleList.SIZEOF * count));
	}

	public J9PoolPuddleListPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PoolPuddleListPointer addOffset(long offset) {
		return J9PoolPuddleListPointer.cast(address + offset);
	}

	public J9PoolPuddleListPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PoolPuddleListPointer sub(long count) {
		return J9PoolPuddleListPointer.cast(address - (J9PoolPuddleList.SIZEOF * count));
	}

	public J9PoolPuddleListPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PoolPuddleListPointer subOffset(long offset) {
		return J9PoolPuddleListPointer.cast(address - offset);
	}

	public J9PoolPuddleListPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PoolPuddleListPointer untag(long mask) {
		return J9PoolPuddleListPointer.cast(address & ~mask);
	}

	public J9PoolPuddleListPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PoolPuddleList.SIZEOF;
	}

	// Implementation methods

	// J9WSRP(J9PoolPuddle) nextAvailablePuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextAvailablePuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer nextAvailablePuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddleList._nextAvailablePuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddleList._nextAvailablePuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) nextAvailablePuddle
	public WideSelfRelativePointer nextAvailablePuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddleList._nextAvailablePuddleOffset_));
	}

	// J9WSRP(J9PoolPuddle) nextPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextPuddleOffset_", declaredType="J9WSRP(J9PoolPuddle)")
	public J9PoolPuddlePointer nextPuddle() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9PoolPuddleList._nextPuddleOffset_);
		if (nextAddress == 0) {
			return J9PoolPuddlePointer.NULL;
		}
		return J9PoolPuddlePointer.cast(address + (J9PoolPuddleList._nextPuddleOffset_ + nextAddress));
	}

	// J9WSRP(J9PoolPuddle) nextPuddle
	public WideSelfRelativePointer nextPuddleEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9PoolPuddleList._nextPuddleOffset_));
	}

	// U64 numElements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numElementsOffset_", declaredType="U64")
	public UDATA numElements() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PoolPuddleList._numElementsOffset_));
	}

	// U64 numElements
	public UDATAPointer numElementsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PoolPuddleList._numElementsOffset_));
	}

}
