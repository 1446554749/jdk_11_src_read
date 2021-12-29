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
 * Structure: queuePointer
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
 * The generated code will provide getters for all elements in the queuePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=queue.class)
public class queuePointer extends StructurePointer {

	// NULL
	public static final queuePointer NULL = new queuePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected queuePointer(long address) {
		super(address);
	}

	public static queuePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static queuePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static queuePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new queuePointer(address);
	}

	public queuePointer add(long count) {
		return queuePointer.cast(address + (queue.SIZEOF * count));
	}

	public queuePointer add(Scalar count) {
		return add(count.longValue());
	}

	public queuePointer addOffset(long offset) {
		return queuePointer.cast(address + offset);
	}

	public queuePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public queuePointer sub(long count) {
		return queuePointer.cast(address - (queue.SIZEOF * count));
	}

	public queuePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public queuePointer subOffset(long offset) {
		return queuePointer.cast(address - offset);
	}

	public queuePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public queuePointer untag(long mask) {
		return queuePointer.cast(address & ~mask);
	}

	public queuePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return queue.SIZEOF;
	}

	// Implementation methods

	// UtEventSem* alarm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alarmOffset_", declaredType="UtEventSem*")
	public UtEventSemPointer alarm() throws CorruptDataException {
		return UtEventSemPointer.cast(getPointerAtOffset(queue._alarmOffset_));
	}

	// UtEventSem* alarm
	public PointerPointer alarmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._alarmOffset_));
	}

	// volatile I32 alive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aliveOffset_", declaredType="volatile I32")
	public IDATA alive() throws CorruptDataException {
		return new I32(getIntAtOffset(queue._aliveOffset_));
	}

	// volatile I32 alive
	public IDATAPointer aliveEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(queue._aliveOffset_));
	}

	// I32 allocd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocdOffset_", declaredType="I32")
	public IDATA allocd() throws CorruptDataException {
		return new I32(getIntAtOffset(queue._allocdOffset_));
	}

	// I32 allocd
	public IDATAPointer allocdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(queue._allocdOffset_));
	}

	// volatile message* head
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headOffset_", declaredType="volatile message*")
	public messagePointer head() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(queue._headOffset_));
	}

	// volatile message* head
	public PointerPointer headEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._headOffset_));
	}

	// volatile omrthread_monitor_t lock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockOffset_", declaredType="volatile omrthread_monitor_t")
	public J9ThreadMonitorPointer lock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(queue._lockOffset_));
	}

	// volatile omrthread_monitor_t lock
	public PointerPointer lockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._lockOffset_));
	}

	// volatile U32 pause
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pauseOffset_", declaredType="volatile U32")
	public UDATA pause() throws CorruptDataException {
		return new U32(getIntAtOffset(queue._pauseOffset_));
	}

	// volatile U32 pause
	public UDATAPointer pauseEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(queue._pauseOffset_));
	}

	// volatile message* referenceQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceQueueOffset_", declaredType="volatile message*")
	public messagePointer referenceQueue() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(queue._referenceQueueOffset_));
	}

	// volatile message* referenceQueue
	public PointerPointer referenceQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._referenceQueueOffset_));
	}

	// subscription* subscribers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscribersOffset_", declaredType="subscription*")
	public subscriptionPointer subscribers() throws CorruptDataException {
		return subscriptionPointer.cast(getPointerAtOffset(queue._subscribersOffset_));
	}

	// subscription* subscribers
	public PointerPointer subscribersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._subscribersOffset_));
	}

	// volatile I32 subscriptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscriptionsOffset_", declaredType="volatile I32")
	public IDATA subscriptions() throws CorruptDataException {
		return new I32(getIntAtOffset(queue._subscriptionsOffset_));
	}

	// volatile I32 subscriptions
	public IDATAPointer subscriptionsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(queue._subscriptionsOffset_));
	}

	// volatile message* tail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tailOffset_", declaredType="volatile message*")
	public messagePointer tail() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(queue._tailOffset_));
	}

	// volatile message* tail
	public PointerPointer tailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(queue._tailOffset_));
	}

}
