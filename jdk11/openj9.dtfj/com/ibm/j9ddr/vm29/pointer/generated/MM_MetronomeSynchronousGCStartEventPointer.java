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
 * Structure: MM_MetronomeSynchronousGCStartEventPointer
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
 * The generated code will provide getters for all elements in the MM_MetronomeSynchronousGCStartEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MetronomeSynchronousGCStartEvent.class)
public class MM_MetronomeSynchronousGCStartEventPointer extends StructurePointer {

	// NULL
	public static final MM_MetronomeSynchronousGCStartEventPointer NULL = new MM_MetronomeSynchronousGCStartEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MetronomeSynchronousGCStartEventPointer(long address) {
		super(address);
	}

	public static MM_MetronomeSynchronousGCStartEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MetronomeSynchronousGCStartEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MetronomeSynchronousGCStartEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MetronomeSynchronousGCStartEventPointer(address);
	}

	public MM_MetronomeSynchronousGCStartEventPointer add(long count) {
		return MM_MetronomeSynchronousGCStartEventPointer.cast(address + (MM_MetronomeSynchronousGCStartEvent.SIZEOF * count));
	}

	public MM_MetronomeSynchronousGCStartEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MetronomeSynchronousGCStartEventPointer addOffset(long offset) {
		return MM_MetronomeSynchronousGCStartEventPointer.cast(address + offset);
	}

	public MM_MetronomeSynchronousGCStartEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MetronomeSynchronousGCStartEventPointer sub(long count) {
		return MM_MetronomeSynchronousGCStartEventPointer.cast(address - (MM_MetronomeSynchronousGCStartEvent.SIZEOF * count));
	}

	public MM_MetronomeSynchronousGCStartEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MetronomeSynchronousGCStartEventPointer subOffset(long offset) {
		return MM_MetronomeSynchronousGCStartEventPointer.cast(address - offset);
	}

	public MM_MetronomeSynchronousGCStartEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MetronomeSynchronousGCStartEventPointer untag(long mask) {
		return MM_MetronomeSynchronousGCStartEventPointer.cast(address & ~mask);
	}

	public MM_MetronomeSynchronousGCStartEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MetronomeSynchronousGCStartEvent.SIZEOF;
	}

	// Implementation methods

	// U64 anonymousClassesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_anonymousClassesUnloadedOffset_", declaredType="U64")
	public UDATA anonymousClassesUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._anonymousClassesUnloadedOffset_));
	}

	// U64 anonymousClassesUnloaded
	public UDATAPointer anonymousClassesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._anonymousClassesUnloadedOffset_));
	}

	// U64 classLoadersUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoadersUnloadedOffset_", declaredType="U64")
	public UDATA classLoadersUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._classLoadersUnloadedOffset_));
	}

	// U64 classLoadersUnloaded
	public UDATAPointer classLoadersUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._classLoadersUnloadedOffset_));
	}

	// U64 classesUnloaded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classesUnloadedOffset_", declaredType="U64")
	public UDATA classesUnloaded() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._classesUnloadedOffset_));
	}

	// U64 classesUnloaded
	public UDATAPointer classesUnloadedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._classesUnloadedOffset_));
	}

	// OMR_VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer currentThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_MetronomeSynchronousGCStartEvent._currentThreadOffset_));
	}

	// OMR_VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._currentThreadOffset_));
	}

	// U64 eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="U64")
	public UDATA eventid() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._eventidOffset_));
	}

	// U64 eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._eventidOffset_));
	}

	// U64 heapFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heapFreeOffset_", declaredType="U64")
	public UDATA heapFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._heapFreeOffset_));
	}

	// U64 heapFree
	public UDATAPointer heapFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._heapFreeOffset_));
	}

	// U64 immortalFree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_immortalFreeOffset_", declaredType="U64")
	public UDATA immortalFree() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._immortalFreeOffset_));
	}

	// U64 immortalFree
	public UDATAPointer immortalFreeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._immortalFreeOffset_));
	}

	// U64 reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reasonOffset_", declaredType="U64")
	public UDATA reason() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._reasonOffset_));
	}

	// U64 reason
	public UDATAPointer reasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._reasonOffset_));
	}

	// U64 reasonParameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reasonParameterOffset_", declaredType="U64")
	public UDATA reasonParameter() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._reasonParameterOffset_));
	}

	// U64 reasonParameter
	public UDATAPointer reasonParameterEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._reasonParameterOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_MetronomeSynchronousGCStartEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_MetronomeSynchronousGCStartEvent._timestampOffset_));
	}

}
