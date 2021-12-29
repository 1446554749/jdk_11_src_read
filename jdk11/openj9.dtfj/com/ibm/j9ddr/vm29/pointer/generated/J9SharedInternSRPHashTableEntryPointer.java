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
 * Structure: J9SharedInternSRPHashTableEntryPointer
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
 * The generated code will provide getters for all elements in the J9SharedInternSRPHashTableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedInternSRPHashTableEntry.class)
public class J9SharedInternSRPHashTableEntryPointer extends StructurePointer {

	// NULL
	public static final J9SharedInternSRPHashTableEntryPointer NULL = new J9SharedInternSRPHashTableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedInternSRPHashTableEntryPointer(long address) {
		super(address);
	}

	public static J9SharedInternSRPHashTableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedInternSRPHashTableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedInternSRPHashTableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedInternSRPHashTableEntryPointer(address);
	}

	public J9SharedInternSRPHashTableEntryPointer add(long count) {
		return J9SharedInternSRPHashTableEntryPointer.cast(address + (J9SharedInternSRPHashTableEntry.SIZEOF * count));
	}

	public J9SharedInternSRPHashTableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedInternSRPHashTableEntryPointer addOffset(long offset) {
		return J9SharedInternSRPHashTableEntryPointer.cast(address + offset);
	}

	public J9SharedInternSRPHashTableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedInternSRPHashTableEntryPointer sub(long count) {
		return J9SharedInternSRPHashTableEntryPointer.cast(address - (J9SharedInternSRPHashTableEntry.SIZEOF * count));
	}

	public J9SharedInternSRPHashTableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedInternSRPHashTableEntryPointer subOffset(long offset) {
		return J9SharedInternSRPHashTableEntryPointer.cast(address - offset);
	}

	public J9SharedInternSRPHashTableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedInternSRPHashTableEntryPointer untag(long mask) {
		return J9SharedInternSRPHashTableEntryPointer.cast(address & ~mask);
	}

	public J9SharedInternSRPHashTableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedInternSRPHashTableEntry.SIZEOF;
	}

	// Implementation methods

	// U16 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U16")
	public U16 flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9SharedInternSRPHashTableEntry._flagsOffset_));
	}

	// U16 flags
	public U16Pointer flagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9SharedInternSRPHashTableEntry._flagsOffset_));
	}

	// U16 internWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internWeightOffset_", declaredType="U16")
	public U16 internWeight() throws CorruptDataException {
		return new U16(getShortAtOffset(J9SharedInternSRPHashTableEntry._internWeightOffset_));
	}

	// U16 internWeight
	public U16Pointer internWeightEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9SharedInternSRPHashTableEntry._internWeightOffset_));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) nextNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextNodeOffset_", declaredType="J9SRP(J9SharedInternSRPHashTableEntry)")
	public J9SharedInternSRPHashTableEntryPointer nextNode() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedInternSRPHashTableEntry._nextNodeOffset_);
		if (nextAddress == 0) {
			return J9SharedInternSRPHashTableEntryPointer.NULL;
		}
		return J9SharedInternSRPHashTableEntryPointer.cast(address + (J9SharedInternSRPHashTableEntry._nextNodeOffset_ + nextAddress));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) nextNode
	public SelfRelativePointer nextNodeEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedInternSRPHashTableEntry._nextNodeOffset_));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) prevNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevNodeOffset_", declaredType="J9SRP(J9SharedInternSRPHashTableEntry)")
	public J9SharedInternSRPHashTableEntryPointer prevNode() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedInternSRPHashTableEntry._prevNodeOffset_);
		if (nextAddress == 0) {
			return J9SharedInternSRPHashTableEntryPointer.NULL;
		}
		return J9SharedInternSRPHashTableEntryPointer.cast(address + (J9SharedInternSRPHashTableEntry._prevNodeOffset_ + nextAddress));
	}

	// J9SRP(J9SharedInternSRPHashTableEntry) prevNode
	public SelfRelativePointer prevNodeEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedInternSRPHashTableEntry._prevNodeOffset_));
	}

	// J9SRP(J9UTF8) utf8SRP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utf8SRPOffset_", declaredType="J9SRP(J9UTF8)")
	public J9UTF8Pointer utf8SRP() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SharedInternSRPHashTableEntry._utf8SRPOffset_);
		if (nextAddress == 0) {
			return J9UTF8Pointer.NULL;
		}
		return J9UTF8Pointer.cast(address + (J9SharedInternSRPHashTableEntry._utf8SRPOffset_ + nextAddress));
	}

	// J9SRP(J9UTF8) utf8SRP
	public SelfRelativePointer utf8SRPEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SharedInternSRPHashTableEntry._utf8SRPOffset_));
	}

}
