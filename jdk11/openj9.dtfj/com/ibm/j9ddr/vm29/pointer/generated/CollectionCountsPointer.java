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
 * Structure: CollectionCountsPointer
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
 * The generated code will provide getters for all elements in the CollectionCountsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=CollectionCounts.class)
public class CollectionCountsPointer extends StructurePointer {

	// NULL
	public static final CollectionCountsPointer NULL = new CollectionCountsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected CollectionCountsPointer(long address) {
		super(address);
	}

	public static CollectionCountsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static CollectionCountsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static CollectionCountsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new CollectionCountsPointer(address);
	}

	public CollectionCountsPointer add(long count) {
		return CollectionCountsPointer.cast(address + (CollectionCounts.SIZEOF * count));
	}

	public CollectionCountsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public CollectionCountsPointer addOffset(long offset) {
		return CollectionCountsPointer.cast(address + offset);
	}

	public CollectionCountsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public CollectionCountsPointer sub(long count) {
		return CollectionCountsPointer.cast(address - (CollectionCounts.SIZEOF * count));
	}

	public CollectionCountsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public CollectionCountsPointer subOffset(long offset) {
		return CollectionCountsPointer.cast(address - offset);
	}

	public CollectionCountsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public CollectionCountsPointer untag(long mask) {
		return CollectionCountsPointer.cast(address & ~mask);
	}

	public CollectionCountsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return CollectionCounts.SIZEOF;
	}

	// Implementation methods

	// U64 concurrentGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_concurrentGCOffset_", declaredType="U64")
	public UDATA concurrentGC() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._concurrentGCOffset_));
	}

	// U64 concurrentGC
	public UDATAPointer concurrentGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._concurrentGCOffset_));
	}

	// U64 metronomeCycle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeCycleOffset_", declaredType="U64")
	public UDATA metronomeCycle() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._metronomeCycleOffset_));
	}

	// U64 metronomeCycle
	public UDATAPointer metronomeCycleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._metronomeCycleOffset_));
	}

	// U64 metronomeHeartbeat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeHeartbeatOffset_", declaredType="U64")
	public UDATA metronomeHeartbeat() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._metronomeHeartbeatOffset_));
	}

	// U64 metronomeHeartbeat
	public UDATAPointer metronomeHeartbeatEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._metronomeHeartbeatOffset_));
	}

	// U64 metronomeSynchGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeSynchGCOffset_", declaredType="U64")
	public UDATA metronomeSynchGC() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._metronomeSynchGCOffset_));
	}

	// U64 metronomeSynchGC
	public UDATAPointer metronomeSynchGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._metronomeSynchGCOffset_));
	}

	// U64 metronomeThreadPriorityChange
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeThreadPriorityChangeOffset_", declaredType="U64")
	public UDATA metronomeThreadPriorityChange() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._metronomeThreadPriorityChangeOffset_));
	}

	// U64 metronomeThreadPriorityChange
	public UDATAPointer metronomeThreadPriorityChangeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._metronomeThreadPriorityChangeOffset_));
	}

	// U64 metronomeTrigger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_metronomeTriggerOffset_", declaredType="U64")
	public UDATA metronomeTrigger() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._metronomeTriggerOffset_));
	}

	// U64 metronomeTrigger
	public UDATAPointer metronomeTriggerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._metronomeTriggerOffset_));
	}

	// U64 nurseryAF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nurseryAFOffset_", declaredType="U64")
	public UDATA nurseryAF() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._nurseryAFOffset_));
	}

	// U64 nurseryAF
	public UDATAPointer nurseryAFEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._nurseryAFOffset_));
	}

	// U64 systemGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemGCOffset_", declaredType="U64")
	public UDATA systemGC() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._systemGCOffset_));
	}

	// U64 systemGC
	public UDATAPointer systemGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._systemGCOffset_));
	}

	// U64 tenureAF
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tenureAFOffset_", declaredType="U64")
	public UDATA tenureAF() throws CorruptDataException {
		return new U64(getLongAtOffset(CollectionCounts._tenureAFOffset_));
	}

	// U64 tenureAF
	public UDATAPointer tenureAFEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(CollectionCounts._tenureAFOffset_));
	}

}
