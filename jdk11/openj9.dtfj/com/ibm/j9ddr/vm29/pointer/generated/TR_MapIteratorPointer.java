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
 * Structure: TR_MapIteratorPointer
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
 * The generated code will provide getters for all elements in the TR_MapIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=TR_MapIterator.class)
public class TR_MapIteratorPointer extends StructurePointer {

	// NULL
	public static final TR_MapIteratorPointer NULL = new TR_MapIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected TR_MapIteratorPointer(long address) {
		super(address);
	}

	public static TR_MapIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static TR_MapIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static TR_MapIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new TR_MapIteratorPointer(address);
	}

	public TR_MapIteratorPointer add(long count) {
		return TR_MapIteratorPointer.cast(address + (TR_MapIterator.SIZEOF * count));
	}

	public TR_MapIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public TR_MapIteratorPointer addOffset(long offset) {
		return TR_MapIteratorPointer.cast(address + offset);
	}

	public TR_MapIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public TR_MapIteratorPointer sub(long count) {
		return TR_MapIteratorPointer.cast(address - (TR_MapIterator.SIZEOF * count));
	}

	public TR_MapIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public TR_MapIteratorPointer subOffset(long offset) {
		return TR_MapIteratorPointer.cast(address - offset);
	}

	public TR_MapIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public TR_MapIteratorPointer untag(long mask) {
		return TR_MapIteratorPointer.cast(address & ~mask);
	}

	public TR_MapIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return TR_MapIterator.SIZEOF;
	}

	// Implementation methods

	// U8* _currentInlineMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentInlineMapOffset_", declaredType="U8*")
	public U8Pointer _currentInlineMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(TR_MapIterator.__currentInlineMapOffset_));
	}

	// U8* _currentInlineMap
	public PointerPointer _currentInlineMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__currentInlineMapOffset_));
	}

	// U8* _currentMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentMapOffset_", declaredType="U8*")
	public U8Pointer _currentMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(TR_MapIterator.__currentMapOffset_));
	}

	// U8* _currentMap
	public PointerPointer _currentMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__currentMapOffset_));
	}

	// U8* _currentStackMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentStackMapOffset_", declaredType="U8*")
	public U8Pointer _currentStackMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(TR_MapIterator.__currentStackMapOffset_));
	}

	// U8* _currentStackMap
	public PointerPointer _currentStackMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__currentStackMapOffset_));
	}

	// U32 _mapIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mapIndexOffset_", declaredType="U32")
	public UDATA _mapIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(TR_MapIterator.__mapIndexOffset_));
	}

	// U32 _mapIndex
	public UDATAPointer _mapIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TR_MapIterator.__mapIndexOffset_));
	}

	// J9TR_MethodMetaData* _methodMetaData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodMetaDataOffset_", declaredType="J9TR_MethodMetaData*")
	public J9JITExceptionTablePointer _methodMetaData() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(TR_MapIterator.__methodMetaDataOffset_));
	}

	// J9TR_MethodMetaData* _methodMetaData
	public PointerPointer _methodMetaDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__methodMetaDataOffset_));
	}

	// U8* _nextMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextMapOffset_", declaredType="U8*")
	public U8Pointer _nextMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(TR_MapIterator.__nextMapOffset_));
	}

	// U8* _nextMap
	public PointerPointer _nextMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__nextMapOffset_));
	}

	// UDATA _rangeEndOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rangeEndOffsetOffset_", declaredType="UDATA")
	public UDATA _rangeEndOffset() throws CorruptDataException {
		return getUDATAAtOffset(TR_MapIterator.__rangeEndOffsetOffset_);
	}

	// UDATA _rangeEndOffset
	public UDATAPointer _rangeEndOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TR_MapIterator.__rangeEndOffsetOffset_));
	}

	// UDATA _rangeStartOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rangeStartOffsetOffset_", declaredType="UDATA")
	public UDATA _rangeStartOffset() throws CorruptDataException {
		return getUDATAAtOffset(TR_MapIterator.__rangeStartOffsetOffset_);
	}

	// UDATA _rangeStartOffset
	public UDATAPointer _rangeStartOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TR_MapIterator.__rangeStartOffsetOffset_));
	}

	// J9JITStackAtlas* _stackAtlas
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stackAtlasOffset_", declaredType="J9JITStackAtlas*")
	public J9JITStackAtlasPointer _stackAtlas() throws CorruptDataException {
		return J9JITStackAtlasPointer.cast(getPointerAtOffset(TR_MapIterator.__stackAtlasOffset_));
	}

	// J9JITStackAtlas* _stackAtlas
	public PointerPointer _stackAtlasEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(TR_MapIterator.__stackAtlasOffset_));
	}

}
