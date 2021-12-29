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
 * Structure: ROMClassWrapperPointer
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
 * The generated code will provide getters for all elements in the ROMClassWrapperPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassWrapper.class)
public class ROMClassWrapperPointer extends StructurePointer {

	// NULL
	public static final ROMClassWrapperPointer NULL = new ROMClassWrapperPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassWrapperPointer(long address) {
		super(address);
	}

	public static ROMClassWrapperPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassWrapperPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassWrapperPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassWrapperPointer(address);
	}

	public ROMClassWrapperPointer add(long count) {
		return ROMClassWrapperPointer.cast(address + (ROMClassWrapper.SIZEOF * count));
	}

	public ROMClassWrapperPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassWrapperPointer addOffset(long offset) {
		return ROMClassWrapperPointer.cast(address + offset);
	}

	public ROMClassWrapperPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassWrapperPointer sub(long count) {
		return ROMClassWrapperPointer.cast(address - (ROMClassWrapper.SIZEOF * count));
	}

	public ROMClassWrapperPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassWrapperPointer subOffset(long offset) {
		return ROMClassWrapperPointer.cast(address - offset);
	}

	public ROMClassWrapperPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassWrapperPointer untag(long mask) {
		return ROMClassWrapperPointer.cast(address & ~mask);
	}

	public ROMClassWrapperPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassWrapper.SIZEOF;
	}

	// Implementation methods

	// I16 cpeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpeIndexOffset_", declaredType="I16")
	public I16 cpeIndex() throws CorruptDataException {
		return new I16(getShortAtOffset(ROMClassWrapper._cpeIndexOffset_));
	}

	// I16 cpeIndex
	public I16Pointer cpeIndexEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(ROMClassWrapper._cpeIndexOffset_));
	}

	// J9ShrOffset romClassOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer romClassOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ROMClassWrapper._romClassOffsetOffset_));
	}

	// J9ShrOffset romClassOffset
	public PointerPointer romClassOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWrapper._romClassOffsetOffset_));
	}

	// J9ShrOffset theCpOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_theCpOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer theCpOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ROMClassWrapper._theCpOffsetOffset_));
	}

	// J9ShrOffset theCpOffset
	public PointerPointer theCpOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWrapper._theCpOffsetOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(ROMClassWrapper._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ROMClassWrapper._timestampOffset_));
	}

}
