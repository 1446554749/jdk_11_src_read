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
 * Structure: messagePointer
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
 * The generated code will provide getters for all elements in the messagePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=message.class)
public class messagePointer extends StructurePointer {

	// NULL
	public static final messagePointer NULL = new messagePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected messagePointer(long address) {
		super(address);
	}

	public static messagePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static messagePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static messagePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new messagePointer(address);
	}

	public messagePointer add(long count) {
		return messagePointer.cast(address + (message.SIZEOF * count));
	}

	public messagePointer add(Scalar count) {
		return add(count.longValue());
	}

	public messagePointer addOffset(long offset) {
		return messagePointer.cast(address + offset);
	}

	public messagePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public messagePointer sub(long count) {
		return messagePointer.cast(address - (message.SIZEOF * count));
	}

	public messagePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public messagePointer subOffset(long offset) {
		return messagePointer.cast(address - offset);
	}

	public messagePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public messagePointer untag(long mask) {
		return messagePointer.cast(address & ~mask);
	}

	public messagePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return message.SIZEOF;
	}

	// Implementation methods

	// void* data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataOffset_", declaredType="void*")
	public VoidPointer data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(message._dataOffset_));
	}

	// void* data
	public PointerPointer dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(message._dataOffset_));
	}

	// volatile message* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="volatile message*")
	public messagePointer next() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(message._nextOffset_));
	}

	// volatile message* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(message._nextOffset_));
	}

	// message* nextSecondary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextSecondaryOffset_", declaredType="message*")
	public messagePointer nextSecondary() throws CorruptDataException {
		return messagePointer.cast(getPointerAtOffset(message._nextSecondaryOffset_));
	}

	// message* nextSecondary
	public PointerPointer nextSecondaryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(message._nextSecondaryOffset_));
	}

	// volatile I32 pauseCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pauseCountOffset_", declaredType="volatile I32")
	public IDATA pauseCount() throws CorruptDataException {
		return new I32(getIntAtOffset(message._pauseCountOffset_));
	}

	// volatile I32 pauseCount
	public IDATAPointer pauseCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(message._pauseCountOffset_));
	}

	// volatile I32 referenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceCountOffset_", declaredType="volatile I32")
	public IDATA referenceCount() throws CorruptDataException {
		return new I32(getIntAtOffset(message._referenceCountOffset_));
	}

	// volatile I32 referenceCount
	public IDATAPointer referenceCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(message._referenceCountOffset_));
	}

	// volatile I32 subscriptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscriptionsOffset_", declaredType="volatile I32")
	public IDATA subscriptions() throws CorruptDataException {
		return new I32(getIntAtOffset(message._subscriptionsOffset_));
	}

	// volatile I32 subscriptions
	public IDATAPointer subscriptionsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(message._subscriptionsOffset_));
	}

}
