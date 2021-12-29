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
 * Structure: J9CrashDataPointer
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
 * The generated code will provide getters for all elements in the J9CrashDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CrashData.class)
public class J9CrashDataPointer extends StructurePointer {

	// NULL
	public static final J9CrashDataPointer NULL = new J9CrashDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CrashDataPointer(long address) {
		super(address);
	}

	public static J9CrashDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CrashDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CrashDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CrashDataPointer(address);
	}

	public J9CrashDataPointer add(long count) {
		return J9CrashDataPointer.cast(address + (J9CrashData.SIZEOF * count));
	}

	public J9CrashDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CrashDataPointer addOffset(long offset) {
		return J9CrashDataPointer.cast(address + offset);
	}

	public J9CrashDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CrashDataPointer sub(long count) {
		return J9CrashDataPointer.cast(address - (J9CrashData.SIZEOF * count));
	}

	public J9CrashDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CrashDataPointer subOffset(long offset) {
		return J9CrashDataPointer.cast(address - offset);
	}

	public J9CrashDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CrashDataPointer untag(long mask) {
		return J9CrashDataPointer.cast(address & ~mask);
	}

	public J9CrashDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CrashData.SIZEOF;
	}

	// Implementation methods

	// U8* consoleOutputBuf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_consoleOutputBufOffset_", declaredType="U8*")
	public U8Pointer consoleOutputBuf() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9CrashData._consoleOutputBufOffset_));
	}

	// U8* consoleOutputBuf
	public PointerPointer consoleOutputBufEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CrashData._consoleOutputBufOffset_));
	}

	// void* gpInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpInfoOffset_", declaredType="void*")
	public VoidPointer gpInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9CrashData._gpInfoOffset_));
	}

	// void* gpInfo
	public PointerPointer gpInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CrashData._gpInfoOffset_));
	}

	// U32 gpType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gpTypeOffset_", declaredType="U32")
	public UDATA gpType() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CrashData._gpTypeOffset_));
	}

	// U32 gpType
	public UDATAPointer gpTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CrashData._gpTypeOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9CrashData._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CrashData._javaVMOffset_));
	}

	// J9RASCrashInfo* rasCrashInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rasCrashInfoOffset_", declaredType="J9RASCrashInfo*")
	public J9RASCrashInfoPointer rasCrashInfo() throws CorruptDataException {
		return J9RASCrashInfoPointer.cast(getPointerAtOffset(J9CrashData._rasCrashInfoOffset_));
	}

	// J9RASCrashInfo* rasCrashInfo
	public PointerPointer rasCrashInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CrashData._rasCrashInfoOffset_));
	}

	// size_t sizeofConsoleOutputBuf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeofConsoleOutputBufOffset_", declaredType="size_t")
	public UDATA sizeofConsoleOutputBuf() throws CorruptDataException {
		return new U64(getLongAtOffset(J9CrashData._sizeofConsoleOutputBufOffset_));
	}

	// size_t sizeofConsoleOutputBuf
	public UDATAPointer sizeofConsoleOutputBufEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CrashData._sizeofConsoleOutputBufOffset_));
	}

	// J9VMThread* vmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer vmThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9CrashData._vmThreadOffset_));
	}

	// J9VMThread* vmThread
	public PointerPointer vmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CrashData._vmThreadOffset_));
	}

}
