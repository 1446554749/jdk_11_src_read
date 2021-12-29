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
 * Structure: J9HookRecordPointer
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
 * The generated code will provide getters for all elements in the J9HookRecordPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9HookRecord.class)
public class J9HookRecordPointer extends StructurePointer {

	// NULL
	public static final J9HookRecordPointer NULL = new J9HookRecordPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9HookRecordPointer(long address) {
		super(address);
	}

	public static J9HookRecordPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9HookRecordPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9HookRecordPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9HookRecordPointer(address);
	}

	public J9HookRecordPointer add(long count) {
		return J9HookRecordPointer.cast(address + (J9HookRecord.SIZEOF * count));
	}

	public J9HookRecordPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9HookRecordPointer addOffset(long offset) {
		return J9HookRecordPointer.cast(address + offset);
	}

	public J9HookRecordPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9HookRecordPointer sub(long count) {
		return J9HookRecordPointer.cast(address - (J9HookRecord.SIZEOF * count));
	}

	public J9HookRecordPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9HookRecordPointer subOffset(long offset) {
		return J9HookRecordPointer.cast(address - offset);
	}

	public J9HookRecordPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9HookRecordPointer untag(long mask) {
		return J9HookRecordPointer.cast(address & ~mask);
	}

	public J9HookRecordPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9HookRecord.SIZEOF;
	}

	// Implementation methods

	// U64 agentID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_agentIDOffset_", declaredType="U64")
	public UDATA agentID() throws CorruptDataException {
		return new U64(getLongAtOffset(J9HookRecord._agentIDOffset_));
	}

	// U64 agentID
	public UDATAPointer agentIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HookRecord._agentIDOffset_));
	}

	// const U8* callsite
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callsiteOffset_", declaredType="const U8*")
	public U8Pointer callsite() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9HookRecord._callsiteOffset_));
	}

	// const U8* callsite
	public PointerPointer callsiteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookRecord._callsiteOffset_));
	}

	// U64 count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countOffset_", declaredType="U64")
	public UDATA count() throws CorruptDataException {
		return new U64(getLongAtOffset(J9HookRecord._countOffset_));
	}

	// U64 count
	public UDATAPointer countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HookRecord._countOffset_));
	}

	// J9HookFunction function
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_functionOffset_", declaredType="J9HookFunction")
	public VoidPointer function() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookRecord._functionOffset_));
	}

	// J9HookFunction function
	public PointerPointer functionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookRecord._functionOffset_));
	}

	// U64 id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffset_", declaredType="U64")
	public UDATA id() throws CorruptDataException {
		return new U64(getLongAtOffset(J9HookRecord._idOffset_));
	}

	// U64 id
	public UDATAPointer idEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9HookRecord._idOffset_));
	}

	// J9HookRecord* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="J9HookRecord*")
	public J9HookRecordPointer next() throws CorruptDataException {
		return J9HookRecordPointer.cast(getPointerAtOffset(J9HookRecord._nextOffset_));
	}

	// J9HookRecord* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookRecord._nextOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9HookRecord._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9HookRecord._userDataOffset_));
	}

}
