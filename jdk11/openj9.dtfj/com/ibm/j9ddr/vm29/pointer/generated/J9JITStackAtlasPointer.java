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
 * Structure: J9JITStackAtlasPointer
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
 * The generated code will provide getters for all elements in the J9JITStackAtlasPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITStackAtlas.class)
public class J9JITStackAtlasPointer extends StructurePointer {

	// NULL
	public static final J9JITStackAtlasPointer NULL = new J9JITStackAtlasPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITStackAtlasPointer(long address) {
		super(address);
	}

	public static J9JITStackAtlasPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITStackAtlasPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITStackAtlasPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITStackAtlasPointer(address);
	}

	public J9JITStackAtlasPointer add(long count) {
		return J9JITStackAtlasPointer.cast(address + (J9JITStackAtlas.SIZEOF * count));
	}

	public J9JITStackAtlasPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITStackAtlasPointer addOffset(long offset) {
		return J9JITStackAtlasPointer.cast(address + offset);
	}

	public J9JITStackAtlasPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITStackAtlasPointer sub(long count) {
		return J9JITStackAtlasPointer.cast(address - (J9JITStackAtlas.SIZEOF * count));
	}

	public J9JITStackAtlasPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITStackAtlasPointer subOffset(long offset) {
		return J9JITStackAtlasPointer.cast(address - offset);
	}

	public J9JITStackAtlasPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITStackAtlasPointer untag(long mask) {
		return J9JITStackAtlasPointer.cast(address & ~mask);
	}

	public J9JITStackAtlasPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITStackAtlas.SIZEOF;
	}

	// Implementation methods

	// U8* internalPointerMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalPointerMapOffset_", declaredType="U8*")
	public U8Pointer internalPointerMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITStackAtlas._internalPointerMapOffset_));
	}

	// U8* internalPointerMap
	public PointerPointer internalPointerMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITStackAtlas._internalPointerMapOffset_));
	}

	// I16 localBaseOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localBaseOffsetOffset_", declaredType="I16")
	public I16 localBaseOffset() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITStackAtlas._localBaseOffsetOffset_));
	}

	// I16 localBaseOffset
	public I16Pointer localBaseOffsetEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._localBaseOffsetOffset_));
	}

	// U16 numberOfMapBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfMapBytesOffset_", declaredType="U16")
	public U16 numberOfMapBytes() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITStackAtlas._numberOfMapBytesOffset_));
	}

	// U16 numberOfMapBytes
	public U16Pointer numberOfMapBytesEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._numberOfMapBytesOffset_));
	}

	// U16 numberOfMaps
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfMapsOffset_", declaredType="U16")
	public U16 numberOfMaps() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITStackAtlas._numberOfMapsOffset_));
	}

	// U16 numberOfMaps
	public U16Pointer numberOfMapsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._numberOfMapsOffset_));
	}

	// U16 numberOfParmSlots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfParmSlotsOffset_", declaredType="U16")
	public U16 numberOfParmSlots() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITStackAtlas._numberOfParmSlotsOffset_));
	}

	// U16 numberOfParmSlots
	public U16Pointer numberOfParmSlotsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._numberOfParmSlotsOffset_));
	}

	// U16 paddingTo32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_paddingTo32Offset_", declaredType="U16")
	public U16 paddingTo32() throws CorruptDataException {
		return new U16(getShortAtOffset(J9JITStackAtlas._paddingTo32Offset_));
	}

	// U16 paddingTo32
	public U16Pointer paddingTo32EA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._paddingTo32Offset_));
	}

	// I16 parmBaseOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parmBaseOffsetOffset_", declaredType="I16")
	public I16 parmBaseOffset() throws CorruptDataException {
		return new I16(getShortAtOffset(J9JITStackAtlas._parmBaseOffsetOffset_));
	}

	// I16 parmBaseOffset
	public I16Pointer parmBaseOffsetEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(J9JITStackAtlas._parmBaseOffsetOffset_));
	}

	// U8* stackAllocMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackAllocMapOffset_", declaredType="U8*")
	public U8Pointer stackAllocMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITStackAtlas._stackAllocMapOffset_));
	}

	// U8* stackAllocMap
	public PointerPointer stackAllocMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITStackAtlas._stackAllocMapOffset_));
	}

}
