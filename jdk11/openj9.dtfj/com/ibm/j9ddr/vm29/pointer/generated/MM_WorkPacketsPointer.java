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
 * Structure: MM_WorkPacketsPointer
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
 * The generated code will provide getters for all elements in the MM_WorkPacketsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_WorkPackets.class)
public class MM_WorkPacketsPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_WorkPacketsPointer NULL = new MM_WorkPacketsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_WorkPacketsPointer(long address) {
		super(address);
	}

	public static MM_WorkPacketsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_WorkPacketsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_WorkPacketsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_WorkPacketsPointer(address);
	}

	public MM_WorkPacketsPointer add(long count) {
		return MM_WorkPacketsPointer.cast(address + (MM_WorkPackets.SIZEOF * count));
	}

	public MM_WorkPacketsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_WorkPacketsPointer addOffset(long offset) {
		return MM_WorkPacketsPointer.cast(address + offset);
	}

	public MM_WorkPacketsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_WorkPacketsPointer sub(long count) {
		return MM_WorkPacketsPointer.cast(address - (MM_WorkPackets.SIZEOF * count));
	}

	public MM_WorkPacketsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_WorkPacketsPointer subOffset(long offset) {
		return MM_WorkPacketsPointer.cast(address - offset);
	}

	public MM_WorkPacketsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_WorkPacketsPointer untag(long mask) {
		return MM_WorkPacketsPointer.cast(address & ~mask);
	}

	public MM_WorkPacketsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_WorkPackets.SIZEOF;
	}

	// Implementation methods

	// U64 _activePackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__activePacketsOffset_", declaredType="U64")
	public UDATA _activePackets() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__activePacketsOffset_));
	}

	// U64 _activePackets
	public UDATAPointer _activePacketsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__activePacketsOffset_));
	}

	// omrthread_monitor_t _allocatingPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocatingPacketsOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _allocatingPackets() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_WorkPackets.__allocatingPacketsOffset_));
	}

	// omrthread_monitor_t _allocatingPackets
	public PointerPointer _allocatingPacketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__allocatingPacketsOffset_));
	}

	// MM_PacketList _deferredFullPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredFullPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _deferredFullPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__deferredFullPacketListOffset_));
	}

	// MM_PacketList _deferredFullPacketList
	public PointerPointer _deferredFullPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__deferredFullPacketListOffset_));
	}

	// MM_PacketList _deferredPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__deferredPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _deferredPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__deferredPacketListOffset_));
	}

	// MM_PacketList _deferredPacketList
	public PointerPointer _deferredPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__deferredPacketListOffset_));
	}

	// MM_PacketList _emptyPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__emptyPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _emptyPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__emptyPacketListOffset_));
	}

	// MM_PacketList _emptyPacketList
	public PointerPointer _emptyPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__emptyPacketListOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_WorkPackets.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__extensionsOffset_));
	}

	// MM_PacketList _fullPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fullPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _fullPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__fullPacketListOffset_));
	}

	// MM_PacketList _fullPacketList
	public PointerPointer _fullPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__fullPacketListOffset_));
	}

	// volatile U64 _inputListDoneIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inputListDoneIndexOffset_", declaredType="volatile U64")
	public UDATA _inputListDoneIndex() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__inputListDoneIndexOffset_));
	}

	// volatile U64 _inputListDoneIndex
	public UDATAPointer _inputListDoneIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__inputListDoneIndexOffset_));
	}

	// omrthread_monitor_t _inputListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inputListMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _inputListMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_WorkPackets.__inputListMonitorOffset_));
	}

	// omrthread_monitor_t _inputListMonitor
	public PointerPointer _inputListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__inputListMonitorOffset_));
	}

	// volatile U64 _inputListWaitCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__inputListWaitCountOffset_", declaredType="volatile U64")
	public UDATA _inputListWaitCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__inputListWaitCountOffset_));
	}

	// volatile U64 _inputListWaitCount
	public UDATAPointer _inputListWaitCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__inputListWaitCountOffset_));
	}

	// U64 _maxPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxPacketsOffset_", declaredType="U64")
	public UDATA _maxPackets() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__maxPacketsOffset_));
	}

	// U64 _maxPackets
	public UDATAPointer _maxPacketsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__maxPacketsOffset_));
	}

	// MM_PacketList _nonEmptyPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nonEmptyPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _nonEmptyPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__nonEmptyPacketListOffset_));
	}

	// MM_PacketList _nonEmptyPacketList
	public PointerPointer _nonEmptyPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__nonEmptyPacketListOffset_));
	}

	// MM_WorkPacketOverflow* _overflowHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowHandlerOffset_", declaredType="MM_WorkPacketOverflow*")
	public MM_WorkPacketOverflowPointer _overflowHandler() throws CorruptDataException {
		return MM_WorkPacketOverflowPointer.cast(getPointerAtOffset(MM_WorkPackets.__overflowHandlerOffset_));
	}

	// MM_WorkPacketOverflow* _overflowHandler
	public PointerPointer _overflowHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__overflowHandlerOffset_));
	}

	// U64 _packetsBlocksTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__packetsBlocksTopOffset_", declaredType="U64")
	public UDATA _packetsBlocksTop() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__packetsBlocksTopOffset_));
	}

	// U64 _packetsBlocksTop
	public UDATAPointer _packetsBlocksTopEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__packetsBlocksTopOffset_));
	}

	// U64 _packetsPerBlock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__packetsPerBlockOffset_", declaredType="U64")
	public UDATA _packetsPerBlock() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_WorkPackets.__packetsPerBlockOffset_));
	}

	// U64 _packetsPerBlock
	public UDATAPointer _packetsPerBlockEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_WorkPackets.__packetsPerBlockOffset_));
	}

	// MM_Packet*[] _packetsStart
	public PointerPointer _packetsStartEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__packetsStartOffset_));
	}

	// OMRPortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer _portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(MM_WorkPackets.__portLibraryOffset_));
	}

	// OMRPortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__portLibraryOffset_));
	}

	// MM_PacketList _relativelyFullPacketList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__relativelyFullPacketListOffset_", declaredType="MM_PacketList")
	public MM_PacketListPointer _relativelyFullPacketList() throws CorruptDataException {
		return MM_PacketListPointer.cast(nonNullFieldEA(MM_WorkPackets.__relativelyFullPacketListOffset_));
	}

	// MM_PacketList _relativelyFullPacketList
	public PointerPointer _relativelyFullPacketListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPackets.__relativelyFullPacketListOffset_));
	}

}
