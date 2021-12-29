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
 * Structure: J9ClassHotFieldsInfoPointer
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
 * The generated code will provide getters for all elements in the J9ClassHotFieldsInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClassHotFieldsInfo.class)
public class J9ClassHotFieldsInfoPointer extends StructurePointer {

	// NULL
	public static final J9ClassHotFieldsInfoPointer NULL = new J9ClassHotFieldsInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClassHotFieldsInfoPointer(long address) {
		super(address);
	}

	public static J9ClassHotFieldsInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClassHotFieldsInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClassHotFieldsInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClassHotFieldsInfoPointer(address);
	}

	public J9ClassHotFieldsInfoPointer add(long count) {
		return J9ClassHotFieldsInfoPointer.cast(address + (J9ClassHotFieldsInfo.SIZEOF * count));
	}

	public J9ClassHotFieldsInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClassHotFieldsInfoPointer addOffset(long offset) {
		return J9ClassHotFieldsInfoPointer.cast(address + offset);
	}

	public J9ClassHotFieldsInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClassHotFieldsInfoPointer sub(long count) {
		return J9ClassHotFieldsInfoPointer.cast(address - (J9ClassHotFieldsInfo.SIZEOF * count));
	}

	public J9ClassHotFieldsInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClassHotFieldsInfoPointer subOffset(long offset) {
		return J9ClassHotFieldsInfoPointer.cast(address - offset);
	}

	public J9ClassHotFieldsInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClassHotFieldsInfoPointer untag(long mask) {
		return J9ClassHotFieldsInfoPointer.cast(address & ~mask);
	}

	public J9ClassHotFieldsInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClassHotFieldsInfo.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ClassHotFieldsInfo._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._classLoaderOffset_));
	}

	// U8 consecutiveHotFieldSelections
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_consecutiveHotFieldSelectionsOffset_", declaredType="U8")
	public U8 consecutiveHotFieldSelections() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ClassHotFieldsInfo._consecutiveHotFieldSelectionsOffset_));
	}

	// U8 consecutiveHotFieldSelections
	public U8Pointer consecutiveHotFieldSelectionsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._consecutiveHotFieldSelectionsOffset_));
	}

	// J9HotField* hotFieldListHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldListHeadOffset_", declaredType="J9HotField*")
	public J9HotFieldPointer hotFieldListHead() throws CorruptDataException {
		return J9HotFieldPointer.cast(getPointerAtOffset(J9ClassHotFieldsInfo._hotFieldListHeadOffset_));
	}

	// J9HotField* hotFieldListHead
	public PointerPointer hotFieldListHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._hotFieldListHeadOffset_));
	}

	// U8 hotFieldListLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldListLengthOffset_", declaredType="U8")
	public U8 hotFieldListLength() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ClassHotFieldsInfo._hotFieldListLengthOffset_));
	}

	// U8 hotFieldListLength
	public U8Pointer hotFieldListLengthEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._hotFieldListLengthOffset_));
	}

	// U8 hotFieldOffset1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldOffset1Offset_", declaredType="U8")
	public U8 hotFieldOffset1() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ClassHotFieldsInfo._hotFieldOffset1Offset_));
	}

	// U8 hotFieldOffset1
	public U8Pointer hotFieldOffset1EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._hotFieldOffset1Offset_));
	}

	// U8 hotFieldOffset2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldOffset2Offset_", declaredType="U8")
	public U8 hotFieldOffset2() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ClassHotFieldsInfo._hotFieldOffset2Offset_));
	}

	// U8 hotFieldOffset2
	public U8Pointer hotFieldOffset2EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._hotFieldOffset2Offset_));
	}

	// U8 hotFieldOffset3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldOffset3Offset_", declaredType="U8")
	public U8 hotFieldOffset3() throws CorruptDataException {
		return new U8(getByteAtOffset(J9ClassHotFieldsInfo._hotFieldOffset3Offset_));
	}

	// U8 hotFieldOffset3
	public U8Pointer hotFieldOffset3EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._hotFieldOffset3Offset_));
	}

	// BOOLEAN isClassHotFieldListDirty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isClassHotFieldListDirtyOffset_", declaredType="BOOLEAN")
	public UDATA isClassHotFieldListDirty() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ClassHotFieldsInfo._isClassHotFieldListDirtyOffset_));
	}

	// BOOLEAN isClassHotFieldListDirty
	public UDATAPointer isClassHotFieldListDirtyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClassHotFieldsInfo._isClassHotFieldListDirtyOffset_));
	}

}
