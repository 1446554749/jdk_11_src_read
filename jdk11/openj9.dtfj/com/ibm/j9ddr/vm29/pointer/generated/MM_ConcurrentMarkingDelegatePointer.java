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
 * Structure: MM_ConcurrentMarkingDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentMarkingDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentMarkingDelegate.class)
public class MM_ConcurrentMarkingDelegatePointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentMarkingDelegatePointer NULL = new MM_ConcurrentMarkingDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentMarkingDelegatePointer(long address) {
		super(address);
	}

	public static MM_ConcurrentMarkingDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentMarkingDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentMarkingDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentMarkingDelegatePointer(address);
	}

	public MM_ConcurrentMarkingDelegatePointer add(long count) {
		return MM_ConcurrentMarkingDelegatePointer.cast(address + (MM_ConcurrentMarkingDelegate.SIZEOF * count));
	}

	public MM_ConcurrentMarkingDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentMarkingDelegatePointer addOffset(long offset) {
		return MM_ConcurrentMarkingDelegatePointer.cast(address + offset);
	}

	public MM_ConcurrentMarkingDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentMarkingDelegatePointer sub(long count) {
		return MM_ConcurrentMarkingDelegatePointer.cast(address - (MM_ConcurrentMarkingDelegate.SIZEOF * count));
	}

	public MM_ConcurrentMarkingDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentMarkingDelegatePointer subOffset(long offset) {
		return MM_ConcurrentMarkingDelegatePointer.cast(address - offset);
	}

	public MM_ConcurrentMarkingDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentMarkingDelegatePointer untag(long mask) {
		return MM_ConcurrentMarkingDelegatePointer.cast(address & ~mask);
	}

	public MM_ConcurrentMarkingDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentMarkingDelegate.SIZEOF;
	}

	// Implementation methods

	// MM_ConcurrentGC* _collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorOffset_", declaredType="MM_ConcurrentGC*")
	public MM_ConcurrentGCPointer _collector() throws CorruptDataException {
		return MM_ConcurrentGCPointer.cast(getPointerAtOffset(MM_ConcurrentMarkingDelegate.__collectorOffset_));
	}

	// MM_ConcurrentGC* _collector
	public PointerPointer _collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__collectorOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_ConcurrentMarkingDelegate.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__javaVMOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_ConcurrentMarkingDelegate.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__markingSchemeOffset_));
	}

	// GC_ObjectModel* _objectModel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectModelOffset_", declaredType="GC_ObjectModel*")
	public GC_ObjectModelPointer _objectModel() throws CorruptDataException {
		return GC_ObjectModelPointer.cast(getPointerAtOffset(MM_ConcurrentMarkingDelegate.__objectModelOffset_));
	}

	// GC_ObjectModel* _objectModel
	public PointerPointer _objectModelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__objectModelOffset_));
	}

	// MM_ScanClassesMode _scanClassesMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanClassesModeOffset_", declaredType="MM_ScanClassesMode")
	public MM_ScanClassesModePointer _scanClassesMode() throws CorruptDataException {
		return MM_ScanClassesModePointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__scanClassesModeOffset_));
	}

	// MM_ScanClassesMode _scanClassesMode
	public PointerPointer _scanClassesModeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ConcurrentMarkingDelegate.__scanClassesModeOffset_));
	}

}
