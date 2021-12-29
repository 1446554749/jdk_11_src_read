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
 * Structure: JavaVMInitArgsPointer
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
 * The generated code will provide getters for all elements in the JavaVMInitArgsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JavaVMInitArgs.class)
public class JavaVMInitArgsPointer extends StructurePointer {

	// NULL
	public static final JavaVMInitArgsPointer NULL = new JavaVMInitArgsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JavaVMInitArgsPointer(long address) {
		super(address);
	}

	public static JavaVMInitArgsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JavaVMInitArgsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JavaVMInitArgsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JavaVMInitArgsPointer(address);
	}

	public JavaVMInitArgsPointer add(long count) {
		return JavaVMInitArgsPointer.cast(address + (JavaVMInitArgs.SIZEOF * count));
	}

	public JavaVMInitArgsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public JavaVMInitArgsPointer addOffset(long offset) {
		return JavaVMInitArgsPointer.cast(address + offset);
	}

	public JavaVMInitArgsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JavaVMInitArgsPointer sub(long count) {
		return JavaVMInitArgsPointer.cast(address - (JavaVMInitArgs.SIZEOF * count));
	}

	public JavaVMInitArgsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JavaVMInitArgsPointer subOffset(long offset) {
		return JavaVMInitArgsPointer.cast(address - offset);
	}

	public JavaVMInitArgsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JavaVMInitArgsPointer untag(long mask) {
		return JavaVMInitArgsPointer.cast(address & ~mask);
	}

	public JavaVMInitArgsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JavaVMInitArgs.SIZEOF;
	}

	// Implementation methods

	// jboolean ignoreUnrecognized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ignoreUnrecognizedOffset_", declaredType="jboolean")
	public U8 ignoreUnrecognized() throws CorruptDataException {
		return new U8(getByteAtOffset(JavaVMInitArgs._ignoreUnrecognizedOffset_));
	}

	// jboolean ignoreUnrecognized
	public U8Pointer ignoreUnrecognizedEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(JavaVMInitArgs._ignoreUnrecognizedOffset_));
	}

	// jint nOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nOptionsOffset_", declaredType="jint")
	public IDATA nOptions() throws CorruptDataException {
		return new I32(getIntAtOffset(JavaVMInitArgs._nOptionsOffset_));
	}

	// jint nOptions
	public IDATAPointer nOptionsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(JavaVMInitArgs._nOptionsOffset_));
	}

	// JavaVMOption* options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionsOffset_", declaredType="JavaVMOption*")
	public JavaVMOptionPointer options() throws CorruptDataException {
		return JavaVMOptionPointer.cast(getPointerAtOffset(JavaVMInitArgs._optionsOffset_));
	}

	// JavaVMOption* options
	public PointerPointer optionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JavaVMInitArgs._optionsOffset_));
	}

	// jint version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="jint")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(JavaVMInitArgs._versionOffset_));
	}

	// jint version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(JavaVMInitArgs._versionOffset_));
	}

}
