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
 * Structure: MM_ParallelGlobalGCPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelGlobalGCPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelGlobalGC.class)
public class MM_ParallelGlobalGCPointer extends MM_GlobalCollectorPointer {

	// NULL
	public static final MM_ParallelGlobalGCPointer NULL = new MM_ParallelGlobalGCPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelGlobalGCPointer(long address) {
		super(address);
	}

	public static MM_ParallelGlobalGCPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelGlobalGCPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelGlobalGCPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelGlobalGCPointer(address);
	}

	public MM_ParallelGlobalGCPointer add(long count) {
		return MM_ParallelGlobalGCPointer.cast(address + (MM_ParallelGlobalGC.SIZEOF * count));
	}

	public MM_ParallelGlobalGCPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelGlobalGCPointer addOffset(long offset) {
		return MM_ParallelGlobalGCPointer.cast(address + offset);
	}

	public MM_ParallelGlobalGCPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelGlobalGCPointer sub(long count) {
		return MM_ParallelGlobalGCPointer.cast(address - (MM_ParallelGlobalGC.SIZEOF * count));
	}

	public MM_ParallelGlobalGCPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelGlobalGCPointer subOffset(long offset) {
		return MM_ParallelGlobalGCPointer.cast(address - offset);
	}

	public MM_ParallelGlobalGCPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelGlobalGCPointer untag(long mask) {
		return MM_ParallelGlobalGCPointer.cast(address & ~mask);
	}

	public MM_ParallelGlobalGCPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelGlobalGC.SIZEOF;
	}

	// Implementation methods

	// MM_CollectionStatisticsStandard _collectionStatistics
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectionStatisticsOffset_", declaredType="MM_CollectionStatisticsStandard")
	public MM_CollectionStatisticsStandardPointer _collectionStatistics() throws CorruptDataException {
		return MM_CollectionStatisticsStandardPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__collectionStatisticsOffset_));
	}

	// MM_CollectionStatisticsStandard _collectionStatistics
	public PointerPointer _collectionStatisticsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__collectionStatisticsOffset_));
	}

	// MM_CompactScheme* _compactScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactSchemeOffset_", declaredType="MM_CompactScheme*")
	public MM_CompactSchemePointer _compactScheme() throws CorruptDataException {
		return MM_CompactSchemePointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__compactSchemeOffset_));
	}

	// MM_CompactScheme* _compactScheme
	public PointerPointer _compactSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__compactSchemeOffset_));
	}

	// bool _compactThisCycle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compactThisCycleOffset_", declaredType="bool")
	public boolean _compactThisCycle() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelGlobalGC.__compactThisCycleOffset_);
	}

	// bool _compactThisCycle
	public BoolPointer _compactThisCycleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__compactThisCycleOffset_));
	}

	// MM_CycleState _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__cycleStateOffset_));
	}

	// MM_CycleState _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__cycleStateOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dispatcherOffset_", declaredType="MM_ParallelDispatcher*")
	public MM_ParallelDispatcherPointer _dispatcher() throws CorruptDataException {
		return MM_ParallelDispatcherPointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__dispatcherOffset_));
	}

	// MM_ParallelDispatcher* _dispatcher
	public PointerPointer _dispatcherEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__dispatcherOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__extensionsOffset_));
	}

	// bool _fixHeapForWalkCompleted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fixHeapForWalkCompletedOffset_", declaredType="bool")
	public boolean _fixHeapForWalkCompleted() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelGlobalGC.__fixHeapForWalkCompletedOffset_);
	}

	// bool _fixHeapForWalkCompleted
	public BoolPointer _fixHeapForWalkCompletedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__fixHeapForWalkCompletedOffset_));
	}

	// MM_ParallelHeapWalker* _heapWalker
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapWalkerOffset_", declaredType="MM_ParallelHeapWalker*")
	public MM_ParallelHeapWalkerPointer _heapWalker() throws CorruptDataException {
		return MM_ParallelHeapWalkerPointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__heapWalkerOffset_));
	}

	// MM_ParallelHeapWalker* _heapWalker
	public PointerPointer _heapWalkerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__heapWalkerOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__markingSchemeOffset_));
	}

	// OMRPortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer _portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__portLibraryOffset_));
	}

	// OMRPortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__portLibraryOffset_));
	}

	// MM_ParallelSweepScheme* _sweepScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sweepSchemeOffset_", declaredType="MM_ParallelSweepScheme*")
	public MM_ParallelSweepSchemePointer _sweepScheme() throws CorruptDataException {
		return MM_ParallelSweepSchemePointer.cast(getPointerAtOffset(MM_ParallelGlobalGC.__sweepSchemeOffset_));
	}

	// MM_ParallelSweepScheme* _sweepScheme
	public PointerPointer _sweepSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalGC.__sweepSchemeOffset_));
	}

}
