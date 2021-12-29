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
 * Structure: MM_MarkingDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_MarkingDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MarkingDelegate.class)
public class MM_MarkingDelegatePointer extends StructurePointer {

	// NULL
	public static final MM_MarkingDelegatePointer NULL = new MM_MarkingDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MarkingDelegatePointer(long address) {
		super(address);
	}

	public static MM_MarkingDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MarkingDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MarkingDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MarkingDelegatePointer(address);
	}

	public MM_MarkingDelegatePointer add(long count) {
		return MM_MarkingDelegatePointer.cast(address + (MM_MarkingDelegate.SIZEOF * count));
	}

	public MM_MarkingDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MarkingDelegatePointer addOffset(long offset) {
		return MM_MarkingDelegatePointer.cast(address + offset);
	}

	public MM_MarkingDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MarkingDelegatePointer sub(long count) {
		return MM_MarkingDelegatePointer.cast(address - (MM_MarkingDelegate.SIZEOF * count));
	}

	public MM_MarkingDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MarkingDelegatePointer subOffset(long offset) {
		return MM_MarkingDelegatePointer.cast(address - offset);
	}

	public MM_MarkingDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MarkingDelegatePointer untag(long mask) {
		return MM_MarkingDelegatePointer.cast(address & ~mask);
	}

	public MM_MarkingDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MarkingDelegate.SIZEOF;
	}

	// Implementation methods

	// volatile bool _anotherClassMarkLoopIteration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anotherClassMarkLoopIterationOffset_", declaredType="volatile bool")
	public boolean _anotherClassMarkLoopIteration() throws CorruptDataException {
		return getBoolAtOffset(MM_MarkingDelegate.__anotherClassMarkLoopIterationOffset_);
	}

	// volatile bool _anotherClassMarkLoopIteration
	public BoolPointer _anotherClassMarkLoopIterationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__anotherClassMarkLoopIterationOffset_));
	}

	// volatile bool _anotherClassMarkPass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__anotherClassMarkPassOffset_", declaredType="volatile bool")
	public boolean _anotherClassMarkPass() throws CorruptDataException {
		return getBoolAtOffset(MM_MarkingDelegate.__anotherClassMarkPassOffset_);
	}

	// volatile bool _anotherClassMarkPass
	public BoolPointer _anotherClassMarkPassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__anotherClassMarkPassOffset_));
	}

	// bool _collectStringConstantsEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectStringConstantsEnabledOffset_", declaredType="bool")
	public boolean _collectStringConstantsEnabled() throws CorruptDataException {
		return getBoolAtOffset(MM_MarkingDelegate.__collectStringConstantsEnabledOffset_);
	}

	// bool _collectStringConstantsEnabled
	public BoolPointer _collectStringConstantsEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__collectStringConstantsEnabledOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_MarkingDelegate.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__extensionsOffset_));
	}

	// MM_MarkMap* _markMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markMapOffset_", declaredType="MM_MarkMap*")
	public MM_MarkMapPointer _markMap() throws CorruptDataException {
		return MM_MarkMapPointer.cast(getPointerAtOffset(MM_MarkingDelegate.__markMapOffset_));
	}

	// MM_MarkMap* _markMap
	public PointerPointer _markMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__markMapOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_MarkingDelegate.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__markingSchemeOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_MarkingDelegate.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__omrVMOffset_));
	}

	// bool _shouldScanOwnableSynchronizerObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScanOwnableSynchronizerObjectsOffset_", declaredType="bool")
	public boolean _shouldScanOwnableSynchronizerObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_MarkingDelegate.__shouldScanOwnableSynchronizerObjectsOffset_);
	}

	// bool _shouldScanOwnableSynchronizerObjects
	public BoolPointer _shouldScanOwnableSynchronizerObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__shouldScanOwnableSynchronizerObjectsOffset_));
	}

	// bool _shouldScanUnfinalizedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScanUnfinalizedObjectsOffset_", declaredType="bool")
	public boolean _shouldScanUnfinalizedObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_MarkingDelegate.__shouldScanUnfinalizedObjectsOffset_);
	}

	// bool _shouldScanUnfinalizedObjects
	public BoolPointer _shouldScanUnfinalizedObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MarkingDelegate.__shouldScanUnfinalizedObjectsOffset_));
	}

}
