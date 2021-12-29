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
 * Structure: J9JNIRedirectionBlockPointer
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
 * The generated code will provide getters for all elements in the J9JNIRedirectionBlockPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JNIRedirectionBlock.class)
public class J9JNIRedirectionBlockPointer extends StructurePointer {

	// NULL
	public static final J9JNIRedirectionBlockPointer NULL = new J9JNIRedirectionBlockPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JNIRedirectionBlockPointer(long address) {
		super(address);
	}

	public static J9JNIRedirectionBlockPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JNIRedirectionBlockPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JNIRedirectionBlockPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JNIRedirectionBlockPointer(address);
	}

	public J9JNIRedirectionBlockPointer add(long count) {
		return J9JNIRedirectionBlockPointer.cast(address + (J9JNIRedirectionBlock.SIZEOF * count));
	}

	public J9JNIRedirectionBlockPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JNIRedirectionBlockPointer addOffset(long offset) {
		return J9JNIRedirectionBlockPointer.cast(address + offset);
	}

	public J9JNIRedirectionBlockPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JNIRedirectionBlockPointer sub(long count) {
		return J9JNIRedirectionBlockPointer.cast(address - (J9JNIRedirectionBlock.SIZEOF * count));
	}

	public J9JNIRedirectionBlockPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JNIRedirectionBlockPointer subOffset(long offset) {
		return J9JNIRedirectionBlockPointer.cast(address - offset);
	}

	public J9JNIRedirectionBlockPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JNIRedirectionBlockPointer untag(long mask) {
		return J9JNIRedirectionBlockPointer.cast(address & ~mask);
	}

	public J9JNIRedirectionBlockPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JNIRedirectionBlock.SIZEOF;
	}

	// Implementation methods

	// U8* alloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocOffset_", declaredType="U8*")
	public U8Pointer alloc() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JNIRedirectionBlock._allocOffset_));
	}

	// U8* alloc
	public PointerPointer allocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JNIRedirectionBlock._allocOffset_));
	}

	// U8* end
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endOffset_", declaredType="U8*")
	public U8Pointer end() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9JNIRedirectionBlock._endOffset_));
	}

	// U8* end
	public PointerPointer endEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JNIRedirectionBlock._endOffset_));
	}

	// J9JNIRedirectionBlock* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9JNIRedirectionBlock*")
	public J9JNIRedirectionBlockPointer next() throws CorruptDataException {
		return J9JNIRedirectionBlockPointer.cast(getPointerAtOffset(J9JNIRedirectionBlock._nextOffset_));
	}

	// J9JNIRedirectionBlock* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JNIRedirectionBlock._nextOffset_));
	}

	// J9PortVmemIdentifier vmemID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmemIDOffset_", declaredType="J9PortVmemIdentifier")
	public J9PortVmemIdentifierPointer vmemID() throws CorruptDataException {
		return J9PortVmemIdentifierPointer.cast(nonNullFieldEA(J9JNIRedirectionBlock._vmemIDOffset_));
	}

	// J9PortVmemIdentifier vmemID
	public PointerPointer vmemIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JNIRedirectionBlock._vmemIDOffset_));
	}

}
