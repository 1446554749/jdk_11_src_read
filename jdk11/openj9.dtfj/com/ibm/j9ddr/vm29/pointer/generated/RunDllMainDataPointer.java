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
 * Structure: RunDllMainDataPointer
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
 * The generated code will provide getters for all elements in the RunDllMainDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RunDllMainData.class)
public class RunDllMainDataPointer extends StructurePointer {

	// NULL
	public static final RunDllMainDataPointer NULL = new RunDllMainDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RunDllMainDataPointer(long address) {
		super(address);
	}

	public static RunDllMainDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RunDllMainDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RunDllMainDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RunDllMainDataPointer(address);
	}

	public RunDllMainDataPointer add(long count) {
		return RunDllMainDataPointer.cast(address + (RunDllMainData.SIZEOF * count));
	}

	public RunDllMainDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public RunDllMainDataPointer addOffset(long offset) {
		return RunDllMainDataPointer.cast(address + offset);
	}

	public RunDllMainDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RunDllMainDataPointer sub(long count) {
		return RunDllMainDataPointer.cast(address - (RunDllMainData.SIZEOF * count));
	}

	public RunDllMainDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RunDllMainDataPointer subOffset(long offset) {
		return RunDllMainDataPointer.cast(address - offset);
	}

	public RunDllMainDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RunDllMainDataPointer untag(long mask) {
		return RunDllMainDataPointer.cast(address & ~mask);
	}

	public RunDllMainDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RunDllMainData.SIZEOF;
	}

	// Implementation methods

	// UDATA filterFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filterFlagsOffset_", declaredType="UDATA")
	public UDATA filterFlags() throws CorruptDataException {
		return getUDATAAtOffset(RunDllMainData._filterFlagsOffset_);
	}

	// UDATA filterFlags
	public UDATAPointer filterFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RunDllMainData._filterFlagsOffset_));
	}

	// void* reserved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedOffset_", declaredType="void*")
	public VoidPointer reserved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RunDllMainData._reservedOffset_));
	}

	// void* reserved
	public PointerPointer reservedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RunDllMainData._reservedOffset_));
	}

	// IDATA stage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stageOffset_", declaredType="IDATA")
	public IDATA stage() throws CorruptDataException {
		return getIDATAAtOffset(RunDllMainData._stageOffset_);
	}

	// IDATA stage
	public IDATAPointer stageEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RunDllMainData._stageOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(RunDllMainData._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RunDllMainData._vmOffset_));
	}

}
