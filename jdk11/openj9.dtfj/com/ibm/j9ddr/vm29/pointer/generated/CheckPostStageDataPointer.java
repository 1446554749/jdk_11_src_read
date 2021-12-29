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
 * Structure: CheckPostStageDataPointer
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
 * The generated code will provide getters for all elements in the CheckPostStageDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=CheckPostStageData.class)
public class CheckPostStageDataPointer extends StructurePointer {

	// NULL
	public static final CheckPostStageDataPointer NULL = new CheckPostStageDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CheckPostStageDataPointer(long address) {
		super(address);
	}

	public static CheckPostStageDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CheckPostStageDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CheckPostStageDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CheckPostStageDataPointer(address);
	}

	public CheckPostStageDataPointer add(long count) {
		return CheckPostStageDataPointer.cast(address + (CheckPostStageData.SIZEOF * count));
	}

	public CheckPostStageDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public CheckPostStageDataPointer addOffset(long offset) {
		return CheckPostStageDataPointer.cast(address + offset);
	}

	public CheckPostStageDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CheckPostStageDataPointer sub(long count) {
		return CheckPostStageDataPointer.cast(address - (CheckPostStageData.SIZEOF * count));
	}

	public CheckPostStageDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CheckPostStageDataPointer subOffset(long offset) {
		return CheckPostStageDataPointer.cast(address - offset);
	}

	public CheckPostStageDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CheckPostStageDataPointer untag(long mask) {
		return CheckPostStageDataPointer.cast(address & ~mask);
	}

	public CheckPostStageDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return CheckPostStageData.SIZEOF;
	}

	// Implementation methods

	// IDATA stage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stageOffset_", declaredType="IDATA")
	public IDATA stage() throws CorruptDataException {
		return getIDATAAtOffset(CheckPostStageData._stageOffset_);
	}

	// IDATA stage
	public IDATAPointer stageEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CheckPostStageData._stageOffset_));
	}

	// jint success
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_successOffset_", declaredType="jint")
	public IDATA success() throws CorruptDataException {
		return new I32(getIntAtOffset(CheckPostStageData._successOffset_));
	}

	// jint success
	public IDATAPointer successEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(CheckPostStageData._successOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(CheckPostStageData._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(CheckPostStageData._vmOffset_));
	}

}
