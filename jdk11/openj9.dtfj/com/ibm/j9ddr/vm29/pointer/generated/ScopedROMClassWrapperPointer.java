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
 * Structure: ScopedROMClassWrapperPointer
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
 * The generated code will provide getters for all elements in the ScopedROMClassWrapperPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ScopedROMClassWrapper.class)
public class ScopedROMClassWrapperPointer extends StructurePointer {

	// NULL
	public static final ScopedROMClassWrapperPointer NULL = new ScopedROMClassWrapperPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ScopedROMClassWrapperPointer(long address) {
		super(address);
	}

	public static ScopedROMClassWrapperPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ScopedROMClassWrapperPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ScopedROMClassWrapperPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ScopedROMClassWrapperPointer(address);
	}

	public ScopedROMClassWrapperPointer add(long count) {
		return ScopedROMClassWrapperPointer.cast(address + (ScopedROMClassWrapper.SIZEOF * count));
	}

	public ScopedROMClassWrapperPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ScopedROMClassWrapperPointer addOffset(long offset) {
		return ScopedROMClassWrapperPointer.cast(address + offset);
	}

	public ScopedROMClassWrapperPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ScopedROMClassWrapperPointer sub(long count) {
		return ScopedROMClassWrapperPointer.cast(address - (ScopedROMClassWrapper.SIZEOF * count));
	}

	public ScopedROMClassWrapperPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ScopedROMClassWrapperPointer subOffset(long offset) {
		return ScopedROMClassWrapperPointer.cast(address - offset);
	}

	public ScopedROMClassWrapperPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ScopedROMClassWrapperPointer untag(long mask) {
		return ScopedROMClassWrapperPointer.cast(address & ~mask);
	}

	public ScopedROMClassWrapperPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ScopedROMClassWrapper.SIZEOF;
	}

	// Implementation methods

	// I16 cpeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpeIndexOffset_", declaredType="I16")
	public I16 cpeIndex() throws CorruptDataException {
		return new I16(getShortAtOffset(ScopedROMClassWrapper._cpeIndexOffset_));
	}

	// I16 cpeIndex
	public I16Pointer cpeIndexEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(ScopedROMClassWrapper._cpeIndexOffset_));
	}

	// J9ShrOffset modContextOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modContextOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer modContextOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._modContextOffsetOffset_));
	}

	// J9ShrOffset modContextOffset
	public PointerPointer modContextOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._modContextOffsetOffset_));
	}

	// J9ShrOffset partitionOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partitionOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer partitionOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._partitionOffsetOffset_));
	}

	// J9ShrOffset partitionOffset
	public PointerPointer partitionOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._partitionOffsetOffset_));
	}

	// J9ShrOffset romClassOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer romClassOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._romClassOffsetOffset_));
	}

	// J9ShrOffset romClassOffset
	public PointerPointer romClassOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._romClassOffsetOffset_));
	}

	// J9ShrOffset theCpOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_theCpOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer theCpOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._theCpOffsetOffset_));
	}

	// J9ShrOffset theCpOffset
	public PointerPointer theCpOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._theCpOffsetOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(ScopedROMClassWrapper._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ScopedROMClassWrapper._timestampOffset_));
	}

}
