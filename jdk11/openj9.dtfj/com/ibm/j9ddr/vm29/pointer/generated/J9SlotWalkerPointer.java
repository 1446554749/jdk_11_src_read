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
 * Structure: J9SlotWalkerPointer
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
 * The generated code will provide getters for all elements in the J9SlotWalkerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SlotWalker.class)
public class J9SlotWalkerPointer extends StructurePointer {

	// NULL
	public static final J9SlotWalkerPointer NULL = new J9SlotWalkerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SlotWalkerPointer(long address) {
		super(address);
	}

	public static J9SlotWalkerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SlotWalkerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SlotWalkerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SlotWalkerPointer(address);
	}

	public J9SlotWalkerPointer add(long count) {
		return J9SlotWalkerPointer.cast(address + (J9SlotWalker.SIZEOF * count));
	}

	public J9SlotWalkerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SlotWalkerPointer addOffset(long offset) {
		return J9SlotWalkerPointer.cast(address + offset);
	}

	public J9SlotWalkerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SlotWalkerPointer sub(long count) {
		return J9SlotWalkerPointer.cast(address - (J9SlotWalker.SIZEOF * count));
	}

	public J9SlotWalkerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SlotWalkerPointer subOffset(long offset) {
		return J9SlotWalkerPointer.cast(address - offset);
	}

	public J9SlotWalkerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SlotWalkerPointer untag(long mask) {
		return J9SlotWalkerPointer.cast(address & ~mask);
	}

	public J9SlotWalkerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SlotWalker.SIZEOF;
	}

	// Implementation methods

	// J9Pool* annotationPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer annotationPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SlotWalker._annotationPoolOffset_));
	}

	// J9Pool* annotationPool
	public PointerPointer annotationPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._annotationPoolOffset_));
	}

	// J9SWFrame* currentFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentFrameOffset_", declaredType="J9SWFrame*")
	public J9SWFramePointer currentFrame() throws CorruptDataException {
		return J9SWFramePointer.cast(getPointerAtOffset(J9SlotWalker._currentFrameOffset_));
	}

	// J9SWFrame* currentFrame
	public PointerPointer currentFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._currentFrameOffset_));
	}

	// UDATA frameCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameCountOffset_", declaredType="UDATA")
	public UDATA frameCount() throws CorruptDataException {
		return getUDATAAtOffset(J9SlotWalker._frameCountOffset_);
	}

	// UDATA frameCount
	public UDATAPointer frameCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SlotWalker._frameCountOffset_));
	}

	// J9SWFrame* frameList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameListOffset_", declaredType="J9SWFrame*")
	public J9SWFramePointer frameList() throws CorruptDataException {
		return J9SWFramePointer.cast(getPointerAtOffset(J9SlotWalker._frameListOffset_));
	}

	// J9SWFrame* frameList
	public PointerPointer frameListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._frameListOffset_));
	}

	// J9HashTable* slotAnnotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotAnnotationsOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer slotAnnotations() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(J9SlotWalker._slotAnnotationsOffset_));
	}

	// J9HashTable* slotAnnotations
	public PointerPointer slotAnnotationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._slotAnnotationsOffset_));
	}

	// J9SWSlot* slots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotsOffset_", declaredType="J9SWSlot*")
	public J9SWSlotPointer slots() throws CorruptDataException {
		return J9SWSlotPointer.cast(getPointerAtOffset(J9SlotWalker._slotsOffset_));
	}

	// J9SWSlot* slots
	public PointerPointer slotsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._slotsOffset_));
	}

	// UDATA* sp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spOffset_", declaredType="UDATA*")
	public UDATAPointer sp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SlotWalker._spOffset_));
	}

	// UDATA* sp
	public PointerPointer spEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._spOffset_));
	}

	// UDATA* stackBottom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackBottomOffset_", declaredType="UDATA*")
	public UDATAPointer stackBottom() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9SlotWalker._stackBottomOffset_));
	}

	// UDATA* stackBottom
	public PointerPointer stackBottomEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._stackBottomOffset_));
	}

	// U8* stringFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringFreeOffset_", declaredType="U8*")
	public U8Pointer stringFree() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SlotWalker._stringFreeOffset_));
	}

	// U8* stringFree
	public PointerPointer stringFreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._stringFreeOffset_));
	}

	// J9Pool* stringPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringPoolOffset_", declaredType="J9Pool*")
	public J9PoolPointer stringPool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(J9SlotWalker._stringPoolOffset_));
	}

	// J9Pool* stringPool
	public PointerPointer stringPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._stringPoolOffset_));
	}

	// U8* stringSlab
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringSlabOffset_", declaredType="U8*")
	public U8Pointer stringSlab() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9SlotWalker._stringSlabOffset_));
	}

	// U8* stringSlab
	public PointerPointer stringSlabEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SlotWalker._stringSlabOffset_));
	}

}
