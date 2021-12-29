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
 * Structure: J9GcMemoryParameterPointer
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
 * The generated code will provide getters for all elements in the J9GcMemoryParameterPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9GcMemoryParameter.class)
public class J9GcMemoryParameterPointer extends StructurePointer {

	// NULL
	public static final J9GcMemoryParameterPointer NULL = new J9GcMemoryParameterPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9GcMemoryParameterPointer(long address) {
		super(address);
	}

	public static J9GcMemoryParameterPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9GcMemoryParameterPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9GcMemoryParameterPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9GcMemoryParameterPointer(address);
	}

	public J9GcMemoryParameterPointer add(long count) {
		return J9GcMemoryParameterPointer.cast(address + (J9GcMemoryParameter.SIZEOF * count));
	}

	public J9GcMemoryParameterPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9GcMemoryParameterPointer addOffset(long offset) {
		return J9GcMemoryParameterPointer.cast(address + offset);
	}

	public J9GcMemoryParameterPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9GcMemoryParameterPointer sub(long count) {
		return J9GcMemoryParameterPointer.cast(address - (J9GcMemoryParameter.SIZEOF * count));
	}

	public J9GcMemoryParameterPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9GcMemoryParameterPointer subOffset(long offset) {
		return J9GcMemoryParameterPointer.cast(address - offset);
	}

	public J9GcMemoryParameterPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9GcMemoryParameterPointer untag(long mask) {
		return J9GcMemoryParameterPointer.cast(address & ~mask);
	}

	public J9GcMemoryParameterPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9GcMemoryParameter.SIZEOF;
	}

	// Implementation methods

	// void fieldOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffsetOffset_", declaredType="void")
	public VoidPointer fieldOffset() throws CorruptDataException {
		return VoidPointer.cast(nonNullFieldEA(J9GcMemoryParameter._fieldOffsetOffset_));
	}

	// void fieldOffset
	public PointerPointer fieldOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9GcMemoryParameter._fieldOffsetOffset_));
	}

	// gcMemoryParameters optionName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionNameOffset_", declaredType="gcMemoryParameters")
	public long optionName() throws CorruptDataException {
		if (gcMemoryParameters.SIZEOF == 1) {
			return getByteAtOffset(J9GcMemoryParameter._optionNameOffset_);
		} else if (gcMemoryParameters.SIZEOF == 2) {
			return getShortAtOffset(J9GcMemoryParameter._optionNameOffset_);
		} else if (gcMemoryParameters.SIZEOF == 4) {
			return getIntAtOffset(J9GcMemoryParameter._optionNameOffset_);
		} else if (gcMemoryParameters.SIZEOF == 8) {
			return getLongAtOffset(J9GcMemoryParameter._optionNameOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// gcMemoryParameters optionName
	public EnumPointer optionNameEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9GcMemoryParameter._optionNameOffset_), gcMemoryParameters.class);
	}

	// UDATA scaleDenominator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scaleDenominatorOffset_", declaredType="UDATA")
	public UDATA scaleDenominator() throws CorruptDataException {
		return getUDATAAtOffset(J9GcMemoryParameter._scaleDenominatorOffset_);
	}

	// UDATA scaleDenominator
	public UDATAPointer scaleDenominatorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GcMemoryParameter._scaleDenominatorOffset_));
	}

	// UDATA scaleNumerator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_scaleNumeratorOffset_", declaredType="UDATA")
	public UDATA scaleNumerator() throws CorruptDataException {
		return getUDATAAtOffset(J9GcMemoryParameter._scaleNumeratorOffset_);
	}

	// UDATA scaleNumerator
	public UDATAPointer scaleNumeratorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GcMemoryParameter._scaleNumeratorOffset_));
	}

	// void valueBaseOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueBaseOffsetOffset_", declaredType="void")
	public VoidPointer valueBaseOffset() throws CorruptDataException {
		return VoidPointer.cast(nonNullFieldEA(J9GcMemoryParameter._valueBaseOffsetOffset_));
	}

	// void valueBaseOffset
	public PointerPointer valueBaseOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9GcMemoryParameter._valueBaseOffsetOffset_));
	}

	// UDATA valueMax
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueMaxOffset_", declaredType="UDATA")
	public UDATA valueMax() throws CorruptDataException {
		return getUDATAAtOffset(J9GcMemoryParameter._valueMaxOffset_);
	}

	// UDATA valueMax
	public UDATAPointer valueMaxEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GcMemoryParameter._valueMaxOffset_));
	}

	// UDATA valueMin
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueMinOffset_", declaredType="UDATA")
	public UDATA valueMin() throws CorruptDataException {
		return getUDATAAtOffset(J9GcMemoryParameter._valueMinOffset_);
	}

	// UDATA valueMin
	public UDATAPointer valueMinEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GcMemoryParameter._valueMinOffset_));
	}

	// UDATA valueRound
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueRoundOffset_", declaredType="UDATA")
	public UDATA valueRound() throws CorruptDataException {
		return getUDATAAtOffset(J9GcMemoryParameter._valueRoundOffset_);
	}

	// UDATA valueRound
	public UDATAPointer valueRoundEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9GcMemoryParameter._valueRoundOffset_));
	}

}
