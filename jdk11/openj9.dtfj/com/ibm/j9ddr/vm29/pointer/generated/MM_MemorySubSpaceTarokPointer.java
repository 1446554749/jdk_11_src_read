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
 * Structure: MM_MemorySubSpaceTarokPointer
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
 * The generated code will provide getters for all elements in the MM_MemorySubSpaceTarokPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemorySubSpaceTarok.class)
public class MM_MemorySubSpaceTarokPointer extends MM_MemorySubSpacePointer {

	// NULL
	public static final MM_MemorySubSpaceTarokPointer NULL = new MM_MemorySubSpaceTarokPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemorySubSpaceTarokPointer(long address) {
		super(address);
	}

	public static MM_MemorySubSpaceTarokPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemorySubSpaceTarokPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemorySubSpaceTarokPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemorySubSpaceTarokPointer(address);
	}

	public MM_MemorySubSpaceTarokPointer add(long count) {
		return MM_MemorySubSpaceTarokPointer.cast(address + (MM_MemorySubSpaceTarok.SIZEOF * count));
	}

	public MM_MemorySubSpaceTarokPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemorySubSpaceTarokPointer addOffset(long offset) {
		return MM_MemorySubSpaceTarokPointer.cast(address + offset);
	}

	public MM_MemorySubSpaceTarokPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemorySubSpaceTarokPointer sub(long count) {
		return MM_MemorySubSpaceTarokPointer.cast(address - (MM_MemorySubSpaceTarok.SIZEOF * count));
	}

	public MM_MemorySubSpaceTarokPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemorySubSpaceTarokPointer subOffset(long offset) {
		return MM_MemorySubSpaceTarokPointer.cast(address - offset);
	}

	public MM_MemorySubSpaceTarokPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemorySubSpaceTarokPointer untag(long mask) {
		return MM_MemorySubSpaceTarokPointer.cast(address & ~mask);
	}

	public MM_MemorySubSpaceTarokPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemorySubSpaceTarok.SIZEOF;
	}

	// Implementation methods

	// bool _allocateAtSafePointOnly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocateAtSafePointOnlyOffset_", declaredType="bool")
	public boolean _allocateAtSafePointOnly() throws CorruptDataException {
		return getBoolAtOffset(MM_MemorySubSpaceTarok.__allocateAtSafePointOnlyOffset_);
	}

	// bool _allocateAtSafePointOnly
	public BoolPointer _allocateAtSafePointOnlyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__allocateAtSafePointOnlyOffset_));
	}

	// volatile UDATA _bytesRemainingBeforeTaxation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesRemainingBeforeTaxationOffset_", declaredType="volatile UDATA")
	public UDATA _bytesRemainingBeforeTaxation() throws CorruptDataException {
		return getUDATAAtOffset(MM_MemorySubSpaceTarok.__bytesRemainingBeforeTaxationOffset_);
	}

	// volatile UDATA _bytesRemainingBeforeTaxation
	public UDATAPointer _bytesRemainingBeforeTaxationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__bytesRemainingBeforeTaxationOffset_));
	}

	// MM_LightweightNonReentrantLock _expandLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expandLockOffset_", declaredType="MM_LightweightNonReentrantLock")
	public MM_LightweightNonReentrantLockPointer _expandLock() throws CorruptDataException {
		return MM_LightweightNonReentrantLockPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__expandLockOffset_));
	}

	// MM_LightweightNonReentrantLock _expandLock
	public PointerPointer _expandLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__expandLockOffset_));
	}

	// MM_GlobalAllocationManagerTarok* _globalAllocationManagerTarok
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalAllocationManagerTarokOffset_", declaredType="MM_GlobalAllocationManagerTarok*")
	public MM_GlobalAllocationManagerTarokPointer _globalAllocationManagerTarok() throws CorruptDataException {
		return MM_GlobalAllocationManagerTarokPointer.cast(getPointerAtOffset(MM_MemorySubSpaceTarok.__globalAllocationManagerTarokOffset_));
	}

	// MM_GlobalAllocationManagerTarok* _globalAllocationManagerTarok
	public PointerPointer _globalAllocationManagerTarokEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__globalAllocationManagerTarokOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRegionManagerOffset_", declaredType="MM_HeapRegionManager*")
	public MM_HeapRegionManagerPointer _heapRegionManager() throws CorruptDataException {
		return MM_HeapRegionManagerPointer.cast(getPointerAtOffset(MM_MemorySubSpaceTarok.__heapRegionManagerOffset_));
	}

	// MM_HeapRegionManager* _heapRegionManager
	public PointerPointer _heapRegionManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceTarok.__heapRegionManagerOffset_));
	}

}
