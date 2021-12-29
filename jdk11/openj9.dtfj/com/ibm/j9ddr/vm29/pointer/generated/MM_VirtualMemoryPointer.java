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
 * Structure: MM_VirtualMemoryPointer
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
 * The generated code will provide getters for all elements in the MM_VirtualMemoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VirtualMemory.class)
public class MM_VirtualMemoryPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_VirtualMemoryPointer NULL = new MM_VirtualMemoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VirtualMemoryPointer(long address) {
		super(address);
	}

	public static MM_VirtualMemoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VirtualMemoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VirtualMemoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VirtualMemoryPointer(address);
	}

	public MM_VirtualMemoryPointer add(long count) {
		return MM_VirtualMemoryPointer.cast(address + (MM_VirtualMemory.SIZEOF * count));
	}

	public MM_VirtualMemoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VirtualMemoryPointer addOffset(long offset) {
		return MM_VirtualMemoryPointer.cast(address + offset);
	}

	public MM_VirtualMemoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VirtualMemoryPointer sub(long count) {
		return MM_VirtualMemoryPointer.cast(address - (MM_VirtualMemory.SIZEOF * count));
	}

	public MM_VirtualMemoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VirtualMemoryPointer subOffset(long offset) {
		return MM_VirtualMemoryPointer.cast(address - offset);
	}

	public MM_VirtualMemoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VirtualMemoryPointer untag(long mask) {
		return MM_VirtualMemoryPointer.cast(address & ~mask);
	}

	public MM_VirtualMemoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VirtualMemory.SIZEOF;
	}

	// Implementation methods

	// void* _baseAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__baseAddressOffset_", declaredType="void*")
	public VoidPointer _baseAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_VirtualMemory.__baseAddressOffset_));
	}

	// void* _baseAddress
	public PointerPointer _baseAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VirtualMemory.__baseAddressOffset_));
	}

	// U64 _consumerCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__consumerCountOffset_", declaredType="U64")
	public UDATA _consumerCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__consumerCountOffset_));
	}

	// U64 _consumerCount
	public UDATAPointer _consumerCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__consumerCountOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_VirtualMemory.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VirtualMemory.__extensionsOffset_));
	}

	// U64 _heapAlignment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapAlignmentOffset_", declaredType="U64")
	public UDATA _heapAlignment() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__heapAlignmentOffset_));
	}

	// U64 _heapAlignment
	public UDATAPointer _heapAlignmentEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__heapAlignmentOffset_));
	}

	// void* _heapBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapBaseOffset_", declaredType="void*")
	public VoidPointer _heapBase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_VirtualMemory.__heapBaseOffset_));
	}

	// void* _heapBase
	public PointerPointer _heapBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VirtualMemory.__heapBaseOffset_));
	}

	// void* _heapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__heapTopOffset_", declaredType="void*")
	public VoidPointer _heapTop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(MM_VirtualMemory.__heapTopOffset_));
	}

	// void* _heapTop
	public PointerPointer _heapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VirtualMemory.__heapTopOffset_));
	}

	// J9PortVmemIdentifier _identifier
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__identifierOffset_", declaredType="J9PortVmemIdentifier")
	public J9PortVmemIdentifierPointer _identifier() throws CorruptDataException {
		return J9PortVmemIdentifierPointer.cast(nonNullFieldEA(MM_VirtualMemory.__identifierOffset_));
	}

	// J9PortVmemIdentifier _identifier
	public PointerPointer _identifierEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VirtualMemory.__identifierOffset_));
	}

	// U64 _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="U64")
	public UDATA _mode() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__modeOffset_));
	}

	// U64 _mode
	public UDATAPointer _modeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__modeOffset_));
	}

	// U64 _pageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pageFlagsOffset_", declaredType="U64")
	public UDATA _pageFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__pageFlagsOffset_));
	}

	// U64 _pageFlags
	public UDATAPointer _pageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__pageFlagsOffset_));
	}

	// U64 _pageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pageSizeOffset_", declaredType="U64")
	public UDATA _pageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__pageSizeOffset_));
	}

	// U64 _pageSize
	public UDATAPointer _pageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__pageSizeOffset_));
	}

	// U64 _reserveSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reserveSizeOffset_", declaredType="U64")
	public UDATA _reserveSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__reserveSizeOffset_));
	}

	// U64 _reserveSize
	public UDATAPointer _reserveSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__reserveSizeOffset_));
	}

	// U64 _tailPadding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailPaddingOffset_", declaredType="U64")
	public UDATA _tailPadding() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VirtualMemory.__tailPaddingOffset_));
	}

	// U64 _tailPadding
	public UDATAPointer _tailPaddingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VirtualMemory.__tailPaddingOffset_));
	}

}
