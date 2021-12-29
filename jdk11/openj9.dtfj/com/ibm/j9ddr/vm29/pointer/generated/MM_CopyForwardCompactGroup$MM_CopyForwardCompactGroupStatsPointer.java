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
 * Structure: MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer
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
 * The generated code will provide getters for all elements in the MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.class)
public class MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer extends StructurePointer {

	// NULL
	public static final MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer NULL = new MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer(long address) {
		super(address);
	}

	public static MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer(address);
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer add(long count) {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(address + (MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.SIZEOF * count));
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer addOffset(long offset) {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(address + offset);
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer sub(long count) {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(address - (MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.SIZEOF * count));
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer subOffset(long offset) {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(address - offset);
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer untag(long mask) {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer.cast(address & ~mask);
	}

	public MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.SIZEOF;
	}

	// Implementation methods

	// UDATA _copiedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copiedBytesOffset_", declaredType="UDATA")
	public UDATA _copiedBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__copiedBytesOffset_);
	}

	// UDATA _copiedBytes
	public UDATAPointer _copiedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__copiedBytesOffset_));
	}

	// UDATA _copiedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copiedObjectsOffset_", declaredType="UDATA")
	public UDATA _copiedObjects() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__copiedObjectsOffset_);
	}

	// UDATA _copiedObjects
	public UDATAPointer _copiedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__copiedObjectsOffset_));
	}

	// UDATA _liveBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveBytesOffset_", declaredType="UDATA")
	public UDATA _liveBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__liveBytesOffset_);
	}

	// UDATA _liveBytes
	public UDATAPointer _liveBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__liveBytesOffset_));
	}

	// UDATA _liveObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__liveObjectsOffset_", declaredType="UDATA")
	public UDATA _liveObjects() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__liveObjectsOffset_);
	}

	// UDATA _liveObjects
	public UDATAPointer _liveObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__liveObjectsOffset_));
	}

	// UDATA _scannedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannedBytesOffset_", declaredType="UDATA")
	public UDATA _scannedBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__scannedBytesOffset_);
	}

	// UDATA _scannedBytes
	public UDATAPointer _scannedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__scannedBytesOffset_));
	}

	// UDATA _scannedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scannedObjectsOffset_", declaredType="UDATA")
	public UDATA _scannedObjects() throws CorruptDataException {
		return getUDATAAtOffset(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__scannedObjectsOffset_);
	}

	// UDATA _scannedObjects
	public UDATAPointer _scannedObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CopyForwardCompactGroup$MM_CopyForwardCompactGroupStats.__scannedObjectsOffset_));
	}

}
