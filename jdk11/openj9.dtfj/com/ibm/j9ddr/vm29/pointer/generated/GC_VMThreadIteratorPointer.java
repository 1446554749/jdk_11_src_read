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
 * Structure: GC_VMThreadIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_VMThreadIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_VMThreadIterator.class)
public class GC_VMThreadIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_VMThreadIteratorPointer NULL = new GC_VMThreadIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_VMThreadIteratorPointer(long address) {
		super(address);
	}

	public static GC_VMThreadIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_VMThreadIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_VMThreadIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_VMThreadIteratorPointer(address);
	}

	public GC_VMThreadIteratorPointer add(long count) {
		return GC_VMThreadIteratorPointer.cast(address + (GC_VMThreadIterator.SIZEOF * count));
	}

	public GC_VMThreadIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_VMThreadIteratorPointer addOffset(long offset) {
		return GC_VMThreadIteratorPointer.cast(address + offset);
	}

	public GC_VMThreadIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_VMThreadIteratorPointer sub(long count) {
		return GC_VMThreadIteratorPointer.cast(address - (GC_VMThreadIterator.SIZEOF * count));
	}

	public GC_VMThreadIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_VMThreadIteratorPointer subOffset(long offset) {
		return GC_VMThreadIteratorPointer.cast(address - offset);
	}

	public GC_VMThreadIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_VMThreadIteratorPointer untag(long mask) {
		return GC_VMThreadIteratorPointer.cast(address & ~mask);
	}

	public GC_VMThreadIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_VMThreadIterator.SIZEOF;
	}

	// Implementation methods

	// GC_VMThreadJNISlotIterator _jniSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__jniSlotIteratorOffset_", declaredType="GC_VMThreadJNISlotIterator")
	public GC_VMThreadJNISlotIteratorPointer _jniSlotIterator() throws CorruptDataException {
		return GC_VMThreadJNISlotIteratorPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__jniSlotIteratorOffset_));
	}

	// GC_VMThreadJNISlotIterator _jniSlotIterator
	public PointerPointer _jniSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__jniSlotIteratorOffset_));
	}

	// GC_VMThreadMonitorRecordSlotIterator _monitorRecordSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__monitorRecordSlotIteratorOffset_", declaredType="GC_VMThreadMonitorRecordSlotIterator")
	public GC_VMThreadMonitorRecordSlotIteratorPointer _monitorRecordSlotIterator() throws CorruptDataException {
		return GC_VMThreadMonitorRecordSlotIteratorPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__monitorRecordSlotIteratorOffset_));
	}

	// GC_VMThreadMonitorRecordSlotIterator _monitorRecordSlotIterator
	public PointerPointer _monitorRecordSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__monitorRecordSlotIteratorOffset_));
	}

	// I32 _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="I32")
	public IDATA _state() throws CorruptDataException {
		return new I32(getIntAtOffset(GC_VMThreadIterator.__stateOffset_));
	}

	// I32 _state
	public IDATAPointer _stateEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__stateOffset_));
	}

	// GC_VMThreadSlotIterator _threadSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadSlotIteratorOffset_", declaredType="GC_VMThreadSlotIterator")
	public GC_VMThreadSlotIteratorPointer _threadSlotIterator() throws CorruptDataException {
		return GC_VMThreadSlotIteratorPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__threadSlotIteratorOffset_));
	}

	// GC_VMThreadSlotIterator _threadSlotIterator
	public PointerPointer _threadSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__threadSlotIteratorOffset_));
	}

	// J9VMThread* _vmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer _vmThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(GC_VMThreadIterator.__vmThreadOffset_));
	}

	// J9VMThread* _vmThread
	public PointerPointer _vmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_VMThreadIterator.__vmThreadOffset_));
	}

}
