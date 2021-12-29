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
 * Structure: J9ThreadMonitorTracingPointer
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
 * The generated code will provide getters for all elements in the J9ThreadMonitorTracingPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadMonitorTracing.class)
public class J9ThreadMonitorTracingPointer extends StructurePointer {

	// NULL
	public static final J9ThreadMonitorTracingPointer NULL = new J9ThreadMonitorTracingPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadMonitorTracingPointer(long address) {
		super(address);
	}

	public static J9ThreadMonitorTracingPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadMonitorTracingPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadMonitorTracingPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadMonitorTracingPointer(address);
	}

	public J9ThreadMonitorTracingPointer add(long count) {
		return J9ThreadMonitorTracingPointer.cast(address + (J9ThreadMonitorTracing.SIZEOF * count));
	}

	public J9ThreadMonitorTracingPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadMonitorTracingPointer addOffset(long offset) {
		return J9ThreadMonitorTracingPointer.cast(address + offset);
	}

	public J9ThreadMonitorTracingPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadMonitorTracingPointer sub(long count) {
		return J9ThreadMonitorTracingPointer.cast(address - (J9ThreadMonitorTracing.SIZEOF * count));
	}

	public J9ThreadMonitorTracingPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadMonitorTracingPointer subOffset(long offset) {
		return J9ThreadMonitorTracingPointer.cast(address - offset);
	}

	public J9ThreadMonitorTracingPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadMonitorTracingPointer untag(long mask) {
		return J9ThreadMonitorTracingPointer.cast(address & ~mask);
	}

	public J9ThreadMonitorTracingPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadMonitorTracing.SIZEOF;
	}

	// Implementation methods

	// U64 enter_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enter_countOffset_", declaredType="U64")
	public UDATA enter_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._enter_countOffset_));
	}

	// U64 enter_count
	public UDATAPointer enter_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._enter_countOffset_));
	}

	// U64 enter_pause_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enter_pause_countOffset_", declaredType="U64")
	public UDATA enter_pause_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._enter_pause_countOffset_));
	}

	// U64 enter_pause_count
	public UDATAPointer enter_pause_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._enter_pause_countOffset_));
	}

	// U64 enter_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_enter_timeOffset_", declaredType="U64")
	public UDATA enter_time() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._enter_timeOffset_));
	}

	// U64 enter_time
	public UDATAPointer enter_timeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._enter_timeOffset_));
	}

	// U64 holdtime_avg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_holdtime_avgOffset_", declaredType="U64")
	public UDATA holdtime_avg() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._holdtime_avgOffset_));
	}

	// U64 holdtime_avg
	public UDATAPointer holdtime_avgEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._holdtime_avgOffset_));
	}

	// volatile U64 holdtime_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_holdtime_countOffset_", declaredType="volatile U64")
	public UDATA holdtime_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._holdtime_countOffset_));
	}

	// volatile U64 holdtime_count
	public UDATAPointer holdtime_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._holdtime_countOffset_));
	}

	// U64 holdtime_sum
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_holdtime_sumOffset_", declaredType="U64")
	public UDATA holdtime_sum() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._holdtime_sumOffset_));
	}

	// U64 holdtime_sum
	public UDATAPointer holdtime_sumEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._holdtime_sumOffset_));
	}

	// U8* monitor_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitor_nameOffset_", declaredType="U8*")
	public U8Pointer monitor_name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9ThreadMonitorTracing._monitor_nameOffset_));
	}

	// U8* monitor_name
	public PointerPointer monitor_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._monitor_nameOffset_));
	}

	// U64 recursive_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_recursive_countOffset_", declaredType="U64")
	public UDATA recursive_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._recursive_countOffset_));
	}

	// U64 recursive_count
	public UDATAPointer recursive_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._recursive_countOffset_));
	}

	// U64 slow_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slow_countOffset_", declaredType="U64")
	public UDATA slow_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._slow_countOffset_));
	}

	// U64 slow_count
	public UDATAPointer slow_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._slow_countOffset_));
	}

	// U64 spin2_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_spin2_countOffset_", declaredType="U64")
	public UDATA spin2_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._spin2_countOffset_));
	}

	// U64 spin2_count
	public UDATAPointer spin2_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._spin2_countOffset_));
	}

	// U64 yield_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_yield_countOffset_", declaredType="U64")
	public UDATA yield_count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9ThreadMonitorTracing._yield_countOffset_));
	}

	// U64 yield_count
	public UDATAPointer yield_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ThreadMonitorTracing._yield_countOffset_));
	}

}
