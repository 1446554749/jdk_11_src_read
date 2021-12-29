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
 * Structure: J9JVMTIHeapIteratorDataPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIHeapIteratorDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIHeapIteratorData.class)
public class J9JVMTIHeapIteratorDataPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIHeapIteratorDataPointer NULL = new J9JVMTIHeapIteratorDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIHeapIteratorDataPointer(long address) {
		super(address);
	}

	public static J9JVMTIHeapIteratorDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIHeapIteratorDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIHeapIteratorDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIHeapIteratorDataPointer(address);
	}

	public J9JVMTIHeapIteratorDataPointer add(long count) {
		return J9JVMTIHeapIteratorDataPointer.cast(address + (J9JVMTIHeapIteratorData.SIZEOF * count));
	}

	public J9JVMTIHeapIteratorDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIHeapIteratorDataPointer addOffset(long offset) {
		return J9JVMTIHeapIteratorDataPointer.cast(address + offset);
	}

	public J9JVMTIHeapIteratorDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIHeapIteratorDataPointer sub(long count) {
		return J9JVMTIHeapIteratorDataPointer.cast(address - (J9JVMTIHeapIteratorData.SIZEOF * count));
	}

	public J9JVMTIHeapIteratorDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIHeapIteratorDataPointer subOffset(long offset) {
		return J9JVMTIHeapIteratorDataPointer.cast(address - offset);
	}

	public J9JVMTIHeapIteratorDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIHeapIteratorDataPointer untag(long mask) {
		return J9JVMTIHeapIteratorDataPointer.cast(address & ~mask);
	}

	public J9JVMTIHeapIteratorDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIHeapIteratorData.SIZEOF;
	}

	// Implementation methods

	// jvmtiHeapObjectCallback callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callbackOffset_", declaredType="jvmtiHeapObjectCallback")
	public VoidPointer callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTIHeapIteratorData._callbackOffset_));
	}

	// jvmtiHeapObjectCallback callback
	public PointerPointer callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapIteratorData._callbackOffset_));
	}

	// J9Class* clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="J9Class*")
	public J9ClassPointer clazz() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JVMTIHeapIteratorData._clazzOffset_));
	}

	// J9Class* clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapIteratorData._clazzOffset_));
	}

	// J9JVMTIEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer env() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIHeapIteratorData._envOffset_));
	}

	// J9JVMTIEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapIteratorData._envOffset_));
	}

	// jvmtiHeapObjectFilter filter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filterOffset_", declaredType="jvmtiHeapObjectFilter")
	public long filter() throws CorruptDataException {
		if (jvmtiHeapObjectFilter.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapIteratorData._filterOffset_);
		} else if (jvmtiHeapObjectFilter.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapIteratorData._filterOffset_);
		} else if (jvmtiHeapObjectFilter.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapIteratorData._filterOffset_);
		} else if (jvmtiHeapObjectFilter.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapIteratorData._filterOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiHeapObjectFilter filter
	public EnumPointer filterEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapIteratorData._filterOffset_), jvmtiHeapObjectFilter.class);
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTIHeapIteratorData._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapIteratorData._userDataOffset_));
	}

}
