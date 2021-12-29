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
 * Structure: MM_FreeEntrySizeClassStats$FrequentAllocationPointer
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
 * The generated code will provide getters for all elements in the MM_FreeEntrySizeClassStats$FrequentAllocationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_FreeEntrySizeClassStats$FrequentAllocation.class)
public class MM_FreeEntrySizeClassStats$FrequentAllocationPointer extends StructurePointer {

	// NULL
	public static final MM_FreeEntrySizeClassStats$FrequentAllocationPointer NULL = new MM_FreeEntrySizeClassStats$FrequentAllocationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_FreeEntrySizeClassStats$FrequentAllocationPointer(long address) {
		super(address);
	}

	public static MM_FreeEntrySizeClassStats$FrequentAllocationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_FreeEntrySizeClassStats$FrequentAllocationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_FreeEntrySizeClassStats$FrequentAllocationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_FreeEntrySizeClassStats$FrequentAllocationPointer(address);
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer add(long count) {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(address + (MM_FreeEntrySizeClassStats$FrequentAllocation.SIZEOF * count));
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer addOffset(long offset) {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(address + offset);
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer sub(long count) {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(address - (MM_FreeEntrySizeClassStats$FrequentAllocation.SIZEOF * count));
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer subOffset(long offset) {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(address - offset);
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer untag(long mask) {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(address & ~mask);
	}

	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_FreeEntrySizeClassStats$FrequentAllocation.SIZEOF;
	}

	// Implementation methods

	// U64 _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="U64")
	public UDATA _count() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats$FrequentAllocation.__countOffset_));
	}

	// U64 _count
	public UDATAPointer _countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats$FrequentAllocation.__countOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _nextInSizeClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextInSizeClassOffset_", declaredType="MM_FreeEntrySizeClassStats$FrequentAllocation*")
	public MM_FreeEntrySizeClassStats$FrequentAllocationPointer _nextInSizeClass() throws CorruptDataException {
		return MM_FreeEntrySizeClassStats$FrequentAllocationPointer.cast(getPointerAtOffset(MM_FreeEntrySizeClassStats$FrequentAllocation.__nextInSizeClassOffset_));
	}

	// MM_FreeEntrySizeClassStats$FrequentAllocation* _nextInSizeClass
	public PointerPointer _nextInSizeClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats$FrequentAllocation.__nextInSizeClassOffset_));
	}

	// U64 _size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeOffset_", declaredType="U64")
	public UDATA _size() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_FreeEntrySizeClassStats$FrequentAllocation.__sizeOffset_));
	}

	// U64 _size
	public UDATAPointer _sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_FreeEntrySizeClassStats$FrequentAllocation.__sizeOffset_));
	}

}
