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
 * Structure: MM_MemoryPoolSegregatedPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolSegregated.class)
public class MM_MemoryPoolSegregatedPointer extends MM_MemoryPoolPointer {

	// NULL
	public static final MM_MemoryPoolSegregatedPointer NULL = new MM_MemoryPoolSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolSegregatedPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolSegregatedPointer(address);
	}

	public MM_MemoryPoolSegregatedPointer add(long count) {
		return MM_MemoryPoolSegregatedPointer.cast(address + (MM_MemoryPoolSegregated.SIZEOF * count));
	}

	public MM_MemoryPoolSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolSegregatedPointer addOffset(long offset) {
		return MM_MemoryPoolSegregatedPointer.cast(address + offset);
	}

	public MM_MemoryPoolSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolSegregatedPointer sub(long count) {
		return MM_MemoryPoolSegregatedPointer.cast(address - (MM_MemoryPoolSegregated.SIZEOF * count));
	}

	public MM_MemoryPoolSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolSegregatedPointer subOffset(long offset) {
		return MM_MemoryPoolSegregatedPointer.cast(address - offset);
	}

	public MM_MemoryPoolSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolSegregatedPointer untag(long mask) {
		return MM_MemoryPoolSegregatedPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolSegregated.SIZEOF;
	}

	// Implementation methods

	// volatile U64 _bytesInUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesInUseOffset_", declaredType="volatile U64")
	public UDATA _bytesInUse() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolSegregated.__bytesInUseOffset_));
	}

	// volatile U64 _bytesInUse
	public UDATAPointer _bytesInUseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolSegregated.__bytesInUseOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_MemoryPoolSegregated.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSegregated.__extensionsOffset_));
	}

	// MM_GlobalAllocationManagerSegregated* _globalAllocationManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalAllocationManagerOffset_", declaredType="MM_GlobalAllocationManagerSegregated*")
	public MM_GlobalAllocationManagerSegregatedPointer _globalAllocationManager() throws CorruptDataException {
		return MM_GlobalAllocationManagerSegregatedPointer.cast(getPointerAtOffset(MM_MemoryPoolSegregated.__globalAllocationManagerOffset_));
	}

	// MM_GlobalAllocationManagerSegregated* _globalAllocationManager
	public PointerPointer _globalAllocationManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSegregated.__globalAllocationManagerOffset_));
	}

	// MM_RegionPoolSegregated* _regionPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionPoolOffset_", declaredType="MM_RegionPoolSegregated*")
	public MM_RegionPoolSegregatedPointer _regionPool() throws CorruptDataException {
		return MM_RegionPoolSegregatedPointer.cast(getPointerAtOffset(MM_MemoryPoolSegregated.__regionPoolOffset_));
	}

	// MM_RegionPoolSegregated* _regionPool
	public PointerPointer _regionPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolSegregated.__regionPoolOffset_));
	}

}
