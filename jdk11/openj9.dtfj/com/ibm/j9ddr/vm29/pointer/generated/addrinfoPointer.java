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
 * Structure: addrinfoPointer
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
 * The generated code will provide getters for all elements in the addrinfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=addrinfo.class)
public class addrinfoPointer extends StructurePointer {

	// NULL
	public static final addrinfoPointer NULL = new addrinfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected addrinfoPointer(long address) {
		super(address);
	}

	public static addrinfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static addrinfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static addrinfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new addrinfoPointer(address);
	}

	public addrinfoPointer add(long count) {
		return addrinfoPointer.cast(address + (addrinfo.SIZEOF * count));
	}

	public addrinfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public addrinfoPointer addOffset(long offset) {
		return addrinfoPointer.cast(address + offset);
	}

	public addrinfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public addrinfoPointer sub(long count) {
		return addrinfoPointer.cast(address - (addrinfo.SIZEOF * count));
	}

	public addrinfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public addrinfoPointer subOffset(long offset) {
		return addrinfoPointer.cast(address - offset);
	}

	public addrinfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public addrinfoPointer untag(long mask) {
		return addrinfoPointer.cast(address & ~mask);
	}

	public addrinfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return addrinfo.SIZEOF;
	}

	// Implementation methods

	// sockaddr* ai_addr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_addrOffset_", declaredType="sockaddr*")
	public sockaddrPointer ai_addr() throws CorruptDataException {
		return sockaddrPointer.cast(getPointerAtOffset(addrinfo._ai_addrOffset_));
	}

	// sockaddr* ai_addr
	public PointerPointer ai_addrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(addrinfo._ai_addrOffset_));
	}

	// socklen_t ai_addrlen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_addrlenOffset_", declaredType="socklen_t")
	public UDATA ai_addrlen() throws CorruptDataException {
		return new U32(getIntAtOffset(addrinfo._ai_addrlenOffset_));
	}

	// socklen_t ai_addrlen
	public UDATAPointer ai_addrlenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(addrinfo._ai_addrlenOffset_));
	}

	// U8* ai_canonname
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_canonnameOffset_", declaredType="U8*")
	public U8Pointer ai_canonname() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(addrinfo._ai_canonnameOffset_));
	}

	// U8* ai_canonname
	public PointerPointer ai_canonnameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(addrinfo._ai_canonnameOffset_));
	}

	// I32 ai_family
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_familyOffset_", declaredType="I32")
	public IDATA ai_family() throws CorruptDataException {
		return new I32(getIntAtOffset(addrinfo._ai_familyOffset_));
	}

	// I32 ai_family
	public IDATAPointer ai_familyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(addrinfo._ai_familyOffset_));
	}

	// I32 ai_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_flagsOffset_", declaredType="I32")
	public IDATA ai_flags() throws CorruptDataException {
		return new I32(getIntAtOffset(addrinfo._ai_flagsOffset_));
	}

	// I32 ai_flags
	public IDATAPointer ai_flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(addrinfo._ai_flagsOffset_));
	}

	// addrinfo* ai_next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_nextOffset_", declaredType="addrinfo*")
	public addrinfoPointer ai_next() throws CorruptDataException {
		return addrinfoPointer.cast(getPointerAtOffset(addrinfo._ai_nextOffset_));
	}

	// addrinfo* ai_next
	public PointerPointer ai_nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(addrinfo._ai_nextOffset_));
	}

	// I32 ai_protocol
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_protocolOffset_", declaredType="I32")
	public IDATA ai_protocol() throws CorruptDataException {
		return new I32(getIntAtOffset(addrinfo._ai_protocolOffset_));
	}

	// I32 ai_protocol
	public IDATAPointer ai_protocolEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(addrinfo._ai_protocolOffset_));
	}

	// I32 ai_socktype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ai_socktypeOffset_", declaredType="I32")
	public IDATA ai_socktype() throws CorruptDataException {
		return new I32(getIntAtOffset(addrinfo._ai_socktypeOffset_));
	}

	// I32 ai_socktype
	public IDATAPointer ai_socktypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(addrinfo._ai_socktypeOffset_));
	}

}
