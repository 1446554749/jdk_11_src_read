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
 * Structure: J9JITRedefinedClassPointer
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
 * The generated code will provide getters for all elements in the J9JITRedefinedClassPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JITRedefinedClass.class)
public class J9JITRedefinedClassPointer extends StructurePointer {

	// NULL
	public static final J9JITRedefinedClassPointer NULL = new J9JITRedefinedClassPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JITRedefinedClassPointer(long address) {
		super(address);
	}

	public static J9JITRedefinedClassPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JITRedefinedClassPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JITRedefinedClassPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JITRedefinedClassPointer(address);
	}

	public J9JITRedefinedClassPointer add(long count) {
		return J9JITRedefinedClassPointer.cast(address + (J9JITRedefinedClass.SIZEOF * count));
	}

	public J9JITRedefinedClassPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JITRedefinedClassPointer addOffset(long offset) {
		return J9JITRedefinedClassPointer.cast(address + offset);
	}

	public J9JITRedefinedClassPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JITRedefinedClassPointer sub(long count) {
		return J9JITRedefinedClassPointer.cast(address - (J9JITRedefinedClass.SIZEOF * count));
	}

	public J9JITRedefinedClassPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JITRedefinedClassPointer subOffset(long offset) {
		return J9JITRedefinedClassPointer.cast(address - offset);
	}

	public J9JITRedefinedClassPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JITRedefinedClassPointer untag(long mask) {
		return J9JITRedefinedClassPointer.cast(address & ~mask);
	}

	public J9JITRedefinedClassPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JITRedefinedClass.SIZEOF;
	}

	// Implementation methods

	// UDATA methodCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodCountOffset_", declaredType="UDATA")
	public UDATA methodCount() throws CorruptDataException {
		return getUDATAAtOffset(J9JITRedefinedClass._methodCountOffset_);
	}

	// UDATA methodCount
	public UDATAPointer methodCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JITRedefinedClass._methodCountOffset_));
	}

	// J9JITMethodEquivalence* methodList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodListOffset_", declaredType="J9JITMethodEquivalence*")
	public J9JITMethodEquivalencePointer methodList() throws CorruptDataException {
		return J9JITMethodEquivalencePointer.cast(getPointerAtOffset(J9JITRedefinedClass._methodListOffset_));
	}

	// J9JITMethodEquivalence* methodList
	public PointerPointer methodListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITRedefinedClass._methodListOffset_));
	}

	// J9Class* newClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newClassOffset_", declaredType="J9Class*")
	public J9ClassPointer newClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JITRedefinedClass._newClassOffset_));
	}

	// J9Class* newClass
	public PointerPointer newClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITRedefinedClass._newClassOffset_));
	}

	// J9Class* oldClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldClassOffset_", declaredType="J9Class*")
	public J9ClassPointer oldClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JITRedefinedClass._oldClassOffset_));
	}

	// J9Class* oldClass
	public PointerPointer oldClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JITRedefinedClass._oldClassOffset_));
	}

}
