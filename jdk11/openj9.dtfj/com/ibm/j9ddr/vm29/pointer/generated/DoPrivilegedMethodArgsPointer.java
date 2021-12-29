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
 * Structure: DoPrivilegedMethodArgsPointer
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
 * The generated code will provide getters for all elements in the DoPrivilegedMethodArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=DoPrivilegedMethodArgs.class)
public class DoPrivilegedMethodArgsPointer extends StructurePointer {

	// NULL
	public static final DoPrivilegedMethodArgsPointer NULL = new DoPrivilegedMethodArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected DoPrivilegedMethodArgsPointer(long address) {
		super(address);
	}

	public static DoPrivilegedMethodArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static DoPrivilegedMethodArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static DoPrivilegedMethodArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new DoPrivilegedMethodArgsPointer(address);
	}

	public DoPrivilegedMethodArgsPointer add(long count) {
		return DoPrivilegedMethodArgsPointer.cast(address + (DoPrivilegedMethodArgs.SIZEOF * count));
	}

	public DoPrivilegedMethodArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public DoPrivilegedMethodArgsPointer addOffset(long offset) {
		return DoPrivilegedMethodArgsPointer.cast(address + offset);
	}

	public DoPrivilegedMethodArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public DoPrivilegedMethodArgsPointer sub(long count) {
		return DoPrivilegedMethodArgsPointer.cast(address - (DoPrivilegedMethodArgs.SIZEOF * count));
	}

	public DoPrivilegedMethodArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public DoPrivilegedMethodArgsPointer subOffset(long offset) {
		return DoPrivilegedMethodArgsPointer.cast(address - offset);
	}

	public DoPrivilegedMethodArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public DoPrivilegedMethodArgsPointer untag(long mask) {
		return DoPrivilegedMethodArgsPointer.cast(address & ~mask);
	}

	public DoPrivilegedMethodArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return DoPrivilegedMethodArgs.SIZEOF;
	}

	// Implementation methods

	// j9object_t accControlContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_accControlContextOffset_", declaredType="j9object_t")
	public J9ObjectPointer accControlContext() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(DoPrivilegedMethodArgs._accControlContextOffset_));
	}

	// j9object_t accControlContext
	public PointerPointer accControlContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DoPrivilegedMethodArgs._accControlContextOffset_));
	}

	// UDATA frameCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_frameCounterOffset_", declaredType="UDATA")
	public UDATA frameCounter() throws CorruptDataException {
		return getUDATAAtOffset(DoPrivilegedMethodArgs._frameCounterOffset_);
	}

	// UDATA frameCounter
	public UDATAPointer frameCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DoPrivilegedMethodArgs._frameCounterOffset_));
	}

	// DoPrivilegedMethodArgs* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="DoPrivilegedMethodArgs*")
	public DoPrivilegedMethodArgsPointer next() throws CorruptDataException {
		return DoPrivilegedMethodArgsPointer.cast(getPointerAtOffset(DoPrivilegedMethodArgs._nextOffset_));
	}

	// DoPrivilegedMethodArgs* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DoPrivilegedMethodArgs._nextOffset_));
	}

	// j9object_t permissions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permissionsOffset_", declaredType="j9object_t")
	public J9ObjectPointer permissions() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(DoPrivilegedMethodArgs._permissionsOffset_));
	}

	// j9object_t permissions
	public PointerPointer permissionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DoPrivilegedMethodArgs._permissionsOffset_));
	}

}
