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
 * Structure: movedObjectHashCodePointer
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
 * The generated code will provide getters for all elements in the movedObjectHashCodePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=movedObjectHashCode.class)
public class movedObjectHashCodePointer extends StructurePointer {

	// NULL
	public static final movedObjectHashCodePointer NULL = new movedObjectHashCodePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected movedObjectHashCodePointer(long address) {
		super(address);
	}

	public static movedObjectHashCodePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static movedObjectHashCodePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static movedObjectHashCodePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new movedObjectHashCodePointer(address);
	}

	public movedObjectHashCodePointer add(long count) {
		return movedObjectHashCodePointer.cast(address + (movedObjectHashCode.SIZEOF * count));
	}

	public movedObjectHashCodePointer add(Scalar count) {
		return add(count.longValue());
	}

	public movedObjectHashCodePointer addOffset(long offset) {
		return movedObjectHashCodePointer.cast(address + offset);
	}

	public movedObjectHashCodePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public movedObjectHashCodePointer sub(long count) {
		return movedObjectHashCodePointer.cast(address - (movedObjectHashCode.SIZEOF * count));
	}

	public movedObjectHashCodePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public movedObjectHashCodePointer subOffset(long offset) {
		return movedObjectHashCodePointer.cast(address - offset);
	}

	public movedObjectHashCodePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public movedObjectHashCodePointer untag(long mask) {
		return movedObjectHashCodePointer.cast(address & ~mask);
	}

	public movedObjectHashCodePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return movedObjectHashCode.SIZEOF;
	}

	// Implementation methods

	// BOOLEAN hasBeenHashed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasBeenHashedOffset_", declaredType="BOOLEAN")
	public UDATA hasBeenHashed() throws CorruptDataException {
		return new U32(getIntAtOffset(movedObjectHashCode._hasBeenHashedOffset_));
	}

	// BOOLEAN hasBeenHashed
	public UDATAPointer hasBeenHashedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(movedObjectHashCode._hasBeenHashedOffset_));
	}

	// BOOLEAN hasBeenMoved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasBeenMovedOffset_", declaredType="BOOLEAN")
	public UDATA hasBeenMoved() throws CorruptDataException {
		return new U32(getIntAtOffset(movedObjectHashCode._hasBeenMovedOffset_));
	}

	// BOOLEAN hasBeenMoved
	public UDATAPointer hasBeenMovedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(movedObjectHashCode._hasBeenMovedOffset_));
	}

	// U32 originalHashCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalHashCodeOffset_", declaredType="U32")
	public UDATA originalHashCode() throws CorruptDataException {
		return new U32(getIntAtOffset(movedObjectHashCode._originalHashCodeOffset_));
	}

	// U32 originalHashCode
	public UDATAPointer originalHashCodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(movedObjectHashCode._originalHashCodeOffset_));
	}

}
