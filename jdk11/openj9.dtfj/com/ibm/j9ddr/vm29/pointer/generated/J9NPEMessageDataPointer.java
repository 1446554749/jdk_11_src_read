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
 * Structure: J9NPEMessageDataPointer
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
 * The generated code will provide getters for all elements in the J9NPEMessageDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9NPEMessageData.class)
public class J9NPEMessageDataPointer extends StructurePointer {

	// NULL
	public static final J9NPEMessageDataPointer NULL = new J9NPEMessageDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9NPEMessageDataPointer(long address) {
		super(address);
	}

	public static J9NPEMessageDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9NPEMessageDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9NPEMessageDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9NPEMessageDataPointer(address);
	}

	public J9NPEMessageDataPointer add(long count) {
		return J9NPEMessageDataPointer.cast(address + (J9NPEMessageData.SIZEOF * count));
	}

	public J9NPEMessageDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9NPEMessageDataPointer addOffset(long offset) {
		return J9NPEMessageDataPointer.cast(address + offset);
	}

	public J9NPEMessageDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9NPEMessageDataPointer sub(long count) {
		return J9NPEMessageDataPointer.cast(address - (J9NPEMessageData.SIZEOF * count));
	}

	public J9NPEMessageDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9NPEMessageDataPointer subOffset(long offset) {
		return J9NPEMessageDataPointer.cast(address - offset);
	}

	public J9NPEMessageDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9NPEMessageDataPointer untag(long mask) {
		return J9NPEMessageDataPointer.cast(address & ~mask);
	}

	public J9NPEMessageDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9NPEMessageData.SIZEOF;
	}

	// Implementation methods

	// U32* bytecodeMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeMapOffset_", declaredType="U32*")
	public UDATAPointer bytecodeMap() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9NPEMessageData._bytecodeMapOffset_));
	}

	// U32* bytecodeMap
	public PointerPointer bytecodeMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._bytecodeMapOffset_));
	}

	// UDATA bytecodeMapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeMapSizeOffset_", declaredType="UDATA")
	public UDATA bytecodeMapSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._bytecodeMapSizeOffset_);
	}

	// UDATA bytecodeMapSize
	public UDATAPointer bytecodeMapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._bytecodeMapSizeOffset_));
	}

	// J9BytecodeOffset* bytecodeOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeOffsetOffset_", declaredType="J9BytecodeOffset*")
	public J9BytecodeOffsetPointer bytecodeOffset() throws CorruptDataException {
		return J9BytecodeOffsetPointer.cast(getPointerAtOffset(J9NPEMessageData._bytecodeOffsetOffset_));
	}

	// J9BytecodeOffset* bytecodeOffset
	public PointerPointer bytecodeOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._bytecodeOffsetOffset_));
	}

	// UDATA bytecodeOffsetSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeOffsetSizeOffset_", declaredType="UDATA")
	public UDATA bytecodeOffsetSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._bytecodeOffsetSizeOffset_);
	}

	// UDATA bytecodeOffsetSize
	public UDATAPointer bytecodeOffsetSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._bytecodeOffsetSizeOffset_));
	}

	// J9BranchTargetStack* liveStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveStackOffset_", declaredType="J9BranchTargetStack*")
	public J9BranchTargetStackPointer liveStack() throws CorruptDataException {
		return J9BranchTargetStackPointer.cast(getPointerAtOffset(J9NPEMessageData._liveStackOffset_));
	}

	// J9BranchTargetStack* liveStack
	public PointerPointer liveStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._liveStackOffset_));
	}

	// UDATA liveStackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_liveStackSizeOffset_", declaredType="UDATA")
	public UDATA liveStackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._liveStackSizeOffset_);
	}

	// UDATA liveStackSize
	public UDATAPointer liveStackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._liveStackSizeOffset_));
	}

	// UDATA npePC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_npePCOffset_", declaredType="UDATA")
	public UDATA npePC() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._npePCOffset_);
	}

	// UDATA npePC
	public UDATAPointer npePCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._npePCOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9NPEMessageData._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._romClassOffset_));
	}

	// J9ROMMethod* romMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodOffset_", declaredType="J9ROMMethod*")
	public J9ROMMethodPointer romMethod() throws CorruptDataException {
		return J9ROMMethodPointer.cast(getPointerAtOffset(J9NPEMessageData._romMethodOffset_));
	}

	// J9ROMMethod* romMethod
	public PointerPointer romMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._romMethodOffset_));
	}

	// UDATA* stackMaps
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsOffset_", declaredType="UDATA*")
	public UDATAPointer stackMaps() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9NPEMessageData._stackMapsOffset_));
	}

	// UDATA* stackMaps
	public PointerPointer stackMapsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._stackMapsOffset_));
	}

	// IDATA stackMapsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsCountOffset_", declaredType="IDATA")
	public IDATA stackMapsCount() throws CorruptDataException {
		return getIDATAAtOffset(J9NPEMessageData._stackMapsCountOffset_);
	}

	// IDATA stackMapsCount
	public IDATAPointer stackMapsCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._stackMapsCountOffset_));
	}

	// UDATA stackMapsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackMapsSizeOffset_", declaredType="UDATA")
	public UDATA stackMapsSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._stackMapsSizeOffset_);
	}

	// UDATA stackMapsSize
	public UDATAPointer stackMapsSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._stackMapsSizeOffset_));
	}

	// UDATA stackSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackSizeOffset_", declaredType="UDATA")
	public UDATA stackSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._stackSizeOffset_);
	}

	// UDATA stackSize
	public UDATAPointer stackSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._stackSizeOffset_));
	}

	// UDATA* unwalkedQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueOffset_", declaredType="UDATA*")
	public UDATAPointer unwalkedQueue() throws CorruptDataException {
		return UDATAPointer.cast(getPointerAtOffset(J9NPEMessageData._unwalkedQueueOffset_));
	}

	// UDATA* unwalkedQueue
	public PointerPointer unwalkedQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._unwalkedQueueOffset_));
	}

	// UDATA unwalkedQueueHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueHeadOffset_", declaredType="UDATA")
	public UDATA unwalkedQueueHead() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._unwalkedQueueHeadOffset_);
	}

	// UDATA unwalkedQueueHead
	public UDATAPointer unwalkedQueueHeadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._unwalkedQueueHeadOffset_));
	}

	// UDATA unwalkedQueueSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueSizeOffset_", declaredType="UDATA")
	public UDATA unwalkedQueueSize() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._unwalkedQueueSizeOffset_);
	}

	// UDATA unwalkedQueueSize
	public UDATAPointer unwalkedQueueSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._unwalkedQueueSizeOffset_));
	}

	// UDATA unwalkedQueueTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unwalkedQueueTailOffset_", declaredType="UDATA")
	public UDATA unwalkedQueueTail() throws CorruptDataException {
		return getUDATAAtOffset(J9NPEMessageData._unwalkedQueueTailOffset_);
	}

	// UDATA unwalkedQueueTail
	public UDATAPointer unwalkedQueueTailEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9NPEMessageData._unwalkedQueueTailOffset_));
	}

	// J9VMThread* vmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer vmThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9NPEMessageData._vmThreadOffset_));
	}

	// J9VMThread* vmThread
	public PointerPointer vmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9NPEMessageData._vmThreadOffset_));
	}

}
