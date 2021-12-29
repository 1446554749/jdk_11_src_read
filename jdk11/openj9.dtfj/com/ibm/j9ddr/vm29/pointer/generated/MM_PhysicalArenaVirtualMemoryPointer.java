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
 * Structure: MM_PhysicalArenaVirtualMemoryPointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalArenaVirtualMemoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalArenaVirtualMemory.class)
public class MM_PhysicalArenaVirtualMemoryPointer extends MM_PhysicalArenaPointer {

	// NULL
	public static final MM_PhysicalArenaVirtualMemoryPointer NULL = new MM_PhysicalArenaVirtualMemoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalArenaVirtualMemoryPointer(long address) {
		super(address);
	}

	public static MM_PhysicalArenaVirtualMemoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalArenaVirtualMemoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalArenaVirtualMemoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalArenaVirtualMemoryPointer(address);
	}

	public MM_PhysicalArenaVirtualMemoryPointer add(long count) {
		return MM_PhysicalArenaVirtualMemoryPointer.cast(address + (MM_PhysicalArenaVirtualMemory.SIZEOF * count));
	}

	public MM_PhysicalArenaVirtualMemoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalArenaVirtualMemoryPointer addOffset(long offset) {
		return MM_PhysicalArenaVirtualMemoryPointer.cast(address + offset);
	}

	public MM_PhysicalArenaVirtualMemoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalArenaVirtualMemoryPointer sub(long count) {
		return MM_PhysicalArenaVirtualMemoryPointer.cast(address - (MM_PhysicalArenaVirtualMemory.SIZEOF * count));
	}

	public MM_PhysicalArenaVirtualMemoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalArenaVirtualMemoryPointer subOffset(long offset) {
		return MM_PhysicalArenaVirtualMemoryPointer.cast(address - offset);
	}

	public MM_PhysicalArenaVirtualMemoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalArenaVirtualMemoryPointer untag(long mask) {
		return MM_PhysicalArenaVirtualMemoryPointer.cast(address & ~mask);
	}

	public MM_PhysicalArenaVirtualMemoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalArenaVirtualMemory.SIZEOF;
	}

	// Implementation methods

	// MM_PhysicalSubArenaVirtualMemory* _physicalSubArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__physicalSubArenaOffset_", declaredType="MM_PhysicalSubArenaVirtualMemory*")
	public MM_PhysicalSubArenaVirtualMemoryPointer _physicalSubArena() throws CorruptDataException {
		return MM_PhysicalSubArenaVirtualMemoryPointer.cast(getPointerAtOffset(MM_PhysicalArenaVirtualMemory.__physicalSubArenaOffset_));
	}

	// MM_PhysicalSubArenaVirtualMemory* _physicalSubArena
	public PointerPointer _physicalSubArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalArenaVirtualMemory.__physicalSubArenaOffset_));
	}

}
