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
 * Structure: MM_PhysicalSubArenaVirtualMemorySemiSpacePointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalSubArenaVirtualMemorySemiSpacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalSubArenaVirtualMemorySemiSpace.class)
public class MM_PhysicalSubArenaVirtualMemorySemiSpacePointer extends MM_PhysicalSubArenaVirtualMemoryPointer {

	// NULL
	public static final MM_PhysicalSubArenaVirtualMemorySemiSpacePointer NULL = new MM_PhysicalSubArenaVirtualMemorySemiSpacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalSubArenaVirtualMemorySemiSpacePointer(long address) {
		super(address);
	}

	public static MM_PhysicalSubArenaVirtualMemorySemiSpacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalSubArenaVirtualMemorySemiSpacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalSubArenaVirtualMemorySemiSpacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalSubArenaVirtualMemorySemiSpacePointer(address);
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer add(long count) {
		return MM_PhysicalSubArenaVirtualMemorySemiSpacePointer.cast(address + (MM_PhysicalSubArenaVirtualMemorySemiSpace.SIZEOF * count));
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer addOffset(long offset) {
		return MM_PhysicalSubArenaVirtualMemorySemiSpacePointer.cast(address + offset);
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer sub(long count) {
		return MM_PhysicalSubArenaVirtualMemorySemiSpacePointer.cast(address - (MM_PhysicalSubArenaVirtualMemorySemiSpace.SIZEOF * count));
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer subOffset(long offset) {
		return MM_PhysicalSubArenaVirtualMemorySemiSpacePointer.cast(address - offset);
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer untag(long mask) {
		return MM_PhysicalSubArenaVirtualMemorySemiSpacePointer.cast(address & ~mask);
	}

	public MM_PhysicalSubArenaVirtualMemorySemiSpacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalSubArenaVirtualMemorySemiSpace.SIZEOF;
	}

	// Implementation methods

	// bool _avoidMovingObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__avoidMovingObjectsOffset_", declaredType="bool")
	public boolean _avoidMovingObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemorySemiSpace.__avoidMovingObjectsOffset_);
	}

	// bool _avoidMovingObjects
	public BoolPointer _avoidMovingObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemorySemiSpace.__avoidMovingObjectsOffset_));
	}

	// MM_HeapRegionDescriptor* _highSemiSpaceRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__highSemiSpaceRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _highSemiSpaceRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemorySemiSpace.__highSemiSpaceRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _highSemiSpaceRegion
	public PointerPointer _highSemiSpaceRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemorySemiSpace.__highSemiSpaceRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _lowSemiSpaceRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lowSemiSpaceRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _lowSemiSpaceRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaVirtualMemorySemiSpace.__lowSemiSpaceRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _lowSemiSpaceRegion
	public PointerPointer _lowSemiSpaceRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemorySemiSpace.__lowSemiSpaceRegionOffset_));
	}

	// bool _resizable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__resizableOffset_", declaredType="bool")
	public boolean _resizable() throws CorruptDataException {
		return getBoolAtOffset(MM_PhysicalSubArenaVirtualMemorySemiSpace.__resizableOffset_);
	}

	// bool _resizable
	public BoolPointer _resizableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaVirtualMemorySemiSpace.__resizableOffset_));
	}

}
