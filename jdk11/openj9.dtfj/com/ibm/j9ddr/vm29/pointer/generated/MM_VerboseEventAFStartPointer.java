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
 * Structure: MM_VerboseEventAFStartPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventAFStartPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventAFStart.class)
public class MM_VerboseEventAFStartPointer extends MM_VerboseEventGCStartPointer {

	// NULL
	public static final MM_VerboseEventAFStartPointer NULL = new MM_VerboseEventAFStartPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventAFStartPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventAFStartPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventAFStartPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventAFStartPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventAFStartPointer(address);
	}

	public MM_VerboseEventAFStartPointer add(long count) {
		return MM_VerboseEventAFStartPointer.cast(address + (MM_VerboseEventAFStart.SIZEOF * count));
	}

	public MM_VerboseEventAFStartPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventAFStartPointer addOffset(long offset) {
		return MM_VerboseEventAFStartPointer.cast(address + offset);
	}

	public MM_VerboseEventAFStartPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventAFStartPointer sub(long count) {
		return MM_VerboseEventAFStartPointer.cast(address - (MM_VerboseEventAFStart.SIZEOF * count));
	}

	public MM_VerboseEventAFStartPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventAFStartPointer subOffset(long offset) {
		return MM_VerboseEventAFStartPointer.cast(address - offset);
	}

	public MM_VerboseEventAFStartPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventAFStartPointer untag(long mask) {
		return MM_VerboseEventAFStartPointer.cast(address & ~mask);
	}

	public MM_VerboseEventAFStartPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventAFStart.SIZEOF;
	}

	// Implementation methods

	// UDATA _AFCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__AFCountOffset_", declaredType="UDATA")
	public UDATA _AFCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventAFStart.__AFCountOffset_);
	}

	// UDATA _AFCount
	public UDATAPointer _AFCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventAFStart.__AFCountOffset_));
	}

	// U64 _lastAFTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastAFTimeOffset_", declaredType="U64")
	public UDATA _lastAFTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventAFStart.__lastAFTimeOffset_));
	}

	// U64 _lastAFTime
	public UDATAPointer _lastAFTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventAFStart.__lastAFTimeOffset_));
	}

	// UDATA _requestedBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__requestedBytesOffset_", declaredType="UDATA")
	public UDATA _requestedBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventAFStart.__requestedBytesOffset_);
	}

	// UDATA _requestedBytes
	public UDATAPointer _requestedBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventAFStart.__requestedBytesOffset_));
	}

	// UDATA _subSpaceType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subSpaceTypeOffset_", declaredType="UDATA")
	public UDATA _subSpaceType() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventAFStart.__subSpaceTypeOffset_);
	}

	// UDATA _subSpaceType
	public UDATAPointer _subSpaceTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventAFStart.__subSpaceTypeOffset_));
	}

}
