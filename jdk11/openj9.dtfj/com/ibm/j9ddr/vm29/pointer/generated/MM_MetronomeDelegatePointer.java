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
 * Structure: MM_MetronomeDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_MetronomeDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MetronomeDelegate.class)
public class MM_MetronomeDelegatePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_MetronomeDelegatePointer NULL = new MM_MetronomeDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MetronomeDelegatePointer(long address) {
		super(address);
	}

	public static MM_MetronomeDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MetronomeDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MetronomeDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MetronomeDelegatePointer(address);
	}

	public MM_MetronomeDelegatePointer add(long count) {
		return MM_MetronomeDelegatePointer.cast(address + (MM_MetronomeDelegate.SIZEOF * count));
	}

	public MM_MetronomeDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MetronomeDelegatePointer addOffset(long offset) {
		return MM_MetronomeDelegatePointer.cast(address + offset);
	}

	public MM_MetronomeDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MetronomeDelegatePointer sub(long count) {
		return MM_MetronomeDelegatePointer.cast(address - (MM_MetronomeDelegate.SIZEOF * count));
	}

	public MM_MetronomeDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MetronomeDelegatePointer subOffset(long offset) {
		return MM_MetronomeDelegatePointer.cast(address - offset);
	}

	public MM_MetronomeDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MetronomeDelegatePointer untag(long mask) {
		return MM_MetronomeDelegatePointer.cast(address & ~mask);
	}

	public MM_MetronomeDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MetronomeDelegate.SIZEOF;
	}

	// Implementation methods

	// bool _dynamicClassUnloadingEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicClassUnloadingEnabledOffset_", declaredType="bool")
	public boolean _dynamicClassUnloadingEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_MetronomeDelegate.__dynamicClassUnloadingEnabledOffset_);
	}

	// bool _dynamicClassUnloadingEnabled
	public BoolPointer _dynamicClassUnloadingEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__dynamicClassUnloadingEnabledOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_MetronomeDelegate.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__extensionsOffset_));
	}

	// bool _finalizationRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizationRequiredOffset_", declaredType="bool")
	public boolean _finalizationRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_MetronomeDelegate.__finalizationRequiredOffset_);
	}

	// bool _finalizationRequired
	public BoolPointer _finalizationRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__finalizationRequiredOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_MetronomeDelegate.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__javaVMOffset_));
	}

	// UDATA _jniResponsesRequiredForExclusiveVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__jniResponsesRequiredForExclusiveVMAccessOffset_", declaredType="UDATA")
	public UDATA _jniResponsesRequiredForExclusiveVMAccess() throws CorruptDataException {
		return getUDATAAtOffset(MM_MetronomeDelegate.__jniResponsesRequiredForExclusiveVMAccessOffset_);
	}

	// UDATA _jniResponsesRequiredForExclusiveVMAccess
	public UDATAPointer _jniResponsesRequiredForExclusiveVMAccessEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__jniResponsesRequiredForExclusiveVMAccessOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_RealtimeMarkingScheme*")
	public MM_RealtimeMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_RealtimeMarkingSchemePointer.cast(getPointerAtOffset(MM_MetronomeDelegate.__markingSchemeOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__markingSchemeOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__realtimeGCOffset_", declaredType="MM_RealtimeGC*")
	public MM_RealtimeGCPointer _realtimeGC() throws CorruptDataException {
		return MM_RealtimeGCPointer.cast(getPointerAtOffset(MM_MetronomeDelegate.__realtimeGCOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	public PointerPointer _realtimeGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__realtimeGCOffset_));
	}

	// MM_Scheduler* _scheduler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__schedulerOffset_", declaredType="MM_Scheduler*")
	public MM_SchedulerPointer _scheduler() throws CorruptDataException {
		return MM_SchedulerPointer.cast(getPointerAtOffset(MM_MetronomeDelegate.__schedulerOffset_));
	}

	// MM_Scheduler* _scheduler
	public PointerPointer _schedulerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__schedulerOffset_));
	}

	// bool _unmarkedImpliesClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unmarkedImpliesClassesOffset_", declaredType="bool")
	public boolean _unmarkedImpliesClasses() throws CorruptDataException {
		return getBoolAtOffset(MM_MetronomeDelegate.__unmarkedImpliesClassesOffset_);
	}

	// bool _unmarkedImpliesClasses
	public BoolPointer _unmarkedImpliesClassesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__unmarkedImpliesClassesOffset_));
	}

	// bool _unmarkedImpliesCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unmarkedImpliesClearedOffset_", declaredType="bool")
	public boolean _unmarkedImpliesCleared() throws CorruptDataException {
		return getBoolAtOffset(MM_MetronomeDelegate.__unmarkedImpliesClearedOffset_);
	}

	// bool _unmarkedImpliesCleared
	public BoolPointer _unmarkedImpliesClearedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__unmarkedImpliesClearedOffset_));
	}

	// bool _unmarkedImpliesStringsCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unmarkedImpliesStringsClearedOffset_", declaredType="bool")
	public boolean _unmarkedImpliesStringsCleared() throws CorruptDataException {
		return getBoolAtOffset(MM_MetronomeDelegate.__unmarkedImpliesStringsClearedOffset_);
	}

	// bool _unmarkedImpliesStringsCleared
	public BoolPointer _unmarkedImpliesStringsClearedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__unmarkedImpliesStringsClearedOffset_));
	}

	// UDATA _vmResponsesRequiredForExclusiveVMAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmResponsesRequiredForExclusiveVMAccessOffset_", declaredType="UDATA")
	public UDATA _vmResponsesRequiredForExclusiveVMAccess() throws CorruptDataException {
		return getUDATAAtOffset(MM_MetronomeDelegate.__vmResponsesRequiredForExclusiveVMAccessOffset_);
	}

	// UDATA _vmResponsesRequiredForExclusiveVMAccess
	public UDATAPointer _vmResponsesRequiredForExclusiveVMAccessEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeDelegate.__vmResponsesRequiredForExclusiveVMAccessOffset_));
	}

}
