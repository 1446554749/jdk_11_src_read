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
 * Structure: MM_GCRememberedSetFragmentPointer
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
 * The generated code will provide getters for all elements in the MM_GCRememberedSetFragmentPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GCRememberedSetFragment.class)
public class MM_GCRememberedSetFragmentPointer extends StructurePointer {

	// NULL
	public static final MM_GCRememberedSetFragmentPointer NULL = new MM_GCRememberedSetFragmentPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GCRememberedSetFragmentPointer(long address) {
		super(address);
	}

	public static MM_GCRememberedSetFragmentPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GCRememberedSetFragmentPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GCRememberedSetFragmentPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GCRememberedSetFragmentPointer(address);
	}

	public MM_GCRememberedSetFragmentPointer add(long count) {
		return MM_GCRememberedSetFragmentPointer.cast(address + (MM_GCRememberedSetFragment.SIZEOF * count));
	}

	public MM_GCRememberedSetFragmentPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GCRememberedSetFragmentPointer addOffset(long offset) {
		return MM_GCRememberedSetFragmentPointer.cast(address + offset);
	}

	public MM_GCRememberedSetFragmentPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GCRememberedSetFragmentPointer sub(long count) {
		return MM_GCRememberedSetFragmentPointer.cast(address - (MM_GCRememberedSetFragment.SIZEOF * count));
	}

	public MM_GCRememberedSetFragmentPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GCRememberedSetFragmentPointer subOffset(long offset) {
		return MM_GCRememberedSetFragmentPointer.cast(address - offset);
	}

	public MM_GCRememberedSetFragmentPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GCRememberedSetFragmentPointer untag(long mask) {
		return MM_GCRememberedSetFragmentPointer.cast(address & ~mask);
	}

	public MM_GCRememberedSetFragmentPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GCRememberedSetFragment.SIZEOF;
	}

	// Implementation methods

	// void** fragmentAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fragmentAllocOffset_", declaredType="void**")
	public PointerPointer fragmentAlloc() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_GCRememberedSetFragment._fragmentAllocOffset_));
	}

	// void** fragmentAlloc
	public PointerPointer fragmentAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._fragmentAllocOffset_));
	}

	// MM_GCRememberedSet* fragmentParent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fragmentParentOffset_", declaredType="MM_GCRememberedSet*")
	public MM_GCRememberedSetPointer fragmentParent() throws CorruptDataException {
		return MM_GCRememberedSetPointer.cast(getPointerAtOffset(MM_GCRememberedSetFragment._fragmentParentOffset_));
	}

	// MM_GCRememberedSet* fragmentParent
	public PointerPointer fragmentParentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._fragmentParentOffset_));
	}

	// void* fragmentStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fragmentStorageOffset_", declaredType="void*")
	public VoidPointer fragmentStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCRememberedSetFragment._fragmentStorageOffset_));
	}

	// void* fragmentStorage
	public PointerPointer fragmentStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._fragmentStorageOffset_));
	}

	// void** fragmentTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fragmentTopOffset_", declaredType="void**")
	public PointerPointer fragmentTop() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_GCRememberedSetFragment._fragmentTopOffset_));
	}

	// void** fragmentTop
	public PointerPointer fragmentTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._fragmentTopOffset_));
	}

	// U64 localFragmentIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localFragmentIndexOffset_", declaredType="U64")
	public UDATA localFragmentIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCRememberedSetFragment._localFragmentIndexOffset_));
	}

	// U64 localFragmentIndex
	public UDATAPointer localFragmentIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._localFragmentIndexOffset_));
	}

	// U64 preservedLocalFragmentIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_preservedLocalFragmentIndexOffset_", declaredType="U64")
	public UDATA preservedLocalFragmentIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GCRememberedSetFragment._preservedLocalFragmentIndexOffset_));
	}

	// U64 preservedLocalFragmentIndex
	public UDATAPointer preservedLocalFragmentIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCRememberedSetFragment._preservedLocalFragmentIndexOffset_));
	}

}
