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
 * Structure: MM_RealtimeAccessBarrierPointer
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
 * The generated code will provide getters for all elements in the MM_RealtimeAccessBarrierPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RealtimeAccessBarrier.class)
public class MM_RealtimeAccessBarrierPointer extends MM_ObjectAccessBarrierPointer {

	// NULL
	public static final MM_RealtimeAccessBarrierPointer NULL = new MM_RealtimeAccessBarrierPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RealtimeAccessBarrierPointer(long address) {
		super(address);
	}

	public static MM_RealtimeAccessBarrierPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RealtimeAccessBarrierPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RealtimeAccessBarrierPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RealtimeAccessBarrierPointer(address);
	}

	public MM_RealtimeAccessBarrierPointer add(long count) {
		return MM_RealtimeAccessBarrierPointer.cast(address + (MM_RealtimeAccessBarrier.SIZEOF * count));
	}

	public MM_RealtimeAccessBarrierPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RealtimeAccessBarrierPointer addOffset(long offset) {
		return MM_RealtimeAccessBarrierPointer.cast(address + offset);
	}

	public MM_RealtimeAccessBarrierPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RealtimeAccessBarrierPointer sub(long count) {
		return MM_RealtimeAccessBarrierPointer.cast(address - (MM_RealtimeAccessBarrier.SIZEOF * count));
	}

	public MM_RealtimeAccessBarrierPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RealtimeAccessBarrierPointer subOffset(long offset) {
		return MM_RealtimeAccessBarrierPointer.cast(address - offset);
	}

	public MM_RealtimeAccessBarrierPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RealtimeAccessBarrierPointer untag(long mask) {
		return MM_RealtimeAccessBarrierPointer.cast(address & ~mask);
	}

	public MM_RealtimeAccessBarrierPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RealtimeAccessBarrier.SIZEOF;
	}

	// Implementation methods

	// bool _doubleBarrierActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doubleBarrierActiveOffset_", declaredType="bool")
	public boolean _doubleBarrierActive() throws CorruptDataException {
		return getBoolAtOffset(MM_RealtimeAccessBarrier.__doubleBarrierActiveOffset_);
	}

	// bool _doubleBarrierActive
	public BoolPointer _doubleBarrierActiveEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RealtimeAccessBarrier.__doubleBarrierActiveOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_RealtimeMarkingScheme*")
	public MM_RealtimeMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_RealtimeMarkingSchemePointer.cast(getPointerAtOffset(MM_RealtimeAccessBarrier.__markingSchemeOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeAccessBarrier.__markingSchemeOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__realtimeGCOffset_", declaredType="MM_RealtimeGC*")
	public MM_RealtimeGCPointer _realtimeGC() throws CorruptDataException {
		return MM_RealtimeGCPointer.cast(getPointerAtOffset(MM_RealtimeAccessBarrier.__realtimeGCOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	public PointerPointer _realtimeGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeAccessBarrier.__realtimeGCOffset_));
	}

}
