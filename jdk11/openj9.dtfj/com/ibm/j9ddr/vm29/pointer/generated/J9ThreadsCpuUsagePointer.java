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
 * Structure: J9ThreadsCpuUsagePointer
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
 * The generated code will provide getters for all elements in the J9ThreadsCpuUsagePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ThreadsCpuUsage.class)
public class J9ThreadsCpuUsagePointer extends StructurePointer {

	// NULL
	public static final J9ThreadsCpuUsagePointer NULL = new J9ThreadsCpuUsagePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ThreadsCpuUsagePointer(long address) {
		super(address);
	}

	public static J9ThreadsCpuUsagePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ThreadsCpuUsagePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ThreadsCpuUsagePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ThreadsCpuUsagePointer(address);
	}

	public J9ThreadsCpuUsagePointer add(long count) {
		return J9ThreadsCpuUsagePointer.cast(address + (J9ThreadsCpuUsage.SIZEOF * count));
	}

	public J9ThreadsCpuUsagePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ThreadsCpuUsagePointer addOffset(long offset) {
		return J9ThreadsCpuUsagePointer.cast(address + offset);
	}

	public J9ThreadsCpuUsagePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ThreadsCpuUsagePointer sub(long count) {
		return J9ThreadsCpuUsagePointer.cast(address - (J9ThreadsCpuUsage.SIZEOF * count));
	}

	public J9ThreadsCpuUsagePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ThreadsCpuUsagePointer subOffset(long offset) {
		return J9ThreadsCpuUsagePointer.cast(address - offset);
	}

	public J9ThreadsCpuUsagePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ThreadsCpuUsagePointer untag(long mask) {
		return J9ThreadsCpuUsagePointer.cast(address & ~mask);
	}

	public J9ThreadsCpuUsagePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ThreadsCpuUsage.SIZEOF;
	}

	// Implementation methods

	// I64 applicationCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_applicationCpuTimeOffset_", declaredType="I64")
	public IDATA applicationCpuTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._applicationCpuTimeOffset_));
	}

	// I64 applicationCpuTime
	public IDATAPointer applicationCpuTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._applicationCpuTimeOffset_));
	}

	// I64[] applicationUserCpuTime
	public IDATAPointer applicationUserCpuTimeEA() throws CorruptDataException {
		return I64Pointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._applicationUserCpuTimeOffset_));
	}

	// I64 gcCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCpuTimeOffset_", declaredType="I64")
	public IDATA gcCpuTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._gcCpuTimeOffset_));
	}

	// I64 gcCpuTime
	public IDATAPointer gcCpuTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._gcCpuTimeOffset_));
	}

	// I64 jitCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jitCpuTimeOffset_", declaredType="I64")
	public IDATA jitCpuTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._jitCpuTimeOffset_));
	}

	// I64 jitCpuTime
	public IDATAPointer jitCpuTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._jitCpuTimeOffset_));
	}

	// I64 resourceMonitorCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resourceMonitorCpuTimeOffset_", declaredType="I64")
	public IDATA resourceMonitorCpuTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._resourceMonitorCpuTimeOffset_));
	}

	// I64 resourceMonitorCpuTime
	public IDATAPointer resourceMonitorCpuTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._resourceMonitorCpuTimeOffset_));
	}

	// I64 systemJvmCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemJvmCpuTimeOffset_", declaredType="I64")
	public IDATA systemJvmCpuTime() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._systemJvmCpuTimeOffset_));
	}

	// I64 systemJvmCpuTime
	public IDATAPointer systemJvmCpuTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._systemJvmCpuTimeOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(J9ThreadsCpuUsage._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ThreadsCpuUsage._timestampOffset_));
	}

}
