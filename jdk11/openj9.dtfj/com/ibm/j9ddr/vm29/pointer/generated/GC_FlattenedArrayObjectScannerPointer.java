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
 * Structure: GC_FlattenedArrayObjectScannerPointer
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
 * The generated code will provide getters for all elements in the GC_FlattenedArrayObjectScannerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_FlattenedArrayObjectScanner.class)
public class GC_FlattenedArrayObjectScannerPointer extends GC_HeadlessMixedObjectScannerPointer {

	// NULL
	public static final GC_FlattenedArrayObjectScannerPointer NULL = new GC_FlattenedArrayObjectScannerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_FlattenedArrayObjectScannerPointer(long address) {
		super(address);
	}

	public static GC_FlattenedArrayObjectScannerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_FlattenedArrayObjectScannerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_FlattenedArrayObjectScannerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_FlattenedArrayObjectScannerPointer(address);
	}

	public GC_FlattenedArrayObjectScannerPointer add(long count) {
		return GC_FlattenedArrayObjectScannerPointer.cast(address + (GC_FlattenedArrayObjectScanner.SIZEOF * count));
	}

	public GC_FlattenedArrayObjectScannerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_FlattenedArrayObjectScannerPointer addOffset(long offset) {
		return GC_FlattenedArrayObjectScannerPointer.cast(address + offset);
	}

	public GC_FlattenedArrayObjectScannerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_FlattenedArrayObjectScannerPointer sub(long count) {
		return GC_FlattenedArrayObjectScannerPointer.cast(address - (GC_FlattenedArrayObjectScanner.SIZEOF * count));
	}

	public GC_FlattenedArrayObjectScannerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_FlattenedArrayObjectScannerPointer subOffset(long offset) {
		return GC_FlattenedArrayObjectScannerPointer.cast(address - offset);
	}

	public GC_FlattenedArrayObjectScannerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_FlattenedArrayObjectScannerPointer untag(long mask) {
		return GC_FlattenedArrayObjectScannerPointer.cast(address & ~mask);
	}

	public GC_FlattenedArrayObjectScannerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_FlattenedArrayObjectScanner.SIZEOF;
	}

	// Implementation methods

	// U64* _descriptionBasePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__descriptionBasePtrOffset_", declaredType="U64*")
	public UDATAPointer _descriptionBasePtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(GC_FlattenedArrayObjectScanner.__descriptionBasePtrOffset_));
	}

	// U64* _descriptionBasePtr
	public PointerPointer _descriptionBasePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__descriptionBasePtrOffset_));
	}

	// U64 _elementSizeWithoutPadding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__elementSizeWithoutPaddingOffset_", declaredType="U64")
	public UDATA _elementSizeWithoutPadding() throws CorruptDataException {
		return new U64(getLongAtOffset(GC_FlattenedArrayObjectScanner.__elementSizeWithoutPaddingOffset_));
	}

	// U64 _elementSizeWithoutPadding
	public UDATAPointer _elementSizeWithoutPaddingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__elementSizeWithoutPaddingOffset_));
	}

	// MM_EnvironmentBase* _env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__envOffset_", declaredType="MM_EnvironmentBase*")
	public MM_EnvironmentBasePointer _env() throws CorruptDataException {
		return MM_EnvironmentBasePointer.cast(getPointerAtOffset(GC_FlattenedArrayObjectScanner.__envOffset_));
	}

	// MM_EnvironmentBase* _env
	public PointerPointer _envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__envOffset_));
	}

	// GC_IndexableObjectScanner _indexableScanner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__indexableScannerOffset_", declaredType="GC_IndexableObjectScanner")
	public GC_IndexableObjectScannerPointer _indexableScanner() throws CorruptDataException {
		return GC_IndexableObjectScannerPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__indexableScannerOffset_));
	}

	// GC_IndexableObjectScanner _indexableScanner
	public PointerPointer _indexableScannerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__indexableScannerOffset_));
	}

	// U64* _leafBasePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__leafBasePtrOffset_", declaredType="U64*")
	public UDATAPointer _leafBasePtr() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(GC_FlattenedArrayObjectScanner.__leafBasePtrOffset_));
	}

	// U64* _leafBasePtr
	public PointerPointer _leafBasePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FlattenedArrayObjectScanner.__leafBasePtrOffset_));
	}

}
