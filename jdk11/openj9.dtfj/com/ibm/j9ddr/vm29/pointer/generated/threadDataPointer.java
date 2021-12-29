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
 * Structure: threadDataPointer
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
 * The generated code will provide getters for all elements in the threadDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=threadData.class)
public class threadDataPointer extends StructurePointer {

	// NULL
	public static final threadDataPointer NULL = new threadDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected threadDataPointer(long address) {
		super(address);
	}

	public static threadDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static threadDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static threadDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new threadDataPointer(address);
	}

	public threadDataPointer add(long count) {
		return threadDataPointer.cast(address + (threadData.SIZEOF * count));
	}

	public threadDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public threadDataPointer addOffset(long offset) {
		return threadDataPointer.cast(address + offset);
	}

	public threadDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public threadDataPointer sub(long count) {
		return threadDataPointer.cast(address - (threadData.SIZEOF * count));
	}

	public threadDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public threadDataPointer subOffset(long offset) {
		return threadDataPointer.cast(address - offset);
	}

	public threadDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public threadDataPointer untag(long mask) {
		return threadDataPointer.cast(address & ~mask);
	}

	public threadDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return threadData.SIZEOF;
	}

	// Implementation methods

	// J9Heap* heap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapOffset_", declaredType="J9Heap*")
	public J9HeapPointer heap() throws CorruptDataException {
		return J9HeapPointer.cast(getPointerAtOffset(threadData._heapOffset_));
	}

	// J9Heap* heap
	public PointerPointer heapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(threadData._heapOffset_));
	}

	// void* signalInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signalInfoOffset_", declaredType="void*")
	public VoidPointer signalInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(threadData._signalInfoOffset_));
	}

	// void* signalInfo
	public PointerPointer signalInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(threadData._signalInfoOffset_));
	}

	// J9PlatformThread* threadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadInfoOffset_", declaredType="J9PlatformThread*")
	public J9PlatformThreadPointer threadInfo() throws CorruptDataException {
		return J9PlatformThreadPointer.cast(getPointerAtOffset(threadData._threadInfoOffset_));
	}

	// J9PlatformThread* threadInfo
	public PointerPointer threadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(threadData._threadInfoOffset_));
	}

}
