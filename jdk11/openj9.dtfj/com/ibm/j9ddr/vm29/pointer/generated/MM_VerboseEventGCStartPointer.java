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
 * Structure: MM_VerboseEventGCStartPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventGCStartPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventGCStart.class)
public class MM_VerboseEventGCStartPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventGCStartPointer NULL = new MM_VerboseEventGCStartPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventGCStartPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventGCStartPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventGCStartPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventGCStartPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventGCStartPointer(address);
	}

	public MM_VerboseEventGCStartPointer add(long count) {
		return MM_VerboseEventGCStartPointer.cast(address + (MM_VerboseEventGCStart.SIZEOF * count));
	}

	public MM_VerboseEventGCStartPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventGCStartPointer addOffset(long offset) {
		return MM_VerboseEventGCStartPointer.cast(address + offset);
	}

	public MM_VerboseEventGCStartPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventGCStartPointer sub(long count) {
		return MM_VerboseEventGCStartPointer.cast(address - (MM_VerboseEventGCStart.SIZEOF * count));
	}

	public MM_VerboseEventGCStartPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventGCStartPointer subOffset(long offset) {
		return MM_VerboseEventGCStartPointer.cast(address - offset);
	}

	public MM_VerboseEventGCStartPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventGCStartPointer untag(long mask) {
		return MM_VerboseEventGCStartPointer.cast(address & ~mask);
	}

	public MM_VerboseEventGCStartPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventGCStart.SIZEOF;
	}

	// Implementation methods

	// MM_CommonGCStartData _gcStartData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcStartDataOffset_", declaredType="MM_CommonGCStartData")
	public MM_CommonGCStartDataPointer _gcStartData() throws CorruptDataException {
		return MM_CommonGCStartDataPointer.cast(nonNullFieldEA(MM_VerboseEventGCStart.__gcStartDataOffset_));
	}

	// MM_CommonGCStartData _gcStartData
	public PointerPointer _gcStartDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventGCStart.__gcStartDataOffset_));
	}

	// I64 _timeInMilliSeconds
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeInMilliSecondsOffset_", declaredType="I64")
	public IDATA _timeInMilliSeconds() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_VerboseEventGCStart.__timeInMilliSecondsOffset_));
	}

	// I64 _timeInMilliSeconds
	public IDATAPointer _timeInMilliSecondsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_VerboseEventGCStart.__timeInMilliSecondsOffset_));
	}

}
