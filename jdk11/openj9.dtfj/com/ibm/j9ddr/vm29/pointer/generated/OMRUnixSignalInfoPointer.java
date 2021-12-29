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
 * Structure: OMRUnixSignalInfoPointer
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
 * The generated code will provide getters for all elements in the OMRUnixSignalInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRUnixSignalInfo.class)
public class OMRUnixSignalInfoPointer extends StructurePointer {

	// NULL
	public static final OMRUnixSignalInfoPointer NULL = new OMRUnixSignalInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRUnixSignalInfoPointer(long address) {
		super(address);
	}

	public static OMRUnixSignalInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRUnixSignalInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRUnixSignalInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRUnixSignalInfoPointer(address);
	}

	public OMRUnixSignalInfoPointer add(long count) {
		return OMRUnixSignalInfoPointer.cast(address + (OMRUnixSignalInfo.SIZEOF * count));
	}

	public OMRUnixSignalInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRUnixSignalInfoPointer addOffset(long offset) {
		return OMRUnixSignalInfoPointer.cast(address + offset);
	}

	public OMRUnixSignalInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRUnixSignalInfoPointer sub(long count) {
		return OMRUnixSignalInfoPointer.cast(address - (OMRUnixSignalInfo.SIZEOF * count));
	}

	public OMRUnixSignalInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRUnixSignalInfoPointer subOffset(long offset) {
		return OMRUnixSignalInfoPointer.cast(address - offset);
	}

	public OMRUnixSignalInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRUnixSignalInfoPointer untag(long mask) {
		return OMRUnixSignalInfoPointer.cast(address & ~mask);
	}

	public OMRUnixSignalInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRUnixSignalInfo.SIZEOF;
	}

	// Implementation methods

	// void* handlerAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlerAddressOffset_", declaredType="void*")
	public VoidPointer handlerAddress() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRUnixSignalInfo._handlerAddressOffset_));
	}

	// void* handlerAddress
	public PointerPointer handlerAddressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._handlerAddressOffset_));
	}

	// void* handlerAddress2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_handlerAddress2Offset_", declaredType="void*")
	public VoidPointer handlerAddress2() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRUnixSignalInfo._handlerAddress2Offset_));
	}

	// void* handlerAddress2
	public PointerPointer handlerAddress2EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._handlerAddress2Offset_));
	}

	// OMRPlatformSignalInfo platformSignalInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_platformSignalInfoOffset_", declaredType="OMRPlatformSignalInfo")
	public OMRPlatformSignalInfoPointer platformSignalInfo() throws CorruptDataException {
		return OMRPlatformSignalInfoPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._platformSignalInfoOffset_));
	}

	// OMRPlatformSignalInfo platformSignalInfo
	public PointerPointer platformSignalInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._platformSignalInfoOffset_));
	}

	// U32 portLibrarySignalType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibrarySignalTypeOffset_", declaredType="U32")
	public UDATA portLibrarySignalType() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRUnixSignalInfo._portLibrarySignalTypeOffset_));
	}

	// U32 portLibrarySignalType
	public UDATAPointer portLibrarySignalTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._portLibrarySignalTypeOffset_));
	}

	// siginfo_t* sigInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigInfoOffset_", declaredType="siginfo_t*")
	public __siginfoPointer sigInfo() throws CorruptDataException {
		return __siginfoPointer.cast(getPointerAtOffset(OMRUnixSignalInfo._sigInfoOffset_));
	}

	// siginfo_t* sigInfo
	public PointerPointer sigInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRUnixSignalInfo._sigInfoOffset_));
	}

}
