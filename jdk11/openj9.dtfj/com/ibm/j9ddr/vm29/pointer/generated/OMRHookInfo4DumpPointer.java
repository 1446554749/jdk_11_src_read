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
 * Structure: OMRHookInfo4DumpPointer
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
 * The generated code will provide getters for all elements in the OMRHookInfo4DumpPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRHookInfo4Dump.class)
public class OMRHookInfo4DumpPointer extends StructurePointer {

	// NULL
	public static final OMRHookInfo4DumpPointer NULL = new OMRHookInfo4DumpPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRHookInfo4DumpPointer(long address) {
		super(address);
	}

	public static OMRHookInfo4DumpPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRHookInfo4DumpPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRHookInfo4DumpPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRHookInfo4DumpPointer(address);
	}

	public OMRHookInfo4DumpPointer add(long count) {
		return OMRHookInfo4DumpPointer.cast(address + (OMRHookInfo4Dump.SIZEOF * count));
	}

	public OMRHookInfo4DumpPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRHookInfo4DumpPointer addOffset(long offset) {
		return OMRHookInfo4DumpPointer.cast(address + offset);
	}

	public OMRHookInfo4DumpPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRHookInfo4DumpPointer sub(long count) {
		return OMRHookInfo4DumpPointer.cast(address - (OMRHookInfo4Dump.SIZEOF * count));
	}

	public OMRHookInfo4DumpPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRHookInfo4DumpPointer subOffset(long offset) {
		return OMRHookInfo4DumpPointer.cast(address - offset);
	}

	public OMRHookInfo4DumpPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRHookInfo4DumpPointer untag(long mask) {
		return OMRHookInfo4DumpPointer.cast(address & ~mask);
	}

	public OMRHookInfo4DumpPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRHookInfo4Dump.SIZEOF;
	}

	// Implementation methods

	// const U8* callsite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callsiteOffset_", declaredType="const U8*")
	public U8Pointer callsite() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMRHookInfo4Dump._callsiteOffset_));
	}

	// const U8* callsite
	public PointerPointer callsiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRHookInfo4Dump._callsiteOffset_));
	}

	// U64 duration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_durationOffset_", declaredType="U64")
	public UDATA duration() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRHookInfo4Dump._durationOffset_));
	}

	// U64 duration
	public UDATAPointer durationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRHookInfo4Dump._durationOffset_));
	}

	// void* func_ptr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_func_ptrOffset_", declaredType="void*")
	public VoidPointer func_ptr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRHookInfo4Dump._func_ptrOffset_));
	}

	// void* func_ptr
	public PointerPointer func_ptrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRHookInfo4Dump._func_ptrOffset_));
	}

	// U64 startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTimeOffset_", declaredType="U64")
	public UDATA startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRHookInfo4Dump._startTimeOffset_));
	}

	// U64 startTime
	public UDATAPointer startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRHookInfo4Dump._startTimeOffset_));
	}

}
