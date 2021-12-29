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
 * Structure: J9NLSHashEntryPointer
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
 * The generated code will provide getters for all elements in the J9NLSHashEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9NLSHashEntry.class)
public class J9NLSHashEntryPointer extends StructurePointer {

	// NULL
	public static final J9NLSHashEntryPointer NULL = new J9NLSHashEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9NLSHashEntryPointer(long address) {
		super(address);
	}

	public static J9NLSHashEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9NLSHashEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9NLSHashEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9NLSHashEntryPointer(address);
	}

	public J9NLSHashEntryPointer add(long count) {
		return J9NLSHashEntryPointer.cast(address + (J9NLSHashEntry.SIZEOF * count));
	}

	public J9NLSHashEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9NLSHashEntryPointer addOffset(long offset) {
		return J9NLSHashEntryPointer.cast(address + offset);
	}

	public J9NLSHashEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9NLSHashEntryPointer sub(long count) {
		return J9NLSHashEntryPointer.cast(address - (J9NLSHashEntry.SIZEOF * count));
	}

	public J9NLSHashEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9NLSHashEntryPointer subOffset(long offset) {
		return J9NLSHashEntryPointer.cast(address - offset);
	}

	public J9NLSHashEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9NLSHashEntryPointer untag(long mask) {
		return J9NLSHashEntryPointer.cast(address & ~mask);
	}

	public J9NLSHashEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9NLSHashEntry.SIZEOF;
	}

	// Implementation methods

	// U8[] message
	public U8Pointer messageEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9NLSHashEntry._messageOffset_));
	}

	// U32 message_num
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_message_numOffset_", declaredType="U32")
	public UDATA message_num() throws CorruptDataException {
		return new U32(getIntAtOffset(J9NLSHashEntry._message_numOffset_));
	}

	// U32 message_num
	public UDATAPointer message_numEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NLSHashEntry._message_numOffset_));
	}

	// U32 module_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_module_nameOffset_", declaredType="U32")
	public UDATA module_name() throws CorruptDataException {
		return new U32(getIntAtOffset(J9NLSHashEntry._module_nameOffset_));
	}

	// U32 module_name
	public UDATAPointer module_nameEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NLSHashEntry._module_nameOffset_));
	}

	// J9NLSHashEntry* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9NLSHashEntry*")
	public J9NLSHashEntryPointer next() throws CorruptDataException {
		return J9NLSHashEntryPointer.cast(getPointerAtOffset(J9NLSHashEntry._nextOffset_));
	}

	// J9NLSHashEntry* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSHashEntry._nextOffset_));
	}

}
