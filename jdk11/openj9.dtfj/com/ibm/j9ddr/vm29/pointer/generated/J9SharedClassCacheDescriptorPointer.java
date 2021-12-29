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
 * Structure: J9SharedClassCacheDescriptorPointer
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
 * The generated code will provide getters for all elements in the J9SharedClassCacheDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedClassCacheDescriptor.class)
public class J9SharedClassCacheDescriptorPointer extends StructurePointer {

	// NULL
	public static final J9SharedClassCacheDescriptorPointer NULL = new J9SharedClassCacheDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedClassCacheDescriptorPointer(long address) {
		super(address);
	}

	public static J9SharedClassCacheDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedClassCacheDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedClassCacheDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedClassCacheDescriptorPointer(address);
	}

	public J9SharedClassCacheDescriptorPointer add(long count) {
		return J9SharedClassCacheDescriptorPointer.cast(address + (J9SharedClassCacheDescriptor.SIZEOF * count));
	}

	public J9SharedClassCacheDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedClassCacheDescriptorPointer addOffset(long offset) {
		return J9SharedClassCacheDescriptorPointer.cast(address + offset);
	}

	public J9SharedClassCacheDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedClassCacheDescriptorPointer sub(long count) {
		return J9SharedClassCacheDescriptorPointer.cast(address - (J9SharedClassCacheDescriptor.SIZEOF * count));
	}

	public J9SharedClassCacheDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedClassCacheDescriptorPointer subOffset(long offset) {
		return J9SharedClassCacheDescriptorPointer.cast(address - offset);
	}

	public J9SharedClassCacheDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedClassCacheDescriptorPointer untag(long mask) {
		return J9SharedClassCacheDescriptorPointer.cast(address & ~mask);
	}

	public J9SharedClassCacheDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedClassCacheDescriptor.SIZEOF;
	}

	// Implementation methods

	// UDATA cacheSizeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheSizeBytesOffset_", declaredType="UDATA")
	public UDATA cacheSizeBytes() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedClassCacheDescriptor._cacheSizeBytesOffset_);
	}

	// UDATA cacheSizeBytes
	public UDATAPointer cacheSizeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._cacheSizeBytesOffset_));
	}

	// J9SharedCacheHeader* cacheStartAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheStartAddressOffset_", declaredType="J9SharedCacheHeader*")
	public J9SharedCacheHeaderPointer cacheStartAddress() throws CorruptDataException {
		return J9SharedCacheHeaderPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._cacheStartAddressOffset_));
	}

	// J9SharedCacheHeader* cacheStartAddress
	public PointerPointer cacheStartAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._cacheStartAddressOffset_));
	}

	// void* deployedROMClassStartAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deployedROMClassStartAddressOffset_", declaredType="void*")
	public VoidPointer deployedROMClassStartAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._deployedROMClassStartAddressOffset_));
	}

	// void* deployedROMClassStartAddress
	public PointerPointer deployedROMClassStartAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._deployedROMClassStartAddressOffset_));
	}

	// J9MemorySegment* metadataMemorySegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metadataMemorySegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer metadataMemorySegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._metadataMemorySegmentOffset_));
	}

	// J9MemorySegment* metadataMemorySegment
	public PointerPointer metadataMemorySegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._metadataMemorySegmentOffset_));
	}

	// void* metadataStartAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metadataStartAddressOffset_", declaredType="void*")
	public VoidPointer metadataStartAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._metadataStartAddressOffset_));
	}

	// void* metadataStartAddress
	public PointerPointer metadataStartAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._metadataStartAddressOffset_));
	}

	// J9SharedClassCacheDescriptor* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9SharedClassCacheDescriptor*")
	public J9SharedClassCacheDescriptorPointer next() throws CorruptDataException {
		return J9SharedClassCacheDescriptorPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._nextOffset_));
	}

	// J9SharedClassCacheDescriptor* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._nextOffset_));
	}

	// J9SharedClassCacheDescriptor* previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_previousOffset_", declaredType="J9SharedClassCacheDescriptor*")
	public J9SharedClassCacheDescriptorPointer previous() throws CorruptDataException {
		return J9SharedClassCacheDescriptorPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._previousOffset_));
	}

	// J9SharedClassCacheDescriptor* previous
	public PointerPointer previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._previousOffset_));
	}

	// void* romclassStartAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romclassStartAddressOffset_", declaredType="void*")
	public VoidPointer romclassStartAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedClassCacheDescriptor._romclassStartAddressOffset_));
	}

	// void* romclassStartAddress
	public PointerPointer romclassStartAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedClassCacheDescriptor._romclassStartAddressOffset_));
	}

}
