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
 * Structure: MM_EnvironmentStandardPointer
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
 * The generated code will provide getters for all elements in the MM_EnvironmentStandardPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_EnvironmentStandard.class)
public class MM_EnvironmentStandardPointer extends MM_EnvironmentBasePointer {

	// NULL
	public static final MM_EnvironmentStandardPointer NULL = new MM_EnvironmentStandardPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_EnvironmentStandardPointer(long address) {
		super(address);
	}

	public static MM_EnvironmentStandardPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_EnvironmentStandardPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_EnvironmentStandardPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_EnvironmentStandardPointer(address);
	}

	public MM_EnvironmentStandardPointer add(long count) {
		return MM_EnvironmentStandardPointer.cast(address + (MM_EnvironmentStandard.SIZEOF * count));
	}

	public MM_EnvironmentStandardPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_EnvironmentStandardPointer addOffset(long offset) {
		return MM_EnvironmentStandardPointer.cast(address + offset);
	}

	public MM_EnvironmentStandardPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_EnvironmentStandardPointer sub(long count) {
		return MM_EnvironmentStandardPointer.cast(address - (MM_EnvironmentStandard.SIZEOF * count));
	}

	public MM_EnvironmentStandardPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_EnvironmentStandardPointer subOffset(long offset) {
		return MM_EnvironmentStandardPointer.cast(address - offset);
	}

	public MM_EnvironmentStandardPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_EnvironmentStandardPointer untag(long mask) {
		return MM_EnvironmentStandardPointer.cast(address & ~mask);
	}

	public MM_EnvironmentStandardPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_EnvironmentStandard.SIZEOF;
	}

	// Implementation methods

	// MM_CopyScanCacheStandard* _deferredCopyCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredCopyCacheOffset_", declaredType="MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _deferredCopyCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__deferredCopyCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _deferredCopyCache
	public PointerPointer _deferredCopyCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__deferredCopyCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _deferredScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredScanCacheOffset_", declaredType="MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _deferredScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__deferredScanCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _deferredScanCache
	public PointerPointer _deferredScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__deferredScanCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _effectiveCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__effectiveCopyScanCacheOffset_", declaredType="MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _effectiveCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__effectiveCopyScanCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _effectiveCopyScanCache
	public PointerPointer _effectiveCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__effectiveCopyScanCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveDeferredCopyCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inactiveDeferredCopyCacheOffset_", declaredType="volatile MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _inactiveDeferredCopyCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__inactiveDeferredCopyCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveDeferredCopyCache
	public PointerPointer _inactiveDeferredCopyCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__inactiveDeferredCopyCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveSurvivorCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inactiveSurvivorCopyScanCacheOffset_", declaredType="volatile MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _inactiveSurvivorCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__inactiveSurvivorCopyScanCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveSurvivorCopyScanCache
	public PointerPointer _inactiveSurvivorCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__inactiveSurvivorCopyScanCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveTenureCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inactiveTenureCopyScanCacheOffset_", declaredType="volatile MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _inactiveTenureCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__inactiveTenureCopyScanCacheOffset_));
	}

	// volatile MM_CopyScanCacheStandard* _inactiveTenureCopyScanCache
	public PointerPointer _inactiveTenureCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__inactiveTenureCopyScanCacheOffset_));
	}

	// bool _loaAllocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaAllocationOffset_", declaredType="bool")
	public boolean _loaAllocation() throws CorruptDataException {
		return getBoolAtOffset(MM_EnvironmentStandard.__loaAllocationOffset_);
	}

	// bool _loaAllocation
	public BoolPointer _loaAllocationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__loaAllocationOffset_));
	}

	// J9VMGC_SublistFragment _scavengerRememberedSet
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerRememberedSetOffset_", declaredType="J9VMGC_SublistFragment")
	public J9VMGC_SublistFragmentPointer _scavengerRememberedSet() throws CorruptDataException {
		return J9VMGC_SublistFragmentPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__scavengerRememberedSetOffset_));
	}

	// J9VMGC_SublistFragment _scavengerRememberedSet
	public PointerPointer _scavengerRememberedSetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__scavengerRememberedSetOffset_));
	}

	// MM_CopyScanCacheStandard* _survivorCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorCopyScanCacheOffset_", declaredType="MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _survivorCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__survivorCopyScanCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _survivorCopyScanCache
	public PointerPointer _survivorCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__survivorCopyScanCacheOffset_));
	}

	// void* _survivorTLHRemainderBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorTLHRemainderBaseOffset_", declaredType="void*")
	public VoidPointer _survivorTLHRemainderBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__survivorTLHRemainderBaseOffset_));
	}

	// void* _survivorTLHRemainderBase
	public PointerPointer _survivorTLHRemainderBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__survivorTLHRemainderBaseOffset_));
	}

	// void* _survivorTLHRemainderTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__survivorTLHRemainderTopOffset_", declaredType="void*")
	public VoidPointer _survivorTLHRemainderTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__survivorTLHRemainderTopOffset_));
	}

	// void* _survivorTLHRemainderTop
	public PointerPointer _survivorTLHRemainderTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__survivorTLHRemainderTopOffset_));
	}

	// MM_CopyScanCacheStandard* _tenureCopyScanCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureCopyScanCacheOffset_", declaredType="MM_CopyScanCacheStandard*")
	public MM_CopyScanCacheStandardPointer _tenureCopyScanCache() throws CorruptDataException {
		return MM_CopyScanCacheStandardPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__tenureCopyScanCacheOffset_));
	}

	// MM_CopyScanCacheStandard* _tenureCopyScanCache
	public PointerPointer _tenureCopyScanCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__tenureCopyScanCacheOffset_));
	}

	// void* _tenureTLHRemainderBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureTLHRemainderBaseOffset_", declaredType="void*")
	public VoidPointer _tenureTLHRemainderBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__tenureTLHRemainderBaseOffset_));
	}

	// void* _tenureTLHRemainderBase
	public PointerPointer _tenureTLHRemainderBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__tenureTLHRemainderBaseOffset_));
	}

	// void* _tenureTLHRemainderTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureTLHRemainderTopOffset_", declaredType="void*")
	public VoidPointer _tenureTLHRemainderTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_EnvironmentStandard.__tenureTLHRemainderTopOffset_));
	}

	// void* _tenureTLHRemainderTop
	public PointerPointer _tenureTLHRemainderTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_EnvironmentStandard.__tenureTLHRemainderTopOffset_));
	}

}
