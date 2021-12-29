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
 * Structure: VMInterfaceFunctions_Pointer
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
 * The generated code will provide getters for all elements in the VMInterfaceFunctions_Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VMInterfaceFunctions_.class)
public class VMInterfaceFunctions_Pointer extends StructurePointer {

	// NULL
	public static final VMInterfaceFunctions_Pointer NULL = new VMInterfaceFunctions_Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VMInterfaceFunctions_Pointer(long address) {
		super(address);
	}

	public static VMInterfaceFunctions_Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VMInterfaceFunctions_Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VMInterfaceFunctions_Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VMInterfaceFunctions_Pointer(address);
	}

	public VMInterfaceFunctions_Pointer add(long count) {
		return VMInterfaceFunctions_Pointer.cast(address + (VMInterfaceFunctions_.SIZEOF * count));
	}

	public VMInterfaceFunctions_Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public VMInterfaceFunctions_Pointer addOffset(long offset) {
		return VMInterfaceFunctions_Pointer.cast(address + offset);
	}

	public VMInterfaceFunctions_Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VMInterfaceFunctions_Pointer sub(long count) {
		return VMInterfaceFunctions_Pointer.cast(address - (VMInterfaceFunctions_.SIZEOF * count));
	}

	public VMInterfaceFunctions_Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VMInterfaceFunctions_Pointer subOffset(long offset) {
		return VMInterfaceFunctions_Pointer.cast(address - offset);
	}

	public VMInterfaceFunctions_Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VMInterfaceFunctions_Pointer untag(long mask) {
		return VMInterfaceFunctions_Pointer.cast(address & ~mask);
	}

	public VMInterfaceFunctions_Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VMInterfaceFunctions_.SIZEOF;
	}

	// Implementation methods

	// void* CheckVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CheckVersionOffset_", declaredType="void*")
	public VoidPointer CheckVersion() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._CheckVersionOffset_));
	}

	// void* CheckVersion
	public PointerPointer CheckVersionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._CheckVersionOffset_));
	}

	// void* CountSystemProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CountSystemPropertiesOffset_", declaredType="void*")
	public VoidPointer CountSystemProperties() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._CountSystemPropertiesOffset_));
	}

	// void* CountSystemProperties
	public PointerPointer CountSystemPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._CountSystemPropertiesOffset_));
	}

	// void* GetInitArgs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetInitArgsOffset_", declaredType="void*")
	public VoidPointer GetInitArgs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetInitArgsOffset_));
	}

	// void* GetInitArgs
	public PointerPointer GetInitArgsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetInitArgsOffset_));
	}

	// void* GetJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetJavaVMOffset_", declaredType="void*")
	public VoidPointer GetJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetJavaVMOffset_));
	}

	// void* GetJavaVM
	public PointerPointer GetJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetJavaVMOffset_));
	}

	// void* GetPortLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetPortLibraryOffset_", declaredType="void*")
	public VoidPointer GetPortLibrary() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetPortLibraryOffset_));
	}

	// void* GetPortLibrary
	public PointerPointer GetPortLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetPortLibraryOffset_));
	}

	// void* GetSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSystemPropertyOffset_", declaredType="void*")
	public VoidPointer GetSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetSystemPropertyOffset_));
	}

	// void* GetSystemProperty
	public PointerPointer GetSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetSystemPropertyOffset_));
	}

	// void* GetVMLSFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetVMLSFunctionsOffset_", declaredType="void*")
	public VoidPointer GetVMLSFunctions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetVMLSFunctionsOffset_));
	}

	// void* GetVMLSFunctions
	public PointerPointer GetVMLSFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetVMLSFunctionsOffset_));
	}

	// void* GetZipFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetZipFunctionsOffset_", declaredType="void*")
	public VoidPointer GetZipFunctions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._GetZipFunctionsOffset_));
	}

	// void* GetZipFunctions
	public PointerPointer GetZipFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._GetZipFunctionsOffset_));
	}

	// void* IterateSystemProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateSystemPropertiesOffset_", declaredType="void*")
	public VoidPointer IterateSystemProperties() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._IterateSystemPropertiesOffset_));
	}

	// void* IterateSystemProperties
	public PointerPointer IterateSystemPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._IterateSystemPropertiesOffset_));
	}

	// void* SetSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetSystemPropertyOffset_", declaredType="void*")
	public VoidPointer SetSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMInterfaceFunctions_._SetSystemPropertyOffset_));
	}

	// void* SetSystemProperty
	public PointerPointer SetSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMInterfaceFunctions_._SetSystemPropertyOffset_));
	}

}
