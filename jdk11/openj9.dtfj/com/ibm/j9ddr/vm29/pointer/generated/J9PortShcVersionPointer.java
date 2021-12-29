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
 * Structure: J9PortShcVersionPointer
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
 * The generated code will provide getters for all elements in the J9PortShcVersionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PortShcVersion.class)
public class J9PortShcVersionPointer extends StructurePointer {

	// NULL
	public static final J9PortShcVersionPointer NULL = new J9PortShcVersionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PortShcVersionPointer(long address) {
		super(address);
	}

	public static J9PortShcVersionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PortShcVersionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PortShcVersionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PortShcVersionPointer(address);
	}

	public J9PortShcVersionPointer add(long count) {
		return J9PortShcVersionPointer.cast(address + (J9PortShcVersion.SIZEOF * count));
	}

	public J9PortShcVersionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PortShcVersionPointer addOffset(long offset) {
		return J9PortShcVersionPointer.cast(address + offset);
	}

	public J9PortShcVersionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PortShcVersionPointer sub(long count) {
		return J9PortShcVersionPointer.cast(address - (J9PortShcVersion.SIZEOF * count));
	}

	public J9PortShcVersionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PortShcVersionPointer subOffset(long offset) {
		return J9PortShcVersionPointer.cast(address - offset);
	}

	public J9PortShcVersionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PortShcVersionPointer untag(long mask) {
		return J9PortShcVersionPointer.cast(address & ~mask);
	}

	public J9PortShcVersionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PortShcVersion.SIZEOF;
	}

	// Implementation methods

	// U32 addrmode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_addrmodeOffset_", declaredType="U32")
	public UDATA addrmode() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._addrmodeOffset_));
	}

	// U32 addrmode
	public UDATAPointer addrmodeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._addrmodeOffset_));
	}

	// U32 cacheType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheTypeOffset_", declaredType="U32")
	public UDATA cacheType() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._cacheTypeOffset_));
	}

	// U32 cacheType
	public UDATAPointer cacheTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._cacheTypeOffset_));
	}

	// U32 esVersionMajor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_esVersionMajorOffset_", declaredType="U32")
	public UDATA esVersionMajor() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._esVersionMajorOffset_));
	}

	// U32 esVersionMajor
	public UDATAPointer esVersionMajorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._esVersionMajorOffset_));
	}

	// U32 esVersionMinor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_esVersionMinorOffset_", declaredType="U32")
	public UDATA esVersionMinor() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._esVersionMinorOffset_));
	}

	// U32 esVersionMinor
	public UDATAPointer esVersionMinorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._esVersionMinorOffset_));
	}

	// U32 feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_featureOffset_", declaredType="U32")
	public UDATA feature() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._featureOffset_));
	}

	// U32 feature
	public UDATAPointer featureEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._featureOffset_));
	}

	// U32 modlevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modlevelOffset_", declaredType="U32")
	public UDATA modlevel() throws CorruptDataException {
		return new U32(getIntAtOffset(J9PortShcVersion._modlevelOffset_));
	}

	// U32 modlevel
	public UDATAPointer modlevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9PortShcVersion._modlevelOffset_));
	}

}
