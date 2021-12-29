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
 * Structure: GC_ParallelObjectHeapIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ParallelObjectHeapIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ParallelObjectHeapIterator.class)
public class GC_ParallelObjectHeapIteratorPointer extends GC_ObjectHeapIteratorPointer {

	// NULL
	public static final GC_ParallelObjectHeapIteratorPointer NULL = new GC_ParallelObjectHeapIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ParallelObjectHeapIteratorPointer(long address) {
		super(address);
	}

	public static GC_ParallelObjectHeapIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ParallelObjectHeapIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ParallelObjectHeapIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ParallelObjectHeapIteratorPointer(address);
	}

	public GC_ParallelObjectHeapIteratorPointer add(long count) {
		return GC_ParallelObjectHeapIteratorPointer.cast(address + (GC_ParallelObjectHeapIterator.SIZEOF * count));
	}

	public GC_ParallelObjectHeapIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ParallelObjectHeapIteratorPointer addOffset(long offset) {
		return GC_ParallelObjectHeapIteratorPointer.cast(address + offset);
	}

	public GC_ParallelObjectHeapIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ParallelObjectHeapIteratorPointer sub(long count) {
		return GC_ParallelObjectHeapIteratorPointer.cast(address - (GC_ParallelObjectHeapIterator.SIZEOF * count));
	}

	public GC_ParallelObjectHeapIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ParallelObjectHeapIteratorPointer subOffset(long offset) {
		return GC_ParallelObjectHeapIteratorPointer.cast(address - offset);
	}

	public GC_ParallelObjectHeapIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ParallelObjectHeapIteratorPointer untag(long mask) {
		return GC_ParallelObjectHeapIteratorPointer.cast(address & ~mask);
	}

	public GC_ParallelObjectHeapIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ParallelObjectHeapIterator.SIZEOF;
	}

	// Implementation methods

	// UDATA* _chunkBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkBaseOffset_", declaredType="UDATA*")
	public UDATAPointer _chunkBase() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_ParallelObjectHeapIterator.__chunkBaseOffset_));
	}

	// UDATA* _chunkBase
	public PointerPointer _chunkBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__chunkBaseOffset_));
	}

	// UDATA* _chunkTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkTopOffset_", declaredType="UDATA*")
	public UDATAPointer _chunkTop() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_ParallelObjectHeapIterator.__chunkTopOffset_));
	}

	// UDATA* _chunkTop
	public PointerPointer _chunkTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__chunkTopOffset_));
	}

	// MM_EnvironmentBase* _env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__envOffset_", declaredType="MM_EnvironmentBase*")
	public MM_EnvironmentBasePointer _env() throws CorruptDataException {
		return MM_EnvironmentBasePointer.cast(getPointerAtOffset(GC_ParallelObjectHeapIterator.__envOffset_));
	}

	// MM_EnvironmentBase* _env
	public PointerPointer _envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__envOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(GC_ParallelObjectHeapIterator.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__markMapOffset_));
	}

	// GC_ObjectHeapBufferedIterator _objectHeapIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectHeapIteratorOffset_", declaredType="GC_ObjectHeapBufferedIterator")
	public GC_ObjectHeapBufferedIteratorPointer _objectHeapIterator() throws CorruptDataException {
		return GC_ObjectHeapBufferedIteratorPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__objectHeapIteratorOffset_));
	}

	// GC_ObjectHeapBufferedIterator _objectHeapIterator
	public PointerPointer _objectHeapIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__objectHeapIteratorOffset_));
	}

	// GC_MarkMapSegmentChunkIterator _segmentChunkIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__segmentChunkIteratorOffset_", declaredType="GC_MarkMapSegmentChunkIterator")
	public GC_MarkMapSegmentChunkIteratorPointer _segmentChunkIterator() throws CorruptDataException {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__segmentChunkIteratorOffset_));
	}

	// GC_MarkMapSegmentChunkIterator _segmentChunkIterator
	public PointerPointer _segmentChunkIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__segmentChunkIteratorOffset_));
	}

	// void* _topAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__topAddressOffset_", declaredType="void*")
	public VoidPointer _topAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(GC_ParallelObjectHeapIterator.__topAddressOffset_));
	}

	// void* _topAddress
	public PointerPointer _topAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ParallelObjectHeapIterator.__topAddressOffset_));
	}

}
