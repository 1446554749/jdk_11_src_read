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
 * Structure: ClassNameFilterDataPointer
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
 * The generated code will provide getters for all elements in the ClassNameFilterDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassNameFilterData.class)
public class ClassNameFilterDataPointer extends StructurePointer {

	// NULL
	public static final ClassNameFilterDataPointer NULL = new ClassNameFilterDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassNameFilterDataPointer(long address) {
		super(address);
	}

	public static ClassNameFilterDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassNameFilterDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassNameFilterDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassNameFilterDataPointer(address);
	}

	public ClassNameFilterDataPointer add(long count) {
		return ClassNameFilterDataPointer.cast(address + (ClassNameFilterData.SIZEOF * count));
	}

	public ClassNameFilterDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassNameFilterDataPointer addOffset(long offset) {
		return ClassNameFilterDataPointer.cast(address + offset);
	}

	public ClassNameFilterDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassNameFilterDataPointer sub(long count) {
		return ClassNameFilterDataPointer.cast(address - (ClassNameFilterData.SIZEOF * count));
	}

	public ClassNameFilterDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassNameFilterDataPointer subOffset(long offset) {
		return ClassNameFilterDataPointer.cast(address - offset);
	}

	public ClassNameFilterDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassNameFilterDataPointer untag(long mask) {
		return ClassNameFilterDataPointer.cast(address & ~mask);
	}

	public ClassNameFilterDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassNameFilterData.SIZEOF;
	}

	// Implementation methods

	// U8[] buffer
	public U8Pointer bufferEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(ClassNameFilterData._bufferOffset_));
	}

	// J9ClassLoader* classloader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classloaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classloader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(ClassNameFilterData._classloaderOffset_));
	}

	// J9ClassLoader* classloader
	public PointerPointer classloaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassNameFilterData._classloaderOffset_));
	}

	// U8* classname
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classnameOffset_", declaredType="U8*")
	public U8Pointer classname() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassNameFilterData._classnameOffset_));
	}

	// U8* classname
	public PointerPointer classnameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassNameFilterData._classnameOffset_));
	}

	// UDATA classnameLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classnameLenOffset_", declaredType="UDATA")
	public UDATA classnameLen() throws CorruptDataException {
		return getUDATAAtOffset(ClassNameFilterData._classnameLenOffset_);
	}

	// UDATA classnameLen
	public UDATAPointer classnameLenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassNameFilterData._classnameLenOffset_));
	}

}
