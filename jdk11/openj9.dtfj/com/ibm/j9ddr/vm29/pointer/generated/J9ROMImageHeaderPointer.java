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
 * Structure: J9ROMImageHeaderPointer
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
 * The generated code will provide getters for all elements in the J9ROMImageHeaderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMImageHeader.class)
public class J9ROMImageHeaderPointer extends StructurePointer {

	// NULL
	public static final J9ROMImageHeaderPointer NULL = new J9ROMImageHeaderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMImageHeaderPointer(long address) {
		super(address);
	}

	public static J9ROMImageHeaderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMImageHeaderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMImageHeaderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMImageHeaderPointer(address);
	}

	public J9ROMImageHeaderPointer add(long count) {
		return J9ROMImageHeaderPointer.cast(address + (J9ROMImageHeader.SIZEOF * count));
	}

	public J9ROMImageHeaderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMImageHeaderPointer addOffset(long offset) {
		return J9ROMImageHeaderPointer.cast(address + offset);
	}

	public J9ROMImageHeaderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMImageHeaderPointer sub(long count) {
		return J9ROMImageHeaderPointer.cast(address - (J9ROMImageHeader.SIZEOF * count));
	}

	public J9ROMImageHeaderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMImageHeaderPointer subOffset(long offset) {
		return J9ROMImageHeaderPointer.cast(address - offset);
	}

	public J9ROMImageHeaderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMImageHeaderPointer untag(long mask) {
		return J9ROMImageHeaderPointer.cast(address & ~mask);
	}

	public J9ROMImageHeaderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMImageHeader.SIZEOF;
	}

	// Implementation methods

	// J9SRP aotPointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_aotPointerOffset_", declaredType="J9SRP")
	public VoidPointer aotPointer() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMImageHeader._aotPointerOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ROMImageHeader._aotPointerOffset_ + nextAddress));
	}

	// J9SRP aotPointer
	public SelfRelativePointer aotPointerEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMImageHeader._aotPointerOffset_));
	}

	// U32 classCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classCountOffset_", declaredType="U32")
	public UDATA classCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMImageHeader._classCountOffset_));
	}

	// U32 classCount
	public UDATAPointer classCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMImageHeader._classCountOffset_));
	}

	// J9SRP(J9ROMClass) firstClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstClassOffset_", declaredType="J9SRP(J9ROMClass)")
	public J9ROMClassPointer firstClass() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMImageHeader._firstClassOffset_);
		if (nextAddress == 0) {
			return J9ROMClassPointer.NULL;
		}
		return J9ROMClassPointer.cast(address + (J9ROMImageHeader._firstClassOffset_ + nextAddress));
	}

	// J9SRP(J9ROMClass) firstClass
	public SelfRelativePointer firstClassEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMImageHeader._firstClassOffset_));
	}

	// U32 flagsAndVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsAndVersionOffset_", declaredType="U32")
	public UDATA flagsAndVersion() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMImageHeader._flagsAndVersionOffset_));
	}

	// U32 flagsAndVersion
	public UDATAPointer flagsAndVersionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMImageHeader._flagsAndVersionOffset_));
	}

	// U32 idTag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idTagOffset_", declaredType="U32")
	public UDATA idTag() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMImageHeader._idTagOffset_));
	}

	// U32 idTag
	public UDATAPointer idTagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMImageHeader._idTagOffset_));
	}

	// J9SRP(UDATA) jxePointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jxePointerOffset_", declaredType="J9SRP(UDATA)")
	public UDATAPointer jxePointer() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMImageHeader._jxePointerOffset_);
		if (nextAddress == 0) {
			return UDATAPointer.NULL;
		}
		return UDATAPointer.cast(address + (J9ROMImageHeader._jxePointerOffset_ + nextAddress));
	}

	// J9SRP(UDATA) jxePointer
	public SelfRelativePointer jxePointerEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMImageHeader._jxePointerOffset_));
	}

	// U32 romSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romSizeOffset_", declaredType="U32")
	public UDATA romSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMImageHeader._romSizeOffset_));
	}

	// U32 romSize
	public UDATAPointer romSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMImageHeader._romSizeOffset_));
	}

	// U8[] symbolFileID
	public U8Pointer symbolFileIDEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ROMImageHeader._symbolFileIDOffset_));
	}

	// J9SRP(J9ROMClassTOCEntry) tableOfContents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableOfContentsOffset_", declaredType="J9SRP(J9ROMClassTOCEntry)")
	public J9ROMClassTOCEntryPointer tableOfContents() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMImageHeader._tableOfContentsOffset_);
		if (nextAddress == 0) {
			return J9ROMClassTOCEntryPointer.NULL;
		}
		return J9ROMClassTOCEntryPointer.cast(address + (J9ROMImageHeader._tableOfContentsOffset_ + nextAddress));
	}

	// J9SRP(J9ROMClassTOCEntry) tableOfContents
	public SelfRelativePointer tableOfContentsEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMImageHeader._tableOfContentsOffset_));
	}

}
