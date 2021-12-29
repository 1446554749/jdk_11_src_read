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
 * Structure: J9JVMTIClassPairPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIClassPairPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIClassPair.class)
public class J9JVMTIClassPairPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIClassPairPointer NULL = new J9JVMTIClassPairPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIClassPairPointer(long address) {
		super(address);
	}

	public static J9JVMTIClassPairPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIClassPairPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIClassPairPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIClassPairPointer(address);
	}

	public J9JVMTIClassPairPointer add(long count) {
		return J9JVMTIClassPairPointer.cast(address + (J9JVMTIClassPair.SIZEOF * count));
	}

	public J9JVMTIClassPairPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIClassPairPointer addOffset(long offset) {
		return J9JVMTIClassPairPointer.cast(address + offset);
	}

	public J9JVMTIClassPairPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIClassPairPointer sub(long count) {
		return J9JVMTIClassPairPointer.cast(address - (J9JVMTIClassPair.SIZEOF * count));
	}

	public J9JVMTIClassPairPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIClassPairPointer subOffset(long offset) {
		return J9JVMTIClassPairPointer.cast(address - offset);
	}

	public J9JVMTIClassPairPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIClassPairPointer untag(long mask) {
		return J9JVMTIClassPairPointer.cast(address & ~mask);
	}

	public J9JVMTIClassPairPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIClassPair.SIZEOF;
	}

	// Implementation methods

	// UDATA flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="UDATA")
	public UDATA flags() throws CorruptDataException {
		return getUDATAAtOffset(J9JVMTIClassPair._flagsOffset_);
	}

	// UDATA flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JVMTIClassPair._flagsOffset_));
	}

	// void** methodRemap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodRemapOffset_", declaredType="void**")
	public PointerPointer methodRemap() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9JVMTIClassPair._methodRemapOffset_));
	}

	// void** methodRemap
	public PointerPointer methodRemapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIClassPair._methodRemapOffset_));
	}

	// U32* methodRemapIndices
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodRemapIndicesOffset_", declaredType="U32*")
	public UDATAPointer methodRemapIndices() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(J9JVMTIClassPair._methodRemapIndicesOffset_));
	}

	// U32* methodRemapIndices
	public PointerPointer methodRemapIndicesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIClassPair._methodRemapIndicesOffset_));
	}

	// J9Class* originalRAMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_originalRAMClassOffset_", declaredType="J9Class*")
	public J9ClassPointer originalRAMClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JVMTIClassPair._originalRAMClassOffset_));
	}

	// J9Class* originalRAMClass
	public PointerPointer originalRAMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIClassPair._originalRAMClassOffset_));
	}

	// J9Class* replacementClass.ramClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_replacementClass$ramClassOffset_", declaredType="J9Class*")
	public J9ClassPointer replacementClass$ramClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JVMTIClassPair._replacementClass$ramClassOffset_));
	}

	// J9Class* replacementClass.ramClass
	public PointerPointer replacementClass$ramClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIClassPair._replacementClass$ramClassOffset_));
	}

	// J9ROMClass* replacementClass.romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_replacementClass$romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer replacementClass$romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9JVMTIClassPair._replacementClass$romClassOffset_));
	}

	// J9ROMClass* replacementClass.romClass
	public PointerPointer replacementClass$romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIClassPair._replacementClass$romClassOffset_));
	}

}
