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
 * Structure: OMRMemCategoryWalkStatePointer
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
 * The generated code will provide getters for all elements in the OMRMemCategoryWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRMemCategoryWalkState.class)
public class OMRMemCategoryWalkStatePointer extends StructurePointer {

	// NULL
	public static final OMRMemCategoryWalkStatePointer NULL = new OMRMemCategoryWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRMemCategoryWalkStatePointer(long address) {
		super(address);
	}

	public static OMRMemCategoryWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRMemCategoryWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRMemCategoryWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRMemCategoryWalkStatePointer(address);
	}

	public OMRMemCategoryWalkStatePointer add(long count) {
		return OMRMemCategoryWalkStatePointer.cast(address + (OMRMemCategoryWalkState.SIZEOF * count));
	}

	public OMRMemCategoryWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRMemCategoryWalkStatePointer addOffset(long offset) {
		return OMRMemCategoryWalkStatePointer.cast(address + offset);
	}

	public OMRMemCategoryWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRMemCategoryWalkStatePointer sub(long count) {
		return OMRMemCategoryWalkStatePointer.cast(address - (OMRMemCategoryWalkState.SIZEOF * count));
	}

	public OMRMemCategoryWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRMemCategoryWalkStatePointer subOffset(long offset) {
		return OMRMemCategoryWalkStatePointer.cast(address - offset);
	}

	public OMRMemCategoryWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRMemCategoryWalkStatePointer untag(long mask) {
		return OMRMemCategoryWalkStatePointer.cast(address & ~mask);
	}

	public OMRMemCategoryWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRMemCategoryWalkState.SIZEOF;
	}

	// Implementation methods

	// void* userData1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData1Offset_", declaredType="void*")
	public VoidPointer userData1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRMemCategoryWalkState._userData1Offset_));
	}

	// void* userData1
	public PointerPointer userData1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRMemCategoryWalkState._userData1Offset_));
	}

	// void* userData2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userData2Offset_", declaredType="void*")
	public VoidPointer userData2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRMemCategoryWalkState._userData2Offset_));
	}

	// void* userData2
	public PointerPointer userData2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRMemCategoryWalkState._userData2Offset_));
	}

	// void* walkFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkFunctionOffset_", declaredType="void*")
	public VoidPointer walkFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRMemCategoryWalkState._walkFunctionOffset_));
	}

	// void* walkFunction
	public PointerPointer walkFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRMemCategoryWalkState._walkFunctionOffset_));
	}

}
