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
 * Structure: MM_CollectorPointer
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
 * The generated code will provide getters for all elements in the MM_CollectorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Collector.class)
public class MM_CollectorPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_CollectorPointer NULL = new MM_CollectorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_CollectorPointer(long address) {
		super(address);
	}

	public static MM_CollectorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_CollectorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_CollectorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_CollectorPointer(address);
	}

	public MM_CollectorPointer add(long count) {
		return MM_CollectorPointer.cast(address + (MM_Collector.SIZEOF * count));
	}

	public MM_CollectorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_CollectorPointer addOffset(long offset) {
		return MM_CollectorPointer.cast(address + offset);
	}

	public MM_CollectorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_CollectorPointer sub(long count) {
		return MM_CollectorPointer.cast(address - (MM_Collector.SIZEOF * count));
	}

	public MM_CollectorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_CollectorPointer subOffset(long offset) {
		return MM_CollectorPointer.cast(address - offset);
	}

	public MM_CollectorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_CollectorPointer untag(long mask) {
		return MM_CollectorPointer.cast(address & ~mask);
	}

	public MM_CollectorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Collector.SIZEOF;
	}

	// Implementation methods

	// U64 _bytesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesRequestedOffset_", declaredType="U64")
	public UDATA _bytesRequested() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Collector.__bytesRequestedOffset_));
	}

	// U64 _bytesRequested
	public UDATAPointer _bytesRequestedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Collector.__bytesRequestedOffset_));
	}

	// U64 _collectorExpandedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorExpandedSizeOffset_", declaredType="U64")
	public UDATA _collectorExpandedSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Collector.__collectorExpandedSizeOffset_));
	}

	// U64 _collectorExpandedSize
	public UDATAPointer _collectorExpandedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Collector.__collectorExpandedSizeOffset_));
	}

	// U64 _cycleType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleTypeOffset_", declaredType="U64")
	public UDATA _cycleType() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Collector.__cycleTypeOffset_));
	}

	// U64 _cycleType
	public UDATAPointer _cycleTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Collector.__cycleTypeOffset_));
	}

	// bool _disableGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__disableGCOffset_", declaredType="bool")
	public boolean _disableGC() throws CorruptDataException {
		return getBoolAtOffset(MM_Collector.__disableGCOffset_);
	}

	// bool _disableGC
	public BoolPointer _disableGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Collector.__disableGCOffset_));
	}

	// U64 _exclusiveAccessCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__exclusiveAccessCountOffset_", declaredType="U64")
	public UDATA _exclusiveAccessCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Collector.__exclusiveAccessCountOffset_));
	}

	// U64 _exclusiveAccessCount
	public UDATAPointer _exclusiveAccessCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Collector.__exclusiveAccessCountOffset_));
	}

	// bool _gcCompleted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCompletedOffset_", declaredType="bool")
	public boolean _gcCompleted() throws CorruptDataException {
		return getBoolAtOffset(MM_Collector.__gcCompletedOffset_);
	}

	// bool _gcCompleted
	public BoolPointer _gcCompletedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Collector.__gcCompletedOffset_));
	}

	// bool _globalCollector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalCollectorOffset_", declaredType="bool")
	public boolean _globalCollector() throws CorruptDataException {
		return getBoolAtOffset(MM_Collector.__globalCollectorOffset_);
	}

	// bool _globalCollector
	public BoolPointer _globalCollectorEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Collector.__globalCollectorOffset_));
	}

	// bool _isRecursiveGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isRecursiveGCOffset_", declaredType="bool")
	public boolean _isRecursiveGC() throws CorruptDataException {
		return getBoolAtOffset(MM_Collector.__isRecursiveGCOffset_);
	}

	// bool _isRecursiveGC
	public BoolPointer _isRecursiveGCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Collector.__isRecursiveGCOffset_));
	}

	// U64 _mainThreadCpuTimeStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadCpuTimeStartOffset_", declaredType="U64")
	public UDATA _mainThreadCpuTimeStart() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Collector.__mainThreadCpuTimeStartOffset_));
	}

	// U64 _mainThreadCpuTimeStart
	public UDATAPointer _mainThreadCpuTimeStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Collector.__mainThreadCpuTimeStartOffset_));
	}

	// bool _stwCollectionInProgress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stwCollectionInProgressOffset_", declaredType="bool")
	public boolean _stwCollectionInProgress() throws CorruptDataException {
		return getBoolAtOffset(MM_Collector.__stwCollectionInProgressOffset_);
	}

	// bool _stwCollectionInProgress
	public BoolPointer _stwCollectionInProgressEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_Collector.__stwCollectionInProgressOffset_));
	}

}
