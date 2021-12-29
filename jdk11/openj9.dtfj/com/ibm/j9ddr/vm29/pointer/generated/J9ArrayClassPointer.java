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
 * Structure: J9ArrayClassPointer
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
 * The generated code will provide getters for all elements in the J9ArrayClassPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ArrayClass.class)
public class J9ArrayClassPointer extends StructurePointer {

	// NULL
	public static final J9ArrayClassPointer NULL = new J9ArrayClassPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ArrayClassPointer(long address) {
		super(address);
	}

	public static J9ArrayClassPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ArrayClassPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ArrayClassPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ArrayClassPointer(address);
	}

	public J9ArrayClassPointer add(long count) {
		return J9ArrayClassPointer.cast(address + (J9ArrayClass.SIZEOF * count));
	}

	public J9ArrayClassPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ArrayClassPointer addOffset(long offset) {
		return J9ArrayClassPointer.cast(address + offset);
	}

	public J9ArrayClassPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ArrayClassPointer sub(long count) {
		return J9ArrayClassPointer.cast(address - (J9ArrayClass.SIZEOF * count));
	}

	public J9ArrayClassPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ArrayClassPointer subOffset(long offset) {
		return J9ArrayClassPointer.cast(address - offset);
	}

	public J9ArrayClassPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ArrayClassPointer untag(long mask) {
		return J9ArrayClassPointer.cast(address & ~mask);
	}

	public J9ArrayClassPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ArrayClass.SIZEOF;
	}

	// Implementation methods

	// UDATA arity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arityOffset_", declaredType="UDATA")
	public UDATA arity() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._arityOffset_);
	}

	// UDATA arity
	public UDATAPointer arityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._arityOffset_));
	}

	// J9Class* arrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_arrayClassOffset_", declaredType="J9Class*")
	public J9ClassPointer arrayClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._arrayClassOffset_));
	}

	// J9Class* arrayClass
	public PointerPointer arrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._arrayClassOffset_));
	}

	// IDATA backfillOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_backfillOffsetOffset_", declaredType="IDATA")
	public IDATA backfillOffset() throws CorruptDataException {
		return getIDATAAtOffset(J9ArrayClass._backfillOffsetOffset_);
	}

	// IDATA backfillOffset
	public IDATAPointer backfillOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ArrayClass._backfillOffsetOffset_));
	}

	// j9object_t* callSites
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callSitesOffset_", declaredType="j9object_t*")
	public PointerPointer callSites() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._callSitesOffset_));
	}

	// j9object_t* callSites
	public PointerPointer callSitesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._callSitesOffset_));
	}

	// U16 cancelCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cancelCounterOffset_", declaredType="U16")
	public U16 cancelCounter() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayClass._cancelCounterOffset_));
	}

	// U16 cancelCounter
	public U16Pointer cancelCounterEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayClass._cancelCounterOffset_));
	}

	// UDATA castClassCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_castClassCacheOffset_", declaredType="UDATA")
	public UDATA castClassCache() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._castClassCacheOffset_);
	}

	// UDATA castClassCache
	public UDATAPointer castClassCacheEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._castClassCacheOffset_));
	}

	// UDATA classDepthAndFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDepthAndFlagsOffset_", declaredType="UDATA")
	public UDATA classDepthAndFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._classDepthAndFlagsOffset_);
	}

	// UDATA classDepthAndFlags
	public UDATAPointer classDepthAndFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._classDepthAndFlagsOffset_));
	}

	// U32 classDepthWithFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDepthWithFlagsOffset_", declaredType="U32")
	public UDATA classDepthWithFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ArrayClass._classDepthWithFlagsOffset_));
	}

	// U32 classDepthWithFlags
	public UDATAPointer classDepthWithFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._classDepthWithFlagsOffset_));
	}

	// U32 classFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFlagsOffset_", declaredType="U32")
	public UDATA classFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ArrayClass._classFlagsOffset_));
	}

	// U32 classFlags
	public UDATAPointer classFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._classFlagsOffset_));
	}

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9ArrayClass._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._classLoaderOffset_));
	}

	// j9object_t classObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer classObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9ArrayClass._classObjectOffset_));
	}

	// j9object_t classObject
	public PointerPointer classObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._classObjectOffset_));
	}

	// J9Class* componentType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_componentTypeOffset_", declaredType="J9Class*")
	public J9ClassPointer componentType() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._componentTypeOffset_));
	}

	// J9Class* componentType
	public PointerPointer componentTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._componentTypeOffset_));
	}

	// J9VMCustomSpinOptions* customSpinOption
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_customSpinOptionOffset_", declaredType="J9VMCustomSpinOptions*")
	public J9VMCustomSpinOptionsPointer customSpinOption() throws CorruptDataException {
		return J9VMCustomSpinOptionsPointer.cast(getPointerAtOffset(J9ArrayClass._customSpinOptionOffset_));
	}

	// J9VMCustomSpinOptions* customSpinOption
	public PointerPointer customSpinOptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._customSpinOptionOffset_));
	}

	// UDATA eyecatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eyecatcherOffset_", declaredType="UDATA")
	public UDATA eyecatcher() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._eyecatcherOffset_);
	}

	// UDATA eyecatcher
	public UDATAPointer eyecatcherEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._eyecatcherOffset_));
	}

	// UDATA finalizeLinkOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeLinkOffsetOffset_", declaredType="UDATA")
	public UDATA finalizeLinkOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._finalizeLinkOffsetOffset_);
	}

	// UDATA finalizeLinkOffset
	public UDATAPointer finalizeLinkOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._finalizeLinkOffsetOffset_));
	}

	// UDATA flattenedElementSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flattenedElementSizeOffset_", declaredType="UDATA")
	public UDATA flattenedElementSize() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._flattenedElementSizeOffset_);
	}

	// UDATA flattenedElementSize
	public UDATAPointer flattenedElementSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._flattenedElementSizeOffset_));
	}

	// J9Class* gcLink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcLinkOffset_", declaredType="J9Class*")
	public J9ClassPointer gcLink() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._gcLinkOffset_));
	}

	// J9Class* gcLink
	public PointerPointer gcLinkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._gcLinkOffset_));
	}

	// J9Class* hostClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostClassOffset_", declaredType="J9Class*")
	public J9ClassPointer hostClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._hostClassOffset_));
	}

	// J9Class* hostClass
	public PointerPointer hostClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._hostClassOffset_));
	}

	// J9ClassHotFieldsInfo* hotFieldsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hotFieldsInfoOffset_", declaredType="J9ClassHotFieldsInfo*")
	public J9ClassHotFieldsInfoPointer hotFieldsInfo() throws CorruptDataException {
		return J9ClassHotFieldsInfoPointer.cast(getPointerAtOffset(J9ArrayClass._hotFieldsInfoOffset_));
	}

	// J9ClassHotFieldsInfo* hotFieldsInfo
	public PointerPointer hotFieldsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._hotFieldsInfoOffset_));
	}

	// void** iTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_iTableOffset_", declaredType="void**")
	public PointerPointer iTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._iTableOffset_));
	}

	// void** iTable
	public PointerPointer iTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._iTableOffset_));
	}

	// volatile UDATA initializeStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializeStatusOffset_", declaredType="volatile UDATA")
	public UDATA initializeStatus() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._initializeStatusOffset_);
	}

	// volatile UDATA initializeStatus
	public UDATAPointer initializeStatusEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._initializeStatusOffset_));
	}

	// J9Method* initializerCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializerCacheOffset_", declaredType="J9Method*")
	public J9MethodPointer initializerCache() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9ArrayClass._initializerCacheOffset_));
	}

	// J9Method* initializerCache
	public PointerPointer initializerCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._initializerCacheOffset_));
	}

	// UDATA* instanceDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceDescriptionOffset_", declaredType="UDATA*")
	public UDATAPointer instanceDescription() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9ArrayClass._instanceDescriptionOffset_));
	}

	// UDATA* instanceDescription
	public PointerPointer instanceDescriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._instanceDescriptionOffset_));
	}

	// UDATA instanceHotFieldDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceHotFieldDescriptionOffset_", declaredType="UDATA")
	public UDATA instanceHotFieldDescription() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._instanceHotFieldDescriptionOffset_);
	}

	// UDATA instanceHotFieldDescription
	public UDATAPointer instanceHotFieldDescriptionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._instanceHotFieldDescriptionOffset_));
	}

	// UDATA* instanceLeafDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceLeafDescriptionOffset_", declaredType="UDATA*")
	public UDATAPointer instanceLeafDescription() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9ArrayClass._instanceLeafDescriptionOffset_));
	}

	// UDATA* instanceLeafDescription
	public PointerPointer instanceLeafDescriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._instanceLeafDescriptionOffset_));
	}

	// J9JITExceptionTable* jitMetaDataList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitMetaDataListOffset_", declaredType="J9JITExceptionTable*")
	public J9JITExceptionTablePointer jitMetaDataList() throws CorruptDataException {
		return J9JITExceptionTablePointer.cast(getPointerAtOffset(J9ArrayClass._jitMetaDataListOffset_));
	}

	// J9JITExceptionTable* jitMetaDataList
	public PointerPointer jitMetaDataListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._jitMetaDataListOffset_));
	}

	// void** jniIDs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jniIDsOffset_", declaredType="void**")
	public PointerPointer jniIDs() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._jniIDsOffset_));
	}

	// void** jniIDs
	public PointerPointer jniIDsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._jniIDsOffset_));
	}

	// J9ITable* lastITable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastITableOffset_", declaredType="J9ITable*")
	public J9ITablePointer lastITable() throws CorruptDataException {
		return J9ITablePointer.cast(getPointerAtOffset(J9ArrayClass._lastITableOffset_));
	}

	// J9ITable* lastITable
	public PointerPointer lastITableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._lastITableOffset_));
	}

	// J9Class* leafComponentType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_leafComponentTypeOffset_", declaredType="J9Class*")
	public J9ClassPointer leafComponentType() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._leafComponentTypeOffset_));
	}

	// J9Class* leafComponentType
	public PointerPointer leafComponentTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._leafComponentTypeOffset_));
	}

	// UDATA lockOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockOffsetOffset_", declaredType="UDATA")
	public UDATA lockOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._lockOffsetOffset_);
	}

	// UDATA lockOffset
	public UDATAPointer lockOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._lockOffsetOffset_));
	}

	// j9object_t* methodTypes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodTypesOffset_", declaredType="j9object_t*")
	public PointerPointer methodTypes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._methodTypesOffset_));
	}

	// j9object_t* methodTypes
	public PointerPointer methodTypesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._methodTypesOffset_));
	}

	// J9Module* module
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_moduleOffset_", declaredType="J9Module*")
	public J9ModulePointer module() throws CorruptDataException {
		return J9ModulePointer.cast(getPointerAtOffset(J9ArrayClass._moduleOffset_));
	}

	// J9Module* module
	public PointerPointer moduleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._moduleOffset_));
	}

	// J9Class* nestHost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nestHostOffset_", declaredType="J9Class*")
	public J9ClassPointer nestHost() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._nestHostOffset_));
	}

	// J9Class* nestHost
	public PointerPointer nestHostEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._nestHostOffset_));
	}

	// UDATA newInstanceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newInstanceCountOffset_", declaredType="UDATA")
	public UDATA newInstanceCount() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._newInstanceCountOffset_);
	}

	// UDATA newInstanceCount
	public UDATAPointer newInstanceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._newInstanceCountOffset_));
	}

	// J9Class* nextClassInSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextClassInSegmentOffset_", declaredType="J9Class*")
	public J9ClassPointer nextClassInSegment() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._nextClassInSegmentOffset_));
	}

	// J9Class* nextClassInSegment
	public PointerPointer nextClassInSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._nextClassInSegmentOffset_));
	}

	// UDATA packageID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_packageIDOffset_", declaredType="UDATA")
	public UDATA packageID() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._packageIDOffset_);
	}

	// UDATA packageID
	public UDATAPointer packageIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._packageIDOffset_));
	}

	// U32 paddingForGLRCounters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_paddingForGLRCountersOffset_", declaredType="U32")
	public UDATA paddingForGLRCounters() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ArrayClass._paddingForGLRCountersOffset_));
	}

	// U32 paddingForGLRCounters
	public UDATAPointer paddingForGLRCountersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._paddingForGLRCountersOffset_));
	}

	// UDATA* ramConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramConstantPoolOffset_", declaredType="UDATA*")
	public UDATAPointer ramConstantPool() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9ArrayClass._ramConstantPoolOffset_));
	}

	// UDATA* ramConstantPool
	public PointerPointer ramConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._ramConstantPoolOffset_));
	}

	// J9Class* replacedClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_replacedClassOffset_", declaredType="J9Class*")
	public J9ClassPointer replacedClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._replacedClassOffset_));
	}

	// J9Class* replacedClass
	public PointerPointer replacedClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._replacedClassOffset_));
	}

	// U16 reservedCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedCounterOffset_", declaredType="U16")
	public U16 reservedCounter() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayClass._reservedCounterOffset_));
	}

	// U16 reservedCounter
	public U16Pointer reservedCounterEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayClass._reservedCounterOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9ArrayClass._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._romClassOffset_));
	}

	// UDATA romableAotITable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romableAotITableOffset_", declaredType="UDATA")
	public UDATA romableAotITable() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._romableAotITableOffset_);
	}

	// UDATA romableAotITable
	public UDATAPointer romableAotITableEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._romableAotITableOffset_));
	}

	// UDATA selfReferencingField1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_selfReferencingField1Offset_", declaredType="UDATA")
	public UDATA selfReferencingField1() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._selfReferencingField1Offset_);
	}

	// UDATA selfReferencingField1
	public UDATAPointer selfReferencingField1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._selfReferencingField1Offset_));
	}

	// UDATA selfReferencingField2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_selfReferencingField2Offset_", declaredType="UDATA")
	public UDATA selfReferencingField2() throws CorruptDataException {
		return getUDATAAtOffset(J9ArrayClass._selfReferencingField2Offset_);
	}

	// UDATA selfReferencingField2
	public UDATAPointer selfReferencingField2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ArrayClass._selfReferencingField2Offset_));
	}

	// void** specialSplitMethodTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialSplitMethodTableOffset_", declaredType="void**")
	public PointerPointer specialSplitMethodTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._specialSplitMethodTableOffset_));
	}

	// void** specialSplitMethodTable
	public PointerPointer specialSplitMethodTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._specialSplitMethodTableOffset_));
	}

	// void** staticSplitMethodTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_staticSplitMethodTableOffset_", declaredType="void**")
	public PointerPointer staticSplitMethodTable() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._staticSplitMethodTableOffset_));
	}

	// void** staticSplitMethodTable
	public PointerPointer staticSplitMethodTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._staticSplitMethodTableOffset_));
	}

	// J9Class* subclassTraversalLink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subclassTraversalLinkOffset_", declaredType="J9Class*")
	public J9ClassPointer subclassTraversalLink() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._subclassTraversalLinkOffset_));
	}

	// J9Class* subclassTraversalLink
	public PointerPointer subclassTraversalLinkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._subclassTraversalLinkOffset_));
	}

	// J9Class* subclassTraversalReverseLink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subclassTraversalReverseLinkOffset_", declaredType="J9Class*")
	public J9ClassPointer subclassTraversalReverseLink() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ArrayClass._subclassTraversalReverseLinkOffset_));
	}

	// J9Class* subclassTraversalReverseLink
	public PointerPointer subclassTraversalReverseLinkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._subclassTraversalReverseLinkOffset_));
	}

	// void** superclasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_superclassesOffset_", declaredType="void**")
	public PointerPointer superclasses() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._superclassesOffset_));
	}

	// void** superclasses
	public PointerPointer superclassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._superclassesOffset_));
	}

	// j9object_t* varHandleMethodTypes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_varHandleMethodTypesOffset_", declaredType="j9object_t*")
	public PointerPointer varHandleMethodTypes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ArrayClass._varHandleMethodTypesOffset_));
	}

	// j9object_t* varHandleMethodTypes
	public PointerPointer varHandleMethodTypesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayClass._varHandleMethodTypesOffset_));
	}

}
