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
 * Structure: GC_ArrayletObjectModelBasePointer
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
 * The generated code will provide getters for all elements in the GC_ArrayletObjectModelBasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ArrayletObjectModelBase.class)
public class GC_ArrayletObjectModelBasePointer extends StructurePointer {

	// NULL
	public static final GC_ArrayletObjectModelBasePointer NULL = new GC_ArrayletObjectModelBasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ArrayletObjectModelBasePointer(long address) {
		super(address);
	}

	public static GC_ArrayletObjectModelBasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ArrayletObjectModelBasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ArrayletObjectModelBasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ArrayletObjectModelBasePointer(address);
	}

	public GC_ArrayletObjectModelBasePointer add(long count) {
		return GC_ArrayletObjectModelBasePointer.cast(address + (GC_ArrayletObjectModelBase.SIZEOF * count));
	}

	public GC_ArrayletObjectModelBasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ArrayletObjectModelBasePointer addOffset(long offset) {
		return GC_ArrayletObjectModelBasePointer.cast(address + offset);
	}

	public GC_ArrayletObjectModelBasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ArrayletObjectModelBasePointer sub(long count) {
		return GC_ArrayletObjectModelBasePointer.cast(address - (GC_ArrayletObjectModelBase.SIZEOF * count));
	}

	public GC_ArrayletObjectModelBasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ArrayletObjectModelBasePointer subOffset(long offset) {
		return GC_ArrayletObjectModelBasePointer.cast(address - offset);
	}

	public GC_ArrayletObjectModelBasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ArrayletObjectModelBasePointer untag(long mask) {
		return GC_ArrayletObjectModelBasePointer.cast(address & ~mask);
	}

	public GC_ArrayletObjectModelBasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ArrayletObjectModelBase.SIZEOF;
	}

	// Implementation methods

	// void* _arrayletRangeBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletRangeBaseOffset_", declaredType="void*")
	public VoidPointer _arrayletRangeBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_ArrayletObjectModelBase.__arrayletRangeBaseOffset_));
	}

	// void* _arrayletRangeBase
	public PointerPointer _arrayletRangeBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__arrayletRangeBaseOffset_));
	}

	// void* _arrayletRangeTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletRangeTopOffset_", declaredType="void*")
	public VoidPointer _arrayletRangeTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_ArrayletObjectModelBase.__arrayletRangeTopOffset_));
	}

	// void* _arrayletRangeTop
	public PointerPointer _arrayletRangeTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__arrayletRangeTopOffset_));
	}

	// MM_MemorySubSpace* _arrayletSubSpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletSubSpaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _arrayletSubSpace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(GC_ArrayletObjectModelBase.__arrayletSubSpaceOffset_));
	}

	// MM_MemorySubSpace* _arrayletSubSpace
	public PointerPointer _arrayletSubSpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__arrayletSubSpaceOffset_));
	}

	// bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(GC_ArrayletObjectModelBase.__compressObjectReferencesOffset_);
	}

	// bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__compressObjectReferencesOffset_));
	}

	// bool _enableDoubleMapping
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__enableDoubleMappingOffset_", declaredType="bool")
	public boolean _enableDoubleMapping() throws CorruptDataException {
		return getBoolAtOffset(GC_ArrayletObjectModelBase.__enableDoubleMappingOffset_);
	}

	// bool _enableDoubleMapping
	public BoolPointer _enableDoubleMappingEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__enableDoubleMappingOffset_));
	}

	// UDATA _largestDesirableArraySpineSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestDesirableArraySpineSizeOffset_", declaredType="UDATA")
	public UDATA _largestDesirableArraySpineSize() throws CorruptDataException {
		return getUDATAAtOffset(GC_ArrayletObjectModelBase.__largestDesirableArraySpineSizeOffset_);
	}

	// UDATA _largestDesirableArraySpineSize
	public UDATAPointer _largestDesirableArraySpineSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__largestDesirableArraySpineSizeOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(GC_ArrayletObjectModelBase.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__omrVMOffset_));
	}

	// void** _vptr$GC_ArrayletObjectModelBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$GC_ArrayletObjectModelBaseOffset_", declaredType="void**")
	public PointerPointer _vptr$GC_ArrayletObjectModelBase() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_ArrayletObjectModelBase.__vptr$GC_ArrayletObjectModelBaseOffset_));
	}

	// void** _vptr$GC_ArrayletObjectModelBase
	public PointerPointer _vptr$GC_ArrayletObjectModelBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ArrayletObjectModelBase.__vptr$GC_ArrayletObjectModelBaseOffset_));
	}

}
