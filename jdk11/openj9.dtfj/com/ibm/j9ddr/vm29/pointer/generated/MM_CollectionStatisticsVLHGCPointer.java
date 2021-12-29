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
 * Structure: MM_CollectionStatisticsVLHGCPointer
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
 * The generated code will provide getters for all elements in the MM_CollectionStatisticsVLHGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CollectionStatisticsVLHGC.class)
public class MM_CollectionStatisticsVLHGCPointer extends MM_CollectionStatisticsPointer {

	// NULL
	public static final MM_CollectionStatisticsVLHGCPointer NULL = new MM_CollectionStatisticsVLHGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CollectionStatisticsVLHGCPointer(long address) {
		super(address);
	}

	public static MM_CollectionStatisticsVLHGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CollectionStatisticsVLHGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CollectionStatisticsVLHGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CollectionStatisticsVLHGCPointer(address);
	}

	public MM_CollectionStatisticsVLHGCPointer add(long count) {
		return MM_CollectionStatisticsVLHGCPointer.cast(address + (MM_CollectionStatisticsVLHGC.SIZEOF * count));
	}

	public MM_CollectionStatisticsVLHGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CollectionStatisticsVLHGCPointer addOffset(long offset) {
		return MM_CollectionStatisticsVLHGCPointer.cast(address + offset);
	}

	public MM_CollectionStatisticsVLHGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CollectionStatisticsVLHGCPointer sub(long count) {
		return MM_CollectionStatisticsVLHGCPointer.cast(address - (MM_CollectionStatisticsVLHGC.SIZEOF * count));
	}

	public MM_CollectionStatisticsVLHGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CollectionStatisticsVLHGCPointer subOffset(long offset) {
		return MM_CollectionStatisticsVLHGCPointer.cast(address - offset);
	}

	public MM_CollectionStatisticsVLHGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CollectionStatisticsVLHGCPointer untag(long mask) {
		return MM_CollectionStatisticsVLHGCPointer.cast(address & ~mask);
	}

	public MM_CollectionStatisticsVLHGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CollectionStatisticsVLHGC.SIZEOF;
	}

	// Implementation methods

	// U64 _arrayletPrimitiveLeaves
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletPrimitiveLeavesOffset_", declaredType="U64")
	public UDATA _arrayletPrimitiveLeaves() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletPrimitiveLeavesOffset_));
	}

	// U64 _arrayletPrimitiveLeaves
	public UDATAPointer _arrayletPrimitiveLeavesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletPrimitiveLeavesOffset_));
	}

	// U64 _arrayletPrimitiveObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletPrimitiveObjectsOffset_", declaredType="U64")
	public UDATA _arrayletPrimitiveObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletPrimitiveObjectsOffset_));
	}

	// U64 _arrayletPrimitiveObjects
	public UDATAPointer _arrayletPrimitiveObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletPrimitiveObjectsOffset_));
	}

	// U64 _arrayletReferenceLeaves
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletReferenceLeavesOffset_", declaredType="U64")
	public UDATA _arrayletReferenceLeaves() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletReferenceLeavesOffset_));
	}

	// U64 _arrayletReferenceLeaves
	public UDATAPointer _arrayletReferenceLeavesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletReferenceLeavesOffset_));
	}

	// U64 _arrayletReferenceObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletReferenceObjectsOffset_", declaredType="U64")
	public UDATA _arrayletReferenceObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletReferenceObjectsOffset_));
	}

	// U64 _arrayletReferenceObjects
	public UDATAPointer _arrayletReferenceObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletReferenceObjectsOffset_));
	}

	// U64 _arrayletUnknownLeaves
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletUnknownLeavesOffset_", declaredType="U64")
	public UDATA _arrayletUnknownLeaves() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletUnknownLeavesOffset_));
	}

	// U64 _arrayletUnknownLeaves
	public UDATAPointer _arrayletUnknownLeavesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletUnknownLeavesOffset_));
	}

	// U64 _arrayletUnknownObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletUnknownObjectsOffset_", declaredType="U64")
	public UDATA _arrayletUnknownObjects() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__arrayletUnknownObjectsOffset_));
	}

	// U64 _arrayletUnknownObjects
	public UDATAPointer _arrayletUnknownObjectsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__arrayletUnknownObjectsOffset_));
	}

	// U64 _commonNumaNodeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__commonNumaNodeBytesOffset_", declaredType="U64")
	public UDATA _commonNumaNodeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__commonNumaNodeBytesOffset_));
	}

	// U64 _commonNumaNodeBytes
	public UDATAPointer _commonNumaNodeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__commonNumaNodeBytesOffset_));
	}

	// U64 _edenFreeHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenFreeHeapSizeOffset_", declaredType="U64")
	public UDATA _edenFreeHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__edenFreeHeapSizeOffset_));
	}

	// U64 _edenFreeHeapSize
	public UDATAPointer _edenFreeHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__edenFreeHeapSizeOffset_));
	}

	// U64 _edenHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__edenHeapSizeOffset_", declaredType="U64")
	public UDATA _edenHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__edenHeapSizeOffset_));
	}

	// U64 _edenHeapSize
	public UDATAPointer _edenHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__edenHeapSizeOffset_));
	}

	// U64 _incrementCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementCountOffset_", declaredType="U64")
	public UDATA _incrementCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__incrementCountOffset_));
	}

	// U64 _incrementCount
	public UDATAPointer _incrementCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__incrementCountOffset_));
	}

	// const U8* _incrementDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incrementDescriptionOffset_", declaredType="const U8*")
	public U8Pointer _incrementDescription() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_CollectionStatisticsVLHGC.__incrementDescriptionOffset_));
	}

	// const U8* _incrementDescription
	public PointerPointer _incrementDescriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__incrementDescriptionOffset_));
	}

	// U64 _largestPrimitiveArraylet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestPrimitiveArrayletOffset_", declaredType="U64")
	public UDATA _largestPrimitiveArraylet() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__largestPrimitiveArrayletOffset_));
	}

	// U64 _largestPrimitiveArraylet
	public UDATAPointer _largestPrimitiveArrayletEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__largestPrimitiveArrayletOffset_));
	}

	// U64 _largestReferenceArraylet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largestReferenceArrayletOffset_", declaredType="U64")
	public UDATA _largestReferenceArraylet() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__largestReferenceArrayletOffset_));
	}

	// U64 _largestReferenceArraylet
	public UDATAPointer _largestReferenceArrayletEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__largestReferenceArrayletOffset_));
	}

	// U64 _localNumaNodeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localNumaNodeBytesOffset_", declaredType="U64")
	public UDATA _localNumaNodeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__localNumaNodeBytesOffset_));
	}

	// U64 _localNumaNodeBytes
	public UDATAPointer _localNumaNodeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__localNumaNodeBytesOffset_));
	}

	// U64 _nonLocalNumaNodeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonLocalNumaNodeBytesOffset_", declaredType="U64")
	public UDATA _nonLocalNumaNodeBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__nonLocalNumaNodeBytesOffset_));
	}

	// U64 _nonLocalNumaNodeBytes
	public UDATAPointer _nonLocalNumaNodeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__nonLocalNumaNodeBytesOffset_));
	}

	// U64 _numaNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaNodesOffset_", declaredType="U64")
	public UDATA _numaNodes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__numaNodesOffset_));
	}

	// U64 _numaNodes
	public UDATAPointer _numaNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__numaNodesOffset_));
	}

	// U64 _rememberedSetBeingRebuiltRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetBeingRebuiltRegionCountOffset_", declaredType="U64")
	public UDATA _rememberedSetBeingRebuiltRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetBeingRebuiltRegionCountOffset_));
	}

	// U64 _rememberedSetBeingRebuiltRegionCount
	public UDATAPointer _rememberedSetBeingRebuiltRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetBeingRebuiltRegionCountOffset_));
	}

	// U64 _rememberedSetBytesFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetBytesFreeOffset_", declaredType="U64")
	public UDATA _rememberedSetBytesFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetBytesFreeOffset_));
	}

	// U64 _rememberedSetBytesFree
	public UDATAPointer _rememberedSetBytesFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetBytesFreeOffset_));
	}

	// U64 _rememberedSetBytesTotal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetBytesTotalOffset_", declaredType="U64")
	public UDATA _rememberedSetBytesTotal() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetBytesTotalOffset_));
	}

	// U64 _rememberedSetBytesTotal
	public UDATAPointer _rememberedSetBytesTotalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetBytesTotalOffset_));
	}

	// U64 _rememberedSetCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetCountOffset_", declaredType="U64")
	public UDATA _rememberedSetCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetCountOffset_));
	}

	// U64 _rememberedSetCount
	public UDATAPointer _rememberedSetCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetCountOffset_));
	}

	// U64 _rememberedSetOverflowedRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetOverflowedRegionCountOffset_", declaredType="U64")
	public UDATA _rememberedSetOverflowedRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetOverflowedRegionCountOffset_));
	}

	// U64 _rememberedSetOverflowedRegionCount
	public UDATAPointer _rememberedSetOverflowedRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetOverflowedRegionCountOffset_));
	}

	// U64 _rememberedSetStableRegionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetStableRegionCountOffset_", declaredType="U64")
	public UDATA _rememberedSetStableRegionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsVLHGC.__rememberedSetStableRegionCountOffset_));
	}

	// U64 _rememberedSetStableRegionCount
	public UDATAPointer _rememberedSetStableRegionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsVLHGC.__rememberedSetStableRegionCountOffset_));
	}

}
