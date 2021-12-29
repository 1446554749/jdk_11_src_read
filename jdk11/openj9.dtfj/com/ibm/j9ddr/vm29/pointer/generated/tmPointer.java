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
 * Structure: tmPointer
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
 * The generated code will provide getters for all elements in the tmPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=tm.class)
public class tmPointer extends StructurePointer {

	// NULL
	public static final tmPointer NULL = new tmPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected tmPointer(long address) {
		super(address);
	}

	public static tmPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static tmPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static tmPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new tmPointer(address);
	}

	public tmPointer add(long count) {
		return tmPointer.cast(address + (tm.SIZEOF * count));
	}

	public tmPointer add(Scalar count) {
		return add(count.longValue());
	}

	public tmPointer addOffset(long offset) {
		return tmPointer.cast(address + offset);
	}

	public tmPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public tmPointer sub(long count) {
		return tmPointer.cast(address - (tm.SIZEOF * count));
	}

	public tmPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public tmPointer subOffset(long offset) {
		return tmPointer.cast(address - offset);
	}

	public tmPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public tmPointer untag(long mask) {
		return tmPointer.cast(address & ~mask);
	}

	public tmPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return tm.SIZEOF;
	}

	// Implementation methods

	// I64 tm_gmtoff
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_gmtoffOffset_", declaredType="I64")
	public IDATA tm_gmtoff() throws CorruptDataException {
		return new I64(getLongAtOffset(tm._tm_gmtoffOffset_));
	}

	// I64 tm_gmtoff
	public IDATAPointer tm_gmtoffEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_gmtoffOffset_));
	}

	// I32 tm_hour
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_hourOffset_", declaredType="I32")
	public IDATA tm_hour() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_hourOffset_));
	}

	// I32 tm_hour
	public IDATAPointer tm_hourEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_hourOffset_));
	}

	// I32 tm_isdst
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_isdstOffset_", declaredType="I32")
	public IDATA tm_isdst() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_isdstOffset_));
	}

	// I32 tm_isdst
	public IDATAPointer tm_isdstEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_isdstOffset_));
	}

	// I32 tm_mday
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_mdayOffset_", declaredType="I32")
	public IDATA tm_mday() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_mdayOffset_));
	}

	// I32 tm_mday
	public IDATAPointer tm_mdayEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_mdayOffset_));
	}

	// I32 tm_min
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_minOffset_", declaredType="I32")
	public IDATA tm_min() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_minOffset_));
	}

	// I32 tm_min
	public IDATAPointer tm_minEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_minOffset_));
	}

	// I32 tm_mon
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_monOffset_", declaredType="I32")
	public IDATA tm_mon() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_monOffset_));
	}

	// I32 tm_mon
	public IDATAPointer tm_monEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_monOffset_));
	}

	// I32 tm_sec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_secOffset_", declaredType="I32")
	public IDATA tm_sec() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_secOffset_));
	}

	// I32 tm_sec
	public IDATAPointer tm_secEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_secOffset_));
	}

	// I32 tm_wday
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_wdayOffset_", declaredType="I32")
	public IDATA tm_wday() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_wdayOffset_));
	}

	// I32 tm_wday
	public IDATAPointer tm_wdayEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_wdayOffset_));
	}

	// I32 tm_yday
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_ydayOffset_", declaredType="I32")
	public IDATA tm_yday() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_ydayOffset_));
	}

	// I32 tm_yday
	public IDATAPointer tm_ydayEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_ydayOffset_));
	}

	// I32 tm_year
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_yearOffset_", declaredType="I32")
	public IDATA tm_year() throws CorruptDataException {
		return new I32(getIntAtOffset(tm._tm_yearOffset_));
	}

	// I32 tm_year
	public IDATAPointer tm_yearEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(tm._tm_yearOffset_));
	}

	// U8* tm_zone
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tm_zoneOffset_", declaredType="U8*")
	public U8Pointer tm_zone() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(tm._tm_zoneOffset_));
	}

	// U8* tm_zone
	public PointerPointer tm_zoneEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(tm._tm_zoneOffset_));
	}

}
