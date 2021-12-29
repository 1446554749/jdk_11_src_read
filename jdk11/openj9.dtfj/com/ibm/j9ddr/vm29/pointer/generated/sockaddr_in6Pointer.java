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
 * Structure: sockaddr_in6Pointer
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
 * The generated code will provide getters for all elements in the sockaddr_in6Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=sockaddr_in6.class)
public class sockaddr_in6Pointer extends StructurePointer {

	// NULL
	public static final sockaddr_in6Pointer NULL = new sockaddr_in6Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected sockaddr_in6Pointer(long address) {
		super(address);
	}

	public static sockaddr_in6Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static sockaddr_in6Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static sockaddr_in6Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new sockaddr_in6Pointer(address);
	}

	public sockaddr_in6Pointer add(long count) {
		return sockaddr_in6Pointer.cast(address + (sockaddr_in6.SIZEOF * count));
	}

	public sockaddr_in6Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public sockaddr_in6Pointer addOffset(long offset) {
		return sockaddr_in6Pointer.cast(address + offset);
	}

	public sockaddr_in6Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public sockaddr_in6Pointer sub(long count) {
		return sockaddr_in6Pointer.cast(address - (sockaddr_in6.SIZEOF * count));
	}

	public sockaddr_in6Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public sockaddr_in6Pointer subOffset(long offset) {
		return sockaddr_in6Pointer.cast(address - offset);
	}

	public sockaddr_in6Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public sockaddr_in6Pointer untag(long mask) {
		return sockaddr_in6Pointer.cast(address & ~mask);
	}

	public sockaddr_in6Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return sockaddr_in6.SIZEOF;
	}

	// Implementation methods

	// in6_addr sin6_addr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_addrOffset_", declaredType="in6_addr")
	public in6_addrPointer sin6_addr() throws CorruptDataException {
		return in6_addrPointer.cast(nonNullFieldEA(sockaddr_in6._sin6_addrOffset_));
	}

	// in6_addr sin6_addr
	public PointerPointer sin6_addrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(sockaddr_in6._sin6_addrOffset_));
	}

	// sa_family_t sin6_family
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_familyOffset_", declaredType="sa_family_t")
	public U8 sin6_family() throws CorruptDataException {
		return new U8(getByteAtOffset(sockaddr_in6._sin6_familyOffset_));
	}

	// sa_family_t sin6_family
	public U8Pointer sin6_familyEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_in6._sin6_familyOffset_));
	}

	// U32 sin6_flowinfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_flowinfoOffset_", declaredType="U32")
	public UDATA sin6_flowinfo() throws CorruptDataException {
		return new U32(getIntAtOffset(sockaddr_in6._sin6_flowinfoOffset_));
	}

	// U32 sin6_flowinfo
	public UDATAPointer sin6_flowinfoEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(sockaddr_in6._sin6_flowinfoOffset_));
	}

	// U8 sin6_len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_lenOffset_", declaredType="U8")
	public U8 sin6_len() throws CorruptDataException {
		return new U8(getByteAtOffset(sockaddr_in6._sin6_lenOffset_));
	}

	// U8 sin6_len
	public U8Pointer sin6_lenEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(sockaddr_in6._sin6_lenOffset_));
	}

	// in_port_t sin6_port
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_portOffset_", declaredType="in_port_t")
	public U16 sin6_port() throws CorruptDataException {
		return new U16(getShortAtOffset(sockaddr_in6._sin6_portOffset_));
	}

	// in_port_t sin6_port
	public U16Pointer sin6_portEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(sockaddr_in6._sin6_portOffset_));
	}

	// U32 sin6_scope_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sin6_scope_idOffset_", declaredType="U32")
	public UDATA sin6_scope_id() throws CorruptDataException {
		return new U32(getIntAtOffset(sockaddr_in6._sin6_scope_idOffset_));
	}

	// U32 sin6_scope_id
	public UDATAPointer sin6_scope_idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(sockaddr_in6._sin6_scope_idOffset_));
	}

}
