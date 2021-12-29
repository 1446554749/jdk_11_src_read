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
 * Structure: J9InitializeJavaVMArgsPointer
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
 * The generated code will provide getters for all elements in the J9InitializeJavaVMArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9InitializeJavaVMArgs.class)
public class J9InitializeJavaVMArgsPointer extends StructurePointer {

	// NULL
	public static final J9InitializeJavaVMArgsPointer NULL = new J9InitializeJavaVMArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9InitializeJavaVMArgsPointer(long address) {
		super(address);
	}

	public static J9InitializeJavaVMArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9InitializeJavaVMArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9InitializeJavaVMArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9InitializeJavaVMArgsPointer(address);
	}

	public J9InitializeJavaVMArgsPointer add(long count) {
		return J9InitializeJavaVMArgsPointer.cast(address + (J9InitializeJavaVMArgs.SIZEOF * count));
	}

	public J9InitializeJavaVMArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9InitializeJavaVMArgsPointer addOffset(long offset) {
		return J9InitializeJavaVMArgsPointer.cast(address + offset);
	}

	public J9InitializeJavaVMArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9InitializeJavaVMArgsPointer sub(long count) {
		return J9InitializeJavaVMArgsPointer.cast(address - (J9InitializeJavaVMArgs.SIZEOF * count));
	}

	public J9InitializeJavaVMArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9InitializeJavaVMArgsPointer subOffset(long offset) {
		return J9InitializeJavaVMArgsPointer.cast(address - offset);
	}

	public J9InitializeJavaVMArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9InitializeJavaVMArgsPointer untag(long mask) {
		return J9InitializeJavaVMArgsPointer.cast(address & ~mask);
	}

	public J9InitializeJavaVMArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9InitializeJavaVMArgs.SIZEOF;
	}

	// Implementation methods

	// void** globalJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalJavaVMOffset_", declaredType="void**")
	public PointerPointer globalJavaVM() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._globalJavaVMOffset_));
	}

	// void** globalJavaVM
	public PointerPointer globalJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._globalJavaVMOffset_));
	}

	// U8* j2seRootDirectory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2seRootDirectoryOffset_", declaredType="U8*")
	public U8Pointer j2seRootDirectory() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._j2seRootDirectoryOffset_));
	}

	// U8* j2seRootDirectory
	public PointerPointer j2seRootDirectoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._j2seRootDirectoryOffset_));
	}

	// UDATA j2seVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j2seVersionOffset_", declaredType="UDATA")
	public UDATA j2seVersion() throws CorruptDataException {
		return getUDATAAtOffset(J9InitializeJavaVMArgs._j2seVersionOffset_);
	}

	// UDATA j2seVersion
	public UDATAPointer j2seVersionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._j2seVersionOffset_));
	}

	// U8* j9libvmDirectory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9libvmDirectoryOffset_", declaredType="U8*")
	public U8Pointer j9libvmDirectory() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._j9libvmDirectoryOffset_));
	}

	// U8* j9libvmDirectory
	public PointerPointer j9libvmDirectoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._j9libvmDirectoryOffset_));
	}

	// void* osMainThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osMainThreadOffset_", declaredType="void*")
	public VoidPointer osMainThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._osMainThreadOffset_));
	}

	// void* osMainThread
	public PointerPointer osMainThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._osMainThreadOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._vmOffset_));
	}

	// void* vm_args
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vm_argsOffset_", declaredType="void*")
	public VoidPointer vm_args() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9InitializeJavaVMArgs._vm_argsOffset_));
	}

	// void* vm_args
	public PointerPointer vm_argsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9InitializeJavaVMArgs._vm_argsOffset_));
	}

}
