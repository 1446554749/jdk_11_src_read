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
 * Structure: __darwin_sigaltstackPointer
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
 * The generated code will provide getters for all elements in the __darwin_sigaltstackPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__darwin_sigaltstack.class)
public class __darwin_sigaltstackPointer extends StructurePointer {

	// NULL
	public static final __darwin_sigaltstackPointer NULL = new __darwin_sigaltstackPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __darwin_sigaltstackPointer(long address) {
		super(address);
	}

	public static __darwin_sigaltstackPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __darwin_sigaltstackPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __darwin_sigaltstackPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __darwin_sigaltstackPointer(address);
	}

	public __darwin_sigaltstackPointer add(long count) {
		return __darwin_sigaltstackPointer.cast(address + (__darwin_sigaltstack.SIZEOF * count));
	}

	public __darwin_sigaltstackPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __darwin_sigaltstackPointer addOffset(long offset) {
		return __darwin_sigaltstackPointer.cast(address + offset);
	}

	public __darwin_sigaltstackPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __darwin_sigaltstackPointer sub(long count) {
		return __darwin_sigaltstackPointer.cast(address - (__darwin_sigaltstack.SIZEOF * count));
	}

	public __darwin_sigaltstackPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __darwin_sigaltstackPointer subOffset(long offset) {
		return __darwin_sigaltstackPointer.cast(address - offset);
	}

	public __darwin_sigaltstackPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __darwin_sigaltstackPointer untag(long mask) {
		return __darwin_sigaltstackPointer.cast(address & ~mask);
	}

	public __darwin_sigaltstackPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __darwin_sigaltstack.SIZEOF;
	}

	// Implementation methods

	// I32 ss_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ss_flagsOffset_", declaredType="I32")
	public IDATA ss_flags() throws CorruptDataException {
		return new I32(getIntAtOffset(__darwin_sigaltstack._ss_flagsOffset_));
	}

	// I32 ss_flags
	public IDATAPointer ss_flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__darwin_sigaltstack._ss_flagsOffset_));
	}

	// __darwin_size_t ss_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ss_sizeOffset_", declaredType="__darwin_size_t")
	public UDATA ss_size() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_sigaltstack._ss_sizeOffset_));
	}

	// __darwin_size_t ss_size
	public UDATAPointer ss_sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_sigaltstack._ss_sizeOffset_));
	}

	// void* ss_sp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ss_spOffset_", declaredType="void*")
	public VoidPointer ss_sp() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__darwin_sigaltstack._ss_spOffset_));
	}

	// void* ss_sp
	public PointerPointer ss_spEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_sigaltstack._ss_spOffset_));
	}

}
