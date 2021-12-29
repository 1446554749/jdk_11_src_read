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
 * Structure: jvmtiExtensionFunctionInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiExtensionFunctionInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiExtensionFunctionInfo.class)
public class jvmtiExtensionFunctionInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiExtensionFunctionInfoPointer NULL = new jvmtiExtensionFunctionInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiExtensionFunctionInfoPointer(long address) {
		super(address);
	}

	public static jvmtiExtensionFunctionInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiExtensionFunctionInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiExtensionFunctionInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiExtensionFunctionInfoPointer(address);
	}

	public jvmtiExtensionFunctionInfoPointer add(long count) {
		return jvmtiExtensionFunctionInfoPointer.cast(address + (jvmtiExtensionFunctionInfo.SIZEOF * count));
	}

	public jvmtiExtensionFunctionInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiExtensionFunctionInfoPointer addOffset(long offset) {
		return jvmtiExtensionFunctionInfoPointer.cast(address + offset);
	}

	public jvmtiExtensionFunctionInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiExtensionFunctionInfoPointer sub(long count) {
		return jvmtiExtensionFunctionInfoPointer.cast(address - (jvmtiExtensionFunctionInfo.SIZEOF * count));
	}

	public jvmtiExtensionFunctionInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiExtensionFunctionInfoPointer subOffset(long offset) {
		return jvmtiExtensionFunctionInfoPointer.cast(address - offset);
	}

	public jvmtiExtensionFunctionInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiExtensionFunctionInfoPointer untag(long mask) {
		return jvmtiExtensionFunctionInfoPointer.cast(address & ~mask);
	}

	public jvmtiExtensionFunctionInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiExtensionFunctionInfo.SIZEOF;
	}

	// Implementation methods

	// jint error_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_countOffset_", declaredType="jint")
	public IDATA error_count() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiExtensionFunctionInfo._error_countOffset_));
	}

	// jint error_count
	public IDATAPointer error_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._error_countOffset_));
	}

	// jvmtiError* errors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorsOffset_", declaredType="jvmtiError*")
	public EnumPointer errors() throws CorruptDataException {
		return EnumPointer.cast(getPointerAtOffset(jvmtiExtensionFunctionInfo._errorsOffset_), jvmtiError.class);
	}

	// jvmtiError* errors
	public PointerPointer errorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._errorsOffset_));
	}

	// jvmtiExtensionFunction func
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_funcOffset_", declaredType="jvmtiExtensionFunction")
	public VoidPointer func() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(jvmtiExtensionFunctionInfo._funcOffset_));
	}

	// jvmtiExtensionFunction func
	public PointerPointer funcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._funcOffset_));
	}

	// U8* id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="U8*")
	public U8Pointer id() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiExtensionFunctionInfo._idOffset_));
	}

	// U8* id
	public PointerPointer idEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._idOffset_));
	}

	// jint param_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_param_countOffset_", declaredType="jint")
	public IDATA param_count() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiExtensionFunctionInfo._param_countOffset_));
	}

	// jint param_count
	public IDATAPointer param_countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._param_countOffset_));
	}

	// jvmtiParamInfo* params
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_paramsOffset_", declaredType="jvmtiParamInfo*")
	public jvmtiParamInfoPointer params() throws CorruptDataException {
		return jvmtiParamInfoPointer.cast(getPointerAtOffset(jvmtiExtensionFunctionInfo._paramsOffset_));
	}

	// jvmtiParamInfo* params
	public PointerPointer paramsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._paramsOffset_));
	}

	// U8* short_description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_short_descriptionOffset_", declaredType="U8*")
	public U8Pointer short_description() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiExtensionFunctionInfo._short_descriptionOffset_));
	}

	// U8* short_description
	public PointerPointer short_descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiExtensionFunctionInfo._short_descriptionOffset_));
	}

}
