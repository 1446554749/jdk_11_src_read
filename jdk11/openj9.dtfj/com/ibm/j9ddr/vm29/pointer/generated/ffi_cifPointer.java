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
 * Structure: ffi_cifPointer
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
 * The generated code will provide getters for all elements in the ffi_cifPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ffi_cif.class)
public class ffi_cifPointer extends StructurePointer {

	// NULL
	public static final ffi_cifPointer NULL = new ffi_cifPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ffi_cifPointer(long address) {
		super(address);
	}

	public static ffi_cifPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ffi_cifPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ffi_cifPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ffi_cifPointer(address);
	}

	public ffi_cifPointer add(long count) {
		return ffi_cifPointer.cast(address + (ffi_cif.SIZEOF * count));
	}

	public ffi_cifPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ffi_cifPointer addOffset(long offset) {
		return ffi_cifPointer.cast(address + offset);
	}

	public ffi_cifPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ffi_cifPointer sub(long count) {
		return ffi_cifPointer.cast(address - (ffi_cif.SIZEOF * count));
	}

	public ffi_cifPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ffi_cifPointer subOffset(long offset) {
		return ffi_cifPointer.cast(address - offset);
	}

	public ffi_cifPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ffi_cifPointer untag(long mask) {
		return ffi_cifPointer.cast(address & ~mask);
	}

	public ffi_cifPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ffi_cif.SIZEOF;
	}

	// Implementation methods

	// ffi_abi abi
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_abiOffset_", declaredType="ffi_abi")
	public long abi() throws CorruptDataException {
		if (ffi_abi.SIZEOF == 1) {
			return getByteAtOffset(ffi_cif._abiOffset_);
		} else if (ffi_abi.SIZEOF == 2) {
			return getShortAtOffset(ffi_cif._abiOffset_);
		} else if (ffi_abi.SIZEOF == 4) {
			return getIntAtOffset(ffi_cif._abiOffset_);
		} else if (ffi_abi.SIZEOF == 8) {
			return getLongAtOffset(ffi_cif._abiOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ffi_abi abi
	public EnumPointer abiEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ffi_cif._abiOffset_), ffi_abi.class);
	}

	// void** arg_types
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arg_typesOffset_", declaredType="void**")
	public PointerPointer arg_types() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(ffi_cif._arg_typesOffset_));
	}

	// void** arg_types
	public PointerPointer arg_typesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ffi_cif._arg_typesOffset_));
	}

	// U32 bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytesOffset_", declaredType="U32")
	public UDATA bytes() throws CorruptDataException {
		return new U32(getIntAtOffset(ffi_cif._bytesOffset_));
	}

	// U32 bytes
	public UDATAPointer bytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ffi_cif._bytesOffset_));
	}

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(ffi_cif._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ffi_cif._flagsOffset_));
	}

	// U32 nargs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nargsOffset_", declaredType="U32")
	public UDATA nargs() throws CorruptDataException {
		return new U32(getIntAtOffset(ffi_cif._nargsOffset_));
	}

	// U32 nargs
	public UDATAPointer nargsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ffi_cif._nargsOffset_));
	}

	// ffi_type* rtype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rtypeOffset_", declaredType="ffi_type*")
	public _ffi_typePointer rtype() throws CorruptDataException {
		return _ffi_typePointer.cast(getPointerAtOffset(ffi_cif._rtypeOffset_));
	}

	// ffi_type* rtype
	public PointerPointer rtypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ffi_cif._rtypeOffset_));
	}

}
