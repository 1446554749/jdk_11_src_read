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
 * Structure: UtGroupDetailsPointer
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
 * The generated code will provide getters for all elements in the UtGroupDetailsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtGroupDetails.class)
public class UtGroupDetailsPointer extends StructurePointer {

	// NULL
	public static final UtGroupDetailsPointer NULL = new UtGroupDetailsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtGroupDetailsPointer(long address) {
		super(address);
	}

	public static UtGroupDetailsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtGroupDetailsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtGroupDetailsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtGroupDetailsPointer(address);
	}

	public UtGroupDetailsPointer add(long count) {
		return UtGroupDetailsPointer.cast(address + (UtGroupDetails.SIZEOF * count));
	}

	public UtGroupDetailsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtGroupDetailsPointer addOffset(long offset) {
		return UtGroupDetailsPointer.cast(address + offset);
	}

	public UtGroupDetailsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtGroupDetailsPointer sub(long count) {
		return UtGroupDetailsPointer.cast(address - (UtGroupDetails.SIZEOF * count));
	}

	public UtGroupDetailsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtGroupDetailsPointer subOffset(long offset) {
		return UtGroupDetailsPointer.cast(address - offset);
	}

	public UtGroupDetailsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtGroupDetailsPointer untag(long mask) {
		return UtGroupDetailsPointer.cast(address & ~mask);
	}

	public UtGroupDetailsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtGroupDetails.SIZEOF;
	}

	// Implementation methods

	// I32 count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_countOffset_", declaredType="I32")
	public IDATA count() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGroupDetails._countOffset_));
	}

	// I32 count
	public IDATAPointer countEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGroupDetails._countOffset_));
	}

	// U8* groupName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_groupNameOffset_", declaredType="U8*")
	public U8Pointer groupName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGroupDetails._groupNameOffset_));
	}

	// U8* groupName
	public PointerPointer groupNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGroupDetails._groupNameOffset_));
	}

	// UtGroupDetails* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtGroupDetails*")
	public UtGroupDetailsPointer next() throws CorruptDataException {
		return UtGroupDetailsPointer.cast(getPointerAtOffset(UtGroupDetails._nextOffset_));
	}

	// UtGroupDetails* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGroupDetails._nextOffset_));
	}

	// I32* tpids
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tpidsOffset_", declaredType="I32*")
	public IDATAPointer tpids() throws CorruptDataException {
		return I32Pointer.cast(getPointerAtOffset(UtGroupDetails._tpidsOffset_));
	}

	// I32* tpids
	public PointerPointer tpidsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGroupDetails._tpidsOffset_));
	}

}
