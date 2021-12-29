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
 * Structure: UtSubscriptionPointer
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
 * The generated code will provide getters for all elements in the UtSubscriptionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtSubscription.class)
public class UtSubscriptionPointer extends StructurePointer {

	// NULL
	public static final UtSubscriptionPointer NULL = new UtSubscriptionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtSubscriptionPointer(long address) {
		super(address);
	}

	public static UtSubscriptionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtSubscriptionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtSubscriptionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtSubscriptionPointer(address);
	}

	public UtSubscriptionPointer add(long count) {
		return UtSubscriptionPointer.cast(address + (UtSubscription.SIZEOF * count));
	}

	public UtSubscriptionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtSubscriptionPointer addOffset(long offset) {
		return UtSubscriptionPointer.cast(address + offset);
	}

	public UtSubscriptionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtSubscriptionPointer sub(long count) {
		return UtSubscriptionPointer.cast(address - (UtSubscription.SIZEOF * count));
	}

	public UtSubscriptionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtSubscriptionPointer subOffset(long offset) {
		return UtSubscriptionPointer.cast(address - offset);
	}

	public UtSubscriptionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtSubscriptionPointer untag(long mask) {
		return UtSubscriptionPointer.cast(address & ~mask);
	}

	public UtSubscriptionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtSubscription.SIZEOF;
	}

	// Implementation methods

	// volatile utsSubscriberAlarmCallback alarm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alarmOffset_", declaredType="volatile utsSubscriberAlarmCallback")
	public VoidPointer alarm() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtSubscription._alarmOffset_));
	}

	// volatile utsSubscriberAlarmCallback alarm
	public PointerPointer alarmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._alarmOffset_));
	}

	// void* data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataOffset_", declaredType="void*")
	public VoidPointer data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtSubscription._dataOffset_));
	}

	// void* data
	public PointerPointer dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._dataOffset_));
	}

	// I32 dataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataLengthOffset_", declaredType="I32")
	public IDATA dataLength() throws CorruptDataException {
		return new I32(getIntAtOffset(UtSubscription._dataLengthOffset_));
	}

	// I32 dataLength
	public IDATAPointer dataLengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtSubscription._dataLengthOffset_));
	}

	// U8* description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_descriptionOffset_", declaredType="U8*")
	public U8Pointer description() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtSubscription._descriptionOffset_));
	}

	// U8* description
	public PointerPointer descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._descriptionOffset_));
	}

	// UtSubscription* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtSubscription*")
	public UtSubscriptionPointer next() throws CorruptDataException {
		return UtSubscriptionPointer.cast(getPointerAtOffset(UtSubscription._nextOffset_));
	}

	// UtSubscription* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._nextOffset_));
	}

	// UtSubscription* prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevOffset_", declaredType="UtSubscription*")
	public UtSubscriptionPointer prev() throws CorruptDataException {
		return UtSubscriptionPointer.cast(getPointerAtOffset(UtSubscription._prevOffset_));
	}

	// UtSubscription* prev
	public PointerPointer prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._prevOffset_));
	}

	// subscription* queueSubscription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queueSubscriptionOffset_", declaredType="subscription*")
	public subscriptionPointer queueSubscription() throws CorruptDataException {
		return subscriptionPointer.cast(getPointerAtOffset(UtSubscription._queueSubscriptionOffset_));
	}

	// subscription* queueSubscription
	public PointerPointer queueSubscriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._queueSubscriptionOffset_));
	}

	// volatile U32 state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stateOffset_", declaredType="volatile U32")
	public UDATA state() throws CorruptDataException {
		return new U32(getIntAtOffset(UtSubscription._stateOffset_));
	}

	// volatile U32 state
	public UDATAPointer stateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtSubscription._stateOffset_));
	}

	// volatile utsSubscriberCallback subscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscriberOffset_", declaredType="volatile utsSubscriberCallback")
	public VoidPointer subscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtSubscription._subscriberOffset_));
	}

	// volatile utsSubscriberCallback subscriber
	public PointerPointer subscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._subscriberOffset_));
	}

	// void** thr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thrOffset_", declaredType="void**")
	public PointerPointer thr() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(UtSubscription._thrOffset_));
	}

	// void** thr
	public PointerPointer thrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._thrOffset_));
	}

	// I32 threadAttach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadAttachOffset_", declaredType="I32")
	public IDATA threadAttach() throws CorruptDataException {
		return new I32(getIntAtOffset(UtSubscription._threadAttachOffset_));
	}

	// I32 threadAttach
	public IDATAPointer threadAttachEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtSubscription._threadAttachOffset_));
	}

	// I32 threadPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadPriorityOffset_", declaredType="I32")
	public IDATA threadPriority() throws CorruptDataException {
		return new I32(getIntAtOffset(UtSubscription._threadPriorityOffset_));
	}

	// I32 threadPriority
	public IDATAPointer threadPriorityEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtSubscription._threadPriorityOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtSubscription._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtSubscription._userDataOffset_));
	}

}
