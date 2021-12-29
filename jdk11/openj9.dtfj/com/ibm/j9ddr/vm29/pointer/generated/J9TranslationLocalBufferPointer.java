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
 * Structure: J9TranslationLocalBufferPointer
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
 * The generated code will provide getters for all elements in the J9TranslationLocalBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9TranslationLocalBuffer.class)
public class J9TranslationLocalBufferPointer extends StructurePointer {

	// NULL
	public static final J9TranslationLocalBufferPointer NULL = new J9TranslationLocalBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9TranslationLocalBufferPointer(long address) {
		super(address);
	}

	public static J9TranslationLocalBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9TranslationLocalBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9TranslationLocalBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9TranslationLocalBufferPointer(address);
	}

	public J9TranslationLocalBufferPointer add(long count) {
		return J9TranslationLocalBufferPointer.cast(address + (J9TranslationLocalBuffer.SIZEOF * count));
	}

	public J9TranslationLocalBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9TranslationLocalBufferPointer addOffset(long offset) {
		return J9TranslationLocalBufferPointer.cast(address + offset);
	}

	public J9TranslationLocalBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9TranslationLocalBufferPointer sub(long count) {
		return J9TranslationLocalBufferPointer.cast(address - (J9TranslationLocalBuffer.SIZEOF * count));
	}

	public J9TranslationLocalBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9TranslationLocalBufferPointer subOffset(long offset) {
		return J9TranslationLocalBufferPointer.cast(address - offset);
	}

	public J9TranslationLocalBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9TranslationLocalBufferPointer untag(long mask) {
		return J9TranslationLocalBufferPointer.cast(address & ~mask);
	}

	public J9TranslationLocalBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9TranslationLocalBuffer.SIZEOF;
	}

	// Implementation methods

	// J9ClassPathEntry* cpEntryUsed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpEntryUsedOffset_", declaredType="J9ClassPathEntry*")
	public J9ClassPathEntryPointer cpEntryUsed() throws CorruptDataException {
		return J9ClassPathEntryPointer.cast(getPointerAtOffset(J9TranslationLocalBuffer._cpEntryUsedOffset_));
	}

	// J9ClassPathEntry* cpEntryUsed
	public PointerPointer cpEntryUsedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationLocalBuffer._cpEntryUsedOffset_));
	}

	// IDATA entryIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryIndexOffset_", declaredType="IDATA")
	public IDATA entryIndex() throws CorruptDataException {
		return getIDATAAtOffset(J9TranslationLocalBuffer._entryIndexOffset_);
	}

	// IDATA entryIndex
	public IDATAPointer entryIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9TranslationLocalBuffer._entryIndexOffset_));
	}

	// I32 loadLocationType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loadLocationTypeOffset_", declaredType="I32")
	public IDATA loadLocationType() throws CorruptDataException {
		return new I32(getIntAtOffset(J9TranslationLocalBuffer._loadLocationTypeOffset_));
	}

	// I32 loadLocationType
	public IDATAPointer loadLocationTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9TranslationLocalBuffer._loadLocationTypeOffset_));
	}

	// J9ClassPatchMap* patchMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_patchMapOffset_", declaredType="J9ClassPatchMap*")
	public J9ClassPatchMapPointer patchMap() throws CorruptDataException {
		return J9ClassPatchMapPointer.cast(getPointerAtOffset(J9TranslationLocalBuffer._patchMapOffset_));
	}

	// J9ClassPatchMap* patchMap
	public PointerPointer patchMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9TranslationLocalBuffer._patchMapOffset_));
	}

}
