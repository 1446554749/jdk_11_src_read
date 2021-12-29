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
 * Structure: GC_RememberedSetCardListCardIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_RememberedSetCardListCardIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_RememberedSetCardListCardIterator.class)
public class GC_RememberedSetCardListCardIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_RememberedSetCardListCardIteratorPointer NULL = new GC_RememberedSetCardListCardIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_RememberedSetCardListCardIteratorPointer(long address) {
		super(address);
	}

	public static GC_RememberedSetCardListCardIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_RememberedSetCardListCardIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_RememberedSetCardListCardIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_RememberedSetCardListCardIteratorPointer(address);
	}

	public GC_RememberedSetCardListCardIteratorPointer add(long count) {
		return GC_RememberedSetCardListCardIteratorPointer.cast(address + (GC_RememberedSetCardListCardIterator.SIZEOF * count));
	}

	public GC_RememberedSetCardListCardIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_RememberedSetCardListCardIteratorPointer addOffset(long offset) {
		return GC_RememberedSetCardListCardIteratorPointer.cast(address + offset);
	}

	public GC_RememberedSetCardListCardIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_RememberedSetCardListCardIteratorPointer sub(long count) {
		return GC_RememberedSetCardListCardIteratorPointer.cast(address - (GC_RememberedSetCardListCardIterator.SIZEOF * count));
	}

	public GC_RememberedSetCardListCardIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_RememberedSetCardListCardIteratorPointer subOffset(long offset) {
		return GC_RememberedSetCardListCardIteratorPointer.cast(address - offset);
	}

	public GC_RememberedSetCardListCardIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_RememberedSetCardListCardIteratorPointer untag(long mask) {
		return GC_RememberedSetCardListCardIteratorPointer.cast(address & ~mask);
	}

	public GC_RememberedSetCardListCardIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_RememberedSetCardListCardIterator.SIZEOF;
	}

	// Implementation methods

	// MM_RememberedSetCard* _bufferCardList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferCardListOffset_", declaredType="MM_RememberedSetCard*")
	public MM_RememberedSetCardPointer _bufferCardList() throws CorruptDataException {
		return MM_RememberedSetCardPointer.cast(getPointerAtOffset(GC_RememberedSetCardListCardIterator.__bufferCardListOffset_));
	}

	// MM_RememberedSetCard* _bufferCardList
	public PointerPointer _bufferCardListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__bufferCardListOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardBufferControlBlockNextOffset_", declaredType="MM_CardBufferControlBlock*")
	public MM_CardBufferControlBlockPointer _cardBufferControlBlockNext() throws CorruptDataException {
		return MM_CardBufferControlBlockPointer.cast(getPointerAtOffset(GC_RememberedSetCardListCardIterator.__cardBufferControlBlockNextOffset_));
	}

	// MM_CardBufferControlBlock* _cardBufferControlBlockNext
	public PointerPointer _cardBufferControlBlockNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__cardBufferControlBlockNextOffset_));
	}

	// UDATA _cardIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardIndexOffset_", declaredType="UDATA")
	public UDATA _cardIndex() throws CorruptDataException {
		return getUDATAAtOffset(GC_RememberedSetCardListCardIterator.__cardIndexOffset_);
	}

	// UDATA _cardIndex
	public UDATAPointer _cardIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__cardIndexOffset_));
	}

	// UDATA _cardIndexTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardIndexTopOffset_", declaredType="UDATA")
	public UDATA _cardIndexTop() throws CorruptDataException {
		return getUDATAAtOffset(GC_RememberedSetCardListCardIterator.__cardIndexTopOffset_);
	}

	// UDATA _cardIndexTop
	public UDATAPointer _cardIndexTopEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__cardIndexTopOffset_));
	}

	// MM_RememberedSetCardBucket* _currentBucket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentBucketOffset_", declaredType="MM_RememberedSetCardBucket*")
	public MM_RememberedSetCardBucketPointer _currentBucket() throws CorruptDataException {
		return MM_RememberedSetCardBucketPointer.cast(getPointerAtOffset(GC_RememberedSetCardListCardIterator.__currentBucketOffset_));
	}

	// MM_RememberedSetCardBucket* _currentBucket
	public PointerPointer _currentBucketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__currentBucketOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclOffset_", declaredType="MM_RememberedSetCardList*")
	public MM_RememberedSetCardListPointer _rscl() throws CorruptDataException {
		return MM_RememberedSetCardListPointer.cast(getPointerAtOffset(GC_RememberedSetCardListCardIterator.__rsclOffset_));
	}

	// MM_RememberedSetCardList* _rscl
	public PointerPointer _rsclEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_RememberedSetCardListCardIterator.__rsclOffset_));
	}

}
