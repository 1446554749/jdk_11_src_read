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
 * Structure: MM_PhysicalSubArenaPointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalSubArenaPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalSubArena.class)
public class MM_PhysicalSubArenaPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_PhysicalSubArenaPointer NULL = new MM_PhysicalSubArenaPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalSubArenaPointer(long address) {
		super(address);
	}

	public static MM_PhysicalSubArenaPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalSubArenaPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalSubArenaPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalSubArenaPointer(address);
	}

	public MM_PhysicalSubArenaPointer add(long count) {
		return MM_PhysicalSubArenaPointer.cast(address + (MM_PhysicalSubArena.SIZEOF * count));
	}

	public MM_PhysicalSubArenaPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalSubArenaPointer addOffset(long offset) {
		return MM_PhysicalSubArenaPointer.cast(address + offset);
	}

	public MM_PhysicalSubArenaPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaPointer sub(long count) {
		return MM_PhysicalSubArenaPointer.cast(address - (MM_PhysicalSubArena.SIZEOF * count));
	}

	public MM_PhysicalSubArenaPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalSubArenaPointer subOffset(long offset) {
		return MM_PhysicalSubArenaPointer.cast(address - offset);
	}

	public MM_PhysicalSubArenaPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaPointer untag(long mask) {
		return MM_PhysicalSubArenaPointer.cast(address & ~mask);
	}

	public MM_PhysicalSubArenaPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalSubArena.SIZEOF;
	}

	// Implementation methods

	// MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_PhysicalSubArena.__heapOffset_));
	}

	// MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArena.__heapOffset_));
	}

	// MM_PhysicalArena* _parent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parentOffset_", declaredType="MM_PhysicalArena*")
	public MM_PhysicalArenaPointer _parent() throws CorruptDataException {
		return MM_PhysicalArenaPointer.cast(getPointerAtOffset(MM_PhysicalSubArena.__parentOffset_));
	}

	// MM_PhysicalArena* _parent
	public PointerPointer _parentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArena.__parentOffset_));
	}

	// bool _resizable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__resizableOffset_", declaredType="bool")
	public boolean _resizable() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArena.__resizableOffset_);
	}

	// bool _resizable
	public BoolPointer _resizableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArena.__resizableOffset_));
	}

	// MM_MemorySubSpace* _subSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _subSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_PhysicalSubArena.__subSpaceOffset_));
	}

	// MM_MemorySubSpace* _subSpace
	public PointerPointer _subSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArena.__subSpaceOffset_));
	}

}
