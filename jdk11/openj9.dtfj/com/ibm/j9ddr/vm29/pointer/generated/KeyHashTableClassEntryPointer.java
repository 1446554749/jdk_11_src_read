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
 * Structure: KeyHashTableClassEntryPointer
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
 * The generated code will provide getters for all elements in the KeyHashTableClassEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=KeyHashTableClassEntry.class)
public class KeyHashTableClassEntryPointer extends StructurePointer {

	// NULL
	public static final KeyHashTableClassEntryPointer NULL = new KeyHashTableClassEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected KeyHashTableClassEntryPointer(long address) {
		super(address);
	}

	public static KeyHashTableClassEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static KeyHashTableClassEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static KeyHashTableClassEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new KeyHashTableClassEntryPointer(address);
	}

	public KeyHashTableClassEntryPointer add(long count) {
		return KeyHashTableClassEntryPointer.cast(address + (KeyHashTableClassEntry.SIZEOF * count));
	}

	public KeyHashTableClassEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public KeyHashTableClassEntryPointer addOffset(long offset) {
		return KeyHashTableClassEntryPointer.cast(address + offset);
	}

	public KeyHashTableClassEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public KeyHashTableClassEntryPointer sub(long count) {
		return KeyHashTableClassEntryPointer.cast(address - (KeyHashTableClassEntry.SIZEOF * count));
	}

	public KeyHashTableClassEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public KeyHashTableClassEntryPointer subOffset(long offset) {
		return KeyHashTableClassEntryPointer.cast(address - offset);
	}

	public KeyHashTableClassEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public KeyHashTableClassEntryPointer untag(long mask) {
		return KeyHashTableClassEntryPointer.cast(address & ~mask);
	}

	public KeyHashTableClassEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return KeyHashTableClassEntry.SIZEOF;
	}

	// Implementation methods

	// J9UTF8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer className() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(KeyHashTableClassEntry._classNameOffset_));
	}

	// J9UTF8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(KeyHashTableClassEntry._classNameOffset_));
	}

	// J9PackageIDTableEntry packageID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_packageIDOffset_", declaredType="J9PackageIDTableEntry")
	public J9PackageIDTableEntryPointer packageID() throws CorruptDataException {
		return J9PackageIDTableEntryPointer.cast(nonNullFieldEA(KeyHashTableClassEntry._packageIDOffset_));
	}

	// J9PackageIDTableEntry packageID
	public PointerPointer packageIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(KeyHashTableClassEntry._packageIDOffset_));
	}

	// J9Class* ramClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramClassOffset_", declaredType="J9Class*")
	public J9ClassPointer ramClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(KeyHashTableClassEntry._ramClassOffset_));
	}

	// J9Class* ramClass
	public PointerPointer ramClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(KeyHashTableClassEntry._ramClassOffset_));
	}

	// UDATA tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="UDATA")
	public UDATA tag() throws CorruptDataException {
		return getUDATAAtOffset(KeyHashTableClassEntry._tagOffset_);
	}

	// UDATA tag
	public UDATAPointer tagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(KeyHashTableClassEntry._tagOffset_));
	}

}
