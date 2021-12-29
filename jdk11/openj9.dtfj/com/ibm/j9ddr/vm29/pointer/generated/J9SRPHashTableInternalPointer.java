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
 * Structure: J9SRPHashTableInternalPointer
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
 * The generated code will provide getters for all elements in the J9SRPHashTableInternalPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9SRPHashTableInternal.class)
public class J9SRPHashTableInternalPointer extends StructurePointer {

	// NULL
	public static final J9SRPHashTableInternalPointer NULL = new J9SRPHashTableInternalPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9SRPHashTableInternalPointer(long address) {
		super(address);
	}

	public static J9SRPHashTableInternalPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9SRPHashTableInternalPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9SRPHashTableInternalPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9SRPHashTableInternalPointer(address);
	}

	public J9SRPHashTableInternalPointer add(long count) {
		return J9SRPHashTableInternalPointer.cast(address + (J9SRPHashTableInternal.SIZEOF * count));
	}

	public J9SRPHashTableInternalPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9SRPHashTableInternalPointer addOffset(long offset) {
		return J9SRPHashTableInternalPointer.cast(address + offset);
	}

	public J9SRPHashTableInternalPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9SRPHashTableInternalPointer sub(long count) {
		return J9SRPHashTableInternalPointer.cast(address - (J9SRPHashTableInternal.SIZEOF * count));
	}

	public J9SRPHashTableInternalPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9SRPHashTableInternalPointer subOffset(long offset) {
		return J9SRPHashTableInternalPointer.cast(address - offset);
	}

	public J9SRPHashTableInternalPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9SRPHashTableInternalPointer untag(long mask) {
		return J9SRPHashTableInternalPointer.cast(address & ~mask);
	}

	public J9SRPHashTableInternalPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9SRPHashTableInternal.SIZEOF;
	}

	// Implementation methods

	// U32 entrySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entrySizeOffset_", declaredType="U32")
	public UDATA entrySize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SRPHashTableInternal._entrySizeOffset_));
	}

	// U32 entrySize
	public UDATAPointer entrySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTableInternal._entrySizeOffset_));
	}

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SRPHashTableInternal._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTableInternal._flagsOffset_));
	}

	// J9SRP(J9SimplePool) nodePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodePoolOffset_", declaredType="J9SRP(J9SimplePool)")
	public J9SimplePoolPointer nodePool() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SRPHashTableInternal._nodePoolOffset_);
		if (nextAddress == 0) {
			return J9SimplePoolPointer.NULL;
		}
		return J9SimplePoolPointer.cast(address + (J9SRPHashTableInternal._nodePoolOffset_ + nextAddress));
	}

	// J9SRP(J9SimplePool) nodePool
	public SelfRelativePointer nodePoolEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SRPHashTableInternal._nodePoolOffset_));
	}

	// U32 nodeSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodeSizeOffset_", declaredType="U32")
	public UDATA nodeSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SRPHashTableInternal._nodeSizeOffset_));
	}

	// U32 nodeSize
	public UDATAPointer nodeSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTableInternal._nodeSizeOffset_));
	}

	// J9SRP(J9SRP) nodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nodesOffset_", declaredType="J9SRP(J9SRP)")
	public SelfRelativePointer nodes() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9SRPHashTableInternal._nodesOffset_);
		if (nextAddress == 0) {
			return SelfRelativePointer.NULL;
		}
		return SelfRelativePointer.cast(address + (J9SRPHashTableInternal._nodesOffset_ + nextAddress));
	}

	// J9SRP(J9SRP) nodes
	public SelfRelativePointer nodesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9SRPHashTableInternal._nodesOffset_));
	}

	// U32 numberOfNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfNodesOffset_", declaredType="U32")
	public UDATA numberOfNodes() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SRPHashTableInternal._numberOfNodesOffset_));
	}

	// U32 numberOfNodes
	public UDATAPointer numberOfNodesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTableInternal._numberOfNodesOffset_));
	}

	// U32 tableSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableSizeOffset_", declaredType="U32")
	public UDATA tableSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9SRPHashTableInternal._tableSizeOffset_));
	}

	// U32 tableSize
	public UDATAPointer tableSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9SRPHashTableInternal._tableSizeOffset_));
	}

}
