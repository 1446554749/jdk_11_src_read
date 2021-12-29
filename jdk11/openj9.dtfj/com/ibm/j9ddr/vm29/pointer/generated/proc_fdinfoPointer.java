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
 * Structure: proc_fdinfoPointer
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
 * The generated code will provide getters for all elements in the proc_fdinfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=proc_fdinfo.class)
public class proc_fdinfoPointer extends StructurePointer {

	// NULL
	public static final proc_fdinfoPointer NULL = new proc_fdinfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected proc_fdinfoPointer(long address) {
		super(address);
	}

	public static proc_fdinfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static proc_fdinfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static proc_fdinfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new proc_fdinfoPointer(address);
	}

	public proc_fdinfoPointer add(long count) {
		return proc_fdinfoPointer.cast(address + (proc_fdinfo.SIZEOF * count));
	}

	public proc_fdinfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public proc_fdinfoPointer addOffset(long offset) {
		return proc_fdinfoPointer.cast(address + offset);
	}

	public proc_fdinfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public proc_fdinfoPointer sub(long count) {
		return proc_fdinfoPointer.cast(address - (proc_fdinfo.SIZEOF * count));
	}

	public proc_fdinfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public proc_fdinfoPointer subOffset(long offset) {
		return proc_fdinfoPointer.cast(address - offset);
	}

	public proc_fdinfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public proc_fdinfoPointer untag(long mask) {
		return proc_fdinfoPointer.cast(address & ~mask);
	}

	public proc_fdinfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return proc_fdinfo.SIZEOF;
	}

	// Implementation methods

	// I32 proc_fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_proc_fdOffset_", declaredType="I32")
	public IDATA proc_fd() throws CorruptDataException {
		return new I32(getIntAtOffset(proc_fdinfo._proc_fdOffset_));
	}

	// I32 proc_fd
	public IDATAPointer proc_fdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(proc_fdinfo._proc_fdOffset_));
	}

	// U32 proc_fdtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_proc_fdtypeOffset_", declaredType="U32")
	public UDATA proc_fdtype() throws CorruptDataException {
		return new U32(getIntAtOffset(proc_fdinfo._proc_fdtypeOffset_));
	}

	// U32 proc_fdtype
	public UDATAPointer proc_fdtypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(proc_fdinfo._proc_fdtypeOffset_));
	}

}
