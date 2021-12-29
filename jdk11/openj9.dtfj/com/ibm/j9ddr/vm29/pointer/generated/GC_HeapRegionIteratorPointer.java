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
 * Structure: GC_HeapRegionIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_HeapRegionIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_HeapRegionIterator.class)
public class GC_HeapRegionIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_HeapRegionIteratorPointer NULL = new GC_HeapRegionIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_HeapRegionIteratorPointer(long address) {
		super(address);
	}

	public static GC_HeapRegionIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_HeapRegionIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_HeapRegionIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_HeapRegionIteratorPointer(address);
	}

	public GC_HeapRegionIteratorPointer add(long count) {
		return GC_HeapRegionIteratorPointer.cast(address + (GC_HeapRegionIterator.SIZEOF * count));
	}

	public GC_HeapRegionIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_HeapRegionIteratorPointer addOffset(long offset) {
		return GC_HeapRegionIteratorPointer.cast(address + offset);
	}

	public GC_HeapRegionIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_HeapRegionIteratorPointer sub(long count) {
		return GC_HeapRegionIteratorPointer.cast(address - (GC_HeapRegionIterator.SIZEOF * count));
	}

	public GC_HeapRegionIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_HeapRegionIteratorPointer subOffset(long offset) {
		return GC_HeapRegionIteratorPointer.cast(address - offset);
	}

	public GC_HeapRegionIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_HeapRegionIteratorPointer untag(long mask) {
		return GC_HeapRegionIteratorPointer.cast(address & ~mask);
	}

	public GC_HeapRegionIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_HeapRegionIterator.SIZEOF;
	}

	// Implementation methods

	// MM_HeapRegionDescriptor* _auxRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__auxRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _auxRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(GC_HeapRegionIterator.__auxRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _auxRegion
	public PointerPointer _auxRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_HeapRegionIterator.__auxRegionOffset_));
	}

	// U32 _includedRegionsMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includedRegionsMaskOffset_", declaredType="U32")
	public UDATA _includedRegionsMask() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_HeapRegionIterator.__includedRegionsMaskOffset_));
	}

	// U32 _includedRegionsMask
	public UDATAPointer _includedRegionsMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_HeapRegionIterator.__includedRegionsMaskOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _regionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(GC_HeapRegionIterator.__regionManagerOffset_));
	}

	// MM_HeapRegionManager* _regionManager
	public PointerPointer _regionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_HeapRegionIterator.__regionManagerOffset_));
	}

	// MM_MemorySpace* _space
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__spaceOffset_", declaredType="MM_MemorySpace*")
	public MM_MemorySpacePointer _space() throws CorruptDataException {
		return MM_MemorySpacePointer.cast(getPointerAtOffset(GC_HeapRegionIterator.__spaceOffset_));
	}

	// MM_MemorySpace* _space
	public PointerPointer _spaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_HeapRegionIterator.__spaceOffset_));
	}

	// MM_HeapRegionDescriptor* _tableRegion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tableRegionOffset_", declaredType="MM_HeapRegionDescriptor*")
	public MM_HeapRegionDescriptorPointer _tableRegion() throws CorruptDataException {
		return MM_HeapRegionDescriptorPointer.cast(getPointerAtOffset(GC_HeapRegionIterator.__tableRegionOffset_));
	}

	// MM_HeapRegionDescriptor* _tableRegion
	public PointerPointer _tableRegionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_HeapRegionIterator.__tableRegionOffset_));
	}

}
