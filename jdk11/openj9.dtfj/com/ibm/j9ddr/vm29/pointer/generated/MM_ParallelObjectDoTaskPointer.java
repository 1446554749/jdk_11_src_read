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
 * Structure: MM_ParallelObjectDoTaskPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelObjectDoTaskPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelObjectDoTask.class)
public class MM_ParallelObjectDoTaskPointer extends MM_ParallelTaskPointer {

	// NULL
	public static final MM_ParallelObjectDoTaskPointer NULL = new MM_ParallelObjectDoTaskPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelObjectDoTaskPointer(long address) {
		super(address);
	}

	public static MM_ParallelObjectDoTaskPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelObjectDoTaskPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelObjectDoTaskPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelObjectDoTaskPointer(address);
	}

	public MM_ParallelObjectDoTaskPointer add(long count) {
		return MM_ParallelObjectDoTaskPointer.cast(address + (MM_ParallelObjectDoTask.SIZEOF * count));
	}

	public MM_ParallelObjectDoTaskPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelObjectDoTaskPointer addOffset(long offset) {
		return MM_ParallelObjectDoTaskPointer.cast(address + offset);
	}

	public MM_ParallelObjectDoTaskPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelObjectDoTaskPointer sub(long count) {
		return MM_ParallelObjectDoTaskPointer.cast(address - (MM_ParallelObjectDoTask.SIZEOF * count));
	}

	public MM_ParallelObjectDoTaskPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelObjectDoTaskPointer subOffset(long offset) {
		return MM_ParallelObjectDoTaskPointer.cast(address - offset);
	}

	public MM_ParallelObjectDoTaskPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelObjectDoTaskPointer untag(long mask) {
		return MM_ParallelObjectDoTaskPointer.cast(address & ~mask);
	}

	public MM_ParallelObjectDoTaskPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelObjectDoTask.SIZEOF;
	}

	// Implementation methods

	// MM_HeapWalkerObjectFunc _function
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__functionOffset_", declaredType="MM_HeapWalkerObjectFunc")
	public VoidPointer _function() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelObjectDoTask.__functionOffset_));
	}

	// MM_HeapWalkerObjectFunc _function
	public PointerPointer _functionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelObjectDoTask.__functionOffset_));
	}

	// MM_ParallelHeapWalker* _heapWalker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapWalkerOffset_", declaredType="MM_ParallelHeapWalker*")
	public MM_ParallelHeapWalkerPointer _heapWalker() throws CorruptDataException {
		return MM_ParallelHeapWalkerPointer.cast(getPointerAtOffset(MM_ParallelObjectDoTask.__heapWalkerOffset_));
	}

	// MM_ParallelHeapWalker* _heapWalker
	public PointerPointer _heapWalkerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelObjectDoTask.__heapWalkerOffset_));
	}

	// void* _userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__userDataOffset_", declaredType="void*")
	public VoidPointer _userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ParallelObjectDoTask.__userDataOffset_));
	}

	// void* _userData
	public PointerPointer _userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelObjectDoTask.__userDataOffset_));
	}

	// U64 _walkFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__walkFlagsOffset_", declaredType="U64")
	public UDATA _walkFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ParallelObjectDoTask.__walkFlagsOffset_));
	}

	// U64 _walkFlags
	public UDATAPointer _walkFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ParallelObjectDoTask.__walkFlagsOffset_));
	}

}
