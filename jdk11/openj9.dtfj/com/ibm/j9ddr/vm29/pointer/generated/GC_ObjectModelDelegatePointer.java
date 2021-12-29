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
 * Structure: GC_ObjectModelDelegatePointer
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
 * The generated code will provide getters for all elements in the GC_ObjectModelDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectModelDelegate.class)
public class GC_ObjectModelDelegatePointer extends StructurePointer {

	// NULL
	public static final GC_ObjectModelDelegatePointer NULL = new GC_ObjectModelDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectModelDelegatePointer(long address) {
		super(address);
	}

	public static GC_ObjectModelDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectModelDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectModelDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectModelDelegatePointer(address);
	}

	public GC_ObjectModelDelegatePointer add(long count) {
		return GC_ObjectModelDelegatePointer.cast(address + (GC_ObjectModelDelegate.SIZEOF * count));
	}

	public GC_ObjectModelDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectModelDelegatePointer addOffset(long offset) {
		return GC_ObjectModelDelegatePointer.cast(address + offset);
	}

	public GC_ObjectModelDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectModelDelegatePointer sub(long count) {
		return GC_ObjectModelDelegatePointer.cast(address - (GC_ObjectModelDelegate.SIZEOF * count));
	}

	public GC_ObjectModelDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectModelDelegatePointer subOffset(long offset) {
		return GC_ObjectModelDelegatePointer.cast(address - offset);
	}

	public GC_ObjectModelDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectModelDelegatePointer untag(long mask) {
		return GC_ObjectModelDelegatePointer.cast(address & ~mask);
	}

	public GC_ObjectModelDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectModelDelegate.SIZEOF;
	}

	// Implementation methods

	// GC_ArrayObjectModel* _arrayObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayObjectModelOffset_", declaredType="GC_ArrayObjectModel*")
	public GC_ArrayletObjectModelPointer _arrayObjectModel() throws CorruptDataException {
		return GC_ArrayletObjectModelPointer.cast(getPointerAtOffset(GC_ObjectModelDelegate.__arrayObjectModelOffset_));
	}

	// GC_ArrayObjectModel* _arrayObjectModel
	public PointerPointer _arrayObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModelDelegate.__arrayObjectModelOffset_));
	}

	// bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(GC_ObjectModelDelegate.__compressObjectReferencesOffset_);
	}

	// bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(GC_ObjectModelDelegate.__compressObjectReferencesOffset_));
	}

	// const U64 _delegateHeaderSlotFlagsMask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__delegateHeaderSlotFlagsMaskOffset_", declaredType="const U64")
	public UDATA _delegateHeaderSlotFlagsMask() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_ObjectModelDelegate.__delegateHeaderSlotFlagsMaskOffset_));
	}

	// const U64 _delegateHeaderSlotFlagsMask
	public UDATAPointer _delegateHeaderSlotFlagsMaskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_ObjectModelDelegate.__delegateHeaderSlotFlagsMaskOffset_));
	}

	// GC_MixedObjectModel* _mixedObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mixedObjectModelOffset_", declaredType="GC_MixedObjectModel*")
	public GC_MixedObjectModelPointer _mixedObjectModel() throws CorruptDataException {
		return GC_MixedObjectModelPointer.cast(getPointerAtOffset(GC_ObjectModelDelegate.__mixedObjectModelOffset_));
	}

	// GC_MixedObjectModel* _mixedObjectModel
	public PointerPointer _mixedObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModelDelegate.__mixedObjectModelOffset_));
	}

}
