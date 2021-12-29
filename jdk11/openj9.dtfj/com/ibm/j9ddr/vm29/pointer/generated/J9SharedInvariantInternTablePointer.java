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
 * Structure: J9SharedInvariantInternTablePointer
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
 * The generated code will provide getters for all elements in the J9SharedInvariantInternTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SharedInvariantInternTable.class)
public class J9SharedInvariantInternTablePointer extends StructurePointer {

	// NULL
	public static final J9SharedInvariantInternTablePointer NULL = new J9SharedInvariantInternTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SharedInvariantInternTablePointer(long address) {
		super(address);
	}

	public static J9SharedInvariantInternTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SharedInvariantInternTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SharedInvariantInternTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SharedInvariantInternTablePointer(address);
	}

	public J9SharedInvariantInternTablePointer add(long count) {
		return J9SharedInvariantInternTablePointer.cast(address + (J9SharedInvariantInternTable.SIZEOF * count));
	}

	public J9SharedInvariantInternTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SharedInvariantInternTablePointer addOffset(long offset) {
		return J9SharedInvariantInternTablePointer.cast(address + offset);
	}

	public J9SharedInvariantInternTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SharedInvariantInternTablePointer sub(long count) {
		return J9SharedInvariantInternTablePointer.cast(address - (J9SharedInvariantInternTable.SIZEOF * count));
	}

	public J9SharedInvariantInternTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SharedInvariantInternTablePointer subOffset(long offset) {
		return J9SharedInvariantInternTablePointer.cast(address - offset);
	}

	public J9SharedInvariantInternTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SharedInvariantInternTablePointer untag(long mask) {
		return J9SharedInvariantInternTablePointer.cast(address & ~mask);
	}

	public J9SharedInvariantInternTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SharedInvariantInternTable.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9SharedInvariantInternTable._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._flagsOffset_));
	}

	// J9SharedInternSRPHashTableEntry* headNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headNodeOffset_", declaredType="J9SharedInternSRPHashTableEntry*")
	public J9SharedInternSRPHashTableEntryPointer headNode() throws CorruptDataException {
		return J9SharedInternSRPHashTableEntryPointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._headNodeOffset_));
	}

	// J9SharedInternSRPHashTableEntry* headNode
	public PointerPointer headNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._headNodeOffset_));
	}

	// void* performNodeAction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_performNodeActionOffset_", declaredType="void*")
	public VoidPointer performNodeAction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._performNodeActionOffset_));
	}

	// void* performNodeAction
	public PointerPointer performNodeActionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._performNodeActionOffset_));
	}

	// J9SRP* sharedHeadNodePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedHeadNodePtrOffset_", declaredType="J9SRP*")
	public SelfRelativePointer sharedHeadNodePtr() throws CorruptDataException {
		return SelfRelativePointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._sharedHeadNodePtrOffset_));
	}

	// J9SRP* sharedHeadNodePtr
	public PointerPointer sharedHeadNodePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._sharedHeadNodePtrOffset_));
	}

	// J9SRPHashTable* sharedInvariantSRPHashtable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedInvariantSRPHashtableOffset_", declaredType="J9SRPHashTable*")
	public J9SRPHashTablePointer sharedInvariantSRPHashtable() throws CorruptDataException {
		return J9SRPHashTablePointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._sharedInvariantSRPHashtableOffset_));
	}

	// J9SRPHashTable* sharedInvariantSRPHashtable
	public PointerPointer sharedInvariantSRPHashtableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._sharedInvariantSRPHashtableOffset_));
	}

	// J9SRP* sharedTailNodePtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sharedTailNodePtrOffset_", declaredType="J9SRP*")
	public SelfRelativePointer sharedTailNodePtr() throws CorruptDataException {
		return SelfRelativePointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._sharedTailNodePtrOffset_));
	}

	// J9SRP* sharedTailNodePtr
	public PointerPointer sharedTailNodePtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._sharedTailNodePtrOffset_));
	}

	// J9ClassLoader* systemClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemClassLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer systemClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._systemClassLoaderOffset_));
	}

	// J9ClassLoader* systemClassLoader
	public PointerPointer systemClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._systemClassLoaderOffset_));
	}

	// omrthread_monitor_t tableInternFxMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableInternFxMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer tableInternFxMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._tableInternFxMutexOffset_));
	}

	// omrthread_monitor_t tableInternFxMutex
	public PointerPointer tableInternFxMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._tableInternFxMutexOffset_));
	}

	// J9SharedInternSRPHashTableEntry* tailNode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tailNodeOffset_", declaredType="J9SharedInternSRPHashTableEntry*")
	public J9SharedInternSRPHashTableEntryPointer tailNode() throws CorruptDataException {
		return J9SharedInternSRPHashTableEntryPointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._tailNodeOffset_));
	}

	// J9SharedInternSRPHashTableEntry* tailNode
	public PointerPointer tailNodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._tailNodeOffset_));
	}

	// U32* totalSharedNodesPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSharedNodesPtrOffset_", declaredType="U32*")
	public UDATAPointer totalSharedNodesPtr() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._totalSharedNodesPtrOffset_));
	}

	// U32* totalSharedNodesPtr
	public PointerPointer totalSharedNodesPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._totalSharedNodesPtrOffset_));
	}

	// U32* totalSharedWeightPtr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSharedWeightPtrOffset_", declaredType="U32*")
	public UDATAPointer totalSharedWeightPtr() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9SharedInvariantInternTable._totalSharedWeightPtrOffset_));
	}

	// U32* totalSharedWeightPtr
	public PointerPointer totalSharedWeightPtrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9SharedInvariantInternTable._totalSharedWeightPtrOffset_));
	}

}
