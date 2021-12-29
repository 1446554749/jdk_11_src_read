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
 * Structure: J9NLSDataCachePointer
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
 * The generated code will provide getters for all elements in the J9NLSDataCachePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9NLSDataCache.class)
public class J9NLSDataCachePointer extends StructurePointer {

	// NULL
	public static final J9NLSDataCachePointer NULL = new J9NLSDataCachePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9NLSDataCachePointer(long address) {
		super(address);
	}

	public static J9NLSDataCachePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9NLSDataCachePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9NLSDataCachePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9NLSDataCachePointer(address);
	}

	public J9NLSDataCachePointer add(long count) {
		return J9NLSDataCachePointer.cast(address + (J9NLSDataCache.SIZEOF * count));
	}

	public J9NLSDataCachePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9NLSDataCachePointer addOffset(long offset) {
		return J9NLSDataCachePointer.cast(address + offset);
	}

	public J9NLSDataCachePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9NLSDataCachePointer sub(long count) {
		return J9NLSDataCachePointer.cast(address - (J9NLSDataCache.SIZEOF * count));
	}

	public J9NLSDataCachePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9NLSDataCachePointer subOffset(long offset) {
		return J9NLSDataCachePointer.cast(address - offset);
	}

	public J9NLSDataCachePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9NLSDataCachePointer untag(long mask) {
		return J9NLSDataCachePointer.cast(address & ~mask);
	}

	public J9NLSDataCachePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9NLSDataCache.SIZEOF;
	}

	// Implementation methods

	// U8* baseCatalogExtension
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseCatalogExtensionOffset_", declaredType="U8*")
	public U8Pointer baseCatalogExtension() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9NLSDataCache._baseCatalogExtensionOffset_));
	}

	// U8* baseCatalogExtension
	public PointerPointer baseCatalogExtensionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._baseCatalogExtensionOffset_));
	}

	// U8* baseCatalogName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseCatalogNameOffset_", declaredType="U8*")
	public U8Pointer baseCatalogName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9NLSDataCache._baseCatalogNameOffset_));
	}

	// U8* baseCatalogName
	public PointerPointer baseCatalogNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._baseCatalogNameOffset_));
	}

	// U8*[] baseCatalogPaths
	public PointerPointer baseCatalogPathsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._baseCatalogPathsOffset_));
	}

	// U8* catalog
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_catalogOffset_", declaredType="U8*")
	public U8Pointer catalog() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9NLSDataCache._catalogOffset_));
	}

	// U8* catalog
	public PointerPointer catalogEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._catalogOffset_));
	}

	// J9NLSHashEntry*[] hash_buckets
	public PointerPointer hash_bucketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._hash_bucketsOffset_));
	}

	// U64 isDisabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isDisabledOffset_", declaredType="U64")
	public UDATA isDisabled() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NLSDataCache._isDisabledOffset_));
	}

	// U64 isDisabled
	public UDATAPointer isDisabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NLSDataCache._isDisabledOffset_));
	}

	// U8[] language
	public U8Pointer languageEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9NLSDataCache._languageOffset_));
	}

	// J9ThreadMonitor* monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorOffset_", declaredType="J9ThreadMonitor*")
	public J9ThreadMonitorPointer monitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9NLSDataCache._monitorOffset_));
	}

	// J9ThreadMonitor* monitor
	public PointerPointer monitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._monitorOffset_));
	}

	// U64 nPaths
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nPathsOffset_", declaredType="U64")
	public UDATA nPaths() throws CorruptDataException {
		return new U64(getLongAtOffset(J9NLSDataCache._nPathsOffset_));
	}

	// U64 nPaths
	public UDATAPointer nPathsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NLSDataCache._nPathsOffset_));
	}

	// J9NLSHashEntry* old_hashEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_old_hashEntriesOffset_", declaredType="J9NLSHashEntry*")
	public J9NLSHashEntryPointer old_hashEntries() throws CorruptDataException {
		return J9NLSHashEntryPointer.cast(getPointerAtOffset(J9NLSDataCache._old_hashEntriesOffset_));
	}

	// J9NLSHashEntry* old_hashEntries
	public PointerPointer old_hashEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NLSDataCache._old_hashEntriesOffset_));
	}

	// U8[] region
	public U8Pointer regionEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9NLSDataCache._regionOffset_));
	}

	// U8[] variant
	public U8Pointer variantEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9NLSDataCache._variantOffset_));
	}

}
