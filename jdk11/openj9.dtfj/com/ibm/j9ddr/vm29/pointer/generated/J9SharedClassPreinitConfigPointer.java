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
 * Structure: J9SharedClassPreinitConfigPointer
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
 * The generated code will provide getters for all elements in the J9SharedClassPreinitConfigPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedClassPreinitConfig.class)
public class J9SharedClassPreinitConfigPointer extends StructurePointer {

	// NULL
	public static final J9SharedClassPreinitConfigPointer NULL = new J9SharedClassPreinitConfigPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedClassPreinitConfigPointer(long address) {
		super(address);
	}

	public static J9SharedClassPreinitConfigPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedClassPreinitConfigPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedClassPreinitConfigPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedClassPreinitConfigPointer(address);
	}

	public J9SharedClassPreinitConfigPointer add(long count) {
		return J9SharedClassPreinitConfigPointer.cast(address + (J9SharedClassPreinitConfig.SIZEOF * count));
	}

	public J9SharedClassPreinitConfigPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedClassPreinitConfigPointer addOffset(long offset) {
		return J9SharedClassPreinitConfigPointer.cast(address + offset);
	}

	public J9SharedClassPreinitConfigPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedClassPreinitConfigPointer sub(long count) {
		return J9SharedClassPreinitConfigPointer.cast(address - (J9SharedClassPreinitConfig.SIZEOF * count));
	}

	public J9SharedClassPreinitConfigPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedClassPreinitConfigPointer subOffset(long offset) {
		return J9SharedClassPreinitConfigPointer.cast(address - offset);
	}

	public J9SharedClassPreinitConfigPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedClassPreinitConfigPointer untag(long mask) {
		return J9SharedClassPreinitConfigPointer.cast(address & ~mask);
	}

	public J9SharedClassPreinitConfigPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedClassPreinitConfig.SIZEOF;
	}

	// Implementation methods

	// UDATA sharedClassCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassCacheSizeOffset_", declaredType="UDATA")
	public UDATA sharedClassCacheSize() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassPreinitConfig._sharedClassCacheSizeOffset_);
	}

	// UDATA sharedClassCacheSize
	public UDATAPointer sharedClassCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassCacheSizeOffset_));
	}

	// IDATA sharedClassDebugAreaBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassDebugAreaBytesOffset_", declaredType="IDATA")
	public IDATA sharedClassDebugAreaBytes() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassDebugAreaBytesOffset_);
	}

	// IDATA sharedClassDebugAreaBytes
	public IDATAPointer sharedClassDebugAreaBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassDebugAreaBytesOffset_));
	}

	// IDATA sharedClassInternTableNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassInternTableNodeCountOffset_", declaredType="IDATA")
	public IDATA sharedClassInternTableNodeCount() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassInternTableNodeCountOffset_);
	}

	// IDATA sharedClassInternTableNodeCount
	public IDATAPointer sharedClassInternTableNodeCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassInternTableNodeCountOffset_));
	}

	// IDATA sharedClassMaxAOTSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassMaxAOTSizeOffset_", declaredType="IDATA")
	public IDATA sharedClassMaxAOTSize() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassMaxAOTSizeOffset_);
	}

	// IDATA sharedClassMaxAOTSize
	public IDATAPointer sharedClassMaxAOTSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassMaxAOTSizeOffset_));
	}

	// IDATA sharedClassMaxJITSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassMaxJITSizeOffset_", declaredType="IDATA")
	public IDATA sharedClassMaxJITSize() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassMaxJITSizeOffset_);
	}

	// IDATA sharedClassMaxJITSize
	public IDATAPointer sharedClassMaxJITSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassMaxJITSizeOffset_));
	}

	// IDATA sharedClassMinAOTSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassMinAOTSizeOffset_", declaredType="IDATA")
	public IDATA sharedClassMinAOTSize() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassMinAOTSizeOffset_);
	}

	// IDATA sharedClassMinAOTSize
	public IDATAPointer sharedClassMinAOTSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassMinAOTSizeOffset_));
	}

	// IDATA sharedClassMinJITSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassMinJITSizeOffset_", declaredType="IDATA")
	public IDATA sharedClassMinJITSize() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassMinJITSizeOffset_);
	}

	// IDATA sharedClassMinJITSize
	public IDATAPointer sharedClassMinJITSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassMinJITSizeOffset_));
	}

	// IDATA sharedClassReadWriteBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassReadWriteBytesOffset_", declaredType="IDATA")
	public IDATA sharedClassReadWriteBytes() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassReadWriteBytesOffset_);
	}

	// IDATA sharedClassReadWriteBytes
	public IDATAPointer sharedClassReadWriteBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassReadWriteBytesOffset_));
	}

	// IDATA sharedClassSoftMaxBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedClassSoftMaxBytesOffset_", declaredType="IDATA")
	public IDATA sharedClassSoftMaxBytes() throws CorruptDataException {
		return getIDATAAtOffset(J9SharedClassPreinitConfig._sharedClassSoftMaxBytesOffset_);
	}

	// IDATA sharedClassSoftMaxBytes
	public IDATAPointer sharedClassSoftMaxBytesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SharedClassPreinitConfig._sharedClassSoftMaxBytesOffset_));
	}

}
