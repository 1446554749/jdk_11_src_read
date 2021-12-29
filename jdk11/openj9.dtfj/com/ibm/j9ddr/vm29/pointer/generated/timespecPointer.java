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
 * Structure: timespecPointer
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
 * The generated code will provide getters for all elements in the timespecPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=timespec.class)
public class timespecPointer extends StructurePointer {

	// NULL
	public static final timespecPointer NULL = new timespecPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected timespecPointer(long address) {
		super(address);
	}

	public static timespecPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static timespecPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static timespecPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new timespecPointer(address);
	}

	public timespecPointer add(long count) {
		return timespecPointer.cast(address + (timespec.SIZEOF * count));
	}

	public timespecPointer add(Scalar count) {
		return add(count.longValue());
	}

	public timespecPointer addOffset(long offset) {
		return timespecPointer.cast(address + offset);
	}

	public timespecPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public timespecPointer sub(long count) {
		return timespecPointer.cast(address - (timespec.SIZEOF * count));
	}

	public timespecPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public timespecPointer subOffset(long offset) {
		return timespecPointer.cast(address - offset);
	}

	public timespecPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public timespecPointer untag(long mask) {
		return timespecPointer.cast(address & ~mask);
	}

	public timespecPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return timespec.SIZEOF;
	}

	// Implementation methods

	// I64 tv_nsec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tv_nsecOffset_", declaredType="I64")
	public IDATA tv_nsec() throws CorruptDataException {
		return new I64(getLongAtOffset(timespec._tv_nsecOffset_));
	}

	// I64 tv_nsec
	public IDATAPointer tv_nsecEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(timespec._tv_nsecOffset_));
	}

	// __darwin_time_t tv_sec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tv_secOffset_", declaredType="__darwin_time_t")
	public IDATA tv_sec() throws CorruptDataException {
		return new I64(getLongAtOffset(timespec._tv_secOffset_));
	}

	// __darwin_time_t tv_sec
	public IDATAPointer tv_secEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(timespec._tv_secOffset_));
	}

}
