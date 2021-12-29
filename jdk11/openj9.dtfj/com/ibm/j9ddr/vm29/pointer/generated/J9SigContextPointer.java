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
 * Structure: J9SigContextPointer
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
 * The generated code will provide getters for all elements in the J9SigContextPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SigContext.class)
public class J9SigContextPointer extends StructurePointer {

	// NULL
	public static final J9SigContextPointer NULL = new J9SigContextPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SigContextPointer(long address) {
		super(address);
	}

	public static J9SigContextPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SigContextPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SigContextPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SigContextPointer(address);
	}

	public J9SigContextPointer add(long count) {
		return J9SigContextPointer.cast(address + (J9SigContext.SIZEOF * count));
	}

	public J9SigContextPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SigContextPointer addOffset(long offset) {
		return J9SigContextPointer.cast(address + offset);
	}

	public J9SigContextPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SigContextPointer sub(long count) {
		return J9SigContextPointer.cast(address - (J9SigContext.SIZEOF * count));
	}

	public J9SigContextPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SigContextPointer subOffset(long offset) {
		return J9SigContextPointer.cast(address - offset);
	}

	public J9SigContextPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SigContextPointer untag(long mask) {
		return J9SigContextPointer.cast(address & ~mask);
	}

	public J9SigContextPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SigContext.SIZEOF;
	}

	// Implementation methods

	// J9VMThread* onThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer onThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9SigContext._onThreadOffset_));
	}

	// J9VMThread* onThread
	public PointerPointer onThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SigContext._onThreadOffset_));
	}

	// void* sigInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigInfoOffset_", declaredType="void*")
	public VoidPointer sigInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SigContext._sigInfoOffset_));
	}

	// void* sigInfo
	public PointerPointer sigInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SigContext._sigInfoOffset_));
	}

	// IDATA sigNum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigNumOffset_", declaredType="IDATA")
	public IDATA sigNum() throws CorruptDataException {
		return getIDATAAtOffset(J9SigContext._sigNumOffset_);
	}

	// IDATA sigNum
	public IDATAPointer sigNumEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9SigContext._sigNumOffset_));
	}

	// void* uContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uContextOffset_", declaredType="void*")
	public VoidPointer uContext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SigContext._uContextOffset_));
	}

	// void* uContext
	public PointerPointer uContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SigContext._uContextOffset_));
	}

}
