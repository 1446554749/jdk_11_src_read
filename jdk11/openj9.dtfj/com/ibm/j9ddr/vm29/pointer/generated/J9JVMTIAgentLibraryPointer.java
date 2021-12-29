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
 * Structure: J9JVMTIAgentLibraryPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIAgentLibraryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIAgentLibrary.class)
public class J9JVMTIAgentLibraryPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIAgentLibraryPointer NULL = new J9JVMTIAgentLibraryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIAgentLibraryPointer(long address) {
		super(address);
	}

	public static J9JVMTIAgentLibraryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIAgentLibraryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIAgentLibraryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIAgentLibraryPointer(address);
	}

	public J9JVMTIAgentLibraryPointer add(long count) {
		return J9JVMTIAgentLibraryPointer.cast(address + (J9JVMTIAgentLibrary.SIZEOF * count));
	}

	public J9JVMTIAgentLibraryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIAgentLibraryPointer addOffset(long offset) {
		return J9JVMTIAgentLibraryPointer.cast(address + offset);
	}

	public J9JVMTIAgentLibraryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIAgentLibraryPointer sub(long count) {
		return J9JVMTIAgentLibraryPointer.cast(address - (J9JVMTIAgentLibrary.SIZEOF * count));
	}

	public J9JVMTIAgentLibraryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIAgentLibraryPointer subOffset(long offset) {
		return J9JVMTIAgentLibraryPointer.cast(address - offset);
	}

	public J9JVMTIAgentLibraryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIAgentLibraryPointer untag(long mask) {
		return J9JVMTIAgentLibraryPointer.cast(address & ~mask);
	}

	public J9JVMTIAgentLibraryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIAgentLibrary.SIZEOF;
	}

	// Implementation methods

	// UDATA decorate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decorateOffset_", declaredType="UDATA")
	public UDATA decorate() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIAgentLibrary._decorateOffset_);
	}

	// UDATA decorate
	public UDATAPointer decorateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._decorateOffset_));
	}

	// J9InvocationJavaVM* invocationJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_invocationJavaVMOffset_", declaredType="J9InvocationJavaVM*")
	public J9InvocationJavaVMPointer invocationJavaVM() throws CorruptDataException {
		return J9InvocationJavaVMPointer.cast(getPointerAtOffset(J9JVMTIAgentLibrary._invocationJavaVMOffset_));
	}

	// J9InvocationJavaVM* invocationJavaVM
	public PointerPointer invocationJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._invocationJavaVMOffset_));
	}

	// UDATA loadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadCountOffset_", declaredType="UDATA")
	public UDATA loadCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIAgentLibrary._loadCountOffset_);
	}

	// UDATA loadCount
	public UDATAPointer loadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._loadCountOffset_));
	}

	// J9NativeLibrary nativeLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nativeLibOffset_", declaredType="J9NativeLibrary")
	public J9NativeLibraryPointer nativeLib() throws CorruptDataException {
		return J9NativeLibraryPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._nativeLibOffset_));
	}

	// J9NativeLibrary nativeLib
	public PointerPointer nativeLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._nativeLibOffset_));
	}

	// U8* options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionsOffset_", declaredType="U8*")
	public U8Pointer options() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JVMTIAgentLibrary._optionsOffset_));
	}

	// U8* options
	public PointerPointer optionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._optionsOffset_));
	}

	// J9VMDllLoadInfo* xRunLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_xRunLibraryOffset_", declaredType="J9VMDllLoadInfo*")
	public J9VMDllLoadInfoPointer xRunLibrary() throws CorruptDataException {
		return J9VMDllLoadInfoPointer.cast(getPointerAtOffset(J9JVMTIAgentLibrary._xRunLibraryOffset_));
	}

	// J9VMDllLoadInfo* xRunLibrary
	public PointerPointer xRunLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIAgentLibrary._xRunLibraryOffset_));
	}

}
