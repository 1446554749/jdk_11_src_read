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
 * Structure: MM_ConcurrentGlobalMarkTaskPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentGlobalMarkTaskPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentGlobalMarkTask.class)
public class MM_ConcurrentGlobalMarkTaskPointer extends MM_ParallelGlobalMarkTaskPointer {

	// NULL
	public static final MM_ConcurrentGlobalMarkTaskPointer NULL = new MM_ConcurrentGlobalMarkTaskPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentGlobalMarkTaskPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentGlobalMarkTaskPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentGlobalMarkTaskPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentGlobalMarkTaskPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentGlobalMarkTaskPointer(address);
	}

	public MM_ConcurrentGlobalMarkTaskPointer add(long count) {
		return MM_ConcurrentGlobalMarkTaskPointer.cast(address + (MM_ConcurrentGlobalMarkTask.SIZEOF * count));
	}

	public MM_ConcurrentGlobalMarkTaskPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentGlobalMarkTaskPointer addOffset(long offset) {
		return MM_ConcurrentGlobalMarkTaskPointer.cast(address + offset);
	}

	public MM_ConcurrentGlobalMarkTaskPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentGlobalMarkTaskPointer sub(long count) {
		return MM_ConcurrentGlobalMarkTaskPointer.cast(address - (MM_ConcurrentGlobalMarkTask.SIZEOF * count));
	}

	public MM_ConcurrentGlobalMarkTaskPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentGlobalMarkTaskPointer subOffset(long offset) {
		return MM_ConcurrentGlobalMarkTaskPointer.cast(address - offset);
	}

	public MM_ConcurrentGlobalMarkTaskPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentGlobalMarkTaskPointer untag(long mask) {
		return MM_ConcurrentGlobalMarkTaskPointer.cast(address & ~mask);
	}

	public MM_ConcurrentGlobalMarkTaskPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentGlobalMarkTask.SIZEOF;
	}

	// Implementation methods

	// volatile UDATA _bytesScanned
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesScannedOffset_", declaredType="volatile UDATA")
	public UDATA _bytesScanned() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentGlobalMarkTask.__bytesScannedOffset_);
	}

	// volatile UDATA _bytesScanned
	public UDATAPointer _bytesScannedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGlobalMarkTask.__bytesScannedOffset_));
	}

	// const UDATA _bytesToScan
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesToScanOffset_", declaredType="const UDATA")
	public UDATA _bytesToScan() throws CorruptDataException {
		return getUDATAAtOffset(MM_ConcurrentGlobalMarkTask.__bytesToScanOffset_);
	}

	// const UDATA _bytesToScan
	public UDATAPointer _bytesToScanEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGlobalMarkTask.__bytesToScanOffset_));
	}

	// bool _didReturnEarly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__didReturnEarlyOffset_", declaredType="bool")
	public boolean _didReturnEarly() throws CorruptDataException {
		return getBoolAtOffset(MM_ConcurrentGlobalMarkTask.__didReturnEarlyOffset_);
	}

	// bool _didReturnEarly
	public BoolPointer _didReturnEarlyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConcurrentGlobalMarkTask.__didReturnEarlyOffset_));
	}

	// const volatile bool* _forceExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceExitOffset_", declaredType="const volatile bool*")
	public BoolPointer _forceExit() throws CorruptDataException {
		return BoolPointer.cast(getPointerAtOffset(MM_ConcurrentGlobalMarkTask.__forceExitOffset_));
	}

	// const volatile bool* _forceExit
	public PointerPointer _forceExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGlobalMarkTask.__forceExitOffset_));
	}

}
