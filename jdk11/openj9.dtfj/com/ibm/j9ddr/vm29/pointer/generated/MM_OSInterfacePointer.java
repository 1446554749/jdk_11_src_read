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
 * Structure: MM_OSInterfacePointer
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
 * The generated code will provide getters for all elements in the MM_OSInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_OSInterface.class)
public class MM_OSInterfacePointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_OSInterfacePointer NULL = new MM_OSInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_OSInterfacePointer(long address) {
		super(address);
	}

	public static MM_OSInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_OSInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_OSInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_OSInterfacePointer(address);
	}

	public MM_OSInterfacePointer add(long count) {
		return MM_OSInterfacePointer.cast(address + (MM_OSInterface.SIZEOF * count));
	}

	public MM_OSInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_OSInterfacePointer addOffset(long offset) {
		return MM_OSInterfacePointer.cast(address + offset);
	}

	public MM_OSInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_OSInterfacePointer sub(long count) {
		return MM_OSInterfacePointer.cast(address - (MM_OSInterface.SIZEOF * count));
	}

	public MM_OSInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_OSInterfacePointer subOffset(long offset) {
		return MM_OSInterfacePointer.cast(address - offset);
	}

	public MM_OSInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_OSInterfacePointer untag(long mask) {
		return MM_OSInterfacePointer.cast(address & ~mask);
	}

	public MM_OSInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_OSInterface.SIZEOF;
	}

	// Implementation methods

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_OSInterface.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_OSInterface.__extensionsOffset_));
	}

	// U64 _numProcessors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numProcessorsOffset_", declaredType="U64")
	public UDATA _numProcessors() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_OSInterface.__numProcessorsOffset_));
	}

	// U64 _numProcessors
	public UDATAPointer _numProcessorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__numProcessorsOffset_));
	}

	// U64 _omrtime_hires_clock_nanoSecondDivideFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrtime_hires_clock_nanoSecondDivideFactorOffset_", declaredType="U64")
	public UDATA _omrtime_hires_clock_nanoSecondDivideFactor() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_OSInterface.__omrtime_hires_clock_nanoSecondDivideFactorOffset_));
	}

	// U64 _omrtime_hires_clock_nanoSecondDivideFactor
	public UDATAPointer _omrtime_hires_clock_nanoSecondDivideFactorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__omrtime_hires_clock_nanoSecondDivideFactorOffset_));
	}

	// U64 _omrtime_hires_clock_nanoSecondMultiplyFactor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrtime_hires_clock_nanoSecondMultiplyFactorOffset_", declaredType="U64")
	public UDATA _omrtime_hires_clock_nanoSecondMultiplyFactor() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_OSInterface.__omrtime_hires_clock_nanoSecondMultiplyFactorOffset_));
	}

	// U64 _omrtime_hires_clock_nanoSecondMultiplyFactor
	public UDATAPointer _omrtime_hires_clock_nanoSecondMultiplyFactorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__omrtime_hires_clock_nanoSecondMultiplyFactorOffset_));
	}

	// I64 _omrtime_hires_clock_nanoSecondOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrtime_hires_clock_nanoSecondOffsetOffset_", declaredType="I64")
	public IDATA _omrtime_hires_clock_nanoSecondOffset() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_OSInterface.__omrtime_hires_clock_nanoSecondOffsetOffset_));
	}

	// I64 _omrtime_hires_clock_nanoSecondOffset
	public IDATAPointer _omrtime_hires_clock_nanoSecondOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__omrtime_hires_clock_nanoSecondOffsetOffset_));
	}

	// U64 _physicalMemoryBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__physicalMemoryBytesOffset_", declaredType="U64")
	public UDATA _physicalMemoryBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_OSInterface.__physicalMemoryBytesOffset_));
	}

	// U64 _physicalMemoryBytes
	public UDATAPointer _physicalMemoryBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__physicalMemoryBytesOffset_));
	}

	// MM_ProcessorInfo* _processorInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__processorInfoOffset_", declaredType="MM_ProcessorInfo*")
	public MM_ProcessorInfoPointer _processorInfo() throws CorruptDataException {
		return MM_ProcessorInfoPointer.cast(getPointerAtOffset(MM_OSInterface.__processorInfoOffset_));
	}

	// MM_ProcessorInfo* _processorInfo
	public PointerPointer _processorInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_OSInterface.__processorInfoOffset_));
	}

	// U64 _ticksPerMicroSecond
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ticksPerMicroSecondOffset_", declaredType="U64")
	public UDATA _ticksPerMicroSecond() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_OSInterface.__ticksPerMicroSecondOffset_));
	}

	// U64 _ticksPerMicroSecond
	public UDATAPointer _ticksPerMicroSecondEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_OSInterface.__ticksPerMicroSecondOffset_));
	}

	// OMR_VM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_OSInterface.__vmOffset_));
	}

	// OMR_VM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_OSInterface.__vmOffset_));
	}

}
