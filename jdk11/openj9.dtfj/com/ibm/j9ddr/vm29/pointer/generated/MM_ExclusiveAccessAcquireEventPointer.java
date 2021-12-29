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
 * Structure: MM_ExclusiveAccessAcquireEventPointer
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
 * The generated code will provide getters for all elements in the MM_ExclusiveAccessAcquireEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ExclusiveAccessAcquireEvent.class)
public class MM_ExclusiveAccessAcquireEventPointer extends StructurePointer {

	// NULL
	public static final MM_ExclusiveAccessAcquireEventPointer NULL = new MM_ExclusiveAccessAcquireEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ExclusiveAccessAcquireEventPointer(long address) {
		super(address);
	}

	public static MM_ExclusiveAccessAcquireEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ExclusiveAccessAcquireEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ExclusiveAccessAcquireEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ExclusiveAccessAcquireEventPointer(address);
	}

	public MM_ExclusiveAccessAcquireEventPointer add(long count) {
		return MM_ExclusiveAccessAcquireEventPointer.cast(address + (MM_ExclusiveAccessAcquireEvent.SIZEOF * count));
	}

	public MM_ExclusiveAccessAcquireEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ExclusiveAccessAcquireEventPointer addOffset(long offset) {
		return MM_ExclusiveAccessAcquireEventPointer.cast(address + offset);
	}

	public MM_ExclusiveAccessAcquireEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ExclusiveAccessAcquireEventPointer sub(long count) {
		return MM_ExclusiveAccessAcquireEventPointer.cast(address - (MM_ExclusiveAccessAcquireEvent.SIZEOF * count));
	}

	public MM_ExclusiveAccessAcquireEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ExclusiveAccessAcquireEventPointer subOffset(long offset) {
		return MM_ExclusiveAccessAcquireEventPointer.cast(address - offset);
	}

	public MM_ExclusiveAccessAcquireEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ExclusiveAccessAcquireEventPointer untag(long mask) {
		return MM_ExclusiveAccessAcquireEventPointer.cast(address & ~mask);
	}

	public MM_ExclusiveAccessAcquireEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ExclusiveAccessAcquireEvent.SIZEOF;
	}

	// Implementation methods

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ExclusiveAccessAcquireEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExclusiveAccessAcquireEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._eventidOffset_));
	}

	// U64 exclusiveAccessTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveAccessTimeOffset_", declaredType="U64")
	public UDATA exclusiveAccessTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExclusiveAccessAcquireEvent._exclusiveAccessTimeOffset_));
	}

	// U64 exclusiveAccessTime
	public UDATAPointer exclusiveAccessTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._exclusiveAccessTimeOffset_));
	}

	// U64 haltedThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_haltedThreadsOffset_", declaredType="U64")
	public UDATA haltedThreads() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExclusiveAccessAcquireEvent._haltedThreadsOffset_));
	}

	// U64 haltedThreads
	public UDATAPointer haltedThreadsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._haltedThreadsOffset_));
	}

	// OMR_VMThread* lastResponder
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastResponderOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer lastResponder() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_ExclusiveAccessAcquireEvent._lastResponderOffset_));
	}

	// OMR_VMThread* lastResponder
	public PointerPointer lastResponderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._lastResponderOffset_));
	}

	// U64 meanIdleTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_meanIdleTimeOffset_", declaredType="U64")
	public UDATA meanIdleTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExclusiveAccessAcquireEvent._meanIdleTimeOffset_));
	}

	// U64 meanIdleTime
	public UDATAPointer meanIdleTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._meanIdleTimeOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ExclusiveAccessAcquireEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ExclusiveAccessAcquireEvent._timestampOffset_));
	}

}
