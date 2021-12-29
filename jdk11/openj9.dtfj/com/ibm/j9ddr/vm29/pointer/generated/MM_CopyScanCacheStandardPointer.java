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
 * Structure: MM_CopyScanCacheStandardPointer
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
 * The generated code will provide getters for all elements in the MM_CopyScanCacheStandardPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyScanCacheStandard.class)
public class MM_CopyScanCacheStandardPointer extends MM_CopyScanCachePointer {

	// NULL
	public static final MM_CopyScanCacheStandardPointer NULL = new MM_CopyScanCacheStandardPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyScanCacheStandardPointer(long address) {
		super(address);
	}

	public static MM_CopyScanCacheStandardPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyScanCacheStandardPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyScanCacheStandardPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyScanCacheStandardPointer(address);
	}

	public MM_CopyScanCacheStandardPointer add(long count) {
		return MM_CopyScanCacheStandardPointer.cast(address + (MM_CopyScanCacheStandard.SIZEOF * count));
	}

	public MM_CopyScanCacheStandardPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyScanCacheStandardPointer addOffset(long offset) {
		return MM_CopyScanCacheStandardPointer.cast(address + offset);
	}

	public MM_CopyScanCacheStandardPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyScanCacheStandardPointer sub(long count) {
		return MM_CopyScanCacheStandardPointer.cast(address - (MM_CopyScanCacheStandard.SIZEOF * count));
	}

	public MM_CopyScanCacheStandardPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyScanCacheStandardPointer subOffset(long offset) {
		return MM_CopyScanCacheStandardPointer.cast(address - offset);
	}

	public MM_CopyScanCacheStandardPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyScanCacheStandardPointer untag(long mask) {
		return MM_CopyScanCacheStandardPointer.cast(address & ~mask);
	}

	public MM_CopyScanCacheStandardPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyScanCacheStandard.SIZEOF;
	}

	// Implementation methods

	// U64 _arraySplitAmountToScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitAmountToScanOffset_", declaredType="U64")
	public UDATA _arraySplitAmountToScan() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCacheStandard.__arraySplitAmountToScanOffset_));
	}

	// U64 _arraySplitAmountToScan
	public UDATAPointer _arraySplitAmountToScanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__arraySplitAmountToScanOffset_));
	}

	// U64 _arraySplitIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitIndexOffset_", declaredType="U64")
	public UDATA _arraySplitIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCacheStandard.__arraySplitIndexOffset_));
	}

	// U64 _arraySplitIndex
	public UDATAPointer _arraySplitIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__arraySplitIndexOffset_));
	}

	// omrobjectptr_t* _arraySplitRememberedSlot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arraySplitRememberedSlotOffset_", declaredType="omrobjectptr_t*")
	public PointerPointer _arraySplitRememberedSlot() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_CopyScanCacheStandard.__arraySplitRememberedSlotOffset_));
	}

	// omrobjectptr_t* _arraySplitRememberedSlot
	public PointerPointer _arraySplitRememberedSlotEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__arraySplitRememberedSlotOffset_));
	}

	// GC_ObjectScannerState _objectScannerState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectScannerStateOffset_", declaredType="GC_ObjectScannerState")
	public GC_ObjectScannerStatePointer _objectScannerState() throws CorruptDataException {
		return GC_ObjectScannerStatePointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__objectScannerStateOffset_));
	}

	// GC_ObjectScannerState _objectScannerState
	public PointerPointer _objectScannerStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__objectScannerStateOffset_));
	}

	// bool _shouldBeRemembered
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldBeRememberedOffset_", declaredType="bool")
	public boolean _shouldBeRemembered() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyScanCacheStandard.__shouldBeRememberedOffset_);
	}

	// bool _shouldBeRemembered
	public BoolPointer _shouldBeRememberedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyScanCacheStandard.__shouldBeRememberedOffset_));
	}

}
