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
 * Structure: MM_SweepSchemeSegregatedPointer
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
 * The generated code will provide getters for all elements in the MM_SweepSchemeSegregatedPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_SweepSchemeSegregated.class)
public class MM_SweepSchemeSegregatedPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_SweepSchemeSegregatedPointer NULL = new MM_SweepSchemeSegregatedPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_SweepSchemeSegregatedPointer(long address) {
		super(address);
	}

	public static MM_SweepSchemeSegregatedPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_SweepSchemeSegregatedPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_SweepSchemeSegregatedPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_SweepSchemeSegregatedPointer(address);
	}

	public MM_SweepSchemeSegregatedPointer add(long count) {
		return MM_SweepSchemeSegregatedPointer.cast(address + (MM_SweepSchemeSegregated.SIZEOF * count));
	}

	public MM_SweepSchemeSegregatedPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_SweepSchemeSegregatedPointer addOffset(long offset) {
		return MM_SweepSchemeSegregatedPointer.cast(address + offset);
	}

	public MM_SweepSchemeSegregatedPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_SweepSchemeSegregatedPointer sub(long count) {
		return MM_SweepSchemeSegregatedPointer.cast(address - (MM_SweepSchemeSegregated.SIZEOF * count));
	}

	public MM_SweepSchemeSegregatedPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_SweepSchemeSegregatedPointer subOffset(long offset) {
		return MM_SweepSchemeSegregatedPointer.cast(address - offset);
	}

	public MM_SweepSchemeSegregatedPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_SweepSchemeSegregatedPointer untag(long mask) {
		return MM_SweepSchemeSegregatedPointer.cast(address & ~mask);
	}

	public MM_SweepSchemeSegregatedPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_SweepSchemeSegregated.SIZEOF;
	}

	// Implementation methods

	// bool _clearMarkMapAfterSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clearMarkMapAfterSweepOffset_", declaredType="bool")
	public boolean _clearMarkMapAfterSweep() throws CorruptDataException {
		return getBoolAtOffset(MM_SweepSchemeSegregated.__clearMarkMapAfterSweepOffset_);
	}

	// bool _clearMarkMapAfterSweep
	public BoolPointer _clearMarkMapAfterSweepEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SweepSchemeSegregated.__clearMarkMapAfterSweepOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_SweepSchemeSegregated.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepSchemeSegregated.__extensionsOffset_));
	}

	// bool _isFixHeapForWalk
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isFixHeapForWalkOffset_", declaredType="bool")
	public boolean _isFixHeapForWalk() throws CorruptDataException {
		return getBoolAtOffset(MM_SweepSchemeSegregated.__isFixHeapForWalkOffset_);
	}

	// bool _isFixHeapForWalk
	public BoolPointer _isFixHeapForWalkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_SweepSchemeSegregated.__isFixHeapForWalkOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_SweepSchemeSegregated.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepSchemeSegregated.__markMapOffset_));
	}

	// MM_MemoryPoolSegregated* _memoryPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memoryPoolOffset_", declaredType="MM_MemoryPoolSegregated*")
	public MM_MemoryPoolSegregatedPointer _memoryPool() throws CorruptDataException {
		return MM_MemoryPoolSegregatedPointer.cast(getPointerAtOffset(MM_SweepSchemeSegregated.__memoryPoolOffset_));
	}

	// MM_MemoryPoolSegregated* _memoryPool
	public PointerPointer _memoryPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_SweepSchemeSegregated.__memoryPoolOffset_));
	}

}
