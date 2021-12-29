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
 * Structure: J9ModronThreadLocalHeapPointer
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
 * The generated code will provide getters for all elements in the J9ModronThreadLocalHeapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ModronThreadLocalHeap.class)
public class J9ModronThreadLocalHeapPointer extends StructurePointer {

	// NULL
	public static final J9ModronThreadLocalHeapPointer NULL = new J9ModronThreadLocalHeapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ModronThreadLocalHeapPointer(long address) {
		super(address);
	}

	public static J9ModronThreadLocalHeapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ModronThreadLocalHeapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ModronThreadLocalHeapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ModronThreadLocalHeapPointer(address);
	}

	public J9ModronThreadLocalHeapPointer add(long count) {
		return J9ModronThreadLocalHeapPointer.cast(address + (J9ModronThreadLocalHeap.SIZEOF * count));
	}

	public J9ModronThreadLocalHeapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ModronThreadLocalHeapPointer addOffset(long offset) {
		return J9ModronThreadLocalHeapPointer.cast(address + offset);
	}

	public J9ModronThreadLocalHeapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ModronThreadLocalHeapPointer sub(long count) {
		return J9ModronThreadLocalHeapPointer.cast(address - (J9ModronThreadLocalHeap.SIZEOF * count));
	}

	public J9ModronThreadLocalHeapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ModronThreadLocalHeapPointer subOffset(long offset) {
		return J9ModronThreadLocalHeapPointer.cast(address - offset);
	}

	public J9ModronThreadLocalHeapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ModronThreadLocalHeapPointer untag(long mask) {
		return J9ModronThreadLocalHeapPointer.cast(address & ~mask);
	}

	public J9ModronThreadLocalHeapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ModronThreadLocalHeap.SIZEOF;
	}

	// Implementation methods

	// U8* heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapBaseOffset_", declaredType="U8*")
	public U8Pointer heapBase() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ModronThreadLocalHeap._heapBaseOffset_));
	}

	// U8* heapBase
	public PointerPointer heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._heapBaseOffset_));
	}

	// void* memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryPoolOffset_", declaredType="void*")
	public VoidPointer memoryPool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ModronThreadLocalHeap._memoryPoolOffset_));
	}

	// void* memoryPool
	public PointerPointer memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._memoryPoolOffset_));
	}

	// void* memorySubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memorySubSpaceOffset_", declaredType="void*")
	public VoidPointer memorySubSpace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ModronThreadLocalHeap._memorySubSpaceOffset_));
	}

	// void* memorySubSpace
	public PointerPointer memorySubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._memorySubSpaceOffset_));
	}

	// UDATA objectFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectFlagsOffset_", declaredType="UDATA")
	public UDATA objectFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9ModronThreadLocalHeap._objectFlagsOffset_);
	}

	// UDATA objectFlags
	public UDATAPointer objectFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._objectFlagsOffset_));
	}

	// U8* realHeapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_realHeapTopOffset_", declaredType="U8*")
	public U8Pointer realHeapTop() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ModronThreadLocalHeap._realHeapTopOffset_));
	}

	// U8* realHeapTop
	public PointerPointer realHeapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._realHeapTopOffset_));
	}

	// UDATA refreshSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_refreshSizeOffset_", declaredType="UDATA")
	public UDATA refreshSize() throws CorruptDataException {
		return getUDATAAtOffset(J9ModronThreadLocalHeap._refreshSizeOffset_);
	}

	// UDATA refreshSize
	public UDATAPointer refreshSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ModronThreadLocalHeap._refreshSizeOffset_));
	}

}
