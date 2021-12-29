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
 * Structure: MM_WorkPacketOverflowPointer
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
 * The generated code will provide getters for all elements in the MM_WorkPacketOverflowPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_WorkPacketOverflow.class)
public class MM_WorkPacketOverflowPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_WorkPacketOverflowPointer NULL = new MM_WorkPacketOverflowPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_WorkPacketOverflowPointer(long address) {
		super(address);
	}

	public static MM_WorkPacketOverflowPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_WorkPacketOverflowPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_WorkPacketOverflowPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_WorkPacketOverflowPointer(address);
	}

	public MM_WorkPacketOverflowPointer add(long count) {
		return MM_WorkPacketOverflowPointer.cast(address + (MM_WorkPacketOverflow.SIZEOF * count));
	}

	public MM_WorkPacketOverflowPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_WorkPacketOverflowPointer addOffset(long offset) {
		return MM_WorkPacketOverflowPointer.cast(address + offset);
	}

	public MM_WorkPacketOverflowPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_WorkPacketOverflowPointer sub(long count) {
		return MM_WorkPacketOverflowPointer.cast(address - (MM_WorkPacketOverflow.SIZEOF * count));
	}

	public MM_WorkPacketOverflowPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_WorkPacketOverflowPointer subOffset(long offset) {
		return MM_WorkPacketOverflowPointer.cast(address - offset);
	}

	public MM_WorkPacketOverflowPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_WorkPacketOverflowPointer untag(long mask) {
		return MM_WorkPacketOverflowPointer.cast(address & ~mask);
	}

	public MM_WorkPacketOverflowPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_WorkPacketOverflow.SIZEOF;
	}

	// Implementation methods

	// volatile bool _overflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowOffset_", declaredType="volatile bool")
	public boolean _overflow() throws CorruptDataException {
		return getBoolAtOffset(MM_WorkPacketOverflow.__overflowOffset_);
	}

	// volatile bool _overflow
	public BoolPointer _overflowEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_WorkPacketOverflow.__overflowOffset_));
	}

	// omrthread_monitor_t _overflowListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__overflowListMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _overflowListMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_WorkPacketOverflow.__overflowListMonitorOffset_));
	}

	// omrthread_monitor_t _overflowListMonitor
	public PointerPointer _overflowListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPacketOverflow.__overflowListMonitorOffset_));
	}

	// MM_WorkPackets* _workPackets
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__workPacketsOffset_", declaredType="MM_WorkPackets*")
	public MM_WorkPacketsPointer _workPackets() throws CorruptDataException {
		return MM_WorkPacketsPointer.cast(getPointerAtOffset(MM_WorkPacketOverflow.__workPacketsOffset_));
	}

	// MM_WorkPackets* _workPackets
	public PointerPointer _workPacketsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_WorkPacketOverflow.__workPacketsOffset_));
	}

}
