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
 * Structure: sockaddr_storagePointer
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
 * The generated code will provide getters for all elements in the sockaddr_storagePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=sockaddr_storage.class)
public class sockaddr_storagePointer extends StructurePointer {

	// NULL
	public static final sockaddr_storagePointer NULL = new sockaddr_storagePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected sockaddr_storagePointer(long address) {
		super(address);
	}

	public static sockaddr_storagePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static sockaddr_storagePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static sockaddr_storagePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new sockaddr_storagePointer(address);
	}

	public sockaddr_storagePointer add(long count) {
		return sockaddr_storagePointer.cast(address + (sockaddr_storage.SIZEOF * count));
	}

	public sockaddr_storagePointer add(Scalar count) {
		return add(count.longValue());
	}

	public sockaddr_storagePointer addOffset(long offset) {
		return sockaddr_storagePointer.cast(address + offset);
	}

	public sockaddr_storagePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public sockaddr_storagePointer sub(long count) {
		return sockaddr_storagePointer.cast(address - (sockaddr_storage.SIZEOF * count));
	}

	public sockaddr_storagePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public sockaddr_storagePointer subOffset(long offset) {
		return sockaddr_storagePointer.cast(address - offset);
	}

	public sockaddr_storagePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public sockaddr_storagePointer untag(long mask) {
		return sockaddr_storagePointer.cast(address & ~mask);
	}

	public sockaddr_storagePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return sockaddr_storage.SIZEOF;
	}

	// Implementation methods

	// I64 __ss_align
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___ss_alignOffset_", declaredType="I64")
	public IDATA __ss_align() throws CorruptDataException {
		return new I64(getLongAtOffset(sockaddr_storage.___ss_alignOffset_));
	}

	// I64 __ss_align
	public IDATAPointer __ss_alignEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(sockaddr_storage.___ss_alignOffset_));
	}

	// U8[] __ss_pad1
	public U8Pointer __ss_pad1EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_storage.___ss_pad1Offset_));
	}

	// U8[] __ss_pad2
	public U8Pointer __ss_pad2EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_storage.___ss_pad2Offset_));
	}

	// sa_family_t ss_family
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ss_familyOffset_", declaredType="sa_family_t")
	public U8 ss_family() throws CorruptDataException {
		return new U8(getByteAtOffset(sockaddr_storage._ss_familyOffset_));
	}

	// sa_family_t ss_family
	public U8Pointer ss_familyEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_storage._ss_familyOffset_));
	}

	// U8 ss_len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ss_lenOffset_", declaredType="U8")
	public U8 ss_len() throws CorruptDataException {
		return new U8(getByteAtOffset(sockaddr_storage._ss_lenOffset_));
	}

	// U8 ss_len
	public U8Pointer ss_lenEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_storage._ss_lenOffset_));
	}

}
