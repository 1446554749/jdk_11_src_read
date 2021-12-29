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
 * Structure: HashLinkedListImplPointer
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
 * The generated code will provide getters for all elements in the HashLinkedListImplPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=HashLinkedListImpl.class)
public class HashLinkedListImplPointer extends LinkedListImplPointer {

	// NULL
	public static final HashLinkedListImplPointer NULL = new HashLinkedListImplPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected HashLinkedListImplPointer(long address) {
		super(address);
	}

	public static HashLinkedListImplPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static HashLinkedListImplPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static HashLinkedListImplPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new HashLinkedListImplPointer(address);
	}

	public HashLinkedListImplPointer add(long count) {
		return HashLinkedListImplPointer.cast(address + (HashLinkedListImpl.SIZEOF * count));
	}

	public HashLinkedListImplPointer add(Scalar count) {
		return add(count.longValue());
	}

	public HashLinkedListImplPointer addOffset(long offset) {
		return HashLinkedListImplPointer.cast(address + offset);
	}

	public HashLinkedListImplPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public HashLinkedListImplPointer sub(long count) {
		return HashLinkedListImplPointer.cast(address - (HashLinkedListImpl.SIZEOF * count));
	}

	public HashLinkedListImplPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public HashLinkedListImplPointer subOffset(long offset) {
		return HashLinkedListImplPointer.cast(address - offset);
	}

	public HashLinkedListImplPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public HashLinkedListImplPointer untag(long mask) {
		return HashLinkedListImplPointer.cast(address & ~mask);
	}

	public HashLinkedListImplPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return HashLinkedListImpl.SIZEOF;
	}

	// Implementation methods

	// UDATA _hashValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hashValueOffset_", declaredType="UDATA")
	public UDATA _hashValue() throws CorruptDataException {
		return getUDATAAtOffset(HashLinkedListImpl.__hashValueOffset_);
	}

	// UDATA _hashValue
	public UDATAPointer _hashValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(HashLinkedListImpl.__hashValueOffset_));
	}

	// U8* _key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__keyOffset_", declaredType="U8*")
	public U8Pointer _key() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(HashLinkedListImpl.__keyOffset_));
	}

	// U8* _key
	public PointerPointer _keyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(HashLinkedListImpl.__keyOffset_));
	}

	// U16 _keySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__keySizeOffset_", declaredType="U16")
	public U16 _keySize() throws CorruptDataException {
		return new U16(getShortAtOffset(HashLinkedListImpl.__keySizeOffset_));
	}

	// U16 _keySize
	public U16Pointer _keySizeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(HashLinkedListImpl.__keySizeOffset_));
	}

}
