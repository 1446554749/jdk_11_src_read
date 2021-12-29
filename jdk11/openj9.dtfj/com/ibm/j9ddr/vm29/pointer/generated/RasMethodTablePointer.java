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
 * Structure: RasMethodTablePointer
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
 * The generated code will provide getters for all elements in the RasMethodTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasMethodTable.class)
public class RasMethodTablePointer extends StructurePointer {

	// NULL
	public static final RasMethodTablePointer NULL = new RasMethodTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasMethodTablePointer(long address) {
		super(address);
	}

	public static RasMethodTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasMethodTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasMethodTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasMethodTablePointer(address);
	}

	public RasMethodTablePointer add(long count) {
		return RasMethodTablePointer.cast(address + (RasMethodTable.SIZEOF * count));
	}

	public RasMethodTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasMethodTablePointer addOffset(long offset) {
		return RasMethodTablePointer.cast(address + offset);
	}

	public RasMethodTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasMethodTablePointer sub(long count) {
		return RasMethodTablePointer.cast(address - (RasMethodTable.SIZEOF * count));
	}

	public RasMethodTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasMethodTablePointer subOffset(long offset) {
		return RasMethodTablePointer.cast(address - offset);
	}

	public RasMethodTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasMethodTablePointer untag(long mask) {
		return RasMethodTablePointer.cast(address & ~mask);
	}

	public RasMethodTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasMethodTable.SIZEOF;
	}

	// Implementation methods

	// I32 classMatchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classMatchFlagOffset_", declaredType="I32")
	public IDATA classMatchFlag() throws CorruptDataException {
		return new I32(getIntAtOffset(RasMethodTable._classMatchFlagOffset_));
	}

	// I32 classMatchFlag
	public IDATAPointer classMatchFlagEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasMethodTable._classMatchFlagOffset_));
	}

	// J9UTF8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer className() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(RasMethodTable._classNameOffset_));
	}

	// J9UTF8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasMethodTable._classNameOffset_));
	}

	// BOOLEAN includeFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_includeFlagOffset_", declaredType="BOOLEAN")
	public UDATA includeFlag() throws CorruptDataException {
		return new U32(getIntAtOffset(RasMethodTable._includeFlagOffset_));
	}

	// BOOLEAN includeFlag
	public UDATAPointer includeFlagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasMethodTable._includeFlagOffset_));
	}

	// I32 methodMatchFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodMatchFlagOffset_", declaredType="I32")
	public IDATA methodMatchFlag() throws CorruptDataException {
		return new I32(getIntAtOffset(RasMethodTable._methodMatchFlagOffset_));
	}

	// I32 methodMatchFlag
	public IDATAPointer methodMatchFlagEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasMethodTable._methodMatchFlagOffset_));
	}

	// J9UTF8* methodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodNameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer methodName() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(RasMethodTable._methodNameOffset_));
	}

	// J9UTF8* methodName
	public PointerPointer methodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasMethodTable._methodNameOffset_));
	}

	// RasMethodTable* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="RasMethodTable*")
	public RasMethodTablePointer next() throws CorruptDataException {
		return RasMethodTablePointer.cast(getPointerAtOffset(RasMethodTable._nextOffset_));
	}

	// RasMethodTable* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasMethodTable._nextOffset_));
	}

	// BOOLEAN traceInputRetVals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceInputRetValsOffset_", declaredType="BOOLEAN")
	public UDATA traceInputRetVals() throws CorruptDataException {
		return new U32(getIntAtOffset(RasMethodTable._traceInputRetValsOffset_));
	}

	// BOOLEAN traceInputRetVals
	public UDATAPointer traceInputRetValsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasMethodTable._traceInputRetValsOffset_));
	}

}
