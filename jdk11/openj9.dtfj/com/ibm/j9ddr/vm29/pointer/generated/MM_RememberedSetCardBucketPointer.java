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
 * Structure: MM_RememberedSetCardBucketPointer
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
 * The generated code will provide getters for all elements in the MM_RememberedSetCardBucketPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RememberedSetCardBucket.class)
public class MM_RememberedSetCardBucketPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_RememberedSetCardBucketPointer NULL = new MM_RememberedSetCardBucketPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RememberedSetCardBucketPointer(long address) {
		super(address);
	}

	public static MM_RememberedSetCardBucketPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RememberedSetCardBucketPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RememberedSetCardBucketPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RememberedSetCardBucketPointer(address);
	}

	public MM_RememberedSetCardBucketPointer add(long count) {
		return MM_RememberedSetCardBucketPointer.cast(address + (MM_RememberedSetCardBucket.SIZEOF * count));
	}

	public MM_RememberedSetCardBucketPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RememberedSetCardBucketPointer addOffset(long offset) {
		return MM_RememberedSetCardBucketPointer.cast(address + offset);
	}

	public MM_RememberedSetCardBucketPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RememberedSetCardBucketPointer sub(long count) {
		return MM_RememberedSetCardBucketPointer.cast(address - (MM_RememberedSetCardBucket.SIZEOF * count));
	}

	public MM_RememberedSetCardBucketPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RememberedSetCardBucketPointer subOffset(long offset) {
		return MM_RememberedSetCardBucketPointer.cast(address - offset);
	}

	public MM_RememberedSetCardBucketPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RememberedSetCardBucketPointer untag(long mask) {
		return MM_RememberedSetCardBucketPointer.cast(address & ~mask);
	}

	public MM_RememberedSetCardBucketPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RememberedSetCardBucket.SIZEOF;
	}

	// Implementation methods

	// UDATA _bufferCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferCountOffset_", declaredType="UDATA")
	public UDATA _bufferCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_RememberedSetCardBucket.__bufferCountOffset_);
	}

	// UDATA _bufferCount
	public UDATAPointer _bufferCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RememberedSetCardBucket.__bufferCountOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardBufferControlBlockHeadOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _cardBufferControlBlockHead() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(MM_RememberedSetCardBucket.__cardBufferControlBlockHeadOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockHead
	public PointerPointer _cardBufferControlBlockHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RememberedSetCardBucket.__cardBufferControlBlockHeadOffset_));
	}

	// MM_RememberedSetCard* _current
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentOffset_", declaredType="MM_RememberedSetCard*")
	public MM_RememberedSetCardPointer _current() throws CorruptDataException {
		return MM_RememberedSetCardPointer.cast(getPointerAtOffset(MM_RememberedSetCardBucket.__currentOffset_));
	}

	// MM_RememberedSetCard* _current
	public PointerPointer _currentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RememberedSetCardBucket.__currentOffset_));
	}

	// MM_RememberedSetCardBucket* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer _next() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(MM_RememberedSetCardBucket.__nextOffset_));
	}

	// MM_RememberedSetCardBucket* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RememberedSetCardBucket.__nextOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclOffset_", declaredType="MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _rscl() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(MM_RememberedSetCardBucket.__rsclOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	public PointerPointer _rsclEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RememberedSetCardBucket.__rsclOffset_));
	}

}
