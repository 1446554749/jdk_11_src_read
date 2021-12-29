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
 * Structure: J9VMGetEnvEventPointer
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
 * The generated code will provide getters for all elements in the J9VMGetEnvEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMGetEnvEvent.class)
public class J9VMGetEnvEventPointer extends StructurePointer {

	// NULL
	public static final J9VMGetEnvEventPointer NULL = new J9VMGetEnvEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMGetEnvEventPointer(long address) {
		super(address);
	}

	public static J9VMGetEnvEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMGetEnvEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMGetEnvEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMGetEnvEventPointer(address);
	}

	public J9VMGetEnvEventPointer add(long count) {
		return J9VMGetEnvEventPointer.cast(address + (J9VMGetEnvEvent.SIZEOF * count));
	}

	public J9VMGetEnvEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMGetEnvEventPointer addOffset(long offset) {
		return J9VMGetEnvEventPointer.cast(address + offset);
	}

	public J9VMGetEnvEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMGetEnvEventPointer sub(long count) {
		return J9VMGetEnvEventPointer.cast(address - (J9VMGetEnvEvent.SIZEOF * count));
	}

	public J9VMGetEnvEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMGetEnvEventPointer subOffset(long offset) {
		return J9VMGetEnvEventPointer.cast(address - offset);
	}

	public J9VMGetEnvEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMGetEnvEventPointer untag(long mask) {
		return J9VMGetEnvEventPointer.cast(address & ~mask);
	}

	public J9VMGetEnvEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMGetEnvEvent.SIZEOF;
	}

	// Implementation methods

	// JavaVM* jvm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmOffset_", declaredType="JavaVM*")
	public JavaVM_Pointer jvm() throws CorruptDataException {
		return JavaVM_Pointer.cast(getPointerAtOffset(J9VMGetEnvEvent._jvmOffset_));
	}

	// JavaVM* jvm
	public PointerPointer jvmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMGetEnvEvent._jvmOffset_));
	}

	// void** penv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_penvOffset_", declaredType="void**")
	public PointerPointer penv() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9VMGetEnvEvent._penvOffset_));
	}

	// void** penv
	public PointerPointer penvEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMGetEnvEvent._penvOffset_));
	}

	// jint rc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rcOffset_", declaredType="jint")
	public IDATA rc() throws CorruptDataException {
		return new I32(getIntAtOffset(J9VMGetEnvEvent._rcOffset_));
	}

	// jint rc
	public IDATAPointer rcEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMGetEnvEvent._rcOffset_));
	}

	// jint version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="jint")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(J9VMGetEnvEvent._versionOffset_));
	}

	// jint version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMGetEnvEvent._versionOffset_));
	}

}
