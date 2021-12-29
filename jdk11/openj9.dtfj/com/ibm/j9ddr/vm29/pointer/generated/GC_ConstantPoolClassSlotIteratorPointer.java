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
 * Structure: GC_ConstantPoolClassSlotIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ConstantPoolClassSlotIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ConstantPoolClassSlotIterator.class)
public class GC_ConstantPoolClassSlotIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ConstantPoolClassSlotIteratorPointer NULL = new GC_ConstantPoolClassSlotIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ConstantPoolClassSlotIteratorPointer(long address) {
		super(address);
	}

	public static GC_ConstantPoolClassSlotIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ConstantPoolClassSlotIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ConstantPoolClassSlotIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ConstantPoolClassSlotIteratorPointer(address);
	}

	public GC_ConstantPoolClassSlotIteratorPointer add(long count) {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(address + (GC_ConstantPoolClassSlotIterator.SIZEOF * count));
	}

	public GC_ConstantPoolClassSlotIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ConstantPoolClassSlotIteratorPointer addOffset(long offset) {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(address + offset);
	}

	public GC_ConstantPoolClassSlotIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ConstantPoolClassSlotIteratorPointer sub(long count) {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(address - (GC_ConstantPoolClassSlotIterator.SIZEOF * count));
	}

	public GC_ConstantPoolClassSlotIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ConstantPoolClassSlotIteratorPointer subOffset(long offset) {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(address - offset);
	}

	public GC_ConstantPoolClassSlotIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ConstantPoolClassSlotIteratorPointer untag(long mask) {
		return GC_ConstantPoolClassSlotIteratorPointer.cast(address & ~mask);
	}

	public GC_ConstantPoolClassSlotIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ConstantPoolClassSlotIterator.SIZEOF;
	}

	// Implementation methods

	// U32 _cpDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionOffset_", declaredType="U32")
	public UDATA _cpDescription() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolClassSlotIterator.__cpDescriptionOffset_));
	}

	// U32 _cpDescription
	public UDATAPointer _cpDescriptionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpDescriptionOffset_));
	}

	// UDATA _cpDescriptionIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionIndexOffset_", declaredType="UDATA")
	public UDATA _cpDescriptionIndex() throws CorruptDataException {
		return getUDATAAtOffset(GC_ConstantPoolClassSlotIterator.__cpDescriptionIndexOffset_);
	}

	// UDATA _cpDescriptionIndex
	public UDATAPointer _cpDescriptionIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpDescriptionIndexOffset_));
	}

	// U32* _cpDescriptionSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionSlotsOffset_", declaredType="U32*")
	public UDATAPointer _cpDescriptionSlots() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(GC_ConstantPoolClassSlotIterator.__cpDescriptionSlotsOffset_));
	}

	// U32* _cpDescriptionSlots
	public PointerPointer _cpDescriptionSlotsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpDescriptionSlotsOffset_));
	}

	// void** _cpEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryOffset_", declaredType="void**")
	public PointerPointer _cpEntry() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_ConstantPoolClassSlotIterator.__cpEntryOffset_));
	}

	// void** _cpEntry
	public PointerPointer _cpEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpEntryOffset_));
	}

	// U32 _cpEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryCountOffset_", declaredType="U32")
	public UDATA _cpEntryCount() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolClassSlotIterator.__cpEntryCountOffset_));
	}

	// U32 _cpEntryCount
	public UDATAPointer _cpEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpEntryCountOffset_));
	}

	// U32 _cpEntryTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryTotalOffset_", declaredType="U32")
	public UDATA _cpEntryTotal() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolClassSlotIterator.__cpEntryTotalOffset_));
	}

	// U32 _cpEntryTotal
	public UDATAPointer _cpEntryTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolClassSlotIterator.__cpEntryTotalOffset_));
	}

}
