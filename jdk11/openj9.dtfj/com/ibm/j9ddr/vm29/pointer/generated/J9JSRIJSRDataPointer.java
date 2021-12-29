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
 * Structure: J9JSRIJSRDataPointer
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
 * The generated code will provide getters for all elements in the J9JSRIJSRDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JSRIJSRData.class)
public class J9JSRIJSRDataPointer extends StructurePointer {

	// NULL
	public static final J9JSRIJSRDataPointer NULL = new J9JSRIJSRDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JSRIJSRDataPointer(long address) {
		super(address);
	}

	public static J9JSRIJSRDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JSRIJSRDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JSRIJSRDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JSRIJSRDataPointer(address);
	}

	public J9JSRIJSRDataPointer add(long count) {
		return J9JSRIJSRDataPointer.cast(address + (J9JSRIJSRData.SIZEOF * count));
	}

	public J9JSRIJSRDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JSRIJSRDataPointer addOffset(long offset) {
		return J9JSRIJSRDataPointer.cast(address + offset);
	}

	public J9JSRIJSRDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JSRIJSRDataPointer sub(long count) {
		return J9JSRIJSRDataPointer.cast(address - (J9JSRIJSRData.SIZEOF * count));
	}

	public J9JSRIJSRDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JSRIJSRDataPointer subOffset(long offset) {
		return J9JSRIJSRDataPointer.cast(address - offset);
	}

	public J9JSRIJSRDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JSRIJSRDataPointer untag(long mask) {
		return J9JSRIJSRDataPointer.cast(address & ~mask);
	}

	public J9JSRIJSRDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JSRIJSRData.SIZEOF;
	}

	// Implementation methods

	// U8* locals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localsOffset_", declaredType="U8*")
	public U8Pointer locals() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIJSRData._localsOffset_));
	}

	// U8* locals
	public PointerPointer localsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._localsOffset_));
	}

	// U32 originalPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalPCOffset_", declaredType="U32")
	public UDATA originalPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JSRIJSRData._originalPCOffset_));
	}

	// U32 originalPC
	public UDATAPointer originalPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIJSRData._originalPCOffset_));
	}

	// J9JSRICodeBlock* parentBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parentBlockOffset_", declaredType="J9JSRICodeBlock*")
	public J9JSRICodeBlockPointer parentBlock() throws CorruptDataException {
		return J9JSRICodeBlockPointer.cast(getPointerAtOffset(J9JSRIJSRData._parentBlockOffset_));
	}

	// J9JSRICodeBlock* parentBlock
	public PointerPointer parentBlockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._parentBlockOffset_));
	}

	// J9JSRIJSRData* previousJSR
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousJSROffset_", declaredType="J9JSRIJSRData*")
	public J9JSRIJSRDataPointer previousJSR() throws CorruptDataException {
		return J9JSRIJSRDataPointer.cast(getPointerAtOffset(J9JSRIJSRData._previousJSROffset_));
	}

	// J9JSRIJSRData* previousJSR
	public PointerPointer previousJSREA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._previousJSROffset_));
	}

	// U32 retPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_retPCOffset_", declaredType="U32")
	public UDATA retPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JSRIJSRData._retPCOffset_));
	}

	// U32 retPC
	public UDATAPointer retPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIJSRData._retPCOffset_));
	}

	// U32* retPCPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_retPCPtrOffset_", declaredType="U32*")
	public UDATAPointer retPCPtr() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9JSRIJSRData._retPCPtrOffset_));
	}

	// U32* retPCPtr
	public PointerPointer retPCPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._retPCPtrOffset_));
	}

	// U32 spawnPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spawnPCOffset_", declaredType="U32")
	public UDATA spawnPC() throws CorruptDataException {
		return new U32(getIntAtOffset(J9JSRIJSRData._spawnPCOffset_));
	}

	// U32 spawnPC
	public UDATAPointer spawnPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JSRIJSRData._spawnPCOffset_));
	}

	// U8* stack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackOffset_", declaredType="U8*")
	public U8Pointer stack() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIJSRData._stackOffset_));
	}

	// U8* stack
	public PointerPointer stackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._stackOffset_));
	}

	// U8* stackBottom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackBottomOffset_", declaredType="U8*")
	public U8Pointer stackBottom() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JSRIJSRData._stackBottomOffset_));
	}

	// U8* stackBottom
	public PointerPointer stackBottomEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JSRIJSRData._stackBottomOffset_));
	}

}
