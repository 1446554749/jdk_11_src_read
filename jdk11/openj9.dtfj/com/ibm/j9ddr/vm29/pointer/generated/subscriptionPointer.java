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
 * Structure: subscriptionPointer
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
 * The generated code will provide getters for all elements in the subscriptionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=subscription.class)
public class subscriptionPointer extends StructurePointer {

	// NULL
	public static final subscriptionPointer NULL = new subscriptionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected subscriptionPointer(long address) {
		super(address);
	}

	public static subscriptionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static subscriptionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static subscriptionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new subscriptionPointer(address);
	}

	public subscriptionPointer add(long count) {
		return subscriptionPointer.cast(address + (subscription.SIZEOF * count));
	}

	public subscriptionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public subscriptionPointer addOffset(long offset) {
		return subscriptionPointer.cast(address + offset);
	}

	public subscriptionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public subscriptionPointer sub(long count) {
		return subscriptionPointer.cast(address - (subscription.SIZEOF * count));
	}

	public subscriptionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public subscriptionPointer subOffset(long offset) {
		return subscriptionPointer.cast(address - offset);
	}

	public subscriptionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public subscriptionPointer untag(long mask) {
		return subscriptionPointer.cast(address & ~mask);
	}

	public subscriptionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return subscription.SIZEOF;
	}

	// Implementation methods

	// I32 allocd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocdOffset_", declaredType="I32")
	public IDATA allocd() throws CorruptDataException {
		return new I32(getIntAtOffset(subscription._allocdOffset_));
	}

	// I32 allocd
	public IDATAPointer allocdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(subscription._allocdOffset_));
	}

	// volatile message* current
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentOffset_", declaredType="volatile message*")
	public messagePointer current() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(subscription._currentOffset_));
	}

	// volatile message* current
	public PointerPointer currentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._currentOffset_));
	}

	// I32 currentLocked
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentLockedOffset_", declaredType="I32")
	public IDATA currentLocked() throws CorruptDataException {
		return new I32(getIntAtOffset(subscription._currentLockedOffset_));
	}

	// I32 currentLocked
	public IDATAPointer currentLockedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(subscription._currentLockedOffset_));
	}

	// volatile message* last
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastOffset_", declaredType="volatile message*")
	public messagePointer last() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(subscription._lastOffset_));
	}

	// volatile message* last
	public PointerPointer lastEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._lastOffset_));
	}

	// subscription* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="subscription*")
	public subscriptionPointer next() throws CorruptDataException {
		return subscriptionPointer.cast(getPointerAtOffset(subscription._nextOffset_));
	}

	// subscription* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._nextOffset_));
	}

	// subscription* prev
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_prevOffset_", declaredType="subscription*")
	public subscriptionPointer prev() throws CorruptDataException {
		return subscriptionPointer.cast(getPointerAtOffset(subscription._prevOffset_));
	}

	// subscription* prev
	public PointerPointer prevEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._prevOffset_));
	}

	// queue* queue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queueOffset_", declaredType="queue*")
	public queuePointer queue() throws CorruptDataException {
		return queuePointer.cast(getPointerAtOffset(subscription._queueOffset_));
	}

	// queue* queue
	public PointerPointer queueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._queueOffset_));
	}

	// I32 savedReference
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_savedReferenceOffset_", declaredType="I32")
	public IDATA savedReference() throws CorruptDataException {
		return new I32(getIntAtOffset(subscription._savedReferenceOffset_));
	}

	// I32 savedReference
	public IDATAPointer savedReferenceEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(subscription._savedReferenceOffset_));
	}

	// message* stop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stopOffset_", declaredType="message*")
	public messagePointer stop() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(subscription._stopOffset_));
	}

	// message* stop
	public PointerPointer stopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(subscription._stopOffset_));
	}

	// volatile I32 valid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_validOffset_", declaredType="volatile I32")
	public IDATA valid() throws CorruptDataException {
		return new I32(getIntAtOffset(subscription._validOffset_));
	}

	// volatile I32 valid
	public IDATAPointer validEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(subscription._validOffset_));
	}

}
