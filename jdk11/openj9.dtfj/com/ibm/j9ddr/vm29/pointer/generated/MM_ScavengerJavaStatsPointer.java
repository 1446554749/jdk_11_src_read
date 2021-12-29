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
 * Structure: MM_ScavengerJavaStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerJavaStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ScavengerJavaStats.class)
public class MM_ScavengerJavaStatsPointer extends StructurePointer {

	// NULL
	public static final MM_ScavengerJavaStatsPointer NULL = new MM_ScavengerJavaStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerJavaStatsPointer(long address) {
		super(address);
	}

	public static MM_ScavengerJavaStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerJavaStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerJavaStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerJavaStatsPointer(address);
	}

	public MM_ScavengerJavaStatsPointer add(long count) {
		return MM_ScavengerJavaStatsPointer.cast(address + (MM_ScavengerJavaStats.SIZEOF * count));
	}

	public MM_ScavengerJavaStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerJavaStatsPointer addOffset(long offset) {
		return MM_ScavengerJavaStatsPointer.cast(address + offset);
	}

	public MM_ScavengerJavaStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerJavaStatsPointer sub(long count) {
		return MM_ScavengerJavaStatsPointer.cast(address - (MM_ScavengerJavaStats.SIZEOF * count));
	}

	public MM_ScavengerJavaStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerJavaStatsPointer subOffset(long offset) {
		return MM_ScavengerJavaStatsPointer.cast(address - offset);
	}

	public MM_ScavengerJavaStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerJavaStatsPointer untag(long mask) {
		return MM_ScavengerJavaStatsPointer.cast(address & ~mask);
	}

	public MM_ScavengerJavaStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ScavengerJavaStats.SIZEOF;
	}

	// Implementation methods

	// UDATA _monitorReferenceCandidates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__monitorReferenceCandidatesOffset_", declaredType="UDATA")
	public UDATA _monitorReferenceCandidates() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__monitorReferenceCandidatesOffset_);
	}

	// UDATA _monitorReferenceCandidates
	public UDATAPointer _monitorReferenceCandidatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__monitorReferenceCandidatesOffset_));
	}

	// UDATA _monitorReferenceCleared
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__monitorReferenceClearedOffset_", declaredType="UDATA")
	public UDATA _monitorReferenceCleared() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__monitorReferenceClearedOffset_);
	}

	// UDATA _monitorReferenceCleared
	public UDATAPointer _monitorReferenceClearedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__monitorReferenceClearedOffset_));
	}

	// UDATA _ownableSynchronizerCandidates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerCandidatesOffset_", declaredType="UDATA")
	public UDATA _ownableSynchronizerCandidates() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__ownableSynchronizerCandidatesOffset_);
	}

	// UDATA _ownableSynchronizerCandidates
	public UDATAPointer _ownableSynchronizerCandidatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__ownableSynchronizerCandidatesOffset_));
	}

	// UDATA _ownableSynchronizerNurserySurvived
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerNurserySurvivedOffset_", declaredType="UDATA")
	public UDATA _ownableSynchronizerNurserySurvived() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__ownableSynchronizerNurserySurvivedOffset_);
	}

	// UDATA _ownableSynchronizerNurserySurvived
	public UDATAPointer _ownableSynchronizerNurserySurvivedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__ownableSynchronizerNurserySurvivedOffset_));
	}

	// UDATA _ownableSynchronizerTotalSurvived
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerTotalSurvivedOffset_", declaredType="UDATA")
	public UDATA _ownableSynchronizerTotalSurvived() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__ownableSynchronizerTotalSurvivedOffset_);
	}

	// UDATA _ownableSynchronizerTotalSurvived
	public UDATAPointer _ownableSynchronizerTotalSurvivedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__ownableSynchronizerTotalSurvivedOffset_));
	}

	// MM_ReferenceStats _phantomReferenceStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceStatsOffset_", declaredType="MM_ReferenceStats")
	public MM_ReferenceStatsPointer _phantomReferenceStats() throws CorruptDataException {
		return MM_ReferenceStatsPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__phantomReferenceStatsOffset_));
	}

	// MM_ReferenceStats _phantomReferenceStats
	public PointerPointer _phantomReferenceStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__phantomReferenceStatsOffset_));
	}

	// MM_ReferenceStats _softReferenceStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceStatsOffset_", declaredType="MM_ReferenceStats")
	public MM_ReferenceStatsPointer _softReferenceStats() throws CorruptDataException {
		return MM_ReferenceStatsPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__softReferenceStatsOffset_));
	}

	// MM_ReferenceStats _softReferenceStats
	public PointerPointer _softReferenceStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__softReferenceStatsOffset_));
	}

	// UDATA _unfinalizedCandidates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unfinalizedCandidatesOffset_", declaredType="UDATA")
	public UDATA _unfinalizedCandidates() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__unfinalizedCandidatesOffset_);
	}

	// UDATA _unfinalizedCandidates
	public UDATAPointer _unfinalizedCandidatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__unfinalizedCandidatesOffset_));
	}

	// UDATA _unfinalizedEnqueued
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unfinalizedEnqueuedOffset_", declaredType="UDATA")
	public UDATA _unfinalizedEnqueued() throws CorruptDataException {
		return getUDATAAtOffset(MM_ScavengerJavaStats.__unfinalizedEnqueuedOffset_);
	}

	// UDATA _unfinalizedEnqueued
	public UDATAPointer _unfinalizedEnqueuedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__unfinalizedEnqueuedOffset_));
	}

	// MM_ReferenceStats _weakReferenceStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceStatsOffset_", declaredType="MM_ReferenceStats")
	public MM_ReferenceStatsPointer _weakReferenceStats() throws CorruptDataException {
		return MM_ReferenceStatsPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__weakReferenceStatsOffset_));
	}

	// MM_ReferenceStats _weakReferenceStats
	public PointerPointer _weakReferenceStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerJavaStats.__weakReferenceStatsOffset_));
	}

}
