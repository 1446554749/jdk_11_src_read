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
 * Structure: MM_MemorySubSpaceGenerationalPointer
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
 * The generated code will provide getters for all elements in the MM_MemorySubSpaceGenerationalPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MemorySubSpaceGenerational.class)
public class MM_MemorySubSpaceGenerationalPointer extends MM_MemorySubSpacePointer {

	// NULL
	public static final MM_MemorySubSpaceGenerationalPointer NULL = new MM_MemorySubSpaceGenerationalPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MemorySubSpaceGenerationalPointer(long address) {
		super(address);
	}

	public static MM_MemorySubSpaceGenerationalPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MemorySubSpaceGenerationalPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MemorySubSpaceGenerationalPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MemorySubSpaceGenerationalPointer(address);
	}

	public MM_MemorySubSpaceGenerationalPointer add(long count) {
		return MM_MemorySubSpaceGenerationalPointer.cast(address + (MM_MemorySubSpaceGenerational.SIZEOF * count));
	}

	public MM_MemorySubSpaceGenerationalPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MemorySubSpaceGenerationalPointer addOffset(long offset) {
		return MM_MemorySubSpaceGenerationalPointer.cast(address + offset);
	}

	public MM_MemorySubSpaceGenerationalPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MemorySubSpaceGenerationalPointer sub(long count) {
		return MM_MemorySubSpaceGenerationalPointer.cast(address - (MM_MemorySubSpaceGenerational.SIZEOF * count));
	}

	public MM_MemorySubSpaceGenerationalPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MemorySubSpaceGenerationalPointer subOffset(long offset) {
		return MM_MemorySubSpaceGenerationalPointer.cast(address - offset);
	}

	public MM_MemorySubSpaceGenerationalPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MemorySubSpaceGenerationalPointer untag(long mask) {
		return MM_MemorySubSpaceGenerationalPointer.cast(address & ~mask);
	}

	public MM_MemorySubSpaceGenerationalPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MemorySubSpaceGenerational.SIZEOF;
	}

	// Implementation methods

	// U64 _initialSizeNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initialSizeNewOffset_", declaredType="U64")
	public UDATA _initialSizeNew() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__initialSizeNewOffset_));
	}

	// U64 _initialSizeNew
	public UDATAPointer _initialSizeNewEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__initialSizeNewOffset_));
	}

	// U64 _initialSizeOld
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initialSizeOldOffset_", declaredType="U64")
	public UDATA _initialSizeOld() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__initialSizeOldOffset_));
	}

	// U64 _initialSizeOld
	public UDATAPointer _initialSizeOldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__initialSizeOldOffset_));
	}

	// U64 _maximumSizeNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumSizeNewOffset_", declaredType="U64")
	public UDATA _maximumSizeNew() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__maximumSizeNewOffset_));
	}

	// U64 _maximumSizeNew
	public UDATAPointer _maximumSizeNewEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__maximumSizeNewOffset_));
	}

	// U64 _maximumSizeOld
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumSizeOldOffset_", declaredType="U64")
	public UDATA _maximumSizeOld() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__maximumSizeOldOffset_));
	}

	// U64 _maximumSizeOld
	public UDATAPointer _maximumSizeOldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__maximumSizeOldOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceNewOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceNew() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpaceGenerational.__memorySubSpaceNewOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceNew
	public PointerPointer _memorySubSpaceNewEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__memorySubSpaceNewOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceOld
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memorySubSpaceOldOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer _memorySubSpaceOld() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_MemorySubSpaceGenerational.__memorySubSpaceOldOffset_));
	}

	// MM_MemorySubSpace* _memorySubSpaceOld
	public PointerPointer _memorySubSpaceOldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__memorySubSpaceOldOffset_));
	}

	// U64 _minimumSizeNew
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumSizeNewOffset_", declaredType="U64")
	public UDATA _minimumSizeNew() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__minimumSizeNewOffset_));
	}

	// U64 _minimumSizeNew
	public UDATAPointer _minimumSizeNewEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__minimumSizeNewOffset_));
	}

	// U64 _minimumSizeOld
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__minimumSizeOldOffset_", declaredType="U64")
	public UDATA _minimumSizeOld() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MemorySubSpaceGenerational.__minimumSizeOldOffset_));
	}

	// U64 _minimumSizeOld
	public UDATAPointer _minimumSizeOldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MemorySubSpaceGenerational.__minimumSizeOldOffset_));
	}

}
