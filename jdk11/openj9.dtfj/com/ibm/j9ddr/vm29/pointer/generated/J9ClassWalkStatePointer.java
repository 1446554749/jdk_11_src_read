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
 * Structure: J9ClassWalkStatePointer
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
 * The generated code will provide getters for all elements in the J9ClassWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClassWalkState.class)
public class J9ClassWalkStatePointer extends StructurePointer {

	// NULL
	public static final J9ClassWalkStatePointer NULL = new J9ClassWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClassWalkStatePointer(long address) {
		super(address);
	}

	public static J9ClassWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClassWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClassWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClassWalkStatePointer(address);
	}

	public J9ClassWalkStatePointer add(long count) {
		return J9ClassWalkStatePointer.cast(address + (J9ClassWalkState.SIZEOF * count));
	}

	public J9ClassWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClassWalkStatePointer addOffset(long offset) {
		return J9ClassWalkStatePointer.cast(address + offset);
	}

	public J9ClassWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClassWalkStatePointer sub(long count) {
		return J9ClassWalkStatePointer.cast(address - (J9ClassWalkState.SIZEOF * count));
	}

	public J9ClassWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClassWalkStatePointer subOffset(long offset) {
		return J9ClassWalkStatePointer.cast(address - offset);
	}

	public J9ClassWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClassWalkStatePointer untag(long mask) {
		return J9ClassWalkStatePointer.cast(address & ~mask);
	}

	public J9ClassWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClassWalkState.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ClassWalkState._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassWalkState._classLoaderOffset_));
	}

	// U8* heapPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapPtrOffset_", declaredType="U8*")
	public U8Pointer heapPtr() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ClassWalkState._heapPtrOffset_));
	}

	// U8* heapPtr
	public PointerPointer heapPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassWalkState._heapPtrOffset_));
	}

	// J9MemorySegment* nextSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer nextSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9ClassWalkState._nextSegmentOffset_));
	}

	// J9MemorySegment* nextSegment
	public PointerPointer nextSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassWalkState._nextSegmentOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9ClassWalkState._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassWalkState._vmOffset_));
	}

}
