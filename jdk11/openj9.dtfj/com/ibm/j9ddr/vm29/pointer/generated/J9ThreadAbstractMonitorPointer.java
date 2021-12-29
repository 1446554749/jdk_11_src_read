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
 * Structure: J9ThreadAbstractMonitorPointer
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
 * The generated code will provide getters for all elements in the J9ThreadAbstractMonitorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadAbstractMonitor.class)
public class J9ThreadAbstractMonitorPointer extends StructurePointer {

	// NULL
	public static final J9ThreadAbstractMonitorPointer NULL = new J9ThreadAbstractMonitorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadAbstractMonitorPointer(long address) {
		super(address);
	}

	public static J9ThreadAbstractMonitorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadAbstractMonitorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadAbstractMonitorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadAbstractMonitorPointer(address);
	}

	public J9ThreadAbstractMonitorPointer add(long count) {
		return J9ThreadAbstractMonitorPointer.cast(address + (J9ThreadAbstractMonitor.SIZEOF * count));
	}

	public J9ThreadAbstractMonitorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadAbstractMonitorPointer addOffset(long offset) {
		return J9ThreadAbstractMonitorPointer.cast(address + offset);
	}

	public J9ThreadAbstractMonitorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadAbstractMonitorPointer sub(long count) {
		return J9ThreadAbstractMonitorPointer.cast(address - (J9ThreadAbstractMonitor.SIZEOF * count));
	}

	public J9ThreadAbstractMonitorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadAbstractMonitorPointer subOffset(long offset) {
		return J9ThreadAbstractMonitorPointer.cast(address - offset);
	}

	public J9ThreadAbstractMonitorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadAbstractMonitorPointer untag(long mask) {
		return J9ThreadAbstractMonitorPointer.cast(address & ~mask);
	}

	public J9ThreadAbstractMonitorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadAbstractMonitor.SIZEOF;
	}

	// Implementation methods

	// J9Thread* blocking
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_blockingOffset_", declaredType="J9Thread*")
	public J9ThreadPointer blocking() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._blockingOffset_));
	}

	// J9Thread* blocking
	public PointerPointer blockingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._blockingOffset_));
	}

	// U64 count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countOffset_", declaredType="U64")
	public UDATA count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._countOffset_));
	}

	// U64 count
	public UDATAPointer countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._countOffset_));
	}

	// const J9ThreadCustomSpinOptions* customSpinOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_customSpinOptionsOffset_", declaredType="const J9ThreadCustomSpinOptions*")
	public J9ThreadCustomSpinOptionsPointer customSpinOptions() throws CorruptDataException {
		return J9ThreadCustomSpinOptionsPointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._customSpinOptionsOffset_));
	}

	// const J9ThreadCustomSpinOptions* customSpinOptions
	public PointerPointer customSpinOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._customSpinOptionsOffset_));
	}

	// U64 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U64")
	public UDATA flags() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._flagsOffset_));
	}

	// U64 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._flagsOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._nameOffset_));
	}

	// volatile J9Thread* owner
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ownerOffset_", declaredType="volatile J9Thread*")
	public J9ThreadPointer owner() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._ownerOffset_));
	}

	// volatile J9Thread* owner
	public PointerPointer ownerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._ownerOffset_));
	}

	// U64 pinCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pinCountOffset_", declaredType="U64")
	public UDATA pinCount() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._pinCountOffset_));
	}

	// U64 pinCount
	public UDATAPointer pinCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._pinCountOffset_));
	}

	// U64 sampleCounter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sampleCounterOffset_", declaredType="U64")
	public UDATA sampleCounter() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._sampleCounterOffset_));
	}

	// U64 sampleCounter
	public UDATAPointer sampleCounterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._sampleCounterOffset_));
	}

	// U64 spinCount1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinCount1Offset_", declaredType="U64")
	public UDATA spinCount1() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._spinCount1Offset_));
	}

	// U64 spinCount1
	public UDATAPointer spinCount1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._spinCount1Offset_));
	}

	// U64 spinCount2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinCount2Offset_", declaredType="U64")
	public UDATA spinCount2() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._spinCount2Offset_));
	}

	// U64 spinCount2
	public UDATAPointer spinCount2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._spinCount2Offset_));
	}

	// U64 spinCount3
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinCount3Offset_", declaredType="U64")
	public UDATA spinCount3() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._spinCount3Offset_));
	}

	// U64 spinCount3
	public UDATAPointer spinCount3EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._spinCount3Offset_));
	}

	// volatile U64 spinThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinThreadsOffset_", declaredType="volatile U64")
	public UDATA spinThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._spinThreadsOffset_));
	}

	// volatile U64 spinThreads
	public UDATAPointer spinThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._spinThreadsOffset_));
	}

	// U64 spinlockState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spinlockStateOffset_", declaredType="U64")
	public UDATA spinlockState() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._spinlockStateOffset_));
	}

	// U64 spinlockState
	public UDATAPointer spinlockStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._spinlockStateOffset_));
	}

	// J9ThreadMonitorTracing* tracing
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracingOffset_", declaredType="J9ThreadMonitorTracing*")
	public J9ThreadMonitorTracingPointer tracing() throws CorruptDataException {
		return J9ThreadMonitorTracingPointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._tracingOffset_));
	}

	// J9ThreadMonitorTracing* tracing
	public PointerPointer tracingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._tracingOffset_));
	}

	// U64 userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="U64")
	public UDATA userData() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadAbstractMonitor._userDataOffset_));
	}

	// U64 userData
	public UDATAPointer userDataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._userDataOffset_));
	}

	// J9Thread* waiting
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_waitingOffset_", declaredType="J9Thread*")
	public J9ThreadPointer waiting() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(J9ThreadAbstractMonitor._waitingOffset_));
	}

	// J9Thread* waiting
	public PointerPointer waitingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadAbstractMonitor._waitingOffset_));
	}

}
