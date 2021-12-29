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
 * Structure: J9JVMTIMonitorStatsPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIMonitorStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIMonitorStats.class)
public class J9JVMTIMonitorStatsPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIMonitorStatsPointer NULL = new J9JVMTIMonitorStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIMonitorStatsPointer(long address) {
		super(address);
	}

	public static J9JVMTIMonitorStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIMonitorStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIMonitorStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIMonitorStatsPointer(address);
	}

	public J9JVMTIMonitorStatsPointer add(long count) {
		return J9JVMTIMonitorStatsPointer.cast(address + (J9JVMTIMonitorStats.SIZEOF * count));
	}

	public J9JVMTIMonitorStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIMonitorStatsPointer addOffset(long offset) {
		return J9JVMTIMonitorStatsPointer.cast(address + offset);
	}

	public J9JVMTIMonitorStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIMonitorStatsPointer sub(long count) {
		return J9JVMTIMonitorStatsPointer.cast(address - (J9JVMTIMonitorStats.SIZEOF * count));
	}

	public J9JVMTIMonitorStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIMonitorStatsPointer subOffset(long offset) {
		return J9JVMTIMonitorStatsPointer.cast(address - offset);
	}

	public J9JVMTIMonitorStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIMonitorStatsPointer untag(long mask) {
		return J9JVMTIMonitorStatsPointer.cast(address & ~mask);
	}

	public J9JVMTIMonitorStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIMonitorStats.SIZEOF;
	}

	// Implementation methods

	// jthread* blocked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockedOffset_", declaredType="jthread*")
	public PointerPointer blocked() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JVMTIMonitorStats._blockedOffset_));
	}

	// jthread* blocked
	public PointerPointer blockedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._blockedOffset_));
	}

	// UDATA blockedCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockedCntrOffset_", declaredType="UDATA")
	public UDATA blockedCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIMonitorStats._blockedCntrOffset_);
	}

	// UDATA blockedCntr
	public UDATAPointer blockedCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._blockedCntrOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JVMTIMonitorStats._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._currentThreadOffset_));
	}

	// j9object_t lockObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer lockObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JVMTIMonitorStats._lockObjectOffset_));
	}

	// j9object_t lockObject
	public PointerPointer lockObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._lockObjectOffset_));
	}

	// UDATA numBlocked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numBlockedOffset_", declaredType="UDATA")
	public UDATA numBlocked() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIMonitorStats._numBlockedOffset_);
	}

	// UDATA numBlocked
	public UDATAPointer numBlockedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._numBlockedOffset_));
	}

	// UDATA numWaiting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numWaitingOffset_", declaredType="UDATA")
	public UDATA numWaiting() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIMonitorStats._numWaitingOffset_);
	}

	// UDATA numWaiting
	public UDATAPointer numWaitingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._numWaitingOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JVMTIMonitorStats._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._vmOffset_));
	}

	// jthread* waiting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitingOffset_", declaredType="jthread*")
	public PointerPointer waiting() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JVMTIMonitorStats._waitingOffset_));
	}

	// jthread* waiting
	public PointerPointer waitingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._waitingOffset_));
	}

	// UDATA waitingCntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitingCntrOffset_", declaredType="UDATA")
	public UDATA waitingCntr() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIMonitorStats._waitingCntrOffset_);
	}

	// UDATA waitingCntr
	public UDATAPointer waitingCntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIMonitorStats._waitingCntrOffset_));
	}

}
