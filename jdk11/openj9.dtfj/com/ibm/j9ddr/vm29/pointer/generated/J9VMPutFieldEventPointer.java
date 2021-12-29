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
 * Structure: J9VMPutFieldEventPointer
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
 * The generated code will provide getters for all elements in the J9VMPutFieldEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMPutFieldEvent.class)
public class J9VMPutFieldEventPointer extends StructurePointer {

	// NULL
	public static final J9VMPutFieldEventPointer NULL = new J9VMPutFieldEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMPutFieldEventPointer(long address) {
		super(address);
	}

	public static J9VMPutFieldEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMPutFieldEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMPutFieldEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMPutFieldEventPointer(address);
	}

	public J9VMPutFieldEventPointer add(long count) {
		return J9VMPutFieldEventPointer.cast(address + (J9VMPutFieldEvent.SIZEOF * count));
	}

	public J9VMPutFieldEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMPutFieldEventPointer addOffset(long offset) {
		return J9VMPutFieldEventPointer.cast(address + offset);
	}

	public J9VMPutFieldEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMPutFieldEventPointer sub(long count) {
		return J9VMPutFieldEventPointer.cast(address - (J9VMPutFieldEvent.SIZEOF * count));
	}

	public J9VMPutFieldEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMPutFieldEventPointer subOffset(long offset) {
		return J9VMPutFieldEventPointer.cast(address - offset);
	}

	public J9VMPutFieldEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMPutFieldEventPointer untag(long mask) {
		return J9VMPutFieldEventPointer.cast(address & ~mask);
	}

	public J9VMPutFieldEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMPutFieldEvent.SIZEOF;
	}

	// Implementation methods

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMPutFieldEvent._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._currentThreadOffset_));
	}

	// IDATA location
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_locationOffset_", declaredType="IDATA")
	public IDATA location() throws CorruptDataException {
		return getIDATAAtOffset(J9VMPutFieldEvent._locationOffset_);
	}

	// IDATA location
	public IDATAPointer locationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._locationOffset_));
	}

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9VMPutFieldEvent._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._methodOffset_));
	}

	// U64 newValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newValueOffset_", declaredType="U64")
	public UDATA newValue() throws CorruptDataException {
		return new U64(getLongAtOffset(J9VMPutFieldEvent._newValueOffset_));
	}

	// U64 newValue
	public UDATAPointer newValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._newValueOffset_));
	}

	// j9object_t object
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectOffset_", declaredType="j9object_t")
	public J9ObjectPointer object() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMPutFieldEvent._objectOffset_));
	}

	// j9object_t object
	public PointerPointer objectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._objectOffset_));
	}

	// UDATA offset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_offsetOffset_", declaredType="UDATA")
	public UDATA offset() throws CorruptDataException {
		return getUDATAAtOffset(J9VMPutFieldEvent._offsetOffset_);
	}

	// UDATA offset
	public UDATAPointer offsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMPutFieldEvent._offsetOffset_));
	}

}
