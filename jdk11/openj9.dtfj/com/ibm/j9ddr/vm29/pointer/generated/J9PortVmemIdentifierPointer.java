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
 * Structure: J9PortVmemIdentifierPointer
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
 * The generated code will provide getters for all elements in the J9PortVmemIdentifierPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PortVmemIdentifier.class)
public class J9PortVmemIdentifierPointer extends StructurePointer {

	// NULL
	public static final J9PortVmemIdentifierPointer NULL = new J9PortVmemIdentifierPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PortVmemIdentifierPointer(long address) {
		super(address);
	}

	public static J9PortVmemIdentifierPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PortVmemIdentifierPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PortVmemIdentifierPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PortVmemIdentifierPointer(address);
	}

	public J9PortVmemIdentifierPointer add(long count) {
		return J9PortVmemIdentifierPointer.cast(address + (J9PortVmemIdentifier.SIZEOF * count));
	}

	public J9PortVmemIdentifierPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PortVmemIdentifierPointer addOffset(long offset) {
		return J9PortVmemIdentifierPointer.cast(address + offset);
	}

	public J9PortVmemIdentifierPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PortVmemIdentifierPointer sub(long count) {
		return J9PortVmemIdentifierPointer.cast(address - (J9PortVmemIdentifier.SIZEOF * count));
	}

	public J9PortVmemIdentifierPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PortVmemIdentifierPointer subOffset(long offset) {
		return J9PortVmemIdentifierPointer.cast(address - offset);
	}

	public J9PortVmemIdentifierPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PortVmemIdentifierPointer untag(long mask) {
		return J9PortVmemIdentifierPointer.cast(address & ~mask);
	}

	public J9PortVmemIdentifierPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PortVmemIdentifier.SIZEOF;
	}

	// Implementation methods

	// void* address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addressOffset_", declaredType="void*")
	public VoidPointer address() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortVmemIdentifier._addressOffset_));
	}

	// void* address
	public PointerPointer addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._addressOffset_));
	}

	// U64 allocator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatorOffset_", declaredType="U64")
	public UDATA allocator() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemIdentifier._allocatorOffset_));
	}

	// U64 allocator
	public UDATAPointer allocatorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._allocatorOffset_));
	}

	// OMRMemCategory* category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_categoryOffset_", declaredType="OMRMemCategory*")
	public OMRMemCategoryPointer category() throws CorruptDataException {
		return OMRMemCategoryPointer.cast(getPointerAtOffset(J9PortVmemIdentifier._categoryOffset_));
	}

	// OMRMemCategory* category
	public PointerPointer categoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._categoryOffset_));
	}

	// I32 fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fdOffset_", declaredType="I32")
	public IDATA fd() throws CorruptDataException {
		return new I32(getIntAtOffset(J9PortVmemIdentifier._fdOffset_));
	}

	// I32 fd
	public IDATAPointer fdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._fdOffset_));
	}

	// void* handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handleOffset_", declaredType="void*")
	public VoidPointer handle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortVmemIdentifier._handleOffset_));
	}

	// void* handle
	public PointerPointer handleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._handleOffset_));
	}

	// U64 mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modeOffset_", declaredType="U64")
	public UDATA mode() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemIdentifier._modeOffset_));
	}

	// U64 mode
	public UDATAPointer modeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._modeOffset_));
	}

	// U64 pageFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageFlagsOffset_", declaredType="U64")
	public UDATA pageFlags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemIdentifier._pageFlagsOffset_));
	}

	// U64 pageFlags
	public UDATAPointer pageFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._pageFlagsOffset_));
	}

	// U64 pageSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageSizeOffset_", declaredType="U64")
	public UDATA pageSize() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemIdentifier._pageSizeOffset_));
	}

	// U64 pageSize
	public UDATAPointer pageSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._pageSizeOffset_));
	}

	// U64 size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="U64")
	public UDATA size() throws CorruptDataException {
		return new U64(getLongAtOffset(J9PortVmemIdentifier._sizeOffset_));
	}

	// U64 size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortVmemIdentifier._sizeOffset_));
	}

}
