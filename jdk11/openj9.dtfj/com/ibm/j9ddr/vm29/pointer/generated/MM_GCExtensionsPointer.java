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
 * Structure: MM_GCExtensionsPointer
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
 * The generated code will provide getters for all elements in the MM_GCExtensionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GCExtensions.class)
public class MM_GCExtensionsPointer extends MM_GCExtensionsBasePointer {

	// NULL
	public static final MM_GCExtensionsPointer NULL = new MM_GCExtensionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GCExtensionsPointer(long address) {
		super(address);
	}

	public static MM_GCExtensionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GCExtensionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GCExtensionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GCExtensionsPointer(address);
	}

	public MM_GCExtensionsPointer add(long count) {
		return MM_GCExtensionsPointer.cast(address + (MM_GCExtensions.SIZEOF * count));
	}

	public MM_GCExtensionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GCExtensionsPointer addOffset(long offset) {
		return MM_GCExtensionsPointer.cast(address + offset);
	}

	public MM_GCExtensionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GCExtensionsPointer sub(long count) {
		return MM_GCExtensionsPointer.cast(address - (MM_GCExtensions.SIZEOF * count));
	}

	public MM_GCExtensionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GCExtensionsPointer subOffset(long offset) {
		return MM_GCExtensionsPointer.cast(address - offset);
	}

	public MM_GCExtensionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GCExtensionsPointer untag(long mask) {
		return MM_GCExtensionsPointer.cast(address & ~mask);
	}

	public MM_GCExtensionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GCExtensions.SIZEOF;
	}

	// Implementation methods

	// bool _HeapManagementMXBeanBackCompatibilityEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__HeapManagementMXBeanBackCompatibilityEnabledOffset_", declaredType="bool")
	public boolean _HeapManagementMXBeanBackCompatibilityEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions.__HeapManagementMXBeanBackCompatibilityEnabledOffset_);
	}

	// bool _HeapManagementMXBeanBackCompatibilityEnabled
	public BoolPointer _HeapManagementMXBeanBackCompatibilityEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions.__HeapManagementMXBeanBackCompatibilityEnabledOffset_));
	}

	// IDATA _TLHAsyncCallbackKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__TLHAsyncCallbackKeyOffset_", declaredType="IDATA")
	public IDATA _TLHAsyncCallbackKey() throws CorruptDataException {
		return getIDATAAtOffset(MM_GCExtensions.__TLHAsyncCallbackKeyOffset_);
	}

	// IDATA _TLHAsyncCallbackKey
	public IDATAPointer _TLHAsyncCallbackKeyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_GCExtensions.__TLHAsyncCallbackKeyOffset_));
	}

	// IDATA _asyncCallbackKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__asyncCallbackKeyOffset_", declaredType="IDATA")
	public IDATA _asyncCallbackKey() throws CorruptDataException {
		return getIDATAAtOffset(MM_GCExtensions.__asyncCallbackKeyOffset_);
	}

	// IDATA _asyncCallbackKey
	public IDATAPointer _asyncCallbackKeyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_GCExtensions.__asyncCallbackKeyOffset_));
	}

	// U32 _stringTableListToTreeThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stringTableListToTreeThresholdOffset_", declaredType="U32")
	public UDATA _stringTableListToTreeThreshold() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_GCExtensions.__stringTableListToTreeThresholdOffset_));
	}

	// U32 _stringTableListToTreeThreshold
	public UDATAPointer _stringTableListToTreeThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions.__stringTableListToTreeThresholdOffset_));
	}

	// MM_ObjectAccessBarrier* accessBarrier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_accessBarrierOffset_", declaredType="MM_ObjectAccessBarrier*")
	public MM_ObjectAccessBarrierPointer accessBarrier() throws CorruptDataException {
		return MM_ObjectAccessBarrierPointer.cast(getPointerAtOffset(MM_GCExtensions._accessBarrierOffset_));
	}

	// MM_ObjectAccessBarrier* accessBarrier
	public PointerPointer accessBarrierEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._accessBarrierOffset_));
	}

	// MM_ClassLoaderManager* classLoaderManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderManagerOffset_", declaredType="MM_ClassLoaderManager*")
	public MM_ClassLoaderManagerPointer classLoaderManager() throws CorruptDataException {
		return MM_ClassLoaderManagerPointer.cast(getPointerAtOffset(MM_GCExtensions._classLoaderManagerOffset_));
	}

	// MM_ClassLoaderManager* classLoaderManager
	public PointerPointer classLoaderManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._classLoaderManagerOffset_));
	}

	// double classUnloadingAnonymousClassWeight
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classUnloadingAnonymousClassWeightOffset_", declaredType="double")
	public double classUnloadingAnonymousClassWeight() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensions._classUnloadingAnonymousClassWeightOffset_);
	}

	// double classUnloadingAnonymousClassWeight
	public DoublePointer classUnloadingAnonymousClassWeightEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensions._classUnloadingAnonymousClassWeightOffset_));
	}

	// bool collectStringConstants
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_collectStringConstantsOffset_", declaredType="bool")
	public boolean collectStringConstants() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions._collectStringConstantsOffset_);
	}

	// bool collectStringConstants
	public BoolPointer collectStringConstantsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions._collectStringConstantsOffset_));
	}

	// UDATA deadClassLoaderCacheSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deadClassLoaderCacheSizeOffset_", declaredType="UDATA")
	public UDATA deadClassLoaderCacheSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._deadClassLoaderCacheSizeOffset_);
	}

	// UDATA deadClassLoaderCacheSize
	public UDATAPointer deadClassLoaderCacheSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._deadClassLoaderCacheSizeOffset_));
	}

	// MM_GCExtensions$DynamicClassUnloading dynamicClassUnloading
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingOffset_", declaredType="MM_GCExtensions$DynamicClassUnloading")
	public long dynamicClassUnloading() throws CorruptDataException {
		if (MM_GCExtensions$DynamicClassUnloading.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensions._dynamicClassUnloadingOffset_);
		} else if (MM_GCExtensions$DynamicClassUnloading.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensions._dynamicClassUnloadingOffset_);
		} else if (MM_GCExtensions$DynamicClassUnloading.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensions._dynamicClassUnloadingOffset_);
		} else if (MM_GCExtensions$DynamicClassUnloading.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensions._dynamicClassUnloadingOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensions$DynamicClassUnloading dynamicClassUnloading
	public EnumPointer dynamicClassUnloadingEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingOffset_), MM_GCExtensions$DynamicClassUnloading.class);
	}

	// UDATA dynamicClassUnloadingKickoffThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingKickoffThresholdOffset_", declaredType="UDATA")
	public UDATA dynamicClassUnloadingKickoffThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._dynamicClassUnloadingKickoffThresholdOffset_);
	}

	// UDATA dynamicClassUnloadingKickoffThreshold
	public UDATAPointer dynamicClassUnloadingKickoffThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingKickoffThresholdOffset_));
	}

	// bool dynamicClassUnloadingKickoffThresholdForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingKickoffThresholdForcedOffset_", declaredType="bool")
	public boolean dynamicClassUnloadingKickoffThresholdForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions._dynamicClassUnloadingKickoffThresholdForcedOffset_);
	}

	// bool dynamicClassUnloadingKickoffThresholdForced
	public BoolPointer dynamicClassUnloadingKickoffThresholdForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingKickoffThresholdForcedOffset_));
	}

	// bool dynamicClassUnloadingSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingSetOffset_", declaredType="bool")
	public boolean dynamicClassUnloadingSet() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions._dynamicClassUnloadingSetOffset_);
	}

	// bool dynamicClassUnloadingSet
	public BoolPointer dynamicClassUnloadingSetEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingSetOffset_));
	}

	// UDATA dynamicClassUnloadingThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingThresholdOffset_", declaredType="UDATA")
	public UDATA dynamicClassUnloadingThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._dynamicClassUnloadingThresholdOffset_);
	}

	// UDATA dynamicClassUnloadingThreshold
	public UDATAPointer dynamicClassUnloadingThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingThresholdOffset_));
	}

	// bool dynamicClassUnloadingThresholdForced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicClassUnloadingThresholdForcedOffset_", declaredType="bool")
	public boolean dynamicClassUnloadingThresholdForced() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions._dynamicClassUnloadingThresholdForcedOffset_);
	}

	// bool dynamicClassUnloadingThresholdForced
	public BoolPointer dynamicClassUnloadingThresholdForcedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicClassUnloadingThresholdForcedOffset_));
	}

	// UDATA dynamicMaxSoftReferenceAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicMaxSoftReferenceAgeOffset_", declaredType="UDATA")
	public UDATA dynamicMaxSoftReferenceAge() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._dynamicMaxSoftReferenceAgeOffset_);
	}

	// UDATA dynamicMaxSoftReferenceAge
	public UDATAPointer dynamicMaxSoftReferenceAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._dynamicMaxSoftReferenceAgeOffset_));
	}

	// IDATA finalizeCycleInterval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeCycleIntervalOffset_", declaredType="IDATA")
	public IDATA finalizeCycleInterval() throws CorruptDataException {
		return getIDATAAtOffset(MM_GCExtensions._finalizeCycleIntervalOffset_);
	}

	// IDATA finalizeCycleInterval
	public IDATAPointer finalizeCycleIntervalEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._finalizeCycleIntervalOffset_));
	}

	// IDATA finalizeCycleLimit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeCycleLimitOffset_", declaredType="IDATA")
	public IDATA finalizeCycleLimit() throws CorruptDataException {
		return getIDATAAtOffset(MM_GCExtensions._finalizeCycleLimitOffset_);
	}

	// IDATA finalizeCycleLimit
	public IDATAPointer finalizeCycleLimitEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._finalizeCycleLimitOffset_));
	}

	// GC_FinalizeListManager* finalizeListManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeListManagerOffset_", declaredType="GC_FinalizeListManager*")
	public GC_FinalizeListManagerPointer finalizeListManager() throws CorruptDataException {
		return GC_FinalizeListManagerPointer.cast(getPointerAtOffset(MM_GCExtensions._finalizeListManagerOffset_));
	}

	// GC_FinalizeListManager* finalizeListManager
	public PointerPointer finalizeListManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._finalizeListManagerOffset_));
	}

	// UDATA finalizeMainPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeMainPriorityOffset_", declaredType="UDATA")
	public UDATA finalizeMainPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._finalizeMainPriorityOffset_);
	}

	// UDATA finalizeMainPriority
	public UDATAPointer finalizeMainPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._finalizeMainPriorityOffset_));
	}

	// UDATA finalizeWorkerPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeWorkerPriorityOffset_", declaredType="UDATA")
	public UDATA finalizeWorkerPriority() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._finalizeWorkerPriorityOffset_);
	}

	// UDATA finalizeWorkerPriority
	public UDATAPointer finalizeWorkerPriorityEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._finalizeWorkerPriorityOffset_));
	}

	// bool fvtest_forceFinalizeClassLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fvtest_forceFinalizeClassLoadersOffset_", declaredType="bool")
	public boolean fvtest_forceFinalizeClassLoaders() throws CorruptDataException {
		return getBoolAtOffset(MM_GCExtensions._fvtest_forceFinalizeClassLoadersOffset_);
	}

	// bool fvtest_forceFinalizeClassLoaders
	public BoolPointer fvtest_forceFinalizeClassLoadersEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GCExtensions._fvtest_forceFinalizeClassLoadersOffset_));
	}

	// void* gcchkExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcchkExtensionsOffset_", declaredType="void*")
	public VoidPointer gcchkExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensions._gcchkExtensionsOffset_));
	}

	// void* gcchkExtensions
	public PointerPointer gcchkExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._gcchkExtensionsOffset_));
	}

	// MM_HookInterface hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hookInterfaceOffset_", declaredType="MM_HookInterface")
	public MM_HookInterfacePointer hookInterface() throws CorruptDataException {
		return MM_HookInterfacePointer.cast(nonNullFieldEA(MM_GCExtensions._hookInterfaceOffset_));
	}

	// MM_HookInterface hookInterface
	public PointerPointer hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._hookInterfaceOffset_));
	}

	// MM_IdleGCManager* idleGCManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idleGCManagerOffset_", declaredType="MM_IdleGCManager*")
	public MM_IdleGCManagerPointer idleGCManager() throws CorruptDataException {
		return MM_IdleGCManagerPointer.cast(getPointerAtOffset(MM_GCExtensions._idleGCManagerOffset_));
	}

	// MM_IdleGCManager* idleGCManager
	public PointerPointer idleGCManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._idleGCManagerOffset_));
	}

	// double initialRAMPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialRAMPercentOffset_", declaredType="double")
	public double initialRAMPercent() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensions._initialRAMPercentOffset_);
	}

	// double initialRAMPercent
	public DoublePointer initialRAMPercentEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensions._initialRAMPercentOffset_));
	}

	// MM_MarkJavaStats markJavaStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markJavaStatsOffset_", declaredType="MM_MarkJavaStats")
	public MM_MarkJavaStatsPointer markJavaStats() throws CorruptDataException {
		return MM_MarkJavaStatsPointer.cast(nonNullFieldEA(MM_GCExtensions._markJavaStatsOffset_));
	}

	// MM_MarkJavaStats markJavaStats
	public PointerPointer markJavaStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._markJavaStatsOffset_));
	}

	// double maxRAMPercent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxRAMPercentOffset_", declaredType="double")
	public double maxRAMPercent() throws CorruptDataException {
		return getDoubleAtOffset(MM_GCExtensions._maxRAMPercentOffset_);
	}

	// double maxRAMPercent
	public DoublePointer maxRAMPercentEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_GCExtensions._maxRAMPercentOffset_));
	}

	// UDATA maxSoftReferenceAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxSoftReferenceAgeOffset_", declaredType="UDATA")
	public UDATA maxSoftReferenceAge() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._maxSoftReferenceAgeOffset_);
	}

	// UDATA maxSoftReferenceAge
	public UDATAPointer maxSoftReferenceAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._maxSoftReferenceAgeOffset_));
	}

	// MM_Wildcard* numaCommonThreadClassNamePatterns
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numaCommonThreadClassNamePatternsOffset_", declaredType="MM_Wildcard*")
	public MM_WildcardPointer numaCommonThreadClassNamePatterns() throws CorruptDataException {
		return MM_WildcardPointer.cast(getPointerAtOffset(MM_GCExtensions._numaCommonThreadClassNamePatternsOffset_));
	}

	// MM_Wildcard* numaCommonThreadClassNamePatterns
	public PointerPointer numaCommonThreadClassNamePatternsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._numaCommonThreadClassNamePatternsOffset_));
	}

	// UDATA objectListFragmentCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectListFragmentCountOffset_", declaredType="UDATA")
	public UDATA objectListFragmentCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._objectListFragmentCountOffset_);
	}

	// UDATA objectListFragmentCount
	public UDATAPointer objectListFragmentCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._objectListFragmentCountOffset_));
	}

	// MM_OwnableSynchronizerObjectList* ownableSynchronizerObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownableSynchronizerObjectListsOffset_", declaredType="MM_OwnableSynchronizerObjectList*")
	public MM_OwnableSynchronizerObjectListPointer ownableSynchronizerObjectLists() throws CorruptDataException {
		return MM_OwnableSynchronizerObjectListPointer.cast(getPointerAtOffset(MM_GCExtensions._ownableSynchronizerObjectListsOffset_));
	}

	// MM_OwnableSynchronizerObjectList* ownableSynchronizerObjectLists
	public PointerPointer ownableSynchronizerObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._ownableSynchronizerObjectListsOffset_));
	}

	// J9ReferenceArrayCopyTable referenceArrayCopyTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceArrayCopyTableOffset_", declaredType="J9ReferenceArrayCopyTable")
	public J9ReferenceArrayCopyTablePointer referenceArrayCopyTable() throws CorruptDataException {
		return J9ReferenceArrayCopyTablePointer.cast(nonNullFieldEA(MM_GCExtensions._referenceArrayCopyTableOffset_));
	}

	// J9ReferenceArrayCopyTable referenceArrayCopyTable
	public PointerPointer referenceArrayCopyTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._referenceArrayCopyTableOffset_));
	}

	// MM_ReferenceObjectList* referenceObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceObjectListsOffset_", declaredType="MM_ReferenceObjectList*")
	public MM_ReferenceObjectListPointer referenceObjectLists() throws CorruptDataException {
		return MM_ReferenceObjectListPointer.cast(getPointerAtOffset(MM_GCExtensions._referenceObjectListsOffset_));
	}

	// MM_ReferenceObjectList* referenceObjectLists
	public PointerPointer referenceObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._referenceObjectListsOffset_));
	}

	// UDATA runtimeCheckDynamicClassUnloading
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_runtimeCheckDynamicClassUnloadingOffset_", declaredType="UDATA")
	public UDATA runtimeCheckDynamicClassUnloading() throws CorruptDataException {
		return getUDATAAtOffset(MM_GCExtensions._runtimeCheckDynamicClassUnloadingOffset_);
	}

	// UDATA runtimeCheckDynamicClassUnloading
	public UDATAPointer runtimeCheckDynamicClassUnloadingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._runtimeCheckDynamicClassUnloadingOffset_));
	}

	// MM_ScavengerJavaStats scavengerJavaStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scavengerJavaStatsOffset_", declaredType="MM_ScavengerJavaStats")
	public MM_ScavengerJavaStatsPointer scavengerJavaStats() throws CorruptDataException {
		return MM_ScavengerJavaStatsPointer.cast(nonNullFieldEA(MM_GCExtensions._scavengerJavaStatsOffset_));
	}

	// MM_ScavengerJavaStats scavengerJavaStats
	public PointerPointer scavengerJavaStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._scavengerJavaStatsOffset_));
	}

	// MM_GCExtensions$JitStringDeDupPolicy stringDedupPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringDedupPolicyOffset_", declaredType="MM_GCExtensions$JitStringDeDupPolicy")
	public long stringDedupPolicy() throws CorruptDataException {
		if (MM_GCExtensions$JitStringDeDupPolicy.SIZEOF == 1) {
			return getByteAtOffset(MM_GCExtensions._stringDedupPolicyOffset_);
		} else if (MM_GCExtensions$JitStringDeDupPolicy.SIZEOF == 2) {
			return getShortAtOffset(MM_GCExtensions._stringDedupPolicyOffset_);
		} else if (MM_GCExtensions$JitStringDeDupPolicy.SIZEOF == 4) {
			return getIntAtOffset(MM_GCExtensions._stringDedupPolicyOffset_);
		} else if (MM_GCExtensions$JitStringDeDupPolicy.SIZEOF == 8) {
			return getLongAtOffset(MM_GCExtensions._stringDedupPolicyOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCExtensions$JitStringDeDupPolicy stringDedupPolicy
	public EnumPointer stringDedupPolicyEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_GCExtensions._stringDedupPolicyOffset_), MM_GCExtensions$JitStringDeDupPolicy.class);
	}

	// MM_StringTable* stringTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringTableOffset_", declaredType="MM_StringTable*")
	public MM_StringTablePointer stringTable() throws CorruptDataException {
		return MM_StringTablePointer.cast(getPointerAtOffset(MM_GCExtensions._stringTableOffset_));
	}

	// MM_StringTable* stringTable
	public PointerPointer stringTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._stringTableOffset_));
	}

	// void* tgcExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tgcExtensionsOffset_", declaredType="void*")
	public VoidPointer tgcExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_GCExtensions._tgcExtensionsOffset_));
	}

	// void* tgcExtensions
	public PointerPointer tgcExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._tgcExtensionsOffset_));
	}

	// MM_UnfinalizedObjectList* unfinalizedObjectLists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unfinalizedObjectListsOffset_", declaredType="MM_UnfinalizedObjectList*")
	public MM_UnfinalizedObjectListPointer unfinalizedObjectLists() throws CorruptDataException {
		return MM_UnfinalizedObjectListPointer.cast(getPointerAtOffset(MM_GCExtensions._unfinalizedObjectListsOffset_));
	}

	// MM_UnfinalizedObjectList* unfinalizedObjectLists
	public PointerPointer unfinalizedObjectListsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._unfinalizedObjectListsOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userSpecifiedParameters$_XmnOffset_", declaredType="MM_UserSpecifiedParameterUDATA")
	public MM_UserSpecifiedParameterUDATAPointer userSpecifiedParameters$_Xmn() throws CorruptDataException {
		return MM_UserSpecifiedParameterUDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmn
	public PointerPointer userSpecifiedParameters$_XmnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmns
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userSpecifiedParameters$_XmnsOffset_", declaredType="MM_UserSpecifiedParameterUDATA")
	public MM_UserSpecifiedParameterUDATAPointer userSpecifiedParameters$_Xmns() throws CorruptDataException {
		return MM_UserSpecifiedParameterUDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnsOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmns
	public PointerPointer userSpecifiedParameters$_XmnsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnsOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmnx
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userSpecifiedParameters$_XmnxOffset_", declaredType="MM_UserSpecifiedParameterUDATA")
	public MM_UserSpecifiedParameterUDATAPointer userSpecifiedParameters$_Xmnx() throws CorruptDataException {
		return MM_UserSpecifiedParameterUDATAPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnxOffset_));
	}

	// MM_UserSpecifiedParameterUDATA userSpecifiedParameters._Xmnx
	public PointerPointer userSpecifiedParameters$_XmnxEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._userSpecifiedParameters$_XmnxOffset_));
	}

	// J9MemoryManagerVerboseInterface verboseFunctionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_verboseFunctionTableOffset_", declaredType="J9MemoryManagerVerboseInterface")
	public J9MemoryManagerVerboseInterfacePointer verboseFunctionTable() throws CorruptDataException {
		return J9MemoryManagerVerboseInterfacePointer.cast(nonNullFieldEA(MM_GCExtensions._verboseFunctionTableOffset_));
	}

	// J9MemoryManagerVerboseInterface verboseFunctionTable
	public PointerPointer verboseFunctionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GCExtensions._verboseFunctionTableOffset_));
	}

}
