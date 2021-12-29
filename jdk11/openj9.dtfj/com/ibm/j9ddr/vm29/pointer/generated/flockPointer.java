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
 * Structure: flockPointer
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
 * The generated code will provide getters for all elements in the flockPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=flock.class)
public class flockPointer extends StructurePointer {

	// NULL
	public static final flockPointer NULL = new flockPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected flockPointer(long address) {
		super(address);
	}

	public static flockPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static flockPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static flockPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new flockPointer(address);
	}

	public flockPointer add(long count) {
		return flockPointer.cast(address + (flock.SIZEOF * count));
	}

	public flockPointer add(Scalar count) {
		return add(count.longValue());
	}

	public flockPointer addOffset(long offset) {
		return flockPointer.cast(address + offset);
	}

	public flockPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public flockPointer sub(long count) {
		return flockPointer.cast(address - (flock.SIZEOF * count));
	}

	public flockPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public flockPointer subOffset(long offset) {
		return flockPointer.cast(address - offset);
	}

	public flockPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public flockPointer untag(long mask) {
		return flockPointer.cast(address & ~mask);
	}

	public flockPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return flock.SIZEOF;
	}

	// Implementation methods

	// off_t l_len
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_l_lenOffset_", declaredType="off_t")
	public IDATA l_len() throws CorruptDataException {
		return new I64(getLongAtOffset(flock._l_lenOffset_));
	}

	// off_t l_len
	public IDATAPointer l_lenEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(flock._l_lenOffset_));
	}

	// pid_t l_pid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_l_pidOffset_", declaredType="pid_t")
	public IDATA l_pid() throws CorruptDataException {
		return new I32(getIntAtOffset(flock._l_pidOffset_));
	}

	// pid_t l_pid
	public IDATAPointer l_pidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(flock._l_pidOffset_));
	}

	// off_t l_start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_l_startOffset_", declaredType="off_t")
	public IDATA l_start() throws CorruptDataException {
		return new I64(getLongAtOffset(flock._l_startOffset_));
	}

	// off_t l_start
	public IDATAPointer l_startEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(flock._l_startOffset_));
	}

	// I16 l_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_l_typeOffset_", declaredType="I16")
	public I16 l_type() throws CorruptDataException {
		return new I16(getShortAtOffset(flock._l_typeOffset_));
	}

	// I16 l_type
	public I16Pointer l_typeEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(flock._l_typeOffset_));
	}

	// I16 l_whence
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_l_whenceOffset_", declaredType="I16")
	public I16 l_whence() throws CorruptDataException {
		return new I16(getShortAtOffset(flock._l_whenceOffset_));
	}

	// I16 l_whence
	public I16Pointer l_whenceEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(flock._l_whenceOffset_));
	}

}
