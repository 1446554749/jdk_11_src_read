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
 * Structure: JImageHeaderPointer
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
 * The generated code will provide getters for all elements in the JImageHeaderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JImageHeader.class)
public class JImageHeaderPointer extends StructurePointer {

	// NULL
	public static final JImageHeaderPointer NULL = new JImageHeaderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JImageHeaderPointer(long address) {
		super(address);
	}

	public static JImageHeaderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JImageHeaderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JImageHeaderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JImageHeaderPointer(address);
	}

	public JImageHeaderPointer add(long count) {
		return JImageHeaderPointer.cast(address + (JImageHeader.SIZEOF * count));
	}

	public JImageHeaderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public JImageHeaderPointer addOffset(long offset) {
		return JImageHeaderPointer.cast(address + offset);
	}

	public JImageHeaderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JImageHeaderPointer sub(long count) {
		return JImageHeaderPointer.cast(address - (JImageHeader.SIZEOF * count));
	}

	public JImageHeaderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JImageHeaderPointer subOffset(long offset) {
		return JImageHeaderPointer.cast(address - offset);
	}

	public JImageHeaderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JImageHeaderPointer untag(long mask) {
		return JImageHeaderPointer.cast(address & ~mask);
	}

	public JImageHeaderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JImageHeader.SIZEOF;
	}

	// Implementation methods

	// U32 flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="U32")
	public UDATA flags() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._flagsOffset_));
	}

	// U32 flags
	public UDATAPointer flagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._flagsOffset_));
	}

	// U32 locationsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_locationsSizeOffset_", declaredType="U32")
	public UDATA locationsSize() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._locationsSizeOffset_));
	}

	// U32 locationsSize
	public UDATAPointer locationsSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._locationsSizeOffset_));
	}

	// U32 magic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_magicOffset_", declaredType="U32")
	public UDATA magic() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._magicOffset_));
	}

	// U32 magic
	public UDATAPointer magicEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._magicOffset_));
	}

	// U16 majorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_majorVersionOffset_", declaredType="U16")
	public U16 majorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(JImageHeader._majorVersionOffset_));
	}

	// U16 majorVersion
	public U16Pointer majorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(JImageHeader._majorVersionOffset_));
	}

	// U16 minorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minorVersionOffset_", declaredType="U16")
	public U16 minorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(JImageHeader._minorVersionOffset_));
	}

	// U16 minorVersion
	public U16Pointer minorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(JImageHeader._minorVersionOffset_));
	}

	// U32 resourceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resourceCountOffset_", declaredType="U32")
	public UDATA resourceCount() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._resourceCountOffset_));
	}

	// U32 resourceCount
	public UDATAPointer resourceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._resourceCountOffset_));
	}

	// U32 stringsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stringsSizeOffset_", declaredType="U32")
	public UDATA stringsSize() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._stringsSizeOffset_));
	}

	// U32 stringsSize
	public UDATAPointer stringsSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._stringsSizeOffset_));
	}

	// U32 tableLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tableLengthOffset_", declaredType="U32")
	public UDATA tableLength() throws CorruptDataException {
		return new U32(getIntAtOffset(JImageHeader._tableLengthOffset_));
	}

	// U32 tableLength
	public UDATAPointer tableLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(JImageHeader._tableLengthOffset_));
	}

}
