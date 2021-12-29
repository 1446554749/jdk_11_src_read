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
 * Structure: ROMClassWriterPointer
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
 * The generated code will provide getters for all elements in the ROMClassWriterPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassWriter.class)
public class ROMClassWriterPointer extends StructurePointer {

	// NULL
	public static final ROMClassWriterPointer NULL = new ROMClassWriterPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassWriterPointer(long address) {
		super(address);
	}

	public static ROMClassWriterPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassWriterPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassWriterPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassWriterPointer(address);
	}

	public ROMClassWriterPointer add(long count) {
		return ROMClassWriterPointer.cast(address + (ROMClassWriter.SIZEOF * count));
	}

	public ROMClassWriterPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassWriterPointer addOffset(long offset) {
		return ROMClassWriterPointer.cast(address + offset);
	}

	public ROMClassWriterPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassWriterPointer sub(long count) {
		return ROMClassWriterPointer.cast(address - (ROMClassWriter.SIZEOF * count));
	}

	public ROMClassWriterPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassWriterPointer subOffset(long offset) {
		return ROMClassWriterPointer.cast(address - offset);
	}

	public ROMClassWriterPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassWriterPointer untag(long mask) {
		return ROMClassWriterPointer.cast(address & ~mask);
	}

	public ROMClassWriterPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassWriter.SIZEOF;
	}

	// Implementation methods

	// UDATA _annotationInfoClassSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__annotationInfoClassSRPKeyOffset_", declaredType="UDATA")
	public UDATA _annotationInfoClassSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__annotationInfoClassSRPKeyOffset_);
	}

	// UDATA _annotationInfoClassSRPKey
	public UDATAPointer _annotationInfoClassSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__annotationInfoClassSRPKeyOffset_));
	}

	// BufferManager* _bufferManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerOffset_", declaredType="BufferManager*")
	public BufferManagerPointer _bufferManager() throws CorruptDataException {
		return BufferManagerPointer.cast(getPointerAtOffset(ROMClassWriter.__bufferManagerOffset_));
	}

	// BufferManager* _bufferManager
	public PointerPointer _bufferManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__bufferManagerOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(ROMClassWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(ROMClassWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(ROMClassWriter.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(ROMClassWriter.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ROMClassWriter.__buildResultOffset_), BuildResult.class);
	}

	// UDATA _callSiteDataSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__callSiteDataSRPKeyOffset_", declaredType="UDATA")
	public UDATA _callSiteDataSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__callSiteDataSRPKeyOffset_);
	}

	// UDATA _callSiteDataSRPKey
	public UDATAPointer _callSiteDataSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__callSiteDataSRPKeyOffset_));
	}

	// ClassFileOracle* _classFileOracle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOracleOffset_", declaredType="ClassFileOracle*")
	public ClassFileOraclePointer _classFileOracle() throws CorruptDataException {
		return ClassFileOraclePointer.cast(getPointerAtOffset(ROMClassWriter.__classFileOracleOffset_));
	}

	// ClassFileOracle* _classFileOracle
	public PointerPointer _classFileOracleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__classFileOracleOffset_));
	}

	// ConstantPoolMap* _constantPoolMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolMapOffset_", declaredType="ConstantPoolMap*")
	public ConstantPoolMapPointer _constantPoolMap() throws CorruptDataException {
		return ConstantPoolMapPointer.cast(getPointerAtOffset(ROMClassWriter.__constantPoolMapOffset_));
	}

	// ConstantPoolMap* _constantPoolMap
	public PointerPointer _constantPoolMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__constantPoolMapOffset_));
	}

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(ROMClassWriter.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__contextOffset_));
	}

	// UDATA _cpDescriptionShapeSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpDescriptionShapeSRPKeyOffset_", declaredType="UDATA")
	public UDATA _cpDescriptionShapeSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__cpDescriptionShapeSRPKeyOffset_);
	}

	// UDATA _cpDescriptionShapeSRPKey
	public UDATAPointer _cpDescriptionShapeSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__cpDescriptionShapeSRPKeyOffset_));
	}

	// UDATA _enclosingMethodSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__enclosingMethodSRPKeyOffset_", declaredType="UDATA")
	public UDATA _enclosingMethodSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__enclosingMethodSRPKeyOffset_);
	}

	// UDATA _enclosingMethodSRPKey
	public UDATAPointer _enclosingMethodSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__enclosingMethodSRPKeyOffset_));
	}

	// UDATA _fieldsSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fieldsSRPKeyOffset_", declaredType="UDATA")
	public UDATA _fieldsSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__fieldsSRPKeyOffset_);
	}

	// UDATA _fieldsSRPKey
	public UDATAPointer _fieldsSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__fieldsSRPKeyOffset_));
	}

	// UDATA _innerClassesSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__innerClassesSRPKeyOffset_", declaredType="UDATA")
	public UDATA _innerClassesSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__innerClassesSRPKeyOffset_);
	}

	// UDATA _innerClassesSRPKey
	public UDATAPointer _innerClassesSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__innerClassesSRPKeyOffset_));
	}

	// UDATA _interfacesSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interfacesSRPKeyOffset_", declaredType="UDATA")
	public UDATA _interfacesSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__interfacesSRPKeyOffset_);
	}

	// UDATA _interfacesSRPKey
	public UDATAPointer _interfacesSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__interfacesSRPKeyOffset_));
	}

	// UDATA _intermediateClassDataSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__intermediateClassDataSRPKeyOffset_", declaredType="UDATA")
	public UDATA _intermediateClassDataSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__intermediateClassDataSRPKeyOffset_);
	}

	// UDATA _intermediateClassDataSRPKey
	public UDATAPointer _intermediateClassDataSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__intermediateClassDataSRPKeyOffset_));
	}

	// ROMClassWriter$MethodNotes* _methodNotes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodNotesOffset_", declaredType="ROMClassWriter$MethodNotes*")
	public ROMClassWriter$MethodNotesPointer _methodNotes() throws CorruptDataException {
		return ROMClassWriter$MethodNotesPointer.cast(getPointerAtOffset(ROMClassWriter.__methodNotesOffset_));
	}

	// ROMClassWriter$MethodNotes* _methodNotes
	public PointerPointer _methodNotesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__methodNotesOffset_));
	}

	// UDATA _methodsSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodsSRPKeyOffset_", declaredType="UDATA")
	public UDATA _methodsSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__methodsSRPKeyOffset_);
	}

	// UDATA _methodsSRPKey
	public UDATAPointer _methodsSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__methodsSRPKeyOffset_));
	}

	// UDATA _nestMembersSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestMembersSRPKeyOffset_", declaredType="UDATA")
	public UDATA _nestMembersSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__nestMembersSRPKeyOffset_);
	}

	// UDATA _nestMembersSRPKey
	public UDATAPointer _nestMembersSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__nestMembersSRPKeyOffset_));
	}

	// UDATA _optionalInfoSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__optionalInfoSRPKeyOffset_", declaredType="UDATA")
	public UDATA _optionalInfoSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__optionalInfoSRPKeyOffset_);
	}

	// UDATA _optionalInfoSRPKey
	public UDATAPointer _optionalInfoSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__optionalInfoSRPKeyOffset_));
	}

	// UDATA _permittedSubclassesInfoSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__permittedSubclassesInfoSRPKeyOffset_", declaredType="UDATA")
	public UDATA _permittedSubclassesInfoSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__permittedSubclassesInfoSRPKeyOffset_);
	}

	// UDATA _permittedSubclassesInfoSRPKey
	public UDATAPointer _permittedSubclassesInfoSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__permittedSubclassesInfoSRPKeyOffset_));
	}

	// UDATA _recordInfoSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recordInfoSRPKeyOffset_", declaredType="UDATA")
	public UDATA _recordInfoSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__recordInfoSRPKeyOffset_);
	}

	// UDATA _recordInfoSRPKey
	public UDATAPointer _recordInfoSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__recordInfoSRPKeyOffset_));
	}

	// UDATA _sourceDebugExtensionSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sourceDebugExtensionSRPKeyOffset_", declaredType="UDATA")
	public UDATA _sourceDebugExtensionSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__sourceDebugExtensionSRPKeyOffset_);
	}

	// UDATA _sourceDebugExtensionSRPKey
	public UDATAPointer _sourceDebugExtensionSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__sourceDebugExtensionSRPKeyOffset_));
	}

	// UDATA _specialSplitTableSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__specialSplitTableSRPKeyOffset_", declaredType="UDATA")
	public UDATA _specialSplitTableSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__specialSplitTableSRPKeyOffset_);
	}

	// UDATA _specialSplitTableSRPKey
	public UDATAPointer _specialSplitTableSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__specialSplitTableSRPKeyOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpKeyProducerOffset_", declaredType="SRPKeyProducer*")
	public SRPKeyProducerPointer _srpKeyProducer() throws CorruptDataException {
		return SRPKeyProducerPointer.cast(getPointerAtOffset(ROMClassWriter.__srpKeyProducerOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	public PointerPointer _srpKeyProducerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__srpKeyProducerOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpOffsetTableOffset_", declaredType="SRPOffsetTable*")
	public SRPOffsetTablePointer _srpOffsetTable() throws CorruptDataException {
		return SRPOffsetTablePointer.cast(getPointerAtOffset(ROMClassWriter.__srpOffsetTableOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	public PointerPointer _srpOffsetTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter.__srpOffsetTableOffset_));
	}

	// UDATA _stackMapsSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stackMapsSRPKeyOffset_", declaredType="UDATA")
	public UDATA _stackMapsSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__stackMapsSRPKeyOffset_);
	}

	// UDATA _stackMapsSRPKey
	public UDATAPointer _stackMapsSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__stackMapsSRPKeyOffset_));
	}

	// UDATA _staticSplitTableSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__staticSplitTableSRPKeyOffset_", declaredType="UDATA")
	public UDATA _staticSplitTableSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__staticSplitTableSRPKeyOffset_);
	}

	// UDATA _staticSplitTableSRPKey
	public UDATAPointer _staticSplitTableSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__staticSplitTableSRPKeyOffset_));
	}

	// UDATA _typeAnnotationInfoSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeAnnotationInfoSRPKeyOffset_", declaredType="UDATA")
	public UDATA _typeAnnotationInfoSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__typeAnnotationInfoSRPKeyOffset_);
	}

	// UDATA _typeAnnotationInfoSRPKey
	public UDATAPointer _typeAnnotationInfoSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__typeAnnotationInfoSRPKeyOffset_));
	}

	// UDATA _varHandleMethodTypeLookupTableSRPKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__varHandleMethodTypeLookupTableSRPKeyOffset_", declaredType="UDATA")
	public UDATA _varHandleMethodTypeLookupTableSRPKey() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter.__varHandleMethodTypeLookupTableSRPKeyOffset_);
	}

	// UDATA _varHandleMethodTypeLookupTableSRPKey
	public UDATAPointer _varHandleMethodTypeLookupTableSRPKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter.__varHandleMethodTypeLookupTableSRPKeyOffset_));
	}

}
