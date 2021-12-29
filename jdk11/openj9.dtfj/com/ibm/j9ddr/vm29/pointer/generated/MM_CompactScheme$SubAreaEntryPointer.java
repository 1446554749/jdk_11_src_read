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
 * Structure: MM_CompactScheme$SubAreaEntryPointer
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
 * The generated code will provide getters for all elements in the MM_CompactScheme$SubAreaEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompactScheme$SubAreaEntry.class)
public class MM_CompactScheme$SubAreaEntryPointer extends StructurePointer {

	// NULL
	public static final MM_CompactScheme$SubAreaEntryPointer NULL = new MM_CompactScheme$SubAreaEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompactScheme$SubAreaEntryPointer(long address) {
		super(address);
	}

	public static MM_CompactScheme$SubAreaEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompactScheme$SubAreaEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompactScheme$SubAreaEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompactScheme$SubAreaEntryPointer(address);
	}

	public MM_CompactScheme$SubAreaEntryPointer add(long count) {
		return MM_CompactScheme$SubAreaEntryPointer.cast(address + (MM_CompactScheme$SubAreaEntry.SIZEOF * count));
	}

	public MM_CompactScheme$SubAreaEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompactScheme$SubAreaEntryPointer addOffset(long offset) {
		return MM_CompactScheme$SubAreaEntryPointer.cast(address + offset);
	}

	public MM_CompactScheme$SubAreaEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompactScheme$SubAreaEntryPointer sub(long count) {
		return MM_CompactScheme$SubAreaEntryPointer.cast(address - (MM_CompactScheme$SubAreaEntry.SIZEOF * count));
	}

	public MM_CompactScheme$SubAreaEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompactScheme$SubAreaEntryPointer subOffset(long offset) {
		return MM_CompactScheme$SubAreaEntryPointer.cast(address - offset);
	}

	public MM_CompactScheme$SubAreaEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompactScheme$SubAreaEntryPointer untag(long mask) {
		return MM_CompactScheme$SubAreaEntryPointer.cast(address & ~mask);
	}

	public MM_CompactScheme$SubAreaEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompactScheme$SubAreaEntry.SIZEOF;
	}

	// Implementation methods

	// volatile U64 currentAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentActionOffset_", declaredType="volatile U64")
	public UDATA currentAction() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactScheme$SubAreaEntry._currentActionOffset_));
	}

	// volatile U64 currentAction
	public UDATAPointer currentActionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactScheme$SubAreaEntry._currentActionOffset_));
	}

	// omrobjectptr_t firstObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstObjectOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer firstObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(MM_CompactScheme$SubAreaEntry._firstObjectOffset_));
	}

	// omrobjectptr_t firstObject
	public PointerPointer firstObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme$SubAreaEntry._firstObjectOffset_));
	}

	// omrobjectptr_t freeChunk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeChunkOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer freeChunk() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(MM_CompactScheme$SubAreaEntry._freeChunkOffset_));
	}

	// omrobjectptr_t freeChunk
	public PointerPointer freeChunkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme$SubAreaEntry._freeChunkOffset_));
	}

	// MM_MemoryPool* memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryPoolOffset_", declaredType="MM_MemoryPool*")
	public MM_MemoryPoolPointer memoryPool() throws CorruptDataException {
		return MM_MemoryPoolPointer.cast(getPointerAtOffset(MM_CompactScheme$SubAreaEntry._memoryPoolOffset_));
	}

	// MM_MemoryPool* memoryPool
	public PointerPointer memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme$SubAreaEntry._memoryPoolOffset_));
	}

	// volatile U64 state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stateOffset_", declaredType="volatile U64")
	public UDATA state() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactScheme$SubAreaEntry._stateOffset_));
	}

	// volatile U64 state
	public UDATAPointer stateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactScheme$SubAreaEntry._stateOffset_));
	}

}
