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
 * Structure: MM_MemoryPoolLargeObjectsPointer
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
 * The generated code will provide getters for all elements in the MM_MemoryPoolLargeObjectsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemoryPoolLargeObjects.class)
public class MM_MemoryPoolLargeObjectsPointer extends MM_MemoryPoolPointer {

	// NULL
	public static final MM_MemoryPoolLargeObjectsPointer NULL = new MM_MemoryPoolLargeObjectsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemoryPoolLargeObjectsPointer(long address) {
		super(address);
	}

	public static MM_MemoryPoolLargeObjectsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemoryPoolLargeObjectsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemoryPoolLargeObjectsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemoryPoolLargeObjectsPointer(address);
	}

	public MM_MemoryPoolLargeObjectsPointer add(long count) {
		return MM_MemoryPoolLargeObjectsPointer.cast(address + (MM_MemoryPoolLargeObjects.SIZEOF * count));
	}

	public MM_MemoryPoolLargeObjectsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemoryPoolLargeObjectsPointer addOffset(long offset) {
		return MM_MemoryPoolLargeObjectsPointer.cast(address + offset);
	}

	public MM_MemoryPoolLargeObjectsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemoryPoolLargeObjectsPointer sub(long count) {
		return MM_MemoryPoolLargeObjectsPointer.cast(address - (MM_MemoryPoolLargeObjects.SIZEOF * count));
	}

	public MM_MemoryPoolLargeObjectsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemoryPoolLargeObjectsPointer subOffset(long offset) {
		return MM_MemoryPoolLargeObjectsPointer.cast(address - offset);
	}

	public MM_MemoryPoolLargeObjectsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemoryPoolLargeObjectsPointer untag(long mask) {
		return MM_MemoryPoolLargeObjectsPointer.cast(address & ~mask);
	}

	public MM_MemoryPoolLargeObjectsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemoryPoolLargeObjects.SIZEOF;
	}

	// Implementation methods

	// void* _currentLOABase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentLOABaseOffset_", declaredType="void*")
	public VoidPointer _currentLOABase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_MemoryPoolLargeObjects.__currentLOABaseOffset_));
	}

	// void* _currentLOABase
	public PointerPointer _currentLOABaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__currentLOABaseOffset_));
	}

	// double _currentLOARatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentLOARatioOffset_", declaredType="double")
	public double _currentLOARatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_MemoryPoolLargeObjects.__currentLOARatioOffset_);
	}

	// double _currentLOARatio
	public DoublePointer _currentLOARatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__currentLOARatioOffset_));
	}

	// U64 _currentOldAreaSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentOldAreaSizeOffset_", declaredType="U64")
	public UDATA _currentOldAreaSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolLargeObjects.__currentOldAreaSizeOffset_));
	}

	// U64 _currentOldAreaSize
	public UDATAPointer _currentOldAreaSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__currentOldAreaSizeOffset_));
	}

	// double* _loaFreeRatioHistory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaFreeRatioHistoryOffset_", declaredType="double*")
	public DoublePointer _loaFreeRatioHistory() throws CorruptDataException {
		return DoublePointer.cast(getPointerAtOffset(MM_MemoryPoolLargeObjects.__loaFreeRatioHistoryOffset_));
	}

	// double* _loaFreeRatioHistory
	public PointerPointer _loaFreeRatioHistoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__loaFreeRatioHistoryOffset_));
	}

	// U64 _loaSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaSizeOffset_", declaredType="U64")
	public UDATA _loaSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolLargeObjects.__loaSizeOffset_));
	}

	// U64 _loaSize
	public UDATAPointer _loaSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__loaSizeOffset_));
	}

	// MM_MemoryPoolAddressOrderedListBase* _memoryPoolLargeObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolLargeObjectsOffset_", declaredType="MM_MemoryPoolAddressOrderedListBase*")
	public MM_MemoryPoolAddressOrderedListBasePointer _memoryPoolLargeObjects() throws CorruptDataException {
		return MM_MemoryPoolAddressOrderedListBasePointer.cast(getPointerAtOffset(MM_MemoryPoolLargeObjects.__memoryPoolLargeObjectsOffset_));
	}

	// MM_MemoryPoolAddressOrderedListBase* _memoryPoolLargeObjects
	public PointerPointer _memoryPoolLargeObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__memoryPoolLargeObjectsOffset_));
	}

	// MM_MemoryPoolAddressOrderedListBase* _memoryPoolSmallObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolSmallObjectsOffset_", declaredType="MM_MemoryPoolAddressOrderedListBase*")
	public MM_MemoryPoolAddressOrderedListBasePointer _memoryPoolSmallObjects() throws CorruptDataException {
		return MM_MemoryPoolAddressOrderedListBasePointer.cast(getPointerAtOffset(MM_MemoryPoolLargeObjects.__memoryPoolSmallObjectsOffset_));
	}

	// MM_MemoryPoolAddressOrderedListBase* _memoryPoolSmallObjects
	public PointerPointer _memoryPoolSmallObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__memoryPoolSmallObjectsOffset_));
	}

	// double _minLOAFreeRatio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minLOAFreeRatioOffset_", declaredType="double")
	public double _minLOAFreeRatio() throws CorruptDataException {
		return getDoubleAtOffset(MM_MemoryPoolLargeObjects.__minLOAFreeRatioOffset_);
	}

	// double _minLOAFreeRatio
	public DoublePointer _minLOAFreeRatioEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__minLOAFreeRatioOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_MemoryPoolLargeObjects.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__omrVMOffset_));
	}

	// U64 _soaFreeBytesAfterLastGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__soaFreeBytesAfterLastGCOffset_", declaredType="U64")
	public UDATA _soaFreeBytesAfterLastGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolLargeObjects.__soaFreeBytesAfterLastGCOffset_));
	}

	// U64 _soaFreeBytesAfterLastGC
	public UDATAPointer _soaFreeBytesAfterLastGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__soaFreeBytesAfterLastGCOffset_));
	}

	// U64 _soaObjectSizeLWM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__soaObjectSizeLWMOffset_", declaredType="U64")
	public UDATA _soaObjectSizeLWM() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolLargeObjects.__soaObjectSizeLWMOffset_));
	}

	// U64 _soaObjectSizeLWM
	public UDATAPointer _soaObjectSizeLWMEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__soaObjectSizeLWMOffset_));
	}

	// U64 _soaSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__soaSizeOffset_", declaredType="U64")
	public UDATA _soaSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemoryPoolLargeObjects.__soaSizeOffset_));
	}

	// U64 _soaSize
	public UDATAPointer _soaSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemoryPoolLargeObjects.__soaSizeOffset_));
	}

}
