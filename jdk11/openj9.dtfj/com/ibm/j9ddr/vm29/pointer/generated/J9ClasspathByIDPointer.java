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
 * Structure: J9ClasspathByIDPointer
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
 * The generated code will provide getters for all elements in the J9ClasspathByIDPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClasspathByID.class)
public class J9ClasspathByIDPointer extends StructurePointer {

	// NULL
	public static final J9ClasspathByIDPointer NULL = new J9ClasspathByIDPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClasspathByIDPointer(long address) {
		super(address);
	}

	public static J9ClasspathByIDPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClasspathByIDPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClasspathByIDPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClasspathByIDPointer(address);
	}

	public J9ClasspathByIDPointer add(long count) {
		return J9ClasspathByIDPointer.cast(address + (J9ClasspathByID.SIZEOF * count));
	}

	public J9ClasspathByIDPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClasspathByIDPointer addOffset(long offset) {
		return J9ClasspathByIDPointer.cast(address + offset);
	}

	public J9ClasspathByIDPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClasspathByIDPointer sub(long count) {
		return J9ClasspathByIDPointer.cast(address - (J9ClasspathByID.SIZEOF * count));
	}

	public J9ClasspathByIDPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClasspathByIDPointer subOffset(long offset) {
		return J9ClasspathByIDPointer.cast(address - offset);
	}

	public J9ClasspathByIDPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClasspathByIDPointer untag(long mask) {
		return J9ClasspathByIDPointer.cast(address & ~mask);
	}

	public J9ClasspathByIDPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClasspathByID.SIZEOF;
	}

	// Implementation methods

	// UDATA entryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryCountOffset_", declaredType="UDATA")
	public UDATA entryCount() throws CorruptDataException {
		return getUDATAAtOffset(J9ClasspathByID._entryCountOffset_);
	}

	// UDATA entryCount
	public UDATAPointer entryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClasspathByID._entryCountOffset_));
	}

	// U8* failedMatches
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failedMatchesOffset_", declaredType="U8*")
	public U8Pointer failedMatches() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ClasspathByID._failedMatchesOffset_));
	}

	// U8* failedMatches
	public PointerPointer failedMatchesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClasspathByID._failedMatchesOffset_));
	}

	// J9GenericByID header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="J9GenericByID")
	public J9GenericByIDPointer header() throws CorruptDataException {
		return J9GenericByIDPointer.cast(nonNullFieldEA(J9ClasspathByID._headerOffset_));
	}

	// J9GenericByID header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClasspathByID._headerOffset_));
	}

}
