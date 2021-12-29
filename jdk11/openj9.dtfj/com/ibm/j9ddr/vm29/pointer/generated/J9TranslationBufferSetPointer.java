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
 * Structure: J9TranslationBufferSetPointer
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
 * The generated code will provide getters for all elements in the J9TranslationBufferSetPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9TranslationBufferSet.class)
public class J9TranslationBufferSetPointer extends StructurePointer {

	// NULL
	public static final J9TranslationBufferSetPointer NULL = new J9TranslationBufferSetPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9TranslationBufferSetPointer(long address) {
		super(address);
	}

	public static J9TranslationBufferSetPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9TranslationBufferSetPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9TranslationBufferSetPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9TranslationBufferSetPointer(address);
	}

	public J9TranslationBufferSetPointer add(long count) {
		return J9TranslationBufferSetPointer.cast(address + (J9TranslationBufferSet.SIZEOF * count));
	}

	public J9TranslationBufferSetPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9TranslationBufferSetPointer addOffset(long offset) {
		return J9TranslationBufferSetPointer.cast(address + offset);
	}

	public J9TranslationBufferSetPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9TranslationBufferSetPointer sub(long count) {
		return J9TranslationBufferSetPointer.cast(address - (J9TranslationBufferSet.SIZEOF * count));
	}

	public J9TranslationBufferSetPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9TranslationBufferSetPointer subOffset(long offset) {
		return J9TranslationBufferSetPointer.cast(address - offset);
	}

	public J9TranslationBufferSetPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9TranslationBufferSetPointer untag(long mask) {
		return J9TranslationBufferSetPointer.cast(address & ~mask);
	}

	public J9TranslationBufferSetPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9TranslationBufferSet.SIZEOF;
	}

	// Implementation methods

	// U8* classFileError
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileErrorOffset_", declaredType="U8*")
	public U8Pointer classFileError() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9TranslationBufferSet._classFileErrorOffset_));
	}

	// U8* classFileError
	public PointerPointer classFileErrorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._classFileErrorOffset_));
	}

	// UDATA classFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileSizeOffset_", declaredType="UDATA")
	public UDATA classFileSize() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._classFileSizeOffset_);
	}

	// UDATA classFileSize
	public UDATAPointer classFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._classFileSizeOffset_));
	}

	// void* closeZipFileFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_closeZipFileFunctionOffset_", declaredType="void*")
	public VoidPointer closeZipFileFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._closeZipFileFunctionOffset_));
	}

	// void* closeZipFileFunction
	public PointerPointer closeZipFileFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._closeZipFileFunctionOffset_));
	}

	// UDATA currentSunClassFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentSunClassFileSizeOffset_", declaredType="UDATA")
	public UDATA currentSunClassFileSize() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._currentSunClassFileSizeOffset_);
	}

	// UDATA currentSunClassFileSize
	public UDATAPointer currentSunClassFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._currentSunClassFileSizeOffset_));
	}

	// J9DynamicLoadStats* dynamicLoadStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicLoadStatsOffset_", declaredType="J9DynamicLoadStats*")
	public J9DynamicLoadStatsPointer dynamicLoadStats() throws CorruptDataException {
		return J9DynamicLoadStatsPointer.cast(getPointerAtOffset(J9TranslationBufferSet._dynamicLoadStatsOffset_));
	}

	// J9DynamicLoadStats* dynamicLoadStats
	public PointerPointer dynamicLoadStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._dynamicLoadStatsOffset_));
	}

	// void* findLocallyDefinedClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_findLocallyDefinedClassFunctionOffset_", declaredType="void*")
	public VoidPointer findLocallyDefinedClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._findLocallyDefinedClassFunctionOffset_));
	}

	// void* findLocallyDefinedClassFunction
	public PointerPointer findLocallyDefinedClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._findLocallyDefinedClassFunctionOffset_));
	}

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._flagsOffset_));
	}

	// void* internalDefineClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalDefineClassFunctionOffset_", declaredType="void*")
	public VoidPointer internalDefineClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._internalDefineClassFunctionOffset_));
	}

	// void* internalDefineClassFunction
	public PointerPointer internalDefineClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._internalDefineClassFunctionOffset_));
	}

	// void* internalLoadROMClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_internalLoadROMClassFunctionOffset_", declaredType="void*")
	public VoidPointer internalLoadROMClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._internalLoadROMClassFunctionOffset_));
	}

	// void* internalLoadROMClassFunction
	public PointerPointer internalLoadROMClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._internalLoadROMClassFunctionOffset_));
	}

	// UDATA relocatorDLLHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_relocatorDLLHandleOffset_", declaredType="UDATA")
	public UDATA relocatorDLLHandle() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._relocatorDLLHandleOffset_);
	}

	// UDATA relocatorDLLHandle
	public UDATAPointer relocatorDLLHandleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._relocatorDLLHandleOffset_));
	}

	// void* reportStatisticsFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reportStatisticsFunctionOffset_", declaredType="void*")
	public VoidPointer reportStatisticsFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._reportStatisticsFunctionOffset_));
	}

	// void* reportStatisticsFunction
	public PointerPointer reportStatisticsFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._reportStatisticsFunctionOffset_));
	}

	// void* romClassBuilder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassBuilderOffset_", declaredType="void*")
	public VoidPointer romClassBuilder() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._romClassBuilderOffset_));
	}

	// void* romClassBuilder
	public PointerPointer romClassBuilderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._romClassBuilderOffset_));
	}

	// U8* searchFilenameBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_searchFilenameBufferOffset_", declaredType="U8*")
	public U8Pointer searchFilenameBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9TranslationBufferSet._searchFilenameBufferOffset_));
	}

	// U8* searchFilenameBuffer
	public PointerPointer searchFilenameBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._searchFilenameBufferOffset_));
	}

	// UDATA searchFilenameSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_searchFilenameSizeOffset_", declaredType="UDATA")
	public UDATA searchFilenameSize() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._searchFilenameSizeOffset_);
	}

	// UDATA searchFilenameSize
	public UDATAPointer searchFilenameSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._searchFilenameSizeOffset_));
	}

	// U8* sunClassFileBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sunClassFileBufferOffset_", declaredType="U8*")
	public U8Pointer sunClassFileBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9TranslationBufferSet._sunClassFileBufferOffset_));
	}

	// U8* sunClassFileBuffer
	public PointerPointer sunClassFileBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._sunClassFileBufferOffset_));
	}

	// UDATA sunClassFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sunClassFileSizeOffset_", declaredType="UDATA")
	public UDATA sunClassFileSize() throws CorruptDataException {
		return getUDATAAtOffset(J9TranslationBufferSet._sunClassFileSizeOffset_);
	}

	// UDATA sunClassFileSize
	public UDATAPointer sunClassFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9TranslationBufferSet._sunClassFileSizeOffset_));
	}

	// void* transformROMClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_transformROMClassFunctionOffset_", declaredType="void*")
	public VoidPointer transformROMClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9TranslationBufferSet._transformROMClassFunctionOffset_));
	}

	// void* transformROMClassFunction
	public PointerPointer transformROMClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationBufferSet._transformROMClassFunctionOffset_));
	}

}
