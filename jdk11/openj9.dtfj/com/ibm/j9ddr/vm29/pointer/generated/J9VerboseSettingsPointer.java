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
 * Structure: J9VerboseSettingsPointer
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
 * The generated code will provide getters for all elements in the J9VerboseSettingsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VerboseSettings.class)
public class J9VerboseSettingsPointer extends StructurePointer {

	// NULL
	public static final J9VerboseSettingsPointer NULL = new J9VerboseSettingsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VerboseSettingsPointer(long address) {
		super(address);
	}

	public static J9VerboseSettingsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VerboseSettingsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VerboseSettingsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VerboseSettingsPointer(address);
	}

	public J9VerboseSettingsPointer add(long count) {
		return J9VerboseSettingsPointer.cast(address + (J9VerboseSettings.SIZEOF * count));
	}

	public J9VerboseSettingsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VerboseSettingsPointer addOffset(long offset) {
		return J9VerboseSettingsPointer.cast(address + offset);
	}

	public J9VerboseSettingsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VerboseSettingsPointer sub(long count) {
		return J9VerboseSettingsPointer.cast(address - (J9VerboseSettings.SIZEOF * count));
	}

	public J9VerboseSettingsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VerboseSettingsPointer subOffset(long offset) {
		return J9VerboseSettingsPointer.cast(address - offset);
	}

	public J9VerboseSettingsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VerboseSettingsPointer untag(long mask) {
		return J9VerboseSettingsPointer.cast(address & ~mask);
	}

	public J9VerboseSettingsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VerboseSettings.SIZEOF;
	}

	// Implementation methods

	// U8 debug
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_debugOffset_", declaredType="U8")
	public U8 debug() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._debugOffset_));
	}

	// U8 debug
	public U8Pointer debugEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._debugOffset_));
	}

	// U8 dynload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynloadOffset_", declaredType="U8")
	public U8 dynload() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._dynloadOffset_));
	}

	// U8 dynload
	public U8Pointer dynloadEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._dynloadOffset_));
	}

	// U8 gc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcOffset_", declaredType="U8")
	public U8 gc() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._gcOffset_));
	}

	// U8 gc
	public U8Pointer gcEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._gcOffset_));
	}

	// U8 gcterse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcterseOffset_", declaredType="U8")
	public U8 gcterse() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._gcterseOffset_));
	}

	// U8 gcterse
	public U8Pointer gcterseEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._gcterseOffset_));
	}

	// U8 init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initOffset_", declaredType="U8")
	public U8 init() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._initOffset_));
	}

	// U8 init
	public U8Pointer initEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._initOffset_));
	}

	// U8 jni
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniOffset_", declaredType="U8")
	public U8 jni() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._jniOffset_));
	}

	// U8 jni
	public U8Pointer jniEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._jniOffset_));
	}

	// U8 module
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleOffset_", declaredType="U8")
	public U8 module() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._moduleOffset_));
	}

	// U8 module
	public U8Pointer moduleEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._moduleOffset_));
	}

	// U8 relocations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_relocationsOffset_", declaredType="U8")
	public U8 relocations() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._relocationsOffset_));
	}

	// U8 relocations
	public U8Pointer relocationsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._relocationsOffset_));
	}

	// U8 romclass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romclassOffset_", declaredType="U8")
	public U8 romclass() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._romclassOffset_));
	}

	// U8 romclass
	public U8Pointer romclassEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._romclassOffset_));
	}

	// U8 shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shutdownOffset_", declaredType="U8")
	public U8 shutdown() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._shutdownOffset_));
	}

	// U8 shutdown
	public U8Pointer shutdownEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._shutdownOffset_));
	}

	// U8 sizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizesOffset_", declaredType="U8")
	public U8 sizes() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._sizesOffset_));
	}

	// U8 sizes
	public U8Pointer sizesEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._sizesOffset_));
	}

	// U8 stack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackOffset_", declaredType="U8")
	public U8 stack() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._stackOffset_));
	}

	// U8 stack
	public U8Pointer stackEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._stackOffset_));
	}

	// UDATA stackWalkVerboseLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackWalkVerboseLevelOffset_", declaredType="UDATA")
	public UDATA stackWalkVerboseLevel() throws CorruptDataException {
		return getUDATAAtOffset(J9VerboseSettings._stackWalkVerboseLevelOffset_);
	}

	// UDATA stackWalkVerboseLevel
	public UDATAPointer stackWalkVerboseLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VerboseSettings._stackWalkVerboseLevelOffset_));
	}

	// U8 stacktrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stacktraceOffset_", declaredType="U8")
	public U8 stacktrace() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._stacktraceOffset_));
	}

	// U8 stacktrace
	public U8Pointer stacktraceEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._stacktraceOffset_));
	}

	// U8 stackwalk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackwalkOffset_", declaredType="U8")
	public U8 stackwalk() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._stackwalkOffset_));
	}

	// U8 stackwalk
	public U8Pointer stackwalkEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._stackwalkOffset_));
	}

	// U8 vclass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vclassOffset_", declaredType="U8")
	public U8 vclass() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._vclassOffset_));
	}

	// U8 vclass
	public U8Pointer vclassEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._vclassOffset_));
	}

	// U8 verification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verificationOffset_", declaredType="U8")
	public U8 verification() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._verificationOffset_));
	}

	// U8 verification
	public U8Pointer verificationEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._verificationOffset_));
	}

	// U8 verifyErrorDetails
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verifyErrorDetailsOffset_", declaredType="U8")
	public U8 verifyErrorDetails() throws CorruptDataException {
		return new U8(getByteAtOffset(J9VerboseSettings._verifyErrorDetailsOffset_));
	}

	// U8 verifyErrorDetails
	public U8Pointer verifyErrorDetailsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VerboseSettings._verifyErrorDetailsOffset_));
	}

}
