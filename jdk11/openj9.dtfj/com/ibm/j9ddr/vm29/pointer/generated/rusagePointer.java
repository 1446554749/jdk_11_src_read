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
 * Structure: rusagePointer
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
 * The generated code will provide getters for all elements in the rusagePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=rusage.class)
public class rusagePointer extends StructurePointer {

	// NULL
	public static final rusagePointer NULL = new rusagePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected rusagePointer(long address) {
		super(address);
	}

	public static rusagePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static rusagePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static rusagePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new rusagePointer(address);
	}

	public rusagePointer add(long count) {
		return rusagePointer.cast(address + (rusage.SIZEOF * count));
	}

	public rusagePointer add(Scalar count) {
		return add(count.longValue());
	}

	public rusagePointer addOffset(long offset) {
		return rusagePointer.cast(address + offset);
	}

	public rusagePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public rusagePointer sub(long count) {
		return rusagePointer.cast(address - (rusage.SIZEOF * count));
	}

	public rusagePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public rusagePointer subOffset(long offset) {
		return rusagePointer.cast(address - offset);
	}

	public rusagePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public rusagePointer untag(long mask) {
		return rusagePointer.cast(address & ~mask);
	}

	public rusagePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return rusage.SIZEOF;
	}

	// Implementation methods

	// I64 ru_idrss
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_idrssOffset_", declaredType="I64")
	public IDATA ru_idrss() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_idrssOffset_));
	}

	// I64 ru_idrss
	public IDATAPointer ru_idrssEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_idrssOffset_));
	}

	// I64 ru_inblock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_inblockOffset_", declaredType="I64")
	public IDATA ru_inblock() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_inblockOffset_));
	}

	// I64 ru_inblock
	public IDATAPointer ru_inblockEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_inblockOffset_));
	}

	// I64 ru_isrss
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_isrssOffset_", declaredType="I64")
	public IDATA ru_isrss() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_isrssOffset_));
	}

	// I64 ru_isrss
	public IDATAPointer ru_isrssEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_isrssOffset_));
	}

	// I64 ru_ixrss
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_ixrssOffset_", declaredType="I64")
	public IDATA ru_ixrss() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_ixrssOffset_));
	}

	// I64 ru_ixrss
	public IDATAPointer ru_ixrssEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_ixrssOffset_));
	}

	// I64 ru_majflt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_majfltOffset_", declaredType="I64")
	public IDATA ru_majflt() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_majfltOffset_));
	}

	// I64 ru_majflt
	public IDATAPointer ru_majfltEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_majfltOffset_));
	}

	// I64 ru_maxrss
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_maxrssOffset_", declaredType="I64")
	public IDATA ru_maxrss() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_maxrssOffset_));
	}

	// I64 ru_maxrss
	public IDATAPointer ru_maxrssEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_maxrssOffset_));
	}

	// I64 ru_minflt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_minfltOffset_", declaredType="I64")
	public IDATA ru_minflt() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_minfltOffset_));
	}

	// I64 ru_minflt
	public IDATAPointer ru_minfltEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_minfltOffset_));
	}

	// I64 ru_msgrcv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_msgrcvOffset_", declaredType="I64")
	public IDATA ru_msgrcv() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_msgrcvOffset_));
	}

	// I64 ru_msgrcv
	public IDATAPointer ru_msgrcvEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_msgrcvOffset_));
	}

	// I64 ru_msgsnd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_msgsndOffset_", declaredType="I64")
	public IDATA ru_msgsnd() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_msgsndOffset_));
	}

	// I64 ru_msgsnd
	public IDATAPointer ru_msgsndEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_msgsndOffset_));
	}

	// I64 ru_nivcsw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_nivcswOffset_", declaredType="I64")
	public IDATA ru_nivcsw() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_nivcswOffset_));
	}

	// I64 ru_nivcsw
	public IDATAPointer ru_nivcswEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_nivcswOffset_));
	}

	// I64 ru_nsignals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_nsignalsOffset_", declaredType="I64")
	public IDATA ru_nsignals() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_nsignalsOffset_));
	}

	// I64 ru_nsignals
	public IDATAPointer ru_nsignalsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_nsignalsOffset_));
	}

	// I64 ru_nswap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_nswapOffset_", declaredType="I64")
	public IDATA ru_nswap() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_nswapOffset_));
	}

	// I64 ru_nswap
	public IDATAPointer ru_nswapEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_nswapOffset_));
	}

	// I64 ru_nvcsw
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_nvcswOffset_", declaredType="I64")
	public IDATA ru_nvcsw() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_nvcswOffset_));
	}

	// I64 ru_nvcsw
	public IDATAPointer ru_nvcswEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_nvcswOffset_));
	}

	// I64 ru_oublock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_oublockOffset_", declaredType="I64")
	public IDATA ru_oublock() throws CorruptDataException {
		return new I64(getLongAtOffset(rusage._ru_oublockOffset_));
	}

	// I64 ru_oublock
	public IDATAPointer ru_oublockEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(rusage._ru_oublockOffset_));
	}

	// timeval ru_stime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_stimeOffset_", declaredType="timeval")
	public timevalPointer ru_stime() throws CorruptDataException {
		return timevalPointer.cast(nonNullFieldEA(rusage._ru_stimeOffset_));
	}

	// timeval ru_stime
	public PointerPointer ru_stimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(rusage._ru_stimeOffset_));
	}

	// timeval ru_utime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ru_utimeOffset_", declaredType="timeval")
	public timevalPointer ru_utime() throws CorruptDataException {
		return timevalPointer.cast(nonNullFieldEA(rusage._ru_utimeOffset_));
	}

	// timeval ru_utime
	public PointerPointer ru_utimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(rusage._ru_utimeOffset_));
	}

}
