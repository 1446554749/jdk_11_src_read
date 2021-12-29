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
 * Structure: J9DynamicCodeLoadEventPointer
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
 * The generated code will provide getters for all elements in the J9DynamicCodeLoadEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9DynamicCodeLoadEvent.class)
public class J9DynamicCodeLoadEventPointer extends StructurePointer {

	// NULL
	public static final J9DynamicCodeLoadEventPointer NULL = new J9DynamicCodeLoadEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9DynamicCodeLoadEventPointer(long address) {
		super(address);
	}

	public static J9DynamicCodeLoadEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9DynamicCodeLoadEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9DynamicCodeLoadEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9DynamicCodeLoadEventPointer(address);
	}

	public J9DynamicCodeLoadEventPointer add(long count) {
		return J9DynamicCodeLoadEventPointer.cast(address + (J9DynamicCodeLoadEvent.SIZEOF * count));
	}

	public J9DynamicCodeLoadEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9DynamicCodeLoadEventPointer addOffset(long offset) {
		return J9DynamicCodeLoadEventPointer.cast(address + offset);
	}

	public J9DynamicCodeLoadEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9DynamicCodeLoadEventPointer sub(long count) {
		return J9DynamicCodeLoadEventPointer.cast(address - (J9DynamicCodeLoadEvent.SIZEOF * count));
	}

	public J9DynamicCodeLoadEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9DynamicCodeLoadEventPointer subOffset(long offset) {
		return J9DynamicCodeLoadEventPointer.cast(address - offset);
	}

	public J9DynamicCodeLoadEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9DynamicCodeLoadEventPointer untag(long mask) {
		return J9DynamicCodeLoadEventPointer.cast(address & ~mask);
	}

	public J9DynamicCodeLoadEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9DynamicCodeLoadEvent.SIZEOF;
	}

	// Implementation methods

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9DynamicCodeLoadEvent._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._currentThreadOffset_));
	}

	// UDATA length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="UDATA")
	public UDATA length() throws CorruptDataException {
		return getUDATAAtOffset(J9DynamicCodeLoadEvent._lengthOffset_);
	}

	// UDATA length
	public UDATAPointer lengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._lengthOffset_));
	}

	// void* metaData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metaDataOffset_", declaredType="void*")
	public VoidPointer metaData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9DynamicCodeLoadEvent._metaDataOffset_));
	}

	// void* metaData
	public PointerPointer metaDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._metaDataOffset_));
	}

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9DynamicCodeLoadEvent._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._methodOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9DynamicCodeLoadEvent._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._nameOffset_));
	}

	// void* startPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPCOffset_", declaredType="void*")
	public VoidPointer startPC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9DynamicCodeLoadEvent._startPCOffset_));
	}

	// void* startPC
	public PointerPointer startPCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9DynamicCodeLoadEvent._startPCOffset_));
	}

}
