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
 * Structure: GC_ObjectHeapIteratorSegregatedPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectHeapIteratorSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectHeapIteratorSegregated.class)
public class GC_ObjectHeapIteratorSegregatedPointer extends GC_ObjectHeapIteratorPointer {

	// NULL
	public static final GC_ObjectHeapIteratorSegregatedPointer NULL = new GC_ObjectHeapIteratorSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectHeapIteratorSegregatedPointer(long address) {
		super(address);
	}

	public static GC_ObjectHeapIteratorSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectHeapIteratorSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectHeapIteratorSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectHeapIteratorSegregatedPointer(address);
	}

	public GC_ObjectHeapIteratorSegregatedPointer add(long count) {
		return GC_ObjectHeapIteratorSegregatedPointer.cast(address + (GC_ObjectHeapIteratorSegregated.SIZEOF * count));
	}

	public GC_ObjectHeapIteratorSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectHeapIteratorSegregatedPointer addOffset(long offset) {
		return GC_ObjectHeapIteratorSegregatedPointer.cast(address + offset);
	}

	public GC_ObjectHeapIteratorSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectHeapIteratorSegregatedPointer sub(long count) {
		return GC_ObjectHeapIteratorSegregatedPointer.cast(address - (GC_ObjectHeapIteratorSegregated.SIZEOF * count));
	}

	public GC_ObjectHeapIteratorSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectHeapIteratorSegregatedPointer subOffset(long offset) {
		return GC_ObjectHeapIteratorSegregatedPointer.cast(address - offset);
	}

	public GC_ObjectHeapIteratorSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectHeapIteratorSegregatedPointer untag(long mask) {
		return GC_ObjectHeapIteratorSegregatedPointer.cast(address & ~mask);
	}

	public GC_ObjectHeapIteratorSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectHeapIteratorSegregated.SIZEOF;
	}

	// Implementation methods

	// U64 _cellSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cellSizeOffset_", declaredType="U64")
	public UDATA _cellSize() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectHeapIteratorSegregated.__cellSizeOffset_));
	}

	// U64 _cellSize
	public UDATAPointer _cellSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__cellSizeOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorSegregated.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__extensionsOffset_));
	}

	// bool _includeDeadObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeDeadObjectsOffset_", declaredType="bool")
	public boolean _includeDeadObjects() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorSegregated.__includeDeadObjectsOffset_);
	}

	// bool _includeDeadObjects
	public BoolPointer _includeDeadObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__includeDeadObjectsOffset_));
	}

	// bool _pastFirstObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pastFirstObjectOffset_", declaredType="bool")
	public boolean _pastFirstObject() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectHeapIteratorSegregated.__pastFirstObjectOffset_);
	}

	// bool _pastFirstObject
	public BoolPointer _pastFirstObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__pastFirstObjectOffset_));
	}

	// omrobjectptr_t _scanPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _scanPtr() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorSegregated.__scanPtrOffset_));
	}

	// omrobjectptr_t _scanPtr
	public PointerPointer _scanPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__scanPtrOffset_));
	}

	// omrobjectptr_t _scanPtrTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanPtrTopOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _scanPtrTop() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorSegregated.__scanPtrTopOffset_));
	}

	// omrobjectptr_t _scanPtrTop
	public PointerPointer _scanPtrTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__scanPtrTopOffset_));
	}

	// omrobjectptr_t _smallPtrTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__smallPtrTopOffset_", declaredType="omrobjectptr_t")
	public J9ObjectPointer _smallPtrTop() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_ObjectHeapIteratorSegregated.__smallPtrTopOffset_));
	}

	// omrobjectptr_t _smallPtrTop
	public PointerPointer _smallPtrTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__smallPtrTopOffset_));
	}

	// MM_HeapRegionDescriptor$RegionType _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="MM_HeapRegionDescriptor$RegionType")
	public long _type() throws CorruptDataException {
		if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 1) {
			return getByteAtOffset(GC_ObjectHeapIteratorSegregated.__typeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 2) {
			return getShortAtOffset(GC_ObjectHeapIteratorSegregated.__typeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 4) {
			return getIntAtOffset(GC_ObjectHeapIteratorSegregated.__typeOffset_);
		} else if (MM_HeapRegionDescriptor$RegionType.SIZEOF == 8) {
			return getLongAtOffset(GC_ObjectHeapIteratorSegregated.__typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_HeapRegionDescriptor$RegionType _type
	public EnumPointer _typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_ObjectHeapIteratorSegregated.__typeOffset_), MM_HeapRegionDescriptor$RegionType.class);
	}

}
