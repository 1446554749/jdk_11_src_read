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
 * Structure: J9RASSystemInfoPointer
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
 * The generated code will provide getters for all elements in the J9RASSystemInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RASSystemInfo.class)
public class J9RASSystemInfoPointer extends StructurePointer {

	// NULL
	public static final J9RASSystemInfoPointer NULL = new J9RASSystemInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RASSystemInfoPointer(long address) {
		super(address);
	}

	public static J9RASSystemInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RASSystemInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RASSystemInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RASSystemInfoPointer(address);
	}

	public J9RASSystemInfoPointer add(long count) {
		return J9RASSystemInfoPointer.cast(address + (J9RASSystemInfo.SIZEOF * count));
	}

	public J9RASSystemInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RASSystemInfoPointer addOffset(long offset) {
		return J9RASSystemInfoPointer.cast(address + offset);
	}

	public J9RASSystemInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RASSystemInfoPointer sub(long count) {
		return J9RASSystemInfoPointer.cast(address - (J9RASSystemInfo.SIZEOF * count));
	}

	public J9RASSystemInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RASSystemInfoPointer subOffset(long offset) {
		return J9RASSystemInfoPointer.cast(address - offset);
	}

	public J9RASSystemInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RASSystemInfoPointer untag(long mask) {
		return J9RASSystemInfoPointer.cast(address & ~mask);
	}

	public J9RASSystemInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RASSystemInfo.SIZEOF;
	}

	// Implementation methods

	// void* data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dataOffset_", declaredType="void*")
	public VoidPointer data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASSystemInfo._dataOffset_));
	}

	// void* data
	public PointerPointer dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASSystemInfo._dataOffset_));
	}

	// U32 key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_keyOffset_", declaredType="U32")
	public UDATA key() throws CorruptDataException {
		return new U32(getIntAtOffset(J9RASSystemInfo._keyOffset_));
	}

	// U32 key
	public UDATAPointer keyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RASSystemInfo._keyOffset_));
	}

	// J9RASSystemInfo* linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkNextOffset_", declaredType="J9RASSystemInfo*")
	public J9RASSystemInfoPointer linkNext() throws CorruptDataException {
		return J9RASSystemInfoPointer.cast(getPointerAtOffset(J9RASSystemInfo._linkNextOffset_));
	}

	// J9RASSystemInfo* linkNext
	public PointerPointer linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASSystemInfo._linkNextOffset_));
	}

	// J9RASSystemInfo* linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_linkPreviousOffset_", declaredType="J9RASSystemInfo*")
	public J9RASSystemInfoPointer linkPrevious() throws CorruptDataException {
		return J9RASSystemInfoPointer.cast(getPointerAtOffset(J9RASSystemInfo._linkPreviousOffset_));
	}

	// J9RASSystemInfo* linkPrevious
	public PointerPointer linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASSystemInfo._linkPreviousOffset_));
	}

}
