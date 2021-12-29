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
 * Structure: MM_SystemGCStartEventPointer
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
 * The generated code will provide getters for all elements in the MM_SystemGCStartEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SystemGCStartEvent.class)
public class MM_SystemGCStartEventPointer extends StructurePointer {

	// NULL
	public static final MM_SystemGCStartEventPointer NULL = new MM_SystemGCStartEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SystemGCStartEventPointer(long address) {
		super(address);
	}

	public static MM_SystemGCStartEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SystemGCStartEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SystemGCStartEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SystemGCStartEventPointer(address);
	}

	public MM_SystemGCStartEventPointer add(long count) {
		return MM_SystemGCStartEventPointer.cast(address + (MM_SystemGCStartEvent.SIZEOF * count));
	}

	public MM_SystemGCStartEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SystemGCStartEventPointer addOffset(long offset) {
		return MM_SystemGCStartEventPointer.cast(address + offset);
	}

	public MM_SystemGCStartEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SystemGCStartEventPointer sub(long count) {
		return MM_SystemGCStartEventPointer.cast(address - (MM_SystemGCStartEvent.SIZEOF * count));
	}

	public MM_SystemGCStartEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SystemGCStartEventPointer subOffset(long offset) {
		return MM_SystemGCStartEventPointer.cast(address - offset);
	}

	public MM_SystemGCStartEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SystemGCStartEventPointer untag(long mask) {
		return MM_SystemGCStartEventPointer.cast(address & ~mask);
	}

	public MM_SystemGCStartEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SystemGCStartEvent.SIZEOF;
	}

	// Implementation methods

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_SystemGCStartEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SystemGCStartEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SystemGCStartEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SystemGCStartEvent._eventidOffset_));
	}

	// U32 gcCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcCodeOffset_", declaredType="U32")
	public UDATA gcCode() throws CorruptDataException {
		return new U32(getIntAtOffset(MM_SystemGCStartEvent._gcCodeOffset_));
	}

	// U32 gcCode
	public UDATAPointer gcCodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SystemGCStartEvent._gcCodeOffset_));
	}

	// MM_CommonGCStartData* gcStartData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcStartDataOffset_", declaredType="MM_CommonGCStartData*")
	public MM_CommonGCStartDataPointer gcStartData() throws CorruptDataException {
		return MM_CommonGCStartDataPointer.cast(getPointerAtOffset(MM_SystemGCStartEvent._gcStartDataOffset_));
	}

	// MM_CommonGCStartData* gcStartData
	public PointerPointer gcStartDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SystemGCStartEvent._gcStartDataOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_SystemGCStartEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_SystemGCStartEvent._timestampOffset_));
	}

}
