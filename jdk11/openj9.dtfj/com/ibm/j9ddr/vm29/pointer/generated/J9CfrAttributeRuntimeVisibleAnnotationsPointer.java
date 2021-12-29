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
 * Structure: J9CfrAttributeRuntimeVisibleAnnotationsPointer
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
 * The generated code will provide getters for all elements in the J9CfrAttributeRuntimeVisibleAnnotationsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrAttributeRuntimeVisibleAnnotations.class)
public class J9CfrAttributeRuntimeVisibleAnnotationsPointer extends StructurePointer {

	// NULL
	public static final J9CfrAttributeRuntimeVisibleAnnotationsPointer NULL = new J9CfrAttributeRuntimeVisibleAnnotationsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrAttributeRuntimeVisibleAnnotationsPointer(long address) {
		super(address);
	}

	public static J9CfrAttributeRuntimeVisibleAnnotationsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrAttributeRuntimeVisibleAnnotationsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrAttributeRuntimeVisibleAnnotationsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrAttributeRuntimeVisibleAnnotationsPointer(address);
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer add(long count) {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(address + (J9CfrAttributeRuntimeVisibleAnnotations.SIZEOF * count));
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer addOffset(long offset) {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(address + offset);
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer sub(long count) {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(address - (J9CfrAttributeRuntimeVisibleAnnotations.SIZEOF * count));
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer subOffset(long offset) {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(address - offset);
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer untag(long mask) {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(address & ~mask);
	}

	public J9CfrAttributeRuntimeVisibleAnnotationsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrAttributeRuntimeVisibleAnnotations.SIZEOF;
	}

	// Implementation methods

	// J9CfrAnnotation* annotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_annotationsOffset_", declaredType="J9CfrAnnotation*")
	public J9CfrAnnotationPointer annotations() throws CorruptDataException {
		return J9CfrAnnotationPointer.cast(getPointerAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._annotationsOffset_));
	}

	// J9CfrAnnotation* annotations
	public PointerPointer annotationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._annotationsOffset_));
	}

	// U32 length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="U32")
	public UDATA length() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._lengthOffset_));
	}

	// U32 length
	public UDATAPointer lengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._lengthOffset_));
	}

	// U16 nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameIndexOffset_", declaredType="U16")
	public U16 nameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._nameIndexOffset_));
	}

	// U16 nameIndex
	public U16Pointer nameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._nameIndexOffset_));
	}

	// U16 numberOfAnnotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfAnnotationsOffset_", declaredType="U16")
	public U16 numberOfAnnotations() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._numberOfAnnotationsOffset_));
	}

	// U16 numberOfAnnotations
	public U16Pointer numberOfAnnotationsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._numberOfAnnotationsOffset_));
	}

	// U8* rawAttributeData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rawAttributeDataOffset_", declaredType="U8*")
	public U8Pointer rawAttributeData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._rawAttributeDataOffset_));
	}

	// U8* rawAttributeData
	public PointerPointer rawAttributeDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._rawAttributeDataOffset_));
	}

	// U32 rawDataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rawDataLengthOffset_", declaredType="U32")
	public UDATA rawDataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._rawDataLengthOffset_));
	}

	// U32 rawDataLength
	public UDATAPointer rawDataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._rawDataLengthOffset_));
	}

	// UDATA romAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romAddressOffset_", declaredType="UDATA")
	public UDATA romAddress() throws CorruptDataException {
		return getUDATAAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._romAddressOffset_);
	}

	// UDATA romAddress
	public UDATAPointer romAddressEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._romAddressOffset_));
	}

	// U8 tag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagOffset_", declaredType="U8")
	public U8 tag() throws CorruptDataException {
		return new U8(getByteAtOffset(J9CfrAttributeRuntimeVisibleAnnotations._tagOffset_));
	}

	// U8 tag
	public U8Pointer tagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9CfrAttributeRuntimeVisibleAnnotations._tagOffset_));
	}

}
