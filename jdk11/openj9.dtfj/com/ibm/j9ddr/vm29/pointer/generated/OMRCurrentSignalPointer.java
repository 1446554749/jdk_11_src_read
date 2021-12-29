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
 * Structure: OMRCurrentSignalPointer
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
 * The generated code will provide getters for all elements in the OMRCurrentSignalPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRCurrentSignal.class)
public class OMRCurrentSignalPointer extends StructurePointer {

	// NULL
	public static final OMRCurrentSignalPointer NULL = new OMRCurrentSignalPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRCurrentSignalPointer(long address) {
		super(address);
	}

	public static OMRCurrentSignalPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRCurrentSignalPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRCurrentSignalPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRCurrentSignalPointer(address);
	}

	public OMRCurrentSignalPointer add(long count) {
		return OMRCurrentSignalPointer.cast(address + (OMRCurrentSignal.SIZEOF * count));
	}

	public OMRCurrentSignalPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRCurrentSignalPointer addOffset(long offset) {
		return OMRCurrentSignalPointer.cast(address + offset);
	}

	public OMRCurrentSignalPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRCurrentSignalPointer sub(long count) {
		return OMRCurrentSignalPointer.cast(address - (OMRCurrentSignal.SIZEOF * count));
	}

	public OMRCurrentSignalPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRCurrentSignalPointer subOffset(long offset) {
		return OMRCurrentSignalPointer.cast(address - offset);
	}

	public OMRCurrentSignalPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRCurrentSignalPointer untag(long mask) {
		return OMRCurrentSignalPointer.cast(address & ~mask);
	}

	public OMRCurrentSignalPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRCurrentSignal.SIZEOF;
	}

	// Implementation methods

	// void* contextInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_contextInfoOffset_", declaredType="void*")
	public VoidPointer contextInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRCurrentSignal._contextInfoOffset_));
	}

	// void* contextInfo
	public PointerPointer contextInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRCurrentSignal._contextInfoOffset_));
	}

	// U32 portLibSignalType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibSignalTypeOffset_", declaredType="U32")
	public UDATA portLibSignalType() throws CorruptDataException {
		return new U32(getIntAtOffset(OMRCurrentSignal._portLibSignalTypeOffset_));
	}

	// U32 portLibSignalType
	public UDATAPointer portLibSignalTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRCurrentSignal._portLibSignalTypeOffset_));
	}

	// siginfo_t* sigInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sigInfoOffset_", declaredType="siginfo_t*")
	public __siginfoPointer sigInfo() throws CorruptDataException {
		return __siginfoPointer.cast(getPointerAtOffset(OMRCurrentSignal._sigInfoOffset_));
	}

	// siginfo_t* sigInfo
	public PointerPointer sigInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRCurrentSignal._sigInfoOffset_));
	}

	// I32 signal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signalOffset_", declaredType="I32")
	public IDATA signal() throws CorruptDataException {
		return new I32(getIntAtOffset(OMRCurrentSignal._signalOffset_));
	}

	// I32 signal
	public IDATAPointer signalEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRCurrentSignal._signalOffset_));
	}

}
