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
 * Structure: J9VMMonitorWaitedEventPointer
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
 * The generated code will provide getters for all elements in the J9VMMonitorWaitedEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMMonitorWaitedEvent.class)
public class J9VMMonitorWaitedEventPointer extends StructurePointer {

	// NULL
	public static final J9VMMonitorWaitedEventPointer NULL = new J9VMMonitorWaitedEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMMonitorWaitedEventPointer(long address) {
		super(address);
	}

	public static J9VMMonitorWaitedEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMMonitorWaitedEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMMonitorWaitedEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMMonitorWaitedEventPointer(address);
	}

	public J9VMMonitorWaitedEventPointer add(long count) {
		return J9VMMonitorWaitedEventPointer.cast(address + (J9VMMonitorWaitedEvent.SIZEOF * count));
	}

	public J9VMMonitorWaitedEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMMonitorWaitedEventPointer addOffset(long offset) {
		return J9VMMonitorWaitedEventPointer.cast(address + offset);
	}

	public J9VMMonitorWaitedEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMMonitorWaitedEventPointer sub(long count) {
		return J9VMMonitorWaitedEventPointer.cast(address - (J9VMMonitorWaitedEvent.SIZEOF * count));
	}

	public J9VMMonitorWaitedEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMMonitorWaitedEventPointer subOffset(long offset) {
		return J9VMMonitorWaitedEventPointer.cast(address - offset);
	}

	public J9VMMonitorWaitedEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMMonitorWaitedEventPointer untag(long mask) {
		return J9VMMonitorWaitedEventPointer.cast(address & ~mask);
	}

	public J9VMMonitorWaitedEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMMonitorWaitedEvent.SIZEOF;
	}

	// Implementation methods

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMMonitorWaitedEvent._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMMonitorWaitedEvent._currentThreadOffset_));
	}

	// I64 millis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_millisOffset_", declaredType="I64")
	public IDATA millis() throws CorruptDataException {
		return new I64(getLongAtOffset(J9VMMonitorWaitedEvent._millisOffset_));
	}

	// I64 millis
	public IDATAPointer millisEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMMonitorWaitedEvent._millisOffset_));
	}

	// omrthread_monitor_t monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer monitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9VMMonitorWaitedEvent._monitorOffset_));
	}

	// omrthread_monitor_t monitor
	public PointerPointer monitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMMonitorWaitedEvent._monitorOffset_));
	}

	// I32 nanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nanosOffset_", declaredType="I32")
	public IDATA nanos() throws CorruptDataException {
		return new I32(getIntAtOffset(J9VMMonitorWaitedEvent._nanosOffset_));
	}

	// I32 nanos
	public IDATAPointer nanosEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMMonitorWaitedEvent._nanosOffset_));
	}

	// IDATA reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reasonOffset_", declaredType="IDATA")
	public IDATA reason() throws CorruptDataException {
		return getIDATAAtOffset(J9VMMonitorWaitedEvent._reasonOffset_);
	}

	// IDATA reason
	public IDATAPointer reasonEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMMonitorWaitedEvent._reasonOffset_));
	}

}
