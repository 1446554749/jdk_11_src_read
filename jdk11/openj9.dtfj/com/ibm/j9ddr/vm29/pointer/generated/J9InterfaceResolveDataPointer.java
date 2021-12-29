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
 * Structure: J9InterfaceResolveDataPointer
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
 * The generated code will provide getters for all elements in the J9InterfaceResolveDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9InterfaceResolveData.class)
public class J9InterfaceResolveDataPointer extends StructurePointer {

	// NULL
	public static final J9InterfaceResolveDataPointer NULL = new J9InterfaceResolveDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9InterfaceResolveDataPointer(long address) {
		super(address);
	}

	public static J9InterfaceResolveDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9InterfaceResolveDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9InterfaceResolveDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9InterfaceResolveDataPointer(address);
	}

	public J9InterfaceResolveDataPointer add(long count) {
		return J9InterfaceResolveDataPointer.cast(address + (J9InterfaceResolveData.SIZEOF * count));
	}

	public J9InterfaceResolveDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9InterfaceResolveDataPointer addOffset(long offset) {
		return J9InterfaceResolveDataPointer.cast(address + offset);
	}

	public J9InterfaceResolveDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9InterfaceResolveDataPointer sub(long count) {
		return J9InterfaceResolveDataPointer.cast(address - (J9InterfaceResolveData.SIZEOF * count));
	}

	public J9InterfaceResolveDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9InterfaceResolveDataPointer subOffset(long offset) {
		return J9InterfaceResolveDataPointer.cast(address - offset);
	}

	public J9InterfaceResolveDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9InterfaceResolveDataPointer untag(long mask) {
		return J9InterfaceResolveDataPointer.cast(address & ~mask);
	}

	public J9InterfaceResolveDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9InterfaceResolveData.SIZEOF;
	}

	// Implementation methods

	// UDATA elements
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_elementsOffset_", declaredType="UDATA")
	public UDATA elements() throws CorruptDataException {
		return getUDATAAtOffset(J9InterfaceResolveData._elementsOffset_);
	}

	// UDATA elements
	public UDATAPointer elementsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9InterfaceResolveData._elementsOffset_));
	}

	// IDATA errorType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_errorTypeOffset_", declaredType="IDATA")
	public IDATA errorType() throws CorruptDataException {
		return getIDATAAtOffset(J9InterfaceResolveData._errorTypeOffset_);
	}

	// IDATA errorType
	public IDATAPointer errorTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9InterfaceResolveData._errorTypeOffset_));
	}

	// UDATA exception
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionOffset_", declaredType="UDATA")
	public UDATA exception() throws CorruptDataException {
		return getUDATAAtOffset(J9InterfaceResolveData._exceptionOffset_);
	}

	// UDATA exception
	public UDATAPointer exceptionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9InterfaceResolveData._exceptionOffset_));
	}

	// J9Class* exceptionClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionClassOffset_", declaredType="J9Class*")
	public J9ClassPointer exceptionClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9InterfaceResolveData._exceptionClassOffset_));
	}

	// J9Class* exceptionClass
	public PointerPointer exceptionClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InterfaceResolveData._exceptionClassOffset_));
	}

	// void** methods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodsOffset_", declaredType="void**")
	public PointerPointer methods() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9InterfaceResolveData._methodsOffset_));
	}

	// void** methods
	public PointerPointer methodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InterfaceResolveData._methodsOffset_));
	}

}
