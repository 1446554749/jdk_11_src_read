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
 * Structure: omrthread_attrPointer
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
 * The generated code will provide getters for all elements in the omrthread_attrPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=omrthread_attr.class)
public class omrthread_attrPointer extends StructurePointer {

	// NULL
	public static final omrthread_attrPointer NULL = new omrthread_attrPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected omrthread_attrPointer(long address) {
		super(address);
	}

	public static omrthread_attrPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static omrthread_attrPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static omrthread_attrPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new omrthread_attrPointer(address);
	}

	public omrthread_attrPointer add(long count) {
		return omrthread_attrPointer.cast(address + (omrthread_attr.SIZEOF * count));
	}

	public omrthread_attrPointer add(Scalar count) {
		return add(count.longValue());
	}

	public omrthread_attrPointer addOffset(long offset) {
		return omrthread_attrPointer.cast(address + offset);
	}

	public omrthread_attrPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public omrthread_attrPointer sub(long count) {
		return omrthread_attrPointer.cast(address - (omrthread_attr.SIZEOF * count));
	}

	public omrthread_attrPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public omrthread_attrPointer subOffset(long offset) {
		return omrthread_attrPointer.cast(address - offset);
	}

	public omrthread_attrPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public omrthread_attrPointer untag(long mask) {
		return omrthread_attrPointer.cast(address & ~mask);
	}

	public omrthread_attrPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return omrthread_attr.SIZEOF;
	}

	// Implementation methods

	// U32 category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="U32")
	public UDATA category() throws CorruptDataException {
		return new U32(getIntAtOffset(omrthread_attr._categoryOffset_));
	}

	// U32 category
	public UDATAPointer categoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrthread_attr._categoryOffset_));
	}

	// omrthread_detachstate_t detachstate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_detachstateOffset_", declaredType="omrthread_detachstate_t")
	public long detachstate() throws CorruptDataException {
		if (omrthread_detachstate_t.SIZEOF == 1) {
			return getByteAtOffset(omrthread_attr._detachstateOffset_);
		} else if (omrthread_detachstate_t.SIZEOF == 2) {
			return getShortAtOffset(omrthread_attr._detachstateOffset_);
		} else if (omrthread_detachstate_t.SIZEOF == 4) {
			return getIntAtOffset(omrthread_attr._detachstateOffset_);
		} else if (omrthread_detachstate_t.SIZEOF == 8) {
			return getLongAtOffset(omrthread_attr._detachstateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// omrthread_detachstate_t detachstate
	public EnumPointer detachstateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(omrthread_attr._detachstateOffset_), omrthread_detachstate_t.class);
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(omrthread_attr._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(omrthread_attr._nameOffset_));
	}

	// omrthread_prio_t priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_priorityOffset_", declaredType="omrthread_prio_t")
	public UDATA priority() throws CorruptDataException {
		return new U64(getLongAtOffset(omrthread_attr._priorityOffset_));
	}

	// omrthread_prio_t priority
	public UDATAPointer priorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrthread_attr._priorityOffset_));
	}

	// omrthread_schedpolicy_t schedpolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_schedpolicyOffset_", declaredType="omrthread_schedpolicy_t")
	public long schedpolicy() throws CorruptDataException {
		if (omrthread_schedpolicy_t.SIZEOF == 1) {
			return getByteAtOffset(omrthread_attr._schedpolicyOffset_);
		} else if (omrthread_schedpolicy_t.SIZEOF == 2) {
			return getShortAtOffset(omrthread_attr._schedpolicyOffset_);
		} else if (omrthread_schedpolicy_t.SIZEOF == 4) {
			return getIntAtOffset(omrthread_attr._schedpolicyOffset_);
		} else if (omrthread_schedpolicy_t.SIZEOF == 8) {
			return getLongAtOffset(omrthread_attr._schedpolicyOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// omrthread_schedpolicy_t schedpolicy
	public EnumPointer schedpolicyEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(omrthread_attr._schedpolicyOffset_), omrthread_schedpolicy_t.class);
	}

	// U32 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U32")
	public UDATA size() throws CorruptDataException {
		return new U32(getIntAtOffset(omrthread_attr._sizeOffset_));
	}

	// U32 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrthread_attr._sizeOffset_));
	}

	// U64 stacksize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stacksizeOffset_", declaredType="U64")
	public UDATA stacksize() throws CorruptDataException {
		return new U64(getLongAtOffset(omrthread_attr._stacksizeOffset_));
	}

	// U64 stacksize
	public UDATAPointer stacksizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(omrthread_attr._stacksizeOffset_));
	}

}
