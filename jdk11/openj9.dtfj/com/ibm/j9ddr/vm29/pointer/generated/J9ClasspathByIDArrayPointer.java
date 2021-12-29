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
 * Structure: J9ClasspathByIDArrayPointer
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
 * The generated code will provide getters for all elements in the J9ClasspathByIDArrayPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ClasspathByIDArray.class)
public class J9ClasspathByIDArrayPointer extends StructurePointer {

	// NULL
	public static final J9ClasspathByIDArrayPointer NULL = new J9ClasspathByIDArrayPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ClasspathByIDArrayPointer(long address) {
		super(address);
	}

	public static J9ClasspathByIDArrayPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ClasspathByIDArrayPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ClasspathByIDArrayPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ClasspathByIDArrayPointer(address);
	}

	public J9ClasspathByIDArrayPointer add(long count) {
		return J9ClasspathByIDArrayPointer.cast(address + (J9ClasspathByIDArray.SIZEOF * count));
	}

	public J9ClasspathByIDArrayPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ClasspathByIDArrayPointer addOffset(long offset) {
		return J9ClasspathByIDArrayPointer.cast(address + offset);
	}

	public J9ClasspathByIDArrayPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ClasspathByIDArrayPointer sub(long count) {
		return J9ClasspathByIDArrayPointer.cast(address - (J9ClasspathByIDArray.SIZEOF * count));
	}

	public J9ClasspathByIDArrayPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ClasspathByIDArrayPointer subOffset(long offset) {
		return J9ClasspathByIDArrayPointer.cast(address - offset);
	}

	public J9ClasspathByIDArrayPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ClasspathByIDArrayPointer untag(long mask) {
		return J9ClasspathByIDArrayPointer.cast(address & ~mask);
	}

	public J9ClasspathByIDArrayPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ClasspathByIDArray.SIZEOF;
	}

	// Implementation methods

	// void** array
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayOffset_", declaredType="void**")
	public PointerPointer array() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ClasspathByIDArray._arrayOffset_));
	}

	// void** array
	public PointerPointer arrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClasspathByIDArray._arrayOffset_));
	}

	// J9ClasspathByIDArray* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9ClasspathByIDArray*")
	public J9ClasspathByIDArrayPointer next() throws CorruptDataException {
		return J9ClasspathByIDArrayPointer.cast(getPointerAtOffset(J9ClasspathByIDArray._nextOffset_));
	}

	// J9ClasspathByIDArray* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClasspathByIDArray._nextOffset_));
	}

	// U8* partition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partitionOffset_", declaredType="U8*")
	public U8Pointer partition() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ClasspathByIDArray._partitionOffset_));
	}

	// U8* partition
	public PointerPointer partitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ClasspathByIDArray._partitionOffset_));
	}

	// UDATA partitionHash
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partitionHashOffset_", declaredType="UDATA")
	public UDATA partitionHash() throws CorruptDataException {
		return getUDATAAtOffset(J9ClasspathByIDArray._partitionHashOffset_);
	}

	// UDATA partitionHash
	public UDATAPointer partitionHashEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClasspathByIDArray._partitionHashOffset_));
	}

	// UDATA size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="UDATA")
	public UDATA size() throws CorruptDataException {
		return getUDATAAtOffset(J9ClasspathByIDArray._sizeOffset_);
	}

	// UDATA size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ClasspathByIDArray._sizeOffset_));
	}

}
