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
 * Structure: OMRRankingPointer
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
 * The generated code will provide getters for all elements in the OMRRankingPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRRanking.class)
public class OMRRankingPointer extends StructurePointer {

	// NULL
	public static final OMRRankingPointer NULL = new OMRRankingPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRRankingPointer(long address) {
		super(address);
	}

	public static OMRRankingPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRRankingPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRRankingPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRRankingPointer(address);
	}

	public OMRRankingPointer add(long count) {
		return OMRRankingPointer.cast(address + (OMRRanking.SIZEOF * count));
	}

	public OMRRankingPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRRankingPointer addOffset(long offset) {
		return OMRRankingPointer.cast(address + offset);
	}

	public OMRRankingPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRRankingPointer sub(long count) {
		return OMRRankingPointer.cast(address - (OMRRanking.SIZEOF * count));
	}

	public OMRRankingPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRRankingPointer subOffset(long offset) {
		return OMRRankingPointer.cast(address - offset);
	}

	public OMRRankingPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRRankingPointer untag(long mask) {
		return OMRRankingPointer.cast(address & ~mask);
	}

	public OMRRankingPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRRanking.SIZEOF;
	}

	// Implementation methods

	// U32 curSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_curSizeOffset_", declaredType="U32")
	public UDATA curSize() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRRanking._curSizeOffset_));
	}

	// U32 curSize
	public UDATAPointer curSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRRanking._curSizeOffset_));
	}

	// J9HashTable* hashTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashTableOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer hashTable() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(OMRRanking._hashTableOffset_));
	}

	// J9HashTable* hashTable
	public PointerPointer hashTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRRanking._hashTableOffset_));
	}

	// OMRPortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer portLib() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(OMRRanking._portLibOffset_));
	}

	// OMRPortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRRanking._portLibOffset_));
	}

	// rankTableEntry* rankTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rankTableOffset_", declaredType="rankTableEntry*")
	public rankTableEntryPointer rankTable() throws CorruptDataException {
		return rankTableEntryPointer.cast(getPointerAtOffset(OMRRanking._rankTableOffset_));
	}

	// rankTableEntry* rankTable
	public PointerPointer rankTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRRanking._rankTableOffset_));
	}

	// U32 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U32")
	public UDATA size() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRRanking._sizeOffset_));
	}

	// U32 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRRanking._sizeOffset_));
	}

}
