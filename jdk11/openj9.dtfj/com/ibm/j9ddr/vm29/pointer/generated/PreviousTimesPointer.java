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
 * Structure: PreviousTimesPointer
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
 * The generated code will provide getters for all elements in the PreviousTimesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=PreviousTimes.class)
public class PreviousTimesPointer extends StructurePointer {

	// NULL
	public static final PreviousTimesPointer NULL = new PreviousTimesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected PreviousTimesPointer(long address) {
		super(address);
	}

	public static PreviousTimesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static PreviousTimesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static PreviousTimesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new PreviousTimesPointer(address);
	}

	public PreviousTimesPointer add(long count) {
		return PreviousTimesPointer.cast(address + (PreviousTimes.SIZEOF * count));
	}

	public PreviousTimesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public PreviousTimesPointer addOffset(long offset) {
		return PreviousTimesPointer.cast(address + offset);
	}

	public PreviousTimesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public PreviousTimesPointer sub(long count) {
		return PreviousTimesPointer.cast(address - (PreviousTimes.SIZEOF * count));
	}

	public PreviousTimesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public PreviousTimesPointer subOffset(long offset) {
		return PreviousTimesPointer.cast(address - offset);
	}

	public PreviousTimesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public PreviousTimesPointer untag(long mask) {
		return PreviousTimesPointer.cast(address & ~mask);
	}

	public PreviousTimesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return PreviousTimes.SIZEOF;
	}

	// Implementation methods

	// U64 allocationFailure
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocationFailureOffset_", declaredType="U64")
	public UDATA allocationFailure() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._allocationFailureOffset_));
	}

	// U64 allocationFailure
	public UDATAPointer allocationFailureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._allocationFailureOffset_));
	}

	// U64 balancedGlobalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_balancedGlobalGCOffset_", declaredType="U64")
	public UDATA balancedGlobalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._balancedGlobalGCOffset_));
	}

	// U64 balancedGlobalGC
	public UDATAPointer balancedGlobalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._balancedGlobalGCOffset_));
	}

	// U64 concurrentGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentGCOffset_", declaredType="U64")
	public UDATA concurrentGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._concurrentGCOffset_));
	}

	// U64 concurrentGC
	public UDATAPointer concurrentGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._concurrentGCOffset_));
	}

	// U64 exclusiveAccessEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessEndOffset_", declaredType="U64")
	public UDATA exclusiveAccessEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._exclusiveAccessEndOffset_));
	}

	// U64 exclusiveAccessEnd
	public UDATAPointer exclusiveAccessEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._exclusiveAccessEndOffset_));
	}

	// U64 exclusiveAccessStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessStartOffset_", declaredType="U64")
	public UDATA exclusiveAccessStart() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._exclusiveAccessStartOffset_));
	}

	// U64 exclusiveAccessStart
	public UDATAPointer exclusiveAccessStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._exclusiveAccessStartOffset_));
	}

	// U64 globalGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalGCOffset_", declaredType="U64")
	public UDATA globalGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._globalGCOffset_));
	}

	// U64 globalGC
	public UDATAPointer globalGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._globalGCOffset_));
	}

	// U64 globalMarkGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_globalMarkGCOffset_", declaredType="U64")
	public UDATA globalMarkGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._globalMarkGCOffset_));
	}

	// U64 globalMarkGC
	public UDATAPointer globalMarkGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._globalMarkGCOffset_));
	}

	// U64 initialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initializedOffset_", declaredType="U64")
	public UDATA initialized() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._initializedOffset_));
	}

	// U64 initialized
	public UDATAPointer initializedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._initializedOffset_));
	}

	// U64 localGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localGCOffset_", declaredType="U64")
	public UDATA localGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._localGCOffset_));
	}

	// U64 localGC
	public UDATAPointer localGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._localGCOffset_));
	}

	// U64 metronomeCycleEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeCycleEndOffset_", declaredType="U64")
	public UDATA metronomeCycleEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeCycleEndOffset_));
	}

	// U64 metronomeCycleEnd
	public UDATAPointer metronomeCycleEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeCycleEndOffset_));
	}

	// U64 metronomeCycleStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeCycleStartOffset_", declaredType="U64")
	public UDATA metronomeCycleStart() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeCycleStartOffset_));
	}

	// U64 metronomeCycleStart
	public UDATAPointer metronomeCycleStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeCycleStartOffset_));
	}

	// U64 metronomeHeartbeat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeHeartbeatOffset_", declaredType="U64")
	public UDATA metronomeHeartbeat() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeHeartbeatOffset_));
	}

	// U64 metronomeHeartbeat
	public UDATAPointer metronomeHeartbeatEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeHeartbeatOffset_));
	}

	// U64 metronomeSynchGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeSynchGCOffset_", declaredType="U64")
	public UDATA metronomeSynchGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeSynchGCOffset_));
	}

	// U64 metronomeSynchGC
	public UDATAPointer metronomeSynchGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeSynchGCOffset_));
	}

	// U64 metronomeThreadPriorityChange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeThreadPriorityChangeOffset_", declaredType="U64")
	public UDATA metronomeThreadPriorityChange() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeThreadPriorityChangeOffset_));
	}

	// U64 metronomeThreadPriorityChange
	public UDATAPointer metronomeThreadPriorityChangeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeThreadPriorityChangeOffset_));
	}

	// U64 metronomeTriggerEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeTriggerEndOffset_", declaredType="U64")
	public UDATA metronomeTriggerEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeTriggerEndOffset_));
	}

	// U64 metronomeTriggerEnd
	public UDATAPointer metronomeTriggerEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeTriggerEndOffset_));
	}

	// U64 metronomeTriggerStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeTriggerStartOffset_", declaredType="U64")
	public UDATA metronomeTriggerStart() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._metronomeTriggerStartOffset_));
	}

	// U64 metronomeTriggerStart
	public UDATAPointer metronomeTriggerStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._metronomeTriggerStartOffset_));
	}

	// U64 nurseryAF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryAFOffset_", declaredType="U64")
	public UDATA nurseryAF() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._nurseryAFOffset_));
	}

	// U64 nurseryAF
	public UDATAPointer nurseryAFEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._nurseryAFOffset_));
	}

	// U64 partialGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partialGCOffset_", declaredType="U64")
	public UDATA partialGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._partialGCOffset_));
	}

	// U64 partialGC
	public UDATAPointer partialGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._partialGCOffset_));
	}

	// U64 systemGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemGCOffset_", declaredType="U64")
	public UDATA systemGC() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._systemGCOffset_));
	}

	// U64 systemGC
	public UDATAPointer systemGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._systemGCOffset_));
	}

	// U64 tarokIncrementEnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokIncrementEndOffset_", declaredType="U64")
	public UDATA tarokIncrementEnd() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._tarokIncrementEndOffset_));
	}

	// U64 tarokIncrementEnd
	public UDATAPointer tarokIncrementEndEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._tarokIncrementEndOffset_));
	}

	// U64 tarokIncrementStart
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tarokIncrementStartOffset_", declaredType="U64")
	public UDATA tarokIncrementStart() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._tarokIncrementStartOffset_));
	}

	// U64 tarokIncrementStart
	public UDATAPointer tarokIncrementStartEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._tarokIncrementStartOffset_));
	}

	// U64 taxationEntryPoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_taxationEntryPointOffset_", declaredType="U64")
	public UDATA taxationEntryPoint() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._taxationEntryPointOffset_));
	}

	// U64 taxationEntryPoint
	public UDATAPointer taxationEntryPointEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._taxationEntryPointOffset_));
	}

	// U64 tenureAF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureAFOffset_", declaredType="U64")
	public UDATA tenureAF() throws CorruptDataException {
		return new U64(getLongAtOffset(PreviousTimes._tenureAFOffset_));
	}

	// U64 tenureAF
	public UDATAPointer tenureAFEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PreviousTimes._tenureAFOffset_));
	}

}
