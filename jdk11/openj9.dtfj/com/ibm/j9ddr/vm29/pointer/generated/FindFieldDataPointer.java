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
 * Structure: FindFieldDataPointer
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
 * The generated code will provide getters for all elements in the FindFieldDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=FindFieldData.class)
public class FindFieldDataPointer extends StructurePointer {

	// NULL
	public static final FindFieldDataPointer NULL = new FindFieldDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected FindFieldDataPointer(long address) {
		super(address);
	}

	public static FindFieldDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static FindFieldDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static FindFieldDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new FindFieldDataPointer(address);
	}

	public FindFieldDataPointer add(long count) {
		return FindFieldDataPointer.cast(address + (FindFieldData.SIZEOF * count));
	}

	public FindFieldDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public FindFieldDataPointer addOffset(long offset) {
		return FindFieldDataPointer.cast(address + offset);
	}

	public FindFieldDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public FindFieldDataPointer sub(long count) {
		return FindFieldDataPointer.cast(address - (FindFieldData.SIZEOF * count));
	}

	public FindFieldDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public FindFieldDataPointer subOffset(long offset) {
		return FindFieldDataPointer.cast(address - offset);
	}

	public FindFieldDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public FindFieldDataPointer untag(long mask) {
		return FindFieldDataPointer.cast(address & ~mask);
	}

	public FindFieldDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return FindFieldData.SIZEOF;
	}

	// Implementation methods

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(FindFieldData._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FindFieldData._currentThreadOffset_));
	}

	// J9Class* declaringClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_declaringClassOffset_", declaredType="J9Class*")
	public J9ClassPointer declaringClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(FindFieldData._declaringClassOffset_));
	}

	// J9Class* declaringClass
	public PointerPointer declaringClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FindFieldData._declaringClassOffset_));
	}

	// j9object_t fieldNameObj
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldNameObjOffset_", declaredType="j9object_t")
	public J9ObjectPointer fieldNameObj() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(FindFieldData._fieldNameObjOffset_));
	}

	// j9object_t fieldNameObj
	public PointerPointer fieldNameObjEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FindFieldData._fieldNameObjOffset_));
	}

	// J9ROMFieldShape* foundField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_foundFieldOffset_", declaredType="J9ROMFieldShape*")
	public J9ROMFieldShapePointer foundField() throws CorruptDataException {
		return J9ROMFieldShapePointer.cast(getPointerAtOffset(FindFieldData._foundFieldOffset_));
	}

	// J9ROMFieldShape* foundField
	public PointerPointer foundFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(FindFieldData._foundFieldOffset_));
	}

}
