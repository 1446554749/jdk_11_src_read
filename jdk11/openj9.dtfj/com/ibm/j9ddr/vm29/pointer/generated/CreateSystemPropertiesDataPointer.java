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
 * Structure: CreateSystemPropertiesDataPointer
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
 * The generated code will provide getters for all elements in the CreateSystemPropertiesDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=CreateSystemPropertiesData.class)
public class CreateSystemPropertiesDataPointer extends StructurePointer {

	// NULL
	public static final CreateSystemPropertiesDataPointer NULL = new CreateSystemPropertiesDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CreateSystemPropertiesDataPointer(long address) {
		super(address);
	}

	public static CreateSystemPropertiesDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CreateSystemPropertiesDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CreateSystemPropertiesDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CreateSystemPropertiesDataPointer(address);
	}

	public CreateSystemPropertiesDataPointer add(long count) {
		return CreateSystemPropertiesDataPointer.cast(address + (CreateSystemPropertiesData.SIZEOF * count));
	}

	public CreateSystemPropertiesDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public CreateSystemPropertiesDataPointer addOffset(long offset) {
		return CreateSystemPropertiesDataPointer.cast(address + offset);
	}

	public CreateSystemPropertiesDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CreateSystemPropertiesDataPointer sub(long count) {
		return CreateSystemPropertiesDataPointer.cast(address - (CreateSystemPropertiesData.SIZEOF * count));
	}

	public CreateSystemPropertiesDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CreateSystemPropertiesDataPointer subOffset(long offset) {
		return CreateSystemPropertiesDataPointer.cast(address - offset);
	}

	public CreateSystemPropertiesDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CreateSystemPropertiesDataPointer untag(long mask) {
		return CreateSystemPropertiesDataPointer.cast(address & ~mask);
	}

	public CreateSystemPropertiesDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return CreateSystemPropertiesData.SIZEOF;
	}

	// Implementation methods

	// jobject args
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_argsOffset_", declaredType="jobject")
	public _jobjectPointer args() throws CorruptDataException {
		return _jobjectPointer.cast(getPointerAtOffset(CreateSystemPropertiesData._argsOffset_));
	}

	// jobject args
	public PointerPointer argsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._argsOffset_));
	}

	// I32 defaultCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultCountOffset_", declaredType="I32")
	public IDATA defaultCount() throws CorruptDataException {
		return new I32(getIntAtOffset(CreateSystemPropertiesData._defaultCountOffset_));
	}

	// I32 defaultCount
	public IDATAPointer defaultCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._defaultCountOffset_));
	}

	// const void** defaultValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultValuesOffset_", declaredType="const void**")
	public PointerPointer defaultValues() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(CreateSystemPropertiesData._defaultValuesOffset_));
	}

	// const void** defaultValues
	public PointerPointer defaultValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._defaultValuesOffset_));
	}

	// JNIEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="JNIEnv*")
	public JNIEnv_Pointer env() throws CorruptDataException {
		return JNIEnv_Pointer.cast(getPointerAtOffset(CreateSystemPropertiesData._envOffset_));
	}

	// JNIEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._envOffset_));
	}

	// I32 errorOccurred
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorOccurredOffset_", declaredType="I32")
	public IDATA errorOccurred() throws CorruptDataException {
		return new I32(getIntAtOffset(CreateSystemPropertiesData._errorOccurredOffset_));
	}

	// I32 errorOccurred
	public IDATAPointer errorOccurredEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._errorOccurredOffset_));
	}

	// jint nCommandLineDefines
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nCommandLineDefinesOffset_", declaredType="jint")
	public IDATA nCommandLineDefines() throws CorruptDataException {
		return new I32(getIntAtOffset(CreateSystemPropertiesData._nCommandLineDefinesOffset_));
	}

	// jint nCommandLineDefines
	public IDATAPointer nCommandLineDefinesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._nCommandLineDefinesOffset_));
	}

	// jclass stringClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringClassOffset_", declaredType="jclass")
	public _jclassPointer stringClass() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(CreateSystemPropertiesData._stringClassOffset_));
	}

	// jclass stringClass
	public PointerPointer stringClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CreateSystemPropertiesData._stringClassOffset_));
	}

}
