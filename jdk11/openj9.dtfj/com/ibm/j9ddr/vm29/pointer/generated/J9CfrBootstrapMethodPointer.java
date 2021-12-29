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
 * Structure: J9CfrBootstrapMethodPointer
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
 * The generated code will provide getters for all elements in the J9CfrBootstrapMethodPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrBootstrapMethod.class)
public class J9CfrBootstrapMethodPointer extends StructurePointer {

	// NULL
	public static final J9CfrBootstrapMethodPointer NULL = new J9CfrBootstrapMethodPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrBootstrapMethodPointer(long address) {
		super(address);
	}

	public static J9CfrBootstrapMethodPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrBootstrapMethodPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrBootstrapMethodPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrBootstrapMethodPointer(address);
	}

	public J9CfrBootstrapMethodPointer add(long count) {
		return J9CfrBootstrapMethodPointer.cast(address + (J9CfrBootstrapMethod.SIZEOF * count));
	}

	public J9CfrBootstrapMethodPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrBootstrapMethodPointer addOffset(long offset) {
		return J9CfrBootstrapMethodPointer.cast(address + offset);
	}

	public J9CfrBootstrapMethodPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrBootstrapMethodPointer sub(long count) {
		return J9CfrBootstrapMethodPointer.cast(address - (J9CfrBootstrapMethod.SIZEOF * count));
	}

	public J9CfrBootstrapMethodPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrBootstrapMethodPointer subOffset(long offset) {
		return J9CfrBootstrapMethodPointer.cast(address - offset);
	}

	public J9CfrBootstrapMethodPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrBootstrapMethodPointer untag(long mask) {
		return J9CfrBootstrapMethodPointer.cast(address & ~mask);
	}

	public J9CfrBootstrapMethodPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrBootstrapMethod.SIZEOF;
	}

	// Implementation methods

	// U16* bootstrapArguments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bootstrapArgumentsOffset_", declaredType="U16*")
	public U16Pointer bootstrapArguments() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(J9CfrBootstrapMethod._bootstrapArgumentsOffset_));
	}

	// U16* bootstrapArguments
	public PointerPointer bootstrapArgumentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrBootstrapMethod._bootstrapArgumentsOffset_));
	}

	// U16 bootstrapMethodIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bootstrapMethodIndexOffset_", declaredType="U16")
	public U16 bootstrapMethodIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrBootstrapMethod._bootstrapMethodIndexOffset_));
	}

	// U16 bootstrapMethodIndex
	public U16Pointer bootstrapMethodIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrBootstrapMethod._bootstrapMethodIndexOffset_));
	}

	// U16 numberOfBootstrapArguments
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_numberOfBootstrapArgumentsOffset_", declaredType="U16")
	public U16 numberOfBootstrapArguments() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrBootstrapMethod._numberOfBootstrapArgumentsOffset_));
	}

	// U16 numberOfBootstrapArguments
	public U16Pointer numberOfBootstrapArgumentsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrBootstrapMethod._numberOfBootstrapArgumentsOffset_));
	}

}
