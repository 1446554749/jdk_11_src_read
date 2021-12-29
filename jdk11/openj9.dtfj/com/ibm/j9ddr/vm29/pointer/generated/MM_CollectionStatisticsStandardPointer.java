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
 * Structure: MM_CollectionStatisticsStandardPointer
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
 * The generated code will provide getters for all elements in the MM_CollectionStatisticsStandardPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_CollectionStatisticsStandard.class)
public class MM_CollectionStatisticsStandardPointer extends MM_CollectionStatisticsPointer {

	// NULL
	public static final MM_CollectionStatisticsStandardPointer NULL = new MM_CollectionStatisticsStandardPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CollectionStatisticsStandardPointer(long address) {
		super(address);
	}

	public static MM_CollectionStatisticsStandardPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CollectionStatisticsStandardPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CollectionStatisticsStandardPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CollectionStatisticsStandardPointer(address);
	}

	public MM_CollectionStatisticsStandardPointer add(long count) {
		return MM_CollectionStatisticsStandardPointer.cast(address + (MM_CollectionStatisticsStandard.SIZEOF * count));
	}

	public MM_CollectionStatisticsStandardPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CollectionStatisticsStandardPointer addOffset(long offset) {
		return MM_CollectionStatisticsStandardPointer.cast(address + offset);
	}

	public MM_CollectionStatisticsStandardPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CollectionStatisticsStandardPointer sub(long count) {
		return MM_CollectionStatisticsStandardPointer.cast(address - (MM_CollectionStatisticsStandard.SIZEOF * count));
	}

	public MM_CollectionStatisticsStandardPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CollectionStatisticsStandardPointer subOffset(long offset) {
		return MM_CollectionStatisticsStandardPointer.cast(address - offset);
	}

	public MM_CollectionStatisticsStandardPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CollectionStatisticsStandardPointer untag(long mask) {
		return MM_CollectionStatisticsStandardPointer.cast(address & ~mask);
	}

	public MM_CollectionStatisticsStandardPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_CollectionStatisticsStandard.SIZEOF;
	}

	// Implementation methods

	// bool _loaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaEnabledOffset_", declaredType="bool")
	public boolean _loaEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CollectionStatisticsStandard.__loaEnabledOffset_);
	}

	// bool _loaEnabled
	public BoolPointer _loaEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__loaEnabledOffset_));
	}

	// U64 _macroFragmentedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__macroFragmentedSizeOffset_", declaredType="U64")
	public UDATA _macroFragmentedSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__macroFragmentedSizeOffset_));
	}

	// U64 _macroFragmentedSize
	public UDATAPointer _macroFragmentedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__macroFragmentedSizeOffset_));
	}

	// U64 _microFragmentedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__microFragmentedSizeOffset_", declaredType="U64")
	public UDATA _microFragmentedSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__microFragmentedSizeOffset_));
	}

	// U64 _microFragmentedSize
	public UDATAPointer _microFragmentedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__microFragmentedSizeOffset_));
	}

	// U64 _rememberedSetCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetCountOffset_", declaredType="U64")
	public UDATA _rememberedSetCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__rememberedSetCountOffset_));
	}

	// U64 _rememberedSetCount
	public UDATAPointer _rememberedSetCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__rememberedSetCountOffset_));
	}

	// bool _scavengerEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerEnabledOffset_", declaredType="bool")
	public boolean _scavengerEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_CollectionStatisticsStandard.__scavengerEnabledOffset_);
	}

	// bool _scavengerEnabled
	public BoolPointer _scavengerEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__scavengerEnabledOffset_));
	}

	// U32 _tenureFragmentation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureFragmentationOffset_", declaredType="U32")
	public UDATA _tenureFragmentation() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_CollectionStatisticsStandard.__tenureFragmentationOffset_));
	}

	// U32 _tenureFragmentation
	public UDATAPointer _tenureFragmentationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__tenureFragmentationOffset_));
	}

	// U64 _totalFreeLOAHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalFreeLOAHeapSizeOffset_", declaredType="U64")
	public UDATA _totalFreeLOAHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalFreeLOAHeapSizeOffset_));
	}

	// U64 _totalFreeLOAHeapSize
	public UDATAPointer _totalFreeLOAHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalFreeLOAHeapSizeOffset_));
	}

	// U64 _totalFreeNurseryHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalFreeNurseryHeapSizeOffset_", declaredType="U64")
	public UDATA _totalFreeNurseryHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalFreeNurseryHeapSizeOffset_));
	}

	// U64 _totalFreeNurseryHeapSize
	public UDATAPointer _totalFreeNurseryHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalFreeNurseryHeapSizeOffset_));
	}

	// U64 _totalFreeSurvivorHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalFreeSurvivorHeapSizeOffset_", declaredType="U64")
	public UDATA _totalFreeSurvivorHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalFreeSurvivorHeapSizeOffset_));
	}

	// U64 _totalFreeSurvivorHeapSize
	public UDATAPointer _totalFreeSurvivorHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalFreeSurvivorHeapSizeOffset_));
	}

	// U64 _totalFreeTenureHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalFreeTenureHeapSizeOffset_", declaredType="U64")
	public UDATA _totalFreeTenureHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalFreeTenureHeapSizeOffset_));
	}

	// U64 _totalFreeTenureHeapSize
	public UDATAPointer _totalFreeTenureHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalFreeTenureHeapSizeOffset_));
	}

	// U64 _totalLOAHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalLOAHeapSizeOffset_", declaredType="U64")
	public UDATA _totalLOAHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalLOAHeapSizeOffset_));
	}

	// U64 _totalLOAHeapSize
	public UDATAPointer _totalLOAHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalLOAHeapSizeOffset_));
	}

	// U64 _totalNurseryHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalNurseryHeapSizeOffset_", declaredType="U64")
	public UDATA _totalNurseryHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalNurseryHeapSizeOffset_));
	}

	// U64 _totalNurseryHeapSize
	public UDATAPointer _totalNurseryHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalNurseryHeapSizeOffset_));
	}

	// U64 _totalSurvivorHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalSurvivorHeapSizeOffset_", declaredType="U64")
	public UDATA _totalSurvivorHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalSurvivorHeapSizeOffset_));
	}

	// U64 _totalSurvivorHeapSize
	public UDATAPointer _totalSurvivorHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalSurvivorHeapSizeOffset_));
	}

	// U64 _totalTenureHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalTenureHeapSizeOffset_", declaredType="U64")
	public UDATA _totalTenureHeapSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_CollectionStatisticsStandard.__totalTenureHeapSizeOffset_));
	}

	// U64 _totalTenureHeapSize
	public UDATAPointer _totalTenureHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_CollectionStatisticsStandard.__totalTenureHeapSizeOffset_));
	}

}
