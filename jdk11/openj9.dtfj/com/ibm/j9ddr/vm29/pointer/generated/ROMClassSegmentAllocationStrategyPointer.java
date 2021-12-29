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
 * Structure: ROMClassSegmentAllocationStrategyPointer
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
 * The generated code will provide getters for all elements in the ROMClassSegmentAllocationStrategyPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassSegmentAllocationStrategy.class)
public class ROMClassSegmentAllocationStrategyPointer extends AllocationStrategyPointer {

	// NULL
	public static final ROMClassSegmentAllocationStrategyPointer NULL = new ROMClassSegmentAllocationStrategyPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassSegmentAllocationStrategyPointer(long address) {
		super(address);
	}

	public static ROMClassSegmentAllocationStrategyPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassSegmentAllocationStrategyPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassSegmentAllocationStrategyPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassSegmentAllocationStrategyPointer(address);
	}

	public ROMClassSegmentAllocationStrategyPointer add(long count) {
		return ROMClassSegmentAllocationStrategyPointer.cast(address + (ROMClassSegmentAllocationStrategy.SIZEOF * count));
	}

	public ROMClassSegmentAllocationStrategyPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassSegmentAllocationStrategyPointer addOffset(long offset) {
		return ROMClassSegmentAllocationStrategyPointer.cast(address + offset);
	}

	public ROMClassSegmentAllocationStrategyPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassSegmentAllocationStrategyPointer sub(long count) {
		return ROMClassSegmentAllocationStrategyPointer.cast(address - (ROMClassSegmentAllocationStrategy.SIZEOF * count));
	}

	public ROMClassSegmentAllocationStrategyPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassSegmentAllocationStrategyPointer subOffset(long offset) {
		return ROMClassSegmentAllocationStrategyPointer.cast(address - offset);
	}

	public ROMClassSegmentAllocationStrategyPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassSegmentAllocationStrategyPointer untag(long mask) {
		return ROMClassSegmentAllocationStrategyPointer.cast(address & ~mask);
	}

	public ROMClassSegmentAllocationStrategyPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassSegmentAllocationStrategy.SIZEOF;
	}

	// Implementation methods

	// UDATA _bytesRequested
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bytesRequestedOffset_", declaredType="UDATA")
	public UDATA _bytesRequested() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassSegmentAllocationStrategy.__bytesRequestedOffset_);
	}

	// UDATA _bytesRequested
	public UDATAPointer _bytesRequestedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassSegmentAllocationStrategy.__bytesRequestedOffset_));
	}

	// J9ClassLoader* _classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer _classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(ROMClassSegmentAllocationStrategy.__classLoaderOffset_));
	}

	// J9ClassLoader* _classLoader
	public PointerPointer _classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassSegmentAllocationStrategy.__classLoaderOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(ROMClassSegmentAllocationStrategy.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassSegmentAllocationStrategy.__javaVMOffset_));
	}

	// J9MemorySegment* _segment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__segmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer _segment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(ROMClassSegmentAllocationStrategy.__segmentOffset_));
	}

	// J9MemorySegment* _segment
	public PointerPointer _segmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassSegmentAllocationStrategy.__segmentOffset_));
	}

}
