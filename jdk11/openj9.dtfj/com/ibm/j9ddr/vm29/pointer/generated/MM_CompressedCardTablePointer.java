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
 * Structure: MM_CompressedCardTablePointer
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
 * The generated code will provide getters for all elements in the MM_CompressedCardTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CompressedCardTable.class)
public class MM_CompressedCardTablePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_CompressedCardTablePointer NULL = new MM_CompressedCardTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CompressedCardTablePointer(long address) {
		super(address);
	}

	public static MM_CompressedCardTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CompressedCardTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CompressedCardTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CompressedCardTablePointer(address);
	}

	public MM_CompressedCardTablePointer add(long count) {
		return MM_CompressedCardTablePointer.cast(address + (MM_CompressedCardTable.SIZEOF * count));
	}

	public MM_CompressedCardTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CompressedCardTablePointer addOffset(long offset) {
		return MM_CompressedCardTablePointer.cast(address + offset);
	}

	public MM_CompressedCardTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CompressedCardTablePointer sub(long count) {
		return MM_CompressedCardTablePointer.cast(address - (MM_CompressedCardTable.SIZEOF * count));
	}

	public MM_CompressedCardTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CompressedCardTablePointer subOffset(long offset) {
		return MM_CompressedCardTablePointer.cast(address - offset);
	}

	public MM_CompressedCardTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CompressedCardTablePointer untag(long mask) {
		return MM_CompressedCardTablePointer.cast(address & ~mask);
	}

	public MM_CompressedCardTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CompressedCardTable.SIZEOF;
	}

	// Implementation methods

	// UDATA* _compressedCardTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressedCardTableOffset_", declaredType="UDATA*")
	public UDATAPointer _compressedCardTable() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(MM_CompressedCardTable.__compressedCardTableOffset_));
	}

	// UDATA* _compressedCardTable
	public PointerPointer _compressedCardTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CompressedCardTable.__compressedCardTableOffset_));
	}

	// UDATA _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="UDATA")
	public UDATA _heapBase() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompressedCardTable.__heapBaseOffset_);
	}

	// UDATA _heapBase
	public UDATAPointer _heapBaseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompressedCardTable.__heapBaseOffset_));
	}

	// volatile UDATA _regionsProcessed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__regionsProcessedOffset_", declaredType="volatile UDATA")
	public UDATA _regionsProcessed() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompressedCardTable.__regionsProcessedOffset_);
	}

	// volatile UDATA _regionsProcessed
	public UDATAPointer _regionsProcessedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompressedCardTable.__regionsProcessedOffset_));
	}

	// volatile UDATA _totalRegions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalRegionsOffset_", declaredType="volatile UDATA")
	public UDATA _totalRegions() throws CorruptDataException {
		return getUDATAAtOffset(MM_CompressedCardTable.__totalRegionsOffset_);
	}

	// volatile UDATA _totalRegions
	public UDATAPointer _totalRegionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CompressedCardTable.__totalRegionsOffset_));
	}

}
