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
 * Structure: jvmtiLocalVariableEntryPointer
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
 * The generated code will provide getters for all elements in the jvmtiLocalVariableEntryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiLocalVariableEntry.class)
public class jvmtiLocalVariableEntryPointer extends StructurePointer {

	// NULL
	public static final jvmtiLocalVariableEntryPointer NULL = new jvmtiLocalVariableEntryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiLocalVariableEntryPointer(long address) {
		super(address);
	}

	public static jvmtiLocalVariableEntryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiLocalVariableEntryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiLocalVariableEntryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiLocalVariableEntryPointer(address);
	}

	public jvmtiLocalVariableEntryPointer add(long count) {
		return jvmtiLocalVariableEntryPointer.cast(address + (jvmtiLocalVariableEntry.SIZEOF * count));
	}

	public jvmtiLocalVariableEntryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiLocalVariableEntryPointer addOffset(long offset) {
		return jvmtiLocalVariableEntryPointer.cast(address + offset);
	}

	public jvmtiLocalVariableEntryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiLocalVariableEntryPointer sub(long count) {
		return jvmtiLocalVariableEntryPointer.cast(address - (jvmtiLocalVariableEntry.SIZEOF * count));
	}

	public jvmtiLocalVariableEntryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiLocalVariableEntryPointer subOffset(long offset) {
		return jvmtiLocalVariableEntryPointer.cast(address - offset);
	}

	public jvmtiLocalVariableEntryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiLocalVariableEntryPointer untag(long mask) {
		return jvmtiLocalVariableEntryPointer.cast(address & ~mask);
	}

	public jvmtiLocalVariableEntryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiLocalVariableEntry.SIZEOF;
	}

	// Implementation methods

	// U8* generic_signature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_generic_signatureOffset_", declaredType="U8*")
	public U8Pointer generic_signature() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiLocalVariableEntry._generic_signatureOffset_));
	}

	// U8* generic_signature
	public PointerPointer generic_signatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._generic_signatureOffset_));
	}

	// jint length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="jint")
	public IDATA length() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiLocalVariableEntry._lengthOffset_));
	}

	// jint length
	public IDATAPointer lengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._lengthOffset_));
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiLocalVariableEntry._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._nameOffset_));
	}

	// U8* signature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_signatureOffset_", declaredType="U8*")
	public U8Pointer signature() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiLocalVariableEntry._signatureOffset_));
	}

	// U8* signature
	public PointerPointer signatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._signatureOffset_));
	}

	// jint slot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_slotOffset_", declaredType="jint")
	public IDATA slot() throws CorruptDataException {
		return new I32(getIntAtOffset(jvmtiLocalVariableEntry._slotOffset_));
	}

	// jint slot
	public IDATAPointer slotEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._slotOffset_));
	}

	// jlocation start_location
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_start_locationOffset_", declaredType="jlocation")
	public IDATA start_location() throws CorruptDataException {
		return new I64(getLongAtOffset(jvmtiLocalVariableEntry._start_locationOffset_));
	}

	// jlocation start_location
	public IDATAPointer start_locationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(jvmtiLocalVariableEntry._start_locationOffset_));
	}

}
