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
 * Structure: MM_CommonGCDataPointer
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
 * The generated code will provide getters for all elements in the MM_CommonGCDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CommonGCData.class)
public class MM_CommonGCDataPointer extends StructurePointer {

	// NULL
	public static final MM_CommonGCDataPointer NULL = new MM_CommonGCDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CommonGCDataPointer(long address) {
		super(address);
	}

	public static MM_CommonGCDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CommonGCDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CommonGCDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CommonGCDataPointer(address);
	}

	public MM_CommonGCDataPointer add(long count) {
		return MM_CommonGCDataPointer.cast(address + (MM_CommonGCData.SIZEOF * count));
	}

	public MM_CommonGCDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CommonGCDataPointer addOffset(long offset) {
		return MM_CommonGCDataPointer.cast(address + offset);
	}

	public MM_CommonGCDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CommonGCDataPointer sub(long count) {
		return MM_CommonGCDataPointer.cast(address - (MM_CommonGCData.SIZEOF * count));
	}

	public MM_CommonGCDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CommonGCDataPointer subOffset(long offset) {
		return MM_CommonGCDataPointer.cast(address - offset);
	}

	public MM_CommonGCDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CommonGCDataPointer untag(long mask) {
		return MM_CommonGCDataPointer.cast(address & ~mask);
	}

	public MM_CommonGCDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CommonGCData.SIZEOF;
	}

	// Implementation methods

	// U64 immortalFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_immortalFreeBytesOffset_", declaredType="U64")
	public UDATA immortalFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._immortalFreeBytesOffset_));
	}

	// U64 immortalFreeBytes
	public UDATAPointer immortalFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._immortalFreeBytesOffset_));
	}

	// U64 immortalTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_immortalTotalBytesOffset_", declaredType="U64")
	public UDATA immortalTotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._immortalTotalBytesOffset_));
	}

	// U64 immortalTotalBytes
	public UDATAPointer immortalTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._immortalTotalBytesOffset_));
	}

	// U64 loaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loaEnabledOffset_", declaredType="U64")
	public UDATA loaEnabled() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._loaEnabledOffset_));
	}

	// U64 loaEnabled
	public UDATAPointer loaEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._loaEnabledOffset_));
	}

	// U64 nurseryFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryFreeBytesOffset_", declaredType="U64")
	public UDATA nurseryFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._nurseryFreeBytesOffset_));
	}

	// U64 nurseryFreeBytes
	public UDATAPointer nurseryFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._nurseryFreeBytesOffset_));
	}

	// U64 nurseryTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryTotalBytesOffset_", declaredType="U64")
	public UDATA nurseryTotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._nurseryTotalBytesOffset_));
	}

	// U64 nurseryTotalBytes
	public UDATAPointer nurseryTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._nurseryTotalBytesOffset_));
	}

	// U64 rememberedSetCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rememberedSetCountOffset_", declaredType="U64")
	public UDATA rememberedSetCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._rememberedSetCountOffset_));
	}

	// U64 rememberedSetCount
	public UDATAPointer rememberedSetCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._rememberedSetCountOffset_));
	}

	// U64 tenureFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureFreeBytesOffset_", declaredType="U64")
	public UDATA tenureFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._tenureFreeBytesOffset_));
	}

	// U64 tenureFreeBytes
	public UDATAPointer tenureFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._tenureFreeBytesOffset_));
	}

	// U64 tenureLOAFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureLOAFreeBytesOffset_", declaredType="U64")
	public UDATA tenureLOAFreeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._tenureLOAFreeBytesOffset_));
	}

	// U64 tenureLOAFreeBytes
	public UDATAPointer tenureLOAFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._tenureLOAFreeBytesOffset_));
	}

	// U64 tenureLOATotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureLOATotalBytesOffset_", declaredType="U64")
	public UDATA tenureLOATotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._tenureLOATotalBytesOffset_));
	}

	// U64 tenureLOATotalBytes
	public UDATAPointer tenureLOATotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._tenureLOATotalBytesOffset_));
	}

	// U64 tenureTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureTotalBytesOffset_", declaredType="U64")
	public UDATA tenureTotalBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CommonGCData._tenureTotalBytesOffset_));
	}

	// U64 tenureTotalBytes
	public UDATAPointer tenureTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CommonGCData._tenureTotalBytesOffset_));
	}

}
