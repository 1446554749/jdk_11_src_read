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
 * Structure: workBufferPointer
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
 * The generated code will provide getters for all elements in the workBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=workBuffer.class)
public class workBufferPointer extends StructurePointer {

	// NULL
	public static final workBufferPointer NULL = new workBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected workBufferPointer(long address) {
		super(address);
	}

	public static workBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static workBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static workBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new workBufferPointer(address);
	}

	public workBufferPointer add(long count) {
		return workBufferPointer.cast(address + (workBuffer.SIZEOF * count));
	}

	public workBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public workBufferPointer addOffset(long offset) {
		return workBufferPointer.cast(address + offset);
	}

	public workBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public workBufferPointer sub(long count) {
		return workBufferPointer.cast(address - (workBuffer.SIZEOF * count));
	}

	public workBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public workBufferPointer subOffset(long offset) {
		return workBufferPointer.cast(address - offset);
	}

	public workBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public workBufferPointer untag(long mask) {
		return workBufferPointer.cast(address & ~mask);
	}

	public workBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return workBuffer.SIZEOF;
	}

	// Implementation methods

	// UDATA* bufferEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferEndOffset_", declaredType="UDATA*")
	public UDATAPointer bufferEnd() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(workBuffer._bufferEndOffset_));
	}

	// UDATA* bufferEnd
	public PointerPointer bufferEndEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(workBuffer._bufferEndOffset_));
	}

	// UDATA* bufferStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferStartOffset_", declaredType="UDATA*")
	public UDATAPointer bufferStart() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(workBuffer._bufferStartOffset_));
	}

	// UDATA* bufferStart
	public PointerPointer bufferStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(workBuffer._bufferStartOffset_));
	}

	// UDATA cntr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cntrOffset_", declaredType="UDATA")
	public UDATA cntr() throws CorruptDataException {
		return getUDATAAtOffset(workBuffer._cntrOffset_);
	}

	// UDATA cntr
	public UDATAPointer cntrEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(workBuffer._cntrOffset_));
	}

	// UDATA* currentAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentAllocOffset_", declaredType="UDATA*")
	public UDATAPointer currentAlloc() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(workBuffer._currentAllocOffset_));
	}

	// UDATA* currentAlloc
	public PointerPointer currentAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(workBuffer._currentAllocOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(workBuffer._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(workBuffer._portLibOffset_));
	}

}
