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
 * Structure: MM_ConcurrentGC$InitWorkItemPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentGC$InitWorkItemPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentGC$InitWorkItem.class)
public class MM_ConcurrentGC$InitWorkItemPointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentGC$InitWorkItemPointer NULL = new MM_ConcurrentGC$InitWorkItemPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentGC$InitWorkItemPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentGC$InitWorkItemPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentGC$InitWorkItemPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentGC$InitWorkItemPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentGC$InitWorkItemPointer(address);
	}

	public MM_ConcurrentGC$InitWorkItemPointer add(long count) {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(address + (MM_ConcurrentGC$InitWorkItem.SIZEOF * count));
	}

	public MM_ConcurrentGC$InitWorkItemPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentGC$InitWorkItemPointer addOffset(long offset) {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(address + offset);
	}

	public MM_ConcurrentGC$InitWorkItemPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentGC$InitWorkItemPointer sub(long count) {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(address - (MM_ConcurrentGC$InitWorkItem.SIZEOF * count));
	}

	public MM_ConcurrentGC$InitWorkItemPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentGC$InitWorkItemPointer subOffset(long offset) {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(address - offset);
	}

	public MM_ConcurrentGC$InitWorkItemPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentGC$InitWorkItemPointer untag(long mask) {
		return MM_ConcurrentGC$InitWorkItemPointer.cast(address & ~mask);
	}

	public MM_ConcurrentGC$InitWorkItemPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentGC$InitWorkItem.SIZEOF;
	}

	// Implementation methods

	// void* base
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_baseOffset_", declaredType="void*")
	public VoidPointer base() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ConcurrentGC$InitWorkItem._baseOffset_));
	}

	// void* base
	public PointerPointer baseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._baseOffset_));
	}

	// U64 chunkSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_chunkSizeOffset_", declaredType="U64")
	public UDATA chunkSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$InitWorkItem._chunkSizeOffset_));
	}

	// U64 chunkSize
	public UDATAPointer chunkSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._chunkSizeOffset_));
	}

	// volatile void* current
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentOffset_", declaredType="volatile void*")
	public VoidPointer current() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ConcurrentGC$InitWorkItem._currentOffset_));
	}

	// volatile void* current
	public PointerPointer currentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._currentOffset_));
	}

	// U64 initBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initBytesOffset_", declaredType="U64")
	public UDATA initBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$InitWorkItem._initBytesOffset_));
	}

	// U64 initBytes
	public UDATAPointer initBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._initBytesOffset_));
	}

	// MM_MemorySubSpace* subspace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subspaceOffset_", declaredType="MM_MemorySubSpace*")
	public MM_MemorySubSpacePointer subspace() throws CorruptDataException {
		return MM_MemorySubSpacePointer.cast(getPointerAtOffset(MM_ConcurrentGC$InitWorkItem._subspaceOffset_));
	}

	// MM_MemorySubSpace* subspace
	public PointerPointer subspaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._subspaceOffset_));
	}

	// void* top
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_topOffset_", declaredType="void*")
	public VoidPointer top() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_ConcurrentGC$InitWorkItem._topOffset_));
	}

	// void* top
	public PointerPointer topEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._topOffset_));
	}

	// InitType type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="InitType")
	public long type() throws CorruptDataException {
		if (MM_ConcurrentGC$InitType.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGC$InitWorkItem._typeOffset_);
		} else if (MM_ConcurrentGC$InitType.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGC$InitWorkItem._typeOffset_);
		} else if (MM_ConcurrentGC$InitType.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGC$InitWorkItem._typeOffset_);
		} else if (MM_ConcurrentGC$InitType.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGC$InitWorkItem._typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// InitType type
	public EnumPointer typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGC$InitWorkItem._typeOffset_), MM_ConcurrentGC$InitType.class);
	}

}
