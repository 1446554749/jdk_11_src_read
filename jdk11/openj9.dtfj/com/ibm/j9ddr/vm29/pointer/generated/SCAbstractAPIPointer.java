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
 * Structure: SCAbstractAPIPointer
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
 * The generated code will provide getters for all elements in the SCAbstractAPIPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SCAbstractAPI.class)
public class SCAbstractAPIPointer extends StructurePointer {

	// NULL
	public static final SCAbstractAPIPointer NULL = new SCAbstractAPIPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SCAbstractAPIPointer(long address) {
		super(address);
	}

	public static SCAbstractAPIPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SCAbstractAPIPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SCAbstractAPIPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SCAbstractAPIPointer(address);
	}

	public SCAbstractAPIPointer add(long count) {
		return SCAbstractAPIPointer.cast(address + (SCAbstractAPI.SIZEOF * count));
	}

	public SCAbstractAPIPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SCAbstractAPIPointer addOffset(long offset) {
		return SCAbstractAPIPointer.cast(address + offset);
	}

	public SCAbstractAPIPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SCAbstractAPIPointer sub(long count) {
		return SCAbstractAPIPointer.cast(address - (SCAbstractAPI.SIZEOF * count));
	}

	public SCAbstractAPIPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SCAbstractAPIPointer subOffset(long offset) {
		return SCAbstractAPIPointer.cast(address - offset);
	}

	public SCAbstractAPIPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SCAbstractAPIPointer untag(long mask) {
		return SCAbstractAPIPointer.cast(address & ~mask);
	}

	public SCAbstractAPIPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SCAbstractAPI.SIZEOF;
	}

	// Implementation methods

	// void* classStoreTransaction_createSharedClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_createSharedClassOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_createSharedClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_createSharedClassOffset_));
	}

	// void* classStoreTransaction_createSharedClass
	public PointerPointer classStoreTransaction_createSharedClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_createSharedClassOffset_));
	}

	// void* classStoreTransaction_hasSharedStringTableLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_hasSharedStringTableLockOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_hasSharedStringTableLock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_hasSharedStringTableLockOffset_));
	}

	// void* classStoreTransaction_hasSharedStringTableLock
	public PointerPointer classStoreTransaction_hasSharedStringTableLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_hasSharedStringTableLockOffset_));
	}

	// void* classStoreTransaction_isOK
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_isOKOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_isOK() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_isOKOffset_));
	}

	// void* classStoreTransaction_isOK
	public PointerPointer classStoreTransaction_isOKEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_isOKOffset_));
	}

	// void* classStoreTransaction_nextSharedClassForCompare
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_nextSharedClassForCompareOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_nextSharedClassForCompare() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_nextSharedClassForCompareOffset_));
	}

	// void* classStoreTransaction_nextSharedClassForCompare
	public PointerPointer classStoreTransaction_nextSharedClassForCompareEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_nextSharedClassForCompareOffset_));
	}

	// void* classStoreTransaction_start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_startOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_start() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_startOffset_));
	}

	// void* classStoreTransaction_start
	public PointerPointer classStoreTransaction_startEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_startOffset_));
	}

	// void* classStoreTransaction_stop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_stopOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_stop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_stopOffset_));
	}

	// void* classStoreTransaction_stop
	public PointerPointer classStoreTransaction_stopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_stopOffset_));
	}

	// void* classStoreTransaction_updateSharedClassSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_updateSharedClassSizeOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_updateSharedClassSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_updateSharedClassSizeOffset_));
	}

	// void* classStoreTransaction_updateSharedClassSize
	public PointerPointer classStoreTransaction_updateSharedClassSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_updateSharedClassSizeOffset_));
	}

	// void* classStoreTransaction_updateUnstoredBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classStoreTransaction_updateUnstoredBytesOffset_", declaredType="void*")
	public VoidPointer classStoreTransaction_updateUnstoredBytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._classStoreTransaction_updateUnstoredBytesOffset_));
	}

	// void* classStoreTransaction_updateUnstoredBytes
	public PointerPointer classStoreTransaction_updateUnstoredBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._classStoreTransaction_updateUnstoredBytesOffset_));
	}

	// void* isAddressInCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isAddressInCacheOffset_", declaredType="void*")
	public VoidPointer isAddressInCache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._isAddressInCacheOffset_));
	}

	// void* isAddressInCache
	public PointerPointer isAddressInCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._isAddressInCacheOffset_));
	}

	// void* isCacheFull
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isCacheFullOffset_", declaredType="void*")
	public VoidPointer isCacheFull() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._isCacheFullOffset_));
	}

	// void* isCacheFull
	public PointerPointer isCacheFullEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._isCacheFullOffset_));
	}

	// void* jclUpdateROMClassMetaData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jclUpdateROMClassMetaDataOffset_", declaredType="void*")
	public VoidPointer jclUpdateROMClassMetaData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._jclUpdateROMClassMetaDataOffset_));
	}

	// void* jclUpdateROMClassMetaData
	public PointerPointer jclUpdateROMClassMetaDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._jclUpdateROMClassMetaDataOffset_));
	}

	// void* populatePreinitConfigDefaults
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_populatePreinitConfigDefaultsOffset_", declaredType="void*")
	public VoidPointer populatePreinitConfigDefaults() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._populatePreinitConfigDefaultsOffset_));
	}

	// void* populatePreinitConfigDefaults
	public PointerPointer populatePreinitConfigDefaultsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._populatePreinitConfigDefaultsOffset_));
	}

	// void* sharedClassesFinishInitialization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassesFinishInitializationOffset_", declaredType="void*")
	public VoidPointer sharedClassesFinishInitialization() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._sharedClassesFinishInitializationOffset_));
	}

	// void* sharedClassesFinishInitialization
	public PointerPointer sharedClassesFinishInitializationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._sharedClassesFinishInitializationOffset_));
	}

	// void* stringTransaction_IsOK
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringTransaction_IsOKOffset_", declaredType="void*")
	public VoidPointer stringTransaction_IsOK() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._stringTransaction_IsOKOffset_));
	}

	// void* stringTransaction_IsOK
	public PointerPointer stringTransaction_IsOKEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._stringTransaction_IsOKOffset_));
	}

	// void* stringTransaction_start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringTransaction_startOffset_", declaredType="void*")
	public VoidPointer stringTransaction_start() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._stringTransaction_startOffset_));
	}

	// void* stringTransaction_start
	public PointerPointer stringTransaction_startEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._stringTransaction_startOffset_));
	}

	// void* stringTransaction_stop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringTransaction_stopOffset_", declaredType="void*")
	public VoidPointer stringTransaction_stop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SCAbstractAPI._stringTransaction_stopOffset_));
	}

	// void* stringTransaction_stop
	public PointerPointer stringTransaction_stopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SCAbstractAPI._stringTransaction_stopOffset_));
	}

}
