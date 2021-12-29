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
 * Structure: MM_CopyScanCachePointer
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
 * The generated code will provide getters for all elements in the MM_CopyScanCachePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyScanCache.class)
public class MM_CopyScanCachePointer extends MM_BasePointer {

	// NULL
	public static final MM_CopyScanCachePointer NULL = new MM_CopyScanCachePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyScanCachePointer(long address) {
		super(address);
	}

	public static MM_CopyScanCachePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyScanCachePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyScanCachePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyScanCachePointer(address);
	}

	public MM_CopyScanCachePointer add(long count) {
		return MM_CopyScanCachePointer.cast(address + (MM_CopyScanCache.SIZEOF * count));
	}

	public MM_CopyScanCachePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyScanCachePointer addOffset(long offset) {
		return MM_CopyScanCachePointer.cast(address + offset);
	}

	public MM_CopyScanCachePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyScanCachePointer sub(long count) {
		return MM_CopyScanCachePointer.cast(address - (MM_CopyScanCache.SIZEOF * count));
	}

	public MM_CopyScanCachePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyScanCachePointer subOffset(long offset) {
		return MM_CopyScanCachePointer.cast(address - offset);
	}

	public MM_CopyScanCachePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyScanCachePointer untag(long mask) {
		return MM_CopyScanCachePointer.cast(address & ~mask);
	}

	public MM_CopyScanCachePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyScanCache.SIZEOF;
	}

	// Implementation methods

	// bool _hasPartiallyScannedObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasPartiallyScannedObjectOffset_", declaredType="bool")
	public boolean _hasPartiallyScannedObject() throws CorruptDataException {
		return getBoolAtOffset(MM_CopyScanCache.__hasPartiallyScannedObjectOffset_);
	}

	// bool _hasPartiallyScannedObject
	public BoolPointer _hasPartiallyScannedObjectEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CopyScanCache.__hasPartiallyScannedObjectOffset_));
	}

	// void* cacheAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheAllocOffset_", declaredType="void*")
	public VoidPointer cacheAlloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyScanCache._cacheAllocOffset_));
	}

	// void* cacheAlloc
	public PointerPointer cacheAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCache._cacheAllocOffset_));
	}

	// void* cacheBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheBaseOffset_", declaredType="void*")
	public VoidPointer cacheBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyScanCache._cacheBaseOffset_));
	}

	// void* cacheBase
	public PointerPointer cacheBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCache._cacheBaseOffset_));
	}

	// void* cacheTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheTopOffset_", declaredType="void*")
	public VoidPointer cacheTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyScanCache._cacheTopOffset_));
	}

	// void* cacheTop
	public PointerPointer cacheTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCache._cacheTopOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CopyScanCache._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyScanCache._flagsOffset_));
	}

	// MM_CopyScanCache* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="MM_CopyScanCache*")
	public MM_CopyScanCachePointer next() throws CorruptDataException {
		return MM_CopyScanCachePointer.cast(getPointerAtOffset(MM_CopyScanCache._nextOffset_));
	}

	// MM_CopyScanCache* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCache._nextOffset_));
	}

	// void* scanCurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scanCurrentOffset_", declaredType="void*")
	public VoidPointer scanCurrent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_CopyScanCache._scanCurrentOffset_));
	}

	// void* scanCurrent
	public PointerPointer scanCurrentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CopyScanCache._scanCurrentOffset_));
	}

}
