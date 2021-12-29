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
 * Structure: MM_GlobalCollectorDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_GlobalCollectorDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_GlobalCollectorDelegate.class)
public class MM_GlobalCollectorDelegatePointer extends StructurePointer {

	// NULL
	public static final MM_GlobalCollectorDelegatePointer NULL = new MM_GlobalCollectorDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_GlobalCollectorDelegatePointer(long address) {
		super(address);
	}

	public static MM_GlobalCollectorDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_GlobalCollectorDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_GlobalCollectorDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_GlobalCollectorDelegatePointer(address);
	}

	public MM_GlobalCollectorDelegatePointer add(long count) {
		return MM_GlobalCollectorDelegatePointer.cast(address + (MM_GlobalCollectorDelegate.SIZEOF * count));
	}

	public MM_GlobalCollectorDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_GlobalCollectorDelegatePointer addOffset(long offset) {
		return MM_GlobalCollectorDelegatePointer.cast(address + offset);
	}

	public MM_GlobalCollectorDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_GlobalCollectorDelegatePointer sub(long count) {
		return MM_GlobalCollectorDelegatePointer.cast(address - (MM_GlobalCollectorDelegate.SIZEOF * count));
	}

	public MM_GlobalCollectorDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_GlobalCollectorDelegatePointer subOffset(long offset) {
		return MM_GlobalCollectorDelegatePointer.cast(address - offset);
	}

	public MM_GlobalCollectorDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_GlobalCollectorDelegatePointer untag(long mask) {
		return MM_GlobalCollectorDelegatePointer.cast(address & ~mask);
	}

	public MM_GlobalCollectorDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_GlobalCollectorDelegate.SIZEOF;
	}

	// Implementation methods

	// U64 _criticalSectionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__criticalSectionCountOffset_", declaredType="U64")
	public UDATA _criticalSectionCount() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_GlobalCollectorDelegate.__criticalSectionCountOffset_));
	}

	// U64 _criticalSectionCount
	public UDATAPointer _criticalSectionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__criticalSectionCountOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_GlobalCollectorDelegate.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__extensionsOffset_));
	}

	// bool _finalizationRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizationRequiredOffset_", declaredType="bool")
	public boolean _finalizationRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_GlobalCollectorDelegate.__finalizationRequiredOffset_);
	}

	// bool _finalizationRequired
	public BoolPointer _finalizationRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__finalizationRequiredOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalCollectorOffset_", declaredType="MM_GlobalCollector*")
	public MM_GlobalCollectorPointer _globalCollector() throws CorruptDataException {
		return MM_GlobalCollectorPointer.cast(getPointerAtOffset(MM_GlobalCollectorDelegate.__globalCollectorOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	public PointerPointer _globalCollectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__globalCollectorOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_GlobalCollectorDelegate.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__javaVMOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_MarkingScheme*")
	public MM_MarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_MarkingSchemePointer.cast(getPointerAtOffset(MM_GlobalCollectorDelegate.__markingSchemeOffset_));
	}

	// MM_MarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_GlobalCollectorDelegate.__markingSchemeOffset_));
	}

}
