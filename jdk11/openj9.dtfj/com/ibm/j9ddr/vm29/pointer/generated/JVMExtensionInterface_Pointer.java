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
 * Structure: JVMExtensionInterface_Pointer
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
 * The generated code will provide getters for all elements in the JVMExtensionInterface_Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JVMExtensionInterface_.class)
public class JVMExtensionInterface_Pointer extends StructurePointer {

	// NULL
	public static final JVMExtensionInterface_Pointer NULL = new JVMExtensionInterface_Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JVMExtensionInterface_Pointer(long address) {
		super(address);
	}

	public static JVMExtensionInterface_Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JVMExtensionInterface_Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JVMExtensionInterface_Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JVMExtensionInterface_Pointer(address);
	}

	public JVMExtensionInterface_Pointer add(long count) {
		return JVMExtensionInterface_Pointer.cast(address + (JVMExtensionInterface_.SIZEOF * count));
	}

	public JVMExtensionInterface_Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public JVMExtensionInterface_Pointer addOffset(long offset) {
		return JVMExtensionInterface_Pointer.cast(address + offset);
	}

	public JVMExtensionInterface_Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JVMExtensionInterface_Pointer sub(long count) {
		return JVMExtensionInterface_Pointer.cast(address - (JVMExtensionInterface_.SIZEOF * count));
	}

	public JVMExtensionInterface_Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JVMExtensionInterface_Pointer subOffset(long offset) {
		return JVMExtensionInterface_Pointer.cast(address - offset);
	}

	public JVMExtensionInterface_Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JVMExtensionInterface_Pointer untag(long mask) {
		return JVMExtensionInterface_Pointer.cast(address & ~mask);
	}

	public JVMExtensionInterface_Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JVMExtensionInterface_.SIZEOF;
	}

	// Implementation methods

	// void* QueryGCStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_QueryGCStatusOffset_", declaredType="void*")
	public VoidPointer QueryGCStatus() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMExtensionInterface_._QueryGCStatusOffset_));
	}

	// void* QueryGCStatus
	public PointerPointer QueryGCStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMExtensionInterface_._QueryGCStatusOffset_));
	}

	// void* QueryJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_QueryJavaVMOffset_", declaredType="void*")
	public VoidPointer QueryJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMExtensionInterface_._QueryJavaVMOffset_));
	}

	// void* QueryJavaVM
	public PointerPointer QueryJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMExtensionInterface_._QueryJavaVMOffset_));
	}

	// void* ResetJavaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ResetJavaVMOffset_", declaredType="void*")
	public VoidPointer ResetJavaVM() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMExtensionInterface_._ResetJavaVMOffset_));
	}

	// void* ResetJavaVM
	public PointerPointer ResetJavaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMExtensionInterface_._ResetJavaVMOffset_));
	}

	// U8[] eyecatcher
	public U8Pointer eyecatcherEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(JVMExtensionInterface_._eyecatcherOffset_));
	}

	// jint length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="jint")
	public IDATA length() throws CorruptDataException {
		return new I32(getIntAtOffset(JVMExtensionInterface_._lengthOffset_));
	}

	// jint length
	public IDATAPointer lengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(JVMExtensionInterface_._lengthOffset_));
	}

	// jint modification
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modificationOffset_", declaredType="jint")
	public IDATA modification() throws CorruptDataException {
		return new I32(getIntAtOffset(JVMExtensionInterface_._modificationOffset_));
	}

	// jint modification
	public IDATAPointer modificationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(JVMExtensionInterface_._modificationOffset_));
	}

	// jint version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="jint")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(JVMExtensionInterface_._versionOffset_));
	}

	// jint version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(JVMExtensionInterface_._versionOffset_));
	}

	// JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="JavaVM*")
	public JavaVM_Pointer vm() throws CorruptDataException {
		return JavaVM_Pointer.cast(getPointerAtOffset(JVMExtensionInterface_._vmOffset_));
	}

	// JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMExtensionInterface_._vmOffset_));
	}

}
