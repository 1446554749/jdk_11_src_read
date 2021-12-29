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
 * Structure: GC_ObjectModelPointer
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
 * The generated code will provide getters for all elements in the GC_ObjectModelPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ObjectModel.class)
public class GC_ObjectModelPointer extends GC_ObjectModelBasePointer {

	// NULL
	public static final GC_ObjectModelPointer NULL = new GC_ObjectModelPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ObjectModelPointer(long address) {
		super(address);
	}

	public static GC_ObjectModelPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ObjectModelPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ObjectModelPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ObjectModelPointer(address);
	}

	public GC_ObjectModelPointer add(long count) {
		return GC_ObjectModelPointer.cast(address + (GC_ObjectModel.SIZEOF * count));
	}

	public GC_ObjectModelPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ObjectModelPointer addOffset(long offset) {
		return GC_ObjectModelPointer.cast(address + offset);
	}

	public GC_ObjectModelPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ObjectModelPointer sub(long count) {
		return GC_ObjectModelPointer.cast(address - (GC_ObjectModel.SIZEOF * count));
	}

	public GC_ObjectModelPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ObjectModelPointer subOffset(long offset) {
		return GC_ObjectModelPointer.cast(address - offset);
	}

	public GC_ObjectModelPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ObjectModelPointer untag(long mask) {
		return GC_ObjectModelPointer.cast(address & ~mask);
	}

	public GC_ObjectModelPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ObjectModel.SIZEOF;
	}

	// Implementation methods

	// J9Class* _atomicMarkableReferenceClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__atomicMarkableReferenceClassOffset_", declaredType="J9Class*")
	public J9ClassPointer _atomicMarkableReferenceClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ObjectModel.__atomicMarkableReferenceClassOffset_));
	}

	// J9Class* _atomicMarkableReferenceClass
	public PointerPointer _atomicMarkableReferenceClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__atomicMarkableReferenceClassOffset_));
	}

	// J9Class* _classClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classClassOffset_", declaredType="J9Class*")
	public J9ClassPointer _classClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ObjectModel.__classClassOffset_));
	}

	// J9Class* _classClass
	public PointerPointer _classClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__classClassOffset_));
	}

	// J9Class* _classLoaderClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderClassOffset_", declaredType="J9Class*")
	public J9ClassPointer _classLoaderClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ObjectModel.__classLoaderClassOffset_));
	}

	// J9Class* _classLoaderClass
	public PointerPointer _classLoaderClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__classLoaderClassOffset_));
	}

	// GC_ArrayObjectModel* _indexableObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__indexableObjectModelOffset_", declaredType="GC_ArrayObjectModel*")
	public GC_ArrayletObjectModelPointer _indexableObjectModel() throws CorruptDataException {
		return GC_ArrayletObjectModelPointer.cast(getPointerAtOffset(GC_ObjectModel.__indexableObjectModelOffset_));
	}

	// GC_ArrayObjectModel* _indexableObjectModel
	public PointerPointer _indexableObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__indexableObjectModelOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(GC_ObjectModel.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__javaVMOffset_));
	}

	// GC_MixedObjectModel* _mixedObjectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mixedObjectModelOffset_", declaredType="GC_MixedObjectModel*")
	public GC_MixedObjectModelPointer _mixedObjectModel() throws CorruptDataException {
		return GC_MixedObjectModelPointer.cast(getPointerAtOffset(GC_ObjectModel.__mixedObjectModelOffset_));
	}

	// GC_MixedObjectModel* _mixedObjectModel
	public PointerPointer _mixedObjectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ObjectModel.__mixedObjectModelOffset_));
	}

}
