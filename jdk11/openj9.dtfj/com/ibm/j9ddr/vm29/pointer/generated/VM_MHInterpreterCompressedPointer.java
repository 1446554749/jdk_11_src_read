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
 * Structure: VM_MHInterpreterCompressedPointer
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
 * The generated code will provide getters for all elements in the VM_MHInterpreterCompressedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VM_MHInterpreterCompressed.class)
public class VM_MHInterpreterCompressedPointer extends StructurePointer {

	// NULL
	public static final VM_MHInterpreterCompressedPointer NULL = new VM_MHInterpreterCompressedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VM_MHInterpreterCompressedPointer(long address) {
		super(address);
	}

	public static VM_MHInterpreterCompressedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VM_MHInterpreterCompressedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VM_MHInterpreterCompressedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VM_MHInterpreterCompressedPointer(address);
	}

	public VM_MHInterpreterCompressedPointer add(long count) {
		return VM_MHInterpreterCompressedPointer.cast(address + (VM_MHInterpreterCompressed.SIZEOF * count));
	}

	public VM_MHInterpreterCompressedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public VM_MHInterpreterCompressedPointer addOffset(long offset) {
		return VM_MHInterpreterCompressedPointer.cast(address + offset);
	}

	public VM_MHInterpreterCompressedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VM_MHInterpreterCompressedPointer sub(long count) {
		return VM_MHInterpreterCompressedPointer.cast(address - (VM_MHInterpreterCompressed.SIZEOF * count));
	}

	public VM_MHInterpreterCompressedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VM_MHInterpreterCompressedPointer subOffset(long offset) {
		return VM_MHInterpreterCompressedPointer.cast(address - offset);
	}

	public VM_MHInterpreterCompressedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VM_MHInterpreterCompressedPointer untag(long mask) {
		return VM_MHInterpreterCompressedPointer.cast(address & ~mask);
	}

	public VM_MHInterpreterCompressedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VM_MHInterpreterCompressed.SIZEOF;
	}

	// Implementation methods

	// const J9VMThread* _currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentThreadOffset_", declaredType="const J9VMThread*")
	public J9VMThreadPointer _currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(VM_MHInterpreterCompressed.__currentThreadOffset_));
	}

	// const J9VMThread* _currentThread
	public PointerPointer _currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VM_MHInterpreterCompressed.__currentThreadOffset_));
	}

	// const MM_ObjectAccessBarrierAPICompressed* _objectAccessBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAccessBarrierOffset_", declaredType="const MM_ObjectAccessBarrierAPICompressed*")
	public MM_ObjectAccessBarrierAPICompressedPointer _objectAccessBarrier() throws CorruptDataException {
		return MM_ObjectAccessBarrierAPICompressedPointer.cast(getPointerAtOffset(VM_MHInterpreterCompressed.__objectAccessBarrierOffset_));
	}

	// const MM_ObjectAccessBarrierAPICompressed* _objectAccessBarrier
	public PointerPointer _objectAccessBarrierEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VM_MHInterpreterCompressed.__objectAccessBarrierOffset_));
	}

	// const MM_ObjectAllocationAPICompressed* _objectAllocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAllocateOffset_", declaredType="const MM_ObjectAllocationAPICompressed*")
	public MM_ObjectAllocationAPICompressedPointer _objectAllocate() throws CorruptDataException {
		return MM_ObjectAllocationAPICompressedPointer.cast(getPointerAtOffset(VM_MHInterpreterCompressed.__objectAllocateOffset_));
	}

	// const MM_ObjectAllocationAPICompressed* _objectAllocate
	public PointerPointer _objectAllocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VM_MHInterpreterCompressed.__objectAllocateOffset_));
	}

	// const J9JavaVM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="const J9JavaVM*")
	public J9JavaVMPointer _vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(VM_MHInterpreterCompressed.__vmOffset_));
	}

	// const J9JavaVM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VM_MHInterpreterCompressed.__vmOffset_));
	}

}
