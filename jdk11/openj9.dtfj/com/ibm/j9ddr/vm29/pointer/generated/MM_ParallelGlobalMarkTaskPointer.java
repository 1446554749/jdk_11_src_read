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
 * Structure: MM_ParallelGlobalMarkTaskPointer
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
 * The generated code will provide getters for all elements in the MM_ParallelGlobalMarkTaskPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ParallelGlobalMarkTask.class)
public class MM_ParallelGlobalMarkTaskPointer extends MM_ParallelTaskPointer {

	// NULL
	public static final MM_ParallelGlobalMarkTaskPointer NULL = new MM_ParallelGlobalMarkTaskPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ParallelGlobalMarkTaskPointer(long address) {
		super(address);
	}

	public static MM_ParallelGlobalMarkTaskPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ParallelGlobalMarkTaskPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ParallelGlobalMarkTaskPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ParallelGlobalMarkTaskPointer(address);
	}

	public MM_ParallelGlobalMarkTaskPointer add(long count) {
		return MM_ParallelGlobalMarkTaskPointer.cast(address + (MM_ParallelGlobalMarkTask.SIZEOF * count));
	}

	public MM_ParallelGlobalMarkTaskPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ParallelGlobalMarkTaskPointer addOffset(long offset) {
		return MM_ParallelGlobalMarkTaskPointer.cast(address + offset);
	}

	public MM_ParallelGlobalMarkTaskPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ParallelGlobalMarkTaskPointer sub(long count) {
		return MM_ParallelGlobalMarkTaskPointer.cast(address - (MM_ParallelGlobalMarkTask.SIZEOF * count));
	}

	public MM_ParallelGlobalMarkTaskPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ParallelGlobalMarkTaskPointer subOffset(long offset) {
		return MM_ParallelGlobalMarkTaskPointer.cast(address - offset);
	}

	public MM_ParallelGlobalMarkTaskPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ParallelGlobalMarkTaskPointer untag(long mask) {
		return MM_ParallelGlobalMarkTaskPointer.cast(address & ~mask);
	}

	public MM_ParallelGlobalMarkTaskPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ParallelGlobalMarkTask.SIZEOF;
	}

	// Implementation methods

	// const MarkAction _action
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__actionOffset_", declaredType="const MarkAction")
	public long _action() throws CorruptDataException {
		if (MarkAction.SIZEOF == 1) {
			return getByteAtOffset(MM_ParallelGlobalMarkTask.__actionOffset_);
		} else if (MarkAction.SIZEOF == 2) {
			return getShortAtOffset(MM_ParallelGlobalMarkTask.__actionOffset_);
		} else if (MarkAction.SIZEOF == 4) {
			return getIntAtOffset(MM_ParallelGlobalMarkTask.__actionOffset_);
		} else if (MarkAction.SIZEOF == 8) {
			return getLongAtOffset(MM_ParallelGlobalMarkTask.__actionOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// const MarkAction _action
	public EnumPointer _actionEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ParallelGlobalMarkTask.__actionOffset_), MarkAction.class);
	}

	// MM_CycleState* _cycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cycleStateOffset_", declaredType="MM_CycleState*")
	public MM_CycleStatePointer _cycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(getPointerAtOffset(MM_ParallelGlobalMarkTask.__cycleStateOffset_));
	}

	// MM_CycleState* _cycleState
	public PointerPointer _cycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalMarkTask.__cycleStateOffset_));
	}

	// MM_GlobalMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_GlobalMarkingScheme*")
	public MM_GlobalMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_GlobalMarkingSchemePointer.cast(getPointerAtOffset(MM_ParallelGlobalMarkTask.__markingSchemeOffset_));
	}

	// MM_GlobalMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ParallelGlobalMarkTask.__markingSchemeOffset_));
	}

	// bool _timeLimitWasHit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeLimitWasHitOffset_", declaredType="bool")
	public boolean _timeLimitWasHit() throws CorruptDataException {
		return getBoolAtOffset(MM_ParallelGlobalMarkTask.__timeLimitWasHitOffset_);
	}

	// bool _timeLimitWasHit
	public BoolPointer _timeLimitWasHitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ParallelGlobalMarkTask.__timeLimitWasHitOffset_));
	}

	// const I64 _timeThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeThresholdOffset_", declaredType="const I64")
	public IDATA _timeThreshold() throws CorruptDataException {
		return new I64(getLongAtOffset(MM_ParallelGlobalMarkTask.__timeThresholdOffset_));
	}

	// const I64 _timeThreshold
	public IDATAPointer _timeThresholdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_ParallelGlobalMarkTask.__timeThresholdOffset_));
	}

}
