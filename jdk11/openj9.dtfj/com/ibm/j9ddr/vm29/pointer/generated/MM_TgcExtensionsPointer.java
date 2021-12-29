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
 * Structure: MM_TgcExtensionsPointer
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
 * The generated code will provide getters for all elements in the MM_TgcExtensionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_TgcExtensions.class)
public class MM_TgcExtensionsPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_TgcExtensionsPointer NULL = new MM_TgcExtensionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_TgcExtensionsPointer(long address) {
		super(address);
	}

	public static MM_TgcExtensionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_TgcExtensionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_TgcExtensionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_TgcExtensionsPointer(address);
	}

	public MM_TgcExtensionsPointer add(long count) {
		return MM_TgcExtensionsPointer.cast(address + (MM_TgcExtensions.SIZEOF * count));
	}

	public MM_TgcExtensionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_TgcExtensionsPointer addOffset(long offset) {
		return MM_TgcExtensionsPointer.cast(address + offset);
	}

	public MM_TgcExtensionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_TgcExtensionsPointer sub(long count) {
		return MM_TgcExtensionsPointer.cast(address - (MM_TgcExtensions.SIZEOF * count));
	}

	public MM_TgcExtensionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_TgcExtensionsPointer subOffset(long offset) {
		return MM_TgcExtensionsPointer.cast(address - offset);
	}

	public MM_TgcExtensionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_TgcExtensionsPointer untag(long mask) {
		return MM_TgcExtensionsPointer.cast(address & ~mask);
	}

	public MM_TgcExtensionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_TgcExtensions.SIZEOF;
	}

	// Implementation methods

	// bool _allocationContextRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationContextRequestedOffset_", declaredType="bool")
	public boolean _allocationContextRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__allocationContextRequestedOffset_);
	}

	// bool _allocationContextRequested
	public BoolPointer _allocationContextRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__allocationContextRequestedOffset_));
	}

	// bool _allocationRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationRequestedOffset_", declaredType="bool")
	public boolean _allocationRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__allocationRequestedOffset_);
	}

	// bool _allocationRequested
	public BoolPointer _allocationRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__allocationRequestedOffset_));
	}

	// TgcBacktraceExtensions _backtrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backtraceOffset_", declaredType="TgcBacktraceExtensions")
	public TgcBacktraceExtensionsPointer _backtrace() throws CorruptDataException {
		return TgcBacktraceExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__backtraceOffset_));
	}

	// TgcBacktraceExtensions _backtrace
	public PointerPointer _backtraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__backtraceOffset_));
	}

	// bool _backtraceRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backtraceRequestedOffset_", declaredType="bool")
	public boolean _backtraceRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__backtraceRequestedOffset_);
	}

	// bool _backtraceRequested
	public BoolPointer _backtraceRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__backtraceRequestedOffset_));
	}

	// TgcConcurrentCardCleaningExtensions _cardCleaning
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningOffset_", declaredType="TgcConcurrentCardCleaningExtensions")
	public TgcConcurrentCardCleaningExtensionsPointer _cardCleaning() throws CorruptDataException {
		return TgcConcurrentCardCleaningExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__cardCleaningOffset_));
	}

	// TgcConcurrentCardCleaningExtensions _cardCleaning
	public PointerPointer _cardCleaningEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__cardCleaningOffset_));
	}

	// bool _cardCleaningRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cardCleaningRequestedOffset_", declaredType="bool")
	public boolean _cardCleaningRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__cardCleaningRequestedOffset_);
	}

	// bool _cardCleaningRequested
	public BoolPointer _cardCleaningRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__cardCleaningRequestedOffset_));
	}

	// TgcCompactionExtensions _compaction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactionOffset_", declaredType="TgcCompactionExtensions")
	public TgcCompactionExtensionsPointer _compaction() throws CorruptDataException {
		return TgcCompactionExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__compactionOffset_));
	}

	// TgcCompactionExtensions _compaction
	public PointerPointer _compactionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__compactionOffset_));
	}

	// bool _compactionRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactionRequestedOffset_", declaredType="bool")
	public boolean _compactionRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__compactionRequestedOffset_);
	}

	// bool _compactionRequested
	public BoolPointer _compactionRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__compactionRequestedOffset_));
	}

	// TgcConcurrentExtensions _concurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentOffset_", declaredType="TgcConcurrentExtensions")
	public TgcConcurrentExtensionsPointer _concurrent() throws CorruptDataException {
		return TgcConcurrentExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__concurrentOffset_));
	}

	// TgcConcurrentExtensions _concurrent
	public PointerPointer _concurrentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__concurrentOffset_));
	}

	// bool _concurrentRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentRequestedOffset_", declaredType="bool")
	public boolean _concurrentRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__concurrentRequestedOffset_);
	}

	// bool _concurrentRequested
	public BoolPointer _concurrentRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__concurrentRequestedOffset_));
	}

	// bool _copyForwardRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__copyForwardRequestedOffset_", declaredType="bool")
	public boolean _copyForwardRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__copyForwardRequestedOffset_);
	}

	// bool _copyForwardRequested
	public BoolPointer _copyForwardRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__copyForwardRequestedOffset_));
	}

	// TgcDumpExtensions _dump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dumpOffset_", declaredType="TgcDumpExtensions")
	public TgcDumpExtensionsPointer _dump() throws CorruptDataException {
		return TgcDumpExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__dumpOffset_));
	}

	// TgcDumpExtensions _dump
	public PointerPointer _dumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__dumpOffset_));
	}

	// bool _dumpRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dumpRequestedOffset_", declaredType="bool")
	public boolean _dumpRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__dumpRequestedOffset_);
	}

	// bool _dumpRequested
	public BoolPointer _dumpRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__dumpRequestedOffset_));
	}

	// void* _dynamicCollectionSetData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicCollectionSetDataOffset_", declaredType="void*")
	public VoidPointer _dynamicCollectionSetData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_TgcExtensions.__dynamicCollectionSetDataOffset_));
	}

	// void* _dynamicCollectionSetData
	public PointerPointer _dynamicCollectionSetDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__dynamicCollectionSetDataOffset_));
	}

	// bool _dynamicCollectionSetRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicCollectionSetRequestedOffset_", declaredType="bool")
	public boolean _dynamicCollectionSetRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__dynamicCollectionSetRequestedOffset_);
	}

	// bool _dynamicCollectionSetRequested
	public BoolPointer _dynamicCollectionSetRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__dynamicCollectionSetRequestedOffset_));
	}

	// TgcExcessiveGCExtensions _excessiveGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__excessiveGCOffset_", declaredType="TgcExcessiveGCExtensions")
	public TgcExcessiveGCExtensionsPointer _excessiveGC() throws CorruptDataException {
		return TgcExcessiveGCExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__excessiveGCOffset_));
	}

	// TgcExcessiveGCExtensions _excessiveGC
	public PointerPointer _excessiveGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__excessiveGCOffset_));
	}

	// bool _excessiveGCRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__excessiveGCRequestedOffset_", declaredType="bool")
	public boolean _excessiveGCRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__excessiveGCRequestedOffset_);
	}

	// bool _excessiveGCRequested
	public BoolPointer _excessiveGCRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__excessiveGCRequestedOffset_));
	}

	// TgcExclusiveAccessExtensions _exclusiveAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessOffset_", declaredType="TgcExclusiveAccessExtensions")
	public TgcExclusiveAccessExtensionsPointer _exclusiveAccess() throws CorruptDataException {
		return TgcExclusiveAccessExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__exclusiveAccessOffset_));
	}

	// TgcExclusiveAccessExtensions _exclusiveAccess
	public PointerPointer _exclusiveAccessEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__exclusiveAccessOffset_));
	}

	// bool _exclusiveAccessRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessRequestedOffset_", declaredType="bool")
	public boolean _exclusiveAccessRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__exclusiveAccessRequestedOffset_);
	}

	// bool _exclusiveAccessRequested
	public BoolPointer _exclusiveAccessRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__exclusiveAccessRequestedOffset_));
	}

	// TgcFreeListExtensions _freeList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListOffset_", declaredType="TgcFreeListExtensions")
	public TgcFreeListExtensionsPointer _freeList() throws CorruptDataException {
		return TgcFreeListExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__freeListOffset_));
	}

	// TgcFreeListExtensions _freeList
	public PointerPointer _freeListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__freeListOffset_));
	}

	// bool _freeListRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListRequestedOffset_", declaredType="bool")
	public boolean _freeListRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__freeListRequestedOffset_);
	}

	// bool _freeListRequested
	public BoolPointer _freeListRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__freeListRequestedOffset_));
	}

	// bool _freeListSummaryRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeListSummaryRequestedOffset_", declaredType="bool")
	public boolean _freeListSummaryRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__freeListSummaryRequestedOffset_);
	}

	// bool _freeListSummaryRequested
	public BoolPointer _freeListSummaryRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__freeListSummaryRequestedOffset_));
	}

	// bool _heapRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapRequestedOffset_", declaredType="bool")
	public boolean _heapRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__heapRequestedOffset_);
	}

	// bool _heapRequested
	public BoolPointer _heapRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__heapRequestedOffset_));
	}

	// bool _intelligentCompactRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__intelligentCompactRequestedOffset_", declaredType="bool")
	public boolean _intelligentCompactRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__intelligentCompactRequestedOffset_);
	}

	// bool _intelligentCompactRequested
	public BoolPointer _intelligentCompactRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__intelligentCompactRequestedOffset_));
	}

	// bool _interRegionReferencesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionReferencesRequestedOffset_", declaredType="bool")
	public boolean _interRegionReferencesRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__interRegionReferencesRequestedOffset_);
	}

	// bool _interRegionReferencesRequested
	public BoolPointer _interRegionReferencesRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__interRegionReferencesRequestedOffset_));
	}

	// TgcInterRegionRememberedSetDemographicsExtension _interRegionRememberedSetDemographics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetDemographicsOffset_", declaredType="TgcInterRegionRememberedSetDemographicsExtension")
	public TgcInterRegionRememberedSetDemographicsExtensionPointer _interRegionRememberedSetDemographics() throws CorruptDataException {
		return TgcInterRegionRememberedSetDemographicsExtensionPointer.cast(nonNullFieldEA(MM_TgcExtensions.__interRegionRememberedSetDemographicsOffset_));
	}

	// TgcInterRegionRememberedSetDemographicsExtension _interRegionRememberedSetDemographics
	public PointerPointer _interRegionRememberedSetDemographicsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__interRegionRememberedSetDemographicsOffset_));
	}

	// bool _interRegionRememberedSetDemographicsRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetDemographicsRequestedOffset_", declaredType="bool")
	public boolean _interRegionRememberedSetDemographicsRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__interRegionRememberedSetDemographicsRequestedOffset_);
	}

	// bool _interRegionRememberedSetDemographicsRequested
	public BoolPointer _interRegionRememberedSetDemographicsRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__interRegionRememberedSetDemographicsRequestedOffset_));
	}

	// bool _interRegionRememberedSetRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interRegionRememberedSetRequestedOffset_", declaredType="bool")
	public boolean _interRegionRememberedSetRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__interRegionRememberedSetRequestedOffset_);
	}

	// bool _interRegionRememberedSetRequested
	public BoolPointer _interRegionRememberedSetRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__interRegionRememberedSetRequestedOffset_));
	}

	// bool _largeAllocationRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeAllocationRequestedOffset_", declaredType="bool")
	public boolean _largeAllocationRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__largeAllocationRequestedOffset_);
	}

	// bool _largeAllocationRequested
	public BoolPointer _largeAllocationRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__largeAllocationRequestedOffset_));
	}

	// bool _largeAllocationVerboseRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__largeAllocationVerboseRequestedOffset_", declaredType="bool")
	public boolean _largeAllocationVerboseRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__largeAllocationVerboseRequestedOffset_);
	}

	// bool _largeAllocationVerboseRequested
	public BoolPointer _largeAllocationVerboseRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__largeAllocationVerboseRequestedOffset_));
	}

	// TgcNumaExtensions _numa
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaOffset_", declaredType="TgcNumaExtensions")
	public TgcNumaExtensionsPointer _numa() throws CorruptDataException {
		return TgcNumaExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__numaOffset_));
	}

	// TgcNumaExtensions _numa
	public PointerPointer _numaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__numaOffset_));
	}

	// bool _numaRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numaRequestedOffset_", declaredType="bool")
	public boolean _numaRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__numaRequestedOffset_);
	}

	// bool _numaRequested
	public BoolPointer _numaRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__numaRequestedOffset_));
	}

	// IDATA _outputFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__outputFileOffset_", declaredType="IDATA")
	public IDATA _outputFile() throws CorruptDataException {
		return getIDATAAtOffset(MM_TgcExtensions.__outputFileOffset_);
	}

	// IDATA _outputFile
	public IDATAPointer _outputFileEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_TgcExtensions.__outputFileOffset_));
	}

	// TgcParallelExtensions _parallel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parallelOffset_", declaredType="TgcParallelExtensions")
	public TgcParallelExtensionsPointer _parallel() throws CorruptDataException {
		return TgcParallelExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__parallelOffset_));
	}

	// TgcParallelExtensions _parallel
	public PointerPointer _parallelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__parallelOffset_));
	}

	// bool _parallelRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__parallelRequestedOffset_", declaredType="bool")
	public boolean _parallelRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__parallelRequestedOffset_);
	}

	// bool _parallelRequested
	public BoolPointer _parallelRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__parallelRequestedOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(MM_TgcExtensions.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__portLibraryOffset_));
	}

	// bool _projectedStatsRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__projectedStatsRequestedOffset_", declaredType="bool")
	public boolean _projectedStatsRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__projectedStatsRequestedOffset_);
	}

	// bool _projectedStatsRequested
	public BoolPointer _projectedStatsRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__projectedStatsRequestedOffset_));
	}

	// bool _rootScannerRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootScannerRequestedOffset_", declaredType="bool")
	public boolean _rootScannerRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__rootScannerRequestedOffset_);
	}

	// bool _rootScannerRequested
	public BoolPointer _rootScannerRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__rootScannerRequestedOffset_));
	}

	// U8* _rsclDistinctFlagArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rsclDistinctFlagArrayOffset_", declaredType="U8*")
	public U8Pointer _rsclDistinctFlagArray() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_TgcExtensions.__rsclDistinctFlagArrayOffset_));
	}

	// U8* _rsclDistinctFlagArray
	public PointerPointer _rsclDistinctFlagArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__rsclDistinctFlagArrayOffset_));
	}

	// TgcScavengerExtensions _scavenger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerOffset_", declaredType="TgcScavengerExtensions")
	public TgcScavengerExtensionsPointer _scavenger() throws CorruptDataException {
		return TgcScavengerExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__scavengerOffset_));
	}

	// TgcScavengerExtensions _scavenger
	public PointerPointer _scavengerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__scavengerOffset_));
	}

	// bool _scavengerMemoryStatsRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerMemoryStatsRequestedOffset_", declaredType="bool")
	public boolean _scavengerMemoryStatsRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__scavengerMemoryStatsRequestedOffset_);
	}

	// bool _scavengerMemoryStatsRequested
	public BoolPointer _scavengerMemoryStatsRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__scavengerMemoryStatsRequestedOffset_));
	}

	// bool _scavengerRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerRequestedOffset_", declaredType="bool")
	public boolean _scavengerRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__scavengerRequestedOffset_);
	}

	// bool _scavengerRequested
	public BoolPointer _scavengerRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__scavengerRequestedOffset_));
	}

	// bool _scavengerSurvivalStatsRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerSurvivalStatsRequestedOffset_", declaredType="bool")
	public boolean _scavengerSurvivalStatsRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__scavengerSurvivalStatsRequestedOffset_);
	}

	// bool _scavengerSurvivalStatsRequested
	public BoolPointer _scavengerSurvivalStatsRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__scavengerSurvivalStatsRequestedOffset_));
	}

	// bool _sizeClassesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassesRequestedOffset_", declaredType="bool")
	public boolean _sizeClassesRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__sizeClassesRequestedOffset_);
	}

	// bool _sizeClassesRequested
	public BoolPointer _sizeClassesRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__sizeClassesRequestedOffset_));
	}

	// TgcTerseExtensions _terse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__terseOffset_", declaredType="TgcTerseExtensions")
	public TgcTerseExtensionsPointer _terse() throws CorruptDataException {
		return TgcTerseExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__terseOffset_));
	}

	// TgcTerseExtensions _terse
	public PointerPointer _terseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__terseOffset_));
	}

	// bool _terseRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__terseRequestedOffset_", declaredType="bool")
	public boolean _terseRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__terseRequestedOffset_);
	}

	// bool _terseRequested
	public BoolPointer _terseRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__terseRequestedOffset_));
	}

	// bool _writeOnceCompactTimingRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeOnceCompactTimingRequestedOffset_", declaredType="bool")
	public boolean _writeOnceCompactTimingRequested() throws CorruptDataException {
		return getBoolAtOffset(MM_TgcExtensions.__writeOnceCompactTimingRequestedOffset_);
	}

	// bool _writeOnceCompactTimingRequested
	public BoolPointer _writeOnceCompactTimingRequestedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TgcExtensions.__writeOnceCompactTimingRequestedOffset_));
	}

	// TgcWriteOnceCompactionExtensions _writeOnceCompaction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeOnceCompactionOffset_", declaredType="TgcWriteOnceCompactionExtensions")
	public TgcWriteOnceCompactionExtensionsPointer _writeOnceCompaction() throws CorruptDataException {
		return TgcWriteOnceCompactionExtensionsPointer.cast(nonNullFieldEA(MM_TgcExtensions.__writeOnceCompactionOffset_));
	}

	// TgcWriteOnceCompactionExtensions _writeOnceCompaction
	public PointerPointer _writeOnceCompactionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TgcExtensions.__writeOnceCompactionOffset_));
	}

}
