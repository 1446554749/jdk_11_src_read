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
 * Structure: GC_RememberedSetCardListBufferIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_RememberedSetCardListBufferIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_RememberedSetCardListBufferIterator.class)
public class GC_RememberedSetCardListBufferIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_RememberedSetCardListBufferIteratorPointer NULL = new GC_RememberedSetCardListBufferIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_RememberedSetCardListBufferIteratorPointer(long address) {
		super(address);
	}

	public static GC_RememberedSetCardListBufferIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_RememberedSetCardListBufferIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_RememberedSetCardListBufferIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_RememberedSetCardListBufferIteratorPointer(address);
	}

	public GC_RememberedSetCardListBufferIteratorPointer add(long count) {
		return GC_RememberedSetCardListBufferIteratorPointer.cast(address + (GC_RememberedSetCardListBufferIterator.SIZEOF * count));
	}

	public GC_RememberedSetCardListBufferIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_RememberedSetCardListBufferIteratorPointer addOffset(long offset) {
		return GC_RememberedSetCardListBufferIteratorPointer.cast(address + offset);
	}

	public GC_RememberedSetCardListBufferIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_RememberedSetCardListBufferIteratorPointer sub(long count) {
		return GC_RememberedSetCardListBufferIteratorPointer.cast(address - (GC_RememberedSetCardListBufferIterator.SIZEOF * count));
	}

	public GC_RememberedSetCardListBufferIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_RememberedSetCardListBufferIteratorPointer subOffset(long offset) {
		return GC_RememberedSetCardListBufferIteratorPointer.cast(address - offset);
	}

	public GC_RememberedSetCardListBufferIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_RememberedSetCardListBufferIteratorPointer untag(long mask) {
		return GC_RememberedSetCardListBufferIteratorPointer.cast(address & ~mask);
	}

	public GC_RememberedSetCardListBufferIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_RememberedSetCardListBufferIterator.SIZEOF;
	}

	// Implementation methods

	// MM_RememberedSetCard* _bufferCardList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferCardListOffset_", declaredType="MM_RememberedSetCard*")
	public MM_RememberedSetCardPointer _bufferCardList() throws CorruptDataException {
		return MM_RememberedSetCardPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__bufferCardListOffset_));
	}

	// MM_RememberedSetCard* _bufferCardList
	public PointerPointer _bufferCardListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__bufferCardListOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockCurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardBufferControlBlockCurrentOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _cardBufferControlBlockCurrent() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockCurrentOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockCurrent
	public PointerPointer _cardBufferControlBlockCurrentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockCurrentOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardBufferControlBlockNextOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _cardBufferControlBlockNext() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockNextOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockNext
	public PointerPointer _cardBufferControlBlockNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockNextOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardBufferControlBlockPreviousOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _cardBufferControlBlockPrevious() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockPreviousOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockPrevious
	public PointerPointer _cardBufferControlBlockPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__cardBufferControlBlockPreviousOffset_));
	}

	// MM_RememberedSetCardBucket* _currentBucket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentBucketOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer _currentBucket() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__currentBucketOffset_));
	}

	// MM_RememberedSetCardBucket* _currentBucket
	public PointerPointer _currentBucketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__currentBucketOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclOffset_", declaredType="MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _rscl() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(GC_RememberedSetCardListBufferIterator.__rsclOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	public PointerPointer _rsclEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListBufferIterator.__rsclOffset_));
	}

}
