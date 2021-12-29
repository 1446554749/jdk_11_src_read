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
 * Structure: GC_ConstantPoolObjectSlotIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ConstantPoolObjectSlotIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ConstantPoolObjectSlotIterator.class)
public class GC_ConstantPoolObjectSlotIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ConstantPoolObjectSlotIteratorPointer NULL = new GC_ConstantPoolObjectSlotIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ConstantPoolObjectSlotIteratorPointer(long address) {
		super(address);
	}

	public static GC_ConstantPoolObjectSlotIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ConstantPoolObjectSlotIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ConstantPoolObjectSlotIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ConstantPoolObjectSlotIteratorPointer(address);
	}

	public GC_ConstantPoolObjectSlotIteratorPointer add(long count) {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(address + (GC_ConstantPoolObjectSlotIterator.SIZEOF * count));
	}

	public GC_ConstantPoolObjectSlotIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ConstantPoolObjectSlotIteratorPointer addOffset(long offset) {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(address + offset);
	}

	public GC_ConstantPoolObjectSlotIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ConstantPoolObjectSlotIteratorPointer sub(long count) {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(address - (GC_ConstantPoolObjectSlotIterator.SIZEOF * count));
	}

	public GC_ConstantPoolObjectSlotIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ConstantPoolObjectSlotIteratorPointer subOffset(long offset) {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(address - offset);
	}

	public GC_ConstantPoolObjectSlotIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ConstantPoolObjectSlotIteratorPointer untag(long mask) {
		return GC_ConstantPoolObjectSlotIteratorPointer.cast(address & ~mask);
	}

	public GC_ConstantPoolObjectSlotIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ConstantPoolObjectSlotIterator.SIZEOF;
	}

	// Implementation methods

	// GC_ConstantDynamicSlotIterator _constantDynamicSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantDynamicSlotIteratorOffset_", declaredType="GC_ConstantDynamicSlotIterator")
	public GC_ConstantDynamicSlotIteratorPointer _constantDynamicSlotIterator() throws CorruptDataException {
		return GC_ConstantDynamicSlotIteratorPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__constantDynamicSlotIteratorOffset_));
	}

	// GC_ConstantDynamicSlotIterator _constantDynamicSlotIterator
	public PointerPointer _constantDynamicSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__constantDynamicSlotIteratorOffset_));
	}

	// U32 _cpDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionOffset_", declaredType="U32")
	public UDATA _cpDescription() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolObjectSlotIterator.__cpDescriptionOffset_));
	}

	// U32 _cpDescription
	public UDATAPointer _cpDescriptionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpDescriptionOffset_));
	}

	// UDATA _cpDescriptionIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionIndexOffset_", declaredType="UDATA")
	public UDATA _cpDescriptionIndex() throws CorruptDataException {
		return getUDATAAtOffset(GC_ConstantPoolObjectSlotIterator.__cpDescriptionIndexOffset_);
	}

	// UDATA _cpDescriptionIndex
	public UDATAPointer _cpDescriptionIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpDescriptionIndexOffset_));
	}

	// U32* _cpDescriptionSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionSlotsOffset_", declaredType="U32*")
	public UDATAPointer _cpDescriptionSlots() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(GC_ConstantPoolObjectSlotIterator.__cpDescriptionSlotsOffset_));
	}

	// U32* _cpDescriptionSlots
	public PointerPointer _cpDescriptionSlotsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpDescriptionSlotsOffset_));
	}

	// j9object_t* _cpEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryOffset_", declaredType="j9object_t*")
	public PointerPointer _cpEntry() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_ConstantPoolObjectSlotIterator.__cpEntryOffset_));
	}

	// j9object_t* _cpEntry
	public PointerPointer _cpEntryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpEntryOffset_));
	}

	// U32 _cpEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryCountOffset_", declaredType="U32")
	public UDATA _cpEntryCount() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolObjectSlotIterator.__cpEntryCountOffset_));
	}

	// U32 _cpEntryCount
	public UDATAPointer _cpEntryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpEntryCountOffset_));
	}

	// U32 _cpEntryTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpEntryTotalOffset_", declaredType="U32")
	public UDATA _cpEntryTotal() throws CorruptDataException {
		return new U32(getIntAtOffset(GC_ConstantPoolObjectSlotIterator.__cpEntryTotalOffset_));
	}

	// U32 _cpEntryTotal
	public UDATAPointer _cpEntryTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ConstantPoolObjectSlotIterator.__cpEntryTotalOffset_));
	}

}
