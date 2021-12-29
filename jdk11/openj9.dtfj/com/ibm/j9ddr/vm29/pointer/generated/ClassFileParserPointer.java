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
 * Structure: ClassFileParserPointer
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
 * The generated code will provide getters for all elements in the ClassFileParserPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileParser.class)
public class ClassFileParserPointer extends StructurePointer {

	// NULL
	public static final ClassFileParserPointer NULL = new ClassFileParserPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileParserPointer(long address) {
		super(address);
	}

	public static ClassFileParserPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileParserPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileParserPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileParserPointer(address);
	}

	public ClassFileParserPointer add(long count) {
		return ClassFileParserPointer.cast(address + (ClassFileParser.SIZEOF * count));
	}

	public ClassFileParserPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileParserPointer addOffset(long offset) {
		return ClassFileParserPointer.cast(address + offset);
	}

	public ClassFileParserPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileParserPointer sub(long count) {
		return ClassFileParserPointer.cast(address - (ClassFileParser.SIZEOF * count));
	}

	public ClassFileParserPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileParserPointer subOffset(long offset) {
		return ClassFileParserPointer.cast(address - offset);
	}

	public ClassFileParserPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileParserPointer untag(long mask) {
		return ClassFileParserPointer.cast(address & ~mask);
	}

	public ClassFileParserPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileParser.SIZEOF;
	}

	// Implementation methods

	// J9CfrClassFile* _j9CfrClassFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__j9CfrClassFileOffset_", declaredType="J9CfrClassFile*")
	public J9CfrClassFilePointer _j9CfrClassFile() throws CorruptDataException {
		return J9CfrClassFilePointer.cast(getPointerAtOffset(ClassFileParser.__j9CfrClassFileOffset_));
	}

	// J9CfrClassFile* _j9CfrClassFile
	public PointerPointer _j9CfrClassFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileParser.__j9CfrClassFileOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(ClassFileParser.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileParser.__portLibraryOffset_));
	}

	// VerifyClassFunction _verifyClassFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verifyClassFunctionOffset_", declaredType="VerifyClassFunction")
	public VoidPointer _verifyClassFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ClassFileParser.__verifyClassFunctionOffset_));
	}

	// VerifyClassFunction _verifyClassFunction
	public PointerPointer _verifyClassFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileParser.__verifyClassFunctionOffset_));
	}

}
