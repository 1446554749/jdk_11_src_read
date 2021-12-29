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
 * Structure: J9DbgROMClassBuilderPointer
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
 * The generated code will provide getters for all elements in the J9DbgROMClassBuilderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9DbgROMClassBuilder.class)
public class J9DbgROMClassBuilderPointer extends StructurePointer {

	// NULL
	public static final J9DbgROMClassBuilderPointer NULL = new J9DbgROMClassBuilderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9DbgROMClassBuilderPointer(long address) {
		super(address);
	}

	public static J9DbgROMClassBuilderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9DbgROMClassBuilderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9DbgROMClassBuilderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9DbgROMClassBuilderPointer(address);
	}

	public J9DbgROMClassBuilderPointer add(long count) {
		return J9DbgROMClassBuilderPointer.cast(address + (J9DbgROMClassBuilder.SIZEOF * count));
	}

	public J9DbgROMClassBuilderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9DbgROMClassBuilderPointer addOffset(long offset) {
		return J9DbgROMClassBuilderPointer.cast(address + offset);
	}

	public J9DbgROMClassBuilderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9DbgROMClassBuilderPointer sub(long count) {
		return J9DbgROMClassBuilderPointer.cast(address - (J9DbgROMClassBuilder.SIZEOF * count));
	}

	public J9DbgROMClassBuilderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9DbgROMClassBuilderPointer subOffset(long offset) {
		return J9DbgROMClassBuilderPointer.cast(address - offset);
	}

	public J9DbgROMClassBuilderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9DbgROMClassBuilderPointer untag(long mask) {
		return J9DbgROMClassBuilderPointer.cast(address & ~mask);
	}

	public J9DbgROMClassBuilderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9DbgROMClassBuilder.SIZEOF;
	}

	// Implementation methods

	// U8* anonClassNameBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonClassNameBufferOffset_", declaredType="U8*")
	public U8Pointer anonClassNameBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._anonClassNameBufferOffset_));
	}

	// U8* anonClassNameBuffer
	public PointerPointer anonClassNameBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._anonClassNameBufferOffset_));
	}

	// UDATA anonClassNameBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonClassNameBufferSizeOffset_", declaredType="UDATA")
	public UDATA anonClassNameBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DbgROMClassBuilder._anonClassNameBufferSizeOffset_);
	}

	// UDATA anonClassNameBufferSize
	public UDATAPointer anonClassNameBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._anonClassNameBufferSizeOffset_));
	}

	// U8* bufferManagerBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferManagerBufferOffset_", declaredType="U8*")
	public U8Pointer bufferManagerBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._bufferManagerBufferOffset_));
	}

	// U8* bufferManagerBuffer
	public PointerPointer bufferManagerBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._bufferManagerBufferOffset_));
	}

	// UDATA bufferManagerBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferManagerBufferSizeOffset_", declaredType="UDATA")
	public UDATA bufferManagerBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DbgROMClassBuilder._bufferManagerBufferSizeOffset_);
	}

	// UDATA bufferManagerBufferSize
	public UDATAPointer bufferManagerBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._bufferManagerBufferSizeOffset_));
	}

	// U8* classFileBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileBufferOffset_", declaredType="U8*")
	public U8Pointer classFileBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._classFileBufferOffset_));
	}

	// U8* classFileBuffer
	public PointerPointer classFileBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._classFileBufferOffset_));
	}

	// UDATA classFileParserBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileParserBufferSizeOffset_", declaredType="UDATA")
	public UDATA classFileParserBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(J9DbgROMClassBuilder._classFileParserBufferSizeOffset_);
	}

	// UDATA classFileParserBufferSize
	public UDATAPointer classFileParserBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._classFileParserBufferSizeOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._javaVMOffset_));
	}

	// J9PortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._portLibraryOffset_));
	}

	// J9PortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._portLibraryOffset_));
	}

	// J9DbgStringInternTable stringInternTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringInternTableOffset_", declaredType="J9DbgStringInternTable")
	public J9DbgStringInternTablePointer stringInternTable() throws CorruptDataException {
		return J9DbgStringInternTablePointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._stringInternTableOffset_));
	}

	// J9DbgStringInternTable stringInternTable
	public PointerPointer stringInternTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._stringInternTableOffset_));
	}

	// void* verifyClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyClassFunctionOffset_", declaredType="void*")
	public VoidPointer verifyClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._verifyClassFunctionOffset_));
	}

	// void* verifyClassFunction
	public PointerPointer verifyClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._verifyClassFunctionOffset_));
	}

	// U8* verifyExcludeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyExcludeAttributeOffset_", declaredType="U8*")
	public U8Pointer verifyExcludeAttribute() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DbgROMClassBuilder._verifyExcludeAttributeOffset_));
	}

	// U8* verifyExcludeAttribute
	public PointerPointer verifyExcludeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DbgROMClassBuilder._verifyExcludeAttributeOffset_));
	}

}
