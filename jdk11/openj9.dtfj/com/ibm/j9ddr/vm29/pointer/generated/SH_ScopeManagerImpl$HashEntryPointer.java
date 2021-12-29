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
 * Structure: SH_ScopeManagerImpl$HashEntryPointer
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
 * The generated code will provide getters for all elements in the SH_ScopeManagerImpl$HashEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_ScopeManagerImpl$HashEntry.class)
public class SH_ScopeManagerImpl$HashEntryPointer extends StructurePointer {

	// NULL
	public static final SH_ScopeManagerImpl$HashEntryPointer NULL = new SH_ScopeManagerImpl$HashEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_ScopeManagerImpl$HashEntryPointer(long address) {
		super(address);
	}

	public static SH_ScopeManagerImpl$HashEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_ScopeManagerImpl$HashEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_ScopeManagerImpl$HashEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_ScopeManagerImpl$HashEntryPointer(address);
	}

	public SH_ScopeManagerImpl$HashEntryPointer add(long count) {
		return SH_ScopeManagerImpl$HashEntryPointer.cast(address + (SH_ScopeManagerImpl$HashEntry.SIZEOF * count));
	}

	public SH_ScopeManagerImpl$HashEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_ScopeManagerImpl$HashEntryPointer addOffset(long offset) {
		return SH_ScopeManagerImpl$HashEntryPointer.cast(address + offset);
	}

	public SH_ScopeManagerImpl$HashEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_ScopeManagerImpl$HashEntryPointer sub(long count) {
		return SH_ScopeManagerImpl$HashEntryPointer.cast(address - (SH_ScopeManagerImpl$HashEntry.SIZEOF * count));
	}

	public SH_ScopeManagerImpl$HashEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_ScopeManagerImpl$HashEntryPointer subOffset(long offset) {
		return SH_ScopeManagerImpl$HashEntryPointer.cast(address - offset);
	}

	public SH_ScopeManagerImpl$HashEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_ScopeManagerImpl$HashEntryPointer untag(long mask) {
		return SH_ScopeManagerImpl$HashEntryPointer.cast(address & ~mask);
	}

	public SH_ScopeManagerImpl$HashEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_ScopeManagerImpl$HashEntry.SIZEOF;
	}

	// Implementation methods

	// const J9UTF8* _value
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__valueOffset_", declaredType="const J9UTF8*")
	public J9UTF8Pointer _value() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(SH_ScopeManagerImpl$HashEntry.__valueOffset_));
	}

	// const J9UTF8* _value
	public PointerPointer _valueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_ScopeManagerImpl$HashEntry.__valueOffset_));
	}

}
