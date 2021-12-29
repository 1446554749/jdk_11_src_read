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
 * Structure: RasTriggerGroupPointer
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
 * The generated code will provide getters for all elements in the RasTriggerGroupPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasTriggerGroup.class)
public class RasTriggerGroupPointer extends StructurePointer {

	// NULL
	public static final RasTriggerGroupPointer NULL = new RasTriggerGroupPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasTriggerGroupPointer(long address) {
		super(address);
	}

	public static RasTriggerGroupPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasTriggerGroupPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasTriggerGroupPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasTriggerGroupPointer(address);
	}

	public RasTriggerGroupPointer add(long count) {
		return RasTriggerGroupPointer.cast(address + (RasTriggerGroup.SIZEOF * count));
	}

	public RasTriggerGroupPointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasTriggerGroupPointer addOffset(long offset) {
		return RasTriggerGroupPointer.cast(address + offset);
	}

	public RasTriggerGroupPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasTriggerGroupPointer sub(long count) {
		return RasTriggerGroupPointer.cast(address - (RasTriggerGroup.SIZEOF * count));
	}

	public RasTriggerGroupPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasTriggerGroupPointer subOffset(long offset) {
		return RasTriggerGroupPointer.cast(address - offset);
	}

	public RasTriggerGroupPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasTriggerGroupPointer untag(long mask) {
		return RasTriggerGroupPointer.cast(address & ~mask);
	}

	public RasTriggerGroupPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasTriggerGroup.SIZEOF;
	}

	// Implementation methods

	// U32 actionIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_actionIndexOffset_", declaredType="U32")
	public UDATA actionIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerGroup._actionIndexOffset_));
	}

	// U32 actionIndex
	public UDATAPointer actionIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerGroup._actionIndexOffset_));
	}

	// U32 delay
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_delayOffset_", declaredType="U32")
	public UDATA delay() throws CorruptDataException {
		return new U32(getIntAtOffset(RasTriggerGroup._delayOffset_));
	}

	// U32 delay
	public UDATAPointer delayEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasTriggerGroup._delayOffset_));
	}

	// U8* groupName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_groupNameOffset_", declaredType="U8*")
	public U8Pointer groupName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(RasTriggerGroup._groupNameOffset_));
	}

	// U8* groupName
	public PointerPointer groupNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerGroup._groupNameOffset_));
	}

	// RasHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="RasHeader")
	public RasHeaderPointer header() throws CorruptDataException {
		return RasHeaderPointer.cast(nonNullFieldEA(RasTriggerGroup._headerOffset_));
	}

	// RasHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerGroup._headerOffset_));
	}

	// I32 match
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_matchOffset_", declaredType="I32")
	public IDATA match() throws CorruptDataException {
		return new I32(getIntAtOffset(RasTriggerGroup._matchOffset_));
	}

	// I32 match
	public IDATAPointer matchEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasTriggerGroup._matchOffset_));
	}

	// RasTriggerGroup* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="RasTriggerGroup*")
	public RasTriggerGroupPointer next() throws CorruptDataException {
		return RasTriggerGroupPointer.cast(getPointerAtOffset(RasTriggerGroup._nextOffset_));
	}

	// RasTriggerGroup* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerGroup._nextOffset_));
	}

}
