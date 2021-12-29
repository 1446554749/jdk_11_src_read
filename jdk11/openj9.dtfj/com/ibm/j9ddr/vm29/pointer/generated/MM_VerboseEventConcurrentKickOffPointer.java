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
 * Structure: MM_VerboseEventConcurrentKickOffPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventConcurrentKickOffPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventConcurrentKickOff.class)
public class MM_VerboseEventConcurrentKickOffPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventConcurrentKickOffPointer NULL = new MM_VerboseEventConcurrentKickOffPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventConcurrentKickOffPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventConcurrentKickOffPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventConcurrentKickOffPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventConcurrentKickOffPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventConcurrentKickOffPointer(address);
	}

	public MM_VerboseEventConcurrentKickOffPointer add(long count) {
		return MM_VerboseEventConcurrentKickOffPointer.cast(address + (MM_VerboseEventConcurrentKickOff.SIZEOF * count));
	}

	public MM_VerboseEventConcurrentKickOffPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventConcurrentKickOffPointer addOffset(long offset) {
		return MM_VerboseEventConcurrentKickOffPointer.cast(address + offset);
	}

	public MM_VerboseEventConcurrentKickOffPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventConcurrentKickOffPointer sub(long count) {
		return MM_VerboseEventConcurrentKickOffPointer.cast(address - (MM_VerboseEventConcurrentKickOff.SIZEOF * count));
	}

	public MM_VerboseEventConcurrentKickOffPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventConcurrentKickOffPointer subOffset(long offset) {
		return MM_VerboseEventConcurrentKickOffPointer.cast(address - offset);
	}

	public MM_VerboseEventConcurrentKickOffPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventConcurrentKickOffPointer untag(long mask) {
		return MM_VerboseEventConcurrentKickOffPointer.cast(address & ~mask);
	}

	public MM_VerboseEventConcurrentKickOffPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventConcurrentKickOff.SIZEOF;
	}

	// Implementation methods

	// UDATA _kickOffReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__kickOffReasonOffset_", declaredType="UDATA")
	public UDATA _kickOffReason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__kickOffReasonOffset_);
	}

	// UDATA _kickOffReason
	public UDATAPointer _kickOffReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__kickOffReasonOffset_));
	}

	// UDATA _kickOffThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__kickOffThresholdOffset_", declaredType="UDATA")
	public UDATA _kickOffThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__kickOffThresholdOffset_);
	}

	// UDATA _kickOffThreshold
	public UDATAPointer _kickOffThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__kickOffThresholdOffset_));
	}

	// UDATA _languageKickOffReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__languageKickOffReasonOffset_", declaredType="UDATA")
	public UDATA _languageKickOffReason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__languageKickOffReasonOffset_);
	}

	// UDATA _languageKickOffReason
	public UDATAPointer _languageKickOffReasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__languageKickOffReasonOffset_));
	}

	// UDATA _nurseryFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryFreeBytesOffset_", declaredType="UDATA")
	public UDATA _nurseryFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__nurseryFreeBytesOffset_);
	}

	// UDATA _nurseryFreeBytes
	public UDATAPointer _nurseryFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__nurseryFreeBytesOffset_));
	}

	// UDATA _tenureFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureFreeBytesOffset_", declaredType="UDATA")
	public UDATA _tenureFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__tenureFreeBytesOffset_);
	}

	// UDATA _tenureFreeBytes
	public UDATAPointer _tenureFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__tenureFreeBytesOffset_));
	}

	// I64 _timeInMilliSeconds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeInMilliSecondsOffset_", declaredType="I64")
	public IDATA _timeInMilliSeconds() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_VerboseEventConcurrentKickOff.__timeInMilliSecondsOffset_));
	}

	// I64 _timeInMilliSeconds
	public IDATAPointer _timeInMilliSecondsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__timeInMilliSecondsOffset_));
	}

	// UDATA _traceTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__traceTargetOffset_", declaredType="UDATA")
	public UDATA _traceTarget() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventConcurrentKickOff.__traceTargetOffset_);
	}

	// UDATA _traceTarget
	public UDATAPointer _traceTargetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventConcurrentKickOff.__traceTargetOffset_));
	}

}
