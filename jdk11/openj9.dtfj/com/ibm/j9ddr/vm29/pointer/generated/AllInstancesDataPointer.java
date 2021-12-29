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
 * Structure: AllInstancesDataPointer
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
 * The generated code will provide getters for all elements in the AllInstancesDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=AllInstancesData.class)
public class AllInstancesDataPointer extends StructurePointer {

	// NULL
	public static final AllInstancesDataPointer NULL = new AllInstancesDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected AllInstancesDataPointer(long address) {
		super(address);
	}

	public static AllInstancesDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static AllInstancesDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static AllInstancesDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new AllInstancesDataPointer(address);
	}

	public AllInstancesDataPointer add(long count) {
		return AllInstancesDataPointer.cast(address + (AllInstancesData.SIZEOF * count));
	}

	public AllInstancesDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public AllInstancesDataPointer addOffset(long offset) {
		return AllInstancesDataPointer.cast(address + offset);
	}

	public AllInstancesDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public AllInstancesDataPointer sub(long count) {
		return AllInstancesDataPointer.cast(address - (AllInstancesData.SIZEOF * count));
	}

	public AllInstancesDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public AllInstancesDataPointer subOffset(long offset) {
		return AllInstancesDataPointer.cast(address - offset);
	}

	public AllInstancesDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public AllInstancesDataPointer untag(long mask) {
		return AllInstancesDataPointer.cast(address & ~mask);
	}

	public AllInstancesDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return AllInstancesData.SIZEOF;
	}

	// Implementation methods

	// J9Class* clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="J9Class*")
	public J9ClassPointer clazz() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(AllInstancesData._clazzOffset_));
	}

	// J9Class* clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(AllInstancesData._clazzOffset_));
	}

	// UDATA instanceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceCountOffset_", declaredType="UDATA")
	public UDATA instanceCount() throws CorruptDataException {
		return getUDATAAtOffset(AllInstancesData._instanceCountOffset_);
	}

	// UDATA instanceCount
	public UDATAPointer instanceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(AllInstancesData._instanceCountOffset_));
	}

	// UDATA size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="UDATA")
	public UDATA size() throws CorruptDataException {
		return getUDATAAtOffset(AllInstancesData._sizeOffset_);
	}

	// UDATA size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(AllInstancesData._sizeOffset_));
	}

	// UDATA storeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_storeIndexOffset_", declaredType="UDATA")
	public UDATA storeIndex() throws CorruptDataException {
		return getUDATAAtOffset(AllInstancesData._storeIndexOffset_);
	}

	// UDATA storeIndex
	public UDATAPointer storeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(AllInstancesData._storeIndexOffset_));
	}

	// J9IndexableObject* target
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetOffset_", declaredType="J9IndexableObject*")
	public J9IndexableObjectPointer target() throws CorruptDataException {
		return J9IndexableObjectPointer.cast(getPointerAtOffset(AllInstancesData._targetOffset_));
	}

	// J9IndexableObject* target
	public PointerPointer targetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(AllInstancesData._targetOffset_));
	}

	// J9VMThread* vmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer vmThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(AllInstancesData._vmThreadOffset_));
	}

	// J9VMThread* vmThread
	public PointerPointer vmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(AllInstancesData._vmThreadOffset_));
	}

}
