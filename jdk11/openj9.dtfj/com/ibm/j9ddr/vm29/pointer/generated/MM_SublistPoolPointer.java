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
 * Structure: MM_SublistPoolPointer
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
 * The generated code will provide getters for all elements in the MM_SublistPoolPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SublistPool.class)
public class MM_SublistPoolPointer extends StructurePointer {

	// NULL
	public static final MM_SublistPoolPointer NULL = new MM_SublistPoolPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SublistPoolPointer(long address) {
		super(address);
	}

	public static MM_SublistPoolPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SublistPoolPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SublistPoolPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SublistPoolPointer(address);
	}

	public MM_SublistPoolPointer add(long count) {
		return MM_SublistPoolPointer.cast(address + (MM_SublistPool.SIZEOF * count));
	}

	public MM_SublistPoolPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SublistPoolPointer addOffset(long offset) {
		return MM_SublistPoolPointer.cast(address + offset);
	}

	public MM_SublistPoolPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SublistPoolPointer sub(long count) {
		return MM_SublistPoolPointer.cast(address - (MM_SublistPool.SIZEOF * count));
	}

	public MM_SublistPoolPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SublistPoolPointer subOffset(long offset) {
		return MM_SublistPoolPointer.cast(address - offset);
	}

	public MM_SublistPoolPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SublistPoolPointer untag(long mask) {
		return MM_SublistPoolPointer.cast(address & ~mask);
	}

	public MM_SublistPoolPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SublistPool.SIZEOF;
	}

	// Implementation methods

	// OMR$GC$AllocationCategory$Enum _allocCategory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocCategoryOffset_", declaredType="OMR$GC$AllocationCategory$Enum")
	public long _allocCategory() throws CorruptDataException {
		if (OMR$GC$AllocationCategory$Enum.SIZEOF == 1) {
			return getByteAtOffset(MM_SublistPool.__allocCategoryOffset_);
		} else if (OMR$GC$AllocationCategory$Enum.SIZEOF == 2) {
			return getShortAtOffset(MM_SublistPool.__allocCategoryOffset_);
		} else if (OMR$GC$AllocationCategory$Enum.SIZEOF == 4) {
			return getIntAtOffset(MM_SublistPool.__allocCategoryOffset_);
		} else if (OMR$GC$AllocationCategory$Enum.SIZEOF == 8) {
			return getLongAtOffset(MM_SublistPool.__allocCategoryOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// OMR$GC$AllocationCategory$Enum _allocCategory
	public EnumPointer _allocCategoryEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_SublistPool.__allocCategoryOffset_), OMR$GC$AllocationCategory$Enum.class);
	}

	// MM_SublistPuddle* _allocPuddle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocPuddleOffset_", declaredType="MM_SublistPuddle*")
	public MM_SublistPuddlePointer _allocPuddle() throws CorruptDataException {
		return MM_SublistPuddlePointer.cast(getPointerAtOffset(MM_SublistPool.__allocPuddleOffset_));
	}

	// MM_SublistPuddle* _allocPuddle
	public PointerPointer _allocPuddleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SublistPool.__allocPuddleOffset_));
	}

	// volatile U64 _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="volatile U64")
	public UDATA _count() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SublistPool.__countOffset_));
	}

	// volatile U64 _count
	public UDATAPointer _countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SublistPool.__countOffset_));
	}

	// U64 _currentSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentSizeOffset_", declaredType="U64")
	public UDATA _currentSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SublistPool.__currentSizeOffset_));
	}

	// U64 _currentSize
	public UDATAPointer _currentSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SublistPool.__currentSizeOffset_));
	}

	// U64 _growSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__growSizeOffset_", declaredType="U64")
	public UDATA _growSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SublistPool.__growSizeOffset_));
	}

	// U64 _growSize
	public UDATAPointer _growSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SublistPool.__growSizeOffset_));
	}

	// MM_SublistPuddle* _list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__listOffset_", declaredType="MM_SublistPuddle*")
	public MM_SublistPuddlePointer _list() throws CorruptDataException {
		return MM_SublistPuddlePointer.cast(getPointerAtOffset(MM_SublistPool.__listOffset_));
	}

	// MM_SublistPuddle* _list
	public PointerPointer _listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SublistPool.__listOffset_));
	}

	// U64 _maxSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxSizeOffset_", declaredType="U64")
	public UDATA _maxSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SublistPool.__maxSizeOffset_));
	}

	// U64 _maxSize
	public UDATAPointer _maxSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SublistPool.__maxSizeOffset_));
	}

	// omrthread_monitor_t _mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_SublistPool.__mutexOffset_));
	}

	// omrthread_monitor_t _mutex
	public PointerPointer _mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SublistPool.__mutexOffset_));
	}

	// MM_SublistPuddle* _previousList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousListOffset_", declaredType="MM_SublistPuddle*")
	public MM_SublistPuddlePointer _previousList() throws CorruptDataException {
		return MM_SublistPuddlePointer.cast(getPointerAtOffset(MM_SublistPool.__previousListOffset_));
	}

	// MM_SublistPuddle* _previousList
	public PointerPointer _previousListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SublistPool.__previousListOffset_));
	}

}
