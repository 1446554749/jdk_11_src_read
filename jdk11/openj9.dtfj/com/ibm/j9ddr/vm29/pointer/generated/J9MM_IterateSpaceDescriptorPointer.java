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
 * Structure: J9MM_IterateSpaceDescriptorPointer
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
 * The generated code will provide getters for all elements in the J9MM_IterateSpaceDescriptorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MM_IterateSpaceDescriptor.class)
public class J9MM_IterateSpaceDescriptorPointer extends StructurePointer {

	// NULL
	public static final J9MM_IterateSpaceDescriptorPointer NULL = new J9MM_IterateSpaceDescriptorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MM_IterateSpaceDescriptorPointer(long address) {
		super(address);
	}

	public static J9MM_IterateSpaceDescriptorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MM_IterateSpaceDescriptorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MM_IterateSpaceDescriptorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MM_IterateSpaceDescriptorPointer(address);
	}

	public J9MM_IterateSpaceDescriptorPointer add(long count) {
		return J9MM_IterateSpaceDescriptorPointer.cast(address + (J9MM_IterateSpaceDescriptor.SIZEOF * count));
	}

	public J9MM_IterateSpaceDescriptorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MM_IterateSpaceDescriptorPointer addOffset(long offset) {
		return J9MM_IterateSpaceDescriptorPointer.cast(address + offset);
	}

	public J9MM_IterateSpaceDescriptorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MM_IterateSpaceDescriptorPointer sub(long count) {
		return J9MM_IterateSpaceDescriptorPointer.cast(address - (J9MM_IterateSpaceDescriptor.SIZEOF * count));
	}

	public J9MM_IterateSpaceDescriptorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MM_IterateSpaceDescriptorPointer subOffset(long offset) {
		return J9MM_IterateSpaceDescriptorPointer.cast(address - offset);
	}

	public J9MM_IterateSpaceDescriptorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MM_IterateSpaceDescriptorPointer untag(long mask) {
		return J9MM_IterateSpaceDescriptorPointer.cast(address & ~mask);
	}

	public J9MM_IterateSpaceDescriptorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MM_IterateSpaceDescriptor.SIZEOF;
	}

	// Implementation methods

	// UDATA classPointerOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classPointerOffsetOffset_", declaredType="UDATA")
	public UDATA classPointerOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._classPointerOffsetOffset_);
	}

	// UDATA classPointerOffset
	public UDATAPointer classPointerOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._classPointerOffsetOffset_));
	}

	// UDATA classPointerSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classPointerSizeOffset_", declaredType="UDATA")
	public UDATA classPointerSize() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._classPointerSizeOffset_);
	}

	// UDATA classPointerSize
	public UDATAPointer classPointerSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._classPointerSizeOffset_));
	}

	// UDATA fobjectPointerDisplacement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fobjectPointerDisplacementOffset_", declaredType="UDATA")
	public UDATA fobjectPointerDisplacement() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._fobjectPointerDisplacementOffset_);
	}

	// UDATA fobjectPointerDisplacement
	public UDATAPointer fobjectPointerDisplacementEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._fobjectPointerDisplacementOffset_));
	}

	// UDATA fobjectPointerScale
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fobjectPointerScaleOffset_", declaredType="UDATA")
	public UDATA fobjectPointerScale() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._fobjectPointerScaleOffset_);
	}

	// UDATA fobjectPointerScale
	public UDATAPointer fobjectPointerScaleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._fobjectPointerScaleOffset_));
	}

	// UDATA fobjectSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fobjectSizeOffset_", declaredType="UDATA")
	public UDATA fobjectSize() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._fobjectSizeOffset_);
	}

	// UDATA fobjectSize
	public UDATAPointer fobjectSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._fobjectSizeOffset_));
	}

	// UDATA id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="UDATA")
	public UDATA id() throws CorruptDataException {
		return getUDATAAtOffset(J9MM_IterateSpaceDescriptor._idOffset_);
	}

	// UDATA id
	public UDATAPointer idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._idOffset_));
	}

	// void* memorySpace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memorySpaceOffset_", declaredType="void*")
	public VoidPointer memorySpace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9MM_IterateSpaceDescriptor._memorySpaceOffset_));
	}

	// void* memorySpace
	public PointerPointer memorySpaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._memorySpaceOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9MM_IterateSpaceDescriptor._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9MM_IterateSpaceDescriptor._nameOffset_));
	}

}
