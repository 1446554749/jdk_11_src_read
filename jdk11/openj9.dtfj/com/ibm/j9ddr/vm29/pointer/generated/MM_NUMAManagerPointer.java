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
 * Structure: MM_NUMAManagerPointer
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
 * The generated code will provide getters for all elements in the MM_NUMAManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_NUMAManager.class)
public class MM_NUMAManagerPointer extends StructurePointer {

	// NULL
	public static final MM_NUMAManagerPointer NULL = new MM_NUMAManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_NUMAManagerPointer(long address) {
		super(address);
	}

	public static MM_NUMAManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_NUMAManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_NUMAManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_NUMAManagerPointer(address);
	}

	public MM_NUMAManagerPointer add(long count) {
		return MM_NUMAManagerPointer.cast(address + (MM_NUMAManager.SIZEOF * count));
	}

	public MM_NUMAManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_NUMAManagerPointer addOffset(long offset) {
		return MM_NUMAManagerPointer.cast(address + offset);
	}

	public MM_NUMAManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_NUMAManagerPointer sub(long count) {
		return MM_NUMAManagerPointer.cast(address - (MM_NUMAManager.SIZEOF * count));
	}

	public MM_NUMAManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_NUMAManagerPointer subOffset(long offset) {
		return MM_NUMAManagerPointer.cast(address - offset);
	}

	public MM_NUMAManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_NUMAManagerPointer untag(long mask) {
		return MM_NUMAManagerPointer.cast(address & ~mask);
	}

	public MM_NUMAManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_NUMAManager.SIZEOF;
	}

	// Implementation methods

	// U64 _activeNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeNodeCountOffset_", declaredType="U64")
	public UDATA _activeNodeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_NUMAManager.__activeNodeCountOffset_));
	}

	// U64 _activeNodeCount
	public UDATAPointer _activeNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_NUMAManager.__activeNodeCountOffset_));
	}

	// J9MemoryNodeDetail* _activeNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activeNodesOffset_", declaredType="J9MemoryNodeDetail*")
	public J9MemoryNodeDetailPointer _activeNodes() throws CorruptDataException {
		return J9MemoryNodeDetailPointer.cast(getPointerAtOffset(MM_NUMAManager.__activeNodesOffset_));
	}

	// J9MemoryNodeDetail* _activeNodes
	public PointerPointer _activeNodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_NUMAManager.__activeNodesOffset_));
	}

	// U64 _affinityLeaderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__affinityLeaderCountOffset_", declaredType="U64")
	public UDATA _affinityLeaderCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_NUMAManager.__affinityLeaderCountOffset_));
	}

	// U64 _affinityLeaderCount
	public UDATAPointer _affinityLeaderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_NUMAManager.__affinityLeaderCountOffset_));
	}

	// J9MemoryNodeDetail* _affinityLeaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__affinityLeadersOffset_", declaredType="J9MemoryNodeDetail*")
	public J9MemoryNodeDetailPointer _affinityLeaders() throws CorruptDataException {
		return J9MemoryNodeDetailPointer.cast(getPointerAtOffset(MM_NUMAManager.__affinityLeadersOffset_));
	}

	// J9MemoryNodeDetail* _affinityLeaders
	public PointerPointer _affinityLeadersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_NUMAManager.__affinityLeadersOffset_));
	}

	// U64 _freeProcessorPoolNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeProcessorPoolNodeCountOffset_", declaredType="U64")
	public UDATA _freeProcessorPoolNodeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_NUMAManager.__freeProcessorPoolNodeCountOffset_));
	}

	// U64 _freeProcessorPoolNodeCount
	public UDATAPointer _freeProcessorPoolNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_NUMAManager.__freeProcessorPoolNodeCountOffset_));
	}

	// J9MemoryNodeDetail* _freeProcessorPoolNodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__freeProcessorPoolNodesOffset_", declaredType="J9MemoryNodeDetail*")
	public J9MemoryNodeDetailPointer _freeProcessorPoolNodes() throws CorruptDataException {
		return J9MemoryNodeDetailPointer.cast(getPointerAtOffset(MM_NUMAManager.__freeProcessorPoolNodesOffset_));
	}

	// J9MemoryNodeDetail* _freeProcessorPoolNodes
	public PointerPointer _freeProcessorPoolNodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_NUMAManager.__freeProcessorPoolNodesOffset_));
	}

	// U64 _maximumNodeNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximumNodeNumberOffset_", declaredType="U64")
	public UDATA _maximumNodeNumber() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_NUMAManager.__maximumNodeNumberOffset_));
	}

	// U64 _maximumNodeNumber
	public UDATAPointer _maximumNodeNumberEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_NUMAManager.__maximumNodeNumberOffset_));
	}

	// bool _physicalNumaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__physicalNumaEnabledOffset_", declaredType="bool")
	public boolean _physicalNumaEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_NUMAManager.__physicalNumaEnabledOffset_);
	}

	// bool _physicalNumaEnabled
	public BoolPointer _physicalNumaEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_NUMAManager.__physicalNumaEnabledOffset_));
	}

	// bool _shouldSetCPUAffinity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldSetCPUAffinityOffset_", declaredType="bool")
	public boolean _shouldSetCPUAffinity() throws CorruptDataException {
		return getBoolAtOffset(MM_NUMAManager.__shouldSetCPUAffinityOffset_);
	}

	// bool _shouldSetCPUAffinity
	public BoolPointer _shouldSetCPUAffinityEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_NUMAManager.__shouldSetCPUAffinityOffset_));
	}

	// U64 _simulatedNodeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__simulatedNodeCountOffset_", declaredType="U64")
	public UDATA _simulatedNodeCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_NUMAManager.__simulatedNodeCountOffset_));
	}

	// U64 _simulatedNodeCount
	public UDATAPointer _simulatedNodeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_NUMAManager.__simulatedNodeCountOffset_));
	}

}
