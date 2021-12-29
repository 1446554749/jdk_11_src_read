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
 * Structure: ROMClassBuilderPointer
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
 * The generated code will provide getters for all elements in the ROMClassBuilderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassBuilder.class)
public class ROMClassBuilderPointer extends StructurePointer {

	// NULL
	public static final ROMClassBuilderPointer NULL = new ROMClassBuilderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassBuilderPointer(long address) {
		super(address);
	}

	public static ROMClassBuilderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassBuilderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassBuilderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassBuilderPointer(address);
	}

	public ROMClassBuilderPointer add(long count) {
		return ROMClassBuilderPointer.cast(address + (ROMClassBuilder.SIZEOF * count));
	}

	public ROMClassBuilderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassBuilderPointer addOffset(long offset) {
		return ROMClassBuilderPointer.cast(address + offset);
	}

	public ROMClassBuilderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassBuilderPointer sub(long count) {
		return ROMClassBuilderPointer.cast(address - (ROMClassBuilder.SIZEOF * count));
	}

	public ROMClassBuilderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassBuilderPointer subOffset(long offset) {
		return ROMClassBuilderPointer.cast(address - offset);
	}

	public ROMClassBuilderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassBuilderPointer untag(long mask) {
		return ROMClassBuilderPointer.cast(address & ~mask);
	}

	public ROMClassBuilderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassBuilder.SIZEOF;
	}

	// Implementation methods

	// U8* _anonClassNameBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anonClassNameBufferOffset_", declaredType="U8*")
	public U8Pointer _anonClassNameBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassBuilder.__anonClassNameBufferOffset_));
	}

	// U8* _anonClassNameBuffer
	public PointerPointer _anonClassNameBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__anonClassNameBufferOffset_));
	}

	// UDATA _anonClassNameBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anonClassNameBufferSizeOffset_", declaredType="UDATA")
	public UDATA _anonClassNameBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassBuilder.__anonClassNameBufferSizeOffset_);
	}

	// UDATA _anonClassNameBufferSize
	public UDATAPointer _anonClassNameBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassBuilder.__anonClassNameBufferSizeOffset_));
	}

	// U8* _bufferManagerBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerBufferOffset_", declaredType="U8*")
	public U8Pointer _bufferManagerBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassBuilder.__bufferManagerBufferOffset_));
	}

	// U8* _bufferManagerBuffer
	public PointerPointer _bufferManagerBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__bufferManagerBufferOffset_));
	}

	// UDATA _bufferManagerSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerSizeOffset_", declaredType="UDATA")
	public UDATA _bufferManagerSize() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassBuilder.__bufferManagerSizeOffset_);
	}

	// UDATA _bufferManagerSize
	public UDATAPointer _bufferManagerSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassBuilder.__bufferManagerSizeOffset_));
	}

	// U8* _classFileBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileBufferOffset_", declaredType="U8*")
	public U8Pointer _classFileBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassBuilder.__classFileBufferOffset_));
	}

	// U8* _classFileBuffer
	public PointerPointer _classFileBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__classFileBufferOffset_));
	}

	// UDATA _classFileParserBufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileParserBufferSizeOffset_", declaredType="UDATA")
	public UDATA _classFileParserBufferSize() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassBuilder.__classFileParserBufferSizeOffset_);
	}

	// UDATA _classFileParserBufferSize
	public UDATAPointer _classFileParserBufferSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassBuilder.__classFileParserBufferSizeOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(ROMClassBuilder.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__javaVMOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(ROMClassBuilder.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__portLibraryOffset_));
	}

	// StringInternTable _stringInternTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stringInternTableOffset_", declaredType="StringInternTable")
	public StringInternTablePointer _stringInternTable() throws CorruptDataException {
		return StringInternTablePointer.cast(nonNullFieldEA(ROMClassBuilder.__stringInternTableOffset_));
	}

	// StringInternTable _stringInternTable
	public PointerPointer _stringInternTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__stringInternTableOffset_));
	}

	// VerifyClassFunction _verifyClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verifyClassFunctionOffset_", declaredType="VerifyClassFunction")
	public VoidPointer _verifyClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ROMClassBuilder.__verifyClassFunctionOffset_));
	}

	// VerifyClassFunction _verifyClassFunction
	public PointerPointer _verifyClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__verifyClassFunctionOffset_));
	}

	// U8* _verifyExcludeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verifyExcludeAttributeOffset_", declaredType="U8*")
	public U8Pointer _verifyExcludeAttribute() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassBuilder.__verifyExcludeAttributeOffset_));
	}

	// U8* _verifyExcludeAttribute
	public PointerPointer _verifyExcludeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassBuilder.__verifyExcludeAttributeOffset_));
	}

}
