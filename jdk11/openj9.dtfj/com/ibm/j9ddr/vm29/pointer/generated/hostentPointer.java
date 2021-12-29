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
 * Structure: hostentPointer
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
 * The generated code will provide getters for all elements in the hostentPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=hostent.class)
public class hostentPointer extends StructurePointer {

	// NULL
	public static final hostentPointer NULL = new hostentPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected hostentPointer(long address) {
		super(address);
	}

	public static hostentPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static hostentPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static hostentPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new hostentPointer(address);
	}

	public hostentPointer add(long count) {
		return hostentPointer.cast(address + (hostent.SIZEOF * count));
	}

	public hostentPointer add(Scalar count) {
		return add(count.longValue());
	}

	public hostentPointer addOffset(long offset) {
		return hostentPointer.cast(address + offset);
	}

	public hostentPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public hostentPointer sub(long count) {
		return hostentPointer.cast(address - (hostent.SIZEOF * count));
	}

	public hostentPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public hostentPointer subOffset(long offset) {
		return hostentPointer.cast(address - offset);
	}

	public hostentPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public hostentPointer untag(long mask) {
		return hostentPointer.cast(address & ~mask);
	}

	public hostentPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return hostent.SIZEOF;
	}

	// Implementation methods

	// void** h_addr_list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_h_addr_listOffset_", declaredType="void**")
	public PointerPointer h_addr_list() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(hostent._h_addr_listOffset_));
	}

	// void** h_addr_list
	public PointerPointer h_addr_listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(hostent._h_addr_listOffset_));
	}

	// I32 h_addrtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_h_addrtypeOffset_", declaredType="I32")
	public IDATA h_addrtype() throws CorruptDataException {
		return new I32(getIntAtOffset(hostent._h_addrtypeOffset_));
	}

	// I32 h_addrtype
	public IDATAPointer h_addrtypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(hostent._h_addrtypeOffset_));
	}

	// void** h_aliases
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_h_aliasesOffset_", declaredType="void**")
	public PointerPointer h_aliases() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(hostent._h_aliasesOffset_));
	}

	// void** h_aliases
	public PointerPointer h_aliasesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(hostent._h_aliasesOffset_));
	}

	// I32 h_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_h_lengthOffset_", declaredType="I32")
	public IDATA h_length() throws CorruptDataException {
		return new I32(getIntAtOffset(hostent._h_lengthOffset_));
	}

	// I32 h_length
	public IDATAPointer h_lengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(hostent._h_lengthOffset_));
	}

	// U8* h_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_h_nameOffset_", declaredType="U8*")
	public U8Pointer h_name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(hostent._h_nameOffset_));
	}

	// U8* h_name
	public PointerPointer h_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(hostent._h_nameOffset_));
	}

}
