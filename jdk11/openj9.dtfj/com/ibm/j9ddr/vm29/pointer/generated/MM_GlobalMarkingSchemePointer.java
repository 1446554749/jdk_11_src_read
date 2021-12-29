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
 * Structure: MM_GlobalMarkingSchemePointer
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
 * The generated code will provide getters for all elements in the MM_GlobalMarkingSchemePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GlobalMarkingScheme.class)
public class MM_GlobalMarkingSchemePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_GlobalMarkingSchemePointer NULL = new MM_GlobalMarkingSchemePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GlobalMarkingSchemePointer(long address) {
		super(address);
	}

	public static MM_GlobalMarkingSchemePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GlobalMarkingSchemePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GlobalMarkingSchemePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GlobalMarkingSchemePointer(address);
	}

	public MM_GlobalMarkingSchemePointer add(long count) {
		return MM_GlobalMarkingSchemePointer.cast(address + (MM_GlobalMarkingScheme.SIZEOF * count));
	}

	public MM_GlobalMarkingSchemePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GlobalMarkingSchemePointer addOffset(long offset) {
		return MM_GlobalMarkingSchemePointer.cast(address + offset);
	}

	public MM_GlobalMarkingSchemePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GlobalMarkingSchemePointer sub(long count) {
		return MM_GlobalMarkingSchemePointer.cast(address - (MM_GlobalMarkingScheme.SIZEOF * count));
	}

	public MM_GlobalMarkingSchemePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GlobalMarkingSchemePointer subOffset(long offset) {
		return MM_GlobalMarkingSchemePointer.cast(address - offset);
	}

	public MM_GlobalMarkingSchemePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GlobalMarkingSchemePointer untag(long mask) {
		return MM_GlobalMarkingSchemePointer.cast(address & ~mask);
	}

	public MM_GlobalMarkingSchemePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GlobalMarkingScheme.SIZEOF;
	}

	// Implementation methods

	// UDATA _arraySplitSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitSizeOffset_", declaredType="UDATA")
	public UDATA _arraySplitSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_GlobalMarkingScheme.__arraySplitSizeOffset_);
	}

	// UDATA _arraySplitSize
	public UDATAPointer _arraySplitSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__arraySplitSizeOffset_));
	}

	// const bool _collectStringConstantsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectStringConstantsEnabledOffset_", declaredType="const bool")
	public boolean _collectStringConstantsEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GlobalMarkingScheme.__collectStringConstantsEnabledOffset_);
	}

	// const bool _collectStringConstantsEnabled
	public BoolPointer _collectStringConstantsEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__collectStringConstantsEnabledOffset_));
	}

	// bool _dynamicClassUnloadingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicClassUnloadingEnabledOffset_", declaredType="bool")
	public boolean _dynamicClassUnloadingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GlobalMarkingScheme.__dynamicClassUnloadingEnabledOffset_);
	}

	// bool _dynamicClassUnloadingEnabled
	public BoolPointer _dynamicClassUnloadingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__dynamicClassUnloadingEnabledOffset_));
	}

	// const MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="const MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__extensionsOffset_));
	}

	// const MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__extensionsOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__heapBaseOffset_));
	}

	// const MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="const MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__heapRegionManagerOffset_));
	}

	// const MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__heapRegionManagerOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__heapTopOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetOffset_", declaredType="MM_InterRegionRememberedSet*")
	public MM_InterRegionRememberedSetPointer _interRegionRememberedSet() throws CorruptDataException {
		return MM_InterRegionRememberedSetPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__interRegionRememberedSetOffset_));
	}

	// MM_InterRegionRememberedSet* _interRegionRememberedSet
	public PointerPointer _interRegionRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__interRegionRememberedSetOffset_));
	}

	// const J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="const J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__javaVMOffset_));
	}

	// const J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__javaVMOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_GlobalMarkingScheme.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__markMapOffset_));
	}

	// const UDATA _regionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionSizeOffset_", declaredType="const UDATA")
	public UDATA _regionSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_GlobalMarkingScheme.__regionSizeOffset_);
	}

	// const UDATA _regionSize
	public UDATAPointer _regionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalMarkingScheme.__regionSizeOffset_));
	}

}
