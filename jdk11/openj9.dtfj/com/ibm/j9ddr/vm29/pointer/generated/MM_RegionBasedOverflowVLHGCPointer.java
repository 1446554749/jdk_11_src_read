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
 * Structure: MM_RegionBasedOverflowVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_RegionBasedOverflowVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RegionBasedOverflowVLHGC.class)
public class MM_RegionBasedOverflowVLHGCPointer extends MM_WorkPacketOverflowPointer {

	// NULL
	public static final MM_RegionBasedOverflowVLHGCPointer NULL = new MM_RegionBasedOverflowVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RegionBasedOverflowVLHGCPointer(long address) {
		super(address);
	}

	public static MM_RegionBasedOverflowVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RegionBasedOverflowVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RegionBasedOverflowVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RegionBasedOverflowVLHGCPointer(address);
	}

	public MM_RegionBasedOverflowVLHGCPointer add(long count) {
		return MM_RegionBasedOverflowVLHGCPointer.cast(address + (MM_RegionBasedOverflowVLHGC.SIZEOF * count));
	}

	public MM_RegionBasedOverflowVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RegionBasedOverflowVLHGCPointer addOffset(long offset) {
		return MM_RegionBasedOverflowVLHGCPointer.cast(address + offset);
	}

	public MM_RegionBasedOverflowVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RegionBasedOverflowVLHGCPointer sub(long count) {
		return MM_RegionBasedOverflowVLHGCPointer.cast(address - (MM_RegionBasedOverflowVLHGC.SIZEOF * count));
	}

	public MM_RegionBasedOverflowVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RegionBasedOverflowVLHGCPointer subOffset(long offset) {
		return MM_RegionBasedOverflowVLHGCPointer.cast(address - offset);
	}

	public MM_RegionBasedOverflowVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RegionBasedOverflowVLHGCPointer untag(long mask) {
		return MM_RegionBasedOverflowVLHGCPointer.cast(address & ~mask);
	}

	public MM_RegionBasedOverflowVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RegionBasedOverflowVLHGC.SIZEOF;
	}

	// Implementation methods

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_RegionBasedOverflowVLHGC.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionBasedOverflowVLHGC.__extensionsOffset_));
	}

	// const MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="const MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_RegionBasedOverflowVLHGC.__heapRegionManagerOffset_));
	}

	// const MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RegionBasedOverflowVLHGC.__heapRegionManagerOffset_));
	}

	// const U8 _overflowFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowFlagOffset_", declaredType="const U8")
	public U8 _overflowFlag() throws CorruptDataException {
		return new U8(getByteAtOffset(MM_RegionBasedOverflowVLHGC.__overflowFlagOffset_));
	}

	// const U8 _overflowFlag
	public U8Pointer _overflowFlagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(MM_RegionBasedOverflowVLHGC.__overflowFlagOffset_));
	}

}
