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
 * Structure: MM_VerboseEventCompletedConcurrentSweepPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventCompletedConcurrentSweepPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventCompletedConcurrentSweep.class)
public class MM_VerboseEventCompletedConcurrentSweepPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventCompletedConcurrentSweepPointer NULL = new MM_VerboseEventCompletedConcurrentSweepPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventCompletedConcurrentSweepPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventCompletedConcurrentSweepPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventCompletedConcurrentSweepPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventCompletedConcurrentSweepPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventCompletedConcurrentSweepPointer(address);
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer add(long count) {
		return MM_VerboseEventCompletedConcurrentSweepPointer.cast(address + (MM_VerboseEventCompletedConcurrentSweep.SIZEOF * count));
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer addOffset(long offset) {
		return MM_VerboseEventCompletedConcurrentSweepPointer.cast(address + offset);
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer sub(long count) {
		return MM_VerboseEventCompletedConcurrentSweepPointer.cast(address - (MM_VerboseEventCompletedConcurrentSweep.SIZEOF * count));
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer subOffset(long offset) {
		return MM_VerboseEventCompletedConcurrentSweepPointer.cast(address - offset);
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer untag(long mask) {
		return MM_VerboseEventCompletedConcurrentSweepPointer.cast(address & ~mask);
	}

	public MM_VerboseEventCompletedConcurrentSweepPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventCompletedConcurrentSweep.SIZEOF;
	}

	// Implementation methods

	// UDATA _bytesConnected
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesConnectedOffset_", declaredType="UDATA")
	public UDATA _bytesConnected() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventCompletedConcurrentSweep.__bytesConnectedOffset_);
	}

	// UDATA _bytesConnected
	public UDATAPointer _bytesConnectedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__bytesConnectedOffset_));
	}

	// UDATA _bytesSwept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesSweptOffset_", declaredType="UDATA")
	public UDATA _bytesSwept() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventCompletedConcurrentSweep.__bytesSweptOffset_);
	}

	// UDATA _bytesSwept
	public UDATAPointer _bytesSweptEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__bytesSweptOffset_));
	}

	// UDATA _reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reasonOffset_", declaredType="UDATA")
	public UDATA _reason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventCompletedConcurrentSweep.__reasonOffset_);
	}

	// UDATA _reason
	public UDATAPointer _reasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__reasonOffset_));
	}

	// U64 _timeElapsedConnect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeElapsedConnectOffset_", declaredType="U64")
	public UDATA _timeElapsedConnect() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventCompletedConcurrentSweep.__timeElapsedConnectOffset_));
	}

	// U64 _timeElapsedConnect
	public UDATAPointer _timeElapsedConnectEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__timeElapsedConnectOffset_));
	}

	// U64 _timeElapsedSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeElapsedSweepOffset_", declaredType="U64")
	public UDATA _timeElapsedSweep() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventCompletedConcurrentSweep.__timeElapsedSweepOffset_));
	}

	// U64 _timeElapsedSweep
	public UDATAPointer _timeElapsedSweepEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__timeElapsedSweepOffset_));
	}

	// I64 _timeInMilliSeconds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeInMilliSecondsOffset_", declaredType="I64")
	public IDATA _timeInMilliSeconds() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_VerboseEventCompletedConcurrentSweep.__timeInMilliSecondsOffset_));
	}

	// I64 _timeInMilliSeconds
	public IDATAPointer _timeInMilliSecondsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_VerboseEventCompletedConcurrentSweep.__timeInMilliSecondsOffset_));
	}

}
