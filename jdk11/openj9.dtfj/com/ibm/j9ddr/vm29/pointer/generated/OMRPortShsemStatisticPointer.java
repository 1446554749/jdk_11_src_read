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
 * Structure: OMRPortShsemStatisticPointer
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
 * The generated code will provide getters for all elements in the OMRPortShsemStatisticPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortShsemStatistic.class)
public class OMRPortShsemStatisticPointer extends StructurePointer {

	// NULL
	public static final OMRPortShsemStatisticPointer NULL = new OMRPortShsemStatisticPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortShsemStatisticPointer(long address) {
		super(address);
	}

	public static OMRPortShsemStatisticPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortShsemStatisticPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortShsemStatisticPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortShsemStatisticPointer(address);
	}

	public OMRPortShsemStatisticPointer add(long count) {
		return OMRPortShsemStatisticPointer.cast(address + (OMRPortShsemStatistic.SIZEOF * count));
	}

	public OMRPortShsemStatisticPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortShsemStatisticPointer addOffset(long offset) {
		return OMRPortShsemStatisticPointer.cast(address + offset);
	}

	public OMRPortShsemStatisticPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortShsemStatisticPointer sub(long count) {
		return OMRPortShsemStatisticPointer.cast(address - (OMRPortShsemStatistic.SIZEOF * count));
	}

	public OMRPortShsemStatisticPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortShsemStatisticPointer subOffset(long offset) {
		return OMRPortShsemStatisticPointer.cast(address - offset);
	}

	public OMRPortShsemStatisticPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortShsemStatisticPointer untag(long mask) {
		return OMRPortShsemStatisticPointer.cast(address & ~mask);
	}

	public OMRPortShsemStatisticPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortShsemStatistic.SIZEOF;
	}

	// Implementation methods

	// U64 cgid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cgidOffset_", declaredType="U64")
	public UDATA cgid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShsemStatistic._cgidOffset_));
	}

	// U64 cgid
	public UDATAPointer cgidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._cgidOffset_));
	}

	// U64 cuid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cuidOffset_", declaredType="U64")
	public UDATA cuid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShsemStatistic._cuidOffset_));
	}

	// U64 cuid
	public UDATAPointer cuidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._cuidOffset_));
	}

	// I64 lastChangeTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastChangeTimeOffset_", declaredType="I64")
	public IDATA lastChangeTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OMRPortShsemStatistic._lastChangeTimeOffset_));
	}

	// I64 lastChangeTime
	public IDATAPointer lastChangeTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._lastChangeTimeOffset_));
	}

	// I64 lastOpTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastOpTimeOffset_", declaredType="I64")
	public IDATA lastOpTime() throws CorruptDataException {
		return new I64(getLongAtOffset(OMRPortShsemStatistic._lastOpTimeOffset_));
	}

	// I64 lastOpTime
	public IDATAPointer lastOpTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._lastOpTimeOffset_));
	}

	// I32 nsems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nsemsOffset_", declaredType="I32")
	public IDATA nsems() throws CorruptDataException {
		return new I32(getIntAtOffset(OMRPortShsemStatistic._nsemsOffset_));
	}

	// I32 nsems
	public IDATAPointer nsemsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._nsemsOffset_));
	}

	// U64 ogid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ogidOffset_", declaredType="U64")
	public UDATA ogid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShsemStatistic._ogidOffset_));
	}

	// U64 ogid
	public UDATAPointer ogidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._ogidOffset_));
	}

	// U64 ouid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ouidOffset_", declaredType="U64")
	public UDATA ouid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShsemStatistic._ouidOffset_));
	}

	// U64 ouid
	public UDATAPointer ouidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._ouidOffset_));
	}

	// J9Permission perm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_permOffset_", declaredType="J9Permission")
	public J9PermissionPointer perm() throws CorruptDataException {
		return J9PermissionPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._permOffset_));
	}

	// J9Permission perm
	public PointerPointer permEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._permOffset_));
	}

	// U64 semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semidOffset_", declaredType="U64")
	public UDATA semid() throws CorruptDataException {
		return new U64(getLongAtOffset(OMRPortShsemStatistic._semidOffset_));
	}

	// U64 semid
	public UDATAPointer semidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMRPortShsemStatistic._semidOffset_));
	}

}
