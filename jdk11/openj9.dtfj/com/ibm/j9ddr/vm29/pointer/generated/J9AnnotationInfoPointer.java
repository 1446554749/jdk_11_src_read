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
 * Structure: J9AnnotationInfoPointer
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
 * The generated code will provide getters for all elements in the J9AnnotationInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9AnnotationInfo.class)
public class J9AnnotationInfoPointer extends StructurePointer {

	// NULL
	public static final J9AnnotationInfoPointer NULL = new J9AnnotationInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9AnnotationInfoPointer(long address) {
		super(address);
	}

	public static J9AnnotationInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9AnnotationInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9AnnotationInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9AnnotationInfoPointer(address);
	}

	public J9AnnotationInfoPointer add(long count) {
		return J9AnnotationInfoPointer.cast(address + (J9AnnotationInfo.SIZEOF * count));
	}

	public J9AnnotationInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9AnnotationInfoPointer addOffset(long offset) {
		return J9AnnotationInfoPointer.cast(address + offset);
	}

	public J9AnnotationInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9AnnotationInfoPointer sub(long count) {
		return J9AnnotationInfoPointer.cast(address - (J9AnnotationInfo.SIZEOF * count));
	}

	public J9AnnotationInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9AnnotationInfoPointer subOffset(long offset) {
		return J9AnnotationInfoPointer.cast(address - offset);
	}

	public J9AnnotationInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9AnnotationInfoPointer untag(long mask) {
		return J9AnnotationInfoPointer.cast(address & ~mask);
	}

	public J9AnnotationInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9AnnotationInfo.SIZEOF;
	}

	// Implementation methods

	// U32 countAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countAnnotationOffset_", declaredType="U32")
	public UDATA countAnnotation() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AnnotationInfo._countAnnotationOffset_));
	}

	// U32 countAnnotation
	public UDATAPointer countAnnotationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AnnotationInfo._countAnnotationOffset_));
	}

	// U32 countClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countClassOffset_", declaredType="U32")
	public UDATA countClass() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AnnotationInfo._countClassOffset_));
	}

	// U32 countClass
	public UDATAPointer countClassEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AnnotationInfo._countClassOffset_));
	}

	// U32 countField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countFieldOffset_", declaredType="U32")
	public UDATA countField() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AnnotationInfo._countFieldOffset_));
	}

	// U32 countField
	public UDATAPointer countFieldEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AnnotationInfo._countFieldOffset_));
	}

	// U32 countMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countMethodOffset_", declaredType="U32")
	public UDATA countMethod() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AnnotationInfo._countMethodOffset_));
	}

	// U32 countMethod
	public UDATAPointer countMethodEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AnnotationInfo._countMethodOffset_));
	}

	// U32 countParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countParameterOffset_", declaredType="U32")
	public UDATA countParameter() throws CorruptDataException {
		return new U32(getIntAtOffset(J9AnnotationInfo._countParameterOffset_));
	}

	// U32 countParameter
	public UDATAPointer countParameterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9AnnotationInfo._countParameterOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) defaultValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_defaultValuesOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer defaultValues() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._defaultValuesOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._defaultValuesOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) defaultValues
	public SelfRelativePointer defaultValuesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._defaultValuesOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) firstAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstAnnotationOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer firstAnnotation() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._firstAnnotationOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._firstAnnotationOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) firstAnnotation
	public SelfRelativePointer firstAnnotationEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._firstAnnotationOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) firstClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstClassOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer firstClass() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._firstClassOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._firstClassOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) firstClass
	public SelfRelativePointer firstClassEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._firstClassOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) firstField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstFieldOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer firstField() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._firstFieldOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._firstFieldOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) firstField
	public SelfRelativePointer firstFieldEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._firstFieldOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) firstMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstMethodOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer firstMethod() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._firstMethodOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._firstMethodOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) firstMethod
	public SelfRelativePointer firstMethodEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._firstMethodOffset_));
	}

	// J9SRP(J9AnnotationInfoEntry) firstParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstParameterOffset_", declaredType="J9SRP(J9AnnotationInfoEntry)")
	public J9AnnotationInfoEntryPointer firstParameter() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9AnnotationInfo._firstParameterOffset_);
		if (nextAddress == 0) {
			return J9AnnotationInfoEntryPointer.NULL;
		}
		return J9AnnotationInfoEntryPointer.cast(address + (J9AnnotationInfo._firstParameterOffset_ + nextAddress));
	}

	// J9SRP(J9AnnotationInfoEntry) firstParameter
	public SelfRelativePointer firstParameterEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9AnnotationInfo._firstParameterOffset_));
	}

}
