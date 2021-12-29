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
 * Structure: in_addrPointer
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
 * The generated code will provide getters for all elements in the in_addrPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=in_addr.class)
public class in_addrPointer extends StructurePointer {

	// NULL
	public static final in_addrPointer NULL = new in_addrPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected in_addrPointer(long address) {
		super(address);
	}

	public static in_addrPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static in_addrPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static in_addrPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new in_addrPointer(address);
	}

	public in_addrPointer add(long count) {
		return in_addrPointer.cast(address + (in_addr.SIZEOF * count));
	}

	public in_addrPointer add(Scalar count) {
		return add(count.longValue());
	}

	public in_addrPointer addOffset(long offset) {
		return in_addrPointer.cast(address + offset);
	}

	public in_addrPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public in_addrPointer sub(long count) {
		return in_addrPointer.cast(address - (in_addr.SIZEOF * count));
	}

	public in_addrPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public in_addrPointer subOffset(long offset) {
		return in_addrPointer.cast(address - offset);
	}

	public in_addrPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public in_addrPointer untag(long mask) {
		return in_addrPointer.cast(address & ~mask);
	}

	public in_addrPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return in_addr.SIZEOF;
	}

	// Implementation methods

	// in_addr_t s_addr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_s_addrOffset_", declaredType="in_addr_t")
	public UDATA s_addr() throws CorruptDataException {
		return new U32(getIntAtOffset(in_addr._s_addrOffset_));
	}

	// in_addr_t s_addr
	public UDATAPointer s_addrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(in_addr._s_addrOffset_));
	}

}
