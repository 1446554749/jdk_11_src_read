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
 * Structure: ConstantPoolMapPointer
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
 * The generated code will provide getters for all elements in the ConstantPoolMapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ConstantPoolMap.class)
public class ConstantPoolMapPointer extends StructurePointer {

	// NULL
	public static final ConstantPoolMapPointer NULL = new ConstantPoolMapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ConstantPoolMapPointer(long address) {
		super(address);
	}

	public static ConstantPoolMapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ConstantPoolMapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ConstantPoolMapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ConstantPoolMapPointer(address);
	}

	public ConstantPoolMapPointer add(long count) {
		return ConstantPoolMapPointer.cast(address + (ConstantPoolMap.SIZEOF * count));
	}

	public ConstantPoolMapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ConstantPoolMapPointer addOffset(long offset) {
		return ConstantPoolMapPointer.cast(address + offset);
	}

	public ConstantPoolMapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ConstantPoolMapPointer sub(long count) {
		return ConstantPoolMapPointer.cast(address - (ConstantPoolMap.SIZEOF * count));
	}

	public ConstantPoolMapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ConstantPoolMapPointer subOffset(long offset) {
		return ConstantPoolMapPointer.cast(address - offset);
	}

	public ConstantPoolMapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ConstantPoolMapPointer untag(long mask) {
		return ConstantPoolMapPointer.cast(address & ~mask);
	}

	public ConstantPoolMapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ConstantPoolMap.SIZEOF;
	}

	// Implementation methods

	// BufferManager* _bufferManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerOffset_", declaredType="BufferManager*")
	public BufferManagerPointer _bufferManager() throws CorruptDataException {
		return BufferManagerPointer.cast(getPointerAtOffset(ConstantPoolMap.__bufferManagerOffset_));
	}

	// BufferManager* _bufferManager
	public PointerPointer _bufferManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__bufferManagerOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(ConstantPoolMap.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(ConstantPoolMap.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(ConstantPoolMap.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(ConstantPoolMap.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ConstantPoolMap.__buildResultOffset_), BuildResult.class);
	}

	// U32 _callSiteCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__callSiteCountOffset_", declaredType="U32")
	public UDATA _callSiteCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ConstantPoolMap.__callSiteCountOffset_));
	}

	// U32 _callSiteCount
	public UDATAPointer _callSiteCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ConstantPoolMap.__callSiteCountOffset_));
	}

	// ClassFileOracle* _classFileOracle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOracleOffset_", declaredType="ClassFileOracle*")
	public ClassFileOraclePointer _classFileOracle() throws CorruptDataException {
		return ClassFileOraclePointer.cast(getPointerAtOffset(ConstantPoolMap.__classFileOracleOffset_));
	}

	// ClassFileOracle* _classFileOracle
	public PointerPointer _classFileOracleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__classFileOracleOffset_));
	}

	// ConstantPoolMap$ConstantPoolEntry* _constantPoolEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolEntriesOffset_", declaredType="ConstantPoolMap$ConstantPoolEntry*")
	public ConstantPoolMap$ConstantPoolEntryPointer _constantPoolEntries() throws CorruptDataException {
		return ConstantPoolMap$ConstantPoolEntryPointer.cast(getPointerAtOffset(ConstantPoolMap.__constantPoolEntriesOffset_));
	}

	// ConstantPoolMap$ConstantPoolEntry* _constantPoolEntries
	public PointerPointer _constantPoolEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__constantPoolEntriesOffset_));
	}

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(ConstantPoolMap.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__contextOffset_));
	}

	// U32 _methodTypeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodTypeCountOffset_", declaredType="U32")
	public UDATA _methodTypeCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ConstantPoolMap.__methodTypeCountOffset_));
	}

	// U32 _methodTypeCount
	public UDATAPointer _methodTypeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ConstantPoolMap.__methodTypeCountOffset_));
	}

	// U16 _ramConstantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ramConstantPoolCountOffset_", declaredType="U16")
	public U16 _ramConstantPoolCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap.__ramConstantPoolCountOffset_));
	}

	// U16 _ramConstantPoolCount
	public U16Pointer _ramConstantPoolCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap.__ramConstantPoolCountOffset_));
	}

	// U16 _romConstantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romConstantPoolCountOffset_", declaredType="U16")
	public U16 _romConstantPoolCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap.__romConstantPoolCountOffset_));
	}

	// U16 _romConstantPoolCount
	public U16Pointer _romConstantPoolCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap.__romConstantPoolCountOffset_));
	}

	// U16* _romConstantPoolEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romConstantPoolEntriesOffset_", declaredType="U16*")
	public U16Pointer _romConstantPoolEntries() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(ConstantPoolMap.__romConstantPoolEntriesOffset_));
	}

	// U16* _romConstantPoolEntries
	public PointerPointer _romConstantPoolEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__romConstantPoolEntriesOffset_));
	}

	// U8* _romConstantPoolTypes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romConstantPoolTypesOffset_", declaredType="U8*")
	public U8Pointer _romConstantPoolTypes() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ConstantPoolMap.__romConstantPoolTypesOffset_));
	}

	// U8* _romConstantPoolTypes
	public PointerPointer _romConstantPoolTypesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__romConstantPoolTypesOffset_));
	}

	// U16* _specialSplitEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__specialSplitEntriesOffset_", declaredType="U16*")
	public U16Pointer _specialSplitEntries() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(ConstantPoolMap.__specialSplitEntriesOffset_));
	}

	// U16* _specialSplitEntries
	public PointerPointer _specialSplitEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__specialSplitEntriesOffset_));
	}

	// U16 _specialSplitEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__specialSplitEntryCountOffset_", declaredType="U16")
	public U16 _specialSplitEntryCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap.__specialSplitEntryCountOffset_));
	}

	// U16 _specialSplitEntryCount
	public U16Pointer _specialSplitEntryCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap.__specialSplitEntryCountOffset_));
	}

	// U16* _staticSplitEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__staticSplitEntriesOffset_", declaredType="U16*")
	public U16Pointer _staticSplitEntries() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(ConstantPoolMap.__staticSplitEntriesOffset_));
	}

	// U16* _staticSplitEntries
	public PointerPointer _staticSplitEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__staticSplitEntriesOffset_));
	}

	// U16 _staticSplitEntryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__staticSplitEntryCountOffset_", declaredType="U16")
	public U16 _staticSplitEntryCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap.__staticSplitEntryCountOffset_));
	}

	// U16 _staticSplitEntryCount
	public U16Pointer _staticSplitEntryCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap.__staticSplitEntryCountOffset_));
	}

	// U16 _varHandleMethodTypeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__varHandleMethodTypeCountOffset_", declaredType="U16")
	public U16 _varHandleMethodTypeCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ConstantPoolMap.__varHandleMethodTypeCountOffset_));
	}

	// U16 _varHandleMethodTypeCount
	public U16Pointer _varHandleMethodTypeCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ConstantPoolMap.__varHandleMethodTypeCountOffset_));
	}

	// U16* _varHandleMethodTypeLookupTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__varHandleMethodTypeLookupTableOffset_", declaredType="U16*")
	public U16Pointer _varHandleMethodTypeLookupTable() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(ConstantPoolMap.__varHandleMethodTypeLookupTableOffset_));
	}

	// U16* _varHandleMethodTypeLookupTable
	public PointerPointer _varHandleMethodTypeLookupTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ConstantPoolMap.__varHandleMethodTypeLookupTableOffset_));
	}

}
