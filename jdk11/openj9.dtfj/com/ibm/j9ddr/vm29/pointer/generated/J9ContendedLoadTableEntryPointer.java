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
 * Structure: J9ContendedLoadTableEntryPointer
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
 * The generated code will provide getters for all elements in the J9ContendedLoadTableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ContendedLoadTableEntry.class)
public class J9ContendedLoadTableEntryPointer extends StructurePointer {

	// NULL
	public static final J9ContendedLoadTableEntryPointer NULL = new J9ContendedLoadTableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ContendedLoadTableEntryPointer(long address) {
		super(address);
	}

	public static J9ContendedLoadTableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ContendedLoadTableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ContendedLoadTableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ContendedLoadTableEntryPointer(address);
	}

	public J9ContendedLoadTableEntryPointer add(long count) {
		return J9ContendedLoadTableEntryPointer.cast(address + (J9ContendedLoadTableEntry.SIZEOF * count));
	}

	public J9ContendedLoadTableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ContendedLoadTableEntryPointer addOffset(long offset) {
		return J9ContendedLoadTableEntryPointer.cast(address + offset);
	}

	public J9ContendedLoadTableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ContendedLoadTableEntryPointer sub(long count) {
		return J9ContendedLoadTableEntryPointer.cast(address - (J9ContendedLoadTableEntry.SIZEOF * count));
	}

	public J9ContendedLoadTableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ContendedLoadTableEntryPointer subOffset(long offset) {
		return J9ContendedLoadTableEntryPointer.cast(address - offset);
	}

	public J9ContendedLoadTableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ContendedLoadTableEntryPointer untag(long mask) {
		return J9ContendedLoadTableEntryPointer.cast(address & ~mask);
	}

	public J9ContendedLoadTableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ContendedLoadTableEntry.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ContendedLoadTableEntry._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._classLoaderOffset_));
	}

	// U8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="U8*")
	public U8Pointer className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ContendedLoadTableEntry._classNameOffset_));
	}

	// U8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._classNameOffset_));
	}

	// UDATA classNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameLengthOffset_", declaredType="UDATA")
	public UDATA classNameLength() throws CorruptDataException {
		return getUDATAAtOffset(J9ContendedLoadTableEntry._classNameLengthOffset_);
	}

	// UDATA classNameLength
	public UDATAPointer classNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._classNameLengthOffset_));
	}

	// IDATA count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countOffset_", declaredType="IDATA")
	public IDATA count() throws CorruptDataException {
		return getIDATAAtOffset(J9ContendedLoadTableEntry._countOffset_);
	}

	// IDATA count
	public IDATAPointer countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._countOffset_));
	}

	// UDATA hashValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hashValueOffset_", declaredType="UDATA")
	public UDATA hashValue() throws CorruptDataException {
		return getUDATAAtOffset(J9ContendedLoadTableEntry._hashValueOffset_);
	}

	// UDATA hashValue
	public UDATAPointer hashValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._hashValueOffset_));
	}

	// UDATA status
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_statusOffset_", declaredType="UDATA")
	public UDATA status() throws CorruptDataException {
		return getUDATAAtOffset(J9ContendedLoadTableEntry._statusOffset_);
	}

	// UDATA status
	public UDATAPointer statusEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._statusOffset_));
	}

	// J9VMThread* thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer thread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9ContendedLoadTableEntry._threadOffset_));
	}

	// J9VMThread* thread
	public PointerPointer threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ContendedLoadTableEntry._threadOffset_));
	}

}
