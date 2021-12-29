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
 * Structure: MethodContextInfoPointer
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
 * The generated code will provide getters for all elements in the MethodContextInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MethodContextInfo.class)
public class MethodContextInfoPointer extends StructurePointer {

	// NULL
	public static final MethodContextInfoPointer NULL = new MethodContextInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MethodContextInfoPointer(long address) {
		super(address);
	}

	public static MethodContextInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MethodContextInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MethodContextInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MethodContextInfoPointer(address);
	}

	public MethodContextInfoPointer add(long count) {
		return MethodContextInfoPointer.cast(address + (MethodContextInfo.SIZEOF * count));
	}

	public MethodContextInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MethodContextInfoPointer addOffset(long offset) {
		return MethodContextInfoPointer.cast(address + offset);
	}

	public MethodContextInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MethodContextInfoPointer sub(long count) {
		return MethodContextInfoPointer.cast(address - (MethodContextInfo.SIZEOF * count));
	}

	public MethodContextInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MethodContextInfoPointer subOffset(long offset) {
		return MethodContextInfoPointer.cast(address - offset);
	}

	public MethodContextInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MethodContextInfoPointer untag(long mask) {
		return MethodContextInfoPointer.cast(address & ~mask);
	}

	public MethodContextInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MethodContextInfo.SIZEOF;
	}

	// Implementation methods

	// J9UTF8Ref className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="J9UTF8Ref")
	public J9UTF8RefPointer className() throws CorruptDataException {
		return J9UTF8RefPointer.cast(nonNullFieldEA(MethodContextInfo._classNameOffset_));
	}

	// J9UTF8Ref className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._classNameOffset_));
	}

	// void* classNameList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameListOffset_", declaredType="void*")
	public VoidPointer classNameList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._classNameListOffset_));
	}

	// void* classNameList
	public PointerPointer classNameListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._classNameListOffset_));
	}

	// U8* code
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeOffset_", declaredType="U8*")
	public U8Pointer code() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MethodContextInfo._codeOffset_));
	}

	// U8* code
	public PointerPointer codeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._codeOffset_));
	}

	// U32 codeLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_codeLengthOffset_", declaredType="U32")
	public UDATA codeLength() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodContextInfo._codeLengthOffset_));
	}

	// U32 codeLength
	public UDATAPointer codeLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodContextInfo._codeLengthOffset_));
	}

	// void* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="void*")
	public VoidPointer constantPool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._constantPoolOffset_));
	}

	// void* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._constantPoolOffset_));
	}

	// void* exceptionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableOffset_", declaredType="void*")
	public VoidPointer exceptionTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._exceptionTableOffset_));
	}

	// void* exceptionTable
	public PointerPointer exceptionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._exceptionTableOffset_));
	}

	// U16 exceptionTableLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTableLengthOffset_", declaredType="U16")
	public U16 exceptionTableLength() throws CorruptDataException {
		return new U16(getShortAtOffset(MethodContextInfo._exceptionTableLengthOffset_));
	}

	// U16 exceptionTableLength
	public U16Pointer exceptionTableLengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(MethodContextInfo._exceptionTableLengthOffset_));
	}

	// getExceptionTableEntryFunc getExceptionRange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getExceptionRangeOffset_", declaredType="getExceptionTableEntryFunc")
	public VoidPointer getExceptionRange() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._getExceptionRangeOffset_));
	}

	// getExceptionTableEntryFunc getExceptionRange
	public PointerPointer getExceptionRangeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._getExceptionRangeOffset_));
	}

	// getStringfromClassNameListFunc getStringfromClassNameList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getStringfromClassNameListOffset_", declaredType="getStringfromClassNameListFunc")
	public VoidPointer getStringfromClassNameList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._getStringfromClassNameListOffset_));
	}

	// getStringfromClassNameListFunc getStringfromClassNameList
	public PointerPointer getStringfromClassNameListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._getStringfromClassNameListOffset_));
	}

	// getUTF8StringfromCPFunc getUTF8StringfromCP
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_getUTF8StringfromCPOffset_", declaredType="getUTF8StringfromCPFunc")
	public VoidPointer getUTF8StringfromCP() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._getUTF8StringfromCPOffset_));
	}

	// getUTF8StringfromCPFunc getUTF8StringfromCP
	public PointerPointer getUTF8StringfromCPEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._getUTF8StringfromCPOffset_));
	}

	// U16 maxLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxLocalsOffset_", declaredType="U16")
	public U16 maxLocals() throws CorruptDataException {
		return new U16(getShortAtOffset(MethodContextInfo._maxLocalsOffset_));
	}

	// U16 maxLocals
	public U16Pointer maxLocalsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(MethodContextInfo._maxLocalsOffset_));
	}

	// U16 maxStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxStackOffset_", declaredType="U16")
	public U16 maxStack() throws CorruptDataException {
		return new U16(getShortAtOffset(MethodContextInfo._maxStackOffset_));
	}

	// U16 maxStack
	public U16Pointer maxStackEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(MethodContextInfo._maxStackOffset_));
	}

	// J9UTF8Ref methodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameOffset_", declaredType="J9UTF8Ref")
	public J9UTF8RefPointer methodName() throws CorruptDataException {
		return J9UTF8RefPointer.cast(nonNullFieldEA(MethodContextInfo._methodNameOffset_));
	}

	// J9UTF8Ref methodName
	public PointerPointer methodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._methodNameOffset_));
	}

	// U32 modifier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modifierOffset_", declaredType="U32")
	public UDATA modifier() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodContextInfo._modifierOffset_));
	}

	// U32 modifier
	public UDATAPointer modifierEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodContextInfo._modifierOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(MethodContextInfo._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._portLibOffset_));
	}

	// void* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="void*")
	public VoidPointer romClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MethodContextInfo._romClassOffset_));
	}

	// void* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._romClassOffset_));
	}

	// J9UTF8Ref signature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signatureOffset_", declaredType="J9UTF8Ref")
	public J9UTF8RefPointer signature() throws CorruptDataException {
		return J9UTF8RefPointer.cast(nonNullFieldEA(MethodContextInfo._signatureOffset_));
	}

	// J9UTF8Ref signature
	public PointerPointer signatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._signatureOffset_));
	}

	// U16 stackMapCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapCountOffset_", declaredType="U16")
	public U16 stackMapCount() throws CorruptDataException {
		return new U16(getShortAtOffset(MethodContextInfo._stackMapCountOffset_));
	}

	// U16 stackMapCount
	public U16Pointer stackMapCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(MethodContextInfo._stackMapCountOffset_));
	}

	// U8* stackMapData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapDataOffset_", declaredType="U8*")
	public U8Pointer stackMapData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MethodContextInfo._stackMapDataOffset_));
	}

	// U8* stackMapData
	public PointerPointer stackMapDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MethodContextInfo._stackMapDataOffset_));
	}

	// U32 stackMapLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapLengthOffset_", declaredType="U32")
	public UDATA stackMapLength() throws CorruptDataException {
		return new U32(getIntAtOffset(MethodContextInfo._stackMapLengthOffset_));
	}

	// U32 stackMapLength
	public UDATAPointer stackMapLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MethodContextInfo._stackMapLengthOffset_));
	}

}
