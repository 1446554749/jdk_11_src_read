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
 * Structure: J9VMHookInterfacePointer
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
 * The generated code will provide getters for all elements in the J9VMHookInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMHookInterface.class)
public class J9VMHookInterfacePointer extends StructurePointer {

	// NULL
	public static final J9VMHookInterfacePointer NULL = new J9VMHookInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMHookInterfacePointer(long address) {
		super(address);
	}

	public static J9VMHookInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMHookInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMHookInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMHookInterfacePointer(address);
	}

	public J9VMHookInterfacePointer add(long count) {
		return J9VMHookInterfacePointer.cast(address + (J9VMHookInterface.SIZEOF * count));
	}

	public J9VMHookInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMHookInterfacePointer addOffset(long offset) {
		return J9VMHookInterfacePointer.cast(address + offset);
	}

	public J9VMHookInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMHookInterfacePointer sub(long count) {
		return J9VMHookInterfacePointer.cast(address - (J9VMHookInterface.SIZEOF * count));
	}

	public J9VMHookInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMHookInterfacePointer subOffset(long offset) {
		return J9VMHookInterfacePointer.cast(address - offset);
	}

	public J9VMHookInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMHookInterfacePointer untag(long mask) {
		return J9VMHookInterfacePointer.cast(address & ~mask);
	}

	public J9VMHookInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMHookInterface.SIZEOF;
	}

	// Implementation methods

	// J9CommonHookInterface common
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_commonOffset_", declaredType="J9CommonHookInterface")
	public J9CommonHookInterfacePointer common() throws CorruptDataException {
		return J9CommonHookInterfacePointer.cast(nonNullFieldEA(J9VMHookInterface._commonOffset_));
	}

	// J9CommonHookInterface common
	public PointerPointer commonEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMHookInterface._commonOffset_));
	}

	// U8[] flags
	public U8Pointer flagsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9VMHookInterface._flagsOffset_));
	}

	// J9HookRecord*[] hooks
	public PointerPointer hooksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMHookInterface._hooksOffset_));
	}

	// OMREventInfo4Dump[] infos4Dump
	public OMREventInfo4DumpPointer infos4DumpEA() throws CorruptDataException {
		return OMREventInfo4DumpPointer.cast(nonNullFieldEA(J9VMHookInterface._infos4DumpOffset_));
	}

}
