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
 * Structure: J9JITDecompilationInfoPointer
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
 * The generated code will provide getters for all elements in the J9JITDecompilationInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITDecompilationInfo.class)
public class J9JITDecompilationInfoPointer extends StructurePointer {

	// NULL
	public static final J9JITDecompilationInfoPointer NULL = new J9JITDecompilationInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITDecompilationInfoPointer(long address) {
		super(address);
	}

	public static J9JITDecompilationInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITDecompilationInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITDecompilationInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITDecompilationInfoPointer(address);
	}

	public J9JITDecompilationInfoPointer add(long count) {
		return J9JITDecompilationInfoPointer.cast(address + (J9JITDecompilationInfo.SIZEOF * count));
	}

	public J9JITDecompilationInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITDecompilationInfoPointer addOffset(long offset) {
		return J9JITDecompilationInfoPointer.cast(address + offset);
	}

	public J9JITDecompilationInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITDecompilationInfoPointer sub(long count) {
		return J9JITDecompilationInfoPointer.cast(address - (J9JITDecompilationInfo.SIZEOF * count));
	}

	public J9JITDecompilationInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITDecompilationInfoPointer subOffset(long offset) {
		return J9JITDecompilationInfoPointer.cast(address - offset);
	}

	public J9JITDecompilationInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITDecompilationInfoPointer untag(long mask) {
		return J9JITDecompilationInfoPointer.cast(address & ~mask);
	}

	public J9JITDecompilationInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITDecompilationInfo.SIZEOF;
	}

	// Implementation methods

	// UDATA* bp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bpOffset_", declaredType="UDATA*")
	public UDATAPointer bp() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9JITDecompilationInfo._bpOffset_));
	}

	// UDATA* bp
	public PointerPointer bpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._bpOffset_));
	}

	// J9Method* method
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodOffset_", declaredType="J9Method*")
	public J9MethodPointer method() throws CorruptDataException {
		return J9MethodPointer.cast(getPointerAtOffset(J9JITDecompilationInfo._methodOffset_));
	}

	// J9Method* method
	public PointerPointer methodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._methodOffset_));
	}

	// J9JITDecompilationInfo* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9JITDecompilationInfo*")
	public J9JITDecompilationInfoPointer next() throws CorruptDataException {
		return J9JITDecompilationInfoPointer.cast(getPointerAtOffset(J9JITDecompilationInfo._nextOffset_));
	}

	// J9JITDecompilationInfo* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._nextOffset_));
	}

	// J9OSRBuffer osrBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osrBufferOffset_", declaredType="J9OSRBuffer")
	public J9OSRBufferPointer osrBuffer() throws CorruptDataException {
		return J9OSRBufferPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._osrBufferOffset_));
	}

	// J9OSRBuffer osrBuffer
	public PointerPointer osrBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._osrBufferOffset_));
	}

	// U8* pc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pcOffset_", declaredType="U8*")
	public U8Pointer pc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JITDecompilationInfo._pcOffset_));
	}

	// U8* pc
	public PointerPointer pcEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._pcOffset_));
	}

	// void** pcAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pcAddressOffset_", declaredType="void**")
	public PointerPointer pcAddress() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JITDecompilationInfo._pcAddressOffset_));
	}

	// void** pcAddress
	public PointerPointer pcAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._pcAddressOffset_));
	}

	// UDATA reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reasonOffset_", declaredType="UDATA")
	public UDATA reason() throws CorruptDataException {
		return getUDATAAtOffset(J9JITDecompilationInfo._reasonOffset_);
	}

	// UDATA reason
	public UDATAPointer reasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._reasonOffset_));
	}

	// UDATA usesOSR
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_usesOSROffset_", declaredType="UDATA")
	public UDATA usesOSR() throws CorruptDataException {
		return getUDATAAtOffset(J9JITDecompilationInfo._usesOSROffset_);
	}

	// UDATA usesOSR
	public UDATAPointer usesOSREA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITDecompilationInfo._usesOSROffset_));
	}

}
