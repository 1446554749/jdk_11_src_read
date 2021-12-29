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
 * Structure: ConstantPoolMap$ConstantPoolEntryPointer
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
 * The generated code will provide getters for all elements in the ConstantPoolMap$ConstantPoolEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ConstantPoolMap$ConstantPoolEntry.class)
public class ConstantPoolMap$ConstantPoolEntryPointer extends StructurePointer {

	// NULL
	public static final ConstantPoolMap$ConstantPoolEntryPointer NULL = new ConstantPoolMap$ConstantPoolEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ConstantPoolMap$ConstantPoolEntryPointer(long address) {
		super(address);
	}

	public static ConstantPoolMap$ConstantPoolEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ConstantPoolMap$ConstantPoolEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ConstantPoolMap$ConstantPoolEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ConstantPoolMap$ConstantPoolEntryPointer(address);
	}

	public ConstantPoolMap$ConstantPoolEntryPointer add(long count) {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(address + (ConstantPoolMap$ConstantPoolEntry.SIZEOF * count));
	}

	public ConstantPoolMap$ConstantPoolEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ConstantPoolMap$ConstantPoolEntryPointer addOffset(long offset) {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(address + offset);
	}

	public ConstantPoolMap$ConstantPoolEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ConstantPoolMap$ConstantPoolEntryPointer sub(long count) {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(address - (ConstantPoolMap$ConstantPoolEntry.SIZEOF * count));
	}

	public ConstantPoolMap$ConstantPoolEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ConstantPoolMap$ConstantPoolEntryPointer subOffset(long offset) {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(address - offset);
	}

	public ConstantPoolMap$ConstantPoolEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ConstantPoolMap$ConstantPoolEntryPointer untag(long mask) {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(address & ~mask);
	}

	public ConstantPoolMap$ConstantPoolEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ConstantPoolMap$ConstantPoolEntry.SIZEOF;
	}

	// Implementation methods

	// U32 callSiteReferenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callSiteReferenceCountOffset_", declaredType="U32")
	public UDATA callSiteReferenceCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ConstantPoolMap$ConstantPoolEntry._callSiteReferenceCountOffset_));
	}

	// U32 callSiteReferenceCount
	public UDATAPointer callSiteReferenceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._callSiteReferenceCountOffset_));
	}

	// U16 currentCallSiteIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentCallSiteIndexOffset_", declaredType="U16")
	public U16 currentCallSiteIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap$ConstantPoolEntry._currentCallSiteIndexOffset_));
	}

	// U16 currentCallSiteIndex
	public U16Pointer currentCallSiteIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._currentCallSiteIndexOffset_));
	}

	// bool isReferenced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isReferencedOffset_", declaredType="bool")
	public boolean isReferenced() throws CorruptDataException {
		return getBoolAtOffset(ConstantPoolMap$ConstantPoolEntry._isReferencedOffset_);
	}

	// bool isReferenced
	public BoolPointer isReferencedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._isReferencedOffset_));
	}

	// bool[] isUsedBy
	public BoolPointer isUsedByEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._isUsedByOffset_));
	}

	// bool isUsedByLDC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isUsedByLDCOffset_", declaredType="bool")
	public boolean isUsedByLDC() throws CorruptDataException {
		return getBoolAtOffset(ConstantPoolMap$ConstantPoolEntry._isUsedByLDCOffset_);
	}

	// bool isUsedByLDC
	public BoolPointer isUsedByLDCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._isUsedByLDCOffset_));
	}

	// U16 romCPIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romCPIndexOffset_", declaredType="U16")
	public U16 romCPIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap$ConstantPoolEntry._romCPIndexOffset_));
	}

	// U16 romCPIndex
	public U16Pointer romCPIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._romCPIndexOffset_));
	}

	// U16 specialSplitTableIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialSplitTableIndexOffset_", declaredType="U16")
	public U16 specialSplitTableIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap$ConstantPoolEntry._specialSplitTableIndexOffset_));
	}

	// U16 specialSplitTableIndex
	public U16Pointer specialSplitTableIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._specialSplitTableIndexOffset_));
	}

	// U16 staticSplitTableIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_staticSplitTableIndexOffset_", declaredType="U16")
	public U16 staticSplitTableIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap$ConstantPoolEntry._staticSplitTableIndexOffset_));
	}

	// U16 staticSplitTableIndex
	public U16Pointer staticSplitTableIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap$ConstantPoolEntry._staticSplitTableIndexOffset_));
	}

}
