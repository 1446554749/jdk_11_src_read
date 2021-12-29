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
 * Structure: TgcInterRegionRememberedSetDemographicsExtensionPointer
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
 * The generated code will provide getters for all elements in the TgcInterRegionRememberedSetDemographicsExtensionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=TgcInterRegionRememberedSetDemographicsExtension.class)
public class TgcInterRegionRememberedSetDemographicsExtensionPointer extends StructurePointer {

	// NULL
	public static final TgcInterRegionRememberedSetDemographicsExtensionPointer NULL = new TgcInterRegionRememberedSetDemographicsExtensionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected TgcInterRegionRememberedSetDemographicsExtensionPointer(long address) {
		super(address);
	}

	public static TgcInterRegionRememberedSetDemographicsExtensionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static TgcInterRegionRememberedSetDemographicsExtensionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static TgcInterRegionRememberedSetDemographicsExtensionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new TgcInterRegionRememberedSetDemographicsExtensionPointer(address);
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer add(long count) {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(address + (TgcInterRegionRememberedSetDemographicsExtension.SIZEOF * count));
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer addOffset(long offset) {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(address + offset);
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer sub(long count) {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(address - (TgcInterRegionRememberedSetDemographicsExtension.SIZEOF * count));
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer subOffset(long offset) {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(address - offset);
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer untag(long mask) {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(address & ~mask);
	}

	public TgcInterRegionRememberedSetDemographicsExtensionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return TgcInterRegionRememberedSetDemographicsExtension.SIZEOF;
	}

	// Implementation methods

	// J9HashTable* classHashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classHashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer classHashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(TgcInterRegionRememberedSetDemographicsExtension._classHashTableOffset_));
	}

	// J9HashTable* classHashTable
	public PointerPointer classHashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TgcInterRegionRememberedSetDemographicsExtension._classHashTableOffset_));
	}

	// UDATA errorCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorCountOffset_", declaredType="UDATA")
	public UDATA errorCount() throws CorruptDataException {
		return getUDATAAtOffset(TgcInterRegionRememberedSetDemographicsExtension._errorCountOffset_);
	}

	// UDATA errorCount
	public UDATAPointer errorCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcInterRegionRememberedSetDemographicsExtension._errorCountOffset_));
	}

	// UDATA incrementCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_incrementCountOffset_", declaredType="UDATA")
	public UDATA incrementCount() throws CorruptDataException {
		return getUDATAAtOffset(TgcInterRegionRememberedSetDemographicsExtension._incrementCountOffset_);
	}

	// UDATA incrementCount
	public UDATAPointer incrementCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcInterRegionRememberedSetDemographicsExtension._incrementCountOffset_));
	}

	// omrthread_monitor_t mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(TgcInterRegionRememberedSetDemographicsExtension._mutexOffset_));
	}

	// omrthread_monitor_t mutex
	public PointerPointer mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TgcInterRegionRememberedSetDemographicsExtension._mutexOffset_));
	}

	// UDATA totalRememberedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalRememberedObjectsOffset_", declaredType="UDATA")
	public UDATA totalRememberedObjects() throws CorruptDataException {
		return getUDATAAtOffset(TgcInterRegionRememberedSetDemographicsExtension._totalRememberedObjectsOffset_);
	}

	// UDATA totalRememberedObjects
	public UDATAPointer totalRememberedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcInterRegionRememberedSetDemographicsExtension._totalRememberedObjectsOffset_));
	}

}
