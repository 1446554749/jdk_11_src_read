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
 * Structure: SH_ClasspathManagerImpl2$CpLinkedListHdrPointer
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
 * The generated code will provide getters for all elements in the SH_ClasspathManagerImpl2$CpLinkedListHdrPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_ClasspathManagerImpl2$CpLinkedListHdr.class)
public class SH_ClasspathManagerImpl2$CpLinkedListHdrPointer extends StructurePointer {

	// NULL
	public static final SH_ClasspathManagerImpl2$CpLinkedListHdrPointer NULL = new SH_ClasspathManagerImpl2$CpLinkedListHdrPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_ClasspathManagerImpl2$CpLinkedListHdrPointer(long address) {
		super(address);
	}

	public static SH_ClasspathManagerImpl2$CpLinkedListHdrPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_ClasspathManagerImpl2$CpLinkedListHdrPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_ClasspathManagerImpl2$CpLinkedListHdrPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_ClasspathManagerImpl2$CpLinkedListHdrPointer(address);
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer add(long count) {
		return SH_ClasspathManagerImpl2$CpLinkedListHdrPointer.cast(address + (SH_ClasspathManagerImpl2$CpLinkedListHdr.SIZEOF * count));
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer addOffset(long offset) {
		return SH_ClasspathManagerImpl2$CpLinkedListHdrPointer.cast(address + offset);
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer sub(long count) {
		return SH_ClasspathManagerImpl2$CpLinkedListHdrPointer.cast(address - (SH_ClasspathManagerImpl2$CpLinkedListHdr.SIZEOF * count));
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer subOffset(long offset) {
		return SH_ClasspathManagerImpl2$CpLinkedListHdrPointer.cast(address - offset);
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer untag(long mask) {
		return SH_ClasspathManagerImpl2$CpLinkedListHdrPointer.cast(address & ~mask);
	}

	public SH_ClasspathManagerImpl2$CpLinkedListHdrPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_ClasspathManagerImpl2$CpLinkedListHdr.SIZEOF;
	}

	// Implementation methods

	// U8 _flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flagsOffset_", declaredType="U8")
	public U8 _flags() throws CorruptDataException {
		return new U8(getByteAtOffset(SH_ClasspathManagerImpl2$CpLinkedListHdr.__flagsOffset_));
	}

	// U8 _flags
	public U8Pointer _flagsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(SH_ClasspathManagerImpl2$CpLinkedListHdr.__flagsOffset_));
	}

	// U8 _isToken
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isTokenOffset_", declaredType="U8")
	public U8 _isToken() throws CorruptDataException {
		return new U8(getByteAtOffset(SH_ClasspathManagerImpl2$CpLinkedListHdr.__isTokenOffset_));
	}

	// U8 _isToken
	public U8Pointer _isTokenEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(SH_ClasspathManagerImpl2$CpLinkedListHdr.__isTokenOffset_));
	}

	// const U8* _key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__keyOffset_", declaredType="const U8*")
	public U8Pointer _key() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(SH_ClasspathManagerImpl2$CpLinkedListHdr.__keyOffset_));
	}

	// const U8* _key
	public PointerPointer _keyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ClasspathManagerImpl2$CpLinkedListHdr.__keyOffset_));
	}

	// U16 _keySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__keySizeOffset_", declaredType="U16")
	public U16 _keySize() throws CorruptDataException {
		return new U16(getShortAtOffset(SH_ClasspathManagerImpl2$CpLinkedListHdr.__keySizeOffset_));
	}

	// U16 _keySize
	public U16Pointer _keySizeEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(SH_ClasspathManagerImpl2$CpLinkedListHdr.__keySizeOffset_));
	}

	// SH_ClasspathManagerImpl2$CpLinkedListImpl* _list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__listOffset_", declaredType="SH_ClasspathManagerImpl2$CpLinkedListImpl*")
	public SH_ClasspathManagerImpl2$CpLinkedListImplPointer _list() throws CorruptDataException {
		return SH_ClasspathManagerImpl2$CpLinkedListImplPointer.cast(getPointerAtOffset(SH_ClasspathManagerImpl2$CpLinkedListHdr.__listOffset_));
	}

	// SH_ClasspathManagerImpl2$CpLinkedListImpl* _list
	public PointerPointer _listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ClasspathManagerImpl2$CpLinkedListHdr.__listOffset_));
	}

}
