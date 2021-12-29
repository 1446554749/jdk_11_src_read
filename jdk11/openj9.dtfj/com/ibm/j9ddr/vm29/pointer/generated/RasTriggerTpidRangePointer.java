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
 * Structure: RasTriggerTpidRangePointer
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
 * The generated code will provide getters for all elements in the RasTriggerTpidRangePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasTriggerTpidRange.class)
public class RasTriggerTpidRangePointer extends StructurePointer {

	// NULL
	public static final RasTriggerTpidRangePointer NULL = new RasTriggerTpidRangePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasTriggerTpidRangePointer(long address) {
		super(address);
	}

	public static RasTriggerTpidRangePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasTriggerTpidRangePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasTriggerTpidRangePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasTriggerTpidRangePointer(address);
	}

	public RasTriggerTpidRangePointer add(long count) {
		return RasTriggerTpidRangePointer.cast(address + (RasTriggerTpidRange.SIZEOF * count));
	}

	public RasTriggerTpidRangePointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasTriggerTpidRangePointer addOffset(long offset) {
		return RasTriggerTpidRangePointer.cast(address + offset);
	}

	public RasTriggerTpidRangePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasTriggerTpidRangePointer sub(long count) {
		return RasTriggerTpidRangePointer.cast(address - (RasTriggerTpidRange.SIZEOF * count));
	}

	public RasTriggerTpidRangePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasTriggerTpidRangePointer subOffset(long offset) {
		return RasTriggerTpidRangePointer.cast(address - offset);
	}

	public RasTriggerTpidRangePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasTriggerTpidRangePointer untag(long mask) {
		return RasTriggerTpidRangePointer.cast(address & ~mask);
	}

	public RasTriggerTpidRangePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasTriggerTpidRange.SIZEOF;
	}

	// Implementation methods

	// U32 actionIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_actionIndexOffset_", declaredType="U32")
	public UDATA actionIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerTpidRange._actionIndexOffset_));
	}

	// U32 actionIndex
	public UDATAPointer actionIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._actionIndexOffset_));
	}

	// U8* compName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_compNameOffset_", declaredType="U8*")
	public U8Pointer compName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(RasTriggerTpidRange._compNameOffset_));
	}

	// U8* compName
	public PointerPointer compNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerTpidRange._compNameOffset_));
	}

	// U32 delay
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_delayOffset_", declaredType="U32")
	public UDATA delay() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerTpidRange._delayOffset_));
	}

	// U32 delay
	public UDATAPointer delayEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._delayOffset_));
	}

	// U32 endTpid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_endTpidOffset_", declaredType="U32")
	public UDATA endTpid() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerTpidRange._endTpidOffset_));
	}

	// U32 endTpid
	public UDATAPointer endTpidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._endTpidOffset_));
	}

	// RasHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="RasHeader")
	public RasHeaderPointer header() throws CorruptDataException {
		return RasHeaderPointer.cast(nonNullFieldEA(RasTriggerTpidRange._headerOffset_));
	}

	// RasHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerTpidRange._headerOffset_));
	}

	// I32 match
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_matchOffset_", declaredType="I32")
	public IDATA match() throws CorruptDataException {
		return new I32(getIntAtOffset(RasTriggerTpidRange._matchOffset_));
	}

	// I32 match
	public IDATAPointer matchEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._matchOffset_));
	}

	// RasTriggerTpidRange* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="RasTriggerTpidRange*")
	public RasTriggerTpidRangePointer next() throws CorruptDataException {
		return RasTriggerTpidRangePointer.cast(getPointerAtOffset(RasTriggerTpidRange._nextOffset_));
	}

	// RasTriggerTpidRange* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerTpidRange._nextOffset_));
	}

	// U64 spinlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinlockOffset_", declaredType="U64")
	public UDATA spinlock() throws CorruptDataException {
		return new U64(getLongAtOffset(RasTriggerTpidRange._spinlockOffset_));
	}

	// U64 spinlock
	public UDATAPointer spinlockEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._spinlockOffset_));
	}

	// U32 startTpid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTpidOffset_", declaredType="U32")
	public UDATA startTpid() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerTpidRange._startTpidOffset_));
	}

	// U32 startTpid
	public UDATAPointer startTpidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerTpidRange._startTpidOffset_));
	}

}
