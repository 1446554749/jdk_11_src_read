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
 * Structure: MM_SegregatedAllocationInterfacePointer
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
 * The generated code will provide getters for all elements in the MM_SegregatedAllocationInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SegregatedAllocationInterface.class)
public class MM_SegregatedAllocationInterfacePointer extends MM_ObjectAllocationInterfacePointer {

	// NULL
	public static final MM_SegregatedAllocationInterfacePointer NULL = new MM_SegregatedAllocationInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SegregatedAllocationInterfacePointer(long address) {
		super(address);
	}

	public static MM_SegregatedAllocationInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SegregatedAllocationInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SegregatedAllocationInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SegregatedAllocationInterfacePointer(address);
	}

	public MM_SegregatedAllocationInterfacePointer add(long count) {
		return MM_SegregatedAllocationInterfacePointer.cast(address + (MM_SegregatedAllocationInterface.SIZEOF * count));
	}

	public MM_SegregatedAllocationInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SegregatedAllocationInterfacePointer addOffset(long offset) {
		return MM_SegregatedAllocationInterfacePointer.cast(address + offset);
	}

	public MM_SegregatedAllocationInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SegregatedAllocationInterfacePointer sub(long count) {
		return MM_SegregatedAllocationInterfacePointer.cast(address - (MM_SegregatedAllocationInterface.SIZEOF * count));
	}

	public MM_SegregatedAllocationInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SegregatedAllocationInterfacePointer subOffset(long offset) {
		return MM_SegregatedAllocationInterfacePointer.cast(address - offset);
	}

	public MM_SegregatedAllocationInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SegregatedAllocationInterfacePointer untag(long mask) {
		return MM_SegregatedAllocationInterfacePointer.cast(address & ~mask);
	}

	public MM_SegregatedAllocationInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SegregatedAllocationInterface.SIZEOF;
	}

	// Implementation methods

	// LanguageSegregatedAllocationCacheEntryStruct* _allocationCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationCacheOffset_", declaredType="LanguageSegregatedAllocationCacheEntryStruct*")
	public J9VMGCSegregatedAllocationCacheEntryPointer _allocationCache() throws CorruptDataException {
		return J9VMGCSegregatedAllocationCacheEntryPointer.cast(getPointerAtOffset(MM_SegregatedAllocationInterface.__allocationCacheOffset_));
	}

	// LanguageSegregatedAllocationCacheEntryStruct* _allocationCache
	public PointerPointer _allocationCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__allocationCacheOffset_));
	}

	// U64*[] _allocationCacheBases
	public PointerPointer _allocationCacheBasesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__allocationCacheBasesOffset_));
	}

	// SegregatedAllocationCacheStats _allocationCacheStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationCacheStatsOffset_", declaredType="SegregatedAllocationCacheStats")
	public SegregatedAllocationCacheStatsPointer _allocationCacheStats() throws CorruptDataException {
		return SegregatedAllocationCacheStatsPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__allocationCacheStatsOffset_));
	}

	// SegregatedAllocationCacheStats _allocationCacheStats
	public PointerPointer _allocationCacheStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__allocationCacheStatsOffset_));
	}

	// bool _cachedAllocationsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cachedAllocationsEnabledOffset_", declaredType="bool")
	public boolean _cachedAllocationsEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_SegregatedAllocationInterface.__cachedAllocationsEnabledOffset_);
	}

	// bool _cachedAllocationsEnabled
	public BoolPointer _cachedAllocationsEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__cachedAllocationsEnabledOffset_));
	}

	// MM_LanguageSegregatedAllocationCache _languageAllocationCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__languageAllocationCacheOffset_", declaredType="MM_LanguageSegregatedAllocationCache")
	public MM_LanguageSegregatedAllocationCachePointer _languageAllocationCache() throws CorruptDataException {
		return MM_LanguageSegregatedAllocationCachePointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__languageAllocationCacheOffset_));
	}

	// MM_LanguageSegregatedAllocationCache _languageAllocationCache
	public PointerPointer _languageAllocationCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__languageAllocationCacheOffset_));
	}

	// U64[] _replenishSizes
	public UDATAPointer _replenishSizesEA() throws CorruptDataException {
		return U64Pointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__replenishSizesOffset_));
	}

	// MM_SizeClasses* _sizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassesOffset_", declaredType="MM_SizeClasses*")
	public MM_SizeClassesPointer _sizeClasses() throws CorruptDataException {
		return MM_SizeClassesPointer.cast(getPointerAtOffset(MM_SegregatedAllocationInterface.__sizeClassesOffset_));
	}

	// MM_SizeClasses* _sizeClasses
	public PointerPointer _sizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SegregatedAllocationInterface.__sizeClassesOffset_));
	}

}
