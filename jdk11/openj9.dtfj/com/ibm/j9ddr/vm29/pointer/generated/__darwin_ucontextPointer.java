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
 * Structure: __darwin_ucontextPointer
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
 * The generated code will provide getters for all elements in the __darwin_ucontextPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__darwin_ucontext.class)
public class __darwin_ucontextPointer extends StructurePointer {

	// NULL
	public static final __darwin_ucontextPointer NULL = new __darwin_ucontextPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __darwin_ucontextPointer(long address) {
		super(address);
	}

	public static __darwin_ucontextPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __darwin_ucontextPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __darwin_ucontextPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __darwin_ucontextPointer(address);
	}

	public __darwin_ucontextPointer add(long count) {
		return __darwin_ucontextPointer.cast(address + (__darwin_ucontext.SIZEOF * count));
	}

	public __darwin_ucontextPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __darwin_ucontextPointer addOffset(long offset) {
		return __darwin_ucontextPointer.cast(address + offset);
	}

	public __darwin_ucontextPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __darwin_ucontextPointer sub(long count) {
		return __darwin_ucontextPointer.cast(address - (__darwin_ucontext.SIZEOF * count));
	}

	public __darwin_ucontextPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __darwin_ucontextPointer subOffset(long offset) {
		return __darwin_ucontextPointer.cast(address - offset);
	}

	public __darwin_ucontextPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __darwin_ucontextPointer untag(long mask) {
		return __darwin_ucontextPointer.cast(address & ~mask);
	}

	public __darwin_ucontextPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __darwin_ucontext.SIZEOF;
	}

	// Implementation methods

	// __darwin_mcontext64 __mcontext_data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___mcontext_dataOffset_", declaredType="__darwin_mcontext64")
	public __darwin_mcontext64Pointer __mcontext_data() throws CorruptDataException {
		return __darwin_mcontext64Pointer.cast(nonNullFieldEA(__darwin_ucontext.___mcontext_dataOffset_));
	}

	// __darwin_mcontext64 __mcontext_data
	public PointerPointer __mcontext_dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_ucontext.___mcontext_dataOffset_));
	}

	// __darwin_ucontext* uc_link
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_linkOffset_", declaredType="__darwin_ucontext*")
	public __darwin_ucontextPointer uc_link() throws CorruptDataException {
		return __darwin_ucontextPointer.cast(getPointerAtOffset(__darwin_ucontext._uc_linkOffset_));
	}

	// __darwin_ucontext* uc_link
	public PointerPointer uc_linkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_linkOffset_));
	}

	// __darwin_mcontext64* uc_mcontext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_mcontextOffset_", declaredType="__darwin_mcontext64*")
	public __darwin_mcontext64Pointer uc_mcontext() throws CorruptDataException {
		return __darwin_mcontext64Pointer.cast(getPointerAtOffset(__darwin_ucontext._uc_mcontextOffset_));
	}

	// __darwin_mcontext64* uc_mcontext
	public PointerPointer uc_mcontextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_mcontextOffset_));
	}

	// __darwin_size_t uc_mcsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_mcsizeOffset_", declaredType="__darwin_size_t")
	public UDATA uc_mcsize() throws CorruptDataException {
		return new U64(getLongAtOffset(__darwin_ucontext._uc_mcsizeOffset_));
	}

	// __darwin_size_t uc_mcsize
	public UDATAPointer uc_mcsizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_mcsizeOffset_));
	}

	// I32 uc_onstack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_onstackOffset_", declaredType="I32")
	public IDATA uc_onstack() throws CorruptDataException {
		return new I32(getIntAtOffset(__darwin_ucontext._uc_onstackOffset_));
	}

	// I32 uc_onstack
	public IDATAPointer uc_onstackEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_onstackOffset_));
	}

	// __darwin_sigset_t uc_sigmask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_sigmaskOffset_", declaredType="__darwin_sigset_t")
	public UDATA uc_sigmask() throws CorruptDataException {
		return new U32(getIntAtOffset(__darwin_ucontext._uc_sigmaskOffset_));
	}

	// __darwin_sigset_t uc_sigmask
	public UDATAPointer uc_sigmaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_sigmaskOffset_));
	}

	// __darwin_sigaltstack uc_stack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uc_stackOffset_", declaredType="__darwin_sigaltstack")
	public __darwin_sigaltstackPointer uc_stack() throws CorruptDataException {
		return __darwin_sigaltstackPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_stackOffset_));
	}

	// __darwin_sigaltstack uc_stack
	public PointerPointer uc_stackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__darwin_ucontext._uc_stackOffset_));
	}

}
