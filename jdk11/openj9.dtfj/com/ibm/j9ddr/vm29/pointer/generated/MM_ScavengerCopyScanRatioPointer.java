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
 * Structure: MM_ScavengerCopyScanRatioPointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerCopyScanRatioPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ScavengerCopyScanRatio.class)
public class MM_ScavengerCopyScanRatioPointer extends StructurePointer {

	// NULL
	public static final MM_ScavengerCopyScanRatioPointer NULL = new MM_ScavengerCopyScanRatioPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerCopyScanRatioPointer(long address) {
		super(address);
	}

	public static MM_ScavengerCopyScanRatioPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerCopyScanRatioPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerCopyScanRatioPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerCopyScanRatioPointer(address);
	}

	public MM_ScavengerCopyScanRatioPointer add(long count) {
		return MM_ScavengerCopyScanRatioPointer.cast(address + (MM_ScavengerCopyScanRatio.SIZEOF * count));
	}

	public MM_ScavengerCopyScanRatioPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerCopyScanRatioPointer addOffset(long offset) {
		return MM_ScavengerCopyScanRatioPointer.cast(address + offset);
	}

	public MM_ScavengerCopyScanRatioPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerCopyScanRatioPointer sub(long count) {
		return MM_ScavengerCopyScanRatioPointer.cast(address - (MM_ScavengerCopyScanRatio.SIZEOF * count));
	}

	public MM_ScavengerCopyScanRatioPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerCopyScanRatioPointer subOffset(long offset) {
		return MM_ScavengerCopyScanRatioPointer.cast(address - offset);
	}

	public MM_ScavengerCopyScanRatioPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerCopyScanRatioPointer untag(long mask) {
		return MM_ScavengerCopyScanRatioPointer.cast(address & ~mask);
	}

	public MM_ScavengerCopyScanRatioPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ScavengerCopyScanRatio.SIZEOF;
	}

	// Implementation methods

	// volatile U64 _accumulatedSamples
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__accumulatedSamplesOffset_", declaredType="volatile U64")
	public UDATA _accumulatedSamples() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__accumulatedSamplesOffset_));
	}

	// volatile U64 _accumulatedSamples
	public UDATAPointer _accumulatedSamplesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__accumulatedSamplesOffset_));
	}

	// volatile U64 _accumulatingSamples
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__accumulatingSamplesOffset_", declaredType="volatile U64")
	public UDATA _accumulatingSamples() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__accumulatingSamplesOffset_));
	}

	// volatile U64 _accumulatingSamples
	public UDATAPointer _accumulatingSamplesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__accumulatingSamplesOffset_));
	}

	// U64 _historyFoldingFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historyFoldingFactorOffset_", declaredType="U64")
	public UDATA _historyFoldingFactor() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__historyFoldingFactorOffset_));
	}

	// U64 _historyFoldingFactor
	public UDATAPointer _historyFoldingFactorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__historyFoldingFactorOffset_));
	}

	// UpdateHistory[] _historyTable
	public MM_ScavengerCopyScanRatio$UpdateHistoryPointer _historyTableEA() throws CorruptDataException {
		return MM_ScavengerCopyScanRatio$UpdateHistoryPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__historyTableOffset_));
	}

	// U64 _historyTableIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__historyTableIndexOffset_", declaredType="U64")
	public UDATA _historyTableIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__historyTableIndexOffset_));
	}

	// U64 _historyTableIndex
	public UDATAPointer _historyTableIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__historyTableIndexOffset_));
	}

	// volatile U64 _majorUpdateThreadEnv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__majorUpdateThreadEnvOffset_", declaredType="volatile U64")
	public UDATA _majorUpdateThreadEnv() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__majorUpdateThreadEnvOffset_));
	}

	// volatile U64 _majorUpdateThreadEnv
	public UDATAPointer _majorUpdateThreadEnvEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__majorUpdateThreadEnvOffset_));
	}

	// U64 _overflowCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowCountOffset_", declaredType="U64")
	public UDATA _overflowCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__overflowCountOffset_));
	}

	// U64 _overflowCount
	public UDATAPointer _overflowCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__overflowCountOffset_));
	}

	// U64 _resetTimestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__resetTimestampOffset_", declaredType="U64")
	public UDATA _resetTimestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__resetTimestampOffset_));
	}

	// U64 _resetTimestamp
	public UDATAPointer _resetTimestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__resetTimestampOffset_));
	}

	// U64 _scalingUpdateCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scalingUpdateCountOffset_", declaredType="U64")
	public UDATA _scalingUpdateCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__scalingUpdateCountOffset_));
	}

	// U64 _scalingUpdateCount
	public UDATAPointer _scalingUpdateCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__scalingUpdateCountOffset_));
	}

	// U64 _threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountOffset_", declaredType="U64")
	public UDATA _threadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ScavengerCopyScanRatio.__threadCountOffset_));
	}

	// U64 _threadCount
	public UDATAPointer _threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ScavengerCopyScanRatio.__threadCountOffset_));
	}

}
