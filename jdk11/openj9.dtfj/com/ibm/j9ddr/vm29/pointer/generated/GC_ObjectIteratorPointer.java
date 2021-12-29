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
 * Structure: GC_ObjectIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectIterator.class)
public class GC_ObjectIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ObjectIteratorPointer NULL = new GC_ObjectIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectIteratorPointer(long address) {
		super(address);
	}

	public static GC_ObjectIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectIteratorPointer(address);
	}

	public GC_ObjectIteratorPointer add(long count) {
		return GC_ObjectIteratorPointer.cast(address + (GC_ObjectIterator.SIZEOF * count));
	}

	public GC_ObjectIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectIteratorPointer addOffset(long offset) {
		return GC_ObjectIteratorPointer.cast(address + offset);
	}

	public GC_ObjectIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectIteratorPointer sub(long count) {
		return GC_ObjectIteratorPointer.cast(address - (GC_ObjectIterator.SIZEOF * count));
	}

	public GC_ObjectIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectIteratorPointer subOffset(long offset) {
		return GC_ObjectIteratorPointer.cast(address - offset);
	}

	public GC_ObjectIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectIteratorPointer untag(long mask) {
		return GC_ObjectIteratorPointer.cast(address & ~mask);
	}

	public GC_ObjectIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectIterator.SIZEOF;
	}

	// Implementation methods

	// GC_MixedObjectIterator _mixedObjectIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mixedObjectIteratorOffset_", declaredType="GC_MixedObjectIterator")
	public GC_MixedObjectIteratorPointer _mixedObjectIterator() throws CorruptDataException {
		return GC_MixedObjectIteratorPointer.cast(nonNullFieldEA(GC_ObjectIterator.__mixedObjectIteratorOffset_));
	}

	// GC_MixedObjectIterator _mixedObjectIterator
	public PointerPointer _mixedObjectIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectIterator.__mixedObjectIteratorOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(GC_ObjectIterator.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectIterator.__omrVMOffset_));
	}

	// GC_PointerContiguousArrayIterator _pointerContiguousArrayIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pointerContiguousArrayIteratorOffset_", declaredType="GC_PointerContiguousArrayIterator")
	public GC_PointerContiguousArrayIteratorPointer _pointerContiguousArrayIterator() throws CorruptDataException {
		return GC_PointerContiguousArrayIteratorPointer.cast(nonNullFieldEA(GC_ObjectIterator.__pointerContiguousArrayIteratorOffset_));
	}

	// GC_PointerContiguousArrayIterator _pointerContiguousArrayIterator
	public PointerPointer _pointerContiguousArrayIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectIterator.__pointerContiguousArrayIteratorOffset_));
	}

	// GC_SlotObject _slotObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__slotObjectOffset_", declaredType="GC_SlotObject")
	public GC_SlotObjectPointer _slotObject() throws CorruptDataException {
		return GC_SlotObjectPointer.cast(nonNullFieldEA(GC_ObjectIterator.__slotObjectOffset_));
	}

	// GC_SlotObject _slotObject
	public PointerPointer _slotObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectIterator.__slotObjectOffset_));
	}

	// GC_ObjectModel$ScanType _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="GC_ObjectModel$ScanType")
	public long _type() throws CorruptDataException {
		if (GC_ObjectModel$ScanType.SIZEOF == 1) {
			return getByteAtOffset(GC_ObjectIterator.__typeOffset_);
		} else if (GC_ObjectModel$ScanType.SIZEOF == 2) {
			return getShortAtOffset(GC_ObjectIterator.__typeOffset_);
		} else if (GC_ObjectModel$ScanType.SIZEOF == 4) {
			return getIntAtOffset(GC_ObjectIterator.__typeOffset_);
		} else if (GC_ObjectModel$ScanType.SIZEOF == 8) {
			return getLongAtOffset(GC_ObjectIterator.__typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GC_ObjectModel$ScanType _type
	public EnumPointer _typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_ObjectIterator.__typeOffset_), GC_ObjectModel$ScanType.class);
	}

}
