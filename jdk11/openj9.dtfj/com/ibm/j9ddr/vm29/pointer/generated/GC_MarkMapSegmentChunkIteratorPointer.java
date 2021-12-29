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
 * Structure: GC_MarkMapSegmentChunkIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_MarkMapSegmentChunkIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_MarkMapSegmentChunkIterator.class)
public class GC_MarkMapSegmentChunkIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_MarkMapSegmentChunkIteratorPointer NULL = new GC_MarkMapSegmentChunkIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_MarkMapSegmentChunkIteratorPointer(long address) {
		super(address);
	}

	public static GC_MarkMapSegmentChunkIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_MarkMapSegmentChunkIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_MarkMapSegmentChunkIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_MarkMapSegmentChunkIteratorPointer(address);
	}

	public GC_MarkMapSegmentChunkIteratorPointer add(long count) {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(address + (GC_MarkMapSegmentChunkIterator.SIZEOF * count));
	}

	public GC_MarkMapSegmentChunkIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_MarkMapSegmentChunkIteratorPointer addOffset(long offset) {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(address + offset);
	}

	public GC_MarkMapSegmentChunkIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_MarkMapSegmentChunkIteratorPointer sub(long count) {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(address - (GC_MarkMapSegmentChunkIterator.SIZEOF * count));
	}

	public GC_MarkMapSegmentChunkIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_MarkMapSegmentChunkIteratorPointer subOffset(long offset) {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(address - offset);
	}

	public GC_MarkMapSegmentChunkIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_MarkMapSegmentChunkIteratorPointer untag(long mask) {
		return GC_MarkMapSegmentChunkIteratorPointer.cast(address & ~mask);
	}

	public GC_MarkMapSegmentChunkIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_MarkMapSegmentChunkIterator.SIZEOF;
	}

	// Implementation methods

	// UDATA _chunkSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__chunkSizeOffset_", declaredType="UDATA")
	public UDATA _chunkSize() throws CorruptDataException {
		return getUDATAAtOffset(GC_MarkMapSegmentChunkIterator.__chunkSizeOffset_);
	}

	// UDATA _chunkSize
	public UDATAPointer _chunkSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__chunkSizeOffset_));
	}

	// const MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="const MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(GC_MarkMapSegmentChunkIterator.__extensionsOffset_));
	}

	// const MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__extensionsOffset_));
	}

	// MM_HeapMapIterator _markedObjectIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markedObjectIteratorOffset_", declaredType="MM_HeapMapIterator")
	public MM_HeapMapIteratorPointer _markedObjectIterator() throws CorruptDataException {
		return MM_HeapMapIteratorPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__markedObjectIteratorOffset_));
	}

	// MM_HeapMapIterator _markedObjectIterator
	public PointerPointer _markedObjectIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__markedObjectIteratorOffset_));
	}

	// UDATA* _nextChunkBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextChunkBaseOffset_", declaredType="UDATA*")
	public UDATAPointer _nextChunkBase() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(GC_MarkMapSegmentChunkIterator.__nextChunkBaseOffset_));
	}

	// UDATA* _nextChunkBase
	public PointerPointer _nextChunkBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__nextChunkBaseOffset_));
	}

	// UDATA _segmentBytesRemaining
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__segmentBytesRemainingOffset_", declaredType="UDATA")
	public UDATA _segmentBytesRemaining() throws CorruptDataException {
		return getUDATAAtOffset(GC_MarkMapSegmentChunkIterator.__segmentBytesRemainingOffset_);
	}

	// UDATA _segmentBytesRemaining
	public UDATAPointer _segmentBytesRemainingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_MarkMapSegmentChunkIterator.__segmentBytesRemainingOffset_));
	}

}
