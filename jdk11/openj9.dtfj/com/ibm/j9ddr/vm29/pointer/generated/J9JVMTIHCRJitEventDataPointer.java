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
 * Structure: J9JVMTIHCRJitEventDataPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIHCRJitEventDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIHCRJitEventData.class)
public class J9JVMTIHCRJitEventDataPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIHCRJitEventDataPointer NULL = new J9JVMTIHCRJitEventDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIHCRJitEventDataPointer(long address) {
		super(address);
	}

	public static J9JVMTIHCRJitEventDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIHCRJitEventDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIHCRJitEventDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIHCRJitEventDataPointer(address);
	}

	public J9JVMTIHCRJitEventDataPointer add(long count) {
		return J9JVMTIHCRJitEventDataPointer.cast(address + (J9JVMTIHCRJitEventData.SIZEOF * count));
	}

	public J9JVMTIHCRJitEventDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIHCRJitEventDataPointer addOffset(long offset) {
		return J9JVMTIHCRJitEventDataPointer.cast(address + offset);
	}

	public J9JVMTIHCRJitEventDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIHCRJitEventDataPointer sub(long count) {
		return J9JVMTIHCRJitEventDataPointer.cast(address - (J9JVMTIHCRJitEventData.SIZEOF * count));
	}

	public J9JVMTIHCRJitEventDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIHCRJitEventDataPointer subOffset(long offset) {
		return J9JVMTIHCRJitEventDataPointer.cast(address - offset);
	}

	public J9JVMTIHCRJitEventDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIHCRJitEventDataPointer untag(long mask) {
		return J9JVMTIHCRJitEventDataPointer.cast(address & ~mask);
	}

	public J9JVMTIHCRJitEventDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIHCRJitEventData.SIZEOF;
	}

	// Implementation methods

	// UDATA classCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classCountOffset_", declaredType="UDATA")
	public UDATA classCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIHCRJitEventData._classCountOffset_);
	}

	// UDATA classCount
	public UDATAPointer classCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIHCRJitEventData._classCountOffset_));
	}

	// UDATA* data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataOffset_", declaredType="UDATA*")
	public UDATAPointer data() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JVMTIHCRJitEventData._dataOffset_));
	}

	// UDATA* data
	public PointerPointer dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHCRJitEventData._dataOffset_));
	}

	// UDATA* dataCursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataCursorOffset_", declaredType="UDATA*")
	public UDATAPointer dataCursor() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JVMTIHCRJitEventData._dataCursorOffset_));
	}

	// UDATA* dataCursor
	public PointerPointer dataCursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHCRJitEventData._dataCursorOffset_));
	}

	// UDATA initialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializedOffset_", declaredType="UDATA")
	public UDATA initialized() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIHCRJitEventData._initializedOffset_);
	}

	// UDATA initialized
	public UDATAPointer initializedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIHCRJitEventData._initializedOffset_));
	}

}
