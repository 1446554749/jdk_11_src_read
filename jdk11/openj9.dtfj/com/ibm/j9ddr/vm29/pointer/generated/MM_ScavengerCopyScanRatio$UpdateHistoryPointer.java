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
 * Structure: MM_ScavengerCopyScanRatio$UpdateHistoryPointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerCopyScanRatio$UpdateHistoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ScavengerCopyScanRatio$UpdateHistory.class)
public class MM_ScavengerCopyScanRatio$UpdateHistoryPointer extends StructurePointer {

	// NULL
	public static final MM_ScavengerCopyScanRatio$UpdateHistoryPointer NULL = new MM_ScavengerCopyScanRatio$UpdateHistoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerCopyScanRatio$UpdateHistoryPointer(long address) {
		super(address);
	}

	public static MM_ScavengerCopyScanRatio$UpdateHistoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerCopyScanRatio$UpdateHistoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerCopyScanRatio$UpdateHistoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerCopyScanRatio$UpdateHistoryPointer(address);
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer add(long count) {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(address + (MM_ScavengerCopyScanRatio$UpdateHistory.SIZEOF * count));
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer addOffset(long offset) {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(address + offset);
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer sub(long count) {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(address - (MM_ScavengerCopyScanRatio$UpdateHistory.SIZEOF * count));
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer subOffset(long offset) {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(address - offset);
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer untag(long mask) {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(address & ~mask);
	}

	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ScavengerCopyScanRatio$UpdateHistory.SIZEOF;
	}

	// Implementation methods

	// U64 caches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cachesOffset_", declaredType="U64")
	public UDATA caches() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._cachesOffset_));
	}

	// U64 caches
	public UDATAPointer cachesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._cachesOffset_));
	}

	// U64 copied
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_copiedOffset_", declaredType="U64")
	public UDATA copied() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._copiedOffset_));
	}

	// U64 copied
	public UDATAPointer copiedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._copiedOffset_));
	}

	// U64 lists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_listsOffset_", declaredType="U64")
	public UDATA lists() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._listsOffset_));
	}

	// U64 lists
	public UDATAPointer listsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._listsOffset_));
	}

	// U64 majorUpdates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_majorUpdatesOffset_", declaredType="U64")
	public UDATA majorUpdates() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._majorUpdatesOffset_));
	}

	// U64 majorUpdates
	public UDATAPointer majorUpdatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._majorUpdatesOffset_));
	}

	// U64 readObjectBarrierCopy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readObjectBarrierCopyOffset_", declaredType="U64")
	public UDATA readObjectBarrierCopy() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._readObjectBarrierCopyOffset_));
	}

	// U64 readObjectBarrierCopy
	public UDATAPointer readObjectBarrierCopyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._readObjectBarrierCopyOffset_));
	}

	// U64 readObjectBarrierUpdate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_readObjectBarrierUpdateOffset_", declaredType="U64")
	public UDATA readObjectBarrierUpdate() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._readObjectBarrierUpdateOffset_));
	}

	// U64 readObjectBarrierUpdate
	public UDATAPointer readObjectBarrierUpdateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._readObjectBarrierUpdateOffset_));
	}

	// U64 scanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scannedOffset_", declaredType="U64")
	public UDATA scanned() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._scannedOffset_));
	}

	// U64 scanned
	public UDATAPointer scannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._scannedOffset_));
	}

	// U64 threads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadsOffset_", declaredType="U64")
	public UDATA threads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._threadsOffset_));
	}

	// U64 threads
	public UDATAPointer threadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._threadsOffset_));
	}

	// U64 time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timeOffset_", declaredType="U64")
	public UDATA time() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._timeOffset_));
	}

	// U64 time
	public UDATAPointer timeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._timeOffset_));
	}

	// U64 updates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_updatesOffset_", declaredType="U64")
	public UDATA updates() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._updatesOffset_));
	}

	// U64 updates
	public UDATAPointer updatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._updatesOffset_));
	}

	// U64 waits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitsOffset_", declaredType="U64")
	public UDATA waits() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio$UpdateHistory._waitsOffset_));
	}

	// U64 waits
	public UDATAPointer waitsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio$UpdateHistory._waitsOffset_));
	}

}
