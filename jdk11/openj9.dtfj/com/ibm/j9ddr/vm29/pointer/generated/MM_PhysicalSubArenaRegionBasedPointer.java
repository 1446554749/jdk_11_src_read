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
 * Structure: MM_PhysicalSubArenaRegionBasedPointer
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
 * The generated code will provide getters for all elements in the MM_PhysicalSubArenaRegionBasedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_PhysicalSubArenaRegionBased.class)
public class MM_PhysicalSubArenaRegionBasedPointer extends MM_PhysicalSubArenaPointer {

	// NULL
	public static final MM_PhysicalSubArenaRegionBasedPointer NULL = new MM_PhysicalSubArenaRegionBasedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_PhysicalSubArenaRegionBasedPointer(long address) {
		super(address);
	}

	public static MM_PhysicalSubArenaRegionBasedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_PhysicalSubArenaRegionBasedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_PhysicalSubArenaRegionBasedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_PhysicalSubArenaRegionBasedPointer(address);
	}

	public MM_PhysicalSubArenaRegionBasedPointer add(long count) {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(address + (MM_PhysicalSubArenaRegionBased.SIZEOF * count));
	}

	public MM_PhysicalSubArenaRegionBasedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_PhysicalSubArenaRegionBasedPointer addOffset(long offset) {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(address + offset);
	}

	public MM_PhysicalSubArenaRegionBasedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaRegionBasedPointer sub(long count) {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(address - (MM_PhysicalSubArenaRegionBased.SIZEOF * count));
	}

	public MM_PhysicalSubArenaRegionBasedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_PhysicalSubArenaRegionBasedPointer subOffset(long offset) {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(address - offset);
	}

	public MM_PhysicalSubArenaRegionBasedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_PhysicalSubArenaRegionBasedPointer untag(long mask) {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(address & ~mask);
	}

	public MM_PhysicalSubArenaRegionBasedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_PhysicalSubArenaRegionBased.SIZEOF;
	}

	// Implementation methods

	// U64 _affinityLeaderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__affinityLeaderCountOffset_", declaredType="U64")
	public UDATA _affinityLeaderCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_PhysicalSubArenaRegionBased.__affinityLeaderCountOffset_));
	}

	// U64 _affinityLeaderCount
	public UDATAPointer _affinityLeaderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaRegionBased.__affinityLeaderCountOffset_));
	}

	// const J9MemoryNodeDetail* _affinityLeaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__affinityLeadersOffset_", declaredType="const J9MemoryNodeDetail*")
	public J9MemoryNodeDetailPointer _affinityLeaders() throws CorruptDataException {
		return J9MemoryNodeDetailPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaRegionBased.__affinityLeadersOffset_));
	}

	// const J9MemoryNodeDetail* _affinityLeaders
	public PointerPointer _affinityLeadersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaRegionBased.__affinityLeadersOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_PhysicalSubArenaRegionBased.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaRegionBased.__extensionsOffset_));
	}

	// U64 _nextNUMAIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextNUMAIndexOffset_", declaredType="U64")
	public UDATA _nextNUMAIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_PhysicalSubArenaRegionBased.__nextNUMAIndexOffset_));
	}

	// U64 _nextNUMAIndex
	public UDATAPointer _nextNUMAIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaRegionBased.__nextNUMAIndexOffset_));
	}

	// MM_PhysicalSubArenaRegionBased* _nextSubArena
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextSubArenaOffset_", declaredType="MM_PhysicalSubArenaRegionBased*")
	public MM_PhysicalSubArenaRegionBasedPointer _nextSubArena() throws CorruptDataException {
		return MM_PhysicalSubArenaRegionBasedPointer.cast(getPointerAtOffset(MM_PhysicalSubArenaRegionBased.__nextSubArenaOffset_));
	}

	// MM_PhysicalSubArenaRegionBased* _nextSubArena
	public PointerPointer _nextSubArenaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_PhysicalSubArenaRegionBased.__nextSubArenaOffset_));
	}

}
