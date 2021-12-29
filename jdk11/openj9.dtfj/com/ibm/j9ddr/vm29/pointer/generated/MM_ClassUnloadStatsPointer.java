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
 * Structure: MM_ClassUnloadStatsPointer
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
 * The generated code will provide getters for all elements in the MM_ClassUnloadStatsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ClassUnloadStats.class)
public class MM_ClassUnloadStatsPointer extends MM_BasePointer {

	// NULL
	public static final MM_ClassUnloadStatsPointer NULL = new MM_ClassUnloadStatsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ClassUnloadStatsPointer(long address) {
		super(address);
	}

	public static MM_ClassUnloadStatsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ClassUnloadStatsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ClassUnloadStatsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ClassUnloadStatsPointer(address);
	}

	public MM_ClassUnloadStatsPointer add(long count) {
		return MM_ClassUnloadStatsPointer.cast(address + (MM_ClassUnloadStats.SIZEOF * count));
	}

	public MM_ClassUnloadStatsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ClassUnloadStatsPointer addOffset(long offset) {
		return MM_ClassUnloadStatsPointer.cast(address + offset);
	}

	public MM_ClassUnloadStatsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ClassUnloadStatsPointer sub(long count) {
		return MM_ClassUnloadStatsPointer.cast(address - (MM_ClassUnloadStats.SIZEOF * count));
	}

	public MM_ClassUnloadStatsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ClassUnloadStatsPointer subOffset(long offset) {
		return MM_ClassUnloadStatsPointer.cast(address - offset);
	}

	public MM_ClassUnloadStatsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ClassUnloadStatsPointer untag(long mask) {
		return MM_ClassUnloadStatsPointer.cast(address & ~mask);
	}

	public MM_ClassUnloadStatsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ClassUnloadStats.SIZEOF;
	}

	// Implementation methods

	// U64 _anonymousClassesUnloadedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anonymousClassesUnloadedCountOffset_", declaredType="U64")
	public UDATA _anonymousClassesUnloadedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__anonymousClassesUnloadedCountOffset_));
	}

	// U64 _anonymousClassesUnloadedCount
	public UDATAPointer _anonymousClassesUnloadedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__anonymousClassesUnloadedCountOffset_));
	}

	// U64 _classLoaderCandidates
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderCandidatesOffset_", declaredType="U64")
	public UDATA _classLoaderCandidates() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__classLoaderCandidatesOffset_));
	}

	// U64 _classLoaderCandidates
	public UDATAPointer _classLoaderCandidatesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__classLoaderCandidatesOffset_));
	}

	// U64 _classLoaderUnloadedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderUnloadedCountOffset_", declaredType="U64")
	public UDATA _classLoaderUnloadedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__classLoaderUnloadedCountOffset_));
	}

	// U64 _classLoaderUnloadedCount
	public UDATAPointer _classLoaderUnloadedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__classLoaderUnloadedCountOffset_));
	}

	// U64 _classUnloadMutexQuiesceTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classUnloadMutexQuiesceTimeOffset_", declaredType="U64")
	public UDATA _classUnloadMutexQuiesceTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__classUnloadMutexQuiesceTimeOffset_));
	}

	// U64 _classUnloadMutexQuiesceTime
	public UDATAPointer _classUnloadMutexQuiesceTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__classUnloadMutexQuiesceTimeOffset_));
	}

	// U64 _classesUnloadedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedCountOffset_", declaredType="U64")
	public UDATA _classesUnloadedCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__classesUnloadedCountOffset_));
	}

	// U64 _classesUnloadedCount
	public UDATAPointer _classesUnloadedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__classesUnloadedCountOffset_));
	}

	// U64 _endPostTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endPostTimeOffset_", declaredType="U64")
	public UDATA _endPostTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__endPostTimeOffset_));
	}

	// U64 _endPostTime
	public UDATAPointer _endPostTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__endPostTimeOffset_));
	}

	// U64 _endScanTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endScanTimeOffset_", declaredType="U64")
	public UDATA _endScanTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__endScanTimeOffset_));
	}

	// U64 _endScanTime
	public UDATAPointer _endScanTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__endScanTimeOffset_));
	}

	// U64 _endSetupTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endSetupTimeOffset_", declaredType="U64")
	public UDATA _endSetupTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__endSetupTimeOffset_));
	}

	// U64 _endSetupTime
	public UDATAPointer _endSetupTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__endSetupTimeOffset_));
	}

	// U64 _endTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endTimeOffset_", declaredType="U64")
	public UDATA _endTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__endTimeOffset_));
	}

	// U64 _endTime
	public UDATAPointer _endTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__endTimeOffset_));
	}

	// U64 _startPostTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startPostTimeOffset_", declaredType="U64")
	public UDATA _startPostTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__startPostTimeOffset_));
	}

	// U64 _startPostTime
	public UDATAPointer _startPostTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__startPostTimeOffset_));
	}

	// U64 _startScanTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startScanTimeOffset_", declaredType="U64")
	public UDATA _startScanTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__startScanTimeOffset_));
	}

	// U64 _startScanTime
	public UDATAPointer _startScanTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__startScanTimeOffset_));
	}

	// U64 _startSetupTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startSetupTimeOffset_", declaredType="U64")
	public UDATA _startSetupTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__startSetupTimeOffset_));
	}

	// U64 _startSetupTime
	public UDATAPointer _startSetupTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__startSetupTimeOffset_));
	}

	// U64 _startTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startTimeOffset_", declaredType="U64")
	public UDATA _startTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadStats.__startTimeOffset_));
	}

	// U64 _startTime
	public UDATAPointer _startTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadStats.__startTimeOffset_));
	}

}
