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
 * Structure: CleaningRangePointer
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
 * The generated code will provide getters for all elements in the CleaningRangePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=CleaningRange.class)
public class CleaningRangePointer extends StructurePointer {

	// NULL
	public static final CleaningRangePointer NULL = new CleaningRangePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CleaningRangePointer(long address) {
		super(address);
	}

	public static CleaningRangePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CleaningRangePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CleaningRangePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CleaningRangePointer(address);
	}

	public CleaningRangePointer add(long count) {
		return CleaningRangePointer.cast(address + (CleaningRange.SIZEOF * count));
	}

	public CleaningRangePointer add(Scalar count) {
		return add(count.longValue());
	}

	public CleaningRangePointer addOffset(long offset) {
		return CleaningRangePointer.cast(address + offset);
	}

	public CleaningRangePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CleaningRangePointer sub(long count) {
		return CleaningRangePointer.cast(address - (CleaningRange.SIZEOF * count));
	}

	public CleaningRangePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CleaningRangePointer subOffset(long offset) {
		return CleaningRangePointer.cast(address - offset);
	}

	public CleaningRangePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CleaningRangePointer untag(long mask) {
		return CleaningRangePointer.cast(address & ~mask);
	}

	public CleaningRangePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return CleaningRange.SIZEOF;
	}

	// Implementation methods

	// Card* baseCard
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseCardOffset_", declaredType="Card*")
	public U8Pointer baseCard() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(CleaningRange._baseCardOffset_));
	}

	// Card* baseCard
	public PointerPointer baseCardEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CleaningRange._baseCardOffset_));
	}

	// volatile Card* nextCard
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextCardOffset_", declaredType="volatile Card*")
	public U8Pointer nextCard() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(CleaningRange._nextCardOffset_));
	}

	// volatile Card* nextCard
	public PointerPointer nextCardEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CleaningRange._nextCardOffset_));
	}

	// U64 numCards
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numCardsOffset_", declaredType="U64")
	public UDATA numCards() throws CorruptDataException {
		return new U64(getLongAtOffset(CleaningRange._numCardsOffset_));
	}

	// U64 numCards
	public UDATAPointer numCardsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CleaningRange._numCardsOffset_));
	}

	// Card* topCard
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_topCardOffset_", declaredType="Card*")
	public U8Pointer topCard() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(CleaningRange._topCardOffset_));
	}

	// Card* topCard
	public PointerPointer topCardEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CleaningRange._topCardOffset_));
	}

}
