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
 * Structure: MM_CompactSchemePointer
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
 * The generated code will provide getters for all elements in the MM_CompactSchemePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompactScheme.class)
public class MM_CompactSchemePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_CompactSchemePointer NULL = new MM_CompactSchemePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompactSchemePointer(long address) {
		super(address);
	}

	public static MM_CompactSchemePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompactSchemePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompactSchemePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompactSchemePointer(address);
	}

	public MM_CompactSchemePointer add(long count) {
		return MM_CompactSchemePointer.cast(address + (MM_CompactScheme.SIZEOF * count));
	}

	public MM_CompactSchemePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompactSchemePointer addOffset(long offset) {
		return MM_CompactSchemePointer.cast(address + offset);
	}

	public MM_CompactSchemePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompactSchemePointer sub(long count) {
		return MM_CompactSchemePointer.cast(address - (MM_CompactScheme.SIZEOF * count));
	}

	public MM_CompactSchemePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompactSchemePointer subOffset(long offset) {
		return MM_CompactSchemePointer.cast(address - offset);
	}

	public MM_CompactSchemePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompactSchemePointer untag(long mask) {
		return MM_CompactSchemePointer.cast(address & ~mask);
	}

	public MM_CompactSchemePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompactScheme.SIZEOF;
	}

	// Implementation methods

	// omrobjectptr_t _compactFrom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactFromOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _compactFrom() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(MM_CompactScheme.__compactFromOffset_));
	}

	// omrobjectptr_t _compactFrom
	public PointerPointer _compactFromEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__compactFromOffset_));
	}

	// CompactTableEntry* _compactTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactTableOffset_", declaredType="CompactTableEntry*")
	public CompactTableEntryPointer _compactTable() throws CorruptDataException {
		return CompactTableEntryPointer.cast(getPointerAtOffset(MM_CompactScheme.__compactTableOffset_));
	}

	// CompactTableEntry* _compactTable
	public PointerPointer _compactTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__compactTableOffset_));
	}

	// omrobjectptr_t _compactTo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactToOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _compactTo() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(MM_CompactScheme.__compactToOffset_));
	}

	// omrobjectptr_t _compactTo
	public PointerPointer _compactToEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__compactToOffset_));
	}

	// MM_CompactDelegate _delegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__delegateOffset_", declaredType="MM_CompactDelegate")
	public MM_CompactDelegatePointer _delegate() throws CorruptDataException {
		return MM_CompactDelegatePointer.cast(nonNullFieldEA(MM_CompactScheme.__delegateOffset_));
	}

	// MM_CompactDelegate _delegate
	public PointerPointer _delegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__delegateOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_CompactScheme.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__dispatcherOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_CompactScheme.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__extensionsOffset_));
	}

	// MM_Heap* _heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapOffset_", declaredType="MM_Heap*")
	public MM_HeapPointer _heap() throws CorruptDataException {
		return MM_HeapPointer.cast(getPointerAtOffset(MM_CompactScheme.__heapOffset_));
	}

	// MM_Heap* _heap
	public PointerPointer _heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__heapOffset_));
	}

	// U64 _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="U64")
	public UDATA _heapBase() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactScheme.__heapBaseOffset_));
	}

	// U64 _heapBase
	public UDATAPointer _heapBaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactScheme.__heapBaseOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_CompactScheme.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__markMapOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_CompactScheme.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__markingSchemeOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_CompactScheme.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__omrVMOffset_));
	}

	// MM_HeapRegionManager* _rootManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _rootManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_CompactScheme.__rootManagerOffset_));
	}

	// MM_HeapRegionManager* _rootManager
	public PointerPointer _rootManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__rootManagerOffset_));
	}

	// MM_CompactScheme$SubAreaEntry* _subAreaTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subAreaTableOffset_", declaredType="MM_CompactScheme$SubAreaEntry*")
	public MM_CompactScheme$SubAreaEntryPointer _subAreaTable() throws CorruptDataException {
		return MM_CompactScheme$SubAreaEntryPointer.cast(getPointerAtOffset(MM_CompactScheme.__subAreaTableOffset_));
	}

	// MM_CompactScheme$SubAreaEntry* _subAreaTable
	public PointerPointer _subAreaTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompactScheme.__subAreaTableOffset_));
	}

	// U64 _subAreaTableSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subAreaTableSizeOffset_", declaredType="U64")
	public UDATA _subAreaTableSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CompactScheme.__subAreaTableSizeOffset_));
	}

	// U64 _subAreaTableSize
	public UDATAPointer _subAreaTableSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompactScheme.__subAreaTableSizeOffset_));
	}

}
